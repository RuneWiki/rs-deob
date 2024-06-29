import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class180 {

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "J")
    private long field3097 = -1L;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "J")
    private long field3095 = -1L;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    private int field3083 = 0;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lwg;")
    private class274 field3080;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "J")
    private long field3096;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "J")
    private long field3081;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "[B")
    private byte[] field3104;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "J")
    private long field3086;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "[B")
    private byte[] field3105;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Lbe;")
    private static class283 field3094 = class153.method941(-52, "cyan:");

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lbe;")
    public static class283 field3093 = field3094;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Lbe;")
    public static class283 field3090 = field3094;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "[Lpk;")
    public static class104[] field3102 = new class104[4];

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "Lbe;")
    private static class283 field3110 = class153.method941(127, "Members object");

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "Lbe;")
    public static class283 field3103 = field3110;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Ltf;")
    public static class242 field3091 = new class242(260);

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "Lbe;")
    public static class283 field3111 = class153.method941(-94, "::rect_debug");

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "F")
    public static float field3115;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "J")
    private long field3106;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "Lbe;")
    public static class283 field3114;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "[I")
    public static int[] field3101;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "[[[B")
    public static byte[][][] field3112;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)J", line = 8)
    public final long method1178(int arg0) {
        if (arg0 >= -56) {
            field3110 = (class283) null;
        }
        field3089++;
        return this.field3081;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 23)
    private final void method1179(int arg0) throws IOException {
        if (this.field3097 != -1L) {
            long var2 = -1L;
            if (this.field3106 != this.field3097) {
                this.field3080.method1845(this.field3097, 1529);
                this.field3106 = this.field3097;
            }
            this.field3080.method1840(0, this.field3105, arg0 - 8166, this.field3083);
            if (this.field3095 <= this.field3097 && this.field3097 < (long) this.field3085 + this.field3095) {
                var2 = this.field3097;
            } else if (this.field3095 >= this.field3097 && this.field3095 < ((long) this.field3083 + this.field3097)) {
                var2 = this.field3095;
            }
            this.field3106 += (long) this.field3083;
            if (this.field3106 > this.field3096) {
                this.field3096 = this.field3106;
            }
            long var4 = -1L;
            if (((long) this.field3083 + this.field3097) > this.field3095 && (long) this.field3085 + this.field3095 >= this.field3097 - -((long) this.field3083)) {
                var4 = (long) this.field3083 + this.field3097;
            } else if (this.field3097 < (long) this.field3085 + this.field3095 && (this.field3097 + ((long) this.field3083)) >= (this.field3095 + ((long) this.field3085))) {
                var4 = (long) this.field3085 + this.field3095;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class136.method843(this.field3105, (int) (var2 - this.field3097), this.field3104, (int) (var2 - this.field3095), var6);
            }
            this.field3083 = 0;
            this.field3097 = -1L;
        }
        if (arg0 != 1) {
            method1189(6);
        }
        field3098++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BJ)V", line = 108)
    public final void method1180(byte arg0, long arg1) throws IOException {
        if (arg0 != -37) {
            method1191((class26) null);
        }
        field3088++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1181(arg0 ^ 0xFFFFFFD9));
        }
        this.field3086 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)Ljava/io/File;", line = 124)
    private final File method1181(int arg0) {
        field3108++;
        return arg0 == 2 ? this.field3080.method1842((byte) -90) : (File) null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 135)
    public final void method1182(byte arg0) throws IOException {
        field3092++;
        this.method1179(arg0 - 77);
        this.field3080.method1843(-108);
        if (arg0 != 78) {
            field3091 = (class242) null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([BBII)V", line = 153)
    public final void method1183(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field3099++;
        try {
            if (arg2 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg0.length);
            }
            if (this.field3097 != -1L && this.field3086 >= this.field3097 && ((long) this.field3083 + this.field3097) >= ((long) arg2 + this.field3086)) {
                class136.method843(this.field3105, (int) (this.field3086 - this.field3097), arg0, arg3, arg2);
                this.field3086 += (long) arg2;
                return;
            }
            int var5 = arg3;
            long var6 = this.field3086;
            if (arg1 != -125) {
                method1188(101, 121, (class69) null, -119, 68);
            }
            int var8 = arg2;
            if (this.field3095 <= this.field3086 && this.field3086 < ((long) this.field3085 + this.field3095)) {
                int var9 = (int) ((long) this.field3085 - (this.field3086 - this.field3095));
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class136.method843(this.field3104, (int) (this.field3086 - this.field3095), arg0, arg3, var9);
                arg2 -= var9;
                arg3 += var9;
                this.field3086 += (long) var9;
            }
            if (this.field3104.length < arg2) {
                this.field3080.method1845(this.field3086, arg1 + 1654);
                this.field3106 = this.field3086;
                while (arg2 > 0) {
                    int var10 = this.field3080.method1844(arg3, true, arg2, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 -= var10;
                    arg3 += var10;
                    this.field3106 += (long) var10;
                    this.field3086 += (long) var10;
                }
            } else if (arg2 > 0) {
                this.method1184(arg1 - 19212);
                int var11 = arg2;
                if (this.field3085 < arg2) {
                    var11 = this.field3085;
                }
                arg2 -= var11;
                class136.method843(this.field3104, 0, arg0, arg3, var11);
                this.field3086 += (long) var11;
                arg3 += var11;
            }
            if (this.field3097 != -1L) {
                if (this.field3097 > this.field3086 && arg2 > 0) {
                    int var12 = arg3 + ((int) (this.field3097 - this.field3086));
                    if (var12 > (arg3 + arg2)) {
                        var12 = arg2 + arg3;
                    }
                    while (arg3 < var12) {
                        arg0[arg3++] = 0;
                        arg2--;
                        this.field3086++;
                    }
                }
                long var13 = -1L;
                if (this.field3097 >= var6 && ((long) var8 + var6) > this.field3097) {
                    var13 = this.field3097;
                } else if (var6 >= this.field3097 && ((long) this.field3083 + this.field3097) > var6) {
                    var13 = var6;
                }
                long var15 = -1L;
                if ((long) this.field3083 + this.field3097 > var6 && (this.field3097 + ((long) this.field3083)) <= ((long) var8 + var6)) {
                    var15 = (long) this.field3083 + this.field3097;
                } else if (((long) var8 + var6) > this.field3097 && ((long) var8 + var6) <= ((long) this.field3083 + this.field3097)) {
                    var15 = (long) var8 + var6;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class136.method843(this.field3105, (int) (var13 - this.field3097), arg0, var5 + ((int) (var13 - var6)), var17);
                    if (var15 > this.field3086) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field3086));
                        this.field3086 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3106 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V", line = 346)
    private final void method1184(int arg0) throws IOException {
        if (arg0 != -19337) {
            return;
        }
        this.field3085 = 0;
        field3107++;
        if (this.field3106 != this.field3086) {
            this.field3080.method1845(this.field3086, 1529);
            this.field3106 = this.field3086;
        }
        this.field3095 = this.field3086;
        while (this.field3104.length > this.field3085) {
            int var2 = this.field3104.length - this.field3085;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3080.method1844(this.field3085, true, var2, this.field3104);
            if (var3 == -1) {
                break;
            }
            this.field3085 += var3;
            this.field3106 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 394)
    public static final void method1185(boolean arg0) {
        if (!arg0) {
            method1188(-93, 33, (class69) null, -88, -104);
        }
        field3087++;
        class277.field4636.method1636(122);
        class107.field1824.method1636(110);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)Lqb;", line = 407)
    public static final class95 method1186(byte arg0) {
        if (arg0 != 52) {
            method1185(true);
        }
        field3084++;
        class95 var1 = new class95(class197.field3372, class193.field3301, class247.field4226[0], class232.field3933[0], class202.field3451[0], class201.field3440[0], class256.field4329[0], class296.field5018);
        class88.method571(-4);
        return var1;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lwg;II)V", line = 729)
    public class180(class274 arg0, int arg1, int arg2) throws IOException {
        this.field3080 = arg0;
        this.field3081 = this.field3096 = arg0.method1841(true);
        this.field3104 = new byte[arg1];
        this.field3086 = 0L;
        this.field3105 = new byte[arg2];
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([BB)V", line = 463)
    public final void method1187(byte[] arg0, byte arg1) throws IOException {
        field3109++;
        if (arg1 <= 114) {
            this.field3096 = 21L;
        }
        this.method1183(arg0, (byte) -125, arg0.length, 0);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILkg;II)V", line = 476)
    public static final void method1188(int arg0, int arg1, class69 arg2, int arg3, int arg4) {
        field3079++;
        class311.method2114(arg4, arg1, arg2.field1069 + arg4, arg1 - -arg2.field1085);
        if (arg0 < ~class166.field2772) {
            ((class266) class23.field354).method1798(arg4, arg1, arg2.field1069, arg2.field1085, class23.field354.field1828 / 2, class23.field354.field1821 / 2, class203.field3477, 256, (class266) arg2.method447(false, (byte) 28));
        } else {
            class107 var5 = arg2.method447(false, (byte) 28);
            if (var5 != null) {
                var5.method711(arg4, arg1);
            }
        }
        class69.field1147[arg3] = true;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V", line = 511)
    public static void method1189(int arg0) {
        if (arg0 > -70) {
            method1189(26);
        }
        field3114 = null;
        field3090 = null;
        field3111 = null;
        field3093 = null;
        field3110 = null;
        field3112 = (byte[][][]) null;
        field3103 = null;
        field3091 = null;
        field3094 = null;
        field3102 = null;
        field3101 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([BIII)V", line = 536)
    public final void method1190(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3082++;
        try {
            if (arg3 != 23065) {
                method1191((class26) null);
            }
            if (this.field3086 + ((long) arg2) > this.field3081) {
                this.field3081 = this.field3086 + ((long) arg2);
            }
            if (this.field3097 != -1L && (this.field3086 < this.field3097 || (long) this.field3083 + this.field3097 < this.field3086)) {
                this.method1179(1);
            }
            if (this.field3097 != -1L && (long) this.field3105.length + this.field3097 < (long) arg2 + this.field3086) {
                int var5 = (int) ((long) this.field3105.length - (this.field3086 - this.field3097));
                class136.method843(arg0, arg1, this.field3105, (int) (this.field3086 - this.field3097), var5);
                arg1 += var5;
                this.field3086 += (long) var5;
                arg2 -= var5;
                this.field3083 = this.field3105.length;
                this.method1179(1);
            }
            if (arg2 > this.field3105.length) {
                if (this.field3106 != this.field3086) {
                    this.field3080.method1845(this.field3086, 1529);
                    this.field3106 = this.field3086;
                }
                this.field3080.method1840(arg1, arg0, -8165, arg2);
                this.field3106 += (long) arg2;
                if (this.field3106 > this.field3096) {
                    this.field3096 = this.field3106;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3086 >= this.field3095 && this.field3086 < ((long) this.field3085 + this.field3095)) {
                    var6 = this.field3086;
                } else if (this.field3095 >= this.field3086 && this.field3095 < (this.field3086 + ((long) arg2))) {
                    var6 = this.field3095;
                }
                if (this.field3095 < (long) arg2 + this.field3086 && (long) arg2 + this.field3086 <= (long) this.field3085 + this.field3095) {
                    var8 = (long) arg2 + this.field3086;
                } else if (this.field3086 < (long) this.field3085 + this.field3095 && this.field3086 + ((long) arg2) >= this.field3095 - -((long) this.field3085)) {
                    var8 = (long) this.field3085 + this.field3095;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class136.method843(arg0, (int) (var6 + (long) arg1 - this.field3086), this.field3104, (int) (var6 - this.field3095), var10);
                }
                this.field3086 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3097 == -1L) {
                    this.field3097 = this.field3086;
                }
                class136.method843(arg0, arg1, this.field3105, (int) (this.field3086 - this.field3097), arg2);
                this.field3086 += (long) arg2;
                if (this.field3086 - this.field3097 > (long) this.field3083) {
                    this.field3083 = (int) (this.field3086 - this.field3097);
                }
            }
        } catch (IOException var12) {
            this.field3106 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lsd;)V", line = 664)
    public static final void method1191(class26 arg0) {
        for (int var1 = arg0.field398; var1 <= arg0.field395; var1++) {
            for (int var2 = arg0.field394; var2 <= arg0.field378; var2++) {
                class160 var3 = class86.field1459[arg0.field386][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2627; var4++) {
                        if (var3.field2623[var4] == arg0) {
                            var3.field2627--;
                            for (int var5 = var4; var5 < var3.field2627; var5++) {
                                var3.field2623[var5] = var3.field2623[var5 + 1];
                                var3.field2628[var5] = var3.field2628[var5 + 1];
                            }
                            var3.field2623[var3.field2627] = null;
                            break;
                        }
                    }
                    var3.field2609 = 0;
                    for (int var6 = 0; var6 < var3.field2627; var6++) {
                        var3.field2609 |= var3.field2628[var6];
                    }
                }
            }
        }
    }
}
