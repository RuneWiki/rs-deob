import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class321 extends class696 implements class636 {

    @OriginalMember(owner = "client!nha", name = "C", descriptor = "I")
    private int field4562;

    @OriginalMember(owner = "client!nha", name = "A", descriptor = "I")
    private int field4560;

    @OriginalMember(owner = "client!nha", name = "J", descriptor = "F")
    public static float field4568 = 0.0F;

    @OriginalMember(owner = "client!nha", name = "M", descriptor = "[I")
    public static int[] field4571 = new int[13];

    @OriginalMember(owner = "client!nha", name = "w", descriptor = "Lnt;")
    public static class220 field4556 = new class220();

    @OriginalMember(owner = "client!nha", name = "x", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!nha", name = "y", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!nha", name = "B", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!nha", name = "D", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!nha", name = "E", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!nha", name = "F", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!nha", name = "G", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!nha", name = "H", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!nha", name = "K", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!nha", name = "L", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "([IIIBIII)V", line = 4)
    public final void method422(int[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field4565;
        if (arg3 != 110) {
            this.method434(-54, -42, -54, false, 20, -92, (int[]) null, -10);
        }
        int[] var8 = new int[this.field4562 * this.field4560];
        super.field9790.method2732(-85, this);
        OpenGL.glGetTexImagei(super.field9787, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; arg5 > var9; ++var9) {
            class622.method3596(var8, (arg4 + -1 + -var9 + arg5) * this.field4560, arg0, arg2 * var9 + arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Leea;II[III)V", line = 27)
    public class321(class132 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class282.field4019, class438.field6117, arg1 * arg2, false);
        this.field4562 = arg2;
        this.field4560 = arg1;
        super.field9790.method2732(-64, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field9787, 0, 6408, this.field4560, this.field4562, 0, 32993, super.field9790.field2094, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIILkca;Z[BI)V", line = 41)
    public final void method433(int arg0, int arg1, int arg2, int arg3, int arg4, class82 arg5, boolean arg6, byte[] arg7, int arg8) {
        super.field9790.method2732(-57, this);
        ++field4569;
        if (arg0 == 0) {
            arg0 = arg1;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field9787, 0, arg3, arg2, arg1, arg4, class491.method2955(arg5, arg6), 5121, arg7, arg8);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IF)F", line = 65)
    public final float method423(int arg0, float arg1) {
        if (arg0 != 31272) {
            return 0.25231707F;
        } else {
            ++field4563;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "(I)V", line = 77)
    public static void method2064(int arg0) {
        if (arg0 != 21755) {
            method2064(-56);
        }
        field4571 = null;
        field4556 = null;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIZII[II)V", line = 89)
    public final void method434(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, int arg7) {
        ++field4567;
        super.field9790.method2732(-102, this);
        if (arg4 == 0) {
            arg4 = arg5;
        }
        if (~arg4 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field9787, 0, arg1, arg2, arg5, arg0, 32993, super.field9790.field2094, arg6, arg7);
        if (arg4 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (!arg3) {
            this.method432(-0.85831684F, -85);
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Leea;Lkca;Lti;II)V", line = 112)
    public class321(class132 arg0, class82 arg1, class438 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field4562 = arg4;
        this.field4560 = arg3;
        super.field9790.method2732(-69, this);
        OpenGL.glTexImage2Dub(super.field9787, 0, this.method3910(0), arg3, arg4, 0, class491.method2955(super.field9780, false), class34.method218(255, super.field9791), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)Z", line = 123)
    public final boolean method428(int arg0) {
        if (arg0 != -12720) {
            field4571 = null;
        }
        ++field4559;
        return false;
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "(I)I", line = 135)
    public final int method429(int arg0) {
        ++field4570;
        if (arg0 < 94) {
            this.method427(true, (byte) 46, true);
        }
        return this.field4560;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(FI)F", line = 146)
    public final float method432(float arg0, int arg1) {
        ++field4564;
        if (arg1 != -12086) {
            field4556 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Leea;Lkca;II[FII)V", line = 163)
    public class321(class132 arg0, class82 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class438.field6121, arg2 * arg3, false);
        this.field4562 = arg3;
        this.field4560 = arg2;
        super.field9790.method2732(-58, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field9787, 0, this.method3910(0), arg2, arg3, 0, class491.method2955(super.field9780, false), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZBZ)V", line = 176)
    public final void method427(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 != 66) {
            this.method422((int[]) null, 42, -54, (byte) -96, -28, -102, -9);
        }
        ++field4566;
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Leea;Lkca;II[BII)V", line = 186)
    public class321(class132 arg0, class82 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class438.field6117, arg2 * arg3, false);
        this.field4560 = arg2;
        this.field4562 = arg3;
        super.field9790.method2732(-105, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field9787, 0, this.method3910(0), arg2, arg3, 0, class491.method2955(super.field9780, false), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)I", line = 205)
    public final int method426(boolean arg0) {
        ++field4561;
        if (!arg0) {
            this.method423(123, -0.681149F);
        }
        return this.field4562;
    }
}
