.version 45 3
.class public final super tb
.super java/lang/Object
.field private a I
.field private b [I
.field private c [I
.field private d I
.field private e I
.field private f I

.method public <init> : (B[I)V
    .code stack 5 locals 5
L0:     getstatic Field kb C Z
L3:     istore 4
L5:     aload_0
L6:     invokespecial Method java/lang/Object <init> ()V
        .catch java/lang/RuntimeException from L9 to L76 using L77
L9:     aload_0
L10:    sipush 256
L13:    newarray int
L15:    putfield Field tb c [I
L18:    aload_0
L19:    sipush 256
L22:    newarray int
L24:    putfield Field tb b [I
L27:    iconst_0
L28:    istore_3
L29:    iload 4
L31:    ifeq L46
L34:    aload_0
L35:    getfield Field tb b [I
L38:    iload_3
L39:    aload_2
L40:    iload_3
L41:    iaload
L42:    iastore
L43:    iinc 3 1
L46:    iload_3
L47:    aload_2
L48:    arraylength
L49:    if_icmplt L34
L52:    iload_1
L53:    iconst_1
L54:    if_icmpne L64
L57:    iconst_0
L58:    istore_1
L59:    iload 4
L61:    ifeq L72
L64:    new java/lang/NullPointerException
L67:    dup
L68:    invokespecial Method java/lang/NullPointerException <init> ()V
L71:    athrow
L72:    aload_0
L73:    invokespecial Method tb c ()V
L76:    return
L77:    astore_3
L78:    new java/lang/StringBuffer
L81:    dup
L82:    ldc "45225, "
L84:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L87:    iload_1
L88:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L91:    ldc ", "
L93:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L96:    aload_2
L97:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L100:   ldc ", "
L102:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L105:   aload_3
L106:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L109:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L112:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L115:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L118:   new java/lang/RuntimeException
L121:   dup
L122:   invokespecial Method java/lang/RuntimeException <init> ()V
L125:   athrow
L126:   
    .end code
.end method

.method public final a : ()I
    .code stack 4 locals 1
L0:     aload_0
L1:     dup
L2:     getfield Field tb a I
L5:     dup_x1
L6:     iconst_1
L7:     isub
L8:     putfield Field tb a I
L11:    ifne L25
L14:    aload_0
L15:    invokespecial Method tb b ()V
L18:    aload_0
L19:    sipush 255
L22:    putfield Field tb a I
L25:    aload_0
L26:    getfield Field tb b [I
L29:    aload_0
L30:    getfield Field tb a I
L33:    iaload
L34:    ireturn
L35:    
    .end code
.end method

.method private final b : ()V
    .code stack 7 locals 5
L0:     getstatic Field kb C Z
L3:     istore 4
L5:     aload_0
L6:     dup
L7:     getfield Field tb e I
L10:    aload_0
L11:    dup
L12:    getfield Field tb f I
L15:    iconst_1
L16:    iadd
L17:    dup_x1
L18:    putfield Field tb f I
L21:    iadd
L22:    putfield Field tb e I
L25:    iconst_0
L26:    istore_1
L27:    iload 4
L29:    ifeq L237
L32:    aload_0
L33:    getfield Field tb c [I
L36:    iload_1
L37:    iaload
L38:    istore_2
L39:    iload_1
L40:    iconst_3
L41:    iand
L42:    tableswitch 0
            L72
            L93
            L114
            L134
            default : L153
L72:    aload_0
L73:    dup
L74:    getfield Field tb d I
L77:    aload_0
L78:    getfield Field tb d I
L81:    bipush 13
L83:    ishl
L84:    ixor
L85:    putfield Field tb d I
L88:    iload 4
L90:    ifeq L153
L93:    aload_0
L94:    dup
L95:    getfield Field tb d I
L98:    aload_0
L99:    getfield Field tb d I
L102:   bipush 6
L104:   iushr
L105:   ixor
L106:   putfield Field tb d I
L109:   iload 4
L111:   ifeq L153
L114:   aload_0
L115:   dup
L116:   getfield Field tb d I
L119:   aload_0
L120:   getfield Field tb d I
L123:   iconst_2
L124:   ishl
L125:   ixor
L126:   putfield Field tb d I
L129:   iload 4
L131:   ifeq L153
L134:   aload_0
L135:   dup
L136:   getfield Field tb d I
L139:   aload_0
L140:   getfield Field tb d I
L143:   bipush 16
L145:   iushr
L146:   ixor
L147:   putfield Field tb d I
L150:   goto L153
L153:   aload_0
L154:   dup
L155:   getfield Field tb d I
L158:   aload_0
L159:   getfield Field tb c [I
L162:   iload_1
L163:   sipush 128
L166:   iadd
L167:   sipush 255
L170:   iand
L171:   iaload
L172:   iadd
L173:   putfield Field tb d I
L176:   aload_0
L177:   getfield Field tb c [I
L180:   iload_1
L181:   aload_0
L182:   getfield Field tb c [I
L185:   iload_2
L186:   sipush 1020
L189:   iand
L190:   iconst_2
L191:   ishr
L192:   iaload
L193:   aload_0
L194:   getfield Field tb d I
L197:   iadd
L198:   aload_0
L199:   getfield Field tb e I
L202:   iadd
L203:   dup
L204:   istore_3
L205:   iastore
L206:   aload_0
L207:   getfield Field tb b [I
L210:   iload_1
L211:   aload_0
L212:   aload_0
L213:   getfield Field tb c [I
L216:   iload_3
L217:   bipush 8
L219:   ishr
L220:   sipush 1020
L223:   iand
L224:   iconst_2
L225:   ishr
L226:   iaload
L227:   iload_2
L228:   iadd
L229:   dup_x1
L230:   putfield Field tb e I
L233:   iastore
L234:   iinc 1 1
L237:   iload_1
L238:   sipush 256
L241:   if_icmplt L32
L244:   return
L245:   
    .end code
.end method

.method private final c : ()V
    .code stack 5 locals 11
L0:     getstatic Field kb C Z
L3:     istore 10
L5:     ldc -1640531527
L7:     dup
L8:     istore 9
L10:    dup
L11:    istore 8
L13:    dup
L14:    istore 7
L16:    dup
L17:    istore 6
L19:    dup
L20:    istore 5
L22:    dup
L23:    istore 4
L25:    dup
L26:    istore_3
L27:    istore_2
L28:    iconst_0
L29:    istore_1
L30:    iload 10
L32:    ifeq L210
L35:    iload_2
L36:    iload_3
L37:    bipush 11
L39:    ishl
L40:    ixor
L41:    istore_2
L42:    iload 5
L44:    iload_2
L45:    iadd
L46:    istore 5
L48:    iload_3
L49:    iload 4
L51:    iadd
L52:    istore_3
L53:    iload_3
L54:    iload 4
L56:    iconst_2
L57:    iushr
L58:    ixor
L59:    istore_3
L60:    iload 6
L62:    iload_3
L63:    iadd
L64:    istore 6
L66:    iload 4
L68:    iload 5
L70:    iadd
L71:    istore 4
L73:    iload 4
L75:    iload 5
L77:    bipush 8
L79:    ishl
L80:    ixor
L81:    istore 4
L83:    iload 7
L85:    iload 4
L87:    iadd
L88:    istore 7
L90:    iload 5
L92:    iload 6
L94:    iadd
L95:    istore 5
L97:    iload 5
L99:    iload 6
L101:   bipush 16
L103:   iushr
L104:   ixor
L105:   istore 5
L107:   iload 8
L109:   iload 5
L111:   iadd
L112:   istore 8
L114:   iload 6
L116:   iload 7
L118:   iadd
L119:   istore 6
L121:   iload 6
L123:   iload 7
L125:   bipush 10
L127:   ishl
L128:   ixor
L129:   istore 6
L131:   iload 9
L133:   iload 6
L135:   iadd
L136:   istore 9
L138:   iload 7
L140:   iload 8
L142:   iadd
L143:   istore 7
L145:   iload 7
L147:   iload 8
L149:   iconst_4
L150:   iushr
L151:   ixor
L152:   istore 7
L154:   iload_2
L155:   iload 7
L157:   iadd
L158:   istore_2
L159:   iload 8
L161:   iload 9
L163:   iadd
L164:   istore 8
L166:   iload 8
L168:   iload 9
L170:   bipush 8
L172:   ishl
L173:   ixor
L174:   istore 8
L176:   iload_3
L177:   iload 8
L179:   iadd
L180:   istore_3
L181:   iload 9
L183:   iload_2
L184:   iadd
L185:   istore 9
L187:   iload 9
L189:   iload_2
L190:   bipush 9
L192:   iushr
L193:   ixor
L194:   istore 9
L196:   iload 4
L198:   iload 9
L200:   iadd
L201:   istore 4
L203:   iload_2
L204:   iload_3
L205:   iadd
L206:   istore_2
L207:   iinc 1 1
L210:   iload_1
L211:   iconst_4
L212:   if_icmplt L35
L215:   iconst_0
L216:   istore_1
L217:   iload 10
L219:   ifeq L575
L222:   iload_2
L223:   aload_0
L224:   getfield Field tb b [I
L227:   iload_1
L228:   iaload
L229:   iadd
L230:   istore_2
L231:   iload_3
L232:   aload_0
L233:   getfield Field tb b [I
L236:   iload_1
L237:   iconst_1
L238:   iadd
L239:   iaload
L240:   iadd
L241:   istore_3
L242:   iload 4
L244:   aload_0
L245:   getfield Field tb b [I
L248:   iload_1
L249:   iconst_2
L250:   iadd
L251:   iaload
L252:   iadd
L253:   istore 4
L255:   iload 5
L257:   aload_0
L258:   getfield Field tb b [I
L261:   iload_1
L262:   iconst_3
L263:   iadd
L264:   iaload
L265:   iadd
L266:   istore 5
L268:   iload 6
L270:   aload_0
L271:   getfield Field tb b [I
L274:   iload_1
L275:   iconst_4
L276:   iadd
L277:   iaload
L278:   iadd
L279:   istore 6
L281:   iload 7
L283:   aload_0
L284:   getfield Field tb b [I
L287:   iload_1
L288:   iconst_5
L289:   iadd
L290:   iaload
L291:   iadd
L292:   istore 7
L294:   iload 8
L296:   aload_0
L297:   getfield Field tb b [I
L300:   iload_1
L301:   bipush 6
L303:   iadd
L304:   iaload
L305:   iadd
L306:   istore 8
L308:   iload 9
L310:   aload_0
L311:   getfield Field tb b [I
L314:   iload_1
L315:   bipush 7
L317:   iadd
L318:   iaload
L319:   iadd
L320:   istore 9
L322:   iload_2
L323:   iload_3
L324:   bipush 11
L326:   ishl
L327:   ixor
L328:   istore_2
L329:   iload 5
L331:   iload_2
L332:   iadd
L333:   istore 5
L335:   iload_3
L336:   iload 4
L338:   iadd
L339:   istore_3
L340:   iload_3
L341:   iload 4
L343:   iconst_2
L344:   iushr
L345:   ixor
L346:   istore_3
L347:   iload 6
L349:   iload_3
L350:   iadd
L351:   istore 6
L353:   iload 4
L355:   iload 5
L357:   iadd
L358:   istore 4
L360:   iload 4
L362:   iload 5
L364:   bipush 8
L366:   ishl
L367:   ixor
L368:   istore 4
L370:   iload 7
L372:   iload 4
L374:   iadd
L375:   istore 7
L377:   iload 5
L379:   iload 6
L381:   iadd
L382:   istore 5
L384:   iload 5
L386:   iload 6
L388:   bipush 16
L390:   iushr
L391:   ixor
L392:   istore 5
L394:   iload 8
L396:   iload 5
L398:   iadd
L399:   istore 8
L401:   iload 6
L403:   iload 7
L405:   iadd
L406:   istore 6
L408:   iload 6
L410:   iload 7
L412:   bipush 10
L414:   ishl
L415:   ixor
L416:   istore 6
L418:   iload 9
L420:   iload 6
L422:   iadd
L423:   istore 9
L425:   iload 7
L427:   iload 8
L429:   iadd
L430:   istore 7
L432:   iload 7
L434:   iload 8
L436:   iconst_4
L437:   iushr
L438:   ixor
L439:   istore 7
L441:   iload_2
L442:   iload 7
L444:   iadd
L445:   istore_2
L446:   iload 8
L448:   iload 9
L450:   iadd
L451:   istore 8
L453:   iload 8
L455:   iload 9
L457:   bipush 8
L459:   ishl
L460:   ixor
L461:   istore 8
L463:   iload_3
L464:   iload 8
L466:   iadd
L467:   istore_3
L468:   iload 9
L470:   iload_2
L471:   iadd
L472:   istore 9
L474:   iload 9
L476:   iload_2
L477:   bipush 9
L479:   iushr
L480:   ixor
L481:   istore 9
L483:   iload 4
L485:   iload 9
L487:   iadd
L488:   istore 4
L490:   iload_2
L491:   iload_3
L492:   iadd
L493:   istore_2
L494:   aload_0
L495:   getfield Field tb c [I
L498:   iload_1
L499:   iload_2
L500:   iastore
L501:   aload_0
L502:   getfield Field tb c [I
L505:   iload_1
L506:   iconst_1
L507:   iadd
L508:   iload_3
L509:   iastore
L510:   aload_0
L511:   getfield Field tb c [I
L514:   iload_1
L515:   iconst_2
L516:   iadd
L517:   iload 4
L519:   iastore
L520:   aload_0
L521:   getfield Field tb c [I
L524:   iload_1
L525:   iconst_3
L526:   iadd
L527:   iload 5
L529:   iastore
L530:   aload_0
L531:   getfield Field tb c [I
L534:   iload_1
L535:   iconst_4
L536:   iadd
L537:   iload 6
L539:   iastore
L540:   aload_0
L541:   getfield Field tb c [I
L544:   iload_1
L545:   iconst_5
L546:   iadd
L547:   iload 7
L549:   iastore
L550:   aload_0
L551:   getfield Field tb c [I
L554:   iload_1
L555:   bipush 6
L557:   iadd
L558:   iload 8
L560:   iastore
L561:   aload_0
L562:   getfield Field tb c [I
L565:   iload_1
L566:   bipush 7
L568:   iadd
L569:   iload 9
L571:   iastore
L572:   iinc 1 8
L575:   iload_1
L576:   sipush 256
L579:   if_icmplt L222
L582:   iconst_0
L583:   istore_1
L584:   iload 10
L586:   ifeq L942
L589:   iload_2
L590:   aload_0
L591:   getfield Field tb c [I
L594:   iload_1
L595:   iaload
L596:   iadd
L597:   istore_2
L598:   iload_3
L599:   aload_0
L600:   getfield Field tb c [I
L603:   iload_1
L604:   iconst_1
L605:   iadd
L606:   iaload
L607:   iadd
L608:   istore_3
L609:   iload 4
L611:   aload_0
L612:   getfield Field tb c [I
L615:   iload_1
L616:   iconst_2
L617:   iadd
L618:   iaload
L619:   iadd
L620:   istore 4
L622:   iload 5
L624:   aload_0
L625:   getfield Field tb c [I
L628:   iload_1
L629:   iconst_3
L630:   iadd
L631:   iaload
L632:   iadd
L633:   istore 5
L635:   iload 6
L637:   aload_0
L638:   getfield Field tb c [I
L641:   iload_1
L642:   iconst_4
L643:   iadd
L644:   iaload
L645:   iadd
L646:   istore 6
L648:   iload 7
L650:   aload_0
L651:   getfield Field tb c [I
L654:   iload_1
L655:   iconst_5
L656:   iadd
L657:   iaload
L658:   iadd
L659:   istore 7
L661:   iload 8
L663:   aload_0
L664:   getfield Field tb c [I
L667:   iload_1
L668:   bipush 6
L670:   iadd
L671:   iaload
L672:   iadd
L673:   istore 8
L675:   iload 9
L677:   aload_0
L678:   getfield Field tb c [I
L681:   iload_1
L682:   bipush 7
L684:   iadd
L685:   iaload
L686:   iadd
L687:   istore 9
L689:   iload_2
L690:   iload_3
L691:   bipush 11
L693:   ishl
L694:   ixor
L695:   istore_2
L696:   iload 5
L698:   iload_2
L699:   iadd
L700:   istore 5
L702:   iload_3
L703:   iload 4
L705:   iadd
L706:   istore_3
L707:   iload_3
L708:   iload 4
L710:   iconst_2
L711:   iushr
L712:   ixor
L713:   istore_3
L714:   iload 6
L716:   iload_3
L717:   iadd
L718:   istore 6
L720:   iload 4
L722:   iload 5
L724:   iadd
L725:   istore 4
L727:   iload 4
L729:   iload 5
L731:   bipush 8
L733:   ishl
L734:   ixor
L735:   istore 4
L737:   iload 7
L739:   iload 4
L741:   iadd
L742:   istore 7
L744:   iload 5
L746:   iload 6
L748:   iadd
L749:   istore 5
L751:   iload 5
L753:   iload 6
L755:   bipush 16
L757:   iushr
L758:   ixor
L759:   istore 5
L761:   iload 8
L763:   iload 5
L765:   iadd
L766:   istore 8
L768:   iload 6
L770:   iload 7
L772:   iadd
L773:   istore 6
L775:   iload 6
L777:   iload 7
L779:   bipush 10
L781:   ishl
L782:   ixor
L783:   istore 6
L785:   iload 9
L787:   iload 6
L789:   iadd
L790:   istore 9
L792:   iload 7
L794:   iload 8
L796:   iadd
L797:   istore 7
L799:   iload 7
L801:   iload 8
L803:   iconst_4
L804:   iushr
L805:   ixor
L806:   istore 7
L808:   iload_2
L809:   iload 7
L811:   iadd
L812:   istore_2
L813:   iload 8
L815:   iload 9
L817:   iadd
L818:   istore 8
L820:   iload 8
L822:   iload 9
L824:   bipush 8
L826:   ishl
L827:   ixor
L828:   istore 8
L830:   iload_3
L831:   iload 8
L833:   iadd
L834:   istore_3
L835:   iload 9
L837:   iload_2
L838:   iadd
L839:   istore 9
L841:   iload 9
L843:   iload_2
L844:   bipush 9
L846:   iushr
L847:   ixor
L848:   istore 9
L850:   iload 4
L852:   iload 9
L854:   iadd
L855:   istore 4
L857:   iload_2
L858:   iload_3
L859:   iadd
L860:   istore_2
L861:   aload_0
L862:   getfield Field tb c [I
L865:   iload_1
L866:   iload_2
L867:   iastore
L868:   aload_0
L869:   getfield Field tb c [I
L872:   iload_1
L873:   iconst_1
L874:   iadd
L875:   iload_3
L876:   iastore
L877:   aload_0
L878:   getfield Field tb c [I
L881:   iload_1
L882:   iconst_2
L883:   iadd
L884:   iload 4
L886:   iastore
L887:   aload_0
L888:   getfield Field tb c [I
L891:   iload_1
L892:   iconst_3
L893:   iadd
L894:   iload 5
L896:   iastore
L897:   aload_0
L898:   getfield Field tb c [I
L901:   iload_1
L902:   iconst_4
L903:   iadd
L904:   iload 6
L906:   iastore
L907:   aload_0
L908:   getfield Field tb c [I
L911:   iload_1
L912:   iconst_5
L913:   iadd
L914:   iload 7
L916:   iastore
L917:   aload_0
L918:   getfield Field tb c [I
L921:   iload_1
L922:   bipush 6
L924:   iadd
L925:   iload 8
L927:   iastore
L928:   aload_0
L929:   getfield Field tb c [I
L932:   iload_1
L933:   bipush 7
L935:   iadd
L936:   iload 9
L938:   iastore
L939:   iinc 1 8
L942:   iload_1
L943:   sipush 256
L946:   if_icmplt L589
L949:   aload_0
L950:   invokespecial Method tb b ()V
L953:   aload_0
L954:   sipush 256
L957:   putfield Field tb a I
L960:   return
L961:   
    .end code
.end method
.end class
