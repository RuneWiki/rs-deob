import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class678 extends class493 implements class459 {

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    private int field9521;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    private int field9513;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "Lbga;")
    public static class658 field9508 = null;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field9519;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "Lq;")
    public static class491 field9511;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "[I")
    public static int[] field9517;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method519(boolean arg0) {
        ++field9518;
        if (!arg0) {
            this.method522(false, 1.374529F);
        }
        return true;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Llm;IIZ[III)V", line = 18)
    public class678(class337 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class590.field8288, class117.field1509, arg1 * arg2, arg3);
        this.field9521 = arg1;
        this.field9513 = arg2;
        super.field6502.method2596(this, 0);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method2652(arg1, (byte) -106, super.field6519, arg4, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field6519, 0, 6408, this.field9521, this.field9513, 0, 32993, super.field6502.field4373, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBI[IIIII)V", line = 37)
    public final void method520(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field6502.method2596(this, arg1 ^ 75);
        ++field9515;
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Di(super.field6519, 0, arg4, arg7, arg5, arg6, 32993, super.field6502.field4373, arg3, arg0);
        if (arg1 != 75) {
            field9517 = null;
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)I", line = 56)
    public static final int method3797(int arg0, int arg1, int arg2) {
        if (arg1 <= 10) {
            field9517 = null;
        }
        ++field9509;
        int var3 = arg2 >> 31 & arg0 + -1;
        return ((arg2 >>> 31) + arg2) % arg0 + var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZF)F", line = 69)
    public final float method522(boolean arg0, float arg1) {
        ++field9516;
        if (arg0) {
            this.method3799(-108, (float[]) null, (class146) null, -81, -53, -88, -33, 97, -101);
        }
        return arg1 / (float) this.field9521;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Llm;Lec;IIZ[FII)V", line = 80)
    public class678(class337 arg0, class146 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class117.field1513, arg2 * arg3, arg4);
        this.field9513 = arg3;
        this.field9521 = arg2;
        super.field6502.method2596(this, 0);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method2660(arg3, arg2, (byte) 117, arg5, super.field6519);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field6519, 0, this.method2658(26701), arg2, arg3, 0, class488.method2639(6407, super.field6513), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Llm;Lec;IIZ[BII)V", line = 99)
    public class678(class337 arg0, class146 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class117.field1509, arg2 * arg3, arg4);
        this.field9521 = arg2;
        this.field9513 = arg3;
        super.field6502.method2596(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method2654(super.field6519, arg2, arg5, arg3, (byte) -33);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field6519, 0, this.method2658(26701), arg2, arg3, 0, class488.method2639(6407, super.field6513), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lkp;B)Ljava/lang/String;", line = 120)
    public static final String method3798(class507 arg0, byte arg1) {
        ++field9510;
        int var2 = 55 % ((-33 - arg1) / 56);
        if (~client.method3819(arg0).method2018(-1035661311) == -1) {
            return null;
        } else if (arg0.field6731 != null && ~arg0.field6731.trim().length() != -1) {
            return arg0.field6731;
        } else {
            return class253.field3101 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[BLec;IIIIII)V", line = 141)
    public final void method523(int arg0, byte[] arg1, class146 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field6502.method2596(this, 0);
        ++field9507;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Dub(super.field6519, 0, arg8, arg3, arg4, arg7, class488.method2639(6407, arg2), 5121, arg1, arg0);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
        if (arg6 != 996) {
            this.method526((byte) -57);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(FB)F", line = 157)
    public final float method518(float arg0, byte arg1) {
        if (arg1 != -59) {
            return 1.0254947F;
        } else {
            ++field9520;
            return arg0 / (float) this.field9513;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BZZ)V", line = 168)
    public final void method525(byte arg0, boolean arg1, boolean arg2) {
        super.field6502.method2596(this, arg0 ^ -81);
        ++field9519;
        OpenGL.glTexParameteri(super.field6519, 10242, !arg2 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field6519, 10243, arg1 ? 10497 : 33071);
        if (arg0 != -81) {
            this.method523(45, (byte[]) null, (class146) null, -84, -109, 2, 82, 114, 105);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I", line = 181)
    public final int method517(int arg0) {
        ++field9512;
        if (arg0 != -3537) {
            field9517 = null;
        }
        return this.field9513;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I", line = 194)
    public final int method526(byte arg0) {
        ++field9514;
        if (arg0 <= 53) {
            method3798((class507) null, (byte) 0);
        }
        return this.field9521;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[FLec;IIIIII)V", line = 209)
    public final void method3799(int arg0, float[] arg1, class146 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field6502.method2596(this, 0);
        ++field9522;
        OpenGL.glPixelStorei(arg7, arg8);
        OpenGL.glTexSubImage2Df(super.field6519, 0, arg0, arg4, arg6, arg5, class488.method2639(arg7 ^ 5621, arg2), 5121, arg1, arg3);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Llm;Lec;Lbt;II)V", line = 220)
    public class678(class337 arg0, class146 arg1, class117 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field9513 = arg4;
        this.field9521 = arg3;
        super.field6502.method2596(this, 0);
        OpenGL.glTexImage2Dub(super.field6519, 0, this.method2658(26701), arg3, arg4, 0, class488.method2639(6407, super.field6513), class285.method1603(super.field6522, 59), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V", line = 232)
    public static void method3800(int arg0) {
        field9511 = null;
        field9517 = null;
        if (arg0 != 3317) {
            field9517 = null;
        }
    }
}
