import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class102 extends class287 {

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lmh;")
    public static class128 field1740 = class22.method156(124, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field1749 = 0;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lmh;")
    public static class128 field1751 = class22.method156(125, "<col=ff9040>");

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "Lmh;")
    public static class128 field1754 = class22.method156(122, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lvf;")
    public static class296 field1741 = new class296();

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field1756 = -1;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Lem;")
    public class10 field1738;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lem;")
    public class10 field1739;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "Lmh;")
    public class128 field1747;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Z")
    public boolean field1755;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[Ljava/lang/Object;")
    public Object[] field1743;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 4)
    public static void method629(int arg0) {
        field1751 = null;
        field1741 = null;
        field1754 = null;
        if (arg0 > -72) {
            field1741 = (class296) null;
        }
        field1740 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILem;I)V", line = 27)
    public static final void method630(int arg0, int arg1, class10 arg2, int arg3) {
        if (arg3 != 1163) {
            return;
        }
        field1744++;
        if (class165.field2839 != null || class271.field4721 || arg2 == null || class147.method985(arg2, true) == null) {
            return;
        }
        class165.field2839 = arg2;
        class4.field73 = class147.method985(arg2, true);
        class51.field1009 = false;
        class250.field4327 = 0;
        class188.field3264 = arg1;
        class4.field81 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)I", line = 60)
    public static final int method631(int arg0, byte arg1) {
        int var2 = 101 / ((arg1 - 40) / 44);
        field1750++;
        return arg0 >>> 10;
    }
}
