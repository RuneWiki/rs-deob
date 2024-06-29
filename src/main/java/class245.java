import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class245 extends class429 {

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Z")
    public boolean field3552;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "F")
    public float field3549;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "F")
    public float field3550;

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lfu;IIIII[BI)V", line = 5)
    private class245(class42 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3551 = arg3;
        this.field3553 = arg2;
        this.method2561(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field3552 = false;
        this.field3549 = (float) arg3 / (float) arg5;
        this.field3550 = (float) arg2 / (float) arg4;
        this.method2564(false, false);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lfu;IIIIZ[BI)V", line = 20)
    private class245(class42 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (this.field5180 == 34037) {
            this.field3550 = (float) arg3;
            this.field3549 = (float) arg4;
            this.field3552 = false;
        } else {
            this.field3550 = this.field3549 = 1.0F;
            this.field3552 = true;
        }
        this.field3553 = arg3;
        this.field3551 = arg4;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lfu;IIIIIIZ)V", line = 42)
    private class245(class42 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field3551 = arg4;
        this.field3553 = arg3;
        this.field3549 = (float) arg4 / (float) arg6;
        this.field3552 = false;
        this.field3550 = (float) arg3 / (float) arg5;
        this.method2564(false, false);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lfu;IIII[I)V", line = 56)
    private class245(class42 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field3553 = arg1;
        this.field3551 = arg2;
        this.method2565(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field3552 = false;
        this.field3550 = (float) arg1 / (float) arg3;
        this.field3549 = (float) arg2 / (float) arg4;
        this.method2564(false, false);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lfu;IIIIIZ)V", line = 70)
    private class245(class42 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field3553 = arg4;
        this.field3551 = arg5;
        if (this.field5180 == 34037) {
            this.field3549 = (float) arg5;
            this.field3550 = (float) arg4;
            this.field3552 = false;
        } else {
            this.field3552 = true;
            this.field3550 = this.field3549 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILfu;III)Lwc;", line = 92)
    public static final class245 method1689(byte arg0, int arg1, class42 arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 79) {
            return (class245) null;
        } else if (!arg2.field612 && (!class7.method41(0, arg1) || !class7.method41(0, arg4))) {
            return arg2.field668 ? new class245(arg2, 34037, arg5, arg3, arg1, arg4, true) : new class245(arg2, arg5, arg3, arg1, arg4, class169.method1230(0, arg1), class169.method1230(0, arg4), true);
        } else {
            return new class245(arg2, 3553, arg5, arg3, arg1, arg4, true);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIBI[BIILfu;)Lwc;", line = 111)
    public static final class245 method1690(boolean arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5, int arg6, class42 arg7) {
        int var8 = -126 % ((16 - arg2) / 58);
        if (!arg7.field612 && (!class7.method41(0, arg6) || !class7.method41(0, arg5))) {
            return arg7.field668 ? new class245(arg7, 34037, arg1, arg6, arg5, arg0, arg4, arg3) : new class245(arg7, arg1, arg6, arg5, class169.method1230(0, arg6), class169.method1230(0, arg5), arg4, arg3);
        } else {
            return new class245(arg7, 3553, arg1, arg6, arg5, arg0, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([IBZLfu;II)Lwc;", line = 128)
    public static final class245 method1691(int[] arg0, byte arg1, boolean arg2, class42 arg3, int arg4, int arg5) {
        if (arg1 >= -44) {
            return (class245) null;
        } else if (!arg3.field612 && (!class7.method41(0, arg4) || !class7.method41(0, arg5))) {
            return arg3.field668 ? new class245(arg3, 34037, arg4, arg5, arg2, arg0) : new class245(arg3, arg4, arg5, class169.method1230(0, arg4), class169.method1230(0, arg5), arg0);
        } else {
            return new class245(arg3, 3553, arg4, arg5, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lfu;IIIZ[I)V", line = 145)
    private class245(class42 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (this.field5180 == 34037) {
            this.field3549 = (float) arg3;
            this.field3552 = false;
            this.field3550 = (float) arg2;
        } else {
            this.field3550 = this.field3549 = 1.0F;
            this.field3552 = true;
        }
        this.field3551 = arg3;
        this.field3553 = arg2;
    }
}
