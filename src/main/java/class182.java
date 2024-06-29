import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class182 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Z")
    public static boolean field2658 = false;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
    public static int[] field2660 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field2661 = 104;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[B")
    public static byte[] field2659 = new byte[2048];

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "[I")
    public static int[] field2663;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static void method1232(byte arg0) {
        field2660 = null;
        if (arg0 <= -127) {
            field2663 = null;
            field2659 = null;
        }
    }

    static {
        new class475(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field2663 = new int[13];
    }
}
