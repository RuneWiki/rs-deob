import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class277 extends class12 {

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field4892 = -2;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field4885 = -1;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "Lvf;")
    public static class265 field4891 = class87.method582(-46, "::fps ");

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Lvf;")
    public static class265 field4895 = class87.method582(-46, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field4905 = 0;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "Lvf;")
    public static class265 field4906 = class87.method582(-46, "jaune:");

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field4897 = 0;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public int field4887;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public int field4893;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public int field4896;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "Lfl;")
    public static class192 field4903;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Lvf;")
    public class265 field4902;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "Lgk;")
    public class6 field4899;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Lgk;")
    public class6 field4901;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "Z")
    public boolean field4898;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "[I")
    public static int[] field4894;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field4883;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class2.field40 * 128) {
            arg0 = class2.field40 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class263.field4588 * 128) {
            arg2 = class263.field4588 * 128 - 1;
        }
        class140.field2572 = class247.field4289[arg3];
        class232.field4101 = class247.field4298[arg3];
        class186.field3371 = class247.field4289[arg4];
        class218.field3929 = class247.field4298[arg4];
        class65.field1254 = arg0;
        class248.field4309 = arg1;
        class204.field3647 = arg2;
        class233.field4110 = arg0 / 128;
        class281.field4961 = arg2 / 128;
        class164.field2984 = class233.field4110 - class168.field3045;
        if (class164.field2984 < 0) {
            class164.field2984 = 0;
        }
        class118.field2084 = class281.field4961 - class168.field3045;
        if (class118.field2084 < 0) {
            class118.field2084 = 0;
        }
        class243.field4249 = class233.field4110 + class168.field3045;
        if (class243.field4249 > class2.field40) {
            class243.field4249 = class2.field40;
        }
        class267.field4701 = class281.field4961 + class168.field3045;
        if (class267.field4701 > class263.field4588) {
            class267.field4701 = class263.field4588;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class168.field3045 + class168.field3045 + 2; var16++) {
            for (int var19 = 0; var19 < class168.field3045 + class168.field3045 + 2; var19++) {
                int var20 = (var16 - class168.field3045 << 7) - (class65.field1254 & 0x7F);
                int var21 = (var19 - class168.field3045 << 7) - (class204.field3647 & 0x7F);
                int var22 = class233.field4110 + var16 - class168.field3045;
                int var23 = class281.field4961 + var19 - class168.field3045;
                if (var22 >= 0 && var23 >= 0 && var22 < class2.field40 && var23 < class263.field4588) {
                    int var24;
                    if (class141.field2619 == null) {
                        var24 = class83.field1557[0][var22][var23] + 128 - class248.field4309;
                    } else {
                        var24 = class141.field2619[0][var22][var23] + 128 - class248.field4309;
                    }
                    int var25 = class83.field1557[3][var22][var23] - class248.field4309 - 1000;
                    class174.field3116[var16][var19] = class58.method436(var20, var25, var24, var21, var15);
                } else {
                    class174.field3116[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class168.field3045 + class168.field3045 + 1; var17++) {
            for (int var18 = 0; var18 < class168.field3045 + class168.field3045 + 1; var18++) {
                class210.field3776[var17][var18] = class174.field3116[var17][var18] || class174.field3116[var17 + 1][var18] || class174.field3116[var17][var18 + 1] || class174.field3116[var17 + 1][var18 + 1];
            }
        }
        class225.field4004 = arg6;
        class93.field1651 = arg7;
        class68.field1301 = arg8;
        class49.field1038 = arg9;
        class261.field4516 = arg10;
        class249.method1657();
        if (class183.field3255 != null) {
            class198.method1367(true);
            class71.method502(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class198.method1367(false);
        }
        class71.method502(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public static void method1895(int arg0) {
        field4895 = null;
        field4903 = null;
        if (arg0 != 1745368897) {
            method1895(111);
        }
        field4891 = null;
        field4894 = null;
        field4906 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIZI)I")
    public static final int method1896(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4880++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (!arg2) {
                field4885 = 12;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V")
    public static final void method1897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -20506) {
            return;
        }
        field4886++;
        int var6 = 0;
        class203.method1394(class44.field973[arg2], arg1 - arg3, arg1 + arg3, -7249, arg5);
        int var7 = arg3 * arg3;
        int var8 = arg4 * arg4;
        int var9 = arg4;
        int var10 = var8 << 1;
        int var11 = arg4 << 1;
        int var12 = var7 << 1;
        int var13 = var8 - ((var11 - 1) * var12);
        int var14 = var7 << 2;
        int var15 = (1 - var11) * var7 + var10;
        int var16 = var8 << 2;
        int var17 = (var6 + 1) * var16;
        int var18 = ((arg4 << 1) - 3) * var12;
        int var19 = ((var6 << 1) + 3) * var10;
        int var20 = (arg4 - 1) * var14;
        while (var9 > 0) {
            var9--;
            int var21 = arg2 - var9;
            if (var15 < 0) {
                while (var15 < 0) {
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var15 += var19;
                    var19 += var16;
                }
            }
            int var22 = arg2 + var9;
            if (var13 < 0) {
                var15 += var19;
                var6++;
                var13 += var17;
                var19 += var16;
                var17 += var16;
            }
            int var23 = arg1 - var6;
            var13 += -var18;
            var15 += -var20;
            var18 -= var14;
            int var24 = arg1 + var6;
            var20 -= var14;
            class203.method1394(class44.field973[var21], var23, var24, -7249, arg5);
            class203.method1394(class44.field973[var22], var23, var24, -7249, arg5);
        }
    }
}
