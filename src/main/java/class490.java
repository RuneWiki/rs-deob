import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class490 extends class272 {

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "[I")
    public static int[] field7166 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "[I")
    public static int[] field7182;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "Lao;")
    public static class191 field7189;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "F")
    public static float field7190;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    private int field7171;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    private int field7178;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    private int field7180;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    private int field7185;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "Luq;")
    private class113 field7173;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "Luq;")
    private class113 field7177;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "Luq;")
    private class113 field7186;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "Luq;")
    private class113 field7188;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "Lkm;")
    private class238 field7165;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "Lkm;")
    private class238 field7183;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "Lmq;")
    private class354 field7167;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "Lmq;")
    private class354 field7169;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "[Lkm;")
    private class238[] field7187;

    static {
        new class305("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field7182 = new int[4096];
        new class305((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field7189 = new class191(40, 1);
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V", line = 4)
    public static void method2959(int arg0) {
        field7166 = null;
        field7182 = null;
        if (arg0 <= 40) {
            field7189 = null;
        }
        field7189 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)V", line = 24)
    public final void method1655(int arg0, boolean arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field7176;
        super.field3627.method2250((byte) 91, 1);
        super.field3627.method2236((class252) null, 104);
        super.field3627.method2250((byte) 53, 0);
        if (!arg1) {
            this.method1657(false, (class238) null, (class238) null, 111);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLkm;Lkm;I)V", line = 38)
    public final void method1657(boolean arg0, class238 arg1, class238 arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field7181;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field7187 != null) {
            super.field3627.method2264(this.field7167, -73);
            int var5 = class525.method3127(this.field7180, 1617667937);
            int var6 = class525.method3127(this.field7171, 1617667937);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field7167.method2072(0, this.field7187[var7], true);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (~var7 == -1) {
                    super.field3627.method2236(arg1, -22);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field7180, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field7180, (float) this.field7171);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7171);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field3627.method2236(this.field7187[var7 - 1], 104);
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
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                ++var7;
            }
            super.field3627.method2271((byte) 39, this.field7167);
            super.field3627.method2236(this.field7187[var7 + -1], 115);
            super.field3627.method2264(this.field7169, 96);
            this.field7169.method2075(-118, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field7173.field1485;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class515.field7485, 0.0F, 0.0F);
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
            super.field3627.method2236(arg1, 100);
            super.field3627.method2264(this.field7169, 100);
            this.field7169.method2075(39, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field7188.field1485;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class515.field7485, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field7180, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field7180, (float) this.field7171);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field7171);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field7169.method2075(48, 1);
        super.field3627.method2236(this.field7165, 114);
        long var12 = this.field7186.field1485;
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
        this.field7169.method2075(-88, 0);
        super.field3627.method2236(this.field7183, 109);
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
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field3627.method2271((byte) 39, this.field7169);
        if (arg0) {
            this.method1651(2);
        }
        long var14 = this.field7177.field1485;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class196.field2526, class358.field4871, 0.0F);
        super.field3627.method2250((byte) 51, 1);
        super.field3627.method2236(this.field7165, 105);
        super.field3627.method2250((byte) 123, 0);
        super.field3627.method2236(arg1, -96);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)V", line = 194)
    public final void method1654(int arg0, byte arg1, int arg2) {
        ++field7184;
        this.field7171 = arg2;
        if (arg1 != -112) {
            this.field7169 = null;
        }
        this.field7180 = arg0;
        int var4 = class525.method3127(this.field7180, 1617667937);
        int var5 = class525.method3127(this.field7171, 1617667937);
        if (this.field7185 != var4 || this.field7178 != var5) {
            if (this.field7187 != null) {
                for (int var6 = 0; this.field7187.length > var6; ++var6) {
                    this.field7187[var6].method1553(arg1 + 166);
                }
                this.field7187 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field7167 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field7167 == null) {
                    this.field7167 = new class354(super.field3627);
                }
                label60: while (true) {
                    if (var7 <= 256 && var8 <= 256) {
                        this.field7187 = new class238[var9];
                        int var10 = var5;
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && var10 <= 256) {
                                break label60;
                            }
                            this.field7187[var12++] = new class238(super.field3627, 3553, 34842, var11, var10);
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field7178 = var5;
            this.field7185 = var4;
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)Z", line = 275)
    public final boolean method1652(int arg0) {
        if (arg0 != 34842) {
            return false;
        } else {
            ++field7172;
            if (super.field3627.field5417 && super.field3627.field5378 && super.field3627.field5404) {
                this.field7169 = new class354(super.field3627);
                this.field7165 = new class238(super.field3627, 3553, 34842, 256, 256);
                this.field7165.method1499(false, 0, false);
                this.field7183 = new class238(super.field3627, 3553, 34842, 256, 256);
                this.field7183.method1499(false, 0, false);
                super.field3627.method2264(this.field7169, 107);
                this.field7169.method2072(0, this.field7165, true);
                this.field7169.method2072(1, this.field7183, true);
                this.field7169.method2075(85, 0);
                if (!this.field7169.method2076((byte) -98)) {
                    super.field3627.method2271((byte) 39, this.field7169);
                    return false;
                } else {
                    super.field3627.method2271((byte) 39, this.field7169);
                    this.field7188 = class151.method904((byte) 59, new class346[] { class113.method686("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, 105, super.field3627) }, super.field3627);
                    this.field7173 = class151.method904((byte) 28, new class346[] { class113.method686("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, arg0 ^ -34943, super.field3627) }, super.field3627);
                    this.field7177 = class151.method904((byte) 50, new class346[] { class113.method686("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, 113, super.field3627) }, super.field3627);
                    this.field7186 = class151.method904((byte) 24, new class346[] { class113.method686("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, -106, super.field3627) }, super.field3627);
                    return this.field7173 != null && this.field7188 != null && this.field7177 != null && this.field7186 != null;
                }
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILfo;I)Lpq;", line = 314)
    public static final class131 method2960(int arg0, int arg1, class361 arg2, int arg3) {
        ++field7170;
        byte[] var4 = arg2.method2130(arg1, arg0, -126);
        int var5 = 65 % ((-57 - arg3) / 54);
        return var4 == null ? null : new class131(var4);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)Z", line = 335)
    public final boolean method2961(byte arg0) {
        ++field7164;
        if (arg0 > -110) {
            return true;
        } else {
            return super.field3627.field5417 && super.field3627.field5378 && super.field3627.field5404;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)Z", line = 346)
    public final boolean method1646(boolean arg0) {
        ++field7175;
        if (!arg0) {
            this.field7187 = null;
        }
        return this.field7169 != null;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V", line = 361)
    public final void method1659(int arg0) {
        this.field7165 = null;
        this.field7177 = null;
        ++field7168;
        this.field7169 = null;
        this.field7173 = null;
        this.field7187 = null;
        if (arg0 > -67) {
            this.method1646(true);
        }
        this.field7186 = null;
        this.field7183 = null;
        this.field7188 = null;
        this.field7167 = null;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)I", line = 389)
    public final int method1651(int arg0) {
        if (arg0 > -92) {
            return -80;
        } else {
            ++field7179;
            return 1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lur;)V", line = 404)
    public class490(class377 arg0) {
        super(arg0);
    }
}
