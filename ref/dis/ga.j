.version 45 3
.class super abstract ga
.super java/lang/Object
.field static a I
.field static b I
.field c Ljava/awt/Image;
.field d I
.field e I
.field static f I
.field static g Lr;
.field h [I

.method public static a : (B)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L15 using L18
L0:     aconst_null
L1:     putstatic Field ga g Lr;
L4:     iload_0
L5:     bipush -21
L7:     if_icmpeq L15
L10:    bipush 98
L12:    invokestatic Method ga a (B)V
L15:    goto L48
L18:    astore_1
L19:    aload_1
L20:    new java/lang/StringBuffer
L23:    dup
L24:    invokespecial Method java/lang/StringBuffer <init> ()V
L27:    ldc "ga.I("
L29:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L32:    iload_0
L33:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L36:    bipush 41
L38:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L41:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L44:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L47:    athrow
L48:    return
L49:    
        .linenumbertable
            L0 5
            L4 6
            L10 7
            L15 11
            L18 9
            L19 10
            L48 12
        .end linenumbertable
    .end code
.end method

.method final a : (I)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L26 using L29
L0:     bipush -93
L2:     iload_1
L3:     bipush 14
L5:     isub
L6:     bipush 62
L8:     idiv
L9:     irem
L10:    istore_2
L11:    aload_0
L12:    getfield Field ga h [I
L15:    aload_0
L16:    getfield Field ga d I
L19:    aload_0
L20:    getfield Field ga e I
L23:    invokestatic Method ia a ([III)V
L26:    goto L59
L29:    astore_2
L30:    aload_2
L31:    new java/lang/StringBuffer
L34:    dup
L35:    invokespecial Method java/lang/StringBuffer <init> ()V
L38:    ldc "ga.H("
L40:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L43:    iload_1
L44:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L47:    bipush 41
L49:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L52:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L55:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L58:    athrow
L59:    return
L60:    
        .linenumbertable
            L0 21
            L11 22
            L26 25
            L29 23
            L30 24
            L59 26
        .end linenumbertable
    .end code
.end method

.method abstract a : (IILjava/awt/Graphics;I)V
.end method

.method abstract a : (ILjava/awt/Component;BI)V
.end method

.method protected <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     return
L5:     
        .linenumbertable
            L0 67
            L4 68
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_0
L1:     putstatic Field ga f I
L4:     iconst_0
L5:     putstatic Field ga b I
L8:     iconst_0
L9:     putstatic Field ga a I
L12:    return
L13:    
        .linenumbertable
            L0 49
            L4 55
            L8 58
            L12 59
        .end linenumbertable
    .end code
.end method
.sourcefile "ga.java"
.end class
