import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class157 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2036 = 0;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2038 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lvq;")
    public static class500 field2039 = new class500();

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 10)
    public static void method1012(int arg0) {
        if (arg0 != 26414) {
            method1012(85);
        }
        field2039 = null;
        field2038 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lib;I)V", line = 23)
    public static final void method1013(class723 arg0, int arg1) {
        field2037++;
        if (arg1 != 0) {
            return;
        }
        class571 var2 = (class571) class12.field74.method3669(false, (long) arg0.field9186);
        if (var2 == null) {
            return;
        }
        if (var2.field8026 != null) {
            class44.field468.method2512(var2.field8026);
            var2.field8026 = null;
        }
        var2.method527(-11229);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 54)
    public static final int method1014(String arg0, int arg1) {
        if (arg1 != -14534) {
            field2039 = null;
        }
        field2035++;
        return class499.method2930(true, 43, arg0, 10);
    }
}
