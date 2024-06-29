import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class325 extends class300 implements class212 {

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    private int field4067;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "[I")
    public static int[] field4055 = new int[2];

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "Z")
    public static boolean field4066 = false;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "Lcga;")
    public static class449 field4052 = new class449(44, 3);

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "Lpfa;")
    public static class275 field4068;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "[[Lrr;")
    public static class337[][] field4062;

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lel;Lnh;IIZ[BII)V", line = 3)
    public class325(class513 arg0, class699 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class100.field1288, arg2 * arg3, arg4);
        this.field4053 = arg3;
        this.field4067 = arg2;
        super.field3828.method1349(this, false);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method1794(arg3, super.field3816, 5121, arg5, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field3816, 0, this.method1787(99), arg2, arg3, 0, class237.method1429(super.field3827, 1002608112), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III[FILnh;III)V", line = 26)
    public final void method1871(int arg0, int arg1, int arg2, float[] arg3, int arg4, class699 arg5, int arg6, int arg7, int arg8) {
        super.field3828.method1349(this, false);
        ++field4054;
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Df(super.field3816, arg2, arg1, arg4, arg7, arg0, class237.method1429(arg5, arg2 + 1002608112), 5121, arg3, arg8);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZI)V", line = 37)
    public final void method40(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != 7220) {
            method1872((byte) -93);
        }
        ++field4063;
        super.field3828.method1349(this, false);
        OpenGL.glTexParameteri(super.field3816, 10242, arg0 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field3816, 10243, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V", line = 53)
    public static final void method1872(byte arg0) {
        if (arg0 == 109) {
            for (int var1 = 0; class234.field3033.length > var1; ++var1) {
                for (int var2 = 0; var2 < class234.field3033[0].length; ++var2) {
                    for (int var3 = 0; var3 < class234.field3033[0][0].length; ++var3) {
                        class234.field3033[var1][var2][var3] = 0;
                    }
                }
            }
            ++field4057;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V", line = 89)
    public static void method1873(byte arg0) {
        field4068 = null;
        field4052 = null;
        field4062 = null;
        int var1 = -51 % ((arg0 - 14) / 60);
        field4055 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(FI)F", line = 101)
    public final float method39(float arg0, int arg1) {
        if (arg1 >= -79) {
            field4052 = null;
        }
        ++field4056;
        return arg0 / (float) this.field4053;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BF)F", line = 116)
    public final float method42(byte arg0, float arg1) {
        ++field4065;
        if (arg0 < 125) {
            field4066 = true;
        }
        return arg1 / (float) this.field4067;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILrr;)V", line = 127)
    public static final void method1874(int arg0, class337 arg1) {
        ++field4060;
        if (~arg1.field4212 == -6 && arg1.field4252 != -1) {
            class85.method645(125, arg1, class309.field3898);
        }
        if (arg0 != -2060) {
            field4062 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lel;Lnh;IIZ[FII)V", line = 141)
    public class325(class513 arg0, class699 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class100.field1292, arg2 * arg3, arg4);
        this.field4053 = arg3;
        this.field4067 = arg2;
        super.field3828.method1349(this, false);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method1793(arg5, super.field3816, arg2, (byte) -118, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field3816, 0, this.method1787(78), arg2, arg3, 0, class237.method1429(super.field3827, 1002608112), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lel;Lnh;Ljr;II)V", line = 160)
    public class325(class513 arg0, class699 arg1, class100 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field4053 = arg4;
        this.field4067 = arg3;
        super.field3828.method1349(this, false);
        OpenGL.glTexImage2Dub(super.field3816, 0, this.method1787(70), arg3, arg4, 0, class237.method1429(super.field3827, 1002608112), class111.method772((byte) -121, super.field3815), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lel;IIZ[III)V", line = 172)
    public class325(class513 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class556.field6946, class100.field1288, arg1 * arg2, arg3);
        this.field4067 = arg1;
        this.field4053 = arg2;
        super.field3828.method1349(this, false);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method1792(1, arg1, super.field3816, arg4, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field3816, 0, 6408, this.field4067, this.field4053, 0, 32993, super.field3828.field6530, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I", line = 194)
    public final int method36(int arg0) {
        if (arg0 != -24981) {
            this.method38((byte) 121);
        }
        ++field4051;
        return this.field4053;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIZIILnh;I[B)V", line = 205)
    public final void method34(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class699 arg6, int arg7, byte[] arg8) {
        super.field3828.method1349(this, arg3);
        ++field4061;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Dub(super.field3816, 0, arg2, arg4, arg1, arg5, class237.method1429(arg6, 1002608112), 5121, arg8, arg0);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)I", line = 220)
    public final int method37(int arg0) {
        ++field4050;
        return arg0 != -18693 ? 56 : this.field4067;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Z", line = 235)
    public final boolean method38(byte arg0) {
        ++field4064;
        if (arg0 < 91) {
            this.method42((byte) 98, -1.3157364F);
        }
        return true;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([IIIIIIII)V", line = 249)
    public final void method35(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4059;
        super.field3828.method1349(this, false);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Di(super.field3816, 0, arg7, arg4, arg3, arg2, 32993, super.field3828.field6530, arg0, arg1);
        OpenGL.glPixelStorei(3314, 0);
        int var9 = -115 / ((-8 - arg6) / 47);
    }
}
