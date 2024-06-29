import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class543 extends class622 {

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "Luv;")
    public static class3 field7578 = new class3(71, 3);

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lgaa;ILkr;)V")
    public static final void method3008(class279 arg0, int arg1, class329 arg2) {
        class77.field1048 = arg0;
        class191.field2473 = "";
        class68.field897 = arg2;
        field7577++;
        if (class279.field3649.startsWith("win")) {
            class191.field2473 = class191.field2473 + "windows/";
        } else if (class279.field3649.startsWith("linux")) {
            class191.field2473 = class191.field2473 + "linux/";
        } else if (class279.field3649.startsWith("mac")) {
            class191.field2473 = class191.field2473 + "macos/";
        }
        if (arg1 > -122) {
            return;
        }
        if (class279.field3639 == 2) {
            class191.field2473 = class191.field2473 + "msjava/";
        } else if (class279.field3643.startsWith("amd64") || class279.field3643.startsWith("x86_64")) {
            class191.field2473 = class191.field2473 + "x86_64/";
        } else if (class279.field3643.startsWith("i386") || class279.field3643.startsWith("i486") || class279.field3643.startsWith("i586") || class279.field3643.startsWith("x86")) {
            class191.field2473 = class191.field2473 + "x86/";
        } else if (class279.field3643.startsWith("ppc")) {
            class191.field2473 = class191.field2473 + "ppc/";
        } else {
            class191.field2473 = class191.field2473 + "universal/";
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIII[IZIIIILfd;I[II)I")
    public static final int method3009(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, class143 arg11, int arg12, int[] arg13, int arg14) {
        field7579++;
        if (arg9 != -1) {
            field7580 = 23;
        }
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class76.field1042[var15][var35] = 0;
                class296.field3838[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg1 == 1) {
            var16 = class403.method2410(arg11, arg0, arg10, arg3, arg7, 26128, arg4, arg12, arg14, arg2, arg8);
        } else if (arg1 == 2) {
            var16 = class235.method1485(arg8, arg4, arg14, arg0, arg7, arg9 ^ 0x43A8, arg10, arg2, arg3, arg11, arg12);
        } else {
            var16 = class640.method3687(arg4, arg3, arg11, arg1, (byte) 110, arg10, arg0, arg2, arg8, arg12, arg7, arg14);
        }
        int var17 = arg12 - 64;
        int var18 = arg2 - 64;
        int var19 = class54.field725;
        int var20 = class95.field1284;
        if (!var16) {
            if (!arg6) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg14 - var23; var24 <= (arg14 + var23); var24++) {
                for (int var25 = arg7 - var23; var25 <= (arg7 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class296.field3838[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg14) {
                            var28 = arg14 - var24;
                        } else if (arg3 + arg14 - 1 < var24) {
                            var28 = 1 - arg3 - (arg14 - var24);
                        }
                        int var29 = 0;
                        if (var25 < arg7) {
                            var29 = arg7 - var25;
                        } else if (var25 > arg0 + arg7 - 1) {
                            var29 = 1 - (arg7 + arg0 - var25);
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var21 > var30 || var21 == var30 && class296.field3838[var26][var27] < var22) {
                            var21 = var30;
                            var19 = var24;
                            var20 = var25;
                            var22 = class296.field3838[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg12 == var19 && arg2 == var20) {
            return 0;
        }
        byte var31 = 0;
        class599.field8663[var31] = var19;
        int var37 = var31 + 1;
        class424.field5744[var31] = var20;
        int var32;
        int var33 = var32 = class76.field1042[var19 - var17][var20 - var18];
        while (arg12 != var19 || arg2 != var20) {
            if (var32 != var33) {
                class599.field8663[var37] = var19;
                var32 = var33;
                class424.field5744[var37++] = var20;
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
            var33 = class76.field1042[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg13[var34] = class599.field8663[var37];
            arg5[var34++] = class424.field5744[var37];
            if (var34 >= arg13.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
    public static void method3010(byte arg0) {
        if (arg0 != -21) {
            field7580 = -28;
        }
        field7578 = null;
    }
}
