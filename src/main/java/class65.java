import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class65 {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lcf;")
    public static class93 field1202 = class147.method1066("m-Ochte mit Ihnen handeln)3", -48);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method449(byte arg0) {
        field1202 = null;
        if (arg0 < 18) {
            field1202 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III[B)Lcf;")
    public static final class93 method450(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -13 / ((-arg2 - 56) / 61);
        field1201++;
        class93 var5 = new class93();
        var5.field1683 = new byte[arg0];
        var5.field1629 = 0;
        for (int var6 = arg1; var6 < (arg0 + arg1); var6++) {
            if (arg3[var6] != 0) {
                var5.field1683[var5.field1629++] = arg3[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class61 var20 = new class61(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class232.field4138[var21][arg1][arg2] == null) {
                    class232.field4138[var21][arg1][arg2] = new class41(var21, arg1, arg2);
                }
            }
            class232.field4138[arg0][arg1][arg2].field633 = var20;
        } else if (arg3 == 1) {
            class61 var22 = new class61(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class232.field4138[var23][arg1][arg2] == null) {
                    class232.field4138[var23][arg1][arg2] = new class41(var23, arg1, arg2);
                }
            }
            class232.field4138[arg0][arg1][arg2].field633 = var22;
        } else {
            class21 var24 = new class21(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class232.field4138[var25][arg1][arg2] == null) {
                    class232.field4138[var25][arg1][arg2] = new class41(var25, arg1, arg2);
                }
            }
            class232.field4138[arg0][arg1][arg2].field639 = var24;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lak;")
    public static final class138 method452(int arg0, int arg1) {
        if (arg0 >= -114) {
            field1202 = null;
        }
        field1203++;
        class138 var2 = (class138) class247.field4447.method302((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        class138 var3 = class47.method261(arg1, class14.field184, class38.field569, -13203, false);
        if (var3 != null) {
            class247.field4447.method297((long) arg1, var3, 10414);
        }
        return var3;
    }
}
