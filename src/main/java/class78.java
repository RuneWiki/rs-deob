import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class78 extends class135 {

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "[I")
    private int[] field1131 = new int[257];

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "Lqj;")
    public static class196 field1139 = class80.method502("<img=1>", -48);

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "Lqj;")
    public static class196 field1129 = class80.method502(" <col=00ff80>", -48);

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!oh", name = "kb", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!oh", name = "lb", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "Lnb;")
    public static class95 field1130;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "[[I")
    private int[][] field1132;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIILpe;JZ)V")
    public static final void method486(int arg0, int arg1, int arg2, int arg3, class258 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class116 var8 = new class116();
            var8.field1681 = arg4;
            var8.field1673 = arg1 * 128 + 64;
            var8.field1682 = arg2 * 128 + 64;
            var8.field1677 = arg3;
            var8.field1671 = arg5;
            if (class249.field4410[arg0][arg1][arg2] == null) {
                class249.field4410[arg0][arg1][arg2] = new class61(arg0, arg1, arg2);
            }
            class249.field4410[arg0][arg1][arg2].field818 = var8;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public static final void method487(int arg0) {
        ++field1135;
        class70.field980.method1529(arg0 ^ 380);
        class102.field1473.method135(112);
        if (arg0 != 2) {
            field1139 = null;
        }
        class148.field2338.method135(arg0 + -106);
        class149.field2384.method135(47);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        ++field1136;
        if (arg0 != 260028743) {
            this.field1131 = null;
        }
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180) {
            int[] var4 = this.method819(arg0 + -260028847, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class131.field1862 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field1131[var9];
                var5[var8] = class65.method409(16711680, var10) >> 12;
                var6[var8] = class65.method409(var10 >> 4, 4080);
                var7[var8] = class65.method409(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(B)V")
    public static void method488(byte arg0) {
        field1139 = null;
        field1129 = null;
        if (arg0 != -57) {
            field1129 = null;
        }
        field1130 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg2 == -16231) {
            if (arg1 == 0) {
                int var4 = arg0.method367(1);
                if (var4 == 0) {
                    this.field1132 = new int[arg0.method367(1)][4];
                    for (int var5 = 0; ~var5 > ~this.field1132.length; ++var5) {
                        this.field1132[var5][0] = arg0.method318(true);
                        this.field1132[var5][1] = arg0.method367(1) << 4;
                        this.field1132[var5][2] = arg0.method367(1) << 4;
                        this.field1132[var5][3] = arg0.method367(1) << 4;
                    }
                } else {
                    this.method491((byte) 99, var4);
                }
            }
            ++field1134;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        if (this.field1132 == null) {
            this.method491((byte) 99, 1);
        }
        if (arg0 != -85) {
            field1139 = null;
        }
        this.method493(arg0 ^ -88);
        ++field1141;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method489(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1133;
        if (arg0 != -21) {
            field1129 = null;
        }
        int var8 = class186.method1217(class93.field1361, class23.field291, arg5, arg0 ^ -18280);
        int var9 = class186.method1217(class93.field1361, class23.field291, arg7, 18291);
        int var10 = class186.method1217(class188.field3296, class95.field1388, arg1, 18291);
        int var11 = class186.method1217(class188.field3296, class95.field1388, arg2, arg0 + 18312);
        int var12 = class186.method1217(class93.field1361, class23.field291, arg5 - -arg6, 18291);
        int var13 = class186.method1217(class93.field1361, class23.field291, -arg6 + arg7, 18291);
        for (int var14 = var8; var12 > var14; ++var14) {
            class25.method147(arg4, 7, var10, class95.field1380[var14], var11);
        }
        for (int var15 = var9; ~var15 < ~var13; --var15) {
            class25.method147(arg4, 7, var10, class95.field1380[var15], var11);
        }
        int var16 = class186.method1217(class188.field3296, class95.field1388, arg1 + arg6, 18291);
        int var17 = class186.method1217(class188.field3296, class95.field1388, -arg6 + arg2, 18291);
        for (int var18 = var12; var18 <= var13; ++var18) {
            int[] var19 = class95.field1380[var18];
            class25.method147(arg4, arg0 ^ -20, var10, var19, var16);
            class25.method147(arg3, arg0 ^ -20, var16, var19, var17);
            class25.method147(arg4, 7, var17, var19, var11);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class78() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lhg;IIZ)V")
    public static final void method490(class164 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field1129 = null;
        }
        if (arg0.field2086 == arg1 && arg1 != -1) {
            class149 var4 = class116.method704(arg1, -10304);
            int var5 = var4.field2366;
            if (~var5 == -2) {
                arg0.field2084 = arg2;
                arg0.field2079 = 0;
                arg0.field2105 = 0;
                arg0.field2109 = 0;
                class209.method1447(arg0.field2105, arg0.field2085, false, var4, arg0.field2081, -2);
            }
            if (var5 == 2) {
                arg0.field2109 = 0;
            }
        } else if (arg1 == -1 || arg0.field2086 == -1 || class116.method704(arg1, -10304).field2365 >= class116.method704(arg0.field2086, -10304).field2365) {
            arg0.field2086 = arg1;
            arg0.field2084 = arg2;
            arg0.field2105 = 0;
            arg0.field2109 = 0;
            arg0.field2104 = arg0.field2071;
            arg0.field2079 = 0;
            if (~arg0.field2086 != 0) {
                class209.method1447(arg0.field2105, arg0.field2085, false, class116.method704(arg0.field2086, -10304), arg0.field2081, -2);
            }
        }
        ++field1142;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(BI)V")
    private final void method491(byte arg0, int arg1) {
        ++field1127;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1132 = new int[4][4];
                                this.field1132[0][2] = 4096;
                                this.field1132[1][2] = 4096;
                                this.field1132[0][0] = 2048;
                                this.field1132[1][0] = 2867;
                                this.field1132[2][0] = 3276;
                                this.field1132[2][2] = 4096;
                                this.field1132[0][3] = 0;
                                this.field1132[3][2] = 0;
                                this.field1132[1][3] = 0;
                                this.field1132[3][0] = 4096;
                                this.field1132[0][1] = 0;
                                this.field1132[2][3] = 0;
                                this.field1132[1][1] = 4096;
                                this.field1132[3][3] = 0;
                                this.field1132[2][1] = 4096;
                                this.field1132[3][1] = 4096;
                            } else {
                                this.field1132 = new int[16][4];
                                this.field1132[0][3] = 321;
                                this.field1132[1][3] = 562;
                                this.field1132[0][1] = 80;
                                this.field1132[0][0] = 0;
                                this.field1132[1][1] = 321;
                                this.field1132[2][1] = 578;
                                this.field1132[1][0] = 155;
                                this.field1132[2][0] = 389;
                                this.field1132[3][0] = 671;
                                this.field1132[0][2] = 192;
                                this.field1132[3][1] = 947;
                                this.field1132[1][2] = 449;
                                this.field1132[4][0] = 897;
                                this.field1132[2][2] = 690;
                                this.field1132[3][2] = 995;
                                this.field1132[5][0] = 1175;
                                this.field1132[4][1] = 1285;
                                this.field1132[2][3] = 803;
                                this.field1132[3][3] = 1140;
                                this.field1132[6][0] = 1368;
                                this.field1132[5][1] = 1525;
                                this.field1132[4][2] = 1397;
                                this.field1132[4][3] = 1509;
                                this.field1132[7][0] = 1507;
                                this.field1132[5][3] = 1413;
                                this.field1132[5][2] = 1429;
                                this.field1132[6][3] = 1333;
                                this.field1132[8][0] = 1736;
                                this.field1132[6][1] = 1734;
                                this.field1132[7][3] = 1702;
                                this.field1132[6][2] = 1461;
                                this.field1132[7][2] = 1525;
                                this.field1132[9][0] = 2088;
                                this.field1132[10][0] = 2355;
                                this.field1132[8][2] = 1590;
                                this.field1132[8][3] = 2056;
                                this.field1132[9][2] = 2056;
                                this.field1132[9][3] = 2666;
                                this.field1132[7][1] = 1413;
                                this.field1132[8][1] = 1108;
                                this.field1132[9][1] = 1766;
                                this.field1132[11][0] = 2691;
                                this.field1132[10][3] = 3276;
                                this.field1132[12][0] = 3031;
                                this.field1132[11][3] = 3228;
                                this.field1132[13][0] = 3522;
                                this.field1132[14][0] = 3727;
                                this.field1132[12][3] = 3196;
                                this.field1132[13][3] = 3019;
                                this.field1132[15][0] = 4096;
                                this.field1132[14][3] = 3228;
                                this.field1132[10][2] = 2586;
                                this.field1132[15][3] = 2746;
                                this.field1132[10][1] = 2409;
                                this.field1132[11][2] = 3148;
                                this.field1132[11][1] = 3116;
                                this.field1132[12][2] = 3710;
                                this.field1132[13][2] = 3421;
                                this.field1132[12][1] = 3806;
                                this.field1132[13][1] = 3437;
                                this.field1132[14][1] = 3116;
                                this.field1132[15][1] = 2377;
                                this.field1132[14][2] = 3148;
                                this.field1132[15][2] = 2505;
                            }
                        } else {
                            this.field1132 = new int[6][4];
                            this.field1132[0][2] = 0;
                            this.field1132[1][2] = 0;
                            this.field1132[0][0] = 0;
                            this.field1132[0][3] = 0;
                            this.field1132[2][2] = 0;
                            this.field1132[0][1] = 0;
                            this.field1132[1][3] = 1493;
                            this.field1132[3][2] = 1124;
                            this.field1132[1][1] = 0;
                            this.field1132[2][1] = 0;
                            this.field1132[3][1] = 0;
                            this.field1132[4][1] = 546;
                            this.field1132[5][1] = 4096;
                            this.field1132[4][2] = 3084;
                            this.field1132[1][0] = 1843;
                            this.field1132[5][2] = 4096;
                            this.field1132[2][0] = 2457;
                            this.field1132[2][3] = 2939;
                            this.field1132[3][0] = 2781;
                            this.field1132[3][3] = 3565;
                            this.field1132[4][3] = 4031;
                            this.field1132[4][0] = 3481;
                            this.field1132[5][0] = 4096;
                            this.field1132[5][3] = 4096;
                        }
                    } else {
                        this.field1132 = new int[7][4];
                        this.field1132[0][2] = 0;
                        this.field1132[0][3] = 4096;
                        this.field1132[0][0] = 0;
                        this.field1132[0][1] = 0;
                        this.field1132[1][2] = 4096;
                        this.field1132[1][0] = 663;
                        this.field1132[1][1] = 0;
                        this.field1132[2][1] = 0;
                        this.field1132[3][1] = 4096;
                        this.field1132[2][0] = 1363;
                        this.field1132[3][0] = 2048;
                        this.field1132[4][1] = 4096;
                        this.field1132[2][2] = 4096;
                        this.field1132[4][0] = 2727;
                        this.field1132[5][0] = 3411;
                        this.field1132[5][1] = 4096;
                        this.field1132[6][1] = 0;
                        this.field1132[3][2] = 4096;
                        this.field1132[1][3] = 4096;
                        this.field1132[4][2] = 0;
                        this.field1132[2][3] = 0;
                        this.field1132[6][0] = 4096;
                        this.field1132[5][2] = 0;
                        this.field1132[3][3] = 0;
                        this.field1132[4][3] = 0;
                        this.field1132[5][3] = 4096;
                        this.field1132[6][3] = 4096;
                        this.field1132[6][2] = 0;
                    }
                } else {
                    this.field1132 = new int[8][4];
                    this.field1132[0][3] = 2361;
                    this.field1132[0][2] = 2602;
                    this.field1132[0][1] = 2650;
                    this.field1132[0][0] = 0;
                    this.field1132[1][2] = 1799;
                    this.field1132[1][3] = 1558;
                    this.field1132[2][3] = 1413;
                    this.field1132[3][3] = 947;
                    this.field1132[4][3] = 722;
                    this.field1132[1][0] = 2867;
                    this.field1132[1][1] = 2313;
                    this.field1132[2][2] = 1734;
                    this.field1132[5][3] = 1766;
                    this.field1132[3][2] = 1220;
                    this.field1132[6][3] = 915;
                    this.field1132[2][0] = 3072;
                    this.field1132[2][1] = 2618;
                    this.field1132[7][3] = 1140;
                    this.field1132[4][2] = 963;
                    this.field1132[3][1] = 2296;
                    this.field1132[4][1] = 2072;
                    this.field1132[5][1] = 2730;
                    this.field1132[3][0] = 3276;
                    this.field1132[6][1] = 2232;
                    this.field1132[5][2] = 2152;
                    this.field1132[7][1] = 1686;
                    this.field1132[4][0] = 3481;
                    this.field1132[5][0] = 3686;
                    this.field1132[6][0] = 3891;
                    this.field1132[6][2] = 1060;
                    this.field1132[7][2] = 1413;
                    this.field1132[7][0] = 4096;
                }
            } else {
                this.field1132 = new int[2][4];
                this.field1132[0][0] = 0;
                this.field1132[0][3] = 0;
                this.field1132[1][3] = 4096;
                this.field1132[1][0] = 4096;
                this.field1132[0][2] = 0;
                this.field1132[0][1] = 0;
                this.field1132[1][2] = 4096;
                this.field1132[1][1] = 4096;
            }
        }
        if (arg0 != 99) {
            method486(-50, -30, -122, 2, (class258) null, 1L, true);
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public static final void method492(int arg0) {
        ++field1137;
        boolean var1 = false;
        if (arg0 == -25139) {
            while (!var1) {
                var1 = true;
                for (int var2 = 0; ~var2 > ~(class125.field1767 - 1); ++var2) {
                    if (class142.field2169[var2] < 1000 && ~class142.field2169[var2 - -1] < -1001) {
                        class196 var3 = class52.field650[var2];
                        class52.field650[var2] = class52.field650[var2 + 1];
                        class52.field650[var2 + 1] = var3;
                        var1 = false;
                        class196 var4 = class65.field916[var2];
                        class65.field916[var2] = class65.field916[var2 + 1];
                        class65.field916[var2 + 1] = var4;
                        int var5 = class246.field4385[var2];
                        class246.field4385[var2] = class246.field4385[var2 + 1];
                        class246.field4385[var2 - -1] = var5;
                        int var6 = class47.field566[var2];
                        class47.field566[var2] = class47.field566[var2 - -1];
                        class47.field566[var2 + 1] = var6;
                        short var7 = class142.field2169[var2];
                        class142.field2169[var2] = class142.field2169[var2 + 1];
                        class142.field2169[var2 + 1] = var7;
                        long var8 = class34.field410[var2];
                        class34.field410[var2] = class34.field410[var2 - -1];
                        class34.field410[var2 + 1] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
    private final void method493(int arg0) {
        ++field1138;
        int var2 = this.field1132.length;
        if (arg0 == 3) {
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5 = 0;
                    for (int var6 = 0; ~var6 > ~var2 && ~this.field1132[var6][0] >= ~var4; ++var6) {
                        ++var5;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (~var5 > ~var2) {
                        int[] var7 = this.field1132[var5];
                        if (~var5 < -1) {
                            int[] var8 = this.field1132[var5 + -1];
                            int var9 = (-var8[0] + var4 << 12) / (var7[0] + -var8[0]);
                            int var10 = -var9 + 4096;
                            var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                            var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                            var13 = var7[1] * var9 + var8[1] * var10 >> 12;
                        } else {
                            var13 = var7[1];
                            var12 = var7[3];
                            var11 = var7[2];
                        }
                    } else {
                        int[] var14 = this.field1132[var2 + -1];
                        var11 = var14[2];
                        var13 = var14[1];
                        var12 = var14[3];
                    }
                    int var15 = var13 >> 4;
                    int var16 = var12 >> 4;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (~var15 < -256) {
                        var15 = 255;
                    }
                    if (~var16 <= -1) {
                        if (var16 > 255) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    int var17 = var11 >> 4;
                    if (~var17 <= -1) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field1131[var3] = class1.method6(var16, class1.method6(var15 << 16, var17 << 8));
                }
            }
        }
    }
}
