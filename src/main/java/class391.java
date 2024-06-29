import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class391 extends class346 {

    @OriginalMember(owner = "client!og", name = "O", descriptor = "[I")
    private int[] field5715 = new int[257];

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field5710 = 0;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field5714 = 0;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Lir;")
    public static class185 field5716;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "[[I")
    private int[][] field5717;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 3)
    public final void method237(byte arg0) {
        if (this.field5717 == null) {
            this.method2523((byte) 87, 1);
        }
        ++field5708;
        if (arg0 <= -95) {
            this.method2522(118);
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(Z)V", line = 18)
    public static final void method2520(boolean arg0) {
        if (!arg0) {
            method2520(false);
        }
        class398.field5839.method372(119);
        ++field5709;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 34)
    public class391() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V", line = 45)
    public static void method2521(byte arg0) {
        field5716 = null;
        if (arg0 != 35) {
            method2521((byte) -26);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lfb;ZI)V", line = 67)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field5711;
        if (!arg1) {
            if (~arg2 == -1) {
                int var4 = arg0.method2233((byte) 104);
                if (~var4 != -1) {
                    this.method2523((byte) 109, var4);
                } else {
                    this.field5717 = new int[arg0.method2233((byte) 104)][4];
                    for (int var5 = 0; ~var5 > ~this.field5717.length; ++var5) {
                        this.field5717[var5][0] = arg0.method2239(-1076227960);
                        this.field5717[var5][1] = arg0.method2233((byte) 104) << 4;
                        this.field5717[var5][2] = arg0.method2233((byte) 104) << 4;
                        this.field5717[var5][3] = arg0.method2233((byte) 104) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V", line = 109)
    private final void method2522(int arg0) {
        if (arg0 > 112) {
            ++field5712;
            int var2 = this.field5717.length;
            if (~var2 < -1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && ~this.field5717[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 > var4) {
                        int[] var7 = this.field5717[var4];
                        if (~var4 >= -1) {
                            var8 = var7[1];
                            var9 = var7[2];
                            var10 = var7[3];
                        } else {
                            int[] var11 = this.field5717[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var9 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                            var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                            var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field5717[var2 + -1];
                        var8 = var14[1];
                        var9 = var14[2];
                        var10 = var14[3];
                    }
                    int var15 = var9 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var10 >> 4;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -256) {
                        var15 = 255;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 255) {
                        var17 = 255;
                    }
                    if (var16 >= 0) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    this.field5715[var3] = class258.method1708(class258.method1708(var15 << 8, var16 << 16), var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)V", line = 211)
    private final void method2523(byte arg0, int arg1) {
        ++field5718;
        if (arg0 <= 79) {
            method2521((byte) 91);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field5717 = new int[4][4];
                                    this.field5717[0][0] = 2048;
                                    this.field5717[0][3] = 0;
                                    this.field5717[0][2] = 4096;
                                    this.field5717[0][1] = 0;
                                    this.field5717[1][0] = 2867;
                                    this.field5717[1][2] = 4096;
                                    this.field5717[1][3] = 0;
                                    this.field5717[1][1] = 4096;
                                    this.field5717[2][3] = 0;
                                    this.field5717[2][1] = 4096;
                                    this.field5717[2][2] = 4096;
                                    this.field5717[2][0] = 3276;
                                    this.field5717[3][1] = 4096;
                                    this.field5717[3][2] = 0;
                                    this.field5717[3][3] = 0;
                                    this.field5717[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field5717 = new int[16][4];
                                this.field5717[0][1] = 80;
                                this.field5717[0][3] = 321;
                                this.field5717[0][0] = 0;
                                this.field5717[0][2] = 192;
                                this.field5717[1][2] = 449;
                                this.field5717[1][1] = 321;
                                this.field5717[1][0] = 155;
                                this.field5717[1][3] = 562;
                                this.field5717[2][2] = 690;
                                this.field5717[2][0] = 389;
                                this.field5717[2][3] = 803;
                                this.field5717[2][1] = 578;
                                this.field5717[3][0] = 671;
                                this.field5717[3][1] = 947;
                                this.field5717[3][2] = 995;
                                this.field5717[3][3] = 1140;
                                this.field5717[4][1] = 1285;
                                this.field5717[4][2] = 1397;
                                this.field5717[4][0] = 897;
                                this.field5717[4][3] = 1509;
                                this.field5717[5][1] = 1525;
                                this.field5717[5][2] = 1429;
                                this.field5717[5][3] = 1413;
                                this.field5717[5][0] = 1175;
                                this.field5717[6][2] = 1461;
                                this.field5717[6][0] = 1368;
                                this.field5717[6][1] = 1734;
                                this.field5717[6][3] = 1333;
                                this.field5717[7][2] = 1525;
                                this.field5717[7][1] = 1413;
                                this.field5717[7][0] = 1507;
                                this.field5717[7][3] = 1702;
                                this.field5717[8][1] = 1108;
                                this.field5717[8][0] = 1736;
                                this.field5717[8][2] = 1590;
                                this.field5717[8][3] = 2056;
                                this.field5717[9][0] = 2088;
                                this.field5717[9][3] = 2666;
                                this.field5717[9][1] = 1766;
                                this.field5717[9][2] = 2056;
                                this.field5717[10][1] = 2409;
                                this.field5717[10][3] = 3276;
                                this.field5717[10][0] = 2355;
                                this.field5717[10][2] = 2586;
                                this.field5717[11][3] = 3228;
                                this.field5717[11][1] = 3116;
                                this.field5717[11][0] = 2691;
                                this.field5717[11][2] = 3148;
                                this.field5717[12][1] = 3806;
                                this.field5717[12][2] = 3710;
                                this.field5717[12][0] = 3031;
                                this.field5717[12][3] = 3196;
                                this.field5717[13][1] = 3437;
                                this.field5717[13][0] = 3522;
                                this.field5717[13][3] = 3019;
                                this.field5717[13][2] = 3421;
                                this.field5717[14][1] = 3116;
                                this.field5717[14][0] = 3727;
                                this.field5717[14][3] = 3228;
                                this.field5717[14][2] = 3148;
                                this.field5717[15][3] = 2746;
                                this.field5717[15][2] = 2505;
                                this.field5717[15][0] = 4096;
                                this.field5717[15][1] = 2377;
                            }
                        } else {
                            this.field5717 = new int[6][4];
                            this.field5717[0][0] = 0;
                            this.field5717[0][3] = 0;
                            this.field5717[0][2] = 0;
                            this.field5717[0][1] = 0;
                            this.field5717[1][3] = 1493;
                            this.field5717[1][1] = 0;
                            this.field5717[1][0] = 1843;
                            this.field5717[1][2] = 0;
                            this.field5717[2][0] = 2457;
                            this.field5717[2][3] = 2939;
                            this.field5717[2][1] = 0;
                            this.field5717[2][2] = 0;
                            this.field5717[3][2] = 1124;
                            this.field5717[3][1] = 0;
                            this.field5717[3][0] = 2781;
                            this.field5717[3][3] = 3565;
                            this.field5717[4][0] = 3481;
                            this.field5717[4][1] = 546;
                            this.field5717[4][2] = 3084;
                            this.field5717[4][3] = 4031;
                            this.field5717[5][3] = 4096;
                            this.field5717[5][0] = 4096;
                            this.field5717[5][2] = 4096;
                            this.field5717[5][1] = 4096;
                        }
                    } else {
                        this.field5717 = new int[7][4];
                        this.field5717[0][3] = 4096;
                        this.field5717[0][1] = 0;
                        this.field5717[0][0] = 0;
                        this.field5717[0][2] = 0;
                        this.field5717[1][2] = 4096;
                        this.field5717[1][0] = 663;
                        this.field5717[1][3] = 4096;
                        this.field5717[1][1] = 0;
                        this.field5717[2][2] = 4096;
                        this.field5717[2][3] = 0;
                        this.field5717[2][0] = 1363;
                        this.field5717[2][1] = 0;
                        this.field5717[3][3] = 0;
                        this.field5717[3][0] = 2048;
                        this.field5717[3][1] = 4096;
                        this.field5717[3][2] = 4096;
                        this.field5717[4][2] = 0;
                        this.field5717[4][3] = 0;
                        this.field5717[4][1] = 4096;
                        this.field5717[4][0] = 2727;
                        this.field5717[5][3] = 4096;
                        this.field5717[5][0] = 3411;
                        this.field5717[5][1] = 4096;
                        this.field5717[5][2] = 0;
                        this.field5717[6][0] = 4096;
                        this.field5717[6][3] = 4096;
                        this.field5717[6][1] = 0;
                        this.field5717[6][2] = 0;
                    }
                } else {
                    this.field5717 = new int[8][4];
                    this.field5717[0][1] = 2650;
                    this.field5717[0][3] = 2361;
                    this.field5717[0][2] = 2602;
                    this.field5717[0][0] = 0;
                    this.field5717[1][2] = 1799;
                    this.field5717[1][0] = 2867;
                    this.field5717[1][3] = 1558;
                    this.field5717[1][1] = 2313;
                    this.field5717[2][1] = 2618;
                    this.field5717[2][2] = 1734;
                    this.field5717[2][0] = 3072;
                    this.field5717[2][3] = 1413;
                    this.field5717[3][3] = 947;
                    this.field5717[3][2] = 1220;
                    this.field5717[3][0] = 3276;
                    this.field5717[3][1] = 2296;
                    this.field5717[4][1] = 2072;
                    this.field5717[4][0] = 3481;
                    this.field5717[4][3] = 722;
                    this.field5717[4][2] = 963;
                    this.field5717[5][1] = 2730;
                    this.field5717[5][2] = 2152;
                    this.field5717[5][3] = 1766;
                    this.field5717[5][0] = 3686;
                    this.field5717[6][2] = 1060;
                    this.field5717[6][1] = 2232;
                    this.field5717[6][0] = 3891;
                    this.field5717[6][3] = 915;
                    this.field5717[7][2] = 1413;
                    this.field5717[7][3] = 1140;
                    this.field5717[7][0] = 4096;
                    this.field5717[7][1] = 1686;
                }
            } else {
                this.field5717 = new int[2][4];
                this.field5717[0][0] = 0;
                this.field5717[0][3] = 0;
                this.field5717[0][1] = 0;
                this.field5717[0][2] = 0;
                this.field5717[1][1] = 4096;
                this.field5717[1][2] = 4096;
                this.field5717[1][3] = 4096;
                this.field5717[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)[[I", line = 464)
    public final int[][] method287(int arg0, int arg1) {
        ++field5713;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (arg1 >= -3) {
            this.field5715 = null;
        }
        if (super.field5170.field6288) {
            int[] var4 = this.method2294((byte) 54, arg0, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class134.field1753; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field5715[var9];
                var5[var8] = class394.method2529(var10 >> 12, 4080);
                var6[var8] = class394.method2529(var10 >> 4, 4080);
                var7[var8] = class394.method2529(255, var10) << 4;
            }
        }
        return var3;
    }
}
