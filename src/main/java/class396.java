import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class396 extends class346 {

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "Z")
    private boolean field5777 = true;

    @OriginalMember(owner = "client!tq", name = "R", descriptor = "Z")
    private boolean field5786 = true;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "[I")
    public static int[] field5776 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
    public static int field5784 = -1;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
    public static int field5783 = 0;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "Z")
    public static boolean field5779 = false;

    @OriginalMember(owner = "client!tq", name = "S", descriptor = "Ljava/lang/String;")
    public static String field5787 = null;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!tq", name = "Q", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!tq", name = "U", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    public class396() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 3) {
            field5788 = -126;
        }
        ++field5781;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int[] var4 = this.method2294((byte) 54, this.field5786 ? -arg0 + class215.field3000 : arg0, 0);
            if (!this.field5777) {
                class206.method1357(var4, 0, var3, 0, class134.field1753);
            } else {
                for (int var5 = 0; class134.field1753 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class188.field2572];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIB)Lbq;")
    public static final class114 method2546(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -24) {
            return null;
        } else {
            ++field5785;
            class287[] var5 = null;
            class273 var6 = class453.method2823(true, arg2);
            if (var6.field4017 != null) {
                var5 = new class287[var6.field4017.length];
                for (int var7 = 0; ~var7 > ~var5.length; ++var7) {
                    class266 var8 = class229.method1493(var6.field4017[var7], -6801);
                    var5[var7] = new class287(var8.field3951, var8.field3945, var8.field3947, var8.field3942, var8.field3940, var8.field3937, var8.field3941, var8.field3953);
                }
            }
            return new class114(var6.field4019, var5, var6.field4006, arg0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field5778;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (arg1 > -3) {
            field5788 = 91;
        }
        if (super.field5170.field6288) {
            int[][] var4 = this.method2293(0, 0, this.field5786 ? class215.field3000 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field5777) {
                for (int var11 = 0; class134.field1753 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class134.field1753 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class188.field2572];
                    var9[var12] = var6[-var12 + class188.field2572];
                    var10[var12] = var7[-var12 + class188.field2572];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
    public static final void method2547(boolean arg0, int arg1) {
        ++field5782;
        int[] var2 = null;
        byte var3;
        byte[][] var4;
        if (!arg0) {
            var3 = 4;
            var4 = class238.field3324;
        } else {
            var3 = 1;
            var4 = class243.field3411;
        }
        for (int var5 = arg1; ~var5 > ~var3; ++var5) {
            class264.method1766(8);
            for (int var6 = 0; ~(class351.field5217 >> 3) < ~var6; ++var6) {
                for (int var7 = 0; ~(class143.field1815 >> 3) < ~var7; ++var7) {
                    boolean var8 = false;
                    int var9 = class318.field4679[var5][var6][var7];
                    if (~var9 != 0) {
                        int var10 = (var9 & 53522598) >> 24;
                        if (!arg0 || ~var10 == -1) {
                            int var11 = (var9 & 7) >> 1;
                            int var12 = (var9 & 16766447) >> 14;
                            int var13 = 2047 & var9 >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; ~class166.field2249.length < ~var15; ++var15) {
                                if (class166.field2249[var15] == var14 && var4[var15] != null) {
                                    int[] var16 = class116.method853(-15, var4[var15], var11, arg0, var12, var7 * 8, var5, var10, class126.field1647, class420.field6108, var6 * 8, var13);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class195.method1293(var5, arg1 ^ -128, var6 * 8, 8, 8, var7 * 8);
                    }
                }
            }
        }
        if (var2 != null) {
            class193.field2683 = method2546(var2[1], var2[2], var2[0], var2[3], (byte) -93);
            class122.field1573 = var2[4];
        } else {
            class193.field2683 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)V")
    public static void method2548(int arg0) {
        if (arg0 != 17261) {
            method2547(true, -55);
        }
        field5787 = null;
        field5776 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field5780;
        if (arg1) {
            field5788 = -34;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field5151 = arg0.method2233((byte) 104) == 1;
                }
            } else {
                this.field5786 = ~arg0.method2233((byte) 104) == -2;
            }
        } else {
            this.field5777 = arg0.method2233((byte) 104) == 1;
        }
    }
}
