import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class441 extends class262 {

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
    private int field5853 = -1;

    @OriginalMember(owner = "client!dga", name = "G", descriptor = "I")
    private int field5860 = -1;

    @OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
    public int field5857;

    @OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
    public int field5862;

    @OriginalMember(owner = "client!dga", name = "B", descriptor = "Lwo;")
    public static class445 field5855 = new class445();

    @OriginalMember(owner = "client!dga", name = "H", descriptor = "F")
    public static float field5861;

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!dga", name = "A", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!dga", name = "C", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "Ltq;")
    public static class92 field5859;

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lag;IIIIZ[BIZ)V")
    public class441(class469 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5857 = arg4;
        this.field5862 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - 1 + -var11) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3422.method2627(57, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field3417 != 34037) {
            class521.method2955(arg4, arg6, arg3, -121, arg7, arg1, arg2);
            this.method1578(true, 0);
        } else {
            OpenGL.glTexImage2Dub(super.field3417, 0, super.field3413, this.field5862, this.field5857, 0, arg7, 5121, arg6, 0);
            this.method1578(false, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1582(123, true);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIII)V")
    public final void method2490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5854;
        int var8 = -arg1 + super.field3422.field6337 + -arg6;
        super.field3422.method2627(126, this);
        OpenGL.glCopyTexSubImage2D(super.field3417, 0, arg3, this.field5857 - arg0 + -arg1, arg4, var8, arg5, arg1);
        if (arg2 != 30481) {
            this.field5857 = -65;
        }
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(III)V")
    public static final void method2491(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field5861 = -1.1120262F;
        }
        ++field5852;
        if (class678.field9636 == class508.field7015) {
            if (!class134.method776(1, 0, arg0, -101, false, 0, -2, arg2, 1)) {
                class134.method776(1, 0, arg0, -125, false, 0, -3, arg2, 1);
            }
        } else if (!class134.method776(1, 0, arg0, -77, false, 0, -3, arg2, 1)) {
            class134.method776(1, 0, arg0, -58, false, 0, -2, arg2, 1);
        }
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lag;IIIIZ[FI)V")
    public class441(class469 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5862 = arg3;
        this.field5857 = arg4;
        super.field3422.method2627(72, this);
        if (arg5 && ~super.field3417 != -34038) {
            class701.method3941(arg2, arg7, arg4, 118, arg3, arg1, arg6);
            this.method1578(true, 0);
        } else {
            OpenGL.glTexImage2Df(super.field3417, 0, super.field3413, this.field5862, this.field5857, 0, arg7, 5126, arg6, 0);
            this.method1578(false, 0);
        }
        this.method1582(116, true);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
    public final void method395(int arg0) {
        ++field5858;
        OpenGL.glFramebufferTexture2DEXT(this.field5853, this.field5860, super.field3417, 0, 0);
        this.field5853 = -1;
        this.field5860 = -1;
        if (arg0 != 33071) {
            this.method2495(false, false, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(III[BIZIIII)V")
    public final void method2492(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5856;
        if (arg2 == 0) {
            arg2 = arg0;
        }
        if (arg5) {
            int var11 = class409.method2320(arg4, false);
            int var12 = arg0 * var11;
            int var13 = arg2 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; arg6 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg6 + -1 - var15) * var13 - -arg8;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field3422.method2627(47, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg2) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Dub(super.field3417, 0, arg9, arg7, arg0, arg6, arg4, 5121, arg3, arg8);
        if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        int var19 = -77 % ((44 - arg1) / 46);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lag;IIII)V")
    public class441(class469 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field5862 = arg3;
        this.field5857 = arg4;
        super.field3422.method2627(108, this);
        OpenGL.glTexImage2Dub(super.field3417, 0, super.field3413, arg3, arg4, 0, class151.method888((byte) -98, super.field3413), 5121, (byte[]) null, 0);
        this.method1582(120, true);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lag;IIIIZ[IZ)V")
    public class441(class469 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5862 = arg3;
        this.field5857 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; var10 < arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 + -1) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field3422.method2627(32, this);
        if (arg5 && ~super.field3417 != -34038) {
            class308.method1811(arg6, super.field3417, 32993, 79, this.field5857, super.field3422.field6460, super.field3413, this.field5862);
            this.method1578(true, 0);
        } else {
            OpenGL.glTexImage2Di(super.field3417, 0, super.field3413, this.field5862, this.field5857, 0, 32993, super.field3422.field6460, arg6, 0);
            this.method1578(false, 0);
        }
        this.method1582(126, true);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II[IIZIIII)V")
    public final void method2493(int arg0, int arg1, int[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (~arg7 == -1) {
            arg7 = arg6;
        }
        ++field5851;
        if (arg4) {
            int[] var10 = new int[arg5 * arg6];
            for (int var11 = 0; arg5 > var11; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (arg5 - 1 + -var11) * arg7 - -arg8;
                for (int var14 = 0; arg6 > var14; ++var14) {
                    var10[var12++] = arg2[var13++];
                }
            }
            arg2 = var10;
        }
        super.field3422.method2627(arg3 + 34, this);
        if (arg6 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field3417, 0, arg1, arg0, arg6, arg5, 32993, super.field3422.field6460, arg2, arg8);
        if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg3 != -3) {
            field5861 = 0.09588725F;
        }
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lag;IIIII)V")
    public class441(class469 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field5862 = arg4;
        this.field5857 = arg5;
        int var7 = -arg3 + -arg5 + super.field3422.field6337;
        super.field3422.method2627(76, this);
        OpenGL.glCopyTexImage2D(super.field3417, 0, super.field3413, arg2, var7, arg4, arg5, 0);
        this.method1582(126, true);
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)V")
    public static void method2494(byte arg0) {
        int var1 = 0 % ((arg0 - 17) / 59);
        field5859 = null;
        field5855 = null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZZB)V")
    public final void method2495(boolean arg0, boolean arg1, byte arg2) {
        ++field5849;
        if (arg2 == -1) {
            if (~super.field3417 == -3554) {
                super.field3422.method2627(108, this);
                OpenGL.glTexParameteri(super.field3417, 10242, arg0 ? 10497 : 33071);
                OpenGL.glTexParameteri(super.field3417, 10243, arg1 ? 10497 : 33071);
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(IIII)V")
    public final void method2496(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, super.field3417, super.field3415, arg0);
        if (arg1 != 0) {
            field5859 = null;
        }
        ++field5850;
        this.field5853 = arg2;
        this.field5860 = arg3;
    }
}
