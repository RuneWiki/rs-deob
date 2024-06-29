import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class720 extends class292 {

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    private int field10092 = -1;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    private int field10106 = -1;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public int field10099;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public int field10100;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "Lpia;")
    public static class94 field10093 = new class94(48, 3);

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public static int field10091;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "Lda;")
    public static class59 field10104;

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "Ljava/lang/String;")
    public static String field10105;

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lnv;IIIII)V", line = 3)
    public class720(class417 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field10099 = arg4;
        this.field10100 = arg5;
        int var7 = -arg3 + -arg5 + super.field3603.field5837;
        super.field3603.method2621(-2, this);
        OpenGL.glCopyTexImage2D(super.field3591, 0, super.field3593, arg2, var7, arg4, arg5, 0);
        this.method1742(true, 29646);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lnv;IIII)V", line = 21)
    public class720(class417 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field10099 = arg3;
        this.field10100 = arg4;
        super.field3603.method2621(-2, this);
        OpenGL.glTexImage2Dub(super.field3591, 0, super.field3593, arg3, arg4, 0, class311.method1848(-34845, super.field3593), 5121, (byte[]) null, 0);
        this.method1742(true, 29646);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII[BIZIII)V", line = 34)
    public final void method4013(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        ++field10095;
        int var11 = -74 / ((arg2 - 56) / 47);
        if (~arg9 == -1) {
            arg9 = arg1;
        }
        if (arg6) {
            int var12 = class99.method688((byte) -52, arg8);
            int var13 = arg1 * var12;
            int var14 = arg9 * var12;
            byte[] var15 = new byte[arg3 * var13];
            for (int var16 = 0; arg3 > var16; ++var16) {
                int var17 = var13 * var16;
                int var18 = (-var16 - 1 + arg3) * var14 - -arg5;
                for (int var19 = 0; var13 > var19; ++var19) {
                    var15[var17++] = arg4[var18++];
                }
            }
            arg4 = var15;
        }
        super.field3603.method2621(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 != arg9) {
            OpenGL.glPixelStorei(3314, arg9);
        }
        OpenGL.glTexSubImage2Dub(super.field3591, 0, arg0, arg7, arg1, arg3, arg8, 5121, arg4, arg5);
        if (arg1 != arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIZI)V", line = 93)
    public final void method4014(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field10096;
        if (arg5) {
            this.field10100 = -120;
        }
        int var8 = super.field3603.field5837 - arg6 - arg1;
        super.field3603.method2621(-2, this);
        OpenGL.glCopyTexSubImage2D(super.field3591, 0, arg2, -arg4 + this.field10100 + -arg1, arg0, var8, arg3, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V", line = 109)
    public static void method4015(int arg0) {
        field10104 = null;
        field10105 = null;
        field10093 = null;
        int var1 = 120 % ((arg0 - 31) / 60);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lnv;IIIIZ[BIZ)V", line = 127)
    public class720(class417 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field10099 = arg3;
        this.field10100 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 - var11) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3603.method2621(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field3591 != -34038) {
            class646.method3682(arg2, (byte) -90, arg4, arg1, arg3, arg6, arg7);
            this.method1738(true, (byte) -51);
        } else {
            OpenGL.glTexImage2Dub(super.field3591, 0, super.field3593, this.field10099, this.field10100, 0, arg7, 5121, arg6, 0);
            this.method1738(false, (byte) -51);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1742(true, 29646);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lnv;IIIIZ[IIIZ)V", line = 180)
    public class720(class417 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field10100 = arg4;
        this.field10099 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; arg4 > var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + -1 + arg4) * arg3;
                for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field3603.method2621(-2, this);
        if (~super.field3591 != -34038 && arg5 && ~arg7 == -1 && arg8 == 0) {
            class278.method1676(this.field10100, super.field3593, this.field10099, super.field3591, 32993, false, super.field3603.field6028, arg6);
            this.method1738(true, (byte) -51);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field3591, 0, super.field3593, this.field10099, this.field10100, 0, 32993, super.field3603.field6028, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method1738(false, (byte) -51);
        }
        this.method1742(true, 29646);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lnv;IIIIZ[FI)V", line = 330)
    public class720(class417 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field10099 = arg3;
        this.field10100 = arg4;
        super.field3603.method2621(-2, this);
        if (arg5 && ~super.field3591 != -34038) {
            class175.method1084(arg6, arg7, arg3, arg2, arg4, 0, arg1);
            this.method1738(true, (byte) -51);
        } else {
            OpenGL.glTexImage2Df(super.field3591, 0, super.field3593, this.field10099, this.field10100, 0, arg7, 5126, arg6, 0);
            this.method1738(false, (byte) -51);
        }
        this.method1742(true, 29646);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZIIII[III)V", line = 235)
    public final void method4016(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        if (arg7 == 0) {
            arg7 = arg5;
        }
        ++field10103;
        if (arg1) {
            int[] var10 = new int[arg3 * arg5];
            for (int var11 = 0; var11 < arg3; ++var11) {
                int var12 = arg5 * var11;
                int var13 = (-var11 + arg3 + -1) * arg7 - -arg2;
                for (int var14 = 0; arg5 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3603.method2621(-2, this);
        if (arg5 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field3591, 0, arg8, arg4, arg5, arg3, 32993, super.field3603.field6028, arg6, arg2);
        if (arg5 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg0 != 3314) {
            field10104 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)Z", line = 286)
    public static final boolean method4017(int arg0, int arg1) {
        ++field10091;
        if (arg1 != -31302) {
            field10104 = null;
        }
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 297)
    public final void method66(int arg0) {
        ++field10097;
        OpenGL.glFramebufferTexture2DEXT(this.field10092, this.field10106, super.field3591, 0, 0);
        this.field10106 = -1;
        this.field10092 = -1;
        int var2 = 5 / ((80 - arg0) / 44);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZZB)V", line = 312)
    public final void method4018(boolean arg0, boolean arg1, byte arg2) {
        if (super.field3591 == 3553) {
            super.field3603.method2621(-2, this);
            OpenGL.glTexParameteri(super.field3591, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field3591, 10243, arg0 ? 10497 : 33071);
        }
        ++field10101;
        if (arg2 != 125) {
            this.method4014(117, -34, -115, -44, -107, true, -67);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BIII)V", line = 354)
    public final void method4019(byte arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, super.field3591, super.field3589, arg1);
        ++field10102;
        this.field10092 = arg2;
        this.field10106 = arg3;
        int var5 = -44 / ((-61 - arg0) / 53);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z", line = 366)
    public static final boolean method4020(int arg0, int arg1, int arg2) {
        ++field10094;
        if (arg2 != 0) {
            field10093 = null;
        }
        return ~(arg0 & 32) != -1;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 381)
    public static final void method4021(boolean arg0) {
        if (!arg0) {
            ++field10098;
            if (!class471.field6744) {
                class520.method3058(class735.field10270, 121);
                if (class316.field3973 != null) {
                    class520.method3058(class316.field3973, 120);
                }
                class471.field6744 = true;
            }
        }
    }
}
