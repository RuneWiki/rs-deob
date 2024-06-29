import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class299 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[[I")
    public static int[][] field4462;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Lfg;")
    public static final class21 method1883(byte arg0) {
        field4461++;
        if (class429.field6197 == null || class218.field3062 == null) {
            return null;
        }
        int var1 = -12 / ((-arg0 - 14) / 47);
        for (class21 var2 = (class21) class218.field3062.method2582((byte) -128); var2 != null; var2 = (class21) class218.field3062.method2582((byte) -128)) {
            class334 var3 = class429.field6187.method1898(36, var2.field295);
            if (var3 != null && var3.field4803 && var3.method2026(2, class429.field6181)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method1884(int arg0) {
        if (arg0 >= -14) {
            method1886(54);
        }
        field4464++;
        if (!class226.method1246(-17423)) {
            return;
        }
        if (class36.field447 == null) {
            class329.method1999(true);
        }
        class438.field6287 = new boolean[100];
        class475.field6674 = true;
        class178.field2150 = 0;
        class22.field304 = new int[100];
        class413.field5879 = new int[100];
        class168.field1993 = new int[100];
        for (int var1 = 0; var1 < 100; var1++) {
            class413.field5879[var1] = (int) ((double) class110.field1336 * Math.random());
            class168.field1993[var1] = (int) (Math.random() * 350.0D);
            class22.field304[var1] = (int) (Math.random() * 102.0D);
            class438.field6287[var1] = Math.random() < 0.5D;
        }
        try {
            class46.field601 = class310.field4546.getToolkit().getSystemClipboard();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1885(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4463++;
        int var7 = class438.field6286;
        int[] var8 = class79.field944;
        class103.field1245 = 0;
        byte var9 = class204.method1109(false) == 2 ? (byte) class154.field1858 : 1;
        label442: for (int var10 = 0; var10 < (var7 + class356.field5112); var10++) {
            class476 var33 = null;
            class187 var34;
            if (var7 > var10) {
                var34 = class46.field596[var8[var10]];
            } else {
                var34 = class448.field6366[class25.field353[var10 - var7]];
                var33 = ((class137) var34).field1643;
                if (var33.field6694 != null) {
                    var33 = var33.method2812(class75.field909, true);
                    if (var33 == null) {
                        continue;
                    }
                }
            }
            if (var34.field2455 >= 0) {
                if (class276.field3945 != null && class19.field258.field994 < var34.field994) {
                    for (int var35 = var34.field999; var35 <= var34.field1011; var35++) {
                        for (int var36 = var34.field1004; var36 <= var34.field997; var36++) {
                            if (class276.field3945[var34.field994][var35][var36] == var9) {
                                continue label442;
                            }
                        }
                    }
                }
                class426.method2540(64, arg3, var34.method654(false), arg4, arg6 >> 1, arg2 >> 1, var34);
                if (class398.field5662[0] >= 0) {
                    if (var34.field2473 != null && (var10 >= var7 || class148.field1794 == 0 || class148.field1794 == 3 || class148.field1794 == 1 && class208.method1152(0, ((class198) var34).field2736)) && class89.field1107 > class103.field1245) {
                        class89.field1119[class103.field1245] = class453.field6394.method2419(false, var34.field2473) / 2;
                        class89.field1102[class103.field1245] = class398.field5662[0];
                        class89.field1118[class103.field1245] = class398.field5662[1];
                        class89.field1108[class103.field1245] = var34.field2471;
                        class89.field1110[class103.field1245] = var34.field2515;
                        class89.field1113[class103.field1245] = var34.field2486;
                        class89.field1115[class103.field1245] = var34.field2473;
                        class103.field1245++;
                    }
                    class395 var37 = class92.field1147[0];
                    int var38 = arg5 - (Math.max(class453.field6394.field5770, var37.method223()) - class398.field5662[1]);
                    if (!var34.field2503 && class204.field2796 < var34.field2469) {
                        class395 var39 = class92.field1147[1];
                        if (var34 instanceof class137) {
                            class137 var40 = (class137) var34;
                            class395[] var41 = (class395[]) class122.field1520.method1163((byte) -49, (long) var40.field1643.field6732);
                            if (var41 == null) {
                                class473[] var42 = class473.method2794(class171.field2022, var40.field1643.field6732, 0);
                                if (var42 != null) {
                                    var41 = new class395[var42.length];
                                    for (int var43 = 0; var43 < var42.length; var43++) {
                                        var41[var43] = class231.field3205.method1426(var42[var43], true);
                                    }
                                    class122.field1520.method1172((long) var40.field1643.field6732, 1, var41);
                                }
                            }
                            if (var41 != null && var41.length == 2) {
                                var37 = var41[0];
                                var39 = var41[1];
                            }
                        }
                        int var44 = class398.field5662[0] + arg1 - (var37.method220() >> 1);
                        var37.method2363(var44, var38);
                        int var45 = var37.method220() * var34.field2468 / 255;
                        if (var34.field2468 > 0 && var45 < 2) {
                            var45 = 2;
                        }
                        class231.field3205.method1340(var44, var38, var44 + var45, var38 + var37.method223());
                        var39.method2363(var44, var38);
                        class231.field3205.method1351(arg1, arg5, arg1 + arg6, arg2 + arg5);
                    }
                    var38 -= 2;
                    if (!var34.field2503) {
                        if (var34.field2505 > class204.field2796) {
                            class395 var46 = class137.field1649[var34.field2522 ? 2 : 0];
                            class395 var47 = class137.field1649[var34.field2522 ? 3 : 1];
                            boolean var48 = true;
                            int var49;
                            if ((var34 instanceof class137)) {
                                var49 = var33.field6716;
                                if (var49 == -1) {
                                    var49 = var34.method1018(-115).field4987;
                                }
                            } else {
                                var49 = var34.method1018(-108).field4987;
                            }
                            if (var49 != -1) {
                                class395[] var50 = (class395[]) class362.field5213.method1163((byte) 119, (long) var49);
                                if (var50 == null) {
                                    class473[] var51 = class473.method2794(class171.field2022, var49, 0);
                                    if (var51 != null) {
                                        var50 = new class395[var51.length];
                                        for (int var52 = 0; var52 < var51.length; var52++) {
                                            var50[var52] = class231.field3205.method1426(var51[var52], true);
                                        }
                                        class362.field5213.method1172((long) var49, 1, var50);
                                    }
                                }
                                if (var50 != null && var50.length == 4) {
                                    var46 = var50[var34.field2522 ? 2 : 0];
                                    var47 = var50[var34.field2522 ? 3 : 1];
                                }
                            }
                            int var53 = var34.field2505 - class204.field2796;
                            int var54;
                            if (var53 <= var34.field2512) {
                                var54 = var46.method220();
                            } else {
                                int var55 = var53 - var34.field2512;
                                int var56 = var34.field2464 == 0 ? 0 : (var34.field2454 - var55) / var34.field2464 * var34.field2464;
                                var54 = var46.method220() * var56 / var34.field2454;
                            }
                            int var57 = var46.method223();
                            var38 -= var57;
                            int var58 = class398.field5662[0] + arg1 - (var46.method220() >> 1);
                            var46.method2363(var58, var38);
                            class231.field3205.method1340(var58, var38, var54 + var58, var38 + var57);
                            var47.method2363(var58, var38);
                            class231.field3205.method1351(arg1, arg5, arg1 + arg6, arg2 + arg5);
                            var38 -= 2;
                        }
                        if (var7 > var10) {
                            class198 var60 = (class198) var34;
                            if (var60.field2755 != -1) {
                                var38 -= 25;
                                class437.field6277[var60.field2755].method2363(class398.field5662[0] + arg1 - 12, var38);
                                var38 -= 2;
                            }
                            if (var60.field2712 != -1) {
                                var38 -= 25;
                                class233.field3239[var60.field2712].method2363(class398.field5662[0] + arg1 - 12, var38);
                                var38 -= 2;
                            }
                        } else if (var33.field6727 >= 0 && class233.field3239.length > var33.field6727) {
                            var38 -= 25;
                            class395 var59 = class233.field3239[var33.field6727];
                            var59.method2363(class398.field5662[0] + arg1 - (var59.method220() >> 1), var38);
                            var38 -= 2;
                        }
                    }
                    int var10000;
                    if (!var34 instanceof class198) {
                        int var67 = 0;
                        class231[] var68 = class251.field3525;
                        for (int var69 = 0; var69 < var68.length; var69++) {
                            class231 var73 = var68[var69];
                            if (var73 != null && var73.field3198 == 1 && class25.field353[var10 - var7] == var73.field3192) {
                                class395 var74 = class63.field794[var73.field3193];
                                if (var74.method223() > var67) {
                                    var67 = var74.method223();
                                }
                                if ((class204.field2796 % 20) < 10) {
                                    var74.method2363(class398.field5662[0] + arg1 - 12, -var74.method223() + var38);
                                }
                            }
                        }
                        if (var67 > 0) {
                            var10000 = var38 - (var67 + 2);
                        }
                    } else if (var10 >= 0) {
                        int var61 = 0;
                        class231[] var62 = class251.field3525;
                        for (int var63 = 0; var63 < var62.length; var63++) {
                            class231 var65 = var62[var63];
                            if (var65 != null && var65.field3198 == 10 && var8[var10] == var65.field3192) {
                                class395 var66 = class63.field794[var65.field3193];
                                if (var66.method223() > var61) {
                                    var61 = var66.method223();
                                }
                                var66.method2363(class398.field5662[0] + arg1 - 12, -var66.method223() + var38);
                            }
                        }
                        if (var61 > 0) {
                            var10000 = var38 - (var61 + 2);
                        }
                    }
                    for (int var71 = 0; var71 < 4; var71++) {
                        if (var34.field2481[var71] > class204.field2796) {
                            int var72 = var34.method654(false) / 2;
                            class426.method2540(111, arg3, var72, arg4, arg6 >> 1, arg2 >> 1, var34);
                            if (class398.field5662[0] > -1) {
                                if (var71 == 1) {
                                    class398.field5662[1] -= 20;
                                }
                                if (var71 == 2) {
                                    class398.field5662[1] -= 10;
                                    class398.field5662[0] -= 15;
                                }
                                if (var71 == 3) {
                                    class398.field5662[1] -= 10;
                                    class398.field5662[0] += 15;
                                }
                                class298.field4459[var34.field2499[var71]].method2363(arg1 + class398.field5662[0] - 12, class398.field5662[1] + arg5 + -12);
                                class304.field4500.method1124(-1, 0, (byte) 29, arg5 + class398.field5662[1] + 3, class398.field5662[0] + -1 + arg1, Integer.toString(var34.field2459[var71]));
                            }
                        }
                    }
                }
            }
        }
        if (arg0 < 20) {
            method1884(-61);
        }
        for (int var11 = 0; var11 < class388.field5559; var11++) {
            int var29 = class430.field6226[var11];
            class187 var30;
            if (var29 < 2048) {
                var30 = class46.field596[var29];
            } else {
                var30 = class448.field6366[var29 - 2048];
            }
            int var31 = class215.field2964[var11];
            class187 var32;
            if (var31 >= 2048) {
                var32 = class448.field6366[var31 - 2048];
            } else {
                var32 = class46.field596[var31];
            }
            class417.method2482(arg4, arg3, --var30.field2475, arg6, arg1, var30, arg5, var32, (byte) -56, arg2);
        }
        int var12 = class453.field6394.field5763 + class453.field6394.field5770 + 2;
        for (int var13 = 0; var13 < class103.field1245; var13++) {
            int var14 = class89.field1102[var13];
            int var15 = class89.field1118[var13];
            int var16 = class89.field1119[var13];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var28 = 0; var28 < var13; var28++) {
                    if (class89.field1118[var28] - var12 < var15 + 2 && (var15 - var12) < (class89.field1118[var28] + 2) && class89.field1119[var28] + class89.field1102[var28] > -var16 + var14 && var14 + var16 > class89.field1102[var28] + -class89.field1119[var28] && class89.field1118[var28] - var12 < var15) {
                        var17 = true;
                        var15 = class89.field1118[var28] - var12;
                    }
                }
            }
            class89.field1118[var13] = var15;
            String var18 = class89.field1115[var13];
            if (class56.field713 == 0) {
                int var19 = 16776960;
                if (class89.field1108[var13] < 6) {
                    var19 = class385.field5532[class89.field1108[var13]];
                }
                if (class89.field1108[var13] == 6) {
                    var19 = class154.field1858 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class89.field1108[var13] == 7) {
                    var19 = (class154.field1858 % 20) < 10 ? 255 : 65535;
                }
                if (class89.field1108[var13] == 8) {
                    var19 = class154.field1858 % 20 < 10 ? 45056 : 8454016;
                }
                if (class89.field1108[var13] == 9) {
                    int var20 = 150 - class89.field1113[var13];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 33160960 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var19 = var20 * 5 + 65280 - 500;
                    }
                }
                if (class89.field1108[var13] == 10) {
                    int var21 = 150 - class89.field1113[var13];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 33095935 - (var21 * 327680);
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - ((var21 - 100) * 5);
                    }
                }
                if (class89.field1108[var13] == 11) {
                    int var22 = 150 - class89.field1113[var13];
                    if (var22 < 50) {
                        var19 = 16777215 - (var22 * 327685);
                    } else if (var22 < 100) {
                        var19 = var22 * 327685 - 16318970;
                    } else if (var22 < 150) {
                        var19 = 32768000 + 16777215 - (var22 * 327680);
                    }
                }
                int var23 = var19 | 0xFF000000;
                if (class89.field1110[var13] == 0) {
                    class101.field1230.method1124(var23, -16777216, (byte) 29, arg5 + var15, arg1 + var14, var18);
                }
                if (class89.field1110[var13] == 1) {
                    class101.field1230.method1130(var18, class154.field1858, arg1 + var14, -16777216, arg5 + var15, -1, var23);
                }
                if (class89.field1110[var13] == 2) {
                    class101.field1230.method1129(arg5 + var15, arg1 + var14, var18, var23, -16777216, (byte) 60, class154.field1858);
                }
                if (class89.field1110[var13] == 3) {
                    class101.field1230.method1138(var18, arg1 + var14, class154.field1858, -16777216, arg5 + var15, -class89.field1113[var13] + 150, false, var23);
                }
                if (class89.field1110[var13] == 4) {
                    int var24 = (150 - class89.field1113[var13]) * (class453.field6394.method2419(false, var18) + 100) / 150;
                    class231.field3205.method1340(arg1 + var14 - 50, arg5, arg1 - (-var14 - 50), arg2 + arg5);
                    class101.field1230.method1132(-16777216, arg5 + var15, arg1 + 50 - (-var14 - -var24), var23, var18, -28115);
                    class231.field3205.method1351(arg1, arg5, arg1 + arg6, arg2 + arg5);
                }
                if (class89.field1110[var13] == 5) {
                    int var25 = 150 - class89.field1113[var13];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    int var27 = class453.field6394.field5770 + class453.field6394.field5763;
                    class231.field3205.method1340(arg1, arg5 + var15 - var27 - 1, arg1 + arg6, arg5 + var15 + 5);
                    class101.field1230.method1124(var23, -16777216, (byte) 29, var15 + var26 + arg5, arg1 + var14, var18);
                    class231.field3205.method1351(arg1, arg5, arg1 + arg6, arg2 + arg5);
                }
            } else {
                class101.field1230.method1124(-256, -16777216, (byte) 29, arg5 + var15, arg1 + var14, var18);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static void method1886(int arg0) {
        int var1 = -18 / ((-arg0 - 14) / 60);
        field4462 = null;
    }

    static {
        new class40("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }
}
