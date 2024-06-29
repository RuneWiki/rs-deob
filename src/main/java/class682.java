import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class682 extends class601 {

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "[I")
    private int[] field9526 = new int[257];

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field9520 = 0;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lpo;")
    public static class559 field9523;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "[I")
    public static int[] field9524;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "[[I")
    private int[][] field9525;

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 14)
    public class682() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IZ)[[I", line = 17)
    public final int[][] method7(int arg0, boolean arg1) {
        ++field9522;
        if (!arg1) {
            this.method6((class677) null, (byte) -40, 48);
        }
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int[] var4 = this.method3266((byte) 64, arg0, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class171.field2624 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field9526[var9];
                var5[var8] = class48.method346(16711680, var10) >> 12;
                var6[var8] = class48.method346(4080, var10 >> 4);
                var7[var8] = class48.method346(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V", line = 68)
    public static void method3849(int arg0) {
        if (arg0 >= 95) {
            field9524 = null;
            field9523 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 79)
    public final void method108(int arg0) {
        if (this.field9525 == null) {
            this.method3850((byte) -119, 1);
        }
        ++field9530;
        if (arg0 != 8351) {
            field9523 = null;
        }
        this.method3851((byte) -120);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(BI)V", line = 103)
    private final void method3850(byte arg0, int arg1) {
        ++field9529;
        int var3 = 48 / ((-83 - arg0) / 34);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field9525 = new int[4][4];
                                    this.field9525[0][1] = 0;
                                    this.field9525[0][0] = 2048;
                                    this.field9525[0][3] = 0;
                                    this.field9525[0][2] = 4096;
                                    this.field9525[1][1] = 4096;
                                    this.field9525[1][3] = 0;
                                    this.field9525[1][0] = 2867;
                                    this.field9525[1][2] = 4096;
                                    this.field9525[2][1] = 4096;
                                    this.field9525[2][0] = 3276;
                                    this.field9525[2][2] = 4096;
                                    this.field9525[2][3] = 0;
                                    this.field9525[3][1] = 4096;
                                    this.field9525[3][3] = 0;
                                    this.field9525[3][2] = 0;
                                    this.field9525[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field9525 = new int[16][4];
                                this.field9525[0][2] = 192;
                                this.field9525[0][3] = 321;
                                this.field9525[0][0] = 0;
                                this.field9525[0][1] = 80;
                                this.field9525[1][3] = 562;
                                this.field9525[1][1] = 321;
                                this.field9525[1][2] = 449;
                                this.field9525[1][0] = 155;
                                this.field9525[2][1] = 578;
                                this.field9525[2][3] = 803;
                                this.field9525[2][2] = 690;
                                this.field9525[2][0] = 389;
                                this.field9525[3][2] = 995;
                                this.field9525[3][3] = 1140;
                                this.field9525[3][1] = 947;
                                this.field9525[3][0] = 671;
                                this.field9525[4][3] = 1509;
                                this.field9525[4][0] = 897;
                                this.field9525[4][2] = 1397;
                                this.field9525[4][1] = 1285;
                                this.field9525[5][2] = 1429;
                                this.field9525[5][1] = 1525;
                                this.field9525[5][3] = 1413;
                                this.field9525[5][0] = 1175;
                                this.field9525[6][3] = 1333;
                                this.field9525[6][1] = 1734;
                                this.field9525[6][2] = 1461;
                                this.field9525[6][0] = 1368;
                                this.field9525[7][2] = 1525;
                                this.field9525[7][0] = 1507;
                                this.field9525[7][1] = 1413;
                                this.field9525[7][3] = 1702;
                                this.field9525[8][2] = 1590;
                                this.field9525[8][3] = 2056;
                                this.field9525[8][0] = 1736;
                                this.field9525[8][1] = 1108;
                                this.field9525[9][3] = 2666;
                                this.field9525[9][2] = 2056;
                                this.field9525[9][1] = 1766;
                                this.field9525[9][0] = 2088;
                                this.field9525[10][1] = 2409;
                                this.field9525[10][3] = 3276;
                                this.field9525[10][2] = 2586;
                                this.field9525[10][0] = 2355;
                                this.field9525[11][3] = 3228;
                                this.field9525[11][0] = 2691;
                                this.field9525[11][1] = 3116;
                                this.field9525[11][2] = 3148;
                                this.field9525[12][3] = 3196;
                                this.field9525[12][0] = 3031;
                                this.field9525[12][2] = 3710;
                                this.field9525[12][1] = 3806;
                                this.field9525[13][1] = 3437;
                                this.field9525[13][0] = 3522;
                                this.field9525[13][3] = 3019;
                                this.field9525[13][2] = 3421;
                                this.field9525[14][0] = 3727;
                                this.field9525[14][2] = 3148;
                                this.field9525[14][3] = 3228;
                                this.field9525[14][1] = 3116;
                                this.field9525[15][2] = 2505;
                                this.field9525[15][3] = 2746;
                                this.field9525[15][1] = 2377;
                                this.field9525[15][0] = 4096;
                            }
                        } else {
                            this.field9525 = new int[6][4];
                            this.field9525[0][3] = 0;
                            this.field9525[0][2] = 0;
                            this.field9525[0][1] = 0;
                            this.field9525[0][0] = 0;
                            this.field9525[1][2] = 0;
                            this.field9525[1][1] = 0;
                            this.field9525[1][3] = 1493;
                            this.field9525[1][0] = 1843;
                            this.field9525[2][2] = 0;
                            this.field9525[2][0] = 2457;
                            this.field9525[2][3] = 2939;
                            this.field9525[2][1] = 0;
                            this.field9525[3][3] = 3565;
                            this.field9525[3][0] = 2781;
                            this.field9525[3][1] = 0;
                            this.field9525[3][2] = 1124;
                            this.field9525[4][3] = 4031;
                            this.field9525[4][1] = 546;
                            this.field9525[4][0] = 3481;
                            this.field9525[4][2] = 3084;
                            this.field9525[5][3] = 4096;
                            this.field9525[5][1] = 4096;
                            this.field9525[5][2] = 4096;
                            this.field9525[5][0] = 4096;
                        }
                    } else {
                        this.field9525 = new int[7][4];
                        this.field9525[0][2] = 0;
                        this.field9525[0][0] = 0;
                        this.field9525[0][3] = 4096;
                        this.field9525[0][1] = 0;
                        this.field9525[1][0] = 663;
                        this.field9525[1][1] = 0;
                        this.field9525[1][2] = 4096;
                        this.field9525[1][3] = 4096;
                        this.field9525[2][0] = 1363;
                        this.field9525[2][3] = 0;
                        this.field9525[2][2] = 4096;
                        this.field9525[2][1] = 0;
                        this.field9525[3][0] = 2048;
                        this.field9525[3][3] = 0;
                        this.field9525[3][1] = 4096;
                        this.field9525[3][2] = 4096;
                        this.field9525[4][2] = 0;
                        this.field9525[4][1] = 4096;
                        this.field9525[4][3] = 0;
                        this.field9525[4][0] = 2727;
                        this.field9525[5][3] = 4096;
                        this.field9525[5][0] = 3411;
                        this.field9525[5][2] = 0;
                        this.field9525[5][1] = 4096;
                        this.field9525[6][0] = 4096;
                        this.field9525[6][1] = 0;
                        this.field9525[6][2] = 0;
                        this.field9525[6][3] = 4096;
                    }
                } else {
                    this.field9525 = new int[8][4];
                    this.field9525[0][1] = 2650;
                    this.field9525[0][0] = 0;
                    this.field9525[0][2] = 2602;
                    this.field9525[0][3] = 2361;
                    this.field9525[1][2] = 1799;
                    this.field9525[1][3] = 1558;
                    this.field9525[1][0] = 2867;
                    this.field9525[1][1] = 2313;
                    this.field9525[2][3] = 1413;
                    this.field9525[2][0] = 3072;
                    this.field9525[2][1] = 2618;
                    this.field9525[2][2] = 1734;
                    this.field9525[3][0] = 3276;
                    this.field9525[3][1] = 2296;
                    this.field9525[3][3] = 947;
                    this.field9525[3][2] = 1220;
                    this.field9525[4][2] = 963;
                    this.field9525[4][3] = 722;
                    this.field9525[4][1] = 2072;
                    this.field9525[4][0] = 3481;
                    this.field9525[5][2] = 2152;
                    this.field9525[5][0] = 3686;
                    this.field9525[5][3] = 1766;
                    this.field9525[5][1] = 2730;
                    this.field9525[6][1] = 2232;
                    this.field9525[6][2] = 1060;
                    this.field9525[6][3] = 915;
                    this.field9525[6][0] = 3891;
                    this.field9525[7][3] = 1140;
                    this.field9525[7][2] = 1413;
                    this.field9525[7][0] = 4096;
                    this.field9525[7][1] = 1686;
                }
            } else {
                this.field9525 = new int[2][4];
                this.field9525[0][3] = 0;
                this.field9525[0][0] = 0;
                this.field9525[0][1] = 0;
                this.field9525[0][2] = 0;
                this.field9525[1][3] = 4096;
                this.field9525[1][2] = 4096;
                this.field9525[1][0] = 4096;
                this.field9525[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 358)
    private final void method3851(byte arg0) {
        int var2 = -4 / ((arg0 - -80) / 37);
        ++field9528;
        int var3 = this.field9525.length;
        if (~var3 < -1) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; ~var3 < ~var7 && this.field9525[var7][0] <= var6; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (var5 < var3) {
                    int[] var8 = this.field9525[var5];
                    if (var5 <= 0) {
                        var9 = var8[3];
                        var10 = var8[2];
                        var11 = var8[1];
                    } else {
                        int[] var12 = this.field9525[var5 + -1];
                        int var13 = (-var12[0] + var6 << 12) / (var8[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var11 = var8[1] * var13 + var12[1] * var14 >> 12;
                        var9 = var8[3] * var13 - -(var12[3] * var14) >> 12;
                        var10 = var8[2] * var13 + var12[2] * var14 >> 12;
                    }
                } else {
                    int[] var15 = this.field9525[var3 - 1];
                    var10 = var15[2];
                    var11 = var15[1];
                    var9 = var15[3];
                }
                int var16 = var9 >> 4;
                int var17 = var10 >> 4;
                int var18 = var11 >> 4;
                if (var16 < 0) {
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
                if (~var18 <= -1) {
                    if (~var18 < -256) {
                        var18 = 255;
                    }
                } else {
                    var18 = 0;
                }
                this.field9526[var4] = class446.method2556(var16, class446.method2556(var18 << 16, var17 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lee;BI)V", line = 459)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg1 != -61) {
            this.method7(-34, true);
        }
        if (arg2 == 0) {
            int var4 = arg0.method3821((byte) 109);
            if (~var4 != -1) {
                this.method3850((byte) -128, var4);
            } else {
                this.field9525 = new int[arg0.method3821((byte) 121)][4];
                for (int var5 = 0; ~this.field9525.length < ~var5; ++var5) {
                    this.field9525[var5][0] = arg0.method3807(-1);
                    this.field9525[var5][1] = arg0.method3821((byte) 90) << 4;
                    this.field9525[var5][2] = arg0.method3821((byte) 109) << 4;
                    this.field9525[var5][3] = arg0.method3821((byte) 92) << 4;
                }
            }
        }
        ++field9527;
    }
}
