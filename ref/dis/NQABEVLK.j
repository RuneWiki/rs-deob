.version 45 3
.class public final super NQABEVLK
.super java/lang/Object
.implements java/lang/Runnable
.field private a I
.field private b Z
.field private c I
.field private d Ljava/io/InputStream;
.field private e Ljava/io/OutputStream;
.field private f Ljava/net/Socket;
.field private g Z
.field h LKHACHIFW;
.field private i [B
.field private j I
.field private k I
.field private l Z
.field private m Z

.method public <init> : (LKHACHIFW;ILjava/net/Socket;)V
    .code stack 4 locals 5
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     bipush -53
L7:     putfield Field NQABEVLK a I
L10:    aload_0
L11:    iconst_1
L12:    putfield Field NQABEVLK b Z
L15:    aload_0
L16:    sipush 519
L19:    putfield Field NQABEVLK c I
L22:    aload_0
L23:    iconst_0
L24:    putfield Field NQABEVLK g Z
L27:    aload_0
L28:    iconst_0
L29:    putfield Field NQABEVLK l Z
L32:    aload_0
L33:    iconst_0
L34:    putfield Field NQABEVLK m Z
        .catch java/lang/RuntimeException from L37 to L113 using L114
L37:    getstatic Field KHACHIFW H I
L40:    ifeq L59
L43:    aload_0
L44:    aload_0
L45:    getfield Field NQABEVLK b Z
L48:    ifeq L55
L51:    iconst_0
L52:    goto L56
L55:    iconst_1
L56:    putfield Field NQABEVLK b Z
L59:    iload_2
L60:    ifge L43
L63:    aload_0
L64:    aload_1
L65:    putfield Field NQABEVLK h LKHACHIFW;
L68:    aload_0
L69:    aload_3
L70:    putfield Field NQABEVLK f Ljava/net/Socket;
L73:    aload_0
L74:    getfield Field NQABEVLK f Ljava/net/Socket;
L77:    sipush 30000
L80:    invokevirtual Method java/net/Socket setSoTimeout (I)V
L83:    aload_0
L84:    getfield Field NQABEVLK f Ljava/net/Socket;
L87:    iconst_1
L88:    invokevirtual Method java/net/Socket setTcpNoDelay (Z)V
L91:    aload_0
L92:    aload_0
L93:    getfield Field NQABEVLK f Ljava/net/Socket;
L96:    invokevirtual Method java/net/Socket getInputStream ()Ljava/io/InputStream;
L99:    putfield Field NQABEVLK d Ljava/io/InputStream;
L102:   aload_0
L103:   aload_0
L104:   getfield Field NQABEVLK f Ljava/net/Socket;
L107:   invokevirtual Method java/net/Socket getOutputStream ()Ljava/io/OutputStream;
L110:   putfield Field NQABEVLK e Ljava/io/OutputStream;
L113:   return
L114:   astore 4
L116:   new java/lang/StringBuffer
L119:   dup
L120:   ldc "56019, "
L122:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L125:   aload_1
L126:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L129:   ldc ", "
L131:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L134:   iload_2
L135:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L138:   ldc ", "
L140:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L143:   aload_3
L144:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L147:   ldc ", "
L149:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L152:   aload 4
L154:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L157:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L160:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L163:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L166:   new java/lang/RuntimeException
L169:   dup
L170:   invokespecial Method java/lang/RuntimeException <init> ()V
L173:   athrow
L174:   
    .end code
    .exceptions java/io/IOException
.end method

.method public a : ()V
    .code stack 2 locals 2
L0:     aload_0
L1:     iconst_1
L2:     putfield Field NQABEVLK g Z
        .catch java/io/IOException from L5 to L47 using L50
L5:     aload_0
L6:     getfield Field NQABEVLK d Ljava/io/InputStream;
L9:     ifnull L19
L12:    aload_0
L13:    getfield Field NQABEVLK d Ljava/io/InputStream;
L16:    invokevirtual Method java/io/InputStream close ()V
L19:    aload_0
L20:    getfield Field NQABEVLK e Ljava/io/OutputStream;
L23:    ifnull L33
L26:    aload_0
L27:    getfield Field NQABEVLK e Ljava/io/OutputStream;
L30:    invokevirtual Method java/io/OutputStream close ()V
L33:    aload_0
L34:    getfield Field NQABEVLK f Ljava/net/Socket;
L37:    ifnull L59
L40:    aload_0
L41:    getfield Field NQABEVLK f Ljava/net/Socket;
L44:    invokevirtual Method java/net/Socket close ()V
L47:    goto L59
L50:    pop
L51:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L54:    ldc "Error closing stream"
L56:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L59:    aload_0
L60:    iconst_0
L61:    putfield Field NQABEVLK l Z
L64:    aload_0
L65:    astore_1
L66:    aload_1
L67:    monitorenter
        .catch [0] from L68 to L72 using L77
L68:    aload_0
L69:    invokevirtual Method java/lang/Object notify ()V
L72:    aload_1
L73:    monitorexit
L74:    goto L80
L77:    aload_1
L78:    monitorexit
L79:    athrow
L80:    aload_0
L81:    aconst_null
L82:    putfield Field NQABEVLK i [B
L85:    return
L86:    
    .end code
.end method

.method public b : ()I
    .code stack 2 locals 1
L0:     aload_0
L1:     getfield Field NQABEVLK g Z
L4:     iconst_1
L5:     if_icmpne L10
L8:     iconst_0
L9:     ireturn
L10:    aload_0
L11:    getfield Field NQABEVLK d Ljava/io/InputStream;
L14:    invokevirtual Method java/io/InputStream read ()I
L17:    ireturn
L18:    
    .end code
    .exceptions java/io/IOException
.end method

.method public c : ()I
    .code stack 2 locals 1
L0:     aload_0
L1:     getfield Field NQABEVLK g Z
L4:     iconst_1
L5:     if_icmpne L10
L8:     iconst_0
L9:     ireturn
L10:    aload_0
L11:    getfield Field NQABEVLK d Ljava/io/InputStream;
L14:    invokevirtual Method java/io/InputStream available ()I
L17:    ireturn
L18:    
    .end code
    .exceptions java/io/IOException
.end method

.method public a : ([BII)V
    .code stack 4 locals 5
L0:     aload_0
L1:     getfield Field NQABEVLK g Z
L4:     iconst_1
L5:     if_icmpne L46
L8:     return
L9:     aload_0
L10:    getfield Field NQABEVLK d Ljava/io/InputStream;
L13:    aload_1
L14:    iload_2
L15:    iload_3
L16:    invokevirtual Method java/io/InputStream read ([BII)I
L19:    istore 4
L21:    iload 4
L23:    ifgt L36
L26:    new java/io/IOException
L29:    dup
L30:    ldc "EOF"
L32:    invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L35:    athrow
L36:    iload_2
L37:    iload 4
L39:    iadd
L40:    istore_2
L41:    iload_3
L42:    iload 4
L44:    isub
L45:    istore_3
L46:    iload_3
L47:    ifgt L9
L50:    return
L51:    
    .end code
    .exceptions java/io/IOException
.end method

.method public a : (II[BI)V
    .code stack 6 locals 8
L0:     aload_0
L1:     getfield Field NQABEVLK g Z
L4:     iconst_1
L5:     if_icmpne L9
L8:     return
L9:     aload_0
L10:    getfield Field NQABEVLK m Z
L13:    ifeq L31
L16:    aload_0
L17:    iconst_0
L18:    putfield Field NQABEVLK m Z
L21:    new java/io/IOException
L24:    dup
L25:    ldc "Error in writer thread"
L27:    invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L30:    athrow
L31:    aload_0
L32:    getfield Field NQABEVLK i [B
L35:    ifnonnull L47
L38:    aload_0
L39:    sipush 5000
L42:    newarray byte
L44:    putfield Field NQABEVLK i [B
L47:    aload_0
L48:    astore 5
L50:    aload 5
L52:    monitorenter
        .catch [0] from L53 to L156 using L162
        .catch java/lang/RuntimeException from L0 to L177 using L178
L53:    iconst_0
L54:    istore 7
L56:    getstatic Field KHACHIFW H I
L59:    ifeq L124
L62:    aload_0
L63:    getfield Field NQABEVLK i [B
L66:    aload_0
L67:    getfield Field NQABEVLK k I
L70:    aload_3
L71:    iload 7
L73:    iload 4
L75:    iadd
L76:    baload
L77:    bastore
L78:    aload_0
L79:    aload_0
L80:    getfield Field NQABEVLK k I
L83:    iconst_1
L84:    iadd
L85:    sipush 5000
L88:    irem
L89:    putfield Field NQABEVLK k I
L92:    aload_0
L93:    getfield Field NQABEVLK k I
L96:    aload_0
L97:    getfield Field NQABEVLK j I
L100:   sipush 4900
L103:   iadd
L104:   sipush 5000
L107:   irem
L108:   if_icmpne L121
L111:   new java/io/IOException
L114:   dup
L115:   ldc "buffer overflow"
L117:   invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L120:   athrow
L121:   iinc 7 1
L124:   iload 7
L126:   iload_1
L127:   if_icmplt L62
L130:   aload_0
L131:   getfield Field NQABEVLK l Z
L134:   iconst_0
L135:   if_icmpne L152
L138:   aload_0
L139:   iconst_1
L140:   putfield Field NQABEVLK l Z
L143:   aload_0
L144:   getfield Field NQABEVLK h LKHACHIFW;
L147:   aload_0
L148:   iconst_3
L149:   invokevirtual Method KHACHIFW a (Ljava/lang/Runnable;I)V
L152:   aload_0
L153:   invokevirtual Method java/lang/Object notify ()V
L156:   aload 5
L158:   monitorexit
L159:   goto L166
L162:   aload 5
L164:   monitorexit
L165:   athrow
L166:   iload_2
L167:   ifeq L248
L170:   aload_0
L171:   sipush 255
L174:   putfield Field NQABEVLK c I
L177:   return
L178:   astore 5
L180:   new java/lang/StringBuffer
L183:   dup
L184:   ldc "71200, "
L186:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L189:   iload_1
L190:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L193:   ldc ", "
L195:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L198:   iload_2
L199:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L202:   ldc ", "
L204:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L207:   aload_3
L208:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L211:   ldc ", "
L213:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L216:   iload 4
L218:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L221:   ldc ", "
L223:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L226:   aload 5
L228:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L231:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L234:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L237:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L240:   new java/lang/RuntimeException
L243:   dup
L244:   invokespecial Method java/lang/RuntimeException <init> ()V
L247:   athrow
L248:   return
L249:   
    .end code
    .exceptions java/io/IOException
.end method

.method public run : ()V
    .code stack 5 locals 6
L0:     getstatic Field KHACHIFW H I
L3:     istore 5
L5:     iload 5
L7:     ifeq L172
L10:    aload_0
L11:    astore_3
L12:    aload_3
L13:    monitorenter
L14:    aload_0
L15:    getfield Field NQABEVLK k I
L18:    aload_0
L19:    getfield Field NQABEVLK j I
L22:    if_icmpne L36
        .catch java/lang/InterruptedException from L25 to L29 using L32
        .catch [0] from L14 to L88 using L93
L25:    aload_0
L26:    invokevirtual Method java/lang/Object wait ()V
L29:    goto L36
L32:    pop
L33:    goto L36
L36:    aload_0
L37:    getfield Field NQABEVLK l Z
L40:    iconst_0
L41:    if_icmpne L48
L44:    jsr L96
L47:    return
L48:    aload_0
L49:    getfield Field NQABEVLK j I
L52:    istore_2
L53:    aload_0
L54:    getfield Field NQABEVLK k I
L57:    aload_0
L58:    getfield Field NQABEVLK j I
L61:    if_icmplt L79
L64:    aload_0
L65:    getfield Field NQABEVLK k I
L68:    aload_0
L69:    getfield Field NQABEVLK j I
L72:    isub
L73:    istore_1
L74:    iload 5
L76:    ifeq L88
L79:    sipush 5000
L82:    aload_0
L83:    getfield Field NQABEVLK j I
L86:    isub
L87:    istore_1
L88:    aload_3
L89:    monitorexit
L90:    goto L102
L93:    aload_3
L94:    monitorexit
L95:    athrow
L96:    astore 4
L98:    aload_3
L99:    monitorexit
L100:   ret 4
L102:   iload_1
L103:   ifle L172
        .catch java/io/IOException from L106 to L119 using L122
L106:   aload_0
L107:   getfield Field NQABEVLK e Ljava/io/OutputStream;
L110:   aload_0
L111:   getfield Field NQABEVLK i [B
L114:   iload_2
L115:   iload_1
L116:   invokevirtual Method java/io/OutputStream write ([BII)V
L119:   goto L128
L122:   pop
L123:   aload_0
L124:   iconst_1
L125:   putfield Field NQABEVLK m Z
L128:   aload_0
L129:   aload_0
L130:   getfield Field NQABEVLK j I
L133:   iload_1
L134:   iadd
L135:   sipush 5000
L138:   irem
L139:   putfield Field NQABEVLK j I
        .catch java/io/IOException from L142 to L160 using L163
L142:   aload_0
L143:   getfield Field NQABEVLK k I
L146:   aload_0
L147:   getfield Field NQABEVLK j I
L150:   if_icmpne L172
L153:   aload_0
L154:   getfield Field NQABEVLK e Ljava/io/OutputStream;
L157:   invokevirtual Method java/io/OutputStream flush ()V
L160:   goto L172
L163:   pop
L164:   aload_0
L165:   iconst_1
L166:   putfield Field NQABEVLK m Z
L169:   goto L172
L172:   aload_0
L173:   getfield Field NQABEVLK l Z
L176:   iconst_1
L177:   if_icmpeq L10
L180:   return
L181:   
    .end code
.end method

.method public a : (B)V
    .code stack 4 locals 3
L0:     iload_1
L1:     iconst_1
L2:     if_icmpeq L12
L5:     aload_0
L6:     sipush 457
L9:     putfield Field NQABEVLK a I
L12:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L15:    new java/lang/StringBuffer
L18:    dup
L19:    ldc "dummy:"
L21:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L24:    aload_0
L25:    getfield Field NQABEVLK g Z
L28:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L31:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L34:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L37:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L40:    new java/lang/StringBuffer
L43:    dup
L44:    ldc "tcycl:"
L46:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L49:    aload_0
L50:    getfield Field NQABEVLK j I
L53:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L56:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L59:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L62:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L65:    new java/lang/StringBuffer
L68:    dup
L69:    ldc "tnum:"
L71:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L74:    aload_0
L75:    getfield Field NQABEVLK k I
L78:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L81:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L84:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L87:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L90:    new java/lang/StringBuffer
L93:    dup
L94:    ldc "writer:"
L96:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L99:    aload_0
L100:   getfield Field NQABEVLK l Z
L103:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L106:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L109:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L112:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L115:   new java/lang/StringBuffer
L118:   dup
L119:   ldc "ioerror:"
L121:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L124:   aload_0
L125:   getfield Field NQABEVLK m Z
L128:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L131:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L134:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
        .catch java/io/IOException from L137 to L162 using L163
        .catch java/lang/RuntimeException from L0 to L165 using L165
L137:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L140:   new java/lang/StringBuffer
L143:   dup
L144:   ldc "available:"
L146:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L149:   aload_0
L150:   invokevirtual Method NQABEVLK c ()I
L153:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L156:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L159:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L162:   return
L163:   pop
L164:   return
L165:   astore_2
L166:   new java/lang/StringBuffer
L169:   dup
L170:   ldc "41293, "
L172:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L175:   iload_1
L176:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L179:   ldc ", "
L181:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L184:   aload_2
L185:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L188:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L191:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L194:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L197:   new java/lang/RuntimeException
L200:   dup
L201:   invokespecial Method java/lang/RuntimeException <init> ()V
L204:   athrow
L205:   
    .end code
.end method
.end class
