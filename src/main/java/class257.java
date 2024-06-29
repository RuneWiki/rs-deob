import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class257 extends class53 {

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lda;")
    public static class185 field4094 = null;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "[Ld;")
    public static class238[] field4098;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lj;Z)V")
    public static final void method1755(class165 arg0, boolean arg1) {
        field4095++;
        class237 var2 = null;
        try {
            class163 var3 = arg0.method1136("runescape", (byte) -101);
            while (var3.field2589 == 0) {
                class43.method358(1L, false);
            }
            if (arg1) {
                return;
            }
            if (var3.field2589 == 1) {
                var2 = (class237) var3.field2594;
                class221 var4 = class109.method797((byte) 40);
                var2.method1647(var4.field3655, -17135, 0, var4.field3653);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1646(0);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public static void method1756(int arg0) {
        field4098 = null;
        int var1 = -62 / ((-arg0 - 54) / 49);
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)Z")
    public static final boolean method1757(int arg0) {
        field4097++;
        if (arg0 != -5) {
            method1758(false, (byte) -38, (class22[]) null);
        }
        return class10.field151;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZB[Lwd;)V")
    public static final void method1758(boolean arg0, byte arg1, class22[] arg2) {
        field4096++;
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class201.field3198[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class201.field3198[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method216(2097152, var6, var5);
                            }
                        }
                    }
                }
            }
            class141.field2280 += (int) (Math.random() * 5.0D) - 2;
            class195.field3122 += (int) (Math.random() * 5.0D) - 2;
            if (class141.field2280 < -16) {
                class141.field2280 = -16;
            }
            if (class195.field3122 < -8) {
                class195.field3122 = -8;
            }
            if (class195.field3122 > 8) {
                class195.field3122 = 8;
            }
            if (class141.field2280 > 16) {
                class141.field2280 = 16;
            }
        }
        int[][] var8 = new int[104][104];
        int var9 = class195.field3122 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int var11 = class141.field2280 >> 1;
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class131.field2096[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class124.field2012[var12][var100 + 1][var54] - class124.field2012[var12][var100 - 1][var54];
                    int var103 = class124.field2012[var12][var100][var54 + 1] - class124.field2012[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var51[var100 + 1][var54] >> 3) + (var51[var100 - 1][var54] >> 2) - (-(var51[var100][var54 + -1] >> 2) - (var51[var100][var54 + 1] >> 3) + -(var51[var100][var54] >> 1));
                    int var106 = (var103 << 8) / var104;
                    int var107 = (var102 << 8) / var104;
                    int var108 = -65536 / var104;
                    int var109 = (var107 * -50 + var108 * -10 + (var106 * -50)) / var53 + var101;
                    var10[var100][var54] = var109 - var105;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class288.field4559[var55] = 0;
                class245.field3928[var55] = 0;
                class52.field901[var55] = 0;
                class92.field1521[var55] = 0;
                class126.field2022[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class44.field811[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class236 var96 = class205.method1418(var95 - 1, true);
                            class288.field4559[var85] += var96.field3854;
                            class245.field3928[var85] += var96.field3849;
                            class52.field901[var85] += var96.field3841;
                            class92.field1521[var85] += var96.field3844;
                            var10002 = class126.field2022[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class44.field811[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class236 var99 = class205.method1418(var98 - 1, true);
                            class288.field4559[var85] -= var99.field3854;
                            class245.field3928[var85] -= var99.field3849;
                            class52.field901[var85] -= var99.field3841;
                            class92.field1521[var85] -= var99.field3844;
                            var10002 = class126.field2022[var85]--;
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
                            var87 += class126.field2022[var93];
                            var90 += class288.field4559[var93];
                            var86 += class52.field901[var93];
                            var89 += class92.field1521[var93];
                            var88 += class245.field3928[var93];
                        }
                        if (var92 >= 0) {
                            var90 -= class288.field4559[var92];
                            var89 -= class92.field1521[var92];
                            var86 -= class52.field901[var92];
                            var88 -= class245.field3928[var92];
                            var87 -= class126.field2022[var92];
                        }
                        if (var91 >= 0 && var87 > 0) {
                            var8[var56][var91] = class15.method121(var88 / var87, var86 / var87, (byte) 98, var90 * 256 / var89);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg0 || method1757(-5) || (class201.field3198[0][var57][var58] & 0x2) != 0 || (class201.field3198[var12][var57][var58] & 0x10) == 0 && class1.method12(var12, var57, -79, var58) == class223.field3694) {
                        if (class91.field1495 > var12) {
                            class91.field1495 = var12;
                        }
                        int var59 = class44.field811[var12][var57][var58] & 0xFF;
                        int var60 = class143.field2305[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class124.field2012[var12][var57][var58 + 1];
                            int var62 = class124.field2012[var12][var57 + 1][var58 + 1];
                            int var63 = class124.field2012[var12][var57][var58];
                            int var64 = class124.field2012[var12][var57 + 1][var58];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class5.field60[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class57.method423(var60 - 1, (byte) 90).field813) {
                                    var65 = false;
                                }
                                if (var65 && var63 == var64 && var62 == var63 && var61 == var63) {
                                    class25.field418[var12][var57][var58] = class220.method1495(class25.field418[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var8[var57][var58];
                                int var67 = (var66 & 0x7F) + var11;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var9 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class69.field1149[class144.method987(var68, 96, false)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var10[var57 + 1][var58];
                            int var71 = var10[var57][var58];
                            int var72 = var10[var57 + 1][var58 + 1];
                            int var73 = var10[var57][var58 + 1];
                            if (var60 == 0) {
                                class94.method700(var12, var57, var58, 0, 0, -1, var63, var64, var62, var61, class144.method987(var66, var71, false), class144.method987(var66, var70, false), class144.method987(var66, var72, false), class144.method987(var66, var73, false), 0, 0, 0, 0, var69, 0);
                            } else {
                                byte var74 = class226.field3746[var12][var57][var58];
                                int var75 = class5.field60[var12][var57][var58] + 1;
                                class45 var76 = class57.method423(var60 - 1, (byte) 116);
                                int var77 = var76.field820;
                                if (var77 >= 0 && !class69.field1140.method1115((byte) 83, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = class69.field1149[class230.method1611(false, class69.field1140.method1113(var77, 65535), 96)];
                                    var79 = -1;
                                } else if (var76.field819 == -1) {
                                    var78 = 0;
                                    var79 = -2;
                                } else {
                                    var79 = var76.field819;
                                    int var80 = (var79 & 0x7F) + var11;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var9 + var79 & 0xFC00) + var80 + (var79 & 0x380);
                                    var78 = class69.field1149[class230.method1611(false, var81, 96)];
                                }
                                if (var76.field812 >= 0) {
                                    int var82 = var76.field812;
                                    int var83 = (var82 & 0x7F) + var11;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var9 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var78 = class69.field1149[class230.method1611(false, var84, 96)];
                                }
                                class94.method700(var12, var57, var58, var75, var74, var77, var63, var64, var62, var61, class144.method987(var66, var71, false), class144.method987(var66, var70, false), class144.method987(var66, var72, false), class144.method987(var66, var73, false), class230.method1611(false, var79, var71), class230.method1611(false, var79, var70), class230.method1611(false, var79, var72), class230.method1611(false, var79, var73), var69, var78);
                            }
                        }
                    }
                }
            }
            class44.field811[var12] = null;
            class143.field2305[var12] = null;
            class5.field60[var12] = null;
            class226.field3746[var12] = null;
            class131.field2096[var12] = null;
        }
        if (arg1 >= -63) {
            return;
        }
        class170.method1176(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class201.field3198[1][var13][var50] & 0x2) == 2) {
                    class61.method435(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class25.field418[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var14;
                        int var19 = var14;
                        while (var17 > 0 && (class25.field418[var14][var16][var17 - 1] & 0x1) != 0) {
                            var17--;
                        }
                        int var20;
                        for (var20 = var15; var20 < 104 && (class25.field418[var14][var16][var20 + 1] & 0x1) != 0; var20++) {
                        }
                        label351: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var20; var21++) {
                                if ((class25.field418[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label351;
                                }
                            }
                            var19--;
                        }
                        label340: while (var18 < 3) {
                            for (int var22 = var17; var22 <= var20; var22++) {
                                if ((class25.field418[var18 + 1][var16][var22] & 0x1) == 0) {
                                    break label340;
                                }
                            }
                            var18++;
                        }
                        int var23 = (var18 + 1 - var19) * (var20 + 1 - var17);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class124.field2012[var19][var16][var17];
                            int var26 = class124.field2012[var18][var16][var17] - var24;
                            class26.method232(1, var16 * 128, var16 * 128, var17 * 128, var20 * 128 + 128, var26, var25);
                            for (int var27 = var19; var27 <= var18; var27++) {
                                for (int var28 = var17; var28 <= var20; var28++) {
                                    class25.field418[var27][var16][var28] = class202.method1393(class25.field418[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class25.field418[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30;
                        for (var30 = var16; var30 > 0 && (class25.field418[var14][var30 - 1][var15] & 0x2) != 0; var30--) {
                        }
                        while (var29 < 104 && (class25.field418[var14][var29 + 1][var15] & 0x2) != 0) {
                            var29++;
                        }
                        int var31 = var14;
                        int var32 = var14;
                        label405: while (var31 > 0) {
                            for (int var33 = var30; var33 <= var29; var33++) {
                                if ((class25.field418[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label405;
                                }
                            }
                            var31--;
                        }
                        label394: while (var32 < 3) {
                            for (int var34 = var30; var34 <= var29; var34++) {
                                if ((class25.field418[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label394;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var29 - (var30 - 1)) * (var32 + 1 - var31);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class124.field2012[var31][var30][var15];
                            int var38 = class124.field2012[var32][var30][var15] - var36;
                            class26.method232(2, var30 * 128, var29 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                            for (int var39 = var31; var39 <= var32; var39++) {
                                for (int var40 = var30; var40 <= var29; var40++) {
                                    class25.field418[var39][var40][var15] = class202.method1393(class25.field418[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class25.field418[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43;
                        for (var43 = var15; var43 < 104 && (class25.field418[var14][var16][var43 + 1] & 0x4) != 0; var43++) {
                        }
                        int var44;
                        for (var44 = var15; var44 > 0 && (class25.field418[var14][var16][var44 - 1] & 0x4) != 0; var44--) {
                        }
                        label459: while (var41 > 0) {
                            for (int var45 = var44; var45 <= var43; var45++) {
                                if ((class25.field418[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label459;
                                }
                            }
                            var41--;
                        }
                        label448: while (var42 < 104) {
                            for (int var46 = var44; var46 <= var43; var46++) {
                                if ((class25.field418[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label448;
                                }
                            }
                            var42++;
                        }
                        if ((var43 + 1 - var44) * (var42 + 1 - var41) >= 4) {
                            int var47 = class124.field2012[var14][var41][var44];
                            class26.method232(4, var41 * 128, var42 * 128 + 128, var44 * 128, var43 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var44; var49 <= var43; var49++) {
                                    class25.field418[var14][var48][var49] = class202.method1393(class25.field418[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
