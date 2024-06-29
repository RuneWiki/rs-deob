import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class41 {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lai;")
    private static class10 field679 = class44.method278("glow2:", -102);

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lai;")
    public static class10 field681 = field679;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lai;")
    public static class10 field677 = field679;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lcc;")
    public static class24 field682;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)Z")
    public static final boolean method261(int arg0, boolean arg1) {
        if (arg1) {
            method262(-105);
        }
        field680++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method262(int arg0) {
        field677 = null;
        if (arg0 != 13249) {
            method262(89);
        }
        field681 = null;
        field682 = null;
        field679 = null;
    }
}
