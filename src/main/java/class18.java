import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 {

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "[[I")
    private int[][] field335;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field328 = 0;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lp;")
    public static class280 field325 = method140((byte) -119, "<col=ffffff>");

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lp;")
    public static class280 field337;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[Lp;")
    public static class280[] field326;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static void method134(boolean arg0) {
        if (!arg0) {
            field326 = null;
        }
        field325 = null;
        field326 = null;
        field337 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Lgf;")
    public static final class123 method135(int arg0) {
        field339++;
        try {
            return arg0 >= -54 ? null : (class123) Class.forName("tb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    public final int method136(int arg0, int arg1) {
        if (this.field335 != null) {
            arg1 = (int) ((long) this.field330 * (long) arg1 / (long) this.field332);
        }
        field331++;
        if (arg0 != -30345) {
            field325 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BZ[Lpk;)V")
    public static final void method137(byte arg0, boolean arg1, class99[] arg2) {
        field333++;
        if (!arg1) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class259.field4598[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class259.field4598[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method707(30362, var5, var4);
                            }
                        }
                    }
                }
            }
            class154.field2678 += (int) (Math.random() * 5.0D) - 2;
            if (class154.field2678 < -8) {
                class154.field2678 = -8;
            }
            class27.field513 += (int) (Math.random() * 5.0D) - 2;
            if (class27.field513 < -16) {
                class27.field513 = -16;
            }
            if (class27.field513 > 16) {
                class27.field513 = 16;
            }
            if (class154.field2678 > 8) {
                class154.field2678 = 8;
            }
        }
        byte var7;
        if (arg1) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class154.field2678 >> 2 << 10;
        int var9 = class27.field513 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        if (arg0 > -6) {
            field324 = -58;
        }
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class144.field2514[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class145.field2529[var12][var100 + 1][var54] - class145.field2529[var12][var100 - 1][var54];
                    int var103 = class145.field2529[var12][var100][var54 + 1] - class145.field2529[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + (var103 * var103) + 65536));
                    int var105 = -65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var107 * -50 + var105 * -10 + var106 * -50) / var53 + var101;
                    int var109 = (var51[var100 - 1][var54] >> 2) + (var51[var100][var54 + 1] >> 3) + (var51[var100][var54 - 1] >> 2) + (var51[var100 + 1][var54] >> 3) + (var51[var100][var54] >> 1);
                    var11[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class207.field3580[var55] = 0;
                class279.field4884[var55] = 0;
                class105.field1753[var55] = 0;
                class97.field1559[var55] = 0;
                class37.field666[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class219.field3754[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class275 var96 = class228.method1540((byte) 82, var95 - 1);
                            class207.field3580[var85] += var96.field4777;
                            class279.field4884[var85] += var96.field4778;
                            class105.field1753[var85] += var96.field4767;
                            class97.field1559[var85] += var96.field4775;
                            var10002 = class37.field666[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class219.field3754[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class275 var99 = class228.method1540((byte) 60, var98 - 1);
                            class207.field3580[var85] -= var99.field4777;
                            class279.field4884[var85] -= var99.field4778;
                            class105.field1753[var85] -= var99.field4767;
                            class97.field1559[var85] -= var99.field4775;
                            var10002 = class37.field666[var85]--;
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
                            var87 += class279.field4884[var92];
                            var88 += class105.field1753[var92];
                            var86 += class207.field3580[var92];
                            var90 += class37.field666[var92];
                            var89 += class97.field1559[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var90 -= class37.field666[var93];
                            var87 -= class279.field4884[var93];
                            var86 -= class207.field3580[var93];
                            var88 -= class105.field1753[var93];
                            var89 -= class97.field1559[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var10[var56][var91] = class118.method844(var87 / var90, var88 / var90, var86 * 256 / var89, (byte) 119);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg1 || class215.method1436(104) || (class259.field4598[0][var57][var58] & 0x2) != 0 || (class259.field4598[var12][var57][var58] & 0x10) == 0 && class232.method1560(var58, 0, var12, var57) == class23.field427) {
                        if (var12 < class153.field2653) {
                            class153.field2653 = var12;
                        }
                        int var59 = class54.field882[var12][var57][var58] & 0xFF;
                        int var60 = class219.field3754[var12][var57][var58] & 0xFF;
                        if (var60 > 0 || var59 > 0) {
                            int var61 = class145.field2529[var12][var57][var58];
                            int var62 = class145.field2529[var12][var57 + 1][var58];
                            int var63 = class145.field2529[var12][var57 + 1][var58 + 1];
                            int var64 = class145.field2529[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var60 == 0 && class252.field4401[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var59 > 0 && !class38.method306(var59 - 1, -2).field1205) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class253.field4431[var12][var57][var58] = class160.method1143(class253.field4431[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var60 > 0) {
                                var66 = var10[var57][var58];
                                int var67 = (var66 & 0x7F) + var9;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var8 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class146.field2554[class115.method836(96, true, var68)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58];
                            int var72 = var11[var57 + 1][var58 + 1];
                            int var73 = var11[var57][var58 + 1];
                            if (var59 == 0) {
                                class159.method1136(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class115.method836(var70, true, var66), class115.method836(var71, true, var66), class115.method836(var72, true, var66), class115.method836(var73, true, var66), 0, 0, 0, 0, var69, 0);
                            } else {
                                byte var74 = class59.field954[var12][var57][var58];
                                int var75 = class252.field4401[var12][var57][var58] + 1;
                                class73 var76 = class38.method306(var59 - 1, -2);
                                int var77 = var76.field1209;
                                if (var77 >= 0 && !class146.field2539.method1444(var77, 22897)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var79 = -1;
                                    var78 = class146.field2554[class169.method1177(true, 96, class146.field2539.method1439(var77, -11728))];
                                } else if (var76.field1203 == -1) {
                                    var78 = 0;
                                    var79 = -2;
                                } else {
                                    var79 = var76.field1203;
                                    int var80 = (var79 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var8 + var79 & 0xFC00) + (var79 & 0x380) + var80;
                                    var78 = class146.field2554[class169.method1177(true, 96, var81)];
                                }
                                if (var76.field1198 >= 0) {
                                    int var82 = var76.field1198;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var8 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var78 = class146.field2554[class169.method1177(true, 96, var84)];
                                }
                                class159.method1136(var12, var57, var58, var75, var74, var77, var61, var62, var63, var64, class115.method836(var70, true, var66), class115.method836(var71, true, var66), class115.method836(var72, true, var66), class115.method836(var73, true, var66), class169.method1177(true, var70, var79), class169.method1177(true, var71, var79), class169.method1177(true, var72, var79), class169.method1177(true, var73, var79), var69, var78);
                            }
                        }
                    }
                }
            }
            class219.field3754[var12] = null;
            class54.field882[var12] = null;
            class252.field4401[var12] = null;
            class59.field954[var12] = null;
            class144.field2514[var12] = null;
        }
        class13.method109(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class259.field4598[1][var13][var50] & 0x2) == 2) {
                    class55.method405(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class253.field4431[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var14;
                        int var19 = var14;
                        int var20 = var15;
                        while (var17 > 0 && (class253.field4431[var14][var16][var17 - 1] & 0x1) != 0) {
                            var17--;
                        }
                        while (var20 < 104 && (class253.field4431[var14][var16][var20 + 1] & 0x1) != 0) {
                            var20++;
                        }
                        label351: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var20; var21++) {
                                if ((class253.field4431[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label351;
                                }
                            }
                            var19--;
                        }
                        label340: while (var18 < 3) {
                            for (int var22 = var17; var22 <= var20; var22++) {
                                if ((class253.field4431[var18 + 1][var16][var22] & 0x1) == 0) {
                                    break label340;
                                }
                            }
                            var18++;
                        }
                        int var23 = (var20 + 1 - var17) * (var18 + 1 - var19);
                        if (var23 >= 8) {
                            int var24 = class145.field2529[var19][var16][var17];
                            short var25 = 240;
                            int var26 = class145.field2529[var18][var16][var17] - var25;
                            class159.method1132(1, var16 * 128, var16 * 128, var17 * 128, var20 * 128 + 128, var26, var24);
                            for (int var27 = var19; var27 <= var18; var27++) {
                                for (int var28 = var17; var28 <= var20; var28++) {
                                    class253.field4431[var27][var16][var28] = class214.method1432(class253.field4431[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class253.field4431[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 > 0 && (class253.field4431[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                        }
                        int var30 = var14;
                        int var31;
                        for (var31 = var16; var31 < 104 && (class253.field4431[var14][var31 + 1][var15] & 0x2) != 0; var31++) {
                        }
                        label405: while (var30 > 0) {
                            for (int var32 = var29; var32 <= var31; var32++) {
                                if ((class253.field4431[var30 - 1][var32][var15] & 0x2) == 0) {
                                    break label405;
                                }
                            }
                            var30--;
                        }
                        int var33;
                        label393: for (var33 = var14; var33 < 3; var33++) {
                            for (int var34 = var29; var34 <= var31; var34++) {
                                if ((class253.field4431[var33 + 1][var34][var15] & 0x2) == 0) {
                                    break label393;
                                }
                            }
                        }
                        int var35 = (var33 + 1 - var30) * (var31 + 1 - var29);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class145.field2529[var30][var29][var15];
                            int var38 = class145.field2529[var33][var29][var15] - var36;
                            class159.method1132(2, var29 * 128, var31 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                            for (int var39 = var30; var39 <= var33; var39++) {
                                for (int var40 = var29; var40 <= var31; var40++) {
                                    class253.field4431[var39][var40][var15] = class214.method1432(class253.field4431[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class253.field4431[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43 = var15;
                        int var44;
                        for (var44 = var15; var44 < 104 && (class253.field4431[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        while (var43 > 0 && (class253.field4431[var14][var16][var43 - 1] & 0x4) != 0) {
                            var43--;
                        }
                        label459: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class253.field4431[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label459;
                                }
                            }
                            var41--;
                        }
                        label448: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class253.field4431[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label448;
                                }
                            }
                            var42++;
                        }
                        if (((var44 - (var43 - 1)) * (var42 + 1 - var41)) >= 4) {
                            int var47 = class145.field2529[var14][var41][var43];
                            class159.method1132(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class253.field4431[var14][var48][var49] = class214.method1432(class253.field4431[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBI)V")
    public static final void method138(int arg0, byte arg1, int arg2) {
        field338++;
        if (class48.method356(-664, arg0)) {
            class112.method782(class251.field4394[arg0], -110, arg2);
            if (arg1 > -120) {
                field324 = -72;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I")
    public final int method139(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field335 = null;
        }
        if (this.field335 != null) {
            arg1 = (int) ((long) this.field330 * (long) arg1 / (long) this.field332) + 6;
        }
        field334++;
        return arg1;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V")
    public class18(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class193.method1337(arg0, arg1, (byte) 82);
            int var4 = arg0 / var3;
            this.field332 = var4;
            int var5 = arg1 / var3;
            this.field330 = var5;
            this.field335 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field335[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/lang/String;)Lp;")
    public static final class280 method140(byte arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        field329++;
        int var3 = var2.length;
        class280 var4 = new class280();
        var4.field4907 = new byte[var3];
        if (arg0 > -116) {
            return null;
        }
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field4907[var4.field4908++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var4.field4907[var4.field4908++] = (byte) var6;
            }
        }
        var4.method1876((byte) 65);
        return var4.method1883(-125);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B[B)[B")
    public final byte[] method141(byte arg0, byte[] arg1) {
        int var3 = -38 / ((arg0 + 45) / 61);
        if (this.field335 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field330 / (long) this.field332) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var11 = arg1[var8];
                int[] var12 = this.field335[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field330 + var7;
                int var15 = var14 / this.field332;
                var7 = var14 - this.field332 * var15;
                var6 += var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 > 127) {
                    arg1[var9] = 127;
                } else {
                    arg1[var9] = (byte) var10;
                }
            }
        }
        field327++;
        return arg1;
    }
}
