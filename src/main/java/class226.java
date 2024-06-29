import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class226 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field3804 = -1;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lbe;")
    public static class283 field3805 = class153.method941(-119, "compass");

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static volatile int field3807 = -1;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lbe;ZI)V", line = 30)
    public static final void method1482(class283 arg0, boolean arg1, int arg2) {
        if (arg2 != -17397) {
            return;
        }
        field3808++;
        if (!arg1) {
            try {
                class145.field2403.getAppletContext().showDocument(arg0.method1902(-69, class145.field2403.getCodeBase()), "_top");
            } catch (Exception var6) {
            }
            return;
        }
        if (class168.field2819) {
            try {
                class253.method1718("openjs", new Object[] { arg0.method1902(50, class145.field2403.getCodeBase()).toString() }, -112, class150.field2460.field4272);
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class145.field2403.getAppletContext().showDocument(arg0.method1902(67, class145.field2403.getCodeBase()), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 82)
    public static void method1483(int arg0) {
        field3805 = null;
        if (arg0 != -6404) {
            method1483(7);
        }
    }
}
