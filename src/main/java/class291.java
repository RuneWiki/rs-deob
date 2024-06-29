import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class291 {

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "Lgf;")
    public static class256 field4117 = new class256();

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "Z")
    public static boolean field4118 = false;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lbi;Le;I)V")
    public static final void method1792(class449 arg0, class498 arg1, int arg2) {
        class72.field1129 = arg0;
        field4116++;
        if (arg2 <= -89) {
            class508.field6776 = arg1;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public static void method1793(int arg0) {
        if (arg0 == 25627) {
            field4117 = null;
        }
    }
}
