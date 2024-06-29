import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class137 extends class342 {

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field1977;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Z")
    public boolean field1973;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "F")
    public float field1976;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "F")
    public float field1975;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ltb;IIIIIZ)V", line = 4)
    private class137(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field1977 = arg5;
        if (this.field1789 == 34037) {
            this.field1973 = false;
            this.field1976 = (float) arg4;
            this.field1975 = (float) arg5;
        } else {
            this.field1976 = this.field1975 = 1.0F;
            this.field1973 = true;
        }
        this.field1974 = arg4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILtb;II)Lkf;", line = 26)
    public static final class137 method947(int arg0, int arg1, int arg2, class227 arg3, int arg4, int arg5) {
        if (arg2 != -5252) {
            return (class137) null;
        } else if (!arg3.field3281 && (!class65.method503(arg4, arg2 + 5251) || !class65.method503(arg0, arg2 ^ 0x1483))) {
            return arg3.field3248 ? new class137(arg3, 34037, arg5, arg1, arg4, arg0, true) : new class137(arg3, arg5, arg1, arg4, arg0, class438.method2748((byte) 120, arg4), class438.method2748((byte) 119, arg0), true);
        } else {
            return new class137(arg3, 3553, arg5, arg1, arg4, arg0, true);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ltb;IIIIIIZ)V", line = 43)
    private class137(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1975 = (float) arg4 / (float) arg6;
        this.field1977 = arg4;
        this.field1976 = (float) arg3 / (float) arg5;
        this.field1973 = false;
        this.field1974 = arg3;
        this.method2174(false, false);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ltb;IIIIZ[BI)V", line = 58)
    private class137(class227 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1977 = arg4;
        if (this.field1789 == 34037) {
            this.field1976 = (float) arg3;
            this.field1973 = false;
            this.field1975 = (float) arg4;
        } else {
            this.field1973 = true;
            this.field1976 = this.field1975 = 1.0F;
        }
        this.field1974 = arg3;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ltb;IIIII[BI)V", line = 79)
    private class137(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1977 = arg3;
        this.field1974 = arg2;
        this.method2172(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field1975 = (float) arg3 / (float) arg5;
        this.field1976 = (float) arg2 / (float) arg4;
        this.field1973 = false;
        this.method2174(false, false);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ[IILtb;I)Lkf;", line = 94)
    public static final class137 method948(int arg0, boolean arg1, int[] arg2, int arg3, class227 arg4, int arg5) {
        if (arg5 != 34037) {
            return (class137) null;
        } else if (!arg4.field3281 && (!class65.method503(arg0, -1) || !class65.method503(arg3, -1))) {
            return arg4.field3248 ? new class137(arg4, 34037, arg0, arg3, arg1, arg2) : new class137(arg4, arg0, arg3, class438.method2748((byte) 126, arg0), class438.method2748((byte) 116, arg3), arg2);
        } else {
            return new class137(arg4, 3553, arg0, arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZILtb;BI[BI)Lkf;", line = 114)
    public static final class137 method949(int arg0, boolean arg1, int arg2, class227 arg3, byte arg4, int arg5, byte[] arg6, int arg7) {
        if (arg4 < 109) {
            return (class137) null;
        } else if (!arg3.field3281 && (!class65.method503(arg5, -1) || !class65.method503(arg7, -1))) {
            return arg3.field3248 ? new class137(arg3, 34037, arg0, arg5, arg7, arg1, arg6, arg2) : new class137(arg3, arg0, arg5, arg7, class438.method2748((byte) 118, arg5), class438.method2748((byte) 125, arg7), arg6, arg2);
        } else {
            return new class137(arg3, 3553, arg0, arg5, arg7, arg1, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ltb;IIII[I)V", line = 133)
    private class137(class227 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1977 = arg2;
        this.field1974 = arg1;
        this.method2173(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field1975 = (float) arg2 / (float) arg4;
        this.field1973 = false;
        this.field1976 = (float) arg1 / (float) arg3;
        this.method2174(false, false);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ltb;IIIZ[I)V", line = 148)
    private class137(class227 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field1974 = arg2;
        if (this.field1789 == 34037) {
            this.field1976 = (float) arg2;
            this.field1975 = (float) arg3;
            this.field1973 = false;
        } else {
            this.field1973 = true;
            this.field1976 = this.field1975 = 1.0F;
        }
        this.field1977 = arg3;
    }
}
