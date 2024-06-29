import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class513 extends class38 {

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "[I")
    private int[] field7291 = new int[257];

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!jq", name = "I", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!jq", name = "J", descriptor = "[[I")
    private int[][] field7293;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 3)
    private final void method3032(int arg0) {
        ++field7294;
        int var2 = this.field7293.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && var5 >= this.field7293[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field7293[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[3];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field7293[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field7293[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var10 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    } else {
                        var8 = var11[2];
                        var10 = var11[1];
                        var9 = var11[3];
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var8 >> 4;
                int var17 = var9 >> 4;
                if (~var17 <= -1) {
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
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field7291[var3] = class625.method3600(class625.method3600(var15 << 16, var16 << 8), var17);
            }
        }
        int var18 = -87 / ((17 - arg0) / 39);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)I", line = 109)
    public static int method3033(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 119)
    public final void method191(byte arg0) {
        if (this.field7293 == null) {
            this.method3034(1, (byte) 121);
        }
        ++field7292;
        if (arg0 >= 120) {
            this.method3032(88);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V", line = 134)
    private final void method3034(int arg0, byte arg1) {
        ++field7290;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field7293 = new int[4][4];
                                this.field7293[0][2] = 4096;
                                this.field7293[0][0] = 2048;
                                this.field7293[0][1] = 0;
                                this.field7293[0][3] = 0;
                                this.field7293[1][0] = 2867;
                                this.field7293[1][2] = 4096;
                                this.field7293[1][1] = 4096;
                                this.field7293[1][3] = 0;
                                this.field7293[2][2] = 4096;
                                this.field7293[2][0] = 3276;
                                this.field7293[2][3] = 0;
                                this.field7293[2][1] = 4096;
                                this.field7293[3][3] = 0;
                                this.field7293[3][1] = 4096;
                                this.field7293[3][2] = 0;
                                this.field7293[3][0] = 4096;
                            } else {
                                this.field7293 = new int[16][4];
                                this.field7293[0][3] = 321;
                                this.field7293[0][2] = 192;
                                this.field7293[0][1] = 80;
                                this.field7293[0][0] = 0;
                                this.field7293[1][3] = 562;
                                this.field7293[1][2] = 449;
                                this.field7293[1][1] = 321;
                                this.field7293[1][0] = 155;
                                this.field7293[2][0] = 389;
                                this.field7293[2][1] = 578;
                                this.field7293[2][3] = 803;
                                this.field7293[2][2] = 690;
                                this.field7293[3][3] = 1140;
                                this.field7293[3][2] = 995;
                                this.field7293[3][0] = 671;
                                this.field7293[3][1] = 947;
                                this.field7293[4][3] = 1509;
                                this.field7293[4][0] = 897;
                                this.field7293[4][1] = 1285;
                                this.field7293[4][2] = 1397;
                                this.field7293[5][0] = 1175;
                                this.field7293[5][1] = 1525;
                                this.field7293[5][2] = 1429;
                                this.field7293[5][3] = 1413;
                                this.field7293[6][2] = 1461;
                                this.field7293[6][1] = 1734;
                                this.field7293[6][3] = 1333;
                                this.field7293[6][0] = 1368;
                                this.field7293[7][2] = 1525;
                                this.field7293[7][3] = 1702;
                                this.field7293[7][1] = 1413;
                                this.field7293[7][0] = 1507;
                                this.field7293[8][0] = 1736;
                                this.field7293[8][2] = 1590;
                                this.field7293[8][3] = 2056;
                                this.field7293[8][1] = 1108;
                                this.field7293[9][0] = 2088;
                                this.field7293[9][1] = 1766;
                                this.field7293[9][3] = 2666;
                                this.field7293[9][2] = 2056;
                                this.field7293[10][2] = 2586;
                                this.field7293[10][1] = 2409;
                                this.field7293[10][3] = 3276;
                                this.field7293[10][0] = 2355;
                                this.field7293[11][3] = 3228;
                                this.field7293[11][2] = 3148;
                                this.field7293[11][1] = 3116;
                                this.field7293[11][0] = 2691;
                                this.field7293[12][1] = 3806;
                                this.field7293[12][0] = 3031;
                                this.field7293[12][3] = 3196;
                                this.field7293[12][2] = 3710;
                                this.field7293[13][0] = 3522;
                                this.field7293[13][1] = 3437;
                                this.field7293[13][3] = 3019;
                                this.field7293[13][2] = 3421;
                                this.field7293[14][2] = 3148;
                                this.field7293[14][1] = 3116;
                                this.field7293[14][3] = 3228;
                                this.field7293[14][0] = 3727;
                                this.field7293[15][3] = 2746;
                                this.field7293[15][1] = 2377;
                                this.field7293[15][0] = 4096;
                                this.field7293[15][2] = 2505;
                            }
                        } else {
                            this.field7293 = new int[6][4];
                            this.field7293[0][3] = 0;
                            this.field7293[0][2] = 0;
                            this.field7293[0][0] = 0;
                            this.field7293[0][1] = 0;
                            this.field7293[1][3] = 1493;
                            this.field7293[1][1] = 0;
                            this.field7293[1][2] = 0;
                            this.field7293[1][0] = 1843;
                            this.field7293[2][2] = 0;
                            this.field7293[2][1] = 0;
                            this.field7293[2][0] = 2457;
                            this.field7293[2][3] = 2939;
                            this.field7293[3][2] = 1124;
                            this.field7293[3][1] = 0;
                            this.field7293[3][0] = 2781;
                            this.field7293[3][3] = 3565;
                            this.field7293[4][3] = 4031;
                            this.field7293[4][0] = 3481;
                            this.field7293[4][2] = 3084;
                            this.field7293[4][1] = 546;
                            this.field7293[5][3] = 4096;
                            this.field7293[5][2] = 4096;
                            this.field7293[5][1] = 4096;
                            this.field7293[5][0] = 4096;
                        }
                    } else {
                        this.field7293 = new int[7][4];
                        this.field7293[0][2] = 0;
                        this.field7293[0][1] = 0;
                        this.field7293[0][3] = 4096;
                        this.field7293[0][0] = 0;
                        this.field7293[1][0] = 663;
                        this.field7293[1][2] = 4096;
                        this.field7293[1][1] = 0;
                        this.field7293[1][3] = 4096;
                        this.field7293[2][2] = 4096;
                        this.field7293[2][0] = 1363;
                        this.field7293[2][1] = 0;
                        this.field7293[2][3] = 0;
                        this.field7293[3][2] = 4096;
                        this.field7293[3][0] = 2048;
                        this.field7293[3][1] = 4096;
                        this.field7293[3][3] = 0;
                        this.field7293[4][0] = 2727;
                        this.field7293[4][2] = 0;
                        this.field7293[4][1] = 4096;
                        this.field7293[4][3] = 0;
                        this.field7293[5][3] = 4096;
                        this.field7293[5][1] = 4096;
                        this.field7293[5][0] = 3411;
                        this.field7293[5][2] = 0;
                        this.field7293[6][2] = 0;
                        this.field7293[6][3] = 4096;
                        this.field7293[6][0] = 4096;
                        this.field7293[6][1] = 0;
                    }
                } else {
                    this.field7293 = new int[8][4];
                    this.field7293[0][3] = 2361;
                    this.field7293[0][1] = 2650;
                    this.field7293[0][2] = 2602;
                    this.field7293[0][0] = 0;
                    this.field7293[1][3] = 1558;
                    this.field7293[1][2] = 1799;
                    this.field7293[1][1] = 2313;
                    this.field7293[1][0] = 2867;
                    this.field7293[2][0] = 3072;
                    this.field7293[2][2] = 1734;
                    this.field7293[2][3] = 1413;
                    this.field7293[2][1] = 2618;
                    this.field7293[3][3] = 947;
                    this.field7293[3][2] = 1220;
                    this.field7293[3][1] = 2296;
                    this.field7293[3][0] = 3276;
                    this.field7293[4][2] = 963;
                    this.field7293[4][0] = 3481;
                    this.field7293[4][3] = 722;
                    this.field7293[4][1] = 2072;
                    this.field7293[5][1] = 2730;
                    this.field7293[5][3] = 1766;
                    this.field7293[5][0] = 3686;
                    this.field7293[5][2] = 2152;
                    this.field7293[6][3] = 915;
                    this.field7293[6][0] = 3891;
                    this.field7293[6][1] = 2232;
                    this.field7293[6][2] = 1060;
                    this.field7293[7][2] = 1413;
                    this.field7293[7][1] = 1686;
                    this.field7293[7][3] = 1140;
                    this.field7293[7][0] = 4096;
                }
            } else {
                this.field7293 = new int[2][4];
                this.field7293[0][0] = 0;
                this.field7293[0][3] = 0;
                this.field7293[0][2] = 0;
                this.field7293[0][1] = 0;
                this.field7293[1][3] = 4096;
                this.field7293[1][2] = 4096;
                this.field7293[1][0] = 4096;
                this.field7293[1][1] = 4096;
            }
        }
        if (arg1 <= 116) {
            this.field7293 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V", line = 385)
    public class513() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)[[I", line = 393)
    public final int[][] method196(int arg0, int arg1) {
        ++field7288;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (arg0 != -18210) {
            this.field7293 = null;
        }
        if (super.field387.field6792) {
            int[] var4 = this.method189(arg1, 0, (byte) -92);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class729.field10216; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field7291[var9];
                var5[var8] = class493.method2943(16711680, var10) >> 12;
                var6[var8] = class493.method2943(var10, 65280) >> 4;
                var7[var8] = class493.method2943(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lkd;[III)V", line = 449)
    public static final void method3035(class282 arg0, int[] arg1, int arg2, int arg3) {
        if (arg0.field6039 != null) {
            boolean var4 = true;
            for (int var5 = 0; arg0.field6039.length > var5; ++var5) {
                if (~arg0.field6039[var5] != ~arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field6094 != -1) {
                class288 var6 = class742.field10404.method2663(arg3, arg0.field6094);
                int var7 = var6.field4094;
                if (var7 == 1) {
                    arg0.field6091 = 1;
                    arg0.field6117 = 0;
                    arg0.field6038 = 0;
                    arg0.field6040 = 0;
                    arg0.field6056 = arg2;
                    if (!arg0.field6095) {
                        class294.method1865(arg0.field6040, arg0, var6, -58);
                    }
                }
                if (~var7 == -3) {
                    arg0.field6117 = 0;
                }
            }
        }
        ++field7289;
        boolean var8 = true;
        for (int var9 = arg3; var9 < arg1.length; ++var9) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg0.field6039 == null || ~arg0.field6039[var9] == 0 || ~class742.field10404.method2663(arg3, arg1[var9]).field4098 <= ~class742.field10404.method2663(0, arg0.field6039[var9]).field4098) {
                arg0.field6056 = arg2;
                arg0.field6134 = arg0.field6130;
                arg0.field6039 = arg1;
            }
        }
        if (var8) {
            arg0.field6039 = arg1;
            arg0.field6134 = arg0.field6130;
            arg0.field6056 = arg2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILrg;)V", line = 536)
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field7287;
        if (arg0 <= 34) {
            this.field7293 = null;
        }
        if (arg1 == 0) {
            int var4 = arg2.method3745(-6314);
            if (~var4 != -1) {
                this.method3034(var4, (byte) 122);
            } else {
                this.field7293 = new int[arg2.method3745(-6314)][4];
                for (int var5 = 0; var5 < this.field7293.length; ++var5) {
                    this.field7293[var5][0] = arg2.method3712((byte) 31);
                    this.field7293[var5][1] = arg2.method3745(-6314) << 4;
                    this.field7293[var5][2] = arg2.method3745(-6314) << 4;
                    this.field7293[var5][3] = arg2.method3745(-6314) << 4;
                }
            }
        }
    }
}
