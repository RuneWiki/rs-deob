import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 extends class17 implements class29 {

    @OriginalMember(owner = "client!an", name = "L", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "I")
    public static int field349 = 13156520;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!an", name = "J", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "Ljava/lang/String;")
    public static String field345;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILos;II[BIIII)V")
    public final void method362(int arg0, class408 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field300.method2271(this, arg3 ^ 6440);
        ++field346;
        if (arg3 != 3348) {
            field345 = null;
        }
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg8);
        OpenGL.glTexSubImage2Dub(super.field292, 0, arg0, arg2, arg5, arg6, class250.method1782((byte) 80, arg1), 5121, arg4, arg7);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lbea;Los;IIZ[FII)V")
    public class22(class205 arg0, class408 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class134.field2201, arg2 * arg3, arg4);
        this.field350 = arg3;
        this.field339 = arg2;
        super.field300.method2271(this, 5180);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method253(arg5, 71, arg3, arg2, super.field292);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field292, 0, this.method248(10241), arg2, arg3, 0, class250.method1782((byte) 110, super.field285), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/io/File;I)[B")
    public static final byte[] method363(File arg0, int arg1) {
        if (arg1 < 83) {
            method370(-118, -80, -19);
        }
        ++field340;
        return class355.method2387((byte) -79, arg0, (int) arg0.length());
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZZB)V")
    public final void method364(boolean arg0, boolean arg1, byte arg2) {
        super.field300.method2271(this, 5180);
        ++field337;
        OpenGL.glTexParameteri(super.field292, 10242, arg0 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field292, 10243, !arg1 ? 33071 : 10497);
        int var4 = -112 % ((53 - arg2) / 47);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IF)F")
    public final float method365(int arg0, float arg1) {
        if (arg0 > -90) {
            this.field350 = -12;
        }
        ++field341;
        return arg1 / (float) this.field339;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Z")
    public final boolean method366(int arg0) {
        ++field348;
        if (arg0 != -4758) {
            this.method372(-2, 57, (int[]) null, 79, 32, -12, -85, 124);
        }
        return true;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lbea;Los;Lmg;II)V")
    public class22(class205 arg0, class408 arg1, class134 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field339 = arg3;
        this.field350 = arg4;
        super.field300.method2271(this, 5180);
        OpenGL.glTexImage2Dub(super.field292, 0, this.method248(10241), arg3, arg4, 0, class250.method1782((byte) 113, super.field285), class436.method2769(super.field298, -112), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BILos;I[FIIII)V")
    public final void method367(byte arg0, int arg1, class408 arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field300.method2271(this, 5180);
        if (arg0 != -76) {
            field349 = -62;
        }
        ++field343;
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Df(super.field292, 0, arg5, arg1, arg8, arg6, class250.method1782((byte) 119, arg2), 5121, arg4, arg3);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!an", name = "i", descriptor = "(I)V")
    public static void method368(int arg0) {
        field345 = null;
        if (arg0 < 42) {
            field345 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lbea;IIZ[III)V")
    public class22(class205 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class86.field1055, class134.field2197, arg1 * arg2, arg3);
        this.field350 = arg2;
        this.field339 = arg1;
        super.field300.method2271(this, 5180);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method251(arg4, super.field292, arg2, arg1, (byte) -3);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field292, 0, 6408, this.field339, this.field350, 0, 32993, super.field300.field3438, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lbea;Los;IIZ[BII)V")
    public class22(class205 arg0, class408 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class134.field2197, arg2 * arg3, arg4);
        this.field350 = arg3;
        this.field339 = arg2;
        super.field300.method2271(this, 5180);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && arg6 == 0) {
            this.method254(34841, arg2, super.field292, arg5, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field292, 0, this.method248(10241), arg2, arg3, 0, class250.method1782((byte) 120, super.field285), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
    public final int method369(int arg0) {
        ++field347;
        if (arg0 < 52) {
            method368(94);
        }
        return this.field350;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Z")
    public static final boolean method370(int arg0, int arg1, int arg2) {
        if (arg1 != 3314) {
            method363((File) null, 69);
        }
        ++field344;
        return class259.method1831(arg0, arg2, true) & class682.method3884(2048, arg0, arg2);
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)I")
    public final int method371(int arg0) {
        ++field342;
        if (arg0 >= -60) {
            method370(21, -114, 101);
        }
        return this.field339;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II[IIIIII)V")
    public final void method372(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field336;
        super.field300.method2271(this, 5180);
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Di(super.field292, 0, arg5, arg7, arg1, arg6, 32993, super.field300.field3438, arg2, arg3);
        OpenGL.glPixelStorei(3314, 0);
        if (arg0 != 13353) {
            this.field350 = -102;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(FB)F")
    public final float method373(float arg0, byte arg1) {
        ++field338;
        if (arg1 >= -59) {
            field349 = -89;
        }
        return arg0 / (float) this.field350;
    }
}
