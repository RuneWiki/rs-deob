import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class602 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Z")
    public static boolean field8613 = true;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field8611 = 0;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field8616 = 0;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lwu;")
    public static class557 field8614;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lwu;")
    public static class557 field8615;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 16)
    public static void method3537(int arg0) {
        field8614 = null;
        if (arg0 != 0) {
            method3537(-116);
        }
        field8615 = null;
    }
}
