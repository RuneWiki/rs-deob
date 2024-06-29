import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class199 extends class232 {

    @OriginalMember(owner = "client!op", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field3158 = new String[] { method1822(method1821("[\u000f+Fx")), method1822(method1821("OQ+--")), method1822(method1821("NTi\u0004")), method1822(method1821("OQ+$-")), method1822(method1821("OQ+)-")), method1822(method1821("OQ+*-")) };

    @OriginalMember(owner = "client!op", name = "O", descriptor = "Lvn;")
    public static class330 field3149 = new class330(37, -1);

    @OriginalMember(owner = "client!op", name = "K", descriptor = "Lat;")
    public static class398 field3151 = new class398();

    @OriginalMember(owner = "client!op", name = "L", descriptor = "[I")
    public static int[] field3155 = new int[1];

    @OriginalMember(owner = "client!op", name = "M", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!op", name = "J", descriptor = "Lgda;")
    public static class58 field3152;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "Lf;")
    public static class791 field3154;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(II)[[I", line = 5)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field3156;
            int[][] var3 = super.field3599.method1580(arg1, (byte) -83);
            if (super.field3599.field2743) {
                int[][] var4 = this.method2023((byte) 97, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class449.field6969 < ~var11; ++var11) {
                    var8[var11] = 4096 - var5[var11];
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            if (arg0 != -3093) {
                this.method63(29, (class176) null, -93);
            }
            return var3;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field3158[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)[I", line = 52)
    public final int[] method66(int arg0, byte arg1) {
        try {
            if (arg1 != 123) {
                return null;
            } else {
                ++field3157;
                int[] var3 = super.field3601.method3467(arg0, (byte) -61);
                if (super.field3601.field6907) {
                    int[] var4 = this.method2022(arg0, 0, 0);
                    for (int var5 = 0; ~var5 > ~class449.field6969; ++var5) {
                        var3[var5] = -var4[var5] + 4096;
                    }
                }
                return var3;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3158[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V", line = 90)
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V", line = 93)
    public static void method1819(byte arg0) {
        try {
            field3151 = null;
            if (arg0 <= 84) {
                field3152 = null;
            }
            field3149 = null;
            field3152 = null;
            field3155 = null;
            field3154 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3158[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILwq;I)V", line = 107)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (~arg2 == -1) {
                super.field3605 = ~arg1.method1645((byte) -100) == -2;
            }
            ++field3150;
            if (arg0 < 96) {
                field3151 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3158[1] + arg0 + ',' + (arg1 != null ? field3158[0] : field3158[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(III)V", line = 133)
    public static final void method1820(int arg0, int arg1, int arg2) {
        class290 var3 = class85.field1280[arg0][arg1][arg2];
        if (var3 != null) {
            class292.method2484(var3.field4677);
            if (var3.field4677 != null) {
                var3.field4677 = null;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1821(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!op", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1822(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
