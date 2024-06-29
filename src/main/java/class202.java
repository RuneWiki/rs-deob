import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class202 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lcba;")
    public static class471 field2829 = new class471(65, 12);

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2830 = 0;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lcba;")
    public static class471 field2831 = new class471(56, 1);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1225(int arg0) {
        field2829 = null;
        if (arg0 != -11557) {
            method1225(-95);
        }
        field2831 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Z")
    public static final boolean method1226(int arg0, int arg1) {
        if (arg0 == 65) {
            field2828++;
            return arg1 == 1 || arg1 == 3 || arg1 == 5;
        } else {
            return false;
        }
    }
}
