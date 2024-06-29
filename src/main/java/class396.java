import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class396 extends class512 {

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "[I")
    private int[] field6058 = new int[257];

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "Z")
    public static boolean field6054 = false;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "Lnk;")
    public static class326 field6051 = new class326(16, 0);

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "[[I")
    private int[][] field6061;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    public final void method74(int arg0) {
        if (arg0 == 12388) {
            if (this.field6061 == null) {
                this.method2478(1, arg0 ^ 12315);
            }
            ++field6053;
            this.method2475(0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static void method2474(int arg0) {
        field6051 = null;
        int var1 = -33 / ((58 - arg0) / 40);
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
    private final void method2475(int arg0) {
        ++field6059;
        int var2 = this.field6061.length;
        if (arg0 < var2) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && ~this.field6061[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var2 < ~var4) {
                    int[] var7 = this.field6061[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field6061[var4 + -1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                        int var10 = 4096 - var9;
                        var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var13 = var7[3] * var9 + var8[3] * var10 >> 12;
                    } else {
                        var13 = var7[3];
                        var12 = var7[1];
                        var11 = var7[2];
                    }
                } else {
                    int[] var14 = this.field6061[var2 - 1];
                    var13 = var14[3];
                    var12 = var14[1];
                    var11 = var14[2];
                }
                int var15 = var11 >> 4;
                int var16 = var13 >> 4;
                int var17 = var12 >> 4;
                if (var16 >= 0) {
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
                if (var15 >= 0) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field6058[var3] = class338.method2141(var16, class338.method2141(var17 << 16, var15 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lec;I)V")
    public static final void method2476(class68 arg0, int arg1) {
        if (arg1 != 1) {
            method2474(39);
        }
        if (class219.field3796 == arg0.field1004) {
            class445.field6633[arg0.field1098] = true;
        }
        ++field6056;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class396() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIB)I")
    public static final int method2477(int arg0, int arg1, int arg2, byte arg3) {
        ++field6060;
        int var4 = arg0 & 3;
        if (~var4 == -1) {
            return arg2;
        } else if (~var4 == -2) {
            return 7 - arg1;
        } else {
            if (arg3 != 88) {
                method2477(78, 102, -12, (byte) -55);
            }
            return ~var4 == -3 ? 7 - arg2 : arg1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)[[I")
    public final int[][] method278(int arg0, int arg1) {
        ++field6062;
        int var3 = -21 % ((arg0 - -40) / 47);
        int[][] var4 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942) {
            int[] var5 = this.method3013(false, 0, arg1);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; ~class402.field6113 < ~var9; ++var9) {
                int var10 = var5[var9] >> 4;
                if (~var10 > -1) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field6058[var10];
                var6[var9] = class344.method2224(4080, var11 >> 12);
                var7[var9] = class344.method2224(var11 >> 4, 4080);
                var8[var9] = class344.method2224(255, var11) << 4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(II)V")
    private final void method2478(int arg0, int arg1) {
        ++field6050;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field6061 = new int[4][4];
                                this.field6061[0][3] = 0;
                                this.field6061[0][0] = 2048;
                                this.field6061[0][1] = 0;
                                this.field6061[0][2] = 4096;
                                this.field6061[1][3] = 0;
                                this.field6061[1][2] = 4096;
                                this.field6061[1][0] = 2867;
                                this.field6061[1][1] = 4096;
                                this.field6061[2][2] = 4096;
                                this.field6061[2][0] = 3276;
                                this.field6061[2][3] = 0;
                                this.field6061[2][1] = 4096;
                                this.field6061[3][3] = 0;
                                this.field6061[3][2] = 0;
                                this.field6061[3][0] = 4096;
                                this.field6061[3][1] = 4096;
                            } else {
                                this.field6061 = new int[16][4];
                                this.field6061[0][0] = 0;
                                this.field6061[0][1] = 80;
                                this.field6061[0][2] = 192;
                                this.field6061[0][3] = 321;
                                this.field6061[1][2] = 449;
                                this.field6061[1][1] = 321;
                                this.field6061[1][0] = 155;
                                this.field6061[1][3] = 562;
                                this.field6061[2][1] = 578;
                                this.field6061[2][0] = 389;
                                this.field6061[2][3] = 803;
                                this.field6061[2][2] = 690;
                                this.field6061[3][1] = 947;
                                this.field6061[3][0] = 671;
                                this.field6061[3][3] = 1140;
                                this.field6061[3][2] = 995;
                                this.field6061[4][0] = 897;
                                this.field6061[4][3] = 1509;
                                this.field6061[4][1] = 1285;
                                this.field6061[4][2] = 1397;
                                this.field6061[5][1] = 1525;
                                this.field6061[5][0] = 1175;
                                this.field6061[5][3] = 1413;
                                this.field6061[5][2] = 1429;
                                this.field6061[6][0] = 1368;
                                this.field6061[6][1] = 1734;
                                this.field6061[6][2] = 1461;
                                this.field6061[6][3] = 1333;
                                this.field6061[7][0] = 1507;
                                this.field6061[7][2] = 1525;
                                this.field6061[7][1] = 1413;
                                this.field6061[7][3] = 1702;
                                this.field6061[8][2] = 1590;
                                this.field6061[8][3] = 2056;
                                this.field6061[8][0] = 1736;
                                this.field6061[8][1] = 1108;
                                this.field6061[9][0] = 2088;
                                this.field6061[9][1] = 1766;
                                this.field6061[9][3] = 2666;
                                this.field6061[9][2] = 2056;
                                this.field6061[10][2] = 2586;
                                this.field6061[10][1] = 2409;
                                this.field6061[10][3] = 3276;
                                this.field6061[10][0] = 2355;
                                this.field6061[11][1] = 3116;
                                this.field6061[11][2] = 3148;
                                this.field6061[11][0] = 2691;
                                this.field6061[11][3] = 3228;
                                this.field6061[12][0] = 3031;
                                this.field6061[12][1] = 3806;
                                this.field6061[12][2] = 3710;
                                this.field6061[12][3] = 3196;
                                this.field6061[13][0] = 3522;
                                this.field6061[13][3] = 3019;
                                this.field6061[13][2] = 3421;
                                this.field6061[13][1] = 3437;
                                this.field6061[14][0] = 3727;
                                this.field6061[14][1] = 3116;
                                this.field6061[14][3] = 3228;
                                this.field6061[14][2] = 3148;
                                this.field6061[15][1] = 2377;
                                this.field6061[15][3] = 2746;
                                this.field6061[15][0] = 4096;
                                this.field6061[15][2] = 2505;
                            }
                        } else {
                            this.field6061 = new int[6][4];
                            this.field6061[0][1] = 0;
                            this.field6061[0][3] = 0;
                            this.field6061[0][0] = 0;
                            this.field6061[0][2] = 0;
                            this.field6061[1][3] = 1493;
                            this.field6061[1][0] = 1843;
                            this.field6061[1][1] = 0;
                            this.field6061[1][2] = 0;
                            this.field6061[2][1] = 0;
                            this.field6061[2][3] = 2939;
                            this.field6061[2][2] = 0;
                            this.field6061[2][0] = 2457;
                            this.field6061[3][2] = 1124;
                            this.field6061[3][1] = 0;
                            this.field6061[3][3] = 3565;
                            this.field6061[3][0] = 2781;
                            this.field6061[4][3] = 4031;
                            this.field6061[4][0] = 3481;
                            this.field6061[4][1] = 546;
                            this.field6061[4][2] = 3084;
                            this.field6061[5][0] = 4096;
                            this.field6061[5][3] = 4096;
                            this.field6061[5][2] = 4096;
                            this.field6061[5][1] = 4096;
                        }
                    } else {
                        this.field6061 = new int[7][4];
                        this.field6061[0][0] = 0;
                        this.field6061[0][2] = 0;
                        this.field6061[0][1] = 0;
                        this.field6061[0][3] = 4096;
                        this.field6061[1][3] = 4096;
                        this.field6061[1][0] = 663;
                        this.field6061[1][1] = 0;
                        this.field6061[1][2] = 4096;
                        this.field6061[2][2] = 4096;
                        this.field6061[2][3] = 0;
                        this.field6061[2][1] = 0;
                        this.field6061[2][0] = 1363;
                        this.field6061[3][3] = 0;
                        this.field6061[3][0] = 2048;
                        this.field6061[3][1] = 4096;
                        this.field6061[3][2] = 4096;
                        this.field6061[4][1] = 4096;
                        this.field6061[4][3] = 0;
                        this.field6061[4][0] = 2727;
                        this.field6061[4][2] = 0;
                        this.field6061[5][1] = 4096;
                        this.field6061[5][2] = 0;
                        this.field6061[5][3] = 4096;
                        this.field6061[5][0] = 3411;
                        this.field6061[6][1] = 0;
                        this.field6061[6][3] = 4096;
                        this.field6061[6][0] = 4096;
                        this.field6061[6][2] = 0;
                    }
                } else {
                    this.field6061 = new int[8][4];
                    this.field6061[0][0] = 0;
                    this.field6061[0][2] = 2602;
                    this.field6061[0][1] = 2650;
                    this.field6061[0][3] = 2361;
                    this.field6061[1][3] = 1558;
                    this.field6061[1][0] = 2867;
                    this.field6061[1][2] = 1799;
                    this.field6061[1][1] = 2313;
                    this.field6061[2][3] = 1413;
                    this.field6061[2][1] = 2618;
                    this.field6061[2][2] = 1734;
                    this.field6061[2][0] = 3072;
                    this.field6061[3][1] = 2296;
                    this.field6061[3][0] = 3276;
                    this.field6061[3][2] = 1220;
                    this.field6061[3][3] = 947;
                    this.field6061[4][2] = 963;
                    this.field6061[4][0] = 3481;
                    this.field6061[4][3] = 722;
                    this.field6061[4][1] = 2072;
                    this.field6061[5][3] = 1766;
                    this.field6061[5][2] = 2152;
                    this.field6061[5][0] = 3686;
                    this.field6061[5][1] = 2730;
                    this.field6061[6][0] = 3891;
                    this.field6061[6][1] = 2232;
                    this.field6061[6][2] = 1060;
                    this.field6061[6][3] = 915;
                    this.field6061[7][3] = 1140;
                    this.field6061[7][2] = 1413;
                    this.field6061[7][1] = 1686;
                    this.field6061[7][0] = 4096;
                }
            } else {
                this.field6061 = new int[2][4];
                this.field6061[0][0] = 0;
                this.field6061[0][1] = 0;
                this.field6061[0][2] = 0;
                this.field6061[0][3] = 0;
                this.field6061[1][0] = 4096;
                this.field6061[1][1] = 4096;
                this.field6061[1][3] = 4096;
                this.field6061[1][2] = 4096;
            }
        }
        if (arg1 < 59) {
            this.field6058 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lwc;Lwc;I)V")
    public static final void method2479(class270 arg0, class270 arg1, int arg2) {
        if (arg1.field4489 != null) {
            arg1.method1799((byte) 110);
        }
        ++field6057;
        arg1.field4493 = arg0.field4493;
        arg1.field4489 = arg0;
        if (arg2 > 79) {
            arg1.field4489.field4493 = arg1;
            arg1.field4493.field4489 = arg1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (arg0) {
            ++field6055;
            if (arg1 == 0) {
                int var4 = arg2.method126((byte) -105);
                if (~var4 != -1) {
                    this.method2478(var4, 97);
                } else {
                    this.field6061 = new int[arg2.method126((byte) -72)][4];
                    for (int var5 = 0; var5 < this.field6061.length; ++var5) {
                        this.field6061[var5][0] = arg2.method132(89);
                        this.field6061[var5][1] = arg2.method126((byte) -80) << 4;
                        this.field6061[var5][2] = arg2.method126((byte) -128) << 4;
                        this.field6061[var5][3] = arg2.method126((byte) -123) << 4;
                    }
                }
            }
        }
    }
}
