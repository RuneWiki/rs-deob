import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class81 extends class189 {

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lr;")
    public static class66 field1575 = class93.method641(43, "welle2:");

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lr;")
    public static class66 field1577 = class93.method641(43, "; Expires=");

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lr;")
    public static class66 field1579 = class93.method641(43, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field1584 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lr;")
    private static class66 field1586 = class93.method641(43, "Loading fonts )2 ");

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field1587 = 0;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field1585 = 0;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lr;")
    public static class66 field1581 = field1586;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Lr;")
    private static class66 field1583 = class93.method641(43, "Continue");

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lr;")
    public static class66 field1578 = field1583;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILli;Lli;)V")
    public static final void method561(int arg0, class80 arg1, class80 arg2) {
        field1582++;
        if (arg2.field1569 != null) {
            arg2.method560(-17554);
        }
        arg2.field1569 = arg1.field1569;
        arg2.field1571 = arg1;
        if (arg0 < 82) {
            field1575 = null;
        }
        arg2.field1569.field1571 = arg2;
        arg2.field1571.field1569 = arg2;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
    public static void method562(byte arg0) {
        field1586 = null;
        field1581 = null;
        field1577 = null;
        if (arg0 != 26) {
            method562((byte) -121);
        }
        field1578 = null;
        field1583 = null;
        field1579 = null;
        field1575 = null;
    }
}
