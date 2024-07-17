.version 45 3
.class public final super sign/signlink
.super java/lang/Object
.implements java/lang/Runnable
.field private static final clientversion I = 317
.field public static uid I
.field public static storeid I
.field public static cache_dat Ljava/io/RandomAccessFile;
.field public static cache_idx [Ljava/io/RandomAccessFile;
.field public static sunjava Z
.field public static mainapp Ljava/applet/Applet;
.field private static active Z
.field private static threadliveid I
.field private static socketip Ljava/net/InetAddress;
.field private static socketreq I
.field private static socket Ljava/net/Socket;
.field private static threadreqpri I
.field private static threadreq Ljava/lang/Runnable;
.field private static dnsreq Ljava/lang/String;
.field public static dns Ljava/lang/String;
.field private static urlreq Ljava/lang/String;
.field private static urlstream Ljava/io/DataInputStream;
.field private static savelen I
.field private static savereq Ljava/lang/String;
.field private static savebuf [B
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
L44:    putstatic Field sign/signlink savereq Ljava/lang/String;
L47:    aconst_null
L48:    putstatic Field sign/signlink urlreq Ljava/lang/String;
L51:    aload_0
L52:    putstatic Field sign/signlink socketip Ljava/net/InetAddress;
L55:    new java/lang/Thread
L58:    dup
L59:    new sign/signlink
L62:    dup
L63:    invokespecial Method sign/signlink <init> ()V
L66:    invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L69:    astore_1
L70:    aload_1
L71:    iconst_1
L72:    invokevirtual Method java/lang/Thread setDaemon (Z)V
L75:    aload_1
L76:    invokevirtual Method java/lang/Thread start ()V
L79:    goto L95
        .catch java/lang/Exception from L82 to L88 using L91
L82:    ldc2_w 50L
L85:    invokestatic Method java/lang/Thread sleep (J)V
L88:    goto L95
L91:    pop
L92:    goto L95
L95:    getstatic Field sign/signlink active Z
L98:    ifeq L82
L101:   return
L102:   
        .linenumbertable
            L0 62
            L11 64
            L17 65
            L27 66
            L31 69
            L43 70
            L55 72
            L70 73
            L79 74
            L101 60
        .end linenumbertable
    .end code
.end method

.method public final run : ()V
    .code stack 7 locals 4
L0:     iconst_1
L1:     putstatic Field sign/signlink active Z
L4:     invokestatic Method sign/signlink findcachedir ()Ljava/lang/String;
L7:     astore_1
L8:     aload_1
L9:     invokestatic Method sign/signlink getuid (Ljava/lang/String;)I
L12:    putstatic Field sign/signlink uid I
        .catch java/lang/Exception from L15 to L146 using L149
L15:    new java/io/File
L18:    dup
L19:    new java/lang/StringBuffer
L22:    dup
L23:    aload_1
L24:    invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L27:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L30:    ldc "main_file_cache.dat"
L32:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L35:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L38:    invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L41:    astore_2
L42:    aload_2
L43:    invokevirtual Method java/io/File exists ()Z
L46:    ifeq L65
L49:    aload_2
L50:    invokevirtual Method java/io/File length ()J
L53:    ldc2_w 52428800L
L56:    lcmp
L57:    ifle L65
L60:    aload_2
L61:    invokevirtual Method java/io/File delete ()Z
L64:    pop
L65:    new java/io/RandomAccessFile
L68:    dup
L69:    new java/lang/StringBuffer
L72:    dup
L73:    aload_1
L74:    invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L77:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L80:    ldc "main_file_cache.dat"
L82:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L85:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L88:    ldc "rw"
L90:    invokespecial Method java/io/RandomAccessFile <init> (Ljava/lang/String;Ljava/lang/String;)V
L93:    putstatic Field sign/signlink cache_dat Ljava/io/RandomAccessFile;
L96:    iconst_0
L97:    istore_3
L98:    goto L141
L101:   getstatic Field sign/signlink cache_idx [Ljava/io/RandomAccessFile;
L104:   iload_3
L105:   new java/io/RandomAccessFile
L108:   dup
L109:   new java/lang/StringBuffer
L112:   dup
L113:   aload_1
L114:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L117:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L120:   ldc "main_file_cache.idx"
L122:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L125:   iload_3
L126:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L129:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L132:   ldc "rw"
L134:   invokespecial Method java/io/RandomAccessFile <init> (Ljava/lang/String;Ljava/lang/String;)V
L137:   aastore
L138:   iinc 3 1
L141:   iload_3
L142:   iconst_5
L143:   if_icmplt L101
L146:   goto L154
L149:   astore_2
L150:   aload_2
L151:   invokevirtual Method java/lang/Throwable printStackTrace ()V
L154:   getstatic Field sign/signlink threadliveid I
L157:   istore_2
L158:   goto L467
L161:   getstatic Field sign/signlink socketreq I
L164:   ifeq L198
        .catch java/lang/Exception from L167 to L183 using L186
L167:   new java/net/Socket
L170:   dup
L171:   getstatic Field sign/signlink socketip Ljava/net/InetAddress;
L174:   getstatic Field sign/signlink socketreq I
L177:   invokespecial Method java/net/Socket <init> (Ljava/net/InetAddress;I)V
L180:   putstatic Field sign/signlink socket Ljava/net/Socket;
L183:   goto L191
L186:   pop
L187:   aconst_null
L188:   putstatic Field sign/signlink socket Ljava/net/Socket;
L191:   iconst_0
L192:   putstatic Field sign/signlink socketreq I
L195:   goto L454
L198:   getstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L201:   ifnull L238
L204:   new java/lang/Thread
L207:   dup
L208:   getstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L211:   invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L214:   astore_3
L215:   aload_3
L216:   iconst_1
L217:   invokevirtual Method java/lang/Thread setDaemon (Z)V
L220:   aload_3
L221:   invokevirtual Method java/lang/Thread start ()V
L224:   aload_3
L225:   getstatic Field sign/signlink threadreqpri I
L228:   invokevirtual Method java/lang/Thread setPriority (I)V
L231:   aconst_null
L232:   putstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L235:   goto L454
L238:   getstatic Field sign/signlink dnsreq Ljava/lang/String;
L241:   ifnull L272
        .catch java/lang/Exception from L244 to L256 using L259
L244:   getstatic Field sign/signlink dnsreq Ljava/lang/String;
L247:   invokestatic Method java/net/InetAddress getByName (Ljava/lang/String;)Ljava/net/InetAddress;
L250:   invokevirtual Method java/net/InetAddress getHostName ()Ljava/lang/String;
L253:   putstatic Field sign/signlink dns Ljava/lang/String;
L256:   goto L265
L259:   pop
L260:   ldc "unknown"
L262:   putstatic Field sign/signlink dns Ljava/lang/String;
L265:   aconst_null
L266:   putstatic Field sign/signlink dnsreq Ljava/lang/String;
L269:   goto L454
L272:   getstatic Field sign/signlink savereq Ljava/lang/String;
L275:   ifnull L407
L278:   getstatic Field sign/signlink savebuf [B
L281:   ifnull L334
        .catch java/lang/Exception from L284 to L327 using L330
L284:   new java/io/FileOutputStream
L287:   dup
L288:   new java/lang/StringBuffer
L291:   dup
L292:   aload_1
L293:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L296:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L299:   getstatic Field sign/signlink savereq Ljava/lang/String;
L302:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L305:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L308:   invokespecial Method java/io/FileOutputStream <init> (Ljava/lang/String;)V
L311:   astore_3
L312:   aload_3
L313:   getstatic Field sign/signlink savebuf [B
L316:   iconst_0
L317:   getstatic Field sign/signlink savelen I
L320:   invokevirtual Method java/io/FileOutputStream write ([BII)V
L323:   aload_3
L324:   invokevirtual Method java/io/FileOutputStream close ()V
L327:   goto L334
L330:   pop
L331:   goto L334
L334:   getstatic Field sign/signlink waveplay Z
L337:   ifeq L367
L340:   new java/lang/StringBuffer
L343:   dup
L344:   aload_1
L345:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L348:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L351:   getstatic Field sign/signlink savereq Ljava/lang/String;
L354:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L357:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L360:   putstatic Field sign/signlink wave Ljava/lang/String;
L363:   iconst_0
L364:   putstatic Field sign/signlink waveplay Z
L367:   getstatic Field sign/signlink midiplay Z
L370:   ifeq L400
L373:   new java/lang/StringBuffer
L376:   dup
L377:   aload_1
L378:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L381:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L384:   getstatic Field sign/signlink savereq Ljava/lang/String;
L387:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L390:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L393:   putstatic Field sign/signlink midi Ljava/lang/String;
L396:   iconst_0
L397:   putstatic Field sign/signlink midiplay Z
L400:   aconst_null
L401:   putstatic Field sign/signlink savereq Ljava/lang/String;
L404:   goto L454
L407:   getstatic Field sign/signlink urlreq Ljava/lang/String;
L410:   ifnull L454
        .catch java/lang/Exception from L413 to L442 using L445
L413:   new java/io/DataInputStream
L416:   dup
L417:   new java/net/URL
L420:   dup
L421:   getstatic Field sign/signlink mainapp Ljava/applet/Applet;
L424:   invokevirtual Method java/applet/Applet getCodeBase ()Ljava/net/URL;
L427:   getstatic Field sign/signlink urlreq Ljava/lang/String;
L430:   invokespecial Method java/net/URL <init> (Ljava/net/URL;Ljava/lang/String;)V
L433:   invokevirtual Method java/net/URL openStream ()Ljava/io/InputStream;
L436:   invokespecial Method java/io/DataInputStream <init> (Ljava/io/InputStream;)V
L439:   putstatic Field sign/signlink urlstream Ljava/io/DataInputStream;
L442:   goto L450
L445:   pop
L446:   aconst_null
L447:   putstatic Field sign/signlink urlstream Ljava/io/DataInputStream;
L450:   aconst_null
L451:   putstatic Field sign/signlink urlreq Ljava/lang/String;
        .catch java/lang/Exception from L454 to L460 using L463
L454:   ldc2_w 50L
L457:   invokestatic Method java/lang/Thread sleep (J)V
L460:   goto L467
L463:   pop
L464:   goto L467
L467:   getstatic Field sign/signlink threadliveid I
L470:   iload_2
L471:   if_icmpeq L161
L474:   return
L475:   
        .linenumbertable
            L0 79
            L4 81
            L8 83
            L15 85
            L15 87
            L42 88
            L65 90
            L96 91
            L101 92
            L138 91
            L146 85
            L149 95
            L150 96
            L154 99
            L158 100
            L161 102
            L167 103
            L186 104
            L191 105
            L195 102
            L198 108
            L204 109
            L224 110
            L231 111
            L235 108
            L238 114
            L244 115
            L259 116
            L265 117
            L269 114
            L272 120
            L278 121
            L284 122
            L284 123
            L312 124
            L327 122
            L330 126
            L331 122
            L334 128
            L367 129
            L400 130
            L404 120
            L407 133
            L413 134
            L445 135
            L450 136
            L454 139
            L467 100
            L474 77
        .end linenumbertable
    .end code
.end method

.method public static final findcachedir : ()Ljava/lang/String;
    .code stack 5 locals 5
L0:     bipush 14
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
L71:    dup
L72:    bipush 12
L74:    ldc "c:/rscache"
L76:    aastore
L77:    dup
L78:    bipush 13
L80:    ldc "/rscache"
L82:    aastore
L83:    astore_0
L84:    getstatic Field sign/signlink storeid I
L87:    bipush 32
L89:    if_icmplt L100
L92:    getstatic Field sign/signlink storeid I
L95:    bipush 34
L97:    if_icmple L105
L100:   bipush 32
L102:   putstatic Field sign/signlink storeid I
L105:   new java/lang/StringBuffer
L108:   dup
L109:   ldc ".file_store_"
L111:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L114:   getstatic Field sign/signlink storeid I
L117:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L120:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L123:   astore_1
L124:   iconst_0
L125:   istore_2
L126:   goto L238
        .catch java/lang/Exception from L129 to L231 using L231
L129:   aload_0
L130:   iload_2
L131:   aaload
L132:   astore_3
L133:   aload_3
L134:   invokevirtual Method java/lang/String length ()I
L137:   ifle L161
L140:   new java/io/File
L143:   dup
L144:   aload_3
L145:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L148:   astore 4
L150:   aload 4
L152:   invokevirtual Method java/io/File exists ()Z
L155:   ifne L161
L158:   goto L235
L161:   new java/io/File
L164:   dup
L165:   new java/lang/StringBuffer
L168:   dup
L169:   aload_3
L170:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L173:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L176:   aload_1
L177:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L180:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L183:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L186:   astore 4
L188:   aload 4
L190:   invokevirtual Method java/io/File exists ()Z
L193:   ifne L207
L196:   aload 4
L198:   invokevirtual Method java/io/File mkdir ()Z
L201:   ifne L207
L204:   goto L235
L207:   new java/lang/StringBuffer
L210:   dup
L211:   aload_3
L212:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L215:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L218:   aload_1
L219:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L222:   ldc "/"
L224:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L227:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L230:   areturn
L231:   pop
L232:   goto L235
L235:   iinc 2 1
L238:   iload_2
L239:   aload_0
L240:   arraylength
L241:   if_icmplt L129
L244:   aconst_null
L245:   areturn
L246:   
        .linenumbertable
            L0 144
            L84 145
            L105 146
            L124 147
            L129 148
            L129 150
            L133 151
            L161 153
            L188 154
            L207 156
            L231 158
            L232 148
            L235 147
            L244 160
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
            L0 165
            L0 166
            L27 167
            L45 168
            L79 169
            L95 165
            L98 172
            L99 174
            L99 175
            L133 176
            L142 177
            L146 179
            L147 180
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
            L0 188
            L4 189
            L26 190
            L42 191
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
            L0 195
            L4 196
            L26 197
            L56 198
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
            L0 202
            L4 203
            L8 201
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
            L0 207
            L8 206
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
            L0 211
            L8 212
            L16 213
            L26 214
            L64 215
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
            L0 219
            L8 220
            L42 221
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
            L0 225
            L7 226
            L14 227
            L24 228
            L62 224
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
        .catch java/io/IOException from L36 to L123 using L124
L36:    aload_0
L37:    bipush 58
L39:    bipush 95
L41:    invokevirtual Method java/lang/String replace (CC)Ljava/lang/String;
L44:    astore_0
L45:    aload_0
L46:    bipush 64
L48:    bipush 95
L50:    invokevirtual Method java/lang/String replace (CC)Ljava/lang/String;
L53:    astore_0
L54:    aload_0
L55:    bipush 38
L57:    bipush 95
L59:    invokevirtual Method java/lang/String replace (CC)Ljava/lang/String;
L62:    astore_0
L63:    aload_0
L64:    bipush 35
L66:    bipush 95
L68:    invokevirtual Method java/lang/String replace (CC)Ljava/lang/String;
L71:    astore_0
L72:    new java/lang/StringBuffer
L75:    dup
L76:    ldc "reporterror"
L78:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L81:    sipush 317
L84:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L87:    ldc ".cgi?error="
L89:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L92:    getstatic Field sign/signlink errorname Ljava/lang/String;
L95:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L98:    ldc " "
L100:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L103:   aload_0
L104:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L107:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L110:   invokestatic Method sign/signlink openurl (Ljava/lang/String;)Ljava/io/DataInputStream;
L113:   astore_1
L114:   aload_1
L115:   invokevirtual Method java/io/DataInputStream readLine ()Ljava/lang/String;
L118:   pop
L119:   aload_1
L120:   invokevirtual Method java/io/FilterInputStream close ()V
L123:   return
L124:   pop
L125:   return
L126:   
        .linenumbertable
            L0 239
            L7 240
            L14 241
            L36 242
            L36 243
            L45 244
            L54 245
            L63 246
            L72 247
            L114 248
            L119 249
            L123 242
            L124 251
            L125 238
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
L0:     bipush 32
L2:     putstatic Field sign/signlink storeid I
L5:     aconst_null
L6:     putstatic Field sign/signlink cache_dat Ljava/io/RandomAccessFile;
L9:     iconst_5
L10:    anewarray java/io/RandomAccessFile
L13:    putstatic Field sign/signlink cache_idx [Ljava/io/RandomAccessFile;
L16:    aconst_null
L17:    putstatic Field sign/signlink mainapp Ljava/applet/Applet;
L20:    aconst_null
L21:    putstatic Field sign/signlink socket Ljava/net/Socket;
L24:    iconst_1
L25:    putstatic Field sign/signlink threadreqpri I
L28:    aconst_null
L29:    putstatic Field sign/signlink threadreq Ljava/lang/Runnable;
L32:    aconst_null
L33:    putstatic Field sign/signlink dnsreq Ljava/lang/String;
L36:    aconst_null
L37:    putstatic Field sign/signlink dns Ljava/lang/String;
L40:    aconst_null
L41:    putstatic Field sign/signlink urlreq Ljava/lang/String;
L44:    aconst_null
L45:    putstatic Field sign/signlink urlstream Ljava/io/DataInputStream;
L48:    aconst_null
L49:    putstatic Field sign/signlink savereq Ljava/lang/String;
L52:    aconst_null
L53:    putstatic Field sign/signlink savebuf [B
L56:    aconst_null
L57:    putstatic Field sign/signlink midi Ljava/lang/String;
L60:    aconst_null
L61:    putstatic Field sign/signlink wave Ljava/lang/String;
L64:    iconst_1
L65:    putstatic Field sign/signlink reporterror Z
L68:    ldc ""
L70:    putstatic Field sign/signlink errorname Ljava/lang/String;
L73:    return
L74:    
        .linenumbertable
            L0 13
            L5 15
            L9 16
            L16 20
            L20 29
            L24 31
            L28 32
            L32 34
            L36 35
            L40 37
            L44 38
            L48 42
            L52 43
            L56 47
            L60 53
            L64 235
            L68 236
            L73 6
        .end linenumbertable
    .end code
.end method
.sourcefile "signlink.java"
.end class
