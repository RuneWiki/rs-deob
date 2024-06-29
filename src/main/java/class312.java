import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class312 {

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lad;")
    public static class275 field5034 = new class275(100);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method2107(byte arg0) {
        field5034 = null;
        if (arg0 <= 102) {
            method2107((byte) -37);
        }
    }
}
