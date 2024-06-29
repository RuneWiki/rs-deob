import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class352 extends class168 {

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Lff;")
    public static class9 field4761 = new class9(43, -2);

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "F")
    public static float field4762;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Z")
    public static final boolean method2062(int arg0, int arg1) {
        field4759++;
        if (arg0 != 43) {
            method2064((byte) 52);
        }
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2063(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4760++;
        if (arg2 == arg4) {
            class26.method224(-99, arg5, arg1, arg4, arg0, arg6, arg3);
        } else if (arg7 == -2) {
            if (arg5 - arg4 >= class308.field4055 && class71.field1077 >= (arg4 + arg5) && (arg3 - arg2) >= class353.field4777 && class300.field3971 >= arg2 + arg3) {
                class105.method737(arg1, arg5, arg6, arg2, (byte) 110, arg3, arg0, arg4);
            } else {
                class132.method936(arg5, arg3, arg2, arg6, arg1, true, arg4, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    public static void method2064(byte arg0) {
        if (arg0 < -124) {
            field4761 = null;
        }
    }
}
