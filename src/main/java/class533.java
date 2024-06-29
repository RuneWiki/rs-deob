import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class533 extends class192 {

    @OriginalMember(owner = "client!bu", name = "O", descriptor = "[I")
    private int[] field6939 = new int[257];

    @OriginalMember(owner = "client!bu", name = "L", descriptor = "Lra;")
    public static class361 field6936 = new class361(76, -1);

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!bu", name = "K", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!bu", name = "M", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!bu", name = "N", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!bu", name = "P", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!bu", name = "Q", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "[[I")
    private int[][] field6933;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILfd;I)V", line = 3)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg2 != -12160) {
            this.method107(44, (byte) 102);
        }
        if (arg0 == 0) {
            int var4 = arg1.method2396(-105);
            if (var4 != 0) {
                this.method2834(var4, 95);
            } else {
                this.field6933 = new int[arg1.method2396(-107)][4];
                for (int var5 = 0; var5 < this.field6933.length; ++var5) {
                    this.field6933[var5][0] = arg1.method2393(-30727);
                    this.field6933[var5][1] = arg1.method2396(-29) << 4;
                    this.field6933[var5][2] = arg1.method2396(-114) << 4;
                    this.field6933[var5][3] = arg1.method2396(77) << 4;
                }
            }
        }
        ++field6940;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(IB)[[I", line = 41)
    public final int[][] method107(int arg0, byte arg1) {
        int var3 = 76 / ((-14 - arg1) / 34);
        ++field6934;
        int[][] var4 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int[] var5 = this.method1253(0, arg0, 0);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; class561.field7319 > var9; ++var9) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field6939[var10];
                var6[var9] = class597.method3238(16711680, var11) >> 12;
                var7[var9] = class597.method3238(var11 >> 4, 4080);
                var8[var9] = class597.method3238(var11 << 4, 4080);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V", line = 95)
    private final void method2831(int arg0) {
        if (arg0 == 13296) {
            ++field6938;
            int var2 = this.field6933.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && var5 >= this.field6933[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var4 < var2) {
                        int[] var7 = this.field6933[var4];
                        if (~var4 >= -1) {
                            var8 = var7[1];
                            var9 = var7[2];
                            var10 = var7[3];
                        } else {
                            int[] var11 = this.field6933[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var10 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                            var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                            var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field6933[var2 - 1];
                        var9 = var14[2];
                        var10 = var14[3];
                        var8 = var14[1];
                    }
                    int var15 = var8 >> 4;
                    int var16 = var9 >> 4;
                    int var17 = var10 >> 4;
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (~var15 <= -1) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    this.field6939[var3] = class131.method954(class131.method954(var16 << 8, var15 << 16), var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "(I)V", line = 202)
    public static void method2832(int arg0) {
        field6936 = null;
        if (arg0 != 3228) {
            field6936 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "(I)[I", line = 214)
    public static final int[] method2833(int arg0) {
        ++field6937;
        if (arg0 != 2618) {
            field6936 = null;
        }
        return new int[] { class483.field6442, class531.field6904, class628.field8776 };
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V", line = 227)
    public class533() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(B)V", line = 233)
    public final void method618(byte arg0) {
        if (this.field6933 == null) {
            this.method2834(1, 36);
        }
        ++field6935;
        this.method2831(arg0 + 13233);
        if (arg0 != 63) {
            field6936 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)V", line = 248)
    private final void method2834(int arg0, int arg1) {
        if (arg1 < 9) {
            this.method2834(10, 125);
        }
        ++field6941;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field6933 = new int[4][4];
                                    this.field6933[0][0] = 2048;
                                    this.field6933[0][1] = 0;
                                    this.field6933[0][3] = 0;
                                    this.field6933[0][2] = 4096;
                                    this.field6933[1][0] = 2867;
                                    this.field6933[1][3] = 0;
                                    this.field6933[1][1] = 4096;
                                    this.field6933[1][2] = 4096;
                                    this.field6933[2][1] = 4096;
                                    this.field6933[2][3] = 0;
                                    this.field6933[2][2] = 4096;
                                    this.field6933[2][0] = 3276;
                                    this.field6933[3][1] = 4096;
                                    this.field6933[3][0] = 4096;
                                    this.field6933[3][3] = 0;
                                    this.field6933[3][2] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field6933 = new int[16][4];
                                this.field6933[0][3] = 321;
                                this.field6933[0][0] = 0;
                                this.field6933[0][2] = 192;
                                this.field6933[0][1] = 80;
                                this.field6933[1][2] = 449;
                                this.field6933[1][0] = 155;
                                this.field6933[1][1] = 321;
                                this.field6933[1][3] = 562;
                                this.field6933[2][0] = 389;
                                this.field6933[2][2] = 690;
                                this.field6933[2][3] = 803;
                                this.field6933[2][1] = 578;
                                this.field6933[3][1] = 947;
                                this.field6933[3][2] = 995;
                                this.field6933[3][3] = 1140;
                                this.field6933[3][0] = 671;
                                this.field6933[4][0] = 897;
                                this.field6933[4][2] = 1397;
                                this.field6933[4][1] = 1285;
                                this.field6933[4][3] = 1509;
                                this.field6933[5][1] = 1525;
                                this.field6933[5][3] = 1413;
                                this.field6933[5][0] = 1175;
                                this.field6933[5][2] = 1429;
                                this.field6933[6][1] = 1734;
                                this.field6933[6][3] = 1333;
                                this.field6933[6][0] = 1368;
                                this.field6933[6][2] = 1461;
                                this.field6933[7][3] = 1702;
                                this.field6933[7][0] = 1507;
                                this.field6933[7][1] = 1413;
                                this.field6933[7][2] = 1525;
                                this.field6933[8][0] = 1736;
                                this.field6933[8][3] = 2056;
                                this.field6933[8][2] = 1590;
                                this.field6933[8][1] = 1108;
                                this.field6933[9][1] = 1766;
                                this.field6933[9][0] = 2088;
                                this.field6933[9][2] = 2056;
                                this.field6933[9][3] = 2666;
                                this.field6933[10][3] = 3276;
                                this.field6933[10][0] = 2355;
                                this.field6933[10][2] = 2586;
                                this.field6933[10][1] = 2409;
                                this.field6933[11][2] = 3148;
                                this.field6933[11][3] = 3228;
                                this.field6933[11][0] = 2691;
                                this.field6933[11][1] = 3116;
                                this.field6933[12][1] = 3806;
                                this.field6933[12][2] = 3710;
                                this.field6933[12][3] = 3196;
                                this.field6933[12][0] = 3031;
                                this.field6933[13][0] = 3522;
                                this.field6933[13][2] = 3421;
                                this.field6933[13][1] = 3437;
                                this.field6933[13][3] = 3019;
                                this.field6933[14][2] = 3148;
                                this.field6933[14][3] = 3228;
                                this.field6933[14][0] = 3727;
                                this.field6933[14][1] = 3116;
                                this.field6933[15][0] = 4096;
                                this.field6933[15][1] = 2377;
                                this.field6933[15][2] = 2505;
                                this.field6933[15][3] = 2746;
                            }
                        } else {
                            this.field6933 = new int[6][4];
                            this.field6933[0][0] = 0;
                            this.field6933[0][3] = 0;
                            this.field6933[0][1] = 0;
                            this.field6933[0][2] = 0;
                            this.field6933[1][1] = 0;
                            this.field6933[1][3] = 1493;
                            this.field6933[1][2] = 0;
                            this.field6933[1][0] = 1843;
                            this.field6933[2][2] = 0;
                            this.field6933[2][0] = 2457;
                            this.field6933[2][3] = 2939;
                            this.field6933[2][1] = 0;
                            this.field6933[3][1] = 0;
                            this.field6933[3][2] = 1124;
                            this.field6933[3][3] = 3565;
                            this.field6933[3][0] = 2781;
                            this.field6933[4][2] = 3084;
                            this.field6933[4][0] = 3481;
                            this.field6933[4][3] = 4031;
                            this.field6933[4][1] = 546;
                            this.field6933[5][3] = 4096;
                            this.field6933[5][1] = 4096;
                            this.field6933[5][2] = 4096;
                            this.field6933[5][0] = 4096;
                        }
                    } else {
                        this.field6933 = new int[7][4];
                        this.field6933[0][0] = 0;
                        this.field6933[0][1] = 0;
                        this.field6933[0][3] = 4096;
                        this.field6933[0][2] = 0;
                        this.field6933[1][0] = 663;
                        this.field6933[1][1] = 0;
                        this.field6933[1][3] = 4096;
                        this.field6933[1][2] = 4096;
                        this.field6933[2][1] = 0;
                        this.field6933[2][0] = 1363;
                        this.field6933[2][2] = 4096;
                        this.field6933[2][3] = 0;
                        this.field6933[3][1] = 4096;
                        this.field6933[3][2] = 4096;
                        this.field6933[3][0] = 2048;
                        this.field6933[3][3] = 0;
                        this.field6933[4][0] = 2727;
                        this.field6933[4][2] = 0;
                        this.field6933[4][3] = 0;
                        this.field6933[4][1] = 4096;
                        this.field6933[5][3] = 4096;
                        this.field6933[5][0] = 3411;
                        this.field6933[5][1] = 4096;
                        this.field6933[5][2] = 0;
                        this.field6933[6][3] = 4096;
                        this.field6933[6][1] = 0;
                        this.field6933[6][0] = 4096;
                        this.field6933[6][2] = 0;
                    }
                } else {
                    this.field6933 = new int[8][4];
                    this.field6933[0][1] = 2650;
                    this.field6933[0][0] = 0;
                    this.field6933[0][3] = 2361;
                    this.field6933[0][2] = 2602;
                    this.field6933[1][1] = 2313;
                    this.field6933[1][2] = 1799;
                    this.field6933[1][3] = 1558;
                    this.field6933[1][0] = 2867;
                    this.field6933[2][3] = 1413;
                    this.field6933[2][2] = 1734;
                    this.field6933[2][0] = 3072;
                    this.field6933[2][1] = 2618;
                    this.field6933[3][3] = 947;
                    this.field6933[3][0] = 3276;
                    this.field6933[3][2] = 1220;
                    this.field6933[3][1] = 2296;
                    this.field6933[4][2] = 963;
                    this.field6933[4][1] = 2072;
                    this.field6933[4][3] = 722;
                    this.field6933[4][0] = 3481;
                    this.field6933[5][3] = 1766;
                    this.field6933[5][1] = 2730;
                    this.field6933[5][2] = 2152;
                    this.field6933[5][0] = 3686;
                    this.field6933[6][3] = 915;
                    this.field6933[6][2] = 1060;
                    this.field6933[6][1] = 2232;
                    this.field6933[6][0] = 3891;
                    this.field6933[7][3] = 1140;
                    this.field6933[7][1] = 1686;
                    this.field6933[7][2] = 1413;
                    this.field6933[7][0] = 4096;
                }
            } else {
                this.field6933 = new int[2][4];
                this.field6933[0][3] = 0;
                this.field6933[0][1] = 0;
                this.field6933[0][0] = 0;
                this.field6933[0][2] = 0;
                this.field6933[1][2] = 4096;
                this.field6933[1][0] = 4096;
                this.field6933[1][1] = 4096;
                this.field6933[1][3] = 4096;
            }
        }
    }
}
