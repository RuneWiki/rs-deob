import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class329 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Lkq;")
    public static class696 field4557 = new class696(7, 2);

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "B")
    public static byte field4560;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Lvba;")
    public static class376 field4559;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public static void method1951(byte arg0) {
        field4559 = null;
        field4557 = null;
        if (arg0 < 1) {
            field4560 = 80;
        }
    }

    @OriginalMember(owner = "client!hp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4558++;
        throw new IllegalStateException();
    }
}
