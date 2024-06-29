import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class193 {

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public int field3160 = -1;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Ldb;")
    public static class102 field3141 = new class102(100);

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "[I")
    public static int[] field3153 = new int[50];

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "[I")
    public static int[] field3155 = new int[500];

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field3154 = -1;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "[Lbk;")
    public static class126[] field3165 = new class126[14];

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field3156;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Lak;")
    public static class172 field3157;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Lek;")
    public static class220 field3158;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 8)
    public static void method1425(int arg0) {
        field3157 = null;
        field3165 = null;
        field3155 = null;
        if (arg0 != -1) {
            method1429(-74, (byte) -43);
        }
        field3153 = null;
        field3141 = null;
        field3158 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BIIII)Lna;", line = 29)
    public static final class266 method1426(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3150++;
        long var5 = (long) arg2 & 0xFFFFL << 48 | ((long) arg1 & 0xFFFFL) << 32 | (long) arg3 & 0xFFFFL << 16 | (long) arg4 & 0xFFFFL;
        class266 var7 = (class266) class164.field2742.method704((byte) 48, var5);
        if (var7 != null) {
            return var7;
        }
        if (arg0 != -43) {
            method1430(86, (float[][]) ((float[][]) null), false, -103, 82, -99, (float[][]) ((float[][]) null), true, 118, 0.80082464F, (float[][]) ((float[][]) null), -45, (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), -116, -49, -65, (class206) null);
        }
        class71[] var8 = null;
        class176 var9 = class5.method29(arg4, (byte) 126);
        if (var9.field2941 != null) {
            var8 = new class71[var9.field2941.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class115 var11 = class252.method1815(var9.field2941[var10], arg0 ^ 0x1);
                var8[var10] = new class71(var11.field1747, var11.field1748, var11.field1739, var11.field1742, var11.field1753, var11.field1749, var11.field1752, var11.field1741);
            }
        }
        class266 var12 = new class266(var9.field2937, var8, var9.field2936, arg2, arg1, arg3);
        class164.field2742.method703(var12, var5, (byte) -63);
        return var12;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 81)
    public static final void method1427(int arg0) {
        field3146++;
        while (class247.field3898.method2370(class219.field3540, 7) >= 27) {
            int var1 = class247.field3898.method2374(15, (byte) -36);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class99.field1445[var1] == null) {
                var2 = true;
                class99.field1445[var1] = new class234();
            }
            class234 var3 = class99.field1445[var1];
            class142.field2225[class233.field3736++] = var1;
            var3.field4204 = class240.field3818;
            if (var3.field3752 != null && var3.field3752.method1841(false)) {
                class189.method1401(arg0 - 1, var3);
            }
            int var4 = client.field1667[class247.field3898.method2374(3, (byte) -36)];
            if (var2) {
                var3.field4277 = var3.field4196 = var4;
            }
            var3.method1697(3734, class98.method666((byte) -65, class247.field3898.method2374(14, (byte) -36)));
            int var5 = class247.field3898.method2374(1, (byte) -36);
            if (var5 == 1) {
                class322.field4988[class192.field3138++] = var1;
            }
            int var6 = class247.field3898.method2374(5, (byte) -36);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class247.field3898.method2374(1, (byte) -36);
            int var8 = class247.field3898.method2374(5, (byte) -36);
            var3.method1883(39, var3.field3752.field4051);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field4185 = var3.field3752.field4125;
            if (var3.field4185 == 0) {
                var3.field4196 = 0;
            }
            var3.field4234 = var3.field3752.field4103;
            var3.method1873(var7 == 1, class191.field3129.field4184[0] + var8, class191.field3129.field4248[0] + var6, var3.method1881(-20395), false);
            if (var3.field3752.method1841(false)) {
                class215.method1546((class97) null, arg0 + 128, (class334) null, class49.field698, var3, var3.field4248[0], var3.field4184[0], 0);
            }
        }
        class247.field3898.method2377((byte) 127);
        if (arg0 != 0) {
            method1430(-24, (float[][]) ((float[][]) null), false, -125, 58, -73, (float[][]) ((float[][]) null), false, -46, 1.7675217F, (float[][]) ((float[][]) null), 87, (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), 32, 98, -21, (class206) null);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZILjava/lang/String;)V", line = 158)
    public static final void method1428(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
        if (arg2) {
            field3155 = (int[]) null;
        }
        field3142++;
        class157 var5 = class275.method1996(123, arg3, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field2564 != null) {
            class39 var6 = new class39();
            var6.field515 = arg4;
            var6.field501 = var5.field2564;
            var6.field500 = var5;
            var6.field510 = arg0;
            class144.method1065(var6, (byte) 67);
        }
        boolean var7 = true;
        if (var5.field2467 > 0) {
            var7 = class169.method1237(var5, (byte) 112);
        }
        if (!var7 || !client.method766(var5).method2028((byte) 109, arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class291.field4654++;
            class194.field3175.method2375(230, 0);
            class194.field3175.method283((byte) -51, arg1);
            class194.field3175.method287(0, arg3);
        }
        if (arg0 == 2) {
            class194.field3175.method2375(115, 0);
            class194.field3175.method283((byte) -51, arg1);
            class194.field3175.method287(0, arg3);
            class32.field435++;
        }
        if (arg0 == 3) {
            class194.field3175.method2375(105, 0);
            class146.field2274++;
            class194.field3175.method283((byte) -51, arg1);
            class194.field3175.method287(0, arg3);
        }
        if (arg0 == 4) {
            class194.field3175.method2375(217, 0);
            class194.field3175.method283((byte) -51, arg1);
            class270.field4350++;
            class194.field3175.method287(0, arg3);
        }
        if (arg0 == 5) {
            class83.field1153++;
            class194.field3175.method2375(125, 0);
            class194.field3175.method283((byte) -51, arg1);
            class194.field3175.method287(0, arg3);
        }
        if (arg0 == 6) {
            class194.field3175.method2375(207, 0);
            class194.field3175.method283((byte) -51, arg1);
            class194.field3175.method287(0, arg3);
            class288.field4607++;
        }
        if (arg0 == 7) {
            class194.field3175.method2375(116, 0);
            class338.field5271++;
            class194.field3175.method283((byte) -51, arg1);
            class194.field3175.method287(0, arg3);
        }
        if (arg0 == 8) {
            class302.field4733++;
            class194.field3175.method2375(173, 0);
            class194.field3175.method283((byte) -51, arg1);
            class194.field3175.method287(0, arg3);
        }
        if (arg0 == 9) {
            class138.field2178++;
            class194.field3175.method2375(86, 0);
            class194.field3175.method283((byte) -51, arg1);
            class194.field3175.method287(0, arg3);
        }
        if (arg0 == 10) {
            class194.field3175.method2375(168, 0);
            class194.field3175.method283((byte) -51, arg1);
            class194.field3175.method287(0, arg3);
            class202.field3280++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V", line = 298)
    public static final void method1429(int arg0, byte arg1) {
        if (arg0 >= -127) {
            field3154 = -4;
        }
        if (class7.field101 == null) {
            class7.field101 = new byte[4][104][104];
        }
        field3143++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class7.field101[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[[FZIII[[FZIF[[FI[[I[[IIIILrc;)I", line = 335)
    public static final int method1430(int arg0, float[][] arg1, boolean arg2, int arg3, int arg4, int arg5, float[][] arg6, boolean arg7, int arg8, float arg9, float[][] arg10, int arg11, int[][] arg12, int[][] arg13, int arg14, int arg15, int arg16, class206 arg17) {
        field3147++;
        if (arg0 == 1) {
            int var18 = arg16;
            arg16 = arg5;
            arg5 = 128 - var18;
        } else if (arg0 == 2) {
            arg16 = 128 - arg16;
            arg5 = 128 - arg5;
        } else if (arg0 == 3) {
            int var19 = arg16;
            arg16 = 128 - arg5;
            arg5 = var19;
        }
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg16 == 0 && arg5 == 0) {
            var20 = arg10[arg8][arg15];
            var21 = arg6[arg8][arg15];
            var22 = arg11;
            var23 = arg1[arg8][arg15];
        } else if (arg16 == 128 && arg5 == 0) {
            var20 = arg10[arg8 + 1][arg15];
            var22 = arg4;
            var21 = arg6[arg8 + 1][arg15];
            var23 = arg1[arg8 + 1][arg15];
        } else if (arg16 == 128 && arg5 == 128) {
            var20 = arg10[arg8 + 1][arg15 + 1];
            var22 = arg14;
            var23 = arg1[arg8 + 1][arg15 + 1];
            var21 = arg6[arg8 + 1][arg15 + 1];
        } else if (arg16 == 0 && arg5 == 128) {
            var23 = arg1[arg8][arg15 + 1];
            var22 = arg3;
            var20 = arg10[arg8][arg15 + 1];
            var21 = arg6[arg8][arg15 + 1];
        } else {
            float var24 = arg6[arg8][arg15];
            float var25 = arg10[arg8][arg15];
            float var26 = arg1[arg8][arg15];
            float var27 = arg10[arg8][arg15 + 1];
            float var28 = arg6[arg8][arg15 + 1];
            float var29 = (float) arg5 / 128.0F;
            float var30 = arg1[arg8][arg15 + 1];
            float var31 = (float) arg16 / 128.0F;
            float var32 = (arg1[arg8 + 1][arg15 + 1] - var30) * var31 + var30;
            float var33 = (arg6[arg8 + 1][arg15 + 1] - var28) * var31 + var28;
            float var34 = (arg6[arg8 + 1][arg15] - var24) * var31 + var24;
            float var35 = (arg10[arg8 + 1][arg15] - var25) * var31 + var25;
            float var36 = (arg1[arg8 + 1][arg15] - var26) * var31 + var26;
            var21 = (var33 - var34) * var29 + var34;
            var23 = (var32 - var36) * var29 + var36;
            float var37 = (arg10[arg8 + 1][arg15 + 1] - var27) * var31 + var27;
            int var38 = class54.method345(7515, arg11, arg4, arg16);
            var20 = (var37 - var35) * var29 + var35;
            int var39 = class54.method345(7515, arg3, arg14, arg16);
            var22 = class54.method345(7515, var38, var39, arg5);
        }
        if (arg7) {
            int var40 = (arg8 << 7) + arg16;
            int var41 = (arg15 << 7) + arg5;
            int var42 = class156.method1115((byte) -108, arg16, arg8, arg15, arg5, arg12);
            return arg17.method1498(var40, var42, var41, var21, var23, var20, arg2 ? var22 & 0xFFFFFF00 : var22, arg13 == null ? 0.0F : (float) (var42 - class156.method1115((byte) -84, arg16, arg8, arg15, arg5, arg13)) / arg9);
        } else {
            return -49;
        }
    }
}
