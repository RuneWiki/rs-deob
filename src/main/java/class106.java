import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class106 extends class64 {

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Lid;")
    private static class149 field1836 = class60.method382("K", (byte) 93);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Lid;")
    public static class149 field1830 = class60.method382("T", (byte) 76);

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Lid;")
    public static class149 field1841 = field1836;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int field1839 = 0;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "Lid;")
    public static class149 field1838 = field1836;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Lvc;")
    public static class190 field1842;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
    public static int[] field1832;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[Z")
    public static boolean[] field1834;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)I")
    public static final int method742(int arg0) {
        field1837++;
        if (arg0 != 0) {
            field1831 = 93;
        }
        return class258.field4516;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method743(int arg0) {
        field1832 = null;
        if (arg0 != 31926) {
            return;
        }
        field1834 = null;
        field1841 = null;
        field1842 = null;
        field1830 = null;
        field1838 = null;
        field1836 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II)V")
    public class106(int arg0, int arg1) {
        this.field1829 = arg0;
        this.field1833 = arg1;
    }
}
