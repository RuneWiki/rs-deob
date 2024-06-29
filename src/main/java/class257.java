import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class257 {

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "[Leq;")
    public static class224[] field3830 = new class224[4];

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "Ljb;")
    public static class519 field3831 = new class519(131, 3);

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "Lmw;")
    public static class517 field3832 = new class517(7, -1);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V", line = 14)
    public static void method1753(int arg0) {
        field3830 = null;
        field3832 = null;
        field3831 = null;
        if (arg0 != -1) {
            method1753(81);
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(III)Lcf;", line = 31)
    public static final class629 method1754(int arg0, int arg1, int arg2) {
        class194 var3 = class443.field6387[arg0][arg1][arg2];
        return var3 == null || var3.field2519 == null ? null : var3.field2519;
    }
}
