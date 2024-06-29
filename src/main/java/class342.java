import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class342 {

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field4740 = 0;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "([BB)[B", line = 4)
    public static final byte[] method2054(byte[] arg0, byte arg1) {
        field4739++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -115) {
            field4740 = 101;
        }
        byte[] var2 = new byte[arg0.length];
        class553.method3242(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZJLvo;IIII)V", line = 25)
    public static final void method2055(boolean arg0, long arg1, class345 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= -88) {
            field4740 = -40;
        }
        class546.method3209(arg1, arg0, 0, false, arg4, arg5, arg2, arg6);
        field4741++;
    }
}
