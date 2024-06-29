import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class213 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[I")
    public static int[] field2709 = new int[6];

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2711 = 0;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "D")
    public static double field2710;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2712;

    static {
        new class501("", 73);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 18)
    public static void method1299(int arg0) {
        field2709 = null;
        if (arg0 > -121) {
            method1299(-62);
        }
    }
}
