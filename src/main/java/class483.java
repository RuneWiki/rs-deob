import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class483 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lub;")
    public static class301 field6963 = new class301("", 10);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method2866(int arg0) {
        field6963 = null;
        if (arg0 != 255) {
            field6963 = null;
        }
    }
}
