import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class60 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lqe;")
    public static class465 field1113 = new class465(36, 6);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII[IZIIIILjn;Z[III)I", line = 4)
    public static final int method666(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class716 arg10, boolean arg11, int[] arg12, int arg13, int arg14) {
        field1114++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class73.field1288[var15][var35] = 0;
                class668.field9364[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg6 == 1) {
            var16 = class421.method2578(arg0, arg3, arg13, arg7, arg9, arg10, arg8, (byte) -21, arg14, arg2, arg1);
        } else if (arg6 == 2) {
            var16 = class565.method3295(false, arg0, arg13, arg14, arg9, arg8, arg7, arg1, arg2, arg10, arg3);
        } else {
            var16 = class680.method3844(arg7, arg8, arg1, arg13, arg2, arg14, arg0, (byte) 124, arg3, arg6, arg9, arg10);
        }
        int var17 = arg14 - 64;
        if (!arg11) {
            field1113 = null;
        }
        int var18 = arg3 - 64;
        int var19 = class33.field437;
        int var20 = class40.field591;
        if (!var16) {
            if (!arg5) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= arg7 + var23; var24++) {
                for (int var25 = arg9 - var23; var25 <= arg9 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class668.field9364[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg7) {
                            var28 = arg7 - var24;
                        } else if ((arg7 + arg8 - 1) < var24) {
                            var28 = 1 - (arg7 + arg8 - var24);
                        }
                        int var29 = 0;
                        if (arg9 > var25) {
                            var29 = arg9 - var25;
                        } else if ((arg2 + arg9 - 1) < var25) {
                            var29 = var25 + 1 - arg2 - arg9;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var21 > var30 || var21 == var30 && class668.field9364[var26][var27] < var22) {
                            var21 = var30;
                            var19 = var24;
                            var20 = var25;
                            var22 = class668.field9364[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg14 == var19 && arg3 == var20) {
            return 0;
        }
        byte var31 = 0;
        class541.field7609[var31] = var19;
        int var37 = var31 + 1;
        class667.field9346[var31] = var20;
        int var32;
        int var33 = var32 = class73.field1288[var19 - var17][var20 - var18];
        while (arg14 != var19 || arg3 != var20) {
            if (var32 != var33) {
                class541.field7609[var37] = var19;
                var32 = var33;
                class667.field9346[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class73.field1288[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg12[var34] = class541.field7609[var37];
            arg4[var34++] = class667.field9346[var37];
            if (var34 >= arg12.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 182)
    public static void method667(boolean arg0) {
        if (!arg0) {
            method666(99, 9, -37, 82, null, false, -29, 0, 50, 124, null, false, null, -72, -79);
        }
        field1113 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 198)
    public static final void method668(int arg0) {
        if (arg0 != 4798) {
            field1113 = null;
        }
        for (int var1 = 0; var1 < class570.field8115; var1++) {
            class710 var2 = class719.field10073[var1];
            if (var2.field9915 == 3) {
                if (var2.field9922 == null) {
                    var2.field9914 = Integer.MIN_VALUE;
                } else {
                    class484.field6848.method4051(var2.field9922);
                }
            }
        }
        field1115++;
    }
}
