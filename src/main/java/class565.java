import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class565 extends class175 {

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "[I")
    private int[] field7740 = new int[257];

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field7734 = -50;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "[I")
    public static int[] field7737 = new int[200];

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "[[I")
    public static int[][] field7739 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "[J")
    public static long[] field7736;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "[[I")
    private int[][] field7735;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILdt;Z)V", line = 8)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg0 == 0) {
            int var4 = arg1.method1731((byte) 64);
            if (var4 != 0) {
                this.method3220(0, var4);
            } else {
                this.field7735 = new int[arg1.method1731((byte) 64)][4];
                for (int var5 = 0; ~var5 > ~this.field7735.length; ++var5) {
                    this.field7735[var5][0] = arg1.method1728((byte) 79);
                    this.field7735[var5][1] = arg1.method1731((byte) 64) << 4;
                    this.field7735[var5][2] = arg1.method1731((byte) 64) << 4;
                    this.field7735[var5][3] = arg1.method1731((byte) 64) << 4;
                }
            }
        }
        ++field7733;
        if (arg2) {
            method3218(-106);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[[I", line = 48)
    public final int[][] method238(int arg0, byte arg1) {
        ++field7738;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 >= -47) {
            this.method44(46, (class254) null, false);
        }
        if (super.field2316.field8746) {
            int[] var4 = this.method1202(arg0, -1150480797, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class598.field8136; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field7740[var9];
                var5[var8] = class519.method3018(var10, 16711680) >> 12;
                var6[var8] = class519.method3018(65280, var10) >> 4;
                var7[var8] = class519.method3018(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V", line = 98)
    private final void method3217(int arg0) {
        int var2 = -59 % ((-75 - arg0) / 41);
        ++field7730;
        int var3 = this.field7735.length;
        if (~var3 < -1) {
            for (int var4 = 0; var4 < 257; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var3 > var7 && ~this.field7735[var7][0] >= ~var6; ++var7) {
                    ++var5;
                }
                int var12;
                int var13;
                int var14;
                if (var3 > var5) {
                    int[] var8 = this.field7735[var5];
                    if (var5 > 0) {
                        int[] var9 = this.field7735[var5 + -1];
                        int var10 = (-var9[0] + var6 << 12) / (var8[0] - var9[0]);
                        int var11 = -var10 + 4096;
                        var12 = var8[1] * var10 + var9[1] * var11 >> 12;
                        var13 = var8[3] * var10 - -(var9[3] * var11) >> 12;
                        var14 = var8[2] * var10 + var9[2] * var11 >> 12;
                    } else {
                        var12 = var8[1];
                        var13 = var8[3];
                        var14 = var8[2];
                    }
                } else {
                    int[] var15 = this.field7735[var3 + -1];
                    var14 = var15[2];
                    var12 = var15[1];
                    var13 = var15[3];
                }
                int var16 = var13 >> 4;
                int var17 = var12 >> 4;
                int var18 = var14 >> 4;
                if (~var16 <= -1) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var18 > -1) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field7740[var4] = class670.method3699(class670.method3699(var18 << 8, var17 << 16), var16);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "(I)V", line = 202)
    public static void method3218(int arg0) {
        if (arg0 <= -90) {
            field7736 = null;
            field7739 = null;
            field7737 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 214)
    public class565() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILqba;)V", line = 225)
    public static final void method3219(int arg0, class425 arg1) {
        ++field7729;
        int var2 = -class572.field7788 + arg1.field6165;
        int var3 = arg1.field6105 * 512 - -(256 * arg1.method2563(arg0 ^ -4648));
        int var4 = arg1.field6126 * 512 - -(256 * arg1.method2563(-12840));
        arg1.field2802 += (var3 - arg1.field2802) / var2;
        arg1.field2810 += (-arg1.field2810 + var4) / var2;
        arg1.field6199 = 0;
        if (arg1.field6107 == 0) {
            arg1.method2558(8192, -1);
        }
        if (arg1.field6107 == 1) {
            arg1.method2558(12288, -1);
        }
        if (arg0 == 8192) {
            if (~arg1.field6107 == -3) {
                arg1.method2558(0, -1);
            }
            if (~arg1.field6107 == -4) {
                arg1.method2558(4096, arg0 ^ -8193);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V", line = 269)
    private final void method3220(int arg0, int arg1) {
        ++field7731;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field7735 = new int[4][4];
                                this.field7735[0][0] = 2048;
                                this.field7735[0][2] = 4096;
                                this.field7735[0][3] = 0;
                                this.field7735[0][1] = 0;
                                this.field7735[1][1] = 4096;
                                this.field7735[1][2] = 4096;
                                this.field7735[1][3] = 0;
                                this.field7735[1][0] = 2867;
                                this.field7735[2][0] = 3276;
                                this.field7735[2][1] = 4096;
                                this.field7735[2][3] = 0;
                                this.field7735[2][2] = 4096;
                                this.field7735[3][3] = 0;
                                this.field7735[3][0] = 4096;
                                this.field7735[3][2] = 0;
                                this.field7735[3][1] = 4096;
                            } else {
                                this.field7735 = new int[16][4];
                                this.field7735[0][1] = 80;
                                this.field7735[0][0] = 0;
                                this.field7735[0][2] = 192;
                                this.field7735[0][3] = 321;
                                this.field7735[1][2] = 449;
                                this.field7735[1][3] = 562;
                                this.field7735[1][0] = 155;
                                this.field7735[1][1] = 321;
                                this.field7735[2][0] = 389;
                                this.field7735[2][3] = 803;
                                this.field7735[2][2] = 690;
                                this.field7735[2][1] = 578;
                                this.field7735[3][3] = 1140;
                                this.field7735[3][2] = 995;
                                this.field7735[3][1] = 947;
                                this.field7735[3][0] = 671;
                                this.field7735[4][2] = 1397;
                                this.field7735[4][0] = 897;
                                this.field7735[4][3] = 1509;
                                this.field7735[4][1] = 1285;
                                this.field7735[5][3] = 1413;
                                this.field7735[5][0] = 1175;
                                this.field7735[5][1] = 1525;
                                this.field7735[5][2] = 1429;
                                this.field7735[6][3] = 1333;
                                this.field7735[6][0] = 1368;
                                this.field7735[6][2] = 1461;
                                this.field7735[6][1] = 1734;
                                this.field7735[7][0] = 1507;
                                this.field7735[7][3] = 1702;
                                this.field7735[7][2] = 1525;
                                this.field7735[7][1] = 1413;
                                this.field7735[8][0] = 1736;
                                this.field7735[8][2] = 1590;
                                this.field7735[8][1] = 1108;
                                this.field7735[8][3] = 2056;
                                this.field7735[9][3] = 2666;
                                this.field7735[9][0] = 2088;
                                this.field7735[9][1] = 1766;
                                this.field7735[9][2] = 2056;
                                this.field7735[10][1] = 2409;
                                this.field7735[10][2] = 2586;
                                this.field7735[10][0] = 2355;
                                this.field7735[10][3] = 3276;
                                this.field7735[11][0] = 2691;
                                this.field7735[11][3] = 3228;
                                this.field7735[11][2] = 3148;
                                this.field7735[11][1] = 3116;
                                this.field7735[12][3] = 3196;
                                this.field7735[12][2] = 3710;
                                this.field7735[12][0] = 3031;
                                this.field7735[12][1] = 3806;
                                this.field7735[13][0] = 3522;
                                this.field7735[13][3] = 3019;
                                this.field7735[13][1] = 3437;
                                this.field7735[13][2] = 3421;
                                this.field7735[14][0] = 3727;
                                this.field7735[14][1] = 3116;
                                this.field7735[14][2] = 3148;
                                this.field7735[14][3] = 3228;
                                this.field7735[15][3] = 2746;
                                this.field7735[15][1] = 2377;
                                this.field7735[15][2] = 2505;
                                this.field7735[15][0] = 4096;
                            }
                        } else {
                            this.field7735 = new int[6][4];
                            this.field7735[0][0] = 0;
                            this.field7735[0][2] = 0;
                            this.field7735[0][1] = 0;
                            this.field7735[0][3] = 0;
                            this.field7735[1][0] = 1843;
                            this.field7735[1][1] = 0;
                            this.field7735[1][3] = 1493;
                            this.field7735[1][2] = 0;
                            this.field7735[2][0] = 2457;
                            this.field7735[2][1] = 0;
                            this.field7735[2][2] = 0;
                            this.field7735[2][3] = 2939;
                            this.field7735[3][1] = 0;
                            this.field7735[3][3] = 3565;
                            this.field7735[3][0] = 2781;
                            this.field7735[3][2] = 1124;
                            this.field7735[4][0] = 3481;
                            this.field7735[4][1] = 546;
                            this.field7735[4][3] = 4031;
                            this.field7735[4][2] = 3084;
                            this.field7735[5][3] = 4096;
                            this.field7735[5][1] = 4096;
                            this.field7735[5][2] = 4096;
                            this.field7735[5][0] = 4096;
                        }
                    } else {
                        this.field7735 = new int[7][4];
                        this.field7735[0][3] = 4096;
                        this.field7735[0][2] = 0;
                        this.field7735[0][0] = 0;
                        this.field7735[0][1] = 0;
                        this.field7735[1][2] = 4096;
                        this.field7735[1][3] = 4096;
                        this.field7735[1][1] = 0;
                        this.field7735[1][0] = 663;
                        this.field7735[2][0] = 1363;
                        this.field7735[2][1] = 0;
                        this.field7735[2][3] = 0;
                        this.field7735[2][2] = 4096;
                        this.field7735[3][3] = 0;
                        this.field7735[3][1] = 4096;
                        this.field7735[3][2] = 4096;
                        this.field7735[3][0] = 2048;
                        this.field7735[4][0] = 2727;
                        this.field7735[4][3] = 0;
                        this.field7735[4][1] = 4096;
                        this.field7735[4][2] = 0;
                        this.field7735[5][1] = 4096;
                        this.field7735[5][0] = 3411;
                        this.field7735[5][3] = 4096;
                        this.field7735[5][2] = 0;
                        this.field7735[6][0] = 4096;
                        this.field7735[6][2] = 0;
                        this.field7735[6][3] = 4096;
                        this.field7735[6][1] = 0;
                    }
                } else {
                    this.field7735 = new int[8][4];
                    this.field7735[0][0] = 0;
                    this.field7735[0][2] = 2602;
                    this.field7735[0][3] = 2361;
                    this.field7735[0][1] = 2650;
                    this.field7735[1][3] = 1558;
                    this.field7735[1][1] = 2313;
                    this.field7735[1][2] = 1799;
                    this.field7735[1][0] = 2867;
                    this.field7735[2][3] = 1413;
                    this.field7735[2][0] = 3072;
                    this.field7735[2][1] = 2618;
                    this.field7735[2][2] = 1734;
                    this.field7735[3][1] = 2296;
                    this.field7735[3][0] = 3276;
                    this.field7735[3][2] = 1220;
                    this.field7735[3][3] = 947;
                    this.field7735[4][0] = 3481;
                    this.field7735[4][1] = 2072;
                    this.field7735[4][2] = 963;
                    this.field7735[4][3] = 722;
                    this.field7735[5][2] = 2152;
                    this.field7735[5][3] = 1766;
                    this.field7735[5][0] = 3686;
                    this.field7735[5][1] = 2730;
                    this.field7735[6][1] = 2232;
                    this.field7735[6][2] = 1060;
                    this.field7735[6][0] = 3891;
                    this.field7735[6][3] = 915;
                    this.field7735[7][2] = 1413;
                    this.field7735[7][0] = 4096;
                    this.field7735[7][3] = 1140;
                    this.field7735[7][1] = 1686;
                }
            } else {
                this.field7735 = new int[2][4];
                this.field7735[0][0] = 0;
                this.field7735[0][2] = 0;
                this.field7735[0][3] = 0;
                this.field7735[0][1] = 0;
                this.field7735[1][0] = 4096;
                this.field7735[1][3] = 4096;
                this.field7735[1][1] = 4096;
                this.field7735[1][2] = 4096;
            }
        }
        if (arg0 != 0) {
            this.method46(-32);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 519)
    public final void method46(int arg0) {
        if (arg0 == -8) {
            ++field7732;
            if (this.field7735 == null) {
                this.method3220(0, 1);
            }
            this.method3217(-118);
        }
    }
}
