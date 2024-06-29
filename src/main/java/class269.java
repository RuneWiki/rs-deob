import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class269 {

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "I")
    public static int field3922 = 0;

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "Lmw;")
    public static class517 field3924 = new class517(64, 8);

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "I")
    public static int field3929 = 0;

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIII)I")
    public static final int method1790(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 13094) {
            return -14;
        }
        field3923++;
        if (arg0 < arg2) {
            return arg2;
        } else if (arg1 >= arg0) {
            return arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
    public static void method1791(int arg0) {
        field3924 = null;
        int var1 = 48 % ((-arg0 - 8) / 49);
    }

    @OriginalMember(owner = "client!fga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3928++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZLlf;III[III)Lfu;")
    public static final class411 method1792(boolean arg0, class250 arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field3925++;
        if (arg3 != 3553) {
            field3929 = -100;
        }
        if (!arg1.field3588 && (!class439.method2627(0, arg6) || !class439.method2627(0, arg4))) {
            return arg1.field3616 ? new class411(arg1, 34037, arg6, arg4, arg0, arg5, arg2, arg7) : new class411(arg1, arg6, arg4, class8.method45(23714, arg6), class8.method45(23714, arg4), arg5);
        } else {
            return new class411(arg1, 3553, arg6, arg4, arg0, arg5, arg2, arg7);
        }
    }
}
