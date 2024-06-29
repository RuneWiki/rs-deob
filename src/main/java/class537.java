import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class537 extends class245 implements class334 {

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    private int field7296;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "[Ldb;")
    public static class326[] field7303 = new class326[128];

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Lqq;")
    public static class476 field7293;

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lhl;Lkt;Lkq;II)V", line = 4)
    public class537(class529 arg0, class159 arg1, class594 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field7296 = arg4;
        this.field7288 = arg3;
        super.field3178.method2148(this, -118);
        OpenGL.glTexImage2Dub(super.field3184, 0, this.method1471(0), arg3, arg4, 0, class303.method1814(false, super.field3189), class557.method3153(super.field3179, (byte) 105), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lhl;Lkt;IIZ[FII)V", line = 16)
    public class537(class529 arg0, class159 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class594.field8281, arg2 * arg3, arg4);
        this.field7296 = arg3;
        this.field7288 = arg2;
        super.field3178.method2148(this, -115);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method1466(arg2, arg5, false, arg3, super.field3184);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field3184, 0, this.method1471(0), arg2, arg3, 0, class303.method1814(false, super.field3189), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lhl;Lkt;IIZ[BII)V", line = 36)
    public class537(class529 arg0, class159 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class594.field8277, arg2 * arg3, arg4);
        this.field7296 = arg3;
        this.field7288 = arg2;
        super.field3178.method2148(this, 50);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method1470(arg5, 54, arg3, arg2, super.field3184);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field3184, 0, this.method1471(0), arg2, arg3, 0, class303.method1814(false, super.field3189), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZI)V", line = 57)
    public final void method1694(boolean arg0, boolean arg1, int arg2) {
        super.field3178.method2148(this, -128);
        ++field7289;
        OpenGL.glTexParameteri(super.field3184, 10242, !arg0 ? 33071 : 10497);
        int var4 = 8 % ((arg2 - 17) / 36);
        OpenGL.glTexParameteri(super.field3184, 10243, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)I", line = 71)
    public final int method1690(int arg0) {
        if (arg0 != 12941) {
            return 59;
        } else {
            ++field7298;
            return this.field7288;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([FLkt;IIBIIII)V", line = 82)
    public final void method2957(float[] arg0, class159 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field3178.method2148(this, -111);
        ++field7290;
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Df(super.field3184, 0, arg5, arg7, arg3, arg2, class303.method1814(false, arg1), 5121, arg0, arg8);
        if (arg4 <= 94) {
            this.field7288 = 117;
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I", line = 101)
    public final int method1693(int arg0) {
        if (arg0 <= 109) {
            return -89;
        } else {
            ++field7300;
            return this.field7296;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lhl;IIZ[III)V", line = 114)
    public class537(class529 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class758.field10567, class594.field8277, arg1 * arg2, arg3);
        this.field7296 = arg2;
        this.field7288 = arg1;
        super.field3178.method2148(this, 69);
        if (arg3 && ~arg6 == -1 && ~arg5 == -1) {
            this.method1475(arg1, arg4, arg2, 526364520, super.field3184);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field3184, 0, 6408, this.field7288, this.field7296, 0, 32993, super.field3178.field7193, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Ljn;", line = 135)
    public static final class719 method2958(int arg0, int arg1, int arg2) {
        class624 var3 = class77.field947[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8728;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII[BLkt;I)V", line = 142)
    public final void method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class159 arg7, int arg8) {
        super.field3178.method2148(this, 124);
        if (arg5 == -26946) {
            ++field7302;
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg0);
            OpenGL.glTexSubImage2Dub(super.field3184, 0, arg8, arg3, arg2, arg4, class303.method1814(false, arg7), 5121, arg6, arg1);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IF)F", line = 158)
    public final float method1688(int arg0, float arg1) {
        ++field7297;
        return arg0 != -8473 ? -1.7685026F : arg1 / (float) this.field7296;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[IIIII)V", line = 169)
    public final void method1697(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7301;
        if (arg0 == 17779) {
            super.field3178.method2148(this, -119);
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexSubImage2Di(super.field3184, 0, arg4, arg1, arg7, arg2, 32993, super.field3178.field7193, arg3, arg5);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Z", line = 183)
    public final boolean method1696(int arg0) {
        ++field7299;
        if (arg0 >= -22) {
            field7303 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BF)F", line = 195)
    public final float method1692(byte arg0, float arg1) {
        int var3 = 43 / ((-5 - arg0) / 39);
        ++field7292;
        return arg1 / (float) this.field7288;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 205)
    public static final void method2959(boolean arg0) {
        class554.field7826.method1563(41);
        if (!arg0) {
            method2960(-50);
        }
        ++field7294;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBII[II)V", line = 218)
    public final void method1695(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6) {
        ++field7295;
        int[] var8 = new int[this.field7296 * this.field7288];
        super.field3178.method2148(this, 24);
        OpenGL.glGetTexImagei(super.field3184, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; var9 < arg3; ++var9) {
            class373.method2191(var8, (-1 - (-arg3 - arg6 - -var9)) * this.field7288, arg5, arg0 * var9 + arg1, arg0);
        }
        int var10 = -68 % ((arg2 - -48) / 59);
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V", line = 242)
    public static void method2960(int arg0) {
        field7303 = null;
        if (arg0 != 0) {
            method2959(false);
        }
        field7293 = null;
    }
}
