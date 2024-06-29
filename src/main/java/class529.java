import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class529 extends class35 implements class90 {

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    private int field7605;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    private int field7604;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "Lew;")
    public static class685 field7603 = new class685("", 16);

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lom;Llw;IIZ[BII)V", line = 3)
    public class529(class642 arg0, class233 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class121.field1859, arg2 * arg3, arg4);
        this.field7605 = arg2;
        this.field7604 = arg3;
        super.field326.method215(8, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method202(arg2, super.field317, 1, arg3, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field317, 0, this.method203(120), arg2, arg3, 0, class329.method2125(super.field321, 6046), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZZ)V", line = 25)
    public final void method597(int arg0, boolean arg1, boolean arg2) {
        super.field326.method215(8, this);
        ++field7611;
        int var4 = 10 / ((-89 - arg0) / 37);
        OpenGL.glTexParameteri(super.field317, 10242, arg1 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field317, 10243, arg2 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IF)F", line = 37)
    public final float method590(int arg0, float arg1) {
        if (arg0 <= 11) {
            field7603 = null;
        }
        ++field7610;
        return arg1 / (float) this.field7605;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lom;IIZ[III)V", line = 48)
    public class529(class642 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class238.field3830, class121.field1859, arg1 * arg2, arg3);
        this.field7605 = arg1;
        this.field7604 = arg2;
        super.field326.method215(8, this);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method199(111, arg4, arg1, arg2, super.field317);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field317, 0, 6408, this.field7605, this.field7604, 0, 32993, super.field326.field9175, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lom;Llw;Lal;II)V", line = 67)
    public class529(class642 arg0, class233 arg1, class121 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field7604 = arg4;
        this.field7605 = arg3;
        super.field326.method215(8, this);
        OpenGL.glTexImage2Dub(super.field317, 0, this.method203(118), arg3, arg4, 0, class329.method2125(super.field321, 6046), class583.method3364(5122, super.field331), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)I", line = 78)
    public final int method593(boolean arg0) {
        if (!arg0) {
            return -7;
        } else {
            ++field7614;
            return this.field7605;
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lom;Llw;IIZ[FII)V", line = 90)
    public class529(class642 arg0, class233 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class121.field1863, arg2 * arg3, arg4);
        this.field7605 = arg2;
        this.field7604 = arg3;
        super.field326.method215(8, this);
        if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method196(arg3, (byte) 120, super.field317, arg2, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field317, 0, this.method203(117), arg2, arg3, 0, class329.method2125(super.field321, 6046), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)I", line = 110)
    public final int method588(byte arg0) {
        if (arg0 != 21) {
            field7612 = 35;
        }
        ++field7602;
        return this.field7604;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[IIIIIII)V", line = 126)
    public final void method587(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 == 17432) {
            ++field7616;
            super.field326.method215(8, this);
            OpenGL.glPixelStorei(3314, arg0);
            OpenGL.glTexSubImage2Di(super.field317, 0, arg6, arg7, arg3, arg5, 32993, super.field326.field9175, arg1, arg2);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([FLlw;IIIIZII)V", line = 140)
    public final void method3135(float[] arg0, class233 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (!arg6) {
            this.field7605 = 95;
        }
        super.field326.method215(8, this);
        ++field7607;
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Df(super.field317, 0, arg5, arg2, arg4, arg3, class329.method2125(arg1, 6046), 5121, arg0, arg8);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IBII[III)V", line = 155)
    public final void method595(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field7613;
        if (arg1 == 26) {
            int[] var8 = new int[this.field7605 * this.field7604];
            super.field326.method215(8, this);
            OpenGL.glGetTexImagei(super.field317, 0, 32993, 5121, var8, 0);
            for (int var9 = 0; arg5 > var9; ++var9) {
                class571.method3314(var8, (-var9 + arg3 + arg5 + -1) * this.field7605, arg4, arg0 * var9 + arg6, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILlw;IIIIII[B)V", line = 178)
    public final void method594(int arg0, class233 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        super.field326.method215(8, this);
        ++field7608;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Dub(super.field317, 0, arg6, arg3, arg7, arg5, class329.method2125(arg1, 6046), 5121, arg8, arg4);
        if (arg2 != -32482) {
            method3138((class638) null, (byte) -91, (class638) null);
        }
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZZ)V", line = 194)
    public static final void method3136(boolean arg0, boolean arg1) {
        ++field7609;
        if (arg1) {
            field7603 = null;
        }
        if (class346.field5112 == null) {
            class118.method932((byte) -27);
        }
        if (arg0) {
            class346.field5112.method3982(1);
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(Z)V", line = 210)
    public static void method3137(boolean arg0) {
        if (!arg0) {
            field7612 = -103;
        }
        field7603 = null;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)Z", line = 220)
    public final boolean method589(byte arg0) {
        ++field7615;
        if (arg0 >= -112) {
            this.field7605 = 23;
        }
        return true;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(IF)F", line = 238)
    public final float method591(int arg0, float arg1) {
        int var3 = -47 / ((52 - arg0) / 33);
        ++field7601;
        return arg1 / (float) this.field7604;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lfu;BLfu;)V", line = 254)
    public static final void method3138(class638 arg0, byte arg1, class638 arg2) {
        ++field7606;
        if (arg1 >= 118) {
            if (arg0.field8961 != null) {
                arg0.method3610(-25057);
            }
            arg0.field8961 = arg2.field8961;
            arg0.field8962 = arg2;
            arg0.field8961.field8962 = arg0;
            arg0.field8962.field8961 = arg0;
        }
    }
}
