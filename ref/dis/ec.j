.version 45 3
.class public super ec
.super java/lang/Object
.field private a Z
.field private b I
.field private c B
.field private d I
.field private e Z
.field public f I
.field public g I
.field public h I
.field public i I
.field public j [[I

.method public <init> : (III)V
    .code stack 4 locals 5
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field ec a Z
L9:     aload_0
L10:    bipush 12
L12:    putfield Field ec c B
L15:    aload_0
L16:    sipush 27808
L19:    putfield Field ec d I
L22:    aload_0
L23:    iconst_1
L24:    putfield Field ec e Z
        .catch java/lang/RuntimeException from L27 to L95 using L96
L27:    getstatic Field jc p Z
L30:    ifeq L49
L33:    aload_0
L34:    aload_0
L35:    getfield Field ec e Z
L38:    ifeq L45
L41:    iconst_0
L42:    goto L46
L45:    iconst_1
L46:    putfield Field ec e Z
L49:    iload_2
L50:    ifge L33
L53:    aload_0
L54:    iconst_0
L55:    putfield Field ec f I
L58:    aload_0
L59:    iconst_0
L60:    putfield Field ec g I
L63:    aload_0
L64:    iload_1
L65:    putfield Field ec h I
L68:    aload_0
L69:    iload_3
L70:    putfield Field ec i I
L73:    aload_0
L74:    aload_0
L75:    getfield Field ec h I
L78:    aload_0
L79:    getfield Field ec i I
L82:    multianewarray [[I 2
L86:    putfield Field ec j [[I
L89:    aload_0
L90:    bipush 74
L92:    invokevirtual Method ec a (B)V
L95:    return
L96:    astore 4
L98:    new java/lang/StringBuffer
L101:   dup
L102:   ldc "56319, "
L104:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L107:   iload_1
L108:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L111:   ldc ", "
L113:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L116:   iload_2
L117:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L120:   ldc ", "
L122:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L125:   iload_3
L126:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L129:   ldc ", "
L131:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L134:   aload 4
L136:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L139:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L142:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L145:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L148:   new java/lang/RuntimeException
L151:   dup
L152:   invokespecial Method java/lang/RuntimeException <init> ()V
L155:   athrow
L156:   
    .end code
.end method

.method public a : (B)V
    .code stack 4 locals 5
L0:     getstatic Field jc p Z
L3:     istore 4
        .catch java/lang/RuntimeException from L5 to L113 using L114
L5:     iconst_0
L6:     istore_2
L7:     iload 4
L9:     ifeq L85
L12:    iconst_0
L13:    istore_3
L14:    iload 4
L16:    ifeq L74
L19:    iload_2
L20:    ifeq L47
L23:    iload_3
L24:    ifeq L47
L27:    iload_2
L28:    aload_0
L29:    getfield Field ec h I
L32:    iconst_1
L33:    isub
L34:    if_icmpeq L47
L37:    iload_3
L38:    aload_0
L39:    getfield Field ec i I
L42:    iconst_1
L43:    isub
L44:    if_icmpne L62
L47:    aload_0
L48:    getfield Field ec j [[I
L51:    iload_2
L52:    aaload
L53:    iload_3
L54:    ldc 16777215
L56:    iastore
L57:    iload 4
L59:    ifeq L71
L62:    aload_0
L63:    getfield Field ec j [[I
L66:    iload_2
L67:    aaload
L68:    iload_3
L69:    iconst_0
L70:    iastore
L71:    iinc 3 1
L74:    iload_3
L75:    aload_0
L76:    getfield Field ec i I
L79:    if_icmplt L19
L82:    iinc 2 1
L85:    iload_2
L86:    aload_0
L87:    getfield Field ec h I
L90:    if_icmplt L12
L93:    iload_1
L94:    bipush 74
L96:    if_icmpeq L154
L99:    iconst_1
L100:   istore_3
L101:   iload 4
L103:   ifeq L109
L106:   iinc 3 1
L109:   iload_3
L110:   ifgt L106
L113:   return
L114:   astore_2
L115:   new java/lang/StringBuffer
L118:   dup
L119:   ldc "82442, "
L121:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L124:   iload_1
L125:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L128:   ldc ", "
L130:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L133:   aload_2
L134:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L137:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L140:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L143:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L146:   new java/lang/RuntimeException
L149:   dup
L150:   invokespecial Method java/lang/RuntimeException <init> ()V
L153:   athrow
L154:   return
L155:   
    .end code
.end method

.method public a : (ZIIIZI)V
    .code stack 4 locals 8
        .catch java/lang/RuntimeException from L0 to L803 using L804
L0:     iload 4
L2:     aload_0
L3:     getfield Field ec f I
L6:     isub
L7:     istore 4
L9:     iload_1
L10:    ifne L29
L13:    aload_0
L14:    aload_0
L15:    getfield Field ec a Z
L18:    ifeq L25
L21:    iconst_0
L22:    goto L26
L25:    iconst_1
L26:    putfield Field ec a Z
L29:    iload_3
L30:    aload_0
L31:    getfield Field ec g I
L34:    isub
L35:    istore_3
L36:    iload 6
L38:    ifne L140
L41:    iload_2
L42:    ifne L66
L45:    aload_0
L46:    iload 4
L48:    iload_3
L49:    sipush 128
L52:    invokespecial Method ec a (III)V
L55:    aload_0
L56:    iload 4
L58:    iconst_1
L59:    isub
L60:    iload_3
L61:    bipush 8
L63:    invokespecial Method ec a (III)V
L66:    iload_2
L67:    iconst_1
L68:    if_icmpne L90
L71:    aload_0
L72:    iload 4
L74:    iload_3
L75:    iconst_2
L76:    invokespecial Method ec a (III)V
L79:    aload_0
L80:    iload 4
L82:    iload_3
L83:    iconst_1
L84:    iadd
L85:    bipush 32
L87:    invokespecial Method ec a (III)V
L90:    iload_2
L91:    iconst_2
L92:    if_icmpne L116
L95:    aload_0
L96:    iload 4
L98:    iload_3
L99:    bipush 8
L101:   invokespecial Method ec a (III)V
L104:   aload_0
L105:   iload 4
L107:   iconst_1
L108:   iadd
L109:   iload_3
L110:   sipush 128
L113:   invokespecial Method ec a (III)V
L116:   iload_2
L117:   iconst_3
L118:   if_icmpne L140
L121:   aload_0
L122:   iload 4
L124:   iload_3
L125:   bipush 32
L127:   invokespecial Method ec a (III)V
L130:   aload_0
L131:   iload 4
L133:   iload_3
L134:   iconst_1
L135:   isub
L136:   iconst_2
L137:   invokespecial Method ec a (III)V
L140:   iload 6
L142:   iconst_1
L143:   if_icmpeq L152
L146:   iload 6
L148:   iconst_3
L149:   if_icmpne L255
L152:   iload_2
L153:   ifne L177
L156:   aload_0
L157:   iload 4
L159:   iload_3
L160:   iconst_1
L161:   invokespecial Method ec a (III)V
L164:   aload_0
L165:   iload 4
L167:   iconst_1
L168:   isub
L169:   iload_3
L170:   iconst_1
L171:   iadd
L172:   bipush 16
L174:   invokespecial Method ec a (III)V
L177:   iload_2
L178:   iconst_1
L179:   if_icmpne L203
L182:   aload_0
L183:   iload 4
L185:   iload_3
L186:   iconst_4
L187:   invokespecial Method ec a (III)V
L190:   aload_0
L191:   iload 4
L193:   iconst_1
L194:   iadd
L195:   iload_3
L196:   iconst_1
L197:   iadd
L198:   bipush 64
L200:   invokespecial Method ec a (III)V
L203:   iload_2
L204:   iconst_2
L205:   if_icmpne L229
L208:   aload_0
L209:   iload 4
L211:   iload_3
L212:   bipush 16
L214:   invokespecial Method ec a (III)V
L217:   aload_0
L218:   iload 4
L220:   iconst_1
L221:   iadd
L222:   iload_3
L223:   iconst_1
L224:   isub
L225:   iconst_1
L226:   invokespecial Method ec a (III)V
L229:   iload_2
L230:   iconst_3
L231:   if_icmpne L255
L234:   aload_0
L235:   iload 4
L237:   iload_3
L238:   bipush 64
L240:   invokespecial Method ec a (III)V
L243:   aload_0
L244:   iload 4
L246:   iconst_1
L247:   isub
L248:   iload_3
L249:   iconst_1
L250:   isub
L251:   iconst_4
L252:   invokespecial Method ec a (III)V
L255:   iload 6
L257:   iconst_2
L258:   if_icmpne L406
L261:   iload_2
L262:   ifne L297
L265:   aload_0
L266:   iload 4
L268:   iload_3
L269:   sipush 130
L272:   invokespecial Method ec a (III)V
L275:   aload_0
L276:   iload 4
L278:   iconst_1
L279:   isub
L280:   iload_3
L281:   bipush 8
L283:   invokespecial Method ec a (III)V
L286:   aload_0
L287:   iload 4
L289:   iload_3
L290:   iconst_1
L291:   iadd
L292:   bipush 32
L294:   invokespecial Method ec a (III)V
L297:   iload_2
L298:   iconst_1
L299:   if_icmpne L334
L302:   aload_0
L303:   iload 4
L305:   iload_3
L306:   bipush 10
L308:   invokespecial Method ec a (III)V
L311:   aload_0
L312:   iload 4
L314:   iload_3
L315:   iconst_1
L316:   iadd
L317:   bipush 32
L319:   invokespecial Method ec a (III)V
L322:   aload_0
L323:   iload 4
L325:   iconst_1
L326:   iadd
L327:   iload_3
L328:   sipush 128
L331:   invokespecial Method ec a (III)V
L334:   iload_2
L335:   iconst_2
L336:   if_icmpne L370
L339:   aload_0
L340:   iload 4
L342:   iload_3
L343:   bipush 40
L345:   invokespecial Method ec a (III)V
L348:   aload_0
L349:   iload 4
L351:   iconst_1
L352:   iadd
L353:   iload_3
L354:   sipush 128
L357:   invokespecial Method ec a (III)V
L360:   aload_0
L361:   iload 4
L363:   iload_3
L364:   iconst_1
L365:   isub
L366:   iconst_2
L367:   invokespecial Method ec a (III)V
L370:   iload_2
L371:   iconst_3
L372:   if_icmpne L406
L375:   aload_0
L376:   iload 4
L378:   iload_3
L379:   sipush 160
L382:   invokespecial Method ec a (III)V
L385:   aload_0
L386:   iload 4
L388:   iload_3
L389:   iconst_1
L390:   isub
L391:   iconst_2
L392:   invokespecial Method ec a (III)V
L395:   aload_0
L396:   iload 4
L398:   iconst_1
L399:   isub
L400:   iload_3
L401:   bipush 8
L403:   invokespecial Method ec a (III)V
L406:   iload 5
L408:   ifeq L894
L411:   iload 6
L413:   ifne L521
L416:   iload_2
L417:   ifne L441
L420:   aload_0
L421:   iload 4
L423:   iload_3
L424:   ldc 65536
L426:   invokespecial Method ec a (III)V
L429:   aload_0
L430:   iload 4
L432:   iconst_1
L433:   isub
L434:   iload_3
L435:   sipush 4096
L438:   invokespecial Method ec a (III)V
L441:   iload_2
L442:   iconst_1
L443:   if_icmpne L468
L446:   aload_0
L447:   iload 4
L449:   iload_3
L450:   sipush 1024
L453:   invokespecial Method ec a (III)V
L456:   aload_0
L457:   iload 4
L459:   iload_3
L460:   iconst_1
L461:   iadd
L462:   sipush 16384
L465:   invokespecial Method ec a (III)V
L468:   iload_2
L469:   iconst_2
L470:   if_icmpne L494
L473:   aload_0
L474:   iload 4
L476:   iload_3
L477:   sipush 4096
L480:   invokespecial Method ec a (III)V
L483:   aload_0
L484:   iload 4
L486:   iconst_1
L487:   iadd
L488:   iload_3
L489:   ldc 65536
L491:   invokespecial Method ec a (III)V
L494:   iload_2
L495:   iconst_3
L496:   if_icmpne L521
L499:   aload_0
L500:   iload 4
L502:   iload_3
L503:   sipush 16384
L506:   invokespecial Method ec a (III)V
L509:   aload_0
L510:   iload 4
L512:   iload_3
L513:   iconst_1
L514:   isub
L515:   sipush 1024
L518:   invokespecial Method ec a (III)V
L521:   iload 6
L523:   iconst_1
L524:   if_icmpeq L533
L527:   iload 6
L529:   iconst_3
L530:   if_icmpne L646
L533:   iload_2
L534:   ifne L561
L537:   aload_0
L538:   iload 4
L540:   iload_3
L541:   sipush 512
L544:   invokespecial Method ec a (III)V
L547:   aload_0
L548:   iload 4
L550:   iconst_1
L551:   isub
L552:   iload_3
L553:   iconst_1
L554:   iadd
L555:   sipush 8192
L558:   invokespecial Method ec a (III)V
L561:   iload_2
L562:   iconst_1
L563:   if_icmpne L589
L566:   aload_0
L567:   iload 4
L569:   iload_3
L570:   sipush 2048
L573:   invokespecial Method ec a (III)V
L576:   aload_0
L577:   iload 4
L579:   iconst_1
L580:   iadd
L581:   iload_3
L582:   iconst_1
L583:   iadd
L584:   ldc 32768
L586:   invokespecial Method ec a (III)V
L589:   iload_2
L590:   iconst_2
L591:   if_icmpne L618
L594:   aload_0
L595:   iload 4
L597:   iload_3
L598:   sipush 8192
L601:   invokespecial Method ec a (III)V
L604:   aload_0
L605:   iload 4
L607:   iconst_1
L608:   iadd
L609:   iload_3
L610:   iconst_1
L611:   isub
L612:   sipush 512
L615:   invokespecial Method ec a (III)V
L618:   iload_2
L619:   iconst_3
L620:   if_icmpne L646
L623:   aload_0
L624:   iload 4
L626:   iload_3
L627:   ldc 32768
L629:   invokespecial Method ec a (III)V
L632:   aload_0
L633:   iload 4
L635:   iconst_1
L636:   isub
L637:   iload_3
L638:   iconst_1
L639:   isub
L640:   sipush 2048
L643:   invokespecial Method ec a (III)V
L646:   iload 6
L648:   iconst_2
L649:   if_icmpne L894
L652:   iload_2
L653:   ifne L689
L656:   aload_0
L657:   iload 4
L659:   iload_3
L660:   ldc 66560
L662:   invokespecial Method ec a (III)V
L665:   aload_0
L666:   iload 4
L668:   iconst_1
L669:   isub
L670:   iload_3
L671:   sipush 4096
L674:   invokespecial Method ec a (III)V
L677:   aload_0
L678:   iload 4
L680:   iload_3
L681:   iconst_1
L682:   iadd
L683:   sipush 16384
L686:   invokespecial Method ec a (III)V
L689:   iload_2
L690:   iconst_1
L691:   if_icmpne L727
L694:   aload_0
L695:   iload 4
L697:   iload_3
L698:   sipush 5120
L701:   invokespecial Method ec a (III)V
L704:   aload_0
L705:   iload 4
L707:   iload_3
L708:   iconst_1
L709:   iadd
L710:   sipush 16384
L713:   invokespecial Method ec a (III)V
L716:   aload_0
L717:   iload 4
L719:   iconst_1
L720:   iadd
L721:   iload_3
L722:   ldc 65536
L724:   invokespecial Method ec a (III)V
L727:   iload_2
L728:   iconst_2
L729:   if_icmpne L765
L732:   aload_0
L733:   iload 4
L735:   iload_3
L736:   sipush 20480
L739:   invokespecial Method ec a (III)V
L742:   aload_0
L743:   iload 4
L745:   iconst_1
L746:   iadd
L747:   iload_3
L748:   ldc 65536
L750:   invokespecial Method ec a (III)V
L753:   aload_0
L754:   iload 4
L756:   iload_3
L757:   iconst_1
L758:   isub
L759:   sipush 1024
L762:   invokespecial Method ec a (III)V
L765:   iload_2
L766:   iconst_3
L767:   if_icmpne L894
L770:   aload_0
L771:   iload 4
L773:   iload_3
L774:   ldc 81920
L776:   invokespecial Method ec a (III)V
L779:   aload_0
L780:   iload 4
L782:   iload_3
L783:   iconst_1
L784:   isub
L785:   sipush 1024
L788:   invokespecial Method ec a (III)V
L791:   aload_0
L792:   iload 4
L794:   iconst_1
L795:   isub
L796:   iload_3
L797:   sipush 4096
L800:   invokespecial Method ec a (III)V
L803:   return
L804:   astore 7
L806:   new java/lang/StringBuffer
L809:   dup
L810:   ldc "61774, "
L812:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L815:   iload_1
L816:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L819:   ldc ", "
L821:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L824:   iload_2
L825:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L828:   ldc ", "
L830:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L833:   iload_3
L834:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L837:   ldc ", "
L839:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L842:   iload 4
L844:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L847:   ldc ", "
L849:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L852:   iload 5
L854:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L857:   ldc ", "
L859:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L862:   iload 6
L864:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L867:   ldc ", "
L869:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L872:   aload 7
L874:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L877:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L880:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L883:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L886:   new java/lang/RuntimeException
L889:   dup
L890:   invokespecial Method java/lang/RuntimeException <init> ()V
L893:   athrow
L894:   return
L895:   
    .end code
.end method

.method public a : (IIIIIIZ)V
    .code stack 5 locals 12
L0:     getstatic Field jc p Z
L3:     istore 11
        .catch java/lang/RuntimeException from L5 to L161 using L162
L5:     sipush 256
L8:     istore 8
L10:    iload 7
L12:    ifeq L22
L15:    iload 8
L17:    ldc 131072
L19:    iadd
L20:    istore 8
L22:    iload 4
L24:    aload_0
L25:    getfield Field ec f I
L28:    isub
L29:    istore 4
L31:    iload 6
L33:    aload_0
L34:    getfield Field ec g I
L37:    isub
L38:    istore 6
L40:    iload_1
L41:    iconst_1
L42:    if_icmpeq L50
L45:    iload_1
L46:    iconst_3
L47:    if_icmpne L58
L50:    iload_3
L51:    istore 9
L53:    iload_2
L54:    istore_3
L55:    iload 9
L57:    istore_2
L58:    iload 4
L60:    istore 9
L62:    iload 11
L64:    ifeq L129
L67:    iload 9
L69:    iflt L126
L72:    iload 9
L74:    aload_0
L75:    getfield Field ec h I
L78:    if_icmpge L126
L81:    iload 6
L83:    istore 10
L85:    iload 11
L87:    ifeq L117
L90:    iload 10
L92:    iflt L114
L95:    iload 10
L97:    aload_0
L98:    getfield Field ec i I
L101:   if_icmpge L114
L104:   aload_0
L105:   iload 9
L107:   iload 10
L109:   iload 8
L111:   invokespecial Method ec a (III)V
L114:   iinc 10 1
L117:   iload 10
L119:   iload 6
L121:   iload_2
L122:   iadd
L123:   if_icmplt L90
L126:   iinc 9 1
L129:   iload 9
L131:   iload 4
L133:   iload_3
L134:   iadd
L135:   if_icmplt L67
L138:   iload 5
L140:   bipush 9
L142:   if_icmpeq L262
L145:   iconst_1
L146:   istore 10
L148:   iload 11
L150:   ifeq L156
L153:   iinc 10 1
L156:   iload 10
L158:   ifgt L153
L161:   return
L162:   astore 8
L164:   new java/lang/StringBuffer
L167:   dup
L168:   ldc "17129, "
L170:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L173:   iload_1
L174:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L177:   ldc ", "
L179:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L182:   iload_2
L183:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L186:   ldc ", "
L188:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L191:   iload_3
L192:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L195:   ldc ", "
L197:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L200:   iload 4
L202:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L205:   ldc ", "
L207:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L210:   iload 5
L212:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L215:   ldc ", "
L217:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L220:   iload 6
L222:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L225:   ldc ", "
L227:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L230:   iload 7
L232:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L235:   ldc ", "
L237:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L240:   aload 8
L242:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L245:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L248:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L251:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L254:   new java/lang/RuntimeException
L257:   dup
L258:   invokespecial Method java/lang/RuntimeException <init> ()V
L261:   athrow
L262:   return
L263:   
    .end code
.end method

.method public a : (BII)V
    .code stack 4 locals 5
        .catch java/lang/RuntimeException from L0 to L36 using L37
L0:     iload_1
L1:     aload_0
L2:     getfield Field ec c B
L5:     if_icmpeq L9
L8:     return
L9:     iload_3
L10:    aload_0
L11:    getfield Field ec f I
L14:    isub
L15:    istore_3
L16:    iload_2
L17:    aload_0
L18:    getfield Field ec g I
L21:    isub
L22:    istore_2
L23:    aload_0
L24:    getfield Field ec j [[I
L27:    iload_3
L28:    aaload
L29:    iload_2
L30:    dup2
L31:    iaload
L32:    ldc 2097152
L34:    ior
L35:    iastore
L36:    return
L37:    astore 4
L39:    new java/lang/StringBuffer
L42:    dup
L43:    ldc "23195, "
L45:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L48:    iload_1
L49:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L52:    ldc ", "
L54:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L57:    iload_2
L58:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L61:    ldc ", "
L63:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L66:    iload_3
L67:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L70:    ldc ", "
L72:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L75:    aload 4
L77:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L80:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L83:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L86:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L89:    new java/lang/RuntimeException
L92:    dup
L93:    invokespecial Method java/lang/RuntimeException <init> ()V
L96:    athrow
L97:    
    .end code
.end method

.method private a : (III)V
    .code stack 4 locals 4
L0:     aload_0
L1:     getfield Field ec j [[I
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

.method public a : (ZIIIII)V
    .code stack 5 locals 8
        .catch java/lang/RuntimeException from L0 to L901 using L902
L0:     bipush 9
L2:     iload 5
L4:     idiv
L5:     istore 5
L7:     iload_3
L8:     aload_0
L9:     getfield Field ec f I
L12:    isub
L13:    istore_3
L14:    iload 4
L16:    aload_0
L17:    getfield Field ec g I
L20:    isub
L21:    istore 4
L23:    iload 6
L25:    ifne L143
L28:    iload_2
L29:    ifne L57
L32:    aload_0
L33:    iload 4
L35:    bipush -9
L37:    iload_3
L38:    sipush 128
L41:    invokespecial Method ec a (IBII)V
L44:    aload_0
L45:    iload 4
L47:    bipush -9
L49:    iload_3
L50:    iconst_1
L51:    isub
L52:    bipush 8
L54:    invokespecial Method ec a (IBII)V
L57:    iload_2
L58:    iconst_1
L59:    if_icmpne L85
L62:    aload_0
L63:    iload 4
L65:    bipush -9
L67:    iload_3
L68:    iconst_2
L69:    invokespecial Method ec a (IBII)V
L72:    aload_0
L73:    iload 4
L75:    iconst_1
L76:    iadd
L77:    bipush -9
L79:    iload_3
L80:    bipush 32
L82:    invokespecial Method ec a (IBII)V
L85:    iload_2
L86:    iconst_2
L87:    if_icmpne L115
L90:    aload_0
L91:    iload 4
L93:    bipush -9
L95:    iload_3
L96:    bipush 8
L98:    invokespecial Method ec a (IBII)V
L101:   aload_0
L102:   iload 4
L104:   bipush -9
L106:   iload_3
L107:   iconst_1
L108:   iadd
L109:   sipush 128
L112:   invokespecial Method ec a (IBII)V
L115:   iload_2
L116:   iconst_3
L117:   if_icmpne L143
L120:   aload_0
L121:   iload 4
L123:   bipush -9
L125:   iload_3
L126:   bipush 32
L128:   invokespecial Method ec a (IBII)V
L131:   aload_0
L132:   iload 4
L134:   iconst_1
L135:   isub
L136:   bipush -9
L138:   iload_3
L139:   iconst_2
L140:   invokespecial Method ec a (IBII)V
L143:   iload 6
L145:   iconst_1
L146:   if_icmpeq L155
L149:   iload 6
L151:   iconst_3
L152:   if_icmpne L274
L155:   iload_2
L156:   ifne L184
L159:   aload_0
L160:   iload 4
L162:   bipush -9
L164:   iload_3
L165:   iconst_1
L166:   invokespecial Method ec a (IBII)V
L169:   aload_0
L170:   iload 4
L172:   iconst_1
L173:   iadd
L174:   bipush -9
L176:   iload_3
L177:   iconst_1
L178:   isub
L179:   bipush 16
L181:   invokespecial Method ec a (IBII)V
L184:   iload_2
L185:   iconst_1
L186:   if_icmpne L214
L189:   aload_0
L190:   iload 4
L192:   bipush -9
L194:   iload_3
L195:   iconst_4
L196:   invokespecial Method ec a (IBII)V
L199:   aload_0
L200:   iload 4
L202:   iconst_1
L203:   iadd
L204:   bipush -9
L206:   iload_3
L207:   iconst_1
L208:   iadd
L209:   bipush 64
L211:   invokespecial Method ec a (IBII)V
L214:   iload_2
L215:   iconst_2
L216:   if_icmpne L244
L219:   aload_0
L220:   iload 4
L222:   bipush -9
L224:   iload_3
L225:   bipush 16
L227:   invokespecial Method ec a (IBII)V
L230:   aload_0
L231:   iload 4
L233:   iconst_1
L234:   isub
L235:   bipush -9
L237:   iload_3
L238:   iconst_1
L239:   iadd
L240:   iconst_1
L241:   invokespecial Method ec a (IBII)V
L244:   iload_2
L245:   iconst_3
L246:   if_icmpne L274
L249:   aload_0
L250:   iload 4
L252:   bipush -9
L254:   iload_3
L255:   bipush 64
L257:   invokespecial Method ec a (IBII)V
L260:   aload_0
L261:   iload 4
L263:   iconst_1
L264:   isub
L265:   bipush -9
L267:   iload_3
L268:   iconst_1
L269:   isub
L270:   iconst_4
L271:   invokespecial Method ec a (IBII)V
L274:   iload 6
L276:   iconst_2
L277:   if_icmpne L449
L280:   iload_2
L281:   ifne L322
L284:   aload_0
L285:   iload 4
L287:   bipush -9
L289:   iload_3
L290:   sipush 130
L293:   invokespecial Method ec a (IBII)V
L296:   aload_0
L297:   iload 4
L299:   bipush -9
L301:   iload_3
L302:   iconst_1
L303:   isub
L304:   bipush 8
L306:   invokespecial Method ec a (IBII)V
L309:   aload_0
L310:   iload 4
L312:   iconst_1
L313:   iadd
L314:   bipush -9
L316:   iload_3
L317:   bipush 32
L319:   invokespecial Method ec a (IBII)V
L322:   iload_2
L323:   iconst_1
L324:   if_icmpne L365
L327:   aload_0
L328:   iload 4
L330:   bipush -9
L332:   iload_3
L333:   bipush 10
L335:   invokespecial Method ec a (IBII)V
L338:   aload_0
L339:   iload 4
L341:   iconst_1
L342:   iadd
L343:   bipush -9
L345:   iload_3
L346:   bipush 32
L348:   invokespecial Method ec a (IBII)V
L351:   aload_0
L352:   iload 4
L354:   bipush -9
L356:   iload_3
L357:   iconst_1
L358:   iadd
L359:   sipush 128
L362:   invokespecial Method ec a (IBII)V
L365:   iload_2
L366:   iconst_2
L367:   if_icmpne L407
L370:   aload_0
L371:   iload 4
L373:   bipush -9
L375:   iload_3
L376:   bipush 40
L378:   invokespecial Method ec a (IBII)V
L381:   aload_0
L382:   iload 4
L384:   bipush -9
L386:   iload_3
L387:   iconst_1
L388:   iadd
L389:   sipush 128
L392:   invokespecial Method ec a (IBII)V
L395:   aload_0
L396:   iload 4
L398:   iconst_1
L399:   isub
L400:   bipush -9
L402:   iload_3
L403:   iconst_2
L404:   invokespecial Method ec a (IBII)V
L407:   iload_2
L408:   iconst_3
L409:   if_icmpne L449
L412:   aload_0
L413:   iload 4
L415:   bipush -9
L417:   iload_3
L418:   sipush 160
L421:   invokespecial Method ec a (IBII)V
L424:   aload_0
L425:   iload 4
L427:   iconst_1
L428:   isub
L429:   bipush -9
L431:   iload_3
L432:   iconst_2
L433:   invokespecial Method ec a (IBII)V
L436:   aload_0
L437:   iload 4
L439:   bipush -9
L441:   iload_3
L442:   iconst_1
L443:   isub
L444:   bipush 8
L446:   invokespecial Method ec a (IBII)V
L449:   iload_1
L450:   ifeq L992
L453:   iload 6
L455:   ifne L579
L458:   iload_2
L459:   ifne L487
L462:   aload_0
L463:   iload 4
L465:   bipush -9
L467:   iload_3
L468:   ldc 65536
L470:   invokespecial Method ec a (IBII)V
L473:   aload_0
L474:   iload 4
L476:   bipush -9
L478:   iload_3
L479:   iconst_1
L480:   isub
L481:   sipush 4096
L484:   invokespecial Method ec a (IBII)V
L487:   iload_2
L488:   iconst_1
L489:   if_icmpne L518
L492:   aload_0
L493:   iload 4
L495:   bipush -9
L497:   iload_3
L498:   sipush 1024
L501:   invokespecial Method ec a (IBII)V
L504:   aload_0
L505:   iload 4
L507:   iconst_1
L508:   iadd
L509:   bipush -9
L511:   iload_3
L512:   sipush 16384
L515:   invokespecial Method ec a (IBII)V
L518:   iload_2
L519:   iconst_2
L520:   if_icmpne L548
L523:   aload_0
L524:   iload 4
L526:   bipush -9
L528:   iload_3
L529:   sipush 4096
L532:   invokespecial Method ec a (IBII)V
L535:   aload_0
L536:   iload 4
L538:   bipush -9
L540:   iload_3
L541:   iconst_1
L542:   iadd
L543:   ldc 65536
L545:   invokespecial Method ec a (IBII)V
L548:   iload_2
L549:   iconst_3
L550:   if_icmpne L579
L553:   aload_0
L554:   iload 4
L556:   bipush -9
L558:   iload_3
L559:   sipush 16384
L562:   invokespecial Method ec a (IBII)V
L565:   aload_0
L566:   iload 4
L568:   iconst_1
L569:   isub
L570:   bipush -9
L572:   iload_3
L573:   sipush 1024
L576:   invokespecial Method ec a (IBII)V
L579:   iload 6
L581:   iconst_1
L582:   if_icmpeq L591
L585:   iload 6
L587:   iconst_3
L588:   if_icmpne L720
L591:   iload_2
L592:   ifne L623
L595:   aload_0
L596:   iload 4
L598:   bipush -9
L600:   iload_3
L601:   sipush 512
L604:   invokespecial Method ec a (IBII)V
L607:   aload_0
L608:   iload 4
L610:   iconst_1
L611:   iadd
L612:   bipush -9
L614:   iload_3
L615:   iconst_1
L616:   isub
L617:   sipush 8192
L620:   invokespecial Method ec a (IBII)V
L623:   iload_2
L624:   iconst_1
L625:   if_icmpne L655
L628:   aload_0
L629:   iload 4
L631:   bipush -9
L633:   iload_3
L634:   sipush 2048
L637:   invokespecial Method ec a (IBII)V
L640:   aload_0
L641:   iload 4
L643:   iconst_1
L644:   iadd
L645:   bipush -9
L647:   iload_3
L648:   iconst_1
L649:   iadd
L650:   ldc 32768
L652:   invokespecial Method ec a (IBII)V
L655:   iload_2
L656:   iconst_2
L657:   if_icmpne L688
L660:   aload_0
L661:   iload 4
L663:   bipush -9
L665:   iload_3
L666:   sipush 8192
L669:   invokespecial Method ec a (IBII)V
L672:   aload_0
L673:   iload 4
L675:   iconst_1
L676:   isub
L677:   bipush -9
L679:   iload_3
L680:   iconst_1
L681:   iadd
L682:   sipush 512
L685:   invokespecial Method ec a (IBII)V
L688:   iload_2
L689:   iconst_3
L690:   if_icmpne L720
L693:   aload_0
L694:   iload 4
L696:   bipush -9
L698:   iload_3
L699:   ldc 32768
L701:   invokespecial Method ec a (IBII)V
L704:   aload_0
L705:   iload 4
L707:   iconst_1
L708:   isub
L709:   bipush -9
L711:   iload_3
L712:   iconst_1
L713:   isub
L714:   sipush 2048
L717:   invokespecial Method ec a (IBII)V
L720:   iload 6
L722:   iconst_2
L723:   if_icmpne L992
L726:   iload_2
L727:   ifne L769
L730:   aload_0
L731:   iload 4
L733:   bipush -9
L735:   iload_3
L736:   ldc 66560
L738:   invokespecial Method ec a (IBII)V
L741:   aload_0
L742:   iload 4
L744:   bipush -9
L746:   iload_3
L747:   iconst_1
L748:   isub
L749:   sipush 4096
L752:   invokespecial Method ec a (IBII)V
L755:   aload_0
L756:   iload 4
L758:   iconst_1
L759:   iadd
L760:   bipush -9
L762:   iload_3
L763:   sipush 16384
L766:   invokespecial Method ec a (IBII)V
L769:   iload_2
L770:   iconst_1
L771:   if_icmpne L813
L774:   aload_0
L775:   iload 4
L777:   bipush -9
L779:   iload_3
L780:   sipush 5120
L783:   invokespecial Method ec a (IBII)V
L786:   aload_0
L787:   iload 4
L789:   iconst_1
L790:   iadd
L791:   bipush -9
L793:   iload_3
L794:   sipush 16384
L797:   invokespecial Method ec a (IBII)V
L800:   aload_0
L801:   iload 4
L803:   bipush -9
L805:   iload_3
L806:   iconst_1
L807:   iadd
L808:   ldc 65536
L810:   invokespecial Method ec a (IBII)V
L813:   iload_2
L814:   iconst_2
L815:   if_icmpne L857
L818:   aload_0
L819:   iload 4
L821:   bipush -9
L823:   iload_3
L824:   sipush 20480
L827:   invokespecial Method ec a (IBII)V
L830:   aload_0
L831:   iload 4
L833:   bipush -9
L835:   iload_3
L836:   iconst_1
L837:   iadd
L838:   ldc 65536
L840:   invokespecial Method ec a (IBII)V
L843:   aload_0
L844:   iload 4
L846:   iconst_1
L847:   isub
L848:   bipush -9
L850:   iload_3
L851:   sipush 1024
L854:   invokespecial Method ec a (IBII)V
L857:   iload_2
L858:   iconst_3
L859:   if_icmpne L992
L862:   aload_0
L863:   iload 4
L865:   bipush -9
L867:   iload_3
L868:   ldc 81920
L870:   invokespecial Method ec a (IBII)V
L873:   aload_0
L874:   iload 4
L876:   iconst_1
L877:   isub
L878:   bipush -9
L880:   iload_3
L881:   sipush 1024
L884:   invokespecial Method ec a (IBII)V
L887:   aload_0
L888:   iload 4
L890:   bipush -9
L892:   iload_3
L893:   iconst_1
L894:   isub
L895:   sipush 4096
L898:   invokespecial Method ec a (IBII)V
L901:   return
L902:   astore 7
L904:   new java/lang/StringBuffer
L907:   dup
L908:   ldc "76395, "
L910:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L913:   iload_1
L914:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L917:   ldc ", "
L919:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L922:   iload_2
L923:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L926:   ldc ", "
L928:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L931:   iload_3
L932:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L935:   ldc ", "
L937:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L940:   iload 4
L942:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L945:   ldc ", "
L947:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L950:   iload 5
L952:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L955:   ldc ", "
L957:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L960:   iload 6
L962:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L965:   ldc ", "
L967:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L970:   aload 7
L972:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L975:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L978:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L981:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L984:   new java/lang/RuntimeException
L987:   dup
L988:   invokespecial Method java/lang/RuntimeException <init> ()V
L991:   athrow
L992:   return
L993:   
    .end code
.end method

.method public a : (IIIIZZI)V
    .code stack 6 locals 12
L0:     getstatic Field jc p Z
L3:     istore 11
        .catch java/lang/RuntimeException from L5 to L149 using L150
L5:     sipush 256
L8:     istore 8
L10:    iload 6
L12:    ifeq L22
L15:    iload 8
L17:    ldc 131072
L19:    iadd
L20:    istore 8
L22:    iload_2
L23:    aload_0
L24:    getfield Field ec f I
L27:    isub
L28:    istore_2
L29:    iload_1
L30:    aload_0
L31:    getfield Field ec g I
L34:    isub
L35:    istore_1
L36:    iload 5
L38:    ifne L47
L41:    aload_0
L42:    bipush 67
L44:    putfield Field ec b I
L47:    iload_3
L48:    iconst_1
L49:    if_icmpeq L57
L52:    iload_3
L53:    iconst_3
L54:    if_icmpne L69
L57:    iload 4
L59:    istore 9
L61:    iload 7
L63:    istore 4
L65:    iload 9
L67:    istore 7
L69:    iload_2
L70:    istore 9
L72:    iload 11
L74:    ifeq L140
L77:    iload 9
L79:    iflt L137
L82:    iload 9
L84:    aload_0
L85:    getfield Field ec h I
L88:    if_icmpge L137
L91:    iload_1
L92:    istore 10
L94:    iload 11
L96:    ifeq L128
L99:    iload 10
L101:   iflt L125
L104:   iload 10
L106:   aload_0
L107:   getfield Field ec i I
L110:   if_icmpge L125
L113:   aload_0
L114:   iload 10
L116:   bipush -9
L118:   iload 9
L120:   iload 8
L122:   invokespecial Method ec a (IBII)V
L125:   iinc 10 1
L128:   iload 10
L130:   iload_1
L131:   iload 7
L133:   iadd
L134:   if_icmplt L99
L137:   iinc 9 1
L140:   iload 9
L142:   iload_2
L143:   iload 4
L145:   iadd
L146:   if_icmplt L77
L149:   return
L150:   astore 8
L152:   new java/lang/StringBuffer
L155:   dup
L156:   ldc "21118, "
L158:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L161:   iload_1
L162:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L165:   ldc ", "
L167:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L170:   iload_2
L171:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L174:   ldc ", "
L176:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L179:   iload_3
L180:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L183:   ldc ", "
L185:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L188:   iload 4
L190:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L193:   ldc ", "
L195:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L198:   iload 5
L200:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L203:   ldc ", "
L205:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L208:   iload 6
L210:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L213:   ldc ", "
L215:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L218:   iload 7
L220:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L223:   ldc ", "
L225:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L228:   aload 8
L230:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L233:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L236:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L239:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L242:   new java/lang/RuntimeException
L245:   dup
L246:   invokespecial Method java/lang/RuntimeException <init> ()V
L249:   athrow
L250:   
    .end code
.end method

.method private a : (IBII)V
    .code stack 5 locals 6
        .catch java/lang/RuntimeException from L0 to L23 using L23
L0:     aload_0
L1:     getfield Field ec j [[I
L4:     iload_3
L5:     aaload
L6:     iload_1
L7:     dup2
L8:     iaload
L9:     ldc 16777215
L11:    iload 4
L13:    isub
L14:    iand
L15:    iastore
L16:    iload_2
L17:    bipush -9
L19:    if_icmpeq L93
L22:    return
L23:    astore 5
L25:    new java/lang/StringBuffer
L28:    dup
L29:    ldc "67253, "
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
L93:    return
L94:    
    .end code
.end method

.method public b : (III)V
    .code stack 4 locals 5
        .catch java/lang/RuntimeException from L0 to L32 using L33
L0:     iload_3
L1:     ifeq L5
L4:     return
L5:     iload_2
L6:     aload_0
L7:     getfield Field ec f I
L10:    isub
L11:    istore_2
L12:    iload_1
L13:    aload_0
L14:    getfield Field ec g I
L17:    isub
L18:    istore_1
L19:    aload_0
L20:    getfield Field ec j [[I
L23:    iload_2
L24:    aaload
L25:    iload_1
L26:    dup2
L27:    iaload
L28:    ldc 14680063
L30:    iand
L31:    iastore
L32:    return
L33:    astore 4
L35:    new java/lang/StringBuffer
L38:    dup
L39:    ldc "3785, "
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
        .catch java/lang/RuntimeException from L0 to L986 using L986
L0:     iload 7
L2:     iload 6
L4:     if_icmpne L15
L7:     iload 5
L9:     iload_3
L10:    if_icmpne L15
L13:    iconst_1
L14:    ireturn
L15:    iload 7
L17:    aload_0
L18:    getfield Field ec f I
L21:    isub
L22:    istore 7
L24:    iload 5
L26:    aload_0
L27:    getfield Field ec g I
L30:    isub
L31:    istore 5
L33:    iload_1
L34:    sipush -7517
L37:    if_icmpeq L48
L40:    new java/lang/NullPointerException
L43:    dup
L44:    invokespecial Method java/lang/NullPointerException <init> ()V
L47:    athrow
L48:    iload 6
L50:    aload_0
L51:    getfield Field ec f I
L54:    isub
L55:    istore 6
L57:    iload_3
L58:    aload_0
L59:    getfield Field ec g I
L62:    isub
L63:    istore_3
L64:    iload 4
L66:    ifne L420
L69:    iload_2
L70:    ifne L156
L73:    iload 7
L75:    iload 6
L77:    iconst_1
L78:    isub
L79:    if_icmpne L90
L82:    iload 5
L84:    iload_3
L85:    if_icmpne L90
L88:    iconst_1
L89:    ireturn
L90:    iload 7
L92:    iload 6
L94:    if_icmpne L123
L97:    iload 5
L99:    iload_3
L100:   iconst_1
L101:   iadd
L102:   if_icmpne L123
L105:   aload_0
L106:   getfield Field ec j [[I
L109:   iload 7
L111:   aaload
L112:   iload 5
L114:   iaload
L115:   ldc 2621728
L117:   iand
L118:   ifne L123
L121:   iconst_1
L122:   ireturn
L123:   iload 7
L125:   iload 6
L127:   if_icmpne L420
L130:   iload 5
L132:   iload_3
L133:   iconst_1
L134:   isub
L135:   if_icmpne L420
L138:   aload_0
L139:   getfield Field ec j [[I
L142:   iload 7
L144:   aaload
L145:   iload 5
L147:   iaload
L148:   ldc 2621698
L150:   iand
L151:   ifne L420
L154:   iconst_1
L155:   ireturn
L156:   iload_2
L157:   iconst_1
L158:   if_icmpne L244
L161:   iload 7
L163:   iload 6
L165:   if_icmpne L178
L168:   iload 5
L170:   iload_3
L171:   iconst_1
L172:   iadd
L173:   if_icmpne L178
L176:   iconst_1
L177:   ireturn
L178:   iload 7
L180:   iload 6
L182:   iconst_1
L183:   isub
L184:   if_icmpne L211
L187:   iload 5
L189:   iload_3
L190:   if_icmpne L211
L193:   aload_0
L194:   getfield Field ec j [[I
L197:   iload 7
L199:   aaload
L200:   iload 5
L202:   iaload
L203:   ldc 2621704
L205:   iand
L206:   ifne L211
L209:   iconst_1
L210:   ireturn
L211:   iload 7
L213:   iload 6
L215:   iconst_1
L216:   iadd
L217:   if_icmpne L420
L220:   iload 5
L222:   iload_3
L223:   if_icmpne L420
L226:   aload_0
L227:   getfield Field ec j [[I
L230:   iload 7
L232:   aaload
L233:   iload 5
L235:   iaload
L236:   ldc 2621824
L238:   iand
L239:   ifne L420
L242:   iconst_1
L243:   ireturn
L244:   iload_2
L245:   iconst_2
L246:   if_icmpne L332
L249:   iload 7
L251:   iload 6
L253:   iconst_1
L254:   iadd
L255:   if_icmpne L266
L258:   iload 5
L260:   iload_3
L261:   if_icmpne L266
L264:   iconst_1
L265:   ireturn
L266:   iload 7
L268:   iload 6
L270:   if_icmpne L299
L273:   iload 5
L275:   iload_3
L276:   iconst_1
L277:   iadd
L278:   if_icmpne L299
L281:   aload_0
L282:   getfield Field ec j [[I
L285:   iload 7
L287:   aaload
L288:   iload 5
L290:   iaload
L291:   ldc 2621728
L293:   iand
L294:   ifne L299
L297:   iconst_1
L298:   ireturn
L299:   iload 7
L301:   iload 6
L303:   if_icmpne L420
L306:   iload 5
L308:   iload_3
L309:   iconst_1
L310:   isub
L311:   if_icmpne L420
L314:   aload_0
L315:   getfield Field ec j [[I
L318:   iload 7
L320:   aaload
L321:   iload 5
L323:   iaload
L324:   ldc 2621698
L326:   iand
L327:   ifne L420
L330:   iconst_1
L331:   ireturn
L332:   iload_2
L333:   iconst_3
L334:   if_icmpne L420
L337:   iload 7
L339:   iload 6
L341:   if_icmpne L354
L344:   iload 5
L346:   iload_3
L347:   iconst_1
L348:   isub
L349:   if_icmpne L354
L352:   iconst_1
L353:   ireturn
L354:   iload 7
L356:   iload 6
L358:   iconst_1
L359:   isub
L360:   if_icmpne L387
L363:   iload 5
L365:   iload_3
L366:   if_icmpne L387
L369:   aload_0
L370:   getfield Field ec j [[I
L373:   iload 7
L375:   aaload
L376:   iload 5
L378:   iaload
L379:   ldc 2621704
L381:   iand
L382:   ifne L387
L385:   iconst_1
L386:   ireturn
L387:   iload 7
L389:   iload 6
L391:   iconst_1
L392:   iadd
L393:   if_icmpne L420
L396:   iload 5
L398:   iload_3
L399:   if_icmpne L420
L402:   aload_0
L403:   getfield Field ec j [[I
L406:   iload 7
L408:   aaload
L409:   iload 5
L411:   iaload
L412:   ldc 2621824
L414:   iand
L415:   ifne L420
L418:   iconst_1
L419:   ireturn
L420:   iload 4
L422:   iconst_2
L423:   if_icmpne L845
L426:   iload_2
L427:   ifne L530
L430:   iload 7
L432:   iload 6
L434:   iconst_1
L435:   isub
L436:   if_icmpne L447
L439:   iload 5
L441:   iload_3
L442:   if_icmpne L447
L445:   iconst_1
L446:   ireturn
L447:   iload 7
L449:   iload 6
L451:   if_icmpne L464
L454:   iload 5
L456:   iload_3
L457:   iconst_1
L458:   iadd
L459:   if_icmpne L464
L462:   iconst_1
L463:   ireturn
L464:   iload 7
L466:   iload 6
L468:   iconst_1
L469:   iadd
L470:   if_icmpne L497
L473:   iload 5
L475:   iload_3
L476:   if_icmpne L497
L479:   aload_0
L480:   getfield Field ec j [[I
L483:   iload 7
L485:   aaload
L486:   iload 5
L488:   iaload
L489:   ldc 2621824
L491:   iand
L492:   ifne L497
L495:   iconst_1
L496:   ireturn
L497:   iload 7
L499:   iload 6
L501:   if_icmpne L845
L504:   iload 5
L506:   iload_3
L507:   iconst_1
L508:   isub
L509:   if_icmpne L845
L512:   aload_0
L513:   getfield Field ec j [[I
L516:   iload 7
L518:   aaload
L519:   iload 5
L521:   iaload
L522:   ldc 2621698
L524:   iand
L525:   ifne L845
L528:   iconst_1
L529:   ireturn
L530:   iload_2
L531:   iconst_1
L532:   if_icmpne L635
L535:   iload 7
L537:   iload 6
L539:   iconst_1
L540:   isub
L541:   if_icmpne L568
L544:   iload 5
L546:   iload_3
L547:   if_icmpne L568
L550:   aload_0
L551:   getfield Field ec j [[I
L554:   iload 7
L556:   aaload
L557:   iload 5
L559:   iaload
L560:   ldc 2621704
L562:   iand
L563:   ifne L568
L566:   iconst_1
L567:   ireturn
L568:   iload 7
L570:   iload 6
L572:   if_icmpne L585
L575:   iload 5
L577:   iload_3
L578:   iconst_1
L579:   iadd
L580:   if_icmpne L585
L583:   iconst_1
L584:   ireturn
L585:   iload 7
L587:   iload 6
L589:   iconst_1
L590:   iadd
L591:   if_icmpne L602
L594:   iload 5
L596:   iload_3
L597:   if_icmpne L602
L600:   iconst_1
L601:   ireturn
L602:   iload 7
L604:   iload 6
L606:   if_icmpne L845
L609:   iload 5
L611:   iload_3
L612:   iconst_1
L613:   isub
L614:   if_icmpne L845
L617:   aload_0
L618:   getfield Field ec j [[I
L621:   iload 7
L623:   aaload
L624:   iload 5
L626:   iaload
L627:   ldc 2621698
L629:   iand
L630:   ifne L845
L633:   iconst_1
L634:   ireturn
L635:   iload_2
L636:   iconst_2
L637:   if_icmpne L740
L640:   iload 7
L642:   iload 6
L644:   iconst_1
L645:   isub
L646:   if_icmpne L673
L649:   iload 5
L651:   iload_3
L652:   if_icmpne L673
L655:   aload_0
L656:   getfield Field ec j [[I
L659:   iload 7
L661:   aaload
L662:   iload 5
L664:   iaload
L665:   ldc 2621704
L667:   iand
L668:   ifne L673
L671:   iconst_1
L672:   ireturn
L673:   iload 7
L675:   iload 6
L677:   if_icmpne L706
L680:   iload 5
L682:   iload_3
L683:   iconst_1
L684:   iadd
L685:   if_icmpne L706
L688:   aload_0
L689:   getfield Field ec j [[I
L692:   iload 7
L694:   aaload
L695:   iload 5
L697:   iaload
L698:   ldc 2621728
L700:   iand
L701:   ifne L706
L704:   iconst_1
L705:   ireturn
L706:   iload 7
L708:   iload 6
L710:   iconst_1
L711:   iadd
L712:   if_icmpne L723
L715:   iload 5
L717:   iload_3
L718:   if_icmpne L723
L721:   iconst_1
L722:   ireturn
L723:   iload 7
L725:   iload 6
L727:   if_icmpne L845
L730:   iload 5
L732:   iload_3
L733:   iconst_1
L734:   isub
L735:   if_icmpne L845
L738:   iconst_1
L739:   ireturn
L740:   iload_2
L741:   iconst_3
L742:   if_icmpne L845
L745:   iload 7
L747:   iload 6
L749:   iconst_1
L750:   isub
L751:   if_icmpne L762
L754:   iload 5
L756:   iload_3
L757:   if_icmpne L762
L760:   iconst_1
L761:   ireturn
L762:   iload 7
L764:   iload 6
L766:   if_icmpne L795
L769:   iload 5
L771:   iload_3
L772:   iconst_1
L773:   iadd
L774:   if_icmpne L795
L777:   aload_0
L778:   getfield Field ec j [[I
L781:   iload 7
L783:   aaload
L784:   iload 5
L786:   iaload
L787:   ldc 2621728
L789:   iand
L790:   ifne L795
L793:   iconst_1
L794:   ireturn
L795:   iload 7
L797:   iload 6
L799:   iconst_1
L800:   iadd
L801:   if_icmpne L828
L804:   iload 5
L806:   iload_3
L807:   if_icmpne L828
L810:   aload_0
L811:   getfield Field ec j [[I
L814:   iload 7
L816:   aaload
L817:   iload 5
L819:   iaload
L820:   ldc 2621824
L822:   iand
L823:   ifne L828
L826:   iconst_1
L827:   ireturn
L828:   iload 7
L830:   iload 6
L832:   if_icmpne L845
L835:   iload 5
L837:   iload_3
L838:   iconst_1
L839:   isub
L840:   if_icmpne L845
L843:   iconst_1
L844:   ireturn
L845:   iload 4
L847:   bipush 9
L849:   if_icmpne L984
L852:   iload 7
L854:   iload 6
L856:   if_icmpne L885
L859:   iload 5
L861:   iload_3
L862:   iconst_1
L863:   iadd
L864:   if_icmpne L885
L867:   aload_0
L868:   getfield Field ec j [[I
L871:   iload 7
L873:   aaload
L874:   iload 5
L876:   iaload
L877:   bipush 32
L879:   iand
L880:   ifne L885
L883:   iconst_1
L884:   ireturn
L885:   iload 7
L887:   iload 6
L889:   if_icmpne L917
L892:   iload 5
L894:   iload_3
L895:   iconst_1
L896:   isub
L897:   if_icmpne L917
L900:   aload_0
L901:   getfield Field ec j [[I
L904:   iload 7
L906:   aaload
L907:   iload 5
L909:   iaload
L910:   iconst_2
L911:   iand
L912:   ifne L917
L915:   iconst_1
L916:   ireturn
L917:   iload 7
L919:   iload 6
L921:   iconst_1
L922:   isub
L923:   if_icmpne L950
L926:   iload 5
L928:   iload_3
L929:   if_icmpne L950
L932:   aload_0
L933:   getfield Field ec j [[I
L936:   iload 7
L938:   aaload
L939:   iload 5
L941:   iaload
L942:   bipush 8
L944:   iand
L945:   ifne L950
L948:   iconst_1
L949:   ireturn
L950:   iload 7
L952:   iload 6
L954:   iconst_1
L955:   iadd
L956:   if_icmpne L984
L959:   iload 5
L961:   iload_3
L962:   if_icmpne L984
L965:   aload_0
L966:   getfield Field ec j [[I
L969:   iload 7
L971:   aaload
L972:   iload 5
L974:   iaload
L975:   sipush 128
L978:   iand
L979:   ifne L984
L982:   iconst_1
L983:   ireturn
L984:   iconst_0
L985:   ireturn
L986:   astore 8
L988:   new java/lang/StringBuffer
L991:   dup
L992:   ldc "67481, "
L994:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L997:   iload_1
L998:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1001:  ldc ", "
L1003:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1006:  iload_2
L1007:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1010:  ldc ", "
L1012:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1015:  iload_3
L1016:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1019:  ldc ", "
L1021:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1024:  iload 4
L1026:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1029:  ldc ", "
L1031:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1034:  iload 5
L1036:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1039:  ldc ", "
L1041:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1044:  iload 6
L1046:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1049:  ldc ", "
L1051:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1054:  iload 7
L1056:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1059:  ldc ", "
L1061:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1064:  aload 8
L1066:  invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L1069:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1072:  invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L1075:  invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L1078:  new java/lang/RuntimeException
L1081:  dup
L1082:  invokespecial Method java/lang/RuntimeException <init> ()V
L1085:  athrow
L1086:  
    .end code
.end method

.method public b : (IIIIIII)Z
    .code stack 3 locals 9
        .catch java/lang/RuntimeException from L0 to L526 using L526
L0:     iload_3
L1:     aload_0
L2:     getfield Field ec d I
L5:     if_icmpeq L15
L8:     aload_0
L9:     sipush -218
L12:    putfield Field ec b I
L15:    iload 4
L17:    iload 5
L19:    if_icmpne L31
L22:    iload 6
L24:    iload 7
L26:    if_icmpne L31
L29:    iconst_1
L30:    ireturn
L31:    iload 4
L33:    aload_0
L34:    getfield Field ec f I
L37:    isub
L38:    istore 4
L40:    iload 6
L42:    aload_0
L43:    getfield Field ec g I
L46:    isub
L47:    istore 6
L49:    iload 5
L51:    aload_0
L52:    getfield Field ec f I
L55:    isub
L56:    istore 5
L58:    iload 7
L60:    aload_0
L61:    getfield Field ec g I
L64:    isub
L65:    istore 7
L67:    iload_2
L68:    bipush 6
L70:    if_icmpeq L79
L73:    iload_2
L74:    bipush 7
L76:    if_icmpne L382
L79:    iload_2
L80:    bipush 7
L82:    if_icmpne L91
L85:    iload_1
L86:    iconst_2
L87:    iadd
L88:    iconst_3
L89:    iand
L90:    istore_1
L91:    iload_1
L92:    ifne L163
L95:    iload 4
L97:    iload 5
L99:    iconst_1
L100:   iadd
L101:   if_icmpne L130
L104:   iload 6
L106:   iload 7
L108:   if_icmpne L130
L111:   aload_0
L112:   getfield Field ec j [[I
L115:   iload 4
L117:   aaload
L118:   iload 6
L120:   iaload
L121:   sipush 128
L124:   iand
L125:   ifne L130
L128:   iconst_1
L129:   ireturn
L130:   iload 4
L132:   iload 5
L134:   if_icmpne L382
L137:   iload 6
L139:   iload 7
L141:   iconst_1
L142:   isub
L143:   if_icmpne L382
L146:   aload_0
L147:   getfield Field ec j [[I
L150:   iload 4
L152:   aaload
L153:   iload 6
L155:   iaload
L156:   iconst_2
L157:   iand
L158:   ifne L382
L161:   iconst_1
L162:   ireturn
L163:   iload_1
L164:   iconst_1
L165:   if_icmpne L235
L168:   iload 4
L170:   iload 5
L172:   iconst_1
L173:   isub
L174:   if_icmpne L202
L177:   iload 6
L179:   iload 7
L181:   if_icmpne L202
L184:   aload_0
L185:   getfield Field ec j [[I
L188:   iload 4
L190:   aaload
L191:   iload 6
L193:   iaload
L194:   bipush 8
L196:   iand
L197:   ifne L202
L200:   iconst_1
L201:   ireturn
L202:   iload 4
L204:   iload 5
L206:   if_icmpne L382
L209:   iload 6
L211:   iload 7
L213:   iconst_1
L214:   isub
L215:   if_icmpne L382
L218:   aload_0
L219:   getfield Field ec j [[I
L222:   iload 4
L224:   aaload
L225:   iload 6
L227:   iaload
L228:   iconst_2
L229:   iand
L230:   ifne L382
L233:   iconst_1
L234:   ireturn
L235:   iload_1
L236:   iconst_2
L237:   if_icmpne L308
L240:   iload 4
L242:   iload 5
L244:   iconst_1
L245:   isub
L246:   if_icmpne L274
L249:   iload 6
L251:   iload 7
L253:   if_icmpne L274
L256:   aload_0
L257:   getfield Field ec j [[I
L260:   iload 4
L262:   aaload
L263:   iload 6
L265:   iaload
L266:   bipush 8
L268:   iand
L269:   ifne L274
L272:   iconst_1
L273:   ireturn
L274:   iload 4
L276:   iload 5
L278:   if_icmpne L382
L281:   iload 6
L283:   iload 7
L285:   iconst_1
L286:   iadd
L287:   if_icmpne L382
L290:   aload_0
L291:   getfield Field ec j [[I
L294:   iload 4
L296:   aaload
L297:   iload 6
L299:   iaload
L300:   bipush 32
L302:   iand
L303:   ifne L382
L306:   iconst_1
L307:   ireturn
L308:   iload_1
L309:   iconst_3
L310:   if_icmpne L382
L313:   iload 4
L315:   iload 5
L317:   iconst_1
L318:   iadd
L319:   if_icmpne L348
L322:   iload 6
L324:   iload 7
L326:   if_icmpne L348
L329:   aload_0
L330:   getfield Field ec j [[I
L333:   iload 4
L335:   aaload
L336:   iload 6
L338:   iaload
L339:   sipush 128
L342:   iand
L343:   ifne L348
L346:   iconst_1
L347:   ireturn
L348:   iload 4
L350:   iload 5
L352:   if_icmpne L382
L355:   iload 6
L357:   iload 7
L359:   iconst_1
L360:   iadd
L361:   if_icmpne L382
L364:   aload_0
L365:   getfield Field ec j [[I
L368:   iload 4
L370:   aaload
L371:   iload 6
L373:   iaload
L374:   bipush 32
L376:   iand
L377:   ifne L382
L380:   iconst_1
L381:   ireturn
L382:   iload_2
L383:   bipush 8
L385:   if_icmpne L524
L388:   iload 4
L390:   iload 5
L392:   if_icmpne L422
L395:   iload 6
L397:   iload 7
L399:   iconst_1
L400:   iadd
L401:   if_icmpne L422
L404:   aload_0
L405:   getfield Field ec j [[I
L408:   iload 4
L410:   aaload
L411:   iload 6
L413:   iaload
L414:   bipush 32
L416:   iand
L417:   ifne L422
L420:   iconst_1
L421:   ireturn
L422:   iload 4
L424:   iload 5
L426:   if_icmpne L455
L429:   iload 6
L431:   iload 7
L433:   iconst_1
L434:   isub
L435:   if_icmpne L455
L438:   aload_0
L439:   getfield Field ec j [[I
L442:   iload 4
L444:   aaload
L445:   iload 6
L447:   iaload
L448:   iconst_2
L449:   iand
L450:   ifne L455
L453:   iconst_1
L454:   ireturn
L455:   iload 4
L457:   iload 5
L459:   iconst_1
L460:   isub
L461:   if_icmpne L489
L464:   iload 6
L466:   iload 7
L468:   if_icmpne L489
L471:   aload_0
L472:   getfield Field ec j [[I
L475:   iload 4
L477:   aaload
L478:   iload 6
L480:   iaload
L481:   bipush 8
L483:   iand
L484:   ifne L489
L487:   iconst_1
L488:   ireturn
L489:   iload 4
L491:   iload 5
L493:   iconst_1
L494:   iadd
L495:   if_icmpne L524
L498:   iload 6
L500:   iload 7
L502:   if_icmpne L524
L505:   aload_0
L506:   getfield Field ec j [[I
L509:   iload 4
L511:   aaload
L512:   iload 6
L514:   iaload
L515:   sipush 128
L518:   iand
L519:   ifne L524
L522:   iconst_1
L523:   ireturn
L524:   iconst_0
L525:   ireturn
L526:   astore 8
L528:   new java/lang/StringBuffer
L531:   dup
L532:   ldc "20247, "
L534:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L537:   iload_1
L538:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L541:   ldc ", "
L543:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L546:   iload_2
L547:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L550:   ldc ", "
L552:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L555:   iload_3
L556:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L559:   ldc ", "
L561:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L564:   iload 4
L566:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L569:   ldc ", "
L571:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L574:   iload 5
L576:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L579:   ldc ", "
L581:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L584:   iload 6
L586:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L589:   ldc ", "
L591:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L594:   iload 7
L596:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L599:   ldc ", "
L601:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L604:   aload 8
L606:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L609:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L612:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L615:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L618:   new java/lang/RuntimeException
L621:   dup
L622:   invokespecial Method java/lang/RuntimeException <init> ()V
L625:   athrow
L626:   
    .end code
.end method

.method public a : (IIIIIIII)Z
    .code stack 3 locals 11
        .catch java/lang/RuntimeException from L0 to L265 using L265
L0:     iload 4
L2:     iload 7
L4:     iadd
L5:     iconst_1
L6:     isub
L7:     istore 9
L9:     iload 6
L11:    iload_2
L12:    iadd
L13:    iconst_1
L14:    isub
L15:    istore 10
L17:    bipush 17
L19:    iload 8
L21:    idiv
L22:    istore 8
L24:    iload_3
L25:    iload 4
L27:    if_icmplt L50
L30:    iload_3
L31:    iload 9
L33:    if_icmpgt L50
L36:    iload_1
L37:    iload 6
L39:    if_icmplt L50
L42:    iload_1
L43:    iload 10
L45:    if_icmpgt L50
L48:    iconst_1
L49:    ireturn
L50:    iload_3
L51:    iload 4
L53:    iconst_1
L54:    isub
L55:    if_icmpne L104
L58:    iload_1
L59:    iload 6
L61:    if_icmplt L104
L64:    iload_1
L65:    iload 10
L67:    if_icmpgt L104
L70:    aload_0
L71:    getfield Field ec j [[I
L74:    iload_3
L75:    aload_0
L76:    getfield Field ec f I
L79:    isub
L80:    aaload
L81:    iload_1
L82:    aload_0
L83:    getfield Field ec g I
L86:    isub
L87:    iaload
L88:    bipush 8
L90:    iand
L91:    ifne L104
L94:    iload 5
L96:    bipush 8
L98:    iand
L99:    ifne L104
L102:   iconst_1
L103:   ireturn
L104:   iload_3
L105:   iload 9
L107:   iconst_1
L108:   iadd
L109:   if_icmpne L158
L112:   iload_1
L113:   iload 6
L115:   if_icmplt L158
L118:   iload_1
L119:   iload 10
L121:   if_icmpgt L158
L124:   aload_0
L125:   getfield Field ec j [[I
L128:   iload_3
L129:   aload_0
L130:   getfield Field ec f I
L133:   isub
L134:   aaload
L135:   iload_1
L136:   aload_0
L137:   getfield Field ec g I
L140:   isub
L141:   iaload
L142:   sipush 128
L145:   iand
L146:   ifne L158
L149:   iload 5
L151:   iconst_2
L152:   iand
L153:   ifne L158
L156:   iconst_1
L157:   ireturn
L158:   iload_1
L159:   iload 6
L161:   iconst_1
L162:   isub
L163:   if_icmpne L210
L166:   iload_3
L167:   iload 4
L169:   if_icmplt L210
L172:   iload_3
L173:   iload 9
L175:   if_icmpgt L210
L178:   aload_0
L179:   getfield Field ec j [[I
L182:   iload_3
L183:   aload_0
L184:   getfield Field ec f I
L187:   isub
L188:   aaload
L189:   iload_1
L190:   aload_0
L191:   getfield Field ec g I
L194:   isub
L195:   iaload
L196:   iconst_2
L197:   iand
L198:   ifne L210
L201:   iload 5
L203:   iconst_4
L204:   iand
L205:   ifne L210
L208:   iconst_1
L209:   ireturn
L210:   iload_1
L211:   iload 10
L213:   iconst_1
L214:   iadd
L215:   if_icmpne L263
L218:   iload_3
L219:   iload 4
L221:   if_icmplt L263
L224:   iload_3
L225:   iload 9
L227:   if_icmpgt L263
L230:   aload_0
L231:   getfield Field ec j [[I
L234:   iload_3
L235:   aload_0
L236:   getfield Field ec f I
L239:   isub
L240:   aaload
L241:   iload_1
L242:   aload_0
L243:   getfield Field ec g I
L246:   isub
L247:   iaload
L248:   bipush 32
L250:   iand
L251:   ifne L263
L254:   iload 5
L256:   iconst_1
L257:   iand
L258:   ifne L263
L261:   iconst_1
L262:   ireturn
L263:   iconst_0
L264:   ireturn
L265:   astore 9
L267:   new java/lang/StringBuffer
L270:   dup
L271:   ldc "71488, "
L273:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L276:   iload_1
L277:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L280:   ldc ", "
L282:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L285:   iload_2
L286:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L289:   ldc ", "
L291:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L294:   iload_3
L295:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L298:   ldc ", "
L300:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L303:   iload 4
L305:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L308:   ldc ", "
L310:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L313:   iload 5
L315:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L318:   ldc ", "
L320:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L323:   iload 6
L325:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L328:   ldc ", "
L330:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L333:   iload 7
L335:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L338:   ldc ", "
L340:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L343:   iload 8
L345:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L348:   ldc ", "
L350:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L353:   aload 9
L355:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L358:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L361:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L364:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L367:   new java/lang/RuntimeException
L370:   dup
L371:   invokespecial Method java/lang/RuntimeException <init> ()V
L374:   athrow
L375:   
    .end code
.end method
.end class
