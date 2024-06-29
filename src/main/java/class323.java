import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public abstract class class323 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "Lha;")
    public static class475 field4590;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1951(boolean arg0) throws IOException {
        field4591++;
        if (class600.field8551 != null && class289.field4225 > 0) {
            class663.field9334.field5983 = 0;
            while (true) {
                class302 var1 = (class302) class163.field2502.method3731((byte) -74);
                if (var1 == null || class663.field9334.field6002.length - class663.field9334.field5983 < var1.field4336) {
                    class600.field8551.method181((byte) -111, class663.field9334.field6002, class663.field9334.field5983, 0);
                    class42.field546 += class663.field9334.field5983;
                    class368.field5212 = 0;
                    break;
                }
                class663.field9334.method2514(var1.field4341.field6002, var1.field4336, (byte) -115, 0);
                class289.field4225 -= var1.field4336;
                var1.method4237(-1);
                var1.field4341.method2553((byte) 123);
                var1.method1878(51);
            }
        }
        if (arg0) {
            method1953(-44, true);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 45)
    public static void method1952(int arg0) {
        field4590 = null;
        if (arg0 != 0) {
            field4590 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)I", line = 56)
    public static final int method1953(int arg0, boolean arg1) {
        if (arg1) {
            method1953(-34, false);
        }
        field4589++;
        return (arg0 & 0x3FE38) >> 11;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIFIIF[FFF)V")
    public abstract void method231(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float arg7, float[] arg8, float arg9, float arg10);
}
