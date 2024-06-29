import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class327 extends class428 {

    @OriginalMember(owner = "client!tm", name = "Lg", descriptor = "Lui;")
    private class193 field4180 = new class193();

    @OriginalMember(owner = "client!tm", name = "Rh", descriptor = "Lui;")
    private class193 field4238 = new class193();

    @OriginalMember(owner = "client!tm", name = "bi", descriptor = "Lui;")
    private class193 field4248 = new class193();

    @OriginalMember(owner = "client!tm", name = "di", descriptor = "Lui;")
    private class193 field4250 = new class193();

    @OriginalMember(owner = "client!tm", name = "ei", descriptor = "Lui;")
    private class193 field4251 = new class193();

    @OriginalMember(owner = "client!tm", name = "fi", descriptor = "Lui;")
    private class193 field4252 = new class193();

    @OriginalMember(owner = "client!tm", name = "gi", descriptor = "Lui;")
    private class193 field4253 = new class193();

    @OriginalMember(owner = "client!tm", name = "ii", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field4255 = new MapBuffer();

    @OriginalMember(owner = "client!tm", name = "pi", descriptor = "I")
    private int field4262 = 0;

    @OriginalMember(owner = "client!tm", name = "ni", descriptor = "Z")
    private boolean field4260 = false;

    @OriginalMember(owner = "client!tm", name = "bh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4196;

    @OriginalMember(owner = "client!tm", name = "li", descriptor = "Ljava/lang/String;")
    private String field4258;

    @OriginalMember(owner = "client!tm", name = "ji", descriptor = "Ljava/lang/String;")
    private String field4256;

    @OriginalMember(owner = "client!tm", name = "ti", descriptor = "I")
    private int field4266;

    @OriginalMember(owner = "client!tm", name = "qi", descriptor = "Z")
    public boolean field4263;

    @OriginalMember(owner = "client!tm", name = "ki", descriptor = "Z")
    private boolean field4257;

    @OriginalMember(owner = "client!tm", name = "mi", descriptor = "Z")
    private boolean field4259;

    @OriginalMember(owner = "client!tm", name = "ri", descriptor = "Z")
    public boolean field4264;

    @OriginalMember(owner = "client!tm", name = "oi", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!tm", name = "si", descriptor = "[I")
    public int[] field4265;

    @OriginalMember(owner = "client!tm", name = "Vg", descriptor = "J")
    public static volatile long field4190 = 0L;

    @OriginalMember(owner = "client!tm", name = "xg", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!tm", name = "yg", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!tm", name = "zg", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!tm", name = "Ag", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!tm", name = "Bg", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!tm", name = "Cg", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!tm", name = "Dg", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!tm", name = "Eg", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!tm", name = "Fg", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!tm", name = "Gg", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!tm", name = "Hg", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!tm", name = "Ig", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!tm", name = "Jg", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!tm", name = "Kg", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!tm", name = "Mg", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!tm", name = "Ng", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!tm", name = "Og", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!tm", name = "Pg", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!tm", name = "Qg", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!tm", name = "Rg", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!tm", name = "Sg", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!tm", name = "Tg", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!tm", name = "Ug", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!tm", name = "Wg", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!tm", name = "Xg", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!tm", name = "Yg", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!tm", name = "Zg", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!tm", name = "ah", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!tm", name = "ch", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!tm", name = "dh", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!tm", name = "eh", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!tm", name = "fh", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!tm", name = "gh", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!tm", name = "hh", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!tm", name = "ih", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!tm", name = "jh", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!tm", name = "kh", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!tm", name = "lh", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!tm", name = "mh", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!tm", name = "nh", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!tm", name = "oh", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!tm", name = "ph", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!tm", name = "qh", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!tm", name = "rh", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!tm", name = "sh", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!tm", name = "th", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!tm", name = "uh", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!tm", name = "vh", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!tm", name = "wh", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!tm", name = "xh", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!tm", name = "yh", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!tm", name = "zh", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!tm", name = "Ah", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!tm", name = "Bh", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!tm", name = "Ch", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!tm", name = "Dh", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!tm", name = "Eh", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!tm", name = "Fh", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!tm", name = "Gh", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!tm", name = "Hh", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!tm", name = "Ih", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!tm", name = "Jh", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!tm", name = "Kh", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!tm", name = "Lh", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!tm", name = "Mh", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!tm", name = "Nh", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!tm", name = "Oh", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!tm", name = "Ph", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!tm", name = "Qh", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!tm", name = "Sh", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!tm", name = "Th", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!tm", name = "Uh", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!tm", name = "Vh", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!tm", name = "Wh", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!tm", name = "Xh", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!tm", name = "Yh", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!tm", name = "Zh", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!tm", name = "ai", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!tm", name = "ci", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!tm", name = "hi", descriptor = "J")
    private long field4254;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "(I)V", line = 4)
    public final void method1786(int arg0) {
        ++field4233;
        int var2;
        for (var2 = 0; var2 < super.field5733; ++var2) {
            class469 var3 = super.field5740[var2];
            int var4 = var3.method2736((byte) 121);
            int var5 = var2 + 16386;
            float var6 = var3.method2734((byte) -37) / 255.0F;
            class157.field1920[0] = (float) var3.method2731((byte) -96);
            class157.field1920[1] = (float) var3.method2730(arg0 + -31091);
            class157.field1920[2] = (float) var3.method2737((byte) -86);
            class157.field1920[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class157.field1920, 0);
            class157.field1920[3] = 1.0F;
            class157.field1920[2] = var6 * (float) class288.method1624(255, var4);
            class157.field1920[0] = var6 * (float) (class288.method1624(var4, 16717925) >> 16);
            class157.field1920[1] = (float) class288.method1624(var4 >> 8, 255) * var6;
            OpenGL.glLightfv(var5, 4609, class157.field1920, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method2735((byte) 93) * var3.method2735((byte) 124)));
            OpenGL.glEnable(var5);
        }
        while (super.field5741 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method1786(arg0);
        if (arg0 != 31090) {
            this.field4258 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "YA", descriptor = "()I", line = 56)
    public final int method1157() {
        ++field4195;
        return this.field4262;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLn;Ldn;I)V", line = 65)
    public class327(OpenGL arg0, Canvas arg1, long arg2, class17 arg3, class438 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field4196 = arg0;
            this.field4196.method3024();
            this.field4258 = OpenGL.glGetString(7936).toLowerCase();
            this.field4256 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field4258.indexOf("microsoft") == -1 && ~this.field4258.indexOf("brian paul") == 0 && ~this.field4258.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class220.method1267(var8.replace('.', ' '), ' ', (byte) 118);
                if (~var9.length <= -3) {
                    try {
                        int var10 = class232.method1325(var9[0], 0);
                        int var11 = class232.method1325(var9[1], 0);
                        this.field4266 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field4266 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field4196.method3023("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field4196.method3023("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field5768 = var12[0];
                        if (super.field5768 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field5778 = 8;
                            this.field4263 = this.field4196.method3023("GL_ARB_vertex_buffer_object");
                            super.field5787 = this.field4196.method3023("GL_ARB_multisample");
                            this.field4257 = this.field4196.method3023("GL_ARB_texture_rectangle");
                            super.field5754 = this.field4196.method3023("GL_ARB_texture_cube_map");
                            this.field4259 = this.field4196.method3023("GL_ARB_texture_non_power_of_two");
                            super.field5739 = this.field4196.method3023("GL_EXT_texture3D");
                            this.field4196.method3023("GL_ARB_vertex_shader");
                            this.field4264 = this.field4196.method3023("GL_ARB_vertex_program");
                            this.field4196.method3023("GL_ARB_fragment_shader");
                            this.field4196.method3023("GL_ARB_fragment_program");
                            this.field4261 = Stream.method3340() ? 33639 : 5121;
                            if (~this.field4256.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class220.method1267(this.field4256.replace('/', ' '), ' ', (byte) 108);
                                for (int var17 = 0; ~var16.length < ~var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (~var18.charAt(0) == -121 && ~var18.length() <= -4 && class398.method2284((byte) 43, var18.substring(1, 3))) {
                                                var18 = var18.substring(1);
                                                var15 = true;
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var18 = var18.substring(2);
                                                    var14 = true;
                                                }
                                                if (var18.length() >= 4 && class398.method2284((byte) 7, var18.substring(0, 4))) {
                                                    var13 = class232.method1325(var18.substring(0, 4), 0);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && var13 <= 9250) {
                                        super.field5739 = false;
                                    }
                                    if (~var13 <= -7001 && var13 <= 7999) {
                                        this.field4263 = false;
                                    }
                                }
                                this.field4257 &= this.field4196.method3023("GL_ARB_half_float_pixel");
                            }
                            this.field4258.indexOf("intel");
                            if (this.field4263) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                            this.field4265 = new int[super.field5768];
                            OpenGL.glClear(16640);
                            this.field4196.swapBuffers();
                            OpenGL.glClear(16640);
                        }
                    }
                } else {
                    throw new RuntimeException("");
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method1158();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "()Lfd;", line = 233)
    public final class448 method1172() {
        ++field4167;
        int var1 = -1;
        if (~this.field4258.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field4258.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (~this.field4258.indexOf("ati") != 0) {
            var1 = 4098;
        }
        return new class448(var1, "OpenGL", this.field4266, this.field4256, 0L);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V", line = 259)
    public final synchronized void method1787(int arg0, int arg1, int arg2) {
        ++field4183;
        class171 var4 = new class171(arg1);
        var4.field7967 = (long) arg0;
        this.field4248.method1040(var4, -100);
        if (arg2 != 15556) {
            this.method1172();
        }
    }

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "()V", line = 277)
    public final void method1166() {
        this.method2478((byte) -101, true);
        ++field4215;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "(I)V", line = 286)
    public final void method1788(int arg0) {
        if (arg0 != 7) {
            this.method1819((float[]) null, -70, -6, false, -81, 48, (class135) null, (byte) -78);
        }
        if (super.field5788 && super.field5771 && super.field5705 | ~super.field5697 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field4186;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI[[IZ)Llm;", line = 301)
    public final class423 method1789(boolean arg0, int arg1, int[][] arg2, boolean arg3) {
        ++field4231;
        if (!arg0) {
            this.method1822((byte) 103);
        }
        return new class53(this, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lg;III[BZ)Law;", line = 312)
    public final class65 method1790(class135 arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5) {
        if (!arg5) {
            this.method1791((class290) null, -40, -36, -89);
        }
        ++field4247;
        return new class561(this, arg0, arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lsc;III)V", line = 324)
    public final void method1791(class290 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 2) {
            ++field4176;
            int var5;
            byte var6;
            if (class420.field5440 == arg0) {
                var5 = arg1 * 2;
                var6 = 1;
            } else if (class480.field6743 != arg0) {
                if (class384.field5077 == arg0) {
                    var6 = 4;
                    var5 = arg1 * 3;
                } else if (class257.field3308 != arg0) {
                    if (class133.field1636 != arg0) {
                        var6 = 0;
                        var5 = arg1;
                    } else {
                        var6 = 5;
                        var5 = arg1 - -2;
                    }
                } else {
                    var6 = 6;
                    var5 = arg1 + 2;
                }
            } else {
                var5 = arg1 - -1;
                var6 = 3;
            }
            OpenGL.glDrawArrays(var6, arg3, var5);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lrq;IB)V", line = 377)
    public final void method1792(class293 arg0, int arg1, byte arg2) {
        if (arg2 == 89) {
            ++field4207;
        }
    }

    @OriginalMember(owner = "client!tm", name = "V", descriptor = "(I)V", line = 387)
    public final void method1793(int arg0) {
        if (arg0 != 1) {
            this.field4265 = null;
        }
        if (class328.field4273 == super.field5709) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class528.field7391 != super.field5709) {
            if (class308.field3931 == super.field5709) {
                OpenGL.glBlendFunc(774, 1);
            }
        } else {
            OpenGL.glBlendFunc(1, 1);
        }
        ++field4217;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZI[IIII)Leea;", line = 410)
    public final class112 method1794(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
        ++field4171;
        if (arg0 != 0) {
            this.method1838(-47);
        }
        if (!this.field4259 && (!class415.method2366(-125, arg5) || !class415.method2366(-125, arg2))) {
            if (!this.field4257) {
                class131 var8 = new class131(this, class10.field80, class160.field1932, class129.method731(arg5, -27265), class129.method731(arg2, arg0 + -27265));
                var8.method651(arg3, arg6, arg5, 0, arg4, 5826, arg2, 0);
                return var8;
            } else {
                return new class403(this, arg5, arg2, arg3, arg6, arg4);
            }
        } else {
            return new class131(this, arg5, arg2, arg1, arg3, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)Liaa;", line = 438)
    public final class419 method1795(boolean arg0, byte arg1) {
        ++field4204;
        return arg1 > -46 ? null : new class443(this, class160.field1933, arg0);
    }

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "(Z)V", line = 449)
    public final void method1796(boolean arg0) {
        ++field4197;
        int var2;
        if (super.field5705) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = super.field5708;
        } else {
            super.field5714 = (float) (-super.field5796 + super.field5701);
            super.field5698 = super.field5714 - (float) super.field5697;
            if (super.field5698 < (float) super.field5782) {
                super.field5698 = (float) super.field5782;
            }
            OpenGL.glFogf(2915, super.field5698);
            OpenGL.glFogf(2916, super.field5714);
            var2 = super.field5751;
        }
        class157.field1920[1] = (float) class288.method1624(var2, 65280) / 65280.0F;
        class157.field1920[2] = (float) class288.method1624(255, var2) / 255.0F;
        class157.field1920[0] = (float) class288.method1624(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class157.field1920, 0);
        if (arg0) {
            this.method1825(46);
        }
    }

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "(B)V", line = 485)
    public final void method1797(byte arg0) {
        ++field4243;
        this.method1822((byte) -91);
        if (arg0 != 76) {
            this.method1842(116, (byte) 36, 31);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZIILbg;)V", line = 496)
    public final void method1798(boolean arg0, boolean arg1, int arg2, int arg3, class393 arg4) {
        ++field4169;
        OpenGL.glTexEnvi(8960, arg2 + 34176, class577.method3362(arg4, arg3 + 34161));
        if (arg0) {
            OpenGL.glTexEnvi(8960, arg2 + 34192, arg1 ? 771 : 770);
        } else {
            OpenGL.glTexEnvi(8960, 34192 - -arg2, !arg1 ? 768 : 769);
        }
        if (arg3 != 6) {
            this.method1805(-51, (class160) null, (class135) null);
        }
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(II)V", line = 513)
    public static final void method1799(int arg0, int arg1) {
        class349 var2 = class383.field5070[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class349 var4 = class383.field5070[var3][arg0][arg1] = class383.field5070[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field4515;
                for (class61 var5 = var4.field4499; var5 != null; var5 = var5.field595) {
                    class598 var6 = var5.field589;
                    if (var6.field8653 == arg0 && var6.field8650 == arg1) {
                        --var6.field8660;
                    }
                }
            }
        }
        if (class383.field5070[0][arg0][arg1] == null) {
            class383.field5070[0][arg0][arg1] = new class349(0, arg0, arg1);
            class383.field5070[0][arg0][arg1].field4495 = 1;
        }
        class383.field5070[0][arg0][arg1].field4494 = var2;
        class383.field5070[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lmv;Lmv;FLmv;)Lmv;", line = 552)
    public final class313 method1162(class313 arg0, class313 arg1, float arg2, class313 arg3) {
        ++field4188;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(IIIII)V", line = 561)
    public static final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4237;
        class557 var5 = class93.method564(8, -14073, arg4);
        var5.method3257(1948);
        if (arg0 == -27758) {
            var5.field8211 = arg3;
            var5.field8207 = arg2;
            var5.field8201 = arg1;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILsc;Liaa;II)V", line = 579)
    public final void method1801(int arg0, int arg1, int arg2, class290 arg3, class419 arg4, int arg5, int arg6) {
        ++field4229;
        int var8;
        byte var9;
        if (class420.field5440 != arg3) {
            if (class480.field6743 != arg3) {
                if (class384.field5077 != arg3) {
                    if (class257.field3308 != arg3) {
                        if (class133.field1636 == arg3) {
                            var8 = arg5 + 2;
                            var9 = 5;
                        } else {
                            var9 = 0;
                            var8 = arg5;
                        }
                    } else {
                        var8 = arg5 - -2;
                        var9 = 6;
                    }
                } else {
                    var8 = arg5 * 3;
                    var9 = 4;
                }
            } else {
                var8 = arg5 + 1;
                var9 = 3;
            }
        } else {
            var8 = arg5 * 2;
            var9 = 1;
        }
        if (arg2 != 1440) {
            field4190 = -19L;
        }
        class160 var10 = arg4.method645(arg2 ^ 29822);
        class443 var11 = (class443) arg4;
        var11.method2294(true);
        OpenGL.glDrawElements(var9, var8, class450.method2634(5122, var10), var11.method2295(-1) + (long) (var10.field1924 * arg6));
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lbg;IZI)V", line = 636)
    public final void method1802(class393 arg0, int arg1, boolean arg2, int arg3) {
        ++field4206;
        if (arg1 != 0) {
            method1817(39, -107, 113, -109, 117, 112);
        }
        OpenGL.glTexEnvi(8960, 34184 - -arg3, class577.method3362(arg0, arg1 + 34167));
        OpenGL.glTexEnvi(8960, 34200 - -arg3, !arg2 ? 770 : 771);
    }

    @OriginalMember(owner = "client!tm", name = "T", descriptor = "(I)V", line = 648)
    public final void method1803(int arg0) {
        if (super.field5763 && !super.field5720) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field4226;
        if (arg0 != 0) {
            this.method1822((byte) 29);
        }
    }

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "(B)V", line = 663)
    public final void method1804(byte arg0) {
        ++field4225;
        if (super.field5706) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        if (arg0 != -8) {
            this.method1825(124);
        }
    }

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "()V", line = 681)
    public final void method1123() {
        ++field4242;
        this.field4196.swapBuffers();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILvp;Lg;)Z", line = 695)
    public final boolean method1805(int arg0, class160 arg1, class135 arg2) {
        ++field4175;
        int var4 = -101 / ((arg0 - -55) / 35);
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "(B)V", line = 705)
    public final void method1806(byte arg0) {
        if (arg0 > -47) {
            this.field4256 = null;
        }
        OpenGL.glTexEnvi(8960, 34162, class10.method51(super.field5742[super.field5750], (byte) -118));
        ++field4187;
    }

    @OriginalMember(owner = "client!tm", name = "O", descriptor = "(I)V", line = 716)
    public final void method1807(int arg0) {
        ++field4239;
        class157.field1920[1] = super.field5790 * super.field5774;
        class157.field1920[2] = super.field5774 * super.field5729;
        class157.field1920[3] = 1.0F;
        class157.field1920[arg0] = super.field5774 * super.field5747;
        OpenGL.glLightModelfv(2899, class157.field1920, 0);
    }

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "(I)V", line = 728)
    public final void method1808(int arg0) {
        ++field4174;
        int var2 = this.field4265[super.field5750];
        if (~var2 != -1) {
            this.field4265[super.field5750] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
        if (arg0 != 0) {
            method1799(87, 113);
        }
    }

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "(I)V", line = 749)
    public final void method1809(int arg0) {
        for (int var2 = super.field5768 + -1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(33984 - -var2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field4198;
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glDisable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field4196.setSwapInterval(0);
        super.method1809(arg0 + arg0);
    }

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "(IIII)[I", line = 802)
    public final int[] method1111(int arg0, int arg1, int arg2, int arg3) {
        ++field4244;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + super.field5564 + -var6 + -1, arg2, 1, 32993, this.field4261, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V", line = 821)
    public final void method1810(byte arg0, int arg1) {
        if (arg0 > -43) {
            this.field4259 = true;
        }
        ++field4182;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V", line = 831)
    public final void method1811(byte arg0) {
        OpenGL.glMatrixMode(5890);
        ++field4241;
        if (super.field5770[super.field5750] == class514.field7260) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(super.field5789[super.field5750].method1884(class281.field3682, (byte) 47), 0);
        }
        OpenGL.glMatrixMode(5888);
        if (arg0 != 6) {
            this.field4238 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "(I)V", line = 851)
    public final void method1812(int arg0) {
        if (arg0 == 16168) {
            ++field4200;
            if (super.field5718) {
                OpenGL.glEnable(3008);
            } else {
                OpenGL.glDisable(3008);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 870)
    public final void method1813(int arg0, Object arg1, Canvas arg2) {
        ++field4184;
        if (arg0 <= 60) {
            this.method1790((class135) null, 75, -36, -76, (byte[]) null, true);
        }
        Long var4 = (Long) arg1;
        this.field4196.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V", line = 883)
    public final void method1814(Object arg0, Canvas arg1, int arg2) {
        ++field4209;
        Long var4 = (Long) arg0;
        if (arg2 > -92) {
            this.method1795(false, (byte) 98);
        }
        this.field4196.releaseSurface(arg1, var4);
    }

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "(B)V", line = 897)
    public final void method1815(byte arg0) {
        int var2 = 119 % ((62 - arg0) / 38);
        OpenGL.glDepthMask(super.field5723 && super.field5791);
        ++field4230;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 909)
    public final synchronized void method1138(int arg0) {
        ++field4220;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field4238.method1043(true)) {
            class171 var12 = (class171) this.field4238.method1054((byte) -105);
            class474.field6638[var3++] = (int) var12.field7967;
            super.field5689 -= var12.field2081;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class474.field6638, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class474.field6638, 0);
            var3 = 0;
        }
        while (!this.field4248.method1043(true)) {
            class171 var11 = (class171) this.field4248.method1054((byte) -105);
            class474.field6638[var3++] = (int) var11.field7967;
            super.field5686 -= var11.field2081;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class474.field6638, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class474.field6638, 0);
            var3 = 0;
        }
        while (!this.field4250.method1043(true)) {
            class171 var10 = (class171) this.field4250.method1054((byte) -105);
            class474.field6638[var3++] = var10.field2081;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class474.field6638, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class474.field6638, 0);
            var3 = 0;
        }
        while (!this.field4251.method1043(true)) {
            class171 var9 = (class171) this.field4251.method1054((byte) -105);
            class474.field6638[var3++] = (int) var9.field7967;
            super.field5691 -= var9.field2081;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class474.field6638, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class474.field6638, 0);
            boolean var4 = false;
        }
        while (!this.field4180.method1043(true)) {
            class171 var8 = (class171) this.field4180.method1054((byte) -105);
            OpenGL.glDeleteLists((int) var8.field7967, var8.field2081);
        }
        while (!this.field4252.method1043(true)) {
            class544 var7 = this.field4252.method1054((byte) -105);
            OpenGL.glDeleteProgramARB((int) var7.field7967);
        }
        while (!this.field4253.method1043(true)) {
            class544 var6 = this.field4253.method1054((byte) -105);
            OpenGL.glDeleteObjectARB(var6.field7967);
        }
        while (!this.field4180.method1043(true)) {
            class171 var5 = (class171) this.field4180.method1054((byte) -105);
            OpenGL.glDeleteLists((int) var5.field7967, var5.field2081);
        }
        if (~this.method1127() < -100663297 && this.field4254 + 60000L < class190.method1030(false)) {
            System.gc();
            this.field4254 = class190.method1030(false);
        }
        super.method1138(var2);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V", line = 1072)
    public final void method1816(Object arg0, byte arg1, Canvas arg2) {
        if (arg1 == -40) {
            ++field4205;
            Long var4 = (Long) arg0;
            if (!this.field4196.setSurface(var4)) {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "()Z", line = 1090)
    public final boolean method1143() {
        ++field4221;
        return false;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(IIIIII)V", line = 1099)
    public static final void method1817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4228;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg0 * arg0;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) - arg4) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 + -1) * var15;
        class62.method363(arg0 + arg5, -128, arg2, class328.field4287[arg1], -arg0 + arg5);
        while (var7 > 0) {
            if (~var13 > -1) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    ++var6;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                ++var6;
            }
            var14 += -var18;
            var13 += -var20;
            --var7;
            var18 -= var15;
            var20 -= var15;
            int var21 = -var7 + arg1;
            int var22 = arg1 + var7;
            int var23 = arg5 + var6;
            int var24 = -var6 + arg5;
            class62.method363(var23, -128, arg2, class328.field4287[var21], var24);
            class62.method363(var23, -127, arg2, class328.field4287[var22], var24);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)V", line = 1179)
    public final void method1132(int arg0, int arg1, int arg2, int arg3) {
        ++field4246;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 1187)
    public final Object method1818(Canvas arg0, int arg1) {
        ++field4181;
        long var3 = this.field4196.prepareSurface(arg0);
        int var5 = -107 / ((arg1 - 34) / 38);
        if (var3 == -1L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "()V", line = 1203)
    public final void method1109() {
        ++field4170;
    }

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "()V", line = 1212)
    public final void method1158() {
        ++field4185;
        super.method1158();
        if (this.field4196 != null) {
            this.field4196.method3022();
            this.field4196.release();
            this.field4196 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([FIIZIILg;B)Leea;", line = 1228)
    public final class112 method1819(float[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class135 arg6, byte arg7) {
        if (arg7 != -108) {
            return null;
        } else {
            ++field4178;
            if (!this.field4259 && (!class415.method2366(-127, arg2) || !class415.method2366(arg7 + -16, arg5))) {
                if (this.field4257) {
                    return new class403(this, arg6, arg2, arg5, arg0, arg1, arg4);
                } else {
                    class131 var9 = new class131(this, arg6, class160.field1936, class129.method731(arg2, -27265), class129.method731(arg5, -27265));
                    var9.method740(arg4, arg1, -109, arg0, 0, 0, arg2, arg6, arg5);
                    return var9;
                }
            } else {
                return new class131(this, arg6, arg2, arg5, arg3, arg0, arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "(I)V", line = 1257)
    public final void method1820(int arg0) {
        if (arg0 < 28) {
            this.field4255 = null;
        }
        OpenGL.glMatrixMode(5889);
        ++field4194;
        OpenGL.glLoadMatrixf(super.field5769, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tm", name = "cb", descriptor = "(I)V", line = 1271)
    public final void method1821(int arg0) {
        ++field4223;
        if (arg0 > -12) {
            this.field4250 = null;
        }
        OpenGL.glScissor(super.field5761 + super.field5717, -super.field5762 + super.field5757 - -super.field5564, -super.field5761 + super.field5707, super.field5762 - super.field5725);
    }

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "(B)V", line = 1282)
    private final void method1822(byte arg0) {
        ++field4213;
        if (arg0 > -78) {
            this.field4265 = null;
        }
        if (this.field4260) {
            OpenGL.glPopMatrix();
        }
        if (super.field5728.method3455((byte) 77)) {
            if (!this.field4260) {
                OpenGL.glLoadIdentity();
                OpenGL.glMultMatrixf(super.field5694.method1884(class281.field3682, (byte) 47), 0);
                this.method1841(87);
                this.method1786(31090);
                this.field4260 = true;
            }
            if (this.field4260) {
                OpenGL.glPushMatrix();
            }
            if (!super.field5690) {
                OpenGL.glMultMatrixf(super.field5687.method1884(class281.field3682, (byte) 47), 0);
                return;
            }
        } else {
            if (!super.field5690) {
                OpenGL.glLoadMatrixf(super.field5687.method1884(class281.field3682, (byte) 47), 0);
                this.field4260 = false;
                return;
            }
            OpenGL.glLoadIdentity();
            this.field4260 = false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZ)Lrq;", line = 1333)
    public final class293 method1823(int arg0, boolean arg1) {
        ++field4166;
        return arg0 < 111 ? null : new class140(this, arg1);
    }

    @OriginalMember(owner = "client!tm", name = "X", descriptor = "(I)V", line = 1344)
    public final void method1824(int arg0) {
        class157.field1920[3] = 1.0F;
        class157.field1920[0] = super.field5747 * super.field5746;
        ++field4201;
        class157.field1920[2] = super.field5746 * super.field5729;
        class157.field1920[1] = super.field5790 * super.field5746;
        OpenGL.glLightfv(16384, 4609, class157.field1920, 0);
        class157.field1920[2] = -super.field5702 * super.field5729;
        class157.field1920[0] = -super.field5702 * super.field5747;
        class157.field1920[1] = -super.field5702 * super.field5790;
        if (arg0 == 28526) {
            class157.field1920[3] = 1.0F;
            OpenGL.glLightfv(16385, 4609, class157.field1920, 0);
        }
    }

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "(I)V", line = 1367)
    public final void method1825(int arg0) {
        if (arg0 == 1) {
            ++field4179;
            if (super.field5721) {
                OpenGL.glEnable(16384);
                OpenGL.glEnable(16385);
            } else {
                OpenGL.glDisable(16384);
                OpenGL.glDisable(16385);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLbk;)V", line = 1388)
    public final void method1826(byte arg0, class314 arg1) {
        if (arg0 == 64) {
            ++field4193;
            if (class476.field6697 != arg1) {
                int var3 = class98.method600(arg1, 34066);
                OpenGL.glTexGeni(8192, 9472, var3);
                OpenGL.glEnable(3168);
                OpenGL.glTexGeni(8193, 9472, var3);
                OpenGL.glEnable(3169);
                OpenGL.glTexGeni(8194, 9472, var3);
                OpenGL.glEnable(3170);
            } else {
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[BZILg;II)Leea;", line = 1416)
    public final class112 method1827(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, class135 arg5, int arg6, int arg7) {
        int var9 = 48 / ((arg6 - -6) / 57);
        ++field4224;
        if (!this.field4259 && (!class415.method2366(-124, arg4) || !class415.method2366(-125, arg0))) {
            if (this.field4257) {
                return new class403(this, arg5, arg4, arg0, arg2, arg1, arg7);
            } else {
                class131 var10 = new class131(this, arg5, class160.field1932, class129.method731(arg4, -27265), class129.method731(arg0, -27265));
                var10.method650((byte) 125, 0, 0, arg7, arg5, arg0, arg1, arg4, arg2);
                return var10;
            }
        } else {
            return new class131(this, arg5, arg4, arg0, arg3, arg2, arg1, arg7);
        }
    }

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "()Z", line = 1446)
    public final boolean method1169() {
        ++field4222;
        return false;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1455)
    public final void method1139(Rectangle[] arg0, int arg1) {
        this.method1123();
        ++field4210;
    }

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "(B)V", line = 1464)
    public final void method1828(byte arg0) {
        int var2 = 0 % ((38 - arg0) / 39);
        ++field4235;
    }

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "(I)V", line = 1476)
    public final void method1829(int arg0) {
        if (arg0 != 16) {
            this.method1158();
        }
        OpenGL.glActiveTexture(super.field5750 + 33984);
        ++field4173;
    }

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "(I)V", line = 1487)
    public final void method1830(int arg0) {
        int var2 = -85 / ((2 - arg0) / 49);
        if (super.field5730) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
        ++field4202;
    }

    @OriginalMember(owner = "client!tm", name = "Z", descriptor = "(I)V", line = 1502)
    public final void method1156(int arg0) {
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field4189;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "()V", line = 1511)
    public final void method1131() {
        ++field4203;
        if (super.field5512 > 0 || super.field5564 > 0) {
            int var1 = super.field5761;
            int var2 = super.field5707;
            int var3 = super.field5725;
            int var4 = super.field5762;
            this.method1182();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2483(9588);
            this.method2424(0, false);
            this.method2452(false, (byte) -94);
            this.method2441(false, 128);
            this.method2478((byte) 80, false);
            this.method2459(85, (class440) null);
            this.method2439(-2, false, false, (byte) 125);
            this.method2437(1, -3);
            this.method2405(0, -18001);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field5512, super.field5564, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1107(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(B)V", line = 1557)
    public final void method1831(byte arg0) {
        if (arg0 != 101) {
            this.field4196 = null;
        }
        OpenGL.glViewport(super.field5717, super.field5757, super.field5512, super.field5564);
        ++field4199;
    }

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "(I)V", line = 1569)
    public final void method1832(int arg0) {
        class157.field1920[3] = (float) (super.field5734 >>> 24) / 255.0F;
        ++field4249;
        class157.field1920[2] = (float) class288.method1624(255, super.field5734) / 255.0F;
        class157.field1920[1] = (float) class288.method1624(super.field5734, 65280) / 65280.0F;
        if (arg0 >= 17) {
            class157.field1920[0] = (float) class288.method1624(16711680, super.field5734) / 1.671168E7F;
            OpenGL.glTexEnvfv(8960, 8705, class157.field1920, 0);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([Ljp;I)Lvr;", line = 1586)
    public final class116 method1833(class297[] arg0, int arg1) {
        ++field4208;
        return arg1 != 0 ? null : null;
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "()V", line = 1598)
    public final void method1117() {
        ++field4232;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(ZI)V", line = 1605)
    public final void method1834(boolean arg0, int arg1) {
        if (!arg0) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
        if (arg1 != 21492) {
            this.field4250 = null;
        }
        ++field4191;
    }

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "(I)V", line = 1622)
    public final void method1835(int arg0) {
        ++field4218;
        this.method1822((byte) -82);
        int var2 = -37 % ((40 - arg0) / 61);
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(Z)V", line = 1634)
    public final void method1185(boolean arg0) {
        ++field4212;
    }

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "(I)V", line = 1641)
    public final void method1836(int arg0) {
        if (arg0 == -1) {
            ++field4240;
            if (super.field5820) {
                OpenGL.glEnable(3089);
            } else {
                OpenGL.glDisable(3089);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lvr;I)V", line = 1657)
    public final void method1837(class116 arg0, int arg1) {
        if (arg1 != 9) {
            this.field4251 = null;
        }
        ++field4172;
    }

    @OriginalMember(owner = "client!tm", name = "S", descriptor = "(I)V", line = 1668)
    public final void method1838(int arg0) {
        ++field4168;
        if (arg0 == -1) {
            OpenGL.glTexEnvi(8960, 34161, class10.method51(super.field5764[super.field5750], (byte) -120));
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILg;ZLvp;)Leea;", line = 1682)
    public final class112 method1839(int arg0, int arg1, class135 arg2, boolean arg3, class160 arg4) {
        if (!arg3) {
            return null;
        } else {
            ++field4192;
            if (!this.field4259 && (!class415.method2366(-122, arg1) || !class415.method2366(-124, arg0))) {
                return !this.field4257 ? new class131(this, arg2, arg4, class129.method731(arg1, -27265), class129.method731(arg0, -27265)) : new class403(this, arg2, arg4, arg1, arg0);
            } else {
                return new class131(this, arg2, arg4, arg1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "(II)V", line = 1709)
    public final synchronized void method1840(int arg0, int arg1) {
        ++field4219;
        if (arg1 != 2918) {
            this.field4262 = -42;
        }
        class544 var3 = new class544();
        var3.field7967 = (long) arg0;
        this.field4252.method1040(var3, -113);
    }

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "(I)V", line = 1723)
    public final void method1841(int arg0) {
        ++field4227;
        OpenGL.glLightfv(16384, 4611, super.field5745, 0);
        int var2 = 1 / ((arg0 - 22) / 41);
        OpenGL.glLightfv(16385, 4611, super.field5786, 0);
    }

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "()V", line = 1736)
    public final void method1192() {
        ++field4216;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(FFF)V", line = 1744)
    public final void method1171(float arg0, float arg1, float arg2) {
        ++field4245;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBI)V", line = 1751)
    public final synchronized void method1842(int arg0, byte arg1, int arg2) {
        if (arg1 > -79) {
            this.field4266 = -96;
        }
        ++field4214;
        class171 var4 = new class171(arg0);
        var4.field7967 = (long) arg2;
        this.field4238.method1040(var4, -120);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(BI)Llj;", line = 1765)
    public final class521 method1843(byte arg0, int arg1) {
        ++field4234;
        int var3 = 111 % ((arg0 - 64) / 45);
        if (arg1 != 3) {
            return arg1 == 4 ? new class577(this, super.field5586, super.field5562) : super.method1843((byte) -86, arg1);
        } else {
            return new class608(this, super.field5586);
        }
    }

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "(I)F", line = 1803)
    public final float method1844(int arg0) {
        ++field4177;
        return arg0 != -10259 ? 0.47512442F : 0.0F;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLg;Lvp;)Z", line = 1822)
    public final boolean method1845(byte arg0, class135 arg1, class160 arg2) {
        if (arg0 < 100) {
            return false;
        } else {
            ++field4211;
            return true;
        }
    }
}
