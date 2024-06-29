import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class47 extends class696 implements class636 {

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    private int field687;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "Ljava/lang/String;")
    public static String field696 = "";

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "Luf;")
    public static class445 field684 = new class445();

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!gp", name = "N", descriptor = "[Lkr;")
    public static class743[] field699;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([IIIBIII)V")
    public final void method422(int[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field694;
        int[] var8 = new int[this.field697 * this.field687];
        super.field9790.method2732(arg3 + -163, this);
        OpenGL.glGetTexImagei(super.field9787, 0, 32993, 5121, var8, 0);
        if (arg3 == 110) {
            for (int var9 = 0; ~arg5 < ~var9; ++var9) {
                class622.method3596(var8, (arg4 - (-arg5 + 1 - -var9)) * this.field687, arg0, arg2 * var9 + arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IF)F")
    public final float method423(int arg0, float arg1) {
        if (arg0 != 31272) {
            this.method427(true, (byte) 42, true);
        }
        ++field685;
        return arg1 / (float) this.field687;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[FILkca;IIIII)V")
    public final void method424(int arg0, float[] arg1, int arg2, class82 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field9790.method2732(arg2 + -85, this);
        ++field683;
        if (arg2 != -4) {
            this.method427(true, (byte) -127, true);
        }
        OpenGL.glPixelStorei(3314, arg8);
        OpenGL.glTexSubImage2Df(super.field9787, 0, arg5, arg0, arg4, arg6, class491.method2955(arg3, false), 5121, arg1, arg7);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
    public static final byte[] method425(Object arg0, byte arg1, boolean arg2) {
        int var3 = -122 % ((-57 - arg1) / 57);
        ++field692;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return !arg2 ? var4 : class570.method3328(0, var4);
        } else if (arg0 instanceof class230) {
            class230 var5 = (class230) arg0;
            return var5.method1578(-2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)I")
    public final int method426(boolean arg0) {
        ++field688;
        if (!arg0) {
            this.field697 = 92;
        }
        return this.field697;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZBZ)V")
    public final void method427(boolean arg0, byte arg1, boolean arg2) {
        ++field686;
        if (arg1 != 66) {
            this.field687 = -114;
        }
        super.field9790.method2732(arg1 + -161, this);
        OpenGL.glTexParameteri(super.field9787, 10242, !arg0 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field9787, 10243, !arg2 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Z")
    public final boolean method428(int arg0) {
        ++field693;
        if (arg0 != -12720) {
            field699 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)I")
    public final int method429(int arg0) {
        if (arg0 <= 94) {
            return -97;
        } else {
            ++field691;
            return this.field687;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZILdm;)V")
    public static final void method430(int arg0, boolean arg1, int arg2, class50 arg3) {
        if (arg3.field747 != 0) {
            if (arg3.field747 != 1) {
                if (~arg3.field747 == -3) {
                    arg3.field856 = -arg3.field855 + arg2 - arg3.field830;
                } else if (~arg3.field747 == -4) {
                    arg3.field856 = arg3.field855 * arg2 >> 14;
                } else if (~arg3.field747 == -5) {
                    arg3.field856 = (arg3.field855 * arg2 >> 14) + (arg2 - arg3.field830) / 2;
                } else {
                    arg3.field856 = -arg3.field830 + arg2 + -(arg3.field855 * arg2 >> 14);
                }
            } else {
                arg3.field856 = (-arg3.field830 + arg2) / 2 + arg3.field855;
            }
        } else {
            arg3.field856 = arg3.field855;
        }
        if (arg1) {
            if (~arg3.field793 != -1) {
                if (arg3.field793 != 1) {
                    if (~arg3.field793 == -3) {
                        arg3.field719 = -arg3.field783 + arg0 + -arg3.field712;
                    } else if (~arg3.field793 != -4) {
                        if (~arg3.field793 == -5) {
                            arg3.field719 = (arg3.field712 * arg0 >> 14) + (-arg3.field783 + arg0) / 2;
                        } else {
                            arg3.field719 = -arg3.field783 + arg0 + -(arg3.field712 * arg0 >> 14);
                        }
                    } else {
                        arg3.field719 = arg3.field712 * arg0 >> 14;
                    }
                } else {
                    arg3.field719 = (-arg3.field783 + arg0) / 2 - -arg3.field712;
                }
            } else {
                arg3.field719 = arg3.field712;
            }
            ++field698;
            if (class588.field8274) {
                if (client.method1943(arg3).field4679 != 0 || arg3.field765 == 0) {
                    if (~arg3.field719 > -1) {
                        arg3.field719 = 0;
                    } else if (arg0 < arg3.field783 + arg3.field719) {
                        arg3.field719 = -arg3.field783 + arg0;
                    }
                    if (arg3.field856 >= 0) {
                        if (~(arg3.field856 + arg3.field830) < ~arg2) {
                            arg3.field856 = -arg3.field830 + arg2;
                            return;
                        }
                    } else {
                        arg3.field856 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "(I)V")
    public static void method431(int arg0) {
        field696 = null;
        field699 = null;
        int var1 = 44 % ((arg0 - -49) / 42);
        field684 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(FI)F")
    public final float method432(float arg0, int arg1) {
        if (arg1 != -12086) {
            return 0.068281226F;
        } else {
            ++field695;
            return arg0 / (float) this.field697;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIILkca;Z[BI)V")
    public final void method433(int arg0, int arg1, int arg2, int arg3, int arg4, class82 arg5, boolean arg6, byte[] arg7, int arg8) {
        ++field689;
        super.field9790.method2732(-115, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Dub(super.field9787, 0, arg3, arg2, arg1, arg4, class491.method2955(arg5, arg6), 5121, arg7, arg8);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Leea;Lkca;IIZ[FII)V")
    public class47(class132 arg0, class82 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class438.field6121, arg2 * arg3, arg4);
        this.field697 = arg3;
        this.field687 = arg2;
        super.field9790.method2732(-56, this);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method3912(17405, arg3, arg5, super.field9787, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field9787, 0, this.method3910(0), arg2, arg3, 0, class491.method2955(super.field9780, false), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Leea;IIZ[III)V")
    public class47(class132 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class282.field4019, class438.field6117, arg1 * arg2, arg3);
        this.field687 = arg1;
        this.field697 = arg2;
        super.field9790.method2732(-68, this);
        if (arg3 && ~arg6 == -1 && ~arg5 == -1) {
            this.method3909(arg1, arg4, arg2, super.field9787, 31996);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field9787, 0, 6408, this.field687, this.field697, 0, 32993, super.field9790.field2094, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIZII[II)V")
    public final void method434(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, int arg7) {
        super.field9790.method2732(-111, this);
        ++field690;
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Di(super.field9787, 0, arg1, arg2, arg5, arg0, 32993, super.field9790.field2094, arg6, arg7);
        if (arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Leea;Lkca;Lti;II)V")
    public class47(class132 arg0, class82 arg1, class438 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field697 = arg4;
        this.field687 = arg3;
        super.field9790.method2732(-74, this);
        OpenGL.glTexImage2Dub(super.field9787, 0, this.method3910(0), arg3, arg4, 0, class491.method2955(super.field9780, false), class34.method218(255, super.field9791), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Leea;Lkca;IIZ[BII)V")
    public class47(class132 arg0, class82 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class438.field6117, arg2 * arg3, arg4);
        this.field687 = arg2;
        this.field697 = arg3;
        super.field9790.method2732(-83, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method3904(-51, super.field9787, arg5, arg3, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field9787, 0, this.method3910(0), arg2, arg3, 0, class491.method2955(super.field9780, false), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }
}
