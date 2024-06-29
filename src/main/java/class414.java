import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class414 extends class201 {

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field5719;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public int field5721;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "F")
    public float field5720;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "F")
    public float field5718;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Z")
    public boolean field5722;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILqi;[BIZII)Lr;", line = 4)
    public static final class414 method2416(int arg0, int arg1, class458 arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg0 > -41) {
            method2418(40, 86, 51, (class458) null, -41, -13);
        }
        if (!arg2.field6371 && (!class52.method411((byte) 124, arg4) || !class52.method411((byte) 124, arg1))) {
            return arg2.field6402 ? new class414(arg2, 34037, arg6, arg4, arg1, arg5, arg3, arg7) : new class414(arg2, arg6, arg4, arg1, class406.method2388(arg4, -49), class406.method2388(arg1, -63), arg3, arg7);
        } else {
            return new class414(arg2, 3553, arg6, arg4, arg1, arg5, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lqi;IIIZ[I)V", line = 23)
    private class414(class458 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field5719 = arg2;
        this.field5721 = arg3;
        if (this.field2598 == 34037) {
            this.field5722 = false;
            this.field5720 = (float) arg3;
            this.field5718 = (float) arg2;
        } else {
            this.field5718 = this.field5720 = 1.0F;
            this.field5722 = true;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lqi;IIII[I)V", line = 46)
    private class414(class458 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field5721 = arg2;
        this.field5719 = arg1;
        this.method1278(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field5722 = false;
        this.field5718 = (float) arg1 / (float) arg3;
        this.field5720 = (float) arg2 / (float) arg4;
        this.method1279(false, false);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lqi;IIIIIIZ)V", line = 62)
    private class414(class458 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field5719 = arg3;
        this.field5721 = arg4;
        this.field5720 = (float) arg4 / (float) arg6;
        this.field5722 = false;
        this.field5718 = (float) arg3 / (float) arg5;
        this.method1279(false, false);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lqi;IIIIIZ)V", line = 75)
    private class414(class458 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (this.field2598 == 34037) {
            this.field5720 = (float) arg5;
            this.field5722 = false;
            this.field5718 = (float) arg4;
        } else {
            this.field5718 = this.field5720 = 1.0F;
            this.field5722 = true;
        }
        this.field5719 = arg4;
        this.field5721 = arg5;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([ILqi;IZZI)Lr;", line = 97)
    public static final class414 method2417(int[] arg0, class458 arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        if (arg3) {
            method2416(50, 5, (class458) null, (byte[]) null, 40, false, -50, -54);
        }
        if (!arg1.field6371 && (!class52.method411((byte) 112, arg5) || !class52.method411((byte) 112, arg2))) {
            return arg1.field6402 ? new class414(arg1, 34037, arg5, arg2, arg4, arg0) : new class414(arg1, arg5, arg2, class406.method2388(arg5, -91), class406.method2388(arg2, -83), arg0);
        } else {
            return new class414(arg1, 3553, arg5, arg2, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILqi;II)Lr;", line = 116)
    public static final class414 method2418(int arg0, int arg1, int arg2, class458 arg3, int arg4, int arg5) {
        if (arg0 != 3553) {
            method2416(74, 81, (class458) null, (byte[]) null, -70, true, -59, -80);
        }
        if (!arg3.field6371 && (!class52.method411((byte) 109, arg5) || !class52.method411((byte) 90, arg1))) {
            return arg3.field6402 ? new class414(arg3, 34037, arg4, arg2, arg5, arg1, true) : new class414(arg3, arg4, arg2, arg5, arg1, class406.method2388(arg5, -89), class406.method2388(arg1, arg0 - 3662), true);
        } else {
            return new class414(arg3, 3553, arg4, arg2, arg5, arg1, true);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lqi;IIIIZ[BI)V", line = 134)
    private class414(class458 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field5721 = arg4;
        if (this.field2598 == 34037) {
            this.field5720 = (float) arg4;
            this.field5718 = (float) arg3;
            this.field5722 = false;
        } else {
            this.field5718 = this.field5720 = 1.0F;
            this.field5722 = true;
        }
        this.field5719 = arg3;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lqi;IIIII[BI)V", line = 155)
    private class414(class458 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5719 = arg2;
        this.field5721 = arg3;
        this.method1277(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field5718 = (float) arg2 / (float) arg4;
        this.field5722 = false;
        this.field5720 = (float) arg3 / (float) arg5;
        this.method1279(false, false);
    }
}
