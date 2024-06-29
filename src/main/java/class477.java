import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class477 extends class120 {

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "Z")
    public static boolean field6698 = false;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Z")
    public static boolean field6701 = false;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public int field6693;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public int field6695;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public int field6697;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Lin;")
    public class54 field6694;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "[Lkt;")
    public class98[] field6696;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILnp;IZ)Z")
    private final boolean method2792(int arg0, class313 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field6696 = null;
        }
        field6700++;
        if (this.field6696 != null) {
            for (int var5 = 0; var5 < this.field6696.length; var5++) {
                if (this.field6696[var5].method561(arg0, arg2) && this.field6694.method113(arg0, 111, arg2, arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILnp;)V")
    public static final void method2793(int arg0, int arg1, int arg2, class313 arg3) {
        field6699++;
        if (arg2 < 0 || arg0 < 0 || class268.field3922 == 0 || class317.field4598 == 0) {
            return;
        }
        arg3.method604(class260.field3812, class353.field5093, class268.field3922, class317.field4598);
        arg3.method617(class243.field3626, class360.field5185, class268.field3922, class317.field4598);
        class282 var4 = arg3.method632();
        var4.method1008(class492.field6934, class79.field973, class349.field5056, class327.field4740, class329.field4767, class67.field857);
        arg3.method609(var4);
        if (class178.field2556 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg3.method687();
            int var8 = (arg2 - class260.field3812) * var7 / class268.field3922;
            int var9 = (arg0 - class353.field5093) * var7 / class317.field4598;
            int var10 = arg3.method608();
            int var11 = (arg2 - class260.field3812) * var10 / class268.field3922;
            int var12 = (arg0 - class353.field5093) * var10 / class317.field4598;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method1013(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method1013(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class58.field758 > var20 && var22 < class287.field4181) {
                    int var23 = class492.field6935.field4319;
                    if (var23 < 3 && (class413.field5813[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class178.field2556[var23].method1209(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class492.field6935.method918(false) - 1) * 64 + var19 >> 7;
                        var6 = class492.field6935.method918(false) * 64 + var21 - 64 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class36.field473 && (class328.field4745 & 0x40) != 0) {
                    class145 var24 = class441.method2598((byte) -127, class255.field3739, class40.field523);
                    if (var24 == null) {
                        class382.method2305(arg1 ^ 0xFFFFFF8C);
                    } else {
                        class265.method1633(48, -1, var5, var6, 0L, " ->", true, 500, class489.field6894, false, class22.field282);
                    }
                } else {
                    if (class456.field6416 == class410.field5756) {
                        class265.method1633(44, -1, var5, var6, 0L, "", true, 500, class447.field6187.method2065(-118, class326.field4711), false, -1);
                    }
                    class487.field6851++;
                    class265.method1633(47, -1, var5, var6, 0L, "", true, 500, class66.field846, false, -1);
                }
            }
        }
        class225 var25 = class437.field6070;
        if (arg1 != 1) {
            method2793(48, 36, 116, (class313) null);
        }
        for (class477 var26 = (class477) var25.method1449(118); var26 != null; var26 = (class477) var25.method1450(0)) {
            if (class492.field6935.field4319 == var26.field6695 && var26.method2792(arg2, arg3, arg0, true)) {
                if (var26.field6694 instanceof class452) {
                    class452 var27 = (class452) var26.field6694;
                    int var28 = var27.method918(false);
                    if ((var28 & 0x1) == 0 && (var27.field4331 & 0x7F) == 0 && (var27.field4317 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field4331 & 0x7F) == 64 && (var27.field4317 & 0x7F) == 64) {
                        int var29 = var27.field4331 - ((var27.method918(false) - 1) * 64);
                        int var30 = var27.field4317 + 64 - (var27.method918(false) * 64);
                        for (int var31 = 0; var31 < class225.field3418; var31++) {
                            class216 var38 = class139.field1851[class281.field4139[var31]];
                            if (var38 != null && class353.field5090 != var38.field2109 && var38.field2118) {
                                int var39 = var38.field4331 - (var38.field3232.field6573 - 1) * 64;
                                int var40 = var38.field4317 - ((var38.field3232.field6573 - 1) * 64);
                                if (var39 >= var29 && var38.field3232.field6573 <= var27.method918(false) - (var39 - var29 >> 7) && var30 <= var40 && var38.field3232.field6573 <= var27.method918(false) - (var40 - var30 >> 7)) {
                                    class124.method749(class492.field6935.field4319 != var26.field6695, var38, 256);
                                    var38.field2109 = class353.field5090;
                                }
                            }
                        }
                        int var32 = class37.field491;
                        int[] var33 = class348.field5033;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class452 var35 = class124.field1559[var33[var34]];
                            if (var35 != null && class353.field5090 != var35.field2109 && var27 != var35 && var35.field2118) {
                                int var36 = var35.field4331 - (var35.method918(false) - 1) * 64;
                                int var37 = var35.field4317 + 64 - var35.method918(false) * 64;
                                if (var36 >= var29 && var35.method918(false) <= (var27.method918(false) - (var36 - var29 >> 7)) && var37 >= var30 && var35.method918(false) <= var27.method918(false) - (var37 - var30 >> 7)) {
                                    class458.method2678(-1, class492.field6935.field4319 != var26.field6695, var35);
                                    var35.field2109 = class353.field5090;
                                }
                            }
                        }
                    }
                    if (class353.field5090 == var27.field2109) {
                        continue;
                    }
                    class458.method2678(-1, class492.field6935.field4319 != var26.field6695, var27);
                    var27.field2109 = class353.field5090;
                }
                if (var26.field6694 instanceof class216) {
                    class216 var41 = (class216) var26.field6694;
                    if (var41.field3232 != null) {
                        if ((var41.field3232.field6573 & 0x1) == 0 && (var41.field4331 & 0x7F) == 0 && (var41.field4317 & 0x7F) == 0 || (var41.field3232.field6573 & 0x1) == 1 && (var41.field4331 & 0x7F) == 64 && (var41.field4317 & 0x7F) == 64) {
                            int var42 = var41.field4331 - ((var41.field3232.field6573 - 1) * 64);
                            int var43 = var41.field4317 - ((var41.field3232.field6573 - 1) * 64);
                            for (int var44 = 0; var44 < class225.field3418; var44++) {
                                class216 var51 = class139.field1851[class281.field4139[var44]];
                                if (var51 != null && class353.field5090 != var51.field2109 && var41 != var51 && var51.field2118) {
                                    int var52 = var51.field4331 - (var51.field3232.field6573 * 64 - 64);
                                    int var53 = var51.field4317 - (var51.field3232.field6573 - 1) * 64;
                                    if (var52 >= var42 && var51.field3232.field6573 <= var41.field3232.field6573 - (var52 - var42 >> 7) && var53 >= var43 && var41.field3232.field6573 - (var53 - var43 >> 7) >= var51.field3232.field6573) {
                                        class124.method749(class492.field6935.field4319 != var26.field6695, var51, arg1 ^ 0x101);
                                        var51.field2109 = class353.field5090;
                                    }
                                }
                            }
                            int var45 = class37.field491;
                            int[] var46 = class348.field5033;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class452 var48 = class124.field1559[var46[var47]];
                                if (var48 != null && class353.field5090 != var48.field2109 && var48.field2118) {
                                    int var49 = var48.field4331 + 64 - (var48.method918(false) * 64);
                                    int var50 = var48.field4317 + 64 - (var48.method918(false) * 64);
                                    if (var49 >= var42 && var48.method918(false) <= (var41.field3232.field6573 - (var49 - var42 >> 7)) && var50 >= var43 && var48.method918(false) <= (var41.field3232.field6573 - (var50 - var43 >> 7))) {
                                        class458.method2678(arg1 ^ 0xFFFFFFFE, class492.field6935.field4319 != var26.field6695, var48);
                                        var48.field2109 = class353.field5090;
                                    }
                                }
                            }
                        }
                        if (class353.field5090 == var41.field2109) {
                            continue;
                        }
                        class124.method749(class492.field6935.field4319 != var26.field6695, var41, arg1 ^ 0x101);
                        var41.field2109 = class353.field5090;
                    }
                }
                if (var26.field6694 instanceof class286) {
                    class442 var54 = (class442) class269.field3928.method2761((long) (var26.field6693 | var26.field6697 << 14 | var26.field6695 << 28), (byte) -112);
                    if (var54 != null) {
                        for (class71 var55 = (class71) var54.field6126.method2847((byte) 86); var55 != null; var55 = (class71) var54.field6126.method2849(-44984953)) {
                            class41 var56 = class64.field834.method2129(var55.field885, false);
                            if (!class36.field473) {
                                if (class492.field6935.field4319 == var26.field6695) {
                                    String[] var57 = var56.field608;
                                    for (int var58 = 4; var58 >= 0; var58--) {
                                        if (var57 != null && var57[var58] != null) {
                                            byte var59 = 0;
                                            int var60 = class231.field3494;
                                            if (var58 == 0) {
                                                var59 = 57;
                                            }
                                            if (var58 == 1) {
                                                var59 = 17;
                                            }
                                            if (var58 == 2) {
                                                var59 = 50;
                                            }
                                            if (var58 == 3) {
                                                var59 = 51;
                                            }
                                            if (var58 == 4) {
                                                var59 = 13;
                                            }
                                            if (var56.field613 == var58) {
                                                var60 = var56.field606;
                                            }
                                            if (var56.field566 == var58) {
                                                var60 = var56.field609;
                                            }
                                            class265.method1633(var59, -1, var26.field6693, var26.field6697, (long) var55.field885, "<col=ff9040>" + var56.field538, true, arg1 + 499, var57[var58], false, var60);
                                            class139.field1843++;
                                        }
                                    }
                                }
                                class140.field1852++;
                                class265.method1633(1008, -1, var26.field6693, var26.field6697, (long) var55.field885, "<col=ff9040>" + var56.field538, true, arg1 + 499, class483.field6807.method2065(-119, class326.field4711), class492.field6935.field4319 != var26.field6695, class114.field1455);
                            } else if (class492.field6935.field4319 == var26.field6695) {
                                class467 var61 = class413.field5811 == -1 ? null : class408.field5734.method1541(-104, class413.field5811);
                                if ((class328.field4745 & 0x1) != 0 && (var61 == null || var56.method270(32, class413.field5811, var61.field6579) != var61.field6579)) {
                                    class157.field2328++;
                                    class265.method1633(5, -1, var26.field6693, var26.field6697, (long) var55.field885, class373.field5386 + " -> <col=ff9040>" + var56.field538, true, 500, class489.field6894, false, class22.field282);
                                }
                            }
                        }
                    }
                }
                if (var26.field6694 instanceof class106) {
                    class106 var62 = (class106) var26.field6694;
                    class453 var63 = class156.field2325.method808(var62.method106(12181), 0);
                    if (var63.field6306 != null) {
                        var63 = var63.method2655(72, class140.field1859);
                    }
                    if (var63 != null) {
                        if (!class36.field473) {
                            if (class492.field6935.field4319 == var26.field6695) {
                                String[] var64 = var63.field6346;
                                if (var64 != null) {
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        if (var64[var65] != null) {
                                            short var66 = 0;
                                            int var67 = class231.field3494;
                                            if (var65 == 0) {
                                                var66 = 60;
                                            }
                                            if (var65 == 1) {
                                                var66 = 19;
                                            }
                                            if (var65 == 2) {
                                                var66 = 21;
                                            }
                                            if (var65 == 3) {
                                                var66 = 25;
                                            }
                                            if (var65 == 4) {
                                                var66 = 1003;
                                            }
                                            if (var63.field6356 == var65) {
                                                var67 = var63.field6367;
                                            }
                                            if (var63.field6357 == var65) {
                                                var67 = var63.field6378;
                                            }
                                            class265.method1633(var66, -1, var26.field6693, var26.field6697, class403.method2404(-1560628959, var26.field6697, var62, var26.field6693), "<col=00ffff>" + var63.field6353, true, arg1 + 499, var64[var65], false, var67);
                                            class295.field4279++;
                                        }
                                    }
                                }
                            }
                            class265.method1633(1007, -1, var26.field6693, var26.field6697, (long) var63.field6343, "<col=00ffff>" + var63.field6353, true, 500, class483.field6807.method2065(57, class326.field4711), class492.field6935.field4319 != var26.field6695, class114.field1455);
                            class272.field3962++;
                        } else if (class492.field6935.field4319 == var26.field6695) {
                            class467 var68 = class413.field5811 == -1 ? null : class408.field5734.method1541(-123, class413.field5811);
                            if ((class328.field4745 & 0x4) != 0 && (var68 == null || var63.method2657(var68.field6579, class413.field5811, arg1 - 1) != var68.field6579)) {
                                class359.field5165++;
                                class265.method1633(49, -1, var26.field6693, var26.field6697, class403.method2404(arg1 ^ 0xA2FAB120, var26.field6697, var62, var26.field6693), class373.field5386 + " -> <col=00ffff>" + var63.field6353, true, 500, class489.field6894, false, class22.field282);
                            }
                        }
                    }
                }
            }
        }
    }
}
