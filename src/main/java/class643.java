import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public abstract class class643 {

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "Lvl;")
    public static class15 field8895 = new class15(17, 7);

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lqn;")
    public static class71 field8897 = new class71("WIP", 2);

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    public static int field8898 = 0;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "F")
    public static float field8896;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IB)V")
    public static final void method3574(int arg0, byte arg1) {
        field8893++;
        if (arg1 != -63) {
            method3577(-48L, 54);
        }
        class281 var2 = class54.method395((byte) -53, (long) arg0, 3);
        var2.method1818((byte) 119);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[FFIFIFIIFI)V")
    public abstract void method1147(int arg0, float[] arg1, float arg2, int arg3, float arg4, int arg5, float arg6, int arg7, int arg8, float arg9, int arg10);

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)V")
    public static final void method3575(byte arg0) {
        class500.field6844.method3234(-7);
        field8894++;
        class676.field9431 = null;
        if (arg0 != -30) {
            method3575((byte) 85);
        }
        class11.field180 = null;
        class469.field6348 = 1;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)V")
    public static void method3576(byte arg0) {
        field8895 = null;
        if (arg0 == -44) {
            field8897 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(JI)V")
    public static final void method3577(long arg0, int arg1) {
        field8892++;
        if ((long) arg1 >= arg0) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class641.method3567(arg0 - 1L, (byte) 119);
            class641.method3567(1L, (byte) -120);
        } else {
            class641.method3567(arg0, (byte) 15);
        }
    }
}
