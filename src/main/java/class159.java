import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class159 extends class119 {

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Lbn;")
    public static class160 field2127 = new class160(18, 5);

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Lbn;")
    public static class160 field2129 = new class160(23, 3);

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Lvq;")
    public static class24 field2130 = new class24(14, 4);

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lvq;")
    public static class24 field2131 = new class24(38, 3);

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Z")
    public static boolean field2133 = false;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lge;")
    public static class108 field2132 = new class108(5000);

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field2135 = 16777215;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Lct;")
    public static class104 field2134;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 13)
    public static void method1069(byte arg0) {
        field2132 = null;
        if (arg0 != 37) {
            return;
        }
        field2130 = null;
        field2129 = null;
        field2131 = null;
        field2127 = null;
        field2134 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLfp;)V", line = 29)
    public static final void method1070(boolean arg0, class9 arg1) {
        if (class92.field1144) {
            class317.method2091(3, arg1);
        } else {
            class248.method1643(29725, arg1);
        }
        if (!arg0) {
            field2129 = null;
        }
        field2126++;
    }
}
