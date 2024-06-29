import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class18 extends RuntimeException {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/lang/String;")
    public String field321;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field328;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lol;")
    public static class164 field329;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
    public static int[] field323;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[Z")
    public static boolean[] field322;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static final void method126(byte arg0) {
        field330++;
        if (arg0 != 126 || !class76.field1205) {
            return;
        }
        class297 var1 = class237.method1617(class54.field858, (byte) 63, class111.field1688);
        if (var1 != null && var1.field4673 != null) {
            class43 var2 = new class43();
            var2.field767 = var1.field4673;
            var2.field750 = var1;
            class137.method934(200000, var2);
        }
        class76.field1205 = false;
        class181.field2642 = -1;
        class297.method1979((byte) -97, var1);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([Lql;Z[[[IZ)V")
    public static final void method127(class78[] arg0, boolean arg1, int[][][] arg2, boolean arg3) {
        field325++;
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class247.field3844[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class247.field3844[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method614((byte) 121, var6, var5);
                            }
                        }
                    }
                }
            }
            class155.field2269 += (int) (Math.random() * 5.0D) - 2;
            if (class155.field2269 < -16) {
                class155.field2269 = -16;
            }
            class194.field2937 += (int) (Math.random() * 5.0D) - 2;
            if (class155.field2269 > 16) {
                class155.field2269 = 16;
            }
            if (class194.field2937 < -8) {
                class194.field2937 = -8;
            }
            if (class194.field2937 > 8) {
                class194.field2937 = 8;
            }
        }
        int var8 = class194.field2937 >> 2 << 10;
        byte var9;
        if (arg1) {
            var9 = 1;
        } else {
            var9 = 4;
        }
        if (arg3) {
            field322 = null;
        }
        int var10 = class155.field2269 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var9; var13++) {
            byte[][] var52 = class51.field834[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class166.field2451[var13][var101][var55 + 1] - class166.field2451[var13][var101][var55 - 1];
                    byte var103 = 74;
                    int var104 = class166.field2451[var13][var101 + 1][var55] - class166.field2451[var13][var101 - 1][var55];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var102 * var102 + 65536));
                    int var106 = (var104 << 8) / var105;
                    int var107 = (var102 << 8) / var105;
                    int var108 = -65536 / var105;
                    int var109 = (var107 * -50 + var106 * -50 + var108 * -10) / var54 + var103;
                    int var110 = (var52[var101][var55 + 1] >> 3) + (var52[var101][var55] >> 1) + (var52[var101 + -1][var55] >> 2) + ((var52[var101 + 1][var55] >> 3) - -(var52[var101][var55 - 1] >> 2));
                    var12[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class191.field2899[var56] = 0;
                class197.field2978[var56] = 0;
                class225.field3516[var56] = 0;
                class73.field1189[var56] = 0;
                class284.field4354[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class58.field957[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class131 var97 = class122.method864(var96 - 1, 3);
                            class191.field2899[var86] += var97.field1929;
                            class197.field2978[var86] += var97.field1938;
                            class225.field3516[var86] += var97.field1940;
                            class73.field1189[var86] += var97.field1925;
                            var10002 = class284.field4354[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class58.field957[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class131 var100 = class122.method864(var99 - 1, 3);
                            class191.field2899[var86] -= var100.field1929;
                            class197.field2978[var86] -= var100.field1938;
                            class225.field3516[var86] -= var100.field1940;
                            class73.field1189[var86] -= var100.field1925;
                            var10002 = class284.field4354[var86]--;
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
                            var87 += class191.field2899[var94];
                            var88 += class197.field2978[var94];
                            var90 += class225.field3516[var94];
                            var89 += class73.field1189[var94];
                            var91 += class284.field4354[var94];
                        }
                        if (var93 >= 0) {
                            var90 -= class225.field3516[var93];
                            var91 -= class284.field4354[var93];
                            var89 -= class73.field1189[var93];
                            var88 -= class197.field2978[var93];
                            var87 -= class191.field2899[var93];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var11[var57][var92] = class285.method1896(var87 * 256 / var89, var88 / var91, var90 / var91, -5706);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg1 || class101.method741(-6425) || (class247.field3844[0][var58][var59] & 0x2) != 0 || (class247.field3844[var13][var58][var59] & 0x10) == 0 && class190.method1269(false, var13, var58, var59) == class51.field832) {
                        if (class133.field1953 > var13) {
                            class133.field1953 = var13;
                        }
                        int var60 = class186.field2719[var13][var58][var59] & 0xFF;
                        int var61 = class58.field957[var13][var58][var59] & 0xFF;
                        if (var61 > 0 || var60 > 0) {
                            int var62 = class166.field2451[var13][var58][var59];
                            int var63 = class166.field2451[var13][var58 + 1][var59];
                            int var64 = class166.field2451[var13][var58][var59 + 1];
                            int var65 = class166.field2451[var13][var58 + 1][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var61 == 0 && class167.field2460[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var60 > 0 && !class78.method622((byte) 124, var60 - 1).field1585) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var63 && var62 == var65 && var62 == var64) {
                                    class265.field4136[var13][var58][var59] = class186.method1215(class265.field4136[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (var61 <= 0) {
                                var67 = 0;
                                var68 = -1;
                            } else {
                                var68 = var11[var58][var59];
                                int var69 = (var68 & 0x7F) + var10;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var8 + var68 & 0xFC00) + (var68 & 0x380) + var69;
                                var67 = class119.field1786[class107.method776(-104, var70, 96)];
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 + 1][var59 + 1];
                            int var73 = var12[var58 + 1][var59];
                            int var74 = var12[var58][var59 + 1];
                            if (var60 == 0) {
                                class241.method1649(var13, var58, var59, 0, 0, -1, var62, var63, var65, var64, class107.method776(-108, var68, var71), class107.method776(-119, var68, var73), class107.method776(-98, var68, var72), class107.method776(-114, var68, var74), 0, 0, 0, 0, var67, 0);
                            } else {
                                int var75 = class167.field2460[var13][var58][var59] + 1;
                                byte var76 = class264.field4130[var13][var58][var59];
                                class108 var77 = class78.method622((byte) -50, var60 - 1);
                                int var78 = var77.field1590;
                                if (var78 >= 0 && !class119.field1790.method1838((byte) -74, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = -1;
                                    var80 = class119.field1786[class49.method378(96, -15337, class119.field1790.method1829(false, var78))];
                                } else if (var77.field1586 == -1) {
                                    var79 = -2;
                                    var80 = 0;
                                } else {
                                    var79 = var77.field1586;
                                    int var81 = (var79 & 0x7F) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var8 + var79 & 0xFC00) + (var79 & 0x380) + var81;
                                    var80 = class119.field1786[class49.method378(96, -15337, var82)];
                                }
                                if (var77.field1589 >= 0) {
                                    int var83 = var77.field1589;
                                    int var84 = (var83 & 0x7F) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var8 + var83 & 0xFC00) + (var83 & 0x380) + var84;
                                    var80 = class119.field1786[class49.method378(96, -15337, var85)];
                                }
                                class241.method1649(var13, var58, var59, var75, var76, var78, var62, var63, var65, var64, class107.method776(-88, var68, var71), class107.method776(-120, var68, var73), class107.method776(-104, var68, var72), class107.method776(-38, var68, var74), class49.method378(var71, -15337, var79), class49.method378(var73, -15337, var79), class49.method378(var72, -15337, var79), class49.method378(var74, -15337, var79), var67, var80);
                            }
                        }
                    }
                }
            }
            class58.field957[var13] = null;
            class186.field2719[var13] = null;
            class167.field2460[var13] = null;
            class264.field4130[var13] = null;
            class51.field834[var13] = null;
        }
        class251.method1711(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class247.field3844[1][var14][var51] & 0x2) == 2) {
                    class232.method1575(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class265.field4136[var15][var17][var16] & 0x1) != 0) {
                        int var18;
                        for (var18 = var16; var18 < 104 && (class265.field4136[var15][var17][var18 + 1] & 0x1) != 0; var18++) {
                        }
                        int var19 = var15;
                        int var20;
                        for (var20 = var16; var20 > 0 && (class265.field4136[var15][var17][var20 - 1] & 0x1) != 0; var20--) {
                        }
                        label354: while (var19 > 0) {
                            for (int var21 = var20; var21 <= var18; var21++) {
                                if ((class265.field4136[var19 - 1][var17][var21] & 0x1) == 0) {
                                    break label354;
                                }
                            }
                            var19--;
                        }
                        int var22;
                        label342: for (var22 = var15; var22 < 3; var22++) {
                            for (int var23 = var20; var23 <= var18; var23++) {
                                if ((class265.field4136[var22 + 1][var17][var23] & 0x1) == 0) {
                                    break label342;
                                }
                            }
                        }
                        int var24 = (var18 + 1 - var20) * (var22 + 1 - var19);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class166.field2451[var22][var17][var20] - var25;
                            int var27 = class166.field2451[var19][var17][var20];
                            class260.method1757(1, var17 * 128, var17 * 128, var20 * 128, var18 * 128 + 128, var26, var27);
                            for (int var28 = var19; var28 <= var22; var28++) {
                                for (int var29 = var20; var29 <= var18; var29++) {
                                    class265.field4136[var28][var17][var29] = class131.method904(class265.field4136[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class265.field4136[var15][var17][var16] & 0x2) != 0) {
                        int var30;
                        for (var30 = var17; var30 > 0 && (class265.field4136[var15][var30 - 1][var16] & 0x2) != 0; var30--) {
                        }
                        int var31 = var17;
                        int var32 = var15;
                        while (var31 < 104 && (class265.field4136[var15][var31 + 1][var16] & 0x2) != 0) {
                            var31++;
                        }
                        int var33 = var15;
                        label408: while (var32 > 0) {
                            for (int var34 = var30; var34 <= var31; var34++) {
                                if ((class265.field4136[var32 - 1][var34][var16] & 0x2) == 0) {
                                    break label408;
                                }
                            }
                            var32--;
                        }
                        label397: while (var33 < 3) {
                            for (int var35 = var30; var35 <= var31; var35++) {
                                if ((class265.field4136[var33 + 1][var35][var16] & 0x2) == 0) {
                                    break label397;
                                }
                            }
                            var33++;
                        }
                        int var36 = (var31 + 1 - var30) * (var33 + 1 - var32);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class166.field2451[var33][var30][var16] - var37;
                            int var39 = class166.field2451[var32][var30][var16];
                            class260.method1757(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var32; var40 <= var33; var40++) {
                                for (int var41 = var30; var41 <= var31; var41++) {
                                    class265.field4136[var40][var41][var16] = class131.method904(class265.field4136[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class265.field4136[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var16;
                        int var44 = var16;
                        int var45 = var17;
                        while (var43 > 0 && (class265.field4136[var15][var17][var43 - 1] & 0x4) != 0) {
                            var43--;
                        }
                        while (var44 < 104 && (class265.field4136[var15][var17][var44 + 1] & 0x4) != 0) {
                            var44++;
                        }
                        label463: while (var42 > 0) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class265.field4136[var15][var42 - 1][var46] & 0x4) == 0) {
                                    break label463;
                                }
                            }
                            var42--;
                        }
                        label452: while (var45 < 104) {
                            for (int var47 = var43; var47 <= var44; var47++) {
                                if ((class265.field4136[var15][var45 + 1][var47] & 0x4) == 0) {
                                    break label452;
                                }
                            }
                            var45++;
                        }
                        if ((var44 + 1 - var43) * (var45 + 1 - var42) >= 4) {
                            int var48 = class166.field2451[var15][var42][var43];
                            class260.method1757(4, var42 * 128, var45 * 128 + 128, var43 * 128, var44 * 128 + 128, var48, var48);
                            for (int var49 = var42; var49 <= var45; var49++) {
                                for (int var50 = var43; var50 <= var44; var50++) {
                                    class265.field4136[var15][var49][var50] = class131.method904(class265.field4136[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method128(int arg0) {
        field322 = null;
        field323 = null;
        int var1 = 8 % ((64 - arg0) / 58);
        field329 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method129(Random arg0, int arg1, int arg2) {
        field326++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class77.method611(arg2, true)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = -98 / ((73 - arg1) / 35);
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var5;
            do {
                var5 = arg0.nextInt();
            } while (var4 <= var5);
            return class267.method1806(-1, var5, arg2);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpk;B)V")
    public static final void method130(class237 arg0, byte arg1) {
        field327++;
        if (arg1 != -75) {
            method129((Random) null, 47, -99);
        }
        class207.field3103 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class18(Throwable arg0, String arg1) {
        this.field321 = arg1;
        this.field328 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lsa;IIIIIIZ)V")
    public static final void method131(class291 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4424.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field4424[var9] - class251.field3892;
            int var23 = arg0.field4410[var9] - class127.field1863;
            int var24 = arg0.field4423[var9] - class135.field1979;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field4420 != null) {
                class291.field4415[var9] = var25;
                class291.field4407[var9] = var28;
                class291.field4425[var9] = var29;
            }
            class291.field4412[var9] = (var25 << 9) / var29 + class119.field1787;
            class291.field4422[var9] = (var28 << 9) / var29 + class119.field1785;
        }
        class119.field1789 = 0;
        int var10 = arg0.field4418.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field4418[var11];
            int var13 = arg0.field4413[var11];
            int var14 = arg0.field4406[var11];
            int var15 = class291.field4412[var12];
            int var16 = class291.field4412[var13];
            int var17 = class291.field4412[var14];
            int var18 = class291.field4422[var12];
            int var19 = class291.field4422[var13];
            int var20 = class291.field4422[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class248.field3852 && class175.method1162(class122.field1809 + class119.field1787, class149.field2156 + class119.field1785, var18, var19, var20, var15, var16, var17)) {
                    class44.field775 = arg5;
                    class173.field2540 = arg6;
                }
                if (!arg7) {
                    class119.field1775 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class119.field1784 || var16 > class119.field1784 || var17 > class119.field1784) {
                        class119.field1775 = true;
                    }
                    if (arg0.field4420 == null || arg0.field4420[var11] == -1) {
                        if (arg0.field4421[var11] != 12345678) {
                            class119.method851(var18, var19, var20, var15, var16, var17, arg0.field4421[var11], arg0.field4417[var11], arg0.field4411[var11]);
                        }
                    } else if (!class17.field312) {
                        int var21 = class119.field1790.method1829(false, arg0.field4420[var11]);
                        class119.method851(var18, var19, var20, var15, var16, var17, class33.method226(var21, arg0.field4421[var11]), class33.method226(var21, arg0.field4417[var11]), class33.method226(var21, arg0.field4411[var11]));
                    } else if (arg0.field4409) {
                        class119.method834(var18, var19, var20, var15, var16, var17, arg0.field4421[var11], arg0.field4417[var11], arg0.field4411[var11], class291.field4415[0], class291.field4415[1], class291.field4415[3], class291.field4407[0], class291.field4407[1], class291.field4407[3], class291.field4425[0], class291.field4425[1], class291.field4425[3], arg0.field4420[var11]);
                    } else {
                        class119.method834(var18, var19, var20, var15, var16, var17, arg0.field4421[var11], arg0.field4417[var11], arg0.field4411[var11], class291.field4415[var12], class291.field4415[var13], class291.field4415[var14], class291.field4407[var12], class291.field4407[var13], class291.field4407[var14], class291.field4425[var12], class291.field4425[var13], class291.field4425[var14], arg0.field4420[var11]);
                    }
                }
            }
        }
    }
}
