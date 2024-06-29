import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class95 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1863 = 0;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1866 = 255;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Llb;")
    public static class127 field1862 = new class127(64);

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1868 = 0;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Loh;")
    public static class263 field1869 = class253.method1681(-121, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Ltj;")
    public static class262 field1867;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static void method664(byte arg0) {
        field1869 = null;
        if (arg0 == -128) {
            field1867 = null;
            field1862 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V")
    public static final void method665(int arg0, int arg1, int arg2, int arg3) {
        if (class265.field4632 != arg0 && arg3 != 0 && class112.field2107 < 50 && arg1 != -1) {
            class55.field1154[class112.field2107] = arg1;
            class35.field824[class112.field2107] = arg3;
            class24.field680[class112.field2107] = arg2;
            class150.field2713[class112.field2107] = null;
            class243.field4294[class112.field2107] = 0;
            class112.field2107++;
        }
        field1864++;
    }
}
