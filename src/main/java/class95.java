import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class95 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lwa;")
    private static class75 field1541 = class66.method560("Loading title screen )2 ", false);

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lwa;")
    public static class75 field1544 = field1541;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lwa;")
    public static class75 field1539 = class66.method560(" loggt sich aus)3", false);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lwa;")
    public static class75 field1542 = class66.method560("Lade Texturen )2 ", false);

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1547 = 128;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lwa;")
    public static class75 field1545 = class66.method560(")4a=", false);

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lwa;")
    private static class75 field1546 = class66.method560("Loaded wordpack", false);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lwa;")
    public static class75 field1538 = field1546;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 20)
    public static void method733(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1541 = null;
        field1542 = null;
        field1545 = null;
        field1546 = null;
        field1539 = null;
        field1544 = null;
        field1538 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
    public abstract void method732(int arg0, int arg1);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)I")
    public abstract int method734(byte arg0, int arg1);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)Lhm;")
    public abstract class19 method735(byte arg0);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method736(int arg0, byte arg1);
}
