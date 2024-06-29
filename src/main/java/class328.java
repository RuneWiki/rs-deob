import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class328 {

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!qja", name = "c", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "Lur;")
    public static class564 field4760;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(III)Z")
    public static final boolean method2070(int arg0, int arg1, int arg2) {
        field4761++;
        if (arg1 < 1) {
            field4760 = null;
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(I)V")
    public static void method2071(int arg0) {
        if (arg0 == 0) {
            field4760 = null;
        }
    }
}
