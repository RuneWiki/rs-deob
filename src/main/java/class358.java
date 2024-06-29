import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class358 extends class384 {

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public int field5479;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public int field5489;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public int field5486;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public int field5480;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public int field5490;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field5491 = new String[] { method2925(method2924("\u001753\u0019|")), method2925(method2924("\u0002nq[")), method2925(method2924("\u000fh3s)")), method2925(method2924("\u000fh3u)")), method2925(method2924("\u000fh3t)")), method2925(method2924("\u000fh3\u000bh\u0002ri\t)")), method2925(method2924("\u000fh3v)")) };

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "[I")
    public static int[] field5483 = new int[2048];

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Llk;Lvea;IIIIIIIIIIIII)V", line = 3)
    public class358(class613 arg0, class288 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        try {
            this.field5479 = arg13;
            this.field5489 = arg9;
            this.field5486 = arg10;
            this.field5482 = arg11;
            this.field5480 = arg12;
            this.field5490 = arg14;
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field5491[5] + (arg0 == null ? field5491[1] : field5491[0]) + ',' + (arg1 == null ? field5491[1] : field5491[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 16)
    public static final boolean method2921(String arg0, byte arg1) {
        try {
            field5487++;
            if (arg0 == null) {
                return false;
            }
            if (arg1 != -16) {
                method2923(96, 112, 79, (byte) -43, 89);
            }
            for (int var2 = 0; var2 < class588.field8654; var2++) {
                if (arg0.equalsIgnoreCase(class754.field10971[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class225.field3446.field10506);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5491[2] + (arg0 == null ? field5491[1] : field5491[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V", line = 57)
    public static void method2922(boolean arg0) {
        try {
            if (arg0) {
                method2922(true);
            }
            field5483 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5491[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIBI)I", line = 68)
    public static final int method2923(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field5485++;
            if (arg3 < 119) {
                return -66;
            } else {
                int var5 = 65536 - class298.field4703[arg1 * 8192 / arg0] >> 1;
                return ((65536 - var5) * arg2 >> 16) + (arg4 * var5 >> 16);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5491[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Lvaa;", line = 83)
    public class494 method1226(int arg0) {
        try {
            field5481++;
            int var2 = 87 % ((57 - arg0) / 61);
            return class638.field9279;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5491[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2924(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2925(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
