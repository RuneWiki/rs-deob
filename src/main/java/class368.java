import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class368 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "F")
    public static float field5661 = 1.0F;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lgl;")
    public static class432 field5660 = new class432("", 17);

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Lpg;")
    public static class492 field5662;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public static void method2301(int arg0) {
        field5662 = null;
        field5660 = null;
        if (arg0 != 17) {
            method2301(-1);
        }
    }

    static {
        new class432("", 73);
        field5662 = new class492(48, 12);
    }
}
