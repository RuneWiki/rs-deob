.version 45 3
.class public final super t
.super java/lang/Object
.field private a I
.field private b Z
.field private c I
.field private d [Lu;

.method public <init> : (II)V
    .code stack 4 locals 5
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     sipush 4277
L8:     putfield Field t a I
L11:    aload_0
L12:    iconst_0
L13:    putfield Field t b Z
        .catch java/lang/RuntimeException from L16 to L100 using L101
L16:    aload_0
L17:    iload_2
L18:    putfield Field t c I
L21:    aload_0
L22:    iload_2
L23:    anewarray u
L26:    putfield Field t d [Lu;
L29:    iload_1
L30:    bipush 9
L32:    if_icmplt L41
L35:    iload_1
L36:    bipush 9
L38:    if_icmple L57
L41:    aload_0
L42:    aload_0
L43:    getfield Field t b Z
L46:    ifeq L53
L49:    iconst_0
L50:    goto L54
L53:    iconst_1
L54:    putfield Field t b Z
L57:    iconst_0
L58:    istore_3
L59:    goto L95
L62:    aload_0
L63:    getfield Field t d [Lu;
L66:    iload_3
L67:    new u
L70:    dup
L71:    invokespecial Method u <init> ()V
L74:    dup_x2
L75:    aastore
L76:    astore 4
L78:    aload 4
L80:    aload 4
L82:    putfield Field u b Lu;
L85:    aload 4
L87:    aload 4
L89:    putfield Field u c Lu;
L92:    iinc 3 1
L95:    iload_3
L96:    iload_2
L97:    if_icmplt L62
L100:   return
L101:   astore_3
L102:   new java/lang/StringBuffer
L105:   dup
L106:   ldc "73766, "
L108:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L111:   iload_1
L112:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L115:   ldc ", "
L117:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L120:   iload_2
L121:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L124:   ldc ", "
L126:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L129:   aload_3
L130:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L133:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L136:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L139:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L142:   new java/lang/RuntimeException
L145:   dup
L146:   invokespecial Method java/lang/RuntimeException <init> ()V
L149:   athrow
L150:   
    .end code
.end method

.method public a : (J)Lu;
    .code stack 6 locals 5
L0:     aload_0
L1:     getfield Field t d [Lu;
L4:     lload_1
L5:     aload_0
L6:     getfield Field t c I
L9:     iconst_1
L10:    isub
L11:    i2l
L12:    land
L13:    l2i
L14:    aaload
L15:    astore_3
L16:    aload_3
L17:    getfield Field u b Lu;
L20:    astore 4
L22:    getstatic Field db g I
L25:    ifeq L48
L28:    aload 4
L30:    getfield Field u a J
L33:    lload_1
L34:    lcmp
L35:    ifne L41
L38:    aload 4
L40:    areturn
L41:    aload 4
L43:    getfield Field u b Lu;
L46:    astore 4
L48:    aload 4
L50:    aload_3
L51:    if_acmpne L28
L54:    aconst_null
L55:    areturn
L56:    
    .end code
.end method

.method public a : (JILu;)V
    .code stack 6 locals 7
L0:     getstatic Field db g I
L3:     istore 6
        .catch java/lang/RuntimeException from L5 to L83 using L98
L5:     aload 4
L7:     getfield Field u c Lu;
L10:    ifnull L18
L13:    aload 4
L15:    invokevirtual Method u a ()V
L18:    aload_0
L19:    getfield Field t d [Lu;
L22:    lload_1
L23:    aload_0
L24:    getfield Field t c I
L27:    iconst_1
L28:    isub
L29:    i2l
L30:    land
L31:    l2i
L32:    aaload
L33:    astore 5
L35:    aload 4
L37:    aload 5
L39:    getfield Field u c Lu;
L42:    putfield Field u c Lu;
L45:    iload_3
L46:    iflt L50
L49:    return
L50:    aload 4
L52:    aload 5
L54:    putfield Field u b Lu;
L57:    aload 4
L59:    getfield Field u c Lu;
L62:    aload 4
L64:    putfield Field u b Lu;
L67:    aload 4
L69:    getfield Field u b Lu;
L72:    aload 4
L74:    putfield Field u c Lu;
L77:    aload 4
L79:    lload_1
L80:    putfield Field u a J
L83:    getstatic Field u d I
L86:    ifeq L97
L89:    iinc 6 1
L92:    iload 6
L94:    putstatic Field db g I
L97:    return
L98:    astore 5
L100:   new java/lang/StringBuffer
L103:   dup
L104:   ldc "49205, "
L106:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L109:   lload_1
L110:   invokevirtual Method java/lang/StringBuffer append (J)Ljava/lang/StringBuffer;
L113:   ldc ", "
L115:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L118:   iload_3
L119:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L122:   ldc ", "
L124:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L127:   aload 4
L129:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L132:   ldc ", "
L134:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L137:   aload 5
L139:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L142:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L145:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L148:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L151:   new java/lang/RuntimeException
L154:   dup
L155:   invokespecial Method java/lang/RuntimeException <init> ()V
L158:   athrow
L159:   
    .end code
.end method
.end class
