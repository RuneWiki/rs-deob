import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class276 extends class325 {

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "[I")
    private int[] field4101 = new int[257];

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "Lnaa;")
    public static class78 field4094 = new class78();

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "[[I")
    private int[][] field4096;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljp;IB)V", line = 13)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 > -41) {
            this.method1786(-114);
        }
        ++field4093;
        if (arg1 == 0) {
            int var4 = arg0.method2398(-1372747256);
            if (var4 != 0) {
                this.method1788(var4, 97);
            } else {
                this.field4096 = new int[arg0.method2398(-1372747256)][4];
                for (int var5 = 0; var5 < this.field4096.length; ++var5) {
                    this.field4096[var5][0] = arg0.method2359(-1);
                    this.field4096[var5][1] = arg0.method2398(-1372747256) << 4;
                    this.field4096[var5][2] = arg0.method2398(-1372747256) << 4;
                    this.field4096[var5][3] = arg0.method2398(-1372747256) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[[I", line = 52)
    public final int[][] method360(int arg0, byte arg1) {
        if (arg1 != -9) {
            this.method1786(-42);
        }
        ++field4100;
        int[][] var3 = super.field4733.method1251((byte) 59, arg0);
        if (super.field4733.field2369) {
            int[] var4 = this.method2062(arg0, 0, (byte) 33);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class261.field3874 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4101[var9];
                var5[var8] = class440.method2643(var10 >> 12, 4080);
                var6[var8] = class440.method2643(var10, 65280) >> 4;
                var7[var8] = class440.method2643(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 103)
    private final void method1786(int arg0) {
        ++field4098;
        if (arg0 == -65537) {
            int var2 = this.field4096.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var6 > ~var2 && this.field4096[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 <= var4) {
                        int[] var7 = this.field4096[var2 + -1];
                        var8 = var7[3];
                        var9 = var7[1];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field4096[var4];
                        if (~var4 >= -1) {
                            var9 = var11[1];
                            var8 = var11[3];
                            var10 = var11[2];
                        } else {
                            int[] var12 = this.field4096[var4 - 1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                            int var14 = -var13 + 4096;
                            var10 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                            var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        }
                    }
                    int var15 = var8 >> 4;
                    int var16 = var9 >> 4;
                    int var17 = var10 >> 4;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (~var16 < -256) {
                        var16 = 255;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    this.field4101[var3] = class213.method1409(class213.method1409(var17 << 8, var16 << 16), var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V", line = 207)
    public final void method101(boolean arg0) {
        if (this.field4096 == null) {
            this.method1788(1, 20);
        }
        if (arg0) {
            ++field4095;
            this.method1786(-65537);
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 221)
    public static final void method1787(int arg0) {
        if (arg0 > 8) {
            ++field4097;
            if (class145.field2069 == null) {
                class145.field2069 = new int[65536];
                double var1 = 0.7D + -0.015D + Math.random() * 0.03D;
                for (int var3 = 0; ~var3 > -65537; ++var3) {
                    double var4 = (double) ((var3 & 64809) >> 10) / 64.0D + 0.0078125D;
                    double var6 = (double) (7 & var3 >> 7) / 8.0D + 0.0625D;
                    double var8 = (double) (127 & var3) / 128.0D;
                    double var10 = var8;
                    double var12 = var8;
                    double var14 = var8;
                    if (var6 != 0.0D) {
                        double var16;
                        if (var8 < 0.5D) {
                            var16 = (var6 + 1.0D) * var8;
                        } else {
                            var16 = var6 + var8 - var6 * var8;
                        }
                        double var18 = var8 * 2.0D - var16;
                        double var20 = var4 + 0.3333333333333333D;
                        if (var20 > 1.0D) {
                            --var20;
                        }
                        double var24 = var4 - 0.3333333333333333D;
                        if (var24 < 0.0D) {
                            ++var24;
                        }
                        if (!(var20 * 6.0D < 1.0D)) {
                            if (!(var20 * 2.0D < 1.0D)) {
                                if (!(var20 * 3.0D < 2.0D)) {
                                    var10 = var18;
                                } else {
                                    var10 = (0.6666666666666666D - var20) * (-var18 + var16) * 6.0D + var18;
                                }
                            } else {
                                var10 = var16;
                            }
                        } else {
                            var10 = (var16 - var18) * 6.0D * var20 + var18;
                        }
                        if (var4 * 6.0D < 1.0D) {
                            var12 = (-var18 + var16) * 6.0D * var4 + var18;
                        } else if (var4 * 2.0D < 1.0D) {
                            var12 = var16;
                        } else if (!(var4 * 3.0D < 2.0D)) {
                            var12 = var18;
                        } else {
                            var12 = (-var18 + var16) * (-var4 + 0.6666666666666666D) * 6.0D + var18;
                        }
                        if (!(var24 * 6.0D < 1.0D)) {
                            if (!(var24 * 2.0D < 1.0D)) {
                                if (var24 * 3.0D < 2.0D) {
                                    var14 = (0.6666666666666666D - var24) * (-var18 + var16) * 6.0D + var18;
                                } else {
                                    var14 = var18;
                                }
                            } else {
                                var14 = var16;
                            }
                        } else {
                            var14 = (-var18 + var16) * 6.0D * var24 + var18;
                        }
                    }
                    double var26 = Math.pow(var10, var1);
                    double var28 = Math.pow(var12, var1);
                    double var30 = Math.pow(var14, var1);
                    int var32 = (int) (var26 * 256.0D);
                    int var33 = (int) (var28 * 256.0D);
                    int var34 = (int) (var30 * 256.0D);
                    int var35 = (var33 << 8) + (var32 << 16) + var34;
                    class145.field2069[var3] = var35;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 333)
    private final void method1788(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field4101 = null;
        }
        ++field4099;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field4096 = new int[4][4];
                                    this.field4096[0][1] = 0;
                                    this.field4096[0][3] = 0;
                                    this.field4096[0][0] = 2048;
                                    this.field4096[0][2] = 4096;
                                    this.field4096[1][2] = 4096;
                                    this.field4096[1][1] = 4096;
                                    this.field4096[1][0] = 2867;
                                    this.field4096[1][3] = 0;
                                    this.field4096[2][2] = 4096;
                                    this.field4096[2][0] = 3276;
                                    this.field4096[2][1] = 4096;
                                    this.field4096[2][3] = 0;
                                    this.field4096[3][3] = 0;
                                    this.field4096[3][1] = 4096;
                                    this.field4096[3][0] = 4096;
                                    this.field4096[3][2] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field4096 = new int[16][4];
                                this.field4096[0][3] = 321;
                                this.field4096[0][1] = 80;
                                this.field4096[0][0] = 0;
                                this.field4096[0][2] = 192;
                                this.field4096[1][3] = 562;
                                this.field4096[1][2] = 449;
                                this.field4096[1][0] = 155;
                                this.field4096[1][1] = 321;
                                this.field4096[2][3] = 803;
                                this.field4096[2][2] = 690;
                                this.field4096[2][1] = 578;
                                this.field4096[2][0] = 389;
                                this.field4096[3][1] = 947;
                                this.field4096[3][2] = 995;
                                this.field4096[3][3] = 1140;
                                this.field4096[3][0] = 671;
                                this.field4096[4][3] = 1509;
                                this.field4096[4][2] = 1397;
                                this.field4096[4][1] = 1285;
                                this.field4096[4][0] = 897;
                                this.field4096[5][3] = 1413;
                                this.field4096[5][0] = 1175;
                                this.field4096[5][2] = 1429;
                                this.field4096[5][1] = 1525;
                                this.field4096[6][0] = 1368;
                                this.field4096[6][3] = 1333;
                                this.field4096[6][2] = 1461;
                                this.field4096[6][1] = 1734;
                                this.field4096[7][1] = 1413;
                                this.field4096[7][2] = 1525;
                                this.field4096[7][0] = 1507;
                                this.field4096[7][3] = 1702;
                                this.field4096[8][3] = 2056;
                                this.field4096[8][0] = 1736;
                                this.field4096[8][1] = 1108;
                                this.field4096[8][2] = 1590;
                                this.field4096[9][3] = 2666;
                                this.field4096[9][2] = 2056;
                                this.field4096[9][1] = 1766;
                                this.field4096[9][0] = 2088;
                                this.field4096[10][1] = 2409;
                                this.field4096[10][2] = 2586;
                                this.field4096[10][0] = 2355;
                                this.field4096[10][3] = 3276;
                                this.field4096[11][0] = 2691;
                                this.field4096[11][3] = 3228;
                                this.field4096[11][1] = 3116;
                                this.field4096[11][2] = 3148;
                                this.field4096[12][3] = 3196;
                                this.field4096[12][0] = 3031;
                                this.field4096[12][2] = 3710;
                                this.field4096[12][1] = 3806;
                                this.field4096[13][1] = 3437;
                                this.field4096[13][2] = 3421;
                                this.field4096[13][3] = 3019;
                                this.field4096[13][0] = 3522;
                                this.field4096[14][2] = 3148;
                                this.field4096[14][3] = 3228;
                                this.field4096[14][1] = 3116;
                                this.field4096[14][0] = 3727;
                                this.field4096[15][2] = 2505;
                                this.field4096[15][1] = 2377;
                                this.field4096[15][3] = 2746;
                                this.field4096[15][0] = 4096;
                            }
                        } else {
                            this.field4096 = new int[6][4];
                            this.field4096[0][1] = 0;
                            this.field4096[0][3] = 0;
                            this.field4096[0][2] = 0;
                            this.field4096[0][0] = 0;
                            this.field4096[1][3] = 1493;
                            this.field4096[1][0] = 1843;
                            this.field4096[1][1] = 0;
                            this.field4096[1][2] = 0;
                            this.field4096[2][0] = 2457;
                            this.field4096[2][3] = 2939;
                            this.field4096[2][1] = 0;
                            this.field4096[2][2] = 0;
                            this.field4096[3][1] = 0;
                            this.field4096[3][0] = 2781;
                            this.field4096[3][3] = 3565;
                            this.field4096[3][2] = 1124;
                            this.field4096[4][0] = 3481;
                            this.field4096[4][2] = 3084;
                            this.field4096[4][3] = 4031;
                            this.field4096[4][1] = 546;
                            this.field4096[5][2] = 4096;
                            this.field4096[5][1] = 4096;
                            this.field4096[5][0] = 4096;
                            this.field4096[5][3] = 4096;
                        }
                    } else {
                        this.field4096 = new int[7][4];
                        this.field4096[0][0] = 0;
                        this.field4096[0][2] = 0;
                        this.field4096[0][3] = 4096;
                        this.field4096[0][1] = 0;
                        this.field4096[1][3] = 4096;
                        this.field4096[1][1] = 0;
                        this.field4096[1][2] = 4096;
                        this.field4096[1][0] = 663;
                        this.field4096[2][2] = 4096;
                        this.field4096[2][3] = 0;
                        this.field4096[2][0] = 1363;
                        this.field4096[2][1] = 0;
                        this.field4096[3][1] = 4096;
                        this.field4096[3][0] = 2048;
                        this.field4096[3][2] = 4096;
                        this.field4096[3][3] = 0;
                        this.field4096[4][3] = 0;
                        this.field4096[4][2] = 0;
                        this.field4096[4][0] = 2727;
                        this.field4096[4][1] = 4096;
                        this.field4096[5][1] = 4096;
                        this.field4096[5][0] = 3411;
                        this.field4096[5][3] = 4096;
                        this.field4096[5][2] = 0;
                        this.field4096[6][3] = 4096;
                        this.field4096[6][0] = 4096;
                        this.field4096[6][2] = 0;
                        this.field4096[6][1] = 0;
                    }
                } else {
                    this.field4096 = new int[8][4];
                    this.field4096[0][3] = 2361;
                    this.field4096[0][0] = 0;
                    this.field4096[0][1] = 2650;
                    this.field4096[0][2] = 2602;
                    this.field4096[1][0] = 2867;
                    this.field4096[1][1] = 2313;
                    this.field4096[1][2] = 1799;
                    this.field4096[1][3] = 1558;
                    this.field4096[2][0] = 3072;
                    this.field4096[2][1] = 2618;
                    this.field4096[2][3] = 1413;
                    this.field4096[2][2] = 1734;
                    this.field4096[3][0] = 3276;
                    this.field4096[3][3] = 947;
                    this.field4096[3][2] = 1220;
                    this.field4096[3][1] = 2296;
                    this.field4096[4][3] = 722;
                    this.field4096[4][1] = 2072;
                    this.field4096[4][0] = 3481;
                    this.field4096[4][2] = 963;
                    this.field4096[5][1] = 2730;
                    this.field4096[5][3] = 1766;
                    this.field4096[5][2] = 2152;
                    this.field4096[5][0] = 3686;
                    this.field4096[6][2] = 1060;
                    this.field4096[6][3] = 915;
                    this.field4096[6][0] = 3891;
                    this.field4096[6][1] = 2232;
                    this.field4096[7][2] = 1413;
                    this.field4096[7][3] = 1140;
                    this.field4096[7][0] = 4096;
                    this.field4096[7][1] = 1686;
                }
            } else {
                this.field4096 = new int[2][4];
                this.field4096[0][1] = 0;
                this.field4096[0][3] = 0;
                this.field4096[0][2] = 0;
                this.field4096[0][0] = 0;
                this.field4096[1][2] = 4096;
                this.field4096[1][3] = 4096;
                this.field4096[1][0] = 4096;
                this.field4096[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V", line = 590)
    public static final void method1789(int arg0, int arg1) {
        class243 var2 = class626.field8501[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class243 var4 = class626.field8501[var3][arg0][arg1] = class626.field8501[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class48 var5 = var4.field3272; var5 != null; var5 = var5.field726) {
                    class319 var6 = var5.field725;
                    if (var6.field4600 == arg0 && var6.field4590 == arg1) {
                        --var6.field2250;
                    }
                }
                if (var4.field3280 != null) {
                    --var4.field3280.field2250;
                }
                if (var4.field3270 != null) {
                    --var4.field3270.field2250;
                }
                if (var4.field3269 != null) {
                    --var4.field3269.field2250;
                }
                if (var4.field3277 != null) {
                    --var4.field3277.field2250;
                }
                if (var4.field3274 != null) {
                    --var4.field3274.field2250;
                }
            }
        }
        if (class626.field8501[0][arg0][arg1] == null) {
            class626.field8501[0][arg0][arg1] = new class243(0);
            class626.field8501[0][arg0][arg1].field3275 = 1;
        }
        class626.field8501[0][arg0][arg1].field3281 = var2;
        class626.field8501[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 643)
    public class276() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V", line = 651)
    public static void method1790(boolean arg0) {
        field4094 = null;
        if (arg0) {
            method1790(true);
        }
    }
}
