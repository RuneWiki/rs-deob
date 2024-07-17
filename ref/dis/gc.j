.version 45 3
.class public super gc
.super java/lang/Object
.field private static a I
.field private static b I
.field private c Z
.field public static d I
.field public static e [Lgc;
.field public f I
.field public g [I
.field public h [I
.field public i [I
.field public j [I
.field public k Z

.method public static a : (Lub;I)V
    .code stack 8 locals 4
        .catch java/lang/RuntimeException from L0 to L94 using L95
L0:     new kb
L3:     dup
L4:     sipush 363
L7:     aload_0
L8:     ldc "idk.dat"
L10:    aconst_null
L11:    iconst_2
L12:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L15:    invokespecial Method kb <init> (I[B)V
L18:    astore_2
L19:    aload_2
L20:    invokevirtual Method kb e ()I
L23:    putstatic Field gc d I
L26:    getstatic Field gc e [Lgc;
L29:    ifnonnull L41
L32:    getstatic Field gc d I
L35:    anewarray gc
L38:    putstatic Field gc e [Lgc;
L41:    iconst_0
L42:    istore_3
L43:    getstatic Field jc p Z
L46:    ifeq L82
L49:    getstatic Field gc e [Lgc;
L52:    iload_3
L53:    aaload
L54:    ifnonnull L69
L57:    getstatic Field gc e [Lgc;
L60:    iload_3
L61:    new gc
L64:    dup
L65:    invokespecial Method gc <init> ()V
L68:    aastore
L69:    getstatic Field gc e [Lgc;
L72:    iload_3
L73:    aaload
L74:    iconst_0
L75:    aload_2
L76:    invokevirtual Method gc a (ZLkb;)V
L79:    iinc 3 1
L82:    iload_3
L83:    getstatic Field gc d I
L86:    if_icmplt L49
L89:    bipush 87
L91:    iload_1
L92:    idiv
L93:    istore_1
L94:    return
L95:    astore_2
L96:    new java/lang/StringBuffer
L99:    dup
L100:   ldc "89502, "
L102:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L105:   aload_0
L106:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L109:   ldc ", "
L111:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L114:   iload_1
L115:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L118:   ldc ", "
L120:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L123:   aload_2
L124:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L127:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L130:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L133:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L136:   new java/lang/RuntimeException
L139:   dup
L140:   invokespecial Method java/lang/RuntimeException <init> ()V
L143:   athrow
L144:   
    .end code
.end method

.method public a : (ZLkb;)V
    .code stack 5 locals 7
L0:     getstatic Field jc p Z
L3:     istore 6
        .catch java/lang/RuntimeException from L5 to L225 using L225
L5:     iload_1
L6:     ifeq L14
L9:     bipush 65
L11:    putstatic Field gc a I
L14:    aload_2
L15:    invokevirtual Method kb c ()I
L18:    istore_3
L19:    iload_3
L20:    ifne L24
L23:    return
L24:    iload_3
L25:    iconst_1
L26:    if_icmpne L42
L29:    aload_0
L30:    aload_2
L31:    invokevirtual Method kb c ()I
L34:    putfield Field gc f I
L37:    iload 6
L39:    ifeq L14
L42:    iload_3
L43:    iconst_2
L44:    if_icmpne L95
L47:    aload_2
L48:    invokevirtual Method kb c ()I
L51:    istore 4
L53:    aload_0
L54:    iload 4
L56:    newarray int
L58:    putfield Field gc g [I
L61:    iconst_0
L62:    istore 5
L64:    iload 6
L66:    ifeq L83
L69:    aload_0
L70:    getfield Field gc g [I
L73:    iload 5
L75:    aload_2
L76:    invokevirtual Method kb e ()I
L79:    iastore
L80:    iinc 5 1
L83:    iload 5
L85:    iload 4
L87:    if_icmplt L69
L90:    iload 6
L92:    ifeq L14
L95:    iload_3
L96:    iconst_3
L97:    if_icmpne L110
L100:   aload_0
L101:   iconst_1
L102:   putfield Field gc k Z
L105:   iload 6
L107:   ifeq L14
L110:   iload_3
L111:   bipush 40
L113:   if_icmplt L140
L116:   iload_3
L117:   bipush 50
L119:   if_icmpge L140
L122:   aload_0
L123:   getfield Field gc h [I
L126:   iload_3
L127:   bipush 40
L129:   isub
L130:   aload_2
L131:   invokevirtual Method kb e ()I
L134:   iastore
L135:   iload 6
L137:   ifeq L14
L140:   iload_3
L141:   bipush 50
L143:   if_icmplt L170
L146:   iload_3
L147:   bipush 60
L149:   if_icmpge L170
L152:   aload_0
L153:   getfield Field gc i [I
L156:   iload_3
L157:   bipush 50
L159:   isub
L160:   aload_2
L161:   invokevirtual Method kb e ()I
L164:   iastore
L165:   iload 6
L167:   ifeq L14
L170:   iload_3
L171:   bipush 60
L173:   if_icmplt L200
L176:   iload_3
L177:   bipush 70
L179:   if_icmpge L200
L182:   aload_0
L183:   getfield Field gc j [I
L186:   iload_3
L187:   bipush 60
L189:   isub
L190:   aload_2
L191:   invokevirtual Method kb e ()I
L194:   iastore
L195:   iload 6
L197:   ifeq L14
L200:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L203:   new java/lang/StringBuffer
L206:   dup
L207:   ldc "Error unrecognised config code: "
L209:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L212:   iload_3
L213:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L216:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L219:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L222:   goto L14
L225:   astore_3
L226:   new java/lang/StringBuffer
L229:   dup
L230:   ldc "61151, "
L232:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L235:   iload_1
L236:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L239:   ldc ", "
L241:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L244:   aload_2
L245:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L248:   ldc ", "
L250:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L253:   aload_3
L254:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L257:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L260:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L263:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L266:   new java/lang/RuntimeException
L269:   dup
L270:   invokespecial Method java/lang/RuntimeException <init> ()V
L273:   athrow
L274:   
    .end code
.end method

.method public a : ()Leb;
    .code stack 8 locals 6
L0:     getstatic Field jc p Z
L3:     istore 5
L5:     aload_0
L6:     getfield Field gc g [I
L9:     ifnonnull L14
L12:    aconst_null
L13:    areturn
L14:    aload_0
L15:    getfield Field gc g [I
L18:    arraylength
L19:    anewarray eb
L22:    astore_1
L23:    iconst_0
L24:    istore_2
L25:    iload 5
L27:    ifeq L50
L30:    aload_1
L31:    iload_2
L32:    new eb
L35:    dup
L36:    iconst_0
L37:    aload_0
L38:    getfield Field gc g [I
L41:    iload_2
L42:    iaload
L43:    invokespecial Method eb <init> (ZI)V
L46:    aastore
L47:    iinc 2 1
L50:    iload_2
L51:    aload_0
L52:    getfield Field gc g [I
L55:    arraylength
L56:    if_icmplt L30
L59:    aload_1
L60:    arraylength
L61:    iconst_1
L62:    if_icmpne L74
L65:    aload_1
L66:    iconst_0
L67:    aaload
L68:    astore_3
L69:    iload 5
L71:    ifeq L86
L74:    new eb
L77:    dup
L78:    iconst_0
L79:    aload_1
L80:    aload_1
L81:    arraylength
L82:    invokespecial Method eb <init> (I[Leb;I)V
L85:    astore_3
L86:    iconst_0
L87:    istore 4
L89:    iload 5
L91:    ifeq L125
L94:    aload_0
L95:    getfield Field gc h [I
L98:    iload 4
L100:   iaload
L101:   ifeq L132
L104:   aload_3
L105:   aload_0
L106:   getfield Field gc h [I
L109:   iload 4
L111:   iaload
L112:   aload_0
L113:   getfield Field gc i [I
L116:   iload 4
L118:   iaload
L119:   invokevirtual Method eb b (II)V
L122:   iinc 4 1
L125:   iload 4
L127:   bipush 6
L129:   if_icmplt L94
L132:   aload_3
L133:   areturn
L134:   
    .end code
.end method

.method public a : (Z)Leb;
    .code stack 8 locals 9
L0:     getstatic Field jc p Z
L3:     istore 8
        .catch java/lang/RuntimeException from L5 to L143 using L143
L5:     iconst_5
L6:     anewarray eb
L9:     astore_2
L10:    iconst_0
L11:    istore_3
L12:    iconst_0
L13:    istore 4
L15:    iload 8
L17:    ifeq L55
L20:    aload_0
L21:    getfield Field gc j [I
L24:    iload 4
L26:    iaload
L27:    iconst_m1
L28:    if_icmpeq L52
L31:    aload_2
L32:    iload_3
L33:    iinc 3 1
L36:    new eb
L39:    dup
L40:    iconst_0
L41:    aload_0
L42:    getfield Field gc j [I
L45:    iload 4
L47:    iaload
L48:    invokespecial Method eb <init> (ZI)V
L51:    aastore
L52:    iinc 4 1
L55:    iload 4
L57:    iconst_5
L58:    if_icmplt L20
L61:    new eb
L64:    dup
L65:    iconst_0
L66:    aload_2
L67:    iload_3
L68:    invokespecial Method eb <init> (I[Leb;I)V
L71:    astore 5
L73:    iconst_0
L74:    istore 6
L76:    iload 8
L78:    ifeq L113
L81:    aload_0
L82:    getfield Field gc h [I
L85:    iload 6
L87:    iaload
L88:    ifeq L120
L91:    aload 5
L93:    aload_0
L94:    getfield Field gc h [I
L97:    iload 6
L99:    iaload
L100:   aload_0
L101:   getfield Field gc i [I
L104:   iload 6
L106:   iaload
L107:   invokevirtual Method eb b (II)V
L110:   iinc 6 1
L113:   iload 6
L115:   bipush 6
L117:   if_icmplt L81
L120:   iload_1
L121:   ifeq L140
L124:   iconst_1
L125:   istore 7
L127:   iload 8
L129:   ifeq L135
L132:   iinc 7 1
L135:   iload 7
L137:   ifgt L132
L140:   aload 5
L142:   areturn
L143:   astore_2
L144:   new java/lang/StringBuffer
L147:   dup
L148:   ldc "19364, "
L150:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L153:   iload_1
L154:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L157:   ldc ", "
L159:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L162:   aload_2
L163:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L166:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L169:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L172:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L175:   new java/lang/RuntimeException
L178:   dup
L179:   invokespecial Method java/lang/RuntimeException <init> ()V
L182:   athrow
L183:   
    .end code
.end method

.method public <init> : ()V
    .code stack 6 locals 2
L0:     getstatic Field jc p Z
L3:     istore_1
L4:     aload_0
L5:     invokespecial Method java/lang/Object <init> ()V
L8:     aload_0
L9:     iconst_0
L10:    putfield Field gc c Z
L13:    aload_0
L14:    iconst_m1
L15:    putfield Field gc f I
L18:    aload_0
L19:    bipush 6
L21:    newarray int
L23:    putfield Field gc h [I
L26:    aload_0
L27:    bipush 6
L29:    newarray int
L31:    putfield Field gc i [I
L34:    aload_0
L35:    iconst_5
L36:    newarray int
L38:    dup
L39:    iconst_0
L40:    iconst_m1
L41:    iastore
L42:    dup
L43:    iconst_1
L44:    iconst_m1
L45:    iastore
L46:    dup
L47:    iconst_2
L48:    iconst_m1
L49:    iastore
L50:    dup
L51:    iconst_3
L52:    iconst_m1
L53:    iastore
L54:    dup
L55:    iconst_4
L56:    iconst_m1
L57:    iastore
L58:    putfield Field gc j [I
L61:    aload_0
L62:    iconst_0
L63:    putfield Field gc k Z
L66:    getstatic Field u d I
L69:    ifeq L84
L72:    iload_1
L73:    ifeq L80
L76:    iconst_0
L77:    goto L81
L80:    iconst_1
L81:    putstatic Field jc p Z
L84:    return
L85:    
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     sipush 473
L3:     putstatic Field gc b I
L6:     return
L7:     
    .end code
.end method
.end class
