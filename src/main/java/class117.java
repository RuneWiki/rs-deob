import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class117 extends class7 {

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    private int field2259 = 81;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    private int field2266 = 0;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
    private int field2271 = 8;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    private int field2270 = 4;

    @OriginalMember(owner = "client!lh", name = "ib", descriptor = "I")
    private int field2276 = 204;

    @OriginalMember(owner = "client!lh", name = "jb", descriptor = "I")
    private int field2277 = 1024;

    @OriginalMember(owner = "client!lh", name = "qb", descriptor = "I")
    private int field2284 = 409;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    private int field2261 = 1024;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "Lob;")
    public static class141 field2264 = class175.method1195(40, "(U3");

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field2263 = 0;

    @OriginalMember(owner = "client!lh", name = "mb", descriptor = "Lob;")
    public static class141 field2280 = class175.method1195(40, "m");

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "B")
    public static byte field2262;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "I")
    private int field2274;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!lh", name = "kb", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!lh", name = "lb", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!lh", name = "nb", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!lh", name = "pb", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!lh", name = "rb", descriptor = "I")
    private int field2285;

    @OriginalMember(owner = "client!lh", name = "sb", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!lh", name = "tb", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!lh", name = "ub", descriptor = "Lkc;")
    public static class102 field2288;

    @OriginalMember(owner = "client!lh", name = "ob", descriptor = "[I")
    private int[] field2282;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "[[I")
    private int[][] field2268;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "[[I")
    private int[][] field2273;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLog;I)Lob;")
    public static final class141 method755(byte arg0, class146 arg1, int arg2) {
        ++field2279;
        try {
            if (arg0 != 66) {
                field2264 = null;
            }
            class141 var3 = new class141();
            var3.field2705 = arg1.method1010(-2);
            if (var3.field2705 > arg2) {
                var3.field2705 = arg2;
            }
            var3.field2701 = new byte[var3.field2705];
            arg1.field2865 += class126.field2424.method1244(3, 0, var3.field2701, arg1.field2865, arg1.field2859, var3.field2705);
            return var3;
        } catch (Exception var4) {
            return class10.field190;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 <= 13) {
            return null;
        } else {
            ++field2265;
            int[] var3 = super.field100.method842(arg1, 12);
            if (super.field100.field2534) {
                int var4 = 0;
                int var5;
                for (var5 = class177.field3503[arg1] - -this.field2266; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (this.field2271 > var4 && var5 >= this.field2282[var4]) {
                    ++var4;
                }
                int var6 = var4 - 1;
                int var7 = this.field2282[var4];
                boolean var8 = (1 & var4) == 0;
                int var9 = this.field2282[var4 - 1];
                if (this.field2274 + var9 < var5 && var5 < -this.field2274 + var7) {
                    for (int var10 = 0; field2272 > var10; ++var10) {
                        int var11 = 0;
                        int var12 = !var8 ? -this.field2261 : this.field2261;
                        int var13;
                        for (var13 = (this.field2285 * var12 >> 12) + class15.field272[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (~this.field2270 < ~var11 && this.field2273[var6][var11] <= var13) {
                            ++var11;
                        }
                        int var14 = this.field2273[var6][var11];
                        int var15 = var11 + -1;
                        int var16 = this.field2273[var6][var15];
                        if (this.field2274 + var16 < var13 && -this.field2274 + var14 > var13) {
                            var3[var10] = this.field2268[var6][var15];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class149.method1040(var3, 0, field2272, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V")
    public static final void method756(boolean arg0) {
        if (arg0) {
            for (int var1 = -1; class184.field3587 > var1; ++var1) {
                int var2;
                if (var1 == -1) {
                    var2 = 2047;
                } else {
                    var2 = class188.field3647[var1];
                }
                class38 var3 = class116.field2231[var2];
                if (var3 != null) {
                    class104.method694(var3, 1, 13184);
                }
            }
            ++field2275;
        }
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        if (arg0 == 1) {
            this.method762((byte) -12);
            ++field2283;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)V")
    public static final void method757(int arg0, int arg1) {
        ++field2267;
        int[] var2 = class108.field2079.field1983;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            var2[var4] = 1;
        }
        int var5 = 1;
        if (arg1 == -4) {
            while (var5 < 103) {
                int var20 = (52736 - var5 * 512) * 4 + 24628;
                for (int var21 = 1; ~var21 > -104; ++var21) {
                    if ((24 & class164.field3177[arg0][var21][var5]) == 0) {
                        class27.method191(var2, var20, 512, arg0, var21, var5);
                    }
                    if (~arg0 > -4 && ~(class164.field3177[arg0 + 1][var21][var5] & 8) != -1) {
                        class27.method191(var2, var20, 512, arg0 + 1, var21, var5);
                    }
                    var20 += 4;
                }
                ++var5;
            }
            int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - -(-10 + (int) (Math.random() * 20.0D) + 238 << 8) - (-238 - (int) (Math.random() * 20.0D)) + -10;
            class108.field2079.method675();
            int var7 = -10 + 238 + (int) (Math.random() * 20.0D) << 16;
            for (int var8 = 1; ~var8 > -104; ++var8) {
                for (int var19 = 1; ~var19 > -104; ++var19) {
                    if (~(class164.field3177[arg0][var19][var8] & 24) == -1) {
                        class1.method1(var6, var7, var19, arg0, var8, -108);
                    }
                    if (~arg0 > -4 && (8 & class164.field3177[arg0 - -1][var19][var8]) != 0) {
                        class1.method1(var6, var7, var19, arg0 - -1, var8, -100);
                    }
                }
            }
            class88.field1761 = 0;
            for (int var9 = 0; var9 < 104; ++var9) {
                for (int var10 = 0; ~var10 > -105; ++var10) {
                    long var11 = class177.method1206(class66.field1287, var9, var10);
                    if (var11 != 0L) {
                        int var13 = class175.method1198(-14098, (int) (var11 >>> 32) & Integer.MAX_VALUE).field1077;
                        if (var13 >= 0) {
                            int var14 = var10;
                            int var15 = var9;
                            if (~var13 != -23 && ~var13 != -30 && var13 != 34 && ~var13 != -37 && var13 != 46 && var13 != 47 && ~var13 != -49) {
                                int[][] var16 = class47.field888[class66.field1287].field1592;
                                for (int var17 = 0; var17 < 10; ++var17) {
                                    int var18 = (int) (Math.random() * 4.0D);
                                    if (~var18 == -1 && var15 > 0 && var15 > var9 - 3 && (var16[var15 + -1][var14] & 19661064) == 0) {
                                        --var15;
                                    }
                                    if (var18 == 1 && ~var15 > -104 && ~var15 > ~(var9 + 3) && ~(19661184 & var16[var15 + 1][var14]) == -1) {
                                        ++var15;
                                    }
                                    if (var18 == 2 && ~var14 < -1 && var10 - 3 < var14 && ~(19661058 & var16[var15][var14 + -1]) == -1) {
                                        --var14;
                                    }
                                    if (var18 == 3 && ~var14 > -104 && ~var14 > ~(var10 - -3) && ~(19661088 & var16[var15][var14 - -1]) == -1) {
                                        ++var14;
                                    }
                                }
                            }
                            class97.field1914[class88.field1761] = class22.field368[var13];
                            class92.field1845[class88.field1761] = var15;
                            class220.field4169[class88.field1761] = var14;
                            ++class88.field1761;
                        }
                    }
                }
            }
            class219.field4149.method704(-5);
        }
    }

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "(I)V")
    public static final void method758(int arg0) {
        ++field2286;
        if (class146.field2852 == null) {
            if (class66.field1275 == null) {
                int var1 = -69 % ((-77 - arg0) / 35);
                int var2 = class164.field3170;
                if (class114.field2180) {
                    if (var2 != 1) {
                        int var7 = class174.field3452;
                        int var8 = class146.field2794;
                        if (class114.field2188 + -10 > var8 || ~var8 < ~(class203.field3890 + class114.field2188 + 10) || class197.field3770 - 10 > var7 || class79.field1594 + class197.field3770 + 10 < var7) {
                            class114.field2180 = false;
                            class143.method944(class197.field3770, class114.field2188, class203.field3890, class79.field1594, 2);
                        }
                    }
                    if (~var2 != -2) {
                        return;
                    }
                    int var9 = class114.field2188;
                    int var10 = class203.field3890;
                    int var11 = class81.field1630;
                    int var12 = class197.field3770;
                    int var13 = class195.field3737;
                    int var14 = -1;
                    for (int var15 = 0; ~class188.field3637 < ~var15; ++var15) {
                        int var16 = 31 - -((class188.field3637 + -1 - var15) * 15) + var12;
                        if (var11 > var9 && ~(var9 + var10) < ~var11 && var13 > var16 + -13 && ~var13 > ~(var16 + 3)) {
                            var14 = var15;
                        }
                    }
                    if (var14 != -1) {
                        class76.method534(var14, (byte) -37);
                    }
                    class114.field2180 = false;
                    class143.method944(class197.field3770, class114.field2188, class203.field3890, class79.field1594, 2);
                } else {
                    if (var2 == 1 && ~class188.field3637 < -1) {
                        short var3 = class157.field3026[class188.field3637 + -1];
                        if (var3 == 49 || ~var3 == -8 || var3 == 8 || var3 == 33 || ~var3 == -5 || ~var3 == -11 || var3 == 31 || ~var3 == -2 || var3 == 28 || ~var3 == -59 || ~var3 == -4 || var3 == 1001) {
                            int var4 = class133.field2529[class188.field3637 + -1];
                            int var5 = class6.field76[class188.field3637 + -1];
                            class170 var6 = class192.method1268(var4, -79);
                            if (class187.method1247(8, class26.method180(var6, 18125)) || class184.method1234(class26.method180(var6, 18125), (byte) 84)) {
                                class15.field271 = 0;
                                class218.field4132 = false;
                                if (class146.field2852 != null) {
                                    class38.method252(class146.field2852, -107);
                                }
                                class146.field2852 = class192.method1268(var4, -62);
                                class46.field886 = class81.field1630;
                                class174.field3464 = var5;
                                class84.field1670 = class195.field3737;
                                class38.method252(class146.field2852, -125);
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (class146.field2835 == 1 && class188.field3637 > 2 || class58.method394(class188.field3637 + -1, 0))) {
                        var2 = 2;
                    }
                    if (var2 == 1 && ~class188.field3637 < -1) {
                        class76.method534(class188.field3637 + -1, (byte) -37);
                    }
                    if (var2 == 2 && class188.field3637 > 0) {
                        class17.method105(765);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIILaa;Laa;IIIIJ)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, class2 arg4, class2 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class58 var12 = new class58();
            var12.field1133 = arg10;
            var12.field1123 = arg1 * 128 + 64;
            var12.field1136 = arg2 * 128 + 64;
            var12.field1138 = arg3;
            var12.field1135 = arg4;
            var12.field1139 = arg5;
            var12.field1137 = arg6;
            var12.field1121 = arg7;
            var12.field1130 = arg8;
            var12.field1129 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class131.field2506[var13][arg1][arg2] == null) {
                    class131.field2506[var13][arg1][arg2] = new class153(var13, arg1, arg2);
                }
            }
            class131.field2506[arg0][arg1][arg2].field2923 = var12;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = 45 % ((66 - arg1) / 57);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field2277 = arg2.method1007(95);
                                    }
                                } else {
                                    this.field2259 = arg2.method1007(44);
                                }
                            } else {
                                this.field2266 = arg2.method1007(72);
                            }
                        } else {
                            this.field2261 = arg2.method1007(91);
                        }
                    } else {
                        this.field2276 = arg2.method1007(107);
                    }
                } else {
                    this.field2284 = arg2.method1007(28);
                }
            } else {
                this.field2271 = arg2.method991(255);
            }
        } else {
            this.field2270 = arg2.method991(255);
        }
        ++field2260;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public static void method760(byte arg0) {
        field2264 = null;
        field2280 = null;
        if (arg0 != -115) {
            field2263 = 31;
        }
        field2288 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)I")
    public static final int method761(int arg0, int arg1, byte arg2) {
        class136 var3 = (class136) class96.field1894.method792((long) arg1, 22346);
        ++field2281;
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && ~arg0 > ~var3.field2594.length) {
            return arg2 < 32 ? 14 : var3.field2594[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
    private final void method762(byte arg0) {
        ++field2269;
        Random var2 = new Random((long) this.field2271);
        this.field2285 = 4096 / this.field2270;
        this.field2273 = new int[this.field2271][this.field2270 - -1];
        int var3 = this.field2285 / 2;
        this.field2268 = new int[this.field2271][this.field2270];
        if (arg0 <= -1) {
            this.field2278 = 4096 / this.field2271;
            this.field2274 = this.field2259 / 2;
            int var4 = this.field2278 / 2;
            this.field2282 = new int[this.field2271 + 1];
            this.field2282[0] = 0;
            for (int var5 = 0; ~this.field2271 < ~var5; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field2278;
                    int var7 = (-2048 + class209.method1367((byte) 95, var2, 4096)) * this.field2276 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field2282[var5] = this.field2282[var5 + -1] + var8;
                }
                this.field2273[var5][0] = 0;
                for (int var9 = 0; ~var9 > ~this.field2270; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field2285;
                        int var11 = (-2048 + class209.method1367((byte) 119, var2, 4096)) * this.field2284 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field2273[var5][var9] = this.field2273[var5][var9 + -1] - -var12;
                    }
                    this.field2268[var5][var9] = ~this.field2277 >= -1 ? 4096 : -class209.method1367((byte) 88, var2, this.field2277) + 4096;
                }
                this.field2273[var5][this.field2270] = 4096;
            }
            this.field2282[this.field2271] = 4096;
        }
    }
}
