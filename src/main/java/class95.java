import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class95 {

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "B")
    public byte field1252;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "S")
    public short field1254;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "S")
    public short field1255;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "B")
    public byte field1246;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "S")
    public short field1245;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Z")
    public boolean field1248;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Lpe;")
    public static class615 field1249;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 13)
    public static void method723(int arg0) {
        field1249 = null;
        if (arg0 != 0) {
            method723(-4);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILpe;)I", line = 26)
    public static final int method724(int arg0, class615 arg1) {
        if (arg0 <= 125) {
            field1249 = null;
        }
        field1244++;
        int var2 = 0;
        if (arg1.method3362(class13.field139, -127)) {
            var2++;
        }
        if (arg1.method3362(class37.field543, -119)) {
            var2++;
        }
        if (arg1.method3362(class188.field2406, -110)) {
            var2++;
        }
        if (arg1.method3362(class618.field8350, -114)) {
            var2++;
        }
        if (arg1.method3362(class524.field6829, -110)) {
            var2++;
        }
        if (arg1.method3362(class258.field3480, -102)) {
            var2++;
        }
        if (arg1.method3362(class400.field5110, -126)) {
            var2++;
        }
        if (arg1.method3362(class194.field2538, -127)) {
            var2++;
        }
        if (arg1.method3362(class86.field1151, -128)) {
            var2++;
        }
        if (arg1.method3362(class463.field6059, -125)) {
            var2++;
        }
        if (arg1.method3362(class374.field4794, -110)) {
            var2++;
        }
        if (arg1.method3362(class429.field5555, -115)) {
            var2++;
        }
        if (arg1.method3362(class25.field312, -101)) {
            var2++;
        }
        if (arg1.method3362(class16.field180, -120)) {
            var2++;
        }
        if (arg1.method3362(class640.field8894, -108)) {
            var2++;
        }
        if (arg1.method3362(class175.field2191, -112)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[Ltc;IIIIBI)V", line = 99)
    public static final void method725(int arg0, int arg1, int arg2, class477[] arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        class520.field6799.method376(arg2, arg5, arg7, arg4);
        field1251++;
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class477 var11 = arg3[var10];
            if (var11 != null && (var11.field6292 == arg1 || arg1 == -1412584499 && class655.field9114 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class20.field220[class57.field758].setBounds(var11.field6286 + arg6, var11.field6303 + arg0, var11.field6372, var11.field6224);
                    var12 = class57.field758++;
                } else {
                    var12 = arg9;
                }
                var11.field6351 = var12;
                var11.field6362 = class424.field5503;
                if (!client.method707(var11)) {
                    if (var11.field6324 != 0) {
                        class247.method1556(var11, 121);
                    }
                    int var13 = var11.field6286 + arg6;
                    int var14 = var11.field6303 + arg0;
                    int var15 = var11.field6310;
                    if (class100.field1336 && (client.method696(var11).field2020 != 0 || var11.field6312 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class655.field9114 == var11) {
                        if (arg1 != -1412584499 && (class15.field168 == var11.field6295 || class240.field3245 == var11.field6295)) {
                            class384.field4914 = arg3;
                            class337.field4363 = arg0;
                            class250.field3402 = arg6;
                            continue;
                        }
                        if (class347.field4428 && class659.field9179) {
                            int var16 = class691.field9440.method2214(-2703);
                            int var17 = class691.field9440.method2208(30114);
                            int var18 = var16 - class429.field5554;
                            int var19 = var17 - class576.field7845;
                            if (class11.field119 > var18) {
                                var18 = class11.field119;
                            }
                            if (class24.field263 > var19) {
                                var19 = class24.field263;
                            }
                            if ((class11.field119 + class323.field4197.field6372) < (var11.field6372 + var18)) {
                                var18 = class11.field119 + class323.field4197.field6372 - var11.field6372;
                            }
                            if (class24.field263 + class323.field4197.field6224 < var19 - -var11.field6224) {
                                var19 = class24.field263 + class323.field4197.field6224 - var11.field6224;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (class240.field3245 == var11.field6295) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field6312 == 2) {
                        var20 = arg2;
                        var21 = arg5;
                        var22 = arg7;
                        var23 = arg4;
                    } else {
                        int var24 = var11.field6372 + var13;
                        int var25 = var14 + var11.field6224;
                        var20 = var13 > arg2 ? var13 : arg2;
                        if (var11.field6312 == 9) {
                            var24++;
                            var25++;
                        }
                        var21 = var14 <= arg5 ? arg5 : var14;
                        var23 = var25 < arg4 ? var25 : arg4;
                        var22 = arg7 > var24 ? var24 : arg7;
                    }
                    if (var20 < var22 && var23 > var21) {
                        if (var11.field6324 != 0) {
                            if (class534.field6947 == var11.field6324 || class317.field4108 == var11.field6324) {
                                class278.method1681(var13, var11.field6372, var11.field6224, var14, class317.field4108 == var11.field6324, (byte) 57);
                                class53.field719[var12] = true;
                                class520.field6799.method376(arg2, arg5, arg7, arg4);
                                continue;
                            }
                            if (class82.field1124 == var11.field6324) {
                                if (var11.method2647(false, class520.field6799) != null) {
                                    class424.method2439(26);
                                    class543.method2880(var14, var11, class520.field6799, -10421, var13);
                                    class541.field7022[var12] = true;
                                    class520.field6799.method376(arg2, arg5, arg7, arg4);
                                }
                                continue;
                            }
                            if (class78.field1066 == var11.field6324) {
                                if (var11.method2647(false, class520.field6799) != null) {
                                    class30.method252(var13, (byte) -87, var11, var14);
                                    class541.field7022[var12] = true;
                                    class520.field6799.method376(arg2, arg5, arg7, arg4);
                                }
                                continue;
                            }
                            if (class475.field6184 == var11.field6324) {
                                class607.method3302(var11.field6224, var14, class520.field6799, -118, var11.field6372, class448.field5863, var13);
                                class53.field719[var12] = true;
                                class520.field6799.method376(arg2, arg5, arg7, arg4);
                                continue;
                            }
                            if (class313.field4068 == var11.field6324) {
                                class329.method1899(var11.field6224, var13, var14, -2, var11.field6372, class520.field6799);
                                class53.field719[var12] = true;
                                class520.field6799.method376(arg2, arg5, arg7, arg4);
                                continue;
                            }
                            if (class148.field1919 == var11.field6324) {
                                if (!class144.field1889 && !class62.field845) {
                                    continue;
                                }
                                int var26 = var11.field6372 + var13;
                                int var27 = var14 + 15;
                                if (class144.field1889) {
                                    int var28 = -256;
                                    if (class486.field6471 < 20) {
                                        var28 = -65536;
                                    }
                                    class562.field7337.method3235((byte) -103, "Fps:" + class486.field6471, var27, -1, var28, var26);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        if (class478.field6390) {
                                            class351.method2013(-17408);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class433.method2476("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", false, 4);
                                            }
                                        }
                                        var31 = -65536;
                                    }
                                    class562.field7337.method3235((byte) -110, "Mem:" + var30 + "k", var27, -1, var31, var26);
                                    var27 += 15;
                                    class562.field7337.method3235((byte) -118, "In:" + class555.field7268 + "B/s Out:" + class361.field4666 + "B/s", var27, -1, -256, var26);
                                    var27 += 15;
                                    int var33 = class520.field6799.method399() / 1024;
                                    class562.field7337.method3235((byte) -114, "Offheap:" + var33 + "k", var27, -1, var33 <= 65536 ? -256 : -65536, var26);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 35; var37++) {
                                        if (class358.field4642[var37] != null) {
                                            var34 += class358.field4642[var37].method2564((byte) -5);
                                            var35 += class358.field4642[var37].method2560(-1);
                                            var36 += class358.field4642[var37].method2561(0);
                                        }
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class287.method1706((long) var39, 2, 10, true, 0) + "% (" + var38 + "%)";
                                    class305.field4015.method3235((byte) -91, var40, var27, -1, -256, var26);
                                    var27 += 12;
                                }
                                if (class53.field726 > 0) {
                                    class305.field4015.method3235((byte) -97, "Particles: " + class219.field2878 + " / " + class53.field726, var27, -1, -256, var26);
                                }
                                var27 += 12;
                                if (class62.field845) {
                                    class305.field4015.method3235((byte) -95, "Polys: " + class520.field6799.method168() + " Models: " + class520.field6799.method401(), var27, -1, -256, var26);
                                    var27 += 12;
                                    class305.field4015.method3235((byte) -93, "Ls: " + class2.field11 + " La: " + class249.field3374 + " NPC: " + class612.field8282 + " Pl: " + class592.field8016, var27, -1, -256, var26);
                                    var27 += 12;
                                    class447.method2528((byte) -13);
                                }
                                class53.field719[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field6312 == 0) {
                            if (class134.field1751 == var11.field6324 && class520.field6799.method211()) {
                                class520.field6799.method209(var13, var14, var11.field6372, var11.field6224);
                            }
                            method725(var14 - var11.field6356, var11.field6234, var20, arg3, var23, var21, var13 - var11.field6317, var22, (byte) -122, var12);
                            if (var11.field6258 != null) {
                                method725(var14 - var11.field6356, var11.field6234, var20, var11.field6258, var23, var21, var13 - var11.field6317, var22, (byte) -117, var12);
                            }
                            class270 var41 = (class270) class700.field9763.method39((long) var11.field6234, 31750);
                            if (var41 != null) {
                                class635.method3510(var13, var41.field3588, var14, var12, var22, var23, var21, (byte) 52, var20);
                            }
                            if (class134.field1751 == var11.field6324 && class520.field6799.method211()) {
                                class520.field6799.method194();
                                class560.field7315 = true;
                            }
                            class520.field6799.method376(arg2, arg5, arg7, arg4);
                        }
                        if (class513.field6724[var12] || class15.field176 > 1) {
                            if (var11.field6312 == 3) {
                                if (var15 == 0) {
                                    if (var11.field6309) {
                                        class520.field6799.method353(var13, var14, var11.field6372, var11.field6224, var11.field6302, 0);
                                    } else {
                                        class520.field6799.method388(var13, var14, var11.field6372, var11.field6224, var11.field6302, 0);
                                    }
                                } else if (var11.field6309) {
                                    class520.field6799.method353(var13, var14, var11.field6372, var11.field6224, 255 - (var15 & 0xFF) << 24 | var11.field6302 & 0xFFFFFF, 1);
                                } else {
                                    class520.field6799.method388(var13, var14, var11.field6372, var11.field6224, 255 - (var15 & 0xFF) << 24 | var11.field6302 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field6312 == 4) {
                                class597 var42 = var11.method2646((byte) 103, class520.field6799);
                                if (var42 != null) {
                                    int var43 = var11.field6302;
                                    String var44 = var11.field6298;
                                    if (var11.field6321 != -1) {
                                        class696 var45 = class232.field3109.method1292(0, var11.field6321);
                                        var44 = var45.field9569;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field9579 == 1 || var11.field6237 != 1) && var11.field6237 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class346.method1990(108, var11.field6237);
                                        }
                                    }
                                    if (class357.field4636 == var11) {
                                        var44 = class604.field8155.method3280((byte) 71, class144.field1890);
                                        var43 = var11.field6302;
                                    }
                                    if (class560.field7312) {
                                        class520.field6799.method339(var13, var14, var11.field6372 + var13, var11.field6224 + var14);
                                    }
                                    var42.method3250(class497.field6553, null, var13, null, 1, 0, var14, var11.field6352, var11.field6329 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field6372, var43 | 255 - (var15 & 0xFF) << 24, var11.field6224, var44, 0, var11.field6247, var11.field6284, var11.field6248);
                                    if (class560.field7312) {
                                        class520.field6799.method376(arg2, arg5, arg7, arg4);
                                    }
                                } else if (class148.field1918) {
                                    class386.method2199(var11, false);
                                }
                            } else if (var11.field6312 == 5) {
                                if (var11.field6255 < 0) {
                                    class511 var47;
                                    if (var11.field6321 == -1) {
                                        var47 = var11.method2639(class520.field6799, 16777215);
                                    } else {
                                        class210 var46 = var11.field6242 ? class233.field3130.field2469 : null;
                                        var47 = class232.field3109.method1296(class520.field6799, var11.field6239, var11.field6370 | 0xFF000000, var11.field6237, var11.field6360, var11.field6321, var46, -98);
                                    }
                                    if (var47 != null) {
                                        int var48 = var47.method602();
                                        int var49 = var47.method595();
                                        int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field6302 == 0 ? 16777215 : var11.field6302 & 0xFFFFFF);
                                        if (var11.field6256) {
                                            class520.field6799.method339(var13, var14, var11.field6372 + var13, var14 - -var11.field6224);
                                            if (var11.field6215 != 0) {
                                                int var51 = (var11.field6372 + var48 - 1) / var48;
                                                int var52 = (var11.field6224 - (1 - var49)) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field6302 == 0) {
                                                            var47.method2750((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field6215);
                                                        } else {
                                                            var47.method2752((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), 4096, var11.field6215, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field6302 == 0 && var15 == 0) {
                                                var47.method2756(var13, var14, var11.field6372, var11.field6224);
                                            } else {
                                                var47.method596(var13, var14, var11.field6372, var11.field6224, 0, var50, 1);
                                            }
                                            class520.field6799.method376(arg2, arg5, arg7, arg4);
                                        } else if (var11.field6302 == 0 && var15 == 0) {
                                            if (var11.field6215 != 0) {
                                                var47.method2750((float) var11.field6372 / 2.0F + (float) var13, (float) var11.field6224 / 2.0F + (float) var14, var11.field6372 * 4096 / var48, var11.field6215);
                                            } else if (var11.field6372 == var48 && var11.field6224 == var49) {
                                                var47.method2751(var13, var14);
                                            } else {
                                                var47.method2754(var13, var14, var11.field6372, var11.field6224);
                                            }
                                        } else if (var11.field6215 != 0) {
                                            var47.method2752((float) var11.field6372 / 2.0F + (float) var13, (float) var11.field6224 / 2.0F + (float) var14, var11.field6372 * 4096 / var48, var11.field6215, 0, var50, 1);
                                        } else if (var11.field6372 == var48 && var11.field6224 == var49) {
                                            var47.method606(var13, var14, 0, var50, 1);
                                        } else {
                                            var47.method604(var13, var14, var11.field6372, var11.field6224, 0, var50, 1);
                                        }
                                    } else if (class148.field1918) {
                                        class386.method2199(var11, false);
                                    }
                                } else {
                                    var11.method2630(class277.field3629, (byte) 102, class382.field4898).method2618(var11.field6364 << 3, 0, var11.field6251 << 3, var14, (byte) -69, var13, class520.field6799, var11.field6372, 0, var11.field6224);
                                }
                            } else if (var11.field6312 == 6) {
                                class195.method1286(-16608);
                                class107 var55 = null;
                                int var56 = 0;
                                if (var11.field6321 != -1) {
                                    class696 var64 = class232.field3109.method1292(0, var11.field6321);
                                    if (var64 != null) {
                                        class696 var65 = var64.method3790((byte) -10, var11.field6237);
                                        class348 var66 = var11.field6272 == -1 ? null : class552.field7163.method3031(97, var11.field6272);
                                        class210 var67 = var11.field6242 ? class233.field3130.field2469 : null;
                                        var55 = var65.method3794(var11.field6261, -21807, 1, var66, 2048, var11.field6301, var11.field6267, class520.field6799, var67);
                                        if (var55 == null) {
                                            class386.method2199(var11, false);
                                        } else {
                                            var56 = -var55.method816() >> 1;
                                        }
                                    }
                                } else if (var11.field6323 == 5) {
                                    int var57 = var11.field6325;
                                    if (var57 >= 0 && var57 < 2048) {
                                        class193 var58 = class592.field8019[var57];
                                        class348 var59 = var11.field6272 == -1 ? null : class552.field7163.method3031(83, var11.field6272);
                                        if (var58 != null && (class353.field4536 == var57 || class597.method3248(1544807237, var58.field2492) == var11.field6278)) {
                                            var55 = var58.field2469.method1349(null, 0, var59, class520.field6799, -1943787538, null, class397.field5054, 2048, class120.field1550, class536.field6983, var11.field6301, -1, class552.field7163, var11.field6267, true, var11.field6261, 0, class646.field8998, class232.field3109);
                                        }
                                    }
                                } else if (var11.field6323 == 8 || var11.field6323 == 9) {
                                    class263 var61 = class265.method1643(false, false, var11.field6325);
                                    class348 var62 = var11.field6272 == -1 ? null : class552.field7163.method3031(-92, var11.field6272);
                                    if (var61 != null) {
                                        class210 var63 = var11.field6242 ? class233.field3130.field2469 : null;
                                        var55 = var61.method1630(var11.field6278, (byte) -118, class520.field6799, var11.field6301, var11.field6261, var63, var11.field6323 == 9, var62, 2048, var11.field6267);
                                    }
                                } else if (var11.field6272 == -1) {
                                    var55 = var11.method2635(class120.field1550, -1, -1, class232.field3109, null, 0, class520.field6799, class536.field6983, class552.field7163, 2048, class397.field5054, class646.field8998, 123, class233.field3130.field2469);
                                    if (var55 == null && class148.field1918) {
                                        class386.method2199(var11, false);
                                    }
                                } else {
                                    class348 var60 = class552.field7163.method3031(-102, var11.field6272);
                                    var55 = var11.method2635(class120.field1550, var11.field6301, var11.field6267, class232.field3109, var60, var11.field6261, class520.field6799, class536.field6983, class552.field7163, 2048, class397.field5054, class646.field8998, 116, class233.field3130.field2469);
                                    if (var55 == null && class148.field1918) {
                                        class386.method2199(var11, false);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field6291 <= 0) {
                                        var68 = 512;
                                    } else {
                                        var68 = (var11.field6372 << 9) / var11.field6291;
                                    }
                                    int var69;
                                    if (var11.field6365 > 0) {
                                        var69 = (var11.field6224 << 9) / var11.field6365;
                                    } else {
                                        var69 = 512;
                                    }
                                    int var70 = (var11.field6270 * var68 >> 9) + (var13 + (var11.field6372 / 2));
                                    int var71 = (var11.field6367 * var69 >> 9) + var11.field6224 / 2 + var14;
                                    class355.field4580.method137();
                                    class520.field6799.method342(class355.field4580);
                                    class520.field6799.method393(var70, var71, var68, var69);
                                    class520.field6799.method371((float) (var11.field6328 << 2), var11.field6334 ? (float) (var11.field6257 << 2) : (float) (var11.field6257 << 2) * 1.5F);
                                    if (arg1 == -1412584499 || class560.field7315) {
                                        class520.field6799.method396();
                                        class520.field6799.method205();
                                        class520.field6799.method376(arg2, arg5, arg7, arg4);
                                        class560.field7315 = false;
                                    }
                                    if (var11.field6319) {
                                        class520.field6799.method391(false);
                                    }
                                    int var72 = (var11.field6216 << 2) * class237.field3193[var11.field6283 << 3] >> 14;
                                    int var73 = (var11.field6216 << 2) * class237.field3196[var11.field6283 << 3] >> 14;
                                    class125.field1623.method149(-var11.field6277 << 3);
                                    class125.field1623.method136(var11.field6342 << 3);
                                    class125.field1623.method143(var11.field6253 << 2, (var11.field6271 << 2) + var56 + var72, (var11.field6271 << 2) + var73);
                                    class125.field1623.method135(var11.field6283 << 3);
                                    var11.method2648(class125.field1623, 0, class424.field5503, class520.field6799, var55);
                                    if (class560.field7312) {
                                        class520.field6799.method339(var13, var14, var11.field6372 + var13, var14 - -var11.field6224);
                                    }
                                    if (var11.field6334) {
                                        var55.method792(class125.field1623, null, var11.field6216 << 2, 1);
                                    } else if (var11.field6380 == null) {
                                        var55.method827(class125.field1623, null, 1);
                                    } else {
                                        class520.field6799.method365(var55, var11.field6380.method1454(), class125.field1623, null, 1);
                                    }
                                    if (class560.field7312) {
                                        class520.field6799.method376(arg2, arg5, arg7, arg4);
                                    }
                                    if (var11.field6319) {
                                        class520.field6799.method391(true);
                                    }
                                    class520.field6799.method371(0.0F, 0.0F);
                                }
                            } else if (var11.field6312 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field6218) {
                                    var76 = var11.field6372 + var13;
                                    var75 = var14;
                                    var74 = var13;
                                    var77 = var14 + var11.field6224;
                                } else {
                                    var74 = var13;
                                    var75 = var14 + var11.field6224;
                                    var76 = var11.field6372 + var13;
                                    var77 = var14;
                                }
                                if (var11.field6308 == 1) {
                                    class520.field6799.method406(var74, var77, var76, var75, var11.field6302, 0);
                                } else {
                                    class520.field6799.method368(var74, var77, var76, var75, var11.field6302, var11.field6308, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg8 > -113) {
            field1247 = -59;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 794)
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field1252 = (byte) arg7;
        this.field1254 = (short) arg4;
        this.field1255 = (short) arg6;
        this.field1246 = (byte) arg8;
        this.field1245 = (short) arg5;
        this.field1248 = arg9;
        this.field1250 = arg0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZII)Lsm;", line = 814)
    public final class95 method726(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1253++;
        return arg2 ? null : new class95(arg4, arg1, arg3, arg0, this.field1254, this.field1245, this.field1255, this.field1252, this.field1246, this.field1248);
    }
}
