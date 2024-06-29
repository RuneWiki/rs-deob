import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class427 {

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "Lrb;")
    public static class283 field6206 = new class283(44, -1);

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)I")
    public static final int method2547(byte arg0) {
        field6207++;
        if (arg0 != 86) {
            method2547((byte) 25);
        }
        class473 var1 = class134.field2044;
        synchronized (class134.field2044) {
            return class134.field2044.method2775(0);
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V")
    public static void method2548(byte arg0) {
        field6206 = null;
        if (arg0 >= -116) {
            field6206 = null;
        }
    }
}
