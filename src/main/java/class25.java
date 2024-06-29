import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class25 extends class175 {

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "[I")
    private int[] field419 = new int[257];

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    public static int field424 = -2;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "Z")
    public static boolean field423 = false;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "[I")
    public static int[] field426 = new int[5];

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "Lmb;")
    public static class96 field425 = class243.method1708("::qa_op_test", (byte) 125);

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "[I")
    public static int[] field433;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "[[I")
    private int[][] field420;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "[[[I")
    public static int[][][] field418;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg1 != 64) {
            this.method150(14);
        }
        ++field428;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[] var4 = this.method1255(0, arg0, 128);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class1.field11; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field419[var9];
                var5[var8] = class130.method985(var10 >> 12, 4080);
                var6[var8] = class130.method985(var10 >> 4, 4080);
                var7[var8] = class130.method985(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILmb;)Z")
    public static final boolean method170(int arg0, class96 arg1) {
        ++field434;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = arg0; var2 < class76.field1306; ++var2) {
                if (arg1.method679(class185.field3224[var2], 18452)) {
                    return true;
                }
            }
            return arg1.method679(class236.field4047.field828, 18452);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class25() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field431;
        if (this.field420 == null) {
            this.method174(0, 1);
        }
        this.method176((byte) 40);
        if (arg0 != 2) {
            field425 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = -26 % ((-22 - arg0) / 58);
        if (arg1 == 0) {
            int var5 = arg2.method1651(4139);
            if (~var5 == -1) {
                this.field420 = new int[arg2.method1651(4139)][4];
                for (int var6 = 0; ~this.field420.length < ~var6; ++var6) {
                    this.field420[var6][0] = arg2.method1663((byte) 90);
                    this.field420[var6][1] = arg2.method1651(4139) << 4;
                    this.field420[var6][2] = arg2.method1651(4139) << 4;
                    this.field420[var6][3] = arg2.method1651(4139) << 4;
                }
            } else {
                this.method174(0, var5);
            }
        }
        ++field429;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field427;
        if (arg7 == 0) {
            class251 var10 = null;
            for (class251 var11 = (class251) class175.field3048.method1811(arg7 ^ 2); var11 != null; var11 = (class251) class175.field3048.method1810(false)) {
                if (var11.field4345 == arg8 && var11.field4338 == arg0 && var11.field4341 == arg5 && var11.field4352 == arg3) {
                    var10 = var11;
                    break;
                }
            }
            if (var10 == null) {
                var10 = new class251();
                var10.field4338 = arg0;
                var10.field4345 = arg8;
                var10.field4341 = arg5;
                var10.field4352 = arg3;
                class75.method548(false, var10);
                class175.field3048.method1814(1, var10);
            }
            var10.field4354 = arg1;
            var10.field4357 = arg4;
            var10.field4335 = arg2;
            var10.field4350 = arg6;
            var10.field4353 = arg9;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public static void method172(int arg0) {
        field426 = null;
        field418 = null;
        field425 = null;
        field433 = null;
        if (arg0 < 7) {
            field426 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
    public static final void method173(boolean arg0) {
        if (arg0) {
            field418 = null;
        }
        ++field422;
        for (class92 var1 = (class92) class262.field4592.method1811(2); var1 != null; var1 = (class92) class262.field4592.method1810(arg0)) {
            class4 var2 = var1.field1521;
            if (class216.field3712 == var2.field87 && !var2.field95) {
                if (var2.field93 <= class236.field4053) {
                    var2.method49(class62.field1063, -2);
                    if (!var2.field95) {
                        class252.method1752(var2.field87, var2.field91, var2.field85, var2.field94, 60, var2, 0, -1L, false);
                    } else {
                        var1.method1743((byte) 88);
                    }
                }
            } else {
                var1.method1743((byte) 55);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V")
    private final void method174(int arg0, int arg1) {
        ++field430;
        if (arg0 != arg1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field420 = new int[4][4];
                                    this.field420[0][2] = 4096;
                                    this.field420[0][3] = 0;
                                    this.field420[0][0] = 2048;
                                    this.field420[1][3] = 0;
                                    this.field420[1][2] = 4096;
                                    this.field420[0][1] = 0;
                                    this.field420[2][3] = 0;
                                    this.field420[3][3] = 0;
                                    this.field420[1][0] = 2867;
                                    this.field420[1][1] = 4096;
                                    this.field420[2][1] = 4096;
                                    this.field420[2][0] = 3276;
                                    this.field420[3][0] = 4096;
                                    this.field420[3][1] = 4096;
                                    this.field420[2][2] = 4096;
                                    this.field420[3][2] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field420 = new int[16][4];
                                this.field420[0][0] = 0;
                                this.field420[0][1] = 80;
                                this.field420[1][1] = 321;
                                this.field420[0][2] = 192;
                                this.field420[0][3] = 321;
                                this.field420[1][3] = 562;
                                this.field420[1][2] = 449;
                                this.field420[2][1] = 578;
                                this.field420[3][1] = 947;
                                this.field420[4][1] = 1285;
                                this.field420[2][3] = 803;
                                this.field420[5][1] = 1525;
                                this.field420[2][2] = 690;
                                this.field420[1][0] = 155;
                                this.field420[6][1] = 1734;
                                this.field420[7][1] = 1413;
                                this.field420[2][0] = 389;
                                this.field420[8][1] = 1108;
                                this.field420[9][1] = 1766;
                                this.field420[10][1] = 2409;
                                this.field420[11][1] = 3116;
                                this.field420[3][2] = 995;
                                this.field420[12][1] = 3806;
                                this.field420[3][0] = 671;
                                this.field420[13][1] = 3437;
                                this.field420[4][2] = 1397;
                                this.field420[14][1] = 3116;
                                this.field420[5][2] = 1429;
                                this.field420[3][3] = 1140;
                                this.field420[4][3] = 1509;
                                this.field420[5][3] = 1413;
                                this.field420[6][3] = 1333;
                                this.field420[7][3] = 1702;
                                this.field420[6][2] = 1461;
                                this.field420[8][3] = 2056;
                                this.field420[9][3] = 2666;
                                this.field420[4][0] = 897;
                                this.field420[5][0] = 1175;
                                this.field420[7][2] = 1525;
                                this.field420[8][2] = 1590;
                                this.field420[9][2] = 2056;
                                this.field420[10][2] = 2586;
                                this.field420[6][0] = 1368;
                                this.field420[10][3] = 3276;
                                this.field420[11][2] = 3148;
                                this.field420[15][1] = 2377;
                                this.field420[7][0] = 1507;
                                this.field420[8][0] = 1736;
                                this.field420[9][0] = 2088;
                                this.field420[10][0] = 2355;
                                this.field420[12][2] = 3710;
                                this.field420[11][0] = 2691;
                                this.field420[12][0] = 3031;
                                this.field420[11][3] = 3228;
                                this.field420[13][2] = 3421;
                                this.field420[14][2] = 3148;
                                this.field420[12][3] = 3196;
                                this.field420[13][0] = 3522;
                                this.field420[13][3] = 3019;
                                this.field420[15][2] = 2505;
                                this.field420[14][3] = 3228;
                                this.field420[14][0] = 3727;
                                this.field420[15][3] = 2746;
                                this.field420[15][0] = 4096;
                            }
                        } else {
                            this.field420 = new int[6][4];
                            this.field420[0][0] = 0;
                            this.field420[1][0] = 1843;
                            this.field420[0][3] = 0;
                            this.field420[0][1] = 0;
                            this.field420[0][2] = 0;
                            this.field420[2][0] = 2457;
                            this.field420[1][1] = 0;
                            this.field420[1][2] = 0;
                            this.field420[2][1] = 0;
                            this.field420[1][3] = 1493;
                            this.field420[2][3] = 2939;
                            this.field420[3][3] = 3565;
                            this.field420[3][1] = 0;
                            this.field420[3][0] = 2781;
                            this.field420[2][2] = 0;
                            this.field420[4][3] = 4031;
                            this.field420[3][2] = 1124;
                            this.field420[4][0] = 3481;
                            this.field420[4][1] = 546;
                            this.field420[4][2] = 3084;
                            this.field420[5][1] = 4096;
                            this.field420[5][2] = 4096;
                            this.field420[5][0] = 4096;
                            this.field420[5][3] = 4096;
                        }
                    } else {
                        this.field420 = new int[7][4];
                        this.field420[0][3] = 4096;
                        this.field420[0][1] = 0;
                        this.field420[0][0] = 0;
                        this.field420[1][3] = 4096;
                        this.field420[0][2] = 0;
                        this.field420[1][0] = 663;
                        this.field420[2][0] = 1363;
                        this.field420[1][2] = 4096;
                        this.field420[3][0] = 2048;
                        this.field420[1][1] = 0;
                        this.field420[4][0] = 2727;
                        this.field420[2][2] = 4096;
                        this.field420[2][3] = 0;
                        this.field420[3][2] = 4096;
                        this.field420[2][1] = 0;
                        this.field420[3][1] = 4096;
                        this.field420[4][1] = 4096;
                        this.field420[5][0] = 3411;
                        this.field420[5][1] = 4096;
                        this.field420[6][0] = 4096;
                        this.field420[6][1] = 0;
                        this.field420[4][2] = 0;
                        this.field420[5][2] = 0;
                        this.field420[3][3] = 0;
                        this.field420[6][2] = 0;
                        this.field420[4][3] = 0;
                        this.field420[5][3] = 4096;
                        this.field420[6][3] = 4096;
                    }
                } else {
                    this.field420 = new int[8][4];
                    this.field420[0][1] = 2650;
                    this.field420[0][0] = 0;
                    this.field420[1][0] = 2867;
                    this.field420[0][2] = 2602;
                    this.field420[1][1] = 2313;
                    this.field420[1][2] = 1799;
                    this.field420[2][1] = 2618;
                    this.field420[3][1] = 2296;
                    this.field420[2][2] = 1734;
                    this.field420[0][3] = 2361;
                    this.field420[1][3] = 1558;
                    this.field420[4][1] = 2072;
                    this.field420[2][0] = 3072;
                    this.field420[5][1] = 2730;
                    this.field420[2][3] = 1413;
                    this.field420[3][0] = 3276;
                    this.field420[4][0] = 3481;
                    this.field420[3][3] = 947;
                    this.field420[3][2] = 1220;
                    this.field420[4][3] = 722;
                    this.field420[5][0] = 3686;
                    this.field420[4][2] = 963;
                    this.field420[5][2] = 2152;
                    this.field420[6][2] = 1060;
                    this.field420[5][3] = 1766;
                    this.field420[6][3] = 915;
                    this.field420[7][3] = 1140;
                    this.field420[6][1] = 2232;
                    this.field420[7][1] = 1686;
                    this.field420[6][0] = 3891;
                    this.field420[7][0] = 4096;
                    this.field420[7][2] = 1413;
                }
            } else {
                this.field420 = new int[2][4];
                this.field420[0][1] = 0;
                this.field420[0][0] = 0;
                this.field420[1][1] = 4096;
                this.field420[0][2] = 0;
                this.field420[0][3] = 0;
                this.field420[1][0] = 4096;
                this.field420[1][2] = 4096;
                this.field420[1][3] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIBIIIIII)V")
    public static final void method175(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = -arg8 + arg2;
        int var12 = -arg1 + arg0;
        int var13 = 983040 / arg3;
        if (arg4 <= -17) {
            ++field432;
            int var14 = 983040 / arg9;
            boolean var15;
            if (class248.field4297 > 0 && class248.field4297 % 10 < 5) {
                var15 = true;
            } else {
                var15 = false;
            }
            for (int var16 = -var13; var16 < var11 + var13; ++var16) {
                int var18 = arg3 * var16 + arg6 >> 16;
                int var19 = (var16 + 1) * arg3 + arg6 >> 16;
                int var20 = -var18 + var19;
                if (var20 > 0) {
                    int var10000 = arg10 + var19;
                    int var22 = arg10 + var18;
                    int var23 = arg8 + var16 >> 6;
                    if (~var23 <= -1 && ~(class207.field3574.length + -1) <= ~var23) {
                        int[][] var24 = class207.field3574[var23];
                        for (int var25 = -var14; ~var25 > ~(var12 + var14); ++var25) {
                            int var26 = arg9 * var25 + arg7 >> 16;
                            int var27 = arg7 - -((var25 + 1) * arg9) >> 16;
                            int var28 = var27 - var26;
                            if (var28 > 0) {
                                int var29 = arg5 + var26;
                                var10000 = arg5 + var27;
                                int var31 = arg1 + var25 >> 6;
                                if (~var31 <= -1 && var31 <= var24.length + -1 && var24[var31] != null) {
                                    int var32 = ((arg1 + var25 & 63) << 6) - -(arg8 + var16 & 63);
                                    int var33 = var24[var31][var32];
                                    if (var33 != 0) {
                                        class196 var34 = class132.method995(var33 + -1, 0);
                                        if (var15 && class175.field3051 == var34.field3402) {
                                            class224 var35 = new class224();
                                            var35.field3811 = var29;
                                            var35.field3809 = var34.field3402;
                                            var35.field3803 = var22;
                                            class74.field1268.method1814(1, var35);
                                        }
                                        class207.field3560[var34.field3402].method1057(var22 + -7, var29 + -7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (class224 var17 = (class224) class74.field1268.method1811(2); var17 != null; var17 = (class224) class74.field1268.method1810(false)) {
                class207.field3560[var17.field3809].method1057(var17.field3803 + -7, var17.field3811 + -7);
                class84.method608(var17.field3803, var17.field3811, 15, 16776960, 128);
                class84.method608(var17.field3803, var17.field3811, 7, 16777215, 256);
            }
            class74.field1268.method1817(1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)V")
    private final void method176(byte arg0) {
        ++field435;
        int var2 = this.field420.length;
        if (arg0 < 0) {
            method172(75);
        }
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~this.field420[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field420[var2 - 1];
                    var8 = var7[2];
                    var9 = var7[3];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field420[var4];
                    if (var4 > 0) {
                        int[] var12 = this.field420[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    } else {
                        var8 = var11[2];
                        var10 = var11[1];
                        var9 = var11[3];
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                int var17 = var9 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field419[var3] = class45.method348(class45.method348(var15 << 8, var16 << 16), var17);
            }
        }
    }
}
