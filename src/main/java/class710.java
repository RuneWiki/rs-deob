import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class710 extends class328 implements class191 {

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    private int field10283;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    private int field10281;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field10298 = new String[] { method5183(method5182("if??<")), method5183(method5182("if?+<")), method5183(method5182("if?<<")), method5183(method5182("if?:<")), method5183(method5182("if?<U ")), method5183(method5182("fa}\u0011")), method5183(method5182("s:?Si")), method5183(method5182("if?><")), method5183(method5182("if?9<")), method5183(method5182("if?8<")), method5183(method5182("if?5<")), method5183(method5182("if?*<")), method5183(method5182("if?4<")), method5183(method5182("if?(<")), method5183(method5182("if?A}f}eC<")), method5183(method5182("if?;<")) };

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "J")
    public static long field10297 = 0L;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "Lum;")
    public static class550 field10286 = new class550("", 14);

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public static int field10280;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    public static int field10291;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field10293;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field10294;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "I")
    public static int field10295;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "Lla;")
    public static class476 field10289;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "Lfs;")
    public static class581 field10296;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V", line = 4)
    public static final void method5178(int arg0) {
        try {
            ++field10287;
            if (arg0 != -6837) {
                method5180(103);
            }
            class301.field4720.method495(class497.field7202);
            class301.field4720.method479(class169.field2314, class262.field4033, class504.field7315, class170.field2351);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10298[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([IIIIIII)V", line = 18)
    public final void method750(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field10284;
            int[] var8 = new int[this.field10283 * this.field10281];
            super.field5165.method2467(arg4 + 2958, this);
            OpenGL.glGetTexImagei(super.field5167, 0, 32993, 5121, var8, 0);
            if (arg4 != -2946) {
                field10296 = null;
            }
            for (int var9 = 0; arg2 > var9; ++var9) {
                class467.method3553(var8, (arg1 + arg2 + -1 + -var9) * this.field10281, arg0, arg6 * var9 + arg5, arg6);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10298[7] + (arg0 != null ? field10298[6] : field10298[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lrda;II[III)V", line = 42)
    public class710(class690 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class215.field3276, class157.field1952, arg1 * arg2, false);
        try {
            this.field10283 = arg2;
            this.field10281 = arg1;
            super.field5165.method2467(12, this);
            OpenGL.glPixelStorei(3314, arg5);
            OpenGL.glTexImage2Di(super.field5167, 0, 6408, this.field10281, this.field10283, 0, 32993, super.field5165.field10112, arg3, arg4 * 4);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10298[14] + (arg0 != null ? field10298[6] : field10298[5]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10298[6] : field10298[5]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method749(int arg0) {
        try {
            if (arg0 < 3) {
                this.method742(97, (byte[]) null, -6, 29, -25, -92, -66, (class505) null, -44);
            }
            ++field10291;
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10298[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([IIBIIIII)V", line = 67)
    public final void method746(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg2 != -110) {
                field10297 = 32L;
            }
            super.field5165.method2467(12, this);
            ++field10280;
            if (arg3 == 0) {
                arg3 = arg6;
            }
            if (arg3 != arg6) {
                OpenGL.glPixelStorei(3314, arg3);
            }
            OpenGL.glTexSubImage2Di(super.field5167, 0, arg4, arg5, arg6, arg7, 32993, super.field5165.field10112, arg0, arg1);
            if (arg3 != arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field10298[12] + (arg0 != null ? field10298[6] : field10298[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V", line = 91)
    public static final void method5179(int arg0, int arg1) {
        try {
            int var2 = 99 / ((arg0 - -20) / 62);
            ++field10290;
            class313 var3 = class196.method1670((long) arg1, 16, 94);
            var3.method2635(true);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10298[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lrda;Leu;II[FII)V", line = 105)
    public class710(class690 arg0, class505 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class157.field1956, arg2 * arg3, false);
        try {
            this.field10283 = arg3;
            this.field10281 = arg2;
            super.field5165.method2467(12, this);
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Df(super.field5167, 0, this.method2773(-121), arg2, arg3, 0, class311.method2626((byte) -117, super.field5179), 5126, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field10298[14] + (arg0 != null ? field10298[6] : field10298[5]) + ',' + (arg1 != null ? field10298[6] : field10298[5]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10298[6] : field10298[5]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lrda;Leu;Lpj;II)V", line = 118)
    public class710(class690 arg0, class505 arg1, class157 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        try {
            this.field10281 = arg3;
            this.field10283 = arg4;
            super.field5165.method2467(12, this);
            OpenGL.glTexImage2Dub(super.field5167, 0, this.method2773(-56), arg3, arg4, 0, class311.method2626((byte) -117, super.field5179), class694.method5071(super.field5162, -114), (byte[]) null, 0);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10298[14] + (arg0 != null ? field10298[6] : field10298[5]) + ',' + (arg1 != null ? field10298[6] : field10298[5]) + ',' + (arg2 != null ? field10298[6] : field10298[5]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lrda;Leu;II[BII)V", line = 130)
    public class710(class690 arg0, class505 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class157.field1952, arg2 * arg3, false);
        try {
            this.field10281 = arg2;
            this.field10283 = arg3;
            super.field5165.method2467(12, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Dub(super.field5167, 0, this.method2773(-48), arg2, arg3, 0, class311.method2626((byte) -117, super.field5179), 5121, arg4, arg5);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field10298[14] + (arg0 != null ? field10298[6] : field10298[5]) + ',' + (arg1 != null ? field10298[6] : field10298[5]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10298[6] : field10298[5]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZIZ)V", line = 145)
    public final void method751(boolean arg0, int arg1, boolean arg2) {
        try {
            ++field10294;
            if (arg1 <= 27) {
                this.field10283 = 33;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10298[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[BIIIIILeu;I)V", line = 156)
    public final void method742(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class505 arg7, int arg8) {
        try {
            if (arg0 == 0) {
                arg0 = arg3;
            }
            ++field10295;
            super.field5165.method2467(12, this);
            if (arg6 != 9588) {
                method5181(-13, (class163) null);
            }
            OpenGL.glPixelStorei(3317, 1);
            if (~arg0 != ~arg3) {
                OpenGL.glPixelStorei(3314, arg0);
            }
            OpenGL.glTexSubImage2Dub(super.field5167, 0, arg4, arg5, arg3, arg2, class311.method2626((byte) -117, arg7), 5121, arg1, arg8);
            if (~arg0 != ~arg3) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10298[9] + arg0 + ',' + (arg1 != null ? field10298[6] : field10298[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field10298[6] : field10298[5]) + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IF)F", line = 183)
    public final float method748(int arg0, float arg1) {
        try {
            if (arg0 != -19847) {
                field10297 = 95L;
            }
            ++field10282;
            return arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10298[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V", line = 194)
    public static void method5180(int arg0) {
        try {
            field10296 = null;
            if (arg0 != 0) {
                method5179(101, -80);
            }
            field10286 = null;
            field10289 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10298[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I", line = 211)
    public final int method747(byte arg0) {
        try {
            ++field10285;
            if (arg0 != -120) {
                field10296 = null;
            }
            return this.field10283;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10298[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILib;)Lsr;", line = 222)
    public static final class265 method5181(int arg0, class163 arg1) {
        try {
            if (arg0 <= 93) {
                return null;
            } else {
                ++field10293;
                class384 var2 = class301.method2531(-41, arg1);
                int var3 = arg1.method1453((byte) 99);
                int var4 = arg1.method1453((byte) 121);
                int var5 = arg1.method1445((byte) 118);
                return new class265(var2.field5805, var2.field5813, var2.field5804, var2.field5807, var2.field5809, var2.field5810, var2.field5814, var2.field5806, var2.field5815, var3, var4, var5);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10298[13] + arg0 + ',' + (arg1 != null ? field10298[6] : field10298[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BF)F", line = 241)
    public final float method740(byte arg0, float arg1) {
        try {
            if (arg0 > -32) {
                method5178(-128);
            }
            ++field10292;
            return arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10298[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)I", line = 258)
    public final int method743(byte arg0) {
        try {
            ++field10288;
            return arg0 != -101 ? 68 : this.field10281;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10298[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5182(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5183(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
