import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class646 extends class591 {

    @OriginalMember(owner = "client!waa", name = "F", descriptor = "I")
    private int field9172 = -1;

    @OriginalMember(owner = "client!waa", name = "H", descriptor = "I")
    private int field9174 = -1;

    @OriginalMember(owner = "client!waa", name = "y", descriptor = "I")
    public int field9165;

    @OriginalMember(owner = "client!waa", name = "E", descriptor = "I")
    public int field9171;

    @OriginalMember(owner = "client!waa", name = "A", descriptor = "F")
    public static float field9167 = 0.0F;

    @OriginalMember(owner = "client!waa", name = "G", descriptor = "I")
    public static int field9173 = 0;

    @OriginalMember(owner = "client!waa", name = "w", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!waa", name = "x", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!waa", name = "B", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!waa", name = "C", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!waa", name = "D", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!waa", name = "J", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!waa", name = "I", descriptor = "[Lau;")
    public static class675[] field9175;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V", line = 3)
    public static void method3596(byte arg0) {
        field9175 = null;
        if (arg0 > -45) {
            field9173 = -3;
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Len;IIIIZ[BIZ)V", line = 13)
    public class646(class289 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9165 = arg3;
        this.field9171 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 - var11) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field8237.method1804(false, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field8241 != 34037) {
            class583.method3257(arg7, arg4, arg3, arg6, arg1, arg2, -84);
            this.method3289(true, false);
        } else {
            OpenGL.glTexImage2Dub(super.field8241, 0, super.field8226, this.field9165, this.field9171, 0, arg7, 5121, arg6, 0);
            this.method3289(false, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3288(0, true);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I[BZIIIIIII)V", line = 66)
    public final void method3597(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg6 == -1) {
            arg6 = arg0;
        }
        ++field9164;
        if (arg2) {
            int var11 = class418.method2386(-6407, arg8);
            int var12 = arg0 * var11;
            int var13 = arg6 * var11;
            byte[] var14 = new byte[arg4 * var12];
            for (int var15 = 0; var15 < arg4; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg4 + -1) * var13 - -arg5;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg1[var17++];
                }
            }
            arg1 = var14;
        }
        super.field8237.method1804(false, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg6) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Dub(super.field8241, 0, arg3, arg7, arg0, arg4, arg8, 5121, arg1, arg5);
        if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, arg9);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIBI)V", line = 128)
    public final void method3598(int arg0, int arg1, byte arg2, int arg3) {
        ++field9168;
        OpenGL.glFramebufferTexture2DEXT(arg1, arg3, super.field8241, super.field8231, arg0);
        this.field9174 = arg3;
        if (arg2 < -75) {
            this.field9172 = arg1;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 141)
    public final void method1953(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field9172, this.field9174, super.field8241, 0, 0);
        ++field9170;
        this.field9172 = -1;
        this.field9174 = arg0;
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Len;IIIIZ[FI)V", line = 151)
    public class646(class289 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9171 = arg4;
        this.field9165 = arg3;
        super.field8237.method1804(false, this);
        if (arg5 && super.field8241 != 34037) {
            class413.method2358(arg4, arg7, arg2, arg6, 0, arg1, arg3);
            this.method3289(true, false);
        } else {
            OpenGL.glTexImage2Df(super.field8241, 0, super.field8226, this.field9165, this.field9171, 0, arg7, 5126, arg6, 0);
            this.method3289(false, false);
        }
        this.method3288(0, true);
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(II)V", line = 174)
    public static final void method3599(int arg0, int arg1) {
        int var2 = -17 / ((arg1 - 37) / 40);
        ++field9176;
        class350.field5036.method1989(arg0, (byte) 92);
        class82.field1152.method1989(arg0, (byte) 122);
        class104.field1403.method1989(arg0, (byte) 118);
        class130.field1782.method1989(arg0, (byte) 103);
        class84.field1166.method1989(arg0, (byte) 100);
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Len;IIIIZ[IZ)V", line = 194)
    public class646(class289 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9165 = arg3;
        this.field9171 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 + -1) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field8237.method1804(false, this);
        if (arg5 && super.field8241 != 34037) {
            client.method1642(super.field8237.field4282, this.field9171, arg6, 1, 32993, super.field8241, this.field9165, super.field8226);
            this.method3289(true, false);
        } else {
            OpenGL.glTexImage2Di(super.field8241, 0, super.field8226, this.field9165, this.field9171, 0, 32993, super.field8237.field4282, arg6, 0);
            this.method3289(false, false);
        }
        this.method3288(0, true);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZIIIIIBI[I)V", line = 245)
    public final void method3600(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int[] arg8) {
        if (~arg2 == -1) {
            arg2 = arg7;
        }
        if (arg6 == -80) {
            ++field9166;
            if (arg0) {
                int[] var10 = new int[arg4 * arg7];
                for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                    int var12 = arg7 * var11;
                    int var13 = (-var11 + -1 + arg4) * arg2 + arg5;
                    for (int var14 = 0; var14 < arg7; ++var14) {
                        var10[var12++] = arg8[var13++];
                    }
                }
                arg8 = var10;
            }
            super.field8237.method1804(false, this);
            if (~arg2 != ~arg7) {
                OpenGL.glPixelStorei(3314, arg2);
            }
            OpenGL.glTexSubImage2Di(super.field8241, 0, arg3, arg1, arg7, arg4, 32993, super.field8237.field4282, arg8, arg5);
            if (~arg2 != ~arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZZI)V", line = 299)
    public final void method3601(boolean arg0, boolean arg1, int arg2) {
        ++field9163;
        if (arg2 >= -121) {
            this.method3601(false, false, -106);
        }
        if (~super.field8241 == -3554) {
            super.field8237.method1804(false, this);
            OpenGL.glTexParameteri(super.field8241, 10242, !arg0 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field8241, 10243, !arg1 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Len;IIIII)V", line = 336)
    public class646(class289 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field9165 = arg4;
        this.field9171 = arg5;
        int var7 = super.field8237.field4036 - (arg3 + arg5);
        super.field8237.method1804(false, this);
        OpenGL.glCopyTexImage2D(super.field8241, 0, super.field8226, arg2, var7, arg4, arg5, 0);
        this.method3288(0, true);
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Len;IIII)V", line = 357)
    public class646(class289 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field9171 = arg4;
        this.field9165 = arg3;
        super.field8237.method1804(false, this);
        OpenGL.glTexImage2Dub(super.field8241, 0, super.field8226, arg3, arg4, 0, class448.method2575((byte) -127, super.field8226), 5121, (byte[]) null, 0);
        this.method3288(0, true);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIII)V", line = 320)
    public final void method3602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9169;
        int var8 = -arg0 + -arg1 + super.field8237.field4036;
        super.field8237.method1804(false, this);
        OpenGL.glCopyTexSubImage2D(super.field8241, 0, arg5, this.field9171 - arg6 + -arg1, arg2, var8, arg3, arg1);
        OpenGL.glFlush();
        if (arg4 != -1) {
            field9175 = null;
        }
    }
}
