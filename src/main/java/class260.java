import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class260 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4035 = 0;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
    public static boolean field4036 = false;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field4034 = 0;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Leg;")
    public static class188 field4037 = new class188(200);

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[I")
    public static int[] field4038 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field4040 = 0;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 4)
    public static void method1736(byte arg0) {
        if (arg0 < 98) {
            method1736((byte) 51);
        }
        field4038 = null;
        field4037 = null;
    }
}
