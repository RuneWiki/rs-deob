import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class532 extends class427 {

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    private int field7805 = -1;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    private int field7806 = -1;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public int field7799;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public int field7803;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "Lbi;")
    public static class104 field7811 = new class104(40, 10);

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "Lbi;")
    public static class104 field7813 = new class104(49, 3);

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lna;IIIII)V")
    public class532(class211 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field7799 = arg4;
        this.field7803 = arg5;
        int var7 = -arg3 + -arg5 + super.field6451.field3433;
        super.field6451.method1540(125, this);
        OpenGL.glCopyTexImage2D(super.field6455, 0, super.field6449, arg2, var7, arg4, arg5, 0);
        this.method2703(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static void method3158(byte arg0) {
        if (arg0 >= -72) {
            method3158((byte) -55);
        }
        field7813 = null;
        field7811 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBIII)V")
    public final void method3159(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field7802;
        int var8 = -arg1 + super.field6451.field3433 + -arg2;
        super.field6451.method1540(arg3 + 86, this);
        OpenGL.glCopyTexSubImage2D(super.field6455, 0, arg0, -arg5 + this.field7803 - arg1, arg6, var8, arg4, arg1);
        OpenGL.glFlush();
        if (arg3 != 30) {
            method3165(-116, 75, false, -40);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZBZ)V")
    public final void method3160(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 != 50) {
            this.method3159(54, -41, 125, (byte) -118, 121, -17, -81);
        }
        if (~super.field6455 == -3554) {
            super.field6451.method1540(94, this);
            OpenGL.glTexParameteri(super.field6455, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field6455, 10243, arg0 ? 10497 : 33071);
        }
        ++field7800;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lna;IIIIZ[FI)V")
    public class532(class211 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field7803 = arg4;
        this.field7799 = arg3;
        super.field6451.method1540(92, this);
        if (arg5 && super.field6455 != 34037) {
            class20.method124(arg4, arg3, -65, arg1, arg7, arg6, arg2);
            this.method2705(true, (byte) 49);
        } else {
            OpenGL.glTexImage2Df(super.field6455, 0, super.field6449, this.field7799, this.field7803, 0, arg7, 5126, arg6, 0);
            this.method2705(false, (byte) 47);
        }
        this.method2703(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7810;
        if (class385.method2479(0, arg0)) {
            if (arg7 != -1) {
                method3162(-65, (byte) 115);
            }
            if (class462.field7111[arg0] != null) {
                class302.method2031(arg8, 0, arg5, class462.field7111[arg0], arg3, arg6, arg4, -1, arg1, arg2);
            } else {
                class302.method2031(arg8, ~arg7, arg5, class433.field6540[arg0], arg3, arg6, arg4, -1, arg1, arg2);
            }
        } else if (arg3 != -1) {
            class520.field7707[arg3] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class520.field7707[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)I")
    public static final int method3162(int arg0, byte arg1) {
        ++field7807;
        if (arg1 != 24) {
            field7813 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZ[IIIIII)V")
    public final void method3163(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == arg5) {
            arg4 = arg6;
        }
        ++field7801;
        if (arg2) {
            int[] var10 = new int[arg0 * arg6];
            for (int var11 = 0; arg0 > var11; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (-var11 + -1 + arg0) * arg4 + arg7;
                for (int var14 = 0; ~arg6 < ~var14; ++var14) {
                    var10[var12++] = arg3[var13++];
                }
            }
            arg3 = var10;
        }
        super.field6451.method1540(66, this);
        if (~arg4 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field6455, 0, arg8, arg1, arg6, arg0, 32993, super.field6451.field3609, arg3, arg7);
        if (arg4 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public final void method82(int arg0) {
        ++field7804;
        OpenGL.glFramebufferTexture2DEXT(this.field7805, this.field7806, super.field6455, 0, 0);
        this.field7805 = -1;
        this.field7806 = -1;
        if (arg0 <= 16) {
            this.method82(-79);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII[BZIIIZ)V")
    public final void method3164(int arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5, int arg6, int arg7, int arg8, boolean arg9) {
        ++field7808;
        if (~arg0 == -1) {
            arg0 = arg1;
        }
        if (arg5) {
            int var11 = class202.method1381(-32842, arg3);
            int var12 = arg1 * var11;
            int var13 = arg0 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; arg6 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + -1 + arg6) * var13 + arg8;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg4[var17++];
                }
            }
            arg4 = var14;
        }
        super.field6451.method1540(126, this);
        OpenGL.glPixelStorei(3317, 1);
        if (!arg9) {
            method3165(127, 67, true, 94);
        }
        if (~arg0 != ~arg1) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field6455, 0, arg7, arg2, arg1, arg6, arg3, 5121, arg4, arg8);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZI)I")
    public static final int method3165(int arg0, int arg1, boolean arg2, int arg3) {
        ++field7812;
        if (class53.field732 == null) {
            return 0;
        } else {
            if (arg2) {
                method3158((byte) 20);
            }
            int var4 = arg1 >> 7;
            int var5 = arg3 >> 7;
            if (var4 >= 0 && ~var5 <= -1 && ~(class135.field1839 - 1) <= ~var4 && ~(class197.field3038 + -1) <= ~var5) {
                int var6 = arg0;
                if (arg0 < 3 && (class416.field6309[1][var4][var5] & 2) != 0) {
                    var6 = arg0 + 1;
                }
                return class53.field732[var6].method692(arg1, arg3);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lna;IIII)V")
    public class532(class211 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field7799 = arg3;
        this.field7803 = arg4;
        super.field6451.method1540(41, this);
        OpenGL.glTexImage2Dub(super.field6455, 0, super.field6449, arg3, arg4, 0, class531.method3157(6406, super.field6449), 5121, (byte[]) null, 0);
        this.method2703(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lna;IIIIZ[BIZ)V")
    public class532(class211 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field7803 = arg4;
        this.field7799 = arg3;
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
        super.field6451.method1540(113, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field6455 != -34038) {
            class542.method3194(arg7, arg4, arg2, (byte) -12, arg1, arg3, arg6);
            this.method2705(true, (byte) 115);
        } else {
            OpenGL.glTexImage2Dub(super.field6455, 0, super.field6449, this.field7799, this.field7803, 0, arg7, 5121, arg6, 0);
            this.method2705(false, (byte) 91);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2703(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIB)V")
    public final void method3166(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 4) {
            field7811 = null;
        }
        ++field7809;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg0, super.field6455, super.field6471, arg1);
        this.field7805 = arg2;
        this.field7806 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lna;IIIIZ[IZ)V")
    public class532(class211 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field7803 = arg4;
        this.field7799 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; var10 < arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + -1 + arg4) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field6451.method1540(107, this);
        if (arg5 && ~super.field6455 != -34038) {
            class225.method1625(super.field6455, 32993, arg6, this.field7799, this.field7803, super.field6451.field3609, 32993, super.field6449);
            this.method2705(true, (byte) 105);
        } else {
            OpenGL.glTexImage2Di(super.field6455, 0, super.field6449, this.field7799, this.field7803, 0, 32993, super.field6451.field3609, arg6, 0);
            this.method2705(false, (byte) 88);
        }
        this.method2703(0, true);
    }
}
