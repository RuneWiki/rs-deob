import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class468 {

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "[I")
    public static int[] field6584 = new int[3];

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
    public static void method2793(byte arg0) {
        if (arg0 != 123) {
            method2793((byte) -117);
        }
        field6584 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public static final void method2794(int arg0) {
        field6583++;
        if (arg0 != 0) {
            method2794(-12);
        }
        class188.field2897.method4038(-15210);
    }
}
