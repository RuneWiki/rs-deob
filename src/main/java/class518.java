import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class518 {

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field7295 = -2;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "[B")
    public static byte[] field7298 = new byte[2048];

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "J")
    public static long field7297 = 0L;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "Lfba;")
    public static class24 field7296;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V")
    public static void method2961(boolean arg0) {
        field7296 = null;
        field7298 = null;
        if (!arg0) {
            method2961(false);
        }
    }
}
