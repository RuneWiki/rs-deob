import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class574 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Lpe;")
    public static class636 field7863 = new class636(3);

    @OriginalMember(owner = "client!el", name = "b", descriptor = "F")
    public static float field7864;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static void method3327(boolean arg0) {
        field7863 = null;
        if (arg0) {
            method3327(true);
        }
    }
}
