import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class29 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lpb;")
    public static class2 field238 = new class2(1);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method133(byte arg0) {
        field238 = null;
        if (arg0 >= -83) {
            method133((byte) -30);
        }
    }
}
