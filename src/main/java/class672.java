import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class672 extends class362 {

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "[I")
    private int[] field9323 = new int[257];

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "I")
    public static int field9325 = -1;

    @OriginalMember(owner = "client!lca", name = "I", descriptor = "Lvl;")
    public static class15 field9331 = new class15(66, 3);

    @OriginalMember(owner = "client!lca", name = "J", descriptor = "I")
    public static int field9332 = 0;

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!lca", name = "A", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!lca", name = "C", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!lca", name = "D", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!lca", name = "F", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!lca", name = "H", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!lca", name = "E", descriptor = "[[I")
    private int[][] field9328;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field9327;
        if (arg2 != -1) {
            this.field9328 = null;
        }
        if (arg1 == 0) {
            int var4 = arg0.method793((byte) 107);
            if (var4 != 0) {
                this.method3795(var4, (byte) 93);
            } else {
                this.field9328 = new int[arg0.method793((byte) 106)][4];
                for (int var5 = 0; var5 < this.field9328.length; ++var5) {
                    this.field9328[var5][0] = arg0.method763(class18.method125(arg2, 62));
                    this.field9328[var5][1] = arg0.method793((byte) 55) << 4;
                    this.field9328[var5][2] = arg0.method793((byte) 87) << 4;
                    this.field9328[var5][3] = arg0.method793((byte) 40) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (arg0 != -996226836) {
            this.method153(-118, (byte) 43);
        }
        if (this.field9328 == null) {
            this.method3795(1, (byte) 93);
        }
        ++field9329;
        this.method3792((byte) -111);
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
    public class672() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(B)V")
    private final void method3792(byte arg0) {
        ++field9326;
        if (arg0 >= -107) {
            this.method3795(38, (byte) -18);
        }
        int var2 = this.field9328.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~this.field9328[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field9328[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field9328[var4];
                    if (var4 > 0) {
                        int[] var12 = this.field9328[var4 - 1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                        int var14 = 4096 - var13;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    } else {
                        var10 = var11[3];
                        var9 = var11[2];
                        var8 = var11[1];
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var10 >> 4;
                int var17 = var8 >> 4;
                if (~var17 <= -1) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field9323[var3] = class530.method3011(class530.method3011(var17 << 16, var15 << 8), var16);
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field9324;
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (arg1 <= 57) {
            method3793(118);
        }
        if (super.field4938.field7848) {
            int[] var4 = this.method2221(0, arg0, 39);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class769.field10597; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field9323[var9];
                var5[var8] = class204.method1456(var10 >> 12, 4080);
                var6[var8] = class204.method1456(var10 >> 4, 4080);
                var7[var8] = class204.method1456(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V")
    public static void method3793(int arg0) {
        field9331 = null;
        if (arg0 != -10846) {
            field9331 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIII)V")
    public static final void method3794(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 31907) {
            method3793(23);
        }
        ++field9322;
        if (arg0 != 8 && arg0 != 16) {
            class549 var5 = class325.field4448[arg4][arg3][arg2];
            if (var5 != null) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        var5.field7460 = 0;
                    }
                } else {
                    var5.field7470 = 0;
                }
            }
            class393.method2384((byte) 84);
        } else {
            for (int var6 = 0; ~class660.field9144 < ~var6; ++var6) {
                class616 var7 = class262.field3687[var6];
                if (var7.field8578 == arg0 && ~var7.field8580 == ~arg3 && var7.field8574 == arg2 || var7.field8587 == arg3 && ~var7.field8574 == ~arg2) {
                    if (~class660.field9144 != ~var6) {
                        class275.method1769(class262.field3687, var6 + 1, class262.field3687, var6, -var6 + -1 + class262.field3687.length);
                    }
                    --class660.field9144;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(IB)V")
    private final void method3795(int arg0, byte arg1) {
        ++field9330;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field9328 = new int[4][4];
                                this.field9328[0][2] = 4096;
                                this.field9328[0][3] = 0;
                                this.field9328[0][0] = 2048;
                                this.field9328[0][1] = 0;
                                this.field9328[1][1] = 4096;
                                this.field9328[1][3] = 0;
                                this.field9328[1][2] = 4096;
                                this.field9328[1][0] = 2867;
                                this.field9328[2][1] = 4096;
                                this.field9328[2][0] = 3276;
                                this.field9328[2][3] = 0;
                                this.field9328[2][2] = 4096;
                                this.field9328[3][3] = 0;
                                this.field9328[3][2] = 0;
                                this.field9328[3][0] = 4096;
                                this.field9328[3][1] = 4096;
                            } else {
                                this.field9328 = new int[16][4];
                                this.field9328[0][3] = 321;
                                this.field9328[0][2] = 192;
                                this.field9328[0][1] = 80;
                                this.field9328[0][0] = 0;
                                this.field9328[1][1] = 321;
                                this.field9328[1][2] = 449;
                                this.field9328[1][0] = 155;
                                this.field9328[1][3] = 562;
                                this.field9328[2][0] = 389;
                                this.field9328[2][2] = 690;
                                this.field9328[2][3] = 803;
                                this.field9328[2][1] = 578;
                                this.field9328[3][0] = 671;
                                this.field9328[3][3] = 1140;
                                this.field9328[3][1] = 947;
                                this.field9328[3][2] = 995;
                                this.field9328[4][2] = 1397;
                                this.field9328[4][1] = 1285;
                                this.field9328[4][3] = 1509;
                                this.field9328[4][0] = 897;
                                this.field9328[5][2] = 1429;
                                this.field9328[5][0] = 1175;
                                this.field9328[5][3] = 1413;
                                this.field9328[5][1] = 1525;
                                this.field9328[6][2] = 1461;
                                this.field9328[6][0] = 1368;
                                this.field9328[6][1] = 1734;
                                this.field9328[6][3] = 1333;
                                this.field9328[7][2] = 1525;
                                this.field9328[7][3] = 1702;
                                this.field9328[7][1] = 1413;
                                this.field9328[7][0] = 1507;
                                this.field9328[8][0] = 1736;
                                this.field9328[8][2] = 1590;
                                this.field9328[8][3] = 2056;
                                this.field9328[8][1] = 1108;
                                this.field9328[9][0] = 2088;
                                this.field9328[9][3] = 2666;
                                this.field9328[9][1] = 1766;
                                this.field9328[9][2] = 2056;
                                this.field9328[10][1] = 2409;
                                this.field9328[10][0] = 2355;
                                this.field9328[10][2] = 2586;
                                this.field9328[10][3] = 3276;
                                this.field9328[11][0] = 2691;
                                this.field9328[11][1] = 3116;
                                this.field9328[11][2] = 3148;
                                this.field9328[11][3] = 3228;
                                this.field9328[12][2] = 3710;
                                this.field9328[12][0] = 3031;
                                this.field9328[12][1] = 3806;
                                this.field9328[12][3] = 3196;
                                this.field9328[13][2] = 3421;
                                this.field9328[13][3] = 3019;
                                this.field9328[13][1] = 3437;
                                this.field9328[13][0] = 3522;
                                this.field9328[14][1] = 3116;
                                this.field9328[14][3] = 3228;
                                this.field9328[14][0] = 3727;
                                this.field9328[14][2] = 3148;
                                this.field9328[15][2] = 2505;
                                this.field9328[15][1] = 2377;
                                this.field9328[15][0] = 4096;
                                this.field9328[15][3] = 2746;
                            }
                        } else {
                            this.field9328 = new int[6][4];
                            this.field9328[0][0] = 0;
                            this.field9328[0][1] = 0;
                            this.field9328[0][3] = 0;
                            this.field9328[0][2] = 0;
                            this.field9328[1][1] = 0;
                            this.field9328[1][2] = 0;
                            this.field9328[1][0] = 1843;
                            this.field9328[1][3] = 1493;
                            this.field9328[2][0] = 2457;
                            this.field9328[2][1] = 0;
                            this.field9328[2][2] = 0;
                            this.field9328[2][3] = 2939;
                            this.field9328[3][0] = 2781;
                            this.field9328[3][1] = 0;
                            this.field9328[3][2] = 1124;
                            this.field9328[3][3] = 3565;
                            this.field9328[4][1] = 546;
                            this.field9328[4][3] = 4031;
                            this.field9328[4][2] = 3084;
                            this.field9328[4][0] = 3481;
                            this.field9328[5][1] = 4096;
                            this.field9328[5][0] = 4096;
                            this.field9328[5][3] = 4096;
                            this.field9328[5][2] = 4096;
                        }
                    } else {
                        this.field9328 = new int[7][4];
                        this.field9328[0][2] = 0;
                        this.field9328[0][1] = 0;
                        this.field9328[0][3] = 4096;
                        this.field9328[0][0] = 0;
                        this.field9328[1][2] = 4096;
                        this.field9328[1][1] = 0;
                        this.field9328[1][0] = 663;
                        this.field9328[1][3] = 4096;
                        this.field9328[2][2] = 4096;
                        this.field9328[2][1] = 0;
                        this.field9328[2][3] = 0;
                        this.field9328[2][0] = 1363;
                        this.field9328[3][1] = 4096;
                        this.field9328[3][2] = 4096;
                        this.field9328[3][3] = 0;
                        this.field9328[3][0] = 2048;
                        this.field9328[4][0] = 2727;
                        this.field9328[4][2] = 0;
                        this.field9328[4][1] = 4096;
                        this.field9328[4][3] = 0;
                        this.field9328[5][1] = 4096;
                        this.field9328[5][0] = 3411;
                        this.field9328[5][2] = 0;
                        this.field9328[5][3] = 4096;
                        this.field9328[6][3] = 4096;
                        this.field9328[6][2] = 0;
                        this.field9328[6][1] = 0;
                        this.field9328[6][0] = 4096;
                    }
                } else {
                    this.field9328 = new int[8][4];
                    this.field9328[0][3] = 2361;
                    this.field9328[0][0] = 0;
                    this.field9328[0][1] = 2650;
                    this.field9328[0][2] = 2602;
                    this.field9328[1][2] = 1799;
                    this.field9328[1][0] = 2867;
                    this.field9328[1][1] = 2313;
                    this.field9328[1][3] = 1558;
                    this.field9328[2][0] = 3072;
                    this.field9328[2][3] = 1413;
                    this.field9328[2][2] = 1734;
                    this.field9328[2][1] = 2618;
                    this.field9328[3][2] = 1220;
                    this.field9328[3][0] = 3276;
                    this.field9328[3][3] = 947;
                    this.field9328[3][1] = 2296;
                    this.field9328[4][1] = 2072;
                    this.field9328[4][0] = 3481;
                    this.field9328[4][3] = 722;
                    this.field9328[4][2] = 963;
                    this.field9328[5][2] = 2152;
                    this.field9328[5][1] = 2730;
                    this.field9328[5][3] = 1766;
                    this.field9328[5][0] = 3686;
                    this.field9328[6][2] = 1060;
                    this.field9328[6][3] = 915;
                    this.field9328[6][0] = 3891;
                    this.field9328[6][1] = 2232;
                    this.field9328[7][1] = 1686;
                    this.field9328[7][3] = 1140;
                    this.field9328[7][0] = 4096;
                    this.field9328[7][2] = 1413;
                }
            } else {
                this.field9328 = new int[2][4];
                this.field9328[0][2] = 0;
                this.field9328[0][3] = 0;
                this.field9328[0][1] = 0;
                this.field9328[0][0] = 0;
                this.field9328[1][3] = 4096;
                this.field9328[1][1] = 4096;
                this.field9328[1][2] = 4096;
                this.field9328[1][0] = 4096;
            }
        }
        if (arg1 != 93) {
            field9325 = 45;
        }
    }
}
