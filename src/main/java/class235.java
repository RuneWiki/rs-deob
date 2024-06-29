import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class235 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Llh;")
    public class235 field3410;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lde;")
    public class257 field3417;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZLpf;IIIIIBI[II[III)I")
    public static final int method1640(int arg0, boolean arg1, class18 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int[] arg10, int arg11, int[] arg12, int arg13, int arg14) {
        field3415++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class313.field4424[var15][var36] = 0;
                class432.field6113[var15][var36] = 99999999;
            }
        }
        boolean var16;
        if (arg11 == 1) {
            var16 = class205.method1410(arg3, arg7, arg13, arg14, arg9, arg5, 0, arg0, arg6, arg2, arg4);
        } else if (arg11 == 2) {
            var16 = class157.method1128(1, arg2, arg13, arg6, arg0, arg14, arg9, arg5, arg7, arg3, arg4);
        } else {
            var16 = class401.method2412(arg5, arg9, arg6, (byte) 70, arg14, arg4, arg2, arg7, arg0, arg13, arg3, arg11);
        }
        int var17 = arg3 - 64;
        int var18 = arg14 - 64;
        int var19 = class437.field6219;
        int var20 = class341.field4716;
        int var21 = 65 % ((-arg8 - 26) / 37);
        if (!var16) {
            if (!arg1) {
                return -1;
            }
            int var22 = Integer.MAX_VALUE;
            int var23 = Integer.MAX_VALUE;
            byte var24 = 10;
            for (int var25 = arg9 - var24; var25 <= (arg9 + var24); var25++) {
                for (int var26 = arg13 - var24; var26 <= (arg13 + var24); var26++) {
                    int var27 = var25 - var17;
                    int var28 = var26 - var18;
                    if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class432.field6113[var27][var28] < 100) {
                        int var29 = 0;
                        if (var25 < arg9) {
                            var29 = arg9 - var25;
                        } else if (var25 > (arg4 + arg9 - 1)) {
                            var29 = var25 - (arg4 + arg9 - 1);
                        }
                        int var30 = 0;
                        if (arg13 > var26) {
                            var30 = arg13 - var26;
                        } else if (var26 > (arg13 + arg6 - 1)) {
                            var30 = var26 + 1 - arg6 - arg13;
                        }
                        int var31 = var29 * var29 + (var30 * var30);
                        if (var31 < var22 || var22 == var31 && class432.field6113[var27][var28] < var23) {
                            var20 = var26;
                            var23 = class432.field6113[var27][var28];
                            var19 = var25;
                            var22 = var31;
                        }
                    }
                }
            }
            if (~var22 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg3 == var19 && arg14 == var20) {
            return 0;
        }
        byte var32 = 0;
        class270.field3936[var32] = var19;
        int var38 = var32 + 1;
        class35.field374[var32] = var20;
        int var33;
        int var34 = var33 = class313.field4424[var19 - var17][var20 - var18];
        while (arg3 != var19 || arg14 != var20) {
            if (var33 != var34) {
                var33 = var34;
                class270.field3936[var38] = var19;
                class35.field374[var38++] = var20;
            }
            if ((var34 & 0x2) != 0) {
                var19++;
            } else if ((var34 & 0x8) != 0) {
                var19--;
            }
            if ((var34 & 0x1) != 0) {
                var20++;
            } else if ((var34 & 0x4) != 0) {
                var20--;
            }
            var34 = class313.field4424[var19 - var17][var20 - var18];
        }
        int var35 = 0;
        while (var38-- > 0) {
            arg10[var35] = class270.field3936[var38];
            arg12[var35++] = class35.field374[var38];
            if (var35 >= arg10.length) {
                break;
            }
        }
        return var35;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
    public class235(int arg0, int arg1) {
        this.field3412 = arg1;
        this.field3414 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Llh;I)V")
    public class235(class235 arg0, int arg1) {
        this.field3410 = arg0;
        this.field3414 = this.field3410.field3414;
        this.field3417 = this.field3410.field3417;
        this.field3412 = this.field3410.field3412 + arg1;
    }
}
