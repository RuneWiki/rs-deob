import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class255 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lke;")
    public static class106 field4156 = new class106(128);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Lvl;")
    public static class73 field4158;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    public static int[] field4160;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[Lnj;")
    public static class215[] field4161;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method1807(byte arg0) {
        field4156 = null;
        field4160 = null;
        field4158 = null;
        field4161 = null;
        if (arg0 != -113) {
            method1809((byte) -60, (String) null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static final void method1808(boolean arg0) {
        class119.field1720.method1057(112);
        class196.field3101.method1147(115);
        field4155++;
        if (!arg0) {
            field4158 = null;
        }
        class220.field3455.method1147(120);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1809(byte arg0, String arg1) {
        field4157++;
        if (arg1 == null) {
            return false;
        } else if (arg0 <= 61) {
            return true;
        } else {
            for (int var2 = 0; var2 < class84.field1302; var2++) {
                if (arg1.equalsIgnoreCase(class309.field4975[var2])) {
                    return true;
                }
            }
            return false;
        }
    }
}
