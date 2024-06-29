import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class185 {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3041 = " ";

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "[I")
    public static int[] field3046 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Z")
    public static boolean field3037 = false;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Luc;")
    public static class115 field3040;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lsb;")
    public static class124 field3045;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[[[B")
    public static byte[][][] field3042;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III[Lkj;IIIIII)V")
    public static final void method1287(int arg0, int arg1, int arg2, class114[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3038++;
        if (arg5 != 1) {
            field3040 = null;
        }
        class63.method477(arg8, arg9, arg0, arg2);
        class95.method713();
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class114 var11 = arg3[var10];
            if (var11 != null && (var11.field1910 == arg7 || arg7 == -1412584499 && class23.field365 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class220.field3522[class258.field4114] = var11.field1779 + arg4;
                    class252.field4009[class258.field4114] = var11.field1875 + arg6;
                    class164.field2670[class258.field4114] = var11.field1790;
                    class287.field4594[class258.field4114] = var11.field1919;
                    var12 = class258.field4114++;
                } else {
                    var12 = arg1;
                }
                var11.field1926 = class207.field3336;
                var11.field1874 = var12;
                if (!var11.field1765 || !client.method1928(var11)) {
                    if (var11.field1929 > 0) {
                        class268.method1824(2, var11);
                    }
                    int var13 = var11.field1779 + arg4;
                    int var14 = var11.field1875 + arg6;
                    int var15 = var11.field1772;
                    if (class199.field3247 && (client.method1916(var11).field4028 != 0 || var11.field1898 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class23.field365 == var11) {
                        if (arg7 != -1412584499 && !var11.field1771) {
                            class11.field157 = arg6;
                            class144.field2378 = arg4;
                            class265.field4232 = arg3;
                            continue;
                        }
                        if (!var11.field1771) {
                            var15 = 128;
                        }
                        if (class141.field2343 && class140.field2337) {
                            int var16 = class269.field4311;
                            int var17 = class165.field2719;
                            int var18 = var17 - class14.field220;
                            if (class212.field3398 > var18) {
                                var18 = class212.field3398;
                            }
                            int var19 = var16 - class255.field4064;
                            if ((var11.field1919 + var18) > (class212.field3398 + class189.field3092.field1919)) {
                                var18 = class189.field3092.field1919 + class212.field3398 - var11.field1919;
                            }
                            if (class160.field2616 > var19) {
                                var19 = class160.field2616;
                            }
                            var14 = var18;
                            if (class160.field2616 + class189.field3092.field1790 < var11.field1790 + var19) {
                                var19 = class160.field2616 + class189.field3092.field1790 - var11.field1790;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field1898 == 2) {
                        var25 = arg0;
                        var24 = arg2;
                        var20 = arg9;
                        var23 = arg8;
                    } else {
                        var20 = arg9 >= var14 ? arg9 : var14;
                        int var21 = var14 + var11.field1919;
                        int var22 = var11.field1790 + var13;
                        var23 = var13 <= arg8 ? arg8 : var13;
                        if (var11.field1898 == 9) {
                            var21++;
                            var22++;
                        }
                        var24 = var21 >= arg2 ? arg2 : var21;
                        var25 = arg0 <= var22 ? arg0 : var22;
                    }
                    if (!var11.field1765 || var25 > var23 && var24 > var20) {
                        if (var11.field1929 != 0) {
                            if (var11.field1929 == 1337 || var11.field1929 == 1403) {
                                class216.field3464 = var14;
                                class279.field4430 = var13;
                                class181.field3006 = var11;
                                class225.method1509(var11.field1929 == 1403, var13, (byte) -100, var11.field1919, var11.field1790, var14);
                                class118.field1991[var12] = true;
                                class63.method477(arg8, arg9, arg0, arg2);
                                continue;
                            }
                            if (var11.field1929 == 1338) {
                                if (!var11.method850((byte) 106)) {
                                    continue;
                                }
                                class110.method819(var13, var11, var14, var12, (byte) 37);
                                class63.method477(arg8, arg9, arg0, arg2);
                                if (class151.field2474 != 0 && class151.field2474 != 3 || class198.field3226 || var23 > class251.field3997 || var20 > class180.field3002 || var25 <= class251.field3997 || class180.field3002 >= var24) {
                                    continue;
                                }
                                int var26 = class180.field3002 - var14;
                                int var27 = var11.field1782[var26];
                                int var28 = class251.field3997 - var13;
                                if (var28 < var27 || (var11.field1872[var26] + var27) < var28) {
                                    continue;
                                }
                                int var29 = var28 - var11.field1790 / 2;
                                int var30 = (int) class1.field1 + class183.field3022 & 0x7FF;
                                int var31 = var26 - var11.field1919 / 2;
                                int var32 = class95.field1482[var30];
                                int var33 = class95.field1475[var30];
                                int var34 = (class131.field2184 + 256) * var33 >> 8;
                                int var35 = (class131.field2184 + 256) * var32 >> 8;
                                int var36 = var31 * var34 - (var29 * var35) >> 11;
                                int var37 = var29 * var34 + var31 * var35 >> 11;
                                int var38 = class48.field878.field2849 + var37 - ((class48.field878.method1226((byte) -97) + -1) * 64) >> 7;
                                int var39 = class48.field878.field2887 - var36 - (class48.field878.method1226((byte) -98) - 1) * 64 >> 7;
                                if (class239.field3761 && (class111.field1708 & 0x40) != 0) {
                                    class114 var40 = class129.method939(class33.field550, 36, class7.field90);
                                    if (var40 == null) {
                                        class281.method1886(-20);
                                    } else {
                                        class107.method798(1L, false, class110.field1702, (short) 7, var39, " ->", class135.field2226, var38);
                                    }
                                    continue;
                                }
                                if (class238.field3752 == 1) {
                                    class107.method798(1L, false, -1, (short) 13, var39, "", class204.field3286, var38);
                                }
                                class107.method798(1L, false, -1, (short) 5, var39, "", class139.field2328, var38);
                                continue;
                            }
                            if (var11.field1929 == 1339) {
                                if (var11.method850((byte) 106)) {
                                    class291.method1951(var14, var11, var13, var12, (byte) 40);
                                    class63.method477(arg8, arg9, arg0, arg2);
                                }
                                continue;
                            }
                            if (var11.field1929 == 1400) {
                                class36.method305(var14, 0, var13, var11.field1790, var11.field1919);
                                class118.field1991[var12] = true;
                                class229.field3659[var12] = true;
                                class63.method477(arg8, arg9, arg0, arg2);
                                continue;
                            }
                            if (var11.field1929 == 1401) {
                                class27.method239(var11.field1919, var14, var11.field1790, var13, arg5 + 24);
                                class118.field1991[var12] = true;
                                class229.field3659[var12] = true;
                                class63.method477(arg8, arg9, arg0, arg2);
                                continue;
                            }
                            if (var11.field1929 == 1402) {
                                class31.method268((byte) 89, var14, var13);
                                class118.field1991[var12] = true;
                                class229.field3659[var12] = true;
                                continue;
                            }
                            if (var11.field1929 == 1405) {
                                if (!class258.field4095) {
                                    continue;
                                }
                                int var41 = var11.field1790 + var13;
                                int var42 = var14 + 15;
                                class106.field1617.method577("Fps:" + class127.field2093, var41, var42, 16776960, -1);
                                int var43 = 16776960;
                                int var131 = var42 + 15;
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = 0;
                                int var46 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                if (var46 > 65536) {
                                    var43 = 16711680;
                                }
                                int var47 = 0;
                                class106.field1617.method577("Mem:" + var46 + "k", var41, var131, var43, -1);
                                int var48 = 16776960;
                                int var49 = 0;
                                var42 = var131 + 15;
                                for (int var50 = 0; var50 < 29; var50++) {
                                    var47 += class267.field4276[var50].method404((byte) 82);
                                    var45 += class267.field4276[var50].method405(25547);
                                    var49 += class267.field4276[var50].method403(-26);
                                }
                                int var51 = var49 * 100 / var47;
                                int var52 = var45 * 10000 / var47;
                                String var53 = "Cache:" + class223.method1498(true, 0, true, (long) var52, 2) + "% (" + var51 + "%)";
                                class198.field3231.method577(var53, var41, var42, var48, -1);
                                class118.field1991[var12] = true;
                                class229.field3659[var12] = true;
                                var42 += 12;
                                continue;
                            }
                            if (var11.field1929 == 1406) {
                                class3.field40 = var11;
                                class189.field3102 = var14;
                                class66.field1076 = var13;
                                continue;
                            }
                        }
                        if (!class198.field3226) {
                            if (var11.field1898 == 0 && var11.field1818 && class251.field3997 >= var23 && var20 <= class180.field3002 && var25 > class251.field3997 && var24 > class180.field3002 && !class199.field3247) {
                                class94.field1468[0] = 1001;
                                class42.field776 = 1;
                                class47.field840[0] = class253.field4033;
                                class217.field3488[0] = "";
                                class251.field3993[0] = class96.field1494;
                            }
                            if (var23 <= class251.field3997 && var20 <= class180.field3002 && var25 > class251.field3997 && class180.field3002 < var24) {
                                class256.method1714(class180.field3002 - var14, var11, class251.field3997 - var13, 65);
                            }
                        }
                        if (var11.field1898 == 0) {
                            if (!var11.field1765 && client.method1928(var11) && class89.field1424 != var11) {
                                continue;
                            }
                            if (!var11.field1765) {
                                if (var11.field1842 > var11.field1807 - var11.field1919) {
                                    var11.field1842 = var11.field1807 - var11.field1919;
                                }
                                if (var11.field1842 < 0) {
                                    var11.field1842 = 0;
                                }
                            }
                            method1287(var25, var12, var24, arg3, var13 - var11.field1828, 1, var14 - var11.field1842, var11.field1789, var23, var20);
                            if (var11.field1820 != null) {
                                method1287(var25, var12, var24, var11.field1820, var13 - var11.field1828, arg5, var14 - var11.field1842, var11.field1789, var23, var20);
                            }
                            class167 var54 = (class167) class91.field1434.method1063((byte) -45, (long) var11.field1789);
                            if (var54 != null) {
                                if (var54.field2755 == 0 && !class198.field3226 && var23 <= class251.field3997 && var20 <= class180.field3002 && var25 > class251.field3997 && class180.field3002 < var24 && !class199.field3247) {
                                    class47.field840[0] = class253.field4033;
                                    class251.field3993[0] = class96.field1494;
                                    class42.field776 = 1;
                                    class217.field3488[0] = "";
                                    class94.field1468[0] = 1001;
                                }
                                class288.method1941(var20, var14, var25, var12, (byte) 94, var13, var24, var23, var54.field2756);
                            }
                            class63.method477(arg8, arg9, arg0, arg2);
                            class95.method713();
                        }
                        if (class245.field3862[var12] || class229.field3657 > 1) {
                            if (var11.field1898 == 0 && !var11.field1765 && var11.field1807 > var11.field1919) {
                                class151.method1100(var11.field1807, var14, var11.field1790 + var13, arg5 + -26119, var11.field1842, var11.field1919);
                            }
                            if (var11.field1898 != 1) {
                                if (var11.field1898 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field1902; var56++) {
                                        for (int var57 = 0; var57 < var11.field1752; var57++) {
                                            int var58 = (var11.field1829 + 32) * var57 + var13;
                                            int var59 = (var11.field1793 + 32) * var56 + var14;
                                            if (var55 < 20) {
                                                var58 += var11.field1877[var55];
                                                var59 += var11.field1761[var55];
                                            }
                                            if (var11.field1785[var55] > 0) {
                                                boolean var61 = false;
                                                boolean var62 = false;
                                                int var63 = var11.field1785[var55] - 1;
                                                if (arg8 < (var58 + 32) && arg0 > var58 && var59 + 32 > arg9 && var59 < arg2 || class174.field2929 == var11 && class66.field1089 == var55) {
                                                    class102 var64;
                                                    if (class219.field3514 == 1 && class189.field3104 == var55 && class258.field4106 == var11.field1789) {
                                                        var64 = class48.method415(2, var11.field1777[var55], var63, 0, (class81) null, false, var11.field1806);
                                                    } else {
                                                        var64 = class48.method415(1, var11.field1777[var55], var63, 3153952, (class81) null, false, var11.field1806);
                                                    }
                                                    if (class95.field1488) {
                                                        class118.field1991[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class72.method556(arg5 ^ 0x1, var11);
                                                    } else if (class174.field2929 == var11 && class66.field1089 == var55) {
                                                        int var65 = class165.field2719 - class208.field3340;
                                                        int var66 = class269.field4311 - field3043;
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class104.field1591 < 5) {
                                                            var65 = 0;
                                                            var66 = 0;
                                                        }
                                                        var64.method113(var58 + var66, var59 + var65, 128);
                                                        if (arg7 != -1) {
                                                            class114 var67 = arg3[arg7 & 0xFFFF];
                                                            int var68 = class63.field1052;
                                                            int var69 = class63.field1055;
                                                            if (var68 > (var59 + var65) && var67.field1842 > 0) {
                                                                int var70 = (var68 - var59 - var65) * class232.field3681 / 3;
                                                                if (var70 > (class232.field3681 * 10)) {
                                                                    var70 = class232.field3681 * 10;
                                                                }
                                                                if (var70 > var67.field1842) {
                                                                    var70 = var67.field1842;
                                                                }
                                                                var67.field1842 -= var70;
                                                                class208.field3340 += var70;
                                                                class72.method556(0, var67);
                                                            }
                                                            if (var69 < (var65 + var59 + 32) && var67.field1842 < var67.field1807 - var67.field1919) {
                                                                int var71 = (var59 + var65 + 32 - var69) * class232.field3681 / 3;
                                                                if (class232.field3681 * 10 < var71) {
                                                                    var71 = class232.field3681 * 10;
                                                                }
                                                                if (var67.field1807 - var67.field1919 - var67.field1842 < var71) {
                                                                    var71 = var67.field1807 - var67.field1919 - var67.field1842;
                                                                }
                                                                class208.field3340 -= var71;
                                                                var67.field1842 += var71;
                                                                class72.method556(0, var67);
                                                            }
                                                        }
                                                    } else if (class135.field2223 == var11 && class216.field3470 == var55) {
                                                        var64.method113(var58, var59, 128);
                                                    } else {
                                                        var64.method124(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field1847 != null && var55 < 20) {
                                                class102 var60 = var11.method851(-1, var55);
                                                if (var60 != null) {
                                                    var60.method124(var58, var59);
                                                } else if (class104.field1594) {
                                                    class72.method556(0, var11);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field1898 == 3) {
                                    int var72;
                                    if (class49.method418(-1, var11)) {
                                        var72 = var11.field1895;
                                        if (class89.field1424 == var11 && var11.field1839 != 0) {
                                            var72 = var11.field1839;
                                        }
                                    } else {
                                        var72 = var11.field1843;
                                        if (class89.field1424 == var11 && var11.field1845 != 0) {
                                            var72 = var11.field1845;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1764) {
                                            class63.method493(var13, var14, var11.field1790, var11.field1919, var72);
                                        } else {
                                            class63.method492(var13, var14, var11.field1790, var11.field1919, var72);
                                        }
                                    } else if (var11.field1764) {
                                        class63.method491(var13, var14, var11.field1790, var11.field1919, var72, 256 - (var15 & 0xFF));
                                    } else {
                                        class63.method495(var13, var14, var11.field1790, var11.field1919, var72, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1898 == 4) {
                                    class73 var73 = var11.method843(102, class101.field1550);
                                    if (var73 != null) {
                                        String var74 = var11.field1800;
                                        int var75;
                                        if (class49.method418(-1, var11)) {
                                            var75 = var11.field1895;
                                            if (class89.field1424 == var11 && var11.field1839 != 0) {
                                                var75 = var11.field1839;
                                            }
                                            if (var11.field1760.length() > 0) {
                                                var74 = var11.field1760;
                                            }
                                        } else {
                                            var75 = var11.field1843;
                                            if (class89.field1424 == var11 && var11.field1845 != 0) {
                                                var75 = var11.field1845;
                                            }
                                        }
                                        if (var11.field1765 && var11.field1920 != -1) {
                                            class67 var76 = class190.method1314(var11.field1920, (byte) 68);
                                            var74 = var76.field1155;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field1152 == 1 || var11.field1796 != 1) && var11.field1796 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class82.method663(false, var11.field1796);
                                            }
                                        }
                                        if (class295.field4677 == var11) {
                                            var75 = var11.field1843;
                                            var74 = class47.field839;
                                        }
                                        if (!var11.field1765) {
                                            var74 = class241.method1590(1, var74, var11);
                                        }
                                        var73.method569(var74, var13, var14, var11.field1790, var11.field1919, var75, var11.field1801 ? 0 : -1, var11.field1905, var11.field1904, var11.field1923);
                                    } else if (class104.field1594) {
                                        class72.method556(arg5 ^ 0x1, var11);
                                    }
                                } else if (var11.field1898 == 5) {
                                    if (!var11.field1765) {
                                        class102 var77 = var11.method848(1, class49.method418(-1, var11));
                                        if (var77 != null) {
                                            var77.method124(var13, var14);
                                        } else if (class104.field1594) {
                                            class72.method556(0, var11);
                                        }
                                    } else if (var11.field1855 >= 0) {
                                        class121 var86 = var11.method840((byte) 93);
                                        var86.method880(0, var13, var14, var11.field1790, var11.field1919, var11.field1913, var11.field1888, 0);
                                    } else {
                                        class102 var78;
                                        if (var11.field1920 == -1) {
                                            var78 = var11.method848(1, false);
                                        } else if (var11.field1906 && class48.field878.field3439 != null) {
                                            var78 = class48.method415(var11.field1754, var11.field1796, var11.field1920, var11.field1815, class48.field878.field3439, false, var11.field1806);
                                        } else {
                                            var78 = class48.method415(var11.field1754, var11.field1796, var11.field1920, var11.field1815, (class81) null, false, var11.field1806);
                                        }
                                        if (var78 != null) {
                                            int var79 = var78.field1554;
                                            int var80 = var78.field1556;
                                            if (var11.field1762) {
                                                int var82 = (var79 + var11.field1790 - 1) / var79;
                                                int var83 = (var11.field1919 + var80 - 1) / var80;
                                                class63.method487(var13, var14, var11.field1790 + var13, var11.field1919 + var14);
                                                for (int var84 = 0; var84 < var82; var84++) {
                                                    for (int var85 = 0; var85 < var83; var85++) {
                                                        if (var11.field1844 != 0) {
                                                            var78.method756(var11.field1844, var80 / 2 + var14 + (var80 * var85), 4096, arg5 + 43, var13 - -(var79 * var84) - -(var79 / 2));
                                                        } else if (var15 == 0) {
                                                            var78.method124(var13 + (var79 * var84), var80 * var85 + var14);
                                                        } else {
                                                            var78.method113(var79 * var84 + var13, var14 - -(var80 * var85), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class63.method477(arg8, arg9, arg0, arg2);
                                            } else {
                                                int var81 = var11.field1790 * 4096 / var79;
                                                if (var11.field1844 != 0) {
                                                    var78.method756(var11.field1844, var11.field1919 / 2 + var14, var81, 48, var11.field1790 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var78.method109(var13, var14, var11.field1790, var11.field1919, 256 - (var15 & 0xFF));
                                                } else if (var11.field1790 == var79 && var11.field1919 == var80) {
                                                    var78.method124(var13, var14);
                                                } else {
                                                    var78.method132(var13, var14, var11.field1790, var11.field1919);
                                                }
                                            }
                                        } else if (class104.field1594) {
                                            class72.method556(0, var11);
                                        }
                                    }
                                } else if (var11.field1898 == 6) {
                                    boolean var87 = class49.method418(-1, var11);
                                    int var88;
                                    if (var87) {
                                        var88 = var11.field1750;
                                    } else {
                                        var88 = var11.field1816;
                                    }
                                    class168 var89 = null;
                                    int var90 = 0;
                                    if (var11.field1920 != -1) {
                                        class67 var91 = class190.method1314(var11.field1920, (byte) 68);
                                        if (var91 != null) {
                                            class67 var92 = var91.method517((byte) -114, var11.field1796);
                                            class77 var93 = var88 == -1 ? null : class28.method246(-76, var88);
                                            if (var11.field1906 && class48.field878.field3439 != null) {
                                                var89 = var92.method521(var93, 1, class48.field878.field3439, -1, var11.field1825, var11.field1819, var11.field1912);
                                            } else {
                                                var89 = var92.method521(var93, 1, (class81) null, -1, var11.field1825, var11.field1819, var11.field1912);
                                            }
                                            if (var89 == null) {
                                                class72.method556(0, var11);
                                            } else {
                                                var90 = -var89.method99() / 2;
                                            }
                                        }
                                    } else if (var11.field1892 == 5) {
                                        if (var11.field1931 == -1) {
                                            var89 = class204.field3282.method647(-1, -1, 0, 0, true, (class77) null, (class77) null, true, -1, (class161[]) null, -1);
                                        } else {
                                            int var95 = var11.field1931 & 0x7FF;
                                            if (class288.field4607 == var95) {
                                                var95 = 2047;
                                            }
                                            class213 var96 = class191.field3129[var95];
                                            class77 var97 = var88 == -1 ? null : class28.method246(75, var88);
                                            if (var96 != null && (int) class260.method1739(false, var96.field3445) << 11 == (var11.field1931 & 0xFFFFF800)) {
                                                var89 = var96.field3439.method647(-1, var11.field1819, 0, 0, true, (class77) null, var97, true, -1, (class161[]) null, 0);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var89 = var11.method853(0, var87, class48.field878.field3439, -1, -1, 0, (class77) null);
                                        if (var89 == null && class104.field1594) {
                                            class72.method556(0, var11);
                                        }
                                    } else {
                                        class77 var94 = class28.method246(83, var88);
                                        var89 = var11.method853(0, var87, class48.field878.field3439, var11.field1912, var11.field1819, var11.field1825, var94);
                                        if (var89 == null && class104.field1594) {
                                            class72.method556(arg5 - 1, var11);
                                        }
                                    }
                                    if (var89 != null) {
                                        int var98;
                                        if (var11.field1909 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field1790 << 8) / var11.field1909;
                                        }
                                        int var99;
                                        if (var11.field1861 > 0) {
                                            var99 = (var11.field1919 << 8) / var11.field1861;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = (var11.field1799 * var98 >> 8) + (var13 + (var11.field1790 / 2));
                                        int var101 = (var11.field1870 * var99 >> 8) + var11.field1919 / 2 + var14;
                                        class95.method720(var100, var101);
                                        int var102 = class95.field1475[var11.field1863] * var11.field1868 >> 16;
                                        int var103 = class95.field1482[var11.field1863] * var11.field1868 >> 16;
                                        if (!var11.field1765) {
                                            var89.method362(0, var11.field1756, 0, var11.field1863, 0, var103, var102, -1L);
                                        } else if (var11.field1798) {
                                            ((class41) var89).method365(0, var11.field1756, var11.field1823, var11.field1863, var11.field1858, var90 + var103 + var11.field1899, var102 - -var11.field1899, var11.field1868);
                                        } else {
                                            var89.method362(0, var11.field1756, var11.field1823, var11.field1863, var11.field1858, var103 + var90 + var11.field1899, var11.field1899 + var102, -1L);
                                        }
                                        class95.method724();
                                    }
                                } else {
                                    if (var11.field1898 == 7) {
                                        class73 var104 = var11.method843(119, class101.field1550);
                                        if (var104 == null) {
                                            if (class104.field1594) {
                                                class72.method556(0, var11);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var11.field1902; var106++) {
                                            for (int var107 = 0; var107 < var11.field1752; var107++) {
                                                if (var11.field1785[var105] > 0) {
                                                    class67 var108 = class190.method1314(var11.field1785[var105] - 1, (byte) 68);
                                                    String var109;
                                                    if (var108.field1152 != 1 && var11.field1777[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field1155 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field1155 + "</col> x" + class82.method663(false, var11.field1777[var105]);
                                                    }
                                                    int var110 = (var11.field1829 + 115) * var107 + var13;
                                                    int var111 = (var11.field1793 + 12) * var106 + var14;
                                                    if (var11.field1905 == 0) {
                                                        var104.method578(var109, var110, var111, var11.field1843, var11.field1801 ? 0 : -1);
                                                    } else if (var11.field1905 == 1) {
                                                        var104.method568(var109, var110 + 57, var111, var11.field1843, var11.field1801 ? 0 : -1);
                                                    } else {
                                                        var104.method577(var109, var110 + 115 - 1, var111, var11.field1843, var11.field1801 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var11.field1898 == 8 && class216.field3472 == var11 && class227.field3613 == class198.field3227) {
                                        int var112 = 0;
                                        class73 var113 = class106.field1617;
                                        int var114 = 0;
                                        String var115 = var11.field1800;
                                        String var116 = class241.method1590(1, var115, var11);
                                        while (var116.length() > 0) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = "";
                                            } else {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            }
                                            int var126 = var113.method579(var125);
                                            var112 += var113.field1220 + 1;
                                            if (var114 < var126) {
                                                var114 = var126;
                                            }
                                        }
                                        var112 += 7;
                                        var114 += 6;
                                        int var117 = var11.field1790 + var13 - var114 - 5;
                                        if ((var13 + 5) > var117) {
                                            var117 = var13 + 5;
                                        }
                                        int var118 = var14 + var11.field1919 + 5;
                                        if (arg2 < (var112 + var118)) {
                                            var118 = arg2 - var112;
                                        }
                                        if ((var114 + var117) > arg0) {
                                            var117 = arg0 - var114;
                                        }
                                        class63.method493(var117, var118, var114, var112, 16777120);
                                        class63.method492(var117, var118, var114, var112, 0);
                                        String var119 = var11.field1800;
                                        int var120 = var113.field1220 + var118 + 2;
                                        String var121 = class241.method1590(1, var119, var11);
                                        while (var121.length() > 0) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var113.method578(var123, var117 + 3, var120, 0, -1);
                                            var120 += var113.field1220 + 1;
                                        }
                                    }
                                    if (var11.field1898 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var11.field1908) {
                                            var129 = var11.field1790 + var13;
                                            var130 = var13;
                                            var128 = var11.field1919 + var14;
                                            var127 = var14;
                                        } else {
                                            var127 = var11.field1919 + var14;
                                            var128 = var14;
                                            var129 = var13 + var11.field1790;
                                            var130 = var13;
                                        }
                                        if (var11.field1768 == 1) {
                                            class63.method475(var130, var128, var129, var127, var11.field1843);
                                        } else {
                                            class63.method476(var130, var128, var129, var127, var11.field1843, var11.field1768);
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

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method1288(int arg0) {
        class50.field926 = "M";
        class244.field3858 = "Tela título aberta";
        class256.field4074 = "Remova ";
        class230.field3663 = "Objeto para membros";
        class160.field2612 = "Interfaces carregadas";
        class105.field1607 = "Carregando pacote de palavras - ";
        class111.field1720 = " já está na sua lista de ignorados.";
        class230.field3664 = "Atacar";
        class91.field1443 = "Conectando ao servidor de atualização";
        class156.field2541 = "Carregando config - ";
        class32.field531 = "Carregando...";
        class256.field4077 = "brilho3:";
        class213.field3433 = "Biblioteca 3D iniciada";
        class240.field3788 = " entrou no jogo.";
        class87.field1411 = "brilho2:";
        class3.field41 = "Padrões carregados";
        class279.field4429 = "Gerenciador de entradas carregado";
        class277.field4403 = "Texturas carregadas";
        if (arg0 > -52) {
            method1288(-111);
        }
        class211.field3390 = "Selecionar";
        class285.field4549 = "Carregando fontes - ";
        class161.field2629 = "deslizamento:";
        class36.field621 = " saiu do jogo.";
        class65.field1065 = "Oculto";
        class265.field4230 = "onda:";
        class43.field781 = "tremor:";
        class35.field591 = "Carregando. Aguarde.";
        class27.field476 = "Conexão perdida.";
        class220.field3527 = "flash1:";
        class178.field2964 = "onda2:";
        client.field4580 = "Mecanismo de som preparado";
        class65.field1068 = "Universo de jogo criado";
        class160.field2618 = "K";
        class247.field3883 = " já está na sua lista de amigos.";
        class107.field1631 = "Carregando tela título - ";
        class223.field3552 = "vermelho:";
        class201.field3275 = "Caminhar para cá";
        class187.field3060 = " da sua lista de ignorados primeiro.";
        class268.field4304 = "roxo:";
        class19.field282 = "qualificação: ";
        class228.field3635 = "RuneScape carregando. Aguarde...";
        class97.field1508 = "brilho1:";
        class5.field68 = " da sua lista de amigos primeiro.";
        class5.field67 = "cyan:";
        class29.field508 = "Carregando interfaces - ";
        class18.field247 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class57.field1000 = "Continuar";
        class89.field1427 = "Memória alocada";
        class75.field1231 = "Config carregada";
        class207.field3332 = "deseja negociar com você.";
        class76.field1248 = "Sprites carregados";
        class4.field51 = "Largar";
        class296.field4684 = "branco:";
        class237.field3739 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class23.field363 = "Pacote de palavras carregado";
        class138.field2314 = "Fechar";
        class250.field3983 = "K";
        class204.field3286 = "Virar para cá";
        field3039++;
        client.field4582 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class239.field3760 = "Verificando atualizações - ";
        class242.field3834 = "verde:";
        class11.field152 = "Dados da lista de mundos carregados";
        class71.field1185 = "M";
        class9.field107 = "Descartar";
        class127.field2101 = "Não é possível encontrar ";
        class82.field1364 = "Iniciando biblioteca 3D";
        class216.field3458 = "rolagem:";
        class33.field556 = "Carregando padrões - ";
        class224.field3577 = "amarelo:";
        class139.field2332 = "Selecionar opção";
        class23.field369 = "Pegar";
        class75.field1235 = "Remova ";
        class8.field93 = "nível: ";
        class32.field529 = "Examinar";
        class101.field1547 = "habilidade: ";
        class59.field1021 = "Tentando reestabelecer conexão. Aguarde.";
        class253.field4033 = "Cancelar";
        class210.field3366 = "Carregando dados da lista de mundos";
        class47.field839 = "Aguarde...";
        class184.field3036 = "Lista de atualizações carregada";
        class241.field3795 = "Conectado ao servidor de atualização";
        field3041 = " ";
        class96.field1497 = "Alocando memória";
        class124.field2081 = "Ok";
        class224.field3578 = "Carregando /secure/libs_v4s/RCras - ";
        class112.field1732 = "flash2:";
        class165.field2690 = "Tela título carregada";
        class91.field1440 = " mais opções";
        class206.field3316 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class295.field4678 = "Carregando sprites - ";
        class262.field4159 = "brilho3:";
        class131.field2169 = "Usar";
        class152.field2488 = "Fontes carregadas";
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method1289(int arg0) {
        field3042 = null;
        if (arg0 != 528) {
            field3041 = null;
        }
        field3046 = null;
        field3040 = null;
        field3041 = null;
        field3045 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1290(byte arg0, String arg1) {
        if (arg0 < 27) {
            field3040 = null;
        }
        field3044++;
        return class197.method1346(true, (byte) 70, 10, arg1);
    }
}
