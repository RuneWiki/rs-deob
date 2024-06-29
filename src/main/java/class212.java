import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class212 extends class48 implements class297 {

    @OriginalMember(owner = "client!su", name = "I", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!su", name = "F", descriptor = "I")
    private int field3110;

    @OriginalMember(owner = "client!su", name = "A", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!su", name = "B", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!su", name = "C", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!su", name = "E", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!su", name = "G", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!su", name = "H", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!su", name = "J", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!su", name = "K", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!su", name = "L", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Llaa;Lqda;Lns;II)V")
    public class212(class122 arg0, class105 arg1, class408 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field3113 = arg4;
        this.field3110 = arg3;
        super.field602.method823(this, -8423);
        OpenGL.glTexImage2Dub(super.field618, 0, this.method342(true), arg3, arg4, 0, class711.method3993(super.field626, true), class53.method367(5126, super.field623), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IZZ)V")
    public final void method595(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 1645) {
            this.field3110 = 45;
        }
        ++field3112;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)I")
    public final int method598(byte arg0) {
        ++field3106;
        if (arg0 != 111) {
            this.field3113 = -107;
        }
        return this.field3113;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII[IIB)V")
    public final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, byte arg7) {
        super.field602.method823(this, -8423);
        ++field3109;
        if (~arg1 == -1) {
            arg1 = arg4;
        }
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Di(super.field618, 0, arg2, arg0, arg4, arg6, 32993, super.field602.field2046, arg5, arg3);
        if (arg7 < 57) {
            this.field3110 = 0;
        }
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II[IIIII)V")
    public final void method594(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 12679) {
            this.field3113 = 122;
        }
        ++field3108;
        int[] var8 = new int[this.field3113 * this.field3110];
        super.field602.method823(this, -8423);
        OpenGL.glGetTexImagei(super.field618, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; arg1 > var9; ++var9) {
            class335.method2016(var8, (arg3 - -arg1 - 1 + -var9) * this.field3110, arg2, arg4 - -(arg6 * var9), arg6);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILqda;IBIIII[B)V")
    public final void method593(int arg0, class105 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (~arg0 == -1) {
            arg0 = arg2;
        }
        ++field3111;
        if (arg3 >= -114) {
            this.field3110 = 35;
        }
        super.field602.method823(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field618, 0, arg5, arg7, arg2, arg6, class711.method3993(arg1, true), 5121, arg8, arg4);
        if (arg0 != arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Llaa;Lqda;II[BII)V")
    public class212(class122 arg0, class105 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class408.field5668, arg2 * arg3, false);
        this.field3110 = arg2;
        this.field3113 = arg3;
        super.field602.method823(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field618, 0, this.method342(true), arg2, arg3, 0, class711.method3993(super.field626, true), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IF)F")
    public final float method591(int arg0, float arg1) {
        ++field3115;
        if (arg0 != -2092) {
            this.field3113 = -86;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(B)Z")
    public final boolean method599(byte arg0) {
        ++field3116;
        int var2 = 36 % ((48 - arg0) / 53);
        return false;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Llaa;Lqda;II[FII)V")
    public class212(class122 arg0, class105 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class408.field5672, arg2 * arg3, false);
        this.field3110 = arg2;
        this.field3113 = arg3;
        super.field602.method823(this, -8423);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field618, 0, this.method342(true), arg2, arg3, 0, class711.method3993(super.field626, true), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)I")
    public final int method592(byte arg0) {
        int var2 = 15 % ((60 - arg0) / 54);
        ++field3114;
        return this.field3110;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(FI)F")
    public final float method597(float arg0, int arg1) {
        ++field3107;
        int var3 = 97 / ((arg1 - -25) / 45);
        return arg0;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Llaa;II[III)V")
    public class212(class122 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class315.field4498, class408.field5668, arg1 * arg2, false);
        this.field3113 = arg2;
        this.field3110 = arg1;
        super.field602.method823(this, -8423);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field618, 0, 6408, this.field3110, this.field3113, 0, 32993, super.field602.field2046, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }
}
