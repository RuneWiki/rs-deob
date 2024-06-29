import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class529 extends class156 {

    @OriginalMember(owner = "client!ko", name = "rh", descriptor = "Lok;")
    private class266 field7590 = new class266();

    @OriginalMember(owner = "client!ko", name = "ui", descriptor = "Lok;")
    private class266 field7645 = new class266();

    @OriginalMember(owner = "client!ko", name = "vi", descriptor = "Lok;")
    private class266 field7646 = new class266();

    @OriginalMember(owner = "client!ko", name = "wi", descriptor = "Lok;")
    private class266 field7647 = new class266();

    @OriginalMember(owner = "client!ko", name = "xi", descriptor = "Lok;")
    private class266 field7648 = new class266();

    @OriginalMember(owner = "client!ko", name = "yi", descriptor = "Lok;")
    private class266 field7649 = new class266();

    @OriginalMember(owner = "client!ko", name = "zi", descriptor = "Lok;")
    private class266 field7650 = new class266();

    @OriginalMember(owner = "client!ko", name = "Ci", descriptor = "[Ljh;")
    private class169[] field7653 = new class169[16];

    @OriginalMember(owner = "client!ko", name = "Gi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field7657 = new MapBuffer();

    @OriginalMember(owner = "client!ko", name = "Ji", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field7660 = new MapBuffer();

    @OriginalMember(owner = "client!ko", name = "Pi", descriptor = "I")
    private int field7666 = 0;

    @OriginalMember(owner = "client!ko", name = "Eh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field7603;

    @OriginalMember(owner = "client!ko", name = "Ui", descriptor = "Ljava/lang/String;")
    private String field7671;

    @OriginalMember(owner = "client!ko", name = "Ri", descriptor = "Ljava/lang/String;")
    private String field7668;

    @OriginalMember(owner = "client!ko", name = "Qi", descriptor = "I")
    private int field7667;

    @OriginalMember(owner = "client!ko", name = "Oi", descriptor = "Z")
    public boolean field7665;

    @OriginalMember(owner = "client!ko", name = "Ki", descriptor = "Z")
    private boolean field7661;

    @OriginalMember(owner = "client!ko", name = "Ni", descriptor = "Z")
    private boolean field7664;

    @OriginalMember(owner = "client!ko", name = "Si", descriptor = "Z")
    public boolean field7669;

    @OriginalMember(owner = "client!ko", name = "Ti", descriptor = "Z")
    public boolean field7670;

    @OriginalMember(owner = "client!ko", name = "Li", descriptor = "Z")
    public boolean field7662;

    @OriginalMember(owner = "client!ko", name = "Mi", descriptor = "[I")
    public int[] field7663;

    @OriginalMember(owner = "client!ko", name = "Vi", descriptor = "I")
    public int field7672;

    @OriginalMember(owner = "client!ko", name = "di", descriptor = "[I")
    public static int[] field7628 = new int[25];

    @OriginalMember(owner = "client!ko", name = "Hg", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!ko", name = "Ig", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!ko", name = "Jg", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!ko", name = "Kg", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!ko", name = "Lg", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!ko", name = "Mg", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!ko", name = "Ng", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!ko", name = "Og", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!ko", name = "Pg", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!ko", name = "Qg", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!ko", name = "Rg", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!ko", name = "Sg", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!ko", name = "Tg", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!ko", name = "Ug", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!ko", name = "Vg", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!ko", name = "Wg", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!ko", name = "Xg", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!ko", name = "Yg", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!ko", name = "Zg", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!ko", name = "ah", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!ko", name = "bh", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!ko", name = "ch", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!ko", name = "dh", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!ko", name = "eh", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!ko", name = "fh", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!ko", name = "gh", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!ko", name = "hh", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!ko", name = "ih", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!ko", name = "jh", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!ko", name = "kh", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!ko", name = "lh", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!ko", name = "mh", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!ko", name = "nh", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!ko", name = "oh", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!ko", name = "ph", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!ko", name = "qh", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!ko", name = "sh", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!ko", name = "th", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!ko", name = "uh", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!ko", name = "vh", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!ko", name = "wh", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!ko", name = "xh", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!ko", name = "yh", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!ko", name = "zh", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!ko", name = "Ah", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!ko", name = "Bh", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!ko", name = "Ch", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!ko", name = "Dh", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!ko", name = "Fh", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!ko", name = "Gh", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!ko", name = "Hh", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!ko", name = "Ih", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!ko", name = "Jh", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!ko", name = "Kh", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!ko", name = "Lh", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!ko", name = "Mh", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!ko", name = "Nh", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!ko", name = "Oh", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!ko", name = "Ph", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!ko", name = "Qh", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!ko", name = "Rh", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!ko", name = "Sh", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!ko", name = "Th", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!ko", name = "Uh", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!ko", name = "Vh", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!ko", name = "Wh", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!ko", name = "Xh", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!ko", name = "Yh", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!ko", name = "Zh", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!ko", name = "ai", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!ko", name = "bi", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!ko", name = "ci", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!ko", name = "ei", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!ko", name = "fi", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!ko", name = "gi", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!ko", name = "hi", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!ko", name = "ii", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!ko", name = "ji", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!ko", name = "ki", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!ko", name = "li", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!ko", name = "mi", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!ko", name = "ni", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!ko", name = "oi", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!ko", name = "pi", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!ko", name = "qi", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!ko", name = "ri", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!ko", name = "si", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!ko", name = "ti", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!ko", name = "Hi", descriptor = "I")
    private int field7658;

    @OriginalMember(owner = "client!ko", name = "Ai", descriptor = "J")
    private long field7651;

    @OriginalMember(owner = "client!ko", name = "Bi", descriptor = "Z")
    private boolean field7652;

    @OriginalMember(owner = "client!ko", name = "Di", descriptor = "Z")
    private boolean field7654;

    @OriginalMember(owner = "client!ko", name = "Ei", descriptor = "Z")
    private boolean field7655;

    @OriginalMember(owner = "client!ko", name = "Fi", descriptor = "Z")
    private boolean field7656;

    @OriginalMember(owner = "client!ko", name = "Ii", descriptor = "Z")
    private boolean field7659;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "(I)V", line = 4)
    public final void method1149(int arg0) {
        if (arg0 != -29610) {
            this.field7665 = false;
        }
        ++field7558;
        if (class313.field4454 != super.field2406) {
            if (class727.field10049 != super.field2406) {
                if (class309.field4422 == super.field2406) {
                    OpenGL.glBlendFunc(774, 1);
                    return;
                }
            } else {
                OpenGL.glBlendFunc(1, 1);
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILad;)V", line = 26)
    public final void method1081(int arg0, class446 arg1) {
        ++field7615;
        if (arg0 <= 79) {
            this.field7672 = 41;
        }
        if (class29.field417 != arg1) {
            int var3 = class443.method2643(arg1, 105);
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

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "(I)V", line = 56)
    public final void method1086(int arg0) {
        ++field7620;
        OpenGL.glMatrixMode(5890);
        if (super.field2456[super.field2482] != class763.field10519) {
            OpenGL.glLoadMatrixf(super.field2401[super.field2482].method2403(5, class646.field9025), 0);
        } else {
            OpenGL.glLoadIdentity();
        }
        if (arg0 != 11) {
            this.method506();
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "(Z)V", line = 80)
    public final void method1185(boolean arg0) {
        if (arg0) {
            this.method1183(false, 116, (class179) null, -5);
        }
        ++field7577;
        if (super.field2411) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IB)Lnm;", line = 95)
    public final class497 method1142(int arg0, byte arg1) {
        ++field7571;
        if (arg1 != 26) {
            this.field7646 = null;
        }
        if (arg0 != 3) {
            if (~arg0 != -5) {
                return ~arg0 == -9 ? new class171(this, super.field2304, super.field2334) : super.method1142(arg0, (byte) 26);
            } else {
                return new class121(this, super.field2304, super.field2334);
            }
        } else {
            return new class505(this, super.field2304);
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lwia;I)V", line = 142)
    public class529(OpenGL arg0, Canvas arg1, long arg2, class160 arg3, class791 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field7603 = arg0;
            this.field7603.method3725();
            this.field7671 = OpenGL.glGetString(7936).toLowerCase();
            this.field7668 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field7671.indexOf("microsoft") == 0 && this.field7671.indexOf("brian paul") == -1 && this.field7671.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class3.method22(true, ' ', var8.replace('.', ' '));
                if (var9.length >= 2) {
                    try {
                        int var10 = class163.method1224(false, var9[0]);
                        int var11 = class163.method1224(false, var9[1]);
                        this.field7667 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field7667 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field7603.method3724("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field7603.method3724("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field2436 = var12[0];
                        if (~super.field2436 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field2438 = 8;
                            this.field7665 = this.field7603.method3724("GL_ARB_vertex_buffer_object");
                            super.field2447 = this.field7603.method3724("GL_ARB_multisample");
                            this.field7661 = this.field7603.method3724("GL_ARB_texture_rectangle");
                            super.field2481 = this.field7603.method3724("GL_ARB_texture_cube_map");
                            this.field7664 = this.field7603.method3724("GL_ARB_texture_non_power_of_two");
                            super.field2440 = this.field7603.method3724("GL_EXT_texture3D");
                            this.field7669 = this.field7603.method3724("GL_ARB_vertex_shader");
                            this.field7670 = this.field7603.method3724("GL_ARB_vertex_program");
                            this.field7662 = this.field7603.method3724("GL_ARB_fragment_shader");
                            this.field7603.method3724("GL_ARB_fragment_program");
                            this.field7663 = new int[super.field2436];
                            this.field7672 = Stream.method3953() ? 33639 : 5121;
                            if (~this.field7668.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class3.method22(true, ' ', this.field7668.replace('/', ' '));
                                for (int var17 = 0; ~var16.length < ~var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (var18.charAt(0) == 'x' && ~var18.length() <= -4 && class670.method3805(var18.substring(1, 3), (byte) 122)) {
                                                var15 = true;
                                                var18 = var18.substring(1);
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var18 = var18.substring(2);
                                                    var14 = true;
                                                }
                                                if (var18.length() >= 4 && class670.method3805(var18.substring(0, 4), (byte) 120)) {
                                                    var13 = class163.method1224(false, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && ~var13 >= -9251) {
                                        super.field2440 = false;
                                    }
                                    if (~var13 <= -7001 && ~var13 >= -8000) {
                                        this.field7665 = false;
                                    }
                                }
                                this.field7661 &= this.field7603.method3724("GL_ARB_half_float_pixel");
                            }
                            this.field7671.indexOf("intel");
                            if (this.field7665) {
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
            this.method533(122);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lbja;Lvea;I)Z", line = 302)
    public final boolean method1122(class34 arg0, class288 arg1, int arg2) {
        ++field7554;
        if (arg2 <= 18) {
            field7628 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)V", line = 314)
    public final void method554(boolean arg0) {
        ++field7610;
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(II)Lts;", line = 321)
    public final class560 method532(int arg0, int arg1) {
        ++field7584;
        return null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZZBLip;I)V", line = 333)
    public final void method1158(boolean arg0, boolean arg1, byte arg2, class735 arg3, int arg4) {
        ++field7614;
        if (arg2 >= -83) {
            this.field7658 = -27;
        }
        OpenGL.glTexEnvi(8960, arg4 + 34176, class9.method59(false, arg3));
        if (arg1) {
            OpenGL.glTexEnvi(8960, 34192 - -arg4, !arg0 ? 770 : 771);
        } else {
            OpenGL.glTexEnvi(8960, arg4 + 34192, !arg0 ? 768 : 769);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIBI)V", line = 349)
    public static final void method3192(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        for (int var6 = arg2; ~arg0 <= ~var6; ++var6) {
            class434.method2601(class746.field10330[var6], arg5, arg3, (byte) -62, arg1);
        }
        ++field7602;
        if (arg4 != -118) {
            method3195(123);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBLhl;)V", line = 368)
    public final void method1178(int arg0, byte arg1, class553 arg2) {
        this.field7653[arg0] = (class169) arg2;
        ++field7605;
        if (arg1 <= 48) {
            this.field7660 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "GA", descriptor = "(I)V", line = 379)
    public final void method509(int arg0) {
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field7632;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(Z)V", line = 389)
    public final void method1130(boolean arg0) {
        for (int var2 = super.field2436 - 1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field7640;
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; ~var4 > -9; ++var4) {
            int var5 = 16384 - -var4;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field7603.setSwapInterval(0);
        super.method1130(arg0);
    }

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "(B)V", line = 443)
    public final void method1138(byte arg0) {
        ++field7581;
        this.field7652 = false;
        if (arg0 >= -1) {
            method3201((byte) -25);
        }
        this.method3193(25470);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V", line = 457)
    public final void method1109(Object arg0, Canvas arg1, boolean arg2) {
        if (arg2) {
            ++field7627;
            Long var4 = (Long) arg0;
            if (!this.field7603.setSurface(var4)) {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "()V", line = 473)
    public final void method468() {
        ++field7580;
    }

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "(II)V", line = 482)
    public final void method450(int arg0, int arg1) {
        ++field7633;
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "()V", line = 489)
    public final void method447() {
        ++field7624;
    }

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "(I)V", line = 497)
    public final void method1129(int arg0) {
        ++field7619;
        this.method1088(arg0 ^ 12352);
        int var2;
        for (var2 = 0; ~super.field2464 < ~var2; ++var2) {
            class154 var3 = super.field2439[var2];
            int var4 = var3.method1052(false);
            int var5 = var2 + 16386;
            float var6 = var3.method1057(false) / 255.0F;
            class543.field7808[0] = (float) var3.method1059(-6131);
            class543.field7808[1] = (float) var3.method1055((byte) -71);
            class543.field7808[2] = (float) var3.method1058(103);
            class543.field7808[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class543.field7808, 0);
            class543.field7808[3] = 1.0F;
            class543.field7808[0] = var6 * (float) (class702.method3977(var4, 16763665) >> 16);
            class543.field7808[2] = (float) class702.method3977(var4, 255) * var6;
            class543.field7808[1] = (float) class702.method3977(var4 >> 8, 255) * var6;
            OpenGL.glLightfv(var5, 4609, class543.field7808, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method1051((byte) -103) * var3.method1051((byte) 112)));
            OpenGL.glEnable(var5);
        }
        while (super.field2455 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method1129(arg0);
    }

    @OriginalMember(owner = "client!ko", name = "ya", descriptor = "()V", line = 541)
    public final void method518() {
        this.method1133(16, true);
        ++field7606;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lkfa;Lts;)Lpt;", line = 551)
    public final class555 method443(class627 arg0, class560 arg1) {
        ++field7594;
        return null;
    }

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "()Lcq;", line = 559)
    public final class491 method553() {
        ++field7604;
        int var1 = -1;
        if (~this.field7671.indexOf("nvidia") == 0) {
            if (~this.field7671.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (this.field7671.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class491(var1, "OpenGL", this.field7667, this.field7668, 0L);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I[Lwk;)Lkq;", line = 581)
    public final class618 method1151(int arg0, class152[] arg1) {
        if (arg0 != 12) {
            this.method1156((byte) 11);
        }
        ++field7621;
        return new class752(arg1);
    }

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "()V", line = 594)
    public final void method506() {
        ++field7562;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIBI[BZLvea;)Loga;", line = 602)
    public final class498 method1114(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5, boolean arg6, class288 arg7) {
        ++field7607;
        int var9 = -47 % ((arg3 - 17) / 58);
        if (!this.field7664 && (!class262.method1704(arg2, 3) || !class262.method1704(arg4, 3))) {
            if (!this.field7661) {
                class450 var10 = new class450(this, arg7, class34.field457, class433.method2595(arg2, (byte) -82), class433.method2595(arg4, (byte) -82));
                var10.method2023(arg2, 0, arg7, 0, arg4, arg1, 8409, arg5, arg0);
                return var10;
            } else {
                return new class315(this, arg7, arg2, arg4, arg5, arg0, arg1);
            }
        } else {
            return new class450(this, arg7, arg2, arg4, arg6, arg5, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "()V", line = 630)
    public final void method484() {
        ++field7564;
        super.method484();
        if (this.field7603 != null) {
            this.field7603.method3723();
            this.field7603.release();
            this.field7603 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZILcfa;I)V", line = 653)
    public final void method1183(boolean arg0, int arg1, class179 arg2, int arg3) {
        ++field7641;
        byte var5;
        int var6;
        if (class376.field5193 == arg2) {
            var5 = 1;
            var6 = arg3 * 2;
        } else if (class451.field6306 == arg2) {
            var5 = 3;
            var6 = arg3 - -1;
        } else if (class207.field3204 != arg2) {
            if (class744.field10310 == arg2) {
                var5 = 6;
                var6 = arg3 + 2;
            } else if (class591.field8327 != arg2) {
                var6 = arg3;
                var5 = 0;
            } else {
                var6 = arg3 - -2;
                var5 = 5;
            }
        } else {
            var5 = 4;
            var6 = arg3 * 3;
        }
        OpenGL.glDrawArrays(var5, arg1, var6);
        if (!arg0) {
            this.field7660 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "(B)V", line = 705)
    public final void method1175(byte arg0) {
        ++field7626;
        OpenGL.glDepthMask(super.field2494 && super.field2461);
        if (arg0 != -104) {
            this.field7658 = -97;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)V", line = 717)
    public final void method448(int arg0, int arg1, int arg2, int arg3) {
        ++field7612;
    }

    @OriginalMember(owner = "client!ko", name = "ab", descriptor = "(I)V", line = 724)
    private final void method3193(int arg0) {
        ++field7574;
        if (this.field7654) {
            OpenGL.glPopMatrix();
        }
        if (arg0 == 25470) {
            if (super.field2467.method2092((byte) -73)) {
                if (!this.field7652) {
                    OpenGL.glLoadMatrixf(super.field2392.method2403(arg0 + -25465, class646.field9025), 0);
                    this.field7652 = true;
                    this.method1087(31205);
                    this.method1129(6);
                }
                if (!super.field2384) {
                    OpenGL.glPushMatrix();
                    OpenGL.glMultMatrixf(super.field2387.method2403(5, class646.field9025), 0);
                    this.field7654 = true;
                } else {
                    this.field7654 = false;
                }
            } else if (super.field2384) {
                OpenGL.glLoadIdentity();
                this.field7654 = false;
            } else {
                OpenGL.glLoadMatrixf(super.field2387.method2403(5, class646.field9025), 0);
                this.field7654 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 772)
    public final synchronized void method454(int arg0) {
        ++field7613;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field7645.method1737(-17429)) {
            class489 var12 = (class489) this.field7645.method1736(0);
            class154.field2185[var3++] = (int) var12.field8133;
            super.field2385 -= var12.field6926;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class154.field2185, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class154.field2185, 0);
            var3 = 0;
        }
        while (!this.field7646.method1737(-17429)) {
            class489 var11 = (class489) this.field7646.method1736(0);
            class154.field2185[var3++] = (int) var11.field8133;
            super.field2389 -= var11.field6926;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class154.field2185, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class154.field2185, 0);
            var3 = 0;
        }
        while (!this.field7647.method1737(-17429)) {
            class489 var10 = (class489) this.field7647.method1736(0);
            class154.field2185[var3++] = var10.field6926;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class154.field2185, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class154.field2185, 0);
            var3 = 0;
        }
        while (!this.field7648.method1737(-17429)) {
            class489 var9 = (class489) this.field7648.method1736(0);
            class154.field2185[var3++] = (int) var9.field8133;
            super.field2386 -= var9.field6926;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class154.field2185, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class154.field2185, 0);
            boolean var4 = false;
        }
        while (!this.field7590.method1737(-17429)) {
            class489 var8 = (class489) this.field7590.method1736(0);
            OpenGL.glDeleteLists((int) var8.field8133, var8.field6926);
        }
        while (!this.field7649.method1737(-17429)) {
            class577 var7 = this.field7649.method1736(0);
            OpenGL.glDeleteProgramARB((int) var7.field8133);
        }
        while (!this.field7650.method1737(-17429)) {
            class577 var6 = this.field7650.method1736(0);
            OpenGL.glDeleteObjectARB(var6.field8133);
        }
        while (!this.field7590.method1737(-17429)) {
            class489 var5 = (class489) this.field7590.method1736(0);
            OpenGL.glDeleteLists((int) var5.field8133, var5.field6926);
        }
        if (~this.method433() < -100663297 && ~(this.field7651 + 60000L) > ~class459.method2731(108)) {
            System.gc();
            this.field7651 = class459.method2731(120);
        }
        super.method454(var2);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(ZZ)V", line = 934)
    public final void method1119(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method3193(-39);
        }
        ++field7618;
        if (!arg1) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ko", name = "na", descriptor = "(IIII)[I", line = 951)
    public final int[] method467(int arg0, int arg1, int arg2, int arg3) {
        ++field7578;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + super.field2265 - 1, arg2, 1, 32993, this.field7672, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)V", line = 972)
    public final void method1083(byte arg0) {
        ++field7596;
        if (super.field2408 && super.field2476 && ~super.field2451 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 > -69) {
            this.method1185(true);
        }
    }

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "()I", line = 990)
    public final int method476() {
        ++field7567;
        return this.field7666;
    }

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "(B)V", line = 999)
    public final void method1173(byte arg0) {
        ++field7643;
        if (super.field2405 && !super.field2475) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 < 30) {
            this.method1134(false, -46, -107, (int[][]) null);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLkq;)V", line = 1017)
    public final void method1111(byte arg0, class618 arg1) {
        ++field7630;
        class152[] var3 = ((class752) arg1).field10399;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        int var8 = 0;
        if (arg0 > 4) {
            while (~var3.length < ~var8) {
                class152 var11 = var3[var8];
                class169 var12 = this.field7653[var8];
                int var13 = 0;
                int var14 = var12.method1250((byte) 103);
                long var15 = var12.method865(0);
                var12.method864(false);
                for (int var17 = 0; var17 < var11.method1049(false); ++var17) {
                    class631 var18 = var11.method1044(var17, (byte) 101);
                    if (class631.field8865 != var18) {
                        if (class631.field8867 == var18) {
                            var6 = true;
                            OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                        } else if (class631.field8868 != var18) {
                            if (class631.field8869 == var18) {
                                OpenGL.glClientActiveTexture(33984 + var4++);
                                OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                            } else if (class631.field8870 == var18) {
                                OpenGL.glClientActiveTexture(33984 + var4++);
                                OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                            } else if (class631.field8871 == var18) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                            } else if (class631.field8872 == var18) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                            }
                        } else {
                            OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                            var5 = true;
                        }
                    } else {
                        OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                        var7 = true;
                    }
                    var13 += var18.field8864;
                }
                ++var8;
            }
            if (this.field7656 != var7) {
                if (!var7) {
                    OpenGL.glDisableClientState(32884);
                } else {
                    OpenGL.glEnableClientState(32884);
                }
                this.field7656 = var7;
            }
            if (this.field7659 == !var6) {
                if (!var6) {
                    OpenGL.glDisableClientState(32885);
                } else {
                    OpenGL.glEnableClientState(32885);
                }
                this.field7659 = var6;
            }
            if (!this.field7655 == var5) {
                if (!var5) {
                    OpenGL.glDisableClientState(32886);
                } else {
                    OpenGL.glEnableClientState(32886);
                }
                this.field7655 = var5;
            }
            if (~var4 < ~this.field7658) {
                for (int var9 = this.field7658; ~var4 < ~var9; ++var9) {
                    OpenGL.glClientActiveTexture(var9 + 33984);
                    OpenGL.glEnableClientState(32888);
                }
                this.field7658 = var4;
            } else if (var4 < this.field7658) {
                for (int var10 = var4; this.field7658 > var10; ++var10) {
                    OpenGL.glClientActiveTexture(var10 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field7658 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1179)
    public final void method498(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class736 {
        this.method463(arg2, arg3);
        ++field7635;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V", line = 1188)
    public final void method463(int arg0, int arg1) throws class736 {
        this.field7603.swapBuffers();
        ++field7575;
    }

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "(I)V", line = 1199)
    public final void method1165(int arg0) {
        ++field7587;
        if (arg0 == 0) {
            if (super.field2426) {
                OpenGL.glEnable(16384);
                OpenGL.glEnable(16385);
            } else {
                OpenGL.glDisable(16384);
                OpenGL.glDisable(16385);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "(B)V", line = 1221)
    public final void method1126(byte arg0) {
        ++field7597;
        if (arg0 != 53) {
            this.field7645 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V", line = 1232)
    public final void method1068(int arg0) {
        class543.field7808[3] = (float) (super.field2493 >>> 24) / 255.0F;
        ++field7576;
        class543.field7808[2] = (float) class702.method3977(255, super.field2493) / 255.0F;
        class543.field7808[1] = (float) class702.method3977(65280, super.field2493) / 65280.0F;
        class543.field7808[0] = (float) class702.method3977(super.field2493, 16711680) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class543.field7808, arg0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLha;)V", line = 1245)
    public static final void method3194(boolean arg0, class65 arg1) {
        ++field7638;
        int var2 = 0;
        if (!arg0) {
            field7628 = null;
        }
        int var3 = 0;
        if (class195.field2997) {
            var2 = class493.method2933((byte) -71);
            var3 = class242.method1613(8220);
        }
        int var4 = -10660793;
        class338.method2146(class109.field1608 + var2, class42.field549, var4, (byte) 125, arg1, class54.field679, class407.field5549 + var3, -16777216);
        class269.field3907.method563(class620.field8685.method3580(class140.field2081, 12), (byte) -128, var4, -1, var3 - -14 + class407.field5549, class109.field1608 + var2 + 3);
        int var5 = class152.field2154.method2646(9) + var2;
        int var6 = var3 + class152.field2154.method2650((byte) -69);
        if (class378.field5223) {
            int var7 = 0;
            for (class753 var8 = (class753) class371.field5135.method636(256); var8 != null; var8 = (class753) class371.field5135.method637(false)) {
                int var12 = var7 * 16 + class407.field5549 + var3 + 31;
                if (var8.field10409 != 1) {
                    class404.method2483(var8, class42.field549, 1, class109.field1608 + var2, var6, arg1, -256, class54.field679, class407.field5549 + var3, -1, var5, var12);
                } else {
                    class564.method3327(class42.field549, var5, class109.field1608 + var2, arg1, (byte) -100, class407.field5549 - -var3, var6, -256, class54.field679, -1, var12, (class746) var8.field10411.field923.field1600);
                }
                ++var7;
            }
            if (class280.field4071 != null) {
                class338.method2146(class55.field705, class295.field4298, var4, (byte) 126, arg1, class545.field7847, class724.field10026, -16777216);
                int var9 = 0;
                class269.field3907.method563(class280.field4071.field10408, (byte) 24, var4, -1, class724.field10026 + 14, class55.field705 + 3);
                for (class746 var10 = (class746) class280.field4071.field10411.method636(256); var10 != null; var10 = (class746) class280.field4071.field10411.method637(!arg0)) {
                    int var11 = var9 * 16 + class724.field10026 + 31;
                    class564.method3327(class295.field4298, var5, class55.field705, arg1, (byte) -113, class724.field10026, var6, -256, class545.field7847, -1, var11, var10);
                    ++var9;
                }
                class453.method2706(class55.field705, 0, class295.field4298, class724.field10026, class545.field7847);
            }
        } else {
            int var13 = 0;
            for (class746 var14 = (class746) class239.field3583.method1731((byte) -108); var14 != null; var14 = (class746) class239.field3583.method1724(0)) {
                int var15 = class407.field5549 + var3 - -((-var13 + class618.field8644 - 1) * 16) + 31;
                ++var13;
                class564.method3327(class42.field549, var5, class109.field1608 + var2, arg1, (byte) -64, class407.field5549 + var3, var6, -256, class54.field679, -1, var15, var14);
            }
        }
        class453.method2706(class109.field1608 + var2, 0, class42.field549, class407.field5549 - -var3, class54.field679);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILdk;IIILcfa;B)V", line = 1334)
    public final void method1091(int arg0, class535 arg1, int arg2, int arg3, int arg4, class179 arg5, byte arg6) {
        ++field7579;
        byte var8;
        int var9;
        if (class376.field5193 != arg5) {
            if (class451.field6306 != arg5) {
                if (class207.field3204 == arg5) {
                    var8 = 4;
                    var9 = arg0 * 3;
                } else if (class744.field10310 != arg5) {
                    if (class591.field8327 != arg5) {
                        var9 = arg0;
                        var8 = 0;
                    } else {
                        var8 = 5;
                        var9 = arg0 + 2;
                    }
                } else {
                    var8 = 6;
                    var9 = arg0 + 2;
                }
            } else {
                var9 = arg0 - -1;
                var8 = 3;
            }
        } else {
            var9 = arg0 * 2;
            var8 = 1;
        }
        class34 var10 = arg1.method603((byte) -79);
        if (arg6 != -29) {
            method3192(-6, -117, -16, -111, (byte) -77, -38);
        }
        class77 var11 = (class77) arg1;
        var11.method864(false);
        OpenGL.glDrawElements(var8, var9, class256.method1669(30926, var10), var11.method865(arg6 + 29) + (long) (var10.field453 * arg3));
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BZ)Lhl;", line = 1392)
    public final class553 method1074(byte arg0, boolean arg1) {
        ++field7592;
        if (arg0 != 46) {
            this.field7670 = true;
        }
        return new class169(this, arg1);
    }

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "(I)V", line = 1403)
    public final void method1078(int arg0) {
        ++field7644;
        if (arg0 < 39) {
            this.field7669 = false;
        }
        int var2 = this.field7663[super.field2482];
        if (var2 != 0) {
            this.field7663[super.field2482] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "(I)V", line = 1422)
    public final void method1121(int arg0) {
        if (arg0 >= 13) {
            OpenGL.glViewport(super.field2435, super.field2469, super.field2365, super.field2265);
            ++field7600;
        }
    }

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "()V", line = 1434)
    public final void method548() {
        ++field7616;
        if (super.field2365 > 0 || ~super.field2265 < -1) {
            int var1 = super.field2437;
            int var2 = super.field2449;
            int var3 = super.field2446;
            int var4 = super.field2402;
            this.method511();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1084((byte) 95);
            this.method1100(false, true);
            this.method1188(false, 1);
            this.method1176(14, false);
            this.method1133(16, false);
            this.method1118(0, (class684) null);
            this.method1073(false, -2, false, -1);
            this.method1189(105, 1);
            this.method1101(false, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field2365, super.field2265, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method434(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "(B)V", line = 1475)
    public final void method1135(byte arg0) {
        ++field7623;
        if (arg0 < -84) {
            if (!super.field2442) {
                OpenGL.glDisable(3008);
            } else {
                OpenGL.glEnable(3008);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(IZ)Ldk;", line = 1491)
    public final class535 method1184(int arg0, boolean arg1) {
        if (arg0 != 2) {
            this.method1193((class288) null, (byte[]) null, 95, false, -49, 49);
        }
        ++field7555;
        return new class77(this, class34.field458, arg1);
    }

    @OriginalMember(owner = "client!ko", name = "bb", descriptor = "(I)Lbea;", line = 1506)
    public static final class234 method3195(int arg0) {
        ++field7557;
        if (arg0 != 1) {
            field7628 = null;
        }
        return class354.method2253(1, (byte) 123);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIID)V", line = 1517)
    public final void method460(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field7572;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(III)V", line = 1525)
    public final synchronized void method3196(int arg0, int arg1, int arg2) {
        ++field7642;
        class489 var4 = new class489(arg2);
        var4.field8133 = (long) arg0;
        int var5 = -99 / ((56 - arg1) / 39);
        this.field7645.method1727(var4, (byte) 83);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BJ)V", line = 1538)
    public final synchronized void method3197(byte arg0, long arg1) {
        ++field7588;
        if (arg0 != -116) {
            this.method3193(-14);
        }
        class577 var4 = new class577();
        var4.field8133 = arg1;
        this.field7650.method1727(var4, (byte) 101);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(III)V", line = 1552)
    public final synchronized void method3198(int arg0, int arg1, int arg2) {
        ++field7639;
        class489 var4 = new class489(arg0);
        var4.field8133 = (long) arg2;
        this.field7646.method1727(var4, (byte) 107);
        if (arg1 <= 4) {
            this.field7655 = true;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILvea;ZI[FZI)Loga;", line = 1567)
    public final class498 method1162(int arg0, int arg1, class288 arg2, boolean arg3, int arg4, float[] arg5, boolean arg6, int arg7) {
        ++field7611;
        if (!arg3) {
            this.method3197((byte) 47, 106L);
        }
        if (!this.field7664 && (!class262.method1704(arg7, 3) || !class262.method1704(arg0, 3))) {
            if (!this.field7661) {
                class450 var9 = new class450(this, arg2, class34.field461, class433.method2595(arg7, (byte) -82), class433.method2595(arg0, (byte) -82));
                var9.method2680(arg2, arg7, arg5, arg0, 0, 0, arg1, arg4, 19352);
                return var9;
            } else {
                return new class315(this, arg2, arg7, arg0, arg5, arg4, arg1);
            }
        } else {
            return new class450(this, arg2, arg7, arg0, arg6, arg5, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;", line = 1596)
    public final Object method1169(byte arg0, Canvas arg1) {
        if (arg0 != -77) {
            this.method468();
        }
        ++field7563;
        long var3 = this.field7603.prepareSurface(arg1);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZII[[I)Lks;", line = 1612)
    public final class461 method1134(boolean arg0, int arg1, int arg2, int[][] arg3) {
        ++field7634;
        return arg2 != -2 ? null : new class200(this, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "(II)V", line = 1623)
    public final synchronized void method3199(int arg0, int arg1) {
        ++field7559;
        class577 var3 = new class577();
        var3.field8133 = (long) arg1;
        if (arg0 == 0) {
            this.field7649.method1727(var3, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lip;ZII)V", line = 1637)
    public final void method1098(class735 arg0, boolean arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, 34184 - -arg3, class9.method59(false, arg0));
        if (arg2 == 12) {
            ++field7570;
            OpenGL.glTexEnvi(8960, 34200 - -arg3, !arg1 ? 770 : 771);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)V", line = 1649)
    public final void method1110(int arg0, byte arg1) {
        if (arg1 > -89) {
            this.method1195(126);
        }
        ++field7556;
    }

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "(I)V", line = 1659)
    public final void method1144(int arg0) {
        class543.field7808[1] = super.field2457 * super.field2410;
        if (arg0 > -16) {
            this.field7667 = 25;
        }
        class543.field7808[0] = super.field2489 * super.field2410;
        class543.field7808[2] = super.field2458 * super.field2410;
        ++field7568;
        class543.field7808[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class543.field7808, 0);
        class543.field7808[0] = -super.field2495 * super.field2489;
        class543.field7808[2] = -super.field2495 * super.field2458;
        class543.field7808[1] = -super.field2495 * super.field2457;
        class543.field7808[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class543.field7808, 0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I[IIIIBZ)Loga;", line = 1679)
    public final class498 method1186(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        if (arg5 > -101) {
            this.method1143((byte) -71);
        }
        ++field7636;
        if (!this.field7664 && (!class262.method1704(arg3, 3) || !class262.method1704(arg4, 3))) {
            if (this.field7661) {
                return new class315(this, arg3, arg4, arg1, arg0, arg2);
            } else {
                class450 var8 = new class450(this, class691.field9659, class34.field457, class433.method2595(arg3, (byte) -82), class433.method2595(arg4, (byte) -82));
                var8.method2020(arg3, arg2, 0, (byte) -84, 0, arg1, arg4, arg0);
                return var8;
            }
        } else {
            return new class450(this, arg3, arg4, arg6, arg1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lvea;[BIZII)Lgga;", line = 1707)
    public final class307 method1193(class288 arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            return null;
        } else {
            ++field7595;
            return new class789(this, arg0, arg4, arg2, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)Lkfa;", line = 1718)
    public final class627 method481(int arg0, int arg1) {
        ++field7573;
        return null;
    }

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "(B)V", line = 1727)
    public final void method1174(byte arg0) {
        class543.field7808[3] = 1.0F;
        ++field7637;
        if (arg0 != 44) {
            this.method1134(false, -73, 97, (int[][]) null);
        }
        class543.field7808[1] = super.field2457 * super.field2399;
        class543.field7808[2] = super.field2458 * super.field2399;
        class543.field7808[0] = super.field2489 * super.field2399;
        OpenGL.glLightModelfv(2899, class543.field7808, 0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V", line = 1742)
    public final void method1075(Object arg0, Canvas arg1, int arg2) {
        if (arg2 == 7) {
            ++field7561;
            Long var4 = (Long) arg0;
            this.field7603.surfaceResized(var4);
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V", line = 1756)
    public final void method1069(byte arg0) {
        ++field7591;
        super.field2460 = (float) (-super.field2472 + super.field2480);
        super.field2453 = (float) (-super.field2451) + super.field2460;
        if (super.field2453 < (float) super.field2479) {
            super.field2453 = (float) super.field2479;
        }
        OpenGL.glFogf(2915, super.field2453);
        OpenGL.glFogf(2916, super.field2460);
        if (arg0 != -63) {
            this.field7668 = null;
        }
        class543.field7808[1] = (float) class702.method3977(super.field2441, 65280) / 65280.0F;
        class543.field7808[2] = (float) class702.method3977(super.field2441, 255) / 255.0F;
        class543.field7808[0] = (float) class702.method3977(16711680, super.field2441) / 1.671168E7F;
        OpenGL.glFogfv(2918, class543.field7808, 0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()Z", line = 1778)
    public final boolean method431() {
        ++field7608;
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V", line = 1793)
    public final void method1196(byte arg0, Object arg1, Canvas arg2) {
        ++field7601;
        int var4 = -22 % ((arg0 - 40) / 60);
        Long var5 = (Long) arg1;
        this.field7603.releaseSurface(arg2, var5);
    }

    @OriginalMember(owner = "client!ko", name = "Y", descriptor = "(I)V", line = 1806)
    public final void method1195(int arg0) {
        this.method3193(25470);
        if (arg0 == 0) {
            ++field7583;
        }
    }

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "(B)V", line = 1818)
    public static final void method3200(byte arg0) {
        if (arg0 >= -95) {
            method3194(true, (class65) null);
        }
        class274.field3951.method499(class472.field6627, class670.field9310, class585.field8271);
        ++field7589;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFF)V", line = 1829)
    public final void method499(float arg0, float arg1, float arg2) {
        ++field7599;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lpt;)V", line = 1839)
    public final void method528(class555 arg0) {
        ++field7629;
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(Z)V", line = 1848)
    public final void method1123(boolean arg0) {
        ++field7598;
        if (arg0) {
            OpenGL.glTexEnvi(8960, 34161, class374.method2322(super.field2396[super.field2482], (byte) -77));
        }
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "()Z", line = 1861)
    public final boolean method451() {
        ++field7565;
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lqaa;Lqaa;FLqaa;)Lqaa;", line = 1869)
    public final class29 method470(class29 arg0, class29 arg1, float arg2, class29 arg3) {
        ++field7586;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "(I)F", line = 1884)
    public final float method1124(int arg0) {
        ++field7569;
        if (arg0 != 0) {
            this.field7667 = -12;
        }
        return 0.0F;
    }

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "(B)V", line = 1895)
    public final void method1095(byte arg0) {
        if (super.field2444) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        int var2 = -116 % ((arg0 - 65) / 54);
        ++field7622;
    }

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "()V", line = 1910)
    public final void method546() {
        ++field7566;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "(Z)V", line = 1918)
    public final void method1139(boolean arg0) {
        OpenGL.glActiveTexture(super.field2482 + 33984);
        if (arg0) {
            ++field7582;
        }
    }

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "(B)V", line = 1930)
    public final void method1143(byte arg0) {
        OpenGL.glMatrixMode(5889);
        if (arg0 == 102) {
            ++field7625;
            OpenGL.glLoadMatrixf(super.field2423, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "(B)V", line = 1943)
    public final void method1156(byte arg0) {
        ++field7631;
        if (arg0 > -32) {
            this.method506();
        }
        if (!super.field2519) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
    }

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "(I)V", line = 1958)
    public final void method1087(int arg0) {
        OpenGL.glLightfv(16384, 4611, super.field2416, 0);
        ++field7593;
        OpenGL.glLightfv(16385, 4611, super.field2419, 0);
        if (arg0 != 31205) {
            this.field7662 = true;
        }
    }

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "(B)V", line = 1971)
    public static void method3201(byte arg0) {
        field7628 = null;
        if (arg0 != -108) {
            method3201((byte) 3);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lvea;Lbja;III)Loga;", line = 1981)
    public final class498 method1103(class288 arg0, class34 arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -2) {
            this.method1124(-65);
        }
        ++field7585;
        if (!this.field7664 && (!class262.method1704(arg2, arg4 + 5) || !class262.method1704(arg3, 3))) {
            return !this.field7661 ? new class450(this, arg0, arg1, class433.method2595(arg2, (byte) -82), class433.method2595(arg3, (byte) -82)) : new class315(this, arg0, arg1, arg2, arg3);
        } else {
            return new class450(this, arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "(I)V", line = 2007)
    public final void method1125(int arg0) {
        if (arg0 >= -6) {
            this.method1149(126);
        }
        ++field7560;
        OpenGL.glTexEnvi(8960, 34162, class374.method2322(super.field2403[super.field2482], (byte) -92));
    }

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "(I)V", line = 2019)
    public final void method1150(int arg0) {
        if (arg0 != 13) {
            this.method1098((class735) null, false, -24, 31);
        }
        ++field7617;
        OpenGL.glScissor(super.field2437 + super.field2435, super.field2469 - -super.field2265 - super.field2402, -super.field2437 + super.field2449, -super.field2446 + super.field2402);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILvea;Lbja;)Z", line = 2037)
    public final boolean method1198(int arg0, class288 arg1, class34 arg2) {
        ++field7609;
        return arg0 == 13554;
    }
}
