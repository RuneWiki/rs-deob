import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class90 {

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lcs;")
    private class318 field1168;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1171;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Ljt;")
    private class94 field1176;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1170;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lmj;")
    private class612 field1163;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[B")
    public static byte[] field1169 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Lji;")
    private class572 field1175;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Ljava/awt/Frame;")
    public static Frame field1174;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[Lrg;")
    private class601[] field1164;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBIII[Lrr;IIII)V", line = 4)
    public static final void method671(int arg0, byte arg1, int arg2, int arg3, int arg4, class337[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field1165++;
        class309.field3898.method403(arg4, arg7, arg6, arg2);
        if (arg1 != 38) {
            return;
        }
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class337 var11 = arg5[var10];
            if (var11 != null && (var11.field4190 == arg0 || arg0 == -1412584499 && class338.field4324 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class68.field824[class211.field2489].setBounds(var11.field4153 + arg9, var11.field4227 + arg8, var11.field4309, var11.field4211);
                    var12 = class211.field2489++;
                } else {
                    var12 = arg3;
                }
                var11.field4171 = var12;
                var11.field4188 = class665.field9027;
                if (!client.method1702(var11)) {
                    if (var11.field4298 != 0) {
                        class465.method2538((byte) 31, var11);
                    }
                    int var13 = var11.field4153 + arg9;
                    int var14 = var11.field4227 + arg8;
                    int var15 = var11.field4192;
                    if (class373.field4819 && (client.method1693(var11).field4604 != 0 || var11.field4212 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class338.field4324 == var11) {
                        if (arg0 != -1412584499 && (class586.field7873 == var11.field4305 || class381.field4890 == var11.field4305)) {
                            class556.field6948 = arg5;
                            class213.field2504 = arg8;
                            class361.field4632 = arg9;
                            continue;
                        }
                        if (class373.field4821 && class46.field621) {
                            int var16 = class113.field1423.method1074((byte) -92);
                            int var17 = class113.field1423.method1078((byte) 113);
                            int var18 = var16 - class250.field3230;
                            int var19 = var17 - class410.field5265;
                            if (class689.field9562 > var18) {
                                var18 = class689.field9562;
                            }
                            if (var19 < class420.field5352) {
                                var19 = class420.field5352;
                            }
                            if (var11.field4309 + var18 > class689.field9562 + class85.field1089.field4309) {
                                var18 = class85.field1089.field4309 + class689.field9562 - var11.field4309;
                            }
                            var13 = var18;
                            if (var11.field4211 + var19 > class420.field5352 - -class85.field1089.field4211) {
                                var19 = class85.field1089.field4211 + class420.field5352 - var11.field4211;
                            }
                            var14 = var19;
                        }
                        if (class381.field4890 == var11.field4305) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4212 == 2) {
                        var20 = arg7;
                        var21 = arg6;
                        var22 = arg2;
                        var23 = arg4;
                    } else {
                        int var24 = var11.field4309 + var13;
                        int var25 = var11.field4211 + var14;
                        var23 = var13 > arg4 ? var13 : arg4;
                        var20 = arg7 < var14 ? var14 : arg7;
                        if (var11.field4212 == 9) {
                            var25++;
                            var24++;
                        }
                        var22 = var25 >= arg2 ? arg2 : var25;
                        var21 = var24 >= arg6 ? arg6 : var24;
                    }
                    if (var21 > var23 && var22 > var20) {
                        if (var11.field4298 != 0) {
                            if (class710.field9928 == var11.field4298 || class583.field7835 == var11.field4298) {
                                class458.method2522(var11.field4211, class583.field7835 == var11.field4298, -6739, var14, var13, var11.field4309);
                                class58.field743[var12] = true;
                                class309.field3898.method403(arg4, arg7, arg6, arg2);
                                continue;
                            }
                            if (class323.field4030 == var11.field4298) {
                                if (var11.method1927(class309.field3898, 88) != null) {
                                    class428.method2354(arg1 - 6369);
                                    class532.method2874(class309.field3898, arg1 + 3087, var13, var11, var14);
                                    class128.field1559[var12] = true;
                                    class309.field3898.method403(arg4, arg7, arg6, arg2);
                                }
                                continue;
                            }
                            if (class211.field2493 == var11.field4298) {
                                if (var11.method1927(class309.field3898, -116) != null) {
                                    class598.method3296(var13, (byte) -18, var14, var11);
                                    class128.field1559[var12] = true;
                                    class309.field3898.method403(arg4, arg7, arg6, arg2);
                                }
                                continue;
                            }
                            if (class513.field6458 == var11.field4298) {
                                class572.method3079(class309.field3898, var11.field4211, var11.field4309, var14, -128, class594.field7964, var13);
                                class58.field743[var12] = true;
                                class309.field3898.method403(arg4, arg7, arg6, arg2);
                                continue;
                            }
                            if (class682.field9282 == var11.field4298) {
                                class195.method1147(class309.field3898, var14, false, var11.field4211, var11.field4309, var13);
                                class58.field743[var12] = true;
                                class309.field3898.method403(arg4, arg7, arg6, arg2);
                                continue;
                            }
                            if (class430.field5433 == var11.field4298) {
                                if (!class684.field9354 && !class678.field9236) {
                                    continue;
                                }
                                int var26 = var11.field4309 + var13;
                                int var27 = var14 + 15;
                                if (class684.field9354) {
                                    int var28 = -256;
                                    if (class442.field5548 < 20) {
                                        var28 = -65536;
                                    }
                                    class616.field8348.method1163(var28, arg1 + 51, var27, "Fps:" + class442.field5548, -1, var26);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                        if (class135.field1641) {
                                            class396.method2245((byte) -1);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class252.method1521(4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", true);
                                            }
                                        }
                                    }
                                    class616.field8348.method1163(var31, 126, var27, "Mem:" + var30 + "k", -1, var26);
                                    var27 += 15;
                                    class616.field8348.method1163(-256, 103, var27, "In:" + class539.field6803 + "B/s Out:" + class645.field8745 + "B/s", -1, var26);
                                    var27 += 15;
                                    int var33 = class309.field3898.method429() / 1024;
                                    class616.field8348.method1163(var33 <= 65536 ? -256 : -65536, arg1 ^ 0xFFFFFFB5, var27, "Offheap:" + var33 + "k", -1, var26);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 35; var37++) {
                                        if (class304.field3854[var37] != null) {
                                            var34 += class304.field3854[var37].method3304(23752);
                                            var35 += class304.field3854[var37].method3305(false);
                                            var36 += class304.field3854[var37].method3303(-885);
                                        }
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class202.method1182((byte) -124, 2, (long) var39, true, 0) + "% (" + var38 + "%)";
                                    class711.field9937.method1163(-256, 103, var27, var40, -1, var26);
                                    var27 += 12;
                                }
                                if (class561.field7018 > 0) {
                                    class711.field9937.method1163(-256, 126, var27, "Particles: " + class167.field1958 + " / " + class561.field7018, -1, var26);
                                }
                                var27 += 12;
                                if (class678.field9236) {
                                    class711.field9937.method1163(-256, arg1 - 116, var27, "Polys: " + class309.field3898.method380() + " Models: " + class309.field3898.method460(), -1, var26);
                                    var27 += 12;
                                    class711.field9937.method1163(-256, -99, var27, "Ls: " + class38.field569 + " La: " + class243.field3140 + " NPC: " + class389.field4997 + " Pl: " + class83.field1067, -1, var26);
                                    var27 += 12;
                                    class675.method3743(1937021704);
                                }
                                class58.field743[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field4212 == 0) {
                            if (class6.field63 == var11.field4298 && class309.field3898.method393()) {
                                class309.field3898.method379(var13, var14, var11.field4309, var11.field4211);
                            }
                            method671(var11.field4172, (byte) 38, var22, var12, var23, arg5, var21, var20, var14 - var11.field4208, -var11.field4300 + var13);
                            if (var11.field4179 != null) {
                                method671(var11.field4172, (byte) 38, var22, var12, var23, var11.field4179, var21, var20, var14 - var11.field4208, -var11.field4300 + var13);
                            }
                            class293 var41 = (class293) class216.field2530.method3828((long) var11.field4172, (byte) -91);
                            if (var41 != null) {
                                class174.method1043(var14, var21, var20, var12, var22, var23, var41.field3727, (byte) -85, var13);
                            }
                            if (class6.field63 == var11.field4298 && class309.field3898.method393()) {
                                class309.field3898.method374();
                                class413.field5288 = true;
                            }
                            class309.field3898.method403(arg4, arg7, arg6, arg2);
                        }
                        if (class33.field516[var12] || class252.field3241 > 1) {
                            if (var11.field4212 == 3) {
                                if (var15 == 0) {
                                    if (var11.field4246) {
                                        class309.field3898.method475(var13, var14, var11.field4309, var11.field4211, var11.field4184, 0);
                                    } else {
                                        class309.field3898.method435(var13, var14, var11.field4309, var11.field4211, var11.field4184, 0);
                                    }
                                } else if (var11.field4246) {
                                    class309.field3898.method475(var13, var14, var11.field4309, var11.field4211, 255 - (var15 & 0xFF) << 24 | var11.field4184 & 0xFFFFFF, 1);
                                } else {
                                    class309.field3898.method435(var13, var14, var11.field4309, var11.field4211, var11.field4184 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field4212 == 4) {
                                class201 var42 = var11.method1925(class309.field3898, 57);
                                if (var42 != null) {
                                    int var43 = var11.field4184;
                                    String var44 = var11.field4200;
                                    if (var11.field4252 != -1) {
                                        class68 var45 = class504.field6287.method1628(var11.field4252, (byte) -126);
                                        var44 = var45.field879;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field843 == 1 || var11.field4229 != 1) && var11.field4229 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class204.method1187(var11.field4229, arg1 - 35);
                                        }
                                    }
                                    if (class83.field1066 == var11) {
                                        var44 = class671.field9145.method3726((byte) 124, class71.field912);
                                        var43 = var11.field4184;
                                    }
                                    if (class491.field6128) {
                                        class309.field3898.method451(var13, var14, var11.field4309 + var13, var11.field4211 + var14);
                                    }
                                    var42.method1179(var11.field4160 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field4309, 0, class94.field1201, var44, var11.field4317, var11.field4211, var11.field4218, 0, var43 | 255 - (var15 & 0xFF) << 24, null, var13, null, var11.field4319, var14, (byte) 24, var11.field4245);
                                    if (class491.field6128) {
                                        class309.field3898.method403(arg4, arg7, arg6, arg2);
                                    }
                                } else if (class436.field5484) {
                                    class99.method721((byte) 105, var11);
                                }
                            } else if (var11.field4212 == 5) {
                                if (var11.field4267 >= 0) {
                                    var11.method1941((byte) -24, class671.field9178, class7.field77).method791(var13, var14, (byte) 86, var11.field4309, var11.field4233 << 3, var11.field4211, 0, class309.field3898, var11.field4176 << 3, 0);
                                } else {
                                    class468 var47;
                                    if (var11.field4252 == -1) {
                                        var47 = var11.method1932(class309.field3898, true);
                                    } else {
                                        class621 var46 = var11.field4297 ? class67.field815.field4684 : null;
                                        var47 = class504.field6287.method1632(var11.field4259 | 0xFF000000, (byte) -46, var11.field4252, var11.field4219, var11.field4229, var46, var11.field4150, class309.field3898);
                                    }
                                    if (var47 != null) {
                                        int var48 = var47.method1552();
                                        int var49 = var47.method1549();
                                        int var50 = (var11.field4184 == 0 ? 16777215 : var11.field4184 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field4217) {
                                            class309.field3898.method451(var13, var14, var11.field4309 + var13, var14 - -var11.field4211);
                                            if (var11.field4248 != 0) {
                                                int var51 = (var48 + var11.field4309 - 1) / var48;
                                                int var52 = (var11.field4211 + var49 - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field4184 == 0) {
                                                            var47.method2555((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field4248);
                                                        } else {
                                                            var47.method2554((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field4248, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field4184 == 0 && var15 == 0) {
                                                var47.method2552(var13, var14, var11.field4309, var11.field4211);
                                            } else {
                                                var47.method1551(var13, var14, var11.field4309, var11.field4211, 0, var50, 1);
                                            }
                                            class309.field3898.method403(arg4, arg7, arg6, arg2);
                                        } else if (var11.field4184 == 0 && var15 == 0) {
                                            if (var11.field4248 != 0) {
                                                var47.method2555((float) var11.field4309 / 2.0F + (float) var13, (float) var11.field4211 / 2.0F + (float) var14, var11.field4309 * 4096 / var48, var11.field4248);
                                            } else if (var11.field4309 == var48 && var11.field4211 == var49) {
                                                var47.method2556(var13, var14);
                                            } else {
                                                var47.method2549(var13, var14, var11.field4309, var11.field4211);
                                            }
                                        } else if (var11.field4248 != 0) {
                                            var47.method2554((float) var11.field4309 / 2.0F + (float) var13, (float) var11.field4211 / 2.0F + (float) var14, var11.field4309 * 4096 / var48, var11.field4248, 0, var50, 1);
                                        } else if (var11.field4309 == var48 && var11.field4211 == var49) {
                                            var47.method1543(var13, var14, 0, var50, 1);
                                        } else {
                                            var47.method1553(var13, var14, var11.field4309, var11.field4211, 0, var50, 1);
                                        }
                                    } else if (class436.field5484) {
                                        class99.method721((byte) 119, var11);
                                    }
                                }
                            } else if (var11.field4212 == 6) {
                                class513.method2794(-240);
                                class359 var55 = null;
                                int var56 = 0;
                                if (var11.field4252 != -1) {
                                    class68 var57 = class504.field6287.method1628(var11.field4252, (byte) -94);
                                    if (var57 != null) {
                                        class68 var58 = var57.method535((byte) 82, var11.field4229);
                                        class207 var59 = var11.field4256 == -1 ? null : class11.field110.method1141(var11.field4256, (byte) -61);
                                        class621 var60 = var11.field4297 ? class67.field815.field4684 : null;
                                        var55 = var58.method539(1, var59, (byte) 120, var11.field4264, var11.field4315, var60, var11.field4159, 2048, class309.field3898);
                                        if (var55 == null) {
                                            class99.method721((byte) 110, var11);
                                        } else {
                                            var56 = -var55.method2084() >> 1;
                                        }
                                    }
                                } else if (var11.field4158 == 5) {
                                    int var61 = var11.field4266;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class365 var62 = class132.field1601[var61];
                                        class207 var63 = var11.field4256 == -1 ? null : class11.field110.method1141(var11.field4256, (byte) -41);
                                        if (var62 != null && (class350.field4523 == var61 || class346.method1996(var62.field4673, (byte) 80) == var11.field4313)) {
                                            var55 = var62.field4684.method3472((byte) 118, 2048, class504.field6287, -1, class124.field1510, var11.field4315, var11.field4264, var63, class11.field110, class46.field620, 0, class327.field4084, class510.field6389, null, true, 0, null, var11.field4159, class309.field3898);
                                        }
                                    }
                                } else if (var11.field4158 == 8 || var11.field4158 == 9) {
                                    class36 var65 = class354.method2029(var11.field4266, Integer.MIN_VALUE, false);
                                    class207 var66 = var11.field4256 == -1 ? null : class11.field110.method1141(var11.field4256, (byte) 126);
                                    if (var65 != null) {
                                        class621 var67 = var11.field4297 ? class67.field815.field4684 : null;
                                        var55 = var65.method239(var11.field4264, var67, class309.field3898, 2048, arg1 ^ 0xFFFF9184, var11.field4313, var11.field4315, var11.field4159, var66, var11.field4158 == 9);
                                    }
                                } else if (var11.field4256 == -1) {
                                    var55 = var11.method1938(class504.field6287, class124.field1510, class327.field4084, class11.field110, 0, -1, null, class510.field6389, -1, class46.field620, class309.field3898, 2048, class67.field815.field4684, -1);
                                    if (var55 == null && class436.field5484) {
                                        class99.method721((byte) 112, var11);
                                    }
                                } else {
                                    class207 var64 = class11.field110.method1141(var11.field4256, (byte) 126);
                                    var55 = var11.method1938(class504.field6287, class124.field1510, class327.field4084, class11.field110, var11.field4264, var11.field4159, var64, class510.field6389, var11.field4315, class46.field620, class309.field3898, 2048, class67.field815.field4684, -1);
                                    if (var55 == null && class436.field5484) {
                                        class99.method721((byte) -86, var11);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field4214 > 0) {
                                        var68 = (var11.field4309 << 9) / var11.field4214;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69;
                                    if (var11.field4277 <= 0) {
                                        var69 = 512;
                                    } else {
                                        var69 = (var11.field4211 << 9) / var11.field4277;
                                    }
                                    int var70 = (var11.field4269 * var68 >> 9) + var11.field4309 / 2 + var13;
                                    int var71 = var11.field4211 / 2 + (var11.field4253 * var69 >> 9) + var14;
                                    class142.field1735.method584();
                                    class309.field3898.method490(class142.field1735);
                                    class309.field3898.method450(var70, var71, var68, var69);
                                    class309.field3898.method406((float) (var11.field4223 << 2), var11.field4177 ? (float) (var11.field4174 << 2) : (float) (var11.field4174 << 2) * 1.5F);
                                    if (arg0 == -1412584499 || class413.field5288) {
                                        class309.field3898.method410();
                                        class309.field3898.method322();
                                        class309.field3898.method403(arg4, arg7, arg6, arg2);
                                        class413.field5288 = false;
                                    }
                                    if (var11.field4265) {
                                        class309.field3898.method455(false);
                                    }
                                    int var72 = (var11.field4194 << 2) * class243.field3129[var11.field4284 << 3] >> 14;
                                    int var73 = (var11.field4194 << 2) * class243.field3128[var11.field4284 << 3] >> 14;
                                    class33.field519.method593(-var11.field4238 << 3);
                                    class33.field519.method589(var11.field4182 << 3);
                                    class33.field519.method588(var11.field4262 << 2, var72 + (var11.field4175 << 2) + var56, (var11.field4175 << 2) + var73);
                                    class33.field519.method579(var11.field4284 << 3);
                                    var11.method1942(var55, (byte) 109, class33.field519, class309.field3898, class665.field9027);
                                    if (class491.field6128) {
                                        class309.field3898.method451(var13, var14, var13 + var11.field4309, var11.field4211 + var14);
                                    }
                                    if (var11.field4177) {
                                        var55.method2059(class33.field519, null, var11.field4194 << 2, 1);
                                    } else if (var11.field4226 == null) {
                                        var55.method2049(class33.field519, null, 1);
                                    } else {
                                        class309.field3898.method427(var55, var11.field4226.method114(), class33.field519, null, 1);
                                    }
                                    if (class491.field6128) {
                                        class309.field3898.method403(arg4, arg7, arg6, arg2);
                                    }
                                    if (var11.field4265) {
                                        class309.field3898.method455(true);
                                    }
                                    class309.field3898.method406(0.0F, 0.0F);
                                }
                            } else if (var11.field4212 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field4237) {
                                    var74 = var14;
                                    var75 = var11.field4309 + var13;
                                    var76 = var11.field4211 + var14;
                                    var77 = var13;
                                } else {
                                    var76 = var14;
                                    var77 = var13;
                                    var74 = var11.field4211 + var14;
                                    var75 = var11.field4309 + var13;
                                }
                                if (var11.field4196 == 1) {
                                    class309.field3898.method497(var77, var76, var75, var74, var11.field4184, 0);
                                } else {
                                    class309.field3898.method448(var77, var76, var75, var74, var11.field4184, var11.field4196, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 695)
    public static void method672(int arg0) {
        if (arg0 >= -18) {
            field1169 = null;
        }
        field1169 = null;
        field1174 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I", line = 708)
    public static final int method673(int arg0, int arg1) {
        field1166++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & arg1;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z", line = 758)
    public final boolean method674(int arg0) {
        field1172++;
        if (this.field1175 != null) {
            return true;
        }
        if (this.field1163 == null) {
            if (this.field1176.method694((byte) 3)) {
                return false;
            }
            this.field1163 = this.field1176.method693(110, (byte) 0, true, 255, 255);
        }
        if (this.field1163.field5346) {
            return false;
        }
        if (arg0 != -1) {
            this.field1171 = null;
        }
        class572 var2 = new class572(this.field1163.method1741(0));
        var2.field7313 = 5;
        int var3 = var2.method3097((byte) 12);
        var2.field7313 += var3 * 72;
        byte[] var4 = new byte[var2.field7318.length - var2.field7313];
        var2.method3081(var4.length, arg0 - 24642, var4, 0);
        byte[] var7;
        if (this.field1171 == null || this.field1170 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field1171, this.field1170);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class371.method2153(5, var2.field7313 - var4.length - 5, (byte) -20, var2.field7318);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field1175 = var2;
        this.field1164 = new class601[var3];
        return true;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 836)
    public final void method675(int arg0) {
        field1167++;
        if (this.field1164 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1164.length; var2++) {
            if (this.field1164[var2] != null) {
                this.field1164[var2].method3301(-9069);
            }
        }
        for (int var3 = 0; var3 < this.field1164.length; var3++) {
            if (this.field1164[var3] != null) {
                this.field1164[var3].method3308((byte) 0);
            }
        }
        int var4 = 21 % (arg0 / 42);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lkf;IILkf;)Lrg;", line = 882)
    public final class601 method676(class237 arg0, int arg1, int arg2, class237 arg3) {
        if (arg2 == 25505) {
            field1177++;
            return this.method677(arg0, arg3, arg2 ^ 0x63A1, arg1, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lkf;Lkf;IIZ)Lrg;", line = 899)
    private final class601 method677(class237 arg0, class237 arg1, int arg2, int arg3, boolean arg4) {
        field1173++;
        if (this.field1175 == null) {
            throw new RuntimeException();
        } else if (arg2 > arg3 || arg3 >= this.field1164.length) {
            throw new RuntimeException();
        } else if (this.field1164[arg3] == null) {
            this.field1175.field7313 = arg3 * 72 + 6;
            int var6 = this.field1175.method3064(arg2 - 2031091464);
            int var7 = this.field1175.method3064(-2031091464);
            byte[] var8 = new byte[64];
            this.field1175.method3081(64, -24643, var8, 0);
            class601 var9 = new class601(arg3, arg1, arg0, this.field1176, this.field1168, var6, var8, var7, arg4);
            this.field1164[arg3] = var9;
            return var9;
        } else {
            return this.field1164[arg3];
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljt;Lcs;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 938)
    public class90(class94 arg0, class318 arg1, BigInteger arg2, BigInteger arg3) {
        this.field1168 = arg1;
        this.field1171 = arg2;
        this.field1176 = arg0;
        this.field1170 = arg3;
        if (!this.field1176.method694((byte) 3)) {
            this.field1163 = this.field1176.method693(87, (byte) 0, true, 255, 255);
        }
    }
}
