import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class512 extends class334 {

    @OriginalMember(owner = "client!lda", name = "G", descriptor = "[I")
    private int[] field7033 = new int[257];

    @OriginalMember(owner = "client!lda", name = "L", descriptor = "I")
    public static int field7038 = -1;

    @OriginalMember(owner = "client!lda", name = "E", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!lda", name = "F", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!lda", name = "H", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!lda", name = "I", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!lda", name = "J", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!lda", name = "K", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!lda", name = "M", descriptor = "[[I")
    private int[][] field7039;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "(I)V", line = 5)
    private final void method2983(int arg0) {
        ++field7036;
        int var2 = -71 / ((arg0 - 5) / 59);
        int var3 = this.field7039.length;
        if (~var3 < -1) {
            for (int var4 = 0; var4 < 257; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var3 > var7 && this.field7039[var7][0] <= var6; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (~var5 > ~var3) {
                    int[] var8 = this.field7039[var5];
                    if (var5 <= 0) {
                        var9 = var8[2];
                        var10 = var8[3];
                        var11 = var8[1];
                    } else {
                        int[] var12 = this.field7039[var5 - 1];
                        int var13 = (-var12[0] + var6 << 12) / (var8[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var9 = var8[2] * var13 + var12[2] * var14 >> 12;
                        var11 = var8[1] * var13 - -(var12[1] * var14) >> 12;
                        var10 = var8[3] * var13 + var12[3] * var14 >> 12;
                    }
                } else {
                    int[] var15 = this.field7039[var3 + -1];
                    var11 = var15[1];
                    var10 = var15[3];
                    var9 = var15[2];
                }
                int var16 = var11 >> 4;
                int var17 = var10 >> 4;
                int var18 = var9 >> 4;
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field7033[var4] = class694.method3895(var17, class694.method3895(var16 << 16, var18 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V", line = 545)
    public class512() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lcea;Lol;IB)V", line = 111)
    public static final void method2984(class111 arg0, class431 arg1, int arg2, byte arg3) {
        ++field7032;
        class588 var4 = new class588();
        var4.field8446 = arg1.method2557(14929);
        var4.field8450 = arg1.method2526(17);
        var4.field8452 = new byte[var4.field8446][][];
        var4.field8442 = new int[var4.field8446];
        var4.field8449 = new int[var4.field8446];
        var4.field8448 = new class746[var4.field8446];
        var4.field8444 = new class746[var4.field8446];
        var4.field8443 = new int[var4.field8446];
        for (int var5 = 0; ~var5 > ~var4.field8446; ++var5) {
            try {
                int var6 = arg1.method2557(14929);
                if (~var6 != -1 && var6 != 1 && var6 != 2) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var10 = arg1.method2532((byte) -117);
                        String var11 = arg1.method2532((byte) -119);
                        int var12 = arg1.method2557(14929);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; ~var14 > ~var12; ++var14) {
                            var13[var14] = arg1.method2532((byte) -111);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; var16 < var12; ++var16) {
                                int var17 = arg1.method2526(17);
                                var15[var16] = new byte[var17];
                                arg1.method2530(-59, var15[var16], 0, var17);
                            }
                        }
                        var4.field8449[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var12 > var19; ++var19) {
                            var18[var19] = class454.method2666(128, var13[var19]);
                        }
                        var4.field8448[var5] = arg0.method914(class454.method2666(128, var10), var18, var11, 97);
                        var4.field8452[var5] = var15;
                    }
                } else {
                    String var7 = arg1.method2532((byte) -117);
                    String var8 = arg1.method2532((byte) -127);
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg1.method2526(17);
                    }
                    var4.field8449[var5] = var6;
                    var4.field8443[var5] = var9;
                    var4.field8444[var5] = arg0.method915(class454.method2666(128, var7), (byte) -34, var8);
                }
            } catch (ClassNotFoundException var20) {
                var4.field8442[var5] = -1;
            } catch (SecurityException var21) {
                var4.field8442[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field8442[var5] = -3;
            } catch (Exception var23) {
                var4.field8442[var5] = -4;
            } catch (Throwable var24) {
                var4.field8442[var5] = -5;
            }
        }
        if (arg3 >= -106) {
            field7038 = 112;
        }
        class351.field4967.method3728((byte) 114, var4);
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V", line = 224)
    public final void method27(byte arg0) {
        ++field7034;
        if (this.field7039 == null) {
            this.method2985(true, 1);
        }
        if (arg0 >= -27) {
            method2984((class111) null, (class431) null, -90, (byte) 86);
        }
        this.method2983(-107);
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(ZI)V", line = 239)
    private final void method2985(boolean arg0, int arg1) {
        ++field7035;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field7039 = new int[4][4];
                                this.field7039[0][2] = 4096;
                                this.field7039[0][1] = 0;
                                this.field7039[0][3] = 0;
                                this.field7039[0][0] = 2048;
                                this.field7039[1][2] = 4096;
                                this.field7039[1][1] = 4096;
                                this.field7039[1][0] = 2867;
                                this.field7039[1][3] = 0;
                                this.field7039[2][2] = 4096;
                                this.field7039[2][1] = 4096;
                                this.field7039[2][3] = 0;
                                this.field7039[2][0] = 3276;
                                this.field7039[3][2] = 0;
                                this.field7039[3][1] = 4096;
                                this.field7039[3][3] = 0;
                                this.field7039[3][0] = 4096;
                            } else {
                                this.field7039 = new int[16][4];
                                this.field7039[0][3] = 321;
                                this.field7039[0][2] = 192;
                                this.field7039[0][0] = 0;
                                this.field7039[0][1] = 80;
                                this.field7039[1][2] = 449;
                                this.field7039[1][1] = 321;
                                this.field7039[1][0] = 155;
                                this.field7039[1][3] = 562;
                                this.field7039[2][3] = 803;
                                this.field7039[2][0] = 389;
                                this.field7039[2][2] = 690;
                                this.field7039[2][1] = 578;
                                this.field7039[3][2] = 995;
                                this.field7039[3][0] = 671;
                                this.field7039[3][3] = 1140;
                                this.field7039[3][1] = 947;
                                this.field7039[4][1] = 1285;
                                this.field7039[4][0] = 897;
                                this.field7039[4][2] = 1397;
                                this.field7039[4][3] = 1509;
                                this.field7039[5][2] = 1429;
                                this.field7039[5][1] = 1525;
                                this.field7039[5][3] = 1413;
                                this.field7039[5][0] = 1175;
                                this.field7039[6][1] = 1734;
                                this.field7039[6][2] = 1461;
                                this.field7039[6][3] = 1333;
                                this.field7039[6][0] = 1368;
                                this.field7039[7][2] = 1525;
                                this.field7039[7][0] = 1507;
                                this.field7039[7][1] = 1413;
                                this.field7039[7][3] = 1702;
                                this.field7039[8][2] = 1590;
                                this.field7039[8][0] = 1736;
                                this.field7039[8][1] = 1108;
                                this.field7039[8][3] = 2056;
                                this.field7039[9][2] = 2056;
                                this.field7039[9][1] = 1766;
                                this.field7039[9][0] = 2088;
                                this.field7039[9][3] = 2666;
                                this.field7039[10][3] = 3276;
                                this.field7039[10][1] = 2409;
                                this.field7039[10][2] = 2586;
                                this.field7039[10][0] = 2355;
                                this.field7039[11][0] = 2691;
                                this.field7039[11][1] = 3116;
                                this.field7039[11][3] = 3228;
                                this.field7039[11][2] = 3148;
                                this.field7039[12][0] = 3031;
                                this.field7039[12][2] = 3710;
                                this.field7039[12][1] = 3806;
                                this.field7039[12][3] = 3196;
                                this.field7039[13][3] = 3019;
                                this.field7039[13][2] = 3421;
                                this.field7039[13][0] = 3522;
                                this.field7039[13][1] = 3437;
                                this.field7039[14][0] = 3727;
                                this.field7039[14][2] = 3148;
                                this.field7039[14][1] = 3116;
                                this.field7039[14][3] = 3228;
                                this.field7039[15][3] = 2746;
                                this.field7039[15][0] = 4096;
                                this.field7039[15][1] = 2377;
                                this.field7039[15][2] = 2505;
                            }
                        } else {
                            this.field7039 = new int[6][4];
                            this.field7039[0][1] = 0;
                            this.field7039[0][3] = 0;
                            this.field7039[0][2] = 0;
                            this.field7039[0][0] = 0;
                            this.field7039[1][2] = 0;
                            this.field7039[1][3] = 1493;
                            this.field7039[1][0] = 1843;
                            this.field7039[1][1] = 0;
                            this.field7039[2][2] = 0;
                            this.field7039[2][1] = 0;
                            this.field7039[2][0] = 2457;
                            this.field7039[2][3] = 2939;
                            this.field7039[3][0] = 2781;
                            this.field7039[3][2] = 1124;
                            this.field7039[3][1] = 0;
                            this.field7039[3][3] = 3565;
                            this.field7039[4][0] = 3481;
                            this.field7039[4][2] = 3084;
                            this.field7039[4][1] = 546;
                            this.field7039[4][3] = 4031;
                            this.field7039[5][2] = 4096;
                            this.field7039[5][1] = 4096;
                            this.field7039[5][0] = 4096;
                            this.field7039[5][3] = 4096;
                        }
                    } else {
                        this.field7039 = new int[7][4];
                        this.field7039[0][0] = 0;
                        this.field7039[0][1] = 0;
                        this.field7039[0][3] = 4096;
                        this.field7039[0][2] = 0;
                        this.field7039[1][0] = 663;
                        this.field7039[1][2] = 4096;
                        this.field7039[1][3] = 4096;
                        this.field7039[1][1] = 0;
                        this.field7039[2][3] = 0;
                        this.field7039[2][1] = 0;
                        this.field7039[2][0] = 1363;
                        this.field7039[2][2] = 4096;
                        this.field7039[3][1] = 4096;
                        this.field7039[3][3] = 0;
                        this.field7039[3][2] = 4096;
                        this.field7039[3][0] = 2048;
                        this.field7039[4][0] = 2727;
                        this.field7039[4][3] = 0;
                        this.field7039[4][2] = 0;
                        this.field7039[4][1] = 4096;
                        this.field7039[5][1] = 4096;
                        this.field7039[5][3] = 4096;
                        this.field7039[5][0] = 3411;
                        this.field7039[5][2] = 0;
                        this.field7039[6][0] = 4096;
                        this.field7039[6][3] = 4096;
                        this.field7039[6][2] = 0;
                        this.field7039[6][1] = 0;
                    }
                } else {
                    this.field7039 = new int[8][4];
                    this.field7039[0][0] = 0;
                    this.field7039[0][1] = 2650;
                    this.field7039[0][2] = 2602;
                    this.field7039[0][3] = 2361;
                    this.field7039[1][3] = 1558;
                    this.field7039[1][1] = 2313;
                    this.field7039[1][0] = 2867;
                    this.field7039[1][2] = 1799;
                    this.field7039[2][2] = 1734;
                    this.field7039[2][3] = 1413;
                    this.field7039[2][0] = 3072;
                    this.field7039[2][1] = 2618;
                    this.field7039[3][3] = 947;
                    this.field7039[3][1] = 2296;
                    this.field7039[3][2] = 1220;
                    this.field7039[3][0] = 3276;
                    this.field7039[4][3] = 722;
                    this.field7039[4][0] = 3481;
                    this.field7039[4][2] = 963;
                    this.field7039[4][1] = 2072;
                    this.field7039[5][0] = 3686;
                    this.field7039[5][3] = 1766;
                    this.field7039[5][2] = 2152;
                    this.field7039[5][1] = 2730;
                    this.field7039[6][1] = 2232;
                    this.field7039[6][3] = 915;
                    this.field7039[6][2] = 1060;
                    this.field7039[6][0] = 3891;
                    this.field7039[7][1] = 1686;
                    this.field7039[7][2] = 1413;
                    this.field7039[7][0] = 4096;
                    this.field7039[7][3] = 1140;
                }
            } else {
                this.field7039 = new int[2][4];
                this.field7039[0][3] = 0;
                this.field7039[0][1] = 0;
                this.field7039[0][0] = 0;
                this.field7039[0][2] = 0;
                this.field7039[1][2] = 4096;
                this.field7039[1][1] = 4096;
                this.field7039[1][3] = 4096;
                this.field7039[1][0] = 4096;
            }
        }
        if (!arg0) {
            method2984((class111) null, (class431) null, 12, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZI)[[I", line = 496)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field7031;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (!arg0) {
            this.field7039 = null;
        }
        if (super.field4734.field425) {
            int[] var4 = this.method2052(0, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class439.field6099 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field7033[var9];
                var5[var8] = class194.method1380(var10, 16711680) >> 12;
                var6[var8] = class194.method1380(var10 >> 4, 4080);
                var7[var8] = class194.method1380(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZLol;)V", line = 551)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field7037;
        if (arg1) {
            this.method283(false, 48);
        }
        if (arg0 == 0) {
            int var4 = arg2.method2557(14929);
            if (~var4 != -1) {
                this.method2985(true, var4);
            } else {
                this.field7039 = new int[arg2.method2557(14929)][4];
                for (int var5 = 0; ~var5 > ~this.field7039.length; ++var5) {
                    this.field7039[var5][0] = arg2.method2565((byte) -128);
                    this.field7039[var5][1] = arg2.method2557(14929) << 4;
                    this.field7039[var5][2] = arg2.method2557(14929) << 4;
                    this.field7039[var5][3] = arg2.method2557(14929) << 4;
                }
            }
        }
    }
}
