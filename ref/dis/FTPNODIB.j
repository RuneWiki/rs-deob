.version 45 3
.class public super FTPNODIB
.super java/lang/Object
.field private a Z
.field private b I
.field private c Z
.field private d I
.field private e Z
.field private f Z
.field private g B
.field private h B
.field public i I
.field public j I
.field public k I
.field public l I
.field public m [[I

.method public <init> : (IIZ)V
    .code stack 4 locals 6
L0:     getstatic Field LKGEGIEW t I
L3:     istore 5
L5:     aload_0
L6:     invokespecial Method java/lang/Object <init> ()V
L9:     aload_0
L10:    iconst_1
L11:    putfield Field FTPNODIB a Z
L14:    aload_0
L15:    sipush -32357
L18:    putfield Field FTPNODIB b I
L21:    aload_0
L22:    iconst_0
L23:    putfield Field FTPNODIB c Z
L26:    aload_0
L27:    bipush 7
L29:    putfield Field FTPNODIB d I
L32:    aload_0
L33:    iconst_1
L34:    putfield Field FTPNODIB e Z
L37:    aload_0
L38:    iconst_1
L39:    putfield Field FTPNODIB f Z
L42:    aload_0
L43:    iconst_2
L44:    putfield Field FTPNODIB g B
L47:    aload_0
L48:    bipush -101
L50:    putfield Field FTPNODIB h B
        .catch java/lang/RuntimeException from L53 to L104 using L105
L53:    aload_0
L54:    iconst_0
L55:    putfield Field FTPNODIB i I
L58:    aload_0
L59:    iconst_0
L60:    putfield Field FTPNODIB j I
L63:    aload_0
L64:    iload_1
L65:    putfield Field FTPNODIB k I
L68:    aload_0
L69:    iload_2
L70:    putfield Field FTPNODIB l I
L73:    aload_0
L74:    aload_0
L75:    getfield Field FTPNODIB k I
L78:    aload_0
L79:    getfield Field FTPNODIB l I
L82:    multianewarray [[I 2
L86:    putfield Field FTPNODIB m [[I
L89:    aload_0
L90:    invokevirtual Method FTPNODIB a ()V
L93:    iload_3
L94:    ifne L165
L97:    aload_0
L98:    sipush -496
L101:   putfield Field FTPNODIB b I
L104:   return
L105:   astore 4
L107:   new java/lang/StringBuffer
L110:   dup
L111:   ldc "28792, "
L113:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L116:   iload_1
L117:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L120:   ldc ", "
L122:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L125:   iload_2
L126:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L129:   ldc ", "
L131:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L134:   iload_3
L135:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L138:   ldc ", "
L140:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L143:   aload 4
L145:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L148:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L151:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L154:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L157:   new java/lang/RuntimeException
L160:   dup
L161:   invokespecial Method java/lang/RuntimeException <init> ()V
L164:   athrow
L165:   iload 5
L167:   ifeq L184
L170:   getstatic Field PKVMXVTO e Z
L173:   ifeq L180
L176:   iconst_0
L177:   goto L181
L180:   iconst_1
L181:   putstatic Field PKVMXVTO e Z
L184:   return
L185:   
    .end code
.end method

.method public a : ()V
    .code stack 4 locals 4
L0:     getstatic Field LKGEGIEW t I
L3:     istore_3
L4:     iconst_0
L5:     istore_1
L6:     iload_3
L7:     ifeq L82
L10:    iconst_0
L11:    istore_2
L12:    iload_3
L13:    ifeq L71
L16:    iload_1
L17:    ifeq L44
L20:    iload_2
L21:    ifeq L44
L24:    iload_1
L25:    aload_0
L26:    getfield Field FTPNODIB k I
L29:    iconst_1
L30:    isub
L31:    if_icmpeq L44
L34:    iload_2
L35:    aload_0
L36:    getfield Field FTPNODIB l I
L39:    iconst_1
L40:    isub
L41:    if_icmpne L58
L44:    aload_0
L45:    getfield Field FTPNODIB m [[I
L48:    iload_1
L49:    aaload
L50:    iload_2
L51:    ldc 16777215
L53:    iastore
L54:    iload_3
L55:    ifeq L68
L58:    aload_0
L59:    getfield Field FTPNODIB m [[I
L62:    iload_1
L63:    aaload
L64:    iload_2
L65:    ldc 16777216
L67:    iastore
L68:    iinc 2 1
L71:    iload_2
L72:    aload_0
L73:    getfield Field FTPNODIB l I
L76:    if_icmplt L16
L79:    iinc 1 1
L82:    iload_1
L83:    aload_0
L84:    getfield Field FTPNODIB k I
L87:    if_icmplt L10
L90:    return
L91:    
    .end code
.end method

.method public a : (IIIIBZ)V
    .code stack 5 locals 8
        .catch java/lang/RuntimeException from L0 to L741 using L742
L0:     iload_3
L1:     aload_0
L2:     getfield Field FTPNODIB i I
L5:     isub
L6:     istore_3
L7:     iload_1
L8:     aload_0
L9:     getfield Field FTPNODIB j I
L12:    isub
L13:    istore_1
L14:    iload 5
L16:    iconst_1
L17:    if_icmpne L29
L20:    iconst_0
L21:    istore 5
L23:    getstatic Field LKGEGIEW t I
L26:    ifeq L30
L29:    return
L30:    iload 4
L32:    ifne L126
L35:    iload_2
L36:    ifne L58
L39:    aload_0
L40:    iload_3
L41:    iload_1
L42:    sipush 128
L45:    invokespecial Method FTPNODIB b (III)V
L48:    aload_0
L49:    iload_3
L50:    iconst_1
L51:    isub
L52:    iload_1
L53:    bipush 8
L55:    invokespecial Method FTPNODIB b (III)V
L58:    iload_2
L59:    iconst_1
L60:    if_icmpne L80
L63:    aload_0
L64:    iload_3
L65:    iload_1
L66:    iconst_2
L67:    invokespecial Method FTPNODIB b (III)V
L70:    aload_0
L71:    iload_3
L72:    iload_1
L73:    iconst_1
L74:    iadd
L75:    bipush 32
L77:    invokespecial Method FTPNODIB b (III)V
L80:    iload_2
L81:    iconst_2
L82:    if_icmpne L104
L85:    aload_0
L86:    iload_3
L87:    iload_1
L88:    bipush 8
L90:    invokespecial Method FTPNODIB b (III)V
L93:    aload_0
L94:    iload_3
L95:    iconst_1
L96:    iadd
L97:    iload_1
L98:    sipush 128
L101:   invokespecial Method FTPNODIB b (III)V
L104:   iload_2
L105:   iconst_3
L106:   if_icmpne L126
L109:   aload_0
L110:   iload_3
L111:   iload_1
L112:   bipush 32
L114:   invokespecial Method FTPNODIB b (III)V
L117:   aload_0
L118:   iload_3
L119:   iload_1
L120:   iconst_1
L121:   isub
L122:   iconst_2
L123:   invokespecial Method FTPNODIB b (III)V
L126:   iload 4
L128:   iconst_1
L129:   if_icmpeq L138
L132:   iload 4
L134:   iconst_3
L135:   if_icmpne L233
L138:   iload_2
L139:   ifne L161
L142:   aload_0
L143:   iload_3
L144:   iload_1
L145:   iconst_1
L146:   invokespecial Method FTPNODIB b (III)V
L149:   aload_0
L150:   iload_3
L151:   iconst_1
L152:   isub
L153:   iload_1
L154:   iconst_1
L155:   iadd
L156:   bipush 16
L158:   invokespecial Method FTPNODIB b (III)V
L161:   iload_2
L162:   iconst_1
L163:   if_icmpne L185
L166:   aload_0
L167:   iload_3
L168:   iload_1
L169:   iconst_4
L170:   invokespecial Method FTPNODIB b (III)V
L173:   aload_0
L174:   iload_3
L175:   iconst_1
L176:   iadd
L177:   iload_1
L178:   iconst_1
L179:   iadd
L180:   bipush 64
L182:   invokespecial Method FTPNODIB b (III)V
L185:   iload_2
L186:   iconst_2
L187:   if_icmpne L209
L190:   aload_0
L191:   iload_3
L192:   iload_1
L193:   bipush 16
L195:   invokespecial Method FTPNODIB b (III)V
L198:   aload_0
L199:   iload_3
L200:   iconst_1
L201:   iadd
L202:   iload_1
L203:   iconst_1
L204:   isub
L205:   iconst_1
L206:   invokespecial Method FTPNODIB b (III)V
L209:   iload_2
L210:   iconst_3
L211:   if_icmpne L233
L214:   aload_0
L215:   iload_3
L216:   iload_1
L217:   bipush 64
L219:   invokespecial Method FTPNODIB b (III)V
L222:   aload_0
L223:   iload_3
L224:   iconst_1
L225:   isub
L226:   iload_1
L227:   iconst_1
L228:   isub
L229:   iconst_4
L230:   invokespecial Method FTPNODIB b (III)V
L233:   iload 4
L235:   iconst_2
L236:   if_icmpne L372
L239:   iload_2
L240:   ifne L272
L243:   aload_0
L244:   iload_3
L245:   iload_1
L246:   sipush 130
L249:   invokespecial Method FTPNODIB b (III)V
L252:   aload_0
L253:   iload_3
L254:   iconst_1
L255:   isub
L256:   iload_1
L257:   bipush 8
L259:   invokespecial Method FTPNODIB b (III)V
L262:   aload_0
L263:   iload_3
L264:   iload_1
L265:   iconst_1
L266:   iadd
L267:   bipush 32
L269:   invokespecial Method FTPNODIB b (III)V
L272:   iload_2
L273:   iconst_1
L274:   if_icmpne L306
L277:   aload_0
L278:   iload_3
L279:   iload_1
L280:   bipush 10
L282:   invokespecial Method FTPNODIB b (III)V
L285:   aload_0
L286:   iload_3
L287:   iload_1
L288:   iconst_1
L289:   iadd
L290:   bipush 32
L292:   invokespecial Method FTPNODIB b (III)V
L295:   aload_0
L296:   iload_3
L297:   iconst_1
L298:   iadd
L299:   iload_1
L300:   sipush 128
L303:   invokespecial Method FTPNODIB b (III)V
L306:   iload_2
L307:   iconst_2
L308:   if_icmpne L339
L311:   aload_0
L312:   iload_3
L313:   iload_1
L314:   bipush 40
L316:   invokespecial Method FTPNODIB b (III)V
L319:   aload_0
L320:   iload_3
L321:   iconst_1
L322:   iadd
L323:   iload_1
L324:   sipush 128
L327:   invokespecial Method FTPNODIB b (III)V
L330:   aload_0
L331:   iload_3
L332:   iload_1
L333:   iconst_1
L334:   isub
L335:   iconst_2
L336:   invokespecial Method FTPNODIB b (III)V
L339:   iload_2
L340:   iconst_3
L341:   if_icmpne L372
L344:   aload_0
L345:   iload_3
L346:   iload_1
L347:   sipush 160
L350:   invokespecial Method FTPNODIB b (III)V
L353:   aload_0
L354:   iload_3
L355:   iload_1
L356:   iconst_1
L357:   isub
L358:   iconst_2
L359:   invokespecial Method FTPNODIB b (III)V
L362:   aload_0
L363:   iload_3
L364:   iconst_1
L365:   isub
L366:   iload_1
L367:   bipush 8
L369:   invokespecial Method FTPNODIB b (III)V
L372:   iload 6
L374:   ifeq L832
L377:   iload 4
L379:   ifne L479
L382:   iload_2
L383:   ifne L405
L386:   aload_0
L387:   iload_3
L388:   iload_1
L389:   ldc 65536
L391:   invokespecial Method FTPNODIB b (III)V
L394:   aload_0
L395:   iload_3
L396:   iconst_1
L397:   isub
L398:   iload_1
L399:   sipush 4096
L402:   invokespecial Method FTPNODIB b (III)V
L405:   iload_2
L406:   iconst_1
L407:   if_icmpne L430
L410:   aload_0
L411:   iload_3
L412:   iload_1
L413:   sipush 1024
L416:   invokespecial Method FTPNODIB b (III)V
L419:   aload_0
L420:   iload_3
L421:   iload_1
L422:   iconst_1
L423:   iadd
L424:   sipush 16384
L427:   invokespecial Method FTPNODIB b (III)V
L430:   iload_2
L431:   iconst_2
L432:   if_icmpne L454
L435:   aload_0
L436:   iload_3
L437:   iload_1
L438:   sipush 4096
L441:   invokespecial Method FTPNODIB b (III)V
L444:   aload_0
L445:   iload_3
L446:   iconst_1
L447:   iadd
L448:   iload_1
L449:   ldc 65536
L451:   invokespecial Method FTPNODIB b (III)V
L454:   iload_2
L455:   iconst_3
L456:   if_icmpne L479
L459:   aload_0
L460:   iload_3
L461:   iload_1
L462:   sipush 16384
L465:   invokespecial Method FTPNODIB b (III)V
L468:   aload_0
L469:   iload_3
L470:   iload_1
L471:   iconst_1
L472:   isub
L473:   sipush 1024
L476:   invokespecial Method FTPNODIB b (III)V
L479:   iload 4
L481:   iconst_1
L482:   if_icmpeq L491
L485:   iload 4
L487:   iconst_3
L488:   if_icmpne L596
L491:   iload_2
L492:   ifne L517
L495:   aload_0
L496:   iload_3
L497:   iload_1
L498:   sipush 512
L501:   invokespecial Method FTPNODIB b (III)V
L504:   aload_0
L505:   iload_3
L506:   iconst_1
L507:   isub
L508:   iload_1
L509:   iconst_1
L510:   iadd
L511:   sipush 8192
L514:   invokespecial Method FTPNODIB b (III)V
L517:   iload_2
L518:   iconst_1
L519:   if_icmpne L543
L522:   aload_0
L523:   iload_3
L524:   iload_1
L525:   sipush 2048
L528:   invokespecial Method FTPNODIB b (III)V
L531:   aload_0
L532:   iload_3
L533:   iconst_1
L534:   iadd
L535:   iload_1
L536:   iconst_1
L537:   iadd
L538:   ldc 32768
L540:   invokespecial Method FTPNODIB b (III)V
L543:   iload_2
L544:   iconst_2
L545:   if_icmpne L570
L548:   aload_0
L549:   iload_3
L550:   iload_1
L551:   sipush 8192
L554:   invokespecial Method FTPNODIB b (III)V
L557:   aload_0
L558:   iload_3
L559:   iconst_1
L560:   iadd
L561:   iload_1
L562:   iconst_1
L563:   isub
L564:   sipush 512
L567:   invokespecial Method FTPNODIB b (III)V
L570:   iload_2
L571:   iconst_3
L572:   if_icmpne L596
L575:   aload_0
L576:   iload_3
L577:   iload_1
L578:   ldc 32768
L580:   invokespecial Method FTPNODIB b (III)V
L583:   aload_0
L584:   iload_3
L585:   iconst_1
L586:   isub
L587:   iload_1
L588:   iconst_1
L589:   isub
L590:   sipush 2048
L593:   invokespecial Method FTPNODIB b (III)V
L596:   iload 4
L598:   iconst_2
L599:   if_icmpne L832
L602:   iload_2
L603:   ifne L636
L606:   aload_0
L607:   iload_3
L608:   iload_1
L609:   ldc 66560
L611:   invokespecial Method FTPNODIB b (III)V
L614:   aload_0
L615:   iload_3
L616:   iconst_1
L617:   isub
L618:   iload_1
L619:   sipush 4096
L622:   invokespecial Method FTPNODIB b (III)V
L625:   aload_0
L626:   iload_3
L627:   iload_1
L628:   iconst_1
L629:   iadd
L630:   sipush 16384
L633:   invokespecial Method FTPNODIB b (III)V
L636:   iload_2
L637:   iconst_1
L638:   if_icmpne L671
L641:   aload_0
L642:   iload_3
L643:   iload_1
L644:   sipush 5120
L647:   invokespecial Method FTPNODIB b (III)V
L650:   aload_0
L651:   iload_3
L652:   iload_1
L653:   iconst_1
L654:   iadd
L655:   sipush 16384
L658:   invokespecial Method FTPNODIB b (III)V
L661:   aload_0
L662:   iload_3
L663:   iconst_1
L664:   iadd
L665:   iload_1
L666:   ldc 65536
L668:   invokespecial Method FTPNODIB b (III)V
L671:   iload_2
L672:   iconst_2
L673:   if_icmpne L706
L676:   aload_0
L677:   iload_3
L678:   iload_1
L679:   sipush 20480
L682:   invokespecial Method FTPNODIB b (III)V
L685:   aload_0
L686:   iload_3
L687:   iconst_1
L688:   iadd
L689:   iload_1
L690:   ldc 65536
L692:   invokespecial Method FTPNODIB b (III)V
L695:   aload_0
L696:   iload_3
L697:   iload_1
L698:   iconst_1
L699:   isub
L700:   sipush 1024
L703:   invokespecial Method FTPNODIB b (III)V
L706:   iload_2
L707:   iconst_3
L708:   if_icmpne L832
L711:   aload_0
L712:   iload_3
L713:   iload_1
L714:   ldc 81920
L716:   invokespecial Method FTPNODIB b (III)V
L719:   aload_0
L720:   iload_3
L721:   iload_1
L722:   iconst_1
L723:   isub
L724:   sipush 1024
L727:   invokespecial Method FTPNODIB b (III)V
L730:   aload_0
L731:   iload_3
L732:   iconst_1
L733:   isub
L734:   iload_1
L735:   sipush 4096
L738:   invokespecial Method FTPNODIB b (III)V
L741:   return
L742:   astore 7
L744:   new java/lang/StringBuffer
L747:   dup
L748:   ldc "53275, "
L750:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L753:   iload_1
L754:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L757:   ldc ", "
L759:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L762:   iload_2
L763:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L766:   ldc ", "
L768:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L771:   iload_3
L772:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L775:   ldc ", "
L777:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L780:   iload 4
L782:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L785:   ldc ", "
L787:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L790:   iload 5
L792:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L795:   ldc ", "
L797:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L800:   iload 6
L802:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L805:   ldc ", "
L807:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L810:   aload 7
L812:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L815:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L818:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L821:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L824:   new java/lang/RuntimeException
L827:   dup
L828:   invokespecial Method java/lang/RuntimeException <init> ()V
L831:   athrow
L832:   return
L833:   
    .end code
.end method

.method public a : (ZIIIIII)V
    .code stack 5 locals 12
L0:     getstatic Field LKGEGIEW t I
L3:     istore 11
        .catch java/lang/RuntimeException from L5 to L147 using L148
L5:     sipush 256
L8:     istore 8
L10:    iload_1
L11:    ifeq L21
L14:    iload 8
L16:    ldc 131072
L18:    iadd
L19:    istore 8
L21:    iload 5
L23:    aload_0
L24:    getfield Field FTPNODIB i I
L27:    isub
L28:    istore 5
L30:    bipush 14
L32:    iload_2
L33:    idiv
L34:    istore_2
L35:    iload 6
L37:    aload_0
L38:    getfield Field FTPNODIB j I
L41:    isub
L42:    istore 6
L44:    iload 7
L46:    iconst_1
L47:    if_icmpeq L56
L50:    iload 7
L52:    iconst_3
L53:    if_icmpne L66
L56:    iload_3
L57:    istore 9
L59:    iload 4
L61:    istore_3
L62:    iload 9
L64:    istore 4
L66:    iload 5
L68:    istore 9
L70:    iload 11
L72:    ifeq L138
L75:    iload 9
L77:    iflt L135
L80:    iload 9
L82:    aload_0
L83:    getfield Field FTPNODIB k I
L86:    if_icmpge L135
L89:    iload 6
L91:    istore 10
L93:    iload 11
L95:    ifeq L125
L98:    iload 10
L100:   iflt L122
L103:   iload 10
L105:   aload_0
L106:   getfield Field FTPNODIB l I
L109:   if_icmpge L122
L112:   aload_0
L113:   iload 9
L115:   iload 10
L117:   iload 8
L119:   invokespecial Method FTPNODIB b (III)V
L122:   iinc 10 1
L125:   iload 10
L127:   iload 6
L129:   iload 4
L131:   iadd
L132:   if_icmplt L98
L135:   iinc 9 1
L138:   iload 9
L140:   iload 5
L142:   iload_3
L143:   iadd
L144:   if_icmplt L75
L147:   return
L148:   astore 8
L150:   new java/lang/StringBuffer
L153:   dup
L154:   ldc "32403, "
L156:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L159:   iload_1
L160:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L163:   ldc ", "
L165:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L168:   iload_2
L169:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L172:   ldc ", "
L174:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L177:   iload_3
L178:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L181:   ldc ", "
L183:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L186:   iload 4
L188:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L191:   ldc ", "
L193:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L196:   iload 5
L198:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L201:   ldc ", "
L203:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L206:   iload 6
L208:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L211:   ldc ", "
L213:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L216:   iload 7
L218:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L221:   ldc ", "
L223:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L226:   aload 8
L228:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L231:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L234:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L237:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L240:   new java/lang/RuntimeException
L243:   dup
L244:   invokespecial Method java/lang/RuntimeException <init> ()V
L247:   athrow
L248:   
    .end code
.end method

.method public a : (III)V
    .code stack 4 locals 5
        .catch java/lang/RuntimeException from L0 to L47 using L48
L0:     iload_3
L1:     aload_0
L2:     getfield Field FTPNODIB i I
L5:     isub
L6:     istore_3
L7:     iload_2
L8:     ifeq L27
L11:    aload_0
L12:    aload_0
L13:    getfield Field FTPNODIB a Z
L16:    ifeq L23
L19:    iconst_0
L20:    goto L24
L23:    iconst_1
L24:    putfield Field FTPNODIB a Z
L27:    iload_1
L28:    aload_0
L29:    getfield Field FTPNODIB j I
L32:    isub
L33:    istore_1
L34:    aload_0
L35:    getfield Field FTPNODIB m [[I
L38:    iload_3
L39:    aaload
L40:    iload_1
L41:    dup2
L42:    iaload
L43:    ldc 2097152
L45:    ior
L46:    iastore
L47:    return
L48:    astore 4
L50:    new java/lang/StringBuffer
L53:    dup
L54:    ldc "33794, "
L56:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L59:    iload_1
L60:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L63:    ldc ", "
L65:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L68:    iload_2
L69:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L72:    ldc ", "
L74:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L77:    iload_3
L78:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L81:    ldc ", "
L83:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L86:    aload 4
L88:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L91:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L94:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L97:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L100:   new java/lang/RuntimeException
L103:   dup
L104:   invokespecial Method java/lang/RuntimeException <init> ()V
L107:   athrow
L108:   
    .end code
.end method

.method private b : (III)V
    .code stack 4 locals 4
L0:     aload_0
L1:     getfield Field FTPNODIB m [[I
L4:     iload_1
L5:     aaload
L6:     iload_2
L7:     dup2
L8:     iaload
L9:     iload_3
L10:    ior
L11:    iastore
L12:    return
L13:    
    .end code
.end method

.method public a : (IIZZII)V
    .code stack 5 locals 8
        .catch java/lang/RuntimeException from L0 to L1006 using L1007
L0:     iload 5
L2:     aload_0
L3:     getfield Field FTPNODIB i I
L6:     isub
L7:     istore 5
L9:     iload 6
L11:    aload_0
L12:    getfield Field FTPNODIB j I
L15:    isub
L16:    istore 6
L18:    iload 4
L20:    ifne L24
L23:    return
L24:    iload_2
L25:    ifne L159
L28:    iload_1
L29:    ifne L61
L32:    aload_0
L33:    sipush 128
L36:    iload 5
L38:    iload 6
L40:    sipush 933
L43:    invokespecial Method FTPNODIB a (IIII)V
L46:    aload_0
L47:    bipush 8
L49:    iload 5
L51:    iconst_1
L52:    isub
L53:    iload 6
L55:    sipush 933
L58:    invokespecial Method FTPNODIB a (IIII)V
L61:    iload_1
L62:    iconst_1
L63:    if_icmpne L93
L66:    aload_0
L67:    iconst_2
L68:    iload 5
L70:    iload 6
L72:    sipush 933
L75:    invokespecial Method FTPNODIB a (IIII)V
L78:    aload_0
L79:    bipush 32
L81:    iload 5
L83:    iload 6
L85:    iconst_1
L86:    iadd
L87:    sipush 933
L90:    invokespecial Method FTPNODIB a (IIII)V
L93:    iload_1
L94:    iconst_2
L95:    if_icmpne L127
L98:    aload_0
L99:    bipush 8
L101:   iload 5
L103:   iload 6
L105:   sipush 933
L108:   invokespecial Method FTPNODIB a (IIII)V
L111:   aload_0
L112:   sipush 128
L115:   iload 5
L117:   iconst_1
L118:   iadd
L119:   iload 6
L121:   sipush 933
L124:   invokespecial Method FTPNODIB a (IIII)V
L127:   iload_1
L128:   iconst_3
L129:   if_icmpne L159
L132:   aload_0
L133:   bipush 32
L135:   iload 5
L137:   iload 6
L139:   sipush 933
L142:   invokespecial Method FTPNODIB a (IIII)V
L145:   aload_0
L146:   iconst_2
L147:   iload 5
L149:   iload 6
L151:   iconst_1
L152:   isub
L153:   sipush 933
L156:   invokespecial Method FTPNODIB a (IIII)V
L159:   iload_2
L160:   iconst_1
L161:   if_icmpeq L169
L164:   iload_2
L165:   iconst_3
L166:   if_icmpne L304
L169:   iload_1
L170:   ifne L202
L173:   aload_0
L174:   iconst_1
L175:   iload 5
L177:   iload 6
L179:   sipush 933
L182:   invokespecial Method FTPNODIB a (IIII)V
L185:   aload_0
L186:   bipush 16
L188:   iload 5
L190:   iconst_1
L191:   isub
L192:   iload 6
L194:   iconst_1
L195:   iadd
L196:   sipush 933
L199:   invokespecial Method FTPNODIB a (IIII)V
L202:   iload_1
L203:   iconst_1
L204:   if_icmpne L236
L207:   aload_0
L208:   iconst_4
L209:   iload 5
L211:   iload 6
L213:   sipush 933
L216:   invokespecial Method FTPNODIB a (IIII)V
L219:   aload_0
L220:   bipush 64
L222:   iload 5
L224:   iconst_1
L225:   iadd
L226:   iload 6
L228:   iconst_1
L229:   iadd
L230:   sipush 933
L233:   invokespecial Method FTPNODIB a (IIII)V
L236:   iload_1
L237:   iconst_2
L238:   if_icmpne L270
L241:   aload_0
L242:   bipush 16
L244:   iload 5
L246:   iload 6
L248:   sipush 933
L251:   invokespecial Method FTPNODIB a (IIII)V
L254:   aload_0
L255:   iconst_1
L256:   iload 5
L258:   iconst_1
L259:   iadd
L260:   iload 6
L262:   iconst_1
L263:   isub
L264:   sipush 933
L267:   invokespecial Method FTPNODIB a (IIII)V
L270:   iload_1
L271:   iconst_3
L272:   if_icmpne L304
L275:   aload_0
L276:   bipush 64
L278:   iload 5
L280:   iload 6
L282:   sipush 933
L285:   invokespecial Method FTPNODIB a (IIII)V
L288:   aload_0
L289:   iconst_4
L290:   iload 5
L292:   iconst_1
L293:   isub
L294:   iload 6
L296:   iconst_1
L297:   isub
L298:   sipush 933
L301:   invokespecial Method FTPNODIB a (IIII)V
L304:   iload_2
L305:   iconst_2
L306:   if_icmpne L502
L309:   iload_1
L310:   ifne L357
L313:   aload_0
L314:   sipush 130
L317:   iload 5
L319:   iload 6
L321:   sipush 933
L324:   invokespecial Method FTPNODIB a (IIII)V
L327:   aload_0
L328:   bipush 8
L330:   iload 5
L332:   iconst_1
L333:   isub
L334:   iload 6
L336:   sipush 933
L339:   invokespecial Method FTPNODIB a (IIII)V
L342:   aload_0
L343:   bipush 32
L345:   iload 5
L347:   iload 6
L349:   iconst_1
L350:   iadd
L351:   sipush 933
L354:   invokespecial Method FTPNODIB a (IIII)V
L357:   iload_1
L358:   iconst_1
L359:   if_icmpne L406
L362:   aload_0
L363:   bipush 10
L365:   iload 5
L367:   iload 6
L369:   sipush 933
L372:   invokespecial Method FTPNODIB a (IIII)V
L375:   aload_0
L376:   bipush 32
L378:   iload 5
L380:   iload 6
L382:   iconst_1
L383:   iadd
L384:   sipush 933
L387:   invokespecial Method FTPNODIB a (IIII)V
L390:   aload_0
L391:   sipush 128
L394:   iload 5
L396:   iconst_1
L397:   iadd
L398:   iload 6
L400:   sipush 933
L403:   invokespecial Method FTPNODIB a (IIII)V
L406:   iload_1
L407:   iconst_2
L408:   if_icmpne L454
L411:   aload_0
L412:   bipush 40
L414:   iload 5
L416:   iload 6
L418:   sipush 933
L421:   invokespecial Method FTPNODIB a (IIII)V
L424:   aload_0
L425:   sipush 128
L428:   iload 5
L430:   iconst_1
L431:   iadd
L432:   iload 6
L434:   sipush 933
L437:   invokespecial Method FTPNODIB a (IIII)V
L440:   aload_0
L441:   iconst_2
L442:   iload 5
L444:   iload 6
L446:   iconst_1
L447:   isub
L448:   sipush 933
L451:   invokespecial Method FTPNODIB a (IIII)V
L454:   iload_1
L455:   iconst_3
L456:   if_icmpne L502
L459:   aload_0
L460:   sipush 160
L463:   iload 5
L465:   iload 6
L467:   sipush 933
L470:   invokespecial Method FTPNODIB a (IIII)V
L473:   aload_0
L474:   iconst_2
L475:   iload 5
L477:   iload 6
L479:   iconst_1
L480:   isub
L481:   sipush 933
L484:   invokespecial Method FTPNODIB a (IIII)V
L487:   aload_0
L488:   bipush 8
L490:   iload 5
L492:   iconst_1
L493:   isub
L494:   iload 6
L496:   sipush 933
L499:   invokespecial Method FTPNODIB a (IIII)V
L502:   iload_3
L503:   ifeq L1097
L506:   iload_2
L507:   ifne L647
L510:   iload_1
L511:   ifne L543
L514:   aload_0
L515:   ldc 65536
L517:   iload 5
L519:   iload 6
L521:   sipush 933
L524:   invokespecial Method FTPNODIB a (IIII)V
L527:   aload_0
L528:   sipush 4096
L531:   iload 5
L533:   iconst_1
L534:   isub
L535:   iload 6
L537:   sipush 933
L540:   invokespecial Method FTPNODIB a (IIII)V
L543:   iload_1
L544:   iconst_1
L545:   if_icmpne L578
L548:   aload_0
L549:   sipush 1024
L552:   iload 5
L554:   iload 6
L556:   sipush 933
L559:   invokespecial Method FTPNODIB a (IIII)V
L562:   aload_0
L563:   sipush 16384
L566:   iload 5
L568:   iload 6
L570:   iconst_1
L571:   iadd
L572:   sipush 933
L575:   invokespecial Method FTPNODIB a (IIII)V
L578:   iload_1
L579:   iconst_2
L580:   if_icmpne L612
L583:   aload_0
L584:   sipush 4096
L587:   iload 5
L589:   iload 6
L591:   sipush 933
L594:   invokespecial Method FTPNODIB a (IIII)V
L597:   aload_0
L598:   ldc 65536
L600:   iload 5
L602:   iconst_1
L603:   iadd
L604:   iload 6
L606:   sipush 933
L609:   invokespecial Method FTPNODIB a (IIII)V
L612:   iload_1
L613:   iconst_3
L614:   if_icmpne L647
L617:   aload_0
L618:   sipush 16384
L621:   iload 5
L623:   iload 6
L625:   sipush 933
L628:   invokespecial Method FTPNODIB a (IIII)V
L631:   aload_0
L632:   sipush 1024
L635:   iload 5
L637:   iload 6
L639:   iconst_1
L640:   isub
L641:   sipush 933
L644:   invokespecial Method FTPNODIB a (IIII)V
L647:   iload_2
L648:   iconst_1
L649:   if_icmpeq L657
L652:   iload_2
L653:   iconst_3
L654:   if_icmpne L802
L657:   iload_1
L658:   ifne L693
L661:   aload_0
L662:   sipush 512
L665:   iload 5
L667:   iload 6
L669:   sipush 933
L672:   invokespecial Method FTPNODIB a (IIII)V
L675:   aload_0
L676:   sipush 8192
L679:   iload 5
L681:   iconst_1
L682:   isub
L683:   iload 6
L685:   iconst_1
L686:   iadd
L687:   sipush 933
L690:   invokespecial Method FTPNODIB a (IIII)V
L693:   iload_1
L694:   iconst_1
L695:   if_icmpne L729
L698:   aload_0
L699:   sipush 2048
L702:   iload 5
L704:   iload 6
L706:   sipush 933
L709:   invokespecial Method FTPNODIB a (IIII)V
L712:   aload_0
L713:   ldc 32768
L715:   iload 5
L717:   iconst_1
L718:   iadd
L719:   iload 6
L721:   iconst_1
L722:   iadd
L723:   sipush 933
L726:   invokespecial Method FTPNODIB a (IIII)V
L729:   iload_1
L730:   iconst_2
L731:   if_icmpne L766
L734:   aload_0
L735:   sipush 8192
L738:   iload 5
L740:   iload 6
L742:   sipush 933
L745:   invokespecial Method FTPNODIB a (IIII)V
L748:   aload_0
L749:   sipush 512
L752:   iload 5
L754:   iconst_1
L755:   iadd
L756:   iload 6
L758:   iconst_1
L759:   isub
L760:   sipush 933
L763:   invokespecial Method FTPNODIB a (IIII)V
L766:   iload_1
L767:   iconst_3
L768:   if_icmpne L802
L771:   aload_0
L772:   ldc 32768
L774:   iload 5
L776:   iload 6
L778:   sipush 933
L781:   invokespecial Method FTPNODIB a (IIII)V
L784:   aload_0
L785:   sipush 2048
L788:   iload 5
L790:   iconst_1
L791:   isub
L792:   iload 6
L794:   iconst_1
L795:   isub
L796:   sipush 933
L799:   invokespecial Method FTPNODIB a (IIII)V
L802:   iload_2
L803:   iconst_2
L804:   if_icmpne L1097
L807:   iload_1
L808:   ifne L856
L811:   aload_0
L812:   ldc 66560
L814:   iload 5
L816:   iload 6
L818:   sipush 933
L821:   invokespecial Method FTPNODIB a (IIII)V
L824:   aload_0
L825:   sipush 4096
L828:   iload 5
L830:   iconst_1
L831:   isub
L832:   iload 6
L834:   sipush 933
L837:   invokespecial Method FTPNODIB a (IIII)V
L840:   aload_0
L841:   sipush 16384
L844:   iload 5
L846:   iload 6
L848:   iconst_1
L849:   iadd
L850:   sipush 933
L853:   invokespecial Method FTPNODIB a (IIII)V
L856:   iload_1
L857:   iconst_1
L858:   if_icmpne L906
L861:   aload_0
L862:   sipush 5120
L865:   iload 5
L867:   iload 6
L869:   sipush 933
L872:   invokespecial Method FTPNODIB a (IIII)V
L875:   aload_0
L876:   sipush 16384
L879:   iload 5
L881:   iload 6
L883:   iconst_1
L884:   iadd
L885:   sipush 933
L888:   invokespecial Method FTPNODIB a (IIII)V
L891:   aload_0
L892:   ldc 65536
L894:   iload 5
L896:   iconst_1
L897:   iadd
L898:   iload 6
L900:   sipush 933
L903:   invokespecial Method FTPNODIB a (IIII)V
L906:   iload_1
L907:   iconst_2
L908:   if_icmpne L956
L911:   aload_0
L912:   sipush 20480
L915:   iload 5
L917:   iload 6
L919:   sipush 933
L922:   invokespecial Method FTPNODIB a (IIII)V
L925:   aload_0
L926:   ldc 65536
L928:   iload 5
L930:   iconst_1
L931:   iadd
L932:   iload 6
L934:   sipush 933
L937:   invokespecial Method FTPNODIB a (IIII)V
L940:   aload_0
L941:   sipush 1024
L944:   iload 5
L946:   iload 6
L948:   iconst_1
L949:   isub
L950:   sipush 933
L953:   invokespecial Method FTPNODIB a (IIII)V
L956:   iload_1
L957:   iconst_3
L958:   if_icmpne L1097
L961:   aload_0
L962:   ldc 81920
L964:   iload 5
L966:   iload 6
L968:   sipush 933
L971:   invokespecial Method FTPNODIB a (IIII)V
L974:   aload_0
L975:   sipush 1024
L978:   iload 5
L980:   iload 6
L982:   iconst_1
L983:   isub
L984:   sipush 933
L987:   invokespecial Method FTPNODIB a (IIII)V
L990:   aload_0
L991:   sipush 4096
L994:   iload 5
L996:   iconst_1
L997:   isub
L998:   iload 6
L1000:  sipush 933
L1003:  invokespecial Method FTPNODIB a (IIII)V
L1006:  return
L1007:  astore 7
L1009:  new java/lang/StringBuffer
L1012:  dup
L1013:  ldc "6952, "
L1015:  invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L1018:  iload_1
L1019:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1022:  ldc ", "
L1024:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1027:  iload_2
L1028:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1031:  ldc ", "
L1033:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1036:  iload_3
L1037:  invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L1040:  ldc ", "
L1042:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1045:  iload 4
L1047:  invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L1050:  ldc ", "
L1052:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1055:  iload 5
L1057:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1060:  ldc ", "
L1062:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1065:  iload 6
L1067:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1070:  ldc ", "
L1072:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1075:  aload 7
L1077:  invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L1080:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1083:  invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L1086:  invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L1089:  new java/lang/RuntimeException
L1092:  dup
L1093:  invokespecial Method java/lang/RuntimeException <init> ()V
L1096:  athrow
L1097:  return
L1098:  
    .end code
.end method

.method public a : (IIIIBIZ)V
    .code stack 6 locals 12
L0:     getstatic Field LKGEGIEW t I
L3:     istore 11
        .catch java/lang/RuntimeException from L5 to L163 using L164
L5:     sipush 256
L8:     istore 8
L10:    iload 7
L12:    ifeq L22
L15:    iload 8
L17:    ldc 131072
L19:    iadd
L20:    istore 8
L22:    iload_3
L23:    aload_0
L24:    getfield Field FTPNODIB i I
L27:    isub
L28:    istore_3
L29:    iload 4
L31:    aload_0
L32:    getfield Field FTPNODIB j I
L35:    isub
L36:    istore 4
L38:    iload 5
L40:    bipush 6
L42:    if_icmpeq L61
L45:    aload_0
L46:    aload_0
L47:    getfield Field FTPNODIB a Z
L50:    ifeq L57
L53:    iconst_0
L54:    goto L58
L57:    iconst_1
L58:    putfield Field FTPNODIB a Z
L61:    iload_1
L62:    iconst_1
L63:    if_icmpeq L71
L66:    iload_1
L67:    iconst_3
L68:    if_icmpne L81
L71:    iload_2
L72:    istore 9
L74:    iload 6
L76:    istore_2
L77:    iload 9
L79:    istore 6
L81:    iload_3
L82:    istore 9
L84:    iload 11
L86:    ifeq L155
L89:    iload 9
L91:    iflt L152
L94:    iload 9
L96:    aload_0
L97:    getfield Field FTPNODIB k I
L100:   if_icmpge L152
L103:   iload 4
L105:   istore 10
L107:   iload 11
L109:   ifeq L142
L112:   iload 10
L114:   iflt L139
L117:   iload 10
L119:   aload_0
L120:   getfield Field FTPNODIB l I
L123:   if_icmpge L139
L126:   aload_0
L127:   iload 8
L129:   iload 9
L131:   iload 10
L133:   sipush 933
L136:   invokespecial Method FTPNODIB a (IIII)V
L139:   iinc 10 1
L142:   iload 10
L144:   iload 4
L146:   iload 6
L148:   iadd
L149:   if_icmplt L112
L152:   iinc 9 1
L155:   iload 9
L157:   iload_3
L158:   iload_2
L159:   iadd
L160:   if_icmplt L89
L163:   return
L164:   astore 8
L166:   new java/lang/StringBuffer
L169:   dup
L170:   ldc "45433, "
L172:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L175:   iload_1
L176:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L179:   ldc ", "
L181:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L184:   iload_2
L185:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L188:   ldc ", "
L190:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L193:   iload_3
L194:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L197:   ldc ", "
L199:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L202:   iload 4
L204:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L207:   ldc ", "
L209:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L212:   iload 5
L214:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L217:   ldc ", "
L219:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L222:   iload 6
L224:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L227:   ldc ", "
L229:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L232:   iload 7
L234:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L237:   ldc ", "
L239:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L242:   aload 8
L244:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L247:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L250:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L253:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L256:   new java/lang/RuntimeException
L259:   dup
L260:   invokespecial Method java/lang/RuntimeException <init> ()V
L263:   athrow
L264:   
    .end code
.end method

.method private a : (IIII)V
    .code stack 5 locals 6
        .catch java/lang/RuntimeException from L0 to L22 using L23
L0:     bipush 36
L2:     iload 4
L4:     idiv
L5:     istore 4
L7:     aload_0
L8:     getfield Field FTPNODIB m [[I
L11:    iload_2
L12:    aaload
L13:    iload_3
L14:    dup2
L15:    iaload
L16:    ldc 16777215
L18:    iload_1
L19:    isub
L20:    iand
L21:    iastore
L22:    return
L23:    astore 5
L25:    new java/lang/StringBuffer
L28:    dup
L29:    ldc "42695, "
L31:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L34:    iload_1
L35:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L38:    ldc ", "
L40:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L43:    iload_2
L44:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L47:    ldc ", "
L49:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L52:    iload_3
L53:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L56:    ldc ", "
L58:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L61:    iload 4
L63:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L66:    ldc ", "
L68:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L71:    aload 5
L73:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L76:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L79:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L82:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L85:    new java/lang/RuntimeException
L88:    dup
L89:    invokespecial Method java/lang/RuntimeException <init> ()V
L92:    athrow
L93:    
    .end code
.end method

.method public c : (III)V
    .code stack 4 locals 5
        .catch java/lang/RuntimeException from L0 to L32 using L33
L0:     iload_3
L1:     aload_0
L2:     getfield Field FTPNODIB i I
L5:     isub
L6:     istore_3
L7:     iload_2
L8:     aload_0
L9:     getfield Field FTPNODIB j I
L12:    isub
L13:    istore_2
L14:    bipush 6
L16:    iload_1
L17:    idiv
L18:    istore_1
L19:    aload_0
L20:    getfield Field FTPNODIB m [[I
L23:    iload_3
L24:    aaload
L25:    iload_2
L26:    dup2
L27:    iaload
L28:    ldc 14680063
L30:    iand
L31:    iastore
L32:    return
L33:    astore 4
L35:    new java/lang/StringBuffer
L38:    dup
L39:    ldc "36463, "
L41:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L44:    iload_1
L45:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L48:    ldc ", "
L50:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L53:    iload_2
L54:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L57:    ldc ", "
L59:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L62:    iload_3
L63:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L66:    ldc ", "
L68:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L71:    aload 4
L73:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L76:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L79:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L82:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L85:    new java/lang/RuntimeException
L88:    dup
L89:    invokespecial Method java/lang/RuntimeException <init> ()V
L92:    athrow
L93:    
    .end code
.end method

.method public a : (IIIIIII)Z
    .code stack 3 locals 9
        .catch java/lang/RuntimeException from L0 to L890 using L890
L0:     iload 4
L2:     ifeq L21
L5:     aload_0
L6:     aload_0
L7:     getfield Field FTPNODIB a Z
L10:    ifeq L17
L13:    iconst_0
L14:    goto L18
L17:    iconst_1
L18:    putfield Field FTPNODIB a Z
L21:    iload_2
L22:    iload_1
L23:    if_icmpne L34
L26:    iload_3
L27:    iload 7
L29:    if_icmpne L34
L32:    iconst_1
L33:    ireturn
L34:    iload_2
L35:    aload_0
L36:    getfield Field FTPNODIB i I
L39:    isub
L40:    istore_2
L41:    iload_3
L42:    aload_0
L43:    getfield Field FTPNODIB j I
L46:    isub
L47:    istore_3
L48:    iload_1
L49:    aload_0
L50:    getfield Field FTPNODIB i I
L53:    isub
L54:    istore_1
L55:    iload 7
L57:    aload_0
L58:    getfield Field FTPNODIB j I
L61:    isub
L62:    istore 7
L64:    iload 6
L66:    ifne L384
L69:    iload 5
L71:    ifne L147
L74:    iload_2
L75:    iload_1
L76:    iconst_1
L77:    isub
L78:    if_icmpne L89
L81:    iload_3
L82:    iload 7
L84:    if_icmpne L89
L87:    iconst_1
L88:    ireturn
L89:    iload_2
L90:    iload_1
L91:    if_icmpne L118
L94:    iload_3
L95:    iload 7
L97:    iconst_1
L98:    iadd
L99:    if_icmpne L118
L102:   aload_0
L103:   getfield Field FTPNODIB m [[I
L106:   iload_2
L107:   aaload
L108:   iload_3
L109:   iaload
L110:   ldc 19398944
L112:   iand
L113:   ifne L118
L116:   iconst_1
L117:   ireturn
L118:   iload_2
L119:   iload_1
L120:   if_icmpne L384
L123:   iload_3
L124:   iload 7
L126:   iconst_1
L127:   isub
L128:   if_icmpne L384
L131:   aload_0
L132:   getfield Field FTPNODIB m [[I
L135:   iload_2
L136:   aaload
L137:   iload_3
L138:   iaload
L139:   ldc 19398914
L141:   iand
L142:   ifne L384
L145:   iconst_1
L146:   ireturn
L147:   iload 5
L149:   iconst_1
L150:   if_icmpne L226
L153:   iload_2
L154:   iload_1
L155:   if_icmpne L168
L158:   iload_3
L159:   iload 7
L161:   iconst_1
L162:   iadd
L163:   if_icmpne L168
L166:   iconst_1
L167:   ireturn
L168:   iload_2
L169:   iload_1
L170:   iconst_1
L171:   isub
L172:   if_icmpne L197
L175:   iload_3
L176:   iload 7
L178:   if_icmpne L197
L181:   aload_0
L182:   getfield Field FTPNODIB m [[I
L185:   iload_2
L186:   aaload
L187:   iload_3
L188:   iaload
L189:   ldc 19398920
L191:   iand
L192:   ifne L197
L195:   iconst_1
L196:   ireturn
L197:   iload_2
L198:   iload_1
L199:   iconst_1
L200:   iadd
L201:   if_icmpne L384
L204:   iload_3
L205:   iload 7
L207:   if_icmpne L384
L210:   aload_0
L211:   getfield Field FTPNODIB m [[I
L214:   iload_2
L215:   aaload
L216:   iload_3
L217:   iaload
L218:   ldc 19399040
L220:   iand
L221:   ifne L384
L224:   iconst_1
L225:   ireturn
L226:   iload 5
L228:   iconst_2
L229:   if_icmpne L305
L232:   iload_2
L233:   iload_1
L234:   iconst_1
L235:   iadd
L236:   if_icmpne L247
L239:   iload_3
L240:   iload 7
L242:   if_icmpne L247
L245:   iconst_1
L246:   ireturn
L247:   iload_2
L248:   iload_1
L249:   if_icmpne L276
L252:   iload_3
L253:   iload 7
L255:   iconst_1
L256:   iadd
L257:   if_icmpne L276
L260:   aload_0
L261:   getfield Field FTPNODIB m [[I
L264:   iload_2
L265:   aaload
L266:   iload_3
L267:   iaload
L268:   ldc 19398944
L270:   iand
L271:   ifne L276
L274:   iconst_1
L275:   ireturn
L276:   iload_2
L277:   iload_1
L278:   if_icmpne L384
L281:   iload_3
L282:   iload 7
L284:   iconst_1
L285:   isub
L286:   if_icmpne L384
L289:   aload_0
L290:   getfield Field FTPNODIB m [[I
L293:   iload_2
L294:   aaload
L295:   iload_3
L296:   iaload
L297:   ldc 19398914
L299:   iand
L300:   ifne L384
L303:   iconst_1
L304:   ireturn
L305:   iload 5
L307:   iconst_3
L308:   if_icmpne L384
L311:   iload_2
L312:   iload_1
L313:   if_icmpne L326
L316:   iload_3
L317:   iload 7
L319:   iconst_1
L320:   isub
L321:   if_icmpne L326
L324:   iconst_1
L325:   ireturn
L326:   iload_2
L327:   iload_1
L328:   iconst_1
L329:   isub
L330:   if_icmpne L355
L333:   iload_3
L334:   iload 7
L336:   if_icmpne L355
L339:   aload_0
L340:   getfield Field FTPNODIB m [[I
L343:   iload_2
L344:   aaload
L345:   iload_3
L346:   iaload
L347:   ldc 19398920
L349:   iand
L350:   ifne L355
L353:   iconst_1
L354:   ireturn
L355:   iload_2
L356:   iload_1
L357:   iconst_1
L358:   iadd
L359:   if_icmpne L384
L362:   iload_3
L363:   iload 7
L365:   if_icmpne L384
L368:   aload_0
L369:   getfield Field FTPNODIB m [[I
L372:   iload_2
L373:   aaload
L374:   iload_3
L375:   iaload
L376:   ldc 19399040
L378:   iand
L379:   ifne L384
L382:   iconst_1
L383:   ireturn
L384:   iload 6
L386:   iconst_2
L387:   if_icmpne L765
L390:   iload 5
L392:   ifne L483
L395:   iload_2
L396:   iload_1
L397:   iconst_1
L398:   isub
L399:   if_icmpne L410
L402:   iload_3
L403:   iload 7
L405:   if_icmpne L410
L408:   iconst_1
L409:   ireturn
L410:   iload_2
L411:   iload_1
L412:   if_icmpne L425
L415:   iload_3
L416:   iload 7
L418:   iconst_1
L419:   iadd
L420:   if_icmpne L425
L423:   iconst_1
L424:   ireturn
L425:   iload_2
L426:   iload_1
L427:   iconst_1
L428:   iadd
L429:   if_icmpne L454
L432:   iload_3
L433:   iload 7
L435:   if_icmpne L454
L438:   aload_0
L439:   getfield Field FTPNODIB m [[I
L442:   iload_2
L443:   aaload
L444:   iload_3
L445:   iaload
L446:   ldc 19399040
L448:   iand
L449:   ifne L454
L452:   iconst_1
L453:   ireturn
L454:   iload_2
L455:   iload_1
L456:   if_icmpne L765
L459:   iload_3
L460:   iload 7
L462:   iconst_1
L463:   isub
L464:   if_icmpne L765
L467:   aload_0
L468:   getfield Field FTPNODIB m [[I
L471:   iload_2
L472:   aaload
L473:   iload_3
L474:   iaload
L475:   ldc 19398914
L477:   iand
L478:   ifne L765
L481:   iconst_1
L482:   ireturn
L483:   iload 5
L485:   iconst_1
L486:   if_icmpne L577
L489:   iload_2
L490:   iload_1
L491:   iconst_1
L492:   isub
L493:   if_icmpne L518
L496:   iload_3
L497:   iload 7
L499:   if_icmpne L518
L502:   aload_0
L503:   getfield Field FTPNODIB m [[I
L506:   iload_2
L507:   aaload
L508:   iload_3
L509:   iaload
L510:   ldc 19398920
L512:   iand
L513:   ifne L518
L516:   iconst_1
L517:   ireturn
L518:   iload_2
L519:   iload_1
L520:   if_icmpne L533
L523:   iload_3
L524:   iload 7
L526:   iconst_1
L527:   iadd
L528:   if_icmpne L533
L531:   iconst_1
L532:   ireturn
L533:   iload_2
L534:   iload_1
L535:   iconst_1
L536:   iadd
L537:   if_icmpne L548
L540:   iload_3
L541:   iload 7
L543:   if_icmpne L548
L546:   iconst_1
L547:   ireturn
L548:   iload_2
L549:   iload_1
L550:   if_icmpne L765
L553:   iload_3
L554:   iload 7
L556:   iconst_1
L557:   isub
L558:   if_icmpne L765
L561:   aload_0
L562:   getfield Field FTPNODIB m [[I
L565:   iload_2
L566:   aaload
L567:   iload_3
L568:   iaload
L569:   ldc 19398914
L571:   iand
L572:   ifne L765
L575:   iconst_1
L576:   ireturn
L577:   iload 5
L579:   iconst_2
L580:   if_icmpne L671
L583:   iload_2
L584:   iload_1
L585:   iconst_1
L586:   isub
L587:   if_icmpne L612
L590:   iload_3
L591:   iload 7
L593:   if_icmpne L612
L596:   aload_0
L597:   getfield Field FTPNODIB m [[I
L600:   iload_2
L601:   aaload
L602:   iload_3
L603:   iaload
L604:   ldc 19398920
L606:   iand
L607:   ifne L612
L610:   iconst_1
L611:   ireturn
L612:   iload_2
L613:   iload_1
L614:   if_icmpne L641
L617:   iload_3
L618:   iload 7
L620:   iconst_1
L621:   iadd
L622:   if_icmpne L641
L625:   aload_0
L626:   getfield Field FTPNODIB m [[I
L629:   iload_2
L630:   aaload
L631:   iload_3
L632:   iaload
L633:   ldc 19398944
L635:   iand
L636:   ifne L641
L639:   iconst_1
L640:   ireturn
L641:   iload_2
L642:   iload_1
L643:   iconst_1
L644:   iadd
L645:   if_icmpne L656
L648:   iload_3
L649:   iload 7
L651:   if_icmpne L656
L654:   iconst_1
L655:   ireturn
L656:   iload_2
L657:   iload_1
L658:   if_icmpne L765
L661:   iload_3
L662:   iload 7
L664:   iconst_1
L665:   isub
L666:   if_icmpne L765
L669:   iconst_1
L670:   ireturn
L671:   iload 5
L673:   iconst_3
L674:   if_icmpne L765
L677:   iload_2
L678:   iload_1
L679:   iconst_1
L680:   isub
L681:   if_icmpne L692
L684:   iload_3
L685:   iload 7
L687:   if_icmpne L692
L690:   iconst_1
L691:   ireturn
L692:   iload_2
L693:   iload_1
L694:   if_icmpne L721
L697:   iload_3
L698:   iload 7
L700:   iconst_1
L701:   iadd
L702:   if_icmpne L721
L705:   aload_0
L706:   getfield Field FTPNODIB m [[I
L709:   iload_2
L710:   aaload
L711:   iload_3
L712:   iaload
L713:   ldc 19398944
L715:   iand
L716:   ifne L721
L719:   iconst_1
L720:   ireturn
L721:   iload_2
L722:   iload_1
L723:   iconst_1
L724:   iadd
L725:   if_icmpne L750
L728:   iload_3
L729:   iload 7
L731:   if_icmpne L750
L734:   aload_0
L735:   getfield Field FTPNODIB m [[I
L738:   iload_2
L739:   aaload
L740:   iload_3
L741:   iaload
L742:   ldc 19399040
L744:   iand
L745:   ifne L750
L748:   iconst_1
L749:   ireturn
L750:   iload_2
L751:   iload_1
L752:   if_icmpne L765
L755:   iload_3
L756:   iload 7
L758:   iconst_1
L759:   isub
L760:   if_icmpne L765
L763:   iconst_1
L764:   ireturn
L765:   iload 6
L767:   bipush 9
L769:   if_icmpne L888
L772:   iload_2
L773:   iload_1
L774:   if_icmpne L801
L777:   iload_3
L778:   iload 7
L780:   iconst_1
L781:   iadd
L782:   if_icmpne L801
L785:   aload_0
L786:   getfield Field FTPNODIB m [[I
L789:   iload_2
L790:   aaload
L791:   iload_3
L792:   iaload
L793:   bipush 32
L795:   iand
L796:   ifne L801
L799:   iconst_1
L800:   ireturn
L801:   iload_2
L802:   iload_1
L803:   if_icmpne L829
L806:   iload_3
L807:   iload 7
L809:   iconst_1
L810:   isub
L811:   if_icmpne L829
L814:   aload_0
L815:   getfield Field FTPNODIB m [[I
L818:   iload_2
L819:   aaload
L820:   iload_3
L821:   iaload
L822:   iconst_2
L823:   iand
L824:   ifne L829
L827:   iconst_1
L828:   ireturn
L829:   iload_2
L830:   iload_1
L831:   iconst_1
L832:   isub
L833:   if_icmpne L858
L836:   iload_3
L837:   iload 7
L839:   if_icmpne L858
L842:   aload_0
L843:   getfield Field FTPNODIB m [[I
L846:   iload_2
L847:   aaload
L848:   iload_3
L849:   iaload
L850:   bipush 8
L852:   iand
L853:   ifne L858
L856:   iconst_1
L857:   ireturn
L858:   iload_2
L859:   iload_1
L860:   iconst_1
L861:   iadd
L862:   if_icmpne L888
L865:   iload_3
L866:   iload 7
L868:   if_icmpne L888
L871:   aload_0
L872:   getfield Field FTPNODIB m [[I
L875:   iload_2
L876:   aaload
L877:   iload_3
L878:   iaload
L879:   sipush 128
L882:   iand
L883:   ifne L888
L886:   iconst_1
L887:   ireturn
L888:   iconst_0
L889:   ireturn
L890:   astore 8
L892:   new java/lang/StringBuffer
L895:   dup
L896:   ldc "46464, "
L898:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L901:   iload_1
L902:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L905:   ldc ", "
L907:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L910:   iload_2
L911:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L914:   ldc ", "
L916:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L919:   iload_3
L920:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L923:   ldc ", "
L925:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L928:   iload 4
L930:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L933:   ldc ", "
L935:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L938:   iload 5
L940:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L943:   ldc ", "
L945:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L948:   iload 6
L950:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L953:   ldc ", "
L955:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L958:   iload 7
L960:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L963:   ldc ", "
L965:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L968:   aload 8
L970:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L973:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L976:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L979:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L982:   new java/lang/RuntimeException
L985:   dup
L986:   invokespecial Method java/lang/RuntimeException <init> ()V
L989:   athrow
L990:   
    .end code
.end method

.method public b : (IIIIIII)Z
    .code stack 3 locals 9
        .catch java/lang/RuntimeException from L0 to L477 using L477
L0:     iload 7
L2:     ifeq L13
L5:     new java/lang/NullPointerException
L8:     dup
L9:     invokespecial Method java/lang/NullPointerException <init> ()V
L12:    athrow
L13:    iload 6
L15:    iload_1
L16:    if_icmpne L26
L19:    iload_3
L20:    iload_2
L21:    if_icmpne L26
L24:    iconst_1
L25:    ireturn
L26:    iload 6
L28:    aload_0
L29:    getfield Field FTPNODIB i I
L32:    isub
L33:    istore 6
L35:    iload_3
L36:    aload_0
L37:    getfield Field FTPNODIB j I
L40:    isub
L41:    istore_3
L42:    iload_1
L43:    aload_0
L44:    getfield Field FTPNODIB i I
L47:    isub
L48:    istore_1
L49:    iload_2
L50:    aload_0
L51:    getfield Field FTPNODIB j I
L54:    isub
L55:    istore_2
L56:    iload 4
L58:    bipush 6
L60:    if_icmpeq L70
L63:    iload 4
L65:    bipush 7
L67:    if_icmpne L348
L70:    iload 4
L72:    bipush 7
L74:    if_icmpne L85
L77:    iload 5
L79:    iconst_2
L80:    iadd
L81:    iconst_3
L82:    iand
L83:    istore 5
L85:    iload 5
L87:    ifne L150
L90:    iload 6
L92:    iload_1
L93:    iconst_1
L94:    iadd
L95:    if_icmpne L121
L98:    iload_3
L99:    iload_2
L100:   if_icmpne L121
L103:   aload_0
L104:   getfield Field FTPNODIB m [[I
L107:   iload 6
L109:   aaload
L110:   iload_3
L111:   iaload
L112:   sipush 128
L115:   iand
L116:   ifne L121
L119:   iconst_1
L120:   ireturn
L121:   iload 6
L123:   iload_1
L124:   if_icmpne L348
L127:   iload_3
L128:   iload_2
L129:   iconst_1
L130:   isub
L131:   if_icmpne L348
L134:   aload_0
L135:   getfield Field FTPNODIB m [[I
L138:   iload 6
L140:   aaload
L141:   iload_3
L142:   iaload
L143:   iconst_2
L144:   iand
L145:   ifne L348
L148:   iconst_1
L149:   ireturn
L150:   iload 5
L152:   iconst_1
L153:   if_icmpne L215
L156:   iload 6
L158:   iload_1
L159:   iconst_1
L160:   isub
L161:   if_icmpne L186
L164:   iload_3
L165:   iload_2
L166:   if_icmpne L186
L169:   aload_0
L170:   getfield Field FTPNODIB m [[I
L173:   iload 6
L175:   aaload
L176:   iload_3
L177:   iaload
L178:   bipush 8
L180:   iand
L181:   ifne L186
L184:   iconst_1
L185:   ireturn
L186:   iload 6
L188:   iload_1
L189:   if_icmpne L348
L192:   iload_3
L193:   iload_2
L194:   iconst_1
L195:   isub
L196:   if_icmpne L348
L199:   aload_0
L200:   getfield Field FTPNODIB m [[I
L203:   iload 6
L205:   aaload
L206:   iload_3
L207:   iaload
L208:   iconst_2
L209:   iand
L210:   ifne L348
L213:   iconst_1
L214:   ireturn
L215:   iload 5
L217:   iconst_2
L218:   if_icmpne L281
L221:   iload 6
L223:   iload_1
L224:   iconst_1
L225:   isub
L226:   if_icmpne L251
L229:   iload_3
L230:   iload_2
L231:   if_icmpne L251
L234:   aload_0
L235:   getfield Field FTPNODIB m [[I
L238:   iload 6
L240:   aaload
L241:   iload_3
L242:   iaload
L243:   bipush 8
L245:   iand
L246:   ifne L251
L249:   iconst_1
L250:   ireturn
L251:   iload 6
L253:   iload_1
L254:   if_icmpne L348
L257:   iload_3
L258:   iload_2
L259:   iconst_1
L260:   iadd
L261:   if_icmpne L348
L264:   aload_0
L265:   getfield Field FTPNODIB m [[I
L268:   iload 6
L270:   aaload
L271:   iload_3
L272:   iaload
L273:   bipush 32
L275:   iand
L276:   ifne L348
L279:   iconst_1
L280:   ireturn
L281:   iload 5
L283:   iconst_3
L284:   if_icmpne L348
L287:   iload 6
L289:   iload_1
L290:   iconst_1
L291:   iadd
L292:   if_icmpne L318
L295:   iload_3
L296:   iload_2
L297:   if_icmpne L318
L300:   aload_0
L301:   getfield Field FTPNODIB m [[I
L304:   iload 6
L306:   aaload
L307:   iload_3
L308:   iaload
L309:   sipush 128
L312:   iand
L313:   ifne L318
L316:   iconst_1
L317:   ireturn
L318:   iload 6
L320:   iload_1
L321:   if_icmpne L348
L324:   iload_3
L325:   iload_2
L326:   iconst_1
L327:   iadd
L328:   if_icmpne L348
L331:   aload_0
L332:   getfield Field FTPNODIB m [[I
L335:   iload 6
L337:   aaload
L338:   iload_3
L339:   iaload
L340:   bipush 32
L342:   iand
L343:   ifne L348
L346:   iconst_1
L347:   ireturn
L348:   iload 4
L350:   bipush 8
L352:   if_icmpne L475
L355:   iload 6
L357:   iload_1
L358:   if_icmpne L385
L361:   iload_3
L362:   iload_2
L363:   iconst_1
L364:   iadd
L365:   if_icmpne L385
L368:   aload_0
L369:   getfield Field FTPNODIB m [[I
L372:   iload 6
L374:   aaload
L375:   iload_3
L376:   iaload
L377:   bipush 32
L379:   iand
L380:   ifne L385
L383:   iconst_1
L384:   ireturn
L385:   iload 6
L387:   iload_1
L388:   if_icmpne L414
L391:   iload_3
L392:   iload_2
L393:   iconst_1
L394:   isub
L395:   if_icmpne L414
L398:   aload_0
L399:   getfield Field FTPNODIB m [[I
L402:   iload 6
L404:   aaload
L405:   iload_3
L406:   iaload
L407:   iconst_2
L408:   iand
L409:   ifne L414
L412:   iconst_1
L413:   ireturn
L414:   iload 6
L416:   iload_1
L417:   iconst_1
L418:   isub
L419:   if_icmpne L444
L422:   iload_3
L423:   iload_2
L424:   if_icmpne L444
L427:   aload_0
L428:   getfield Field FTPNODIB m [[I
L431:   iload 6
L433:   aaload
L434:   iload_3
L435:   iaload
L436:   bipush 8
L438:   iand
L439:   ifne L444
L442:   iconst_1
L443:   ireturn
L444:   iload 6
L446:   iload_1
L447:   iconst_1
L448:   iadd
L449:   if_icmpne L475
L452:   iload_3
L453:   iload_2
L454:   if_icmpne L475
L457:   aload_0
L458:   getfield Field FTPNODIB m [[I
L461:   iload 6
L463:   aaload
L464:   iload_3
L465:   iaload
L466:   sipush 128
L469:   iand
L470:   ifne L475
L473:   iconst_1
L474:   ireturn
L475:   iconst_0
L476:   ireturn
L477:   astore 8
L479:   new java/lang/StringBuffer
L482:   dup
L483:   ldc "67003, "
L485:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L488:   iload_1
L489:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L492:   ldc ", "
L494:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L497:   iload_2
L498:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L501:   ldc ", "
L503:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L506:   iload_3
L507:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L510:   ldc ", "
L512:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L515:   iload 4
L517:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L520:   ldc ", "
L522:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L525:   iload 5
L527:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L530:   ldc ", "
L532:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L535:   iload 6
L537:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L540:   ldc ", "
L542:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L545:   iload 7
L547:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L550:   ldc ", "
L552:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L555:   aload 8
L557:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L560:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L563:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L566:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L569:   new java/lang/RuntimeException
L572:   dup
L573:   invokespecial Method java/lang/RuntimeException <init> ()V
L576:   athrow
L577:   
    .end code
.end method

.method public a : (BIIIIIII)Z
    .code stack 3 locals 11
        .catch java/lang/RuntimeException from L0 to L286 using L286
L0:     iload_1
L1:     iconst_1
L2:     if_icmpeq L13
L5:     new java/lang/NullPointerException
L8:     dup
L9:     invokespecial Method java/lang/NullPointerException <init> ()V
L12:    athrow
L13:    iload_3
L14:    iload 7
L16:    iadd
L17:    iconst_1
L18:    isub
L19:    istore 9
L21:    iload_2
L22:    iload 5
L24:    iadd
L25:    iconst_1
L26:    isub
L27:    istore 10
L29:    iload 4
L31:    iload_3
L32:    if_icmplt L57
L35:    iload 4
L37:    iload 9
L39:    if_icmpgt L57
L42:    iload 8
L44:    iload_2
L45:    if_icmplt L57
L48:    iload 8
L50:    iload 10
L52:    if_icmpgt L57
L55:    iconst_1
L56:    ireturn
L57:    iload 4
L59:    iload_3
L60:    iconst_1
L61:    isub
L62:    if_icmpne L114
L65:    iload 8
L67:    iload_2
L68:    if_icmplt L114
L71:    iload 8
L73:    iload 10
L75:    if_icmpgt L114
L78:    aload_0
L79:    getfield Field FTPNODIB m [[I
L82:    iload 4
L84:    aload_0
L85:    getfield Field FTPNODIB i I
L88:    isub
L89:    aaload
L90:    iload 8
L92:    aload_0
L93:    getfield Field FTPNODIB j I
L96:    isub
L97:    iaload
L98:    bipush 8
L100:   iand
L101:   ifne L114
L104:   iload 6
L106:   bipush 8
L108:   iand
L109:   ifne L114
L112:   iconst_1
L113:   ireturn
L114:   iload 4
L116:   iload 9
L118:   iconst_1
L119:   iadd
L120:   if_icmpne L172
L123:   iload 8
L125:   iload_2
L126:   if_icmplt L172
L129:   iload 8
L131:   iload 10
L133:   if_icmpgt L172
L136:   aload_0
L137:   getfield Field FTPNODIB m [[I
L140:   iload 4
L142:   aload_0
L143:   getfield Field FTPNODIB i I
L146:   isub
L147:   aaload
L148:   iload 8
L150:   aload_0
L151:   getfield Field FTPNODIB j I
L154:   isub
L155:   iaload
L156:   sipush 128
L159:   iand
L160:   ifne L172
L163:   iload 6
L165:   iconst_2
L166:   iand
L167:   ifne L172
L170:   iconst_1
L171:   ireturn
L172:   iload 8
L174:   iload_2
L175:   iconst_1
L176:   isub
L177:   if_icmpne L227
L180:   iload 4
L182:   iload_3
L183:   if_icmplt L227
L186:   iload 4
L188:   iload 9
L190:   if_icmpgt L227
L193:   aload_0
L194:   getfield Field FTPNODIB m [[I
L197:   iload 4
L199:   aload_0
L200:   getfield Field FTPNODIB i I
L203:   isub
L204:   aaload
L205:   iload 8
L207:   aload_0
L208:   getfield Field FTPNODIB j I
L211:   isub
L212:   iaload
L213:   iconst_2
L214:   iand
L215:   ifne L227
L218:   iload 6
L220:   iconst_4
L221:   iand
L222:   ifne L227
L225:   iconst_1
L226:   ireturn
L227:   iload 8
L229:   iload 10
L231:   iconst_1
L232:   iadd
L233:   if_icmpne L284
L236:   iload 4
L238:   iload_3
L239:   if_icmplt L284
L242:   iload 4
L244:   iload 9
L246:   if_icmpgt L284
L249:   aload_0
L250:   getfield Field FTPNODIB m [[I
L253:   iload 4
L255:   aload_0
L256:   getfield Field FTPNODIB i I
L259:   isub
L260:   aaload
L261:   iload 8
L263:   aload_0
L264:   getfield Field FTPNODIB j I
L267:   isub
L268:   iaload
L269:   bipush 32
L271:   iand
L272:   ifne L284
L275:   iload 6
L277:   iconst_1
L278:   iand
L279:   ifne L284
L282:   iconst_1
L283:   ireturn
L284:   iconst_0
L285:   ireturn
L286:   astore 9
L288:   new java/lang/StringBuffer
L291:   dup
L292:   ldc "42625, "
L294:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L297:   iload_1
L298:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L301:   ldc ", "
L303:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L306:   iload_2
L307:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L310:   ldc ", "
L312:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L315:   iload_3
L316:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L319:   ldc ", "
L321:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L324:   iload 4
L326:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L329:   ldc ", "
L331:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L334:   iload 5
L336:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L339:   ldc ", "
L341:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L344:   iload 6
L346:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L349:   ldc ", "
L351:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L354:   iload 7
L356:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L359:   ldc ", "
L361:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L364:   iload 8
L366:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L369:   ldc ", "
L371:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L374:   aload 9
L376:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L379:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L382:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L385:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L388:   new java/lang/RuntimeException
L391:   dup
L392:   invokespecial Method java/lang/RuntimeException <init> ()V
L395:   athrow
L396:   
    .end code
.end method
.end class
