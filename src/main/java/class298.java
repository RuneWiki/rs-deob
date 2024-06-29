import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class298 extends class574 implements class134 {

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    private int field3722;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    private int field3717;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "Z")
    public static boolean field3721 = false;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "Lgk;")
    public static class616 field3718 = new class616();

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lmr;Lsq;IIZ[FII)V", line = 3)
    public class298(class221 arg0, class485 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class179.field2012, arg2 * arg3, arg4);
        this.field3722 = arg2;
        this.field3717 = arg3;
        super.field8143.method1997(127, this);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method3248(arg5, super.field8151, arg2, 0, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field8151, 0, this.method3244(112), arg2, arg3, 0, class181.method1102(super.field8155, (byte) 124), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(FI)F", line = 22)
    public final float method756(float arg0, int arg1) {
        if (arg1 != 5044) {
            this.method757(46, 46, (byte[]) null, -119, -93, -115, -21, (class485) null, -117);
        }
        ++field3710;
        return arg0 / (float) this.field3722;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lmr;Lsq;Lrt;II)V", line = 36)
    public class298(class221 arg0, class485 arg1, class179 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field3717 = arg4;
        this.field3722 = arg3;
        super.field8143.method1997(126, this);
        OpenGL.glTexImage2Dub(super.field8151, 0, this.method3244(-13), arg3, arg4, 0, class181.method1102(super.field8155, (byte) 114), class191.method1159(super.field8157, 112), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[BIIIILsq;I)V", line = 48)
    public final void method757(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, class485 arg7, int arg8) {
        super.field8143.method1997(127, this);
        if (arg8 == 13031) {
            ++field3716;
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg1);
            OpenGL.glTexSubImage2Dub(super.field8151, 0, arg3, arg0, arg6, arg4, class181.method1102(arg7, (byte) 96), 5121, arg2, arg5);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)I", line = 66)
    public static final int method1738(byte arg0, int arg1) {
        if (arg0 > -21) {
            method1738((byte) 18, -94);
        }
        ++field3709;
        return arg1 == 16711935 ? -1 : class672.method3714(arg1, (byte) 31);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lmr;IIZ[III)V", line = 81)
    public class298(class221 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class412.field5529, class179.field2008, arg1 * arg2, arg3);
        this.field3722 = arg1;
        this.field3717 = arg2;
        super.field8143.method1997(127, this);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method3245(13787, arg2, arg4, super.field8151, arg1);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field8151, 0, 6408, this.field3722, this.field3717, 0, 32993, super.field8143.field2739, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Z", line = 101)
    public final boolean method755(int arg0) {
        if (arg0 >= -72) {
            this.field3722 = 33;
        }
        ++field3720;
        return true;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII[IBII)V", line = 112)
    public final void method753(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte arg5, int arg6, int arg7) {
        super.field8143.method1997(127, this);
        ++field3714;
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Di(super.field8151, 0, arg7, arg3, arg1, arg6, 32993, super.field8143.field2739, arg4, arg2);
        OpenGL.glPixelStorei(3314, 0);
        int var9 = -46 / ((-63 - arg5) / 56);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 126)
    public static void method1739(byte arg0) {
        int var1 = 5 / ((80 - arg0) / 45);
        field3718 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)I", line = 137)
    public final int method754(int arg0) {
        ++field3719;
        if (arg0 != 7142) {
            this.method756(0.6985532F, 40);
        }
        return this.field3717;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZIZ)V", line = 148)
    public final void method759(boolean arg0, int arg1, boolean arg2) {
        if (arg1 == -19314) {
            super.field8143.method1997(arg1 ^ -19216, this);
            ++field3711;
            OpenGL.glTexParameteri(super.field8151, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field8151, 10243, !arg2 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lmr;Lsq;IIZ[BII)V", line = 161)
    public class298(class221 arg0, class485 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class179.field2008, arg2 * arg3, arg4);
        this.field3717 = arg3;
        this.field3722 = arg2;
        super.field8143.method1997(127, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method3242(arg2, arg5, arg3, 22489, super.field8151);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field8151, 0, this.method3244(126), arg2, arg3, 0, class181.method1102(super.field8155, (byte) 79), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(FZ)F", line = 184)
    public final float method758(float arg0, boolean arg1) {
        ++field3713;
        return arg1 ? 0.08325838F : arg0 / (float) this.field3717;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I", line = 195)
    public final int method752(int arg0) {
        ++field3715;
        return arg0 <= 103 ? 59 : this.field3722;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILsq;I[FIIII)V", line = 207)
    public final void method1740(int arg0, int arg1, class485 arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3712;
        super.field8143.method1997(127, this);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Df(super.field8151, 0, arg1, arg8, arg7, arg3, class181.method1102(arg2, (byte) 107), 5121, arg4, arg6);
        if (arg5 != -28819) {
            this.method757(-2, 47, (byte[]) null, 92, 52, 90, -96, (class485) null, 49);
        }
        OpenGL.glPixelStorei(3314, 0);
    }
}
