import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class45 {

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Liv;")
    public static class64 field147 = new class64(32, -1);

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lln;Z)I")
    public static final int method47(class256 arg0, boolean arg1) {
        ++field148;
        if (!arg1) {
            field147 = null;
        }
        int var2 = arg0.field3686;
        class435 var3 = arg0.method3094(-81);
        if (arg0.field7682) {
            var2 = arg0.field3706;
        } else if (arg0.field7666 != var3.field6454 && arg0.field7666 != var3.field6493 && ~arg0.field7666 != ~var3.field6490 && arg0.field7666 != var3.field6488) {
            if (~arg0.field7666 == ~var3.field6450 || ~arg0.field7666 == ~var3.field6448 || arg0.field7666 == var3.field6476 || arg0.field7666 == var3.field6462) {
                var2 = arg0.field3720;
            }
        } else {
            var2 = arg0.field3700;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)V")
    public static void method48(byte arg0) {
        field147 = null;
        if (arg0 < 57) {
            field147 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field151;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            return null;
        } else {
            if (super.field833.field1888) {
                int[] var4 = this.method434(2, arg1, 123);
                int[][] var5 = this.method437(0, arg1, arg0 + -62);
                int[][] var6 = this.method437(1, arg1, 106);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~var16 > ~class259.field3768; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 == -4097) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    } else if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            super.field844 = arg0.method1063((byte) 107) == 1;
        }
        ++field145;
        if (arg1 != -26471) {
            field147 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIZ)I")
    public static final int method50(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method47((class256) null, true);
        }
        ++field146;
        if (arg1 < arg0) {
            return arg0;
        } else {
            return arg1 > arg2 ? arg2 : arg1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class9() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field150;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field854.method863((byte) 12, arg1);
            if (super.field854.field1928) {
                int[] var4 = this.method434(0, arg1, 120);
                int[] var5 = this.method434(1, arg1, 120);
                int[] var6 = this.method434(2, arg1, arg0 + -20);
                for (int var7 = 0; ~class259.field3768 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method51(boolean arg0, byte[] arg1) {
        ++field149;
        if (arg1 == null) {
            return null;
        } else {
            if (arg0) {
                field147 = null;
            }
            byte[] var2 = new byte[arg1.length];
            class73.method589(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
