import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class35 {

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Lgr;")
    public static class530 field317 = new class530(75, 3);

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field318 = 0;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field319 = -1;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "[[[Z")
    public static boolean[][][] field315;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBIIIII)V", line = 5)
    public static final void method181(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field314++;
        if (class200.field2976 <= arg5 - arg2 && class204.field3061 >= arg2 + arg5 && class377.field5458 <= (arg4 - arg2) && arg2 + arg4 <= class362.field5291) {
            class595.method3487(arg6, arg2, arg3, arg0, arg4, (byte) -7, arg5);
        } else {
            class545.method3276(arg6, arg4, arg0, 66, arg5, arg2, arg3);
        }
        if (arg1 != 116) {
            method183(true, null);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V", line = 29)
    public static void method182(byte arg0) {
        field315 = null;
        if (arg0 != 38) {
            method181(112, (byte) -64, -65, 123, -26, 22, -64);
        }
        field317 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 46)
    public static final String method183(boolean arg0, String arg1) {
        field316++;
        if (!arg0) {
            field318 = 98;
        }
        String var2 = class340.method2092(90, class133.method940(arg1, -32068));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }
}
