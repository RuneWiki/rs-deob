import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class235 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4096 = 0;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lp;")
    public static class280 field4100 = class18.method140((byte) -118, "http:)4)4");

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lp;")
    public static class280 field4102 = class18.method140((byte) -125, "Cach-B");

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lp;")
    public static class280 field4097 = class18.method140((byte) -126, "scrollen:");

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lp;")
    public static class280 field4105 = class18.method140((byte) -125, ")1a2)1m");

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Ltg;")
    public static class180 field4106;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lsg;Z)V")
    public static final void method1579(class162 arg0, boolean arg1) {
        class242.field4253.method649(arg0, (byte) 87);
        while (true) {
            class162 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class162[][] var7;
            class162 var66;
            do {
                class162 var65;
                do {
                    class162 var64;
                    do {
                        class162 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class162) class242.field4253.method642(2);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2855);
                                            var3 = var2.field2848;
                                            var4 = var2.field2844;
                                            var5 = var2.field2834;
                                            var6 = var2.field2851;
                                            var7 = class220.field3787[var5];
                                            if (!var2.field2853) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class162 var8 = class220.field3787[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2855) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class15.field284 && var3 > class46.field771) {
                                                    class162 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2855 && (var9.field2853 || (var2.field2840 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class15.field284 && var3 < class45.field748 - 1) {
                                                    class162 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2855 && (var10.field2853 || (var2.field2840 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class277.field4811 && var4 > class271.field4744) {
                                                    class162 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2855 && (var11.field2853 || (var2.field2840 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class277.field4811 && var4 < class98.field1574 - 1) {
                                                    class162 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2855 && (var12.field2853 || (var2.field2840 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2853 = false;
                                            if (var2.field2842 != null) {
                                                class162 var13 = var2.field2842;
                                                if (var13.field2847 == null) {
                                                    if (var13.field2837 != null) {
                                                        if (class89.method637(0, var3, var4)) {
                                                            class260.method1756(var13.field2837, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var3, var4, true);
                                                        } else {
                                                            class260.method1756(var13.field2837, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class89.method637(0, var3, var4)) {
                                                    class44.method334(var13.field2847, 0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var3, var4, true);
                                                } else {
                                                    class44.method334(var13.field2847, 0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var3, var4, false);
                                                }
                                                class163 var14 = var13.field2849;
                                                if (var14 != null) {
                                                    var14.field2870.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var14.field2868 - class51.field841, var14.field2866 - class277.field4814, var14.field2864 - class108.field1786, var14.field2869, var5, (class95) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field2841; var15++) {
                                                    class160 var16 = var13.field2845[var15];
                                                    if (var16 != null) {
                                                        var16.field2811.method427(var16.field2803, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var16.field2809 - class51.field841, var16.field2807 - class277.field4814, var16.field2793 - class108.field1786, var16.field2805, var5, (class95) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2847 == null) {
                                                if (var2.field2837 != null) {
                                                    if (class89.method637(var6, var3, var4)) {
                                                        class260.method1756(var2.field2837, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class260.method1756(var2.field2837, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var3, var4, false);
                                                    }
                                                }
                                            } else if (class89.method637(var6, var3, var4)) {
                                                class44.method334(var2.field2847, var6, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2847.field2948 != 12345678 || class193.field3397 && var5 <= class160.field2806) {
                                                    class44.method334(var2.field2847, var6, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class245 var18 = var2.field2839;
                                                if (var18 != null && (var18.field4303 & 0x80000000L) != 0L) {
                                                    var18.field4301.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var18.field4306 - class51.field841, var18.field4308 - class277.field4814, var18.field4300 - class108.field1786, var18.field4303, var5, (class95) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class163 var21 = var2.field2849;
                                            class49 var22 = var2.field2852;
                                            if (var21 != null || var22 != null) {
                                                if (class15.field284 == var3) {
                                                    var19++;
                                                } else if (class15.field284 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class277.field4811 == var4) {
                                                    var19 += 3;
                                                } else if (class277.field4811 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class104.field1734[var19];
                                                var2.field2838 = class3.field109[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2867 & class242.field4243[var19]) == 0) {
                                                    var2.field2854 = 0;
                                                } else if (var21.field2867 == 16) {
                                                    var2.field2854 = 3;
                                                    var2.field2850 = class219.field3746[var19];
                                                    var2.field2836 = 3 - var2.field2850;
                                                } else if (var21.field2867 == 32) {
                                                    var2.field2854 = 6;
                                                    var2.field2850 = class204.field3551[var19];
                                                    var2.field2836 = 6 - var2.field2850;
                                                } else if (var21.field2867 == 64) {
                                                    var2.field2854 = 12;
                                                    var2.field2850 = class221.field3841[var19];
                                                    var2.field2836 = 12 - var2.field2850;
                                                } else {
                                                    var2.field2854 = 9;
                                                    var2.field2850 = class98.field1581[var19];
                                                    var2.field2836 = 9 - var2.field2850;
                                                }
                                                if ((var21.field2867 & var20) != 0 && !class80.method590(var6, var3, var4, var21.field2867)) {
                                                    var21.field2870.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var21.field2868 - class51.field841, var21.field2866 - class277.field4814, var21.field2864 - class108.field1786, var21.field2869, var5, (class95) null);
                                                }
                                                if ((var21.field2860 & var20) != 0 && !class80.method590(var6, var3, var4, var21.field2860)) {
                                                    var21.field2865.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var21.field2868 - class51.field841, var21.field2866 - class277.field4814, var21.field2864 - class108.field1786, var21.field2869, var5, (class95) null);
                                                }
                                            }
                                            if (var22 != null && !class120.method853(var6, var3, var4, var22.field800.method426())) {
                                                if ((var22.field801 & var20) != 0) {
                                                    var22.field800.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var22.field796 + var22.field797 - class51.field841, var22.field813 - class277.field4814, var22.field803 + var22.field802 - class108.field1786, var22.field807, var5, (class95) null);
                                                } else if (var22.field801 == 256) {
                                                    int var23 = var22.field796 - class51.field841;
                                                    int var24 = var22.field813 - class277.field4814;
                                                    int var25 = var22.field803 - class108.field1786;
                                                    int var26 = var22.field799;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field800.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var22.field797 + var23, var24, var22.field802 + var25, var22.field807, var5, (class95) null);
                                                    } else if (var22.field798 != null) {
                                                        var22.field798.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var23, var24, var25, var22.field807, var5, (class95) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class245 var29 = var2.field2839;
                                                if (var29 != null && (var29.field4303 & 0x80000000L) == 0L) {
                                                    var29.field4301.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var29.field4306 - class51.field841, var29.field4308 - class277.field4814, var29.field4300 - class108.field1786, var29.field4303, var5, (class95) null);
                                                }
                                                class196 var30 = var2.field2843;
                                                if (var30 != null && var30.field3432 == 0) {
                                                    if (var30.field3434 != null) {
                                                        var30.field3434.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var30.field3425 - class51.field841, var30.field3427 - class277.field4814, var30.field3430 - class108.field1786, var30.field3437, var5, (class95) null);
                                                    }
                                                    if (var30.field3440 != null) {
                                                        var30.field3440.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var30.field3425 - class51.field841, var30.field3427 - class277.field4814, var30.field3430 - class108.field1786, var30.field3437, var5, (class95) null);
                                                    }
                                                    if (var30.field3431 != null) {
                                                        var30.field3431.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var30.field3425 - class51.field841, var30.field3427 - class277.field4814, var30.field3430 - class108.field1786, var30.field3437, var5, (class95) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2840;
                                            if (var31 != 0) {
                                                if (var3 < class15.field284 && (var31 & 0x4) != 0) {
                                                    class162 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2855) {
                                                        class242.field4253.method649(var32, (byte) 119);
                                                    }
                                                }
                                                if (var4 < class277.field4811 && (var31 & 0x2) != 0) {
                                                    class162 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2855) {
                                                        class242.field4253.method649(var33, (byte) 108);
                                                    }
                                                }
                                                if (var3 > class15.field284 && (var31 & 0x1) != 0) {
                                                    class162 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2855) {
                                                        class242.field4253.method649(var34, (byte) 100);
                                                    }
                                                }
                                                if (var4 > class277.field4811 && (var31 & 0x8) != 0) {
                                                    class162 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2855) {
                                                        class242.field4253.method649(var35, (byte) 86);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2854 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2841; var37++) {
                                                if (class183.field3221 != var2.field2845[var37].field2804 && (var2.field2846[var37] & var2.field2854) == var2.field2850) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class163 var38 = var2.field2849;
                                                if (!class80.method590(var6, var3, var4, var38.field2867)) {
                                                    var38.field2870.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var38.field2868 - class51.field841, var38.field2866 - class277.field4814, var38.field2864 - class108.field1786, var38.field2869, var5, (class95) null);
                                                }
                                                var2.field2854 = 0;
                                            }
                                        }
                                        if (!var2.field2835) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2841;
                                            var2.field2835 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class160 var42 = var2.field2845[var41];
                                                if (class183.field3221 != var42.field2804) {
                                                    for (int var43 = var42.field2814; var43 <= var42.field2790; var43++) {
                                                        for (int var44 = var42.field2796; var44 <= var42.field2788; var44++) {
                                                            class162 var45 = var7[var43][var44];
                                                            if (var45.field2853) {
                                                                var2.field2835 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field2854 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2814) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2790) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2796) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2788) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2854) == var2.field2836) {
                                                                    var2.field2835 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class189.field3320[var40++] = var42;
                                                    int var47 = class15.field284 - var42.field2814;
                                                    int var48 = var42.field2790 - class15.field284;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class277.field4811 - var42.field2796;
                                                    int var50 = var42.field2788 - class277.field4811;
                                                    if (var50 > var49) {
                                                        var42.field2792 = var47 + var50;
                                                    } else {
                                                        var42.field2792 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class160 var54 = class189.field3320[var53];
                                                    if (class183.field3221 != var54.field2804) {
                                                        if (var54.field2792 > var51) {
                                                            var51 = var54.field2792;
                                                            var52 = var53;
                                                        } else if (var54.field2792 == var51) {
                                                            int var55 = var54.field2809 - class51.field841;
                                                            int var56 = var54.field2793 - class108.field1786;
                                                            int var57 = class189.field3320[var52].field2809 - class51.field841;
                                                            int var58 = class189.field3320[var52].field2793 - class108.field1786;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class160 var59 = class189.field3320[var52];
                                                var59.field2804 = class183.field3221;
                                                if (!class53.method390(var6, var59.field2814, var59.field2790, var59.field2796, var59.field2788, var59.field2811.method426())) {
                                                    var59.field2811.method427(var59.field2803, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var59.field2809 - class51.field841, var59.field2807 - class277.field4814, var59.field2793 - class108.field1786, var59.field2805, var5, (class95) null);
                                                }
                                                for (int var60 = var59.field2814; var60 <= var59.field2790; var60++) {
                                                    for (int var61 = var59.field2796; var61 <= var59.field2788; var61++) {
                                                        class162 var62 = var7[var60][var61];
                                                        if (var62.field2854 != 0) {
                                                            class242.field4253.method649(var62, (byte) 114);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2855) {
                                                            class242.field4253.method649(var62, (byte) 120);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2835) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field2835 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2855);
                            } while (var2.field2854 != 0);
                            if (var3 > class15.field284 || var3 <= class46.field771) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field2855);
                        if (var3 < class15.field284 || var3 >= class45.field748 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field2855);
                    if (var4 > class277.field4811 || var4 <= class271.field4744) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field2855);
                if (var4 < class277.field4811 || var4 >= class98.field1574 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field2855);
            var2.field2855 = false;
            class105.field1751--;
            class196 var67 = var2.field2843;
            if (var67 != null && var67.field3432 != 0) {
                if (var67.field3434 != null) {
                    var67.field3434.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var67.field3425 - class51.field841, var67.field3427 - class277.field4814 - var67.field3432, var67.field3430 - class108.field1786, var67.field3437, var5, (class95) null);
                }
                if (var67.field3440 != null) {
                    var67.field3440.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var67.field3425 - class51.field841, var67.field3427 - class277.field4814 - var67.field3432, var67.field3430 - class108.field1786, var67.field3437, var5, (class95) null);
                }
                if (var67.field3431 != null) {
                    var67.field3431.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var67.field3425 - class51.field841, var67.field3427 - class277.field4814 - var67.field3432, var67.field3430 - class108.field1786, var67.field3437, var5, (class95) null);
                }
            }
            if (var2.field2838 != 0) {
                class49 var68 = var2.field2852;
                if (var68 != null && !class120.method853(var6, var3, var4, var68.field800.method426())) {
                    if ((var68.field801 & var2.field2838) != 0) {
                        var68.field800.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var68.field796 + var68.field797 - class51.field841, var68.field813 - class277.field4814, var68.field803 + var68.field802 - class108.field1786, var68.field807, var5, (class95) null);
                    } else if (var68.field801 == 256) {
                        int var69 = var68.field796 - class51.field841;
                        int var70 = var68.field813 - class277.field4814;
                        int var71 = var68.field803 - class108.field1786;
                        int var72 = var68.field799;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field800.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var68.field797 + var69, var70, var68.field802 + var71, var68.field807, var5, (class95) null);
                        } else if (var68.field798 != null) {
                            var68.field798.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var69, var70, var71, var68.field807, var5, (class95) null);
                        }
                    }
                }
                class163 var75 = var2.field2849;
                if (var75 != null) {
                    if ((var75.field2860 & var2.field2838) != 0 && !class80.method590(var6, var3, var4, var75.field2860)) {
                        var75.field2865.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var75.field2868 - class51.field841, var75.field2866 - class277.field4814, var75.field2864 - class108.field1786, var75.field2869, var5, (class95) null);
                    }
                    if ((var75.field2867 & var2.field2838) != 0 && !class80.method590(var6, var3, var4, var75.field2867)) {
                        var75.field2870.method427(0, class113.field1960, class66.field1112, class182.field3204, class158.field2762, var75.field2868 - class51.field841, var75.field2866 - class277.field4814, var75.field2864 - class108.field1786, var75.field2869, var5, (class95) null);
                    }
                }
            }
            if (var5 < class78.field1281 - 1) {
                class162 var76 = class220.field3787[var5 + 1][var3][var4];
                if (var76 != null && var76.field2855) {
                    class242.field4253.method649(var76, (byte) 86);
                }
            }
            if (var3 < class15.field284) {
                class162 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field2855) {
                    class242.field4253.method649(var77, (byte) 123);
                }
            }
            if (var4 < class277.field4811) {
                class162 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field2855) {
                    class242.field4253.method649(var78, (byte) 123);
                }
            }
            if (var3 > class15.field284) {
                class162 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field2855) {
                    class242.field4253.method649(var79, (byte) 122);
                }
            }
            if (var4 > class277.field4811) {
                class162 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field2855) {
                    class242.field4253.method649(var80, (byte) 125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method1580(byte arg0) {
        field4100 = null;
        field4105 = null;
        int var1 = -29 / ((-arg0 - 13) / 62);
        field4097 = null;
        field4102 = null;
        field4106 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public static final void method1581(byte arg0) {
        int var1 = -17 % ((arg0 - 39) / 63);
        field4094++;
        class204.field3543 = 0;
        class24.field443 = 0;
        class189.method1318(0);
        class52.method385(-107);
        class189.method1317(93);
        class16.method128(0);
        for (int var2 = 0; var2 < class24.field443; var2++) {
            int var4 = class113.field1991[var2];
            if (class117.field2104 != class280.field4940[var4].field4848) {
                if (class280.field4940[var4].field2485 > 0) {
                    class122.method860(class280.field4940[var4], 42);
                }
                class280.field4940[var4] = null;
            }
        }
        if (class23.field422 != class20.field367.field481) {
            throw new RuntimeException("gpp1 pos:" + class20.field367.field481 + " psize:" + class23.field422);
        }
        for (int var3 = 0; var3 < class205.field3554; var3++) {
            if (class280.field4940[class250.field4376[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class205.field3554);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public static final void method1582(int arg0, int arg1) {
        class8.field177 = new int[arg1];
        class194.field3419 = new int[arg1];
        class109.field1826 = new int[arg1];
        if (arg0 != 3) {
            method1579((class162) null, true);
        }
        class54.field879 = new int[arg1];
        field4103++;
        class275.field4769 = new int[arg1];
    }
}
