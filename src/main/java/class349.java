import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class349 extends class393 {

    @OriginalMember(owner = "client!dda", name = "zg", descriptor = "Loe;")
    private class183 field4565 = new class183();

    @OriginalMember(owner = "client!dda", name = "ai", descriptor = "Loe;")
    private class183 field4644 = new class183();

    @OriginalMember(owner = "client!dda", name = "bi", descriptor = "Loe;")
    private class183 field4645 = new class183();

    @OriginalMember(owner = "client!dda", name = "ci", descriptor = "Loe;")
    private class183 field4646 = new class183();

    @OriginalMember(owner = "client!dda", name = "di", descriptor = "Loe;")
    private class183 field4647 = new class183();

    @OriginalMember(owner = "client!dda", name = "ei", descriptor = "Loe;")
    private class183 field4648 = new class183();

    @OriginalMember(owner = "client!dda", name = "fi", descriptor = "Loe;")
    private class183 field4649 = new class183();

    @OriginalMember(owner = "client!dda", name = "hi", descriptor = "[Ljga;")
    private class665[] field4651 = new class665[16];

    @OriginalMember(owner = "client!dda", name = "oi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field4658 = new MapBuffer();

    @OriginalMember(owner = "client!dda", name = "pi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field4659 = new MapBuffer();

    @OriginalMember(owner = "client!dda", name = "Bi", descriptor = "I")
    private int field4671 = 0;

    @OriginalMember(owner = "client!dda", name = "jh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4601;

    @OriginalMember(owner = "client!dda", name = "qi", descriptor = "Ljava/lang/String;")
    private String field4660;

    @OriginalMember(owner = "client!dda", name = "ui", descriptor = "Ljava/lang/String;")
    private String field4664;

    @OriginalMember(owner = "client!dda", name = "si", descriptor = "I")
    private int field4662;

    @OriginalMember(owner = "client!dda", name = "zi", descriptor = "Z")
    public boolean field4669;

    @OriginalMember(owner = "client!dda", name = "ti", descriptor = "Z")
    private boolean field4663;

    @OriginalMember(owner = "client!dda", name = "vi", descriptor = "Z")
    private boolean field4665;

    @OriginalMember(owner = "client!dda", name = "ri", descriptor = "Z")
    public boolean field4661;

    @OriginalMember(owner = "client!dda", name = "yi", descriptor = "Z")
    public boolean field4668;

    @OriginalMember(owner = "client!dda", name = "xi", descriptor = "Z")
    public boolean field4667;

    @OriginalMember(owner = "client!dda", name = "Ai", descriptor = "[I")
    public int[] field4670;

    @OriginalMember(owner = "client!dda", name = "wi", descriptor = "I")
    public int field4666;

    @OriginalMember(owner = "client!dda", name = "Vg", descriptor = "Loe;")
    public static class183 field4587 = new class183();

    @OriginalMember(owner = "client!dda", name = "Yh", descriptor = "[Lga;")
    public static class370[] field4642 = new class370[4];

    @OriginalMember(owner = "client!dda", name = "ug", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!dda", name = "vg", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!dda", name = "wg", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!dda", name = "xg", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!dda", name = "yg", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!dda", name = "Ag", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!dda", name = "Bg", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!dda", name = "Cg", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!dda", name = "Dg", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!dda", name = "Eg", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!dda", name = "Fg", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!dda", name = "Gg", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!dda", name = "Hg", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!dda", name = "Ig", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!dda", name = "Jg", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!dda", name = "Kg", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!dda", name = "Lg", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!dda", name = "Mg", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!dda", name = "Ng", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!dda", name = "Og", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!dda", name = "Pg", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!dda", name = "Qg", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!dda", name = "Rg", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!dda", name = "Sg", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!dda", name = "Tg", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!dda", name = "Ug", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!dda", name = "Wg", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!dda", name = "Xg", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!dda", name = "Yg", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!dda", name = "Zg", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!dda", name = "ah", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!dda", name = "bh", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!dda", name = "ch", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!dda", name = "dh", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!dda", name = "eh", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!dda", name = "fh", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!dda", name = "gh", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!dda", name = "hh", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!dda", name = "ih", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!dda", name = "kh", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!dda", name = "lh", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!dda", name = "mh", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!dda", name = "nh", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!dda", name = "oh", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!dda", name = "ph", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!dda", name = "qh", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!dda", name = "rh", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!dda", name = "sh", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!dda", name = "th", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!dda", name = "uh", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!dda", name = "vh", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!dda", name = "wh", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!dda", name = "xh", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!dda", name = "yh", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!dda", name = "zh", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!dda", name = "Ah", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!dda", name = "Bh", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!dda", name = "Ch", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!dda", name = "Dh", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!dda", name = "Eh", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!dda", name = "Fh", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!dda", name = "Gh", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!dda", name = "Hh", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!dda", name = "Ih", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!dda", name = "Jh", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!dda", name = "Kh", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!dda", name = "Lh", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!dda", name = "Mh", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!dda", name = "Nh", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!dda", name = "Oh", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!dda", name = "Ph", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!dda", name = "Qh", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!dda", name = "Rh", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!dda", name = "Sh", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!dda", name = "Th", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!dda", name = "Uh", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!dda", name = "Vh", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!dda", name = "Wh", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!dda", name = "Xh", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!dda", name = "Zh", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!dda", name = "mi", descriptor = "I")
    private int field4656;

    @OriginalMember(owner = "client!dda", name = "ni", descriptor = "J")
    private long field4657;

    @OriginalMember(owner = "client!dda", name = "gi", descriptor = "Z")
    private boolean field4650;

    @OriginalMember(owner = "client!dda", name = "ii", descriptor = "Z")
    private boolean field4652;

    @OriginalMember(owner = "client!dda", name = "ji", descriptor = "Z")
    private boolean field4653;

    @OriginalMember(owner = "client!dda", name = "ki", descriptor = "Z")
    private boolean field4654;

    @OriginalMember(owner = "client!dda", name = "li", descriptor = "Z")
    private boolean field4655;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(IZ)V", line = 3)
    public final void method486(int arg0, boolean arg1) {
        ++field4622;
        if (arg0 == 3) {
            if (arg1) {
                OpenGL.glEnable(32925);
            } else {
                OpenGL.glDisable(32925);
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(IIII)[I", line = 18)
    public final int[] method325(int arg0, int arg1, int arg2, int arg3) {
        ++field4568;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, super.field5291 - (arg1 + var6) - 1, arg2, 1, 32993, this.field4666, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLfa;Ljn;I)V", line = 38)
    public class349(OpenGL arg0, Canvas arg1, long arg2, class212 arg3, class668 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field4601 = arg0;
            this.field4601.method3370();
            this.field4660 = OpenGL.glGetString(7936).toLowerCase();
            this.field4664 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field4660.indexOf("microsoft") == -1 && this.field4660.indexOf("brian paul") == -1 && this.field4660.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class72.method637(' ', false, var8.replace('.', ' '));
                if (~var9.length > -3) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class79.method663(10, var9[0]);
                        int var11 = class79.method663(10, var9[1]);
                        this.field4662 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field4662 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field4601.method3369("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field4601.method3369("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field5499 = var12[0];
                        if (super.field5499 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field5516 = 8;
                            this.field4669 = this.field4601.method3369("GL_ARB_vertex_buffer_object");
                            super.field5509 = this.field4601.method3369("GL_ARB_multisample");
                            this.field4663 = this.field4601.method3369("GL_ARB_texture_rectangle");
                            super.field5526 = this.field4601.method3369("GL_ARB_texture_cube_map");
                            this.field4665 = this.field4601.method3369("GL_ARB_texture_non_power_of_two");
                            super.field5486 = this.field4601.method3369("GL_EXT_texture3D");
                            this.field4661 = this.field4601.method3369("GL_ARB_vertex_shader");
                            this.field4668 = this.field4601.method3369("GL_ARB_vertex_program");
                            this.field4667 = this.field4601.method3369("GL_ARB_fragment_shader");
                            this.field4601.method3369("GL_ARB_fragment_program");
                            this.field4670 = new int[super.field5499];
                            this.field4666 = !Stream.method3579() ? 5121 : 33639;
                            if (~this.field4664.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class72.method637(' ', false, this.field4664.replace('/', ' '));
                                for (int var17 = 0; var17 < var16.length; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (var18.charAt(0) == 'x' && ~var18.length() <= -4 && class529.method3110((byte) -113, var18.substring(1, 3))) {
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
                                                if (var18.length() >= 4 && class529.method3110((byte) -90, var18.substring(0, 4))) {
                                                    var13 = class79.method663(10, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && var13 <= 7999) {
                                        this.field4669 = false;
                                    }
                                    if (~var13 <= -7001 && var13 <= 9250) {
                                        super.field5486 = false;
                                    }
                                }
                                this.field4663 &= this.field4601.method3369("GL_ARB_half_float_pixel");
                            }
                            this.field4660.indexOf("intel");
                            if (this.field4669) {
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
            this.method286();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lfj;I)V", line = 197)
    public final void method480(class607 arg0, int arg1) {
        ++field4595;
        int var3 = -111 / ((arg1 - -12) / 52);
        class253[] var4 = ((class571) arg0).field8340;
        int var5 = 0;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        for (int var9 = 0; var9 < var4.length; ++var9) {
            class253 var12 = var4[var9];
            class665 var13 = this.field4651[var9];
            int var14 = 0;
            int var15 = var13.method3757((byte) -86);
            long var16 = var13.method2171(15457);
            var13.method2166(-38);
            for (int var18 = 0; var12.method1547((byte) 24) > var18; ++var18) {
                class397 var19 = var12.method1550(var18, (byte) 62);
                if (class397.field5604 == var19) {
                    var8 = true;
                    OpenGL.glVertexPointer(3, 5126, var15, (long) var14 + var16);
                } else if (class397.field5611 != var19) {
                    if (class397.field5612 == var19) {
                        OpenGL.glColorPointer(4, 5121, var15, (long) var14 + var16);
                        var6 = true;
                    } else if (class397.field5613 == var19) {
                        OpenGL.glClientActiveTexture(33984 + var5++);
                        OpenGL.glTexCoordPointer(1, 5126, var15, (long) var14 + var16);
                    } else if (class397.field5614 == var19) {
                        OpenGL.glClientActiveTexture(var5++ + 33984);
                        OpenGL.glTexCoordPointer(2, 5126, var15, (long) var14 + var16);
                    } else if (class397.field5615 == var19) {
                        OpenGL.glClientActiveTexture(33984 - -(var5++));
                        OpenGL.glTexCoordPointer(3, 5126, var15, var16 - -((long) var14));
                    } else if (class397.field5616 == var19) {
                        OpenGL.glClientActiveTexture(33984 + var5++);
                        OpenGL.glTexCoordPointer(4, 5126, var15, (long) var14 + var16);
                    }
                } else {
                    OpenGL.glNormalPointer(5126, var15, (long) var14 + var16);
                    var7 = true;
                }
                var14 += var19.field5602;
            }
        }
        if (this.field4653 != var8) {
            if (var8) {
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            this.field4653 = var8;
        }
        if (!this.field4652 == var7) {
            if (var7) {
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            this.field4652 = var7;
        }
        if (var6 == !this.field4650) {
            if (var6) {
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            this.field4650 = var6;
        }
        if (this.field4656 >= var5) {
            if (this.field4656 > var5) {
                for (int var10 = var5; ~var10 > ~this.field4656; ++var10) {
                    OpenGL.glClientActiveTexture(var10 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field4656 = var5;
                return;
            }
        } else {
            for (int var11 = this.field4656; ~var5 < ~var11; ++var11) {
                OpenGL.glClientActiveTexture(33984 - -var11);
                OpenGL.glEnableClientState(32888);
            }
            this.field4656 = var5;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILel;)V", line = 359)
    public final void method493(int arg0, int arg1, class508 arg2) {
        if (arg0 != 0) {
            this.method466((byte) 52);
        }
        this.field4651[arg1] = (class665) arg2;
        ++field4561;
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "()Lik;", line = 372)
    public final class191 method314() {
        ++field4583;
        int var1 = -1;
        if (~this.field4660.indexOf("nvidia") == 0) {
            if (~this.field4660.indexOf("intel") == 0) {
                if (~this.field4660.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class191(var1, "OpenGL", this.field4662, this.field4664, 0L);
    }

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "(B)V", line = 394)
    public final void method469(byte arg0) {
        if (arg0 != -40) {
            this.method502(true);
        }
        ++field4616;
        this.method1987(arg0 + 41);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIILqf;)V", line = 405)
    public final void method508(int arg0, int arg1, int arg2, class632 arg3) {
        ++field4600;
        byte var5;
        int var6;
        if (class589.field8536 == arg3) {
            var5 = 1;
            var6 = arg1 * 2;
        } else if (class208.field2539 == arg3) {
            var6 = arg1 + 1;
            var5 = 3;
        } else if (class73.field1094 == arg3) {
            var5 = 4;
            var6 = arg1 * 3;
        } else if (class290.field3934 != arg3) {
            if (class231.field3003 != arg3) {
                var6 = arg1;
                var5 = 0;
            } else {
                var6 = arg1 - -2;
                var5 = 5;
            }
        } else {
            var6 = arg1 + 2;
            var5 = 6;
        }
        if (arg0 != 0) {
            this.method299();
        }
        OpenGL.glDrawArrays(var5, arg2, var6);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZIILfca;[BIZI)Lco;", line = 458)
    public final class103 method477(boolean arg0, int arg1, int arg2, class75 arg3, byte[] arg4, int arg5, boolean arg6, int arg7) {
        if (!arg6) {
            this.method476(false);
        }
        ++field4634;
        if (!this.field4665 && (!class326.method1894(arg1, 32) || !class326.method1894(arg5, 32))) {
            if (this.field4663) {
                return new class362(this, arg3, arg1, arg5, arg4, arg7, arg2);
            } else {
                class427 var9 = new class427(this, arg3, class279.field3793, class698.method3915(arg1, (byte) 93), class698.method3915(arg5, (byte) 93));
                var9.method762(false, 0, arg2, arg5, arg1, 0, arg7, arg3, arg4);
                return var9;
            }
        } else {
            return new class427(this, arg3, arg1, arg5, arg0, arg4, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(FFF)V", line = 486)
    public final void method255(float arg0, float arg1, float arg2) {
        ++field4620;
    }

    @OriginalMember(owner = "client!dda", name = "u", descriptor = "(I)V", line = 495)
    public final void method494(int arg0) {
        class656.field9322[3] = 1.0F;
        class656.field9322[2] = super.field5507 * super.field5481;
        ++field4636;
        if (arg0 != 8) {
            this.method313((class275) null, (class275) null, 0.047551338F, (class275) null);
        }
        class656.field9322[0] = super.field5507 * super.field5446;
        class656.field9322[1] = super.field5512 * super.field5507;
        OpenGL.glLightfv(16384, 4609, class656.field9322, 0);
        class656.field9322[3] = 1.0F;
        class656.field9322[0] = -super.field5462 * super.field5446;
        class656.field9322[1] = -super.field5462 * super.field5512;
        class656.field9322[2] = -super.field5462 * super.field5481;
        OpenGL.glLightfv(16385, 4609, class656.field9322, 0);
    }

    @OriginalMember(owner = "client!dda", name = "x", descriptor = "()V", line = 518)
    public final void method286() {
        ++field4577;
        super.method286();
        if (this.field4601 != null) {
            this.field4601.method3371();
            this.field4601.release();
            this.field4601 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "I", descriptor = "(I)V", line = 533)
    public final void method509(int arg0) {
        if (arg0 >= -62) {
            this.field4656 = 87;
        }
        if (class328.field4373 == super.field5511) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class56.field892 != super.field5511) {
            if (class115.field1497 == super.field5511) {
                OpenGL.glBlendFunc(774, 1);
            }
        } else {
            OpenGL.glBlendFunc(1, 1);
        }
        ++field4573;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(IIII)I", line = 556)
    public static final int method1985(int arg0, int arg1, int arg2, int arg3) {
        ++field4635;
        if ((class73.field1104[arg3][arg0][arg1] & 8) != 0) {
            return 0;
        } else {
            return ~arg3 < arg2 && ~(class73.field1104[1][arg0][arg1] & 2) != -1 ? arg3 + -1 : arg3;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 570)
    public final void method240(Rectangle[] arg0, int arg1) throws class365 {
        this.method293();
        ++field4598;
    }

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "()V", line = 579)
    public final void method321() {
        ++field4610;
    }

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "()Z", line = 586)
    public final boolean method299() {
        ++field4586;
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "z", descriptor = "(I)V", line = 595)
    public final void method506(int arg0) {
        if (arg0 > 24) {
            ++field4619;
            OpenGL.glTexEnvi(8960, 34162, class484.method2829(super.field5508[super.field5484], 7681));
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IBI)V", line = 606)
    public final synchronized void method1986(int arg0, byte arg1, int arg2) {
        if (arg1 != -94) {
            this.field4650 = false;
        }
        ++field4605;
        class556 var4 = new class556(arg2);
        var4.field7519 = (long) arg0;
        this.field4644.method1129(var4, 262144);
    }

    @OriginalMember(owner = "client!dda", name = "S", descriptor = "(I)V", line = 622)
    private final void method1987(int arg0) {
        ++field4617;
        if (this.field4655) {
            OpenGL.glPopMatrix();
        }
        if (!super.field5503.method638((byte) -128)) {
            if (super.field5430) {
                OpenGL.glLoadIdentity();
                this.field4655 = false;
            } else {
                OpenGL.glLoadMatrixf(super.field5422.method3703(3, class467.field6528), 0);
                this.field4655 = false;
            }
        } else {
            if (!this.field4654) {
                OpenGL.glLoadMatrixf(super.field5434.method3703(3, class467.field6528), 0);
                this.field4654 = true;
                this.method499((byte) -108);
                this.method474((byte) 50);
            }
            if (super.field5430) {
                this.field4655 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field5422.method3703(3, class467.field6528), 0);
                this.field4655 = true;
            }
        }
        if (arg0 != 1) {
            this.method515(0, (Canvas) null, (Object) null);
        }
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(II)V", line = 670)
    public final synchronized void method1988(int arg0, int arg1) {
        ++field4584;
        class513 var3 = new class513();
        var3.field7519 = (long) arg1;
        this.field4648.method1129(var3, 262144);
        if (arg0 <= 66) {
            this.field4661 = false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;", line = 687)
    public final Object method522(int arg0, Canvas arg1) {
        ++field4596;
        int var3 = 72 % ((38 - arg0) / 44);
        long var4 = this.field4601.prepareSurface(arg1);
        if (~var4 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var4);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZLuf;Z)V", line = 704)
    public final void method482(int arg0, boolean arg1, class414 arg2, boolean arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34184, class40.method456((byte) 118, arg2));
        ++field4579;
        OpenGL.glTexEnvi(8960, arg0 + 34200, !arg3 ? 770 : 771);
        if (!arg1) {
            this.field4649 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "B", descriptor = "(B)V", line = 716)
    public final void method474(byte arg0) {
        ++field4564;
        this.method2323(123);
        int var2;
        for (var2 = 0; ~var2 > ~super.field5489; ++var2) {
            class530 var3 = super.field5530[var2];
            int var4 = var3.method3120(true);
            int var5 = var2 + 16386;
            float var6 = var3.method3117(false) / 255.0F;
            class656.field9322[0] = (float) var3.method3118(34037);
            class656.field9322[1] = (float) var3.method3119(3553);
            class656.field9322[2] = (float) var3.method3115(-30190);
            class656.field9322[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class656.field9322, 0);
            class656.field9322[1] = var6 * (float) (class435.method2605(65414, var4) >> 8);
            class656.field9322[0] = (float) class435.method2605(255, var4 >> 16) * var6;
            class656.field9322[3] = 1.0F;
            class656.field9322[2] = var6 * (float) class435.method2605(var4, 255);
            OpenGL.glLightfv(var5, 4609, class656.field9322, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method3122(-11184) * var3.method3122(-11184)));
            OpenGL.glEnable(var5);
        }
        while (~var2 > ~super.field5494) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method474(arg0);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZIILuf;Z)V", line = 760)
    public final void method512(boolean arg0, int arg1, int arg2, class414 arg3, boolean arg4) {
        ++field4623;
        OpenGL.glTexEnvi(8960, arg1 + 34176, class40.method456((byte) 127, arg3));
        if (!arg0) {
            OpenGL.glTexEnvi(8960, arg1 + 34192, !arg4 ? 768 : 769);
        } else {
            OpenGL.glTexEnvi(8960, arg1 + 34192, !arg4 ? 770 : 771);
        }
        if (arg2 != 9494) {
            this.field4649 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "ja", descriptor = "(I)V", line = 776)
    public final void method323(int arg0) {
        ++field4607;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!dda", name = "H", descriptor = "(I)F", line = 787)
    public final float method514(int arg0) {
        if (arg0 != 1) {
            this.method478((byte) 11);
        }
        ++field4599;
        return 0.0F;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 798)
    public final void method515(int arg0, Canvas arg1, Object arg2) {
        ++field4590;
        if (arg0 != 14) {
            this.field4601 = null;
        }
        Long var4 = (Long) arg2;
        if (!this.field4601.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dda", name = "q", descriptor = "()V", line = 816)
    public final void method293() throws class365 {
        this.field4601.swapBuffers();
        ++field4627;
    }

    @OriginalMember(owner = "client!dda", name = "r", descriptor = "()Z", line = 826)
    public final boolean method237() {
        ++field4575;
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "B", descriptor = "()V", line = 834)
    public final void method250() {
        ++field4615;
    }

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "(I)V", line = 844)
    public final void method489(int arg0) {
        if (arg0 == 2) {
            if (super.field5523) {
                OpenGL.glEnable(3042);
            } else {
                OpenGL.glDisable(3042);
            }
            ++field4628;
        }
    }

    @OriginalMember(owner = "client!dda", name = "w", descriptor = "(B)V", line = 861)
    public final void method495(byte arg0) {
        ++field4639;
        super.field5468 = (float) (super.field5535 - super.field5480);
        super.field5488 = super.field5468 - (float) super.field5449;
        if ((float) super.field5506 > super.field5488) {
            super.field5488 = (float) super.field5506;
        }
        OpenGL.glFogf(2915, super.field5488);
        OpenGL.glFogf(2916, super.field5468);
        class656.field9322[2] = (float) class435.method2605(255, super.field5471) / 255.0F;
        class656.field9322[1] = (float) class435.method2605(65280, super.field5471) / 65280.0F;
        if (arg0 != 51) {
            this.field4651 = null;
        }
        class656.field9322[0] = (float) class435.method2605(16711680, super.field5471) / 1.671168E7F;
        OpenGL.glFogfv(2918, class656.field9322, 0);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lfca;III[FIIZ)Lco;", line = 887)
    public final class103 method511(class75 arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, boolean arg7) {
        if (arg1 != 0) {
            this.method481((class75) null, true, (class279) null);
        }
        ++field4638;
        if (!this.field4665 && (!class326.method1894(arg2, 32) || !class326.method1894(arg3, 32))) {
            if (this.field4663) {
                return new class362(this, arg0, arg2, arg3, arg4, arg6, arg5);
            } else {
                class427 var9 = new class427(this, arg0, class279.field3797, class698.method3915(arg2, (byte) 93), class698.method3915(arg3, (byte) 93));
                var9.method2571(arg4, false, arg6, 0, 0, arg5, arg2, arg0, arg3);
                return var9;
            }
        } else {
            return new class427(this, arg0, arg2, arg3, arg7, arg4, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(B)V", line = 915)
    public final void method478(byte arg0) {
        ++field4569;
        if (arg0 != 67) {
            method1985(51, -29, 100, -5);
        }
        if (super.field5460 && super.field5453 && super.field5449 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "(I)V", line = 930)
    public final void method519(int arg0) {
        if (super.field5500) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        if (arg0 >= -119) {
            this.method469((byte) -47);
        }
        ++field4643;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZJ)V", line = 948)
    public final synchronized void method1989(boolean arg0, long arg1) {
        if (!arg0) {
            ++field4614;
            class513 var4 = new class513();
            var4.field7519 = arg1;
            this.field4649.method1129(var4, 262144);
        }
    }

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "(Z)V", line = 962)
    public final void method473(boolean arg0) {
        if (!arg0) {
            this.method512(false, 61, -65, (class414) null, true);
        }
        ++field4630;
        this.field4654 = false;
        this.method1987(1);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 976)
    public final synchronized void method263(int arg0) {
        ++field4632;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field4644.method1130((byte) 116)) {
            class556 var12 = (class556) this.field4644.method1137(-1);
            class472.field6579[var3++] = (int) var12.field7519;
            super.field5425 -= var12.field8043;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class472.field6579, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class472.field6579, 0);
            var3 = 0;
        }
        while (!this.field4645.method1130((byte) 60)) {
            class556 var11 = (class556) this.field4645.method1137(-1);
            class472.field6579[var3++] = (int) var11.field7519;
            super.field5426 -= var11.field8043;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class472.field6579, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class472.field6579, 0);
            var3 = 0;
        }
        while (!this.field4646.method1130((byte) 126)) {
            class556 var10 = (class556) this.field4646.method1137(-1);
            class472.field6579[var3++] = var10.field8043;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class472.field6579, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class472.field6579, 0);
            var3 = 0;
        }
        while (!this.field4647.method1130((byte) 111)) {
            class556 var9 = (class556) this.field4647.method1137(-1);
            class472.field6579[var3++] = (int) var9.field7519;
            super.field5428 -= var9.field8043;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class472.field6579, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class472.field6579, 0);
            boolean var4 = false;
        }
        while (!this.field4565.method1130((byte) 101)) {
            class556 var8 = (class556) this.field4565.method1137(-1);
            OpenGL.glDeleteLists((int) var8.field7519, var8.field8043);
        }
        while (!this.field4648.method1130((byte) 79)) {
            class513 var7 = this.field4648.method1137(-1);
            OpenGL.glDeleteProgramARB((int) var7.field7519);
        }
        while (!this.field4649.method1130((byte) 92)) {
            class513 var6 = this.field4649.method1137(-1);
            OpenGL.glDeleteObjectARB(var6.field7519);
        }
        while (!this.field4565.method1130((byte) 84)) {
            class556 var5 = (class556) this.field4565.method1137(-1);
            OpenGL.glDeleteLists((int) var5.field7519, var5.field8043);
        }
        if (this.method214() > 100663296 && ~(this.field4657 + 60000L) > ~class301.method1787((byte) -72)) {
            System.gc();
            this.field4657 = class301.method1787((byte) 113);
        }
        super.method263(var2);
    }

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "(Z)V", line = 1139)
    public final void method502(boolean arg0) {
        if (!arg0) {
            this.field4669 = true;
        }
        ++field4592;
        OpenGL.glActiveTexture(super.field5484 + 33984);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lfca;ILbv;)Z", line = 1151)
    public final boolean method492(class75 arg0, int arg1, class279 arg2) {
        ++field4576;
        return arg1 == 8;
    }

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "()V", line = 1162)
    public final void method283() {
        ++field4629;
        if (super.field5407 > 0 || super.field5291 > 0) {
            int var1 = super.field5527;
            int var2 = super.field5439;
            int var3 = super.field5517;
            int var4 = super.field5510;
            this.method249();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2302(7);
            this.method2321(-32, false);
            this.method2304((byte) -30, false);
            this.method2320(false, -32);
            this.method2306(4345, false);
            this.method2316((byte) 108, (class644) null);
            this.method2322(-107, -2, false, false);
            this.method2362(1, false);
            this.method2353(0, (byte) -121);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field5407, super.field5291, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method292(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V", line = 1207)
    public final void method483(boolean arg0, Object arg1, Canvas arg2) {
        ++field4574;
        Long var4 = (Long) arg1;
        if (arg0) {
            this.field4601.releaseSurface(arg2, var4);
        }
    }

    @OriginalMember(owner = "client!dda", name = "s", descriptor = "(I)V", line = 1220)
    public final void method521(int arg0) {
        if (arg0 <= 8) {
            this.method1989(true, 108L);
        }
        ++field4641;
        OpenGL.glViewport(super.field5455, super.field5472, super.field5407, super.field5291);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B[Lmm;)Lfj;", line = 1231)
    public final class607 method504(byte arg0, class253[] arg1) {
        ++field4597;
        if (arg0 <= 22) {
            this.method283();
        }
        return new class571(arg1);
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(II)Ljfa;", line = 1242)
    public final class262 method479(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method323(-125);
        }
        ++field4580;
        if (~arg0 != -4) {
            if (~arg0 != -5) {
                return ~arg0 == -9 ? new class83(this, super.field5320, super.field5335) : super.method479(arg0, 1);
            } else {
                return new class410(this, super.field5320, super.field5335);
            }
        } else {
            return new class407(this, super.field5320);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V", line = 1285)
    public final synchronized void method1990(int arg0, int arg1, int arg2) {
        if (arg1 >= -50) {
            this.method1988(-105, -6);
        }
        ++field4606;
        class556 var4 = new class556(arg2);
        var4.field7519 = (long) arg0;
        this.field4645.method1129(var4, 262144);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIIIIZI)Lco;", line = 1300)
    public final class103 method525(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field4637;
        if (arg1 != 1) {
            return null;
        } else if (!this.field4665 && (!class326.method1894(arg6, 32) || !class326.method1894(arg3, 32))) {
            if (this.field4663) {
                return new class362(this, arg6, arg3, arg0, arg4, arg2);
            } else {
                class427 var8 = new class427(this, class391.field5229, class279.field3793, class698.method3915(arg6, (byte) 93), class698.method3915(arg3, (byte) 93));
                var8.method763(-28726, arg3, 0, arg6, arg0, 0, arg2, arg4);
                return var8;
            }
        } else {
            return new class427(this, arg6, arg3, arg5, arg0, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILfca;BILbv;)Lco;", line = 1328)
    public final class103 method496(int arg0, class75 arg1, byte arg2, int arg3, class279 arg4) {
        ++field4563;
        if (arg2 != -83) {
            this.method227();
        }
        if (!this.field4665 && (!class326.method1894(arg0, 32) || !class326.method1894(arg3, 32))) {
            return !this.field4663 ? new class427(this, arg1, arg4, class698.method3915(arg0, (byte) 93), class698.method3915(arg3, (byte) 93)) : new class362(this, arg1, arg4, arg0, arg3);
        } else {
            return new class427(this, arg1, arg4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lf;Z)V", line = 1354)
    public final void method241(class701 arg0, boolean arg1) {
        ++field4633;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([BILfca;III)Lck;", line = 1364)
    public final class593 method500(byte[] arg0, int arg1, class75 arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field4613;
            return new class548(this, arg2, arg4, arg3, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "(I)V", line = 1378)
    public final void method485(int arg0) {
        ++field4618;
        class656.field9322[2] = super.field5491 * super.field5481;
        class656.field9322[3] = 1.0F;
        class656.field9322[1] = super.field5512 * super.field5491;
        class656.field9322[0] = super.field5491 * super.field5446;
        if (arg0 >= 34) {
            OpenGL.glLightModelfv(2899, class656.field9322, 0);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILqf;IIILcda;B)V", line = 1394)
    public final void method528(int arg0, class632 arg1, int arg2, int arg3, int arg4, class154 arg5, byte arg6) {
        if (arg6 > 117) {
            ++field4567;
            int var8;
            byte var9;
            if (class589.field8536 != arg1) {
                if (class208.field2539 == arg1) {
                    var8 = arg2 + 1;
                    var9 = 3;
                } else if (class73.field1094 == arg1) {
                    var8 = arg2 * 3;
                    var9 = 4;
                } else if (class290.field3934 != arg1) {
                    if (class231.field3003 == arg1) {
                        var8 = arg2 + 2;
                        var9 = 5;
                    } else {
                        var8 = arg2;
                        var9 = 0;
                    }
                } else {
                    var8 = arg2 + 2;
                    var9 = 6;
                }
            } else {
                var9 = 1;
                var8 = arg2 * 2;
            }
            class279 var10 = arg5.method12(true);
            class359 var11 = (class359) arg5;
            var11.method2166(-118);
            OpenGL.glDrawElements(var9, var8, class533.method3131(-17966, var10), var11.method2171(15457) + (long) (var10.field3788 * arg0));
        }
    }

    @OriginalMember(owner = "client!dda", name = "ya", descriptor = "()V", line = 1451)
    public final void method246() {
        ++field4611;
        this.method2306(4345, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!dda", name = "P", descriptor = "(I)V", line = 1461)
    public final void method468(int arg0) {
        if (arg0 != 13) {
            this.method327();
        }
        ++field4560;
        int var2 = this.field4670[super.field5484];
        if (var2 != 0) {
            this.field4670[super.field5484] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZ[[II)Lgi;", line = 1482)
    public final class629 method470(int arg0, boolean arg1, int[][] arg2, int arg3) {
        if (arg3 != 12482) {
            this.method1987(117);
        }
        ++field4572;
        return new class518(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "(II)V", line = 1495)
    public final void method498(int arg0, int arg1) {
        ++field4604;
        if (arg0 != 1) {
            this.field4671 = -10;
        }
    }

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "()V", line = 1505)
    public final void method227() {
        ++field4603;
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(Z)V", line = 1512)
    public final void method505(boolean arg0) {
        ++field4624;
        if (arg0) {
            this.field4662 = -89;
        }
        OpenGL.glScissor(super.field5527 + super.field5455, super.field5472 - super.field5510 + super.field5291, -super.field5527 + super.field5439, -super.field5517 + super.field5510);
    }

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "(Z)V", line = 1524)
    public final void method467(boolean arg0) {
        ++field4578;
        if (arg0) {
            if (super.field5559) {
                OpenGL.glEnable(3089);
            } else {
                OpenGL.glDisable(3089);
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZI)Lcda;", line = 1539)
    public final class154 method475(boolean arg0, int arg1) {
        if (arg1 != -30974) {
            return null;
        } else {
            ++field4566;
            return new class359(this, class279.field3794, arg0);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lcaa;Lcaa;FLcaa;)Lcaa;", line = 1550)
    public final class275 method313(class275 arg0, class275 arg1, float arg2, class275 arg3) {
        ++field4582;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "(B)V", line = 1558)
    public final void method520(byte arg0) {
        int var2 = 20 / ((30 - arg0) / 60);
        ++field4609;
        if (super.field5473) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lcr;I)V", line = 1572)
    public final void method471(class531 arg0, int arg1) {
        if (class620.field8888 == arg0) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class276.method1671(arg0, (byte) 127);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
        ++field4608;
        if (arg1 > -10) {
            this.field4647 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "T", descriptor = "(I)V", line = 1600)
    public static void method1991(int arg0) {
        field4642 = null;
        if (arg0 != 1171) {
            field4587 = null;
        }
        field4587 = null;
    }

    @OriginalMember(owner = "client!dda", name = "y", descriptor = "()V", line = 1611)
    public final void method328() {
        ++field4631;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(BZ)Lel;", line = 1619)
    public final class508 method516(byte arg0, boolean arg1) {
        ++field4625;
        return arg0 < 50 ? null : new class665(this, arg1);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lfca;ZLbv;)Z", line = 1631)
    public final boolean method481(class75 arg0, boolean arg1, class279 arg2) {
        ++field4626;
        if (arg1) {
            this.method506(-21);
        }
        return true;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)V", line = 1646)
    public final void method254(int arg0, int arg1, int arg2, int arg3) {
        ++field4591;
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)V", line = 1653)
    public final void method499(byte arg0) {
        int var2 = 93 % ((-36 - arg0) / 50);
        ++field4588;
        OpenGL.glLightfv(16384, 4611, super.field5520, 0);
        OpenGL.glLightfv(16385, 4611, super.field5440, 0);
    }

    @OriginalMember(owner = "client!dda", name = "u", descriptor = "(B)V", line = 1672)
    public final void method466(byte arg0) {
        OpenGL.glTexEnvi(8960, 34161, class484.method2829(super.field5456[super.field5484], 7681));
        ++field4602;
        if (arg0 != 122) {
            this.method1988(95, 90);
        }
    }

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "(Z)V", line = 1686)
    public final void method476(boolean arg0) {
        ++field4612;
        if (!arg0) {
            this.method328();
        }
        if (super.field5522 && !super.field5438) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "(Z)V", line = 1706)
    public final void method513(boolean arg0) {
        class656.field9322[3] = (float) (super.field5469 >>> 24) / 255.0F;
        ++field4562;
        if (arg0) {
            this.method522(-101, (Canvas) null);
        }
        class656.field9322[0] = (float) class435.method2605(super.field5469, 16711680) / 1.671168E7F;
        class656.field9322[1] = (float) class435.method2605(super.field5469, 65280) / 65280.0F;
        class656.field9322[2] = (float) class435.method2605(255, super.field5469) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class656.field9322, 0);
    }

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "(B)V", line = 1723)
    public final void method517(byte arg0) {
        if (arg0 != -49) {
            this.method520((byte) -99);
        }
        if (!super.field5537) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        ++field4589;
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(B)V", line = 1744)
    public final void method497(byte arg0) {
        OpenGL.glMatrixMode(5889);
        ++field4570;
        OpenGL.glLoadMatrixf(super.field5452, 0);
        int var2 = 120 / ((7 - arg0) / 41);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 1760)
    public final void method487(int arg0, Canvas arg1, Object arg2) {
        if (arg0 != 8) {
            this.field4663 = true;
        }
        ++field4581;
        Long var4 = (Long) arg2;
        this.field4601.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!dda", name = "DA", descriptor = "()I", line = 1780)
    public final int method327() {
        ++field4593;
        return this.field4671;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V", line = 1792)
    public final void method296(boolean arg0) {
        ++field4621;
    }

    @OriginalMember(owner = "client!dda", name = "y", descriptor = "(I)V", line = 1799)
    public final void method472(int arg0) {
        OpenGL.glDepthMask(super.field5461 && super.field5475);
        ++field4571;
        if (arg0 != -1) {
            this.field4667 = true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "J", descriptor = "(I)V", line = 1811)
    public final void method527(int arg0) {
        ++field4594;
        for (int var2 = super.field5499 + -1; var2 >= 0; --var2) {
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
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field4601.setSwapInterval(0);
        super.method527(arg0);
    }

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "(B)V", line = 1869)
    public final void method524(byte arg0) {
        if (arg0 == -89) {
            ++field4640;
            OpenGL.glMatrixMode(5890);
            if (super.field5447[super.field5484] != class281.field3811) {
                OpenGL.glLoadMatrixf(super.field5450[super.field5484].method3703(3, class467.field6528), 0);
            } else {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!dda", name = "M", descriptor = "(I)V", line = 1904)
    public final void method526(int arg0) {
        if (arg0 == 4939) {
            ++field4585;
        }
    }
}
