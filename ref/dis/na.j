.version 48 0
.class final super na
.super ua
.field private e Ljava/nio/ByteBuffer;

.method final a : (I)[B
    .code stack 2 locals 3
        .catch java/lang/RuntimeException from L0 to L43 using L44
L0:     iload_1
L1:     bipush 50
L3:     if_icmpeq L14
L6:     aload_0
L7:     aconst_null
L8:     checkcast java/nio/ByteBuffer
L11:    putfield Field na e Ljava/nio/ByteBuffer;
L14:    aload_0
L15:    getfield Field na e Ljava/nio/ByteBuffer;
L18:    invokevirtual Method java/nio/ByteBuffer capacity ()I
L21:    newarray byte
L23:    astore_2
L24:    aload_0
L25:    getfield Field na e Ljava/nio/ByteBuffer;
L28:    iconst_0
L29:    invokevirtual Method java/nio/ByteBuffer position (I)Ljava/nio/Buffer;
L32:    pop
L33:    aload_0
L34:    getfield Field na e Ljava/nio/ByteBuffer;
L37:    aload_2
L38:    invokevirtual Method java/nio/ByteBuffer get ([B)Ljava/nio/ByteBuffer;
L41:    pop
L42:    aload_2
L43:    areturn
L44:    astore_2
L45:    aload_2
L46:    athrow
L47:    
        .linenumbertable
            L0 6
            L6 7
            L14 10
            L24 11
            L33 12
            L42 13
            L44 14
            L45 15
        .end linenumbertable
    .end code
.end method

.method final a : ([BI)V
    .code stack 2 locals 4
        .catch java/lang/RuntimeException from L0 to L41 using L44
L0:     aload_0
L1:     aload_1
L2:     arraylength
L3:     invokestatic Method java/nio/ByteBuffer allocateDirect (I)Ljava/nio/ByteBuffer;
L6:     putfield Field na e Ljava/nio/ByteBuffer;
L9:     aload_0
L10:    getfield Field na e Ljava/nio/ByteBuffer;
L13:    iconst_0
L14:    invokevirtual Method java/nio/ByteBuffer position (I)Ljava/nio/Buffer;
L17:    pop
L18:    iload_2
L19:    sipush -14256
L22:    if_icmpeq L32
L25:    aload_0
L26:    bipush 8
L28:    invokevirtual Method na a (I)[B
L31:    pop
L32:    aload_0
L33:    getfield Field na e Ljava/nio/ByteBuffer;
L36:    aload_1
L37:    invokevirtual Method java/nio/ByteBuffer put ([B)Ljava/nio/ByteBuffer;
L40:    pop
L41:    goto L47
L44:    astore_3
L45:    aload_3
L46:    athrow
L47:    return
L48:    
        .linenumbertable
            L0 20
            L9 21
            L18 22
            L25 23
            L32 25
            L41 28
            L44 26
            L45 27
            L47 29
        .end linenumbertable
    .end code
.end method

.method <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method ua <init> ()V
L4:     return
L5:     
        .linenumbertable
            L0 31
            L4 32
        .end linenumbertable
    .end code
.end method
.sourcefile "na.java"
.end class
