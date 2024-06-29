import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class84 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ldq;")
    public static class493 field1054 = new class493(44, 8);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Lqn;")
    public static class47 field1055;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V", line = 3)
    public static void method680(boolean arg0) {
        field1054 = null;
        if (arg0) {
            field1055 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V", line = 18)
    public static final void method681(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class407.field5817.field3629 * arg2 >> 8;
        field1056++;
        if (arg3 > -4) {
            field1055 = null;
        }
        if (arg0 == -1 && !class45.field538) {
            class515.method3077((byte) -53);
        } else if (arg0 != -1 && (class387.field5085 != arg0 || !class159.method1023((byte) 100)) && var4 != 0 && !class45.field538) {
            class215.method1322(var4, 13, false, arg0, arg1, class530.field7806, 0);
        }
        class387.field5085 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([Ljava/lang/Object;[IZ)V", line = 46)
    public static final void method683(Object[] arg0, int[] arg1, boolean arg2) {
        class441.method2590(arg0, arg1.length - 1, arg1, -53, 0);
        if (arg2) {
            field1053++;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILqf;)Lqf;")
    public abstract class481 method682(int arg0, class481 arg1);
}
