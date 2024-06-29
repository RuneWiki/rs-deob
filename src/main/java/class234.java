import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class234 extends class58 {

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "F")
    public float field3111;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "F")
    public float field3110;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "Z")
    public boolean field3107;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lbf;IIII[I)V")
    private class234(class344 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field3109 = arg1;
        this.field3108 = arg2;
        this.method414(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field3111 = (float) arg2 / (float) arg4;
        this.field3110 = (float) arg1 / (float) arg3;
        this.field3107 = false;
        this.method415(false, false);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZILbf;[III)Lln;")
    public static final class234 method1306(boolean arg0, int arg1, class344 arg2, int[] arg3, int arg4, int arg5) {
        if (arg1 != -21262) {
            return (class234) null;
        } else if (!arg2.field4692 && (!class123.method761(true, arg4) || !class123.method761(true, arg5))) {
            return arg2.field4684 ? new class234(arg2, 34037, arg4, arg5, arg0, arg3) : new class234(arg2, arg4, arg5, class100.method616(arg4, true), class100.method616(arg5, true), arg3);
        } else {
            return new class234(arg2, 3553, arg4, arg5, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lbf;IIIIIIZ)V")
    private class234(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field3107 = false;
        this.field3111 = (float) arg4 / (float) arg6;
        this.field3110 = (float) arg3 / (float) arg5;
        this.field3108 = arg4;
        this.field3109 = arg3;
        this.method415(false, false);
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lbf;IIIZ[I)V")
    private class234(class344 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field3109 = arg2;
        if (this.field5342 == 34037) {
            this.field3111 = (float) arg3;
            this.field3110 = (float) arg2;
            this.field3107 = false;
        } else {
            this.field3107 = true;
            this.field3110 = this.field3111 = 1.0F;
        }
        this.field3108 = arg3;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lbf;IIIIIZ)V")
    private class234(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field3109 = arg4;
        this.field3108 = arg5;
        if (this.field5342 == 34037) {
            this.field3110 = (float) arg4;
            this.field3107 = false;
            this.field3111 = (float) arg5;
        } else {
            this.field3110 = this.field3111 = 1.0F;
            this.field3107 = true;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lbf;IIIIZ[BI)V")
    private class234(class344 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field3108 = arg4;
        if (this.field5342 == 34037) {
            this.field3111 = (float) arg4;
            this.field3110 = (float) arg3;
            this.field3107 = false;
        } else {
            this.field3110 = this.field3111 = 1.0F;
            this.field3107 = true;
        }
        this.field3109 = arg3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZILbf;[BIIII)Lln;")
    public static final class234 method1307(boolean arg0, int arg1, class344 arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 <= 116) {
            method1307(false, 5, (class344) null, (byte[]) null, -10, 55, -124, 91);
        }
        if (!arg2.field4692 && (!class123.method761(true, arg7) || !class123.method761(true, arg4))) {
            return arg2.field4684 ? new class234(arg2, 34037, arg5, arg7, arg4, arg0, arg3, arg1) : new class234(arg2, arg5, arg7, arg4, class100.method616(arg7, true), class100.method616(arg4, true), arg3, arg1);
        } else {
            return new class234(arg2, 3553, arg5, arg7, arg4, arg0, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIBLbf;)Lln;")
    public static final class234 method1308(int arg0, int arg1, int arg2, int arg3, byte arg4, class344 arg5) {
        if (arg4 != 88) {
            method1306(true, -125, (class344) null, (int[]) null, -41, -28);
        }
        if (!arg5.field4692 && (!class123.method761(true, arg2) || !class123.method761(true, arg3))) {
            return arg5.field4684 ? new class234(arg5, 34037, arg0, arg1, arg2, arg3, true) : new class234(arg5, arg0, arg1, arg2, arg3, class100.method616(arg2, true), class100.method616(arg3, true), true);
        } else {
            return new class234(arg5, 3553, arg0, arg1, arg2, arg3, true);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lbf;IIIII[BI)V")
    private class234(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3109 = arg2;
        this.field3108 = arg3;
        this.method412(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field3107 = false;
        this.field3110 = (float) arg2 / (float) arg4;
        this.field3111 = (float) arg3 / (float) arg5;
        this.method415(false, false);
    }
}
