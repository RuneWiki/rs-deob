import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class182 extends class400 {

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    private int field2223 = -1;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    private int field2220 = -1;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "F")
    public static float field2217;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Lob;")
    public static class769 field2224;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIB)V")
    public final void method1215(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = -30 / ((-40 - arg3) / 41);
        ++field2216;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, super.field5235, super.field5223, arg0);
        this.field2223 = arg1;
        this.field2220 = arg2;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
    public static void method1216(boolean arg0) {
        field2224 = null;
        if (arg0) {
            field2217 = -0.6836051F;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZI[IIIII)V")
    public final void method1217(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2218;
        if (arg3 == arg7) {
            arg3 = arg1;
        }
        if (arg2) {
            int[] var10 = new int[arg1 * arg8];
            for (int var11 = 0; var11 < arg8; ++var11) {
                int var12 = arg1 * var11;
                int var13 = (-var11 + -1 + arg8) * arg3 + arg6;
                for (int var14 = 0; var14 < arg1; ++var14) {
                    var10[var12++] = arg4[var13++];
                }
            }
            arg4 = var10;
        }
        super.field5229.method3936(false, this);
        if (~arg1 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Di(super.field5235, 0, arg0, this.field2221 - (arg5 - -arg8), arg1, arg8, 32993, super.field5229.field9778, arg4, arg6);
        if (arg1 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZI[BIBIIII)V")
    public final void method1218(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2213;
        if (~arg8 == -1) {
            arg8 = arg9;
        }
        if (arg1) {
            int var11 = class65.method546(arg0, (byte) 91);
            int var12 = arg9 * var11;
            int var13 = arg8 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; var15 < arg6; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg6 - 1) * var13 - -arg7;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field5229.method3936(false, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg8 != ~arg9) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Dub(super.field5235, 0, arg2, arg4, arg9, arg6, arg0, 5121, arg3, arg7);
        if (~arg8 != ~arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg5 < 64) {
            this.method1219(1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lpc;IIIIZ[FI)V")
    public class182(class700 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2215 = arg3;
        this.field2221 = arg4;
        super.field5229.method3936(false, this);
        if (arg5 && super.field5235 != 34037) {
            class16.method205(arg6, 1769, arg2, arg7, arg4, arg3, arg1);
            this.method2345(-1, true);
        } else {
            OpenGL.glTexImage2Df(super.field5235, 0, super.field5236, this.field2215, this.field2221, 0, arg7, 5126, arg6, 0);
            this.method2345(-1, false);
        }
        this.method2347(true, -119);
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lpc;IIII)V")
    public class182(class700 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2221 = arg4;
        this.field2215 = arg3;
        super.field5229.method3936(false, this);
        OpenGL.glTexImage2Dub(super.field5235, 0, super.field5236, arg3, arg4, 0, class17.method215((byte) -97, super.field5236), 5121, (byte[]) null, 0);
        this.method2347(true, 78);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public final void method1219(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field2220, this.field2223, super.field5235, 0, 0);
        ++field2222;
        if (arg0 > -96) {
            this.method1219(-8);
        }
        this.field2223 = -1;
        this.field2220 = -1;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lpc;IIIIZ[IIIZ)V")
    public class182(class700 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2215 = arg3;
        this.field2221 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~arg4 < ~var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + arg4 - 1) * arg3;
                for (int var15 = 0; var15 < arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field5229.method3936(false, this);
        if (super.field5235 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class313.method1849(arg6, true, super.field5229.field9778, this.field2221, 32993, this.field2215, super.field5236, super.field5235);
            this.method2345(-1, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field5235, 0, super.field5236, this.field2215, this.field2221, 0, 32993, super.field5229.field9778, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method2345(-1, false);
        }
        this.method2347(true, 89);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBIIII)V")
    public final void method1220(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2214;
        int var8 = -arg5 + super.field5229.field9535 + -arg0;
        super.field5229.method3936(false, this);
        OpenGL.glCopyTexSubImage2D(super.field5235, 0, arg6, -arg3 + this.field2221 - arg5, arg1, var8, arg4, arg5);
        if (arg2 != -78) {
            this.field2221 = -89;
        }
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lpc;IIIII)V")
    public class182(class700 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2215 = arg4;
        this.field2221 = arg5;
        int var7 = super.field5229.field9535 - (arg3 + arg5);
        super.field5229.method3936(false, this);
        OpenGL.glCopyTexImage2D(super.field5235, 0, super.field5236, arg2, var7, arg4, arg5, 0);
        this.method2347(true, 69);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIZ)V")
    public final void method1221(boolean arg0, int arg1, boolean arg2) {
        if (super.field5235 == 3553) {
            super.field5229.method3936(false, this);
            OpenGL.glTexParameteri(super.field5235, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field5235, 10243, arg0 ? 10497 : 33071);
        }
        if (arg1 == -1) {
            ++field2219;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lpc;IIIIZ[BIZ)V")
    public class182(class700 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2215 = arg3;
        this.field2221 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field5229.method3936(false, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field5235 != -34038) {
            class535.method3183(arg4, arg6, -2, arg7, arg1, arg2, arg3);
            this.method2345(-1, true);
        } else {
            OpenGL.glTexImage2Dub(super.field5235, 0, super.field5236, this.field2215, this.field2221, 0, arg7, 5121, arg6, 0);
            this.method2345(-1, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2347(true, -120);
    }
}
