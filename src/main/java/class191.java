import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class191 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "[I")
    public static int[] field2485 = new int[6];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lpi;")
    public static class340 field2486 = new class340(3, 2);

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field2487 = -50;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method1247(byte arg0) {
        field2485 = null;
        field2486 = null;
        if (arg0 != 31) {
            method1247((byte) -100);
        }
    }
}
