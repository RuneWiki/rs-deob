import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class60 extends class35 implements class90 {

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "Ltm;")
    public static class334 field933 = new class334(75, 0);

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field944 = -60;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "J")
    public static long field941;

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lom;Llw;II[BII)V")
    public class60(class642 arg0, class233 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class121.field1859, arg2 * arg3, false);
        this.field934 = arg2;
        this.field932 = arg3;
        super.field326.method215(8, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field317, 0, this.method203(115), arg2, arg3, 0, class329.method2125(super.field321, 6046), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[IIIIIII)V")
    public final void method587(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~arg0 == -1) {
            arg0 = arg3;
        }
        ++field935;
        if (arg4 == 17432) {
            super.field326.method215(8, this);
            if (~arg0 != ~arg3) {
                OpenGL.glPixelStorei(3314, arg0);
            }
            OpenGL.glTexSubImage2Di(super.field317, 0, arg6, arg7, arg3, arg5, 32993, super.field326.field9175, arg1, arg2);
            if (arg0 != arg3) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)I")
    public final int method588(byte arg0) {
        ++field939;
        return arg0 != 21 ? -88 : this.field932;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)Z")
    public final boolean method589(byte arg0) {
        ++field938;
        if (arg0 > -112) {
            this.field934 = -68;
        }
        return false;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IF)F")
    public final float method590(int arg0, float arg1) {
        if (arg0 <= 11) {
            this.method591(-60, 2.5102713F);
        }
        ++field940;
        return arg1;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lom;Llw;II[FII)V")
    public class60(class642 arg0, class233 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class121.field1863, arg2 * arg3, false);
        this.field932 = arg3;
        this.field934 = arg2;
        super.field326.method215(8, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field317, 0, this.method203(124), arg2, arg3, 0, class329.method2125(super.field321, 6046), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lom;Llw;Lal;II)V")
    public class60(class642 arg0, class233 arg1, class121 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field934 = arg3;
        this.field932 = arg4;
        super.field326.method215(8, this);
        OpenGL.glTexImage2Dub(super.field317, 0, this.method203(118), arg3, arg4, 0, class329.method2125(super.field321, 6046), class583.method3364(5122, super.field331), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IF)F")
    public final float method591(int arg0, float arg1) {
        int var3 = -102 % ((arg0 - 52) / 33);
        ++field945;
        return arg1;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lom;II[III)V")
    public class60(class642 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class238.field3830, class121.field1859, arg1 * arg2, false);
        this.field934 = arg1;
        this.field932 = arg2;
        super.field326.method215(8, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field317, 0, 6408, this.field934, this.field932, 0, 32993, super.field326.field9175, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)[Lfe;")
    public static final class636[] method592(int arg0) {
        if (arg0 != 4) {
            return null;
        } else {
            ++field931;
            return new class636[] { class10.field100, class494.field7151, class141.field2199 };
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)I")
    public final int method593(boolean arg0) {
        if (!arg0) {
            this.method587(-15, (int[]) null, -100, 87, -114, -114, -87, 36);
        }
        ++field936;
        return this.field934;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILlw;IIIIII[B)V")
    public final void method594(int arg0, class233 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg2 == -32482) {
            ++field937;
            super.field326.method215(arg2 ^ -32490, this);
            if (arg0 == 0) {
                arg0 = arg7;
            }
            OpenGL.glPixelStorei(3317, 1);
            if (arg0 != arg7) {
                OpenGL.glPixelStorei(3314, arg0);
            }
            OpenGL.glTexSubImage2Dub(super.field317, 0, arg6, arg3, arg7, arg5, class329.method2125(arg1, 6046), 5121, arg8, arg4);
            if (arg0 != arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBII[III)V")
    public final void method595(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (arg1 == 26) {
            ++field930;
            int[] var8 = new int[this.field934 * this.field932];
            super.field326.method215(8, this);
            OpenGL.glGetTexImagei(super.field317, 0, 32993, 5121, var8, 0);
            for (int var9 = 0; ~arg5 < ~var9; ++var9) {
                class571.method3314(var8, (arg5 + -1 + arg3 + -var9) * this.field934, arg4, arg0 * var9 + arg6, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(B)V")
    public static void method596(byte arg0) {
        field933 = null;
        int var1 = -75 / ((arg0 - -2) / 58);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZZ)V")
    public final void method597(int arg0, boolean arg1, boolean arg2) {
        int var4 = 55 / ((arg0 - -89) / 37);
        ++field942;
    }
}
