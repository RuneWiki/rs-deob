import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "[Lid;")
    public static class60[] field768 = new class60[100];

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[[S")
    public static short[][] field763 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lid;")
    private static class60 field760 = class11.method72("Cancel", (byte) 119);

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "[I")
    public static int[] field772 = new int[5];

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field771 = 0;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "[I")
    public static int[] field773 = new int[50];

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lid;")
    public static class60 field776 = field760;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lid;")
    public static class60 field781 = class11.method72("<col=00ff00>", (byte) 97);

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Lid;")
    public static class60 field778 = class11.method72("blinken3:", (byte) 92);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Luc;")
    public static class142 field770;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method247(byte arg0) {
        field777++;
        if (arg0 != -6) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class80.field1956 - 1; var2++) {
                if (class90.field2249[var2] < 1000 && class90.field2249[var2 + 1] > 1000) {
                    var1 = false;
                    class60 var3 = class80.field1995[var2];
                    class80.field1995[var2] = class80.field1995[var2 + 1];
                    class80.field1995[var2 + 1] = var3;
                    class60 var4 = class64.field1590[var2];
                    class64.field1590[var2] = class64.field1590[var2 + 1];
                    class64.field1590[var2 + 1] = var4;
                    int var5 = class90.field2249[var2];
                    class90.field2249[var2] = class90.field2249[var2 + 1];
                    class90.field2249[var2 + 1] = var5;
                    int var6 = class56.field1406[var2];
                    class56.field1406[var2] = class56.field1406[var2 + 1];
                    class56.field1406[var2 + 1] = var6;
                    int var7 = class69.field1653[var2];
                    class69.field1653[var2] = class69.field1653[var2 + 1];
                    class69.field1653[var2 + 1] = var7;
                    int var8 = class151.field3385[var2];
                    class151.field3385[var2] = class151.field3385[var2 + 1];
                    class151.field3385[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lie;Lie;ZI)V")
    public static final void method248(class61 arg0, class61 arg1, boolean arg2, int arg3) {
        class99.field2418 = arg1;
        if (arg3 >= -53) {
            method250(77, -46, null);
        }
        class93.field2303 = arg0;
        class24.field579 = arg2;
        field782++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIIILie;II)V")
    public static final void method249(boolean arg0, int arg1, int arg2, int arg3, class61 arg4, int arg5, int arg6) {
        class22.field524 = arg5;
        if (arg1 != -2) {
            method253(78);
        }
        class41.field1102 = arg3;
        class87.field2193 = arg0;
        class106.field2626 = 1;
        class113.field2710 = arg4;
        class87.field2183 = arg2;
        field766++;
        class14.field291 = arg6;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILid;)V")
    public static final void method250(int arg0, int arg1, class60 arg2) {
        if (arg0 >= -34) {
            return;
        }
        class137.field3117++;
        field765++;
        class22.field519.method1214(9, 0);
        class22.field519.method830(arg2.method430(122), 85);
        class22.field519.method827(arg1, true);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)I")
    public static final int method251(int arg0) {
        if (arg0 != -14521) {
            field760 = null;
        }
        field759++;
        int var1 = class50.method381(class46.field1222, class128.field2931, class140.field3198, (byte) 10);
        return var1 - class101.field2461 >= 800 || (class124.field2869[class46.field1222][class140.field3198 >> 7][class128.field2931 >> 7] & 0x4) == 0 ? 3 : class46.field1222;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Lfd;IIIIIIII)V")
    public static final void method252(int arg0, class40[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 4) {
            field781 = null;
        }
        field761++;
        class130.method1021(arg6, arg2, arg4, arg7);
        class127.method999();
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class40 var11 = arg1[var10];
            if (var11 != null && (var11.field1028 == arg3 || arg3 == -1412584499 && class154.field3474 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class19.field469[class87.field2164] = var11.field1033 + arg5;
                    class14.field281[class87.field2164] = var11.field1073 + arg8;
                    class38.field903[class87.field2164] = var11.field1038;
                    class35.field885[class87.field2164] = var11.field1014;
                    var12 = class87.field2164++;
                } else {
                    var12 = arg9;
                }
                var11.field1011 = class82.field2065;
                var11.field1027 = var12;
                if (!var11.field977 || !class45.method351(var11, 23154)) {
                    if (var11.field966 > 0) {
                        class72.method548(0, var11);
                    }
                    int var13 = var11.field1033 + arg5;
                    int var14 = var11.field1073 + arg8;
                    int var15 = var11.field968;
                    if (class154.field3474 == var11) {
                        if (arg3 != -1412584499 && !var11.field1002) {
                            class38.field916 = arg5;
                            class12.field228 = arg8;
                            class39.field930 = arg1;
                            continue;
                        }
                        if (!var11.field1002) {
                            var15 = 128;
                        }
                        if (class51.field1291 && class131.field2983) {
                            int var16 = class43.field1153;
                            int var17 = class21.field494;
                            int var18 = var17 - class8.field128;
                            if (var18 < class87.field2184) {
                                var18 = class87.field2184;
                            }
                            int var19 = var16 - class52.field1314;
                            if (class9.field151 > var19) {
                                var19 = class9.field151;
                            }
                            if (class87.field2184 + class77.field1888.field1014 < var11.field1014 + var18) {
                                var18 = class77.field1888.field1014 + class87.field2184 - var11.field1014;
                            }
                            var14 = var18;
                            if (class9.field151 + class77.field1888.field1038 < var11.field1038 + var19) {
                                var19 = class77.field1888.field1038 + class9.field151 - var11.field1038;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field938 == 2) {
                        var20 = arg2;
                        var21 = arg4;
                        var22 = arg7;
                        var23 = arg6;
                    } else if (var11.field938 == 9) {
                        int var24 = var13;
                        int var25 = var11.field1038 + var13;
                        int var26 = var14;
                        if (var25 < var13) {
                            var24 = var25;
                            var25 = var13;
                        }
                        var23 = arg6 < var24 ? var24 : arg6;
                        var25++;
                        int var28 = var11.field1014 + var14;
                        if (var28 < var14) {
                            var26 = var28;
                            var28 = var14;
                        }
                        var21 = arg4 <= var25 ? arg4 : var25;
                        var28++;
                        var20 = arg2 < var26 ? var26 : arg2;
                        var22 = arg7 <= var28 ? arg7 : var28;
                    } else {
                        var23 = arg6 >= var13 ? arg6 : var13;
                        var20 = arg2 < var14 ? var14 : arg2;
                        int var30 = var11.field1014 + var14;
                        var22 = arg7 <= var30 ? arg7 : var30;
                        int var31 = var11.field1038 + var13;
                        var21 = arg4 <= var31 ? arg4 : var31;
                    }
                    if (!var11.field977 || var21 > var23 && var20 < var22) {
                        if (var11.field966 != 0) {
                            if (var11.field966 == 1337) {
                                class75.field1803 = var14;
                                class51.field1292 = var13;
                                class124.method978(var14, -118, var11.field1038, var11.field1014, var13);
                                class130.method1021(arg6, arg2, arg4, arg7);
                                continue;
                            }
                            if (var11.field966 == 1338) {
                                class19.method156(var12, (byte) -65, var14, var13);
                                class130.method1021(arg6, arg2, arg4, arg7);
                                continue;
                            }
                        }
                        int var32 = class43.field1153;
                        int var33 = class21.field494;
                        if (!class135.field3067 && var32 >= var23 && var20 <= var33 && var32 < var21 && var22 > var33) {
                            class90.method737(3259, var11, var32 - var13, -var14 + var33);
                        }
                        if (var11.field938 == 0) {
                            if (!var11.field977 && class45.method351(var11, arg0 + 23150) && class67.field1637 != var11) {
                                continue;
                            }
                            if (!var11.field977) {
                                if (var11.field1071 - var11.field1014 < var11.field1031) {
                                    var11.field1031 = var11.field1071 - var11.field1014;
                                }
                                if (var11.field1031 < 0) {
                                    var11.field1031 = 0;
                                }
                            }
                            method252(4, arg1, var20, var11.field1008, var21, var13 - var11.field996, var23, var22, var14 - var11.field1031, var12);
                            if (var11.field1052 != null) {
                                method252(4, var11.field1052, var20, var11.field1008, var21, var13 - var11.field996, var23, var22, var14 - var11.field1031, var12);
                            }
                            class81 var34 = (class81) class39.field929.method716((byte) 40, (long) var11.field1008);
                            if (var34 != null) {
                                if (var34.field2026 == 0 && var23 <= class43.field1153 && class21.field494 >= var20 && class43.field1153 < var21 && class21.field494 < var22 && !class135.field3067 && !class40.field1000) {
                                    class64.field1590[0] = field776;
                                    class80.field1995[0] = class94.field2314;
                                    class90.field2249[0] = 1006;
                                    class80.field1956 = 1;
                                }
                                class15.method123(var13, (byte) -100, var22, var12, var20, var34.field2012, var14, var21, var23);
                            }
                            class130.method1021(arg6, arg2, arg4, arg7);
                            class127.method999();
                        }
                        if (class32.field757[var12] || class64.field1604 > 1) {
                            if (var11.field938 == 0 && !var11.field977 && var11.field1014 < var11.field1071) {
                                class62.method484(var11.field1014, var14, var11.field1071, var11.field1038 + var13, var11.field1031, 1);
                            }
                            if (var11.field938 != 1) {
                                if (var11.field938 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field1014; var36++) {
                                        for (int var37 = 0; var37 < var11.field1038; var37++) {
                                            int var38 = (var11.field1045 + 32) * var37 + var13;
                                            int var39 = var14 + (var11.field1062 + 32) * var36;
                                            if (var35 < 20) {
                                                var38 += var11.field1074[var35];
                                                var39 += var11.field946[var35];
                                            }
                                            if (var11.field1053[var35] > 0) {
                                                int var41 = var11.field1053[var35] - 1;
                                                boolean var42 = false;
                                                boolean var43 = false;
                                                if (arg6 < var38 + 32 && arg4 > var38 && var39 + 32 > arg2 && var39 < arg7 || class24.field594 == var11 && class60.field1475 == var35) {
                                                    class6 var44;
                                                    if (class155.field3546 == 1 && class23.field564 == var35 && class107.field2634 == var11.field1008) {
                                                        var44 = class31.method236(var41, 2, false, 0, (byte) -121, var11.field993[var35]);
                                                    } else {
                                                        var44 = class31.method236(var41, 1, false, 3153952, (byte) -96, var11.field993[var35]);
                                                    }
                                                    if (var44 == null) {
                                                        class12.method79(-30833, var11);
                                                    } else if (class24.field594 == var11 && class60.field1475 == var35) {
                                                        int var45 = class43.field1153 - class50.field1285;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        int var46 = class21.field494 - class28.field685;
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (class75.field1797 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method37(var38 + var45, var39 + var46, 128);
                                                        if (arg3 != -1) {
                                                            class40 var47 = arg1[arg3 & 0xFFFF];
                                                            if (var39 + var46 < class130.field2962 && var47.field1031 > 0) {
                                                                int var48 = (class130.field2962 - var39 - var46) * class75.field1802 / 3;
                                                                if (var48 > class75.field1802 * 10) {
                                                                    var48 = class75.field1802 * 10;
                                                                }
                                                                if (var48 > var47.field1031) {
                                                                    var48 = var47.field1031;
                                                                }
                                                                var47.field1031 -= var48;
                                                                class28.field685 += var48;
                                                                class12.method79(-30833, var47);
                                                            }
                                                            if (var39 + var46 + 32 > class130.field2961 && var47.field1071 - var47.field1014 > var47.field1031) {
                                                                int var49 = (var46 + var39 + 32 - class130.field2961) * class75.field1802 / 3;
                                                                if (var49 > class75.field1802 * 10) {
                                                                    var49 = class75.field1802 * 10;
                                                                }
                                                                if (var49 > var47.field1071 - var47.field1031 - var47.field1014) {
                                                                    var49 = var47.field1071 - var47.field1014 - var47.field1031;
                                                                }
                                                                var47.field1031 += var49;
                                                                class28.field685 -= var49;
                                                                class12.method79(arg0 ^ 0xFFFF878B, var47);
                                                            }
                                                        }
                                                    } else if (class157.field3611 == var11 && class22.field550 == var35) {
                                                        var44.method37(var38, var39, 128);
                                                    } else {
                                                        var44.method29(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field947 != null && var35 < 20) {
                                                class6 var40 = var11.method319(var35, (byte) -82);
                                                if (var40 != null) {
                                                    var40.method29(var38, var39);
                                                } else if (class63.field1571) {
                                                    class12.method79(-30833, var11);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field938 == 3) {
                                    int var50;
                                    if (class38.method299((byte) -128, var11)) {
                                        var50 = var11.field1017;
                                        if (class67.field1637 == var11 && var11.field944 != 0) {
                                            var50 = var11.field944;
                                        }
                                    } else {
                                        var50 = var11.field972;
                                        if (class67.field1637 == var11 && var11.field971 != 0) {
                                            var50 = var11.field971;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field940) {
                                            class130.method1015(var13, var14, var11.field1038, var11.field1014, var50);
                                        } else {
                                            class130.method1019(var13, var14, var11.field1038, var11.field1014, var50);
                                        }
                                    } else if (var11.field940) {
                                        class130.method1027(var13, var14, var11.field1038, var11.field1014, var50, 256 - (var15 & 0xFF));
                                    } else {
                                        class130.method1031(var13, var14, var11.field1038, var11.field1014, var50, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field938 == 4) {
                                    class49 var51 = var11.method312(false);
                                    if (var51 != null) {
                                        class60 var52 = var11.field998;
                                        int var53;
                                        if (class38.method299((byte) -101, var11)) {
                                            var53 = var11.field1017;
                                            if (class67.field1637 == var11 && var11.field944 != 0) {
                                                var53 = var11.field944;
                                            }
                                            if (var11.field992.method447((byte) 39) > 0) {
                                                var52 = var11.field992;
                                            }
                                        } else {
                                            var53 = var11.field972;
                                            if (class67.field1637 == var11 && var11.field971 != 0) {
                                                var53 = var11.field971;
                                            }
                                        }
                                        if (var11.field977 && var11.field954 != -1) {
                                            class85 var54 = class85.method710(var11.field954, 10);
                                            var52 = var54.field2122;
                                            if (var52 == null) {
                                                var52 = class41.field1107;
                                            }
                                            if ((var54.field2098 == 1 || var11.field1051 != 1) && var11.field1051 != -1) {
                                                var52 = class104.method853(-89, new class60[] { class131.field2986, var52, class128.field2922, class46.method358(var11.field1051, (byte) 65) });
                                            }
                                        }
                                        if (class124.field2864 == var11) {
                                            var52 = class146.field3277;
                                            var53 = var11.field972;
                                        }
                                        if (!var11.field977) {
                                            var52 = class115.method916(arg0 - 103, var11, var52);
                                        }
                                        var51.method953(var52, var13, var14, var11.field1038, var11.field1014, var53, var11.field960 ? 0 : -1, var11.field1029, var11.field1025, var11.field982);
                                    } else if (class63.field1571) {
                                        class12.method79(arg0 ^ 0xFFFF878B, var11);
                                    }
                                } else if (var11.field938 == 5) {
                                    if (var11.field977) {
                                        class6 var55;
                                        if (var11.field954 == -1) {
                                            var55 = var11.method317(-1, false);
                                        } else {
                                            var55 = class31.method236(var11.field954, var11.field976, false, var11.field970, (byte) -100, var11.field1051);
                                        }
                                        if (var55 != null) {
                                            int var56 = var55.field88;
                                            int var57 = var55.field93;
                                            if (var11.field1061) {
                                                class130.method1030(var13, var14, var11.field1038 + var13, var14 - -var11.field1014);
                                                int var58 = (var57 + var11.field1014 - 1) / var57;
                                                int var59 = (var56 + var11.field1038 - 1) / var56;
                                                for (int var60 = 0; var60 < var59; var60++) {
                                                    for (int var61 = 0; var61 < var58; var61++) {
                                                        if (var11.field1032 != 0) {
                                                            var55.method28(var13 + var56 / 2 + var56 * var60, var57 / 2 + var57 * var61 + var14, var11.field1032, 4096);
                                                        } else if (var15 == 0) {
                                                            var55.method29(var56 * var60 + var13, var57 * var61 + var14);
                                                        } else {
                                                            var55.method37(var56 * var60 + var13, var57 * var61 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class130.method1021(arg6, arg2, arg4, arg7);
                                            } else {
                                                int var62 = var11.field1038 * 4096 / var56;
                                                if (var11.field1032 != 0) {
                                                    var55.method28(var13 + var11.field1038 / 2, var11.field1014 / 2 + var14, var11.field1032, var62);
                                                } else if (var15 != 0) {
                                                    var55.method33(var13, var14, var11.field1038, var11.field1014, 256 - (var15 & 0xFF));
                                                } else if (var11.field1038 == var56 && var11.field1014 == var57) {
                                                    var55.method29(var13, var14);
                                                } else {
                                                    var55.method25(var13, var14, var11.field1038, var11.field1014);
                                                }
                                            }
                                        } else if (class63.field1571) {
                                            class12.method79(-30833, var11);
                                        }
                                    } else {
                                        class6 var63 = var11.method317(-1, class38.method299((byte) -107, var11));
                                        if (var63 != null) {
                                            var63.method29(var13, var14);
                                        } else if (class63.field1571) {
                                            class12.method79(-30833, var11);
                                        }
                                    }
                                } else if (var11.field938 == 6) {
                                    boolean var64 = class38.method299((byte) -98, var11);
                                    int var65;
                                    if (var64) {
                                        var65 = var11.field1023;
                                    } else {
                                        var65 = var11.field939;
                                    }
                                    class70 var66 = null;
                                    int var67 = 0;
                                    if (var11.field954 != -1) {
                                        class85 var69 = class85.method710(var11.field954, 10);
                                        if (var69 != null) {
                                            class85 var70 = var69.method702(var11.field1051, arg0 - 54);
                                            var66 = var70.method709(-1, 1);
                                            if (var66 == null) {
                                                class12.method79(arg0 ^ 0xFFFF878B, var11);
                                            } else {
                                                var66.method544();
                                                var67 = var66.field1272 / 2;
                                            }
                                        }
                                    } else if (var11.field981 == 5) {
                                        if (var11.field963 == 0) {
                                            var66 = class69.field1646.method136(null, -1, 1, null, -1);
                                        } else {
                                            var66 = class107.field2640.method1(55);
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var11.method323(arg0 - 14, null, var64, -1, class107.field2640.field2);
                                        if (var66 == null && class63.field1571) {
                                            class12.method79(-30833, var11);
                                        }
                                    } else {
                                        class46 var68 = class44.method344(var65, (byte) -93);
                                        var66 = var11.method323(arg0 ^ 0xFFFFFFF2, var68, var64, var11.field1067, class107.field2640.field2);
                                        if (var66 == null && class63.field1571) {
                                            class12.method79(-30833, var11);
                                        }
                                    }
                                    class127.method991(var11.field1038 / 2 + var13, var11.field1014 / 2 + var14);
                                    int var71 = class127.field2900[var11.field952] * var11.field1065 >> 16;
                                    int var72 = class127.field2899[var11.field952] * var11.field1065 >> 16;
                                    if (var66 != null) {
                                        if (var11.field977) {
                                            var66.method544();
                                            if (var11.field962) {
                                                var66.method524(0, var11.field980, var11.field1005, var11.field952, var11.field948, var11.field1075 + var67 + var71, var72 - -var11.field1075, var11.field1065);
                                            } else {
                                                var66.method523(0, var11.field980, var11.field1005, var11.field952, var11.field948, var11.field1075 + var71 + var67, var72 - -var11.field1075);
                                            }
                                        } else {
                                            var66.method523(0, var11.field980, 0, var11.field952, 0, var71, var72);
                                        }
                                    }
                                    class127.method997();
                                } else {
                                    if (var11.field938 == 7) {
                                        class49 var73 = var11.method312(false);
                                        if (var73 == null) {
                                            if (class63.field1571) {
                                                class12.method79(-30833, var11);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var11.field1014; var75++) {
                                            for (int var76 = 0; var76 < var11.field1038; var76++) {
                                                if (var11.field1053[var74] > 0) {
                                                    class85 var77 = class85.method710(var11.field1053[var74] - 1, 10);
                                                    class60 var78;
                                                    if (var77.field2098 != 1 && var11.field993[var74] == 1) {
                                                        var78 = class104.method853(-107, new class60[] { class131.field2986, var77.field2122, class100.field2443 });
                                                    } else {
                                                        var78 = class104.method853(arg0 - 102, new class60[] { class131.field2986, var77.field2122, class128.field2922, class46.method358(var11.field993[var74], (byte) 65) });
                                                    }
                                                    int var79 = var13 + (var11.field1045 + 115) * var76;
                                                    int var80 = (var11.field1062 + 12) * var75 + var14;
                                                    if (var11.field1029 == 0) {
                                                        var73.method947(var78, var79, var80, var11.field972, var11.field960 ? 0 : -1);
                                                    } else if (var11.field1029 == 1) {
                                                        var73.method956(var78, var11.field1038 / 2 + var79, var80, var11.field972, var11.field960 ? 0 : -1);
                                                    } else {
                                                        var73.method966(var78, var79 + var11.field1038 - 1, var80, var11.field972, var11.field960 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var11.field938 == 8 && class89.field2206 == var11 && class61.field1542 == class46.field1207) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class60 var83 = var11.field998;
                                        class49 var84 = class69.field1656;
                                        class60 var85 = class115.method916(-99, var11, var83);
                                        while (var85.method447((byte) 39) > 0) {
                                            int var93 = var85.method446(class104.field2546, arg0 - 4);
                                            class60 var94;
                                            if (var93 == -1) {
                                                var94 = var85;
                                                var85 = class94.field2314;
                                            } else {
                                                var94 = var85.method427(var93, arg0 - 100, 0);
                                                var85 = var85.method421(var93 + 4, 0);
                                            }
                                            int var95 = var84.method946(var94);
                                            if (var95 > var81) {
                                                var81 = var95;
                                            }
                                            var82 += var84.field2809 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var86 = var11.field1038 + var13 - var81 - 5;
                                        if (var13 + 5 > var86) {
                                            var86 = var13 + 5;
                                        }
                                        if (arg4 < var81 + var86) {
                                            var86 = arg4 - var81;
                                        }
                                        int var87 = var11.field1014 + var14 + 5;
                                        if (arg7 < var82 + var87) {
                                            var87 = arg7 - var82;
                                        }
                                        class130.method1015(var86, var87, var81, var82, 16777120);
                                        class130.method1019(var86, var87, var81, var82, 0);
                                        class60 var88 = var11.field998;
                                        int var89 = var84.field2809 + var87 + 2;
                                        class60 var90 = class115.method916(-116, var11, var88);
                                        while (var90.method447((byte) 39) > 0) {
                                            int var91 = var90.method446(class104.field2546, arg0 ^ 0x4);
                                            class60 var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = class94.field2314;
                                            } else {
                                                var92 = var90.method427(var91, -126, 0);
                                                var90 = var90.method421(var91 + 4, 0);
                                            }
                                            var84.method947(var92, var86 + 3, var89, 0, -1);
                                            var89 += var84.field2809 + 1;
                                        }
                                    }
                                    if (var11.field938 == 9) {
                                        if (var11.field997 == 1) {
                                            class130.method1018(var13, var14, var11.field1038 + var13, var14 - -var11.field1014, var11.field972);
                                        } else {
                                            int var96 = var11.field1014 < 0 ? -var11.field1014 : var11.field1014;
                                            int var97 = var11.field1038 < 0 ? -var11.field1038 : var11.field1038;
                                            int var98 = var97;
                                            if (var97 < var96) {
                                                var98 = var96;
                                            }
                                            if (var98 != 0) {
                                                int var99 = (var11.field1038 << 16) / var98;
                                                int var100 = (var11.field1014 << 16) / var98;
                                                if (var99 < var100) {
                                                    var100 = -var100;
                                                } else {
                                                    var99 = -var99;
                                                }
                                                int var101 = var11.field997 * var99 + 1 >> 17;
                                                int var102 = var11.field997 * var99 >> 17;
                                                int var103 = var11.field997 * var100 >> 17;
                                                int var104 = var13 + var103;
                                                int var105 = var11.field997 * var100 + 1 >> 17;
                                                int var106 = var13 + var11.field1038 - var105;
                                                int var107 = var13 + var11.field1038 + var103;
                                                int var108 = var14 + var102;
                                                int var109 = var13 - var105;
                                                int var110 = var14 - var101;
                                                int var111 = var14 + var11.field1014 - var101;
                                                int var112 = var11.field1014 + var14 + var102;
                                                class127.method1001(var104, var109, var106);
                                                class127.method1003(var108, var110, var111, var104, var109, var106, var11.field972);
                                                class127.method1001(var104, var106, var107);
                                                class127.method1003(var108, var111, var112, var104, var106, var107, var11.field972);
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
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static void method253(int arg0) {
        field760 = null;
        field763 = null;
        field770 = null;
        field773 = null;
        field772 = null;
        field778 = null;
        field768 = null;
        if (arg0 != 7) {
            method254(77, (byte) -82, 111);
        }
        field781 = null;
        field776 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)I")
    public static final int method254(int arg0, byte arg1, int arg2) {
        class23 var3 = (class23) class16.field404.method716((byte) 91, (long) arg0);
        field775++;
        if (var3 == null) {
            return 0;
        } else if (arg1 >= -86) {
            return -31;
        } else if (arg2 >= 0 && var3.field566.length > arg2) {
            return var3.field566[arg2];
        } else {
            return 0;
        }
    }
}
