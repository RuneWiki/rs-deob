import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class46 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "[I")
    public static int[] field540 = new int[2048];

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static volatile int field541 = 0;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field543 = 1;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lnd;")
    public static class292 field542 = new class292();

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "[I")
    public static int[] field546 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lef;")
    public static class241 field545 = new class241(64);

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method290(int arg0) {
        field545 = null;
        field546 = null;
        if (arg0 != 64) {
            field545 = null;
        }
        field542 = null;
        field540 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class245 var20 = new class245(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class6.field94[var21][arg1][arg2] == null) {
                    class6.field94[var21][arg1][arg2] = new class133(var21, arg1, arg2);
                }
            }
            class6.field94[arg0][arg1][arg2].field1918 = var20;
        } else if (arg3 == 1) {
            class245 var22 = new class245(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class6.field94[var23][arg1][arg2] == null) {
                    class6.field94[var23][arg1][arg2] = new class133(var23, arg1, arg2);
                }
            }
            class6.field94[arg0][arg1][arg2].field1918 = var22;
        } else {
            class256 var24 = new class256(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class6.field94[var25][arg1][arg2] == null) {
                    class6.field94[var25][arg1][arg2] = new class133(var25, arg1, arg2);
                }
            }
            class6.field94[arg0][arg1][arg2].field1914 = var24;
        }
    }
}
