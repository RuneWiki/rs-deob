import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class205 extends class332 {

    @OriginalMember(owner = "client!bea", name = "Ih", descriptor = "Lor;")
    private class594 field3402 = new class594();

    @OriginalMember(owner = "client!bea", name = "Vh", descriptor = "Lor;")
    private class594 field3415 = new class594();

    @OriginalMember(owner = "client!bea", name = "ai", descriptor = "Lor;")
    private class594 field3420 = new class594();

    @OriginalMember(owner = "client!bea", name = "bi", descriptor = "Lor;")
    private class594 field3421 = new class594();

    @OriginalMember(owner = "client!bea", name = "ci", descriptor = "Lor;")
    private class594 field3422 = new class594();

    @OriginalMember(owner = "client!bea", name = "di", descriptor = "Lor;")
    private class594 field3423 = new class594();

    @OriginalMember(owner = "client!bea", name = "ei", descriptor = "Lor;")
    private class594 field3424 = new class594();

    @OriginalMember(owner = "client!bea", name = "ki", descriptor = "[Loba;")
    private class240[] field3430 = new class240[16];

    @OriginalMember(owner = "client!bea", name = "hi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field3427 = new MapBuffer();

    @OriginalMember(owner = "client!bea", name = "oi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field3434 = new MapBuffer();

    @OriginalMember(owner = "client!bea", name = "yi", descriptor = "I")
    private int field3444 = 0;

    @OriginalMember(owner = "client!bea", name = "nh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field3381;

    @OriginalMember(owner = "client!bea", name = "xi", descriptor = "Ljava/lang/String;")
    private String field3443;

    @OriginalMember(owner = "client!bea", name = "ti", descriptor = "Ljava/lang/String;")
    private String field3439;

    @OriginalMember(owner = "client!bea", name = "vi", descriptor = "I")
    private int field3441;

    @OriginalMember(owner = "client!bea", name = "Ai", descriptor = "Z")
    public boolean field3446;

    @OriginalMember(owner = "client!bea", name = "pi", descriptor = "Z")
    private boolean field3435;

    @OriginalMember(owner = "client!bea", name = "ri", descriptor = "Z")
    private boolean field3437;

    @OriginalMember(owner = "client!bea", name = "qi", descriptor = "Z")
    public boolean field3436;

    @OriginalMember(owner = "client!bea", name = "zi", descriptor = "Z")
    public boolean field3445;

    @OriginalMember(owner = "client!bea", name = "ui", descriptor = "Z")
    public boolean field3440;

    @OriginalMember(owner = "client!bea", name = "wi", descriptor = "[I")
    public int[] field3442;

    @OriginalMember(owner = "client!bea", name = "si", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!bea", name = "Kg", descriptor = "I")
    public static int field3352 = -1;

    @OriginalMember(owner = "client!bea", name = "Jh", descriptor = "I")
    public static int field3403 = -2;

    @OriginalMember(owner = "client!bea", name = "ug", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!bea", name = "vg", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!bea", name = "wg", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!bea", name = "xg", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!bea", name = "yg", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!bea", name = "zg", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!bea", name = "Ag", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!bea", name = "Bg", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!bea", name = "Cg", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!bea", name = "Dg", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!bea", name = "Eg", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!bea", name = "Fg", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!bea", name = "Gg", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!bea", name = "Hg", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!bea", name = "Ig", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!bea", name = "Jg", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!bea", name = "Lg", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!bea", name = "Mg", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!bea", name = "Ng", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!bea", name = "Og", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!bea", name = "Pg", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!bea", name = "Qg", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!bea", name = "Rg", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!bea", name = "Sg", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!bea", name = "Tg", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!bea", name = "Ug", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!bea", name = "Vg", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!bea", name = "Wg", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!bea", name = "Xg", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!bea", name = "Yg", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!bea", name = "Zg", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!bea", name = "ah", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!bea", name = "bh", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!bea", name = "ch", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!bea", name = "dh", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!bea", name = "eh", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!bea", name = "fh", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!bea", name = "gh", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!bea", name = "hh", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!bea", name = "ih", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!bea", name = "jh", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!bea", name = "kh", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!bea", name = "lh", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!bea", name = "mh", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!bea", name = "oh", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!bea", name = "ph", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!bea", name = "qh", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!bea", name = "rh", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!bea", name = "sh", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!bea", name = "th", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!bea", name = "uh", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!bea", name = "vh", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!bea", name = "wh", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!bea", name = "xh", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!bea", name = "yh", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!bea", name = "zh", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!bea", name = "Ah", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!bea", name = "Bh", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!bea", name = "Ch", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!bea", name = "Dh", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!bea", name = "Eh", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!bea", name = "Fh", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!bea", name = "Gh", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!bea", name = "Hh", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!bea", name = "Kh", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!bea", name = "Lh", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!bea", name = "Mh", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!bea", name = "Nh", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!bea", name = "Oh", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!bea", name = "Ph", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!bea", name = "Qh", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!bea", name = "Rh", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!bea", name = "Sh", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!bea", name = "Th", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!bea", name = "Uh", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!bea", name = "Wh", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!bea", name = "Xh", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!bea", name = "Yh", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!bea", name = "Zh", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!bea", name = "gi", descriptor = "I")
    private int field3426;

    @OriginalMember(owner = "client!bea", name = "ni", descriptor = "J")
    private long field3433;

    @OriginalMember(owner = "client!bea", name = "fi", descriptor = "Z")
    private boolean field3425;

    @OriginalMember(owner = "client!bea", name = "ii", descriptor = "Z")
    private boolean field3428;

    @OriginalMember(owner = "client!bea", name = "ji", descriptor = "Z")
    private boolean field3429;

    @OriginalMember(owner = "client!bea", name = "li", descriptor = "Z")
    private boolean field3431;

    @OriginalMember(owner = "client!bea", name = "mi", descriptor = "Z")
    private boolean field3432;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "()V", line = 5)
    public final void method135() {
        ++field3359;
    }

    @OriginalMember(owner = "client!bea", name = "N", descriptor = "(I)V", line = 13)
    public final void method159(int arg0) {
        ++field3391;
        int var2 = this.field3442[super.field5412];
        if (var2 != 0) {
            this.field3442[super.field5412] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
        if (arg0 >= -47) {
            this.method168();
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ)V", line = 34)
    public final void method106(int arg0, boolean arg1) {
        if (arg0 != 8077) {
            this.method114(false);
        }
        if (!arg1) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
        ++field3348;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)V", line = 49)
    public final synchronized void method1578(int arg0, int arg1, int arg2) {
        ++field3362;
        class160 var4 = new class160(arg0);
        var4.field844 = (long) arg2;
        this.field3415.method3463((byte) -87, var4);
        if (arg1 != 8) {
            this.method117((class466) null, false, -12, 95);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII)V", line = 63)
    public final void method110(int arg0, int arg1, int arg2, int arg3) {
        ++field3388;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLqs;)V", line = 78)
    public final void method163(boolean arg0, class560 arg1) {
        ++field3340;
        if (!arg0) {
            this.field3431 = false;
        }
        if (class328.field5090 == arg1) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class583.method3417(9216, arg1);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BJ)V", line = 106)
    public final synchronized void method1579(byte arg0, long arg1) {
        ++field3376;
        class66 var4 = new class66();
        var4.field844 = arg1;
        this.field3424.method3463((byte) -87, var4);
        if (arg0 > -3) {
            this.field3431 = false;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILmg;ILos;)Lmca;", line = 121)
    public final class29 method125(int arg0, int arg1, class134 arg2, int arg3, class408 arg4) {
        ++field3378;
        if (arg3 < 102) {
            this.method123((byte) 35);
        }
        if (!this.field3437 && (!class416.method2649(arg1, true) || !class416.method2649(arg0, true))) {
            return !this.field3435 ? new class22(this, arg4, arg2, class413.method2636(arg1, 127), class413.method2636(arg0, 127)) : new class619(this, arg4, arg2, arg1, arg0);
        } else {
            return new class22(this, arg4, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lko;ZII)V", line = 149)
    public final void method117(class466 arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            OpenGL.glTexEnvi(8960, arg2 + 34184, class263.method1869((byte) 121, arg0));
            ++field3401;
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg1 ? 771 : 770);
        }
    }

    @OriginalMember(owner = "client!bea", name = "U", descriptor = "(I)V", line = 164)
    public final void method156(int arg0) {
        if (super.field5398 && !super.field5334) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field3350;
        int var2 = 86 / ((arg0 - -33) / 60);
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLfa;Lri;I)V", line = 179)
    public class205(OpenGL arg0, Canvas arg1, long arg2, class214 arg3, class97 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field3381 = arg0;
            this.field3381.method3388();
            this.field3443 = OpenGL.glGetString(7936).toLowerCase();
            this.field3439 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field3443.indexOf("microsoft") == 0 && ~this.field3443.indexOf("brian paul") == 0 && this.field3443.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class698.method3944(' ', var8.replace('.', ' '), -4);
                if (~var9.length <= -3) {
                    try {
                        int var10 = class566.method3354((byte) -91, var9[0]);
                        int var11 = class566.method3354((byte) -58, var9[1]);
                        this.field3441 = var10 * 10 - -var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field3441 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field3381.method3390("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field3381.method3390("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field5359 = var12[0];
                        if (~super.field5359 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field5387 = 8;
                            this.field3446 = this.field3381.method3390("GL_ARB_vertex_buffer_object");
                            super.field5410 = this.field3381.method3390("GL_ARB_multisample");
                            this.field3435 = this.field3381.method3390("GL_ARB_texture_rectangle");
                            super.field5409 = this.field3381.method3390("GL_ARB_texture_cube_map");
                            this.field3437 = this.field3381.method3390("GL_ARB_texture_non_power_of_two");
                            super.field5416 = this.field3381.method3390("GL_EXT_texture3D");
                            this.field3436 = this.field3381.method3390("GL_ARB_vertex_shader");
                            this.field3445 = this.field3381.method3390("GL_ARB_vertex_program");
                            this.field3440 = this.field3381.method3390("GL_ARB_fragment_shader");
                            this.field3381.method3390("GL_ARB_fragment_program");
                            this.field3442 = new int[super.field5359];
                            this.field3438 = Stream.method3620() ? 33639 : 5121;
                            if (this.field3439.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class698.method3944(' ', this.field3439.replace('/', ' '), -4);
                                for (int var17 = 0; ~var17 > ~var16.length; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (~var18.charAt(0) == -121 && ~var18.length() <= -4 && class357.method2400(10, var18.substring(1, 3))) {
                                                var18 = var18.substring(1);
                                                var15 = true;
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var14 = true;
                                                    var18 = var18.substring(2);
                                                }
                                                if (var18.length() >= 4 && class357.method2400(10, var18.substring(0, 4))) {
                                                    var13 = class566.method3354((byte) 104, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && ~var13 >= -8000) {
                                        this.field3446 = false;
                                    }
                                    if (~var13 <= -7001 && ~var13 >= -9251) {
                                        super.field5416 = false;
                                    }
                                }
                                this.field3435 &= this.field3381.method3390("GL_ARB_half_float_pixel");
                            }
                            this.field3443.indexOf("intel");
                            if (this.field3446) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
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
            this.method132();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B[Lej;)Lqf;", line = 336)
    public final class633 method105(byte arg0, class108[] arg1) {
        ++field3369;
        if (arg0 <= 47) {
            this.method1583(true, 124, 64);
        }
        return new class574(arg1);
    }

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "(Z)V", line = 351)
    public final void method130(boolean arg0) {
        class583.field8287[2] = (float) class453.method2846(super.field5337, 255) / 255.0F;
        class583.field8287[3] = (float) (super.field5337 >>> 24) / 255.0F;
        ++field3398;
        if (!arg0) {
            this.field3441 = 27;
        }
        class583.field8287[0] = (float) class453.method2846(16711680, super.field5337) / 1.671168E7F;
        class583.field8287[1] = (float) class453.method2846(super.field5337, 65280) / 65280.0F;
        OpenGL.glTexEnvfv(8960, 8705, class583.field8287, 0);
    }

    @OriginalMember(owner = "client!bea", name = "H", descriptor = "(I)V", line = 368)
    public final void method183(int arg0) {
        if (arg0 == 7) {
            OpenGL.glTexEnvi(8960, 34162, class540.method3277(super.field5339[super.field5412], 25865));
            ++field3418;
        }
    }

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "()V", line = 382)
    public final void method143() {
        ++field3351;
        if (~super.field5305 < -1 || ~super.field5195 < -1) {
            int var1 = super.field5330;
            int var2 = super.field5343;
            int var3 = super.field5349;
            int var4 = super.field5341;
            this.method281();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2240((byte) 122);
            this.method2288((byte) 37, false);
            this.method2238(false, -48);
            this.method2295(false, 128);
            this.method2224((byte) -18, false);
            this.method2271((class152) null, 5180);
            this.method2242(false, -14500, -2, false);
            this.method2280(2, 1);
            this.method2259(-54, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field5305, super.field5195, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method352(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 424)
    public final void method133(byte arg0, Canvas arg1, Object arg2) {
        ++field3363;
        Long var4 = (Long) arg2;
        this.field3381.releaseSurface(arg1, var4);
        if (arg0 < 111) {
            this.field3434 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lpw;ILbo;IIII)V", line = 442)
    public final void method120(class656 arg0, int arg1, class679 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3387;
        if (arg4 <= 116) {
            this.field3381 = null;
        }
        int var8;
        byte var9;
        if (class193.field3198 != arg0) {
            if (class286.field4548 == arg0) {
                var8 = arg5 + 1;
                var9 = 3;
            } else if (class646.field9077 == arg0) {
                var8 = arg5 * 3;
                var9 = 4;
            } else if (class654.field9145 != arg0) {
                if (class321.field5026 == arg0) {
                    var9 = 5;
                    var8 = arg5 + 2;
                } else {
                    var8 = arg5;
                    var9 = 0;
                }
            } else {
                var9 = 6;
                var8 = arg5 + 2;
            }
        } else {
            var9 = 1;
            var8 = arg5 * 2;
        }
        class134 var10 = arg2.method427(31337);
        class27 var11 = (class27) arg2;
        var11.method2154(0);
        OpenGL.glDrawElements(var9, var8, class436.method2769(var10, -73), var11.method2159((byte) -127) + (long) (var10.field2196 * arg3));
    }

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "(B)V", line = 501)
    public final void method128(byte arg0) {
        ++field3371;
        if (class494.field7216 != super.field5364) {
            if (class694.field9728 != super.field5364) {
                if (class252.field4024 == super.field5364) {
                    OpenGL.glBlendFunc(774, 1);
                }
            } else {
                OpenGL.glBlendFunc(1, 1);
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
        if (arg0 != 36) {
            this.field3434 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILqf;)V", line = 522)
    public final void method137(int arg0, class633 arg1) {
        ++field3344;
        class108[] var3 = ((class574) arg1).field8184;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        int var8 = 0;
        if (arg0 > -50) {
            this.field3436 = false;
        }
        while (var3.length > var8) {
            class108 var11 = var3[var8];
            class240 var12 = this.field3430[var8];
            int var13 = 0;
            int var14 = var12.method1727(-29095);
            long var15 = var12.method2159((byte) -55);
            var12.method2154(0);
            for (int var17 = 0; ~var17 > ~var11.method1019((byte) 67); ++var17) {
                class369 var18 = var11.method1022(-86, var17);
                if (class369.field5774 != var18) {
                    if (class369.field5775 == var18) {
                        var6 = true;
                        OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                    } else if (class369.field5776 != var18) {
                        if (class369.field5777 == var18) {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                        } else if (class369.field5778 != var18) {
                            if (class369.field5779 == var18) {
                                OpenGL.glClientActiveTexture(33984 + var4++);
                                OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                            } else if (class369.field5780 == var18) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(4, 5126, var14, var15 - -((long) var13));
                            }
                        } else {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(2, 5126, var14, var15 - -((long) var13));
                        }
                    } else {
                        var5 = true;
                        OpenGL.glColorPointer(4, 5121, var14, var15 - -((long) var13));
                    }
                } else {
                    OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                    var7 = true;
                }
                var13 += var18.field5768;
            }
            ++var8;
        }
        if (!this.field3432 == var7) {
            if (!var7) {
                OpenGL.glDisableClientState(32884);
            } else {
                OpenGL.glEnableClientState(32884);
            }
            this.field3432 = var7;
        }
        if (this.field3429 == !var6) {
            if (var6) {
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            this.field3429 = var6;
        }
        if (this.field3425 == !var5) {
            if (!var5) {
                OpenGL.glDisableClientState(32886);
            } else {
                OpenGL.glEnableClientState(32886);
            }
            this.field3425 = var5;
        }
        if (var4 > this.field3426) {
            for (int var9 = this.field3426; var4 > var9; ++var9) {
                OpenGL.glClientActiveTexture(var9 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field3426 = var4;
        } else if (var4 < this.field3426) {
            for (int var10 = var4; ~this.field3426 < ~var10; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glDisableClientState(32888);
            }
            this.field3426 = var4;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Log;II)V", line = 684)
    public final void method178(class601 arg0, int arg1, int arg2) {
        ++field3414;
        this.field3430[arg1] = (class240) arg0;
        int var4 = -113 % ((-2 - arg2) / 52);
    }

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "(Z)F", line = 694)
    public final float method162(boolean arg0) {
        if (!arg0) {
            return 1.4631968F;
        } else {
            ++field3383;
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lko;IZZB)V", line = 710)
    public final void method185(class466 arg0, int arg1, boolean arg2, boolean arg3, byte arg4) {
        OpenGL.glTexEnvi(8960, 34176 - -arg1, class263.method1869((byte) 1, arg0));
        ++field3396;
        if (arg4 == 106) {
            if (arg3) {
                OpenGL.glTexEnvi(8960, arg1 + 34192, !arg2 ? 770 : 771);
            } else {
                OpenGL.glTexEnvi(8960, arg1 + 34192, !arg2 ? 768 : 769);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 727)
    public final synchronized void method155(int arg0) {
        ++field3353;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field3415.method3464(0)) {
            class160 var12 = (class160) this.field3415.method3471(0);
            class215.field3544[var3++] = (int) var12.field844;
            super.field5318 -= var12.field2728;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class215.field3544, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class215.field3544, 0);
            var3 = 0;
        }
        while (!this.field3420.method3464(0)) {
            class160 var11 = (class160) this.field3420.method3471(0);
            class215.field3544[var3++] = (int) var11.field844;
            super.field5312 -= var11.field2728;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class215.field3544, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class215.field3544, 0);
            var3 = 0;
        }
        while (!this.field3421.method3464(0)) {
            class160 var10 = (class160) this.field3421.method3471(0);
            class215.field3544[var3++] = var10.field2728;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class215.field3544, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class215.field3544, 0);
            var3 = 0;
        }
        while (!this.field3422.method3464(0)) {
            class160 var9 = (class160) this.field3422.method3471(0);
            class215.field3544[var3++] = (int) var9.field844;
            super.field5315 -= var9.field2728;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class215.field3544, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class215.field3544, 0);
            boolean var4 = false;
        }
        while (!this.field3402.method3464(0)) {
            class160 var8 = (class160) this.field3402.method3471(0);
            OpenGL.glDeleteLists((int) var8.field844, var8.field2728);
        }
        while (!this.field3423.method3464(0)) {
            class66 var7 = this.field3423.method3471(0);
            OpenGL.glDeleteProgramARB((int) var7.field844);
        }
        while (!this.field3424.method3464(0)) {
            class66 var6 = this.field3424.method3471(0);
            OpenGL.glDeleteObjectARB(var6.field844);
        }
        while (!this.field3402.method3464(0)) {
            class160 var5 = (class160) this.field3402.method3471(0);
            OpenGL.glDeleteLists((int) var5.field844, var5.field2728);
        }
        if (~this.method338() < -100663297 && ~class112.method1033(-11752) < ~(this.field3433 + 60000L)) {
            System.gc();
            this.field3433 = class112.method1033(-11752);
        }
        super.method155(var2);
    }

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "()Z", line = 890)
    public final boolean method168() {
        ++field3345;
        return false;
    }

    @OriginalMember(owner = "client!bea", name = "S", descriptor = "(I)V", line = 898)
    public final void method140(int arg0) {
        if (arg0 >= 13) {
            OpenGL.glScissor(super.field5415 + super.field5330, -super.field5341 + super.field5345 + super.field5195, super.field5343 - super.field5330, -super.field5349 + super.field5341);
            ++field3394;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(FFF)V", line = 909)
    public final void method144(float arg0, float arg1, float arg2) {
        ++field3338;
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(ZI)Lbo;", line = 918)
    public final class679 method113(boolean arg0, int arg1) {
        ++field3407;
        if (arg1 <= 124) {
            this.field3442 = null;
        }
        return new class27(this, class134.field2198, arg0);
    }

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "(I)V", line = 929)
    public final void method180(int arg0) {
        ++field3390;
        class583.field8287[0] = super.field5369 * super.field5326;
        class583.field8287[1] = super.field5383 * super.field5369;
        class583.field8287[3] = 1.0F;
        class583.field8287[2] = super.field5369 * super.field5351;
        if (arg0 <= 87) {
            this.method171(true, false, (int[][]) null, 20);
        }
        OpenGL.glLightfv(16384, 4609, class583.field8287, 0);
        class583.field8287[2] = -super.field5408 * super.field5351;
        class583.field8287[1] = -super.field5408 * super.field5383;
        class583.field8287[0] = -super.field5408 * super.field5326;
        class583.field8287[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class583.field8287, 0);
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)V", line = 951)
    public final void method114(boolean arg0) {
        ++field3408;
    }

    @OriginalMember(owner = "client!bea", name = "ab", descriptor = "(I)V", line = 958)
    public final void method175(int arg0) {
        ++field3382;
        if (arg0 != -13617) {
            this.method114(false);
        }
        if (super.field5447) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ldd;Ldd;FLdd;)Ldd;", line = 973)
    public final class654 method119(class654 arg0, class654 arg1, float arg2, class654 arg3) {
        ++field3379;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "(I)V", line = 981)
    public final void method169(int arg0) {
        for (int var2 = super.field5359 - 1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field3384;
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        if (arg0 > -13) {
            this.method133((byte) -111, (Canvas) null, (Object) null);
        }
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
        this.field3381.setSwapInterval(0);
        super.method169(-25);
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "()V", line = 1039)
    public final void method182() {
        ++field3336;
    }

    @OriginalMember(owner = "client!bea", name = "ya", descriptor = "()V", line = 1046)
    public final void method136() {
        this.method2224((byte) -18, true);
        ++field3377;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "(B)V", line = 1056)
    public final void method145(byte arg0) {
        if (!super.field5386) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        ++field3341;
        if (arg0 != -35) {
            this.method112(54);
        }
    }

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "(B)V", line = 1077)
    public final void method172(byte arg0) {
        int var2 = -31 / ((arg0 - -2) / 43);
        ++field3374;
    }

    @OriginalMember(owner = "client!bea", name = "cb", descriptor = "(I)V", line = 1088)
    private final void method1580(int arg0) {
        if (arg0 == -26259) {
            ++field3406;
            if (this.field3431) {
                OpenGL.glPopMatrix();
            }
            if (!super.field5379.method697((byte) -25)) {
                if (super.field5317) {
                    OpenGL.glLoadIdentity();
                    this.field3431 = false;
                } else {
                    OpenGL.glLoadMatrixf(super.field5316.method3022(class471.field6980, arg0 + 26266), 0);
                    this.field3431 = false;
                }
            } else {
                if (!this.field3428) {
                    OpenGL.glLoadMatrixf(super.field5322.method3022(class471.field6980, 7), 0);
                    this.field3428 = true;
                    this.method184(4);
                    this.method154(-119);
                }
                if (super.field5317) {
                    this.field3431 = false;
                } else {
                    OpenGL.glPushMatrix();
                    OpenGL.glMultMatrixf(super.field5316.method3022(class471.field6980, 7), 0);
                    this.field3431 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "(I)V", line = 1135)
    public final void method154(int arg0) {
        this.method2226(7554);
        ++field3392;
        int var2 = 0;
        if (arg0 > -71) {
            this.field3435 = true;
        }
        while (super.field5356 > var2) {
            class674 var3 = super.field5406[var2];
            int var4 = var3.method3854(-1);
            int var5 = 16386 - -var2;
            float var6 = var3.method3856((byte) -47) / 255.0F;
            class583.field8287[0] = (float) var3.method3857((byte) -35);
            class583.field8287[1] = (float) var3.method3851((byte) 32);
            class583.field8287[2] = (float) var3.method3859((byte) 117);
            class583.field8287[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class583.field8287, 0);
            class583.field8287[1] = (float) class453.method2846(var4 >> 8, 255) * var6;
            class583.field8287[3] = 1.0F;
            class583.field8287[0] = (float) class453.method2846(var4 >> 16, 255) * var6;
            class583.field8287[2] = (float) class453.method2846(var4, 255) * var6;
            OpenGL.glLightfv(var5, 4609, class583.field8287, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method3860((byte) -125) * var3.method3860((byte) -121)));
            OpenGL.glEnable(var5);
            ++var2;
        }
        while (~var2 > ~super.field5413) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        super.method154(-114);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZIILos;[BII)Lmca;", line = 1182)
    public final class29 method115(int arg0, boolean arg1, int arg2, int arg3, class408 arg4, byte[] arg5, int arg6, int arg7) {
        if (arg7 != 2) {
            return null;
        } else {
            ++field3405;
            if (!this.field3437 && (!class416.method2649(arg3, true) || !class416.method2649(arg0, true))) {
                if (this.field3435) {
                    return new class619(this, arg4, arg3, arg0, arg5, arg2, arg6);
                } else {
                    class22 var9 = new class22(this, arg4, class134.field2197, class413.method2636(arg3, 127), class413.method2636(arg0, arg7 + 125));
                    var9.method362(0, arg4, 0, 3348, arg5, arg3, arg0, arg2, arg6);
                    return var9;
                }
            } else {
                return new class22(this, arg4, arg3, arg0, arg1, arg5, arg2, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(B)V", line = 1210)
    public final void method102(byte arg0) {
        int var2 = 9 % ((41 - arg0) / 54);
        ++field3385;
        this.method1580(-26259);
    }

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "(Z)V", line = 1221)
    public final void method109(boolean arg0) {
        OpenGL.glViewport(super.field5415, super.field5345, super.field5305, super.field5195);
        ++field3399;
        if (arg0) {
            this.method173(1, -87);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILos;I[BII)Lqw;", line = 1232)
    public final class69 method118(int arg0, class408 arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        ++field3342;
        if (arg0 != -30146) {
            this.field3427 = null;
        }
        return new class5(this, arg1, arg2, arg5, arg4, arg3);
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(III)V", line = 1244)
    public static final void method1581(int arg0, int arg1, int arg2) {
        class252 var3 = class454.field6818[arg0][arg1][arg2];
        if (var3 != null) {
            class200.method1554(var3.field4025);
            if (var3.field4025 != null) {
                var3.field4025 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "(B)V", line = 1255)
    public final void method166(byte arg0) {
        ++field3373;
        int var2 = -94 % ((-9 - arg0) / 47);
        OpenGL.glDepthMask(super.field5394 && super.field5402);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V", line = 1268)
    public final void method150(Canvas arg0, byte arg1, Object arg2) {
        ++field3367;
        Long var4 = (Long) arg2;
        if (arg1 != -85) {
            this.field3437 = false;
        }
        if (!this.field3381.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(ZI)Log;", line = 1286)
    public final class601 method174(boolean arg0, int arg1) {
        ++field3417;
        return arg1 <= 58 ? null : new class240(this, arg0);
    }

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "(II)V", line = 1297)
    public final synchronized void method1582(int arg0, int arg1) {
        ++field3412;
        if (arg1 == 1) {
            class66 var3 = new class66();
            var3.field844 = (long) arg0;
            this.field3423.method3463((byte) -87, var3);
        }
    }

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "(I)V", line = 1316)
    public final void method153(int arg0) {
        OpenGL.glMatrixMode(5889);
        if (arg0 != 20021) {
            this.method111(56, 27, (byte) -10, (class656) null);
        }
        ++field3343;
        OpenGL.glLoadMatrixf(super.field5366, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "(B)V", line = 1329)
    public final void method123(byte arg0) {
        if (arg0 == 87) {
            ++field3404;
            if (super.field5392 && super.field5405 && super.field5340 >= 0) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "C", descriptor = "(I)V", line = 1344)
    public final void method126(int arg0) {
        if (super.field5328) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
        ++field3389;
        if (arg0 != 30688) {
            this.method1583(false, -23, 45);
        }
    }

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "(I)V", line = 1359)
    public final void method147(int arg0) {
        ++field3395;
        super.field5391 = (float) (-super.field5329 + super.field5397);
        super.field5380 = (float) (-super.field5340) + super.field5391;
        if (super.field5380 < (float) super.field5393) {
            super.field5380 = (float) super.field5393;
        }
        OpenGL.glFogf(2915, super.field5380);
        OpenGL.glFogf(2916, super.field5391);
        class583.field8287[0] = (float) class453.method2846(16711680, super.field5411) / 1.671168E7F;
        class583.field8287[2] = (float) class453.method2846(super.field5411, 255) / 255.0F;
        if (arg0 == -24255) {
            class583.field8287[1] = (float) class453.method2846(65280, super.field5411) / 65280.0F;
            OpenGL.glFogfv(2918, class583.field8287, 0);
        }
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "(Z)V", line = 1381)
    public final void method124(boolean arg0) {
        ++field3386;
        class583.field8287[2] = super.field5351 * super.field5344;
        if (arg0) {
            this.method112(-34);
        }
        class583.field8287[1] = super.field5383 * super.field5344;
        class583.field8287[0] = super.field5344 * super.field5326;
        class583.field8287[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class583.field8287, 0);
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(ZII)V", line = 1396)
    public final synchronized void method1583(boolean arg0, int arg1, int arg2) {
        ++field3357;
        if (!arg0) {
            class160 var4 = new class160(arg2);
            var4.field844 = (long) arg1;
            this.field3420.method3463((byte) -87, var4);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;", line = 1411)
    public final Object method167(int arg0, Canvas arg1) {
        ++field3370;
        long var3 = this.field3381.prepareSurface(arg1);
        if (arg0 < 101) {
            this.field3428 = true;
        }
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "(B)V", line = 1428)
    public final void method157(byte arg0) {
        ++field3361;
        if (!super.field5401) {
            OpenGL.glDisable(3042);
        } else {
            OpenGL.glEnable(3042);
        }
        if (arg0 > -105) {
            this.field3429 = true;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([IIZIIII)Lmca;", line = 1444)
    public final class29 method142(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3413;
        int var8 = -112 / ((72 - arg1) / 42);
        if (!this.field3437 && (!class416.method2649(arg6, true) || !class416.method2649(arg3, true))) {
            if (!this.field3435) {
                class22 var9 = new class22(this, class86.field1055, class134.field2197, class413.method2636(arg6, 127), class413.method2636(arg3, 127));
                var9.method372(13353, arg6, arg0, arg5, arg4, 0, arg3, 0);
                return var9;
            } else {
                return new class619(this, arg6, arg3, arg0, arg5, arg4);
            }
        } else {
            return new class22(this, arg6, arg3, arg2, arg0, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!bea", name = "P", descriptor = "(I)V", line = 1472)
    public final void method116(int arg0) {
        ++field3346;
        this.field3428 = false;
        this.method1580(-26259);
        if (arg0 >= -79) {
            this.field3425 = true;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I[FIIIILos;Z)Lmca;", line = 1486)
    public final class29 method129(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, class408 arg6, boolean arg7) {
        if (arg5 <= 94) {
            return null;
        } else {
            ++field3400;
            if (!this.field3437 && (!class416.method2649(arg0, true) || !class416.method2649(arg2, true))) {
                if (this.field3435) {
                    return new class619(this, arg6, arg0, arg2, arg1, arg3, arg4);
                } else {
                    class22 var9 = new class22(this, arg6, class134.field2201, class413.method2636(arg0, 127), class413.method2636(arg2, 127));
                    var9.method367((byte) -76, 0, arg6, arg3, arg1, 0, arg2, arg4, arg0);
                    return var9;
                }
            } else {
                return new class22(this, arg6, arg0, arg2, arg7, arg1, arg3, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "()V", line = 1515)
    public final void method132() {
        super.method132();
        ++field3355;
        if (this.field3381 != null) {
            this.field3381.method3389();
            this.field3381.release();
            this.field3381 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "(B)V", line = 1531)
    public final void method149(byte arg0) {
        if (arg0 != -19) {
            this.field3437 = false;
        }
        ++field3411;
        OpenGL.glActiveTexture(super.field5412 + 33984);
    }

    @OriginalMember(owner = "client!bea", name = "ja", descriptor = "(I)V", line = 1542)
    public final void method121(int arg0) {
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field3368;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lf;Z)V", line = 1553)
    public final void method158(class702 arg0, boolean arg1) {
        ++field3419;
    }

    @OriginalMember(owner = "client!bea", name = "bb", descriptor = "(I)V", line = 1561)
    public final void method177(int arg0) {
        ++field3347;
        if (arg0 == -29670) {
            if (super.field5331) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIBLpw;)V", line = 1582)
    public final void method111(int arg0, int arg1, byte arg2, class656 arg3) {
        ++field3337;
        if (arg2 != 13) {
            this.field3420 = null;
        }
        int var5;
        byte var6;
        if (class193.field3198 == arg3) {
            var5 = arg0 * 2;
            var6 = 1;
        } else if (class286.field4548 == arg3) {
            var6 = 3;
            var5 = arg0 + 1;
        } else if (class646.field9077 != arg3) {
            if (class654.field9145 != arg3) {
                if (class321.field5026 == arg3) {
                    var6 = 5;
                    var5 = arg0 - -2;
                } else {
                    var5 = arg0;
                    var6 = 0;
                }
            } else {
                var5 = arg0 - -2;
                var6 = 6;
            }
        } else {
            var5 = arg0 * 3;
            var6 = 4;
        }
        OpenGL.glDrawArrays(var6, arg1, var5);
    }

    @OriginalMember(owner = "client!bea", name = "G", descriptor = "(I)V", line = 1637)
    public final void method184(int arg0) {
        ++field3360;
        OpenGL.glLightfv(16384, 4611, super.field5423, 0);
        if (arg0 != 4) {
            this.method128((byte) 102);
        }
        OpenGL.glLightfv(16385, 4611, super.field5399, 0);
    }

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "(II)V", line = 1650)
    public final void method173(int arg0, int arg1) {
        ++field3365;
        if (arg0 != 16316) {
            this.field3426 = -115;
        }
    }

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "(I)V", line = 1660)
    public final void method112(int arg0) {
        if (arg0 != 0) {
            this.method124(true);
        }
        OpenGL.glMatrixMode(5890);
        ++field3354;
        if (super.field5370[super.field5412] == class260.field4242) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(super.field5333[super.field5412].method3022(class471.field6980, 7), 0);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "()Z", line = 1680)
    public final boolean method134() {
        ++field3393;
        return false;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1689)
    public final void method103(Rectangle[] arg0, int arg1) throws class529 {
        ++field3364;
        this.method122();
    }

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "(IIII)[I", line = 1699)
    public final int[] method146(int arg0, int arg1, int arg2, int arg3) {
        ++field3372;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, super.field5195 - (var6 - -1) + -arg1, arg2, 1, 32993, this.field3438, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "()V", line = 1718)
    public final void method170() {
        OpenGL.glFinish();
        ++field3358;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Los;Lmg;B)Z", line = 1726)
    public final boolean method186(class408 arg0, class134 arg1, byte arg2) {
        if (arg2 > -1) {
            return false;
        } else {
            ++field3410;
            return true;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V", line = 1739)
    public final void method138(Object arg0, Canvas arg1, byte arg2) {
        ++field3349;
        Long var4 = (Long) arg0;
        if (arg2 <= 126) {
            this.method136();
        }
        this.field3381.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!bea", name = "DA", descriptor = "()I", line = 1752)
    public final int method131() {
        ++field3380;
        return this.field3444;
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "(II)Lia;", line = 1762)
    public final class546 method161(int arg0, int arg1) {
        ++field3416;
        if (arg1 != 5299) {
            this.method114(false);
        }
        if (~arg0 != -4) {
            if (arg0 != 4) {
                return arg0 == 8 ? new class439(this, super.field5179, super.field5207) : super.method161(arg0, 5299);
            } else {
                return new class558(this, super.field5179, super.field5207);
            }
        } else {
            return new class234(this, super.field5179);
        }
    }

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "()V", line = 1808)
    public final void method122() throws class529 {
        this.field3381.swapBuffers();
        ++field3409;
    }

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "()V", line = 1820)
    public final void method176() {
        ++field3397;
    }

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "(I)V", line = 1828)
    public final void method152(int arg0) {
        OpenGL.glTexEnvi(8960, 34161, class540.method3277(super.field5357[super.field5412], 25865));
        ++field3356;
        if (arg0 < 70) {
            this.field3421 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "()Lfe;", line = 1840)
    public final class530 method160() {
        ++field3339;
        int var1 = -1;
        if (~this.field3443.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field3443.indexOf("intel") == -1) {
            if (this.field3443.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class530(var1, "OpenGL", this.field3441, this.field3439, 0L);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZZ[[II)Lpfa;", line = 1866)
    public final class270 method171(boolean arg0, boolean arg1, int[][] arg2, int arg3) {
        if (!arg1) {
            this.method169(94);
        }
        ++field3366;
        return new class588(this, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lmg;Los;I)Z", line = 1880)
    public final boolean method164(class134 arg0, class408 arg1, int arg2) {
        ++field3375;
        if (arg2 <= 86) {
            this.field3415 = null;
        }
        return true;
    }
}
