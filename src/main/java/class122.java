import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class122 extends class145 {

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "[I")
    private int[] field1527 = new int[257];

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "F")
    public static float field1525 = 1.0F;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "[I")
    public static int[] field1529 = new int[13];

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "[C")
    private static char[] field1524 = new char[64];

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Ltl;")
    public static class538 field1533;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "[[I")
    private int[][] field1526;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(FIFFIIII)[F")
    public static final float[] method752(float arg0, int arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1518;
        int var8 = 2 / ((-65 - arg1) / 35);
        float[] var9 = new float[9];
        float[] var10 = new float[9];
        float var11 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var12 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var9[5] = 0.0F;
        var9[6] = -var12;
        var9[2] = var12;
        var9[4] = 1.0F;
        var9[7] = 0.0F;
        var9[0] = var11;
        var9[1] = 0.0F;
        var9[3] = 0.0F;
        var9[8] = var11;
        float var13 = 1.0F - var11;
        float[] var14 = new float[9];
        float var15 = 1.0F;
        float var16 = 0.0F;
        float var17 = (float) arg6 / 32767.0F;
        float var18 = 1.0F - var17;
        float var19 = -((float) Math.sqrt((double) (1.0F - var17 * var17)));
        float var20 = (float) Math.sqrt((double) (arg4 * arg4 - -(arg5 * arg5)));
        if (var20 == 0.0F && var17 == 0.0F) {
            var10 = var9;
        } else {
            if (var20 != 0.0F) {
                var15 = (float) (-arg5) / var20;
                var16 = (float) arg4 / var20;
            }
            var14[3] = -var16 * var19;
            var14[8] = var16 * var16 * var18 + var17;
            var14[0] = var15 * var15 * var18 + var17;
            var14[5] = var15 * var19;
            var14[6] = var15 * var16 * var18;
            var14[4] = var17;
            var14[7] = -var15 * var19;
            var14[1] = var16 * var19;
            var14[2] = var15 * var16 * var18;
            var10[0] = var9[2] * var14[6] + var9[0] * var14[0] + var9[1] * var14[3];
            var10[1] = var9[2] * var14[7] + var9[0] * var14[1] + var9[1] * var14[4];
            var10[2] = var9[2] * var14[8] + var9[1] * var14[5] + var9[0] * var14[2];
            var10[3] = var9[5] * var14[6] + var9[3] * var14[0] + var9[4] * var14[3];
            var10[4] = var9[5] * var14[7] + var9[4] * var14[4] + var9[3] * var14[1];
            var10[6] = var9[8] * var14[6] + var9[6] * var14[0] + var9[7] * var14[3];
            var10[5] = var9[5] * var14[8] + var9[3] * var14[2] + var9[4] * var14[5];
            var10[7] = var9[8] * var14[7] + var9[7] * var14[4] + var9[6] * var14[1];
            var10[8] = var9[8] * var14[8] + var9[7] * var14[5] + var9[6] * var14[2];
        }
        var10[3] *= arg0;
        var10[0] *= arg3;
        var10[1] *= arg3;
        var10[8] *= arg2;
        var10[7] *= arg2;
        var10[2] *= arg3;
        var10[5] *= arg0;
        var10[4] *= arg0;
        var10[6] *= arg2;
        return var10;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIFII[FIIIB)V")
    public static final void method753(int arg0, int arg1, float arg2, int arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, byte arg9) {
        ++field1530;
        int var10 = arg3 - arg1;
        int var11 = arg8 - arg7;
        int var12 = arg6 - arg0;
        float var13 = arg5[2] * (float) var12 + arg5[0] * (float) var11 + arg5[1] * (float) var10;
        float var14 = arg5[5] * (float) var12 + arg5[4] * (float) var10 + arg5[3] * (float) var11;
        float var15 = arg5[8] * (float) var12 + arg5[7] * (float) var10 + arg5[6] * (float) var11;
        if (arg9 != 45) {
            field1525 = -0.3764064F;
        }
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = 0.5F + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg2;
        if (~arg4 != -2) {
            if (arg4 == 2) {
                var18 = -var18;
                var17 = -var17;
            } else if (arg4 == 3) {
                float var19 = var17;
                var17 = var18;
                var18 = -var19;
            }
        } else {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        }
        class633.field9112 = var18;
        class13.field113 = var17;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        ++field1531;
        if (this.field1526 == null) {
            this.method756(1, (byte) 3);
        }
        int var2 = -121 / ((arg0 - -46) / 45);
        this.method757(-96);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Leca;I)V")
    public static final void method754(class655 arg0, int arg1) {
        ++field1521;
        if (arg1 != -2032) {
            field1525 = 0.51934624F;
        }
        class588 var2 = (class588) class281.field3922.method524((byte) 115, (long) arg0.field2495);
        if (var2 != null) {
            var2.method3437(arg1 ^ 1925);
        } else {
            class474.method2903(arg0.field1757, (class385) null, arg1 ^ 1930, arg0.field2515[0], arg0.field2524[0], 0, (class78) null, arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIIIII)Z")
    public static final boolean method755(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1520;
        int var7 = arg4 % arg5;
        int var8;
        if (~var7 == -1) {
            var8 = 0;
        } else {
            var8 = -var7 + arg5;
        }
        int var9 = -((arg5 + -1 + arg1) / arg5);
        int var10 = -((arg4 + arg5 + -1) / arg5);
        if (arg3 < 59) {
            field1532 = 43;
        }
        for (int var11 = var9; ~var11 > -1; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (~arg0[arg6] == -1) {
                    return true;
                }
                arg6 += arg5;
            }
            int var13 = arg6 - var8;
            if (arg0[var13 + -1] == 0) {
                return true;
            }
            arg6 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V")
    private final void method756(int arg0, byte arg1) {
        ++field1528;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1526 = new int[4][4];
                                this.field1526[0][3] = 0;
                                this.field1526[0][0] = 2048;
                                this.field1526[0][1] = 0;
                                this.field1526[0][2] = 4096;
                                this.field1526[1][3] = 0;
                                this.field1526[1][2] = 4096;
                                this.field1526[1][0] = 2867;
                                this.field1526[1][1] = 4096;
                                this.field1526[2][3] = 0;
                                this.field1526[2][2] = 4096;
                                this.field1526[2][0] = 3276;
                                this.field1526[2][1] = 4096;
                                this.field1526[3][1] = 4096;
                                this.field1526[3][0] = 4096;
                                this.field1526[3][3] = 0;
                                this.field1526[3][2] = 0;
                            } else {
                                this.field1526 = new int[16][4];
                                this.field1526[0][0] = 0;
                                this.field1526[0][3] = 321;
                                this.field1526[0][1] = 80;
                                this.field1526[0][2] = 192;
                                this.field1526[1][2] = 449;
                                this.field1526[1][3] = 562;
                                this.field1526[1][0] = 155;
                                this.field1526[1][1] = 321;
                                this.field1526[2][0] = 389;
                                this.field1526[2][3] = 803;
                                this.field1526[2][1] = 578;
                                this.field1526[2][2] = 690;
                                this.field1526[3][1] = 947;
                                this.field1526[3][3] = 1140;
                                this.field1526[3][2] = 995;
                                this.field1526[3][0] = 671;
                                this.field1526[4][3] = 1509;
                                this.field1526[4][2] = 1397;
                                this.field1526[4][0] = 897;
                                this.field1526[4][1] = 1285;
                                this.field1526[5][2] = 1429;
                                this.field1526[5][3] = 1413;
                                this.field1526[5][1] = 1525;
                                this.field1526[5][0] = 1175;
                                this.field1526[6][2] = 1461;
                                this.field1526[6][3] = 1333;
                                this.field1526[6][0] = 1368;
                                this.field1526[6][1] = 1734;
                                this.field1526[7][0] = 1507;
                                this.field1526[7][3] = 1702;
                                this.field1526[7][1] = 1413;
                                this.field1526[7][2] = 1525;
                                this.field1526[8][3] = 2056;
                                this.field1526[8][2] = 1590;
                                this.field1526[8][1] = 1108;
                                this.field1526[8][0] = 1736;
                                this.field1526[9][0] = 2088;
                                this.field1526[9][2] = 2056;
                                this.field1526[9][3] = 2666;
                                this.field1526[9][1] = 1766;
                                this.field1526[10][3] = 3276;
                                this.field1526[10][0] = 2355;
                                this.field1526[10][1] = 2409;
                                this.field1526[10][2] = 2586;
                                this.field1526[11][0] = 2691;
                                this.field1526[11][2] = 3148;
                                this.field1526[11][3] = 3228;
                                this.field1526[11][1] = 3116;
                                this.field1526[12][0] = 3031;
                                this.field1526[12][2] = 3710;
                                this.field1526[12][3] = 3196;
                                this.field1526[12][1] = 3806;
                                this.field1526[13][3] = 3019;
                                this.field1526[13][0] = 3522;
                                this.field1526[13][2] = 3421;
                                this.field1526[13][1] = 3437;
                                this.field1526[14][3] = 3228;
                                this.field1526[14][0] = 3727;
                                this.field1526[14][2] = 3148;
                                this.field1526[14][1] = 3116;
                                this.field1526[15][3] = 2746;
                                this.field1526[15][1] = 2377;
                                this.field1526[15][2] = 2505;
                                this.field1526[15][0] = 4096;
                            }
                        } else {
                            this.field1526 = new int[6][4];
                            this.field1526[0][1] = 0;
                            this.field1526[0][2] = 0;
                            this.field1526[0][3] = 0;
                            this.field1526[0][0] = 0;
                            this.field1526[1][1] = 0;
                            this.field1526[1][3] = 1493;
                            this.field1526[1][2] = 0;
                            this.field1526[1][0] = 1843;
                            this.field1526[2][2] = 0;
                            this.field1526[2][1] = 0;
                            this.field1526[2][0] = 2457;
                            this.field1526[2][3] = 2939;
                            this.field1526[3][2] = 1124;
                            this.field1526[3][0] = 2781;
                            this.field1526[3][3] = 3565;
                            this.field1526[3][1] = 0;
                            this.field1526[4][2] = 3084;
                            this.field1526[4][1] = 546;
                            this.field1526[4][3] = 4031;
                            this.field1526[4][0] = 3481;
                            this.field1526[5][3] = 4096;
                            this.field1526[5][0] = 4096;
                            this.field1526[5][2] = 4096;
                            this.field1526[5][1] = 4096;
                        }
                    } else {
                        this.field1526 = new int[7][4];
                        this.field1526[0][0] = 0;
                        this.field1526[0][3] = 4096;
                        this.field1526[0][1] = 0;
                        this.field1526[0][2] = 0;
                        this.field1526[1][3] = 4096;
                        this.field1526[1][1] = 0;
                        this.field1526[1][2] = 4096;
                        this.field1526[1][0] = 663;
                        this.field1526[2][2] = 4096;
                        this.field1526[2][0] = 1363;
                        this.field1526[2][1] = 0;
                        this.field1526[2][3] = 0;
                        this.field1526[3][1] = 4096;
                        this.field1526[3][0] = 2048;
                        this.field1526[3][2] = 4096;
                        this.field1526[3][3] = 0;
                        this.field1526[4][1] = 4096;
                        this.field1526[4][2] = 0;
                        this.field1526[4][0] = 2727;
                        this.field1526[4][3] = 0;
                        this.field1526[5][2] = 0;
                        this.field1526[5][3] = 4096;
                        this.field1526[5][1] = 4096;
                        this.field1526[5][0] = 3411;
                        this.field1526[6][1] = 0;
                        this.field1526[6][3] = 4096;
                        this.field1526[6][0] = 4096;
                        this.field1526[6][2] = 0;
                    }
                } else {
                    this.field1526 = new int[8][4];
                    this.field1526[0][0] = 0;
                    this.field1526[0][3] = 2361;
                    this.field1526[0][2] = 2602;
                    this.field1526[0][1] = 2650;
                    this.field1526[1][1] = 2313;
                    this.field1526[1][3] = 1558;
                    this.field1526[1][2] = 1799;
                    this.field1526[1][0] = 2867;
                    this.field1526[2][3] = 1413;
                    this.field1526[2][0] = 3072;
                    this.field1526[2][1] = 2618;
                    this.field1526[2][2] = 1734;
                    this.field1526[3][0] = 3276;
                    this.field1526[3][3] = 947;
                    this.field1526[3][2] = 1220;
                    this.field1526[3][1] = 2296;
                    this.field1526[4][3] = 722;
                    this.field1526[4][1] = 2072;
                    this.field1526[4][2] = 963;
                    this.field1526[4][0] = 3481;
                    this.field1526[5][1] = 2730;
                    this.field1526[5][3] = 1766;
                    this.field1526[5][2] = 2152;
                    this.field1526[5][0] = 3686;
                    this.field1526[6][1] = 2232;
                    this.field1526[6][0] = 3891;
                    this.field1526[6][3] = 915;
                    this.field1526[6][2] = 1060;
                    this.field1526[7][2] = 1413;
                    this.field1526[7][1] = 1686;
                    this.field1526[7][0] = 4096;
                    this.field1526[7][3] = 1140;
                }
            } else {
                this.field1526 = new int[2][4];
                this.field1526[0][0] = 0;
                this.field1526[0][2] = 0;
                this.field1526[0][1] = 0;
                this.field1526[0][3] = 0;
                this.field1526[1][2] = 4096;
                this.field1526[1][1] = 4096;
                this.field1526[1][3] = 4096;
                this.field1526[1][0] = 4096;
            }
        }
        int var4 = -41 % ((-64 - arg1) / 34);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field1517;
        if (arg1 >= -67) {
            field1529 = null;
        }
        if (~arg0 == -1) {
            int var4 = arg2.method1177(255);
            if (var4 != 0) {
                this.method756(var4, (byte) -104);
            } else {
                this.field1526 = new int[arg2.method1177(255)][4];
                for (int var5 = 0; ~this.field1526.length < ~var5; ++var5) {
                    this.field1526[var5][0] = arg2.method1220(-121);
                    this.field1526[var5][1] = arg2.method1177(255) << 4;
                    this.field1526[var5][2] = arg2.method1177(255) << 4;
                    this.field1526[var5][3] = arg2.method1177(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        if (arg0 >= -28) {
            return null;
        } else {
            ++field1522;
            int[][] var3 = super.field1792.method1826(arg1, -16486);
            if (super.field1792.field3917) {
                int[] var4 = this.method865(0, arg1, (byte) -118);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; class647.field9368 > var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field1527[var9];
                    var5[var8] = class643.method3659(4080, var10 >> 12);
                    var6[var8] = class643.method3659(65280, var10) >> 4;
                    var7[var8] = class643.method3659(4080, var10 << 4);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V")
    private final void method757(int arg0) {
        if (arg0 > -54) {
            method758(4);
        }
        ++field1519;
        int var2 = this.field1526.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && var5 >= this.field1526[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 < ~var4) {
                    int[] var7 = this.field1526[var4];
                    if (~var4 >= -1) {
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field1526[var4 + -1];
                        int var12 = (var5 - var11[0] << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[3] * var12 + var11[3] * var13 >> 12;
                        var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field1526[var2 + -1];
                    var10 = var14[1];
                    var9 = var14[3];
                    var8 = var14[2];
                }
                int var15 = var10 >> 4;
                int var16 = var9 >> 4;
                int var17 = var8 >> 4;
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field1527[var3] = class283.method1834(var16, class283.method1834(var17 << 8, var15 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "(I)V")
    public static void method758(int arg0) {
        field1529 = null;
        field1533 = null;
        int var1 = -6 % ((-13 - arg0) / 60);
        field1524 = null;
    }

    static {
        for (int var0 = 0; var0 < 26; ++var0) {
            field1524[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field1524[var1] = (char) (var1 + 97 + -26);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field1524[var2] = (char) (var2 + 48 - 52);
        }
        field1524[62] = '+';
        field1524[63] = '/';
    }
}
