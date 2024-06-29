import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class270 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4295 = "M";

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Llf;")
    public static class211 field4298 = new class211(50);

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
    public static int[] field4302 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lng;")
    public static class76 field4300;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Z")
    public static boolean field4301;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIBIIIIIIIZI)Z")
    public static final boolean method1830(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field4296++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class50.field695[var12][var31] = 0;
                class238.field3811[var12][var31] = 99999999;
            }
        }
        class50.field695[arg7][arg11] = 99;
        class238.field3811[arg7][arg11] = 0;
        int var13 = arg7;
        int var14 = arg11;
        if (arg2 <= 121) {
            field4301 = true;
        }
        int var15 = 0;
        byte var16 = 0;
        class137.field2040[var16] = arg7;
        int var32 = var16 + 1;
        class172.field2697[var16] = arg11;
        boolean var17 = false;
        int[][] var18 = class290.field4574[class276.field4398].field1125;
        while (var15 != var32) {
            var14 = class172.field2697[var15];
            var13 = class137.field2040[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg6 == var13 && arg4 == var14) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class290.field4574[class276.field4398].method538(arg8, arg3 - 1, (byte) -43, 2, var14, arg6, arg4, var13)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class290.field4574[class276.field4398].method543(arg8, var14, arg6, arg3 - 1, var13, 1, 2, arg4)) {
                    var17 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg9 != 0 && class290.field4574[class276.field4398].method549(arg6, arg1, 2, var13, arg9, arg5, var14, arg4, 125)) {
                var17 = true;
                break;
            }
            int var30 = class238.field3811[var13][var14] + 1;
            if (var13 > 0 && class50.field695[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class137.field2040[var32] = var13 - 1;
                class172.field2697[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class50.field695[var13 - 1][var14] = 2;
                class238.field3811[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class50.field695[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class137.field2040[var32] = var13 + 1;
                class172.field2697[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class50.field695[var13 + 1][var14] = 8;
                class238.field3811[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class50.field695[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class137.field2040[var32] = var13;
                class172.field2697[var32] = var14 - 1;
                class50.field695[var13][var14 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class238.field3811[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class50.field695[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class137.field2040[var32] = var13;
                class172.field2697[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field695[var13][var14 + 1] = 4;
                class238.field3811[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class50.field695[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class137.field2040[var32] = var13 - 1;
                class172.field2697[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field695[var13 - 1][var14 - 1] = 3;
                class238.field3811[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class50.field695[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class137.field2040[var32] = var13 + 1;
                class172.field2697[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field695[var13 + 1][var14 - 1] = 9;
                class238.field3811[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class50.field695[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class137.field2040[var32] = var13 - 1;
                class172.field2697[var32] = var14 + 1;
                class50.field695[var13 - 1][var14 + 1] = 6;
                class238.field3811[var13 - 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 < 102 && class50.field695[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class137.field2040[var32] = var13 + 1;
                class172.field2697[var32] = var14 + 1;
                class50.field695[var13 + 1][var14 + 1] = 12;
                class238.field3811[var13 + 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class177.field2768 = 0;
        if (!var17) {
            if (!arg10) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg6 - var21; var22 <= arg6 + var21; var22++) {
                for (int var23 = arg4 - var21; var23 <= arg4 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class238.field3811[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg6 > var22) {
                            var24 = arg6 - var22;
                        } else if (var22 > (arg6 - (1 - arg5))) {
                            var24 = var22 + 1 - arg5 - arg6;
                        }
                        if (var23 < arg4) {
                            var25 = arg4 - var23;
                        } else if (var23 > arg9 + arg4 - 1) {
                            var25 = var23 + 1 - arg9 - arg4;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var20 > class238.field3811[var22][var23]) {
                            var19 = var26;
                            var20 = class238.field3811[var22][var23];
                            var14 = var23;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg7 == var13 && arg11 == var14) {
                return false;
            }
            class177.field2768 = 1;
        }
        byte var27 = 0;
        class137.field2040[var27] = var13;
        int var33 = var27 + 1;
        class172.field2697[var27] = var14;
        int var28;
        int var29 = var28 = class50.field695[var13][var14];
        while (arg7 != var13 || arg11 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class137.field2040[var33] = var13;
                class172.field2697[var33++] = var14;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            var29 = class50.field695[var13][var14];
        }
        if (var33 > 0) {
            class78.method525(arg0, var33, (byte) -25);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static void method1831(boolean arg0) {
        field4300 = null;
        field4295 = null;
        field4298 = null;
        field4302 = null;
        if (arg0) {
            method1831(true);
        }
    }
}
