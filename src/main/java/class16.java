import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class16 extends class89 {

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Z")
    public boolean field253;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "F")
    public float field256;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "F")
    public float field254;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lks;IIIIIZ)V", line = 4)
    private class16(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field257 = arg4;
        this.field255 = arg5;
        if (this.field2878 == 34037) {
            this.field253 = false;
            this.field256 = (float) arg4;
            this.field254 = (float) arg5;
        } else {
            this.field256 = this.field254 = 1.0F;
            this.field253 = true;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIILks;)Lmf;", line = 26)
    public static final class16 method219(int arg0, int arg1, int arg2, int arg3, int arg4, class173 arg5) {
        if (arg3 != 34037) {
            return (class16) null;
        } else if (!arg5.field2335 && (!class104.method709(true, arg2) || !class104.method709(true, arg0))) {
            return arg5.field2359 ? new class16(arg5, 34037, arg4, arg1, arg2, arg0, true) : new class16(arg5, arg4, arg1, arg2, arg0, class289.method1938((byte) 89, arg2), class289.method1938((byte) 88, arg0), true);
        } else {
            return new class16(arg5, 3553, arg4, arg1, arg2, arg0, true);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lks;IIIII[BI)V", line = 43)
    private class16(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field255 = arg3;
        this.field257 = arg2;
        this.method597(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field253 = false;
        this.field256 = (float) arg2 / (float) arg4;
        this.field254 = (float) arg3 / (float) arg5;
        this.method599(false, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILks;IIZ[B)Lmf;", line = 60)
    public static final class16 method220(int arg0, int arg1, int arg2, class173 arg3, int arg4, int arg5, boolean arg6, byte[] arg7) {
        if (arg4 != 34037) {
            return (class16) null;
        } else if (!arg3.field2335 && (!class104.method709(true, arg5) || !class104.method709(true, arg2))) {
            return arg3.field2359 ? new class16(arg3, 34037, arg1, arg5, arg2, arg6, arg7, arg0) : new class16(arg3, arg1, arg5, arg2, class289.method1938((byte) 46, arg5), class289.method1938((byte) 80, arg2), arg7, arg0);
        } else {
            return new class16(arg3, 3553, arg1, arg5, arg2, arg6, arg7, arg0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lks;IIIIZ[BI)V", line = 78)
    private class16(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field255 = arg4;
        this.field257 = arg3;
        if (this.field2878 == 34037) {
            this.field253 = false;
            this.field254 = (float) arg4;
            this.field256 = (float) arg3;
        } else {
            this.field253 = true;
            this.field256 = this.field254 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lks;IIIZ[I)V", line = 99)
    private class16(class173 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field255 = arg3;
        if (this.field2878 == 34037) {
            this.field253 = false;
            this.field256 = (float) arg2;
            this.field254 = (float) arg3;
        } else {
            this.field256 = this.field254 = 1.0F;
            this.field253 = true;
        }
        this.field257 = arg2;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lks;IIIIIIZ)V", line = 122)
    private class16(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field257 = arg3;
        this.field255 = arg4;
        this.field256 = (float) arg3 / (float) arg5;
        this.field254 = (float) arg4 / (float) arg6;
        this.field253 = false;
        this.method599(false, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z[IIILks;I)Lmf;", line = 136)
    public static final class16 method221(boolean arg0, int[] arg1, int arg2, int arg3, class173 arg4, int arg5) {
        if (arg3 != 0) {
            return (class16) null;
        } else if (!arg4.field2335 && (!class104.method709(true, arg2) || !class104.method709(true, arg5))) {
            return arg4.field2359 ? new class16(arg4, 34037, arg2, arg5, arg0, arg1) : new class16(arg4, arg2, arg5, class289.method1938((byte) 115, arg2), class289.method1938((byte) 39, arg5), arg1);
        } else {
            return new class16(arg4, 3553, arg2, arg5, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lks;IIII[I)V", line = 153)
    private class16(class173 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field257 = arg1;
        this.field255 = arg2;
        this.method598(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field254 = (float) arg2 / (float) arg4;
        this.field253 = false;
        this.field256 = (float) arg1 / (float) arg3;
        this.method599(false, false);
    }
}
