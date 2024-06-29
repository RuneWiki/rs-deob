import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class143 extends class262 {

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "[I")
    private int[] field2379 = new int[257];

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Lok;")
    public static class146 field2372 = class235.method1724(-12908, ",Mcran)2titre charg-B");

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field2382 = 0;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "Z")
    public static boolean field2385 = false;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "[[I")
    private int[][] field2380;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)I", line = 5)
    public static final int method1049(int arg0, int arg1) {
        field2377++;
        if (arg0 != 255) {
            method1053((byte) -13);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V", line = 17)
    public static final void method1050(byte arg0) {
        field2384++;
        class7.field141.method791(8);
        int var1 = 67 / ((-arg0 - 75) / 41);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V", line = 30)
    public static void method1051(int arg0) {
        if (arg0 == 6) {
            field2372 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 42)
    public class143() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)V", line = 47)
    private final void method1052(int arg0) {
        field2375++;
        int var2 = this.field2380.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5 = 0;
                for (int var6 = 0; var2 > var6 && this.field2380[var6][0] <= var4; var6++) {
                    var5++;
                }
                int var11;
                int var12;
                int var13;
                if (var2 > var5) {
                    int[] var7 = this.field2380[var5];
                    if (var5 > 0) {
                        int[] var8 = this.field2380[var5 - 1];
                        int var9 = (var4 - var8[0] << 12) / (var7[0] - var8[0]);
                        int var10 = 4096 - var9;
                        var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                    } else {
                        var11 = var7[1];
                        var12 = var7[3];
                        var13 = var7[2];
                    }
                } else {
                    int[] var14 = this.field2380[var2 - 1];
                    var11 = var14[1];
                    var13 = var14[2];
                    var12 = var14[3];
                }
                int var15 = var11 >> 4;
                int var16 = var13 >> 4;
                int var17 = var12 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field2379[var3] = class138.method1013(class138.method1013(var15 << 16, var16 << 8), var17);
            }
        }
        if (arg0 != 4165) {
            field2372 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)[Lpc;", line = 150)
    public static final class87[] method1053(byte arg0) {
        field2373++;
        if (class33.field638 == null) {
            class87[] var1 = class96.method661(class232.field3876, -1);
            class87[] var2 = new class87[var1.length];
            int var3 = 0;
            label52: for (int var4 = 0; var4 < var1.length; var4++) {
                class87 var5 = var1[var4];
                if ((var5.field1393 <= 0 || var5.field1393 >= 24) && var5.field1377 >= 800 && var5.field1390 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class87 var7 = var2[var6];
                        if (var5.field1377 == var7.field1377 && var5.field1390 == var7.field1390) {
                            if (var7.field1393 < var5.field1393) {
                                var2[var6] = var5;
                            }
                            continue label52;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class33.field638 = new class87[var3];
            class244.method1766(var2, 0, class33.field638, 0, var3);
            int[] var8 = new int[class33.field638.length];
            for (int var9 = 0; var9 < class33.field638.length; var9++) {
                class87 var10 = class33.field638[var9];
                var8[var9] = var10.field1390 * var10.field1377;
            }
            class174.method1345(class33.field638, (byte) -121, var8);
        }
        int var11 = 118 / ((22 - arg0) / 47);
        return class33.field638;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(II)V", line = 226)
    private final void method1054(int arg0, int arg1) {
        field2376++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2380 = new int[2][4];
                this.field2380[0][2] = 0;
                this.field2380[1][2] = 4096;
                this.field2380[0][0] = 0;
                this.field2380[0][1] = 0;
                this.field2380[0][3] = 0;
                this.field2380[1][1] = 4096;
                this.field2380[1][0] = 4096;
                this.field2380[1][3] = 4096;
            } else if (arg0 == 2) {
                this.field2380 = new int[8][4];
                this.field2380[0][1] = 2650;
                this.field2380[1][1] = 2313;
                this.field2380[0][0] = 0;
                this.field2380[2][1] = 2618;
                this.field2380[1][0] = 2867;
                this.field2380[3][1] = 2296;
                this.field2380[4][1] = 2072;
                this.field2380[2][0] = 3072;
                this.field2380[0][3] = 2361;
                this.field2380[0][2] = 2602;
                this.field2380[3][0] = 3276;
                this.field2380[5][1] = 2730;
                this.field2380[1][2] = 1799;
                this.field2380[4][0] = 3481;
                this.field2380[1][3] = 1558;
                this.field2380[2][3] = 1413;
                this.field2380[5][0] = 3686;
                this.field2380[3][3] = 947;
                this.field2380[6][0] = 3891;
                this.field2380[2][2] = 1734;
                this.field2380[4][3] = 722;
                this.field2380[5][3] = 1766;
                this.field2380[3][2] = 1220;
                this.field2380[6][3] = 915;
                this.field2380[7][3] = 1140;
                this.field2380[7][0] = 4096;
                this.field2380[4][2] = 963;
                this.field2380[5][2] = 2152;
                this.field2380[6][2] = 1060;
                this.field2380[6][1] = 2232;
                this.field2380[7][1] = 1686;
                this.field2380[7][2] = 1413;
            } else if (arg0 == 3) {
                this.field2380 = new int[7][4];
                this.field2380[0][1] = 0;
                this.field2380[1][1] = 0;
                this.field2380[2][1] = 0;
                this.field2380[0][3] = 4096;
                this.field2380[0][2] = 0;
                this.field2380[1][2] = 4096;
                this.field2380[2][2] = 4096;
                this.field2380[1][3] = 4096;
                this.field2380[0][0] = 0;
                this.field2380[1][0] = 663;
                this.field2380[3][2] = 4096;
                this.field2380[2][3] = 0;
                this.field2380[3][3] = 0;
                this.field2380[4][2] = 0;
                this.field2380[3][1] = 4096;
                this.field2380[5][2] = 0;
                this.field2380[4][1] = 4096;
                this.field2380[5][1] = 4096;
                this.field2380[6][1] = 0;
                this.field2380[2][0] = 1363;
                this.field2380[3][0] = 2048;
                this.field2380[4][3] = 0;
                this.field2380[6][2] = 0;
                this.field2380[4][0] = 2727;
                this.field2380[5][0] = 3411;
                this.field2380[5][3] = 4096;
                this.field2380[6][0] = 4096;
                this.field2380[6][3] = 4096;
            } else if (arg0 == 4) {
                this.field2380 = new int[6][4];
                this.field2380[0][2] = 0;
                this.field2380[0][0] = 0;
                this.field2380[0][3] = 0;
                this.field2380[1][0] = 1843;
                this.field2380[2][0] = 2457;
                this.field2380[0][1] = 0;
                this.field2380[1][3] = 1493;
                this.field2380[1][2] = 0;
                this.field2380[2][2] = 0;
                this.field2380[3][2] = 1124;
                this.field2380[4][2] = 3084;
                this.field2380[5][2] = 4096;
                this.field2380[3][0] = 2781;
                this.field2380[1][1] = 0;
                this.field2380[2][3] = 2939;
                this.field2380[3][3] = 3565;
                this.field2380[4][3] = 4031;
                this.field2380[4][0] = 3481;
                this.field2380[2][1] = 0;
                this.field2380[5][3] = 4096;
                this.field2380[3][1] = 0;
                this.field2380[5][0] = 4096;
                this.field2380[4][1] = 546;
                this.field2380[5][1] = 4096;
            } else if (arg0 == 5) {
                this.field2380 = new int[16][4];
                this.field2380[0][2] = 192;
                this.field2380[1][2] = 449;
                this.field2380[2][2] = 690;
                this.field2380[0][1] = 80;
                this.field2380[0][3] = 321;
                this.field2380[1][1] = 321;
                this.field2380[1][3] = 562;
                this.field2380[2][1] = 578;
                this.field2380[3][1] = 947;
                this.field2380[2][3] = 803;
                this.field2380[0][0] = 0;
                this.field2380[3][3] = 1140;
                this.field2380[4][1] = 1285;
                this.field2380[1][0] = 155;
                this.field2380[4][3] = 1509;
                this.field2380[2][0] = 389;
                this.field2380[5][3] = 1413;
                this.field2380[3][0] = 671;
                this.field2380[5][1] = 1525;
                this.field2380[3][2] = 995;
                this.field2380[4][0] = 897;
                this.field2380[5][0] = 1175;
                this.field2380[6][0] = 1368;
                this.field2380[6][3] = 1333;
                this.field2380[4][2] = 1397;
                this.field2380[7][0] = 1507;
                this.field2380[6][1] = 1734;
                this.field2380[5][2] = 1429;
                this.field2380[6][2] = 1461;
                this.field2380[8][0] = 1736;
                this.field2380[7][1] = 1413;
                this.field2380[7][2] = 1525;
                this.field2380[8][2] = 1590;
                this.field2380[7][3] = 1702;
                this.field2380[9][2] = 2056;
                this.field2380[8][1] = 1108;
                this.field2380[9][0] = 2088;
                this.field2380[10][2] = 2586;
                this.field2380[11][2] = 3148;
                this.field2380[10][0] = 2355;
                this.field2380[8][3] = 2056;
                this.field2380[12][2] = 3710;
                this.field2380[11][0] = 2691;
                this.field2380[9][1] = 1766;
                this.field2380[13][2] = 3421;
                this.field2380[14][2] = 3148;
                this.field2380[15][2] = 2505;
                this.field2380[9][3] = 2666;
                this.field2380[10][1] = 2409;
                this.field2380[12][0] = 3031;
                this.field2380[13][0] = 3522;
                this.field2380[10][3] = 3276;
                this.field2380[11][1] = 3116;
                this.field2380[12][1] = 3806;
                this.field2380[13][1] = 3437;
                this.field2380[11][3] = 3228;
                this.field2380[12][3] = 3196;
                this.field2380[13][3] = 3019;
                this.field2380[14][3] = 3228;
                this.field2380[15][3] = 2746;
                this.field2380[14][0] = 3727;
                this.field2380[14][1] = 3116;
                this.field2380[15][1] = 2377;
                this.field2380[15][0] = 4096;
            } else if (arg0 == 6) {
                this.field2380 = new int[4][4];
                this.field2380[0][2] = 4096;
                this.field2380[0][3] = 0;
                this.field2380[1][3] = 0;
                this.field2380[0][0] = 2048;
                this.field2380[2][3] = 0;
                this.field2380[3][3] = 0;
                this.field2380[0][1] = 0;
                this.field2380[1][2] = 4096;
                this.field2380[1][1] = 4096;
                this.field2380[2][1] = 4096;
                this.field2380[3][1] = 4096;
                this.field2380[2][2] = 4096;
                this.field2380[3][2] = 0;
                this.field2380[1][0] = 2867;
                this.field2380[2][0] = 3276;
                this.field2380[3][0] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1 != 4) {
            field2382 = -123;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)[[I", line = 482)
    public final int[][] method87(int arg0, int arg1) {
        field2383++;
        if (arg0 != 7) {
            this.method87(-50, 24);
        }
        int[][] var3 = this.field4347.method536(arg1, arg0 + 4089);
        if (this.field4347.field1202) {
            int[] var4 = this.method1895(7, 0, arg1);
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class98.field1598; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2379[var9];
                var6[var8] = class82.method582(4080, var10 >> 12);
                var7[var8] = class82.method582(4080, var10 >> 4);
                var5[var8] = class82.method582(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lwe;II)V", line = 530)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field2378++;
        if (arg1 != 2048) {
            this.method1052(39);
        }
        if (arg2 != 0) {
            return;
        }
        int var4 = arg0.method368(114);
        if (var4 != 0) {
            this.method1054(var4, 4);
            return;
        }
        this.field2380 = new int[arg0.method368(-126)][4];
        for (int var5 = 0; var5 < this.field2380.length; var5++) {
            this.field2380[var5][0] = arg0.method379(-2);
            this.field2380[var5][1] = arg0.method368(-112) << 4;
            this.field2380[var5][2] = arg0.method368(25) << 4;
            this.field2380[var5][3] = arg0.method368(74) << 4;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V", line = 576)
    public final void method43(int arg0) {
        if (this.field2380 == null) {
            this.method1054(1, 4);
        }
        this.method1052(4165);
        field2374++;
        if (arg0 != -2) {
            method1050((byte) -61);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIII)V", line = 591)
    public static final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2386++;
        if (arg3 >= 1 && arg1 >= 1 && arg3 <= 102 && arg1 <= 102) {
            if (!class322.method2236(-7750) && (class46.field775[0][arg3][arg1] & 0x2) == 0) {
                int var8 = arg5;
                if ((class46.field775[arg5][arg3][arg1] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class201.field3358 != var8) {
                    return;
                }
            }
            int var9 = arg5;
            if (arg5 < 3 && (class46.field775[1][arg3][arg1] & 0x2) == 2) {
                var9 = arg5 + 1;
            }
            class190.method1467(var9, 10, arg1, arg5, arg3, class251.field4202[arg5], arg0);
            if (arg2 >= 0) {
                boolean var10 = class76.field1230;
                class76.field1230 = true;
                class309.method2180(arg6, arg7, false, arg3, class251.field4202[arg5], var9, arg2, arg5, false, arg1, 2);
                class76.field1230 = var10;
            }
        }
        if (arg4 < 121) {
            field2372 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V", line = 658)
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class57.field1010 < 100) {
            class150.method1188(-1);
        }
        if (class271.field4640) {
            class131.method973(arg2, arg3, arg0 + arg2, arg1 + arg3);
        } else {
            class181.method1420(arg2, arg3, arg2 + arg0, arg1 + arg3);
        }
        field2381++;
        if (class57.field1010 < 100) {
            byte var14 = 20;
            int var15 = arg0 / 2 + arg2;
            int var16 = arg1 / 2 + arg3 - var14 - 18;
            if (class271.field4640) {
                class131.method978(arg2, arg3, arg0, arg1, 0);
                class131.method965(var15 - 152, var16, 304, 34, 9179409);
                class131.method965(var15 - 151, var16 + 1, 302, 32, 0);
                class131.method978(var15 - 150, var16 + 2, class57.field1010 * 3, 30, 9179409);
                class131.method978(class57.field1010 * 3 + (var15 - 150), var16 + 2, 300 - (class57.field1010 * 3), 30, 0);
            } else {
                class181.method1416(arg2, arg3, arg0, arg1, 0);
                class181.method1435(var15 - 152, var16, 304, 34, 9179409);
                class181.method1435(var15 - 151, var16 + 1, 302, 32, 0);
                class181.method1416(var15 - 150, var16 + 2, class57.field1010 * 3, 30, 9179409);
                class181.method1416(var15 - (150 - class57.field1010 * 3), var16 + 2, 300 - (class57.field1010 * 3), 30, 0);
            }
            class39.field695.method209(class66.field1118, var15, var14 + var16, 16777215, -1);
            return;
        }
        class14.field265 = (int) ((float) (arg1 * 2) / class133.field2231);
        if (arg4 != 9325) {
            method1056(62, 68, -71, 16, -6);
        }
        class174.field2916 = class236.field3937 - ((int) ((float) arg1 / class133.field2231));
        class195.field3243 = (int) ((float) (arg0 * 2) / class133.field2231);
        class86.field1375 = class148.field2508 - ((int) ((float) arg0 / class133.field2231));
        int var5 = class148.field2508 - ((int) ((float) arg0 / class133.field2231));
        int var6 = class236.field3937 - ((int) ((float) arg1 / class133.field2231));
        int var7 = (int) ((float) arg0 / class133.field2231) + class148.field2508;
        int var8 = class236.field3937 + ((int) ((float) arg1 / class133.field2231));
        if (class271.field4640) {
            if (class142.field2368 == null || class142.field2368.field1145 != arg0 || class142.field2368.field1155 != arg1) {
                class142.field2368 = null;
                class142.field2368 = new class307(arg0, arg1);
            }
            class181.method1430(class142.field2368.field5243, arg0, arg1);
            class121.method841(var8, var7, arg4 + 1983153379, var5, arg1, var6, 0, 0, arg0);
            class295.method2103(var6, arg0, 0, 0, var8, var7, true, var5, arg1);
            class70.method519(var6, arg0, arg1, var8, var5, 0, (byte) -123, 0, var7);
            class131.method966(class142.field2368.field5243, arg2, arg3, arg0, arg1);
        } else {
            class121.method841(var8, var7, 1983162704, var5, arg1 + arg3, var6, arg2, arg3, arg0 + arg2);
            class295.method2103(var6, arg2 + arg0, arg3, arg2, var8, var7, true, var5, arg1 + arg3);
            class70.method519(var6, arg2 + arg0, arg1 + arg3, var8, var5, arg2, (byte) -128, arg3, var7);
        }
        if (class198.field3306 > 0) {
            class198.field3306--;
        }
        if (!class214.field3526) {
            return;
        }
        int var9 = arg1 + arg3 - 8;
        int var10 = arg0 + arg2 - 5;
        class187.field3109.method222(class112.method758(121, new class146[] { class254.field4235, class82.method585(14744, client.field4083) }), var10, var9, 16776960, -1);
        int var17 = var9 - 15;
        int var11 = 16776960;
        Runtime var12 = Runtime.getRuntime();
        int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var11 = 16711680;
        }
        class187.field3109.method222(class112.method758(-124, new class146[] { class161.field2716, class82.method585(14744, var13), class306.field5229 }), var10, var17, var11, -1);
        var9 = var17 - 15;
    }
}
