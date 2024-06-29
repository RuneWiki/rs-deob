import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class299 extends class396 {

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    private int field4295 = -1;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    private int field4297 = -1;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public int field4288;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field4291 = 0;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Lva;")
    public static class342 field4298 = null;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "Lsl;")
    public static class318 field4299 = new class318(66, 8);

    @OriginalMember(owner = "client!af", name = "N", descriptor = "Lbg;")
    public static class324 field4301 = new class324(89, 8);

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lfd;IIIIZ[FI)V", line = 3)
    public class299(class365 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4296 = arg3;
        this.field4288 = arg4;
        super.field5800.method2188((byte) 78, this);
        if (arg5 && super.field5801 != 34037) {
            class526.method3122((byte) 100, arg2, arg1, arg6, arg7, arg3, arg4);
            this.method2425(false, true);
        } else {
            OpenGL.glTexImage2Df(super.field5801, 0, super.field5804, this.field4296, this.field4288, 0, arg7, 5126, arg6, 0);
            this.method2425(false, false);
        }
        this.method2421(-3, true);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lfd;IIIIZ[BIZ)V", line = 29)
    public class299(class365 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4296 = arg3;
        this.field4288 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field5800.method2188((byte) 78, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field5801 != -34038) {
            class488.method2939((byte) 117, arg3, arg2, arg4, arg6, arg7, arg1);
            this.method2425(false, true);
        } else {
            OpenGL.glTexImage2Dub(super.field5801, 0, super.field5804, this.field4296, this.field4288, 0, arg7, 5121, arg6, 0);
            this.method2425(false, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2421(106, true);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lfd;IIII)V", line = 84)
    public class299(class365 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field4288 = arg4;
        this.field4296 = arg3;
        super.field5800.method2188((byte) 78, this);
        OpenGL.glTexImage2Dub(super.field5801, 0, super.field5804, arg3, arg4, 0, class454.method2741(super.field5804, 13519), 5121, (byte[]) null, 0);
        this.method2421(95, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)I", line = 96)
    public static final int method1876(boolean arg0, int arg1) {
        if (arg0) {
            field4301 = null;
        }
        ++field4293;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II[BIIIIIZI)V", line = 108)
    public final void method1877(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        ++field4289;
        if (arg9 < 35) {
            field4290 = 62;
        }
        if (~arg5 == -1) {
            arg5 = arg0;
        }
        if (arg8) {
            int var11 = class261.method1676((byte) -11, arg4);
            int var12 = arg0 * var11;
            int var13 = arg5 * var11;
            byte[] var14 = new byte[arg3 * var12];
            for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg3 + -1 + -var15) * var13 + arg6;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg2[var17++];
                }
            }
            arg2 = var14;
        }
        super.field5800.method2188((byte) 78, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg0 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Dub(super.field5801, 0, arg7, arg1, arg0, arg3, arg4, 5121, arg2, arg6);
        if (arg0 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 167)
    public final void method1628(int arg0) {
        ++field4287;
        if (arg0 > 121) {
            OpenGL.glFramebufferTexture2DEXT(this.field4295, this.field4297, super.field5801, 0, 0);
            this.field4295 = -1;
            this.field4297 = -1;
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V", line = 182)
    public static void method1878(int arg0) {
        field4299 = null;
        field4301 = null;
        field4298 = null;
        if (arg0 > -71) {
            method1880((byte) 65, -56, -15);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lfd;IIIIZ[IZ)V", line = 194)
    public class299(class365 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4296 = arg3;
        this.field4288 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 + -1 + -var10) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field5800.method2188((byte) 78, this);
        if (arg5 && ~super.field5801 != -34038) {
            class269.method1729(32993, arg6, super.field5804, this.field4288, this.field4296, super.field5800.field5411, super.field5801, 17054);
            this.method2425(false, true);
        } else {
            OpenGL.glTexImage2Di(super.field5801, 0, super.field5804, this.field4296, this.field4288, 0, 32993, super.field5800.field5411, arg6, 0);
            this.method2425(false, false);
        }
        this.method2421(116, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBIIIII)V", line = 245)
    public final void method1879(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4292;
        int var8 = -arg5 - arg2 + super.field5800.field5153;
        super.field5800.method2188((byte) 78, this);
        OpenGL.glCopyTexSubImage2D(super.field5801, 0, arg3, -arg4 + -arg5 + this.field4288, arg0, var8, arg6, arg5);
        OpenGL.glFlush();
        if (arg1 <= 1) {
            field4290 = -101;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)V", line = 261)
    public static final void method1880(byte arg0, int arg1, int arg2) {
        ++field4300;
        if (arg0 <= 30) {
            field4299 = null;
        }
        class196 var3 = class435.field6370[arg1][arg2];
        if (var3 != null) {
            class460.field6767 = var3.field2850;
            class14.field161 = var3.field2865;
            class156.field2220 = var3.field2862;
        }
        class232.method1557((byte) 84);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lfd;IIIII)V", line = 281)
    public class299(class365 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field4296 = arg4;
        this.field4288 = arg5;
        int var7 = -arg5 + super.field5800.field5153 + -arg3;
        super.field5800.method2188((byte) 78, this);
        OpenGL.glCopyTexImage2D(super.field5801, 0, super.field5804, arg2, var7, arg4, arg5, 0);
        this.method2421(91, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V", line = 296)
    public final void method1881(int arg0, int arg1, int arg2, int arg3) {
        ++field4294;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, super.field5801, super.field5811, arg0);
        int var5 = -69 / ((arg3 - 72) / 43);
        this.field4297 = arg1;
        this.field4295 = arg2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZZ)V", line = 308)
    public final void method1882(int arg0, boolean arg1, boolean arg2) {
        if (super.field5801 == 3553) {
            super.field5800.method2188((byte) 78, this);
            OpenGL.glTexParameteri(super.field5801, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field5801, 10243, arg2 ? 10497 : 33071);
        }
        if (arg0 != 10497) {
            this.method1883(true, -114, 89, 53, (int[]) null, -65, (byte) -76, -38, 93);
        }
        ++field4285;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIII[IIBII)V", line = 329)
    public final void method1883(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (~arg2 == -1) {
            arg2 = arg8;
        }
        ++field4286;
        if (arg0) {
            int[] var10 = new int[arg1 * arg8];
            for (int var11 = 0; arg1 > var11; ++var11) {
                int var12 = arg8 * var11;
                int var13 = (-var11 - 1 + arg1) * arg2 - -arg5;
                for (int var14 = 0; ~var14 > ~arg8; ++var14) {
                    var10[var12++] = arg4[var13++];
                }
            }
            arg4 = var10;
        }
        super.field5800.method2188((byte) 78, this);
        if (~arg2 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        if (arg6 >= -29) {
            this.method1628(-124);
        }
        OpenGL.glTexSubImage2Di(super.field5801, 0, arg7, arg3, arg8, arg1, 32993, super.field5800.field5411, arg4, arg5);
        if (~arg2 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
