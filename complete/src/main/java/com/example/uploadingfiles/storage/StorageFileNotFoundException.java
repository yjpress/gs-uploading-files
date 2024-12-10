package com.example.uploadingfiles.storage;

public class StorageFileNotFoundException extends StorageException {

	public StorageFileNotFoundException(String message) {
		super(message);//super 입니다
	}

	public StorageFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
