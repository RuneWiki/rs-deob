import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class321 extends class428 {

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Lb;")
    private class352 field5225;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
    private boolean field5218;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lqs;")
    private class630 field5222;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field5231 = new String[] { method2745(method2744("XztB")), method2745(method2744("Or7cM")), method2745(method2744("Na|F\u000e{rmB\u0017hviS\r")), method2745(method2744("_pxK\u0000")), method2745(method2744("Na|F\u000e{rmB\u0017cu\u007fT\u0000X")), method2745(method2744("Or7dM")), method2745(method2744("Or7aM")), method2745(method2744("BfuK")), method2745(method2744("W=7\t\u0018")), method2745(method2744("Or7fM")), method2745(method2744("Or7eM")), method2745(method2744("Or7\u001b\fBzm\u0019M")), method2745(method2744("I}oN\u0017C}tB\u000bXLtF\u0015\\v}x\u0012Mg|U:Z")), method2745(method2744("K\u007f")), method2745(method2744("I}oN\u0017C}tB\u000bXLtF\u0015\\v}x\u0012Mg|U:J")), method2745(method2744("I}oj\u0004\\@xJ\u0015@vk")), method2745(method2744("Or7bM")), method2745(method2744("B|kJ\u0004@@xJ\u0015@vk")), method2745(method2744("_fwb\u001d\\|wB\u000bX")), method2745(method2744("_fwc\f^")), method2745(method2744("_fwd\n@|lU")), method2745(method2744("Or7`M")) };

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Z")
    public static boolean field5219 = false;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field5226 = 0;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "[I")
    public static int[] field5230 = null;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Lqt;")
    public static class665 field5228;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Z")
    private boolean field5227;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "(I)V")
    public static void method2743(int arg0) {
        try {
            if (arg0 != 928) {
                field5226 = 70;
            }
            field5230 = null;
            field5228 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5231[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
    public final void method1219(int arg0, int arg1, int arg2) {
        try {
            if (this.field5227) {
                int var4 = 1 << (3 & arg0);
                float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
                int var6 = arg2 & 65535;
                float var7 = (float) (3 & arg2 >> 16) / 8.0F;
                long var8 = this.field5222.field9062;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field5231[0]), (float) (super.field6741.field4214 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field5231[3]), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field5231[2]), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field5231[4]), var7);
            }
            ++field5229;
            if (arg1 != 100) {
                this.method1221(-102, false);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field5231[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lln;BI)V")
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        try {
            ++field5223;
            if (!this.field5227) {
                super.field6741.method2233((byte) -110, arg0);
                super.field6741.method2258(arg2, (byte) -122);
            }
            if (arg1 <= 7) {
                method2743(119);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5231[6] + (arg0 != null ? field5231[8] : field5231[7]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V")
    public final void method1221(int arg0, boolean arg1) {
        try {
            ++field5221;
            if (arg0 != 6056) {
                this.method1222((class399) null, (byte) 40, -114);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5231[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public final void method1224(boolean arg0) {
        try {
            if (!arg0) {
                this.method1226(-85);
            }
            ++field5224;
            if (this.field5227) {
                super.field6741.method2245(107, 1);
                super.field6741.method2233((byte) -81, (class399) null);
                super.field6741.method2245(70, 0);
                super.field6741.method2233((byte) -77, (class399) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field5227 = false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5231[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)Z")
    public final boolean method1226(int arg0) {
        try {
            if (arg0 > -111) {
                return true;
            } else {
                ++field5216;
                return this.field5218;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5231[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ltia;Lgda;Lb;)V")
    public class321(class278 arg0, class58 arg1, class352 arg2) {
        super(arg0);
        try {
            this.field5225 = arg2;
            if (arg1 != null && arg0.field4556 && arg0.field4547) {
                class431 var4 = class94.method912(arg1.method591(true, field5231[12], field5231[13]), 1, 35633, arg0);
                class431 var5 = class94.method912(arg1.method591(true, field5231[14], field5231[13]), 1, 35632, arg0);
                this.field5222 = class641.method4644(arg0, new class431[] { var4, var5 }, (byte) 116);
                this.field5218 = this.field5222 != null && this.field5225.method2928((byte) 111);
            } else {
                this.field5218 = false;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5231[11] + (arg0 != null ? field5231[8] : field5231[7]) + ',' + (arg1 != null ? field5231[8] : field5231[7]) + ',' + (arg2 != null ? field5231[8] : field5231[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
    public final void method1225(boolean arg0, int arg1) {
        try {
            ++field5217;
            if (arg1 != 29145) {
                field5228 = null;
            }
            class125 var3 = super.field6741.method2274(arg1 ^ -29176);
            if (this.field5218 && var3 != null) {
                super.field6741.method2245(arg1 ^ 29094, 1);
                super.field6741.method2233((byte) -81, var3);
                super.field6741.method2245(arg1 + -29026, 0);
                super.field6741.method2233((byte) -34, this.field5225.field5686);
                long var4 = this.field5222.field9062;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field5231[17]), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field5231[15]), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field5231[19]), -super.field6741.field4185[0], -super.field6741.field4185[1], -super.field6741.field4185[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field5231[20]), super.field6741.field4180, super.field6741.field4196, super.field6741.field4189, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field5231[18]), 96.0F + 928.0F * Math.abs(super.field6741.field4185[1]));
                this.field5227 = true;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5231[16] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2744(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 101);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2745(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 101;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
