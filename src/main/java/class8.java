import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class30 {

    @OriginalMember(owner = "client!to", name = "C", descriptor = "[I")
    private int[] field61 = new int[257];

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "[[I")
    private int[][] field63;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(II)V", line = 4)
    private final void method25(int arg0, int arg1) {
        ++field66;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field63 = new int[4][4];
                                this.field63[0][0] = 2048;
                                this.field63[0][2] = 4096;
                                this.field63[0][3] = 0;
                                this.field63[0][1] = 0;
                                this.field63[1][0] = 2867;
                                this.field63[1][1] = 4096;
                                this.field63[1][3] = 0;
                                this.field63[1][2] = 4096;
                                this.field63[2][2] = 4096;
                                this.field63[2][3] = 0;
                                this.field63[2][1] = 4096;
                                this.field63[2][0] = 3276;
                                this.field63[3][1] = 4096;
                                this.field63[3][2] = 0;
                                this.field63[3][0] = 4096;
                                this.field63[3][3] = 0;
                            } else {
                                this.field63 = new int[16][4];
                                this.field63[0][1] = 80;
                                this.field63[0][0] = 0;
                                this.field63[0][3] = 321;
                                this.field63[0][2] = 192;
                                this.field63[1][2] = 449;
                                this.field63[1][3] = 562;
                                this.field63[1][0] = 155;
                                this.field63[1][1] = 321;
                                this.field63[2][1] = 578;
                                this.field63[2][0] = 389;
                                this.field63[2][2] = 690;
                                this.field63[2][3] = 803;
                                this.field63[3][0] = 671;
                                this.field63[3][3] = 1140;
                                this.field63[3][1] = 947;
                                this.field63[3][2] = 995;
                                this.field63[4][0] = 897;
                                this.field63[4][1] = 1285;
                                this.field63[4][3] = 1509;
                                this.field63[4][2] = 1397;
                                this.field63[5][2] = 1429;
                                this.field63[5][1] = 1525;
                                this.field63[5][3] = 1413;
                                this.field63[5][0] = 1175;
                                this.field63[6][3] = 1333;
                                this.field63[6][2] = 1461;
                                this.field63[6][0] = 1368;
                                this.field63[6][1] = 1734;
                                this.field63[7][1] = 1413;
                                this.field63[7][2] = 1525;
                                this.field63[7][0] = 1507;
                                this.field63[7][3] = 1702;
                                this.field63[8][1] = 1108;
                                this.field63[8][0] = 1736;
                                this.field63[8][3] = 2056;
                                this.field63[8][2] = 1590;
                                this.field63[9][3] = 2666;
                                this.field63[9][1] = 1766;
                                this.field63[9][0] = 2088;
                                this.field63[9][2] = 2056;
                                this.field63[10][1] = 2409;
                                this.field63[10][2] = 2586;
                                this.field63[10][0] = 2355;
                                this.field63[10][3] = 3276;
                                this.field63[11][2] = 3148;
                                this.field63[11][0] = 2691;
                                this.field63[11][1] = 3116;
                                this.field63[11][3] = 3228;
                                this.field63[12][1] = 3806;
                                this.field63[12][0] = 3031;
                                this.field63[12][2] = 3710;
                                this.field63[12][3] = 3196;
                                this.field63[13][0] = 3522;
                                this.field63[13][1] = 3437;
                                this.field63[13][3] = 3019;
                                this.field63[13][2] = 3421;
                                this.field63[14][3] = 3228;
                                this.field63[14][0] = 3727;
                                this.field63[14][1] = 3116;
                                this.field63[14][2] = 3148;
                                this.field63[15][0] = 4096;
                                this.field63[15][2] = 2505;
                                this.field63[15][3] = 2746;
                                this.field63[15][1] = 2377;
                            }
                        } else {
                            this.field63 = new int[6][4];
                            this.field63[0][2] = 0;
                            this.field63[0][0] = 0;
                            this.field63[0][3] = 0;
                            this.field63[0][1] = 0;
                            this.field63[1][2] = 0;
                            this.field63[1][1] = 0;
                            this.field63[1][0] = 1843;
                            this.field63[1][3] = 1493;
                            this.field63[2][1] = 0;
                            this.field63[2][2] = 0;
                            this.field63[2][3] = 2939;
                            this.field63[2][0] = 2457;
                            this.field63[3][2] = 1124;
                            this.field63[3][3] = 3565;
                            this.field63[3][0] = 2781;
                            this.field63[3][1] = 0;
                            this.field63[4][1] = 546;
                            this.field63[4][2] = 3084;
                            this.field63[4][0] = 3481;
                            this.field63[4][3] = 4031;
                            this.field63[5][3] = 4096;
                            this.field63[5][0] = 4096;
                            this.field63[5][2] = 4096;
                            this.field63[5][1] = 4096;
                        }
                    } else {
                        this.field63 = new int[7][4];
                        this.field63[0][2] = 0;
                        this.field63[0][3] = 4096;
                        this.field63[0][0] = 0;
                        this.field63[0][1] = 0;
                        this.field63[1][1] = 0;
                        this.field63[1][0] = 663;
                        this.field63[1][3] = 4096;
                        this.field63[1][2] = 4096;
                        this.field63[2][0] = 1363;
                        this.field63[2][3] = 0;
                        this.field63[2][2] = 4096;
                        this.field63[2][1] = 0;
                        this.field63[3][2] = 4096;
                        this.field63[3][1] = 4096;
                        this.field63[3][0] = 2048;
                        this.field63[3][3] = 0;
                        this.field63[4][1] = 4096;
                        this.field63[4][3] = 0;
                        this.field63[4][2] = 0;
                        this.field63[4][0] = 2727;
                        this.field63[5][3] = 4096;
                        this.field63[5][0] = 3411;
                        this.field63[5][2] = 0;
                        this.field63[5][1] = 4096;
                        this.field63[6][3] = 4096;
                        this.field63[6][1] = 0;
                        this.field63[6][0] = 4096;
                        this.field63[6][2] = 0;
                    }
                } else {
                    this.field63 = new int[8][4];
                    this.field63[0][2] = 2602;
                    this.field63[0][3] = 2361;
                    this.field63[0][1] = 2650;
                    this.field63[0][0] = 0;
                    this.field63[1][3] = 1558;
                    this.field63[1][2] = 1799;
                    this.field63[1][1] = 2313;
                    this.field63[1][0] = 2867;
                    this.field63[2][2] = 1734;
                    this.field63[2][0] = 3072;
                    this.field63[2][3] = 1413;
                    this.field63[2][1] = 2618;
                    this.field63[3][2] = 1220;
                    this.field63[3][1] = 2296;
                    this.field63[3][3] = 947;
                    this.field63[3][0] = 3276;
                    this.field63[4][3] = 722;
                    this.field63[4][2] = 963;
                    this.field63[4][1] = 2072;
                    this.field63[4][0] = 3481;
                    this.field63[5][2] = 2152;
                    this.field63[5][0] = 3686;
                    this.field63[5][1] = 2730;
                    this.field63[5][3] = 1766;
                    this.field63[6][2] = 1060;
                    this.field63[6][0] = 3891;
                    this.field63[6][3] = 915;
                    this.field63[6][1] = 2232;
                    this.field63[7][1] = 1686;
                    this.field63[7][0] = 4096;
                    this.field63[7][2] = 1413;
                    this.field63[7][3] = 1140;
                }
            } else {
                this.field63 = new int[2][4];
                this.field63[0][0] = 0;
                this.field63[0][1] = 0;
                this.field63[0][2] = 0;
                this.field63[0][3] = 0;
                this.field63[1][0] = 4096;
                this.field63[1][1] = 4096;
                this.field63[1][3] = 4096;
                this.field63[1][2] = 4096;
            }
        }
        if (arg0 != 4096) {
            method32(75, 72, true, 67);
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V", line = 257)
    public static final void method26(int arg0) {
        ++field59;
        if (!class366.field4875.method537(class503.field6917, 0) && class540.field7305 != class367.field4944) {
            class165.method1156(class186.field2695, class452.field6238, false, -4525, 11);
        } else {
            class86.method642(class334.field4506, 255);
            if (~class419.field5915 != ~class367.field4944) {
                class603.method3394(-4);
            }
            if (arg0 == 11) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V", line = 278)
    public class8() {
        super(1, false);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BILac;)V", line = 286)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        ++field67;
        if (~arg1 == -1) {
            int var4 = arg2.method2874((byte) -75);
            if (~var4 != -1) {
                this.method25(4096, var4);
            } else {
                this.field63 = new int[arg2.method2874((byte) -75)][4];
                for (int var5 = 0; ~var5 > ~this.field63.length; ++var5) {
                    this.field63[var5][0] = arg2.method2845(-1);
                    this.field63[var5][1] = arg2.method2874((byte) -75) << 4;
                    this.field63[var5][2] = arg2.method2874((byte) -75) << 4;
                    this.field63[var5][3] = arg2.method2874((byte) -75) << 4;
                }
            }
        }
        if (arg0 <= 100) {
            this.field61 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(III)Z", line = 323)
    public static final boolean method28(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method28(-55, -13, -52);
        }
        ++field64;
        return class185.method1272(arg2, true, arg1) || class302.method1839((byte) 103, arg1, arg2);
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V", line = 334)
    public final void method29(byte arg0) {
        if (this.field63 == null) {
            this.method25(4096, 1);
        }
        ++field60;
        if (arg0 > -10) {
            this.method30(43, (byte) -45);
        }
        this.method31(34);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IB)[[I", line = 349)
    public final int[][] method30(int arg0, byte arg1) {
        ++field68;
        int[][] var3 = super.field377.method3683(arg0, (byte) -121);
        if (super.field377.field9085) {
            int[] var4 = this.method294(arg0, 0, (byte) 97);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class31.field399 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field61[var9];
                var5[var8] = class136.method950(16711680, var10) >> 12;
                var6[var8] = class136.method950(65280, var10) >> 4;
                var7[var8] = class136.method950(255, var10) << 4;
            }
        }
        return arg1 != 7 ? null : var3;
    }

    @OriginalMember(owner = "client!to", name = "g", descriptor = "(I)V", line = 407)
    private final void method31(int arg0) {
        ++field65;
        int var2 = -44 / ((arg0 - -22) / 53);
        int var3 = this.field63.length;
        if (var3 > 0) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var7 < var3 && ~this.field63[var7][0] >= ~var6; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (var5 >= var3) {
                    int[] var8 = this.field63[var3 + -1];
                    var9 = var8[1];
                    var10 = var8[2];
                    var11 = var8[3];
                } else {
                    int[] var12 = this.field63[var5];
                    if (var5 > 0) {
                        int[] var13 = this.field63[var5 + -1];
                        int var14 = (-var13[0] + var6 << 12) / (var12[0] + -var13[0]);
                        int var15 = 4096 - var14;
                        var10 = var12[2] * var14 + var13[2] * var15 >> 12;
                        var11 = var12[3] * var14 + var13[3] * var15 >> 12;
                        var9 = var12[1] * var14 + var13[1] * var15 >> 12;
                    } else {
                        var11 = var12[3];
                        var10 = var12[2];
                        var9 = var12[1];
                    }
                }
                int var16 = var9 >> 4;
                int var17 = var10 >> 4;
                int var18 = var11 >> 4;
                if (var18 >= 0) {
                    if (var18 > 255) {
                        var18 = 255;
                    }
                } else {
                    var18 = 0;
                }
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                this.field61[var4] = class647.method3617(class647.method3617(var16 << 16, var17 << 8), var18);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIZI)I", line = 513)
    public static final int method32(int arg0, int arg1, boolean arg2, int arg3) {
        ++field62;
        class373 var4 = class687.method3877(arg1, arg2, 73);
        if (var4 == null) {
            return 0;
        } else if (~arg3 == 0) {
            return 0;
        } else {
            int var5 = arg0;
            for (int var6 = 0; ~var4.field5020.length < ~var6; ++var6) {
                if (~var4.field5021[var6] == ~arg3) {
                    var5 += var4.field5020[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lqh;I)V", line = 547)
    public static final void method33(class61 arg0, int arg1) {
        ++field58;
        if (arg1 >= 49) {
            for (class389 var2 = (class389) class552.field7451.method1436(28964); var2 != null; var2 = (class389) class552.field7451.method1443((byte) 6)) {
                if (var2.field5484 == arg0) {
                    if (var2.field5499 != null) {
                        class61.field680.method1464(var2.field5499);
                        var2.field5499 = null;
                    }
                    var2.method2340(-55);
                    return;
                }
            }
        }
    }
}
