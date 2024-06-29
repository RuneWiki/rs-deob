import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class44 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[S")
    public static short[] field661 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lmh;")
    private static class62 field663 = class201.method1405(true, "Loading title screen )2 ");

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field665 = -1;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field662 = 3;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lmh;")
    public static class62 field667 = class201.method1405(true, "Cabbage");

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Lmh;")
    public static class62 field664 = field663;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lmh;")
    public static class62 field668 = class201.method1405(true, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Lmh;")
    private static class62 field669 = class201.method1405(true, "Loading sprites )2 ");

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lmh;")
    public static class62 field666 = field669;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 8)
    public static void method289(int arg0) {
        if (arg0 != -8261) {
            field661 = (short[]) null;
        }
        field668 = null;
        field667 = null;
        field669 = null;
        field664 = null;
        field663 = null;
        field661 = null;
        field666 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)J", line = 72)
    public static final long method290(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        return var3 == null || var3.field2711 == null ? 0L : var3.field2711.field442;
    }
}
