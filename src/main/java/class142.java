import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class142 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[I")
    public static int[] field2689 = new int[2048];

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljd;")
    public static class86 field2692 = class122.method868(" ", true);

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[[S")
    public static short[][] field2698 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Ljd;")
    public static class86 field2691 = class122.method868(")3", true);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public int field2694;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "[[S")
    public static short[][] field2699;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLbj;)V")
    public static final void method1007(boolean arg0, class151 arg1) {
        field2700++;
        if (arg0) {
            field2696 = 113;
        }
        class43.field967 = arg1.method1079(117, class260.field4659);
        class45.field1015 = arg1.method1079(-105, class221.field3973);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static final void method1008(byte arg0) {
        class102.field1971 = 0;
        class164.field3083 = 0;
        field2693++;
        class45.method359((byte) -124);
        class193.method1343(-77);
        class169.method1217(-2);
        class239.method1641(-1);
        for (int var1 = 0; var1 < class102.field1971; var1++) {
            int var3 = class1.field11[var1];
            if (class236.field4265 != class186.field3294[var3].field702) {
                if (class186.field3294[var3].field4051 > 0) {
                    class240.method1648(32, class186.field3294[var3]);
                }
                class186.field3294[var3] = null;
            }
        }
        if (class112.field2143 != class168.field3102.field3565) {
            throw new RuntimeException("gpp1 pos:" + class168.field3102.field3565 + " psize:" + class112.field2143);
        }
        for (int var2 = 0; var2 < class209.field3786; var2++) {
            if (class186.field3294[field2689[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class209.field3786);
            }
        }
        if (arg0 < 7) {
            field2692 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg10;
        if (class263.field4668 > arg8) {
            var11++;
        }
        field2703++;
        int var12 = arg3 - arg4;
        if (arg3 < class38.field894) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var44 = arg9 * var13 + arg1 >> 16;
            int var45 = (var13 + 1) * arg9 + arg1 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg10 + var13 >> 6;
                if (var47 >= 0 && (class20.field528.length - 1) >= var47) {
                    int[][] var48 = class20.field528[var47];
                    byte[][] var49 = class159.field2977[var47];
                    int var50 = arg0 + var44;
                    int var51 = arg0 + var45;
                    byte[][] var52 = class241.field4332[var47];
                    byte[][] var53 = class20.field518[var47];
                    byte[][] var54 = class116.field2207[var47];
                    byte[][] var55 = class87.field1734[var47];
                    for (int var56 = 0; var56 < var12; var56++) {
                        int var57 = arg5 + (arg2 * var56) >> 16;
                        int var58 = arg5 + ((var56 + 1) * arg2) >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg6 + var58;
                            int var61 = arg6 + var57;
                            int var62 = arg4 + var56 & 0x3F;
                            int var63 = var56 + arg4 >> 6;
                            int var64 = arg10 + var13 & 0x3F;
                            int var65 = (var62 << 6) + var64;
                            int var66;
                            if (var63 < 0 || var63 > var48.length - 1 || var48[var63] == null) {
                                if (class46.field1024.field3804 != -1) {
                                    var66 = class46.field1024.field3804;
                                } else if ((var56 + arg4 & 0x4) == (arg10 + var13 & 0x4)) {
                                    var66 = class60.field1205[class127.field2446 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var63 < 0 || var63 > var48.length - 1) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class131.method927(var50, var61, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var48[var63][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var49[var63] == null ? 0 : class60.field1205[var49[var63][var65] & 0xFF];
                            int var68 = var53[var63] == null ? 0 : class60.field1205[var53[var63][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class131.method927(var50, var61, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    byte var69 = var52[var63] == null ? 0 : var52[var63][var65];
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class131.method927(var50, var61, var46, var59, var67);
                                    } else {
                                        class258.method1747(var50, true, var61, var59, var46, var67, var66, var70 >> 2, class131.field2493, var69 & 0x3, 1);
                                    }
                                }
                                if (var68 != 0) {
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    byte var71 = var54[var63][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class131.method927(var50, var61, var46, var59, var68);
                                    }
                                    class258.method1747(var50, var67 == 0, var61, var59, var46, var68, 0, var72 >> 2, class131.field2493, var71 & 0x3, 1);
                                }
                            }
                            if (var55[var63] != null) {
                                int var73 = var55[var63][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var50;
                                    } else {
                                        var74 = var51 - 1;
                                    }
                                    int var75;
                                    if (var59 == 1) {
                                        var75 = var61;
                                    } else {
                                        var75 = var60 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var76 = 13369344;
                                        var73 -= 4;
                                    }
                                    if (var73 == 1) {
                                        class131.method920(var50, var61, var59, var76);
                                    } else if (var73 == 2) {
                                        class131.method929(var50, var61, var46, var76);
                                    } else if (var73 == 3) {
                                        class131.method920(var74, var61, var59, var76);
                                    } else if (var73 == 4) {
                                        class131.method929(var50, var75, var46, var76);
                                    } else if (var73 == 9) {
                                        class131.method920(var50, var61, var59, 16777215);
                                        class131.method929(var50, var61, var46, var76);
                                    } else if (var73 == 10) {
                                        class131.method920(var74, var61, var59, 16777215);
                                        class131.method929(var50, var61, var46, var76);
                                    } else if (var73 == 11) {
                                        class131.method920(var74, var61, var59, 16777215);
                                        class131.method929(var50, var75, var46, var76);
                                    } else if (var73 == 12) {
                                        class131.method920(var50, var61, var59, 16777215);
                                        class131.method929(var50, var75, var46, var76);
                                    } else if (var73 == 17) {
                                        class131.method929(var50, var61, 1, var76);
                                    } else if (var73 == 18) {
                                        class131.method929(var74, var61, 1, var76);
                                    } else if (var73 == 19) {
                                        class131.method929(var74, var75, 1, var76);
                                    } else if (var73 == 20) {
                                        class131.method929(var50, var75, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class131.method929(var50 + var78, -var78 + var75, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class131.method929(var50 + var77, var61 - -var77, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg0 + var45;
                    int var80 = arg0 + var44;
                    for (int var81 = 0; var81 < var12; var81++) {
                        int var82;
                        if (class46.field1024.field3804 != -1) {
                            var82 = class46.field1024.field3804;
                        } else if ((arg4 + var81 & 0x4) == (arg10 + var13 & 0x4)) {
                            var82 = class60.field1205[class127.field2446 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var83 = (arg2 * var81 + arg5 >> 16) + arg6;
                        int var84 = ((var81 + 1) * arg2 + arg5 >> 16) + arg6;
                        int var85 = var84 - var83;
                        class131.method927(var80, var83, var46, var85, var82);
                    }
                }
            }
        }
        if (arg7 != 10) {
            return;
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg1 + (arg9 * var14) >> 16;
            int var16 = (var14 + 1) * arg9 + arg1 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg10 + var14 >> 6;
                var10000 = arg0 + var16;
                int var20 = arg0 + var15;
                if (var18 >= 0 && class69.field1398.length - 1 >= var18) {
                    short[][] var21 = class69.field1398[var18];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = (var22 + 1) * arg2 + arg5 >> 16;
                        int var24 = arg5 + (arg2 * var22) >> 16;
                        int var25 = var23 - var24;
                        if (var25 > 0) {
                            var10000 = arg6 + var23;
                            int var27 = arg4 + var22 >> 6;
                            int var28 = arg6 + var24;
                            if (var27 >= 0 && var21.length - 1 >= var27) {
                                int var29 = (arg4 + var22 & 0x3F << 6) + (arg10 + var14 & 0x3F);
                                if (var21[var27] != null) {
                                    int var30 = (var21[var27][var29] & 0xE949) >> 14;
                                    int var31 = var21[var27][var29] & 0x3FFF;
                                    if (var31 != 0) {
                                        if (var30 == 0) {
                                            int var41 = class37.field833[var31 - 1].field1229 * var25 / 4;
                                            int var42 = class37.field833[var31 - 1].field1215 * var17 / 4;
                                            int var43 = class37.field833[var31 - 1].field1217 * var25 / 4;
                                            class37.field833[var31 - 1].method731(var20, var28 - var43, var42, var41);
                                        } else if (var30 == 1) {
                                            int var32 = class159.field2983[var31 - 1].field1229 * var25 / 4;
                                            int var33 = class159.field2983[var31 - 1].field1215 * var17 / 4;
                                            int var34 = class159.field2983[var31 - 1].field1217 * var25 / 4;
                                            class159.field2983[var31 - 1].method731(var20, var28 - var34, var33, var32);
                                        } else if (var30 == 2) {
                                            int var35 = class220.field3951[var31 - 1].field1215 * var17 / 4;
                                            int var36 = class220.field3951[var31 - 1].field1217 * var25 / 4;
                                            int var37 = class220.field3951[var31 - 1].field1229 * var25 / 4;
                                            class220.field3951[var31 - 1].method731(var20, var28 - var36, var35, var37);
                                        } else if (var30 == 3) {
                                            int var38 = class229.field4166[var31 - 1].field1215 * var17 / 4;
                                            int var39 = class229.field4166[var31 - 1].field1229 * var25 / 4;
                                            int var40 = class229.field4166[var31 - 1].field1217 * var25 / 4;
                                            class229.field4166[var31 - 1].method731(var20, var28 - var40, var38, var39);
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

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lwj;ZI)V")
    public static final void method1010(class6 arg0, boolean arg1, int arg2) {
        if (arg2 > -125) {
            method1015(false, -45, (class86) null);
        }
        int var3 = arg0.field199 == 0 ? arg0.field131 : arg0.field199;
        int var4 = arg0.field114 == 0 ? arg0.field163 : arg0.field114;
        class59.method425(var4, class108.field2070[arg0.field222 >> 16], var3, arg0.field222, arg1, 110);
        if (arg0.field216 != null) {
            class59.method425(var4, arg0.field216, var3, arg0.field222, arg1, -115);
        }
        field2702++;
        class1 var5 = (class1) class1.field15.method1698((long) arg0.field222, (byte) -59);
        if (var5 != null) {
            class49.method380(var3, 104, arg1, var4, var5.field2);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public static final void method1011(int arg0, int arg1) {
        field2690++;
        if (arg0 != 1) {
            field2692 = null;
        }
        class75.field1486.method693(6, arg1);
        class157.field2953.method693(arg0 + 5, arg1);
        class8.field260.method693(6, arg1);
        class255.field4528.method693(6, arg1);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
    public static final void method1012(byte arg0) {
        class135.field2588.method18(-1006);
        if (arg0 != -7) {
            field2692 = null;
        }
        field2704++;
        for (int var1 = 0; var1 < 32; var1++) {
            class34.field783[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class173.field3176[var2] = 0L;
        }
        class274.field4812 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V")
    public static void method1013(byte arg0) {
        if (arg0 >= -26) {
            method1015(false, -92, (class86) null);
        }
        field2698 = null;
        field2691 = null;
        field2699 = null;
        field2689 = null;
        field2692 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2695++;
        if (arg4 == arg6) {
            class44.method356(arg1, arg6, -103, arg5, arg3, arg0, arg7);
            return;
        }
        if (arg2 != 1) {
            method1010((class6) null, false, 51);
        }
        if ((arg0 - arg6) >= class49.field1044 && arg0 + arg6 <= class129.field2473 && arg3 - arg4 >= class50.field1050 && class56.field1143 >= arg3 + arg4) {
            class228.method1591(arg4, 102, arg6, arg0, arg5, arg1, arg3, arg7);
        } else {
            class132.method941(arg5, arg1, arg4, arg7, false, arg3, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZILjd;)V")
    public static final void method1015(boolean arg0, int arg1, class86 arg2) {
        field2701++;
        class86.field1694++;
        class36.field809.method1356(222, arg0);
        class36.field809.method1399((byte) -71, arg2.method622(-2));
        class36.field809.method1411(arg1, (byte) 90);
    }
}
