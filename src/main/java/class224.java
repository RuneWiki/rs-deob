import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class224 extends class386 {

    @OriginalMember(owner = "client!cca", name = "F", descriptor = "[I")
    private int[] field2906 = new int[257];

    @OriginalMember(owner = "client!cca", name = "N", descriptor = "[I")
    public static int[] field2913 = new int[32];

    @OriginalMember(owner = "client!cca", name = "H", descriptor = "Lwo;")
    public static class690 field2908 = new class690(57, -2);

    @OriginalMember(owner = "client!cca", name = "D", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!cca", name = "E", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!cca", name = "G", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!cca", name = "K", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!cca", name = "L", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!cca", name = "M", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!cca", name = "O", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!cca", name = "I", descriptor = "[[I")
    private int[][] field2909;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field2905;
        if (~arg0 == -1) {
            int var4 = arg2.method2229(255);
            if (var4 == 0) {
                this.field2909 = new int[arg2.method2229(255)][4];
                for (int var5 = 0; var5 < this.field2909.length; ++var5) {
                    this.field2909[var5][0] = arg2.method2260(-103);
                    this.field2909[var5][1] = arg2.method2229(255) << 4;
                    this.field2909[var5][2] = arg2.method2229(255) << 4;
                    this.field2909[var5][3] = arg2.method2229(255) << 4;
                }
            } else {
                this.method1360(var4, (byte) 43);
            }
        }
        if (arg1 < 111) {
            field2914 = -31;
        }
    }

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "(I)V")
    public static void method1357(int arg0) {
        if (arg0 > -11) {
            method1358(-65, false, 44, 88, 20, 74, 10, -75);
        }
        field2908 = null;
        field2913 = null;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method1358(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2910;
        int var8 = arg0 - arg7;
        int var9 = arg5 + arg7;
        for (int var10 = arg5; var9 > var10; ++var10) {
            class359.method2018(class678.field9722[var10], arg2, 69, arg6, arg3);
        }
        int var11 = -arg7 + arg2;
        int var12 = arg3 + arg7;
        if (!arg1) {
            field2914 = 7;
        }
        for (int var13 = arg0; ~var8 > ~var13; --var13) {
            class359.method2018(class678.field9722[var13], arg2, -37, arg6, arg3);
        }
        for (int var14 = var9; ~var8 <= ~var14; ++var14) {
            int[] var15 = class678.field9722[var14];
            class359.method2018(var15, var12, 124, arg6, arg3);
            class359.method2018(var15, var11, 118, arg4, var12);
            class359.method2018(var15, arg2, -39, arg6, var11);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        if (arg0 < 0) {
            this.field2906 = null;
        }
        if (this.field2909 == null) {
            this.method1360(1, (byte) 43);
        }
        ++field2912;
        this.method1359((byte) -60);
    }

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "(B)V")
    private final void method1359(byte arg0) {
        ++field2911;
        if (arg0 > -54) {
            this.method355(-78, (byte) -110, (class389) null);
        }
        int var2 = this.field2909.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && var5 >= this.field2909[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 < ~var4) {
                    int[] var7 = this.field2909[var4];
                    if (~var4 >= -1) {
                        var8 = var7[1];
                        var9 = var7[3];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field2909[var4 + -1];
                        int var12 = (var5 - var11[0] << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[3] * var12 + var11[3] * var13 >> 12;
                        var10 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field2909[var2 + -1];
                    var10 = var14[2];
                    var8 = var14[1];
                    var9 = var14[3];
                }
                int var15 = var10 >> 4;
                int var16 = var9 >> 4;
                int var17 = var8 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                this.field2906[var3] = class242.method1474(var16, class242.method1474(var17 << 16, var15 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IB)V")
    private final void method1360(int arg0, byte arg1) {
        ++field2907;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2909 = new int[4][4];
                                this.field2909[0][0] = 2048;
                                this.field2909[0][2] = 4096;
                                this.field2909[0][1] = 0;
                                this.field2909[0][3] = 0;
                                this.field2909[1][0] = 2867;
                                this.field2909[1][3] = 0;
                                this.field2909[1][1] = 4096;
                                this.field2909[1][2] = 4096;
                                this.field2909[2][3] = 0;
                                this.field2909[2][0] = 3276;
                                this.field2909[2][1] = 4096;
                                this.field2909[2][2] = 4096;
                                this.field2909[3][0] = 4096;
                                this.field2909[3][3] = 0;
                                this.field2909[3][2] = 0;
                                this.field2909[3][1] = 4096;
                            } else {
                                this.field2909 = new int[16][4];
                                this.field2909[0][1] = 80;
                                this.field2909[0][3] = 321;
                                this.field2909[0][2] = 192;
                                this.field2909[0][0] = 0;
                                this.field2909[1][2] = 449;
                                this.field2909[1][3] = 562;
                                this.field2909[1][1] = 321;
                                this.field2909[1][0] = 155;
                                this.field2909[2][1] = 578;
                                this.field2909[2][0] = 389;
                                this.field2909[2][2] = 690;
                                this.field2909[2][3] = 803;
                                this.field2909[3][3] = 1140;
                                this.field2909[3][1] = 947;
                                this.field2909[3][2] = 995;
                                this.field2909[3][0] = 671;
                                this.field2909[4][1] = 1285;
                                this.field2909[4][2] = 1397;
                                this.field2909[4][0] = 897;
                                this.field2909[4][3] = 1509;
                                this.field2909[5][2] = 1429;
                                this.field2909[5][0] = 1175;
                                this.field2909[5][1] = 1525;
                                this.field2909[5][3] = 1413;
                                this.field2909[6][1] = 1734;
                                this.field2909[6][3] = 1333;
                                this.field2909[6][0] = 1368;
                                this.field2909[6][2] = 1461;
                                this.field2909[7][3] = 1702;
                                this.field2909[7][1] = 1413;
                                this.field2909[7][2] = 1525;
                                this.field2909[7][0] = 1507;
                                this.field2909[8][2] = 1590;
                                this.field2909[8][1] = 1108;
                                this.field2909[8][3] = 2056;
                                this.field2909[8][0] = 1736;
                                this.field2909[9][3] = 2666;
                                this.field2909[9][1] = 1766;
                                this.field2909[9][2] = 2056;
                                this.field2909[9][0] = 2088;
                                this.field2909[10][3] = 3276;
                                this.field2909[10][2] = 2586;
                                this.field2909[10][0] = 2355;
                                this.field2909[10][1] = 2409;
                                this.field2909[11][2] = 3148;
                                this.field2909[11][3] = 3228;
                                this.field2909[11][0] = 2691;
                                this.field2909[11][1] = 3116;
                                this.field2909[12][2] = 3710;
                                this.field2909[12][3] = 3196;
                                this.field2909[12][1] = 3806;
                                this.field2909[12][0] = 3031;
                                this.field2909[13][3] = 3019;
                                this.field2909[13][2] = 3421;
                                this.field2909[13][0] = 3522;
                                this.field2909[13][1] = 3437;
                                this.field2909[14][3] = 3228;
                                this.field2909[14][0] = 3727;
                                this.field2909[14][1] = 3116;
                                this.field2909[14][2] = 3148;
                                this.field2909[15][2] = 2505;
                                this.field2909[15][3] = 2746;
                                this.field2909[15][0] = 4096;
                                this.field2909[15][1] = 2377;
                            }
                        } else {
                            this.field2909 = new int[6][4];
                            this.field2909[0][0] = 0;
                            this.field2909[0][1] = 0;
                            this.field2909[0][2] = 0;
                            this.field2909[0][3] = 0;
                            this.field2909[1][0] = 1843;
                            this.field2909[1][1] = 0;
                            this.field2909[1][2] = 0;
                            this.field2909[1][3] = 1493;
                            this.field2909[2][3] = 2939;
                            this.field2909[2][2] = 0;
                            this.field2909[2][0] = 2457;
                            this.field2909[2][1] = 0;
                            this.field2909[3][1] = 0;
                            this.field2909[3][3] = 3565;
                            this.field2909[3][0] = 2781;
                            this.field2909[3][2] = 1124;
                            this.field2909[4][3] = 4031;
                            this.field2909[4][1] = 546;
                            this.field2909[4][2] = 3084;
                            this.field2909[4][0] = 3481;
                            this.field2909[5][2] = 4096;
                            this.field2909[5][3] = 4096;
                            this.field2909[5][0] = 4096;
                            this.field2909[5][1] = 4096;
                        }
                    } else {
                        this.field2909 = new int[7][4];
                        this.field2909[0][3] = 4096;
                        this.field2909[0][1] = 0;
                        this.field2909[0][2] = 0;
                        this.field2909[0][0] = 0;
                        this.field2909[1][1] = 0;
                        this.field2909[1][0] = 663;
                        this.field2909[1][3] = 4096;
                        this.field2909[1][2] = 4096;
                        this.field2909[2][2] = 4096;
                        this.field2909[2][1] = 0;
                        this.field2909[2][3] = 0;
                        this.field2909[2][0] = 1363;
                        this.field2909[3][2] = 4096;
                        this.field2909[3][0] = 2048;
                        this.field2909[3][1] = 4096;
                        this.field2909[3][3] = 0;
                        this.field2909[4][1] = 4096;
                        this.field2909[4][3] = 0;
                        this.field2909[4][0] = 2727;
                        this.field2909[4][2] = 0;
                        this.field2909[5][1] = 4096;
                        this.field2909[5][0] = 3411;
                        this.field2909[5][3] = 4096;
                        this.field2909[5][2] = 0;
                        this.field2909[6][2] = 0;
                        this.field2909[6][3] = 4096;
                        this.field2909[6][0] = 4096;
                        this.field2909[6][1] = 0;
                    }
                } else {
                    this.field2909 = new int[8][4];
                    this.field2909[0][0] = 0;
                    this.field2909[0][3] = 2361;
                    this.field2909[0][1] = 2650;
                    this.field2909[0][2] = 2602;
                    this.field2909[1][2] = 1799;
                    this.field2909[1][0] = 2867;
                    this.field2909[1][1] = 2313;
                    this.field2909[1][3] = 1558;
                    this.field2909[2][1] = 2618;
                    this.field2909[2][2] = 1734;
                    this.field2909[2][0] = 3072;
                    this.field2909[2][3] = 1413;
                    this.field2909[3][2] = 1220;
                    this.field2909[3][1] = 2296;
                    this.field2909[3][0] = 3276;
                    this.field2909[3][3] = 947;
                    this.field2909[4][2] = 963;
                    this.field2909[4][1] = 2072;
                    this.field2909[4][0] = 3481;
                    this.field2909[4][3] = 722;
                    this.field2909[5][0] = 3686;
                    this.field2909[5][1] = 2730;
                    this.field2909[5][3] = 1766;
                    this.field2909[5][2] = 2152;
                    this.field2909[6][3] = 915;
                    this.field2909[6][0] = 3891;
                    this.field2909[6][2] = 1060;
                    this.field2909[6][1] = 2232;
                    this.field2909[7][1] = 1686;
                    this.field2909[7][3] = 1140;
                    this.field2909[7][2] = 1413;
                    this.field2909[7][0] = 4096;
                }
            } else {
                this.field2909 = new int[2][4];
                this.field2909[0][1] = 0;
                this.field2909[0][0] = 0;
                this.field2909[0][3] = 0;
                this.field2909[0][2] = 0;
                this.field2909[1][3] = 4096;
                this.field2909[1][0] = 4096;
                this.field2909[1][2] = 4096;
                this.field2909[1][1] = 4096;
            }
        }
        if (arg1 != 43) {
            this.method358(-4);
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(II)[[I")
    public final int[][] method645(int arg0, int arg1) {
        ++field2904;
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (arg1 != 3) {
            method1357(68);
        }
        if (super.field5148.field2041) {
            int[] var4 = this.method2212((byte) 90, arg0, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class599.field8643 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2906[var9];
                var5[var8] = class435.method2605(16711680, var10) >> 12;
                var6[var8] = class435.method2605(65280, var10) >> 4;
                var7[var8] = class435.method2605(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
    public class224() {
        super(1, false);
    }
}
