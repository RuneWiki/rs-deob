import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class204 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3493 = 0;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lpj;")
    public static class237 field3491 = class33.method353(")2", 18);

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Lpj;")
    public static class237 field3495 = class33.method353("Schrifts-=tze geladen)3", 95);

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lpj;")
    public static class237 field3489 = class33.method353("l", 27);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3488 = 0;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field3497 = 127;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lge;")
    public static class69 field3492;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
    public static int[] field3496;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method1378(byte arg0) {
        field3496 = null;
        if (arg0 >= -51) {
            method1379(7, (byte) 1, false, 80);
        }
        field3492 = null;
        field3491 = null;
        field3489 = null;
        field3495 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBZI)Lpj;")
    public static final class237 method1379(int arg0, byte arg1, boolean arg2, int arg3) {
        field3494++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 39 % ((8 - arg1) / 62);
        int var5 = 1;
        for (int var6 = arg0 / arg3; var6 != 0; var6 /= arg3) {
            var5++;
        }
        int var7 = var5;
        if (arg0 < 0 || arg2) {
            var7 = var5 + 1;
        }
        byte[] var8 = new byte[var7];
        if (arg0 < 0) {
            var8[0] = 45;
        } else if (arg2) {
            var8[0] = 43;
        }
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = arg0 % arg3;
            arg0 /= arg3;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var8[var7 - var9 - 1] = (byte) (var11 + 48);
        }
        class237 var10 = new class237();
        var10.field4151 = var8;
        var10.field4114 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([Llj;BZ)V")
    public static final void method1380(class25[] arg0, byte arg1, boolean arg2) {
        field3490++;
        if (!arg2) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class73.field1410[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class73.field1410[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg0[var6].method229(var4, var5, 2097152);
                            }
                        }
                    }
                }
            }
            class238.field4170 += (int) (Math.random() * 5.0D) - 2;
            class3.field36 += (int) (Math.random() * 5.0D) - 2;
            if (class238.field4170 < -8) {
                class238.field4170 = -8;
            }
            if (class238.field4170 > 8) {
                class238.field4170 = 8;
            }
            if (class3.field36 < -16) {
                class3.field36 = -16;
            }
            if (class3.field36 > 16) {
                class3.field36 = 16;
            }
        }
        byte var7;
        if (arg2) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        if (arg1 != -6) {
            return;
        }
        int var8 = class238.field4170 >> 2 << 10;
        int var9 = class3.field36 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class148.field2639[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class99.field1773[var12][var100 + 1][var54] - class99.field1773[var12][var100 - 1][var54];
                    int var103 = class99.field1773[var12][var100][var54 + 1] - class99.field1773[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 - (-(var103 * var103) - 65536)));
                    int var105 = -65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var107 * -50 + var105 * -10 + var106 * -50) / var53 + var101;
                    int var109 = (var51[var100][var54 + 1] >> 3) + (var51[var100][var54] >> 1) + (var51[var100][var54 + -1] >> 2) + ((var51[var100 - 1][var54] >> 2) - -(var51[var100 + 1][var54] >> 3));
                    var11[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class64.field1284[var55] = 0;
                class54.field1130[var55] = 0;
                class233.field4029[var55] = 0;
                class65.field1294[var55] = 0;
                field3496[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class25.field446[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class101 var96 = class120.method867((byte) -94, var95 - 1);
                            class64.field1284[var85] += var96.field1797;
                            class54.field1130[var85] += var96.field1796;
                            class233.field4029[var85] += var96.field1794;
                            class65.field1294[var85] += var96.field1791;
                            var10002 = field3496[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class25.field446[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class101 var99 = class120.method867((byte) -82, var98 - 1);
                            class64.field1284[var85] -= var99.field1797;
                            class54.field1130[var85] -= var99.field1796;
                            class233.field4029[var85] -= var99.field1794;
                            class65.field1294[var85] -= var99.field1791;
                            var10002 = field3496[var85]--;
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
                        int var92 = var91 - 5;
                        int var93 = var91 + 5;
                        if (var93 < 104) {
                            var89 += class65.field1294[var93];
                            var90 += field3496[var93];
                            var86 += class54.field1130[var93];
                            var88 += class64.field1284[var93];
                            var87 += class233.field4029[var93];
                        }
                        if (var92 >= 0) {
                            var89 -= class65.field1294[var92];
                            var88 -= class64.field1284[var92];
                            var87 -= class233.field4029[var92];
                            var90 -= field3496[var92];
                            var86 -= class54.field1130[var92];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var10[var56][var91] = class183.method1255(var86 / var90, false, var88 * 256 / var89, var87 / var90);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg2 || class151.method1033((byte) -110) || (class73.field1410[0][var57][var58] & 0x2) != 0 || (class73.field1410[var12][var57][var58] & 0x10) == 0 && class3.method49(var57, var12, var58, -11566) == class214.field3647) {
                        if (var12 < class182.field3209) {
                            class182.field3209 = var12;
                        }
                        int var59 = class25.field446[var12][var57][var58] & 0xFF;
                        int var60 = class3.field26[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class99.field1773[var12][var57 + 1][var58];
                            int var62 = class99.field1773[var12][var57][var58];
                            int var63 = class99.field1773[var12][var57 + 1][var58 + 1];
                            int var64 = class99.field1773[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class218.field3766[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class234.method1558(-24174, var60 - 1).field2375) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var62 == var63 && var62 == var64) {
                                    class70.field1386[var12][var57][var58] = class34.method362(class70.field1386[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var10[var57][var58];
                                int var67 = (var66 & 0x7F) + var9;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var8 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class150.field2677[class20.method203(true, var68, 96)];
                            } else {
                                var66 = -1;
                                var69 = 0;
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58];
                            int var72 = var11[var57][var58 + 1];
                            int var73 = var11[var57 + 1][var58 + 1];
                            if (var60 == 0) {
                                class57.method503(var12, var57, var58, 0, 0, -1, var62, var61, var63, var64, class20.method203(true, var66, var70), class20.method203(true, var66, var71), class20.method203(true, var66, var73), class20.method203(true, var66, var72), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var74 = class218.field3766[var12][var57][var58] + 1;
                                byte var75 = class185.field3250[var12][var57][var58];
                                class137 var76 = class234.method1558(-24174, var60 - 1);
                                int var77 = var76.field2373;
                                if (var77 >= 0 && !class150.field2674.method83(var77, (byte) 109)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var79 = class150.field2677[class211.method1414(96, (byte) 68, class150.field2674.method80((byte) -64, var77))];
                                } else if (var76.field2377 == -1) {
                                    var78 = -2;
                                    var79 = 0;
                                } else {
                                    var78 = var76.field2377;
                                    int var80 = (var78 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var78 & 0x380) + (var8 + var78 & 0xFC00) + var80;
                                    var79 = class150.field2677[class211.method1414(96, (byte) 119, var81)];
                                }
                                if (var76.field2374 >= 0) {
                                    int var82 = var76.field2374;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var8 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var79 = class150.field2677[class211.method1414(96, (byte) 69, var84)];
                                }
                                class57.method503(var12, var57, var58, var74, var75, var77, var62, var61, var63, var64, class20.method203(true, var66, var70), class20.method203(true, var66, var71), class20.method203(true, var66, var73), class20.method203(true, var66, var72), class211.method1414(var70, (byte) 80, var78), class211.method1414(var71, (byte) 107, var78), class211.method1414(var73, (byte) 86, var78), class211.method1414(var72, (byte) 67, var78), var69, var79);
                            }
                        }
                    }
                }
            }
            class25.field446[var12] = null;
            class3.field26[var12] = null;
            class218.field3766[var12] = null;
            class185.field3250[var12] = null;
            class148.field2639[var12] = null;
        }
        class80.method626(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class73.field1410[1][var13][var50] & 0x2) == 2) {
                    class206.method1384(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class70.field1386[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var14;
                        while (var18 < 104 && (class70.field1386[var14][var16][var18 + 1] & 0x1) != 0) {
                            var18++;
                        }
                        int var20 = var14;
                        while (var17 > 0 && (class70.field1386[var14][var16][var17 - 1] & 0x1) != 0) {
                            var17--;
                        }
                        label352: while (var20 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class70.field1386[var20 - 1][var16][var21] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var20--;
                        }
                        label341: while (var19 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class70.field1386[var19 + 1][var16][var22] & 0x1) == 0) {
                                    break label341;
                                }
                            }
                            var19++;
                        }
                        int var23 = (var18 + 1 - var17) * (var19 + 1 - var20);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class99.field1773[var20][var16][var17];
                            int var26 = class99.field1773[var19][var16][var17] - var24;
                            class49.method455(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var26, var25);
                            for (int var27 = var20; var27 <= var19; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class70.field1386[var27][var16][var28] = class272.method1817(class70.field1386[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class70.field1386[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30 = var16;
                        while (var29 > 0 && (class70.field1386[var14][var29 - 1][var15] & 0x2) != 0) {
                            var29--;
                        }
                        while (var30 < 104 && (class70.field1386[var14][var30 + 1][var15] & 0x2) != 0) {
                            var30++;
                        }
                        int var31 = var14;
                        int var32;
                        label406: for (var32 = var14; var32 > 0; var32--) {
                            for (int var33 = var29; var33 <= var30; var33++) {
                                if ((class70.field1386[var32 - 1][var33][var15] & 0x2) == 0) {
                                    break label406;
                                }
                            }
                        }
                        label395: while (var31 < 3) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class70.field1386[var31 + 1][var34][var15] & 0x2) == 0) {
                                    break label395;
                                }
                            }
                            var31++;
                        }
                        int var35 = (var30 + 1 - var29) * (var31 + 1 - var32);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class99.field1773[var31][var29][var15] - var36;
                            int var38 = class99.field1773[var32][var29][var15];
                            class49.method455(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var32; var39 <= var31; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class70.field1386[var39][var40][var15] = class272.method1817(class70.field1386[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class70.field1386[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43;
                        for (var43 = var15; var43 > 0 && (class70.field1386[var14][var16][var43 - 1] & 0x4) != 0; var43--) {
                        }
                        int var44;
                        for (var44 = var15; var44 < 104 && (class70.field1386[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label460: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class70.field1386[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label460;
                                }
                            }
                            var41--;
                        }
                        label449: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class70.field1386[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label449;
                                }
                            }
                            var42++;
                        }
                        if ((var42 + 1 - var41) * (var44 - (var43 - 1)) >= 4) {
                            int var47 = class99.field1773[var14][var41][var43];
                            class49.method455(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class70.field1386[var14][var48][var49] = class272.method1817(class70.field1386[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
