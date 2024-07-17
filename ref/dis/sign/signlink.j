.version 45 3
.class public final super sign/signlink
.super java/lang/Object
.implements java/lang/Runnable
.field static final clientversion I = 225
.field public static uid I
.field public static mainapp Ljava/applet/Applet;
.field public static sunjava Z
.field private static active Z
.field private static threadliveid I
.field private static socketip Ljava/net/InetAddress;
.field private static socketreq I
.field private static socket Ljava/net/Socket;
.field private static threadreqpri I
.field private static threadreq Ljava/lang/Runnable;
.field private static dnsreq Ljava/lang/String;
.field public static dns Ljava/lang/String;
.field private static loadreq Ljava/lang/String;
.field private static loadbuf [B
.field private static savelen I
.field private static savereq Ljava/lang/String;
.field private static savebuf [B
.field private static urlreq Ljava/lang/String;
.field private static urlstream Ljava/io/DataInputStream;
.field private static looprate I
.field private static midiplay Z
.field private static midipos I
.field public static midi Ljava/lang/String;
.field public static midivol I
.field public static midifade I
.field private static waveplay Z
.field private static wavepos I
.field public static wave Ljava/lang/String;
.field public static wavevol I
.field public static reporterror Z
.field public static errorname Ljava/lang/String;

.method public static final startpriv : (Ljava/net/InetAddress;)V
    .code stack 4 locals 2
L0:     invokestatic Method java/lang/Math random ()D
L3:     ldc2_w 9.9999999e7
L6:     dmul
L7:     d2i
L8:     putstatic Field sign/signlink threadliveid I
L11:    getstatic Field sign/signlink active Z
L14:    ifeq L31
        .catch java/lang/Exception from L17 to L23 using L26
L17:    ldc2_w 500L
L20:    invokestatic Method java/lang/Thread sleep (J)V
L23:    goto L27
L26:    pop
L27:    iconst_0
L28:    putstatic Field sign/signlink active Z
L31:    iconst_0
L32:    putstatic Field sign/signlink socketreq I
L35:    aconst_null
L36:    putstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L39:    aconst_null
L40:    putstatic Field sign/signlink dnsreq Ljava/lang/String;
L43:    aconst_null
L44:    putstatic Field sign/signlink loadreq Ljava/lang/String;
L47:    aconst_null
L48:    putstatic Field sign/signlink savereq Ljava/lang/String;
L51:    aconst_null
L52:    putstatic Field sign/signlink urlreq Ljava/lang/String;
L55:    aload_0
L56:    putstatic Field sign/signlink socketip Ljava/net/InetAddress;
L59:    new java/lang/Thread
L62:    dup
L63:    new sign/signlink
L66:    dup
L67:    invokespecial Method sign/signlink <init> ()V
L70:    invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L73:    astore_1
L74:    aload_1
L75:    iconst_1
L76:    invokevirtual Method java/lang/Thread setDaemon (Z)V
L79:    aload_1
L80:    invokevirtual Method java/lang/Thread start ()V
L83:    goto L99
        .catch java/lang/Exception from L86 to L92 using L95
L86:    ldc2_w 50L
L89:    invokestatic Method java/lang/Thread sleep (J)V
L92:    goto L99
L95:    pop
L96:    goto L99
L99:    getstatic Field sign/signlink active Z
L102:   ifeq L86
L105:   return
L106:   
        .linenumbertable
            L0 58
            L11 60
            L17 61
            L27 62
            L31 65
            L43 66
            L55 67
            L59 69
            L74 70
            L83 71
            L105 56
        .end linenumbertable
    .end code
.end method

.method public final run : ()V
    .code stack 7 locals 6
L0:     iconst_1
L1:     putstatic Field sign/signlink active Z
L4:     invokestatic Method sign/signlink findcachedir ()Ljava/lang/String;
L7:     astore_1
L8:     aload_1
L9:     invokestatic Method sign/signlink getuid (Ljava/lang/String;)I
L12:    putstatic Field sign/signlink uid I
L15:    getstatic Field sign/signlink threadliveid I
L18:    istore_2
L19:    goto L451
L22:    getstatic Field sign/signlink socketreq I
L25:    ifeq L59
        .catch java/lang/Exception from L28 to L44 using L47
L28:    new java/net/Socket
L31:    dup
L32:    getstatic Field sign/signlink socketip Ljava/net/InetAddress;
L35:    getstatic Field sign/signlink socketreq I
L38:    invokespecial Method java/net/Socket <init> (Ljava/net/InetAddress;I)V
L41:    putstatic Field sign/signlink socket Ljava/net/Socket;
L44:    goto L52
L47:    pop
L48:    aconst_null
L49:    putstatic Field sign/signlink socket Ljava/net/Socket;
L52:    iconst_0
L53:    putstatic Field sign/signlink socketreq I
L56:    goto L437
L59:    getstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L62:    ifnull L99
L65:    new java/lang/Thread
L68:    dup
L69:    getstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L72:    invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L75:    astore_3
L76:    aload_3
L77:    iconst_1
L78:    invokevirtual Method java/lang/Thread setDaemon (Z)V
L81:    aload_3
L82:    invokevirtual Method java/lang/Thread start ()V
L85:    aload_3
L86:    getstatic Field sign/signlink threadreqpri I
L89:    invokevirtual Method java/lang/Thread setPriority (I)V
L92:    aconst_null
L93:    putstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L96:    goto L437
L99:    getstatic Field sign/signlink dnsreq Ljava/lang/String;
L102:   ifnull L133
        .catch java/lang/Exception from L105 to L117 using L120
L105:   getstatic Field sign/signlink dnsreq Ljava/lang/String;
L108:   invokestatic Method java/net/InetAddress getByName (Ljava/lang/String;)Ljava/net/InetAddress;
L111:   invokevirtual Method java/net/InetAddress getHostName ()Ljava/lang/String;
L114:   putstatic Field sign/signlink dns Ljava/lang/String;
L117:   goto L126
L120:   pop
L121:   ldc "unknown"
L123:   putstatic Field sign/signlink dns Ljava/lang/String;
L126:   aconst_null
L127:   putstatic Field sign/signlink dnsreq Ljava/lang/String;
L130:   goto L437
L133:   getstatic Field sign/signlink loadreq Ljava/lang/String;
L136:   ifnull L255
L139:   aconst_null
L140:   putstatic Field sign/signlink loadbuf [B
        .catch java/lang/Exception from L143 to L244 using L247
L143:   new java/io/File
L146:   dup
L147:   new java/lang/StringBuffer
L150:   dup
L151:   aload_1
L152:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L155:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L158:   getstatic Field sign/signlink loadreq Ljava/lang/String;
L161:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L164:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L167:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L170:   astore_3
L171:   aload_3
L172:   invokevirtual Method java/io/File exists ()Z
L175:   ifeq L248
L178:   aload_3
L179:   invokevirtual Method java/io/File length ()J
L182:   l2i
L183:   istore 4
L185:   iload 4
L187:   newarray byte
L189:   putstatic Field sign/signlink loadbuf [B
L192:   new java/io/DataInputStream
L195:   dup
L196:   new java/io/FileInputStream
L199:   dup
L200:   new java/lang/StringBuffer
L203:   dup
L204:   aload_1
L205:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L208:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L211:   getstatic Field sign/signlink loadreq Ljava/lang/String;
L214:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L217:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L220:   invokespecial Method java/io/FileInputStream <init> (Ljava/lang/String;)V
L223:   invokespecial Method java/io/DataInputStream <init> (Ljava/io/InputStream;)V
L226:   astore 5
L228:   aload 5
L230:   getstatic Field sign/signlink loadbuf [B
L233:   iconst_0
L234:   iload 4
L236:   invokevirtual Method java/io/DataInputStream readFully ([BII)V
L239:   aload 5
L241:   invokevirtual Method java/io/FilterInputStream close ()V
L244:   goto L248
L247:   pop
L248:   aconst_null
L249:   putstatic Field sign/signlink loadreq Ljava/lang/String;
L252:   goto L437
L255:   getstatic Field sign/signlink savereq Ljava/lang/String;
L258:   ifnull L390
L261:   getstatic Field sign/signlink savebuf [B
L264:   ifnull L317
        .catch java/lang/Exception from L267 to L310 using L313
L267:   new java/io/FileOutputStream
L270:   dup
L271:   new java/lang/StringBuffer
L274:   dup
L275:   aload_1
L276:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L279:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L282:   getstatic Field sign/signlink savereq Ljava/lang/String;
L285:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L288:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L291:   invokespecial Method java/io/FileOutputStream <init> (Ljava/lang/String;)V
L294:   astore_3
L295:   aload_3
L296:   getstatic Field sign/signlink savebuf [B
L299:   iconst_0
L300:   getstatic Field sign/signlink savelen I
L303:   invokevirtual Method java/io/FileOutputStream write ([BII)V
L306:   aload_3
L307:   invokevirtual Method java/io/FileOutputStream close ()V
L310:   goto L317
L313:   pop
L314:   goto L317
L317:   getstatic Field sign/signlink waveplay Z
L320:   ifeq L350
L323:   new java/lang/StringBuffer
L326:   dup
L327:   aload_1
L328:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L331:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L334:   getstatic Field sign/signlink savereq Ljava/lang/String;
L337:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L340:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L343:   putstatic Field sign/signlink wave Ljava/lang/String;
L346:   iconst_0
L347:   putstatic Field sign/signlink waveplay Z
L350:   getstatic Field sign/signlink midiplay Z
L353:   ifeq L383
L356:   new java/lang/StringBuffer
L359:   dup
L360:   aload_1
L361:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L364:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L367:   getstatic Field sign/signlink savereq Ljava/lang/String;
L370:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L373:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L376:   putstatic Field sign/signlink midi Ljava/lang/String;
L379:   iconst_0
L380:   putstatic Field sign/signlink midiplay Z
L383:   aconst_null
L384:   putstatic Field sign/signlink savereq Ljava/lang/String;
L387:   goto L437
L390:   getstatic Field sign/signlink urlreq Ljava/lang/String;
L393:   ifnull L437
        .catch java/lang/Exception from L396 to L425 using L428
L396:   new java/io/DataInputStream
L399:   dup
L400:   new java/net/URL
L403:   dup
L404:   getstatic Field sign/signlink mainapp Ljava/applet/Applet;
L407:   invokevirtual Method java/applet/Applet getCodeBase ()Ljava/net/URL;
L410:   getstatic Field sign/signlink urlreq Ljava/lang/String;
L413:   invokespecial Method java/net/URL <init> (Ljava/net/URL;Ljava/lang/String;)V
L416:   invokevirtual Method java/net/URL openStream ()Ljava/io/InputStream;
L419:   invokespecial Method java/io/DataInputStream <init> (Ljava/io/InputStream;)V
L422:   putstatic Field sign/signlink urlstream Ljava/io/DataInputStream;
L425:   goto L433
L428:   pop
L429:   aconst_null
L430:   putstatic Field sign/signlink urlstream Ljava/io/DataInputStream;
L433:   aconst_null
L434:   putstatic Field sign/signlink urlreq Ljava/lang/String;
        .catch java/lang/Exception from L437 to L444 using L447
L437:   getstatic Field sign/signlink looprate I
L440:   i2l
L441:   invokestatic Method java/lang/Thread sleep (J)V
L444:   goto L451
L447:   pop
L448:   goto L451
L451:   getstatic Field sign/signlink threadliveid I
L454:   iload_2
L455:   if_icmpeq L22
L458:   return
L459:   
        .linenumbertable
            L0 75
            L4 77
            L8 79
            L15 81
            L19 82
            L22 84
            L28 85
            L47 86
            L52 87
            L56 84
            L59 90
            L65 91
            L85 92
            L92 93
            L96 90
            L99 96
            L105 97
            L120 98
            L126 99
            L130 96
            L133 102
            L139 103
            L143 104
            L143 105
            L171 106
            L178 107
            L192 108
            L228 109
            L244 104
            L247 112
            L248 113
            L252 102
            L255 116
            L261 117
            L267 118
            L267 119
            L295 120
            L310 118
            L313 122
            L314 118
            L317 124
            L350 125
            L383 126
            L387 116
            L390 129
            L396 130
            L428 131
            L433 132
            L437 135
            L451 82
            L458 74
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
            L0 140
            L72 141
            L75 142
            L80 143
            L80 145
            L84 146
            L112 148
            L139 149
            L158 151
            L182 153
            L183 143
            L186 142
            L195 155
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
            L0 160
            L0 161
            L27 162
            L45 163
            L79 164
            L95 160
            L98 167
            L99 169
            L99 170
            L133 171
            L142 172
            L146 174
            L147 175
        .end linenumbertable
    .end code
.end method

.method public static final gethash : (Ljava/lang/String;)J
    .code stack 4 locals 5
L0:     aload_0
L1:     invokevirtual Method java/lang/String trim ()Ljava/lang/String;
L4:     astore_0
L5:     lconst_0
L6:     lstore_1
L7:     iconst_0
L8:     istore_3
L9:     goto L110
L12:    aload_0
L13:    iload_3
L14:    invokevirtual Method java/lang/String charAt (I)C
L17:    istore 4
L19:    lload_1
L20:    ldc2_w 37L
L23:    lmul
L24:    lstore_1
L25:    iload 4
L27:    bipush 65
L29:    if_icmplt L53
L32:    iload 4
L34:    bipush 90
L36:    if_icmpgt L53
L39:    lload_1
L40:    iconst_1
L41:    iload 4
L43:    iadd
L44:    bipush 65
L46:    isub
L47:    i2l
L48:    ladd
L49:    lstore_1
L50:    goto L107
L53:    iload 4
L55:    bipush 97
L57:    if_icmplt L81
L60:    iload 4
L62:    bipush 122
L64:    if_icmpgt L81
L67:    lload_1
L68:    iconst_1
L69:    iload 4
L71:    iadd
L72:    bipush 97
L74:    isub
L75:    i2l
L76:    ladd
L77:    lstore_1
L78:    goto L107
L81:    iload 4
L83:    bipush 48
L85:    if_icmplt L107
L88:    iload 4
L90:    bipush 57
L92:    if_icmpgt L107
L95:    lload_1
L96:    bipush 27
L98:    iload 4
L100:   iadd
L101:   bipush 48
L103:   isub
L104:   i2l
L105:   ladd
L106:   lstore_1
L107:   iinc 3 1
L110:   iload_3
L111:   aload_0
L112:   invokevirtual Method java/lang/String length ()I
L115:   if_icmpge L124
L118:   iload_3
L119:   bipush 12
L121:   if_icmplt L12
L124:   lload_1
L125:   lreturn
L126:   
        .linenumbertable
            L0 179
            L7 180
            L12 181
            L19 182
            L25 183
            L53 184
            L81 185
            L107 180
            L124 187
        .end linenumbertable
    .end code
.end method

.method public static final looprate : (I)V
    .code stack 1 locals 1
L0:     iload_0
L1:     putstatic Field sign/signlink looprate I
L4:     return
L5:     
        .linenumbertable
            L0 195
            L4 194
        .end linenumbertable
    .end code
.end method

.method public static final synchronized cacheload : (Ljava/lang/String;)[B
    .code stack 2 locals 1
L0:     getstatic Field sign/signlink active Z
L3:     ifne L8
L6:     aconst_null
L7:     areturn
L8:     aload_0
L9:     invokestatic Method sign/signlink gethash (Ljava/lang/String;)J
L12:    invokestatic Method java/lang/String valueOf (J)Ljava/lang/String;
L15:    putstatic Field sign/signlink loadreq Ljava/lang/String;
L18:    goto L32
        .catch java/lang/Exception from L21 to L25 using L28
L21:    lconst_1
L22:    invokestatic Method java/lang/Thread sleep (J)V
L25:    goto L32
L28:    pop
L29:    goto L32
L32:    getstatic Field sign/signlink loadreq Ljava/lang/String;
L35:    ifnonnull L21
L38:    getstatic Field sign/signlink loadbuf [B
L41:    areturn
L42:    
        .linenumbertable
            L0 199
            L8 200
            L18 201
            L38 202
        .end linenumbertable
    .end code
.end method

.method public static final synchronized cachesave : (Ljava/lang/String;[B)V
    .code stack 2 locals 2
L0:     getstatic Field sign/signlink active Z
L3:     ifne L7
L6:     return
L7:     aload_1
L8:     arraylength
L9:     ldc 2000000
L11:    if_icmple L26
L14:    return
        .catch java/lang/Exception from L15 to L19 using L22
L15:    lconst_1
L16:    invokestatic Method java/lang/Thread sleep (J)V
L19:    goto L26
L22:    pop
L23:    goto L26
L26:    getstatic Field sign/signlink savereq Ljava/lang/String;
L29:    ifnonnull L15
L32:    aload_1
L33:    arraylength
L34:    putstatic Field sign/signlink savelen I
L37:    aload_1
L38:    putstatic Field sign/signlink savebuf [B
L41:    aload_0
L42:    invokestatic Method sign/signlink gethash (Ljava/lang/String;)J
L45:    invokestatic Method java/lang/String valueOf (J)Ljava/lang/String;
L48:    putstatic Field sign/signlink savereq Ljava/lang/String;
L51:    goto L65
        .catch java/lang/Exception from L54 to L58 using L61
L54:    lconst_1
L55:    invokestatic Method java/lang/Thread sleep (J)V
L58:    goto L65
L61:    pop
L62:    goto L65
L65:    getstatic Field sign/signlink savereq Ljava/lang/String;
L68:    ifnonnull L54
L71:    return
L72:    
        .linenumbertable
            L0 206
            L7 207
            L15 208
            L32 209
            L51 210
            L71 205
        .end linenumbertable
    .end code
.end method

.method public static final synchronized opensocket : (I)Ljava/net/Socket;
    .code stack 3 locals 1
L0:     iload_0
L1:     putstatic Field sign/signlink socketreq I
L4:     goto L20
        .catch java/lang/Exception from L7 to L13 using L16
L7:     ldc2_w 50L
L10:    invokestatic Method java/lang/Thread sleep (J)V
L13:    goto L20
L16:    pop
L17:    goto L20
L20:    getstatic Field sign/signlink socketreq I
L23:    ifne L7
L26:    getstatic Field sign/signlink socket Ljava/net/Socket;
L29:    ifnonnull L42
L32:    new java/io/IOException
L35:    dup
L36:    ldc "could not open socket"
L38:    invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L41:    athrow
L42:    getstatic Field sign/signlink socket Ljava/net/Socket;
L45:    areturn
L46:    
        .linenumbertable
            L0 214
            L4 215
            L26 216
            L42 217
        .end linenumbertable
    .end code
    .exceptions java/io/IOException
.end method

.method public static final synchronized openurl : (Ljava/lang/String;)Ljava/io/DataInputStream;
    .code stack 5 locals 1
L0:     aload_0
L1:     putstatic Field sign/signlink urlreq Ljava/lang/String;
L4:     goto L20
        .catch java/lang/Exception from L7 to L13 using L16
L7:     ldc2_w 50L
L10:    invokestatic Method java/lang/Thread sleep (J)V
L13:    goto L20
L16:    pop
L17:    goto L20
L20:    getstatic Field sign/signlink urlreq Ljava/lang/String;
L23:    ifnonnull L7
L26:    getstatic Field sign/signlink urlstream Ljava/io/DataInputStream;
L29:    ifnonnull L56
L32:    new java/io/IOException
L35:    dup
L36:    new java/lang/StringBuffer
L39:    dup
L40:    ldc "could not open: "
L42:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L45:    aload_0
L46:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L49:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L52:    invokespecial Method java/io/IOException <init> (Ljava/lang/String;)V
L55:    athrow
L56:    getstatic Field sign/signlink urlstream Ljava/io/DataInputStream;
L59:    areturn
L60:    
        .linenumbertable
            L0 221
            L4 222
            L26 223
            L56 224
        .end linenumbertable
    .end code
    .exceptions java/io/IOException
.end method

.method public static final synchronized dnslookup : (Ljava/lang/String;)V
    .code stack 1 locals 1
L0:     aload_0
L1:     putstatic Field sign/signlink dns Ljava/lang/String;
L4:     aload_0
L5:     putstatic Field sign/signlink dnsreq Ljava/lang/String;
L8:     return
L9:     
        .linenumbertable
            L0 228
            L4 229
            L8 227
        .end linenumbertable
    .end code
.end method

.method public static final synchronized startthread : (Ljava/lang/Runnable;I)V
    .code stack 1 locals 2
L0:     iload_1
L1:     putstatic Field sign/signlink threadreqpri I
L4:     aload_0
L5:     putstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L8:     return
L9:     
        .linenumbertable
            L0 233
            L8 232
        .end linenumbertable
    .end code
.end method

.method public static final synchronized wavesave : ([BI)Z
    .code stack 3 locals 2
L0:     iload_1
L1:     ldc 2000000
L3:     if_icmple L8
L6:     iconst_0
L7:     ireturn
L8:     getstatic Field sign/signlink savereq Ljava/lang/String;
L11:    ifnull L16
L14:    iconst_0
L15:    ireturn
L16:    getstatic Field sign/signlink wavepos I
L19:    iconst_1
L20:    iadd
L21:    iconst_5
L22:    irem
L23:    putstatic Field sign/signlink wavepos I
L26:    iload_1
L27:    putstatic Field sign/signlink savelen I
L30:    aload_0
L31:    putstatic Field sign/signlink savebuf [B
L34:    iconst_1
L35:    putstatic Field sign/signlink waveplay Z
L38:    new java/lang/StringBuffer
L41:    dup
L42:    ldc "sound"
L44:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L47:    getstatic Field sign/signlink wavepos I
L50:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L53:    ldc ".wav"
L55:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L58:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L61:    putstatic Field sign/signlink savereq Ljava/lang/String;
L64:    iconst_1
L65:    ireturn
L66:    
        .linenumbertable
            L0 237
            L8 238
            L16 239
            L26 240
            L64 241
        .end linenumbertable
    .end code
.end method

.method public static final synchronized wavereplay : ()Z
    .code stack 3 locals 0
L0:     getstatic Field sign/signlink savereq Ljava/lang/String;
L3:     ifnull L8
L6:     iconst_0
L7:     ireturn
L8:     aconst_null
L9:     putstatic Field sign/signlink savebuf [B
L12:    iconst_1
L13:    putstatic Field sign/signlink waveplay Z
L16:    new java/lang/StringBuffer
L19:    dup
L20:    ldc "sound"
L22:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L25:    getstatic Field sign/signlink wavepos I
L28:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L31:    ldc ".wav"
L33:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L36:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L39:    putstatic Field sign/signlink savereq Ljava/lang/String;
L42:    iconst_1
L43:    ireturn
L44:    
        .linenumbertable
            L0 245
            L8 246
            L42 247
        .end linenumbertable
    .end code
.end method

.method public static final synchronized midisave : ([BI)V
    .code stack 3 locals 2
L0:     iload_1
L1:     ldc 2000000
L3:     if_icmple L7
L6:     return
L7:     getstatic Field sign/signlink savereq Ljava/lang/String;
L10:    ifnull L14
L13:    return
L14:    getstatic Field sign/signlink midipos I
L17:    iconst_1
L18:    iadd
L19:    iconst_5
L20:    irem
L21:    putstatic Field sign/signlink midipos I
L24:    iload_1
L25:    putstatic Field sign/signlink savelen I
L28:    aload_0
L29:    putstatic Field sign/signlink savebuf [B
L32:    iconst_1
L33:    putstatic Field sign/signlink midiplay Z
L36:    new java/lang/StringBuffer
L39:    dup
L40:    ldc "jingle"
L42:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L45:    getstatic Field sign/signlink midipos I
L48:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L51:    ldc ".mid"
L53:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L56:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L59:    putstatic Field sign/signlink savereq Ljava/lang/String;
L62:    return
L63:    
        .linenumbertable
            L0 251
            L7 252
            L14 253
            L24 254
            L62 250
        .end linenumbertable
    .end code
.end method

.method public static final reporterror : (Ljava/lang/String;)V
    .code stack 4 locals 2
L0:     getstatic Field sign/signlink reporterror Z
L3:     ifne L7
L6:     return
L7:     getstatic Field sign/signlink active Z
L10:    ifne L14
L13:    return
L14:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L17:    new java/lang/StringBuffer
L20:    dup
L21:    ldc "Error: "
L23:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L26:    aload_0
L27:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L30:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L33:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
        .catch java/io/IOException from L36 to L114 using L115
L36:    aload_0
L37:    bipush 64
L39:    bipush 95
L41:    invokevirtual Method java/lang/String replace (CC)Ljava/lang/String;
L44:    astore_0
L45:    aload_0
L46:    bipush 38
L48:    bipush 95
L50:    invokevirtual Method java/lang/String replace (CC)Ljava/lang/String;
L53:    astore_0
L54:    aload_0
L55:    bipush 35
L57:    bipush 95
L59:    invokevirtual Method java/lang/String replace (CC)Ljava/lang/String;
L62:    astore_0
L63:    new java/lang/StringBuffer
L66:    dup
L67:    ldc "reporterror"
L69:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L72:    sipush 225
L75:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L78:    ldc ".cgi?error="
L80:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L83:    getstatic Field sign/signlink errorname Ljava/lang/String;
L86:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L89:    ldc " "
L91:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L94:    aload_0
L95:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L98:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L101:   invokestatic Method sign/signlink openurl (Ljava/lang/String;)Ljava/io/DataInputStream;
L104:   astore_1
L105:   aload_1
L106:   invokevirtual Method java/io/DataInputStream readLine ()Ljava/lang/String;
L109:   pop
L110:   aload_1
L111:   invokevirtual Method java/io/FilterInputStream close ()V
L114:   return
L115:   pop
L116:   return
L117:   
        .linenumbertable
            L0 265
            L7 266
            L14 267
            L36 268
            L36 269
            L45 270
            L54 271
            L63 272
            L105 273
            L110 274
            L114 268
            L115 276
            L116 264
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
            L0 6
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     aconst_null
L1:     putstatic Field sign/signlink socket Ljava/net/Socket;
L4:     iconst_1
L5:     putstatic Field sign/signlink threadreqpri I
L8:     aconst_null
L9:     putstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L12:    aconst_null
L13:    putstatic Field sign/signlink dnsreq Ljava/lang/String;
L16:    aconst_null
L17:    putstatic Field sign/signlink dns Ljava/lang/String;
L20:    aconst_null
L21:    putstatic Field sign/signlink loadreq Ljava/lang/String;
L24:    aconst_null
L25:    putstatic Field sign/signlink loadbuf [B
L28:    aconst_null
L29:    putstatic Field sign/signlink savereq Ljava/lang/String;
L32:    aconst_null
L33:    putstatic Field sign/signlink savebuf [B
L36:    aconst_null
L37:    putstatic Field sign/signlink urlreq Ljava/lang/String;
L40:    aconst_null
L41:    putstatic Field sign/signlink urlstream Ljava/io/DataInputStream;
L44:    bipush 50
L46:    putstatic Field sign/signlink looprate I
L49:    aconst_null
L50:    putstatic Field sign/signlink midi Ljava/lang/String;
L53:    aconst_null
L54:    putstatic Field sign/signlink wave Ljava/lang/String;
L57:    iconst_1
L58:    putstatic Field sign/signlink reporterror Z
L61:    ldc ""
L63:    putstatic Field sign/signlink errorname Ljava/lang/String;
L66:    return
L67:    
        .linenumbertable
            L0 20
            L4 22
            L8 23
            L12 25
            L16 26
            L20 28
            L24 29
            L28 32
            L32 33
            L36 35
            L40 36
            L44 38
            L49 43
            L53 49
            L57 261
            L61 262
            L66 6
        .end linenumbertable
    .end code
.end method
.sourcefile "signlink.java"
.end class
