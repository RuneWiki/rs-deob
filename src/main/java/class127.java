import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class127 extends class56 {

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "[I")
    private int[] field1529 = new int[257];

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "[[I")
    private int[][] field1530;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 3)
    public final void method364(int arg0) {
        ++field1527;
        if (this.field1530 == null) {
            this.method857(77, 1);
        }
        if (arg0 != 7) {
            this.field1530 = null;
        }
        this.method855((byte) -39);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Ljb;", line = 19)
    public static final class493 method854(byte arg0, int arg1) {
        ++field1528;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 65535;
        if (class37.field475[var2] == null || class37.field475[var2][var3] == null) {
            boolean var4 = class393.method2476(119, var2);
            if (!var4) {
                return null;
            }
        }
        return arg0 > -77 ? null : class37.field475[var2][var3];
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILee;I)V", line = 48)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 == 3731) {
            ++field1531;
            if (~arg2 == -1) {
                int var4 = arg1.method3750((byte) 35);
                if (~var4 != -1) {
                    this.method857(-128, var4);
                } else {
                    this.field1530 = new int[arg1.method3750((byte) 35)][4];
                    for (int var5 = 0; ~this.field1530.length < ~var5; ++var5) {
                        this.field1530[var5][0] = arg1.method3757((byte) -65);
                        this.field1530[var5][1] = arg1.method3750((byte) 35) << 4;
                        this.field1530[var5][2] = arg1.method3750((byte) 35) << 4;
                        this.field1530[var5][3] = arg1.method3750((byte) 35) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V", line = 85)
    private final void method855(byte arg0) {
        ++field1534;
        int var2 = -119 % ((15 - arg0) / 50);
        int var3 = this.field1530.length;
        if (~var3 < -1) {
            for (int var4 = 0; var4 < 257; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; ~var7 > ~var3 && ~var6 <= ~this.field1530[var7][0]; ++var7) {
                    ++var5;
                }
                int var12;
                int var13;
                int var14;
                if (var3 > var5) {
                    int[] var8 = this.field1530[var5];
                    if (var5 > 0) {
                        int[] var9 = this.field1530[var5 + -1];
                        int var10 = (-var9[0] + var6 << 12) / (var8[0] + -var9[0]);
                        int var11 = -var10 + 4096;
                        var12 = var8[2] * var10 + var9[2] * var11 >> 12;
                        var13 = var8[3] * var10 - -(var9[3] * var11) >> 12;
                        var14 = var8[1] * var10 + var9[1] * var11 >> 12;
                    } else {
                        var13 = var8[3];
                        var14 = var8[1];
                        var12 = var8[2];
                    }
                } else {
                    int[] var15 = this.field1530[var3 + -1];
                    var12 = var15[2];
                    var14 = var15[1];
                    var13 = var15[3];
                }
                int var16 = var12 >> 4;
                int var17 = var13 >> 4;
                int var18 = var14 >> 4;
                if (~var18 > -1) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field1529[var4] = class325.method2116(class325.method2116(var16 << 8, var18 << 16), var17);
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 194)
    public class127() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BZII)I", line = 198)
    public static final int method856(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 != 24) {
            return 120;
        } else {
            ++field1526;
            class95 var4 = class71.method589(arg1, arg0 ^ -9830, arg2);
            if (var4 == null) {
                return -1;
            } else {
                return arg3 >= 0 && ~arg3 > ~var4.field1107.length ? var4.field1107[arg3] : -1;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)[[I", line = 220)
    public final int[][] method5(int arg0, int arg1) {
        ++field1532;
        if (arg1 != 1) {
            this.field1529 = null;
        }
        int[][] var3 = super.field668.method3009(0, arg0);
        if (super.field668.field7292) {
            int[] var4 = this.method367(4463, 0, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class328.field4576; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1529[var9];
                var5[var8] = class286.method1877(var10, 16711680) >> 12;
                var6[var8] = class286.method1877(65280, var10) >> 4;
                var7[var8] = class286.method1877(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V", line = 272)
    private final void method857(int arg0, int arg1) {
        ++field1533;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1530 = new int[4][4];
                                this.field1530[0][0] = 2048;
                                this.field1530[0][2] = 4096;
                                this.field1530[0][3] = 0;
                                this.field1530[0][1] = 0;
                                this.field1530[1][0] = 2867;
                                this.field1530[1][2] = 4096;
                                this.field1530[1][3] = 0;
                                this.field1530[1][1] = 4096;
                                this.field1530[2][0] = 3276;
                                this.field1530[2][3] = 0;
                                this.field1530[2][1] = 4096;
                                this.field1530[2][2] = 4096;
                                this.field1530[3][3] = 0;
                                this.field1530[3][1] = 4096;
                                this.field1530[3][2] = 0;
                                this.field1530[3][0] = 4096;
                            } else {
                                this.field1530 = new int[16][4];
                                this.field1530[0][0] = 0;
                                this.field1530[0][1] = 80;
                                this.field1530[0][2] = 192;
                                this.field1530[0][3] = 321;
                                this.field1530[1][0] = 155;
                                this.field1530[1][2] = 449;
                                this.field1530[1][1] = 321;
                                this.field1530[1][3] = 562;
                                this.field1530[2][1] = 578;
                                this.field1530[2][0] = 389;
                                this.field1530[2][2] = 690;
                                this.field1530[2][3] = 803;
                                this.field1530[3][2] = 995;
                                this.field1530[3][0] = 671;
                                this.field1530[3][3] = 1140;
                                this.field1530[3][1] = 947;
                                this.field1530[4][2] = 1397;
                                this.field1530[4][3] = 1509;
                                this.field1530[4][0] = 897;
                                this.field1530[4][1] = 1285;
                                this.field1530[5][1] = 1525;
                                this.field1530[5][2] = 1429;
                                this.field1530[5][3] = 1413;
                                this.field1530[5][0] = 1175;
                                this.field1530[6][3] = 1333;
                                this.field1530[6][2] = 1461;
                                this.field1530[6][0] = 1368;
                                this.field1530[6][1] = 1734;
                                this.field1530[7][0] = 1507;
                                this.field1530[7][1] = 1413;
                                this.field1530[7][3] = 1702;
                                this.field1530[7][2] = 1525;
                                this.field1530[8][3] = 2056;
                                this.field1530[8][2] = 1590;
                                this.field1530[8][0] = 1736;
                                this.field1530[8][1] = 1108;
                                this.field1530[9][3] = 2666;
                                this.field1530[9][0] = 2088;
                                this.field1530[9][1] = 1766;
                                this.field1530[9][2] = 2056;
                                this.field1530[10][3] = 3276;
                                this.field1530[10][0] = 2355;
                                this.field1530[10][2] = 2586;
                                this.field1530[10][1] = 2409;
                                this.field1530[11][2] = 3148;
                                this.field1530[11][1] = 3116;
                                this.field1530[11][3] = 3228;
                                this.field1530[11][0] = 2691;
                                this.field1530[12][1] = 3806;
                                this.field1530[12][3] = 3196;
                                this.field1530[12][0] = 3031;
                                this.field1530[12][2] = 3710;
                                this.field1530[13][0] = 3522;
                                this.field1530[13][1] = 3437;
                                this.field1530[13][3] = 3019;
                                this.field1530[13][2] = 3421;
                                this.field1530[14][1] = 3116;
                                this.field1530[14][2] = 3148;
                                this.field1530[14][3] = 3228;
                                this.field1530[14][0] = 3727;
                                this.field1530[15][0] = 4096;
                                this.field1530[15][2] = 2505;
                                this.field1530[15][1] = 2377;
                                this.field1530[15][3] = 2746;
                            }
                        } else {
                            this.field1530 = new int[6][4];
                            this.field1530[0][2] = 0;
                            this.field1530[0][0] = 0;
                            this.field1530[0][3] = 0;
                            this.field1530[0][1] = 0;
                            this.field1530[1][0] = 1843;
                            this.field1530[1][2] = 0;
                            this.field1530[1][3] = 1493;
                            this.field1530[1][1] = 0;
                            this.field1530[2][3] = 2939;
                            this.field1530[2][1] = 0;
                            this.field1530[2][0] = 2457;
                            this.field1530[2][2] = 0;
                            this.field1530[3][1] = 0;
                            this.field1530[3][0] = 2781;
                            this.field1530[3][3] = 3565;
                            this.field1530[3][2] = 1124;
                            this.field1530[4][0] = 3481;
                            this.field1530[4][1] = 546;
                            this.field1530[4][2] = 3084;
                            this.field1530[4][3] = 4031;
                            this.field1530[5][3] = 4096;
                            this.field1530[5][1] = 4096;
                            this.field1530[5][0] = 4096;
                            this.field1530[5][2] = 4096;
                        }
                    } else {
                        this.field1530 = new int[7][4];
                        this.field1530[0][0] = 0;
                        this.field1530[0][1] = 0;
                        this.field1530[0][2] = 0;
                        this.field1530[0][3] = 4096;
                        this.field1530[1][0] = 663;
                        this.field1530[1][1] = 0;
                        this.field1530[1][3] = 4096;
                        this.field1530[1][2] = 4096;
                        this.field1530[2][1] = 0;
                        this.field1530[2][2] = 4096;
                        this.field1530[2][3] = 0;
                        this.field1530[2][0] = 1363;
                        this.field1530[3][0] = 2048;
                        this.field1530[3][3] = 0;
                        this.field1530[3][1] = 4096;
                        this.field1530[3][2] = 4096;
                        this.field1530[4][3] = 0;
                        this.field1530[4][2] = 0;
                        this.field1530[4][0] = 2727;
                        this.field1530[4][1] = 4096;
                        this.field1530[5][3] = 4096;
                        this.field1530[5][0] = 3411;
                        this.field1530[5][1] = 4096;
                        this.field1530[5][2] = 0;
                        this.field1530[6][2] = 0;
                        this.field1530[6][1] = 0;
                        this.field1530[6][0] = 4096;
                        this.field1530[6][3] = 4096;
                    }
                } else {
                    this.field1530 = new int[8][4];
                    this.field1530[0][2] = 2602;
                    this.field1530[0][0] = 0;
                    this.field1530[0][1] = 2650;
                    this.field1530[0][3] = 2361;
                    this.field1530[1][1] = 2313;
                    this.field1530[1][2] = 1799;
                    this.field1530[1][0] = 2867;
                    this.field1530[1][3] = 1558;
                    this.field1530[2][2] = 1734;
                    this.field1530[2][1] = 2618;
                    this.field1530[2][0] = 3072;
                    this.field1530[2][3] = 1413;
                    this.field1530[3][2] = 1220;
                    this.field1530[3][0] = 3276;
                    this.field1530[3][3] = 947;
                    this.field1530[3][1] = 2296;
                    this.field1530[4][3] = 722;
                    this.field1530[4][0] = 3481;
                    this.field1530[4][2] = 963;
                    this.field1530[4][1] = 2072;
                    this.field1530[5][3] = 1766;
                    this.field1530[5][1] = 2730;
                    this.field1530[5][2] = 2152;
                    this.field1530[5][0] = 3686;
                    this.field1530[6][0] = 3891;
                    this.field1530[6][1] = 2232;
                    this.field1530[6][3] = 915;
                    this.field1530[6][2] = 1060;
                    this.field1530[7][0] = 4096;
                    this.field1530[7][1] = 1686;
                    this.field1530[7][3] = 1140;
                    this.field1530[7][2] = 1413;
                }
            } else {
                this.field1530 = new int[2][4];
                this.field1530[0][2] = 0;
                this.field1530[0][1] = 0;
                this.field1530[0][0] = 0;
                this.field1530[0][3] = 0;
                this.field1530[1][3] = 4096;
                this.field1530[1][2] = 4096;
                this.field1530[1][0] = 4096;
                this.field1530[1][1] = 4096;
            }
        }
        int var4 = 4 % ((arg0 - -64) / 54);
    }
}
