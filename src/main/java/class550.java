import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class550 {

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "J")
    public static long field7802 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "Lqfa;")
    public static class85 field7801 = new class85(25, 12);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "F")
    public static float field7800;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
    public static void method3160(byte arg0) {
        if (arg0 <= 68) {
            method3160((byte) 112);
        }
        field7801 = null;
    }
}
