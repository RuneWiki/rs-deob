import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class291 {

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "Z")
    public static boolean field3812 = false;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "Lcg;")
    public static class140 field3813 = new class140();

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V", line = 7)
    public static void method1741(int arg0) {
        field3813 = null;
        if (arg0 < 56) {
            method1741(-9);
        }
    }
}
