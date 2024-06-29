import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class251 {

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "J")
    public long field4256 = 0L;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4245 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field4250 = -1;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Z")
    public static boolean field4254 = false;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public int field4240;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public int field4249;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lda;")
    public class312 field4244;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Lda;")
    public class312 field4255;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([[[IZ[Llb;I)V")
    public static final void method1827(int[][][] arg0, boolean arg1, class311[] arg2, int arg3) {
        field4253++;
        byte var4;
        if (arg1) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg1) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class67.field1132[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class67.field1132[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method2104(1, var7, var6);
                            }
                        }
                    }
                }
            }
            class68.field1148 += (int) (Math.random() * 5.0D) - 2;
            if (class68.field1148 < -8) {
                class68.field1148 = -8;
            }
            if (class68.field1148 > 8) {
                class68.field1148 = 8;
            }
            class236.field3989 += (int) (Math.random() * 5.0D) - 2;
            if (class236.field3989 < -16) {
                class236.field3989 = -16;
            }
            if (class236.field3989 > 16) {
                class236.field3989 = 16;
            }
        }
        int var9 = class68.field1148 >> 2 << 10;
        int var10 = class236.field3989 >> 1;
        if (arg3 < 103) {
            return;
        }
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var52 = class4.field115[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class245.field4123[var13][var101 + 1][var55] - class245.field4123[var13][var101 - 1][var55];
                    int var104 = class245.field4123[var13][var101][var55 + 1] - class245.field4123[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104 + 65536));
                    int var106 = (var104 << 8) / var105;
                    int var107 = (var52[var101][var55 + 1] >> 3) + (var52[var101][var55] >> 1) + (var52[var101 - 1][var55] >> 2) + ((var52[var101 + 1][var55] >> 3) - -(var52[var101][var55 + -1] >> 2));
                    int var108 = -65536 / var105;
                    int var109 = (var103 << 8) / var105;
                    int var110 = (var109 * -50 + var106 * -50 + var108 * -10) / var54 + var102;
                    var11[var101][var55] = var110 - var107;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class161.field2617[var56] = 0;
                class238.field4009[var56] = 0;
                class157.field2579[var56] = 0;
                class200.field3221[var56] = 0;
                class176.field2841[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class151.field2519[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class199 var97 = class144.method1061(var96 - 1, (byte) 43);
                            class161.field2617[var86] += var97.field3213;
                            class238.field4009[var86] += var97.field3220;
                            class157.field2579[var86] += var97.field3208;
                            class200.field3221[var86] += var97.field3216;
                            var10002 = class176.field2841[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class151.field2519[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class199 var100 = class144.method1061(var99 - 1, (byte) 43);
                            class161.field2617[var86] -= var100.field3213;
                            class238.field4009[var86] -= var100.field3220;
                            class157.field2579[var86] -= var100.field3208;
                            class200.field3221[var86] -= var100.field3216;
                            var10002 = class176.field2841[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; var92++) {
                        int var93 = var92 - 5;
                        int var94 = var92 + 5;
                        if (var94 < 104) {
                            var91 += class200.field3221[var94];
                            var87 += class161.field2617[var94];
                            var90 += class176.field2841[var94];
                            var88 += class238.field4009[var94];
                            var89 += class157.field2579[var94];
                        }
                        if (var93 >= 0) {
                            var91 -= class200.field3221[var93];
                            var90 -= class176.field2841[var93];
                            var89 -= class157.field2579[var93];
                            var87 -= class161.field2617[var93];
                            var88 -= class238.field4009[var93];
                        }
                        if (var92 >= 0 && var90 > 0) {
                            var12[var57][var92] = class22.method143(var89 / var90, var87 * 256 / var91, var88 / var90, (byte) -78);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg1 || class136.method1011(false) || (class67.field1132[0][var58][var59] & 0x2) != 0 || (class67.field1132[var13][var58][var59] & 0x10) == 0 && class187.method1354(var59, var13, var58, (byte) -114) == class73.field1286) {
                        if (class113.field1933 > var13) {
                            class113.field1933 = var13;
                        }
                        int var60 = class151.field2519[var13][var58][var59] & 0xFF;
                        int var61 = class240.field4056[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class245.field4123[var13][var58][var59];
                            int var63 = class245.field4123[var13][var58 + 1][var59];
                            int var64 = class245.field4123[var13][var58][var59 + 1];
                            int var65 = class245.field4123[var13][var58 + 1][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class46.field811[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class27.method172(var61 - 1, (byte) -79).field4832) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var63 && var62 == var65 && var62 == var64) {
                                    class271.field4516[var13][var58][var59] = class312.method2107(class271.field4516[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (var60 <= 0) {
                                var67 = -1;
                                var68 = 0;
                            } else {
                                var67 = var12[var58][var59];
                                int var69 = (var67 & 0x7F) + var10;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var9 + var67 & 0xFC00) + (var67 & 0x380) + var69;
                                var68 = class128.field2139[class174.method1286((byte) -38, var70, 96)];
                            }
                            int var71 = var11[var58][var59];
                            int var72 = var11[var58 + 1][var59 + 1];
                            int var73 = var11[var58 + 1][var59];
                            int var74 = var11[var58][var59 + 1];
                            if (var61 == 0) {
                                class41.method244(var13, var58, var59, 0, 0, -1, var62, var63, var65, var64, class174.method1286((byte) -38, var67, var71), class174.method1286((byte) -38, var67, var73), class174.method1286((byte) -38, var67, var72), class174.method1286((byte) -38, var67, var74), 0, 0, 0, 0, var68, 0);
                            } else {
                                int var75 = class46.field811[var13][var58][var59] + 1;
                                byte var76 = class119.field2002[var13][var58][var59];
                                class294 var77 = class27.method172(var61 - 1, (byte) -79);
                                int var78 = var77.field4833;
                                if (var78 >= 0 && !class128.field2136.method702(var78, 64)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = class128.field2139[class256.method1844(96, class128.field2136.method703(2213, var78), true)];
                                    var80 = -1;
                                } else if (var77.field4835 == -1) {
                                    var80 = -2;
                                    var79 = 0;
                                } else {
                                    var80 = var77.field4835;
                                    int var81 = (var80 & 0x7F) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var80 & 0x380) + ((var80 + var9 & 0xFC00) + var81);
                                    var79 = class128.field2139[class256.method1844(96, var82, true)];
                                }
                                if (var77.field4830 >= 0) {
                                    int var83 = var77.field4830;
                                    int var84 = (var83 & 0x7F) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var9 + var83 & 0xFC00) + (var83 & 0x380) + var84;
                                    var79 = class128.field2139[class256.method1844(96, var85, true)];
                                }
                                class41.method244(var13, var58, var59, var75, var76, var78, var62, var63, var65, var64, class174.method1286((byte) -38, var67, var71), class174.method1286((byte) -38, var67, var73), class174.method1286((byte) -38, var67, var72), class174.method1286((byte) -38, var67, var74), class256.method1844(var71, var80, true), class256.method1844(var73, var80, true), class256.method1844(var72, var80, true), class256.method1844(var74, var80, true), var68, var79);
                            }
                        }
                    }
                }
            }
            class151.field2519[var13] = null;
            class240.field4056[var13] = null;
            class46.field811[var13] = null;
            class119.field2002[var13] = null;
            class4.field115[var13] = null;
        }
        class161.method1195(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class67.field1132[1][var14][var51] & 0x2) == 2) {
                    class105.method789(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class271.field4516[var15][var17][var16] & 0x1) != 0) {
                        int var18 = var16;
                        int var19;
                        for (var19 = var16; var19 > 0 && (class271.field4516[var15][var17][var19 - 1] & 0x1) != 0; var19--) {
                        }
                        int var20 = var15;
                        while (var18 < 104 && (class271.field4516[var15][var17][var18 + 1] & 0x1) != 0) {
                            var18++;
                        }
                        int var21 = var15;
                        label353: while (var20 > 0) {
                            for (int var22 = var19; var22 <= var18; var22++) {
                                if ((class271.field4516[var20 - 1][var17][var22] & 0x1) == 0) {
                                    break label353;
                                }
                            }
                            var20--;
                        }
                        label342: while (var21 < 3) {
                            for (int var23 = var19; var23 <= var18; var23++) {
                                if ((class271.field4516[var21 + 1][var17][var23] & 0x1) == 0) {
                                    break label342;
                                }
                            }
                            var21++;
                        }
                        int var24 = (var18 + 1 - var19) * (var21 + 1 - var20);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class245.field4123[var21][var17][var19] - var25;
                            int var27 = class245.field4123[var20][var17][var19];
                            class103.method748(1, var17 * 128, var17 * 128, var19 * 128, var18 * 128 + 128, var26, var27);
                            for (int var28 = var20; var28 <= var21; var28++) {
                                for (int var29 = var19; var29 <= var18; var29++) {
                                    class271.field4516[var28][var17][var29] = class15.method84(class271.field4516[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class271.field4516[var15][var17][var16] & 0x2) != 0) {
                        int var30;
                        for (var30 = var17; var30 < 104 && (class271.field4516[var15][var30 + 1][var16] & 0x2) != 0; var30++) {
                        }
                        int var31 = var17;
                        int var32 = var15;
                        while (var31 > 0 && (class271.field4516[var15][var31 - 1][var16] & 0x2) != 0) {
                            var31--;
                        }
                        int var33 = var15;
                        label408: while (var32 > 0) {
                            for (int var34 = var31; var34 <= var30; var34++) {
                                if ((class271.field4516[var32 - 1][var34][var16] & 0x2) == 0) {
                                    break label408;
                                }
                            }
                            var32--;
                        }
                        label397: while (var33 < 3) {
                            for (int var35 = var31; var35 <= var30; var35++) {
                                if ((class271.field4516[var33 + 1][var35][var16] & 0x2) == 0) {
                                    break label397;
                                }
                            }
                            var33++;
                        }
                        int var36 = (var30 + 1 - var31) * (var33 + 1 - var32);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class245.field4123[var33][var31][var16] - var37;
                            int var39 = class245.field4123[var32][var31][var16];
                            class103.method748(2, var31 * 128, var30 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var32; var40 <= var33; var40++) {
                                for (int var41 = var31; var41 <= var30; var41++) {
                                    class271.field4516[var40][var41][var16] = class15.method84(class271.field4516[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class271.field4516[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43;
                        for (var43 = var16; var43 > 0 && (class271.field4516[var15][var17][var43 - 1] & 0x4) != 0; var43--) {
                        }
                        int var44 = var17;
                        int var45;
                        for (var45 = var16; var45 < 104 && (class271.field4516[var15][var17][var45 + 1] & 0x4) != 0; var45++) {
                        }
                        label463: while (var42 > 0) {
                            for (int var46 = var43; var46 <= var45; var46++) {
                                if ((class271.field4516[var15][var42 - 1][var46] & 0x4) == 0) {
                                    break label463;
                                }
                            }
                            var42--;
                        }
                        label452: while (var44 < 104) {
                            for (int var47 = var43; var47 <= var45; var47++) {
                                if ((class271.field4516[var15][var44 + 1][var47] & 0x4) == 0) {
                                    break label452;
                                }
                            }
                            var44++;
                        }
                        if ((var44 + 1 - var42) * (var45 + 1 - var43) >= 4) {
                            int var48 = class245.field4123[var15][var42][var43];
                            class103.method748(4, var42 * 128, var44 * 128 + 128, var43 * 128, var45 * 128 + 128, var48, var48);
                            for (int var49 = var42; var49 <= var44; var49++) {
                                for (int var50 = var43; var50 <= var45; var50++) {
                                    class271.field4516[var15][var49][var50] = class15.method84(class271.field4516[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIII)V")
    public static final void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4251++;
        int var6 = 0;
        int var7 = arg1 * arg1;
        int var8 = arg0 * arg0;
        int var9 = var7 << 1;
        int var10 = var8 << 1;
        int var11 = arg0 << 1;
        int var12 = arg0;
        int var13 = (1 - var11) * var7 + var10;
        int var14 = var8 - ((var11 - 1) * var9);
        int var15 = var8 << 2;
        int var16 = var7 << 2;
        int var17 = ((arg0 << 1) - 3) * var9;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = (var6 + 1) * var15;
        if (class55.field972 <= arg3 && class240.field4053 >= arg3) {
            int var20 = class243.method1742(class23.field423, arg5 - 14804, class272.field4552, arg1 + arg2);
            int var21 = class243.method1742(class23.field423, 0, class272.field4552, arg2 - arg1);
            class134.method996(0, var20, var21, arg4, class41.field630[arg3]);
        }
        int var22 = (arg0 - 1) * var16;
        while (var12 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var14 += var19;
                    var13 += var18;
                    var19 += var15;
                    var18 += var15;
                }
            }
            if (var14 < 0) {
                var6++;
                var13 += var18;
                var18 += var15;
                var14 += var19;
                var19 += var15;
            }
            var14 += -var17;
            var17 -= var16;
            var13 += -var22;
            var12--;
            int var23 = arg3 - var12;
            var22 -= var16;
            int var24 = arg3 + var12;
            if (class55.field972 <= var24 && class240.field4053 >= var23) {
                int var25 = class243.method1742(class23.field423, 0, class272.field4552, arg2 + var6);
                int var26 = class243.method1742(class23.field423, arg5 - 14804, class272.field4552, arg2 - var6);
                if (var23 >= class55.field972) {
                    class134.method996(0, var25, var26, arg4, class41.field630[var23]);
                }
                if (class240.field4053 >= var24) {
                    class134.method996(0, var25, var26, arg4, class41.field630[var24]);
                }
            }
        }
        if (arg5 != 14804) {
            field4250 = 115;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)V")
    public static final void method1829(boolean arg0, int arg1) {
        field4242++;
        byte[][] var2 = class258.field4345;
        if (arg1 != 104) {
            method1830((byte) -100);
        }
        int var3 = class111.field1832.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class184.field2947[var4] & 0xFF) * 64 - class78.field1313;
                int var7 = (class184.field2947[var4] >> 8) * 64 - class26.field462;
                class159.method1187(-659813974);
                class282.method1967(var6, arg0, var7, (byte) -6, var5, class225.field3790);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method1830(byte arg0) {
        if (arg0 < 11) {
            method1829(false, -4);
        }
        field4245 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)I")
    public static final int method1831(byte arg0, int arg1) {
        if (arg0 < 28) {
            return 78;
        } else {
            field4252++;
            return arg1 >>> 8;
        }
    }
}
