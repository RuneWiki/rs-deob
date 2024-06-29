import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class563 extends class394 implements class175 {

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    private int field7784;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    private int field7782;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)I")
    public final int method1199(int arg0) {
        int var2 = 61 / ((arg0 - 16) / 45);
        ++field7778;
        return this.field7784;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Z")
    public static final boolean method3264(int arg0, int arg1, int arg2) {
        ++field7781;
        if (arg2 != -1) {
            method3264(-97, 27, -26);
        }
        return ~(32768 & arg1) != -1;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lnv;Lpe;II[FII)V")
    public class563(class439 arg0, class636 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class748.field10388, arg2 * arg3, false);
        this.field7784 = arg2;
        this.field7782 = arg3;
        super.field5105.method2643(-2, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field5112, 0, this.method2311(-588507160), arg2, arg3, 0, method3265((byte) -126, super.field5099), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLpe;)I")
    public static final int method3265(byte arg0, class636 arg1) {
        if (arg0 != -126) {
            method3265((byte) 87, (class636) null);
        }
        ++field7788;
        if (class574.field7863 == arg1) {
            return 6407;
        } else if (class141.field1759 == arg1) {
            return 6408;
        } else if (class205.field2451 != arg1) {
            if (class677.field9284 == arg1) {
                return 6409;
            } else if (class216.field2549 == arg1) {
                return 6410;
            } else if (class308.field3821 == arg1) {
                return 6145;
            } else {
                throw new IllegalStateException();
            }
        } else {
            return 6406;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[BILpe;II)V")
    public final void method1195(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, class636 arg6, int arg7, int arg8) {
        super.field5105.method2643(-2, this);
        ++field7776;
        if (~arg5 == -1) {
            arg5 = arg7;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg5 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Dub(super.field5112, 0, arg1, arg0, arg7, arg8, method3265((byte) -126, arg6), 5121, arg4, arg3);
        if (~arg5 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg2 == -6201) {
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
    public final boolean method1192(int arg0) {
        if (arg0 >= -70) {
            return false;
        } else {
            ++field7780;
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BF)F")
    public final float method1200(byte arg0, float arg1) {
        int var3 = -70 % ((arg0 - -52) / 53);
        ++field7787;
        return arg1;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
    public final int method1197(int arg0) {
        ++field7779;
        if (arg0 != 7676) {
            this.field7784 = -24;
        }
        return this.field7782;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lnv;II[III)V")
    public class563(class439 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class141.field1759, class748.field10384, arg1 * arg2, false);
        this.field7782 = arg2;
        this.field7784 = arg1;
        super.field5105.method2643(-2, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field5112, 0, 6408, this.field7784, this.field7782, 0, 32993, super.field5105.field5891, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[IIBI)V")
    public final void method1194(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte arg6, int arg7) {
        super.field5105.method2643(-2, this);
        ++field7785;
        if (arg5 == 0) {
            arg5 = arg0;
        }
        if (arg0 != arg5) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        if (arg6 != -96) {
            field7774 = 35;
        }
        OpenGL.glTexSubImage2Di(super.field5112, 0, arg2, arg7, arg0, arg3, 32993, super.field5105.field5891, arg4, arg1);
        if (arg0 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[IBI)V")
    public final void method1193(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte arg5, int arg6) {
        ++field7783;
        int[] var8 = new int[this.field7784 * this.field7782];
        super.field5105.method2643(-2, this);
        OpenGL.glGetTexImagei(super.field5112, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~arg6 < ~var9; ++var9) {
            class211.method1332(var8, (arg6 - 1 + arg0 - var9) * this.field7784, arg4, arg2 - -(arg3 * var9), arg3);
        }
        if (arg5 < 50) {
            this.method1197(-73);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lnv;Lpe;II[BII)V")
    public class563(class439 arg0, class636 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class748.field10384, arg2 * arg3, false);
        this.field7782 = arg3;
        this.field7784 = arg2;
        super.field5105.method2643(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field5112, 0, this.method2311(-588507160), arg2, arg3, 0, method3265((byte) -126, super.field5099), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lnv;Lpe;Ldw;II)V")
    public class563(class439 arg0, class636 arg1, class748 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field7782 = arg4;
        this.field7784 = arg3;
        super.field5105.method2643(-2, this);
        OpenGL.glTexImage2Dub(super.field5112, 0, this.method2311(-588507160), arg3, arg4, 0, method3265((byte) -126, super.field5099), class468.method2809(super.field5118, 5120), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZB)V")
    public final void method1198(boolean arg0, boolean arg1, byte arg2) {
        ++field7777;
        int var4 = 86 % ((arg2 - -68) / 55);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IF)F")
    public final float method1196(int arg0, float arg1) {
        ++field7786;
        if (arg0 != -23865) {
            this.method1192(88);
        }
        return arg1;
    }
}
