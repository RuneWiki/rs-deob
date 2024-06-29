import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class230 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[I")
    public static int[] field3602 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
    public static void method1516(boolean arg0) {
        if (!arg0) {
            field3604 = -27;
        }
        field3602 = null;
    }
}
