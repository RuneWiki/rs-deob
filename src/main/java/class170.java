import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class170 extends class218 {

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "F")
    public float field2141;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "F")
    public float field2144;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "Z")
    public boolean field2145;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lql;[IIZII)Lgn;", line = 6)
    public static final class170 method896(class346 arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 <= 27) {
            return (class170) null;
        } else if (!arg0.field4807 && (!class234.method1268((byte) -128, arg2) || !class234.method1268((byte) -125, arg4))) {
            return arg0.field4808 ? new class170(arg0, 34037, arg2, arg4, arg3, arg1) : new class170(arg0, arg2, arg4, class322.method1853(124, arg2), class322.method1853(106, arg4), arg1);
        } else {
            return new class170(arg0, 3553, arg2, arg4, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lql;IIII[I)V", line = 23)
    private class170(class346 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2142 = arg2;
        this.field2143 = arg1;
        this.method1173(0, 0, arg1, arg2, arg5, 0, arg1, true);
        this.field2141 = (float) arg2 / (float) arg4;
        this.field2144 = (float) arg1 / (float) arg3;
        this.field2145 = false;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIII[BILql;Z)Lgn;", line = 37)
    public static final class170 method897(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, class346 arg6, boolean arg7) {
        if (arg0 < 5) {
            return (class170) null;
        } else if (!arg6.field4807 && (!class234.method1268((byte) -123, arg5) || !class234.method1268((byte) -122, arg3))) {
            return arg6.field4808 ? new class170(arg6, 34037, arg2, arg5, arg3, arg7, arg4, arg1) : new class170(arg6, arg2, arg5, arg3, class322.method1853(112, arg5), class322.method1853(113, arg3), arg4, arg1);
        } else {
            return new class170(arg6, 3553, arg2, arg5, arg3, arg7, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lql;IIIIIIZ)V", line = 56)
    private class170(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2145 = false;
        this.field2143 = arg3;
        this.field2141 = (float) arg4 / (float) arg6;
        this.field2142 = arg4;
        this.field2144 = (float) arg3 / (float) arg5;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lql;IIIII[BI)V", line = 69)
    private class170(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2142 = arg3;
        this.field2143 = arg2;
        this.method1172(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field2145 = false;
        this.field2144 = (float) arg2 / (float) arg4;
        this.field2141 = (float) arg3 / (float) arg5;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lql;IIIIIZ)V", line = 83)
    private class170(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field2142 = arg5;
        this.field2143 = arg4;
        if (this.field484 == 34037) {
            this.field2141 = (float) arg5;
            this.field2144 = (float) arg4;
            this.field2145 = false;
        } else {
            this.field2145 = true;
            this.field2144 = this.field2141 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lql;IIIIZ[BI)V", line = 106)
    private class170(class346 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (this.field484 == 34037) {
            this.field2145 = false;
            this.field2144 = (float) arg3;
            this.field2141 = (float) arg4;
        } else {
            this.field2144 = this.field2141 = 1.0F;
            this.field2145 = true;
        }
        this.field2142 = arg4;
        this.field2143 = arg3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lql;IIIII)Lgn;", line = 129)
    public static final class170 method898(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 58 % ((arg2 - 64) / 53);
        if (!arg0.field4807 && (!class234.method1268((byte) -128, arg4) || !class234.method1268((byte) -125, arg3))) {
            return arg0.field4808 ? new class170(arg0, 34037, arg1, arg5, arg4, arg3, true) : new class170(arg0, arg1, arg5, arg4, arg3, class322.method1853(127, arg4), class322.method1853(107, arg3), true);
        } else {
            return new class170(arg0, 3553, arg1, arg5, arg4, arg3, true);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lql;IIIZ[I)V", line = 144)
    private class170(class346 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (this.field484 == 34037) {
            this.field2141 = (float) arg3;
            this.field2145 = false;
            this.field2144 = (float) arg2;
        } else {
            this.field2144 = this.field2141 = 1.0F;
            this.field2145 = true;
        }
        this.field2143 = arg2;
        this.field2142 = arg3;
    }
}
