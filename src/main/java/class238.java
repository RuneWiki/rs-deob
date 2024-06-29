import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class238 extends class252 {

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    private int field3167 = -1;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    private int field3174 = -1;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "Z")
    public static boolean field3160 = false;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field3172 = 0;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "Luu;")
    public static class190 field3161 = new class190();

    @OriginalMember(owner = "client!km", name = "K", descriptor = "[J")
    public static long[] field3175 = new long[32];

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "Ls;")
    public static class186 field3170;

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lur;IIIIZ[BIZ)V", line = 3)
    public class238(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3164 = arg4;
        this.field3169 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 - var11) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3354.method2236(this, 115);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field3364 != 34037) {
            class395.method2382(arg3, arg7, 22, arg6, arg4, arg2, arg1);
            this.method1563(true, 10240);
        } else {
            OpenGL.glTexImage2Dub(super.field3364, 0, super.field3356, this.field3169, this.field3164, 0, arg7, 5121, arg6, 0);
            this.method1563(false, 10240);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1555((byte) 111, true);
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lur;IIII)V", line = 64)
    public class238(class377 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3164 = arg4;
        this.field3169 = arg3;
        super.field3354.method2236(this, -112);
        OpenGL.glTexImage2Dub(super.field3364, 0, super.field3356, arg3, arg4, 0, class105.method639(-78, super.field3356), 5121, (byte[]) null, 0);
        this.method1555((byte) 107, true);
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V", line = 76)
    public static void method1494(int arg0) {
        field3161 = null;
        field3175 = null;
        if (arg0 != 32993) {
            field3161 = null;
        }
        field3170 = null;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lur;IIIII)V", line = 88)
    public class238(class377 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3164 = arg5;
        this.field3169 = arg4;
        int var7 = super.field3354.field5125 - arg5 - arg3;
        super.field3354.method2236(this, -25);
        OpenGL.glCopyTexImage2D(super.field3364, 0, super.field3356, arg2, var7, arg4, arg5, 0);
        this.method1555((byte) 121, true);
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lur;IIIIZ[IZ)V", line = 102)
    public class238(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3169 = arg3;
        this.field3164 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - var10 - 1) * arg3;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field3354.method2236(this, -38);
        if (arg5 && super.field3364 != 34037) {
            class471.method2873(super.field3354.field5437, this.field3169, 32993, arg6, this.field3164, (byte) -59, super.field3364, super.field3356);
            this.method1563(true, 10240);
        } else {
            OpenGL.glTexImage2Di(super.field3364, 0, super.field3356, this.field3169, this.field3164, 0, 32993, super.field3354.field5437, arg6, 0);
            this.method1563(false, 10240);
        }
        this.method1555((byte) 127, true);
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lur;IIIIZ[FI)V", line = 153)
    public class238(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3164 = arg4;
        this.field3169 = arg3;
        super.field3354.method2236(this, 127);
        if (arg5 && ~super.field3364 != -34038) {
            class354.method2082(15960, arg4, arg6, arg3, arg2, arg1, arg7);
            this.method1563(true, 10240);
        } else {
            OpenGL.glTexImage2Df(super.field3364, 0, super.field3356, this.field3169, this.field3164, 0, arg7, 5126, arg6, 0);
            this.method1563(false, 10240);
        }
        this.method1555((byte) 116, true);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BIIIIIIIZI)V", line = 175)
    public final void method1495(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        ++field3162;
        if (arg2 != 6407) {
            method1494(4);
        }
        if (~arg3 == -1) {
            arg3 = arg9;
        }
        if (arg8) {
            int var11 = class62.method372(32841, arg6);
            int var12 = arg9 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg5 * var12];
            for (int var15 = 0; ~arg5 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg5 - var15 + -1) * var13 + arg1;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg0[var17++];
                }
            }
            arg0 = var14;
        }
        super.field3354.method2236(this, 121);
        OpenGL.glPixelStorei(3317, 1);
        if (arg3 != arg9) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field3364, 0, arg7, arg4, arg9, arg5, arg6, 5121, arg0, arg1);
        if (arg3 != arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V", line = 238)
    public final void method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3168;
        int var8 = super.field3354.field5125 - arg6 - arg4;
        super.field3354.method2236(this, 112);
        if (arg3 != 32993) {
            this.method1495((byte[]) null, 21, -116, -125, -85, -90, -78, 58, false, 1);
        }
        OpenGL.glCopyTexSubImage2D(super.field3364, 0, arg0, this.field3164 - (arg1 - -arg6), arg2, var8, arg5, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIZI[IIZI)V", line = 253)
    public final void method1497(int arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8) {
        if (~arg4 == -1) {
            arg4 = arg2;
        }
        ++field3173;
        if (arg3) {
            int[] var10 = new int[arg0 * arg2];
            for (int var11 = 0; ~var11 > ~arg0; ++var11) {
                int var12 = arg2 * var11;
                int var13 = (-var11 + -1 + arg0) * arg4 + arg1;
                for (int var14 = 0; ~var14 > ~arg2; ++var14) {
                    var10[var12++] = arg5[var13++];
                }
            }
            arg5 = var10;
        }
        super.field3354.method2236(this, 124);
        if (!arg7) {
            if (arg2 != arg4) {
                OpenGL.glPixelStorei(3314, arg4);
            }
            OpenGL.glTexSubImage2Di(super.field3364, 0, arg6, arg8, arg2, arg0, 32993, super.field3354.field5437, arg5, arg1);
            if (~arg2 != ~arg4) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 313)
    public final void method863(byte arg0) {
        if (arg0 != 103) {
            field3161 = null;
        }
        ++field3165;
        OpenGL.glFramebufferTexture2DEXT(this.field3174, this.field3167, super.field3364, 0, 0);
        this.field3167 = -1;
        this.field3174 = -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIB)V", line = 326)
    public final void method1498(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.field3364, super.field3362, arg2);
        ++field3166;
        this.field3167 = arg0;
        if (arg3 > 71) {
            this.field3174 = arg1;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIZ)V", line = 350)
    public final void method1499(boolean arg0, int arg1, boolean arg2) {
        ++field3163;
        if (arg1 != 0) {
            this.field3169 = 21;
        }
        if (super.field3364 == 3553) {
            super.field3354.method2236(this, 124);
            OpenGL.glTexParameteri(super.field3364, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field3364, 10243, !arg0 ? 33071 : 10497);
        }
    }
}
