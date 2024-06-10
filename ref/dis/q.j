.version 48 0
.class public final super q
.super ga
.field private i Ljava/awt/Component;

.method final a : (IILjava/awt/Graphics;I)V
    .code stack 5 locals 6
        .catch java/lang/RuntimeException from L0 to L37 using L40
L0:     iload_2
L1:     sipush 17932
L4:     if_icmpeq L21
L7:     aload_0
L8:     bipush -106
L10:    aconst_null
L11:    checkcast java/awt/Component
L14:    bipush 123
L16:    bipush 38
L18:    invokevirtual Method q a (ILjava/awt/Component;BI)V
L21:    aload_3
L22:    aload_0
L23:    getfield Field q c Ljava/awt/Image;
L26:    iload 4
L28:    iload_1
L29:    aload_0
L30:    getfield Field q i Ljava/awt/Component;
L33:    invokevirtual Method java/awt/Graphics drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
L36:    pop
L37:    goto L45
L40:    astore 5
L42:    aload 5
L44:    athrow
L45:    return
L46:    
        .linenumbertable
            L0 10
            L7 11
            L21 13
            L37 16
            L40 14
            L42 15
            L45 17
        .end linenumbertable
    .end code
.end method

.method final a : (ILjava/awt/Component;BI)V
    .code stack 8 locals 8
        .catch java/lang/RuntimeException from L0 to L134 using L137
L0:     aload_0
L1:     iload_1
L2:     putfield Field q e I
L5:     aload_0
L6:     iload 4
L8:     putfield Field q d I
L11:    aload_0
L12:    iconst_1
L13:    iload_1
L14:    iload 4
L16:    imul
L17:    iadd
L18:    newarray int
L20:    putfield Field q h [I
L23:    new java/awt/image/DataBufferInt
L26:    dup
L27:    aload_0
L28:    getfield Field q h [I
L31:    aload_0
L32:    getfield Field q h [I
L35:    arraylength
L36:    invokespecial Method java/awt/image/DataBufferInt <init> ([II)V
L39:    astore 5
L41:    iload_3
L42:    bipush -14
L44:    if_icmpeq L61
L47:    aload_0
L48:    bipush -75
L50:    aconst_null
L51:    checkcast java/awt/Component
L54:    bipush -128
L56:    bipush -107
L58:    invokevirtual Method q a (ILjava/awt/Component;BI)V
L61:    new java/awt/image/DirectColorModel
L64:    dup
L65:    bipush 32
L67:    ldc 16711680
L69:    ldc 65280
L71:    sipush 255
L74:    invokespecial Method java/awt/image/DirectColorModel <init> (IIII)V
L77:    astore 6
L79:    aload 6
L81:    aload_0
L82:    getfield Field q d I
L85:    aload_0
L86:    getfield Field q e I
L89:    invokevirtual Method java/awt/image/ColorModel createCompatibleSampleModel (II)Ljava/awt/image/SampleModel;
L92:    aload 5
L94:    aconst_null
L95:    invokestatic Method java/awt/image/Raster createWritableRaster (Ljava/awt/image/SampleModel;Ljava/awt/image/DataBuffer;Ljava/awt/Point;)Ljava/awt/image/WritableRaster;
L98:    astore 7
L100:   aload_0
L101:   new java/awt/image/BufferedImage
L104:   dup
L105:   aload 6
L107:   aload 7
L109:   iconst_0
L110:   new java/util/Hashtable
L113:   dup
L114:   invokespecial Method java/util/Hashtable <init> ()V
L117:   invokespecial Method java/awt/image/BufferedImage <init> (Ljava/awt/image/ColorModel;Ljava/awt/image/WritableRaster;ZLjava/util/Hashtable;)V
L120:   putfield Field q c Ljava/awt/Image;
L123:   aload_0
L124:   aload_2
L125:   putfield Field q i Ljava/awt/Component;
L128:   aload_0
L129:   bipush 88
L131:   invokevirtual Method q a (I)V
L134:   goto L142
L137:   astore 5
L139:   aload 5
L141:   athrow
L142:   return
L143:   
        .linenumbertable
            L0 20
            L5 21
            L11 23
            L23 24
            L41 27
            L47 28
            L61 30
            L79 31
            L100 32
            L123 33
            L128 34
            L134 37
            L137 35
            L139 36
            L142 38
        .end linenumbertable
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method ga <init> ()V
L4:     return
L5:     
        .linenumbertable
            L0 40
            L4 41
        .end linenumbertable
    .end code
.end method
.sourcefile "q.java"
.end class
