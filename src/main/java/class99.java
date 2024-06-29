import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class99 extends RuntimeException {

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Ljava/lang/String;")
    public String field2392;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2383;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lad;")
    private static class5 field2387 = class88.method674("Cancel", 36);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
    public static boolean field2384 = false;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[[[I")
    public static int[][][] field2391 = new int[4][13][13];

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lad;")
    public static class5 field2389 = field2387;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lbb;")
    public static class9 field2388 = new class9(50);

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2400 = 2;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lad;")
    private static class5 field2395 = class88.method674("To play on this world move to a free area first", -127);

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lad;")
    private static class5 field2402 = class88.method674("Loading interfaces )2 ", -94);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lad;")
    private static class5 field2396 = class88.method674("Off", 102);

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lad;")
    public static class5 field2399 = field2395;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Lad;")
    public static class5 field2398 = class88.method674(" @whi@(X", 21);

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lad;")
    public static class5 field2401 = field2396;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lad;")
    public static class5 field2405 = class88.method674("titlebox", 117);

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lad;")
    public static class5 field2404 = field2402;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field2406 = 0;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lsa;")
    public static class109 field2397;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lub;")
    public static class122 field2386;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "[I")
    public static int[] field2403;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLab;)V", line = 3)
    public static final void method793(byte arg0, class3 arg1) {
        arg1.field107 = 0;
        field2393++;
        if (arg1.field79 == 0) {
            arg1.field47 = 1024;
        }
        if (arg1.field79 == 1) {
            arg1.field47 = 1536;
        }
        if (arg1.field79 == 2) {
            arg1.field47 = 0;
        }
        int var2 = arg1.field84 * 64 + arg1.field67 * 128;
        int var3 = arg1.field102 - class69.field1636;
        int var4 = arg1.field84 * 64 + arg1.field106 * 128;
        if (arg1.field79 == 3) {
            arg1.field47 = 512;
        }
        arg1.field112 += (var2 - arg1.field112) / var3;
        arg1.field120 += (var4 - arg1.field120) / var3;
        if (arg0 != -105) {
            method797((byte) -11);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 40)
    public static void method794(boolean arg0) {
        if (!arg0) {
            method795(13, -69, 94, 61, 39, 29, -128, null, 51, -98);
        }
        field2387 = null;
        field2398 = null;
        field2401 = null;
        field2405 = null;
        field2404 = null;
        field2389 = null;
        field2391 = null;
        field2395 = null;
        field2388 = null;
        field2396 = null;
        field2386 = null;
        field2402 = null;
        field2403 = null;
        field2397 = null;
        field2399 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII[Lrc;II)V", line = 81)
    public static final void method795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class105[] arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class105 var11 = arg7[var10];
            if (var11 != null && (var11.field2630 == 0 || var11.field2563) && var11 != null && var11.field2575 == arg2 && (!var11.field2552 || class14.field393)) {
                int var12 = var11.field2640 + arg4;
                if (!var11.field2626) {
                    var12 -= arg5;
                }
                int var13 = var11.field2537 + arg9;
                if (!var11.field2626) {
                    var13 -= arg3;
                }
                int var14 = var11.field2636 + var12;
                int var15 = var11.field2611 + var13;
                int var16 = arg4 < var12 ? var12 : arg4;
                int var17 = arg9 >= var13 ? arg9 : var13;
                int var18 = var14 < arg0 ? var14 : arg0;
                int var19 = arg6 > var15 ? var15 : arg6;
                if (var11.field2630 == 0) {
                    method795(var18, arg1, var10, var11.field2547, var16, var11.field2605, var19, arg7, 19670, var17);
                    if (var11.field2562 != null) {
                        method795(var18, arg1, var11.field2568, var11.field2547, var16, var11.field2605, var19, var11.field2562, arg8, var17);
                    }
                }
                if (var11.field2563) {
                    boolean var20 = false;
                    boolean var21;
                    if (class22.field564 >= var16 && var17 <= class91.field2131 && var18 > class22.field564 && var19 > class91.field2131) {
                        var21 = true;
                    } else {
                        var21 = false;
                    }
                    if (class54.field1346 == 1 && var21) {
                        var20 = true;
                    }
                    boolean var22 = false;
                    if (class90.field2126 == 1 && var16 <= class4.field124 && class104.field2524 >= var17 && class4.field124 < var18 && var19 > class104.field2524) {
                        var22 = true;
                    }
                    if (var11.field2581 != -1 && var20 && class90.field2120 == null) {
                        class90.field2120 = var11;
                        class23.field591 = class91.field2131;
                        field2406 = class22.field564;
                    }
                    if (class90.field2120 != null) {
                        var20 = false;
                        var21 = false;
                        var22 = false;
                    }
                    if (!var11.field2556 && var22 && (arg1 & 0x1) != 0) {
                        var11.field2556 = true;
                        if (var11.field2610 != null) {
                            class50.method428(class104.field2524 - var13, -var12 + class4.field124, var11, var11.field2610, -4073, 0);
                        }
                    }
                    if (var11.field2556 && var20 && (arg1 & 0x4) != 0 && var11.field2594 != null) {
                        class50.method428(class91.field2131 - var13, -var12 + class22.field564, var11, var11.field2594, arg8 ^ 0xFFFFBCC1, 0);
                    }
                    if (var11.field2556 && !var20 && (arg1 & 0x2) != 0) {
                        var11.field2556 = false;
                        if (var11.field2592 != null) {
                            class50.method428(class91.field2131 - var13, class22.field564 - var12, var11, var11.field2592, arg8 - 23743, 0);
                        }
                    }
                    if (var20 && (arg1 & 0x8) != 0 && var11.field2553 != null) {
                        class50.method428(class91.field2131 - var13, -var12 + class22.field564, var11, var11.field2553, -4073, 0);
                    }
                    if (!var11.field2555 && var21 && (arg1 & 0x10) != 0) {
                        var11.field2555 = true;
                        if (var11.field2632 != null) {
                            class50.method428(class91.field2131 - var13, class22.field564 - var12, var11, var11.field2632, -4073, 0);
                        }
                    }
                    if (var11.field2555 && var21 && (arg1 & 0x40) != 0 && var11.field2551 != null) {
                        class50.method428(class91.field2131 - var13, class22.field564 - var12, var11, var11.field2551, arg8 - 23743, 0);
                    }
                    if (var11.field2555 && !var21 && (arg1 & 0x20) != 0) {
                        var11.field2555 = false;
                        if (var11.field2600 != null) {
                            class50.method428(class91.field2131 - var13, class22.field564 - var12, var11, var11.field2600, arg8 - 23743, 0);
                        }
                    }
                    if (var11.field2572 != null && (arg1 & 0x80) != 0) {
                        class50.method428(0, 0, var11, var11.field2572, -4073, 0);
                    }
                    if (class69.field1636 == class14.field403 && var11.field2593 != null && (arg1 & 0x100) != 0) {
                        class50.method428(0, 0, var11, var11.field2593, arg8 - 23743, 0);
                    }
                }
            }
        }
        field2390++;
        if (arg8 != 19670) {
            field2398 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lrd;III)Luc;", line = 261)
    public static final class123 method796(class106 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 7) {
            field2404 = null;
        }
        field2385++;
        return class5.method76((byte) -123, arg1, arg0, arg2) ? class60.method492((byte) -78) : null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 275)
    public static final void method797(byte arg0) {
        field2394++;
        if (class4.field139 == 114) {
            int var1 = class36.field907.method330(-30864);
            int var2 = (var1 >> 4 & 0x7) + class10.field330;
            int var3 = (var1 & 0x7) + class16.field431;
            int var4 = class36.field907.method343((byte) -6);
            int var5 = class36.field907.method330(-30864);
            int var6 = class36.field907.method343((byte) -6);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var7 = var2 * 128 + 64;
                int var8 = var3 * 128 + 64;
                class33 var9 = new class33(var4, class54.field1344, var7, var8, class95.method730(60, var7, class54.field1344, var8) - var5, var6, class69.field1636);
                class20.field525.method176(var9, -19597);
            }
        } else if (class4.field139 == 66) {
            int var10 = class36.field907.method336(241465648);
            int var11 = class36.field907.method330(-30864);
            int var12 = (var11 >> 4 & 0x7) + class10.field330;
            int var13 = (var11 & 0x7) + class16.field431;
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class23 var14 = class22.field559[class54.field1344][var12][var13];
                if (var14 != null) {
                    for (class4 var15 = (class4) var14.method180(0); var15 != null; var15 = (class4) var14.method181(0)) {
                        if ((var10 & 0x7FFF) == var15.field132) {
                            var15.method114(-3789);
                            break;
                        }
                    }
                    if (var14.method180(0) == null) {
                        class22.field559[class54.field1344][var12][var13] = null;
                    }
                    class43.method360(var12, var13, 87);
                }
            }
        } else if (class4.field139 == 168) {
            int var16 = class36.field907.method330(-30864);
            int var17 = (var16 & 0x7) + class16.field431;
            int var18 = (var16 >> 4 & 0x7) + class10.field330;
            int var19 = var18 + class36.field907.method318(-1);
            int var20 = class36.field907.method318(-1) + var17;
            int var21 = class36.field907.method329(-16621);
            int var22 = class36.field907.method343((byte) -6);
            int var23 = class36.field907.method330(-30864) * 4;
            int var24 = class36.field907.method330(-30864) * 4;
            int var25 = class36.field907.method343((byte) -6);
            int var26 = class36.field907.method343((byte) -6);
            int var27 = class36.field907.method330(-30864);
            int var28 = class36.field907.method330(-30864);
            if (var18 >= 0 && var17 >= 0 && var18 < 104 && var17 < 104 && var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104 && var22 != 65535) {
                int var29 = var20 * 128 + 64;
                int var30 = var19 * 128 + 64;
                int var31 = var17 * 128 + 64;
                int var32 = var18 * 128 + 64;
                class128 var33 = new class128(var22, class54.field1344, var32, var31, class95.method730(60, var32, class54.field1344, var31) - var23, class69.field1636 + var25, class69.field1636 + var26, var27, var28, var21, var24);
                var33.method988(var30, class69.field1636 + var25, -var24 + class95.method730(60, var30, class54.field1344, var29), 123, var29);
                class39.field1015.method176(var33, -19597);
            }
        } else {
            if (class4.field139 == 208) {
                int var34 = class36.field907.method323(-14837);
                int var35 = class36.field907.method343((byte) -6);
                int var36 = class36.field907.method335((byte) -16);
                int var37 = var36 >> 2;
                int var38 = class75.field1799[var37];
                byte var39 = class36.field907.method296(false);
                byte var40 = class36.field907.method296(false);
                int var41 = var36 & 0x3;
                int var42 = class36.field907.method336(241465648);
                int var43 = class36.field907.method336(241465648);
                byte var44 = class36.field907.method296(false);
                int var45 = class36.field907.method330(-30864);
                int var46 = (var45 >> 4 & 0x7) + class10.field330;
                int var47 = class16.field431 + (var45 & 0x7);
                byte var48 = class36.field907.method318(-1);
                class112 var49;
                if (class132.field3199 == var43) {
                    var49 = class82.field1932;
                } else {
                    var49 = class7.field251[var43];
                }
                if (var49 != null) {
                    class70 var50 = class42.method357(var34, (byte) -42);
                    int var51 = class42.field1062[class54.field1344][var46][var47];
                    int var52 = class42.field1062[class54.field1344][var46 + 1][var47];
                    int var53 = class42.field1062[class54.field1344][var46 + 1][var47 + 1];
                    int var54 = class42.field1062[class54.field1344][var46][var47 + 1];
                    class45 var55 = var50.method549(var52, true, var51, var54, var37, var53, var41);
                    if (var55 != null) {
                        if (var48 > var39) {
                            byte var56 = var48;
                            var48 = var39;
                            var39 = var56;
                        }
                        if (var40 > var44) {
                            byte var57 = var40;
                            var40 = var44;
                            var44 = var57;
                        }
                        class94.method723(var47, var35 + 1, 0, -1, var42 + 1, class54.field1344, 0, var38, var46, 10614);
                        var49.field2809 = class69.field1636 + var35;
                        int var58 = var50.field1693;
                        int var59 = var50.field1705;
                        var49.field2784 = var55;
                        var49.field2795 = class69.field1636 + var42;
                        if (var41 == 1 || var41 == 3) {
                            var58 = var50.field1705;
                            var59 = var50.field1693;
                        }
                        var49.field2792 = var46 * 128 + var59 * 64;
                        var49.field2806 = var47 * 128 + var58 * 64;
                        var49.field2818 = class95.method730(60, var49.field2792, class54.field1344, var49.field2806);
                        var49.field2785 = var46 + var48;
                        var49.field2793 = var44 + var47;
                        var49.field2800 = var40 + var47;
                        var49.field2799 = var39 + var46;
                    }
                }
            }
            if (class4.field139 == 215) {
                int var60 = class36.field907.method336(241465648);
                int var61 = class36.field907.method323(-14837);
                int var62 = class36.field907.method330(-30864);
                int var63 = (var62 >> 4 & 0x7) + class10.field330;
                int var64 = (var62 & 0x7) + class16.field431;
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    class4 var65 = new class4();
                    var65.field137 = var60;
                    var65.field132 = var61;
                    if (class22.field559[class54.field1344][var63][var64] == null) {
                        class22.field559[class54.field1344][var63][var64] = new class23();
                    }
                    class22.field559[class54.field1344][var63][var64].method176(var65, -19597);
                    class43.method360(var63, var64, 61);
                }
            } else if (class4.field139 == 56) {
                int var66 = class36.field907.method305((byte) -92);
                int var67 = var66 >> 2;
                int var68 = class75.field1799[var67];
                int var69 = class36.field907.method335((byte) -16);
                int var70 = var66 & 0x3;
                int var71 = (var69 >> 4 & 0x7) + class10.field330;
                int var72 = (var69 & 0x7) + class16.field431;
                int var73 = class36.field907.method336(241465648);
                if (var71 >= 0 && var72 >= 0 && var71 < 103 && var72 < 103) {
                    int var74 = class42.field1062[class54.field1344][var71][var72];
                    int var75 = class42.field1062[class54.field1344][var71 + 1][var72];
                    int var76 = class42.field1062[class54.field1344][var71 + 1][var72 + 1];
                    int var77 = class42.field1062[class54.field1344][var71][var72 + 1];
                    if (var68 == 0) {
                        class7 var78 = class42.field1065.method746(class54.field1344, var71, var72);
                        if (var78 != null) {
                            int var79 = var78.field254 >> 14 & 0x7FFF;
                            if (var67 == 2) {
                                var78.field258 = new class134(var79, 2, var70 + 4, var74, var75, var76, var77, var73, false);
                                var78.field250 = new class134(var79, 2, var70 + 1 & 0x3, var74, var75, var76, var77, var73, false);
                            } else {
                                var78.field258 = new class134(var79, var67, var70, var74, var75, var76, var77, var73, false);
                            }
                        }
                    }
                    if (var68 == 1) {
                        class63 var80 = class42.field1065.method782(class54.field1344, var71, var72);
                        if (var80 != null) {
                            var80.field1531 = new class134(var80.field1524 >> 14 & 0x7FFF, 4, 0, var74, var75, var76, var77, var73, false);
                        }
                    }
                    if (var68 == 2) {
                        class54 var81 = class42.field1065.method778(class54.field1344, var71, var72);
                        if (var67 == 11) {
                            var67 = 10;
                        }
                        if (var81 != null) {
                            var81.field1367 = new class134(var81.field1371 >> 14 & 0x7FFF, var67, var70, var74, var75, var76, var77, var73, false);
                        }
                    }
                    if (var68 == 3) {
                        class32 var82 = class42.field1065.method773(class54.field1344, var71, var72);
                        if (var82 != null) {
                            var82.field781 = new class134(var82.field770 >> 14 & 0x7FFF, 22, var70, var74, var75, var76, var77, var73, false);
                        }
                    }
                }
            } else {
                int var83 = 14 / ((arg0 + 29) / 36);
                if (class4.field139 == 92) {
                    int var84 = class36.field907.method323(-14837);
                    int var85 = class36.field907.method335((byte) -16);
                    int var86 = var85 >> 2;
                    int var87 = var85 & 0x3;
                    int var88 = class75.field1799[var86];
                    int var89 = class36.field907.method305((byte) -92);
                    int var90 = class10.field330 + (var89 >> 4 & 0x7);
                    int var91 = (var89 & 0x7) + class16.field431;
                    if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                        class94.method723(var91, 0, var86, var84, -1, class54.field1344, var87, var88, var90, 10614);
                    }
                } else if (class4.field139 == 169) {
                    int var92 = class36.field907.method330(-30864);
                    int var93 = (var92 & 0x7) + class16.field431;
                    int var94 = (var92 >> 4 & 0x7) + class10.field330;
                    int var95 = class36.field907.method330(-30864);
                    int var96 = var95 >> 2;
                    int var97 = var95 & 0x3;
                    int var98 = class75.field1799[var96];
                    if (var94 >= 0 && var93 >= 0 && var94 < 104 && var93 < 104) {
                        class94.method723(var93, 0, var96, -1, -1, class54.field1344, var97, var98, var94, 10614);
                    }
                } else if (class4.field139 == 185) {
                    int var99 = class36.field907.method330(-30864);
                    int var100 = class10.field330 + (var99 >> 4 & 0x7);
                    int var101 = class16.field431 + (var99 & 0x7);
                    int var102 = class36.field907.method343((byte) -6);
                    int var103 = class36.field907.method343((byte) -6);
                    int var104 = class36.field907.method343((byte) -6);
                    if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                        class23 var105 = class22.field559[class54.field1344][var100][var101];
                        if (var105 != null) {
                            for (class4 var106 = (class4) var105.method180(0); var106 != null; var106 = (class4) var105.method181(0)) {
                                if ((var102 & 0x7FFF) == var106.field132 && var106.field137 == var103) {
                                    var106.field137 = var104;
                                    break;
                                }
                            }
                            class43.method360(var100, var101, 71);
                        }
                    }
                } else {
                    if (class4.field139 == 72) {
                        int var107 = class36.field907.method330(-30864);
                        int var108 = (var107 & 0x7) + class16.field431;
                        int var109 = class10.field330 + (var107 >> 4 & 0x7);
                        int var110 = class36.field907.method343((byte) -6);
                        int var111 = class36.field907.method330(-30864);
                        int var112 = var111 >> 4 & 0xF;
                        int var113 = var111 & 0x7;
                        int var114 = class36.field907.method330(-30864);
                        if (var109 >= 0 && var108 >= 0 && var109 < 104 && var108 < 104) {
                            int var115 = var112 + 1;
                            if (var109 - var115 <= class82.field1932.field89[0] && class82.field1932.field89[0] <= var109 + var115 && class82.field1932.field49[0] >= var108 - var115 && class82.field1932.field49[0] <= var108 + var115 && class106.field2681 != 0 && var113 > 0 && class32.field768 < 50) {
                                class18.field482[class32.field768] = var110;
                                class5.field211[class32.field768] = var113;
                                class13.field386[class32.field768] = var114;
                                class118.field2921[class32.field768] = null;
                                class108.field2725[class32.field768] = (var108 << 8) + (var109 << 16) + var112;
                                class32.field768++;
                            }
                        }
                    }
                    if (class4.field139 == 142) {
                        int var116 = class36.field907.method330(-30864);
                        int var117 = (var116 >> 4 & 0x7) + class10.field330;
                        int var118 = (var116 & 0x7) + class16.field431;
                        int var119 = class36.field907.method336(241465648);
                        int var120 = class36.field907.method298(112);
                        int var121 = class36.field907.method336(241465648);
                        if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104 && class132.field3199 != var121) {
                            class4 var122 = new class4();
                            var122.field137 = var120;
                            var122.field132 = var119;
                            if (class22.field559[class54.field1344][var117][var118] == null) {
                                class22.field559[class54.field1344][var117][var118] = new class23();
                            }
                            class22.field559[class54.field1344][var117][var118].method176(var122, -19597);
                            class43.method360(var117, var118, 120);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 815)
    public class99(Throwable arg0, String arg1) {
        this.field2392 = arg1;
        this.field2383 = arg0;
    }
}
