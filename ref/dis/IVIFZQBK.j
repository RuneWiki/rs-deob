.version 45 3
.class public final super IVIFZQBK
.super java/lang/Object
.implements java/awt/image/ImageProducer
.implements java/awt/image/ImageObserver
.field private a I
.field private b Z
.field public c [I
.field public d I
.field public e I
.field f Ljava/awt/image/ColorModel;
.field g Ljava/awt/image/ImageConsumer;
.field public h Ljava/awt/Image;

.method public <init> : (IILjava/awt/Component;I)V
    .code stack 7 locals 6
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_1
L6:     putfield Field IVIFZQBK b Z
        .catch java/lang/RuntimeException from L9 to L125 using L126
L9:     aload_0
L10:    iload_1
L11:    putfield Field IVIFZQBK d I
L14:    aload_0
L15:    iload_2
L16:    putfield Field IVIFZQBK e I
L19:    aload_0
L20:    iload_1
L21:    iload_2
L22:    imul
L23:    newarray int
L25:    putfield Field IVIFZQBK c [I
L28:    aload_0
L29:    new java/awt/image/DirectColorModel
L32:    dup
L33:    bipush 32
L35:    ldc 16711680
L37:    ldc 65280
L39:    sipush 255
L42:    invokespecial Method java/awt/image/DirectColorModel <init> (IIII)V
L45:    putfield Field IVIFZQBK f Ljava/awt/image/ColorModel;
L48:    aload_0
L49:    aload_3
L50:    aload_0
L51:    invokevirtual Method java/awt/Component createImage (Ljava/awt/image/ImageProducer;)Ljava/awt/Image;
L54:    putfield Field IVIFZQBK h Ljava/awt/Image;
L57:    aload_0
L58:    invokevirtual Method IVIFZQBK a ()V
L61:    aload_3
L62:    aload_0
L63:    getfield Field IVIFZQBK h Ljava/awt/Image;
L66:    aload_0
L67:    invokevirtual Method java/awt/Component prepareImage (Ljava/awt/Image;Ljava/awt/image/ImageObserver;)Z
L70:    pop
L71:    iload 4
L73:    ifeq L92
L76:    aload_0
L77:    aload_0
L78:    getfield Field IVIFZQBK b Z
L81:    ifeq L88
L84:    iconst_0
L85:    goto L89
L88:    iconst_1
L89:    putfield Field IVIFZQBK b Z
L92:    aload_0
L93:    invokevirtual Method IVIFZQBK a ()V
L96:    aload_3
L97:    aload_0
L98:    getfield Field IVIFZQBK h Ljava/awt/Image;
L101:   aload_0
L102:   invokevirtual Method java/awt/Component prepareImage (Ljava/awt/Image;Ljava/awt/image/ImageObserver;)Z
L105:   pop
L106:   aload_0
L107:   invokevirtual Method IVIFZQBK a ()V
L110:   aload_3
L111:   aload_0
L112:   getfield Field IVIFZQBK h Ljava/awt/Image;
L115:   aload_0
L116:   invokevirtual Method java/awt/Component prepareImage (Ljava/awt/Image;Ljava/awt/image/ImageObserver;)Z
L119:   pop
L120:   aload_0
L121:   iconst_0
L122:   invokevirtual Method IVIFZQBK a (I)V
L125:   return
L126:   astore 5
L128:   new java/lang/StringBuffer
L131:   dup
L132:   ldc "55701, "
L134:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L137:   iload_1
L138:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L141:   ldc ", "
L143:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L146:   iload_2
L147:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L150:   ldc ", "
L152:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L155:   aload_3
L156:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L159:   ldc ", "
L161:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L164:   iload 4
L166:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L169:   ldc ", "
L171:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L174:   aload 5
L176:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L179:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L182:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L185:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L188:   new java/lang/RuntimeException
L191:   dup
L192:   invokespecial Method java/lang/RuntimeException <init> ()V
L195:   athrow
L196:   
    .end code
.end method

.method public a : (I)V
    .code stack 5 locals 3
        .catch java/lang/RuntimeException from L0 to L37 using L38
L0:     aload_0
L1:     getfield Field IVIFZQBK e I
L4:     aload_0
L5:     getfield Field IVIFZQBK d I
L8:     sipush -293
L11:    aload_0
L12:    getfield Field IVIFZQBK c [I
L15:    invokestatic Method AFCKELYG a (III[I)V
L18:    iload_1
L19:    ifeq L78
L22:    iconst_1
L23:    istore_2
L24:    getstatic Field AFCKELYG w Z
L27:    ifeq L33
L30:    iinc 2 1
L33:    iload_2
L34:    ifgt L30
L37:    return
L38:    astore_2
L39:    new java/lang/StringBuffer
L42:    dup
L43:    ldc "61030, "
L45:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L48:    iload_1
L49:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L52:    ldc ", "
L54:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L57:    aload_2
L58:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L61:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L64:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L67:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L70:    new java/lang/RuntimeException
L73:    dup
L74:    invokespecial Method java/lang/RuntimeException <init> ()V
L77:    athrow
L78:    return
L79:    
    .end code
.end method

.method public a : (IILjava/awt/Graphics;I)V
    .code stack 5 locals 6
        .catch java/lang/RuntimeException from L0 to L31 using L32
L0:     aload_0
L1:     invokevirtual Method IVIFZQBK a ()V
L4:     iload_2
L5:     sipush 23680
L8:     if_icmpeq L18
L11:    aload_0
L12:    sipush -169
L15:    putfield Field IVIFZQBK a I
L18:    aload_3
L19:    aload_0
L20:    getfield Field IVIFZQBK h Ljava/awt/Image;
L23:    iload 4
L25:    iload_1
L26:    aload_0
L27:    invokevirtual Method java/awt/Graphics drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
L30:    pop
L31:    return
L32:    astore 5
L34:    new java/lang/StringBuffer
L37:    dup
L38:    ldc "99028, "
L40:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L43:    iload_1
L44:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L47:    ldc ", "
L49:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L52:    iload_2
L53:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L56:    ldc ", "
L58:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L61:    aload_3
L62:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L65:    ldc ", "
L67:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L70:    iload 4
L72:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L75:    ldc ", "
L77:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L80:    aload 5
L82:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L85:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L88:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L91:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L94:    new java/lang/RuntimeException
L97:    dup
L98:    invokespecial Method java/lang/RuntimeException <init> ()V
L101:   athrow
L102:   
    .end code
.end method

.method public synchronized addConsumer : (Ljava/awt/image/ImageConsumer;)V
    .code stack 3 locals 2
L0:     aload_0
L1:     aload_1
L2:     putfield Field IVIFZQBK g Ljava/awt/image/ImageConsumer;
L5:     aload_1
L6:     aload_0
L7:     getfield Field IVIFZQBK d I
L10:    aload_0
L11:    getfield Field IVIFZQBK e I
L14:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setDimensions (II)V 3
L19:    aload_1
L20:    aconst_null
L21:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setProperties (Ljava/util/Hashtable;)V 2
L26:    aload_1
L27:    aload_0
L28:    getfield Field IVIFZQBK f Ljava/awt/image/ColorModel;
L31:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setColorModel (Ljava/awt/image/ColorModel;)V 2
L36:    aload_1
L37:    bipush 14
L39:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setHints (I)V 2
L44:    return
L45:    
    .end code
.end method

.method public synchronized isConsumer : (Ljava/awt/image/ImageConsumer;)Z
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field IVIFZQBK g Ljava/awt/image/ImageConsumer;
L4:     aload_1
L5:     if_acmpne L10
L8:     iconst_1
L9:     ireturn
L10:    iconst_0
L11:    ireturn
L12:    
    .end code
.end method

.method public synchronized removeConsumer : (Ljava/awt/image/ImageConsumer;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field IVIFZQBK g Ljava/awt/image/ImageConsumer;
L4:     aload_1
L5:     if_acmpne L13
L8:     aload_0
L9:     aconst_null
L10:    putfield Field IVIFZQBK g Ljava/awt/image/ImageConsumer;
L13:    return
L14:    
    .end code
.end method

.method public startProduction : (Ljava/awt/image/ImageConsumer;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     aload_1
L2:     invokevirtual Method IVIFZQBK addConsumer (Ljava/awt/image/ImageConsumer;)V
L5:     return
L6:     
    .end code
.end method

.method public requestTopDownLeftRightResend : (Ljava/awt/image/ImageConsumer;)V
    .code stack 2 locals 2
L0:     getstatic Field java/lang/System out Ljava/io/PrintStream;
L3:     ldc "TDLR"
L5:     invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L8:     return
L9:     
    .end code
.end method

.method public synchronized a : ()V
    .code stack 9 locals 1
L0:     aload_0
L1:     getfield Field IVIFZQBK g Ljava/awt/image/ImageConsumer;
L4:     ifnonnull L8
L7:     return
L8:     aload_0
L9:     getfield Field IVIFZQBK g Ljava/awt/image/ImageConsumer;
L12:    iconst_0
L13:    iconst_0
L14:    aload_0
L15:    getfield Field IVIFZQBK d I
L18:    aload_0
L19:    getfield Field IVIFZQBK e I
L22:    aload_0
L23:    getfield Field IVIFZQBK f Ljava/awt/image/ColorModel;
L26:    aload_0
L27:    getfield Field IVIFZQBK c [I
L30:    iconst_0
L31:    aload_0
L32:    getfield Field IVIFZQBK d I
L35:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setPixels (IIIILjava/awt/image/ColorModel;[III)V 9
L40:    aload_0
L41:    getfield Field IVIFZQBK g Ljava/awt/image/ImageConsumer;
L44:    iconst_2
L45:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer imageComplete (I)V 2
L50:    return
L51:    
    .end code
.end method

.method public imageUpdate : (Ljava/awt/Image;IIIII)Z
    .code stack 1 locals 7
L0:     iconst_1
L1:     ireturn
L2:     
    .end code
.end method
.end class
