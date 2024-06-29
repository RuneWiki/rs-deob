import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class2 extends class349 {

    @OriginalMember(owner = "client!gv", name = "K", descriptor = "[I")
    private int[] field13 = new int[257];

    @OriginalMember(owner = "client!gv", name = "I", descriptor = "Lcb;")
    public static class318 field11 = new class318(32, -1);

    @OriginalMember(owner = "client!gv", name = "G", descriptor = "F")
    public static float field9;

    @OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!gv", name = "J", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!gv", name = "L", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!gv", name = "B", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!gv", name = "F", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!gv", name = "N", descriptor = "Lek;")
    public static class540 field16;

    @OriginalMember(owner = "client!gv", name = "M", descriptor = "[[I")
    private int[][] field15;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            field16 = null;
        }
        ++field5;
        if (~arg1 == -1) {
            int var4 = arg2.method957((byte) -80);
            if (~var4 != -1) {
                this.method8(var4, false);
            } else {
                this.field15 = new int[arg2.method957((byte) -121)][4];
                for (int var5 = 0; ~this.field15.length < ~var5; ++var5) {
                    this.field15[var5][0] = arg2.method922((byte) -113);
                    this.field15[var5][1] = arg2.method957((byte) -109) << 4;
                    this.field15[var5][2] = arg2.method957((byte) -86) << 4;
                    this.field15[var5][3] = arg2.method957((byte) -119) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
    public class2() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Z")
    public static final boolean method6(int arg0, int arg1) {
        if (arg0 != -12097) {
            method12(39);
        }
        ++field14;
        return arg1 >= 0 && ~arg1 >= -4 || arg1 == 9;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIILoa;)V")
    public static final void method7(int arg0, int arg1, int arg2, int arg3, int arg4, class689 arg5) {
        ++field12;
        arg5.method1908(arg4, arg3, arg2 + arg4, arg1 + arg3);
        arg5.method3811(arg3, arg2, arg1, arg4, -16777216, 49);
        if (~class143.field1820 <= -101) {
            float var6 = (float) class561.field7667 / (float) class561.field7676;
            int var7 = arg2;
            int var8 = arg1;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg1 / var6);
            } else {
                var8 = (int) ((float) arg2 * var6);
            }
            int var9 = (-var8 + arg1) / 2 + arg3;
            int var10 = (arg2 - var7) / 2 + arg4;
            if (class531.field7340 == null || ~class531.field7340.method1159() != ~arg2 || arg1 != class531.field7340.method1154()) {
                class561.method3152(class561.field7661, class561.field7675 + class561.field7667, class561.field7676 + class561.field7661, class561.field7675, var10, var9, var10 - -var7, var8 + var9);
                class561.method3162(arg5);
                class531.field7340 = arg5.method1939(var10, var9, var7, var8, false);
            }
            class531.field7340.method2450(var10, var9);
            int var11 = class327.field4754 * var7 / class561.field7676;
            if (arg0 < 70) {
                method12(13);
            }
            int var12 = class564.field7725 * var8 / class561.field7667;
            int var13 = class520.field7207 * var7 / class561.field7676 + var10;
            int var14 = -(class407.field5736 * var8 / class561.field7667) + var9 + -var12 + var8;
            int var15 = -1996554240;
            if (class411.field5764 == class33.field322) {
                var15 = -1996488705;
            }
            arg5.method1926(var13, var14, var11, var12, var15, 1);
            arg5.method1975(var13, var14, var11, var12, var15, 0);
            if (class235.field3067 > 0) {
                int var16;
                if (~class514.field7002 >= -51) {
                    var16 = class514.field7002 * 5;
                } else {
                    var16 = -(class514.field7002 * 5) + 500;
                }
                for (class588 var17 = (class588) class561.field7658.method374((byte) 61); var17 != null; var17 = (class588) class561.field7658.method372(-20740)) {
                    class679 var18 = class561.field7649.method218(var17.field8076, (byte) 13);
                    if (class542.method3057((byte) 25, var18)) {
                        if (class613.field8375 == var17.field8076) {
                            int var19 = var17.field8075 * var7 / class561.field7676 + var10;
                            int var20 = (-var17.field8074 + class561.field7667) * var8 / class561.field7667 + var9;
                            arg5.method3811(var20 + -2, 4, 4, var19 + -2, var16 << 24 | 16776960, 77);
                        } else if (class341.field5013 != -1 && class341.field5013 == var18.field9630) {
                            int var21 = var10 - -(var17.field8075 * var7 / class561.field7676);
                            int var22 = (-var17.field8074 + class561.field7667) * var8 / class561.field7667 + var9;
                            arg5.method3811(var22 + -2, 4, 4, var21 - 2, var16 << 24 | 16776960, 75);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)V")
    private final void method8(int arg0, boolean arg1) {
        ++field6;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field15 = new int[4][4];
                                this.field15[0][3] = 0;
                                this.field15[0][0] = 2048;
                                this.field15[0][1] = 0;
                                this.field15[0][2] = 4096;
                                this.field15[1][3] = 0;
                                this.field15[1][1] = 4096;
                                this.field15[1][2] = 4096;
                                this.field15[1][0] = 2867;
                                this.field15[2][1] = 4096;
                                this.field15[2][2] = 4096;
                                this.field15[2][3] = 0;
                                this.field15[2][0] = 3276;
                                this.field15[3][1] = 4096;
                                this.field15[3][2] = 0;
                                this.field15[3][3] = 0;
                                this.field15[3][0] = 4096;
                            } else {
                                this.field15 = new int[16][4];
                                this.field15[0][3] = 321;
                                this.field15[0][1] = 80;
                                this.field15[0][2] = 192;
                                this.field15[0][0] = 0;
                                this.field15[1][1] = 321;
                                this.field15[1][3] = 562;
                                this.field15[1][2] = 449;
                                this.field15[1][0] = 155;
                                this.field15[2][2] = 690;
                                this.field15[2][0] = 389;
                                this.field15[2][3] = 803;
                                this.field15[2][1] = 578;
                                this.field15[3][0] = 671;
                                this.field15[3][3] = 1140;
                                this.field15[3][2] = 995;
                                this.field15[3][1] = 947;
                                this.field15[4][3] = 1509;
                                this.field15[4][0] = 897;
                                this.field15[4][1] = 1285;
                                this.field15[4][2] = 1397;
                                this.field15[5][0] = 1175;
                                this.field15[5][3] = 1413;
                                this.field15[5][2] = 1429;
                                this.field15[5][1] = 1525;
                                this.field15[6][3] = 1333;
                                this.field15[6][1] = 1734;
                                this.field15[6][0] = 1368;
                                this.field15[6][2] = 1461;
                                this.field15[7][3] = 1702;
                                this.field15[7][0] = 1507;
                                this.field15[7][1] = 1413;
                                this.field15[7][2] = 1525;
                                this.field15[8][3] = 2056;
                                this.field15[8][1] = 1108;
                                this.field15[8][0] = 1736;
                                this.field15[8][2] = 1590;
                                this.field15[9][3] = 2666;
                                this.field15[9][0] = 2088;
                                this.field15[9][2] = 2056;
                                this.field15[9][1] = 1766;
                                this.field15[10][1] = 2409;
                                this.field15[10][2] = 2586;
                                this.field15[10][3] = 3276;
                                this.field15[10][0] = 2355;
                                this.field15[11][3] = 3228;
                                this.field15[11][0] = 2691;
                                this.field15[11][2] = 3148;
                                this.field15[11][1] = 3116;
                                this.field15[12][3] = 3196;
                                this.field15[12][1] = 3806;
                                this.field15[12][2] = 3710;
                                this.field15[12][0] = 3031;
                                this.field15[13][1] = 3437;
                                this.field15[13][0] = 3522;
                                this.field15[13][3] = 3019;
                                this.field15[13][2] = 3421;
                                this.field15[14][3] = 3228;
                                this.field15[14][2] = 3148;
                                this.field15[14][0] = 3727;
                                this.field15[14][1] = 3116;
                                this.field15[15][1] = 2377;
                                this.field15[15][0] = 4096;
                                this.field15[15][2] = 2505;
                                this.field15[15][3] = 2746;
                            }
                        } else {
                            this.field15 = new int[6][4];
                            this.field15[0][2] = 0;
                            this.field15[0][0] = 0;
                            this.field15[0][3] = 0;
                            this.field15[0][1] = 0;
                            this.field15[1][1] = 0;
                            this.field15[1][0] = 1843;
                            this.field15[1][2] = 0;
                            this.field15[1][3] = 1493;
                            this.field15[2][0] = 2457;
                            this.field15[2][1] = 0;
                            this.field15[2][3] = 2939;
                            this.field15[2][2] = 0;
                            this.field15[3][3] = 3565;
                            this.field15[3][1] = 0;
                            this.field15[3][0] = 2781;
                            this.field15[3][2] = 1124;
                            this.field15[4][0] = 3481;
                            this.field15[4][3] = 4031;
                            this.field15[4][1] = 546;
                            this.field15[4][2] = 3084;
                            this.field15[5][0] = 4096;
                            this.field15[5][2] = 4096;
                            this.field15[5][1] = 4096;
                            this.field15[5][3] = 4096;
                        }
                    } else {
                        this.field15 = new int[7][4];
                        this.field15[0][3] = 4096;
                        this.field15[0][0] = 0;
                        this.field15[0][2] = 0;
                        this.field15[0][1] = 0;
                        this.field15[1][1] = 0;
                        this.field15[1][3] = 4096;
                        this.field15[1][0] = 663;
                        this.field15[1][2] = 4096;
                        this.field15[2][0] = 1363;
                        this.field15[2][1] = 0;
                        this.field15[2][3] = 0;
                        this.field15[2][2] = 4096;
                        this.field15[3][0] = 2048;
                        this.field15[3][2] = 4096;
                        this.field15[3][3] = 0;
                        this.field15[3][1] = 4096;
                        this.field15[4][2] = 0;
                        this.field15[4][1] = 4096;
                        this.field15[4][3] = 0;
                        this.field15[4][0] = 2727;
                        this.field15[5][3] = 4096;
                        this.field15[5][2] = 0;
                        this.field15[5][1] = 4096;
                        this.field15[5][0] = 3411;
                        this.field15[6][2] = 0;
                        this.field15[6][1] = 0;
                        this.field15[6][0] = 4096;
                        this.field15[6][3] = 4096;
                    }
                } else {
                    this.field15 = new int[8][4];
                    this.field15[0][1] = 2650;
                    this.field15[0][2] = 2602;
                    this.field15[0][0] = 0;
                    this.field15[0][3] = 2361;
                    this.field15[1][3] = 1558;
                    this.field15[1][1] = 2313;
                    this.field15[1][0] = 2867;
                    this.field15[1][2] = 1799;
                    this.field15[2][2] = 1734;
                    this.field15[2][1] = 2618;
                    this.field15[2][3] = 1413;
                    this.field15[2][0] = 3072;
                    this.field15[3][0] = 3276;
                    this.field15[3][3] = 947;
                    this.field15[3][2] = 1220;
                    this.field15[3][1] = 2296;
                    this.field15[4][2] = 963;
                    this.field15[4][0] = 3481;
                    this.field15[4][1] = 2072;
                    this.field15[4][3] = 722;
                    this.field15[5][1] = 2730;
                    this.field15[5][2] = 2152;
                    this.field15[5][3] = 1766;
                    this.field15[5][0] = 3686;
                    this.field15[6][1] = 2232;
                    this.field15[6][3] = 915;
                    this.field15[6][2] = 1060;
                    this.field15[6][0] = 3891;
                    this.field15[7][2] = 1413;
                    this.field15[7][3] = 1140;
                    this.field15[7][0] = 4096;
                    this.field15[7][1] = 1686;
                }
            } else {
                this.field15 = new int[2][4];
                this.field15[0][0] = 0;
                this.field15[0][2] = 0;
                this.field15[0][3] = 0;
                this.field15[0][1] = 0;
                this.field15[1][2] = 4096;
                this.field15[1][1] = 4096;
                this.field15[1][3] = 4096;
                this.field15[1][0] = 4096;
            }
        }
        if (arg1) {
            this.field13 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        ++field10;
        int[][] var3 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314) {
            int[] var4 = this.method2181(0, -1090477337, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class39.field497; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field13[var9];
                var5[var8] = class230.method1424(var10, 16711680) >> 12;
                var6[var8] = class230.method1424(var10, 65280) >> 4;
                var7[var8] = class230.method1424(var10, 255) << 4;
            }
        }
        int var11 = -47 / ((-32 - arg1) / 47);
        return var3;
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "(B)V")
    private final void method10(byte arg0) {
        ++field8;
        int var2 = 52 / ((arg0 - 47) / 63);
        int var3 = this.field15.length;
        if (~var3 < -1) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var3 > var7 && var6 >= this.field15[var7][0]; ++var7) {
                    ++var5;
                }
                int var12;
                int var13;
                int var14;
                if (~var5 > ~var3) {
                    int[] var8 = this.field15[var5];
                    if (~var5 < -1) {
                        int[] var9 = this.field15[var5 + -1];
                        int var10 = (-var9[0] + var6 << 12) / (var8[0] + -var9[0]);
                        int var11 = -var10 + 4096;
                        var12 = var8[2] * var10 + var9[2] * var11 >> 12;
                        var13 = var8[3] * var10 + var9[3] * var11 >> 12;
                        var14 = var8[1] * var10 - -(var9[1] * var11) >> 12;
                    } else {
                        var13 = var8[3];
                        var14 = var8[1];
                        var12 = var8[2];
                    }
                } else {
                    int[] var15 = this.field15[var3 + -1];
                    var13 = var15[3];
                    var12 = var15[2];
                    var14 = var15[1];
                }
                int var16 = var12 >> 4;
                int var17 = var14 >> 4;
                int var18 = var13 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                this.field13[var4] = class288.method1722(class288.method1722(var16 << 8, var17 << 16), var18);
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V")
    public final void method11(byte arg0) {
        if (this.field15 == null) {
            this.method8(1, false);
        }
        ++field7;
        if (arg0 >= -51) {
            field16 = null;
        }
        this.method10((byte) -97);
    }

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "(I)V")
    public static void method12(int arg0) {
        field11 = null;
        if (arg0 != -13256) {
            field16 = null;
        }
        field16 = null;
    }
}
