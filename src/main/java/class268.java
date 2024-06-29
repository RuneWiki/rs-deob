import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class268 extends class18 {

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    private int field3758 = -1;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    private int field3769 = -1;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field3766 = 0;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "Z")
    public static boolean field3763 = false;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "[S")
    public static short[] field3767 = new short[] { 46, 57, 51, 4, 44, 18, 10, 25 };

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "D")
    public static double field3764;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII[BIIZI)V", line = 5)
    public final void method1741(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, boolean arg8, int arg9) {
        ++field3761;
        if (~arg1 == -1) {
            arg1 = arg4;
        }
        if (arg8) {
            int var11 = class622.method3510(-8, arg9);
            int var12 = arg4 * var11;
            int var13 = arg1 * var11;
            byte[] var14 = new byte[arg0 * var12];
            for (int var15 = 0; arg0 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 - 1 + arg0) * var13 + arg2;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg5[var17++];
                }
            }
            arg5 = var14;
        }
        super.field434.method939(this, 8448);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field430, 0, arg3, arg6, arg4, arg0, arg9, 5121, arg5, arg2);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg7 >= -66) {
            field3764 = 1.0743876794640352D;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 66)
    public final void method129(int arg0) {
        ++field3765;
        OpenGL.glFramebufferTexture2DEXT(this.field3758, this.field3769, super.field430, 0, 0);
        this.field3758 = -1;
        if (arg0 >= -44) {
            this.method129(-75);
        }
        this.field3769 = -1;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lhk;IIIIZ[IIIZ)V", line = 80)
    public class268(class111 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3759 = arg4;
        this.field3757 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; var12 < arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + -1 + arg4) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field434.method939(this, 8448);
        if (~super.field430 != -34038 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class265.method1732(32993, arg6, this.field3759, this.field3757, super.field430, super.field427, super.field434.field2058, 28264);
            this.method120(true, (byte) 2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field430, 0, super.field427, this.field3757, this.field3759, 0, 32993, super.field434.field2058, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method120(false, (byte) 2);
        }
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZZ)V", line = 133)
    public final void method1742(int arg0, boolean arg1, boolean arg2) {
        if (~super.field430 == -3554) {
            super.field434.method939(this, 8448);
            OpenGL.glTexParameteri(super.field430, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field430, 10243, arg2 ? 10497 : 33071);
        }
        if (arg0 <= 12) {
            this.field3758 = -67;
        }
        ++field3768;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lhk;IIII)V", line = 150)
    public class268(class111 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3757 = arg3;
        this.field3759 = arg4;
        super.field434.method939(this, 8448);
        OpenGL.glTexImage2Dub(super.field430, 0, super.field427, arg3, arg4, 0, class628.method3531((byte) -116, super.field427), 5121, (byte[]) null, 0);
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIII)V", line = 162)
    public final void method1743(byte arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, super.field430, super.field433, arg3);
        ++field3756;
        if (arg0 != 92) {
            this.field3769 = 88;
        }
        this.field3769 = arg1;
        this.field3758 = arg2;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lhk;IIIIZ[FI)V", line = 178)
    public class268(class111 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3759 = arg4;
        this.field3757 = arg3;
        super.field434.method939(this, 8448);
        if (arg5 && super.field430 != 34037) {
            class523.method2977(arg1, arg4, arg6, arg7, arg2, 26266, arg3);
            this.method120(true, (byte) 2);
        } else {
            OpenGL.glTexImage2Df(super.field430, 0, super.field427, this.field3757, this.field3759, 0, arg7, 5126, arg6, 0);
            this.method120(false, (byte) 2);
        }
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lhk;IIIIZ[BIZ)V", line = 204)
    public class268(class111 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3757 = arg3;
        this.field3759 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 - 1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field434.method939(this, 8448);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field430 != -34038) {
            class543.method3061(arg7, arg3, arg6, arg1, arg4, 2, arg2);
            this.method120(true, (byte) 2);
        } else {
            OpenGL.glTexImage2Dub(super.field430, 0, super.field427, this.field3757, this.field3759, 0, arg7, 5121, arg6, 0);
            this.method120(false, (byte) 2);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V", line = 257)
    public static void method1744(int arg0) {
        if (arg0 != 3314) {
            field3764 = 2.0555901515875314D;
        }
        field3767 = null;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lhk;IIIII)V", line = 267)
    public class268(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3759 = arg5;
        this.field3757 = arg4;
        int var7 = -arg3 - (arg5 - super.field434.field1921);
        super.field434.method939(this, 8448);
        OpenGL.glCopyTexImage2D(super.field430, 0, super.field427, arg2, var7, arg4, arg5, 0);
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII)V", line = 294)
    public final void method1745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3762;
        int var8 = -arg3 - arg0 + super.field434.field1921;
        super.field434.method939(this, arg2 ^ 8448);
        OpenGL.glCopyTexSubImage2D(super.field430, arg2, arg5, -arg0 + this.field3759 + -arg6, arg4, var8, arg1, arg0);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZIII[III)V", line = 306)
    public final void method1746(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        ++field3760;
        if (~arg5 == -1) {
            arg5 = arg0;
        }
        if (arg2) {
            int[] var10 = new int[arg0 * arg7];
            for (int var11 = 0; ~var11 > ~arg7; ++var11) {
                int var12 = arg0 * var11;
                int var13 = (-var11 + -1 + arg7) * arg5 + arg4;
                for (int var14 = 0; var14 < arg0; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field434.method939(this, arg8 + 8448);
        if (~arg0 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Di(super.field430, arg8, arg1, this.field3759 - (arg3 + arg7), arg0, arg7, 32993, super.field434.field2058, arg6, arg4);
        if (~arg0 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
