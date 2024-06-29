import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class269 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lsg;")
    public static class30 field4734 = class167.method1221((byte) 33, "<br>");

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field4738 = -1;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lsg;")
    private static class30 field4736 = class167.method1221((byte) 33, "Choose Option");

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Lsg;")
    public static class30 field4737 = field4736;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field4739 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[I")
    public static int[] field4735;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lva;I)V")
    public static final void method1843(class120 arg0, int arg1) {
        class91 var2 = (class91) class68.field1482.method1168(-3, arg0.field2349.method297((byte) -118));
        if (arg1 != -1) {
            method1843((class120) null, 89);
        }
        if (var2 != null) {
            if (var2.field1829 != null) {
                class127.field2469.method186(var2.field1829);
                var2.field1829 = null;
            }
            var2.method1681(false);
        }
        field4732++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method1844(byte arg0) {
        field4737 = null;
        field4736 = null;
        field4734 = null;
        if (arg0 != 122) {
            method1843((class120) null, 102);
        }
        field4735 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)[Lnb;")
    public static final class265[] method1845(byte arg0) {
        field4733++;
        class265[] var1 = new class265[class23.field435];
        if (arg0 != -67) {
            field4734 = null;
        }
        for (int var2 = 0; var2 < class23.field435; var2++) {
            var1[var2] = new class192(class190.field3464, class273.field4774, class142.field2752[var2], class37.field895[var2], class62.field1329[var2], class2.field33[var2], class222.field3992[var2], class191.field3475);
        }
        class175.method1285((byte) 53);
        return var1;
    }
}
