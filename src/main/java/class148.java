import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class148 extends class61 {

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Lid;")
    private static class149 field2667 = class60.method382("yellow:", (byte) 112);

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lid;")
    public static class149 field2664 = field2667;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Lid;")
    public static class149 field2663 = field2667;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lve;")
    public static class189 field2666 = new class189(100);

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Lhf;")
    public static final class137 method1014(int arg0, int arg1) {
        if (arg0 < 81) {
            return null;
        }
        class137 var2 = (class137) class210.field3746.method1293((long) arg1, false);
        field2665++;
        if (var2 != null) {
            return var2;
        }
        class137 var3 = class7.method39(class98.field1736, false, class214.field3798, -128, arg1);
        if (var3 != null) {
            class210.field3746.method1295((long) arg1, var3, (byte) -71);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static void method1015(int arg0) {
        if (arg0 != 100) {
            method1015(-6);
        }
        field2664 = null;
        field2666 = null;
        field2667 = null;
        field2663 = null;
    }
}
