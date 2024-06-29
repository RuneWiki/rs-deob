import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class748 {

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field10462 = 0;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field10464 = 0;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lada;")
    public static class164 field10459 = new class164();

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "[I")
    public static int[] field10466 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "D")
    public static double field10460;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field10461;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field10463;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 4)
    public static final void method4176(int arg0) {
        field10458++;
        if (class324.field4627) {
            return;
        }
        class98.method753(class375.field5686, arg0 ^ 0x7BF8);
        if (class277.field3946 != null) {
            class98.method753(class277.field3946, 125);
        }
        if (arg0 == 31622) {
            class324.field4627 = true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIIIIII)V", line = 28)
    public static final void method4177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field10463++;
        if (arg5 < 512 || arg1 < 512 || class194.field2946 * 512 - 1024 < arg5 || ((class255.field3656 - 2) * 512) < arg1) {
            class340.field4942[0] = class340.field4942[1] = -1;
            return;
        }
        int var10 = class384.method2468(true, arg5, arg7, arg1) - arg8;
        if (arg0 != -21727) {
            method4177(-114, -31, 83, -115, 89, -17, -104, -126, -33, -35);
        }
        if (class419.field6265) {
            class368.method2266(90, true);
        } else {
            class124.field1673.method758(arg2, 0, 0);
            class736.field10316.method534(class124.field1673);
        }
        if (class418.field6258) {
            class736.field10316.method425(arg5, var10, arg1, class188.field2859, class340.field4942);
        } else {
            class736.field10316.method488(arg5, var10, arg1, class340.field4942);
        }
        if (class419.field6265) {
            class148.method1096((byte) -29);
        } else {
            class124.field1673.method758(-arg2, 0, 0);
            class736.field10316.method534(class124.field1673);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 72)
    public static void method4178(int arg0) {
        field10459 = null;
        int var1 = -128 / ((24 - arg0) / 53);
        field10466 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)[Lbh;", line = 83)
    public static final class37[] method4179(boolean arg0) {
        if (!arg0) {
            method4179(false);
        }
        field10461++;
        return new class37[] { class607.field8585, class611.field8636, class499.field7095, class370.field5322, class396.field5945, class730.field10230 };
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)J")
    public abstract long method2683(int arg0);
}
