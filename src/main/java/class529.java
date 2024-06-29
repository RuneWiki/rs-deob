import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class529 {

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Lne;")
    public static class175 field7354 = new class175();

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "F")
    public static float field7355 = 1.0F;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field7356 = 0;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V", line = 7)
    public static void method2975(boolean arg0) {
        field7354 = null;
        if (arg0) {
            method2975(false);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)V", line = 32)
    public static final void method2976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7353++;
        if (arg3 != -1) {
            return;
        }
        class371[] var7 = class451.field6552;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class371 var9 = var7[var8];
            if (var9 != null && var9.field5361 == 2) {
                class619.method3501(var9.field5355, var9.field5356, var9.field5362 * 2, var9.field5364, arg5 >> 1, (byte) -110, arg1 >> 1, arg6, arg0);
                if (class621.field8750[0] > -1 && (class310.field4553 % 20) < 10) {
                    class128.field2091[var9.field5360].method953(arg2 + class621.field8750[0] - 12, class621.field8750[1] + arg4 + -28);
                }
            }
        }
    }
}
