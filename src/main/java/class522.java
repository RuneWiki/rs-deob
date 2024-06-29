import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class522 extends class618 implements class406 {

    @OriginalMember(owner = "client!iaa", name = "N", descriptor = "I")
    private int field7709;

    @OriginalMember(owner = "client!iaa", name = "M", descriptor = "I")
    private int field7710;

    @OriginalMember(owner = "client!iaa", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field7721 = new String[] { method3908(method3907("mo\u001aP")), method3908(method3907("x4X\u0012S")), method3908(method3907("j{\u0017\u0012i+")), method3908(method3907("j{\u0017\u0012g+")), method3908(method3907("j{\u0017\u0012o+")), method3908(method3907("j{\u0017\u0012m+")), method3908(method3907("j{\u0017\u0012h+")), method3908(method3907("j{\u0017\u0012\u0012jt\u001fH\u0010+")), method3908(method3907("j{\u0017\u0012f+")), method3908(method3907("j{\u0017\u0012l+")), method3908(method3907("j{\u0017\u0012k+")), method3908(method3907("j{\u0017\u0012j+")), method3908(method3907("j{\u0017\u0012d+")), method3908(method3907("j{\u0017\u0012e+")) };

    @OriginalMember(owner = "client!iaa", name = "H", descriptor = "I")
    public static int field7706 = 0;

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "Lvn;")
    public static class330 field7707 = new class330(59, -1);

    @OriginalMember(owner = "client!iaa", name = "L", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!iaa", name = "I", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!iaa", name = "J", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!iaa", name = "E", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(B)I")
    public final int method3172(byte arg0) {
        try {
            if (arg0 < 12) {
                return -39;
            } else {
                ++field7713;
                return this.field7710;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7721[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIII[FLua;)V")
    public final void method3905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, class696 arg8) {
        try {
            ++field7715;
            super.field8938.method2233((byte) -62, this);
            OpenGL.glPixelStorei(3314, arg0);
            OpenGL.glTexSubImage2Df(super.field8926, 0, arg6, arg5, arg4, arg3, class284.method2418(arg8, 6410), 5121, arg7, arg1);
            OpenGL.glPixelStorei(3314, 0);
            if (arg2 != -16749) {
                this.method3905(-10, 46, -41, -41, 61, 61, -50, (float[]) null, (class696) null);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7721[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field7721[1] : field7721[0]) + ',' + (arg8 != null ? field7721[1] : field7721[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ltia;Lua;Ldn;II)V")
    public class522(class278 arg0, class696 arg1, class544 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        try {
            this.field7709 = arg3;
            this.field7710 = arg4;
            super.field8938.method2233((byte) -53, this);
            OpenGL.glTexImage2Dub(super.field8926, 0, this.method4512((byte) 83), arg3, arg4, 0, class284.method2418(super.field8936, 6410), class580.method4254(true, super.field8944), (byte[]) null, 0);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7721[7] + (arg0 != null ? field7721[1] : field7721[0]) + ',' + (arg1 != null ? field7721[1] : field7721[0]) + ',' + (arg2 != null ? field7721[1] : field7721[0]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZIZ)V")
    public final void method3166(boolean arg0, int arg1, boolean arg2) {
        try {
            ++field7708;
            super.field8938.method2233((byte) -71, this);
            if (arg1 != 8095) {
                field7706 = 75;
            }
            OpenGL.glTexParameteri(super.field8926, 10242, !arg0 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field8926, 10243, arg2 ? 10497 : 33071);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7721[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(FI)F")
    public final float method3173(float arg0, int arg1) {
        try {
            if (arg1 != 32263) {
                return -0.67929757F;
            } else {
                ++field7718;
                return arg0 / (float) this.field7710;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7721[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)Z")
    public final boolean method3163(int arg0) {
        try {
            if (arg0 != -6990) {
                return true;
            } else {
                ++field7714;
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7721[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(FZ)F")
    public final float method3164(float arg0, boolean arg1) {
        try {
            if (arg1) {
                this.method3905(-48, 55, 111, 11, 85, -74, 100, (float[]) null, (class696) null);
            }
            ++field7720;
            return arg0 / (float) this.field7709;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7721[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ltia;IIZ[III)V")
    public class522(class278 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class313.field5120, class544.field8004, arg1 * arg2, arg3);
        try {
            this.field7710 = arg2;
            this.field7709 = arg1;
            super.field8938.method2233((byte) -74, this);
            if (arg3 && ~arg6 == -1 && ~arg5 == -1) {
                this.method4520(arg1, arg4, arg2, (byte) -23, super.field8926);
            } else {
                OpenGL.glPixelStorei(3314, arg6);
                OpenGL.glTexImage2Di(super.field8926, 0, 6408, this.field7709, this.field7710, 0, 32993, super.field8938.field4549, arg4, arg5 * 4);
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7721[7] + (arg0 != null ? field7721[1] : field7721[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7721[1] : field7721[0]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ltia;Lua;IIZ[BII)V")
    public class522(class278 arg0, class696 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class544.field8004, arg2 * arg3, arg4);
        try {
            this.field7709 = arg2;
            this.field7710 = arg3;
            super.field8938.method2233((byte) -66, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg4 && arg7 == 0 && arg6 == 0) {
                this.method4517(arg5, super.field8926, false, arg3, arg2);
            } else {
                OpenGL.glPixelStorei(3314, arg7);
                OpenGL.glTexImage2Dub(super.field8926, 0, this.method4512((byte) 83), arg2, arg3, 0, class284.method2418(super.field8936, 6410), 5121, arg5, arg6);
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field7721[7] + (arg0 != null ? field7721[1] : field7721[0]) + ',' + (arg1 != null ? field7721[1] : field7721[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7721[1] : field7721[0]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "(B)V")
    public static void method3906(byte arg0) {
        try {
            int var1 = 17 % ((arg0 - -54) / 36);
            field7707 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7721[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III[IIBII)V")
    public final void method3169(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        try {
            int var9 = 121 / ((arg5 - 67) / 32);
            super.field8938.method2233((byte) -28, this);
            ++field7711;
            OpenGL.glPixelStorei(3314, arg4);
            OpenGL.glTexSubImage2Di(super.field8926, 0, arg7, arg0, arg6, arg2, 32993, super.field8938.field4549, arg3, arg1);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7721[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7721[1] : field7721[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIILua;II[BII)V")
    public final void method3171(int arg0, int arg1, int arg2, class696 arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            super.field8938.method2233((byte) -79, this);
            if (arg4 == 27989) {
                ++field7716;
                OpenGL.glPixelStorei(3317, 1);
                OpenGL.glPixelStorei(3314, arg2);
                OpenGL.glTexSubImage2Dub(super.field8926, 0, arg8, arg5, arg7, arg1, class284.method2418(arg3, arg4 + -21579), 5121, arg6, arg0);
                OpenGL.glPixelStorei(3314, 0);
                OpenGL.glPixelStorei(3317, 4);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7721[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7721[1] : field7721[0]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7721[1] : field7721[0]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)I")
    public final int method3162(byte arg0) {
        try {
            ++field7719;
            if (arg0 != 112) {
                field7706 = -95;
            }
            return this.field7709;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7721[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I[IIIIII)V")
    public final void method3170(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field7717;
            int[] var8 = new int[this.field7710 * this.field7709];
            super.field8938.method2233((byte) -30, this);
            OpenGL.glGetTexImagei(super.field8926, 0, 32993, 5121, var8, 0);
            for (int var9 = 0; var9 < arg2; ++var9) {
                class405.method3262(var8, (-var9 + -1 - (-arg2 - arg4)) * this.field7709, arg1, arg6 - -(arg3 * var9), arg3);
            }
            if (arg0 != 10120) {
                this.method3905(-21, -23, 51, 126, 23, -128, 94, (float[]) null, (class696) null);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7721[4] + arg0 + ',' + (arg1 != null ? field7721[1] : field7721[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ltia;Lua;IIZ[FII)V")
    public class522(class278 arg0, class696 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class544.field8008, arg2 * arg3, arg4);
        try {
            this.field7710 = arg3;
            this.field7709 = arg2;
            super.field8938.method2233((byte) -114, this);
            if (!arg4 && arg7 == 0 && arg6 == 0) {
                this.method4518(arg5, 126, arg3, super.field8926, arg2);
            } else {
                OpenGL.glPixelStorei(3314, arg7);
                OpenGL.glTexImage2Df(super.field8926, 0, this.method4512((byte) 83), arg2, arg3, 0, class284.method2418(super.field8936, 6410), 5126, arg5, arg6 * 4);
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field7721[7] + (arg0 != null ? field7721[1] : field7721[0]) + ',' + (arg1 != null ? field7721[1] : field7721[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7721[1] : field7721[0]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3907(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3908(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
