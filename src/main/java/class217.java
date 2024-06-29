import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class217 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lmw;")
    public static class517 field2835 = new class517(70, -1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[I")
    public static int[] field2836;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
    public static int[] field2837;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 4)
    public static void method1395(int arg0) {
        if (arg0 > -32) {
            field2835 = null;
        }
        field2837 = null;
        field2835 = null;
        field2836 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lha;B)V", line = 16)
    public static final void method1396(class66 arg0, byte arg1) {
        field2834++;
        int var2 = -45 / ((arg1 + 36) / 42);
        for (class150 var3 = (class150) class69.field954.method2189((byte) 9); var3 != null; var3 = (class150) class69.field954.method2192(0)) {
            if (var3.field2045) {
                var3.method1049(arg0);
            }
        }
    }
}
