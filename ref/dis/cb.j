.version 45 3
.class super abstract cb
.super java/lang/Object
.field static a [I
.field static b [I
.field static c I

.method static final a : (B)V
    .code stack 8 locals 20
L0:     getstatic Field loginapplet o I
L3:     istore 19
        .catch java/lang/RuntimeException from L5 to L1048 using L1051
L5:     getstatic Field ga a I
L8:     istore 5
L10:    iload 5
L12:    getstatic Field b O I
L15:    if_icmple L30
L18:    iload 5
L20:    istore_2
L21:    getstatic Field b O I
L24:    istore_1
L25:    iload 19
L27:    ifeq L37
L30:    iload 5
L32:    istore_1
L33:    getstatic Field b O I
L36:    istore_2
L37:    getstatic Field ea l I
L40:    istore 6
L42:    iload 5
L44:    ineg
L45:    getstatic Field b O I
L48:    iadd
L49:    istore 7
L51:    iload_2
L52:    i2f
L53:    getstatic Field f u F
L56:    fadd
L57:    f2i
L58:    istore_2
L59:    iload_0
L60:    bipush -27
L62:    if_icmpeq L70
L65:    bipush 36
L67:    putstatic Field cb c I
L70:    iload_1
L71:    i2f
L72:    getstatic Field f u F
L75:    fsub
L76:    f2i
L77:    istore_1
L78:    iload 6
L80:    iconst_m1
L81:    ixor
L82:    getstatic Field ea i I
L85:    iconst_m1
L86:    ixor
L87:    if_icmpge L103
L90:    iload 6
L92:    istore 4
L94:    getstatic Field ea i I
L97:    istore_3
L98:    iload 19
L100:   ifeq L111
L103:   getstatic Field ea i I
L106:   istore 4
L108:   iload 6
L110:   istore_3
L111:   iload_3
L112:   i2f
L113:   getstatic Field f u F
L116:   fsub
L117:   f2i
L118:   istore_3
L119:   iload 4
L121:   i2f
L122:   getstatic Field f u F
L125:   fadd
L126:   f2i
L127:   istore 4
L129:   getstatic Field ea i I
L132:   iload 6
L134:   ineg
L135:   iadd
L136:   istore 8
L138:   iconst_0
L139:   istore 9
L141:   getstatic Field b M [Lc;
L144:   arraylength
L145:   iconst_m1
L146:   ixor
L147:   iload 9
L149:   iconst_m1
L150:   ixor
L151:   if_icmpge L1048
L154:   getstatic Field b M [Lc;
L157:   iload 9
L159:   aaload
L160:   getfield Field c d F
L163:   iload_1
L164:   i2f
L165:   fcmpg
L166:   iflt L233
L169:   getstatic Field b M [Lc;
L172:   iload 9
L174:   aaload
L175:   getfield Field c d F
L178:   iload_2
L179:   i2f
L180:   fcmpl
L181:   ifgt L233
L184:   iload_3
L185:   i2f
L186:   getstatic Field b M [Lc;
L189:   iload 9
L191:   aaload
L192:   getfield Field c b F
L195:   fcmpl
L196:   ifgt L233
L199:   iload 4
L201:   i2f
L202:   getstatic Field b M [Lc;
L205:   iload 9
L207:   aaload
L208:   getfield Field c b F
L211:   fcmpg
L212:   iflt L233
L215:   iconst_0
L216:   getstatic Field b O I
L219:   iconst_m1
L220:   ixor
L221:   if_icmpne L259
L224:   iconst_0
L225:   getstatic Field ea i I
L228:   iconst_m1
L229:   ixor
L230:   if_icmpne L259
L233:   getstatic Field b M [Lc;
L236:   iload 9
L238:   aaload
L239:   bipush -36
L241:   invokevirtual Method c a (B)V
L244:   getstatic Field b M [Lc;
L247:   iload 9
L249:   aaload
L250:   iconst_0
L251:   putfield Field c h Z
L254:   iload 19
L256:   ifeq L911
L259:   getstatic Field b O I
L262:   iload 5
L264:   if_icmpne L597
L267:   iload 6
L269:   getstatic Field ea i I
L272:   if_icmpne L597
L275:   getstatic Field b O I
L278:   i2f
L279:   getstatic Field b M [Lc;
L282:   iload 9
L284:   aaload
L285:   getfield Field c d F
L288:   fsub
L289:   fstore 12
L291:   getstatic Field b O I
L294:   i2f
L295:   getstatic Field qa b F
L298:   fsub
L299:   fstore 14
L301:   getstatic Field ea i I
L304:   i2f
L305:   getstatic Field b M [Lc;
L308:   iload 9
L310:   aaload
L311:   getfield Field c b F
L314:   fsub
L315:   fstore 13
L317:   getstatic Field ea i I
L320:   i2f
L321:   getstatic Field g d F
L324:   fsub
L325:   fstore 15
L327:   getstatic Field b M [Lc;
L330:   iload 9
L332:   aaload
L333:   getfield Field c h Z
L336:   ifne L406
L339:   fload 14
L341:   iconst_1
L342:   getstatic Field b M [Lc;
L345:   iload 9
L347:   aaload
L348:   getfield Field c b F
L351:   getstatic Field g d F
L354:   fsub
L355:   fload 15
L357:   getstatic Field b M [Lc;
L360:   iload 9
L362:   aaload
L363:   getfield Field c d F
L366:   getstatic Field qa b F
L369:   fsub
L370:   invokestatic Method e a (FIFFF)F
L373:   fstore 16
L375:   getstatic Field b M [Lc;
L378:   iload 9
L380:   aaload
L381:   fconst_0
L382:   fload 16
L384:   fcmpl
L385:   ifle L392
L388:   iconst_1
L389:   goto L393
L392:   iconst_0
L393:   putfield Field c g Z
L396:   getstatic Field b M [Lc;
L399:   iload 9
L401:   aaload
L402:   iconst_1
L403:   putfield Field c h Z
L406:   fload 13
L408:   fneg
L409:   getstatic Field b M [Lc;
L412:   iload 9
L414:   aaload
L415:   getfield Field c c F
L418:   fadd
L419:   fstore 10
L421:   fload 12
L423:   getstatic Field b M [Lc;
L426:   iload 9
L428:   aaload
L429:   getfield Field c e F
L432:   fadd
L433:   fstore 11
L435:   getstatic Field b M [Lc;
L438:   iload 9
L440:   aaload
L441:   getfield Field c g Z
L444:   ifne L496
L447:   fload 11
L449:   ldc -1e0f
L451:   fmul
L452:   fstore 11
L454:   fload 10
L456:   ldc -1e0f
L458:   fmul
L459:   fstore 10
L461:   fload 11
L463:   fload 13
L465:   fneg
L466:   getstatic Field f u F
L469:   fadd
L470:   ldc -1.5e-1f
L472:   fmul
L473:   fadd
L474:   fstore 11
L476:   fload 10
L478:   fload 12
L480:   fneg
L481:   getstatic Field f u F
L484:   fadd
L485:   ldc -1.5e-1f
L487:   fmul
L488:   fadd
L489:   fstore 10
L491:   iload 19
L493:   ifeq L526
L496:   fload 10
L498:   fload 12
L500:   fneg
L501:   getstatic Field f u F
L504:   fadd
L505:   ldc 1.2e-1f
L507:   fmul
L508:   fadd
L509:   fstore 10
L511:   fload 11
L513:   ldc 1.2e-1f
L515:   fload 13
L517:   fneg
L518:   getstatic Field f u F
L521:   fadd
L522:   fmul
L523:   fadd
L524:   fstore 11
L526:   fload 10
L528:   fload 10
L530:   fmul
L531:   fload 11
L533:   fload 11
L535:   fmul
L536:   fadd
L537:   f2d
L538:   invokestatic Method java/lang/Math sqrt (D)D
L541:   dstore 16
L543:   dload 16
L545:   dconst_1
L546:   dcmpl
L547:   ifgt L553
L550:   goto L577
L553:   dconst_1
L554:   dload 16
L556:   ddiv
L557:   dstore 16
L559:   fload 10
L561:   f2d
L562:   dload 16
L564:   dmul
L565:   d2f
L566:   fstore 10
L568:   fload 11
L570:   f2d
L571:   dload 16
L573:   dmul
L574:   d2f
L575:   fstore 11
L577:   getstatic Field b M [Lc;
L580:   iload 9
L582:   aaload
L583:   bipush -117
L585:   fload 10
L587:   fload 11
L589:   invokevirtual Method c a (IFF)V
L592:   iload 19
L594:   ifeq L911
L597:   iload 7
L599:   i2f
L600:   iload 5
L602:   i2f
L603:   sipush -10343
L606:   iload 8
L608:   i2f
L609:   getstatic Field b M [Lc;
L612:   iload 9
L614:   aaload
L615:   getfield Field c d F
L618:   getstatic Field b M [Lc;
L621:   iload 9
L623:   aaload
L624:   getfield Field c b F
L627:   iload 6
L629:   i2f
L630:   invokestatic Method m a (FFIFFFF)F
L633:   getstatic Field f u F
L636:   fcmpg
L637:   ifge L890
L640:   iload 6
L642:   ineg
L643:   i2f
L644:   getstatic Field b M [Lc;
L647:   iload 9
L649:   aaload
L650:   getfield Field c d F
L653:   fadd
L654:   fstore 11
L656:   getstatic Field b M [Lc;
L659:   iload 9
L661:   aaload
L662:   getfield Field c d F
L665:   iload 5
L667:   i2f
L668:   fsub
L669:   fstore 10
L671:   fload 10
L673:   iload 8
L675:   i2f
L676:   iconst_0
L677:   iload 7
L679:   i2f
L680:   fload 11
L682:   invokestatic Method i a (FFZFF)F
L685:   fstore 12
L687:   fconst_0
L688:   fload 12
L690:   fcmpl
L691:   ifge L775
L694:   iload 7
L696:   i2f
L697:   iload 8
L699:   i2f
L700:   iconst_0
L701:   iload 7
L703:   i2f
L704:   iload 8
L706:   i2f
L707:   invokestatic Method i a (FFZFF)F
L710:   fstore 15
L712:   fload 12
L714:   fload 15
L716:   fcmpl
L717:   ifge L758
L720:   fload 12
L722:   fload 15
L724:   fdiv
L725:   fstore 16
L727:   getstatic Field b O I
L730:   i2f
L731:   fload 16
L733:   fmul
L734:   iload 5
L736:   i2f
L737:   fadd
L738:   fstore 13
L740:   iload 6
L742:   i2f
L743:   fload 16
L745:   getstatic Field ea i I
L748:   i2f
L749:   fmul
L750:   fadd
L751:   fstore 14
L753:   iload 19
L755:   ifeq L770
L758:   getstatic Field ea i I
L761:   i2f
L762:   fstore 14
L764:   getstatic Field b O I
L767:   i2f
L768:   fstore 13
L770:   iload 19
L772:   ifeq L785
L775:   iload 6
L777:   i2f
L778:   fstore 14
L780:   iload 5
L782:   i2f
L783:   fstore 13
L785:   getstatic Field b M [Lc;
L788:   iload 9
L790:   aaload
L791:   getfield Field c d F
L794:   fload 13
L796:   fsub
L797:   fstore 15
L799:   getstatic Field b M [Lc;
L802:   iload 9
L804:   aaload
L805:   getfield Field c b F
L808:   fload 14
L810:   fsub
L811:   fstore 16
L813:   fload 16
L815:   fload 16
L817:   fmul
L818:   fload 15
L820:   fload 15
L822:   fmul
L823:   fadd
L824:   f2d
L825:   invokestatic Method java/lang/Math sqrt (D)D
L828:   dstore 17
L830:   dconst_1
L831:   dload 17
L833:   dcmpg
L834:   iflt L840
L837:   goto L866
L840:   dconst_1
L841:   dload 17
L843:   ddiv
L844:   d2f
L845:   f2d
L846:   dstore 17
L848:   fload 15
L850:   f2d
L851:   dload 17
L853:   dmul
L854:   d2f
L855:   fstore 15
L857:   fload 16
L859:   f2d
L860:   dload 17
L862:   dmul
L863:   d2f
L864:   fstore 16
L866:   getstatic Field b M [Lc;
L869:   iload 9
L871:   aaload
L872:   iload_0
L873:   bipush 70
L875:   ixor
L876:   fload 15
L878:   fneg
L879:   fload 16
L881:   fneg
L882:   invokevirtual Method c a (IFF)V
L885:   iload 19
L887:   ifeq L911
L890:   getstatic Field b M [Lc;
L893:   iload 9
L895:   aaload
L896:   bipush -36
L898:   invokevirtual Method c a (B)V
L901:   getstatic Field b M [Lc;
L904:   iload 9
L906:   aaload
L907:   iconst_0
L908:   putfield Field c h Z
L911:   getstatic Field b M [Lc;
L914:   iload 9
L916:   aaload
L917:   dup
L918:   getfield Field c i I
L921:   iconst_1
L922:   iadd
L923:   putfield Field c i I
L926:   getstatic Field b M [Lc;
L929:   iload 9
L931:   aaload
L932:   getfield Field c i I
L935:   iconst_m1
L936:   ixor
L937:   getstatic Field b M [Lc;
L940:   iload 9
L942:   aaload
L943:   getfield Field c j I
L946:   iconst_m1
L947:   ixor
L948:   if_icmplt L954
L951:   goto L1040
L954:   ldc2_w 3.141592653589793e0
L957:   getstatic Field v a Ljava/util/Random;
L960:   invokevirtual Method java/util/Random nextDouble ()D
L963:   ldc2_w 2e0
L966:   dmul
L967:   dmul
L968:   dstore 10
L970:   sipush 150
L973:   getstatic Field v a Ljava/util/Random;
L976:   invokevirtual Method java/util/Random nextInt ()I
L979:   bipush 50
L981:   irem
L982:   invokestatic Method java/lang/Math abs (I)I
L985:   ineg
L986:   isub
L987:   istore 12
L989:   dload 10
L991:   invokestatic Method java/lang/Math cos (D)D
L994:   d2f
L995:   fstore 13
L997:   dload 10
L999:   invokestatic Method java/lang/Math sin (D)D
L1002:  d2f
L1003:  fstore 14
L1005:  getstatic Field b M [Lc;
L1008:  iload 9
L1010:  aaload
L1011:  fload 14
L1013:  ldc 1.5e1f
L1015:  fmul
L1016:  getstatic Field g d F
L1019:  fadd
L1020:  fload 14
L1022:  fload 13
L1024:  ldc 1.5e1f
L1026:  fmul
L1027:  getstatic Field qa b F
L1030:  fadd
L1031:  fload 13
L1033:  iload 12
L1035:  bipush -119
L1037:  invokevirtual Method c a (FFFFII)V
L1040:  iinc 9 1
L1043:  iload 19
L1045:  ifeq L141
L1048:  goto L1081
L1051:  astore_1
L1052:  aload_1
L1053:  new java/lang/StringBuffer
L1056:  dup
L1057:  invokespecial Method java/lang/StringBuffer <init> ()V
L1060:  ldc "cb.E("
L1062:  invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L1065:  iload_0
L1066:  invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L1069:  bipush 41
L1071:  invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L1074:  invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L1077:  invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L1080:  athrow
L1081:  return
L1082:  
        .linenumbertable
            L5 23
            L10 25
            L18 27
            L21 28
            L30 32
            L33 33
            L37 36
            L42 38
            L51 39
            L59 40
            L65 41
            L70 44
            L78 45
            L90 47
            L94 48
            L103 52
            L108 53
            L111 56
            L119 57
            L129 58
            L138 61
            L141 62
            L154 64
            L233 66
            L244 67
            L259 71
            L275 78
            L291 79
            L301 81
            L317 82
            L327 83
            L339 86
            L375 87
            L396 88
            L406 91
            L421 93
            L435 94
            L447 96
            L454 97
            L461 98
            L476 99
            L496 103
            L511 104
            L526 107
            L543 108
            L553 111
            L559 112
            L568 113
            L577 116
            L592 117
            L597 119
            L640 124
            L656 125
            L671 128
            L687 129
            L694 132
            L712 133
            L720 136
            L727 137
            L740 138
            L753 139
            L758 142
            L764 143
            L770 146
            L775 149
            L780 150
            L785 154
            L799 156
            L813 158
            L830 159
            L840 162
            L848 163
            L857 164
            L866 167
            L885 168
            L890 171
            L901 172
            L911 178
            L926 179
            L954 185
            L970 186
            L989 187
            L997 189
            L1005 190
            L1040 62
            L1048 198
            L1051 196
            L1052 197
            L1081 199
        .end linenumbertable
    .end code
.end method

.method public static a : (I)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L17 using L20
L0:     iload_0
L1:     ifeq L9
L4:     bipush -37
L6:     putstatic Field cb c I
L9:     aconst_null
L10:    putstatic Field cb a [I
L13:    aconst_null
L14:    putstatic Field cb b [I
L17:    goto L50
L20:    astore_1
L21:    aload_1
L22:    new java/lang/StringBuffer
L25:    dup
L26:    invokespecial Method java/lang/StringBuffer <init> ()V
L29:    ldc "cb.F("
L31:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L34:    iload_0
L35:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L38:    bipush 41
L40:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L43:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L46:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L49:    athrow
L50:    return
L51:    
        .linenumbertable
            L0 211
            L4 212
            L9 214
            L13 215
            L17 218
            L20 216
            L21 217
            L50 219
        .end linenumbertable
    .end code
.end method

.method abstract a : (III)I
.end method

.method static final b : (B)Z
    .code stack 3 locals 3
L0:     iload_0
L1:     bipush -39
L3:     if_icmplt L11
L6:     bipush -92
L8:     putstatic Field cb c I
L11:    getstatic Field ca d Lma;
L14:    dup
L15:    astore_1
L16:    monitorenter
        .catch [0] from L17 to L33 using L69
L17:    getstatic Field cb c I
L20:    iconst_m1
L21:    ixor
L22:    getstatic Field oa b I
L25:    iconst_m1
L26:    ixor
L27:    if_icmpne L34
L30:    iconst_0
L31:    aload_1
L32:    monitorexit
L33:    ireturn
        .catch [0] from L34 to L68 using L69
L34:    getstatic Field fa f [I
L37:    getstatic Field cb c I
L40:    iaload
L41:    putstatic Field ua b I
L44:    getstatic Field e j [I
L47:    getstatic Field cb c I
L50:    iaload
L51:    putstatic Field ea q I
L54:    iconst_1
L55:    getstatic Field cb c I
L58:    iadd
L59:    bipush 127
L61:    iand
L62:    putstatic Field cb c I
L65:    iconst_1
L66:    aload_1
L67:    monitorexit
L68:    ireturn
        .catch [0] from L69 to L72 using L69
        .catch java/lang/RuntimeException from L0 to L33 using L74
        .catch java/lang/RuntimeException from L34 to L68 using L74
        .catch java/lang/RuntimeException from L69 to L74 using L74
L69:    astore_2
L70:    aload_1
L71:    monitorexit
L72:    aload_2
L73:    athrow
L74:    astore_1
L75:    aload_1
L76:    new java/lang/StringBuffer
L79:    dup
L80:    invokespecial Method java/lang/StringBuffer <init> ()V
L83:    ldc "cb.D("
L85:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L88:    iload_0
L89:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L92:    bipush 41
L94:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L97:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L100:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L103:   athrow
L104:   
        .linenumbertable
            L0 226
            L6 227
            L11 229
            L17 230
            L30 231
            L34 233
            L44 234
            L54 235
            L65 236
            L69 237
            L74 238
            L75 239
        .end linenumbertable
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     return
L5:     
        .linenumbertable
            L0 242
            L4 243
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_0
L1:     putstatic Field cb c I
L4:     return
L5:     
        .linenumbertable
            L0 207
            L4 208
        .end linenumbertable
    .end code
.end method
.sourcefile "cb.java"
.end class
