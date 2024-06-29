import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class291 extends class84 {

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    private int field4608 = 4096;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    private int field4609 = 4096;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    private int field4615 = 4096;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field4610 = 0;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "[I")
    public static int[] field4611 = new int[50];

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field4613 = 0;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "Llc;")
    public static class86 field4614;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lkc;Z)V")
    public static final void method1970(class286 arg0, boolean arg1) {
        class162.field2640.method1385(arg0, true);
        while (true) {
            class286 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class286[][] var7;
            class286 var66;
            do {
                class286 var65;
                do {
                    class286 var64;
                    do {
                        class286 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class286) class162.field2640.method1389((byte) 47);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4516);
                                            var3 = var2.field4538;
                                            var4 = var2.field4521;
                                            var5 = var2.field4545;
                                            var6 = var2.field4524;
                                            var7 = class220.field3525[var5];
                                            if (!var2.field4542) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class286 var8 = class220.field3525[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field4516) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class24.field278 && var3 > class181.field2916) {
                                                    class286 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field4516 && (var9.field4542 || (var2.field4519 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class24.field278 && var3 < class76.field1091 - 1) {
                                                    class286 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field4516 && (var10.field4542 || (var2.field4519 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class52.field768 && var4 > class288.field4574) {
                                                    class286 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field4516 && (var11.field4542 || (var2.field4519 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class52.field768 && var4 < class133.field2192 - 1) {
                                                    class286 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field4516 && (var12.field4542 || (var2.field4519 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4542 = false;
                                            if (var2.field4523 != null) {
                                                class286 var13 = var2.field4523;
                                                if (var13.field4537 != null) {
                                                    if (!class5.method29(0, var3, var4)) {
                                                        class232.method1644(var13.field4537, 0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var3, var4, false);
                                                    } else {
                                                        class232.method1644(var13.field4537, 0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var3, var4, true);
                                                    }
                                                } else if (var13.field4527 != null) {
                                                    if (!class5.method29(0, var3, var4)) {
                                                        class71.method518(var13.field4527, class265.field4298, class86.field1251, class114.field1651, class62.field925, var3, var4, false);
                                                    } else {
                                                        class71.method518(var13.field4527, class265.field4298, class86.field1251, class114.field1651, class62.field925, var3, var4, true);
                                                    }
                                                }
                                                class99 var14 = var13.field4526;
                                                if (var14 != null) {
                                                    var14.field1466.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var14.field1463 - class204.field3277, var14.field1457 - class244.field3960, var14.field1459 - class108.field1566, var14.field1464, var5, (class157) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field4541; ++var15) {
                                                    class166 var16 = var13.field4530[var15];
                                                    if (var16 != null) {
                                                        var16.field2681.method2(var16.field2693, class265.field4298, class86.field1251, class114.field1651, class62.field925, var16.field2682 - class204.field3277, var16.field2695 - class244.field3960, var16.field2687 - class108.field1566, var16.field2683, var5, (class157) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field4537 != null) {
                                                if (!class5.method29(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field4537.field2214 != 12345678 || class238.field3806 && var5 <= class113.field1622) {
                                                        class232.method1644(var2.field4537, var6, class265.field4298, class86.field1251, class114.field1651, class62.field925, var3, var4, false);
                                                    }
                                                } else {
                                                    class232.method1644(var2.field4537, var6, class265.field4298, class86.field1251, class114.field1651, class62.field925, var3, var4, true);
                                                }
                                            } else if (var2.field4527 != null) {
                                                if (!class5.method29(var6, var3, var4)) {
                                                    var17 = true;
                                                    class71.method518(var2.field4527, class265.field4298, class86.field1251, class114.field1651, class62.field925, var3, var4, false);
                                                } else {
                                                    class71.method518(var2.field4527, class265.field4298, class86.field1251, class114.field1651, class62.field925, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class159 var18 = var2.field4518;
                                                if (var18 != null && (var18.field2600 & 2147483648L) != 0L) {
                                                    var18.field2601.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var18.field2606 - class204.field3277, var18.field2603 - class244.field3960, var18.field2595 - class108.field1566, var18.field2600, var5, (class157) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class99 var21 = var2.field4526;
                                            class156 var22 = var2.field4532;
                                            if (var21 != null || var22 != null) {
                                                if (class24.field278 == var3) {
                                                    ++var19;
                                                } else if (class24.field278 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class52.field768 == var4) {
                                                    var19 += 3;
                                                } else if (class52.field768 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class11.field133[var19];
                                                var2.field4517 = class193.field3103[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field1462 & class11.field129[var19]) != 0) {
                                                    if (var21.field1462 == 16) {
                                                        var2.field4520 = 3;
                                                        var2.field4529 = class40.field564[var19];
                                                        var2.field4535 = 3 - var2.field4529;
                                                    } else if (var21.field1462 == 32) {
                                                        var2.field4520 = 6;
                                                        var2.field4529 = class77.field1115[var19];
                                                        var2.field4535 = 6 - var2.field4529;
                                                    } else if (var21.field1462 == 64) {
                                                        var2.field4520 = 12;
                                                        var2.field4529 = class186.field3005[var19];
                                                        var2.field4535 = 12 - var2.field4529;
                                                    } else {
                                                        var2.field4520 = 9;
                                                        var2.field4529 = class161.field2638[var19];
                                                        var2.field4535 = 9 - var2.field4529;
                                                    }
                                                } else {
                                                    var2.field4520 = 0;
                                                }
                                                if ((var21.field1462 & var20) != 0 && !class287.method1956(var6, var3, var4, var21.field1462)) {
                                                    var21.field1466.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var21.field1463 - class204.field3277, var21.field1457 - class244.field3960, var21.field1459 - class108.field1566, var21.field1464, var5, (class157) null);
                                                }
                                                if ((var21.field1453 & var20) != 0 && !class287.method1956(var6, var3, var4, var21.field1453)) {
                                                    var21.field1458.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var21.field1463 - class204.field3277, var21.field1457 - class244.field3960, var21.field1459 - class108.field1566, var21.field1464, var5, (class157) null);
                                                }
                                            }
                                            if (var22 != null && !class204.method1492(var6, var3, var4, var22.field2560.method3())) {
                                                if ((var22.field2561 & var20) != 0) {
                                                    var22.field2560.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var22.field2558 - class204.field3277 + var22.field2568, var22.field2570 - class244.field3960, var22.field2572 - class108.field1566 + var22.field2573, var22.field2565, var5, (class157) null);
                                                } else if (var22.field2561 == 256) {
                                                    int var23 = var22.field2558 - class204.field3277;
                                                    int var24 = var22.field2570 - class244.field3960;
                                                    int var25 = var22.field2572 - class108.field1566;
                                                    int var26 = var22.field2559;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field2560.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var22.field2568 + var23, var24, var22.field2573 + var25, var22.field2565, var5, (class157) null);
                                                    } else if (var22.field2569 != null) {
                                                        var22.field2569.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var23, var24, var25, var22.field2565, var5, (class157) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class159 var29 = var2.field4518;
                                                if (var29 != null && (var29.field2600 & 2147483648L) == 0L) {
                                                    var29.field2601.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var29.field2606 - class204.field3277, var29.field2603 - class244.field3960, var29.field2595 - class108.field1566, var29.field2600, var5, (class157) null);
                                                }
                                                class169 var30 = var2.field4525;
                                                if (var30 != null && var30.field2718 == 0) {
                                                    if (var30.field2733 != null) {
                                                        var30.field2733.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var30.field2717 - class204.field3277, var30.field2719 - class244.field3960, var30.field2716 - class108.field1566, var30.field2727, var5, (class157) null);
                                                    }
                                                    if (var30.field2732 != null) {
                                                        var30.field2732.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var30.field2717 - class204.field3277, var30.field2719 - class244.field3960, var30.field2716 - class108.field1566, var30.field2727, var5, (class157) null);
                                                    }
                                                    if (var30.field2715 != null) {
                                                        var30.field2715.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var30.field2717 - class204.field3277, var30.field2719 - class244.field3960, var30.field2716 - class108.field1566, var30.field2727, var5, (class157) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field4519;
                                            if (var31 != 0) {
                                                if (var3 < class24.field278 && (var31 & 4) != 0) {
                                                    class286 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field4516) {
                                                        class162.field2640.method1385(var32, true);
                                                    }
                                                }
                                                if (var4 < class52.field768 && (var31 & 2) != 0) {
                                                    class286 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field4516) {
                                                        class162.field2640.method1385(var33, true);
                                                    }
                                                }
                                                if (var3 > class24.field278 && (var31 & 1) != 0) {
                                                    class286 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field4516) {
                                                        class162.field2640.method1385(var34, true);
                                                    }
                                                }
                                                if (var4 > class52.field768 && (var31 & 8) != 0) {
                                                    class286 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field4516) {
                                                        class162.field2640.method1385(var35, true);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4520 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field4541; ++var37) {
                                                if (class200.field3209 != var2.field4530[var37].field2691 && (var2.field4536[var37] & var2.field4520) == var2.field4529) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class99 var38 = var2.field4526;
                                                if (!class287.method1956(var6, var3, var4, var38.field1462)) {
                                                    var38.field1466.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var38.field1463 - class204.field3277, var38.field1457 - class244.field3960, var38.field1459 - class108.field1566, var38.field1464, var5, (class157) null);
                                                }
                                                var2.field4520 = 0;
                                            }
                                        }
                                        if (!var2.field4533) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field4541;
                                            var2.field4533 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; ++var41) {
                                                class166 var42 = var2.field4530[var41];
                                                if (class200.field3209 != var42.field2691) {
                                                    for (int var43 = var42.field2678; var43 <= var42.field2688; ++var43) {
                                                        for (int var44 = var42.field2684; var44 <= var42.field2692; ++var44) {
                                                            class286 var45 = var7[var43][var44];
                                                            if (var45.field4542) {
                                                                var2.field4533 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field4520 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2678) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field2688) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2684) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2692) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field4520) == var2.field4535) {
                                                                    var2.field4533 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class297.field4705[var40++] = var42;
                                                    int var47 = class24.field278 - var42.field2678;
                                                    int var48 = var42.field2688 - class24.field278;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class52.field768 - var42.field2684;
                                                    int var50 = var42.field2692 - class52.field768;
                                                    if (var50 > var49) {
                                                        var42.field2686 = var47 + var50;
                                                    } else {
                                                        var42.field2686 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class166 var54 = class297.field4705[var53];
                                                    if (class200.field3209 != var54.field2691) {
                                                        if (var54.field2686 > var51) {
                                                            var51 = var54.field2686;
                                                            var52 = var53;
                                                        } else if (var54.field2686 == var51) {
                                                            int var55 = var54.field2682 - class204.field3277;
                                                            int var56 = var54.field2687 - class108.field1566;
                                                            int var57 = class297.field4705[var52].field2682 - class204.field3277;
                                                            int var58 = class297.field4705[var52].field2687 - class108.field1566;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class166 var59 = class297.field4705[var52];
                                                var59.field2691 = class200.field3209;
                                                if (!class266.method1853(var6, var59.field2678, var59.field2688, var59.field2684, var59.field2692, var59.field2681.method3())) {
                                                    var59.field2681.method2(var59.field2693, class265.field4298, class86.field1251, class114.field1651, class62.field925, var59.field2682 - class204.field3277, var59.field2695 - class244.field3960, var59.field2687 - class108.field1566, var59.field2683, var5, (class157) null);
                                                }
                                                for (int var60 = var59.field2678; var60 <= var59.field2688; ++var60) {
                                                    for (int var61 = var59.field2684; var61 <= var59.field2692; ++var61) {
                                                        class286 var62 = var7[var60][var61];
                                                        if (var62.field4520 != 0) {
                                                            class162.field2640.method1385(var62, true);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field4516) {
                                                            class162.field2640.method1385(var62, true);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4533) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field4533 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4516);
                            } while (var2.field4520 != 0);
                            if (var3 > class24.field278 || var3 <= class181.field2916) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field4516);
                        if (var3 < class24.field278 || var3 >= class76.field1091 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field4516);
                    if (var4 > class52.field768 || var4 <= class288.field4574) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field4516);
                if (var4 < class52.field768 || var4 >= class133.field2192 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field4516);
            var2.field4516 = false;
            --class144.field2335;
            class169 var67 = var2.field4525;
            if (var67 != null && var67.field2718 != 0) {
                if (var67.field2733 != null) {
                    var67.field2733.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var67.field2717 - class204.field3277, var67.field2719 - class244.field3960 - var67.field2718, var67.field2716 - class108.field1566, var67.field2727, var5, (class157) null);
                }
                if (var67.field2732 != null) {
                    var67.field2732.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var67.field2717 - class204.field3277, var67.field2719 - class244.field3960 - var67.field2718, var67.field2716 - class108.field1566, var67.field2727, var5, (class157) null);
                }
                if (var67.field2715 != null) {
                    var67.field2715.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var67.field2717 - class204.field3277, var67.field2719 - class244.field3960 - var67.field2718, var67.field2716 - class108.field1566, var67.field2727, var5, (class157) null);
                }
            }
            if (var2.field4517 != 0) {
                class156 var68 = var2.field4532;
                if (var68 != null && !class204.method1492(var6, var3, var4, var68.field2560.method3())) {
                    if ((var68.field2561 & var2.field4517) != 0) {
                        var68.field2560.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var68.field2558 - class204.field3277 + var68.field2568, var68.field2570 - class244.field3960, var68.field2572 - class108.field1566 + var68.field2573, var68.field2565, var5, (class157) null);
                    } else if (var68.field2561 == 256) {
                        int var69 = var68.field2558 - class204.field3277;
                        int var70 = var68.field2570 - class244.field3960;
                        int var71 = var68.field2572 - class108.field1566;
                        int var72 = var68.field2559;
                        int var73;
                        if (var72 != 1 && var72 != 2) {
                            var73 = var69;
                        } else {
                            var73 = -var69;
                        }
                        int var74;
                        if (var72 != 2 && var72 != 3) {
                            var74 = var71;
                        } else {
                            var74 = -var71;
                        }
                        if (var74 >= var73) {
                            var68.field2560.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var68.field2568 + var69, var70, var68.field2573 + var71, var68.field2565, var5, (class157) null);
                        } else if (var68.field2569 != null) {
                            var68.field2569.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var69, var70, var71, var68.field2565, var5, (class157) null);
                        }
                    }
                }
                class99 var75 = var2.field4526;
                if (var75 != null) {
                    if ((var75.field1453 & var2.field4517) != 0 && !class287.method1956(var6, var3, var4, var75.field1453)) {
                        var75.field1458.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var75.field1463 - class204.field3277, var75.field1457 - class244.field3960, var75.field1459 - class108.field1566, var75.field1464, var5, (class157) null);
                    }
                    if ((var75.field1462 & var2.field4517) != 0 && !class287.method1956(var6, var3, var4, var75.field1462)) {
                        var75.field1466.method2(0, class265.field4298, class86.field1251, class114.field1651, class62.field925, var75.field1463 - class204.field3277, var75.field1457 - class244.field3960, var75.field1459 - class108.field1566, var75.field1464, var5, (class157) null);
                    }
                }
            }
            if (var5 < class80.field1158 - 1) {
                class286 var76 = class220.field3525[var5 + 1][var3][var4];
                if (var76 != null && var76.field4516) {
                    class162.field2640.method1385(var76, true);
                }
            }
            if (var3 < class24.field278) {
                class286 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field4516) {
                    class162.field2640.method1385(var77, true);
                }
            }
            if (var4 < class52.field768) {
                class286 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field4516) {
                    class162.field2640.method1385(var78, true);
                }
            }
            if (var3 > class24.field278) {
                class286 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field4516) {
                    class162.field2640.method1385(var79, true);
                }
            }
            if (var4 > class52.field768) {
                class286 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field4516) {
                    class162.field2640.method1385(var80, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field4615 = arg0.method1126(false);
                }
            } else {
                this.field4609 = arg0.method1126(false);
            }
        } else {
            this.field4608 = arg0.method1126(false);
        }
        ++field4606;
        if (arg1 < 87) {
            method1970((class286) null, true);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class291() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([ILsl;[I[IZ)V")
    public static final void method1971(int[] arg0, class18 arg1, int[] arg2, int[] arg3, boolean arg4) {
        if (arg4) {
            field4611 = null;
        }
        for (int var5 = 0; ~arg3.length < ~var5; ++var5) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg1.field1889.length) {
                if ((var7 & 1) != 0) {
                    if (var6 != -1) {
                        class141 var10 = class285.method1939(var6, 112);
                        class124 var11 = arg1.field1889[var9];
                        int var12 = var10.field2273;
                        if (var11 != null) {
                            if (var11.field1818 == var6) {
                                if (var12 != 0) {
                                    if (~var12 == -2) {
                                        var11.field1814 = 0;
                                        var11.field1819 = var8;
                                        var11.field1808 = 1;
                                        var11.field1809 = 0;
                                        var11.field1807 = 0;
                                        class263.method1845(0, arg1.field1910, false, arg1.field1979, (byte) -86, var10);
                                    } else if (var12 == 2) {
                                        var11.field1814 = 0;
                                    }
                                } else {
                                    var11 = arg1.field1889[var9] = null;
                                }
                            } else if (var10.field2278 >= class285.method1939(var11.field1818, 112).field2278) {
                                var11 = arg1.field1889[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class124 var13 = arg1.field1889[var9] = new class124();
                            var13.field1814 = 0;
                            var13.field1807 = 0;
                            var13.field1808 = 1;
                            var13.field1819 = var8;
                            var13.field1809 = 0;
                            var13.field1818 = var6;
                            class263.method1845(0, arg1.field1910, false, arg1.field1979, (byte) -104, var10);
                        }
                    } else {
                        arg1.field1889[var9] = null;
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
        ++field4605;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field4612;
        int[][] var3 = super.field1211.method193((byte) 117, arg0);
        if (super.field1211.field321) {
            int[][] var4 = this.method611(0, (byte) -114, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class20.field221; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field4608 * var12 >> 12;
                    var9[var11] = this.field4609 * var13 >> 12;
                    var10[var11] = this.field4615 * var14 >> 12;
                } else {
                    var8[var11] = this.field4608;
                    var9[var11] = this.field4609;
                    var10[var11] = this.field4615;
                }
            }
        }
        return arg1 != -18 ? null : var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLng;)V")
    public static final void method1972(byte arg0, class78 arg1) {
        ++field4607;
        class132.field2181 = arg1;
        if (arg0 != -97) {
            method1973((byte) 74);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
    public static void method1973(byte arg0) {
        field4611 = null;
        field4614 = null;
        if (arg0 >= -1) {
            method1973((byte) -21);
        }
    }
}
