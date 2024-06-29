import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class12 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
    public static int[] field187 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    public static int[] field190 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field191 = -1;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Z")
    public static boolean field188 = false;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[Lil;")
    public static class48[] field193 = new class48[28];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field186 = -1;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public static final void method104(int arg0, int arg1) {
        field189++;
        class140.field2028 = -1;
        field191 = arg0;
        class136.field1967 = arg1;
        class81.method544(35);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ[Lqb;)V")
    public static final void method105(int arg0, boolean arg1, class86[] arg2) {
        if (arg0 != -613927039) {
            return;
        }
        if (!arg1) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class189.field2684[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class189.field2684[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method581(var4, false, var5);
                            }
                        }
                    }
                }
            }
            class163.field2379 += (int) (Math.random() * 5.0D) - 2;
            class32.field477 += (int) (Math.random() * 5.0D) - 2;
            if (class163.field2379 < -16) {
                class163.field2379 = -16;
            }
            if (class32.field477 < -8) {
                class32.field477 = -8;
            }
            if (class32.field477 > 8) {
                class32.field477 = 8;
            }
            if (class163.field2379 > 16) {
                class163.field2379 = 16;
            }
        }
        byte var7;
        if (arg1) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class32.field477 >> 2 << 10;
        field194++;
        int var9 = class163.field2379 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class214.field3077[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class107.field1556[var12][var100 + 1][var54] - class107.field1556[var12][var100 - 1][var54];
                    int var103 = class107.field1556[var12][var100][var54 + 1] - class107.field1556[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = -65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var51[var100][var54 + 1] >> 3) + (var51[var100][var54 - 1] >> 2) + (var51[var100 - -1][var54] >> 3) + (var51[var100 + -1][var54] >> 2) + (var51[var100][var54] >> 1);
                    int var109 = (var107 * -50 + var105 * -50 + var106 * -10) / var53 + var101;
                    var11[var100][var54] = var109 - var108;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class204.field2964[var55] = 0;
                class226.field3401[var55] = 0;
                class268.field4192[var55] = 0;
                class76.field1173[var55] = 0;
                class102.field1531[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class118.field1729[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class279 var96 = class152.method1031(var95 - 1, (byte) -4);
                            class204.field2964[var85] += var96.field4463;
                            class226.field3401[var85] += var96.field4448;
                            class268.field4192[var85] += var96.field4461;
                            class76.field1173[var85] += var96.field4456;
                            var10002 = class102.field1531[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class118.field1729[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class279 var99 = class152.method1031(var98 - 1, (byte) -4);
                            class204.field2964[var85] -= var99.field4463;
                            class226.field3401[var85] -= var99.field4448;
                            class268.field4192[var85] -= var99.field4461;
                            class76.field1173[var85] -= var99.field4456;
                            var10002 = class102.field1531[var85]--;
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
                            var88 += class204.field2964[var92];
                            var87 += class76.field1173[var92];
                            var90 += class226.field3401[var92];
                            var89 += class102.field1531[var92];
                            var86 += class268.field4192[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var87 -= class76.field1173[var93];
                            var88 -= class204.field2964[var93];
                            var89 -= class102.field1531[var93];
                            var90 -= class226.field3401[var93];
                            var86 -= class268.field4192[var93];
                        }
                        if (var91 >= 0 && var89 > 0) {
                            var10[var56][var91] = class95.method643(arg0 + 613927041, var88 * 256 / var87, var86 / var89, var90 / var89);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg1 || class202.method1310(false) || (class189.field2684[0][var57][var58] & 0x2) != 0 || (class189.field2684[var12][var57][var58] & 0x10) == 0 && client.method1442((byte) 114, var12, var58, var57) == class31.field456) {
                        if (var12 < class264.field3988) {
                            class264.field3988 = var12;
                        }
                        int var59 = class118.field1729[var12][var57][var58] & 0xFF;
                        int var60 = class259.field3920[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class107.field1556[var12][var57 + 1][var58];
                            int var62 = class107.field1556[var12][var57 + 1][var58 + 1];
                            int var63 = class107.field1556[var12][var57][var58];
                            int var64 = class107.field1556[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class26.field372[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class221.method1419(38, var60 - 1).field2851) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var63 && var62 == var63 && var63 == var64) {
                                    class98.field1475[var12][var57][var58] = class163.method1093(class98.field1475[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var59 <= 0) {
                                var66 = 0;
                                var67 = -1;
                            } else {
                                var67 = var10[var57][var58];
                                int var68 = (var67 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var67 + var8 & 0xFC00) + (var67 & 0x380) + var68;
                                var66 = class18.field260[class275.method1852(96, var69, arg0 ^ 0xDB6837DD)];
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58];
                            int var72 = var11[var57 + 1][var58 + 1];
                            int var73 = var11[var57][var58 + 1];
                            if (var60 == 0) {
                                class274.method1850(var12, var57, var58, 0, 0, -1, var63, var61, var62, var64, class275.method1852(var70, var67, arg0 + 613927056), class275.method1852(var71, var67, 126), class275.method1852(var72, var67, 90), class275.method1852(var73, var67, arg0 ^ 0xDB6837A2), 0, 0, 0, 0, var66, 0);
                            } else {
                                int var74 = class26.field372[var12][var57][var58] + 1;
                                byte var75 = class175.field2500[var12][var57][var58];
                                class197 var76 = class221.method1419(-117, var60 - 1);
                                int var77 = var76.field2842;
                                if (var77 >= 0 && !class18.field252.method696(var77, true)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var79 = class18.field260[class25.method186(false, class18.field252.method700(var77, (byte) 95), 96)];
                                } else if (var76.field2844 == -1) {
                                    var79 = 0;
                                    var78 = -2;
                                } else {
                                    var78 = var76.field2844;
                                    int var80 = (var78 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var8 + var78 & 0xFC00) + (var78 & 0x380) + var80;
                                    var79 = class18.field260[class25.method186(false, var81, 96)];
                                }
                                if (var76.field2846 >= 0) {
                                    int var82 = var76.field2846;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var82 + var8 & 0xFC00) + (var82 & 0x380) + var83;
                                    var79 = class18.field260[class25.method186(false, var84, 96)];
                                }
                                class274.method1850(var12, var57, var58, var74, var75, var77, var63, var61, var62, var64, class275.method1852(var70, var67, 103), class275.method1852(var71, var67, 21), class275.method1852(var72, var67, arg0 + 613927095), class275.method1852(var73, var67, 77), class25.method186(false, var78, var70), class25.method186(false, var78, var71), class25.method186(false, var78, var72), class25.method186(false, var78, var73), var66, var79);
                            }
                        }
                    }
                }
            }
            class118.field1729[var12] = null;
            class259.field3920[var12] = null;
            class26.field372[var12] = null;
            class175.field2500[var12] = null;
            class214.field3077[var12] = null;
        }
        class66.method454(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class189.field2684[1][var13][var50] & 0x2) == 2) {
                    class155.method1051(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class98.field1475[var14][var16][var15] & 0x1) != 0) {
                        int var17;
                        for (var17 = var15; var17 > 0 && (class98.field1475[var14][var16][var17 - 1] & 0x1) != 0; var17--) {
                        }
                        int var18 = var15;
                        int var19 = var14;
                        int var20 = var14;
                        while (var18 < 104 && (class98.field1475[var14][var16][var18 + 1] & 0x1) != 0) {
                            var18++;
                        }
                        label352: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class98.field1475[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var19--;
                        }
                        label341: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class98.field1475[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label341;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var20 + 1 - var19) * (var18 + 1 - var17);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class107.field1556[var19][var16][var17];
                            int var26 = class107.field1556[var20][var16][var17] - var24;
                            class129.method895(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var26, var25);
                            for (int var27 = var19; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class98.field1475[var27][var16][var28] = class184.method1188(class98.field1475[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class98.field1475[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30 = var14;
                        while (var29 > 0 && (class98.field1475[var14][var29 - 1][var15] & 0x2) != 0) {
                            var29--;
                        }
                        int var31;
                        for (var31 = var16; var31 < 104 && (class98.field1475[var14][var31 + 1][var15] & 0x2) != 0; var31++) {
                        }
                        int var32 = var14;
                        label406: while (var30 > 0) {
                            for (int var33 = var29; var33 <= var31; var33++) {
                                if ((class98.field1475[var30 - 1][var33][var15] & 0x2) == 0) {
                                    break label406;
                                }
                            }
                            var30--;
                        }
                        label395: while (var32 < 3) {
                            for (int var34 = var29; var34 <= var31; var34++) {
                                if ((class98.field1475[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label395;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var31 + 1 - var29) * (var32 + 1 - var30);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class107.field1556[var30][var29][var15];
                            int var38 = class107.field1556[var32][var29][var15] - var36;
                            class129.method895(2, var29 * 128, var31 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                            for (int var39 = var30; var39 <= var32; var39++) {
                                for (int var40 = var29; var40 <= var31; var40++) {
                                    class98.field1475[var39][var40][var15] = class184.method1188(class98.field1475[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class98.field1475[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43;
                        for (var43 = var15; var43 > 0 && (class98.field1475[var14][var16][var43 - 1] & 0x4) != 0; var43--) {
                        }
                        int var44;
                        for (var44 = var15; var44 < 104 && (class98.field1475[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label461: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class98.field1475[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label461;
                                }
                            }
                            var41--;
                        }
                        label450: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class98.field1475[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label450;
                                }
                            }
                            var42++;
                        }
                        if (((var42 + 1 - var41) * (var44 + 1 - var43)) >= 4) {
                            int var47 = class107.field1556[var14][var41][var43];
                            class129.method895(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class98.field1475[var14][var48][var49] = class184.method1188(class98.field1475[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method106(byte arg0) {
        field187 = null;
        int var1 = 78 % ((59 - arg0) / 52);
        field190 = null;
        field193 = null;
    }
}
