import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class263 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4585 = 0;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Lvf;")
    private static class265 field4586 = class87.method582(-46, "Drop");

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lvf;")
    public static class265 field4591 = class87.method582(-46, "::breakcon");

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lvf;")
    public static class265 field4587 = field4586;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lrh;")
    public static class115 field4592;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lv;")
    public static class59 field4595;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "[Z")
    public static boolean[] field4594;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static final void method1757(byte arg0) {
        field4593++;
        class265.field4636.method402(false);
        for (int var1 = 0; var1 < 32; var1++) {
            class257.field4390[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class11.field370[var2] = 0L;
        }
        class29.field740 = 0;
        int var3 = -99 % ((-arg0 - 2) / 43);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static final void method1758(int arg0) {
        class163.field2958.method1893(-38);
        if (arg0 != 0) {
            method1757((byte) 66);
        }
        class231.field4086.method1893(-47);
        field4589++;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static void method1759(int arg0) {
        field4592 = null;
        field4595 = null;
        if (arg0 == 0) {
            field4587 = null;
            field4594 = null;
            field4586 = null;
            field4591 = null;
        }
    }
}
