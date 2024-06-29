import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class207 extends class220 {

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "[I")
    private int[] field2981 = new int[257];

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "[I")
    public static int[] field2978 = new int[2];

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field2982 = 0;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "Lqj;")
    public static class238 field2986;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "[[I")
    private int[][] field2985;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(II)V", line = 5)
    private final void method1303(int arg0, int arg1) {
        ++field2983;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2985 = new int[4][4];
                                this.field2985[0][2] = 4096;
                                this.field2985[0][1] = 0;
                                this.field2985[0][3] = 0;
                                this.field2985[0][0] = 2048;
                                this.field2985[1][0] = 2867;
                                this.field2985[1][2] = 4096;
                                this.field2985[1][3] = 0;
                                this.field2985[1][1] = 4096;
                                this.field2985[2][0] = 3276;
                                this.field2985[2][1] = 4096;
                                this.field2985[2][2] = 4096;
                                this.field2985[2][3] = 0;
                                this.field2985[3][2] = 0;
                                this.field2985[3][1] = 4096;
                                this.field2985[3][0] = 4096;
                                this.field2985[3][3] = 0;
                            } else {
                                this.field2985 = new int[16][4];
                                this.field2985[0][2] = 192;
                                this.field2985[0][1] = 80;
                                this.field2985[0][3] = 321;
                                this.field2985[0][0] = 0;
                                this.field2985[1][2] = 449;
                                this.field2985[1][1] = 321;
                                this.field2985[1][3] = 562;
                                this.field2985[1][0] = 155;
                                this.field2985[2][2] = 690;
                                this.field2985[2][1] = 578;
                                this.field2985[2][0] = 389;
                                this.field2985[2][3] = 803;
                                this.field2985[3][2] = 995;
                                this.field2985[3][1] = 947;
                                this.field2985[3][3] = 1140;
                                this.field2985[3][0] = 671;
                                this.field2985[4][0] = 897;
                                this.field2985[4][2] = 1397;
                                this.field2985[4][1] = 1285;
                                this.field2985[4][3] = 1509;
                                this.field2985[5][2] = 1429;
                                this.field2985[5][1] = 1525;
                                this.field2985[5][3] = 1413;
                                this.field2985[5][0] = 1175;
                                this.field2985[6][2] = 1461;
                                this.field2985[6][0] = 1368;
                                this.field2985[6][3] = 1333;
                                this.field2985[6][1] = 1734;
                                this.field2985[7][3] = 1702;
                                this.field2985[7][0] = 1507;
                                this.field2985[7][1] = 1413;
                                this.field2985[7][2] = 1525;
                                this.field2985[8][3] = 2056;
                                this.field2985[8][0] = 1736;
                                this.field2985[8][1] = 1108;
                                this.field2985[8][2] = 1590;
                                this.field2985[9][3] = 2666;
                                this.field2985[9][1] = 1766;
                                this.field2985[9][0] = 2088;
                                this.field2985[9][2] = 2056;
                                this.field2985[10][2] = 2586;
                                this.field2985[10][1] = 2409;
                                this.field2985[10][3] = 3276;
                                this.field2985[10][0] = 2355;
                                this.field2985[11][3] = 3228;
                                this.field2985[11][1] = 3116;
                                this.field2985[11][2] = 3148;
                                this.field2985[11][0] = 2691;
                                this.field2985[12][2] = 3710;
                                this.field2985[12][3] = 3196;
                                this.field2985[12][1] = 3806;
                                this.field2985[12][0] = 3031;
                                this.field2985[13][3] = 3019;
                                this.field2985[13][2] = 3421;
                                this.field2985[13][0] = 3522;
                                this.field2985[13][1] = 3437;
                                this.field2985[14][3] = 3228;
                                this.field2985[14][1] = 3116;
                                this.field2985[14][0] = 3727;
                                this.field2985[14][2] = 3148;
                                this.field2985[15][1] = 2377;
                                this.field2985[15][2] = 2505;
                                this.field2985[15][0] = 4096;
                                this.field2985[15][3] = 2746;
                            }
                        } else {
                            this.field2985 = new int[6][4];
                            this.field2985[0][0] = 0;
                            this.field2985[0][2] = 0;
                            this.field2985[0][1] = 0;
                            this.field2985[0][3] = 0;
                            this.field2985[1][2] = 0;
                            this.field2985[1][3] = 1493;
                            this.field2985[1][0] = 1843;
                            this.field2985[1][1] = 0;
                            this.field2985[2][3] = 2939;
                            this.field2985[2][0] = 2457;
                            this.field2985[2][1] = 0;
                            this.field2985[2][2] = 0;
                            this.field2985[3][3] = 3565;
                            this.field2985[3][2] = 1124;
                            this.field2985[3][0] = 2781;
                            this.field2985[3][1] = 0;
                            this.field2985[4][2] = 3084;
                            this.field2985[4][3] = 4031;
                            this.field2985[4][0] = 3481;
                            this.field2985[4][1] = 546;
                            this.field2985[5][2] = 4096;
                            this.field2985[5][3] = 4096;
                            this.field2985[5][0] = 4096;
                            this.field2985[5][1] = 4096;
                        }
                    } else {
                        this.field2985 = new int[7][4];
                        this.field2985[0][2] = 0;
                        this.field2985[0][3] = 4096;
                        this.field2985[0][1] = 0;
                        this.field2985[0][0] = 0;
                        this.field2985[1][2] = 4096;
                        this.field2985[1][1] = 0;
                        this.field2985[1][3] = 4096;
                        this.field2985[1][0] = 663;
                        this.field2985[2][0] = 1363;
                        this.field2985[2][3] = 0;
                        this.field2985[2][1] = 0;
                        this.field2985[2][2] = 4096;
                        this.field2985[3][2] = 4096;
                        this.field2985[3][1] = 4096;
                        this.field2985[3][3] = 0;
                        this.field2985[3][0] = 2048;
                        this.field2985[4][0] = 2727;
                        this.field2985[4][1] = 4096;
                        this.field2985[4][3] = 0;
                        this.field2985[4][2] = 0;
                        this.field2985[5][3] = 4096;
                        this.field2985[5][2] = 0;
                        this.field2985[5][0] = 3411;
                        this.field2985[5][1] = 4096;
                        this.field2985[6][0] = 4096;
                        this.field2985[6][3] = 4096;
                        this.field2985[6][2] = 0;
                        this.field2985[6][1] = 0;
                    }
                } else {
                    this.field2985 = new int[8][4];
                    this.field2985[0][2] = 2602;
                    this.field2985[0][1] = 2650;
                    this.field2985[0][0] = 0;
                    this.field2985[0][3] = 2361;
                    this.field2985[1][1] = 2313;
                    this.field2985[1][3] = 1558;
                    this.field2985[1][0] = 2867;
                    this.field2985[1][2] = 1799;
                    this.field2985[2][0] = 3072;
                    this.field2985[2][1] = 2618;
                    this.field2985[2][3] = 1413;
                    this.field2985[2][2] = 1734;
                    this.field2985[3][1] = 2296;
                    this.field2985[3][2] = 1220;
                    this.field2985[3][3] = 947;
                    this.field2985[3][0] = 3276;
                    this.field2985[4][3] = 722;
                    this.field2985[4][2] = 963;
                    this.field2985[4][0] = 3481;
                    this.field2985[4][1] = 2072;
                    this.field2985[5][0] = 3686;
                    this.field2985[5][1] = 2730;
                    this.field2985[5][3] = 1766;
                    this.field2985[5][2] = 2152;
                    this.field2985[6][3] = 915;
                    this.field2985[6][1] = 2232;
                    this.field2985[6][2] = 1060;
                    this.field2985[6][0] = 3891;
                    this.field2985[7][1] = 1686;
                    this.field2985[7][2] = 1413;
                    this.field2985[7][3] = 1140;
                    this.field2985[7][0] = 4096;
                }
            } else {
                this.field2985 = new int[2][4];
                this.field2985[0][2] = 0;
                this.field2985[0][1] = 0;
                this.field2985[0][3] = 0;
                this.field2985[0][0] = 0;
                this.field2985[1][1] = 4096;
                this.field2985[1][0] = 4096;
                this.field2985[1][3] = 4096;
                this.field2985[1][2] = 4096;
            }
        }
        if (arg0 != -22599) {
            this.field2981 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(CI)C", line = 259)
    public static final char method1304(char arg0, int arg1) {
        ++field2980;
        if (~arg0 == -199) {
            return 'E';
        } else {
            int var2 = -33 % ((29 - arg1) / 57);
            if (~arg0 == -231) {
                return 'e';
            } else if (arg0 == 223) {
                return 's';
            } else if (arg0 == 338) {
                return 'E';
            } else {
                return (char) (arg0 == 339 ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V", line = 287)
    public static void method1305(int arg0) {
        if (arg0 >= -73) {
            method1304('?', -97);
        }
        field2978 = null;
        field2986 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)[[I", line = 298)
    public final int[][] method1(int arg0, int arg1) {
        ++field2984;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (arg1 != 0) {
            this.method1306((byte) 48);
        }
        if (super.field3135.field4087) {
            int[] var4 = this.method1366(0, (byte) -40, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class344.field5043; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2981[var9];
                var5[var8] = class401.method2606(var10, 16711680) >> 12;
                var6[var8] = class401.method2606(var10, 65280) >> 4;
                var7[var8] = class401.method2606(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 350)
    public class207() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBLil;)V", line = 355)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 != -49) {
            this.field2985 = null;
        }
        if (~arg0 == -1) {
            int var4 = arg2.method1697(arg1 ^ -95);
            if (var4 != 0) {
                this.method1303(-22599, var4);
            } else {
                this.field2985 = new int[arg2.method1697(-125)][4];
                for (int var5 = 0; ~var5 > ~this.field2985.length; ++var5) {
                    this.field2985[var5][0] = arg2.method1685(8104);
                    this.field2985[var5][1] = arg2.method1697(-11) << 4;
                    this.field2985[var5][2] = arg2.method1697(-125) << 4;
                    this.field2985[var5][3] = arg2.method1697(-93) << 4;
                }
            }
        }
        ++field2977;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 393)
    public final void method440(int arg0) {
        if (arg0 == 0) {
            ++field2979;
            if (this.field2985 == null) {
                this.method1303(arg0 ^ -22599, 1);
            }
            this.method1306((byte) -122);
        }
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(B)V", line = 430)
    private final void method1306(byte arg0) {
        ++field2976;
        if (arg0 > -121) {
            field2982 = -125;
        }
        int var2 = this.field2985.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && this.field2985[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field2985[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field2985[var4];
                    if (var4 <= 0) {
                        var10 = var11[3];
                        var8 = var11[1];
                        var9 = var11[2];
                    } else {
                        int[] var12 = this.field2985[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                int var17 = var10 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field2981[var3] = class128.method871(class128.method871(var16 << 8, var15 << 16), var17);
            }
        }
    }
}
