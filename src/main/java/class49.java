import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class49 extends class142 {

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    private int field860 = 0;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lai;")
    private static class10 field851 = class44.method278("Players", 107);

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field854 = -1;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "Lai;")
    public static class10 field852 = field851;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "[[[I")
    public static int[][][] field853 = new int[4][13][13];

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!fa", name = "lb", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!fa", name = "nb", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "Lc;")
    public static class21 field861;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "Lih;")
    public static class81 field856;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "[I")
    private int[] field858;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "[I")
    private int[] field862;

    @OriginalMember(owner = "client!fa", name = "mb", descriptor = "[Lbf;")
    public static class17[] field873;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "[[I")
    private int[][] field867;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field859;
        if (arg2 >= -34) {
            this.method349(-73);
        }
        if (~arg1 == -1) {
            this.field860 = arg0.method767(true);
            this.field867 = new int[arg0.method767(true)][2];
            for (int var4 = 0; ~var4 > ~this.field867.length; ++var4) {
                this.field867[var4][0] = arg0.method762((byte) 74);
                this.field867[var4][1] = arg0.method762((byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
    public static final void method347(int arg0) {
        ++field874;
        class74.field1273.method634(true);
        int var1 = class74.field1273.method638(8, (byte) -126);
        if (~class93.field1690 < ~var1) {
            for (int var2 = var1; ~var2 > ~class93.field1690; ++var2) {
                class42.field703[class108.field2014++] = class166.field3187[var2];
            }
        }
        if (var1 > class93.field1690) {
            throw new RuntimeException("gnpov1");
        } else {
            if (arg0 > -54) {
                field851 = null;
            }
            class93.field1690 = 0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class166.field3187[var3];
                class125 var5 = class168.field3249[var4];
                int var6 = class74.field1273.method638(1, (byte) -124);
                if (~var6 == -1) {
                    class166.field3187[class93.field1690++] = var4;
                    var5.field1085 = class120.field2304;
                } else {
                    int var7 = class74.field1273.method638(2, (byte) -122);
                    if (var7 == 0) {
                        class166.field3187[class93.field1690++] = var4;
                        var5.field1085 = class120.field2304;
                        class160.field3076[class34.field532++] = var4;
                    } else if (var7 == 1) {
                        class166.field3187[class93.field1690++] = var4;
                        var5.field1085 = class120.field2304;
                        int var8 = class74.field1273.method638(3, (byte) -121);
                        var5.method424(var8, (byte) -126, false);
                        int var9 = class74.field1273.method638(1, (byte) -117);
                        if (~var9 == -2) {
                            class160.field3076[class34.field532++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class166.field3187[class93.field1690++] = var4;
                        var5.field1085 = class120.field2304;
                        int var10 = class74.field1273.method638(3, (byte) -124);
                        var5.method424(var10, (byte) 78, true);
                        int var11 = class74.field1273.method638(3, (byte) -118);
                        var5.method424(var11, (byte) 121, true);
                        int var12 = class74.field1273.method638(1, (byte) -126);
                        if (~var12 == -2) {
                            class160.field3076[class34.field532++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class42.field703[class108.field2014++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
    public static final void method348(int arg0) {
        ++field872;
        class93.field1668.method226((byte) -90);
        if (arg0 != 0) {
            method351((class177) null, (class177) null, (byte) 28);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        if (arg0) {
            method351((class177) null, (class177) null, (byte) -112);
        }
        ++field870;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int[] var4 = this.method963((byte) -121, 0, arg1);
            int var5 = this.field860;
            if (~var5 != -3) {
                if (~var5 == -2) {
                    for (int var6 = 0; ~var6 > ~class133.field2499; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; ~(this.field867.length + -1) < ~var8 && ~var7 <= ~this.field867[var8][0]; ++var8) {
                        }
                        int[] var9 = this.field867[var8 + -1];
                        int[] var10 = this.field867[var8];
                        int var11 = (-var9[0] + var7 << 12) / (var10[0] + -var9[0]);
                        int var12 = 4096 - class179.field3400[255 & var11 >> 5] >> 1;
                        int var13 = -var12 + 4096;
                        var3[var6] = var9[1] * var13 + var10[1] * var12 >> 12;
                    }
                } else {
                    for (int var14 = 0; ~class133.field2499 < ~var14; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; ~var16 > ~(this.field867.length + -1) && ~var15 <= ~this.field867[var16][0]; ++var16) {
                        }
                        int[] var17 = this.field867[var16 + -1];
                        int[] var18 = this.field867[var16];
                        int var19 = (-var17[0] + var15 << 12) / (var18[0] - var17[0]);
                        int var20 = 4096 - var19;
                        var3[var14] = var17[1] * var20 + var18[1] * var19 >> 12;
                    }
                }
            } else {
                for (int var21 = 0; ~class133.field2499 < ~var21; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; this.field867.length + -1 > var23 && ~this.field867[var23][0] >= ~var22; ++var23) {
                    }
                    int[] var24 = this.field867[var23 + -1];
                    int[] var25 = this.field867[var23];
                    int var26 = this.method353(var23 + -2, -73)[1];
                    int var27 = var24[1];
                    int var28 = var25[1];
                    int var29 = this.method353(var23 + 1, -73)[1];
                    int var30 = var29 - -var27 + -var28 + -var26;
                    int var31 = (var22 - var24[0] << 12) / (var25[0] - var24[0]);
                    int var32 = var31 * var31 >> 12;
                    int var33 = -var27 + -var30 + var26;
                    int var34 = var28 - var26;
                    int var36 = var32 * var33 >> 12;
                    int var37 = (var30 * var31 >> 12) * var32 >> 12;
                    int var38 = var31 * var34 >> 12;
                    var3[var21] = var27 + var37 + var36 + var38;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V")
    private final void method349(int arg0) {
        int[] var2 = this.field867[1];
        ++field868;
        int[] var3 = this.field867[0];
        int[] var4 = this.field867[this.field867.length + -2];
        if (arg0 != -2243) {
            this.field867 = null;
        }
        int[] var5 = this.field867[this.field867.length + -1];
        this.field862 = new int[] { -var5[0] - (-var4[0] - var4[0]), var4[1] + var4[1] + -var5[1] };
        this.field858 = new int[] { var3[0] + var3[0] + -var2[0], var3[1] + -var2[1] + var3[1] };
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (this.field867 == null) {
            this.field867 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field855;
        if (~this.field867.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != -1) {
                method354(-90);
            }
            if (this.field860 == 2) {
                this.method349(arg0 + -2242);
            }
            class58.method392(73);
        }
    }

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)V")
    public static void method350(int arg0) {
        field853 = null;
        if (arg0 != 382) {
            method347(-11);
        }
        field852 = null;
        field856 = null;
        field861 = null;
        field873 = null;
        field851 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lte;Lte;B)V")
    private static final void method351(class177 arg0, class177 arg1, byte arg2) {
        ++field865;
        if (class193.field3675 == null) {
            class193.field3675 = class2.method7(4, class10.field136, class195.field3702, class146.field2800);
        }
        if (class152.field2924 == null) {
            class152.field2924 = class102.method672(class58.field1027, (byte) 71, class10.field136, class146.field2800);
        }
        if (class67.field1178 == null) {
            class67.field1178 = class102.method672(class101.field1906, (byte) 101, class10.field136, class146.field2800);
        }
        if (class155.field3008 == null) {
            class155.field3008 = class102.method672(class122.field2346, (byte) 93, class10.field136, class146.field2800);
        }
        class62.method412(0, 23, 765, 480, 0);
        class62.method400(0, 0, 125, 23, 12425273, 9135624);
        class62.method400(125, 0, 640, 23, 5197647, 2697513);
        arg1.method1262(class159.field3064, 62, 15, 0, -1);
        if (class155.field3008 != null) {
            class155.field3008[1].method1134(140, 1);
            arg0.method1266(class128.field2438, 152, 10, 16777215, -1);
            class155.field3008[0].method1134(140, 12);
            arg0.method1266(class61.field1032, 152, 21, 16777215, -1);
        }
        if (arg2 != 55) {
            field853 = null;
        }
        if (class67.field1178 != null) {
            short var3 = 280;
            if (class136.field2555[0] == 0 && ~class194.field3696[0] == -1) {
                class67.field1178[2].method1134(var3, 4);
            } else {
                class67.field1178[0].method1134(var3, 4);
            }
            if (~class136.field2555[0] == -1 && ~class194.field3696[0] == -2) {
                class67.field1178[3].method1134(var3 + 15, 4);
            } else {
                class67.field1178[1].method1134(var3 + 15, 4);
            }
            short var4 = 390;
            short var5 = 610;
            arg1.method1266(class192.field3662, var3 + 32, 17, 16777215, -1);
            if (~class136.field2555[0] == -2 && class194.field3696[0] == 0) {
                class67.field1178[2].method1134(var4, 4);
            } else {
                class67.field1178[0].method1134(var4, 4);
            }
            short var6 = 500;
            if (~class136.field2555[0] == -2 && ~class194.field3696[0] == -2) {
                class67.field1178[3].method1134(var4 + 15, 4);
            } else {
                class67.field1178[1].method1134(var4 + 15, 4);
            }
            arg1.method1266(field852, var4 + 32, 17, 16777215, -1);
            if (class136.field2555[0] == 2 && ~class194.field3696[0] == -1) {
                class67.field1178[2].method1134(var6, 4);
            } else {
                class67.field1178[0].method1134(var6, 4);
            }
            if (class136.field2555[0] == 2 && class194.field3696[0] == 1) {
                class67.field1178[3].method1134(var6 + 15, 4);
            } else {
                class67.field1178[1].method1134(var6 + 15, 4);
            }
            arg1.method1266(class121.field2333, var6 - -32, 17, 16777215, -1);
            if (~class136.field2555[0] == -4 && class194.field3696[0] == 0) {
                class67.field1178[2].method1134(var5, 4);
            } else {
                class67.field1178[0].method1134(var5, 4);
            }
            if (~class136.field2555[0] == -4 && ~class194.field3696[0] == -2) {
                class67.field1178[3].method1134(var5 + 15, 4);
            } else {
                class67.field1178[1].method1134(var5 + 15, 4);
            }
            arg1.method1266(class25.field373, var5 - -32, 17, 16777215, -1);
        }
        class62.method412(708, 4, 50, 16, 0);
        arg0.method1262(class76.field1325, 733, 16, 16777215, -1);
        class154.field2969 = -1;
        if (class193.field3675 != null) {
            byte var7 = 19;
            byte var8 = 88;
            int var9 = 765 / (var8 + 1);
            int var10 = 480 / (var7 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var9;
                if (~((var9 - 1) * var10) <= ~class130.field2464) {
                    --var9;
                }
                if (class130.field2464 <= (var10 + -1) * var9) {
                    --var10;
                }
                if ((var10 + -1) * var9 >= class130.field2464) {
                    --var10;
                }
            } while (~var10 != ~var11 || ~var9 != ~var12);
            int var13 = (-(var7 * var10) + 480) / (var10 + 1);
            int var14 = (-(var8 * var9) + 765) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            if (~var14 < -6) {
                var14 = 5;
            }
            int var15 = (765 - var8 * var9 - (var9 + -1) * var14) / 2;
            int var16 = var15;
            int var17 = (-((var10 + -1) * var13) + 480 + -(var7 * var10)) / 2;
            int var18 = 23 - -var17;
            int var19 = 0;
            for (int var20 = 0; ~class130.field2464 < ~var20; ++var20) {
                class35 var21 = class40.field673[var20];
                boolean var22 = true;
                class10 var23 = class119.method846(0, var21.field550);
                if (var21.field550 == -1) {
                    var23 = class42.field685;
                    var22 = false;
                } else if (~var21.field550 < -1981) {
                    var23 = class205.field3973;
                    var22 = false;
                }
                if (~class79.field1389 <= ~var16 && ~var18 >= ~class89.field1559 && ~(var8 + var16) < ~class79.field1389 && ~class89.field1559 > ~(var7 + var18) && var22) {
                    class154.field2969 = var20;
                    class193.field3675[!var21.field547 ? 0 : 1].method110(var16, var18, 128, 16777215);
                } else {
                    class193.field3675[!var21.field547 ? 0 : 1].method97(var16, var18);
                }
                if (class152.field2924 != null) {
                    class152.field2924[var21.field544 + (var21.field547 ? 8 : 0)].method1134(var16 + 29, var18);
                }
                arg1.method1262(class119.method846(0, var21.field541), var16 - -15, var7 / 2 + var18 + 5, 0, -1);
                arg0.method1262(var23, var16 + 60, var18 - (-(var7 / 2) - 5), 268435455, -1);
                var18 += var7 + var13;
                ++var19;
                if (var10 <= var19) {
                    var18 = 23 - -var17;
                    var16 += var8 + var14;
                    var19 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lte;ILte;)V")
    public static final void method352(class177 arg0, int arg1, class177 arg2) {
        ++field864;
        if (class153.field2937) {
            method351(arg0, arg2, (byte) 55);
        } else {
            if (~class174.field3353 == -1 || ~class174.field3353 == -6) {
                byte var3 = 20;
                arg2.method1262(class200.field3859, 382, -var3 + 245, 16777215, -1);
                int var4 = -var3 + 253;
                class62.method417(230, var4, 304, 34, 9179409);
                class62.method417(231, var4 + 1, 302, 32, 0);
                class62.method412(232, var4 - -2, class109.field2026 * 3, 30, 9179409);
                class62.method412(class109.field2026 * 3 + 232, var4 + 2, -(class109.field2026 * 3) + 300, 30, 0);
                arg2.method1262(class10.field139, 382, -var3 + 276, 16777215, -1);
            }
            if (~class174.field3353 == -21) {
                short var5 = 211;
                class193.field3667.method1134(-(class193.field3667.field3341 / 2) + 382, -(class193.field3667.field3342 / 2) + 271);
                arg2.method1262(class10.field152, 382, var5, 16776960, 0);
                int var23 = var5 + 15;
                arg2.method1262(class10.field170, 382, var23, 16776960, 0);
                int var24 = var23 + 15;
                arg2.method1262(class10.field129, 382, var24, 16776960, 0);
                int var25 = var24 + 15;
                int var26 = var25 + 10;
                arg2.method1266(class67.method440(0, new class10[] { class200.field3921, class198.method1264(class10.field123) }), 272, var26, 16777215, 0);
                int var28 = var26 + 15;
                arg2.method1266(class67.method440(0, new class10[] { class46.field748, class10.field162.method59((byte) -112) }), 274, var28, 16777215, 0);
                int var29 = var28 + 15;
            }
            if (~class174.field3353 == -11) {
                class193.field3667.method1134(202, 171);
                if (~class149.field2866 == -1) {
                    short var6 = 251;
                    arg2.method1262(class175.field3362, 382, var6, 16776960, 0);
                    short var7 = 302;
                    int var27 = var6 + 30;
                    short var8 = 291;
                    class169.field3269.method1134(var7 + -73, var8 + -20);
                    arg2.method1275(class67.field1173, var7 + -73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var9 = 462;
                    class169.field3269.method1134(var9 + -73, var8 - 20);
                    arg2.method1275(class75.field1286, var9 + -73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (~class149.field2866 != -3) {
                    if (~class149.field2866 == -4) {
                        arg2.method1262(class53.field940, 382, 211, 16776960, 0);
                        short var10 = 236;
                        short var11 = 382;
                        arg2.method1262(class203.field3968, 382, var10, 16777215, 0);
                        int var30 = var10 + 15;
                        short var12 = 321;
                        arg2.method1262(class160.field3084, 382, var30, 16777215, 0);
                        int var31 = var30 + 15;
                        arg2.method1262(class53.field937, 382, var31, 16777215, 0);
                        int var32 = var31 + 15;
                        arg2.method1262(class188.field3558, 382, var32, 16777215, 0);
                        class169.field3269.method1134(var11 + -73, var12 - 20);
                        arg2.method1262(class76.field1325, var11, var12 + 5, 16777215, 0);
                        int var33 = var32 + 15;
                    }
                } else {
                    short var13 = 211;
                    short var14 = 302;
                    short var15 = 321;
                    arg2.method1262(class10.field152, 382, var13, 16776960, 0);
                    int var34 = var13 + 15;
                    arg2.method1262(class10.field170, 382, var34, 16776960, 0);
                    int var35 = var34 + 15;
                    arg2.method1262(class10.field129, 382, var35, 16776960, 0);
                    int var36 = var35 + 15;
                    int var37 = var36 + 10;
                    boolean var16;
                    if (~class120.field2310 == -1 && ~(class120.field2304 % 40) > -21 && class96.field1772) {
                        var16 = true;
                    } else {
                        var16 = false;
                    }
                    arg2.method1266(class67.method440(arg1 + -302, new class10[] { class200.field3921, class198.method1264(class10.field123), var16 ? class100.field1869 : class10.field136 }), 272, var37, 16777215, 0);
                    boolean var17;
                    if (class120.field2310 == 1 && ~(class120.field2304 % 40) > -21 && class96.field1772) {
                        var17 = true;
                    } else {
                        var17 = false;
                    }
                    var34 = var37 + 15;
                    arg2.method1266(class67.method440(arg1 ^ 302, new class10[] { class46.field748, class10.field162.method59((byte) -110), var17 ? class100.field1869 : class10.field136 }), 274, var34, 16777215, 0);
                    class169.field3269.method1134(var14 + -73, var15 + -20);
                    arg2.method1262(class91.field1607, var14, var15 + 5, 16777215, 0);
                    short var18 = 462;
                    class169.field3269.method1134(var18 + -73, var15 - 20);
                    arg2.method1262(class76.field1325, var18, var15 + 5, 16777215, 0);
                    var34 += 15;
                }
            }
            if (class73.field1249 != 1) {
                if (~class157.field3026 < -1) {
                    class47.method297((byte) 39, class157.field3026);
                    class157.field3026 = 0;
                }
                class73.method459((byte) -82);
            }
            class78.field1371[class78.field1380 ? 1 : 0].method1134(725, 463);
            if (~class174.field3353 < -6 && class114.field2175 != 2 && ~class63.field1057 == -1) {
                if (class1.field6 == null) {
                    class1.field6 = class141.method953(class146.field2800, class10.field136, class163.field3125, arg1 ^ -352);
                } else {
                    byte var19 = 5;
                    short var20 = 463;
                    class1.field6.method1134(var19, var20);
                    byte var21 = 100;
                    byte var22 = 35;
                    arg2.method1262(class67.method440(arg1 ^ 302, new class10[] { class192.field3658, class5.field65, class119.method846(0, class191.field3630) }), var21 / 2 + var19, var22 / 2 + var20 + -2, 16777215, 0);
                    if (class170.field3274 == null) {
                        arg0.method1262(class179.field3410, var21 / 2 + var19, var22 / 2 + var20 - -12, 16777215, 0);
                    } else {
                        arg0.method1262(class192.field3661, var21 / 2 + var19, var22 / 2 + var20 - -12, 16777215, 0);
                    }
                }
            }
            if (arg1 != 302) {
                field871 = 99;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[I")
    private final int[] method353(int arg0, int arg1) {
        if (arg1 != -73) {
            method352((class177) null, 105, (class177) null);
        }
        ++field857;
        if (~arg0 > -1) {
            return this.field858;
        } else {
            return arg0 >= this.field867.length ? this.field862 : this.field867[arg0];
        }
    }

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)V")
    public static final void method354(int arg0) {
        class108.field2014 = 0;
        class34.field532 = 0;
        class133.method917((byte) 115);
        class104.method677(20);
        ++field869;
        class160.method1064(-24506);
        class172.method1129(36);
        for (int var1 = 0; ~class108.field2014 < ~var1; ++var1) {
            int var3 = class42.field703[var1];
            if (~class120.field2304 != ~class2.field10[var3].field1085) {
                class2.field10[var3] = null;
            }
        }
        if (class154.field2972 != class74.field1273.field2170) {
            throw new RuntimeException("gpp1 pos:" + class74.field1273.field2170 + " psize:" + class154.field2972);
        } else {
            int var2 = 0;
            if (arg0 != 2) {
                field853 = null;
            }
            while (~var2 > ~class189.field3616) {
                if (class2.field10[class174.field3355[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class189.field3616);
                }
                ++var2;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class49() {
        super(1, true);
    }
}
