import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class43 extends RuntimeException {

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Ljava/lang/String;")
    public String field669;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field668;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static volatile int field672 = 0;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lve;")
    private static class255 field678 = class87.method607(114, "Continue");

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lve;")
    public static class255 field673 = field678;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Z")
    public static boolean field674 = true;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field670 = 0;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "B")
    public static byte field676;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Ltl;")
    public static class197 field680;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[Lud;")
    public static class269[] field671;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "[[[I")
    public static int[][][] field677;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 4)
    public static void method262(int arg0) {
        field677 = (int[][][]) null;
        field673 = null;
        field671 = null;
        if (arg0 != 0) {
            field673 = (class255) null;
        }
        field678 = null;
        field680 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)I", line = 21)
    public static final int method263(byte arg0, int arg1) {
        if (arg0 < 65) {
            field674 = true;
        }
        field679++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 35)
    public static final void method264(int arg0, int arg1) {
        class53 var2 = class303.method2112(arg1 ^ 0x44D883F8, arg0, 11);
        if (arg1 != -104) {
            method264(67, 110);
        }
        field675++;
        var2.method326(arg1 - 22);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([Lhc;IZ)V", line = 53)
    public static final void method265(class163[] arg0, int arg1, boolean arg2) {
        byte var3;
        if (arg2) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        field667++;
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class166.field2800[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class166.field2800[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method1185(var6, var5, (byte) 127);
                            }
                        }
                    }
                }
            }
            class168.field2825 += (int) (Math.random() * 5.0D) - 2;
            if (class168.field2825 < -8) {
                class168.field2825 = -8;
            }
            if (class168.field2825 > 8) {
                class168.field2825 = 8;
            }
            class221.field3719 += (int) (Math.random() * 5.0D) - 2;
            if (class221.field3719 < -16) {
                class221.field3719 = -16;
            }
            if (class221.field3719 > 16) {
                class221.field3719 = 16;
            }
        }
        int var8 = class168.field2825 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int[][] var10 = new int[104][104];
        int var11 = class221.field3719 >> 1;
        int var12 = 0;
        if (arg1 <= 76) {
            return;
        }
        while (var12 < var3) {
            byte[][] var13 = class122.field2037[var12];
            if (!class281.field4827) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        byte var18 = 74;
                        int var19 = class106.field1783[var12][var17 + 1][var16] - class106.field1783[var12][var17 - 1][var16];
                        int var20 = class106.field1783[var12][var17][var16 + 1] - class106.field1783[var12][var17][var16 - 1];
                        int var21 = (int) Math.sqrt((double) (var19 * var19 + var20 * var20 + 65536));
                        int var22 = -65536 / var21;
                        int var23 = (var19 << 8) / var21;
                        int var24 = (var20 << 8) / var21;
                        int var25 = (var24 * -50 + var22 * -10 + var23 * -50) / var15 + var18;
                        int var26 = (var13[var17][var16 - 1] >> 2) + ((var13[var17][var16 + 1] >> 3) + (var13[var17][var16] >> 1)) + (var13[var17 + -1][var16] >> 2) + (var13[var17 + 1][var16] >> 3);
                        var10[var17][var16] = var25 - var26;
                    }
                }
            } else if (class114.field1921) {
                for (int var27 = 1; var27 < 103; var27++) {
                    for (int var28 = 1; var28 < 103; var28++) {
                        byte var29 = 74;
                        int var30 = (var13[var28][var27 + 1] >> 3) + (var13[var28 + 1][var27] >> 3) + ((var13[var28 + -1][var27] >> 2) - (-(var13[var28][var27 + -1] >> 2) + -(var13[var28][var27] >> 1)));
                        var10[var28][var27] = var29 - var30;
                    }
                }
            } else {
                int var31 = (int) class272.field4683[1];
                int var32 = (int) class272.field4683[0];
                int var33 = (int) class272.field4683[2];
                int var34 = (int) Math.sqrt((double) (var33 * var33 + var31 * var31 + var32 * var32));
                int var35 = var34 * 1024 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        int var38 = class106.field1783[var12][var37 + 1][var36] - class106.field1783[var12][var37 - 1][var36];
                        byte var39 = 96;
                        int var40 = class106.field1783[var12][var37][var36 + 1] - class106.field1783[var12][var37][var36 - 1];
                        int var41 = (int) Math.sqrt((double) (var38 * var38 + (var40 * var40) + 65536));
                        int var42 = -65536 / var41;
                        int var43 = (var40 << 8) / var41;
                        int var44 = (var13[var37][var36 + 1] >> 3) + (var13[var37][var36] >> 1) + (var13[var37 - 1][var36] >> 2) + (var13[var37][var36 + -1] >> 2) + (var13[var37 + 1][var36] >> 3);
                        int var45 = (var38 << 8) / var41;
                        int var46 = (var32 * var45 + var31 * var42 + var33 * var43) / var35 + var39;
                        var10[var37][var36] = var46 - ((int) ((float) var44 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class143.field2391[var47] = 0;
                class168.field2827[var47] = 0;
                class125.field2079[var47] = 0;
                class190.field3043[var47] = 0;
                class210.field3579[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class282.field4847[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class277 var52 = class58.method356((byte) 117, var51 - 1);
                            class143.field2391[var49] += var52.field4755;
                            class168.field2827[var49] += var52.field4759;
                            class125.field2079[var49] += var52.field4762;
                            class190.field3043[var49] += var52.field4747;
                            var10002 = class210.field3579[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class282.field4847[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class277 var55 = class58.method356((byte) 34, var54 - 1);
                            class143.field2391[var49] -= var55.field4755;
                            class168.field2827[var49] -= var55.field4759;
                            class125.field2079[var49] -= var55.field4762;
                            class190.field3043[var49] -= var55.field4747;
                            var10002 = class210.field3579[var49]--;
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
                        int var62 = var61 + 5;
                        if (var62 < 104) {
                            var60 += class190.field3043[var62];
                            var58 += class125.field2079[var62];
                            var57 += class168.field2827[var62];
                            var59 += class210.field3579[var62];
                            var56 += class143.field2391[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var57 -= class168.field2827[var63];
                            var59 -= class210.field3579[var63];
                            var56 -= class143.field2391[var63];
                            var58 -= class125.field2079[var63];
                            var60 -= class190.field3043[var63];
                        }
                        if (var61 >= 0 && var59 > 0) {
                            var9[var48][var61] = class279.method1944(var58 / var59, var56 * 256 / var60, var57 / var59, 4);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label769: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg2 || class96.method761(true) || (class166.field2800[0][var64][var65] & 0x2) != 0 || (class166.field2800[var12][var64][var65] & 0x10) == 0 && class67.method409(var65, var12, false, var64) == class87.field1415) {
                        if (var12 < class265.field4484) {
                            class265.field4484 = var12;
                        }
                        int var66 = class282.field4847[var12][var64][var65] & 0xFF;
                        int var67 = class159.field2685[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class106.field1783[var12][var64][var65];
                            int var69 = class106.field1783[var12][var64 + 1][var65];
                            int var70 = class106.field1783[var12][var64 + 1][var65 + 1];
                            int var71 = class106.field1783[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class220.field3704[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class167.method1216(var67 - 1, (byte) -84).field4972) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var68 == var70 && var68 == var71) {
                                    class291.field5003[var12][var64][var65] = class264.method1836(class291.field5003[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = -1;
                                var74 = 0;
                            } else {
                                var73 = var9[var64][var65];
                                int var75 = (var73 & 0x7F) + var11;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var73 + var8 & 0xFC00) + (var73 & 0x380) + var75;
                                var74 = class283.field4865[class143.method1065(96, false, var76)];
                            }
                            int var77 = var10[var64][var65];
                            int var78 = var10[var64 + 1][var65];
                            int var79 = var10[var64 + 1][var65 + 1];
                            int var80 = var10[var64][var65 + 1];
                            if (var67 == 0) {
                                class198.method1424(var12, var64, var65, 0, 0, -1, var68, var69, var70, var71, class143.method1065(var77, false, var73), class143.method1065(var78, false, var73), class143.method1065(var79, false, var73), class143.method1065(var80, false, var73), 0, 0, 0, 0, var74, 0);
                                if (class281.field4827 && var12 > 0 && var73 != -1 && class58.method356((byte) 51, var66 - 1).field4757) {
                                    class35.method201(0, 0, true, false, var64, var65, var68 - class106.field1783[0][var64][var65], -class106.field1783[0][var64 + 1][var65] + var69, var70 - class106.field1783[0][var64 + 1][var65 + 1], -class106.field1783[0][var64][var65 - -1] + var71);
                                }
                                if (class281.field4827 && !arg2 && class118.field1982 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= (var64 + 1); var81++) {
                                        for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class159.field2685[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class289 var84 = class167.method1216(var83 - 1, (byte) 8);
                                                    if (var84.field4963 != -1 && class283.field4866.method979(186, var84.field4963) == 4) {
                                                        class118.field1982[var64][var65] = (var84.field4970 << 24) + var84.field4976;
                                                        continue label769;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var85 = class220.field3704[var12][var64][var65] + 1;
                                byte var86 = class248.field4156[var12][var64][var65];
                                class289 var87 = class167.method1216(var67 - 1, (byte) 126);
                                if (class281.field4827 && !arg2 && class118.field1982 != null && var12 == 0) {
                                    if (var87.field4963 != -1 && class283.field4866.method979(186, var87.field4963) == 4) {
                                        class118.field1982[var64][var65] = (var87.field4970 << 24) + var87.field4976;
                                    } else {
                                        label750: for (int var88 = var64 - 1; var88 <= (var64 + 1); var88++) {
                                            for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class159.field2685[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class289 var91 = class167.method1216(var90 - 1, (byte) -52);
                                                        if (var91.field4963 != -1 && class283.field4866.method979(186, var91.field4963) == 4) {
                                                            class118.field1982[var64][var65] = (var91.field4970 << 24) + var91.field4976;
                                                            break label750;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field4963;
                                if (var92 >= 0 && !class283.field4866.method991((byte) 101, var92)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var94;
                                if (var92 >= 0) {
                                    var93 = class283.field4865[class287.method2032(true, 96, class283.field4866.method982(var92, true))];
                                    var94 = -1;
                                } else if (var87.field4969 == -1) {
                                    var94 = -2;
                                    var93 = 0;
                                } else {
                                    var94 = var87.field4969;
                                    int var95 = (var94 & 0x7F) + var11;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var8 + var94 & 0xFC00) + (var94 & 0x380) + var95;
                                    var93 = class283.field4865[class287.method2032(true, 96, var96)];
                                }
                                if (var87.field4977 >= 0) {
                                    int var97 = var87.field4977;
                                    int var98 = (var97 & 0x7F) + var11;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var97 + var8 & 0xFC00) + (var97 & 0x380) + var98;
                                    var93 = class283.field4865[class287.method2032(true, 96, var99)];
                                }
                                class198.method1424(var12, var64, var65, var85, var86, var92, var68, var69, var70, var71, class143.method1065(var77, false, var73), class143.method1065(var78, false, var73), class143.method1065(var79, false, var73), class143.method1065(var80, false, var73), class287.method2032(true, var77, var94), class287.method2032(true, var78, var94), class287.method2032(true, var79, var94), class287.method2032(true, var80, var94), var74, var93);
                                if (class281.field4827 && var12 > 0) {
                                    class35.method201(var85, var86, var94 == -2 || !var87.field4978, var73 == -1 || !class58.method356((byte) 66, var66 - 1).field4757, var64, var65, var68 - class106.field1783[0][var64][var65], var69 - class106.field1783[0][var64 + 1][var65], var70 - class106.field1783[0][var64 + 1][var65 + 1], -class106.field1783[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class281.field4827) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                int[][] var102 = class106.field1783[var12];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg2) {
                            class142[] var109 = class195.method1397(var10, field677[0], class282.field4847[var12], var103, var9, class106.field1783[var12], class220.field3704[var12], class166.field2800, class118.field1982, var12, var101, 1, class248.field4156[var12], class159.field2685[var12], var100);
                            class168.method1219(var12, var109);
                            break;
                        }
                        class142[] var110 = class195.method1397(var10, (int[][]) null, class282.field4847[var12], var103, var9, class106.field1783[var12], class220.field3704[var12], class166.field2800, (int[][]) null, var12, var101, 1, class248.field4156[var12], class159.field2685[var12], var100);
                        class142[] var111 = class84.method587(var10, class166.field2800, -1, var101, class106.field1783[var12], var12, class159.field2685[var12], var103, class248.field4156[var12], class220.field3704[var12], var100, class282.field4847[var12]);
                        class142[] var112 = new class142[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class168.method1219(var12, var112);
                        class208.method1499(class248.field4156[var12], -126, class159.field2685[var12], var12, class282.field4847[var12], var101, class164.field2769, var100, class220.field3704[var12], var103, class164.field2775, class106.field1783[var12]);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var102[var105 + 1][var104] - var102[var105 - 1][var104];
                        int var107 = var102[var105][var104 + 1] - var102[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var107 * var107 + var106 * var106 + 65536));
                        var100[var105][var104] = (float) var106 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var103[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class282.field4847[var12] = (byte[][]) null;
            class159.field2685[var12] = (byte[][]) null;
            class220.field3704[var12] = (byte[][]) null;
            class248.field4156[var12] = (byte[][]) null;
            class122.field2037[var12] = (byte[][]) null;
            var12++;
        }
        class256.method1794(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class166.field2800[1][var115][var116] & 0x2) == 2) {
                    class153.method1129(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class291.field5003[var117][var119][var118] & 0x1) != 0) {
                        int var120 = var118;
                        int var121 = var118;
                        while (var120 > 0 && (class291.field5003[var117][var119][var120 - 1] & 0x1) != 0) {
                            var120--;
                        }
                        int var122 = var117;
                        while (var121 < 104 && (class291.field5003[var117][var119][var121 + 1] & 0x1) != 0) {
                            var121++;
                        }
                        int var123 = var117;
                        label449: while (var122 > 0) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class291.field5003[var122 - 1][var119][var124] & 0x1) == 0) {
                                    break label449;
                                }
                            }
                            var122--;
                        }
                        label438: while (var123 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class291.field5003[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label438;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var123 + 1 - var122) * (var121 + 1 - var120);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class106.field1783[var122][var119][var120];
                            int var129 = class106.field1783[var123][var119][var120] - var127;
                            class24.method130(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var129, var128);
                            for (int var130 = var122; var130 <= var123; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class291.field5003[var130][var119][var131] = class154.method1134(class291.field5003[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class291.field5003[var117][var119][var118] & 0x2) != 0) {
                        int var132;
                        for (var132 = var119; var132 > 0 && (class291.field5003[var117][var132 - 1][var118] & 0x2) != 0; var132--) {
                        }
                        int var133;
                        for (var133 = var119; var133 < 104 && (class291.field5003[var117][var133 + 1][var118] & 0x2) != 0; var133++) {
                        }
                        int var134;
                        label505: for (var134 = var117; var134 > 0; var134--) {
                            for (int var135 = var132; var135 <= var133; var135++) {
                                if ((class291.field5003[var134 - 1][var135][var118] & 0x2) == 0) {
                                    break label505;
                                }
                            }
                        }
                        int var136;
                        label493: for (var136 = var117; var136 < 3; var136++) {
                            for (int var137 = var132; var137 <= var133; var137++) {
                                if ((class291.field5003[var136 + 1][var137][var118] & 0x2) == 0) {
                                    break label493;
                                }
                            }
                        }
                        int var138 = (var136 + 1 - var134) * (var133 + 1 - var132);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class106.field1783[var136][var132][var118] - var139;
                            int var141 = class106.field1783[var134][var132][var118];
                            class24.method130(2, var132 * 128, var133 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var134; var142 <= var136; var142++) {
                                for (int var143 = var132; var143 <= var133; var143++) {
                                    class291.field5003[var142][var143][var118] = class154.method1134(class291.field5003[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class291.field5003[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145;
                        for (var145 = var118; var145 > 0 && (class291.field5003[var117][var119][var145 - 1] & 0x4) != 0; var145--) {
                        }
                        int var146 = var119;
                        int var147;
                        for (var147 = var118; var147 < 104 && (class291.field5003[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        label560: while (var144 > 0) {
                            for (int var148 = var145; var148 <= var147; var148++) {
                                if ((class291.field5003[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label560;
                                }
                            }
                            var144--;
                        }
                        label549: while (var146 < 104) {
                            for (int var149 = var145; var149 <= var147; var149++) {
                                if ((class291.field5003[var117][var146 + 1][var149] & 0x4) == 0) {
                                    break label549;
                                }
                            }
                            var146++;
                        }
                        if ((var146 + 1 - var144) * (var147 + 1 - var145) >= 4) {
                            int var150 = class106.field1783[var117][var144][var145];
                            class24.method130(4, var144 * 128, var146 * 128 + 128, var145 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var146; var151++) {
                                for (int var152 = var145; var152 <= var147; var152++) {
                                    class291.field5003[var117][var151][var152] = class154.method1134(class291.field5003[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 1020)
    public class43(Throwable arg0, String arg1) {
        this.field669 = arg1;
        this.field668 = arg0;
    }
}
