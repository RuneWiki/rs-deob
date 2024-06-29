import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class146 {

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public int field2645 = -1;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field2638 = 0;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lbd;")
    public static class162 field2641 = class17.method142(0, "Ausw-=hlen");

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lbd;")
    public static class162 field2639 = class17.method142(0, "::gc");

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lfb;")
    public class181 field2648;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Z")
    public static boolean field2647;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "[I")
    public int[] field2651;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "[Lbd;")
    public class162[] field2646;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[Lbd;)[Lbd;", line = 17)
    public static final class162[] method1163(int arg0, class162[] arg1) {
        field2643++;
        class162[] var2 = new class162[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = class135.method1062(new class162[] { class156.method1212(class110.method887(arg0, 10), var3), class46.field734 }, true);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class135.method1062(new class162[] { var2[var3], arg1[var3] }, true);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[Lqd;Z)V", line = 44)
    public static final void method1164(int arg0, class179[] arg1, boolean arg2) {
        field2644++;
        if (!arg2) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class213.field3580[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class213.field3580[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg1[var6].method1360(var5, var4, arg0 - 145);
                            }
                        }
                    }
                }
            }
            class51.field820 += (int) (Math.random() * 5.0D) - 2;
            class127.field2305 += (int) (Math.random() * 5.0D) - 2;
            if (class127.field2305 < -8) {
                class127.field2305 = -8;
            }
            if (class51.field820 < -16) {
                class51.field820 = -16;
            }
            if (class127.field2305 > 8) {
                class127.field2305 = 8;
            }
            if (class51.field820 > 16) {
                class51.field820 = 16;
            }
        }
        int var7 = class127.field2305 >> 2 << 10;
        if (arg0 != 105) {
            method1164(115, (class179[]) null, false);
        }
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class51.field820 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var8; var12++) {
            byte[][] var13 = class317.field5341[var12];
            if (!class117.field2159) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        byte var18 = 74;
                        int var19 = class206.field3473[var12][var17 + 1][var16] - class206.field3473[var12][var17 - 1][var16];
                        int var20 = class206.field3473[var12][var17][var16 + 1] - class206.field3473[var12][var17][var16 - 1];
                        int var21 = (int) Math.sqrt((double) (var20 * var20 + var19 * var19 + 65536));
                        int var22 = (var20 << 8) / var21;
                        int var23 = (var13[var17 + 1][var16] >> 3) + (var13[var17 - 1][var16] >> 2) - (-(var13[var17][var16 + -1] >> 2) + -(var13[var17][var16 + 1] >> 3) - (var13[var17][var16] >> 1));
                        int var24 = (var19 << 8) / var21;
                        int var25 = -65536 / var21;
                        int var26 = (var24 * -50 + var25 * -10 + (var22 * -50)) / var15 + var18;
                        var11[var17][var16] = var26 - var23;
                    }
                }
            } else if (class92.field1634) {
                for (int var43 = 1; var43 < 103; var43++) {
                    for (int var44 = 1; var44 < 103; var44++) {
                        byte var45 = 74;
                        int var46 = (var13[var44 - 1][var43] >> 2) + (var13[var44 + 1][var43] >> 3) - (-(var13[var44][var43 + -1] >> 2) - ((var13[var44][var43 + 1] >> 3) - -(var13[var44][var43] >> 1)));
                        var11[var44][var43] = var45 - var46;
                    }
                }
            } else {
                int var27 = (int) class108.field1947[1];
                int var28 = (int) class108.field1947[0];
                int var29 = (int) class108.field1947[2];
                int var30 = (int) Math.sqrt((double) (var27 * var27 + var28 * var28 + (var29 * var29)));
                int var31 = var30 * 1024 >> 8;
                for (int var32 = 1; var32 < 103; var32++) {
                    for (int var33 = 1; var33 < 103; var33++) {
                        int var34 = class206.field3473[var12][var33 + 1][var32] - class206.field3473[var12][var33 - 1][var32];
                        int var35 = class206.field3473[var12][var33][var32 + 1] - class206.field3473[var12][var33][var32 - 1];
                        int var36 = (int) Math.sqrt((double) (var34 * var34 + var35 * var35 + 65536));
                        byte var37 = 96;
                        int var38 = -65536 / var36;
                        int var39 = (var34 << 8) / var36;
                        int var40 = (var35 << 8) / var36;
                        int var41 = (var13[var33][var32 - 1] >> 2) + (var13[var33 - 1][var32] >> 2) + (var13[var33][var32] >> 1) + (var13[var33][var32 - -1] >> 3) + (var13[var33 - -1][var32] >> 3);
                        int var42 = (var28 * var39 + (var27 * var38 + (var29 * var40))) / var31 + var37;
                        var11[var33][var32] = var42 - (int) ((float) var41 * 1.7F);
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class102.field1861[var47] = 0;
                class297.field4977[var47] = 0;
                class129.field2337[var47] = 0;
                class138.field2467[var47] = 0;
                class289.field4860[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class302.field5075[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class49 var52 = class4.method18(var51 - 1, true);
                            class102.field1861[var49] += var52.field785;
                            class297.field4977[var49] += var52.field783;
                            class129.field2337[var49] += var52.field791;
                            class138.field2467[var49] += var52.field781;
                            var10002 = class289.field4860[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class302.field5075[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class49 var55 = class4.method18(var54 - 1, true);
                            class102.field1861[var49] -= var55.field785;
                            class297.field4977[var49] -= var55.field783;
                            class129.field2337[var49] -= var55.field791;
                            class138.field2467[var49] -= var55.field781;
                            var10002 = class289.field4860[var49]--;
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
                            var59 += class289.field4860[var62];
                            var57 += class297.field4977[var62];
                            var60 += class129.field2337[var62];
                            var58 += class138.field2467[var62];
                            var56 += class102.field1861[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var58 -= class138.field2467[var63];
                            var56 -= class102.field1861[var63];
                            var60 -= class129.field2337[var63];
                            var57 -= class297.field4977[var63];
                            var59 -= class289.field4860[var63];
                        }
                        if (var61 >= 0 && var59 > 0) {
                            var10[var48][var61] = class114.method906((byte) 106, var57 / var59, var60 / var59, var56 * 256 / var58);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label772: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg2 || class4.method19(-119) || (class213.field3580[0][var64][var65] & 0x2) != 0 || (class213.field3580[var12][var64][var65] & 0x10) == 0 && class185.method1400(var64, var12, -35, var65) == class245.field4080) {
                        if (var12 < class142.field2543) {
                            class142.field2543 = var12;
                        }
                        int var66 = class302.field5075[var12][var64][var65] & 0xFF;
                        int var67 = class311.field5211[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class206.field3473[var12][var64][var65];
                            int var69 = class206.field3473[var12][var64 + 1][var65 + 1];
                            int var70 = class206.field3473[var12][var64][var65 + 1];
                            int var71 = class206.field3473[var12][var64 + 1][var65];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class274.field4559[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class83.method644(-118, var67 - 1).field4428) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var71 && var68 == var69 && var68 == var70) {
                                    class93.field1648[var12][var64][var65] = class289.method2005(class93.field1648[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = 0;
                                var74 = -1;
                            } else {
                                var74 = var10[var64][var65];
                                int var75 = (var74 & 0x7F) + var9;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var74 & 0x380) + ((var74 + var7 & 0xFC00) + var75);
                                var73 = class312.field5264[class269.method1842(var76, 96, (byte) 41)];
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65 + 1];
                            int var79 = var11[var64 + 1][var65];
                            int var80 = var11[var64][var65 + 1];
                            if (var67 == 0) {
                                class29.method246(var12, var64, var65, 0, 0, -1, var68, var71, var69, var70, class269.method1842(var74, var77, (byte) 41), class269.method1842(var74, var79, (byte) 41), class269.method1842(var74, var78, (byte) 41), class269.method1842(var74, var80, (byte) 41), 0, 0, 0, 0, var73, 0);
                                if (class117.field2159 && var12 > 0 && var74 != -1 && class4.method18(var66 - 1, true).field787) {
                                    class287.method1979(0, 0, true, false, var64, var65, var68 - class206.field3473[0][var64][var65], var71 - class206.field3473[0][var64 + 1][var65], var69 - class206.field3473[0][var64 + 1][var65 + 1], -class206.field3473[0][var64][var65 + 1] + var70);
                                }
                                if (class117.field2159 && !arg2 && class17.field285 != null && var12 == 0) {
                                    for (int var96 = var64 - 1; var96 <= var64 + 1; var96++) {
                                        for (int var97 = var65 - 1; var97 <= (var65 + 1); var97++) {
                                            if ((var64 != var96 || var65 != var97) && var96 >= 0 && var96 < 104 && var97 >= 0 && var97 < 104) {
                                                int var98 = class311.field5211[var12][var96][var97] & 0xFF;
                                                if (var98 != 0) {
                                                    class266 var99 = class83.method644(-116, var98 - 1);
                                                    if (var99.field4439 != -1 && class312.field5271.method158(255, var99.field4439) == 4) {
                                                        class17.field285[var64][var65] = (var99.field4427 << 24) + var99.field4429;
                                                        continue label772;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var81 = class274.field4559[var12][var64][var65] + 1;
                                byte var82 = class135.field2418[var12][var64][var65];
                                class266 var83 = class83.method644(arg0 ^ 0x18, var67 - 1);
                                if (class117.field2159 && !arg2 && class17.field285 != null && var12 == 0) {
                                    if (var83.field4439 != -1 && class312.field5271.method158(arg0 ^ 0x96, var83.field4439) == 4) {
                                        class17.field285[var64][var65] = (var83.field4427 << 24) + var83.field4429;
                                    } else {
                                        label738: for (int var84 = var64 - 1; var84 <= (var64 + 1); var84++) {
                                            for (int var85 = var65 - 1; var85 <= var65 + 1; var85++) {
                                                if ((var64 != var84 || var65 != var85) && var84 >= 0 && var84 < 104 && var85 >= 0 && var85 < 104) {
                                                    int var86 = class311.field5211[var12][var84][var85] & 0xFF;
                                                    if (var86 != 0) {
                                                        class266 var87 = class83.method644(67, var86 - 1);
                                                        if (var87.field4439 != -1 && class312.field5271.method158(255, var87.field4439) == 4) {
                                                            class17.field285[var64][var65] = (var87.field4427 << 24) + var87.field4429;
                                                            break label738;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var88 = var83.field4439;
                                if (var88 >= 0 && !class312.field5271.method153(var88, (byte) 122)) {
                                    var88 = -1;
                                }
                                int var89;
                                int var92;
                                if (var88 >= 0) {
                                    var89 = -1;
                                    var92 = class312.field5264[class89.method679(class312.field5271.method157(var88, false), 96, -103)];
                                } else if (var83.field4426 == -1) {
                                    var89 = -2;
                                    var92 = 0;
                                } else {
                                    var89 = var83.field4426;
                                    int var90 = (var89 & 0x7F) + var9;
                                    if (var90 < 0) {
                                        var90 = 0;
                                    } else if (var90 > 127) {
                                        var90 = 127;
                                    }
                                    int var91 = (var7 + var89 & 0xFC00) + var90 + (var89 & 0x380);
                                    var92 = class312.field5264[class89.method679(var91, 96, arg0 - 212)];
                                }
                                if (var83.field4431 >= 0) {
                                    int var93 = var83.field4431;
                                    int var94 = (var93 & 0x7F) + var9;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var7 + var93 & 0xFC00) + (var93 & 0x380) + var94;
                                    var92 = class312.field5264[class89.method679(var95, 96, -57)];
                                }
                                class29.method246(var12, var64, var65, var81, var82, var88, var68, var71, var69, var70, class269.method1842(var74, var77, (byte) 41), class269.method1842(var74, var79, (byte) 41), class269.method1842(var74, var78, (byte) 41), class269.method1842(var74, var80, (byte) 41), class89.method679(var89, var77, -89), class89.method679(var89, var79, -74), class89.method679(var89, var78, -108), class89.method679(var89, var80, arg0 - 187), var73, var92);
                                if (class117.field2159 && var12 > 0) {
                                    class287.method1979(var81, var82, var89 == -2 || !var83.field4436, var74 == -1 || !class4.method18(var66 - 1, true).field787, var64, var65, var68 - class206.field3473[0][var64][var65], -class206.field3473[0][var64 + 1][var65] + var71, var69 - class206.field3473[0][var64 + 1][var65 + 1], -class206.field3473[0][var64][var65 + 1] + var70);
                                }
                            }
                        }
                    }
                }
            }
            if (class117.field2159) {
                float[][] var100 = new float[105][105];
                int[][] var101 = class206.field3473[var12];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg2) {
                            class26[] var109 = class285.method1968((byte) 126, var10, var100, class311.field5211[var12], class17.field285, class274.field4559[var12], var103, class73.field1166[0], class135.field2418[var12], var102, class213.field3580, class302.field5075[var12], class206.field3473[var12], var11, var12);
                            class34.method273(var12, var109);
                            break;
                        }
                        class26[] var110 = class285.method1968((byte) 126, var10, var100, class311.field5211[var12], (int[][]) null, class274.field4559[var12], var103, (int[][]) null, class135.field2418[var12], var102, class213.field3580, class302.field5075[var12], class206.field3473[var12], var11, var12);
                        class26[] var111 = class222.method1610(var12, class274.field4559[var12], var103, class206.field3473[var12], var102, class311.field5211[var12], var11, class135.field2418[var12], class213.field3580, class302.field5075[var12], var100, 0);
                        class26[] var112 = new class26[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var114 + var110.length] = var111[var114];
                        }
                        class34.method273(var12, var112);
                        class68.method487(class221.field3690, var12, var102, var100, class206.field3473[var12], class311.field5211[var12], class135.field2418[var12], class274.field4559[var12], -126, var103, class221.field3695, class302.field5075[var12]);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var101[var105 + 1][var104] - var101[var105 - 1][var104];
                        int var107 = var101[var105][var104 + 1] - var101[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 + var107 * var107 + 65536));
                        var102[var105][var104] = (float) var106 / var108;
                        var103[var105][var104] = -256.0F / var108;
                        var100[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class302.field5075[var12] = (byte[][]) null;
            class311.field5211[var12] = (byte[][]) null;
            class274.field4559[var12] = (byte[][]) null;
            class135.field2418[var12] = (byte[][]) null;
            class317.field5341[var12] = (byte[][]) null;
        }
        class200.method1496(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class213.field3580[1][var115][var116] & 0x2) == 2) {
                    class244.method1726(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class93.field1648[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class93.field1648[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121;
                        for (var121 = var118; var121 < 104 && (class93.field1648[var117][var119][var121 + 1] & 0x1) != 0; var121++) {
                        }
                        int var122 = var117;
                        int var123 = var117;
                        label455: while (var122 > 0) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class93.field1648[var122 - 1][var119][var124] & 0x1) == 0) {
                                    break label455;
                                }
                            }
                            var122--;
                        }
                        label444: while (var123 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class93.field1648[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label444;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var123 + 1 - var122) * (var121 + 1 - var120);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class206.field3473[var122][var119][var120];
                            int var129 = class206.field3473[var123][var119][var120] - var127;
                            class18.method161(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var129, var128);
                            for (int var130 = var122; var130 <= var123; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class93.field1648[var130][var119][var131] = class92.method695(class93.field1648[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class93.field1648[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var119;
                        int var133 = var119;
                        int var134 = var117;
                        int var135 = var117;
                        while (var132 < 104 && (class93.field1648[var117][var132 + 1][var118] & 0x2) != 0) {
                            var132++;
                        }
                        while (var133 > 0 && (class93.field1648[var117][var133 - 1][var118] & 0x2) != 0) {
                            var133--;
                        }
                        label510: while (var135 > 0) {
                            for (int var136 = var133; var136 <= var132; var136++) {
                                if ((class93.field1648[var135 - 1][var136][var118] & 0x2) == 0) {
                                    break label510;
                                }
                            }
                            var135--;
                        }
                        label499: while (var134 < 3) {
                            for (int var137 = var133; var137 <= var132; var137++) {
                                if ((class93.field1648[var134 + 1][var137][var118] & 0x2) == 0) {
                                    break label499;
                                }
                            }
                            var134++;
                        }
                        int var138 = (var134 - (var135 - 1)) * (var132 + 1 - var133);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class206.field3473[var134][var133][var118] - var139;
                            int var141 = class206.field3473[var135][var133][var118];
                            class18.method161(2, var133 * 128, var132 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var135; var142 <= var134; var142++) {
                                for (int var143 = var133; var143 <= var132; var143++) {
                                    class93.field1648[var142][var143][var118] = class92.method695(class93.field1648[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class93.field1648[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146;
                        for (var146 = var118; var146 > 0 && (class93.field1648[var117][var119][var146 - 1] & 0x4) != 0; var146--) {
                        }
                        int var147;
                        for (var147 = var118; var147 < 104 && (class93.field1648[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        label563: while (var144 > 0) {
                            for (int var148 = var146; var148 <= var147; var148++) {
                                if ((class93.field1648[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label563;
                                }
                            }
                            var144--;
                        }
                        label552: while (var145 < 104) {
                            for (int var149 = var146; var149 <= var147; var149++) {
                                if ((class93.field1648[var117][var145 + 1][var149] & 0x4) == 0) {
                                    break label552;
                                }
                            }
                            var145++;
                        }
                        if (((var145 + 1 - var144) * (var147 + 1 - var146)) >= 4) {
                            int var150 = class206.field3473[var117][var144][var146];
                            class18.method161(4, var144 * 128, var145 * 128 + 128, var146 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var145; var151++) {
                                for (int var152 = var146; var152 <= var147; var152++) {
                                    class93.field1648[var117][var151][var152] = class92.method695(class93.field1648[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 1030)
    public static final void method1165(int arg0, int arg1) {
        class288.field4850.method1538(arg0, (byte) -44);
        field2637++;
        int var2 = 110 / ((-arg1 - 36) / 40);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 1048)
    public static void method1166(int arg0) {
        field2639 = null;
        field2641 = null;
        if (arg0 > -123) {
            method1163(-27, (class162[]) null);
        }
    }
}
