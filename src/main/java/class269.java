import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class269 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field4360 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Z")
    public static boolean field4358 = false;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Ljj;")
    public static class134 field4359;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method1820(byte arg0) {
        field4359 = null;
        if (arg0 < 73) {
            method1820((byte) 115);
        }
    }
}
