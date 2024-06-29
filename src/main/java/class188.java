import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class188 extends class86 {

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "[I")
    private int[] field2942 = new int[257];

    @OriginalMember(owner = "client!kn", name = "Y", descriptor = "I")
    public static int field2955 = 0;

    @OriginalMember(owner = "client!kn", name = "V", descriptor = "[S")
    public static short[] field2952 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!kn", name = "X", descriptor = "Lfk;")
    public static class317 field2954 = new class317();

    @OriginalMember(owner = "client!kn", name = "bb", descriptor = "[I")
    public static int[] field2958 = new int[100];

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!kn", name = "Q", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!kn", name = "S", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!kn", name = "U", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!kn", name = "W", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!kn", name = "Z", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!kn", name = "ab", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!kn", name = "cb", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!kn", name = "db", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!kn", name = "T", descriptor = "Lpl;")
    public static class344 field2950;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "[[I")
    private int[][] field2943;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V", line = 6)
    public final void method476(int arg0) {
        if (this.field2943 == null) {
            this.method1440(1, arg0 ^ 0x7AFA);
        }
        field2953++;
        if (arg0 == 0) {
            this.method1446(arg0 - 11062);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII)Z", line = 22)
    public static final boolean method1439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2945++;
        for (int var6 = arg2; var6 < arg5; var6++) {
            for (int var7 = arg1; var7 < arg3; var7++) {
                if (class244.field3809[var6][var7] == arg0 && class206.field3171[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg4 != 9462) {
            method1441(123, (byte) -56);
        }
        return false;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(II)V", line = 54)
    private final void method1440(int arg0, int arg1) {
        field2956++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2943 = new int[2][4];
                this.field2943[0][2] = 0;
                this.field2943[1][2] = 4096;
                this.field2943[0][1] = 0;
                this.field2943[0][0] = 0;
                this.field2943[1][1] = 4096;
                this.field2943[0][3] = 0;
                this.field2943[1][3] = 4096;
                this.field2943[1][0] = 4096;
            } else if (arg0 == 2) {
                this.field2943 = new int[8][4];
                this.field2943[0][0] = 0;
                this.field2943[0][2] = 2602;
                this.field2943[0][3] = 2361;
                this.field2943[0][1] = 2650;
                this.field2943[1][0] = 2867;
                this.field2943[2][0] = 3072;
                this.field2943[1][3] = 1558;
                this.field2943[3][0] = 3276;
                this.field2943[1][1] = 2313;
                this.field2943[2][1] = 2618;
                this.field2943[4][0] = 3481;
                this.field2943[5][0] = 3686;
                this.field2943[6][0] = 3891;
                this.field2943[1][2] = 1799;
                this.field2943[2][3] = 1413;
                this.field2943[2][2] = 1734;
                this.field2943[3][2] = 1220;
                this.field2943[3][1] = 2296;
                this.field2943[4][1] = 2072;
                this.field2943[4][2] = 963;
                this.field2943[7][0] = 4096;
                this.field2943[5][1] = 2730;
                this.field2943[3][3] = 947;
                this.field2943[4][3] = 722;
                this.field2943[5][2] = 2152;
                this.field2943[5][3] = 1766;
                this.field2943[6][1] = 2232;
                this.field2943[6][3] = 915;
                this.field2943[7][3] = 1140;
                this.field2943[6][2] = 1060;
                this.field2943[7][2] = 1413;
                this.field2943[7][1] = 1686;
            } else if (arg0 == 3) {
                this.field2943 = new int[7][4];
                this.field2943[0][3] = 4096;
                this.field2943[0][0] = 0;
                this.field2943[0][2] = 0;
                this.field2943[1][0] = 663;
                this.field2943[1][2] = 4096;
                this.field2943[2][0] = 1363;
                this.field2943[0][1] = 0;
                this.field2943[1][1] = 0;
                this.field2943[3][0] = 2048;
                this.field2943[4][0] = 2727;
                this.field2943[1][3] = 4096;
                this.field2943[2][2] = 4096;
                this.field2943[5][0] = 3411;
                this.field2943[6][0] = 4096;
                this.field2943[3][2] = 4096;
                this.field2943[4][2] = 0;
                this.field2943[2][3] = 0;
                this.field2943[2][1] = 0;
                this.field2943[3][3] = 0;
                this.field2943[4][3] = 0;
                this.field2943[5][2] = 0;
                this.field2943[5][3] = 4096;
                this.field2943[6][2] = 0;
                this.field2943[6][3] = 4096;
                this.field2943[3][1] = 4096;
                this.field2943[4][1] = 4096;
                this.field2943[5][1] = 4096;
                this.field2943[6][1] = 0;
            } else if (arg0 == 4) {
                this.field2943 = new int[6][4];
                this.field2943[0][1] = 0;
                this.field2943[0][0] = 0;
                this.field2943[0][3] = 0;
                this.field2943[1][1] = 0;
                this.field2943[1][0] = 1843;
                this.field2943[2][1] = 0;
                this.field2943[3][1] = 0;
                this.field2943[2][0] = 2457;
                this.field2943[3][0] = 2781;
                this.field2943[4][0] = 3481;
                this.field2943[1][3] = 1493;
                this.field2943[4][1] = 546;
                this.field2943[2][3] = 2939;
                this.field2943[5][1] = 4096;
                this.field2943[0][2] = 0;
                this.field2943[1][2] = 0;
                this.field2943[5][0] = 4096;
                this.field2943[3][3] = 3565;
                this.field2943[4][3] = 4031;
                this.field2943[5][3] = 4096;
                this.field2943[2][2] = 0;
                this.field2943[3][2] = 1124;
                this.field2943[4][2] = 3084;
                this.field2943[5][2] = 4096;
            } else if (arg0 == 5) {
                this.field2943 = new int[16][4];
                this.field2943[0][2] = 192;
                this.field2943[0][1] = 80;
                this.field2943[1][2] = 449;
                this.field2943[1][1] = 321;
                this.field2943[0][3] = 321;
                this.field2943[1][3] = 562;
                this.field2943[2][1] = 578;
                this.field2943[2][2] = 690;
                this.field2943[3][2] = 995;
                this.field2943[4][2] = 1397;
                this.field2943[2][3] = 803;
                this.field2943[0][0] = 0;
                this.field2943[5][2] = 1429;
                this.field2943[6][2] = 1461;
                this.field2943[1][0] = 155;
                this.field2943[3][1] = 947;
                this.field2943[7][2] = 1525;
                this.field2943[3][3] = 1140;
                this.field2943[8][2] = 1590;
                this.field2943[2][0] = 389;
                this.field2943[3][0] = 671;
                this.field2943[4][1] = 1285;
                this.field2943[4][0] = 897;
                this.field2943[9][2] = 2056;
                this.field2943[10][2] = 2586;
                this.field2943[11][2] = 3148;
                this.field2943[4][3] = 1509;
                this.field2943[5][1] = 1525;
                this.field2943[6][1] = 1734;
                this.field2943[5][3] = 1413;
                this.field2943[5][0] = 1175;
                this.field2943[6][0] = 1368;
                this.field2943[12][2] = 3710;
                this.field2943[6][3] = 1333;
                this.field2943[7][0] = 1507;
                this.field2943[7][1] = 1413;
                this.field2943[7][3] = 1702;
                this.field2943[8][1] = 1108;
                this.field2943[8][0] = 1736;
                this.field2943[13][2] = 3421;
                this.field2943[9][1] = 1766;
                this.field2943[8][3] = 2056;
                this.field2943[9][3] = 2666;
                this.field2943[10][1] = 2409;
                this.field2943[10][3] = 3276;
                this.field2943[9][0] = 2088;
                this.field2943[10][0] = 2355;
                this.field2943[11][0] = 2691;
                this.field2943[11][3] = 3228;
                this.field2943[11][1] = 3116;
                this.field2943[12][1] = 3806;
                this.field2943[14][2] = 3148;
                this.field2943[12][0] = 3031;
                this.field2943[13][1] = 3437;
                this.field2943[14][1] = 3116;
                this.field2943[12][3] = 3196;
                this.field2943[15][2] = 2505;
                this.field2943[13][3] = 3019;
                this.field2943[15][1] = 2377;
                this.field2943[14][3] = 3228;
                this.field2943[13][0] = 3522;
                this.field2943[14][0] = 3727;
                this.field2943[15][0] = 4096;
                this.field2943[15][3] = 2746;
            } else if (arg0 == 6) {
                this.field2943 = new int[4][4];
                this.field2943[0][2] = 4096;
                this.field2943[0][0] = 2048;
                this.field2943[0][1] = 0;
                this.field2943[1][0] = 2867;
                this.field2943[1][1] = 4096;
                this.field2943[1][2] = 4096;
                this.field2943[0][3] = 0;
                this.field2943[2][0] = 3276;
                this.field2943[2][1] = 4096;
                this.field2943[1][3] = 0;
                this.field2943[3][1] = 4096;
                this.field2943[2][3] = 0;
                this.field2943[3][0] = 4096;
                this.field2943[2][2] = 4096;
                this.field2943[3][3] = 0;
                this.field2943[3][2] = 0;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1 != 31482) {
            this.field2943 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IB)[[I", line = 312)
    public final int[][] method156(int arg0, byte arg1) {
        if (arg1 >= -126) {
            this.method156(-17, (byte) 14);
        }
        field2947++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int[] var4 = this.method774(0, arg0, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class93.field1424; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2942[var9];
                var6[var8] = class301.method2169(16711680, var10) >> 12;
                var5[var8] = class301.method2169(var10, 65280) >> 4;
                var7[var8] = class301.method2169(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(IB)V", line = 361)
    public static final void method1441(int arg0, byte arg1) {
        field2957++;
        class148.field2423.method649((byte) 75, arg0);
        if (arg1 != 117) {
            method1441(108, (byte) 17);
        }
    }

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)I", line = 375)
    public static final int method1442(int arg0) {
        field2944++;
        if (arg0 != 1) {
            field2952 = (short[]) null;
        }
        return class99.field1493;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IJ)V", line = 386)
    public static final void method1443(int arg0, long arg1) {
        field2960++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % (long) arg0) == 0L) {
            class239.method1776((byte) -117, arg1 - 1L);
            class239.method1776((byte) -117, 1L);
        } else {
            class239.method1776((byte) -117, arg1);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V", line = 405)
    public static final void method1444(boolean arg0, int arg1) {
        if (arg0) {
            class362.field5734.method649((byte) 75, arg1);
            field2946++;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lbi;BZ)V", line = 416)
    public static final void method1445(class145 arg0, byte arg1, boolean arg2) {
        field2959++;
        if (class240.field3737 || arg2) {
            int var3 = class362.field5740;
            int var4 = var3 * 956 / 503;
            class298.field4625.method13((class126.field2113 - var4) / 2, 0, var4, var3);
            class191.field3009.method711(class126.field2113 / 2 - class191.field3009.field3827 / 2, 18);
        }
        arg0.method1189(class165.field2629 == 1 ? class31.field483 : class352.field5627, class126.field2113 / 2, class362.field5740 / 2 - 26, 16777215, -1);
        int var5 = class362.field5740 / 2 - 18;
        if (arg1 != -46) {
            method1449(114);
        }
        if (class240.field3737) {
            class213.method1599(class126.field2113 / 2 - 152, var5, 304, 34, 9179409);
            class213.method1599(class126.field2113 / 2 - 151, var5 + 1, 302, 32, 0);
            class213.method1593(class126.field2113 / 2 - 150, var5 - -2, class338.field5196 * 3, 30, 9179409);
            class213.method1593(class338.field5196 * 3 + class126.field2113 / 2 - 150, var5 + 2, 300 - (class338.field5196 * 3), 30, 0);
        } else {
            class60.method604(class126.field2113 / 2 - 152, var5, 304, 34, 9179409);
            class60.method604(class126.field2113 / 2 - 151, var5 + 1, 302, 32, 0);
            class60.method611(class126.field2113 / 2 - 150, var5 + 2, class338.field5196 * 3, 30, 9179409);
            class60.method611(class126.field2113 / 2 + (class338.field5196 * 3) - 150, var5 - -2, 300 - (class338.field5196 * 3), 30, 0);
        }
        arg0.method1189(class195.field3069, class126.field2113 / 2, class362.field5740 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "(I)V", line = 459)
    private final void method1446(int arg0) {
        field2951++;
        int var2 = this.field2943.length;
        if (arg0 != -11062) {
            field2950 = (class344) null;
        }
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && this.field2943[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 > var4) {
                int[] var7 = this.field2943[var4];
                if (var4 <= 0) {
                    var8 = var7[1];
                    var9 = var7[3];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field2943[var4 - 1];
                    int var12 = (var5 - var11[0] << 12) / (var7[0] - var11[0]);
                    int var13 = 4096 - var12;
                    var9 = var7[3] * var12 + var11[3] * var13 >> 12;
                    var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                    var10 = var7[2] * var12 + (var11[2] * var13) >> 12;
                }
            } else {
                int[] var14 = this.field2943[var2 - 1];
                var10 = var14[2];
                var9 = var14[3];
                var8 = var14[1];
            }
            int var15 = var8 >> 4;
            int var16 = var9 >> 4;
            int var17 = var10 >> 4;
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
            this.field2942[var3] = class41.method426(class41.method426(var17 << 8, var15 << 16), var16);
        }
    }

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "(I)V", line = 566)
    public static final void method1447(int arg0) {
        field2948++;
        class235.field3667.method656(0);
        if (arg0 < 5) {
            method1443(30, -89L);
        }
        class134.field2247.method656(0);
        class311.field4841.method656(0);
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 601)
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZLug;)V", line = 608)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field2949++;
        if (arg1 || arg0 != 0) {
            return;
        }
        int var4 = arg2.method281(-124);
        if (var4 != 0) {
            this.method1440(var4, 31482);
            return;
        }
        this.field2943 = new int[arg2.method281(87)][4];
        for (int var5 = 0; var5 < this.field2943.length; var5++) {
            this.field2943[var5][0] = arg2.method314((byte) 59);
            this.field2943[var5][1] = arg2.method281(28) << 4;
            this.field2943[var5][2] = arg2.method281(-126) << 4;
            this.field2943[var5][3] = arg2.method281(-124) << 4;
        }
    }

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "(I)V", line = 647)
    public static final void method1448(int arg0) {
        field2941++;
        class294.field4576.method656(arg0 - 1830);
        class211.field3246.method656(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "(I)V", line = 656)
    public static void method1449(int arg0) {
        field2958 = null;
        field2950 = null;
        field2952 = null;
        int var1 = -7 / ((arg0 - 69) / 36);
        field2954 = null;
    }
}
