import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class236 {

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public static int field3495 = 0;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "[I")
    public static int[] field3496 = new int[8];

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "Lpw;")
    public static class89 field3494;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILpn;)Lpn;")
    public static final class295 method1544(int arg0, class295 arg1) {
        if (arg0 != -26634) {
            method1544(-53, null);
        }
        field3493++;
        class295 var2 = arg1 == null ? new class295() : new class295(arg1);
        var2.method1830(14884, 128, 9);
        return var2;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z)V")
    public static void method1545(boolean arg0) {
        field3496 = null;
        if (!arg0) {
            field3495 = -82;
        }
        field3494 = null;
    }
}
