import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class61 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lvb;")
    public static class251 field1121 = new class251();

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lub;")
    private static class227 field1122 = class257.method1749("Your ignore list is full)3 Max of 100 users)3", 17263);

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lub;")
    public static class227 field1124 = class257.method1749(")3", 17263);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lub;")
    public static class227 field1125 = class257.method1749("Stufe)2", 17263);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lub;")
    public static class227 field1126 = class257.method1749("sl_stars", 17263);

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lub;")
    public static class227 field1128 = field1122;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lth;")
    public static class239 field1123;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I")
    public static final int method373(int arg0, int arg1, int arg2) {
        field1127++;
        int var3 = class75.method444(arg0 - 1, arg2 - 1, (byte) 22) + class75.method444(arg0 - 1, arg2 + 1, (byte) 22) + class75.method444(arg0 - -1, arg2 + -1, (byte) 22) + class75.method444(arg0 + 1, arg2 + 1, (byte) 22);
        int var4 = class75.method444(arg0, arg2 - 1, (byte) 22) + class75.method444(arg0, arg2 + 1, (byte) 22) + class75.method444(arg0 + -1, arg2, (byte) 22) + class75.method444(arg0 + arg1, arg2, (byte) 22);
        int var5 = class75.method444(arg0, arg2, (byte) 22);
        return var3 / 16 + (var4 / 8 + (var5 / 4));
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method374(boolean arg0) {
        field1121 = null;
        field1128 = null;
        if (arg0) {
            return;
        }
        field1122 = null;
        field1123 = null;
        field1126 = null;
        field1125 = null;
        field1124 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BIIIIII)V")
    public static final void method375(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 94) {
            return;
        }
        field1120++;
        if (arg1 >= class125.field2234 && arg2 <= class19.field331 && class161.field2718 <= arg4 && arg3 <= class46.field817) {
            if (arg6 == 1) {
                class161.method993(arg4, arg5, arg2, -128, arg1, arg3);
            } else {
                class118.method746(arg1, arg2, -6, arg6, arg3, arg4, arg5);
            }
        } else if (arg6 == 1) {
            class253.method1719(arg3, arg4, arg2, arg1, (byte) 69, arg5);
        } else {
            class89.method529(arg4, arg5, arg1, 29152, arg3, arg6, arg2);
        }
    }
}
