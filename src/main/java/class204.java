import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class204 extends class396 {

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
    private int field2922 = -1;

    @OriginalMember(owner = "client!fq", name = "C", descriptor = "I")
    private int field2929 = -1;

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!fq", name = "H", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!fq", name = "G", descriptor = "[B")
    public static byte[] field2933 = new byte[2048];

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!fq", name = "D", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!fq", name = "E", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!fq", name = "F", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!fq", name = "I", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!fq", name = "J", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!fq", name = "B", descriptor = "Ltba;")
    public static class320 field2928;

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lep;IIIIZ[FI)V", line = 4)
    public class204(class371 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2924 = arg4;
        this.field2934 = arg3;
        super.field5514.method2154(this, -2);
        if (arg5 && super.field5510 != 34037) {
            class322.method1886(arg4, arg1, arg2, (byte) 110, arg3, arg7, arg6);
            this.method2410((byte) -48, true);
        } else {
            OpenGL.glTexImage2Df(super.field5510, 0, super.field5509, this.field2934, this.field2924, 0, arg7, 5126, arg6, 0);
            this.method2410((byte) -109, false);
        }
        this.method2419(true, true);
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V", line = 27)
    public static final void method1360(int arg0) {
        class238.field3313.method3122(0);
        ++field2931;
        class210.field2985 = arg0;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lep;IIIIZ[BIZ)V", line = 41)
    public class204(class371 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2924 = arg4;
        this.field2934 = arg3;
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
        super.field5514.method2154(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field5510 != 34037) {
            class471.method2806(arg6, arg4, arg2, arg7, arg1, 115, arg3);
            this.method2410((byte) -83, true);
        } else {
            OpenGL.glTexImage2Dub(super.field5510, 0, super.field5509, this.field2934, this.field2924, 0, arg7, 5121, arg6, 0);
            this.method2410((byte) -83, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2419(true, true);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lep;IIII)V", line = 120)
    public class204(class371 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2924 = arg4;
        this.field2934 = arg3;
        super.field5514.method2154(this, -2);
        OpenGL.glTexImage2Dub(super.field5510, 0, super.field5509, arg3, arg4, 0, class743.method4144(super.field5509, 6410), 5121, (byte[]) null, 0);
        this.method2419(true, true);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lep;IIIII)V", line = 183)
    public class204(class371 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2934 = arg4;
        this.field2924 = arg5;
        int var7 = -arg5 - (arg3 - super.field5514.field4894);
        super.field5514.method2154(this, -2);
        OpenGL.glCopyTexImage2D(super.field5510, 0, super.field5509, arg2, var7, arg4, arg5, 0);
        this.method2419(true, true);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lep;IIIIZ[IIIZ)V", line = 272)
    public class204(class371 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2934 = arg3;
        this.field2924 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + arg4 + -1) * arg3;
                for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field5514.method2154(this, -2);
        if (super.field5510 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class616.method3618(super.field5514.field5075, this.field2934, arg6, 32993, super.field5509, (byte) -36, this.field2924, super.field5510);
            this.method2410((byte) -73, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field5510, 0, super.field5509, this.field2934, this.field2924, 0, 32993, super.field5514.field5075, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method2410((byte) -117, false);
        }
        this.method2419(true, true);
    }

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "(I)V", line = 94)
    public static final void method1361(int arg0) {
        ++field2925;
        class8.field80.method2762((byte) -104);
        if (arg0 != -30099) {
            field2928 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 105)
    public final void method527(int arg0) {
        if (arg0 < 123) {
            field2928 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(this.field2929, this.field2922, super.field5510, 0, 0);
        ++field2927;
        this.field2929 = -1;
        this.field2922 = -1;
    }

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "(I)Loj;", line = 133)
    public static final class211 method1362(int arg0) {
        if (arg0 > -84) {
            return null;
        } else {
            ++field2923;
            try {
                return (class211) Class.forName("kaa").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIIII)V", line = 150)
    public final void method1363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2926;
        int var8 = -arg3 - arg5 + super.field5514.field4894;
        super.field5514.method2154(this, -2);
        OpenGL.glCopyTexSubImage2D(super.field5510, arg2, arg0, -arg6 + this.field2924 + -arg3, arg4, var8, arg1, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZZI)V", line = 165)
    public final void method1364(boolean arg0, boolean arg1, int arg2) {
        if (super.field5510 == 3553) {
            super.field5514.method2154(this, arg2 + -10244);
            OpenGL.glTexParameteri(super.field5510, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field5510, 10243, !arg1 ? 33071 : 10497);
        }
        if (arg2 != 10242) {
            this.field2922 = -53;
        }
        ++field2935;
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(B)V", line = 200)
    public static void method1365(byte arg0) {
        if (arg0 != 15) {
            method1362(72);
        }
        field2928 = null;
        field2933 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBIIZ[BIIII)V", line = 212)
    public final void method1366(int arg0, byte arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg3 == -1) {
            arg3 = arg6;
        }
        ++field2930;
        if (arg1 == 20) {
            if (arg4) {
                int var11 = class162.method1011((byte) -83, arg9);
                int var12 = arg6 * var11;
                int var13 = arg3 * var11;
                byte[] var14 = new byte[arg7 * var12];
                for (int var15 = 0; var15 < arg7; ++var15) {
                    int var16 = var12 * var15;
                    int var17 = (arg7 - (var15 + 1)) * var13 + arg0;
                    for (int var18 = 0; ~var18 > ~var12; ++var18) {
                        var14[var16++] = arg5[var17++];
                    }
                }
                arg5 = var14;
            }
            super.field5514.method2154(this, arg1 + -22);
            OpenGL.glPixelStorei(3317, 1);
            if (arg3 != arg6) {
                OpenGL.glPixelStorei(3314, arg3);
            }
            OpenGL.glTexSubImage2Dub(super.field5510, 0, arg8, arg2, arg6, arg7, arg9, 5121, arg5, arg0);
            if (~arg3 != ~arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Lfw;", line = 326)
    public static final class217 method1367(int arg0, int arg1, int arg2) {
        class38 var3 = class352.field4549[arg0][arg1][arg2];
        return var3 == null ? null : var3.field539;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[IIIIIIIZ)V", line = 336)
    public final void method1368(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (arg0 >= -121) {
            method1367(-76, 73, 85);
        }
        ++field2932;
        if (~arg5 == -1) {
            arg5 = arg7;
        }
        if (arg8) {
            int[] var10 = new int[arg2 * arg7];
            for (int var11 = 0; arg2 > var11; ++var11) {
                int var12 = arg7 * var11;
                int var13 = (-var11 + arg2 + -1) * arg5 + arg4;
                for (int var14 = 0; ~var14 > ~arg7; ++var14) {
                    var10[var12++] = arg1[var13++];
                }
            }
            arg1 = var10;
        }
        super.field5514.method2154(this, -2);
        if (~arg5 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Di(super.field5510, 0, arg6, arg3, arg7, arg2, 32993, super.field5514.field5075, arg1, arg4);
        if (~arg5 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIZI)V", line = 389)
    public final void method1369(int arg0, int arg1, boolean arg2, int arg3) {
        ++field2936;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, super.field5510, super.field5507, arg1);
        this.field2929 = arg0;
        if (!arg2) {
            method1360(-1);
        }
        this.field2922 = arg3;
    }
}
