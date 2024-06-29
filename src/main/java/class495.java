import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class495 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "J")
    public static long field7210;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lgr;")
    public static class297 field7209;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "[B")
    public static byte[] field7208;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static void method2951(boolean arg0) {
        field7209 = null;
        if (!arg0) {
            method2951(false);
        }
        field7208 = null;
    }
}
