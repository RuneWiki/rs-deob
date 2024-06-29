import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class296 extends class487 {

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    private int field4434 = -1;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    private int field4432 = -1;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public int field4431;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public int field4441;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field4433 = 1407;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field4436 = 0;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "[I")
    public static int[] field4440 = new int[3];

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lus;IIIIZ[BIZ)V")
    public class296(class1 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4431 = arg3;
        this.field4441 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - var11 + -1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field6977.method5(3845, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field6979 != 34037) {
            class154.method1196(arg6, arg1, -1620809119, arg7, arg2, arg3, arg4);
            this.method2936((byte) 62, true);
        } else {
            OpenGL.glTexImage2Dub(super.field6979, 0, super.field6971, this.field4431, this.field4441, 0, arg7, 5121, arg6, 0);
            this.method2936((byte) -124, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2939(true, (byte) -69);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lus;IIIIZ[FI)V")
    public class296(class1 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4441 = arg4;
        this.field4431 = arg3;
        super.field6977.method5(3845, this);
        if (arg5 && super.field6979 != 34037) {
            class62.method755(arg4, arg7, arg2, arg1, arg3, arg6, -59);
            this.method2936((byte) -88, true);
        } else {
            OpenGL.glTexImage2Df(super.field6979, 0, super.field6971, this.field4431, this.field4441, 0, arg7, 5126, arg6, 0);
            this.method2936((byte) 69, false);
        }
        this.method2939(true, (byte) -69);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lus;IIIII)V")
    public class296(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field4431 = arg4;
        this.field4441 = arg5;
        int var7 = -arg3 + -arg5 + super.field6977.field24;
        super.field6977.method5(3845, this);
        OpenGL.glCopyTexImage2D(super.field6979, 0, super.field6971, arg2, var7, arg4, arg5, 0);
        this.method2939(true, (byte) -69);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
    public final void method1966(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, super.field6979, super.field6972, arg0);
        ++field4439;
        if (arg3 == 20123) {
            this.field4432 = arg2;
            this.field4434 = arg1;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lus;IIIIZ[IZ)V")
    public class296(class1 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4441 = arg4;
        this.field4431 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + -1 + arg4) * arg3;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field6977.method5(3845, this);
        if (arg5 && ~super.field6979 != -34038) {
            class432.method2629(super.field6979, arg6, (byte) 83, 32993, this.field4441, super.field6977.field320, this.field4431, super.field6971);
            this.method2936((byte) -88, true);
        } else {
            OpenGL.glTexImage2Di(super.field6979, 0, super.field6971, this.field4431, this.field4441, 0, 32993, super.field6977.field320, arg6, 0);
            this.method2936((byte) -86, false);
        }
        this.method2939(true, (byte) -69);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
    public static void method1967(byte arg0) {
        if (arg0 != -81) {
            method1967((byte) 57);
        }
        field4440 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[IIIZIIII)V")
    public final void method1968(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4429;
        if (~arg7 == arg8) {
            arg7 = arg2;
        }
        if (arg4) {
            int[] var10 = new int[arg2 * arg5];
            for (int var11 = 0; ~var11 > ~arg5; ++var11) {
                int var12 = arg2 * var11;
                int var13 = (-var11 + arg5 + -1) * arg7 + arg6;
                for (int var14 = 0; arg2 > var14; ++var14) {
                    var10[var12++] = arg1[var13++];
                }
            }
            arg1 = var10;
        }
        super.field6977.method5(3845, this);
        if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field6979, 0, arg3, arg0, arg2, arg5, 32993, super.field6977.field320, arg1, arg6);
        if (~arg2 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method1612(int arg0) {
        if (arg0 < 114) {
            this.method1969(-47, -28, -65, -98, 11, 117, -92);
        }
        OpenGL.glFramebufferTexture2DEXT(this.field4432, this.field4434, super.field6979, 0, 0);
        ++field4437;
        this.field4432 = -1;
        this.field4434 = -1;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lus;IIII)V")
    public class296(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field4441 = arg4;
        this.field4431 = arg3;
        super.field6977.method5(3845, this);
        OpenGL.glTexImage2Dub(super.field6979, 0, super.field6971, arg3, arg4, 0, class502.method2994(12, super.field6971), 5121, (byte[]) null, 0);
        this.method2939(true, (byte) -69);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)V")
    public final void method1969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 28126) {
            field4440 = null;
        }
        ++field4438;
        int var8 = -arg0 + -arg2 + super.field6977.field24;
        super.field6977.method5(3845, this);
        OpenGL.glCopyTexSubImage2D(super.field6979, 0, arg6, this.field4441 - (arg0 + arg4), arg1, var8, arg5, arg0);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIZ[B)V")
    public final void method1970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte[] arg9) {
        if (arg1 == 0) {
            arg1 = arg7;
        }
        ++field4435;
        if (arg8) {
            int var11 = class680.method3826(arg0 ^ 3173, arg4);
            int var12 = arg7 * var11;
            int var13 = arg1 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; ~var15 > ~arg6; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + -1 + arg6) * var13 - -arg3;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg9[var17++];
                }
            }
            arg9 = var14;
        }
        super.field6977.method5(arg0 ^ -852, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field6979, 0, arg2, arg5, arg7, arg6, arg4, 5121, arg9, arg3);
        if (arg0 != -3159) {
            method1967((byte) -118);
        }
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIZ)V")
    public final void method1971(boolean arg0, int arg1, boolean arg2) {
        if (super.field6979 == 3553) {
            super.field6977.method5(3845, this);
            OpenGL.glTexParameteri(super.field6979, 10242, !arg0 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field6979, 10243, !arg2 ? 33071 : 10497);
        }
        if (arg1 > -102) {
            field4440 = null;
        }
        ++field4430;
    }
}
