import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class125 {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Ldf;")
    private static class51 field2112 = class46.method233("Dec", 100);

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Ldf;")
    private static class51 field2113 = class46.method233("May", 100);

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Ldf;")
    private static class51 field2116 = class46.method233("Nov", 100);

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Ldf;")
    public static class51 field2118 = class46.method233(" ", 100);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Ldf;")
    private static class51 field2109 = class46.method233("Mar", 100);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Ldf;")
    private static class51 field2110 = class46.method233("Feb", 100);

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Ldf;")
    private static class51 field2121 = class46.method233("Apr", 100);

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Ldf;")
    private static class51 field2119 = class46.method233("Aug", 100);

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Ldf;")
    private static class51 field2117 = class46.method233("Jul", 100);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Ldf;")
    private static class51 field2111 = class46.method233("Jun", 100);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field2115 = 0;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Ldf;")
    private static class51 field2124 = class46.method233("Jan", 100);

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Ldf;")
    private static class51 field2127 = class46.method233("Sep", 100);

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Ldf;")
    private static class51 field2125 = class46.method233("Oct", 100);

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field2122 = 0;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "[Ldf;")
    public static class51[] field2120 = new class51[] { field2124, field2110, field2109, field2121, field2113, field2111, field2117, field2119, field2127, field2125, field2116, field2112 };

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[I")
    public static int[] field2123;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method932(int arg0) {
        field2123 = null;
        field2111 = null;
        field2110 = null;
        field2118 = null;
        field2121 = null;
        field2124 = null;
        field2120 = null;
        field2109 = null;
        field2125 = null;
        field2119 = null;
        field2116 = null;
        int var1 = 68 / ((arg0 - 1) / 43);
        field2113 = null;
        field2127 = null;
        field2117 = null;
        field2112 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lph;I)Lph;")
    public abstract class74 method743(class74 arg0, int arg1);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static final void method933(int arg0) {
        class28.field400.method1353(-121);
        class261.field4557.method1353(-84);
        class221.field3832.method1353(-127);
        field2114++;
        if (arg0 > -99) {
            field2123 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V")
    public static final void method934(int arg0, byte arg1) {
        if (arg1 >= 17) {
            class75.field1214.method1348(0, arg0);
            field2126++;
        }
    }
}
