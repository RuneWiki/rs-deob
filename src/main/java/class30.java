import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class30 {

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Lqu;")
    public static class219 field319 = new class219(11, 6);

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Lqu;")
    public static class219 field320 = new class219(46, 7);

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field321 = new String[100];

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljq;B)Z")
    public static final boolean method196(class267 arg0, byte arg1) {
        field318++;
        class156 var2 = class454.field7029.method3002(-1, arg0.method96((byte) 125));
        if (var2.field2104 == -1) {
            return true;
        }
        class114 var3 = class453.field7020.method2736(var2.field2104, (byte) -115);
        if (arg1 < 67) {
            field319 = null;
        }
        return var3.field1601 == -1 ? true : var3.method737((byte) 95);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method197(int arg0) {
        field319 = null;
        field320 = null;
        if (arg0 >= 51) {
            field321 = null;
        }
    }
}
