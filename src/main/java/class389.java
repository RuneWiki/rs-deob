import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class389 extends class618 implements class406 {

    @OriginalMember(owner = "client!bfa", name = "J", descriptor = "I")
    private int field6222;

    @OriginalMember(owner = "client!bfa", name = "L", descriptor = "I")
    private int field6218;

    @OriginalMember(owner = "client!bfa", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field6224 = new String[] { method3175(method3174("`Thw[*")), method3175(method3174("`Thw_*")), method3175(method3174("y\u001c'wn")), method3175(method3174("lGe5")), method3175(method3174("`ThwR*")), method3175(method3174("`Thw/k\\`--*")), method3175(method3174("`ThwT*")), method3175(method3174("`ThwW*")), method3175(method3174("`ThwY*")), method3175(method3174("`ThwQ*")), method3175(method3174("`ThwZ*")), method3175(method3174("`ThwV*")), method3175(method3174("`ThwP*")), method3175(method3174("`ThwU*")), method3175(method3174("`ThwX*")) };

    @OriginalMember(owner = "client!bfa", name = "G", descriptor = "Lvn;")
    public static class330 field6212 = new class330(49, 3);

    @OriginalMember(owner = "client!bfa", name = "I", descriptor = "Llt;")
    public static class706 field6220 = new class706(5, 3);

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "Lhl;")
    public static class556 field6223 = new class556(125, -1);

    @OriginalMember(owner = "client!bfa", name = "H", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!bfa", name = "E", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!bfa", name = "N", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!bfa", name = "A", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!bfa", name = "O", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!bfa", name = "y", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!bfa", name = "C", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!bfa", name = "K", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!bfa", name = "B", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!bfa", name = "F", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Ltia;II[III)V")
    public class389(class278 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class313.field5120, class544.field8004, arg1 * arg2, false);
        try {
            this.field6222 = arg2;
            this.field6218 = arg1;
            super.field8938.method2233((byte) -47, this);
            OpenGL.glPixelStorei(3314, arg5);
            OpenGL.glTexImage2Di(super.field8926, 0, 6408, this.field6218, this.field6222, 0, 32993, super.field8938.field4549, arg3, arg4 * 4);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6224[5] + (arg0 != null ? field6224[2] : field6224[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6224[2] : field6224[3]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)I")
    public final int method3162(byte arg0) {
        try {
            if (arg0 != 112) {
                this.field6222 = 49;
            }
            ++field6210;
            return this.field6218;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6224[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)Z")
    public final boolean method3163(int arg0) {
        try {
            ++field6215;
            if (arg0 != -6990) {
                field6220 = null;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6224[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(FZ)F")
    public final float method3164(float arg0, boolean arg1) {
        try {
            if (arg1) {
                return 0.4358792F;
            } else {
                ++field6209;
                return arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6224[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Ltia;Lua;II[BII)V")
    public class389(class278 arg0, class696 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class544.field8004, arg2 * arg3, false);
        try {
            this.field6222 = arg3;
            this.field6218 = arg2;
            super.field8938.method2233((byte) -103, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Dub(super.field8926, 0, this.method4512((byte) 83), arg2, arg3, 0, class284.method2418(super.field8936, 6410), 5121, arg4, arg5);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6224[5] + (arg0 != null ? field6224[2] : field6224[3]) + ',' + (arg1 != null ? field6224[2] : field6224[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6224[2] : field6224[3]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "(I)V")
    public static void method3165(int arg0) {
        try {
            if (arg0 != -501) {
                method3165(16);
            }
            field6212 = null;
            field6223 = null;
            field6220 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6224[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZIZ)V")
    public final void method3166(boolean arg0, int arg1, boolean arg2) {
        try {
            ++field6211;
            if (arg1 != 8095) {
                method3167((String) null, -87);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6224[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method3167(String arg0, int arg1) {
        try {
            ++field6208;
            if (arg1 >= -3) {
                field6223 = null;
            }
            return class39.field445.containsKey(arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6224[14] + (arg0 != null ? field6224[2] : field6224[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "(B)I")
    public static final int method3168(byte arg0) {
        try {
            if (arg0 != 78) {
                method3165(78);
            }
            ++field6214;
            byte var1;
            if (class168.field2721 < 96) {
                var1 = 1;
                class360.method2979(true, -71);
            } else {
                int var2 = class428.method3393(arg0 + 41);
                if (var2 <= 100) {
                    var1 = 4;
                    class502.method3785(30);
                } else if (~var2 >= -501) {
                    var1 = 3;
                    class190.method1764(-2137);
                } else if (~var2 < -1001) {
                    class360.method2979(true, -3);
                    var1 = 1;
                } else {
                    class752.method5459((byte) -92);
                    var1 = 2;
                }
            }
            if (class623.field8996.field6379.method4132(true) != 0) {
                class623.field8996.method3244(22733, class623.field8996.field6378, 0);
                class679.method4942(false, (byte) 52, 0);
            }
            class574.method4222((byte) 92);
            return var1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6224[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III[IIBII)V")
    public final void method3169(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        try {
            if (~arg4 == -1) {
                arg4 = arg6;
            }
            super.field8938.method2233((byte) -107, this);
            ++field6221;
            if (~arg4 != ~arg6) {
                OpenGL.glPixelStorei(3314, arg4);
            }
            int var9 = 34 % ((arg5 - 67) / 32);
            OpenGL.glTexSubImage2Di(super.field8926, 0, arg7, arg0, arg6, arg2, 32993, super.field8938.field4549, arg3, arg1);
            if (~arg4 != ~arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6224[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6224[2] : field6224[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Ltia;Lua;Ldn;II)V")
    public class389(class278 arg0, class696 arg1, class544 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        try {
            this.field6218 = arg3;
            this.field6222 = arg4;
            super.field8938.method2233((byte) -114, this);
            OpenGL.glTexImage2Dub(super.field8926, 0, this.method4512((byte) 83), arg3, arg4, 0, class284.method2418(super.field8936, 6410), class580.method4254(true, super.field8944), (byte[]) null, 0);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6224[5] + (arg0 != null ? field6224[2] : field6224[3]) + ',' + (arg1 != null ? field6224[2] : field6224[3]) + ',' + (arg2 != null ? field6224[2] : field6224[3]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I[IIIIII)V")
    public final void method3170(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field6219;
            int[] var8 = new int[this.field6222 * this.field6218];
            super.field8938.method2233((byte) -119, this);
            OpenGL.glGetTexImagei(super.field8926, 0, 32993, 5121, var8, 0);
            if (arg0 != 10120) {
                method3165(4);
            }
            for (int var9 = 0; arg2 > var9; ++var9) {
                class405.method3262(var8, (arg2 + -1 + arg4 + -var9) * this.field6218, arg1, arg3 * var9 + arg6, arg3);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6224[4] + arg0 + ',' + (arg1 != null ? field6224[2] : field6224[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIILua;II[BII)V")
    public final void method3171(int arg0, int arg1, int arg2, class696 arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            if (arg4 != 27989) {
                this.method3163(-82);
            }
            ++field6213;
            if (arg2 == 0) {
                arg2 = arg7;
            }
            super.field8938.method2233((byte) -106, this);
            OpenGL.glPixelStorei(3317, 1);
            if (~arg2 != ~arg7) {
                OpenGL.glPixelStorei(3314, arg2);
            }
            OpenGL.glTexSubImage2Dub(super.field8926, 0, arg8, arg5, arg7, arg1, class284.method2418(arg3, arg4 + -21579), 5121, arg6, arg0);
            if (arg2 != arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6224[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6224[2] : field6224[3]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6224[2] : field6224[3]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(B)I")
    public final int method3172(byte arg0) {
        try {
            if (arg0 <= 12) {
                return 111;
            } else {
                ++field6216;
                return this.field6222;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6224[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(FI)F")
    public final float method3173(float arg0, int arg1) {
        try {
            if (arg1 != 32263) {
                return 0.6272451F;
            } else {
                ++field6217;
                return arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6224[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Ltia;Lua;II[FII)V")
    public class389(class278 arg0, class696 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class544.field8008, arg2 * arg3, false);
        try {
            this.field6218 = arg2;
            this.field6222 = arg3;
            super.field8938.method2233((byte) -66, this);
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Df(super.field8926, 0, this.method4512((byte) 83), arg2, arg3, 0, class284.method2418(super.field8936, 6410), 5126, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6224[5] + (arg0 != null ? field6224[2] : field6224[3]) + ',' + (arg1 != null ? field6224[2] : field6224[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6224[2] : field6224[3]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3174(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 19);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3175(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
