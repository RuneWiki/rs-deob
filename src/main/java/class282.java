import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class282 extends class242 {

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "[I")
    private int[] field4968 = new int[257];

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "[I")
    public static int[] field4955 = new int[32];

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    public static volatile int field4961 = -1;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "Lp;")
    public static class280 field4966 = class18.method140((byte) -125, "headicons_pk");

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    public static int field4959 = 0;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "Lp;")
    public static class280 field4967 = class18.method140((byte) -118, "null");

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "[[I")
    private int[][] field4954;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "(I)V")
    public static void method1907(int arg0) {
        field4966 = null;
        if (arg0 != 674566340) {
            method1910(57, (class180) null, true, (class281) null, (class180) null);
        }
        field4967 = null;
        field4955 = null;
    }

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "(I)V")
    private final void method1908(int arg0) {
        ++field4965;
        if (arg0 == 8009) {
            int var2 = this.field4954.length;
            if (~var2 < -1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && this.field4954[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var4 > ~var2) {
                        int[] var7 = this.field4954[var4];
                        if (var4 <= 0) {
                            var8 = var7[2];
                            var9 = var7[1];
                            var10 = var7[3];
                        } else {
                            int[] var11 = this.field4954[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                            var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                            var8 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                        }
                    } else {
                        int[] var14 = this.field4954[var2 + -1];
                        var10 = var14[3];
                        var9 = var14[1];
                        var8 = var14[2];
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
                    if (~var17 <= -1) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (~var15 <= -1) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    this.field4968[var3] = class160.method1143(class160.method1143(var15 << 8, var17 << 16), var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
    private final void method1909(int arg0, int arg1) {
        ++field4956;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4954 = new int[4][4];
                                this.field4954[0][3] = 0;
                                this.field4954[0][2] = 4096;
                                this.field4954[1][2] = 4096;
                                this.field4954[0][0] = 2048;
                                this.field4954[0][1] = 0;
                                this.field4954[2][2] = 4096;
                                this.field4954[1][3] = 0;
                                this.field4954[3][2] = 0;
                                this.field4954[2][3] = 0;
                                this.field4954[1][1] = 4096;
                                this.field4954[3][3] = 0;
                                this.field4954[1][0] = 2867;
                                this.field4954[2][0] = 3276;
                                this.field4954[3][0] = 4096;
                                this.field4954[2][1] = 4096;
                                this.field4954[3][1] = 4096;
                            } else {
                                this.field4954 = new int[16][4];
                                this.field4954[0][1] = 80;
                                this.field4954[0][0] = 0;
                                this.field4954[0][2] = 192;
                                this.field4954[1][0] = 155;
                                this.field4954[1][1] = 321;
                                this.field4954[2][1] = 578;
                                this.field4954[3][1] = 947;
                                this.field4954[0][3] = 321;
                                this.field4954[1][3] = 562;
                                this.field4954[2][3] = 803;
                                this.field4954[1][2] = 449;
                                this.field4954[3][3] = 1140;
                                this.field4954[2][2] = 690;
                                this.field4954[2][0] = 389;
                                this.field4954[4][1] = 1285;
                                this.field4954[4][3] = 1509;
                                this.field4954[3][0] = 671;
                                this.field4954[5][1] = 1525;
                                this.field4954[4][0] = 897;
                                this.field4954[3][2] = 995;
                                this.field4954[6][1] = 1734;
                                this.field4954[5][3] = 1413;
                                this.field4954[6][3] = 1333;
                                this.field4954[5][0] = 1175;
                                this.field4954[7][1] = 1413;
                                this.field4954[6][0] = 1368;
                                this.field4954[4][2] = 1397;
                                this.field4954[7][0] = 1507;
                                this.field4954[5][2] = 1429;
                                this.field4954[6][2] = 1461;
                                this.field4954[7][2] = 1525;
                                this.field4954[7][3] = 1702;
                                this.field4954[8][1] = 1108;
                                this.field4954[8][3] = 2056;
                                this.field4954[8][0] = 1736;
                                this.field4954[8][2] = 1590;
                                this.field4954[9][1] = 1766;
                                this.field4954[10][1] = 2409;
                                this.field4954[11][1] = 3116;
                                this.field4954[9][3] = 2666;
                                this.field4954[9][2] = 2056;
                                this.field4954[10][2] = 2586;
                                this.field4954[10][3] = 3276;
                                this.field4954[12][1] = 3806;
                                this.field4954[11][3] = 3228;
                                this.field4954[11][2] = 3148;
                                this.field4954[12][3] = 3196;
                                this.field4954[13][3] = 3019;
                                this.field4954[9][0] = 2088;
                                this.field4954[10][0] = 2355;
                                this.field4954[12][2] = 3710;
                                this.field4954[14][3] = 3228;
                                this.field4954[11][0] = 2691;
                                this.field4954[12][0] = 3031;
                                this.field4954[13][1] = 3437;
                                this.field4954[15][3] = 2746;
                                this.field4954[14][1] = 3116;
                                this.field4954[15][1] = 2377;
                                this.field4954[13][0] = 3522;
                                this.field4954[13][2] = 3421;
                                this.field4954[14][0] = 3727;
                                this.field4954[14][2] = 3148;
                                this.field4954[15][2] = 2505;
                                this.field4954[15][0] = 4096;
                            }
                        } else {
                            this.field4954 = new int[6][4];
                            this.field4954[0][1] = 0;
                            this.field4954[0][3] = 0;
                            this.field4954[1][3] = 1493;
                            this.field4954[2][3] = 2939;
                            this.field4954[3][3] = 3565;
                            this.field4954[4][3] = 4031;
                            this.field4954[5][3] = 4096;
                            this.field4954[0][0] = 0;
                            this.field4954[0][2] = 0;
                            this.field4954[1][0] = 1843;
                            this.field4954[1][2] = 0;
                            this.field4954[2][2] = 0;
                            this.field4954[3][2] = 1124;
                            this.field4954[2][0] = 2457;
                            this.field4954[3][0] = 2781;
                            this.field4954[4][0] = 3481;
                            this.field4954[1][1] = 0;
                            this.field4954[4][2] = 3084;
                            this.field4954[5][0] = 4096;
                            this.field4954[2][1] = 0;
                            this.field4954[3][1] = 0;
                            this.field4954[5][2] = 4096;
                            this.field4954[4][1] = 546;
                            this.field4954[5][1] = 4096;
                        }
                    } else {
                        this.field4954 = new int[7][4];
                        this.field4954[0][2] = 0;
                        this.field4954[0][0] = 0;
                        this.field4954[1][2] = 4096;
                        this.field4954[0][3] = 4096;
                        this.field4954[2][2] = 4096;
                        this.field4954[3][2] = 4096;
                        this.field4954[0][1] = 0;
                        this.field4954[1][0] = 663;
                        this.field4954[1][3] = 4096;
                        this.field4954[2][3] = 0;
                        this.field4954[2][0] = 1363;
                        this.field4954[4][2] = 0;
                        this.field4954[3][0] = 2048;
                        this.field4954[4][0] = 2727;
                        this.field4954[5][0] = 3411;
                        this.field4954[3][3] = 0;
                        this.field4954[4][3] = 0;
                        this.field4954[5][3] = 4096;
                        this.field4954[5][2] = 0;
                        this.field4954[6][0] = 4096;
                        this.field4954[1][1] = 0;
                        this.field4954[2][1] = 0;
                        this.field4954[6][3] = 4096;
                        this.field4954[6][2] = 0;
                        this.field4954[3][1] = 4096;
                        this.field4954[4][1] = 4096;
                        this.field4954[5][1] = 4096;
                        this.field4954[6][1] = 0;
                    }
                } else {
                    this.field4954 = new int[8][4];
                    this.field4954[0][1] = 2650;
                    this.field4954[0][0] = 0;
                    this.field4954[0][3] = 2361;
                    this.field4954[1][0] = 2867;
                    this.field4954[0][2] = 2602;
                    this.field4954[1][3] = 1558;
                    this.field4954[1][2] = 1799;
                    this.field4954[1][1] = 2313;
                    this.field4954[2][2] = 1734;
                    this.field4954[2][1] = 2618;
                    this.field4954[2][3] = 1413;
                    this.field4954[2][0] = 3072;
                    this.field4954[3][3] = 947;
                    this.field4954[4][3] = 722;
                    this.field4954[5][3] = 1766;
                    this.field4954[3][2] = 1220;
                    this.field4954[3][1] = 2296;
                    this.field4954[4][2] = 963;
                    this.field4954[3][0] = 3276;
                    this.field4954[4][1] = 2072;
                    this.field4954[5][2] = 2152;
                    this.field4954[6][3] = 915;
                    this.field4954[6][2] = 1060;
                    this.field4954[4][0] = 3481;
                    this.field4954[5][0] = 3686;
                    this.field4954[6][0] = 3891;
                    this.field4954[7][0] = 4096;
                    this.field4954[5][1] = 2730;
                    this.field4954[6][1] = 2232;
                    this.field4954[7][2] = 1413;
                    this.field4954[7][1] = 1686;
                    this.field4954[7][3] = 1140;
                }
            } else {
                this.field4954 = new int[2][4];
                this.field4954[0][0] = 0;
                this.field4954[1][0] = 4096;
                this.field4954[0][2] = 0;
                this.field4954[0][3] = 0;
                this.field4954[1][3] = 4096;
                this.field4954[0][1] = 0;
                this.field4954[1][2] = 4096;
                this.field4954[1][1] = 4096;
            }
        }
        if (arg0 != 2409) {
            this.field4954 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg1 == 0) {
            int var4 = arg2.method189((byte) -103);
            if (~var4 != -1) {
                this.method1909(2409, var4);
            } else {
                this.field4954 = new int[arg2.method189((byte) -103)][4];
                for (int var5 = 0; var5 < this.field4954.length; ++var5) {
                    this.field4954[var5][0] = arg2.method193((byte) 77);
                    this.field4954[var5][1] = arg2.method189((byte) -103) << 4;
                    this.field4954[var5][2] = arg2.method189((byte) -103) << 4;
                    this.field4954[var5][3] = arg2.method189((byte) -103) << 4;
                }
            }
        }
        ++field4960;
        if (arg0 >= -119) {
            this.field4968 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1909(30, 124);
        }
        int[][] var3 = super.field4257.method917(arg1, 1);
        ++field4957;
        if (super.field4257.field2357) {
            int[] var4 = this.method1647(0, arg1, 48);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class264.field4654; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4968[var9];
                var5[var8] = class214.method1432(var10, 16711680) >> 12;
                var6[var8] = class214.method1432(4080, var10 >> 4);
                var7[var8] = class214.method1432(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILtg;ZLpf;Ltg;)V")
    public static final void method1910(int arg0, class180 arg1, boolean arg2, class281 arg3, class180 arg4) {
        if (arg0 != -1887) {
            method1911(16, 95, -48, -28, -22, -112, 34, -119, -126, -80, false, -121);
        }
        class168.field2940 = arg1;
        class94.field1527 = arg2;
        class240.field4204 = arg4;
        int var5 = -1 + class168.field2940.method1228(true);
        class231.field4015 = var5 * 256 + class168.field2940.method1259(var5, 47);
        ++field4962;
        class249.field4356 = new class280[] { null, null, class80.field1319, null, null };
        class99.field1602 = new class280[] { null, null, null, null, class35.field643 };
        class125.field2178 = arg3;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class282() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method1911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; var31 < 104; ++var31) {
                class234.field4071[var12][var31] = 0;
                class64.field1072[var12][var31] = 99999999;
            }
        }
        ++field4964;
        class234.field4071[arg3][arg6] = 99;
        int var13 = arg3;
        class64.field1072[arg3][arg6] = 0;
        byte var14 = 0;
        int var15 = arg6;
        int var16 = 0;
        class250.field4385[var14] = arg3;
        boolean var17 = false;
        int var32 = var14 + 1;
        class241.field4218[var14] = arg6;
        int[][] var18 = class183.field3211[class231.field4013].field1604;
        while (~var32 != ~var16) {
            var13 = class250.field4385[var16];
            var15 = class241.field4218[var16];
            var16 = var16 + 1 & 4095;
            if (arg4 == var13 && ~arg1 == ~var15) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || ~arg5 == -11) && class183.field3211[class231.field4013].method703(arg1, 82, 1, arg4, arg5 + -1, var15, arg11, var13)) {
                    var17 = true;
                    break;
                }
                if (~arg5 > -11 && class183.field3211[class231.field4013].method701(var15, arg4, 1, arg11, true, arg5 - 1, arg1, var13)) {
                    var17 = true;
                    break;
                }
            }
            if (arg9 != 0 && ~arg2 != -1 && class183.field3211[class231.field4013].method694(1, false, var15, var13, arg9, arg2, arg0, arg4, arg1)) {
                var17 = true;
                break;
            }
            int var30 = class64.field1072[var13][var15] + 1;
            if (~var13 < -1 && ~class234.field4071[var13 + -1][var15] == -1 && ~(var18[var13 + -1][var15] & 19661064) == -1) {
                class250.field4385[var32] = var13 + -1;
                class241.field4218[var32] = var15;
                class234.field4071[var13 + -1][var15] = 2;
                var32 = var32 + 1 & 4095;
                class64.field1072[var13 + -1][var15] = var30;
            }
            if (~var13 > -104 && ~class234.field4071[var13 + 1][var15] == -1 && ~(var18[var13 + 1][var15] & 19661184) == -1) {
                class250.field4385[var32] = var13 - -1;
                class241.field4218[var32] = var15;
                class234.field4071[var13 + 1][var15] = 8;
                var32 = 4095 & var32 + 1;
                class64.field1072[var13 + 1][var15] = var30;
            }
            if (~var15 < -1 && class234.field4071[var13][var15 - 1] == 0 && ~(19661058 & var18[var13][var15 + -1]) == -1) {
                class250.field4385[var32] = var13;
                class241.field4218[var32] = var15 + -1;
                class234.field4071[var13][var15 + -1] = 1;
                var32 = var32 + 1 & 4095;
                class64.field1072[var13][var15 - 1] = var30;
            }
            if (var15 < 103 && ~class234.field4071[var13][var15 + 1] == -1 && (var18[var13][var15 + 1] & 19661088) == 0) {
                class250.field4385[var32] = var13;
                class241.field4218[var32] = var15 + 1;
                class234.field4071[var13][var15 + 1] = 4;
                var32 = var32 - -1 & 4095;
                class64.field1072[var13][var15 + 1] = var30;
            }
            if (~var13 < -1 && var15 > 0 && ~class234.field4071[var13 + -1][var15 + -1] == -1 && ~(19661070 & var18[var13 + -1][var15 + -1]) == -1 && (var18[var13 + -1][var15] & 19661064) == 0 && (var18[var13][var15 + -1] & 19661058) == 0) {
                class250.field4385[var32] = var13 + -1;
                class241.field4218[var32] = var15 + -1;
                var32 = 4095 & var32 + 1;
                class234.field4071[var13 - 1][var15 + -1] = 3;
                class64.field1072[var13 + -1][var15 + -1] = var30;
            }
            if (~var13 > -104 && ~var15 < -1 && class234.field4071[var13 + 1][var15 + -1] == 0 && ~(var18[var13 - -1][var15 - 1] & 19661187) == -1 && (19661184 & var18[var13 + 1][var15]) == 0 && ~(var18[var13][var15 + -1] & 19661058) == -1) {
                class250.field4385[var32] = var13 - -1;
                class241.field4218[var32] = var15 + -1;
                var32 = var32 + 1 & 4095;
                class234.field4071[var13 + 1][var15 + -1] = 9;
                class64.field1072[var13 + 1][var15 + -1] = var30;
            }
            if (var13 > 0 && ~var15 > -104 && ~class234.field4071[var13 + -1][var15 + 1] == -1 && (var18[var13 + -1][var15 + 1] & 19661112) == 0 && (19661064 & var18[var13 - 1][var15]) == 0 && ~(var18[var13][var15 + 1] & 19661088) == -1) {
                class250.field4385[var32] = var13 + -1;
                class241.field4218[var32] = var15 + 1;
                class234.field4071[var13 + -1][var15 + 1] = 6;
                var32 = var32 + 1 & 4095;
                class64.field1072[var13 + -1][var15 + 1] = var30;
            }
            if (~var13 > -104 && ~var15 > -104 && ~class234.field4071[var13 + 1][var15 - -1] == -1 && (var18[var13 + 1][var15 + 1] & 19661280) == 0 && ~(var18[var13 - -1][var15] & 19661184) == -1 && ~(var18[var13][var15 - -1] & 19661088) == -1) {
                class250.field4385[var32] = var13 + 1;
                class241.field4218[var32] = var15 - -1;
                class234.field4071[var13 + 1][var15 + 1] = 12;
                var32 = 4095 & var32 + 1;
                class64.field1072[var13 + 1][var15 + 1] = var30;
            }
        }
        class104.field1733 = 0;
        if (!var17) {
            if (!arg10) {
                return false;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = -var20 + arg4; ~(arg4 - -var20) <= ~var22; ++var22) {
                for (int var23 = -var20 + arg1; var23 <= arg1 + var20; ++var23) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && ~var23 > -105 && ~class64.field1072[var22][var23] > -101) {
                        int var24 = 0;
                        int var25 = 0;
                        if (~arg1 < ~var23) {
                            var25 = -var23 + arg1;
                        } else if (~(arg1 + arg2 + -1) > ~var23) {
                            var25 = -arg1 + -arg2 + var23 - -1;
                        }
                        if (arg4 <= var22) {
                            if (~(arg4 + -1 + arg9) > ~var22) {
                                var24 = -arg4 + -arg9 + 1 + var22;
                            }
                        } else {
                            var24 = -var22 + arg4;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || ~var19 == ~var26 && ~var21 < ~class64.field1072[var22][var23]) {
                            var13 = var22;
                            var15 = var23;
                            var21 = class64.field1072[var22][var23];
                            var19 = var26;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (~arg3 == ~var13 && arg6 == var15) {
                return false;
            }
            class104.field1733 = 1;
        }
        if (arg7 < 122) {
            return true;
        } else {
            byte var27 = 0;
            class250.field4385[var27] = var13;
            int var33 = var27 + 1;
            class241.field4218[var27] = var15;
            int var28;
            int var29 = var28 = class234.field4071[var13][var15];
            while (~arg3 != ~var13 || arg6 != var15) {
                if (~var28 != ~var29) {
                    class250.field4385[var33] = var13;
                    var28 = var29;
                    class241.field4218[var33++] = var15;
                }
                if ((var29 & 2) != 0) {
                    ++var13;
                } else if (~(8 & var29) != -1) {
                    --var13;
                }
                if (~(var29 & 1) == -1) {
                    if (~(4 & var29) != -1) {
                        --var15;
                    }
                } else {
                    ++var15;
                }
                var29 = class234.field4071[var13][var15];
            }
            if (var33 > 0) {
                class227.method1527(var33, true, arg8);
                return true;
            } else if (~arg8 == -2) {
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        ++field4963;
        if (this.field4954 == null) {
            this.method1909(2409, 1);
        }
        this.method1908(8009);
        if (arg0 < 122) {
            field4959 = 118;
        }
    }
}
