import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class579 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field8182 = 0;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field8185 = 0;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lrv;I)Lwu;")
    public static final class390 method3364(class120 arg0, int arg1) {
        field8183++;
        int var2 = arg0.method898((byte) -111);
        class336 var3 = class329.method2126(true)[arg0.method842(arg1 ^ 0xFFFFF6AF)];
        class185 var4 = class674.method3822(true)[arg0.method842(2384)];
        int var5 = arg0.method838(true);
        int var6 = arg0.method838(true);
        return arg1 == -1 ? new class390(var2, var3, var4, var5, var6) : null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIILmja;[IIIZ[IIII)I")
    public static final int method3365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class438 arg6, int[] arg7, int arg8, int arg9, boolean arg10, int[] arg11, int arg12, int arg13, int arg14) {
        if (arg1 != -129) {
            return 1;
        }
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class614.field8676[var15][var35] = 0;
                class298.field4492[var15][var35] = 99999999;
            }
        }
        field8184++;
        boolean var16;
        if (arg13 == 1) {
            var16 = class535.method3099(arg12, arg2, arg14, arg3, arg0, arg4, arg9, arg6, arg8, arg5, true);
        } else if (arg13 == 2) {
            var16 = class647.method3698(arg3, arg6, arg9, arg5, arg4, arg8, arg2, arg0, arg12, 14552, arg14);
        } else {
            var16 = class619.method3538(-1, arg9, arg13, arg5, arg12, arg4, arg2, arg3, arg0, arg6, arg14, arg8);
        }
        int var17 = arg4 - 64;
        int var18 = arg12 - 64;
        int var19 = class767.field10596;
        int var20 = class689.field9749;
        if (!var16) {
            if (!arg10) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg0 - var23; var24 <= arg0 + var23; var24++) {
                for (int var25 = arg14 - var23; var25 <= arg14 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class298.field4492[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg0 > var24) {
                            var28 = arg0 - var24;
                        } else if ((arg0 + arg3 - 1) < var24) {
                            var28 = -arg3 - (arg0 - var24 - 1);
                        }
                        int var29 = 0;
                        if (var25 < arg14) {
                            var29 = arg14 - var25;
                        } else if (var25 > arg2 + arg14 - 1) {
                            var29 = var25 + 1 - arg2 - arg14;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class298.field4492[var26][var27]) {
                            var20 = var25;
                            var19 = var24;
                            var21 = var30;
                            var22 = class298.field4492[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg4 == var19 && arg12 == var20) {
            return 0;
        }
        byte var31 = 0;
        class696.field9832[var31] = var19;
        int var37 = var31 + 1;
        class58.field822[var31] = var20;
        int var32;
        int var33 = var32 = class614.field8676[var19 - var17][var20 - var18];
        while (arg4 != var19 || arg12 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class696.field9832[var37] = var19;
                class58.field822[var37++] = var20;
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
            var33 = class614.field8676[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg7[var34] = class696.field9832[var37];
            arg11[var34++] = class58.field822[var37];
            if (arg7.length <= var34) {
                break;
            }
        }
        return var34;
    }
}
