import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class202 extends class112 {

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "[I")
    private int[] field3268 = new int[257];

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "Lwm;")
    public static class152 field3261 = class157.method1048(":", 116);

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field3263 = -1;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field3269 = 0;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field3270 = 0;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field3262 = 0;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lwm;")
    private static class152 field3272 = class157.method1048("red:", 126);

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "Lwm;")
    public static class152 field3265 = field3272;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "Lwm;")
    public static class152 field3255 = field3272;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "[[B")
    public static byte[][] field3267;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "[[I")
    private int[][] field3258;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "[[[Lkb;")
    public static class34[][][] field3271;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)[[I", line = 24)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            field3259 = 72;
        }
        int[][] var3 = this.field1594.method656((byte) 126, arg0);
        field3260++;
        if (this.field1594.field1402) {
            int[] var4 = this.method751(arg0, (byte) 101, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class58.field889; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3268[var9];
                var5[var8] = class34.method251(var10, 16711680) >> 12;
                var6[var8] = class34.method251(var10, 65280) >> 4;
                var7[var8] = class34.method251(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILhi;)V", line = 81)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field3266++;
        if (arg1 == 0) {
            int var4 = arg2.method2011(arg0 ^ 0xFFFF8676);
            if (var4 == 0) {
                this.field3258 = new int[arg2.method2011(-118)][4];
                for (int var5 = 0; var5 < this.field3258.length; var5++) {
                    this.field3258[var5][0] = arg2.method2021((byte) 74);
                    this.field3258[var5][1] = arg2.method2011(-18) << 4;
                    this.field3258[var5][2] = arg2.method2011(class223.method1543(arg0, -31182)) << 4;
                    this.field3258[var5][3] = arg2.method2011(-57) << 4;
                }
            } else {
                this.method1339((byte) -19, var4);
            }
        }
        if (arg0 != 31164) {
            this.method55(-30, false);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII)V", line = 119)
    public static final void method1337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class30 var7 = new class30();
        var7.field490 = arg1 / 128;
        var7.field504 = arg2 / 128;
        var7.field501 = arg3 / 128;
        var7.field499 = arg4 / 128;
        var7.field498 = arg0;
        var7.field492 = arg1;
        var7.field503 = arg2;
        var7.field510 = arg3;
        var7.field511 = arg4;
        var7.field508 = arg5;
        var7.field512 = arg6;
        class139.field2121[class30.field518++] = var7;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V", line = 138)
    private final void method1338(byte arg0) {
        if (arg0 != -50) {
            this.method673(42);
        }
        field3257++;
        int var2 = this.field3258.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && this.field3258[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 >= var2) {
                int[] var7 = this.field3258[var2 - 1];
                var8 = var7[3];
                var9 = var7[2];
                var10 = var7[1];
            } else {
                int[] var11 = this.field3258[var4];
                if (var4 > 0) {
                    int[] var12 = this.field3258[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                } else {
                    var8 = var11[3];
                    var10 = var11[1];
                    var9 = var11[2];
                }
            }
            int var15 = var10 >> 4;
            int var16 = var9 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var17 = var8 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field3268[var3] = class72.method493(var17, class72.method493(var16 << 8, var15 << 16));
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 510)
    public class202() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(BI)V", line = 255)
    private final void method1339(byte arg0, int arg1) {
        if (arg0 != -19) {
            return;
        }
        field3264++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field3258 = new int[2][4];
            this.field3258[0][1] = 0;
            this.field3258[0][0] = 0;
            this.field3258[1][0] = 4096;
            this.field3258[0][3] = 0;
            this.field3258[0][2] = 0;
            this.field3258[1][2] = 4096;
            this.field3258[1][1] = 4096;
            this.field3258[1][3] = 4096;
        } else if (arg1 == 2) {
            this.field3258 = new int[8][4];
            this.field3258[0][2] = 2602;
            this.field3258[0][0] = 0;
            this.field3258[0][1] = 2650;
            this.field3258[1][0] = 2867;
            this.field3258[2][0] = 3072;
            this.field3258[1][2] = 1799;
            this.field3258[0][3] = 2361;
            this.field3258[1][1] = 2313;
            this.field3258[2][1] = 2618;
            this.field3258[3][0] = 3276;
            this.field3258[2][2] = 1734;
            this.field3258[1][3] = 1558;
            this.field3258[3][2] = 1220;
            this.field3258[4][2] = 963;
            this.field3258[5][2] = 2152;
            this.field3258[2][3] = 1413;
            this.field3258[3][1] = 2296;
            this.field3258[6][2] = 1060;
            this.field3258[3][3] = 947;
            this.field3258[4][3] = 722;
            this.field3258[4][0] = 3481;
            this.field3258[4][1] = 2072;
            this.field3258[5][0] = 3686;
            this.field3258[6][0] = 3891;
            this.field3258[7][0] = 4096;
            this.field3258[5][1] = 2730;
            this.field3258[7][2] = 1413;
            this.field3258[6][1] = 2232;
            this.field3258[5][3] = 1766;
            this.field3258[7][1] = 1686;
            this.field3258[6][3] = 915;
            this.field3258[7][3] = 1140;
        } else if (arg1 == 3) {
            this.field3258 = new int[7][4];
            this.field3258[0][1] = 0;
            this.field3258[0][2] = 0;
            this.field3258[0][3] = 4096;
            this.field3258[1][3] = 4096;
            this.field3258[1][2] = 4096;
            this.field3258[1][1] = 0;
            this.field3258[0][0] = 0;
            this.field3258[1][0] = 663;
            this.field3258[2][0] = 1363;
            this.field3258[2][1] = 0;
            this.field3258[3][0] = 2048;
            this.field3258[3][1] = 4096;
            this.field3258[4][1] = 4096;
            this.field3258[2][2] = 4096;
            this.field3258[4][0] = 2727;
            this.field3258[5][1] = 4096;
            this.field3258[3][2] = 4096;
            this.field3258[4][2] = 0;
            this.field3258[6][1] = 0;
            this.field3258[5][0] = 3411;
            this.field3258[2][3] = 0;
            this.field3258[5][2] = 0;
            this.field3258[6][0] = 4096;
            this.field3258[3][3] = 0;
            this.field3258[6][2] = 0;
            this.field3258[4][3] = 0;
            this.field3258[5][3] = 4096;
            this.field3258[6][3] = 4096;
        } else if (arg1 == 4) {
            this.field3258 = new int[6][4];
            this.field3258[0][3] = 0;
            this.field3258[0][0] = 0;
            this.field3258[0][1] = 0;
            this.field3258[1][3] = 1493;
            this.field3258[1][0] = 1843;
            this.field3258[2][0] = 2457;
            this.field3258[1][1] = 0;
            this.field3258[0][2] = 0;
            this.field3258[2][3] = 2939;
            this.field3258[3][3] = 3565;
            this.field3258[3][0] = 2781;
            this.field3258[4][0] = 3481;
            this.field3258[5][0] = 4096;
            this.field3258[2][1] = 0;
            this.field3258[1][2] = 0;
            this.field3258[4][3] = 4031;
            this.field3258[5][3] = 4096;
            this.field3258[2][2] = 0;
            this.field3258[3][2] = 1124;
            this.field3258[4][2] = 3084;
            this.field3258[3][1] = 0;
            this.field3258[4][1] = 546;
            this.field3258[5][1] = 4096;
            this.field3258[5][2] = 4096;
        } else if (arg1 == 5) {
            this.field3258 = new int[16][4];
            this.field3258[0][3] = 321;
            this.field3258[0][0] = 0;
            this.field3258[1][3] = 562;
            this.field3258[0][2] = 192;
            this.field3258[2][3] = 803;
            this.field3258[0][1] = 80;
            this.field3258[1][0] = 155;
            this.field3258[3][3] = 1140;
            this.field3258[2][0] = 389;
            this.field3258[3][0] = 671;
            this.field3258[4][3] = 1509;
            this.field3258[5][3] = 1413;
            this.field3258[1][1] = 321;
            this.field3258[1][2] = 449;
            this.field3258[2][1] = 578;
            this.field3258[6][3] = 1333;
            this.field3258[4][0] = 897;
            this.field3258[3][1] = 947;
            this.field3258[4][1] = 1285;
            this.field3258[5][1] = 1525;
            this.field3258[7][3] = 1702;
            this.field3258[6][1] = 1734;
            this.field3258[5][0] = 1175;
            this.field3258[6][0] = 1368;
            this.field3258[7][0] = 1507;
            this.field3258[2][2] = 690;
            this.field3258[3][2] = 995;
            this.field3258[7][1] = 1413;
            this.field3258[8][0] = 1736;
            this.field3258[8][3] = 2056;
            this.field3258[8][1] = 1108;
            this.field3258[9][1] = 1766;
            this.field3258[10][1] = 2409;
            this.field3258[11][1] = 3116;
            this.field3258[9][3] = 2666;
            this.field3258[12][1] = 3806;
            this.field3258[13][1] = 3437;
            this.field3258[10][3] = 3276;
            this.field3258[11][3] = 3228;
            this.field3258[14][1] = 3116;
            this.field3258[15][1] = 2377;
            this.field3258[4][2] = 1397;
            this.field3258[9][0] = 2088;
            this.field3258[5][2] = 1429;
            this.field3258[10][0] = 2355;
            this.field3258[11][0] = 2691;
            this.field3258[12][3] = 3196;
            this.field3258[12][0] = 3031;
            this.field3258[13][0] = 3522;
            this.field3258[13][3] = 3019;
            this.field3258[14][3] = 3228;
            this.field3258[15][3] = 2746;
            this.field3258[14][0] = 3727;
            this.field3258[15][0] = 4096;
            this.field3258[6][2] = 1461;
            this.field3258[7][2] = 1525;
            this.field3258[8][2] = 1590;
            this.field3258[9][2] = 2056;
            this.field3258[10][2] = 2586;
            this.field3258[11][2] = 3148;
            this.field3258[12][2] = 3710;
            this.field3258[13][2] = 3421;
            this.field3258[14][2] = 3148;
            this.field3258[15][2] = 2505;
        } else if (arg1 == 6) {
            this.field3258 = new int[4][4];
            this.field3258[0][3] = 0;
            this.field3258[0][2] = 4096;
            this.field3258[1][3] = 0;
            this.field3258[1][2] = 4096;
            this.field3258[0][0] = 2048;
            this.field3258[2][3] = 0;
            this.field3258[2][2] = 4096;
            this.field3258[3][2] = 0;
            this.field3258[1][0] = 2867;
            this.field3258[2][0] = 3276;
            this.field3258[3][3] = 0;
            this.field3258[0][1] = 0;
            this.field3258[1][1] = 4096;
            this.field3258[2][1] = 4096;
            this.field3258[3][0] = 4096;
            this.field3258[3][1] = 4096;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V", line = 517)
    public final void method673(int arg0) {
        if (this.field3258 == null) {
            this.method1339((byte) -19, 1);
        }
        if (arg0 == 8) {
            field3256++;
            this.method1338((byte) -50);
        }
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)V", line = 535)
    public static void method1340(int arg0) {
        field3271 = (class34[][][]) null;
        field3267 = (byte[][]) null;
        field3261 = null;
        field3255 = null;
        field3265 = null;
        if (arg0 != 1) {
            method1340(29);
        }
        field3272 = null;
    }
}
