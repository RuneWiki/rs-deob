import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class100 extends class478 {

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "[I")
    private int[] field1081 = new int[257];

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
    public static int field1076 = -1;

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "Lbp;")
    public static class88 field1077;

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "[[I")
    private int[][] field1080;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lnp;I)Lur;")
    public static final class393 method540(class115 arg0, int arg1) {
        ++field1073;
        int var2 = arg0.method620((byte) -128);
        if (arg1 != 11312) {
            field1077 = null;
        }
        class240 var3 = class579.method3275(0)[arg0.method620((byte) -128)];
        class648 var4 = class564.method3198(arg1 + 14312)[arg0.method620((byte) 12)];
        int var5 = arg0.method676(-5);
        int var6 = arg0.method676(-5);
        int var7 = arg0.method643((byte) -77);
        int var8 = arg0.method643((byte) -77);
        int var9 = arg0.method631(false);
        int var10 = arg0.method631(false);
        int var11 = arg0.method631(false);
        boolean var12 = ~arg0.method620((byte) -126) == -2;
        return new class393(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        ++field1072;
        int[][] var3 = super.field6889.method2091(70, arg1);
        if (!arg0) {
            field1076 = -79;
        }
        if (super.field6889.field4765) {
            int[] var4 = this.method2752(arg1, 122, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class436.field6154 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1081[var9];
                var5[var8] = class105.method572(var10, 16711680) >> 12;
                var6[var8] = class105.method572(var10 >> 4, 4080);
                var7[var8] = class105.method572(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
    public final void method34(byte arg0) {
        if (this.field1080 == null) {
            this.method542(false, 1);
        }
        ++field1078;
        this.method541(4);
        if (arg0 != 23) {
            this.field1080 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)V")
    private final void method541(int arg0) {
        ++field1075;
        if (arg0 == 4) {
            int var2 = this.field1080.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field1080[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var4 <= ~var2) {
                        int[] var7 = this.field1080[var2 - 1];
                        var8 = var7[3];
                        var9 = var7[1];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field1080[var4];
                        if (~var4 >= -1) {
                            var9 = var11[1];
                            var8 = var11[3];
                            var10 = var11[2];
                        } else {
                            int[] var12 = this.field1080[var4 - 1];
                            int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                            int var14 = 4096 - var13;
                            var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                            var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                        }
                    }
                    int var15 = var10 >> 4;
                    int var16 = var9 >> 4;
                    int var17 = var8 >> 4;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    if (~var15 <= -1) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    this.field1081[var3] = class422.method2436(class422.method2436(var15 << 8, var16 << 16), var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(ZI)V")
    private final void method542(boolean arg0, int arg1) {
        if (!arg0) {
            ++field1082;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (arg1 != 5) {
                                    if (arg1 == 6) {
                                        this.field1080 = new int[4][4];
                                        this.field1080[0][2] = 4096;
                                        this.field1080[0][1] = 0;
                                        this.field1080[0][0] = 2048;
                                        this.field1080[0][3] = 0;
                                        this.field1080[1][3] = 0;
                                        this.field1080[1][0] = 2867;
                                        this.field1080[1][1] = 4096;
                                        this.field1080[1][2] = 4096;
                                        this.field1080[2][2] = 4096;
                                        this.field1080[2][3] = 0;
                                        this.field1080[2][1] = 4096;
                                        this.field1080[2][0] = 3276;
                                        this.field1080[3][1] = 4096;
                                        this.field1080[3][2] = 0;
                                        this.field1080[3][0] = 4096;
                                        this.field1080[3][3] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field1080 = new int[16][4];
                                    this.field1080[0][1] = 80;
                                    this.field1080[0][2] = 192;
                                    this.field1080[0][0] = 0;
                                    this.field1080[0][3] = 321;
                                    this.field1080[1][3] = 562;
                                    this.field1080[1][1] = 321;
                                    this.field1080[1][0] = 155;
                                    this.field1080[1][2] = 449;
                                    this.field1080[2][0] = 389;
                                    this.field1080[2][3] = 803;
                                    this.field1080[2][2] = 690;
                                    this.field1080[2][1] = 578;
                                    this.field1080[3][2] = 995;
                                    this.field1080[3][3] = 1140;
                                    this.field1080[3][1] = 947;
                                    this.field1080[3][0] = 671;
                                    this.field1080[4][0] = 897;
                                    this.field1080[4][1] = 1285;
                                    this.field1080[4][2] = 1397;
                                    this.field1080[4][3] = 1509;
                                    this.field1080[5][0] = 1175;
                                    this.field1080[5][2] = 1429;
                                    this.field1080[5][1] = 1525;
                                    this.field1080[5][3] = 1413;
                                    this.field1080[6][3] = 1333;
                                    this.field1080[6][0] = 1368;
                                    this.field1080[6][2] = 1461;
                                    this.field1080[6][1] = 1734;
                                    this.field1080[7][3] = 1702;
                                    this.field1080[7][1] = 1413;
                                    this.field1080[7][2] = 1525;
                                    this.field1080[7][0] = 1507;
                                    this.field1080[8][1] = 1108;
                                    this.field1080[8][2] = 1590;
                                    this.field1080[8][0] = 1736;
                                    this.field1080[8][3] = 2056;
                                    this.field1080[9][1] = 1766;
                                    this.field1080[9][2] = 2056;
                                    this.field1080[9][3] = 2666;
                                    this.field1080[9][0] = 2088;
                                    this.field1080[10][0] = 2355;
                                    this.field1080[10][1] = 2409;
                                    this.field1080[10][3] = 3276;
                                    this.field1080[10][2] = 2586;
                                    this.field1080[11][0] = 2691;
                                    this.field1080[11][3] = 3228;
                                    this.field1080[11][1] = 3116;
                                    this.field1080[11][2] = 3148;
                                    this.field1080[12][2] = 3710;
                                    this.field1080[12][1] = 3806;
                                    this.field1080[12][0] = 3031;
                                    this.field1080[12][3] = 3196;
                                    this.field1080[13][2] = 3421;
                                    this.field1080[13][1] = 3437;
                                    this.field1080[13][3] = 3019;
                                    this.field1080[13][0] = 3522;
                                    this.field1080[14][3] = 3228;
                                    this.field1080[14][1] = 3116;
                                    this.field1080[14][2] = 3148;
                                    this.field1080[14][0] = 3727;
                                    this.field1080[15][0] = 4096;
                                    this.field1080[15][1] = 2377;
                                    this.field1080[15][2] = 2505;
                                    this.field1080[15][3] = 2746;
                                }
                            } else {
                                this.field1080 = new int[6][4];
                                this.field1080[0][0] = 0;
                                this.field1080[0][3] = 0;
                                this.field1080[0][2] = 0;
                                this.field1080[0][1] = 0;
                                this.field1080[1][1] = 0;
                                this.field1080[1][3] = 1493;
                                this.field1080[1][2] = 0;
                                this.field1080[1][0] = 1843;
                                this.field1080[2][1] = 0;
                                this.field1080[2][0] = 2457;
                                this.field1080[2][3] = 2939;
                                this.field1080[2][2] = 0;
                                this.field1080[3][2] = 1124;
                                this.field1080[3][0] = 2781;
                                this.field1080[3][1] = 0;
                                this.field1080[3][3] = 3565;
                                this.field1080[4][2] = 3084;
                                this.field1080[4][3] = 4031;
                                this.field1080[4][1] = 546;
                                this.field1080[4][0] = 3481;
                                this.field1080[5][2] = 4096;
                                this.field1080[5][1] = 4096;
                                this.field1080[5][3] = 4096;
                                this.field1080[5][0] = 4096;
                            }
                        } else {
                            this.field1080 = new int[7][4];
                            this.field1080[0][2] = 0;
                            this.field1080[0][0] = 0;
                            this.field1080[0][1] = 0;
                            this.field1080[0][3] = 4096;
                            this.field1080[1][2] = 4096;
                            this.field1080[1][1] = 0;
                            this.field1080[1][0] = 663;
                            this.field1080[1][3] = 4096;
                            this.field1080[2][3] = 0;
                            this.field1080[2][0] = 1363;
                            this.field1080[2][2] = 4096;
                            this.field1080[2][1] = 0;
                            this.field1080[3][0] = 2048;
                            this.field1080[3][2] = 4096;
                            this.field1080[3][1] = 4096;
                            this.field1080[3][3] = 0;
                            this.field1080[4][2] = 0;
                            this.field1080[4][1] = 4096;
                            this.field1080[4][0] = 2727;
                            this.field1080[4][3] = 0;
                            this.field1080[5][0] = 3411;
                            this.field1080[5][3] = 4096;
                            this.field1080[5][2] = 0;
                            this.field1080[5][1] = 4096;
                            this.field1080[6][1] = 0;
                            this.field1080[6][2] = 0;
                            this.field1080[6][3] = 4096;
                            this.field1080[6][0] = 4096;
                        }
                    } else {
                        this.field1080 = new int[8][4];
                        this.field1080[0][0] = 0;
                        this.field1080[0][1] = 2650;
                        this.field1080[0][2] = 2602;
                        this.field1080[0][3] = 2361;
                        this.field1080[1][0] = 2867;
                        this.field1080[1][3] = 1558;
                        this.field1080[1][1] = 2313;
                        this.field1080[1][2] = 1799;
                        this.field1080[2][2] = 1734;
                        this.field1080[2][1] = 2618;
                        this.field1080[2][3] = 1413;
                        this.field1080[2][0] = 3072;
                        this.field1080[3][0] = 3276;
                        this.field1080[3][3] = 947;
                        this.field1080[3][2] = 1220;
                        this.field1080[3][1] = 2296;
                        this.field1080[4][0] = 3481;
                        this.field1080[4][2] = 963;
                        this.field1080[4][1] = 2072;
                        this.field1080[4][3] = 722;
                        this.field1080[5][0] = 3686;
                        this.field1080[5][2] = 2152;
                        this.field1080[5][3] = 1766;
                        this.field1080[5][1] = 2730;
                        this.field1080[6][1] = 2232;
                        this.field1080[6][0] = 3891;
                        this.field1080[6][2] = 1060;
                        this.field1080[6][3] = 915;
                        this.field1080[7][1] = 1686;
                        this.field1080[7][2] = 1413;
                        this.field1080[7][3] = 1140;
                        this.field1080[7][0] = 4096;
                    }
                } else {
                    this.field1080 = new int[2][4];
                    this.field1080[0][3] = 0;
                    this.field1080[0][1] = 0;
                    this.field1080[0][0] = 0;
                    this.field1080[0][2] = 0;
                    this.field1080[1][1] = 4096;
                    this.field1080[1][2] = 4096;
                    this.field1080[1][0] = 4096;
                    this.field1080[1][3] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)V")
    public static void method543(int arg0) {
        field1077 = null;
        int var1 = -37 / ((-32 - arg0) / 45);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 != 255) {
            method540((class115) null, -48);
        }
        ++field1074;
        if (~arg2 == -1) {
            int var4 = arg1.method620((byte) 9);
            if (~var4 != -1) {
                this.method542(false, var4);
            } else {
                this.field1080 = new int[arg1.method620((byte) 118)][4];
                for (int var5 = 0; var5 < this.field1080.length; ++var5) {
                    this.field1080[var5][0] = arg1.method643((byte) -77);
                    this.field1080[var5][1] = arg1.method620((byte) -34) << 4;
                    this.field1080[var5][2] = arg1.method620((byte) 74) << 4;
                    this.field1080[var5][3] = arg1.method620((byte) -41) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BII)I")
    public static final int method544(byte arg0, int arg1, int arg2) {
        int var3 = (127 & arg1) * arg2 >> 7;
        ++field1083;
        if (~var3 > -3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        int var4 = -103 % ((-23 - arg0) / 36);
        return (65408 & arg1) + var3;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "()V")
    public class100() {
        super(1, false);
    }
}
