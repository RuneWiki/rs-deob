.version 45 3
.class public super passwordapp
.super java/applet/Applet
.implements java/awt/event/ActionListener
.implements java/awt/event/KeyListener
.implements java/awt/event/TextListener
.implements java/lang/Runnable
.field private static final allowedlist [Ljava/lang/String;
.field private codebase Ljava/lang/String;
.field private question [Ljava/awt/TextField;
.field private recov [Ljava/awt/TextField;
.field private norecovcheck Ljava/awt/Checkbox;
.field private password1 Ljava/awt/TextField;
.field private key_e Ljava/math/BigInteger;
.field private key_n Ljava/math/BigInteger;
.field private onreversepath Z
.field private hidepanel Ljava/awt/Panel;
.field private showpanel Ljava/awt/Panel;
.field private static final PROTOCOL_VERSION I = 2
.field private static final TYPE_CHANGEQUESTIONS I = 2
.field private type I
.field private username Ljava/lang/String;
.field private uid I
.field private processingpage Ljava/awt/Panel;
.field private system_error_page Ljava/awt/Panel;
.field private blocked_query_page Ljava/awt/Panel;
.field private blocked_attack_page Ljava/awt/Panel;
.field private wrongpassword_page Ljava/awt/Panel;
.field private change_questions_success_page_active Ljava/awt/Panel;
.field private change_questions_success_page_pending Ljava/awt/Panel;
.field private change_questions_tooshort_page Ljava/awt/Panel;
.field private change_questions_samequestions_page Ljava/awt/Panel;
.field private change_questions_sameanswers_page Ljava/awt/Panel;
.field private change_questions_qandamatch_page Ljava/awt/Panel;
.field private change_questions_page Ljava/awt/Panel;
.field private example_questions [Ljava/lang/String;
.field initialised Z
.field private debug Z

.method public init : ()V
    .code stack 3 locals 2
L0:     getstatic Field java/lang/System out Ljava/io/PrintStream;
L3:     ldc "Version: 3"
L5:     invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L8:     new java/lang/Thread
L11:    dup
L12:    aload_0
L13:    invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L16:    astore_1
L17:    aload_1
L18:    iconst_1
L19:    invokevirtual Method java/lang/Thread setDaemon (Z)V
L22:    aload_1
L23:    invokevirtual Method java/lang/Thread start ()V
L26:    return
L27:    
        .linenumbertable
            L0 69
            L8 70
            L17 71
            L22 72
            L26 68
        .end linenumbertable
    .end code
.end method

.method private init_messages : ()V
    .code stack 6 locals 4
L0:     aload_0
L1:     new java/awt/Panel
L4:     dup
L5:     aconst_null
L6:     invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L9:     putfield Field passwordapp processingpage Ljava/awt/Panel;
L12:    aload_0
L13:    getfield Field passwordapp processingpage Ljava/awt/Panel;
L16:    aload_0
L17:    invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L20:    invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L23:    aload_0
L24:    ldc "Processing Request"
L26:    sipush 180
L29:    aload_0
L30:    invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L33:    getfield Field java/awt/Dimension height I
L36:    iconst_2
L37:    idiv
L38:    bipush 10
L40:    isub
L41:    invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L44:    astore_1
L45:    aload_1
L46:    new java/awt/Font
L49:    dup
L50:    ldc "Arial"
L52:    iconst_1
L53:    bipush 13
L55:    invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L58:    invokevirtual Method java/awt/Component setFont (Ljava/awt/Font;)V
L61:    aload_0
L62:    getfield Field passwordapp processingpage Ljava/awt/Panel;
L65:    aload_1
L66:    invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L69:    pop
L70:    aload_0
L71:    getfield Field passwordapp processingpage Ljava/awt/Panel;
L74:    iconst_0
L75:    invokevirtual Method java/awt/Component setVisible (Z)V
L78:    aload_0
L79:    aload_0
L80:    getfield Field passwordapp processingpage Ljava/awt/Panel;
L83:    invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L86:    pop
L87:    aload_0
L88:    invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L91:    getfield Field java/awt/Dimension height I
L94:    iconst_2
L95:    idiv
L96:    bipush 50
L98:    isub
L99:    istore_2
L100:   aload_0
L101:   new java/awt/Panel
L104:   dup
L105:   aconst_null
L106:   invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L109:   putfield Field passwordapp system_error_page Ljava/awt/Panel;
L112:   aload_0
L113:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L116:   aload_0
L117:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L120:   invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L123:   aload_0
L124:   ldc "Error Processing Request"
L126:   sipush 165
L129:   iload_2
L130:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L133:   astore_1
L134:   aload_1
L135:   new java/awt/Font
L138:   dup
L139:   ldc "Arial"
L141:   iconst_1
L142:   bipush 13
L144:   invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L147:   invokevirtual Method java/awt/Component setFont (Ljava/awt/Font;)V
L150:   aload_0
L151:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L154:   aload_1
L155:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L158:   pop
L159:   aload_0
L160:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L163:   aload_0
L164:   ldc "Sorry, there was an error processing your request."
L166:   bipush 100
L168:   iload_2
L169:   bipush 30
L171:   iadd
L172:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L175:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L178:   pop
L179:   aload_0
L180:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L183:   aload_0
L184:   ldc "Please try again later."
L186:   sipush 180
L189:   iload_2
L190:   bipush 50
L192:   iadd
L193:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L196:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L199:   pop
L200:   new java/awt/Button
L203:   dup
L204:   ldc "Go back and try again"
L206:   invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L209:   astore_3
L210:   aload_3
L211:   sipush 150
L214:   iload_2
L215:   bipush 80
L217:   iadd
L218:   sipush 200
L221:   bipush 22
L223:   invokevirtual Method java/awt/Component setBounds (IIII)V
L226:   aload_3
L227:   aload_0
L228:   invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L231:   aload_0
L232:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L235:   aload_3
L236:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L239:   pop
L240:   aload_0
L241:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L244:   iconst_0
L245:   invokevirtual Method java/awt/Component setVisible (Z)V
L248:   aload_0
L249:   aload_0
L250:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L253:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L256:   pop
L257:   aload_0
L258:   new java/awt/Panel
L261:   dup
L262:   aconst_null
L263:   invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L266:   putfield Field passwordapp blocked_query_page Ljava/awt/Panel;
L269:   aload_0
L270:   getfield Field passwordapp blocked_query_page Ljava/awt/Panel;
L273:   aload_0
L274:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L277:   invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L280:   aload_0
L281:   getfield Field passwordapp blocked_query_page Ljava/awt/Panel;
L284:   aload_0
L285:   ldc "Due to continued problems with this account, we are no longer"
L287:   bipush 80
L289:   aload_0
L290:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L293:   getfield Field java/awt/Dimension height I
L296:   iconst_2
L297:   idiv
L298:   bipush 20
L300:   isub
L301:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L304:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L307:   pop
L308:   aload_0
L309:   getfield Field passwordapp blocked_query_page Ljava/awt/Panel;
L312:   aload_0
L313:   ldc "accepting password support requests for it."
L315:   bipush 80
L317:   aload_0
L318:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L321:   getfield Field java/awt/Dimension height I
L324:   iconst_2
L325:   idiv
L326:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L329:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L332:   pop
L333:   aload_0
L334:   getfield Field passwordapp blocked_query_page Ljava/awt/Panel;
L337:   iconst_0
L338:   invokevirtual Method java/awt/Component setVisible (Z)V
L341:   aload_0
L342:   aload_0
L343:   getfield Field passwordapp blocked_query_page Ljava/awt/Panel;
L346:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L349:   pop
L350:   aload_0
L351:   new java/awt/Panel
L354:   dup
L355:   aconst_null
L356:   invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L359:   putfield Field passwordapp blocked_attack_page Ljava/awt/Panel;
L362:   aload_0
L363:   getfield Field passwordapp blocked_attack_page Ljava/awt/Panel;
L366:   aload_0
L367:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L370:   invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L373:   aload_0
L374:   getfield Field passwordapp blocked_attack_page Ljava/awt/Panel;
L377:   aload_0
L378:   ldc "Due to repeated attempts at password recovery from your ip"
L380:   bipush 80
L382:   aload_0
L383:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L386:   getfield Field java/awt/Dimension height I
L389:   iconst_2
L390:   idiv
L391:   bipush 20
L393:   isub
L394:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L397:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L400:   pop
L401:   aload_0
L402:   getfield Field passwordapp blocked_attack_page Ljava/awt/Panel;
L405:   aload_0
L406:   ldc "your request has been denied. Please try again later."
L408:   bipush 80
L410:   aload_0
L411:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L414:   getfield Field java/awt/Dimension height I
L417:   iconst_2
L418:   idiv
L419:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L422:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L425:   pop
L426:   aload_0
L427:   getfield Field passwordapp blocked_attack_page Ljava/awt/Panel;
L430:   iconst_0
L431:   invokevirtual Method java/awt/Component setVisible (Z)V
L434:   aload_0
L435:   aload_0
L436:   getfield Field passwordapp blocked_attack_page Ljava/awt/Panel;
L439:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L442:   pop
L443:   aload_0
L444:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L447:   getfield Field java/awt/Dimension height I
L450:   iconst_2
L451:   idiv
L452:   bipush 20
L454:   isub
L455:   istore_2
L456:   aload_0
L457:   new java/awt/Panel
L460:   dup
L461:   aconst_null
L462:   invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L465:   putfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L468:   aload_0
L469:   getfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L472:   aload_0
L473:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L476:   invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L479:   aload_0
L480:   getfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L483:   aload_0
L484:   ldc "You entered your existing password incorrectly."
L486:   bipush 110
L488:   iload_2
L489:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L492:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L495:   pop
L496:   aload_0
L497:   getfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L500:   iconst_0
L501:   invokevirtual Method java/awt/Component setVisible (Z)V
L504:   new java/awt/Button
L507:   dup
L508:   ldc "Go Back"
L510:   invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L513:   astore_3
L514:   aload_3
L515:   sipush 150
L518:   iload_2
L519:   bipush 30
L521:   iadd
L522:   sipush 200
L525:   bipush 22
L527:   invokevirtual Method java/awt/Component setBounds (IIII)V
L530:   aload_3
L531:   aload_0
L532:   invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L535:   aload_0
L536:   getfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L539:   aload_3
L540:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L543:   pop
L544:   aload_0
L545:   aload_0
L546:   getfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L549:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L552:   pop
L553:   aload_0
L554:   new java/awt/Panel
L557:   dup
L558:   aconst_null
L559:   invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L562:   putfield Field passwordapp change_questions_success_page_active Ljava/awt/Panel;
L565:   aload_0
L566:   getfield Field passwordapp change_questions_success_page_active Ljava/awt/Panel;
L569:   aload_0
L570:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L573:   invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L576:   aload_0
L577:   getfield Field passwordapp change_questions_success_page_active Ljava/awt/Panel;
L580:   aload_0
L581:   ldc "Your Recovery Questions and Answers have been successfully updated"
L583:   bipush 30
L585:   aload_0
L586:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L589:   getfield Field java/awt/Dimension height I
L592:   iconst_2
L593:   idiv
L594:   bipush 10
L596:   isub
L597:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L600:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L603:   pop
L604:   aload_0
L605:   getfield Field passwordapp change_questions_success_page_active Ljava/awt/Panel;
L608:   aload_0
L609:   ldc "and are now active."
L611:   bipush 30
L613:   aload_0
L614:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L617:   getfield Field java/awt/Dimension height I
L620:   iconst_2
L621:   idiv
L622:   bipush 10
L624:   iadd
L625:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L628:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L631:   pop
L632:   aload_0
L633:   getfield Field passwordapp change_questions_success_page_active Ljava/awt/Panel;
L636:   iconst_0
L637:   invokevirtual Method java/awt/Component setVisible (Z)V
L640:   aload_0
L641:   aload_0
L642:   getfield Field passwordapp change_questions_success_page_active Ljava/awt/Panel;
L645:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L648:   pop
L649:   aload_0
L650:   new java/awt/Panel
L653:   dup
L654:   aconst_null
L655:   invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L658:   putfield Field passwordapp change_questions_success_page_pending Ljava/awt/Panel;
L661:   aload_0
L662:   getfield Field passwordapp change_questions_success_page_pending Ljava/awt/Panel;
L665:   aload_0
L666:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L669:   invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L672:   aload_0
L673:   getfield Field passwordapp change_questions_success_page_pending Ljava/awt/Panel;
L676:   aload_0
L677:   ldc "Your Recovery Questions and Answers have been successfully set"
L679:   bipush 30
L681:   aload_0
L682:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L685:   getfield Field java/awt/Dimension height I
L688:   iconst_2
L689:   idiv
L690:   bipush 10
L692:   isub
L693:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L696:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L699:   pop
L700:   aload_0
L701:   getfield Field passwordapp change_questions_success_page_pending Ljava/awt/Panel;
L704:   aload_0
L705:   ldc "and are pending. They will become active in 14 days."
L707:   bipush 30
L709:   aload_0
L710:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L713:   getfield Field java/awt/Dimension height I
L716:   iconst_2
L717:   idiv
L718:   bipush 10
L720:   iadd
L721:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L724:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L727:   pop
L728:   aload_0
L729:   getfield Field passwordapp change_questions_success_page_pending Ljava/awt/Panel;
L732:   iconst_0
L733:   invokevirtual Method java/awt/Component setVisible (Z)V
L736:   aload_0
L737:   aload_0
L738:   getfield Field passwordapp change_questions_success_page_pending Ljava/awt/Panel;
L741:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L744:   pop
L745:   aload_0
L746:   new java/awt/Panel
L749:   dup
L750:   aconst_null
L751:   invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L754:   putfield Field passwordapp change_questions_tooshort_page Ljava/awt/Panel;
L757:   aload_0
L758:   getfield Field passwordapp change_questions_tooshort_page Ljava/awt/Panel;
L761:   aload_0
L762:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L765:   invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L768:   aload_0
L769:   getfield Field passwordapp change_questions_tooshort_page Ljava/awt/Panel;
L772:   aload_0
L773:   ldc "One or more of the questions or answers"
L775:   sipush 130
L778:   sipush 200
L781:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L784:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L787:   pop
L788:   aload_0
L789:   getfield Field passwordapp change_questions_tooshort_page Ljava/awt/Panel;
L792:   aload_0
L793:   ldc "that you gave was too short or empty."
L795:   sipush 140
L798:   sipush 220
L801:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L804:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L807:   pop
L808:   aload_0
L809:   getfield Field passwordapp change_questions_tooshort_page Ljava/awt/Panel;
L812:   iconst_0
L813:   invokevirtual Method java/awt/Component setVisible (Z)V
L816:   new java/awt/Button
L819:   dup
L820:   ldc "Go Back"
L822:   invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L825:   astore_3
L826:   aload_3
L827:   sipush 150
L830:   sipush 250
L833:   sipush 200
L836:   bipush 22
L838:   invokevirtual Method java/awt/Component setBounds (IIII)V
L841:   aload_3
L842:   aload_0
L843:   invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L846:   aload_0
L847:   getfield Field passwordapp change_questions_tooshort_page Ljava/awt/Panel;
L850:   aload_3
L851:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L854:   pop
L855:   aload_0
L856:   aload_0
L857:   getfield Field passwordapp change_questions_tooshort_page Ljava/awt/Panel;
L860:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L863:   pop
L864:   aload_0
L865:   new java/awt/Panel
L868:   dup
L869:   aconst_null
L870:   invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L873:   putfield Field passwordapp change_questions_samequestions_page Ljava/awt/Panel;
L876:   aload_0
L877:   getfield Field passwordapp change_questions_samequestions_page Ljava/awt/Panel;
L880:   aload_0
L881:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L884:   invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L887:   aload_0
L888:   getfield Field passwordapp change_questions_samequestions_page Ljava/awt/Panel;
L891:   aload_0
L892:   ldc "Two or more of the questions you entered were"
L894:   bipush 120
L896:   sipush 200
L899:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L902:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L905:   pop
L906:   aload_0
L907:   getfield Field passwordapp change_questions_samequestions_page Ljava/awt/Panel;
L910:   aload_0
L911:   ldc "the same. All questions must be different."
L913:   sipush 130
L916:   sipush 220
L919:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L922:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L925:   pop
L926:   aload_0
L927:   getfield Field passwordapp change_questions_samequestions_page Ljava/awt/Panel;
L930:   iconst_0
L931:   invokevirtual Method java/awt/Component setVisible (Z)V
L934:   new java/awt/Button
L937:   dup
L938:   ldc "Go Back"
L940:   invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L943:   astore_3
L944:   aload_3
L945:   sipush 150
L948:   sipush 250
L951:   sipush 200
L954:   bipush 22
L956:   invokevirtual Method java/awt/Component setBounds (IIII)V
L959:   aload_3
L960:   aload_0
L961:   invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L964:   aload_0
L965:   getfield Field passwordapp change_questions_samequestions_page Ljava/awt/Panel;
L968:   aload_3
L969:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L972:   pop
L973:   aload_0
L974:   aload_0
L975:   getfield Field passwordapp change_questions_samequestions_page Ljava/awt/Panel;
L978:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L981:   pop
L982:   aload_0
L983:   new java/awt/Panel
L986:   dup
L987:   aconst_null
L988:   invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L991:   putfield Field passwordapp change_questions_sameanswers_page Ljava/awt/Panel;
L994:   aload_0
L995:   getfield Field passwordapp change_questions_sameanswers_page Ljava/awt/Panel;
L998:   aload_0
L999:   invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L1002:  invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L1005:  aload_0
L1006:  getfield Field passwordapp change_questions_sameanswers_page Ljava/awt/Panel;
L1009:  aload_0
L1010:  ldc "Two or more of the answers you entered were"
L1012:  bipush 120
L1014:  sipush 200
L1017:  invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L1020:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1023:  pop
L1024:  aload_0
L1025:  getfield Field passwordapp change_questions_sameanswers_page Ljava/awt/Panel;
L1028:  aload_0
L1029:  ldc "the same. All answers must be different."
L1031:  sipush 130
L1034:  sipush 220
L1037:  invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L1040:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1043:  pop
L1044:  aload_0
L1045:  getfield Field passwordapp change_questions_sameanswers_page Ljava/awt/Panel;
L1048:  iconst_0
L1049:  invokevirtual Method java/awt/Component setVisible (Z)V
L1052:  new java/awt/Button
L1055:  dup
L1056:  ldc "Go Back"
L1058:  invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L1061:  astore_3
L1062:  aload_3
L1063:  sipush 150
L1066:  sipush 250
L1069:  sipush 200
L1072:  bipush 22
L1074:  invokevirtual Method java/awt/Component setBounds (IIII)V
L1077:  aload_3
L1078:  aload_0
L1079:  invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L1082:  aload_0
L1083:  getfield Field passwordapp change_questions_sameanswers_page Ljava/awt/Panel;
L1086:  aload_3
L1087:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1090:  pop
L1091:  aload_0
L1092:  aload_0
L1093:  getfield Field passwordapp change_questions_sameanswers_page Ljava/awt/Panel;
L1096:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1099:  pop
L1100:  aload_0
L1101:  new java/awt/Panel
L1104:  dup
L1105:  aconst_null
L1106:  invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L1109:  putfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L1112:  aload_0
L1113:  getfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L1116:  aload_0
L1117:  invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L1120:  invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L1123:  aload_0
L1124:  getfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L1127:  aload_0
L1128:  ldc "One or more of your questions matches one"
L1130:  bipush 120
L1132:  sipush 200
L1135:  invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L1138:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1141:  pop
L1142:  aload_0
L1143:  getfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L1146:  aload_0
L1147:  ldc "of the answers you entered. Please make sure"
L1149:  bipush 110
L1151:  sipush 220
L1154:  invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L1157:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1160:  pop
L1161:  aload_0
L1162:  getfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L1165:  aload_0
L1166:  ldc "that none of your answers match any of your questions."
L1168:  bipush 90
L1170:  sipush 240
L1173:  invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L1176:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1179:  pop
L1180:  aload_0
L1181:  getfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L1184:  iconst_0
L1185:  invokevirtual Method java/awt/Component setVisible (Z)V
L1188:  new java/awt/Button
L1191:  dup
L1192:  ldc "Go Back"
L1194:  invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L1197:  astore_3
L1198:  aload_3
L1199:  sipush 150
L1202:  sipush 270
L1205:  sipush 200
L1208:  bipush 22
L1210:  invokevirtual Method java/awt/Component setBounds (IIII)V
L1213:  aload_3
L1214:  aload_0
L1215:  invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L1218:  aload_0
L1219:  getfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L1222:  aload_3
L1223:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1226:  pop
L1227:  aload_0
L1228:  aload_0
L1229:  getfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L1232:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1235:  pop
L1236:  return
L1237:  
        .linenumbertable
            L0 76
            L12 77
            L23 78
            L45 79
            L61 80
            L70 81
            L78 82
            L87 84
            L100 85
            L112 86
            L123 87
            L134 88
            L150 89
            L159 90
            L179 91
            L200 92
            L210 93
            L226 94
            L231 95
            L240 96
            L248 97
            L257 99
            L269 100
            L280 101
            L308 102
            L333 103
            L341 104
            L350 106
            L362 107
            L373 108
            L401 109
            L426 110
            L434 111
            L443 114
            L456 115
            L468 116
            L479 117
            L496 118
            L504 119
            L514 120
            L530 121
            L535 122
            L544 123
            L553 125
            L565 126
            L576 127
            L604 128
            L632 129
            L640 130
            L649 132
            L661 133
            L672 134
            L700 135
            L728 136
            L736 137
            L745 140
            L757 141
            L768 142
            L788 143
            L808 144
            L816 145
            L826 146
            L841 147
            L846 148
            L855 149
            L864 151
            L876 152
            L887 153
            L906 154
            L926 155
            L934 156
            L944 157
            L959 158
            L964 159
            L973 160
            L982 162
            L994 163
            L1005 164
            L1024 165
            L1044 166
            L1052 167
            L1062 168
            L1077 169
            L1082 170
            L1091 171
            L1100 173
            L1112 174
            L1123 175
            L1142 176
            L1161 177
            L1180 178
            L1188 179
            L1198 180
            L1213 181
            L1218 182
            L1227 183
            L1236 75
        .end linenumbertable
    .end code
.end method

.method private init_change_questions : ()V
    .code stack 9 locals 5
L0:     aload_0
L1:     new java/awt/Panel
L4:     dup
L5:     aconst_null
L6:     invokespecial Method java/awt/Panel <init> (Ljava/awt/LayoutManager;)V
L9:     putfield Field passwordapp change_questions_page Ljava/awt/Panel;
L12:    bipush 100
L14:    istore_1
L15:    aload_0
L16:    aload_0
L17:    bipush 20
L19:    sipush 150
L22:    iconst_0
L23:    sipush 150
L26:    bipush 20
L28:    iconst_1
L29:    invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L32:    putfield Field passwordapp password1 Ljava/awt/TextField;
L35:    aload_0
L36:    getfield Field passwordapp question [Ljava/awt/TextField;
L39:    iconst_0
L40:    aload_0
L41:    bipush 40
L43:    iload_1
L44:    bipush 70
L46:    sipush 250
L49:    bipush 20
L51:    iconst_0
L52:    invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L55:    aastore
L56:    aload_0
L57:    getfield Field passwordapp question [Ljava/awt/TextField;
L60:    iconst_0
L61:    aaload
L62:    aload_0
L63:    getfield Field passwordapp example_questions [Ljava/lang/String;
L66:    iconst_0
L67:    aaload
L68:    invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L71:    aload_0
L72:    getfield Field passwordapp recov [Ljava/awt/TextField;
L75:    iconst_0
L76:    aload_0
L77:    bipush 40
L79:    iload_1
L80:    bipush 100
L82:    sipush 250
L85:    bipush 20
L87:    iconst_1
L88:    invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L91:    aastore
L92:    aload_0
L93:    getfield Field passwordapp question [Ljava/awt/TextField;
L96:    iconst_1
L97:    aload_0
L98:    bipush 40
L100:   iload_1
L101:   sipush 170
L104:   sipush 250
L107:   bipush 20
L109:   iconst_0
L110:   invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L113:   aastore
L114:   aload_0
L115:   getfield Field passwordapp question [Ljava/awt/TextField;
L118:   iconst_1
L119:   aaload
L120:   aload_0
L121:   getfield Field passwordapp example_questions [Ljava/lang/String;
L124:   iconst_1
L125:   aaload
L126:   invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L129:   aload_0
L130:   getfield Field passwordapp recov [Ljava/awt/TextField;
L133:   iconst_1
L134:   aload_0
L135:   bipush 40
L137:   iload_1
L138:   sipush 200
L141:   sipush 250
L144:   bipush 20
L146:   iconst_1
L147:   invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L150:   aastore
L151:   aload_0
L152:   getfield Field passwordapp question [Ljava/awt/TextField;
L155:   iconst_2
L156:   aload_0
L157:   bipush 40
L159:   iload_1
L160:   sipush 270
L163:   sipush 250
L166:   bipush 20
L168:   iconst_0
L169:   invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L172:   aastore
L173:   aload_0
L174:   getfield Field passwordapp question [Ljava/awt/TextField;
L177:   iconst_2
L178:   aaload
L179:   aload_0
L180:   getfield Field passwordapp example_questions [Ljava/lang/String;
L183:   iconst_2
L184:   aaload
L185:   invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L188:   aload_0
L189:   getfield Field passwordapp recov [Ljava/awt/TextField;
L192:   iconst_2
L193:   aload_0
L194:   bipush 40
L196:   iload_1
L197:   sipush 300
L200:   sipush 250
L203:   bipush 20
L205:   iconst_1
L206:   invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L209:   aastore
L210:   aload_0
L211:   getfield Field passwordapp question [Ljava/awt/TextField;
L214:   iconst_3
L215:   aload_0
L216:   bipush 40
L218:   iload_1
L219:   sipush 370
L222:   sipush 250
L225:   bipush 20
L227:   iconst_0
L228:   invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L231:   aastore
L232:   aload_0
L233:   getfield Field passwordapp question [Ljava/awt/TextField;
L236:   iconst_3
L237:   aaload
L238:   aload_0
L239:   getfield Field passwordapp example_questions [Ljava/lang/String;
L242:   iconst_3
L243:   aaload
L244:   invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L247:   aload_0
L248:   getfield Field passwordapp recov [Ljava/awt/TextField;
L251:   iconst_3
L252:   aload_0
L253:   bipush 40
L255:   iload_1
L256:   sipush 400
L259:   sipush 250
L262:   bipush 20
L264:   iconst_1
L265:   invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L268:   aastore
L269:   aload_0
L270:   getfield Field passwordapp question [Ljava/awt/TextField;
L273:   iconst_4
L274:   aload_0
L275:   bipush 40
L277:   iload_1
L278:   sipush 470
L281:   sipush 250
L284:   bipush 20
L286:   iconst_0
L287:   invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L290:   aastore
L291:   aload_0
L292:   getfield Field passwordapp question [Ljava/awt/TextField;
L295:   iconst_4
L296:   aaload
L297:   aload_0
L298:   getfield Field passwordapp example_questions [Ljava/lang/String;
L301:   iconst_4
L302:   aaload
L303:   invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L306:   aload_0
L307:   getfield Field passwordapp recov [Ljava/awt/TextField;
L310:   iconst_4
L311:   aload_0
L312:   bipush 40
L314:   iload_1
L315:   sipush 500
L318:   sipush 250
L321:   bipush 20
L323:   iconst_1
L324:   invokespecial Method passwordapp getTextField (IIIIIZ)Ljava/awt/TextField;
L327:   aastore
L328:   aload_0
L329:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L332:   getstatic Field java/awt/Color black Ljava/awt/Color;
L335:   invokevirtual Method java/awt/Component setBackground (Ljava/awt/Color;)V
L338:   aload_0
L339:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L342:   aload_0
L343:   ldc "Current Password:"
L345:   iconst_0
L346:   iconst_0
L347:   sipush 150
L350:   bipush 20
L352:   invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L355:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L358:   pop
L359:   aload_0
L360:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L363:   aload_0
L364:   getfield Field passwordapp password1 Ljava/awt/TextField;
L367:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L370:   pop
L371:   aload_0
L372:   ldc "Recovery Question 1"
L374:   iconst_0
L375:   bipush 40
L377:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L380:   astore_2
L381:   aload_2
L382:   new java/awt/Font
L385:   dup
L386:   ldc "Arial"
L388:   iconst_1
L389:   bipush 13
L391:   invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L394:   invokevirtual Method java/awt/Component setFont (Ljava/awt/Font;)V
L397:   aload_0
L398:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L401:   aload_2
L402:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L405:   pop
L406:   aload_0
L407:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L410:   aload_0
L411:   ldc "Question:"
L413:   iconst_0
L414:   bipush 70
L416:   bipush 100
L418:   bipush 20
L420:   invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L423:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L426:   pop
L427:   aload_0
L428:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L431:   aload_0
L432:   getfield Field passwordapp question [Ljava/awt/TextField;
L435:   iconst_0
L436:   aaload
L437:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L440:   pop
L441:   new java/awt/Button
L444:   dup
L445:   ldc "New Question"
L447:   invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L450:   astore_3
L451:   aload_3
L452:   ldc "NEWRQ1"
L454:   invokevirtual Method java/awt/Button setActionCommand (Ljava/lang/String;)V
L457:   aload_3
L458:   sipush 360
L461:   bipush 70
L463:   sipush 140
L466:   bipush 22
L468:   invokevirtual Method java/awt/Component setBounds (IIII)V
L471:   aload_3
L472:   aload_0
L473:   invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L476:   aload_0
L477:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L480:   aload_3
L481:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L484:   pop
L485:   aload_0
L486:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L489:   aload_0
L490:   ldc "Answer:"
L492:   iconst_0
L493:   bipush 100
L495:   bipush 100
L497:   bipush 20
L499:   invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L502:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L505:   pop
L506:   aload_0
L507:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L510:   aload_0
L511:   getfield Field passwordapp recov [Ljava/awt/TextField;
L514:   iconst_0
L515:   aaload
L516:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L519:   pop
L520:   aload_0
L521:   ldc "Recovery Question 2"
L523:   iconst_0
L524:   sipush 140
L527:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L530:   astore_2
L531:   aload_2
L532:   new java/awt/Font
L535:   dup
L536:   ldc "Arial"
L538:   iconst_1
L539:   bipush 13
L541:   invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L544:   invokevirtual Method java/awt/Component setFont (Ljava/awt/Font;)V
L547:   aload_0
L548:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L551:   aload_2
L552:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L555:   pop
L556:   aload_0
L557:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L560:   aload_0
L561:   ldc "Question:"
L563:   iconst_0
L564:   sipush 170
L567:   bipush 100
L569:   bipush 20
L571:   invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L574:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L577:   pop
L578:   aload_0
L579:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L582:   aload_0
L583:   getfield Field passwordapp question [Ljava/awt/TextField;
L586:   iconst_1
L587:   aaload
L588:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L591:   pop
L592:   new java/awt/Button
L595:   dup
L596:   ldc "New Question"
L598:   invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L601:   astore_3
L602:   aload_3
L603:   ldc "NEWRQ2"
L605:   invokevirtual Method java/awt/Button setActionCommand (Ljava/lang/String;)V
L608:   aload_3
L609:   sipush 360
L612:   sipush 170
L615:   sipush 140
L618:   bipush 22
L620:   invokevirtual Method java/awt/Component setBounds (IIII)V
L623:   aload_3
L624:   aload_0
L625:   invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L628:   aload_0
L629:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L632:   aload_3
L633:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L636:   pop
L637:   aload_0
L638:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L641:   aload_0
L642:   ldc "Answer:"
L644:   iconst_0
L645:   sipush 200
L648:   bipush 100
L650:   bipush 20
L652:   invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L655:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L658:   pop
L659:   aload_0
L660:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L663:   aload_0
L664:   getfield Field passwordapp recov [Ljava/awt/TextField;
L667:   iconst_1
L668:   aaload
L669:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L672:   pop
L673:   aload_0
L674:   ldc "Recovery Question 3"
L676:   iconst_0
L677:   sipush 240
L680:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L683:   astore_2
L684:   aload_2
L685:   new java/awt/Font
L688:   dup
L689:   ldc "Arial"
L691:   iconst_1
L692:   bipush 13
L694:   invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L697:   invokevirtual Method java/awt/Component setFont (Ljava/awt/Font;)V
L700:   aload_0
L701:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L704:   aload_2
L705:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L708:   pop
L709:   aload_0
L710:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L713:   aload_0
L714:   ldc "Question:"
L716:   iconst_0
L717:   sipush 270
L720:   bipush 100
L722:   bipush 20
L724:   invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L727:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L730:   pop
L731:   aload_0
L732:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L735:   aload_0
L736:   getfield Field passwordapp question [Ljava/awt/TextField;
L739:   iconst_2
L740:   aaload
L741:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L744:   pop
L745:   new java/awt/Button
L748:   dup
L749:   ldc "New Question"
L751:   invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L754:   astore_3
L755:   aload_3
L756:   ldc "NEWRQ3"
L758:   invokevirtual Method java/awt/Button setActionCommand (Ljava/lang/String;)V
L761:   aload_3
L762:   sipush 360
L765:   sipush 270
L768:   sipush 140
L771:   bipush 22
L773:   invokevirtual Method java/awt/Component setBounds (IIII)V
L776:   aload_3
L777:   aload_0
L778:   invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L781:   aload_0
L782:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L785:   aload_3
L786:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L789:   pop
L790:   aload_0
L791:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L794:   aload_0
L795:   ldc "Answer:"
L797:   iconst_0
L798:   sipush 300
L801:   bipush 100
L803:   bipush 20
L805:   invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L808:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L811:   pop
L812:   aload_0
L813:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L816:   aload_0
L817:   getfield Field passwordapp recov [Ljava/awt/TextField;
L820:   iconst_2
L821:   aaload
L822:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L825:   pop
L826:   aload_0
L827:   ldc "Recovery Question 4"
L829:   iconst_0
L830:   sipush 340
L833:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L836:   astore_2
L837:   aload_2
L838:   new java/awt/Font
L841:   dup
L842:   ldc "Arial"
L844:   iconst_1
L845:   bipush 13
L847:   invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L850:   invokevirtual Method java/awt/Component setFont (Ljava/awt/Font;)V
L853:   aload_0
L854:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L857:   aload_2
L858:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L861:   pop
L862:   aload_0
L863:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L866:   aload_0
L867:   ldc "Question:"
L869:   iconst_0
L870:   sipush 370
L873:   bipush 100
L875:   bipush 20
L877:   invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L880:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L883:   pop
L884:   aload_0
L885:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L888:   aload_0
L889:   getfield Field passwordapp question [Ljava/awt/TextField;
L892:   iconst_3
L893:   aaload
L894:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L897:   pop
L898:   new java/awt/Button
L901:   dup
L902:   ldc "New Question"
L904:   invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L907:   astore_3
L908:   aload_3
L909:   ldc "NEWRQ4"
L911:   invokevirtual Method java/awt/Button setActionCommand (Ljava/lang/String;)V
L914:   aload_3
L915:   sipush 360
L918:   sipush 370
L921:   sipush 140
L924:   bipush 22
L926:   invokevirtual Method java/awt/Component setBounds (IIII)V
L929:   aload_3
L930:   aload_0
L931:   invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L934:   aload_0
L935:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L938:   aload_3
L939:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L942:   pop
L943:   aload_0
L944:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L947:   aload_0
L948:   ldc "Answer:"
L950:   iconst_0
L951:   sipush 400
L954:   bipush 100
L956:   bipush 20
L958:   invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L961:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L964:   pop
L965:   aload_0
L966:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L969:   aload_0
L970:   getfield Field passwordapp recov [Ljava/awt/TextField;
L973:   iconst_3
L974:   aaload
L975:   invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L978:   pop
L979:   aload_0
L980:   ldc "Recovery Question 5"
L982:   iconst_0
L983:   sipush 440
L986:   invokespecial Method passwordapp getLabel (Ljava/lang/String;II)Ljava/awt/Label;
L989:   astore_2
L990:   aload_2
L991:   new java/awt/Font
L994:   dup
L995:   ldc "Arial"
L997:   iconst_1
L998:   bipush 13
L1000:  invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L1003:  invokevirtual Method java/awt/Component setFont (Ljava/awt/Font;)V
L1006:  aload_0
L1007:  getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L1010:  aload_2
L1011:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1014:  pop
L1015:  aload_0
L1016:  getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L1019:  aload_0
L1020:  ldc "Question:"
L1022:  iconst_0
L1023:  sipush 470
L1026:  bipush 100
L1028:  bipush 20
L1030:  invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L1033:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1036:  pop
L1037:  aload_0
L1038:  getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L1041:  aload_0
L1042:  getfield Field passwordapp question [Ljava/awt/TextField;
L1045:  iconst_4
L1046:  aaload
L1047:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1050:  pop
L1051:  new java/awt/Button
L1054:  dup
L1055:  ldc "New Question"
L1057:  invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L1060:  astore_3
L1061:  aload_3
L1062:  ldc "NEWRQ5"
L1064:  invokevirtual Method java/awt/Button setActionCommand (Ljava/lang/String;)V
L1067:  aload_3
L1068:  sipush 360
L1071:  sipush 470
L1074:  sipush 140
L1077:  bipush 22
L1079:  invokevirtual Method java/awt/Component setBounds (IIII)V
L1082:  aload_3
L1083:  aload_0
L1084:  invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L1087:  aload_0
L1088:  getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L1091:  aload_3
L1092:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1095:  pop
L1096:  aload_0
L1097:  getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L1100:  aload_0
L1101:  ldc "Answer:"
L1103:  iconst_0
L1104:  sipush 500
L1107:  bipush 100
L1109:  bipush 20
L1111:  invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L1114:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1117:  pop
L1118:  aload_0
L1119:  getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L1122:  aload_0
L1123:  getfield Field passwordapp recov [Ljava/awt/TextField;
L1126:  iconst_4
L1127:  aaload
L1128:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1131:  pop
L1132:  new java/awt/Button
L1135:  dup
L1136:  ldc "Submit Questions & Answers"
L1138:  invokespecial Method java/awt/Button <init> (Ljava/lang/String;)V
L1141:  astore 4
L1143:  aload 4
L1145:  sipush 150
L1148:  sipush 540
L1151:  sipush 200
L1154:  bipush 22
L1156:  invokevirtual Method java/awt/Component setBounds (IIII)V
L1159:  aload 4
L1161:  aload_0
L1162:  invokevirtual Method java/awt/Button addActionListener (Ljava/awt/event/ActionListener;)V
L1165:  aload_0
L1166:  getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L1169:  aload 4
L1171:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1174:  pop
L1175:  aload_0
L1176:  getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L1179:  aload_0
L1180:  invokevirtual Method java/awt/Component getSize ()Ljava/awt/Dimension;
L1183:  invokevirtual Method java/awt/Component setSize (Ljava/awt/Dimension;)V
L1186:  aload_0
L1187:  aload_0
L1188:  getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L1191:  invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L1194:  pop
L1195:  return
L1196:  
        .linenumbertable
            L0 188
            L12 190
            L15 192
            L35 193
            L56 194
            L71 195
            L92 196
            L114 197
            L129 198
            L151 199
            L173 200
            L188 201
            L210 202
            L232 203
            L247 204
            L269 205
            L291 206
            L306 207
            L328 209
            L338 211
            L359 212
            L371 214
            L381 215
            L397 216
            L406 218
            L427 219
            L441 220
            L451 221
            L457 222
            L471 223
            L476 224
            L485 225
            L506 226
            L520 228
            L531 229
            L547 230
            L556 232
            L578 233
            L592 234
            L602 235
            L608 236
            L623 237
            L628 238
            L637 239
            L659 240
            L673 242
            L684 243
            L700 244
            L709 246
            L731 247
            L745 248
            L755 249
            L761 250
            L776 251
            L781 252
            L790 253
            L812 254
            L826 256
            L837 257
            L853 258
            L862 260
            L884 261
            L898 262
            L908 263
            L914 264
            L929 265
            L934 266
            L943 267
            L965 268
            L979 270
            L990 271
            L1006 272
            L1015 274
            L1037 275
            L1051 276
            L1061 277
            L1067 278
            L1082 279
            L1087 280
            L1096 281
            L1118 282
            L1132 284
            L1143 285
            L1159 286
            L1165 287
            L1175 289
            L1186 290
            L1195 187
        .end linenumbertable
    .end code
.end method

.method private getLabel : (Ljava/lang/String;II)Ljava/awt/Label;
    .code stack 6 locals 4
L0:     aload_0
L1:     aload_1
L2:     iload_2
L3:     iload_3
L4:     aload_1
L5:     invokevirtual Method java/lang/String length ()I
L8:     bipush 8
L10:    imul
L11:    bipush 20
L13:    invokespecial Method passwordapp getLabel (Ljava/lang/String;IIII)Ljava/awt/Label;
L16:    areturn
L17:    
        .linenumbertable
            L0 297
        .end linenumbertable
    .end code
.end method

.method private getLabel : (Ljava/lang/String;IIII)Ljava/awt/Label;
    .code stack 6 locals 7
L0:     new java/awt/Label
L3:     dup
L4:     aload_1
L5:     iconst_0
L6:     invokespecial Method java/awt/Label <init> (Ljava/lang/String;I)V
L9:     astore 6
L11:    aload 6
L13:    getstatic Field java/awt/Color white Ljava/awt/Color;
L16:    invokevirtual Method java/awt/Component setForeground (Ljava/awt/Color;)V
L19:    aload 6
L21:    getstatic Field java/awt/Color black Ljava/awt/Color;
L24:    invokevirtual Method java/awt/Component setBackground (Ljava/awt/Color;)V
L27:    aload 6
L29:    new java/awt/Font
L32:    dup
L33:    ldc "Arial"
L35:    iconst_0
L36:    bipush 13
L38:    invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L41:    invokevirtual Method java/awt/Component setFont (Ljava/awt/Font;)V
L44:    aload 6
L46:    iload_2
L47:    iload_3
L48:    iload 4
L50:    iload 5
L52:    invokevirtual Method java/awt/Component setBounds (IIII)V
L55:    aload 6
L57:    areturn
L58:    
        .linenumbertable
            L0 304
            L11 305
            L19 306
            L27 307
            L44 308
            L55 309
        .end linenumbertable
    .end code
.end method

.method private getTextField : (IIIIIZ)Ljava/awt/TextField;
    .code stack 5 locals 8
L0:     new java/awt/TextField
L3:     dup
L4:     iload_1
L5:     invokespecial Method java/awt/TextField <init> (I)V
L8:     astore 7
L10:    aload 7
L12:    iload_2
L13:    iload_3
L14:    iload 4
L16:    iload 5
L18:    invokevirtual Method java/awt/Component setBounds (IIII)V
L21:    iload 6
L23:    ifeq L33
L26:    aload 7
L28:    bipush 42
L30:    invokevirtual Method java/awt/TextField setEchoChar (C)V
L33:    aload 7
L35:    aload_0
L36:    invokevirtual Method java/awt/TextComponent addTextListener (Ljava/awt/event/TextListener;)V
L39:    aload 7
L41:    aload_0
L42:    invokevirtual Method java/awt/Component addKeyListener (Ljava/awt/event/KeyListener;)V
L45:    aload 7
L47:    getstatic Field java/awt/Color black Ljava/awt/Color;
L50:    invokevirtual Method java/awt/Component setForeground (Ljava/awt/Color;)V
L53:    aload 7
L55:    getstatic Field java/awt/Color white Ljava/awt/Color;
L58:    invokevirtual Method java/awt/Component setBackground (Ljava/awt/Color;)V
L61:    aload 7
L63:    areturn
L64:    
        .linenumbertable
            L0 313
            L10 314
            L21 315
            L33 316
            L39 317
            L45 318
            L53 319
            L61 320
        .end linenumbertable
    .end code
.end method

.method private safesizestring : (Ljava/lang/String;I)Ljava/lang/String;
    .code stack 3 locals 3
L0:     aload_1
L1:     invokevirtual Method java/lang/String trim ()Ljava/lang/String;
L4:     astore_1
L5:     aload_1
L6:     invokevirtual Method java/lang/String length ()I
L9:     iload_2
L10:    if_icmple L20
L13:    aload_1
L14:    iconst_0
L15:    iload_2
L16:    invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L19:    areturn
L20:    aload_1
L21:    areturn
L22:    
        .linenumbertable
            L0 328
            L5 329
            L20 330
        .end linenumbertable
    .end code
.end method

.method public static tidyrecoveryanswer : (Ljava/lang/String;)Ljava/lang/String;
    .code stack 2 locals 4
L0:     aload_0
L1:     invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L4:     astore_0
L5:     new java/lang/StringBuffer
L8:     dup
L9:     invokespecial Method java/lang/StringBuffer <init> ()V
L12:    astore_1
L13:    iconst_0
L14:    istore_2
L15:    goto L63
L18:    aload_0
L19:    iload_2
L20:    invokevirtual Method java/lang/String charAt (I)C
L23:    istore_3
L24:    iload_3
L25:    bipush 97
L27:    if_icmplt L42
L30:    iload_3
L31:    bipush 122
L33:    if_icmpgt L42
L36:    aload_1
L37:    iload_3
L38:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L41:    pop
L42:    iload_3
L43:    bipush 48
L45:    if_icmplt L60
L48:    iload_3
L49:    bipush 57
L51:    if_icmpgt L60
L54:    aload_1
L55:    iload_3
L56:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L59:    pop
L60:    iinc 2 1
L63:    iload_2
L64:    aload_0
L65:    invokevirtual Method java/lang/String length ()I
L68:    if_icmpge L77
L71:    iload_2
L72:    bipush 50
L74:    if_icmplt L18
L77:    aload_1
L78:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L81:    areturn
L82:    
        .linenumbertable
            L0 337
            L5 338
            L13 339
            L18 340
            L24 341
            L42 342
            L60 339
            L77 344
        .end linenumbertable
    .end code
.end method

.method public static urlencode : (Ljava/lang/String;)Ljava/lang/String;
    .code stack 3 locals 5
L0:     new java/lang/StringBuffer
L3:     dup
L4:     aload_0
L5:     invokevirtual Method java/lang/String length ()I
L8:     invokespecial Method java/lang/StringBuffer <init> (I)V
L11:    astore_1
L12:    iconst_0
L13:    istore_2
L14:    goto L200
L17:    aload_0
L18:    iload_2
L19:    invokevirtual Method java/lang/String charAt (I)C
L22:    istore_3
L23:    iload_3
L24:    bipush 48
L26:    if_icmplt L35
L29:    iload_3
L30:    bipush 57
L32:    if_icmple L59
L35:    iload_3
L36:    bipush 97
L38:    if_icmplt L47
L41:    iload_3
L42:    bipush 122
L44:    if_icmple L59
L47:    iload_3
L48:    bipush 65
L50:    if_icmplt L68
L53:    iload_3
L54:    bipush 90
L56:    if_icmpgt L68
L59:    aload_1
L60:    iload_3
L61:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L64:    pop
L65:    goto L197
L68:    aload_1
L69:    ldc "%"
L71:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L74:    pop
L75:    iload_3
L76:    iconst_4
L77:    ishr
L78:    bipush 15
L80:    iand
L81:    istore 4
L83:    iload 4
L85:    iflt L109
L88:    iload 4
L90:    bipush 9
L92:    if_icmpgt L109
L95:    aload_1
L96:    iload 4
L98:    bipush 48
L100:   iadd
L101:   i2c
L102:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L105:   pop
L106:   goto L137
L109:   iload 4
L111:   bipush 10
L113:   if_icmplt L137
L116:   iload 4
L118:   bipush 15
L120:   if_icmpgt L137
L123:   aload_1
L124:   iload 4
L126:   bipush 10
L128:   isub
L129:   bipush 65
L131:   iadd
L132:   i2c
L133:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L136:   pop
L137:   iload_3
L138:   bipush 15
L140:   iand
L141:   istore 4
L143:   iload 4
L145:   iflt L169
L148:   iload 4
L150:   bipush 9
L152:   if_icmpgt L169
L155:   aload_1
L156:   iload 4
L158:   bipush 48
L160:   iadd
L161:   i2c
L162:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L165:   pop
L166:   goto L197
L169:   iload 4
L171:   bipush 10
L173:   if_icmplt L197
L176:   iload 4
L178:   bipush 15
L180:   if_icmpgt L197
L183:   aload_1
L184:   iload 4
L186:   bipush 10
L188:   isub
L189:   bipush 65
L191:   iadd
L192:   i2c
L193:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L196:   pop
L197:   iinc 2 1
L200:   iload_2
L201:   aload_0
L202:   invokevirtual Method java/lang/String length ()I
L205:   if_icmplt L17
L208:   aload_1
L209:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L212:   areturn
L213:   
        .linenumbertable
            L0 352
            L12 353
            L17 354
            L23 355
            L68 357
            L75 358
            L83 359
            L109 360
            L137 361
            L143 362
            L169 363
            L197 353
            L208 366
        .end linenumbertable
    .end code
.end method

.method public actionPerformed : (Ljava/awt/event/ActionEvent;)V
    .code stack 5 locals 9
L0:     aload_0
L1:     getfield Field passwordapp onreversepath Z
L4:     ifeq L53
L7:     aload_0
L8:     getfield Field passwordapp hidepanel Ljava/awt/Panel;
L11:    ifnull L27
L14:    aload_0
L15:    getfield Field passwordapp hidepanel Ljava/awt/Panel;
L18:    iconst_0
L19:    invokevirtual Method java/awt/Component setVisible (Z)V
L22:    aload_0
L23:    aconst_null
L24:    putfield Field passwordapp hidepanel Ljava/awt/Panel;
L27:    aload_0
L28:    getfield Field passwordapp showpanel Ljava/awt/Panel;
L31:    ifnull L47
L34:    aload_0
L35:    getfield Field passwordapp showpanel Ljava/awt/Panel;
L38:    iconst_1
L39:    invokevirtual Method java/awt/Component setVisible (Z)V
L42:    aload_0
L43:    aconst_null
L44:    putfield Field passwordapp showpanel Ljava/awt/Panel;
L47:    aload_0
L48:    iconst_0
L49:    putfield Field passwordapp onreversepath Z
L52:    return
L53:    aload_0
L54:    getfield Field passwordapp type I
L57:    iconst_2
L58:    if_icmpne L676
L61:    aload_1
L62:    invokevirtual Method java/awt/event/ActionEvent getActionCommand ()Ljava/lang/String;
L65:    astore_2
L66:    aload_2
L67:    ifnull L198
L70:    aload_2
L71:    ldc "NEWRQ"
L73:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L76:    ifeq L198
L79:    aload_0
L80:    getfield Field passwordapp example_questions [Ljava/lang/String;
L83:    invokestatic Method java/lang/Math random ()D
L86:    aload_0
L87:    getfield Field passwordapp example_questions [Ljava/lang/String;
L90:    arraylength
L91:    iconst_1
L92:    isub
L93:    i2d
L94:    dmul
L95:    d2i
L96:    aaload
L97:    astore_3
L98:    aload_2
L99:    ldc "NEWRQ1"
L101:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L104:   ifeq L118
L107:   aload_0
L108:   getfield Field passwordapp question [Ljava/awt/TextField;
L111:   iconst_0
L112:   aaload
L113:   aload_3
L114:   invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L117:   return
L118:   aload_2
L119:   ldc "NEWRQ2"
L121:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L124:   ifeq L138
L127:   aload_0
L128:   getfield Field passwordapp question [Ljava/awt/TextField;
L131:   iconst_1
L132:   aaload
L133:   aload_3
L134:   invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L137:   return
L138:   aload_2
L139:   ldc "NEWRQ3"
L141:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L144:   ifeq L158
L147:   aload_0
L148:   getfield Field passwordapp question [Ljava/awt/TextField;
L151:   iconst_2
L152:   aaload
L153:   aload_3
L154:   invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L157:   return
L158:   aload_2
L159:   ldc "NEWRQ4"
L161:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L164:   ifeq L178
L167:   aload_0
L168:   getfield Field passwordapp question [Ljava/awt/TextField;
L171:   iconst_3
L172:   aaload
L173:   aload_3
L174:   invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L177:   return
L178:   aload_2
L179:   ldc "NEWRQ5"
L181:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L184:   ifeq L197
L187:   aload_0
L188:   getfield Field passwordapp question [Ljava/awt/TextField;
L191:   iconst_4
L192:   aaload
L193:   aload_3
L194:   invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L197:   return
L198:   aload_0
L199:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L202:   iconst_0
L203:   invokevirtual Method java/awt/Component setVisible (Z)V
L206:   aload_0
L207:   getfield Field passwordapp password1 Ljava/awt/TextField;
L210:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L213:   invokevirtual Method java/lang/String length ()I
L216:   iconst_1
L217:   if_icmplt L235
L220:   aload_0
L221:   getfield Field passwordapp password1 Ljava/awt/TextField;
L224:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L227:   invokevirtual Method java/lang/String length ()I
L230:   bipush 20
L232:   if_icmple L265
L235:   aload_0
L236:   getfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L239:   iconst_1
L240:   invokevirtual Method java/awt/Component setVisible (Z)V
L243:   aload_0
L244:   iconst_1
L245:   putfield Field passwordapp onreversepath Z
L248:   aload_0
L249:   aload_0
L250:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L253:   putfield Field passwordapp showpanel Ljava/awt/Panel;
L256:   aload_0
L257:   aload_0
L258:   getfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L261:   putfield Field passwordapp hidepanel Ljava/awt/Panel;
L264:   return
L265:   iconst_0
L266:   istore_3
L267:   goto L341
L270:   aload_0
L271:   getfield Field passwordapp question [Ljava/awt/TextField;
L274:   iload_3
L275:   aaload
L276:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L279:   invokevirtual Method java/lang/String trim ()Ljava/lang/String;
L282:   invokevirtual Method java/lang/String length ()I
L285:   iconst_3
L286:   if_icmplt L308
L289:   aload_0
L290:   getfield Field passwordapp recov [Ljava/awt/TextField;
L293:   iload_3
L294:   aaload
L295:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L298:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L301:   invokevirtual Method java/lang/String length ()I
L304:   iconst_3
L305:   if_icmpge L338
L308:   aload_0
L309:   getfield Field passwordapp change_questions_tooshort_page Ljava/awt/Panel;
L312:   iconst_1
L313:   invokevirtual Method java/awt/Component setVisible (Z)V
L316:   aload_0
L317:   iconst_1
L318:   putfield Field passwordapp onreversepath Z
L321:   aload_0
L322:   aload_0
L323:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L326:   putfield Field passwordapp showpanel Ljava/awt/Panel;
L329:   aload_0
L330:   aload_0
L331:   getfield Field passwordapp change_questions_tooshort_page Ljava/awt/Panel;
L334:   putfield Field passwordapp hidepanel Ljava/awt/Panel;
L337:   return
L338:   iinc 3 1
L341:   iload_3
L342:   iconst_5
L343:   if_icmplt L270
L346:   iconst_0
L347:   istore 4
L349:   goto L446
L352:   aload_0
L353:   getfield Field passwordapp question [Ljava/awt/TextField;
L356:   iload 4
L358:   aaload
L359:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L362:   invokevirtual Method java/lang/String trim ()Ljava/lang/String;
L365:   astore 5
L367:   aload 5
L369:   ldc ""
L371:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L374:   ifne L443
L377:   iload 4
L379:   iconst_1
L380:   iadd
L381:   istore 6
L383:   goto L437
L386:   aload 5
L388:   aload_0
L389:   getfield Field passwordapp question [Ljava/awt/TextField;
L392:   iload 6
L394:   aaload
L395:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L398:   invokevirtual Method java/lang/String equalsIgnoreCase (Ljava/lang/String;)Z
L401:   ifeq L434
L404:   aload_0
L405:   getfield Field passwordapp change_questions_samequestions_page Ljava/awt/Panel;
L408:   iconst_1
L409:   invokevirtual Method java/awt/Component setVisible (Z)V
L412:   aload_0
L413:   iconst_1
L414:   putfield Field passwordapp onreversepath Z
L417:   aload_0
L418:   aload_0
L419:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L422:   putfield Field passwordapp showpanel Ljava/awt/Panel;
L425:   aload_0
L426:   aload_0
L427:   getfield Field passwordapp change_questions_samequestions_page Ljava/awt/Panel;
L430:   putfield Field passwordapp hidepanel Ljava/awt/Panel;
L433:   return
L434:   iinc 6 1
L437:   iload 6
L439:   iconst_5
L440:   if_icmplt L386
L443:   iinc 4 1
L446:   iload 4
L448:   iconst_5
L449:   if_icmplt L352
L452:   iconst_0
L453:   istore 5
L455:   goto L561
L458:   aload_0
L459:   getfield Field passwordapp recov [Ljava/awt/TextField;
L462:   iload 5
L464:   aaload
L465:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L468:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L471:   invokevirtual Method java/lang/String trim ()Ljava/lang/String;
L474:   astore 6
L476:   aload 6
L478:   ldc ""
L480:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L483:   ifne L558
L486:   iload 5
L488:   iconst_1
L489:   iadd
L490:   istore 7
L492:   goto L552
L495:   aload 6
L497:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L500:   aload_0
L501:   getfield Field passwordapp recov [Ljava/awt/TextField;
L504:   iload 7
L506:   aaload
L507:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L510:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L513:   invokevirtual Method java/lang/String equalsIgnoreCase (Ljava/lang/String;)Z
L516:   ifeq L549
L519:   aload_0
L520:   getfield Field passwordapp change_questions_sameanswers_page Ljava/awt/Panel;
L523:   iconst_1
L524:   invokevirtual Method java/awt/Component setVisible (Z)V
L527:   aload_0
L528:   iconst_1
L529:   putfield Field passwordapp onreversepath Z
L532:   aload_0
L533:   aload_0
L534:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L537:   putfield Field passwordapp showpanel Ljava/awt/Panel;
L540:   aload_0
L541:   aload_0
L542:   getfield Field passwordapp change_questions_sameanswers_page Ljava/awt/Panel;
L545:   putfield Field passwordapp hidepanel Ljava/awt/Panel;
L548:   return
L549:   iinc 7 1
L552:   iload 7
L554:   iconst_5
L555:   if_icmplt L495
L558:   iinc 5 1
L561:   iload 5
L563:   iconst_5
L564:   if_icmplt L458
L567:   iconst_0
L568:   istore 6
L570:   goto L670
L573:   aload_0
L574:   getfield Field passwordapp recov [Ljava/awt/TextField;
L577:   iload 6
L579:   aaload
L580:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L583:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L586:   invokevirtual Method java/lang/String trim ()Ljava/lang/String;
L589:   astore 7
L591:   aload 7
L593:   ldc ""
L595:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L598:   ifne L667
L601:   iconst_0
L602:   istore 8
L604:   goto L661
L607:   aload 7
L609:   aload_0
L610:   getfield Field passwordapp question [Ljava/awt/TextField;
L613:   iload 8
L615:   aaload
L616:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L619:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L622:   invokevirtual Method java/lang/String equalsIgnoreCase (Ljava/lang/String;)Z
L625:   ifeq L658
L628:   aload_0
L629:   getfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L632:   iconst_1
L633:   invokevirtual Method java/awt/Component setVisible (Z)V
L636:   aload_0
L637:   iconst_1
L638:   putfield Field passwordapp onreversepath Z
L641:   aload_0
L642:   aload_0
L643:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L646:   putfield Field passwordapp showpanel Ljava/awt/Panel;
L649:   aload_0
L650:   aload_0
L651:   getfield Field passwordapp change_questions_qandamatch_page Ljava/awt/Panel;
L654:   putfield Field passwordapp hidepanel Ljava/awt/Panel;
L657:   return
L658:   iinc 8 1
L661:   iload 8
L663:   iconst_5
L664:   if_icmplt L607
L667:   iinc 6 1
L670:   iload 6
L672:   iconst_5
L673:   if_icmplt L573
L676:   aload_0
L677:   getfield Field passwordapp processingpage Ljava/awt/Panel;
L680:   iconst_1
L681:   invokevirtual Method java/awt/Component setVisible (Z)V
L684:   new java/lang/Thread
L687:   dup
L688:   aload_0
L689:   invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L692:   astore_2
L693:   aload_2
L694:   iconst_1
L695:   invokevirtual Method java/lang/Thread setDaemon (Z)V
L698:   aload_2
L699:   invokevirtual Method java/lang/Thread start ()V
L702:   return
L703:   
        .linenumbertable
            L0 375
            L7 376
            L14 377
            L22 378
            L27 380
            L34 381
            L42 382
            L47 384
            L52 385
            L53 388
            L61 390
            L66 391
            L79 392
            L98 393
            L107 394
            L117 393
            L118 396
            L127 397
            L137 396
            L138 399
            L147 400
            L157 399
            L158 402
            L167 403
            L177 402
            L178 405
            L187 406
            L197 408
            L198 411
            L206 413
            L235 414
            L243 415
            L248 416
            L256 417
            L264 418
            L265 422
            L270 423
            L308 424
            L316 425
            L321 426
            L329 427
            L337 428
            L338 422
            L346 433
            L352 434
            L367 435
            L377 436
            L386 437
            L404 438
            L412 439
            L417 440
            L425 441
            L433 442
            L434 436
            L443 433
            L452 448
            L458 449
            L476 450
            L486 451
            L495 452
            L519 453
            L527 454
            L532 455
            L540 456
            L548 457
            L549 451
            L558 448
            L567 463
            L573 464
            L591 465
            L601 466
            L607 467
            L628 468
            L636 469
            L641 470
            L649 471
            L657 472
            L658 466
            L667 463
            L676 480
            L684 483
            L693 484
            L698 485
            L702 373
        .end linenumbertable
    .end code
.end method

.method public run : ()V
    .code stack 5 locals 18
L0:     aload_0
L1:     getfield Field passwordapp initialised Z
L4:     ifne L161
L7:     aload_0
L8:     getfield Field passwordapp debug Z
L11:    ifeq L22
L14:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L17:    ldc "Initialising"
L19:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L22:    aload_0
L23:    aload_0
L24:    invokevirtual Method java/applet/Applet getCodeBase ()Ljava/net/URL;
L27:    invokevirtual Method java/net/URL toString ()Ljava/lang/String;
L30:    putfield Field passwordapp codebase Ljava/lang/String;
L33:    iconst_0
L34:    istore_1
L35:    iconst_0
L36:    istore_2
L37:    goto L63
L40:    aload_0
L41:    getfield Field passwordapp codebase Ljava/lang/String;
L44:    getstatic Field passwordapp allowedlist [Ljava/lang/String;
L47:    iload_2
L48:    aaload
L49:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L52:    ifeq L60
L55:    iconst_1
L56:    istore_1
L57:    goto L71
L60:    iinc 2 1
L63:    iload_2
L64:    getstatic Field passwordapp allowedlist [Ljava/lang/String;
L67:    arraylength
L68:    if_icmplt L40
L71:    iload_1
L72:    ifne L81
L75:    aload_0
L76:    ldc "http://recovery_questions.runescape.com/"
L78:    putfield Field passwordapp codebase Ljava/lang/String;
L81:    aload_0
L82:    aconst_null
L83:    invokevirtual Method java/awt/Container setLayout (Ljava/awt/LayoutManager;)V
L86:    aload_0
L87:    getstatic Field java/awt/Color black Ljava/awt/Color;
L90:    invokevirtual Method java/awt/Component setBackground (Ljava/awt/Color;)V
L93:    aload_0
L94:    invokespecial Method passwordapp init_messages ()V
L97:    aload_0
L98:    aload_0
L99:    ldc "type"
L101:   invokevirtual Method java/applet/Applet getParameter (Ljava/lang/String;)Ljava/lang/String;
L104:   invokestatic Method java/lang/Integer parseInt (Ljava/lang/String;)I
L107:   putfield Field passwordapp type I
L110:   aload_0
L111:   aload_0
L112:   ldc "username"
L114:   invokevirtual Method java/applet/Applet getParameter (Ljava/lang/String;)Ljava/lang/String;
L117:   putfield Field passwordapp username Ljava/lang/String;
L120:   aload_0
L121:   invokestatic Method passwordapp findcachedir ()Ljava/lang/String;
L124:   invokestatic Method passwordapp getuid (Ljava/lang/String;)I
L127:   putfield Field passwordapp uid I
L130:   aload_0
L131:   getfield Field passwordapp type I
L134:   iconst_2
L135:   if_icmpne L145
L138:   aload_0
L139:   invokespecial Method passwordapp init_change_questions ()V
L142:   goto L155
L145:   new java/lang/RuntimeException
L148:   dup
L149:   ldc "Not enough parameters"
L151:   invokespecial Method java/lang/RuntimeException <init> (Ljava/lang/String;)V
L154:   athrow
L155:   aload_0
L156:   iconst_1
L157:   putfield Field passwordapp initialised Z
L160:   return
L161:   new java/security/SecureRandom
L164:   dup
L165:   invokespecial Method java/security/SecureRandom <init> ()V
L168:   astore_1
L169:   iconst_4
L170:   newarray int
L172:   astore_2
L173:   iconst_0
L174:   istore_3
L175:   goto L188
L178:   aload_2
L179:   iload_3
L180:   aload_1
L181:   invokevirtual Method java/util/Random nextInt ()I
L184:   iastore
L185:   iinc 3 1
L188:   iload_3
L189:   aload_2
L190:   arraylength
L191:   if_icmplt L178
L194:   new packet
L197:   dup
L198:   bipush 66
L200:   newarray byte
L202:   invokespecial Method packet <init> ([B)V
L205:   astore 4
L207:   aload 4
L209:   iconst_1
L210:   invokevirtual Method packet p1 (I)V
L213:   iconst_0
L214:   istore 5
L216:   goto L231
L219:   aload 4
L221:   aload_2
L222:   iload 5
L224:   iaload
L225:   invokevirtual Method packet p4 (I)V
L228:   iinc 5 1
L231:   iload 5
L233:   aload_2
L234:   arraylength
L235:   if_icmplt L219
L238:   aload 4
L240:   aload_0
L241:   getfield Field passwordapp key_e Ljava/math/BigInteger;
L244:   aload_0
L245:   getfield Field passwordapp key_n Ljava/math/BigInteger;
L248:   invokevirtual Method packet rsaenc (Ljava/math/BigInteger;Ljava/math/BigInteger;)V
L251:   aload 4
L253:   getfield Field packet pos I
L256:   istore 6
L258:   aload 4
L260:   iconst_0
L261:   putfield Field packet pos I
L264:   aload 4
L266:   iload 6
L268:   invokevirtual Method packet g64encoded (I)Ljava/lang/String;
L271:   astore 7
L273:   new packet
L276:   dup
L277:   sipush 2048
L280:   newarray byte
L282:   invokespecial Method packet <init> ([B)V
L285:   astore 8
L287:   aload 8
L289:   iconst_2
L290:   invokevirtual Method packet p4 (I)V
L293:   aload 8
L295:   aload_0
L296:   getfield Field passwordapp username Ljava/lang/String;
L299:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L302:   aload 8
L304:   aload_0
L305:   getfield Field passwordapp uid I
L308:   invokevirtual Method packet p4 (I)V
L311:   aload_0
L312:   getfield Field passwordapp type I
L315:   iconst_2
L316:   if_icmpne L559
L319:   aload 8
L321:   aload_0
L322:   aload_0
L323:   getfield Field passwordapp password1 Ljava/awt/TextField;
L326:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L329:   bipush 20
L331:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L334:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L337:   aload 8
L339:   aload_0
L340:   aload_0
L341:   getfield Field passwordapp question [Ljava/awt/TextField;
L344:   iconst_0
L345:   aaload
L346:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L349:   bipush 40
L351:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L354:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L357:   aload 8
L359:   aload_0
L360:   aload_0
L361:   getfield Field passwordapp recov [Ljava/awt/TextField;
L364:   iconst_0
L365:   aaload
L366:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L369:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L372:   bipush 40
L374:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L377:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L380:   aload 8
L382:   aload_0
L383:   aload_0
L384:   getfield Field passwordapp question [Ljava/awt/TextField;
L387:   iconst_1
L388:   aaload
L389:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L392:   bipush 40
L394:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L397:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L400:   aload 8
L402:   aload_0
L403:   aload_0
L404:   getfield Field passwordapp recov [Ljava/awt/TextField;
L407:   iconst_1
L408:   aaload
L409:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L412:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L415:   bipush 40
L417:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L420:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L423:   aload 8
L425:   aload_0
L426:   aload_0
L427:   getfield Field passwordapp question [Ljava/awt/TextField;
L430:   iconst_2
L431:   aaload
L432:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L435:   bipush 40
L437:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L440:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L443:   aload 8
L445:   aload_0
L446:   aload_0
L447:   getfield Field passwordapp recov [Ljava/awt/TextField;
L450:   iconst_2
L451:   aaload
L452:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L455:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L458:   bipush 40
L460:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L463:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L466:   aload 8
L468:   aload_0
L469:   aload_0
L470:   getfield Field passwordapp question [Ljava/awt/TextField;
L473:   iconst_3
L474:   aaload
L475:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L478:   bipush 40
L480:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L483:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L486:   aload 8
L488:   aload_0
L489:   aload_0
L490:   getfield Field passwordapp recov [Ljava/awt/TextField;
L493:   iconst_3
L494:   aaload
L495:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L498:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L501:   bipush 40
L503:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L506:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L509:   aload 8
L511:   aload_0
L512:   aload_0
L513:   getfield Field passwordapp question [Ljava/awt/TextField;
L516:   iconst_4
L517:   aaload
L518:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L521:   bipush 40
L523:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L526:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L529:   aload 8
L531:   aload_0
L532:   aload_0
L533:   getfield Field passwordapp recov [Ljava/awt/TextField;
L536:   iconst_4
L537:   aaload
L538:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L541:   invokestatic Method passwordapp tidyrecoveryanswer (Ljava/lang/String;)Ljava/lang/String;
L544:   bipush 40
L546:   invokespecial Method passwordapp safesizestring (Ljava/lang/String;I)Ljava/lang/String;
L549:   invokevirtual Method packet pjstr (Ljava/lang/String;)V
L552:   ldc "changequestions.cgi"
L554:   astore 9
L556:   goto L560
L559:   return
L560:   aload 8
L562:   invokevirtual Method packet addcrc ()I
L565:   pop
L566:   aload 8
L568:   getfield Field packet pos I
L571:   istore 10
L573:   aload 8
L575:   aload_2
L576:   invokevirtual Method packet tinyenc ([I)V
L579:   aload 8
L581:   iconst_0
L582:   putfield Field packet pos I
L585:   aload 8
L587:   iload 10
L589:   invokevirtual Method packet g64encoded (I)Ljava/lang/String;
L592:   astore 11
L594:   new java/lang/StringBuffer
L597:   dup
L598:   aload_0
L599:   getfield Field passwordapp codebase Ljava/lang/String;
L602:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L605:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L608:   aload 9
L610:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L613:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L616:   astore 12
        .catch java/lang/Throwable from L618 to L934 using L935
L618:   new java/net/URL
L621:   dup
L622:   aload 12
L624:   invokespecial Method java/net/URL <init> (Ljava/lang/String;)V
L627:   astore 13
L629:   aload 13
L631:   invokevirtual Method java/net/URL openConnection ()Ljava/net/URLConnection;
L634:   astore 14
L636:   aload 14
L638:   iconst_1
L639:   invokevirtual Method java/net/URLConnection setDoInput (Z)V
L642:   aload 14
L644:   iconst_1
L645:   invokevirtual Method java/net/URLConnection setDoOutput (Z)V
L648:   new java/io/OutputStreamWriter
L651:   dup
L652:   aload 14
L654:   invokevirtual Method java/net/URLConnection getOutputStream ()Ljava/io/OutputStream;
L657:   invokespecial Method java/io/OutputStreamWriter <init> (Ljava/io/OutputStream;)V
L660:   astore 15
L662:   aload 15
L664:   new java/lang/StringBuffer
L667:   dup
L668:   ldc "data1="
L670:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L673:   aload 7
L675:   invokestatic Method passwordapp urlencode (Ljava/lang/String;)Ljava/lang/String;
L678:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L681:   ldc "&data2="
L683:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L686:   aload 11
L688:   invokestatic Method passwordapp urlencode (Ljava/lang/String;)Ljava/lang/String;
L691:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L694:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L697:   invokevirtual Method java/io/Writer write (Ljava/lang/String;)V
L700:   aload 15
L702:   invokevirtual Method java/io/OutputStreamWriter flush ()V
L705:   aload 14
L707:   invokevirtual Method java/net/URLConnection getInputStream ()Ljava/io/InputStream;
L710:   astore 16
L712:   aload 8
L714:   iconst_0
L715:   putfield Field packet pos I
L718:   goto L755
L721:   aload 16
L723:   aload 8
L725:   getfield Field packet data [B
L728:   aload 8
L730:   getfield Field packet pos I
L733:   aload 8
L735:   getfield Field packet data [B
L738:   arraylength
L739:   aload 8
L741:   getfield Field packet pos I
L744:   isub
L745:   invokevirtual Method java/io/InputStream read ([BII)I
L748:   iconst_m1
L749:   if_icmpne L755
L752:   goto L769
L755:   aload 8
L757:   getfield Field packet pos I
L760:   aload 8
L762:   getfield Field packet data [B
L765:   arraylength
L766:   if_icmplt L721
L769:   aload 8
L771:   iconst_0
L772:   putfield Field packet pos I
L775:   aload 15
L777:   invokevirtual Method java/io/OutputStreamWriter close ()V
L780:   aload 16
L782:   invokevirtual Method java/io/InputStream close ()V
L785:   aload 8
L787:   invokevirtual Method packet gstr ()Ljava/lang/String;
L790:   astore 17
L792:   aload_0
L793:   getfield Field passwordapp processingpage Ljava/awt/Panel;
L796:   iconst_0
L797:   invokevirtual Method java/awt/Component setVisible (Z)V
L800:   aload 17
L802:   ldc "ATTACK"
L804:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L807:   ifeq L819
L810:   aload_0
L811:   getfield Field passwordapp blocked_attack_page Ljava/awt/Panel;
L814:   iconst_1
L815:   invokevirtual Method java/awt/Component setVisible (Z)V
L818:   return
L819:   aload_0
L820:   getfield Field passwordapp type I
L823:   iconst_2
L824:   if_icmpne L987
L827:   aload 17
L829:   ldc "PENDING"
L831:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L834:   ifeq L846
L837:   aload_0
L838:   getfield Field passwordapp change_questions_success_page_pending Ljava/awt/Panel;
L841:   iconst_1
L842:   invokevirtual Method java/awt/Component setVisible (Z)V
L845:   return
L846:   aload 17
L848:   ldc "ACTIVE"
L850:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L853:   ifeq L865
L856:   aload_0
L857:   getfield Field passwordapp change_questions_success_page_active Ljava/awt/Panel;
L860:   iconst_1
L861:   invokevirtual Method java/awt/Component setVisible (Z)V
L864:   return
L865:   aload 17
L867:   ldc "WRONG"
L869:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L872:   ifeq L905
L875:   aload_0
L876:   getfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L879:   iconst_1
L880:   invokevirtual Method java/awt/Component setVisible (Z)V
L883:   aload_0
L884:   iconst_1
L885:   putfield Field passwordapp onreversepath Z
L888:   aload_0
L889:   aload_0
L890:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L893:   putfield Field passwordapp showpanel Ljava/awt/Panel;
L896:   aload_0
L897:   aload_0
L898:   getfield Field passwordapp wrongpassword_page Ljava/awt/Panel;
L901:   putfield Field passwordapp hidepanel Ljava/awt/Panel;
L904:   return
L905:   aload_0
L906:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L909:   iconst_1
L910:   invokevirtual Method java/awt/Component setVisible (Z)V
L913:   aload_0
L914:   iconst_1
L915:   putfield Field passwordapp onreversepath Z
L918:   aload_0
L919:   aload_0
L920:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L923:   putfield Field passwordapp showpanel Ljava/awt/Panel;
L926:   aload_0
L927:   aload_0
L928:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L931:   putfield Field passwordapp hidepanel Ljava/awt/Panel;
L934:   return
L935:   astore 13
L937:   aload 13
L939:   invokevirtual Method java/lang/Throwable printStackTrace ()V
L942:   aload_0
L943:   getfield Field passwordapp processingpage Ljava/awt/Panel;
L946:   iconst_0
L947:   invokevirtual Method java/awt/Component setVisible (Z)V
L950:   aload_0
L951:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L954:   iconst_1
L955:   invokevirtual Method java/awt/Component setVisible (Z)V
L958:   aload_0
L959:   iconst_1
L960:   putfield Field passwordapp onreversepath Z
L963:   aload_0
L964:   aload_0
L965:   getfield Field passwordapp system_error_page Ljava/awt/Panel;
L968:   putfield Field passwordapp hidepanel Ljava/awt/Panel;
L971:   aload_0
L972:   getfield Field passwordapp type I
L975:   iconst_2
L976:   if_icmpne L987
L979:   aload_0
L980:   aload_0
L981:   getfield Field passwordapp change_questions_page Ljava/awt/Panel;
L984:   putfield Field passwordapp showpanel Ljava/awt/Panel;
L987:   return
L988:   
        .linenumbertable
            L0 489
            L7 490
            L22 491
            L33 492
            L35 493
            L40 494
            L60 493
            L71 496
            L81 497
            L86 498
            L93 499
            L97 500
            L110 501
            L120 502
            L130 503
            L145 505
            L155 507
            L160 508
            L161 512
            L169 513
            L173 514
            L178 515
            L185 514
            L194 518
            L207 519
            L213 520
            L219 521
            L228 520
            L238 523
            L251 524
            L258 525
            L264 526
            L273 529
            L287 530
            L293 531
            L302 532
            L311 535
            L319 536
            L337 537
            L357 538
            L380 539
            L400 540
            L423 541
            L443 542
            L466 543
            L486 544
            L509 545
            L529 546
            L552 547
            L556 535
            L559 549
            L560 553
            L566 556
            L573 557
            L579 558
            L585 559
            L594 562
            L618 563
            L618 565
            L629 566
            L636 567
            L642 568
            L648 569
            L662 570
            L700 571
            L705 572
            L712 574
            L718 575
            L721 576
            L755 575
            L769 578
            L775 579
            L780 580
            L785 582
            L792 584
            L800 586
            L810 588
            L818 586
            L819 589
            L827 590
            L837 592
            L845 590
            L846 593
            L856 595
            L864 593
            L865 596
            L875 598
            L883 599
            L888 600
            L896 601
            L904 596
            L905 603
            L913 604
            L918 605
            L926 606
            L934 563
            L935 609
            L937 610
            L942 612
            L950 613
            L958 614
            L963 615
            L971 617
            L979 618
            L987 488
        .end linenumbertable
    .end code
.end method

.method public keyReleased : (Ljava/awt/event/KeyEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 623
        .end linenumbertable
    .end code
.end method

.method public keyTyped : (Ljava/awt/event/KeyEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 626
        .end linenumbertable
    .end code
.end method

.method public keyPressed : (Ljava/awt/event/KeyEvent;)V
    .code stack 2 locals 5
L0:     aload_1
L1:     invokevirtual Method java/awt/event/KeyEvent getKeyCode ()I
L4:     istore_2
L5:     iload_2
L6:     bipush 8
L8:     if_icmpeq L43
L11:    iload_2
L12:    bipush 127
L14:    if_icmpeq L43
L17:    aload_1
L18:    invokevirtual Method java/awt/event/KeyEvent isActionKey ()Z
L21:    ifne L43
L24:    aload_1
L25:    invokevirtual Method java/awt/event/InputEvent getModifiers ()I
L28:    iconst_2
L29:    iand
L30:    ifne L43
L33:    aload_1
L34:    invokevirtual Method java/awt/event/InputEvent getModifiers ()I
L37:    bipush 8
L39:    iand
L40:    ifeq L44
L43:    return
L44:    aload_1
L45:    invokevirtual Method java/util/EventObject getSource ()Ljava/lang/Object;
L48:    astore_3
L49:    aload_3
L50:    instanceof java/awt/TextField
L53:    ifeq L96
L56:    aload_3
L57:    checkcast java/awt/TextField
L60:    astore 4
L62:    aload 4
L64:    invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L67:    invokevirtual Method java/lang/String length ()I
L70:    aload 4
L72:    invokevirtual Method java/awt/TextField getColumns ()I
L75:    if_icmplt L140
L78:    aload 4
L80:    invokevirtual Method java/awt/TextComponent getSelectedText ()Ljava/lang/String;
L83:    ldc ""
L85:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L88:    ifeq L140
L91:    aload_1
L92:    invokevirtual Method java/awt/event/InputEvent consume ()V
L95:    return
L96:    aload_3
L97:    instanceof java/awt/TextArea
L100:   ifeq L140
L103:   aload_3
L104:   checkcast java/awt/TextArea
L107:   astore 4
L109:   aload 4
L111:   invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L114:   invokevirtual Method java/lang/String length ()I
L117:   sipush 400
L120:   if_icmplt L140
L123:   aload 4
L125:   invokevirtual Method java/awt/TextComponent getSelectedText ()Ljava/lang/String;
L128:   ldc ""
L130:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L133:   ifeq L140
L136:   aload_1
L137:   invokevirtual Method java/awt/event/InputEvent consume ()V
L140:   return
L141:   
        .linenumbertable
            L0 633
            L5 634
            L44 635
            L49 636
            L56 637
            L62 638
            L95 636
            L96 640
            L103 641
            L109 642
            L140 632
        .end linenumbertable
    .end code
.end method

.method public textValueChanged : (Ljava/awt/event/TextEvent;)V
    .code stack 4 locals 4
L0:     aload_1
L1:     invokevirtual Method java/util/EventObject getSource ()Ljava/lang/Object;
L4:     astore_2
L5:     aload_2
L6:     instanceof java/awt/TextField
L9:     ifeq L56
L12:    aload_2
L13:    checkcast java/awt/TextField
L16:    astore_3
L17:    aload_3
L18:    invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L21:    invokevirtual Method java/lang/String length ()I
L24:    aload_3
L25:    invokevirtual Method java/awt/TextField getColumns ()I
L28:    if_icmple L103
L31:    aload_3
L32:    aload_3
L33:    invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L36:    iconst_0
L37:    aload_3
L38:    invokevirtual Method java/awt/TextField getColumns ()I
L41:    invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L44:    invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L47:    aload_3
L48:    aload_3
L49:    invokevirtual Method java/awt/TextField getColumns ()I
L52:    invokevirtual Method java/awt/TextComponent setCaretPosition (I)V
L55:    return
L56:    aload_2
L57:    instanceof java/awt/TextArea
L60:    ifeq L103
L63:    aload_2
L64:    checkcast java/awt/TextArea
L67:    astore_3
L68:    aload_3
L69:    invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L72:    invokevirtual Method java/lang/String length ()I
L75:    sipush 400
L78:    if_icmple L103
L81:    aload_3
L82:    aload_3
L83:    invokevirtual Method java/awt/TextComponent getText ()Ljava/lang/String;
L86:    iconst_0
L87:    sipush 400
L90:    invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L93:    invokevirtual Method java/awt/TextComponent setText (Ljava/lang/String;)V
L96:    aload_3
L97:    sipush 400
L100:   invokevirtual Method java/awt/TextComponent setCaretPosition (I)V
L103:   return
L104:   
        .linenumbertable
            L0 647
            L5 648
            L12 649
            L17 650
            L31 651
            L47 652
            L55 648
            L56 655
            L63 656
            L68 657
            L81 658
            L96 659
            L103 646
        .end linenumbertable
    .end code
.end method

.method public destroy : ()V
    .code stack 0 locals 1
L0:     return
L1:     
        .linenumbertable
            L0 664
        .end linenumbertable
    .end code
.end method

.method public static final findcachedir : ()Ljava/lang/String;
    .code stack 5 locals 5
L0:     bipush 12
L2:     anewarray java/lang/String
L5:     dup
L6:     iconst_0
L7:     ldc "c:/windows/"
L9:     aastore
L10:    dup
L11:    iconst_1
L12:    ldc "c:/winnt/"
L14:    aastore
L15:    dup
L16:    iconst_2
L17:    ldc "d:/windows/"
L19:    aastore
L20:    dup
L21:    iconst_3
L22:    ldc "d:/winnt/"
L24:    aastore
L25:    dup
L26:    iconst_4
L27:    ldc "e:/windows/"
L29:    aastore
L30:    dup
L31:    iconst_5
L32:    ldc "e:/winnt/"
L34:    aastore
L35:    dup
L36:    bipush 6
L38:    ldc "f:/windows/"
L40:    aastore
L41:    dup
L42:    bipush 7
L44:    ldc "f:/winnt/"
L46:    aastore
L47:    dup
L48:    bipush 8
L50:    ldc "c:/"
L52:    aastore
L53:    dup
L54:    bipush 9
L56:    ldc "~/"
L58:    aastore
L59:    dup
L60:    bipush 10
L62:    ldc "/tmp/"
L64:    aastore
L65:    dup
L66:    bipush 11
L68:    ldc ""
L70:    aastore
L71:    astore_0
L72:    ldc ".file_store_32"
L74:    astore_1
L75:    iconst_0
L76:    istore_2
L77:    goto L189
        .catch java/lang/Exception from L80 to L182 using L182
L80:    aload_0
L81:    iload_2
L82:    aaload
L83:    astore_3
L84:    aload_3
L85:    invokevirtual Method java/lang/String length ()I
L88:    ifle L112
L91:    new java/io/File
L94:    dup
L95:    aload_3
L96:    invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L99:    astore 4
L101:   aload 4
L103:   invokevirtual Method java/io/File exists ()Z
L106:   ifne L112
L109:   goto L186
L112:   new java/io/File
L115:   dup
L116:   new java/lang/StringBuffer
L119:   dup
L120:   aload_3
L121:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L124:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L127:   aload_1
L128:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L131:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L134:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L137:   astore 4
L139:   aload 4
L141:   invokevirtual Method java/io/File exists ()Z
L144:   ifne L158
L147:   aload 4
L149:   invokevirtual Method java/io/File mkdir ()Z
L152:   ifne L158
L155:   goto L186
L158:   new java/lang/StringBuffer
L161:   dup
L162:   aload_3
L163:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L166:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L169:   aload_1
L170:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L173:   ldc "/"
L175:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L178:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L181:   areturn
L182:   pop
L183:   goto L186
L186:   iinc 2 1
L189:   iload_2
L190:   aload_0
L191:   arraylength
L192:   if_icmplt L80
L195:   aconst_null
L196:   areturn
L197:   
        .linenumbertable
            L0 670
            L72 671
            L75 672
            L80 673
            L80 675
            L84 676
            L112 678
            L139 679
            L158 681
            L182 683
            L183 673
            L186 672
            L195 685
        .end linenumbertable
    .end code
.end method

.method private static final getuid : (Ljava/lang/String;)I
    .code stack 7 locals 3
        .catch java/lang/Exception from L0 to L95 using L98
L0:     new java/io/File
L3:     dup
L4:     new java/lang/StringBuffer
L7:     dup
L8:     aload_0
L9:     invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L12:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L15:    ldc "uid.dat"
L17:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L20:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L23:    invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L26:    astore_1
L27:    aload_1
L28:    invokevirtual Method java/io/File exists ()Z
L31:    ifeq L45
L34:    aload_1
L35:    invokevirtual Method java/io/File length ()J
L38:    ldc2_w 4L
L41:    lcmp
L42:    ifge L99
L45:    new java/io/DataOutputStream
L48:    dup
L49:    new java/io/FileOutputStream
L52:    dup
L53:    new java/lang/StringBuffer
L56:    dup
L57:    aload_0
L58:    invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L61:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L64:    ldc "uid.dat"
L66:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L69:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L72:    invokespecial Method java/io/FileOutputStream <init> (Ljava/lang/String;)V
L75:    invokespecial Method java/io/DataOutputStream <init> (Ljava/io/OutputStream;)V
L78:    astore_2
L79:    aload_2
L80:    invokestatic Method java/lang/Math random ()D
L83:    ldc2_w 9.9999999e7
L86:    dmul
L87:    d2i
L88:    invokevirtual Method java/io/DataOutputStream writeInt (I)V
L91:    aload_2
L92:    invokevirtual Method java/io/FilterOutputStream close ()V
L95:    goto L99
L98:    pop
        .catch java/lang/Exception from L99 to L146 using L146
L99:    new java/io/DataInputStream
L102:   dup
L103:   new java/io/FileInputStream
L106:   dup
L107:   new java/lang/StringBuffer
L110:   dup
L111:   aload_0
L112:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L115:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L118:   ldc "uid.dat"
L120:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L123:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L126:   invokespecial Method java/io/FileInputStream <init> (Ljava/lang/String;)V
L129:   invokespecial Method java/io/DataInputStream <init> (Ljava/io/InputStream;)V
L132:   astore_1
L133:   aload_1
L134:   invokevirtual Method java/io/DataInputStream readInt ()I
L137:   istore_2
L138:   aload_1
L139:   invokevirtual Method java/io/FilterInputStream close ()V
L142:   iload_2
L143:   iconst_1
L144:   iadd
L145:   ireturn
L146:   pop
L147:   iconst_0
L148:   ireturn
L149:   
        .linenumbertable
            L0 690
            L0 691
            L27 692
            L45 693
            L79 694
            L95 690
            L98 697
            L99 699
            L99 700
            L133 701
            L142 702
            L146 704
            L147 705
        .end linenumbertable
    .end code
.end method

.method public <init> : ()V
    .code stack 5 locals 1
L0:     aload_0
L1:     invokespecial Method java/applet/Applet <init> ()V
L4:     aload_0
L5:     iconst_5
L6:     anewarray java/awt/TextField
L9:     putfield Field passwordapp question [Ljava/awt/TextField;
L12:    aload_0
L13:    iconst_5
L14:    anewarray java/awt/TextField
L17:    putfield Field passwordapp recov [Ljava/awt/TextField;
L20:    aload_0
L21:    new java/math/BigInteger
L24:    dup
L25:    ldc "78609176622342907144495556282156869501821674615375259616632158913026262002609"
L27:    invokespecial Method java/math/BigInteger <init> (Ljava/lang/String;)V
L30:    putfield Field passwordapp key_e Ljava/math/BigInteger;
L33:    aload_0
L34:    new java/math/BigInteger
L37:    dup
L38:    ldc "8520946092827349680104442275636555624577884266514482949166183637641027716807216207253679971387983199046976999249798814352350744205728948100629864118760909"
L40:    invokespecial Method java/math/BigInteger <init> (Ljava/lang/String;)V
L43:    putfield Field passwordapp key_n Ljava/math/BigInteger;
L46:    aload_0
L47:    bipush 17
L49:    anewarray java/lang/String
L52:    dup
L53:    iconst_0
L54:    ldc "Where were you born?"
L56:    aastore
L57:    dup
L58:    iconst_1
L59:    ldc "What was your first teachers name?"
L61:    aastore
L62:    dup
L63:    iconst_2
L64:    ldc "What is your fathers middle name?"
L66:    aastore
L67:    dup
L68:    iconst_3
L69:    ldc "What is your mothers middle name?"
L71:    aastore
L72:    dup
L73:    iconst_4
L74:    ldc "Who was your first best friend?"
L76:    aastore
L77:    dup
L78:    iconst_5
L79:    ldc "What is your favourite vacation spot?"
L81:    aastore
L82:    dup
L83:    bipush 6
L85:    ldc "What was your first pets name?"
L87:    aastore
L88:    dup
L89:    bipush 7
L91:    ldc "What was the name of your first school?"
L93:    aastore
L94:    dup
L95:    bipush 8
L97:    ldc "What is your mothers maiden name?"
L99:    aastore
L100:   dup
L101:   bipush 9
L103:   ldc "Who was your first boyfriend/girlfriend?"
L105:   aastore
L106:   dup
L107:   bipush 10
L109:   ldc "Who is your favourite actor/actress?"
L111:   aastore
L112:   dup
L113:   bipush 11
L115:   ldc "Who is your favourite author?"
L117:   aastore
L118:   dup
L119:   bipush 12
L121:   ldc "Who is your favourite musician?"
L123:   aastore
L124:   dup
L125:   bipush 13
L127:   ldc "Who is your favourite cartoon character?"
L129:   aastore
L130:   dup
L131:   bipush 14
L133:   ldc "What is your favourite book?"
L135:   aastore
L136:   dup
L137:   bipush 15
L139:   ldc "What is your favourite food?"
L141:   aastore
L142:   dup
L143:   bipush 16
L145:   ldc "What is your favourite movie?"
L147:   aastore
L148:   putfield Field passwordapp example_questions [Ljava/lang/String;
L151:   aload_0
L152:   iconst_0
L153:   putfield Field passwordapp initialised Z
L156:   aload_0
L157:   iconst_1
L158:   putfield Field passwordapp debug Z
L161:   return
L162:   
        .linenumbertable
            L0 9
            L4 19
            L12 20
            L20 25
            L33 26
            L46 61
            L151 63
            L156 66
            L161 9
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 4 locals 0
L0:     iconst_4
L1:     anewarray java/lang/String
L4:     dup
L5:     iconst_0
L6:     ldc "http://recovery_questions.runescape.com/"
L8:     aastore
L9:     dup
L10:    iconst_1
L11:    ldc "http://webtestwip1.runescape.com:16304/"
L13:    aastore
L14:    dup
L15:    iconst_2
L16:    ldc "http://webtestrc1.runescape.com:16304/"
L18:    aastore
L19:    dup
L20:    iconst_3
L21:    ldc "http://local.runescape.com:16304/"
L23:    aastore
L24:    putstatic Field passwordapp allowedlist [Ljava/lang/String;
L27:    return
L28:    
        .linenumbertable
            L0 11
            L11 12
            L13 11
            L16 13
            L18 11
            L21 14
            L23 11
            L27 9
        .end linenumbertable
    .end code
.end method
.sourcefile "passwordapp.java"
.end class
