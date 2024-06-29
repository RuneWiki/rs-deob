import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class49 {

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public int field816 = -1;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lqd;")
    public static class173 field811 = new class173(2);

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field813 = 0;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lmk;")
    public class228 field807;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "[I")
    public int[] field812;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "[Lag;")
    public static class211[] field817;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field808;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIZI)V")
    public static final void method345(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        class13.field137 = (short) arg2;
        class292.field4688 = (short) arg3;
        if (arg5 < -25) {
            field806++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Led;")
    public static final class50 method346(int arg0, byte arg1) {
        field809++;
        class50 var2 = (class50) class213.field3529.method1261(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 6) {
            field813 = 74;
        }
        byte[] var3 = class195.field3158.method1680(arg0, 36, -85);
        class50 var4 = new class50();
        var4.field834 = arg0;
        if (var3 != null) {
            var4.method349(new class162(var3), -114);
        }
        class213.field3529.method1264(-1, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method347(int arg0) {
        if (arg0 < 113) {
            field814 = -123;
        }
        field811 = null;
        field817 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([Lpk;BZ[[[I)V")
    public static final void method348(class44[] arg0, byte arg1, boolean arg2, int[][][] arg3) {
        field810++;
        byte var4;
        if (arg2) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg2) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class301.field4818[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class301.field4818[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method299(var7, (byte) 14, var6);
                            }
                        }
                    }
                }
            }
            class162.field2579 += (int) (Math.random() * 5.0D) - 2;
            if (class162.field2579 < -8) {
                class162.field2579 = -8;
            }
            if (class162.field2579 > 8) {
                class162.field2579 = 8;
            }
            class70.field1185 += (int) (Math.random() * 5.0D) - 2;
            if (class70.field1185 < -16) {
                class70.field1185 = -16;
            }
            if (class70.field1185 > 16) {
                class70.field1185 = 16;
            }
        }
        int var9 = class162.field2579 >> 2 << 10;
        int var10 = class70.field1185 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var52 = class224.field3644[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class267.field4304[var13][var101][var55 + 1] - class267.field4304[var13][var101][var55 - 1];
                    int var104 = class267.field4304[var13][var101 + 1][var55] - class267.field4304[var13][var101 - 1][var55];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var104 << 8) / var105;
                    int var107 = -65536 / var105;
                    int var108 = (var103 << 8) / var105;
                    int var109 = (var108 * -50 + (var106 * -50 + (var107 * -10))) / var54 + var102;
                    int var110 = (var52[var101 + 1][var55] >> 3) + (var52[var101 - 1][var55] >> 2) + (var52[var101][var55 - 1] >> 2) + (var52[var101][var55 + 1] >> 3) + (var52[var101][var55] >> 1);
                    var12[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class62.field1023[var56] = 0;
                class155.field2418[var56] = 0;
                class126.field1994[var56] = 0;
                class132.field2079[var56] = 0;
                class131.field2059[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class263.field4225[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class144 var97 = class193.method1364(var96 - 1, -110);
                            class62.field1023[var86] += var97.field2287;
                            class155.field2418[var86] += var97.field2284;
                            class126.field1994[var86] += var97.field2279;
                            class132.field2079[var86] += var97.field2272;
                            var10002 = class131.field2059[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class263.field4225[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class144 var100 = class193.method1364(var99 - 1, -119);
                            class62.field1023[var86] -= var100.field2287;
                            class155.field2418[var86] -= var100.field2284;
                            class126.field1994[var86] -= var100.field2279;
                            class132.field2079[var86] -= var100.field2272;
                            var10002 = class131.field2059[var86]--;
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
                            var88 += class126.field1994[var94];
                            var91 += class131.field2059[var94];
                            var90 += class62.field1023[var94];
                            var89 += class132.field2079[var94];
                            var87 += class155.field2418[var94];
                        }
                        if (var93 >= 0) {
                            var90 -= class62.field1023[var93];
                            var87 -= class155.field2418[var93];
                            var88 -= class126.field1994[var93];
                            var91 -= class131.field2059[var93];
                            var89 -= class132.field2079[var93];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var11[var57][var92] = class218.method1508(var87 / var91, var88 / var91, -113, var90 * 256 / var89);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg2 || class129.method918(false) || (class301.field4818[0][var58][var59] & 0x2) != 0 || (class301.field4818[var13][var58][var59] & 0x10) == 0 && class131.method926((byte) -7, var59, var58, var13) == class287.field4606) {
                        if (var13 < class55.field905) {
                            class55.field905 = var13;
                        }
                        int var60 = class263.field4225[var13][var58][var59] & 0xFF;
                        int var61 = class79.field1316[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class267.field4304[var13][var58][var59];
                            int var63 = class267.field4304[var13][var58 + 1][var59];
                            int var64 = class267.field4304[var13][var58 + 1][var59 + 1];
                            int var65 = class267.field4304[var13][var58][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class308.field4929[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class26.method149((byte) 65, var61 - 1).field3261) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var63 && var62 == var64 && var62 == var65) {
                                    class293.field4703[var13][var58][var59] = class173.method1263(class293.field4703[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (var60 > 0) {
                                var67 = var11[var58][var59];
                                int var68 = (var67 & 0x7F) + var10;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var67 & 0x380) + (var9 + var67 & 0xFC00) + var68;
                                var70 = class302.field4819[class63.method442(-127, var69, 96)];
                            } else {
                                var67 = -1;
                                var70 = 0;
                            }
                            int var71 = var12[var58 + 1][var59];
                            int var72 = var12[var58][var59];
                            int var73 = var12[var58 + 1][var59 + 1];
                            int var74 = var12[var58][var59 + 1];
                            if (var61 == 0) {
                                class57.method393(var13, var58, var59, 0, 0, -1, var62, var63, var64, var65, class63.method442(-82, var67, var72), class63.method442(-97, var67, var71), class63.method442(-84, var67, var73), class63.method442(-79, var67, var74), 0, 0, 0, 0, var70, 0);
                            } else {
                                byte var75 = class301.field4814[var13][var58][var59];
                                int var76 = class308.field4929[var13][var58][var59] + 1;
                                class205 var77 = class26.method149((byte) 65, var61 - 1);
                                int var78 = var77.field3263;
                                if (var78 >= 0 && !class302.field4828.method107(126, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var80 = class302.field4819[class41.method271(96, class302.field4828.method113(var78, (byte) -108), -106)];
                                    var79 = -1;
                                } else if (var77.field3259 == -1) {
                                    var79 = -2;
                                    var80 = 0;
                                } else {
                                    var79 = var77.field3259;
                                    int var81 = (var79 & 0x7F) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var9 + var79 & 0xFC00) + (var79 & 0x380) + var81;
                                    var80 = class302.field4819[class41.method271(96, var82, -98)];
                                }
                                if (var77.field3268 >= 0) {
                                    int var83 = var77.field3268;
                                    int var84 = (var83 & 0x7F) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var83 & 0x380) + (var83 + var9 & 0xFC00) + var84;
                                    var80 = class302.field4819[class41.method271(96, var85, -128)];
                                }
                                class57.method393(var13, var58, var59, var76, var75, var78, var62, var63, var64, var65, class63.method442(-72, var67, var72), class63.method442(-111, var67, var71), class63.method442(-115, var67, var73), class63.method442(-94, var67, var74), class41.method271(var72, var79, -112), class41.method271(var71, var79, -118), class41.method271(var73, var79, -126), class41.method271(var74, var79, -120), var70, var80);
                            }
                        }
                    }
                }
            }
            class263.field4225[var13] = null;
            class79.field1316[var13] = null;
            class308.field4929[var13] = null;
            class301.field4814[var13] = null;
            class224.field3644[var13] = null;
        }
        class18.method88(-50, -10, -50);
        if (!arg2) {
            for (int var14 = 0; var14 < 104; var14++) {
                for (int var51 = 0; var51 < 104; var51++) {
                    if ((class301.field4818[1][var14][var51] & 0x2) == 2) {
                        class66.method466(var14, var51);
                    }
                }
            }
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    for (int var17 = 0; var17 <= 104; var17++) {
                        if ((class293.field4703[var15][var17][var16] & 0x1) != 0) {
                            int var18;
                            for (var18 = var16; var18 > 0 && (class293.field4703[var15][var17][var18 - 1] & 0x1) != 0; var18--) {
                            }
                            int var19;
                            for (var19 = var16; var19 < 104 && (class293.field4703[var15][var17][var19 + 1] & 0x1) != 0; var19++) {
                            }
                            int var20 = var15;
                            int var21;
                            label351: for (var21 = var15; var21 > 0; var21--) {
                                for (int var22 = var18; var22 <= var19; var22++) {
                                    if ((class293.field4703[var21 - 1][var17][var22] & 0x1) == 0) {
                                        break label351;
                                    }
                                }
                            }
                            label340: while (var20 < 3) {
                                for (int var23 = var18; var23 <= var19; var23++) {
                                    if ((class293.field4703[var20 + 1][var17][var23] & 0x1) == 0) {
                                        break label340;
                                    }
                                }
                                var20++;
                            }
                            int var24 = (var19 + 1 - var18) * (var20 + 1 - var21);
                            if (var24 >= 8) {
                                short var25 = 240;
                                int var26 = class267.field4304[var20][var17][var18] - var25;
                                int var27 = class267.field4304[var21][var17][var18];
                                class46.method332(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var26, var27);
                                for (int var28 = var21; var28 <= var20; var28++) {
                                    for (int var29 = var18; var29 <= var19; var29++) {
                                        class293.field4703[var28][var17][var29] = class51.method359(class293.field4703[var28][var17][var29], -2);
                                    }
                                }
                            }
                        }
                        if ((class293.field4703[var15][var17][var16] & 0x2) != 0) {
                            int var30;
                            for (var30 = var17; var30 > 0 && (class293.field4703[var15][var30 - 1][var16] & 0x2) != 0; var30--) {
                            }
                            int var31;
                            for (var31 = var17; var31 < 104 && (class293.field4703[var15][var31 + 1][var16] & 0x2) != 0; var31++) {
                            }
                            int var32 = var15;
                            int var33 = var15;
                            label406: while (var32 > 0) {
                                for (int var34 = var30; var34 <= var31; var34++) {
                                    if ((class293.field4703[var32 - 1][var34][var16] & 0x2) == 0) {
                                        break label406;
                                    }
                                }
                                var32--;
                            }
                            label395: while (var33 < 3) {
                                for (int var35 = var30; var35 <= var31; var35++) {
                                    if ((class293.field4703[var33 + 1][var35][var16] & 0x2) == 0) {
                                        break label395;
                                    }
                                }
                                var33++;
                            }
                            int var36 = (var31 + 1 - var30) * (var33 + 1 - var32);
                            if (var36 >= 8) {
                                short var37 = 240;
                                int var38 = class267.field4304[var32][var30][var16];
                                int var39 = class267.field4304[var33][var30][var16] - var37;
                                class46.method332(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var39, var38);
                                for (int var40 = var32; var40 <= var33; var40++) {
                                    for (int var41 = var30; var41 <= var31; var41++) {
                                        class293.field4703[var40][var41][var16] = class51.method359(class293.field4703[var40][var41][var16], -3);
                                    }
                                }
                            }
                        }
                        if ((class293.field4703[var15][var17][var16] & 0x4) != 0) {
                            int var42 = var17;
                            int var43 = var16;
                            int var44 = var17;
                            int var45 = var16;
                            while (var43 > 0 && (class293.field4703[var15][var17][var43 - 1] & 0x4) != 0) {
                                var43--;
                            }
                            while (var45 < 104 && (class293.field4703[var15][var17][var45 + 1] & 0x4) != 0) {
                                var45++;
                            }
                            label461: while (var42 > 0) {
                                for (int var46 = var43; var46 <= var45; var46++) {
                                    if ((class293.field4703[var15][var42 - 1][var46] & 0x4) == 0) {
                                        break label461;
                                    }
                                }
                                var42--;
                            }
                            label450: while (var44 < 104) {
                                for (int var47 = var43; var47 <= var45; var47++) {
                                    if ((class293.field4703[var15][var44 + 1][var47] & 0x4) == 0) {
                                        break label450;
                                    }
                                }
                                var44++;
                            }
                            if (((var44 + 1 - var42) * (var45 + 1 - var43)) >= 4) {
                                int var48 = class267.field4304[var15][var42][var43];
                                class46.method332(4, var42 * 128, var44 * 128 + 128, var43 * 128, var45 * 128 + 128, var48, var48);
                                for (int var49 = var42; var49 <= var44; var49++) {
                                    for (int var50 = var43; var50 <= var45; var50++) {
                                        class293.field4703[var15][var49][var50] = class51.method359(class293.field4703[var15][var49][var50], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 < 40) {
            method345(-14, 60, -6, 1, false, 48);
        }
    }
}
