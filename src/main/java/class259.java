import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class259 extends class41 {

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public int field3859;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "F")
    public float field3861;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "F")
    public float field3860;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "Z")
    public boolean field3862;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lnm;IIIZ[I)V")
    private class259(class254 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field3859 = arg3;
        if (this.field330 == 34037) {
            this.field3861 = (float) arg3;
            this.field3862 = false;
            this.field3860 = (float) arg2;
        } else {
            this.field3860 = this.field3861 = 1.0F;
            this.field3862 = true;
        }
        this.field3863 = arg2;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lnm;IIII[I)V")
    private class259(class254 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field3863 = arg1;
        this.field3859 = arg2;
        this.method311(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field3860 = (float) arg1 / (float) arg3;
        this.field3862 = false;
        this.field3861 = (float) arg2 / (float) arg4;
        this.method312(false, false);
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lnm;IIIII[BI)V")
    private class259(class254 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3859 = arg3;
        this.field3863 = arg2;
        this.method310(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field3862 = false;
        this.field3860 = (float) arg2 / (float) arg4;
        this.field3861 = (float) arg3 / (float) arg5;
        this.method312(false, false);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILnm;II)Lup;")
    public static final class259 method1712(int arg0, int arg1, int arg2, class254 arg3, int arg4, int arg5) {
        if (arg2 != 30887) {
            method1714((int[]) null, -123, -77, 11, true, (class254) null);
        }
        if (!arg3.field3708 && (!class72.method621((byte) -113, arg5) || !class72.method621((byte) -113, arg4))) {
            return arg3.field3685 ? new class259(arg3, 34037, arg1, arg0, arg5, arg4, true) : new class259(arg3, arg1, arg0, arg5, arg4, class158.method1078((byte) -61, arg5), class158.method1078((byte) -60, arg4), true);
        } else {
            return new class259(arg3, 3553, arg1, arg0, arg5, arg4, true);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lnm;IIIIZ[BI)V")
    private class259(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field3863 = arg3;
        this.field3859 = arg4;
        if (this.field330 == 34037) {
            this.field3860 = (float) arg3;
            this.field3861 = (float) arg4;
            this.field3862 = false;
        } else {
            this.field3860 = this.field3861 = 1.0F;
            this.field3862 = true;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([BIZIIILnm;I)Lup;")
    public static final class259 method1713(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class254 arg6, int arg7) {
        if (arg4 != -34038) {
            method1714((int[]) null, 93, -128, -45, false, (class254) null);
        }
        if (!arg6.field3708 && (!class72.method621((byte) -113, arg5) || !class72.method621((byte) -113, arg7))) {
            return arg6.field3685 ? new class259(arg6, 34037, arg3, arg5, arg7, arg2, arg0, arg1) : new class259(arg6, arg3, arg5, arg7, class158.method1078((byte) -48, arg5), class158.method1078((byte) -77, arg7), arg0, arg1);
        } else {
            return new class259(arg6, 3553, arg3, arg5, arg7, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lnm;IIIIIZ)V")
    private class259(class254 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field3863 = arg4;
        if (this.field330 == 34037) {
            this.field3862 = false;
            this.field3860 = (float) arg4;
            this.field3861 = (float) arg5;
        } else {
            this.field3860 = this.field3861 = 1.0F;
            this.field3862 = true;
        }
        this.field3859 = arg5;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lnm;IIIIIIZ)V")
    private class259(class254 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field3859 = arg4;
        this.field3863 = arg3;
        this.field3861 = (float) arg4 / (float) arg6;
        this.field3860 = (float) arg3 / (float) arg5;
        this.field3862 = false;
        this.method312(false, false);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([IIIIZLnm;)Lup;")
    public static final class259 method1714(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, class254 arg5) {
        if (arg3 != 3553) {
            return (class259) null;
        } else if (!arg5.field3708 && (!class72.method621((byte) -113, arg1) || !class72.method621((byte) -113, arg2))) {
            return arg5.field3685 ? new class259(arg5, 34037, arg1, arg2, arg4, arg0) : new class259(arg5, arg1, arg2, class158.method1078((byte) -59, arg1), class158.method1078((byte) -81, arg2), arg0);
        } else {
            return new class259(arg5, 3553, arg1, arg2, arg4, arg0);
        }
    }
}
