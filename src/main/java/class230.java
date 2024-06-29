import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class230 extends Exception {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Lnd;")
    public static class547 field3028;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 4)
    public static void method1462(byte arg0) {
        field3028 = null;
        if (arg0 >= -27) {
            method1462((byte) -75);
        }
    }
}
