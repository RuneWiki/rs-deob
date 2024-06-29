import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class282 extends class209 {

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "Lia;")
    public class240 field4453;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field4451 = 0;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "[Z")
    public static boolean[] field4452 = new boolean[8];

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1907(byte arg0, String arg1) {
        if (arg0 >= -3) {
            method1907((byte) -101, (String) null);
        }
        field4454++;
        String var2 = class257.method1739((byte) 57, class170.method1223(true, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public static void method1908(boolean arg0) {
        if (!arg0) {
            method1907((byte) -40, (String) null);
        }
        field4452 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lia;)V")
    public class282(class240 arg0) {
        this.field4453 = arg0;
    }
}
