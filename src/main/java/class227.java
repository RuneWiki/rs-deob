import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class227 extends class517 {

    @OriginalMember(owner = "client!aaa", name = "F", descriptor = "I")
    private int field3026 = -1;

    @OriginalMember(owner = "client!aaa", name = "G", descriptor = "I")
    private int field3027 = -1;

    @OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!aaa", name = "y", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
    public static int field3021 = 0;

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "I")
    public static int field3020 = 0;

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!aaa", name = "w", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!aaa", name = "B", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!aaa", name = "C", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!aaa", name = "D", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!aaa", name = "E", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Luca;IIIIZ[IIIZ)V", line = 5)
    public class227(class287 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3016 = arg3;
        this.field3019 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; arg4 > var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + -1 + arg4) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field7252.method1709((byte) -107, this);
        if (~super.field7260 != -34038 && arg5 && ~arg7 == -1 && ~arg8 == -1) {
            class569.method3275(super.field7252.field4069, this.field3016, arg6, 94, this.field3019, super.field7259, 32993, super.field7260);
            this.method2921(112, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field7260, 0, super.field7259, this.field3016, this.field3019, 0, 32993, super.field7252.field4069, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method2921(127, false);
        }
        this.method2924(true, -107);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZ[IIIBIII)V", line = 59)
    public final void method1420(int arg0, boolean arg1, int[] arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        ++field3025;
        if (arg0 == 0) {
            arg0 = arg3;
        }
        if (arg1) {
            int[] var10 = new int[arg3 * arg4];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg0 + arg8;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg2[var13++];
                }
            }
            arg2 = var10;
        }
        super.field7252.method1709((byte) -94, this);
        if (arg0 != arg3) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        if (arg5 >= -113) {
            field3020 = 38;
        }
        OpenGL.glTexSubImage2Di(super.field7260, 0, arg6, arg7, arg3, arg4, 32993, super.field7252.field4069, arg2, arg8);
        if (arg0 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Luca;IIII)V", line = 113)
    public class227(class287 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3016 = arg3;
        this.field3019 = arg4;
        super.field7252.method1709((byte) -49, this);
        OpenGL.glTexImage2Dub(super.field7260, 0, super.field7259, arg3, arg4, 0, class422.method2556(super.field7259, (byte) -75), 5121, (byte[]) null, 0);
        this.method2924(true, -15);
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Luca;IIIII)V", line = 128)
    public class227(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3019 = arg5;
        this.field3016 = arg4;
        int var7 = -arg5 + super.field7252.field3959 + -arg3;
        super.field7252.method1709((byte) -116, this);
        OpenGL.glCopyTexImage2D(super.field7260, 0, super.field7259, arg2, var7, arg4, arg5, 0);
        this.method2924(true, -31);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIII)V", line = 144)
    public final void method1421(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, super.field7260, super.field7258, arg1);
        if (arg2 > 43) {
            ++field3017;
            this.field3026 = arg3;
            this.field3027 = arg0;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)B", line = 158)
    public static final byte method1422(int arg0, int arg1, int arg2) {
        ++field3024;
        if (~arg0 != -10) {
            return 0;
        } else {
            if (arg2 != 2) {
                field3020 = 29;
            }
            return (byte) ((1 & arg1) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Luca;IIIIZ[FI)V", line = 179)
    public class227(class287 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3019 = arg4;
        this.field3016 = arg3;
        super.field7252.method1709((byte) -88, this);
        if (arg5 && super.field7260 != 34037) {
            class620.method3573(arg7, arg1, arg6, -11044, arg4, arg2, arg3);
            this.method2921(116, true);
        } else {
            OpenGL.glTexImage2Df(super.field7260, 0, super.field7259, this.field3016, this.field3019, 0, arg7, 5126, arg6, 0);
            this.method2921(113, false);
        }
        this.method2924(true, -52);
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Luca;IIIIZ[BIZ)V", line = 282)
    public class227(class287 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3016 = arg3;
        this.field3019 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field7252.method1709((byte) -79, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field7260 != 34037) {
            class461.method2684(arg7, arg3, arg4, -32176, arg2, arg6, arg1);
            this.method2921(-107, true);
        } else {
            OpenGL.glTexImage2Dub(super.field7260, 0, super.field7259, this.field3016, this.field3019, 0, arg7, 5121, arg6, 0);
            this.method2921(127, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2924(true, -33);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 209)
    public final void method847(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3027, this.field3026, super.field7260, 0, 0);
        ++field3023;
        this.field3027 = -1;
        this.field3026 = -1;
        if (arg0 != -79) {
            this.field3027 = -101;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIII[BIIZI)V", line = 222)
    public final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, boolean arg8, int arg9) {
        ++field3022;
        if (arg0 == 0) {
            arg0 = arg3;
        }
        if (arg8) {
            int var11 = class604.method3446((byte) -48, arg7);
            int var12 = arg3 * var11;
            int var13 = arg0 * var11;
            byte[] var14 = new byte[arg4 * var12];
            for (int var15 = 0; arg4 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg4 - 1 + -var15) * var13 - -arg1;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg5[var17++];
                }
            }
            arg5 = var14;
        }
        super.field7252.method1709((byte) -90, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg3) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field7260, 0, arg2, arg6, arg3, arg4, arg7, 5121, arg5, arg1);
        if (arg0 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg9 >= -1) {
            this.field3019 = 104;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZZ)V", line = 335)
    public final void method1424(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 10242) {
            this.method1421(-76, -38, 34, -124);
        }
        if (~super.field7260 == -3554) {
            super.field7252.method1709((byte) -82, this);
            OpenGL.glTexParameteri(super.field7260, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field7260, 10243, arg2 ? 10497 : 33071);
        }
        ++field3018;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIIIBI)V", line = 353)
    public final void method1425(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field3015;
        int var8 = -arg2 + -arg3 + super.field7252.field3959;
        super.field7252.method1709((byte) -78, this);
        OpenGL.glCopyTexSubImage2D(super.field7260, 0, arg0, -arg3 + this.field3019 + -arg4, arg1, var8, arg6, arg3);
        OpenGL.glFlush();
        int var9 = 15 / ((arg5 - -20) / 38);
    }
}
