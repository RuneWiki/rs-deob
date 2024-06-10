.version 48 0
.class final super ba
.super cb
.field private d J

.method final a : (III)I
    .code stack 7 locals 11
        .catch java/lang/RuntimeException from L0 to L134 using L135
L0:     ldc2_w 1000000L
L3:     iload_2
L4:     i2l
L5:     lmul
L6:     lstore 4
L8:     aload_0
L9:     getfield Field ba d J
L12:    invokestatic Method java/lang/System nanoTime ()J
L15:    lsub
L16:    lstore 6
L18:    lload 6
L20:    ldc2_w -1L
L23:    lxor
L24:    lload 4
L26:    ldc2_w -1L
L29:    lxor
L30:    lcmp
L31:    ifle L38
L34:    lload 4
L36:    lstore 6
L38:    lload 6
L40:    ldc2_w 1000000L
L43:    ldiv
L44:    iconst_0
L45:    invokestatic Method qa a (JZ)V
L48:    iload_1
L49:    istore 10
L51:    invokestatic Method java/lang/System nanoTime ()J
L54:    lstore 8
L56:    bipush -11
L58:    iload 10
L60:    iconst_m1
L61:    ixor
L62:    if_icmpge L113
L65:    iload 10
L67:    iconst_m1
L68:    ixor
L69:    bipush -2
L71:    if_icmpgt L92
L74:    lload 8
L76:    ldc2_w -1L
L79:    lxor
L80:    aload_0
L81:    getfield Field ba d J
L84:    ldc2_w -1L
L87:    lxor
L88:    lcmp
L89:    ifge L113
L92:    iinc 10 1
L95:    aload_0
L96:    dup
L97:    getfield Field ba d J
L100:   iload_3
L101:   i2l
L102:   ldc2_w 1000000L
L105:   lmul
L106:   ladd
L107:   putfield Field ba d J
L110:   goto L56
L113:   lload 8
L115:   aload_0
L116:   getfield Field ba d J
L119:   lcmp
L120:   ifgt L126
L123:   goto L132
L126:   aload_0
L127:   lload 8
L129:   putfield Field ba d J
L132:   iload 10
L134:   ireturn
L135:   astore 4
L137:   aload 4
L139:   athrow
L140:   
        .linenumbertable
            L0 6
            L8 8
            L18 10
            L34 11
            L38 13
            L48 15
            L51 16
            L56 17
            L92 19
            L95 20
            L113 23
            L126 25
            L132 27
            L135 28
            L137 29
        .end linenumbertable
    .end code
.end method

.method <init> : ()V
    .code stack 3 locals 2
L0:     aload_0
L1:     invokespecial Method cb <init> ()V
        .catch java/lang/RuntimeException from L4 to L11 using L14
L4:     aload_0
L5:     invokestatic Method java/lang/System nanoTime ()J
L8:     putfield Field ba d J
L11:    goto L17
L14:    astore_1
L15:    aload_1
L16:    athrow
L17:    return
L18:    
        .linenumbertable
            L0 33
            L4 35
            L11 38
            L14 36
            L15 37
            L17 39
        .end linenumbertable
    .end code
.end method
.sourcefile "ba.java"
.end class
