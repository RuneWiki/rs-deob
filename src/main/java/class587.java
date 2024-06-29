import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class587 extends class444 {

    @OriginalMember(owner = "client!ag", name = "Uh", descriptor = "Lbu;")
    private class19 field8689 = new class19();

    @OriginalMember(owner = "client!ag", name = "Xh", descriptor = "Lbu;")
    private class19 field8692 = new class19();

    @OriginalMember(owner = "client!ag", name = "ai", descriptor = "Lbu;")
    private class19 field8695 = new class19();

    @OriginalMember(owner = "client!ag", name = "ci", descriptor = "Lbu;")
    private class19 field8697 = new class19();

    @OriginalMember(owner = "client!ag", name = "di", descriptor = "Lbu;")
    private class19 field8698 = new class19();

    @OriginalMember(owner = "client!ag", name = "gi", descriptor = "Lbu;")
    private class19 field8701 = new class19();

    @OriginalMember(owner = "client!ag", name = "hi", descriptor = "Lbu;")
    private class19 field8702 = new class19();

    @OriginalMember(owner = "client!ag", name = "ji", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field8704 = new MapBuffer();

    @OriginalMember(owner = "client!ag", name = "ni", descriptor = "I")
    private int field8708 = 0;

    @OriginalMember(owner = "client!ag", name = "oi", descriptor = "Z")
    private boolean field8709 = false;

    @OriginalMember(owner = "client!ag", name = "Ug", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field8637;

    @OriginalMember(owner = "client!ag", name = "pi", descriptor = "Ljava/lang/String;")
    private String field8710;

    @OriginalMember(owner = "client!ag", name = "ri", descriptor = "Ljava/lang/String;")
    private String field8712;

    @OriginalMember(owner = "client!ag", name = "ki", descriptor = "I")
    private int field8705;

    @OriginalMember(owner = "client!ag", name = "si", descriptor = "Z")
    public boolean field8713;

    @OriginalMember(owner = "client!ag", name = "ti", descriptor = "Z")
    private boolean field8714;

    @OriginalMember(owner = "client!ag", name = "li", descriptor = "Z")
    private boolean field8706;

    @OriginalMember(owner = "client!ag", name = "mi", descriptor = "Z")
    public boolean field8707;

    @OriginalMember(owner = "client!ag", name = "qi", descriptor = "I")
    public int field8711;

    @OriginalMember(owner = "client!ag", name = "ui", descriptor = "[I")
    public int[] field8715;

    @OriginalMember(owner = "client!ag", name = "fh", descriptor = "Lada;")
    public static class144 field8648 = new class144(38, 5);

    @OriginalMember(owner = "client!ag", name = "Yh", descriptor = "Lada;")
    public static class144 field8693;

    @OriginalMember(owner = "client!ag", name = "fi", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!ag", name = "ei", descriptor = "Lada;")
    public static class144 field8699;

    @OriginalMember(owner = "client!ag", name = "vg", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!ag", name = "wg", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!ag", name = "xg", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!ag", name = "yg", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!ag", name = "zg", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!ag", name = "Ag", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!ag", name = "Bg", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!ag", name = "Cg", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!ag", name = "Dg", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!ag", name = "Eg", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!ag", name = "Fg", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!ag", name = "Gg", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!ag", name = "Hg", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!ag", name = "Ig", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!ag", name = "Jg", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!ag", name = "Kg", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!ag", name = "Lg", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!ag", name = "Mg", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!ag", name = "Ng", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!ag", name = "Og", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!ag", name = "Pg", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!ag", name = "Qg", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!ag", name = "Rg", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!ag", name = "Sg", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!ag", name = "Tg", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!ag", name = "Vg", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!ag", name = "Wg", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!ag", name = "Xg", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!ag", name = "Yg", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!ag", name = "Zg", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!ag", name = "ah", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!ag", name = "bh", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!ag", name = "ch", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!ag", name = "dh", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!ag", name = "eh", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!ag", name = "gh", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!ag", name = "hh", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!ag", name = "ih", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!ag", name = "jh", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!ag", name = "kh", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!ag", name = "lh", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!ag", name = "mh", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!ag", name = "nh", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!ag", name = "oh", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!ag", name = "ph", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!ag", name = "qh", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!ag", name = "rh", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!ag", name = "sh", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!ag", name = "th", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!ag", name = "uh", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!ag", name = "vh", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!ag", name = "wh", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!ag", name = "xh", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!ag", name = "yh", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!ag", name = "zh", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!ag", name = "Ah", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!ag", name = "Bh", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!ag", name = "Ch", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!ag", name = "Dh", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!ag", name = "Eh", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!ag", name = "Fh", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!ag", name = "Gh", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!ag", name = "Hh", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!ag", name = "Ih", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!ag", name = "Jh", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!ag", name = "Kh", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!ag", name = "Lh", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!ag", name = "Mh", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!ag", name = "Nh", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!ag", name = "Oh", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!ag", name = "Ph", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!ag", name = "Qh", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!ag", name = "Rh", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!ag", name = "Sh", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!ag", name = "Th", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!ag", name = "Vh", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!ag", name = "Wh", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!ag", name = "Zh", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!ag", name = "bi", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!ag", name = "ii", descriptor = "J")
    private long field8703;

    static {
        new class572("From", "Von:", "De", "De");
        field8693 = new class144(45, 6);
        field8700 = 0;
        field8699 = new class144(64, 11);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLn;Lkda;I)V", line = 5)
    public class587(OpenGL arg0, Canvas arg1, long arg2, class17 arg3, class328 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field8637 = arg0;
            this.field8637.method3216();
            this.field8710 = OpenGL.glGetString(7936).toLowerCase();
            this.field8712 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field8710.indexOf("microsoft") == 0 && this.field8710.indexOf("brian paul") == -1 && this.field8710.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = method3490(' ', -47, var8.replace('.', ' '));
                if (~var9.length > -3) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class197.method1327(var9[0], -55);
                        int var11 = class197.method1327(var9[1], -49);
                        this.field8705 = var10 * 10 - -var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field8705 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field8637.method3217("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field8637.method3217("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field6128 = var12[0];
                        if (~super.field6128 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field6129 = 8;
                            this.field8713 = this.field8637.method3217("GL_ARB_vertex_buffer_object");
                            super.field6170 = this.field8637.method3217("GL_ARB_multisample");
                            this.field8714 = this.field8637.method3217("GL_ARB_texture_rectangle");
                            super.field6159 = this.field8637.method3217("GL_ARB_texture_cube_map");
                            this.field8706 = this.field8637.method3217("GL_ARB_texture_non_power_of_two");
                            super.field6141 = this.field8637.method3217("GL_EXT_texture3D");
                            this.field8637.method3217("GL_ARB_vertex_shader");
                            this.field8707 = this.field8637.method3217("GL_ARB_vertex_program");
                            this.field8637.method3217("GL_ARB_fragment_shader");
                            this.field8637.method3217("GL_ARB_fragment_program");
                            this.field8711 = Stream.method3454() ? 33639 : 5121;
                            if (~this.field8712.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = method3490(' ', -45, this.field8712.replace('/', ' '));
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (~var18.charAt(0) == -121 && ~var18.length() <= -4 && class631.method3673(var18.substring(1, 3), 10)) {
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
                                                if (~var18.length() <= -5 && class631.method3673(var18.substring(0, 4), 10)) {
                                                    var13 = class197.method1327(var18.substring(0, 4), -86);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && var13 <= 9250) {
                                        super.field6141 = false;
                                    }
                                    if (var13 >= 7000 && ~var13 >= -8000) {
                                        this.field8713 = false;
                                    }
                                }
                                this.field8714 &= this.field8637.method3217("GL_ARB_half_float_pixel");
                            }
                            this.field8710.indexOf("intel");
                            if (this.field8713) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                            this.field8715 = new int[super.field6128];
                            OpenGL.glClear(16640);
                            this.field8637.swapBuffers();
                            OpenGL.glClear(16640);
                        }
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method473();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "(B)V", line = 167)
    private final void method3488(byte arg0) {
        ++field8679;
        if (arg0 != -38) {
            this.method2683(5);
        }
        if (this.field8709) {
            OpenGL.glPopMatrix();
        }
        if (super.field6154.method3612(-128)) {
            if (!this.field8709) {
                OpenGL.glLoadIdentity();
                OpenGL.glMultMatrixf(super.field6094.method368(class5.field46, -16365), 0);
                this.method2602((byte) 113);
                this.method2661(arg0 + -89);
                this.field8709 = true;
            }
            if (this.field8709) {
                OpenGL.glPushMatrix();
            }
            if (!super.field6074) {
                OpenGL.glMultMatrixf(super.field6082.method368(class5.field46, -16365), 0);
                return;
            }
        } else {
            if (!super.field6074) {
                OpenGL.glLoadMatrixf(super.field6082.method368(class5.field46, -16365), 0);
                this.field8709 = false;
                return;
            }
            OpenGL.glLoadIdentity();
            this.field8709 = false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[Lwj;)Lsk;", line = 215)
    public final class532 method2649(int arg0, class334[] arg1) {
        if (arg0 > -117) {
            return null;
        } else {
            ++field8630;
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)Laf;", line = 227)
    public final class370 method2638(boolean arg0, boolean arg1) {
        if (arg1) {
            field8699 = null;
        }
        ++field8666;
        return new class45(this, class194.field2875, arg0);
    }

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "(I)V", line = 240)
    public final void method2618(int arg0) {
        if (arg0 != 11) {
            this.field8698 = null;
        }
        ++field8627;
        OpenGL.glViewport(super.field6192, super.field6132, super.field6044, super.field5975);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lgf;III)V", line = 252)
    public final void method2587(class232 arg0, int arg1, int arg2, int arg3) {
        ++field8624;
        int var5;
        byte var6;
        if (class242.field3468 != arg0) {
            if (class237.field3418 != arg0) {
                if (class569.field8396 != arg0) {
                    if (class230.field3373 == arg0) {
                        var5 = arg2 + 2;
                        var6 = 6;
                    } else if (class526.field7529 == arg0) {
                        var6 = 5;
                        var5 = arg2 + 2;
                    } else {
                        var6 = 0;
                        var5 = arg2;
                    }
                } else {
                    var5 = arg2 * 3;
                    var6 = 4;
                }
            } else {
                var6 = 3;
                var5 = arg2 + 1;
            }
        } else {
            var6 = 1;
            var5 = arg2 * 2;
        }
        OpenGL.glDrawArrays(var6, arg3, var5);
        if (arg1 != 5) {
            this.method421(66);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(IZ)V", line = 305)
    public final synchronized void method3489(int arg0, boolean arg1) {
        ++field8688;
        if (arg1) {
            field8699 = null;
        }
        class417 var3 = new class417();
        var3.field5651 = (long) arg0;
        this.field8701.method131(var3, 0);
    }

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "()V", line = 319)
    public final void method501() {
        ++field8655;
    }

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "(I)V", line = 328)
    public final void method2661(int arg0) {
        ++field8638;
        int var2;
        for (var2 = 0; ~var2 > ~super.field6175; ++var2) {
            class405 var3 = super.field6169[var2];
            int var4 = var3.method2384(630);
            int var5 = var2 + 16386;
            float var6 = var3.method2382(0) / 255.0F;
            class601.field8908[0] = (float) var3.method2388((byte) 73);
            class601.field8908[1] = (float) var3.method2383(2039035457);
            class601.field8908[2] = (float) var3.method2389(-10161);
            class601.field8908[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class601.field8908, 0);
            class601.field8908[0] = (float) class37.method245(var4 >> 16, 255) * var6;
            class601.field8908[3] = 1.0F;
            class601.field8908[1] = (float) (class37.method245(var4, 65521) >> 8) * var6;
            class601.field8908[2] = var6 * (float) class37.method245(255, var4);
            OpenGL.glLightfv(var5, 4609, class601.field8908, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method2390(6042) * var3.method2390(6042)));
            OpenGL.glEnable(var5);
        }
        while (super.field6149 > var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        if (arg0 >= -7) {
            this.field8702 = null;
        }
        super.method2661(-110);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFF)V", line = 376)
    public final void method470(float arg0, float arg1, float arg2) {
        ++field8663;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 384)
    public final void method529(Rectangle[] arg0, int arg1) throws class416 {
        this.method493();
        ++field8613;
    }

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "(I)V", line = 394)
    public final void method2619(int arg0) {
        int var2 = -38 % ((64 - arg0) / 48);
        ++field8626;
        if (super.field6180) {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        } else {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 416)
    public final Object method2645(Canvas arg0, int arg1) {
        if (arg1 != 24180) {
            return null;
        } else {
            ++field8665;
            long var3 = this.field8637.prepareSurface(arg0);
            if (~var3 == 0L) {
                throw new RuntimeException();
            } else {
                return new Long(var3);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "(I)V", line = 433)
    public final void method2571(int arg0) {
        ++field8668;
        if (arg0 == 0) {
            if (super.field6111 && !super.field6187) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "(I)V", line = 449)
    public final void method2620(int arg0) {
        ++field8629;
        if (arg0 < -48) {
            this.method3488((byte) -38);
        }
    }

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "()V", line = 460)
    public final void method493() throws class416 {
        this.field8637.swapBuffers();
        ++field8617;
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V", line = 470)
    public final synchronized void method484(int arg0) {
        ++field8636;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field8692.method119(true)) {
            class556 var12 = (class556) this.field8692.method128(936);
            class205.field3046[var2++] = (int) var12.field5651;
            super.field6083 -= var12.field8278;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class205.field3046, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class205.field3046, 0);
            var2 = 0;
        }
        while (!this.field8695.method119(true)) {
            class556 var11 = (class556) this.field8695.method128(936);
            class205.field3046[var2++] = (int) var11.field5651;
            super.field6078 -= var11.field8278;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class205.field3046, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class205.field3046, 0);
            var2 = 0;
        }
        while (!this.field8697.method119(true)) {
            class556 var10 = (class556) this.field8697.method128(936);
            class205.field3046[var2++] = var10.field8278;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class205.field3046, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class205.field3046, 0);
            var2 = 0;
        }
        while (!this.field8698.method119(true)) {
            class556 var9 = (class556) this.field8698.method128(936);
            class205.field3046[var2++] = (int) var9.field5651;
            super.field6073 -= var9.field8278;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class205.field3046, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class205.field3046, 0);
            boolean var4 = false;
        }
        while (!this.field8689.method119(true)) {
            class556 var8 = (class556) this.field8689.method128(936);
            OpenGL.glDeleteLists((int) var8.field5651, var8.field8278);
        }
        while (!this.field8701.method119(true)) {
            class417 var7 = this.field8701.method128(936);
            OpenGL.glDeleteProgramARB((int) var7.field5651);
        }
        while (!this.field8702.method119(true)) {
            class417 var6 = this.field8702.method128(936);
            OpenGL.glDeleteObjectARB(var6.field5651);
        }
        while (!this.field8689.method119(true)) {
            class556 var5 = (class556) this.field8689.method128(936);
            OpenGL.glDeleteLists((int) var5.field5651, var5.field8278);
        }
        if (~this.method454() < -100663297 && ~class598.method3538(true) < ~(this.field8703 - -60000L)) {
            System.gc();
            this.field8703 = class598.method3538(true);
        }
        super.method484(var3);
    }

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "()V", line = 629)
    public final void method433() {
        ++field8614;
        if (~super.field6044 < -1 || ~super.field5975 < -1) {
            int var1 = super.field6150;
            int var2 = super.field6183;
            int var3 = super.field6152;
            int var4 = super.field6172;
            this.method479();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2686((byte) 116);
            this.method2667(false, 62);
            this.method2658(40, false);
            this.method2657(false, -32);
            this.method2644(-95, false);
            this.method2632((class563) null, 0);
            this.method2652(false, 128, -2, false);
            this.method2698(1, 1);
            this.method2650(0, (byte) 35);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field6044, super.field5975, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method510(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ag", name = "YA", descriptor = "()I", line = 672)
    public final int method420() {
        ++field8633;
        return this.field8708;
    }

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "(IIII)[I", line = 682)
    public final int[] method456(int arg0, int arg1, int arg2, int arg3) {
        ++field8677;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + -1 + super.field5975 + -arg1, arg2, 1, 32993, this.field8711, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLsk;)V", line = 701)
    public final void method2584(boolean arg0, class532 arg1) {
        if (arg0) {
            ++field8622;
        }
    }

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "()V", line = 711)
    public final void method465() {
        ++field8667;
        this.method2644(-39, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "(Z)V", line = 720)
    public final void method2662(boolean arg0) {
        if (arg0) {
            if (!super.field6220) {
                OpenGL.glDisable(3089);
            } else {
                OpenGL.glEnable(3089);
            }
            ++field8616;
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(II)V", line = 735)
    public final void method2567(int arg0, int arg1) {
        if (arg1 == 0) {
            ++field8652;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLgf;IIIILaf;)V", line = 745)
    public final void method2578(byte arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, class370 arg6) {
        if (arg0 != 49) {
            field8699 = null;
        }
        ++field8615;
        int var8;
        byte var9;
        if (class242.field3468 == arg1) {
            var8 = arg5 * 2;
            var9 = 1;
        } else if (class237.field3418 != arg1) {
            if (class569.field8396 == arg1) {
                var8 = arg5 * 3;
                var9 = 4;
            } else if (class230.field3373 != arg1) {
                if (class526.field7529 == arg1) {
                    var9 = 5;
                    var8 = arg5 + 2;
                } else {
                    var9 = 0;
                    var8 = arg5;
                }
            } else {
                var8 = arg5 + 2;
                var9 = 6;
            }
        } else {
            var8 = arg5 + 1;
            var9 = 3;
        }
        class194 var10 = arg6.method283((byte) -70);
        class45 var11 = (class45) arg6;
        var11.method3096(true);
        OpenGL.glDrawElements(var9, var8, class595.method3522(var10, (byte) -52), var11.method3095((byte) -62) - -((long) (var10.field2870 * arg3)));
    }

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "(I)V", line = 802)
    public final void method2621(int arg0) {
        ++field8646;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(super.field6196, arg0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "(I)V", line = 813)
    public final void method2591(int arg0) {
        if (arg0 != 15385) {
            this.method2610(61);
        }
        ++field8628;
        if (super.field6167 && super.field6143 && super.field6153 >= 0 | super.field6117) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "(I)V", line = 828)
    public final void method2610(int arg0) {
        class601.field8908[2] = super.field6126 * super.field6107;
        class601.field8908[3] = 1.0F;
        class601.field8908[0] = super.field6176 * super.field6126;
        ++field8675;
        class601.field8908[1] = super.field6165 * super.field6126;
        OpenGL.glLightfv(16384, 4609, class601.field8908, 0);
        class601.field8908[1] = -super.field6163 * super.field6165;
        class601.field8908[0] = -super.field6163 * super.field6176;
        int var2 = 82 / ((arg0 - -36) / 50);
        class601.field8908[3] = 1.0F;
        class601.field8908[2] = -super.field6163 * super.field6107;
        OpenGL.glLightfv(16385, 4609, class601.field8908, 0);
    }

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "(I)V", line = 848)
    public final void method2636(int arg0) {
        ++field8669;
        if (arg0 != 1) {
            this.method2568((class141) null, -76, 15, -49, 122, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "()Z", line = 858)
    public final boolean method423() {
        ++field8662;
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "(I)V", line = 866)
    public final void method2628(int arg0) {
        ++field8684;
        class601.field8908[2] = (float) class37.method245(255, super.field6191) / 255.0F;
        class601.field8908[3] = (float) (super.field6191 >>> 24) / 255.0F;
        class601.field8908[0] = (float) class37.method245(super.field6191, 16711680) / 1.671168E7F;
        class601.field8908[arg0] = (float) class37.method245(65280, super.field6191) / 65280.0F;
        OpenGL.glTexEnvfv(8960, 8705, class601.field8908, 0);
    }

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "(I)V", line = 878)
    public final void method2607(int arg0) {
        ++field8631;
        int var2;
        if (!super.field6117) {
            super.field6113 = (float) (-super.field6114 + super.field6115);
            super.field6097 = super.field6113 - (float) super.field6153;
            if (super.field6097 < (float) super.field6161) {
                super.field6097 = (float) super.field6161;
            }
            OpenGL.glFogf(2915, super.field6097);
            OpenGL.glFogf(2916, super.field6113);
            var2 = super.field6147;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = super.field6162;
        }
        class601.field8908[1] = (float) class37.method245(var2, 65280) / 65280.0F;
        class601.field8908[0] = (float) class37.method245(16711680, var2) / 1.671168E7F;
        if (arg0 != -2) {
            this.method2620(5);
        }
        class601.field8908[2] = (float) class37.method245(var2, 255) / 255.0F;
        OpenGL.glFogfv(2918, class601.field8908, 0);
    }

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "(I)V", line = 911)
    public final void method421(int arg0) {
        ++field8645;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(Z)V", line = 920)
    public final void method2609(boolean arg0) {
        OpenGL.glMatrixMode(5890);
        ++field8680;
        if (super.field6137[super.field6099] == class636.field9304) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(super.field6103[super.field6099].method368(class5.field46, -16365), 0);
        }
        OpenGL.glMatrixMode(5888);
        if (arg0) {
            this.field8714 = true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "(I)V", line = 939)
    public final void method2665(int arg0) {
        ++field8654;
        for (int var2 = super.field6128 + -1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(33984 - -var2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
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
        for (int var4 = 0; ~var4 > -9; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field8637.setSwapInterval(0);
        super.method2665(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;", line = 991)
    public static final String[] method3490(char arg0, int arg1, String arg2) {
        ++field8623;
        int var3 = class355.method2142((byte) -100, arg0, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 2 % ((36 - arg1) / 47);
        int var7 = 0;
        for (int var8 = 0; ~var8 > ~var3; ++var8) {
            int var9;
            for (var9 = var7; arg2.charAt(var9) != arg0; ++var9) {
            }
            var4[var5++] = arg2.substring(var7, var9);
            var7 = var9 + 1;
        }
        var4[var3] = arg2.substring(var7);
        return var4;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(Z)V", line = 1025)
    public final void method2570(boolean arg0) {
        ++field8621;
        if (arg0) {
            method3490((char) 65408, 64, (String) null);
        }
        if (!super.field6155) {
            OpenGL.glDisable(3042);
        } else {
            OpenGL.glEnable(3042);
        }
    }

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "()V", line = 1043)
    public final void method436() {
        ++field8642;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)Lql;", line = 1050)
    public final class628 method2627(boolean arg0, int arg1) {
        ++field8644;
        if (arg1 != -30125) {
            this.field8706 = false;
        }
        return new class568(this, arg0);
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(II)Lgl;", line = 1066)
    public final class516 method2648(int arg0, int arg1) {
        ++field8650;
        if (arg1 != 0) {
            this.method2592((byte) 11);
        }
        if (arg0 != 3) {
            return ~arg0 == -5 ? new class459(this, super.field6066, super.field6016) : super.method2648(arg0, arg1);
        } else {
            return new class388(this, super.field6066);
        }
    }

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "(Z)V", line = 1107)
    public final void method2647(boolean arg0) {
        class601.field8908[3] = 1.0F;
        class601.field8908[0] = super.field6190 * super.field6176;
        if (arg0) {
            this.field8689 = null;
        }
        class601.field8908[1] = super.field6190 * super.field6165;
        ++field8651;
        class601.field8908[2] = super.field6190 * super.field6107;
        OpenGL.glLightModelfv(2899, class601.field8908, 0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqba;Lqba;FLqba;)Lqba;", line = 1122)
    public final class345 method439(class345 arg0, class345 arg1, float arg2, class345 arg3) {
        ++field8634;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ[[I)Lwv;", line = 1132)
    public final class31 method2690(int arg0, int arg1, boolean arg2, int[][] arg3) {
        ++field8639;
        return arg0 != -1 ? null : new class368(this, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V", line = 1143)
    public final void method449(boolean arg0) {
        ++field8653;
    }

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "(I)V", line = 1151)
    public final void method2683(int arg0) {
        if (arg0 != 0) {
            this.method2648(83, -91);
        }
        this.method3488((byte) -38);
        ++field8687;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIB[FIIZLaq;)Ljb;", line = 1163)
    public final class422 method2575(int arg0, int arg1, byte arg2, float[] arg3, int arg4, int arg5, boolean arg6, class141 arg7) {
        if (arg2 >= -90) {
            this.method2568((class141) null, 79, -75, -57, -70, (byte[]) null);
        }
        ++field8612;
        if (!this.field8706 && (!class452.method2749(arg5, false) || !class452.method2749(arg4, false))) {
            if (!this.field8714) {
                class260 var9 = new class260(this, arg7, class194.field2878, class322.method1938(arg5, 99), class322.method1938(arg4, 122));
                var9.method1656(arg0, 0, arg1, arg7, false, 0, arg3, arg5, arg4);
                return var9;
            } else {
                return new class393(this, arg7, arg5, arg4, arg3, arg1, arg0);
            }
        } else {
            return new class260(this, arg7, arg5, arg4, arg6, arg3, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V", line = 1191)
    public final void method2668(byte arg0, Object arg1, Canvas arg2) {
        ++field8625;
        Long var4 = (Long) arg1;
        if (!this.field8637.setSurface(var4)) {
            throw new RuntimeException();
        } else if (arg0 >= -7) {
            this.field8703 = -97L;
        }
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "(B)V", line = 1210)
    public final void method2602(byte arg0) {
        ++field8671;
        OpenGL.glLightfv(16384, 4611, super.field6134, 0);
        int var2 = -80 % ((arg0 - 35) / 42);
        OpenGL.glLightfv(16385, 4611, super.field6123, 0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 1221)
    public final void method2676(byte arg0, Canvas arg1, Object arg2) {
        ++field8673;
        Long var4 = (Long) arg2;
        this.field8637.releaseSurface(arg1, var4);
        if (arg0 >= -94) {
            this.field8714 = false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([BLaq;ZIIIIZ)Ljb;", line = 1234)
    public final class422 method2641(byte[] arg0, class141 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (!arg7) {
            this.method501();
        }
        ++field8691;
        if (this.field8706 || class452.method2749(arg6, !arg7) && class452.method2749(arg4, false)) {
            return new class260(this, arg1, arg6, arg4, arg2, arg0, arg3, arg5);
        } else if (this.field8714) {
            return new class393(this, arg1, arg6, arg4, arg0, arg3, arg5);
        } else {
            class260 var9 = new class260(this, arg1, class194.field2874, class322.method1938(arg6, 65), class322.method1938(arg4, 72));
            var9.method1647(arg4, arg3, arg0, 0, 0, arg5, arg1, arg6, (byte) 107);
            return var9;
        }
    }

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "(B)V", line = 1262)
    public final void method2654(byte arg0) {
        ++field8657;
        if (arg0 != 104) {
            this.method2636(30);
        }
        OpenGL.glTexEnvi(8960, 34161, class22.method137(super.field6174[super.field6099], (byte) 74));
    }

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "(Z)V", line = 1274)
    public final void method2681(boolean arg0) {
        if (super.field6142) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
        if (arg0) {
            field8699 = null;
        }
        ++field8681;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V", line = 1290)
    public final void method506(int arg0, int arg1, int arg2, int arg3) {
        ++field8620;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)F", line = 1303)
    public final float method2580(byte arg0) {
        ++field8659;
        if (arg0 < 92) {
            this.field8715 = null;
        }
        return 0.0F;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V", line = 1314)
    public final void method2604(Canvas arg0, boolean arg1, Object arg2) {
        ++field8647;
        Long var4 = (Long) arg2;
        this.field8637.surfaceResized(var4);
        if (arg1) {
            this.method2602((byte) -26);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIBZLhm;)V", line = 1328)
    public final void method2612(boolean arg0, int arg1, byte arg2, boolean arg3, class188 arg4) {
        ++field8649;
        OpenGL.glTexEnvi(8960, arg1 + 34176, class2.method2(arg4, (byte) 35));
        if (arg2 == 64) {
            if (!arg0) {
                OpenGL.glTexEnvi(8960, arg1 + 34192, arg3 ? 769 : 768);
            } else {
                OpenGL.glTexEnvi(8960, arg1 + 34192, arg3 ? 771 : 770);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V", line = 1345)
    public final synchronized void method3491(byte arg0, int arg1, int arg2) {
        ++field8678;
        class556 var4 = new class556(arg1);
        var4.field5651 = (long) arg2;
        if (arg0 != 100) {
            this.field8710 = null;
        }
        this.field8695.method131(var4, 0);
    }

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "(I)V", line = 1359)
    public final void method2673(int arg0) {
        if (arg0 != 7) {
            this.method480();
        }
        ++field8656;
        int var2 = this.field8715[super.field6099];
        if (var2 != 0) {
            this.field8715[super.field6099] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Laq;IIII[B)Lvi;", line = 1378)
    public final class462 method2568(class141 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg4 != 0) {
            return null;
        } else {
            ++field8635;
            return new class390(this, arg0, arg2, arg1, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lql;IB)V", line = 1390)
    public final void method2617(class628 arg0, int arg1, byte arg2) {
        if (arg2 >= 100) {
            ++field8694;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 1402)
    public final void method473() {
        super.method473();
        ++field8683;
        if (this.field8637 != null) {
            this.field8637.method3215();
            this.field8637.release();
            this.field8637 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII[IZI)Ljb;", line = 1418)
    public final class422 method2691(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6) {
        ++field8670;
        if (arg6 != 12441) {
            this.method3491((byte) 95, -111, 29);
        }
        if (!this.field8706 && (!class452.method2749(arg2, false) || !class452.method2749(arg0, false))) {
            if (this.field8714) {
                return new class393(this, arg2, arg0, arg4, arg1, arg3);
            } else {
                class260 var8 = new class260(this, class488.field6956, class194.field2874, class322.method1938(arg2, 83), class322.method1938(arg0, 116));
                var8.method1654(arg0, 0, arg3, arg4, arg1, 0, arg2, true);
                return var8;
            }
        } else {
            return new class260(this, arg2, arg0, arg5, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "()Z", line = 1446)
    public final boolean method487() {
        ++field8632;
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IFII[BFIIFILmba;IFF)V", line = 1455)
    public static final void method3492(int arg0, float arg1, int arg2, int arg3, byte[] arg4, float arg5, int arg6, int arg7, float arg8, int arg9, class357 arg10, int arg11, float arg12, float arg13) {
        ++field8618;
        int var14 = arg3 * arg11;
        float[] var15 = new float[var14];
        if (arg9 != 3169) {
            method3490('j', -79, (String) null);
        }
        for (int var16 = 0; arg0 > var16; ++var16) {
            arg10.method2152(var15, arg11, arg8 / (float) arg2, 0, arg6, arg2, arg3, false, arg12 * 127.0F, arg1 / (float) arg11, arg13 / (float) arg3);
            int var19 = arg7;
            for (int var20 = 0; ~var20 > ~var14; ++var20) {
                arg4[var19] = (byte) ((int) ((float) arg4[var19] + var15[var20]));
                ++var19;
            }
            arg13 *= 2.0F;
            arg8 *= 2.0F;
            arg1 *= 2.0F;
            arg12 = arg5 * arg12;
        }
        int var17 = arg7;
        for (int var18 = 0; var14 > var18; ++var18) {
            arg4[var17] -= -127;
            ++var17;
        }
    }

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "(B)V", line = 1506)
    public final void method2629(byte arg0) {
        OpenGL.glTexEnvi(8960, 34162, class22.method137(super.field6197[super.field6099], (byte) -59));
        ++field8643;
        if (arg0 <= 20) {
            this.field8706 = false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()V", line = 1517)
    public final void method504() {
        OpenGL.glFinish();
        ++field8685;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V", line = 1527)
    public final synchronized void method3493(int arg0, int arg1, int arg2) {
        ++field8658;
        class556 var4 = new class556(arg0);
        var4.field5651 = (long) arg1;
        this.field8692.method131(var4, 0);
        if (arg2 != 1) {
            this.field8637 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "(Z)V", line = 1544)
    public static void method3494(boolean arg0) {
        field8699 = null;
        field8693 = null;
        field8648 = null;
        if (arg0) {
            method3490((char) 65462, -10, (String) null);
        }
    }

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "(I)V", line = 1561)
    public final void method2687(int arg0) {
        ++field8674;
        if (class44.field518 != super.field6182) {
            if (class341.field4715 != super.field6182) {
                if (class526.field7530 == super.field6182) {
                    OpenGL.glBlendFunc(774, 1);
                }
            } else {
                OpenGL.glBlendFunc(1, 1);
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
        if (arg0 != 0) {
            this.field8709 = false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLee;)V", line = 1582)
    public final void method2651(byte arg0, class582 arg1) {
        ++field8682;
        if (arg0 == -106) {
            if (class209.field3093 == arg1) {
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
            } else {
                int var3 = class556.method3357(arg1, false);
                OpenGL.glTexGeni(8192, 9472, var3);
                OpenGL.glEnable(3168);
                OpenGL.glTexGeni(8193, 9472, var3);
                OpenGL.glEnable(3169);
                OpenGL.glTexGeni(8194, 9472, var3);
                OpenGL.glEnable(3170);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILui;ILaq;)Ljb;", line = 1611)
    public final class422 method2695(int arg0, int arg1, class194 arg2, int arg3, class141 arg4) {
        ++field8664;
        if (arg3 != 0) {
            this.method2567(-99, -83);
        }
        if (!this.field8706 && (!class452.method2749(arg1, false) || !class452.method2749(arg0, false))) {
            return this.field8714 ? new class393(this, arg4, arg2, arg1, arg0) : new class260(this, arg4, arg2, class322.method1938(arg1, 38), class322.method1938(arg0, arg3 + 75));
        } else {
            return new class260(this, arg4, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "(I)V", line = 1647)
    public final void method2659(int arg0) {
        if (arg0 != -25172) {
            this.method2568((class141) null, -59, 63, -25, -114, (byte[]) null);
        }
        OpenGL.glDepthMask(super.field6194 && super.field6173);
        ++field8686;
    }

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "()Lcr;", line = 1658)
    public final class493 method480() {
        ++field8660;
        int var1 = -1;
        if (~this.field8710.indexOf("nvidia") == 0) {
            if (~this.field8710.indexOf("intel") == 0) {
                if (~this.field8710.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class493(var1, "OpenGL", this.field8705, this.field8712, 0L);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZILhm;)V", line = 1682)
    public final void method2581(int arg0, boolean arg1, int arg2, class188 arg3) {
        ++field8672;
        OpenGL.glTexEnvi(8960, arg0 + 34184, class2.method2(arg3, (byte) 35));
        OpenGL.glTexEnvi(8960, 34200 - -arg0, !arg1 ? 770 : 771);
        if (arg2 != 0) {
            this.method2593((byte) -88);
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(B)V", line = 1695)
    public final void method2593(byte arg0) {
        ++field8696;
        OpenGL.glScissor(super.field6192 + super.field6150, super.field6132 - -super.field5975 - super.field6172, super.field6183 - super.field6150, super.field6172 - super.field6152);
        if (arg0 < 12) {
            this.field8706 = true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILaq;Lui;)Z", line = 1711)
    public final boolean method2583(int arg0, class141 arg1, class194 arg2) {
        ++field8676;
        return arg0 != 0 ? true : true;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(ZB)V", line = 1722)
    public final void method2573(boolean arg0, byte arg1) {
        if (arg1 <= -57) {
            ++field8640;
            if (arg0) {
                OpenGL.glEnable(32925);
            } else {
                OpenGL.glDisable(32925);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLui;Laq;)Z", line = 1742)
    public final boolean method2633(byte arg0, class194 arg1, class141 arg2) {
        if (arg0 < 123) {
            return true;
        } else {
            ++field8690;
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(B)V", line = 1756)
    public final void method2592(byte arg0) {
        ++field8661;
        if (super.field6122) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        if (arg0 <= 62) {
            this.field8697 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "(B)V", line = 1773)
    public final void method2605(byte arg0) {
        OpenGL.glActiveTexture(super.field6099 + 33984);
        ++field8619;
        if (arg0 != -36) {
            this.field8710 = null;
        }
    }
}
