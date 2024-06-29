import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class236 extends class175 {

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "[I")
    private int[] field3958 = new int[257];

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field3956 = 0;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "Lij;")
    public static class50 field3955 = class78.method578(123, "cookieprefix");

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "Lij;")
    public static class50 field3949 = class78.method578(124, "leuchten3:");

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "Lij;")
    public static class50 field3960 = class78.method578(125, "settings=");

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "Lpe;")
    public static class100 field3952 = new class100(64);

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "Lij;")
    private static class50 field3961 = class78.method578(126, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "Lij;")
    public static class50 field3962 = class78.method578(125, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "Lij;")
    public static class50 field3963 = field3961;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "Lv;")
    public static class143 field3964;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "[Loe;")
    public static class207[] field3947;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "[[I")
    private int[][] field3954;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        ++field3959;
        int[][] var3 = super.field2920.method117(arg0, (byte) -94);
        if (super.field2920.field356) {
            int[] var4 = this.method1210(0, arg0, 16745);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class211.field3514; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3958[var9];
                var5[var8] = class51.method413(16711680, var10) >> 12;
                var6[var8] = class51.method413(4080, var10 >> 4);
                var7[var8] = class51.method413(var10, 255) << 4;
            }
        }
        if (arg1 != -20740) {
            field3964 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)V")
    public static void method1601(int arg0) {
        field3960 = null;
        field3955 = null;
        field3947 = null;
        field3949 = null;
        if (arg0 != 0) {
            field3955 = null;
        }
        field3964 = null;
        field3963 = null;
        field3952 = null;
        field3961 = null;
        field3962 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class236() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
    private final void method1602(byte arg0, int arg1) {
        ++field3951;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3954 = new int[4][4];
                                this.field3954[0][0] = 2048;
                                this.field3954[1][0] = 2867;
                                this.field3954[2][0] = 3276;
                                this.field3954[0][2] = 4096;
                                this.field3954[1][2] = 4096;
                                this.field3954[2][2] = 4096;
                                this.field3954[3][2] = 0;
                                this.field3954[3][0] = 4096;
                                this.field3954[0][3] = 0;
                                this.field3954[0][1] = 0;
                                this.field3954[1][3] = 0;
                                this.field3954[2][3] = 0;
                                this.field3954[1][1] = 4096;
                                this.field3954[2][1] = 4096;
                                this.field3954[3][3] = 0;
                                this.field3954[3][1] = 4096;
                            } else {
                                this.field3954 = new int[16][4];
                                this.field3954[0][1] = 80;
                                this.field3954[0][0] = 0;
                                this.field3954[1][1] = 321;
                                this.field3954[0][3] = 321;
                                this.field3954[2][1] = 578;
                                this.field3954[1][3] = 562;
                                this.field3954[0][2] = 192;
                                this.field3954[3][1] = 947;
                                this.field3954[4][1] = 1285;
                                this.field3954[1][0] = 155;
                                this.field3954[2][3] = 803;
                                this.field3954[1][2] = 449;
                                this.field3954[3][3] = 1140;
                                this.field3954[2][2] = 690;
                                this.field3954[3][2] = 995;
                                this.field3954[4][2] = 1397;
                                this.field3954[5][1] = 1525;
                                this.field3954[4][3] = 1509;
                                this.field3954[5][3] = 1413;
                                this.field3954[2][0] = 389;
                                this.field3954[5][2] = 1429;
                                this.field3954[6][2] = 1461;
                                this.field3954[7][2] = 1525;
                                this.field3954[3][0] = 671;
                                this.field3954[6][1] = 1734;
                                this.field3954[8][2] = 1590;
                                this.field3954[6][3] = 1333;
                                this.field3954[7][1] = 1413;
                                this.field3954[8][1] = 1108;
                                this.field3954[9][1] = 1766;
                                this.field3954[7][3] = 1702;
                                this.field3954[8][3] = 2056;
                                this.field3954[9][3] = 2666;
                                this.field3954[9][2] = 2056;
                                this.field3954[10][2] = 2586;
                                this.field3954[10][3] = 3276;
                                this.field3954[4][0] = 897;
                                this.field3954[5][0] = 1175;
                                this.field3954[10][1] = 2409;
                                this.field3954[6][0] = 1368;
                                this.field3954[11][3] = 3228;
                                this.field3954[7][0] = 1507;
                                this.field3954[8][0] = 1736;
                                this.field3954[9][0] = 2088;
                                this.field3954[12][3] = 3196;
                                this.field3954[11][1] = 3116;
                                this.field3954[10][0] = 2355;
                                this.field3954[13][3] = 3019;
                                this.field3954[11][2] = 3148;
                                this.field3954[12][2] = 3710;
                                this.field3954[12][1] = 3806;
                                this.field3954[13][1] = 3437;
                                this.field3954[14][1] = 3116;
                                this.field3954[11][0] = 2691;
                                this.field3954[13][2] = 3421;
                                this.field3954[15][1] = 2377;
                                this.field3954[14][2] = 3148;
                                this.field3954[14][3] = 3228;
                                this.field3954[15][2] = 2505;
                                this.field3954[12][0] = 3031;
                                this.field3954[15][3] = 2746;
                                this.field3954[13][0] = 3522;
                                this.field3954[14][0] = 3727;
                                this.field3954[15][0] = 4096;
                            }
                        } else {
                            this.field3954 = new int[6][4];
                            this.field3954[0][0] = 0;
                            this.field3954[1][0] = 1843;
                            this.field3954[0][1] = 0;
                            this.field3954[2][0] = 2457;
                            this.field3954[0][2] = 0;
                            this.field3954[1][1] = 0;
                            this.field3954[0][3] = 0;
                            this.field3954[1][2] = 0;
                            this.field3954[2][2] = 0;
                            this.field3954[3][2] = 1124;
                            this.field3954[3][0] = 2781;
                            this.field3954[4][0] = 3481;
                            this.field3954[4][2] = 3084;
                            this.field3954[5][0] = 4096;
                            this.field3954[2][1] = 0;
                            this.field3954[3][1] = 0;
                            this.field3954[1][3] = 1493;
                            this.field3954[5][2] = 4096;
                            this.field3954[2][3] = 2939;
                            this.field3954[3][3] = 3565;
                            this.field3954[4][1] = 546;
                            this.field3954[4][3] = 4031;
                            this.field3954[5][1] = 4096;
                            this.field3954[5][3] = 4096;
                        }
                    } else {
                        this.field3954 = new int[7][4];
                        this.field3954[0][1] = 0;
                        this.field3954[0][2] = 0;
                        this.field3954[0][0] = 0;
                        this.field3954[1][1] = 0;
                        this.field3954[2][1] = 0;
                        this.field3954[1][0] = 663;
                        this.field3954[3][1] = 4096;
                        this.field3954[0][3] = 4096;
                        this.field3954[1][3] = 4096;
                        this.field3954[1][2] = 4096;
                        this.field3954[2][3] = 0;
                        this.field3954[2][0] = 1363;
                        this.field3954[4][1] = 4096;
                        this.field3954[5][1] = 4096;
                        this.field3954[3][0] = 2048;
                        this.field3954[2][2] = 4096;
                        this.field3954[4][0] = 2727;
                        this.field3954[3][2] = 4096;
                        this.field3954[5][0] = 3411;
                        this.field3954[4][2] = 0;
                        this.field3954[6][0] = 4096;
                        this.field3954[5][2] = 0;
                        this.field3954[6][2] = 0;
                        this.field3954[3][3] = 0;
                        this.field3954[4][3] = 0;
                        this.field3954[5][3] = 4096;
                        this.field3954[6][1] = 0;
                        this.field3954[6][3] = 4096;
                    }
                } else {
                    this.field3954 = new int[8][4];
                    this.field3954[0][1] = 2650;
                    this.field3954[0][2] = 2602;
                    this.field3954[1][1] = 2313;
                    this.field3954[0][0] = 0;
                    this.field3954[1][0] = 2867;
                    this.field3954[0][3] = 2361;
                    this.field3954[1][3] = 1558;
                    this.field3954[2][1] = 2618;
                    this.field3954[2][0] = 3072;
                    this.field3954[1][2] = 1799;
                    this.field3954[2][3] = 1413;
                    this.field3954[3][1] = 2296;
                    this.field3954[4][1] = 2072;
                    this.field3954[5][1] = 2730;
                    this.field3954[3][3] = 947;
                    this.field3954[2][2] = 1734;
                    this.field3954[4][3] = 722;
                    this.field3954[5][3] = 1766;
                    this.field3954[6][3] = 915;
                    this.field3954[3][2] = 1220;
                    this.field3954[6][1] = 2232;
                    this.field3954[7][3] = 1140;
                    this.field3954[3][0] = 3276;
                    this.field3954[4][0] = 3481;
                    this.field3954[4][2] = 963;
                    this.field3954[5][0] = 3686;
                    this.field3954[5][2] = 2152;
                    this.field3954[6][2] = 1060;
                    this.field3954[7][1] = 1686;
                    this.field3954[6][0] = 3891;
                    this.field3954[7][0] = 4096;
                    this.field3954[7][2] = 1413;
                }
            } else {
                this.field3954 = new int[2][4];
                this.field3954[0][1] = 0;
                this.field3954[0][2] = 0;
                this.field3954[1][2] = 4096;
                this.field3954[0][0] = 0;
                this.field3954[0][3] = 0;
                this.field3954[1][3] = 4096;
                this.field3954[1][1] = 4096;
                this.field3954[1][0] = 4096;
            }
        }
        if (arg0 != 32) {
            field3963 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field3957;
        if (!arg0) {
            method1601(-106);
        }
        if (~arg1 == -1) {
            int var4 = arg2.method1487(255);
            if (var4 != 0) {
                this.method1602((byte) 32, var4);
            } else {
                this.field3954 = new int[arg2.method1487(255)][4];
                for (int var5 = 0; ~this.field3954.length < ~var5; ++var5) {
                    this.field3954[var5][0] = arg2.method1441(-94);
                    this.field3954[var5][1] = arg2.method1487(255) << 4;
                    this.field3954[var5][2] = arg2.method1487(255) << 4;
                    this.field3954[var5][3] = arg2.method1487(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)V")
    private final void method1603(int arg0) {
        ++field3948;
        int var2 = this.field3954.length;
        if (arg0 == 4) {
            if (~var2 < -1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && ~this.field3954[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (~var4 > ~var2) {
                        int[] var7 = this.field3954[var4];
                        if (var4 > 0) {
                            int[] var8 = this.field3954[var4 + -1];
                            int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                            int var10 = 4096 - var9;
                            var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                            var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                            var13 = var7[1] * var9 + var8[1] * var10 >> 12;
                        } else {
                            var13 = var7[1];
                            var12 = var7[3];
                            var11 = var7[2];
                        }
                    } else {
                        int[] var14 = this.field3954[var2 - 1];
                        var12 = var14[3];
                        var11 = var14[2];
                        var13 = var14[1];
                    }
                    int var15 = var13 >> 4;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -256) {
                        var15 = 255;
                    }
                    int var16 = var12 >> 4;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -256) {
                        var16 = 255;
                    }
                    int var17 = var11 >> 4;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    this.field3958[var3] = class29.method261(class29.method261(var17 << 8, var15 << 16), var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (this.field3954 == null) {
            this.method1602((byte) 32, 1);
        }
        ++field3950;
        if (arg0 != 0) {
            field3964 = null;
        }
        this.method1603(4);
    }
}
