import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class77 {

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "B")
    private byte field1084;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1079 = 0;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Llc;")
    public static class86 field1073 = new class86(64);

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field1083 = 0;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "[I")
    public static int[] field1085;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
    public final int method491(int arg0) {
        if (arg0 == 7) {
            field1077++;
            return this.field1084 & 0x7;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Lje;")
    public static final class188 method492(int arg0, int arg1) {
        if (arg0 != -27088) {
            method496((byte[]) null, -109);
        }
        field1080++;
        class188 var2 = (class188) class224.field3396.method540((byte) -119, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class11.field114.method1576(-90, 4, arg1);
        class188 var4 = new class188();
        if (var3 != null) {
            var4.method1208(-121, new class224(var3), arg1);
        }
        class224.field3396.method543(var4, (long) arg1, 858993459);
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method493(byte arg0) {
        class274.field4245 = null;
        class256.method1712(-1, class212.field3193, 0, -1, class197.field2739, 0, 0, 0, class275.field4263);
        if (class274.field4245 != null) {
            class94.method619(class110.field1524, 0, 28003, -1412584499, class275.field4263, 0, class197.field2739, class108.field1515, class225.field3414.field3061, class274.field4245);
            class274.field4245 = null;
        }
        if (arg0 != 41) {
            method499(29, -8, -82, -85, 100);
        }
        field1072++;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method494(int arg0) {
        if (arg0 <= 46) {
            field1083 = -94;
        }
        field1073 = null;
        field1085 = null;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public static final void method495(int arg0) {
        class208.field2969 = arg0;
        for (int var1 = 0; var1 < class127.field1802; var1++) {
            for (int var2 = 0; var2 < class234.field3531; var2++) {
                if (class194.field2682[arg0][var1][var2] == null) {
                    class194.field2682[arg0][var1][var2] = new class89(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([BI)[B")
    public static final byte[] method496(byte[] arg0, int arg1) {
        class224 var2 = new class224(arg0);
        field1081++;
        int var3 = var2.method1453((byte) -127);
        if (arg1 < 53) {
            method498((int[][][]) null, false, -47, (class276[]) null);
        }
        int var4 = var2.method1483((byte) 46);
        if (var4 < 0 || !(class252.field3856 == 0 || class252.field3856 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1468(5085, var4, 0, var7);
            return var7;
        } else {
            int var5 = var2.method1483((byte) 46);
            if (var5 < 0 || !(class252.field3856 == 0 || class252.field3856 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class161.method1075(var6, var5, arg0, var4, 9);
            } else {
                class195.field2697.method1429(22074, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Lmd;")
    public static final class228 method497(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1235;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([[[IZI[Ljb;)V")
    public static final void method498(int[][][] arg0, boolean arg1, int arg2, class276[] arg3) {
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class230.field3489[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class230.field3489[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg3[var7].method1838(var5, var6, false);
                            }
                        }
                    }
                }
            }
            class280.field4343 += (int) (Math.random() * 5.0D) - 2;
            if (class280.field4343 < -16) {
                class280.field4343 = -16;
            }
            class200.field2786 += (int) (Math.random() * 5.0D) - 2;
            if (class200.field2786 < -8) {
                class200.field2786 = -8;
            }
            if (class280.field4343 > 16) {
                class280.field4343 = 16;
            }
            if (class200.field2786 > 8) {
                class200.field2786 = 8;
            }
        }
        if (arg2 != 22905) {
            method497(66, 14, 39);
        }
        int var8 = class200.field2786 >> 2 << 10;
        int var9 = class280.field4343 >> 1;
        byte var10;
        if (arg1) {
            var10 = 1;
        } else {
            var10 = 4;
        }
        field1071++;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var10; var13++) {
            byte[][] var52 = client.field2180[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class200.field2788[var13][var101 + 1][var55] - class200.field2788[var13][var101 - 1][var55];
                    int var103 = class200.field2788[var13][var101][var55 + 1] - class200.field2788[var13][var101][var55 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + (var103 * var103) + 65536));
                    byte var105 = 74;
                    int var106 = (var102 << 8) / var104;
                    int var107 = -65536 / var104;
                    int var108 = (var103 << 8) / var104;
                    int var109 = (var52[var101][var55 + 1] >> 3) + (var52[var101 - 1][var55] >> 2) + (var52[var101 - -1][var55] >> 3) - (-(var52[var101][var55 + -1] >> 2) + -(var52[var101][var55] >> 1));
                    int var110 = (var108 * -50 + var106 * -50 + var107 * -10) / var54 + var105;
                    var12[var101][var55] = var110 - var109;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class247.field3788[var56] = 0;
                class82.field1120[var56] = 0;
                class184.field2553[var56] = 0;
                class265.field3973[var56] = 0;
                class69.field940[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class9.field80[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class35 var97 = class179.method1171(false, var96 - 1);
                            class247.field3788[var86] += var97.field536;
                            class82.field1120[var86] += var97.field544;
                            class184.field2553[var86] += var97.field534;
                            class265.field3973[var86] += var97.field543;
                            var10002 = class69.field940[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class9.field80[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class35 var100 = class179.method1171(false, var99 - 1);
                            class247.field3788[var86] -= var100.field536;
                            class82.field1120[var86] -= var100.field544;
                            class184.field2553[var86] -= var100.field534;
                            class265.field3973[var86] -= var100.field543;
                            var10002 = class69.field940[var86]--;
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
                        int var93 = var92 + 5;
                        if (var93 < 104) {
                            var88 += class265.field3973[var93];
                            var87 += class247.field3788[var93];
                            var90 += class184.field2553[var93];
                            var89 += class82.field1120[var93];
                            var91 += class69.field940[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var90 -= class184.field2553[var94];
                            var91 -= class69.field940[var94];
                            var88 -= class265.field3973[var94];
                            var89 -= class82.field1120[var94];
                            var87 -= class247.field3788[var94];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var11[var57][var92] = class1.method1(var87 * 256 / var88, var89 / var91, var90 / var91, (byte) 109);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg1 || class34.method231(111) || (class230.field3489[0][var58][var59] & 0x2) != 0 || (class230.field3489[var13][var58][var59] & 0x10) == 0 && class82.method513((byte) 127, var58, var59, var13) == class281.field4361) {
                        if (class138.field1927 > var13) {
                            class138.field1927 = var13;
                        }
                        int var60 = class9.field80[var13][var58][var59] & 0xFF;
                        int var61 = class34.field530[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class200.field2788[var13][var58][var59];
                            int var63 = class200.field2788[var13][var58 + 1][var59];
                            int var64 = class200.field2788[var13][var58 + 1][var59 + 1];
                            int var65 = class200.field2788[var13][var58][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class34.field528[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !method492(arg2 - 49993, var61 + -1).field2591) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var63 && var62 == var64 && var62 == var65) {
                                    class198.field2758[var13][var58][var59] = class54.method339(class198.field2758[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (var60 > 0) {
                                var67 = var11[var58][var59];
                                int var68 = (var67 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var8 + var67 & 0xFC00) + (var67 & 0x380) + var68;
                                var70 = class90.field1264[class44.method294(96, -18888, var69)];
                            } else {
                                var67 = -1;
                                var70 = 0;
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 + 1][var59];
                            int var73 = var12[var58 + 1][var59 + 1];
                            int var74 = var12[var58][var59 + 1];
                            if (var61 == 0) {
                                class146.method982(var13, var58, var59, 0, 0, -1, var62, var63, var64, var65, class44.method294(var71, arg2 ^ 0xFFFFEF41, var67), class44.method294(var72, -18888, var67), class44.method294(var73, -18888, var67), class44.method294(var74, -18888, var67), 0, 0, 0, 0, var70, 0);
                            } else {
                                byte var75 = class264.field3966[var13][var58][var59];
                                int var76 = class34.field528[var13][var58][var59] + 1;
                                class188 var77 = method492(-27088, var61 - 1);
                                int var78 = var77.field2588;
                                if (var78 >= 0 && !class90.field1260.method912(var78, (byte) -33)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = -1;
                                    var80 = class90.field1264[class213.method1391(96, class90.field1260.method911(118, var78), arg2 - 22779)];
                                } else if (var77.field2603 == -1) {
                                    var80 = 0;
                                    var79 = -2;
                                } else {
                                    var79 = var77.field2603;
                                    int var81 = (var79 & 0x7F) + var9;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var8 + var79 & 0xFC00) + (var79 & 0x380) + var81;
                                    var80 = class90.field1264[class213.method1391(96, var82, arg2 ^ 0x5911)];
                                }
                                if (var77.field2601 >= 0) {
                                    int var83 = var77.field2601;
                                    int var84 = (var83 & 0x7F) + var9;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var83 + var8 & 0xFC00) + (var83 & 0x380) + var84;
                                    var80 = class90.field1264[class213.method1391(96, var85, arg2 - 22788)];
                                }
                                class146.method982(var13, var58, var59, var76, var75, var78, var62, var63, var64, var65, class44.method294(var71, -18888, var67), class44.method294(var72, -18888, var67), class44.method294(var73, arg2 - 41793, var67), class44.method294(var74, -18888, var67), class213.method1391(var71, var79, 109), class213.method1391(var72, var79, 91), class213.method1391(var73, var79, 124), class213.method1391(var74, var79, 105), var70, var80);
                            }
                        }
                    }
                }
            }
            class9.field80[var13] = null;
            class34.field530[var13] = null;
            class34.field528[var13] = null;
            class264.field3966[var13] = null;
            client.field2180[var13] = null;
        }
        class39.method260(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class230.field3489[1][var14][var51] & 0x2) == 2) {
                    class5.method29(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class198.field2758[var15][var17][var16] & 0x1) != 0) {
                        int var18;
                        for (var18 = var16; var18 > 0 && (class198.field2758[var15][var17][var18 - 1] & 0x1) != 0; var18--) {
                        }
                        int var19 = var16;
                        int var20 = var15;
                        int var21 = var15;
                        while (var19 < 104 && (class198.field2758[var15][var17][var19 + 1] & 0x1) != 0) {
                            var19++;
                        }
                        label353: while (var20 > 0) {
                            for (int var22 = var18; var22 <= var19; var22++) {
                                if ((class198.field2758[var20 - 1][var17][var22] & 0x1) == 0) {
                                    break label353;
                                }
                            }
                            var20--;
                        }
                        label342: while (var21 < 3) {
                            for (int var23 = var18; var23 <= var19; var23++) {
                                if ((class198.field2758[var21 + 1][var17][var23] & 0x1) == 0) {
                                    break label342;
                                }
                            }
                            var21++;
                        }
                        int var24 = (var19 + 1 - var18) * (var21 + 1 - var20);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class200.field2788[var20][var17][var18];
                            int var27 = class200.field2788[var21][var17][var18] - var25;
                            class251.method1683(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var27, var26);
                            for (int var28 = var20; var28 <= var21; var28++) {
                                for (int var29 = var18; var29 <= var19; var29++) {
                                    class198.field2758[var28][var17][var29] = class235.method1572(class198.field2758[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class198.field2758[var15][var17][var16] & 0x2) != 0) {
                        int var30;
                        for (var30 = var17; var30 > 0 && (class198.field2758[var15][var30 - 1][var16] & 0x2) != 0; var30--) {
                        }
                        int var31;
                        for (var31 = var17; var31 < 104 && (class198.field2758[var15][var31 + 1][var16] & 0x2) != 0; var31++) {
                        }
                        int var32 = var15;
                        int var33 = var15;
                        label407: while (var32 > 0) {
                            for (int var34 = var30; var34 <= var31; var34++) {
                                if ((class198.field2758[var32 - 1][var34][var16] & 0x2) == 0) {
                                    break label407;
                                }
                            }
                            var32--;
                        }
                        label396: while (var33 < 3) {
                            for (int var35 = var30; var35 <= var31; var35++) {
                                if ((class198.field2758[var33 + 1][var35][var16] & 0x2) == 0) {
                                    break label396;
                                }
                            }
                            var33++;
                        }
                        int var36 = (var31 + 1 - var30) * (var33 + 1 - var32);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class200.field2788[var33][var30][var16] - var37;
                            int var39 = class200.field2788[var32][var30][var16];
                            class251.method1683(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var32; var40 <= var33; var40++) {
                                for (int var41 = var30; var41 <= var31; var41++) {
                                    class198.field2758[var40][var41][var16] = class235.method1572(class198.field2758[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class198.field2758[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var17;
                        int var44;
                        for (var44 = var16; var44 > 0 && (class198.field2758[var15][var17][var44 - 1] & 0x4) != 0; var44--) {
                        }
                        int var45;
                        for (var45 = var16; var45 < 104 && (class198.field2758[var15][var17][var45 + 1] & 0x4) != 0; var45++) {
                        }
                        label462: while (var42 > 0) {
                            for (int var46 = var44; var46 <= var45; var46++) {
                                if ((class198.field2758[var15][var42 - 1][var46] & 0x4) == 0) {
                                    break label462;
                                }
                            }
                            var42--;
                        }
                        label451: while (var43 < 104) {
                            for (int var47 = var44; var47 <= var45; var47++) {
                                if ((class198.field2758[var15][var43 + 1][var47] & 0x4) == 0) {
                                    break label451;
                                }
                            }
                            var43++;
                        }
                        if ((var43 + 1 - var42) * (var45 + 1 - var44) >= 4) {
                            int var48 = class200.field2788[var15][var42][var44];
                            class251.method1683(4, var42 * 128, var43 * 128 + 128, var44 * 128, var45 * 128 + 128, var48, var48);
                            for (int var49 = var42; var49 <= var43; var49++) {
                                for (int var50 = var44; var50 <= var45; var50++) {
                                    class198.field2758[var15][var49][var50] = class235.method1572(class198.field2758[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
    public static final void method499(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1070++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class148.method996(class93.field1294, arg0 + arg2, 7585, class296.field4668);
        int var10 = class148.method996(class93.field1294, arg0 - arg2, 7585, class296.field4668);
        class154.method1028(-353, class216.field3264[arg3], arg1, var10, var9);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                var7 -= var6 << 1;
                if (class273.field4228 <= var12 && var11 <= class127.field1782) {
                    int var13 = class148.method996(class93.field1294, arg0 + var5, 7585, class296.field4668);
                    int var14 = class148.method996(class93.field1294, arg0 - var5, 7585, class296.field4668);
                    if (var12 <= class127.field1782) {
                        class154.method1028(-353, class216.field3264[var12], arg1, var14, var13);
                    }
                    if (var11 >= class273.field4228) {
                        class154.method1028(-353, class216.field3264[var11], arg1, var14, var13);
                    }
                }
            }
            var5++;
            int var15 = arg3 + var5;
            int var16 = arg3 - var5;
            if (var15 >= class273.field4228 && class127.field1782 >= var16) {
                int var17 = class148.method996(class93.field1294, arg0 + var6, 7585, class296.field4668);
                int var18 = class148.method996(class93.field1294, arg0 - var6, 7585, class296.field4668);
                if (class127.field1782 >= var15) {
                    class154.method1028(-353, class216.field3264[var15], arg1, var18, var17);
                }
                if (class273.field4228 <= var16) {
                    class154.method1028(-353, class216.field3264[var16], arg1, var18, var17);
                }
            }
        }
        if (arg4 > -90) {
            method494(-42);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)I")
    public final int method500(byte arg0) {
        field1076++;
        if (arg0 != -48) {
            method499(120, -114, 12, 104, 117);
        }
        return (this.field1084 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class77() {
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lql;)V")
    public class77(class224 arg0) {
        this.field1084 = arg0.method1437((byte) -91);
        this.field1082 = arg0.method1445(false);
        this.field1069 = arg0.method1483((byte) 46);
        this.field1074 = arg0.method1483((byte) 46);
        this.field1078 = arg0.method1483((byte) 46);
        this.field1075 = arg0.method1483((byte) 46);
    }
}
