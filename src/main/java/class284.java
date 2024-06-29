import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class284 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lni;")
    public static class367 field4167 = new class367(32, 8);

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lof;")
    public static class446 field4168 = new class446("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1824(int arg0) {
        field4167 = null;
        if (arg0 < -68) {
            field4168 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIIII)V")
    public static final void method1825(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4166++;
        int var5 = 0;
        int var6 = -92 / ((arg0 - 73) / 45);
        while (var5 < class428.field6506) {
            Rectangle var7 = class375.field5701[var5];
            if (var7.x + var7.width > arg3 && var7.x < arg2 + arg3 && (var7.y + var7.height) > arg1 && (arg1 + arg4) > var7.y) {
                class106.field1497[var5] = true;
            }
            var5++;
        }
    }
}
