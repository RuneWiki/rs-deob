import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class64 extends class312 {

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public int field967 = 0;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "[Lum;")
    public static class82[] field966 = new class82[2048];

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field974 = 0;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "[I")
    private static int[] field969 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lfn;")
    public static class269 field964 = new class269();

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Lbm;")
    public static class125 field971;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "Lwf;")
    public static class306 field978;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)I", line = 7)
    public static final int method457(boolean arg0, int arg1, int arg2) {
        field968++;
        class15 var3 = (class15) class247.field3868.method1558((long) arg2, arg0);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field154.length) {
            return var3.field154[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILgn;I)V", line = 26)
    private final void method458(int arg0, class303 arg1, int arg2) {
        field975++;
        if (arg2 == 2) {
            this.field967 = arg1.method1994(false);
        }
        if (arg0 >= -108) {
            field969 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)Z", line = 47)
    public static final boolean method459(int arg0, boolean arg1) {
        field965++;
        if (arg1) {
            method463(-8, (byte) -123);
        }
        return arg0 == 4 || arg0 == 8;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLgn;)V", line = 60)
    public final void method460(byte arg0, class303 arg1) {
        if (arg0 != -102) {
            return;
        }
        field972++;
        while (true) {
            int var3 = arg1.method2043((byte) -114);
            if (var3 == 0) {
                return;
            }
            this.method458(-115, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lsa;Z)V", line = 87)
    public static final void method461(class174 arg0, boolean arg1) {
        class113.field1731.method7((byte) -51, arg0);
        while (true) {
            class174 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class174[][] var7;
            class174 var78;
            do {
                class174 var77;
                do {
                    class174 var76;
                    do {
                        class174 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class174) class113.field1731.method12(109);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2643);
                                            var3 = var2.field2660;
                                            var4 = var2.field2665;
                                            var5 = var2.field2659;
                                            var6 = var2.field2649;
                                            var7 = class90.field1375[var5];
                                            float var8 = 0.0F;
                                            if (class333.field5166) {
                                                if (client.field2034 == class46.field655) {
                                                    int var9 = class150.field2367[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class90.field1379 != var10) {
                                                        class90.field1379 = var10;
                                                        class40.method290(16743972, var10);
                                                        class326.method2209(class124.method840((byte) 117));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class26.field341 != var11) {
                                                        class26.field341 = var11;
                                                        class265.method1756(-72, var11);
                                                    }
                                                    int var12 = class193.field2911[0][var3 + 1][var4] + class193.field2911[0][var3][var4] + class193.field2911[0][var3][var4 + 1] + class193.field2911[0][var3 + 1][var4 + 1] >> 2;
                                                    class174.method1179(3, -var12, (byte) 84);
                                                    var8 = 201.5F;
                                                    class333.method2305(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class333.method2305(var8);
                                                }
                                            }
                                            if (!var2.field2663) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class174 var13 = class90.field1375[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field2643) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class77.field1151 && var3 > class43.field607) {
                                                    class174 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field2643 && (var14.field2663 || (var2.field2661 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class77.field1151 && var3 < class194.field2929 - 1) {
                                                    class174 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field2643 && (var15.field2663 || (var2.field2661 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class335.field5208 && var4 > class96.field1468) {
                                                    class174 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field2643 && (var16.field2663 || (var2.field2661 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class335.field5208 && var4 < class272.field4184 - 1) {
                                                    class174 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field2643 && (var17.field2663 || (var2.field2661 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2663 = false;
                                            if (var2.field2647 != null) {
                                                class174 var18 = var2.field2647;
                                                if (class333.field5166) {
                                                    class333.method2305(201.5F - (float) (var18.field2649 + 1) * 50.0F);
                                                }
                                                if (var18.field2648 == null) {
                                                    if (var18.field2657 != null) {
                                                        if (class187.method1286(0, var3, var4)) {
                                                            class118.method808(var18.field2657, class230.field3721, class47.field671, class17.field194, class24.field309, var3, var4, true);
                                                        } else {
                                                            class118.method808(var18.field2657, class230.field3721, class47.field671, class17.field194, class24.field309, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class187.method1286(0, var3, var4)) {
                                                    class89.method611(var18.field2648, 0, class230.field3721, class47.field671, class17.field194, class24.field309, var3, var4, true);
                                                } else {
                                                    class89.method611(var18.field2648, 0, class230.field3721, class47.field671, class17.field194, class24.field309, var3, var4, false);
                                                }
                                                class157 var19 = var18.field2672;
                                                if (var19 != null) {
                                                    if (class333.field5166) {
                                                        if ((var19.field2453 & var2.field2652) == 0) {
                                                            class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                        } else {
                                                            class147.method1024(var19.field2453, class343.field5342, class99.field1542, class246.field3859, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field2454.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var19.field2452 - class343.field5342, var19.field2456 - class99.field1542, var19.field2458 - class246.field3859, var19.field2457, var5, (class243) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field2655; var20++) {
                                                    class272 var21 = var18.field2671[var20];
                                                    if (var21 != null) {
                                                        if (class333.field5166) {
                                                            class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                        }
                                                        var21.field4173.method111(var21.field4168, class230.field3721, class47.field671, class17.field194, class24.field309, var21.field4176 - class343.field5342, var21.field4179 - class99.field1542, var21.field4174 - class246.field3859, var21.field4183, var5, (class243) null);
                                                    }
                                                }
                                                if (class333.field5166) {
                                                    class333.method2305(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field2648 == null) {
                                                if (var2.field2657 != null) {
                                                    if (class187.method1286(var6, var3, var4)) {
                                                        class118.method808(var2.field2657, class230.field3721, class47.field671, class17.field194, class24.field309, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class118.method808(var2.field2657, class230.field3721, class47.field671, class17.field194, class24.field309, var3, var4, false);
                                                    }
                                                }
                                            } else if (class187.method1286(var6, var3, var4)) {
                                                class89.method611(var2.field2648, var6, class230.field3721, class47.field671, class17.field194, class24.field309, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field2648.field3364 != 12345678 || class230.field3717 && var5 <= class6.field68) {
                                                    class89.method611(var2.field2648, var6, class230.field3721, class47.field671, class17.field194, class24.field309, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class23 var23 = var2.field2667;
                                                if (var23 != null && (var23.field289 & 0x80000000L) != 0L) {
                                                    if (class333.field5166 && var23.field288) {
                                                        class333.method2305(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class333.field5166) {
                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                    }
                                                    var23.field285.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var23.field295 - class343.field5342, var23.field299 - class99.field1542, var23.field286 - class246.field3859, var23.field289, var5, (class243) null);
                                                    if (class333.field5166 && var23.field288) {
                                                        class333.method2305(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class157 var26 = var2.field2672;
                                            class152 var27 = var2.field2650;
                                            if (var26 != null || var27 != null) {
                                                if (class77.field1151 == var3) {
                                                    var24++;
                                                } else if (class77.field1151 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class335.field5208 == var4) {
                                                    var24 += 3;
                                                } else if (class335.field5208 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class338.field5228[var24];
                                                var2.field2652 = class82.field1233[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field2453 & class197.field2958[var24]) == 0) {
                                                    var2.field2669 = 0;
                                                } else if (var26.field2453 == 16) {
                                                    var2.field2669 = 3;
                                                    var2.field2668 = field969[var24];
                                                    var2.field2651 = 3 - var2.field2668;
                                                } else if (var26.field2453 == 32) {
                                                    var2.field2669 = 6;
                                                    var2.field2668 = class245.field3853[var24];
                                                    var2.field2651 = 6 - var2.field2668;
                                                } else if (var26.field2453 == 64) {
                                                    var2.field2669 = 12;
                                                    var2.field2668 = class63.field897[var24];
                                                    var2.field2651 = 12 - var2.field2668;
                                                } else {
                                                    var2.field2669 = 9;
                                                    var2.field2668 = class197.field2966[var24];
                                                    var2.field2651 = 9 - var2.field2668;
                                                }
                                                if ((var26.field2453 & var25) != 0 && !class115.method794(var6, var3, var4, var26.field2453)) {
                                                    if (class333.field5166) {
                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                    }
                                                    var26.field2454.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var26.field2452 - class343.field5342, var26.field2456 - class99.field1542, var26.field2458 - class246.field3859, var26.field2457, var5, (class243) null);
                                                }
                                                if ((var26.field2455 & var25) != 0 && !class115.method794(var6, var3, var4, var26.field2455)) {
                                                    if (class333.field5166) {
                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                    }
                                                    var26.field2451.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var26.field2452 - class343.field5342, var26.field2456 - class99.field1542, var26.field2458 - class246.field3859, var26.field2457, var5, (class243) null);
                                                }
                                            }
                                            if (var27 != null && !class256.method1724(var6, var3, var4, var27.field2405.method112())) {
                                                if (class333.field5166) {
                                                    class333.method2305(var8 - 0.5F);
                                                }
                                                if ((var27.field2403 & var25) != 0) {
                                                    if (class333.field5166) {
                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                    }
                                                    var27.field2405.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var27.field2398 + var27.field2404 - class343.field5342, var27.field2393 - class99.field1542, var27.field2396 + var27.field2389 - class246.field3859, var27.field2392, var5, (class243) null);
                                                } else if (var27.field2403 == 256) {
                                                    int var28 = var27.field2398 - class343.field5342;
                                                    int var29 = var27.field2393 - class99.field1542;
                                                    int var30 = var27.field2396 - class246.field3859;
                                                    int var31 = var27.field2390;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class333.field5166) {
                                                            class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                        }
                                                        var27.field2405.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var27.field2404 + var28, var29, var27.field2389 + var30, var27.field2392, var5, (class243) null);
                                                    } else if (var27.field2406 != null) {
                                                        if (class333.field5166) {
                                                            class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                        }
                                                        var27.field2406.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var28, var29, var30, var27.field2392, var5, (class243) null);
                                                    }
                                                }
                                                if (class333.field5166) {
                                                    class333.method2305(var8);
                                                }
                                            }
                                            if (var22) {
                                                class23 var34 = var2.field2667;
                                                if (var34 != null && (var34.field289 & 0x80000000L) == 0L) {
                                                    if (class333.field5166 && var34.field288) {
                                                        class333.method2305(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class333.field5166) {
                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                    }
                                                    var34.field285.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var34.field295 - class343.field5342, var34.field299 - class99.field1542, var34.field286 - class246.field3859, var34.field289, var5, (class243) null);
                                                    if (class333.field5166 && var34.field288) {
                                                        class333.method2305(var8);
                                                    }
                                                }
                                                class123 var35 = var2.field2656;
                                                if (var35 != null && var35.field1916 == 0) {
                                                    if (class333.field5166) {
                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                    }
                                                    if (var35.field1927 != null) {
                                                        var35.field1927.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var35.field1917 - class343.field5342, var35.field1915 - class99.field1542, var35.field1923 - class246.field3859, var35.field1930, var5, (class243) null);
                                                    }
                                                    if (var35.field1931 != null) {
                                                        var35.field1931.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var35.field1917 - class343.field5342, var35.field1915 - class99.field1542, var35.field1923 - class246.field3859, var35.field1930, var5, (class243) null);
                                                    }
                                                    if (var35.field1918 != null) {
                                                        var35.field1918.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var35.field1917 - class343.field5342, var35.field1915 - class99.field1542, var35.field1923 - class246.field3859, var35.field1930, var5, (class243) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field2661;
                                            if (var36 != 0) {
                                                if (var3 < class77.field1151 && (var36 & 0x4) != 0) {
                                                    class174 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field2643) {
                                                        class113.field1731.method7((byte) -51, var37);
                                                    }
                                                }
                                                if (var4 < class335.field5208 && (var36 & 0x2) != 0) {
                                                    class174 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field2643) {
                                                        class113.field1731.method7((byte) -51, var38);
                                                    }
                                                }
                                                if (var3 > class77.field1151 && (var36 & 0x1) != 0) {
                                                    class174 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field2643) {
                                                        class113.field1731.method7((byte) -51, var39);
                                                    }
                                                }
                                                if (var4 > class335.field5208 && (var36 & 0x8) != 0) {
                                                    class174 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field2643) {
                                                        class113.field1731.method7((byte) -51, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2669 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field2655; var42++) {
                                                if (class329.field5085 != var2.field2671[var42].field4175 && (var2.field2654[var42] & var2.field2669) == var2.field2668) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class157 var43 = var2.field2672;
                                                if (!class115.method794(var6, var3, var4, var43.field2453)) {
                                                    if (class333.field5166) {
                                                        label882: {
                                                            if ((var43.field2457 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field2452 - class343.field5342;
                                                                int var45 = var43.field2458 - class246.field3859;
                                                                int var46 = (int) (var43.field2457 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class84.field1276 - 1) {
                                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class228.field3650 - 1 && var4 < class84.field1276 - 1) {
                                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class228.field3650 - 1 && var4 > 0) {
                                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field2454.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var43.field2452 - class343.field5342, var43.field2456 - class99.field1542, var43.field2458 - class246.field3859, var43.field2457, var5, (class243) null);
                                                }
                                                var2.field2669 = 0;
                                            }
                                        }
                                        if (!var2.field2653) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field2655;
                                            var2.field2653 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class272 var50 = var2.field2671[var49];
                                                if (class329.field5085 != var50.field4175) {
                                                    for (int var51 = var50.field4169; var51 <= var50.field4185; var51++) {
                                                        for (int var52 = var50.field4186; var52 <= var50.field4181; var52++) {
                                                            class174 var53 = var7[var51][var52];
                                                            if (var53.field2663) {
                                                                var2.field2653 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field2669 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4169) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4185) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4186) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4181) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field2669) == var2.field2651) {
                                                                    var2.field2653 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class123.field1932[var48++] = var50;
                                                    int var55 = class77.field1151 - var50.field4169;
                                                    int var56 = var50.field4185 - class77.field1151;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class335.field5208 - var50.field4186;
                                                    int var58 = var50.field4181 - class335.field5208;
                                                    if (var58 > var57) {
                                                        var50.field4172 = var55 + var58;
                                                    } else {
                                                        var50.field4172 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class272 var62 = class123.field1932[var61];
                                                    if (class329.field5085 != var62.field4175) {
                                                        if (var62.field4172 > var59) {
                                                            var59 = var62.field4172;
                                                            var60 = var61;
                                                        } else if (var62.field4172 == var59) {
                                                            int var63 = var62.field4176 - class343.field5342;
                                                            int var64 = var62.field4174 - class246.field3859;
                                                            int var65 = class123.field1932[var60].field4176 - class343.field5342;
                                                            int var66 = class123.field1932[var60].field4174 - class246.field3859;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class272 var67 = class123.field1932[var60];
                                                var67.field4175 = class329.field5085;
                                                if (!class207.method1384(var6, var67.field4169, var67.field4185, var67.field4186, var67.field4181, var67.field4173.method112())) {
                                                    if (class333.field5166) {
                                                        if ((var67.field4183 & 0xFC000L) == 147456L) {
                                                            class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                                                            int var68 = var67.field4176 - class343.field5342;
                                                            int var69 = var67.field4174 - class246.field3859;
                                                            int var70 = (int) (var67.field4183 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class147.method1034(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class147.method1034(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class147.method1034(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class147.method1034(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class147.method1030(class343.field5342, class99.field1542, class246.field3859, var5, var67.field4169, var67.field4186, var67.field4185, var67.field4181);
                                                        }
                                                    }
                                                    var67.field4173.method111(var67.field4168, class230.field3721, class47.field671, class17.field194, class24.field309, var67.field4176 - class343.field5342, var67.field4179 - class99.field1542, var67.field4174 - class246.field3859, var67.field4183, var5, (class243) null);
                                                }
                                                for (int var71 = var67.field4169; var71 <= var67.field4185; var71++) {
                                                    for (int var72 = var67.field4186; var72 <= var67.field4181; var72++) {
                                                        class174 var73 = var7[var71][var72];
                                                        if (var73.field2669 != 0) {
                                                            class113.field1731.method7((byte) -51, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field2643) {
                                                            class113.field1731.method7((byte) -51, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2653) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field2653 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2643);
                            } while (var2.field2669 != 0);
                            if (var3 > class77.field1151 || var3 <= class43.field607) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field2643);
                        if (var3 < class77.field1151 || var3 >= class194.field2929 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field2643);
                    if (var4 > class335.field5208 || var4 <= class96.field1468) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field2643);
                if (var4 < class335.field5208 || var4 >= class272.field4184 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field2643);
            var2.field2643 = false;
            class63.field889--;
            class123 var79 = var2.field2656;
            if (var79 != null && var79.field1916 != 0) {
                if (class333.field5166) {
                    class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                }
                if (var79.field1927 != null) {
                    var79.field1927.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var79.field1917 - class343.field5342, var79.field1915 - class99.field1542 - var79.field1916, var79.field1923 - class246.field3859, var79.field1930, var5, (class243) null);
                }
                if (var79.field1931 != null) {
                    var79.field1931.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var79.field1917 - class343.field5342, var79.field1915 - class99.field1542 - var79.field1916, var79.field1923 - class246.field3859, var79.field1930, var5, (class243) null);
                }
                if (var79.field1918 != null) {
                    var79.field1918.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var79.field1917 - class343.field5342, var79.field1915 - class99.field1542 - var79.field1916, var79.field1923 - class246.field3859, var79.field1930, var5, (class243) null);
                }
            }
            if (var2.field2652 != 0) {
                class152 var80 = var2.field2650;
                if (var80 != null && !class256.method1724(var6, var3, var4, var80.field2405.method112())) {
                    if ((var80.field2403 & var2.field2652) != 0) {
                        if (class333.field5166) {
                            class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                        }
                        var80.field2405.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var80.field2398 + var80.field2404 - class343.field5342, var80.field2393 - class99.field1542, var80.field2396 + var80.field2389 - class246.field3859, var80.field2392, var5, (class243) null);
                    } else if (var80.field2403 == 256) {
                        int var81 = var80.field2398 - class343.field5342;
                        int var82 = var80.field2393 - class99.field1542;
                        int var83 = var80.field2396 - class246.field3859;
                        int var84 = var80.field2390;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class333.field5166) {
                                class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                            }
                            var80.field2405.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var80.field2404 + var81, var82, var80.field2389 + var83, var80.field2392, var5, (class243) null);
                        } else if (var80.field2406 != null) {
                            if (class333.field5166) {
                                class147.method1035(class343.field5342, class99.field1542, class246.field3859, var5, var3, var4);
                            }
                            var80.field2406.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var81, var82, var83, var80.field2392, var5, (class243) null);
                        }
                    }
                }
                class157 var87 = var2.field2672;
                if (var87 != null) {
                    if ((var87.field2455 & var2.field2652) != 0 && !class115.method794(var6, var3, var4, var87.field2455)) {
                        if (class333.field5166) {
                            class147.method1024(var87.field2455, class343.field5342, class99.field1542, class246.field3859, var6, var3, var4);
                        }
                        var87.field2451.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var87.field2452 - class343.field5342, var87.field2456 - class99.field1542, var87.field2458 - class246.field3859, var87.field2457, var5, (class243) null);
                    }
                    if ((var87.field2453 & var2.field2652) != 0 && !class115.method794(var6, var3, var4, var87.field2453)) {
                        if (class333.field5166) {
                            class147.method1024(var87.field2453, class343.field5342, class99.field1542, class246.field3859, var6, var3, var4);
                        }
                        var87.field2454.method111(0, class230.field3721, class47.field671, class17.field194, class24.field309, var87.field2452 - class343.field5342, var87.field2456 - class99.field1542, var87.field2458 - class246.field3859, var87.field2457, var5, (class243) null);
                    }
                }
            }
            if (var5 < class322.field5024 - 1) {
                class174 var88 = class90.field1375[var5 + 1][var3][var4];
                if (var88 != null && var88.field2643) {
                    class113.field1731.method7((byte) -51, var88);
                }
            }
            if (var3 < class77.field1151) {
                class174 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field2643) {
                    class113.field1731.method7((byte) -51, var89);
                }
            }
            if (var4 < class335.field5208) {
                class174 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field2643) {
                    class113.field1731.method7((byte) -51, var90);
                }
            }
            if (var3 > class77.field1151) {
                class174 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field2643) {
                    class113.field1731.method7((byte) -51, var91);
                }
            }
            if (var4 > class335.field5208) {
                class174 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field2643) {
                    class113.field1731.method7((byte) -51, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V", line = 1080)
    public static void method462(byte arg0) {
        if (arg0 != 20) {
            field970 = -96;
        }
        field978 = null;
        field971 = null;
        field964 = null;
        field966 = null;
        field969 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)I", line = 1108)
    public static final int method463(int arg0, byte arg1) {
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        field977++;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 >= -29 ? 50 : ~var7 & arg0;
    }
}
