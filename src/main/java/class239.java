import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class239 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[[[B")
    public static byte[][][] field4262 = new byte[4][104][104];

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4264 = 0;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lli;")
    public static class185 field4269 = class245.method1649("Benutzen", 123);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field4270 = 0;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4266 = 0;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field4273 = 0;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lli;")
    public static class185 field4271 = class245.method1649("<img=0>", 123);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[[[B")
    public static byte[][][] field4267;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method1621(byte arg0) {
        if (arg0 != -51) {
            method1622(true, (class47[]) null, -6);
        }
        field4262 = null;
        field4271 = null;
        field4267 = null;
        field4269 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z[Lwf;I)V")
    public static final void method1622(boolean arg0, class47[] arg1, int arg2) {
        field4272++;
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((field4262[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((field4262[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg1[var6].method300(var4, -95, var5);
                            }
                        }
                    }
                }
            }
            class18.field293 += (int) (Math.random() * 5.0D) - 2;
            if (class18.field293 < -16) {
                class18.field293 = -16;
            }
            class265.field4694 += (int) (Math.random() * 5.0D) - 2;
            if (class265.field4694 < -8) {
                class265.field4694 = -8;
            }
            if (class265.field4694 > 8) {
                class265.field4694 = 8;
            }
            if (class18.field293 > 16) {
                class18.field293 = 16;
            }
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class18.field293 >> 1;
        int var9 = class265.field4694 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class157.field2981[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    int var101 = class201.field3694[var12][var100 + 1][var54] - class201.field3694[var12][var100 - 1][var54];
                    byte var102 = 74;
                    int var103 = class201.field3694[var12][var100][var54 + 1] - class201.field3694[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var101 * var101 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var101 << 8) / var104;
                    int var107 = -65536 / var104;
                    int var108 = (var51[var100 + 1][var54] >> 3) + (var51[var100][var54] >> 1) + (var51[var100][var54 + 1] >> 3) + (var51[var100][var54 - 1] >> 2) + (var51[var100 + -1][var54] >> 2);
                    int var109 = (var105 * -50 + var106 * -50 + (var107 * -10)) / var53 + var102;
                    var11[var100][var54] = var109 - var108;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class36.field565[var55] = 0;
                class269.field4758[var55] = 0;
                class260.field4615[var55] = 0;
                class106.field1919[var55] = 0;
                class220.field4009[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = field4267[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class228 var96 = class163.method1170(var95 - 1, false);
                            class36.field565[var85] += var96.field4148;
                            class269.field4758[var85] += var96.field4142;
                            class260.field4615[var85] += var96.field4147;
                            class106.field1919[var85] += var96.field4152;
                            var10002 = class220.field4009[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = field4267[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class228 var99 = class163.method1170(var98 - 1, false);
                            class36.field565[var85] -= var99.field4148;
                            class269.field4758[var85] -= var99.field4142;
                            class260.field4615[var85] -= var99.field4147;
                            class106.field1919[var85] -= var99.field4152;
                            var10002 = class220.field4009[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        if (var92 < 104) {
                            var90 += class220.field4009[var92];
                            var89 += class106.field1919[var92];
                            var86 += class36.field565[var92];
                            var87 += class269.field4758[var92];
                            var88 += class260.field4615[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var86 -= class36.field565[var93];
                            var88 -= class260.field4615[var93];
                            var87 -= class269.field4758[var93];
                            var90 -= class220.field4009[var93];
                            var89 -= class106.field1919[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var10[var56][var91] = class255.method1723(var88 / var90, var87 / var90, var86 * 256 / var89, 192);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg0 || class17.method125(35) || (field4262[0][var57][var58] & 0x2) != 0 || (field4262[var12][var57][var58] & 0x10) == 0 && class176.method1244(var57, var58, var12, -108) == class111.field2009) {
                        if (class275.field4882 > var12) {
                            class275.field4882 = var12;
                        }
                        int var59 = field4267[var12][var57][var58] & 0xFF;
                        int var60 = class38.field611[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class201.field3694[var12][var57][var58];
                            int var62 = class201.field3694[var12][var57 + 1][var58];
                            int var63 = class201.field3694[var12][var57 + 1][var58 + 1];
                            int var64 = class201.field3694[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class178.field3253[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class202.method1440(var60 - 1, true).field2091) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class185.field3450[var12][var57][var58] = class21.method150(class185.field3450[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var10[var57][var58];
                                int var67 = (var66 & 0x7F) + var8;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var9 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class167.field3114[class81.method523(96, var68, -25864)];
                            } else {
                                var66 = -1;
                                var69 = 0;
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58];
                            int var72 = var11[var57][var58 + 1];
                            int var73 = var11[var57 + 1][var58 + 1];
                            if (var60 == 0) {
                                class18.method130(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class81.method523(var70, var66, -25864), class81.method523(var71, var66, -25864), class81.method523(var73, var66, -25864), class81.method523(var72, var66, -25864), 0, 0, 0, 0, var69, 0);
                            } else {
                                byte var74 = class235.field4216[var12][var57][var58];
                                int var75 = class178.field3253[var12][var57][var58] + 1;
                                class117 var76 = class202.method1440(var60 - 1, true);
                                int var77 = var76.field2078;
                                if (var77 >= 0 && !class167.field3116.method380(var77, false)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var81;
                                if (var77 >= 0) {
                                    var81 = class167.field3114[class178.method1253(true, 96, class167.field3116.method385(1, var77))];
                                    var78 = -1;
                                } else if (var76.field2093 == -1) {
                                    var81 = 0;
                                    var78 = -2;
                                } else {
                                    var78 = var76.field2093;
                                    int var79 = (var78 & 0x7F) + var8;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 127) {
                                        var79 = 127;
                                    }
                                    int var80 = (var78 + var9 & 0xFC00) + var79 + (var78 & 0x380);
                                    var81 = class167.field3114[class178.method1253(true, 96, var80)];
                                }
                                if (var76.field2089 >= 0) {
                                    int var82 = var76.field2089;
                                    int var83 = (var82 & 0x7F) + var8;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var9 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var81 = class167.field3114[class178.method1253(true, 96, var84)];
                                }
                                class18.method130(var12, var57, var58, var75, var74, var77, var61, var62, var63, var64, class81.method523(var70, var66, -25864), class81.method523(var71, var66, -25864), class81.method523(var73, var66, -25864), class81.method523(var72, var66, -25864), class178.method1253(true, var70, var78), class178.method1253(true, var71, var78), class178.method1253(true, var73, var78), class178.method1253(true, var72, var78), var69, var81);
                            }
                        }
                    }
                }
            }
            field4267[var12] = null;
            class38.field611[var12] = null;
            class178.field3253[var12] = null;
            class235.field4216[var12] = null;
            class157.field2981[var12] = null;
        }
        if (arg2 < 2) {
            method1623(34, -90, 110, 33, 42, -93);
        }
        class223.method1545(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((field4262[1][var13][var50] & 0x2) == 2) {
                    class281.method1918(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class185.field3450[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var15;
                        while (var17 > 0 && (class185.field3450[var14][var16][var17 - 1] & 0x1) != 0) {
                            var17--;
                        }
                        int var19 = var14;
                        int var20 = var14;
                        while (var18 < 104 && (class185.field3450[var14][var16][var18 + 1] & 0x1) != 0) {
                            var18++;
                        }
                        label352: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class185.field3450[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var19--;
                        }
                        label341: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class185.field3450[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label341;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var20 + 1 - var19) * (var18 + 1 - var17);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class201.field3694[var20][var16][var17] - var24;
                            int var26 = class201.field3694[var19][var16][var17];
                            class30.method185(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                            for (int var27 = var19; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class185.field3450[var27][var16][var28] = class220.method1526(class185.field3450[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class185.field3450[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30 = var16;
                        while (var29 < 104 && (class185.field3450[var14][var29 + 1][var15] & 0x2) != 0) {
                            var29++;
                        }
                        int var31 = var14;
                        int var32 = var14;
                        while (var30 > 0 && (class185.field3450[var14][var30 - 1][var15] & 0x2) != 0) {
                            var30--;
                        }
                        label406: while (var31 > 0) {
                            for (int var33 = var30; var33 <= var29; var33++) {
                                if ((class185.field3450[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label406;
                                }
                            }
                            var31--;
                        }
                        label395: while (var32 < 3) {
                            for (int var34 = var30; var34 <= var29; var34++) {
                                if ((class185.field3450[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label395;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var29 + 1 - var30) * (var32 + 1 - var31);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class201.field3694[var31][var30][var15];
                            int var38 = class201.field3694[var32][var30][var15] - var36;
                            class30.method185(2, var30 * 128, var29 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                            for (int var39 = var31; var39 <= var32; var39++) {
                                for (int var40 = var30; var40 <= var29; var40++) {
                                    class185.field3450[var39][var40][var15] = class220.method1526(class185.field3450[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class185.field3450[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43;
                        for (var43 = var15; var43 > 0 && (class185.field3450[var14][var16][var43 - 1] & 0x4) != 0; var43--) {
                        }
                        int var44;
                        for (var44 = var15; var44 < 104 && (class185.field3450[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label460: while (var42 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class185.field3450[var14][var42 - 1][var45] & 0x4) == 0) {
                                    break label460;
                                }
                            }
                            var42--;
                        }
                        label449: while (var41 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class185.field3450[var14][var41 + 1][var46] & 0x4) == 0) {
                                    break label449;
                                }
                            }
                            var41++;
                        }
                        if ((var44 - (var43 - 1)) * (var41 + 1 - var42) >= 4) {
                            int var47 = class201.field3694[var14][var42][var43];
                            class30.method185(4, var42 * 128, var41 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var42; var48 <= var41; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class185.field3450[var14][var48][var49] = class220.method1526(class185.field3450[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
    public static final void method1623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4268++;
        int var6 = arg2;
        class157.method1116(arg3, arg1 - arg5, arg1 - -arg5, class145.field2757[arg4], arg2 ^ 0xFFFFFF8F);
        int var7 = arg5 * arg5;
        int var8 = arg0;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var7 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var7 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg2 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (arg2 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        while (var8 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var6++;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var19 += var16;
                var13 += var17;
                var6++;
                var17 += var16;
            }
            var14 += -var18;
            var18 -= var15;
            var13 += -var20;
            int var21 = arg1 + var6;
            var20 -= var15;
            var8--;
            int var22 = arg1 - var6;
            int var23 = arg4 + var8;
            int var24 = arg4 - var8;
            class157.method1116(arg3, var22, var21, class145.field2757[var24], -43);
            class157.method1116(arg3, var22, var21, class145.field2757[var23], -92);
        }
    }
}
