import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class339 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Llea;")
    public static class546 field4374;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Loba;")
    public abstract class347 method1983(int arg0);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lkha;II)Lac;")
    public static final class712 method1984(class687 arg0, int arg1, int arg2) {
        field4373++;
        class712 var3 = (class712) class662.field9075.method778((long) arg1, 123);
        if (var3 == null) {
            if (class81.field1055) {
                var3 = class458.field6407.method60(class196.method1223(arg0, arg1), true);
            } else {
                var3 = class707.method3911((byte) -79, arg0.method3836(arg1, true));
            }
            class662.field9075.method774((long) arg1, 112, var3);
        }
        if (arg2 < 45) {
            field4374 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
    public abstract void method1985(int arg0, int arg1);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I")
    public abstract int method1986(int arg0, byte arg1);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)[B")
    public abstract byte[] method1987(int arg0, byte arg1);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static void method1988(boolean arg0) {
        if (!arg0) {
            field4374 = null;
        }
    }
}
