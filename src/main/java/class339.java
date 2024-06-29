import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class339 extends class763 implements class248 {

    @OriginalMember(owner = "client!en", name = "I", descriptor = "I")
    private int field4911;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "I")
    private int field4904;

    @OriginalMember(owner = "client!en", name = "N", descriptor = "[[Ljava/lang/String;")
    public static String[][] field4916 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!en", name = "G", descriptor = "Ljw;")
    public static class581 field4909 = new class581(130, -2);

    @OriginalMember(owner = "client!en", name = "O", descriptor = "[I")
    public static int[] field4917 = new int[1];

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!en", name = "J", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!en", name = "L", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!en", name = "M", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII[III)V", line = 4)
    public final void method1671(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field4913;
        int[] var8 = new int[this.field4911 * this.field4904];
        super.field10545.method3520(true, this);
        OpenGL.glGetTexImagei(super.field10554, 0, 32993, 5121, var8, 0);
        if (arg6 != 3839) {
            this.method1664(-64);
        }
        for (int var9 = 0; ~var9 > ~arg1; ++var9) {
            class278.method1798(var8, (arg3 - (-arg1 + 1) + -var9) * this.field4911, arg4, arg5 - -(arg2 * var9), arg2);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)I", line = 27)
    public final int method1665(byte arg0) {
        ++field4912;
        if (arg0 != 84) {
            this.method1669((class787) null, -58, -3, 14, -61, (byte[]) null, -86, 105, -53);
        }
        return this.field4904;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Z", line = 40)
    public final boolean method1664(int arg0) {
        if (arg0 != 26244) {
            field4917 = null;
        }
        ++field4914;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lsw;IIII[BIII)V", line = 52)
    public final void method1669(class787 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 5259) {
            field4916 = null;
        }
        super.field10545.method3520(true, this);
        ++field4903;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Dub(super.field10554, 0, arg6, arg2, arg4, arg8, class719.method4017(116, arg0), 5121, arg5, arg3);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lpa;Lsw;IIZ[BII)V", line = 69)
    public class339(class391 arg0, class787 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class258.field3847, arg2 * arg3, arg4);
        this.field4911 = arg2;
        this.field4904 = arg3;
        super.field10545.method3520(true, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method4237((byte) -22, arg5, arg2, arg3, super.field10554);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field10554, 0, this.method4235(-11391), arg2, arg3, 0, class719.method4017(35, super.field10555), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(IF)F", line = 92)
    public final float method1670(int arg0, float arg1) {
        int var3 = -76 / ((68 - arg0) / 53);
        ++field4907;
        return arg1 / (float) this.field4904;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI[IIIII)V", line = 106)
    public final void method1663(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field10545.method3520(true, this);
        ++field4910;
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Di(super.field10554, 0, arg7, arg0, arg2, arg5, 32993, super.field10545.field5792, arg3, arg6);
        OpenGL.glPixelStorei(3314, 0);
        int var9 = 53 % ((52 - arg1) / 59);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I", line = 120)
    public final int method1668(boolean arg0) {
        if (arg0) {
            this.field4911 = -80;
        }
        ++field4906;
        return this.field4911;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lpa;IIZ[III)V", line = 131)
    public class339(class391 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class305.field4404, class258.field3847, arg1 * arg2, arg3);
        this.field4911 = arg1;
        this.field4904 = arg2;
        super.field10545.method3520(true, this);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method4241(arg4, super.field10554, arg1, true, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field10554, 0, 6408, this.field4911, this.field4904, 0, 32993, super.field10545.field5792, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lpa;Lsw;IIZ[FII)V", line = 150)
    public class339(class391 arg0, class787 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class258.field3851, arg2 * arg3, arg4);
        this.field4911 = arg2;
        this.field4904 = arg3;
        super.field10545.method3520(true, this);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method4238(arg3, arg2, arg5, 5126, super.field10554);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field10554, 0, this.method4235(-11391), arg2, arg3, 0, class719.method4017(36, super.field10555), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IF)F", line = 169)
    public final float method1666(int arg0, float arg1) {
        if (arg0 != -18982) {
            return 0.057882626F;
        } else {
            ++field4905;
            return arg1 / (float) this.field4911;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZI)V", line = 181)
    public final void method1667(boolean arg0, boolean arg1, int arg2) {
        if (arg2 == 30135) {
            ++field4915;
            super.field10545.method3520(true, this);
            OpenGL.glTexParameteri(super.field10554, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field10554, 10243, !arg0 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V", line = 194)
    public static void method2150(int arg0) {
        field4917 = null;
        if (arg0 != 0) {
            method2153((String) null, 108, 77);
        }
        field4909 = null;
        field4916 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[FIILsw;IIII)V", line = 207)
    public final void method2151(int arg0, float[] arg1, int arg2, int arg3, class787 arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 < -122) {
            ++field4902;
            super.field10545.method3520(true, this);
            OpenGL.glPixelStorei(3314, arg0);
            OpenGL.glTexSubImage2Df(super.field10554, 0, arg8, arg5, arg7, arg2, class719.method4017(50, arg4), 5121, arg1, arg3);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lpa;Lsw;Lig;II)V", line = 224)
    public class339(class391 arg0, class787 arg1, class258 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field4904 = arg4;
        this.field4911 = arg3;
        super.field10545.method3520(true, this);
        OpenGL.glTexImage2Dub(super.field10554, 0, this.method4235(-11391), arg3, arg4, 0, class719.method4017(77, super.field10555), class550.method3116((byte) -124, super.field10538), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V", line = 235)
    public static final void method2152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4908;
        int var7 = class573.method3204(arg4, class523.field7178, 124915076, class495.field6845);
        int var8 = class573.method3204(arg1, class523.field7178, 124915076, class495.field6845);
        int var9 = class573.method3204(arg2, class174.field2335, 124915076, class751.field10402);
        int var10 = class573.method3204(arg5, class174.field2335, 124915076, class751.field10402);
        int var11 = class573.method3204(arg3 + arg4, class523.field7178, 124915076, class495.field6845);
        int var12 = class573.method3204(-arg3 + arg1, class523.field7178, 124915076, class495.field6845);
        for (int var13 = var7; var13 < var11; ++var13) {
            class138.method1069(class785.field10808[var13], (byte) 91, var9, var10, arg6);
        }
        for (int var14 = var8; ~var14 < ~var12; --var14) {
            class138.method1069(class785.field10808[var14], (byte) -86, var9, var10, arg6);
        }
        int var15 = class573.method3204(arg2 - -arg3, class174.field2335, 124915076, class751.field10402);
        int var16 = class573.method3204(-arg3 + arg5, class174.field2335, 124915076, class751.field10402);
        for (int var17 = var11; var17 <= var12; ++var17) {
            int[] var18 = class785.field10808[var17];
            class138.method1069(var18, (byte) -89, var9, var15, arg6);
            class138.method1069(var18, (byte) -85, var16, var10, arg6);
        }
        if (arg0 != 3314) {
            method2152(109, -69, -22, 57, 14, -3, -113);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 294)
    public static final int method2153(String arg0, int arg1, int arg2) {
        ++field4901;
        return arg2 >= -35 ? 87 : class543.method3092(arg1, true, arg0, true);
    }
}
