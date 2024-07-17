.version 45 3
.class public super kc
.super java/lang/Object
.field private static a I
.field public static b I
.field public static c [Lkc;
.field public d I
.field public e I
.field public f I
.field public g Ljc;
.field public h Z
.field public i [I
.field public j [I
.field public k I
.field public l I
.field public m I
.field public n I
.field public o I
.field public static p Ls;

.method public static a : (Lub;I)V
    .code stack 8 locals 4
        .catch java/lang/RuntimeException from L0 to L103 using L104
L0:     bipush 91
L2:     iload_1
L3:     idiv
L4:     istore_1
L5:     new kb
L8:     dup
L9:     sipush 363
L12:    aload_0
L13:    ldc "spotanim.dat"
L15:    aconst_null
L16:    iconst_2
L17:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L20:    invokespecial Method kb <init> (I[B)V
L23:    astore_2
L24:    aload_2
L25:    invokevirtual Method kb e ()I
L28:    putstatic Field kc b I
L31:    getstatic Field kc c [Lkc;
L34:    ifnonnull L46
L37:    getstatic Field kc b I
L40:    anewarray kc
L43:    putstatic Field kc c [Lkc;
L46:    iconst_0
L47:    istore_3
L48:    getstatic Field jc p Z
L51:    ifeq L96
L54:    getstatic Field kc c [Lkc;
L57:    iload_3
L58:    aaload
L59:    ifnonnull L74
L62:    getstatic Field kc c [Lkc;
L65:    iload_3
L66:    new kc
L69:    dup
L70:    invokespecial Method kc <init> ()V
L73:    aastore
L74:    getstatic Field kc c [Lkc;
L77:    iload_3
L78:    aaload
L79:    iload_3
L80:    putfield Field kc d I
L83:    getstatic Field kc c [Lkc;
L86:    iload_3
L87:    aaload
L88:    iconst_0
L89:    aload_2
L90:    invokevirtual Method kc a (ZLkb;)V
L93:    iinc 3 1
L96:    iload_3
L97:    getstatic Field kc b I
L100:   if_icmplt L54
L103:   return
L104:   astore_2
L105:   new java/lang/StringBuffer
L108:   dup
L109:   ldc "26561, "
L111:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L114:   aload_0
L115:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L118:   ldc ", "
L120:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L123:   iload_1
L124:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L127:   ldc ", "
L129:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L132:   aload_2
L133:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L136:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L139:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L142:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L145:   new java/lang/RuntimeException
L148:   dup
L149:   invokespecial Method java/lang/RuntimeException <init> ()V
L152:   athrow
L153:   
    .end code
.end method

.method public a : (ZLkb;)V
    .code stack 5 locals 5
L0:     getstatic Field jc p Z
L3:     istore 4
        .catch java/lang/RuntimeException from L5 to L280 using L280
L5:     iload_1
L6:     ifeq L23
L9:     iconst_1
L10:    istore_3
L11:    iload 4
L13:    ifeq L19
L16:    iinc 3 1
L19:    iload_3
L20:    ifgt L16
L23:    aload_2
L24:    invokevirtual Method kb c ()I
L27:    istore_3
L28:    iload_3
L29:    ifne L33
L32:    return
L33:    iload_3
L34:    iconst_1
L35:    if_icmpne L51
L38:    aload_0
L39:    aload_2
L40:    invokevirtual Method kb e ()I
L43:    putfield Field kc e I
L46:    iload 4
L48:    ifeq L23
L51:    iload_3
L52:    iconst_2
L53:    if_icmpne L87
L56:    aload_0
L57:    aload_2
L58:    invokevirtual Method kb e ()I
L61:    putfield Field kc f I
L64:    getstatic Field jc d [Ljc;
L67:    ifnull L23
L70:    aload_0
L71:    getstatic Field jc d [Ljc;
L74:    aload_0
L75:    getfield Field kc f I
L78:    aaload
L79:    putfield Field kc g Ljc;
L82:    iload 4
L84:    ifeq L23
L87:    iload_3
L88:    iconst_3
L89:    if_icmpne L102
L92:    aload_0
L93:    iconst_1
L94:    putfield Field kc h Z
L97:    iload 4
L99:    ifeq L23
L102:   iload_3
L103:   iconst_4
L104:   if_icmpne L120
L107:   aload_0
L108:   aload_2
L109:   invokevirtual Method kb e ()I
L112:   putfield Field kc k I
L115:   iload 4
L117:   ifeq L23
L120:   iload_3
L121:   iconst_5
L122:   if_icmpne L138
L125:   aload_0
L126:   aload_2
L127:   invokevirtual Method kb e ()I
L130:   putfield Field kc l I
L133:   iload 4
L135:   ifeq L23
L138:   iload_3
L139:   bipush 6
L141:   if_icmpne L157
L144:   aload_0
L145:   aload_2
L146:   invokevirtual Method kb e ()I
L149:   putfield Field kc m I
L152:   iload 4
L154:   ifeq L23
L157:   iload_3
L158:   bipush 7
L160:   if_icmpne L176
L163:   aload_0
L164:   aload_2
L165:   invokevirtual Method kb c ()I
L168:   putfield Field kc n I
L171:   iload 4
L173:   ifeq L23
L176:   iload_3
L177:   bipush 8
L179:   if_icmpne L195
L182:   aload_0
L183:   aload_2
L184:   invokevirtual Method kb c ()I
L187:   putfield Field kc o I
L190:   iload 4
L192:   ifeq L23
L195:   iload_3
L196:   bipush 40
L198:   if_icmplt L225
L201:   iload_3
L202:   bipush 50
L204:   if_icmpge L225
L207:   aload_0
L208:   getfield Field kc i [I
L211:   iload_3
L212:   bipush 40
L214:   isub
L215:   aload_2
L216:   invokevirtual Method kb e ()I
L219:   iastore
L220:   iload 4
L222:   ifeq L23
L225:   iload_3
L226:   bipush 50
L228:   if_icmplt L255
L231:   iload_3
L232:   bipush 60
L234:   if_icmpge L255
L237:   aload_0
L238:   getfield Field kc j [I
L241:   iload_3
L242:   bipush 50
L244:   isub
L245:   aload_2
L246:   invokevirtual Method kb e ()I
L249:   iastore
L250:   iload 4
L252:   ifeq L23
L255:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L258:   new java/lang/StringBuffer
L261:   dup
L262:   ldc "Error unrecognised spotanim config code: "
L264:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L267:   iload_3
L268:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L271:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L274:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L277:   goto L23
L280:   astore_3
L281:   new java/lang/StringBuffer
L284:   dup
L285:   ldc "42060, "
L287:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L290:   iload_1
L291:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L294:   ldc ", "
L296:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L299:   aload_2
L300:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L303:   ldc ", "
L305:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L308:   aload_3
L309:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L312:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L315:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L318:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L321:   new java/lang/RuntimeException
L324:   dup
L325:   invokespecial Method java/lang/RuntimeException <init> ()V
L328:   athrow
L329:   
    .end code
.end method

.method public a : ()Leb;
    .code stack 6 locals 3
L0:     getstatic Field kc p Ls;
L3:     aload_0
L4:     getfield Field kc d I
L7:     i2l
L8:     invokevirtual Method s a (J)Ldb;
L11:    checkcast eb
L14:    astore_1
L15:    aload_1
L16:    ifnull L21
L19:    aload_1
L20:    areturn
L21:    new eb
L24:    dup
L25:    iconst_0
L26:    aload_0
L27:    getfield Field kc e I
L30:    invokespecial Method eb <init> (ZI)V
L33:    astore_1
L34:    iconst_0
L35:    istore_2
L36:    getstatic Field jc p Z
L39:    ifeq L70
L42:    aload_0
L43:    getfield Field kc i [I
L46:    iconst_0
L47:    iaload
L48:    ifeq L67
L51:    aload_1
L52:    aload_0
L53:    getfield Field kc i [I
L56:    iload_2
L57:    iaload
L58:    aload_0
L59:    getfield Field kc j [I
L62:    iload_2
L63:    iaload
L64:    invokevirtual Method eb b (II)V
L67:    iinc 2 1
L70:    iload_2
L71:    bipush 6
L73:    if_icmplt L42
L76:    getstatic Field kc p Ls;
L79:    bipush 6
L81:    aload_0
L82:    getfield Field kc d I
L85:    i2l
L86:    aload_1
L87:    invokevirtual Method s a (IJLdb;)V
L90:    aload_1
L91:    areturn
L92:    
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_m1
L6:     putfield Field kc f I
L9:     aload_0
L10:    iconst_0
L11:    putfield Field kc h Z
L14:    aload_0
L15:    bipush 6
L17:    newarray int
L19:    putfield Field kc i [I
L22:    aload_0
L23:    bipush 6
L25:    newarray int
L27:    putfield Field kc j [I
L30:    aload_0
L31:    sipush 128
L34:    putfield Field kc k I
L37:    aload_0
L38:    sipush 128
L41:    putfield Field kc l I
L44:    return
L45:    
    .end code
.end method

.method static <clinit> : ()V
    .code stack 4 locals 0
L0:     sipush 473
L3:     putstatic Field kc a I
L6:     new s
L9:     dup
L10:    iconst_0
L11:    bipush 30
L13:    invokespecial Method s <init> (BI)V
L16:    putstatic Field kc p Ls;
L19:    return
L20:    
    .end code
.end method
.end class
