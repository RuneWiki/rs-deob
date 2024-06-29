import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class173 extends class140 {

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "F")
    public float field2263;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "Z")
    public boolean field2262;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "F")
    public float field2260;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lih;I[BIZIII)Lns;", line = 6)
    public static final class173 method1059(class330 arg0, int arg1, byte[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int var8 = -17 % ((-arg7 - 69) / 45);
        if (!arg0.field4853 && (!class167.method1040(false, arg1) || !class167.method1040(false, arg6))) {
            return arg0.field4796 ? new class173(arg0, 34037, arg3, arg1, arg6, arg4, arg2, arg5) : new class173(arg0, arg3, arg1, arg6, class8.method64(1388313616, arg1), class8.method64(1388313616, arg6), arg2, arg5);
        } else {
            return new class173(arg0, 3553, arg3, arg1, arg6, arg4, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lih;IIIIIZ)V", line = 22)
    private class173(class330 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field2264 = arg4;
        if (this.field3156 == 34037) {
            this.field2263 = (float) arg5;
            this.field2262 = false;
            this.field2260 = (float) arg4;
        } else {
            this.field2260 = this.field2263 = 1.0F;
            this.field2262 = true;
        }
        this.field2261 = arg5;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILih;II[IZ)Lns;", line = 47)
    public static final class173 method1060(int arg0, class330 arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        int var6 = -82 / ((63 - arg3) / 51);
        if (!arg1.field4853 && (!class167.method1040(false, arg2) || !class167.method1040(false, arg0))) {
            return arg1.field4796 ? new class173(arg1, 34037, arg2, arg0, arg5, arg4) : new class173(arg1, arg2, arg0, class8.method64(1388313616, arg2), class8.method64(1388313616, arg0), arg4);
        } else {
            return new class173(arg1, 3553, arg2, arg0, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lih;IIIIZ[BI)V", line = 63)
    private class173(class330 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2261 = arg4;
        this.field2264 = arg3;
        if (this.field3156 == 34037) {
            this.field2260 = (float) arg3;
            this.field2262 = false;
            this.field2263 = (float) arg4;
        } else {
            this.field2262 = true;
            this.field2260 = this.field2263 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lih;IIIII[BI)V", line = 86)
    private class173(class330 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2264 = arg2;
        this.field2261 = arg3;
        this.method941(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field2262 = false;
        this.field2263 = (float) arg3 / (float) arg5;
        this.field2260 = (float) arg2 / (float) arg4;
        this.method944(false, false);
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lih;IIIZ[I)V", line = 101)
    private class173(class330 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field2264 = arg2;
        this.field2261 = arg3;
        if (this.field3156 == 34037) {
            this.field2260 = (float) arg2;
            this.field2262 = false;
            this.field2263 = (float) arg3;
        } else {
            this.field2262 = true;
            this.field2260 = this.field2263 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lih;IIII[I)V", line = 122)
    private class173(class330 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2264 = arg1;
        this.field2261 = arg2;
        this.method945(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field2263 = (float) arg2 / (float) arg4;
        this.field2262 = false;
        this.field2260 = (float) arg1 / (float) arg3;
        this.method944(false, false);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILih;IIIB)Lns;", line = 137)
    public static final class173 method1061(int arg0, class330 arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 116) {
            return (class173) null;
        } else if (!arg1.field4853 && (!class167.method1040(false, arg3) || !class167.method1040(false, arg0))) {
            return arg1.field4796 ? new class173(arg1, 34037, arg4, arg2, arg3, arg0, true) : new class173(arg1, arg4, arg2, arg3, arg0, class8.method64(1388313616, arg3), class8.method64(1388313616, arg0), true);
        } else {
            return new class173(arg1, 3553, arg4, arg2, arg3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lih;IIIIIIZ)V", line = 154)
    private class173(class330 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2264 = arg3;
        this.field2261 = arg4;
        this.field2260 = (float) arg3 / (float) arg5;
        this.field2263 = (float) arg4 / (float) arg6;
        this.field2262 = false;
        this.method944(false, false);
    }
}
