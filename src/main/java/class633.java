import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class633 extends class763 implements class248 {

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    private int field8838;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    private int field8834;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "F")
    public static float field8837;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "Lqn;")
    public static class70 field8848;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "Ldr;")
    public static class751 field8849;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)Z", line = 3)
    public static final boolean method3546(boolean arg0) {
        if (!arg0) {
            method3548((byte) 91, 91L, 67);
        }
        ++field8841;
        return class746.field10297 > 0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V", line = 15)
    public static final void method3547(int arg0, int arg1) {
        ++field8851;
        class16 var2 = class94.method753(arg1, 13175, (long) arg0);
        var2.method118(585134072);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BJI)Ljava/lang/String;", line = 25)
    public static final String method3548(byte arg0, long arg1, int arg2) {
        if (arg0 != -110) {
            method3546(false);
        }
        class109.method822((byte) -126, arg1);
        ++field8844;
        int var4 = class295.field4285.get(5);
        int var5 = 1 + class295.field4285.get(2);
        int var6 = class295.field4285.get(1);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpa;Lsw;II[FII)V", line = 44)
    public class633(class391 arg0, class787 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class258.field3851, arg2 * arg3, false);
        this.field8838 = arg2;
        this.field8834 = arg3;
        super.field10545.method3520(true, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field10554, 0, this.method4235(-11391), arg2, arg3, 0, class719.method4017(90, super.field10555), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I", line = 58)
    public final int method1665(byte arg0) {
        ++field8836;
        if (arg0 != 84) {
            field8849 = null;
        }
        return this.field8834;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z", line = 70)
    public final boolean method1664(int arg0) {
        if (arg0 != 26244) {
            method3550(-95, (byte) 80, -1);
        }
        ++field8842;
        return false;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpa;Lsw;Lig;II)V", line = 81)
    public class633(class391 arg0, class787 arg1, class258 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field8838 = arg3;
        this.field8834 = arg4;
        super.field10545.method3520(true, this);
        OpenGL.glTexImage2Dub(super.field10554, 0, this.method4235(-11391), arg3, arg4, 0, class719.method4017(124, super.field10555), class550.method3116((byte) -124, super.field10538), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBI[IIIII)V", line = 93)
    public final void method1663(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~arg4 == -1) {
            arg4 = arg2;
        }
        int var9 = -105 % ((arg1 - 52) / 59);
        ++field8840;
        super.field10545.method3520(true, this);
        if (~arg2 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field10554, 0, arg7, arg0, arg2, arg5, 32993, super.field10545.field5792, arg3, arg6);
        if (~arg2 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpa;Lsw;II[BII)V", line = 114)
    public class633(class391 arg0, class787 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class258.field3847, arg2 * arg3, false);
        this.field8834 = arg3;
        this.field8838 = arg2;
        super.field10545.method3520(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field10554, 0, this.method4235(-11391), arg2, arg3, 0, class719.method4017(50, super.field10555), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IF)F", line = 130)
    public final float method1666(int arg0, float arg1) {
        ++field8845;
        return arg0 != -18982 ? -0.22292215F : arg1;
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(B)V", line = 142)
    public static void method3549(byte arg0) {
        field8849 = null;
        field8848 = null;
        int var1 = 56 / ((-39 - arg0) / 54);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lsw;IIII[BIII)V", line = 153)
    public final void method1669(class787 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        super.field10545.method3520(true, this);
        ++field8847;
        if (arg7 == 0) {
            arg7 = arg4;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg4 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field10554, 0, arg6, arg2, arg4, arg8, class719.method4017(103, arg0), 5121, arg5, arg3);
        if (~arg4 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg1 == 5259) {
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(IF)F", line = 178)
    public final float method1670(int arg0, float arg1) {
        ++field8835;
        int var3 = 92 / ((arg0 - 68) / 53);
        return arg1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZZI)V", line = 188)
    public final void method1667(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != 30135) {
            this.method1664(116);
        }
        ++field8843;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpa;II[III)V", line = 199)
    public class633(class391 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class305.field4404, class258.field3847, arg1 * arg2, false);
        this.field8834 = arg2;
        this.field8838 = arg1;
        super.field10545.method3520(true, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field10554, 0, 6408, this.field8838, this.field8834, 0, 32993, super.field10545.field5792, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBI)Z", line = 214)
    public static final boolean method3550(int arg0, byte arg1, int arg2) {
        if (arg1 >= -16) {
            method3546(false);
        }
        ++field8839;
        return class305.method1936(arg2, arg0, 13085) & (class27.method204((byte) -93, arg2, arg0) | (arg2 & 8192) != 0 | class543.method3095(arg2, arg0, true));
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIII[III)V", line = 226)
    public final void method1671(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field8846;
        int[] var8 = new int[this.field8838 * this.field8834];
        if (arg6 == 3839) {
            super.field10545.method3520(true, this);
            OpenGL.glGetTexImagei(super.field10554, 0, 32993, 5121, var8, 0);
            for (int var9 = 0; ~var9 > ~arg1; ++var9) {
                class278.method1798(var8, (-var9 + arg1 - (1 - arg3)) * this.field8838, arg4, arg5 - -(arg2 * var9), arg2);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)I", line = 249)
    public final int method1668(boolean arg0) {
        ++field8850;
        if (arg0) {
            this.field8838 = -90;
        }
        return this.field8838;
    }
}
