import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class119 extends class445 implements class75 {

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    private int field1769;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    private int field1773;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1771 = null;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field1778 = 500;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "Lmv;")
    public static class295 field1776;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V", line = 4)
    public static void method871(int arg0) {
        field1776 = null;
        field1771 = null;
        if (arg0 >= -108) {
            method871(38);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lkd;Lwu;IIZ[FII)V", line = 15)
    public class119(class700 arg0, class149 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class106.field1577, arg2 * arg3, arg4);
        this.field1769 = arg3;
        this.field1773 = arg2;
        super.field6476.method3011(-127, this);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method2632(arg2, arg5, false, arg3, super.field6467);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field6467, 0, this.method2630(9536), arg2, arg3, 0, class362.method2224(super.field6458, 6406), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)Z", line = 36)
    public final boolean method436(byte arg0) {
        ++field1775;
        return arg0 == 13;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZB)V", line = 47)
    public final void method432(boolean arg0, boolean arg1, byte arg2) {
        super.field6476.method3011(-127, this);
        ++field1770;
        OpenGL.glTexParameteri(super.field6467, 10242, !arg0 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field6467, 10243, !arg1 ? 33071 : 10497);
        if (arg2 <= 79) {
            this.method434(-49, 36, -81, 103, -117, 71, (byte[]) null, (class149) null, -59);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IC)Z", line = 61)
    public static final boolean method872(int arg0, char arg1) {
        if (arg0 != 32993) {
            field1771 = null;
        }
        ++field1783;
        return ~arg1 == -161 || ~arg1 == -33 || ~arg1 == -96 || ~arg1 == -46;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FI)F", line = 72)
    public final float method429(float arg0, int arg1) {
        ++field1781;
        return arg1 >= -35 ? -1.8664606F : arg0 / (float) this.field1769;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)I", line = 91)
    public final int method435(int arg0) {
        if (arg0 != 2367) {
            field1776 = null;
        }
        ++field1782;
        return this.field1769;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IF)F", line = 102)
    public final float method433(int arg0, float arg1) {
        if (arg0 != -27156) {
            field1776 = null;
        }
        ++field1779;
        return arg1 / (float) this.field1773;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)I", line = 115)
    public final int method431(boolean arg0) {
        ++field1777;
        if (arg0) {
            this.field1773 = 3;
        }
        return this.field1773;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lkd;Lwu;IIZ[BII)V", line = 128)
    public class119(class700 arg0, class149 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class106.field1573, arg2 * arg3, arg4);
        this.field1769 = arg3;
        this.field1773 = arg2;
        super.field6476.method3011(-127, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method2635(arg2, arg5, arg3, super.field6467, 1);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field6467, 0, this.method2630(9536), arg2, arg3, 0, class362.method2224(super.field6458, 6406), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lkd;IIZ[III)V", line = 150)
    public class119(class700 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class564.field8245, class106.field1573, arg1 * arg2, arg3);
        this.field1769 = arg2;
        this.field1773 = arg1;
        super.field6476.method3011(-128, this);
        if (arg3 && ~arg6 == -1 && ~arg5 == -1) {
            this.method2637(arg4, super.field6467, arg1, arg2, 255);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field6467, 0, 6408, this.field1773, this.field1769, 0, 32993, super.field6476.field9954, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII[BLwu;I)V", line = 169)
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class149 arg7, int arg8) {
        super.field6476.method3011(arg8 + 10972, this);
        ++field1774;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg3);
        if (arg8 != -11100) {
            this.method430(-6, 4, (int[]) null, -80, 6, -24, -41, 88);
        }
        OpenGL.glTexSubImage2Dub(super.field6467, 0, arg5, arg2, arg1, arg0, class362.method2224(arg7, arg8 + 17506), 5121, arg6, arg4);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[IIIIII)V", line = 190)
    public final void method430(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 < 30) {
            field1771 = null;
        }
        ++field1772;
        super.field6476.method3011(-128, this);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Di(super.field6467, 0, arg1, arg5, arg6, arg4, 32993, super.field6476.field9954, arg2, arg3);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lkd;Lwu;Lbk;II)V", line = 204)
    public class119(class700 arg0, class149 arg1, class106 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field1773 = arg3;
        this.field1769 = arg4;
        super.field6476.method3011(-127, this);
        OpenGL.glTexImage2Dub(super.field6467, 0, this.method2630(9536), arg3, arg4, 0, class362.method2224(super.field6458, 6406), class115.method854(super.field6473, (byte) -118), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII[FIILwu;)V", line = 217)
    public final void method873(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6, int arg7, class149 arg8) {
        ++field1768;
        super.field6476.method3011(-127, this);
        OpenGL.glPixelStorei(3314, arg2);
        if (arg6 < 20) {
            method872(-115, (char) 65501);
        }
        OpenGL.glTexSubImage2Df(super.field6467, 0, arg7, arg0, arg3, arg4, class362.method2224(arg8, 6406), 5121, arg5, arg1);
        OpenGL.glPixelStorei(3314, 0);
    }
}
