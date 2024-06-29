import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 extends class273 {

    @OriginalMember(owner = "client!gh", name = "db", descriptor = "[I")
    private int[] field591 = new int[257];

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "[I")
    public static int[] field586 = new int[99];

    @OriginalMember(owner = "client!gh", name = "hb", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!gh", name = "bb", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!gh", name = "gb", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "Lna;")
    public static class31 field585;

    @OriginalMember(owner = "client!gh", name = "fb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field593;

    @OriginalMember(owner = "client!gh", name = "cb", descriptor = "Z")
    public static boolean field590;

    @OriginalMember(owner = "client!gh", name = "eb", descriptor = "[I")
    public static int[] field592;

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "[[I")
    private int[][] field588;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(B)V")
    public static void method173(byte arg0) {
        if (arg0 <= 14) {
            method176(19, -71);
        }
        field592 = null;
        field586 = null;
        field585 = null;
        field593 = null;
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V")
    private final void method174(int arg0) {
        ++field589;
        int var2 = this.field588.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~var5 <= ~this.field588[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var2 < ~var4) {
                    int[] var7 = this.field588[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field588[var4 + -1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                    } else {
                        var13 = var7[2];
                        var11 = var7[1];
                        var12 = var7[3];
                    }
                } else {
                    int[] var14 = this.field588[var2 + -1];
                    var11 = var14[1];
                    var12 = var14[3];
                    var13 = var14[2];
                }
                int var15 = var12 >> 4;
                int var16 = var11 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var17 = var13 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                this.field591[var3] = class49.method377(class49.method377(var17 << 8, var16 << 16), var15);
            }
        }
        if (arg0 != -17185) {
            field586 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(BI)V")
    private final void method175(byte arg0, int arg1) {
        ++field587;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field588 = new int[4][4];
                                this.field588[0][0] = 2048;
                                this.field588[0][2] = 4096;
                                this.field588[0][3] = 0;
                                this.field588[0][1] = 0;
                                this.field588[1][0] = 2867;
                                this.field588[1][2] = 4096;
                                this.field588[2][0] = 3276;
                                this.field588[3][0] = 4096;
                                this.field588[1][3] = 0;
                                this.field588[1][1] = 4096;
                                this.field588[2][1] = 4096;
                                this.field588[2][2] = 4096;
                                this.field588[3][1] = 4096;
                                this.field588[3][2] = 0;
                                this.field588[2][3] = 0;
                                this.field588[3][3] = 0;
                            } else {
                                this.field588 = new int[16][4];
                                this.field588[0][2] = 192;
                                this.field588[0][0] = 0;
                                this.field588[0][3] = 321;
                                this.field588[1][2] = 449;
                                this.field588[1][0] = 155;
                                this.field588[1][3] = 562;
                                this.field588[2][3] = 803;
                                this.field588[0][1] = 80;
                                this.field588[1][1] = 321;
                                this.field588[2][1] = 578;
                                this.field588[2][0] = 389;
                                this.field588[2][2] = 690;
                                this.field588[3][2] = 995;
                                this.field588[3][1] = 947;
                                this.field588[3][3] = 1140;
                                this.field588[4][2] = 1397;
                                this.field588[5][2] = 1429;
                                this.field588[6][2] = 1461;
                                this.field588[4][1] = 1285;
                                this.field588[7][2] = 1525;
                                this.field588[5][1] = 1525;
                                this.field588[3][0] = 671;
                                this.field588[4][0] = 897;
                                this.field588[6][1] = 1734;
                                this.field588[7][1] = 1413;
                                this.field588[4][3] = 1509;
                                this.field588[8][1] = 1108;
                                this.field588[9][1] = 1766;
                                this.field588[8][2] = 1590;
                                this.field588[5][0] = 1175;
                                this.field588[10][1] = 2409;
                                this.field588[6][0] = 1368;
                                this.field588[7][0] = 1507;
                                this.field588[5][3] = 1413;
                                this.field588[9][2] = 2056;
                                this.field588[10][2] = 2586;
                                this.field588[11][1] = 3116;
                                this.field588[8][0] = 1736;
                                this.field588[11][2] = 3148;
                                this.field588[9][0] = 2088;
                                this.field588[10][0] = 2355;
                                this.field588[11][0] = 2691;
                                this.field588[12][0] = 3031;
                                this.field588[6][3] = 1333;
                                this.field588[7][3] = 1702;
                                this.field588[12][2] = 3710;
                                this.field588[12][1] = 3806;
                                this.field588[13][0] = 3522;
                                this.field588[13][2] = 3421;
                                this.field588[14][0] = 3727;
                                this.field588[15][0] = 4096;
                                this.field588[14][2] = 3148;
                                this.field588[13][1] = 3437;
                                this.field588[8][3] = 2056;
                                this.field588[15][2] = 2505;
                                this.field588[9][3] = 2666;
                                this.field588[14][1] = 3116;
                                this.field588[15][1] = 2377;
                                this.field588[10][3] = 3276;
                                this.field588[11][3] = 3228;
                                this.field588[12][3] = 3196;
                                this.field588[13][3] = 3019;
                                this.field588[14][3] = 3228;
                                this.field588[15][3] = 2746;
                            }
                        } else {
                            this.field588 = new int[6][4];
                            this.field588[0][0] = 0;
                            this.field588[0][3] = 0;
                            this.field588[0][1] = 0;
                            this.field588[0][2] = 0;
                            this.field588[1][0] = 1843;
                            this.field588[1][2] = 0;
                            this.field588[1][1] = 0;
                            this.field588[1][3] = 1493;
                            this.field588[2][3] = 2939;
                            this.field588[2][2] = 0;
                            this.field588[3][2] = 1124;
                            this.field588[2][0] = 2457;
                            this.field588[4][2] = 3084;
                            this.field588[3][0] = 2781;
                            this.field588[2][1] = 0;
                            this.field588[3][1] = 0;
                            this.field588[4][1] = 546;
                            this.field588[4][0] = 3481;
                            this.field588[5][1] = 4096;
                            this.field588[3][3] = 3565;
                            this.field588[4][3] = 4031;
                            this.field588[5][3] = 4096;
                            this.field588[5][2] = 4096;
                            this.field588[5][0] = 4096;
                        }
                    } else {
                        this.field588 = new int[7][4];
                        this.field588[0][2] = 0;
                        this.field588[0][1] = 0;
                        this.field588[0][3] = 4096;
                        this.field588[1][2] = 4096;
                        this.field588[1][1] = 0;
                        this.field588[2][1] = 0;
                        this.field588[0][0] = 0;
                        this.field588[3][1] = 4096;
                        this.field588[2][2] = 4096;
                        this.field588[3][2] = 4096;
                        this.field588[4][2] = 0;
                        this.field588[1][0] = 663;
                        this.field588[1][3] = 4096;
                        this.field588[4][1] = 4096;
                        this.field588[2][3] = 0;
                        this.field588[5][2] = 0;
                        this.field588[6][2] = 0;
                        this.field588[5][1] = 4096;
                        this.field588[6][1] = 0;
                        this.field588[2][0] = 1363;
                        this.field588[3][3] = 0;
                        this.field588[4][3] = 0;
                        this.field588[5][3] = 4096;
                        this.field588[6][3] = 4096;
                        this.field588[3][0] = 2048;
                        this.field588[4][0] = 2727;
                        this.field588[5][0] = 3411;
                        this.field588[6][0] = 4096;
                    }
                } else {
                    this.field588 = new int[8][4];
                    this.field588[0][2] = 2602;
                    this.field588[0][3] = 2361;
                    this.field588[0][1] = 2650;
                    this.field588[1][2] = 1799;
                    this.field588[1][3] = 1558;
                    this.field588[1][1] = 2313;
                    this.field588[0][0] = 0;
                    this.field588[2][1] = 2618;
                    this.field588[3][1] = 2296;
                    this.field588[2][3] = 1413;
                    this.field588[1][0] = 2867;
                    this.field588[2][2] = 1734;
                    this.field588[2][0] = 3072;
                    this.field588[4][1] = 2072;
                    this.field588[3][0] = 3276;
                    this.field588[5][1] = 2730;
                    this.field588[6][1] = 2232;
                    this.field588[7][1] = 1686;
                    this.field588[3][3] = 947;
                    this.field588[4][0] = 3481;
                    this.field588[4][3] = 722;
                    this.field588[3][2] = 1220;
                    this.field588[5][3] = 1766;
                    this.field588[4][2] = 963;
                    this.field588[6][3] = 915;
                    this.field588[5][0] = 3686;
                    this.field588[6][0] = 3891;
                    this.field588[7][3] = 1140;
                    this.field588[5][2] = 2152;
                    this.field588[6][2] = 1060;
                    this.field588[7][0] = 4096;
                    this.field588[7][2] = 1413;
                }
            } else {
                this.field588 = new int[2][4];
                this.field588[0][1] = 0;
                this.field588[0][3] = 0;
                this.field588[1][1] = 4096;
                this.field588[0][0] = 0;
                this.field588[1][3] = 4096;
                this.field588[1][0] = 4096;
                this.field588[0][2] = 0;
                this.field588[1][2] = 4096;
            }
        }
        if (arg0 != 50) {
            this.method29(76, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class24() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I")
    public static final int method176(int arg0, int arg1) {
        ++field583;
        if (arg1 != 4) {
            field585 = null;
        }
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (arg2 >= -16) {
            field590 = true;
        }
        ++field582;
        if (arg0 == 0) {
            int var4 = arg1.method1408((byte) -25);
            if (~var4 != -1) {
                this.method175((byte) 50, var4);
            } else {
                this.field588 = new int[arg1.method1408((byte) -127)][4];
                for (int var5 = 0; this.field588.length > var5; ++var5) {
                    this.field588[var5][0] = arg1.method1410(-123);
                    this.field588[var5][1] = arg1.method1408((byte) -125) << 4;
                    this.field588[var5][2] = arg1.method1408((byte) -68) << 4;
                    this.field588[var5][3] = arg1.method1408((byte) -33) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        ++field584;
        int[][] var3 = super.field4787.method1657(arg0, (byte) -93);
        int var4 = -50 / ((arg1 - 12) / 58);
        if (super.field4787.field4355) {
            int[] var5 = this.method1863(-91, 0, arg0);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; ~var9 > ~class176.field3200; ++var9) {
                int var10 = var5[var9] >> 4;
                if (~var10 > -1) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field591[var10];
                var7[var9] = class1.method5(var11 >> 12, 4080);
                var8[var9] = class1.method5(var11, 65280) >> 4;
                var6[var9] = class1.method5(var11 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 == 4095) {
            if (this.field588 == null) {
                this.method175((byte) 50, 1);
            }
            this.method174(-17185);
            ++field581;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field586[var1] = var0 / 4;
        }
        field595 = 0;
    }
}
