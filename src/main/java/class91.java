import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class91 extends class106 {

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Loc;")
    public static class151 field1669 = class137.method873(2, "blinken1:");

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field1664 = 500;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field1671 = 0;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1665 = -1;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Loh;")
    public static class156 field1667 = new class156(5);

    @OriginalMember(owner = "client!id", name = "s", descriptor = "B")
    public byte field1662;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "B")
    public static byte field1673;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lnd;")
    public static class142 field1661;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Lnd;")
    public static class142 field1668;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Loc;")
    public class151 field1660;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "Loc;")
    public class151 field1666;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)V")
    public static final void method579(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class79.field1526 <= arg4 && arg4 <= class25.field524) {
            int var5 = class116.method704(class154.field2793, arg0, 27104, class233.field4281);
            int var6 = class116.method704(class154.field2793, arg1, 27104, class233.field4281);
            class54.method370(arg3 + 49, var6, arg4, arg2, var5);
        }
        if (arg3 != -14) {
            field1667 = null;
        }
        field1672++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([SI[Loc;)V")
    public static final void method580(short[] arg0, int arg1, class151[] arg2) {
        field1670++;
        if (arg1 <= 37) {
            method580(null, -59, null);
        }
        class43.method304(arg0, arg2.length - 1, arg2, 0, -8102);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
    public static void method581(byte arg0) {
        field1669 = null;
        field1661 = null;
        field1667 = null;
        if (arg0 < 72) {
            method580(null, 51, null);
        }
        field1668 = null;
    }
}
