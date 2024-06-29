import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class288 {

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lqaa;")
    public static class27 field4064 = new class27(16, 3);

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "Lnt;")
    public static class220 field4066 = new class220();

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "Lcv;")
    public static class565 field4067 = new class565();

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "F")
    public static float field4063;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILtaa;)I", line = 4)
    public static final int method1865(int arg0, class405 arg1) {
        field4065++;
        if (arg0 != 34167) {
            return -84;
        } else if (class68.field1225 == arg1) {
            return 5890;
        } else if (class165.field2440 == arg1) {
            return 34167;
        } else if (class44.field665 == arg1) {
            return 34168;
        } else if (class142.field2176 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZII)Z", line = 32)
    public static final boolean method1866(boolean arg0, int arg1, int arg2) {
        field4061++;
        if (arg0) {
            field4067 = null;
        }
        if (arg1 >= 1000 && arg2 < 1000) {
            return true;
        } else if (arg1 >= 1000 || arg2 >= 1000) {
            return arg1 >= 1000 && arg2 >= 1000;
        } else if (class113.method940(23, arg1)) {
            return false;
        } else {
            return class113.method940(49, arg2);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V", line = 66)
    public static void method1867(byte arg0) {
        field4064 = null;
        field4067 = null;
        if (arg0 < 117) {
            field4063 = 0.6632779F;
        }
        field4066 = null;
    }
}
