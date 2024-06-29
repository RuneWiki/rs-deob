import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class636 extends class203 implements class305 {

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    private int field9243;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
    private int field9237;

    @OriginalMember(owner = "client!eu", name = "L", descriptor = "I")
    public static int field9248 = 2;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZIZ)V")
    public final void method1052(boolean arg0, int arg1, boolean arg2) {
        ++field9245;
        super.field2672.method3344(29639, this);
        OpenGL.glTexParameteri(super.field2657, 10242, arg2 ? 10497 : 33071);
        if (arg1 != -25920) {
            this.method1053((byte) -50, -1.360748F);
        }
        OpenGL.glTexParameteri(super.field2657, 10243, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IBI[FIIILuda;I)V")
    public final void method3669(int arg0, byte arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, class509 arg7, int arg8) {
        super.field2672.method3344(29639, this);
        ++field9238;
        if (arg1 != 33) {
            this.method1051(-41, -0.06950229F);
        }
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Df(super.field2657, 0, arg4, arg8, arg0, arg5, class562.method3158((byte) 123, arg7), 5121, arg3, arg2);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)I")
    public final int method1050(byte arg0) {
        if (arg0 > -47) {
            this.field9237 = 16;
        }
        ++field9242;
        return this.field9237;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III[IIIII)V")
    public final void method1055(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 == 30519) {
            super.field2672.method3344(29639, this);
            ++field9246;
            OpenGL.glPixelStorei(3314, arg2);
            OpenGL.glTexSubImage2Di(super.field2657, 0, arg4, arg7, arg6, arg5, 32993, super.field2672.field6096, arg3, arg0);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)I")
    public final int method1059(int arg0) {
        if (arg0 != -23624) {
            this.field9237 = 22;
        }
        ++field9247;
        return this.field9243;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lph;IIZ[III)V")
    public class636(class442 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class532.field7430, class280.field3663, arg1 * arg2, arg3);
        this.field9243 = arg2;
        this.field9237 = arg1;
        super.field2672.method3344(29639, this);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method1300(false, arg4, arg2, arg1, super.field2657);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field2657, 0, 6408, this.field9237, this.field9243, 0, 32993, super.field2672.field6096, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lph;Luda;IIZ[FII)V")
    public class636(class442 arg0, class509 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class280.field3667, arg2 * arg3, arg4);
        this.field9243 = arg3;
        this.field9237 = arg2;
        super.field2672.method3344(29639, this);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method1299(arg3, super.field2657, true, arg2, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field2657, 0, this.method1301(34843), arg2, arg3, 0, class562.method3158((byte) 124, super.field2656), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BF)F")
    public final float method1053(byte arg0, float arg1) {
        ++field9241;
        if (arg0 != 3) {
            this.method1052(true, 78, true);
        }
        return arg1 / (float) this.field9237;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lph;Luda;Lsb;II)V")
    public class636(class442 arg0, class509 arg1, class280 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field9243 = arg4;
        this.field9237 = arg3;
        super.field2672.method3344(29639, this);
        OpenGL.glTexImage2Dub(super.field2657, 0, this.method1301(34843), arg3, arg4, 0, class562.method3158((byte) 127, super.field2656), class329.method2043(super.field2653, -116), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Z")
    public final boolean method1057(int arg0) {
        if (arg0 < 41) {
            return true;
        } else {
            ++field9240;
            return true;
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lph;Luda;IIZ[BII)V")
    public class636(class442 arg0, class509 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class280.field3663, arg2 * arg3, arg4);
        this.field9243 = arg3;
        this.field9237 = arg2;
        super.field2672.method3344(29639, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method1302(arg3, arg5, true, super.field2657, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field2657, 0, this.method1301(34843), arg2, arg3, 0, class562.method3158((byte) 124, super.field2656), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IF)F")
    public final float method1051(int arg0, float arg1) {
        ++field9244;
        if (arg0 != -3008) {
            this.method1057(26);
        }
        return arg1 / (float) this.field9243;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II[BIBLuda;III)V")
    public final void method1054(int arg0, int arg1, byte[] arg2, int arg3, byte arg4, class509 arg5, int arg6, int arg7, int arg8) {
        super.field2672.method3344(29639, this);
        if (arg4 != -21) {
            this.field9237 = 74;
        }
        ++field9239;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Dub(super.field2657, 0, arg0, arg8, arg3, arg7, class562.method3158((byte) 127, arg5), 5121, arg2, arg6);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
