import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class555 extends class325 {

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    private int field7926 = -1;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    private int field7923 = -1;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public int field7928;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public int field7931;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field7932 = 0;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIB)V")
    public final void method3145(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.field3988, super.field3996, arg2);
        ++field7922;
        if (arg3 >= -32) {
            this.field7926 = 83;
        }
        this.field7923 = arg1;
        this.field7926 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
    public final void method3146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7933;
        int var8 = -arg4 - arg1 + super.field3991.field5766;
        super.field3991.method2396((byte) 36, this);
        OpenGL.glCopyTexSubImage2D(super.field3988, arg2, arg5, -arg1 + -arg3 + this.field7928, arg0, var8, arg6, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lvj;IIIIZ[FI)V")
    public class555(class422 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field7928 = arg4;
        this.field7931 = arg3;
        super.field3991.method2396((byte) 36, this);
        if (arg5 && super.field3988 != 34037) {
            class605.method3380(arg7, arg6, arg4, arg3, arg1, arg2, -15229);
            this.method1830(true, 3595);
        } else {
            OpenGL.glTexImage2Df(super.field3988, 0, super.field4000, this.field7931, this.field7928, 0, arg7, 5126, arg6, 0);
            this.method1830(false, 3595);
        }
        this.method1839(true, (byte) 113);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lvj;IIIIZ[BIZ)V")
    public class555(class422 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field7931 = arg3;
        this.field7928 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - var11 + -1) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3991.method2396((byte) 36, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field3988 != 34037) {
            class285.method1657(arg7, arg2, arg4, (byte) -47, arg3, arg1, arg6);
            this.method1830(true, 3595);
        } else {
            OpenGL.glTexImage2Dub(super.field3988, 0, super.field4000, this.field7931, this.field7928, 0, arg7, 5121, arg6, 0);
            this.method1830(false, 3595);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1839(true, (byte) 66);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIBZII[II)V")
    public final void method3147(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6, int[] arg7, int arg8) {
        ++field7927;
        if (arg5 == 0) {
            arg5 = arg2;
        }
        if (arg4) {
            int[] var10 = new int[arg1 * arg2];
            for (int var11 = 0; var11 < arg1; ++var11) {
                int var12 = arg2 * var11;
                int var13 = (-var11 + arg1 - 1) * arg5 + arg6;
                for (int var14 = 0; var14 < arg2; ++var14) {
                    var10[var12++] = arg7[var13++];
                }
            }
            arg7 = var10;
        }
        super.field3991.method2396((byte) 36, this);
        if (arg2 != arg5) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        if (arg3 < 88) {
            this.method3146(-94, 8, -107, 6, 55, 28, -99);
        }
        OpenGL.glTexSubImage2Di(super.field3988, 0, arg8, arg0, arg2, arg1, 32993, super.field3991.field5908, arg7, arg6);
        if (arg2 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lvj;IIII)V")
    public class555(class422 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field7928 = arg4;
        this.field7931 = arg3;
        super.field3991.method2396((byte) 36, this);
        OpenGL.glTexImage2Dub(super.field3988, 0, super.field4000, arg3, arg4, 0, class396.method2242(super.field4000, false), 5121, (byte[]) null, 0);
        this.method1839(true, (byte) 55);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZZ)V")
    public final void method3148(int arg0, boolean arg1, boolean arg2) {
        ++field7925;
        if (arg0 != 10243) {
            this.field7923 = 101;
        }
        if (super.field3988 == 3553) {
            super.field3991.method2396((byte) 36, this);
            OpenGL.glTexParameteri(super.field3988, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field3988, 10243, arg2 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lvj;IIIII)V")
    public class555(class422 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field7931 = arg4;
        this.field7928 = arg5;
        int var7 = -arg5 + super.field3991.field5766 + -arg3;
        super.field3991.method2396((byte) 36, this);
        OpenGL.glCopyTexImage2D(super.field3988, 0, super.field4000, arg2, var7, arg4, arg5, 0);
        this.method1839(true, (byte) 110);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIIII[BIIII)V")
    public final void method3149(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg2 == -1) {
            arg2 = arg4;
        }
        ++field7934;
        if (arg0) {
            int var11 = class356.method2100((byte) -45, arg9);
            int var12 = arg4 * var11;
            int var13 = arg2 * var11;
            byte[] var14 = new byte[arg3 * var12];
            for (int var15 = 0; arg3 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg3 - (var15 + 1)) * var13 + arg6;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg5[var17++];
                }
            }
            arg5 = var14;
        }
        super.field3991.method2396((byte) 36, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg2 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Dub(super.field3988, 0, arg1, arg8, arg4, arg3, arg9, 5121, arg5, arg6);
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, arg7);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZ)Lsm;")
    public static final class628 method3150(int arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            method3150(9, 58, false);
        }
        ++field7929;
        long var3 = (long) (arg0 | (!arg2 ? 0 : Integer.MIN_VALUE));
        return (class628) class403.field5395.method3669(var3, arg1 + -1);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lvj;IIIIZ[IZ)V")
    public class555(class422 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field7928 = arg4;
        this.field7931 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + -1 + arg4) * arg3;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field3991.method2396((byte) 36, this);
        if (arg5 && super.field3988 != 34037) {
            class443.method2568(arg6, this.field7931, super.field3991.field5908, this.field7928, 32993, 29914, super.field4000, super.field3988);
            this.method1830(true, 3595);
        } else {
            OpenGL.glTexImage2Di(super.field3988, 0, super.field4000, this.field7931, this.field7928, 0, 32993, super.field3991.field5908, arg6, 0);
            this.method1830(false, 3595);
        }
        this.method1839(true, (byte) 115);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public final void method459(int arg0) {
        ++field7924;
        OpenGL.glFramebufferTexture2DEXT(this.field7923, this.field7926, super.field3988, 0, 0);
        this.field7926 = -1;
        if (arg0 != Integer.MIN_VALUE) {
            field7930 = -101;
        }
        this.field7923 = -1;
    }
}
