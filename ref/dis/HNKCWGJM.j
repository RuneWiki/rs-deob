.version 45 3
.class final super HNKCWGJM
.super XHHRODPC
.field public m I
.field public n I

.method public final a : (I)LZKARKDQW;
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L32 using L32
L0:     aload_0
L1:     getfield Field HNKCWGJM m I
L4:     invokestatic Method DJRMEMXO b (I)LDJRMEMXO;
L7:     astore_2
L8:     iload_1
L9:     sipush 4016
L12:    if_icmpeq L23
L15:    new java/lang/NullPointerException
L18:    dup
L19:    invokespecial Method java/lang/NullPointerException <init> ()V
L22:    athrow
L23:    aload_2
L24:    aload_0
L25:    getfield Field HNKCWGJM n I
L28:    invokevirtual Method DJRMEMXO c (I)LZKARKDQW;
L31:    areturn
L32:    astore_2
L33:    new java/lang/StringBuffer
L36:    dup
L37:    ldc "2596, "
L39:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L42:    iload_1
L43:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L46:    ldc ", "
L48:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L51:    aload_2
L52:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L55:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L58:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L61:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L64:    new java/lang/RuntimeException
L67:    dup
L68:    invokespecial Method java/lang/RuntimeException <init> ()V
L71:    athrow
L72:    
    .end code
.end method

.method <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method XHHRODPC <init> ()V
L4:     return
L5:     
    .end code
.end method
.end class
