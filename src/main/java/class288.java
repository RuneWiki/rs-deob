import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class288 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lsl;")
    public static class318 field4149 = new class318(53, -1);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Z")
    public static boolean field4150 = false;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method1825(int arg0) {
        field4149 = null;
        if (arg0 != 53) {
            method1826(-37);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static final void method1826(int arg0) {
        class57.field665.method874(0);
        if (arg0 < 48) {
            method1826(-36);
        }
        field4148++;
        class205.field2990.method874(0);
    }
}
