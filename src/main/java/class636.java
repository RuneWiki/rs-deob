import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class636 extends class747 {

    @OriginalMember(owner = "client!me", name = "H", descriptor = "[I")
    private int[] field8544 = new int[257];

    @OriginalMember(owner = "client!me", name = "J", descriptor = "[I")
    public static int[] field8546 = new int[120];

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "[[I")
    private int[][] field8545;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        ++field8543;
        int[][] var3 = super.field10289.method2200(0, arg1);
        int var4 = 9 % ((arg0 - 35) / 58);
        if (super.field10289.field4906) {
            int[] var5 = this.method4156(94, arg1, 0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class73.field1095; ++var9) {
                int var10 = var5[var9] >> 4;
                if (~var10 > -1) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field8544[var10];
                var6[var9] = class665.method3759(16711680, var11) >> 12;
                var7[var9] = class665.method3759(var11 >> 4, 4080);
                var8[var9] = class665.method3759(var11 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBII[BII)Z")
    public static final boolean method3561(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        ++field8549;
        int var7 = arg6 % arg2;
        int var8;
        if (~var7 == -1) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg0 - -arg2 + -1) / arg2);
        int var10 = -((arg6 - -arg2 + -1) / arg2);
        for (int var11 = var9; ~var11 > -1; ++var11) {
            for (int var13 = var10; ~var13 > -1; ++var13) {
                if (arg4[arg5] == 0) {
                    return true;
                }
                arg5 += arg2;
            }
            int var14 = arg5 - var8;
            if (arg4[var14 - 1] == 0) {
                return true;
            }
            arg5 = arg3 + var14;
        }
        int var12 = 65 % ((-59 - arg1) / 61);
        return false;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
    private final void method3562(byte arg0) {
        ++field8551;
        int var2 = this.field8545.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && var5 >= this.field8545[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 > var4) {
                    int[] var7 = this.field8545[var4];
                    if (var4 <= 0) {
                        var8 = var7[2];
                        var9 = var7[1];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field8545[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] - var11[0]);
                        int var13 = -var12 + 4096;
                        var10 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                        var9 = var7[1] * var12 - -(var11[1] * var13) >> 12;
                        var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field8545[var2 + -1];
                    var9 = var14[1];
                    var10 = var14[3];
                    var8 = var14[2];
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
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
                if (var16 >= 0) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field8544[var3] = class678.method3817(var16, class678.method3817(var15 << 8, var17 << 16));
            }
        }
        int var18 = 11 / ((-54 - arg0) / 38);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)V")
    private final void method3563(byte arg0, int arg1) {
        if (arg0 <= -13) {
            ++field8547;
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (arg1 == 6) {
                                        this.field8545 = new int[4][4];
                                        this.field8545[0][3] = 0;
                                        this.field8545[0][2] = 4096;
                                        this.field8545[0][0] = 2048;
                                        this.field8545[0][1] = 0;
                                        this.field8545[1][1] = 4096;
                                        this.field8545[1][2] = 4096;
                                        this.field8545[1][3] = 0;
                                        this.field8545[1][0] = 2867;
                                        this.field8545[2][1] = 4096;
                                        this.field8545[2][2] = 4096;
                                        this.field8545[2][0] = 3276;
                                        this.field8545[2][3] = 0;
                                        this.field8545[3][3] = 0;
                                        this.field8545[3][0] = 4096;
                                        this.field8545[3][2] = 0;
                                        this.field8545[3][1] = 4096;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field8545 = new int[16][4];
                                    this.field8545[0][3] = 321;
                                    this.field8545[0][1] = 80;
                                    this.field8545[0][2] = 192;
                                    this.field8545[0][0] = 0;
                                    this.field8545[1][2] = 449;
                                    this.field8545[1][1] = 321;
                                    this.field8545[1][0] = 155;
                                    this.field8545[1][3] = 562;
                                    this.field8545[2][3] = 803;
                                    this.field8545[2][2] = 690;
                                    this.field8545[2][0] = 389;
                                    this.field8545[2][1] = 578;
                                    this.field8545[3][3] = 1140;
                                    this.field8545[3][1] = 947;
                                    this.field8545[3][2] = 995;
                                    this.field8545[3][0] = 671;
                                    this.field8545[4][0] = 897;
                                    this.field8545[4][1] = 1285;
                                    this.field8545[4][2] = 1397;
                                    this.field8545[4][3] = 1509;
                                    this.field8545[5][0] = 1175;
                                    this.field8545[5][1] = 1525;
                                    this.field8545[5][3] = 1413;
                                    this.field8545[5][2] = 1429;
                                    this.field8545[6][2] = 1461;
                                    this.field8545[6][3] = 1333;
                                    this.field8545[6][0] = 1368;
                                    this.field8545[6][1] = 1734;
                                    this.field8545[7][2] = 1525;
                                    this.field8545[7][0] = 1507;
                                    this.field8545[7][3] = 1702;
                                    this.field8545[7][1] = 1413;
                                    this.field8545[8][2] = 1590;
                                    this.field8545[8][1] = 1108;
                                    this.field8545[8][0] = 1736;
                                    this.field8545[8][3] = 2056;
                                    this.field8545[9][2] = 2056;
                                    this.field8545[9][0] = 2088;
                                    this.field8545[9][1] = 1766;
                                    this.field8545[9][3] = 2666;
                                    this.field8545[10][2] = 2586;
                                    this.field8545[10][3] = 3276;
                                    this.field8545[10][1] = 2409;
                                    this.field8545[10][0] = 2355;
                                    this.field8545[11][0] = 2691;
                                    this.field8545[11][1] = 3116;
                                    this.field8545[11][3] = 3228;
                                    this.field8545[11][2] = 3148;
                                    this.field8545[12][2] = 3710;
                                    this.field8545[12][0] = 3031;
                                    this.field8545[12][3] = 3196;
                                    this.field8545[12][1] = 3806;
                                    this.field8545[13][0] = 3522;
                                    this.field8545[13][2] = 3421;
                                    this.field8545[13][1] = 3437;
                                    this.field8545[13][3] = 3019;
                                    this.field8545[14][1] = 3116;
                                    this.field8545[14][0] = 3727;
                                    this.field8545[14][3] = 3228;
                                    this.field8545[14][2] = 3148;
                                    this.field8545[15][1] = 2377;
                                    this.field8545[15][0] = 4096;
                                    this.field8545[15][2] = 2505;
                                    this.field8545[15][3] = 2746;
                                }
                            } else {
                                this.field8545 = new int[6][4];
                                this.field8545[0][0] = 0;
                                this.field8545[0][2] = 0;
                                this.field8545[0][3] = 0;
                                this.field8545[0][1] = 0;
                                this.field8545[1][3] = 1493;
                                this.field8545[1][0] = 1843;
                                this.field8545[1][2] = 0;
                                this.field8545[1][1] = 0;
                                this.field8545[2][1] = 0;
                                this.field8545[2][2] = 0;
                                this.field8545[2][3] = 2939;
                                this.field8545[2][0] = 2457;
                                this.field8545[3][1] = 0;
                                this.field8545[3][0] = 2781;
                                this.field8545[3][3] = 3565;
                                this.field8545[3][2] = 1124;
                                this.field8545[4][2] = 3084;
                                this.field8545[4][3] = 4031;
                                this.field8545[4][1] = 546;
                                this.field8545[4][0] = 3481;
                                this.field8545[5][2] = 4096;
                                this.field8545[5][1] = 4096;
                                this.field8545[5][0] = 4096;
                                this.field8545[5][3] = 4096;
                            }
                        } else {
                            this.field8545 = new int[7][4];
                            this.field8545[0][1] = 0;
                            this.field8545[0][0] = 0;
                            this.field8545[0][2] = 0;
                            this.field8545[0][3] = 4096;
                            this.field8545[1][1] = 0;
                            this.field8545[1][3] = 4096;
                            this.field8545[1][2] = 4096;
                            this.field8545[1][0] = 663;
                            this.field8545[2][0] = 1363;
                            this.field8545[2][3] = 0;
                            this.field8545[2][2] = 4096;
                            this.field8545[2][1] = 0;
                            this.field8545[3][0] = 2048;
                            this.field8545[3][3] = 0;
                            this.field8545[3][2] = 4096;
                            this.field8545[3][1] = 4096;
                            this.field8545[4][2] = 0;
                            this.field8545[4][0] = 2727;
                            this.field8545[4][3] = 0;
                            this.field8545[4][1] = 4096;
                            this.field8545[5][3] = 4096;
                            this.field8545[5][2] = 0;
                            this.field8545[5][0] = 3411;
                            this.field8545[5][1] = 4096;
                            this.field8545[6][0] = 4096;
                            this.field8545[6][1] = 0;
                            this.field8545[6][2] = 0;
                            this.field8545[6][3] = 4096;
                        }
                    } else {
                        this.field8545 = new int[8][4];
                        this.field8545[0][0] = 0;
                        this.field8545[0][1] = 2650;
                        this.field8545[0][2] = 2602;
                        this.field8545[0][3] = 2361;
                        this.field8545[1][3] = 1558;
                        this.field8545[1][2] = 1799;
                        this.field8545[1][0] = 2867;
                        this.field8545[1][1] = 2313;
                        this.field8545[2][0] = 3072;
                        this.field8545[2][2] = 1734;
                        this.field8545[2][1] = 2618;
                        this.field8545[2][3] = 1413;
                        this.field8545[3][1] = 2296;
                        this.field8545[3][3] = 947;
                        this.field8545[3][2] = 1220;
                        this.field8545[3][0] = 3276;
                        this.field8545[4][2] = 963;
                        this.field8545[4][1] = 2072;
                        this.field8545[4][0] = 3481;
                        this.field8545[4][3] = 722;
                        this.field8545[5][0] = 3686;
                        this.field8545[5][3] = 1766;
                        this.field8545[5][2] = 2152;
                        this.field8545[5][1] = 2730;
                        this.field8545[6][1] = 2232;
                        this.field8545[6][2] = 1060;
                        this.field8545[6][0] = 3891;
                        this.field8545[6][3] = 915;
                        this.field8545[7][1] = 1686;
                        this.field8545[7][0] = 4096;
                        this.field8545[7][3] = 1140;
                        this.field8545[7][2] = 1413;
                    }
                } else {
                    this.field8545 = new int[2][4];
                    this.field8545[0][2] = 0;
                    this.field8545[0][3] = 0;
                    this.field8545[0][1] = 0;
                    this.field8545[0][0] = 0;
                    this.field8545[1][3] = 4096;
                    this.field8545[1][1] = 4096;
                    this.field8545[1][0] = 4096;
                    this.field8545[1][2] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static void method3564(int arg0) {
        field8546 = null;
        if (arg0 < 93) {
            method3565(true, -105);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field8541;
        if (arg1 != 11608) {
            this.field8544 = null;
        }
        if (~arg2 == -1) {
            int var4 = arg0.method505((byte) -119);
            if (~var4 != -1) {
                this.method3563((byte) -122, var4);
            } else {
                this.field8545 = new int[arg0.method505((byte) -119)][4];
                for (int var5 = 0; this.field8545.length > var5; ++var5) {
                    this.field8545[var5][0] = arg0.method482(-772591672);
                    this.field8545[var5][1] = arg0.method505((byte) -119) << 4;
                    this.field8545[var5][2] = arg0.method505((byte) -119) << 4;
                    this.field8545[var5][3] = arg0.method505((byte) -119) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public final void method184(int arg0) {
        ++field8542;
        if (this.field8545 == null) {
            this.method3563((byte) -67, 1);
        }
        if (arg0 == -2) {
            this.method3562((byte) -107);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class636() {
        super(1, false);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
    public static final void method3565(boolean arg0, int arg1) {
        if (arg0) {
            ++field8548;
            class346 var2 = class299.method1976(0, 11, arg1);
            var2.method2208(-1719);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -121; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field8546[var1] = var0 / 4;
        }
    }
}
