import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 extends class9 {

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "Lqr;")
    public class57 field122;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field124 = -1;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field123 = -1;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "Lat;")
    public static class316 field126;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Lkn;")
    public static class629 field125;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public static void method114(int arg0) {
        field126 = null;
        field125 = null;
        if (arg0 != 20696) {
            method114(52);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lqr;)V")
    public class16(class57 arg0) {
        this.field122 = arg0;
    }
}
