.version 45 3
.class final super ma
.super java/lang/Object
.implements java/awt/event/KeyListener
.implements java/awt/event/FocusListener
.field static volatile a I
.field static b I
.field static c Lsa;
.field static d I

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     return
L5:     
        .linenumbertable
            L0 31
            L4 32
        .end linenumbertable
    .end code
.end method

.method public final focusGained : (Ljava/awt/event/FocusEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 40
        .end linenumbertable
    .end code
.end method

.method public static a : (Z)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L13 using L16
L0:     aconst_null
L1:     putstatic Field ma c Lsa;
L4:     iload_0
L5:     ifeq L13
L8:     bipush 123
L10:    putstatic Field ma a I
L13:    goto L46
L16:    astore_1
L17:    aload_1
L18:    new java/lang/StringBuffer
L21:    dup
L22:    invokespecial Method java/lang/StringBuffer <init> ()V
L25:    ldc "ma.A("
L27:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L30:    iload_0
L31:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L34:    bipush 41
L36:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L39:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L42:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L45:    athrow
L46:    return
L47:    
        .linenumbertable
            L0 52
            L4 53
            L8 54
            L13 58
            L16 56
            L17 57
            L46 59
        .end linenumbertable
    .end code
.end method

.method public final synchronized keyReleased : (Ljava/awt/event/KeyEvent;)V
    .code stack 5 locals 3
        .catch java/lang/RuntimeException from L0 to L99 using L102
L0:     aconst_null
L1:     getstatic Field ca d Lma;
L4:     if_acmpne L10
L7:     goto L95
L10:    aload_1
L11:    invokevirtual Method java/awt/event/KeyEvent getKeyCode ()I
L14:    istore_2
L15:    iload_2
L16:    iflt L43
L19:    iload_2
L20:    getstatic Field a b [I
L23:    arraylength
L24:    if_icmpge L43
L27:    getstatic Field a b [I
L30:    iload_2
L31:    iaload
L32:    sipush -129
L35:    iand
L36:    istore_2
L37:    getstatic Field loginapplet o I
L40:    ifeq L45
L43:    iconst_m1
L44:    istore_2
L45:    getstatic Field p k I
L48:    iflt L95
L51:    iload_2
L52:    iconst_m1
L53:    ixor
L54:    iconst_m1
L55:    if_icmpgt L95
L58:    getstatic Field p p [I
L61:    getstatic Field p k I
L64:    iload_2
L65:    iconst_m1
L66:    ixor
L67:    iastore
L68:    bipush 127
L70:    iconst_1
L71:    getstatic Field p k I
L74:    iadd
L75:    iand
L76:    putstatic Field p k I
L79:    getstatic Field da c I
L82:    getstatic Field p k I
L85:    if_icmpeq L91
L88:    goto L95
L91:    iconst_m1
L92:    putstatic Field p k I
L95:    aload_1
L96:    invokevirtual Method java/awt/event/InputEvent consume ()V
L99:    goto L142
L102:   astore_2
L103:   aload_2
L104:   new java/lang/StringBuffer
L107:   dup
L108:   invokespecial Method java/lang/StringBuffer <init> ()V
L111:   ldc "ma.keyReleased("
L113:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L116:   aload_1
L117:   ifnull L125
L120:   ldc "{...}"
L122:   goto L127
L125:   ldc "null"
L127:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L130:   bipush 41
L132:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L135:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L138:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L141:   athrow
L142:   return
L143:   
        .linenumbertable
            L0 90
            L10 96
            L15 97
            L27 98
            L43 100
            L45 102
            L58 104
            L68 105
            L79 106
            L91 108
            L95 114
            L99 117
            L102 115
            L103 116
            L142 118
        .end linenumbertable
    .end code
.end method

.method public final keyTyped : (Ljava/awt/event/KeyEvent;)V
    .code stack 3 locals 4
        .catch java/lang/RuntimeException from L0 to L59 using L62
L0:     bipush 98
L2:     aload_1
L3:     invokestatic Method ha a (ILjava/awt/event/KeyEvent;)I
L6:     istore_2
L7:     iconst_0
L8:     iload_2
L9:     if_icmpgt L55
L12:    getstatic Field j d I
L15:    iconst_m1
L16:    isub
L17:    bipush 127
L19:    iand
L20:    istore_3
L21:    iload_3
L22:    iconst_m1
L23:    ixor
L24:    getstatic Field cb c I
L27:    iconst_m1
L28:    ixor
L29:    if_icmpne L35
L32:    goto L55
L35:    getstatic Field fa f [I
L38:    getstatic Field j d I
L41:    iconst_m1
L42:    iastore
L43:    getstatic Field e j [I
L46:    getstatic Field j d I
L49:    iload_2
L50:    iastore
L51:    iload_3
L52:    putstatic Field j d I
L55:    aload_1
L56:    invokevirtual Method java/awt/event/InputEvent consume ()V
L59:    goto L102
L62:    astore_2
L63:    aload_2
L64:    new java/lang/StringBuffer
L67:    dup
L68:    invokespecial Method java/lang/StringBuffer <init> ()V
L71:    ldc "ma.keyTyped("
L73:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L76:    aload_1
L77:    ifnull L85
L80:    ldc "{...}"
L82:    goto L87
L85:    ldc "null"
L87:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L90:    bipush 41
L92:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L95:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L98:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L101:   athrow
L102:   return
L103:   
        .linenumbertable
            L0 138
            L7 139
            L12 142
            L21 143
            L35 146
            L43 147
            L51 148
            L55 153
            L59 156
            L62 154
            L63 155
            L102 157
        .end linenumbertable
    .end code
.end method

.method public final synchronized keyPressed : (Ljava/awt/event/KeyEvent;)V
    .code stack 4 locals 4
        .catch java/lang/RuntimeException from L0 to L188 using L191
L0:     aconst_null
L1:     getstatic Field ca d Lma;
L4:     if_acmpne L10
L7:     goto L188
L10:    aload_1
L11:    invokevirtual Method java/awt/event/KeyEvent getKeyCode ()I
L14:    istore_2
L15:    iconst_m1
L16:    iload_2
L17:    iconst_m1
L18:    ixor
L19:    if_icmplt L34
L22:    iload_2
L23:    iconst_m1
L24:    ixor
L25:    getstatic Field a b [I
L28:    arraylength
L29:    iconst_m1
L30:    ixor
L31:    if_icmpgt L42
L34:    iconst_m1
L35:    istore_2
L36:    getstatic Field loginapplet o I
L39:    ifeq L62
L42:    getstatic Field a b [I
L45:    iload_2
L46:    iaload
L47:    istore_2
L48:    iconst_0
L49:    iload_2
L50:    sipush 128
L53:    iand
L54:    if_icmpne L60
L57:    goto L62
L60:    iconst_m1
L61:    istore_2
L62:    iconst_0
L63:    getstatic Field p k I
L66:    if_icmpgt L108
L69:    iconst_m1
L70:    iload_2
L71:    iconst_m1
L72:    ixor
L73:    if_icmplt L108
L76:    getstatic Field p p [I
L79:    getstatic Field p k I
L82:    iload_2
L83:    iastore
L84:    iconst_1
L85:    getstatic Field p k I
L88:    iadd
L89:    bipush 127
L91:    iand
L92:    putstatic Field p k I
L95:    getstatic Field p k I
L98:    getstatic Field da c I
L101:   if_icmpne L108
L104:   iconst_m1
L105:   putstatic Field p k I
L108:   iload_2
L109:   iconst_m1
L110:   ixor
L111:   iconst_m1
L112:   if_icmpgt L155
L115:   getstatic Field j d I
L118:   iconst_m1
L119:   isub
L120:   bipush 127
L122:   iand
L123:   istore_3
L124:   iload_3
L125:   iconst_m1
L126:   ixor
L127:   getstatic Field cb c I
L130:   iconst_m1
L131:   ixor
L132:   if_icmpeq L155
L135:   getstatic Field fa f [I
L138:   getstatic Field j d I
L141:   iload_2
L142:   iastore
L143:   getstatic Field e j [I
L146:   getstatic Field j d I
L149:   iconst_m1
L150:   iastore
L151:   iload_3
L152:   putstatic Field j d I
L155:   aload_1
L156:   invokevirtual Method java/awt/event/InputEvent getModifiers ()I
L159:   istore_3
L160:   iload_3
L161:   bipush 10
L163:   iand
L164:   iconst_m1
L165:   ixor
L166:   iconst_m1
L167:   if_icmpne L184
L170:   bipush -86
L172:   iload_2
L173:   iconst_m1
L174:   ixor
L175:   if_icmpeq L184
L178:   iload_2
L179:   bipush 10
L181:   if_icmpne L188
L184:   aload_1
L185:   invokevirtual Method java/awt/event/InputEvent consume ()V
L188:   goto L231
L191:   astore_2
L192:   aload_2
L193:   new java/lang/StringBuffer
L196:   dup
L197:   invokespecial Method java/lang/StringBuffer <init> ()V
L200:   ldc "ma.keyPressed("
L202:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L205:   aload_1
L206:   ifnull L214
L209:   ldc "{...}"
L211:   goto L216
L214:   ldc "null"
L216:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L219:   bipush 41
L221:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L224:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L227:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L230:   athrow
L231:   return
L232:   
        .linenumbertable
            L0 197
            L10 203
            L15 204
            L34 205
            L42 208
            L48 209
            L60 211
            L62 215
            L76 217
            L84 218
            L95 219
            L104 220
            L108 224
            L115 227
            L124 228
            L135 230
            L143 231
            L151 232
            L155 238
            L160 239
            L184 241
            L188 248
            L191 246
            L192 247
            L231 249
        .end linenumbertable
    .end code
.end method

.method public final synchronized focusLost : (Ljava/awt/event/FocusEvent;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L10 using L13
L0:     getstatic Field ca d Lma;
L3:     ifnull L10
L6:     iconst_m1
L7:     putstatic Field p k I
L10:    goto L53
L13:    astore_2
L14:    aload_2
L15:    new java/lang/StringBuffer
L18:    dup
L19:    invokespecial Method java/lang/StringBuffer <init> ()V
L22:    ldc "ma.focusLost("
L24:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L27:    aload_1
L28:    ifnull L36
L31:    ldc "{...}"
L33:    goto L38
L36:    ldc "null"
L38:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L41:    bipush 41
L43:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L46:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L49:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L52:    athrow
L53:    return
L54:    
        .linenumbertable
            L0 253
            L6 255
            L10 260
            L13 258
            L14 259
            L53 261
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 2 locals 0
L0:     iconst_0
L1:     putstatic Field ma a I
L4:     iconst_0
L5:     putstatic Field ma d I
L8:     bipush -127
L10:    ldc "box_top"
L12:    invokestatic Method ca a (ILjava/lang/String;)Lsa;
L15:    putstatic Field ma c Lsa;
L18:    return
L19:    
        .linenumbertable
            L0 126
            L4 162
            L8 167
            L18 185
        .end linenumbertable
    .end code
.end method
.sourcefile "ma.java"
.end class
