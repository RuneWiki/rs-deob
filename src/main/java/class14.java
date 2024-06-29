import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class14 extends class355 {

    @OriginalMember(owner = "client!l", name = "l", descriptor = "F")
    public float field195;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Z")
    public boolean field197;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "F")
    public float field198;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lsq;IIIIZ[BI)V", line = 3)
    private class14(class96 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (this.field4695 == 34037) {
            this.field195 = (float) arg3;
            this.field197 = false;
            this.field198 = (float) arg4;
        } else {
            this.field197 = true;
            this.field195 = this.field198 = 1.0F;
        }
        this.field196 = arg3;
        this.field199 = arg4;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lsq;IIII[I)V", line = 27)
    private class14(class96 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field199 = arg2;
        this.field196 = arg1;
        this.method2310(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field197 = false;
        this.field198 = (float) arg2 / (float) arg4;
        this.field195 = (float) arg1 / (float) arg3;
        this.method2309(false, false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lsq;[BIIIIIZ)Ll;", line = 43)
    public static final class14 method124(class96 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg2 != 3553) {
            return (class14) null;
        } else if (!arg0.field1229 && (!class326.method2169(-1, arg3) || !class326.method2169(-1, arg6))) {
            return arg0.field1231 ? new class14(arg0, 34037, arg4, arg3, arg6, arg7, arg1, arg5) : new class14(arg0, arg4, arg3, arg6, class111.method822((byte) 64, arg3), class111.method822((byte) 49, arg6), arg1, arg5);
        } else {
            return new class14(arg0, 3553, arg4, arg3, arg6, arg7, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBIILsq;I)Ll;", line = 62)
    public static final class14 method125(int arg0, byte arg1, int arg2, int arg3, class96 arg4, int arg5) {
        if (arg1 >= -9) {
            return (class14) null;
        } else if (!arg4.field1229 && (!class326.method2169(-1, arg5) || !class326.method2169(-1, arg0))) {
            return arg4.field1231 ? new class14(arg4, 34037, arg3, arg2, arg5, arg0, true) : new class14(arg4, arg3, arg2, arg5, arg0, class111.method822((byte) 64, arg5), class111.method822((byte) 36, arg0), true);
        } else {
            return new class14(arg4, 3553, arg3, arg2, arg5, arg0, true);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lsq;IIIII[BI)V", line = 79)
    private class14(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field199 = arg3;
        this.field196 = arg2;
        this.method2312(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field195 = (float) arg2 / (float) arg4;
        this.field198 = (float) arg3 / (float) arg5;
        this.field197 = false;
        this.method2309(false, false);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lsq;IIIIIIZ)V", line = 95)
    private class14(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field199 = arg4;
        this.field196 = arg3;
        this.field197 = false;
        this.field198 = (float) arg4 / (float) arg6;
        this.field195 = (float) arg3 / (float) arg5;
        this.method2309(false, false);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lsq;IIIZ[I)V", line = 108)
    private class14(class96 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field196 = arg2;
        this.field199 = arg3;
        if (this.field4695 == 34037) {
            this.field197 = false;
            this.field195 = (float) arg2;
            this.field198 = (float) arg3;
        } else {
            this.field195 = this.field198 = 1.0F;
            this.field197 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lsq;IIIIIZ)V", line = 130)
    private class14(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field196 = arg4;
        this.field199 = arg5;
        if (this.field4695 == 34037) {
            this.field198 = (float) arg5;
            this.field197 = false;
            this.field195 = (float) arg4;
        } else {
            this.field197 = true;
            this.field195 = this.field198 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[IZILsq;I)Ll;", line = 153)
    public static final class14 method126(int arg0, int[] arg1, boolean arg2, int arg3, class96 arg4, int arg5) {
        int var6 = 126 / ((23 - arg0) / 41);
        if (!arg4.field1229 && (!class326.method2169(-1, arg3) || !class326.method2169(-1, arg5))) {
            return arg4.field1231 ? new class14(arg4, 34037, arg3, arg5, arg2, arg1) : new class14(arg4, arg3, arg5, class111.method822((byte) 84, arg3), class111.method822((byte) 22, arg5), arg1);
        } else {
            return new class14(arg4, 3553, arg3, arg5, arg2, arg1);
        }
    }
}
