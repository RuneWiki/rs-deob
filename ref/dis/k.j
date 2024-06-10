.version 45 3
.class public final super k
.super java/lang/Object
.field private a J
.field private b J
.field private c Ljava/io/RandomAccessFile;
.field private d Ljava/io/File;

.method public final a : (B)Ljava/io/File;
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L15 using L16
L0:     bipush 68
L2:     iload_1
L3:     bipush 43
L5:     isub
L6:     bipush 33
L8:     idiv
L9:     idiv
L10:    istore_2
L11:    aload_0
L12:    getfield Field k d Ljava/io/File;
L15:    areturn
L16:    astore_2
L17:    aload_2
L18:    athrow
L19:    
        .linenumbertable
            L0 5
            L11 6
            L16 7
            L17 8
        .end linenumbertable
    .end code
.end method

.method protected final finalize : ()V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L50 using L53
L0:     aload_0
L1:     getfield Field k c Ljava/io/RandomAccessFile;
L4:     ifnonnull L10
L7:     goto L50
L10:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L13:    new java/lang/StringBuffer
L16:    dup
L17:    invokespecial Method java/lang/StringBuffer <init> ()V
L20:    ldc "Warning! fileondisk "
L22:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L25:    aload_0
L26:    getfield Field k d Ljava/io/File;
L29:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L32:    ldc " not closed correctly using close(). Auto-closing instead. "
L34:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L37:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L40:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L43:    aload_0
L44:    sipush 21657
L47:    invokevirtual Method k a (I)V
L50:    goto L56
L53:    astore_1
L54:    aload_1
L55:    athrow
L56:    return
L57:    
        .linenumbertable
            L0 13
            L10 16
            L43 17
            L50 22
            L53 20
            L54 21
            L56 23
        .end linenumbertable
    .end code
    .exceptions java/lang/Throwable
.end method

.method public final a : (B[BII)V
    .code stack 6 locals 6
        .catch java/lang/RuntimeException from L0 to L91 using L94
L0:     bipush -71
L2:     iload_1
L3:     bipush 31
L5:     isub
L6:     bipush 55
L8:     idiv
L9:     idiv
L10:    istore 5
L12:    aload_0
L13:    getfield Field k a J
L16:    iload 4
L18:    i2l
L19:    ladd
L20:    ldc2_w -1L
L23:    lxor
L24:    aload_0
L25:    getfield Field k b J
L28:    ldc2_w -1L
L31:    lxor
L32:    lcmp
L33:    iflt L39
L36:    goto L68
L39:    aload_0
L40:    getfield Field k c Ljava/io/RandomAccessFile;
L43:    aload_0
L44:    getfield Field k b J
L47:    lconst_1
L48:    ladd
L49:    invokevirtual Method java/io/RandomAccessFile seek (J)V
L52:    aload_0
L53:    getfield Field k c Ljava/io/RandomAccessFile;
L56:    iconst_1
L57:    invokevirtual Method java/io/RandomAccessFile write (I)V
L60:    new java/io/EOFException
L63:    dup
L64:    invokespecial Method java/io/EOFException <init> ()V
L67:    athrow
L68:    aload_0
L69:    getfield Field k c Ljava/io/RandomAccessFile;
L72:    aload_2
L73:    iload_3
L74:    iload 4
L76:    invokevirtual Method java/io/RandomAccessFile write ([BII)V
L79:    aload_0
L80:    dup
L81:    getfield Field k a J
L84:    iload 4
L86:    i2l
L87:    ladd
L88:    putfield Field k a J
L91:    goto L99
L94:    astore 5
L96:    aload 5
L98:    athrow
L99:    return
L100:   
        .linenumbertable
            L0 28
            L12 29
            L39 32
            L52 33
            L60 34
            L68 37
            L79 38
            L91 41
            L94 39
            L96 40
            L99 42
        .end linenumbertable
    .end code
    .exceptions java/io/IOException
.end method

.method public final b : (B)J
    .code stack 2 locals 3
        .catch java/lang/RuntimeException from L0 to L21 using L22
L0:     iload_1
L1:     bipush -19
L3:     if_icmplt L14
L6:     aload_0
L7:     aconst_null
L8:     checkcast java/io/File
L11:    putfield Field k d Ljava/io/File;
L14:    aload_0
L15:    getfield Field k c Ljava/io/RandomAccessFile;
L18:    invokevirtual Method java/io/RandomAccessFile length ()J
L21:    lreturn
L22:    astore_2
L23:    aload_2
L24:    athrow
L25:    
        .linenumbertable
            L0 45
            L6 46
            L14 48
            L22 49
            L23 50
        .end linenumbertable
    .end code
    .exceptions java/io/IOException
.end method

.method public final a : (I)V
    .code stack 2 locals 3
        .catch java/lang/RuntimeException from L0 to L34 using L37
L0:     iload_1
L1:     sipush 21657
L4:     if_icmpeq L14
L7:     aload_0
L8:     bipush 33
L10:    invokevirtual Method k a (B)Ljava/io/File;
L13:    pop
L14:    aconst_null
L15:    aload_0
L16:    getfield Field k c Ljava/io/RandomAccessFile;
L19:    if_acmpeq L34
L22:    aload_0
L23:    getfield Field k c Ljava/io/RandomAccessFile;
L26:    invokevirtual Method java/io/RandomAccessFile close ()V
L29:    aload_0
L30:    aconst_null
L31:    putfield Field k c Ljava/io/RandomAccessFile;
L34:    goto L40
L37:    astore_2
L38:    aload_2
L39:    athrow
L40:    return
L41:    
        .linenumbertable
            L0 56
            L7 57
            L14 59
            L22 61
            L29 62
            L34 67
            L37 65
            L38 66
            L40 68
        .end linenumbertable
    .end code
    .exceptions java/io/IOException
.end method

.method public final a : (JZ)V
    .code stack 3 locals 5
        .catch java/lang/RuntimeException from L0 to L25 using L28
L0:     iload_3
L1:     iconst_1
L2:     if_icmpeq L12
L5:     aload_0
L6:     bipush -76
L8:     invokevirtual Method k a (B)Ljava/io/File;
L11:    pop
L12:    aload_0
L13:    getfield Field k c Ljava/io/RandomAccessFile;
L16:    lload_1
L17:    invokevirtual Method java/io/RandomAccessFile seek (J)V
L20:    aload_0
L21:    lload_1
L22:    putfield Field k a J
L25:    goto L33
L28:    astore 4
L30:    aload 4
L32:    athrow
L33:    return
L34:    
        .linenumbertable
            L0 72
            L5 73
            L12 75
            L20 76
            L25 79
            L28 77
            L30 78
            L33 80
        .end linenumbertable
    .end code
    .exceptions java/io/IOException
.end method

.method public final a : (III[B)I
    .code stack 5 locals 6
        .catch java/lang/RuntimeException from L0 to L51 using L52
L0:     iload_3
L1:     sipush 15409
L4:     if_icmpeq L15
L7:     aload_0
L8:     aconst_null
L9:     checkcast java/io/RandomAccessFile
L12:    putfield Field k c Ljava/io/RandomAccessFile;
L15:    aload_0
L16:    getfield Field k c Ljava/io/RandomAccessFile;
L19:    aload 4
L21:    iload_1
L22:    iload_2
L23:    invokevirtual Method java/io/RandomAccessFile read ([BII)I
L26:    istore 5
L28:    iconst_0
L29:    iload 5
L31:    if_icmplt L37
L34:    goto L49
L37:    aload_0
L38:    dup
L39:    getfield Field k a J
L42:    iload 5
L44:    i2l
L45:    ladd
L46:    putfield Field k a J
L49:    iload 5
L51:    ireturn
L52:    astore 5
L54:    aload 5
L56:    athrow
L57:    
        .linenumbertable
            L0 86
            L7 87
            L15 90
            L28 91
            L37 93
            L49 95
            L52 96
            L54 97
        .end linenumbertable
    .end code
    .exceptions java/io/IOException
.end method

.method <init> : (Ljava/io/File;Ljava/lang/String;J)V
    .code stack 6 locals 6
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
        .catch java/lang/RuntimeException from L4 to L116 using L119
L4:     ldc2_w -1L
L7:     lload_3
L8:     lcmp
L9:     ifne L16
L12:    ldc2_w 9223372036854775807L
L15:    lstore_3
L16:    lload_3
L17:    ldc2_w -1L
L20:    lxor
L21:    aload_1
L22:    invokevirtual Method java/io/File length ()J
L25:    ldc2_w -1L
L28:    lxor
L29:    lcmp
L30:    iflt L38
L33:    aload_1
L34:    invokevirtual Method java/io/File delete ()Z
L37:    pop
L38:    aload_0
L39:    new java/io/RandomAccessFile
L42:    dup
L43:    aload_1
L44:    aload_2
L45:    invokespecial Method java/io/RandomAccessFile <init> (Ljava/io/File;Ljava/lang/String;)V
L48:    putfield Field k c Ljava/io/RandomAccessFile;
L51:    aload_0
L52:    lload_3
L53:    putfield Field k b J
L56:    aload_0
L57:    lconst_0
L58:    putfield Field k a J
L61:    aload_0
L62:    aload_1
L63:    putfield Field k d Ljava/io/File;
L66:    aload_0
L67:    getfield Field k c Ljava/io/RandomAccessFile;
L70:    invokevirtual Method java/io/RandomAccessFile read ()I
L73:    istore 5
L75:    iload 5
L77:    iconst_m1
L78:    ixor
L79:    ifeq L108
L82:    aload_2
L83:    ldc "r"
L85:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L88:    ifne L108
L91:    aload_0
L92:    getfield Field k c Ljava/io/RandomAccessFile;
L95:    lconst_0
L96:    invokevirtual Method java/io/RandomAccessFile seek (J)V
L99:    aload_0
L100:   getfield Field k c Ljava/io/RandomAccessFile;
L103:   iload 5
L105:   invokevirtual Method java/io/RandomAccessFile write (I)V
L108:   aload_0
L109:   getfield Field k c Ljava/io/RandomAccessFile;
L112:   lconst_0
L113:   invokevirtual Method java/io/RandomAccessFile seek (J)V
L116:   goto L124
L119:   astore 5
L121:   aload 5
L123:   athrow
L124:   return
L125:   
        .linenumbertable
            L0 100
            L4 103
            L12 104
            L16 106
            L33 110
            L38 113
            L51 114
            L56 115
            L61 116
            L66 117
            L75 118
            L91 120
            L99 121
            L108 124
            L116 127
            L119 125
            L121 126
            L124 128
        .end linenumbertable
    .end code
    .exceptions java/io/IOException
.end method
.sourcefile "k.java"
.end class
