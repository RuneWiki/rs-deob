import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class266 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4298 = 2;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4301 = 0;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4305 = "Please remove ";

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public int field4304;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1751(int arg0, String arg1) {
        field4307++;
        if (class252.field4135 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class252.field4135.field3158; var2++) {
            if (class267.method1757("<br>", class252.field4135.field3152[var2], " ", -127).equals(arg1)) {
                return var2;
            }
        }
        if (arg0 != -1) {
            method1751(32, (String) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1752(int arg0) {
        field4305 = null;
        if (arg0 != 5022) {
            method1751(81, (String) null);
        }
    }
}
