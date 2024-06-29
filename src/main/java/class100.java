import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class100 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field1908 = 0;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "[[S")
    public static short[][] field1912 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Loh;")
    public static class263 field1913 = class253.method1681(-120, "Texturen geladen)3");

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Loh;")
    private static class263 field1915 = class253.method1681(-123, "Loaded update list");

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Loh;")
    public static class263 field1910 = class253.method1681(-127, "rot:");

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "Loh;")
    public static class263 field1916 = field1915;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Loh;")
    public static class263 field1917 = class253.method1681(-123, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Lnj;")
    public class139 field1911;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I")
    public static final int method679(byte arg0) {
        if (arg0 > -4) {
            field1916 = null;
        }
        field1914++;
        if (class101.field1936) {
            return 0;
        } else if (class77.method526(-26670)) {
            return class7.field135 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method680(int arg0) {
        field1912 = null;
        field1915 = null;
        field1913 = null;
        field1916 = null;
        field1910 = null;
        field1917 = null;
        if (arg0 <= 95) {
            method679((byte) -54);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static final void method681(byte arg0) {
        class150.field2704.method825(0);
        if (arg0 != -46) {
            field1916 = null;
        }
        field1918++;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)V")
    public static final void method682(byte arg0) {
        int var1 = 98 % ((-arg0 - 7) / 51);
        field1909++;
        class108.field2038.method830(50);
    }
}
