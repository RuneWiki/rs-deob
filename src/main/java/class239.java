import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class239 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public static int[] field4120 = new int[32768];

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[Loa;")
    public static class99[] field4121 = new class99[100];

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Loa;")
    public static class99 field4125 = class221.method1463(2844, "<col=ffffff>");

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Loa;")
    public static class99 field4126 = class221.method1463(2844, "::rect_debug");

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[Ljh;")
    public static class285[] field4127 = new class285[4];

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Loa;")
    public static class99 field4131 = class221.method1463(2844, "Lade)3)3)3");

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field4132 = -1;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4129 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ltg;")
    public static class182 field4123;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Z")
    public static final boolean method1557(int arg0, int arg1) {
        field4124++;
        if (arg1 == -49) {
            return arg0 >= 48 && arg0 <= 57;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Loa;")
    public static final class99 method1558(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field4122++;
        class99 var1 = class20.field234;
        class99 var2 = class290.field5068;
        if (class161.field2856 != 0) {
            var2 = class119.field2111;
        }
        if (class281.field4928 != null) {
            var1 = class198.method1332(92, new class99[] { class253.field4376, class281.field4928 });
        }
        return class198.method1332(85, new class99[] { class277.field4873, var2, class257.field4486, class198.method1333(-95, class184.field3271), class185.field3285, class198.method1333(-98, class64.field1083), var1, class290.field5087 });
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
    public static void method1559(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4121 = null;
        field4127 = null;
        field4126 = null;
        field4123 = null;
        field4120 = null;
        field4131 = null;
        field4125 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static final void method1560(byte arg0) {
        field4128++;
        class34.field608.method1813(arg0 ^ 0xFFFFFFAF);
        if (arg0 == 80) {
            class21.field249.method1813(-1);
            class51.field835.method1813(-1);
            class156.field2792.method1813(arg0 ^ 0xFFFFFFAF);
        }
    }
}
