import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class216 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Z")
    public static boolean field3663 = false;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lia;")
    public static class257 field3661 = class28.method234(-120, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field3665 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lea;Z)V")
    public static final void method1436(class177 arg0, boolean arg1) {
        class94.field1772.method287(arg0, 0);
        while (true) {
            class177 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class177[][] var7;
            class177 var66;
            do {
                class177 var65;
                do {
                    class177 var64;
                    do {
                        class177 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class177) class94.field1772.method285(0);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3020);
                                            var3 = var2.field3011;
                                            var4 = var2.field3028;
                                            var5 = var2.field3025;
                                            var6 = var2.field3026;
                                            var7 = class75.field1463[var5];
                                            if (!var2.field3013) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class177 var8 = class75.field1463[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3020) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class207.field3546 && var3 > class62.field1273) {
                                                    class177 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3020 && (var9.field3013 || (var2.field3010 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class207.field3546 && var3 < class143.field2507 - 1) {
                                                    class177 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3020 && (var10.field3013 || (var2.field3010 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class228.field3836 && var4 > class44.field973) {
                                                    class177 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3020 && (var11.field3013 || (var2.field3010 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class228.field3836 && var4 < class58.field1225 - 1) {
                                                    class177 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3020 && (var12.field3013 || (var2.field3010 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3013 = false;
                                            if (var2.field3031 != null) {
                                                class177 var13 = var2.field3031;
                                                if (var13.field3032 == null) {
                                                    if (var13.field3007 != null) {
                                                        if (class42.method332(0, var3, var4)) {
                                                            class157.method1096(var13.field3007, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var3, var4, true);
                                                        } else {
                                                            class157.method1096(var13.field3007, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class42.method332(0, var3, var4)) {
                                                    class186.method1264(var13.field3032, 0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var3, var4, true);
                                                } else {
                                                    class186.method1264(var13.field3032, 0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var3, var4, false);
                                                }
                                                class8 var14 = var13.field3024;
                                                if (var14 != null) {
                                                    var14.field172.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var14.field176 - class26.field512, var14.field173 - class18.field393, var14.field165 - class224.field3765, var14.field170);
                                                }
                                                for (int var15 = 0; var15 < var13.field3012; var15++) {
                                                    class154 var16 = var13.field3017[var15];
                                                    if (var16 != null) {
                                                        var16.field2698.method3(var16.field2694, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var16.field2697 - class26.field512, var16.field2691 - class18.field393, var16.field2696 - class224.field3765, var16.field2702);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3032 == null) {
                                                if (var2.field3007 != null) {
                                                    if (class42.method332(var6, var3, var4)) {
                                                        class157.method1096(var2.field3007, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class157.method1096(var2.field3007, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var3, var4, false);
                                                    }
                                                }
                                            } else if (class42.method332(var6, var3, var4)) {
                                                class186.method1264(var2.field3032, var6, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field3032.field1229 != 12345678 || class157.field2751 && var5 <= class129.field2312) {
                                                    class186.method1264(var2.field3032, var6, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class115 var18 = var2.field3016;
                                                if (var18 != null && (var18.field2079 & 0xFFFFFFFF80000000L) != 0L) {
                                                    var18.field2075.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var18.field2076 - class26.field512, var18.field2069 - class18.field393, var18.field2071 - class224.field3765, var18.field2079);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class8 var21 = var2.field3024;
                                            class7 var22 = var2.field3022;
                                            if (var21 != null || var22 != null) {
                                                if (class207.field3546 == var3) {
                                                    var19++;
                                                } else if (class207.field3546 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class228.field3836 == var4) {
                                                    var19 += 3;
                                                } else if (class228.field3836 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class242.field4192[var19];
                                                var2.field3030 = class241.field4175[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field171 & class50.field1111[var19]) == 0) {
                                                    var2.field3023 = 0;
                                                } else if (var21.field171 == 16) {
                                                    var2.field3023 = 3;
                                                    var2.field3021 = class43.field861[var19];
                                                    var2.field3009 = 3 - var2.field3021;
                                                } else if (var21.field171 == 32) {
                                                    var2.field3023 = 6;
                                                    var2.field3021 = class158.field2772[var19];
                                                    var2.field3009 = 6 - var2.field3021;
                                                } else if (var21.field171 == 64) {
                                                    var2.field3023 = 12;
                                                    var2.field3021 = class41.field844[var19];
                                                    var2.field3009 = 12 - var2.field3021;
                                                } else {
                                                    var2.field3023 = 9;
                                                    var2.field3021 = class17.field374[var19];
                                                    var2.field3009 = 9 - var2.field3021;
                                                }
                                                if ((var21.field171 & var20) != 0 && !class103.method747(var6, var3, var4, var21.field171)) {
                                                    var21.field172.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var21.field176 - class26.field512, var21.field173 - class18.field393, var21.field165 - class224.field3765, var21.field170);
                                                }
                                                if ((var21.field161 & var20) != 0 && !class103.method747(var6, var3, var4, var21.field161)) {
                                                    var21.field169.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var21.field176 - class26.field512, var21.field173 - class18.field393, var21.field165 - class224.field3765, var21.field170);
                                                }
                                            }
                                            if (var22 != null && !class243.method1596(var6, var3, var4, var22.field147.method2())) {
                                                if ((var22.field158 & var20) != 0) {
                                                    var22.field147.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var22.field157 + var22.field148 - class26.field512, var22.field144 - class18.field393, var22.field159 + var22.field150 - class224.field3765, var22.field154);
                                                } else if (var22.field158 == 256) {
                                                    int var23 = var22.field157 - class26.field512;
                                                    int var24 = var22.field144 - class18.field393;
                                                    int var25 = var22.field159 - class224.field3765;
                                                    int var26 = var22.field155;
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
                                                        var22.field147.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var22.field148 + var23, var24, var22.field150 + var25, var22.field154);
                                                    } else if (var22.field156 != null) {
                                                        var22.field156.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var23, var24, var25, var22.field154);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class115 var29 = var2.field3016;
                                                if (var29 != null && (var29.field2079 & 0xFFFFFFFF80000000L) == 0L) {
                                                    var29.field2075.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var29.field2076 - class26.field512, var29.field2069 - class18.field393, var29.field2071 - class224.field3765, var29.field2079);
                                                }
                                                class39 var30 = var2.field3019;
                                                if (var30 != null && var30.field788 == 0) {
                                                    if (var30.field776 != null) {
                                                        var30.field776.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var30.field786 - class26.field512, var30.field767 - class18.field393, var30.field773 - class224.field3765, var30.field771);
                                                    }
                                                    if (var30.field765 != null) {
                                                        var30.field765.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var30.field786 - class26.field512, var30.field767 - class18.field393, var30.field773 - class224.field3765, var30.field771);
                                                    }
                                                    if (var30.field782 != null) {
                                                        var30.field782.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var30.field786 - class26.field512, var30.field767 - class18.field393, var30.field773 - class224.field3765, var30.field771);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3010;
                                            if (var31 != 0) {
                                                if (var3 < class207.field3546 && (var31 & 0x4) != 0) {
                                                    class177 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3020) {
                                                        class94.field1772.method287(var32, 0);
                                                    }
                                                }
                                                if (var4 < class228.field3836 && (var31 & 0x2) != 0) {
                                                    class177 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3020) {
                                                        class94.field1772.method287(var33, 0);
                                                    }
                                                }
                                                if (var3 > class207.field3546 && (var31 & 0x1) != 0) {
                                                    class177 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3020) {
                                                        class94.field1772.method287(var34, 0);
                                                    }
                                                }
                                                if (var4 > class228.field3836 && (var31 & 0x8) != 0) {
                                                    class177 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3020) {
                                                        class94.field1772.method287(var35, 0);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3023 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3012; var37++) {
                                                if (class126.field2266 != var2.field3017[var37].field2704 && (var2.field3027[var37] & var2.field3023) == var2.field3021) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class8 var38 = var2.field3024;
                                                if (!class103.method747(var6, var3, var4, var38.field171)) {
                                                    var38.field172.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var38.field176 - class26.field512, var38.field173 - class18.field393, var38.field165 - class224.field3765, var38.field170);
                                                }
                                                var2.field3023 = 0;
                                            }
                                        }
                                        if (!var2.field3018) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3012;
                                            var2.field3018 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class154 var42 = var2.field3017[var41];
                                                if (class126.field2266 != var42.field2704) {
                                                    for (int var43 = var42.field2693; var43 <= var42.field2695; var43++) {
                                                        for (int var44 = var42.field2688; var44 <= var42.field2700; var44++) {
                                                            class177 var45 = var7[var43][var44];
                                                            if (var45.field3013) {
                                                                var2.field3018 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3023 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2693) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2695) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2688) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2700) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3023) == var2.field3009) {
                                                                    var2.field3018 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class259.field4492[var40++] = var42;
                                                    int var47 = class207.field3546 - var42.field2693;
                                                    int var48 = var42.field2695 - class207.field3546;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class228.field3836 - var42.field2688;
                                                    int var50 = var42.field2700 - class228.field3836;
                                                    if (var50 > var49) {
                                                        var42.field2690 = var47 + var50;
                                                    } else {
                                                        var42.field2690 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class154 var54 = class259.field4492[var53];
                                                    if (class126.field2266 != var54.field2704) {
                                                        if (var54.field2690 > var51) {
                                                            var51 = var54.field2690;
                                                            var52 = var53;
                                                        } else if (var54.field2690 == var51) {
                                                            int var55 = var54.field2697 - class26.field512;
                                                            int var56 = var54.field2696 - class224.field3765;
                                                            int var57 = class259.field4492[var52].field2697 - class26.field512;
                                                            int var58 = class259.field4492[var52].field2696 - class224.field3765;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class154 var59 = class259.field4492[var52];
                                                var59.field2704 = class126.field2266;
                                                if (!class242.method1587(var6, var59.field2693, var59.field2695, var59.field2688, var59.field2700, var59.field2698.method2())) {
                                                    var59.field2698.method3(var59.field2694, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var59.field2697 - class26.field512, var59.field2691 - class18.field393, var59.field2696 - class224.field3765, var59.field2702);
                                                }
                                                for (int var60 = var59.field2693; var60 <= var59.field2695; var60++) {
                                                    for (int var61 = var59.field2688; var61 <= var59.field2700; var61++) {
                                                        class177 var62 = var7[var60][var61];
                                                        if (var62.field3023 != 0) {
                                                            class94.field1772.method287(var62, 0);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3020) {
                                                            class94.field1772.method287(var62, 0);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3018) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3018 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3020);
                            } while (var2.field3023 != 0);
                            if (var3 > class207.field3546 || var3 <= class62.field1273) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3020);
                        if (var3 < class207.field3546 || var3 >= class143.field2507 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3020);
                    if (var4 > class228.field3836 || var4 <= class44.field973) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3020);
                if (var4 < class228.field3836 || var4 >= class58.field1225 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3020);
            var2.field3020 = false;
            class108.field2020--;
            class39 var67 = var2.field3019;
            if (var67 != null && var67.field788 != 0) {
                if (var67.field776 != null) {
                    var67.field776.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var67.field786 - class26.field512, var67.field767 - class18.field393 - var67.field788, var67.field773 - class224.field3765, var67.field771);
                }
                if (var67.field765 != null) {
                    var67.field765.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var67.field786 - class26.field512, var67.field767 - class18.field393 - var67.field788, var67.field773 - class224.field3765, var67.field771);
                }
                if (var67.field782 != null) {
                    var67.field782.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var67.field786 - class26.field512, var67.field767 - class18.field393 - var67.field788, var67.field773 - class224.field3765, var67.field771);
                }
            }
            if (var2.field3030 != 0) {
                class7 var68 = var2.field3022;
                if (var68 != null && !class243.method1596(var6, var3, var4, var68.field147.method2())) {
                    if ((var68.field158 & var2.field3030) != 0) {
                        var68.field147.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var68.field157 + var68.field148 - class26.field512, var68.field144 - class18.field393, var68.field159 + var68.field150 - class224.field3765, var68.field154);
                    } else if (var68.field158 == 256) {
                        int var69 = var68.field157 - class26.field512;
                        int var70 = var68.field144 - class18.field393;
                        int var71 = var68.field159 - class224.field3765;
                        int var72 = var68.field155;
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
                            var68.field147.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var68.field148 + var69, var70, var68.field150 + var71, var68.field154);
                        } else if (var68.field156 != null) {
                            var68.field156.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var69, var70, var71, var68.field154);
                        }
                    }
                }
                class8 var75 = var2.field3024;
                if (var75 != null) {
                    if ((var75.field161 & var2.field3030) != 0 && !class103.method747(var6, var3, var4, var75.field161)) {
                        var75.field169.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var75.field176 - class26.field512, var75.field173 - class18.field393, var75.field165 - class224.field3765, var75.field170);
                    }
                    if ((var75.field171 & var2.field3030) != 0 && !class103.method747(var6, var3, var4, var75.field171)) {
                        var75.field172.method3(0, class90.field1733, class96.field1812, class102.field1881, class99.field1827, var75.field176 - class26.field512, var75.field173 - class18.field393, var75.field165 - class224.field3765, var75.field170);
                    }
                }
            }
            if (var5 < class236.field4045 - 1) {
                class177 var76 = class75.field1463[var5 + 1][var3][var4];
                if (var76 != null && var76.field3020) {
                    class94.field1772.method287(var76, 0);
                }
            }
            if (var3 < class207.field3546) {
                class177 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3020) {
                    class94.field1772.method287(var77, 0);
                }
            }
            if (var4 < class228.field3836) {
                class177 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3020) {
                    class94.field1772.method287(var78, 0);
                }
            }
            if (var3 > class207.field3546) {
                class177 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3020) {
                    class94.field1772.method287(var79, 0);
                }
            }
            if (var4 > class228.field3836) {
                class177 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3020) {
                    class94.field1772.method287(var80, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static final void method1437(int arg0) {
        field3662++;
        class196.method1316(28798, 5);
        class149.method1003(5, -94);
        class199.method1341(-15999, 5);
        class132.method923(7, 5);
        class226.method1477(4468, 5);
        class57.method439(arg0 ^ 0x6B11, 5);
        class148.method999((byte) -68, 5);
        class123.method859(16, arg0);
        class73.method545(arg0 - 3, 5);
        class187.method1265(5, arg0 - 42);
        class10.method116(arg0 ^ 0x45, 5);
        class226.method1480(124, 50);
        class134.method931(5, arg0 - 61);
        class258.method1722(18237, 5);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public static void method1438(int arg0) {
        field3661 = null;
        if (arg0 != 1) {
            method1437(0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    public static final void method1439(int arg0) {
        class75.field1462.method833(0);
        class80.field1560.method833(0);
        field3664++;
        if (arg0 != 1) {
            method1439(-79);
        }
    }
}
