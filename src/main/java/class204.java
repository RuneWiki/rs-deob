import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class204 extends class440 {

    @OriginalMember(owner = "client!jda", name = "E", descriptor = "[I")
    private int[] field2879 = new int[257];

    @OriginalMember(owner = "client!jda", name = "C", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!jda", name = "D", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!jda", name = "G", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!jda", name = "I", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!jda", name = "K", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!jda", name = "L", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!jda", name = "M", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!jda", name = "N", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!jda", name = "O", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!jda", name = "H", descriptor = "[[I")
    private int[][] field2881;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(III)I")
    public static final int method1353(int arg0, int arg1, int arg2) {
        ++field2885;
        if (arg2 != -4) {
            return 22;
        } else {
            return ~arg1 != -2 && ~arg1 != -4 ? class242.field3764[3 & arg0] : class56.field1095[arg0 & 3];
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lpu;Ljava/lang/String;ZI)Lam;")
    public static final class585 method1354(class522 arg0, String arg1, boolean arg2, int arg3) {
        ++field2882;
        int var4 = arg0.method2980(-9104, arg1);
        if (var4 == -1) {
            return new class585(0);
        } else {
            int[] var5 = arg0.method3002(var4, arg3 + 23426);
            class585 var6 = new class585(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var7 < var6.field8202) {
                    class695 var9 = new class695(arg0.method3007(var4, var5[var8++], 5));
                    int var10 = var9.method3880(arg3 ^ -23344);
                    int var11 = var9.method3847((byte) 118);
                    int var12 = var9.method3826(false);
                    if (!arg2 && ~var12 == -2) {
                        --var6.field8202;
                    } else {
                        var6.field8203[var7] = var10;
                        var6.field8200[var7] = var11;
                        ++var7;
                    }
                }
                if (arg3 != -23336) {
                    return null;
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
    public final void method230(int arg0) {
        if (this.field2881 == null) {
            this.method1355(-27222, 1);
        }
        ++field2886;
        if (arg0 != -9) {
            field2887 = -108;
        }
        this.method1358(26317);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)V")
    private final void method1355(int arg0, int arg1) {
        if (arg0 != -27222) {
            this.field2879 = null;
        }
        ++field2880;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field2881 = new int[4][4];
                                    this.field2881[0][1] = 0;
                                    this.field2881[0][2] = 4096;
                                    this.field2881[0][3] = 0;
                                    this.field2881[0][0] = 2048;
                                    this.field2881[1][1] = 4096;
                                    this.field2881[1][0] = 2867;
                                    this.field2881[1][2] = 4096;
                                    this.field2881[1][3] = 0;
                                    this.field2881[2][2] = 4096;
                                    this.field2881[2][0] = 3276;
                                    this.field2881[2][1] = 4096;
                                    this.field2881[2][3] = 0;
                                    this.field2881[3][1] = 4096;
                                    this.field2881[3][3] = 0;
                                    this.field2881[3][2] = 0;
                                    this.field2881[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field2881 = new int[16][4];
                                this.field2881[0][2] = 192;
                                this.field2881[0][0] = 0;
                                this.field2881[0][1] = 80;
                                this.field2881[0][3] = 321;
                                this.field2881[1][2] = 449;
                                this.field2881[1][0] = 155;
                                this.field2881[1][3] = 562;
                                this.field2881[1][1] = 321;
                                this.field2881[2][2] = 690;
                                this.field2881[2][0] = 389;
                                this.field2881[2][1] = 578;
                                this.field2881[2][3] = 803;
                                this.field2881[3][2] = 995;
                                this.field2881[3][3] = 1140;
                                this.field2881[3][1] = 947;
                                this.field2881[3][0] = 671;
                                this.field2881[4][0] = 897;
                                this.field2881[4][2] = 1397;
                                this.field2881[4][3] = 1509;
                                this.field2881[4][1] = 1285;
                                this.field2881[5][2] = 1429;
                                this.field2881[5][3] = 1413;
                                this.field2881[5][1] = 1525;
                                this.field2881[5][0] = 1175;
                                this.field2881[6][2] = 1461;
                                this.field2881[6][3] = 1333;
                                this.field2881[6][1] = 1734;
                                this.field2881[6][0] = 1368;
                                this.field2881[7][2] = 1525;
                                this.field2881[7][0] = 1507;
                                this.field2881[7][3] = 1702;
                                this.field2881[7][1] = 1413;
                                this.field2881[8][3] = 2056;
                                this.field2881[8][2] = 1590;
                                this.field2881[8][1] = 1108;
                                this.field2881[8][0] = 1736;
                                this.field2881[9][0] = 2088;
                                this.field2881[9][2] = 2056;
                                this.field2881[9][3] = 2666;
                                this.field2881[9][1] = 1766;
                                this.field2881[10][0] = 2355;
                                this.field2881[10][2] = 2586;
                                this.field2881[10][1] = 2409;
                                this.field2881[10][3] = 3276;
                                this.field2881[11][0] = 2691;
                                this.field2881[11][3] = 3228;
                                this.field2881[11][2] = 3148;
                                this.field2881[11][1] = 3116;
                                this.field2881[12][1] = 3806;
                                this.field2881[12][3] = 3196;
                                this.field2881[12][0] = 3031;
                                this.field2881[12][2] = 3710;
                                this.field2881[13][2] = 3421;
                                this.field2881[13][3] = 3019;
                                this.field2881[13][1] = 3437;
                                this.field2881[13][0] = 3522;
                                this.field2881[14][2] = 3148;
                                this.field2881[14][3] = 3228;
                                this.field2881[14][1] = 3116;
                                this.field2881[14][0] = 3727;
                                this.field2881[15][1] = 2377;
                                this.field2881[15][2] = 2505;
                                this.field2881[15][0] = 4096;
                                this.field2881[15][3] = 2746;
                            }
                        } else {
                            this.field2881 = new int[6][4];
                            this.field2881[0][2] = 0;
                            this.field2881[0][3] = 0;
                            this.field2881[0][1] = 0;
                            this.field2881[0][0] = 0;
                            this.field2881[1][0] = 1843;
                            this.field2881[1][1] = 0;
                            this.field2881[1][2] = 0;
                            this.field2881[1][3] = 1493;
                            this.field2881[2][0] = 2457;
                            this.field2881[2][2] = 0;
                            this.field2881[2][1] = 0;
                            this.field2881[2][3] = 2939;
                            this.field2881[3][3] = 3565;
                            this.field2881[3][0] = 2781;
                            this.field2881[3][2] = 1124;
                            this.field2881[3][1] = 0;
                            this.field2881[4][1] = 546;
                            this.field2881[4][2] = 3084;
                            this.field2881[4][0] = 3481;
                            this.field2881[4][3] = 4031;
                            this.field2881[5][3] = 4096;
                            this.field2881[5][2] = 4096;
                            this.field2881[5][1] = 4096;
                            this.field2881[5][0] = 4096;
                        }
                    } else {
                        this.field2881 = new int[7][4];
                        this.field2881[0][3] = 4096;
                        this.field2881[0][0] = 0;
                        this.field2881[0][1] = 0;
                        this.field2881[0][2] = 0;
                        this.field2881[1][3] = 4096;
                        this.field2881[1][1] = 0;
                        this.field2881[1][0] = 663;
                        this.field2881[1][2] = 4096;
                        this.field2881[2][0] = 1363;
                        this.field2881[2][1] = 0;
                        this.field2881[2][2] = 4096;
                        this.field2881[2][3] = 0;
                        this.field2881[3][0] = 2048;
                        this.field2881[3][3] = 0;
                        this.field2881[3][2] = 4096;
                        this.field2881[3][1] = 4096;
                        this.field2881[4][3] = 0;
                        this.field2881[4][2] = 0;
                        this.field2881[4][1] = 4096;
                        this.field2881[4][0] = 2727;
                        this.field2881[5][2] = 0;
                        this.field2881[5][1] = 4096;
                        this.field2881[5][0] = 3411;
                        this.field2881[5][3] = 4096;
                        this.field2881[6][3] = 4096;
                        this.field2881[6][1] = 0;
                        this.field2881[6][0] = 4096;
                        this.field2881[6][2] = 0;
                    }
                } else {
                    this.field2881 = new int[8][4];
                    this.field2881[0][2] = 2602;
                    this.field2881[0][1] = 2650;
                    this.field2881[0][3] = 2361;
                    this.field2881[0][0] = 0;
                    this.field2881[1][0] = 2867;
                    this.field2881[1][2] = 1799;
                    this.field2881[1][3] = 1558;
                    this.field2881[1][1] = 2313;
                    this.field2881[2][3] = 1413;
                    this.field2881[2][2] = 1734;
                    this.field2881[2][0] = 3072;
                    this.field2881[2][1] = 2618;
                    this.field2881[3][0] = 3276;
                    this.field2881[3][2] = 1220;
                    this.field2881[3][3] = 947;
                    this.field2881[3][1] = 2296;
                    this.field2881[4][3] = 722;
                    this.field2881[4][0] = 3481;
                    this.field2881[4][2] = 963;
                    this.field2881[4][1] = 2072;
                    this.field2881[5][0] = 3686;
                    this.field2881[5][3] = 1766;
                    this.field2881[5][2] = 2152;
                    this.field2881[5][1] = 2730;
                    this.field2881[6][1] = 2232;
                    this.field2881[6][3] = 915;
                    this.field2881[6][2] = 1060;
                    this.field2881[6][0] = 3891;
                    this.field2881[7][3] = 1140;
                    this.field2881[7][2] = 1413;
                    this.field2881[7][0] = 4096;
                    this.field2881[7][1] = 1686;
                }
            } else {
                this.field2881 = new int[2][4];
                this.field2881[0][0] = 0;
                this.field2881[0][2] = 0;
                this.field2881[0][1] = 0;
                this.field2881[0][3] = 0;
                this.field2881[1][3] = 4096;
                this.field2881[1][0] = 4096;
                this.field2881[1][1] = 4096;
                this.field2881[1][2] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V")
    public class204() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IB)Z")
    public static final boolean method1356(int arg0, byte arg1) {
        ++field2884;
        if (arg1 != -110) {
            field2887 = -94;
        }
        return ~arg0 == -8 || arg0 == 8 || arg0 == 9;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 != 5) {
            field2887 = 127;
        }
        ++field2888;
        if (~arg2 == -1) {
            int var4 = arg1.method3826(false);
            if (~var4 != -1) {
                this.method1355(arg0 ^ -27217, var4);
            } else {
                this.field2881 = new int[arg1.method3826(false)][4];
                for (int var5 = 0; this.field2881.length > var5; ++var5) {
                    this.field2881[var5][0] = arg1.method3847((byte) 118);
                    this.field2881[var5][1] = arg1.method3826(false) << 4;
                    this.field2881[var5][2] = arg1.method3826(false) << 4;
                    this.field2881[var5][3] = arg1.method3826(false) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILwe;)V")
    public static final void method1357(int arg0, class371 arg1) {
        ++field2878;
        if (arg0 != -4415) {
            field2887 = 81;
        }
        class81.field1364 = arg1;
    }

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "(I)V")
    private final void method1358(int arg0) {
        ++field2883;
        if (arg0 != 26317) {
            method1357(50, (class371) null);
        }
        int var2 = this.field2881.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && this.field2881[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var4 < var2) {
                    int[] var7 = this.field2881[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field2881[var4 - 1];
                        int var9 = (var5 - var8[0] << 12) / (var7[0] + -var8[0]);
                        int var10 = 4096 - var9;
                        var11 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var12 = var7[2] * var9 - -(var8[2] * var10) >> 12;
                        var13 = var7[1] * var9 + var8[1] * var10 >> 12;
                    } else {
                        var12 = var7[2];
                        var11 = var7[3];
                        var13 = var7[1];
                    }
                } else {
                    int[] var14 = this.field2881[var2 + -1];
                    var12 = var14[2];
                    var11 = var14[3];
                    var13 = var14[1];
                }
                int var15 = var13 >> 4;
                int var16 = var12 >> 4;
                int var17 = var11 >> 4;
                if (var16 >= 0) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                this.field2879[var3] = class486.method2826(class486.method2826(var15 << 16, var16 << 8), var17);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)[[I")
    public final int[][] method763(int arg0, int arg1) {
        ++field2877;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (arg0 != -5766) {
            method1356(58, (byte) -19);
        }
        if (super.field6417.field9606) {
            int[] var4 = this.method2611(arg0 + 5878, arg1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class549.field7715 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field2879[var9];
                var5[var8] = class689.method3797(var10, 16711680) >> 12;
                var6[var8] = class689.method3797(var10 >> 4, 4080);
                var7[var8] = class689.method3797(4080, var10 << 4);
            }
        }
        return var3;
    }
}
