.version 45 3
.class public super abstract ab
.super java/applet/Applet
.implements java/lang/Runnable
.implements java/awt/event/FocusListener
.implements java/awt/event/WindowListener
.field a Z
.field static b Z
.field static c I
.field public static d I
.field public static e I

.method private final synchronized a : (B)V
    .code stack 3 locals 3
L0:     getstatic Field qa c Z
L3:     ifne L9
L6:     goto L10
L9:     return
L10:    iconst_1
L11:    putstatic Field qa c Z
        .catch java/lang/Exception from L14 to L21 using L24
L14:    getstatic Field ca a Ljava/awt/Canvas;
L17:    aload_0
L18:    invokevirtual Method java/awt/Component removeFocusListener (Ljava/awt/event/FocusListener;)V
L21:    goto L25
L24:    astore_2
        .catch java/lang/Exception from L25 to L33 using L36
L25:    aload_0
L26:    iload_1
L27:    bipush -100
L29:    iadd
L30:    invokevirtual Method ab d (I)V
L33:    goto L37
L36:    astore_2
L37:    getstatic Field ha i Ljava/awt/Frame;
L40:    ifnull L51
        .catch java/lang/Throwable from L43 to L47 using L50
L43:    iconst_0
L44:    invokestatic Method java/lang/System exit (I)V
L47:    goto L51
L50:    astore_2
L51:    iload_1
L52:    bipush 56
L54:    if_icmpeq L58
L57:    return
L58:    aconst_null
L59:    getstatic Field ea o Lr;
L62:    if_acmpne L68
L65:    goto L80
        .catch java/lang/Exception from L68 to L76 using L79
        .catch java/lang/RuntimeException from L0 to L9 using L88
        .catch java/lang/RuntimeException from L10 to L57 using L88
        .catch java/lang/RuntimeException from L58 to L85 using L88
L68:    getstatic Field ea o Lr;
L71:    bipush -84
L73:    invokevirtual Method r a (B)V
L76:    goto L80
L79:    astore_2
L80:    aload_0
L81:    iconst_1
L82:    invokevirtual Method ab a (Z)V
L85:    goto L118
L88:    astore_2
L89:    aload_2
L90:    new java/lang/StringBuffer
L93:    dup
L94:    invokespecial Method java/lang/StringBuffer <init> ()V
L97:    ldc "ab.Q("
L99:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L102:   iload_1
L103:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L106:   bipush 41
L108:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L111:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L114:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L117:   athrow
L118:   return
L119:   
        .linenumbertable
            L0 8
            L9 10
            L10 12
            L14 14
            L21 18
            L24 15
            L25 20
            L33 24
            L36 21
            L37 25
            L43 28
            L47 32
            L50 29
            L51 35
            L57 36
            L58 38
            L68 42
            L76 46
            L79 43
            L80 49
            L85 52
            L88 50
            L89 51
            L118 53
        .end linenumbertable
    .end code
.end method

.method public final windowOpened : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 59
        .end linenumbertable
    .end code
.end method

.method public final windowClosed : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 61
        .end linenumbertable
    .end code
.end method

.method abstract b : (B)V
.end method

.method public final windowClosing : (Ljava/awt/event/WindowEvent;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L4 using L7
L0:     aload_0
L1:     invokevirtual Method ab destroy ()V
L4:     goto L47
L7:     astore_2
L8:     aload_2
L9:     new java/lang/StringBuffer
L12:    dup
L13:    invokespecial Method java/lang/StringBuffer <init> ()V
L16:    ldc "ab.windowClosing("
L18:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L21:    aload_1
L22:    ifnull L30
L25:    ldc "{...}"
L27:    goto L32
L30:    ldc "null"
L32:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L35:    bipush 41
L37:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L40:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L43:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L46:    athrow
L47:    return
L48:    
        .linenumbertable
            L0 66
            L4 69
            L7 67
            L8 68
            L47 70
        .end linenumbertable
    .end code
.end method

.method static final a : (IB)Lsa;
    .code stack 3 locals 4
        .catch java/lang/RuntimeException from L0 to L32 using L33
L0:     new sa
L3:     dup
L4:     invokespecial Method sa <init> ()V
L7:     astore_2
L8:     bipush 103
L10:    bipush -62
L12:    iload_1
L13:    isub
L14:    bipush 49
L16:    idiv
L17:    irem
L18:    istore_3
L19:    aload_2
L20:    iload_0
L21:    newarray byte
L23:    putfield Field sa d [B
L26:    aload_2
L27:    iconst_0
L28:    putfield Field sa k I
L31:    aload_2
L32:    areturn
L33:    astore_2
L34:    aload_2
L35:    new java/lang/StringBuffer
L38:    dup
L39:    invokespecial Method java/lang/StringBuffer <init> ()V
L42:    ldc "ab.R("
L44:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L47:    iload_0
L48:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L51:    bipush 44
L53:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L56:    iload_1
L57:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L60:    bipush 41
L62:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L65:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L68:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L71:    athrow
L72:    
        .linenumbertable
            L0 74
            L8 76
            L19 77
            L26 78
            L31 79
            L33 80
            L34 81
        .end linenumbertable
    .end code
.end method

.method abstract a : (Z)V
.end method

.method public final synchronized paint : (Ljava/awt/Graphics;)V
    .code stack 4 locals 3
        .catch java/lang/RuntimeException from L0 to L16 using L93
L0:     aload_0
L1:     getstatic Field b E Lab;
L4:     if_acmpne L16
L7:     getstatic Field qa c Z
L10:    ifne L16
L13:    goto L17
L16:    return
        .catch java/lang/RuntimeException from L17 to L90 using L93
L17:    aconst_null
L18:    getstatic Field r j Ljava/lang/String;
L21:    if_acmpeq L90
L24:    getstatic Field r j Ljava/lang/String;
L27:    ldc "1.5"
L29:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L32:    ifeq L90
L35:    iconst_1
L36:    invokestatic Method t a (Z)J
L39:    getstatic Field bb b J
L42:    lsub
L43:    ldc2_w -1L
L46:    lxor
L47:    ldc2_w -1001L
L50:    lcmp
L51:    iflt L57
L54:    goto L90
L57:    aload_1
L58:    invokevirtual Method java/awt/Graphics getClipBounds ()Ljava/awt/Rectangle;
L61:    astore_2
L62:    aload_2
L63:    ifnull L86
L66:    getstatic Field p c I
L69:    aload_2
L70:    getfield Field java/awt/Rectangle width I
L73:    if_icmpgt L90
L76:    aload_2
L77:    getfield Field java/awt/Rectangle height I
L80:    getstatic Field loginapplet g I
L83:    if_icmplt L90
L86:    iconst_1
L87:    putstatic Field p b Z
L90:    goto L133
L93:    astore_2
L94:    aload_2
L95:    new java/lang/StringBuffer
L98:    dup
L99:    invokespecial Method java/lang/StringBuffer <init> ()V
L102:   ldc "ab.paint("
L104:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L107:   aload_1
L108:   ifnull L116
L111:   ldc "{...}"
L113:   goto L118
L116:   ldc "null"
L118:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L121:   bipush 41
L123:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L126:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L129:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L132:   athrow
L133:   return
L134:   
        .linenumbertable
            L0 91
            L16 93
            L17 97
            L35 99
            L57 103
            L62 104
            L86 105
            L90 113
            L93 111
            L94 112
            L133 114
        .end linenumbertable
    .end code
.end method

.method public final start : ()V
    .code stack 2 locals 2
        .catch java/lang/RuntimeException from L0 to L13 using L21
L0:     aload_0
L1:     getstatic Field b E Lab;
L4:     if_acmpne L13
L7:     getstatic Field qa c Z
L10:    ifeq L14
L13:    return
        .catch java/lang/RuntimeException from L14 to L18 using L21
L14:    lconst_0
L15:    putstatic Field bb c J
L18:    goto L29
L21:    astore_1
L22:    aload_1
L23:    ldc "ab.start()"
L25:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L28:    athrow
L29:    return
L30:    
        .linenumbertable
            L0 118
            L13 119
            L14 121
            L18 124
            L21 122
            L22 123
            L29 125
        .end linenumbertable
    .end code
.end method

.method static final a : (IFIF)V
    .code stack 10 locals 11
L0:     getstatic Field loginapplet o I
L3:     istore 10
        .catch java/lang/RuntimeException from L5 to L204 using L207
L5:     fload_1
L6:     putstatic Field g d F
L9:     fload_3
L10:    putstatic Field qa b F
L13:    iload_2
L14:    anewarray c
L17:    putstatic Field b M [Lc;
L20:    iconst_0
L21:    istore 4
L23:    iload_2
L24:    iconst_m1
L25:    ixor
L26:    iload 4
L28:    iconst_m1
L29:    ixor
L30:    if_icmpge L125
L33:    ldc2_w 3.141592653589793e0
L36:    getstatic Field v a Ljava/util/Random;
L39:    invokevirtual Method java/util/Random nextDouble ()D
L42:    ldc2_w 2e0
L45:    dmul
L46:    dmul
L47:    dstore 5
L49:    getstatic Field v a Ljava/util/Random;
L52:    invokevirtual Method java/util/Random nextInt ()I
L55:    sipush 200
L58:    irem
L59:    invokestatic Method java/lang/Math abs (I)I
L62:    istore 7
L64:    dload 5
L66:    invokestatic Method java/lang/Math cos (D)D
L69:    d2f
L70:    fstore 8
L72:    dload 5
L74:    invokestatic Method java/lang/Math sin (D)D
L77:    d2f
L78:    fstore 9
L80:    getstatic Field b M [Lc;
L83:    iload 4
L85:    new c
L88:    dup
L89:    fload 8
L91:    ldc 1.5e1f
L93:    fmul
L94:    getstatic Field qa b F
L97:    fadd
L98:    getstatic Field g d F
L101:   fload 9
L103:   ldc 1.5e1f
L105:   fmul
L106:   fadd
L107:   fload 8
L109:   fload 9
L111:   iload 7
L113:   invokespecial Method c <init> (FFFFI)V
L116:   aastore
L117:   iinc 4 1
L120:   iload 10
L122:   ifeq L23
L125:   sipush 255
L128:   newarray int
L130:   putstatic Field g f [I
L133:   iconst_0
L134:   istore 4
L136:   iload 4
L138:   sipush 255
L141:   if_icmpge L193
L144:   getstatic Field g f [I
L147:   iload 4
L149:   iload 4
L151:   iconst_1
L152:   invokestatic Method j a (IZ)I
L155:   iastore
L156:   iload 4
L158:   sipush 210
L161:   if_icmple L185
L164:   getstatic Field g f [I
L167:   iload 4
L169:   getstatic Field g f [I
L172:   iload 4
L174:   iaload
L175:   iload 4
L177:   iconst_1
L178:   invokestatic Method ab a (IZ)I
L181:   invokestatic Method l a (II)I
L184:   iastore
L185:   iinc 4 1
L188:   iload 10
L190:   ifeq L136
L193:   iload_0
L194:   sipush -15775
L197:   if_icmpeq L204
L200:   iconst_0
L201:   putstatic Field ab b Z
L204:   goto L266
L207:   astore 4
L209:   aload 4
L211:   new java/lang/StringBuffer
L214:   dup
L215:   invokespecial Method java/lang/StringBuffer <init> ()V
L218:   ldc "ab.N("
L220:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L223:   iload_0
L224:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L227:   bipush 44
L229:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L232:   fload_1
L233:   invokevirtual Method java/lang/StringBuffer append (F)Ljava/lang/StringBuffer;
L236:   bipush 44
L238:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L241:   iload_2
L242:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L245:   bipush 44
L247:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L250:   fload_3
L251:   invokevirtual Method java/lang/StringBuffer append (F)Ljava/lang/StringBuffer;
L254:   bipush 41
L256:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L259:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L262:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L265:   athrow
L266:   return
L267:   
        .linenumbertable
            L5 128
            L9 129
            L13 130
            L20 133
            L23 134
            L33 137
            L49 141
            L64 142
            L72 143
            L80 144
            L117 134
            L125 148
            L133 151
            L136 152
            L144 154
            L156 155
            L164 156
            L185 152
            L193 160
            L200 161
            L204 166
            L207 164
            L209 165
            L266 167
        .end linenumbertable
    .end code
.end method

.method public final windowDeactivated : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 170
        .end linenumbertable
    .end code
.end method

.method final synchronized a : (I)V
    .code stack 4 locals 5
L0:     getstatic Field loginapplet o I
L3:     istore 4
        .catch java/lang/RuntimeException from L5 to L163 using L166
L5:     getstatic Field ha i Ljava/awt/Frame;
L8:     ifnull L20
L11:    getstatic Field ha i Ljava/awt/Frame;
L14:    astore_2
L15:    iload 4
L17:    ifeq L27
L20:    getstatic Field ea o Lr;
L23:    getfield Field r a Ljava/applet/Applet;
L26:    astore_2
L27:    getstatic Field ca a Ljava/awt/Canvas;
L30:    ifnull L47
L33:    getstatic Field ca a Ljava/awt/Canvas;
L36:    aload_0
L37:    invokevirtual Method java/awt/Component removeFocusListener (Ljava/awt/event/FocusListener;)V
L40:    aload_2
L41:    getstatic Field ca a Ljava/awt/Canvas;
L44:    invokevirtual Method java/awt/Container remove (Ljava/awt/Component;)V
L47:    new qa
L50:    dup
L51:    aload_0
L52:    invokespecial Method qa <init> (Ljava/awt/Component;)V
L55:    putstatic Field ca a Ljava/awt/Canvas;
L58:    aload_2
L59:    getstatic Field ca a Ljava/awt/Canvas;
L62:    invokevirtual Method java/awt/Container add (Ljava/awt/Component;)Ljava/awt/Component;
L65:    pop
L66:    getstatic Field ca a Ljava/awt/Canvas;
L69:    getstatic Field p c I
L72:    getstatic Field loginapplet g I
L75:    invokevirtual Method java/awt/Component setSize (II)V
L78:    getstatic Field ca a Ljava/awt/Canvas;
L81:    iconst_1
L82:    invokevirtual Method java/awt/Component setVisible (Z)V
L85:    aconst_null
L86:    getstatic Field ha i Ljava/awt/Frame;
L89:    if_acmpeq L118
L92:    getstatic Field ha i Ljava/awt/Frame;
L95:    invokevirtual Method java/awt/Container getInsets ()Ljava/awt/Insets;
L98:    astore_3
L99:    getstatic Field ca a Ljava/awt/Canvas;
L102:   aload_3
L103:   getfield Field java/awt/Insets left I
L106:   aload_3
L107:   getfield Field java/awt/Insets top I
L110:   invokevirtual Method java/awt/Component setLocation (II)V
L113:   iload 4
L115:   ifeq L126
L118:   getstatic Field ca a Ljava/awt/Canvas;
L121:   iconst_0
L122:   iconst_0
L123:   invokevirtual Method java/awt/Component setLocation (II)V
L126:   iload_1
L127:   bipush 73
L129:   if_icmpgt L139
L132:   bipush 126
L134:   iconst_0
L135:   invokestatic Method ab a (IZ)I
L138:   pop
L139:   getstatic Field ca a Ljava/awt/Canvas;
L142:   aload_0
L143:   invokevirtual Method java/awt/Component addFocusListener (Ljava/awt/event/FocusListener;)V
L146:   getstatic Field ca a Ljava/awt/Canvas;
L149:   invokevirtual Method java/awt/Component requestFocus ()V
L152:   iconst_0
L153:   putstatic Field p b Z
L156:   iconst_1
L157:   invokestatic Method t a (Z)J
L160:   putstatic Field bb b J
L163:   goto L196
L166:   astore_2
L167:   aload_2
L168:   new java/lang/StringBuffer
L171:   dup
L172:   invokespecial Method java/lang/StringBuffer <init> ()V
L175:   ldc "ab.S("
L177:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L180:   iload_1
L181:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L184:   bipush 41
L186:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L189:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L192:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L195:   athrow
L196:   return
L197:   
        .linenumbertable
            L5 176
            L11 177
            L20 179
            L27 181
            L33 183
            L40 184
            L47 187
            L58 188
            L66 189
            L78 190
            L85 191
            L92 194
            L99 195
            L113 196
            L118 198
            L126 200
            L132 201
            L139 203
            L146 204
            L152 205
            L156 206
            L163 209
            L166 207
            L167 208
            L196 210
        .end linenumbertable
    .end code
.end method

.method public final getAppletContext : ()Ljava/applet/AppletContext;
    .code stack 2 locals 2
        .catch java/lang/RuntimeException from L0 to L11 using L46
L0:     aconst_null
L1:     getstatic Field ha i Ljava/awt/Frame;
L4:     if_acmpne L10
L7:     goto L12
L10:    aconst_null
L11:    areturn
        .catch java/lang/RuntimeException from L12 to L40 using L46
L12:    getstatic Field ea o Lr;
L15:    ifnull L41
L18:    getstatic Field ea o Lr;
L21:    getfield Field r a Ljava/applet/Applet;
L24:    aload_0
L25:    if_acmpne L31
L28:    goto L41
L31:    getstatic Field ea o Lr;
L34:    getfield Field r a Ljava/applet/Applet;
L37:    invokevirtual Method java/applet/Applet getAppletContext ()Ljava/applet/AppletContext;
L40:    areturn
        .catch java/lang/RuntimeException from L41 to L45 using L46
L41:    aload_0
L42:    invokespecial Method java/applet/Applet getAppletContext ()Ljava/applet/AppletContext;
L45:    areturn
L46:    astore_1
L47:    aload_1
L48:    ldc "ab.getAppletContext()"
L50:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L53:    athrow
L54:    
        .linenumbertable
            L0 215
            L10 217
            L12 219
            L31 221
            L41 223
            L46 224
            L47 225
        .end linenumbertable
    .end code
.end method

.method final c : (B)Z
    .code stack 5 locals 4
L0:     getstatic Field loginapplet o I
L3:     istore_3
        .catch java/lang/RuntimeException from L4 to L11 using L153
L4:     iload_1
L5:     bipush 69
L7:     if_icmpeq L12
L10:    iconst_1
L11:    ireturn
        .catch java/lang/RuntimeException from L12 to L42 using L153
L12:    aload_0
L13:    invokevirtual Method ab getDocumentBase ()Ljava/net/URL;
L16:    invokevirtual Method java/net/URL getHost ()Ljava/lang/String;
L19:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L22:    astore_2
L23:    aload_2
L24:    ldc "jagex.com"
L26:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L29:    ifne L41
L32:    aload_2
L33:    ldc ".jagex.com"
L35:    invokevirtual Method java/lang/String endsWith (Ljava/lang/String;)Z
L38:    ifeq L43
L41:    iconst_1
L42:    ireturn
        .catch java/lang/RuntimeException from L43 to L65 using L153
L43:    aload_2
L44:    ldc "runescape.com"
L46:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L49:    ifne L64
L52:    aload_2
L53:    ldc ".runescape.com"
L55:    invokevirtual Method java/lang/String endsWith (Ljava/lang/String;)Z
L58:    ifne L64
L61:    goto L66
L64:    iconst_1
L65:    ireturn
        .catch java/lang/RuntimeException from L66 to L76 using L153
L66:    aload_2
L67:    ldc "127.0.0.1"
L69:    invokevirtual Method java/lang/String endsWith (Ljava/lang/String;)Z
L72:    ifeq L77
L75:    iconst_1
L76:    ireturn
        .catch java/lang/RuntimeException from L77 to L143 using L153
L77:    iconst_m1
L78:    aload_2
L79:    invokevirtual Method java/lang/String length ()I
L82:    iconst_m1
L83:    ixor
L84:    if_icmple L133
L87:    aload_2
L88:    iconst_m1
L89:    aload_2
L90:    invokevirtual Method java/lang/String length ()I
L93:    iadd
L94:    invokevirtual Method java/lang/String charAt (I)C
L97:    bipush 48
L99:    if_icmplt L133
L102:   aload_2
L103:   aload_2
L104:   invokevirtual Method java/lang/String length ()I
L107:   iconst_1
L108:   isub
L109:   invokevirtual Method java/lang/String charAt (I)C
L112:   bipush 57
L114:   if_icmpgt L133
L117:   aload_2
L118:   iconst_0
L119:   aload_2
L120:   invokevirtual Method java/lang/String length ()I
L123:   iconst_m1
L124:   iadd
L125:   invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L128:   astore_2
L129:   iload_3
L130:   ifeq L77
L133:   aload_2
L134:   ldc "192.168.1."
L136:   invokevirtual Method java/lang/String endsWith (Ljava/lang/String;)Z
L139:   ifeq L144
L142:   iconst_1
L143:   ireturn
        .catch java/lang/RuntimeException from L144 to L152 using L153
L144:   aload_0
L145:   iconst_0
L146:   ldc "invalidhost"
L148:   invokevirtual Method ab a (ZLjava/lang/String;)V
L151:   iconst_0
L152:   ireturn
L153:   astore_2
L154:   aload_2
L155:   new java/lang/StringBuffer
L158:   dup
L159:   invokespecial Method java/lang/StringBuffer <init> ()V
L162:   ldc "ab.U("
L164:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L167:   iload_1
L168:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L171:   bipush 41
L173:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L176:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L179:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L182:   athrow
L183:   
        .linenumbertable
            L4 231
            L10 232
            L12 234
            L23 235
            L41 236
            L43 238
            L64 240
            L66 246
            L75 247
            L77 249
            L117 250
            L133 252
            L142 253
            L144 255
            L151 256
            L153 257
            L154 258
        .end linenumbertable
    .end code
.end method

.method private final b : (I)V
    .code stack 6 locals 8
L0:     getstatic Field u b [J
L3:     getstatic Field i f I
L6:     laload
L7:     lstore 4
L9:     iconst_1
L10:    invokestatic Method t a (Z)J
L13:    lstore_2
L14:    getstatic Field u b [J
L17:    getstatic Field i f I
L20:    lload_2
L21:    lastore
L22:    getstatic Field i f I
L25:    iload_1
L26:    isub
L27:    bipush 31
L29:    iand
L30:    putstatic Field i f I
L33:    lload 4
L35:    lconst_0
L36:    lcmp
L37:    ifeq L55
L40:    lload_2
L41:    ldc2_w -1L
L44:    lxor
L45:    lload 4
L47:    ldc2_w -1L
L50:    lxor
L51:    lcmp
L52:    iflt L55
L55:    aload_0
L56:    dup
L57:    astore 6
L59:    monitorenter
        .catch [0] from L60 to L69 using L72
L60:    getstatic Field da d Z
L63:    putstatic Field ab b Z
L66:    aload 6
L68:    monitorexit
L69:    goto L80
        .catch [0] from L72 to L77 using L72
        .catch java/lang/RuntimeException from L0 to L86 using L89
L72:    astore 7
L74:    aload 6
L76:    monitorexit
L77:    aload 7
L79:    athrow
L80:    aload_0
L81:    bipush -80
L83:    invokevirtual Method ab d (B)V
L86:    goto L119
L89:    astore_2
L90:    aload_2
L91:    new java/lang/StringBuffer
L94:    dup
L95:    invokespecial Method java/lang/StringBuffer <init> ()V
L98:    ldc "ab.T("
L100:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L103:   iload_1
L104:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L107:   bipush 41
L109:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L112:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L115:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L118:   athrow
L119:   return
L120:   
        .linenumbertable
            L0 266
            L9 267
            L14 268
            L22 269
            L33 270
            L55 280
            L60 281
            L66 282
            L80 283
            L86 286
            L89 284
            L90 285
            L119 287
        .end linenumbertable
    .end code
.end method

.method public final getParameter : (Ljava/lang/String;)Ljava/lang/String;
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L7 using L42
L0:     getstatic Field ha i Ljava/awt/Frame;
L3:     ifnull L8
L6:     aconst_null
L7:     areturn
        .catch java/lang/RuntimeException from L8 to L35 using L42
L8:     aconst_null
L9:     getstatic Field ea o Lr;
L12:    if_acmpeq L36
L15:    aload_0
L16:    getstatic Field ea o Lr;
L19:    getfield Field r a Ljava/applet/Applet;
L22:    if_acmpeq L36
L25:    getstatic Field ea o Lr;
L28:    getfield Field r a Ljava/applet/Applet;
L31:    aload_1
L32:    invokevirtual Method java/applet/Applet getParameter (Ljava/lang/String;)Ljava/lang/String;
L35:    areturn
        .catch java/lang/RuntimeException from L36 to L41 using L42
L36:    aload_0
L37:    aload_1
L38:    invokespecial Method java/applet/Applet getParameter (Ljava/lang/String;)Ljava/lang/String;
L41:    areturn
L42:    astore_2
L43:    aload_2
L44:    new java/lang/StringBuffer
L47:    dup
L48:    invokespecial Method java/lang/StringBuffer <init> ()V
L51:    ldc "ab.getParameter("
L53:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L56:    aload_1
L57:    ifnull L65
L60:    ldc "{...}"
L62:    goto L67
L65:    ldc "null"
L67:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L70:    bipush 41
L72:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L75:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L78:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L81:    athrow
L82:    
        .linenumbertable
            L0 292
            L6 293
            L8 295
            L25 296
            L36 298
            L42 299
            L43 300
        .end linenumbertable
    .end code
.end method

.method final a : (IIIII)V
    .code stack 7 locals 7
        .catch java/lang/Exception from L0 to L29 using L123
L0:     aconst_null
L1:     getstatic Field b E Lab;
L4:     if_acmpeq L46
L7:     getstatic Field sa c I
L10:    iconst_1
L11:    iadd
L12:    putstatic Field sa c I
L15:    getstatic Field sa c I
L18:    iconst_3
L19:    if_icmplt L30
L22:    aload_0
L23:    iconst_0
L24:    ldc "alreadyloaded"
L26:    invokevirtual Method ab a (ZLjava/lang/String;)V
L29:    return
        .catch java/lang/Exception from L30 to L45 using L123
L30:    aload_0
L31:    invokevirtual Method ab getAppletContext ()Ljava/applet/AppletContext;
L34:    aload_0
L35:    invokevirtual Method ab getDocumentBase ()Ljava/net/URL;
L38:    ldc "_self"
L40:    invokeinterface InterfaceMethod java/applet/AppletContext showDocument (Ljava/net/URL;Ljava/lang/String;)V 3
L45:    return
        .catch java/lang/Exception from L46 to L120 using L123
        .catch java/lang/RuntimeException from L0 to L29 using L143
        .catch java/lang/RuntimeException from L30 to L45 using L143
        .catch java/lang/RuntimeException from L46 to L140 using L143
L46:    iload_3
L47:    putstatic Field p c I
L50:    iload 5
L52:    sipush -18742
L55:    if_icmpeq L63
L58:    bipush 96
L60:    putstatic Field ab c I
L63:    iload_1
L64:    putstatic Field oa g I
L67:    iload_2
L68:    putstatic Field loginapplet g I
L71:    aload_0
L72:    putstatic Field b E Lab;
L75:    aconst_null
L76:    getstatic Field ea o Lr;
L79:    if_acmpeq L85
L82:    goto L105
L85:    new r
L88:    dup
L89:    iconst_0
L90:    aload_0
L91:    iload 4
L93:    aconst_null
L94:    iconst_0
L95:    invokespecial Method r <init> (ZLjava/applet/Applet;ILjava/lang/String;I)V
L98:    dup
L99:    putstatic Field ea o Lr;
L102:   putstatic Field ga g Lr;
L105:   getstatic Field ea o Lr;
L108:   aload_0
L109:   iload 5
L111:   sipush 18744
L114:   iadd
L115:   iconst_1
L116:   invokevirtual Method r a (Ljava/lang/Runnable;II)Lta;
L119:   pop
L120:   goto L140
L123:   astore 6
L125:   aconst_null
L126:   aload 6
L128:   bipush -47
L130:   invokestatic Method f a (Ljava/lang/String;Ljava/lang/Throwable;I)V
L133:   aload_0
L134:   iconst_0
L135:   ldc "crash"
L137:   invokevirtual Method ab a (ZLjava/lang/String;)V
L140:   goto L213
L143:   astore 6
L145:   aload 6
L147:   new java/lang/StringBuffer
L150:   dup
L151:   invokespecial Method java/lang/StringBuffer <init> ()V
L154:   ldc "ab.O("
L156:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L159:   iload_1
L160:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L163:   bipush 44
L165:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L168:   iload_2
L169:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L172:   bipush 44
L174:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L177:   iload_3
L178:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L181:   bipush 44
L183:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L186:   iload 4
L188:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L191:   bipush 44
L193:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L196:   iload 5
L198:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L201:   bipush 41
L203:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L206:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L209:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L212:   athrow
L213:   return
L214:   
        .linenumbertable
            L0 306
            L7 308
            L15 309
            L22 311
            L29 312
            L30 315
            L45 316
            L46 319
            L50 320
            L58 321
            L63 323
            L67 324
            L71 325
            L75 326
            L85 328
            L105 330
            L120 336
            L123 331
            L125 332
            L133 335
            L140 339
            L143 337
            L145 338
            L213 340
        .end linenumbertable
    .end code
.end method

.method private final c : (I)V
    .code stack 7 locals 7
        .catch java/lang/RuntimeException from L0 to L26 using L162
L0:     iconst_1
L1:     invokestatic Method t a (Z)J
L4:     lstore_2
L5:     getstatic Field u a [J
L8:     getstatic Field oa d I
L11:    laload
L12:    lstore 4
L14:    getstatic Field u a [J
L17:    getstatic Field oa d I
L20:    lload_2
L21:    lastore
L22:    iload_1
L23:    ifeq L27
L26:    return
        .catch java/lang/RuntimeException from L27 to L159 using L162
L27:    bipush 31
L29:    iconst_1
L30:    getstatic Field oa d I
L33:    iadd
L34:    iand
L35:    putstatic Field oa d I
L38:    lload 4
L40:    ldc2_w -1L
L43:    lxor
L44:    ldc2_w -1L
L47:    lcmp
L48:    ifeq L66
L51:    lload 4
L53:    ldc2_w -1L
L56:    lxor
L57:    lload_2
L58:    ldc2_w -1L
L61:    lxor
L62:    lcmp
L63:    ifle L66
L66:    getstatic Field d a I
L69:    dup
L70:    iconst_1
L71:    iadd
L72:    putstatic Field d a I
L75:    bipush 50
L77:    if_icmple L153
L80:    getstatic Field d a I
L83:    bipush 50
L85:    isub
L86:    putstatic Field d a I
L89:    getstatic Field ca a Ljava/awt/Canvas;
L92:    getstatic Field p c I
L95:    getstatic Field loginapplet g I
L98:    invokevirtual Method java/awt/Component setSize (II)V
L101:   getstatic Field ca a Ljava/awt/Canvas;
L104:   iconst_1
L105:   invokevirtual Method java/awt/Component setVisible (Z)V
L108:   aconst_null
L109:   getstatic Field ha i Ljava/awt/Frame;
L112:   if_acmpne L129
L115:   getstatic Field ca a Ljava/awt/Canvas;
L118:   iconst_0
L119:   iconst_0
L120:   invokevirtual Method java/awt/Component setLocation (II)V
L123:   getstatic Field loginapplet o I
L126:   ifeq L153
L129:   getstatic Field ha i Ljava/awt/Frame;
L132:   invokevirtual Method java/awt/Container getInsets ()Ljava/awt/Insets;
L135:   astore 6
L137:   getstatic Field ca a Ljava/awt/Canvas;
L140:   aload 6
L142:   getfield Field java/awt/Insets left I
L145:   aload 6
L147:   getfield Field java/awt/Insets top I
L150:   invokevirtual Method java/awt/Component setLocation (II)V
L153:   aload_0
L154:   bipush 113
L156:   invokevirtual Method ab b (B)V
L159:   goto L192
L162:   astore_2
L163:   aload_2
L164:   new java/lang/StringBuffer
L167:   dup
L168:   invokespecial Method java/lang/StringBuffer <init> ()V
L171:   ldc "ab.P("
L173:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L176:   iload_1
L177:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L180:   bipush 41
L182:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L185:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L188:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L191:   athrow
L192:   return
L193:   
        .linenumbertable
            L0 345
            L5 346
            L14 347
            L22 348
            L26 349
            L27 351
            L38 352
            L66 361
            L80 363
            L89 366
            L101 367
            L108 368
            L115 369
            L129 373
            L137 374
            L153 379
            L159 382
            L162 380
            L163 381
            L192 383
        .end linenumbertable
    .end code
.end method

.method public final focusLost : (Ljava/awt/event/FocusEvent;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L4 using L7
L0:     iconst_0
L1:     putstatic Field da d Z
L4:     goto L47
L7:     astore_2
L8:     aload_2
L9:     new java/lang/StringBuffer
L12:    dup
L13:    invokespecial Method java/lang/StringBuffer <init> ()V
L16:    ldc "ab.focusLost("
L18:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L21:    aload_1
L22:    ifnull L30
L25:    ldc "{...}"
L27:    goto L32
L30:    ldc "null"
L32:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L35:    bipush 41
L37:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L40:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L43:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L46:    athrow
L47:    return
L48:    
        .linenumbertable
            L0 386
            L4 389
            L7 387
            L8 388
            L47 390
        .end linenumbertable
    .end code
.end method

.method public static final providesignlink : (Lr;)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L8 using L11
L0:     aload_0
L1:     dup
L2:     putstatic Field ea o Lr;
L5:     putstatic Field ga g Lr;
L8:     goto L51
L11:    astore_1
L12:    aload_1
L13:    new java/lang/StringBuffer
L16:    dup
L17:    invokespecial Method java/lang/StringBuffer <init> ()V
L20:    ldc "ab.providesignlink("
L22:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L25:    aload_0
L26:    ifnull L34
L29:    ldc "{...}"
L31:    goto L36
L34:    ldc "null"
L36:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L39:    bipush 41
L41:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L44:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L47:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L50:    athrow
L51:    return
L52:    
        .linenumbertable
            L0 393
            L8 396
            L11 394
            L12 395
            L51 397
        .end linenumbertable
    .end code
.end method

.method public final run : ()V
    .code stack 7 locals 4
L0:     getstatic Field loginapplet o I
L3:     istore_3
L4:     aconst_null
L5:     getstatic Field r h Ljava/lang/String;
L8:     if_acmpne L14
L11:    goto L135
L14:    getstatic Field r h Ljava/lang/String;
L17:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L20:    astore_1
L21:    iconst_0
L22:    aload_1
L23:    ldc "sun"
L25:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L28:    iconst_m1
L29:    ixor
L30:    if_icmpne L83
L33:    aload_1
L34:    ldc "apple"
L36:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L39:    iconst_m1
L40:    if_icmpne L83
L43:    iconst_0
L44:    aload_1
L45:    ldc "ibm"
L47:    invokevirtual Method java/lang/String indexOf (Ljava/lang/String;)I
L50:    iconst_m1
L51:    ixor
L52:    if_icmpeq L135
L55:    getstatic Field r j Ljava/lang/String;
L58:    ifnull L75
L61:    getstatic Field r j Ljava/lang/String;
L64:    ldc "1.4.2"
L66:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L69:    ifne L75
L72:    goto L135
L75:    aload_0
L76:    iconst_0
L77:    ldc "wrongjava"
L79:    invokevirtual Method ab a (ZLjava/lang/String;)V
L82:    return
L83:    getstatic Field r j Ljava/lang/String;
L86:    astore_2
L87:    aload_2
L88:    ldc "1.1"
L90:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L93:    ifne L123
L96:    aload_2
L97:    ldc "1.1."
L99:    invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L102:   ifne L123
L105:   aload_2
L106:   ldc "1.2"
L108:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L111:   ifne L123
L114:   aload_2
L115:   ldc "1.2."
L117:   invokevirtual Method java/lang/String startsWith (Ljava/lang/String;)Z
L120:   ifeq L131
L123:   aload_0
L124:   iconst_0
L125:   ldc "wrongjava"
L127:   invokevirtual Method ab a (ZLjava/lang/String;)V
L130:   return
L131:   iconst_5
L132:   putstatic Field b t I
L135:   aconst_null
L136:   getstatic Field ea o Lr;
L139:   getfield Field r a Ljava/applet/Applet;
L142:   if_acmpeq L182
L145:   getstatic Field r m Ljava/lang/reflect/Method;
L148:   astore_1
L149:   aconst_null
L150:   aload_1
L151:   if_acmpne L157
L154:   goto L182
        .catch java/lang/Throwable from L157 to L178 using L181
        .catch java/lang/Exception from L4 to L82 using L308
        .catch java/lang/Exception from L83 to L130 using L308
        .catch java/lang/Exception from L131 to L305 using L308
        .catch java/lang/RuntimeException from L4 to L82 using L332
        .catch java/lang/RuntimeException from L83 to L130 using L332
        .catch java/lang/RuntimeException from L131 to L329 using L332
L157:   aload_1
L158:   getstatic Field ea o Lr;
L161:   getfield Field r a Ljava/applet/Applet;
L164:   iconst_1
L165:   anewarray java/lang/Object
L168:   dup
L169:   iconst_0
L170:   getstatic Field java/lang/Boolean TRUE Ljava/lang/Boolean;
L173:   aastore
L174:   invokevirtual Method java/lang/reflect/Method invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
L177:   pop
L178:   goto L182
L181:   astore_2
L182:   aload_0
L183:   bipush 123
L185:   invokevirtual Method ab a (I)V
L188:   bipush 110
L190:   getstatic Field loginapplet g I
L193:   getstatic Field p c I
L196:   getstatic Field ca a Ljava/awt/Canvas;
L199:   invokestatic Method m a (BIILjava/awt/Component;)Lga;
L202:   putstatic Field fa c Lga;
L205:   aload_0
L206:   bipush 117
L208:   invokevirtual Method ab e (I)V
L211:   bipush 50
L213:   invokestatic Method ua b (I)Lcb;
L216:   putstatic Field ra f Lcb;
L219:   getstatic Field bb c J
L222:   ldc2_w -1L
L225:   lxor
L226:   ldc2_w -1L
L229:   lcmp
L230:   ifeq L244
L233:   iconst_1
L234:   invokestatic Method t a (Z)J
L237:   getstatic Field bb c J
L240:   lcmp
L241:   ifge L305
L244:   getstatic Field ra f Lcb;
L247:   iconst_0
L248:   getstatic Field b t I
L251:   getstatic Field t a I
L254:   invokevirtual Method cb a (III)I
L257:   putstatic Field ra l I
L260:   iconst_0
L261:   istore_1
L262:   getstatic Field ra l I
L265:   iconst_m1
L266:   ixor
L267:   iload_1
L268:   iconst_m1
L269:   ixor
L270:   if_icmpge L285
L273:   aload_0
L274:   iconst_m1
L275:   invokespecial Method ab b (I)V
L278:   iinc 1 1
L281:   iload_3
L282:   ifeq L262
L285:   aload_0
L286:   iconst_0
L287:   invokespecial Method ab c (I)V
L290:   getstatic Field ea o Lr;
L293:   bipush -37
L295:   getstatic Field ca a Ljava/awt/Canvas;
L298:   invokestatic Method j a (Lr;BLjava/lang/Object;)V
L301:   iload_3
L302:   ifeq L219
L305:   goto L323
L308:   astore_1
L309:   aconst_null
L310:   aload_1
L311:   bipush -17
L313:   invokestatic Method f a (Ljava/lang/String;Ljava/lang/Throwable;I)V
L316:   aload_0
L317:   iconst_0
L318:   ldc "crash"
L320:   invokevirtual Method ab a (ZLjava/lang/String;)V
L323:   aload_0
L324:   bipush 56
L326:   invokespecial Method ab a (B)V
L329:   goto L340
L332:   astore_1
L333:   aload_1
L334:   ldc "ab.run()"
L336:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L339:   athrow
L340:   return
L341:   
        .linenumbertable
            L4 401
            L14 405
            L21 406
            L43 407
            L55 409
            L75 412
            L82 413
            L83 421
            L87 422
            L123 424
            L130 425
            L131 428
            L135 433
            L145 436
            L149 437
            L157 441
            L178 443
            L181 442
            L182 448
            L188 449
            L205 450
            L211 451
            L219 452
            L244 454
            L260 457
            L262 458
            L273 459
            L278 458
            L285 462
            L290 463
            L305 471
            L308 466
            L309 469
            L316 470
            L323 472
            L329 475
            L332 473
            L333 474
            L340 476
        .end linenumbertable
    .end code
.end method

.method abstract d : (I)V
.end method

.method public final windowActivated : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 479
        .end linenumbertable
    .end code
.end method

.method public final update : (Ljava/awt/Graphics;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L5 using L8
L0:     aload_0
L1:     aload_1
L2:     invokevirtual Method ab paint (Ljava/awt/Graphics;)V
L5:     goto L48
L8:     astore_2
L9:     aload_2
L10:    new java/lang/StringBuffer
L13:    dup
L14:    invokespecial Method java/lang/StringBuffer <init> ()V
L17:    ldc "ab.update("
L19:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L22:    aload_1
L23:    ifnull L31
L26:    ldc "{...}"
L28:    goto L33
L31:    ldc "null"
L33:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L36:    bipush 41
L38:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L41:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L44:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L47:    athrow
L48:    return
L49:    
        .linenumbertable
            L0 483
            L5 486
            L8 484
            L9 485
            L48 487
        .end linenumbertable
    .end code
.end method

.method public final focusGained : (Ljava/awt/event/FocusEvent;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L4 using L7
L0:     iconst_1
L1:     putstatic Field da d Z
L4:     goto L47
L7:     astore_2
L8:     aload_2
L9:     new java/lang/StringBuffer
L12:    dup
L13:    invokespecial Method java/lang/StringBuffer <init> ()V
L16:    ldc "ab.focusGained("
L18:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L21:    aload_1
L22:    ifnull L30
L25:    ldc "{...}"
L27:    goto L32
L30:    ldc "null"
L32:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L35:    bipush 41
L37:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L40:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L43:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L46:    athrow
L47:    return
L48:    
        .linenumbertable
            L0 492
            L4 495
            L7 493
            L8 494
            L47 496
        .end linenumbertable
    .end code
.end method

.method private static final a : (IZ)I
    .code stack 4 locals 3
        .catch java/lang/RuntimeException from L0 to L26 using L27
L0:     iload_1
L1:     iconst_1
L2:     if_icmpeq L16
L5:     bipush -76
L7:     ldc 7.497146e-1f
L9:     bipush -26
L11:    ldc 1.9570106e-1f
L13:    invokestatic Method ab a (IFIF)V
L16:    iload_0
L17:    i2d
L18:    ldc2_w 2.5e-1
L21:    dmul
L22:    d2i
L23:    ldc 1985327688
L25:    ishl
L26:    ireturn
L27:    astore_2
L28:    aload_2
L29:    new java/lang/StringBuffer
L32:    dup
L33:    invokespecial Method java/lang/StringBuffer <init> ()V
L36:    ldc "ab.M("
L38:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L41:    iload_0
L42:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L45:    bipush 44
L47:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L50:    iload_1
L51:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L54:    bipush 41
L56:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L59:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L62:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L65:    athrow
L66:    
        .linenumbertable
            L0 501
            L5 502
            L16 504
            L27 505
            L28 506
        .end linenumbertable
    .end code
.end method

.method public final getDocumentBase : ()Ljava/net/URL;
    .code stack 2 locals 2
        .catch java/lang/RuntimeException from L0 to L7 using L43
L0:     getstatic Field ha i Ljava/awt/Frame;
L3:     ifnull L8
L6:     aconst_null
L7:     areturn
        .catch java/lang/RuntimeException from L8 to L37 using L43
L8:     aconst_null
L9:     getstatic Field ea o Lr;
L12:    if_acmpeq L38
L15:    getstatic Field ea o Lr;
L18:    getfield Field r a Ljava/applet/Applet;
L21:    aload_0
L22:    if_acmpne L28
L25:    goto L38
L28:    getstatic Field ea o Lr;
L31:    getfield Field r a Ljava/applet/Applet;
L34:    invokevirtual Method java/applet/Applet getDocumentBase ()Ljava/net/URL;
L37:    areturn
        .catch java/lang/RuntimeException from L38 to L42 using L43
L38:    aload_0
L39:    invokespecial Method java/applet/Applet getDocumentBase ()Ljava/net/URL;
L42:    areturn
L43:    astore_1
L44:    aload_1
L45:    ldc "ab.getDocumentBase()"
L47:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L50:    athrow
L51:    
        .linenumbertable
            L0 511
            L6 512
            L8 514
            L28 516
            L38 518
            L43 519
            L44 520
        .end linenumbertable
    .end code
.end method

.method public final windowDeiconified : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 531
        .end linenumbertable
    .end code
.end method

.method public abstract init : ()V
.end method

.method public final windowIconified : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 537
        .end linenumbertable
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/applet/Applet <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field ab a Z
L9:     return
L10:    
        .linenumbertable
            L0 538
            L4 534
            L9 539
        .end linenumbertable
    .end code
.end method

.method public final stop : ()V
    .code stack 4 locals 2
        .catch java/lang/RuntimeException from L0 to L13 using L28
L0:     aload_0
L1:     getstatic Field b E Lab;
L4:     if_acmpne L13
L7:     getstatic Field qa c Z
L10:    ifeq L14
L13:    return
        .catch java/lang/RuntimeException from L14 to L25 using L28
L14:    ldc2_w 4000L
L17:    iconst_1
L18:    invokestatic Method t a (Z)J
L21:    ladd
L22:    putstatic Field bb c J
L25:    goto L36
L28:    astore_1
L29:    aload_1
L30:    ldc "ab.stop()"
L32:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L35:    athrow
L36:    return
L37:    
        .linenumbertable
            L0 542
            L13 543
            L14 545
            L25 548
            L28 546
            L29 547
            L36 549
        .end linenumbertable
    .end code
.end method

.method abstract e : (I)V
.end method

.method abstract d : (B)V
.end method

.method a : (ZLjava/lang/String;)V
    .code stack 6 locals 4
L0:     aload_0
L1:     getfield Field ab a Z
L4:     ifne L10
L7:     goto L11
L10:    return
L11:    aload_0
L12:    iconst_1
L13:    putfield Field ab a Z
L16:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L19:    new java/lang/StringBuffer
L22:    dup
L23:    invokespecial Method java/lang/StringBuffer <init> ()V
L26:    ldc "error_game_"
L28:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L31:    aload_2
L32:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L35:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L38:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
        .catch java/lang/Exception from L41 to L87 using L90
        .catch java/lang/RuntimeException from L0 to L10 using L102
        .catch java/lang/RuntimeException from L11 to L99 using L102
L41:    aload_0
L42:    invokevirtual Method ab getAppletContext ()Ljava/applet/AppletContext;
L45:    new java/net/URL
L48:    dup
L49:    aload_0
L50:    invokevirtual Method ab getCodeBase ()Ljava/net/URL;
L53:    new java/lang/StringBuffer
L56:    dup
L57:    invokespecial Method java/lang/StringBuffer <init> ()V
L60:    ldc "error_game_"
L62:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L65:    aload_2
L66:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L69:    ldc ".ws"
L71:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L74:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L77:    invokespecial Method java/net/URL <init> (Ljava/net/URL;Ljava/lang/String;)V
L80:    ldc "_self"
L82:    invokeinterface InterfaceMethod java/applet/AppletContext showDocument (Ljava/net/URL;Ljava/lang/String;)V 3
L87:    goto L91
L90:    astore_3
L91:    iload_1
L92:    ifeq L99
L95:    iconst_1
L96:    putstatic Field ab b Z
L99:    goto L151
L102:   astore_3
L103:   aload_3
L104:   new java/lang/StringBuffer
L107:   dup
L108:   invokespecial Method java/lang/StringBuffer <init> ()V
L111:   ldc "ab.F("
L113:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L116:   iload_1
L117:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L120:   bipush 44
L122:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L125:   aload_2
L126:   ifnull L134
L129:   ldc "{...}"
L131:   goto L136
L134:   ldc "null"
L136:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L139:   bipush 41
L141:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L144:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L147:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L150:   athrow
L151:   return
L152:   
        .linenumbertable
            L0 558
            L10 560
            L11 562
            L16 563
            L41 565
            L87 569
            L90 566
            L91 570
            L95 571
            L99 575
            L102 573
            L103 574
            L151 576
        .end linenumbertable
    .end code
.end method

.method public final getCodeBase : ()Ljava/net/URL;
    .code stack 2 locals 2
        .catch java/lang/RuntimeException from L0 to L11 using L44
L0:     aconst_null
L1:     getstatic Field ha i Ljava/awt/Frame;
L4:     if_acmpne L10
L7:     goto L12
L10:    aconst_null
L11:    areturn
        .catch java/lang/RuntimeException from L12 to L38 using L44
L12:    aconst_null
L13:    getstatic Field ea o Lr;
L16:    if_acmpeq L39
L19:    getstatic Field ea o Lr;
L22:    getfield Field r a Ljava/applet/Applet;
L25:    aload_0
L26:    if_acmpeq L39
L29:    getstatic Field ea o Lr;
L32:    getfield Field r a Ljava/applet/Applet;
L35:    invokevirtual Method java/applet/Applet getCodeBase ()Ljava/net/URL;
L38:    areturn
        .catch java/lang/RuntimeException from L39 to L43 using L44
L39:    aload_0
L40:    invokespecial Method java/applet/Applet getCodeBase ()Ljava/net/URL;
L43:    areturn
L44:    astore_1
L45:    aload_1
L46:    athrow
L47:    
        .linenumbertable
            L0 579
            L10 581
            L12 583
            L29 584
            L39 586
            L44 587
            L45 588
        .end linenumbertable
    .end code
.end method

.method public final destroy : ()V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L16 using L44
L0:     aload_0
L1:     getstatic Field b E Lab;
L4:     if_acmpne L16
L7:     getstatic Field qa c Z
L10:    ifne L16
L13:    goto L17
L16:    return
        .catch java/lang/RuntimeException from L17 to L41 using L44
L17:    iconst_1
L18:    invokestatic Method t a (Z)J
L21:    putstatic Field bb c J
L24:    ldc2_w 5000L
L27:    iconst_0
L28:    invokestatic Method qa a (JZ)V
L31:    aconst_null
L32:    putstatic Field ga g Lr;
L35:    aload_0
L36:    bipush 56
L38:    invokespecial Method ab a (B)V
L41:    goto L52
L44:    astore_1
L45:    aload_1
L46:    ldc "ab.destroy()"
L48:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L51:    athrow
L52:    return
L53:    
        .linenumbertable
            L0 593
            L16 595
            L17 597
            L24 598
            L31 599
            L35 600
            L41 603
            L44 601
            L45 602
            L52 604
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_0
L1:     putstatic Field ab c I
L4:     return
L5:     
        .linenumbertable
            L0 552
            L4 553
        .end linenumbertable
    .end code
.end method
.sourcefile "ab.java"
.end class
