import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class297 extends class24 {

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Luf;")
    private static class168 field5018 = class148.method1019(-1720, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Luf;")
    private static class168 field5014 = class148.method1019(-1720, "slide:");

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Luf;")
    public static class168 field5023 = field5014;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field5030 = 0;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Luf;")
    public static class168 field5026 = field5018;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Luf;")
    public static class168 field5021 = class148.method1019(-1720, ": ");

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "[I")
    public static int[] field5013 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "Luf;")
    public static class168 field5029 = field5014;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "F")
    public static float field5016;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public int field5015;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public int field5031;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public int field5034;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Z")
    public static boolean field5019;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ldk;B)V", line = 8)
    public static final void method2032(class241 arg0, byte arg1) {
        if (arg1 == -65) {
            field5025++;
            class281.field4727 = arg0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIII[Lg;I)V", line = 19)
    public static final void method2033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class242[] arg8, int arg9) {
        field5033++;
        class228.method1563(arg7, arg1, arg0, arg6);
        if (arg5 != -1) {
            field5021 = (class168) null;
        }
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class242 var11 = arg8[var10];
            if (var11 != null && (var11.field3977 == arg4 || arg4 == -1412584499 && class177.field2861 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class204.field3346[class227.field3685] = var11.field3988 + arg2;
                    class256.field4357[class227.field3685] = var11.field4108 + arg9;
                    class69.field915[class227.field3685] = var11.field3989;
                    class82.field1168[class227.field3685] = var11.field4057;
                    var12 = class227.field3685++;
                } else {
                    var12 = arg3;
                }
                var11.field4068 = class203.field3335;
                var11.field4096 = var12;
                if (!var11.field4040 || !client.method2012(var11)) {
                    if (var11.field4115 > 0) {
                        class55.method304(0, var11);
                    }
                    int var13 = var11.field3988 + arg2;
                    int var14 = var11.field4108 + arg9;
                    int var15 = var11.field4080;
                    if (class245.field4165 && (client.method2015(var11) != 0 || var11.field4073 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class177.field2861 == var11) {
                        if (arg4 != -1412584499 && !var11.field4052) {
                            class87.field1345 = arg8;
                            class226.field3680 = arg9;
                            class251.field4268 = arg2;
                            continue;
                        }
                        if (!var11.field4052) {
                            var15 = 128;
                        }
                        if (class177.field2853 && class299.field5074) {
                            int var16 = class262.field4442;
                            int var17 = var16 - class266.field4493;
                            if (class61.field798 > var17) {
                                var17 = class61.field798;
                            }
                            int var18 = class155.field2457;
                            if ((class61.field798 + class248.field4241.field3989) < (var17 + var11.field3989)) {
                                var17 = class61.field798 + class248.field4241.field3989 - var11.field3989;
                            }
                            int var19 = var18 - class190.field3085;
                            if (class27.field342 > var19) {
                                var19 = class27.field342;
                            }
                            var13 = var17;
                            if ((class27.field342 + class248.field4241.field4057) < (var11.field4057 + var19)) {
                                var19 = class27.field342 + class248.field4241.field4057 - var11.field4057;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4073 == 2) {
                        var20 = arg0;
                        var21 = arg1;
                        var22 = arg7;
                        var23 = arg6;
                    } else {
                        var22 = arg7 < var13 ? var13 : arg7;
                        int var24 = var14 + var11.field4057;
                        int var25 = var11.field3989 + var13;
                        var21 = var14 > arg1 ? var14 : arg1;
                        if (var11.field4073 == 9) {
                            var24++;
                            var25++;
                        }
                        var23 = arg6 <= var24 ? arg6 : var24;
                        var20 = var25 >= arg0 ? arg0 : var25;
                    }
                    if (!var11.field4040 || var22 < var20 && var23 > var21) {
                        if (var11.field4115 != 0) {
                            if (var11.field4115 == 1337 || var11.field4115 == 1403) {
                                class183.field2940 = var13;
                                class143.field2206 = var11;
                                class99.field1551 = var14;
                                class45.method243(var11.field3989, var11.field4057, false, var13, var14, var11.field4115 == 1403);
                                class228.method1563(arg7, arg1, arg0, arg6);
                                continue;
                            }
                            if (var11.field4115 == 1338) {
                                if (var11.method1662(arg5 - 82)) {
                                    class24.method125(arg5 - 66, var13, var14, var11, var12);
                                    class228.method1563(arg7, arg1, arg0, arg6);
                                }
                                continue;
                            }
                            if (var11.field4115 == 1339) {
                                if (var11.method1662(-68)) {
                                    class253.method1745(var14, var11, arg5 + 85, var12, var13);
                                    class228.method1563(arg7, arg1, arg0, arg6);
                                }
                                continue;
                            }
                            if (var11.field4115 == 1400) {
                                class263.method1832(2167, var11.field3989, var13, var11.field4057, var14);
                                class214.field3495[var12] = true;
                                class131.field2028[var12] = true;
                                class228.method1563(arg7, arg1, arg0, arg6);
                                continue;
                            }
                            if (var11.field4115 == 1401) {
                                class115.method841(var11.field3989, var14, 17414, var13, var11.field4057);
                                class214.field3495[var12] = true;
                                class131.field2028[var12] = true;
                                class228.method1563(arg7, arg1, arg0, arg6);
                                continue;
                            }
                            if (var11.field4115 == 1402) {
                                continue;
                            }
                            if (var11.field4115 == 1404) {
                                class272.method1880(var11.field4057, var11.field3989, var14, class102.field1588, 24543, var13, var11, class245.field4170);
                                class214.field3495[var12] = true;
                                class131.field2028[var12] = true;
                                continue;
                            }
                            if (var11.field4115 == 1405) {
                                if (class294.field4982) {
                                    int var26 = var11.field3989 + var13;
                                    int var27 = var14 + 15;
                                    int var28 = 16776960;
                                    class283.field4781.method213(class134.method938((byte) -123, new class168[] { class182.field2922, class169.method1228(class99.field1553, 0) }), var26, var27, 16776960, -1);
                                    Runtime var29 = Runtime.getRuntime();
                                    int var114 = var27 + 15;
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    if (var30 > 65536) {
                                        var28 = 16711680;
                                    }
                                    class283.field4781.method213(class134.method938((byte) -123, new class168[] { class68.field908, class169.method1228(var30, 0), class135.field2108 }), var26, var114, var28, -1);
                                    var27 = var114 + 15;
                                    int var31 = 16776960;
                                    int var32 = (class7.field90 + class7.field86 + class7.field89) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class283.field4781.method213(class134.method938((byte) -125, new class168[] { class281.field4723, class169.method1228(var32, 0), class135.field2108 }), var26, var27, var31, -1);
                                    var27 += 15;
                                    class214.field3495[var12] = true;
                                    class131.field2028[var12] = true;
                                }
                                continue;
                            }
                        }
                        if (!class121.field1888) {
                            if (var11.field4073 == 0 && var11.field4127 && class301.field5093 >= var22 && class166.field2661 >= var21 && var20 > class301.field5093 && var23 > class166.field2661 && !class245.field4165) {
                                class61.field804[0] = 1006;
                                class224.field3625[0] = class122.field1896;
                                class274.field4606[0] = class182.field2934;
                                class22.field275 = 1;
                            }
                            if (var22 <= class301.field5093 && class166.field2661 >= var21 && class301.field5093 < var20 && class166.field2661 < var23) {
                                class145.method987(var11, class301.field5093 - var13, (byte) 91, class166.field2661 - var14);
                            }
                        }
                        if (var11.field4073 == 0) {
                            if (!var11.field4040 && client.method2012(var11) && class177.field2855 != var11) {
                                continue;
                            }
                            if (!var11.field4040) {
                                if (var11.field4007 - var11.field4057 < var11.field4079) {
                                    var11.field4079 = var11.field4007 - var11.field4057;
                                }
                                if (var11.field4079 < 0) {
                                    var11.field4079 = 0;
                                }
                            }
                            method2033(var20, var21, var13 - var11.field4092, var12, var11.field3996, arg5 ^ 0x0, var23, var22, arg8, var14 - var11.field4079);
                            if (var11.field4004 != null) {
                                method2033(var20, var21, var13 - var11.field4092, var12, var11.field3996, -1, var23, var22, var11.field4004, var14 - var11.field4079);
                            }
                            class240 var33 = (class240) class26.field319.method493((long) var11.field3996, arg5 ^ 0xFFFFFFCB);
                            if (var33 != null) {
                                if (var33.field3892 == 0 && !class121.field1888 && class301.field5093 >= var22 && var21 <= class166.field2661 && class301.field5093 < var20 && class166.field2661 < var23 && !class245.field4165) {
                                    class61.field804[0] = 1006;
                                    class224.field3625[0] = class122.field1896;
                                    class274.field4606[0] = class182.field2934;
                                    class22.field275 = 1;
                                }
                                class183.method1301(var20, var14, var12, var23, var22, var33.field3898, var13, (byte) 126, var21);
                            }
                            class228.method1563(arg7, arg1, arg0, arg6);
                        }
                        if (class216.field3518[var12] || class254.field4348 > 1) {
                            if (var11.field4073 == 0 && !var11.field4040 && var11.field4057 < var11.field4007) {
                                class86.method596(2072, var11.field3989 + var13, var11.field4007, var11.field4079, var11.field4057, var14);
                            }
                            if (var11.field4073 != 1) {
                                if (var11.field4073 == 2) {
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < var11.field4005; var35++) {
                                        for (int var36 = 0; var36 < var11.field4036; var36++) {
                                            int var37 = (var11.field3990 + 32) * var35 + var14;
                                            int var38 = var13 + ((var11.field3983 + 32) * var36);
                                            if (var34 < 20) {
                                                var37 += var11.field4100[var34];
                                                var38 += var11.field4056[var34];
                                            }
                                            if (var11.field4013[var34] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var11.field4013[var34] - 1;
                                                if ((var38 + 32) > arg7 && arg0 > var38 && var37 + 32 > arg1 && arg6 > var37 || class24.field291 == var11 && class270.field4542 == var34) {
                                                    class284 var43;
                                                    if (class211.field3461 == 1 && class85.field1301 == var34 && class123.field1904 == var11.field3996) {
                                                        var43 = class71.method403(var42, var11.field4072, 0, (byte) -118, var11.field4066[var34], 2);
                                                    } else {
                                                        var43 = class71.method403(var42, var11.field4072, 3153952, (byte) -118, var11.field4066[var34], 1);
                                                    }
                                                    if (class173.field2823) {
                                                        class214.field3495[var12] = true;
                                                    }
                                                    if (var43 == null) {
                                                        client.method2011((byte) -59, var11);
                                                    } else if (class24.field291 == var11 && class270.field4542 == var34) {
                                                        int var44 = class155.field2457 - class116.field1803;
                                                        int var45 = class262.field4442 - class237.field3786;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class61.field803 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method268(var38 + var45, var37 + var44, 128);
                                                        if (arg4 != -1) {
                                                            int var46 = class228.field3690;
                                                            int var47 = class228.field3693;
                                                            class242 var48 = arg8[arg4 & 0xFFFF];
                                                            if (var47 > (var37 + var44) && var48.field4079 > 0) {
                                                                int var49 = (var47 - var37 - var44) * class274.field4619 / 3;
                                                                if (var49 > (class274.field4619 * 10)) {
                                                                    var49 = class274.field4619 * 10;
                                                                }
                                                                if (var48.field4079 < var49) {
                                                                    var49 = var48.field4079;
                                                                }
                                                                class116.field1803 += var49;
                                                                var48.field4079 -= var49;
                                                                client.method2011((byte) -59, var48);
                                                            }
                                                            if (var46 < (var37 + var44 + 32) && (var48.field4007 - var48.field4057) > var48.field4079) {
                                                                int var50 = (var44 + var37 + 32 - var46) * class274.field4619 / 3;
                                                                if (class274.field4619 * 10 < var50) {
                                                                    var50 = class274.field4619 * 10;
                                                                }
                                                                if ((var48.field4007 - var48.field4057 - var48.field4079) < var50) {
                                                                    var50 = var48.field4007 - var48.field4079 - var48.field4057;
                                                                }
                                                                var48.field4079 += var50;
                                                                class116.field1803 -= var50;
                                                                client.method2011((byte) -59, var48);
                                                            }
                                                        }
                                                    } else if (class196.field3225 == var11 && class106.field1630 == var34) {
                                                        var43.method268(var38, var37, 128);
                                                    } else {
                                                        var43.method151(var38, var37);
                                                    }
                                                }
                                            } else if (var11.field4114 != null && var34 < 20) {
                                                class284 var39 = var11.method1669(var34, arg5 + 126);
                                                if (var39 != null) {
                                                    var39.method151(var38, var37);
                                                } else if (class5.field67) {
                                                    client.method2011((byte) -59, var11);
                                                }
                                            }
                                            var34++;
                                        }
                                    }
                                } else if (var11.field4073 == 3) {
                                    int var113;
                                    if (class20.method96(true, var11)) {
                                        var113 = var11.field4003;
                                        if (class177.field2855 == var11 && var11.field4082 != 0) {
                                            var113 = var11.field4082;
                                        }
                                    } else {
                                        var113 = var11.field4034;
                                        if (class177.field2855 == var11 && var11.field3974 != 0) {
                                            var113 = var11.field3974;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field4011) {
                                            class228.method1560(var13, var14, var11.field3989, var11.field4057, var113);
                                        } else {
                                            class228.method1558(var13, var14, var11.field3989, var11.field4057, var113);
                                        }
                                    } else if (var11.field4011) {
                                        class228.method1554(var13, var14, var11.field3989, var11.field4057, var113, 256 - (var15 & 0xFF));
                                    } else {
                                        class228.method1561(var13, var14, var11.field3989, var11.field4057, var113, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field4073 == 4) {
                                    class37 var109 = var11.method1663(client.field4945, 22719);
                                    if (var109 != null) {
                                        class168 var110 = var11.field4030;
                                        int var111;
                                        if (class20.method96(true, var11)) {
                                            var111 = var11.field4003;
                                            if (class177.field2855 == var11 && var11.field4082 != 0) {
                                                var111 = var11.field4082;
                                            }
                                            if (var11.field4064.method1167(false) > 0) {
                                                var110 = var11.field4064;
                                            }
                                        } else {
                                            var111 = var11.field4034;
                                            if (class177.field2855 == var11 && var11.field3974 != 0) {
                                                var111 = var11.field3974;
                                            }
                                        }
                                        if (var11.field4040 && var11.field3976 != -1) {
                                            class238 var112 = class284.method1963((byte) 100, var11.field3976);
                                            var110 = var112.field3833;
                                            if (var110 == null) {
                                                var110 = class227.field3682;
                                            }
                                            if ((var112.field3847 == 1 || var11.field3964 != 1) && var11.field3964 != -1) {
                                                var110 = class134.method938((byte) -124, new class168[] { class64.field855, var110, class127.field1960, class65.method374(true, var11.field3964) });
                                            }
                                        }
                                        if (class94.field1507 == var11) {
                                            var111 = var11.field4034;
                                            var110 = class57.field750;
                                        }
                                        if (!var11.field4040) {
                                            var110 = class71.method402(var11, var110, 123);
                                        }
                                        var109.method202(var110, var13, var14, var11.field3989, var11.field4057, var111, var11.field3973 ? 0 : -1, var11.field4038, var11.field3975, var11.field3960);
                                    } else if (class5.field67) {
                                        client.method2011((byte) -59, var11);
                                    }
                                } else if (var11.field4073 == 5) {
                                    if (var11.field4040) {
                                        class284 var51;
                                        if (var11.field3976 == -1) {
                                            var51 = var11.method1666(-64, false);
                                        } else {
                                            var51 = class71.method403(var11.field3976, var11.field4072, var11.field4118, (byte) -118, var11.field3964, var11.field4110);
                                        }
                                        if (var51 != null) {
                                            int var52 = var51.field4817;
                                            int var53 = var51.field4804;
                                            if (var11.field3992) {
                                                int var54 = (var11.field4057 + var53 - 1) / var53;
                                                int var55 = (var11.field3989 + var52 - 1) / var52;
                                                class228.method1562(var13, var14, var11.field3989 + var13, var11.field4057 + var14);
                                                boolean var56 = class138.method955(var51.field4801, 98);
                                                boolean var57 = class138.method955(var51.field4808, 110);
                                                class258 var58 = (class258) var51;
                                                if (var56 && var57) {
                                                    if (var15 == 0) {
                                                        var58.method1773(var13, var14, var55, var54);
                                                    } else {
                                                        var58.method1774(var13, var14, 256 - (var15 & 0xFF), var55, var54);
                                                    }
                                                } else if (var56) {
                                                    for (int var62 = 0; var62 < var54; var62++) {
                                                        if (var15 == 0) {
                                                            var58.method1773(var13, var14 + (var53 * var62), var55, 1);
                                                        } else {
                                                            var58.method1774(var13, var53 * var62 + var14, 256 - (var15 & 0xFF), var55, 1);
                                                        }
                                                    }
                                                } else if (var57) {
                                                    for (int var61 = 0; var61 < var55; var61++) {
                                                        if (var15 == 0) {
                                                            var58.method1773(var52 * var61 + var13, var14, 1, var54);
                                                        } else {
                                                            var58.method1774(var52 * var61 + var13, var14, 256 - (var15 & 0xFF), 1, var54);
                                                        }
                                                    }
                                                } else {
                                                    for (int var59 = 0; var59 < var55; var59++) {
                                                        for (int var60 = 0; var60 < var54; var60++) {
                                                            if (var15 == 0) {
                                                                var51.method151(var52 * var59 + var13, var14 - -(var53 * var60));
                                                            } else {
                                                                var51.method268(var52 * var59 + var13, var53 * var60 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                }
                                                class228.method1563(arg7, arg1, arg0, arg6);
                                            } else {
                                                int var63 = var11.field3989 * 4096 / var52;
                                                if (var11.field3968 != 0) {
                                                    var51.method1965(var63, 9183, var11.field3989 / 2 + var13, var11.field3968, var14 + (var11.field4057 / 2));
                                                } else if (var15 != 0) {
                                                    var51.method264(var13, var14, var11.field3989, var11.field4057, 256 - (var15 & 0xFF));
                                                } else if (var11.field3989 == var52 && var11.field4057 == var53) {
                                                    var51.method151(var13, var14);
                                                } else {
                                                    var51.method265(var13, var14, var11.field3989, var11.field4057);
                                                }
                                            }
                                        } else if (class5.field67) {
                                            client.method2011((byte) -59, var11);
                                        }
                                    } else {
                                        class284 var64 = var11.method1666(arg5 - 75, class20.method96(true, var11));
                                        if (var64 != null) {
                                            var64.method151(var13, var14);
                                        } else if (class5.field67) {
                                            client.method2011((byte) -59, var11);
                                        }
                                    }
                                } else if (var11.field4073 == 6) {
                                    class152 var92 = null;
                                    boolean var93 = class20.method96(true, var11);
                                    int var94;
                                    if (var93) {
                                        var94 = var11.field4055;
                                    } else {
                                        var94 = var11.field3978;
                                    }
                                    int var95 = 0;
                                    if (var11.field3976 != -1) {
                                        class238 var100 = class284.method1963((byte) 90, var11.field3976);
                                        if (var100 != null) {
                                            class238 var101 = var100.method1614(var11.field3964, false);
                                            class190 var102 = var94 == -1 ? null : class119.method858(true, var94);
                                            var92 = var101.method1603(1, -40, var11.field4091, var102);
                                            if (var92 == null) {
                                                client.method2011((byte) -59, var11);
                                            } else {
                                                var95 = -var92.method116() / 2;
                                            }
                                        }
                                    } else if (var11.field4022 == 5) {
                                        if (var11.field3993 == -1) {
                                            var92 = class300.field5080.method1498((class190) null, -1, false, -1, (class190) null);
                                        } else {
                                            int var96 = var11.field3993 & 0x7FF;
                                            if (class65.field873 == var96) {
                                                var96 = 2047;
                                            }
                                            class54 var97 = class9.field117[var96];
                                            class190 var98 = var94 == -1 ? null : class119.method858(true, var94);
                                            if (var97 != null && ((int) var97.field658.method1208((byte) 71) << 11) == (var11.field3993 & 0xFFFFF800)) {
                                                var92 = var97.field668.method1498((class190) null, 0, false, var11.field4091, var98);
                                            }
                                        }
                                    } else if (var94 == -1) {
                                        var92 = var11.method1672(class266.field4489.field668, -1, (byte) -37, var93, (class190) null);
                                        if (var92 == null && class5.field67) {
                                            client.method2011((byte) -59, var11);
                                        }
                                    } else {
                                        class190 var99 = class119.method858(true, var94);
                                        var92 = var11.method1672(class266.field4489.field668, var11.field4091, (byte) -37, var93, var99);
                                        if (var92 == null && class5.field67) {
                                            client.method2011((byte) -59, var11);
                                        }
                                    }
                                    if (var92 != null) {
                                        int var103;
                                        if (var11.field4089 <= 0) {
                                            var103 = 256;
                                        } else {
                                            var103 = (var11.field3989 << 8) / var11.field4089;
                                        }
                                        int var104 = (var11.field4120 * var103 >> 8) + var11.field3989 / 2 + var13;
                                        int var105;
                                        if (var11.field3999 <= 0) {
                                            var105 = 256;
                                        } else {
                                            var105 = (var11.field4057 << 8) / var11.field3999;
                                        }
                                        int var106 = (var11.field4078 * var105 >> 8) + var11.field4057 / 2 + var14;
                                        if (var11.field4024) {
                                            class90.method640(var104, var106, var11.field3980, var11.field4123, var103, var105);
                                        } else {
                                            class90.method631(var104, var106, var103, var105);
                                            class90.method627((float) var11.field3972, (float) var11.field4123 * 1.5F);
                                        }
                                        class90.method637();
                                        class90.method629(true);
                                        class90.method638(false);
                                        class203.method1416(21419);
                                        if (class226.field3677) {
                                            class228.method1559();
                                            class90.method608();
                                            class228.method1563(arg7, arg1, arg0, arg6);
                                            class226.field3677 = false;
                                        }
                                        if (var11.field4045) {
                                            class90.method619();
                                        }
                                        int var107 = class173.field2818[var11.field4098] * var11.field3980 >> 16;
                                        int var108 = class173.field2812[var11.field4098] * var11.field3980 >> 16;
                                        if (var11.field4040) {
                                            var92.method707(0, var11.field4006, var11.field4117, var11.field4098, var11.field4002, var95 + var108 + var11.field4081, var107 - -var11.field4081);
                                        } else {
                                            var92.method707(0, var11.field4006, 0, var11.field4098, 0, var108, var107);
                                        }
                                        if (var11.field4045) {
                                            class90.method642();
                                        }
                                    }
                                } else {
                                    if (var11.field4073 == 7) {
                                        class37 var65 = var11.method1663(client.field4945, 22719);
                                        if (var65 == null) {
                                            if (class5.field67) {
                                                client.method2011((byte) -59, var11);
                                            }
                                            continue;
                                        }
                                        int var66 = 0;
                                        for (int var67 = 0; var67 < var11.field4005; var67++) {
                                            for (int var68 = 0; var68 < var11.field4036; var68++) {
                                                if (var11.field4013[var66] > 0) {
                                                    class238 var69 = class284.method1963((byte) -80, var11.field4013[var66] - 1);
                                                    class168 var70;
                                                    if (var69.field3847 != 1 && var11.field4066[var66] == 1) {
                                                        var70 = class134.method938((byte) -123, new class168[] { class64.field855, var69.field3833, class193.field3138 });
                                                    } else {
                                                        var70 = class134.method938((byte) -126, new class168[] { class64.field855, var69.field3833, class127.field1960, class65.method374(true, var11.field4066[var66]) });
                                                    }
                                                    int var71 = (var11.field3983 + 115) * var68 + var13;
                                                    int var72 = (var11.field3990 + 12) * var67 + var14;
                                                    if (var11.field4038 == 0) {
                                                        var65.method193(var70, var71, var72, var11.field4034, var11.field3973 ? 0 : -1);
                                                    } else if (var11.field4038 == 1) {
                                                        var65.method192(var70, var71 + 57, var72, var11.field4034, var11.field3973 ? 0 : -1);
                                                    } else {
                                                        var65.method213(var70, var71 + 115 - 1, var72, var11.field4034, var11.field3973 ? 0 : -1);
                                                    }
                                                }
                                                var66++;
                                            }
                                        }
                                    }
                                    if (var11.field4073 == 8 && class271.field4553 == var11 && class200.field3298 == class117.field1820) {
                                        int var73 = 0;
                                        class168 var74 = var11.field4030;
                                        int var75 = 0;
                                        class37 var76 = class283.field4781;
                                        class168 var77 = class71.method402(var11, var74, 124);
                                        while (var77.method1167(false) > 0) {
                                            int var78 = var77.method1196(class249.field4255, 187);
                                            class168 var79;
                                            if (var78 == -1) {
                                                var79 = var77;
                                                var77 = class182.field2934;
                                            } else {
                                                var79 = var77.method1187(0, 0, var78);
                                                var77 = var77.method1193((byte) -86, var78 + 4);
                                            }
                                            int var80 = var76.method207(var79);
                                            if (var80 > var75) {
                                                var75 = var80;
                                            }
                                            var73 += var76.field443 + 1;
                                        }
                                        var73 += 7;
                                        var75 += 6;
                                        int var81 = var14 + var11.field4057 + 5;
                                        if (var81 + var73 > arg6) {
                                            var81 = arg6 - var73;
                                        }
                                        int var82 = var13 + var11.field3989 - var75 - 5;
                                        if (var82 < var13 + 5) {
                                            var82 = var13 + 5;
                                        }
                                        if (var75 + var82 > arg0) {
                                            var82 = arg0 - var75;
                                        }
                                        class228.method1560(var82, var81, var75, var73, 16777120);
                                        class228.method1558(var82, var81, var75, var73, 0);
                                        class168 var83 = var11.field4030;
                                        int var84 = var76.field443 + var81 + 2;
                                        class168 var85 = class71.method402(var11, var83, 125);
                                        while (var85.method1167(false) > 0) {
                                            int var86 = var85.method1196(class249.field4255, 187);
                                            class168 var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = class182.field2934;
                                            } else {
                                                var87 = var85.method1187(0, 0, var86);
                                                var85 = var85.method1193((byte) -86, var86 + 4);
                                            }
                                            var76.method193(var87, var82 + 3, var84, 0, -1);
                                            var84 += var76.field443 + 1;
                                        }
                                    }
                                    if (var11.field4073 == 9) {
                                        int var88;
                                        int var89;
                                        int var90;
                                        int var91;
                                        if (var11.field4101) {
                                            var88 = var14;
                                            var89 = var11.field3989 + var13;
                                            var90 = var13;
                                            var91 = var11.field4057 + var14;
                                        } else {
                                            var89 = var13 + var11.field3989;
                                            var88 = var14 + var11.field4057;
                                            var90 = var13;
                                            var91 = var14;
                                        }
                                        if (var11.field4019 == 1) {
                                            class228.method1557(var90, var91, var89, var88, var11.field4034);
                                        } else {
                                            class228.method1565(var90, var91, var89, var88, var11.field4034, var11.field4019);
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

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 1115)
    public static void method2034(int arg0) {
        field5014 = null;
        field5029 = null;
        field5013 = null;
        field5021 = null;
        field5018 = null;
        field5026 = null;
        field5023 = null;
        if (arg0 != 0) {
            field5020 = 7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V", line = 1159)
    public static final void method2035(int arg0, int arg1, int arg2) {
        class281.field4726 = class271.field4559[arg2][arg0].field2286;
        field5028++;
        if (arg1 == 1) {
            class57.field741 = class271.field4559[arg2][arg0].field2282;
            class38.field473 = class271.field4559[arg2][arg0].field2283;
            class34.method161((float) class281.field4726, (float) class57.field741, (float) class38.field473);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljg;IIILkg;Loe;IZ)V", line = 1183)
    public static final void method2036(class161 arg0, int arg1, int arg2, int arg3, class22 arg4, class54 arg5, int arg6, boolean arg7) {
        if (!arg7) {
            method2034(-13);
        }
        field5027++;
        class113 var8 = new class113();
        var8.field1761 = arg3 * 128;
        var8.field1756 = arg6 * 128;
        var8.field1755 = arg1;
        if (arg0 != null) {
            var8.field1766 = arg0.field2585;
            var8.field1754 = arg0.field2600;
            var8.field1752 = arg0.field2614;
            var8.field1769 = arg0;
            var8.field1773 = arg0.field2588 * 128;
            var8.field1751 = arg0.field2609;
            int var10 = arg0.field2559;
            int var11 = arg0.field2558;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg0.field2558;
                var11 = arg0.field2559;
            }
            var8.field1765 = (arg3 + var11) * 128;
            var8.field1764 = (arg6 + var10) * 128;
            if (arg0.field2553 != null) {
                var8.field1750 = true;
                var8.method829(28976);
            }
            if (var8.field1766 != null) {
                var8.field1768 = var8.field1752 + ((int) ((double) (var8.field1751 - var8.field1752) * Math.random()));
            }
            class215.field3499.method451(-91453648, var8);
        } else if (arg4 != null) {
            var8.field1749 = arg4;
            class196 var9 = arg4.field267;
            if (var9.field3188 != null) {
                var8.field1750 = true;
                var9 = var9.method1387((byte) -1);
            }
            if (var9 != null) {
                var8.field1764 = (arg6 + var9.field3211) * 128;
                var8.field1765 = (var9.field3211 + arg3) * 128;
                var8.field1754 = class101.method763(23718, arg4);
                var8.field1773 = var9.field3236 * 128;
            }
            class14.field146.method451(-91453648, var8);
        } else if (arg5 != null) {
            var8.field1764 = (arg5.field3012 + arg6) * 128;
            var8.field1758 = arg5;
            var8.field1765 = (arg3 + arg5.field3012) * 128;
            var8.field1754 = class209.method1465(arg5, -11250);
            var8.field1773 = arg5.field690 * 128;
            class244.field4152.method490(var8, arg5.field658.method1208((byte) 71), true);
        }
    }
}
