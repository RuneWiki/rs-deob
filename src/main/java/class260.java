import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class260 extends class446 {

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    private int field3834 = -1;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    private int field3833 = -1;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "[I")
    public static int[] field3836 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[BIIIBIIIZ)V", line = 6)
    public final void method1723(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, boolean arg9) {
        ++field3826;
        if (~arg8 == -1) {
            arg8 = arg3;
        }
        if (arg9) {
            int var11 = class414.method2490(-31968, arg4);
            int var12 = arg3 * var11;
            int var13 = arg8 * var11;
            byte[] var14 = new byte[arg2 * var12];
            for (int var15 = 0; ~arg2 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg2 + -1) * var13 + arg0;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg1[var17++];
                }
            }
            arg1 = var14;
        }
        super.field6637.method2200(this, (byte) 113);
        OpenGL.glPixelStorei(3317, 1);
        if (arg3 != arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Dub(super.field6633, 0, arg6, arg7, arg3, arg2, arg4, 5121, arg1, arg0);
        if (~arg3 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg5 >= -92) {
            this.method1724(-45, -56, -122, (byte) 17);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIB)V", line = 66)
    public final void method1724(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > 9) {
            ++field3832;
            OpenGL.glFramebufferTexture2DEXT(arg2, arg0, super.field6633, super.field6640, arg1);
            this.field3834 = arg0;
            this.field3833 = arg2;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lod;IIIIZ[BIZ)V", line = 80)
    public class260(class349 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3828 = arg3;
        this.field3831 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - var11 - 1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field6637.method2200(this, (byte) 122);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field6633 != 34037) {
            class20.method129(arg4, (byte) -128, arg7, arg1, arg2, arg3, arg6);
            this.method2682(9984, true);
        } else {
            OpenGL.glTexImage2Dub(super.field6633, 0, super.field6646, this.field3828, this.field3831, 0, arg7, 5121, arg6, 0);
            this.method2682(9984, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2683(true, 0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)V", line = 133)
    public final void method1725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3823;
        if (arg1 != 9489) {
            this.method1724(88, 89, 11, (byte) 22);
        }
        int var8 = -arg2 + -arg6 + super.field6637.field5175;
        super.field6637.method2200(this, (byte) 125);
        OpenGL.glCopyTexSubImage2D(super.field6633, 0, arg0, this.field3831 - (arg5 + arg6), arg3, var8, arg4, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 151)
    public final void method1726(int arg0) {
        ++field3830;
        OpenGL.glFramebufferTexture2DEXT(this.field3833, this.field3834, super.field6633, arg0, 0);
        this.field3833 = -1;
        this.field3834 = -1;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lod;IIIIZ[FI)V", line = 162)
    public class260(class349 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3831 = arg4;
        this.field3828 = arg3;
        super.field6637.method2200(this, (byte) 127);
        if (arg5 && super.field6633 != 34037) {
            class148.method972(arg4, arg2, arg3, (byte) -86, arg1, arg7, arg6);
            this.method2682(9984, true);
        } else {
            OpenGL.glTexImage2Df(super.field6633, 0, super.field6646, this.field3828, this.field3831, 0, arg7, 5126, arg6, 0);
            this.method2682(9984, false);
        }
        this.method2683(true, 0);
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)V", line = 184)
    public static void method1727(int arg0) {
        field3836 = null;
        if (arg0 != 25173) {
            method1729(117);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lod;IIII)V", line = 197)
    public class260(class349 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3831 = arg4;
        this.field3828 = arg3;
        super.field6637.method2200(this, (byte) 124);
        OpenGL.glTexImage2Dub(super.field6633, 0, super.field6646, arg3, arg4, 0, class301.method1901(super.field6646, false), 5121, (byte[]) null, 0);
        this.method2683(true, 0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZIII[III)V", line = 209)
    public final void method1728(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        ++field3829;
        if (~arg4 == -1) {
            arg4 = arg8;
        }
        if (arg2) {
            int[] var10 = new int[arg1 * arg8];
            for (int var11 = 0; var11 < arg1; ++var11) {
                int var12 = arg8 * var11;
                int var13 = (arg1 - 1 + -var11) * arg4 - -arg3;
                for (int var14 = 0; ~arg8 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field6637.method2200(this, (byte) 118);
        if (arg7 != 3) {
            field3825 = -9;
        }
        if (~arg4 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field6633, 0, arg5, arg0, arg8, arg1, 32993, super.field6637.field5340, arg6, arg3);
        if (~arg4 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lod;IIIIZ[IZ)V", line = 266)
    public class260(class349 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3828 = arg3;
        this.field3831 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - (var10 - -1)) * arg3;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field6637.method2200(this, (byte) 121);
        if (arg5 && ~super.field6633 != -34038) {
            class524.method3100(255, super.field6633, arg6, this.field3828, 32993, super.field6637.field5340, this.field3831, super.field6646);
            this.method2682(9984, true);
        } else {
            OpenGL.glTexImage2Di(super.field6633, 0, super.field6646, this.field3828, this.field3831, 0, 32993, super.field6637.field5340, arg6, 0);
            this.method2682(9984, false);
        }
        this.method2683(true, 0);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lod;IIIII)V", line = 357)
    public class260(class349 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3828 = arg4;
        this.field3831 = arg5;
        int var7 = -arg5 + super.field6637.field5175 + -arg3;
        super.field6637.method2200(this, (byte) 113);
        OpenGL.glCopyTexImage2D(super.field6633, 0, super.field6646, arg2, var7, arg4, arg5, 0);
        this.method2683(true, 0);
    }

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "(I)V", line = 319)
    public static final void method1729(int arg0) {
        if (arg0 != -32631) {
            field3836 = null;
        }
        if (class432.field6459 != 3) {
            class102.field1474 = -1;
        }
        ++field3835;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZIZ)V", line = 333)
    public final void method1730(boolean arg0, int arg1, boolean arg2) {
        ++field3824;
        if (arg1 == 10497) {
            if (super.field6633 == 3553) {
                super.field6637.method2200(this, (byte) 118);
                OpenGL.glTexParameteri(super.field6633, 10242, !arg0 ? 33071 : 10497);
                OpenGL.glTexParameteri(super.field6633, 10243, !arg2 ? 33071 : 10497);
            }
        }
    }
}
