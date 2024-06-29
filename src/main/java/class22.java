import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class22 extends class225 {

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "F")
    public float field276;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Z")
    public boolean field280;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "F")
    public float field279;

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lig;IIIZ[I)V", line = 5)
    private class22(class132 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field277 = arg3;
        this.field278 = arg2;
        if (this.field5663 == 34037) {
            this.field276 = (float) arg3;
            this.field280 = false;
            this.field279 = (float) arg2;
        } else {
            this.field280 = true;
            this.field279 = this.field276 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILig;III)Lrk;", line = 27)
    public static final class22 method119(int arg0, int arg1, class132 arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 34037) {
            return (class22) null;
        } else if (!arg2.field1977 && (!class432.method2698((byte) 123, arg3) || !class432.method2698((byte) 20, arg4))) {
            return arg2.field2002 ? new class22(arg2, 34037, arg0, arg5, arg3, arg4, true) : new class22(arg2, arg0, arg5, arg3, arg4, class258.method1787(-115, arg3), class258.method1787(-124, arg4), true);
        } else {
            return new class22(arg2, 3553, arg0, arg5, arg3, arg4, true);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lig;IIIII[BI)V", line = 45)
    private class22(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field278 = arg2;
        this.field277 = arg3;
        this.method1577(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field276 = (float) arg3 / (float) arg5;
        this.field279 = (float) arg2 / (float) arg4;
        this.field280 = false;
        this.method1580(false, false);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lig;IIIIIZ)V", line = 60)
    private class22(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field278 = arg4;
        if (this.field5663 == 34037) {
            this.field279 = (float) arg4;
            this.field276 = (float) arg5;
            this.field280 = false;
        } else {
            this.field279 = this.field276 = 1.0F;
            this.field280 = true;
        }
        this.field277 = arg5;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZZILig;I[I)Lrk;", line = 82)
    public static final class22 method120(boolean arg0, boolean arg1, int arg2, class132 arg3, int arg4, int[] arg5) {
        if (arg0) {
            return (class22) null;
        } else if (!arg3.field1977 && (!class432.method2698((byte) 36, arg2) || !class432.method2698((byte) 53, arg4))) {
            return arg3.field2002 ? new class22(arg3, 34037, arg2, arg4, arg1, arg5) : new class22(arg3, arg2, arg4, class258.method1787(-120, arg2), class258.method1787(-128, arg4), arg5);
        } else {
            return new class22(arg3, 3553, arg2, arg4, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lig;IIIIZ[BI)V", line = 99)
    private class22(class132 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field278 = arg3;
        if (this.field5663 == 34037) {
            this.field280 = false;
            this.field279 = (float) arg3;
            this.field276 = (float) arg4;
        } else {
            this.field279 = this.field276 = 1.0F;
            this.field280 = true;
        }
        this.field277 = arg4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lig;BI[BIIIZ)Lrk;", line = 121)
    public static final class22 method121(class132 arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg1 > -123) {
            method120(true, true, 55, (class132) null, -66, (int[]) null);
        }
        if (!arg0.field1977 && (!class432.method2698((byte) 127, arg5) || !class432.method2698((byte) -101, arg6))) {
            return arg0.field2002 ? new class22(arg0, 34037, arg2, arg5, arg6, arg7, arg3, arg4) : new class22(arg0, arg2, arg5, arg6, class258.method1787(-120, arg5), class258.method1787(-118, arg6), arg3, arg4);
        } else {
            return new class22(arg0, 3553, arg2, arg5, arg6, arg7, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lig;IIII[I)V", line = 140)
    private class22(class132 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field278 = arg1;
        this.field277 = arg2;
        this.method1579(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field276 = (float) arg2 / (float) arg4;
        this.field280 = false;
        this.field279 = (float) arg1 / (float) arg3;
        this.method1580(false, false);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lig;IIIIIIZ)V", line = 154)
    private class22(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field277 = arg4;
        this.field278 = arg3;
        this.field280 = false;
        this.field279 = (float) arg3 / (float) arg5;
        this.field276 = (float) arg4 / (float) arg6;
        this.method1580(false, false);
    }
}
