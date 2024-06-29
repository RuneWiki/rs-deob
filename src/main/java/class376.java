import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class376 extends class664 implements class595 {

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field5408;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    private int field5400;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "[I")
    public static int[] field5407 = null;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lmc;Lnl;II[FII)V")
    public class376(class381 arg0, class50 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class680.field9668, arg2 * arg3, false);
        this.field5408 = arg3;
        this.field5400 = arg2;
        super.field9406.method1884(this, -2);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field9404, 0, this.method3678(-17641), arg2, arg3, 0, class54.method313(-97, super.field9405), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lmc;II[III)V")
    public class376(class381 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class420.field5862, class680.field9664, arg1 * arg2, false);
        this.field5400 = arg1;
        this.field5408 = arg2;
        super.field9406.method1884(this, -2);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field9404, 0, 6408, this.field5400, this.field5408, 0, 32993, super.field9406.field5546, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IF)F")
    public final float method168(int arg0, float arg1) {
        ++field5403;
        if (arg0 != 31688) {
            this.method170(-0.4677158F, 23);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I")
    public final int method166(int arg0) {
        if (arg0 != 8281) {
            return -105;
        } else {
            ++field5406;
            return this.field5408;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lmc;Lnl;Leea;II)V")
    public class376(class381 arg0, class50 arg1, class680 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field5400 = arg3;
        this.field5408 = arg4;
        super.field9406.method1884(this, -2);
        OpenGL.glTexImage2Dub(super.field9404, 0, this.method3678(-17641), arg3, arg4, 0, class54.method313(-116, super.field9405), class202.method1272((byte) 110, super.field9395), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(FI)F")
    public final float method170(float arg0, int arg1) {
        ++field5401;
        if (arg1 != -17968) {
            this.field5408 = 114;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V")
    public static void method2288(int arg0) {
        field5407 = null;
        if (arg0 > -62) {
            method2288(109);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZBZ)V")
    public final void method169(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 != -68) {
            this.field5408 = 74;
        }
        ++field5410;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lmc;Lnl;II[BII)V")
    public class376(class381 arg0, class50 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class680.field9664, arg2 * arg3, false);
        this.field5400 = arg2;
        this.field5408 = arg3;
        super.field9406.method1884(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field9404, 0, this.method3678(-17641), arg2, arg3, 0, class54.method313(-96, super.field9405), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII[IIII)V")
    public final void method171(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        super.field9406.method1884(this, arg1 ^ -27729);
        if (arg1 != 27729) {
            this.field5408 = -120;
        }
        ++field5404;
        if (~arg2 == -1) {
            arg2 = arg7;
        }
        if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field9404, 0, arg6, arg3, arg7, arg5, 32993, super.field9406.field5546, arg4, arg0);
        if (arg2 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)I")
    public final int method164(int arg0) {
        if (arg0 != 1994) {
            this.method168(-55, -0.78774935F);
        }
        ++field5402;
        return this.field5400;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lnl;IB[BIIIII)V")
    public final void method173(class50 arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5405;
        if (~arg7 == -1) {
            arg7 = arg6;
        }
        super.field9406.method1884(this, arg2 ^ 99);
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != -99) {
            this.method169(false, (byte) -52, false);
        }
        if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field9404, 0, arg4, arg5, arg6, arg1, class54.method313(arg2 + -27, arg0), 5121, arg3, arg8);
        if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)Z")
    public final boolean method167(int arg0) {
        if (arg0 != 30117) {
            return false;
        } else {
            ++field5409;
            return false;
        }
    }
}
