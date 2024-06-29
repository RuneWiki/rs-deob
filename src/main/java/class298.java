import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class298 {

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[I")
    public static int[] field5046 = new int[4096];

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lbe;")
    private static class283 field5041 = class153.method941(-7, "Examine");

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
    public static int[] field5048 = new int[99];

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lbe;")
    public static class283 field5042 = field5041;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field5051 = 0;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lbe;")
    public static class283 field5043 = class153.method941(127, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
    public static int[] field5040 = new int[1000];

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lek;")
    public static class172 field5050;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lkg;")
    public static class69 field5052;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Z")
    public static boolean field5049;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[Lkg;IIIIIIII)V", line = 13)
    public static final void method2018(int arg0, class69[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5045++;
        class311.method2114(arg8, arg0, arg2, arg5);
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class69 var11 = arg1[var10];
            if (var11 != null && (var11.field1059 == arg3 || arg3 == -1412584499 && class20.field274 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class288.field4895[class217.field3686] = var11.field1135 + arg6;
                    class62.field861[class217.field3686] = var11.field1128 + arg7;
                    class3.field32[class217.field3686] = var11.field1069;
                    class70.field1209[class217.field3686] = var11.field1085;
                    var12 = class217.field3686++;
                } else {
                    var12 = arg4;
                }
                var11.field1053 = var12;
                var11.field1124 = class75.field1309;
                if (!var11.field1121 || !client.method1590(var11)) {
                    if (var11.field975 > 0) {
                        class278.method1858(var11, (byte) -119);
                    }
                    int var13 = var11.field1133;
                    int var14 = var11.field1128 + arg7;
                    int var15 = var11.field1135 + arg6;
                    if (class297.field5037 && (client.method1601(var11) != 0 || var11.field1143 == 0) && var13 > 127) {
                        var13 = 127;
                    }
                    if (class20.field274 == var11) {
                        if (arg3 != -1412584499 && !var11.field1027) {
                            class68.field971 = arg7;
                            class115.field1921 = arg6;
                            class190.field3251 = arg1;
                            continue;
                        }
                        if (!var11.field1027) {
                            var13 = 128;
                        }
                        if (class227.field3816 && class137.field2277) {
                            int var16 = class109.field1849;
                            int var17 = var16 - class256.field4324;
                            if (var17 < class110.field1866) {
                                var17 = class110.field1866;
                            }
                            int var18 = class163.field2700;
                            if (var17 + var11.field1069 > class110.field1866 - -class110.field1864.field1069) {
                                var17 = class110.field1866 + class110.field1864.field1069 - var11.field1069;
                            }
                            var15 = var17;
                            int var19 = var18 - class262.field4470;
                            if (var19 < class301.field5095) {
                                var19 = class301.field5095;
                            }
                            if ((var11.field1085 + var19) > (class301.field5095 + class110.field1864.field1085)) {
                                var19 = class301.field5095 + class110.field1864.field1085 - var11.field1085;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field1143 == 2) {
                        var20 = arg0;
                        var23 = arg8;
                        var25 = arg5;
                        var24 = arg2;
                    } else {
                        var20 = var14 <= arg0 ? arg0 : var14;
                        int var21 = var11.field1085 + var14;
                        int var22 = var11.field1069 + var15;
                        if (var11.field1143 == 9) {
                            var21++;
                            var22++;
                        }
                        var23 = arg8 < var15 ? var15 : arg8;
                        var24 = arg2 > var22 ? var22 : arg2;
                        var25 = var21 < arg5 ? var21 : arg5;
                    }
                    if (!var11.field1121 || var24 > var23 && var25 > var20) {
                        if (var11.field975 != 0) {
                            if (var11.field975 == 1337 || var11.field975 == 1403) {
                                class202.field3447 = var15;
                                class26.field397 = var14;
                                class282.field4777 = var11;
                                class54.method345(var14, var11.field1069, (byte) -89, var11.field1085, var15, var11.field975 == 1403);
                                class311.method2114(arg8, arg0, arg2, arg5);
                                continue;
                            }
                            if (var11.field975 == 1338) {
                                if (var11.method442((byte) -128)) {
                                    class151.method933(2066537200, var14, var12, var11, var15);
                                    class311.method2114(arg8, arg0, arg2, arg5);
                                }
                                continue;
                            }
                            if (var11.field975 == 1339) {
                                if (var11.method442((byte) -121)) {
                                    class180.method1188(-4, var14, var11, var12, var15);
                                    class311.method2114(arg8, arg0, arg2, arg5);
                                }
                                continue;
                            }
                            if (var11.field975 == 1400) {
                                class128.method800(var11.field1069, var14, (byte) -120, var11.field1085, var15);
                                class201.field3434[var12] = true;
                                class69.field1147[var12] = true;
                                class311.method2114(arg8, arg0, arg2, arg5);
                                continue;
                            }
                            if (var11.field975 == 1401) {
                                class81.method528(var11.field1069, var11.field1085, var14, true, var15);
                                class201.field3434[var12] = true;
                                class69.field1147[var12] = true;
                                class311.method2114(arg8, arg0, arg2, arg5);
                                continue;
                            }
                            if (var11.field975 == 1402) {
                                continue;
                            }
                            if (var11.field975 == 1404) {
                                class49.method284(class107.field1831, var11.field1085, var11.field1069, var14, var11, class240.field4056, (byte) 80, var15);
                                class201.field3434[var12] = true;
                                class69.field1147[var12] = true;
                                continue;
                            }
                            if (var11.field975 == 1405) {
                                if (!class65.field906) {
                                    continue;
                                }
                                int var26 = var15 + var11.field1069;
                                int var27 = var14 + 15;
                                class269.field4539.method1657(class299.method2022(new class283[] { class190.field3247, class296.method2012(class109.field1848, (byte) -9) }, (byte) 108), var26, var27, 16776960, -1);
                                int var28 = 16776960;
                                Runtime var29 = Runtime.getRuntime();
                                int var122 = var27 + 15;
                                int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                if (var30 > 65536) {
                                    var28 = 16711680;
                                }
                                class269.field4539.method1657(class299.method2022(new class283[] { class184.field3172, class296.method2012(var30, (byte) -8), class18.field228 }, (byte) 13), var26, var122, var28, -1);
                                var27 = var122 + 15;
                                int var31 = (class101.field1722 + class101.field1720 + class101.field1724) / 1024;
                                int var32 = 16776960;
                                if (var31 > 65536) {
                                    var32 = 16711680;
                                }
                                class269.field4539.method1657(class299.method2022(new class283[] { class170.field2863, class296.method2012(var31, (byte) 120), class18.field228 }, (byte) 103), var26, var27, var32, -1);
                                var27 += 15;
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 27; var37++) {
                                    var34 += class294.field4971[var37].method355((byte) 75);
                                    var35 += class294.field4971[var37].method350(true);
                                    var36 += class294.field4971[var37].method352(102);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                class283 var40 = class299.method2022(new class283[] { class20.field275, class259.method1753(0, 24689, 2, (long) var39, true), class63.field871, class296.method2012(var38, (byte) -61), class6.field58 }, (byte) 38);
                                class107.field1831.method1657(var40, var26, var27, var33, -1);
                                var27 += 12;
                                class201.field3434[var12] = true;
                                class69.field1147[var12] = true;
                                continue;
                            }
                        }
                        if (!class306.field5253) {
                            if (var11.field1143 == 0 && var11.field1132 && class194.field3320 >= var23 && var20 <= class262.field4447 && class194.field3320 < var24 && var25 > class262.field4447 && !class297.field5037) {
                                class42.field589 = 1;
                                class110.field1868[0] = 1003;
                                class103.field1752[0] = class112.field1887;
                                class216.field3656[0] = class213.field3616;
                            }
                            if (class194.field3320 >= var23 && class262.field4447 >= var20 && class194.field3320 < var24 && var25 > class262.field4447) {
                                class42.method259(arg9 + 2, -var14 + class262.field4447, var11, class194.field3320 - var15);
                            }
                        }
                        if (var11.field1143 == 0) {
                            if (!var11.field1121 && client.method1590(var11) && class117.field1978 != var11) {
                                continue;
                            }
                            if (!var11.field1121) {
                                if (var11.field1098 > (var11.field987 - var11.field1085)) {
                                    var11.field1098 = var11.field987 - var11.field1085;
                                }
                                if (var11.field1098 < 0) {
                                    var11.field1098 = 0;
                                }
                            }
                            method2018(var20, arg1, var24, var11.field1079, var12, var25, var15 - var11.field1011, -var11.field1098 + var14, var23, -1);
                            if (var11.field1043 != null) {
                                method2018(var20, var11.field1043, var24, var11.field1079, var12, var25, var15 - var11.field1011, -var11.field1098 + var14, var23, -1);
                            }
                            class159 var41 = (class159) class58.field805.method1612((long) var11.field1079, 108);
                            if (var41 != null) {
                                if (var41.field2602 == 0 && !class306.field5253 && var23 <= class194.field3320 && var20 <= class262.field4447 && class194.field3320 < var24 && class262.field4447 < var25 && !class297.field5037) {
                                    class42.field589 = 1;
                                    class110.field1868[0] = 1003;
                                    class103.field1752[0] = class112.field1887;
                                    class216.field3656[0] = class213.field3616;
                                }
                                class217.method1430(var20, true, var24, var25, var23, var14, var15, var41.field2600, var12);
                            }
                            class311.method2114(arg8, arg0, arg2, arg5);
                        }
                        if (class219.field3699[var12] || class194.field3313 > 1) {
                            if (var11.field1143 == 0 && !var11.field1121 && var11.field1085 < var11.field987) {
                                class272.method1827(var11.field987, var11.field1085, 12617, var11.field1098, var14, var15 + var11.field1069);
                            }
                            if (var11.field1143 != 1) {
                                if (var11.field1143 == 2) {
                                    int var105 = 0;
                                    for (int var106 = 0; var106 < var11.field996; var106++) {
                                        for (int var107 = 0; var107 < var11.field1087; var107++) {
                                            int var108 = (var11.field1000 + 32) * var107 + var15;
                                            int var109 = (var11.field1037 + 32) * var106 + var14;
                                            if (var105 < 20) {
                                                var109 += var11.field1136[var105];
                                                var108 += var11.field1047[var105];
                                            }
                                            if (var11.field1073[var105] > 0) {
                                                boolean var110 = false;
                                                boolean var111 = false;
                                                int var112 = var11.field1073[var105] - 1;
                                                if ((var108 + 32) > arg8 && arg2 > var108 && arg0 < var109 + 32 && var109 < arg5 || class195.field3332 == var11 && class134.field2242 == var105) {
                                                    class107 var113;
                                                    if (class222.field3727 == 1 && class70.field1191 == var105 && class99.field1685 == var11.field1079) {
                                                        var113 = class142.method894(2, var11.field999, var11.field973[var105], 0, var112, (byte) -10);
                                                    } else {
                                                        var113 = class142.method894(1, var11.field999, var11.field973[var105], 3153952, var112, (byte) -88);
                                                    }
                                                    if (class139.field2311) {
                                                        class201.field3434[var12] = true;
                                                    }
                                                    if (var113 == null) {
                                                        class272.method1834(var11, 0);
                                                    } else if (class195.field3332 == var11 && class134.field2242 == var105) {
                                                        int var114 = class109.field1849 - class291.field4932;
                                                        if (var114 < 5 && var114 > -5) {
                                                            var114 = 0;
                                                        }
                                                        int var115 = class163.field2700 - class114.field1918;
                                                        if (var115 < 5 && var115 > -5) {
                                                            var115 = 0;
                                                        }
                                                        if (class72.field1276 < 5) {
                                                            var114 = 0;
                                                            var115 = 0;
                                                        }
                                                        var113.method720(var108 + var114, var109 - -var115, 128);
                                                        if (arg3 != -1) {
                                                            class69 var116 = arg1[arg3 & 0xFFFF];
                                                            int var117 = class311.field5302;
                                                            int var118 = class311.field5299;
                                                            if ((var109 + var115) < var117 && var116.field1098 > 0) {
                                                                int var119 = (var117 - var109 - var115) * class44.field606 / 3;
                                                                if ((class44.field606 * 10) < var119) {
                                                                    var119 = class44.field606 * 10;
                                                                }
                                                                if (var116.field1098 < var119) {
                                                                    var119 = var116.field1098;
                                                                }
                                                                var116.field1098 -= var119;
                                                                class114.field1918 += var119;
                                                                class272.method1834(var116, 0);
                                                            }
                                                            if (var109 + var115 + 32 > var118 && var116.field987 - var116.field1085 > var116.field1098) {
                                                                int var120 = (var109 + var115 + 32 - var118) * class44.field606 / 3;
                                                                if (var120 > (class44.field606 * 10)) {
                                                                    var120 = class44.field606 * 10;
                                                                }
                                                                if (var116.field987 - var116.field1098 - var116.field1085 < var120) {
                                                                    var120 = var116.field987 - var116.field1098 - var116.field1085;
                                                                }
                                                                class114.field1918 -= var120;
                                                                var116.field1098 += var120;
                                                                class272.method1834(var116, arg9 + 1);
                                                            }
                                                        }
                                                    } else if (class2.field19 == var11 && class225.field3777 == var105) {
                                                        var113.method720(var108, var109, 128);
                                                    } else {
                                                        var113.method711(var108, var109);
                                                    }
                                                }
                                            } else if (var11.field1120 != null && var105 < 20) {
                                                class107 var121 = var11.method452(arg9 + 1, var105);
                                                if (var121 != null) {
                                                    var121.method711(var108, var109);
                                                } else if (class115.field1931) {
                                                    class272.method1834(var11, 0);
                                                }
                                            }
                                            var105++;
                                        }
                                    }
                                } else if (var11.field1143 == 3) {
                                    int var104;
                                    if (class307.method2090(var11, (byte) 32)) {
                                        var104 = var11.field1022;
                                        if (class117.field1978 == var11 && var11.field1094 != 0) {
                                            var104 = var11.field1094;
                                        }
                                    } else {
                                        var104 = var11.field994;
                                        if (class117.field1978 == var11 && var11.field1019 != 0) {
                                            var104 = var11.field1019;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field1112) {
                                            class311.method2116(var15, var14, var11.field1069, var11.field1085, var104);
                                        } else {
                                            class311.method2113(var15, var14, var11.field1069, var11.field1085, var104);
                                        }
                                    } else if (var11.field1112) {
                                        class311.method2112(var15, var14, var11.field1069, var11.field1085, var104, 256 - (var13 & 0xFF));
                                    } else {
                                        class311.method2118(var15, var14, var11.field1069, var11.field1085, var104, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field1143 == 4) {
                                    class244 var100 = var11.method444(class65.field895, true);
                                    if (var100 != null) {
                                        class283 var101 = var11.field1023;
                                        int var102;
                                        if (class307.method2090(var11, (byte) 32)) {
                                            var102 = var11.field1022;
                                            if (class117.field1978 == var11 && var11.field1094 != 0) {
                                                var102 = var11.field1094;
                                            }
                                            if (var11.field986.method1925((byte) -44) > 0) {
                                                var101 = var11.field986;
                                            }
                                        } else {
                                            var102 = var11.field994;
                                            if (class117.field1978 == var11 && var11.field1019 != 0) {
                                                var102 = var11.field1019;
                                            }
                                        }
                                        if (var11.field1121 && var11.field1013 != -1) {
                                            class304 var103 = class103.method676(var11.field1013, -1);
                                            var101 = var103.field5155;
                                            if (var101 == null) {
                                                var101 = class35.field524;
                                            }
                                            if ((var103.field5162 == 1 || var11.field1061 != 1) && var11.field1061 != -1) {
                                                var101 = class299.method2022(new class283[] { class245.field4163, var101, class117.field1981, class288.method1969(var11.field1061, (byte) -127) }, (byte) 7);
                                            }
                                        }
                                        if (class69.field1034 == var11) {
                                            var102 = var11.field994;
                                            var101 = class96.field1610;
                                        }
                                        if (!var11.field1121) {
                                            var101 = class297.method2017(arg9 ^ 0xFFFFFF91, var101, var11);
                                        }
                                        var100.method1652(var101, var15, var14, var11.field1069, var11.field1085, var102, var11.field1130 ? 0 : -1, var11.field1134, var11.field984, var11.field1074);
                                    } else if (class115.field1931) {
                                        class272.method1834(var11, 0);
                                    }
                                } else if (var11.field1143 == 5) {
                                    if (var11.field1121) {
                                        class107 var86;
                                        if (var11.field1013 == -1) {
                                            var86 = var11.method447(false, (byte) 28);
                                        } else {
                                            var86 = class142.method894(var11.field1030, var11.field999, var11.field1061, var11.field1107, var11.field1013, (byte) -56);
                                        }
                                        if (var86 != null) {
                                            int var87 = var86.field1820;
                                            int var88 = var86.field1829;
                                            if (var11.field1039) {
                                                int var89 = (var87 + var11.field1069 - 1) / var87;
                                                int var90 = (var88 + var11.field1085 - 1) / var88;
                                                class311.method2103(var15, var14, var15 + var11.field1069, var11.field1085 + var14);
                                                boolean var91 = class295.method1996(var86.field1828, -4097);
                                                boolean var92 = class295.method1996(var86.field1821, -4097);
                                                class266 var93 = (class266) var86;
                                                if (var91 && var92) {
                                                    if (var13 == 0) {
                                                        var93.method1794(var15, var14, var89, var90);
                                                    } else {
                                                        var93.method1795(var15, var14, 256 - (var13 & 0xFF), var89, var90);
                                                    }
                                                } else if (var91) {
                                                    for (int var97 = 0; var97 < var90; var97++) {
                                                        if (var13 == 0) {
                                                            var93.method1794(var15, var14 + (var88 * var97), var89, 1);
                                                        } else {
                                                            var93.method1795(var15, var88 * var97 + var14, -(var13 & 0xFF) + 256, var89, 1);
                                                        }
                                                    }
                                                } else if (var92) {
                                                    for (int var96 = 0; var96 < var89; var96++) {
                                                        if (var13 == 0) {
                                                            var93.method1794(var15 + (var87 * var96), var14, 1, var90);
                                                        } else {
                                                            var93.method1795(var87 * var96 + var15, var14, 256 - (var13 & 0xFF), 1, var90);
                                                        }
                                                    }
                                                } else {
                                                    for (int var94 = 0; var94 < var89; var94++) {
                                                        for (int var95 = 0; var95 < var90; var95++) {
                                                            if (var13 == 0) {
                                                                var86.method711(var87 * var94 + var15, var88 * var95 + var14);
                                                            } else {
                                                                var86.method720(var87 * var94 + var15, var88 * var95 + var14, 256 - (var13 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                }
                                                class311.method2114(arg8, arg0, arg2, arg5);
                                            } else {
                                                int var98 = var11.field1069 * 4096 / var87;
                                                if (var11.field1066 != 0) {
                                                    var86.method716(var11.field1085 / 2 + var14, var98, var11.field1069 / 2 + var15, (byte) -82, var11.field1066);
                                                } else if (var13 != 0) {
                                                    var86.method718(var15, var14, var11.field1069, var11.field1085, 256 - (var13 & 0xFF));
                                                } else if (var11.field1069 == var87 && var11.field1085 == var88) {
                                                    var86.method711(var15, var14);
                                                } else {
                                                    var86.method719(var15, var14, var11.field1069, var11.field1085);
                                                }
                                            }
                                        } else if (class115.field1931) {
                                            class272.method1834(var11, 0);
                                        }
                                    } else {
                                        class107 var99 = var11.method447(class307.method2090(var11, (byte) 32), (byte) 28);
                                        if (var99 != null) {
                                            var99.method711(var15, var14);
                                        } else if (class115.field1931) {
                                            class272.method1834(var11, 0);
                                        }
                                    }
                                } else if (var11.field1143 == 6) {
                                    boolean var42 = class307.method2090(var11, (byte) 32);
                                    class289 var43 = null;
                                    int var44;
                                    if (var42) {
                                        var44 = var11.field1092;
                                    } else {
                                        var44 = var11.field1052;
                                    }
                                    int var45 = 0;
                                    if (var11.field1013 != -1) {
                                        class304 var50 = class103.method676(var11.field1013, arg9);
                                        if (var50 != null) {
                                            class304 var51 = var50.method2069((byte) -91, var11.field1061);
                                            class157 var52 = var44 == -1 ? null : class132.method821(128, var44);
                                            var43 = var51.method2061(23856, var11.field1075, 1, var52);
                                            if (var43 == null) {
                                                class272.method1834(var11, ~arg9);
                                            } else {
                                                var45 = -var43.method40() / 2;
                                            }
                                        }
                                    } else if (var11.field1072 == 5) {
                                        if (var11.field1057 == -1) {
                                            var43 = class116.field1957.method1779((class157) null, -1, (class157) null, -1, -1);
                                        } else {
                                            int var47 = var11.field1057 & 0x7FF;
                                            if (class213.field3622 == var47) {
                                                var47 = 2047;
                                            }
                                            class191 var48 = class149.field2436[var47];
                                            class157 var49 = var44 == -1 ? null : class132.method821(arg9 ^ 0xFFFFFF7F, var44);
                                            if (var48 != null && ((int) var48.field3274.method1929((byte) -24) << 11) == (var11.field1057 & 0xFFFFF800)) {
                                                var43 = var48.field3277.method1779(var49, var11.field1075, (class157) null, 0, arg9);
                                            }
                                        }
                                    } else if (var44 == -1) {
                                        var43 = var11.method451(false, class213.field3624.field3277, var42, -1, (class157) null);
                                        if (var43 == null && class115.field1931) {
                                            class272.method1834(var11, 0);
                                        }
                                    } else {
                                        class157 var46 = class132.method821(128, var44);
                                        var43 = var11.method451(false, class213.field3624.field3277, var42, var11.field1075, var46);
                                        if (var43 == null && class115.field1931) {
                                            class272.method1834(var11, arg9 + 1);
                                        }
                                    }
                                    if (var43 != null) {
                                        int var53;
                                        if (var11.field980 > 0) {
                                            var53 = (var11.field1069 << 8) / var11.field980;
                                        } else {
                                            var53 = 256;
                                        }
                                        int var54 = (var11.field1108 * var53 >> 8) + var11.field1069 / 2 + var15;
                                        int var55;
                                        if (var11.field1113 > 0) {
                                            var55 = (var11.field1085 << 8) / var11.field1113;
                                        } else {
                                            var55 = 256;
                                        }
                                        int var56 = var11.field1085 / 2 + (var14 + (var11.field1064 * var55 >> 8));
                                        if (var11.field1014) {
                                            class167.method1057(var54, var56, var11.field1007, var11.field979, var53, var55);
                                        } else {
                                            class167.method1024(var54, var56, var53, var55);
                                            class167.method1052((float) var11.field1137, (float) var11.field979 * 1.5F);
                                        }
                                        class167.method1043();
                                        class167.method1038(true);
                                        class167.method1036(false);
                                        class171.method1086(22704);
                                        if (class57.field783) {
                                            class311.method2107();
                                            class167.method1053();
                                            class311.method2114(arg8, arg0, arg2, arg5);
                                            class57.field783 = false;
                                        }
                                        if (var11.field1091) {
                                            class167.method1041();
                                        }
                                        int var57 = class139.field2309[var11.field1099] * var11.field1007 >> 16;
                                        int var58 = class139.field2316[var11.field1099] * var11.field1007 >> 16;
                                        if (var11.field1121) {
                                            var43.method1344(0, var11.field977, var11.field1006, var11.field1099, var11.field1076, var57 + var11.field1078 + var45, var11.field1078 + var58);
                                        } else {
                                            var43.method1344(0, var11.field977, 0, var11.field1099, 0, var57, var58);
                                        }
                                        if (var11.field1091) {
                                            class167.method1037();
                                        }
                                    }
                                } else {
                                    if (var11.field1143 == 7) {
                                        class244 var59 = var11.method444(class65.field895, true);
                                        if (var59 == null) {
                                            if (class115.field1931) {
                                                class272.method1834(var11, 0);
                                            }
                                            continue;
                                        }
                                        int var60 = 0;
                                        for (int var61 = 0; var61 < var11.field996; var61++) {
                                            for (int var62 = 0; var62 < var11.field1087; var62++) {
                                                if (var11.field1073[var60] > 0) {
                                                    class304 var63 = class103.method676(var11.field1073[var60] - 1, arg9 ^ 0x0);
                                                    class283 var64;
                                                    if (var63.field5162 != 1 && var11.field973[var60] == 1) {
                                                        var64 = class299.method2022(new class283[] { class245.field4163, var63.field5155, class215.field3653 }, (byte) 99);
                                                    } else {
                                                        var64 = class299.method2022(new class283[] { class245.field4163, var63.field5155, class117.field1981, class288.method1969(var11.field973[var60], (byte) -113) }, (byte) 125);
                                                    }
                                                    int var65 = (var11.field1000 + 115) * var62 + var15;
                                                    int var66 = (var11.field1037 + 12) * var61 + var14;
                                                    if (var11.field1134 == 0) {
                                                        var59.method1643(var64, var65, var66, var11.field994, var11.field1130 ? 0 : -1);
                                                    } else if (var11.field1134 == 1) {
                                                        var59.method1648(var64, var65 + 57, var66, var11.field994, var11.field1130 ? 0 : -1);
                                                    } else {
                                                        var59.method1657(var64, var65 + 115 - 1, var66, var11.field994, var11.field1130 ? 0 : -1);
                                                    }
                                                }
                                                var60++;
                                            }
                                        }
                                    }
                                    if (var11.field1143 == 8 && class282.field4774 == var11 && class155.field2553 == class154.field2526) {
                                        int var67 = 0;
                                        int var68 = 0;
                                        class244 var69 = class269.field4539;
                                        class283 var70 = var11.field1023;
                                        class283 var71 = class297.method2017(103, var70, var11);
                                        while (var71.method1925((byte) -44) > 0) {
                                            int var72 = var71.method1951(class48.field668, (byte) 22);
                                            class283 var73;
                                            if (var72 == -1) {
                                                var73 = var71;
                                                var71 = class213.field3616;
                                            } else {
                                                var73 = var71.method1936(-63, 0, var72);
                                                var71 = var71.method1914((byte) -75, var72 + 4);
                                            }
                                            int var74 = var69.method1656(var73);
                                            if (var74 > var67) {
                                                var67 = var74;
                                            }
                                            var68 += var69.field4137 + 1;
                                        }
                                        var67 += 6;
                                        int var75 = var15 - (var67 - var11.field1069) - 5;
                                        if (var75 < (var15 + 5)) {
                                            var75 = var15 + 5;
                                        }
                                        var68 += 7;
                                        int var76 = var14 + var11.field1085 + 5;
                                        if (arg2 < (var67 + var75)) {
                                            var75 = arg2 - var67;
                                        }
                                        if (arg5 < (var76 + var68)) {
                                            var76 = arg5 - var68;
                                        }
                                        class311.method2116(var75, var76, var67, var68, 16777120);
                                        class311.method2113(var75, var76, var67, var68, 0);
                                        class283 var77 = var11.field1023;
                                        int var78 = var76 - (-var69.field4137 - 2);
                                        class283 var79 = class297.method2017(94, var77, var11);
                                        while (var79.method1925((byte) -44) > 0) {
                                            int var80 = var79.method1951(class48.field668, (byte) 22);
                                            class283 var81;
                                            if (var80 == -1) {
                                                var81 = var79;
                                                var79 = class213.field3616;
                                            } else {
                                                var81 = var79.method1936(-63, 0, var80);
                                                var79 = var79.method1914((byte) -53, var80 + 4);
                                            }
                                            var69.method1643(var81, var75 + 3, var78, 0, -1);
                                            var78 += var69.field4137 + 1;
                                        }
                                    }
                                    if (var11.field1143 == 9) {
                                        int var82;
                                        int var83;
                                        int var84;
                                        int var85;
                                        if (var11.field1055) {
                                            var82 = var15;
                                            var83 = var14 + var11.field1085;
                                            var84 = var14;
                                            var85 = var11.field1069 + var15;
                                        } else {
                                            var85 = var11.field1069 + var15;
                                            var83 = var14;
                                            var84 = var11.field1085 + var14;
                                            var82 = var15;
                                        }
                                        if (var11.field1063 == 1) {
                                            class311.method2110(var82, var83, var85, var84, var11.field994);
                                        } else {
                                            class311.method2106(var82, var83, var85, var84, var11.field994, var11.field1063);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg9 != -1) {
            method2019(-63);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 1133)
    public static void method2019(int arg0) {
        field5041 = null;
        if (arg0 != 0) {
            return;
        }
        field5042 = null;
        field5043 = null;
        field5040 = null;
        field5046 = null;
        field5050 = null;
        field5052 = null;
        field5048 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIIIII)V", line = 1156)
    public static final void method2020(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class160 var6 = class86.field1459[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class141 var7 = var6.field2634;
        if (var7 != null) {
            int var8 = var7.field2352;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class211 var10 = var6.field2638;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3606;
        int var12 = var10.field3594;
        int var13 = var10.field3602;
        int var14 = var10.field3608;
        int[] var15 = class48.field663[var11];
        int[] var16 = class71.field1252[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLbe;)Z", line = 1249)
    public static final boolean method2021(boolean arg0, class283 arg1) {
        field5044++;
        try {
            int var2 = arg1.method1934(false, 44);
            if (var2 == -1) {
                return false;
            }
            class283 var3 = arg1.method1936(-63, 0, var2);
            class283 var4 = arg1.method1914((byte) -103, var2 + 1);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method1933((byte) 125));
            if (!arg0) {
                method2020((int[]) null, -117, -6, 16, 119, 6);
            }
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method1904(false);
            class229 var8 = new class229(5000);
            var8.method1530(0, var7.length, arg0, var7);
            var8.field3905 = 0;
            var8.method1512(class178.field3064, 119, class89.field1506);
            if (var8.field3879[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field3879[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var11) {
            return false;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field5048[var1] = var0 / 4;
        }
    }
}
