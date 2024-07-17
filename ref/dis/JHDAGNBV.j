.version 45 3
.class public super JHDAGNBV
.super java/lang/Object
.field private a Z
.field private static b Z
.field private static c Z
.field private d I
.field private static e [LJHDAGNBV;
.field public static f [I
.field private static g [B
.field private static h LMBMGIXGO;
.field private i [LCLRWXPOI;
.field private j I
.field private k I

.method private <init> : (I)V
    .code stack 3 locals 3
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_1
L6:     putfield Field JHDAGNBV a Z
L9:     aload_0
L10:    bipush 10
L12:    anewarray CLRWXPOI
L15:    putfield Field JHDAGNBV i [LCLRWXPOI;
        .catch java/lang/RuntimeException from L18 to L37 using L38
L18:    iload_1
L19:    bipush 8
L21:    if_icmplt L30
L24:    iload_1
L25:    bipush 8
L27:    if_icmple L37
L30:    aload_0
L31:    sipush 477
L34:    putfield Field JHDAGNBV d I
L37:    return
L38:    astore_2
L39:    new java/lang/StringBuffer
L42:    dup
L43:    ldc "92850, "
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
L78:    
    .end code
.end method

.method public static final a : (ILMBMGIXGO;)V
    .code stack 5 locals 3
        .catch java/lang/RuntimeException from L0 to L97 using L97
L0:     ldc 441000
L2:     newarray byte
L4:     putstatic Field JHDAGNBV g [B
L7:     new MBMGIXGO
L10:    dup
L11:    getstatic Field JHDAGNBV g [B
L14:    sipush 891
L17:    invokespecial Method MBMGIXGO <init> ([BI)V
L20:    putstatic Field JHDAGNBV h LMBMGIXGO;
L23:    iload_0
L24:    ifeq L41
L27:    getstatic Field JHDAGNBV b Z
L30:    ifeq L37
L33:    iconst_0
L34:    goto L38
L37:    iconst_1
L38:    putstatic Field JHDAGNBV b Z
L41:    invokestatic Method CLRWXPOI a ()V
L44:    aload_1
L45:    invokevirtual Method MBMGIXGO e ()I
L48:    istore_2
L49:    iload_2
L50:    ldc 65535
L52:    if_icmpne L56
L55:    return
L56:    getstatic Field JHDAGNBV e [LJHDAGNBV;
L59:    iload_2
L60:    new JHDAGNBV
L63:    dup
L64:    bipush 8
L66:    invokespecial Method JHDAGNBV <init> (I)V
L69:    aastore
L70:    getstatic Field JHDAGNBV e [LJHDAGNBV;
L73:    iload_2
L74:    aaload
L75:    iconst_1
L76:    aload_1
L77:    invokespecial Method JHDAGNBV a (ZLMBMGIXGO;)V
L80:    getstatic Field JHDAGNBV f [I
L83:    iload_2
L84:    getstatic Field JHDAGNBV e [LJHDAGNBV;
L87:    iload_2
L88:    aaload
L89:    iconst_0
L90:    invokespecial Method JHDAGNBV a (I)I
L93:    iastore
L94:    goto L44
L97:    astore_2
L98:    new java/lang/StringBuffer
L101:   dup
L102:   ldc "17085, "
L104:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L107:   iload_0
L108:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L111:   ldc ", "
L113:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L116:   aload_1
L117:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L120:   ldc ", "
L122:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L125:   aload_2
L126:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L129:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L132:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L135:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L138:   new java/lang/RuntimeException
L141:   dup
L142:   invokespecial Method java/lang/RuntimeException <init> ()V
L145:   athrow
L146:   
    .end code
.end method

.method public static final a : (IIZ)LMBMGIXGO;
    .code stack 3 locals 4
        .catch java/lang/RuntimeException from L0 to L42 using L42
L0:     iload_2
L1:     ifeq L18
L4:     getstatic Field JHDAGNBV c Z
L7:     ifeq L14
L10:    iconst_0
L11:    goto L15
L14:    iconst_1
L15:    putstatic Field JHDAGNBV c Z
L18:    getstatic Field JHDAGNBV e [LJHDAGNBV;
L21:    iload_1
L22:    aaload
L23:    ifnull L40
L26:    getstatic Field JHDAGNBV e [LJHDAGNBV;
L29:    iload_1
L30:    aaload
L31:    astore_3
L32:    aload_3
L33:    iload_0
L34:    bipush 6
L36:    invokespecial Method JHDAGNBV a (II)LMBMGIXGO;
L39:    areturn
L40:    aconst_null
L41:    areturn
L42:    astore_3
L43:    new java/lang/StringBuffer
L46:    dup
L47:    ldc "50738, "
L49:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L52:    iload_0
L53:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L56:    ldc ", "
L58:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L61:    iload_1
L62:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L65:    ldc ", "
L67:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L70:    iload_2
L71:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L74:    ldc ", "
L76:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L79:    aload_3
L80:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L83:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L86:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L89:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L92:    new java/lang/RuntimeException
L95:    dup
L96:    invokespecial Method java/lang/RuntimeException <init> ()V
L99:    athrow
L100:   
    .end code
.end method

.method private final a : (ZLMBMGIXGO;)V
    .code stack 5 locals 5
        .catch java/lang/RuntimeException from L0 to L88 using L89
L0:     iconst_0
L1:     istore_3
L2:     getstatic Field OZKFTHAD p I
L5:     ifeq L56
L8:     aload_2
L9:     invokevirtual Method MBMGIXGO c ()I
L12:    istore 4
L14:    iload 4
L16:    ifeq L53
L19:    aload_2
L20:    dup
L21:    getfield Field MBMGIXGO z I
L24:    iconst_1
L25:    isub
L26:    putfield Field MBMGIXGO z I
L29:    aload_0
L30:    getfield Field JHDAGNBV i [LCLRWXPOI;
L33:    iload_3
L34:    new CLRWXPOI
L37:    dup
L38:    invokespecial Method CLRWXPOI <init> ()V
L41:    aastore
L42:    aload_0
L43:    getfield Field JHDAGNBV i [LCLRWXPOI;
L46:    iload_3
L47:    aaload
L48:    iconst_1
L49:    aload_2
L50:    invokevirtual Method CLRWXPOI a (ZLMBMGIXGO;)V
L53:    iinc 3 1
L56:    iload_3
L57:    bipush 10
L59:    if_icmplt L8
L62:    iload_1
L63:    ifne L72
L66:    aload_0
L67:    bipush 58
L69:    putfield Field JHDAGNBV d I
L72:    aload_0
L73:    aload_2
L74:    invokevirtual Method MBMGIXGO e ()I
L77:    putfield Field JHDAGNBV j I
L80:    aload_0
L81:    aload_2
L82:    invokevirtual Method MBMGIXGO e ()I
L85:    putfield Field JHDAGNBV k I
L88:    return
L89:    astore_3
L90:    new java/lang/StringBuffer
L93:    dup
L94:    ldc "1629, "
L96:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L99:    iload_1
L100:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L103:   ldc ", "
L105:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L108:   aload_2
L109:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L112:   ldc ", "
L114:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L117:   aload_3
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

.method private final a : (I)I
    .code stack 5 locals 6
L0:     getstatic Field OZKFTHAD p I
L3:     istore 5
        .catch java/lang/RuntimeException from L5 to L200 using L200
L5:     ldc 9999999
L7:     istore_2
L8:     iload_1
L9:     ifeq L18
L12:    aload_0
L13:    bipush -52
L15:    putfield Field JHDAGNBV d I
L18:    iconst_0
L19:    istore_3
L20:    iload 5
L22:    ifeq L66
L25:    aload_0
L26:    getfield Field JHDAGNBV i [LCLRWXPOI;
L29:    iload_3
L30:    aaload
L31:    ifnull L63
L34:    aload_0
L35:    getfield Field JHDAGNBV i [LCLRWXPOI;
L38:    iload_3
L39:    aaload
L40:    getfield Field CLRWXPOI r I
L43:    bipush 20
L45:    idiv
L46:    iload_2
L47:    if_icmpge L63
L50:    aload_0
L51:    getfield Field JHDAGNBV i [LCLRWXPOI;
L54:    iload_3
L55:    aaload
L56:    getfield Field CLRWXPOI r I
L59:    bipush 20
L61:    idiv
L62:    istore_2
L63:    iinc 3 1
L66:    iload_3
L67:    bipush 10
L69:    if_icmplt L25
L72:    aload_0
L73:    getfield Field JHDAGNBV j I
L76:    aload_0
L77:    getfield Field JHDAGNBV k I
L80:    if_icmpge L102
L83:    aload_0
L84:    getfield Field JHDAGNBV j I
L87:    bipush 20
L89:    idiv
L90:    iload_2
L91:    if_icmpge L102
L94:    aload_0
L95:    getfield Field JHDAGNBV j I
L98:    bipush 20
L100:   idiv
L101:   istore_2
L102:   iload_2
L103:   ldc 9999999
L105:   if_icmpeq L112
L108:   iload_2
L109:   ifne L114
L112:   iconst_0
L113:   ireturn
L114:   iconst_0
L115:   istore 4
L117:   iload 5
L119:   ifeq L154
L122:   aload_0
L123:   getfield Field JHDAGNBV i [LCLRWXPOI;
L126:   iload 4
L128:   aaload
L129:   ifnull L151
L132:   aload_0
L133:   getfield Field JHDAGNBV i [LCLRWXPOI;
L136:   iload 4
L138:   aaload
L139:   dup
L140:   getfield Field CLRWXPOI r I
L143:   iload_2
L144:   bipush 20
L146:   imul
L147:   isub
L148:   putfield Field CLRWXPOI r I
L151:   iinc 4 1
L154:   iload 4
L156:   bipush 10
L158:   if_icmplt L122
L161:   aload_0
L162:   getfield Field JHDAGNBV j I
L165:   aload_0
L166:   getfield Field JHDAGNBV k I
L169:   if_icmpge L198
L172:   aload_0
L173:   dup
L174:   getfield Field JHDAGNBV j I
L177:   iload_2
L178:   bipush 20
L180:   imul
L181:   isub
L182:   putfield Field JHDAGNBV j I
L185:   aload_0
L186:   dup
L187:   getfield Field JHDAGNBV k I
L190:   iload_2
L191:   bipush 20
L193:   imul
L194:   isub
L195:   putfield Field JHDAGNBV k I
L198:   iload_2
L199:   ireturn
L200:   astore_2
L201:   new java/lang/StringBuffer
L204:   dup
L205:   ldc "43186, "
L207:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L210:   iload_1
L211:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L214:   ldc ", "
L216:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L219:   aload_2
L220:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L223:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L226:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L229:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L232:   new java/lang/RuntimeException
L235:   dup
L236:   invokespecial Method java/lang/RuntimeException <init> ()V
L239:   athrow
L240:   
    .end code
.end method

.method private final a : (II)LMBMGIXGO;
    .code stack 5 locals 5
        .catch java/lang/RuntimeException from L0 to L171 using L171
L0:     aload_0
L1:     iload_1
L2:     invokespecial Method JHDAGNBV b (I)I
L5:     istore_3
L6:     getstatic Field JHDAGNBV h LMBMGIXGO;
L9:     iconst_0
L10:    putfield Field MBMGIXGO z I
L13:    getstatic Field JHDAGNBV h LMBMGIXGO;
L16:    ldc 1380533830
L18:    invokevirtual Method MBMGIXGO d (I)V
L21:    getstatic Field JHDAGNBV h LMBMGIXGO;
L24:    iconst_0
L25:    bipush 36
L27:    iload_3
L28:    iadd
L29:    invokevirtual Method MBMGIXGO b (II)V
L32:    getstatic Field JHDAGNBV h LMBMGIXGO;
L35:    ldc 1463899717
L37:    invokevirtual Method MBMGIXGO d (I)V
L40:    getstatic Field JHDAGNBV h LMBMGIXGO;
L43:    ldc 1718449184
L45:    invokevirtual Method MBMGIXGO d (I)V
L48:    getstatic Field JHDAGNBV h LMBMGIXGO;
L51:    iconst_0
L52:    bipush 16
L54:    invokevirtual Method MBMGIXGO b (II)V
L57:    getstatic Field JHDAGNBV h LMBMGIXGO;
L60:    iconst_1
L61:    iconst_1
L62:    invokevirtual Method MBMGIXGO a (ZI)V
L65:    iload_2
L66:    bipush 6
L68:    if_icmplt L77
L71:    iload_2
L72:    bipush 6
L74:    if_icmple L94
L77:    iconst_1
L78:    istore 4
L80:    getstatic Field OZKFTHAD p I
L83:    ifeq L89
L86:    iinc 4 1
L89:    iload 4
L91:    ifgt L86
L94:    getstatic Field JHDAGNBV h LMBMGIXGO;
L97:    iconst_1
L98:    iconst_1
L99:    invokevirtual Method MBMGIXGO a (ZI)V
L102:   getstatic Field JHDAGNBV h LMBMGIXGO;
L105:   iconst_0
L106:   sipush 22050
L109:   invokevirtual Method MBMGIXGO b (II)V
L112:   getstatic Field JHDAGNBV h LMBMGIXGO;
L115:   iconst_0
L116:   sipush 22050
L119:   invokevirtual Method MBMGIXGO b (II)V
L122:   getstatic Field JHDAGNBV h LMBMGIXGO;
L125:   iconst_1
L126:   iconst_1
L127:   invokevirtual Method MBMGIXGO a (ZI)V
L130:   getstatic Field JHDAGNBV h LMBMGIXGO;
L133:   iconst_1
L134:   bipush 8
L136:   invokevirtual Method MBMGIXGO a (ZI)V
L139:   getstatic Field JHDAGNBV h LMBMGIXGO;
L142:   ldc 1684108385
L144:   invokevirtual Method MBMGIXGO d (I)V
L147:   getstatic Field JHDAGNBV h LMBMGIXGO;
L150:   iconst_0
L151:   iload_3
L152:   invokevirtual Method MBMGIXGO b (II)V
L155:   getstatic Field JHDAGNBV h LMBMGIXGO;
L158:   dup
L159:   getfield Field MBMGIXGO z I
L162:   iload_3
L163:   iadd
L164:   putfield Field MBMGIXGO z I
L167:   getstatic Field JHDAGNBV h LMBMGIXGO;
L170:   areturn
L171:   astore_3
L172:   new java/lang/StringBuffer
L175:   dup
L176:   ldc "47851, "
L178:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L181:   iload_1
L182:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L185:   ldc ", "
L187:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L190:   iload_2
L191:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L194:   ldc ", "
L196:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L199:   aload_3
L200:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L203:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L206:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L209:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L212:   new java/lang/RuntimeException
L215:   dup
L216:   invokespecial Method java/lang/RuntimeException <init> ()V
L219:   athrow
L220:   
    .end code
.end method

.method private final b : (I)I
    .code stack 6 locals 15
L0:     getstatic Field OZKFTHAD p I
L3:     istore 14
L5:     iconst_0
L6:     istore_2
L7:     iconst_0
L8:     istore_3
L9:     iload 14
L11:    ifeq L69
L14:    aload_0
L15:    getfield Field JHDAGNBV i [LCLRWXPOI;
L18:    iload_3
L19:    aaload
L20:    ifnull L66
L23:    aload_0
L24:    getfield Field JHDAGNBV i [LCLRWXPOI;
L27:    iload_3
L28:    aaload
L29:    getfield Field CLRWXPOI q I
L32:    aload_0
L33:    getfield Field JHDAGNBV i [LCLRWXPOI;
L36:    iload_3
L37:    aaload
L38:    getfield Field CLRWXPOI r I
L41:    iadd
L42:    iload_2
L43:    if_icmple L66
L46:    aload_0
L47:    getfield Field JHDAGNBV i [LCLRWXPOI;
L50:    iload_3
L51:    aaload
L52:    getfield Field CLRWXPOI q I
L55:    aload_0
L56:    getfield Field JHDAGNBV i [LCLRWXPOI;
L59:    iload_3
L60:    aaload
L61:    getfield Field CLRWXPOI r I
L64:    iadd
L65:    istore_2
L66:    iinc 3 1
L69:    iload_3
L70:    bipush 10
L72:    if_icmplt L14
L75:    iload_2
L76:    ifne L81
L79:    iconst_0
L80:    ireturn
L81:    sipush 22050
L84:    iload_2
L85:    imul
L86:    sipush 1000
L89:    idiv
L90:    istore 4
L92:    sipush 22050
L95:    aload_0
L96:    getfield Field JHDAGNBV j I
L99:    imul
L100:   sipush 1000
L103:   idiv
L104:   istore 5
L106:   sipush 22050
L109:   aload_0
L110:   getfield Field JHDAGNBV k I
L113:   imul
L114:   sipush 1000
L117:   idiv
L118:   istore 6
L120:   iload 5
L122:   iflt L151
L125:   iload 5
L127:   iload 4
L129:   if_icmpgt L151
L132:   iload 6
L134:   iflt L151
L137:   iload 6
L139:   iload 4
L141:   if_icmpgt L151
L144:   iload 5
L146:   iload 6
L148:   if_icmplt L153
L151:   iconst_0
L152:   istore_1
L153:   iload 4
L155:   iload 6
L157:   iload 5
L159:   isub
L160:   iload_1
L161:   iconst_1
L162:   isub
L163:   imul
L164:   iadd
L165:   istore 7
L167:   bipush 44
L169:   istore 8
L171:   iload 14
L173:   ifeq L188
L176:   getstatic Field JHDAGNBV g [B
L179:   iload 8
L181:   sipush -128
L184:   bastore
L185:   iinc 8 1
L188:   iload 8
L190:   iload 7
L192:   bipush 44
L194:   iadd
L195:   if_icmplt L176
L198:   iconst_0
L199:   istore 9
L201:   iload 14
L203:   ifeq L326
L206:   aload_0
L207:   getfield Field JHDAGNBV i [LCLRWXPOI;
L210:   iload 9
L212:   aaload
L213:   ifnull L323
L216:   aload_0
L217:   getfield Field JHDAGNBV i [LCLRWXPOI;
L220:   iload 9
L222:   aaload
L223:   getfield Field CLRWXPOI q I
L226:   sipush 22050
L229:   imul
L230:   sipush 1000
L233:   idiv
L234:   istore 10
L236:   aload_0
L237:   getfield Field JHDAGNBV i [LCLRWXPOI;
L240:   iload 9
L242:   aaload
L243:   getfield Field CLRWXPOI r I
L246:   sipush 22050
L249:   imul
L250:   sipush 1000
L253:   idiv
L254:   istore 11
L256:   aload_0
L257:   getfield Field JHDAGNBV i [LCLRWXPOI;
L260:   iload 9
L262:   aaload
L263:   iload 10
L265:   aload_0
L266:   getfield Field JHDAGNBV i [LCLRWXPOI;
L269:   iload 9
L271:   aaload
L272:   getfield Field CLRWXPOI q I
L275:   invokevirtual Method CLRWXPOI a (II)[I
L278:   astore 12
L280:   iconst_0
L281:   istore 13
L283:   iload 14
L285:   ifeq L316
L288:   getstatic Field JHDAGNBV g [B
L291:   iload 13
L293:   iload 11
L295:   iadd
L296:   bipush 44
L298:   iadd
L299:   dup2
L300:   baload
L301:   aload 12
L303:   iload 13
L305:   iaload
L306:   bipush 8
L308:   ishr
L309:   i2b
L310:   iadd
L311:   i2b
L312:   bastore
L313:   iinc 13 1
L316:   iload 13
L318:   iload 10
L320:   if_icmplt L288
L323:   iinc 9 1
L326:   iload 9
L328:   bipush 10
L330:   if_icmplt L206
L333:   iload_1
L334:   iconst_1
L335:   if_icmple L457
L338:   iinc 5 44
L341:   iinc 6 44
L344:   iinc 4 44
L347:   iinc 7 44
L350:   iload 7
L352:   iload 4
L354:   isub
L355:   istore 10
L357:   iload 4
L359:   iconst_1
L360:   isub
L361:   istore 11
L363:   iload 14
L365:   ifeq L386
L368:   getstatic Field JHDAGNBV g [B
L371:   iload 11
L373:   iload 10
L375:   iadd
L376:   getstatic Field JHDAGNBV g [B
L379:   iload 11
L381:   baload
L382:   bastore
L383:   iinc 11 -1
L386:   iload 11
L388:   iload 6
L390:   if_icmpge L368
L393:   iconst_1
L394:   istore 12
L396:   iload 14
L398:   ifeq L448
L401:   iload 6
L403:   iload 5
L405:   isub
L406:   iload 12
L408:   imul
L409:   istore 10
L411:   iload 5
L413:   istore 13
L415:   iload 14
L417:   ifeq L438
L420:   getstatic Field JHDAGNBV g [B
L423:   iload 13
L425:   iload 10
L427:   iadd
L428:   getstatic Field JHDAGNBV g [B
L431:   iload 13
L433:   baload
L434:   bastore
L435:   iinc 13 1
L438:   iload 13
L440:   iload 6
L442:   if_icmplt L420
L445:   iinc 12 1
L448:   iload 12
L450:   iload_1
L451:   if_icmplt L401
L454:   iinc 7 -44
L457:   iload 7
L459:   ireturn
L460:   
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_1
L1:     putstatic Field JHDAGNBV c Z
L4:     sipush 5000
L7:     anewarray JHDAGNBV
L10:    putstatic Field JHDAGNBV e [LJHDAGNBV;
L13:    sipush 5000
L16:    newarray int
L18:    putstatic Field JHDAGNBV f [I
L21:    return
L22:    
    .end code
.end method
.end class
