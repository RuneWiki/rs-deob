import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class211 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lsg;")
    public static class162 field3838 = new class162();

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    public static int[] field3840 = new int[2048];

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3841 = 0;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lcc;")
    private static class209 field3842 = class95.method669(87, "Members object");

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lcc;")
    public static class209 field3839 = field3842;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static final void method1495(int arg0) {
        field3837++;
        if (arg0 != 255) {
            method1495(68);
        }
        if (class59.field1182) {
            class166.field2996 = null;
            class84.field1668 = null;
            class59.field1182 = false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static void method1496(int arg0) {
        field3840 = null;
        field3839 = null;
        if (arg0 != 255) {
            method1496(-68);
        }
        field3838 = null;
        field3842 = null;
    }
}
