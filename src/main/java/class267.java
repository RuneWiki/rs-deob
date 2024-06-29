import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class267 extends class178 implements class19 {

    @OriginalMember(owner = "client!wba", name = "J", descriptor = "I")
    private int field3909;

    @OriginalMember(owner = "client!wba", name = "I", descriptor = "I")
    private int field3908;

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!wba", name = "G", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!wba", name = "K", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!wba", name = "L", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!wba", name = "M", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!wba", name = "N", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!wba", name = "O", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!wba", name = "P", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "Ld;")
    public static class270 field3902;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(III[FIILiv;II)V", line = 3)
    public final void method1816(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, class25 arg6, int arg7, int arg8) {
        ++field3903;
        super.field2431.method1458(399403340, this);
        OpenGL.glPixelStorei(3314, arg8);
        OpenGL.glTexSubImage2Df(super.field2445, 0, arg7, arg0, arg4, arg2, class71.method547(arg6, -8807), arg5, arg3, arg1);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)I", line = 14)
    public final int method95(byte arg0) {
        if (arg0 > -36) {
            this.method97(23, -0.08007599F);
        }
        ++field3913;
        return this.field3908;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)Z", line = 25)
    public final boolean method93(int arg0) {
        ++field3915;
        if (arg0 < 110) {
            method1817(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(III[IIII)V", line = 36)
    public final void method98(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
        ++field3912;
        int[] var8 = new int[this.field3909 * this.field3908];
        super.field2431.method1458(399403340, this);
        OpenGL.glGetTexImagei(super.field2445, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~var9 > ~arg1; ++var9) {
            class245.method1647(var8, (arg0 + arg1 + -1 - var9) * this.field3908, arg3, arg5 * var9 + arg2, arg5);
        }
        if (arg4 != 4549) {
            this.field3908 = 71;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(FI)F", line = 60)
    public final float method96(float arg0, int arg1) {
        if (arg1 != -21696) {
            return -0.8344767F;
        } else {
            ++field3907;
            return arg0 / (float) this.field3908;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V", line = 72)
    public static void method1817(boolean arg0) {
        field3902 = null;
        if (arg0) {
            field3902 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIILiv;[BIIZI)V", line = 84)
    public final void method99(int arg0, int arg1, int arg2, class25 arg3, byte[] arg4, int arg5, int arg6, boolean arg7, int arg8) {
        super.field2431.method1458(399403340, this);
        ++field3906;
        OpenGL.glPixelStorei(3317, 1);
        if (arg7) {
            OpenGL.glPixelStorei(3314, arg1);
            OpenGL.glTexSubImage2Dub(super.field2445, 0, arg0, arg5, arg2, arg8, class71.method547(arg3, -8807), 5121, arg4, arg6);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)I", line = 101)
    public final int method94(int arg0) {
        ++field3911;
        if (arg0 != 16949) {
            this.method94(-48);
        }
        return this.field3909;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZZI)V", line = 115)
    public final void method100(boolean arg0, boolean arg1, int arg2) {
        ++field3904;
        super.field2431.method1458(399403340, this);
        if (arg2 > 40) {
            OpenGL.glTexParameteri(super.field2445, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field2445, 10243, arg0 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lhj;Liv;Ljt;II)V", line = 128)
    public class267(class47 arg0, class25 arg1, class38 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field3909 = arg4;
        this.field3908 = arg3;
        super.field2431.method1458(399403340, this);
        OpenGL.glTexImage2Dub(super.field2445, 0, this.method1122(114), arg3, arg4, 0, class71.method547(super.field2442, -8807), class466.method2849(super.field2430, -11595), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lhj;IIZ[III)V", line = 140)
    public class267(class47 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class623.field8394, class38.field472, arg1 * arg2, arg3);
        this.field3909 = arg2;
        this.field3908 = arg1;
        super.field2431.method1458(399403340, this);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method1123(true, arg2, arg1, super.field2445, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field2445, 0, 6408, this.field3908, this.field3909, 0, 32993, super.field2431.field716, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IF)F", line = 161)
    public final float method97(int arg0, float arg1) {
        ++field3914;
        if (arg0 != -28409) {
            this.method94(-96);
        }
        return arg1 / (float) this.field3909;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(II[IIIIII)V", line = 172)
    public final void method101(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3910;
        super.field2431.method1458(399403340, this);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Di(super.field2445, 0, arg7, arg4, arg6, arg1, 32993, super.field2431.field716, arg2, arg5);
        OpenGL.glPixelStorei(3314, 0);
        if (arg3 != -28425) {
            this.method94(-93);
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lhj;Liv;IIZ[FII)V", line = 186)
    public class267(class47 arg0, class25 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class38.field476, arg2 * arg3, arg4);
        this.field3908 = arg2;
        this.field3909 = arg3;
        super.field2431.method1458(399403340, this);
        if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method1126(arg5, arg3, super.field2445, arg2, 255);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field2445, 0, this.method1122(115), arg2, arg3, 0, class71.method547(super.field2442, -8807), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lhj;Liv;IIZ[BII)V", line = 207)
    public class267(class47 arg0, class25 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class38.field472, arg2 * arg3, arg4);
        this.field3909 = arg3;
        this.field3908 = arg2;
        super.field2431.method1458(399403340, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method1116(arg5, super.field2445, arg2, arg3, 0);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field2445, 0, this.method1122(122), arg2, arg3, 0, class71.method547(super.field2442, -8807), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }
}
