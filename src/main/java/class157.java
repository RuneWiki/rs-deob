import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class157 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Z")
    private static boolean field2568 = true;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Z")
    private static boolean field2569 = false;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lmf;")
    private static class291 field2567 = new class291();

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLun;)V")
    public static final synchronized void method1134(byte arg0, class294 arg1) {
        if (arg0 <= 49) {
            method1136(true, 45);
        }
        if (field2568) {
            class149 var2 = new class149();
            var2.field2463 = arg1;
            field2567.method1885(false, var2);
        } else if (!field2569) {
            arg1.method615();
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final synchronized void method1135(int arg0) {
        while (true) {
            class149 var1 = (class149) field2567.method1894((byte) -128);
            if (var1 == null) {
                if (arg0 != 24180) {
                    field2568 = true;
                    return;
                }
                return;
            }
            var1.field2463.method615();
            var1.method1676(true);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method1136(boolean arg0, int arg1) {
        if (arg1 != -11498) {
            field2567 = null;
        }
        field2569 = arg0;
    }
}
