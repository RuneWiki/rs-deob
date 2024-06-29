import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class629 extends class418 {

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    private int field9206 = -1;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    private int field9200 = -1;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public int field9198;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public int field9202;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "[[S")
    public static short[][] field9205;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIIII)V")
    public final void method3660(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9201;
        int var8 = -arg2 + super.field5883.field8027 + -arg0;
        super.field5883.method3358(32886, this);
        if (arg1 != 37) {
            this.field9202 = -61;
        }
        OpenGL.glCopyTexSubImage2D(super.field5882, 0, arg5, this.field9198 - arg4 + -arg2, arg3, var8, arg6, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public static final void method3661(int arg0) {
        if (arg0 != 0) {
            field9205 = null;
        }
        if (class288.field3965 != 3 && class637.field9283.field2680 != -1) {
            class483.method2807(18205, class637.field9283.field2680, class637.field9283.field2686);
        }
        ++field9207;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lgi;IIIIZ[IZ)V")
    public class629(class583 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9198 = arg4;
        this.field9202 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 + -1) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field5883.method3358(32886, this);
        if (arg5 && ~super.field5882 != -34038) {
            class5.method34(super.field5883.field8279, this.field9202, 32993, super.field5889, super.field5882, 25951, this.field9198, arg6);
            this.method2509(10240, true);
        } else {
            OpenGL.glTexImage2Di(super.field5882, 0, super.field5889, this.field9202, this.field9198, 0, 32993, super.field5883.field8279, arg6, 0);
            this.method2509(10240, false);
        }
        this.method2513(false, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([IIIIIIZII)V")
    public final void method3662(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (~arg7 == -1) {
            arg7 = arg3;
        }
        ++field9204;
        if (arg6) {
            int[] var10 = new int[arg3 * arg8];
            for (int var11 = 0; ~var11 > ~arg8; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg8 + -1) * arg7 + arg5;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg0[var13++];
                }
            }
            arg0 = var10;
        }
        super.field5883.method3358(32886, this);
        if (~arg3 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        if (arg4 == 3314) {
            OpenGL.glTexSubImage2Di(super.field5882, 0, arg2, arg1, arg3, arg8, 32993, super.field5883.field8279, arg0, arg5);
            if (~arg3 != ~arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZ)V")
    public final void method3663(int arg0, int arg1, int arg2, boolean arg3) {
        ++field9197;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.field5882, super.field5879, arg2);
        this.field9200 = arg0;
        if (arg3) {
            this.field9202 = -118;
        }
        this.field9206 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lgi;IIIIZ[BIZ)V")
    public class629(class583 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9202 = arg3;
        this.field9198 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field5883.method3358(32886, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field5882 != 34037) {
            class531.method3056(arg4, arg6, 35, arg1, arg2, arg7, arg3);
            this.method2509(10240, true);
        } else {
            OpenGL.glTexImage2Dub(super.field5882, 0, super.field5889, this.field9202, this.field9198, 0, arg7, 5121, arg6, 0);
            this.method2509(10240, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2513(false, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public final void method1220(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field9200, this.field9206, super.field5882, 0, 0);
        ++field9199;
        if (arg0 == 73) {
            this.field9206 = -1;
            this.field9200 = -1;
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public static void method3664(int arg0) {
        if (arg0 != 32993) {
            field9205 = null;
        }
        field9205 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lgi;IIIII)V")
    public class629(class583 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field9202 = arg4;
        this.field9198 = arg5;
        int var7 = -arg3 + super.field5883.field8027 + -arg5;
        super.field5883.method3358(32886, this);
        OpenGL.glCopyTexImage2D(super.field5882, 0, super.field5889, arg2, var7, arg4, arg5, 0);
        this.method2513(false, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZZI[BIII)V")
    public final void method3665(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        if (arg8 == 0) {
            arg8 = arg1;
        }
        ++field9203;
        if (arg4) {
            int var11 = class23.method261(2941, arg2);
            int var12 = arg1 * var11;
            int var13 = arg8 * var11;
            byte[] var14 = new byte[arg7 * var12];
            for (int var15 = 0; ~arg7 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg7 + -1) * var13 + arg9;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg6[var17++];
                }
            }
            arg6 = var14;
        }
        if (arg3) {
            this.field9206 = 8;
        }
        super.field5883.method3358(32886, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 != arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Dub(super.field5882, 0, arg0, arg5, arg1, arg7, arg2, 5121, arg6, arg9);
        if (~arg1 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lgi;IIIIZ[FI)V")
    public class629(class583 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9202 = arg3;
        this.field9198 = arg4;
        super.field5883.method3358(32886, this);
        if (arg5 && ~super.field5882 != -34038) {
            class278.method1787(arg2, 1051103841, arg6, arg4, arg1, arg7, arg3);
            this.method2509(10240, true);
        } else {
            OpenGL.glTexImage2Df(super.field5882, 0, super.field5889, this.field9202, this.field9198, 0, arg7, 5126, arg6, 0);
            this.method2509(10240, false);
        }
        this.method2513(false, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZZ)V")
    public final void method3666(int arg0, boolean arg1, boolean arg2) {
        if (~super.field5882 == -3554) {
            super.field5883.method3358(32886, this);
            OpenGL.glTexParameteri(super.field5882, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field5882, 10243, arg2 ? 10497 : 33071);
        }
        if (arg0 >= 25) {
            ++field9196;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lgi;IIII)V")
    public class629(class583 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field9202 = arg3;
        this.field9198 = arg4;
        super.field5883.method3358(32886, this);
        OpenGL.glTexImage2Dub(super.field5882, 0, super.field5889, arg3, arg4, 0, class92.method678(-24501, super.field5889), 5121, (byte[]) null, 0);
        this.method2513(false, true);
    }

    static {
        new class104("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field9205 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };
    }
}
