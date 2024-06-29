import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class227 extends class470 {

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "F")
    public float field3441;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "F")
    public float field3440;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "Z")
    public boolean field3439;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "Lof;")
    public static class475 field3443 = new class475(2, 2);

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)Z")
    public static final boolean method1523(int arg0, int arg1) {
        ++field3438;
        if (arg1 >= -15) {
            return true;
        } else {
            return ~arg0 == -4 || ~arg0 == -5;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpq;IIIIZ[BI)V")
    public class227(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field3442 = arg4;
        this.field3437 = arg3;
        if (~super.field7453 != -34038) {
            this.field3440 = this.field3441 = 1.0F;
            this.field3439 = true;
        } else {
            this.field3441 = (float) arg4;
            this.field3440 = (float) arg3;
            this.field3439 = false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpq;IIIZ[III)V")
    public class227(class194 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field3437 = arg2;
        this.field3442 = arg3;
        if (~super.field7453 != -34038) {
            this.field3439 = true;
            this.field3440 = this.field3441 = 1.0F;
        } else {
            this.field3441 = (float) arg3;
            this.field3440 = (float) arg2;
            this.field3439 = false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpq;IIIII)V")
    public class227(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3440 = (float) arg2 / (float) arg4;
        this.field3442 = arg3;
        this.field3437 = arg2;
        this.field3439 = false;
        this.field3441 = (float) arg3 / (float) arg5;
        this.method2804(false, 10243, false);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpq;IIIII[BI)V")
    public class227(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3437 = arg2;
        this.field3442 = arg3;
        this.method2807(true, arg3, arg6, 0, 0, 79, arg2, 0, 0, arg7);
        this.field3440 = (float) arg2 / (float) arg4;
        this.field3441 = (float) arg3 / (float) arg5;
        this.field3439 = false;
        this.method2804(false, 10243, false);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpq;IIII)V")
    public class227(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3437 = arg3;
        this.field3442 = arg4;
        if (~super.field7453 != -34038) {
            this.field3440 = this.field3441 = 1.0F;
            this.field3439 = true;
        } else {
            this.field3440 = (float) arg3;
            this.field3439 = false;
            this.field3441 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)V")
    public static void method1524(byte arg0) {
        field3443 = null;
        if (arg0 != -18) {
            field3443 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpq;IIIIIZ)V")
    public class227(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field3442 = arg5;
        this.field3437 = arg4;
        if (super.field7453 == 34037) {
            this.field3440 = (float) arg4;
            this.field3441 = (float) arg5;
            this.field3439 = false;
        } else {
            this.field3439 = true;
            this.field3440 = this.field3441 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpq;IIIIIIZ)V")
    public class227(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field3441 = (float) arg4 / (float) arg6;
        this.field3439 = false;
        this.field3442 = arg4;
        this.field3437 = arg3;
        this.field3440 = (float) arg3 / (float) arg5;
        this.method2804(false, 10243, false);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpq;IIII[I)V")
    public class227(class194 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field3442 = arg2;
        this.field3437 = arg1;
        this.method2801(true, 0, 0, arg5, arg1, arg2, 0, true, 0);
        this.field3440 = (float) arg1 / (float) arg3;
        this.field3439 = false;
        this.field3441 = (float) arg2 / (float) arg4;
        this.method2804(false, 10243, false);
    }
}
