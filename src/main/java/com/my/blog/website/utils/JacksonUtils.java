package com.my.blog.website.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * json转换工具 Created by Administrator on 2017/3/13 013.
 * @author Hlingoes 2018-3-18 22:30:08
 */
public class JacksonUtils
{

	private static final ObjectMapper mapper = new ObjectMapper();

	public static String toJsonString(Object object) throws JsonProcessingException {
		return object == null ? null : mapper.writeValueAsString(object);
	}
}
