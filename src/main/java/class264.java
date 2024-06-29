import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class264 extends class175 {

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field4610 = 0;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "Lff;")
    public static class3 field4611;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "[Lcc;")
    private class271[] field4616;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)Z")
    public static final boolean method1820(byte arg0, int arg1) {
        ++field4612;
        if (arg0 != 10) {
            field4611 = null;
        }
        return ~(arg1 >> 22 & 1) != -1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([[II)V")
    private final void method1821(int[][] arg0, int arg1) {
        ++field4613;
        int var3 = class1.field11;
        int var4 = class85.field1440;
        class57.method418(arg0, (byte) 107);
        class46.method359(class92.field1520, 0, 0, class194.field3343, -31621);
        if (arg1 != 4876) {
            field4614 = 63;
        }
        if (this.field4616 != null) {
            for (int var5 = 0; this.field4616.length > var5; ++var5) {
                class271 var6 = this.field4616[var5];
                int var7 = var6.field4714;
                int var8 = var6.field4718;
                if (~var8 <= -1) {
                    if (var7 >= 0) {
                        var6.method768(arg1 ^ 8174, var4, var3);
                    } else {
                        var6.method766(var3, (byte) -44, var4);
                    }
                } else if (var7 >= 0) {
                    var6.method769(var3, 100, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = -33 % ((-22 - arg0) / 58);
        ++field4607;
        if (~arg1 == -1) {
            this.field4616 = new class271[arg2.method1651(4139)];
            for (int var5 = 0; ~this.field4616.length < ~var5; ++var5) {
                int var6 = arg2.method1651(4139);
                if (var6 != 0) {
                    if (~var6 != -2) {
                        if (var6 != 2) {
                            if (~var6 == -4) {
                                this.field4616[var5] = class135.method1007(-1, arg2);
                            }
                        } else {
                            this.field4616[var5] = class256.method1784(-87, arg2);
                        }
                    } else {
                        this.field4616[var5] = class146.method1084(false, arg2);
                    }
                } else {
                    this.field4616[var5] = class75.method544(-1, arg2);
                }
            }
        } else if (~arg1 == -2) {
            super.field3034 = ~arg2.method1651(4139) == -2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public static void method1822(int arg0) {
        field4611 = null;
        if (arg0 != 1) {
            field4611 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field4608;
        if (arg1 != 64) {
            return null;
        } else {
            int[][] var3 = super.field3035.method637(arg0, false);
            if (super.field3035.field1493) {
                int var4 = class1.field11;
                int var5 = class85.field1440;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field3035.method633(arg1 + -143);
                this.method1821(var6, 4876);
                for (int var8 = 0; ~var8 > ~class85.field1440; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~var14 > ~class1.field11; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class130.method985(var15, 255) << 4;
                        var12[var14] = class130.method985(var15 >> 4, 4080);
                        var11[var14] = class130.method985(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int[] var3 = super.field3044.method904((byte) 63, arg1);
        if (super.field3044.field2150) {
            this.method1821(super.field3044.method910(-14451), 4876);
        }
        int var4 = -48 / ((62 - arg0) / 54);
        ++field4606;
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class264() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)I")
    public static final int method1823(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 243) {
            arg2 >>= 4;
        } else if (arg0 > 217) {
            arg2 >>= 3;
        } else if (~arg0 < -193) {
            arg2 >>= 2;
        } else if (arg0 > 179) {
            arg2 >>= 1;
        }
        ++field4609;
        return arg3 != -1041654687 ? 88 : (arg0 >> 1) + (arg1 >> 2 << 10) + (arg2 >> 5 << 7);
    }
}
