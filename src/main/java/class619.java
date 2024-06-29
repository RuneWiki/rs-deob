import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class619 extends class17 implements class29 {

    @OriginalMember(owner = "client!gba", name = "E", descriptor = "I")
    private int field8761;

    @OriginalMember(owner = "client!gba", name = "N", descriptor = "I")
    private int field8767;

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "[I")
    public static int[] field8755 = new int[4];

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!gba", name = "C", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!gba", name = "J", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!gba", name = "L", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "Ldh;")
    public static class295 field8762;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V")
    public static void method3593(byte arg0) {
        int var1 = 74 % ((arg0 - 48) / 59);
        field8762 = null;
        field8755 = null;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZZB)V")
    public final void method364(boolean arg0, boolean arg1, byte arg2) {
        int var4 = -3 % ((53 - arg2) / 47);
        ++field8765;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)I")
    public final int method369(int arg0) {
        if (arg0 <= 52) {
            return -73;
        } else {
            ++field8759;
            return this.field8767;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILos;II[BIIII)V")
    public final void method362(int arg0, class408 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        if (~arg8 == -1) {
            arg8 = arg5;
        }
        ++field8757;
        super.field300.method2271(this, 5180);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg5 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        if (arg3 != 3348) {
            this.field8767 = 123;
        }
        OpenGL.glTexSubImage2Dub(super.field292, 0, arg0, arg2, arg5, arg6, class250.method1782((byte) 119, arg1), 5121, arg4, arg7);
        if (arg5 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(FB)F")
    public final float method373(float arg0, byte arg1) {
        if (arg1 >= -59) {
            this.method373(-0.8736205F, (byte) 89);
        }
        ++field8764;
        return arg0;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)Z")
    public final boolean method366(int arg0) {
        if (arg0 != -4758) {
            return false;
        } else {
            ++field8760;
            return false;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II[IIIIII)V")
    public final void method372(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field8766;
        super.field300.method2271(this, arg0 + -8173);
        if (arg4 == 0) {
            arg4 = arg1;
        }
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field292, 0, arg5, arg7, arg1, arg6, 32993, super.field300.field3438, arg2, arg3);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg0 != 13353) {
            this.method362(-21, (class408) null, -89, -38, (byte[]) null, 54, -46, 21, -125);
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(IB)I")
    public static final int method3594(int arg0, byte arg1) {
        ++field8758;
        int var2 = 90 % ((-82 - arg1) / 32);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lbea;Los;II[FII)V")
    public class619(class205 arg0, class408 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class134.field2201, arg2 * arg3, false);
        this.field8761 = arg2;
        this.field8767 = arg3;
        super.field300.method2271(this, 5180);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field292, 0, this.method248(10241), arg2, arg3, 0, class250.method1782((byte) 110, super.field285), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IF)F")
    public final float method365(int arg0, float arg1) {
        ++field8763;
        if (arg0 > -90) {
            method3594(-28, (byte) -115);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lbea;Los;Lmg;II)V")
    public class619(class205 arg0, class408 arg1, class134 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field8767 = arg4;
        this.field8761 = arg3;
        super.field300.method2271(this, 5180);
        OpenGL.glTexImage2Dub(super.field292, 0, this.method248(10241), arg3, arg4, 0, class250.method1782((byte) 108, super.field285), class436.method2769(super.field298, -114), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lbea;II[III)V")
    public class619(class205 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class86.field1055, class134.field2197, arg1 * arg2, false);
        this.field8767 = arg2;
        this.field8761 = arg1;
        super.field300.method2271(this, 5180);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field292, 0, 6408, this.field8761, this.field8767, 0, 32993, super.field300.field3438, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)I")
    public final int method371(int arg0) {
        if (arg0 >= -60) {
            return 71;
        } else {
            ++field8756;
            return this.field8761;
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lbea;Los;II[BII)V")
    public class619(class205 arg0, class408 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class134.field2197, arg2 * arg3, false);
        this.field8761 = arg2;
        this.field8767 = arg3;
        super.field300.method2271(this, 5180);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field292, 0, this.method248(10241), arg2, arg3, 0, class250.method1782((byte) 113, super.field285), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
