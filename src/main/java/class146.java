import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class146 extends class121 {

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Z")
    public boolean field1871;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "F")
    public float field1872;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "F")
    public float field1870;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZILse;[I)Lfj;")
    public static final class146 method1010(int arg0, int arg1, boolean arg2, int arg3, class282 arg4, int[] arg5) {
        if (arg0 != -19065) {
            method1012(-97, -57, (class282) null, 20, (byte) -20, -37);
        }
        if (!arg4.field4271 && (!class382.method2486(arg0 ^ 0x68E677CF, arg1) || !class382.method2486(-1759919544, arg3))) {
            return arg4.field4217 ? new class146(arg4, 34037, arg1, arg3, arg2, arg5) : new class146(arg4, arg1, arg3, class41.method299(arg0 ^ 0xFFFFB585, arg1), class41.method299(arg0 + 19067, arg3), arg5);
        } else {
            return new class146(arg4, 3553, arg1, arg3, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lse;IIIIIIZ)V")
    private class146(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1874 = arg4;
        this.field1871 = false;
        this.field1872 = (float) arg4 / (float) arg6;
        this.field1873 = arg3;
        this.field1870 = (float) arg3 / (float) arg5;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lse;IIIZ[I)V")
    private class146(class282 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field1873 = arg2;
        if (this.field5129 == 34037) {
            this.field1871 = false;
            this.field1872 = (float) arg3;
            this.field1870 = (float) arg2;
        } else {
            this.field1871 = true;
            this.field1870 = this.field1872 = 1.0F;
        }
        this.field1874 = arg3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[BZIILse;II)Lfj;")
    public static final class146 method1011(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, class282 arg5, int arg6, int arg7) {
        if (arg4 != 34037) {
            return (class146) null;
        } else if (!arg5.field4271 && (!class382.method2486(-1759919544, arg3) || !class382.method2486(-1759919544, arg6))) {
            return arg5.field4217 ? new class146(arg5, 34037, arg7, arg3, arg6, arg2, arg1, arg0) : new class146(arg5, arg7, arg3, arg6, class41.method299(arg4 - 34035, arg3), class41.method299(arg4 - 34035, arg6), arg1, arg0);
        } else {
            return new class146(arg5, 3553, arg7, arg3, arg6, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lse;IIIIIZ)V")
    private class146(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (this.field5129 == 34037) {
            this.field1870 = (float) arg4;
            this.field1872 = (float) arg5;
            this.field1871 = false;
        } else {
            this.field1870 = this.field1872 = 1.0F;
            this.field1871 = true;
        }
        this.field1874 = arg5;
        this.field1873 = arg4;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lse;IIIIZ[BI)V")
    private class146(class282 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1873 = arg3;
        if (this.field5129 == 34037) {
            this.field1872 = (float) arg4;
            this.field1871 = false;
            this.field1870 = (float) arg3;
        } else {
            this.field1871 = true;
            this.field1870 = this.field1872 = 1.0F;
        }
        this.field1874 = arg4;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lse;IIIII[BI)V")
    private class146(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1873 = arg2;
        this.field1874 = arg3;
        this.method869(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field1871 = false;
        this.field1872 = (float) arg3 / (float) arg5;
        this.field1870 = (float) arg2 / (float) arg4;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lse;IIII[I)V")
    private class146(class282 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1873 = arg1;
        this.field1874 = arg2;
        this.method873(0, 0, arg1, arg2, arg5, 0, arg1, true);
        this.field1870 = (float) arg1 / (float) arg3;
        this.field1871 = false;
        this.field1872 = (float) arg2 / (float) arg4;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILse;IBI)Lfj;")
    public static final class146 method1012(int arg0, int arg1, class282 arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -117) {
            return (class146) null;
        } else if (!arg2.field4271 && (!class382.method2486(-1759919544, arg0) || !class382.method2486(-1759919544, arg5))) {
            return arg2.field4217 ? new class146(arg2, 34037, arg1, arg3, arg0, arg5, true) : new class146(arg2, arg1, arg3, arg0, arg5, class41.method299(2, arg0), class41.method299(2, arg5), true);
        } else {
            return new class146(arg2, 3553, arg1, arg3, arg0, arg5, true);
        }
    }
}
