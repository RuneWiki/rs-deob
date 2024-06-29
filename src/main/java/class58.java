import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class58 {

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Z")
    public static boolean field1072 = false;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lbc;")
    public static class201 field1070 = new class201(8);

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lub;")
    private static class227 field1074 = class257.method1749("wave:", 17263);

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lub;")
    public static class227 field1076 = field1074;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Lub;")
    public static class227 field1077 = field1074;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "[Lkf;")
    public static class38[] field1075 = new class38[6];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Lef;")
    public class130 field1078;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lph;")
    public static class32 field1079;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    public int[] field1065;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
    public static int[] field1068;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II[Lta;IIIZIII)V")
    public static final void method353(int arg0, int arg1, class105[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg6) {
            method356(23, 65);
        }
        field1064++;
        class111.method704(arg8, arg7, arg3, arg0);
        class62.method394();
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class105 var11 = arg2[var10];
            if (var11 != null && (var11.field1968 == arg1 || arg1 == -1412584499 && class10.field194 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class36.field599[class140.field2421] = var11.field1941 + arg5;
                    class18.field317[class140.field2421] = var11.field1950 + arg9;
                    class116.field2137[class140.field2421] = var11.field1977;
                    class54.field940[class140.field2421] = var11.field1952;
                    var12 = class140.field2421++;
                } else {
                    var12 = arg4;
                }
                var11.field1840 = class253.field4393;
                var11.field1988 = var12;
                if (!var11.field1853 || !client.method491(var11)) {
                    if (var11.field1975 > 0) {
                        class236.method1575(false, var11);
                    }
                    int var13 = var11.field1950 + arg9;
                    int var14 = var11.field1941 + arg5;
                    int var15 = var11.field1933;
                    if (class50.field882 && (client.method494(var11) != 0 || var11.field1829 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class10.field194 == var11) {
                        if (arg1 != -1412584499 && !var11.field1958) {
                            class45.field745 = arg2;
                            class42.field685 = arg9;
                            class171.field2868 = arg5;
                            continue;
                        }
                        if (class192.field3273 && class184.field3125) {
                            int var16 = class100.field1752;
                            int var17 = var16 - class94.field1632;
                            int var18 = client.field1451;
                            if (class69.field1223 > var17) {
                                var17 = class69.field1223;
                            }
                            int var19 = var18 - class186.field3177;
                            if ((var11.field1977 + var17) > (class69.field1223 + class232.field4044.field1977)) {
                                var17 = class69.field1223 + class232.field4044.field1977 - var11.field1977;
                            }
                            if (var19 < class119.field2176) {
                                var19 = class119.field2176;
                            }
                            var14 = var17;
                            if (var11.field1952 + var19 > class119.field2176 - -class232.field4044.field1952) {
                                var19 = class119.field2176 + class232.field4044.field1952 - var11.field1952;
                            }
                            var13 = var19;
                        }
                        if (!var11.field1958) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1829 == 2) {
                        var20 = arg8;
                        var21 = arg3;
                        var22 = arg7;
                        var23 = arg0;
                    } else {
                        var20 = arg8 < var14 ? var14 : arg8;
                        var22 = arg7 >= var13 ? arg7 : var13;
                        int var24 = var11.field1977 + var14;
                        int var25 = var11.field1952 + var13;
                        if (var11.field1829 == 9) {
                            var24++;
                            var25++;
                        }
                        var21 = arg3 > var24 ? var24 : arg3;
                        var23 = var25 >= arg0 ? arg0 : var25;
                    }
                    if (!var11.field1853 || var21 > var20 && var22 < var23) {
                        if (var11.field1975 != 0) {
                            if (var11.field1975 == 1337) {
                                class79.field1384 = var11;
                                class218.field3668 = var13;
                                class108.field2038 = var14;
                                class66.method413(var11.field1977, var14, 1327286247, var11.field1952, var13, var11.field1975 == 1403);
                                class111.method704(arg8, arg7, arg3, arg0);
                                continue;
                            }
                            if (var11.field1975 == 1338) {
                                if (var11.method651(1156)) {
                                    class186.method1182(var12, (byte) 33, var11, var13, var14);
                                    class111.method704(arg8, arg7, arg3, arg0);
                                }
                                continue;
                            }
                            if (var11.field1975 == 1339) {
                                if (var11.method651(1156)) {
                                    class52.method306(256, var14, var13, var11, var12);
                                    class111.method704(arg8, arg7, arg3, arg0);
                                }
                                continue;
                            }
                            if (var11.field1975 == 1400) {
                                class108.method669(var13, var11.field1977, var14, var11.field1952, (byte) -91);
                                class10.field182[var12] = true;
                                class79.field1379[var12] = true;
                                class111.method704(arg8, arg7, arg3, arg0);
                                continue;
                            }
                            if (var11.field1975 == 1401) {
                                class40.method215(var11.field1952, var11.field1977, 11503, var14, var13);
                                class10.field182[var12] = true;
                                class79.field1379[var12] = true;
                                class111.method704(arg8, arg7, arg3, arg0);
                                continue;
                            }
                            if (var11.field1975 == 1402) {
                                class230.method1555(238, var14, var13);
                                class10.field182[var12] = true;
                                class79.field1379[var12] = true;
                                continue;
                            }
                            if (var11.field1975 == 1404) {
                                class104.method635(var13, 10301, class56.field1024, var11.field1952, var11.field1977, class260.field4532, var11, var14);
                                class10.field182[var12] = true;
                                class79.field1379[var12] = true;
                                continue;
                            }
                            if (var11.field1975 == 1405) {
                                if (class99.field1731) {
                                    int var26 = var13 + 15;
                                    int var27 = var11.field1977 + var14;
                                    int var28 = 16776960;
                                    class177.field2977.method1252(class76.method445((byte) -118, new class227[] { class138.field2401, class204.method1303(class188.field3203, 1) }), var27, var26, 16776960, -1);
                                    Runtime var29 = Runtime.getRuntime();
                                    int var109 = var26 + 15;
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    if (var30 > 65536) {
                                        var28 = 16711680;
                                    }
                                    class177.field2977.method1252(class76.method445((byte) -90, new class227[] { class22.field391, class204.method1303(var30, 1), class258.field4513 }), var27, var109, var28, -1);
                                    var26 = var109 + 15;
                                    class10.field182[var12] = true;
                                    class79.field1379[var12] = true;
                                }
                                continue;
                            }
                        }
                        int var31 = class100.field1752;
                        if (var11.field1829 == 0 && var11.field1895 && var20 <= class100.field1752 && var22 <= client.field1451 && var21 > class100.field1752 && var23 > client.field1451 && !class81.field1409 && !class50.field882) {
                            class19.field327[0] = 1006;
                            class94.field1631 = 1;
                            class37.field611[0] = class37.field614;
                            class213.field3607[0] = class91.field1558;
                        }
                        int var32 = client.field1451;
                        if (!class81.field1409 && var20 <= var31 && var22 <= var32 && var31 < var21 && var32 < var23) {
                            class201.method1296(var11, (byte) -72, var31 - var14, -var13 + var32);
                        }
                        if (var11.field1829 == 0) {
                            if (!var11.field1853 && client.method491(var11) && class132.field2297 != var11) {
                                continue;
                            }
                            if (!var11.field1853) {
                                if (var11.field1986 > var11.field1935 - var11.field1952) {
                                    var11.field1986 = var11.field1935 - var11.field1952;
                                }
                                if (var11.field1986 < 0) {
                                    var11.field1986 = 0;
                                }
                            }
                            method353(var23, var11.field1861, arg2, var21, var12, var14 - var11.field1925, false, var22, var20, var13 - var11.field1986);
                            if (var11.field1956 != null) {
                                method353(var23, var11.field1861, var11.field1956, var21, var12, var14 - var11.field1925, false, var22, var20, var13 - var11.field1986);
                            }
                            class182 var33 = (class182) field1070.method1298(-111, (long) var11.field1861);
                            if (var33 != null) {
                                if (var33.field3115 == 0 && class100.field1752 >= var20 && client.field1451 >= var22 && var21 > class100.field1752 && client.field1451 < var23 && !class81.field1409 && !class50.field882) {
                                    class19.field327[0] = 1006;
                                    class94.field1631 = 1;
                                    class37.field611[0] = class37.field614;
                                    class213.field3607[0] = class91.field1558;
                                }
                                class231.method1558(var22, var13, 27733, var23, var12, var20, var21, var14, var33.field3106);
                            }
                            class111.method704(arg8, arg7, arg3, arg0);
                            class62.method394();
                        }
                        if (class108.field2034[var12] || class22.field389 > 1) {
                            if (var11.field1829 == 0 && !var11.field1853 && var11.field1952 < var11.field1935) {
                                class40.method213(0, var11.field1977 + var14, var11.field1952, var11.field1935, var13, var11.field1986);
                            }
                            if (var11.field1829 != 1) {
                                if (var11.field1829 == 2) {
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < var11.field1945; var35++) {
                                        for (int var36 = 0; var36 < var11.field1943; var36++) {
                                            int var37 = var14 + ((var11.field1899 + 32) * var36);
                                            int var38 = (var11.field1906 + 32) * var35 + var13;
                                            if (var34 < 20) {
                                                var38 += var11.field1896[var34];
                                                var37 += var11.field1888[var34];
                                            }
                                            if (var11.field1865[var34] > 0) {
                                                boolean var40 = false;
                                                int var41 = var11.field1865[var34] - 1;
                                                boolean var42 = false;
                                                if (arg8 < var37 + 32 && arg3 > var37 && (var38 + 32) > arg7 && arg0 > var38 || class212.field3588 == var11 && class87.field1515 == var34) {
                                                    class213 var43;
                                                    if (class122.field2199 == 1 && class119.field2162 == var34 && class167.field2789 == var11.field1861) {
                                                        var43 = class94.method580(var11.field1921[var34], var41, 2, 0, 2, var11.field1849);
                                                    } else {
                                                        var43 = class94.method580(var11.field1921[var34], var41, 1, 3153952, 2, var11.field1849);
                                                    }
                                                    if (class62.field1140) {
                                                        class10.field182[var12] = true;
                                                    }
                                                    if (var43 == null) {
                                                        class198.method1268(117, var11);
                                                    } else if (class212.field3588 == var11 && class87.field1515 == var34) {
                                                        int var44 = class100.field1752 - class95.field1641;
                                                        int var45 = client.field1451 - class119.field2174;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class28.field453 < 5) {
                                                            var45 = 0;
                                                            var44 = 0;
                                                        }
                                                        var43.method791(var37 + var44, var38 - -var45, 128);
                                                        if (arg1 != -1) {
                                                            class105 var46 = arg2[arg1 & 0xFFFF];
                                                            int var47 = class111.field2063;
                                                            int var48 = class111.field2065;
                                                            if (var47 > var38 + var45 && var46.field1986 > 0) {
                                                                int var49 = (var47 - var45 - var38) * class85.field1481 / 3;
                                                                if ((class85.field1481 * 10) < var49) {
                                                                    var49 = class85.field1481 * 10;
                                                                }
                                                                if (var49 > var46.field1986) {
                                                                    var49 = var46.field1986;
                                                                }
                                                                var46.field1986 -= var49;
                                                                class119.field2174 += var49;
                                                                class198.method1268(103, var46);
                                                            }
                                                            if ((var38 + var45 + 32) > var48 && var46.field1935 - var46.field1952 > var46.field1986) {
                                                                int var50 = (var38 + var45 + 32 - var48) * class85.field1481 / 3;
                                                                if (class85.field1481 * 10 < var50) {
                                                                    var50 = class85.field1481 * 10;
                                                                }
                                                                if (var50 > var46.field1935 - var46.field1986 - var46.field1952) {
                                                                    var50 = var46.field1935 - var46.field1952 - var46.field1986;
                                                                }
                                                                var46.field1986 += var50;
                                                                class119.field2174 -= var50;
                                                                class198.method1268(81, var46);
                                                            }
                                                        }
                                                    } else if (class77.field1349 == var11 && class103.field1806 == var34) {
                                                        var43.method791(var37, var38, 128);
                                                    } else {
                                                        var43.method787(var37, var38);
                                                    }
                                                }
                                            } else if (var11.field1848 != null && var34 < 20) {
                                                class213 var39 = var11.method645(0, var34);
                                                if (var39 != null) {
                                                    var39.method787(var37, var38);
                                                } else if (class19.field332) {
                                                    class198.method1268(103, var11);
                                                }
                                            }
                                            var34++;
                                        }
                                    }
                                } else if (var11.field1829 == 3) {
                                    int var51;
                                    if (class130.method794(var11, -19632)) {
                                        var51 = var11.field1854;
                                        if (class132.field2297 == var11 && var11.field1963 != 0) {
                                            var51 = var11.field1963;
                                        }
                                    } else {
                                        var51 = var11.field1894;
                                        if (class132.field2297 == var11 && var11.field1926 != 0) {
                                            var51 = var11.field1926;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1868) {
                                            class111.method694(var14, var13, var11.field1977, var11.field1952, var51);
                                        } else {
                                            class111.method705(var14, var13, var11.field1977, var11.field1952, var51);
                                        }
                                    } else if (var11.field1868) {
                                        class111.method692(var14, var13, var11.field1977, var11.field1952, var51, 256 - (var15 & 0xFF));
                                    } else {
                                        class111.method709(var14, var13, var11.field1977, var11.field1952, var51, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1829 == 4) {
                                    class196 var52 = var11.method641(class100.field1751, 65535);
                                    if (var52 != null) {
                                        class227 var53 = var11.field1982;
                                        int var54;
                                        if (class130.method794(var11, -19632)) {
                                            var54 = var11.field1854;
                                            if (class132.field2297 == var11 && var11.field1963 != 0) {
                                                var54 = var11.field1963;
                                            }
                                            if (var11.field1971.method1521((byte) 43) > 0) {
                                                var53 = var11.field1971;
                                            }
                                        } else {
                                            var54 = var11.field1894;
                                            if (class132.field2297 == var11 && var11.field1926 != 0) {
                                                var54 = var11.field1926;
                                            }
                                        }
                                        if (var11.field1853 && var11.field1879 != -1) {
                                            class178 var55 = class133.method815(var11.field1879, (byte) -70);
                                            var53 = var55.field3048;
                                            if (var53 == null) {
                                                var53 = class54.field946;
                                            }
                                            if ((var55.field3049 == 1 || var11.field1987 != 1) && var11.field1987 != -1) {
                                                var53 = class76.method445((byte) 68, new class227[] { class99.field1735, var53, class105.field1831, class26.method131(var11.field1987, 87) });
                                            }
                                        }
                                        if (class125.field2249 == var11) {
                                            var54 = var11.field1894;
                                            var53 = class88.field1523;
                                        }
                                        if (!var11.field1853) {
                                            var53 = class131.method807(-115, var53, var11);
                                        }
                                        var52.method1261(var53, var14, var13, var11.field1977, var11.field1952, var54, var11.field1961 ? 0 : -1, var11.field1883, var11.field1862, var11.field1838);
                                    } else if (class19.field332) {
                                        class198.method1268(113, var11);
                                    }
                                } else if (var11.field1829 == 5) {
                                    if (var11.field1853) {
                                        class213 var56;
                                        if (var11.field1879 == -1) {
                                            var56 = var11.method648(false, 82);
                                        } else {
                                            var56 = class94.method580(var11.field1987, var11.field1879, var11.field1901, var11.field1959, 2, var11.field1849);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3594;
                                            int var58 = var56.field3592;
                                            if (var11.field1824) {
                                                int var60 = (var58 - (1 - var11.field1977)) / var58;
                                                int var61 = (var11.field1952 + var57 - 1) / var57;
                                                class111.method695(var14, var13, var11.field1977 + var14, var13 - -var11.field1952);
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var11.field1976 != 0) {
                                                            var56.method1353(var11.field1976, 39, var57 / 2 + var57 * var63 + var13, var14 - (-(var58 * var62) - var58 / 2), 4096);
                                                        } else if (var15 == 0) {
                                                            var56.method787(var58 * var62 + var14, var57 * var63 + var13);
                                                        } else {
                                                            var56.method791(var58 * var62 + var14, var57 * var63 + var13, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class111.method704(arg8, arg7, arg3, arg0);
                                            } else {
                                                int var59 = var11.field1977 * 4096 / var58;
                                                if (var11.field1976 != 0) {
                                                    var56.method1353(var11.field1976, 67, var13 + (var11.field1952 / 2), var11.field1977 / 2 + var14, var59);
                                                } else if (var15 != 0) {
                                                    var56.method786(var14, var13, var11.field1977, var11.field1952, 256 - (var15 & 0xFF));
                                                } else if (var11.field1977 == var58 && var11.field1952 == var57) {
                                                    var56.method787(var14, var13);
                                                } else {
                                                    var56.method1012(var14, var13, var11.field1977, var11.field1952);
                                                }
                                            }
                                        } else if (class19.field332) {
                                            class198.method1268(81, var11);
                                        }
                                    } else {
                                        class213 var64 = var11.method648(class130.method794(var11, -19632), 76);
                                        if (var64 != null) {
                                            var64.method787(var14, var13);
                                        } else if (class19.field332) {
                                            class198.method1268(77, var11);
                                        }
                                    }
                                } else if (var11.field1829 == 6) {
                                    boolean var65 = class130.method794(var11, -19632);
                                    int var66;
                                    if (var65) {
                                        var66 = var11.field1875;
                                    } else {
                                        var66 = var11.field1914;
                                    }
                                    class48 var67 = null;
                                    int var68 = 0;
                                    if (var11.field1879 != -1) {
                                        class178 var73 = class133.method815(var11.field1879, (byte) -70);
                                        if (var73 != null) {
                                            class178 var74 = var73.method1142(var11.field1987, false);
                                            class51 var75 = var66 == -1 ? null : class25.method127(true, var66);
                                            var67 = var74.method1130(1, var75, 768, var11.field1944);
                                            if (var67 == null) {
                                                class198.method1268(100, var11);
                                            } else {
                                                var68 = -var67.method88() / 2;
                                            }
                                        }
                                    } else if (var11.field1850 == 5) {
                                        if (var11.field1910 == -1) {
                                            var67 = class226.field3849.method331((class51) null, -1, 12, -1, (class51) null);
                                        } else {
                                            int var69 = var11.field1910 & 0x7FF;
                                            if (class254.field4473 == var69) {
                                                var69 = 2047;
                                            }
                                            class225 var70 = class27.field446[var69];
                                            class51 var71 = var66 == -1 ? null : class25.method127(true, var66);
                                            if (var70 != null && (int) var70.field3819.method1485(122) << 11 == (var11.field1910 & 0xFFFFF800)) {
                                                var67 = var70.field3820.method331(var71, var11.field1944, 12, 0, (class51) null);
                                            }
                                        }
                                    } else if (var66 == -1) {
                                        var67 = var11.method646((byte) 60, -1, var65, (class51) null, class216.field3639.field3820);
                                        if (var67 == null && class19.field332) {
                                            class198.method1268(100, var11);
                                        }
                                    } else {
                                        class51 var72 = class25.method127(true, var66);
                                        var67 = var11.method646((byte) 96, var11.field1944, var65, var72, class216.field3639.field3820);
                                        if (var67 == null && class19.field332) {
                                            class198.method1268(81, var11);
                                        }
                                    }
                                    if (var67 != null) {
                                        int var76;
                                        if (var11.field1947 > 0) {
                                            var76 = (var11.field1977 << 8) / var11.field1947;
                                        } else {
                                            var76 = 256;
                                        }
                                        int var77;
                                        if (var11.field1881 > 0) {
                                            var77 = (var11.field1952 << 8) / var11.field1881;
                                        } else {
                                            var77 = 256;
                                        }
                                        int var78 = (var11.field1955 * var76 >> 8) + var11.field1977 / 2 + var14;
                                        int var79 = (var11.field1957 * var77 >> 8) + (var13 + (var11.field1952 / 2));
                                        class62.method384(var78, var79);
                                        int var80 = class62.field1136[var11.field1983] * var11.field1905 >> 16;
                                        int var81 = class62.field1143[var11.field1983] * var11.field1905 >> 16;
                                        if (!var11.field1853) {
                                            var67.method281(0, var11.field1844, 0, var11.field1983, 0, var80, var81);
                                        } else if (var11.field1845) {
                                            ((class55) var67).method319(0, var11.field1844, var11.field1937, var11.field1983, var11.field1893, var11.field1962 + var68 + var80, var81 - -var11.field1962, var11.field1905);
                                        } else {
                                            var67.method281(0, var11.field1844, var11.field1937, var11.field1983, var11.field1893, var11.field1962 + var68 + var80, var81 - -var11.field1962);
                                        }
                                        class62.method389();
                                    }
                                } else {
                                    if (var11.field1829 == 7) {
                                        class196 var82 = var11.method641(class100.field1751, 65535);
                                        if (var82 == null) {
                                            if (class19.field332) {
                                                class198.method1268(106, var11);
                                            }
                                            continue;
                                        }
                                        int var83 = 0;
                                        for (int var84 = 0; var84 < var11.field1945; var84++) {
                                            for (int var85 = 0; var85 < var11.field1943; var85++) {
                                                if (var11.field1865[var83] > 0) {
                                                    class178 var86 = class133.method815(var11.field1865[var83] - 1, (byte) -70);
                                                    class227 var87;
                                                    if (var86.field3049 != 1 && var11.field1921[var83] == 1) {
                                                        var87 = class76.method445((byte) -88, new class227[] { class99.field1735, var86.field3048, class179.field3081 });
                                                    } else {
                                                        var87 = class76.method445((byte) 111, new class227[] { class99.field1735, var86.field3048, class105.field1831, class26.method131(var11.field1921[var83], 123) });
                                                    }
                                                    int var88 = var14 + ((var11.field1899 + 115) * var85);
                                                    int var89 = var13 + ((var11.field1906 + 12) * var84);
                                                    if (var11.field1883 == 0) {
                                                        var82.method1262(var87, var88, var89, var11.field1894, var11.field1961 ? 0 : -1);
                                                    } else if (var11.field1883 == 1) {
                                                        var82.method1243(var87, var88 + 57, var89, var11.field1894, var11.field1961 ? 0 : -1);
                                                    } else {
                                                        var82.method1252(var87, var88 + 115 - 1, var89, var11.field1894, var11.field1961 ? 0 : -1);
                                                    }
                                                }
                                                var83++;
                                            }
                                        }
                                    }
                                    if (var11.field1829 == 8 && class141.field2427 == var11 && class260.field4534 == class25.field426) {
                                        int var90 = 0;
                                        int var91 = 0;
                                        class196 var92 = class177.field2977;
                                        class227 var93 = var11.field1982;
                                        class227 var94 = class131.method807(-17, var93, var11);
                                        while (var94.method1521((byte) 49) > 0) {
                                            int var102 = var94.method1506(-1646, class168.field2811);
                                            class227 var103;
                                            if (var102 == -1) {
                                                var103 = var94;
                                                var94 = class91.field1558;
                                            } else {
                                                var103 = var94.method1532((byte) 66, 0, var102);
                                                var94 = var94.method1517((byte) -100, var102 + 4);
                                            }
                                            int var104 = var92.method1246(var103);
                                            var91 += var92.field3331 + 1;
                                            if (var104 > var90) {
                                                var90 = var104;
                                            }
                                        }
                                        var90 += 6;
                                        var91 += 7;
                                        int var95 = var11.field1977 + var14 - var90 - 5;
                                        if (var95 < (var14 + 5)) {
                                            var95 = var14 + 5;
                                        }
                                        if ((var95 + var90) > arg3) {
                                            var95 = arg3 - var90;
                                        }
                                        int var96 = var13 + var11.field1952 + 5;
                                        if (arg0 < var96 + var91) {
                                            var96 = arg0 - var91;
                                        }
                                        class111.method694(var95, var96, var90, var91, 16777120);
                                        class111.method705(var95, var96, var90, var91, 0);
                                        int var97 = var96 + var92.field3331 + 2;
                                        class227 var98 = var11.field1982;
                                        class227 var99 = class131.method807(-67, var98, var11);
                                        while (var99.method1521((byte) 15) > 0) {
                                            int var100 = var99.method1506(-1646, class168.field2811);
                                            class227 var101;
                                            if (var100 == -1) {
                                                var101 = var99;
                                                var99 = class91.field1558;
                                            } else {
                                                var101 = var99.method1532((byte) 109, 0, var100);
                                                var99 = var99.method1517((byte) -101, var100 + 4);
                                            }
                                            var92.method1262(var101, var95 + 3, var97, 0, -1);
                                            var97 += var92.field3331 + 1;
                                        }
                                    }
                                    if (var11.field1829 == 9) {
                                        int var105;
                                        int var106;
                                        int var107;
                                        int var108;
                                        if (var11.field1827) {
                                            var106 = var14;
                                            var107 = var11.field1977 + var14;
                                            var105 = var13 + var11.field1952;
                                            var108 = var13;
                                        } else {
                                            var105 = var13;
                                            var106 = var14;
                                            var107 = var11.field1977 + var14;
                                            var108 = var11.field1952 + var13;
                                        }
                                        if (var11.field1866 == 1) {
                                            class111.method703(var106, var105, var107, var108, var11.field1894);
                                        } else {
                                            class111.method708(var106, var105, var107, var108, var11.field1894, var11.field1866);
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

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method354(int arg0) {
        field1075 = null;
        field1074 = null;
        field1068 = null;
        field1070 = null;
        field1077 = null;
        field1076 = null;
        field1079 = null;
        if (arg0 >= -105) {
            method354(-36);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static final void method355(int arg0) {
        try {
            if (class116.field2129 == null) {
                class116.field2129 = new class77(class61.field1123, class76.method445((byte) 116, new class227[] { class41.method223(arg0 + 17515), class124.field2226 }).method1523(arg0 + 4));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class116.field2129 = null;
        }
        if (arg0 != -4) {
            method357((class227) null, 80);
        }
        field1069++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
    public static final int method356(int arg0, int arg1) {
        field1067++;
        if (arg0 != -796685880) {
            field1071 = -88;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lub;I)V")
    public static final void method357(class227 arg0, int arg1) {
        field1066++;
        class194 var2 = class96.method589(arg0, arg1 + 23275);
        if (var2 == null) {
            return;
        }
        class109.field2045 = class45.field753 + class257.field4499 - var2.field3301;
        if (arg1 != -23162) {
            return;
        }
        class174.field2910 = var2.field3303 - class86.field1492;
        int var3 = class174.field2910 + ((int) ((double) class178.field3029.field1977 / class4.field58));
        int var4 = class174.field2910 - (int) ((double) class178.field3029.field1977 / class4.field58);
        int var5 = class109.field2045 - (int) ((double) class178.field3029.field1952 / class4.field58);
        if (var4 < 0) {
            class174.field2910 = (int) ((double) class178.field3029.field1977 / class4.field58);
        }
        if (var3 > class249.field4322) {
            class174.field2910 = class249.field4322 - ((int) ((double) class178.field3029.field1977 / class4.field58));
        }
        int var6 = class109.field2045 + ((int) ((double) class178.field3029.field1952 / class4.field58));
        if (var5 < 0) {
            class109.field2045 = (int) ((double) class178.field3029.field1952 / class4.field58);
        }
        if (class45.field753 < var6) {
            class109.field2045 = class45.field753 - ((int) ((double) class178.field3029.field1952 / class4.field58));
        }
    }
}
