import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class520 extends class128 {

    @OriginalMember(owner = "client!gha", name = "G", descriptor = "I")
    private int field6615 = -1;

    @OriginalMember(owner = "client!gha", name = "H", descriptor = "I")
    private int field6616 = -1;

    @OriginalMember(owner = "client!gha", name = "I", descriptor = "I")
    public int field6617;

    @OriginalMember(owner = "client!gha", name = "F", descriptor = "I")
    public int field6614;

    @OriginalMember(owner = "client!gha", name = "J", descriptor = "I")
    public static int field6618 = 0;

    @OriginalMember(owner = "client!gha", name = "L", descriptor = "[F")
    public static float[] field6620 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gha", name = "C", descriptor = "Lk;")
    public static class66 field6611 = new class66("INTBETA", "office", "_intbeta", 6);

    @OriginalMember(owner = "client!gha", name = "M", descriptor = "Z")
    public static boolean field6621 = false;

    @OriginalMember(owner = "client!gha", name = "N", descriptor = "[I")
    public static int[] field6622 = new int[16];

    @OriginalMember(owner = "client!gha", name = "u", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!gha", name = "v", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!gha", name = "w", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!gha", name = "x", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!gha", name = "y", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!gha", name = "B", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!gha", name = "D", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!gha", name = "E", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!gha", name = "K", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!gha", name = "A", descriptor = "[Lqia;")
    public static class322[] field6609;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V")
    public final void method760(byte arg0) {
        ++field6604;
        int var2 = -39 % ((65 - arg0) / 52);
        OpenGL.glFramebufferTexture2DEXT(this.field6615, this.field6616, super.field1710, 0, 0);
        this.field6616 = -1;
        this.field6615 = -1;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZIIIII)V")
    public final void method2866(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6605;
        int var8 = -arg3 + super.field1709.field9789 - arg4;
        super.field1709.method3975((byte) 112, this);
        if (!arg1) {
            field6621 = true;
        }
        OpenGL.glCopyTexSubImage2D(super.field1710, 0, arg0, -arg2 - arg4 + this.field6617, arg6, var8, arg5, arg4);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lck;IIII)V")
    public class520(class733 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field6617 = arg4;
        this.field6614 = arg3;
        super.field1709.method3975((byte) 119, this);
        OpenGL.glTexImage2Dub(super.field1710, 0, super.field1702, arg3, arg4, 0, class316.method1848(super.field1702, -1), 5121, (byte[]) null, 0);
        this.method759(0, true);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z[IIIIIIII)V")
    public final void method2867(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6619;
        if (~arg7 == -1) {
            arg7 = arg3;
        }
        if (arg0) {
            int[] var10 = new int[arg3 * arg8];
            for (int var11 = 0; ~var11 > ~arg8; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg8) * arg7 + arg2;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg1[var13++];
                }
            }
            arg1 = var10;
        }
        super.field1709.method3975((byte) 124, this);
        if (arg3 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field1710, arg6, arg4, this.field6617 - arg5 + -arg8, arg3, arg8, 32993, super.field1709.field9887, arg1, arg2);
        if (arg3 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "(B)V")
    public static final void method2868(byte arg0) {
        ++field6610;
        class390.field4981 = null;
        class382.field4771 = null;
        class609.field7701 = null;
        class749.field10224 = false;
        if (arg0 != 40) {
            method2872((class740) null, -47, 9);
        }
        class218.field2967 = null;
        class504.field6457 = null;
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lck;IIIIZ[FI)V")
    public class520(class733 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6614 = arg3;
        this.field6617 = arg4;
        super.field1709.method3975((byte) 127, this);
        if (arg5 && super.field1710 != 34037) {
            class436.method2502(arg2, (byte) -117, arg3, arg6, arg7, arg4, arg1);
            this.method756((byte) 117, true);
        } else {
            OpenGL.glTexImage2Df(super.field1710, 0, super.field1702, this.field6614, this.field6617, 0, arg7, 5126, arg6, 0);
            this.method756((byte) 61, false);
        }
        this.method759(0, true);
    }

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "(I)V")
    public static void method2869(int arg0) {
        if (arg0 >= -78) {
            method2869(-64);
        }
        field6611 = null;
        field6622 = null;
        field6620 = null;
        field6609 = null;
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lck;IIIIZ[IIIZ)V")
    public class520(class733 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6614 = arg3;
        this.field6617 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; var12 < arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 - var12 + -1) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field1709.method3975((byte) 127, this);
        if (~super.field1710 != -34038 && arg5 && ~arg7 == -1 && arg8 == 0) {
            class87.method538(super.field1702, this.field6617, 84, super.field1710, 32993, super.field1709.field9887, arg6, this.field6614);
            this.method756((byte) 42, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field1710, 0, super.field1702, this.field6614, this.field6617, 0, 32993, super.field1709.field9887, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method756((byte) 106, false);
        }
        this.method759(0, true);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIII)V")
    public final void method2870(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 3314) {
            method2869(-29);
        }
        OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.field1710, super.field1707, arg3);
        ++field6612;
        this.field6616 = arg0;
        this.field6615 = arg1;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)I")
    public static final int method2871(int arg0, int arg1) {
        if (arg0 != 1023) {
            field6618 = 60;
        }
        ++field6607;
        return 1023 & arg1;
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lck;IIIIZ[BIZ)V")
    public class520(class733 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6614 = arg3;
        this.field6617 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field1709.method3975((byte) 118, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field1710 != 34037) {
            class186.method1315(arg6, 1, arg2, arg3, arg4, arg1, arg7);
            this.method756((byte) 23, true);
        } else {
            OpenGL.glTexImage2Dub(super.field1710, 0, super.field1702, this.field6614, this.field6617, 0, arg7, 5121, arg6, 0);
            this.method756((byte) 109, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method759(0, true);
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lck;IIIII)V")
    public class520(class733 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field6617 = arg5;
        this.field6614 = arg4;
        int var7 = super.field1709.field9789 - arg5 - arg3;
        super.field1709.method3975((byte) 126, this);
        OpenGL.glCopyTexImage2D(super.field1710, 0, super.field1702, arg2, var7, arg4, arg5, 0);
        this.method759(0, true);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Ltia;II)V")
    public static final void method2872(class740 arg0, int arg1, int arg2) {
        ++field6603;
        class404.field5371 = 0;
        if (arg2 <= 122) {
            method2872((class740) null, 35, 46);
        }
        class120.field1619 = false;
        class479.method2688(-10052, arg0);
        class336.method1935(arg0, 73);
        if (class120.field1619) {
            System.out.println("---endgpp---");
        }
        if (~arg0.field3133 != ~arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field3133 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZZ)V")
    public final void method2873(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != -26403) {
            this.field6615 = 100;
        }
        ++field6613;
        if (super.field1710 == 3553) {
            super.field1709.method3975((byte) 113, this);
            OpenGL.glTexParameteri(super.field1710, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field1710, 10243, arg2 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(BI[BIIIIIZI)V")
    public final void method2874(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        ++field6608;
        if (arg4 == 0) {
            arg4 = arg5;
        }
        if (arg8) {
            int var11 = class20.method87(arg9, 6409);
            int var12 = arg5 * var11;
            int var13 = arg4 * var11;
            byte[] var14 = new byte[arg3 * var12];
            for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg3 + -1 + -var15) * var13 + arg7;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg2[var17++];
                }
            }
            arg2 = var14;
        }
        super.field1709.method3975((byte) 125, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg4 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field1710, 0, arg6, arg1, arg5, arg3, arg9, 5121, arg2, arg7);
        if (arg4 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg0 > -68) {
            field6609 = null;
        }
        OpenGL.glPixelStorei(3317, 4);
    }
}
