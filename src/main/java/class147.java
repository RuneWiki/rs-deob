import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class147 extends class272 {

    @OriginalMember(owner = "client!ep", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field2259 = new String[100];

    @OriginalMember(owner = "client!ep", name = "bb", descriptor = "Lik;")
    public static class410 field2264 = new class410(8);

    @OriginalMember(owner = "client!ep", name = "V", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ep", name = "X", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ep", name = "Y", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ep", name = "ab", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ep", name = "Z", descriptor = "[Lne;")
    public static class76[] field2262;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        ++field2260;
        class387.field5450.method100(class132.field1895, class130.field1846 ? class37.field567 + 256 : -1);
        if (arg0 != 5010) {
            method1137(39, false, -31);
        }
    }

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "(I)V")
    public static void method1135(int arg0) {
        field2262 = null;
        if (arg0 == 0) {
            field2259 = null;
            field2264 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII[Lbi;IIII)V")
    public static final void method1136(int arg0, int arg1, int arg2, int arg3, int arg4, class139[] arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2261;
        class249.field3415.method111(arg4, arg7, arg8, arg6);
        if (arg3 <= 8) {
            field2259 = null;
        }
        for (int var10 = 0; ~arg5.length < ~var10; ++var10) {
            class139 var11 = arg5[var10];
            if (var11 != null && (var11.field2042 == arg9 || ~arg9 == 1412584498 && class305.field4133 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class395.field5530[class352.field4817].setBounds(var11.field2065 + arg1, var11.field2022 + arg0, var11.field2027, var11.field2011);
                    var12 = class352.field4817++;
                } else {
                    var12 = arg2;
                }
                var11.field2090 = class414.field5793;
                var11.field2128 = var12;
                if (!var11.field2048 || !client.method1645(var11)) {
                    if (var11.field2108 > 0) {
                        class414.method2565(var11, (byte) -128);
                    }
                    int var13 = var11.field2065 + arg1;
                    int var14 = var11.field2022 - -arg0;
                    int var15 = var11.field2110;
                    if (class339.field4624 && (client.method1648(var11).field1767 != 0 || var11.field2023 == 0) && ~var15 < -128) {
                        var15 = 127;
                    }
                    if (class305.field4133 == var11) {
                        if (arg9 != -1412584499 && !var11.field2092) {
                            class406.field5639 = arg1;
                            class55.field889 = arg5;
                            class256.field3463 = arg0;
                            continue;
                        }
                        if (class442.field6363 && class395.field5525) {
                            int var16 = class391.field5490;
                            int var17 = class312.field4220;
                            int var18 = var16 - class69.field1050;
                            int var19 = var17 - class380.field5338;
                            if (~class134.field1908 < ~var18) {
                                var18 = class134.field1908;
                            }
                            if (var11.field2027 + var18 > class134.field1908 + class291.field3953.field2027) {
                                var18 = -var11.field2027 + class291.field3953.field2027 + class134.field1908;
                            }
                            if (~var19 > ~class88.field1307) {
                                var19 = class88.field1307;
                            }
                            if (~(var11.field2011 + var19) < ~(class88.field1307 + class291.field3953.field2011)) {
                                var19 = class88.field1307 + class291.field3953.field2011 + -var11.field2011;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var11.field2092) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (~var11.field2023 != -3) {
                        int var20 = var13 - -var11.field2027;
                        int var21 = var11.field2011 + var14;
                        var22 = ~arg4 > ~var13 ? var13 : arg4;
                        var23 = arg7 < var14 ? var14 : arg7;
                        if (~var11.field2023 == -10) {
                            ++var20;
                            ++var21;
                        }
                        var24 = ~var20 > ~arg8 ? var20 : arg8;
                        var25 = arg6 > var21 ? var21 : arg6;
                    } else {
                        var24 = arg8;
                        var23 = arg7;
                        var25 = arg6;
                        var22 = arg4;
                    }
                    if (!var11.field2048 || ~var24 < ~var22 && ~var23 > ~var25) {
                        if (~var11.field2108 != -1) {
                            if (~var11.field2108 == -1338 || var11.field2108 == 1403) {
                                class314.method1999(var13, 101, var11.field2011, var14, var11.field2027, ~var11.field2108 == -1404);
                                class135.field1930[var12] = true;
                                class249.field3415.method111(arg4, arg7, arg8, arg6);
                                continue;
                            }
                            if (var11.field2108 == 1338) {
                                if (var11.method1091((byte) 86, class249.field3415) != null) {
                                    class127.method996(110);
                                    class76.method652(var14, var11, var13, -19687, class249.field3415);
                                    class199.field2844[var12] = true;
                                    class249.field3415.method111(arg4, arg7, arg8, arg6);
                                }
                                continue;
                            }
                            if (~var11.field2108 == -1340) {
                                if (var11.method1091((byte) -106, class249.field3415) != null) {
                                    class61.method549(var13, var11, -111, var14);
                                    class199.field2844[var12] = true;
                                    class249.field3415.method111(arg4, arg7, arg8, arg6);
                                }
                                continue;
                            }
                            if (~var11.field2108 == -1401) {
                                class289.method1884(var11.field2027, var14, var11.field2011, class249.field3415, -122, class356.field4840, var13);
                                class135.field1930[var12] = true;
                                class249.field3415.method111(arg4, arg7, arg8, arg6);
                                continue;
                            }
                            if (~var11.field2108 == -1402) {
                                class27.method325(class249.field3415, var14, var11.field2011, var11.field2027, -29914, var13);
                                class135.field1930[var12] = true;
                                class249.field3415.method111(arg4, arg7, arg8, arg6);
                                continue;
                            }
                            if (~var11.field2108 == -1406) {
                                if (!class361.field4911 && !class422.field5905) {
                                    continue;
                                }
                                int var26 = var11.field2027 + var13;
                                int var27 = var14 + 15;
                                if (class361.field4911) {
                                    class22.field414.method1300(-256, -1, false, var27, var26, "Fps:" + class276.field3716);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (~var29 < -65537) {
                                        var30 = -65536;
                                    }
                                    class22.field414.method1300(var30, -1, false, var27, var26, "Mem:" + var29 + "k");
                                    var27 += 15;
                                    int var31 = class249.field3415.method200() / 1024;
                                    class22.field414.method1300(var31 > 65536 ? -65536 : -256, -1, false, var27, var26, "Offheap:" + var31 + "k");
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; ~var35 > -30; ++var35) {
                                        var32 += class418.field5863[var35].method2709(-27113);
                                        var33 += class418.field5863[var35].method2703(21210);
                                        var34 += class418.field5863[var35].method2704((byte) 10);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class244.method1600(46, 2, true, (long) var37, 0) + "% (" + var36 + "%)";
                                    class43.field650.method1300(-256, -1, false, var27, var26, var38);
                                    var27 += 12;
                                }
                                if (class303.field4099 > 0) {
                                    class43.field650.method1300(-256, -1, false, var27, var26, "Particles: " + class209.field2900 + " / " + class303.field4099);
                                }
                                var27 += 12;
                                if (class422.field5905) {
                                    class43.field650.method1300(-256, -1, false, var27, var26, "Polys: " + class249.field3415.method234() + " Models: " + class249.field3415.method224());
                                    var27 += 12;
                                    class43.field650.method1300(-256, -1, false, var27, var26, "Ls: " + class61.field948 + " La: " + class356.field4844 + " NPC: " + class334.field4529 + " Pl: " + class435.field6199);
                                    var27 += 12;
                                    class59.method541(0);
                                }
                                class135.field1930[var12] = true;
                                continue;
                            }
                        }
                        if (~var11.field2023 == -1) {
                            if (!var11.field2048 && client.method1645(var11) && class375.field5276 != var11) {
                                continue;
                            }
                            if (!var11.field2048) {
                                if (~(-var11.field2011 + var11.field2086) > ~var11.field1983) {
                                    var11.field1983 = -var11.field2011 + var11.field2086;
                                }
                                if (var11.field1983 < 0) {
                                    var11.field1983 = 0;
                                }
                            }
                            if (~var11.field2108 == -1408 && class249.field3415.method250()) {
                                class249.field3415.method186(var13, var14, var11.field2027, var11.field2011);
                            }
                            method1136(-var11.field1983 + var14, -var11.field2055 + var13, var12, 102, var22, arg5, var25, var23, var24, var11.field1968);
                            if (var11.field2045 != null) {
                                method1136(-var11.field1983 + var14, var13 - var11.field2055, var12, 63, var22, var11.field2045, var25, var23, var24, var11.field1968);
                            }
                            class64 var39 = (class64) class204.field2865.method614(-112, (long) var11.field1968);
                            if (var39 != null) {
                                class239.method1592(var39.field976, var22, var14, var23, var12, var24, var25, var13, (byte) 44);
                            }
                            if (var11.field2108 == 1407 && class249.field3415.method250()) {
                                class249.field3415.method181();
                                class436.field6228 = true;
                            }
                            class249.field3415.method111(arg4, arg7, arg8, arg6);
                        }
                        if (class411.field5754[var12] || ~class90.field1340 < -2) {
                            if (~var11.field2023 == -1 && !var11.field2048 && var11.field2011 < var11.field2086) {
                                class267.method1713(var14, var11.field1983, var11.field2011, var11.field2086, (byte) -50, var13 - -var11.field2027);
                            }
                            if (var11.field2023 != 1) {
                                if (~var11.field2023 == -3) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field2020; ++var41) {
                                        for (int var42 = 0; var11.field1956 > var42; ++var42) {
                                            int var43 = var13 - -((32 - -var11.field2056) * var42);
                                            int var44 = (32 - -var11.field1966) * var41 + var14;
                                            if (var40 < 20) {
                                                var44 += var11.field2025[var40];
                                                var43 += var11.field2033[var40];
                                            }
                                            if (~var11.field2101[var40] >= -1) {
                                                if (var11.field2067 != null && var40 < 20) {
                                                    class80 var57 = var11.method1090(class249.field3415, (byte) -122, var40);
                                                    if (var57 != null) {
                                                        var57.method722(var43, var44);
                                                    } else if (class426.field6023) {
                                                        class10.method52(var11, (byte) -89);
                                                    }
                                                }
                                            } else {
                                                boolean var45 = false;
                                                boolean var46 = false;
                                                int var47 = var11.field2101[var40] - 1;
                                                if (arg4 < var43 + 32 && arg8 > var43 && var44 - -32 > arg7 && ~var44 > ~arg6 || class94.field1370 == var11 && class298.field4015 == var40) {
                                                    class80 var48;
                                                    if (class363.field5021 == 1 && class22.field413 == var40 && ~class272.field3661 == ~var11.field1968) {
                                                        var48 = class191.method1376(-58, class249.field3415, (class24) null, var11.field2071[var40], 2, 0, var47, var11.field1962);
                                                    } else {
                                                        var48 = class191.method1376(-105, class249.field3415, (class24) null, var11.field2071[var40], 1, -13623264, var47, var11.field1962);
                                                    }
                                                    if (var48 == null) {
                                                        class10.method52(var11, (byte) -89);
                                                    } else if (class94.field1370 == var11 && ~class298.field4015 == ~var40) {
                                                        int var49 = class391.field5490 - class138.field1948;
                                                        int var50 = -class52.field853 + class312.field4220;
                                                        if (~var50 > -6 && ~var50 < 4) {
                                                            var50 = 0;
                                                        }
                                                        if (~var49 > -6 && ~var49 < 4) {
                                                            var49 = 0;
                                                        }
                                                        if (~class358.field4855 > -6) {
                                                            var49 = 0;
                                                            var50 = 0;
                                                        }
                                                        var48.method730(var43 + var49, var44 + var50, 0, -2013265920, 1);
                                                        if (~arg9 != 0) {
                                                            class139 var51 = arg5[arg9 & 65535];
                                                            int[] var52 = new int[4];
                                                            class249.field3415.method90(var52);
                                                            int var53 = var52[1];
                                                            int var54 = var52[3];
                                                            if (~(var44 - -var50) > ~var53 && var51.field1983 > 0) {
                                                                int var55 = (-var50 + var53 + -var44) * class339.field4628 / 3;
                                                                if (class339.field4628 * 10 < var55) {
                                                                    var55 = class339.field4628 * 10;
                                                                }
                                                                if (~var55 < ~var51.field1983) {
                                                                    var55 = var51.field1983;
                                                                }
                                                                var51.field1983 -= var55;
                                                                class52.field853 += var55;
                                                                class10.method52(var51, (byte) -89);
                                                            }
                                                            if (var50 + 32 + var44 > var54 && var51.field1983 < -var51.field2011 + var51.field2086) {
                                                                int var56 = (var44 - -32 - var54 + var50) * class339.field4628 / 3;
                                                                if (var56 > class339.field4628 * 10) {
                                                                    var56 = class339.field4628 * 10;
                                                                }
                                                                if (~(-var51.field2011 + -var51.field1983 + var51.field2086) > ~var56) {
                                                                    var56 = -var51.field2011 + var51.field2086 + -var51.field1983;
                                                                }
                                                                class52.field853 -= var56;
                                                                var51.field1983 += var56;
                                                                class10.method52(var51, (byte) -89);
                                                            }
                                                        }
                                                    } else if (class388.field5461 == var11 && ~class76.field1132 == ~var40) {
                                                        var48.method730(var43, var44, 0, -2013265920, 1);
                                                    } else {
                                                        var48.method722(var43, var44);
                                                    }
                                                }
                                            }
                                            ++var40;
                                        }
                                    }
                                } else if (var11.field2023 == 3) {
                                    int var58;
                                    if (class329.method2086(-3, var11)) {
                                        var58 = var11.field2005;
                                        if (class375.field5276 == var11 && var11.field2102 != 0) {
                                            var58 = var11.field2102;
                                        }
                                    } else {
                                        var58 = var11.field2035;
                                        if (class375.field5276 == var11 && var11.field1986 != 0) {
                                            var58 = var11.field1986;
                                        }
                                    }
                                    if (~var15 == -1) {
                                        if (!var11.field1979) {
                                            class249.field3415.method167(var13, var14, var11.field2027, var11.field2011, var58, 0);
                                        } else {
                                            class249.field3415.method95(var13, var14, var11.field2027, var11.field2011, var58, 0);
                                        }
                                    } else if (var11.field1979) {
                                        class249.field3415.method95(var13, var14, var11.field2027, var11.field2011, 16777215 & var58 | 255 - (var15 & 255) << 24, 1);
                                    } else {
                                        class249.field3415.method167(var13, var14, var11.field2027, var11.field2011, 255 - (var15 & 255) << 24 | var58 & 16777215, 1);
                                    }
                                } else if (~var11.field2023 == -5) {
                                    class175 var59 = var11.method1100(true, class249.field3415);
                                    if (var59 == null) {
                                        if (class426.field6023) {
                                            class10.method52(var11, (byte) -89);
                                        }
                                    } else {
                                        String var60 = var11.field1976;
                                        int var61;
                                        if (class329.method2086(-3, var11)) {
                                            var61 = var11.field2005;
                                            if (class375.field5276 == var11 && var11.field2102 != 0) {
                                                var61 = var11.field2102;
                                            }
                                            if (~var11.field2070.length() < -1) {
                                                var60 = var11.field2070;
                                            }
                                        } else {
                                            var61 = var11.field2035;
                                            if (class375.field5276 == var11 && var11.field1986 != 0) {
                                                var61 = var11.field1986;
                                            }
                                        }
                                        if (var11.field2048 && ~var11.field2034 != 0) {
                                            class452 var62 = class234.method1569(2142, var11.field2034);
                                            var60 = var62.field6595;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((~var62.field6582 == -2 || var11.field2003 != 1) && ~var11.field2003 != 0) {
                                                var60 = "<col=ff9040>" + var60 + "</col> x" + class183.method1342(var11.field2003, (byte) -127);
                                            }
                                        }
                                        if (class331.field4502 == var11) {
                                            var61 = var11.field2035;
                                            var60 = class382.field5356;
                                        }
                                        if (!var11.field2048) {
                                            var60 = class234.method1553(var11, true, var60);
                                        }
                                        if (class175.field2586) {
                                            class249.field3415.method218(var13, var14, var11.field2027 + var13, var11.field2011 + var14);
                                        }
                                        var59.method1315(0, var11.field2078 ? -16777216 : -1, var13, var11.field2083, (int[]) null, (byte) -122, var11.field2011, var11.field1969, 0, (class179) null, -16777216 | var61, var11.field2027, var14, class233.field3208, var60, var11.field2113);
                                        if (class175.field2586) {
                                            class249.field3415.method111(arg4, arg7, arg8, arg6);
                                        }
                                    }
                                } else if (var11.field2023 == 5) {
                                    if (!var11.field2048) {
                                        class80 var63 = var11.method1092(class329.method2086(-3, var11), class249.field3415, true);
                                        if (var63 == null) {
                                            if (class426.field6023) {
                                                class10.method52(var11, (byte) -89);
                                            }
                                        } else {
                                            var63.method722(var13, var14);
                                        }
                                    } else if (~var11.field1977 > -1) {
                                        class80 var65;
                                        if (var11.field2034 != -1) {
                                            class24 var64 = var11.field2013 ? class95.field1379.field4608 : null;
                                            var65 = class191.method1376(-33, class249.field3415, var64, var11.field2003, var11.field2001, -16777216 | var11.field2076, var11.field2034, var11.field1962);
                                        } else {
                                            var65 = var11.method1092(false, class249.field3415, true);
                                        }
                                        if (var65 != null) {
                                            int var66 = var65.method740();
                                            int var67 = var65.method739();
                                            if (!var11.field1971) {
                                                if (var15 != 0) {
                                                    int var68 = -(var15 & 255) + 255 << 24 | 16777215;
                                                    if (~var11.field2131 == -1) {
                                                        if (~var11.field2027 == ~var66 && var11.field2011 == var67) {
                                                            var65.method730(var13, var14, 1, var68, 1);
                                                        } else {
                                                            var65.method726(var13, var14, var11.field2027, var11.field2011, 1, var68, 1);
                                                        }
                                                    } else {
                                                        var65.method724((float) var11.field2027 / 2.0F + (float) var13, (float) var11.field2011 / 2.0F + (float) var14, var11.field2027 * 4096 / var66, var11.field2131, 1, var68, 1);
                                                    }
                                                } else if (var11.field2131 == 0) {
                                                    if (var11.field2027 == var66 && var11.field2011 == var67) {
                                                        var65.method722(var13, var14);
                                                    } else {
                                                        var65.method729(var13, var14, var11.field2027, var11.field2011);
                                                    }
                                                } else {
                                                    var65.method728((float) var11.field2027 / 2.0F + (float) var13, (float) var11.field2011 / 2.0F + (float) var14, var11.field2027 * 4096 / var66, var11.field2131);
                                                }
                                            } else {
                                                class249.field3415.method218(var13, var14, var11.field2027 + var13, var11.field2011 + var14);
                                                if (var11.field2131 == 0) {
                                                    if (var15 == 0) {
                                                        var65.method737(var13, var14, var11.field2027, var11.field2011, 0, 0, 1);
                                                    } else {
                                                        var65.method737(var13, var14, var11.field2027, var11.field2011, 1, 16777215 | -(255 & var15) + 255 << 24, 1);
                                                    }
                                                } else {
                                                    int var69 = (-1 - -var66 + var11.field2027) / var66;
                                                    int var70 = (var67 + -1 + var11.field2011) / var67;
                                                    for (int var71 = 0; ~var69 < ~var71; ++var71) {
                                                        for (int var72 = 0; ~var70 < ~var72; ++var72) {
                                                            var65.method728((float) var66 / 2.0F + (float) (var66 * var71 + var13), (float) var67 / 2.0F + (float) (var14 - -(var67 * var72)), 4096, var11.field2131);
                                                        }
                                                    }
                                                }
                                                class249.field3415.method111(arg4, arg7, arg8, arg6);
                                            }
                                        } else if (class426.field6023) {
                                            class10.method52(var11, (byte) -89);
                                        }
                                    } else {
                                        var11.method1099(false).method1938(var11.field2054 << 3, var14, var11.field2011, 0, 0, var11.field2027, var13, 0, var11.field2074 << 3, class249.field3415);
                                    }
                                } else if (~var11.field2023 == -7) {
                                    boolean var73 = class329.method2086(-3, var11);
                                    int var74;
                                    if (var73) {
                                        var74 = var11.field2068;
                                    } else {
                                        var74 = var11.field1963;
                                    }
                                    class267.method1720(2070);
                                    class73 var75 = null;
                                    int var76 = 0;
                                    if (var11.field2034 == -1) {
                                        if (~var11.field2116 != -6) {
                                            if (var11.field2116 != 8 && ~var11.field2116 != -10) {
                                                if (~var74 == 0) {
                                                    var75 = var11.method1089(1024, var73, 0, -1, (class209) null, -5, class249.field3415, -1, class95.field1379.field4608);
                                                    if (var75 == null && class426.field6023) {
                                                        class10.method52(var11, (byte) -89);
                                                    }
                                                } else {
                                                    class209 var77 = class288.method1819(var74, (byte) 105);
                                                    var75 = var11.method1089(1024, var73, var11.field2124, var11.field2066, var77, -5, class249.field3415, var11.field2104, class95.field1379.field4608);
                                                    if (var75 == null && class426.field6023) {
                                                        class10.method52(var11, (byte) -89);
                                                    }
                                                }
                                            } else {
                                                class329 var78 = class176.method1319(var11.field2015, (byte) 104);
                                                class209 var79 = var74 != -1 ? class288.method1819(var74, (byte) 105) : null;
                                                if (var78 != null) {
                                                    class24 var80 = var11.field2013 ? class95.field1379.field4608 : null;
                                                    var75 = var78.method2089(~var11.field2116 == -10, class249.field3415, var11.field2104, (byte) -114, var11.field2124, var11.field2004, var80, var79, var11.field2066, 1024);
                                                }
                                            }
                                        } else if (~var11.field2015 != 0) {
                                            int var81 = var11.field2015;
                                            class338 var82;
                                            if (~class401.field5606 != ~var81) {
                                                var82 = class220.field3044[var81];
                                            } else {
                                                var82 = class95.field1379;
                                            }
                                            class209 var83 = ~var74 == 0 ? null : class288.method1819(var74, (byte) 105);
                                            if (var82 != null && (var81 == 2047 || class326.method2076(var82.field4577, 123) == var11.field2004)) {
                                                var75 = var82.field4608.method300(7, var83, class249.field3415, var11.field2124, -1, (class291[]) null, 1024, var11.field2104, 0, (class209) null, var11.field2066, true, 0);
                                            }
                                        } else {
                                            var75 = class90.field1344.method300(7, (class209) null, class249.field3415, 0, -1, (class291[]) null, 1024, -1, 0, (class209) null, -1, true, -1);
                                        }
                                    } else {
                                        class452 var84 = class234.method1569(2142, var11.field2034);
                                        if (var84 != null) {
                                            class452 var85 = var84.method2817(var11.field2003, (byte) -32);
                                            class209 var86 = ~var74 == 0 ? null : class288.method1819(var74, (byte) 105);
                                            class24 var87 = var11.field2013 ? class95.field1379.field4608 : null;
                                            var75 = var85.method2812(38, var87, var86, 1024, 1, var11.field2124, class249.field3415, var11.field2066, var11.field2104);
                                            if (var75 == null) {
                                                class10.method52(var11, (byte) -89);
                                            } else {
                                                var76 = -var75.method420() / 2;
                                            }
                                        }
                                    }
                                    if (var75 != null) {
                                        int var88;
                                        if (~var11.field2115 >= -1) {
                                            var88 = 512;
                                        } else {
                                            var88 = (var11.field2027 << 9) / var11.field2115;
                                        }
                                        int var89;
                                        if (~var11.field2017 < -1) {
                                            var89 = (var11.field2011 << 9) / var11.field2017;
                                        } else {
                                            var89 = 512;
                                        }
                                        int var90 = (var11.field1990 * var88 >> 9) + var11.field2027 / 2 + var13;
                                        int var91 = var14 - (-(var11.field2011 / 2) - (var11.field2122 * var89 >> 9));
                                        class228.field3159.method311();
                                        class249.field3415.method189(class228.field3159);
                                        int var92 = class174.field2572[var11.field2030 << 3] * var11.field2044 >> 15;
                                        int var93 = class174.field2564[var11.field2030 << 3] * var11.field2044 >> 15;
                                        class249.field3415.method142(var90, var91, var88, var89);
                                        class249.field3415.method108((float) var11.field1961, var11.field1988 ? (float) var11.field2079 : (float) var11.field2079 * 1.5F);
                                        if (class436.field6228) {
                                            class249.field3415.method122();
                                            class249.field3415.method110();
                                            class249.field3415.method111(arg4, arg7, arg8, arg6);
                                            class436.field6228 = false;
                                        }
                                        if (var11.field2098) {
                                            class249.field3415.method152(false);
                                        }
                                        if (var11.field2048) {
                                            class227.field3151.method305(-var11.field1954 << 3);
                                            class227.field3151.method320(var11.field2117 << 3);
                                            class227.field3151.method319(var11.field2036, var76 + var92 - -var11.field1997, var11.field1997 + var93);
                                        } else {
                                            class227.field3151.method312(var11.field2117 << 3);
                                            class227.field3151.method319(0, var92, var93);
                                        }
                                        class227.field3151.method313(var11.field2030 << 3);
                                        if (class175.field2586) {
                                            class249.field3415.method218(var13, var14, var11.field2027 + var13, var11.field2011 + var14);
                                        }
                                        if (!var11.field1988) {
                                            var75.method478(class227.field3151, (class197) null, 1);
                                        } else {
                                            var75.method428(class227.field3151, (class197) null, var11.field2044, 1);
                                        }
                                        if (class175.field2586) {
                                            class249.field3415.method111(arg4, arg7, arg8, arg6);
                                        }
                                        if (var11.field2098) {
                                            class249.field3415.method152(true);
                                        }
                                    }
                                } else {
                                    if (~var11.field2023 == -8) {
                                        class175 var94 = var11.method1100(true, class249.field3415);
                                        if (var94 == null) {
                                            if (class426.field6023) {
                                                class10.method52(var11, (byte) -89);
                                            }
                                            continue;
                                        }
                                        int var95 = 0;
                                        for (int var96 = 0; var11.field2020 > var96; ++var96) {
                                            for (int var97 = 0; ~var11.field1956 < ~var97; ++var97) {
                                                if (~var11.field2101[var95] < -1) {
                                                    class452 var98 = class234.method1569(2142, var11.field2101[var95] - 1);
                                                    String var99;
                                                    if (~var98.field6582 != -2 && ~var11.field2071[var95] == -2) {
                                                        var99 = "<col=ff9040>" + var98.field6595 + "</col>";
                                                    } else {
                                                        var99 = "<col=ff9040>" + var98.field6595 + "</col> x" + class183.method1342(var11.field2071[var95], (byte) -119);
                                                    }
                                                    int var100 = (var11.field2056 + 115) * var97 + var13;
                                                    int var101 = var14 - -((12 - -var11.field1966) * var96);
                                                    if (var11.field2083 != 0) {
                                                        if (var11.field2083 == 1) {
                                                            var94.method1301(var100 - -57, var11.field2035 | -16777216, var11.field2078 ? -16777216 : -1, (int[]) null, true, class233.field3208, var99, var101);
                                                        } else {
                                                            var94.method1316(-128, var100 - -115 - 1, !var11.field2078 ? -1 : -16777216, class233.field3208, var99, var11.field2035 | -16777216, var101, (int[]) null);
                                                        }
                                                    } else {
                                                        var94.method1311(class233.field3208, var99, -94, var11.field2035 | -16777216, var101, var100, (int[]) null, var11.field2078 ? -16777216 : -1);
                                                    }
                                                }
                                                ++var95;
                                            }
                                        }
                                    }
                                    if (~var11.field2023 == -9 && class192.field2764 == var11 && class278.field3747 == class107.field1571) {
                                        int var102 = 0;
                                        int var103 = 0;
                                        class175 var104 = class22.field414;
                                        String var105 = var11.field1976;
                                        String var106 = class234.method1553(var11, true, var105);
                                        while (var106.length() > 0) {
                                            int var114 = var106.indexOf("<br>");
                                            String var115;
                                            if (~var114 == 0) {
                                                var115 = var106;
                                                var106 = "";
                                            } else {
                                                var115 = var106.substring(0, var114);
                                                var106 = var106.substring(var114 + 4);
                                            }
                                            int var116 = class442.field6362.method2060(var115, (byte) 43);
                                            var103 += class442.field6362.field4383 + 1;
                                            if (var116 > var102) {
                                                var102 = var116;
                                            }
                                        }
                                        var102 += 6;
                                        var103 += 7;
                                        int var107 = var13 - -var11.field2027 + -var102 + -5;
                                        if (~(var13 - -5) < ~var107) {
                                            var107 = var13 - -5;
                                        }
                                        int var108 = var14 + 5 - -var11.field2011;
                                        if (var102 + var107 > arg8) {
                                            var107 = -var102 + arg8;
                                        }
                                        if (var103 + var108 > arg6) {
                                            var108 = -var103 + arg6;
                                        }
                                        class249.field3415.method95(var107, var108, var102, var103, -96, 0);
                                        class249.field3415.method167(var107, var108, var102, var103, -16777216, 0);
                                        String var109 = var11.field1976;
                                        int var110 = var108 + 2 + class442.field6362.field4383;
                                        String var111 = class234.method1553(var11, true, var109);
                                        while (~var111.length() < -1) {
                                            int var112 = var111.indexOf("<br>");
                                            String var113;
                                            if (~var112 != 0) {
                                                var113 = var111.substring(0, var112);
                                                var111 = var111.substring(var112 - -4);
                                            } else {
                                                var113 = var111;
                                                var111 = "";
                                            }
                                            var104.method1314(var107 - -3, -16777216, var113, -23, var110, -1);
                                            var110 += class442.field6362.field4383 + 1;
                                        }
                                    }
                                    if (~var11.field2023 == -10) {
                                        int var117;
                                        int var118;
                                        int var119;
                                        int var120;
                                        if (!var11.field2031) {
                                            var117 = var11.field2027 + var13;
                                            var118 = var11.field2011 + var14;
                                            var119 = var14;
                                            var120 = var13;
                                        } else {
                                            var118 = var14;
                                            var117 = var11.field2027 + var13;
                                            var120 = var13;
                                            var119 = var11.field2011 + var14;
                                        }
                                        if (~var11.field1960 != -2) {
                                            class249.field3415.method196(var120, var119, var117, var118, var11.field2035, var11.field1960, 0);
                                        } else {
                                            class249.field3415.method219(var120, var119, var117, var118, var11.field2035, 0);
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

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZI)I")
    public static final int method1137(int arg0, boolean arg1, int arg2) {
        ++field2263;
        int var3 = arg2 >>> 24;
        int var4 = (-16711936 & (16711935 & arg2) * var3 | (65280 & arg2) * var3 & 16711680) >>> 8;
        if (arg1) {
            method1136(19, -125, -63, 123, 94, (class139[]) null, -4, -30, 127, -92);
        }
        int var5 = -var3 + 255;
        return ((16711680 & (arg0 & 65280) * var5 | (arg0 & 16711935) * var5 & -16711936) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        ++field2258;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771 && this.method1739(4080)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field3654 * super.field3654;
            for (int var8 = 0; var8 < class156.field2364; ++var8) {
                int var9 = super.field3658[var8 % super.field3648 + var7];
                var6[var8] = class323.method2059(255, var9) << 4;
                var5[var8] = class323.method2059(65280, var9) >> 4;
                var4[var8] = class323.method2059(var9 >> 12, 4080);
            }
        }
        if (!arg0) {
            method1134(-16);
        }
        return var3;
    }
}
