import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class233 extends class314 {

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "[I")
    private int[] field3696 = new int[257];

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "[[I")
    private int[][] field3694;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 > -1) {
            field3699 = -27;
        }
        if (arg2 == 0) {
            int var4 = arg1.method70(-9059);
            if (~var4 == -1) {
                this.field3694 = new int[arg1.method70(-9059)][4];
                for (int var5 = 0; ~this.field3694.length < ~var5; ++var5) {
                    this.field3694[var5][0] = arg1.method67(12021);
                    this.field3694[var5][1] = arg1.method70(-9059) << 4;
                    this.field3694[var5][2] = arg1.method70(-9059) << 4;
                    this.field3694[var5][3] = arg1.method70(-9059) << 4;
                }
            } else {
                this.method1694(2727, var4);
            }
        }
        ++field3701;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static final void method1692(byte arg0) {
        if (arg0 == -114) {
            class66.field854.method563(0);
            ++field3697;
            class177.field2913.method563(0);
            class345.field5554.method563(0);
            class246.field3929.method563(0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class233() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)[[I")
    public final int[][] method4(int arg0, byte arg1) {
        ++field3695;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (arg1 <= 68) {
            this.field3694 = null;
        }
        if (super.field4931.field2799) {
            int[] var4 = this.method2140(0, arg0, -122);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class81.field1009 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field3696[var9];
                var5[var8] = class453.method2846(var10, 16711680) >> 12;
                var6[var8] = class453.method2846(var10, 65280) >> 4;
                var7[var8] = class453.method2846(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V")
    private final void method1693(byte arg0) {
        ++field3693;
        int var2 = this.field3694.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~var5 <= ~this.field3694[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 < var2) {
                    int[] var7 = this.field3694[var4];
                    if (var4 <= 0) {
                        var8 = var7[3];
                        var9 = var7[2];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field3694[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = 4096 - var12;
                        var10 = var7[1] * var12 - -(var11[1] * var13) >> 12;
                        var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                        var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field3694[var2 + -1];
                    var9 = var14[2];
                    var8 = var14[3];
                    var10 = var14[1];
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                if (var15 >= 0) {
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
                if (var16 >= 0) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field3696[var3] = class81.method769(class81.method769(var16 << 16, var17 << 8), var15);
            }
        }
        int var18 = 1 / ((arg0 - -1) / 63);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
    private final void method1694(int arg0, int arg1) {
        if (arg0 == 2727) {
            ++field3700;
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (~arg1 == -7) {
                                        this.field3694 = new int[4][4];
                                        this.field3694[0][2] = 4096;
                                        this.field3694[0][0] = 2048;
                                        this.field3694[0][3] = 0;
                                        this.field3694[0][1] = 0;
                                        this.field3694[1][1] = 4096;
                                        this.field3694[1][2] = 4096;
                                        this.field3694[1][0] = 2867;
                                        this.field3694[1][3] = 0;
                                        this.field3694[2][3] = 0;
                                        this.field3694[2][1] = 4096;
                                        this.field3694[2][0] = 3276;
                                        this.field3694[2][2] = 4096;
                                        this.field3694[3][0] = 4096;
                                        this.field3694[3][2] = 0;
                                        this.field3694[3][1] = 4096;
                                        this.field3694[3][3] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field3694 = new int[16][4];
                                    this.field3694[0][1] = 80;
                                    this.field3694[0][3] = 321;
                                    this.field3694[0][2] = 192;
                                    this.field3694[0][0] = 0;
                                    this.field3694[1][3] = 562;
                                    this.field3694[1][1] = 321;
                                    this.field3694[1][0] = 155;
                                    this.field3694[1][2] = 449;
                                    this.field3694[2][0] = 389;
                                    this.field3694[2][1] = 578;
                                    this.field3694[2][2] = 690;
                                    this.field3694[2][3] = 803;
                                    this.field3694[3][3] = 1140;
                                    this.field3694[3][2] = 995;
                                    this.field3694[3][1] = 947;
                                    this.field3694[3][0] = 671;
                                    this.field3694[4][0] = 897;
                                    this.field3694[4][2] = 1397;
                                    this.field3694[4][3] = 1509;
                                    this.field3694[4][1] = 1285;
                                    this.field3694[5][2] = 1429;
                                    this.field3694[5][3] = 1413;
                                    this.field3694[5][1] = 1525;
                                    this.field3694[5][0] = 1175;
                                    this.field3694[6][1] = 1734;
                                    this.field3694[6][0] = 1368;
                                    this.field3694[6][2] = 1461;
                                    this.field3694[6][3] = 1333;
                                    this.field3694[7][0] = 1507;
                                    this.field3694[7][1] = 1413;
                                    this.field3694[7][3] = 1702;
                                    this.field3694[7][2] = 1525;
                                    this.field3694[8][3] = 2056;
                                    this.field3694[8][1] = 1108;
                                    this.field3694[8][2] = 1590;
                                    this.field3694[8][0] = 1736;
                                    this.field3694[9][1] = 1766;
                                    this.field3694[9][3] = 2666;
                                    this.field3694[9][2] = 2056;
                                    this.field3694[9][0] = 2088;
                                    this.field3694[10][0] = 2355;
                                    this.field3694[10][3] = 3276;
                                    this.field3694[10][1] = 2409;
                                    this.field3694[10][2] = 2586;
                                    this.field3694[11][3] = 3228;
                                    this.field3694[11][0] = 2691;
                                    this.field3694[11][2] = 3148;
                                    this.field3694[11][1] = 3116;
                                    this.field3694[12][0] = 3031;
                                    this.field3694[12][2] = 3710;
                                    this.field3694[12][3] = 3196;
                                    this.field3694[12][1] = 3806;
                                    this.field3694[13][1] = 3437;
                                    this.field3694[13][0] = 3522;
                                    this.field3694[13][3] = 3019;
                                    this.field3694[13][2] = 3421;
                                    this.field3694[14][0] = 3727;
                                    this.field3694[14][2] = 3148;
                                    this.field3694[14][3] = 3228;
                                    this.field3694[14][1] = 3116;
                                    this.field3694[15][1] = 2377;
                                    this.field3694[15][0] = 4096;
                                    this.field3694[15][2] = 2505;
                                    this.field3694[15][3] = 2746;
                                }
                            } else {
                                this.field3694 = new int[6][4];
                                this.field3694[0][3] = 0;
                                this.field3694[0][1] = 0;
                                this.field3694[0][2] = 0;
                                this.field3694[0][0] = 0;
                                this.field3694[1][3] = 1493;
                                this.field3694[1][2] = 0;
                                this.field3694[1][1] = 0;
                                this.field3694[1][0] = 1843;
                                this.field3694[2][1] = 0;
                                this.field3694[2][3] = 2939;
                                this.field3694[2][0] = 2457;
                                this.field3694[2][2] = 0;
                                this.field3694[3][2] = 1124;
                                this.field3694[3][3] = 3565;
                                this.field3694[3][1] = 0;
                                this.field3694[3][0] = 2781;
                                this.field3694[4][1] = 546;
                                this.field3694[4][0] = 3481;
                                this.field3694[4][3] = 4031;
                                this.field3694[4][2] = 3084;
                                this.field3694[5][3] = 4096;
                                this.field3694[5][1] = 4096;
                                this.field3694[5][0] = 4096;
                                this.field3694[5][2] = 4096;
                            }
                        } else {
                            this.field3694 = new int[7][4];
                            this.field3694[0][0] = 0;
                            this.field3694[0][1] = 0;
                            this.field3694[0][3] = 4096;
                            this.field3694[0][2] = 0;
                            this.field3694[1][3] = 4096;
                            this.field3694[1][2] = 4096;
                            this.field3694[1][1] = 0;
                            this.field3694[1][0] = 663;
                            this.field3694[2][1] = 0;
                            this.field3694[2][3] = 0;
                            this.field3694[2][0] = 1363;
                            this.field3694[2][2] = 4096;
                            this.field3694[3][2] = 4096;
                            this.field3694[3][1] = 4096;
                            this.field3694[3][3] = 0;
                            this.field3694[3][0] = 2048;
                            this.field3694[4][3] = 0;
                            this.field3694[4][1] = 4096;
                            this.field3694[4][2] = 0;
                            this.field3694[4][0] = 2727;
                            this.field3694[5][3] = 4096;
                            this.field3694[5][0] = 3411;
                            this.field3694[5][1] = 4096;
                            this.field3694[5][2] = 0;
                            this.field3694[6][2] = 0;
                            this.field3694[6][1] = 0;
                            this.field3694[6][0] = 4096;
                            this.field3694[6][3] = 4096;
                        }
                    } else {
                        this.field3694 = new int[8][4];
                        this.field3694[0][2] = 2602;
                        this.field3694[0][0] = 0;
                        this.field3694[0][1] = 2650;
                        this.field3694[0][3] = 2361;
                        this.field3694[1][3] = 1558;
                        this.field3694[1][2] = 1799;
                        this.field3694[1][0] = 2867;
                        this.field3694[1][1] = 2313;
                        this.field3694[2][1] = 2618;
                        this.field3694[2][2] = 1734;
                        this.field3694[2][3] = 1413;
                        this.field3694[2][0] = 3072;
                        this.field3694[3][1] = 2296;
                        this.field3694[3][2] = 1220;
                        this.field3694[3][0] = 3276;
                        this.field3694[3][3] = 947;
                        this.field3694[4][0] = 3481;
                        this.field3694[4][1] = 2072;
                        this.field3694[4][3] = 722;
                        this.field3694[4][2] = 963;
                        this.field3694[5][0] = 3686;
                        this.field3694[5][1] = 2730;
                        this.field3694[5][2] = 2152;
                        this.field3694[5][3] = 1766;
                        this.field3694[6][1] = 2232;
                        this.field3694[6][3] = 915;
                        this.field3694[6][0] = 3891;
                        this.field3694[6][2] = 1060;
                        this.field3694[7][3] = 1140;
                        this.field3694[7][1] = 1686;
                        this.field3694[7][0] = 4096;
                        this.field3694[7][2] = 1413;
                    }
                } else {
                    this.field3694 = new int[2][4];
                    this.field3694[0][2] = 0;
                    this.field3694[0][3] = 0;
                    this.field3694[0][1] = 0;
                    this.field3694[0][0] = 0;
                    this.field3694[1][1] = 4096;
                    this.field3694[1][2] = 4096;
                    this.field3694[1][3] = 4096;
                    this.field3694[1][0] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        if (arg0 != -15) {
            this.method3((byte) 18);
        }
        if (this.field3694 == null) {
            this.method1694(2727, 1);
        }
        ++field3698;
        this.method1693((byte) 82);
    }
}
