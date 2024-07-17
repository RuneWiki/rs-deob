.version 45 3
.class public super LKGEGIEW
.super java/lang/Object
.field private a I
.field private b Z
.field public static c I
.field public static d [LLKGEGIEW;
.field public e I
.field public f [I
.field public g [I
.field private h [I
.field public i I
.field public j [I
.field public k Z
.field public l I
.field public m I
.field public n I
.field public o I
.field public p I
.field public q I
.field public r I
.field public s I
.field public static t I

.method public static a : (ILXTGLDHGX;)V
    .code stack 6 locals 6
L0:     getstatic Field LKGEGIEW t I
L3:     istore 5
        .catch java/lang/RuntimeException from L5 to L112 using L113
L5:     new MBMGIXGO
L8:     dup
L9:     aload_1
L10:    ldc "seq.dat"
L12:    aconst_null
L13:    invokevirtual Method XTGLDHGX a (Ljava/lang/String;[B)[B
L16:    sipush 891
L19:    invokespecial Method MBMGIXGO <init> ([BI)V
L22:    astore_2
L23:    aload_2
L24:    invokevirtual Method MBMGIXGO e ()I
L27:    putstatic Field LKGEGIEW c I
L30:    getstatic Field LKGEGIEW d [LLKGEGIEW;
L33:    ifnonnull L45
L36:    getstatic Field LKGEGIEW c I
L39:    anewarray LKGEGIEW
L42:    putstatic Field LKGEGIEW d [LLKGEGIEW;
L45:    iconst_0
L46:    istore_3
L47:    iload 5
L49:    ifeq L85
L52:    getstatic Field LKGEGIEW d [LLKGEGIEW;
L55:    iload_3
L56:    aaload
L57:    ifnonnull L72
L60:    getstatic Field LKGEGIEW d [LLKGEGIEW;
L63:    iload_3
L64:    new LKGEGIEW
L67:    dup
L68:    invokespecial Method LKGEGIEW <init> ()V
L71:    aastore
L72:    getstatic Field LKGEGIEW d [LLKGEGIEW;
L75:    iload_3
L76:    aaload
L77:    iconst_1
L78:    aload_2
L79:    invokevirtual Method LKGEGIEW a (ZLMBMGIXGO;)V
L82:    iinc 3 1
L85:    iload_3
L86:    getstatic Field LKGEGIEW c I
L89:    if_icmplt L52
L92:    iload_0
L93:    ifeq L162
L96:    iconst_1
L97:    istore 4
L99:    iload 5
L101:   ifeq L107
L104:   iinc 4 1
L107:   iload 4
L109:   ifgt L104
L112:   return
L113:   astore_2
L114:   new java/lang/StringBuffer
L117:   dup
L118:   ldc "95447, "
L120:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L123:   iload_0
L124:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L127:   ldc ", "
L129:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L132:   aload_1
L133:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L136:   ldc ", "
L138:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L141:   aload_2
L142:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L145:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L148:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L151:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L154:   new java/lang/RuntimeException
L157:   dup
L158:   invokespecial Method java/lang/RuntimeException <init> ()V
L161:   athrow
L162:   return
L163:   
    .end code
.end method

.method public a : (IB)I
    .code stack 5 locals 5
        .catch java/lang/RuntimeException from L0 to L75 using L75
L0:     aload_0
L1:     getfield Field LKGEGIEW h [I
L4:     iload_1
L5:     iaload
L6:     istore_3
L7:     iload_2
L8:     bipush -39
L10:    if_icmpeq L30
L13:    iconst_1
L14:    istore 4
L16:    getstatic Field LKGEGIEW t I
L19:    ifeq L25
L22:    iinc 4 1
L25:    iload 4
L27:    ifgt L22
L30:    iload_3
L31:    ifne L67
L34:    aload_0
L35:    getfield Field LKGEGIEW a I
L38:    aload_0
L39:    getfield Field LKGEGIEW f [I
L42:    iload_1
L43:    iaload
L44:    invokestatic Method SQHJOGRT a (II)LSQHJOGRT;
L47:    astore 4
L49:    aload 4
L51:    ifnull L67
L54:    aload_0
L55:    getfield Field LKGEGIEW h [I
L58:    iload_1
L59:    aload 4
L61:    getfield Field SQHJOGRT c I
L64:    dup_x2
L65:    iastore
L66:    istore_3
L67:    iload_3
L68:    ifne L73
L71:    iconst_1
L72:    istore_3
L73:    iload_3
L74:    ireturn
L75:    astore_3
L76:    new java/lang/StringBuffer
L79:    dup
L80:    ldc "1006, "
L82:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L85:    iload_1
L86:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L89:    ldc ", "
L91:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L94:    iload_2
L95:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L98:    ldc ", "
L100:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L103:   aload_3
L104:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L107:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L110:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L113:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L116:   new java/lang/RuntimeException
L119:   dup
L120:   invokespecial Method java/lang/RuntimeException <init> ()V
L123:   athrow
L124:   
    .end code
.end method

.method public a : (ZLMBMGIXGO;)V
    .code stack 5 locals 7
L0:     getstatic Field LKGEGIEW t I
L3:     istore 6
        .catch java/lang/RuntimeException from L5 to L543 using L544
L5:     iload_1
L6:     ifne L25
L9:     aload_0
L10:    aload_0
L11:    getfield Field LKGEGIEW b Z
L14:    ifeq L21
L17:    iconst_0
L18:    goto L22
L21:    iconst_1
L22:    putfield Field LKGEGIEW b Z
L25:    aload_2
L26:    invokevirtual Method MBMGIXGO c ()I
L29:    istore_3
L30:    iload_3
L31:    ifne L37
L34:    goto L433
L37:    iload_3
L38:    iconst_1
L39:    if_icmpne L158
L42:    aload_0
L43:    aload_2
L44:    invokevirtual Method MBMGIXGO c ()I
L47:    putfield Field LKGEGIEW e I
L50:    aload_0
L51:    aload_0
L52:    getfield Field LKGEGIEW e I
L55:    newarray int
L57:    putfield Field LKGEGIEW f [I
L60:    aload_0
L61:    aload_0
L62:    getfield Field LKGEGIEW e I
L65:    newarray int
L67:    putfield Field LKGEGIEW g [I
L70:    aload_0
L71:    aload_0
L72:    getfield Field LKGEGIEW e I
L75:    newarray int
L77:    putfield Field LKGEGIEW h [I
L80:    iconst_0
L81:    istore 4
L83:    iload 6
L85:    ifeq L144
L88:    aload_0
L89:    getfield Field LKGEGIEW f [I
L92:    iload 4
L94:    aload_2
L95:    invokevirtual Method MBMGIXGO e ()I
L98:    iastore
L99:    aload_0
L100:   getfield Field LKGEGIEW g [I
L103:   iload 4
L105:   aload_2
L106:   invokevirtual Method MBMGIXGO e ()I
L109:   iastore
L110:   aload_0
L111:   getfield Field LKGEGIEW g [I
L114:   iload 4
L116:   iaload
L117:   ldc 65535
L119:   if_icmpne L130
L122:   aload_0
L123:   getfield Field LKGEGIEW g [I
L126:   iload 4
L128:   iconst_m1
L129:   iastore
L130:   aload_0
L131:   getfield Field LKGEGIEW h [I
L134:   iload 4
L136:   aload_2
L137:   invokevirtual Method MBMGIXGO e ()I
L140:   iastore
L141:   iinc 4 1
L144:   iload 4
L146:   aload_0
L147:   getfield Field LKGEGIEW e I
L150:   if_icmplt L88
L153:   iload 6
L155:   ifeq L25
L158:   iload_3
L159:   iconst_2
L160:   if_icmpne L176
L163:   aload_0
L164:   aload_2
L165:   invokevirtual Method MBMGIXGO e ()I
L168:   putfield Field LKGEGIEW i I
L171:   iload 6
L173:   ifeq L25
L176:   iload_3
L177:   iconst_3
L178:   if_icmpne L240
L181:   aload_2
L182:   invokevirtual Method MBMGIXGO c ()I
L185:   istore 4
L187:   aload_0
L188:   iload 4
L190:   iconst_1
L191:   iadd
L192:   newarray int
L194:   putfield Field LKGEGIEW j [I
L197:   iconst_0
L198:   istore 5
L200:   iload 6
L202:   ifeq L219
L205:   aload_0
L206:   getfield Field LKGEGIEW j [I
L209:   iload 5
L211:   aload_2
L212:   invokevirtual Method MBMGIXGO c ()I
L215:   iastore
L216:   iinc 5 1
L219:   iload 5
L221:   iload 4
L223:   if_icmplt L205
L226:   aload_0
L227:   getfield Field LKGEGIEW j [I
L230:   iload 4
L232:   ldc 9999999
L234:   iastore
L235:   iload 6
L237:   ifeq L25
L240:   iload_3
L241:   iconst_4
L242:   if_icmpne L255
L245:   aload_0
L246:   iconst_1
L247:   putfield Field LKGEGIEW k Z
L250:   iload 6
L252:   ifeq L25
L255:   iload_3
L256:   iconst_5
L257:   if_icmpne L273
L260:   aload_0
L261:   aload_2
L262:   invokevirtual Method MBMGIXGO c ()I
L265:   putfield Field LKGEGIEW l I
L268:   iload 6
L270:   ifeq L25
L273:   iload_3
L274:   bipush 6
L276:   if_icmpne L292
L279:   aload_0
L280:   aload_2
L281:   invokevirtual Method MBMGIXGO e ()I
L284:   putfield Field LKGEGIEW m I
L287:   iload 6
L289:   ifeq L25
L292:   iload_3
L293:   bipush 7
L295:   if_icmpne L311
L298:   aload_0
L299:   aload_2
L300:   invokevirtual Method MBMGIXGO e ()I
L303:   putfield Field LKGEGIEW n I
L306:   iload 6
L308:   ifeq L25
L311:   iload_3
L312:   bipush 8
L314:   if_icmpne L330
L317:   aload_0
L318:   aload_2
L319:   invokevirtual Method MBMGIXGO c ()I
L322:   putfield Field LKGEGIEW o I
L325:   iload 6
L327:   ifeq L25
L330:   iload_3
L331:   bipush 9
L333:   if_icmpne L349
L336:   aload_0
L337:   aload_2
L338:   invokevirtual Method MBMGIXGO c ()I
L341:   putfield Field LKGEGIEW p I
L344:   iload 6
L346:   ifeq L25
L349:   iload_3
L350:   bipush 10
L352:   if_icmpne L368
L355:   aload_0
L356:   aload_2
L357:   invokevirtual Method MBMGIXGO c ()I
L360:   putfield Field LKGEGIEW q I
L363:   iload 6
L365:   ifeq L25
L368:   iload_3
L369:   bipush 11
L371:   if_icmpne L387
L374:   aload_0
L375:   aload_2
L376:   invokevirtual Method MBMGIXGO c ()I
L379:   putfield Field LKGEGIEW r I
L382:   iload 6
L384:   ifeq L25
L387:   iload_3
L388:   bipush 12
L390:   if_icmpne L406
L393:   aload_0
L394:   aload_2
L395:   invokevirtual Method MBMGIXGO h ()I
L398:   putfield Field LKGEGIEW s I
L401:   iload 6
L403:   ifeq L25
L406:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L409:   new java/lang/StringBuffer
L412:   dup
L413:   ldc "Error unrecognised seq config code: "
L415:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L418:   iload_3
L419:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L422:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L425:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L428:   iload 6
L430:   ifeq L25
L433:   aload_0
L434:   getfield Field LKGEGIEW e I
L437:   ifne L487
L440:   aload_0
L441:   iconst_1
L442:   putfield Field LKGEGIEW e I
L445:   aload_0
L446:   iconst_1
L447:   newarray int
L449:   putfield Field LKGEGIEW f [I
L452:   aload_0
L453:   getfield Field LKGEGIEW f [I
L456:   iconst_0
L457:   iconst_m1
L458:   iastore
L459:   aload_0
L460:   iconst_1
L461:   newarray int
L463:   putfield Field LKGEGIEW g [I
L466:   aload_0
L467:   getfield Field LKGEGIEW g [I
L470:   iconst_0
L471:   iconst_m1
L472:   iastore
L473:   aload_0
L474:   iconst_1
L475:   newarray int
L477:   putfield Field LKGEGIEW h [I
L480:   aload_0
L481:   getfield Field LKGEGIEW h [I
L484:   iconst_0
L485:   iconst_m1
L486:   iastore
L487:   aload_0
L488:   getfield Field LKGEGIEW p I
L491:   iconst_m1
L492:   if_icmpne L517
L495:   aload_0
L496:   getfield Field LKGEGIEW j [I
L499:   ifnull L512
L502:   aload_0
L503:   iconst_2
L504:   putfield Field LKGEGIEW p I
L507:   iload 6
L509:   ifeq L517
L512:   aload_0
L513:   iconst_0
L514:   putfield Field LKGEGIEW p I
L517:   aload_0
L518:   getfield Field LKGEGIEW q I
L521:   iconst_m1
L522:   if_icmpne L593
L525:   aload_0
L526:   getfield Field LKGEGIEW j [I
L529:   ifnull L538
L532:   aload_0
L533:   iconst_2
L534:   putfield Field LKGEGIEW q I
L537:   return
L538:   aload_0
L539:   iconst_0
L540:   putfield Field LKGEGIEW q I
L543:   return
L544:   astore_3
L545:   new java/lang/StringBuffer
L548:   dup
L549:   ldc "49098, "
L551:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L554:   iload_1
L555:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L558:   ldc ", "
L560:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L563:   aload_2
L564:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L567:   ldc ", "
L569:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L572:   aload_3
L573:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L576:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L579:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L582:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L585:   new java/lang/RuntimeException
L588:   dup
L589:   invokespecial Method java/lang/RuntimeException <init> ()V
L592:   athrow
L593:   return
L594:   
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     bipush 9
L7:     putfield Field LKGEGIEW a I
L10:    aload_0
L11:    iconst_0
L12:    putfield Field LKGEGIEW b Z
L15:    aload_0
L16:    iconst_m1
L17:    putfield Field LKGEGIEW i I
L20:    aload_0
L21:    iconst_0
L22:    putfield Field LKGEGIEW k Z
L25:    aload_0
L26:    iconst_5
L27:    putfield Field LKGEGIEW l I
L30:    aload_0
L31:    iconst_m1
L32:    putfield Field LKGEGIEW m I
L35:    aload_0
L36:    iconst_m1
L37:    putfield Field LKGEGIEW n I
L40:    aload_0
L41:    bipush 99
L43:    putfield Field LKGEGIEW o I
L46:    aload_0
L47:    iconst_m1
L48:    putfield Field LKGEGIEW p I
L51:    aload_0
L52:    iconst_m1
L53:    putfield Field LKGEGIEW q I
L56:    aload_0
L57:    iconst_2
L58:    putfield Field LKGEGIEW r I
L61:    return
L62:    
    .end code
.end method
.end class
