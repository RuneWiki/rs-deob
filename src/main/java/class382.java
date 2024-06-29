import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class382 extends class530 {

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V", line = 3)
    public final void method73(boolean arg0) {
        if (super.field7418.method2253(120)) {
            super.field7419 = 0;
        }
        ++field5361;
        if (~super.field7419 > -1 && ~super.field7419 < -3) {
            super.field7419 = this.method74(0);
        }
        if (!arg0) {
            this.method74(71);
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(Z)Z", line = 22)
    public final boolean method2335(boolean arg0) {
        ++field5362;
        if (!arg0) {
            return true;
        } else {
            return !super.field7418.method2253(-63);
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)I", line = 37)
    public final int method2336(int arg0) {
        if (arg0 != 0) {
            return 0;
        } else {
            ++field5367;
            return super.field7419;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(II)V", line = 49)
    public final void method70(int arg0, int arg1) {
        if (arg1 > -38) {
            field5365 = -123;
        }
        super.field7419 = arg0;
        ++field5364;
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(ILah;)V", line = 61)
    public class382(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZIIII)I", line = 64)
    public static final int method2337(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5368;
        if (arg0) {
            method2337(true, 40, 9, -117, -88);
        }
        int var5 = -class231.field3218[arg1 * 8192 / arg2] + 65536 >> 1;
        return ((-var5 + 65536) * arg3 >> 16) - -(arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZI)I", line = 80)
    public static final int method2338(int arg0, boolean arg1, int arg2) {
        ++field5366;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg0 >>= 1;
        }
        if (arg1) {
            return -62;
        } else if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)I", line = 108)
    public final int method75(int arg0, int arg1) {
        ++field5369;
        int var3 = 119 % ((63 - arg1) / 60);
        if (super.field7418.method2253(-30)) {
            return 3;
        } else {
            return arg0 != 0 && ~super.field7418.field5163.method989(0) != -2 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lah;)V", line = 125)
    public class382(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I", line = 129)
    public final int method74(int arg0) {
        ++field5360;
        if (arg0 != 0) {
            method2338(84, false, 68);
        }
        return 1;
    }
}
