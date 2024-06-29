import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class10 extends class313 {

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Z")
    public boolean field124;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "F")
    public float field128;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "F")
    public float field126;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lh;IIIIIZ)V", line = 3)
    private class10(class327 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (this.field3058 == 34037) {
            this.field128 = (float) arg5;
            this.field126 = (float) arg4;
            this.field124 = false;
        } else {
            this.field124 = true;
            this.field126 = this.field128 = 1.0F;
        }
        this.field127 = arg4;
        this.field125 = arg5;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lh;IIIIZ[BI)V", line = 24)
    private class10(class327 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (this.field3058 == 34037) {
            this.field128 = (float) arg4;
            this.field124 = false;
            this.field126 = (float) arg3;
        } else {
            this.field126 = this.field128 = 1.0F;
            this.field124 = true;
        }
        this.field125 = arg4;
        this.field127 = arg3;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lh;IIIII[BI)V", line = 46)
    private class10(class327 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field127 = arg2;
        this.field125 = arg3;
        this.method1973(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field126 = (float) arg2 / (float) arg4;
        this.field128 = (float) arg3 / (float) arg5;
        this.field124 = false;
        this.method1975(false, false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILh;ZII)Ldg;", line = 64)
    public static final class10 method50(int arg0, int arg1, class327 arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            return (class10) null;
        } else if (arg2.field4485 || class113.method662(!arg3, arg4) && class113.method662(true, arg0)) {
            return new class10(arg2, 3553, arg5, arg1, arg4, arg0, true);
        } else if (arg2.field4475) {
            return new class10(arg2, 34037, arg5, arg1, arg4, arg0, true);
        } else {
            return new class10(arg2, arg5, arg1, arg4, arg0, class39.method249(arg4, true), class39.method249(arg0, !arg3), true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lh;IIIIIIZ)V", line = 82)
    private class10(class327 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field126 = (float) arg3 / (float) arg5;
        this.field128 = (float) arg4 / (float) arg6;
        this.field125 = arg4;
        this.field127 = arg3;
        this.field124 = false;
        this.method1975(false, false);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lh;IIII[I)V", line = 96)
    private class10(class327 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field125 = arg2;
        this.field127 = arg1;
        this.method1976(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field126 = (float) arg1 / (float) arg3;
        this.field128 = (float) arg2 / (float) arg4;
        this.field124 = false;
        this.method1975(false, false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLh;B[II)Ldg;", line = 113)
    public static final class10 method51(int arg0, boolean arg1, class327 arg2, byte arg3, int[] arg4, int arg5) {
        if (arg3 > -18) {
            method51(-41, true, (class327) null, (byte) -62, (int[]) null, 72);
        }
        if (!arg2.field4485 && (!class113.method662(true, arg0) || !class113.method662(true, arg5))) {
            return arg2.field4475 ? new class10(arg2, 34037, arg0, arg5, arg1, arg4) : new class10(arg2, arg0, arg5, class39.method249(arg0, true), class39.method249(arg5, true), arg4);
        } else {
            return new class10(arg2, 3553, arg0, arg5, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lh;IIIZ[I)V", line = 130)
    private class10(class327 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (this.field3058 == 34037) {
            this.field128 = (float) arg3;
            this.field124 = false;
            this.field126 = (float) arg2;
        } else {
            this.field126 = this.field128 = 1.0F;
            this.field124 = true;
        }
        this.field127 = arg2;
        this.field125 = arg3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLh;III[BBI)Ldg;", line = 152)
    public static final class10 method52(boolean arg0, class327 arg1, int arg2, int arg3, int arg4, byte[] arg5, byte arg6, int arg7) {
        if (arg6 != -124) {
            method52(false, (class327) null, -11, 70, -23, (byte[]) null, (byte) 75, 48);
        }
        if (!arg1.field4485 && (!class113.method662(true, arg2) || !class113.method662(true, arg4))) {
            return arg1.field4475 ? new class10(arg1, 34037, arg7, arg2, arg4, arg0, arg5, arg3) : new class10(arg1, arg7, arg2, arg4, class39.method249(arg2, true), class39.method249(arg4, true), arg5, arg3);
        } else {
            return new class10(arg1, 3553, arg7, arg2, arg4, arg0, arg5, arg3);
        }
    }
}
