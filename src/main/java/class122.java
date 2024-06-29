import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class122 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Ldc;")
    public static class37 field2174 = class185.method1233((byte) 86, ":tradereq:");

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2175 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Ldc;")
    private static class37 field2173 = class185.method1233((byte) 86, "You have only just left another world)3");

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Ldc;")
    public static class37 field2172 = field2173;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 >= class29.field536 && class82.field1458 >= arg5 && class29.field536 <= arg8 && arg8 <= class82.field1458 && arg9 >= class29.field536 && class82.field1458 >= arg9 && class29.field536 <= arg6 && class82.field1458 >= arg6 && class198.field3697 <= arg7 && arg7 <= class199.field3712 && arg0 >= class198.field3697 && class199.field3712 >= arg0 && arg1 >= class198.field3697 && arg1 <= class199.field3712 && class198.field3697 <= arg2 && arg2 <= class199.field3712) {
            class12.method78(arg2, arg1, arg4, arg9, arg8, arg7, arg5, arg6, (byte) -124, arg0);
        } else {
            class170.method1148(arg1, arg8, arg0, arg7, (byte) 91, arg4, arg2, arg6, arg5, arg9);
        }
        if (arg3 == -2) {
            field2176++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method834(byte arg0) {
        field2172 = null;
        if (arg0 != 107) {
            method834((byte) -109);
        }
        field2173 = null;
        field2174 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILg;II)V")
    public static final void method835(int arg0, class66 arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            return;
        }
        field2171++;
        if (arg1.field3524 == arg0 && arg0 != -1) {
            class208 var4 = class16.method113(arg0, (byte) 81);
            int var5 = var4.field3906;
            if (var5 == 1) {
                arg1.field3540 = 0;
                arg1.field3474 = 0;
                arg1.field3537 = arg2;
                arg1.field3495 = 0;
                class52.method428(false, arg1.field3540, arg1.field3505, (byte) 75, arg1.field3490, var4);
            }
            if (var5 == 2) {
                arg1.field3474 = 0;
                return;
            }
        } else if (arg0 == -1 || arg1.field3524 == -1 || class16.method113(arg0, (byte) 74).field3895 >= class16.method113(arg1.field3524, (byte) 119).field3895) {
            arg1.field3524 = arg0;
            arg1.field3537 = arg2;
            arg1.field3471 = arg1.field3491;
            arg1.field3474 = 0;
            arg1.field3540 = 0;
            arg1.field3495 = 0;
            if (arg1.field3524 == -1) {
                return;
            }
            class52.method428(false, arg1.field3540, arg1.field3505, (byte) 120, arg1.field3490, class16.method113(arg1.field3524, (byte) 76));
        }
    }
}
