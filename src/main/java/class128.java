import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class128 {

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "[[F")
    public float[][] field2243;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "[I")
    public int[] field2246;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "[I")
    public int[] field2245;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "[I")
    public int[] field2248;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "Lvl;")
    public static class15 field2247 = new class15(90, -1);

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "Z")
    public static boolean field2249 = false;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IC)C", line = 5)
    public static final char method1091(int arg0, char arg1) {
        field2242++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else {
            if (arg0 != 90) {
                method1092(51);
            }
            if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V", line = 39)
    public static void method1092(int arg0) {
        field2247 = null;
        if (arg0 != -962345311) {
            method1094(63);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIIIII)V", line = 52)
    public static final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2244++;
        class434.method2541(arg4, true);
        int var7 = 0;
        int var8 = arg4 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        if (arg5 != -962345311) {
            return;
        }
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class298.field4105[arg6];
        int var16 = arg3 - var8;
        class679.method3826(var15, var16, 11, arg3 - arg4, arg0);
        int var17 = arg3 + var8;
        class679.method3826(var15, var17, 11, var16, arg1);
        class679.method3826(var15, arg3 + arg4, 11, var17, arg0);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class384.field5207[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var18 = class298.field4105[arg6 + var9];
                    int[] var19 = class298.field4105[arg6 - var9];
                    int var20 = class384.field5207[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class679.method3826(var18, var24, 11, var22, arg0);
                    class679.method3826(var18, var23, 11, var24, arg1);
                    class679.method3826(var18, var21, 11, var23, arg0);
                    class679.method3826(var19, var24, 11, var22, arg0);
                    class679.method3826(var19, var23, 11, var24, arg1);
                    class679.method3826(var19, var21, 11, var23, arg0);
                } else {
                    int[] var25 = class298.field4105[arg6 + var9];
                    int[] var26 = class298.field4105[arg6 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class679.method3826(var25, var27, arg5 + 962345322, var28, arg0);
                    class679.method3826(var26, var27, 11, var28, arg0);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class298.field4105[arg6 + var7];
            int[] var30 = class298.field4105[arg6 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 >= var8) {
                class679.method3826(var29, var31, 11, var32, arg0);
                class679.method3826(var30, var31, 11, var32, arg0);
            } else {
                int var33 = var7 > var11 ? class384.field5207[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class679.method3826(var29, var35, arg5 + 962345322, var32, arg0);
                class679.method3826(var29, var34, 11, var35, arg1);
                class679.method3826(var29, var31, 11, var34, arg0);
                class679.method3826(var30, var35, 11, var32, arg0);
                class679.method3826(var30, var34, arg5 ^ 0xC6A3C6AA, var35, arg1);
                class679.method3826(var30, var31, arg5 ^ 0xC6A3C6AA, var34, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "([I[I[I[[F)V", line = 181)
    public class128(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field2243 = arg3;
        this.field2246 = arg2;
        this.field2245 = arg1;
        this.field2248 = arg0;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V", line = 192)
    public static final void method1094(int arg0) {
        if (arg0 < 59) {
            method1093(-35, 12, 89, -121, -25, 125, 6);
        }
        field2241++;
        class556 var1 = (class556) class373.field5070.method3589((byte) -127);
        boolean var2 = class84.field1157 != null || class462.field6287 > 0;
        int var3 = var1.method2731(125);
        int var4 = var1.method2734(false);
        if (var2) {
            class586.field8293 = 1;
        }
        if (var2) {
            class354.field4748 = class603.field8440;
        } else {
            class63.method436(class603.field8440, var3, -56, var4);
        }
    }
}
