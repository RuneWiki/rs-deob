import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class434 extends class46 {

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public int field6400;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public int field6399;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "F")
    public float field6398;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "F")
    public float field6397;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "Z")
    public boolean field6396;

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lcg;IIIZ[I)V")
    private class434(class393 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field6400 = arg2;
        this.field6399 = arg3;
        if (this.field4879 == 34037) {
            this.field6396 = false;
            this.field6397 = (float) arg2;
            this.field6398 = (float) arg3;
        } else {
            this.field6397 = this.field6398 = 1.0F;
            this.field6396 = true;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lcg;IIIIIIZ)V")
    private class434(class393 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field6398 = (float) arg4 / (float) arg6;
        this.field6399 = arg4;
        this.field6397 = (float) arg3 / (float) arg5;
        this.field6396 = false;
        this.field6400 = arg3;
        this.method258(false, false);
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lcg;IIII[I)V")
    private class434(class393 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field6399 = arg2;
        this.field6400 = arg1;
        this.method261(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field6397 = (float) arg1 / (float) arg3;
        this.field6396 = false;
        this.field6398 = (float) arg2 / (float) arg4;
        this.method258(false, false);
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lcg;IIIIIZ)V")
    private class434(class393 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field6400 = arg4;
        this.field6399 = arg5;
        if (this.field4879 == 34037) {
            this.field6397 = (float) arg4;
            this.field6398 = (float) arg5;
            this.field6396 = false;
        } else {
            this.field6396 = true;
            this.field6397 = this.field6398 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lcg;IIIIZ[BI)V")
    private class434(class393 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field6399 = arg4;
        this.field6400 = arg3;
        if (this.field4879 == 34037) {
            this.field6396 = false;
            this.field6398 = (float) arg4;
            this.field6397 = (float) arg3;
        } else {
            this.field6397 = this.field6398 = 1.0F;
            this.field6396 = true;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIZIZ[BLcg;)Lqq;")
    public static final class434 method2666(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, byte[] arg6, class393 arg7) {
        if (arg3) {
            return (class434) null;
        } else if (!arg7.field5881 && (!class146.method914((byte) -82, arg1) || !class146.method914((byte) -103, arg2))) {
            return arg7.field5855 ? new class434(arg7, 34037, arg0, arg1, arg2, arg5, arg6, arg4) : new class434(arg7, arg0, arg1, arg2, class196.method1174(73, arg1), class196.method1174(122, arg2), arg6, arg4);
        } else {
            return new class434(arg7, 3553, arg0, arg1, arg2, arg5, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lcg;IIIII[BI)V")
    private class434(class393 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6400 = arg2;
        this.field6399 = arg3;
        this.method259(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field6396 = false;
        this.field6398 = (float) arg3 / (float) arg5;
        this.field6397 = (float) arg2 / (float) arg4;
        this.method258(false, false);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILcg;II)Lqq;")
    public static final class434 method2667(int arg0, int arg1, int arg2, class393 arg3, int arg4, int arg5) {
        if (arg1 != 3553) {
            return (class434) null;
        } else if (!arg3.field5881 && (!class146.method914((byte) -114, arg2) || !class146.method914((byte) -104, arg5))) {
            return arg3.field5855 ? new class434(arg3, 34037, arg4, arg0, arg2, arg5, true) : new class434(arg3, arg4, arg0, arg2, arg5, class196.method1174(arg1 ^ 0xDD4, arg2), class196.method1174(58, arg5), true);
        } else {
            return new class434(arg3, 3553, arg4, arg0, arg2, arg5, true);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIZILcg;[I)Lqq;")
    public static final class434 method2668(int arg0, int arg1, boolean arg2, int arg3, class393 arg4, int[] arg5) {
        if (arg0 != 0) {
            return (class434) null;
        } else if (!arg4.field5881 && (!class146.method914((byte) -112, arg1) || !class146.method914((byte) -100, arg3))) {
            return arg4.field5855 ? new class434(arg4, 34037, arg1, arg3, arg2, arg5) : new class434(arg4, arg1, arg3, class196.method1174(66, arg1), class196.method1174(39, arg3), arg5);
        } else {
            return new class434(arg4, 3553, arg1, arg3, arg2, arg5);
        }
    }
}
