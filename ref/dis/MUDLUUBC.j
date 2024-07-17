.version 45 3
.class public super MUDLUUBC
.super java/lang/Object
.field private a I
.field private static b Z
.field public static c I
.field public static d [LMUDLUUBC;
.field public e I
.field public f I
.field public g I
.field public h LLKGEGIEW;
.field public i [I
.field public j [I
.field public k I
.field public l I
.field public m I
.field public n I
.field public o I
.field public static p LGCPOSBWX;

.method public static a : (ILXTGLDHGX;)V
    .code stack 6 locals 4
        .catch java/lang/RuntimeException from L0 to L115 using L116
L0:     new MBMGIXGO
L3:     dup
L4:     aload_1
L5:     ldc "spotanim.dat"
L7:     aconst_null
L8:     invokevirtual Method XTGLDHGX a (Ljava/lang/String;[B)[B
L11:    sipush 891
L14:    invokespecial Method MBMGIXGO <init> ([BI)V
L17:    astore_2
L18:    iload_0
L19:    ifeq L36
L22:    getstatic Field MUDLUUBC b Z
L25:    ifeq L32
L28:    iconst_0
L29:    goto L33
L32:    iconst_1
L33:    putstatic Field MUDLUUBC b Z
L36:    aload_2
L37:    invokevirtual Method MBMGIXGO e ()I
L40:    putstatic Field MUDLUUBC c I
L43:    getstatic Field MUDLUUBC d [LMUDLUUBC;
L46:    ifnonnull L58
L49:    getstatic Field MUDLUUBC c I
L52:    anewarray MUDLUUBC
L55:    putstatic Field MUDLUUBC d [LMUDLUUBC;
L58:    iconst_0
L59:    istore_3
L60:    getstatic Field LKGEGIEW t I
L63:    ifeq L108
L66:    getstatic Field MUDLUUBC d [LMUDLUUBC;
L69:    iload_3
L70:    aaload
L71:    ifnonnull L86
L74:    getstatic Field MUDLUUBC d [LMUDLUUBC;
L77:    iload_3
L78:    new MUDLUUBC
L81:    dup
L82:    invokespecial Method MUDLUUBC <init> ()V
L85:    aastore
L86:    getstatic Field MUDLUUBC d [LMUDLUUBC;
L89:    iload_3
L90:    aaload
L91:    iload_3
L92:    putfield Field MUDLUUBC e I
L95:    getstatic Field MUDLUUBC d [LMUDLUUBC;
L98:    iload_3
L99:    aaload
L100:   iconst_1
L101:   aload_2
L102:   invokevirtual Method MUDLUUBC a (ZLMBMGIXGO;)V
L105:   iinc 3 1
L108:   iload_3
L109:   getstatic Field MUDLUUBC c I
L112:   if_icmplt L66
L115:   return
L116:   astore_2
L117:   new java/lang/StringBuffer
L120:   dup
L121:   ldc "33647, "
L123:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L126:   iload_0
L127:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L130:   ldc ", "
L132:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L135:   aload_1
L136:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L139:   ldc ", "
L141:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L144:   aload_2
L145:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L148:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L151:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L154:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L157:   new java/lang/RuntimeException
L160:   dup
L161:   invokespecial Method java/lang/RuntimeException <init> ()V
L164:   athrow
L165:   
    .end code
.end method

.method public a : (ZLMBMGIXGO;)V
    .code stack 5 locals 5
L0:     getstatic Field LKGEGIEW t I
L3:     istore 4
        .catch java/lang/RuntimeException from L5 to L259 using L259
L5:     iload_1
L6:     ifne L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
L17:    aload_2
L18:    invokevirtual Method MBMGIXGO c ()I
L21:    istore_3
L22:    iload_3
L23:    ifne L27
L26:    return
L27:    iload_3
L28:    iconst_1
L29:    if_icmpne L45
L32:    aload_0
L33:    aload_2
L34:    invokevirtual Method MBMGIXGO e ()I
L37:    putfield Field MUDLUUBC f I
L40:    iload 4
L42:    ifeq L17
L45:    iload_3
L46:    iconst_2
L47:    if_icmpne L81
L50:    aload_0
L51:    aload_2
L52:    invokevirtual Method MBMGIXGO e ()I
L55:    putfield Field MUDLUUBC g I
L58:    getstatic Field LKGEGIEW d [LLKGEGIEW;
L61:    ifnull L17
L64:    aload_0
L65:    getstatic Field LKGEGIEW d [LLKGEGIEW;
L68:    aload_0
L69:    getfield Field MUDLUUBC g I
L72:    aaload
L73:    putfield Field MUDLUUBC h LLKGEGIEW;
L76:    iload 4
L78:    ifeq L17
L81:    iload_3
L82:    iconst_4
L83:    if_icmpne L99
L86:    aload_0
L87:    aload_2
L88:    invokevirtual Method MBMGIXGO e ()I
L91:    putfield Field MUDLUUBC k I
L94:    iload 4
L96:    ifeq L17
L99:    iload_3
L100:   iconst_5
L101:   if_icmpne L117
L104:   aload_0
L105:   aload_2
L106:   invokevirtual Method MBMGIXGO e ()I
L109:   putfield Field MUDLUUBC l I
L112:   iload 4
L114:   ifeq L17
L117:   iload_3
L118:   bipush 6
L120:   if_icmpne L136
L123:   aload_0
L124:   aload_2
L125:   invokevirtual Method MBMGIXGO e ()I
L128:   putfield Field MUDLUUBC m I
L131:   iload 4
L133:   ifeq L17
L136:   iload_3
L137:   bipush 7
L139:   if_icmpne L155
L142:   aload_0
L143:   aload_2
L144:   invokevirtual Method MBMGIXGO c ()I
L147:   putfield Field MUDLUUBC n I
L150:   iload 4
L152:   ifeq L17
L155:   iload_3
L156:   bipush 8
L158:   if_icmpne L174
L161:   aload_0
L162:   aload_2
L163:   invokevirtual Method MBMGIXGO c ()I
L166:   putfield Field MUDLUUBC o I
L169:   iload 4
L171:   ifeq L17
L174:   iload_3
L175:   bipush 40
L177:   if_icmplt L204
L180:   iload_3
L181:   bipush 50
L183:   if_icmpge L204
L186:   aload_0
L187:   getfield Field MUDLUUBC i [I
L190:   iload_3
L191:   bipush 40
L193:   isub
L194:   aload_2
L195:   invokevirtual Method MBMGIXGO e ()I
L198:   iastore
L199:   iload 4
L201:   ifeq L17
L204:   iload_3
L205:   bipush 50
L207:   if_icmplt L234
L210:   iload_3
L211:   bipush 60
L213:   if_icmpge L234
L216:   aload_0
L217:   getfield Field MUDLUUBC j [I
L220:   iload_3
L221:   bipush 50
L223:   isub
L224:   aload_2
L225:   invokevirtual Method MBMGIXGO e ()I
L228:   iastore
L229:   iload 4
L231:   ifeq L17
L234:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L237:   new java/lang/StringBuffer
L240:   dup
L241:   ldc "Error unrecognised spotanim config code: "
L243:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L246:   iload_3
L247:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L250:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L253:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L256:   goto L17
L259:   astore_3
L260:   new java/lang/StringBuffer
L263:   dup
L264:   ldc "51394, "
L266:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L269:   iload_1
L270:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L273:   ldc ", "
L275:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L278:   aload_2
L279:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L282:   ldc ", "
L284:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L287:   aload_3
L288:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L291:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L294:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L297:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L300:   new java/lang/RuntimeException
L303:   dup
L304:   invokespecial Method java/lang/RuntimeException <init> ()V
L307:   athrow
L308:   
    .end code
.end method

.method public a : ()LZKARKDQW;
    .code stack 6 locals 3
L0:     getstatic Field MUDLUUBC p LGCPOSBWX;
L3:     aload_0
L4:     getfield Field MUDLUUBC e I
L7:     i2l
L8:     invokevirtual Method GCPOSBWX a (J)LPPOHBEGB;
L11:    checkcast ZKARKDQW
L14:    astore_1
L15:    aload_1
L16:    ifnull L21
L19:    aload_1
L20:    areturn
L21:    aload_0
L22:    getfield Field MUDLUUBC a I
L25:    aload_0
L26:    getfield Field MUDLUUBC f I
L29:    invokestatic Method ZKARKDQW b (II)LZKARKDQW;
L32:    astore_1
L33:    aload_1
L34:    ifnonnull L39
L37:    aconst_null
L38:    areturn
L39:    iconst_0
L40:    istore_2
L41:    getstatic Field LKGEGIEW t I
L44:    ifeq L75
L47:    aload_0
L48:    getfield Field MUDLUUBC i [I
L51:    iconst_0
L52:    iaload
L53:    ifeq L72
L56:    aload_1
L57:    aload_0
L58:    getfield Field MUDLUUBC i [I
L61:    iload_2
L62:    iaload
L63:    aload_0
L64:    getfield Field MUDLUUBC j [I
L67:    iload_2
L68:    iaload
L69:    invokevirtual Method ZKARKDQW e (II)V
L72:    iinc 2 1
L75:    iload_2
L76:    bipush 6
L78:    if_icmplt L47
L81:    getstatic Field MUDLUUBC p LGCPOSBWX;
L84:    aload_1
L85:    aload_0
L86:    getfield Field MUDLUUBC e I
L89:    i2l
L90:    iconst_2
L91:    invokevirtual Method GCPOSBWX a (LPPOHBEGB;JB)V
L94:    aload_1
L95:    areturn
L96:    
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     bipush 9
L7:     putfield Field MUDLUUBC a I
L10:    aload_0
L11:    iconst_m1
L12:    putfield Field MUDLUUBC g I
L15:    aload_0
L16:    bipush 6
L18:    newarray int
L20:    putfield Field MUDLUUBC i [I
L23:    aload_0
L24:    bipush 6
L26:    newarray int
L28:    putfield Field MUDLUUBC j [I
L31:    aload_0
L32:    sipush 128
L35:    putfield Field MUDLUUBC k I
L38:    aload_0
L39:    sipush 128
L42:    putfield Field MUDLUUBC l I
L45:    return
L46:    
    .end code
.end method

.method static <clinit> : ()V
    .code stack 4 locals 0
L0:     iconst_1
L1:     putstatic Field MUDLUUBC b Z
L4:     new GCPOSBWX
L7:     dup
L8:     iconst_0
L9:     bipush 30
L11:    invokespecial Method GCPOSBWX <init> (ZI)V
L14:    putstatic Field MUDLUUBC p LGCPOSBWX;
L17:    return
L18:    
    .end code
.end method
.end class
