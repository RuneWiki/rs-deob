import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class223 extends class748 {

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "[I")
    private int[] field3129 = new int[257];

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "F")
    public static float field3131 = 1024.0F;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field3137 = -1;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "[Lnea;")
    public static class154[] field3138 = new class154[14];

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "Ldda;")
    public static class392 field3134;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "[[I")
    private int[][] field3141;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 8)
    public final void method23(byte arg0) {
        if (this.field3141 == null) {
            this.method1450(1, 122);
        }
        ++field3135;
        this.method1449(2);
        if (arg0 != 67) {
            field3130 = 101;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 1000)
    public class223() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZLvj;)V", line = 27)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field3136;
        if (arg1) {
            field3134 = null;
        }
        if (arg0 == 0) {
            int var4 = arg2.method194((byte) 119);
            if (~var4 != -1) {
                this.method1450(var4, 114);
            } else {
                this.field3141 = new int[arg2.method194((byte) 119)][4];
                for (int var5 = 0; ~var5 > ~this.field3141.length; ++var5) {
                    this.field3141[var5][0] = arg2.method193(2);
                    this.field3141[var5][1] = arg2.method194((byte) 119) << 4;
                    this.field3141[var5][2] = arg2.method194((byte) 119) << 4;
                    this.field3141[var5][3] = arg2.method194((byte) 119) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V", line = 67)
    private final void method1449(int arg0) {
        ++field3133;
        int var2 = this.field3141.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && this.field3141[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 > var4) {
                    int[] var7 = this.field3141[var4];
                    if (~var4 >= -1) {
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field3141[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = 4096 - var12;
                        var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var9 = var7[3] * var12 + var11[3] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field3141[var2 + -1];
                    var10 = var14[1];
                    var9 = var14[3];
                    var8 = var14[2];
                }
                int var15 = var9 >> 4;
                int var16 = var8 >> 4;
                int var17 = var10 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (~var17 <= -1) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var15 >= 0) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field3129[var3] = class747.method4153(class747.method4153(var17 << 16, var16 << 8), var15);
            }
        }
        if (arg0 != 2) {
            method1452(-111, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[[I", line = 171)
    public final int[][] method445(int arg0, int arg1) {
        ++field3143;
        int[][] var3 = super.field10420.method930(arg1 + 29784, arg0);
        if (super.field10420.field1979) {
            int[] var4 = this.method4157(0, (byte) -104, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class424.field5889 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field3129[var9];
                var5[var8] = class136.method878(16711680, var10) >> 12;
                var6[var8] = class136.method878(var10 >> 4, 4080);
                var7[var8] = class136.method878(var10 << 4, 4080);
            }
        }
        if (arg1 != 0) {
            method1452(-78, (byte) 99);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V", line = 231)
    private final void method1450(int arg0, int arg1) {
        ++field3140;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3141 = new int[4][4];
                                this.field3141[0][2] = 4096;
                                this.field3141[0][1] = 0;
                                this.field3141[0][0] = 2048;
                                this.field3141[0][3] = 0;
                                this.field3141[1][2] = 4096;
                                this.field3141[1][1] = 4096;
                                this.field3141[1][0] = 2867;
                                this.field3141[1][3] = 0;
                                this.field3141[2][2] = 4096;
                                this.field3141[2][0] = 3276;
                                this.field3141[2][1] = 4096;
                                this.field3141[2][3] = 0;
                                this.field3141[3][2] = 0;
                                this.field3141[3][0] = 4096;
                                this.field3141[3][1] = 4096;
                                this.field3141[3][3] = 0;
                            } else {
                                this.field3141 = new int[16][4];
                                this.field3141[0][2] = 192;
                                this.field3141[0][1] = 80;
                                this.field3141[0][0] = 0;
                                this.field3141[0][3] = 321;
                                this.field3141[1][3] = 562;
                                this.field3141[1][0] = 155;
                                this.field3141[1][2] = 449;
                                this.field3141[1][1] = 321;
                                this.field3141[2][0] = 389;
                                this.field3141[2][3] = 803;
                                this.field3141[2][1] = 578;
                                this.field3141[2][2] = 690;
                                this.field3141[3][1] = 947;
                                this.field3141[3][0] = 671;
                                this.field3141[3][3] = 1140;
                                this.field3141[3][2] = 995;
                                this.field3141[4][2] = 1397;
                                this.field3141[4][0] = 897;
                                this.field3141[4][1] = 1285;
                                this.field3141[4][3] = 1509;
                                this.field3141[5][2] = 1429;
                                this.field3141[5][1] = 1525;
                                this.field3141[5][3] = 1413;
                                this.field3141[5][0] = 1175;
                                this.field3141[6][1] = 1734;
                                this.field3141[6][2] = 1461;
                                this.field3141[6][3] = 1333;
                                this.field3141[6][0] = 1368;
                                this.field3141[7][0] = 1507;
                                this.field3141[7][3] = 1702;
                                this.field3141[7][2] = 1525;
                                this.field3141[7][1] = 1413;
                                this.field3141[8][2] = 1590;
                                this.field3141[8][0] = 1736;
                                this.field3141[8][1] = 1108;
                                this.field3141[8][3] = 2056;
                                this.field3141[9][3] = 2666;
                                this.field3141[9][0] = 2088;
                                this.field3141[9][2] = 2056;
                                this.field3141[9][1] = 1766;
                                this.field3141[10][0] = 2355;
                                this.field3141[10][3] = 3276;
                                this.field3141[10][2] = 2586;
                                this.field3141[10][1] = 2409;
                                this.field3141[11][0] = 2691;
                                this.field3141[11][1] = 3116;
                                this.field3141[11][2] = 3148;
                                this.field3141[11][3] = 3228;
                                this.field3141[12][3] = 3196;
                                this.field3141[12][2] = 3710;
                                this.field3141[12][1] = 3806;
                                this.field3141[12][0] = 3031;
                                this.field3141[13][0] = 3522;
                                this.field3141[13][3] = 3019;
                                this.field3141[13][2] = 3421;
                                this.field3141[13][1] = 3437;
                                this.field3141[14][3] = 3228;
                                this.field3141[14][2] = 3148;
                                this.field3141[14][0] = 3727;
                                this.field3141[14][1] = 3116;
                                this.field3141[15][1] = 2377;
                                this.field3141[15][2] = 2505;
                                this.field3141[15][0] = 4096;
                                this.field3141[15][3] = 2746;
                            }
                        } else {
                            this.field3141 = new int[6][4];
                            this.field3141[0][0] = 0;
                            this.field3141[0][1] = 0;
                            this.field3141[0][3] = 0;
                            this.field3141[0][2] = 0;
                            this.field3141[1][0] = 1843;
                            this.field3141[1][1] = 0;
                            this.field3141[1][2] = 0;
                            this.field3141[1][3] = 1493;
                            this.field3141[2][0] = 2457;
                            this.field3141[2][2] = 0;
                            this.field3141[2][3] = 2939;
                            this.field3141[2][1] = 0;
                            this.field3141[3][3] = 3565;
                            this.field3141[3][2] = 1124;
                            this.field3141[3][1] = 0;
                            this.field3141[3][0] = 2781;
                            this.field3141[4][3] = 4031;
                            this.field3141[4][0] = 3481;
                            this.field3141[4][2] = 3084;
                            this.field3141[4][1] = 546;
                            this.field3141[5][0] = 4096;
                            this.field3141[5][1] = 4096;
                            this.field3141[5][3] = 4096;
                            this.field3141[5][2] = 4096;
                        }
                    } else {
                        this.field3141 = new int[7][4];
                        this.field3141[0][3] = 4096;
                        this.field3141[0][1] = 0;
                        this.field3141[0][2] = 0;
                        this.field3141[0][0] = 0;
                        this.field3141[1][0] = 663;
                        this.field3141[1][2] = 4096;
                        this.field3141[1][1] = 0;
                        this.field3141[1][3] = 4096;
                        this.field3141[2][2] = 4096;
                        this.field3141[2][1] = 0;
                        this.field3141[2][0] = 1363;
                        this.field3141[2][3] = 0;
                        this.field3141[3][2] = 4096;
                        this.field3141[3][1] = 4096;
                        this.field3141[3][0] = 2048;
                        this.field3141[3][3] = 0;
                        this.field3141[4][0] = 2727;
                        this.field3141[4][3] = 0;
                        this.field3141[4][2] = 0;
                        this.field3141[4][1] = 4096;
                        this.field3141[5][3] = 4096;
                        this.field3141[5][2] = 0;
                        this.field3141[5][1] = 4096;
                        this.field3141[5][0] = 3411;
                        this.field3141[6][2] = 0;
                        this.field3141[6][1] = 0;
                        this.field3141[6][0] = 4096;
                        this.field3141[6][3] = 4096;
                    }
                } else {
                    this.field3141 = new int[8][4];
                    this.field3141[0][3] = 2361;
                    this.field3141[0][2] = 2602;
                    this.field3141[0][1] = 2650;
                    this.field3141[0][0] = 0;
                    this.field3141[1][0] = 2867;
                    this.field3141[1][3] = 1558;
                    this.field3141[1][2] = 1799;
                    this.field3141[1][1] = 2313;
                    this.field3141[2][1] = 2618;
                    this.field3141[2][0] = 3072;
                    this.field3141[2][2] = 1734;
                    this.field3141[2][3] = 1413;
                    this.field3141[3][1] = 2296;
                    this.field3141[3][3] = 947;
                    this.field3141[3][2] = 1220;
                    this.field3141[3][0] = 3276;
                    this.field3141[4][2] = 963;
                    this.field3141[4][3] = 722;
                    this.field3141[4][0] = 3481;
                    this.field3141[4][1] = 2072;
                    this.field3141[5][0] = 3686;
                    this.field3141[5][2] = 2152;
                    this.field3141[5][1] = 2730;
                    this.field3141[5][3] = 1766;
                    this.field3141[6][1] = 2232;
                    this.field3141[6][0] = 3891;
                    this.field3141[6][2] = 1060;
                    this.field3141[6][3] = 915;
                    this.field3141[7][0] = 4096;
                    this.field3141[7][2] = 1413;
                    this.field3141[7][1] = 1686;
                    this.field3141[7][3] = 1140;
                }
            } else {
                this.field3141 = new int[2][4];
                this.field3141[0][3] = 0;
                this.field3141[0][2] = 0;
                this.field3141[0][1] = 0;
                this.field3141[0][0] = 0;
                this.field3141[1][0] = 4096;
                this.field3141[1][2] = 4096;
                this.field3141[1][1] = 4096;
                this.field3141[1][3] = 4096;
            }
        }
        if (arg1 <= 100) {
            this.method1450(-55, 86);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)V", line = 482)
    public static final void method1451(int arg0, boolean arg1) {
        ++field3132;
        class118 var2 = class126.method814(true, arg0, 16);
        var2.method778(27970);
        if (arg1) {
            field3134 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I", line = 498)
    public static final int method1452(int arg0, byte arg1) {
        ++field3128;
        if (arg1 <= 100) {
            field3134 = null;
        }
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)V", line = 514)
    public static void method1453(int arg0) {
        field3134 = null;
        field3138 = null;
        int var1 = -36 % ((arg0 - 9) / 55);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLhg;)V", line = 524)
    public static final void method1454(byte arg0, class584 arg1) {
        if (arg0 >= 57) {
            if (arg1.field8309 != -1) {
                class103 var2 = class274.field3684.method1881((byte) -80, arg1.field8309);
                if (var2 != null && var2.field1472 != null) {
                    label366: {
                        ++arg1.field8379;
                        if (~var2.field1472.length < ~arg1.field8399 && ~var2.field1493[arg1.field8399] > ~arg1.field8379) {
                            ++arg1.field8390;
                            ++arg1.field8399;
                            arg1.field8379 = 1;
                            if (!arg1.field8312) {
                                class694.method3941(arg1.field8399, var2, arg1, true);
                            }
                        }
                        if (~var2.field1472.length >= ~arg1.field8399) {
                            arg1.field8399 = 0;
                            arg1.field8379 = 0;
                            if (arg1.field8352) {
                                arg1.field8309 = arg1.method3482(0).method3515(-1);
                                if (arg1.field8309 == -1) {
                                    arg1.field8352 = false;
                                    break label366;
                                }
                                var2 = class274.field3684.method1881((byte) -80, arg1.field8309);
                            }
                            if (!arg1.field8312) {
                                class694.method3941(arg1.field8399, var2, arg1, true);
                            }
                        }
                        arg1.field8390 = arg1.field8399 + 1;
                        if (var2.field1472 == null) {
                            arg1.field8352 = false;
                            arg1.field8309 = -1;
                        } else if (~var2.field1472.length >= ~arg1.field8390) {
                            arg1.field8390 = 0;
                        }
                    }
                } else {
                    arg1.field8309 = -1;
                    arg1.field8352 = false;
                }
            }
            ++field3139;
            if (~arg1.field8313 != 0 && ~arg1.field8331 >= ~class245.field3409) {
                class42 var3 = class267.field3625.method3986(-1, arg1.field8313);
                int var4 = var3.field585;
                if (~var4 != 0) {
                    label367: {
                        class103 var5 = class274.field3684.method1881((byte) -80, var4);
                        if (var3.field594) {
                            if (~var5.field1481 != -4) {
                                if (var5.field1481 == 1 && ~arg1.field8416 < -1 && class245.field3409 >= arg1.field8388 && ~class245.field3409 < ~arg1.field8402) {
                                    arg1.field8331 = class245.field3409 - -1;
                                    break label367;
                                }
                            } else if (~arg1.field8416 < -1 && ~class245.field3409 <= ~arg1.field8388 && class245.field3409 > arg1.field8402) {
                                arg1.field8313 = -1;
                                break label367;
                            }
                        }
                        if (var5 != null && var5.field1472 != null) {
                            if (~arg1.field8375 > -1) {
                                arg1.field8375 = 0;
                                if (!arg1.field8312) {
                                    class694.method3941(0, var5, arg1, true);
                                }
                            }
                            ++arg1.field8401;
                            if (var5.field1472.length > arg1.field8375 && var5.field1493[arg1.field8375] < arg1.field8401) {
                                ++arg1.field8375;
                                arg1.field8401 = 1;
                                if (!arg1.field8312) {
                                    class694.method3941(arg1.field8375, var5, arg1, true);
                                }
                            }
                            if (var5.field1472.length <= arg1.field8375) {
                                if (var3.field594) {
                                    ++arg1.field8377;
                                    arg1.field8375 -= var5.field1487;
                                    if (arg1.field8377 >= var5.field1492) {
                                        arg1.field8313 = -1;
                                    } else if (arg1.field8375 >= 0 && ~var5.field1472.length < ~arg1.field8375) {
                                        if (!arg1.field8312) {
                                            class694.method3941(arg1.field8375, var5, arg1, true);
                                        }
                                    } else {
                                        arg1.field8313 = -1;
                                    }
                                } else {
                                    arg1.field8313 = -1;
                                }
                            }
                            arg1.field8337 = arg1.field8375 + 1;
                            if (~var5.field1472.length >= ~arg1.field8337) {
                                if (var3.field594) {
                                    arg1.field8337 -= var5.field1487;
                                    if (arg1.field8377 + 1 < var5.field1492) {
                                        if (arg1.field8337 < 0 || ~var5.field1472.length >= ~arg1.field8337) {
                                            arg1.field8337 = -1;
                                        }
                                    } else {
                                        arg1.field8337 = -1;
                                    }
                                } else {
                                    arg1.field8337 = -1;
                                }
                            }
                        } else {
                            arg1.field8313 = -1;
                        }
                    }
                } else {
                    arg1.field8313 = -1;
                }
            }
            if (~arg1.field8393 != 0 && ~arg1.field8398 >= ~class245.field3409) {
                class42 var6 = class267.field3625.method3986(-1, arg1.field8393);
                int var7 = var6.field585;
                if (var7 != -1) {
                    label371: {
                        class103 var8 = class274.field3684.method1881((byte) -80, var7);
                        if (var6.field594) {
                            if (var8.field1481 == 3) {
                                if (~arg1.field8416 < -1 && ~class245.field3409 <= ~arg1.field8388 && arg1.field8402 < class245.field3409) {
                                    arg1.field8393 = -1;
                                    break label371;
                                }
                            } else if (~var8.field1481 == -2 && arg1.field8416 > 0 && ~arg1.field8388 >= ~class245.field3409 && ~class245.field3409 < ~arg1.field8402) {
                                arg1.field8398 = class245.field3409 + 1;
                                break label371;
                            }
                        }
                        if (var8 != null && var8.field1472 != null) {
                            if (arg1.field8358 < 0) {
                                arg1.field8358 = 0;
                                if (!arg1.field8312) {
                                    class694.method3941(0, var8, arg1, true);
                                }
                            }
                            ++arg1.field8320;
                            if (arg1.field8358 < var8.field1472.length && arg1.field8320 > var8.field1493[arg1.field8358]) {
                                arg1.field8320 = 1;
                                ++arg1.field8358;
                                if (!arg1.field8312) {
                                    class694.method3941(arg1.field8358, var8, arg1, true);
                                }
                            }
                            if (var8.field1472.length <= arg1.field8358) {
                                if (!var6.field594) {
                                    arg1.field8393 = -1;
                                } else {
                                    ++arg1.field8386;
                                    arg1.field8358 -= var8.field1487;
                                    if (arg1.field8386 < var8.field1492) {
                                        if (arg1.field8358 >= 0 && ~var8.field1472.length < ~arg1.field8358) {
                                            if (!arg1.field8312) {
                                                class694.method3941(arg1.field8358, var8, arg1, true);
                                            }
                                        } else {
                                            arg1.field8393 = -1;
                                        }
                                    } else {
                                        arg1.field8393 = -1;
                                    }
                                }
                            }
                            arg1.field8369 = arg1.field8358 + 1;
                            if (var8.field1472.length <= arg1.field8369) {
                                if (!var6.field594) {
                                    arg1.field8369 = -1;
                                } else {
                                    arg1.field8369 -= var8.field1487;
                                    if (~var8.field1492 < ~(arg1.field8386 + 1)) {
                                        if (~arg1.field8369 > -1 || var8.field1472.length <= arg1.field8369) {
                                            arg1.field8369 = -1;
                                        }
                                    } else {
                                        arg1.field8369 = -1;
                                    }
                                }
                            }
                        } else {
                            arg1.field8393 = -1;
                        }
                    }
                } else {
                    arg1.field8393 = -1;
                }
            }
            if (arg1.field8317 != -1 && ~arg1.field8391 >= -2) {
                class103 var9 = class274.field3684.method1881((byte) -80, arg1.field8317);
                if (~var9.field1481 == -4) {
                    if (arg1.field8416 > 0 && arg1.field8388 <= class245.field3409 && class245.field3409 > arg1.field8402) {
                        arg1.field8317 = -1;
                        arg1.field8348 = null;
                    }
                } else if (~var9.field1481 == -2 && ~arg1.field8416 < -1 && class245.field3409 >= arg1.field8388 && ~class245.field3409 < ~arg1.field8402) {
                    arg1.field8391 = 2;
                }
            }
            if (~arg1.field8317 != 0 && ~arg1.field8391 == -1) {
                class103 var10 = class274.field3684.method1881((byte) -80, arg1.field8317);
                if (var10 != null && var10.field1472 != null) {
                    ++arg1.field8323;
                    if (~arg1.field8357 > ~var10.field1472.length && ~arg1.field8323 < ~var10.field1493[arg1.field8357]) {
                        arg1.field8323 = 1;
                        ++arg1.field8357;
                        if (!arg1.field8312) {
                            class694.method3941(arg1.field8357, var10, arg1, true);
                        }
                    }
                    if (~arg1.field8357 <= ~var10.field1472.length) {
                        arg1.field8357 -= var10.field1487;
                        ++arg1.field8328;
                        if (var10.field1492 > arg1.field8328) {
                            if (arg1.field8357 >= 0 && arg1.field8357 < var10.field1472.length) {
                                if (!arg1.field8312) {
                                    class694.method3941(arg1.field8357, var10, arg1, true);
                                }
                            } else {
                                arg1.field8317 = -1;
                                arg1.field8348 = null;
                            }
                        } else {
                            arg1.field8348 = null;
                            arg1.field8317 = -1;
                        }
                    }
                    arg1.field8407 = arg1.field8357 + 1;
                    if (~arg1.field8407 <= ~var10.field1472.length) {
                        arg1.field8407 -= var10.field1487;
                        if (~(arg1.field8328 + 1) <= ~var10.field1492) {
                            arg1.field8407 = -1;
                        } else if (arg1.field8407 < 0 || var10.field1472.length <= arg1.field8407) {
                            arg1.field8407 = -1;
                        }
                    }
                } else {
                    arg1.field8317 = -1;
                    arg1.field8348 = null;
                }
            }
            if (arg1.field8391 > 0) {
                --arg1.field8391;
            }
            for (int var11 = 0; ~arg1.field8394.length < ~var11; ++var11) {
                class696 var12 = arg1.field8394[var11];
                if (var12 != null) {
                    if (~var12.field9714 < -1) {
                        --var12.field9714;
                    } else {
                        class103 var13 = class274.field3684.method1881((byte) -80, var12.field9715);
                        if (var13 != null && var13.field1472 != null) {
                            ++var12.field9713;
                            if (var12.field9711 < var13.field1472.length && ~var13.field1493[var12.field9711] > ~var12.field9713) {
                                ++var12.field9711;
                                var12.field9713 = 1;
                                if (!arg1.field8312) {
                                    class694.method3941(var12.field9711, var13, arg1, true);
                                }
                            }
                            if (~var13.field1472.length >= ~var12.field9711) {
                                ++var12.field9709;
                                var12.field9711 -= var13.field1487;
                                if (~var13.field1492 >= ~var12.field9709) {
                                    arg1.field8394[var11] = null;
                                } else if (var12.field9711 >= 0 && ~var12.field9711 > ~var13.field1472.length) {
                                    if (!arg1.field8312) {
                                        class694.method3941(var12.field9711, var13, arg1, true);
                                    }
                                } else {
                                    arg1.field8394[var11] = null;
                                }
                            }
                            var12.field9716 = var12.field9711 - -1;
                            if (var12.field9716 >= var13.field1472.length) {
                                var12.field9716 -= var13.field1487;
                                if (~(var12.field9709 - -1) <= ~var13.field1492) {
                                    var12.field9716 = -1;
                                } else if (~var12.field9716 > -1 || ~var12.field9716 <= ~var13.field1472.length) {
                                    var12.field9716 = -1;
                                }
                            }
                        } else {
                            arg1.field8394[var11] = null;
                        }
                    }
                }
            }
        }
    }
}
