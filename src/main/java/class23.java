import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class23 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field393 = 0;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lub;")
    private static class227 field394 = class257.method1749("Connecting to update server", 17263);

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lub;")
    public static class227 field396 = field394;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)I")
    public static final int method111(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return -116;
        }
        field395++;
        if (arg0 >= arg1) {
            return arg2 >= arg0 ? arg0 : arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)[B")
    public abstract byte[] method112(int arg0);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method113(int arg0) {
        field394 = null;
        if (arg0 != 32396) {
            method113(0);
        }
        field396 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([BZ)V")
    public abstract void method114(byte[] arg0, boolean arg1);
}
