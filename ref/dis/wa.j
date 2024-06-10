.version 45 3
.class super wa
.super g
.field static h Laa;

.method public static b : (I)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L7 using L15
L0:     iload_0
L1:     sipush -9248
L4:     if_icmpeq L8
L7:     return
        .catch java/lang/RuntimeException from L8 to L12 using L15
L8:     aconst_null
L9:     putstatic Field wa h Laa;
L12:    goto L45
L15:    astore_1
L16:    aload_1
L17:    new java/lang/StringBuffer
L20:    dup
L21:    invokespecial Method java/lang/StringBuffer <init> ()V
L24:    ldc "wa.Q("
L26:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L29:    iload_0
L30:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L33:    bipush 41
L35:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L38:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L41:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L44:    athrow
L45:    return
L46:    
        .linenumbertable
            L0 30
            L7 31
            L8 33
            L12 36
            L15 34
            L16 35
            L45 37
        .end linenumbertable
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method g <init> ()V
L4:     return
L5:     
        .linenumbertable
            L0 45
            L4 46
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 0 locals 0
L0:     return
L1:     
        .linenumbertable
            L0 25
        .end linenumbertable
    .end code
.end method
.sourcefile "wa.java"
.end class
