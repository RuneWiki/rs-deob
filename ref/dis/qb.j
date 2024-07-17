.version 45 3
.class public final super qb
.super java/lang/Object
.implements java/awt/image/ImageProducer
.implements java/awt/image/ImageObserver
.field private a I
.field public b [I
.field public c I
.field public d I
.field e Ljava/awt/image/ColorModel;
.field f Ljava/awt/image/ImageConsumer;
.field public g Ljava/awt/Image;

.method public <init> : (Ljava/awt/Component;III)V
    .code stack 7 locals 6
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     sipush 299
L8:     putfield Field qb a I
        .catch java/lang/RuntimeException from L11 to L114 using L115
L11:    aload_0
L12:    iload_2
L13:    putfield Field qb c I
L16:    aload_0
L17:    iload 4
L19:    putfield Field qb d I
L22:    aload_0
L23:    iload_2
L24:    iload 4
L26:    imul
L27:    newarray int
L29:    putfield Field qb b [I
L32:    aload_0
L33:    new java/awt/image/DirectColorModel
L36:    dup
L37:    bipush 32
L39:    ldc 16711680
L41:    ldc 65280
L43:    sipush 255
L46:    invokespecial Method java/awt/image/DirectColorModel <init> (IIII)V
L49:    putfield Field qb e Ljava/awt/image/ColorModel;
L52:    aload_0
L53:    aload_1
L54:    aload_0
L55:    invokevirtual Method java/awt/Component createImage (Ljava/awt/image/ImageProducer;)Ljava/awt/Image;
L58:    putfield Field qb g Ljava/awt/Image;
L61:    aload_0
L62:    invokevirtual Method qb a ()V
L65:    aload_1
L66:    aload_0
L67:    getfield Field qb g Ljava/awt/Image;
L70:    aload_0
L71:    invokevirtual Method java/awt/Component prepareImage (Ljava/awt/Image;Ljava/awt/image/ImageObserver;)Z
L74:    pop
L75:    aload_0
L76:    invokevirtual Method qb a ()V
L79:    aload_1
L80:    aload_0
L81:    getfield Field qb g Ljava/awt/Image;
L84:    aload_0
L85:    invokevirtual Method java/awt/Component prepareImage (Ljava/awt/Image;Ljava/awt/image/ImageObserver;)Z
L88:    pop
L89:    aload_0
L90:    invokevirtual Method qb a ()V
L93:    bipush 96
L95:    iload_3
L96:    idiv
L97:    istore_3
L98:    aload_1
L99:    aload_0
L100:   getfield Field qb g Ljava/awt/Image;
L103:   aload_0
L104:   invokevirtual Method java/awt/Component prepareImage (Ljava/awt/Image;Ljava/awt/image/ImageObserver;)Z
L107:   pop
L108:   aload_0
L109:   bipush 62
L111:   invokevirtual Method qb a (B)V
L114:   return
L115:   astore 5
L117:   new java/lang/StringBuffer
L120:   dup
L121:   ldc "56385, "
L123:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L126:   aload_1
L127:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L130:   ldc ", "
L132:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L135:   iload_2
L136:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L139:   ldc ", "
L141:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L144:   iload_3
L145:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L148:   ldc ", "
L150:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L153:   iload 4
L155:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L158:   ldc ", "
L160:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L163:   aload 5
L165:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L168:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L171:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L174:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L177:   new java/lang/RuntimeException
L180:   dup
L181:   invokespecial Method java/lang/RuntimeException <init> ()V
L184:   athrow
L185:   
    .end code
.end method

.method public a : (B)V
    .code stack 4 locals 3
        .catch java/lang/RuntimeException from L0 to L31 using L32
L0:     iload_1
L1:     bipush 62
L3:     if_icmpeq L13
L6:     aload_0
L7:     sipush -283
L10:    putfield Field qb a I
L13:    aload_0
L14:    getfield Field qb c I
L17:    aload_0
L18:    getfield Field qb b [I
L21:    sipush -657
L24:    aload_0
L25:    getfield Field qb d I
L28:    invokestatic Method fb a (I[III)V
L31:    return
L32:    astore_2
L33:    new java/lang/StringBuffer
L36:    dup
L37:    ldc "2756, "
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

.method public a : (ILjava/awt/Graphics;II)V
    .code stack 5 locals 6
        .catch java/lang/RuntimeException from L0 to L25 using L26
L0:     iload 4
L2:     sipush 5193
L5:     if_icmpeq L9
L8:     return
L9:     aload_0
L10:    invokevirtual Method qb a ()V
L13:    aload_2
L14:    aload_0
L15:    getfield Field qb g Ljava/awt/Image;
L18:    iload_3
L19:    iload_1
L20:    aload_0
L21:    invokevirtual Method java/awt/Graphics drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
L24:    pop
L25:    return
L26:    astore 5
L28:    new java/lang/StringBuffer
L31:    dup
L32:    ldc "13203, "
L34:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L37:    iload_1
L38:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L41:    ldc ", "
L43:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L46:    aload_2
L47:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L50:    ldc ", "
L52:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L55:    iload_3
L56:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L59:    ldc ", "
L61:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L64:    iload 4
L66:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L69:    ldc ", "
L71:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L74:    aload 5
L76:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L79:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L82:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L85:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L88:    new java/lang/RuntimeException
L91:    dup
L92:    invokespecial Method java/lang/RuntimeException <init> ()V
L95:    athrow
L96:    
    .end code
.end method

.method public synchronized addConsumer : (Ljava/awt/image/ImageConsumer;)V
    .code stack 3 locals 2
L0:     aload_0
L1:     aload_1
L2:     putfield Field qb f Ljava/awt/image/ImageConsumer;
L5:     aload_1
L6:     aload_0
L7:     getfield Field qb c I
L10:    aload_0
L11:    getfield Field qb d I
L14:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setDimensions (II)V 3
L19:    aload_1
L20:    aconst_null
L21:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setProperties (Ljava/util/Hashtable;)V 2
L26:    aload_1
L27:    aload_0
L28:    getfield Field qb e Ljava/awt/image/ColorModel;
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
L1:     getfield Field qb f Ljava/awt/image/ImageConsumer;
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
L1:     getfield Field qb f Ljava/awt/image/ImageConsumer;
L4:     aload_1
L5:     if_acmpne L13
L8:     aload_0
L9:     aconst_null
L10:    putfield Field qb f Ljava/awt/image/ImageConsumer;
L13:    return
L14:    
    .end code
.end method

.method public startProduction : (Ljava/awt/image/ImageConsumer;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     aload_1
L2:     invokevirtual Method qb addConsumer (Ljava/awt/image/ImageConsumer;)V
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
L1:     getfield Field qb f Ljava/awt/image/ImageConsumer;
L4:     ifnonnull L8
L7:     return
L8:     aload_0
L9:     getfield Field qb f Ljava/awt/image/ImageConsumer;
L12:    iconst_0
L13:    iconst_0
L14:    aload_0
L15:    getfield Field qb c I
L18:    aload_0
L19:    getfield Field qb d I
L22:    aload_0
L23:    getfield Field qb e Ljava/awt/image/ColorModel;
L26:    aload_0
L27:    getfield Field qb b [I
L30:    iconst_0
L31:    aload_0
L32:    getfield Field qb c I
L35:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setPixels (IIIILjava/awt/image/ColorModel;[III)V 9
L40:    aload_0
L41:    getfield Field qb f Ljava/awt/image/ImageConsumer;
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
