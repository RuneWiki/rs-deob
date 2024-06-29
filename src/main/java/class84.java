import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class84 {

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
    public static int[] field1609 = new int[1000];

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lha;")
    public static class46 field1607 = class271.method1828("Weiter", -46);

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[Lbh;")
    public static class222[] field1611 = new class222[4];

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[I")
    public static int[] field1606 = new int[2];

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
    public static int[] field1604;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Z")
    public static final boolean method662(int arg0) {
        field1605++;
        try {
            if (arg0 != 2) {
                field1609 = null;
            }
            if (class76.field1427 == 2) {
                if (class122.field2275 == null) {
                    class122.field2275 = class228.method1558(class111.field2110, class83.field1600, class109.field2032);
                    if (class122.field2275 == null) {
                        return false;
                    }
                }
                if (class138.field2477 == null) {
                    class138.field2477 = new class128(class263.field4573, class135.field2457);
                }
                if (class23.field340.method794(false, class138.field2477, class122.field2275, class272.field4760, 22050)) {
                    class23.field340.method798((byte) -124);
                    class23.field340.method821(true, class118.field2202);
                    class23.field340.method828(19026, class122.field2275, class206.field3697);
                    class138.field2477 = null;
                    class122.field2275 = null;
                    class76.field1427 = 0;
                    class111.field2110 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class23.field340.method792(0);
            class138.field2477 = null;
            class111.field2110 = null;
            class76.field1427 = 0;
            class122.field2275 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILpi;)Lhh;")
    public static final class263 method663(byte arg0, int arg1, class181 arg2) {
        field1610++;
        if (class54.method386(arg1, arg2, -13377)) {
            int var3 = -43 / ((arg0 - 25) / 49);
            return class258.method1724(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method664(byte arg0) {
        field1611 = null;
        field1607 = null;
        field1609 = null;
        if (arg0 > 71) {
            field1606 = null;
            field1604 = null;
        }
    }
}
