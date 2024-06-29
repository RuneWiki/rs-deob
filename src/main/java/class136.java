import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class136 extends class226 {

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "Lmha;")
    public static class701 field1821 = new class701(0, 2, 2, 1);

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "Lju;")
    public static class102 field1827 = new class102(17, -1);

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "Lfha;")
    public static class522 field1828 = new class522();

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "[[Ljava/lang/String;")
    public static String[][] field1829 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    private int field1804;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    private int field1816;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    private int field1819;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    private int field1824;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "Lfq;")
    private class204 field1808;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "Lfq;")
    private class204 field1826;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Ltea;")
    private class564 field1809;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Ltea;")
    private class564 field1823;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lwaa;")
    private class622 field1805;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Lwaa;")
    private class622 field1806;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Lwaa;")
    private class622 field1811;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "Lwaa;")
    private class622 field1818;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "[Lfq;")
    private class204[] field1820;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
    public final int method876(int arg0) {
        if (arg0 != 1) {
            return -6;
        } else {
            ++field1822;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static void method877(boolean arg0) {
        field1828 = null;
        field1827 = null;
        field1821 = null;
        if (arg0) {
            method877(true);
        }
        field1829 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
    public static int method878(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)Z")
    public final boolean method879(int arg0) {
        ++field1814;
        if (arg0 != -29164) {
            return false;
        } else {
            return this.field1809 != null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lep;)V")
    public class136(class371 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "(I)Z")
    public final boolean method880(int arg0) {
        ++field1815;
        if (arg0 != 16847) {
            this.method882(102);
        }
        return super.field3160.field5028 && super.field3160.field5005 && super.field3160.field5031;
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)V")
    public final void method881(int arg0) {
        this.field1808 = null;
        this.field1806 = null;
        this.field1805 = null;
        ++field1825;
        this.field1809 = null;
        this.field1818 = null;
        if (arg0 != 0) {
            this.field1820 = null;
        }
        this.field1820 = null;
        this.field1823 = null;
        this.field1826 = null;
        this.field1811 = null;
    }

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)Z")
    public final boolean method882(int arg0) {
        ++field1812;
        if (super.field3160.field5028 && super.field3160.field5005 && super.field3160.field5031) {
            this.field1809 = new class564(super.field3160);
            this.field1826 = new class204(super.field3160, 3553, 34842, 256, 256);
            this.field1826.method1364(false, false, 10242);
            this.field1808 = new class204(super.field3160, 3553, 34842, 256, 256);
            this.field1808.method1364(false, false, 10242);
            super.field3160.method2182(this.field1809, (byte) 117);
            this.field1809.method3370(arg0 + -3670, this.field1826, 0);
            this.field1809.method3370(-125, this.field1808, 1);
            this.field1809.method3375(2, 0);
            if (!this.field1809.method3377(118)) {
                super.field3160.method2142((byte) -124, this.field1809);
                return false;
            } else {
                super.field3160.method2142((byte) -91, this.field1809);
                this.field1805 = class163.method1016(super.field3160, new class510[] { class689.method3927("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field3160, (byte) -80, 35632) }, -12748);
                this.field1811 = class163.method1016(super.field3160, new class510[] { class689.method3927("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field3160, (byte) -80, 35632) }, arg0 ^ -15403);
                this.field1818 = class163.method1016(super.field3160, new class510[] { class689.method3927("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field3160, (byte) -80, 35632) }, arg0 ^ -15403);
                this.field1806 = class163.method1016(super.field3160, new class510[] { class689.method3927("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field3160, (byte) -80, 35632) }, -12748);
                return this.field1811 != null && this.field1805 != null && this.field1818 != null && this.field1806 != null;
            }
        } else {
            return arg0 != 3553 ? false : false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public final void method883(int arg0, int arg1, int arg2) {
        this.field1804 = arg0;
        ++field1813;
        this.field1824 = arg1;
        int var4 = class655.method3787((byte) 120, this.field1824);
        int var5 = class655.method3787((byte) 117, this.field1804);
        if (arg2 != 24682) {
            this.field1816 = 35;
        }
        if (~this.field1819 != ~var4 || ~this.field1816 != ~var5) {
            if (this.field1820 != null) {
                for (int var6 = 0; var6 < this.field1820.length; ++var6) {
                    this.field1820[var6].method2411(arg2 + -24682);
                }
                this.field1820 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field1823 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field1823 == null) {
                    this.field1823 = new class564(super.field3160);
                }
                label57: while (true) {
                    if (var7 <= 256 && var8 <= 256) {
                        int var10 = var5;
                        this.field1820 = new class204[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && ~var10 >= -257) {
                                break label57;
                            }
                            this.field1820[var12++] = new class204(super.field3160, 3553, 34842, var11, var10);
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                        }
                    }
                    ++var9;
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                }
            }
            this.field1816 = var5;
            this.field1819 = var4;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BJLha;)V")
    public static final void method884(byte arg0, long arg1, class545 arg2) {
        if (arg0 != -28) {
            method877(true);
        }
        class599.field8600 = 0;
        class213.field2998 = 0;
        class323.field4151 = class289.field3794;
        ++field1810;
        class289.field3794 = 0;
        long var4 = class224.method1457((byte) -62);
        for (class198 var6 = (class198) class335.field4303.method1945(false); var6 != null; var6 = (class198) class335.field4303.method1944(9408)) {
            if (var6.method1340(arg2, arg1)) {
                ++class213.field2998;
            }
        }
        if (class144.field1990 && ~(arg1 % 100L) == -1L) {
            System.out.println("Particle system count: " + class335.field4303.method1951(0) + ", running: " + class213.field2998);
            System.out.println("Emitters: " + class599.field8600 + " Particles: " + class289.field3794 + ". Time taken: " + (-var4 + class224.method1457((byte) -62)) + "ms");
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V")
    public final void method885(boolean arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        if (arg0) {
            this.field1818 = null;
        }
        ++field1803;
        super.field3160.method2196(1, (byte) 89);
        super.field3160.method2154((class396) null, -2);
        super.field3160.method2196(0, (byte) 89);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZIIIII)V")
    public static final void method886(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1817;
        if (!arg3) {
            method884((byte) 94, 70L, (class545) null);
        }
        class390.method2370(0, arg7, arg1, arg2, arg4, arg8, arg6, (byte) 124, arg0, arg5);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lfq;ILfq;B)V")
    public final void method887(class204 arg0, int arg1, class204 arg2, byte arg3) {
        ++field1807;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1820 == null) {
            super.field3160.method2154(arg2, -2);
            super.field3160.method2182(this.field1809, (byte) -111);
            this.field1809.method3375(2, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field1805.field8850;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class123.field1686, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1824, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1824, (float) this.field1804);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1804);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field3160.method2182(this.field1823, (byte) -110);
            int var7 = class655.method3787((byte) 115, this.field1824);
            int var8 = class655.method3787((byte) 127, this.field1804);
            int var9 = 0;
            while (var7 > 256 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field1823.method3370(86, this.field1820[var9], 0);
                if (var8 > 256) {
                    var8 >>= 1;
                }
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (var9 != 0) {
                    super.field3160.method2154(this.field1820[var9 + -1], -2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field3160.method2154(arg2, -2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1824, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1824, (float) this.field1804);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1804);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var9;
            }
            super.field3160.method2142((byte) -116, this.field1823);
            super.field3160.method2154(this.field1820[var9 + -1], -2);
            super.field3160.method2182(this.field1809, (byte) 65);
            this.field1809.method3375(2, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1811.field8850;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class123.field1686, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1809.method3375(2, 1);
        super.field3160.method2154(this.field1826, -2);
        long var12 = this.field1806.field8850;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        this.field1809.method3375(2, 0);
        super.field3160.method2154(this.field1808, -2);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        int var14 = -12 / ((-59 - arg3) / 62);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field3160.method2142((byte) -92, this.field1809);
        long var15 = this.field1818.field8850;
        OpenGL.glUseProgramObjectARB(var15);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var15, "params"), class409.field5692, class238.field3307, 0.0F);
        super.field3160.method2196(1, (byte) 89);
        super.field3160.method2154(this.field1826, -2);
        super.field3160.method2196(0, (byte) 89);
        super.field3160.method2154(arg2, -2);
    }
}
