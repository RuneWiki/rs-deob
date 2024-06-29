import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class209 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lqd;")
    private static class40 field3338 = class147.method1106("Started 3d Library", (byte) -82);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lqd;")
    public static class40 field3339 = field3338;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[I")
    public static int[] field3344 = new int[100];

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lpl;")
    public static class186 field3340 = new class186(100);

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Lqd;")
    public static class40 field3346 = class147.method1106("null", (byte) -118);

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "F")
    public static float field3343;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lw;")
    public static class262 field3345;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lwd;")
    public static class75 field3347;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method1476(int arg0, int arg1) {
        field3342++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg0 < 50) {
            return false;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 30)
    public static void method1477(int arg0) {
        field3345 = null;
        field3347 = null;
        field3344 = null;
        field3339 = null;
        field3340 = null;
        field3346 = null;
        field3338 = null;
        if (arg0 != 100) {
            field3343 = -0.067262046F;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z[Ljava/lang/Object;[J)V", line = 55)
    public static final void method1478(boolean arg0, Object[] arg1, long[] arg2) {
        class309.method2110(arg2, arg1, -1, 0, arg2.length - 1);
        if (!arg0) {
            field3341++;
        }
    }
}
