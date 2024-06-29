import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public abstract class class486 {

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "[F")
    public static float[] field6559 = new float[4];

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field6561 = 0;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "[I")
    public static int[] field6565 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Lbaa;")
    public static class129 field6564;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2846(boolean arg0) {
        if (!arg0) {
            field6561 = 114;
        }
        field6564 = null;
        field6559 = null;
        field6565 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILhg;IIII)V", line = 18)
    public static final void method2847(int arg0, int arg1, class584 arg2, int arg3, int arg4, int arg5, int arg6) {
        class390.method2370(0, arg5, arg2.field9501, arg2.field9489, arg1, arg6, arg4, (byte) 125, arg2.field9490, arg3);
        field6560++;
        if (arg0 >= -84) {
            field6559 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 31)
    public static final void method2848(int arg0) {
        class717.field10140 = 0;
        class11.field136 = 0;
        field6562++;
        if (arg0 <= 47) {
            field6565 = null;
        }
        for (int var1 = 0; var1 < class446.field6100; var1++) {
            int var2 = class209.field2976 * var1;
            for (int var3 = 0; var3 < class209.field2976; var3++) {
                int var4 = var2 + var3;
                class264.field3599[var4].method1677(class61.field829 * var3, class459.field6317 * var1, class61.field829, class459.field6317, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I", line = 74)
    public static final int method2849(byte arg0) {
        if (arg0 != -82) {
            field6565 = null;
        }
        field6563++;
        if (class484.field6549) {
            return 6;
        } else if (class627.field8950 == null) {
            return 0;
        } else {
            int var1 = class627.field8950.field60;
            if (class282.method1686(var1, -6)) {
                return 1;
            } else if (class50.method341(arg0 ^ 0x4, var1)) {
                return 2;
            } else if (class464.method2770(var1, -46)) {
                return 3;
            } else if (class462.method2765((byte) -120, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lbia;I)Lbia;")
    public abstract class409 method2850(class409 arg0, int arg1);
}
