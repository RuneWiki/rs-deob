import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class503 extends class529 {

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "[I")
    private int[] field7079 = new int[257];

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "[I")
    public static int[] field7078 = new int[5];

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "Lus;")
    public static class328 field7077 = new class328(16, -1);

    @OriginalMember(owner = "client!iu", name = "M", descriptor = "D")
    public static double field7083;

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!iu", name = "F", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!iu", name = "D", descriptor = "[[I")
    private int[][] field7074;

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
    public class503() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(B)V")
    public static void method2898(byte arg0) {
        field7077 = null;
        field7078 = null;
        int var1 = 118 % ((-62 - arg0) / 49);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 >= 45) {
            if (~arg0 == -1) {
                int var4 = arg2.method1094(255);
                if (~var4 != -1) {
                    this.method2900(var4, 2072);
                } else {
                    this.field7074 = new int[arg2.method1094(255)][4];
                    for (int var5 = 0; ~var5 > ~this.field7074.length; ++var5) {
                        this.field7074[var5][0] = arg2.method1107(false);
                        this.field7074[var5][1] = arg2.method1094(255) << 4;
                        this.field7074[var5][2] = arg2.method1094(255) << 4;
                        this.field7074[var5][3] = arg2.method1094(255) << 4;
                    }
                }
            }
            ++field7081;
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        ++field7075;
        if (this.field7074 == null) {
            this.method2900(1, 2072);
        }
        if (arg0 <= -92) {
            this.method2899(30962);
        }
    }

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)V")
    private final void method2899(int arg0) {
        if (arg0 == 30962) {
            ++field7080;
            int var2 = this.field7074.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && var5 >= this.field7074[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var4 > ~var2) {
                        int[] var7 = this.field7074[var4];
                        if (var4 <= 0) {
                            var8 = var7[2];
                            var9 = var7[1];
                            var10 = var7[3];
                        } else {
                            int[] var11 = this.field7074[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var10 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                            var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                            var8 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                        }
                    } else {
                        int[] var14 = this.field7074[var2 + -1];
                        var10 = var14[3];
                        var8 = var14[2];
                        var9 = var14[1];
                    }
                    int var15 = var10 >> 4;
                    int var16 = var9 >> 4;
                    int var17 = var8 >> 4;
                    if (~var15 <= -1) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (~var17 <= -1) {
                        if (~var17 < -256) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field7079[var3] = class216.method1308(var15, class216.method1308(var17 << 8, var16 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        if (arg1 != 2) {
            return null;
        } else {
            ++field7082;
            int[][] var3 = super.field7450.method2241(-1, arg0);
            if (super.field7450.field5165) {
                int[] var4 = this.method3028((byte) 121, arg0, 0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; class304.field3909 > var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field7079[var9];
                    var5[var8] = class272.method1629(var10, 16711680) >> 12;
                    var6[var8] = class272.method1629(4080, var10 >> 4);
                    var7[var8] = class272.method1629(255, var10) << 4;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V")
    private final void method2900(int arg0, int arg1) {
        ++field7076;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field7074 = new int[4][4];
                                this.field7074[0][2] = 4096;
                                this.field7074[0][1] = 0;
                                this.field7074[0][3] = 0;
                                this.field7074[0][0] = 2048;
                                this.field7074[1][2] = 4096;
                                this.field7074[1][3] = 0;
                                this.field7074[1][0] = 2867;
                                this.field7074[1][1] = 4096;
                                this.field7074[2][1] = 4096;
                                this.field7074[2][0] = 3276;
                                this.field7074[2][3] = 0;
                                this.field7074[2][2] = 4096;
                                this.field7074[3][0] = 4096;
                                this.field7074[3][2] = 0;
                                this.field7074[3][1] = 4096;
                                this.field7074[3][3] = 0;
                            } else {
                                this.field7074 = new int[16][4];
                                this.field7074[0][0] = 0;
                                this.field7074[0][3] = 321;
                                this.field7074[0][2] = 192;
                                this.field7074[0][1] = 80;
                                this.field7074[1][2] = 449;
                                this.field7074[1][3] = 562;
                                this.field7074[1][1] = 321;
                                this.field7074[1][0] = 155;
                                this.field7074[2][2] = 690;
                                this.field7074[2][0] = 389;
                                this.field7074[2][3] = 803;
                                this.field7074[2][1] = 578;
                                this.field7074[3][3] = 1140;
                                this.field7074[3][2] = 995;
                                this.field7074[3][1] = 947;
                                this.field7074[3][0] = 671;
                                this.field7074[4][1] = 1285;
                                this.field7074[4][3] = 1509;
                                this.field7074[4][0] = 897;
                                this.field7074[4][2] = 1397;
                                this.field7074[5][1] = 1525;
                                this.field7074[5][0] = 1175;
                                this.field7074[5][3] = 1413;
                                this.field7074[5][2] = 1429;
                                this.field7074[6][3] = 1333;
                                this.field7074[6][2] = 1461;
                                this.field7074[6][0] = 1368;
                                this.field7074[6][1] = 1734;
                                this.field7074[7][3] = 1702;
                                this.field7074[7][1] = 1413;
                                this.field7074[7][2] = 1525;
                                this.field7074[7][0] = 1507;
                                this.field7074[8][0] = 1736;
                                this.field7074[8][3] = 2056;
                                this.field7074[8][1] = 1108;
                                this.field7074[8][2] = 1590;
                                this.field7074[9][1] = 1766;
                                this.field7074[9][2] = 2056;
                                this.field7074[9][3] = 2666;
                                this.field7074[9][0] = 2088;
                                this.field7074[10][3] = 3276;
                                this.field7074[10][0] = 2355;
                                this.field7074[10][1] = 2409;
                                this.field7074[10][2] = 2586;
                                this.field7074[11][2] = 3148;
                                this.field7074[11][0] = 2691;
                                this.field7074[11][3] = 3228;
                                this.field7074[11][1] = 3116;
                                this.field7074[12][2] = 3710;
                                this.field7074[12][0] = 3031;
                                this.field7074[12][1] = 3806;
                                this.field7074[12][3] = 3196;
                                this.field7074[13][0] = 3522;
                                this.field7074[13][3] = 3019;
                                this.field7074[13][1] = 3437;
                                this.field7074[13][2] = 3421;
                                this.field7074[14][3] = 3228;
                                this.field7074[14][1] = 3116;
                                this.field7074[14][2] = 3148;
                                this.field7074[14][0] = 3727;
                                this.field7074[15][3] = 2746;
                                this.field7074[15][2] = 2505;
                                this.field7074[15][1] = 2377;
                                this.field7074[15][0] = 4096;
                            }
                        } else {
                            this.field7074 = new int[6][4];
                            this.field7074[0][2] = 0;
                            this.field7074[0][0] = 0;
                            this.field7074[0][1] = 0;
                            this.field7074[0][3] = 0;
                            this.field7074[1][2] = 0;
                            this.field7074[1][0] = 1843;
                            this.field7074[1][1] = 0;
                            this.field7074[1][3] = 1493;
                            this.field7074[2][1] = 0;
                            this.field7074[2][0] = 2457;
                            this.field7074[2][2] = 0;
                            this.field7074[2][3] = 2939;
                            this.field7074[3][3] = 3565;
                            this.field7074[3][0] = 2781;
                            this.field7074[3][2] = 1124;
                            this.field7074[3][1] = 0;
                            this.field7074[4][0] = 3481;
                            this.field7074[4][1] = 546;
                            this.field7074[4][2] = 3084;
                            this.field7074[4][3] = 4031;
                            this.field7074[5][0] = 4096;
                            this.field7074[5][2] = 4096;
                            this.field7074[5][1] = 4096;
                            this.field7074[5][3] = 4096;
                        }
                    } else {
                        this.field7074 = new int[7][4];
                        this.field7074[0][3] = 4096;
                        this.field7074[0][1] = 0;
                        this.field7074[0][2] = 0;
                        this.field7074[0][0] = 0;
                        this.field7074[1][1] = 0;
                        this.field7074[1][0] = 663;
                        this.field7074[1][3] = 4096;
                        this.field7074[1][2] = 4096;
                        this.field7074[2][3] = 0;
                        this.field7074[2][2] = 4096;
                        this.field7074[2][1] = 0;
                        this.field7074[2][0] = 1363;
                        this.field7074[3][2] = 4096;
                        this.field7074[3][1] = 4096;
                        this.field7074[3][0] = 2048;
                        this.field7074[3][3] = 0;
                        this.field7074[4][2] = 0;
                        this.field7074[4][3] = 0;
                        this.field7074[4][0] = 2727;
                        this.field7074[4][1] = 4096;
                        this.field7074[5][0] = 3411;
                        this.field7074[5][1] = 4096;
                        this.field7074[5][3] = 4096;
                        this.field7074[5][2] = 0;
                        this.field7074[6][1] = 0;
                        this.field7074[6][0] = 4096;
                        this.field7074[6][3] = 4096;
                        this.field7074[6][2] = 0;
                    }
                } else {
                    this.field7074 = new int[8][4];
                    this.field7074[0][3] = 2361;
                    this.field7074[0][2] = 2602;
                    this.field7074[0][0] = 0;
                    this.field7074[0][1] = 2650;
                    this.field7074[1][2] = 1799;
                    this.field7074[1][0] = 2867;
                    this.field7074[1][3] = 1558;
                    this.field7074[1][1] = 2313;
                    this.field7074[2][1] = 2618;
                    this.field7074[2][2] = 1734;
                    this.field7074[2][0] = 3072;
                    this.field7074[2][3] = 1413;
                    this.field7074[3][0] = 3276;
                    this.field7074[3][1] = 2296;
                    this.field7074[3][2] = 1220;
                    this.field7074[3][3] = 947;
                    this.field7074[4][1] = 2072;
                    this.field7074[4][0] = 3481;
                    this.field7074[4][3] = 722;
                    this.field7074[4][2] = 963;
                    this.field7074[5][2] = 2152;
                    this.field7074[5][1] = 2730;
                    this.field7074[5][0] = 3686;
                    this.field7074[5][3] = 1766;
                    this.field7074[6][1] = 2232;
                    this.field7074[6][2] = 1060;
                    this.field7074[6][3] = 915;
                    this.field7074[6][0] = 3891;
                    this.field7074[7][1] = 1686;
                    this.field7074[7][0] = 4096;
                    this.field7074[7][2] = 1413;
                    this.field7074[7][3] = 1140;
                }
            } else {
                this.field7074 = new int[2][4];
                this.field7074[0][1] = 0;
                this.field7074[0][0] = 0;
                this.field7074[0][3] = 0;
                this.field7074[0][2] = 0;
                this.field7074[1][2] = 4096;
                this.field7074[1][3] = 4096;
                this.field7074[1][1] = 4096;
                this.field7074[1][0] = 4096;
            }
        }
        if (arg1 != 2072) {
            field7083 = -0.22578025345734998D;
        }
    }
}
