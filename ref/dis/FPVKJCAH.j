.version 45 3
.class public final super FPVKJCAH
.super java/awt/Frame
.field private a Z
.field b LKHACHIFW;

.method public <init> : (LKHACHIFW;IBI)V
    .code stack 4 locals 6
L0:     aload_0
L1:     invokespecial Method java/awt/Frame <init> ()V
L4:     aload_0
L5:     iconst_1
L6:     putfield Field FPVKJCAH a Z
        .catch java/lang/RuntimeException from L9 to L67 using L68
L9:     aload_0
L10:    aload_1
L11:    putfield Field FPVKJCAH b LKHACHIFW;
L14:    aload_0
L15:    ldc "Jagex"
L17:    invokevirtual Method java/awt/Frame setTitle (Ljava/lang/String;)V
L20:    aload_0
L21:    iconst_0
L22:    invokevirtual Method java/awt/Frame setResizable (Z)V
L25:    aload_0
L26:    invokevirtual Method java/awt/Window show ()V
L29:    iload_3
L30:    iconst_5
L31:    if_icmpeq L50
L34:    aload_0
L35:    aload_0
L36:    getfield Field FPVKJCAH a Z
L39:    ifeq L46
L42:    iconst_0
L43:    goto L47
L46:    iconst_1
L47:    putfield Field FPVKJCAH a Z
L50:    aload_0
L51:    invokevirtual Method java/awt/Window toFront ()V
L54:    aload_0
L55:    iload_2
L56:    bipush 8
L58:    iadd
L59:    iload 4
L61:    bipush 28
L63:    iadd
L64:    invokevirtual Method java/awt/Component resize (II)V
L67:    return
L68:    astore 5
L70:    new java/lang/StringBuffer
L73:    dup
L74:    ldc "41013, "
L76:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L79:    aload_1
L80:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L83:    ldc ", "
L85:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L88:    iload_2
L89:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L92:    ldc ", "
L94:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L97:    iload_3
L98:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L101:   ldc ", "
L103:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L106:   iload 4
L108:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L111:   ldc ", "
L113:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L116:   aload 5
L118:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L121:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L124:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L127:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L130:   new java/lang/RuntimeException
L133:   dup
L134:   invokespecial Method java/lang/RuntimeException <init> ()V
L137:   athrow
L138:   
    .end code
.end method

.method public getGraphics : ()Ljava/awt/Graphics;
    .code stack 3 locals 2
L0:     aload_0
L1:     invokespecial Method java/awt/Component getGraphics ()Ljava/awt/Graphics;
L4:     astore_1
L5:     aload_1
L6:     iconst_4
L7:     bipush 24
L9:     invokevirtual Method java/awt/Graphics translate (II)V
L12:    aload_1
L13:    areturn
L14:    
    .end code
.end method

.method public final update : (Ljava/awt/Graphics;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field FPVKJCAH b LKHACHIFW;
L4:     aload_1
L5:     invokevirtual Method KHACHIFW update (Ljava/awt/Graphics;)V
L8:     return
L9:     
    .end code
.end method

.method public final paint : (Ljava/awt/Graphics;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field FPVKJCAH b LKHACHIFW;
L4:     aload_1
L5:     invokevirtual Method KHACHIFW paint (Ljava/awt/Graphics;)V
L8:     return
L9:     
    .end code
.end method
.end class
