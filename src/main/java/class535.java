import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class535 extends class34 {

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "[I")
    private int[] field7881 = new int[257];

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "Z")
    public static boolean field7877 = false;

    @OriginalMember(owner = "client!aq", name = "C", descriptor = "Lrb;")
    public static class283 field7873 = new class283(24, -1);

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "Lhi;")
    public static class45 field7880 = new class45(27, 15);

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "[[I")
    private int[][] field7878;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)V")
    private final void method3165(int arg0) {
        ++field7882;
        if (arg0 != 5) {
            this.method146((byte) -69);
        }
        int var2 = this.field7878.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && this.field7878[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var4 < var2) {
                    int[] var7 = this.field7878[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field7878[var4 - 1];
                        int var9 = (var5 - var8[0] << 12) / (var7[0] - var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var12 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var13 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                    } else {
                        var12 = var7[2];
                        var11 = var7[1];
                        var13 = var7[3];
                    }
                } else {
                    int[] var14 = this.field7878[var2 - 1];
                    var13 = var14[3];
                    var12 = var14[2];
                    var11 = var14[1];
                }
                int var15 = var13 >> 4;
                int var16 = var11 >> 4;
                int var17 = var12 >> 4;
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var15 <= -1) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field7881[var3] = class219.method1367(var15, class219.method1367(var16 << 16, var17 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 <= 16) {
            field7873 = null;
        }
        ++field7879;
        if (arg2 == 0) {
            int var4 = arg0.method1869(-87);
            if (var4 != 0) {
                this.method3166(14524, var4);
            } else {
                this.field7878 = new int[arg0.method1869(-128)][4];
                for (int var5 = 0; this.field7878.length > var5; ++var5) {
                    this.field7878[var5][0] = arg0.method1844(-114);
                    this.field7878[var5][1] = arg0.method1869(-79) << 4;
                    this.field7878[var5][2] = arg0.method1869(-126) << 4;
                    this.field7878[var5][3] = arg0.method1869(-121) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
    public class535() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V")
    public final void method146(byte arg0) {
        if (this.field7878 == null) {
            this.method3166(14524, 1);
        }
        if (arg0 > -84) {
            field7873 = null;
        }
        ++field7874;
        this.method3165(5);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
    private final void method3166(int arg0, int arg1) {
        if (arg0 == 14524) {
            ++field7875;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 == 6) {
                                        this.field7878 = new int[4][4];
                                        this.field7878[0][2] = 4096;
                                        this.field7878[0][3] = 0;
                                        this.field7878[0][0] = 2048;
                                        this.field7878[0][1] = 0;
                                        this.field7878[1][0] = 2867;
                                        this.field7878[1][1] = 4096;
                                        this.field7878[1][3] = 0;
                                        this.field7878[1][2] = 4096;
                                        this.field7878[2][3] = 0;
                                        this.field7878[2][1] = 4096;
                                        this.field7878[2][2] = 4096;
                                        this.field7878[2][0] = 3276;
                                        this.field7878[3][0] = 4096;
                                        this.field7878[3][3] = 0;
                                        this.field7878[3][1] = 4096;
                                        this.field7878[3][2] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field7878 = new int[16][4];
                                    this.field7878[0][3] = 321;
                                    this.field7878[0][1] = 80;
                                    this.field7878[0][2] = 192;
                                    this.field7878[0][0] = 0;
                                    this.field7878[1][0] = 155;
                                    this.field7878[1][3] = 562;
                                    this.field7878[1][1] = 321;
                                    this.field7878[1][2] = 449;
                                    this.field7878[2][3] = 803;
                                    this.field7878[2][0] = 389;
                                    this.field7878[2][1] = 578;
                                    this.field7878[2][2] = 690;
                                    this.field7878[3][1] = 947;
                                    this.field7878[3][2] = 995;
                                    this.field7878[3][3] = 1140;
                                    this.field7878[3][0] = 671;
                                    this.field7878[4][1] = 1285;
                                    this.field7878[4][0] = 897;
                                    this.field7878[4][3] = 1509;
                                    this.field7878[4][2] = 1397;
                                    this.field7878[5][1] = 1525;
                                    this.field7878[5][0] = 1175;
                                    this.field7878[5][3] = 1413;
                                    this.field7878[5][2] = 1429;
                                    this.field7878[6][3] = 1333;
                                    this.field7878[6][2] = 1461;
                                    this.field7878[6][0] = 1368;
                                    this.field7878[6][1] = 1734;
                                    this.field7878[7][0] = 1507;
                                    this.field7878[7][1] = 1413;
                                    this.field7878[7][3] = 1702;
                                    this.field7878[7][2] = 1525;
                                    this.field7878[8][1] = 1108;
                                    this.field7878[8][2] = 1590;
                                    this.field7878[8][0] = 1736;
                                    this.field7878[8][3] = 2056;
                                    this.field7878[9][3] = 2666;
                                    this.field7878[9][0] = 2088;
                                    this.field7878[9][1] = 1766;
                                    this.field7878[9][2] = 2056;
                                    this.field7878[10][2] = 2586;
                                    this.field7878[10][1] = 2409;
                                    this.field7878[10][3] = 3276;
                                    this.field7878[10][0] = 2355;
                                    this.field7878[11][0] = 2691;
                                    this.field7878[11][3] = 3228;
                                    this.field7878[11][1] = 3116;
                                    this.field7878[11][2] = 3148;
                                    this.field7878[12][2] = 3710;
                                    this.field7878[12][1] = 3806;
                                    this.field7878[12][0] = 3031;
                                    this.field7878[12][3] = 3196;
                                    this.field7878[13][1] = 3437;
                                    this.field7878[13][2] = 3421;
                                    this.field7878[13][3] = 3019;
                                    this.field7878[13][0] = 3522;
                                    this.field7878[14][3] = 3228;
                                    this.field7878[14][0] = 3727;
                                    this.field7878[14][1] = 3116;
                                    this.field7878[14][2] = 3148;
                                    this.field7878[15][3] = 2746;
                                    this.field7878[15][1] = 2377;
                                    this.field7878[15][0] = 4096;
                                    this.field7878[15][2] = 2505;
                                }
                            } else {
                                this.field7878 = new int[6][4];
                                this.field7878[0][1] = 0;
                                this.field7878[0][3] = 0;
                                this.field7878[0][2] = 0;
                                this.field7878[0][0] = 0;
                                this.field7878[1][1] = 0;
                                this.field7878[1][0] = 1843;
                                this.field7878[1][3] = 1493;
                                this.field7878[1][2] = 0;
                                this.field7878[2][0] = 2457;
                                this.field7878[2][3] = 2939;
                                this.field7878[2][2] = 0;
                                this.field7878[2][1] = 0;
                                this.field7878[3][0] = 2781;
                                this.field7878[3][1] = 0;
                                this.field7878[3][2] = 1124;
                                this.field7878[3][3] = 3565;
                                this.field7878[4][1] = 546;
                                this.field7878[4][2] = 3084;
                                this.field7878[4][0] = 3481;
                                this.field7878[4][3] = 4031;
                                this.field7878[5][2] = 4096;
                                this.field7878[5][3] = 4096;
                                this.field7878[5][0] = 4096;
                                this.field7878[5][1] = 4096;
                            }
                        } else {
                            this.field7878 = new int[7][4];
                            this.field7878[0][2] = 0;
                            this.field7878[0][3] = 4096;
                            this.field7878[0][0] = 0;
                            this.field7878[0][1] = 0;
                            this.field7878[1][1] = 0;
                            this.field7878[1][0] = 663;
                            this.field7878[1][2] = 4096;
                            this.field7878[1][3] = 4096;
                            this.field7878[2][1] = 0;
                            this.field7878[2][2] = 4096;
                            this.field7878[2][3] = 0;
                            this.field7878[2][0] = 1363;
                            this.field7878[3][0] = 2048;
                            this.field7878[3][3] = 0;
                            this.field7878[3][1] = 4096;
                            this.field7878[3][2] = 4096;
                            this.field7878[4][3] = 0;
                            this.field7878[4][0] = 2727;
                            this.field7878[4][1] = 4096;
                            this.field7878[4][2] = 0;
                            this.field7878[5][0] = 3411;
                            this.field7878[5][1] = 4096;
                            this.field7878[5][3] = 4096;
                            this.field7878[5][2] = 0;
                            this.field7878[6][2] = 0;
                            this.field7878[6][0] = 4096;
                            this.field7878[6][3] = 4096;
                            this.field7878[6][1] = 0;
                        }
                    } else {
                        this.field7878 = new int[8][4];
                        this.field7878[0][2] = 2602;
                        this.field7878[0][3] = 2361;
                        this.field7878[0][0] = 0;
                        this.field7878[0][1] = 2650;
                        this.field7878[1][3] = 1558;
                        this.field7878[1][1] = 2313;
                        this.field7878[1][0] = 2867;
                        this.field7878[1][2] = 1799;
                        this.field7878[2][1] = 2618;
                        this.field7878[2][3] = 1413;
                        this.field7878[2][0] = 3072;
                        this.field7878[2][2] = 1734;
                        this.field7878[3][2] = 1220;
                        this.field7878[3][3] = 947;
                        this.field7878[3][1] = 2296;
                        this.field7878[3][0] = 3276;
                        this.field7878[4][0] = 3481;
                        this.field7878[4][1] = 2072;
                        this.field7878[4][3] = 722;
                        this.field7878[4][2] = 963;
                        this.field7878[5][2] = 2152;
                        this.field7878[5][3] = 1766;
                        this.field7878[5][0] = 3686;
                        this.field7878[5][1] = 2730;
                        this.field7878[6][3] = 915;
                        this.field7878[6][2] = 1060;
                        this.field7878[6][0] = 3891;
                        this.field7878[6][1] = 2232;
                        this.field7878[7][0] = 4096;
                        this.field7878[7][2] = 1413;
                        this.field7878[7][1] = 1686;
                        this.field7878[7][3] = 1140;
                    }
                } else {
                    this.field7878 = new int[2][4];
                    this.field7878[0][3] = 0;
                    this.field7878[0][0] = 0;
                    this.field7878[0][2] = 0;
                    this.field7878[0][1] = 0;
                    this.field7878[1][2] = 4096;
                    this.field7878[1][1] = 4096;
                    this.field7878[1][3] = 4096;
                    this.field7878[1][0] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)[[I")
    public final int[][] method66(byte arg0, int arg1) {
        ++field7876;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (arg0 != -11) {
            this.method69((class319) null, 65, -35);
        }
        if (super.field536.field726) {
            int[] var4 = this.method252(false, arg1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class383.field5502 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field7881[var9];
                var5[var8] = class375.method2245(16711680, var10) >> 12;
                var6[var8] = class375.method2245(var10, 65280) >> 4;
                var7[var8] = class375.method2245(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)V")
    public static void method3167(int arg0) {
        if (arg0 == 2781) {
            field7873 = null;
            field7880 = null;
        }
    }
}
