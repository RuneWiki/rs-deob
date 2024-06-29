import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class582 extends class143 {

    @OriginalMember(owner = "client!jca", name = "D", descriptor = "Liq;")
    public class202 field8517;

    @OriginalMember(owner = "client!jca", name = "A", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!jca", name = "B", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!jca", name = "C", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lnea;IZIII[IIIIIIII[I)I")
    public static final int method3367(class538 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        field8515++;
        if (arg8 < 119) {
            method3367(null, -62, true, -104, 39, 9, null, -127, -71, 116, 80, -102, 8, -34, null);
        }
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class83.field1265[var15][var35] = 0;
                class259.field3714[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg11 == 1) {
            var16 = class454.method2640(arg3, 101, arg5, arg10, arg7, arg12, arg9, arg4, arg1, arg13, arg0);
        } else if (arg11 == 2) {
            var16 = class376.method2244(arg9, arg13, arg10, arg3, arg7, arg5, arg1, 8321, arg12, arg4, arg0);
        } else {
            var16 = class445.method2598(arg0, arg3, arg10, arg7, arg5, arg9, (byte) -96, arg13, arg1, arg11, arg12, arg4);
        }
        int var17 = arg13 - 64;
        int var18 = arg4 - 64;
        int var19 = class372.field5164;
        int var20 = class642.field9125;
        if (!var16) {
            if (!arg2) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg9 - var23; var24 <= arg9 + var23; var24++) {
                for (int var25 = arg7 - var23; var25 <= (arg7 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class259.field3714[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg9) {
                            var28 = arg9 - var24;
                        } else if (var24 > arg9 + arg12 - 1) {
                            var28 = 1 - (arg9 + arg12 - var24);
                        }
                        int var29 = 0;
                        if (arg7 > var25) {
                            var29 = arg7 - var25;
                        } else if (var25 > (arg5 + arg7 - 1)) {
                            var29 = var25 + 1 - arg7 - arg5;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class259.field3714[var26][var27]) {
                            var19 = var24;
                            var21 = var30;
                            var22 = class259.field3714[var26][var27];
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg13 == var19 && arg4 == var20) {
            return 0;
        }
        byte var31 = 0;
        class340.field4721[var31] = var19;
        int var37 = var31 + 1;
        class25.field345[var31] = var20;
        int var32;
        int var33 = var32 = class83.field1265[var19 - var17][var20 - var18];
        while (arg13 != var19 || arg4 != var20) {
            if (var32 != var33) {
                class340.field4721[var37] = var19;
                var32 = var33;
                class25.field345[var37++] = var20;
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
            var33 = class83.field1265[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg6[var34] = class340.field4721[var37];
            arg14[var34++] = class25.field345[var37];
            if (arg6.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method3368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field8514++;
        if (arg1 >= 1 && arg7 >= 1 && arg1 <= class430.field6136 - 2 && (class580.field8504 - 2) >= arg7) {
            int var9 = arg4;
            if (arg4 < 3 && class151.method1151(arg7, arg1, (byte) -49)) {
                var9 = arg4 + 1;
            }
            if (!class525.field7713.method3471(class76.field1182, false) && !class470.method2774(arg1, -118, arg7, class132.field2149, var9)) {
                return;
            }
            if (class541.field7946 == null) {
                return;
            }
            class583.field8545.method3835(arg7, class45.field609[arg4], class637.field9048, arg3, arg1, 4, arg4);
            if (arg2 >= 0) {
                boolean var10 = class525.field7713.field5962;
                class525.field7713.field5962 = true;
                class583.field8545.method3836(arg7, arg4, arg2, arg5, class45.field609[arg4], var9, 122, arg8, arg1, class637.field9048, arg0);
                class525.field7713.field5962 = var10;
            }
        }
        if (arg6 <= -114) {
            ;
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(III)Z")
    public static final boolean method3369(int arg0, int arg1, int arg2) {
        if (arg0 == -11610) {
            field8518++;
            return (arg1 & 0x21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)I")
    public static final int method3370(int arg0) {
        field8516++;
        return arg0 == -1 ? class199.method1396(true, false) : 119;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Liq;)V")
    public class582(class202 arg0) {
        this.field8517 = arg0;
    }
}
