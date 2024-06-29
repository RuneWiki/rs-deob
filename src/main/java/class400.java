import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class400 extends class243 {

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "[I")
    private int[] field5660 = new int[257];

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "[[I")
    private int[][] field5661;

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 3)
    public class400() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[[I", line = 11)
    public final int[][] method2(int arg0, int arg1) {
        ++field5667;
        if (arg0 > -76) {
            this.field5661 = null;
        }
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int[] var4 = this.method1462(arg1, 0, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class687.field9628; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field5660[var9];
                var5[var8] = class321.method1919(4080, var10 >> 12);
                var6[var8] = class321.method1919(var10 >> 4, 4080);
                var7[var8] = class321.method1919(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIB)V", line = 63)
    public static final void method2315(int arg0, int arg1, byte arg2) {
        ++field5666;
        class252 var3 = class150.method916(arg0, -123, 13);
        var3.method1502((byte) -103);
        var3.field3251 = arg1;
        if (arg2 > 54) {
            ;
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)V", line = 79)
    public final void method85(byte arg0) {
        if (this.field5661 == null) {
            this.method2316(10, 1);
        }
        if (arg0 == 66) {
            ++field5663;
            this.method2318(3);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V", line = 93)
    private final void method2316(int arg0, int arg1) {
        ++field5665;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field5661 = new int[4][4];
                                this.field5661[0][0] = 2048;
                                this.field5661[0][3] = 0;
                                this.field5661[0][1] = 0;
                                this.field5661[0][2] = 4096;
                                this.field5661[1][3] = 0;
                                this.field5661[1][2] = 4096;
                                this.field5661[1][1] = 4096;
                                this.field5661[1][0] = 2867;
                                this.field5661[2][3] = 0;
                                this.field5661[2][0] = 3276;
                                this.field5661[2][1] = 4096;
                                this.field5661[2][2] = 4096;
                                this.field5661[3][1] = 4096;
                                this.field5661[3][3] = 0;
                                this.field5661[3][0] = 4096;
                                this.field5661[3][2] = 0;
                            } else {
                                this.field5661 = new int[16][4];
                                this.field5661[0][0] = 0;
                                this.field5661[0][1] = 80;
                                this.field5661[0][3] = 321;
                                this.field5661[0][2] = 192;
                                this.field5661[1][2] = 449;
                                this.field5661[1][1] = 321;
                                this.field5661[1][3] = 562;
                                this.field5661[1][0] = 155;
                                this.field5661[2][3] = 803;
                                this.field5661[2][0] = 389;
                                this.field5661[2][1] = 578;
                                this.field5661[2][2] = 690;
                                this.field5661[3][1] = 947;
                                this.field5661[3][3] = 1140;
                                this.field5661[3][0] = 671;
                                this.field5661[3][2] = 995;
                                this.field5661[4][3] = 1509;
                                this.field5661[4][2] = 1397;
                                this.field5661[4][1] = 1285;
                                this.field5661[4][0] = 897;
                                this.field5661[5][2] = 1429;
                                this.field5661[5][1] = 1525;
                                this.field5661[5][0] = 1175;
                                this.field5661[5][3] = 1413;
                                this.field5661[6][2] = 1461;
                                this.field5661[6][1] = 1734;
                                this.field5661[6][0] = 1368;
                                this.field5661[6][3] = 1333;
                                this.field5661[7][0] = 1507;
                                this.field5661[7][3] = 1702;
                                this.field5661[7][2] = 1525;
                                this.field5661[7][1] = 1413;
                                this.field5661[8][2] = 1590;
                                this.field5661[8][1] = 1108;
                                this.field5661[8][0] = 1736;
                                this.field5661[8][3] = 2056;
                                this.field5661[9][2] = 2056;
                                this.field5661[9][0] = 2088;
                                this.field5661[9][3] = 2666;
                                this.field5661[9][1] = 1766;
                                this.field5661[10][0] = 2355;
                                this.field5661[10][2] = 2586;
                                this.field5661[10][1] = 2409;
                                this.field5661[10][3] = 3276;
                                this.field5661[11][2] = 3148;
                                this.field5661[11][0] = 2691;
                                this.field5661[11][1] = 3116;
                                this.field5661[11][3] = 3228;
                                this.field5661[12][2] = 3710;
                                this.field5661[12][3] = 3196;
                                this.field5661[12][1] = 3806;
                                this.field5661[12][0] = 3031;
                                this.field5661[13][3] = 3019;
                                this.field5661[13][2] = 3421;
                                this.field5661[13][1] = 3437;
                                this.field5661[13][0] = 3522;
                                this.field5661[14][2] = 3148;
                                this.field5661[14][0] = 3727;
                                this.field5661[14][3] = 3228;
                                this.field5661[14][1] = 3116;
                                this.field5661[15][2] = 2505;
                                this.field5661[15][3] = 2746;
                                this.field5661[15][0] = 4096;
                                this.field5661[15][1] = 2377;
                            }
                        } else {
                            this.field5661 = new int[6][4];
                            this.field5661[0][2] = 0;
                            this.field5661[0][1] = 0;
                            this.field5661[0][3] = 0;
                            this.field5661[0][0] = 0;
                            this.field5661[1][2] = 0;
                            this.field5661[1][1] = 0;
                            this.field5661[1][3] = 1493;
                            this.field5661[1][0] = 1843;
                            this.field5661[2][1] = 0;
                            this.field5661[2][0] = 2457;
                            this.field5661[2][3] = 2939;
                            this.field5661[2][2] = 0;
                            this.field5661[3][2] = 1124;
                            this.field5661[3][0] = 2781;
                            this.field5661[3][3] = 3565;
                            this.field5661[3][1] = 0;
                            this.field5661[4][0] = 3481;
                            this.field5661[4][3] = 4031;
                            this.field5661[4][2] = 3084;
                            this.field5661[4][1] = 546;
                            this.field5661[5][3] = 4096;
                            this.field5661[5][1] = 4096;
                            this.field5661[5][0] = 4096;
                            this.field5661[5][2] = 4096;
                        }
                    } else {
                        this.field5661 = new int[7][4];
                        this.field5661[0][2] = 0;
                        this.field5661[0][3] = 4096;
                        this.field5661[0][0] = 0;
                        this.field5661[0][1] = 0;
                        this.field5661[1][2] = 4096;
                        this.field5661[1][0] = 663;
                        this.field5661[1][1] = 0;
                        this.field5661[1][3] = 4096;
                        this.field5661[2][1] = 0;
                        this.field5661[2][3] = 0;
                        this.field5661[2][2] = 4096;
                        this.field5661[2][0] = 1363;
                        this.field5661[3][0] = 2048;
                        this.field5661[3][1] = 4096;
                        this.field5661[3][3] = 0;
                        this.field5661[3][2] = 4096;
                        this.field5661[4][1] = 4096;
                        this.field5661[4][0] = 2727;
                        this.field5661[4][2] = 0;
                        this.field5661[4][3] = 0;
                        this.field5661[5][0] = 3411;
                        this.field5661[5][2] = 0;
                        this.field5661[5][3] = 4096;
                        this.field5661[5][1] = 4096;
                        this.field5661[6][2] = 0;
                        this.field5661[6][0] = 4096;
                        this.field5661[6][3] = 4096;
                        this.field5661[6][1] = 0;
                    }
                } else {
                    this.field5661 = new int[8][4];
                    this.field5661[0][3] = 2361;
                    this.field5661[0][0] = 0;
                    this.field5661[0][1] = 2650;
                    this.field5661[0][2] = 2602;
                    this.field5661[1][3] = 1558;
                    this.field5661[1][2] = 1799;
                    this.field5661[1][1] = 2313;
                    this.field5661[1][0] = 2867;
                    this.field5661[2][2] = 1734;
                    this.field5661[2][3] = 1413;
                    this.field5661[2][1] = 2618;
                    this.field5661[2][0] = 3072;
                    this.field5661[3][1] = 2296;
                    this.field5661[3][3] = 947;
                    this.field5661[3][0] = 3276;
                    this.field5661[3][2] = 1220;
                    this.field5661[4][1] = 2072;
                    this.field5661[4][3] = 722;
                    this.field5661[4][0] = 3481;
                    this.field5661[4][2] = 963;
                    this.field5661[5][2] = 2152;
                    this.field5661[5][0] = 3686;
                    this.field5661[5][1] = 2730;
                    this.field5661[5][3] = 1766;
                    this.field5661[6][2] = 1060;
                    this.field5661[6][0] = 3891;
                    this.field5661[6][1] = 2232;
                    this.field5661[6][3] = 915;
                    this.field5661[7][0] = 4096;
                    this.field5661[7][1] = 1686;
                    this.field5661[7][2] = 1413;
                    this.field5661[7][3] = 1140;
                }
            } else {
                this.field5661 = new int[2][4];
                this.field5661[0][0] = 0;
                this.field5661[0][1] = 0;
                this.field5661[0][3] = 0;
                this.field5661[0][2] = 0;
                this.field5661[1][2] = 4096;
                this.field5661[1][0] = 4096;
                this.field5661[1][1] = 4096;
                this.field5661[1][3] = 4096;
            }
        }
        if (arg0 != 10) {
            this.field5661 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILni;)I", line = 353)
    public static final int method2317(int arg0, class522 arg1) {
        if (arg0 != -11286) {
            return -69;
        } else {
            ++field5664;
            int var2 = 0;
            if (arg1.method2882(arg0 + 11209, class487.field6681)) {
                ++var2;
            }
            if (arg1.method2882(-35, class633.field8789)) {
                ++var2;
            }
            if (arg1.method2882(-25, class488.field6692)) {
                ++var2;
            }
            if (arg1.method2882(-104, class681.field9486)) {
                ++var2;
            }
            if (arg1.method2882(-118, class745.field10347)) {
                ++var2;
            }
            if (arg1.method2882(-64, class619.field8683)) {
                ++var2;
            }
            if (arg1.method2882(-42, class556.field7832)) {
                ++var2;
            }
            if (arg1.method2882(arg0 + 11196, class474.field6563)) {
                ++var2;
            }
            if (arg1.method2882(-40, class516.field6967)) {
                ++var2;
            }
            if (arg1.method2882(-94, class414.field5855)) {
                ++var2;
            }
            if (arg1.method2882(-89, class298.field3990)) {
                ++var2;
            }
            if (arg1.method2882(-89, class333.field4496)) {
                ++var2;
            }
            if (arg1.method2882(-111, class386.field5454)) {
                ++var2;
            }
            if (arg1.method2882(-40, class151.field1931)) {
                ++var2;
            }
            if (arg1.method2882(-108, class568.field8011)) {
                ++var2;
            }
            if (arg1.method2882(-38, class493.field6726)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILji;B)V", line = 421)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 >= -92) {
            this.field5660 = null;
        }
        if (~arg0 == -1) {
            int var4 = arg1.method3428((byte) 4);
            if (var4 != 0) {
                this.method2316(10, var4);
            } else {
                this.field5661 = new int[arg1.method3428((byte) -107)][4];
                for (int var5 = 0; ~this.field5661.length < ~var5; ++var5) {
                    this.field5661[var5][0] = arg1.method3402((byte) 127);
                    this.field5661[var5][1] = arg1.method3428((byte) 87) << 4;
                    this.field5661[var5][2] = arg1.method3428((byte) 10) << 4;
                    this.field5661[var5][3] = arg1.method3428((byte) -124) << 4;
                }
            }
        }
        ++field5668;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 459)
    private final void method2318(int arg0) {
        ++field5662;
        int var2 = this.field5661.length;
        if (arg0 == 3) {
            if (~var2 < -1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field5661[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (~var2 < ~var4) {
                        int[] var7 = this.field5661[var4];
                        if (var4 > 0) {
                            int[] var8 = this.field5661[var4 + -1];
                            int var9 = (-var8[0] + var5 << 12) / (var7[0] - var8[0]);
                            int var10 = -var9 + 4096;
                            var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                            var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                            var13 = var7[1] * var9 - -(var8[1] * var10) >> 12;
                        } else {
                            var12 = var7[3];
                            var11 = var7[2];
                            var13 = var7[1];
                        }
                    } else {
                        int[] var14 = this.field5661[var2 + -1];
                        var13 = var14[1];
                        var12 = var14[3];
                        var11 = var14[2];
                    }
                    int var15 = var13 >> 4;
                    int var16 = var11 >> 4;
                    int var17 = var12 >> 4;
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -256) {
                        var15 = 255;
                    }
                    this.field5660[var3] = class344.method2020(var17, class344.method2020(var15 << 16, var16 << 8));
                }
            }
        }
    }
}
