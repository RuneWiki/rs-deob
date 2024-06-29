import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class546 extends class561 implements class391 {

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "I")
    private int field8153;

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "I")
    private int field8146;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "Lica;")
    public static class205 field8147 = new class205(64);

    @OriginalMember(owner = "client!ou", name = "L", descriptor = "Lqp;")
    public static class586 field8154 = new class586(106, 6);

    @OriginalMember(owner = "client!ou", name = "P", descriptor = "I")
    public static int field8158 = 0;

    @OriginalMember(owner = "client!ou", name = "R", descriptor = "I")
    public static int field8160 = -1;

    @OriginalMember(owner = "client!ou", name = "O", descriptor = "[I")
    public static int[] field8157 = new int[32];

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!ou", name = "H", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!ou", name = "Q", descriptor = "I")
    public static int field8159;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ou", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field8161;

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "[[B")
    public static byte[][] field8156;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3209(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lqba;IIZ[III)V", line = 4)
    public class546(class540 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class411.field5856, class629.field9208, arg1 * arg2, arg3);
        this.field8153 = arg1;
        this.field8146 = arg2;
        super.field8314.method1152(this, true);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method3284(arg2, arg1, -27414, arg4, super.field8320);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field8320, 0, 6408, this.field8153, this.field8146, 0, 32993, super.field8314.field8072, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lqba;Ljt;IIZ[BII)V", line = 24)
    public class546(class540 arg0, class489 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class629.field9208, arg2 * arg3, arg4);
        this.field8153 = arg2;
        this.field8146 = arg3;
        super.field8314.method1152(this, true);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method3276(arg5, super.field8320, arg2, arg3, false);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field8320, 0, this.method3277(1), arg2, arg3, 0, class135.method836(false, super.field8310), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lqba;Ljt;IIZ[FII)V", line = 45)
    public class546(class540 arg0, class489 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class629.field9212, arg2 * arg3, arg4);
        this.field8153 = arg2;
        this.field8146 = arg3;
        super.field8314.method1152(this, true);
        if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method3285(1, arg3, arg2, arg5, super.field8320);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field8320, 0, this.method3277(1), arg2, arg3, 0, class135.method836(false, super.field8310), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)Z", line = 64)
    public final boolean method568(int arg0) {
        if (arg0 != 25992) {
            this.method565(-72, 0.0012344392F);
        }
        ++field8143;
        return true;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILjt;I[BIIIII)V", line = 75)
    public final void method558(int arg0, class489 arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8152;
        super.field8314.method1152(this, true);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Dub(super.field8320, 0, arg7, arg0, arg6, arg4, class135.method836(false, arg1), 5121, arg3, arg8);
        if (arg2 == -1294) {
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(B)V", line = 91)
    public static void method3206(byte arg0) {
        field8157 = null;
        field8154 = null;
        field8147 = null;
        if (arg0 != -29) {
            method3206((byte) 2);
        }
        field8156 = null;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(IF)F", line = 104)
    public final float method565(int arg0, float arg1) {
        ++field8144;
        if (arg0 != -32442) {
            this.method569(-12, 0.9807756F);
        }
        return arg1 / (float) this.field8153;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)I", line = 117)
    public final int method567(boolean arg0) {
        ++field8150;
        if (!arg0) {
            field8156 = null;
        }
        return this.field8153;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZIZ)V", line = 128)
    public final void method563(boolean arg0, int arg1, boolean arg2) {
        super.field8314.method1152(this, true);
        ++field8155;
        OpenGL.glTexParameteri(super.field8320, 10242, !arg0 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field8320, 10243, arg2 ? 10497 : 33071);
        int var4 = -92 % ((-52 - arg1) / 59);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IF)F", line = 140)
    public final float method569(int arg0, float arg1) {
        ++field8159;
        if (arg0 != -2297) {
            field8156 = null;
        }
        return arg1 / (float) this.field8146;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lqba;Ljt;Llc;II)V", line = 153)
    public class546(class540 arg0, class489 arg1, class629 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field8153 = arg3;
        this.field8146 = arg4;
        super.field8314.method1152(this, true);
        OpenGL.glTexImage2Dub(super.field8320, 0, this.method3277(1), arg3, arg4, 0, class135.method836(false, super.field8310), class476.method2896(-128, super.field8312), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBII)Z", line = 172)
    public static final boolean method3207(int arg0, byte arg1, int arg2, int arg3) {
        ++field8149;
        boolean var4 = true;
        class438 var5 = (class438) class491.method2972(arg3, arg2, arg0);
        if (arg1 < 118) {
            method3207(-11, (byte) 99, -112, -108);
        }
        if (var5 != null) {
            var4 &= class148.method872(var5, false);
        }
        class438 var6 = (class438) class488.method2956(arg3, arg2, arg0, field8161 != null ? field8161 : (field8161 = method3209("ej")));
        if (var6 != null) {
            var4 &= class148.method872(var6, false);
        }
        class438 var7 = (class438) class287.method1784(arg3, arg2, arg0);
        if (var7 != null) {
            var4 &= class148.method872(var7, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III[IIIII)V", line = 203)
    public final void method561(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field8314.method1152(this, true);
        ++field8151;
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Di(super.field8320, 0, arg0, arg5, arg7, arg2, 32993, super.field8314.field8072, arg3, arg6);
        if (arg1 != 12382) {
            this.method569(-49, -0.2314075F);
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)I", line = 229)
    public final int method564(int arg0) {
        if (arg0 != 7427) {
            field8158 = 41;
        }
        ++field8148;
        return this.field8146;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBILjt;III[FI)V", line = 241)
    public final void method3208(int arg0, byte arg1, int arg2, class489 arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8) {
        ++field8142;
        if (arg1 > -120) {
            field8157 = null;
        }
        super.field8314.method1152(this, true);
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Df(super.field8320, 0, arg8, arg6, arg2, arg0, class135.method836(false, arg3), 5121, arg7, arg5);
        OpenGL.glPixelStorei(3314, 0);
    }
}
