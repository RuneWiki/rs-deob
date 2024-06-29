import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class616 extends class221 {

    @OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
    private int field8635 = -1;

    @OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
    private int field8640 = -1;

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "I")
    public int field8639;

    @OriginalMember(owner = "client!aaa", name = "F", descriptor = "I")
    public int field8645;

    @OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!aaa", name = "w", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!aaa", name = "y", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!aaa", name = "B", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!aaa", name = "C", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!aaa", name = "E", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!aaa", name = "G", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!aaa", name = "D", descriptor = "Lmv;")
    public static class377 field8643;

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lac;IIII)V", line = 4)
    public class616(class541 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field8639 = arg4;
        this.field8645 = arg3;
        super.field2851.method3006(1, this);
        OpenGL.glTexImage2Dub(super.field2849, 0, super.field2860, arg3, arg4, 0, class716.method4008(super.field2860, 126), 5121, (byte[]) null, 0);
        this.method1258(-28003, true);
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lac;IIIIZ[BIZ)V", line = 18)
    public class616(class541 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field8645 = arg3;
        this.field8639 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2851.method3006(1, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field2849 != -34038) {
            class452.method2523(arg3, arg1, arg6, -1, arg4, arg2, arg7);
            this.method1259(true, true);
        } else {
            OpenGL.glTexImage2Dub(super.field2849, 0, super.field2860, this.field8645, this.field8639, 0, arg7, 5121, arg6, 0);
            this.method1259(true, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1258(-28003, true);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIZI[BIBIII)V", line = 70)
    public final void method3466(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (~arg3 == -1) {
            arg3 = arg0;
        }
        ++field8637;
        if (arg2) {
            int var11 = class719.method4044(1, arg1);
            int var12 = arg0 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg9 * var12];
            for (int var15 = 0; ~arg9 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg9 - 1) * var13 - -arg8;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg4[var17++];
                }
            }
            arg4 = var14;
        }
        super.field2851.method3006(1, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg0 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field2849, 0, arg7, arg5, arg0, arg9, arg1, 5121, arg4, arg8);
        if (~arg0 != ~arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg6 != -80) {
            this.method3471(false, -121, false);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lac;IIIII)V", line = 131)
    public class616(class541 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field8639 = arg5;
        this.field8645 = arg4;
        int var7 = super.field2851.field7410 - arg5 - arg3;
        super.field2851.method3006(1, this);
        OpenGL.glCopyTexImage2D(super.field2849, 0, super.field2860, arg2, var7, arg4, arg5, 0);
        this.method1258(-28003, true);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I[IIIZIIII)V", line = 145)
    public final void method3467(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 == 3656) {
            if (~arg6 == -1) {
                arg6 = arg7;
            }
            ++field8644;
            if (arg4) {
                int[] var10 = new int[arg0 * arg7];
                for (int var11 = 0; ~arg0 < ~var11; ++var11) {
                    int var12 = arg7 * var11;
                    int var13 = (-var11 + -1 + arg0) * arg6 + arg2;
                    for (int var14 = 0; ~var14 > ~arg7; ++var14) {
                        var10[var12++] = arg1[var13++];
                    }
                }
                arg1 = var10;
            }
            super.field2851.method3006(1, this);
            if (~arg6 != ~arg7) {
                OpenGL.glPixelStorei(3314, arg6);
            }
            OpenGL.glTexSubImage2Di(super.field2849, 0, arg8, -arg5 + this.field8639 + -arg0, arg7, arg0, 32993, super.field2851.field7636, arg1, arg2);
            if (~arg6 != ~arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIIIII)V", line = 197)
    public final void method3468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8642;
        int var8 = super.field2851.field7410 - (arg3 - -arg6);
        super.field2851.method3006(1, this);
        OpenGL.glCopyTexSubImage2D(super.field2849, 0, arg1, this.field8639 - (arg2 + arg6), arg4, var8, arg0, arg6);
        if (arg5 <= 79) {
            this.method3471(true, -52, false);
        }
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lac;IIIIZ[FI)V", line = 231)
    public class616(class541 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field8645 = arg3;
        this.field8639 = arg4;
        super.field2851.method3006(1, this);
        if (arg5 && ~super.field2849 != -34038) {
            class427.method2446(arg3, arg1, arg7, arg2, arg6, arg4, -70);
            this.method1259(true, true);
        } else {
            OpenGL.glTexImage2Df(super.field2849, 0, super.field2860, this.field8645, this.field8639, 0, arg7, 5126, arg6, 0);
            this.method1259(true, false);
        }
        this.method1258(-28003, true);
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lac;IIIIZ[IIIZ)V", line = 304)
    public class616(class541 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field8639 = arg4;
        this.field8645 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~arg4 < ~var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + arg4 + -1) * arg3;
                for (int var15 = 0; arg3 > var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field2851.method3006(1, this);
        if (super.field2849 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
            class387.method2263(super.field2860, -121, super.field2851.field7636, super.field2849, this.field8645, 32993, this.field8639, arg6);
            this.method1259(true, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field2849, 0, super.field2860, this.field8645, this.field8639, 0, 32993, super.field2851.field7636, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method1259(true, false);
        }
        this.method1258(-28003, true);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IILha;IIIII)V", line = 217)
    public static final void method3469(int arg0, int arg1, class60 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        arg2.method368(arg5, arg0, arg1, arg4, (byte) -66, arg7);
        ++field8641;
        arg2.method368(arg5 - 2, 16, arg1 + 1, arg3, (byte) -66, arg7 + 1);
        if (arg6 == 8516) {
            arg2.method393(true, arg0 - 19, arg5 - 2, arg3, arg7 + 1, arg1 + 18);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZII)V", line = 255)
    public final void method3470(int arg0, boolean arg1, int arg2, int arg3) {
        ++field8636;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, super.field2849, super.field2859, arg3);
        this.field8635 = arg2;
        this.field8640 = arg0;
        if (!arg1) {
            this.method3471(false, 107, false);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZIZ)V", line = 273)
    public final void method3471(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 10242) {
            this.method3468(-75, 26, 70, 110, -90, 106, 103);
        }
        ++field8634;
        if (~super.field2849 == -3554) {
            super.field2851.method3006(1, this);
            OpenGL.glTexParameteri(super.field2849, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field2849, 10243, !arg0 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "(I)V", line = 291)
    public static void method3472(int arg0) {
        if (arg0 >= -33) {
            field8646 = 68;
        }
        field8643 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 357)
    public final void method832(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field8640, this.field8635, super.field2849, 0, 0);
        ++field8633;
        this.field8640 = -1;
        this.field8635 = -1;
        if (arg0 >= -117) {
            this.field8635 = 4;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIIIIIII)V", line = 370)
    public static final void method3473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8638;
        class310.method1867(arg8, arg2, arg7, 0, (byte) 82, arg6, arg0, arg1, arg4, arg5);
        if (arg3 != -1) {
            method3473(-52, 78, -128, 103, 42, -10, -6, -22, -116);
        }
    }
}
