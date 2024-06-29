import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class285 {

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    private int field4536 = 0;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lh;")
    private class190 field4541;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lwg;")
    private class254 field4534;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[Lij;")
    public static class69[] field4533;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lok;Z)V")
    public static final void method1915(class131 arg0, boolean arg1) {
        class54.field808.method652(87, arg0);
        while (true) {
            class131 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class131[][] var7;
            class131 var66;
            do {
                class131 var65;
                do {
                    class131 var64;
                    do {
                        class131 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class131) class54.field808.method653((byte) 125);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1907);
                                            var3 = var2.field1912;
                                            var4 = var2.field1919;
                                            var5 = var2.field1913;
                                            var6 = var2.field1925;
                                            var7 = class16.field233[var5];
                                            if (!var2.field1911) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class131 var8 = class16.field233[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1907) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class114.field1641 && var3 > class119.field1751) {
                                                    class131 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1907 && (var9.field1911 || (var2.field1932 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class114.field1641 && var3 < class162.field2352 - 1) {
                                                    class131 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1907 && (var10.field1911 || (var2.field1932 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class152.field2207 && var4 > class28.field406) {
                                                    class131 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1907 && (var11.field1911 || (var2.field1932 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class152.field2207 && var4 < class281.field4482 - 1) {
                                                    class131 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1907 && (var12.field1911 || (var2.field1932 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1911 = false;
                                            if (var2.field1920 != null) {
                                                class131 var13 = var2.field1920;
                                                if (var13.field1916 == null) {
                                                    if (var13.field1915 != null) {
                                                        if (class191.method1225(0, var3, var4)) {
                                                            class71.method484(var13.field1915, class148.field2113, class114.field1643, class71.field1104, class47.field663, var3, var4, true);
                                                        } else {
                                                            class71.method484(var13.field1915, class148.field2113, class114.field1643, class71.field1104, class47.field663, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class191.method1225(0, var3, var4)) {
                                                    class135.method917(var13.field1916, 0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var3, var4, true);
                                                } else {
                                                    class135.method917(var13.field1916, 0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var3, var4, false);
                                                }
                                                class288 var14 = var13.field1923;
                                                if (var14 != null) {
                                                    var14.field4557.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var14.field4556 - class96.field1456, var14.field4552 - class224.field3357, var14.field4559 - class162.field2363, var14.field4555, var5, (class112) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field1926; var15++) {
                                                    class162 var16 = var13.field1908[var15];
                                                    if (var16 != null) {
                                                        var16.field2348.method10(var16.field2337, class148.field2113, class114.field1643, class71.field1104, class47.field663, var16.field2351 - class96.field1456, var16.field2361 - class224.field3357, var16.field2343 - class162.field2363, var16.field2350, var5, (class112) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1916 == null) {
                                                if (var2.field1915 != null) {
                                                    if (class191.method1225(var6, var3, var4)) {
                                                        class71.method484(var2.field1915, class148.field2113, class114.field1643, class71.field1104, class47.field663, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class71.method484(var2.field1915, class148.field2113, class114.field1643, class71.field1104, class47.field663, var3, var4, false);
                                                    }
                                                }
                                            } else if (class191.method1225(var6, var3, var4)) {
                                                class135.method917(var2.field1916, var6, class148.field2113, class114.field1643, class71.field1104, class47.field663, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field1916.field2365 != 12345678 || class237.field3573 && var5 <= class145.field2080) {
                                                    class135.method917(var2.field1916, var6, class148.field2113, class114.field1643, class71.field1104, class47.field663, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class109 var18 = var2.field1930;
                                                if (var18 != null && (var18.field1578 & 0x80000000L) != 0L) {
                                                    var18.field1569.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var18.field1573 - class96.field1456, var18.field1583 - class224.field3357, var18.field1576 - class162.field2363, var18.field1578, var5, (class112) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class288 var21 = var2.field1923;
                                            class264 var22 = var2.field1928;
                                            if (var21 != null || var22 != null) {
                                                if (class114.field1641 == var3) {
                                                    var19++;
                                                } else if (class114.field1641 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class152.field2207 == var4) {
                                                    var19 += 3;
                                                } else if (class152.field2207 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class214.field3079[var19];
                                                var2.field1910 = class68.field1068[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field4562 & class23.field312[var19]) == 0) {
                                                    var2.field1922 = 0;
                                                } else if (var21.field4562 == 16) {
                                                    var2.field1922 = 3;
                                                    var2.field1914 = class193.field2768[var19];
                                                    var2.field1921 = 3 - var2.field1914;
                                                } else if (var21.field4562 == 32) {
                                                    var2.field1922 = 6;
                                                    var2.field1914 = class137.field1985[var19];
                                                    var2.field1921 = 6 - var2.field1914;
                                                } else if (var21.field4562 == 64) {
                                                    var2.field1922 = 12;
                                                    var2.field1914 = class162.field2345[var19];
                                                    var2.field1921 = 12 - var2.field1914;
                                                } else {
                                                    var2.field1922 = 9;
                                                    var2.field1914 = class269.field4214[var19];
                                                    var2.field1921 = 9 - var2.field1914;
                                                }
                                                if ((var21.field4562 & var20) != 0 && !class256.method1718(var6, var3, var4, var21.field4562)) {
                                                    var21.field4557.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var21.field4556 - class96.field1456, var21.field4552 - class224.field3357, var21.field4559 - class162.field2363, var21.field4555, var5, (class112) null);
                                                }
                                                if ((var21.field4561 & var20) != 0 && !class256.method1718(var6, var3, var4, var21.field4561)) {
                                                    var21.field4553.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var21.field4556 - class96.field1456, var21.field4552 - class224.field3357, var21.field4559 - class162.field2363, var21.field4555, var5, (class112) null);
                                                }
                                            }
                                            if (var22 != null && !class162.method1086(var6, var3, var4, var22.field3974.method36())) {
                                                if ((var22.field3968 & var20) != 0) {
                                                    var22.field3974.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var22.field3978 + var22.field3969 - class96.field1456, var22.field3986 - class224.field3357, var22.field3980 + var22.field3984 - class162.field2363, var22.field3979, var5, (class112) null);
                                                } else if (var22.field3968 == 256) {
                                                    int var23 = var22.field3978 - class96.field1456;
                                                    int var24 = var22.field3986 - class224.field3357;
                                                    int var25 = var22.field3980 - class162.field2363;
                                                    int var26 = var22.field3987;
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
                                                        var22.field3974.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var22.field3969 + var23, var24, var22.field3984 + var25, var22.field3979, var5, (class112) null);
                                                    } else if (var22.field3970 != null) {
                                                        var22.field3970.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var23, var24, var25, var22.field3979, var5, (class112) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class109 var29 = var2.field1930;
                                                if (var29 != null && (var29.field1578 & 0x80000000L) == 0L) {
                                                    var29.field1569.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var29.field1573 - class96.field1456, var29.field1583 - class224.field3357, var29.field1576 - class162.field2363, var29.field1578, var5, (class112) null);
                                                }
                                                class62 var30 = var2.field1931;
                                                if (var30 != null && var30.field1002 == 0) {
                                                    if (var30.field1004 != null) {
                                                        var30.field1004.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var30.field999 - class96.field1456, var30.field997 - class224.field3357, var30.field991 - class162.field2363, var30.field993, var5, (class112) null);
                                                    }
                                                    if (var30.field1005 != null) {
                                                        var30.field1005.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var30.field999 - class96.field1456, var30.field997 - class224.field3357, var30.field991 - class162.field2363, var30.field993, var5, (class112) null);
                                                    }
                                                    if (var30.field998 != null) {
                                                        var30.field998.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var30.field999 - class96.field1456, var30.field997 - class224.field3357, var30.field991 - class162.field2363, var30.field993, var5, (class112) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1932;
                                            if (var31 != 0) {
                                                if (var3 < class114.field1641 && (var31 & 0x4) != 0) {
                                                    class131 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1907) {
                                                        class54.field808.method652(110, var32);
                                                    }
                                                }
                                                if (var4 < class152.field2207 && (var31 & 0x2) != 0) {
                                                    class131 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1907) {
                                                        class54.field808.method652(72, var33);
                                                    }
                                                }
                                                if (var3 > class114.field1641 && (var31 & 0x1) != 0) {
                                                    class131 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1907) {
                                                        class54.field808.method652(111, var34);
                                                    }
                                                }
                                                if (var4 > class152.field2207 && (var31 & 0x8) != 0) {
                                                    class131 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1907) {
                                                        class54.field808.method652(93, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1922 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1926; var37++) {
                                                if (class242.field3649 != var2.field1908[var37].field2346 && (var2.field1927[var37] & var2.field1922) == var2.field1914) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class288 var38 = var2.field1923;
                                                if (!class256.method1718(var6, var3, var4, var38.field4562)) {
                                                    var38.field4557.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var38.field4556 - class96.field1456, var38.field4552 - class224.field3357, var38.field4559 - class162.field2363, var38.field4555, var5, (class112) null);
                                                }
                                                var2.field1922 = 0;
                                            }
                                        }
                                        if (!var2.field1929) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1926;
                                            var2.field1929 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class162 var42 = var2.field1908[var41];
                                                if (class242.field3649 != var42.field2346) {
                                                    for (int var43 = var42.field2353; var43 <= var42.field2362; var43++) {
                                                        for (int var44 = var42.field2357; var44 <= var42.field2340; var44++) {
                                                            class131 var45 = var7[var43][var44];
                                                            if (var45.field1911) {
                                                                var2.field1929 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field1922 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2353) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2362) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2357) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2340) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1922) == var2.field1921) {
                                                                    var2.field1929 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class27.field401[var40++] = var42;
                                                    int var47 = class114.field1641 - var42.field2353;
                                                    int var48 = var42.field2362 - class114.field1641;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class152.field2207 - var42.field2357;
                                                    int var50 = var42.field2340 - class152.field2207;
                                                    if (var50 > var49) {
                                                        var42.field2339 = var47 + var50;
                                                    } else {
                                                        var42.field2339 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class162 var54 = class27.field401[var53];
                                                    if (class242.field3649 != var54.field2346) {
                                                        if (var54.field2339 > var51) {
                                                            var51 = var54.field2339;
                                                            var52 = var53;
                                                        } else if (var54.field2339 == var51) {
                                                            int var55 = var54.field2351 - class96.field1456;
                                                            int var56 = var54.field2343 - class162.field2363;
                                                            int var57 = class27.field401[var52].field2351 - class96.field1456;
                                                            int var58 = class27.field401[var52].field2343 - class162.field2363;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class162 var59 = class27.field401[var52];
                                                var59.field2346 = class242.field3649;
                                                if (!class95.method640(var6, var59.field2353, var59.field2362, var59.field2357, var59.field2340, var59.field2348.method36())) {
                                                    var59.field2348.method10(var59.field2337, class148.field2113, class114.field1643, class71.field1104, class47.field663, var59.field2351 - class96.field1456, var59.field2361 - class224.field3357, var59.field2343 - class162.field2363, var59.field2350, var5, (class112) null);
                                                }
                                                for (int var60 = var59.field2353; var60 <= var59.field2362; var60++) {
                                                    for (int var61 = var59.field2357; var61 <= var59.field2340; var61++) {
                                                        class131 var62 = var7[var60][var61];
                                                        if (var62.field1922 != 0) {
                                                            class54.field808.method652(114, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1907) {
                                                            class54.field808.method652(62, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1929) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field1929 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1907);
                            } while (var2.field1922 != 0);
                            if (var3 > class114.field1641 || var3 <= class119.field1751) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field1907);
                        if (var3 < class114.field1641 || var3 >= class162.field2352 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field1907);
                    if (var4 > class152.field2207 || var4 <= class28.field406) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field1907);
                if (var4 < class152.field2207 || var4 >= class281.field4482 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field1907);
            var2.field1907 = false;
            class204.field2960--;
            class62 var67 = var2.field1931;
            if (var67 != null && var67.field1002 != 0) {
                if (var67.field1004 != null) {
                    var67.field1004.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var67.field999 - class96.field1456, var67.field997 - class224.field3357 - var67.field1002, var67.field991 - class162.field2363, var67.field993, var5, (class112) null);
                }
                if (var67.field1005 != null) {
                    var67.field1005.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var67.field999 - class96.field1456, var67.field997 - class224.field3357 - var67.field1002, var67.field991 - class162.field2363, var67.field993, var5, (class112) null);
                }
                if (var67.field998 != null) {
                    var67.field998.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var67.field999 - class96.field1456, var67.field997 - class224.field3357 - var67.field1002, var67.field991 - class162.field2363, var67.field993, var5, (class112) null);
                }
            }
            if (var2.field1910 != 0) {
                class264 var68 = var2.field1928;
                if (var68 != null && !class162.method1086(var6, var3, var4, var68.field3974.method36())) {
                    if ((var68.field3968 & var2.field1910) != 0) {
                        var68.field3974.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var68.field3978 + var68.field3969 - class96.field1456, var68.field3986 - class224.field3357, var68.field3980 + var68.field3984 - class162.field2363, var68.field3979, var5, (class112) null);
                    } else if (var68.field3968 == 256) {
                        int var69 = var68.field3978 - class96.field1456;
                        int var70 = var68.field3986 - class224.field3357;
                        int var71 = var68.field3980 - class162.field2363;
                        int var72 = var68.field3987;
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
                            var68.field3974.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var68.field3969 + var69, var70, var68.field3984 + var71, var68.field3979, var5, (class112) null);
                        } else if (var68.field3970 != null) {
                            var68.field3970.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var69, var70, var71, var68.field3979, var5, (class112) null);
                        }
                    }
                }
                class288 var75 = var2.field1923;
                if (var75 != null) {
                    if ((var75.field4561 & var2.field1910) != 0 && !class256.method1718(var6, var3, var4, var75.field4561)) {
                        var75.field4553.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var75.field4556 - class96.field1456, var75.field4552 - class224.field3357, var75.field4559 - class162.field2363, var75.field4555, var5, (class112) null);
                    }
                    if ((var75.field4562 & var2.field1910) != 0 && !class256.method1718(var6, var3, var4, var75.field4562)) {
                        var75.field4557.method10(0, class148.field2113, class114.field1643, class71.field1104, class47.field663, var75.field4556 - class96.field1456, var75.field4552 - class224.field3357, var75.field4559 - class162.field2363, var75.field4555, var5, (class112) null);
                    }
                }
            }
            if (var5 < class5.field36 - 1) {
                class131 var76 = class16.field233[var5 + 1][var3][var4];
                if (var76 != null && var76.field1907) {
                    class54.field808.method652(111, var76);
                }
            }
            if (var3 < class114.field1641) {
                class131 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field1907) {
                    class54.field808.method652(99, var77);
                }
            }
            if (var4 < class152.field2207) {
                class131 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field1907) {
                    class54.field808.method652(60, var78);
                }
            }
            if (var3 > class114.field1641) {
                class131 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field1907) {
                    class54.field808.method652(91, var79);
                }
            }
            if (var4 > class152.field2207) {
                class131 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field1907) {
                    class54.field808.method652(106, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ltk;IIIII)V")
    public static final void method1916(class219 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class5.field36 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class90.field1372) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class225.field3383 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class131 var14 = class16.field233[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class107.field1556[var11][var12 + 1][var13] + class107.field1556[var11][var12][var13] + class107.field1556[var11][var12][var13 + 1] + class107.field1556[var11][var12 + 1][var13 + 1]) / 4 - (class107.field1556[arg1][arg2 + 1][arg3] + class107.field1556[arg1][arg2][arg3] + class107.field1556[arg1][arg2][arg3 + 1] + class107.field1556[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class288 var16 = var14.field1923;
                                    if (var16 != null) {
                                        if (var16.field4557.method864()) {
                                            arg0.method884(var16.field4557, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4553 != null && var16.field4553.method864()) {
                                            arg0.method884(var16.field4553, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1926; var17++) {
                                        class162 var18 = var14.field1908[var17];
                                        if (var18 != null && var18.field2348.method864() && (var18.field2353 == var12 || var7 == var12) && (var18.field2357 == var13 || var9 == var13)) {
                                            int var19 = var18.field2362 + 1 - var18.field2353;
                                            int var20 = var18.field2340 + 1 - var18.field2357;
                                            arg0.method884(var18.field2348, (var18.field2353 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2357 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V")
    public static final void method1917() {
        for (int var0 = 0; var0 < class158.field2288; var0++) {
            class162 var1 = class268.field4197[var0];
            class159.method1068(var1);
            class268.field4197[var0] = null;
        }
        class158.field2288 = 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Lwg;")
    public final class254 method1918(byte arg0) {
        int var2 = 106 % ((arg0 - 65) / 43);
        field4535++;
        this.field4536 = 0;
        return this.method1921((byte) -90);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method1919(int arg0) {
        if (arg0 < 76) {
            field4533 = null;
        }
        field4533 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lca;B)V")
    public static final void method1920(class83 arg0, byte arg1) {
        field4540++;
        class4 var2 = null;
        try {
            class239 var3 = arg0.method559(12, "runescape");
            while (var3.field3588 == 0) {
                class98.method660(1L, -120);
            }
            int var4 = -81 % ((arg1 + 72) / 42);
            if (var3.field3588 == 1) {
                var2 = (class4) var3.field3585;
                class114 var5 = class235.method1547(0);
                var2.method52(1, 0, var5.field1629, var5.field1673);
            }
        } catch (Exception var7) {
        }
        try {
            if (var2 != null) {
                var2.method50(1);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Lwg;")
    public final class254 method1921(byte arg0) {
        if (arg0 != -90) {
            method1922(-108);
        }
        field4538++;
        if (this.field4536 > 0 && this.field4541.field2698[this.field4536 - 1] != this.field4534) {
            class254 var2 = this.field4534;
            this.field4534 = var2.field3859;
            return var2;
        }
        while (this.field4541.field2687 > this.field4536) {
            class254 var3 = this.field4541.field2698[this.field4536++].field3859;
            if (this.field4541.field2698[this.field4536 - 1] != var3) {
                this.field4534 = var3.field3859;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method1922(int arg0) {
        field4539++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class56.method380(-1, var3, var2, true, class16.field233, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != -105) {
            field4533 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I")
    public static final int method1923(int arg0, int arg1) {
        field4537++;
        if (arg0 == -1) {
            return arg1 == 16711935 ? -1 : class220.method1416(arg1, (byte) -47);
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lh;)V")
    public class285(class190 arg0) {
        this.field4541 = arg0;
    }
}
