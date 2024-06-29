import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class171 extends class135 {

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
    private int field2878 = 32768;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "[[S")
    public static short[][] field2873 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "Z")
    public static boolean field2883 = false;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "Lqj;")
    private static class196 field2877 = class80.method502("green:", -48);

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "Lqj;")
    public static class196 field2870 = field2877;

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "Z")
    public static boolean field2882 = false;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "Lqj;")
    public static class196 field2885 = null;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    public static int field2879 = 0;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "Lqj;")
    public static class196 field2874 = field2877;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "I")
    public static int field2886 = 0;

    @OriginalMember(owner = "client!ja", name = "rb", descriptor = "Lqj;")
    private static class196 field2890 = class80.method502("World", -48);

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "Lqj;")
    public static class196 field2889 = field2890;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "Lpi;")
    public static class181 field2876;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "Lnb;")
    public static class95 field2875;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field1962 = ~arg0.method367(1) == -2;
            }
        } else {
            this.field2878 = arg0.method318(true) << 4;
        }
        if (arg2 == -16231) {
            ++field2880;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        int[] var3 = super.field1954.method110(arg0, -108);
        if (super.field1954.field244) {
            int[] var4 = this.method819(-107, 1, arg0);
            int[] var5 = this.method819(-82, 2, arg0);
            for (int var6 = 0; class131.field1862 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field2878 >> 12;
                int var9 = class20.field231[var7] * var8 >> 12;
                int var10 = class173.field2914[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class61.field816;
                int var12 = (var10 >> 12) + arg0 & class53.field667;
                int[] var13 = this.method819(-122, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        if (arg1) {
            field2875 = null;
        }
        ++field2888;
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180) {
            int[] var4 = this.method819(-91, 1, arg1);
            int[] var5 = this.method819(arg0 ^ -260028699, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class131.field1862 > var9; ++var9) {
                int var10 = var5[var9] * this.field2878 >> 12;
                int var11 = (1045277 & var4[var9] * 255) >> 12;
                int var12 = class173.field2914[var11] * var10 >> 12;
                int var13 = class20.field231[var11] * var10 >> 12;
                int var14 = (var13 >> 12) + var9 & class61.field816;
                int var15 = class53.field667 & (var12 >> 12) + arg1;
                int[][] var16 = this.method818(2, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        ++field2872;
        return arg0 != 260028743 ? null : var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method1116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        ++field2884;
        if (class35.method182(arg3, (byte) -115)) {
            class58.field791 = null;
            class223.method1513(-1, class91.field1335[arg3], (byte) -128, arg6, arg5, arg8, arg0, arg1, arg2, arg4);
            if (arg7 != -65) {
                method1118(65, false, 106, (class136) null, 54, (byte) 63);
            }
            if (class58.field791 != null) {
                class223.method1513(-1412584499, class58.field791, (byte) -117, arg6, arg5, class135.field1965, arg0, class245.field4362, arg2, arg4);
                class58.field791 = null;
            }
        } else if (arg4 != -1) {
            class161.field2588[arg4] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class161.field2588[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        if (arg0 != -85) {
            field2870 = null;
        }
        class87.method546((byte) 81);
        ++field2881;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class171() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public static void method1117(int arg0) {
        if (arg0 != 6016) {
            method1117(-40);
        }
        field2873 = null;
        field2889 = null;
        field2876 = null;
        field2877 = null;
        field2874 = null;
        field2890 = null;
        field2870 = null;
        field2885 = null;
        field2875 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZILbk;IB)V")
    public static final void method1118(int arg0, boolean arg1, int arg2, class136 arg3, int arg4, byte arg5) {
        class23.field298 = arg3;
        class164.field2656 = arg4;
        class131.field1863 = 10000;
        class44.field521 = arg1;
        ++field2869;
        class22.field280 = arg0;
        if (arg5 != 114) {
            field2886 = 96;
        }
        class86.field1275 = 1;
        class8.field75 = arg2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjb;)V")
    public static final void method1119(byte arg0, class118 arg1) {
        class156.method986((byte) 48);
        if (arg0 == -73) {
            ++field2887;
            if (field2876 == null) {
                if (!class211.field3799) {
                    class100.method606((byte) -124);
                } else {
                    if (~class178.field3052 == -2) {
                        int var2 = class130.field1843 / 5;
                        int var3 = class53.field669 + var2 + 140;
                        if (~class61.field812 <= ~var3 && ~(var3 - -14) <= ~class61.field812 && ~(class169.field2851 - -4) >= ~class28.field350 && class28.field350 <= class169.field2851 - -18) {
                            class42.method213(0, 0, 0);
                            return;
                        }
                        if (var3 + 15 <= class61.field812 && ~class61.field812 >= ~(var3 + 80) && class169.field2851 + 4 <= class28.field350 && class28.field350 <= class169.field2851 + 18) {
                            class42.method213(0, 0, 1);
                            return;
                        }
                        int var4 = var2 + 250 + class53.field669;
                        if (~class61.field812 <= ~var4 && ~(var4 + 14) <= ~class61.field812 && class169.field2851 + 4 <= class28.field350 && ~class28.field350 >= ~(class169.field2851 + 18)) {
                            class42.method213(arg0 ^ -73, 1, 0);
                            return;
                        }
                        if (var4 + 15 <= class61.field812 && var4 - -80 >= class61.field812 && class169.field2851 - -4 <= class28.field350 && ~class28.field350 >= ~(class169.field2851 + 18)) {
                            class42.method213(arg0 + 73, 1, 1);
                            return;
                        }
                        int var5 = class53.field669 - (-var2 - 360);
                        if (class61.field812 >= var5 && var5 - -14 >= class61.field812 && class28.field350 >= class169.field2851 + 4 && ~class28.field350 >= ~(class169.field2851 + 18)) {
                            class42.method213(0, 2, 0);
                            return;
                        }
                        if (class61.field812 >= var5 - -15 && class61.field812 <= var5 + 80 && ~(class169.field2851 + 4) >= ~class28.field350 && ~(class169.field2851 + 18) <= ~class28.field350) {
                            class42.method213(0, 2, 1);
                            return;
                        }
                        int var6 = class53.field669 + var2 + 470;
                        if (~class61.field812 <= ~var6 && class61.field812 <= var6 - -14 && ~class28.field350 <= ~(class169.field2851 + 4) && ~class28.field350 >= ~(class169.field2851 + 18)) {
                            class42.method213(0, 3, 0);
                            return;
                        }
                        if (~(var6 - -15) >= ~class61.field812 && ~(var6 + 80) <= ~class61.field812 && ~class28.field350 <= ~(class169.field2851 - -4) && class169.field2851 + 18 >= class28.field350) {
                            class42.method213(0, 3, 1);
                            return;
                        }
                        if (class183.field3218 != -1) {
                            class146 var7 = class64.field881[class183.field3218];
                            if (!class105.field1519 == !var7.field2299) {
                                byte[] var8 = class93.method572(-124, new class196[] { var7.field2303, class96.field1408 }).method1316(0);
                                class6.field47 = new String(var8, 0, var8.length);
                                class158.field2549 = var7.field2312;
                                if (class211.field3797 != 0) {
                                    class258.field4522 = 50000 - -class158.field2549;
                                    class218.field3909 = 40000 - -class158.field2549;
                                    class56.field698 = class218.field3909;
                                }
                                if (class65.field919 != null) {
                                    class65.field919.field3116 = true;
                                    class214.method1472(97, class65.field919);
                                }
                                return;
                            }
                            class196 var9 = class163.field2635;
                            if (~class211.field3797 != -1) {
                                var9 = class93.method572(-78, new class196[] { class22.field290, class163.method1029(var7.field2312 + 7000, false) });
                            }
                            class196 var10 = class93.method572(-115, new class196[] { class90.field1321, var7.field2303, class96.field1408, var9, class77.field1105, class163.method1029(class71.field1002, false), class105.field1520, class163.method1029(class22.field279, false), class11.field125, class163.method1029(0, false), class17.field198, class163.method1029(class48.field579, false), class232.field4149, class163.method1029(class47.field569, false) });
                            try {
                                arg1.getAppletContext().showDocument(var10.method1321((byte) -127), "_self");
                                return;
                            } catch (Exception var11) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
