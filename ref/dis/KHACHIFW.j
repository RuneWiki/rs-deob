.version 45 3
.class public super KHACHIFW
.super java/applet/Applet
.implements java/lang/Runnable
.implements java/awt/event/MouseListener
.implements java/awt/event/MouseMotionListener
.implements java/awt/event/KeyListener
.implements java/awt/event/FocusListener
.implements java/awt/event/WindowListener
.field private a Z
.field private b I
.field private c I
.field private d I
.field private e I
.field public f I
.field private g [J
.field public h I
.field public i Z
.field public j I
.field public k I
.field public l Ljava/awt/Graphics;
.field public m LIVIFZQBK;
.field public n [LCXGZMTJK;
.field public o LFPVKJCAH;
.field public p Z
.field public q Z
.field public r I
.field public s I
.field public t I
.field public u I
.field public v I
.field public w I
.field public x I
.field public y J
.field public z I
.field public A I
.field public B I
.field public C J
.field public D [I
.field private E [I
.field private F I
.field private G I
.field public static H I

.method public final a : (IZI)V
    .code stack 7 locals 5
        .catch java/lang/RuntimeException from L0 to L79 using L80
L0:     aload_0
L1:     iload_3
L2:     putfield Field KHACHIFW j I
L5:     aload_0
L6:     iload_1
L7:     putfield Field KHACHIFW k I
L10:    iload_2
L11:    ifeq L15
L14:    return
L15:    aload_0
L16:    new FPVKJCAH
L19:    dup
L20:    aload_0
L21:    aload_0
L22:    getfield Field KHACHIFW j I
L25:    iconst_5
L26:    aload_0
L27:    getfield Field KHACHIFW k I
L30:    invokespecial Method FPVKJCAH <init> (LKHACHIFW;IBI)V
L33:    putfield Field KHACHIFW o LFPVKJCAH;
L36:    aload_0
L37:    aload_0
L38:    iconst_0
L39:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L42:    invokevirtual Method java/awt/Component getGraphics ()Ljava/awt/Graphics;
L45:    putfield Field KHACHIFW l Ljava/awt/Graphics;
L48:    aload_0
L49:    new IVIFZQBK
L52:    dup
L53:    aload_0
L54:    getfield Field KHACHIFW j I
L57:    aload_0
L58:    getfield Field KHACHIFW k I
L61:    aload_0
L62:    iconst_0
L63:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L66:    iconst_0
L67:    invokespecial Method IVIFZQBK <init> (IILjava/awt/Component;I)V
L70:    putfield Field KHACHIFW m LIVIFZQBK;
L73:    aload_0
L74:    aload_0
L75:    iconst_1
L76:    invokevirtual Method KHACHIFW a (Ljava/lang/Runnable;I)V
L79:    return
L80:    astore 4
L82:    new java/lang/StringBuffer
L85:    dup
L86:    ldc "61841, "
L88:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L91:    iload_1
L92:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L95:    ldc ", "
L97:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L100:   iload_2
L101:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L104:   ldc ", "
L106:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L109:   iload_3
L110:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L113:   ldc ", "
L115:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L118:   aload 4
L120:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L123:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L126:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L129:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L132:   new java/lang/RuntimeException
L135:   dup
L136:   invokespecial Method java/lang/RuntimeException <init> ()V
L139:   athrow
L140:   
    .end code
.end method

.method public final b : (IZI)V
    .code stack 7 locals 5
        .catch java/lang/RuntimeException from L0 to L58 using L58
L0:     aload_0
L1:     iload_3
L2:     putfield Field KHACHIFW j I
L5:     aload_0
L6:     iload_1
L7:     putfield Field KHACHIFW k I
L10:    aload_0
L11:    aload_0
L12:    iconst_0
L13:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L16:    invokevirtual Method java/awt/Component getGraphics ()Ljava/awt/Graphics;
L19:    putfield Field KHACHIFW l Ljava/awt/Graphics;
L22:    aload_0
L23:    new IVIFZQBK
L26:    dup
L27:    aload_0
L28:    getfield Field KHACHIFW j I
L31:    aload_0
L32:    getfield Field KHACHIFW k I
L35:    aload_0
L36:    iconst_0
L37:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L40:    iconst_0
L41:    invokespecial Method IVIFZQBK <init> (IILjava/awt/Component;I)V
L44:    putfield Field KHACHIFW m LIVIFZQBK;
L47:    aload_0
L48:    aload_0
L49:    iconst_1
L50:    invokevirtual Method KHACHIFW a (Ljava/lang/Runnable;I)V
L53:    iload_2
L54:    ifeq L118
L57:    return
L58:    astore 4
L60:    new java/lang/StringBuffer
L63:    dup
L64:    ldc "44058, "
L66:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L69:    iload_1
L70:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L73:    ldc ", "
L75:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L78:    iload_2
L79:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L82:    ldc ", "
L84:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L87:    iload_3
L88:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L91:    ldc ", "
L93:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L96:    aload 4
L98:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L101:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L104:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L107:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L110:   new java/lang/RuntimeException
L113:   dup
L114:   invokespecial Method java/lang/RuntimeException <init> ()V
L117:   athrow
L118:   return
L119:   
    .end code
.end method

.method public run : ()V
    .code stack 7 locals 14
L0:     getstatic Field KHACHIFW H I
L3:     istore 13
L5:     aload_0
L6:     iconst_0
L7:     invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L10:    aload_0
L11:    invokevirtual Method java/awt/Component addMouseListener (Ljava/awt/event/MouseListener;)V
L14:    aload_0
L15:    iconst_0
L16:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L19:    aload_0
L20:    invokevirtual Method java/awt/Component addMouseMotionListener (Ljava/awt/event/MouseMotionListener;)V
L23:    aload_0
L24:    iconst_0
L25:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L28:    aload_0
L29:    invokevirtual Method java/awt/Component addKeyListener (Ljava/awt/event/KeyListener;)V
L32:    aload_0
L33:    iconst_0
L34:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L37:    aload_0
L38:    invokevirtual Method java/awt/Component addFocusListener (Ljava/awt/event/FocusListener;)V
L41:    aload_0
L42:    getfield Field KHACHIFW o LFPVKJCAH;
L45:    ifnull L56
L48:    aload_0
L49:    getfield Field KHACHIFW o LFPVKJCAH;
L52:    aload_0
L53:    invokevirtual Method java/awt/Window addWindowListener (Ljava/awt/event/WindowListener;)V
L56:    aload_0
L57:    iconst_0
L58:    iconst_4
L59:    ldc "Loading..."
L61:    invokevirtual Method KHACHIFW a (IBLjava/lang/String;)V
L64:    aload_0
L65:    invokevirtual Method KHACHIFW a ()V
L68:    iconst_0
L69:    istore_3
L70:    sipush 256
L73:    istore 4
L75:    iconst_1
L76:    istore 5
L78:    iconst_0
L79:    istore 6
L81:    iconst_0
L82:    istore 7
L84:    iconst_0
L85:    istore 8
L87:    iload 13
L89:    ifeq L105
L92:    aload_0
L93:    getfield Field KHACHIFW g [J
L96:    iload 8
L98:    invokestatic Method java/lang/System currentTimeMillis ()J
L101:   lastore
L102:   iinc 8 1
L105:   iload 8
L107:   bipush 10
L109:   if_icmplt L92
L112:   invokestatic Method java/lang/System currentTimeMillis ()J
L115:   lstore_1
L116:   iload 13
L118:   ifeq L722
L121:   aload_0
L122:   getfield Field KHACHIFW d I
L125:   ifle L153
L128:   aload_0
L129:   dup
L130:   getfield Field KHACHIFW d I
L133:   iconst_1
L134:   isub
L135:   putfield Field KHACHIFW d I
L138:   aload_0
L139:   getfield Field KHACHIFW d I
L142:   ifne L153
L145:   aload_0
L146:   sipush 4747
L149:   invokevirtual Method KHACHIFW a (I)V
L152:   return
L153:   iload 4
L155:   istore 9
L157:   iload 5
L159:   istore 10
L161:   sipush 300
L164:   istore 4
L166:   iconst_1
L167:   istore 5
L169:   invokestatic Method java/lang/System currentTimeMillis ()J
L172:   lstore_1
L173:   aload_0
L174:   getfield Field KHACHIFW g [J
L177:   iload_3
L178:   laload
L179:   lconst_0
L180:   lcmp
L181:   ifne L197
L184:   iload 9
L186:   istore 4
L188:   iload 10
L190:   istore 5
L192:   iload 13
L194:   ifeq L229
L197:   lload_1
L198:   aload_0
L199:   getfield Field KHACHIFW g [J
L202:   iload_3
L203:   laload
L204:   lcmp
L205:   ifle L229
L208:   sipush 2560
L211:   aload_0
L212:   getfield Field KHACHIFW e I
L215:   imul
L216:   i2l
L217:   lload_1
L218:   aload_0
L219:   getfield Field KHACHIFW g [J
L222:   iload_3
L223:   laload
L224:   lsub
L225:   ldiv
L226:   l2i
L227:   istore 4
L229:   iload 4
L231:   bipush 25
L233:   if_icmpge L240
L236:   bipush 25
L238:   istore 4
L240:   iload 4
L242:   sipush 256
L245:   if_icmple L274
L248:   sipush 256
L251:   istore 4
L253:   aload_0
L254:   getfield Field KHACHIFW e I
L257:   i2l
L258:   lload_1
L259:   aload_0
L260:   getfield Field KHACHIFW g [J
L263:   iload_3
L264:   laload
L265:   lsub
L266:   ldc2_w 10L
L269:   ldiv
L270:   lsub
L271:   l2i
L272:   istore 5
L274:   iload 5
L276:   aload_0
L277:   getfield Field KHACHIFW e I
L280:   if_icmple L289
L283:   aload_0
L284:   getfield Field KHACHIFW e I
L287:   istore 5
L289:   aload_0
L290:   getfield Field KHACHIFW g [J
L293:   iload_3
L294:   lload_1
L295:   lastore
L296:   iload_3
L297:   iconst_1
L298:   iadd
L299:   bipush 10
L301:   irem
L302:   istore_3
L303:   iload 5
L305:   iconst_1
L306:   if_icmple L352
L309:   iconst_0
L310:   istore 11
L312:   iload 13
L314:   ifeq L345
L317:   aload_0
L318:   getfield Field KHACHIFW g [J
L321:   iload 11
L323:   laload
L324:   lconst_0
L325:   lcmp
L326:   ifeq L342
L329:   aload_0
L330:   getfield Field KHACHIFW g [J
L333:   iload 11
L335:   dup2
L336:   laload
L337:   iload 5
L339:   i2l
L340:   ladd
L341:   lastore
L342:   iinc 11 1
L345:   iload 11
L347:   bipush 10
L349:   if_icmplt L317
L352:   iload 5
L354:   aload_0
L355:   getfield Field KHACHIFW f I
L358:   if_icmpge L367
L361:   aload_0
L362:   getfield Field KHACHIFW f I
L365:   istore 5
        .catch java/lang/InterruptedException from L367 to L373 using L376
L367:   iload 5
L369:   i2l
L370:   invokestatic Method java/lang/Thread sleep (J)V
L373:   goto L444
L376:   pop
L377:   iinc 7 1
L380:   iload 13
L382:   ifeq L444
L385:   aload_0
L386:   aload_0
L387:   getfield Field KHACHIFW v I
L390:   putfield Field KHACHIFW z I
L393:   aload_0
L394:   aload_0
L395:   getfield Field KHACHIFW w I
L398:   putfield Field KHACHIFW A I
L401:   aload_0
L402:   aload_0
L403:   getfield Field KHACHIFW x I
L406:   putfield Field KHACHIFW B I
L409:   aload_0
L410:   aload_0
L411:   getfield Field KHACHIFW y J
L414:   putfield Field KHACHIFW C J
L417:   aload_0
L418:   iconst_0
L419:   putfield Field KHACHIFW v I
L422:   aload_0
L423:   sipush 24869
L426:   invokevirtual Method KHACHIFW c (I)V
L429:   aload_0
L430:   aload_0
L431:   getfield Field KHACHIFW G I
L434:   putfield Field KHACHIFW F I
L437:   iload 6
L439:   iload 4
L441:   iadd
L442:   istore 6
L444:   iload 6
L446:   sipush 256
L449:   if_icmplt L385
L452:   iload 6
L454:   sipush 255
L457:   iand
L458:   istore 6
L460:   aload_0
L461:   getfield Field KHACHIFW e I
L464:   ifle L486
L467:   aload_0
L468:   sipush 1000
L471:   iload 4
L473:   imul
L474:   aload_0
L475:   getfield Field KHACHIFW e I
L478:   sipush 256
L481:   imul
L482:   idiv
L483:   putfield Field KHACHIFW h I
L486:   aload_0
L487:   iconst_0
L488:   invokevirtual Method KHACHIFW e (I)V
L491:   aload_0
L492:   getfield Field KHACHIFW i Z
L495:   ifeq L722
L498:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L501:   new java/lang/StringBuffer
L504:   dup
L505:   ldc "ntime:"
L507:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L510:   lload_1
L511:   invokevirtual Method java/lang/StringBuffer append (J)Ljava/lang/StringBuffer;
L514:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L517:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L520:   iconst_0
L521:   istore 11
L523:   iload 13
L525:   ifeq L583
L528:   iload_3
L529:   iload 11
L531:   isub
L532:   iconst_1
L533:   isub
L534:   bipush 20
L536:   iadd
L537:   bipush 10
L539:   irem
L540:   istore 12
L542:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L545:   new java/lang/StringBuffer
L548:   dup
L549:   ldc "otim"
L551:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L554:   iload 12
L556:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L559:   ldc ":"
L561:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L564:   aload_0
L565:   getfield Field KHACHIFW g [J
L568:   iload 12
L570:   laload
L571:   invokevirtual Method java/lang/StringBuffer append (J)Ljava/lang/StringBuffer;
L574:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L577:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L580:   iinc 11 1
L583:   iload 11
L585:   bipush 10
L587:   if_icmplt L528
L590:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L593:   new java/lang/StringBuffer
L596:   dup
L597:   ldc "fps:"
L599:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L602:   aload_0
L603:   getfield Field KHACHIFW h I
L606:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L609:   ldc " ratio:"
L611:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L614:   iload 4
L616:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L619:   ldc " count:"
L621:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L624:   iload 6
L626:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L629:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L632:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L635:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L638:   new java/lang/StringBuffer
L641:   dup
L642:   ldc "del:"
L644:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L647:   iload 5
L649:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L652:   ldc " deltime:"
L654:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L657:   aload_0
L658:   getfield Field KHACHIFW e I
L661:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L664:   ldc " mindel:"
L666:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L669:   aload_0
L670:   getfield Field KHACHIFW f I
L673:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L676:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L679:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L682:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L685:   new java/lang/StringBuffer
L688:   dup
L689:   ldc "intex:"
L691:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L694:   iload 7
L696:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L699:   ldc " opos:"
L701:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L704:   iload_3
L705:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L708:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L711:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L714:   aload_0
L715:   iconst_0
L716:   putfield Field KHACHIFW i Z
L719:   iconst_0
L720:   istore 7
L722:   aload_0
L723:   getfield Field KHACHIFW d I
L726:   ifge L121
L729:   aload_0
L730:   getfield Field KHACHIFW d I
L733:   iconst_m1
L734:   if_icmpne L744
L737:   aload_0
L738:   sipush 4747
L741:   invokevirtual Method KHACHIFW a (I)V
L744:   return
L745:   
    .end code
.end method

.method public final a : (I)V
    .code stack 3 locals 3
L0:     aload_0
L1:     bipush -2
L3:     putfield Field KHACHIFW d I
L6:     aload_0
L7:     sipush 493
L10:    invokevirtual Method KHACHIFW d (I)V
L13:    iload_1
L14:    sipush 4747
L17:    if_icmpeq L21
L20:    return
L21:    aload_0
L22:    getfield Field KHACHIFW o LFPVKJCAH;
L25:    ifnull L85
        .catch java/lang/Exception from L28 to L34 using L37
L28:    ldc2_w 1000L
L31:    invokestatic Method java/lang/Thread sleep (J)V
L34:    goto L38
L37:    pop
        .catch java/lang/Throwable from L38 to L42 using L43
        .catch java/lang/RuntimeException from L0 to L45 using L45
L38:    iconst_0
L39:    invokestatic Method java/lang/System exit (I)V
L42:    return
L43:    pop
L44:    return
L45:    astore_2
L46:    new java/lang/StringBuffer
L49:    dup
L50:    ldc "13735, "
L52:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L55:    iload_1
L56:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L59:    ldc ", "
L61:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L64:    aload_2
L65:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L68:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L71:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L74:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L77:    new java/lang/RuntimeException
L80:    dup
L81:    invokespecial Method java/lang/RuntimeException <init> ()V
L84:    athrow
L85:    return
L86:    
    .end code
.end method

.method public final a : (ZI)V
    .code stack 3 locals 4
        .catch java/lang/RuntimeException from L0 to L14 using L15
L0:     iload_1
L1:     ifeq L5
L4:     return
L5:     aload_0
L6:     sipush 1000
L9:     iload_2
L10:    idiv
L11:    putfield Field KHACHIFW e I
L14:    return
L15:    astore_3
L16:    new java/lang/StringBuffer
L19:    dup
L20:    ldc "88292, "
L22:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L25:    iload_1
L26:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L29:    ldc ", "
L31:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L34:    iload_2
L35:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L38:    ldc ", "
L40:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L43:    aload_3
L44:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L47:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L50:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L53:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L56:    new java/lang/RuntimeException
L59:    dup
L60:    invokespecial Method java/lang/RuntimeException <init> ()V
L63:    athrow
L64:    
    .end code
.end method

.method public final start : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     getfield Field KHACHIFW d I
L4:     iflt L12
L7:     aload_0
L8:     iconst_0
L9:     putfield Field KHACHIFW d I
L12:    return
L13:    
    .end code
.end method

.method public final stop : ()V
    .code stack 3 locals 1
L0:     aload_0
L1:     getfield Field KHACHIFW d I
L4:     iflt L19
L7:     aload_0
L8:     sipush 4000
L11:    aload_0
L12:    getfield Field KHACHIFW e I
L15:    idiv
L16:    putfield Field KHACHIFW d I
L19:    return
L20:    
    .end code
.end method

.method public final destroy : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     iconst_m1
L2:     putfield Field KHACHIFW d I
        .catch java/lang/Exception from L5 to L11 using L14
L5:     ldc2_w 5000L
L8:     invokestatic Method java/lang/Thread sleep (J)V
L11:    goto L15
L14:    pop
L15:    aload_0
L16:    getfield Field KHACHIFW d I
L19:    iconst_m1
L20:    if_icmpne L30
L23:    aload_0
L24:    sipush 4747
L27:    invokevirtual Method KHACHIFW a (I)V
L30:    return
L31:    
    .end code
.end method

.method public final update : (Ljava/awt/Graphics;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field KHACHIFW l Ljava/awt/Graphics;
L4:     ifnonnull L12
L7:     aload_0
L8:     aload_1
L9:     putfield Field KHACHIFW l Ljava/awt/Graphics;
L12:    aload_0
L13:    iconst_1
L14:    putfield Field KHACHIFW p Z
L17:    aload_0
L18:    iconst_1
L19:    invokevirtual Method KHACHIFW a (B)V
L22:    return
L23:    
    .end code
.end method

.method public final paint : (Ljava/awt/Graphics;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field KHACHIFW l Ljava/awt/Graphics;
L4:     ifnonnull L12
L7:     aload_0
L8:     aload_1
L9:     putfield Field KHACHIFW l Ljava/awt/Graphics;
L12:    aload_0
L13:    iconst_1
L14:    putfield Field KHACHIFW p Z
L17:    aload_0
L18:    iconst_1
L19:    invokevirtual Method KHACHIFW a (B)V
L22:    return
L23:    
    .end code
.end method

.method public final mousePressed : (Ljava/awt/event/MouseEvent;)V
    .code stack 3 locals 4
L0:     aload_1
L1:     invokevirtual Method java/awt/event/MouseEvent getX ()I
L4:     istore_2
L5:     aload_1
L6:     invokevirtual Method java/awt/event/MouseEvent getY ()I
L9:     istore_3
L10:    aload_0
L11:    getfield Field KHACHIFW o LFPVKJCAH;
L14:    ifnull L23
L17:    iinc 2 -4
L20:    iinc 3 -22
L23:    aload_0
L24:    iconst_0
L25:    putfield Field KHACHIFW r I
L28:    aload_0
L29:    iload_2
L30:    putfield Field KHACHIFW w I
L33:    aload_0
L34:    iload_3
L35:    putfield Field KHACHIFW x I
L38:    aload_0
L39:    invokestatic Method java/lang/System currentTimeMillis ()J
L42:    putfield Field KHACHIFW y J
L45:    aload_1
L46:    invokevirtual Method java/awt/event/InputEvent isMetaDown ()Z
L49:    ifeq L63
L52:    aload_0
L53:    iconst_2
L54:    putfield Field KHACHIFW v I
L57:    aload_0
L58:    iconst_2
L59:    putfield Field KHACHIFW s I
L62:    return
L63:    aload_0
L64:    iconst_1
L65:    putfield Field KHACHIFW v I
L68:    aload_0
L69:    iconst_1
L70:    putfield Field KHACHIFW s I
L73:    return
L74:    
    .end code
.end method

.method public final mouseReleased : (Ljava/awt/event/MouseEvent;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     iconst_0
L2:     putfield Field KHACHIFW r I
L5:     aload_0
L6:     iconst_0
L7:     putfield Field KHACHIFW s I
L10:    return
L11:    
    .end code
.end method

.method public final mouseClicked : (Ljava/awt/event/MouseEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final mouseEntered : (Ljava/awt/event/MouseEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final mouseExited : (Ljava/awt/event/MouseEvent;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     iconst_0
L2:     putfield Field KHACHIFW r I
L5:     aload_0
L6:     iconst_m1
L7:     putfield Field KHACHIFW t I
L10:    aload_0
L11:    iconst_m1
L12:    putfield Field KHACHIFW u I
L15:    return
L16:    
    .end code
.end method

.method public final mouseDragged : (Ljava/awt/event/MouseEvent;)V
    .code stack 2 locals 4
L0:     aload_1
L1:     invokevirtual Method java/awt/event/MouseEvent getX ()I
L4:     istore_2
L5:     aload_1
L6:     invokevirtual Method java/awt/event/MouseEvent getY ()I
L9:     istore_3
L10:    aload_0
L11:    getfield Field KHACHIFW o LFPVKJCAH;
L14:    ifnull L23
L17:    iinc 2 -4
L20:    iinc 3 -22
L23:    aload_0
L24:    iconst_0
L25:    putfield Field KHACHIFW r I
L28:    aload_0
L29:    iload_2
L30:    putfield Field KHACHIFW t I
L33:    aload_0
L34:    iload_3
L35:    putfield Field KHACHIFW u I
L38:    return
L39:    
    .end code
.end method

.method public final mouseMoved : (Ljava/awt/event/MouseEvent;)V
    .code stack 2 locals 4
L0:     aload_1
L1:     invokevirtual Method java/awt/event/MouseEvent getX ()I
L4:     istore_2
L5:     aload_1
L6:     invokevirtual Method java/awt/event/MouseEvent getY ()I
L9:     istore_3
L10:    aload_0
L11:    getfield Field KHACHIFW o LFPVKJCAH;
L14:    ifnull L23
L17:    iinc 2 -4
L20:    iinc 3 -22
L23:    aload_0
L24:    iconst_0
L25:    putfield Field KHACHIFW r I
L28:    aload_0
L29:    iload_2
L30:    putfield Field KHACHIFW t I
L33:    aload_0
L34:    iload_3
L35:    putfield Field KHACHIFW u I
L38:    return
L39:    
    .end code
.end method

.method public final keyPressed : (Ljava/awt/event/KeyEvent;)V
    .code stack 4 locals 5
L0:     getstatic Field KHACHIFW H I
L3:     istore 4
L5:     aload_0
L6:     iconst_0
L7:     putfield Field KHACHIFW r I
L10:    aload_1
L11:    invokevirtual Method java/awt/event/KeyEvent getKeyCode ()I
L14:    istore_2
L15:    aload_1
L16:    invokevirtual Method java/awt/event/KeyEvent getKeyChar ()C
L19:    istore_3
L20:    iload_3
L21:    bipush 30
L23:    if_icmpge L28
L26:    iconst_0
L27:    istore_3
L28:    iload_2
L29:    bipush 37
L31:    if_icmpne L36
L34:    iconst_1
L35:    istore_3
L36:    iload_2
L37:    bipush 39
L39:    if_icmpne L44
L42:    iconst_2
L43:    istore_3
L44:    iload_2
L45:    bipush 38
L47:    if_icmpne L52
L50:    iconst_3
L51:    istore_3
L52:    iload_2
L53:    bipush 40
L55:    if_icmpne L60
L58:    iconst_4
L59:    istore_3
L60:    iload_2
L61:    bipush 17
L63:    if_icmpne L68
L66:    iconst_5
L67:    istore_3
L68:    iload_2
L69:    bipush 8
L71:    if_icmpne L77
L74:    bipush 8
L76:    istore_3
L77:    iload_2
L78:    bipush 127
L80:    if_icmpne L86
L83:    bipush 8
L85:    istore_3
L86:    iload_2
L87:    bipush 9
L89:    if_icmpne L95
L92:    bipush 9
L94:    istore_3
L95:    iload_2
L96:    bipush 10
L98:    if_icmpne L104
L101:   bipush 10
L103:   istore_3
L104:   iload_2
L105:   bipush 112
L107:   if_icmplt L125
L110:   iload_2
L111:   bipush 123
L113:   if_icmpgt L125
L116:   sipush 1008
L119:   iload_2
L120:   iadd
L121:   bipush 112
L123:   isub
L124:   istore_3
L125:   iload_2
L126:   bipush 36
L128:   if_icmpne L135
L131:   sipush 1000
L134:   istore_3
L135:   iload_2
L136:   bipush 35
L138:   if_icmpne L145
L141:   sipush 1001
L144:   istore_3
L145:   iload_2
L146:   bipush 33
L148:   if_icmpne L155
L151:   sipush 1002
L154:   istore_3
L155:   iload_2
L156:   bipush 34
L158:   if_icmpne L165
L161:   sipush 1003
L164:   istore_3
L165:   iload_3
L166:   ifle L183
L169:   iload_3
L170:   sipush 128
L173:   if_icmpge L183
L176:   aload_0
L177:   getfield Field KHACHIFW D [I
L180:   iload_3
L181:   iconst_1
L182:   iastore
L183:   iload_3
L184:   iconst_4
L185:   if_icmple L211
L188:   aload_0
L189:   getfield Field KHACHIFW E [I
L192:   aload_0
L193:   getfield Field KHACHIFW G I
L196:   iload_3
L197:   iastore
L198:   aload_0
L199:   aload_0
L200:   getfield Field KHACHIFW G I
L203:   iconst_1
L204:   iadd
L205:   bipush 127
L207:   iand
L208:   putfield Field KHACHIFW G I
L211:   getstatic Field PKVMXVTO e Z
L214:   ifeq L225
L217:   iinc 4 1
L220:   iload 4
L222:   putstatic Field KHACHIFW H I
L225:   return
L226:   
    .end code
.end method

.method public final keyReleased : (Ljava/awt/event/KeyEvent;)V
    .code stack 3 locals 4
L0:     aload_0
L1:     iconst_0
L2:     putfield Field KHACHIFW r I
L5:     aload_1
L6:     invokevirtual Method java/awt/event/KeyEvent getKeyCode ()I
L9:     istore_2
L10:    aload_1
L11:    invokevirtual Method java/awt/event/KeyEvent getKeyChar ()C
L14:    istore_3
L15:    iload_3
L16:    bipush 30
L18:    if_icmpge L23
L21:    iconst_0
L22:    istore_3
L23:    iload_2
L24:    bipush 37
L26:    if_icmpne L31
L29:    iconst_1
L30:    istore_3
L31:    iload_2
L32:    bipush 39
L34:    if_icmpne L39
L37:    iconst_2
L38:    istore_3
L39:    iload_2
L40:    bipush 38
L42:    if_icmpne L47
L45:    iconst_3
L46:    istore_3
L47:    iload_2
L48:    bipush 40
L50:    if_icmpne L55
L53:    iconst_4
L54:    istore_3
L55:    iload_2
L56:    bipush 17
L58:    if_icmpne L63
L61:    iconst_5
L62:    istore_3
L63:    iload_2
L64:    bipush 8
L66:    if_icmpne L72
L69:    bipush 8
L71:    istore_3
L72:    iload_2
L73:    bipush 127
L75:    if_icmpne L81
L78:    bipush 8
L80:    istore_3
L81:    iload_2
L82:    bipush 9
L84:    if_icmpne L90
L87:    bipush 9
L89:    istore_3
L90:    iload_2
L91:    bipush 10
L93:    if_icmpne L99
L96:    bipush 10
L98:    istore_3
L99:    iload_3
L100:   ifle L117
L103:   iload_3
L104:   sipush 128
L107:   if_icmpge L117
L110:   aload_0
L111:   getfield Field KHACHIFW D [I
L114:   iload_3
L115:   iconst_0
L116:   iastore
L117:   return
L118:   
    .end code
.end method

.method public final keyTyped : (Ljava/awt/event/KeyEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final b : (I)I
    .code stack 4 locals 4
L0:     getstatic Field KHACHIFW H I
L3:     istore_3
        .catch java/lang/RuntimeException from L4 to L63 using L63
L4:     iload_3
L5:     ifeq L21
L8:     iconst_1
L9:     istore_2
L10:    iload_3
L11:    ifeq L17
L14:    iinc 2 1
L17:    iload_2
L18:    ifgt L14
L21:    iload_1
L22:    ifge L8
L25:    iconst_m1
L26:    istore_2
L27:    aload_0
L28:    getfield Field KHACHIFW G I
L31:    aload_0
L32:    getfield Field KHACHIFW F I
L35:    if_icmpeq L61
L38:    aload_0
L39:    getfield Field KHACHIFW E [I
L42:    aload_0
L43:    getfield Field KHACHIFW F I
L46:    iaload
L47:    istore_2
L48:    aload_0
L49:    aload_0
L50:    getfield Field KHACHIFW F I
L53:    iconst_1
L54:    iadd
L55:    bipush 127
L57:    iand
L58:    putfield Field KHACHIFW F I
L61:    iload_2
L62:    ireturn
L63:    astore_2
L64:    new java/lang/StringBuffer
L67:    dup
L68:    ldc "66235, "
L70:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L73:    iload_1
L74:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L77:    ldc ", "
L79:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L82:    aload_2
L83:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L86:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L89:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L92:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L95:    new java/lang/RuntimeException
L98:    dup
L99:    invokespecial Method java/lang/RuntimeException <init> ()V
L102:   athrow
L103:   
    .end code
.end method

.method public final focusGained : (Ljava/awt/event/FocusEvent;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     iconst_1
L2:     putfield Field KHACHIFW q Z
L5:     aload_0
L6:     iconst_1
L7:     putfield Field KHACHIFW p Z
L10:    aload_0
L11:    iconst_1
L12:    invokevirtual Method KHACHIFW a (B)V
L15:    return
L16:    
    .end code
.end method

.method public final focusLost : (Ljava/awt/event/FocusEvent;)V
    .code stack 4 locals 3
L0:     aload_0
L1:     iconst_0
L2:     putfield Field KHACHIFW q Z
L5:     iconst_0
L6:     istore_2
L7:     getstatic Field KHACHIFW H I
L10:    ifeq L23
L13:    aload_0
L14:    getfield Field KHACHIFW D [I
L17:    iload_2
L18:    iconst_0
L19:    iastore
L20:    iinc 2 1
L23:    iload_2
L24:    sipush 128
L27:    if_icmplt L13
L30:    return
L31:    
    .end code
.end method

.method public final windowActivated : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowClosed : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowClosing : (Ljava/awt/event/WindowEvent;)V
    .code stack 1 locals 2
L0:     aload_0
L1:     invokevirtual Method KHACHIFW destroy ()V
L4:     return
L5:     
    .end code
.end method

.method public final windowDeactivated : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowDeiconified : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowIconified : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowOpened : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public a : ()V
    .code stack 0 locals 1
L0:     return
L1:     
    .end code
.end method

.method public c : (I)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L9 using L9
L0:     iload_1
L1:     aload_0
L2:     getfield Field KHACHIFW b I
L5:     if_icmpeq L49
L8:     return
L9:     astore_2
L10:    new java/lang/StringBuffer
L13:    dup
L14:    ldc "38427, "
L16:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L19:    iload_1
L20:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L23:    ldc ", "
L25:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L28:    aload_2
L29:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L32:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L35:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L38:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L41:    new java/lang/RuntimeException
L44:    dup
L45:    invokespecial Method java/lang/RuntimeException <init> ()V
L48:    athrow
L49:    return
L50:    
    .end code
.end method

.method public d : (I)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L5 using L6
L0:     bipush 91
L2:     iload_1
L3:     idiv
L4:     istore_1
L5:     return
L6:     astore_2
L7:     new java/lang/StringBuffer
L10:    dup
L11:    ldc "49106, "
L13:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L16:    iload_1
L17:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L20:    ldc ", "
L22:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L25:    aload_2
L26:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L29:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L32:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L35:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L38:    new java/lang/RuntimeException
L41:    dup
L42:    invokespecial Method java/lang/RuntimeException <init> ()V
L45:    athrow
L46:    
    .end code
.end method

.method public e : (I)V
    .code stack 4 locals 3
        .catch java/lang/RuntimeException from L0 to L19 using L20
L0:     iload_1
L1:     ifeq L60
L4:     iconst_1
L5:     istore_2
L6:     getstatic Field KHACHIFW H I
L9:     ifeq L15
L12:    iinc 2 1
L15:    iload_2
L16:    ifgt L12
L19:    return
L20:    astore_2
L21:    new java/lang/StringBuffer
L24:    dup
L25:    ldc "62415, "
L27:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L30:    iload_1
L31:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L34:    ldc ", "
L36:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L39:    aload_2
L40:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L43:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L46:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L49:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L52:    new java/lang/RuntimeException
L55:    dup
L56:    invokespecial Method java/lang/RuntimeException <init> ()V
L59:    athrow
L60:    return
L61:    
    .end code
.end method

.method public a : (B)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L9 using L9
L0:     iload_1
L1:     iconst_1
L2:     if_icmpne L8
L5:     iconst_0
L6:     istore_1
L7:     return
L8:     return
L9:     astore_2
L10:    new java/lang/StringBuffer
L13:    dup
L14:    ldc "6639, "
L16:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L19:    iload_1
L20:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L23:    ldc ", "
L25:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L28:    aload_2
L29:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L32:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L35:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L38:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L41:    new java/lang/RuntimeException
L44:    dup
L45:    invokespecial Method java/lang/RuntimeException <init> ()V
L48:    athrow
L49:    
    .end code
.end method

.method public f : (I)Ljava/awt/Component;
    .code stack 4 locals 3
        .catch java/lang/RuntimeException from L0 to L33 using L33
L0:     iload_1
L1:     ifeq L19
L4:     iconst_1
L5:     istore_2
L6:     getstatic Field KHACHIFW H I
L9:     ifeq L15
L12:    iinc 2 1
L15:    iload_2
L16:    ifgt L12
L19:    aload_0
L20:    getfield Field KHACHIFW o LFPVKJCAH;
L23:    ifnull L31
L26:    aload_0
L27:    getfield Field KHACHIFW o LFPVKJCAH;
L30:    areturn
L31:    aload_0
L32:    areturn
L33:    astore_2
L34:    new java/lang/StringBuffer
L37:    dup
L38:    ldc "82353, "
L40:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L43:    iload_1
L44:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L47:    ldc ", "
L49:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L52:    aload_2
L53:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L56:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L59:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L62:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L65:    new java/lang/RuntimeException
L68:    dup
L69:    invokespecial Method java/lang/RuntimeException <init> ()V
L72:    athrow
L73:    
    .end code
.end method

.method public a : (Ljava/lang/Runnable;I)V
    .code stack 3 locals 4
L0:     new java/lang/Thread
L3:     dup
L4:     aload_1
L5:     invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L8:     astore_3
L9:     aload_3
L10:    invokevirtual Method java/lang/Thread start ()V
L13:    aload_3
L14:    iload_2
L15:    invokevirtual Method java/lang/Thread setPriority (I)V
L18:    return
L19:    
    .end code
.end method

.method public a : (IBLjava/lang/String;)V
    .code stack 7 locals 10
L0:     getstatic Field KHACHIFW H I
L3:     istore 9
L5:     iload 9
L7:     ifeq L61
L10:    getstatic Field PKVMXVTO e Z
L13:    ifeq L20
L16:    iconst_0
L17:    goto L21
L20:    iconst_1
L21:    putstatic Field PKVMXVTO e Z
L24:    aload_0
L25:    aload_0
L26:    iconst_0
L27:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L30:    invokevirtual Method java/awt/Component getGraphics ()Ljava/awt/Graphics;
L33:    putfield Field KHACHIFW l Ljava/awt/Graphics;
        .catch java/lang/Exception from L36 to L44 using L47
L36:    aload_0
L37:    iconst_0
L38:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L41:    invokevirtual Method java/awt/Component repaint ()V
L44:    goto L48
L47:    pop
        .catch java/lang/Exception from L48 to L54 using L57
        .catch java/lang/RuntimeException from L5 to L339 using L340
L48:    ldc2_w 1000L
L51:    invokestatic Method java/lang/Thread sleep (J)V
L54:    goto L61
L57:    pop
L58:    goto L61
L61:    aload_0
L62:    getfield Field KHACHIFW l Ljava/awt/Graphics;
L65:    ifnull L24
L68:    new java/awt/Font
L71:    dup
L72:    ldc "Helvetica"
L74:    iconst_1
L75:    bipush 13
L77:    invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L80:    astore 4
L82:    aload_0
L83:    iconst_0
L84:    invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L87:    aload 4
L89:    invokevirtual Method java/awt/Component getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
L92:    astore 5
L94:    new java/awt/Font
L97:    dup
L98:    ldc "Helvetica"
L100:   iconst_0
L101:   bipush 13
L103:   invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L106:   astore 6
L108:   aload_0
L109:   iconst_0
L110:   invokevirtual Method KHACHIFW f (I)Ljava/awt/Component;
L113:   aload 6
L115:   invokevirtual Method java/awt/Component getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
L118:   pop
L119:   aload_0
L120:   getfield Field KHACHIFW p Z
L123:   ifeq L158
L126:   aload_0
L127:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L130:   getstatic Field java/awt/Color black Ljava/awt/Color;
L133:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L136:   aload_0
L137:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L140:   iconst_0
L141:   iconst_0
L142:   aload_0
L143:   getfield Field KHACHIFW j I
L146:   aload_0
L147:   getfield Field KHACHIFW k I
L150:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L153:   aload_0
L154:   iconst_0
L155:   putfield Field KHACHIFW p Z
L158:   new java/awt/Color
L161:   dup
L162:   sipush 140
L165:   bipush 17
L167:   bipush 17
L169:   invokespecial Method java/awt/Color <init> (III)V
L172:   astore 7
L174:   aload_0
L175:   getfield Field KHACHIFW k I
L178:   iconst_2
L179:   idiv
L180:   bipush 18
L182:   isub
L183:   istore 8
L185:   aload_0
L186:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L189:   aload 7
L191:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L194:   aload_0
L195:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L198:   aload_0
L199:   getfield Field KHACHIFW j I
L202:   iconst_2
L203:   idiv
L204:   sipush 152
L207:   isub
L208:   iload 8
L210:   sipush 304
L213:   bipush 34
L215:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L218:   aload_0
L219:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L222:   aload_0
L223:   getfield Field KHACHIFW j I
L226:   iconst_2
L227:   idiv
L228:   sipush 150
L231:   isub
L232:   iload 8
L234:   iconst_2
L235:   iadd
L236:   iload_1
L237:   iconst_3
L238:   imul
L239:   bipush 30
L241:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L244:   aload_0
L245:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L248:   getstatic Field java/awt/Color black Ljava/awt/Color;
L251:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L254:   iload_2
L255:   iconst_4
L256:   if_icmpeq L260
L259:   return
L260:   aload_0
L261:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L264:   aload_0
L265:   getfield Field KHACHIFW j I
L268:   iconst_2
L269:   idiv
L270:   sipush 150
L273:   isub
L274:   iload_1
L275:   iconst_3
L276:   imul
L277:   iadd
L278:   iload 8
L280:   iconst_2
L281:   iadd
L282:   sipush 300
L285:   iload_1
L286:   iconst_3
L287:   imul
L288:   isub
L289:   bipush 30
L291:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L294:   aload_0
L295:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L298:   aload 4
L300:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L303:   aload_0
L304:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L307:   getstatic Field java/awt/Color white Ljava/awt/Color;
L310:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L313:   aload_0
L314:   getfield Field KHACHIFW l Ljava/awt/Graphics;
L317:   aload_3
L318:   aload_0
L319:   getfield Field KHACHIFW j I
L322:   aload 5
L324:   aload_3
L325:   invokevirtual Method java/awt/FontMetrics stringWidth (Ljava/lang/String;)I
L328:   isub
L329:   iconst_2
L330:   idiv
L331:   iload 8
L333:   bipush 22
L335:   iadd
L336:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V
L339:   return
L340:   astore 4
L342:   new java/lang/StringBuffer
L345:   dup
L346:   ldc "49633, "
L348:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L351:   iload_1
L352:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L355:   ldc ", "
L357:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L360:   iload_2
L361:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L364:   ldc ", "
L366:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L369:   aload_3
L370:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L373:   ldc ", "
L375:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L378:   aload 4
L380:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L383:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L386:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L389:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L392:   new java/lang/RuntimeException
L395:   dup
L396:   invokespecial Method java/lang/RuntimeException <init> ()V
L399:   athrow
L400:   
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/applet/Applet <init> ()V
L4:     aload_0
L5:     iconst_1
L6:     putfield Field KHACHIFW a Z
L9:     aload_0
L10:    sipush 24869
L13:    putfield Field KHACHIFW b I
L16:    aload_0
L17:    sipush 748
L20:    putfield Field KHACHIFW c I
L23:    aload_0
L24:    bipush 20
L26:    putfield Field KHACHIFW e I
L29:    aload_0
L30:    iconst_1
L31:    putfield Field KHACHIFW f I
L34:    aload_0
L35:    bipush 10
L37:    newarray long
L39:    putfield Field KHACHIFW g [J
L42:    aload_0
L43:    iconst_0
L44:    putfield Field KHACHIFW i Z
L47:    aload_0
L48:    bipush 6
L50:    anewarray CXGZMTJK
L53:    putfield Field KHACHIFW n [LCXGZMTJK;
L56:    aload_0
L57:    iconst_1
L58:    putfield Field KHACHIFW p Z
L61:    aload_0
L62:    iconst_1
L63:    putfield Field KHACHIFW q Z
L66:    aload_0
L67:    sipush 128
L70:    newarray int
L72:    putfield Field KHACHIFW D [I
L75:    aload_0
L76:    sipush 128
L79:    newarray int
L81:    putfield Field KHACHIFW E [I
L84:    return
L85:    
    .end code
.end method
.end class
