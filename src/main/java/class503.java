import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class503 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lki;")
    public static class498 field7379 = new class498(37, 4);

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field7380 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static void method2998(int arg0) {
        field7379 = null;
        if (arg0 > -122) {
            method2998(104);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2999(int arg0, boolean arg1) {
        field7378++;
        if (!arg1) {
            method2999(122, false);
        }
        return arg0 != 1 && arg0 != 7;
    }
}
