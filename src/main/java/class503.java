import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class503 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7035 = 0;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[I")
    public static int[] field7036 = new int[64];

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 3)
    public static void method2849(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            method2851(-118, -111, null, null, -55, 96, null, 3, 69, true, 118, 2, 85, -52, true);
        }
        field7036 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILjj;[IZI)Log;", line = 14)
    public static final class98 method2850(int arg0, int arg1, class66 arg2, int[] arg3, boolean arg4, int arg5) {
        field7038++;
        if (arg0 != 0) {
            field7035 = -20;
        }
        if (!arg2.field1164 && (!class32.method294(arg5, false) || !class32.method294(arg1, false))) {
            return arg2.field1158 ? new class98(arg2, 34037, arg5, arg1, arg4, arg3) : new class98(arg2, arg5, arg1, class243.method1546(-26367, arg5), class243.method1546(-26367, arg1), arg3);
        } else {
            return new class98(arg2, 3553, arg5, arg1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILaea;[III[IIIZIIIIZ)I", line = 35)
    public static final int method2851(int arg0, int arg1, class39 arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class552.field7817[var15][var35] = 0;
                class561.field8015[var15][var35] = 99999999;
            }
        }
        field7037++;
        boolean var16;
        if (arg11 == 1) {
            var16 = class272.method1762(arg5, arg12, arg10, arg8, arg7, arg2, (byte) 127, arg13, arg4, arg1, arg0);
        } else if (arg11 == 2) {
            var16 = class531.method2991(arg13, arg4, arg8, arg5, arg1, arg12, arg2, arg7, -25013, arg10, arg0);
        } else {
            var16 = class504.method2857(arg5, arg11, arg1, arg2, arg7, arg10, arg13, arg4, arg8, arg12, arg0, -1);
        }
        if (arg9) {
            field7035 = 83;
        }
        int var17 = arg7 - 64;
        int var18 = arg8 - 64;
        int var19 = class492.field6908;
        int var20 = class47.field667;
        if (!var16) {
            if (!arg14) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg0 - var23; var24 <= (arg0 + var23); var24++) {
                for (int var25 = arg1 - var23; var25 <= arg1 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class561.field8015[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg0 > var24) {
                            var28 = arg0 - var24;
                        } else if (var24 > (arg0 + arg12 - 1)) {
                            var28 = var24 + 1 - arg12 - arg0;
                        }
                        int var29 = 0;
                        if (arg1 > var25) {
                            var29 = arg1 - var25;
                        } else if (var25 > arg1 + arg4 - 1) {
                            var29 = var25 - (arg1 - 1) - arg4;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class561.field8015[var26][var27]) {
                            var19 = var24;
                            var21 = var30;
                            var22 = class561.field8015[var26][var27];
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg7 == var19 && arg8 == var20) {
            return 0;
        }
        byte var31 = 0;
        class374.field5503[var31] = var19;
        int var37 = var31 + 1;
        class446.field6515[var31] = var20;
        int var32;
        int var33 = var32 = class552.field7817[var19 - var17][var20 - var18];
        while (arg7 != var19 || arg8 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class374.field5503[var37] = var19;
                class446.field6515[var37++] = var20;
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
            var33 = class552.field7817[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg6[var34] = class374.field5503[var37];
            arg3[var34++] = class446.field6515[var37];
            if (arg6.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIIII)V", line = 213)
    public static final void method2852(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7039++;
        if (class295.field4257 == 1) {
            class243.field3521[class313.field4571 / 100].method953(class277.field4050 - 8, class55.field791 + -8);
        }
        if (arg0 != -80) {
            field7035 = -109;
        }
        if (class295.field4257 == 2) {
            class243.field3521[class313.field4571 / 100 + 4].method953(class277.field4050 - 8, class55.field791 + -8);
        }
        class28.method265(true);
    }
}
