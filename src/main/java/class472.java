import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class472 extends class5 {

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "[I")
    private int[] field5982 = new int[257];

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "Lfh;")
    public static class266 field5985 = new class266(7, 5);

    @OriginalMember(owner = "client!sr", name = "T", descriptor = "[Z")
    public static boolean[] field5994 = new boolean[100];

    @OriginalMember(owner = "client!sr", name = "P", descriptor = "I")
    public static int field5990 = 328;

    @OriginalMember(owner = "client!sr", name = "U", descriptor = "Ltb;")
    public static class450 field5995 = new class450(3000000, 200);

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!sr", name = "O", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!sr", name = "R", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!sr", name = "V", descriptor = "J")
    public static long field5996;

    @OriginalMember(owner = "client!sr", name = "S", descriptor = "Lpl;")
    public static class612 field5993;

    @OriginalMember(owner = "client!sr", name = "Q", descriptor = "[[I")
    private int[][] field5991;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field5987;
        int[][] var3 = super.field135.method2706(arg0, -118);
        if (super.field135.field6667) {
            int[] var4 = this.method49(arg0, !arg1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class657.field9287; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field5982[var9];
                var5[var8] = class695.method3921(var10, 16711680) >> 12;
                var6[var8] = class695.method3921(65280, var10) >> 4;
                var7[var8] = class695.method3921(var10 << 4, 4080);
            }
        }
        if (!arg1) {
            this.method2496(-29);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
    public class472() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)V")
    private final void method2493(int arg0, int arg1) {
        ++field5984;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field5991 = new int[4][4];
                                this.field5991[0][0] = 2048;
                                this.field5991[0][1] = 0;
                                this.field5991[0][2] = 4096;
                                this.field5991[0][3] = 0;
                                this.field5991[1][3] = 0;
                                this.field5991[1][1] = 4096;
                                this.field5991[1][0] = 2867;
                                this.field5991[1][2] = 4096;
                                this.field5991[2][2] = 4096;
                                this.field5991[2][1] = 4096;
                                this.field5991[2][0] = 3276;
                                this.field5991[2][3] = 0;
                                this.field5991[3][2] = 0;
                                this.field5991[3][3] = 0;
                                this.field5991[3][0] = 4096;
                                this.field5991[3][1] = 4096;
                            } else {
                                this.field5991 = new int[16][4];
                                this.field5991[0][0] = 0;
                                this.field5991[0][3] = 321;
                                this.field5991[0][1] = 80;
                                this.field5991[0][2] = 192;
                                this.field5991[1][0] = 155;
                                this.field5991[1][3] = 562;
                                this.field5991[1][2] = 449;
                                this.field5991[1][1] = 321;
                                this.field5991[2][2] = 690;
                                this.field5991[2][1] = 578;
                                this.field5991[2][0] = 389;
                                this.field5991[2][3] = 803;
                                this.field5991[3][3] = 1140;
                                this.field5991[3][2] = 995;
                                this.field5991[3][1] = 947;
                                this.field5991[3][0] = 671;
                                this.field5991[4][0] = 897;
                                this.field5991[4][1] = 1285;
                                this.field5991[4][2] = 1397;
                                this.field5991[4][3] = 1509;
                                this.field5991[5][3] = 1413;
                                this.field5991[5][0] = 1175;
                                this.field5991[5][2] = 1429;
                                this.field5991[5][1] = 1525;
                                this.field5991[6][3] = 1333;
                                this.field5991[6][0] = 1368;
                                this.field5991[6][2] = 1461;
                                this.field5991[6][1] = 1734;
                                this.field5991[7][3] = 1702;
                                this.field5991[7][2] = 1525;
                                this.field5991[7][0] = 1507;
                                this.field5991[7][1] = 1413;
                                this.field5991[8][2] = 1590;
                                this.field5991[8][3] = 2056;
                                this.field5991[8][1] = 1108;
                                this.field5991[8][0] = 1736;
                                this.field5991[9][1] = 1766;
                                this.field5991[9][0] = 2088;
                                this.field5991[9][2] = 2056;
                                this.field5991[9][3] = 2666;
                                this.field5991[10][1] = 2409;
                                this.field5991[10][0] = 2355;
                                this.field5991[10][2] = 2586;
                                this.field5991[10][3] = 3276;
                                this.field5991[11][3] = 3228;
                                this.field5991[11][1] = 3116;
                                this.field5991[11][0] = 2691;
                                this.field5991[11][2] = 3148;
                                this.field5991[12][0] = 3031;
                                this.field5991[12][3] = 3196;
                                this.field5991[12][2] = 3710;
                                this.field5991[12][1] = 3806;
                                this.field5991[13][1] = 3437;
                                this.field5991[13][0] = 3522;
                                this.field5991[13][3] = 3019;
                                this.field5991[13][2] = 3421;
                                this.field5991[14][0] = 3727;
                                this.field5991[14][3] = 3228;
                                this.field5991[14][2] = 3148;
                                this.field5991[14][1] = 3116;
                                this.field5991[15][0] = 4096;
                                this.field5991[15][3] = 2746;
                                this.field5991[15][1] = 2377;
                                this.field5991[15][2] = 2505;
                            }
                        } else {
                            this.field5991 = new int[6][4];
                            this.field5991[0][3] = 0;
                            this.field5991[0][0] = 0;
                            this.field5991[0][2] = 0;
                            this.field5991[0][1] = 0;
                            this.field5991[1][1] = 0;
                            this.field5991[1][3] = 1493;
                            this.field5991[1][0] = 1843;
                            this.field5991[1][2] = 0;
                            this.field5991[2][3] = 2939;
                            this.field5991[2][2] = 0;
                            this.field5991[2][1] = 0;
                            this.field5991[2][0] = 2457;
                            this.field5991[3][3] = 3565;
                            this.field5991[3][2] = 1124;
                            this.field5991[3][0] = 2781;
                            this.field5991[3][1] = 0;
                            this.field5991[4][0] = 3481;
                            this.field5991[4][1] = 546;
                            this.field5991[4][2] = 3084;
                            this.field5991[4][3] = 4031;
                            this.field5991[5][3] = 4096;
                            this.field5991[5][2] = 4096;
                            this.field5991[5][1] = 4096;
                            this.field5991[5][0] = 4096;
                        }
                    } else {
                        this.field5991 = new int[7][4];
                        this.field5991[0][1] = 0;
                        this.field5991[0][2] = 0;
                        this.field5991[0][3] = 4096;
                        this.field5991[0][0] = 0;
                        this.field5991[1][2] = 4096;
                        this.field5991[1][0] = 663;
                        this.field5991[1][3] = 4096;
                        this.field5991[1][1] = 0;
                        this.field5991[2][0] = 1363;
                        this.field5991[2][3] = 0;
                        this.field5991[2][2] = 4096;
                        this.field5991[2][1] = 0;
                        this.field5991[3][1] = 4096;
                        this.field5991[3][3] = 0;
                        this.field5991[3][2] = 4096;
                        this.field5991[3][0] = 2048;
                        this.field5991[4][1] = 4096;
                        this.field5991[4][2] = 0;
                        this.field5991[4][0] = 2727;
                        this.field5991[4][3] = 0;
                        this.field5991[5][1] = 4096;
                        this.field5991[5][3] = 4096;
                        this.field5991[5][0] = 3411;
                        this.field5991[5][2] = 0;
                        this.field5991[6][1] = 0;
                        this.field5991[6][3] = 4096;
                        this.field5991[6][0] = 4096;
                        this.field5991[6][2] = 0;
                    }
                } else {
                    this.field5991 = new int[8][4];
                    this.field5991[0][1] = 2650;
                    this.field5991[0][2] = 2602;
                    this.field5991[0][3] = 2361;
                    this.field5991[0][0] = 0;
                    this.field5991[1][0] = 2867;
                    this.field5991[1][3] = 1558;
                    this.field5991[1][2] = 1799;
                    this.field5991[1][1] = 2313;
                    this.field5991[2][0] = 3072;
                    this.field5991[2][2] = 1734;
                    this.field5991[2][1] = 2618;
                    this.field5991[2][3] = 1413;
                    this.field5991[3][0] = 3276;
                    this.field5991[3][1] = 2296;
                    this.field5991[3][2] = 1220;
                    this.field5991[3][3] = 947;
                    this.field5991[4][2] = 963;
                    this.field5991[4][1] = 2072;
                    this.field5991[4][3] = 722;
                    this.field5991[4][0] = 3481;
                    this.field5991[5][2] = 2152;
                    this.field5991[5][1] = 2730;
                    this.field5991[5][3] = 1766;
                    this.field5991[5][0] = 3686;
                    this.field5991[6][3] = 915;
                    this.field5991[6][2] = 1060;
                    this.field5991[6][0] = 3891;
                    this.field5991[6][1] = 2232;
                    this.field5991[7][0] = 4096;
                    this.field5991[7][3] = 1140;
                    this.field5991[7][2] = 1413;
                    this.field5991[7][1] = 1686;
                }
            } else {
                this.field5991 = new int[2][4];
                this.field5991[0][2] = 0;
                this.field5991[0][3] = 0;
                this.field5991[0][1] = 0;
                this.field5991[0][0] = 0;
                this.field5991[1][1] = 4096;
                this.field5991[1][2] = 4096;
                this.field5991[1][0] = 4096;
                this.field5991[1][3] = 4096;
            }
        }
        if (arg0 != 2867) {
            field5992 = -74;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        int var2 = 14 % ((64 - arg0) / 60);
        ++field5986;
        if (this.field5991 == null) {
            this.method2493(2867, 1);
        }
        this.method2496(98);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field5983;
        if (arg0 != 1) {
            this.method2493(127, 24);
        }
        if (arg2 == 0) {
            int var4 = arg1.method3501(-9268);
            if (var4 != 0) {
                this.method2493(arg0 + 2866, var4);
            } else {
                this.field5991 = new int[arg1.method3501(-9268)][4];
                for (int var5 = 0; ~this.field5991.length < ~var5; ++var5) {
                    this.field5991[var5][0] = arg1.method3470(13111);
                    this.field5991[var5][1] = arg1.method3501(-9268) << 4;
                    this.field5991[var5][2] = arg1.method3501(class688.method3877(arg0, -9267)) << 4;
                    this.field5991[var5][3] = arg1.method3501(-9268) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "(I)V")
    public static void method2494(int arg0) {
        field5995 = null;
        field5985 = null;
        if (arg0 != -5300) {
            method2494(6);
        }
        field5994 = null;
        field5993 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(FI[BFLab;FFFIIIII)V")
    public static final void method2495(float arg0, int arg1, byte[] arg2, float arg3, class318 arg4, float arg5, float arg6, float arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field5989;
        for (int var13 = 0; ~var13 > ~arg12; ++var13) {
            class17.method115(arg11, arg6, arg0, arg3, arg2, arg4, arg5, arg9, arg8, arg1, arg12, arg7, 0, var13);
            arg11 += arg8 * arg9;
        }
        if (arg10 != 1) {
            field5990 = -68;
        }
    }

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "(I)V")
    private final void method2496(int arg0) {
        ++field5988;
        int var2 = this.field5991.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && this.field5991[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var2 < ~var4) {
                    int[] var7 = this.field5991[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field5991[var4 + -1];
                        int var9 = (var5 - var8[0] << 12) / (var7[0] + -var8[0]);
                        int var10 = 4096 - var9;
                        var11 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                    } else {
                        var13 = var7[2];
                        var11 = var7[3];
                        var12 = var7[1];
                    }
                } else {
                    int[] var14 = this.field5991[var2 - 1];
                    var11 = var14[3];
                    var12 = var14[1];
                    var13 = var14[2];
                }
                int var15 = var12 >> 4;
                int var16 = var11 >> 4;
                int var17 = var13 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var16 >= 0) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field5982[var3] = class444.method2376(class444.method2376(var15 << 16, var17 << 8), var16);
            }
        }
        if (arg0 <= 31) {
            method2494(43);
        }
    }
}
