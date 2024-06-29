import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class26 {

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "Lmq;")
    public static class85 field279;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V", line = 4)
    public static void method222(int arg0) {
        field279 = null;
        if (arg0 != -1) {
            field279 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIZBI)V", line = 20)
    public static final void method223(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        if (arg3 > 96) {
            field278++;
            if (class484.method2853(arg4, (byte) -72)) {
                class460.method2689(-1, arg2, arg0, false, arg1, class610.field8661[arg4]);
            }
        }
    }
}
