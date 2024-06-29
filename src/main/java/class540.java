import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class540 extends class377 {

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "[I")
    private int[] field6815 = new int[257];

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "Lbs;")
    public static class643 field6812 = new class643("runescape", 0);

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "[[I")
    private int[][] field6813;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "[[[S")
    public static short[][][] field6821;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method23(int arg0, byte arg1) {
        ++field6817;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        int var4 = -75 / ((arg1 - 31) / 42);
        if (super.field4850.field5843) {
            int[] var5 = this.method2174(0, arg0, (byte) 50);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class528.field6661; ++var9) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field6815[var10];
                var6[var9] = class109.method762(4080, var11 >> 12);
                var7[var9] = class109.method762(var11, 65280) >> 4;
                var8[var9] = class109.method762(4080, var11 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public final void method91(byte arg0) {
        ++field6818;
        if (arg0 < 52) {
            this.method23(-99, (byte) -14);
        }
        if (this.field6813 == null) {
            this.method2899(1, 2505);
        }
        this.method2901(false);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        if (arg0 == 0) {
            int var4 = arg2.method3097((byte) 12);
            if (~var4 != -1) {
                this.method2899(var4, 2505);
            } else {
                this.field6813 = new int[arg2.method3097((byte) 12)][4];
                for (int var5 = 0; this.field6813.length > var5; ++var5) {
                    this.field6813[var5][0] = arg2.method3031(-1);
                    this.field6813[var5][1] = arg2.method3097((byte) 12) << 4;
                    this.field6813[var5][2] = arg2.method3097((byte) 12) << 4;
                    this.field6813[var5][3] = arg2.method3097((byte) 12) << 4;
                }
            }
        }
        ++field6820;
        int var6 = -62 % ((arg1 - 13) / 55);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)V")
    private final void method2899(int arg0, int arg1) {
        ++field6811;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field6813 = new int[4][4];
                                this.field6813[0][0] = 2048;
                                this.field6813[0][3] = 0;
                                this.field6813[0][1] = 0;
                                this.field6813[0][2] = 4096;
                                this.field6813[1][3] = 0;
                                this.field6813[1][1] = 4096;
                                this.field6813[1][2] = 4096;
                                this.field6813[1][0] = 2867;
                                this.field6813[2][2] = 4096;
                                this.field6813[2][3] = 0;
                                this.field6813[2][0] = 3276;
                                this.field6813[2][1] = 4096;
                                this.field6813[3][1] = 4096;
                                this.field6813[3][0] = 4096;
                                this.field6813[3][3] = 0;
                                this.field6813[3][2] = 0;
                            } else {
                                this.field6813 = new int[16][4];
                                this.field6813[0][3] = 321;
                                this.field6813[0][1] = 80;
                                this.field6813[0][0] = 0;
                                this.field6813[0][2] = 192;
                                this.field6813[1][3] = 562;
                                this.field6813[1][0] = 155;
                                this.field6813[1][1] = 321;
                                this.field6813[1][2] = 449;
                                this.field6813[2][3] = 803;
                                this.field6813[2][1] = 578;
                                this.field6813[2][2] = 690;
                                this.field6813[2][0] = 389;
                                this.field6813[3][1] = 947;
                                this.field6813[3][0] = 671;
                                this.field6813[3][3] = 1140;
                                this.field6813[3][2] = 995;
                                this.field6813[4][1] = 1285;
                                this.field6813[4][3] = 1509;
                                this.field6813[4][2] = 1397;
                                this.field6813[4][0] = 897;
                                this.field6813[5][2] = 1429;
                                this.field6813[5][0] = 1175;
                                this.field6813[5][3] = 1413;
                                this.field6813[5][1] = 1525;
                                this.field6813[6][1] = 1734;
                                this.field6813[6][2] = 1461;
                                this.field6813[6][3] = 1333;
                                this.field6813[6][0] = 1368;
                                this.field6813[7][3] = 1702;
                                this.field6813[7][1] = 1413;
                                this.field6813[7][2] = 1525;
                                this.field6813[7][0] = 1507;
                                this.field6813[8][3] = 2056;
                                this.field6813[8][2] = 1590;
                                this.field6813[8][1] = 1108;
                                this.field6813[8][0] = 1736;
                                this.field6813[9][1] = 1766;
                                this.field6813[9][2] = 2056;
                                this.field6813[9][0] = 2088;
                                this.field6813[9][3] = 2666;
                                this.field6813[10][0] = 2355;
                                this.field6813[10][2] = 2586;
                                this.field6813[10][1] = 2409;
                                this.field6813[10][3] = 3276;
                                this.field6813[11][0] = 2691;
                                this.field6813[11][3] = 3228;
                                this.field6813[11][1] = 3116;
                                this.field6813[11][2] = 3148;
                                this.field6813[12][2] = 3710;
                                this.field6813[12][1] = 3806;
                                this.field6813[12][3] = 3196;
                                this.field6813[12][0] = 3031;
                                this.field6813[13][0] = 3522;
                                this.field6813[13][1] = 3437;
                                this.field6813[13][3] = 3019;
                                this.field6813[13][2] = 3421;
                                this.field6813[14][3] = 3228;
                                this.field6813[14][2] = 3148;
                                this.field6813[14][1] = 3116;
                                this.field6813[14][0] = 3727;
                                this.field6813[15][0] = 4096;
                                this.field6813[15][2] = 2505;
                                this.field6813[15][3] = 2746;
                                this.field6813[15][1] = 2377;
                            }
                        } else {
                            this.field6813 = new int[6][4];
                            this.field6813[0][1] = 0;
                            this.field6813[0][0] = 0;
                            this.field6813[0][3] = 0;
                            this.field6813[0][2] = 0;
                            this.field6813[1][2] = 0;
                            this.field6813[1][1] = 0;
                            this.field6813[1][0] = 1843;
                            this.field6813[1][3] = 1493;
                            this.field6813[2][1] = 0;
                            this.field6813[2][3] = 2939;
                            this.field6813[2][2] = 0;
                            this.field6813[2][0] = 2457;
                            this.field6813[3][0] = 2781;
                            this.field6813[3][3] = 3565;
                            this.field6813[3][2] = 1124;
                            this.field6813[3][1] = 0;
                            this.field6813[4][3] = 4031;
                            this.field6813[4][1] = 546;
                            this.field6813[4][2] = 3084;
                            this.field6813[4][0] = 3481;
                            this.field6813[5][2] = 4096;
                            this.field6813[5][3] = 4096;
                            this.field6813[5][1] = 4096;
                            this.field6813[5][0] = 4096;
                        }
                    } else {
                        this.field6813 = new int[7][4];
                        this.field6813[0][3] = 4096;
                        this.field6813[0][0] = 0;
                        this.field6813[0][1] = 0;
                        this.field6813[0][2] = 0;
                        this.field6813[1][0] = 663;
                        this.field6813[1][1] = 0;
                        this.field6813[1][3] = 4096;
                        this.field6813[1][2] = 4096;
                        this.field6813[2][0] = 1363;
                        this.field6813[2][3] = 0;
                        this.field6813[2][2] = 4096;
                        this.field6813[2][1] = 0;
                        this.field6813[3][1] = 4096;
                        this.field6813[3][3] = 0;
                        this.field6813[3][0] = 2048;
                        this.field6813[3][2] = 4096;
                        this.field6813[4][3] = 0;
                        this.field6813[4][0] = 2727;
                        this.field6813[4][1] = 4096;
                        this.field6813[4][2] = 0;
                        this.field6813[5][1] = 4096;
                        this.field6813[5][3] = 4096;
                        this.field6813[5][2] = 0;
                        this.field6813[5][0] = 3411;
                        this.field6813[6][2] = 0;
                        this.field6813[6][1] = 0;
                        this.field6813[6][3] = 4096;
                        this.field6813[6][0] = 4096;
                    }
                } else {
                    this.field6813 = new int[8][4];
                    this.field6813[0][2] = 2602;
                    this.field6813[0][3] = 2361;
                    this.field6813[0][0] = 0;
                    this.field6813[0][1] = 2650;
                    this.field6813[1][2] = 1799;
                    this.field6813[1][0] = 2867;
                    this.field6813[1][3] = 1558;
                    this.field6813[1][1] = 2313;
                    this.field6813[2][1] = 2618;
                    this.field6813[2][2] = 1734;
                    this.field6813[2][0] = 3072;
                    this.field6813[2][3] = 1413;
                    this.field6813[3][3] = 947;
                    this.field6813[3][2] = 1220;
                    this.field6813[3][1] = 2296;
                    this.field6813[3][0] = 3276;
                    this.field6813[4][2] = 963;
                    this.field6813[4][3] = 722;
                    this.field6813[4][0] = 3481;
                    this.field6813[4][1] = 2072;
                    this.field6813[5][0] = 3686;
                    this.field6813[5][3] = 1766;
                    this.field6813[5][1] = 2730;
                    this.field6813[5][2] = 2152;
                    this.field6813[6][0] = 3891;
                    this.field6813[6][3] = 915;
                    this.field6813[6][2] = 1060;
                    this.field6813[6][1] = 2232;
                    this.field6813[7][0] = 4096;
                    this.field6813[7][3] = 1140;
                    this.field6813[7][2] = 1413;
                    this.field6813[7][1] = 1686;
                }
            } else {
                this.field6813 = new int[2][4];
                this.field6813[0][3] = 0;
                this.field6813[0][0] = 0;
                this.field6813[0][2] = 0;
                this.field6813[0][1] = 0;
                this.field6813[1][3] = 4096;
                this.field6813[1][1] = 4096;
                this.field6813[1][2] = 4096;
                this.field6813[1][0] = 4096;
            }
        }
        if (arg1 == 2505) {
            ;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class540() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
    public static void method2900(int arg0) {
        field6812 = null;
        field6821 = null;
        if (arg0 != 0) {
            method2900(-35);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    private final void method2901(boolean arg0) {
        ++field6819;
        if (arg0) {
            method2902(false);
        }
        int var2 = this.field6813.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && var5 >= this.field6813[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field6813[var2 - 1];
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field6813[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field6813[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var8 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                    } else {
                        var8 = var11[2];
                        var10 = var11[3];
                        var9 = var11[1];
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (~var16 <= -1) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field6815[var3] = class364.method2113(var16, class364.method2113(var15 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
    public static final void method2902(boolean arg0) {
        class628.field8531 = 1;
        class139.field1674 = -1;
        ++field6816;
        if (!arg0) {
            long var1 = 0L;
            if (class109.field1356 == null) {
                class29.method177(35, 32768);
            } else {
                class572 var3 = new class572(class290.method1742((byte) -16, class93.method687(false, class109.field1356)));
                long var4 = var3.method3046(arg0);
                class125.field1522 = var3.method3046(arg0);
                class22.method144(class182.method1086(var4, -30150), "", true, -211631871);
            }
        }
    }
}
