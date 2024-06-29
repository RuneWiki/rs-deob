import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class12 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lom;")
    public static class156 field131 = new class156();

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Llm;")
    public static class210 field139;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "[I")
    public static int[] field135;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)[F", line = 6)
    public static final float[] method67(int arg0, int arg1) {
        field134++;
        float var2 = class280.method1953() + class280.method1950();
        int var3 = class280.method1956();
        class66.field856[3] = 1.0F;
        float var4 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var5 = 0.58823526F;
        float var6 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        class66.field856[0] = var5 * var4 * ((float) (class124.method893(arg1, 16722276) >> 16) / 255.0F) * var2;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        if (arg0 != -1790) {
            field135 = (int[]) null;
        }
        class66.field856[1] = var5 * (float) (class124.method893(arg1, 65368) >> 8) / 255.0F * var6 * var2;
        class66.field856[2] = var2 * (float) class124.method893(arg1, 255) / 255.0F * var7 * var5;
        return class66.field856;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)V", line = 34)
    public static final void method68(byte arg0, int arg1) {
        field137++;
        if (arg0 < 120) {
            method71(-57);
        }
        class246.field3666.method2174(-12634, arg1);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([Lla;ZI)V", line = 45)
    public static final void method69(class191[] arg0, boolean arg1, int arg2) {
        field138++;
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class179.field2645[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class179.field2645[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method1310(var6, arg2 ^ 0x46E6, var5);
                            }
                        }
                    }
                }
            }
            class242.field3629 += (int) (Math.random() * 5.0D) - 2;
            if (class242.field3629 < -8) {
                class242.field3629 = -8;
            }
            class107.field1674 += (int) (Math.random() * 5.0D) - 2;
            if (class242.field3629 > 8) {
                class242.field3629 = 8;
            }
            if (class107.field1674 < -16) {
                class107.field1674 = -16;
            }
            if (class107.field1674 > 16) {
                class107.field1674 = 16;
            }
        }
        int var8 = class242.field3629 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int[][] var10 = new int[104][104];
        int var11 = class107.field1674 >> 1;
        if (arg2 != 18071) {
            return;
        }
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class212.field3225[var12];
            if (!class117.field1817) {
                int var34 = (int) Math.sqrt(5100.0D);
                int var35 = var34 * 768 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        byte var38 = 74;
                        int var39 = class294.field4502[var12][var37][var36 + 1] - class294.field4502[var12][var37][var36 - 1];
                        int var40 = class294.field4502[var12][var37 + 1][var36] - class294.field4502[var12][var37 - 1][var36];
                        int var41 = (int) Math.sqrt((double) (var40 * var40 + (var39 * var39) + 65536));
                        int var42 = (var40 << 8) / var41;
                        int var43 = -65536 / var41;
                        int var44 = (var39 << 8) / var41;
                        int var45 = (var42 * -50 + var43 * -10 + (var44 * -50)) / var35 + var38;
                        int var46 = (var13[var37][var36 + 1] >> 3) + (var13[var37 + 1][var36] >> 3) + ((var13[var37 + -1][var36] >> 2) - -(var13[var37][var36 + -1] >> 2) - -(var13[var37][var36] >> 1));
                        var10[var37][var36] = var45 - var46;
                    }
                }
            } else if (class292.field4447) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        byte var16 = 74;
                        int var17 = (var13[var15 + 1][var14] >> 3) + (var13[var15 - 1][var14] >> 2) + (var13[var15][var14] >> 1) + (var13[var15][var14 + 1] >> 3) + (var13[var15][var14 + -1] >> 2);
                        var10[var15][var14] = var16 - var17;
                    }
                }
            } else {
                int var18 = (int) class280.field4251[1];
                int var19 = (int) class280.field4251[0];
                int var20 = (int) class280.field4251[2];
                int var21 = (int) Math.sqrt((double) (var18 * var18 + var19 * var19 + var20 * var20));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        int var25 = class294.field4502[var12][var24 + 1][var23] - class294.field4502[var12][var24 - 1][var23];
                        byte var26 = 96;
                        int var27 = class294.field4502[var12][var24][var23 + 1] - class294.field4502[var12][var24][var23 - 1];
                        int var28 = (int) Math.sqrt((double) (var25 * var25 + var27 * var27 + 65536));
                        int var29 = (var25 << 8) / var28;
                        int var30 = (var27 << 8) / var28;
                        int var31 = -65536 / var28;
                        int var32 = (var18 * var31 + var19 * var29 + (var20 * var30)) / var22 + var26;
                        int var33 = (var13[var24 + 1][var23] >> 3) + (var13[var24][var23 - 1] >> 2) + (var13[var24][var23 + 1] >> 3) + (var13[var24 + -1][var23] >> 2) + (var13[var24][var23] >> 1);
                        var10[var24][var23] = var32 - ((int) ((float) var33 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class240.field3574[var47] = 0;
                class182.field2716[var47] = 0;
                class87.field1295[var47] = 0;
                class246.field3662[var47] = 0;
                class93.field1396[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class326.field4912[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class304 var52 = class81.method543(true, var51 - 1);
                            class240.field3574[var49] += var52.field4635;
                            class182.field2716[var49] += var52.field4627;
                            class87.field1295[var49] += var52.field4639;
                            class246.field3662[var49] += var52.field4632;
                            var10002 = class93.field1396[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class326.field4912[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class304 var55 = class81.method543(true, var54 - 1);
                            class240.field3574[var49] -= var55.field4635;
                            class182.field2716[var49] -= var55.field4627;
                            class87.field1295[var49] -= var55.field4639;
                            class246.field3662[var49] -= var55.field4632;
                            var10002 = class93.field1396[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 < 104) {
                            var57 += class240.field3574[var63];
                            var58 += class87.field1295[var63];
                            var60 += class93.field1396[var63];
                            var59 += class246.field3662[var63];
                            var56 += class182.field2716[var63];
                        }
                        if (var62 >= 0) {
                            var58 -= class87.field1295[var62];
                            var56 -= class182.field2716[var62];
                            var59 -= class246.field3662[var62];
                            var57 -= class240.field3574[var62];
                            var60 -= class93.field1396[var62];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var9[var48][var61] = class7.method19(var57 * 256 / var59, var58 / var60, var56 / var60, 23674);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label771: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg1 || class80.method540(33) || (class179.field2645[0][var64][var65] & 0x2) != 0 || (class179.field2645[var12][var64][var65] & 0x10) == 0 && class38.method264(var65, var12, 1, var64) == class54.field675) {
                        if (var12 < class311.field4736) {
                            class311.field4736 = var12;
                        }
                        int var66 = class3.field8[var12][var64][var65] & 0xFF;
                        int var67 = class326.field4912[var12][var64][var65] & 0xFF;
                        if (var67 > 0 || var66 > 0) {
                            int var68 = class294.field4502[var12][var64 + 1][var65];
                            int var69 = class294.field4502[var12][var64][var65];
                            int var70 = class294.field4502[var12][var64 + 1][var65 + 1];
                            int var71 = class294.field4502[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var67 == 0 && class144.field2178[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var66 > 0 && !class186.method1278(var66 - 1, true).field1310) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var69 == var70 && var69 == var71) {
                                    class22.field337[var12][var64][var65] = class140.method1009(class22.field337[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var76;
                            if (var67 > 0) {
                                var73 = var9[var64][var65];
                                int var74 = (var73 & 0x7F) + var11;
                                if (var74 < 0) {
                                    var74 = 0;
                                } else if (var74 > 127) {
                                    var74 = 127;
                                }
                                int var75 = (var8 + var73 & 0xFC00) + (var73 & 0x380) + var74;
                                var76 = class148.field2222[class150.method1081(var75, -32, 96)];
                            } else {
                                var73 = -1;
                                var76 = 0;
                            }
                            int var77 = var10[var64][var65];
                            int var78 = var10[var64 + 1][var65];
                            int var79 = var10[var64 + 1][var65 + 1];
                            int var80 = var10[var64][var65 + 1];
                            if (var66 == 0) {
                                class242.method1639(var12, var64, var65, 0, 0, -1, var69, var68, var70, var71, class150.method1081(var73, -81, var77), class150.method1081(var73, -106, var78), class150.method1081(var73, 123, var79), class150.method1081(var73, -66, var80), 0, 0, 0, 0, var76, 0);
                                if (class117.field1817 && var12 > 0 && var73 != -1 && class81.method543(true, var67 - 1).field4626) {
                                    class32.method232(0, 0, true, false, var64, var65, var69 - class294.field4502[0][var64][var65], var68 - class294.field4502[0][var64 + 1][var65], var70 - class294.field4502[0][var64 + 1][var65 + 1], var71 - class294.field4502[0][var64][var65 - -1]);
                                }
                                if (class117.field1817 && !arg1 && class56.field705 != null && var12 == 0) {
                                    for (int var96 = var64 - 1; var96 <= (var64 + 1); var96++) {
                                        for (int var97 = var65 - 1; var97 <= var65 + 1; var97++) {
                                            if ((var64 != var96 || var65 != var97) && var96 >= 0 && var96 < 104 && var97 >= 0 && var97 < 104) {
                                                int var98 = class3.field8[var12][var96][var97] & 0xFF;
                                                if (var98 != 0) {
                                                    class88 var99 = class186.method1278(var98 - 1, true);
                                                    if (var99.field1300 != -1 && class148.field2233.method744(255, var99.field1300) == 4) {
                                                        class56.field705[var64][var65] = (var99.field1297 << 24) + var99.field1308;
                                                        continue label771;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var81 = class144.field2178[var12][var64][var65] + 1;
                                byte var82 = class250.field3730[var12][var64][var65];
                                class88 var83 = class186.method1278(var66 - 1, true);
                                if (class117.field1817 && !arg1 && class56.field705 != null && var12 == 0) {
                                    if (var83.field1300 != -1 && class148.field2233.method744(arg2 ^ 0x4668, var83.field1300) == 4) {
                                        class56.field705[var64][var65] = (var83.field1297 << 24) + var83.field1308;
                                    } else {
                                        label737: for (int var84 = var64 - 1; var84 <= var64 + 1; var84++) {
                                            for (int var85 = var65 - 1; var85 <= (var65 + 1); var85++) {
                                                if ((var64 != var84 || var65 != var85) && var84 >= 0 && var84 < 104 && var85 >= 0 && var85 < 104) {
                                                    int var86 = class3.field8[var12][var84][var85] & 0xFF;
                                                    if (var86 != 0) {
                                                        class88 var87 = class186.method1278(var86 - 1, true);
                                                        if (var87.field1300 != -1 && class148.field2233.method744(255, var87.field1300) == 4) {
                                                            class56.field705[var64][var65] = (var87.field1297 << 24) + var87.field1308;
                                                            break label737;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var88 = var83.field1300;
                                if (var88 >= 0 && !class148.field2233.method746(arg2 ^ 0x4697, var88)) {
                                    var88 = -1;
                                }
                                int var89;
                                int var90;
                                if (var88 >= 0) {
                                    var89 = class148.field2222[class91.method642(class148.field2233.method739(var88, -26067), 96, (byte) 122)];
                                    var90 = -1;
                                } else if (var83.field1309 == -1) {
                                    var89 = 0;
                                    var90 = -2;
                                } else {
                                    var90 = var83.field1309;
                                    int var91 = (var90 & 0x7F) + var11;
                                    if (var91 < 0) {
                                        var91 = 0;
                                    } else if (var91 > 127) {
                                        var91 = 127;
                                    }
                                    int var92 = (var8 + var90 & 0xFC00) + (var90 & 0x380) + var91;
                                    var89 = class148.field2222[class91.method642(var92, 96, (byte) 122)];
                                }
                                if (var83.field1307 >= 0) {
                                    int var93 = var83.field1307;
                                    int var94 = (var93 & 0x7F) + var11;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var8 + var93 & 0xFC00) + (var93 & 0x380) + var94;
                                    var89 = class148.field2222[class91.method642(var95, 96, (byte) 122)];
                                }
                                class242.method1639(var12, var64, var65, var81, var82, var88, var69, var68, var70, var71, class150.method1081(var73, -31, var77), class150.method1081(var73, -34, var78), class150.method1081(var73, 127, var79), class150.method1081(var73, 123, var80), class91.method642(var90, var77, (byte) 122), class91.method642(var90, var78, (byte) 122), class91.method642(var90, var79, (byte) 122), class91.method642(var90, var80, (byte) 122), var76, var89);
                                if (class117.field1817 && var12 > 0) {
                                    class32.method232(var81, var82, var90 == -2 || !var83.field1302, var73 == -1 || !class81.method543(true, var67 - 1).field4626, var64, var65, var69 - class294.field4502[0][var64][var65], -class294.field4502[0][var64 + 1][var65] + var68, var70 - class294.field4502[0][var64 + 1][var65 + 1], -class294.field4502[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class117.field1817) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                int[][] var102 = class294.field4502[var12];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg1) {
                            class86[] var109 = class107.method757(-66, var9, class326.field4912[var12], class250.field3730[var12], var12, class294.field4502[var12], class179.field2645, var101, var10, class144.field2178[var12], var103, class3.field8[var12], var100, class55.field690[0], class56.field705);
                            class172.method1196(var12, var109);
                            break;
                        }
                        class86[] var110 = class107.method757(-84, var9, class326.field4912[var12], class250.field3730[var12], var12, class294.field4502[var12], class179.field2645, var101, var10, class144.field2178[var12], var103, class3.field8[var12], var100, (int[][]) null, (int[][]) null);
                        class86[] var111 = class187.method1281(var103, false, class144.field2178[var12], var101, var100, class326.field4912[var12], var10, class179.field2645, class3.field8[var12], class294.field4502[var12], var12, class250.field3730[var12]);
                        class86[] var112 = new class86[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class172.method1196(var12, var112);
                        class188.method1286(class3.field8[var12], var101, class31.field409, var100, class250.field3730[var12], (byte) -6, var103, var12, class326.field4912[var12], class31.field411, class144.field2178[var12], class294.field4502[var12]);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var102[var105 + 1][var104] - var102[var105 - 1][var104];
                        int var107 = var102[var105][var104 + 1] - var102[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 - (-var107 * var107 - 65536)));
                        var103[var105][var104] = (float) var106 / var108;
                        var100[var105][var104] = -256.0F / var108;
                        var101[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class326.field4912[var12] = (byte[][]) null;
            class3.field8[var12] = (byte[][]) null;
            class144.field2178[var12] = (byte[][]) null;
            class250.field3730[var12] = (byte[][]) null;
            class212.field3225[var12] = (byte[][]) null;
        }
        class318.method2177(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class179.field2645[1][var115][var116] & 0x2) == 2) {
                    class30.method193(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class22.field337[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class22.field337[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121 = var117;
                        int var122;
                        for (var122 = var118; var122 < 104 && (class22.field337[var117][var119][var122 + 1] & 0x1) != 0; var122++) {
                        }
                        label454: while (var121 > 0) {
                            for (int var123 = var120; var123 <= var122; var123++) {
                                if ((class22.field337[var121 - 1][var119][var123] & 0x1) == 0) {
                                    break label454;
                                }
                            }
                            var121--;
                        }
                        int var124;
                        label442: for (var124 = var117; var124 < 3; var124++) {
                            for (int var125 = var120; var125 <= var122; var125++) {
                                if ((class22.field337[var124 + 1][var119][var125] & 0x1) == 0) {
                                    break label442;
                                }
                            }
                        }
                        int var126 = (var124 + 1 - var121) * (var122 + 1 - var120);
                        if (var126 >= 8) {
                            int var127 = class294.field4502[var121][var119][var120];
                            short var128 = 240;
                            int var129 = class294.field4502[var124][var119][var120] - var128;
                            class97.method684(1, var119 * 128, var119 * 128, var120 * 128, var122 * 128 + 128, var129, var127);
                            for (int var130 = var121; var130 <= var124; var130++) {
                                for (int var131 = var120; var131 <= var122; var131++) {
                                    class22.field337[var130][var119][var131] = class124.method893(class22.field337[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class22.field337[var117][var119][var118] & 0x2) != 0) {
                        int var132;
                        for (var132 = var119; var132 > 0 && (class22.field337[var117][var132 - 1][var118] & 0x2) != 0; var132--) {
                        }
                        int var133;
                        for (var133 = var119; var133 < 104 && (class22.field337[var117][var133 + 1][var118] & 0x2) != 0; var133++) {
                        }
                        int var134 = var117;
                        int var135 = var117;
                        label508: while (var134 > 0) {
                            for (int var136 = var132; var136 <= var133; var136++) {
                                if ((class22.field337[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label508;
                                }
                            }
                            var134--;
                        }
                        label497: while (var135 < 3) {
                            for (int var137 = var132; var137 <= var133; var137++) {
                                if ((class22.field337[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label497;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var133 + 1 - var132) * (var135 + 1 - var134);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class294.field4502[var135][var132][var118] - var139;
                            int var141 = class294.field4502[var134][var132][var118];
                            class97.method684(2, var132 * 128, var133 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var134; var142 <= var135; var142++) {
                                for (int var143 = var132; var143 <= var133; var143++) {
                                    class22.field337[var142][var143][var118] = class124.method893(class22.field337[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class22.field337[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146 = var118;
                        int var147;
                        for (var147 = var118; var147 > 0 && (class22.field337[var117][var119][var147 - 1] & 0x4) != 0; var147--) {
                        }
                        while (var146 < 104 && (class22.field337[var117][var119][var146 + 1] & 0x4) != 0) {
                            var146++;
                        }
                        label563: while (var144 > 0) {
                            for (int var148 = var147; var148 <= var146; var148++) {
                                if ((class22.field337[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label563;
                                }
                            }
                            var144--;
                        }
                        label552: while (var145 < 104) {
                            for (int var149 = var147; var149 <= var146; var149++) {
                                if ((class22.field337[var117][var145 + 1][var149] & 0x4) == 0) {
                                    break label552;
                                }
                            }
                            var145++;
                        }
                        if (((var146 + 1 - var147) * (var145 + 1 - var144)) >= 4) {
                            int var150 = class294.field4502[var117][var144][var147];
                            class97.method684(4, var144 * 128, var145 * 128 + 128, var147 * 128, var146 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var145; var151++) {
                                for (int var152 = var147; var152 <= var146; var152++) {
                                    class22.field337[var117][var151][var152] = class124.method893(class22.field337[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 1021)
    public static final void method70(boolean arg0) {
        field130++;
        if (arg0) {
            class278.field4231 = new class329[class138.field2094.method1445(-17371)][];
            class44.field560 = new boolean[class138.field2094.method1445(-17371)];
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 1033)
    public static final void method71(int arg0) {
        field142++;
        if (class144.field2174 == 0 || class144.field2174 == 5) {
            return;
        }
        try {
            if (~(++class216.field3256) < arg0) {
                if (class168.field2517 != null) {
                    class168.field2517.method1138(-16726864);
                    class168.field2517 = null;
                }
                if (class29.field396 >= 1) {
                    class144.field2174 = 0;
                    class170.field2555 = -5;
                    return;
                }
                if (class302.field4614 == class207.field3130) {
                    class302.field4614 = class41.field498;
                } else {
                    class302.field4614 = class207.field3130;
                }
                class216.field3256 = 0;
                class29.field396++;
                class144.field2174 = 1;
            }
            if (class144.field2174 == 1) {
                class224.field3411 = class274.field4200.method1777(class283.field4286, 0, class302.field4614);
                class144.field2174 = 2;
            }
            if (class144.field2174 == 2) {
                if (class224.field3411.field3456 == 2) {
                    throw new IOException();
                }
                if (class224.field3411.field3456 != 1) {
                    return;
                }
                class168.field2517 = new class161((Socket) class224.field3411.field3452, class274.field4200);
                class224.field3411 = null;
                long var1 = class321.field4850 = class242.method1638(class178.field2640, -14393);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class234.field3507.field4025 = 0;
                class234.field3507.method1813(-114, 14);
                class234.field3507.method1813(59, var3);
                class168.field2517.method1134(class234.field3507.field3986, true, 2, 0);
                if (class225.field3426 != null) {
                    class225.field3426.method1241((byte) -128);
                }
                if (class17.field211 != null) {
                    class17.field211.method1241((byte) -105);
                }
                int var4 = class168.field2517.method1141(arg0 + 67281);
                if (class225.field3426 != null) {
                    class225.field3426.method1241((byte) -97);
                }
                if (class17.field211 != null) {
                    class17.field211.method1241((byte) -121);
                }
                if (var4 != 0) {
                    class170.field2555 = var4;
                    class144.field2174 = 0;
                    class168.field2517.method1138(-16726864);
                    class168.field2517 = null;
                    return;
                }
                class144.field2174 = 3;
            }
            if (class144.field2174 == 3) {
                if (class168.field2517.method1137(-2266) < 8) {
                    return;
                }
                class168.field2517.method1142(8, true, class207.field3137.field3986, 0);
                class207.field3137.field4025 = 0;
                int[] var5 = new int[4];
                class163.field2450 = class207.field3137.method1797(-1023818720);
                var5[2] = (int) (class163.field2450 >> 32);
                var5[3] = (int) class163.field2450;
                class234.field3507.field4025 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class234.field3507.method1813(-123, 10);
                class234.field3507.method1815(125, var5[0]);
                class234.field3507.method1815(113, var5[1]);
                class234.field3507.method1815(arg0 + 2082, var5[2]);
                class234.field3507.method1815(121, var5[3]);
                class234.field3507.method1816(class242.method1638(class178.field2640, -14393), arg0 ^ 0xFFFFAA11);
                class234.field3507.method1825(class269.field4123, (byte) -112);
                class234.field3507.method1796(867204152, class96.field1439, class140.field2114);
                class197.field2962.field4025 = 0;
                if (class293.field4490 == 40) {
                    class197.field2962.method1813(113, 18);
                } else {
                    class197.field2962.method1813(105, 16);
                }
                class197.field2962.method1823(class234.field3507.field4025 + class224.method1565((byte) 108, class171.field2569) + 159, (byte) -126);
                class197.field2962.method1815(122, 534);
                class197.field2962.method1813(arg0 + 2062, class74.field966);
                class197.field2962.method1813(28, class176.field2610 ? 1 : 0);
                class197.field2962.method1813(96, 1);
                class197.field2962.method1813(arg0 + 1902, class48.method329((byte) 81));
                class197.field2962.method1823(class136.field2071, (byte) -96);
                class197.field2962.method1823(class251.field3747, (byte) -34);
                class197.field2962.method1813(49, class194.field2902);
                class218.method1498(class197.field2962, 24);
                class197.field2962.method1825(class171.field2569, (byte) 96);
                class197.field2962.method1815(88, class5.field24);
                class197.field2962.method1815(115, class61.method411(true));
                class250.field3726 = true;
                class197.field2962.method1823(class125.field1967, (byte) -93);
                class197.field2962.method1815(arg0 + 2091, class206.field3102.method1434(true));
                class197.field2962.method1815(78, class213.field3228.method1434(true));
                class197.field2962.method1815(arg0 + 2092, class15.field171.method1434(true));
                class197.field2962.method1815(80, class226.field3451.method1434(true));
                class197.field2962.method1815(76, class113.field1744.method1434(true));
                class197.field2962.method1815(102, class222.field3389.method1434(true));
                class197.field2962.method1815(127, class48.field613.method1434(true));
                class197.field2962.method1815(75, class9.field76.method1434(true));
                class197.field2962.method1815(104, class68.field898.method1434(true));
                class197.field2962.method1815(arg0 ^ 0xFFFFF87A, class267.field4100.method1434(true));
                class197.field2962.method1815(arg0 + 2081, class81.field1142.method1434(true));
                class197.field2962.method1815(90, class70.field925.method1434(true));
                class197.field2962.method1815(arg0 ^ 0xFFFFF84D, class125.field1966.method1434(true));
                class197.field2962.method1815(105, class257.field3889.method1434(true));
                class197.field2962.method1815(101, class217.field3287.method1434(true));
                class197.field2962.method1815(95, class261.field3956.method1434(true));
                class197.field2962.method1815(arg0 ^ 0xFFFFF863, class35.field433.method1434(true));
                class197.field2962.method1815(116, class251.field3751.method1434(true));
                class197.field2962.method1815(94, class76.field987.method1434(true));
                class197.field2962.method1815(arg0 ^ 0xFFFFF847, class228.field3465.method1434(true));
                class197.field2962.method1815(126, class168.field2518.method1434(true));
                class197.field2962.method1815(92, class182.field2726.method1434(true));
                class197.field2962.method1815(82, class189.field2820.method1434(true));
                class197.field2962.method1815(109, class49.field620.method1434(true));
                class197.field2962.method1815(111, class16.field180.method1434(true));
                class197.field2962.method1815(85, client.field1948.method1434(true));
                class197.field2962.method1815(80, class321.field4851.method1434(true));
                class197.field2962.method1815(76, class188.field2802.method1434(true));
                class197.field2962.method1814(class234.field3507.field4025, -1157288507, class234.field3507.field3986, 0);
                class168.field2517.method1134(class197.field2962.field3986, true, class197.field2962.field4025, 0);
                class234.field3507.method21(-507079229, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class207.field3137.method21(-507079229, var5);
                class144.field2174 = 4;
            }
            if (class144.field2174 == 4) {
                if (class168.field2517.method1137(arg0 ^ 0xF09) < 1) {
                    return;
                }
                int var7 = class168.field2517.method1141(arg0 ^ 0xFFFF072F);
                if (var7 == 21) {
                    class144.field2174 = 7;
                } else if (var7 == 29) {
                    class144.field2174 = 10;
                } else if (var7 == 1) {
                    class170.field2555 = var7;
                    class144.field2174 = 5;
                    return;
                } else if (var7 == 2) {
                    class144.field2174 = 8;
                } else if (var7 == 15) {
                    class170.field2555 = var7;
                    class144.field2174 = 0;
                    return;
                } else if (var7 == 23 && class29.field396 < 1) {
                    class216.field3256 = 0;
                    class144.field2174 = 1;
                    class29.field396++;
                    class168.field2517.method1138(arg0 ^ 0xFF3C9F);
                    class168.field2517 = null;
                    return;
                } else {
                    class170.field2555 = var7;
                    class144.field2174 = 0;
                    class168.field2517.method1138(-16726864);
                    class168.field2517 = null;
                    return;
                }
            }
            if (class144.field2174 == 6) {
                class234.field3507.field4025 = 0;
                class234.field3507.method28(17, false);
                class168.field2517.method1134(class234.field3507.field3986, true, class234.field3507.field4025, 0);
                class144.field2174 = 4;
                return;
            }
            if (class144.field2174 == 7) {
                if (class168.field2517.method1137(-2266) < 1) {
                    return;
                }
                class247.field3683 = class168.field2517.method1141(65280) * 60 + 180;
                class170.field2555 = 21;
                class144.field2174 = 0;
                class168.field2517.method1138(arg0 - 16724863);
                class168.field2517 = null;
                return;
            }
            if (class144.field2174 == 10) {
                if (class168.field2517.method1137(arg0 ^ 0xF09) < 1) {
                    return;
                }
                class129.field2002 = class168.field2517.method1141(65280);
                class170.field2555 = 29;
                class144.field2174 = 0;
                class168.field2517.method1138(arg0 - 16724863);
                class168.field2517 = null;
                return;
            }
            if (class144.field2174 == 8) {
                if (class168.field2517.method1137(-2266) < 14) {
                    return;
                }
                class168.field2517.method1142(14, true, class207.field3137.field3986, 0);
                class207.field3137.field4025 = 0;
                class192.field2863 = class207.field3137.method1787(false);
                class122.field1909 = class207.field3137.method1787(false);
                class261.field3955 = class207.field3137.method1787(false) == 1;
                class70.field927 = class207.field3137.method1787(false) == 1;
                class130.field2017 = class207.field3137.method1787(false) == 1;
                class154.field2311 = class207.field3137.method1787(false) == 1;
                class278.field4236 = class207.field3137.method1787(false) == 1;
                class234.field3516 = class207.field3137.method1830((byte) -77);
                class283.field4277 = class207.field3137.method1787(false) == 1;
                class36.field443 = class207.field3137.method1787(false) == 1;
                class153.method1096(class36.field443, -29665);
                class250.method1688(class36.field443, arg0 ^ 0x7BB);
                if (!class176.field2610) {
                    if ((!class261.field3955 || class130.field2017) && !class283.field4277) {
                        try {
                            class25.method168("unzap", class274.field4200.field3963, -100);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class25.method168("zap", class274.field4200.field3963, -126);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class217.field3289 = class207.field3137.method20((byte) -17);
                class3.field13 = class207.field3137.method1830((byte) -77);
                class144.field2174 = 9;
            }
            if (class144.field2174 == 9) {
                if (class168.field2517.method1137(-2266) >= class3.field13) {
                    class207.field3137.field4025 = 0;
                    class168.field2517.method1142(class3.field13, true, class207.field3137.field3986, 0);
                    class170.field2555 = 2;
                    class144.field2174 = 0;
                    class271.method1910((byte) -106);
                    class66.field859 = -1;
                    class67.method448(true, false);
                    class217.field3289 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class168.field2517 != null) {
                class168.field2517.method1138(-16726864);
                class168.field2517 = null;
            }
            if (class29.field396 < 1) {
                if (class302.field4614 == class207.field3130) {
                    class302.field4614 = class41.field498;
                } else {
                    class302.field4614 = class207.field3130;
                }
                class144.field2174 = 1;
                class29.field396++;
                class216.field3256 = 0;
            } else {
                class170.field2555 = -4;
                class144.field2174 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)[Lea;", line = 1409)
    public static final class235[] method72(int arg0) {
        field132++;
        if (arg0 != 255) {
            return (class235[]) null;
        }
        class235[] var1 = new class235[class96.field1444];
        for (int var2 = 0; var2 < class96.field1444; var2++) {
            int var3 = class203.field3051[var2] * class160.field2403[var2];
            byte[] var4 = class205.field3083[var2];
            if (class74.field961[var2]) {
                byte[] var7 = class278.field4233[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class140.method1009(class66.field865[class124.method893(255, var4[var9])], class124.method893(-16777216, var7[var9] << 24));
                }
                if (class117.field1817) {
                    var1[var2] = new class50(field136, class132.field2034, class203.field3039[var2], class184.field2754[var2], class203.field3051[var2], class160.field2403[var2], var8);
                } else {
                    var1[var2] = new class215(field136, class132.field2034, class203.field3039[var2], class184.field2754[var2], class203.field3051[var2], class160.field2403[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class66.field865[class124.method893(var4[var6], 255)];
                }
                if (class117.field1817) {
                    var1[var2] = new class303(field136, class132.field2034, class203.field3039[var2], class184.field2754[var2], class203.field3051[var2], class160.field2403[var2], var5);
                } else {
                    var1[var2] = new class127(field136, class132.field2034, class203.field3039[var2], class184.field2754[var2], class203.field3051[var2], class160.field2403[var2], var5);
                }
            }
        }
        class10.method49((byte) 79);
        return var1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 1483)
    public static void method73(byte arg0) {
        field139 = null;
        field135 = null;
        if (arg0 <= -41) {
            field131 = null;
        }
    }
}
