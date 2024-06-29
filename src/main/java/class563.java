import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class563 extends class467 {

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
    private int field8230;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    private int field8232;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!ou", name = "H", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
    private int field8240;

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
    private int field8241;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!ou", name = "P", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!ou", name = "Q", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "Ldb;")
    private class296 field8229;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "Ldb;")
    private class296 field8238;

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "Lrq;")
    private class323 field8242;

    @OriginalMember(owner = "client!ou", name = "O", descriptor = "Lrq;")
    private class323 field8246;

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "Ltaa;")
    private class377 field8231;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "Ltaa;")
    private class377 field8236;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "Ltaa;")
    private class377 field8237;

    @OriginalMember(owner = "client!ou", name = "L", descriptor = "Ltaa;")
    private class377 field8243;

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "[Ldb;")
    private class296[] field8234;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(II)V")
    public final void method2788(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field8248;
        super.field6611.method125(1, 77);
        if (arg0 > 71) {
            super.field6611.method5(3845, (class487) null);
            super.field6611.method125(0, 115);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIZ)V")
    public final void method2789(int arg0, int arg1, boolean arg2) {
        ++field8228;
        this.field8232 = arg1;
        this.field8230 = arg0;
        int var4 = class264.method1730(93, this.field8232);
        if (arg2) {
            int var5 = class264.method1730(127, this.field8230);
            if (this.field8241 != var4 || ~this.field8240 != ~var5) {
                if (this.field8234 != null) {
                    for (int var6 = 0; this.field8234.length > var6; ++var6) {
                        this.field8234[var6].method2938(-23054);
                    }
                    this.field8234 = null;
                }
                if (var4 <= 256 && var5 <= 256) {
                    this.field8246 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    label60: while (true) {
                        if (~var7 >= -257 && ~var8 >= -257) {
                            if (this.field8246 == null) {
                                this.field8246 = new class323(super.field6611);
                            }
                            this.field8234 = new class296[var9];
                            int var10 = var4;
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (var10 <= 256 && ~var11 >= -257) {
                                    break label60;
                                }
                                this.field8234[var12++] = new class296(super.field6611, 3553, 34842, var10, var11);
                                if (var10 > 256) {
                                    var10 >>= 1;
                                }
                                if (var11 > 256) {
                                    var11 >>= 1;
                                }
                            }
                        }
                        ++var9;
                        if (~var8 < -257) {
                            var8 >>= 1;
                        }
                        if (var7 > 256) {
                            var7 >>= 1;
                        }
                    }
                }
                this.field8240 = var5;
                this.field8241 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lus;)V")
    public class563(class1 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(Z)Z")
    public final boolean method3271(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field8247;
            return super.field6611.field278 && super.field6611.field358 && super.field6611.field287;
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)V")
    public final void method2790(byte arg0) {
        this.field8237 = null;
        ++field8245;
        this.field8236 = null;
        this.field8243 = null;
        this.field8229 = null;
        this.field8231 = null;
        this.field8246 = null;
        this.field8242 = null;
        this.field8238 = null;
        this.field8234 = null;
        if (arg0 > -84) {
            this.field8238 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)Z")
    public final boolean method2780(byte arg0) {
        ++field8244;
        if (super.field6611.field278 && super.field6611.field358 && super.field6611.field287) {
            this.field8242 = new class323(super.field6611);
            this.field8229 = new class296(super.field6611, 3553, 34842, 256, 256);
            this.field8229.method1971(false, -118, false);
            this.field8238 = new class296(super.field6611, 3553, 34842, 256, 256);
            this.field8238.method1971(false, arg0 ^ -98, false);
            super.field6611.method60(this.field8242, (byte) 106);
            this.field8242.method2089(this.field8229, (byte) 112, 0);
            this.field8242.method2089(this.field8238, (byte) 121, 1);
            this.field8242.method2075(false, 0);
            if (!this.field8242.method2081((byte) -118)) {
                super.field6611.method141(2131, this.field8242);
                return false;
            } else {
                super.field6611.method141(2131, this.field8242);
                this.field8243 = class70.method786(0, new class264[] { class469.method2798(35632, super.field6611, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 0) }, super.field6611);
                this.field8236 = class70.method786(arg0 ^ 19, new class264[] { class469.method2798(35632, super.field6611, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 0) }, super.field6611);
                this.field8231 = class70.method786(arg0 + -19, new class264[] { class469.method2798(35632, super.field6611, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 0) }, super.field6611);
                this.field8237 = class70.method786(0, new class264[] { class469.method2798(35632, super.field6611, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", arg0 + -19) }, super.field6611);
                return this.field8236 != null && this.field8243 != null && this.field8231 != null && this.field8237 != null;
            }
        } else {
            if (arg0 != 19) {
                this.field8229 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
    public final int method2781(int arg0) {
        if (arg0 != 1) {
            this.method2780((byte) -82);
        }
        ++field8233;
        return 1;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(B)Z")
    public final boolean method2792(byte arg0) {
        if (arg0 >= -10) {
            return false;
        } else {
            ++field8235;
            return this.field8242 != null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ldb;IILdb;)V")
    public final void method2791(class296 arg0, int arg1, int arg2, class296 arg3) {
        ++field8239;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field8234 != null) {
            super.field6611.method60(this.field8246, (byte) -78);
            int var5 = class264.method1730(126, this.field8232);
            int var6 = class264.method1730(90, this.field8230);
            int var7 = 0;
            while (var5 > 256 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field8246.method2089(this.field8234[var7], (byte) 114, 0);
                if (var7 == 0) {
                    super.field6611.method5(3845, arg0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field8232, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field8232, (float) this.field8230);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8230);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field6611.method5(3845, this.field8234[var7 + -1]);
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
                if (var5 > 256) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field6611.method141(2131, this.field8246);
            super.field6611.method5(3845, this.field8234[var7 + -1]);
            super.field6611.method60(this.field8242, (byte) 108);
            this.field8242.method2075(false, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field8236.field5600;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class90.field1651, 0.0F, 0.0F);
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
            super.field6611.method5(3845, arg0);
            super.field6611.method60(this.field8242, (byte) 82);
            this.field8242.method2075(false, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field8243.field5600;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class90.field1651, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field8232, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field8232, (float) this.field8230);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field8230);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        int var12 = 127 % ((15 - arg2) / 39);
        this.field8242.method2075(false, 1);
        super.field6611.method5(3845, this.field8229);
        long var13 = this.field8237.field5600;
        OpenGL.glUseProgramObjectARB(var13);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var13, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var13, "step"), 0.00390625F, 0.0F, 0.0F);
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
        this.field8242.method2075(false, 0);
        super.field6611.method5(3845, this.field8238);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var13, "step"), 0.0F, 0.00390625F, 0.0F);
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
        super.field6611.method141(2131, this.field8242);
        long var15 = this.field8231.field5600;
        OpenGL.glUseProgramObjectARB(var15);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var15, "params"), class290.field4351, class654.field9418, 0.0F);
        super.field6611.method125(1, 79);
        super.field6611.method5(3845, this.field8229);
        super.field6611.method125(0, -29);
        super.field6611.method5(3845, arg0);
    }
}
