import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class297 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field4579 = -1;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 6)
    public static final byte[] method2050(Object arg0, boolean arg1, int arg2) {
        field4581++;
        if (arg0 == null) {
            return null;
        } else if (arg2 != 1) {
            return (byte[]) null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg1 ? class238.method1657(var4, 10) : var4;
        } else if (arg0 instanceof class166) {
            class166 var3 = (class166) arg0;
            return var3.method1260(5);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 42)
    public static final void method2051(int arg0) {
        field4578++;
        if (!class7.field110) {
            return;
        }
        class161 var1 = class94.method680(class333.field5194, arg0, class183.field2893);
        if (var1 != null && var1.field2518 != null) {
            class296 var2 = new class296();
            var2.field4574 = var1;
            var2.field4575 = var1.field2518;
            class251.method1719(-31, var2);
        }
        class7.field110 = false;
        class38.field552 = -1;
        class254.method1776(arg0 + 4, var1);
    }
}
