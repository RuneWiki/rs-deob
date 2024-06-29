import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class79 implements Runnable {

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[Ldg;")
    public volatile class140[] field1477 = new class140[2];

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Z")
    public volatile boolean field1475 = false;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Z")
    public volatile boolean field1471 = false;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
    public static int[] field1469 = new int[32];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Z")
    public static boolean field1472 = false;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[I")
    public static int[] field1467 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lid;")
    private static class149 field1479 = class60.method382("Please wait )2 attempting to reestablish)3", (byte) 42);

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lid;")
    public static class149 field1478 = field1479;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Ldg;")
    public static class140 field1476;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lfb;")
    public class29 field1466;

    @OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
    public final void run() {
        this.field1471 = true;
        try {
            while (!this.field1475) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class140 var2 = this.field1477[var1];
                    if (var2 != null) {
                        var2.method982(false);
                    }
                }
                class151.method1074(-108, 10L);
                class147.method1012(-3, (Object) null, this.field1466);
            }
        } catch (Exception var9) {
            class100.method720(var9, (String) null, 1);
        } finally {
            Object var6 = null;
            this.field1471 = false;
        }
        field1470++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lal;I)V")
    public static final void method597(class230 arg0, int arg1) {
        class216.field3810 = arg0.method1550((byte) 106, class156.field2874);
        field1468++;
        class191.field3422 = arg0.method1550((byte) 70, class143.field2604);
        class155.field2839 = arg0.method1550((byte) -116, class103.field1810);
        class252.field4424 = arg0.method1550((byte) -120, class248.field4354);
        if (arg1 < 25) {
            return;
        }
        class214.field3784 = arg0.method1550((byte) 13, class101.field1777);
        class155.field2841 = arg0.method1550((byte) -119, class156.field2870);
        class176.field3229 = arg0.method1550((byte) -114, class14.field200);
        class115.field1968 = arg0.method1550((byte) -123, class8.field95);
        class195.field3505 = arg0.method1550((byte) 72, class67.field1176);
        class161.field2996 = arg0.method1550((byte) -122, class73.field1271);
        class97.field1730 = arg0.method1550((byte) -120, class222.field3888);
        class50.field904 = arg0.method1550((byte) 126, class183.field3315);
        class192.field3445 = arg0.method1550((byte) -127, class176.field3220);
        class126.field2217 = arg0.method1550((byte) 126, class200.field3637);
        class259.field4554 = arg0.method1550((byte) -121, class49.field890);
        class113.field1933 = arg0.method1550((byte) 50, class180.field3241);
        class258.field4518 = arg0.method1550((byte) -123, class182.field3291);
        class272.field4899 = arg0.method1550((byte) 94, class28.field415);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method598(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1474++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class244.field4291[var12][var31] = 0;
                class3.field40[var12][var31] = 99999999;
            }
        }
        class244.field4291[arg6][arg1] = 99;
        int var13 = arg6;
        class3.field40[arg6][arg1] = 0;
        int var14 = arg1;
        byte var15 = 0;
        class16.field231[var15] = arg6;
        int var32 = var15 + 1;
        class119.field2032[var15] = arg1;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class228.field3989[class277.field4948].field1856;
        while (var32 != var16) {
            var13 = class16.field231[var16];
            var14 = class119.field2032[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg4 == var13 && arg7 == var14) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class228.field3989[class277.field4948].method757(arg3 - 1, var13, 2, arg4, -101, var14, arg7, arg8)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class228.field3989[class277.field4948].method764(arg4, 2, arg3 - 1, (byte) -107, arg7, arg8, var13, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg9 != 0 && class228.field3989[class277.field4948].method766(var13, arg4, arg7, arg9, arg11, arg5, arg2 + 25428, 2, var14)) {
                var17 = true;
                break;
            }
            int var30 = class3.field40[var13][var14] + 1;
            if (var13 > 0 && class244.field4291[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class16.field231[var32] = var13 - 1;
                class119.field2032[var32] = var14;
                class244.field4291[var13 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class3.field40[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class244.field4291[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class16.field231[var32] = var13 + 1;
                class119.field2032[var32] = var14;
                class244.field4291[var13 + 1][var14] = 8;
                class3.field40[var13 + 1][var14] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && class244.field4291[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class16.field231[var32] = var13;
                class119.field2032[var32] = var14 - 1;
                class244.field4291[var13][var14 - 1] = 1;
                class3.field40[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class244.field4291[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class16.field231[var32] = var13;
                class119.field2032[var32] = var14 + 1;
                class244.field4291[var13][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class3.field40[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class244.field4291[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class16.field231[var32] = var13 - 1;
                class119.field2032[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class244.field4291[var13 - 1][var14 - 1] = 3;
                class3.field40[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class244.field4291[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class16.field231[var32] = var13 + 1;
                class119.field2032[var32] = var14 - 1;
                class244.field4291[var13 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class3.field40[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class244.field4291[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class16.field231[var32] = var13 - 1;
                class119.field2032[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class244.field4291[var13 - 1][var14 + 1] = 6;
                class3.field40[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class244.field4291[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class16.field231[var32] = var13 + 1;
                class119.field2032[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class244.field4291[var13 + 1][var14 + 1] = 12;
                class3.field40[var13 + 1][var14 + 1] = var30;
            }
        }
        class167.field3092 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg4 - var21; var22 <= arg4 + var21; var22++) {
                for (int var23 = arg7 - var21; var23 <= arg7 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class3.field40[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg4 > var22) {
                            var24 = arg4 - var22;
                        } else if (var22 > arg5 + arg4 - 1) {
                            var24 = var22 + 1 - arg4 - arg5;
                        }
                        int var25 = 0;
                        if (arg7 > var23) {
                            var25 = arg7 - var23;
                        } else if (var23 > arg7 - (1 - arg9)) {
                            var25 = 1 - arg9 - (arg7 - var23);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var20 || var20 == var26 && var19 > class3.field40[var22][var23]) {
                            var13 = var22;
                            var20 = var26;
                            var14 = var23;
                            var19 = class3.field40[var22][var23];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg6 == var13 && arg1 == var14) {
                return false;
            }
            class167.field3092 = 1;
        }
        byte var27 = 0;
        if (arg2 != -11) {
            return false;
        }
        class16.field231[var27] = var13;
        int var33 = var27 + 1;
        class119.field2032[var27] = var14;
        int var28;
        int var29 = var28 = class244.field4291[var13][var14];
        while (arg6 != var13 || arg1 != var14) {
            if (var28 != var29) {
                class16.field231[var33] = var13;
                var28 = var29;
                class119.field2032[var33++] = var14;
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
            var29 = class244.field4291[var13][var14];
        }
        if (var33 > 0) {
            class271.method1882(var33, arg2 ^ 0x8, arg10);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1479 = null;
        if (arg0 != -1) {
            field1467 = null;
        }
        field1476 = null;
        field1478 = null;
        field1467 = null;
        field1469 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
    public static final int method600(int arg0) {
        field1473++;
        if (arg0 <= 44) {
            method599(113);
        }
        return 0;
    }
}
