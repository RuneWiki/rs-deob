import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class268 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field4296 = 0;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Lqu;")
    public static class219 field4298 = new class219(14, 3);

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "F")
    public static float field4299;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1819(int arg0, byte arg1, int arg2) {
        field4297++;
        if (arg1 != 15) {
            return true;
        } else if (((arg2 & 0x10000) != 0 | class542.method3196(arg0, -15252, arg2)) || class190.method1187(arg0, arg1 - 15, arg2)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && class449.method2830(-1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FIB[FIIIIFFF)V")
    public abstract void method1820(float arg0, int arg1, byte arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method1821(int arg0) {
        field4298 = null;
        if (arg0 != 55) {
            field4296 = -99;
        }
    }
}
