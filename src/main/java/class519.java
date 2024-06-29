import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class519 extends class45 {

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "Ldia;")
    public static class235 field6921 = new class235("", 15);

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZI)V", line = 4)
    public final void method325(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 < -72) {
            class341.field4807.method455(arg3 - 2, arg0, super.field584.field6529 - -4, super.field584.field6531 - -2, ((class409) super.field584).field5674, 0);
            ++field6922;
            class341.field4807.method455(arg3 + -1, arg0 - -1, super.field584.field6529 - -2, super.field584.field6531, 0, 0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lwu;Lwu;Loh;)V", line = 17)
    public class519(class376 arg0, class376 arg1, class409 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIZ)V", line = 20)
    public final void method321(int arg0, int arg1, int arg2, boolean arg3) {
        ++field6923;
        int var5 = this.method323((byte) -36) * super.field584.field6529 / 10000;
        class341.field4807.method504(arg0, arg2 - -2, var5, super.field584.field6531 - 2, ((class409) super.field584).field5675, 0);
        class341.field4807.method504(arg0 + var5, arg1 + arg2, super.field584.field6529 - var5, super.field584.field6531 - 2, 0, 0);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V", line = 36)
    public static void method2881(int arg0) {
        field6921 = null;
        if (arg0 != -23738) {
            field6924 = 63;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z[BLrda;IIIII)Lqd;", line = 48)
    public static final class452 method2882(boolean arg0, byte[] arg1, class663 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6920;
        if (arg7 >= -17) {
            method2881(63);
        }
        if (!arg2.field9062 && (!class538.method2993(arg6, -31218) || !class538.method2993(arg5, -31218))) {
            return !arg2.field8986 ? new class452(arg2, arg4, arg6, arg5, class737.method4119(arg6, (byte) -128), class737.method4119(arg5, (byte) -128), arg1, arg3) : new class452(arg2, 34037, arg4, arg6, arg5, arg0, arg1, arg3);
        } else {
            return new class452(arg2, 3553, arg4, arg6, arg5, arg0, arg1, arg3);
        }
    }
}
