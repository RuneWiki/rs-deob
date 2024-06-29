import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class190 extends class216 {

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "F")
    public float field2553;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
    public boolean field2554;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "F")
    public float field2552;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[BILnf;IIIZ)Ldh;", line = 4)
    public static final class190 method1148(int arg0, byte[] arg1, int arg2, class256 arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg0 != 34037) {
            return (class190) null;
        } else if (!arg3.field3720 && (!class192.method1154(true, arg4) || !class192.method1154(true, arg5))) {
            return arg3.field3670 ? new class190(arg3, 34037, arg2, arg4, arg5, arg7, arg1, arg6) : new class190(arg3, arg2, arg4, arg5, class139.method896(arg4, arg0 ^ 0xFFFF7B70), class139.method896(arg5, 124), arg1, arg6);
        } else {
            return new class190(arg3, 3553, arg2, arg4, arg5, arg7, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lnf;IIIIZ[BI)V", line = 21)
    private class190(class256 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2555 = arg3;
        if (this.field5204 == 34037) {
            this.field2553 = (float) arg4;
            this.field2554 = false;
            this.field2552 = (float) arg3;
        } else {
            this.field2552 = this.field2553 = 1.0F;
            this.field2554 = true;
        }
        this.field2556 = arg4;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIILnf;)Ldh;", line = 43)
    public static final class190 method1149(int arg0, int arg1, int arg2, int arg3, int arg4, class256 arg5) {
        if (arg2 < 97) {
            method1148(-39, (byte[]) null, -22, (class256) null, 63, 40, 84, true);
        }
        if (!arg5.field3720 && (!class192.method1154(true, arg0) || !class192.method1154(true, arg4))) {
            return arg5.field3670 ? new class190(arg5, 34037, arg1, arg3, arg0, arg4, true) : new class190(arg5, arg1, arg3, arg0, arg4, class139.method896(arg0, -65), class139.method896(arg4, -69), true);
        } else {
            return new class190(arg5, 3553, arg1, arg3, arg0, arg4, true);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lnf;IIIIIZ)V", line = 62)
    private class190(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field2555 = arg4;
        this.field2556 = arg5;
        if (this.field5204 == 34037) {
            this.field2554 = false;
            this.field2552 = (float) arg4;
            this.field2553 = (float) arg5;
        } else {
            this.field2552 = this.field2553 = 1.0F;
            this.field2554 = true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lnf;IIIIIIZ)V", line = 84)
    private class190(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2552 = (float) arg3 / (float) arg5;
        this.field2554 = false;
        this.field2556 = arg4;
        this.field2553 = (float) arg4 / (float) arg6;
        this.field2555 = arg3;
        this.method1271(false, false);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lnf;IIII[I)V", line = 98)
    private class190(class256 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2556 = arg2;
        this.field2555 = arg1;
        this.method1268(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field2553 = (float) arg2 / (float) arg4;
        this.field2554 = false;
        this.field2552 = (float) arg1 / (float) arg3;
        this.method1271(false, false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[IZBLnf;)Ldh;", line = 114)
    public static final class190 method1150(int arg0, int arg1, int[] arg2, boolean arg3, byte arg4, class256 arg5) {
        if (arg4 > -32) {
            return (class190) null;
        } else if (!arg5.field3720 && (!class192.method1154(true, arg1) || !class192.method1154(true, arg0))) {
            return arg5.field3670 ? new class190(arg5, 34037, arg1, arg0, arg3, arg2) : new class190(arg5, arg1, arg0, class139.method896(arg1, -87), class139.method896(arg0, -72), arg2);
        } else {
            return new class190(arg5, 3553, arg1, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lnf;IIIZ[I)V", line = 131)
    private class190(class256 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field2555 = arg2;
        if (this.field5204 == 34037) {
            this.field2553 = (float) arg3;
            this.field2554 = false;
            this.field2552 = (float) arg2;
        } else {
            this.field2554 = true;
            this.field2552 = this.field2553 = 1.0F;
        }
        this.field2556 = arg3;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lnf;IIIII[BI)V", line = 152)
    private class190(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2556 = arg3;
        this.field2555 = arg2;
        this.method1270(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field2553 = (float) arg3 / (float) arg5;
        this.field2552 = (float) arg2 / (float) arg4;
        this.field2554 = false;
        this.method1271(false, false);
    }
}
