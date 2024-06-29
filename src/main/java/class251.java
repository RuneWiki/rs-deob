import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class251 extends class210 {

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "[I")
    private int[] field3686 = new int[257];

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "[I")
    public static int[] field3685 = new int[13];

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "[C")
    public static char[] field3688 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "S")
    public static short field3693 = 205;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "[I")
    public static int[] field3695 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "Lct;")
    public static class104 field3689;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "Lm;")
    public static class187 field3696;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "Lvq;")
    public static class24 field3687;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "[[I")
    private int[][] field3694;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[[I", line = 5)
    public final int[][] method58(int arg0, int arg1) {
        if (arg1 < 94) {
            method1661(false);
        }
        ++field3690;
        int[][] var3 = super.field2967.method1572(124, arg0);
        if (super.field2967.field3454) {
            int[] var4 = this.method1447(arg0, -124, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class202.field2852 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3686[var9];
                var5[var8] = class386.method2438(4080, var10 >> 12);
                var6[var8] = class386.method2438(var10, 65280) >> 4;
                var7[var8] = class386.method2438(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V", line = 66)
    public final void method363(int arg0) {
        if (arg0 != 0) {
            this.method363(17);
        }
        ++field3692;
        if (this.field3694 == null) {
            this.method1659((byte) 116, 1);
        }
        this.method1660(true);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILat;)V", line = 83)
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field3691;
        if (arg1 != -11941) {
            field3689 = null;
        }
        if (~arg0 == -1) {
            int var4 = arg2.method1738((byte) 109);
            if (~var4 != -1) {
                this.method1659((byte) 116, var4);
            } else {
                this.field3694 = new int[arg2.method1738((byte) -65)][4];
                for (int var5 = 0; ~this.field3694.length < ~var5; ++var5) {
                    this.field3694[var5][0] = arg2.method1767(1930493576);
                    this.field3694[var5][1] = arg2.method1738((byte) -59) << 4;
                    this.field3694[var5][2] = arg2.method1738((byte) -82) << 4;
                    this.field3694[var5][3] = arg2.method1738((byte) -57) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V", line = 121)
    private final void method1659(byte arg0, int arg1) {
        ++field3697;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3694 = new int[4][4];
                                this.field3694[0][1] = 0;
                                this.field3694[0][2] = 4096;
                                this.field3694[0][0] = 2048;
                                this.field3694[0][3] = 0;
                                this.field3694[1][2] = 4096;
                                this.field3694[1][1] = 4096;
                                this.field3694[1][0] = 2867;
                                this.field3694[1][3] = 0;
                                this.field3694[2][2] = 4096;
                                this.field3694[2][0] = 3276;
                                this.field3694[2][3] = 0;
                                this.field3694[2][1] = 4096;
                                this.field3694[3][3] = 0;
                                this.field3694[3][0] = 4096;
                                this.field3694[3][2] = 0;
                                this.field3694[3][1] = 4096;
                            } else {
                                this.field3694 = new int[16][4];
                                this.field3694[0][0] = 0;
                                this.field3694[0][3] = 321;
                                this.field3694[0][1] = 80;
                                this.field3694[0][2] = 192;
                                this.field3694[1][3] = 562;
                                this.field3694[1][1] = 321;
                                this.field3694[1][0] = 155;
                                this.field3694[1][2] = 449;
                                this.field3694[2][1] = 578;
                                this.field3694[2][3] = 803;
                                this.field3694[2][0] = 389;
                                this.field3694[2][2] = 690;
                                this.field3694[3][3] = 1140;
                                this.field3694[3][2] = 995;
                                this.field3694[3][0] = 671;
                                this.field3694[3][1] = 947;
                                this.field3694[4][2] = 1397;
                                this.field3694[4][0] = 897;
                                this.field3694[4][3] = 1509;
                                this.field3694[4][1] = 1285;
                                this.field3694[5][1] = 1525;
                                this.field3694[5][0] = 1175;
                                this.field3694[5][2] = 1429;
                                this.field3694[5][3] = 1413;
                                this.field3694[6][2] = 1461;
                                this.field3694[6][3] = 1333;
                                this.field3694[6][0] = 1368;
                                this.field3694[6][1] = 1734;
                                this.field3694[7][2] = 1525;
                                this.field3694[7][3] = 1702;
                                this.field3694[7][1] = 1413;
                                this.field3694[7][0] = 1507;
                                this.field3694[8][3] = 2056;
                                this.field3694[8][0] = 1736;
                                this.field3694[8][1] = 1108;
                                this.field3694[8][2] = 1590;
                                this.field3694[9][3] = 2666;
                                this.field3694[9][2] = 2056;
                                this.field3694[9][1] = 1766;
                                this.field3694[9][0] = 2088;
                                this.field3694[10][3] = 3276;
                                this.field3694[10][1] = 2409;
                                this.field3694[10][2] = 2586;
                                this.field3694[10][0] = 2355;
                                this.field3694[11][0] = 2691;
                                this.field3694[11][2] = 3148;
                                this.field3694[11][3] = 3228;
                                this.field3694[11][1] = 3116;
                                this.field3694[12][1] = 3806;
                                this.field3694[12][0] = 3031;
                                this.field3694[12][2] = 3710;
                                this.field3694[12][3] = 3196;
                                this.field3694[13][0] = 3522;
                                this.field3694[13][2] = 3421;
                                this.field3694[13][1] = 3437;
                                this.field3694[13][3] = 3019;
                                this.field3694[14][3] = 3228;
                                this.field3694[14][1] = 3116;
                                this.field3694[14][2] = 3148;
                                this.field3694[14][0] = 3727;
                                this.field3694[15][1] = 2377;
                                this.field3694[15][0] = 4096;
                                this.field3694[15][3] = 2746;
                                this.field3694[15][2] = 2505;
                            }
                        } else {
                            this.field3694 = new int[6][4];
                            this.field3694[0][0] = 0;
                            this.field3694[0][3] = 0;
                            this.field3694[0][2] = 0;
                            this.field3694[0][1] = 0;
                            this.field3694[1][0] = 1843;
                            this.field3694[1][1] = 0;
                            this.field3694[1][2] = 0;
                            this.field3694[1][3] = 1493;
                            this.field3694[2][1] = 0;
                            this.field3694[2][2] = 0;
                            this.field3694[2][0] = 2457;
                            this.field3694[2][3] = 2939;
                            this.field3694[3][0] = 2781;
                            this.field3694[3][3] = 3565;
                            this.field3694[3][2] = 1124;
                            this.field3694[3][1] = 0;
                            this.field3694[4][0] = 3481;
                            this.field3694[4][2] = 3084;
                            this.field3694[4][3] = 4031;
                            this.field3694[4][1] = 546;
                            this.field3694[5][0] = 4096;
                            this.field3694[5][1] = 4096;
                            this.field3694[5][3] = 4096;
                            this.field3694[5][2] = 4096;
                        }
                    } else {
                        this.field3694 = new int[7][4];
                        this.field3694[0][3] = 4096;
                        this.field3694[0][0] = 0;
                        this.field3694[0][2] = 0;
                        this.field3694[0][1] = 0;
                        this.field3694[1][1] = 0;
                        this.field3694[1][2] = 4096;
                        this.field3694[1][0] = 663;
                        this.field3694[1][3] = 4096;
                        this.field3694[2][0] = 1363;
                        this.field3694[2][3] = 0;
                        this.field3694[2][2] = 4096;
                        this.field3694[2][1] = 0;
                        this.field3694[3][2] = 4096;
                        this.field3694[3][1] = 4096;
                        this.field3694[3][0] = 2048;
                        this.field3694[3][3] = 0;
                        this.field3694[4][2] = 0;
                        this.field3694[4][1] = 4096;
                        this.field3694[4][0] = 2727;
                        this.field3694[4][3] = 0;
                        this.field3694[5][1] = 4096;
                        this.field3694[5][2] = 0;
                        this.field3694[5][0] = 3411;
                        this.field3694[5][3] = 4096;
                        this.field3694[6][1] = 0;
                        this.field3694[6][2] = 0;
                        this.field3694[6][0] = 4096;
                        this.field3694[6][3] = 4096;
                    }
                } else {
                    this.field3694 = new int[8][4];
                    this.field3694[0][3] = 2361;
                    this.field3694[0][1] = 2650;
                    this.field3694[0][2] = 2602;
                    this.field3694[0][0] = 0;
                    this.field3694[1][0] = 2867;
                    this.field3694[1][2] = 1799;
                    this.field3694[1][1] = 2313;
                    this.field3694[1][3] = 1558;
                    this.field3694[2][0] = 3072;
                    this.field3694[2][2] = 1734;
                    this.field3694[2][1] = 2618;
                    this.field3694[2][3] = 1413;
                    this.field3694[3][2] = 1220;
                    this.field3694[3][1] = 2296;
                    this.field3694[3][0] = 3276;
                    this.field3694[3][3] = 947;
                    this.field3694[4][2] = 963;
                    this.field3694[4][3] = 722;
                    this.field3694[4][0] = 3481;
                    this.field3694[4][1] = 2072;
                    this.field3694[5][1] = 2730;
                    this.field3694[5][0] = 3686;
                    this.field3694[5][3] = 1766;
                    this.field3694[5][2] = 2152;
                    this.field3694[6][1] = 2232;
                    this.field3694[6][0] = 3891;
                    this.field3694[6][2] = 1060;
                    this.field3694[6][3] = 915;
                    this.field3694[7][3] = 1140;
                    this.field3694[7][2] = 1413;
                    this.field3694[7][1] = 1686;
                    this.field3694[7][0] = 4096;
                }
            } else {
                this.field3694 = new int[2][4];
                this.field3694[0][1] = 0;
                this.field3694[0][0] = 0;
                this.field3694[0][2] = 0;
                this.field3694[0][3] = 0;
                this.field3694[1][2] = 4096;
                this.field3694[1][3] = 4096;
                this.field3694[1][1] = 4096;
                this.field3694[1][0] = 4096;
            }
        }
        if (arg0 != 116) {
            this.method363(-115);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V", line = 376)
    private final void method1660(boolean arg0) {
        ++field3684;
        if (!arg0) {
            this.method1659((byte) -15, -17);
        }
        int var2 = this.field3694.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && ~var5 <= ~this.field3694[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var4 > ~var2) {
                    int[] var7 = this.field3694[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field3694[var4 + -1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                    } else {
                        var12 = var7[3];
                        var11 = var7[1];
                        var13 = var7[2];
                    }
                } else {
                    int[] var14 = this.field3694[var2 + -1];
                    var12 = var14[3];
                    var11 = var14[1];
                    var13 = var14[2];
                }
                int var15 = var12 >> 4;
                int var16 = var13 >> 4;
                int var17 = var11 >> 4;
                if (~var15 <= -1) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field3686[var3] = class259.method1785(class259.method1785(var17 << 16, var16 << 8), var15);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 485)
    public class251() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(Z)V", line = 488)
    public static void method1661(boolean arg0) {
        field3696 = null;
        field3689 = null;
        field3687 = null;
        field3685 = null;
        field3695 = null;
        if (!arg0) {
            method1661(true);
        }
        field3688 = null;
    }
}
