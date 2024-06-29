import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class185 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Liba;")
    public static class211 field2518 = new class211(81, -1);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Liba;")
    public static class211 field2519 = new class211(51, 7);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[Z")
    public static boolean[] field2520 = new boolean[100];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static final void method1232(int arg0) {
        class11.field269 = null;
        field2517++;
        class180.field2494 = -1;
        if (arg0 >= -1) {
            method1232(-61);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method1233(byte arg0) {
        field2520 = null;
        if (arg0 != 73) {
            method1233((byte) -29);
        }
        field2518 = null;
        field2519 = null;
    }
}
