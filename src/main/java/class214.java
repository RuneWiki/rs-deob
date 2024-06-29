import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class214 extends class34 {

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field3294 = -1;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Lpk;")
    public static class237 field3289;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
    public static void method1441(int arg0) {
        if (arg0 > -124) {
            field3294 = -90;
        }
        field3289 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
    public static final void method1442(boolean arg0) {
        ++field3287;
        if (arg0) {
            field3294 = -82;
        }
        for (class269 var1 = (class269) class249.field3864.method1894((byte) -90); var1 != null; var1 = (class269) class249.field3864.method1886(-70)) {
            if (var1.field4201) {
                var1.method1813(86);
            }
        }
        for (class269 var2 = (class269) class256.field3947.method1894((byte) -90); var2 != null; var2 = (class269) class256.field3947.method1886(-58)) {
            if (var2.field4201) {
                var2.method1813(54);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIIZI)V")
    public static final void method1443(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg1 != 1) {
            field3294 = -26;
        }
        ++field3291;
        class295.method1942(arg3, arg2, arg0, 713, 0, arg4, class101.field1471.length + -1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg0 == 6) {
            ++field3293;
            if (~arg1 == -1) {
                super.field604 = arg2.method407(arg0 + 249) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(JI)V")
    public static final void method1444(long arg0, int arg1) {
        ++field3290;
        if (~arg0 != -1L) {
            if (arg1 <= -32) {
                for (int var3 = 0; ~class206.field3090 < ~var3; ++var3) {
                    if (~class51.field831[var3] == ~arg0) {
                        ++class32.field570;
                        --class206.field3090;
                        for (int var4 = var3; class206.field3090 > var4; ++var4) {
                            class51.field831[var4] = class51.field831[var4 + 1];
                            class248.field3853[var4] = class248.field3853[var4 + 1];
                            class164.field2392[var4] = class164.field2392[var4 + 1];
                        }
                        class226.field3533 = class169.field2494;
                        class59.field964.method1540(87, (byte) -2);
                        class59.field964.method440(arg0, -66);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class214() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field3286;
        int[][] var3 = super.field618.method91(-97, arg1);
        if (super.field618.field211) {
            int[] var4 = this.method230(arg1, -15337, 2);
            int[][] var5 = this.method231(arg1, (byte) 70, 0);
            int[][] var6 = this.method231(arg1, (byte) 99, 1);
            int[] var7 = var3[2];
            int[] var8 = var5[0];
            int[] var9 = var5[1];
            int[] var10 = var5[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class226.field3527 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var11[var16] = var8[var16] * var17 + var13[var16] * var18 >> 12;
                        var12[var16] = var9[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var7[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var11[var16] = var13[var16];
                        var12[var16] = var14[var16];
                        var7[var16] = var15[var16];
                    }
                } else {
                    var11[var16] = var8[var16];
                    var12[var16] = var9[var16];
                    var7[var16] = var10[var16];
                }
            }
        }
        int var19 = 3 / ((-54 - arg0) / 44);
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        int[] var3 = super.field610.method228(24856, arg1);
        if (arg0 <= 75) {
            this.method50(-17, -78, (class54) null);
        }
        ++field3288;
        if (super.field610.field597) {
            int[] var4 = this.method230(arg1, -15337, 0);
            int[] var5 = this.method230(arg1, -15337, 1);
            int[] var6 = this.method230(arg1, -15337, 2);
            for (int var7 = 0; var7 < class226.field3527; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILpk;)V")
    public static final void method1445(int arg0, class237 arg1) {
        if (arg0 != 0) {
            field3294 = -20;
        }
        ++field3292;
        class75.field1202 = arg1;
    }
}
