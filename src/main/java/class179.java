import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class179 extends class257 {

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "F")
    public float field2552;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Z")
    public boolean field2550;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "F")
    public float field2548;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lmm;IIIZ[I)V")
    private class179(class357 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (this.field4369 == 34037) {
            this.field2552 = (float) arg2;
            this.field2550 = false;
            this.field2548 = (float) arg3;
        } else {
            this.field2550 = true;
            this.field2552 = this.field2548 = 1.0F;
        }
        this.field2551 = arg2;
        this.field2549 = arg3;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lmm;IIIIIIZ)V")
    private class179(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2552 = (float) arg3 / (float) arg5;
        this.field2550 = false;
        this.field2549 = arg4;
        this.field2551 = arg3;
        this.field2548 = (float) arg4 / (float) arg6;
        this.method1659(false, false);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lmm;IIII[I)V")
    private class179(class357 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2551 = arg1;
        this.field2549 = arg2;
        this.method1658(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field2548 = (float) arg2 / (float) arg4;
        this.field2552 = (float) arg1 / (float) arg3;
        this.field2550 = false;
        this.method1659(false, false);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[IILmm;ZI)Lvj;")
    public static final class179 method1265(int arg0, int[] arg1, int arg2, class357 arg3, boolean arg4, int arg5) {
        if (arg5 != 3553) {
            return (class179) null;
        } else if (!arg3.field4901 && (!class93.method730(true, arg0) || !class93.method730(true, arg2))) {
            return arg3.field4856 ? new class179(arg3, 34037, arg0, arg2, arg4, arg1) : new class179(arg3, arg0, arg2, class177.method1249((byte) -124, arg0), class177.method1249((byte) -127, arg2), arg1);
        } else {
            return new class179(arg3, 3553, arg0, arg2, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIILmm;)Lvj;")
    public static final class179 method1266(int arg0, int arg1, int arg2, int arg3, int arg4, class357 arg5) {
        int var6 = 67 % ((arg1 + 3) / 37);
        if (!arg5.field4901 && (!class93.method730(true, arg4) || !class93.method730(true, arg0))) {
            return arg5.field4856 ? new class179(arg5, 34037, arg3, arg2, arg4, arg0, true) : new class179(arg5, arg3, arg2, arg4, arg0, class177.method1249((byte) -125, arg4), class177.method1249((byte) -122, arg0), true);
        } else {
            return new class179(arg5, 3553, arg3, arg2, arg4, arg0, true);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lmm;IIIIZ[BI)V")
    private class179(class357 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2549 = arg4;
        this.field2551 = arg3;
        if (this.field4369 == 34037) {
            this.field2548 = (float) arg4;
            this.field2550 = false;
            this.field2552 = (float) arg3;
        } else {
            this.field2552 = this.field2548 = 1.0F;
            this.field2550 = true;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lmm;IIIII[BI)V")
    private class179(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2551 = arg2;
        this.field2549 = arg3;
        this.method1657(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field2552 = (float) arg2 / (float) arg4;
        this.field2548 = (float) arg3 / (float) arg5;
        this.field2550 = false;
        this.method1659(false, false);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZI[BIIILmm;)Lvj;")
    public static final class179 method1267(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, class357 arg7) {
        if (arg0 != 6408) {
            method1267(119, false, -80, (byte[]) null, 78, 59, 16, (class357) null);
        }
        if (!arg7.field4901 && (!class93.method730(true, arg6) || !class93.method730(true, arg2))) {
            return arg7.field4856 ? new class179(arg7, 34037, arg4, arg6, arg2, arg1, arg3, arg5) : new class179(arg7, arg4, arg6, arg2, class177.method1249((byte) -125, arg6), class177.method1249((byte) -123, arg2), arg3, arg5);
        } else {
            return new class179(arg7, 3553, arg4, arg6, arg2, arg1, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lmm;IIIIIZ)V")
    private class179(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (this.field4369 == 34037) {
            this.field2552 = (float) arg4;
            this.field2548 = (float) arg5;
            this.field2550 = false;
        } else {
            this.field2552 = this.field2548 = 1.0F;
            this.field2550 = true;
        }
        this.field2549 = arg5;
        this.field2551 = arg4;
    }
}
