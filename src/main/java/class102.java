import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class102 extends class210 {

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public int field2084 = 0;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public int field2088 = -1;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2089 = new CRC32();

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Ljd;")
    private static class92 field2105 = class202.method1325((byte) 90, "Login limit exceeded)3");

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Ljd;")
    private static class92 field2099 = class202.method1325((byte) 90, "Cancel");

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Ljd;")
    public static class92 field2098 = field2099;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Ljd;")
    public static class92 field2103 = field2105;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "[S")
    public static short[] field2107 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public int field2087;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public int field2090;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field2092;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "[I")
    public static int[] field2104;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static void method700(boolean arg0) {
        if (!arg0) {
            field2089 = null;
        }
        field2089 = null;
        field2098 = null;
        field2103 = null;
        field2099 = null;
        field2107 = null;
        field2105 = null;
        field2104 = null;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public static final void method701(int arg0) {
        class189.field3598 = new byte[4][104][104];
        class131.field2628 = new int[104];
        field2104 = new int[104];
        client.field675 = new int[4][105][105];
        class53.field1108 = new int[104];
        class2.field161 = new int[104];
        client.field691 = new byte[4][105][105];
        field2094++;
        class42.field938 = 99;
        if (arg0 > 81) {
            class70.field1485 = new byte[4][104][104];
            class49.field1072 = new int[104];
            class146.field2907 = new byte[4][104][104];
            class139.field2789 = new byte[4][104][104];
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lgd;")
    public static final class64 method702(byte arg0, int arg1) {
        field2083++;
        class64 var2 = (class64) class89.field1758.method930(67, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -98) {
            method704(-23, 80, 108);
        }
        byte[] var3 = class120.field2422.method899((byte) 87, class84.method564(arg1, (byte) 127), class96.method667(arg1, false));
        class64 var4 = new class64();
        var4.field1289 = arg1;
        if (var3 != null) {
            var4.method387(-1986, new class70(var3));
        }
        class89.field1758.method927(arg0 ^ 0xFFFF9F36, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[Lmb;)V")
    public static final void method703(byte arg0, class118[] arg1) {
        field2101++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var113 = 0; var113 < 104; var113++) {
                for (int var114 = 0; var114 < 104; var114++) {
                    if ((class59.field1239[var2][var113][var114] & 0x1) == 1) {
                        int var115 = var2;
                        if ((class59.field1239[1][var113][var114] & 0x2) == 2) {
                            var115 = var2 - 1;
                        }
                        if (var115 >= 0) {
                            arg1[var115].method794(var114, var113, (byte) -106);
                        }
                    }
                }
            }
        }
        class9.field336 += (int) (Math.random() * 5.0D) - 2;
        class20.field485 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field336 < -8) {
            class9.field336 = -8;
        }
        if (class9.field336 > 8) {
            class9.field336 = 8;
        }
        int[][] var3 = new int[104][104];
        int var4 = class9.field336 >> 2 << 10;
        int[][] var5 = new int[104][104];
        if (class20.field485 < -16) {
            class20.field485 = -16;
        }
        if (class20.field485 > 16) {
            class20.field485 = 16;
        }
        int var6 = class20.field485 >> 1;
        for (int var7 = 0; var7 < 4; var7++) {
            byte[][] var50 = client.field691[var7];
            byte var51 = 74;
            short var52 = 768;
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var52 * var53 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var103 = 1; var103 < 103; var103++) {
                    int var105 = class125.field2538[var7][var103 + 1][var55] - class125.field2538[var7][var103 - 1][var55];
                    int var106 = class125.field2538[var7][var103][var55 + 1] - class125.field2538[var7][var103][var55 - 1];
                    int var107 = (int) Math.sqrt((double) (var105 * var105 + var106 * var106 + 65536));
                    int var108 = (var106 << 8) / var107;
                    int var109 = -65536 / var107;
                    int var110 = (var105 << 8) / var107;
                    int var111 = (var109 * -10 + var110 * -50 + var108 * -50) / var54 + var51;
                    int var112 = (var50[var103][var55] >> 1) + (var50[var103 + 1][var55] >> 3) + (var50[var103][var55 + 1] >> 3) + (var50[var103 - 1][var55] >> 2) + (var50[var103][var55 + -1] >> 2);
                    var5[var103][var55] = var111 - var112;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class131.field2628[var56] = 0;
                class49.field1072[var56] = 0;
                class2.field161[var56] = 0;
                class53.field1108[var56] = 0;
                field2104[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var88 = 0; var88 < 104; var88++) {
                    int var97 = var57 + 5;
                    int var10002;
                    if (var97 < 104) {
                        int var98 = class146.field2907[var7][var97][var88] & 0xFF;
                        if (var98 > 0) {
                            class143 var99 = class214.method1397(var98 - 1, (byte) 123);
                            class131.field2628[var88] += var99.field2843;
                            class49.field1072[var88] += var99.field2847;
                            class2.field161[var88] += var99.field2839;
                            class53.field1108[var88] += var99.field2844;
                            var10002 = field2104[var88]++;
                        }
                    }
                    int var100 = var57 - 5;
                    if (var100 >= 0) {
                        int var101 = class146.field2907[var7][var100][var88] & 0xFF;
                        if (var101 > 0) {
                            class143 var102 = class214.method1397(var101 - 1, (byte) 114);
                            class131.field2628[var88] -= var102.field2843;
                            class49.field1072[var88] -= var102.field2847;
                            class2.field161[var88] -= var102.field2839;
                            class53.field1108[var88] -= var102.field2844;
                            var10002 = field2104[var88]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    int var93 = 0;
                    for (int var94 = -5; var94 < 104; var94++) {
                        int var95 = var94 + 5;
                        if (var95 < 104) {
                            var93 += field2104[var95];
                            var91 += class2.field161[var95];
                            var90 += class49.field1072[var95];
                            var92 += class53.field1108[var95];
                            var89 += class131.field2628[var95];
                        }
                        int var96 = var94 - 5;
                        if (var96 >= 0) {
                            var90 -= class49.field1072[var96];
                            var89 -= class131.field2628[var96];
                            var91 -= class2.field161[var96];
                            var93 -= field2104[var96];
                            var92 -= class53.field1108[var96];
                        }
                        if (var94 >= 0 && var93 > 0) {
                            var3[var57][var94] = class200.method1319(var90 / var93, 4, var89 * 256 / var92, var91 / var93);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var61 = 1; var61 < 103; var61++) {
                    if (!class115.field2339 || (class59.field1239[0][var58][var61] & 0x2) != 0 || (class59.field1239[var7][var58][var61] & 0x10) == 0 && class9.method59(var7, var61, arg0 ^ 0xFFFFFFFD, var58) == class164.field3196) {
                        if (var7 < class42.field938) {
                            class42.field938 = var7;
                        }
                        int var62 = class146.field2907[var7][var58][var61] & 0xFF;
                        int var63 = class139.field2789[var7][var58][var61] & 0xFF;
                        if (var62 > 0 || var63 > 0) {
                            int var64 = class125.field2538[var7][var58 + 1][var61];
                            int var65 = class125.field2538[var7][var58 + 1][var61 + 1];
                            int var66 = class125.field2538[var7][var58][var61];
                            int var67 = class125.field2538[var7][var58][var61 + 1];
                            if (var7 > 0) {
                                boolean var68 = true;
                                if (var62 == 0 && class70.field1485[var7][var58][var61] != 0) {
                                    var68 = false;
                                }
                                if (var63 > 0 && !class185.method1200(var63 - 1, 103).field1755) {
                                    var68 = false;
                                }
                                if (var68 && var64 == var66 && var65 == var66 && var66 == var67) {
                                    client.field675[var7][var58][var61] = class67.method396(client.field675[var7][var58][var61], 2340);
                                }
                            }
                            int var69;
                            int var70;
                            if (var62 <= 0) {
                                var69 = -1;
                                var70 = 0;
                            } else {
                                var69 = var3[var58][var61];
                                int var71 = (var69 & 0x7F) + var6;
                                if (var71 < 0) {
                                    var71 = 0;
                                } else if (var71 > 127) {
                                    var71 = 127;
                                }
                                int var72 = (var4 + var69 & 0xFC00) + (var69 & 0x380) + var71;
                                var70 = class194.field3794[class213.method1383(var72, (byte) 43, 96)];
                            }
                            int var73 = var5[var58][var61];
                            int var74 = var5[var58 + 1][var61];
                            int var75 = var5[var58][var61 + 1];
                            int var76 = var5[var58 + 1][var61 + 1];
                            if (var63 == 0) {
                                class125.method840(var7, var58, var61, 0, 0, -1, var66, var64, var65, var67, class213.method1383(var69, (byte) 26, var73), class213.method1383(var69, (byte) 40, var74), class213.method1383(var69, (byte) -118, var76), class213.method1383(var69, (byte) -7, var75), 0, 0, 0, 0, var70, 0);
                            } else {
                                int var77 = class70.field1485[var7][var58][var61] + 1;
                                byte var78 = class189.field3598[var7][var58][var61];
                                class89 var79 = class185.method1200(var63 - 1, 120);
                                int var80 = var79.field1748;
                                if (var80 >= 0 && !class194.field3786.method161(var80, -66)) {
                                    var80 = -1;
                                }
                                int var81;
                                int var82;
                                if (var80 >= 0) {
                                    var81 = -1;
                                    var82 = class194.field3794[class202.method1328(96, arg0 + 129, class194.field3786.method168(var80, 111))];
                                } else if (var79.field1750 == -1) {
                                    var82 = 0;
                                    var81 = -2;
                                } else {
                                    var81 = var79.field1750;
                                    int var83 = (var81 & 0x7F) + var6;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var81 & 0x380) + (var81 + var4 & 0xFC00) + var83;
                                    var82 = class194.field3794[class202.method1328(96, 126, var84)];
                                }
                                if (var79.field1759 >= 0) {
                                    int var85 = var79.field1759;
                                    int var86 = (var85 & 0x7F) + var6;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 127) {
                                        var86 = 127;
                                    }
                                    int var87 = (var85 + var4 & 0xFC00) + var86 + (var85 & 0x380);
                                    var82 = class194.field3794[class202.method1328(96, arg0 + 129, var87)];
                                }
                                class125.method840(var7, var58, var61, var77, var78, var80, var66, var64, var65, var67, class213.method1383(var69, (byte) -125, var73), class213.method1383(var69, (byte) -119, var74), class213.method1383(var69, (byte) -124, var76), class213.method1383(var69, (byte) 86, var75), class202.method1328(var73, arg0 + 129, var81), class202.method1328(var74, 126, var81), class202.method1328(var76, 126, var81), class202.method1328(var75, 126, var81), var70, var82);
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < 103; var59++) {
                for (int var60 = 1; var60 < 103; var60++) {
                    class6.method41(var7, var60, var59, class9.method59(var7, var59, 0, var60));
                }
            }
            class146.field2907[var7] = null;
            class139.field2789[var7] = null;
            class70.field1485[var7] = null;
            class189.field3598[var7] = null;
            client.field691[var7] = null;
        }
        class193.method1278(-50, -10, -50);
        for (int var8 = 0; var8 < 104; var8++) {
            for (int var49 = 0; var49 < 104; var49++) {
                if ((class59.field1239[1][var8][var49] & 0x2) == 2) {
                    class70.method413(var8, var49);
                }
            }
        }
        int var9 = 1;
        int var10 = 4;
        int var11 = 2;
        int var12 = 0;
        if (arg0 != -3) {
            method703((byte) 25, null);
        }
        while (var12 < 4) {
            if (var12 > 0) {
                var9 <<= 0x3;
                var11 <<= 0x3;
                var10 <<= 0x3;
            }
            for (int var13 = 0; var13 <= var12; var13++) {
                for (int var14 = 0; var14 <= 104; var14++) {
                    for (int var15 = 0; var15 <= 104; var15++) {
                        if ((var9 & client.field675[var13][var15][var14]) != 0) {
                            int var16;
                            for (var16 = var14; var16 > 0 && (var9 & client.field675[var13][var15][var16 - 1]) != 0; var16--) {
                            }
                            int var17 = var14;
                            int var18 = var13;
                            while (var17 < 104 && (var9 & client.field675[var13][var15][var17 + 1]) != 0) {
                                var17++;
                            }
                            int var19 = var13;
                            label356: while (var18 > 0) {
                                for (int var20 = var16; var20 <= var17; var20++) {
                                    if ((client.field675[var18 - 1][var15][var20] & var9) == 0) {
                                        break label356;
                                    }
                                }
                                var18--;
                            }
                            label345: while (var12 > var19) {
                                for (int var21 = var16; var21 <= var17; var21++) {
                                    if ((var9 & client.field675[var19 + 1][var15][var21]) == 0) {
                                        break label345;
                                    }
                                }
                                var19++;
                            }
                            int var22 = (var19 + 1 - var18) * (var17 + 1 - var16);
                            if (var22 >= 8) {
                                short var23 = 240;
                                int var24 = class125.field2538[var19][var15][var16] - var23;
                                int var25 = class125.field2538[var18][var15][var16];
                                class12.method79(var12, 1, var15 * 128, var15 * 128, var16 * 128, var17 * 128 + 128, var24, var25);
                                for (int var26 = var18; var26 <= var19; var26++) {
                                    for (int var27 = var16; var27 <= var17; var27++) {
                                        client.field675[var26][var15][var27] = class196.method1301(client.field675[var26][var15][var27], ~var9);
                                    }
                                }
                            }
                        }
                        if ((client.field675[var13][var15][var14] & var11) != 0) {
                            int var28;
                            for (var28 = var15; var28 > 0 && (var11 & client.field675[var13][var28 - 1][var14]) != 0; var28--) {
                            }
                            int var29 = var15;
                            int var30 = var13;
                            int var31 = var13;
                            while (var29 < 104 && (client.field675[var13][var29 + 1][var14] & var11) != 0) {
                                var29++;
                            }
                            label411: while (var30 > 0) {
                                for (int var32 = var28; var32 <= var29; var32++) {
                                    if ((var11 & client.field675[var30 - 1][var32][var14]) == 0) {
                                        break label411;
                                    }
                                }
                                var30--;
                            }
                            label400: while (var12 > var31) {
                                for (int var33 = var28; var33 <= var29; var33++) {
                                    if ((var11 & client.field675[var31 + 1][var33][var14]) == 0) {
                                        break label400;
                                    }
                                }
                                var31++;
                            }
                            int var34 = (var31 + 1 - var30) * (var29 - (var28 - 1));
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = class125.field2538[var31][var28][var14] - var35;
                                int var37 = class125.field2538[var30][var28][var14];
                                class12.method79(var12, 2, var28 * 128, var29 * 128 + 128, var14 * 128, var14 * 128, var36, var37);
                                for (int var38 = var30; var38 <= var31; var38++) {
                                    for (int var39 = var28; var39 <= var29; var39++) {
                                        client.field675[var38][var39][var14] = class196.method1301(client.field675[var38][var39][var14], ~var11);
                                    }
                                }
                            }
                        }
                        if ((client.field675[var13][var15][var14] & var10) != 0) {
                            int var40 = var15;
                            int var41 = var15;
                            int var42 = var14;
                            int var43 = var14;
                            while (var42 < 104 && (var10 & client.field675[var13][var15][var42 + 1]) != 0) {
                                var42++;
                            }
                            while (var43 > 0 && (client.field675[var13][var15][var43 - 1] & var10) != 0) {
                                var43--;
                            }
                            label465: while (var40 > 0) {
                                for (int var44 = var43; var44 <= var42; var44++) {
                                    if ((client.field675[var13][var40 - 1][var44] & var10) == 0) {
                                        break label465;
                                    }
                                }
                                var40--;
                            }
                            label454: while (var41 < 104) {
                                for (int var45 = var43; var45 <= var42; var45++) {
                                    if ((var10 & client.field675[var13][var41 + 1][var45]) == 0) {
                                        break label454;
                                    }
                                }
                                var41++;
                            }
                            if ((var41 + 1 - var40) * (var42 + 1 - var43) >= 4) {
                                int var46 = class125.field2538[var13][var40][var43];
                                class12.method79(var12, 4, var40 * 128, var41 * 128 + 128, var43 * 128, var42 * 128 + 128, var46, var46);
                                for (int var47 = var40; var47 <= var41; var47++) {
                                    for (int var48 = var43; var48 <= var42; var48++) {
                                        client.field675[var13][var47][var48] = class196.method1301(client.field675[var13][var47][var48], ~var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public static final void method704(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field963 = null;
        }
    }
}
