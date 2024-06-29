import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class25 extends class538 {

    @OriginalMember(owner = "client!wv", name = "E", descriptor = "I")
    private int field362 = -1;

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
    private int field363 = -1;

    @OriginalMember(owner = "client!wv", name = "I", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!wv", name = "D", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!wv", name = "C", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!wv", name = "G", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!wv", name = "H", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "Luu;")
    public static class191 field359;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(B)V", line = 3)
    public static void method228(byte arg0) {
        field359 = null;
        if (arg0 < 57) {
            field358 = 4;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BZZ)V", line = 13)
    public final void method229(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 != 77) {
            this.method2(true);
        }
        if (super.field7881 == 3553) {
            super.field7884.method2075(this, arg0 ^ 77);
            OpenGL.glTexParameteri(super.field7881, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field7881, 10243, !arg2 ? 33071 : 10497);
        }
        ++field367;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)V", line = 31)
    public final void method230(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 10968) {
            field359 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, super.field7881, super.field7894, arg1);
        ++field364;
        this.field362 = arg3;
        this.field363 = arg0;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIZZI[IIII)V", line = 45)
    public final void method231(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
        if (arg3) {
            this.method231(49, -97, true, false, -96, (int[]) null, 50, -43, 77);
        }
        ++field357;
        if (~arg1 == -1) {
            arg1 = arg7;
        }
        if (arg2) {
            int[] var10 = new int[arg6 * arg7];
            for (int var11 = 0; arg6 > var11; ++var11) {
                int var12 = arg7 * var11;
                int var13 = (arg6 + -1 - var11) * arg1 + arg8;
                for (int var14 = 0; ~arg7 < ~var14; ++var14) {
                    var10[var12++] = arg5[var13++];
                }
            }
            arg5 = var10;
        }
        super.field7884.method2075(this, 0);
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Di(super.field7881, 0, arg0, arg4, arg7, arg6, 32993, super.field7884.field4925, arg5, arg8);
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V", line = 100)
    public final void method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field356;
        int var8 = super.field7884.field4811 - arg3 - arg5;
        super.field7884.method2075(this, 0);
        OpenGL.glCopyTexSubImage2D(super.field7881, arg2, arg1, -arg4 + this.field366 + -arg3, arg0, var8, arg6, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lnq;IIIII)V", line = 112)
    public class25(class325 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field366 = arg5;
        this.field361 = arg4;
        int var7 = super.field7884.field4811 - arg5 - arg3;
        super.field7884.method2075(this, 0);
        OpenGL.glCopyTexImage2D(super.field7881, 0, super.field7878, arg2, var7, arg4, arg5, 0);
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lnq;IIII)V", line = 131)
    public class25(class325 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field361 = arg3;
        this.field366 = arg4;
        super.field7884.method2075(this, 0);
        OpenGL.glTexImage2Dub(super.field7881, 0, super.field7878, arg3, arg4, 0, class259.method1676(super.field7878, 128), 5121, (byte[]) null, 0);
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lnq;IIIIZ[IZ)V", line = 143)
    public class25(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field366 = arg4;
        this.field361 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 + -1) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field7884.method2075(this, 0);
        if (arg5 && super.field7881 != 34037) {
            class24.method224(super.field7881, this.field361, super.field7878, 32993, super.field7884.field4925, this.field366, -119, arg6);
            this.method3179(true, true);
        } else {
            OpenGL.glTexImage2Di(super.field7881, 0, super.field7878, this.field361, this.field366, 0, 32993, super.field7884.field4925, arg6, 0);
            this.method3179(true, false);
        }
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V", line = 193)
    public final void method2(boolean arg0) {
        if (arg0) {
            field359 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(this.field363, this.field362, super.field7881, 0, 0);
        ++field365;
        this.field363 = -1;
        this.field362 = -1;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III[BIIIIIZ)V", line = 206)
    public final void method233(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        ++field360;
        if (~arg1 == -1) {
            arg1 = arg6;
        }
        if (arg9) {
            int var11 = class429.method2623((byte) -43, arg7);
            int var12 = arg6 * var11;
            int var13 = arg1 * var11;
            byte[] var14 = new byte[arg0 * var12];
            for (int var15 = 0; var15 < arg0; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg0 + -1) * var13 + arg4;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field7884.method2075(this, 0);
        if (arg2 != 22711) {
            this.field361 = -9;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 != arg6) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field7881, 0, arg8, arg5, arg6, arg0, arg7, 5121, arg3, arg4);
        if (arg1 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lnq;IIIIZ[BIZ)V", line = 271)
    public class25(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field361 = arg3;
        this.field366 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field7884.method2075(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field7881 != 34037) {
            class424.method2585(arg3, 0, arg4, arg2, arg7, arg1, arg6);
            this.method3179(true, true);
        } else {
            OpenGL.glTexImage2Dub(super.field7881, 0, super.field7878, this.field361, this.field366, 0, arg7, 5121, arg6, 0);
            this.method3179(true, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lnq;IIIIZ[FI)V", line = 325)
    public class25(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field366 = arg4;
        this.field361 = arg3;
        super.field7884.method2075(this, 0);
        if (arg5 && super.field7881 != 34037) {
            class425.method2595(arg3, 106, arg7, arg6, arg2, arg4, arg1);
            this.method3179(true, true);
        } else {
            OpenGL.glTexImage2Df(super.field7881, 0, super.field7878, this.field361, this.field366, 0, arg7, 5126, arg6, 0);
            this.method3179(true, false);
        }
        this.method3176(false, true);
    }
}
