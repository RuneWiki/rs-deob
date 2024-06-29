import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class397 {

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "Z")
    public static boolean field6158 = false;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Lqe;")
    public static class433 field6156 = new class433();

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 5)
    public static void method2560(int arg0) {
        if (arg0 > -47) {
            method2560(-99);
        }
        field6156 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)Z", line = 19)
    public static final boolean method2561(boolean arg0) {
        if (!arg0) {
            field6158 = true;
        }
        field6157++;
        return class52.field693 > 0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "([FIIFFIIIFIF)V")
    public abstract void method1585(float[] arg0, int arg1, int arg2, float arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10);
}
