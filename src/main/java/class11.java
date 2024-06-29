import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 {

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Z")
    public static boolean field113 = false;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "S")
    public static short field107 = 32767;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field111 = "Loading wordpack - ";

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lhc;")
    public static class235 field114;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field110;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[Lke;")
    public static class110[] field106;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[S")
    public static short[] field109;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method69(int arg0) {
        field111 = null;
        if (arg0 == 1) {
            field110 = null;
            field106 = null;
            field114 = null;
            field109 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method70(byte arg0, String arg1) {
        field108++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class279.field4323; var2++) {
            if (arg1.equalsIgnoreCase(class180.field2531[var2])) {
                return true;
            }
        }
        if (arg0 != 87) {
            field106 = null;
        }
        return arg1.equalsIgnoreCase(class217.field3280.field1217);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIII)V")
    public static final void method71(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field112++;
        if (arg1 != -79) {
            field109 = null;
        }
        class281.field4359.field3402 = 0;
        class281.field4359.method1447(20, 17363472);
        class281.field4359.method1447(arg2, arg1 + 17363551);
        class281.field4359.method1447(arg4, 17363472);
        class281.field4359.method1470(393660232, arg3);
        class281.field4359.method1470(arg1 ^ 0xE88938F9, arg0);
        class66.field896 = 0;
        class227.field3441 = 0;
        class253.field3871 = 1;
        class35.field540 = -3;
    }
}
