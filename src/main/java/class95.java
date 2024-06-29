import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class95 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Ljd;")
    private static class92 field1916 = class202.method1325((byte) 90, "glow3:");

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Ljd;")
    public static class92 field1917 = field1916;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Ljd;")
    public static class92 field1923 = field1916;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Ljd;")
    public static class92 field1921 = class202.method1325((byte) 90, "gleiten:");

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[S")
    public static short[] field1922 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Z")
    public static boolean field1918 = false;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[Ljd;")
    public static class92[] field1925 = new class92[100];

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Lud;")
    public static class192 field1924;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Z")
    public static final boolean method664(int arg0) {
        if (arg0 == -19281) {
            field1920++;
            return class79.field1619 == 0 ? class198.field3871.method1249(arg0 ^ 0x4B2C) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method665(boolean arg0) {
        field1924 = null;
        field1917 = null;
        if (arg0) {
            field1923 = null;
        }
        field1923 = null;
        field1921 = null;
        field1925 = null;
        field1916 = null;
        field1922 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method666(int arg0) {
        if (arg0 == 0) {
            field1919++;
            class10.field344.method923(-99);
            class156.field3112.method923(arg0 - 116);
            class15.field427.method923(-102);
        }
    }
}
