import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class344 extends class326 {

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "[I")
    private int[] field5343 = new int[257];

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "Lrm;")
    public static class184 field5345 = new class184(5);

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "Ljava/lang/String;")
    public static String field5346 = "glow2:";

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "[Lkl;")
    public static class36[] field5347 = new class36[50];

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "Luj;")
    public static class169 field5342;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "Ltn;")
    public static class38 field5348;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "[[I")
    private int[][] field5339;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method2376(int arg0, int arg1, int arg2, int arg3) {
        field5337++;
        int var4 = arg2 / arg0;
        if (arg3 != 1994) {
            return -109;
        }
        int var5 = arg1 / arg0;
        int var6 = arg2 & arg0 - 1;
        int var7 = arg0 - 1 & arg1;
        int var8 = class30.method274(1, var5, var4);
        int var9 = class30.method274(1, var5, var4 + 1);
        int var10 = class30.method274(arg3 ^ 0x7CB, var5 + 1, var4);
        int var11 = class30.method274(arg3 - 1993, var5 + 1, var4 + 1);
        int var12 = class258.method1862(var9, 2352272, var8, arg0, var6);
        int var13 = class258.method1862(var11, 2352272, var10, arg0, var6);
        return class258.method1862(var13, 2352272, var12, arg0, var7);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 38)
    public class344() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[[I", line = 45)
    public final int[][] method253(int arg0, byte arg1) {
        field5341++;
        int[][] var3 = this.field5104.method2365((byte) -87, arg0);
        if (this.field5104.field5325) {
            int[] var4 = this.method2287(0, arg0, -3896);
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class166.field2731; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field5343[var9];
                var6[var8] = class333.method2319(16711680, var10) >> 12;
                var7[var8] = class333.method2319(var10, 65280) >> 4;
                var5[var8] = class333.method2319(255, var10) << 4;
            }
        }
        int var11 = 106 % ((60 - arg1) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 93)
    public static void method2377(int arg0) {
        field5348 = null;
        if (arg0 < 38) {
            method2377(12);
        }
        field5346 = null;
        field5345 = null;
        field5347 = null;
        field5342 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZILug;)Luj;", line = 107)
    public static final class169 method2378(boolean arg0, int arg1, class253 arg2) {
        field5336++;
        if (arg0) {
            field5342 = (class169) null;
        }
        return class192.method1415(arg2, arg1, 17082) ? class138.method1028(-123) : null;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)V", line = 124)
    public final void method99(byte arg0) {
        field5344++;
        if (this.field5339 == null) {
            this.method2380(1, 3);
        }
        if (arg0 == 31) {
            this.method2379(4);
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V", line = 147)
    private final void method2379(int arg0) {
        field5340++;
        int var2 = this.field5339.length;
        if (arg0 != 4) {
            this.method2380(-101, 15);
        }
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && this.field5339[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 >= var2) {
                int[] var7 = this.field5339[var2 - 1];
                var8 = var7[2];
                var9 = var7[3];
                var10 = var7[1];
            } else {
                int[] var11 = this.field5339[var4];
                if (var4 <= 0) {
                    var8 = var11[2];
                    var9 = var11[3];
                    var10 = var11[1];
                } else {
                    int[] var12 = this.field5339[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var9 = var11[3] * var13 + (var12[3] * var14) >> 12;
                    var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var10 = var11[1] * var13 + (var12[1] * var14) >> 12;
                }
            }
            int var15 = var10 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var9 >> 4;
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            this.field5343[var3] = class214.method1562(class214.method1562(var15 << 16, var17 << 8), var16);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZLvl;)V", line = 252)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field5335++;
        if (arg0 == 0) {
            int var4 = arg2.method58(-288140008);
            if (var4 == 0) {
                this.field5339 = new int[arg2.method58(-288140008)][4];
                for (int var5 = 0; var5 < this.field5339.length; var5++) {
                    this.field5339[var5][0] = arg2.method39((byte) 32);
                    this.field5339[var5][1] = arg2.method58(-288140008) << 4;
                    this.field5339[var5][2] = arg2.method58(-288140008) << 4;
                    this.field5339[var5][3] = arg2.method58(-288140008) << 4;
                }
            } else {
                this.method2380(var4, 3);
            }
        }
        if (arg1) {
            this.method253(-37, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V", line = 290)
    private final void method2380(int arg0, int arg1) {
        field5334++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field5339 = new int[2][4];
                this.field5339[0][3] = 0;
                this.field5339[1][3] = 4096;
                this.field5339[0][2] = 0;
                this.field5339[1][2] = 4096;
                this.field5339[0][0] = 0;
                this.field5339[0][1] = 0;
                this.field5339[1][1] = 4096;
                this.field5339[1][0] = 4096;
            } else if (arg0 == 2) {
                this.field5339 = new int[8][4];
                this.field5339[0][0] = 0;
                this.field5339[0][1] = 2650;
                this.field5339[0][2] = 2602;
                this.field5339[1][2] = 1799;
                this.field5339[1][1] = 2313;
                this.field5339[2][2] = 1734;
                this.field5339[3][2] = 1220;
                this.field5339[1][0] = 2867;
                this.field5339[0][3] = 2361;
                this.field5339[2][0] = 3072;
                this.field5339[4][2] = 963;
                this.field5339[1][3] = 1558;
                this.field5339[5][2] = 2152;
                this.field5339[2][3] = 1413;
                this.field5339[2][1] = 2618;
                this.field5339[6][2] = 1060;
                this.field5339[3][3] = 947;
                this.field5339[3][0] = 3276;
                this.field5339[3][1] = 2296;
                this.field5339[4][3] = 722;
                this.field5339[5][3] = 1766;
                this.field5339[7][2] = 1413;
                this.field5339[4][1] = 2072;
                this.field5339[6][3] = 915;
                this.field5339[4][0] = 3481;
                this.field5339[7][3] = 1140;
                this.field5339[5][1] = 2730;
                this.field5339[6][1] = 2232;
                this.field5339[7][1] = 1686;
                this.field5339[5][0] = 3686;
                this.field5339[6][0] = 3891;
                this.field5339[7][0] = 4096;
            } else if (arg0 == 3) {
                this.field5339 = new int[7][4];
                this.field5339[0][1] = 0;
                this.field5339[1][1] = 0;
                this.field5339[2][1] = 0;
                this.field5339[3][1] = 4096;
                this.field5339[0][2] = 0;
                this.field5339[0][0] = 0;
                this.field5339[1][0] = 663;
                this.field5339[0][3] = 4096;
                this.field5339[2][0] = 1363;
                this.field5339[1][3] = 4096;
                this.field5339[2][3] = 0;
                this.field5339[3][3] = 0;
                this.field5339[4][3] = 0;
                this.field5339[1][2] = 4096;
                this.field5339[4][1] = 4096;
                this.field5339[5][1] = 4096;
                this.field5339[5][3] = 4096;
                this.field5339[6][3] = 4096;
                this.field5339[3][0] = 2048;
                this.field5339[2][2] = 4096;
                this.field5339[3][2] = 4096;
                this.field5339[6][1] = 0;
                this.field5339[4][0] = 2727;
                this.field5339[4][2] = 0;
                this.field5339[5][0] = 3411;
                this.field5339[5][2] = 0;
                this.field5339[6][0] = 4096;
                this.field5339[6][2] = 0;
            } else if (arg0 == 4) {
                this.field5339 = new int[6][4];
                this.field5339[0][2] = 0;
                this.field5339[0][3] = 0;
                this.field5339[0][0] = 0;
                this.field5339[1][2] = 0;
                this.field5339[1][3] = 1493;
                this.field5339[1][0] = 1843;
                this.field5339[2][3] = 2939;
                this.field5339[0][1] = 0;
                this.field5339[2][2] = 0;
                this.field5339[2][0] = 2457;
                this.field5339[3][0] = 2781;
                this.field5339[3][3] = 3565;
                this.field5339[3][2] = 1124;
                this.field5339[4][3] = 4031;
                this.field5339[4][0] = 3481;
                this.field5339[1][1] = 0;
                this.field5339[4][2] = 3084;
                this.field5339[5][2] = 4096;
                this.field5339[5][3] = 4096;
                this.field5339[5][0] = 4096;
                this.field5339[2][1] = 0;
                this.field5339[3][1] = 0;
                this.field5339[4][1] = 546;
                this.field5339[5][1] = 4096;
            } else if (arg0 == 5) {
                this.field5339 = new int[16][4];
                this.field5339[0][3] = 321;
                this.field5339[0][2] = 192;
                this.field5339[1][3] = 562;
                this.field5339[2][3] = 803;
                this.field5339[0][0] = 0;
                this.field5339[3][3] = 1140;
                this.field5339[1][2] = 449;
                this.field5339[0][1] = 80;
                this.field5339[1][0] = 155;
                this.field5339[2][2] = 690;
                this.field5339[2][0] = 389;
                this.field5339[4][3] = 1509;
                this.field5339[1][1] = 321;
                this.field5339[3][2] = 995;
                this.field5339[3][0] = 671;
                this.field5339[4][2] = 1397;
                this.field5339[5][2] = 1429;
                this.field5339[5][3] = 1413;
                this.field5339[6][3] = 1333;
                this.field5339[6][2] = 1461;
                this.field5339[4][0] = 897;
                this.field5339[7][2] = 1525;
                this.field5339[7][3] = 1702;
                this.field5339[8][2] = 1590;
                this.field5339[2][1] = 578;
                this.field5339[3][1] = 947;
                this.field5339[9][2] = 2056;
                this.field5339[4][1] = 1285;
                this.field5339[5][1] = 1525;
                this.field5339[5][0] = 1175;
                this.field5339[6][0] = 1368;
                this.field5339[8][3] = 2056;
                this.field5339[7][0] = 1507;
                this.field5339[9][3] = 2666;
                this.field5339[10][2] = 2586;
                this.field5339[8][0] = 1736;
                this.field5339[9][0] = 2088;
                this.field5339[10][3] = 3276;
                this.field5339[11][3] = 3228;
                this.field5339[12][3] = 3196;
                this.field5339[6][1] = 1734;
                this.field5339[13][3] = 3019;
                this.field5339[10][0] = 2355;
                this.field5339[14][3] = 3228;
                this.field5339[15][3] = 2746;
                this.field5339[11][0] = 2691;
                this.field5339[12][0] = 3031;
                this.field5339[7][1] = 1413;
                this.field5339[8][1] = 1108;
                this.field5339[11][2] = 3148;
                this.field5339[13][0] = 3522;
                this.field5339[9][1] = 1766;
                this.field5339[12][2] = 3710;
                this.field5339[14][0] = 3727;
                this.field5339[13][2] = 3421;
                this.field5339[10][1] = 2409;
                this.field5339[14][2] = 3148;
                this.field5339[11][1] = 3116;
                this.field5339[15][0] = 4096;
                this.field5339[12][1] = 3806;
                this.field5339[13][1] = 3437;
                this.field5339[15][2] = 2505;
                this.field5339[14][1] = 3116;
                this.field5339[15][1] = 2377;
            } else if (arg0 == 6) {
                this.field5339 = new int[4][4];
                this.field5339[0][2] = 4096;
                this.field5339[0][0] = 2048;
                this.field5339[0][1] = 0;
                this.field5339[1][2] = 4096;
                this.field5339[2][2] = 4096;
                this.field5339[1][1] = 4096;
                this.field5339[2][1] = 4096;
                this.field5339[1][0] = 2867;
                this.field5339[0][3] = 0;
                this.field5339[1][3] = 0;
                this.field5339[3][1] = 4096;
                this.field5339[2][0] = 3276;
                this.field5339[3][2] = 0;
                this.field5339[3][0] = 4096;
                this.field5339[2][3] = 0;
                this.field5339[3][3] = 0;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1 != 3) {
            this.method98(-11, false, (class6) null);
        }
    }
}
