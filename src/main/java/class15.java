import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 {

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lhe;")
    public static class54 field449 = class6.method58("scape main", false);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[[I")
    public static int[][] field454 = new int[104][104];

    @OriginalMember(owner = "client!c", name = "j", descriptor = "[S")
    public static short[] field452 = new short[] { -1, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!c", name = "t", descriptor = "J")
    public static volatile long field462 = 0L;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lhe;")
    public static class54 field458 = class6.method58("<col=40ff00>", false);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "J")
    public static volatile long field461 = 0L;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "B")
    public static byte field460 = 0;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[J")
    public static long[] field464 = new long[100];

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lsf;")
    public static class131 field457 = new class131(100);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lef;")
    public static class35 field455;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lhe;")
    public class54 field444;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Lnc;")
    public static class93 field465;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
    public boolean field447;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([Lnc;IIIIIIIII)V")
    public static final void method138(class93[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class90.method714(arg8, arg6, arg3, arg1);
        field446++;
        class152.method1152();
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class93 var11 = arg0[var10];
            if (var11 != null && (var11.field2284 == arg7 || arg7 == -1412584499 && class133.field3017 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class49.field1192[class16.field476] = var11.field2282 + arg4;
                    class79.field1943[class16.field476] = var11.field2313 + arg2;
                    class150.field3390[class16.field476] = var11.field2257;
                    class38.field972[class16.field476] = var11.field2286;
                    var12 = class16.field476++;
                } else {
                    var12 = arg5;
                }
                var11.field2294 = var12;
                var11.field2336 = class4.field138;
                if (!var11.field2279 || !class103.method804(110, var11)) {
                    if (var11.field2328 > 0) {
                        class139.method1076(127, var11);
                    }
                    int var13 = var11.field2282 + arg4;
                    int var14 = var11.field2313 + arg2;
                    int var15 = var11.field2367;
                    if (class133.field3017 == var11) {
                        if (arg7 != -1412584499 && !var11.field2261) {
                            class72.field1785 = arg2;
                            class48.field1167 = arg0;
                            class1.field3 = arg4;
                            continue;
                        }
                        if (class39.field1006 && class65.field1564) {
                            int var16 = class71.field1772;
                            int var17 = class7.field211;
                            int var18 = var16 - class147.field3318;
                            int var19 = var17 - class140.field3204;
                            if (var19 < class53.field1282) {
                                var19 = class53.field1282;
                            }
                            if (class3.field82 > var18) {
                                var18 = class3.field82;
                            }
                            if (class3.field82 + class115.field2725.field2257 < var18 - -var11.field2257) {
                                var18 = class3.field82 + class115.field2725.field2257 - var11.field2257;
                            }
                            if (var11.field2286 + var19 > class53.field1282 + class115.field2725.field2286) {
                                var19 = class115.field2725.field2286 + class53.field1282 - var11.field2286;
                            }
                            var14 = var19;
                            var13 = var18;
                        }
                        if (!var11.field2261) {
                            var15 = 128;
                        }
                    }
                    int var24;
                    int var26;
                    int var28;
                    int var29;
                    if (var11.field2359 == 2) {
                        var28 = arg6;
                        var24 = arg8;
                        var29 = arg1;
                        var26 = arg3;
                    } else if (var11.field2359 == 9) {
                        int var20 = var13;
                        int var21 = var14 + var11.field2286;
                        int var22 = var11.field2257 + var13;
                        if (var13 > var22) {
                            var20 = var22;
                            var22 = var13;
                        }
                        var22++;
                        var24 = arg8 >= var20 ? arg8 : var20;
                        int var25 = var14;
                        var26 = arg3 > var22 ? var22 : arg3;
                        if (var21 < var14) {
                            var25 = var21;
                            var21 = var14;
                        }
                        var21++;
                        var28 = arg6 < var25 ? var25 : arg6;
                        var29 = arg1 > var21 ? var21 : arg1;
                    } else {
                        var28 = var14 <= arg6 ? arg6 : var14;
                        var24 = var13 <= arg8 ? arg8 : var13;
                        int var30 = var11.field2286 + var14;
                        var29 = var30 < arg1 ? var30 : arg1;
                        int var31 = var11.field2257 + var13;
                        var26 = arg3 > var31 ? var31 : arg3;
                    }
                    if (!var11.field2279 || var26 > var24 && var28 < var29) {
                        if (var11.field2328 != 0) {
                            if (var11.field2328 == 1337) {
                                class86.field2139 = var13;
                                class77.field1871 = var14;
                                class123.method947(false, var13, var11.field2257, var14, var11.field2286);
                                class90.method714(arg8, arg6, arg3, arg1);
                                continue;
                            }
                            if (var11.field2328 == 1338) {
                                class26.method197(var13, var12, true, var14);
                                class90.method714(arg8, arg6, arg3, arg1);
                                continue;
                            }
                        }
                        int var32 = class71.field1772;
                        int var33 = class7.field211;
                        if (!class133.field3007 && var32 >= var24 && var28 <= var33 && var26 > var32 && var33 < var29) {
                            class139.method1077((byte) -108, var11, var33 - var14, -var13 + var32);
                        }
                        if (var11.field2359 == 0) {
                            if (!var11.field2279 && class103.method804(110, var11) && class64.field1551 != var11) {
                                continue;
                            }
                            if (!var11.field2279) {
                                if (var11.field2339 > var11.field2307 - var11.field2286) {
                                    var11.field2339 = var11.field2307 - var11.field2286;
                                }
                                if (var11.field2339 < 0) {
                                    var11.field2339 = 0;
                                }
                            }
                            method138(arg0, var29, var14 - var11.field2339, var26, var13 - var11.field2332, var12, var28, var11.field2273, var24, -114);
                            if (var11.field2316 != null) {
                                method138(var11.field2316, var29, var14 - var11.field2339, var26, var13 - var11.field2332, var12, var28, var11.field2273, var24, -108);
                            }
                            class112 var34 = (class112) class63.field1530.method246((byte) 117, (long) var11.field2273);
                            if (var34 != null) {
                                if (var34.field2686 == 0 && var24 <= class71.field1772 && class7.field211 >= var28 && var26 > class71.field1772 && class7.field211 < var29 && !class133.field3007 && !class31.field804) {
                                    class67.field1641 = 1;
                                    class157.field3574[0] = 1007;
                                    class67.field1618[0] = class157.field3575;
                                    class34.field842[0] = class24.field671;
                                }
                                class4.method31(var29, var13, var26, var12, var14, var24, var28, var34.field2691, (byte) 101);
                            }
                            class90.method714(arg8, arg6, arg3, arg1);
                            class152.method1152();
                        }
                        if (class44.field1125[var12] || class102.field2546 > 1) {
                            if (var11.field2359 == 0 && !var11.field2279 && var11.field2286 < var11.field2307) {
                                class6.method61((byte) -116, var11.field2339, var11.field2307, var11.field2257 + var13, var14, var11.field2286);
                            }
                            if (var11.field2359 != 1) {
                                if (var11.field2359 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field2286; var36++) {
                                        for (int var37 = 0; var37 < var11.field2257; var37++) {
                                            int var38 = (var11.field2291 + 32) * var37 + var13;
                                            int var39 = (var11.field2333 + 32) * var36 + var14;
                                            if (var35 < 20) {
                                                var39 += var11.field2358[var35];
                                                var38 += var11.field2324[var35];
                                            }
                                            if (var11.field2280[var35] > 0) {
                                                boolean var40 = false;
                                                int var41 = var11.field2280[var35] - 1;
                                                boolean var42 = false;
                                                if (var38 + 32 > arg8 && arg3 > var38 && arg6 < var39 + 32 && var39 < arg1 || class6.field179 == var11 && class107.field2614 == var35) {
                                                    class113 var43;
                                                    if (class3.field76 == 1 && class80.field1978 == var35 && class111.field2670 == var11.field2273) {
                                                        var43 = class48.method344(false, var41, var11.field2317[var35], 2, (byte) -97, 0);
                                                    } else {
                                                        var43 = class48.method344(false, var41, var11.field2317[var35], 1, (byte) -97, 3153952);
                                                    }
                                                    if (var43 == null) {
                                                        class134.method1005(var11, 0);
                                                    } else if (class6.field179 == var11 && class107.field2614 == var35) {
                                                        int var44 = class71.field1772 - class137.field3147;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        int var45 = class7.field211 - class115.field2727;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class5.field165 < 5) {
                                                            var45 = 0;
                                                            var44 = 0;
                                                        }
                                                        var43.method848(var38 + var44, var39 - -var45, 128);
                                                        if (arg7 != -1) {
                                                            class93 var46 = arg0[arg7 & 0xFFFF];
                                                            if (var39 + var45 < class90.field2210 && var46.field2339 > 0) {
                                                                int var47 = (class90.field2210 - var39 - var45) * class52.field1247 / 3;
                                                                if (var47 > class52.field1247 * 10) {
                                                                    var47 = class52.field1247 * 10;
                                                                }
                                                                if (var46.field2339 < var47) {
                                                                    var47 = var46.field2339;
                                                                }
                                                                var46.field2339 -= var47;
                                                                class115.field2727 += var47;
                                                                class134.method1005(var46, 0);
                                                            }
                                                            if (var45 + var39 + 32 > class90.field2207 && var46.field2307 - var46.field2286 > var46.field2339) {
                                                                int var48 = (var39 + var45 + 32 - class90.field2207) * class52.field1247 / 3;
                                                                if (var48 > class52.field1247 * 10) {
                                                                    var48 = class52.field1247 * 10;
                                                                }
                                                                if (var46.field2307 - var46.field2286 - var46.field2339 < var48) {
                                                                    var48 = var46.field2307 - var46.field2339 - var46.field2286;
                                                                }
                                                                class115.field2727 -= var48;
                                                                var46.field2339 += var48;
                                                                class134.method1005(var46, 0);
                                                            }
                                                        }
                                                    } else if (class87.field2154 == var11 && class74.field1835 == var35) {
                                                        var43.method848(var38, var39, 128);
                                                    } else {
                                                        var43.method865(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field2278 != null && var35 < 20) {
                                                class113 var49 = var11.method746(var35, (byte) -107);
                                                if (var49 != null) {
                                                    var49.method865(var38, var39);
                                                } else if (class95.field2403) {
                                                    class134.method1005(var11, 0);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field2359 == 3) {
                                    int var50;
                                    if (class68.method537(var11, 2)) {
                                        var50 = var11.field2357;
                                        if (class64.field1551 == var11 && var11.field2243 != 0) {
                                            var50 = var11.field2243;
                                        }
                                    } else {
                                        var50 = var11.field2296;
                                        if (class64.field1551 == var11 && var11.field2298 != 0) {
                                            var50 = var11.field2298;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field2266) {
                                            class90.method710(var13, var14, var11.field2257, var11.field2286, var50);
                                        } else {
                                            class90.method724(var13, var14, var11.field2257, var11.field2286, var50);
                                        }
                                    } else if (var11.field2266) {
                                        class90.method720(var13, var14, var11.field2257, var11.field2286, var50, 256 - (var15 & 0xFF));
                                    } else {
                                        class90.method719(var13, var14, var11.field2257, var11.field2286, var50, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field2359 == 4) {
                                    class101 var51 = var11.method743(0);
                                    if (var51 != null) {
                                        class54 var52 = var11.field2251;
                                        int var53;
                                        if (class68.method537(var11, 2)) {
                                            var53 = var11.field2357;
                                            if (class64.field1551 == var11 && var11.field2243 != 0) {
                                                var53 = var11.field2243;
                                            }
                                            if (var11.field2250.method404(-112) > 0) {
                                                var52 = var11.field2250;
                                            }
                                        } else {
                                            var53 = var11.field2296;
                                            if (class64.field1551 == var11 && var11.field2298 != 0) {
                                                var53 = var11.field2298;
                                            }
                                        }
                                        if (var11.field2279 && var11.field2327 != -1) {
                                            class67 var54 = class141.method1088(var11.field2327, (byte) -105);
                                            var52 = var54.field1652;
                                            if (var52 == null) {
                                                var52 = class143.field3277;
                                            }
                                            if ((var54.field1673 == 1 || var11.field2244 != 1) && var11.field2244 != -1) {
                                                var52 = class143.method1105(new class54[] { class124.field2857, var52, class34.field864, class68.method547((byte) 97, var11.field2244) }, -842);
                                            }
                                        }
                                        if (class93.field2242 == var11) {
                                            var52 = class139.field3180;
                                            var53 = var11.field2296;
                                        }
                                        if (!var11.field2279) {
                                            var52 = class130.method984(var52, var11, false);
                                        }
                                        var51.method1178(var52, var13, var14, var11.field2257, var11.field2286, var53, var11.field2260 ? 0 : -1, var11.field2315, var11.field2363, var11.field2262);
                                    } else if (class95.field2403) {
                                        class134.method1005(var11, 0);
                                    }
                                } else if (var11.field2359 == 5) {
                                    if (var11.field2279) {
                                        class113 var56;
                                        if (var11.field2327 == -1) {
                                            var56 = var11.method740(1, false);
                                        } else {
                                            var56 = class48.method344(false, var11.field2327, var11.field2244, var11.field2302, (byte) -97, var11.field2263);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field2703;
                                            int var58 = var56.field2701;
                                            if (var11.field2354) {
                                                class90.method725(var13, var14, var13 + var11.field2257, var14 - -var11.field2286);
                                                int var59 = (var57 + var11.field2257 - 1) / var57;
                                                int var60 = (var11.field2286 + var58 - 1) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var11.field2319 != 0) {
                                                            var56.method852(var57 * var61 + var57 / 2 + var13, var58 * var62 + var14 - -(var58 / 2), var11.field2319, 4096);
                                                        } else if (var15 == 0) {
                                                            var56.method865(var57 * var61 + var13, var58 * var62 + var14);
                                                        } else {
                                                            var56.method848(var13 + var57 * var61, var14 - -(var58 * var62), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class90.method714(arg8, arg6, arg3, arg1);
                                            } else {
                                                int var63 = var11.field2257 * 4096 / var57;
                                                if (var11.field2319 != 0) {
                                                    var56.method852(var13 + var11.field2257 / 2, var11.field2286 / 2 + var14, var11.field2319, var63);
                                                } else if (var15 != 0) {
                                                    var56.method844(var13, var14, var11.field2257, var11.field2286, 256 - (var15 & 0xFF));
                                                } else if (var11.field2257 == var57 && var11.field2286 == var58) {
                                                    var56.method865(var13, var14);
                                                } else {
                                                    var56.method854(var13, var14, var11.field2257, var11.field2286);
                                                }
                                            }
                                        } else if (class95.field2403) {
                                            class134.method1005(var11, 0);
                                        }
                                    } else {
                                        class113 var55 = var11.method740(1, class68.method537(var11, 2));
                                        if (var55 != null) {
                                            var55.method865(var13, var14);
                                        } else if (class95.field2403) {
                                            class134.method1005(var11, 0);
                                        }
                                    }
                                } else if (var11.field2359 == 6) {
                                    boolean var64 = class68.method537(var11, 2);
                                    int var65;
                                    if (var64) {
                                        var65 = var11.field2274;
                                    } else {
                                        var65 = var11.field2311;
                                    }
                                    int var66 = 0;
                                    class98 var67 = null;
                                    if (var11.field2327 != -1) {
                                        class67 var68 = class141.method1088(var11.field2327, (byte) -105);
                                        if (var68 != null) {
                                            class67 var69 = var68.method527(0, var11.field2244);
                                            var67 = var69.method519(-11, 1);
                                            if (var67 == null) {
                                                class134.method1005(var11, 0);
                                            } else {
                                                var67.method777();
                                                var66 = var67.field1279 / 2;
                                            }
                                        }
                                    } else if (var11.field2238 == 5) {
                                        if (var11.field2351 == 0) {
                                            var67 = class143.field3267.method539(-1, null, -1, 850, null);
                                        } else {
                                            var67 = class108.field2639.method184(false);
                                        }
                                    } else if (var65 == -1) {
                                        var67 = var11.method736((byte) -113, null, class108.field2639.field642, var64, -1);
                                        if (var67 == null && class95.field2403) {
                                            class134.method1005(var11, 0);
                                        }
                                    } else {
                                        class142 var70 = class135.method1010(var65, (byte) -110);
                                        var67 = var11.method736((byte) -92, var70, class108.field2639.field642, var64, var11.field2254);
                                        if (var67 == null && class95.field2403) {
                                            class134.method1005(var11, 0);
                                        }
                                    }
                                    class152.method1155(var11.field2257 / 2 + var13, var14 - -(var11.field2286 / 2));
                                    int var71 = class152.field3416[var11.field2314] * var11.field2269 >> 16;
                                    int var72 = class152.field3420[var11.field2314] * var11.field2269 >> 16;
                                    if (var67 != null) {
                                        if (var11.field2279) {
                                            var67.method777();
                                            if (var11.field2364) {
                                                var67.method781(0, var11.field2337, var11.field2252, var11.field2314, var11.field2325, var66 + var71 + var11.field2249, var72 - -var11.field2249, var11.field2269);
                                            } else {
                                                var67.method768(0, var11.field2337, var11.field2252, var11.field2314, var11.field2325, var11.field2249 + var71 + var66, var72 - -var11.field2249);
                                            }
                                        } else {
                                            var67.method768(0, var11.field2337, 0, var11.field2314, 0, var71, var72);
                                        }
                                    }
                                    class152.method1163();
                                } else {
                                    if (var11.field2359 == 7) {
                                        class101 var73 = var11.method743(0);
                                        if (var73 == null) {
                                            if (class95.field2403) {
                                                class134.method1005(var11, 0);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var11.field2286; var75++) {
                                            for (int var76 = 0; var76 < var11.field2257; var76++) {
                                                if (var11.field2280[var74] > 0) {
                                                    class67 var77 = class141.method1088(var11.field2280[var74] - 1, (byte) -123);
                                                    class54 var78;
                                                    if (var77.field1673 != 1 && var11.field2317[var74] == 1) {
                                                        var78 = class143.method1105(new class54[] { class124.field2857, var77.field1652, class13.field346 }, -842);
                                                    } else {
                                                        var78 = class143.method1105(new class54[] { class124.field2857, var77.field1652, class34.field864, class68.method547((byte) 83, var11.field2317[var74]) }, -842);
                                                    }
                                                    int var79 = (var11.field2291 + 115) * var76 + var13;
                                                    int var80 = var14 + (var11.field2333 + 12) * var75;
                                                    if (var11.field2315 == 0) {
                                                        var73.method1189(var78, var79, var80, var11.field2296, var11.field2260 ? 0 : -1);
                                                    } else if (var11.field2315 == 1) {
                                                        var73.method1183(var78, var11.field2257 / 2 + var79, var80, var11.field2296, var11.field2260 ? 0 : -1);
                                                    } else {
                                                        var73.method1170(var78, var11.field2257 + var79 - 1, var80, var11.field2296, var11.field2260 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var11.field2359 == 8 && class84.field2095 == var11 && class8.field248 == class151.field3403) {
                                        int var81 = 0;
                                        class101 var82 = class108.field2626;
                                        int var83 = 0;
                                        class54 var84 = var11.field2251;
                                        class54 var85 = class130.method984(var84, var11, false);
                                        while (var85.method404(-120) > 0) {
                                            int var93 = var85.method382(class18.field518, (byte) 122);
                                            class54 var94;
                                            if (var93 == -1) {
                                                var94 = var85;
                                                var85 = class24.field671;
                                            } else {
                                                var94 = var85.method408((byte) -112, 0, var93);
                                                var85 = var85.method384(var93 + 4, -47);
                                            }
                                            int var95 = var82.method1172(var94);
                                            if (var83 < var95) {
                                                var83 = var95;
                                            }
                                            var81 += var82.field3463 + 1;
                                        }
                                        var83 += 6;
                                        var81 += 7;
                                        int var86 = var11.field2257 + var13 - var83 - 5;
                                        int var87 = var11.field2286 + var14 + 5;
                                        if (var86 < var13 + 5) {
                                            var86 = var13 + 5;
                                        }
                                        if (arg3 < var83 + var86) {
                                            var86 = arg3 - var83;
                                        }
                                        if (arg1 < var81 + var87) {
                                            var87 = arg1 - var81;
                                        }
                                        class90.method710(var86, var87, var83, var81, 16777120);
                                        class90.method724(var86, var87, var83, var81, 0);
                                        int var88 = var82.field3463 + var87 + 2;
                                        class54 var89 = var11.field2251;
                                        class54 var90 = class130.method984(var89, var11, false);
                                        while (var90.method404(-110) > 0) {
                                            int var91 = var90.method382(class18.field518, (byte) 119);
                                            class54 var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = class24.field671;
                                            } else {
                                                var92 = var90.method408((byte) -120, 0, var91);
                                                var90 = var90.method384(var91 + 4, 121);
                                            }
                                            var82.method1189(var92, var86 + 3, var88, 0, -1);
                                            var88 += var82.field3463 + 1;
                                        }
                                    }
                                    if (var11.field2359 == 9) {
                                        if (var11.field2300 == 1) {
                                            class90.method723(var13, var14, var11.field2257 + var13, var11.field2286 + var14, var11.field2296);
                                        } else {
                                            int var96 = var11.field2257 >= 0 ? var11.field2257 : -var11.field2257;
                                            int var97 = var11.field2286 >= 0 ? var11.field2286 : -var11.field2286;
                                            int var98 = var96;
                                            if (var97 > var96) {
                                                var98 = var97;
                                            }
                                            if (var98 != 0) {
                                                int var99 = (var11.field2257 << 16) / var98;
                                                int var100 = (var11.field2286 << 16) / var98;
                                                if (var99 < var100) {
                                                    var100 = -var100;
                                                } else {
                                                    var99 = -var99;
                                                }
                                                int var101 = var11.field2300 * var100 + 1 >> 17;
                                                int var102 = var11.field2300 * var99 >> 17;
                                                int var103 = var11.field2300 * var100 >> 17;
                                                int var104 = var13 - var101;
                                                int var105 = var13 + var103;
                                                int var106 = var11.field2257 + var13 - var101;
                                                int var107 = var11.field2257 + var103 + var13;
                                                int var108 = var14 + var102;
                                                int var109 = var11.field2300 * var99 + 1 >> 17;
                                                int var110 = var14 - var109;
                                                int var111 = var11.field2286 + var14 - var109;
                                                int var112 = var14 + var11.field2286 + var102;
                                                class152.method1154(var105, var104, var106);
                                                class152.method1156(var108, var110, var111, var105, var104, var106, var11.field2296);
                                                class152.method1154(var105, var106, var107);
                                                class152.method1156(var108, var111, var112, var105, var106, var107, var11.field2296);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg9 >= -106) {
            method138(null, -21, -53, 27, -107, 49, 16, -52, -99, 14);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    public static final void method139(int arg0, int arg1, int arg2) {
        field448++;
        if (arg2 == -27222 && class111.field2669 == 2) {
            class125.method955((class149.field3387 - class11.field323 << 7) + class18.field531, false, class114.field2716 * 2, (class149.field3355 - class67.field1648 << 7) + class18.field522);
            if (class57.field1422 > -1 && class4.field138 % 20 < 10) {
                class28.field750[0].method865(class57.field1422 + arg0 - 12, arg1 - -class16.field485 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method140(int arg0) {
        if (arg0 != -18722) {
            method142(-61, -38);
        }
        class56.field1400.method992(0);
        field453++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method141(byte arg0) {
        field454 = null;
        field455 = null;
        field449 = null;
        if (arg0 <= 7) {
            field462 = -112L;
        }
        field452 = null;
        field457 = null;
        field458 = null;
        field465 = null;
        field464 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    public static final void method142(int arg0, int arg1) {
        field463++;
        if (arg0 >= -120) {
            method139(-36, 63, -69);
        }
        if (arg1 == -3) {
            class75.method577(class28.field743, 16, class39.field1026, class156.field3537);
        } else if (arg1 == -2) {
            class75.method577(class102.field2545, 74, class156.field3541, class156.field3517);
        } else if (arg1 == -1) {
            class75.method577(class28.field738, 127, class2.field34, class156.field3536);
        } else if (arg1 == 3) {
            class75.method577(class133.field3003, 62, class156.field3561, class156.field3564);
        } else if (arg1 == 4) {
            class75.method577(class120.field2794, 100, class140.field3199, class156.field3567);
        } else if (arg1 == 5) {
            class75.method577(class34.field850, 51, client.field610, class156.field3560);
        } else if (arg1 == 6) {
            class75.method577(class52.field1272, 93, class16.field480, class156.field3570);
        } else if (arg1 == 7) {
            class75.method577(class70.field1720, 88, class12.field341, class156.field3538);
        } else if (arg1 == 8) {
            class75.method577(class80.field1996, 110, class107.field2622, class156.field3568);
        } else if (arg1 == 9) {
            class75.method577(class134.field3043, 44, class5.field157, class156.field3554);
        } else if (arg1 == 10) {
            class75.method577(class63.field1545, 75, class107.field2611, class156.field3524);
        } else if (arg1 == 11) {
            class75.method577(class131.field2960, 97, class77.field1879, class156.field3519);
        } else if (arg1 == 12) {
            class75.method577(class71.field1770, 31, class102.field2549, class156.field3549);
        } else if (arg1 == 13) {
            class75.method577(class28.field745, 19, class4.field124, class156.field3531);
        } else if (arg1 == 14) {
            class75.method577(class123.field2837, 45, class72.field1807, class156.field3546);
        } else if (arg1 == 16) {
            class75.method577(client.field608, 94, class103.field2562, class156.field3530);
        } else if (arg1 == 17) {
            class75.method577(class6.field202, 15, class68.field1688, class156.field3544);
        } else if (arg1 == 18) {
            class75.method577(class140.field3195, 87, class112.field2692, class156.field3565);
        } else if (arg1 == 19) {
            class75.method577(class68.field1713, 68, class3.field73, class70.field1747);
        } else if (arg1 == 20) {
            class75.method577(class28.field741, 73, class62.field1504, class156.field3542);
        } else if (arg1 == 22) {
            class75.method577(class67.field1657, 7, class19.field548, class156.field3539);
        } else if (arg1 == 23) {
            class75.method577(class123.field2848, 23, class54.field1295, class156.field3520);
        } else if (arg1 == 24) {
            class75.method577(class89.field2199, 18, class26.field691, class156.field3558);
        } else if (arg1 == 25) {
            class75.method577(class28.field756, 110, class85.field2120, class156.field3525);
        } else if (arg1 == 26) {
            class75.method577(class80.field1958, 46, class78.field1888, class156.field3552);
        } else if (arg1 == 27) {
            class75.method577(class19.field565, 41, class156.field3548, class156.field3526);
        } else {
            class75.method577(class28.field742, 23, class13.field356, class156.field3556);
        }
        class4.method28(10, 1);
    }
}
