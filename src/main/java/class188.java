import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class188 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lcu;")
    public static class206 field2786 = new class206(25, 8);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lta;")
    public static class200 field2788;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method1234(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2787++;
        if (arg1 < 512 || arg6 < 512 || arg1 > ((class34.field530 - 2) * 512) || class34.field531 * 512 - 1024 < arg6) {
            class601.field7980[0] = class601.field7980[1] = -1;
            return;
        }
        if (arg3 != 109) {
            field2788 = null;
        }
        int var10 = class315.method1878(arg1, arg3 + 2812, arg0, arg6) - arg5;
        class166.field2583.method571(arg4, 0, 0);
        class10.field197.method405(class166.field2583);
        class10.field197.method438(arg1, var10, arg6, class601.field7980);
        class166.field2583.method571(-arg4, 0, 0);
        class10.field197.method405(class166.field2583);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field2788 = null;
        field2786 = null;
        if (arg0 != -9631) {
            method1234(19, -26, -122, (byte) 7, 127, -71, 26, 1, 89, 83);
        }
    }
}
