import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class252 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Z")
    public static boolean field3647 = false;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "D")
    public static double field3649;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1695(byte arg0) {
        field3648++;
        if (class509.field7380) {
            return;
        }
        class112.field1579 += (-24.0F - class112.field1579) / 2.0F;
        if (arg0 >= -79) {
            field3649 = -1.2390989205047096D;
        }
        class275.field3877 = true;
        class509.field7380 = true;
    }
}
