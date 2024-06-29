import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class274 extends class272 {

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "Lli;")
    public static class185 field4851 = class245.method1649(" ", -18);

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "S")
    public static short field4856 = 256;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "[Z")
    public static boolean[] field4855 = new boolean[100];

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "Lli;")
    public static class185 field4858 = class245.method1649("Veuillez patienter)3)3)3", 127);

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "[B")
    public static byte[] field4852 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field4864 = 0;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "[I")
    public static int[] field4865 = new int[8];

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "F")
    public static float field4859;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "Lhi;")
    public static class250 field4861;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "[I")
    public static int[] field4869;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Loc;B)V")
    public static final void method1877(class121 arg0, byte arg1) {
        if (arg1 == -77) {
            class54.method374(arg1 + 77, 200000, arg0);
            ++field4854;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        int var3 = -92 % ((-60 - arg1) / 45);
        int[][] var4 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int[] var5 = this.method1866(arg0, 2, 124);
            int[][] var6 = this.method1860(arg0, 3, 0);
            int[][] var7 = this.method1860(arg0, 3, 1);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[2];
            int[] var13 = var6[1];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; class246.field4385 > var17; ++var17) {
                int var18 = var5[var17];
                if (~var18 != -4097) {
                    if (var18 == 0) {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                    } else {
                        int var19 = -var18 + 4096;
                        var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                        var9[var17] = var13[var17] * var18 + var15[var17] * var19 >> 12;
                        var10[var17] = var12[var17] * var18 + var16[var17] * var19 >> 12;
                    }
                } else {
                    var8[var17] = var11[var17];
                    var9[var17] = var13[var17];
                    var10[var17] = var12[var17];
                }
            }
        }
        ++field4866;
        return var4;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field4862;
        if (arg1 != 4421) {
            return null;
        } else {
            int[] var3 = super.field4819.method1632(0, arg0);
            if (super.field4819.field4294) {
                int[] var4 = this.method1866(arg0, 0, 98);
                int[] var5 = this.method1866(arg0, 1, arg1 + -4310);
                int[] var6 = this.method1866(arg0, 2, arg1 ^ 4402);
                for (int var7 = 0; ~class246.field4385 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (var8 == 0) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
    public static final void method1878(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4857;
        for (int var5 = arg2; class185.field3410 > var5; ++var5) {
            if (~(class15.field257[var5] + class123.field2228[var5]) < ~arg3 && class15.field257[var5] < arg3 + arg4 && class211.field3847[var5] - -class52.field912[var5] > arg1 && ~(arg0 + arg1) < ~class211.field3847[var5]) {
                field4855[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class274() {
        super(3, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4867;
        for (int var6 = arg4; ~(arg4 - -arg5) <= ~var6; ++var6) {
            for (int var11 = arg0; ~(arg0 + arg3) <= ~var11; ++var11) {
                if (var11 >= 0 && ~var11 > -105 && ~var6 <= -1 && ~var6 > -105) {
                    class157.field2981[arg1][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg4; var7 < arg4 + arg5; ++var7) {
            for (int var10 = arg0; ~(arg0 + arg3) < ~var10; ++var10) {
                if (~var10 <= -1 && var10 < 104 && var7 >= 0 && ~var7 > -105) {
                    class201.field3694[arg1][var10][var7] = arg1 > 0 ? class201.field3694[arg1 + -1][var10][var7] : 0;
                }
            }
        }
        if (arg0 > 0 && ~arg0 > -105) {
            for (int var8 = arg4 + 1; arg4 + arg5 > var8; ++var8) {
                if (~var8 <= -1 && ~var8 > -105) {
                    class201.field3694[arg1][arg0][var8] = class201.field3694[arg1][arg0 + -1][var8];
                }
            }
        }
        if (arg2 > ~arg4 && arg4 < 104) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg3; ++var9) {
                if (var9 >= 0 && ~var9 > -105) {
                    class201.field3694[arg1][var9][arg4] = class201.field3694[arg1][var9][arg4 + -1];
                }
            }
        }
        if (arg0 >= 0 && ~arg4 <= -1 && arg0 < 104 && ~arg4 > -105) {
            if (arg1 == 0) {
                if (arg0 > 0 && class201.field3694[arg1][arg0 + -1][arg4] != 0) {
                    class201.field3694[arg1][arg0][arg4] = class201.field3694[arg1][arg0 + -1][arg4];
                    return;
                }
                if (arg4 > 0 && ~class201.field3694[arg1][arg0][arg4 + -1] != -1) {
                    class201.field3694[arg1][arg0][arg4] = class201.field3694[arg1][arg0][arg4 + -1];
                    return;
                }
                if (arg0 > 0 && arg4 > 0 && ~class201.field3694[arg1][arg0 + -1][arg4 + -1] != -1) {
                    class201.field3694[arg1][arg0][arg4] = class201.field3694[arg1][arg0 - 1][arg4 + -1];
                    return;
                }
            } else {
                if (arg0 <= 0 || ~class201.field3694[arg1 + -1][arg0 - 1][arg4] == ~class201.field3694[arg1][arg0 + -1][arg4]) {
                    if (~arg4 < -1 && class201.field3694[arg1 + -1][arg0][arg4 + -1] != class201.field3694[arg1][arg0][arg4 + -1]) {
                        class201.field3694[arg1][arg0][arg4] = class201.field3694[arg1][arg0][arg4 + -1];
                        return;
                    }
                    if (arg0 > 0 && arg4 > 0 && class201.field3694[arg1][arg0 + -1][arg4 + -1] != class201.field3694[arg1 + -1][arg0 + -1][arg4 + -1]) {
                        class201.field3694[arg1][arg0][arg4] = class201.field3694[arg1][arg0 - 1][arg4 + -1];
                        return;
                    }
                    return;
                }
                class201.field3694[arg1][arg0][arg4] = class201.field3694[arg1][arg0 + -1][arg4];
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)I")
    public static final int method1880(int arg0, boolean arg1) {
        ++field4853;
        if (!arg1) {
            field4859 = -1.1069889F;
        }
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
    public static void method1881(int arg0) {
        if (arg0 < 114) {
            field4852 = null;
        }
        field4858 = null;
        field4851 = null;
        field4855 = null;
        field4852 = null;
        field4869 = null;
        field4861 = null;
        field4865 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = 28 % ((arg1 - -21) / 55);
        if (~arg2 == -1) {
            super.field4832 = arg0.method867(false) == 1;
        }
        ++field4860;
    }
}
