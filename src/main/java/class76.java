import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class76 extends class195 {

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "I")
    private int field1057 = -1;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    private int field1059 = -1;

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!aw", name = "x", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "Lqe;")
    public static class469 field1056 = new class469(75, 8);

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    public static int field1064 = 0;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "Lio;")
    public static class439 field1065 = new class439(3, 2);

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "[Lpga;")
    public static class536[] field1063;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 3)
    public final void method106(int arg0) {
        ++field1061;
        if (arg0 < 14) {
            this.method631(87, -27, -16, -13);
        }
        OpenGL.glFramebufferTexture2DEXT(this.field1057, this.field1059, super.field2957, 0, 0);
        this.field1059 = -1;
        this.field1057 = -1;
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lwh;IIIIZ[FI)V", line = 16)
    public class76(class148 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1055 = arg3;
        this.field1050 = arg4;
        super.field2967.method1088(this, -27749);
        if (arg5 && super.field2957 != 34037) {
            class614.method3554(arg1, arg6, arg2, arg7, arg4, 1057731168, arg3);
            this.method1354(true, 15771);
        } else {
            OpenGL.glTexImage2Df(super.field2957, 0, super.field2956, this.field1055, this.field1050, 0, arg7, 5126, arg6, 0);
            this.method1354(false, 15771);
        }
        this.method1362(true, 1287);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIII)I", line = 38)
    public static final int method630(int arg0, int arg1, int arg2, int arg3) {
        ++field1051;
        int var4 = arg2 & 3;
        if (arg0 != 10243) {
            field1063 = null;
        }
        if (var4 == 0) {
            return arg3;
        } else if (~var4 == -2) {
            return -arg1 + 4095;
        } else {
            return var4 == 2 ? -arg3 + 4095 : arg1;
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(IIII)V", line = 61)
    public final void method631(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg0, super.field2957, super.field2958, arg3);
        if (arg1 == 0) {
            ++field1054;
            this.field1057 = arg2;
            this.field1059 = arg0;
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lwh;IIIIZ[BIZ)V", line = 78)
    public class76(class148 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1055 = arg3;
        this.field1050 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2967.method1088(this, -27749);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field2957 != -34038) {
            class238.method1575(arg3, arg2, arg6, arg1, arg7, arg4, -7);
            this.method1354(true, 15771);
        } else {
            OpenGL.glTexImage2Dub(super.field2957, 0, super.field2956, this.field1055, this.field1050, 0, arg7, 5121, arg6, 0);
            this.method1354(false, 15771);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1362(true, 1287);
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lwh;IIIIZ[IIIZ)V", line = 133)
    public class76(class148 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1055 = arg3;
        this.field1050 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; var12 < arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 - (var12 + 1)) * arg3;
                for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field2967.method1088(this, -27749);
        if (super.field2957 != 34037 && arg5 && ~arg7 == -1 && arg8 == 0) {
            class20.method110(arg6, this.field1055, 32993, 0, this.field1050, super.field2956, super.field2957, super.field2967.field2265);
            this.method1354(true, 15771);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field2957, 0, super.field2956, this.field1055, this.field1050, 0, 32993, super.field2967.field2265, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method1354(false, 15771);
        }
        this.method1362(true, 1287);
    }

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "(B)V", line = 187)
    public static void method632(byte arg0) {
        field1056 = null;
        field1063 = null;
        if (arg0 == -45) {
            field1065 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIII)V", line = 199)
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1060;
        int var8 = -arg0 - (arg5 - super.field2967.field2007);
        super.field2967.method1088(this, -27749);
        OpenGL.glCopyTexSubImage2D(super.field2957, arg3, arg4, -arg0 + -arg2 + this.field1050, arg6, var8, arg1, arg0);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(III[IZIIII)V", line = 212)
    public final void method634(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1052;
        if (~arg1 == -1) {
            arg1 = arg0;
        }
        if (arg4) {
            int[] var10 = new int[arg0 * arg5];
            for (int var11 = 0; ~var11 > ~arg5; ++var11) {
                int var12 = arg0 * var11;
                int var13 = (arg5 - 1 + -var11) * arg1 - -arg7;
                for (int var14 = 0; ~arg0 < ~var14; ++var14) {
                    var10[var12++] = arg3[var13++];
                }
            }
            arg3 = var10;
        }
        super.field2967.method1088(this, arg6 ^ -27745);
        if (~arg0 != ~arg1) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        if (arg6 != 4) {
            method632((byte) 83);
        }
        OpenGL.glTexSubImage2Di(super.field2957, 0, arg2, -arg5 + this.field1050 - arg8, arg0, arg5, 32993, super.field2967.field2265, arg3, arg7);
        if (~arg0 != ~arg1) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lwh;IIIII)V", line = 263)
    public class76(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field1050 = arg5;
        this.field1055 = arg4;
        int var7 = -arg3 + -arg5 + super.field2967.field2007;
        super.field2967.method1088(this, -27749);
        OpenGL.glCopyTexImage2D(super.field2957, 0, super.field2956, arg2, var7, arg4, arg5, 0);
        this.method1362(true, 1287);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II[BIIIIZII)V", line = 278)
    public final void method635(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        ++field1058;
        if (arg0 == arg9) {
            arg9 = arg1;
        }
        if (arg7) {
            int var11 = class157.method1158(false, arg6);
            int var12 = arg1 * var11;
            int var13 = arg9 * var11;
            byte[] var14 = new byte[arg4 * var12];
            for (int var15 = 0; var15 < arg4; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg4 - 1) * var13 + arg5;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg2[var17++];
                }
            }
            arg2 = var14;
        }
        super.field2967.method1088(this, arg0 + -27749);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg9) {
            OpenGL.glPixelStorei(3314, arg9);
        }
        OpenGL.glTexSubImage2Dub(super.field2957, 0, arg3, arg8, arg1, arg4, arg6, 5121, arg2, arg5);
        if (arg1 != arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZIZ)V", line = 335)
    public final void method636(boolean arg0, int arg1, boolean arg2) {
        if (arg1 == 10497) {
            if (~super.field2957 == -3554) {
                super.field2967.method1088(this, arg1 ^ -17766);
                OpenGL.glTexParameteri(super.field2957, 10242, !arg0 ? 33071 : 10497);
                OpenGL.glTexParameteri(super.field2957, 10243, arg2 ? 10497 : 33071);
            }
            ++field1053;
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lwh;IIII)V", line = 363)
    public class76(class148 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field1055 = arg3;
        this.field1050 = arg4;
        super.field2967.method1088(this, -27749);
        OpenGL.glTexImage2Dub(super.field2957, 0, super.field2956, arg3, arg4, 0, class307.method1935(-45, super.field2956), 5121, (byte[]) null, 0);
        this.method1362(true, 1287);
    }
}
