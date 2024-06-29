import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class96 extends class553 {

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
    public static int field1461 = 0;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
    public static int field1460 = 0;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
    public static int field1463 = -1;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "Lui;")
    public static class193 field1459;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    public static void method688(int arg0) {
        field1459 = null;
        int var1 = -89 % ((-arg0 - 23) / 40);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method689(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1462++;
        if (class326.field4387 <= arg2 && arg2 <= class596.field8621 && arg5 >= class326.field4387 && arg5 <= class596.field8621 && arg7 >= class326.field4387 && class596.field8621 >= arg7 && arg6 >= class326.field4387 && arg6 <= class596.field8621 && arg0 >= class264.field3687 && class591.field8435 >= arg0 && arg8 >= class264.field3687 && arg8 <= class591.field8435 && arg9 >= class264.field3687 && arg9 <= class591.field8435 && class264.field3687 <= arg4 && class591.field8435 >= arg4) {
            class122.method844(arg5, arg2, arg0, arg8, arg7, arg6, false, arg4, arg1, arg9);
        } else {
            class506.method2932(arg8, arg0, arg4, arg7, arg5, (byte) -120, arg2, arg6, arg1, arg9);
        }
        if (arg3 < 81) {
            field1463 = 75;
        }
    }
}
