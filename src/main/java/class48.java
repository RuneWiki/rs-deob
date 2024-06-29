import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class48 extends class276 {

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "[I")
    private int[] field837 = new int[257];

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "Lck;")
    public static class1 field832 = new class1(16);

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "Ljava/lang/String;")
    public static String field835 = "flash3:";

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field839 = 0;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "[I")
    public static int[] field840;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "[[I")
    private int[][] field844;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V")
    public static void method298(byte arg0) {
        field835 = null;
        if (arg0 > 25) {
            field840 = null;
            field832 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    private final void method299(boolean arg0) {
        ++field836;
        int var2 = this.field844.length;
        if (!arg0) {
            field840 = null;
        }
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && ~this.field844[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 < var2) {
                    int[] var7 = this.field844[var4];
                    if (var4 <= 0) {
                        var8 = var7[1];
                        var9 = var7[3];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field844[var4 + -1];
                        int var12 = (var5 - var11[0] << 12) / (var7[0] - var11[0]);
                        int var13 = 4096 - var12;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var9 = var7[3] * var12 + var11[3] * var13 >> 12;
                        var10 = var7[2] * var12 + var11[2] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field844[var2 + -1];
                    var9 = var14[3];
                    var8 = var14[1];
                    var10 = var14[2];
                }
                int var15 = var9 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                int var16 = var8 >> 4;
                int var17 = var10 >> 4;
                if (~var16 <= -1) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var17 > -1) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                this.field837[var3] = class112.method789(var15, class112.method789(var17 << 8, var16 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class48() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        ++field843;
        if (arg0 < 66) {
            method298((byte) -126);
        }
        if (this.field844 == null) {
            this.method301((byte) 115, 1);
        }
        this.method299(true);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        ++field833;
        int[][] var3 = super.field4418.method835((byte) 117, arg0);
        if (arg1 != -1) {
            this.method22(88);
        }
        if (super.field4418.field2164) {
            int[] var4 = this.method1805(false, 0, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class53.field929 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field837[var9];
                var5[var8] = class113.method791(4080, var10 >> 12);
                var6[var8] = class113.method791(var10 >> 4, 4080);
                var7[var8] = class113.method791(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg2 != -1) {
            field839 = 72;
        }
        if (~arg0 == -1) {
            int var4 = arg1.method669((byte) 36);
            if (var4 == 0) {
                this.field844 = new int[arg1.method669((byte) 36)][4];
                for (int var5 = 0; ~var5 > ~this.field844.length; ++var5) {
                    this.field844[var5][0] = arg1.method677(false);
                    this.field844[var5][1] = arg1.method669((byte) 36) << 4;
                    this.field844[var5][2] = arg1.method669((byte) 36) << 4;
                    this.field844[var5][3] = arg1.method669((byte) 36) << 4;
                }
            } else {
                this.method301((byte) 103, var4);
            }
        }
        ++field842;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
    private final void method301(byte arg0, int arg1) {
        ++field841;
        if (arg0 <= 94) {
            method298((byte) 18);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field844 = new int[4][4];
                                    this.field844[0][2] = 4096;
                                    this.field844[1][2] = 4096;
                                    this.field844[0][3] = 0;
                                    this.field844[2][2] = 4096;
                                    this.field844[1][3] = 0;
                                    this.field844[0][1] = 0;
                                    this.field844[2][3] = 0;
                                    this.field844[3][2] = 0;
                                    this.field844[1][1] = 4096;
                                    this.field844[3][3] = 0;
                                    this.field844[2][1] = 4096;
                                    this.field844[3][1] = 4096;
                                    this.field844[0][0] = 2048;
                                    this.field844[1][0] = 2867;
                                    this.field844[2][0] = 3276;
                                    this.field844[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field844 = new int[16][4];
                                this.field844[0][3] = 321;
                                this.field844[0][2] = 192;
                                this.field844[1][3] = 562;
                                this.field844[1][2] = 449;
                                this.field844[2][3] = 803;
                                this.field844[3][3] = 1140;
                                this.field844[0][0] = 0;
                                this.field844[1][0] = 155;
                                this.field844[0][1] = 80;
                                this.field844[2][2] = 690;
                                this.field844[2][0] = 389;
                                this.field844[4][3] = 1509;
                                this.field844[3][2] = 995;
                                this.field844[3][0] = 671;
                                this.field844[4][2] = 1397;
                                this.field844[5][2] = 1429;
                                this.field844[5][3] = 1413;
                                this.field844[6][2] = 1461;
                                this.field844[1][1] = 321;
                                this.field844[4][0] = 897;
                                this.field844[2][1] = 578;
                                this.field844[5][0] = 1175;
                                this.field844[7][2] = 1525;
                                this.field844[6][3] = 1333;
                                this.field844[8][2] = 1590;
                                this.field844[6][0] = 1368;
                                this.field844[7][0] = 1507;
                                this.field844[7][3] = 1702;
                                this.field844[9][2] = 2056;
                                this.field844[8][3] = 2056;
                                this.field844[10][2] = 2586;
                                this.field844[3][1] = 947;
                                this.field844[4][1] = 1285;
                                this.field844[8][0] = 1736;
                                this.field844[11][2] = 3148;
                                this.field844[5][1] = 1525;
                                this.field844[12][2] = 3710;
                                this.field844[13][2] = 3421;
                                this.field844[14][2] = 3148;
                                this.field844[9][0] = 2088;
                                this.field844[6][1] = 1734;
                                this.field844[7][1] = 1413;
                                this.field844[15][2] = 2505;
                                this.field844[10][0] = 2355;
                                this.field844[11][0] = 2691;
                                this.field844[8][1] = 1108;
                                this.field844[9][1] = 1766;
                                this.field844[9][3] = 2666;
                                this.field844[10][3] = 3276;
                                this.field844[12][0] = 3031;
                                this.field844[11][3] = 3228;
                                this.field844[10][1] = 2409;
                                this.field844[12][3] = 3196;
                                this.field844[13][0] = 3522;
                                this.field844[14][0] = 3727;
                                this.field844[13][3] = 3019;
                                this.field844[11][1] = 3116;
                                this.field844[14][3] = 3228;
                                this.field844[12][1] = 3806;
                                this.field844[15][3] = 2746;
                                this.field844[13][1] = 3437;
                                this.field844[14][1] = 3116;
                                this.field844[15][1] = 2377;
                                this.field844[15][0] = 4096;
                            }
                        } else {
                            this.field844 = new int[6][4];
                            this.field844[0][2] = 0;
                            this.field844[0][3] = 0;
                            this.field844[1][3] = 1493;
                            this.field844[2][3] = 2939;
                            this.field844[3][3] = 3565;
                            this.field844[4][3] = 4031;
                            this.field844[0][1] = 0;
                            this.field844[1][2] = 0;
                            this.field844[0][0] = 0;
                            this.field844[5][3] = 4096;
                            this.field844[2][2] = 0;
                            this.field844[1][0] = 1843;
                            this.field844[3][2] = 1124;
                            this.field844[4][2] = 3084;
                            this.field844[5][2] = 4096;
                            this.field844[1][1] = 0;
                            this.field844[2][0] = 2457;
                            this.field844[3][0] = 2781;
                            this.field844[4][0] = 3481;
                            this.field844[2][1] = 0;
                            this.field844[5][0] = 4096;
                            this.field844[3][1] = 0;
                            this.field844[4][1] = 546;
                            this.field844[5][1] = 4096;
                        }
                    } else {
                        this.field844 = new int[7][4];
                        this.field844[0][1] = 0;
                        this.field844[0][2] = 0;
                        this.field844[0][0] = 0;
                        this.field844[1][0] = 663;
                        this.field844[1][2] = 4096;
                        this.field844[2][2] = 4096;
                        this.field844[2][0] = 1363;
                        this.field844[3][2] = 4096;
                        this.field844[4][2] = 0;
                        this.field844[3][0] = 2048;
                        this.field844[5][2] = 0;
                        this.field844[0][3] = 4096;
                        this.field844[1][1] = 0;
                        this.field844[4][0] = 2727;
                        this.field844[1][3] = 4096;
                        this.field844[2][1] = 0;
                        this.field844[6][2] = 0;
                        this.field844[2][3] = 0;
                        this.field844[5][0] = 3411;
                        this.field844[3][3] = 0;
                        this.field844[6][0] = 4096;
                        this.field844[3][1] = 4096;
                        this.field844[4][1] = 4096;
                        this.field844[5][1] = 4096;
                        this.field844[6][1] = 0;
                        this.field844[4][3] = 0;
                        this.field844[5][3] = 4096;
                        this.field844[6][3] = 4096;
                    }
                } else {
                    this.field844 = new int[8][4];
                    this.field844[0][2] = 2602;
                    this.field844[0][0] = 0;
                    this.field844[1][0] = 2867;
                    this.field844[1][2] = 1799;
                    this.field844[2][2] = 1734;
                    this.field844[0][3] = 2361;
                    this.field844[0][1] = 2650;
                    this.field844[3][2] = 1220;
                    this.field844[2][0] = 3072;
                    this.field844[4][2] = 963;
                    this.field844[1][3] = 1558;
                    this.field844[3][0] = 3276;
                    this.field844[2][3] = 1413;
                    this.field844[4][0] = 3481;
                    this.field844[3][3] = 947;
                    this.field844[5][2] = 2152;
                    this.field844[6][2] = 1060;
                    this.field844[5][0] = 3686;
                    this.field844[7][2] = 1413;
                    this.field844[1][1] = 2313;
                    this.field844[2][1] = 2618;
                    this.field844[4][3] = 722;
                    this.field844[6][0] = 3891;
                    this.field844[5][3] = 1766;
                    this.field844[3][1] = 2296;
                    this.field844[4][1] = 2072;
                    this.field844[5][1] = 2730;
                    this.field844[6][1] = 2232;
                    this.field844[7][1] = 1686;
                    this.field844[7][0] = 4096;
                    this.field844[6][3] = 915;
                    this.field844[7][3] = 1140;
                }
            } else {
                this.field844 = new int[2][4];
                this.field844[0][1] = 0;
                this.field844[0][0] = 0;
                this.field844[1][0] = 4096;
                this.field844[1][1] = 4096;
                this.field844[0][2] = 0;
                this.field844[1][2] = 4096;
                this.field844[0][3] = 0;
                this.field844[1][3] = 4096;
            }
        }
    }
}
