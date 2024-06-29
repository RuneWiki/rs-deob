import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class662 extends class724 implements class471 {

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    private int field8643;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    private int field8637;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public static int field8646 = -1;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "[Lpu;")
    public static class772[] field8639;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZI)Z", line = 4)
    public static final boolean method3605(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method3606(64);
        }
        ++field8636;
        if (!(class120.method715(arg2, arg0, -126) | (65536 & arg0) != 0) && !class151.method862((byte) 121, arg0, arg2)) {
            return (55 & arg2) == 0 && class92.method554(arg0, (byte) 30, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Z", line = 19)
    public final boolean method1132(int arg0) {
        ++field8641;
        if (arg0 != 30365) {
            this.method1135((int[]) null, -66, -39, 39, 89, 56, -94);
        }
        return true;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I", line = 33)
    public final int method1127(int arg0) {
        ++field8645;
        int var2 = 34 / ((-4 - arg0) / 38);
        return this.field8643;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILtn;IIBI[BII)V", line = 45)
    public final void method1126(int arg0, class749 arg1, int arg2, int arg3, byte arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        super.field9498.method3756(10, this);
        ++field8648;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg2);
        int var10 = -121 % ((arg4 - 50) / 34);
        OpenGL.glTexSubImage2Dub(super.field9516, 0, arg7, arg3, arg8, arg5, class735.method3999((byte) -85, arg1), 5121, arg6, arg0);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljc;IIZ[III)V", line = 60)
    public class662(class179 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class417.field5505, class73.field990, arg1 * arg2, arg3);
        this.field8643 = arg1;
        this.field8637 = arg2;
        super.field9498.method3756(10, this);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method3874(arg2, -126, super.field9516, arg1, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field9516, 0, 6408, this.field8643, this.field8637, 0, 32993, super.field9498.field2454, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljc;Ltn;Lds;II)V", line = 79)
    public class662(class179 arg0, class749 arg1, class73 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field8643 = arg3;
        this.field8637 = arg4;
        super.field9498.method3756(10, this);
        OpenGL.glTexImage2Dub(super.field9516, 0, this.method3878(255), arg3, arg4, 0, class735.method3999((byte) -85, super.field9499), class168.method1066((byte) 124, super.field9517), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V", line = 91)
    public static void method3606(int arg0) {
        if (arg0 == 0) {
            field8639 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z[IIIIIII)V", line = 101)
    public final void method1124(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field8632;
        super.field9498.method3756(10, this);
        OpenGL.glPixelStorei(3314, arg7);
        if (!arg0) {
            this.method1126(-102, (class749) null, -40, 40, (byte) 121, 46, (byte[]) null, 9, -31);
        }
        OpenGL.glTexSubImage2Di(super.field9516, 0, arg2, arg4, arg5, arg3, 32993, super.field9498.field2454, arg1, arg6);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZF)F", line = 116)
    public final float method1125(boolean arg0, float arg1) {
        ++field8634;
        return !arg0 ? 0.6612861F : arg1 / (float) this.field8643;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZI)V", line = 127)
    public final void method1131(boolean arg0, boolean arg1, int arg2) {
        super.field9498.method3756(10, this);
        ++field8635;
        if (arg2 > 37) {
            OpenGL.glTexParameteri(super.field9516, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field9516, 10243, !arg1 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IF)F", line = 140)
    public final float method1129(int arg0, float arg1) {
        if (arg0 >= -116) {
            this.method1124(true, (int[]) null, -36, 52, 12, -23, 93, -10);
        }
        ++field8644;
        return arg1 / (float) this.field8637;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([IIIIIII)V", line = 157)
    public final void method1135(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8633;
        int[] var8 = new int[this.field8643 * this.field8637];
        super.field9498.method3756(10, this);
        int var9 = 61 / ((arg5 - 40) / 38);
        OpenGL.glGetTexImagei(super.field9516, 0, 32993, 5121, var8, 0);
        for (int var10 = 0; arg4 > var10; ++var10) {
            class642.method3475(var8, (-var10 + -1 + arg4 + arg3) * this.field8643, arg0, arg6 * var10 + arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I", line = 180)
    public final int method1133(int arg0) {
        if (arg0 != 28215) {
            field8646 = 94;
        }
        ++field8642;
        return this.field8637;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([FLtn;IIIIIII)V", line = 196)
    public final void method3607(float[] arg0, class749 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field9498.method3756(10, this);
        ++field8640;
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Df(super.field9516, 0, arg5, arg8, arg2, arg7, class735.method3999((byte) -85, arg1), arg4, arg0, arg3);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljc;Ltn;IIZ[FII)V", line = 207)
    public class662(class179 arg0, class749 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class73.field994, arg2 * arg3, arg4);
        this.field8637 = arg3;
        this.field8643 = arg2;
        super.field9498.method3756(10, this);
        if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method3879(arg3, -32722, arg5, super.field9516, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field9516, 0, this.method3878(255), arg2, arg3, 0, class735.method3999((byte) -85, super.field9499), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljc;Ltn;IIZ[BII)V", line = 226)
    public class662(class179 arg0, class749 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class73.field990, arg2 * arg3, arg4);
        this.field8643 = arg2;
        this.field8637 = arg3;
        super.field9498.method3756(10, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method3880(arg5, arg3, (byte) 76, arg2, super.field9516);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field9516, 0, this.method3878(255), arg2, arg3, 0, class735.method3999((byte) -85, super.field9499), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBZ)Lwm;", line = 248)
    public static final class30 method3608(int arg0, int arg1, byte arg2, boolean arg3) {
        ++field8647;
        class310 var4 = null;
        if (class358.field4374 != null) {
            var4 = new class310(arg0, class358.field4374, class422.field5559[arg0], 1000000);
        }
        class253.field3439[arg0] = class198.field2762.method2121(arg0, class40.field463, -5, var4);
        class253.field3439[arg0].method3202((byte) 0);
        if (arg2 >= -18) {
            method3606(-22);
        }
        return new class30(class253.field3439[arg0], arg3, arg1);
    }
}
