import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class168 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Lqe;")
    public static class469 field2642 = new class469(11, 1);

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Lmia;")
    public static class63 field2643 = new class63(17, 7);

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "B")
    public static byte field2644;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2641++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method1225(int arg0) {
        if (arg0 != 17) {
            method1225(10);
        }
        field2642 = null;
        field2643 = null;
    }
}
