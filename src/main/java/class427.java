import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class427 extends class659 implements class103 {

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    private int field6128;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    private int field6127;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
    public static int field6138 = -1;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "Ljn;")
    public static class668 field6135;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "[B")
    public static byte[] field6125;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZZI)V", line = 3)
    public final void method757(boolean arg0, boolean arg1, int arg2) {
        super.field9354.method2316((byte) 117, this);
        ++field6136;
        if (arg2 >= -58) {
            this.method763(111, -112, -68, 61, (int[]) null, 80, 96, -99);
        }
        OpenGL.glTexParameteri(super.field9349, 10242, !arg0 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field9349, 10243, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Ldda;Lfca;IIZ[BII)V", line = 17)
    public class427(class349 arg0, class75 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class279.field3793, arg2 * arg3, arg4);
        this.field6128 = arg3;
        this.field6127 = arg2;
        super.field9354.method2316((byte) 112, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method3739(arg2, arg3, 125, arg5, super.field9349);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field9349, 0, this.method3735(-8573), arg2, arg3, 0, class499.method2903(7491, super.field9372), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Ldda;Lfca;Lbv;II)V", line = 39)
    public class427(class349 arg0, class75 arg1, class279 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field6128 = arg4;
        this.field6127 = arg3;
        super.field9354.method2316((byte) 111, this);
        OpenGL.glTexImage2Dub(super.field9349, 0, this.method3735(-8573), arg3, arg4, 0, class499.method2903(7491, super.field9372), class533.method3131(-17966, super.field9369), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)I", line = 51)
    public final int method760(byte arg0) {
        if (arg0 >= -55) {
            field6135 = null;
        }
        ++field6132;
        return this.field6127;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z", line = 63)
    public final boolean method759(int arg0) {
        if (arg0 != 18483) {
            field6131 = -47;
        }
        ++field6129;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIIIIILfca;[B)V", line = 74)
    public final void method762(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class75 arg7, byte[] arg8) {
        if (arg0) {
            field6138 = -10;
        }
        ++field6133;
        super.field9354.method2316((byte) 118, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Dub(super.field9349, 0, arg1, arg5, arg4, arg3, class499.method2903(7491, arg7), 5121, arg8, arg6);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IF)F", line = 90)
    public final float method758(int arg0, float arg1) {
        ++field6134;
        if (arg0 != 12943) {
            field6138 = -38;
        }
        return arg1 / (float) this.field6127;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII[IIII)V", line = 104)
    public final void method763(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        ++field6126;
        super.field9354.method2316((byte) 125, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Di(super.field9349, 0, arg2, arg5, arg3, arg1, 32993, super.field9354.field4666, arg4, arg7);
        if (arg0 != -28726) {
            this.method759(-5);
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Ldda;Lfca;IIZ[FII)V", line = 118)
    public class427(class349 arg0, class75 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class279.field3797, arg2 * arg3, arg4);
        this.field6127 = arg2;
        this.field6128 = arg3;
        super.field9354.method2316((byte) 108, this);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method3738(arg3, arg5, super.field9349, false, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field9349, 0, this.method3735(-8573), arg2, arg3, 0, class499.method2903(7491, super.field9372), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)I", line = 137)
    public final int method764(boolean arg0) {
        ++field6137;
        if (arg0) {
            this.field6127 = -99;
        }
        return this.field6128;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(B)V", line = 148)
    public static void method2570(byte arg0) {
        field6135 = null;
        if (arg0 > 121) {
            field6125 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Ldda;IIZ[III)V", line = 161)
    public class427(class349 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class391.field5229, class279.field3793, arg1 * arg2, arg3);
        this.field6127 = arg1;
        this.field6128 = arg2;
        super.field9354.method2316((byte) 107, this);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method3737(arg1, arg2, true, super.field9349, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field9349, 0, 6408, this.field6127, this.field6128, 0, 32993, super.field9354.field4666, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(FI)F", line = 182)
    public final float method761(float arg0, int arg1) {
        ++field6124;
        if (arg1 != -22297) {
            this.field6128 = 8;
        }
        return arg0 / (float) this.field6128;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([FZIIIIILfca;I)V", line = 193)
    public final void method2571(float[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class75 arg7, int arg8) {
        super.field9354.method2316((byte) 120, this);
        ++field6130;
        if (!arg1) {
            OpenGL.glPixelStorei(3314, arg5);
            OpenGL.glTexSubImage2Df(super.field9349, 0, arg3, arg4, arg6, arg8, class499.method2903(7491, arg7), 5121, arg0, arg2);
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
