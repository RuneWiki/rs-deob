import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class640 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Ldh;")
    public static class320 field9174 = new class320(117, -1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZZ)Z")
    public static boolean method3652(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method3653(boolean arg0) {
        if (arg0) {
            field9174 = null;
        }
        field9174 = null;
    }
}
