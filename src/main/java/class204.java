import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class204 extends class747 implements class200 {

    @OriginalMember(owner = "client!tw", name = "E", descriptor = "I")
    private int field2940;

    @OriginalMember(owner = "client!tw", name = "y", descriptor = "I")
    private int field2934;

    @OriginalMember(owner = "client!tw", name = "C", descriptor = "Lsj;")
    public static class460 field2938 = new class460("stellardawn", 1);

    @OriginalMember(owner = "client!tw", name = "x", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!tw", name = "A", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!tw", name = "B", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!tw", name = "D", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!tw", name = "F", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!tw", name = "H", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!tw", name = "J", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!tw", name = "K", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!tw", name = "L", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!tw", name = "M", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!tw", name = "N", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!tw", name = "O", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!tw", name = "P", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!tw", name = "I", descriptor = "Lcs;")
    public static class342 field2944;

    @OriginalMember(owner = "client!tw", name = "G", descriptor = "[[B")
    public static byte[][] field2942;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 4)
    public static final String method1416(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1417((byte) 96);
        }
        ++field2941;
        int var3 = -arg2 + arg0;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (~var3 > 2) {
            return "<col=ff7000>";
        } else if (~var3 > -1) {
            return "<col=ffb000>";
        } else if (~var3 < -10) {
            return "<col=00ff00>";
        } else if (~var3 < -7) {
            return "<col=40ff00>";
        } else if (~var3 < -4) {
            return "<col=80ff00>";
        } else {
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)I", line = 46)
    public final int method1010(int arg0) {
        ++field2949;
        int var2 = 96 % ((arg0 - 55) / 63);
        return this.field2934;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)V", line = 57)
    public static void method1417(byte arg0) {
        if (arg0 != 2) {
            method1416(-45, false, -102);
        }
        field2944 = null;
        field2938 = null;
        field2942 = null;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lbga;II[III)V", line = 71)
    public class204(class358 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class746.field10332, class523.field7249, arg1 * arg2, false);
        this.field2940 = arg1;
        this.field2934 = arg2;
        super.field10335.method4097((byte) 76, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field10346, 0, 6408, this.field2940, this.field2934, 0, 32993, super.field10335.field5169, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lbga;Lwq;II[BII)V", line = 84)
    public class204(class358 arg0, class169 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class523.field7249, arg2 * arg3, false);
        this.field2934 = arg3;
        this.field2940 = arg2;
        super.field10335.method4097((byte) -127, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field10346, 0, this.method4164(126), arg2, arg3, 0, class175.method1310(111, super.field10337), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZZI)V", line = 99)
    public final void method1014(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != 25688) {
            method1420(-82, (byte) -35);
        }
        ++field2939;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lbga;Lwq;Lbaa;II)V", line = 109)
    public class204(class358 arg0, class169 arg1, class523 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field2934 = arg4;
        this.field2940 = arg3;
        super.field10335.method4097((byte) 115, this);
        OpenGL.glTexImage2Dub(super.field10346, 0, this.method4164(109), arg3, arg4, 0, class175.method1310(105, super.field10337), class491.method2898(-54, super.field10341), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)Z", line = 121)
    public static final boolean method1418(int arg0, int arg1) {
        ++field2936;
        if (arg1 != 5126) {
            field2942 = null;
        }
        return arg0 == 0 || ~arg0 == -3;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIII)V", line = 134)
    public static final void method1419(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2948;
        if (arg2 != -648) {
            field2944 = null;
        }
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        class47.method550(arg2 + 621, arg1 + arg4, class691.field9345[arg0], -arg4 + arg1, arg3);
        while (~var6 < ~var5) {
            var8 += 2;
            var7 += var8;
            ++var5;
            if (~var7 <= -1) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class691.field9345[arg0 - -var6];
                int[] var10 = class691.field9345[-var6 + arg0];
                int var11 = arg1 + var5;
                int var12 = -var5 + arg1;
                class47.method550(-27, var11, var9, var12, arg3);
                class47.method550(-27, var11, var10, var12, arg3);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class691.field9345[arg0 + var5];
            int[] var16 = class691.field9345[-var5 + arg0];
            class47.method550(arg2 + 621, var13, var15, var14, arg3);
            class47.method550(-27, var13, var16, var14, arg3);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I[IIIIBI)V", line = 190)
    public final void method1008(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field2945;
        if (arg5 != 112) {
            this.field2934 = 49;
        }
        int[] var8 = new int[this.field2940 * this.field2934];
        super.field10335.method4097((byte) -34, this);
        OpenGL.glGetTexImagei(super.field10346, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~var9 > ~arg4; ++var9) {
            class363.method2320(var8, (-var9 + arg3 + arg4 + -1) * this.field2940, arg1, arg2 * var9 + arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FI)F", line = 215)
    public final float method1004(float arg0, int arg1) {
        if (arg1 <= 69) {
            field2942 = null;
        }
        ++field2946;
        return arg0;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lbga;Lwq;II[FII)V", line = 227)
    public class204(class358 arg0, class169 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class523.field7253, arg2 * arg3, false);
        this.field2940 = arg2;
        this.field2934 = arg3;
        super.field10335.method4097((byte) -45, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field10346, 0, this.method4164(107), arg2, arg3, 0, class175.method1310(126, super.field10337), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BF)F", line = 242)
    public final float method1002(byte arg0, float arg1) {
        if (arg0 > -24) {
            this.method1004(-1.6376895F, -84);
        }
        ++field2937;
        return arg1;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)Z", line = 254)
    public final boolean method1011(int arg0) {
        if (arg0 <= 84) {
            this.method1013(-26, 9, (int[]) null, -21, 80, 34, 77, -73);
        }
        ++field2935;
        return false;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)I", line = 265)
    public final int method1009(boolean arg0) {
        ++field2951;
        if (arg0) {
            this.field2940 = -103;
        }
        return this.field2940;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II[IIIIII)V", line = 276)
    public final void method1013(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field10335.method4097((byte) 118, this);
        ++field2950;
        if (~arg0 == -1) {
            arg0 = arg5;
        }
        if (arg0 != arg5) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field10346, 0, arg3, arg6, arg5, arg7, 32993, super.field10335.field5169, arg2, arg4);
        if (~arg0 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg1 != 22809) {
            this.field2934 = 115;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIBIIII[BLwq;)V", line = 299)
    public final void method1007(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class169 arg8) {
        super.field10335.method4097((byte) -39, this);
        ++field2947;
        if (~arg3 == -1) {
            arg3 = arg5;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 >= -4) {
            method1416(74, false, -106);
        }
        if (arg3 != arg5) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field10346, 0, arg6, arg0, arg5, arg4, class175.method1310(120, arg8), 5121, arg7, arg1);
        if (~arg3 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(IB)V", line = 326)
    public static final void method1420(int arg0, byte arg1) {
        if (arg1 > -79) {
            method1418(127, 53);
        }
        if (~class640.field8799 != -2) {
            if (class640.field8799 == 2) {
                class667.field9106 = arg0;
            }
        } else {
            class368.field5241 = arg0;
        }
        ++field2943;
    }
}
