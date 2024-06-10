.version 45 3
.class final super bb
.super java/lang/Object
.field static a Lsa;
.field static volatile b J
.field static c J

.method static final a : (JI)V
    .code stack 4 locals 4
        .catch java/lang/InterruptedException from L0 to L16 using L19
        .catch java/lang/RuntimeException from L0 to L20 using L23
L0:     iload_2
L1:     bipush 81
L3:     if_icmpgt L12
L6:     ldc2_w -87L
L9:     putstatic Field bb b J
L12:    lload_0
L13:    invokestatic Method java/lang/Thread sleep (J)V
L16:    goto L20
L19:    astore_3
L20:    goto L62
L23:    astore_3
L24:    aload_3
L25:    new java/lang/StringBuffer
L28:    dup
L29:    invokespecial Method java/lang/StringBuffer <init> ()V
L32:    ldc "bb.A("
L34:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L37:    lload_0
L38:    invokevirtual Method java/lang/StringBuffer append (J)Ljava/lang/StringBuffer;
L41:    bipush 44
L43:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L46:    iload_2
L47:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L50:    bipush 41
L52:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L55:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L58:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L61:    athrow
L62:    return
L63:    
        .linenumbertable
            L0 6
            L6 7
            L12 9
            L16 11
            L19 10
            L20 14
            L23 12
            L24 13
            L62 15
        .end linenumbertable
    .end code
.end method

.method public static a : (I)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L7 using L15
L0:     iload_0
L1:     sipush 14620
L4:     if_icmpeq L8
L7:     return
        .catch java/lang/RuntimeException from L8 to L12 using L15
L8:     aconst_null
L9:     putstatic Field bb a Lsa;
L12:    goto L45
L15:    astore_1
L16:    aload_1
L17:    new java/lang/StringBuffer
L20:    dup
L21:    invokespecial Method java/lang/StringBuffer <init> ()V
L24:    ldc "bb.B("
L26:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L29:    iload_0
L30:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L33:    bipush 41
L35:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L38:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L41:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L44:    athrow
L45:    return
L46:    
        .linenumbertable
            L0 19
            L7 20
            L8 22
            L12 25
            L15 23
            L16 24
            L45 26
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 2 locals 0
L0:     bipush 109
L2:     ldc "box_left_stud"
L4:     invokestatic Method ca a (ILjava/lang/String;)Lsa;
L7:     putstatic Field bb a Lsa;
L10:    lconst_0
L11:    putstatic Field bb b J
L14:    lconst_0
L15:    putstatic Field bb c J
L18:    return
L19:    
        .linenumbertable
            L0 52
            L10 56
            L14 64
            L18 65
        .end linenumbertable
    .end code
.end method
.sourcefile "bb.java"
.end class
