import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class426 extends class530 {

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Lgca;")
    public static class209 field5894 = new class209(8);

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field5897 = 0;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "Lqk;")
    public static class148 field5901 = new class148(1, 3);

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        ++field5895;
        if (!arg0) {
            field5897 = 54;
        }
        super.field7419 = this.method74(0);
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(ILah;)V")
    public class426(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lah;)V")
    public class426(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        ++field5899;
        if (arg0 != 0) {
            field5901 = null;
        }
        return !super.field7418.method2253(118) ? 0 : 1;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)I")
    public final int method2594(int arg0) {
        if (arg0 != 0) {
            field5897 = 10;
        }
        ++field5896;
        return super.field7419;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        int var3 = -112 / ((63 - arg1) / 60);
        ++field5892;
        return 3;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        if (arg1 < -38) {
            ++field5898;
            super.field7419 = arg0;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 7) {
            return 112;
        } else {
            if (~(arg5 & 1) == -2) {
                int var7 = arg4;
                arg4 = arg1;
                arg1 = var7;
            }
            ++field5900;
            int var8 = arg0 & 3;
            if (var8 == 0) {
                return arg3;
            } else if (var8 == 1) {
                return -arg6 + 7 + 1 + -arg4;
            } else {
                return ~var8 == -3 ? -arg3 + 7 - (arg1 + -1) : arg6;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)V")
    public static void method2596(boolean arg0) {
        field5894 = null;
        field5901 = null;
        if (arg0) {
            field5901 = null;
        }
    }
}
