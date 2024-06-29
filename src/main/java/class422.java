import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class422 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
    public static int[] field6039 = new int[5];

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "[F")
    public static float[] field6040 = new float[16];

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lmga;")
    public static class739 field6038 = new class739(48, 2);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method2595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field6037++;
        if ((arg7 ? class712.field9959.field1321.method3352(68) : class712.field9959.field1275.method3352(115)) != 0 && arg1 != 0 && class393.field5800 < 50 && arg4 != -1) {
            class729.field10120[class393.field5800++] = new class720((byte) (arg7 ? 3 : 2), arg4, arg1, arg3, arg0, arg5, arg6, null);
        }
        if (arg2 != 50) {
            field6039 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method2596(boolean arg0) {
        field6038 = null;
        field6039 = null;
        field6040 = null;
        if (!arg0) {
            field6038 = null;
        }
    }
}
