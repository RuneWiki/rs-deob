import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class167 extends class530 {

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "Lcba;")
    public static class53 field2283 = new class53(1);

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "[I")
    public static int[] field2286 = new int[13];

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "Lgha;")
    public static class497 field2287 = new class497();

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method1057(byte arg0, int arg1) {
        if (arg0 == 2) {
            ++field2279;
            class118 var2 = class126.method814(true, arg1, 3);
            var2.method778(arg0 ^ 27968);
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)I", line = 21)
    public final int method1058(int arg0) {
        if (arg0 != 0) {
            field2283 = null;
        }
        ++field2285;
        return super.field7419;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)V", line = 35)
    public static void method1059(boolean arg0) {
        field2283 = null;
        if (!arg0) {
            field2283 = null;
        }
        field2286 = null;
        field2287 = null;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)V", line = 47)
    public final void method70(int arg0, int arg1) {
        if (arg1 >= -38) {
            this.method75(24, -84);
        }
        super.field7419 = arg0;
        ++field2282;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)I", line = 60)
    public final int method75(int arg0, int arg1) {
        ++field2280;
        int var3 = -117 / ((arg1 - 63) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(ILah;)V", line = 70)
    public class167(int arg0, class374 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lah;)V", line = 73)
    public class167(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I", line = 78)
    public final int method74(int arg0) {
        if (arg0 != 0) {
            field2286 = null;
        }
        ++field2284;
        return 1;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V", line = 92)
    public final void method73(boolean arg0) {
        if (!arg0) {
            field2286 = null;
        }
        ++field2278;
        if (~super.field7419 != -2 && ~super.field7419 != -1) {
            super.field7419 = this.method74(0);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBZIIII)V", line = 107)
    public static final void method1060(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2281;
        if ((!arg2 ? class674.field9500.field5142.method3216(0) : class674.field9500.field5141.method3216(0)) != 0 && ~arg5 != -1 && ~class596.field8577 > -51 && arg3 != -1) {
            class293.field3830[class596.field8577++] = new class362((byte) (arg2 ? 3 : 2), arg3, arg5, arg0, arg6, 0, arg4, (class674) null);
        }
        if (arg1 <= 121) {
            field2287 = null;
        }
    }
}
