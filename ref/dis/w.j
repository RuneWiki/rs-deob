.version 45 3
.class public super w
.super u

.method public a : (Z)Leb;
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L14 using L14
L0:     iload_1
L1:     ifne L12
L4:     new java/lang/NullPointerException
L7:     dup
L8:     invokespecial Method java/lang/NullPointerException <init> ()V
L11:    athrow
L12:    aconst_null
L13:    areturn
L14:    astore_2
L15:    new java/lang/StringBuffer
L18:    dup
L19:    ldc "84732, "
L21:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L24:    iload_1
L25:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L28:    ldc ", "
L30:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L33:    aload_2
L34:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L37:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L40:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L43:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L46:    new java/lang/RuntimeException
L49:    dup
L50:    invokespecial Method java/lang/RuntimeException <init> ()V
L53:    athrow
L54:    
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method u <init> ()V
L4:     return
L5:     
    .end code
.end method
.end class
