import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class87 extends class37 implements class358 {

    @OriginalMember(owner = "client!iia", name = "D", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!iia", name = "B", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "client!iia", name = "H", descriptor = "Ldh;")
    public static class320 field912 = new class320(49, 6);

    @OriginalMember(owner = "client!iia", name = "C", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!iia", name = "E", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!iia", name = "F", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!iia", name = "G", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!iia", name = "I", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!iia", name = "J", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!iia", name = "K", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!iia", name = "L", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!iia", name = "N", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!iia", name = "M", descriptor = "[Lnk;")
    public static class715[] field917;

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lai;Lwd;II[FII)V")
    public class87(class597 arg0, class272 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class687.field9701, arg2 * arg3, false);
        this.field908 = arg2;
        this.field906 = arg3;
        super.field417.method2207((byte) -61, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field416, 0, this.method173(true), arg2, arg3, 0, class325.method1935(84, super.field403), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lai;Lwd;II[BII)V")
    public class87(class597 arg0, class272 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class687.field9697, arg2 * arg3, false);
        this.field908 = arg2;
        this.field906 = arg3;
        super.field417.method2207((byte) -61, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field416, 0, this.method173(true), arg2, arg3, 0, class325.method1935(126, super.field403), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(FI)F")
    public final float method599(float arg0, int arg1) {
        ++field916;
        int var3 = -40 % ((arg1 - -41) / 47);
        return arg0;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)Z")
    public final boolean method600(byte arg0) {
        ++field911;
        return arg0 > -113 ? false : false;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIB[BIIILwd;I)V")
    public final void method601(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, class272 arg7, int arg8) {
        super.field417.method2207((byte) -61, this);
        ++field918;
        if (arg5 == 0) {
            arg5 = arg1;
        }
        OpenGL.glPixelStorei(3317, 1);
        int var10 = -95 / ((-60 - arg2) / 47);
        if (~arg1 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Dub(super.field416, 0, arg4, arg8, arg1, arg0, class325.method1935(60, arg7), 5121, arg3, arg6);
        if (arg1 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lai;II[III)V")
    public class87(class597 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class102.field1058, class687.field9697, arg1 * arg2, false);
        this.field908 = arg1;
        this.field906 = arg2;
        super.field417.method2207((byte) -61, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field416, 0, 6408, this.field908, this.field906, 0, 32993, super.field417.field8506, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "(I)V")
    public static void method602(int arg0) {
        field912 = null;
        if (arg0 < 66) {
            method602(-117);
        }
        field917 = null;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)I")
    public final int method603(boolean arg0) {
        if (!arg0) {
            this.method605(-46, -48, 57, 89, (int[]) null, 91, false, -98);
        }
        ++field910;
        return this.field906;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZZB)V")
    public final void method604(boolean arg0, boolean arg1, byte arg2) {
        ++field914;
        if (arg2 != -43) {
            field917 = null;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIII[IIZI)V")
    public final void method605(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7) {
        super.field417.method2207((byte) -61, this);
        ++field909;
        if (arg2 == 0) {
            arg2 = arg1;
        }
        if (arg6) {
            this.field908 = -11;
        }
        if (arg1 != arg2) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field416, 0, arg5, arg3, arg1, arg7, 32993, super.field417.field8506, arg4, arg0);
        if (~arg1 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IF)F")
    public final float method606(int arg0, float arg1) {
        if (arg0 != 13050) {
            return 1.8327442F;
        } else {
            ++field913;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I[IIIIII)V")
    public final void method607(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field907;
        int[] var8 = new int[this.field908 * this.field906];
        if (arg6 != 2444) {
            field917 = null;
        }
        super.field417.method2207((byte) -61, this);
        OpenGL.glGetTexImagei(super.field416, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~arg3 < ~var9; ++var9) {
            class143.method891(var8, (arg3 + arg4 + -1 + -var9) * this.field908, arg1, arg2 * var9 + arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lai;Lwd;Ljm;II)V")
    public class87(class597 arg0, class272 arg1, class687 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field906 = arg4;
        this.field908 = arg3;
        super.field417.method2207((byte) -61, this);
        OpenGL.glTexImage2Dub(super.field416, 0, this.method173(true), arg3, arg4, 0, class325.method1935(81, super.field403), class352.method2082(super.field414, false), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)I")
    public final int method608(int arg0) {
        ++field915;
        return arg0 != -27620 ? 76 : this.field908;
    }
}
