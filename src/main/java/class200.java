import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class200 extends class23 {

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    private int field3655 = 0;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    private int field3653 = 1;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    private int field3661 = 0;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "Llc;")
    public static class143 field3656 = class66.method374("Cabbage", -1);

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "Llc;")
    public static class143 field3660 = class66.method374(")4l=", -1);

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "Llc;")
    public static class143 field3657 = class66.method374("Gestionnaire de saisie charg-B", -1);

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Llc;")
    public static class143 field3652 = class66.method374("; version=1; path=)4; domain=", -1);

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method1376(boolean arg0) {
        field3657 = null;
        field3652 = null;
        field3656 = null;
        if (!arg0) {
            field3660 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        ++field3659;
        int var2 = -128 % ((22 - arg0) / 60);
        class12.method99(512);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -4) {
                        this.field3653 = arg0.method1265(122);
                    }
                } else {
                    this.field3655 = arg0.method1265(127);
                }
            } else {
                this.field3661 = arg0.method1265(124);
            }
            ++field3654;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        int[] var3 = super.field369.method306(arg1, -23179);
        if (arg0 >= -13) {
            return null;
        } else {
            if (super.field369.field1005) {
                int var4 = class31.field495[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class72.field1359; ++var6) {
                    int var7 = class3.field43[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (this.field3661 != 0) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                        var11 = (int) ((double) (this.field3653 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field3653;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (this.field3655 == 0) {
                        var12 = class51.field1016[(var12 & 4092) >> 4] + 4096 >> 1;
                    } else if (this.field3655 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            ++field3658;
            return var3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class117 var20 = new class117(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class7.field122[var21][arg1][arg2] == null) {
                    class7.field122[var21][arg1][arg2] = new class120(var21, arg1, arg2);
                }
            }
            class7.field122[arg0][arg1][arg2].field2138 = var20;
        } else if (arg3 != 1) {
            class93 var24 = new class93(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class7.field122[var25][arg1][arg2] == null) {
                    class7.field122[var25][arg1][arg2] = new class120(var25, arg1, arg2);
                }
            }
            class7.field122[arg0][arg1][arg2].field2127 = var24;
        } else {
            class117 var22 = new class117(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class7.field122[var23][arg1][arg2] == null) {
                    class7.field122[var23][arg1][arg2] = new class120(var23, arg1, arg2);
                }
            }
            class7.field122[arg0][arg1][arg2].field2138 = var22;
        }
    }
}
