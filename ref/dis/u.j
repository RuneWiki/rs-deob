.version 45 3
.class final super u
.super java/lang/Object
.field static a [J
.field static b [J
.field static c [Ljava/lang/String;

.method static final a : (ILjava/awt/Component;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L29 using L32
L0:     aload_1
L1:     getstatic Field ca d Lma;
L4:     invokevirtual Method java/awt/Component removeKeyListener (Ljava/awt/event/KeyListener;)V
L7:     aload_1
L8:     getstatic Field ca d Lma;
L11:    invokevirtual Method java/awt/Component removeFocusListener (Ljava/awt/event/FocusListener;)V
L14:    iload_0
L15:    bipush -39
L17:    if_icmple L25
L20:    bipush 127
L22:    invokestatic Method u a (I)V
L25:    iconst_m1
L26:    putstatic Field p k I
L29:    goto L81
L32:    astore_2
L33:    aload_2
L34:    new java/lang/StringBuffer
L37:    dup
L38:    invokespecial Method java/lang/StringBuffer <init> ()V
L41:    ldc "u.B("
L43:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L46:    iload_0
L47:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L50:    bipush 44
L52:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L55:    aload_1
L56:    ifnull L64
L59:    ldc "{...}"
L61:    goto L66
L64:    ldc "null"
L66:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L69:    bipush 41
L71:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L74:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L77:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L80:    athrow
L81:    return
L82:    
        .linenumbertable
            L0 4
            L7 5
            L14 6
            L20 7
            L25 9
            L29 12
            L32 10
            L33 11
            L81 13
        .end linenumbertable
    .end code
.end method

.method public static a : (I)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L13 using L21
L0:     aconst_null
L1:     putstatic Field u a [J
L4:     aconst_null
L5:     putstatic Field u b [J
L8:     iload_0
L9:     iconst_m1
L10:    if_icmpeq L14
L13:    return
        .catch java/lang/RuntimeException from L14 to L18 using L21
L14:    aconst_null
L15:    putstatic Field u c [Ljava/lang/String;
L18:    goto L51
L21:    astore_1
L22:    aload_1
L23:    new java/lang/StringBuffer
L26:    dup
L27:    invokespecial Method java/lang/StringBuffer <init> ()V
L30:    ldc "u.A("
L32:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L35:    iload_0
L36:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L39:    bipush 41
L41:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L44:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L47:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L50:    athrow
L51:    return
L52:    
        .linenumbertable
            L0 38
            L4 39
            L8 40
            L13 41
            L14 43
            L18 46
            L21 44
            L22 45
            L51 47
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 4 locals 0
L0:     bipush 32
L2:     newarray long
L4:     putstatic Field u b [J
L7:     iconst_3
L8:     anewarray java/lang/String
L11:    dup
L12:    iconst_0
L13:    ldc ".jagex.com"
L15:    aastore
L16:    dup
L17:    iconst_1
L18:    ldc ".runescape.com"
L20:    aastore
L21:    dup
L22:    iconst_2
L23:    ldc ".runescape.de"
L25:    aastore
L26:    putstatic Field u c [Ljava/lang/String;
L29:    bipush 32
L31:    newarray long
L33:    putstatic Field u a [J
L36:    return
L37:    
        .linenumbertable
            L0 20
            L7 27
            L29 30
            L36 31
        .end linenumbertable
    .end code
.end method
.sourcefile "u.java"
.end class
