import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class138 extends class223 {

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2073 = null;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "[I")
    public static int[] field2076 = new int[14];

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "Lnf;")
    public static class162 field2069 = new class162(64);

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field2077 = 99;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "Lub;")
    public static class92 field2078;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
    public static void method1020(byte arg0) {
        field2073 = null;
        field2078 = null;
        field2069 = null;
        field2076 = null;
        if (arg0 != 62) {
            field2072 = 61;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI[IJ)Ljava/lang/String;")
    public static final String method1022(byte arg0, int arg1, int[] arg2, long arg3) {
        ++field2075;
        if (arg0 != -37) {
            method1023(81, -106, -48);
        }
        if (class222.field3425 != null) {
            String var5 = class222.field3425.method822(arg3, arg0 ^ 105, arg2, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field2071;
        if (arg0 < 14) {
            this.method135(-24, 22);
        }
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int[] var4 = this.method1533(0, arg1, -95);
            for (int var5 = 0; ~var5 > ~class250.field4008; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field2074;
        if (arg2 == 102) {
            if (~arg1 == -1) {
                super.field3583 = ~arg0.method265(arg2 + -208) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field2070;
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[][] var4 = this.method1534(false, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; class250.field4008 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var7[var11] = -var6[var11] + 4096;
                var10[var11] = -var9[var11] + 4096;
            }
        }
        if (arg0 <= 0) {
            this.method37((class31) null, 72, (byte) -7);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class138() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(III)Lff;")
    public static final class19 method1023(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field371; ++var4) {
                class19 var5 = var3.field355[var4];
                if ((var5.field267 >> 29 & 3L) == 2L && var5.field255 == arg1 && var5.field258 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }
}
