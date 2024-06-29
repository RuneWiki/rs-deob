import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class277 extends class319 {

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[Z")
    public static boolean[] field4219 = new boolean[100];

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4220 = 0;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field4221 = 1;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "F")
    public static float field4218;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLuq;)Luq;", line = 15)
    public static final class114 method1822(byte arg0, class114 arg1) {
        field4222++;
        if (arg1.field1700 != -1) {
            return class475.method2864(true, arg1.field1700);
        }
        int var2 = arg1.field1644 >>> 16;
        class530 var3 = new class530(class70.field993);
        for (class293 var4 = (class293) var3.method3143(true); var4 != null; var4 = (class293) var3.method3137(-11627)) {
            if (var4.field4454 == var2) {
                return class475.method2864(true, (int) var4.field6388);
            }
        }
        return arg0 <= 85 ? null : null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 55)
    public static void method1823(int arg0) {
        if (arg0 <= -126) {
            field4219 = null;
        }
    }
}
