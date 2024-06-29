import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class736 extends class42 implements class320 {

    @OriginalMember(owner = "client!au", name = "H", descriptor = "I")
    private int field10260;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    private int field10251;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    public static int field10249;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field10252;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "I")
    public static int field10253;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "I")
    public static int field10254;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field10255;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public static int field10256;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    public static int field10257;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    public static int field10258;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    public static int field10259;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!au", name = "J", descriptor = "I")
    public static int field10262;

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lfha;Lbda;IIZ[BII)V", line = 3)
    public class736(class378 arg0, class505 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class309.field4305, arg2 * arg3, arg4);
        this.field10260 = arg2;
        this.field10251 = arg3;
        super.field506.method1663(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && arg6 == 0) {
            this.method281(-72, super.field508, arg5, arg2, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field508, 0, this.method284(-30), arg2, arg3, 0, class651.method3587((byte) -82, super.field516), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IZZ)V", line = 27)
    public final void method1317(int arg0, boolean arg1, boolean arg2) {
        ++field10261;
        super.field506.method1663(this, -2);
        OpenGL.glTexParameteri(super.field508, 10242, !arg1 ? 33071 : 10497);
        if (arg0 == 28970) {
            OpenGL.glTexParameteri(super.field508, 10243, arg2 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II[IIZIII)V", line = 42)
    public final void method1320(int arg0, int arg1, int[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            super.field506.method1663(this, -2);
            ++field10249;
            OpenGL.glPixelStorei(3314, arg1);
            OpenGL.glTexSubImage2Di(super.field508, 0, arg3, arg7, arg6, arg0, 32993, super.field506.field5412, arg2, arg5);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZF)F", line = 58)
    public final float method1318(boolean arg0, float arg1) {
        if (!arg0) {
            field10257 = 16;
        }
        ++field10259;
        return arg1 / (float) this.field10251;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)I", line = 71)
    public final int method1316(byte arg0) {
        if (arg0 > -2) {
            return 66;
        } else {
            ++field10253;
            return this.field10251;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BF)F", line = 82)
    public final float method1322(byte arg0, float arg1) {
        ++field10262;
        int var3 = 13 % ((arg0 - 64) / 52);
        return arg1 / (float) this.field10260;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIILbda;II[F)V", line = 93)
    public final void method4121(int arg0, int arg1, int arg2, int arg3, int arg4, class505 arg5, int arg6, int arg7, float[] arg8) {
        ++field10254;
        super.field506.method1663(this, -2);
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Df(super.field508, 0, arg3, arg2, arg1, arg6, class651.method3587((byte) -99, arg5), 5121, arg8, arg0);
        if (arg4 == 33071) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lfha;Lbda;Lwt;II)V", line = 107)
    public class736(class378 arg0, class505 arg1, class309 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field10251 = arg4;
        this.field10260 = arg3;
        super.field506.method1663(this, -2);
        OpenGL.glTexImage2Dub(super.field508, 0, this.method284(-88), arg3, arg4, 0, class651.method3587((byte) -123, super.field516), class366.method2339(57, super.field510), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lfha;IIZ[III)V", line = 118)
    public class736(class378 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class165.field2263, class309.field4305, arg1 * arg2, arg3);
        this.field10260 = arg1;
        this.field10251 = arg2;
        super.field506.method1663(this, -2);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method283(arg2, (byte) -2, super.field508, arg1, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field508, 0, 6408, this.field10260, this.field10251, 0, 32993, super.field506.field5412, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIII[I)V", line = 137)
    public final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        ++field10256;
        int[] var8 = new int[this.field10260 * this.field10251];
        super.field506.method1663(this, -2);
        OpenGL.glGetTexImagei(super.field508, 0, 32993, 5121, var8, 0);
        int var9 = -10 % ((16 - arg5) / 62);
        for (int var10 = 0; ~arg1 < ~var10; ++var10) {
            class255.method1688(var8, (arg4 - -arg1 + (-1 - var10)) * this.field10260, arg6, arg3 * var10 + arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lfha;Lbda;IIZ[FII)V", line = 161)
    public class736(class378 arg0, class505 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class309.field4309, arg2 * arg3, arg4);
        this.field10251 = arg3;
        this.field10260 = arg2;
        super.field506.method1663(this, -2);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method280(arg5, arg3, super.field508, arg2, false);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field508, 0, this.method284(-87), arg2, arg3, 0, class651.method3587((byte) -121, super.field516), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)Z", line = 180)
    public final boolean method1324(int arg0) {
        ++field10252;
        if (arg0 != -4111) {
            field10258 = -26;
        }
        return true;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)I", line = 194)
    public final int method1323(byte arg0) {
        if (arg0 >= -57) {
            field10257 = 69;
        }
        ++field10255;
        return this.field10260;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILbda;III[BZII)V", line = 205)
    public final void method1325(int arg0, class505 arg1, int arg2, int arg3, int arg4, byte[] arg5, boolean arg6, int arg7, int arg8) {
        ++field10250;
        if (!arg6) {
            this.field10260 = -63;
        }
        super.field506.method1663(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Dub(super.field508, 0, arg0, arg3, arg4, arg2, class651.method3587((byte) -81, arg1), 5121, arg5, arg8);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
