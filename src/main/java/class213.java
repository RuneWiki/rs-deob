import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class213 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lpr;")
    public static class407 field2568 = new class407(61, 8);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lqq;")
    public static class434 field2570;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1273(int arg0) {
        if (arg0 != 8) {
            method1273(-118);
        }
        field2568 = null;
        field2570 = null;
    }
}
