import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class252 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lom;")
    public static class344 field3751;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)I")
    public static final int method1685(boolean arg0, int arg1) {
        if (arg0) {
            return 35;
        } else {
            field3752++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public static void method1686(boolean arg0) {
        field3751 = null;
        if (!arg0) {
            field3751 = null;
        }
    }
}
