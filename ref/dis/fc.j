.version 45 3
.class public super fc
.super java/lang/Object
.field private static a I
.field private static b I
.field public static c I
.field public static d [Lfc;
.field public e I
.field public f I
.field public g Z
.field public h Z
.field public i Ljava/lang/String;
.field public j I
.field public k I
.field public l I
.field public m I
.field public n I
.field public o I

.method public static a : (Lub;I)V
    .code stack 8 locals 4
        .catch java/lang/RuntimeException from L0 to L94 using L95
L0:     new kb
L3:     dup
L4:     sipush 363
L7:     aload_0
L8:     ldc "flo.dat"
L10:    aconst_null
L11:    iconst_2
L12:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L15:    invokespecial Method kb <init> (I[B)V
L18:    astore_2
L19:    aload_2
L20:    invokevirtual Method kb e ()I
L23:    putstatic Field fc c I
L26:    bipush 35
L28:    iload_1
L29:    idiv
L30:    istore_1
L31:    getstatic Field fc d [Lfc;
L34:    ifnonnull L46
L37:    getstatic Field fc c I
L40:    anewarray fc
L43:    putstatic Field fc d [Lfc;
L46:    iconst_0
L47:    istore_3
L48:    getstatic Field jc p Z
L51:    ifeq L87
L54:    getstatic Field fc d [Lfc;
L57:    iload_3
L58:    aaload
L59:    ifnonnull L74
L62:    getstatic Field fc d [Lfc;
L65:    iload_3
L66:    new fc
L69:    dup
L70:    invokespecial Method fc <init> ()V
L73:    aastore
L74:    getstatic Field fc d [Lfc;
L77:    iload_3
L78:    aaload
L79:    iconst_0
L80:    aload_2
L81:    invokevirtual Method fc a (ZLkb;)V
L84:    iinc 3 1
L87:    iload_3
L88:    getstatic Field fc c I
L91:    if_icmplt L54
L94:    return
L95:    astore_2
L96:    new java/lang/StringBuffer
L99:    dup
L100:   ldc "39430, "
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
    .code stack 5 locals 5
L0:     getstatic Field jc p Z
L3:     istore 4
        .catch java/lang/RuntimeException from L5 to L148 using L148
L5:     iload_1
L6:     ifeq L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
L17:    aload_2
L18:    invokevirtual Method kb c ()I
L21:    istore_3
L22:    iload_3
L23:    ifne L27
L26:    return
L27:    iload_3
L28:    iconst_1
L29:    if_icmpne L56
L32:    aload_0
L33:    aload_2
L34:    invokevirtual Method kb g ()I
L37:    putfield Field fc e I
L40:    aload_0
L41:    getstatic Field fc b I
L44:    aload_0
L45:    getfield Field fc e I
L48:    invokespecial Method fc a (II)V
L51:    iload 4
L53:    ifeq L17
L56:    iload_3
L57:    iconst_2
L58:    if_icmpne L74
L61:    aload_0
L62:    aload_2
L63:    invokevirtual Method kb c ()I
L66:    putfield Field fc f I
L69:    iload 4
L71:    ifeq L17
L74:    iload_3
L75:    iconst_3
L76:    if_icmpne L89
L79:    aload_0
L80:    iconst_1
L81:    putfield Field fc g Z
L84:    iload 4
L86:    ifeq L17
L89:    iload_3
L90:    iconst_5
L91:    if_icmpne L104
L94:    aload_0
L95:    iconst_0
L96:    putfield Field fc h Z
L99:    iload 4
L101:   ifeq L17
L104:   iload_3
L105:   bipush 6
L107:   if_icmpne L123
L110:   aload_0
L111:   aload_2
L112:   invokevirtual Method kb i ()Ljava/lang/String;
L115:   putfield Field fc i Ljava/lang/String;
L118:   iload 4
L120:   ifeq L17
L123:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L126:   new java/lang/StringBuffer
L129:   dup
L130:   ldc "Error unrecognised config code: "
L132:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L135:   iload_3
L136:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L139:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L142:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L145:   goto L17
L148:   astore_3
L149:   new java/lang/StringBuffer
L152:   dup
L153:   ldc "91653, "
L155:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L158:   iload_1
L159:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L162:   ldc ", "
L164:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L167:   aload_2
L168:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L171:   ldc ", "
L173:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L176:   aload_3
L177:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L180:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L183:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L186:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L189:   new java/lang/RuntimeException
L192:   dup
L193:   invokespecial Method java/lang/RuntimeException <init> ()V
L196:   athrow
L197:   
    .end code
.end method

.method private a : (II)V
    .code stack 9 locals 23
L0:     getstatic Field jc p Z
L3:     istore 22
        .catch java/lang/RuntimeException from L5 to L596 using L597
L5:     iload_2
L6:     bipush 16
L8:     ishr
L9:     sipush 255
L12:    iand
L13:    i2d
L14:    ldc2_w 2.56e2
L17:    ddiv
L18:    dstore_3
L19:    iload_1
L20:    iflt L39
L23:    iconst_1
L24:    istore 5
L26:    iload 22
L28:    ifeq L34
L31:    iinc 5 1
L34:    iload 5
L36:    ifgt L31
L39:    iload_2
L40:    bipush 8
L42:    ishr
L43:    sipush 255
L46:    iand
L47:    i2d
L48:    ldc2_w 2.56e2
L51:    ddiv
L52:    dstore 5
L54:    iload_2
L55:    sipush 255
L58:    iand
L59:    i2d
L60:    ldc2_w 2.56e2
L63:    ddiv
L64:    dstore 7
L66:    dload_3
L67:    dstore 9
L69:    dload 5
L71:    dload 9
L73:    dcmpg
L74:    ifge L81
L77:    dload 5
L79:    dstore 9
L81:    dload 7
L83:    dload 9
L85:    dcmpg
L86:    ifge L93
L89:    dload 7
L91:    dstore 9
L93:    dload_3
L94:    dstore 11
L96:    dload 5
L98:    dload 11
L100:   dcmpl
L101:   ifle L108
L104:   dload 5
L106:   dstore 11
L108:   dload 7
L110:   dload 11
L112:   dcmpl
L113:   ifle L120
L116:   dload 7
L118:   dstore 11
L120:   dconst_0
L121:   dstore 13
L123:   dconst_0
L124:   dstore 15
L126:   dload 9
L128:   dload 11
L130:   dadd
L131:   ldc2_w 2e0
L134:   ddiv
L135:   dstore 17
L137:   dload 9
L139:   dload 11
L141:   dcmpl
L142:   ifeq L271
L145:   dload 17
L147:   ldc2_w 5e-1
L150:   dcmpg
L151:   ifge L167
L154:   dload 11
L156:   dload 9
L158:   dsub
L159:   dload 11
L161:   dload 9
L163:   dadd
L164:   ddiv
L165:   dstore 15
L167:   dload 17
L169:   ldc2_w 5e-1
L172:   dcmpl
L173:   iflt L193
L176:   dload 11
L178:   dload 9
L180:   dsub
L181:   ldc2_w 2e0
L184:   dload 11
L186:   dsub
L187:   dload 9
L189:   dsub
L190:   ddiv
L191:   dstore 15
L193:   dload_3
L194:   dload 11
L196:   dcmpl
L197:   ifne L218
L200:   dload 5
L202:   dload 7
L204:   dsub
L205:   dload 11
L207:   dload 9
L209:   dsub
L210:   ddiv
L211:   dstore 13
L213:   iload 22
L215:   ifeq L271
L218:   dload 5
L220:   dload 11
L222:   dcmpl
L223:   ifne L247
L226:   ldc2_w 2e0
L229:   dload 7
L231:   dload_3
L232:   dsub
L233:   dload 11
L235:   dload 9
L237:   dsub
L238:   ddiv
L239:   dadd
L240:   dstore 13
L242:   iload 22
L244:   ifeq L271
L247:   dload 7
L249:   dload 11
L251:   dcmpl
L252:   ifne L271
L255:   ldc2_w 4e0
L258:   dload_3
L259:   dload 5
L261:   dsub
L262:   dload 11
L264:   dload 9
L266:   dsub
L267:   ddiv
L268:   dadd
L269:   dstore 13
L271:   dload 13
L273:   ldc2_w 6e0
L276:   ddiv
L277:   dstore 13
L279:   aload_0
L280:   dload 13
L282:   ldc2_w 2.56e2
L285:   dmul
L286:   d2i
L287:   putfield Field fc j I
L290:   aload_0
L291:   dload 15
L293:   ldc2_w 2.56e2
L296:   dmul
L297:   d2i
L298:   putfield Field fc k I
L301:   aload_0
L302:   dload 17
L304:   ldc2_w 2.56e2
L307:   dmul
L308:   d2i
L309:   putfield Field fc l I
L312:   aload_0
L313:   getfield Field fc k I
L316:   ifge L329
L319:   aload_0
L320:   iconst_0
L321:   putfield Field fc k I
L324:   iload 22
L326:   ifeq L346
L329:   aload_0
L330:   getfield Field fc k I
L333:   sipush 255
L336:   if_icmple L346
L339:   aload_0
L340:   sipush 255
L343:   putfield Field fc k I
L346:   aload_0
L347:   getfield Field fc l I
L350:   ifge L363
L353:   aload_0
L354:   iconst_0
L355:   putfield Field fc l I
L358:   iload 22
L360:   ifeq L380
L363:   aload_0
L364:   getfield Field fc l I
L367:   sipush 255
L370:   if_icmple L380
L373:   aload_0
L374:   sipush 255
L377:   putfield Field fc l I
L380:   dload 17
L382:   ldc2_w 5e-1
L385:   dcmpl
L386:   ifle L410
L389:   aload_0
L390:   dconst_1
L391:   dload 17
L393:   dsub
L394:   dload 15
L396:   dmul
L397:   ldc2_w 5.12e2
L400:   dmul
L401:   d2i
L402:   putfield Field fc n I
L405:   iload 22
L407:   ifeq L424
L410:   aload_0
L411:   dload 17
L413:   dload 15
L415:   dmul
L416:   ldc2_w 5.12e2
L419:   dmul
L420:   d2i
L421:   putfield Field fc n I
L424:   aload_0
L425:   getfield Field fc n I
L428:   iconst_1
L429:   if_icmpge L437
L432:   aload_0
L433:   iconst_1
L434:   putfield Field fc n I
L437:   aload_0
L438:   dload 13
L440:   aload_0
L441:   getfield Field fc n I
L444:   i2d
L445:   dmul
L446:   d2i
L447:   putfield Field fc m I
L450:   aload_0
L451:   getfield Field fc j I
L454:   invokestatic Method java/lang/Math random ()D
L457:   ldc2_w 1.6e1
L460:   dmul
L461:   d2i
L462:   iadd
L463:   bipush 8
L465:   isub
L466:   istore 19
L468:   iload 19
L470:   ifge L481
L473:   iconst_0
L474:   istore 19
L476:   iload 22
L478:   ifeq L494
L481:   iload 19
L483:   sipush 255
L486:   if_icmple L494
L489:   sipush 255
L492:   istore 19
L494:   aload_0
L495:   getfield Field fc k I
L498:   invokestatic Method java/lang/Math random ()D
L501:   ldc2_w 4.8e1
L504:   dmul
L505:   d2i
L506:   iadd
L507:   bipush 24
L509:   isub
L510:   istore 20
L512:   iload 20
L514:   ifge L525
L517:   iconst_0
L518:   istore 20
L520:   iload 22
L522:   ifeq L538
L525:   iload 20
L527:   sipush 255
L530:   if_icmple L538
L533:   sipush 255
L536:   istore 20
L538:   aload_0
L539:   getfield Field fc l I
L542:   invokestatic Method java/lang/Math random ()D
L545:   ldc2_w 4.8e1
L548:   dmul
L549:   d2i
L550:   iadd
L551:   bipush 24
L553:   isub
L554:   istore 21
L556:   iload 21
L558:   ifge L569
L561:   iconst_0
L562:   istore 21
L564:   iload 22
L566:   ifeq L582
L569:   iload 21
L571:   sipush 255
L574:   if_icmple L582
L577:   sipush 255
L580:   istore 21
L582:   aload_0
L583:   aload_0
L584:   iload 19
L586:   iload 20
L588:   iload 21
L590:   invokespecial Method fc a (III)I
L593:   putfield Field fc o I
L596:   return
L597:   astore_3
L598:   new java/lang/StringBuffer
L601:   dup
L602:   ldc "14446, "
L604:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L607:   iload_1
L608:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L611:   ldc ", "
L613:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L616:   iload_2
L617:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L620:   ldc ", "
L622:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L625:   aload_3
L626:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L629:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L632:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L635:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L638:   new java/lang/RuntimeException
L641:   dup
L642:   invokespecial Method java/lang/RuntimeException <init> ()V
L645:   athrow
L646:   
    .end code
.end method

.method private final a : (III)I
    .code stack 3 locals 5
L0:     iload_3
L1:     sipush 179
L4:     if_icmple L11
L7:     iload_2
L8:     iconst_2
L9:     idiv
L10:    istore_2
L11:    iload_3
L12:    sipush 192
L15:    if_icmple L22
L18:    iload_2
L19:    iconst_2
L20:    idiv
L21:    istore_2
L22:    iload_3
L23:    sipush 217
L26:    if_icmple L33
L29:    iload_2
L30:    iconst_2
L31:    idiv
L32:    istore_2
L33:    iload_3
L34:    sipush 243
L37:    if_icmple L44
L40:    iload_2
L41:    iconst_2
L42:    idiv
L43:    istore_2
L44:    iload_1
L45:    iconst_4
L46:    idiv
L47:    bipush 10
L49:    ishl
L50:    iload_2
L51:    bipush 32
L53:    idiv
L54:    bipush 7
L56:    ishl
L57:    iadd
L58:    iload_3
L59:    iconst_2
L60:    idiv
L61:    iadd
L62:    istore 4
L64:    iload 4
L66:    ireturn
L67:    
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_m1
L6:     putfield Field fc f I
L9:     aload_0
L10:    iconst_0
L11:    putfield Field fc g Z
L14:    aload_0
L15:    iconst_1
L16:    putfield Field fc h Z
L19:    return
L20:    
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     sipush 473
L3:     putstatic Field fc a I
L6:     sipush -546
L9:     putstatic Field fc b I
L12:    return
L13:    
    .end code
.end method
.end class
