.version 45 3
.class public super XHHRODPC
.super PPOHBEGB
.field private i I
.field j [LRJXWGZGD;
.field public k I
.field public static l Z

.method public a : (IIIIIIIII)V
    .code stack 10 locals 11
L0:     aload_0
L1:     sipush 4016
L4:     invokevirtual Method XHHRODPC a (I)LZKARKDQW;
L7:     astore 10
L9:     aload 10
L11:    ifnull L43
L14:    aload_0
L15:    aload 10
L17:    getfield Field XHHRODPC k I
L20:    putfield Field XHHRODPC k I
L23:    aload 10
L25:    iload_1
L26:    iload_2
L27:    iload_3
L28:    iload 4
L30:    iload 5
L32:    iload 6
L34:    iload 7
L36:    iload 8
L38:    iload 9
L40:    invokevirtual Method ZKARKDQW a (IIIIIIIII)V
L43:    return
L44:    
    .end code
.end method

.method public a : (I)LZKARKDQW;
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L16 using L16
L0:     iload_1
L1:     sipush 4016
L4:     if_icmpeq L14
L7:     aload_0
L8:     sipush -185
L11:    putfield Field XHHRODPC i I
L14:    aconst_null
L15:    areturn
L16:    astore_2
L17:    new java/lang/StringBuffer
L20:    dup
L21:    ldc "75653, "
L23:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L26:    iload_1
L27:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L30:    ldc ", "
L32:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L35:    aload_2
L36:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L39:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L42:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L45:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L48:    new java/lang/RuntimeException
L51:    dup
L52:    invokespecial Method java/lang/RuntimeException <init> ()V
L55:    athrow
L56:    
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method PPOHBEGB <init> ()V
L4:     aload_0
L5:     sipush 923
L8:     putfield Field XHHRODPC i I
L11:    aload_0
L12:    sipush 1000
L15:    putfield Field XHHRODPC k I
L18:    return
L19:    
    .end code
.end method
.end class
