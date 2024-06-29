import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class347 extends class424 {

    @OriginalMember(owner = "client!tk", name = "ti", descriptor = "Lfh;")
    private class653 field4461 = new class653();

    @OriginalMember(owner = "client!tk", name = "ui", descriptor = "Lfh;")
    private class653 field4462 = new class653();

    @OriginalMember(owner = "client!tk", name = "vi", descriptor = "Lfh;")
    private class653 field4463 = new class653();

    @OriginalMember(owner = "client!tk", name = "wi", descriptor = "Lfh;")
    private class653 field4464 = new class653();

    @OriginalMember(owner = "client!tk", name = "xi", descriptor = "Lfh;")
    private class653 field4465 = new class653();

    @OriginalMember(owner = "client!tk", name = "yi", descriptor = "Lfh;")
    private class653 field4466 = new class653();

    @OriginalMember(owner = "client!tk", name = "zi", descriptor = "Lfh;")
    private class653 field4467 = new class653();

    @OriginalMember(owner = "client!tk", name = "Bi", descriptor = "[Lqr;")
    private class66[] field4469 = new class66[16];

    @OriginalMember(owner = "client!tk", name = "Hi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field4475 = new MapBuffer();

    @OriginalMember(owner = "client!tk", name = "Ji", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field4477 = new MapBuffer();

    @OriginalMember(owner = "client!tk", name = "Pi", descriptor = "I")
    private int field4483 = 0;

    @OriginalMember(owner = "client!tk", name = "oh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4404;

    @OriginalMember(owner = "client!tk", name = "Mi", descriptor = "Ljava/lang/String;")
    private String field4480;

    @OriginalMember(owner = "client!tk", name = "Ui", descriptor = "Ljava/lang/String;")
    private String field4488;

    @OriginalMember(owner = "client!tk", name = "Qi", descriptor = "I")
    private int field4484;

    @OriginalMember(owner = "client!tk", name = "Ni", descriptor = "Z")
    public boolean field4481;

    @OriginalMember(owner = "client!tk", name = "Oi", descriptor = "Z")
    private boolean field4482;

    @OriginalMember(owner = "client!tk", name = "Si", descriptor = "Z")
    private boolean field4486;

    @OriginalMember(owner = "client!tk", name = "Li", descriptor = "Z")
    public boolean field4479;

    @OriginalMember(owner = "client!tk", name = "Vi", descriptor = "Z")
    public boolean field4489;

    @OriginalMember(owner = "client!tk", name = "Ki", descriptor = "Z")
    public boolean field4478;

    @OriginalMember(owner = "client!tk", name = "Ri", descriptor = "[I")
    public int[] field4485;

    @OriginalMember(owner = "client!tk", name = "Ti", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!tk", name = "Bh", descriptor = "Lhg;")
    public static class693 field4417 = new class693(20, 8);

    @OriginalMember(owner = "client!tk", name = "fi", descriptor = "[I")
    public static int[] field4447 = new int[4096];

    @OriginalMember(owner = "client!tk", name = "si", descriptor = "Lbda;")
    public static class508 field4460 = new class508();

    @OriginalMember(owner = "client!tk", name = "Gg", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!tk", name = "Hg", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!tk", name = "Ig", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!tk", name = "Jg", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!tk", name = "Kg", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!tk", name = "Lg", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!tk", name = "Mg", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!tk", name = "Ng", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!tk", name = "Og", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!tk", name = "Pg", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!tk", name = "Qg", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!tk", name = "Rg", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!tk", name = "Sg", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!tk", name = "Tg", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!tk", name = "Ug", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!tk", name = "Vg", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!tk", name = "Wg", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!tk", name = "Xg", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!tk", name = "Yg", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!tk", name = "Zg", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!tk", name = "ah", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!tk", name = "bh", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!tk", name = "ch", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!tk", name = "dh", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!tk", name = "eh", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!tk", name = "fh", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!tk", name = "gh", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!tk", name = "hh", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!tk", name = "ih", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!tk", name = "jh", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!tk", name = "kh", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!tk", name = "lh", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!tk", name = "mh", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!tk", name = "nh", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!tk", name = "ph", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!tk", name = "qh", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!tk", name = "rh", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!tk", name = "sh", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!tk", name = "th", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!tk", name = "uh", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!tk", name = "vh", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!tk", name = "wh", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!tk", name = "xh", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!tk", name = "yh", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!tk", name = "zh", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!tk", name = "Ah", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!tk", name = "Ch", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!tk", name = "Dh", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!tk", name = "Eh", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!tk", name = "Fh", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!tk", name = "Gh", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!tk", name = "Hh", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!tk", name = "Ih", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!tk", name = "Jh", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!tk", name = "Kh", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!tk", name = "Lh", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!tk", name = "Mh", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!tk", name = "Nh", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!tk", name = "Oh", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!tk", name = "Ph", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!tk", name = "Qh", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!tk", name = "Rh", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!tk", name = "Sh", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!tk", name = "Th", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!tk", name = "Uh", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!tk", name = "Vh", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!tk", name = "Wh", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!tk", name = "Xh", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!tk", name = "Yh", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!tk", name = "Zh", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!tk", name = "ai", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!tk", name = "bi", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!tk", name = "ci", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!tk", name = "di", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!tk", name = "ei", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!tk", name = "gi", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!tk", name = "hi", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!tk", name = "ii", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!tk", name = "ji", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!tk", name = "ki", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!tk", name = "li", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!tk", name = "mi", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!tk", name = "ni", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!tk", name = "oi", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!tk", name = "pi", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!tk", name = "qi", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!tk", name = "ri", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!tk", name = "Ii", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!tk", name = "Fi", descriptor = "J")
    private long field4473;

    @OriginalMember(owner = "client!tk", name = "Ai", descriptor = "Z")
    private boolean field4468;

    @OriginalMember(owner = "client!tk", name = "Ci", descriptor = "Z")
    private boolean field4470;

    @OriginalMember(owner = "client!tk", name = "Di", descriptor = "Z")
    private boolean field4471;

    @OriginalMember(owner = "client!tk", name = "Ei", descriptor = "Z")
    private boolean field4472;

    @OriginalMember(owner = "client!tk", name = "Gi", descriptor = "Z")
    private boolean field4474;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(ZI)V", line = 4)
    public final void method1982(boolean arg0, int arg1) {
        ++field4388;
        if (arg1 < -52) {
            if (!arg0) {
                OpenGL.glDisable(32925);
            } else {
                OpenGL.glEnable(32925);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)Lgda;", line = 19)
    public final class55 method1983(byte arg0, int arg1) {
        ++field4448;
        int var3 = 88 / ((arg0 - 36) / 34);
        if (~arg1 != -4) {
            if (~arg1 != -5) {
                return ~arg1 == -9 ? new class437(this, super.field5451, super.field5407) : super.method1983((byte) -17, arg1);
            } else {
                return new class29(this, super.field5451, super.field5407);
            }
        } else {
            return new class177(this, super.field5451);
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)V", line = 61)
    public final void method497(int arg0, int arg1) throws class230 {
        this.field4404.swapBuffers();
        ++field4411;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(IB)V", line = 73)
    public final synchronized void method1984(int arg0, byte arg1) {
        ++field4397;
        class168 var3 = new class168();
        var3.field2333 = (long) arg0;
        this.field4466.method3671(var3, false);
        if (arg1 != -58) {
            this.field4471 = false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Let;BLwha;)Z", line = 90)
    public final boolean method1985(class596 arg0, byte arg1, class285 arg2) {
        if (arg1 != 76) {
            return false;
        } else {
            ++field4400;
            return true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "(B)V", line = 101)
    public final void method1986(byte arg0) {
        ++field4376;
        class586.field8192[3] = 1.0F;
        class586.field8192[2] = super.field5650 * super.field5600;
        class586.field8192[1] = super.field5656 * super.field5650;
        class586.field8192[0] = super.field5650 * super.field5620;
        OpenGL.glLightModelfv(2899, class586.field8192, 0);
        if (arg0 != 127) {
            this.field4481 = false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "GA", descriptor = "(I)V", line = 116)
    public final void method462(int arg0) {
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field4428;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "()I", line = 130)
    public final int method440() {
        ++field4459;
        return this.field4483;
    }

    @OriginalMember(owner = "client!tk", name = "eb", descriptor = "(I)V", line = 140)
    public final void method1987(int arg0) {
        if (arg0 == 3) {
            this.field4474 = false;
            ++field4412;
            this.method2023((byte) -120);
        }
    }

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "(B)V", line = 152)
    public final void method1988(byte arg0) {
        if (arg0 <= 51) {
            this.field4489 = true;
        }
        ++field4372;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V", line = 162)
    public final void method507(boolean arg0) {
        ++field4393;
    }

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "(I)V", line = 171)
    public final void method1989(int arg0) {
        ++field4409;
        if (super.field5708) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
        if (arg0 >= -103) {
            this.field4489 = true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "(B)V", line = 188)
    public final void method1990(byte arg0) {
        ++field4423;
        this.method2023((byte) -123);
        if (arg0 != -98) {
            this.method2000(-27, (byte[]) null, -73, 30, (class596) null, 28);
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(Z)V", line = 199)
    public final void method1991(boolean arg0) {
        if (!arg0) {
            ++field4389;
            if (super.field5585) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lhca;Llda;)Lnl;", line = 214)
    public final class554 method464(class492 arg0, class488 arg1) {
        ++field4455;
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V", line = 222)
    public final void method1992(int arg0) {
        if (arg0 != 3688) {
            this.method2012((class285) null, -57, -25, (byte) -11, (class596) null);
        }
        ++field4430;
        OpenGL.glActiveTexture(super.field5653 + 33984);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Let;Lwha;Z)Z", line = 233)
    public final boolean method1993(class596 arg0, class285 arg1, boolean arg2) {
        if (arg2) {
            this.field4479 = true;
        }
        ++field4457;
        return true;
    }

    @OriginalMember(owner = "client!tk", name = "fb", descriptor = "(I)V", line = 244)
    public static void method1994(int arg0) {
        if (arg0 != 30837) {
            field4460 = null;
        }
        field4417 = null;
        field4447 = null;
        field4460 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZB)Liaa;", line = 258)
    public final class497 method1995(boolean arg0, byte arg1) {
        ++field4370;
        return arg1 >= -77 ? null : new class343(this, class285.field3590, arg0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lmda;Lmda;FLmda;)Lmda;", line = 270)
    public final class267 method485(class267 arg0, class267 arg1, float arg2, class267 arg3) {
        ++field4424;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lnd;I)V", line = 278)
    public class347(OpenGL arg0, Canvas arg1, long arg2, class153 arg3, class547 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field4404 = arg0;
            this.field4404.method3510();
            this.field4480 = OpenGL.glGetString(7936).toLowerCase();
            this.field4488 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field4480.indexOf("microsoft") == -1 && ~this.field4480.indexOf("brian paul") == 0 && ~this.field4480.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class249.method1538(' ', 0, var8.replace('.', ' '));
                if (~var9.length > -3) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class160.method1124(var9[0], 116);
                        int var11 = class160.method1124(var9[1], 114);
                        this.field4484 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field4484 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field4404.method3509("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field4404.method3509("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field5586 = var12[0];
                        if (super.field5586 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field5636 = 8;
                            this.field4481 = this.field4404.method3509("GL_ARB_vertex_buffer_object");
                            super.field5608 = this.field4404.method3509("GL_ARB_multisample");
                            this.field4482 = this.field4404.method3509("GL_ARB_texture_rectangle");
                            super.field5591 = this.field4404.method3509("GL_ARB_texture_cube_map");
                            this.field4486 = this.field4404.method3509("GL_ARB_texture_non_power_of_two");
                            super.field5646 = this.field4404.method3509("GL_EXT_texture3D");
                            this.field4479 = this.field4404.method3509("GL_ARB_vertex_shader");
                            this.field4489 = this.field4404.method3509("GL_ARB_vertex_program");
                            this.field4478 = this.field4404.method3509("GL_ARB_fragment_shader");
                            this.field4404.method3509("GL_ARB_fragment_program");
                            this.field4485 = new int[super.field5586];
                            this.field4487 = !Stream.method3798() ? 5121 : 33639;
                            if (~this.field4488.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class249.method1538(' ', 0, this.field4488.replace('/', ' '));
                                for (int var17 = 0; ~var17 > ~var16.length; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (var18.charAt(0) == 'x' && var18.length() >= 3 && class396.method2231(var18.substring(1, 3), (byte) 91)) {
                                                var15 = true;
                                                var18 = var18.substring(1);
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var14 = true;
                                                    var18 = var18.substring(2);
                                                }
                                                if (var18.length() >= 4 && class396.method2231(var18.substring(0, 4), (byte) 71)) {
                                                    var13 = class160.method1124(var18.substring(0, 4), 117);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && ~var13 >= -9251) {
                                        super.field5646 = false;
                                    }
                                    if (var13 >= 7000 && ~var13 >= -8000) {
                                        this.field4481 = false;
                                    }
                                }
                                this.field4482 &= this.field4404.method3509("GL_ARB_half_float_pixel");
                            }
                            this.field4480.indexOf("intel");
                            if (this.field4481) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method478((byte) 72);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()Z", line = 434)
    public final boolean method442() {
        ++field4439;
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "(I)V", line = 442)
    public final void method1996(int arg0) {
        ++field4426;
        OpenGL.glDepthMask(super.field5677 && super.field5603);
        if (arg0 != 0) {
            this.field4461 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lnl;)V", line = 453)
    public final void method550(class554 arg0) {
        ++field4432;
    }

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "(B)V", line = 460)
    public final void method1997(byte arg0) {
        ++field4406;
        super.field5607 = (float) (-super.field5659 + super.field5661);
        if (arg0 != 36) {
            this.method2034(-41, true, 56, (int[][]) null);
        }
        super.field5598 = (float) (-super.field5599) + super.field5607;
        if ((float) super.field5589 > super.field5598) {
            super.field5598 = (float) super.field5589;
        }
        OpenGL.glFogf(2915, super.field5598);
        OpenGL.glFogf(2916, super.field5607);
        class586.field8192[0] = (float) class702.method3949(16711680, super.field5644) / 1.671168E7F;
        class586.field8192[1] = (float) class702.method3949(65280, super.field5644) / 65280.0F;
        class586.field8192[2] = (float) class702.method3949(255, super.field5644) / 255.0F;
        OpenGL.glFogfv(2918, class586.field8192, 0);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()V", line = 482)
    public final void method444() {
        ++field4375;
    }

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "()Z", line = 489)
    public final boolean method476() {
        ++field4377;
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "(I)V", line = 497)
    public final void method1998(int arg0) {
        OpenGL.glMatrixMode(5890);
        if (arg0 == 1) {
            ++field4445;
            if (super.field5634[super.field5653] == class470.field6301) {
                OpenGL.glLoadIdentity();
            } else {
                OpenGL.glLoadMatrixf(super.field5673[super.field5653].method2740(true, class28.field507), 0);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILbp;Z)V", line = 518)
    public final void method1999(int arg0, int arg1, class389 arg2, boolean arg3) {
        ++field4433;
        OpenGL.glTexEnvi(8960, arg1 + 34184, class123.method940((byte) 115, arg2));
        OpenGL.glTexEnvi(8960, arg1 + 34200, !arg3 ? 770 : 771);
        if (arg0 <= 97) {
            this.method1999(-8, 19, (class389) null, false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[BIILet;I)Laga;", line = 532)
    public final class668 method2000(int arg0, byte[] arg1, int arg2, int arg3, class596 arg4, int arg5) {
        ++field4440;
        return arg3 >= -82 ? null : new class412(this, arg4, arg2, arg5, arg0, arg1);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(FFF)V", line = 544)
    public final void method463(float arg0, float arg1, float arg2) {
        ++field4414;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[Lfk;)Lri;", line = 553)
    public final class114 method2001(int arg0, class655[] arg1) {
        if (arg0 != 16018) {
            this.field4464 = null;
        }
        ++field4458;
        return new class383(arg1);
    }

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "(I)V", line = 564)
    public final void method2002(int arg0) {
        ++field4373;
        OpenGL.glLightfv(16384, 4611, super.field5596, 0);
        if (arg0 != 1) {
            this.field4484 = 2;
        }
        OpenGL.glLightfv(16385, 4611, super.field5590, 0);
    }

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "(I)V", line = 576)
    public final void method2003(int arg0) {
        ++field4443;
        if (arg0 != -8) {
            this.field4472 = true;
        }
        if (!super.field5587) {
            OpenGL.glDisable(3042);
        } else {
            OpenGL.glEnable(3042);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljv;III)V", line = 592)
    public final void method2004(class81 arg0, int arg1, int arg2, int arg3) {
        ++field4383;
        if (arg3 >= -121) {
            this.field4478 = false;
        }
        int var5;
        byte var6;
        if (class551.field7702 != arg0) {
            if (class232.field3051 == arg0) {
                var5 = arg1 - -1;
                var6 = 3;
            } else if (class662.field9281 != arg0) {
                if (class426.field5714 != arg0) {
                    if (class532.field7387 == arg0) {
                        var5 = arg1 + 2;
                        var6 = 5;
                    } else {
                        var6 = 0;
                        var5 = arg1;
                    }
                } else {
                    var5 = arg1 - -2;
                    var6 = 6;
                }
            } else {
                var6 = 4;
                var5 = arg1 * 3;
            }
        } else {
            var5 = arg1 * 2;
            var6 = 1;
        }
        OpenGL.glDrawArrays(var6, arg2, var5);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 644)
    public static final void method2005(int arg0, String arg1) {
        ++field4415;
        System.out.println("Error: " + class294.method1767(arg0 ^ arg0, "\n", arg1, "%0a"));
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "()V", line = 652)
    public final void method459() {
        super.method459();
        ++field4418;
        if (this.field4404 != null) {
            this.field4404.method3511();
            this.field4404.release();
            this.field4404 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(BI)V", line = 672)
    public final void method2006(byte arg0, int arg1) {
        if (arg0 <= 46) {
            field4447 = null;
        }
        ++field4399;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Llda;", line = 682)
    public final class488 method481(int arg0, int arg1) {
        ++field4441;
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V", line = 694)
    public final void method2007(Canvas arg0, Object arg1, int arg2) {
        if (arg2 != 17789) {
            this.field4489 = true;
        }
        ++field4416;
        Long var4 = (Long) arg1;
        if (!this.field4404.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "(I)V", line = 711)
    public final void method2008(int arg0) {
        if (class514.field7213 == super.field5630) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class301.field3943 != super.field5630) {
            if (class665.field9357 == super.field5630) {
                OpenGL.glBlendFunc(774, 1);
            }
        } else {
            OpenGL.glBlendFunc(1, 1);
        }
        if (arg0 != 0) {
            this.method1990((byte) -21);
        }
        ++field4420;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 733)
    public final void method2009(byte arg0, Canvas arg1, Object arg2) {
        ++field4435;
        int var4 = -57 % ((arg0 - 27) / 53);
        Long var5 = (Long) arg2;
        this.field4404.surfaceResized(var5);
    }

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "()V", line = 745)
    public final void method522() {
        ++field4381;
    }

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "()Lnia;", line = 753)
    public final class647 method499() {
        ++field4452;
        int var1 = -1;
        if (~this.field4480.indexOf("nvidia") == 0) {
            if (~this.field4480.indexOf("intel") == 0) {
                if (~this.field4480.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class647(var1, "OpenGL", this.field4484, this.field4488, 0L);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 779)
    public final synchronized void method448(int arg0) {
        ++field4386;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field4462.method3667((byte) -45)) {
            class393 var12 = (class393) this.field4462.method3665(23290);
            class81.field1111[var3++] = (int) var12.field2333;
            super.field5572 -= var12.field4992;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class81.field1111, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class81.field1111, 0);
            var3 = 0;
        }
        while (!this.field4463.method3667((byte) -45)) {
            class393 var11 = (class393) this.field4463.method3665(23290);
            class81.field1111[var3++] = (int) var11.field2333;
            super.field5576 -= var11.field4992;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class81.field1111, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class81.field1111, 0);
            var3 = 0;
        }
        while (!this.field4464.method3667((byte) -45)) {
            class393 var10 = (class393) this.field4464.method3665(23290);
            class81.field1111[var3++] = var10.field4992;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class81.field1111, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class81.field1111, 0);
            var3 = 0;
        }
        while (!this.field4465.method3667((byte) -45)) {
            class393 var9 = (class393) this.field4465.method3665(23290);
            class81.field1111[var3++] = (int) var9.field2333;
            super.field5568 -= var9.field4992;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class81.field1111, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class81.field1111, 0);
            boolean var4 = false;
        }
        while (!this.field4461.method3667((byte) -45)) {
            class393 var8 = (class393) this.field4461.method3665(23290);
            OpenGL.glDeleteLists((int) var8.field2333, var8.field4992);
        }
        while (!this.field4466.method3667((byte) -45)) {
            class168 var7 = this.field4466.method3665(23290);
            OpenGL.glDeleteProgramARB((int) var7.field2333);
        }
        while (!this.field4467.method3667((byte) -45)) {
            class168 var6 = this.field4467.method3665(23290);
            OpenGL.glDeleteObjectARB(var6.field2333);
        }
        while (!this.field4461.method3667((byte) -45)) {
            class393 var5 = (class393) this.field4461.method3665(23290);
            OpenGL.glDeleteLists((int) var5.field2333, var5.field4992);
        }
        if (this.method537() > 100663296 && ~(this.field4473 + 60000L) > ~class446.method2525(500)) {
            System.gc();
            this.field4473 = class446.method2525(500);
        }
        super.method448(var2);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z[IIBIII)Lwk;", line = 940)
    public final class145 method2010(boolean arg0, int[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field4390;
        if (arg3 != 0) {
            return null;
        } else if (!this.field4486 && (!class54.method400(5533, arg4) || !class54.method400(5533, arg5))) {
            if (!this.field4482) {
                class330 var8 = new class330(this, class269.field3396, class285.field3589, class565.method3253(106, arg4), class565.method3253(-122, arg5));
                var8.method812(0, arg2, arg6, 0, arg1, arg4, arg5, arg3 + -25782);
                return var8;
            } else {
                return new class101(this, arg4, arg5, arg1, arg6, arg2);
            }
        } else {
            return new class330(this, arg4, arg5, arg0, arg1, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "(II)V", line = 968)
    public final void method493(int arg0, int arg1) {
        ++field4391;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;", line = 981)
    public final Object method2011(int arg0, Canvas arg1) {
        ++field4450;
        if (arg0 != 0) {
            return null;
        } else {
            long var3 = this.field4404.prepareSurface(arg1);
            if (var3 == -1L) {
                throw new RuntimeException();
            } else {
                return new Long(var3);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lwha;IIBLet;)Lwk;", line = 997)
    public final class145 method2012(class285 arg0, int arg1, int arg2, byte arg3, class596 arg4) {
        if (arg3 != -105) {
            return null;
        } else {
            ++field4446;
            if (!this.field4486 && (!class54.method400(5533, arg2) || !class54.method400(5533, arg1))) {
                return this.field4482 ? new class101(this, arg4, arg0, arg2, arg1) : new class330(this, arg4, arg0, class565.method3253(arg3 + -2, arg2), class565.method3253(91, arg1));
            } else {
                return new class330(this, arg4, arg0, arg2, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIZLet;[B)Lwk;", line = 1024)
    public final class145 method2013(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class596 arg6, byte[] arg7) {
        ++field4384;
        if (arg2 != 0) {
            this.method1993((class596) null, (class285) null, false);
        }
        if (!this.field4486 && (!class54.method400(5533, arg3) || !class54.method400(5533, arg0))) {
            if (this.field4482) {
                return new class101(this, arg6, arg3, arg0, arg7, arg4, arg1);
            } else {
                class330 var9 = new class330(this, arg6, class285.field3589, class565.method3253(-97, arg3), class565.method3253(71, arg0));
                var9.method805(arg0, arg6, arg1, -8981, 0, arg7, arg3, 0, arg4);
                return var9;
            }
        } else {
            return new class330(this, arg6, arg3, arg0, arg5, arg7, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lmg;I)V", line = 1052)
    public final void method2014(class151 arg0, int arg1) {
        if (arg1 == 0) {
            if (class94.field1317 == arg0) {
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
            } else {
                int var3 = class679.method3826(34066, arg0);
                OpenGL.glTexGeni(8192, 9472, var3);
                OpenGL.glEnable(3168);
                OpenGL.glTexGeni(8193, 9472, var3);
                OpenGL.glEnable(3169);
                OpenGL.glTexGeni(8194, 9472, var3);
                OpenGL.glEnable(3170);
            }
            ++field4394;
        }
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(B)V", line = 1082)
    public final void method2015(byte arg0) {
        ++field4449;
        OpenGL.glScissor(super.field5660 + super.field5625, super.field5623 + super.field5494 + -super.field5628, -super.field5625 + super.field5674, super.field5628 - super.field5612);
        int var2 = 45 / ((-14 - arg0) / 62);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V", line = 1092)
    public final synchronized void method2016(int arg0, int arg1, int arg2) {
        int var4 = 2 / ((arg1 - 76) / 37);
        ++field4379;
        class393 var5 = new class393(arg2);
        var5.field2333 = (long) arg0;
        this.field4462.method3671(var5, false);
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V", line = 1107)
    public final void method2017(byte arg0) {
        this.method2400(0);
        ++field4385;
        int var2;
        for (var2 = 0; ~var2 > ~super.field5622; ++var2) {
            class123 var3 = super.field5655[var2];
            int var4 = var3.method934((byte) -110);
            int var5 = var2 + 16386;
            float var6 = var3.method939(-11214) / 255.0F;
            class586.field8192[0] = (float) var3.method932(-16562);
            class586.field8192[1] = (float) var3.method937(arg0 + 49);
            class586.field8192[2] = (float) var3.method938(arg0 + -36);
            class586.field8192[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class586.field8192, 0);
            class586.field8192[3] = 1.0F;
            class586.field8192[0] = (float) (class702.method3949(var4, 16774741) >> 16) * var6;
            class586.field8192[1] = (float) class702.method3949(255, var4 >> 8) * var6;
            class586.field8192[2] = var6 * (float) class702.method3949(var4, 255);
            OpenGL.glLightfv(var5, 4609, class586.field8192, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method935(arg0 ^ 36) * var3.method935(0)));
            OpenGL.glEnable(var5);
        }
        while (var2 < super.field5676) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method2017(arg0);
    }

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "()V", line = 1151)
    public final void method469() {
        OpenGL.glFinish();
        ++field4398;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(JB)V", line = 1159)
    public final synchronized void method2018(long arg0, byte arg1) {
        ++field4408;
        class168 var4 = new class168();
        var4.field2333 = arg0;
        this.field4467.method3671(var4, false);
        if (arg1 >= -71) {
            this.method2030(-21, -10, (class81) null, (class497) null, true, 36, -40);
        }
    }

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "(B)F", line = 1173)
    public final float method2019(byte arg0) {
        if (arg0 >= -106) {
            return -0.95609313F;
        } else {
            ++field4421;
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!tk", name = "na", descriptor = "(IIII)[I", line = 1184)
    public final int[] method465(int arg0, int arg1, int arg2, int arg3) {
        ++field4382;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + super.field5494 - arg1 + -1, arg2, 1, 32993, this.field4487, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V", line = 1204)
    public final void method2020(Object arg0, Canvas arg1, boolean arg2) {
        ++field4442;
        if (!arg2) {
            Long var4 = (Long) arg0;
            this.field4404.releaseSurface(arg1, var4);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V", line = 1222)
    public final synchronized void method2021(int arg0, int arg1, int arg2) {
        ++field4425;
        if (arg0 == 9287) {
            class393 var4 = new class393(arg2);
            var4.field2333 = (long) arg1;
            this.field4463.method3671(var4, false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "()V", line = 1238)
    public final void method479() {
        ++field4410;
        if (super.field5445 > 0 || ~super.field5494 < -1) {
            int var1 = super.field5625;
            int var2 = super.field5674;
            int var3 = super.field5612;
            int var4 = super.field5628;
            this.method446();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2441((byte) 75);
            this.method2367(false, -32);
            this.method2438(true, false);
            this.method2373(14, false);
            this.method2385(105, false);
            this.method2396(22357, (class572) null);
            this.method2410(false, false, (byte) 87, -2);
            this.method2379(1, -15829);
            this.method2440(0, (byte) -48);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field5445, super.field5494, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method534(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "(I)V", line = 1280)
    public final void method2022(int arg0) {
        if (arg0 != 4796) {
            this.method2026(36);
        }
        OpenGL.glViewport(super.field5660, super.field5623, super.field5445, super.field5494);
        ++field4378;
    }

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "(B)V", line = 1291)
    private final void method2023(byte arg0) {
        int var2 = -37 % ((arg0 - -39) / 46);
        if (this.field4468) {
            OpenGL.glPopMatrix();
        }
        ++field4371;
        if (!super.field5601.method1795(-1)) {
            if (!super.field5569) {
                OpenGL.glLoadMatrixf(super.field5560.method2740(true, class28.field507), 0);
                this.field4468 = false;
            } else {
                OpenGL.glLoadIdentity();
                this.field4468 = false;
            }
        } else {
            if (!this.field4474) {
                OpenGL.glLoadMatrixf(super.field5581.method2740(true, class28.field507), 0);
                this.field4474 = true;
                this.method2002(1);
                this.method2017((byte) 36);
            }
            if (super.field5569) {
                this.field4468 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field5560.method2740(true, class28.field507), 0);
                this.field4468 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V", line = 1338)
    public final void method472(int arg0, int arg1, int arg2, int arg3) {
        ++field4402;
    }

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "(B)V", line = 1345)
    public final void method2024(byte arg0) {
        ++field4396;
        class586.field8192[3] = 1.0F;
        class586.field8192[2] = super.field5610 * super.field5600;
        class586.field8192[0] = super.field5620 * super.field5610;
        class586.field8192[1] = super.field5656 * super.field5610;
        OpenGL.glLightfv(16384, 4609, class586.field8192, 0);
        class586.field8192[0] = -super.field5669 * super.field5620;
        if (arg0 != 85) {
            method2005(103, (String) null);
        }
        class586.field8192[1] = -super.field5669 * super.field5656;
        class586.field8192[2] = -super.field5669 * super.field5600;
        class586.field8192[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class586.field8192, 0);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(II)Lhca;", line = 1367)
    public final class492 method523(int arg0, int arg1) {
        ++field4436;
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIF[F[FIIIIIIF)V", line = 1379)
    public static final void method2025(int arg0, int arg1, float arg2, float[] arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, float arg11) {
        int var12 = arg5 - arg8;
        if (arg0 >= 53) {
            int var13 = arg9 - arg7;
            ++field4413;
            int var14 = arg6 - arg1;
            float var15 = arg3[2] * (float) var13 + arg3[1] * (float) var14 + arg3[0] * (float) var12;
            float var16 = arg3[5] * (float) var13 + arg3[4] * (float) var14 + arg3[3] * (float) var12;
            float var17 = arg3[8] * (float) var13 + arg3[7] * (float) var14 + arg3[6] * (float) var12;
            float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
            if (arg2 != 1.0F) {
                var18 = arg2 * var18;
            }
            float var19 = var16 + 0.5F + arg11;
            if (arg10 == 1) {
                float var20 = var18;
                var18 = -var19;
                var19 = var20;
            } else if (arg10 != 2) {
                if (~arg10 == -4) {
                    float var21 = var18;
                    var18 = var19;
                    var19 = -var21;
                }
            } else {
                var19 = -var19;
                var18 = -var18;
            }
            arg4[0] = var18;
            arg4[1] = var19;
        }
    }

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "(I)V", line = 1432)
    public final void method2026(int arg0) {
        ++field4422;
        int var2 = this.field4485[super.field5653];
        if (~var2 != -1) {
            this.field4485[super.field5653] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
        int var3 = 27 / ((arg0 - 44) / 33);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1450)
    public final void method432(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class230 {
        ++field4438;
        this.method497(arg2, arg3);
    }

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "(B)V", line = 1460)
    public final void method2027(byte arg0) {
        ++field4453;
        if (super.field5627) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
        int var2 = 15 % ((74 - arg0) / 33);
    }

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "(I)V", line = 1474)
    public final void method2028(int arg0) {
        ++field4405;
        for (int var2 = super.field5586 + -1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        int var3 = 102 / ((arg0 - -74) / 39);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var5 = 0; ~var5 > -9; ++var5) {
            int var6 = var5 + 16384;
            OpenGL.glLightfv(var6, 4608, var4, 0);
            OpenGL.glLightf(var6, 4615, 0.0F);
            OpenGL.glLightf(var6, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field4404.setSwapInterval(0);
        super.method2028(-127);
    }

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "(I)V", line = 1534)
    public final void method2029(int arg0) {
        ++field4431;
        if (arg0 > 105) {
            OpenGL.glTexEnvi(8960, 34161, class48.method364(super.field5649[super.field5653], (byte) 26));
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILjv;Liaa;ZII)V", line = 1545)
    public final void method2030(int arg0, int arg1, class81 arg2, class497 arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            field4454 = 60;
        }
        ++field4407;
        byte var8;
        int var9;
        if (class551.field7702 != arg2) {
            if (class232.field3051 == arg2) {
                var8 = 3;
                var9 = arg5 - -1;
            } else if (class662.field9281 == arg2) {
                var8 = 4;
                var9 = arg5 * 3;
            } else if (class426.field5714 == arg2) {
                var9 = arg5 - -2;
                var8 = 6;
            } else if (class532.field7387 == arg2) {
                var9 = arg5 + 2;
                var8 = 5;
            } else {
                var9 = arg5;
                var8 = 0;
            }
        } else {
            var9 = arg5 * 2;
            var8 = 1;
        }
        class285 var10 = arg3.method1370((byte) 97);
        class343 var11 = (class343) arg3;
        var11.method1005((byte) 83);
        OpenGL.glDrawElements(var8, var9, class93.method753(-45, var10), var11.method1011(-127) - -((long) (var10.field3586 * arg6)));
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "()V", line = 1602)
    public final void method466() {
        ++field4437;
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(Z)V", line = 1611)
    public final void method2031(boolean arg0) {
        class586.field8192[0] = (float) class702.method3949(super.field5679, 16711680) / 1.671168E7F;
        if (arg0) {
            this.field4477 = null;
        }
        class586.field8192[2] = (float) class702.method3949(super.field5679, 255) / 255.0F;
        class586.field8192[1] = (float) class702.method3949(65280, super.field5679) / 65280.0F;
        class586.field8192[3] = (float) (super.field5679 >>> 24) / 255.0F;
        ++field4429;
        OpenGL.glTexEnvfv(8960, 8705, class586.field8192, 0);
    }

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "(I)V", line = 1628)
    public final void method2032(int arg0) {
        ++field4403;
        if (arg0 <= 63) {
            this.method469();
        }
        if (!super.field5657) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
    }

    @OriginalMember(owner = "client!tk", name = "ya", descriptor = "()V", line = 1650)
    public final void method512() {
        ++field4374;
        this.method2385(117, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILri;)V", line = 1659)
    public final void method2033(int arg0, class114 arg1) {
        ++field4392;
        class655[] var3 = ((class383) arg1).field4859;
        int var4 = 0;
        if (arg0 != 17069) {
            this.field4472 = true;
        }
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        for (int var8 = 0; ~var3.length < ~var8; ++var8) {
            class655 var11 = var3[var8];
            class66 var12 = this.field4469[var8];
            int var13 = 0;
            int var14 = var12.method613(15629);
            long var15 = var12.method1011(arg0 + -17196);
            var12.method1005((byte) 114);
            for (int var17 = 0; ~var17 > ~var11.method3679((byte) -18); ++var17) {
                class307 var18 = var11.method3680(81, var17);
                if (class307.field4043 == var18) {
                    var7 = true;
                    OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                } else if (class307.field4048 != var18) {
                    if (class307.field4049 != var18) {
                        if (class307.field4050 == var18) {
                            OpenGL.glClientActiveTexture(33984 + var4++);
                            OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                        } else if (class307.field4051 == var18) {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                        } else if (class307.field4052 != var18) {
                            if (class307.field4053 == var18) {
                                OpenGL.glClientActiveTexture(33984 - -(var4++));
                                OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                            }
                        } else {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                        }
                    } else {
                        OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                        var5 = true;
                    }
                } else {
                    OpenGL.glNormalPointer(5126, var14, var15 - -((long) var13));
                    var6 = true;
                }
                var13 += var18.field4046;
            }
        }
        if (!this.field4471 != !var7) {
            if (var7) {
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            this.field4471 = var7;
        }
        if (!var6 != !this.field4470) {
            if (!var6) {
                OpenGL.glDisableClientState(32885);
            } else {
                OpenGL.glEnableClientState(32885);
            }
            this.field4470 = var6;
        }
        if (this.field4472 != var5) {
            if (var5) {
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            this.field4472 = var5;
        }
        if (~var4 >= ~this.field4476) {
            if (~this.field4476 < ~var4) {
                for (int var9 = var4; ~var9 > ~this.field4476; ++var9) {
                    OpenGL.glClientActiveTexture(var9 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field4476 = var4;
                return;
            }
        } else {
            for (int var10 = this.field4476; ~var4 < ~var10; ++var10) {
                OpenGL.glClientActiveTexture(33984 - -var10);
                OpenGL.glEnableClientState(32888);
            }
            this.field4476 = var4;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZI[[I)Lnn;", line = 1827)
    public final class418 method2034(int arg0, boolean arg1, int arg2, int[][] arg3) {
        if (arg2 != -9866) {
            this.field4468 = false;
        }
        ++field4456;
        return new class234(this, arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "(I)V", line = 1839)
    public final void method2035(int arg0) {
        ++field4444;
        OpenGL.glTexEnvi(8960, 34162, class48.method364(super.field5654[super.field5653], (byte) -114));
        if (arg0 != 7003) {
            this.method2020((Object) null, (Canvas) null, true);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZZLbp;I)V", line = 1850)
    public final void method2036(byte arg0, boolean arg1, boolean arg2, class389 arg3, int arg4) {
        int var6 = 111 % ((arg0 - 45) / 59);
        ++field4387;
        OpenGL.glTexEnvi(8960, arg4 + 34176, class123.method940((byte) 115, arg3));
        if (!arg2) {
            OpenGL.glTexEnvi(8960, 34192 - -arg4, !arg1 ? 768 : 769);
        } else {
            OpenGL.glTexEnvi(8960, arg4 + 34192, !arg1 ? 770 : 771);
        }
    }

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "(B)V", line = 1868)
    public final void method2037(byte arg0) {
        OpenGL.glMatrixMode(5889);
        ++field4401;
        int var2 = -109 % ((arg0 - -23) / 62);
        OpenGL.glLoadMatrixf(super.field5609, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILet;ZI[FIZ)Lwk;", line = 1880)
    public final class145 method2038(int arg0, int arg1, class596 arg2, boolean arg3, int arg4, float[] arg5, int arg6, boolean arg7) {
        ++field4395;
        if (!arg7) {
            return null;
        } else if (!this.field4486 && (!class54.method400(5533, arg0) || !class54.method400(5533, arg1))) {
            if (this.field4482) {
                return new class101(this, arg2, arg0, arg1, arg5, arg6, arg4);
            } else {
                class330 var9 = new class330(this, arg2, class285.field3593, class565.method3253(65, arg0), class565.method3253(-110, arg1));
                var9.method1915(0, arg5, arg6, arg2, (byte) -20, arg0, 0, arg4, arg1);
                return var9;
            }
        } else {
            return new class330(this, arg2, arg0, arg1, arg3, arg5, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "(I)V", line = 1914)
    public final void method2039(int arg0) {
        if (arg0 != -6109) {
            this.field4461 = null;
        }
        if (super.field5616 && !super.field5638) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field4380;
    }

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "(B)V", line = 1935)
    public final void method2040(byte arg0) {
        ++field4419;
        if (arg0 == -7) {
            if (super.field5675 && super.field5588 && super.field5599 >= 0) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIID)V", line = 1955)
    public final void method524(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field4434;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILia;B)V", line = 1962)
    public final void method2041(int arg0, class591 arg1, byte arg2) {
        this.field4469[arg0] = (class66) arg1;
        if (arg2 == 73) {
            ++field4427;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)Lia;", line = 1977)
    public final class591 method2042(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method1993((class596) null, (class285) null, false);
        }
        ++field4451;
        return new class66(this, arg0);
    }
}
