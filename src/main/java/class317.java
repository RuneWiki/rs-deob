import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class317 extends class231 {

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Z")
    public boolean field4301;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "F")
    public float field4298;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "F")
    public float field4302;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lhd;IIZZI[BI)Lmc;", line = 6)
    public static final class317 method2018(class17 arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, byte[] arg6, int arg7) {
        if (!arg3) {
            return (class317) null;
        } else if (!arg0.field329 && (!class404.method2480(arg5, -126) || !class404.method2480(arg2, -108))) {
            return arg0.field309 ? new class317(arg0, 34037, arg7, arg5, arg2, arg4, arg6, arg1) : new class317(arg0, arg7, arg5, arg2, class443.method2751(true, arg5), class443.method2751(true, arg2), arg6, arg1);
        } else {
            return new class317(arg0, 3553, arg7, arg5, arg2, arg4, arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lhd;IIIZ[I)V", line = 24)
    private class317(class17 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field4300 = arg2;
        this.field4299 = arg3;
        if (this.field26 == 34037) {
            this.field4301 = false;
            this.field4298 = (float) arg3;
            this.field4302 = (float) arg2;
        } else {
            this.field4302 = this.field4298 = 1.0F;
            this.field4301 = true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lhd;IIIIZ[BI)V", line = 46)
    private class317(class17 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (this.field26 == 34037) {
            this.field4301 = false;
            this.field4298 = (float) arg4;
            this.field4302 = (float) arg3;
        } else {
            this.field4302 = this.field4298 = 1.0F;
            this.field4301 = true;
        }
        this.field4300 = arg3;
        this.field4299 = arg4;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lhd;IIIII[BI)V", line = 67)
    private class317(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4300 = arg2;
        this.field4299 = arg3;
        this.method1544(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field4298 = (float) arg3 / (float) arg5;
        this.field4301 = false;
        this.field4302 = (float) arg2 / (float) arg4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILhd;Z[II)Lmc;", line = 83)
    public static final class317 method2019(byte arg0, int arg1, class17 arg2, boolean arg3, int[] arg4, int arg5) {
        if (arg0 != -104) {
            method2019((byte) -13, 93, (class17) null, false, (int[]) null, 34);
        }
        if (!arg2.field329 && (!class404.method2480(arg1, -102) || !class404.method2480(arg5, -123))) {
            return arg2.field309 ? new class317(arg2, 34037, arg1, arg5, arg3, arg4) : new class317(arg2, arg1, arg5, class443.method2751(true, arg1), class443.method2751(true, arg5), arg4);
        } else {
            return new class317(arg2, 3553, arg1, arg5, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lhd;IIII[I)V", line = 100)
    private class317(class17 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4300 = arg1;
        this.field4299 = arg2;
        this.method1542(0, 0, arg1, arg2, arg5, 0, arg1, true);
        this.field4301 = false;
        this.field4298 = (float) arg2 / (float) arg4;
        this.field4302 = (float) arg1 / (float) arg3;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lhd;IIIIIZ)V", line = 113)
    private class317(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (this.field26 == 34037) {
            this.field4298 = (float) arg5;
            this.field4301 = false;
            this.field4302 = (float) arg4;
        } else {
            this.field4301 = true;
            this.field4302 = this.field4298 = 1.0F;
        }
        this.field4300 = arg4;
        this.field4299 = arg5;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lhd;IIIII)Lmc;", line = 135)
    public static final class317 method2020(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 14123) {
            method2019((byte) -96, -47, (class17) null, false, (int[]) null, -71);
        }
        if (!arg0.field329 && (!class404.method2480(arg1, arg4 ^ 0xFFFFC8BC) || !class404.method2480(arg5, -111))) {
            return arg0.field309 ? new class317(arg0, 34037, arg3, arg2, arg1, arg5, true) : new class317(arg0, arg3, arg2, arg1, arg5, class443.method2751(true, arg1), class443.method2751(true, arg5), true);
        } else {
            return new class317(arg0, 3553, arg3, arg2, arg1, arg5, true);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lhd;IIIIIIZ)V", line = 154)
    private class317(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4298 = (float) arg4 / (float) arg6;
        this.field4301 = false;
        this.field4302 = (float) arg3 / (float) arg5;
        this.field4299 = arg4;
        this.field4300 = arg3;
    }
}
