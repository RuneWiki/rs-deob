.version 45 3
.class public super OPPOFIOL
.super AFCKELYG
.field private static x I
.field private static y I
.field private static z Z
.field public static A Z
.field static B Z
.field static C Z
.field public static D Z
.field public static E I
.field public static F I
.field public static G I
.field public static H [I
.field public static I [I
.field public static J [I
.field public static K [I
.field public static L [I
.field static M I
.field public static N [LDSMJIEPN;
.field static O [Z
.field static P [I
.field static Q I
.field static R [[I
.field static S [[I
.field public static T [I
.field public static U I
.field public static V [I
.field static W [[I

.method public static final b : (I)V
    .code stack 4 locals 2
        .catch java/lang/RuntimeException from L0 to L71 using L72
L0:     aconst_null
L1:     putstatic Field OPPOFIOL H [I
L4:     aconst_null
L5:     putstatic Field OPPOFIOL H [I
L8:     aconst_null
L9:     putstatic Field OPPOFIOL J [I
L12:    aconst_null
L13:    putstatic Field OPPOFIOL K [I
L16:    aconst_null
L17:    putstatic Field OPPOFIOL L [I
L20:    aconst_null
L21:    putstatic Field OPPOFIOL N [LDSMJIEPN;
L24:    aconst_null
L25:    putstatic Field OPPOFIOL O [Z
L28:    aconst_null
L29:    putstatic Field OPPOFIOL P [I
L32:    aconst_null
L33:    putstatic Field OPPOFIOL R [[I
L36:    aconst_null
L37:    putstatic Field OPPOFIOL S [[I
L40:    aconst_null
L41:    putstatic Field OPPOFIOL T [I
L44:    aconst_null
L45:    putstatic Field OPPOFIOL V [I
L48:    aconst_null
L49:    putstatic Field OPPOFIOL W [[I
L52:    iload_0
L53:    iflt L112
L56:    iconst_1
L57:    istore_1
L58:    getstatic Field XHHRODPC l Z
L61:    ifeq L67
L64:    iinc 1 1
L67:    iload_1
L68:    ifgt L64
L71:    return
L72:    astore_1
L73:    new java/lang/StringBuffer
L76:    dup
L77:    ldc "80327, "
L79:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L82:    iload_0
L83:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L86:    ldc ", "
L88:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L91:    aload_1
L92:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L95:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L98:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L101:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L104:   new java/lang/RuntimeException
L107:   dup
L108:   invokespecial Method java/lang/RuntimeException <init> ()V
L111:   athrow
L112:   return
L113:   
    .end code
.end method

.method public static final a : (B)V
    .code stack 5 locals 3
L0:     getstatic Field XHHRODPC l Z
L3:     istore_2
        .catch java/lang/RuntimeException from L4 to L79 using L80
L4:     getstatic Field AFCKELYG o I
L7:     newarray int
L9:     putstatic Field OPPOFIOL L [I
L12:    iload_0
L13:    bipush 6
L15:    if_icmpne L24
L18:    iconst_0
L19:    istore_0
L20:    iload_2
L21:    ifeq L37
L24:    iconst_1
L25:    istore_1
L26:    iload_2
L27:    ifeq L33
L30:    iinc 1 1
L33:    iload_1
L34:    ifgt L30
L37:    iconst_0
L38:    istore_1
L39:    iload_2
L40:    ifeq L56
L43:    getstatic Field OPPOFIOL L [I
L46:    iload_1
L47:    getstatic Field AFCKELYG n I
L50:    iload_1
L51:    imul
L52:    iastore
L53:    iinc 1 1
L56:    iload_1
L57:    getstatic Field AFCKELYG o I
L60:    if_icmplt L43
L63:    getstatic Field AFCKELYG n I
L66:    iconst_2
L67:    idiv
L68:    putstatic Field OPPOFIOL F I
L71:    getstatic Field AFCKELYG o I
L74:    iconst_2
L75:    idiv
L76:    putstatic Field OPPOFIOL G I
L79:    return
L80:    astore_1
L81:    new java/lang/StringBuffer
L84:    dup
L85:    ldc "79230, "
L87:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L90:    iload_0
L91:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L94:    ldc ", "
L96:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L99:    aload_1
L100:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L103:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L106:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L109:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L112:   new java/lang/RuntimeException
L115:   dup
L116:   invokespecial Method java/lang/RuntimeException <init> ()V
L119:   athrow
L120:   
    .end code
.end method

.method public static final a : (III)V
    .code stack 5 locals 5
L0:     getstatic Field XHHRODPC l Z
L3:     istore 4
        .catch java/lang/RuntimeException from L5 to L56 using L57
L5:     iload_2
L6:     newarray int
L8:     putstatic Field OPPOFIOL L [I
L11:    iload 4
L13:    ifeq L17
L16:    return
L17:    iload_0
L18:    ifge L16
L21:    iconst_0
L22:    istore_3
L23:    iload 4
L25:    ifeq L39
L28:    getstatic Field OPPOFIOL L [I
L31:    iload_3
L32:    iload_1
L33:    iload_3
L34:    imul
L35:    iastore
L36:    iinc 3 1
L39:    iload_3
L40:    iload_2
L41:    if_icmplt L28
L44:    iload_1
L45:    iconst_2
L46:    idiv
L47:    putstatic Field OPPOFIOL F I
L50:    iload_2
L51:    iconst_2
L52:    idiv
L53:    putstatic Field OPPOFIOL G I
L56:    return
L57:    astore_3
L58:    new java/lang/StringBuffer
L61:    dup
L62:    ldc "8612, "
L64:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L67:    iload_0
L68:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L71:    ldc ", "
L73:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L76:    iload_1
L77:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L80:    ldc ", "
L82:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L85:    iload_2
L86:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L89:    ldc ", "
L91:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L94:    aload_3
L95:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L98:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L101:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L104:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L107:   new java/lang/RuntimeException
L110:   dup
L111:   invokespecial Method java/lang/RuntimeException <init> ()V
L114:   athrow
L115:   
    .end code
.end method

.method public static final c : (I)V
    .code stack 4 locals 2
        .catch java/lang/RuntimeException from L0 to L36 using L37
L0:     iload_0
L1:     iflt L8
L4:     iload_0
L5:     ifle L9
L8:     return
L9:     aconst_null
L10:    putstatic Field OPPOFIOL R [[I
L13:    iconst_0
L14:    istore_1
L15:    getstatic Field XHHRODPC l Z
L18:    ifeq L30
L21:    getstatic Field OPPOFIOL S [[I
L24:    iload_1
L25:    aconst_null
L26:    aastore
L27:    iinc 1 1
L30:    iload_1
L31:    bipush 50
L33:    if_icmplt L21
L36:    return
L37:    astore_1
L38:    new java/lang/StringBuffer
L41:    dup
L42:    ldc "84003, "
L44:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L47:    iload_0
L48:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L51:    ldc ", "
L53:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L56:    aload_1
L57:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L60:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L63:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L66:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L69:    new java/lang/RuntimeException
L72:    dup
L73:    invokespecial Method java/lang/RuntimeException <init> ()V
L76:    athrow
L77:    
    .end code
.end method

.method public static final a : (IZ)V
    .code stack 4 locals 4
L0:     getstatic Field XHHRODPC l Z
L3:     istore_3
        .catch java/lang/RuntimeException from L4 to L87 using L88
L4:     iload_1
L5:     ifne L21
L8:     iconst_1
L9:     istore_2
L10:    iload_3
L11:    ifeq L17
L14:    iinc 2 1
L17:    iload_2
L18:    ifgt L14
L21:    getstatic Field OPPOFIOL R [[I
L24:    ifnonnull L137
L27:    iload_0
L28:    putstatic Field OPPOFIOL Q I
L31:    getstatic Field OPPOFIOL A Z
L34:    ifeq L54
L37:    getstatic Field OPPOFIOL Q I
L40:    sipush 16384
L43:    multianewarray [[I 2
L47:    putstatic Field OPPOFIOL R [[I
L50:    iload_3
L51:    ifeq L66
L54:    getstatic Field OPPOFIOL Q I
L57:    ldc 65536
L59:    multianewarray [[I 2
L63:    putstatic Field OPPOFIOL R [[I
L66:    iconst_0
L67:    istore_2
L68:    iload_3
L69:    ifeq L81
L72:    getstatic Field OPPOFIOL S [[I
L75:    iload_2
L76:    aconst_null
L77:    aastore
L78:    iinc 2 1
L81:    iload_2
L82:    bipush 50
L84:    if_icmplt L72
L87:    return
L88:    astore_2
L89:    new java/lang/StringBuffer
L92:    dup
L93:    ldc "54075, "
L95:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L98:    iload_0
L99:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L102:   ldc ", "
L104:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L107:   iload_1
L108:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L111:   ldc ", "
L113:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L116:   aload_2
L117:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L120:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L123:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L126:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L129:   new java/lang/RuntimeException
L132:   dup
L133:   invokespecial Method java/lang/RuntimeException <init> ()V
L136:   athrow
L137:   return
L138:   
    .end code
.end method

.method public static final a : (LXTGLDHGX;I)V
    .code stack 8 locals 4
L0:     getstatic Field XHHRODPC l Z
L3:     istore_3
L4:     iconst_0
L5:     putstatic Field OPPOFIOL M I
L8:     iload_1
L9:     ifeq L26
L12:    getstatic Field OPPOFIOL z Z
L15:    ifeq L22
L18:    iconst_0
L19:    goto L23
L22:    iconst_1
L23:    putstatic Field OPPOFIOL z Z
L26:    iconst_0
L27:    istore_2
L28:    iload_3
L29:    ifeq L110
        .catch java/lang/Exception from L32 to L100 using L103
        .catch java/lang/RuntimeException from L4 to L116 using L117
L32:    getstatic Field OPPOFIOL N [LDSMJIEPN;
L35:    iload_2
L36:    new DSMJIEPN
L39:    dup
L40:    aload_0
L41:    iload_2
L42:    invokestatic Method java/lang/String valueOf (I)Ljava/lang/String;
L45:    iconst_0
L46:    invokespecial Method DSMJIEPN <init> (LXTGLDHGX;Ljava/lang/String;I)V
L49:    aastore
L50:    getstatic Field OPPOFIOL A Z
L53:    ifeq L83
L56:    getstatic Field OPPOFIOL N [LDSMJIEPN;
L59:    iload_2
L60:    aaload
L61:    getfield Field DSMJIEPN H I
L64:    sipush 128
L67:    if_icmpne L83
L70:    getstatic Field OPPOFIOL N [LDSMJIEPN;
L73:    iload_2
L74:    aaload
L75:    iconst_0
L76:    invokevirtual Method DSMJIEPN b (Z)V
L79:    iload_3
L80:    ifeq L92
L83:    getstatic Field OPPOFIOL N [LDSMJIEPN;
L86:    iload_2
L87:    aaload
L88:    iconst_0
L89:    invokevirtual Method DSMJIEPN c (Z)V
L92:    getstatic Field OPPOFIOL M I
L95:    iconst_1
L96:    iadd
L97:    putstatic Field OPPOFIOL M I
L100:   goto L107
L103:   pop
L104:   goto L107
L107:   iinc 2 1
L110:   iload_2
L111:   bipush 50
L113:   if_icmplt L32
L116:   return
L117:   astore_2
L118:   new java/lang/StringBuffer
L121:   dup
L122:   ldc "98799, "
L124:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L127:   aload_0
L128:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L131:   ldc ", "
L133:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L136:   iload_1
L137:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L140:   ldc ", "
L142:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L145:   aload_2
L146:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L149:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L152:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L155:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L158:   new java/lang/RuntimeException
L161:   dup
L162:   invokespecial Method java/lang/RuntimeException <init> ()V
L165:   athrow
L166:   
    .end code
.end method

.method public static final a : (II)I
    .code stack 4 locals 8
        .catch java/lang/RuntimeException from L0 to L161 using L161
L0:     iload_1
L1:     sipush 12660
L4:     if_icmpeq L9
L7:     iconst_2
L8:     ireturn
L9:     getstatic Field OPPOFIOL P [I
L12:    iload_0
L13:    iaload
L14:    ifeq L23
L17:    getstatic Field OPPOFIOL P [I
L20:    iload_0
L21:    iaload
L22:    ireturn
L23:    iconst_0
L24:    istore_2
L25:    iconst_0
L26:    istore_3
L27:    iconst_0
L28:    istore 4
L30:    getstatic Field OPPOFIOL W [[I
L33:    iload_0
L34:    aaload
L35:    arraylength
L36:    istore 5
L38:    iconst_0
L39:    istore 6
L41:    getstatic Field XHHRODPC l Z
L44:    ifeq L103
L47:    iload_2
L48:    getstatic Field OPPOFIOL W [[I
L51:    iload_0
L52:    aaload
L53:    iload 6
L55:    iaload
L56:    bipush 16
L58:    ishr
L59:    sipush 255
L62:    iand
L63:    iadd
L64:    istore_2
L65:    iload_3
L66:    getstatic Field OPPOFIOL W [[I
L69:    iload_0
L70:    aaload
L71:    iload 6
L73:    iaload
L74:    bipush 8
L76:    ishr
L77:    sipush 255
L80:    iand
L81:    iadd
L82:    istore_3
L83:    iload 4
L85:    getstatic Field OPPOFIOL W [[I
L88:    iload_0
L89:    aaload
L90:    iload 6
L92:    iaload
L93:    sipush 255
L96:    iand
L97:    iadd
L98:    istore 4
L100:   iinc 6 1
L103:   iload 6
L105:   iload 5
L107:   if_icmplt L47
L110:   iload_2
L111:   iload 5
L113:   idiv
L114:   bipush 16
L116:   ishl
L117:   iload_3
L118:   iload 5
L120:   idiv
L121:   bipush 8
L123:   ishl
L124:   iadd
L125:   iload 4
L127:   iload 5
L129:   idiv
L130:   iadd
L131:   istore 7
L133:   iload 7
L135:   ldc2_w 1.4e0
L138:   invokestatic Method OPPOFIOL a (ID)I
L141:   istore 7
L143:   iload 7
L145:   ifne L151
L148:   iconst_1
L149:   istore 7
L151:   getstatic Field OPPOFIOL P [I
L154:   iload_0
L155:   iload 7
L157:   iastore
L158:   iload 7
L160:   ireturn
L161:   astore_2
L162:   new java/lang/StringBuffer
L165:   dup
L166:   ldc "10237, "
L168:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L171:   iload_0
L172:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L175:   ldc ", "
L177:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L180:   iload_1
L181:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L184:   ldc ", "
L186:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L189:   aload_2
L190:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L193:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L196:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L199:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L202:   new java/lang/RuntimeException
L205:   dup
L206:   invokespecial Method java/lang/RuntimeException <init> ()V
L209:   athrow
L210:   
    .end code
.end method

.method public static final b : (II)V
    .code stack 5 locals 3
        .catch java/lang/RuntimeException from L0 to L48 using L49
L0:     getstatic Field OPPOFIOL S [[I
L3:     iload_0
L4:     aaload
L5:     ifnonnull L9
L8:     return
L9:     getstatic Field OPPOFIOL R [[I
L12:    getstatic Field OPPOFIOL Q I
L15:    dup
L16:    iconst_1
L17:    iadd
L18:    putstatic Field OPPOFIOL Q I
L21:    getstatic Field OPPOFIOL S [[I
L24:    iload_0
L25:    aaload
L26:    aastore
L27:    getstatic Field XHHRODPC l Z
L30:    ifeq L38
L33:    bipush 7
L35:    putstatic Field OPPOFIOL x I
L38:    iload_1
L39:    ifge L33
L42:    getstatic Field OPPOFIOL S [[I
L45:    iload_0
L46:    aconst_null
L47:    aastore
L48:    return
L49:    astore_2
L50:    new java/lang/StringBuffer
L53:    dup
L54:    ldc "64331, "
L56:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L59:    iload_0
L60:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L63:    ldc ", "
L65:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L68:    iload_1
L69:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L72:    ldc ", "
L74:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L77:    aload_2
L78:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L81:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L84:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L87:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L90:    new java/lang/RuntimeException
L93:    dup
L94:    invokespecial Method java/lang/RuntimeException <init> ()V
L97:    athrow
L98:    
    .end code
.end method

.method public static final d : (I)[I
    .code stack 8 locals 7
L0:     getstatic Field XHHRODPC l Z
L3:     istore 6
L5:     getstatic Field OPPOFIOL T [I
L8:     iload_0
L9:     getstatic Field OPPOFIOL U I
L12:    dup
L13:    iconst_1
L14:    iadd
L15:    putstatic Field OPPOFIOL U I
L18:    iastore
L19:    getstatic Field OPPOFIOL S [[I
L22:    iload_0
L23:    aaload
L24:    ifnull L33
L27:    getstatic Field OPPOFIOL S [[I
L30:    iload_0
L31:    aaload
L32:    areturn
L33:    getstatic Field OPPOFIOL Q I
L36:    ifle L66
L39:    getstatic Field OPPOFIOL R [[I
L42:    getstatic Field OPPOFIOL Q I
L45:    iconst_1
L46:    isub
L47:    dup
L48:    putstatic Field OPPOFIOL Q I
L51:    aaload
L52:    astore_1
L53:    getstatic Field OPPOFIOL R [[I
L56:    getstatic Field OPPOFIOL Q I
L59:    aconst_null
L60:    aastore
L61:    iload 6
L63:    ifeq L135
L66:    iconst_0
L67:    istore_2
L68:    iconst_m1
L69:    istore_3
L70:    iconst_0
L71:    istore 4
L73:    iload 6
L75:    ifeq L115
L78:    getstatic Field OPPOFIOL S [[I
L81:    iload 4
L83:    aaload
L84:    ifnull L112
L87:    getstatic Field OPPOFIOL T [I
L90:    iload 4
L92:    iaload
L93:    iload_2
L94:    if_icmplt L102
L97:    iload_3
L98:    iconst_m1
L99:    if_icmpne L112
L102:   getstatic Field OPPOFIOL T [I
L105:   iload 4
L107:   iaload
L108:   istore_2
L109:   iload 4
L111:   istore_3
L112:   iinc 4 1
L115:   iload 4
L117:   getstatic Field OPPOFIOL M I
L120:   if_icmplt L78
L123:   getstatic Field OPPOFIOL S [[I
L126:   iload_3
L127:   aaload
L128:   astore_1
L129:   getstatic Field OPPOFIOL S [[I
L132:   iload_3
L133:   aconst_null
L134:   aastore
L135:   getstatic Field OPPOFIOL S [[I
L138:   iload_0
L139:   aload_1
L140:   aastore
L141:   getstatic Field OPPOFIOL N [LDSMJIEPN;
L144:   iload_0
L145:   aaload
L146:   astore_2
L147:   getstatic Field OPPOFIOL W [[I
L150:   iload_0
L151:   aaload
L152:   astore_3
L153:   getstatic Field OPPOFIOL A Z
L156:   ifeq L278
L159:   getstatic Field OPPOFIOL O [Z
L162:   iload_0
L163:   iconst_0
L164:   bastore
L165:   iconst_0
L166:   istore 4
L168:   iload 6
L170:   ifeq L265
L173:   aload_1
L174:   iload 4
L176:   aload_3
L177:   aload_2
L178:   getfield Field DSMJIEPN B [B
L181:   iload 4
L183:   baload
L184:   iaload
L185:   ldc 16316671
L187:   iand
L188:   dup_x2
L189:   iastore
L190:   istore 5
L192:   iload 5
L194:   ifne L203
L197:   getstatic Field OPPOFIOL O [Z
L200:   iload_0
L201:   iconst_1
L202:   bastore
L203:   aload_1
L204:   sipush 4096
L207:   iload 4
L209:   iadd
L210:   iload 5
L212:   iload 5
L214:   iconst_3
L215:   iushr
L216:   isub
L217:   ldc 16316671
L219:   iand
L220:   iastore
L221:   aload_1
L222:   sipush 8192
L225:   iload 4
L227:   iadd
L228:   iload 5
L230:   iload 5
L232:   iconst_2
L233:   iushr
L234:   isub
L235:   ldc 16316671
L237:   iand
L238:   iastore
L239:   aload_1
L240:   sipush 12288
L243:   iload 4
L245:   iadd
L246:   iload 5
L248:   iload 5
L250:   iconst_2
L251:   iushr
L252:   isub
L253:   iload 5
L255:   iconst_3
L256:   iushr
L257:   isub
L258:   ldc 16316671
L260:   iand
L261:   iastore
L262:   iinc 4 1
L265:   iload 4
L267:   sipush 4096
L270:   if_icmplt L173
L273:   iload 6
L275:   ifeq L499
L278:   aload_2
L279:   getfield Field DSMJIEPN D I
L282:   bipush 64
L284:   if_icmpne L359
L287:   iconst_0
L288:   istore 4
L290:   iload 6
L292:   ifeq L346
L295:   iconst_0
L296:   istore 5
L298:   iload 6
L300:   ifeq L335
L303:   aload_1
L304:   iload 5
L306:   iload 4
L308:   bipush 7
L310:   ishl
L311:   iadd
L312:   aload_3
L313:   aload_2
L314:   getfield Field DSMJIEPN B [B
L317:   iload 5
L319:   iconst_1
L320:   ishr
L321:   iload 4
L323:   iconst_1
L324:   ishr
L325:   bipush 6
L327:   ishl
L328:   iadd
L329:   baload
L330:   iaload
L331:   iastore
L332:   iinc 5 1
L335:   iload 5
L337:   sipush 128
L340:   if_icmplt L303
L343:   iinc 4 1
L346:   iload 4
L348:   sipush 128
L351:   if_icmplt L295
L354:   iload 6
L356:   ifeq L391
L359:   iconst_0
L360:   istore 4
L362:   iload 6
L364:   ifeq L383
L367:   aload_1
L368:   iload 4
L370:   aload_3
L371:   aload_2
L372:   getfield Field DSMJIEPN B [B
L375:   iload 4
L377:   baload
L378:   iaload
L379:   iastore
L380:   iinc 4 1
L383:   iload 4
L385:   sipush 16384
L388:   if_icmplt L367
L391:   getstatic Field OPPOFIOL O [Z
L394:   iload_0
L395:   iconst_0
L396:   bastore
L397:   iconst_0
L398:   istore 4
L400:   iload 6
L402:   ifeq L491
L405:   aload_1
L406:   iload 4
L408:   dup2
L409:   iaload
L410:   ldc 16316671
L412:   iand
L413:   iastore
L414:   aload_1
L415:   iload 4
L417:   iaload
L418:   istore 5
L420:   iload 5
L422:   ifne L431
L425:   getstatic Field OPPOFIOL O [Z
L428:   iload_0
L429:   iconst_1
L430:   bastore
L431:   aload_1
L432:   sipush 16384
L435:   iload 4
L437:   iadd
L438:   iload 5
L440:   iload 5
L442:   iconst_3
L443:   iushr
L444:   isub
L445:   ldc 16316671
L447:   iand
L448:   iastore
L449:   aload_1
L450:   ldc 32768
L452:   iload 4
L454:   iadd
L455:   iload 5
L457:   iload 5
L459:   iconst_2
L460:   iushr
L461:   isub
L462:   ldc 16316671
L464:   iand
L465:   iastore
L466:   aload_1
L467:   ldc 49152
L469:   iload 4
L471:   iadd
L472:   iload 5
L474:   iload 5
L476:   iconst_2
L477:   iushr
L478:   isub
L479:   iload 5
L481:   iconst_3
L482:   iushr
L483:   isub
L484:   ldc 16316671
L486:   iand
L487:   iastore
L488:   iinc 4 1
L491:   iload 4
L493:   sipush 16384
L496:   if_icmplt L405
L499:   aload_1
L500:   areturn
L501:   
    .end code
.end method

.method public static final a : (DB)V
    .code stack 9 locals 29
L0:     getstatic Field XHHRODPC l Z
L3:     istore 28
        .catch java/lang/RuntimeException from L5 to L731 using L732
L5:     iload_2
L6:     bipush 9
L8:     if_icmpeq L25
L11:    iconst_1
L12:    istore_3
L13:    iload 28
L15:    ifeq L21
L18:    iinc 3 1
L21:    iload_3
L22:    ifgt L18
L25:    dload_0
L26:    invokestatic Method java/lang/Math random ()D
L29:    ldc2_w 3e-2
L32:    dmul
L33:    ldc2_w 1.5e-2
L36:    dsub
L37:    dadd
L38:    dstore_0
L39:    iconst_0
L40:    istore_3
L41:    iconst_0
L42:    istore 4
L44:    iload 28
L46:    ifeq L581
L49:    iload 4
L51:    bipush 8
L53:    idiv
L54:    i2d
L55:    ldc2_w 6.4e1
L58:    ddiv
L59:    ldc2_w 7.8125e-3
L62:    dadd
L63:    dstore 5
L65:    iload 4
L67:    bipush 7
L69:    iand
L70:    i2d
L71:    ldc2_w 8e0
L74:    ddiv
L75:    ldc2_w 6.25e-2
L78:    dadd
L79:    dstore 7
L81:    iconst_0
L82:    istore 9
L84:    iload 28
L86:    ifeq L570
L89:    iload 9
L91:    i2d
L92:    ldc2_w 1.28e2
L95:    ddiv
L96:    dstore 10
L98:    dload 10
L100:   dstore 12
L102:   dload 10
L104:   dstore 14
L106:   dload 10
L108:   dstore 16
L110:   dload 7
L112:   dconst_0
L113:   dcmpl
L114:   ifeq L498
L117:   dload 10
L119:   ldc2_w 5e-1
L122:   dcmpg
L123:   ifge L140
L126:   dload 10
L128:   dconst_1
L129:   dload 7
L131:   dadd
L132:   dmul
L133:   dstore 18
L135:   iload 28
L137:   ifeq L153
L140:   dload 10
L142:   dload 7
L144:   dadd
L145:   dload 10
L147:   dload 7
L149:   dmul
L150:   dsub
L151:   dstore 18
L153:   ldc2_w 2e0
L156:   dload 10
L158:   dmul
L159:   dload 18
L161:   dsub
L162:   dstore 20
L164:   dload 5
L166:   ldc2_w 3.333333333333333e-1
L169:   dadd
L170:   dstore 22
L172:   dload 22
L174:   dconst_1
L175:   dcmpl
L176:   ifle L185
L179:   dload 22
L181:   dconst_1
L182:   dsub
L183:   dstore 22
L185:   dload 5
L187:   dstore 24
L189:   dload 5
L191:   ldc2_w 3.333333333333333e-1
L194:   dsub
L195:   dstore 26
L197:   dload 26
L199:   dconst_0
L200:   dcmpg
L201:   ifge L210
L204:   dload 26
L206:   dconst_1
L207:   dadd
L208:   dstore 26
L210:   ldc2_w 6e0
L213:   dload 22
L215:   dmul
L216:   dconst_1
L217:   dcmpg
L218:   ifge L243
L221:   dload 20
L223:   dload 18
L225:   dload 20
L227:   dsub
L228:   ldc2_w 6e0
L231:   dmul
L232:   dload 22
L234:   dmul
L235:   dadd
L236:   dstore 12
L238:   iload 28
L240:   ifeq L306
L243:   ldc2_w 2e0
L246:   dload 22
L248:   dmul
L249:   dconst_1
L250:   dcmpg
L251:   ifge L263
L254:   dload 18
L256:   dstore 12
L258:   iload 28
L260:   ifeq L306
L263:   ldc2_w 3e0
L266:   dload 22
L268:   dmul
L269:   ldc2_w 2e0
L272:   dcmpg
L273:   ifge L302
L276:   dload 20
L278:   dload 18
L280:   dload 20
L282:   dsub
L283:   ldc2_w 6.666666666666666e-1
L286:   dload 22
L288:   dsub
L289:   dmul
L290:   ldc2_w 6e0
L293:   dmul
L294:   dadd
L295:   dstore 12
L297:   iload 28
L299:   ifeq L306
L302:   dload 20
L304:   dstore 12
L306:   ldc2_w 6e0
L309:   dload 24
L311:   dmul
L312:   dconst_1
L313:   dcmpg
L314:   ifge L339
L317:   dload 20
L319:   dload 18
L321:   dload 20
L323:   dsub
L324:   ldc2_w 6e0
L327:   dmul
L328:   dload 24
L330:   dmul
L331:   dadd
L332:   dstore 14
L334:   iload 28
L336:   ifeq L402
L339:   ldc2_w 2e0
L342:   dload 24
L344:   dmul
L345:   dconst_1
L346:   dcmpg
L347:   ifge L359
L350:   dload 18
L352:   dstore 14
L354:   iload 28
L356:   ifeq L402
L359:   ldc2_w 3e0
L362:   dload 24
L364:   dmul
L365:   ldc2_w 2e0
L368:   dcmpg
L369:   ifge L398
L372:   dload 20
L374:   dload 18
L376:   dload 20
L378:   dsub
L379:   ldc2_w 6.666666666666666e-1
L382:   dload 24
L384:   dsub
L385:   dmul
L386:   ldc2_w 6e0
L389:   dmul
L390:   dadd
L391:   dstore 14
L393:   iload 28
L395:   ifeq L402
L398:   dload 20
L400:   dstore 14
L402:   ldc2_w 6e0
L405:   dload 26
L407:   dmul
L408:   dconst_1
L409:   dcmpg
L410:   ifge L435
L413:   dload 20
L415:   dload 18
L417:   dload 20
L419:   dsub
L420:   ldc2_w 6e0
L423:   dmul
L424:   dload 26
L426:   dmul
L427:   dadd
L428:   dstore 16
L430:   iload 28
L432:   ifeq L498
L435:   ldc2_w 2e0
L438:   dload 26
L440:   dmul
L441:   dconst_1
L442:   dcmpg
L443:   ifge L455
L446:   dload 18
L448:   dstore 16
L450:   iload 28
L452:   ifeq L498
L455:   ldc2_w 3e0
L458:   dload 26
L460:   dmul
L461:   ldc2_w 2e0
L464:   dcmpg
L465:   ifge L494
L468:   dload 20
L470:   dload 18
L472:   dload 20
L474:   dsub
L475:   ldc2_w 6.666666666666666e-1
L478:   dload 26
L480:   dsub
L481:   dmul
L482:   ldc2_w 6e0
L485:   dmul
L486:   dadd
L487:   dstore 16
L489:   iload 28
L491:   ifeq L498
L494:   dload 20
L496:   dstore 16
L498:   dload 12
L500:   ldc2_w 2.56e2
L503:   dmul
L504:   d2i
L505:   istore 18
L507:   dload 14
L509:   ldc2_w 2.56e2
L512:   dmul
L513:   d2i
L514:   istore 19
L516:   dload 16
L518:   ldc2_w 2.56e2
L521:   dmul
L522:   d2i
L523:   istore 20
L525:   iload 18
L527:   bipush 16
L529:   ishl
L530:   iload 19
L532:   bipush 8
L534:   ishl
L535:   iadd
L536:   iload 20
L538:   iadd
L539:   istore 21
L541:   iload 21
L543:   dload_0
L544:   invokestatic Method OPPOFIOL a (ID)I
L547:   istore 21
L549:   iload 21
L551:   ifne L557
L554:   iconst_1
L555:   istore 21
L557:   getstatic Field OPPOFIOL V [I
L560:   iload_3
L561:   iinc 3 1
L564:   iload 21
L566:   iastore
L567:   iinc 9 1
L570:   iload 9
L572:   sipush 128
L575:   if_icmplt L89
L578:   iinc 4 1
L581:   iload 4
L583:   sipush 512
L586:   if_icmplt L49
L589:   iconst_0
L590:   istore 5
L592:   iload 28
L594:   ifeq L698
L597:   getstatic Field OPPOFIOL N [LDSMJIEPN;
L600:   iload 5
L602:   aaload
L603:   ifnull L695
L606:   getstatic Field OPPOFIOL N [LDSMJIEPN;
L609:   iload 5
L611:   aaload
L612:   getfield Field DSMJIEPN C [I
L615:   astore 6
L617:   getstatic Field OPPOFIOL W [[I
L620:   iload 5
L622:   aload 6
L624:   arraylength
L625:   newarray int
L627:   aastore
L628:   iconst_0
L629:   istore 7
L631:   iload 28
L633:   ifeq L687
L636:   getstatic Field OPPOFIOL W [[I
L639:   iload 5
L641:   aaload
L642:   iload 7
L644:   aload 6
L646:   iload 7
L648:   iaload
L649:   dload_0
L650:   invokestatic Method OPPOFIOL a (ID)I
L653:   iastore
L654:   getstatic Field OPPOFIOL W [[I
L657:   iload 5
L659:   aaload
L660:   iload 7
L662:   iaload
L663:   ldc 16316671
L665:   iand
L666:   ifne L684
L669:   iload 7
L671:   ifeq L684
L674:   getstatic Field OPPOFIOL W [[I
L677:   iload 5
L679:   aaload
L680:   iload 7
L682:   iconst_1
L683:   iastore
L684:   iinc 7 1
L687:   iload 7
L689:   aload 6
L691:   arraylength
L692:   if_icmplt L636
L695:   iinc 5 1
L698:   iload 5
L700:   bipush 50
L702:   if_icmplt L597
L705:   iconst_0
L706:   istore 6
L708:   iload 28
L710:   ifeq L724
L713:   iload 6
L715:   sipush -477
L718:   invokestatic Method OPPOFIOL b (II)V
L721:   iinc 6 1
L724:   iload 6
L726:   bipush 50
L728:   if_icmplt L713
L731:   return
L732:   astore_3
L733:   new java/lang/StringBuffer
L736:   dup
L737:   ldc "71578, "
L739:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L742:   dload_0
L743:   invokevirtual Method java/lang/StringBuffer append (D)Ljava/lang/StringBuffer;
L746:   ldc ", "
L748:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L751:   iload_2
L752:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L755:   ldc ", "
L757:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L760:   aload_3
L761:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L764:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L767:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L770:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L773:   new java/lang/RuntimeException
L776:   dup
L777:   invokespecial Method java/lang/RuntimeException <init> ()V
L780:   athrow
L781:   
    .end code
.end method

.method public static a : (ID)I
    .code stack 4 locals 12
L0:     iload_0
L1:     bipush 16
L3:     ishr
L4:     i2d
L5:     ldc2_w 2.56e2
L8:     ddiv
L9:     dstore_3
L10:    iload_0
L11:    bipush 8
L13:    ishr
L14:    sipush 255
L17:    iand
L18:    i2d
L19:    ldc2_w 2.56e2
L22:    ddiv
L23:    dstore 5
L25:    iload_0
L26:    sipush 255
L29:    iand
L30:    i2d
L31:    ldc2_w 2.56e2
L34:    ddiv
L35:    dstore 7
L37:    dload_3
L38:    dload_1
L39:    invokestatic Method java/lang/Math pow (DD)D
L42:    dstore_3
L43:    dload 5
L45:    dload_1
L46:    invokestatic Method java/lang/Math pow (DD)D
L49:    dstore 5
L51:    dload 7
L53:    dload_1
L54:    invokestatic Method java/lang/Math pow (DD)D
L57:    dstore 7
L59:    dload_3
L60:    ldc2_w 2.56e2
L63:    dmul
L64:    d2i
L65:    istore 9
L67:    dload 5
L69:    ldc2_w 2.56e2
L72:    dmul
L73:    d2i
L74:    istore 10
L76:    dload 7
L78:    ldc2_w 2.56e2
L81:    dmul
L82:    d2i
L83:    istore 11
L85:    iload 9
L87:    bipush 16
L89:    ishl
L90:    iload 10
L92:    bipush 8
L94:    ishl
L95:    iadd
L96:    iload 11
L98:    iadd
L99:    ireturn
L100:   
    .end code
.end method

.method public static final a : (IIIIIIIII)V
    .code stack 10 locals 16
L0:     getstatic Field XHHRODPC l Z
L3:     istore 15
L5:     iconst_0
L6:     istore 9
L8:     iconst_0
L9:     istore 10
L11:    iload_1
L12:    iload_0
L13:    if_icmpeq L43
L16:    iload 4
L18:    iload_3
L19:    isub
L20:    bipush 16
L22:    ishl
L23:    iload_1
L24:    iload_0
L25:    isub
L26:    idiv
L27:    istore 9
L29:    iload 7
L31:    iload 6
L33:    isub
L34:    bipush 15
L36:    ishl
L37:    iload_1
L38:    iload_0
L39:    isub
L40:    idiv
L41:    istore 10
L43:    iconst_0
L44:    istore 11
L46:    iconst_0
L47:    istore 12
L49:    iload_2
L50:    iload_1
L51:    if_icmpeq L82
L54:    iload 5
L56:    iload 4
L58:    isub
L59:    bipush 16
L61:    ishl
L62:    iload_2
L63:    iload_1
L64:    isub
L65:    idiv
L66:    istore 11
L68:    iload 8
L70:    iload 7
L72:    isub
L73:    bipush 15
L75:    ishl
L76:    iload_2
L77:    iload_1
L78:    isub
L79:    idiv
L80:    istore 12
L82:    iconst_0
L83:    istore 13
L85:    iconst_0
L86:    istore 14
L88:    iload_2
L89:    iload_0
L90:    if_icmpeq L120
L93:    iload_3
L94:    iload 5
L96:    isub
L97:    bipush 16
L99:    ishl
L100:   iload_0
L101:   iload_2
L102:   isub
L103:   idiv
L104:   istore 13
L106:   iload 6
L108:   iload 8
L110:   isub
L111:   bipush 15
L113:   ishl
L114:   iload_0
L115:   iload_2
L116:   isub
L117:   idiv
L118:   istore 14
L120:   iload_0
L121:   iload_1
L122:   if_icmpgt L1047
L125:   iload_0
L126:   iload_2
L127:   if_icmpgt L1047
L130:   iload_0
L131:   getstatic Field AFCKELYG q I
L134:   if_icmplt L138
L137:   return
L138:   iload_1
L139:   getstatic Field AFCKELYG q I
L142:   if_icmple L149
L145:   getstatic Field AFCKELYG q I
L148:   istore_1
L149:   iload_2
L150:   getstatic Field AFCKELYG q I
L153:   if_icmple L160
L156:   getstatic Field AFCKELYG q I
L159:   istore_2
L160:   iload_1
L161:   iload_2
L162:   if_icmpge L609
L165:   iload_3
L166:   bipush 16
L168:   ishl
L169:   dup
L170:   istore_3
L171:   istore 5
L173:   iload 6
L175:   bipush 15
L177:   ishl
L178:   dup
L179:   istore 6
L181:   istore 8
L183:   iload_0
L184:   ifge L223
L187:   iload 5
L189:   iload 13
L191:   iload_0
L192:   imul
L193:   isub
L194:   istore 5
L196:   iload_3
L197:   iload 9
L199:   iload_0
L200:   imul
L201:   isub
L202:   istore_3
L203:   iload 8
L205:   iload 14
L207:   iload_0
L208:   imul
L209:   isub
L210:   istore 8
L212:   iload 6
L214:   iload 10
L216:   iload_0
L217:   imul
L218:   isub
L219:   istore 6
L221:   iconst_0
L222:   istore_0
L223:   iload 4
L225:   bipush 16
L227:   ishl
L228:   istore 4
L230:   iload 7
L232:   bipush 15
L234:   ishl
L235:   istore 7
L237:   iload_1
L238:   ifge L261
L241:   iload 4
L243:   iload 11
L245:   iload_1
L246:   imul
L247:   isub
L248:   istore 4
L250:   iload 7
L252:   iload 12
L254:   iload_1
L255:   imul
L256:   isub
L257:   istore 7
L259:   iconst_0
L260:   istore_1
L261:   iload_0
L262:   iload_1
L263:   if_icmpeq L273
L266:   iload 13
L268:   iload 9
L270:   if_icmplt L285
L273:   iload_0
L274:   iload_1
L275:   if_icmpne L447
L278:   iload 13
L280:   iload 11
L282:   if_icmple L447
L285:   iload_2
L286:   iload_1
L287:   isub
L288:   istore_2
L289:   iload_1
L290:   iload_0
L291:   isub
L292:   istore_1
L293:   getstatic Field OPPOFIOL L [I
L296:   iload_0
L297:   iaload
L298:   istore_0
L299:   iload 15
L301:   ifeq L364
L304:   getstatic Field AFCKELYG m [I
L307:   iload_0
L308:   iconst_0
L309:   iconst_0
L310:   iload 5
L312:   bipush 16
L314:   ishr
L315:   iload_3
L316:   bipush 16
L318:   ishr
L319:   iload 8
L321:   bipush 7
L323:   ishr
L324:   iload 6
L326:   bipush 7
L328:   ishr
L329:   invokestatic Method OPPOFIOL a ([IIIIIIII)V
L332:   iload 5
L334:   iload 13
L336:   iadd
L337:   istore 5
L339:   iload_3
L340:   iload 9
L342:   iadd
L343:   istore_3
L344:   iload 8
L346:   iload 14
L348:   iadd
L349:   istore 8
L351:   iload 6
L353:   iload 10
L355:   iadd
L356:   istore 6
L358:   iload_0
L359:   getstatic Field AFCKELYG n I
L362:   iadd
L363:   istore_0
L364:   iinc 1 -1
L367:   iload_1
L368:   ifge L304
L371:   iload 15
L373:   ifeq L439
L376:   getstatic Field AFCKELYG m [I
L379:   iload_0
L380:   iconst_0
L381:   iconst_0
L382:   iload 5
L384:   bipush 16
L386:   ishr
L387:   iload 4
L389:   bipush 16
L391:   ishr
L392:   iload 8
L394:   bipush 7
L396:   ishr
L397:   iload 7
L399:   bipush 7
L401:   ishr
L402:   invokestatic Method OPPOFIOL a ([IIIIIIII)V
L405:   iload 5
L407:   iload 13
L409:   iadd
L410:   istore 5
L412:   iload 4
L414:   iload 11
L416:   iadd
L417:   istore 4
L419:   iload 8
L421:   iload 14
L423:   iadd
L424:   istore 8
L426:   iload 7
L428:   iload 12
L430:   iadd
L431:   istore 7
L433:   iload_0
L434:   getstatic Field AFCKELYG n I
L437:   iadd
L438:   istore_0
L439:   iinc 2 -1
L442:   iload_2
L443:   ifge L376
L446:   return
L447:   iload_2
L448:   iload_1
L449:   isub
L450:   istore_2
L451:   iload_1
L452:   iload_0
L453:   isub
L454:   istore_1
L455:   getstatic Field OPPOFIOL L [I
L458:   iload_0
L459:   iaload
L460:   istore_0
L461:   iload 15
L463:   ifeq L526
L466:   getstatic Field AFCKELYG m [I
L469:   iload_0
L470:   iconst_0
L471:   iconst_0
L472:   iload_3
L473:   bipush 16
L475:   ishr
L476:   iload 5
L478:   bipush 16
L480:   ishr
L481:   iload 6
L483:   bipush 7
L485:   ishr
L486:   iload 8
L488:   bipush 7
L490:   ishr
L491:   invokestatic Method OPPOFIOL a ([IIIIIIII)V
L494:   iload 5
L496:   iload 13
L498:   iadd
L499:   istore 5
L501:   iload_3
L502:   iload 9
L504:   iadd
L505:   istore_3
L506:   iload 8
L508:   iload 14
L510:   iadd
L511:   istore 8
L513:   iload 6
L515:   iload 10
L517:   iadd
L518:   istore 6
L520:   iload_0
L521:   getstatic Field AFCKELYG n I
L524:   iadd
L525:   istore_0
L526:   iinc 1 -1
L529:   iload_1
L530:   ifge L466
L533:   iload 15
L535:   ifeq L601
L538:   getstatic Field AFCKELYG m [I
L541:   iload_0
L542:   iconst_0
L543:   iconst_0
L544:   iload 4
L546:   bipush 16
L548:   ishr
L549:   iload 5
L551:   bipush 16
L553:   ishr
L554:   iload 7
L556:   bipush 7
L558:   ishr
L559:   iload 8
L561:   bipush 7
L563:   ishr
L564:   invokestatic Method OPPOFIOL a ([IIIIIIII)V
L567:   iload 5
L569:   iload 13
L571:   iadd
L572:   istore 5
L574:   iload 4
L576:   iload 11
L578:   iadd
L579:   istore 4
L581:   iload 8
L583:   iload 14
L585:   iadd
L586:   istore 8
L588:   iload 7
L590:   iload 12
L592:   iadd
L593:   istore 7
L595:   iload_0
L596:   getstatic Field AFCKELYG n I
L599:   iadd
L600:   istore_0
L601:   iinc 2 -1
L604:   iload_2
L605:   ifge L538
L608:   return
L609:   iload_3
L610:   bipush 16
L612:   ishl
L613:   dup
L614:   istore_3
L615:   istore 4
L617:   iload 6
L619:   bipush 15
L621:   ishl
L622:   dup
L623:   istore 6
L625:   istore 7
L627:   iload_0
L628:   ifge L667
L631:   iload 4
L633:   iload 13
L635:   iload_0
L636:   imul
L637:   isub
L638:   istore 4
L640:   iload_3
L641:   iload 9
L643:   iload_0
L644:   imul
L645:   isub
L646:   istore_3
L647:   iload 7
L649:   iload 14
L651:   iload_0
L652:   imul
L653:   isub
L654:   istore 7
L656:   iload 6
L658:   iload 10
L660:   iload_0
L661:   imul
L662:   isub
L663:   istore 6
L665:   iconst_0
L666:   istore_0
L667:   iload 5
L669:   bipush 16
L671:   ishl
L672:   istore 5
L674:   iload 8
L676:   bipush 15
L678:   ishl
L679:   istore 8
L681:   iload_2
L682:   ifge L705
L685:   iload 5
L687:   iload 11
L689:   iload_2
L690:   imul
L691:   isub
L692:   istore 5
L694:   iload 8
L696:   iload 12
L698:   iload_2
L699:   imul
L700:   isub
L701:   istore 8
L703:   iconst_0
L704:   istore_2
L705:   iload_0
L706:   iload_2
L707:   if_icmpeq L717
L710:   iload 13
L712:   iload 9
L714:   if_icmplt L729
L717:   iload_0
L718:   iload_2
L719:   if_icmpne L888
L722:   iload 11
L724:   iload 9
L726:   if_icmple L888
L729:   iload_1
L730:   iload_2
L731:   isub
L732:   istore_1
L733:   iload_2
L734:   iload_0
L735:   isub
L736:   istore_2
L737:   getstatic Field OPPOFIOL L [I
L740:   iload_0
L741:   iaload
L742:   istore_0
L743:   iload 15
L745:   ifeq L808
L748:   getstatic Field AFCKELYG m [I
L751:   iload_0
L752:   iconst_0
L753:   iconst_0
L754:   iload 4
L756:   bipush 16
L758:   ishr
L759:   iload_3
L760:   bipush 16
L762:   ishr
L763:   iload 7
L765:   bipush 7
L767:   ishr
L768:   iload 6
L770:   bipush 7
L772:   ishr
L773:   invokestatic Method OPPOFIOL a ([IIIIIIII)V
L776:   iload 4
L778:   iload 13
L780:   iadd
L781:   istore 4
L783:   iload_3
L784:   iload 9
L786:   iadd
L787:   istore_3
L788:   iload 7
L790:   iload 14
L792:   iadd
L793:   istore 7
L795:   iload 6
L797:   iload 10
L799:   iadd
L800:   istore 6
L802:   iload_0
L803:   getstatic Field AFCKELYG n I
L806:   iadd
L807:   istore_0
L808:   iinc 2 -1
L811:   iload_2
L812:   ifge L748
L815:   iload 15
L817:   ifeq L880
L820:   getstatic Field AFCKELYG m [I
L823:   iload_0
L824:   iconst_0
L825:   iconst_0
L826:   iload 5
L828:   bipush 16
L830:   ishr
L831:   iload_3
L832:   bipush 16
L834:   ishr
L835:   iload 8
L837:   bipush 7
L839:   ishr
L840:   iload 6
L842:   bipush 7
L844:   ishr
L845:   invokestatic Method OPPOFIOL a ([IIIIIIII)V
L848:   iload 5
L850:   iload 11
L852:   iadd
L853:   istore 5
L855:   iload_3
L856:   iload 9
L858:   iadd
L859:   istore_3
L860:   iload 8
L862:   iload 12
L864:   iadd
L865:   istore 8
L867:   iload 6
L869:   iload 10
L871:   iadd
L872:   istore 6
L874:   iload_0
L875:   getstatic Field AFCKELYG n I
L878:   iadd
L879:   istore_0
L880:   iinc 1 -1
L883:   iload_1
L884:   ifge L820
L887:   return
L888:   iload_1
L889:   iload_2
L890:   isub
L891:   istore_1
L892:   iload_2
L893:   iload_0
L894:   isub
L895:   istore_2
L896:   getstatic Field OPPOFIOL L [I
L899:   iload_0
L900:   iaload
L901:   istore_0
L902:   iload 15
L904:   ifeq L967
L907:   getstatic Field AFCKELYG m [I
L910:   iload_0
L911:   iconst_0
L912:   iconst_0
L913:   iload_3
L914:   bipush 16
L916:   ishr
L917:   iload 4
L919:   bipush 16
L921:   ishr
L922:   iload 6
L924:   bipush 7
L926:   ishr
L927:   iload 7
L929:   bipush 7
L931:   ishr
L932:   invokestatic Method OPPOFIOL a ([IIIIIIII)V
L935:   iload 4
L937:   iload 13
L939:   iadd
L940:   istore 4
L942:   iload_3
L943:   iload 9
L945:   iadd
L946:   istore_3
L947:   iload 7
L949:   iload 14
L951:   iadd
L952:   istore 7
L954:   iload 6
L956:   iload 10
L958:   iadd
L959:   istore 6
L961:   iload_0
L962:   getstatic Field AFCKELYG n I
L965:   iadd
L966:   istore_0
L967:   iinc 2 -1
L970:   iload_2
L971:   ifge L907
L974:   iload 15
L976:   ifeq L1039
L979:   getstatic Field AFCKELYG m [I
L982:   iload_0
L983:   iconst_0
L984:   iconst_0
L985:   iload_3
L986:   bipush 16
L988:   ishr
L989:   iload 5
L991:   bipush 16
L993:   ishr
L994:   iload 6
L996:   bipush 7
L998:   ishr
L999:   iload 8
L1001:  bipush 7
L1003:  ishr
L1004:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L1007:  iload 5
L1009:  iload 11
L1011:  iadd
L1012:  istore 5
L1014:  iload_3
L1015:  iload 9
L1017:  iadd
L1018:  istore_3
L1019:  iload 8
L1021:  iload 12
L1023:  iadd
L1024:  istore 8
L1026:  iload 6
L1028:  iload 10
L1030:  iadd
L1031:  istore 6
L1033:  iload_0
L1034:  getstatic Field AFCKELYG n I
L1037:  iadd
L1038:  istore_0
L1039:  iinc 1 -1
L1042:  iload_1
L1043:  ifge L979
L1046:  return
L1047:  iload_1
L1048:  iload_2
L1049:  if_icmpgt L1953
L1052:  iload_1
L1053:  getstatic Field AFCKELYG q I
L1056:  if_icmplt L1060
L1059:  return
L1060:  iload_2
L1061:  getstatic Field AFCKELYG q I
L1064:  if_icmple L1071
L1067:  getstatic Field AFCKELYG q I
L1070:  istore_2
L1071:  iload_0
L1072:  getstatic Field AFCKELYG q I
L1075:  if_icmple L1082
L1078:  getstatic Field AFCKELYG q I
L1081:  istore_0
L1082:  iload_2
L1083:  iload_0
L1084:  if_icmpge L1526
L1087:  iload 4
L1089:  bipush 16
L1091:  ishl
L1092:  dup
L1093:  istore 4
L1095:  istore_3
L1096:  iload 7
L1098:  bipush 15
L1100:  ishl
L1101:  dup
L1102:  istore 7
L1104:  istore 6
L1106:  iload_1
L1107:  ifge L1146
L1110:  iload_3
L1111:  iload 9
L1113:  iload_1
L1114:  imul
L1115:  isub
L1116:  istore_3
L1117:  iload 4
L1119:  iload 11
L1121:  iload_1
L1122:  imul
L1123:  isub
L1124:  istore 4
L1126:  iload 6
L1128:  iload 10
L1130:  iload_1
L1131:  imul
L1132:  isub
L1133:  istore 6
L1135:  iload 7
L1137:  iload 12
L1139:  iload_1
L1140:  imul
L1141:  isub
L1142:  istore 7
L1144:  iconst_0
L1145:  istore_1
L1146:  iload 5
L1148:  bipush 16
L1150:  ishl
L1151:  istore 5
L1153:  iload 8
L1155:  bipush 15
L1157:  ishl
L1158:  istore 8
L1160:  iload_2
L1161:  ifge L1184
L1164:  iload 5
L1166:  iload 13
L1168:  iload_2
L1169:  imul
L1170:  isub
L1171:  istore 5
L1173:  iload 8
L1175:  iload 14
L1177:  iload_2
L1178:  imul
L1179:  isub
L1180:  istore 8
L1182:  iconst_0
L1183:  istore_2
L1184:  iload_1
L1185:  iload_2
L1186:  if_icmpeq L1196
L1189:  iload 9
L1191:  iload 11
L1193:  if_icmplt L1208
L1196:  iload_1
L1197:  iload_2
L1198:  if_icmpne L1367
L1201:  iload 9
L1203:  iload 13
L1205:  if_icmple L1367
L1208:  iload_0
L1209:  iload_2
L1210:  isub
L1211:  istore_0
L1212:  iload_2
L1213:  iload_1
L1214:  isub
L1215:  istore_2
L1216:  getstatic Field OPPOFIOL L [I
L1219:  iload_1
L1220:  iaload
L1221:  istore_1
L1222:  iload 15
L1224:  ifeq L1287
L1227:  getstatic Field AFCKELYG m [I
L1230:  iload_1
L1231:  iconst_0
L1232:  iconst_0
L1233:  iload_3
L1234:  bipush 16
L1236:  ishr
L1237:  iload 4
L1239:  bipush 16
L1241:  ishr
L1242:  iload 6
L1244:  bipush 7
L1246:  ishr
L1247:  iload 7
L1249:  bipush 7
L1251:  ishr
L1252:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L1255:  iload_3
L1256:  iload 9
L1258:  iadd
L1259:  istore_3
L1260:  iload 4
L1262:  iload 11
L1264:  iadd
L1265:  istore 4
L1267:  iload 6
L1269:  iload 10
L1271:  iadd
L1272:  istore 6
L1274:  iload 7
L1276:  iload 12
L1278:  iadd
L1279:  istore 7
L1281:  iload_1
L1282:  getstatic Field AFCKELYG n I
L1285:  iadd
L1286:  istore_1
L1287:  iinc 2 -1
L1290:  iload_2
L1291:  ifge L1227
L1294:  iload 15
L1296:  ifeq L1359
L1299:  getstatic Field AFCKELYG m [I
L1302:  iload_1
L1303:  iconst_0
L1304:  iconst_0
L1305:  iload_3
L1306:  bipush 16
L1308:  ishr
L1309:  iload 5
L1311:  bipush 16
L1313:  ishr
L1314:  iload 6
L1316:  bipush 7
L1318:  ishr
L1319:  iload 8
L1321:  bipush 7
L1323:  ishr
L1324:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L1327:  iload_3
L1328:  iload 9
L1330:  iadd
L1331:  istore_3
L1332:  iload 5
L1334:  iload 13
L1336:  iadd
L1337:  istore 5
L1339:  iload 6
L1341:  iload 10
L1343:  iadd
L1344:  istore 6
L1346:  iload 8
L1348:  iload 14
L1350:  iadd
L1351:  istore 8
L1353:  iload_1
L1354:  getstatic Field AFCKELYG n I
L1357:  iadd
L1358:  istore_1
L1359:  iinc 0 -1
L1362:  iload_0
L1363:  ifge L1299
L1366:  return
L1367:  iload_0
L1368:  iload_2
L1369:  isub
L1370:  istore_0
L1371:  iload_2
L1372:  iload_1
L1373:  isub
L1374:  istore_2
L1375:  getstatic Field OPPOFIOL L [I
L1378:  iload_1
L1379:  iaload
L1380:  istore_1
L1381:  iload 15
L1383:  ifeq L1446
L1386:  getstatic Field AFCKELYG m [I
L1389:  iload_1
L1390:  iconst_0
L1391:  iconst_0
L1392:  iload 4
L1394:  bipush 16
L1396:  ishr
L1397:  iload_3
L1398:  bipush 16
L1400:  ishr
L1401:  iload 7
L1403:  bipush 7
L1405:  ishr
L1406:  iload 6
L1408:  bipush 7
L1410:  ishr
L1411:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L1414:  iload_3
L1415:  iload 9
L1417:  iadd
L1418:  istore_3
L1419:  iload 4
L1421:  iload 11
L1423:  iadd
L1424:  istore 4
L1426:  iload 6
L1428:  iload 10
L1430:  iadd
L1431:  istore 6
L1433:  iload 7
L1435:  iload 12
L1437:  iadd
L1438:  istore 7
L1440:  iload_1
L1441:  getstatic Field AFCKELYG n I
L1444:  iadd
L1445:  istore_1
L1446:  iinc 2 -1
L1449:  iload_2
L1450:  ifge L1386
L1453:  iload 15
L1455:  ifeq L1518
L1458:  getstatic Field AFCKELYG m [I
L1461:  iload_1
L1462:  iconst_0
L1463:  iconst_0
L1464:  iload 5
L1466:  bipush 16
L1468:  ishr
L1469:  iload_3
L1470:  bipush 16
L1472:  ishr
L1473:  iload 8
L1475:  bipush 7
L1477:  ishr
L1478:  iload 6
L1480:  bipush 7
L1482:  ishr
L1483:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L1486:  iload_3
L1487:  iload 9
L1489:  iadd
L1490:  istore_3
L1491:  iload 5
L1493:  iload 13
L1495:  iadd
L1496:  istore 5
L1498:  iload 6
L1500:  iload 10
L1502:  iadd
L1503:  istore 6
L1505:  iload 8
L1507:  iload 14
L1509:  iadd
L1510:  istore 8
L1512:  iload_1
L1513:  getstatic Field AFCKELYG n I
L1516:  iadd
L1517:  istore_1
L1518:  iinc 0 -1
L1521:  iload_0
L1522:  ifge L1458
L1525:  return
L1526:  iload 4
L1528:  bipush 16
L1530:  ishl
L1531:  dup
L1532:  istore 4
L1534:  istore 5
L1536:  iload 7
L1538:  bipush 15
L1540:  ishl
L1541:  dup
L1542:  istore 7
L1544:  istore 8
L1546:  iload_1
L1547:  ifge L1588
L1550:  iload 5
L1552:  iload 9
L1554:  iload_1
L1555:  imul
L1556:  isub
L1557:  istore 5
L1559:  iload 4
L1561:  iload 11
L1563:  iload_1
L1564:  imul
L1565:  isub
L1566:  istore 4
L1568:  iload 8
L1570:  iload 10
L1572:  iload_1
L1573:  imul
L1574:  isub
L1575:  istore 8
L1577:  iload 7
L1579:  iload 12
L1581:  iload_1
L1582:  imul
L1583:  isub
L1584:  istore 7
L1586:  iconst_0
L1587:  istore_1
L1588:  iload_3
L1589:  bipush 16
L1591:  ishl
L1592:  istore_3
L1593:  iload 6
L1595:  bipush 15
L1597:  ishl
L1598:  istore 6
L1600:  iload_0
L1601:  ifge L1622
L1604:  iload_3
L1605:  iload 13
L1607:  iload_0
L1608:  imul
L1609:  isub
L1610:  istore_3
L1611:  iload 6
L1613:  iload 14
L1615:  iload_0
L1616:  imul
L1617:  isub
L1618:  istore 6
L1620:  iconst_0
L1621:  istore_0
L1622:  iload 9
L1624:  iload 11
L1626:  if_icmpge L1791
L1629:  iload_2
L1630:  iload_0
L1631:  isub
L1632:  istore_2
L1633:  iload_0
L1634:  iload_1
L1635:  isub
L1636:  istore_0
L1637:  getstatic Field OPPOFIOL L [I
L1640:  iload_1
L1641:  iaload
L1642:  istore_1
L1643:  iload 15
L1645:  ifeq L1711
L1648:  getstatic Field AFCKELYG m [I
L1651:  iload_1
L1652:  iconst_0
L1653:  iconst_0
L1654:  iload 5
L1656:  bipush 16
L1658:  ishr
L1659:  iload 4
L1661:  bipush 16
L1663:  ishr
L1664:  iload 8
L1666:  bipush 7
L1668:  ishr
L1669:  iload 7
L1671:  bipush 7
L1673:  ishr
L1674:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L1677:  iload 5
L1679:  iload 9
L1681:  iadd
L1682:  istore 5
L1684:  iload 4
L1686:  iload 11
L1688:  iadd
L1689:  istore 4
L1691:  iload 8
L1693:  iload 10
L1695:  iadd
L1696:  istore 8
L1698:  iload 7
L1700:  iload 12
L1702:  iadd
L1703:  istore 7
L1705:  iload_1
L1706:  getstatic Field AFCKELYG n I
L1709:  iadd
L1710:  istore_1
L1711:  iinc 0 -1
L1714:  iload_0
L1715:  ifge L1648
L1718:  iload 15
L1720:  ifeq L1783
L1723:  getstatic Field AFCKELYG m [I
L1726:  iload_1
L1727:  iconst_0
L1728:  iconst_0
L1729:  iload_3
L1730:  bipush 16
L1732:  ishr
L1733:  iload 4
L1735:  bipush 16
L1737:  ishr
L1738:  iload 6
L1740:  bipush 7
L1742:  ishr
L1743:  iload 7
L1745:  bipush 7
L1747:  ishr
L1748:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L1751:  iload_3
L1752:  iload 13
L1754:  iadd
L1755:  istore_3
L1756:  iload 4
L1758:  iload 11
L1760:  iadd
L1761:  istore 4
L1763:  iload 6
L1765:  iload 14
L1767:  iadd
L1768:  istore 6
L1770:  iload 7
L1772:  iload 12
L1774:  iadd
L1775:  istore 7
L1777:  iload_1
L1778:  getstatic Field AFCKELYG n I
L1781:  iadd
L1782:  istore_1
L1783:  iinc 2 -1
L1786:  iload_2
L1787:  ifge L1723
L1790:  return
L1791:  iload_2
L1792:  iload_0
L1793:  isub
L1794:  istore_2
L1795:  iload_0
L1796:  iload_1
L1797:  isub
L1798:  istore_0
L1799:  getstatic Field OPPOFIOL L [I
L1802:  iload_1
L1803:  iaload
L1804:  istore_1
L1805:  iload 15
L1807:  ifeq L1873
L1810:  getstatic Field AFCKELYG m [I
L1813:  iload_1
L1814:  iconst_0
L1815:  iconst_0
L1816:  iload 4
L1818:  bipush 16
L1820:  ishr
L1821:  iload 5
L1823:  bipush 16
L1825:  ishr
L1826:  iload 7
L1828:  bipush 7
L1830:  ishr
L1831:  iload 8
L1833:  bipush 7
L1835:  ishr
L1836:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L1839:  iload 5
L1841:  iload 9
L1843:  iadd
L1844:  istore 5
L1846:  iload 4
L1848:  iload 11
L1850:  iadd
L1851:  istore 4
L1853:  iload 8
L1855:  iload 10
L1857:  iadd
L1858:  istore 8
L1860:  iload 7
L1862:  iload 12
L1864:  iadd
L1865:  istore 7
L1867:  iload_1
L1868:  getstatic Field AFCKELYG n I
L1871:  iadd
L1872:  istore_1
L1873:  iinc 0 -1
L1876:  iload_0
L1877:  ifge L1810
L1880:  iload 15
L1882:  ifeq L1945
L1885:  getstatic Field AFCKELYG m [I
L1888:  iload_1
L1889:  iconst_0
L1890:  iconst_0
L1891:  iload 4
L1893:  bipush 16
L1895:  ishr
L1896:  iload_3
L1897:  bipush 16
L1899:  ishr
L1900:  iload 7
L1902:  bipush 7
L1904:  ishr
L1905:  iload 6
L1907:  bipush 7
L1909:  ishr
L1910:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L1913:  iload_3
L1914:  iload 13
L1916:  iadd
L1917:  istore_3
L1918:  iload 4
L1920:  iload 11
L1922:  iadd
L1923:  istore 4
L1925:  iload 6
L1927:  iload 14
L1929:  iadd
L1930:  istore 6
L1932:  iload 7
L1934:  iload 12
L1936:  iadd
L1937:  istore 7
L1939:  iload_1
L1940:  getstatic Field AFCKELYG n I
L1943:  iadd
L1944:  istore_1
L1945:  iinc 2 -1
L1948:  iload_2
L1949:  ifge L1885
L1952:  return
L1953:  iload_2
L1954:  getstatic Field AFCKELYG q I
L1957:  if_icmplt L1961
L1960:  return
L1961:  iload_0
L1962:  getstatic Field AFCKELYG q I
L1965:  if_icmple L1972
L1968:  getstatic Field AFCKELYG q I
L1971:  istore_0
L1972:  iload_1
L1973:  getstatic Field AFCKELYG q I
L1976:  if_icmple L1983
L1979:  getstatic Field AFCKELYG q I
L1982:  istore_1
L1983:  iload_0
L1984:  iload_1
L1985:  if_icmpge L2415
L1988:  iload 5
L1990:  bipush 16
L1992:  ishl
L1993:  dup
L1994:  istore 5
L1996:  istore 4
L1998:  iload 8
L2000:  bipush 15
L2002:  ishl
L2003:  dup
L2004:  istore 8
L2006:  istore 7
L2008:  iload_2
L2009:  ifge L2050
L2012:  iload 4
L2014:  iload 11
L2016:  iload_2
L2017:  imul
L2018:  isub
L2019:  istore 4
L2021:  iload 5
L2023:  iload 13
L2025:  iload_2
L2026:  imul
L2027:  isub
L2028:  istore 5
L2030:  iload 7
L2032:  iload 12
L2034:  iload_2
L2035:  imul
L2036:  isub
L2037:  istore 7
L2039:  iload 8
L2041:  iload 14
L2043:  iload_2
L2044:  imul
L2045:  isub
L2046:  istore 8
L2048:  iconst_0
L2049:  istore_2
L2050:  iload_3
L2051:  bipush 16
L2053:  ishl
L2054:  istore_3
L2055:  iload 6
L2057:  bipush 15
L2059:  ishl
L2060:  istore 6
L2062:  iload_0
L2063:  ifge L2084
L2066:  iload_3
L2067:  iload 9
L2069:  iload_0
L2070:  imul
L2071:  isub
L2072:  istore_3
L2073:  iload 6
L2075:  iload 10
L2077:  iload_0
L2078:  imul
L2079:  isub
L2080:  istore 6
L2082:  iconst_0
L2083:  istore_0
L2084:  iload 11
L2086:  iload 13
L2088:  if_icmpge L2253
L2091:  iload_1
L2092:  iload_0
L2093:  isub
L2094:  istore_1
L2095:  iload_0
L2096:  iload_2
L2097:  isub
L2098:  istore_0
L2099:  getstatic Field OPPOFIOL L [I
L2102:  iload_2
L2103:  iaload
L2104:  istore_2
L2105:  iload 15
L2107:  ifeq L2173
L2110:  getstatic Field AFCKELYG m [I
L2113:  iload_2
L2114:  iconst_0
L2115:  iconst_0
L2116:  iload 4
L2118:  bipush 16
L2120:  ishr
L2121:  iload 5
L2123:  bipush 16
L2125:  ishr
L2126:  iload 7
L2128:  bipush 7
L2130:  ishr
L2131:  iload 8
L2133:  bipush 7
L2135:  ishr
L2136:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L2139:  iload 4
L2141:  iload 11
L2143:  iadd
L2144:  istore 4
L2146:  iload 5
L2148:  iload 13
L2150:  iadd
L2151:  istore 5
L2153:  iload 7
L2155:  iload 12
L2157:  iadd
L2158:  istore 7
L2160:  iload 8
L2162:  iload 14
L2164:  iadd
L2165:  istore 8
L2167:  iload_2
L2168:  getstatic Field AFCKELYG n I
L2171:  iadd
L2172:  istore_2
L2173:  iinc 0 -1
L2176:  iload_0
L2177:  ifge L2110
L2180:  iload 15
L2182:  ifeq L2245
L2185:  getstatic Field AFCKELYG m [I
L2188:  iload_2
L2189:  iconst_0
L2190:  iconst_0
L2191:  iload 4
L2193:  bipush 16
L2195:  ishr
L2196:  iload_3
L2197:  bipush 16
L2199:  ishr
L2200:  iload 7
L2202:  bipush 7
L2204:  ishr
L2205:  iload 6
L2207:  bipush 7
L2209:  ishr
L2210:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L2213:  iload 4
L2215:  iload 11
L2217:  iadd
L2218:  istore 4
L2220:  iload_3
L2221:  iload 9
L2223:  iadd
L2224:  istore_3
L2225:  iload 7
L2227:  iload 12
L2229:  iadd
L2230:  istore 7
L2232:  iload 6
L2234:  iload 10
L2236:  iadd
L2237:  istore 6
L2239:  iload_2
L2240:  getstatic Field AFCKELYG n I
L2243:  iadd
L2244:  istore_2
L2245:  iinc 1 -1
L2248:  iload_1
L2249:  ifge L2185
L2252:  return
L2253:  iload_1
L2254:  iload_0
L2255:  isub
L2256:  istore_1
L2257:  iload_0
L2258:  iload_2
L2259:  isub
L2260:  istore_0
L2261:  getstatic Field OPPOFIOL L [I
L2264:  iload_2
L2265:  iaload
L2266:  istore_2
L2267:  iload 15
L2269:  ifeq L2335
L2272:  getstatic Field AFCKELYG m [I
L2275:  iload_2
L2276:  iconst_0
L2277:  iconst_0
L2278:  iload 5
L2280:  bipush 16
L2282:  ishr
L2283:  iload 4
L2285:  bipush 16
L2287:  ishr
L2288:  iload 8
L2290:  bipush 7
L2292:  ishr
L2293:  iload 7
L2295:  bipush 7
L2297:  ishr
L2298:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L2301:  iload 4
L2303:  iload 11
L2305:  iadd
L2306:  istore 4
L2308:  iload 5
L2310:  iload 13
L2312:  iadd
L2313:  istore 5
L2315:  iload 7
L2317:  iload 12
L2319:  iadd
L2320:  istore 7
L2322:  iload 8
L2324:  iload 14
L2326:  iadd
L2327:  istore 8
L2329:  iload_2
L2330:  getstatic Field AFCKELYG n I
L2333:  iadd
L2334:  istore_2
L2335:  iinc 0 -1
L2338:  iload_0
L2339:  ifge L2272
L2342:  iload 15
L2344:  ifeq L2407
L2347:  getstatic Field AFCKELYG m [I
L2350:  iload_2
L2351:  iconst_0
L2352:  iconst_0
L2353:  iload_3
L2354:  bipush 16
L2356:  ishr
L2357:  iload 4
L2359:  bipush 16
L2361:  ishr
L2362:  iload 6
L2364:  bipush 7
L2366:  ishr
L2367:  iload 7
L2369:  bipush 7
L2371:  ishr
L2372:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L2375:  iload 4
L2377:  iload 11
L2379:  iadd
L2380:  istore 4
L2382:  iload_3
L2383:  iload 9
L2385:  iadd
L2386:  istore_3
L2387:  iload 7
L2389:  iload 12
L2391:  iadd
L2392:  istore 7
L2394:  iload 6
L2396:  iload 10
L2398:  iadd
L2399:  istore 6
L2401:  iload_2
L2402:  getstatic Field AFCKELYG n I
L2405:  iadd
L2406:  istore_2
L2407:  iinc 1 -1
L2410:  iload_1
L2411:  ifge L2347
L2414:  return
L2415:  iload 5
L2417:  bipush 16
L2419:  ishl
L2420:  dup
L2421:  istore 5
L2423:  istore_3
L2424:  iload 8
L2426:  bipush 15
L2428:  ishl
L2429:  dup
L2430:  istore 8
L2432:  istore 6
L2434:  iload_2
L2435:  ifge L2474
L2438:  iload_3
L2439:  iload 11
L2441:  iload_2
L2442:  imul
L2443:  isub
L2444:  istore_3
L2445:  iload 5
L2447:  iload 13
L2449:  iload_2
L2450:  imul
L2451:  isub
L2452:  istore 5
L2454:  iload 6
L2456:  iload 12
L2458:  iload_2
L2459:  imul
L2460:  isub
L2461:  istore 6
L2463:  iload 8
L2465:  iload 14
L2467:  iload_2
L2468:  imul
L2469:  isub
L2470:  istore 8
L2472:  iconst_0
L2473:  istore_2
L2474:  iload 4
L2476:  bipush 16
L2478:  ishl
L2479:  istore 4
L2481:  iload 7
L2483:  bipush 15
L2485:  ishl
L2486:  istore 7
L2488:  iload_1
L2489:  ifge L2512
L2492:  iload 4
L2494:  iload 9
L2496:  iload_1
L2497:  imul
L2498:  isub
L2499:  istore 4
L2501:  iload 7
L2503:  iload 10
L2505:  iload_1
L2506:  imul
L2507:  isub
L2508:  istore 7
L2510:  iconst_0
L2511:  istore_1
L2512:  iload 11
L2514:  iload 13
L2516:  if_icmpge L2681
L2519:  iload_0
L2520:  iload_1
L2521:  isub
L2522:  istore_0
L2523:  iload_1
L2524:  iload_2
L2525:  isub
L2526:  istore_1
L2527:  getstatic Field OPPOFIOL L [I
L2530:  iload_2
L2531:  iaload
L2532:  istore_2
L2533:  iload 15
L2535:  ifeq L2598
L2538:  getstatic Field AFCKELYG m [I
L2541:  iload_2
L2542:  iconst_0
L2543:  iconst_0
L2544:  iload_3
L2545:  bipush 16
L2547:  ishr
L2548:  iload 5
L2550:  bipush 16
L2552:  ishr
L2553:  iload 6
L2555:  bipush 7
L2557:  ishr
L2558:  iload 8
L2560:  bipush 7
L2562:  ishr
L2563:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L2566:  iload_3
L2567:  iload 11
L2569:  iadd
L2570:  istore_3
L2571:  iload 5
L2573:  iload 13
L2575:  iadd
L2576:  istore 5
L2578:  iload 6
L2580:  iload 12
L2582:  iadd
L2583:  istore 6
L2585:  iload 8
L2587:  iload 14
L2589:  iadd
L2590:  istore 8
L2592:  iload_2
L2593:  getstatic Field AFCKELYG n I
L2596:  iadd
L2597:  istore_2
L2598:  iinc 1 -1
L2601:  iload_1
L2602:  ifge L2538
L2605:  iload 15
L2607:  ifeq L2673
L2610:  getstatic Field AFCKELYG m [I
L2613:  iload_2
L2614:  iconst_0
L2615:  iconst_0
L2616:  iload 4
L2618:  bipush 16
L2620:  ishr
L2621:  iload 5
L2623:  bipush 16
L2625:  ishr
L2626:  iload 7
L2628:  bipush 7
L2630:  ishr
L2631:  iload 8
L2633:  bipush 7
L2635:  ishr
L2636:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L2639:  iload 4
L2641:  iload 9
L2643:  iadd
L2644:  istore 4
L2646:  iload 5
L2648:  iload 13
L2650:  iadd
L2651:  istore 5
L2653:  iload 7
L2655:  iload 10
L2657:  iadd
L2658:  istore 7
L2660:  iload 8
L2662:  iload 14
L2664:  iadd
L2665:  istore 8
L2667:  iload_2
L2668:  getstatic Field AFCKELYG n I
L2671:  iadd
L2672:  istore_2
L2673:  iinc 0 -1
L2676:  iload_0
L2677:  ifge L2610
L2680:  return
L2681:  iload_0
L2682:  iload_1
L2683:  isub
L2684:  istore_0
L2685:  iload_1
L2686:  iload_2
L2687:  isub
L2688:  istore_1
L2689:  getstatic Field OPPOFIOL L [I
L2692:  iload_2
L2693:  iaload
L2694:  istore_2
L2695:  iload 15
L2697:  ifeq L2760
L2700:  getstatic Field AFCKELYG m [I
L2703:  iload_2
L2704:  iconst_0
L2705:  iconst_0
L2706:  iload 5
L2708:  bipush 16
L2710:  ishr
L2711:  iload_3
L2712:  bipush 16
L2714:  ishr
L2715:  iload 8
L2717:  bipush 7
L2719:  ishr
L2720:  iload 6
L2722:  bipush 7
L2724:  ishr
L2725:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L2728:  iload_3
L2729:  iload 11
L2731:  iadd
L2732:  istore_3
L2733:  iload 5
L2735:  iload 13
L2737:  iadd
L2738:  istore 5
L2740:  iload 6
L2742:  iload 12
L2744:  iadd
L2745:  istore 6
L2747:  iload 8
L2749:  iload 14
L2751:  iadd
L2752:  istore 8
L2754:  iload_2
L2755:  getstatic Field AFCKELYG n I
L2758:  iadd
L2759:  istore_2
L2760:  iinc 1 -1
L2763:  iload_1
L2764:  ifge L2700
L2767:  iload 15
L2769:  ifeq L2835
L2772:  getstatic Field AFCKELYG m [I
L2775:  iload_2
L2776:  iconst_0
L2777:  iconst_0
L2778:  iload 5
L2780:  bipush 16
L2782:  ishr
L2783:  iload 4
L2785:  bipush 16
L2787:  ishr
L2788:  iload 8
L2790:  bipush 7
L2792:  ishr
L2793:  iload 7
L2795:  bipush 7
L2797:  ishr
L2798:  invokestatic Method OPPOFIOL a ([IIIIIIII)V
L2801:  iload 4
L2803:  iload 9
L2805:  iadd
L2806:  istore 4
L2808:  iload 5
L2810:  iload 13
L2812:  iadd
L2813:  istore 5
L2815:  iload 7
L2817:  iload 10
L2819:  iadd
L2820:  istore 7
L2822:  iload 8
L2824:  iload 14
L2826:  iadd
L2827:  istore 8
L2829:  iload_2
L2830:  getstatic Field AFCKELYG n I
L2833:  iadd
L2834:  istore_2
L2835:  iinc 0 -1
L2838:  iload_0
L2839:  ifge L2772
L2842:  return
L2843:  
    .end code
.end method

.method public static final a : ([IIIIIIII)V
    .code stack 6 locals 12
L0:     getstatic Field XHHRODPC l Z
L3:     istore 11
L5:     getstatic Field OPPOFIOL D Z
L8:     ifeq L583
L11:    getstatic Field OPPOFIOL B Z
L14:    ifeq L110
L17:    iload 5
L19:    iload 4
L21:    isub
L22:    iconst_3
L23:    if_icmple L44
L26:    iload 7
L28:    iload 6
L30:    isub
L31:    iload 5
L33:    iload 4
L35:    isub
L36:    idiv
L37:    istore 8
L39:    iload 11
L41:    ifeq L47
L44:    iconst_0
L45:    istore 8
L47:    iload 5
L49:    getstatic Field AFCKELYG t I
L52:    if_icmple L60
L55:    getstatic Field AFCKELYG t I
L58:    istore 5
L60:    iload 4
L62:    ifge L78
L65:    iload 6
L67:    iload 4
L69:    iload 8
L71:    imul
L72:    isub
L73:    istore 6
L75:    iconst_0
L76:    istore 4
L78:    iload 4
L80:    iload 5
L82:    if_icmplt L86
L85:    return
L86:    iload_1
L87:    iload 4
L89:    iadd
L90:    istore_1
L91:    iload 5
L93:    iload 4
L95:    isub
L96:    iconst_2
L97:    ishr
L98:    istore_3
L99:    iload 8
L101:   iconst_2
L102:   ishl
L103:   istore 8
L105:   iload 11
L107:   ifeq L159
L110:   iload 4
L112:   iload 5
L114:   if_icmplt L118
L117:   return
L118:   iload_1
L119:   iload 4
L121:   iadd
L122:   istore_1
L123:   iload 5
L125:   iload 4
L127:   isub
L128:   iconst_2
L129:   ishr
L130:   istore_3
L131:   iload_3
L132:   ifle L156
L135:   iload 7
L137:   iload 6
L139:   isub
L140:   getstatic Field OPPOFIOL H [I
L143:   iload_3
L144:   iaload
L145:   imul
L146:   bipush 15
L148:   ishr
L149:   istore 8
L151:   iload 11
L153:   ifeq L159
L156:   iconst_0
L157:   istore 8
L159:   getstatic Field OPPOFIOL E I
L162:   ifne L259
L165:   iload 11
L167:   ifeq L215
L170:   getstatic Field OPPOFIOL V [I
L173:   iload 6
L175:   bipush 8
L177:   ishr
L178:   iaload
L179:   istore_2
L180:   iload 6
L182:   iload 8
L184:   iadd
L185:   istore 6
L187:   aload_0
L188:   iload_1
L189:   iinc 1 1
L192:   iload_2
L193:   iastore
L194:   aload_0
L195:   iload_1
L196:   iinc 1 1
L199:   iload_2
L200:   iastore
L201:   aload_0
L202:   iload_1
L203:   iinc 1 1
L206:   iload_2
L207:   iastore
L208:   aload_0
L209:   iload_1
L210:   iinc 1 1
L213:   iload_2
L214:   iastore
L215:   iinc 3 -1
L218:   iload_3
L219:   ifge L170
L222:   iload 5
L224:   iload 4
L226:   isub
L227:   iconst_3
L228:   iand
L229:   istore_3
L230:   iload_3
L231:   ifle L582
L234:   getstatic Field OPPOFIOL V [I
L237:   iload 6
L239:   bipush 8
L241:   ishr
L242:   iaload
L243:   istore_2
L244:   aload_0
L245:   iload_1
L246:   iinc 1 1
L249:   iload_2
L250:   iastore
L251:   iinc 3 -1
L254:   iload_3
L255:   ifgt L244
L258:   return
L259:   getstatic Field OPPOFIOL E I
L262:   istore 9
L264:   sipush 256
L267:   getstatic Field OPPOFIOL E I
L270:   isub
L271:   istore 10
L273:   iload 11
L275:   ifeq L479
L278:   getstatic Field OPPOFIOL V [I
L281:   iload 6
L283:   bipush 8
L285:   ishr
L286:   iaload
L287:   istore_2
L288:   iload 6
L290:   iload 8
L292:   iadd
L293:   istore 6
L295:   iload_2
L296:   ldc 16711935
L298:   iand
L299:   iload 10
L301:   imul
L302:   bipush 8
L304:   ishr
L305:   ldc 16711935
L307:   iand
L308:   iload_2
L309:   ldc 65280
L311:   iand
L312:   iload 10
L314:   imul
L315:   bipush 8
L317:   ishr
L318:   ldc 65280
L320:   iand
L321:   iadd
L322:   istore_2
L323:   aload_0
L324:   iload_1
L325:   iinc 1 1
L328:   iload_2
L329:   aload_0
L330:   iload_1
L331:   iaload
L332:   ldc 16711935
L334:   iand
L335:   iload 9
L337:   imul
L338:   bipush 8
L340:   ishr
L341:   ldc 16711935
L343:   iand
L344:   iadd
L345:   aload_0
L346:   iload_1
L347:   iaload
L348:   ldc 65280
L350:   iand
L351:   iload 9
L353:   imul
L354:   bipush 8
L356:   ishr
L357:   ldc 65280
L359:   iand
L360:   iadd
L361:   iastore
L362:   aload_0
L363:   iload_1
L364:   iinc 1 1
L367:   iload_2
L368:   aload_0
L369:   iload_1
L370:   iaload
L371:   ldc 16711935
L373:   iand
L374:   iload 9
L376:   imul
L377:   bipush 8
L379:   ishr
L380:   ldc 16711935
L382:   iand
L383:   iadd
L384:   aload_0
L385:   iload_1
L386:   iaload
L387:   ldc 65280
L389:   iand
L390:   iload 9
L392:   imul
L393:   bipush 8
L395:   ishr
L396:   ldc 65280
L398:   iand
L399:   iadd
L400:   iastore
L401:   aload_0
L402:   iload_1
L403:   iinc 1 1
L406:   iload_2
L407:   aload_0
L408:   iload_1
L409:   iaload
L410:   ldc 16711935
L412:   iand
L413:   iload 9
L415:   imul
L416:   bipush 8
L418:   ishr
L419:   ldc 16711935
L421:   iand
L422:   iadd
L423:   aload_0
L424:   iload_1
L425:   iaload
L426:   ldc 65280
L428:   iand
L429:   iload 9
L431:   imul
L432:   bipush 8
L434:   ishr
L435:   ldc 65280
L437:   iand
L438:   iadd
L439:   iastore
L440:   aload_0
L441:   iload_1
L442:   iinc 1 1
L445:   iload_2
L446:   aload_0
L447:   iload_1
L448:   iaload
L449:   ldc 16711935
L451:   iand
L452:   iload 9
L454:   imul
L455:   bipush 8
L457:   ishr
L458:   ldc 16711935
L460:   iand
L461:   iadd
L462:   aload_0
L463:   iload_1
L464:   iaload
L465:   ldc 65280
L467:   iand
L468:   iload 9
L470:   imul
L471:   bipush 8
L473:   ishr
L474:   ldc 65280
L476:   iand
L477:   iadd
L478:   iastore
L479:   iinc 3 -1
L482:   iload_3
L483:   ifge L278
L486:   iload 5
L488:   iload 4
L490:   isub
L491:   iconst_3
L492:   iand
L493:   istore_3
L494:   iload_3
L495:   ifle L582
L498:   getstatic Field OPPOFIOL V [I
L501:   iload 6
L503:   bipush 8
L505:   ishr
L506:   iaload
L507:   istore_2
L508:   iload_2
L509:   ldc 16711935
L511:   iand
L512:   iload 10
L514:   imul
L515:   bipush 8
L517:   ishr
L518:   ldc 16711935
L520:   iand
L521:   iload_2
L522:   ldc 65280
L524:   iand
L525:   iload 10
L527:   imul
L528:   bipush 8
L530:   ishr
L531:   ldc 65280
L533:   iand
L534:   iadd
L535:   istore_2
L536:   aload_0
L537:   iload_1
L538:   iinc 1 1
L541:   iload_2
L542:   aload_0
L543:   iload_1
L544:   iaload
L545:   ldc 16711935
L547:   iand
L548:   iload 9
L550:   imul
L551:   bipush 8
L553:   ishr
L554:   ldc 16711935
L556:   iand
L557:   iadd
L558:   aload_0
L559:   iload_1
L560:   iaload
L561:   ldc 65280
L563:   iand
L564:   iload 9
L566:   imul
L567:   bipush 8
L569:   ishr
L570:   ldc 65280
L572:   iand
L573:   iadd
L574:   iastore
L575:   iinc 3 -1
L578:   iload_3
L579:   ifgt L536
L582:   return
L583:   iload 4
L585:   iload 5
L587:   if_icmplt L591
L590:   return
L591:   iload 7
L593:   iload 6
L595:   isub
L596:   iload 5
L598:   iload 4
L600:   isub
L601:   idiv
L602:   istore 8
L604:   getstatic Field OPPOFIOL B Z
L607:   ifeq L649
L610:   iload 5
L612:   getstatic Field AFCKELYG t I
L615:   if_icmple L623
L618:   getstatic Field AFCKELYG t I
L621:   istore 5
L623:   iload 4
L625:   ifge L641
L628:   iload 6
L630:   iload 4
L632:   iload 8
L634:   imul
L635:   isub
L636:   istore 6
L638:   iconst_0
L639:   istore 4
L641:   iload 4
L643:   iload 5
L645:   if_icmplt L649
L648:   return
L649:   iload_1
L650:   iload 4
L652:   iadd
L653:   istore_1
L654:   iload 5
L656:   iload 4
L658:   isub
L659:   istore_3
L660:   getstatic Field OPPOFIOL E I
L663:   ifne L696
L666:   aload_0
L667:   iload_1
L668:   iinc 1 1
L671:   getstatic Field OPPOFIOL V [I
L674:   iload 6
L676:   bipush 8
L678:   ishr
L679:   iaload
L680:   iastore
L681:   iload 6
L683:   iload 8
L685:   iadd
L686:   istore 6
L688:   iinc 3 -1
L691:   iload_3
L692:   ifgt L666
L695:   return
L696:   getstatic Field OPPOFIOL E I
L699:   istore 9
L701:   sipush 256
L704:   getstatic Field OPPOFIOL E I
L707:   isub
L708:   istore 10
L710:   getstatic Field OPPOFIOL V [I
L713:   iload 6
L715:   bipush 8
L717:   ishr
L718:   iaload
L719:   istore_2
L720:   iload 6
L722:   iload 8
L724:   iadd
L725:   istore 6
L727:   iload_2
L728:   ldc 16711935
L730:   iand
L731:   iload 10
L733:   imul
L734:   bipush 8
L736:   ishr
L737:   ldc 16711935
L739:   iand
L740:   iload_2
L741:   ldc 65280
L743:   iand
L744:   iload 10
L746:   imul
L747:   bipush 8
L749:   ishr
L750:   ldc 65280
L752:   iand
L753:   iadd
L754:   istore_2
L755:   aload_0
L756:   iload_1
L757:   iinc 1 1
L760:   iload_2
L761:   aload_0
L762:   iload_1
L763:   iaload
L764:   ldc 16711935
L766:   iand
L767:   iload 9
L769:   imul
L770:   bipush 8
L772:   ishr
L773:   ldc 16711935
L775:   iand
L776:   iadd
L777:   aload_0
L778:   iload_1
L779:   iaload
L780:   ldc 65280
L782:   iand
L783:   iload 9
L785:   imul
L786:   bipush 8
L788:   ishr
L789:   ldc 65280
L791:   iand
L792:   iadd
L793:   iastore
L794:   iinc 3 -1
L797:   iload_3
L798:   ifgt L710
L801:   return
L802:   
    .end code
.end method

.method public static final c : (IIIIIII)V
    .code stack 8 locals 11
L0:     getstatic Field XHHRODPC l Z
L3:     istore 10
L5:     iconst_0
L6:     istore 7
L8:     iload_1
L9:     iload_0
L10:    if_icmpeq L26
L13:    iload 4
L15:    iload_3
L16:    isub
L17:    bipush 16
L19:    ishl
L20:    iload_1
L21:    iload_0
L22:    isub
L23:    idiv
L24:    istore 7
L26:    iconst_0
L27:    istore 8
L29:    iload_2
L30:    iload_1
L31:    if_icmpeq L48
L34:    iload 5
L36:    iload 4
L38:    isub
L39:    bipush 16
L41:    ishl
L42:    iload_2
L43:    iload_1
L44:    isub
L45:    idiv
L46:    istore 8
L48:    iconst_0
L49:    istore 9
L51:    iload_2
L52:    iload_0
L53:    if_icmpeq L69
L56:    iload_3
L57:    iload 5
L59:    isub
L60:    bipush 16
L62:    ishl
L63:    iload_0
L64:    iload_2
L65:    isub
L66:    idiv
L67:    istore 9
L69:    iload_0
L70:    iload_1
L71:    if_icmpgt L724
L74:    iload_0
L75:    iload_2
L76:    if_icmpgt L724
L79:    iload_0
L80:    getstatic Field AFCKELYG q I
L83:    if_icmplt L87
L86:    return
L87:    iload_1
L88:    getstatic Field AFCKELYG q I
L91:    if_icmple L98
L94:    getstatic Field AFCKELYG q I
L97:    istore_1
L98:    iload_2
L99:    getstatic Field AFCKELYG q I
L102:   if_icmple L109
L105:   getstatic Field AFCKELYG q I
L108:   istore_2
L109:   iload_1
L110:   iload_2
L111:   if_icmpge L422
L114:   iload_3
L115:   bipush 16
L117:   ishl
L118:   dup
L119:   istore_3
L120:   istore 5
L122:   iload_0
L123:   ifge L144
L126:   iload 5
L128:   iload 9
L130:   iload_0
L131:   imul
L132:   isub
L133:   istore 5
L135:   iload_3
L136:   iload 7
L138:   iload_0
L139:   imul
L140:   isub
L141:   istore_3
L142:   iconst_0
L143:   istore_0
L144:   iload 4
L146:   bipush 16
L148:   ishl
L149:   istore 4
L151:   iload_1
L152:   ifge L166
L155:   iload 4
L157:   iload 8
L159:   iload_1
L160:   imul
L161:   isub
L162:   istore 4
L164:   iconst_0
L165:   istore_1
L166:   iload_0
L167:   iload_1
L168:   if_icmpeq L178
L171:   iload 9
L173:   iload 7
L175:   if_icmplt L190
L178:   iload_0
L179:   iload_1
L180:   if_icmpne L306
L183:   iload 9
L185:   iload 8
L187:   if_icmple L306
L190:   iload_2
L191:   iload_1
L192:   isub
L193:   istore_2
L194:   iload_1
L195:   iload_0
L196:   isub
L197:   istore_1
L198:   getstatic Field OPPOFIOL L [I
L201:   iload_0
L202:   iaload
L203:   istore_0
L204:   iload 10
L206:   ifeq L246
L209:   getstatic Field AFCKELYG m [I
L212:   iload_0
L213:   iload 6
L215:   iconst_0
L216:   iload 5
L218:   bipush 16
L220:   ishr
L221:   iload_3
L222:   bipush 16
L224:   ishr
L225:   invokestatic Method OPPOFIOL a ([IIIIII)V
L228:   iload 5
L230:   iload 9
L232:   iadd
L233:   istore 5
L235:   iload_3
L236:   iload 7
L238:   iadd
L239:   istore_3
L240:   iload_0
L241:   getstatic Field AFCKELYG n I
L244:   iadd
L245:   istore_0
L246:   iinc 1 -1
L249:   iload_1
L250:   ifge L209
L253:   iload 10
L255:   ifeq L298
L258:   getstatic Field AFCKELYG m [I
L261:   iload_0
L262:   iload 6
L264:   iconst_0
L265:   iload 5
L267:   bipush 16
L269:   ishr
L270:   iload 4
L272:   bipush 16
L274:   ishr
L275:   invokestatic Method OPPOFIOL a ([IIIIII)V
L278:   iload 5
L280:   iload 9
L282:   iadd
L283:   istore 5
L285:   iload 4
L287:   iload 8
L289:   iadd
L290:   istore 4
L292:   iload_0
L293:   getstatic Field AFCKELYG n I
L296:   iadd
L297:   istore_0
L298:   iinc 2 -1
L301:   iload_2
L302:   ifge L258
L305:   return
L306:   iload_2
L307:   iload_1
L308:   isub
L309:   istore_2
L310:   iload_1
L311:   iload_0
L312:   isub
L313:   istore_1
L314:   getstatic Field OPPOFIOL L [I
L317:   iload_0
L318:   iaload
L319:   istore_0
L320:   iload 10
L322:   ifeq L362
L325:   getstatic Field AFCKELYG m [I
L328:   iload_0
L329:   iload 6
L331:   iconst_0
L332:   iload_3
L333:   bipush 16
L335:   ishr
L336:   iload 5
L338:   bipush 16
L340:   ishr
L341:   invokestatic Method OPPOFIOL a ([IIIIII)V
L344:   iload 5
L346:   iload 9
L348:   iadd
L349:   istore 5
L351:   iload_3
L352:   iload 7
L354:   iadd
L355:   istore_3
L356:   iload_0
L357:   getstatic Field AFCKELYG n I
L360:   iadd
L361:   istore_0
L362:   iinc 1 -1
L365:   iload_1
L366:   ifge L325
L369:   iload 10
L371:   ifeq L414
L374:   getstatic Field AFCKELYG m [I
L377:   iload_0
L378:   iload 6
L380:   iconst_0
L381:   iload 4
L383:   bipush 16
L385:   ishr
L386:   iload 5
L388:   bipush 16
L390:   ishr
L391:   invokestatic Method OPPOFIOL a ([IIIIII)V
L394:   iload 5
L396:   iload 9
L398:   iadd
L399:   istore 5
L401:   iload 4
L403:   iload 8
L405:   iadd
L406:   istore 4
L408:   iload_0
L409:   getstatic Field AFCKELYG n I
L412:   iadd
L413:   istore_0
L414:   iinc 2 -1
L417:   iload_2
L418:   ifge L374
L421:   return
L422:   iload_3
L423:   bipush 16
L425:   ishl
L426:   dup
L427:   istore_3
L428:   istore 4
L430:   iload_0
L431:   ifge L452
L434:   iload 4
L436:   iload 9
L438:   iload_0
L439:   imul
L440:   isub
L441:   istore 4
L443:   iload_3
L444:   iload 7
L446:   iload_0
L447:   imul
L448:   isub
L449:   istore_3
L450:   iconst_0
L451:   istore_0
L452:   iload 5
L454:   bipush 16
L456:   ishl
L457:   istore 5
L459:   iload_2
L460:   ifge L474
L463:   iload 5
L465:   iload 8
L467:   iload_2
L468:   imul
L469:   isub
L470:   istore 5
L472:   iconst_0
L473:   istore_2
L474:   iload_0
L475:   iload_2
L476:   if_icmpeq L486
L479:   iload 9
L481:   iload 7
L483:   if_icmplt L498
L486:   iload_0
L487:   iload_2
L488:   if_icmpne L611
L491:   iload 8
L493:   iload 7
L495:   if_icmple L611
L498:   iload_1
L499:   iload_2
L500:   isub
L501:   istore_1
L502:   iload_2
L503:   iload_0
L504:   isub
L505:   istore_2
L506:   getstatic Field OPPOFIOL L [I
L509:   iload_0
L510:   iaload
L511:   istore_0
L512:   iload 10
L514:   ifeq L554
L517:   getstatic Field AFCKELYG m [I
L520:   iload_0
L521:   iload 6
L523:   iconst_0
L524:   iload 4
L526:   bipush 16
L528:   ishr
L529:   iload_3
L530:   bipush 16
L532:   ishr
L533:   invokestatic Method OPPOFIOL a ([IIIIII)V
L536:   iload 4
L538:   iload 9
L540:   iadd
L541:   istore 4
L543:   iload_3
L544:   iload 7
L546:   iadd
L547:   istore_3
L548:   iload_0
L549:   getstatic Field AFCKELYG n I
L552:   iadd
L553:   istore_0
L554:   iinc 2 -1
L557:   iload_2
L558:   ifge L517
L561:   iload 10
L563:   ifeq L603
L566:   getstatic Field AFCKELYG m [I
L569:   iload_0
L570:   iload 6
L572:   iconst_0
L573:   iload 5
L575:   bipush 16
L577:   ishr
L578:   iload_3
L579:   bipush 16
L581:   ishr
L582:   invokestatic Method OPPOFIOL a ([IIIIII)V
L585:   iload 5
L587:   iload 8
L589:   iadd
L590:   istore 5
L592:   iload_3
L593:   iload 7
L595:   iadd
L596:   istore_3
L597:   iload_0
L598:   getstatic Field AFCKELYG n I
L601:   iadd
L602:   istore_0
L603:   iinc 1 -1
L606:   iload_1
L607:   ifge L566
L610:   return
L611:   iload_1
L612:   iload_2
L613:   isub
L614:   istore_1
L615:   iload_2
L616:   iload_0
L617:   isub
L618:   istore_2
L619:   getstatic Field OPPOFIOL L [I
L622:   iload_0
L623:   iaload
L624:   istore_0
L625:   iload 10
L627:   ifeq L667
L630:   getstatic Field AFCKELYG m [I
L633:   iload_0
L634:   iload 6
L636:   iconst_0
L637:   iload_3
L638:   bipush 16
L640:   ishr
L641:   iload 4
L643:   bipush 16
L645:   ishr
L646:   invokestatic Method OPPOFIOL a ([IIIIII)V
L649:   iload 4
L651:   iload 9
L653:   iadd
L654:   istore 4
L656:   iload_3
L657:   iload 7
L659:   iadd
L660:   istore_3
L661:   iload_0
L662:   getstatic Field AFCKELYG n I
L665:   iadd
L666:   istore_0
L667:   iinc 2 -1
L670:   iload_2
L671:   ifge L630
L674:   iload 10
L676:   ifeq L716
L679:   getstatic Field AFCKELYG m [I
L682:   iload_0
L683:   iload 6
L685:   iconst_0
L686:   iload_3
L687:   bipush 16
L689:   ishr
L690:   iload 5
L692:   bipush 16
L694:   ishr
L695:   invokestatic Method OPPOFIOL a ([IIIIII)V
L698:   iload 5
L700:   iload 8
L702:   iadd
L703:   istore 5
L705:   iload_3
L706:   iload 7
L708:   iadd
L709:   istore_3
L710:   iload_0
L711:   getstatic Field AFCKELYG n I
L714:   iadd
L715:   istore_0
L716:   iinc 1 -1
L719:   iload_1
L720:   ifge L679
L723:   return
L724:   iload_1
L725:   iload_2
L726:   if_icmpgt L1358
L729:   iload_1
L730:   getstatic Field AFCKELYG q I
L733:   if_icmplt L737
L736:   return
L737:   iload_2
L738:   getstatic Field AFCKELYG q I
L741:   if_icmple L748
L744:   getstatic Field AFCKELYG q I
L747:   istore_2
L748:   iload_0
L749:   getstatic Field AFCKELYG q I
L752:   if_icmple L759
L755:   getstatic Field AFCKELYG q I
L758:   istore_0
L759:   iload_2
L760:   iload_0
L761:   if_icmpge L1067
L764:   iload 4
L766:   bipush 16
L768:   ishl
L769:   dup
L770:   istore 4
L772:   istore_3
L773:   iload_1
L774:   ifge L795
L777:   iload_3
L778:   iload 7
L780:   iload_1
L781:   imul
L782:   isub
L783:   istore_3
L784:   iload 4
L786:   iload 8
L788:   iload_1
L789:   imul
L790:   isub
L791:   istore 4
L793:   iconst_0
L794:   istore_1
L795:   iload 5
L797:   bipush 16
L799:   ishl
L800:   istore 5
L802:   iload_2
L803:   ifge L817
L806:   iload 5
L808:   iload 9
L810:   iload_2
L811:   imul
L812:   isub
L813:   istore 5
L815:   iconst_0
L816:   istore_2
L817:   iload_1
L818:   iload_2
L819:   if_icmpeq L829
L822:   iload 7
L824:   iload 8
L826:   if_icmplt L841
L829:   iload_1
L830:   iload_2
L831:   if_icmpne L954
L834:   iload 7
L836:   iload 9
L838:   if_icmple L954
L841:   iload_0
L842:   iload_2
L843:   isub
L844:   istore_0
L845:   iload_2
L846:   iload_1
L847:   isub
L848:   istore_2
L849:   getstatic Field OPPOFIOL L [I
L852:   iload_1
L853:   iaload
L854:   istore_1
L855:   iload 10
L857:   ifeq L897
L860:   getstatic Field AFCKELYG m [I
L863:   iload_1
L864:   iload 6
L866:   iconst_0
L867:   iload_3
L868:   bipush 16
L870:   ishr
L871:   iload 4
L873:   bipush 16
L875:   ishr
L876:   invokestatic Method OPPOFIOL a ([IIIIII)V
L879:   iload_3
L880:   iload 7
L882:   iadd
L883:   istore_3
L884:   iload 4
L886:   iload 8
L888:   iadd
L889:   istore 4
L891:   iload_1
L892:   getstatic Field AFCKELYG n I
L895:   iadd
L896:   istore_1
L897:   iinc 2 -1
L900:   iload_2
L901:   ifge L860
L904:   iload 10
L906:   ifeq L946
L909:   getstatic Field AFCKELYG m [I
L912:   iload_1
L913:   iload 6
L915:   iconst_0
L916:   iload_3
L917:   bipush 16
L919:   ishr
L920:   iload 5
L922:   bipush 16
L924:   ishr
L925:   invokestatic Method OPPOFIOL a ([IIIIII)V
L928:   iload_3
L929:   iload 7
L931:   iadd
L932:   istore_3
L933:   iload 5
L935:   iload 9
L937:   iadd
L938:   istore 5
L940:   iload_1
L941:   getstatic Field AFCKELYG n I
L944:   iadd
L945:   istore_1
L946:   iinc 0 -1
L949:   iload_0
L950:   ifge L909
L953:   return
L954:   iload_0
L955:   iload_2
L956:   isub
L957:   istore_0
L958:   iload_2
L959:   iload_1
L960:   isub
L961:   istore_2
L962:   getstatic Field OPPOFIOL L [I
L965:   iload_1
L966:   iaload
L967:   istore_1
L968:   iload 10
L970:   ifeq L1010
L973:   getstatic Field AFCKELYG m [I
L976:   iload_1
L977:   iload 6
L979:   iconst_0
L980:   iload 4
L982:   bipush 16
L984:   ishr
L985:   iload_3
L986:   bipush 16
L988:   ishr
L989:   invokestatic Method OPPOFIOL a ([IIIIII)V
L992:   iload_3
L993:   iload 7
L995:   iadd
L996:   istore_3
L997:   iload 4
L999:   iload 8
L1001:  iadd
L1002:  istore 4
L1004:  iload_1
L1005:  getstatic Field AFCKELYG n I
L1008:  iadd
L1009:  istore_1
L1010:  iinc 2 -1
L1013:  iload_2
L1014:  ifge L973
L1017:  iload 10
L1019:  ifeq L1059
L1022:  getstatic Field AFCKELYG m [I
L1025:  iload_1
L1026:  iload 6
L1028:  iconst_0
L1029:  iload 5
L1031:  bipush 16
L1033:  ishr
L1034:  iload_3
L1035:  bipush 16
L1037:  ishr
L1038:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1041:  iload_3
L1042:  iload 7
L1044:  iadd
L1045:  istore_3
L1046:  iload 5
L1048:  iload 9
L1050:  iadd
L1051:  istore 5
L1053:  iload_1
L1054:  getstatic Field AFCKELYG n I
L1057:  iadd
L1058:  istore_1
L1059:  iinc 0 -1
L1062:  iload_0
L1063:  ifge L1022
L1066:  return
L1067:  iload 4
L1069:  bipush 16
L1071:  ishl
L1072:  dup
L1073:  istore 4
L1075:  istore 5
L1077:  iload_1
L1078:  ifge L1101
L1081:  iload 5
L1083:  iload 7
L1085:  iload_1
L1086:  imul
L1087:  isub
L1088:  istore 5
L1090:  iload 4
L1092:  iload 8
L1094:  iload_1
L1095:  imul
L1096:  isub
L1097:  istore 4
L1099:  iconst_0
L1100:  istore_1
L1101:  iload_3
L1102:  bipush 16
L1104:  ishl
L1105:  istore_3
L1106:  iload_0
L1107:  ifge L1119
L1110:  iload_3
L1111:  iload 9
L1113:  iload_0
L1114:  imul
L1115:  isub
L1116:  istore_3
L1117:  iconst_0
L1118:  istore_0
L1119:  iload 7
L1121:  iload 8
L1123:  if_icmpge L1242
L1126:  iload_2
L1127:  iload_0
L1128:  isub
L1129:  istore_2
L1130:  iload_0
L1131:  iload_1
L1132:  isub
L1133:  istore_0
L1134:  getstatic Field OPPOFIOL L [I
L1137:  iload_1
L1138:  iaload
L1139:  istore_1
L1140:  iload 10
L1142:  ifeq L1185
L1145:  getstatic Field AFCKELYG m [I
L1148:  iload_1
L1149:  iload 6
L1151:  iconst_0
L1152:  iload 5
L1154:  bipush 16
L1156:  ishr
L1157:  iload 4
L1159:  bipush 16
L1161:  ishr
L1162:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1165:  iload 5
L1167:  iload 7
L1169:  iadd
L1170:  istore 5
L1172:  iload 4
L1174:  iload 8
L1176:  iadd
L1177:  istore 4
L1179:  iload_1
L1180:  getstatic Field AFCKELYG n I
L1183:  iadd
L1184:  istore_1
L1185:  iinc 0 -1
L1188:  iload_0
L1189:  ifge L1145
L1192:  iload 10
L1194:  ifeq L1234
L1197:  getstatic Field AFCKELYG m [I
L1200:  iload_1
L1201:  iload 6
L1203:  iconst_0
L1204:  iload_3
L1205:  bipush 16
L1207:  ishr
L1208:  iload 4
L1210:  bipush 16
L1212:  ishr
L1213:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1216:  iload_3
L1217:  iload 9
L1219:  iadd
L1220:  istore_3
L1221:  iload 4
L1223:  iload 8
L1225:  iadd
L1226:  istore 4
L1228:  iload_1
L1229:  getstatic Field AFCKELYG n I
L1232:  iadd
L1233:  istore_1
L1234:  iinc 2 -1
L1237:  iload_2
L1238:  ifge L1197
L1241:  return
L1242:  iload_2
L1243:  iload_0
L1244:  isub
L1245:  istore_2
L1246:  iload_0
L1247:  iload_1
L1248:  isub
L1249:  istore_0
L1250:  getstatic Field OPPOFIOL L [I
L1253:  iload_1
L1254:  iaload
L1255:  istore_1
L1256:  iload 10
L1258:  ifeq L1301
L1261:  getstatic Field AFCKELYG m [I
L1264:  iload_1
L1265:  iload 6
L1267:  iconst_0
L1268:  iload 4
L1270:  bipush 16
L1272:  ishr
L1273:  iload 5
L1275:  bipush 16
L1277:  ishr
L1278:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1281:  iload 5
L1283:  iload 7
L1285:  iadd
L1286:  istore 5
L1288:  iload 4
L1290:  iload 8
L1292:  iadd
L1293:  istore 4
L1295:  iload_1
L1296:  getstatic Field AFCKELYG n I
L1299:  iadd
L1300:  istore_1
L1301:  iinc 0 -1
L1304:  iload_0
L1305:  ifge L1261
L1308:  iload 10
L1310:  ifeq L1350
L1313:  getstatic Field AFCKELYG m [I
L1316:  iload_1
L1317:  iload 6
L1319:  iconst_0
L1320:  iload 4
L1322:  bipush 16
L1324:  ishr
L1325:  iload_3
L1326:  bipush 16
L1328:  ishr
L1329:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1332:  iload_3
L1333:  iload 9
L1335:  iadd
L1336:  istore_3
L1337:  iload 4
L1339:  iload 8
L1341:  iadd
L1342:  istore 4
L1344:  iload_1
L1345:  getstatic Field AFCKELYG n I
L1348:  iadd
L1349:  istore_1
L1350:  iinc 2 -1
L1353:  iload_2
L1354:  ifge L1313
L1357:  return
L1358:  iload_2
L1359:  getstatic Field AFCKELYG q I
L1362:  if_icmplt L1366
L1365:  return
L1366:  iload_0
L1367:  getstatic Field AFCKELYG q I
L1370:  if_icmple L1377
L1373:  getstatic Field AFCKELYG q I
L1376:  istore_0
L1377:  iload_1
L1378:  getstatic Field AFCKELYG q I
L1381:  if_icmple L1388
L1384:  getstatic Field AFCKELYG q I
L1387:  istore_1
L1388:  iload_0
L1389:  iload_1
L1390:  if_icmpge L1684
L1393:  iload 5
L1395:  bipush 16
L1397:  ishl
L1398:  dup
L1399:  istore 5
L1401:  istore 4
L1403:  iload_2
L1404:  ifge L1427
L1407:  iload 4
L1409:  iload 8
L1411:  iload_2
L1412:  imul
L1413:  isub
L1414:  istore 4
L1416:  iload 5
L1418:  iload 9
L1420:  iload_2
L1421:  imul
L1422:  isub
L1423:  istore 5
L1425:  iconst_0
L1426:  istore_2
L1427:  iload_3
L1428:  bipush 16
L1430:  ishl
L1431:  istore_3
L1432:  iload_0
L1433:  ifge L1445
L1436:  iload_3
L1437:  iload 7
L1439:  iload_0
L1440:  imul
L1441:  isub
L1442:  istore_3
L1443:  iconst_0
L1444:  istore_0
L1445:  iload 8
L1447:  iload 9
L1449:  if_icmpge L1568
L1452:  iload_1
L1453:  iload_0
L1454:  isub
L1455:  istore_1
L1456:  iload_0
L1457:  iload_2
L1458:  isub
L1459:  istore_0
L1460:  getstatic Field OPPOFIOL L [I
L1463:  iload_2
L1464:  iaload
L1465:  istore_2
L1466:  iload 10
L1468:  ifeq L1511
L1471:  getstatic Field AFCKELYG m [I
L1474:  iload_2
L1475:  iload 6
L1477:  iconst_0
L1478:  iload 4
L1480:  bipush 16
L1482:  ishr
L1483:  iload 5
L1485:  bipush 16
L1487:  ishr
L1488:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1491:  iload 4
L1493:  iload 8
L1495:  iadd
L1496:  istore 4
L1498:  iload 5
L1500:  iload 9
L1502:  iadd
L1503:  istore 5
L1505:  iload_2
L1506:  getstatic Field AFCKELYG n I
L1509:  iadd
L1510:  istore_2
L1511:  iinc 0 -1
L1514:  iload_0
L1515:  ifge L1471
L1518:  iload 10
L1520:  ifeq L1560
L1523:  getstatic Field AFCKELYG m [I
L1526:  iload_2
L1527:  iload 6
L1529:  iconst_0
L1530:  iload 4
L1532:  bipush 16
L1534:  ishr
L1535:  iload_3
L1536:  bipush 16
L1538:  ishr
L1539:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1542:  iload 4
L1544:  iload 8
L1546:  iadd
L1547:  istore 4
L1549:  iload_3
L1550:  iload 7
L1552:  iadd
L1553:  istore_3
L1554:  iload_2
L1555:  getstatic Field AFCKELYG n I
L1558:  iadd
L1559:  istore_2
L1560:  iinc 1 -1
L1563:  iload_1
L1564:  ifge L1523
L1567:  return
L1568:  iload_1
L1569:  iload_0
L1570:  isub
L1571:  istore_1
L1572:  iload_0
L1573:  iload_2
L1574:  isub
L1575:  istore_0
L1576:  getstatic Field OPPOFIOL L [I
L1579:  iload_2
L1580:  iaload
L1581:  istore_2
L1582:  iload 10
L1584:  ifeq L1627
L1587:  getstatic Field AFCKELYG m [I
L1590:  iload_2
L1591:  iload 6
L1593:  iconst_0
L1594:  iload 5
L1596:  bipush 16
L1598:  ishr
L1599:  iload 4
L1601:  bipush 16
L1603:  ishr
L1604:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1607:  iload 4
L1609:  iload 8
L1611:  iadd
L1612:  istore 4
L1614:  iload 5
L1616:  iload 9
L1618:  iadd
L1619:  istore 5
L1621:  iload_2
L1622:  getstatic Field AFCKELYG n I
L1625:  iadd
L1626:  istore_2
L1627:  iinc 0 -1
L1630:  iload_0
L1631:  ifge L1587
L1634:  iload 10
L1636:  ifeq L1676
L1639:  getstatic Field AFCKELYG m [I
L1642:  iload_2
L1643:  iload 6
L1645:  iconst_0
L1646:  iload_3
L1647:  bipush 16
L1649:  ishr
L1650:  iload 4
L1652:  bipush 16
L1654:  ishr
L1655:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1658:  iload 4
L1660:  iload 8
L1662:  iadd
L1663:  istore 4
L1665:  iload_3
L1666:  iload 7
L1668:  iadd
L1669:  istore_3
L1670:  iload_2
L1671:  getstatic Field AFCKELYG n I
L1674:  iadd
L1675:  istore_2
L1676:  iinc 1 -1
L1679:  iload_1
L1680:  ifge L1639
L1683:  return
L1684:  iload 5
L1686:  bipush 16
L1688:  ishl
L1689:  dup
L1690:  istore 5
L1692:  istore_3
L1693:  iload_2
L1694:  ifge L1715
L1697:  iload_3
L1698:  iload 8
L1700:  iload_2
L1701:  imul
L1702:  isub
L1703:  istore_3
L1704:  iload 5
L1706:  iload 9
L1708:  iload_2
L1709:  imul
L1710:  isub
L1711:  istore 5
L1713:  iconst_0
L1714:  istore_2
L1715:  iload 4
L1717:  bipush 16
L1719:  ishl
L1720:  istore 4
L1722:  iload_1
L1723:  ifge L1737
L1726:  iload 4
L1728:  iload 7
L1730:  iload_1
L1731:  imul
L1732:  isub
L1733:  istore 4
L1735:  iconst_0
L1736:  istore_1
L1737:  iload 8
L1739:  iload 9
L1741:  if_icmpge L1860
L1744:  iload_0
L1745:  iload_1
L1746:  isub
L1747:  istore_0
L1748:  iload_1
L1749:  iload_2
L1750:  isub
L1751:  istore_1
L1752:  getstatic Field OPPOFIOL L [I
L1755:  iload_2
L1756:  iaload
L1757:  istore_2
L1758:  iload 10
L1760:  ifeq L1800
L1763:  getstatic Field AFCKELYG m [I
L1766:  iload_2
L1767:  iload 6
L1769:  iconst_0
L1770:  iload_3
L1771:  bipush 16
L1773:  ishr
L1774:  iload 5
L1776:  bipush 16
L1778:  ishr
L1779:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1782:  iload_3
L1783:  iload 8
L1785:  iadd
L1786:  istore_3
L1787:  iload 5
L1789:  iload 9
L1791:  iadd
L1792:  istore 5
L1794:  iload_2
L1795:  getstatic Field AFCKELYG n I
L1798:  iadd
L1799:  istore_2
L1800:  iinc 1 -1
L1803:  iload_1
L1804:  ifge L1763
L1807:  iload 10
L1809:  ifeq L1852
L1812:  getstatic Field AFCKELYG m [I
L1815:  iload_2
L1816:  iload 6
L1818:  iconst_0
L1819:  iload 4
L1821:  bipush 16
L1823:  ishr
L1824:  iload 5
L1826:  bipush 16
L1828:  ishr
L1829:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1832:  iload 4
L1834:  iload 7
L1836:  iadd
L1837:  istore 4
L1839:  iload 5
L1841:  iload 9
L1843:  iadd
L1844:  istore 5
L1846:  iload_2
L1847:  getstatic Field AFCKELYG n I
L1850:  iadd
L1851:  istore_2
L1852:  iinc 0 -1
L1855:  iload_0
L1856:  ifge L1812
L1859:  return
L1860:  iload_0
L1861:  iload_1
L1862:  isub
L1863:  istore_0
L1864:  iload_1
L1865:  iload_2
L1866:  isub
L1867:  istore_1
L1868:  getstatic Field OPPOFIOL L [I
L1871:  iload_2
L1872:  iaload
L1873:  istore_2
L1874:  iload 10
L1876:  ifeq L1916
L1879:  getstatic Field AFCKELYG m [I
L1882:  iload_2
L1883:  iload 6
L1885:  iconst_0
L1886:  iload 5
L1888:  bipush 16
L1890:  ishr
L1891:  iload_3
L1892:  bipush 16
L1894:  ishr
L1895:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1898:  iload_3
L1899:  iload 8
L1901:  iadd
L1902:  istore_3
L1903:  iload 5
L1905:  iload 9
L1907:  iadd
L1908:  istore 5
L1910:  iload_2
L1911:  getstatic Field AFCKELYG n I
L1914:  iadd
L1915:  istore_2
L1916:  iinc 1 -1
L1919:  iload_1
L1920:  ifge L1879
L1923:  iload 10
L1925:  ifeq L1968
L1928:  getstatic Field AFCKELYG m [I
L1931:  iload_2
L1932:  iload 6
L1934:  iconst_0
L1935:  iload 5
L1937:  bipush 16
L1939:  ishr
L1940:  iload 4
L1942:  bipush 16
L1944:  ishr
L1945:  invokestatic Method OPPOFIOL a ([IIIIII)V
L1948:  iload 4
L1950:  iload 7
L1952:  iadd
L1953:  istore 4
L1955:  iload 5
L1957:  iload 9
L1959:  iadd
L1960:  istore 5
L1962:  iload_2
L1963:  getstatic Field AFCKELYG n I
L1966:  iadd
L1967:  istore_2
L1968:  iinc 0 -1
L1971:  iload_0
L1972:  ifge L1928
L1975:  return
L1976:  
    .end code
.end method

.method public static final a : ([IIIIII)V
    .code stack 6 locals 9
L0:     getstatic Field XHHRODPC l Z
L3:     istore 8
L5:     getstatic Field OPPOFIOL B Z
L8:     ifeq L32
L11:    iload 5
L13:    getstatic Field AFCKELYG t I
L16:    if_icmple L24
L19:    getstatic Field AFCKELYG t I
L22:    istore 5
L24:    iload 4
L26:    ifge L32
L29:    iconst_0
L30:    istore 4
L32:    iload 4
L34:    iload 5
L36:    if_icmplt L40
L39:    return
L40:    iload_1
L41:    iload 4
L43:    iadd
L44:    istore_1
L45:    iload 5
L47:    iload 4
L49:    isub
L50:    iconst_2
L51:    ishr
L52:    istore_3
L53:    getstatic Field OPPOFIOL E I
L56:    ifne L127
L59:    iload 8
L61:    ifeq L92
L64:    aload_0
L65:    iload_1
L66:    iinc 1 1
L69:    iload_2
L70:    iastore
L71:    aload_0
L72:    iload_1
L73:    iinc 1 1
L76:    iload_2
L77:    iastore
L78:    aload_0
L79:    iload_1
L80:    iinc 1 1
L83:    iload_2
L84:    iastore
L85:    aload_0
L86:    iload_1
L87:    iinc 1 1
L90:    iload_2
L91:    iastore
L92:    iinc 3 -1
L95:    iload_3
L96:    ifge L64
L99:    iload 5
L101:   iload 4
L103:   isub
L104:   iconst_3
L105:   iand
L106:   istore_3
L107:   iload 8
L109:   ifeq L119
L112:   aload_0
L113:   iload_1
L114:   iinc 1 1
L117:   iload_2
L118:   iastore
L119:   iinc 3 -1
L122:   iload_3
L123:   ifge L112
L126:   return
L127:   getstatic Field OPPOFIOL E I
L130:   istore 6
L132:   sipush 256
L135:   getstatic Field OPPOFIOL E I
L138:   isub
L139:   istore 7
L141:   iload_2
L142:   ldc 16711935
L144:   iand
L145:   iload 7
L147:   imul
L148:   bipush 8
L150:   ishr
L151:   ldc 16711935
L153:   iand
L154:   iload_2
L155:   ldc 65280
L157:   iand
L158:   iload 7
L160:   imul
L161:   bipush 8
L163:   ishr
L164:   ldc 65280
L166:   iand
L167:   iadd
L168:   istore_2
L169:   iload 8
L171:   ifeq L330
L174:   aload_0
L175:   iload_1
L176:   iinc 1 1
L179:   iload_2
L180:   aload_0
L181:   iload_1
L182:   iaload
L183:   ldc 16711935
L185:   iand
L186:   iload 6
L188:   imul
L189:   bipush 8
L191:   ishr
L192:   ldc 16711935
L194:   iand
L195:   iadd
L196:   aload_0
L197:   iload_1
L198:   iaload
L199:   ldc 65280
L201:   iand
L202:   iload 6
L204:   imul
L205:   bipush 8
L207:   ishr
L208:   ldc 65280
L210:   iand
L211:   iadd
L212:   iastore
L213:   aload_0
L214:   iload_1
L215:   iinc 1 1
L218:   iload_2
L219:   aload_0
L220:   iload_1
L221:   iaload
L222:   ldc 16711935
L224:   iand
L225:   iload 6
L227:   imul
L228:   bipush 8
L230:   ishr
L231:   ldc 16711935
L233:   iand
L234:   iadd
L235:   aload_0
L236:   iload_1
L237:   iaload
L238:   ldc 65280
L240:   iand
L241:   iload 6
L243:   imul
L244:   bipush 8
L246:   ishr
L247:   ldc 65280
L249:   iand
L250:   iadd
L251:   iastore
L252:   aload_0
L253:   iload_1
L254:   iinc 1 1
L257:   iload_2
L258:   aload_0
L259:   iload_1
L260:   iaload
L261:   ldc 16711935
L263:   iand
L264:   iload 6
L266:   imul
L267:   bipush 8
L269:   ishr
L270:   ldc 16711935
L272:   iand
L273:   iadd
L274:   aload_0
L275:   iload_1
L276:   iaload
L277:   ldc 65280
L279:   iand
L280:   iload 6
L282:   imul
L283:   bipush 8
L285:   ishr
L286:   ldc 65280
L288:   iand
L289:   iadd
L290:   iastore
L291:   aload_0
L292:   iload_1
L293:   iinc 1 1
L296:   iload_2
L297:   aload_0
L298:   iload_1
L299:   iaload
L300:   ldc 16711935
L302:   iand
L303:   iload 6
L305:   imul
L306:   bipush 8
L308:   ishr
L309:   ldc 16711935
L311:   iand
L312:   iadd
L313:   aload_0
L314:   iload_1
L315:   iaload
L316:   ldc 65280
L318:   iand
L319:   iload 6
L321:   imul
L322:   bipush 8
L324:   ishr
L325:   ldc 65280
L327:   iand
L328:   iadd
L329:   iastore
L330:   iinc 3 -1
L333:   iload_3
L334:   ifge L174
L337:   iload 5
L339:   iload 4
L341:   isub
L342:   iconst_3
L343:   iand
L344:   istore_3
L345:   iload 8
L347:   ifeq L389
L350:   aload_0
L351:   iload_1
L352:   iinc 1 1
L355:   iload_2
L356:   aload_0
L357:   iload_1
L358:   iaload
L359:   ldc 16711935
L361:   iand
L362:   iload 6
L364:   imul
L365:   bipush 8
L367:   ishr
L368:   ldc 16711935
L370:   iand
L371:   iadd
L372:   aload_0
L373:   iload_1
L374:   iaload
L375:   ldc 65280
L377:   iand
L378:   iload 6
L380:   imul
L381:   bipush 8
L383:   ishr
L384:   ldc 65280
L386:   iand
L387:   iadd
L388:   iastore
L389:   iinc 3 -1
L392:   iload_3
L393:   ifge L350
L396:   return
L397:   
    .end code
.end method

.method public static final a : (IIIIIIIIIIIIIIIIIII)V
    .code stack 16 locals 37
L0:     getstatic Field XHHRODPC l Z
L3:     istore 36
L5:     iload 18
L7:     invokestatic Method OPPOFIOL d (I)[I
L10:    astore 19
L12:    getstatic Field OPPOFIOL O [Z
L15:    iload 18
L17:    baload
L18:    ifeq L25
L21:    iconst_0
L22:    goto L26
L25:    iconst_1
L26:    putstatic Field OPPOFIOL C Z
L29:    iload 9
L31:    iload 10
L33:    isub
L34:    istore 10
L36:    iload 12
L38:    iload 13
L40:    isub
L41:    istore 13
L43:    iload 15
L45:    iload 16
L47:    isub
L48:    istore 16
L50:    iload 11
L52:    iload 9
L54:    isub
L55:    istore 11
L57:    iload 14
L59:    iload 12
L61:    isub
L62:    istore 14
L64:    iload 17
L66:    iload 15
L68:    isub
L69:    istore 17
L71:    iload 11
L73:    iload 12
L75:    imul
L76:    iload 14
L78:    iload 9
L80:    imul
L81:    isub
L82:    bipush 14
L84:    ishl
L85:    istore 20
L87:    iload 14
L89:    iload 15
L91:    imul
L92:    iload 17
L94:    iload 12
L96:    imul
L97:    isub
L98:    bipush 8
L100:   ishl
L101:   istore 21
L103:   iload 17
L105:   iload 9
L107:   imul
L108:   iload 11
L110:   iload 15
L112:   imul
L113:   isub
L114:   iconst_5
L115:   ishl
L116:   istore 22
L118:   iload 10
L120:   iload 12
L122:   imul
L123:   iload 13
L125:   iload 9
L127:   imul
L128:   isub
L129:   bipush 14
L131:   ishl
L132:   istore 23
L134:   iload 13
L136:   iload 15
L138:   imul
L139:   iload 16
L141:   iload 12
L143:   imul
L144:   isub
L145:   bipush 8
L147:   ishl
L148:   istore 24
L150:   iload 16
L152:   iload 9
L154:   imul
L155:   iload 10
L157:   iload 15
L159:   imul
L160:   isub
L161:   iconst_5
L162:   ishl
L163:   istore 25
L165:   iload 13
L167:   iload 11
L169:   imul
L170:   iload 10
L172:   iload 14
L174:   imul
L175:   isub
L176:   bipush 14
L178:   ishl
L179:   istore 26
L181:   iload 16
L183:   iload 14
L185:   imul
L186:   iload 13
L188:   iload 17
L190:   imul
L191:   isub
L192:   bipush 8
L194:   ishl
L195:   istore 27
L197:   iload 10
L199:   iload 17
L201:   imul
L202:   iload 16
L204:   iload 11
L206:   imul
L207:   isub
L208:   iconst_5
L209:   ishl
L210:   istore 28
L212:   iconst_0
L213:   istore 29
L215:   iconst_0
L216:   istore 30
L218:   iload_1
L219:   iload_0
L220:   if_icmpeq L250
L223:   iload 4
L225:   iload_3
L226:   isub
L227:   bipush 16
L229:   ishl
L230:   iload_1
L231:   iload_0
L232:   isub
L233:   idiv
L234:   istore 29
L236:   iload 7
L238:   iload 6
L240:   isub
L241:   bipush 16
L243:   ishl
L244:   iload_1
L245:   iload_0
L246:   isub
L247:   idiv
L248:   istore 30
L250:   iconst_0
L251:   istore 31
L253:   iconst_0
L254:   istore 32
L256:   iload_2
L257:   iload_1
L258:   if_icmpeq L289
L261:   iload 5
L263:   iload 4
L265:   isub
L266:   bipush 16
L268:   ishl
L269:   iload_2
L270:   iload_1
L271:   isub
L272:   idiv
L273:   istore 31
L275:   iload 8
L277:   iload 7
L279:   isub
L280:   bipush 16
L282:   ishl
L283:   iload_2
L284:   iload_1
L285:   isub
L286:   idiv
L287:   istore 32
L289:   iconst_0
L290:   istore 33
L292:   iconst_0
L293:   istore 34
L295:   iload_2
L296:   iload_0
L297:   if_icmpeq L327
L300:   iload_3
L301:   iload 5
L303:   isub
L304:   bipush 16
L306:   ishl
L307:   iload_0
L308:   iload_2
L309:   isub
L310:   idiv
L311:   istore 33
L313:   iload 6
L315:   iload 8
L317:   isub
L318:   bipush 16
L320:   ishl
L321:   iload_0
L322:   iload_2
L323:   isub
L324:   idiv
L325:   istore 34
L327:   iload_0
L328:   iload_1
L329:   if_icmpgt L1608
L332:   iload_0
L333:   iload_2
L334:   if_icmpgt L1608
L337:   iload_0
L338:   getstatic Field AFCKELYG q I
L341:   if_icmplt L345
L344:   return
L345:   iload_1
L346:   getstatic Field AFCKELYG q I
L349:   if_icmple L356
L352:   getstatic Field AFCKELYG q I
L355:   istore_1
L356:   iload_2
L357:   getstatic Field AFCKELYG q I
L360:   if_icmple L367
L363:   getstatic Field AFCKELYG q I
L366:   istore_2
L367:   iload_1
L368:   iload_2
L369:   if_icmpge L993
L372:   iload_3
L373:   bipush 16
L375:   ishl
L376:   dup
L377:   istore_3
L378:   istore 5
L380:   iload 6
L382:   bipush 16
L384:   ishl
L385:   dup
L386:   istore 6
L388:   istore 8
L390:   iload_0
L391:   ifge L430
L394:   iload 5
L396:   iload 33
L398:   iload_0
L399:   imul
L400:   isub
L401:   istore 5
L403:   iload_3
L404:   iload 29
L406:   iload_0
L407:   imul
L408:   isub
L409:   istore_3
L410:   iload 8
L412:   iload 34
L414:   iload_0
L415:   imul
L416:   isub
L417:   istore 8
L419:   iload 6
L421:   iload 30
L423:   iload_0
L424:   imul
L425:   isub
L426:   istore 6
L428:   iconst_0
L429:   istore_0
L430:   iload 4
L432:   bipush 16
L434:   ishl
L435:   istore 4
L437:   iload 7
L439:   bipush 16
L441:   ishl
L442:   istore 7
L444:   iload_1
L445:   ifge L468
L448:   iload 4
L450:   iload 31
L452:   iload_1
L453:   imul
L454:   isub
L455:   istore 4
L457:   iload 7
L459:   iload 32
L461:   iload_1
L462:   imul
L463:   isub
L464:   istore 7
L466:   iconst_0
L467:   istore_1
L468:   iload_0
L469:   getstatic Field OPPOFIOL G I
L472:   isub
L473:   istore 35
L475:   iload 20
L477:   iload 22
L479:   iload 35
L481:   imul
L482:   iadd
L483:   istore 20
L485:   iload 23
L487:   iload 25
L489:   iload 35
L491:   imul
L492:   iadd
L493:   istore 23
L495:   iload 26
L497:   iload 28
L499:   iload 35
L501:   imul
L502:   iadd
L503:   istore 26
L505:   iload_0
L506:   iload_1
L507:   if_icmpeq L517
L510:   iload 33
L512:   iload 29
L514:   if_icmplt L529
L517:   iload_0
L518:   iload_1
L519:   if_icmpne L761
L522:   iload 33
L524:   iload 31
L526:   if_icmple L761
L529:   iload_2
L530:   iload_1
L531:   isub
L532:   istore_2
L533:   iload_1
L534:   iload_0
L535:   isub
L536:   istore_1
L537:   getstatic Field OPPOFIOL L [I
L540:   iload_0
L541:   iaload
L542:   istore_0
L543:   iload 36
L545:   ifeq L643
L548:   getstatic Field AFCKELYG m [I
L551:   aload 19
L553:   iconst_0
L554:   iconst_0
L555:   iload_0
L556:   iload 5
L558:   bipush 16
L560:   ishr
L561:   iload_3
L562:   bipush 16
L564:   ishr
L565:   iload 8
L567:   bipush 8
L569:   ishr
L570:   iload 6
L572:   bipush 8
L574:   ishr
L575:   iload 20
L577:   iload 23
L579:   iload 26
L581:   iload 21
L583:   iload 24
L585:   iload 27
L587:   invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L590:   iload 5
L592:   iload 33
L594:   iadd
L595:   istore 5
L597:   iload_3
L598:   iload 29
L600:   iadd
L601:   istore_3
L602:   iload 8
L604:   iload 34
L606:   iadd
L607:   istore 8
L609:   iload 6
L611:   iload 30
L613:   iadd
L614:   istore 6
L616:   iload_0
L617:   getstatic Field AFCKELYG n I
L620:   iadd
L621:   istore_0
L622:   iload 20
L624:   iload 22
L626:   iadd
L627:   istore 20
L629:   iload 23
L631:   iload 25
L633:   iadd
L634:   istore 23
L636:   iload 26
L638:   iload 28
L640:   iadd
L641:   istore 26
L643:   iinc 1 -1
L646:   iload_1
L647:   ifge L548
L650:   iload 36
L652:   ifeq L753
L655:   getstatic Field AFCKELYG m [I
L658:   aload 19
L660:   iconst_0
L661:   iconst_0
L662:   iload_0
L663:   iload 5
L665:   bipush 16
L667:   ishr
L668:   iload 4
L670:   bipush 16
L672:   ishr
L673:   iload 8
L675:   bipush 8
L677:   ishr
L678:   iload 7
L680:   bipush 8
L682:   ishr
L683:   iload 20
L685:   iload 23
L687:   iload 26
L689:   iload 21
L691:   iload 24
L693:   iload 27
L695:   invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L698:   iload 5
L700:   iload 33
L702:   iadd
L703:   istore 5
L705:   iload 4
L707:   iload 31
L709:   iadd
L710:   istore 4
L712:   iload 8
L714:   iload 34
L716:   iadd
L717:   istore 8
L719:   iload 7
L721:   iload 32
L723:   iadd
L724:   istore 7
L726:   iload_0
L727:   getstatic Field AFCKELYG n I
L730:   iadd
L731:   istore_0
L732:   iload 20
L734:   iload 22
L736:   iadd
L737:   istore 20
L739:   iload 23
L741:   iload 25
L743:   iadd
L744:   istore 23
L746:   iload 26
L748:   iload 28
L750:   iadd
L751:   istore 26
L753:   iinc 2 -1
L756:   iload_2
L757:   ifge L655
L760:   return
L761:   iload_2
L762:   iload_1
L763:   isub
L764:   istore_2
L765:   iload_1
L766:   iload_0
L767:   isub
L768:   istore_1
L769:   getstatic Field OPPOFIOL L [I
L772:   iload_0
L773:   iaload
L774:   istore_0
L775:   iload 36
L777:   ifeq L875
L780:   getstatic Field AFCKELYG m [I
L783:   aload 19
L785:   iconst_0
L786:   iconst_0
L787:   iload_0
L788:   iload_3
L789:   bipush 16
L791:   ishr
L792:   iload 5
L794:   bipush 16
L796:   ishr
L797:   iload 6
L799:   bipush 8
L801:   ishr
L802:   iload 8
L804:   bipush 8
L806:   ishr
L807:   iload 20
L809:   iload 23
L811:   iload 26
L813:   iload 21
L815:   iload 24
L817:   iload 27
L819:   invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L822:   iload 5
L824:   iload 33
L826:   iadd
L827:   istore 5
L829:   iload_3
L830:   iload 29
L832:   iadd
L833:   istore_3
L834:   iload 8
L836:   iload 34
L838:   iadd
L839:   istore 8
L841:   iload 6
L843:   iload 30
L845:   iadd
L846:   istore 6
L848:   iload_0
L849:   getstatic Field AFCKELYG n I
L852:   iadd
L853:   istore_0
L854:   iload 20
L856:   iload 22
L858:   iadd
L859:   istore 20
L861:   iload 23
L863:   iload 25
L865:   iadd
L866:   istore 23
L868:   iload 26
L870:   iload 28
L872:   iadd
L873:   istore 26
L875:   iinc 1 -1
L878:   iload_1
L879:   ifge L780
L882:   iload 36
L884:   ifeq L985
L887:   getstatic Field AFCKELYG m [I
L890:   aload 19
L892:   iconst_0
L893:   iconst_0
L894:   iload_0
L895:   iload 4
L897:   bipush 16
L899:   ishr
L900:   iload 5
L902:   bipush 16
L904:   ishr
L905:   iload 7
L907:   bipush 8
L909:   ishr
L910:   iload 8
L912:   bipush 8
L914:   ishr
L915:   iload 20
L917:   iload 23
L919:   iload 26
L921:   iload 21
L923:   iload 24
L925:   iload 27
L927:   invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L930:   iload 5
L932:   iload 33
L934:   iadd
L935:   istore 5
L937:   iload 4
L939:   iload 31
L941:   iadd
L942:   istore 4
L944:   iload 8
L946:   iload 34
L948:   iadd
L949:   istore 8
L951:   iload 7
L953:   iload 32
L955:   iadd
L956:   istore 7
L958:   iload_0
L959:   getstatic Field AFCKELYG n I
L962:   iadd
L963:   istore_0
L964:   iload 20
L966:   iload 22
L968:   iadd
L969:   istore 20
L971:   iload 23
L973:   iload 25
L975:   iadd
L976:   istore 23
L978:   iload 26
L980:   iload 28
L982:   iadd
L983:   istore 26
L985:   iinc 2 -1
L988:   iload_2
L989:   ifge L887
L992:   return
L993:   iload_3
L994:   bipush 16
L996:   ishl
L997:   dup
L998:   istore_3
L999:   istore 4
L1001:  iload 6
L1003:  bipush 16
L1005:  ishl
L1006:  dup
L1007:  istore 6
L1009:  istore 7
L1011:  iload_0
L1012:  ifge L1051
L1015:  iload 4
L1017:  iload 33
L1019:  iload_0
L1020:  imul
L1021:  isub
L1022:  istore 4
L1024:  iload_3
L1025:  iload 29
L1027:  iload_0
L1028:  imul
L1029:  isub
L1030:  istore_3
L1031:  iload 7
L1033:  iload 34
L1035:  iload_0
L1036:  imul
L1037:  isub
L1038:  istore 7
L1040:  iload 6
L1042:  iload 30
L1044:  iload_0
L1045:  imul
L1046:  isub
L1047:  istore 6
L1049:  iconst_0
L1050:  istore_0
L1051:  iload 5
L1053:  bipush 16
L1055:  ishl
L1056:  istore 5
L1058:  iload 8
L1060:  bipush 16
L1062:  ishl
L1063:  istore 8
L1065:  iload_2
L1066:  ifge L1089
L1069:  iload 5
L1071:  iload 31
L1073:  iload_2
L1074:  imul
L1075:  isub
L1076:  istore 5
L1078:  iload 8
L1080:  iload 32
L1082:  iload_2
L1083:  imul
L1084:  isub
L1085:  istore 8
L1087:  iconst_0
L1088:  istore_2
L1089:  iload_0
L1090:  getstatic Field OPPOFIOL G I
L1093:  isub
L1094:  istore 35
L1096:  iload 20
L1098:  iload 22
L1100:  iload 35
L1102:  imul
L1103:  iadd
L1104:  istore 20
L1106:  iload 23
L1108:  iload 25
L1110:  iload 35
L1112:  imul
L1113:  iadd
L1114:  istore 23
L1116:  iload 26
L1118:  iload 28
L1120:  iload 35
L1122:  imul
L1123:  iadd
L1124:  istore 26
L1126:  iload_0
L1127:  iload_2
L1128:  if_icmpeq L1138
L1131:  iload 33
L1133:  iload 29
L1135:  if_icmplt L1150
L1138:  iload_0
L1139:  iload_2
L1140:  if_icmpne L1379
L1143:  iload 31
L1145:  iload 29
L1147:  if_icmple L1379
L1150:  iload_1
L1151:  iload_2
L1152:  isub
L1153:  istore_1
L1154:  iload_2
L1155:  iload_0
L1156:  isub
L1157:  istore_2
L1158:  getstatic Field OPPOFIOL L [I
L1161:  iload_0
L1162:  iaload
L1163:  istore_0
L1164:  iload 36
L1166:  ifeq L1264
L1169:  getstatic Field AFCKELYG m [I
L1172:  aload 19
L1174:  iconst_0
L1175:  iconst_0
L1176:  iload_0
L1177:  iload 4
L1179:  bipush 16
L1181:  ishr
L1182:  iload_3
L1183:  bipush 16
L1185:  ishr
L1186:  iload 7
L1188:  bipush 8
L1190:  ishr
L1191:  iload 6
L1193:  bipush 8
L1195:  ishr
L1196:  iload 20
L1198:  iload 23
L1200:  iload 26
L1202:  iload 21
L1204:  iload 24
L1206:  iload 27
L1208:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L1211:  iload 4
L1213:  iload 33
L1215:  iadd
L1216:  istore 4
L1218:  iload_3
L1219:  iload 29
L1221:  iadd
L1222:  istore_3
L1223:  iload 7
L1225:  iload 34
L1227:  iadd
L1228:  istore 7
L1230:  iload 6
L1232:  iload 30
L1234:  iadd
L1235:  istore 6
L1237:  iload_0
L1238:  getstatic Field AFCKELYG n I
L1241:  iadd
L1242:  istore_0
L1243:  iload 20
L1245:  iload 22
L1247:  iadd
L1248:  istore 20
L1250:  iload 23
L1252:  iload 25
L1254:  iadd
L1255:  istore 23
L1257:  iload 26
L1259:  iload 28
L1261:  iadd
L1262:  istore 26
L1264:  iinc 2 -1
L1267:  iload_2
L1268:  ifge L1169
L1271:  iload 36
L1273:  ifeq L1371
L1276:  getstatic Field AFCKELYG m [I
L1279:  aload 19
L1281:  iconst_0
L1282:  iconst_0
L1283:  iload_0
L1284:  iload 5
L1286:  bipush 16
L1288:  ishr
L1289:  iload_3
L1290:  bipush 16
L1292:  ishr
L1293:  iload 8
L1295:  bipush 8
L1297:  ishr
L1298:  iload 6
L1300:  bipush 8
L1302:  ishr
L1303:  iload 20
L1305:  iload 23
L1307:  iload 26
L1309:  iload 21
L1311:  iload 24
L1313:  iload 27
L1315:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L1318:  iload 5
L1320:  iload 31
L1322:  iadd
L1323:  istore 5
L1325:  iload_3
L1326:  iload 29
L1328:  iadd
L1329:  istore_3
L1330:  iload 8
L1332:  iload 32
L1334:  iadd
L1335:  istore 8
L1337:  iload 6
L1339:  iload 30
L1341:  iadd
L1342:  istore 6
L1344:  iload_0
L1345:  getstatic Field AFCKELYG n I
L1348:  iadd
L1349:  istore_0
L1350:  iload 20
L1352:  iload 22
L1354:  iadd
L1355:  istore 20
L1357:  iload 23
L1359:  iload 25
L1361:  iadd
L1362:  istore 23
L1364:  iload 26
L1366:  iload 28
L1368:  iadd
L1369:  istore 26
L1371:  iinc 1 -1
L1374:  iload_1
L1375:  ifge L1276
L1378:  return
L1379:  iload_1
L1380:  iload_2
L1381:  isub
L1382:  istore_1
L1383:  iload_2
L1384:  iload_0
L1385:  isub
L1386:  istore_2
L1387:  getstatic Field OPPOFIOL L [I
L1390:  iload_0
L1391:  iaload
L1392:  istore_0
L1393:  iload 36
L1395:  ifeq L1493
L1398:  getstatic Field AFCKELYG m [I
L1401:  aload 19
L1403:  iconst_0
L1404:  iconst_0
L1405:  iload_0
L1406:  iload_3
L1407:  bipush 16
L1409:  ishr
L1410:  iload 4
L1412:  bipush 16
L1414:  ishr
L1415:  iload 6
L1417:  bipush 8
L1419:  ishr
L1420:  iload 7
L1422:  bipush 8
L1424:  ishr
L1425:  iload 20
L1427:  iload 23
L1429:  iload 26
L1431:  iload 21
L1433:  iload 24
L1435:  iload 27
L1437:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L1440:  iload 4
L1442:  iload 33
L1444:  iadd
L1445:  istore 4
L1447:  iload_3
L1448:  iload 29
L1450:  iadd
L1451:  istore_3
L1452:  iload 7
L1454:  iload 34
L1456:  iadd
L1457:  istore 7
L1459:  iload 6
L1461:  iload 30
L1463:  iadd
L1464:  istore 6
L1466:  iload_0
L1467:  getstatic Field AFCKELYG n I
L1470:  iadd
L1471:  istore_0
L1472:  iload 20
L1474:  iload 22
L1476:  iadd
L1477:  istore 20
L1479:  iload 23
L1481:  iload 25
L1483:  iadd
L1484:  istore 23
L1486:  iload 26
L1488:  iload 28
L1490:  iadd
L1491:  istore 26
L1493:  iinc 2 -1
L1496:  iload_2
L1497:  ifge L1398
L1500:  iload 36
L1502:  ifeq L1600
L1505:  getstatic Field AFCKELYG m [I
L1508:  aload 19
L1510:  iconst_0
L1511:  iconst_0
L1512:  iload_0
L1513:  iload_3
L1514:  bipush 16
L1516:  ishr
L1517:  iload 5
L1519:  bipush 16
L1521:  ishr
L1522:  iload 6
L1524:  bipush 8
L1526:  ishr
L1527:  iload 8
L1529:  bipush 8
L1531:  ishr
L1532:  iload 20
L1534:  iload 23
L1536:  iload 26
L1538:  iload 21
L1540:  iload 24
L1542:  iload 27
L1544:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L1547:  iload 5
L1549:  iload 31
L1551:  iadd
L1552:  istore 5
L1554:  iload_3
L1555:  iload 29
L1557:  iadd
L1558:  istore_3
L1559:  iload 8
L1561:  iload 32
L1563:  iadd
L1564:  istore 8
L1566:  iload 6
L1568:  iload 30
L1570:  iadd
L1571:  istore 6
L1573:  iload_0
L1574:  getstatic Field AFCKELYG n I
L1577:  iadd
L1578:  istore_0
L1579:  iload 20
L1581:  iload 22
L1583:  iadd
L1584:  istore 20
L1586:  iload 23
L1588:  iload 25
L1590:  iadd
L1591:  istore 23
L1593:  iload 26
L1595:  iload 28
L1597:  iadd
L1598:  istore 26
L1600:  iinc 1 -1
L1603:  iload_1
L1604:  ifge L1505
L1607:  return
L1608:  iload_1
L1609:  iload_2
L1610:  if_icmpgt L2868
L1613:  iload_1
L1614:  getstatic Field AFCKELYG q I
L1617:  if_icmplt L1621
L1620:  return
L1621:  iload_2
L1622:  getstatic Field AFCKELYG q I
L1625:  if_icmple L1632
L1628:  getstatic Field AFCKELYG q I
L1631:  istore_2
L1632:  iload_0
L1633:  getstatic Field AFCKELYG q I
L1636:  if_icmple L1643
L1639:  getstatic Field AFCKELYG q I
L1642:  istore_0
L1643:  iload_2
L1644:  iload_0
L1645:  if_icmpge L2264
L1648:  iload 4
L1650:  bipush 16
L1652:  ishl
L1653:  dup
L1654:  istore 4
L1656:  istore_3
L1657:  iload 7
L1659:  bipush 16
L1661:  ishl
L1662:  dup
L1663:  istore 7
L1665:  istore 6
L1667:  iload_1
L1668:  ifge L1707
L1671:  iload_3
L1672:  iload 29
L1674:  iload_1
L1675:  imul
L1676:  isub
L1677:  istore_3
L1678:  iload 4
L1680:  iload 31
L1682:  iload_1
L1683:  imul
L1684:  isub
L1685:  istore 4
L1687:  iload 6
L1689:  iload 30
L1691:  iload_1
L1692:  imul
L1693:  isub
L1694:  istore 6
L1696:  iload 7
L1698:  iload 32
L1700:  iload_1
L1701:  imul
L1702:  isub
L1703:  istore 7
L1705:  iconst_0
L1706:  istore_1
L1707:  iload 5
L1709:  bipush 16
L1711:  ishl
L1712:  istore 5
L1714:  iload 8
L1716:  bipush 16
L1718:  ishl
L1719:  istore 8
L1721:  iload_2
L1722:  ifge L1745
L1725:  iload 5
L1727:  iload 33
L1729:  iload_2
L1730:  imul
L1731:  isub
L1732:  istore 5
L1734:  iload 8
L1736:  iload 34
L1738:  iload_2
L1739:  imul
L1740:  isub
L1741:  istore 8
L1743:  iconst_0
L1744:  istore_2
L1745:  iload_1
L1746:  getstatic Field OPPOFIOL G I
L1749:  isub
L1750:  istore 35
L1752:  iload 20
L1754:  iload 22
L1756:  iload 35
L1758:  imul
L1759:  iadd
L1760:  istore 20
L1762:  iload 23
L1764:  iload 25
L1766:  iload 35
L1768:  imul
L1769:  iadd
L1770:  istore 23
L1772:  iload 26
L1774:  iload 28
L1776:  iload 35
L1778:  imul
L1779:  iadd
L1780:  istore 26
L1782:  iload_1
L1783:  iload_2
L1784:  if_icmpeq L1794
L1787:  iload 29
L1789:  iload 31
L1791:  if_icmplt L1806
L1794:  iload_1
L1795:  iload_2
L1796:  if_icmpne L2035
L1799:  iload 29
L1801:  iload 33
L1803:  if_icmple L2035
L1806:  iload_0
L1807:  iload_2
L1808:  isub
L1809:  istore_0
L1810:  iload_2
L1811:  iload_1
L1812:  isub
L1813:  istore_2
L1814:  getstatic Field OPPOFIOL L [I
L1817:  iload_1
L1818:  iaload
L1819:  istore_1
L1820:  iload 36
L1822:  ifeq L1920
L1825:  getstatic Field AFCKELYG m [I
L1828:  aload 19
L1830:  iconst_0
L1831:  iconst_0
L1832:  iload_1
L1833:  iload_3
L1834:  bipush 16
L1836:  ishr
L1837:  iload 4
L1839:  bipush 16
L1841:  ishr
L1842:  iload 6
L1844:  bipush 8
L1846:  ishr
L1847:  iload 7
L1849:  bipush 8
L1851:  ishr
L1852:  iload 20
L1854:  iload 23
L1856:  iload 26
L1858:  iload 21
L1860:  iload 24
L1862:  iload 27
L1864:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L1867:  iload_3
L1868:  iload 29
L1870:  iadd
L1871:  istore_3
L1872:  iload 4
L1874:  iload 31
L1876:  iadd
L1877:  istore 4
L1879:  iload 6
L1881:  iload 30
L1883:  iadd
L1884:  istore 6
L1886:  iload 7
L1888:  iload 32
L1890:  iadd
L1891:  istore 7
L1893:  iload_1
L1894:  getstatic Field AFCKELYG n I
L1897:  iadd
L1898:  istore_1
L1899:  iload 20
L1901:  iload 22
L1903:  iadd
L1904:  istore 20
L1906:  iload 23
L1908:  iload 25
L1910:  iadd
L1911:  istore 23
L1913:  iload 26
L1915:  iload 28
L1917:  iadd
L1918:  istore 26
L1920:  iinc 2 -1
L1923:  iload_2
L1924:  ifge L1825
L1927:  iload 36
L1929:  ifeq L2027
L1932:  getstatic Field AFCKELYG m [I
L1935:  aload 19
L1937:  iconst_0
L1938:  iconst_0
L1939:  iload_1
L1940:  iload_3
L1941:  bipush 16
L1943:  ishr
L1944:  iload 5
L1946:  bipush 16
L1948:  ishr
L1949:  iload 6
L1951:  bipush 8
L1953:  ishr
L1954:  iload 8
L1956:  bipush 8
L1958:  ishr
L1959:  iload 20
L1961:  iload 23
L1963:  iload 26
L1965:  iload 21
L1967:  iload 24
L1969:  iload 27
L1971:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L1974:  iload_3
L1975:  iload 29
L1977:  iadd
L1978:  istore_3
L1979:  iload 5
L1981:  iload 33
L1983:  iadd
L1984:  istore 5
L1986:  iload 6
L1988:  iload 30
L1990:  iadd
L1991:  istore 6
L1993:  iload 8
L1995:  iload 34
L1997:  iadd
L1998:  istore 8
L2000:  iload_1
L2001:  getstatic Field AFCKELYG n I
L2004:  iadd
L2005:  istore_1
L2006:  iload 20
L2008:  iload 22
L2010:  iadd
L2011:  istore 20
L2013:  iload 23
L2015:  iload 25
L2017:  iadd
L2018:  istore 23
L2020:  iload 26
L2022:  iload 28
L2024:  iadd
L2025:  istore 26
L2027:  iinc 0 -1
L2030:  iload_0
L2031:  ifge L1932
L2034:  return
L2035:  iload_0
L2036:  iload_2
L2037:  isub
L2038:  istore_0
L2039:  iload_2
L2040:  iload_1
L2041:  isub
L2042:  istore_2
L2043:  getstatic Field OPPOFIOL L [I
L2046:  iload_1
L2047:  iaload
L2048:  istore_1
L2049:  iload 36
L2051:  ifeq L2149
L2054:  getstatic Field AFCKELYG m [I
L2057:  aload 19
L2059:  iconst_0
L2060:  iconst_0
L2061:  iload_1
L2062:  iload 4
L2064:  bipush 16
L2066:  ishr
L2067:  iload_3
L2068:  bipush 16
L2070:  ishr
L2071:  iload 7
L2073:  bipush 8
L2075:  ishr
L2076:  iload 6
L2078:  bipush 8
L2080:  ishr
L2081:  iload 20
L2083:  iload 23
L2085:  iload 26
L2087:  iload 21
L2089:  iload 24
L2091:  iload 27
L2093:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L2096:  iload_3
L2097:  iload 29
L2099:  iadd
L2100:  istore_3
L2101:  iload 4
L2103:  iload 31
L2105:  iadd
L2106:  istore 4
L2108:  iload 6
L2110:  iload 30
L2112:  iadd
L2113:  istore 6
L2115:  iload 7
L2117:  iload 32
L2119:  iadd
L2120:  istore 7
L2122:  iload_1
L2123:  getstatic Field AFCKELYG n I
L2126:  iadd
L2127:  istore_1
L2128:  iload 20
L2130:  iload 22
L2132:  iadd
L2133:  istore 20
L2135:  iload 23
L2137:  iload 25
L2139:  iadd
L2140:  istore 23
L2142:  iload 26
L2144:  iload 28
L2146:  iadd
L2147:  istore 26
L2149:  iinc 2 -1
L2152:  iload_2
L2153:  ifge L2054
L2156:  iload 36
L2158:  ifeq L2256
L2161:  getstatic Field AFCKELYG m [I
L2164:  aload 19
L2166:  iconst_0
L2167:  iconst_0
L2168:  iload_1
L2169:  iload 5
L2171:  bipush 16
L2173:  ishr
L2174:  iload_3
L2175:  bipush 16
L2177:  ishr
L2178:  iload 8
L2180:  bipush 8
L2182:  ishr
L2183:  iload 6
L2185:  bipush 8
L2187:  ishr
L2188:  iload 20
L2190:  iload 23
L2192:  iload 26
L2194:  iload 21
L2196:  iload 24
L2198:  iload 27
L2200:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L2203:  iload_3
L2204:  iload 29
L2206:  iadd
L2207:  istore_3
L2208:  iload 5
L2210:  iload 33
L2212:  iadd
L2213:  istore 5
L2215:  iload 6
L2217:  iload 30
L2219:  iadd
L2220:  istore 6
L2222:  iload 8
L2224:  iload 34
L2226:  iadd
L2227:  istore 8
L2229:  iload_1
L2230:  getstatic Field AFCKELYG n I
L2233:  iadd
L2234:  istore_1
L2235:  iload 20
L2237:  iload 22
L2239:  iadd
L2240:  istore 20
L2242:  iload 23
L2244:  iload 25
L2246:  iadd
L2247:  istore 23
L2249:  iload 26
L2251:  iload 28
L2253:  iadd
L2254:  istore 26
L2256:  iinc 0 -1
L2259:  iload_0
L2260:  ifge L2161
L2263:  return
L2264:  iload 4
L2266:  bipush 16
L2268:  ishl
L2269:  dup
L2270:  istore 4
L2272:  istore 5
L2274:  iload 7
L2276:  bipush 16
L2278:  ishl
L2279:  dup
L2280:  istore 7
L2282:  istore 8
L2284:  iload_1
L2285:  ifge L2326
L2288:  iload 5
L2290:  iload 29
L2292:  iload_1
L2293:  imul
L2294:  isub
L2295:  istore 5
L2297:  iload 4
L2299:  iload 31
L2301:  iload_1
L2302:  imul
L2303:  isub
L2304:  istore 4
L2306:  iload 8
L2308:  iload 30
L2310:  iload_1
L2311:  imul
L2312:  isub
L2313:  istore 8
L2315:  iload 7
L2317:  iload 32
L2319:  iload_1
L2320:  imul
L2321:  isub
L2322:  istore 7
L2324:  iconst_0
L2325:  istore_1
L2326:  iload_3
L2327:  bipush 16
L2329:  ishl
L2330:  istore_3
L2331:  iload 6
L2333:  bipush 16
L2335:  ishl
L2336:  istore 6
L2338:  iload_0
L2339:  ifge L2360
L2342:  iload_3
L2343:  iload 33
L2345:  iload_0
L2346:  imul
L2347:  isub
L2348:  istore_3
L2349:  iload 6
L2351:  iload 34
L2353:  iload_0
L2354:  imul
L2355:  isub
L2356:  istore 6
L2358:  iconst_0
L2359:  istore_0
L2360:  iload_1
L2361:  getstatic Field OPPOFIOL G I
L2364:  isub
L2365:  istore 35
L2367:  iload 20
L2369:  iload 22
L2371:  iload 35
L2373:  imul
L2374:  iadd
L2375:  istore 20
L2377:  iload 23
L2379:  iload 25
L2381:  iload 35
L2383:  imul
L2384:  iadd
L2385:  istore 23
L2387:  iload 26
L2389:  iload 28
L2391:  iload 35
L2393:  imul
L2394:  iadd
L2395:  istore 26
L2397:  iload 29
L2399:  iload 31
L2401:  if_icmpge L2636
L2404:  iload_2
L2405:  iload_0
L2406:  isub
L2407:  istore_2
L2408:  iload_0
L2409:  iload_1
L2410:  isub
L2411:  istore_0
L2412:  getstatic Field OPPOFIOL L [I
L2415:  iload_1
L2416:  iaload
L2417:  istore_1
L2418:  iload 36
L2420:  ifeq L2521
L2423:  getstatic Field AFCKELYG m [I
L2426:  aload 19
L2428:  iconst_0
L2429:  iconst_0
L2430:  iload_1
L2431:  iload 5
L2433:  bipush 16
L2435:  ishr
L2436:  iload 4
L2438:  bipush 16
L2440:  ishr
L2441:  iload 8
L2443:  bipush 8
L2445:  ishr
L2446:  iload 7
L2448:  bipush 8
L2450:  ishr
L2451:  iload 20
L2453:  iload 23
L2455:  iload 26
L2457:  iload 21
L2459:  iload 24
L2461:  iload 27
L2463:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L2466:  iload 5
L2468:  iload 29
L2470:  iadd
L2471:  istore 5
L2473:  iload 4
L2475:  iload 31
L2477:  iadd
L2478:  istore 4
L2480:  iload 8
L2482:  iload 30
L2484:  iadd
L2485:  istore 8
L2487:  iload 7
L2489:  iload 32
L2491:  iadd
L2492:  istore 7
L2494:  iload_1
L2495:  getstatic Field AFCKELYG n I
L2498:  iadd
L2499:  istore_1
L2500:  iload 20
L2502:  iload 22
L2504:  iadd
L2505:  istore 20
L2507:  iload 23
L2509:  iload 25
L2511:  iadd
L2512:  istore 23
L2514:  iload 26
L2516:  iload 28
L2518:  iadd
L2519:  istore 26
L2521:  iinc 0 -1
L2524:  iload_0
L2525:  ifge L2423
L2528:  iload 36
L2530:  ifeq L2628
L2533:  getstatic Field AFCKELYG m [I
L2536:  aload 19
L2538:  iconst_0
L2539:  iconst_0
L2540:  iload_1
L2541:  iload_3
L2542:  bipush 16
L2544:  ishr
L2545:  iload 4
L2547:  bipush 16
L2549:  ishr
L2550:  iload 6
L2552:  bipush 8
L2554:  ishr
L2555:  iload 7
L2557:  bipush 8
L2559:  ishr
L2560:  iload 20
L2562:  iload 23
L2564:  iload 26
L2566:  iload 21
L2568:  iload 24
L2570:  iload 27
L2572:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L2575:  iload_3
L2576:  iload 33
L2578:  iadd
L2579:  istore_3
L2580:  iload 4
L2582:  iload 31
L2584:  iadd
L2585:  istore 4
L2587:  iload 6
L2589:  iload 34
L2591:  iadd
L2592:  istore 6
L2594:  iload 7
L2596:  iload 32
L2598:  iadd
L2599:  istore 7
L2601:  iload_1
L2602:  getstatic Field AFCKELYG n I
L2605:  iadd
L2606:  istore_1
L2607:  iload 20
L2609:  iload 22
L2611:  iadd
L2612:  istore 20
L2614:  iload 23
L2616:  iload 25
L2618:  iadd
L2619:  istore 23
L2621:  iload 26
L2623:  iload 28
L2625:  iadd
L2626:  istore 26
L2628:  iinc 2 -1
L2631:  iload_2
L2632:  ifge L2533
L2635:  return
L2636:  iload_2
L2637:  iload_0
L2638:  isub
L2639:  istore_2
L2640:  iload_0
L2641:  iload_1
L2642:  isub
L2643:  istore_0
L2644:  getstatic Field OPPOFIOL L [I
L2647:  iload_1
L2648:  iaload
L2649:  istore_1
L2650:  iload 36
L2652:  ifeq L2753
L2655:  getstatic Field AFCKELYG m [I
L2658:  aload 19
L2660:  iconst_0
L2661:  iconst_0
L2662:  iload_1
L2663:  iload 4
L2665:  bipush 16
L2667:  ishr
L2668:  iload 5
L2670:  bipush 16
L2672:  ishr
L2673:  iload 7
L2675:  bipush 8
L2677:  ishr
L2678:  iload 8
L2680:  bipush 8
L2682:  ishr
L2683:  iload 20
L2685:  iload 23
L2687:  iload 26
L2689:  iload 21
L2691:  iload 24
L2693:  iload 27
L2695:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L2698:  iload 5
L2700:  iload 29
L2702:  iadd
L2703:  istore 5
L2705:  iload 4
L2707:  iload 31
L2709:  iadd
L2710:  istore 4
L2712:  iload 8
L2714:  iload 30
L2716:  iadd
L2717:  istore 8
L2719:  iload 7
L2721:  iload 32
L2723:  iadd
L2724:  istore 7
L2726:  iload_1
L2727:  getstatic Field AFCKELYG n I
L2730:  iadd
L2731:  istore_1
L2732:  iload 20
L2734:  iload 22
L2736:  iadd
L2737:  istore 20
L2739:  iload 23
L2741:  iload 25
L2743:  iadd
L2744:  istore 23
L2746:  iload 26
L2748:  iload 28
L2750:  iadd
L2751:  istore 26
L2753:  iinc 0 -1
L2756:  iload_0
L2757:  ifge L2655
L2760:  iload 36
L2762:  ifeq L2860
L2765:  getstatic Field AFCKELYG m [I
L2768:  aload 19
L2770:  iconst_0
L2771:  iconst_0
L2772:  iload_1
L2773:  iload 4
L2775:  bipush 16
L2777:  ishr
L2778:  iload_3
L2779:  bipush 16
L2781:  ishr
L2782:  iload 7
L2784:  bipush 8
L2786:  ishr
L2787:  iload 6
L2789:  bipush 8
L2791:  ishr
L2792:  iload 20
L2794:  iload 23
L2796:  iload 26
L2798:  iload 21
L2800:  iload 24
L2802:  iload 27
L2804:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L2807:  iload_3
L2808:  iload 33
L2810:  iadd
L2811:  istore_3
L2812:  iload 4
L2814:  iload 31
L2816:  iadd
L2817:  istore 4
L2819:  iload 6
L2821:  iload 34
L2823:  iadd
L2824:  istore 6
L2826:  iload 7
L2828:  iload 32
L2830:  iadd
L2831:  istore 7
L2833:  iload_1
L2834:  getstatic Field AFCKELYG n I
L2837:  iadd
L2838:  istore_1
L2839:  iload 20
L2841:  iload 22
L2843:  iadd
L2844:  istore 20
L2846:  iload 23
L2848:  iload 25
L2850:  iadd
L2851:  istore 23
L2853:  iload 26
L2855:  iload 28
L2857:  iadd
L2858:  istore 26
L2860:  iinc 2 -1
L2863:  iload_2
L2864:  ifge L2765
L2867:  return
L2868:  iload_2
L2869:  getstatic Field AFCKELYG q I
L2872:  if_icmplt L2876
L2875:  return
L2876:  iload_0
L2877:  getstatic Field AFCKELYG q I
L2880:  if_icmple L2887
L2883:  getstatic Field AFCKELYG q I
L2886:  istore_0
L2887:  iload_1
L2888:  getstatic Field AFCKELYG q I
L2891:  if_icmple L2898
L2894:  getstatic Field AFCKELYG q I
L2897:  istore_1
L2898:  iload_0
L2899:  iload_1
L2900:  if_icmpge L3507
L2903:  iload 5
L2905:  bipush 16
L2907:  ishl
L2908:  dup
L2909:  istore 5
L2911:  istore 4
L2913:  iload 8
L2915:  bipush 16
L2917:  ishl
L2918:  dup
L2919:  istore 8
L2921:  istore 7
L2923:  iload_2
L2924:  ifge L2965
L2927:  iload 4
L2929:  iload 31
L2931:  iload_2
L2932:  imul
L2933:  isub
L2934:  istore 4
L2936:  iload 5
L2938:  iload 33
L2940:  iload_2
L2941:  imul
L2942:  isub
L2943:  istore 5
L2945:  iload 7
L2947:  iload 32
L2949:  iload_2
L2950:  imul
L2951:  isub
L2952:  istore 7
L2954:  iload 8
L2956:  iload 34
L2958:  iload_2
L2959:  imul
L2960:  isub
L2961:  istore 8
L2963:  iconst_0
L2964:  istore_2
L2965:  iload_3
L2966:  bipush 16
L2968:  ishl
L2969:  istore_3
L2970:  iload 6
L2972:  bipush 16
L2974:  ishl
L2975:  istore 6
L2977:  iload_0
L2978:  ifge L2999
L2981:  iload_3
L2982:  iload 29
L2984:  iload_0
L2985:  imul
L2986:  isub
L2987:  istore_3
L2988:  iload 6
L2990:  iload 30
L2992:  iload_0
L2993:  imul
L2994:  isub
L2995:  istore 6
L2997:  iconst_0
L2998:  istore_0
L2999:  iload_2
L3000:  getstatic Field OPPOFIOL G I
L3003:  isub
L3004:  istore 35
L3006:  iload 20
L3008:  iload 22
L3010:  iload 35
L3012:  imul
L3013:  iadd
L3014:  istore 20
L3016:  iload 23
L3018:  iload 25
L3020:  iload 35
L3022:  imul
L3023:  iadd
L3024:  istore 23
L3026:  iload 26
L3028:  iload 28
L3030:  iload 35
L3032:  imul
L3033:  iadd
L3034:  istore 26
L3036:  iload 31
L3038:  iload 33
L3040:  if_icmpge L3275
L3043:  iload_1
L3044:  iload_0
L3045:  isub
L3046:  istore_1
L3047:  iload_0
L3048:  iload_2
L3049:  isub
L3050:  istore_0
L3051:  getstatic Field OPPOFIOL L [I
L3054:  iload_2
L3055:  iaload
L3056:  istore_2
L3057:  iload 36
L3059:  ifeq L3160
L3062:  getstatic Field AFCKELYG m [I
L3065:  aload 19
L3067:  iconst_0
L3068:  iconst_0
L3069:  iload_2
L3070:  iload 4
L3072:  bipush 16
L3074:  ishr
L3075:  iload 5
L3077:  bipush 16
L3079:  ishr
L3080:  iload 7
L3082:  bipush 8
L3084:  ishr
L3085:  iload 8
L3087:  bipush 8
L3089:  ishr
L3090:  iload 20
L3092:  iload 23
L3094:  iload 26
L3096:  iload 21
L3098:  iload 24
L3100:  iload 27
L3102:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L3105:  iload 4
L3107:  iload 31
L3109:  iadd
L3110:  istore 4
L3112:  iload 5
L3114:  iload 33
L3116:  iadd
L3117:  istore 5
L3119:  iload 7
L3121:  iload 32
L3123:  iadd
L3124:  istore 7
L3126:  iload 8
L3128:  iload 34
L3130:  iadd
L3131:  istore 8
L3133:  iload_2
L3134:  getstatic Field AFCKELYG n I
L3137:  iadd
L3138:  istore_2
L3139:  iload 20
L3141:  iload 22
L3143:  iadd
L3144:  istore 20
L3146:  iload 23
L3148:  iload 25
L3150:  iadd
L3151:  istore 23
L3153:  iload 26
L3155:  iload 28
L3157:  iadd
L3158:  istore 26
L3160:  iinc 0 -1
L3163:  iload_0
L3164:  ifge L3062
L3167:  iload 36
L3169:  ifeq L3267
L3172:  getstatic Field AFCKELYG m [I
L3175:  aload 19
L3177:  iconst_0
L3178:  iconst_0
L3179:  iload_2
L3180:  iload 4
L3182:  bipush 16
L3184:  ishr
L3185:  iload_3
L3186:  bipush 16
L3188:  ishr
L3189:  iload 7
L3191:  bipush 8
L3193:  ishr
L3194:  iload 6
L3196:  bipush 8
L3198:  ishr
L3199:  iload 20
L3201:  iload 23
L3203:  iload 26
L3205:  iload 21
L3207:  iload 24
L3209:  iload 27
L3211:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L3214:  iload 4
L3216:  iload 31
L3218:  iadd
L3219:  istore 4
L3221:  iload_3
L3222:  iload 29
L3224:  iadd
L3225:  istore_3
L3226:  iload 7
L3228:  iload 32
L3230:  iadd
L3231:  istore 7
L3233:  iload 6
L3235:  iload 30
L3237:  iadd
L3238:  istore 6
L3240:  iload_2
L3241:  getstatic Field AFCKELYG n I
L3244:  iadd
L3245:  istore_2
L3246:  iload 20
L3248:  iload 22
L3250:  iadd
L3251:  istore 20
L3253:  iload 23
L3255:  iload 25
L3257:  iadd
L3258:  istore 23
L3260:  iload 26
L3262:  iload 28
L3264:  iadd
L3265:  istore 26
L3267:  iinc 1 -1
L3270:  iload_1
L3271:  ifge L3172
L3274:  return
L3275:  iload_1
L3276:  iload_0
L3277:  isub
L3278:  istore_1
L3279:  iload_0
L3280:  iload_2
L3281:  isub
L3282:  istore_0
L3283:  getstatic Field OPPOFIOL L [I
L3286:  iload_2
L3287:  iaload
L3288:  istore_2
L3289:  iload 36
L3291:  ifeq L3392
L3294:  getstatic Field AFCKELYG m [I
L3297:  aload 19
L3299:  iconst_0
L3300:  iconst_0
L3301:  iload_2
L3302:  iload 5
L3304:  bipush 16
L3306:  ishr
L3307:  iload 4
L3309:  bipush 16
L3311:  ishr
L3312:  iload 8
L3314:  bipush 8
L3316:  ishr
L3317:  iload 7
L3319:  bipush 8
L3321:  ishr
L3322:  iload 20
L3324:  iload 23
L3326:  iload 26
L3328:  iload 21
L3330:  iload 24
L3332:  iload 27
L3334:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L3337:  iload 4
L3339:  iload 31
L3341:  iadd
L3342:  istore 4
L3344:  iload 5
L3346:  iload 33
L3348:  iadd
L3349:  istore 5
L3351:  iload 7
L3353:  iload 32
L3355:  iadd
L3356:  istore 7
L3358:  iload 8
L3360:  iload 34
L3362:  iadd
L3363:  istore 8
L3365:  iload_2
L3366:  getstatic Field AFCKELYG n I
L3369:  iadd
L3370:  istore_2
L3371:  iload 20
L3373:  iload 22
L3375:  iadd
L3376:  istore 20
L3378:  iload 23
L3380:  iload 25
L3382:  iadd
L3383:  istore 23
L3385:  iload 26
L3387:  iload 28
L3389:  iadd
L3390:  istore 26
L3392:  iinc 0 -1
L3395:  iload_0
L3396:  ifge L3294
L3399:  iload 36
L3401:  ifeq L3499
L3404:  getstatic Field AFCKELYG m [I
L3407:  aload 19
L3409:  iconst_0
L3410:  iconst_0
L3411:  iload_2
L3412:  iload_3
L3413:  bipush 16
L3415:  ishr
L3416:  iload 4
L3418:  bipush 16
L3420:  ishr
L3421:  iload 6
L3423:  bipush 8
L3425:  ishr
L3426:  iload 7
L3428:  bipush 8
L3430:  ishr
L3431:  iload 20
L3433:  iload 23
L3435:  iload 26
L3437:  iload 21
L3439:  iload 24
L3441:  iload 27
L3443:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L3446:  iload 4
L3448:  iload 31
L3450:  iadd
L3451:  istore 4
L3453:  iload_3
L3454:  iload 29
L3456:  iadd
L3457:  istore_3
L3458:  iload 7
L3460:  iload 32
L3462:  iadd
L3463:  istore 7
L3465:  iload 6
L3467:  iload 30
L3469:  iadd
L3470:  istore 6
L3472:  iload_2
L3473:  getstatic Field AFCKELYG n I
L3476:  iadd
L3477:  istore_2
L3478:  iload 20
L3480:  iload 22
L3482:  iadd
L3483:  istore 20
L3485:  iload 23
L3487:  iload 25
L3489:  iadd
L3490:  istore 23
L3492:  iload 26
L3494:  iload 28
L3496:  iadd
L3497:  istore 26
L3499:  iinc 1 -1
L3502:  iload_1
L3503:  ifge L3404
L3506:  return
L3507:  iload 5
L3509:  bipush 16
L3511:  ishl
L3512:  dup
L3513:  istore 5
L3515:  istore_3
L3516:  iload 8
L3518:  bipush 16
L3520:  ishl
L3521:  dup
L3522:  istore 8
L3524:  istore 6
L3526:  iload_2
L3527:  ifge L3566
L3530:  iload_3
L3531:  iload 31
L3533:  iload_2
L3534:  imul
L3535:  isub
L3536:  istore_3
L3537:  iload 5
L3539:  iload 33
L3541:  iload_2
L3542:  imul
L3543:  isub
L3544:  istore 5
L3546:  iload 6
L3548:  iload 32
L3550:  iload_2
L3551:  imul
L3552:  isub
L3553:  istore 6
L3555:  iload 8
L3557:  iload 34
L3559:  iload_2
L3560:  imul
L3561:  isub
L3562:  istore 8
L3564:  iconst_0
L3565:  istore_2
L3566:  iload 4
L3568:  bipush 16
L3570:  ishl
L3571:  istore 4
L3573:  iload 7
L3575:  bipush 16
L3577:  ishl
L3578:  istore 7
L3580:  iload_1
L3581:  ifge L3604
L3584:  iload 4
L3586:  iload 29
L3588:  iload_1
L3589:  imul
L3590:  isub
L3591:  istore 4
L3593:  iload 7
L3595:  iload 30
L3597:  iload_1
L3598:  imul
L3599:  isub
L3600:  istore 7
L3602:  iconst_0
L3603:  istore_1
L3604:  iload_2
L3605:  getstatic Field OPPOFIOL G I
L3608:  isub
L3609:  istore 35
L3611:  iload 20
L3613:  iload 22
L3615:  iload 35
L3617:  imul
L3618:  iadd
L3619:  istore 20
L3621:  iload 23
L3623:  iload 25
L3625:  iload 35
L3627:  imul
L3628:  iadd
L3629:  istore 23
L3631:  iload 26
L3633:  iload 28
L3635:  iload 35
L3637:  imul
L3638:  iadd
L3639:  istore 26
L3641:  iload 31
L3643:  iload 33
L3645:  if_icmpge L3880
L3648:  iload_0
L3649:  iload_1
L3650:  isub
L3651:  istore_0
L3652:  iload_1
L3653:  iload_2
L3654:  isub
L3655:  istore_1
L3656:  getstatic Field OPPOFIOL L [I
L3659:  iload_2
L3660:  iaload
L3661:  istore_2
L3662:  iload 36
L3664:  ifeq L3762
L3667:  getstatic Field AFCKELYG m [I
L3670:  aload 19
L3672:  iconst_0
L3673:  iconst_0
L3674:  iload_2
L3675:  iload_3
L3676:  bipush 16
L3678:  ishr
L3679:  iload 5
L3681:  bipush 16
L3683:  ishr
L3684:  iload 6
L3686:  bipush 8
L3688:  ishr
L3689:  iload 8
L3691:  bipush 8
L3693:  ishr
L3694:  iload 20
L3696:  iload 23
L3698:  iload 26
L3700:  iload 21
L3702:  iload 24
L3704:  iload 27
L3706:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L3709:  iload_3
L3710:  iload 31
L3712:  iadd
L3713:  istore_3
L3714:  iload 5
L3716:  iload 33
L3718:  iadd
L3719:  istore 5
L3721:  iload 6
L3723:  iload 32
L3725:  iadd
L3726:  istore 6
L3728:  iload 8
L3730:  iload 34
L3732:  iadd
L3733:  istore 8
L3735:  iload_2
L3736:  getstatic Field AFCKELYG n I
L3739:  iadd
L3740:  istore_2
L3741:  iload 20
L3743:  iload 22
L3745:  iadd
L3746:  istore 20
L3748:  iload 23
L3750:  iload 25
L3752:  iadd
L3753:  istore 23
L3755:  iload 26
L3757:  iload 28
L3759:  iadd
L3760:  istore 26
L3762:  iinc 1 -1
L3765:  iload_1
L3766:  ifge L3667
L3769:  iload 36
L3771:  ifeq L3872
L3774:  getstatic Field AFCKELYG m [I
L3777:  aload 19
L3779:  iconst_0
L3780:  iconst_0
L3781:  iload_2
L3782:  iload 4
L3784:  bipush 16
L3786:  ishr
L3787:  iload 5
L3789:  bipush 16
L3791:  ishr
L3792:  iload 7
L3794:  bipush 8
L3796:  ishr
L3797:  iload 8
L3799:  bipush 8
L3801:  ishr
L3802:  iload 20
L3804:  iload 23
L3806:  iload 26
L3808:  iload 21
L3810:  iload 24
L3812:  iload 27
L3814:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L3817:  iload 4
L3819:  iload 29
L3821:  iadd
L3822:  istore 4
L3824:  iload 5
L3826:  iload 33
L3828:  iadd
L3829:  istore 5
L3831:  iload 7
L3833:  iload 30
L3835:  iadd
L3836:  istore 7
L3838:  iload 8
L3840:  iload 34
L3842:  iadd
L3843:  istore 8
L3845:  iload_2
L3846:  getstatic Field AFCKELYG n I
L3849:  iadd
L3850:  istore_2
L3851:  iload 20
L3853:  iload 22
L3855:  iadd
L3856:  istore 20
L3858:  iload 23
L3860:  iload 25
L3862:  iadd
L3863:  istore 23
L3865:  iload 26
L3867:  iload 28
L3869:  iadd
L3870:  istore 26
L3872:  iinc 0 -1
L3875:  iload_0
L3876:  ifge L3774
L3879:  return
L3880:  iload_0
L3881:  iload_1
L3882:  isub
L3883:  istore_0
L3884:  iload_1
L3885:  iload_2
L3886:  isub
L3887:  istore_1
L3888:  getstatic Field OPPOFIOL L [I
L3891:  iload_2
L3892:  iaload
L3893:  istore_2
L3894:  iload 36
L3896:  ifeq L3994
L3899:  getstatic Field AFCKELYG m [I
L3902:  aload 19
L3904:  iconst_0
L3905:  iconst_0
L3906:  iload_2
L3907:  iload 5
L3909:  bipush 16
L3911:  ishr
L3912:  iload_3
L3913:  bipush 16
L3915:  ishr
L3916:  iload 8
L3918:  bipush 8
L3920:  ishr
L3921:  iload 6
L3923:  bipush 8
L3925:  ishr
L3926:  iload 20
L3928:  iload 23
L3930:  iload 26
L3932:  iload 21
L3934:  iload 24
L3936:  iload 27
L3938:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L3941:  iload_3
L3942:  iload 31
L3944:  iadd
L3945:  istore_3
L3946:  iload 5
L3948:  iload 33
L3950:  iadd
L3951:  istore 5
L3953:  iload 6
L3955:  iload 32
L3957:  iadd
L3958:  istore 6
L3960:  iload 8
L3962:  iload 34
L3964:  iadd
L3965:  istore 8
L3967:  iload_2
L3968:  getstatic Field AFCKELYG n I
L3971:  iadd
L3972:  istore_2
L3973:  iload 20
L3975:  iload 22
L3977:  iadd
L3978:  istore 20
L3980:  iload 23
L3982:  iload 25
L3984:  iadd
L3985:  istore 23
L3987:  iload 26
L3989:  iload 28
L3991:  iadd
L3992:  istore 26
L3994:  iinc 1 -1
L3997:  iload_1
L3998:  ifge L3899
L4001:  iload 36
L4003:  ifeq L4104
L4006:  getstatic Field AFCKELYG m [I
L4009:  aload 19
L4011:  iconst_0
L4012:  iconst_0
L4013:  iload_2
L4014:  iload 5
L4016:  bipush 16
L4018:  ishr
L4019:  iload 4
L4021:  bipush 16
L4023:  ishr
L4024:  iload 8
L4026:  bipush 8
L4028:  ishr
L4029:  iload 7
L4031:  bipush 8
L4033:  ishr
L4034:  iload 20
L4036:  iload 23
L4038:  iload 26
L4040:  iload 21
L4042:  iload 24
L4044:  iload 27
L4046:  invokestatic Method OPPOFIOL a ([I[IIIIIIIIIIIIII)V
L4049:  iload 4
L4051:  iload 29
L4053:  iadd
L4054:  istore 4
L4056:  iload 5
L4058:  iload 33
L4060:  iadd
L4061:  istore 5
L4063:  iload 7
L4065:  iload 30
L4067:  iadd
L4068:  istore 7
L4070:  iload 8
L4072:  iload 34
L4074:  iadd
L4075:  istore 8
L4077:  iload_2
L4078:  getstatic Field AFCKELYG n I
L4081:  iadd
L4082:  istore_2
L4083:  iload 20
L4085:  iload 22
L4087:  iadd
L4088:  istore 20
L4090:  iload 23
L4092:  iload 25
L4094:  iadd
L4095:  istore 23
L4097:  iload 26
L4099:  iload 28
L4101:  iadd
L4102:  istore 26
L4104:  iinc 0 -1
L4107:  iload_0
L4108:  ifge L4006
L4111:  return
L4112:  
    .end code
.end method

.method public static final a : ([I[IIIIIIIIIIIIII)V
    .code stack 7 locals 26
L0:     getstatic Field XHHRODPC l Z
L3:     istore 25
L5:     iload 5
L7:     iload 6
L9:     if_icmplt L13
L12:    return
L13:    getstatic Field OPPOFIOL B Z
L16:    ifeq L99
L19:    iload 8
L21:    iload 7
L23:    isub
L24:    iload 6
L26:    iload 5
L28:    isub
L29:    idiv
L30:    istore 15
L32:    iload 6
L34:    getstatic Field AFCKELYG t I
L37:    if_icmple L45
L40:    getstatic Field AFCKELYG t I
L43:    istore 6
L45:    iload 5
L47:    ifge L63
L50:    iload 7
L52:    iload 5
L54:    iload 15
L56:    imul
L57:    isub
L58:    istore 7
L60:    iconst_0
L61:    istore 5
L63:    iload 5
L65:    iload 6
L67:    if_icmplt L71
L70:    return
L71:    iload 6
L73:    iload 5
L75:    isub
L76:    iconst_3
L77:    ishr
L78:    istore 16
L80:    iload 15
L82:    bipush 12
L84:    ishl
L85:    istore 15
L87:    iload 7
L89:    bipush 9
L91:    ishl
L92:    istore 7
L94:    iload 25
L96:    ifeq L153
L99:    iload 6
L101:   iload 5
L103:   isub
L104:   bipush 7
L106:   if_icmple L140
L109:   iload 6
L111:   iload 5
L113:   isub
L114:   iconst_3
L115:   ishr
L116:   istore 16
L118:   iload 8
L120:   iload 7
L122:   isub
L123:   getstatic Field OPPOFIOL H [I
L126:   iload 16
L128:   iaload
L129:   imul
L130:   bipush 6
L132:   ishr
L133:   istore 15
L135:   iload 25
L137:   ifeq L146
L140:   iconst_0
L141:   istore 16
L143:   iconst_0
L144:   istore 15
L146:   iload 7
L148:   bipush 9
L150:   ishl
L151:   istore 7
L153:   iload 4
L155:   iload 5
L157:   iadd
L158:   istore 4
L160:   getstatic Field OPPOFIOL A Z
L163:   ifeq L1318
L166:   iconst_0
L167:   istore 17
L169:   iconst_0
L170:   istore 18
L172:   iload 5
L174:   getstatic Field OPPOFIOL F I
L177:   isub
L178:   istore 20
L180:   iload 9
L182:   iload 12
L184:   iconst_3
L185:   ishr
L186:   iload 20
L188:   imul
L189:   iadd
L190:   istore 9
L192:   iload 10
L194:   iload 13
L196:   iconst_3
L197:   ishr
L198:   iload 20
L200:   imul
L201:   iadd
L202:   istore 10
L204:   iload 11
L206:   iload 14
L208:   iconst_3
L209:   ishr
L210:   iload 20
L212:   imul
L213:   iadd
L214:   istore 11
L216:   iload 11
L218:   bipush 12
L220:   ishr
L221:   istore 19
L223:   iload 19
L225:   ifeq L262
L228:   iload 9
L230:   iload 19
L232:   idiv
L233:   istore_2
L234:   iload 10
L236:   iload 19
L238:   idiv
L239:   istore_3
L240:   iload_2
L241:   ifge L251
L244:   iconst_0
L245:   istore_2
L246:   iload 25
L248:   ifeq L262
L251:   iload_2
L252:   sipush 4032
L255:   if_icmple L262
L258:   sipush 4032
L261:   istore_2
L262:   iload 9
L264:   iload 12
L266:   iadd
L267:   istore 9
L269:   iload 10
L271:   iload 13
L273:   iadd
L274:   istore 10
L276:   iload 11
L278:   iload 14
L280:   iadd
L281:   istore 11
L283:   iload 11
L285:   bipush 12
L287:   ishr
L288:   istore 19
L290:   iload 19
L292:   ifeq L338
L295:   iload 9
L297:   iload 19
L299:   idiv
L300:   istore 17
L302:   iload 10
L304:   iload 19
L306:   idiv
L307:   istore 18
L309:   iload 17
L311:   bipush 7
L313:   if_icmpge L325
L316:   bipush 7
L318:   istore 17
L320:   iload 25
L322:   ifeq L338
L325:   iload 17
L327:   sipush 4032
L330:   if_icmple L338
L333:   sipush 4032
L336:   istore 17
L338:   iload 17
L340:   iload_2
L341:   isub
L342:   iconst_3
L343:   ishr
L344:   istore 21
L346:   iload 18
L348:   iload_3
L349:   isub
L350:   iconst_3
L351:   ishr
L352:   istore 22
L354:   iload_2
L355:   iload 7
L357:   ldc 6291456
L359:   iand
L360:   iconst_3
L361:   ishr
L362:   iadd
L363:   istore_2
L364:   iload 7
L366:   bipush 23
L368:   ishr
L369:   istore 23
L371:   getstatic Field OPPOFIOL C Z
L374:   ifeq L1246
L377:   iload 25
L379:   ifeq L750
L382:   aload_0
L383:   iload 4
L385:   iinc 4 1
L388:   aload_1
L389:   iload_3
L390:   sipush 4032
L393:   iand
L394:   iload_2
L395:   bipush 6
L397:   ishr
L398:   iadd
L399:   iaload
L400:   iload 23
L402:   iushr
L403:   iastore
L404:   iload_2
L405:   iload 21
L407:   iadd
L408:   istore_2
L409:   iload_3
L410:   iload 22
L412:   iadd
L413:   istore_3
L414:   aload_0
L415:   iload 4
L417:   iinc 4 1
L420:   aload_1
L421:   iload_3
L422:   sipush 4032
L425:   iand
L426:   iload_2
L427:   bipush 6
L429:   ishr
L430:   iadd
L431:   iaload
L432:   iload 23
L434:   iushr
L435:   iastore
L436:   iload_2
L437:   iload 21
L439:   iadd
L440:   istore_2
L441:   iload_3
L442:   iload 22
L444:   iadd
L445:   istore_3
L446:   aload_0
L447:   iload 4
L449:   iinc 4 1
L452:   aload_1
L453:   iload_3
L454:   sipush 4032
L457:   iand
L458:   iload_2
L459:   bipush 6
L461:   ishr
L462:   iadd
L463:   iaload
L464:   iload 23
L466:   iushr
L467:   iastore
L468:   iload_2
L469:   iload 21
L471:   iadd
L472:   istore_2
L473:   iload_3
L474:   iload 22
L476:   iadd
L477:   istore_3
L478:   aload_0
L479:   iload 4
L481:   iinc 4 1
L484:   aload_1
L485:   iload_3
L486:   sipush 4032
L489:   iand
L490:   iload_2
L491:   bipush 6
L493:   ishr
L494:   iadd
L495:   iaload
L496:   iload 23
L498:   iushr
L499:   iastore
L500:   iload_2
L501:   iload 21
L503:   iadd
L504:   istore_2
L505:   iload_3
L506:   iload 22
L508:   iadd
L509:   istore_3
L510:   aload_0
L511:   iload 4
L513:   iinc 4 1
L516:   aload_1
L517:   iload_3
L518:   sipush 4032
L521:   iand
L522:   iload_2
L523:   bipush 6
L525:   ishr
L526:   iadd
L527:   iaload
L528:   iload 23
L530:   iushr
L531:   iastore
L532:   iload_2
L533:   iload 21
L535:   iadd
L536:   istore_2
L537:   iload_3
L538:   iload 22
L540:   iadd
L541:   istore_3
L542:   aload_0
L543:   iload 4
L545:   iinc 4 1
L548:   aload_1
L549:   iload_3
L550:   sipush 4032
L553:   iand
L554:   iload_2
L555:   bipush 6
L557:   ishr
L558:   iadd
L559:   iaload
L560:   iload 23
L562:   iushr
L563:   iastore
L564:   iload_2
L565:   iload 21
L567:   iadd
L568:   istore_2
L569:   iload_3
L570:   iload 22
L572:   iadd
L573:   istore_3
L574:   aload_0
L575:   iload 4
L577:   iinc 4 1
L580:   aload_1
L581:   iload_3
L582:   sipush 4032
L585:   iand
L586:   iload_2
L587:   bipush 6
L589:   ishr
L590:   iadd
L591:   iaload
L592:   iload 23
L594:   iushr
L595:   iastore
L596:   iload_2
L597:   iload 21
L599:   iadd
L600:   istore_2
L601:   iload_3
L602:   iload 22
L604:   iadd
L605:   istore_3
L606:   aload_0
L607:   iload 4
L609:   iinc 4 1
L612:   aload_1
L613:   iload_3
L614:   sipush 4032
L617:   iand
L618:   iload_2
L619:   bipush 6
L621:   ishr
L622:   iadd
L623:   iaload
L624:   iload 23
L626:   iushr
L627:   iastore
L628:   iload 17
L630:   istore_2
L631:   iload 18
L633:   istore_3
L634:   iload 9
L636:   iload 12
L638:   iadd
L639:   istore 9
L641:   iload 10
L643:   iload 13
L645:   iadd
L646:   istore 10
L648:   iload 11
L650:   iload 14
L652:   iadd
L653:   istore 11
L655:   iload 11
L657:   bipush 12
L659:   ishr
L660:   istore 19
L662:   iload 19
L664:   ifeq L710
L667:   iload 9
L669:   iload 19
L671:   idiv
L672:   istore 17
L674:   iload 10
L676:   iload 19
L678:   idiv
L679:   istore 18
L681:   iload 17
L683:   bipush 7
L685:   if_icmpge L697
L688:   bipush 7
L690:   istore 17
L692:   iload 25
L694:   ifeq L710
L697:   iload 17
L699:   sipush 4032
L702:   if_icmple L710
L705:   sipush 4032
L708:   istore 17
L710:   iload 17
L712:   iload_2
L713:   isub
L714:   iconst_3
L715:   ishr
L716:   istore 21
L718:   iload 18
L720:   iload_3
L721:   isub
L722:   iconst_3
L723:   ishr
L724:   istore 22
L726:   iload 7
L728:   iload 15
L730:   iadd
L731:   istore 7
L733:   iload_2
L734:   iload 7
L736:   ldc 6291456
L738:   iand
L739:   iconst_3
L740:   ishr
L741:   iadd
L742:   istore_2
L743:   iload 7
L745:   bipush 23
L747:   ishr
L748:   istore 23
L750:   iload 16
L752:   iinc 16 -1
L755:   ifgt L382
L758:   iload 6
L760:   iload 5
L762:   isub
L763:   bipush 7
L765:   iand
L766:   istore 16
L768:   iload 25
L770:   ifeq L805
L773:   aload_0
L774:   iload 4
L776:   iinc 4 1
L779:   aload_1
L780:   iload_3
L781:   sipush 4032
L784:   iand
L785:   iload_2
L786:   bipush 6
L788:   ishr
L789:   iadd
L790:   iaload
L791:   iload 23
L793:   iushr
L794:   iastore
L795:   iload_2
L796:   iload 21
L798:   iadd
L799:   istore_2
L800:   iload_3
L801:   iload 22
L803:   iadd
L804:   istore_3
L805:   iload 16
L807:   iinc 16 -1
L810:   ifgt L773
L813:   return
L814:   aload_1
L815:   iload_3
L816:   sipush 4032
L819:   iand
L820:   iload_2
L821:   bipush 6
L823:   ishr
L824:   iadd
L825:   iaload
L826:   iload 23
L828:   iushr
L829:   dup
L830:   istore 24
L832:   ifeq L841
L835:   aload_0
L836:   iload 4
L838:   iload 24
L840:   iastore
L841:   iinc 4 1
L844:   iload_2
L845:   iload 21
L847:   iadd
L848:   istore_2
L849:   iload_3
L850:   iload 22
L852:   iadd
L853:   istore_3
L854:   aload_1
L855:   iload_3
L856:   sipush 4032
L859:   iand
L860:   iload_2
L861:   bipush 6
L863:   ishr
L864:   iadd
L865:   iaload
L866:   iload 23
L868:   iushr
L869:   dup
L870:   istore 24
L872:   ifeq L881
L875:   aload_0
L876:   iload 4
L878:   iload 24
L880:   iastore
L881:   iinc 4 1
L884:   iload_2
L885:   iload 21
L887:   iadd
L888:   istore_2
L889:   iload_3
L890:   iload 22
L892:   iadd
L893:   istore_3
L894:   aload_1
L895:   iload_3
L896:   sipush 4032
L899:   iand
L900:   iload_2
L901:   bipush 6
L903:   ishr
L904:   iadd
L905:   iaload
L906:   iload 23
L908:   iushr
L909:   dup
L910:   istore 24
L912:   ifeq L921
L915:   aload_0
L916:   iload 4
L918:   iload 24
L920:   iastore
L921:   iinc 4 1
L924:   iload_2
L925:   iload 21
L927:   iadd
L928:   istore_2
L929:   iload_3
L930:   iload 22
L932:   iadd
L933:   istore_3
L934:   aload_1
L935:   iload_3
L936:   sipush 4032
L939:   iand
L940:   iload_2
L941:   bipush 6
L943:   ishr
L944:   iadd
L945:   iaload
L946:   iload 23
L948:   iushr
L949:   dup
L950:   istore 24
L952:   ifeq L961
L955:   aload_0
L956:   iload 4
L958:   iload 24
L960:   iastore
L961:   iinc 4 1
L964:   iload_2
L965:   iload 21
L967:   iadd
L968:   istore_2
L969:   iload_3
L970:   iload 22
L972:   iadd
L973:   istore_3
L974:   aload_1
L975:   iload_3
L976:   sipush 4032
L979:   iand
L980:   iload_2
L981:   bipush 6
L983:   ishr
L984:   iadd
L985:   iaload
L986:   iload 23
L988:   iushr
L989:   dup
L990:   istore 24
L992:   ifeq L1001
L995:   aload_0
L996:   iload 4
L998:   iload 24
L1000:  iastore
L1001:  iinc 4 1
L1004:  iload_2
L1005:  iload 21
L1007:  iadd
L1008:  istore_2
L1009:  iload_3
L1010:  iload 22
L1012:  iadd
L1013:  istore_3
L1014:  aload_1
L1015:  iload_3
L1016:  sipush 4032
L1019:  iand
L1020:  iload_2
L1021:  bipush 6
L1023:  ishr
L1024:  iadd
L1025:  iaload
L1026:  iload 23
L1028:  iushr
L1029:  dup
L1030:  istore 24
L1032:  ifeq L1041
L1035:  aload_0
L1036:  iload 4
L1038:  iload 24
L1040:  iastore
L1041:  iinc 4 1
L1044:  iload_2
L1045:  iload 21
L1047:  iadd
L1048:  istore_2
L1049:  iload_3
L1050:  iload 22
L1052:  iadd
L1053:  istore_3
L1054:  aload_1
L1055:  iload_3
L1056:  sipush 4032
L1059:  iand
L1060:  iload_2
L1061:  bipush 6
L1063:  ishr
L1064:  iadd
L1065:  iaload
L1066:  iload 23
L1068:  iushr
L1069:  dup
L1070:  istore 24
L1072:  ifeq L1081
L1075:  aload_0
L1076:  iload 4
L1078:  iload 24
L1080:  iastore
L1081:  iinc 4 1
L1084:  iload_2
L1085:  iload 21
L1087:  iadd
L1088:  istore_2
L1089:  iload_3
L1090:  iload 22
L1092:  iadd
L1093:  istore_3
L1094:  aload_1
L1095:  iload_3
L1096:  sipush 4032
L1099:  iand
L1100:  iload_2
L1101:  bipush 6
L1103:  ishr
L1104:  iadd
L1105:  iaload
L1106:  iload 23
L1108:  iushr
L1109:  dup
L1110:  istore 24
L1112:  ifeq L1121
L1115:  aload_0
L1116:  iload 4
L1118:  iload 24
L1120:  iastore
L1121:  iinc 4 1
L1124:  iload 17
L1126:  istore_2
L1127:  iload 18
L1129:  istore_3
L1130:  iload 9
L1132:  iload 12
L1134:  iadd
L1135:  istore 9
L1137:  iload 10
L1139:  iload 13
L1141:  iadd
L1142:  istore 10
L1144:  iload 11
L1146:  iload 14
L1148:  iadd
L1149:  istore 11
L1151:  iload 11
L1153:  bipush 12
L1155:  ishr
L1156:  istore 19
L1158:  iload 19
L1160:  ifeq L1206
L1163:  iload 9
L1165:  iload 19
L1167:  idiv
L1168:  istore 17
L1170:  iload 10
L1172:  iload 19
L1174:  idiv
L1175:  istore 18
L1177:  iload 17
L1179:  bipush 7
L1181:  if_icmpge L1193
L1184:  bipush 7
L1186:  istore 17
L1188:  iload 25
L1190:  ifeq L1206
L1193:  iload 17
L1195:  sipush 4032
L1198:  if_icmple L1206
L1201:  sipush 4032
L1204:  istore 17
L1206:  iload 17
L1208:  iload_2
L1209:  isub
L1210:  iconst_3
L1211:  ishr
L1212:  istore 21
L1214:  iload 18
L1216:  iload_3
L1217:  isub
L1218:  iconst_3
L1219:  ishr
L1220:  istore 22
L1222:  iload 7
L1224:  iload 15
L1226:  iadd
L1227:  istore 7
L1229:  iload_2
L1230:  iload 7
L1232:  ldc 6291456
L1234:  iand
L1235:  iconst_3
L1236:  ishr
L1237:  iadd
L1238:  istore_2
L1239:  iload 7
L1241:  bipush 23
L1243:  ishr
L1244:  istore 23
L1246:  iload 16
L1248:  iinc 16 -1
L1251:  ifgt L814
L1254:  iload 6
L1256:  iload 5
L1258:  isub
L1259:  bipush 7
L1261:  iand
L1262:  istore 16
L1264:  iload 25
L1266:  ifeq L1309
L1269:  aload_1
L1270:  iload_3
L1271:  sipush 4032
L1274:  iand
L1275:  iload_2
L1276:  bipush 6
L1278:  ishr
L1279:  iadd
L1280:  iaload
L1281:  iload 23
L1283:  iushr
L1284:  dup
L1285:  istore 24
L1287:  ifeq L1296
L1290:  aload_0
L1291:  iload 4
L1293:  iload 24
L1295:  iastore
L1296:  iinc 4 1
L1299:  iload_2
L1300:  iload 21
L1302:  iadd
L1303:  istore_2
L1304:  iload_3
L1305:  iload 22
L1307:  iadd
L1308:  istore_3
L1309:  iload 16
L1311:  iinc 16 -1
L1314:  ifgt L1269
L1317:  return
L1318:  iconst_0
L1319:  istore 17
L1321:  iconst_0
L1322:  istore 18
L1324:  iload 5
L1326:  getstatic Field OPPOFIOL F I
L1329:  isub
L1330:  istore 20
L1332:  iload 9
L1334:  iload 12
L1336:  iconst_3
L1337:  ishr
L1338:  iload 20
L1340:  imul
L1341:  iadd
L1342:  istore 9
L1344:  iload 10
L1346:  iload 13
L1348:  iconst_3
L1349:  ishr
L1350:  iload 20
L1352:  imul
L1353:  iadd
L1354:  istore 10
L1356:  iload 11
L1358:  iload 14
L1360:  iconst_3
L1361:  ishr
L1362:  iload 20
L1364:  imul
L1365:  iadd
L1366:  istore 11
L1368:  iload 11
L1370:  bipush 14
L1372:  ishr
L1373:  istore 19
L1375:  iload 19
L1377:  ifeq L1414
L1380:  iload 9
L1382:  iload 19
L1384:  idiv
L1385:  istore_2
L1386:  iload 10
L1388:  iload 19
L1390:  idiv
L1391:  istore_3
L1392:  iload_2
L1393:  ifge L1403
L1396:  iconst_0
L1397:  istore_2
L1398:  iload 25
L1400:  ifeq L1414
L1403:  iload_2
L1404:  sipush 16256
L1407:  if_icmple L1414
L1410:  sipush 16256
L1413:  istore_2
L1414:  iload 9
L1416:  iload 12
L1418:  iadd
L1419:  istore 9
L1421:  iload 10
L1423:  iload 13
L1425:  iadd
L1426:  istore 10
L1428:  iload 11
L1430:  iload 14
L1432:  iadd
L1433:  istore 11
L1435:  iload 11
L1437:  bipush 14
L1439:  ishr
L1440:  istore 19
L1442:  iload 19
L1444:  ifeq L1490
L1447:  iload 9
L1449:  iload 19
L1451:  idiv
L1452:  istore 17
L1454:  iload 10
L1456:  iload 19
L1458:  idiv
L1459:  istore 18
L1461:  iload 17
L1463:  bipush 7
L1465:  if_icmpge L1477
L1468:  bipush 7
L1470:  istore 17
L1472:  iload 25
L1474:  ifeq L1490
L1477:  iload 17
L1479:  sipush 16256
L1482:  if_icmple L1490
L1485:  sipush 16256
L1488:  istore 17
L1490:  iload 17
L1492:  iload_2
L1493:  isub
L1494:  iconst_3
L1495:  ishr
L1496:  istore 21
L1498:  iload 18
L1500:  iload_3
L1501:  isub
L1502:  iconst_3
L1503:  ishr
L1504:  istore 22
L1506:  iload_2
L1507:  iload 7
L1509:  ldc 6291456
L1511:  iand
L1512:  iadd
L1513:  istore_2
L1514:  iload 7
L1516:  bipush 23
L1518:  ishr
L1519:  istore 23
L1521:  getstatic Field OPPOFIOL C Z
L1524:  ifeq L2392
L1527:  iload 25
L1529:  ifeq L1898
L1532:  aload_0
L1533:  iload 4
L1535:  iinc 4 1
L1538:  aload_1
L1539:  iload_3
L1540:  sipush 16256
L1543:  iand
L1544:  iload_2
L1545:  bipush 7
L1547:  ishr
L1548:  iadd
L1549:  iaload
L1550:  iload 23
L1552:  iushr
L1553:  iastore
L1554:  iload_2
L1555:  iload 21
L1557:  iadd
L1558:  istore_2
L1559:  iload_3
L1560:  iload 22
L1562:  iadd
L1563:  istore_3
L1564:  aload_0
L1565:  iload 4
L1567:  iinc 4 1
L1570:  aload_1
L1571:  iload_3
L1572:  sipush 16256
L1575:  iand
L1576:  iload_2
L1577:  bipush 7
L1579:  ishr
L1580:  iadd
L1581:  iaload
L1582:  iload 23
L1584:  iushr
L1585:  iastore
L1586:  iload_2
L1587:  iload 21
L1589:  iadd
L1590:  istore_2
L1591:  iload_3
L1592:  iload 22
L1594:  iadd
L1595:  istore_3
L1596:  aload_0
L1597:  iload 4
L1599:  iinc 4 1
L1602:  aload_1
L1603:  iload_3
L1604:  sipush 16256
L1607:  iand
L1608:  iload_2
L1609:  bipush 7
L1611:  ishr
L1612:  iadd
L1613:  iaload
L1614:  iload 23
L1616:  iushr
L1617:  iastore
L1618:  iload_2
L1619:  iload 21
L1621:  iadd
L1622:  istore_2
L1623:  iload_3
L1624:  iload 22
L1626:  iadd
L1627:  istore_3
L1628:  aload_0
L1629:  iload 4
L1631:  iinc 4 1
L1634:  aload_1
L1635:  iload_3
L1636:  sipush 16256
L1639:  iand
L1640:  iload_2
L1641:  bipush 7
L1643:  ishr
L1644:  iadd
L1645:  iaload
L1646:  iload 23
L1648:  iushr
L1649:  iastore
L1650:  iload_2
L1651:  iload 21
L1653:  iadd
L1654:  istore_2
L1655:  iload_3
L1656:  iload 22
L1658:  iadd
L1659:  istore_3
L1660:  aload_0
L1661:  iload 4
L1663:  iinc 4 1
L1666:  aload_1
L1667:  iload_3
L1668:  sipush 16256
L1671:  iand
L1672:  iload_2
L1673:  bipush 7
L1675:  ishr
L1676:  iadd
L1677:  iaload
L1678:  iload 23
L1680:  iushr
L1681:  iastore
L1682:  iload_2
L1683:  iload 21
L1685:  iadd
L1686:  istore_2
L1687:  iload_3
L1688:  iload 22
L1690:  iadd
L1691:  istore_3
L1692:  aload_0
L1693:  iload 4
L1695:  iinc 4 1
L1698:  aload_1
L1699:  iload_3
L1700:  sipush 16256
L1703:  iand
L1704:  iload_2
L1705:  bipush 7
L1707:  ishr
L1708:  iadd
L1709:  iaload
L1710:  iload 23
L1712:  iushr
L1713:  iastore
L1714:  iload_2
L1715:  iload 21
L1717:  iadd
L1718:  istore_2
L1719:  iload_3
L1720:  iload 22
L1722:  iadd
L1723:  istore_3
L1724:  aload_0
L1725:  iload 4
L1727:  iinc 4 1
L1730:  aload_1
L1731:  iload_3
L1732:  sipush 16256
L1735:  iand
L1736:  iload_2
L1737:  bipush 7
L1739:  ishr
L1740:  iadd
L1741:  iaload
L1742:  iload 23
L1744:  iushr
L1745:  iastore
L1746:  iload_2
L1747:  iload 21
L1749:  iadd
L1750:  istore_2
L1751:  iload_3
L1752:  iload 22
L1754:  iadd
L1755:  istore_3
L1756:  aload_0
L1757:  iload 4
L1759:  iinc 4 1
L1762:  aload_1
L1763:  iload_3
L1764:  sipush 16256
L1767:  iand
L1768:  iload_2
L1769:  bipush 7
L1771:  ishr
L1772:  iadd
L1773:  iaload
L1774:  iload 23
L1776:  iushr
L1777:  iastore
L1778:  iload 17
L1780:  istore_2
L1781:  iload 18
L1783:  istore_3
L1784:  iload 9
L1786:  iload 12
L1788:  iadd
L1789:  istore 9
L1791:  iload 10
L1793:  iload 13
L1795:  iadd
L1796:  istore 10
L1798:  iload 11
L1800:  iload 14
L1802:  iadd
L1803:  istore 11
L1805:  iload 11
L1807:  bipush 14
L1809:  ishr
L1810:  istore 19
L1812:  iload 19
L1814:  ifeq L1860
L1817:  iload 9
L1819:  iload 19
L1821:  idiv
L1822:  istore 17
L1824:  iload 10
L1826:  iload 19
L1828:  idiv
L1829:  istore 18
L1831:  iload 17
L1833:  bipush 7
L1835:  if_icmpge L1847
L1838:  bipush 7
L1840:  istore 17
L1842:  iload 25
L1844:  ifeq L1860
L1847:  iload 17
L1849:  sipush 16256
L1852:  if_icmple L1860
L1855:  sipush 16256
L1858:  istore 17
L1860:  iload 17
L1862:  iload_2
L1863:  isub
L1864:  iconst_3
L1865:  ishr
L1866:  istore 21
L1868:  iload 18
L1870:  iload_3
L1871:  isub
L1872:  iconst_3
L1873:  ishr
L1874:  istore 22
L1876:  iload 7
L1878:  iload 15
L1880:  iadd
L1881:  istore 7
L1883:  iload_2
L1884:  iload 7
L1886:  ldc 6291456
L1888:  iand
L1889:  iadd
L1890:  istore_2
L1891:  iload 7
L1893:  bipush 23
L1895:  ishr
L1896:  istore 23
L1898:  iload 16
L1900:  iinc 16 -1
L1903:  ifgt L1532
L1906:  iload 6
L1908:  iload 5
L1910:  isub
L1911:  bipush 7
L1913:  iand
L1914:  istore 16
L1916:  iload 25
L1918:  ifeq L1953
L1921:  aload_0
L1922:  iload 4
L1924:  iinc 4 1
L1927:  aload_1
L1928:  iload_3
L1929:  sipush 16256
L1932:  iand
L1933:  iload_2
L1934:  bipush 7
L1936:  ishr
L1937:  iadd
L1938:  iaload
L1939:  iload 23
L1941:  iushr
L1942:  iastore
L1943:  iload_2
L1944:  iload 21
L1946:  iadd
L1947:  istore_2
L1948:  iload_3
L1949:  iload 22
L1951:  iadd
L1952:  istore_3
L1953:  iload 16
L1955:  iinc 16 -1
L1958:  ifgt L1921
L1961:  return
L1962:  aload_1
L1963:  iload_3
L1964:  sipush 16256
L1967:  iand
L1968:  iload_2
L1969:  bipush 7
L1971:  ishr
L1972:  iadd
L1973:  iaload
L1974:  iload 23
L1976:  iushr
L1977:  dup
L1978:  istore 24
L1980:  ifeq L1989
L1983:  aload_0
L1984:  iload 4
L1986:  iload 24
L1988:  iastore
L1989:  iinc 4 1
L1992:  iload_2
L1993:  iload 21
L1995:  iadd
L1996:  istore_2
L1997:  iload_3
L1998:  iload 22
L2000:  iadd
L2001:  istore_3
L2002:  aload_1
L2003:  iload_3
L2004:  sipush 16256
L2007:  iand
L2008:  iload_2
L2009:  bipush 7
L2011:  ishr
L2012:  iadd
L2013:  iaload
L2014:  iload 23
L2016:  iushr
L2017:  dup
L2018:  istore 24
L2020:  ifeq L2029
L2023:  aload_0
L2024:  iload 4
L2026:  iload 24
L2028:  iastore
L2029:  iinc 4 1
L2032:  iload_2
L2033:  iload 21
L2035:  iadd
L2036:  istore_2
L2037:  iload_3
L2038:  iload 22
L2040:  iadd
L2041:  istore_3
L2042:  aload_1
L2043:  iload_3
L2044:  sipush 16256
L2047:  iand
L2048:  iload_2
L2049:  bipush 7
L2051:  ishr
L2052:  iadd
L2053:  iaload
L2054:  iload 23
L2056:  iushr
L2057:  dup
L2058:  istore 24
L2060:  ifeq L2069
L2063:  aload_0
L2064:  iload 4
L2066:  iload 24
L2068:  iastore
L2069:  iinc 4 1
L2072:  iload_2
L2073:  iload 21
L2075:  iadd
L2076:  istore_2
L2077:  iload_3
L2078:  iload 22
L2080:  iadd
L2081:  istore_3
L2082:  aload_1
L2083:  iload_3
L2084:  sipush 16256
L2087:  iand
L2088:  iload_2
L2089:  bipush 7
L2091:  ishr
L2092:  iadd
L2093:  iaload
L2094:  iload 23
L2096:  iushr
L2097:  dup
L2098:  istore 24
L2100:  ifeq L2109
L2103:  aload_0
L2104:  iload 4
L2106:  iload 24
L2108:  iastore
L2109:  iinc 4 1
L2112:  iload_2
L2113:  iload 21
L2115:  iadd
L2116:  istore_2
L2117:  iload_3
L2118:  iload 22
L2120:  iadd
L2121:  istore_3
L2122:  aload_1
L2123:  iload_3
L2124:  sipush 16256
L2127:  iand
L2128:  iload_2
L2129:  bipush 7
L2131:  ishr
L2132:  iadd
L2133:  iaload
L2134:  iload 23
L2136:  iushr
L2137:  dup
L2138:  istore 24
L2140:  ifeq L2149
L2143:  aload_0
L2144:  iload 4
L2146:  iload 24
L2148:  iastore
L2149:  iinc 4 1
L2152:  iload_2
L2153:  iload 21
L2155:  iadd
L2156:  istore_2
L2157:  iload_3
L2158:  iload 22
L2160:  iadd
L2161:  istore_3
L2162:  aload_1
L2163:  iload_3
L2164:  sipush 16256
L2167:  iand
L2168:  iload_2
L2169:  bipush 7
L2171:  ishr
L2172:  iadd
L2173:  iaload
L2174:  iload 23
L2176:  iushr
L2177:  dup
L2178:  istore 24
L2180:  ifeq L2189
L2183:  aload_0
L2184:  iload 4
L2186:  iload 24
L2188:  iastore
L2189:  iinc 4 1
L2192:  iload_2
L2193:  iload 21
L2195:  iadd
L2196:  istore_2
L2197:  iload_3
L2198:  iload 22
L2200:  iadd
L2201:  istore_3
L2202:  aload_1
L2203:  iload_3
L2204:  sipush 16256
L2207:  iand
L2208:  iload_2
L2209:  bipush 7
L2211:  ishr
L2212:  iadd
L2213:  iaload
L2214:  iload 23
L2216:  iushr
L2217:  dup
L2218:  istore 24
L2220:  ifeq L2229
L2223:  aload_0
L2224:  iload 4
L2226:  iload 24
L2228:  iastore
L2229:  iinc 4 1
L2232:  iload_2
L2233:  iload 21
L2235:  iadd
L2236:  istore_2
L2237:  iload_3
L2238:  iload 22
L2240:  iadd
L2241:  istore_3
L2242:  aload_1
L2243:  iload_3
L2244:  sipush 16256
L2247:  iand
L2248:  iload_2
L2249:  bipush 7
L2251:  ishr
L2252:  iadd
L2253:  iaload
L2254:  iload 23
L2256:  iushr
L2257:  dup
L2258:  istore 24
L2260:  ifeq L2269
L2263:  aload_0
L2264:  iload 4
L2266:  iload 24
L2268:  iastore
L2269:  iinc 4 1
L2272:  iload 17
L2274:  istore_2
L2275:  iload 18
L2277:  istore_3
L2278:  iload 9
L2280:  iload 12
L2282:  iadd
L2283:  istore 9
L2285:  iload 10
L2287:  iload 13
L2289:  iadd
L2290:  istore 10
L2292:  iload 11
L2294:  iload 14
L2296:  iadd
L2297:  istore 11
L2299:  iload 11
L2301:  bipush 14
L2303:  ishr
L2304:  istore 19
L2306:  iload 19
L2308:  ifeq L2354
L2311:  iload 9
L2313:  iload 19
L2315:  idiv
L2316:  istore 17
L2318:  iload 10
L2320:  iload 19
L2322:  idiv
L2323:  istore 18
L2325:  iload 17
L2327:  bipush 7
L2329:  if_icmpge L2341
L2332:  bipush 7
L2334:  istore 17
L2336:  iload 25
L2338:  ifeq L2354
L2341:  iload 17
L2343:  sipush 16256
L2346:  if_icmple L2354
L2349:  sipush 16256
L2352:  istore 17
L2354:  iload 17
L2356:  iload_2
L2357:  isub
L2358:  iconst_3
L2359:  ishr
L2360:  istore 21
L2362:  iload 18
L2364:  iload_3
L2365:  isub
L2366:  iconst_3
L2367:  ishr
L2368:  istore 22
L2370:  iload 7
L2372:  iload 15
L2374:  iadd
L2375:  istore 7
L2377:  iload_2
L2378:  iload 7
L2380:  ldc 6291456
L2382:  iand
L2383:  iadd
L2384:  istore_2
L2385:  iload 7
L2387:  bipush 23
L2389:  ishr
L2390:  istore 23
L2392:  iload 16
L2394:  iinc 16 -1
L2397:  ifgt L1962
L2400:  iload 6
L2402:  iload 5
L2404:  isub
L2405:  bipush 7
L2407:  iand
L2408:  istore 16
L2410:  iload 25
L2412:  ifeq L2455
L2415:  aload_1
L2416:  iload_3
L2417:  sipush 16256
L2420:  iand
L2421:  iload_2
L2422:  bipush 7
L2424:  ishr
L2425:  iadd
L2426:  iaload
L2427:  iload 23
L2429:  iushr
L2430:  dup
L2431:  istore 24
L2433:  ifeq L2442
L2436:  aload_0
L2437:  iload 4
L2439:  iload 24
L2441:  iastore
L2442:  iinc 4 1
L2445:  iload_2
L2446:  iload 21
L2448:  iadd
L2449:  istore_2
L2450:  iload_3
L2451:  iload 22
L2453:  iadd
L2454:  istore_3
L2455:  iload 16
L2457:  iinc 16 -1
L2460:  ifgt L2415
L2463:  return
L2464:  
    .end code
.end method

.method static <clinit> : ()V
    .code stack 8 locals 3
L0:     sipush -436
L3:     putstatic Field OPPOFIOL x I
L6:     sipush -477
L9:     putstatic Field OPPOFIOL y I
L12:    iconst_1
L13:    putstatic Field OPPOFIOL z Z
L16:    iconst_1
L17:    putstatic Field OPPOFIOL A Z
L20:    iconst_1
L21:    putstatic Field OPPOFIOL D Z
L24:    sipush 512
L27:    newarray int
L29:    putstatic Field OPPOFIOL H [I
L32:    sipush 2048
L35:    newarray int
L37:    putstatic Field OPPOFIOL I [I
L40:    sipush 2048
L43:    newarray int
L45:    putstatic Field OPPOFIOL J [I
L48:    sipush 2048
L51:    newarray int
L53:    putstatic Field OPPOFIOL K [I
L56:    iconst_1
L57:    istore_0
L58:    goto L73
L61:    getstatic Field OPPOFIOL H [I
L64:    iload_0
L65:    ldc 32768
L67:    iload_0
L68:    idiv
L69:    iastore
L70:    iinc 0 1
L73:    iload_0
L74:    sipush 512
L77:    if_icmplt L61
L80:    iconst_1
L81:    istore_1
L82:    goto L97
L85:    getstatic Field OPPOFIOL I [I
L88:    iload_1
L89:    ldc 65536
L91:    iload_1
L92:    idiv
L93:    iastore
L94:    iinc 1 1
L97:    iload_1
L98:    sipush 2048
L101:   if_icmplt L85
L104:   iconst_0
L105:   istore_2
L106:   goto L150
L109:   getstatic Field OPPOFIOL J [I
L112:   iload_2
L113:   ldc2_w 6.5536e4
L116:   iload_2
L117:   i2d
L118:   ldc2_w 3.0679615e-3
L121:   dmul
L122:   invokestatic Method java/lang/Math sin (D)D
L125:   dmul
L126:   d2i
L127:   iastore
L128:   getstatic Field OPPOFIOL K [I
L131:   iload_2
L132:   ldc2_w 6.5536e4
L135:   iload_2
L136:   i2d
L137:   ldc2_w 3.0679615e-3
L140:   dmul
L141:   invokestatic Method java/lang/Math cos (D)D
L144:   dmul
L145:   d2i
L146:   iastore
L147:   iinc 2 1
L150:   iload_2
L151:   sipush 2048
L154:   if_icmplt L109
L157:   bipush 50
L159:   anewarray DSMJIEPN
L162:   putstatic Field OPPOFIOL N [LDSMJIEPN;
L165:   bipush 50
L167:   newarray boolean
L169:   putstatic Field OPPOFIOL O [Z
L172:   bipush 50
L174:   newarray int
L176:   putstatic Field OPPOFIOL P [I
L179:   bipush 50
L181:   multianewarray [[I 1
L185:   putstatic Field OPPOFIOL S [[I
L188:   bipush 50
L190:   newarray int
L192:   putstatic Field OPPOFIOL T [I
L195:   ldc 65536
L197:   newarray int
L199:   putstatic Field OPPOFIOL V [I
L202:   bipush 50
L204:   multianewarray [[I 1
L208:   putstatic Field OPPOFIOL W [[I
L211:   return
L212:   
    .end code
.end method
.end class
