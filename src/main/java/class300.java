import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class300 extends class397 {

    @OriginalMember(owner = "client!td", name = "N", descriptor = "[I")
    private int[] field4352 = new int[257];

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field4350 = 0;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "Lum;")
    public static class347 field4355 = new class347();

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "[[I")
    private int[][] field4353;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)V")
    public static void method1810(boolean arg0) {
        field4355 = null;
        if (!arg0) {
            field4355 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (this.field4353 == null) {
            this.method1812(1, 61);
        }
        if (arg0 == 255) {
            ++field4358;
            this.method1811(0);
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class300() {
        super(1, false);
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    private final void method1811(int arg0) {
        ++field4354;
        int var2 = this.field4353.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~this.field4353[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field4353[var2 - 1];
                    var8 = var7[2];
                    var9 = var7[3];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field4353[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field4353[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                    } else {
                        var10 = var11[1];
                        var9 = var11[3];
                        var8 = var11[2];
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var8 >> 4;
                int var17 = var9 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field4352[var3] = class51.method379(class51.method379(var16 << 8, var15 << 16), var17);
            }
        }
        if (arg0 != 0) {
            this.field4353 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field4351;
        if (arg1 == 80) {
            if (~arg0 == -1) {
                int var4 = arg2.method941((byte) 126);
                if (~var4 != -1) {
                    this.method1812(var4, arg1 ^ 97);
                } else {
                    this.field4353 = new int[arg2.method941((byte) 123)][4];
                    for (int var5 = 0; this.field4353.length > var5; ++var5) {
                        this.field4353[var5][0] = arg2.method993((byte) -33);
                        this.field4353[var5][1] = arg2.method941((byte) 126) << 4;
                        this.field4353[var5][2] = arg2.method941((byte) 126) << 4;
                        this.field4353[var5][3] = arg2.method941((byte) 127) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V")
    private final void method1812(int arg0, int arg1) {
        ++field4356;
        if (arg1 > 44) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (arg0 == 6) {
                                        this.field4353 = new int[4][4];
                                        this.field4353[0][1] = 0;
                                        this.field4353[0][0] = 2048;
                                        this.field4353[0][2] = 4096;
                                        this.field4353[0][3] = 0;
                                        this.field4353[1][0] = 2867;
                                        this.field4353[1][1] = 4096;
                                        this.field4353[1][3] = 0;
                                        this.field4353[1][2] = 4096;
                                        this.field4353[2][2] = 4096;
                                        this.field4353[2][1] = 4096;
                                        this.field4353[2][3] = 0;
                                        this.field4353[2][0] = 3276;
                                        this.field4353[3][2] = 0;
                                        this.field4353[3][3] = 0;
                                        this.field4353[3][1] = 4096;
                                        this.field4353[3][0] = 4096;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field4353 = new int[16][4];
                                    this.field4353[0][3] = 321;
                                    this.field4353[0][0] = 0;
                                    this.field4353[0][2] = 192;
                                    this.field4353[0][1] = 80;
                                    this.field4353[1][3] = 562;
                                    this.field4353[1][0] = 155;
                                    this.field4353[1][1] = 321;
                                    this.field4353[1][2] = 449;
                                    this.field4353[2][3] = 803;
                                    this.field4353[2][0] = 389;
                                    this.field4353[2][2] = 690;
                                    this.field4353[2][1] = 578;
                                    this.field4353[3][3] = 1140;
                                    this.field4353[3][2] = 995;
                                    this.field4353[3][0] = 671;
                                    this.field4353[3][1] = 947;
                                    this.field4353[4][0] = 897;
                                    this.field4353[4][3] = 1509;
                                    this.field4353[4][1] = 1285;
                                    this.field4353[4][2] = 1397;
                                    this.field4353[5][0] = 1175;
                                    this.field4353[5][3] = 1413;
                                    this.field4353[5][2] = 1429;
                                    this.field4353[5][1] = 1525;
                                    this.field4353[6][0] = 1368;
                                    this.field4353[6][3] = 1333;
                                    this.field4353[6][2] = 1461;
                                    this.field4353[6][1] = 1734;
                                    this.field4353[7][1] = 1413;
                                    this.field4353[7][3] = 1702;
                                    this.field4353[7][0] = 1507;
                                    this.field4353[7][2] = 1525;
                                    this.field4353[8][2] = 1590;
                                    this.field4353[8][1] = 1108;
                                    this.field4353[8][0] = 1736;
                                    this.field4353[8][3] = 2056;
                                    this.field4353[9][3] = 2666;
                                    this.field4353[9][1] = 1766;
                                    this.field4353[9][2] = 2056;
                                    this.field4353[9][0] = 2088;
                                    this.field4353[10][0] = 2355;
                                    this.field4353[10][2] = 2586;
                                    this.field4353[10][1] = 2409;
                                    this.field4353[10][3] = 3276;
                                    this.field4353[11][3] = 3228;
                                    this.field4353[11][1] = 3116;
                                    this.field4353[11][2] = 3148;
                                    this.field4353[11][0] = 2691;
                                    this.field4353[12][3] = 3196;
                                    this.field4353[12][0] = 3031;
                                    this.field4353[12][2] = 3710;
                                    this.field4353[12][1] = 3806;
                                    this.field4353[13][1] = 3437;
                                    this.field4353[13][0] = 3522;
                                    this.field4353[13][2] = 3421;
                                    this.field4353[13][3] = 3019;
                                    this.field4353[14][3] = 3228;
                                    this.field4353[14][0] = 3727;
                                    this.field4353[14][1] = 3116;
                                    this.field4353[14][2] = 3148;
                                    this.field4353[15][2] = 2505;
                                    this.field4353[15][1] = 2377;
                                    this.field4353[15][3] = 2746;
                                    this.field4353[15][0] = 4096;
                                }
                            } else {
                                this.field4353 = new int[6][4];
                                this.field4353[0][1] = 0;
                                this.field4353[0][3] = 0;
                                this.field4353[0][2] = 0;
                                this.field4353[0][0] = 0;
                                this.field4353[1][2] = 0;
                                this.field4353[1][3] = 1493;
                                this.field4353[1][1] = 0;
                                this.field4353[1][0] = 1843;
                                this.field4353[2][2] = 0;
                                this.field4353[2][0] = 2457;
                                this.field4353[2][1] = 0;
                                this.field4353[2][3] = 2939;
                                this.field4353[3][0] = 2781;
                                this.field4353[3][3] = 3565;
                                this.field4353[3][2] = 1124;
                                this.field4353[3][1] = 0;
                                this.field4353[4][3] = 4031;
                                this.field4353[4][2] = 3084;
                                this.field4353[4][1] = 546;
                                this.field4353[4][0] = 3481;
                                this.field4353[5][1] = 4096;
                                this.field4353[5][0] = 4096;
                                this.field4353[5][3] = 4096;
                                this.field4353[5][2] = 4096;
                            }
                        } else {
                            this.field4353 = new int[7][4];
                            this.field4353[0][0] = 0;
                            this.field4353[0][3] = 4096;
                            this.field4353[0][1] = 0;
                            this.field4353[0][2] = 0;
                            this.field4353[1][2] = 4096;
                            this.field4353[1][3] = 4096;
                            this.field4353[1][1] = 0;
                            this.field4353[1][0] = 663;
                            this.field4353[2][3] = 0;
                            this.field4353[2][2] = 4096;
                            this.field4353[2][1] = 0;
                            this.field4353[2][0] = 1363;
                            this.field4353[3][0] = 2048;
                            this.field4353[3][1] = 4096;
                            this.field4353[3][2] = 4096;
                            this.field4353[3][3] = 0;
                            this.field4353[4][0] = 2727;
                            this.field4353[4][1] = 4096;
                            this.field4353[4][3] = 0;
                            this.field4353[4][2] = 0;
                            this.field4353[5][3] = 4096;
                            this.field4353[5][1] = 4096;
                            this.field4353[5][2] = 0;
                            this.field4353[5][0] = 3411;
                            this.field4353[6][3] = 4096;
                            this.field4353[6][1] = 0;
                            this.field4353[6][2] = 0;
                            this.field4353[6][0] = 4096;
                        }
                    } else {
                        this.field4353 = new int[8][4];
                        this.field4353[0][1] = 2650;
                        this.field4353[0][0] = 0;
                        this.field4353[0][3] = 2361;
                        this.field4353[0][2] = 2602;
                        this.field4353[1][2] = 1799;
                        this.field4353[1][1] = 2313;
                        this.field4353[1][3] = 1558;
                        this.field4353[1][0] = 2867;
                        this.field4353[2][0] = 3072;
                        this.field4353[2][3] = 1413;
                        this.field4353[2][1] = 2618;
                        this.field4353[2][2] = 1734;
                        this.field4353[3][3] = 947;
                        this.field4353[3][2] = 1220;
                        this.field4353[3][0] = 3276;
                        this.field4353[3][1] = 2296;
                        this.field4353[4][0] = 3481;
                        this.field4353[4][2] = 963;
                        this.field4353[4][1] = 2072;
                        this.field4353[4][3] = 722;
                        this.field4353[5][2] = 2152;
                        this.field4353[5][3] = 1766;
                        this.field4353[5][0] = 3686;
                        this.field4353[5][1] = 2730;
                        this.field4353[6][0] = 3891;
                        this.field4353[6][1] = 2232;
                        this.field4353[6][3] = 915;
                        this.field4353[6][2] = 1060;
                        this.field4353[7][3] = 1140;
                        this.field4353[7][0] = 4096;
                        this.field4353[7][1] = 1686;
                        this.field4353[7][2] = 1413;
                    }
                } else {
                    this.field4353 = new int[2][4];
                    this.field4353[0][3] = 0;
                    this.field4353[0][1] = 0;
                    this.field4353[0][2] = 0;
                    this.field4353[0][0] = 0;
                    this.field4353[1][1] = 4096;
                    this.field4353[1][0] = 4096;
                    this.field4353[1][3] = 4096;
                    this.field4353[1][2] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        if (arg0 <= 81) {
            return null;
        } else {
            ++field4357;
            int[][] var3 = super.field5848.method1692(arg1, 114);
            if (super.field5848.field3939) {
                int[] var4 = this.method2376(113, 0, arg1);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; ~var8 > ~class164.field2152; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field4352[var9];
                    var5[var8] = class500.method3013(var10 >> 12, 4080);
                    var6[var8] = class500.method3013(var10, 65280) >> 4;
                    var7[var8] = class500.method3013(4080, var10 << 4);
                }
            }
            return var3;
        }
    }

    static {
        new class194("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
