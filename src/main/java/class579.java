import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class579 extends class568 {

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    private int field8339;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    private int field8324;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    private int field8331;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public int field8334;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public int field8328;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public int field8335;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public int field8326;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    private int field8337;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    private int field8329;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field8342 = new String[] { method4244(method4243("!,1j\n")), method4244(method4243("#(sE")), method4244(method4243("6s1\u0007_")), method4244(method4243("!,1l\n")), method4244(method4243("!,1h\n")), method4244(method4243("!,1o\n")), method4244(method4243("!,1m\n")), method4244(method4243("!,1\u0015K#4k\u0017\n")), method4244(method4243("!,1k\n")) };

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "Lvn;")
    public static class330 field8336 = new class330(58, 4);

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "[F")
    public static float[] field8338 = new float[16384];

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "[F")
    public static float[] field8340 = new float[16384];

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public static void method4237(int arg0) {
        try {
            field8340 = null;
            field8338 = null;
            if (arg0 != 10464) {
                method4237(-43);
            }
            field8336 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8342[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III[I)V")
    public final void method4238(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            arg3[0] = 0;
            arg3[2] = this.field8334 + arg2 - this.field8337;
            if (arg1 > -76) {
                field8338 = null;
            }
            arg3[1] = arg0 + this.field8328 - this.field8329;
            field8330++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8342[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8342[1] : field8342[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II[II)V")
    public final void method4239(int arg0, int arg1, int[] arg2, int arg3) {
        try {
            arg2[0] = this.field8331;
            if (arg3 == 4676) {
                arg2[2] = this.field8337 + arg1 - this.field8334;
                arg2[1] = arg0 + this.field8329 - this.field8328;
                field8333++;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8342[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8342[1] : field8342[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)Z")
    public final boolean method4240(int arg0, int arg1, int arg2, int arg3) {
        try {
            field8327++;
            if (arg0 == 2) {
                return this.field8331 == arg1 && arg3 >= this.field8329 && this.field8324 >= arg3 && this.field8337 <= arg2 && this.field8339 >= arg2;
            } else {
                return true;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8342[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII)Z")
    public final boolean method4241(byte arg0, int arg1, int arg2) {
        try {
            int var4 = -111 / ((-arg0 - 3) / 43);
            field8332++;
            return this.field8328 <= arg2 && this.field8326 >= arg2 && arg1 >= this.field8334 && this.field8335 >= arg1;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8342[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBI)Z")
    public final boolean method4242(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 >= -36) {
                method4237(46);
            }
            field8325++;
            return arg2 >= this.field8329 && arg2 <= this.field8324 && this.field8337 <= arg0 && arg0 <= this.field8339;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8342[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            this.field8339 = arg4;
            this.field8324 = arg3;
            this.field8331 = arg0;
            this.field8334 = arg6;
            this.field8328 = arg5;
            this.field8335 = arg8;
            this.field8326 = arg7;
            this.field8337 = arg2;
            this.field8329 = arg1;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field8342[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field8340[var2] = (float) Math.sin((double) var2 * var0);
            field8338[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4243(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4244(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
