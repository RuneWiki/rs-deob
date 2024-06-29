import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class401 extends class62 {

    @OriginalMember(owner = "client!vaa", name = "G", descriptor = "[I")
    private int[] field5495 = new int[257];

    @OriginalMember(owner = "client!vaa", name = "I", descriptor = "Lmo;")
    public static class638 field5497 = new class638();

    @OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!vaa", name = "F", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!vaa", name = "H", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!vaa", name = "J", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!vaa", name = "K", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!vaa", name = "C", descriptor = "[[I")
    private int[][] field5492;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "(I)V")
    private final void method2362(int arg0) {
        ++field5499;
        int var2 = this.field5492.length;
        if (arg0 != -16997) {
            this.method395(-93);
        }
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field5492[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 < var2) {
                    int[] var7 = this.field5492[var4];
                    if (var4 <= 0) {
                        var8 = var7[3];
                        var9 = var7[1];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field5492[var4 - 1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var8 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                        var10 = var7[2] * var12 + var11[2] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field5492[var2 + -1];
                    var10 = var14[2];
                    var9 = var14[1];
                    var8 = var14[3];
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var15 <= -1) {
                    if (var15 > 255) {
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
                this.field5495[var3] = class473.method2847(var15, class473.method2847(var16 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "(I)V")
    public final void method395(int arg0) {
        ++field5496;
        if (this.field5492 == null) {
            this.method2363(1, true);
        }
        if (arg0 < -37) {
            this.method2362(-16997);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0.method1032((byte) -33);
            if (~var4 != -1) {
                this.method2363(var4, true);
            } else {
                this.field5492 = new int[arg0.method1032((byte) -33)][4];
                for (int var5 = 0; this.field5492.length > var5; ++var5) {
                    this.field5492[var5][0] = arg0.method1045(true);
                    this.field5492[var5][1] = arg0.method1032((byte) -33) << 4;
                    this.field5492[var5][2] = arg0.method1032((byte) -33) << 4;
                    this.field5492[var5][3] = arg0.method1032((byte) -33) << 4;
                }
            }
        }
        if (arg1 != -1) {
            method2364(-63);
        }
        ++field5493;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method409(int arg0, byte arg1) {
        ++field5494;
        if (arg1 >= -20) {
            this.field5495 = null;
        }
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[] var4 = this.method408(arg0, 0, (byte) -69);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class438.field5847; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field5495[var9];
                var5[var8] = class37.method245(var10 >> 12, 4080);
                var6[var8] = class37.method245(var10 >> 4, 4080);
                var7[var8] = class37.method245(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "()V")
    public class401() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V")
    private final void method2363(int arg0, boolean arg1) {
        ++field5498;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field5492 = new int[4][4];
                                this.field5492[0][2] = 4096;
                                this.field5492[0][1] = 0;
                                this.field5492[0][0] = 2048;
                                this.field5492[0][3] = 0;
                                this.field5492[1][3] = 0;
                                this.field5492[1][2] = 4096;
                                this.field5492[1][0] = 2867;
                                this.field5492[1][1] = 4096;
                                this.field5492[2][0] = 3276;
                                this.field5492[2][3] = 0;
                                this.field5492[2][2] = 4096;
                                this.field5492[2][1] = 4096;
                                this.field5492[3][3] = 0;
                                this.field5492[3][0] = 4096;
                                this.field5492[3][1] = 4096;
                                this.field5492[3][2] = 0;
                            } else {
                                this.field5492 = new int[16][4];
                                this.field5492[0][3] = 321;
                                this.field5492[0][2] = 192;
                                this.field5492[0][1] = 80;
                                this.field5492[0][0] = 0;
                                this.field5492[1][3] = 562;
                                this.field5492[1][0] = 155;
                                this.field5492[1][2] = 449;
                                this.field5492[1][1] = 321;
                                this.field5492[2][1] = 578;
                                this.field5492[2][2] = 690;
                                this.field5492[2][3] = 803;
                                this.field5492[2][0] = 389;
                                this.field5492[3][1] = 947;
                                this.field5492[3][2] = 995;
                                this.field5492[3][0] = 671;
                                this.field5492[3][3] = 1140;
                                this.field5492[4][0] = 897;
                                this.field5492[4][1] = 1285;
                                this.field5492[4][2] = 1397;
                                this.field5492[4][3] = 1509;
                                this.field5492[5][1] = 1525;
                                this.field5492[5][2] = 1429;
                                this.field5492[5][3] = 1413;
                                this.field5492[5][0] = 1175;
                                this.field5492[6][0] = 1368;
                                this.field5492[6][1] = 1734;
                                this.field5492[6][3] = 1333;
                                this.field5492[6][2] = 1461;
                                this.field5492[7][1] = 1413;
                                this.field5492[7][2] = 1525;
                                this.field5492[7][0] = 1507;
                                this.field5492[7][3] = 1702;
                                this.field5492[8][2] = 1590;
                                this.field5492[8][0] = 1736;
                                this.field5492[8][1] = 1108;
                                this.field5492[8][3] = 2056;
                                this.field5492[9][2] = 2056;
                                this.field5492[9][3] = 2666;
                                this.field5492[9][0] = 2088;
                                this.field5492[9][1] = 1766;
                                this.field5492[10][3] = 3276;
                                this.field5492[10][0] = 2355;
                                this.field5492[10][2] = 2586;
                                this.field5492[10][1] = 2409;
                                this.field5492[11][3] = 3228;
                                this.field5492[11][0] = 2691;
                                this.field5492[11][2] = 3148;
                                this.field5492[11][1] = 3116;
                                this.field5492[12][1] = 3806;
                                this.field5492[12][0] = 3031;
                                this.field5492[12][2] = 3710;
                                this.field5492[12][3] = 3196;
                                this.field5492[13][1] = 3437;
                                this.field5492[13][0] = 3522;
                                this.field5492[13][2] = 3421;
                                this.field5492[13][3] = 3019;
                                this.field5492[14][1] = 3116;
                                this.field5492[14][3] = 3228;
                                this.field5492[14][2] = 3148;
                                this.field5492[14][0] = 3727;
                                this.field5492[15][0] = 4096;
                                this.field5492[15][2] = 2505;
                                this.field5492[15][3] = 2746;
                                this.field5492[15][1] = 2377;
                            }
                        } else {
                            this.field5492 = new int[6][4];
                            this.field5492[0][0] = 0;
                            this.field5492[0][3] = 0;
                            this.field5492[0][2] = 0;
                            this.field5492[0][1] = 0;
                            this.field5492[1][1] = 0;
                            this.field5492[1][3] = 1493;
                            this.field5492[1][0] = 1843;
                            this.field5492[1][2] = 0;
                            this.field5492[2][2] = 0;
                            this.field5492[2][0] = 2457;
                            this.field5492[2][3] = 2939;
                            this.field5492[2][1] = 0;
                            this.field5492[3][3] = 3565;
                            this.field5492[3][1] = 0;
                            this.field5492[3][0] = 2781;
                            this.field5492[3][2] = 1124;
                            this.field5492[4][2] = 3084;
                            this.field5492[4][3] = 4031;
                            this.field5492[4][0] = 3481;
                            this.field5492[4][1] = 546;
                            this.field5492[5][2] = 4096;
                            this.field5492[5][3] = 4096;
                            this.field5492[5][1] = 4096;
                            this.field5492[5][0] = 4096;
                        }
                    } else {
                        this.field5492 = new int[7][4];
                        this.field5492[0][2] = 0;
                        this.field5492[0][3] = 4096;
                        this.field5492[0][0] = 0;
                        this.field5492[0][1] = 0;
                        this.field5492[1][0] = 663;
                        this.field5492[1][2] = 4096;
                        this.field5492[1][3] = 4096;
                        this.field5492[1][1] = 0;
                        this.field5492[2][2] = 4096;
                        this.field5492[2][0] = 1363;
                        this.field5492[2][1] = 0;
                        this.field5492[2][3] = 0;
                        this.field5492[3][1] = 4096;
                        this.field5492[3][0] = 2048;
                        this.field5492[3][2] = 4096;
                        this.field5492[3][3] = 0;
                        this.field5492[4][1] = 4096;
                        this.field5492[4][3] = 0;
                        this.field5492[4][2] = 0;
                        this.field5492[4][0] = 2727;
                        this.field5492[5][2] = 0;
                        this.field5492[5][3] = 4096;
                        this.field5492[5][1] = 4096;
                        this.field5492[5][0] = 3411;
                        this.field5492[6][1] = 0;
                        this.field5492[6][3] = 4096;
                        this.field5492[6][0] = 4096;
                        this.field5492[6][2] = 0;
                    }
                } else {
                    this.field5492 = new int[8][4];
                    this.field5492[0][0] = 0;
                    this.field5492[0][2] = 2602;
                    this.field5492[0][1] = 2650;
                    this.field5492[0][3] = 2361;
                    this.field5492[1][3] = 1558;
                    this.field5492[1][1] = 2313;
                    this.field5492[1][0] = 2867;
                    this.field5492[1][2] = 1799;
                    this.field5492[2][3] = 1413;
                    this.field5492[2][1] = 2618;
                    this.field5492[2][0] = 3072;
                    this.field5492[2][2] = 1734;
                    this.field5492[3][2] = 1220;
                    this.field5492[3][3] = 947;
                    this.field5492[3][0] = 3276;
                    this.field5492[3][1] = 2296;
                    this.field5492[4][3] = 722;
                    this.field5492[4][2] = 963;
                    this.field5492[4][0] = 3481;
                    this.field5492[4][1] = 2072;
                    this.field5492[5][1] = 2730;
                    this.field5492[5][0] = 3686;
                    this.field5492[5][3] = 1766;
                    this.field5492[5][2] = 2152;
                    this.field5492[6][3] = 915;
                    this.field5492[6][2] = 1060;
                    this.field5492[6][0] = 3891;
                    this.field5492[6][1] = 2232;
                    this.field5492[7][1] = 1686;
                    this.field5492[7][2] = 1413;
                    this.field5492[7][3] = 1140;
                    this.field5492[7][0] = 4096;
                }
            } else {
                this.field5492 = new int[2][4];
                this.field5492[0][0] = 0;
                this.field5492[0][3] = 0;
                this.field5492[0][2] = 0;
                this.field5492[0][1] = 0;
                this.field5492[1][0] = 4096;
                this.field5492[1][3] = 4096;
                this.field5492[1][2] = 4096;
                this.field5492[1][1] = 4096;
            }
        }
        if (!arg1) {
            field5497 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "(I)V")
    public static void method2364(int arg0) {
        field5497 = null;
        if (arg0 <= 117) {
            method2364(-2);
        }
    }
}
