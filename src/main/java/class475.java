import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class475 extends class562 {

    @OriginalMember(owner = "client!jq", name = "jh", descriptor = "Lhga;")
    private class158 field6762 = new class158();

    @OriginalMember(owner = "client!jq", name = "di", descriptor = "Lhga;")
    private class158 field6808 = new class158();

    @OriginalMember(owner = "client!jq", name = "hi", descriptor = "Lhga;")
    private class158 field6812 = new class158();

    @OriginalMember(owner = "client!jq", name = "ji", descriptor = "Lhga;")
    private class158 field6814 = new class158();

    @OriginalMember(owner = "client!jq", name = "ki", descriptor = "Lhga;")
    private class158 field6815 = new class158();

    @OriginalMember(owner = "client!jq", name = "li", descriptor = "Lhga;")
    private class158 field6816 = new class158();

    @OriginalMember(owner = "client!jq", name = "mi", descriptor = "Lhga;")
    private class158 field6817 = new class158();

    @OriginalMember(owner = "client!jq", name = "ni", descriptor = "[Lll;")
    private class336[] field6818 = new class336[16];

    @OriginalMember(owner = "client!jq", name = "si", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field6823 = new MapBuffer();

    @OriginalMember(owner = "client!jq", name = "wi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field6827 = new MapBuffer();

    @OriginalMember(owner = "client!jq", name = "Fi", descriptor = "I")
    private int field6836 = 0;

    @OriginalMember(owner = "client!jq", name = "Nh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field6792;

    @OriginalMember(owner = "client!jq", name = "Di", descriptor = "Ljava/lang/String;")
    private String field6834;

    @OriginalMember(owner = "client!jq", name = "Gi", descriptor = "Ljava/lang/String;")
    private String field6837;

    @OriginalMember(owner = "client!jq", name = "Ei", descriptor = "I")
    private int field6835;

    @OriginalMember(owner = "client!jq", name = "Ci", descriptor = "Z")
    public boolean field6833;

    @OriginalMember(owner = "client!jq", name = "yi", descriptor = "Z")
    private boolean field6829;

    @OriginalMember(owner = "client!jq", name = "Ai", descriptor = "Z")
    private boolean field6831;

    @OriginalMember(owner = "client!jq", name = "xi", descriptor = "Z")
    public boolean field6828;

    @OriginalMember(owner = "client!jq", name = "Ii", descriptor = "Z")
    public boolean field6839;

    @OriginalMember(owner = "client!jq", name = "Bi", descriptor = "Z")
    public boolean field6832;

    @OriginalMember(owner = "client!jq", name = "zi", descriptor = "[I")
    public int[] field6830;

    @OriginalMember(owner = "client!jq", name = "Hi", descriptor = "I")
    public int field6838;

    @OriginalMember(owner = "client!jq", name = "Fh", descriptor = "Lqfa;")
    public static class85 field6784 = new class85(88, 6);

    @OriginalMember(owner = "client!jq", name = "ci", descriptor = "[I")
    public static int[] field6807 = new int[1];

    @OriginalMember(owner = "client!jq", name = "zg", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!jq", name = "Ag", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!jq", name = "Bg", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!jq", name = "Cg", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!jq", name = "Dg", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!jq", name = "Eg", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!jq", name = "Fg", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!jq", name = "Gg", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!jq", name = "Hg", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!jq", name = "Ig", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!jq", name = "Jg", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!jq", name = "Kg", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!jq", name = "Lg", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!jq", name = "Mg", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!jq", name = "Ng", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!jq", name = "Og", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!jq", name = "Pg", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!jq", name = "Qg", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!jq", name = "Rg", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!jq", name = "Sg", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!jq", name = "Tg", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!jq", name = "Ug", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!jq", name = "Vg", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!jq", name = "Wg", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!jq", name = "Xg", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!jq", name = "Yg", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!jq", name = "Zg", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!jq", name = "ah", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!jq", name = "bh", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!jq", name = "ch", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!jq", name = "dh", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!jq", name = "eh", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!jq", name = "fh", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!jq", name = "gh", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!jq", name = "hh", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!jq", name = "ih", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!jq", name = "kh", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!jq", name = "lh", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!jq", name = "mh", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!jq", name = "nh", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!jq", name = "oh", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!jq", name = "ph", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!jq", name = "qh", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!jq", name = "rh", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!jq", name = "sh", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!jq", name = "th", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!jq", name = "uh", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!jq", name = "vh", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!jq", name = "wh", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!jq", name = "xh", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!jq", name = "yh", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!jq", name = "zh", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!jq", name = "Ah", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!jq", name = "Bh", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!jq", name = "Ch", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!jq", name = "Dh", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!jq", name = "Eh", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!jq", name = "Gh", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!jq", name = "Hh", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!jq", name = "Ih", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!jq", name = "Jh", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!jq", name = "Kh", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!jq", name = "Lh", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!jq", name = "Mh", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!jq", name = "Oh", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!jq", name = "Ph", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!jq", name = "Qh", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!jq", name = "Rh", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!jq", name = "Sh", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!jq", name = "Th", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!jq", name = "Uh", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!jq", name = "Vh", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!jq", name = "Wh", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!jq", name = "Xh", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!jq", name = "Yh", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!jq", name = "Zh", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!jq", name = "ai", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!jq", name = "bi", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!jq", name = "ei", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!jq", name = "fi", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!jq", name = "gi", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!jq", name = "ui", descriptor = "I")
    private int field6825;

    @OriginalMember(owner = "client!jq", name = "qi", descriptor = "J")
    private long field6821;

    @OriginalMember(owner = "client!jq", name = "ii", descriptor = "Lkea;")
    public static class218 field6813;

    @OriginalMember(owner = "client!jq", name = "oi", descriptor = "Z")
    private boolean field6819;

    @OriginalMember(owner = "client!jq", name = "pi", descriptor = "Z")
    private boolean field6820;

    @OriginalMember(owner = "client!jq", name = "ri", descriptor = "Z")
    private boolean field6822;

    @OriginalMember(owner = "client!jq", name = "ti", descriptor = "Z")
    private boolean field6824;

    @OriginalMember(owner = "client!jq", name = "vi", descriptor = "Z")
    private boolean field6826;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "(I)V")
    public final void method2841(int arg0) {
        OpenGL.glScissor(super.field8188 + super.field8134, super.field8113 + super.field7924 - super.field8152, -super.field8134 + super.field8132, -super.field8175 + super.field8152);
        ++field6803;
        if (arg0 != 8) {
            this.field6824 = false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lfda;[BIIII)Lgv;")
    public final class73 method2842(class294 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6745;
        return arg4 != -15004 ? null : new class137(this, arg0, arg5, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(ZZ)V")
    public final void method2843(boolean arg0, boolean arg1) {
        if (!arg0) {
            if (!arg1) {
                OpenGL.glDisable(32925);
            } else {
                OpenGL.glEnable(32925);
            }
            ++field6804;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z[[III)Lpu;")
    public final class524 method2844(boolean arg0, int[][] arg1, int arg2, int arg3) {
        int var5 = 87 / ((86 - arg3) / 35);
        ++field6783;
        return new class130(this, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Low;IZZI)V")
    public final void method2845(class319 arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field6727;
        if (arg1 >= 8) {
            OpenGL.glTexEnvi(8960, arg4 + 34176, class381.method2374(arg0, false));
            if (arg2) {
                OpenGL.glTexEnvi(8960, arg4 + 34192, !arg3 ? 770 : 771);
            } else {
                OpenGL.glTexEnvi(8960, 34192 - -arg4, arg3 ? 769 : 768);
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "(I)F")
    public final float method2846(int arg0) {
        if (arg0 != -15839) {
            this.field6818 = null;
        }
        ++field6734;
        return 0.0F;
    }

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "(IIII)[I")
    public final int[] method50(int arg0, int arg1, int arg2, int arg3) {
        ++field6796;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + super.field7924 + -var6 + -1, arg2, 1, 32993, this.field6838, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jq", name = "T", descriptor = "(I)V")
    private final void method2847(int arg0) {
        if (arg0 != 0) {
            this.field6812 = null;
        }
        if (this.field6820) {
            OpenGL.glPopMatrix();
        }
        ++field6740;
        if (super.field8106.method959((byte) 40)) {
            if (!this.field6822) {
                OpenGL.glLoadMatrixf(super.field8102.method2422(16398, class141.field2499), 0);
                this.field6822 = true;
                this.method2850((byte) 108);
                this.method2875(true);
            }
            if (!super.field8092) {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field8091.method2422(16398, class141.field2499), 0);
                this.field6820 = true;
            } else {
                this.field6820 = false;
            }
        } else if (!super.field8092) {
            OpenGL.glLoadMatrixf(super.field8091.method2422(16398, class141.field2499), 0);
            this.field6820 = false;
        } else {
            OpenGL.glLoadIdentity();
            this.field6820 = false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lro;Lfda;B)Z")
    public final boolean method2848(class2 arg0, class294 arg1, byte arg2) {
        int var4 = 23 / ((arg2 - -1) / 63);
        ++field6802;
        return true;
    }

    @OriginalMember(owner = "client!jq", name = "Q", descriptor = "(I)V")
    public final void method2849(int arg0) {
        ++field6787;
        int var2 = 103 / ((arg0 - -36) / 63);
        OpenGL.glMatrixMode(5890);
        if (super.field8136[super.field8181] == class496.field7062) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(super.field8193[super.field8181].method2422(16398, class141.field2499), 0);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "(B)V")
    public final void method2850(byte arg0) {
        if (arg0 != 108) {
            this.method2875(false);
        }
        OpenGL.glLightfv(16384, 4611, super.field8105, 0);
        ++field6793;
        OpenGL.glLightfv(16385, 4611, super.field8143, 0);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(ZZ)Lwl;")
    public final class378 method2851(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method2861(66, 21, 1, -121, true, (int[]) null, 7);
        }
        ++field6733;
        return new class336(this, arg1);
    }

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "(I)V")
    public final void method2852(int arg0) {
        ++field6765;
        for (int var2 = super.field8189 + arg0; ~var2 <= -1; --var2) {
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
        this.field6792.setSwapInterval(0);
        super.method2852(-1);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public final void method2853(Object arg0, Canvas arg1, byte arg2) {
        ++field6778;
        Long var4 = (Long) arg0;
        this.field6792.releaseSurface(arg1, var4);
        int var5 = 10 / ((49 - arg2) / 45);
    }

    @OriginalMember(owner = "client!jq", name = "R", descriptor = "(I)V")
    public final void method2854(int arg0) {
        if (arg0 == 2) {
            OpenGL.glDepthMask(super.field8201 && super.field8186);
            ++field6743;
        }
    }

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "(I)V")
    public final void method2855(int arg0) {
        ++field6764;
        if (!super.field8172) {
            OpenGL.glDisable(2929);
        } else {
            OpenGL.glEnable(2929);
        }
        if (arg0 != -1) {
            this.field6837 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "()V")
    public final void method2() {
        OpenGL.glFinish();
        ++field6754;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLfa;Lom;I)V")
    public class475(OpenGL arg0, Canvas arg1, long arg2, class214 arg3, class344 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field6792 = arg0;
            this.field6792.method3324();
            this.field6834 = OpenGL.glGetString(7936).toLowerCase();
            this.field6837 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field6834.indexOf("microsoft") == 0 && this.field6834.indexOf("brian paul") == -1 && ~this.field6834.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class394.method2433(' ', var8.replace('.', ' '), (byte) 118);
                if (~var9.length > -3) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class108.method975(var9[0], -10426);
                        int var11 = class108.method975(var9[1], -10426);
                        this.field6835 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field6835 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field6792.method3325("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field6792.method3325("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field8189 = var12[0];
                        if (~super.field8189 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field8185 = 8;
                            this.field6833 = this.field6792.method3325("GL_ARB_vertex_buffer_object");
                            super.field8131 = this.field6792.method3325("GL_ARB_multisample");
                            this.field6829 = this.field6792.method3325("GL_ARB_texture_rectangle");
                            super.field8122 = this.field6792.method3325("GL_ARB_texture_cube_map");
                            this.field6831 = this.field6792.method3325("GL_ARB_texture_non_power_of_two");
                            super.field8171 = this.field6792.method3325("GL_EXT_texture3D");
                            this.field6828 = this.field6792.method3325("GL_ARB_vertex_shader");
                            this.field6839 = this.field6792.method3325("GL_ARB_vertex_program");
                            this.field6832 = this.field6792.method3325("GL_ARB_fragment_shader");
                            this.field6792.method3325("GL_ARB_fragment_program");
                            this.field6830 = new int[super.field8189];
                            this.field6838 = Stream.method3580() ? 33639 : 5121;
                            if (~this.field6837.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class394.method2433(' ', this.field6837.replace('/', ' '), (byte) -23);
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (var18.charAt(0) == 'x' && var18.length() >= 3 && class323.method2083(var18.substring(1, 3), 24369)) {
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
                                                if (var18.length() >= 4 && class323.method2083(var18.substring(0, 4), 24369)) {
                                                    var13 = class108.method975(var18.substring(0, 4), -10426);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && var13 <= 7999) {
                                        this.field6833 = false;
                                    }
                                    if (~var13 <= -7001 && ~var13 >= -9251) {
                                        super.field8171 = false;
                                    }
                                }
                                this.field6829 &= this.field6792.method3325("GL_ARB_half_float_pixel");
                            }
                            this.field6834.indexOf("intel");
                            if (this.field6833) {
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
            this.method40();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BJ)V")
    public final synchronized void method2856(byte arg0, long arg1) {
        int var4 = 5 / ((73 - arg0) / 52);
        ++field6789;
        class425 var5 = new class425();
        var5.field6132 = arg1;
        this.field6817.method1229(var5, (byte) 120);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public final void method2857(Canvas arg0, byte arg1, Object arg2) {
        ++field6736;
        Long var4 = (Long) arg2;
        this.field6792.surfaceResized(var4);
        int var5 = -32 / ((arg1 - -7) / 53);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLsh;)V")
    public final void method2858(byte arg0, class62 arg1) {
        if (class277.field4153 == arg1) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class686.method3858(9216, arg1);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
        if (arg0 == 61) {
            ++field6746;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ltf;III)V")
    public final void method2859(class269 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            ++field6755;
            byte var5;
            int var6;
            if (class336.field5029 == arg0) {
                var5 = 1;
                var6 = arg3 * 2;
            } else if (class65.field1441 == arg0) {
                var6 = arg3 + 1;
                var5 = 3;
            } else if (class634.field9107 == arg0) {
                var6 = arg3 * 3;
                var5 = 4;
            } else if (class645.field9293 == arg0) {
                var6 = arg3 + 2;
                var5 = 6;
            } else if (class474.field6722 != arg0) {
                var6 = arg3;
                var5 = 0;
            } else {
                var5 = 5;
                var6 = arg3 + 2;
            }
            OpenGL.glDrawArrays(var5, arg1, var6);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBZLow;)V")
    public final void method2860(int arg0, byte arg1, boolean arg2, class319 arg3) {
        int var5 = -118 % ((arg1 - -3) / 40);
        ++field6775;
        OpenGL.glTexEnvi(8960, 34184 - -arg0, class381.method2374(arg3, false));
        OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIZ[II)Lhi;")
    public final class190 method2861(int arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6) {
        ++field6749;
        if (arg2 != 8) {
            field6799 = 38;
        }
        if (!this.field6831 && (!class141.method1144(0, arg3) || !class141.method1144(0, arg1))) {
            if (!this.field6829) {
                class23 var8 = new class23(this, class121.field2214, class2.field372, class455.method2740(arg2 + -1675135303, arg3), class455.method2740(-1675135295, arg1));
                var8.method464(arg6, (byte) 106, 0, arg5, arg0, arg3, 0, arg1);
                return var8;
            } else {
                return new class444(this, arg3, arg1, arg5, arg6, arg0);
            }
        } else {
            return new class23(this, arg3, arg1, arg4, arg5, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILkr;)V")
    public final void method2862(int arg0, class693 arg1) {
        ++field6738;
        class30[] var3 = ((class418) arg1).field6033;
        int var4 = 0;
        boolean var5 = false;
        if (arg0 == 13427) {
            boolean var6 = false;
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~var3.length; ++var8) {
                class30 var11 = var3[var8];
                class336 var12 = this.field6818[var8];
                int var13 = 0;
                int var14 = var12.method2165((byte) 34);
                long var15 = var12.method390((byte) -17);
                var12.method389(19550);
                for (int var17 = 0; var17 < var11.method503((byte) -95); ++var17) {
                    class14 var18 = var11.method502(91, var17);
                    if (class14.field731 == var18) {
                        OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                        var7 = true;
                    } else if (class14.field732 == var18) {
                        var6 = true;
                        OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                    } else if (class14.field733 == var18) {
                        var5 = true;
                        OpenGL.glColorPointer(4, 5121, var14, var15 - -((long) var13));
                    } else if (class14.field734 == var18) {
                        OpenGL.glClientActiveTexture(var4++ + 33984);
                        OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                    } else if (class14.field735 == var18) {
                        OpenGL.glClientActiveTexture(var4++ + 33984);
                        OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                    } else if (class14.field736 == var18) {
                        OpenGL.glClientActiveTexture(33984 - -(var4++));
                        OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                    } else if (class14.field737 == var18) {
                        OpenGL.glClientActiveTexture(var4++ + 33984);
                        OpenGL.glTexCoordPointer(4, 5126, var14, var15 - -((long) var13));
                    }
                    var13 += var18.field725;
                }
            }
            if (this.field6819 == !var7) {
                if (var7) {
                    OpenGL.glEnableClientState(32884);
                } else {
                    OpenGL.glDisableClientState(32884);
                }
                this.field6819 = var7;
            }
            if (!this.field6824 == var6) {
                if (var6) {
                    OpenGL.glEnableClientState(32885);
                } else {
                    OpenGL.glDisableClientState(32885);
                }
                this.field6824 = var6;
            }
            if (this.field6826 == !var5) {
                if (var5) {
                    OpenGL.glEnableClientState(32886);
                } else {
                    OpenGL.glDisableClientState(32886);
                }
                this.field6826 = var5;
            }
            if (this.field6825 < var4) {
                for (int var9 = this.field6825; ~var4 < ~var9; ++var9) {
                    OpenGL.glClientActiveTexture(var9 + 33984);
                    OpenGL.glEnableClientState(32888);
                }
                this.field6825 = var4;
            } else if (this.field6825 > var4) {
                for (int var10 = var4; var10 < this.field6825; ++var10) {
                    OpenGL.glClientActiveTexture(var10 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field6825 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[FZIIILfda;I)Lhi;")
    public final class190 method2863(int arg0, float[] arg1, boolean arg2, int arg3, int arg4, int arg5, class294 arg6, int arg7) {
        if (arg4 != -14125) {
            this.method2888(111);
        }
        ++field6805;
        if (!this.field6831 && (!class141.method1144(arg4 ^ -14125, arg0) || !class141.method1144(arg4 ^ -14125, arg7))) {
            if (!this.field6829) {
                class23 var9 = new class23(this, arg6, class2.field376, class455.method2740(-1675135295, arg0), class455.method2740(-1675135295, arg7));
                var9.method468(0, arg5, arg7, arg0, arg3, 0, arg1, arg6, 26339);
                return var9;
            } else {
                return new class444(this, arg6, arg0, arg7, arg1, arg5, arg3);
            }
        } else {
            return new class23(this, arg6, arg0, arg7, arg2, arg1, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "()V")
    public final void method40() {
        super.method40();
        ++field6771;
        if (this.field6792 != null) {
            this.field6792.method3326();
            this.field6792.release();
            this.field6792 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)V")
    public final synchronized void method122(int arg0) {
        ++field6758;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field6808.method1223(-2)) {
            class149 var12 = (class149) this.field6808.method1226(0);
            class182.field2935[var3++] = (int) var12.field6132;
            super.field8094 -= var12.field2560;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class182.field2935, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class182.field2935, 0);
            var3 = 0;
        }
        while (!this.field6812.method1223(-2)) {
            class149 var11 = (class149) this.field6812.method1226(0);
            class182.field2935[var3++] = (int) var11.field6132;
            super.field8088 -= var11.field2560;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class182.field2935, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class182.field2935, 0);
            var3 = 0;
        }
        while (!this.field6814.method1223(-2)) {
            class149 var10 = (class149) this.field6814.method1226(0);
            class182.field2935[var3++] = var10.field2560;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class182.field2935, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class182.field2935, 0);
            var3 = 0;
        }
        while (!this.field6815.method1223(-2)) {
            class149 var9 = (class149) this.field6815.method1226(0);
            class182.field2935[var3++] = (int) var9.field6132;
            super.field8096 -= var9.field2560;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class182.field2935, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class182.field2935, 0);
            boolean var4 = false;
        }
        while (!this.field6762.method1223(-2)) {
            class149 var8 = (class149) this.field6762.method1226(0);
            OpenGL.glDeleteLists((int) var8.field6132, var8.field2560);
        }
        while (!this.field6816.method1223(-2)) {
            class425 var7 = this.field6816.method1226(0);
            OpenGL.glDeleteProgramARB((int) var7.field6132);
        }
        while (!this.field6817.method1223(-2)) {
            class425 var6 = this.field6817.method1226(0);
            OpenGL.glDeleteObjectARB(var6.field6132);
        }
        while (!this.field6762.method1223(-2)) {
            class149 var5 = (class149) this.field6762.method1226(0);
            OpenGL.glDeleteLists((int) var5.field6132, var5.field2560);
        }
        if (~this.method149() < -100663297 && this.field6821 + 60000L < class525.method3074((byte) -101)) {
            System.gc();
            this.field6821 = class525.method3074((byte) -101);
        }
        super.method122(var2);
    }

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "(I)V")
    public final void method2864(int arg0) {
        if (arg0 > 125) {
            ++field6810;
            this.field6822 = false;
            this.method2847(0);
        }
    }

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "()V")
    public final void method174() {
        ++field6763;
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(Z)V")
    public final void method2865(boolean arg0) {
        if (!arg0) {
            this.method2();
        }
        ++field6794;
        if (super.field8146) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
    }

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "(B)V")
    public final void method2866(byte arg0) {
        ++field6790;
        if (arg0 != -119) {
            this.field6822 = false;
        }
        if (super.field8169 && super.field8150 && super.field8187 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "()Z")
    public final boolean method181() {
        ++field6729;
        return false;
    }

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "(B)V")
    public final void method2867(byte arg0) {
        class7.field512[1] = super.field8198 * super.field8159;
        class7.field512[2] = super.field8198 * super.field8133;
        class7.field512[3] = 1.0F;
        ++field6750;
        class7.field512[0] = super.field8198 * super.field8162;
        OpenGL.glLightfv(16384, 4609, class7.field512, 0);
        class7.field512[2] = -super.field8164 * super.field8133;
        class7.field512[3] = 1.0F;
        class7.field512[0] = -super.field8164 * super.field8162;
        if (arg0 <= 123) {
            this.method28();
        }
        class7.field512[1] = -super.field8164 * super.field8159;
        OpenGL.glLightfv(16385, 4609, class7.field512, 0);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method2868(byte arg0, Canvas arg1) {
        ++field6759;
        if (arg0 != 50) {
            this.field6836 = -34;
        }
        long var3 = this.field6792.prepareSurface(arg1);
        if (var3 == -1L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(II)Lne;")
    public final class292 method2869(int arg0, int arg1) {
        ++field6730;
        if (arg0 != 7) {
            this.method2851(false, false);
        }
        if (~arg1 != -4) {
            if (~arg1 != -5) {
                return ~arg1 == -9 ? new class463(this, super.field7936, super.field7955) : super.method2869(arg0, arg1);
            } else {
                return new class629(this, super.field7936, super.field7955);
            }
        } else {
            return new class439(this, super.field7936);
        }
    }

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "()Z")
    public final boolean method162() {
        ++field6785;
        return false;
    }

    @OriginalMember(owner = "client!jq", name = "ja", descriptor = "(I)V")
    public final void method42(int arg0) {
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field6744;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "(I)V")
    public final void method2870(int arg0) {
        OpenGL.glTexEnvi(8960, 34161, class202.method1430(super.field8117[super.field8181], (byte) 116));
        if (arg0 == 0) {
            ++field6776;
        }
    }

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "()V")
    public final void method94() {
        ++field6741;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(Lro;Lfda;B)Z")
    public final boolean method2871(class2 arg0, class294 arg1, byte arg2) {
        if (arg2 <= 125) {
            this.method2871((class2) null, (class294) null, (byte) -72);
        }
        ++field6766;
        return true;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(FFF)V")
    public final void method27(float arg0, float arg1, float arg2) {
        ++field6769;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ltf;IIIIILor;)V")
    public final void method2872(class269 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class595 arg6) {
        ++field6728;
        byte var8;
        int var9;
        if (class336.field5029 == arg0) {
            var8 = 1;
            var9 = arg5 * 2;
        } else if (class65.field1441 != arg0) {
            if (class634.field9107 == arg0) {
                var9 = arg5 * 3;
                var8 = 4;
            } else if (class645.field9293 != arg0) {
                if (class474.field6722 == arg0) {
                    var8 = 5;
                    var9 = arg5 + 2;
                } else {
                    var8 = 0;
                    var9 = arg5;
                }
            } else {
                var9 = arg5 - -2;
                var8 = 6;
            }
        } else {
            var9 = arg5 + 1;
            var8 = 3;
        }
        class2 var10 = arg6.method1187((byte) 36);
        class150 var11 = (class150) arg6;
        var11.method389(19550);
        OpenGL.glDrawElements(var8, var9, class89.method867(true, var10), var11.method390((byte) -17) - -((long) (var10.field367 * arg4)));
        if (arg2 > -50) {
            this.method2854(-119);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILwl;)V")
    public final void method2873(int arg0, int arg1, class378 arg2) {
        if (arg0 != 1) {
            this.field6822 = true;
        }
        ++field6781;
        this.field6818[arg1] = (class336) arg2;
    }

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "()V")
    public final void method106() {
        ++field6737;
        if (super.field8023 > 0 || ~super.field7924 < -1) {
            int var1 = super.field8134;
            int var2 = super.field8132;
            int var3 = super.field8175;
            int var4 = super.field8152;
            this.method107();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3217(-32);
            this.method3201((byte) -68, false);
            this.method3268(false, (byte) 115);
            this.method3237((byte) -96, false);
            this.method3253(-25293, false);
            this.method3266(-2, (class116) null);
            this.method3222(-2, (byte) -113, false, false);
            this.method3195(-12, 1);
            this.method3248(-3, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field8023, super.field7924, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method142(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method2874(int arg0, Object arg1, Canvas arg2) {
        if (arg0 == -18862) {
            ++field6800;
            Long var4 = (Long) arg1;
            if (!this.field6792.setSurface(var4)) {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "(Z)V")
    public final void method2875(boolean arg0) {
        this.method3239(0);
        ++field6752;
        int var2;
        for (var2 = 0; ~var2 > ~super.field8197; ++var2) {
            class9 var3 = super.field8142[var2];
            int var4 = var3.method269(arg0);
            int var5 = var2 + 16386;
            float var6 = var3.method277(-1) / 255.0F;
            class7.field512[0] = (float) var3.method276(-1);
            class7.field512[1] = (float) var3.method273(false);
            class7.field512[2] = (float) var3.method270(-96);
            class7.field512[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class7.field512, 0);
            class7.field512[2] = (float) class481.method2919(var4, 255) * var6;
            class7.field512[3] = 1.0F;
            class7.field512[1] = (float) class481.method2919(var4 >> 8, 255) * var6;
            class7.field512[0] = (float) class481.method2919(255, var4 >> 16) * var6;
            OpenGL.glLightfv(var5, 4609, class7.field512, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method274((byte) 34) * var3.method274((byte) 34)));
            OpenGL.glEnable(var5);
        }
        while (~var2 > ~super.field8179) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method2875(arg0);
    }

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "()Lmp;")
    public final class706 method19() {
        ++field6795;
        int var1 = -1;
        if (this.field6834.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (this.field6834.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (~this.field6834.indexOf("ati") != 0) {
            var1 = 4098;
        }
        return new class706(var1, "OpenGL", this.field6835, this.field6837, 0L);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lf;Z)V")
    public final void method132(class702 arg0, boolean arg1) {
        ++field6767;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
        ++field6782;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(ZI)Lor;")
    public final class595 method2876(boolean arg0, int arg1) {
        if (arg1 != 3) {
            this.field6832 = true;
        }
        ++field6735;
        return new class150(this, class2.field373, arg0);
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(B)V")
    public final void method2877(byte arg0) {
        if (arg0 != 29) {
            field6784 = null;
        }
        ++field6753;
        int var2 = this.field6830[super.field8181];
        if (var2 != 0) {
            this.field6830[super.field8181] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[Lrk;)Lkr;")
    public final class693 method2878(int arg0, class30[] arg1) {
        ++field6797;
        if (arg0 >= -10) {
            this.method2897(-51, 87, 81, (class294) null, false, (byte[]) null, (byte) 46, -45);
        }
        return new class418(arg1);
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(III)V")
    public final synchronized void method2879(int arg0, int arg1, int arg2) {
        ++field6811;
        if (arg1 == 3) {
            class149 var4 = new class149(arg0);
            var4.field6132 = (long) arg2;
            this.field6808.method1229(var4, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!jq", name = "U", descriptor = "(I)V")
    public static void method2880(int arg0) {
        field6784 = null;
        if (arg0 >= -120) {
            field6784 = null;
        }
        field6807 = null;
        field6813 = null;
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(Z)V")
    public final void method2881(boolean arg0) {
        OpenGL.glMatrixMode(5889);
        ++field6791;
        OpenGL.glLoadMatrixf(super.field8168, 0);
        OpenGL.glMatrixMode(5888);
        if (!arg0) {
            this.field6823 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(III)V")
    public final synchronized void method2882(int arg0, int arg1, int arg2) {
        ++field6757;
        class149 var4 = new class149(arg1);
        if (arg2 != -13095) {
            this.field6833 = true;
        }
        var4.field6132 = (long) arg0;
        this.field6812.method1229(var4, (byte) 120);
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "(B)V")
    public final void method2883(byte arg0) {
        if (arg0 > -117) {
            this.method2850((byte) -128);
        }
        ++field6774;
        if (!super.field8119) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3) {
        ++field6809;
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "()V")
    public final void method111() {
        ++field6748;
    }

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "(B)V")
    public final void method2884(byte arg0) {
        if (super.field8227) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
        ++field6751;
        if (arg0 >= -127) {
            this.field6818 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "(I)V")
    public final void method2885(int arg0) {
        int var2 = -40 / ((arg0 - -82) / 42);
        ++field6761;
        if (super.field8182 && !super.field8155) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(BI)V")
    public final void method2886(byte arg0, int arg1) {
        if (arg0 < -54) {
            ++field6742;
        }
    }

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "(B)V")
    public final void method2887(byte arg0) {
        if (arg0 != -36) {
            this.method2857((Canvas) null, (byte) -72, (Object) null);
        }
        ++field6777;
        if (super.field8170) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
    }

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "(I)V")
    public final void method2888(int arg0) {
        if (arg0 != 21175) {
            this.field6818 = null;
        }
        ++field6773;
        OpenGL.glActiveTexture(super.field8181 + 33984);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II[BIIIII[B)V")
    public static final void method2889(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field6732;
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 3);
        for (int var11 = -arg7; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg1++;
                arg8[var10001] += arg2[arg4++];
                int var14 = arg1++;
                arg8[var14] += arg2[arg4++];
                int var15 = arg1++;
                arg8[var15] += arg2[arg4++];
                int var16 = arg1++;
                arg8[var16] += arg2[arg4++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg1++;
                arg8[var10001] += arg2[arg4++];
            }
            arg1 += arg0;
            arg4 += arg5;
        }
        if (arg3 > -103) {
            method2880(33);
        }
    }

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "(I)V")
    public final void method2890(int arg0) {
        class7.field512[3] = 1.0F;
        class7.field512[1] = super.field8159 * super.field8157;
        class7.field512[2] = super.field8157 * super.field8133;
        ++field6731;
        class7.field512[0] = super.field8162 * super.field8157;
        OpenGL.glLightModelfv(2899, class7.field512, 0);
        if (arg0 <= 80) {
            this.field6839 = true;
        }
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "(Z)V")
    public final void method2891(boolean arg0) {
        ++field6739;
        super.field8204 = (float) (super.field8120 - super.field8111);
        super.field8137 = super.field8204 - (float) super.field8187;
        if (super.field8137 < (float) super.field8135) {
            super.field8137 = (float) super.field8135;
        }
        OpenGL.glFogf(2915, super.field8137);
        OpenGL.glFogf(2916, super.field8204);
        class7.field512[0] = (float) class481.method2919(16711680, super.field8154) / 1.671168E7F;
        class7.field512[2] = (float) class481.method2919(super.field8154, 255) / 255.0F;
        class7.field512[1] = (float) class481.method2919(super.field8154, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class7.field512, 0);
        if (!arg0) {
            this.method2899(28);
        }
    }

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "(B)V")
    public final void method2892(byte arg0) {
        ++field6788;
        int var2 = 90 / ((arg0 - 7) / 47);
        this.method2847(0);
    }

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "(I)V")
    public final void method2893(int arg0) {
        OpenGL.glViewport(super.field8188, super.field8113, super.field8023, super.field7924);
        int var2 = -108 % ((arg0 - 35) / 33);
        ++field6747;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method29(Rectangle[] arg0, int arg1) throws class105 {
        ++field6726;
        this.method63();
    }

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "(I)V")
    public final void method2894(int arg0) {
        class7.field512[0] = (float) class481.method2919(super.field8158, 16711680) / 1.671168E7F;
        class7.field512[2] = (float) class481.method2919(255, super.field8158) / 255.0F;
        ++field6768;
        class7.field512[1] = (float) class481.method2919(super.field8158, 65280) / 65280.0F;
        class7.field512[3] = (float) (super.field8158 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class7.field512, arg0);
    }

    @OriginalMember(owner = "client!jq", name = "DA", descriptor = "()I")
    public final int method116() {
        ++field6772;
        return this.field6836;
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(Z)V")
    public final void method2895(boolean arg0) {
        if (arg0) {
            this.method106();
        }
        ++field6770;
        if (class199.field3097 != super.field8108) {
            if (class438.field6312 == super.field8108) {
                OpenGL.glBlendFunc(1, 1);
                return;
            }
            if (class42.field1081 == super.field8108) {
                OpenGL.glBlendFunc(774, 1);
                return;
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(BI)V")
    public final synchronized void method2896(byte arg0, int arg1) {
        if (arg0 == -58) {
            ++field6798;
            class425 var3 = new class425();
            var3.field6132 = (long) arg1;
            this.field6816.method1229(var3, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIILfda;Z[BBI)Lhi;")
    public final class190 method2897(int arg0, int arg1, int arg2, class294 arg3, boolean arg4, byte[] arg5, byte arg6, int arg7) {
        ++field6806;
        if (arg6 < 55) {
            this.field6829 = false;
        }
        if (!this.field6831 && (!class141.method1144(0, arg7) || !class141.method1144(0, arg1))) {
            if (this.field6829) {
                return new class444(this, arg3, arg7, arg1, arg5, arg0, arg2);
            } else {
                class23 var9 = new class23(this, arg3, class2.field372, class455.method2740(-1675135295, arg7), class455.method2740(-1675135295, arg1));
                var9.method470(arg3, arg0, 0, arg1, arg2, 0, arg5, false, arg7);
                return var9;
            }
        } else {
            return new class23(this, arg3, arg7, arg1, arg4, arg5, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLfda;Lro;II)Lhi;")
    public final class190 method2898(byte arg0, class294 arg1, class2 arg2, int arg3, int arg4) {
        ++field6756;
        if (arg0 <= 71) {
            this.method2850((byte) 60);
        }
        if (!this.field6831 && (!class141.method1144(0, arg3) || !class141.method1144(0, arg4))) {
            return this.field6829 ? new class444(this, arg1, arg2, arg3, arg4) : new class23(this, arg1, arg2, class455.method2740(-1675135295, arg3), class455.method2740(-1675135295, arg4));
        } else {
            return new class23(this, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "(I)V")
    public final void method2899(int arg0) {
        ++field6780;
        if (arg0 != 11160) {
            this.field6828 = true;
        }
    }

    @OriginalMember(owner = "client!jq", name = "ya", descriptor = "()V")
    public final void method28() {
        this.method3253(-25293, true);
        ++field6760;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "()V")
    public final void method63() throws class105 {
        ++field6786;
        this.field6792.swapBuffers();
    }

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "(B)V")
    public final void method2900(byte arg0) {
        ++field6779;
        if (arg0 < -38) {
            OpenGL.glTexEnvi(8960, 34162, class202.method1430(super.field8153[super.field8181], (byte) 116));
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljs;Ljs;FLjs;)Ljs;")
    public final class304 method89(class304 arg0, class304 arg1, float arg2, class304 arg3) {
        ++field6801;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }
}
