import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class78 {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lha;")
    public static class63 field1540 = null;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lr;")
    public static class66 field1542 = class93.method641(43, "hitmarks");

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Lr;")
    private static class66 field1549 = class93.method641(43, "Loaded textures");

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Lr;")
    public static class66 field1551 = class93.method641(43, "mapdots");

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field1548 = 0;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Lr;")
    public static class66 field1547 = field1549;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Lr;")
    public static class66 field1550 = class93.method641(43, "Clientscript error in: ");

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[S")
    public static short[] field1546 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[Ljb;")
    public static class256[] field1545;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method553(int arg0) {
        field1545 = null;
        field1546 = null;
        field1542 = null;
        field1540 = null;
        field1550 = null;
        field1549 = null;
        field1551 = null;
        if (arg0 == -1) {
            field1547 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method554(byte arg0) {
        field1544++;
        int var1 = -57 / ((-arg0 - 22) / 35);
        class30.field448.method1613((byte) 94);
        class242.field4227.method1613((byte) 94);
        class182.field3179.method1613((byte) 94);
        class188.field3261.method1613((byte) 94);
    }
}
