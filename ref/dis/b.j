.version 45 3
.class public final super b
.super java/awt/Frame
.field private a I
.field b La;

.method public <init> : (IILa;I)V
    .code stack 4 locals 6
L0:     aload_0
L1:     invokespecial Method java/awt/Frame <init> ()V
L4:     aload_0
L5:     bipush 8
L7:     putfield Field b a I
        .catch java/lang/RuntimeException from L10 to L60 using L61
L10:    iload_2
L11:    ldc 35731
L13:    if_icmpeq L23
L16:    aload_0
L17:    sipush -475
L20:    putfield Field b a I
L23:    aload_0
L24:    aload_3
L25:    putfield Field b b La;
L28:    aload_0
L29:    ldc "Jagex"
L31:    invokevirtual Method java/awt/Frame setTitle (Ljava/lang/String;)V
L34:    aload_0
L35:    iconst_0
L36:    invokevirtual Method java/awt/Frame setResizable (Z)V
L39:    aload_0
L40:    invokevirtual Method java/awt/Window show ()V
L43:    aload_0
L44:    invokevirtual Method java/awt/Window toFront ()V
L47:    aload_0
L48:    iload 4
L50:    bipush 8
L52:    iadd
L53:    iload_1
L54:    bipush 28
L56:    iadd
L57:    invokevirtual Method java/awt/Component resize (II)V
L60:    return
L61:    astore 5
L63:    new java/lang/StringBuffer
L66:    dup
L67:    ldc "51818, "
L69:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L72:    iload_1
L73:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L76:    ldc ", "
L78:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L81:    iload_2
L82:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L85:    ldc ", "
L87:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L90:    aload_3
L91:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L94:    ldc ", "
L96:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L99:    iload 4
L101:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L104:   ldc ", "
L106:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L109:   aload 5
L111:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L114:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L117:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L120:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L123:   new java/lang/RuntimeException
L126:   dup
L127:   invokespecial Method java/lang/RuntimeException <init> ()V
L130:   athrow
L131:   
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
L1:     getfield Field b b La;
L4:     aload_1
L5:     invokevirtual Method a update (Ljava/awt/Graphics;)V
L8:     return
L9:     
    .end code
.end method

.method public final paint : (Ljava/awt/Graphics;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field b b La;
L4:     aload_1
L5:     invokevirtual Method a paint (Ljava/awt/Graphics;)V
L8:     return
L9:     
    .end code
.end method
.end class
