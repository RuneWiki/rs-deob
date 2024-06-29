import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class149 {

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "Lwp;")
    public static class453 field1921 = new class453(64, 0);

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "S")
    public static short field1922 = 256;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V")
    public static void method861(boolean arg0) {
        field1921 = null;
        if (!arg0) {
            field1922 = 18;
        }
    }
}
