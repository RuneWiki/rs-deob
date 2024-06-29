import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class303 extends class17 {

    @OriginalMember(owner = "client!qh", name = "pb", descriptor = "[I")
    private int[] field5270 = new int[257];

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "[Lfa;")
    public static class201[] field5256 = new class201[50];

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
    public static int field5255 = -1;

    @OriginalMember(owner = "client!qh", name = "mb", descriptor = "Lsf;")
    public static class108 field5267 = class140.method973(255, "<img=1>");

    @OriginalMember(owner = "client!qh", name = "kb", descriptor = "Lsf;")
    public static class108 field5265 = class140.method973(255, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "Lsf;")
    public static class108 field5258 = class140.method973(255, "(Y");

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!qh", name = "fb", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!qh", name = "gb", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!qh", name = "hb", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!qh", name = "ib", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!qh", name = "nb", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!qh", name = "qb", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!qh", name = "jb", descriptor = "Ljava/lang/Thread;")
    public static Thread field5264;

    @OriginalMember(owner = "client!qh", name = "lb", descriptor = "[[I")
    private int[][] field5266;

    @OriginalMember(owner = "client!qh", name = "ob", descriptor = "[[[Lje;")
    public static class74[][][] field5269;

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 17)
    public class303() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)Lsf;", line = 21)
    public static final class108 method2127(int arg0, int arg1, boolean arg2) {
        field5262++;
        return arg0 == -24238 ? class99.method689(10, -87, arg1, arg2) : (class108) null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLrm;I)V", line = 39)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg1.method1731(true);
            if (var4 == 0) {
                this.field5266 = new int[arg1.method1731(true)][4];
                for (int var5 = 0; var5 < this.field5266.length; var5++) {
                    this.field5266[var5][0] = arg1.method1712(-1);
                    this.field5266[var5][1] = arg1.method1731(true) << 4;
                    this.field5266[var5][2] = arg1.method1731(true) << 4;
                    this.field5266[var5][3] = arg1.method1731(true) << 4;
                }
            } else {
                this.method2128(arg0 ^ 0xFFFFFF80, var4);
            }
        }
        field5271++;
        if (arg0 != -114) {
            this.method2128(-59, 109);
        }
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(II)V", line = 77)
    private final void method2128(int arg0, int arg1) {
        field5260++;
        if (arg0 != 14) {
            method2131(106);
        }
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field5266 = new int[2][4];
            this.field5266[0][3] = 0;
            this.field5266[0][0] = 0;
            this.field5266[1][3] = 4096;
            this.field5266[0][1] = 0;
            this.field5266[1][0] = 4096;
            this.field5266[0][2] = 0;
            this.field5266[1][1] = 4096;
            this.field5266[1][2] = 4096;
        } else if (arg1 == 2) {
            this.field5266 = new int[8][4];
            this.field5266[0][3] = 2361;
            this.field5266[0][0] = 0;
            this.field5266[0][2] = 2602;
            this.field5266[1][0] = 2867;
            this.field5266[2][0] = 3072;
            this.field5266[1][2] = 1799;
            this.field5266[2][2] = 1734;
            this.field5266[3][2] = 1220;
            this.field5266[1][3] = 1558;
            this.field5266[0][1] = 2650;
            this.field5266[1][1] = 2313;
            this.field5266[4][2] = 963;
            this.field5266[3][0] = 3276;
            this.field5266[5][2] = 2152;
            this.field5266[6][2] = 1060;
            this.field5266[4][0] = 3481;
            this.field5266[7][2] = 1413;
            this.field5266[5][0] = 3686;
            this.field5266[2][1] = 2618;
            this.field5266[2][3] = 1413;
            this.field5266[3][1] = 2296;
            this.field5266[4][1] = 2072;
            this.field5266[3][3] = 947;
            this.field5266[4][3] = 722;
            this.field5266[5][3] = 1766;
            this.field5266[6][0] = 3891;
            this.field5266[7][0] = 4096;
            this.field5266[6][3] = 915;
            this.field5266[7][3] = 1140;
            this.field5266[5][1] = 2730;
            this.field5266[6][1] = 2232;
            this.field5266[7][1] = 1686;
        } else if (arg1 == 3) {
            this.field5266 = new int[7][4];
            this.field5266[0][1] = 0;
            this.field5266[0][0] = 0;
            this.field5266[1][1] = 0;
            this.field5266[2][1] = 0;
            this.field5266[0][3] = 4096;
            this.field5266[0][2] = 0;
            this.field5266[1][2] = 4096;
            this.field5266[3][1] = 4096;
            this.field5266[1][3] = 4096;
            this.field5266[2][3] = 0;
            this.field5266[3][3] = 0;
            this.field5266[1][0] = 663;
            this.field5266[2][2] = 4096;
            this.field5266[3][2] = 4096;
            this.field5266[2][0] = 1363;
            this.field5266[4][2] = 0;
            this.field5266[5][2] = 0;
            this.field5266[6][2] = 0;
            this.field5266[4][3] = 0;
            this.field5266[5][3] = 4096;
            this.field5266[6][3] = 4096;
            this.field5266[3][0] = 2048;
            this.field5266[4][1] = 4096;
            this.field5266[5][1] = 4096;
            this.field5266[4][0] = 2727;
            this.field5266[5][0] = 3411;
            this.field5266[6][1] = 0;
            this.field5266[6][0] = 4096;
        } else if (arg1 == 4) {
            this.field5266 = new int[6][4];
            this.field5266[0][3] = 0;
            this.field5266[0][0] = 0;
            this.field5266[0][1] = 0;
            this.field5266[1][3] = 1493;
            this.field5266[1][0] = 1843;
            this.field5266[2][3] = 2939;
            this.field5266[1][1] = 0;
            this.field5266[2][1] = 0;
            this.field5266[2][0] = 2457;
            this.field5266[3][3] = 3565;
            this.field5266[3][0] = 2781;
            this.field5266[3][1] = 0;
            this.field5266[4][1] = 546;
            this.field5266[4][0] = 3481;
            this.field5266[4][3] = 4031;
            this.field5266[0][2] = 0;
            this.field5266[5][0] = 4096;
            this.field5266[1][2] = 0;
            this.field5266[2][2] = 0;
            this.field5266[5][3] = 4096;
            this.field5266[3][2] = 1124;
            this.field5266[4][2] = 3084;
            this.field5266[5][2] = 4096;
            this.field5266[5][1] = 4096;
        } else if (arg1 == 5) {
            this.field5266 = new int[16][4];
            this.field5266[0][3] = 321;
            this.field5266[0][1] = 80;
            this.field5266[0][2] = 192;
            this.field5266[1][3] = 562;
            this.field5266[1][1] = 321;
            this.field5266[1][2] = 449;
            this.field5266[2][2] = 690;
            this.field5266[2][1] = 578;
            this.field5266[0][0] = 0;
            this.field5266[3][2] = 995;
            this.field5266[4][2] = 1397;
            this.field5266[5][2] = 1429;
            this.field5266[2][3] = 803;
            this.field5266[3][1] = 947;
            this.field5266[6][2] = 1461;
            this.field5266[3][3] = 1140;
            this.field5266[1][0] = 155;
            this.field5266[4][1] = 1285;
            this.field5266[7][2] = 1525;
            this.field5266[4][3] = 1509;
            this.field5266[2][0] = 389;
            this.field5266[8][2] = 1590;
            this.field5266[3][0] = 671;
            this.field5266[5][1] = 1525;
            this.field5266[9][2] = 2056;
            this.field5266[5][3] = 1413;
            this.field5266[10][2] = 2586;
            this.field5266[6][1] = 1734;
            this.field5266[4][0] = 897;
            this.field5266[11][2] = 3148;
            this.field5266[12][2] = 3710;
            this.field5266[6][3] = 1333;
            this.field5266[7][1] = 1413;
            this.field5266[8][1] = 1108;
            this.field5266[9][1] = 1766;
            this.field5266[13][2] = 3421;
            this.field5266[10][1] = 2409;
            this.field5266[14][2] = 3148;
            this.field5266[11][1] = 3116;
            this.field5266[12][1] = 3806;
            this.field5266[15][2] = 2505;
            this.field5266[5][0] = 1175;
            this.field5266[6][0] = 1368;
            this.field5266[7][0] = 1507;
            this.field5266[13][1] = 3437;
            this.field5266[8][0] = 1736;
            this.field5266[9][0] = 2088;
            this.field5266[10][0] = 2355;
            this.field5266[11][0] = 2691;
            this.field5266[7][3] = 1702;
            this.field5266[8][3] = 2056;
            this.field5266[9][3] = 2666;
            this.field5266[12][0] = 3031;
            this.field5266[13][0] = 3522;
            this.field5266[10][3] = 3276;
            this.field5266[14][1] = 3116;
            this.field5266[15][1] = 2377;
            this.field5266[14][0] = 3727;
            this.field5266[15][0] = 4096;
            this.field5266[11][3] = 3228;
            this.field5266[12][3] = 3196;
            this.field5266[13][3] = 3019;
            this.field5266[14][3] = 3228;
            this.field5266[15][3] = 2746;
        } else if (arg1 == 6) {
            this.field5266 = new int[4][4];
            this.field5266[0][3] = 0;
            this.field5266[1][3] = 0;
            this.field5266[0][2] = 4096;
            this.field5266[2][3] = 0;
            this.field5266[1][2] = 4096;
            this.field5266[0][0] = 2048;
            this.field5266[2][2] = 4096;
            this.field5266[3][2] = 0;
            this.field5266[1][0] = 2867;
            this.field5266[0][1] = 0;
            this.field5266[3][3] = 0;
            this.field5266[1][1] = 4096;
            this.field5266[2][0] = 3276;
            this.field5266[3][0] = 4096;
            this.field5266[2][1] = 4096;
            this.field5266[3][1] = 4096;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V", line = 334)
    private final void method2129(int arg0) {
        field5259++;
        int var2 = this.field5266.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && var5 >= this.field5266[var6][0]; var6++) {
                    var4++;
                }
                int var8;
                int var9;
                int var10;
                if (var2 <= var4) {
                    int[] var7 = this.field5266[var2 - 1];
                    var8 = var7[3];
                    var9 = var7[1];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field5266[var4];
                    if (var4 > 0) {
                        int[] var12 = this.field5266[var4 - 1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                        int var14 = 4096 - var13;
                        var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                    } else {
                        var10 = var11[2];
                        var9 = var11[1];
                        var8 = var11[3];
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var10 >> 4;
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
                int var17 = var8 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field5270[var3] = class242.method1674(class242.method1674(var16 << 8, var15 << 16), var17);
            }
        }
        if (arg0 <= 19) {
            field5258 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)[[I", line = 437)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field224.method2081(arg1, -45);
        field5263++;
        if (this.field224.field5106) {
            int[] var4 = this.method124(63, 0, arg1);
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class116.field2008; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field5270[var9];
                var7[var8] = class162.method1118(4080, var10 >> 12);
                var6[var8] = class162.method1118(var10, 65280) >> 4;
                var5[var8] = class162.method1118(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)V", line = 488)
    public static final void method2130(int arg0) {
        field5261++;
        class271.method1957(-35);
        class53.method373(false);
        class68.method460((byte) 126);
        class234.method1633((byte) 103);
        class248.method1705(115);
        class99.method682(0);
        class106.method724(-30221);
        class52.method367(-74);
        class57.method399((byte) 24);
        class163.method1131(false);
        class36.method252((byte) -39);
        class291.method2086(false);
        class3.method26(-6);
        class70.method470(4);
        class262.method1856(arg0);
        class246.method1692((byte) -120);
        if (!class231.field4051) {
            ((class84) class263.field4661).method570(true);
        }
        class292.field5107.method461(true);
        class223.field3950.method1862(112);
        class17.field221.method1862(113);
        class283.field4957.method1862(119);
        class291.field5104.method1862(120);
        class247.field4277.method1862(109);
        class96.field1535.method1862(103);
        class13.field150.method1862(116);
        class215.field3801.method1862(106);
        class143.field2527.method1862(arg0 + 100);
        class69.field1079.method1862(arg0 ^ 0x6F);
        class92.field1479.method1862(122);
        class293.field5122.method639(-102);
    }

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "(I)V", line = 534)
    public static void method2131(int arg0) {
        field5269 = (class74[][][]) null;
        field5258 = null;
        field5264 = null;
        field5265 = null;
        field5256 = null;
        field5267 = null;
        if (arg0 != 1) {
            field5258 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "(I)I", line = 556)
    public static final int method2132(int arg0) {
        if (arg0 == -10022) {
            field5257++;
            class305.field5313 = 0;
            return class240.method1670(-10);
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)V", line = 568)
    public final void method116(boolean arg0) {
        field5268++;
        if (arg0) {
            if (this.field5266 == null) {
                this.method2128(14, 1);
            }
            this.method2129(102);
        }
    }
}
