import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class520 extends class231 {

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field7077 = 0;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field7078 = 0;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Lhs;")
    public static class295 field7080 = new class295(1, 1);

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Luc;")
    public static class27 field7082 = new class27(2, 2);

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Luc;")
    public static class27 field7083 = new class27(38, 2);

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Z")
    public static boolean field7084 = false;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lql;Z)V", line = 11)
    public static final void method2880(class674 arg0, boolean arg1) {
        for (int var2 = 0; var2 < class1.field11; var2++) {
            int var3 = class93.field1229[var2];
            class286 var4 = class495.field6821[var3];
            int var5 = arg0.method718(-93);
            if ((var5 & 0x20) != 0) {
                var5 += arg0.method718(79) << 8;
            }
            if ((var5 & 0x8000) != 0) {
                var5 += arg0.method718(-83) << 16;
            }
            class606.method3354(var3, var5, arg0, (byte) -17, var4);
        }
        field7081++;
        if (!arg1) {
            field7083 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 46)
    public static void method2881(int arg0) {
        field7083 = null;
        field7082 = null;
        if (arg0 == -3536) {
            field7080 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([Lfaa;IIIIIIIIB)V", line = 75)
    public static final void method2882(class140[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        class630.field8790.method442(arg1, arg8, arg5, arg7);
        field7079++;
        int var10 = 0;
        if (arg9 >= -100) {
            method2881(-99);
        }
        while (arg0.length > var10) {
            class140 var11 = arg0[var10];
            if (var11 != null && (var11.field2054 == arg4 || arg4 == -1412584499 && class612.field8489 == var11)) {
                int var12;
                if (arg6 == -1) {
                    class121.field1678[class150.field2245].setBounds(var11.field2029 + arg3, var11.field2027 - -arg2, var11.field2121, var11.field2082);
                    var12 = class150.field2245++;
                } else {
                    var12 = arg6;
                }
                var11.field2069 = var12;
                var11.field1996 = class239.field3440;
                if (!client.method1658(var11)) {
                    label588: {
                        if (var11.field1998 != 0) {
                            class442.method2535(27843, var11);
                        }
                        int var13 = var11.field2029 + arg3;
                        int var14 = var11.field2027 + arg2;
                        int var15 = var11.field1956;
                        if (class203.field2973 && (client.method1655(var11).field7010 != 0 || var11.field2023 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class612.field8489 == var11) {
                            if (arg4 != -1412584499 && (class575.field7733 == var11.field2018 || class570.field7664 == var11.field2018)) {
                                class209.field3088 = arg2;
                                class664.field9361 = arg0;
                                class185.field2721 = arg3;
                                break label588;
                            }
                            if (class507.field6935 && class363.field5178) {
                                int var16 = class46.field686.method70((byte) 99);
                                int var17 = class46.field686.method66(74);
                                int var18 = var17 - class156.field2359;
                                int var19 = var16 - class534.field7276;
                                if (class591.field8229 > var19) {
                                    var19 = class591.field8229;
                                }
                                if ((class591.field8229 + class152.field2271.field2121) < (var11.field2121 + var19)) {
                                    var19 = class591.field8229 + class152.field2271.field2121 - var11.field2121;
                                }
                                if (var18 < class136.field1920) {
                                    var18 = class136.field1920;
                                }
                                var13 = var19;
                                if ((var11.field2082 + var18) > (class136.field1920 + class152.field2271.field2082)) {
                                    var18 = class136.field1920 + class152.field2271.field2082 - var11.field2082;
                                }
                                var14 = var18;
                            }
                            if (class570.field7664 == var11.field2018) {
                                var15 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field2023 == 2) {
                            var20 = arg8;
                            var21 = arg1;
                            var22 = arg5;
                            var23 = arg7;
                        } else {
                            int var24 = var11.field2121 + var13;
                            int var25 = var11.field2082 + var14;
                            if (var11.field2023 == 9) {
                                var25++;
                                var24++;
                            }
                            var20 = arg8 < var14 ? var14 : arg8;
                            var21 = arg1 >= var13 ? arg1 : var13;
                            var22 = arg5 <= var24 ? arg5 : var24;
                            var23 = var25 >= arg7 ? arg7 : var25;
                        }
                        if (var22 > var21 && var20 < var23) {
                            label615: {
                                if (var11.field1998 != 0) {
                                    if (class219.field3170 == var11.field1998 || class608.field8459 == var11.field1998) {
                                        class347.method2068(var11.field2082, 66, var14, var13, var11.field2121, class608.field8459 == var11.field1998);
                                        class287.field3996[var12] = true;
                                        class630.field8790.method442(arg1, arg8, arg5, arg7);
                                        break label615;
                                    }
                                    if (class299.field4459 == var11.field1998) {
                                        if (var11.method999((byte) -127, class630.field8790) != null) {
                                            class74.method592(0);
                                            class190.method1262(class630.field8790, var13, var11, 5, var14);
                                            class183.field2696[var12] = true;
                                            class630.field8790.method442(arg1, arg8, arg5, arg7);
                                        }
                                        break label615;
                                    }
                                    if (class350.field5047 == var11.field1998) {
                                        if (var11.method999((byte) -50, class630.field8790) != null) {
                                            class321.method1954(var14, var11, (byte) -41, var13);
                                            class183.field2696[var12] = true;
                                            class630.field8790.method442(arg1, arg8, arg5, arg7);
                                        }
                                        break label615;
                                    }
                                    if (class687.field9669 == var11.field1998) {
                                        class119.method857(var11.field2082, var11.field2121, var14, (byte) 71, class139.field1950, class630.field8790, var13);
                                        class287.field3996[var12] = true;
                                        class630.field8790.method442(arg1, arg8, arg5, arg7);
                                        break label615;
                                    }
                                    if (class525.field7166 == var11.field1998) {
                                        class238.method1501(var11.field2121, var14, var13, var11.field2082, (byte) -108, class630.field8790);
                                        class287.field3996[var12] = true;
                                        class630.field8790.method442(arg1, arg8, arg5, arg7);
                                        break label615;
                                    }
                                    if (class93.field1230 == var11.field1998) {
                                        if (!class99.field1356 && !class178.field2635) {
                                            break label615;
                                        }
                                        int var26 = var11.field2121 + var13;
                                        int var27 = var14 + 15;
                                        if (class99.field1356) {
                                            int var28 = -256;
                                            if (class454.field6343 < 20) {
                                                var28 = -65536;
                                            }
                                            class668.field9418.method1300(var27, var26, -109, var28, "Fps:" + class454.field6343, -1);
                                            var27 += 15;
                                            Runtime var29 = Runtime.getRuntime();
                                            int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            int var31 = -256;
                                            if (var30 > 65536) {
                                                var31 = -65536;
                                                if (class188.field2778) {
                                                    class94.method689((byte) -26);
                                                    for (int var32 = 0; var32 < 10; var32++) {
                                                        System.gc();
                                                    }
                                                    var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                                    if (var30 > 65536) {
                                                        class235.method1482(4, 24658, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                                    }
                                                }
                                            }
                                            class668.field9418.method1300(var27, var26, -107, var31, "Mem:" + var30 + "k", -1);
                                            var27 += 15;
                                            class668.field9418.method1300(var27, var26, -103, -256, "In:" + class186.field2749 + "B/s Out:" + class592.field8247 + "B/s", -1);
                                            var27 += 15;
                                            int var33 = class630.field8790.method400() / 1024;
                                            class668.field9418.method1300(var27, var26, -119, var33 <= 65536 ? -256 : -65536, "Offheap:" + var33 + "k", -1);
                                            var27 += 15;
                                            int var34 = 0;
                                            int var35 = 0;
                                            int var36 = 0;
                                            for (int var37 = 0; var37 < 34; var37++) {
                                                var34 += class202.field2969[var37].method3702(true);
                                                var35 += class202.field2969[var37].method3700(126);
                                                var36 += class202.field2969[var37].method3706(-127);
                                            }
                                            int var38 = var36 * 100 / var34;
                                            int var39 = var35 * 10000 / var34;
                                            String var40 = "Cache:" + class161.method1122(2, (long) var39, -1, 0, true) + "% (" + var38 + "%)";
                                            class229.field3276.method1300(var27, var26, -123, -256, var40, -1);
                                            var27 += 12;
                                        }
                                        if (class472.field6587 > 0) {
                                            class229.field3276.method1300(var27, var26, -117, -256, "Particles: " + class312.field4638 + " / " + class472.field6587, -1);
                                        }
                                        var27 += 12;
                                        if (class178.field2635) {
                                            class229.field3276.method1300(var27, var26, -111, -256, "Polys: " + class630.field8790.method356() + " Models: " + class630.field8790.method471(), -1);
                                            var27 += 12;
                                            class229.field3276.method1300(var27, var26, -109, -256, "Ls: " + class171.field2566 + " La: " + class132.field1843 + " NPC: " + class609.field8471 + " Pl: " + class538.field7301, -1);
                                            class556.method3048((byte) 2);
                                            var27 += 12;
                                        }
                                        class287.field3996[var12] = true;
                                        break label615;
                                    }
                                }
                                if (var11.field2023 == 0) {
                                    if (class438.field6177 == var11.field1998 && class630.field8790.method308()) {
                                        class630.field8790.method342(var13, var14, var11.field2121, var11.field2082);
                                    }
                                    method2882(arg0, var21, var14 - var11.field2073, var13 - var11.field2122, var11.field2100, var22, var12, var23, var20, (byte) -109);
                                    if (var11.field2043 != null) {
                                        method2882(var11.field2043, var21, var14 - var11.field2073, -var11.field2122 + var13, var11.field2100, var22, var12, var23, var20, (byte) -108);
                                    }
                                    class198 var41 = (class198) class368.field5262.method2061(-17305, (long) var11.field2100);
                                    if (var41 != null) {
                                        class250.method1546(var12, var22, var23, var41.field2922, var14, var20, var13, -18420, var21);
                                    }
                                    if (class438.field6177 == var11.field1998 && class630.field8790.method308()) {
                                        class630.field8790.method296();
                                        class318.field4711 = true;
                                    }
                                    class630.field8790.method442(arg1, arg8, arg5, arg7);
                                }
                                if (class291.field4388[var12] || class103.field1396 > 1) {
                                    if (var11.field2023 == 3) {
                                        if (var15 == 0) {
                                            if (var11.field2000) {
                                                class630.field8790.method472(var13, var14, var11.field2121, var11.field2082, var11.field1967, 0);
                                            } else {
                                                class630.field8790.method399(var13, var14, var11.field2121, var11.field2082, var11.field1967, 0);
                                            }
                                        } else if (var11.field2000) {
                                            class630.field8790.method472(var13, var14, var11.field2121, var11.field2082, var11.field1967 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                        } else {
                                            class630.field8790.method399(var13, var14, var11.field2121, var11.field2082, 255 - (var15 & 0xFF) << 24 | var11.field1967 & 0xFFFFFF, 1);
                                        }
                                    } else if (var11.field2023 == 4) {
                                        class194 var42 = var11.method1002(class630.field8790, 121);
                                        if (var42 != null) {
                                            int var43 = var11.field1967;
                                            String var44 = var11.field1972;
                                            if (var11.field1969 != -1) {
                                                class257 var45 = class648.field9184.method3064(var11.field1969, -67);
                                                var44 = var45.field3655;
                                                if (var44 == null) {
                                                    var44 = "null";
                                                }
                                                if ((var45.field3628 == 1 || var11.field2065 != 1) && var11.field2065 != -1) {
                                                    var44 = "<col=ff9040>" + var44 + "</col> x" + class474.method2689(var11.field2065, (byte) 45);
                                                }
                                            }
                                            if (class88.field1195 == var11) {
                                                var44 = class9.field165.method42(class666.field9377, 19572);
                                                var43 = var11.field1967;
                                            }
                                            if (class287.field4000) {
                                                class630.field8790.method433(var13, var14, var11.field2121 + var13, var11.field2082 + var14);
                                            }
                                            var42.method1299(var11.field2082, 255 - (var15 & 0xFF) << 24 | var43, class656.field9239, var11.field2060 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field2121, var44, var13, false, null, 0, 0, null, var11.field2040, var14, var11.field2048, var11.field2108, var11.field1983);
                                            if (class287.field4000) {
                                                class630.field8790.method442(arg1, arg8, arg5, arg7);
                                            }
                                        } else if (class44.field663) {
                                            class432.method2481(var11, -91);
                                        }
                                    } else if (var11.field2023 == 5) {
                                        if (var11.field2052 >= 0) {
                                            var11.method986(-57, class305.field4492, class169.field2547).method2517(var14, var11.field2082, var11.field1990 << 3, 0, var13, var11.field2121, 0, var11.field1975 << 3, class630.field8790, (byte) 120);
                                        } else {
                                            class461 var46;
                                            if (var11.field1969 == -1) {
                                                var46 = var11.method991(-77, class630.field8790);
                                            } else {
                                                class17 var47 = var11.field2053 ? class253.field3576.field3989 : null;
                                                var46 = class648.field9184.method3050(var47, var11.field2014, 64, class630.field8790, var11.field2118, var11.field1969, var11.field2038 | 0xFF000000, var11.field2065);
                                            }
                                            if (var46 != null) {
                                                int var48 = var46.method33();
                                                int var49 = var46.method29();
                                                int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field1967 == 0 ? 16777215 : var11.field1967 & 0xFFFFFF);
                                                if (var11.field2079) {
                                                    class630.field8790.method433(var13, var14, var11.field2121 + var13, var11.field2082 + var14);
                                                    if (var11.field2041 != 0) {
                                                        int var51 = (var11.field2121 + var48 - 1) / var48;
                                                        int var52 = (var11.field2082 + var49 - 1) / var49;
                                                        for (int var53 = 0; var53 < var51; var53++) {
                                                            for (int var54 = 0; var54 < var52; var54++) {
                                                                if (var11.field1967 == 0) {
                                                                    var46.method2655((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field2041);
                                                                } else {
                                                                    var46.method2656((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field2041, 0, var50, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (var11.field1967 == 0 && var15 == 0) {
                                                        var46.method2661(var13, var14, var11.field2121, var11.field2082);
                                                    } else {
                                                        var46.method32(var13, var14, var11.field2121, var11.field2082, 0, var50, 1);
                                                    }
                                                    class630.field8790.method442(arg1, arg8, arg5, arg7);
                                                } else if (var11.field1967 == 0 && var15 == 0) {
                                                    if (var11.field2041 != 0) {
                                                        var46.method2655((float) var11.field2121 / 2.0F + (float) var13, (float) var11.field2082 / 2.0F + (float) var14, var11.field2121 * 4096 / var48, var11.field2041);
                                                    } else if (var11.field2121 == var48 && var11.field2082 == var49) {
                                                        var46.method2660(var13, var14);
                                                    } else {
                                                        var46.method2659(var13, var14, var11.field2121, var11.field2082);
                                                    }
                                                } else if (var11.field2041 != 0) {
                                                    var46.method2656((float) var11.field2121 / 2.0F + (float) var13, (float) var11.field2082 / 2.0F + (float) var14, var11.field2121 * 4096 / var48, var11.field2041, 0, var50, 1);
                                                } else if (var11.field2121 == var48 && var11.field2082 == var49) {
                                                    var46.method30(var13, var14, 0, var50, 1);
                                                } else {
                                                    var46.method35(var13, var14, var11.field2121, var11.field2082, 0, var50, 1);
                                                }
                                            } else if (class44.field663) {
                                                class432.method2481(var11, 88);
                                            }
                                        }
                                    } else if (var11.field2023 == 6) {
                                        class359.method2118(-1);
                                        class352 var55 = null;
                                        int var56 = 0;
                                        if (var11.field1969 != -1) {
                                            class257 var64 = class648.field9184.method3064(var11.field1969, -108);
                                            if (var64 != null) {
                                                class257 var65 = var64.method1585(-111, var11.field2065);
                                                class131 var66 = var11.field1992 == -1 ? null : class301.field4465.method2763(var11.field1992, 31696);
                                                class17 var67 = var11.field2053 ? class253.field3576.field3989 : null;
                                                var55 = var65.method1588(var11.field2110, 1, var11.field2001, class630.field8790, var67, 2048, var66, -125, var11.field1955);
                                                if (var55 == null) {
                                                    class432.method2481(var11, 125);
                                                } else {
                                                    var56 = -var55.method220() >> 1;
                                                }
                                            }
                                        } else if (var11.field2103 == 5) {
                                            int var57 = var11.field2021;
                                            if (var57 >= 0 && var57 < 2048) {
                                                class286 var58 = class495.field6821[var57];
                                                class131 var59 = var11.field1992 == -1 ? null : class301.field4465.method2763(var11.field1992, 31696);
                                                if (var58 != null && (class27.field343 == var57 || class387.method2231(127, var58.field3975) == var11.field2104)) {
                                                    var55 = var58.field3989.method84(class630.field8790, class301.field4465, var11.field1955, 0, var11.field2110, null, class472.field6593, var59, var11.field2001, class648.field9184, 2048, -1, null, class648.field9185, 0, (byte) 4, class310.field4615, true, class195.field2888);
                                                }
                                            }
                                        } else if (var11.field2103 == 8 || var11.field2103 == 9) {
                                            class421 var61 = class172.method1175(true, false, var11.field2021);
                                            class131 var62 = var11.field1992 == -1 ? null : class301.field4465.method2763(var11.field1992, 31696);
                                            if (var61 != null) {
                                                class17 var63 = var11.field2053 ? class253.field3576.field3989 : null;
                                                var55 = var61.method2397(var11.field1955, class630.field8790, var63, var11.field2110, var11.field2104, var11.field2001, (byte) -102, var11.field2103 == 9, 2048, var62);
                                            }
                                        } else if (var11.field1992 == -1) {
                                            var55 = var11.method1000(2048, class301.field4465, -1, 0, -1, class472.field6593, class648.field9185, class310.field4615, class648.field9184, class195.field2888, null, (byte) -112, class630.field8790, class253.field3576.field3989);
                                            if (var55 == null && class44.field663) {
                                                class432.method2481(var11, -66);
                                            }
                                        } else {
                                            class131 var60 = class301.field4465.method2763(var11.field1992, 31696);
                                            var55 = var11.method1000(2048, class301.field4465, var11.field1955, var11.field2110, var11.field2001, class472.field6593, class648.field9185, class310.field4615, class648.field9184, class195.field2888, var60, (byte) -103, class630.field8790, class253.field3576.field3989);
                                            if (var55 == null && class44.field663) {
                                                class432.method2481(var11, 122);
                                            }
                                        }
                                        if (var55 != null) {
                                            int var68;
                                            if (var11.field2012 > 0) {
                                                var68 = (var11.field2121 << 9) / var11.field2012;
                                            } else {
                                                var68 = 512;
                                            }
                                            int var69;
                                            if (var11.field1993 > 0) {
                                                var69 = (var11.field2082 << 9) / var11.field1993;
                                            } else {
                                                var69 = 512;
                                            }
                                            int var70 = var11.field2121 / 2 + (var11.field1997 * var68 >> 9) + var13;
                                            int var71 = (var11.field2033 * var69 >> 9) + var11.field2082 / 2 + var14;
                                            class37.field500.method1296();
                                            class630.field8790.method446(class37.field500);
                                            class630.field8790.method404(var70, var71, var68, var69);
                                            class630.field8790.method462((float) (var11.field1974 << 2), var11.field2107 ? (float) (var11.field2050 << 2) : (float) (var11.field2050 << 2) * 1.5F);
                                            if (arg4 == -1412584499 || class318.field4711) {
                                                class630.field8790.method449();
                                                class630.field8790.method344();
                                                class630.field8790.method442(arg1, arg8, arg5, arg7);
                                                class318.field4711 = false;
                                            }
                                            if (var11.field1959) {
                                                class630.field8790.method387(false);
                                            }
                                            int var72 = (var11.field2105 << 2) * class675.field9542[var11.field2113 << 3] >> 14;
                                            int var73 = (var11.field2105 << 2) * class675.field9541[var11.field2113 << 3] >> 14;
                                            class75.field1040.method1292(-var11.field2067 << 3);
                                            class75.field1040.method1297(var11.field2025 << 3);
                                            class75.field1040.method1285(var11.field2007 << 2, (var11.field1979 << 2) + var56 + var72, (var11.field1979 << 2) + var73);
                                            class75.field1040.method1286(var11.field2113 << 3);
                                            var11.method994((byte) 0, class239.field3440, class75.field1040, var55, class630.field8790);
                                            if (class287.field4000) {
                                                class630.field8790.method433(var13, var14, var13 + var11.field2121, var11.field2082 + var14);
                                            }
                                            if (var11.field2107) {
                                                var55.method199(class75.field1040, null, var11.field2105 << 2, 1);
                                            } else if (var11.field2035 == null) {
                                                var55.method205(class75.field1040, null, 1);
                                            } else {
                                                class630.field8790.method434(var55, var11.field2035.method2276(), class75.field1040, null, 1);
                                            }
                                            if (class287.field4000) {
                                                class630.field8790.method442(arg1, arg8, arg5, arg7);
                                            }
                                            if (var11.field1959) {
                                                class630.field8790.method387(true);
                                            }
                                            class630.field8790.method462(0.0F, 0.0F);
                                        }
                                    } else if (var11.field2023 == 9) {
                                        int var74;
                                        int var75;
                                        int var76;
                                        int var77;
                                        if (var11.field2006) {
                                            var74 = var11.field2121 + var13;
                                            var75 = var14 + var11.field2082;
                                            var77 = var14;
                                            var76 = var13;
                                        } else {
                                            var74 = var11.field2121 + var13;
                                            var75 = var14;
                                            var76 = var13;
                                            var77 = var14 + var11.field2082;
                                        }
                                        if (var11.field2009 == 1) {
                                            class630.field8790.method415(var76, var75, var74, var77, var11.field1967, 0);
                                        } else {
                                            class630.field8790.method388(var76, var75, var74, var77, var11.field1967, var11.field2009, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILti;Lti;)V", line = 764)
    public static final void method2883(int arg0, int arg1, int arg2, class404 arg3, class404 arg4) {
        class486 var5 = class80.method635(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6729 = arg3;
            var5.field6728 = arg4;
        }
    }
}
