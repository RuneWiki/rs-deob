import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class289 extends class507 {

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    private int field3996 = -1;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    private int field3999 = -1;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    public int field3988;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    public int field3994;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field3991 = 0;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "Lhp;")
    public static class277 field3992 = new class277(4);

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "[I")
    public static int[] field4002 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "Lig;")
    public static class206 field4005 = new class206(101, -1);

    @OriginalMember(owner = "client!cs", name = "S", descriptor = "[I")
    public static int[] field4006 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!cs", name = "T", descriptor = "Lkea;")
    public static class203 field4007;

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lad;IIII)V")
    public class289(class362 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3988 = arg4;
        this.field3994 = arg3;
        super.field7377.method2295(-69, this);
        OpenGL.glTexImage2Dub(super.field7373, 0, super.field7379, arg3, arg4, 0, class562.method3251(super.field7379, (byte) -127), 5121, (byte[]) null, 0);
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZIZ)V")
    public final void method1867(boolean arg0, int arg1, boolean arg2) {
        if (super.field7373 == 3553) {
            super.field7377.method2295(arg1 ^ -2214, this);
            OpenGL.glTexParameteri(super.field7373, 10242, !arg0 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field7373, 10243, arg2 ? 10497 : 33071);
        }
        ++field3989;
        if (arg1 != 2203) {
            field3995 = -8;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lad;IIIIZ[IZ)V")
    public class289(class362 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3994 = arg3;
        this.field3988 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 + -1 - var10) * arg3;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field7377.method2295(-88, this);
        if (arg5 && ~super.field7373 != -34038) {
            class399.method2546(32993, super.field7373, super.field7377.field5483, this.field3988, super.field7379, -106, this.field3994, arg6);
            this.method3015(22860, true);
        } else {
            OpenGL.glTexImage2Di(super.field7373, 0, super.field7379, this.field3994, this.field3988, 0, 32993, super.field7377.field5483, arg6, 0);
            this.method3015(22860, false);
        }
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V")
    public static void method1868(boolean arg0) {
        field4005 = null;
        field3992 = null;
        field4007 = null;
        field4002 = null;
        if (arg0) {
            method1871(124, 34, -27, 56, -89, 14);
        }
        field4006 = null;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lad;IIIIZ[BIZ)V")
    public class289(class362 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3994 = arg3;
        this.field3988 = arg4;
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
        super.field7377.method2295(-69, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field7373 != 34037) {
            class69.method465(-106, arg4, arg3, arg7, arg1, arg6, arg2);
            this.method3015(22860, true);
        } else {
            OpenGL.glTexImage2Dub(super.field7373, 0, super.field7379, this.field3994, this.field3988, 0, arg7, 5121, arg6, 0);
            this.method3015(22860, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIBZI[I)V")
    public final void method1869(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6, int arg7, int[] arg8) {
        if (~arg7 == -1) {
            arg7 = arg0;
        }
        ++field4000;
        if (arg5 == 20) {
            if (arg6) {
                int[] var10 = new int[arg0 * arg2];
                for (int var11 = 0; ~var11 > ~arg2; ++var11) {
                    int var12 = arg0 * var11;
                    int var13 = (-var11 + -1 + arg2) * arg7 - -arg1;
                    for (int var14 = 0; ~var14 > ~arg0; ++var14) {
                        var10[var12++] = arg8[var13++];
                    }
                }
                arg8 = var10;
            }
            super.field7377.method2295(-74, this);
            if (~arg0 != ~arg7) {
                OpenGL.glPixelStorei(3314, arg7);
            }
            OpenGL.glTexSubImage2Di(super.field7373, 0, arg3, arg4, arg0, arg2, 32993, super.field7377.field5483, arg8, arg1);
            if (~arg0 != ~arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public final void method592(int arg0) {
        ++field3998;
        OpenGL.glFramebufferTexture2DEXT(this.field3996, this.field3999, super.field7373, 0, arg0);
        this.field3999 = -1;
        this.field3996 = -1;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBII)V")
    public final void method1870(int arg0, byte arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, super.field7373, super.field7370, arg0);
        ++field3997;
        this.field3996 = arg3;
        this.field3999 = arg2;
        if (arg1 <= 35) {
            method1871(56, -121, 75, 102, -4, -96);
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lad;IIIIZ[FI)V")
    public class289(class362 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3988 = arg4;
        this.field3994 = arg3;
        super.field7377.method2295(-127, this);
        if (arg5 && ~super.field7373 != -34038) {
            class471.method2881(arg7, arg3, arg6, arg2, arg1, 0, arg4);
            this.method3015(22860, true);
        } else {
            OpenGL.glTexImage2Df(super.field7373, 0, super.field7379, this.field3994, this.field3988, 0, arg7, 5126, arg6, 0);
            this.method3015(22860, false);
        }
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIII)V")
    public static final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3993;
        int var6 = -arg1 + arg5;
        int var7 = -arg2 + arg4;
        if (arg3 != 205) {
            field3995 = 72;
        }
        if (var6 != 0) {
            if (var7 == 0) {
                class489.method2939(arg3 + -276, arg0, arg1, arg2, arg5);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg1 * var8 >> 12) + arg2;
                int var10;
                int var11;
                if (~arg1 > ~class113.field1385) {
                    var10 = class113.field1385;
                    var11 = (class113.field1385 * var8 >> 12) + var9;
                } else if (arg1 <= class4.field43) {
                    var11 = arg2;
                    var10 = arg1;
                } else {
                    var10 = class4.field43;
                    var11 = (class4.field43 * var8 >> 12) + var9;
                }
                int var12;
                int var13;
                if (arg5 >= class113.field1385) {
                    if (class4.field43 >= arg5) {
                        var12 = arg5;
                        var13 = arg4;
                    } else {
                        var13 = (class4.field43 * var8 >> 12) + var9;
                        var12 = class4.field43;
                    }
                } else {
                    var12 = class113.field1385;
                    var13 = var9 - -(class113.field1385 * var8 >> 12);
                }
                if (class418.field6298 <= var13) {
                    if (~class461.field6877 > ~var13) {
                        var13 = class461.field6877;
                        var12 = (-var9 + class461.field6877 << 12) / var8;
                    }
                } else {
                    var12 = (-var9 + class418.field6298 << 12) / var8;
                    var13 = class418.field6298;
                }
                if (class418.field6298 <= var11) {
                    if (var11 > class461.field6877) {
                        var10 = (-var9 + class461.field6877 << 12) / var8;
                        var11 = class461.field6877;
                    }
                } else {
                    var11 = class418.field6298;
                    var10 = (-var9 + class418.field6298 << 12) / var8;
                }
                class380.method2444(75, var12, var13, arg0, var10, var11);
            }
        } else {
            if (var7 != 0) {
                class254.method1690(arg0, arg1, arg2, 0, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII[BIIZII)V")
    public final void method1872(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        ++field3990;
        if (arg3 == 0) {
            arg3 = arg2;
        }
        if (arg7) {
            int var11 = class525.method3093(arg9, (byte) 124);
            int var12 = arg2 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg0 * var12];
            for (int var15 = 0; ~arg0 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg0 + -1 - var15) * var13 + arg1;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg4[var17++];
                }
            }
            arg4 = var14;
        }
        if (arg8 == 30491) {
            super.field7377.method2295(-120, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg2 != arg3) {
                OpenGL.glPixelStorei(3314, arg3);
            }
            OpenGL.glTexSubImage2Dub(super.field7373, 0, arg5, arg6, arg2, arg0, arg9, 5121, arg4, arg1);
            if (arg2 != arg3) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIII)V")
    public final void method1873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4001;
        int var8 = super.field7377.field5219 - (arg1 + arg2);
        super.field7377.method2295(-119, this);
        OpenGL.glCopyTexSubImage2D(super.field7373, arg5, arg4, this.field3988 - (arg0 + arg2), arg6, var8, arg3, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1874(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field4002 = null;
        }
        ++field4004;
        return class429.method2674((byte) -4, arg0, arg2) | (393216 & arg2) != 0 || class380.method2445(-3448, arg2, arg0);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lad;IIIII)V")
    public class289(class362 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3994 = arg4;
        this.field3988 = arg5;
        int var7 = -arg3 + super.field7377.field5219 + -arg5;
        super.field7377.method2295(-118, this);
        OpenGL.glCopyTexImage2D(super.field7373, 0, super.field7379, arg2, var7, arg4, arg5, 0);
        this.method3020(true, 0);
    }
}
