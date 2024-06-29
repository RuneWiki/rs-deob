import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class20 extends Exception {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lsb;")
    public static class305 field159 = new class305(51, 4);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method93(int arg0) {
        field159 = null;
        if (arg0 != 4) {
            method93(126);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[III[IZILjw;IIIBIII)I")
    public static final int method94(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6, class263 arg7, int arg8, int arg9, int arg10, byte arg11, int arg12, int arg13, int arg14) {
        field160++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class106.field1145[var15][var36] = 0;
                class378.field5119[var15][var36] = 99999999;
            }
        }
        boolean var16;
        if (arg8 == 1) {
            var16 = class396.method2238(-1, arg6, arg7, arg0, arg13, arg10, arg12, arg9, arg14, arg3, arg2);
        } else if (arg8 == 2) {
            var16 = class398.method2245(arg2, arg9, arg7, arg0, arg6, arg3, arg14, arg10, true, arg12, arg13);
        } else {
            var16 = class237.method1421(arg14, arg9, arg0, arg2, arg13, arg3, arg6, arg8, arg12, 44, arg7, arg10);
        }
        int var17 = arg9 - 64;
        int var18 = arg10 - 64;
        int var19 = class701.field9839;
        int var20 = class572.field8123;
        if (!var16) {
            if (!arg5) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg12 - var23; var24 <= arg12 + var23; var24++) {
                for (int var25 = arg0 - var23; var25 <= arg0 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class378.field5119[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg12 > var24) {
                            var28 = arg12 - var24;
                        } else if (var24 > (arg12 + arg14 - 1)) {
                            var28 = var24 + 1 - arg12 - arg14;
                        }
                        int var29 = 0;
                        if (var25 < arg0) {
                            var29 = arg0 - var25;
                        } else if (arg0 + arg13 - 1 < var25) {
                            var29 = var25 + 1 - arg13 - arg0;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class378.field5119[var26][var27] < var22) {
                            var21 = var30;
                            var22 = class378.field5119[var26][var27];
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg9 == var19 && arg10 == var20) {
            return 0;
        }
        byte var31 = 0;
        class60.field615[var31] = var19;
        int var38 = var31 + 1;
        class299.field3729[var31] = var20;
        int var32;
        int var33 = var32 = class106.field1145[var19 - var17][var20 - var18];
        int var34 = -52 % ((arg11 + 19) / 33);
        while (arg9 != var19 || arg10 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class60.field615[var38] = var19;
                class299.field3729[var38++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class106.field1145[var19 - var17][var20 - var18];
        }
        int var35 = 0;
        while ((var38--) > 0) {
            arg1[var35] = class60.field615[var38];
            arg4[var35++] = class299.field3729[var38];
            if (arg1.length <= var35) {
                break;
            }
        }
        return var35;
    }
}
