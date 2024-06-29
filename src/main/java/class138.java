import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class138 {

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Lrf;")
    private static class163 field2840 = class53.method392(46, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lrf;")
    public static class163 field2838 = field2840;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Lrf;")
    public static class163 field2842 = class53.method392(-88, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Lge;")
    public static class65 field2847 = new class65(8);

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field2849 = 20;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lne;")
    public static class126 field2833;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field2843;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "[I")
    public int[] field2848;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method165(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Llg;Z)V")
    public static final void method904(class111 arg0, boolean arg1) {
        class119.field2513.method51(0, arg0);
        while (true) {
            class111 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class111[][] var7;
            class111 var65;
            do {
                class111 var64;
                do {
                    class111 var63;
                    do {
                        class111 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class111) class119.field2513.method45(0);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2347);
                                            var3 = var2.field2340;
                                            var4 = var2.field2348;
                                            var5 = var2.field2353;
                                            var6 = var2.field2355;
                                            var7 = class97.field2054[var5];
                                            if (!var2.field2356) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class111 var8 = class97.field2054[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2347) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class79.field1608 && var3 > class117.field2479) {
                                                    class111 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2347 && (var9.field2356 || (var2.field2351 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class79.field1608 && var3 < class28.field522 - 1) {
                                                    class111 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2347 && (var10.field2356 || (var2.field2351 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class12.field234 && var4 > class19.field310) {
                                                    class111 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2347 && (var11.field2356 || (var2.field2351 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class12.field234 && var4 < class58.field1178 - 1) {
                                                    class111 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2347 && (var12.field2356 || (var2.field2351 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2356 = false;
                                            if (var2.field2360 != null) {
                                                class111 var13 = var2.field2360;
                                                if (var13.field2350 == null) {
                                                    if (var13.field2361 != null && !class158.method1002(0, var3, var4)) {
                                                        class60.method432(var13.field2361, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var3, var4);
                                                    }
                                                } else if (!class158.method1002(0, var3, var4)) {
                                                    class41.method256(var13.field2350, 0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var3, var4);
                                                }
                                                class72 var14 = var13.field2345;
                                                if (var14 != null) {
                                                    var14.field1502.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var14.field1511 - class154.field3198, var14.field1521 - class208.field4046, var14.field1512 - class116.field2466, var14.field1520);
                                                }
                                                for (int var15 = 0; var15 < var13.field2359; var15++) {
                                                    class121 var16 = var13.field2344[var15];
                                                    if (var16 != null) {
                                                        var16.field2546.method183(var16.field2549, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var16.field2537 - class154.field3198, var16.field2543 - class208.field4046, var16.field2534 - class116.field2466, var16.field2536);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2350 == null) {
                                                if (var2.field2361 != null && !class158.method1002(var6, var3, var4)) {
                                                    var17 = true;
                                                    class60.method432(var2.field2361, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var3, var4);
                                                }
                                            } else if (!class158.method1002(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field2350.field2238 != 12345678 || class101.field2116 && var5 <= class163.field3303) {
                                                    class41.method256(var2.field2350, var6, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class72 var20 = var2.field2345;
                                            class122 var21 = var2.field2346;
                                            if (var20 != null || var21 != null) {
                                                if (class79.field1608 == var3) {
                                                    var18++;
                                                } else if (class79.field1608 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class12.field234 == var4) {
                                                    var18 += 3;
                                                } else if (class12.field234 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class114.field2410[var18];
                                                var2.field2342 = class9.field193[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field1506 & class87.field1894[var18]) == 0) {
                                                    var2.field2339 = 0;
                                                } else if (var20.field1506 == 16) {
                                                    var2.field2339 = 3;
                                                    var2.field2343 = class57.field1147[var18];
                                                    var2.field2349 = 3 - var2.field2343;
                                                } else if (var20.field1506 == 32) {
                                                    var2.field2339 = 6;
                                                    var2.field2343 = class13.field243[var18];
                                                    var2.field2349 = 6 - var2.field2343;
                                                } else if (var20.field1506 == 64) {
                                                    var2.field2339 = 12;
                                                    var2.field2343 = class3.field29[var18];
                                                    var2.field2349 = 12 - var2.field2343;
                                                } else {
                                                    var2.field2339 = 9;
                                                    var2.field2343 = class133.field2766[var18];
                                                    var2.field2349 = 9 - var2.field2343;
                                                }
                                                if ((var20.field1506 & var19) != 0 && !class186.method1260(var6, var3, var4, var20.field1506)) {
                                                    var20.field1502.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var20.field1511 - class154.field3198, var20.field1521 - class208.field4046, var20.field1512 - class116.field2466, var20.field1520);
                                                }
                                                if ((var20.field1513 & var19) != 0 && !class186.method1260(var6, var3, var4, var20.field1513)) {
                                                    var20.field1504.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var20.field1511 - class154.field3198, var20.field1521 - class208.field4046, var20.field1512 - class116.field2466, var20.field1520);
                                                }
                                            }
                                            if (var21 != null && !class85.method600(var6, var3, var4, var21.field2579.field3376)) {
                                                if ((var21.field2571 & var19) != 0) {
                                                    var21.field2579.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var21.field2567 + var21.field2569 - class154.field3198, var21.field2559 - class208.field4046, var21.field2577 + var21.field2568 - class116.field2466, var21.field2573);
                                                } else if (var21.field2571 == 256) {
                                                    int var22 = var21.field2567 - class154.field3198;
                                                    int var23 = var21.field2559 - class208.field4046;
                                                    int var24 = var21.field2577 - class116.field2466;
                                                    int var25 = var21.field2564;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field2579.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var21.field2569 + var22, var23, var21.field2568 + var24, var21.field2573);
                                                    } else if (var21.field2570 != null) {
                                                        var21.field2570.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var22, var23, var24, var21.field2573);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class9 var28 = var2.field2357;
                                                if (var28 != null) {
                                                    var28.field184.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var28.field185 - class154.field3198, var28.field191 - class208.field4046, var28.field181 - class116.field2466, var28.field192);
                                                }
                                                class195 var29 = var2.field2352;
                                                if (var29 != null && var29.field3844 == 0) {
                                                    if (var29.field3858 != null) {
                                                        var29.field3858.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var29.field3871 - class154.field3198, var29.field3835 - class208.field4046, var29.field3847 - class116.field2466, var29.field3881);
                                                    }
                                                    if (var29.field3845 != null) {
                                                        var29.field3845.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var29.field3871 - class154.field3198, var29.field3835 - class208.field4046, var29.field3847 - class116.field2466, var29.field3881);
                                                    }
                                                    if (var29.field3884 != null) {
                                                        var29.field3884.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var29.field3871 - class154.field3198, var29.field3835 - class208.field4046, var29.field3847 - class116.field2466, var29.field3881);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field2351;
                                            if (var30 != 0) {
                                                if (var3 < class79.field1608 && (var30 & 0x4) != 0) {
                                                    class111 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field2347) {
                                                        class119.field2513.method51(0, var31);
                                                    }
                                                }
                                                if (var4 < class12.field234 && (var30 & 0x2) != 0) {
                                                    class111 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field2347) {
                                                        class119.field2513.method51(0, var32);
                                                    }
                                                }
                                                if (var3 > class79.field1608 && (var30 & 0x1) != 0) {
                                                    class111 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field2347) {
                                                        class119.field2513.method51(0, var33);
                                                    }
                                                }
                                                if (var4 > class12.field234 && (var30 & 0x8) != 0) {
                                                    class111 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field2347) {
                                                        class119.field2513.method51(0, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2339 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field2359; var36++) {
                                                if (class63.field1329 != var2.field2344[var36].field2540 && (var2.field2358[var36] & var2.field2339) == var2.field2343) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class72 var37 = var2.field2345;
                                                if (!class186.method1260(var6, var3, var4, var37.field1506)) {
                                                    var37.field1502.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var37.field1511 - class154.field3198, var37.field1521 - class208.field4046, var37.field1512 - class116.field2466, var37.field1520);
                                                }
                                                var2.field2339 = 0;
                                            }
                                        }
                                        if (!var2.field2341) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field2359;
                                            var2.field2341 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class121 var41 = var2.field2344[var40];
                                                if (class63.field1329 != var41.field2540) {
                                                    for (int var42 = var41.field2544; var42 <= var41.field2548; var42++) {
                                                        for (int var43 = var41.field2542; var43 <= var41.field2535; var43++) {
                                                            class111 var44 = var7[var42][var43];
                                                            if (var44.field2356) {
                                                                var2.field2341 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field2339 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field2544) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field2548) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field2542) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field2535) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field2339) == var2.field2349) {
                                                                    var2.field2341 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class144.field2957[var39++] = var41;
                                                    int var46 = class79.field1608 - var41.field2544;
                                                    int var47 = var41.field2548 - class79.field1608;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class12.field234 - var41.field2542;
                                                    int var49 = var41.field2535 - class12.field234;
                                                    if (var49 > var48) {
                                                        var41.field2541 = var46 + var49;
                                                    } else {
                                                        var41.field2541 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class121 var53 = class144.field2957[var52];
                                                    if (class63.field1329 != var53.field2540) {
                                                        if (var53.field2541 > var50) {
                                                            var50 = var53.field2541;
                                                            var51 = var52;
                                                        } else if (var53.field2541 == var50) {
                                                            int var54 = var53.field2537 - class154.field3198;
                                                            int var55 = var53.field2534 - class116.field2466;
                                                            int var56 = class144.field2957[var51].field2537 - class154.field3198;
                                                            int var57 = class144.field2957[var51].field2534 - class116.field2466;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class121 var58 = class144.field2957[var51];
                                                var58.field2540 = class63.field1329;
                                                if (!class88.method613(var6, var58.field2544, var58.field2548, var58.field2542, var58.field2535, var58.field2546.field3376)) {
                                                    var58.field2546.method183(var58.field2549, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var58.field2537 - class154.field3198, var58.field2543 - class208.field4046, var58.field2534 - class116.field2466, var58.field2536);
                                                }
                                                for (int var59 = var58.field2544; var59 <= var58.field2548; var59++) {
                                                    for (int var60 = var58.field2542; var60 <= var58.field2535; var60++) {
                                                        class111 var61 = var7[var59][var60];
                                                        if (var61.field2339 != 0) {
                                                            class119.field2513.method51(0, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field2347) {
                                                            class119.field2513.method51(0, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2341) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field2341 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2347);
                            } while (var2.field2339 != 0);
                            if (var3 > class79.field1608 || var3 <= class117.field2479) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field2347);
                        if (var3 < class79.field1608 || var3 >= class28.field522 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field2347);
                    if (var4 > class12.field234 || var4 <= class19.field310) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field2347);
                if (var4 < class12.field234 || var4 >= class58.field1178 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field2347);
            var2.field2347 = false;
            class28.field516--;
            class195 var66 = var2.field2352;
            if (var66 != null && var66.field3844 != 0) {
                if (var66.field3858 != null) {
                    var66.field3858.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var66.field3871 - class154.field3198, var66.field3835 - class208.field4046 - var66.field3844, var66.field3847 - class116.field2466, var66.field3881);
                }
                if (var66.field3845 != null) {
                    var66.field3845.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var66.field3871 - class154.field3198, var66.field3835 - class208.field4046 - var66.field3844, var66.field3847 - class116.field2466, var66.field3881);
                }
                if (var66.field3884 != null) {
                    var66.field3884.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var66.field3871 - class154.field3198, var66.field3835 - class208.field4046 - var66.field3844, var66.field3847 - class116.field2466, var66.field3881);
                }
            }
            if (var2.field2342 != 0) {
                class122 var67 = var2.field2346;
                if (var67 != null && !class85.method600(var6, var3, var4, var67.field2579.field3376)) {
                    if ((var67.field2571 & var2.field2342) != 0) {
                        var67.field2579.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var67.field2567 + var67.field2569 - class154.field3198, var67.field2559 - class208.field4046, var67.field2577 + var67.field2568 - class116.field2466, var67.field2573);
                    } else if (var67.field2571 == 256) {
                        int var68 = var67.field2567 - class154.field3198;
                        int var69 = var67.field2559 - class208.field4046;
                        int var70 = var67.field2577 - class116.field2466;
                        int var71 = var67.field2564;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field2579.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var67.field2569 + var68, var69, var67.field2568 + var70, var67.field2573);
                        } else if (var67.field2570 != null) {
                            var67.field2570.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var68, var69, var70, var67.field2573);
                        }
                    }
                }
                class72 var74 = var2.field2345;
                if (var74 != null) {
                    if ((var74.field1513 & var2.field2342) != 0 && !class186.method1260(var6, var3, var4, var74.field1513)) {
                        var74.field1504.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var74.field1511 - class154.field3198, var74.field1521 - class208.field4046, var74.field1512 - class116.field2466, var74.field1520);
                    }
                    if ((var74.field1506 & var2.field2342) != 0 && !class186.method1260(var6, var3, var4, var74.field1506)) {
                        var74.field1502.method183(0, class181.field3639, class194.field3827, class122.field2572, class71.field1501, var74.field1511 - class154.field3198, var74.field1521 - class208.field4046, var74.field1512 - class116.field2466, var74.field1520);
                    }
                }
            }
            if (var5 < class41.field847 - 1) {
                class111 var75 = class97.field2054[var5 + 1][var3][var4];
                if (var75 != null && var75.field2347) {
                    class119.field2513.method51(0, var75);
                }
            }
            if (var3 < class79.field1608) {
                class111 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field2347) {
                    class119.field2513.method51(0, var76);
                }
            }
            if (var4 < class12.field234) {
                class111 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field2347) {
                    class119.field2513.method51(0, var77);
                }
            }
            if (var3 > class79.field1608) {
                class111 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field2347) {
                    class119.field2513.method51(0, var78);
                }
            }
            if (var4 > class12.field234) {
                class111 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field2347) {
                    class119.field2513.method51(0, var79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public final void method905(int arg0) {
        field2836++;
        class173.method1161(this.field2848, this.field2844, this.field2837);
        if (arg0 != 1) {
            field2833 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method170(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Ljava/awt/Component;III)Loh;")
    public static final class138 method906(Component arg0, int arg1, int arg2, int arg3) {
        field2834++;
        if (arg2 >= -45) {
            return null;
        }
        try {
            Class var4 = Class.forName("tg");
            class138 var5 = (class138) var4.getDeclaredConstructor().newInstance();
            var5.method170(arg0, arg1, arg3, 4);
            return var5;
        } catch (Throwable var7) {
            class28 var6 = new class28();
            var6.method170(arg0, arg1, arg3, 4);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Graphics;IIIBI)V")
    public abstract void method169(Graphics arg0, int arg1, int arg2, int arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)Lig;")
    public static final class84 method907(int arg0, boolean arg1) {
        field2839++;
        if (arg1) {
            method907(42, true);
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class84.field1798[var2] == null || class84.field1798[var2][var3] == null) {
            boolean var4 = class114.method781(var2, (byte) -119);
            if (!var4) {
                return null;
            }
        }
        return class84.field1798[var2][var3];
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI[B)I")
    public static final int method908(int arg0, byte arg1, int arg2, byte[] arg3) {
        field2841++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = class166.field3375[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
        }
        if (arg1 > -10) {
            method908(-7, (byte) -99, -22, null);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    protected class138() {
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static void method909(int arg0) {
        field2840 = null;
        field2838 = null;
        if (arg0 >= 105) {
            field2833 = null;
            field2842 = null;
            field2847 = null;
        }
    }
}
