import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class275 extends class61 {

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "F")
    public static float field4041 = 1.0F;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "F")
    public static float field4042 = 1.0F;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "F")
    public static float field4046 = 0.25F;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    private int field4036;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    private int field4039;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    private int field4044;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Loa;")
    private class121 field4034;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Loa;")
    private class121 field4038;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Ljj;")
    private class18 field4037;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "Ljj;")
    private class18 field4048;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "Lb;")
    private class375 field4040;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Lb;")
    private class375 field4045;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "Lb;")
    private class375 field4047;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "Lb;")
    private class375 field4049;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "[Loa;")
    private class121[] field4035;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V")
    public final void method547(int arg0, int arg1) {
        this.field4043 = arg0;
        this.field4039 = arg1;
        int var3 = class437.method2740(381, this.field4043);
        int var4 = class437.method2740(381, this.field4039);
        if (this.field4044 == var3 && this.field4036 == var4) {
            return;
        }
        if (this.field4035 != null) {
            for (int var5 = 0; var5 < this.field4035.length; var5++) {
                this.field4035[var5].method2283();
            }
            this.field4035 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field4048 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field4048 == null) {
                        this.field4048 = new class18(this.field934);
                    }
                    this.field4035 = new class121[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field4035[var11++] = new class121(this.field934, 3553, 34842, var9, var10);
                        if (var9 > 256) {
                            var9 >>= 0x1;
                        }
                        if (var10 > 256) {
                            var10 >>= 0x1;
                        }
                    }
                }
                if (var6 > 256) {
                    var6 >>= 0x1;
                }
                if (var7 > 256) {
                    var7 >>= 0x1;
                }
                var8++;
            }
        }
        this.field4044 = var3;
        this.field4036 = var4;
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "()Z")
    public final boolean method1815() {
        return this.field934.field4212 && this.field934.field4273 && this.field934.field4213;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public final void method543(int arg0) {
        this.field934.field4140.glUseProgramObjectARB(0);
        this.field934.method1862(1);
        this.field934.method1915((class344) null);
        this.field934.method1862(0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()I")
    public final int method541() {
        return 1;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lse;)V")
    public class275(class282 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "()Z")
    public final boolean method545() {
        return this.field4037 != null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()Z")
    public final boolean method542() {
        if (!this.field934.field4212 || !this.field934.field4273 || !this.field934.field4213) {
            return false;
        }
        this.field4037 = new class18(this.field934);
        this.field4034 = new class121(this.field934, 3553, 34842, 256, 256);
        this.field4034.method872(false, false);
        this.field4038 = new class121(this.field934, 3553, 34842, 256, 256);
        this.field4038.method872(false, false);
        this.field934.method1884(this.field4037);
        this.field4037.method139(0, this.field4034);
        this.field4037.method139(1, this.field4038);
        this.field4037.method135(0);
        if (!this.field4037.method142()) {
            this.field934.method1916(this.field4037);
            return false;
        }
        this.field934.method1916(this.field4037);
        this.field4045 = class375.method2459(this.field934, new class65[] { class65.method564(this.field934, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field4047 = class375.method2459(this.field934, new class65[] { class65.method564(this.field934, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field4040 = class375.method2459(this.field934, new class65[] { class65.method564(this.field934, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field4049 = class375.method2459(this.field934, new class65[] { class65.method564(this.field934, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field4047 != null && this.field4045 != null && this.field4040 != null && this.field4049 != null;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "()V")
    public final void method546() {
        this.field4048 = null;
        this.field4035 = null;
        this.field4037 = null;
        this.field4034 = null;
        this.field4038 = null;
        this.field4045 = null;
        this.field4047 = null;
        this.field4040 = null;
        this.field4049 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILoa;Loa;)V")
    public final void method538(int arg0, class121 arg1, class121 arg2) {
        opengl var4 = this.field934.field4140;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4035 == null) {
            this.field934.method1915(arg1);
            this.field934.method1884(this.field4037);
            this.field4037.method135(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field4045.field5510;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field4041, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field4043, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field4043, (float) this.field4039);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field4039);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field934.method1884(this.field4048);
            int var5 = class437.method2740(381, this.field4043);
            int var6 = class437.method2740(381, this.field4039);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field4048.method139(0, this.field4035[var7]);
                if (var7 == 0) {
                    this.field934.method1915(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field4043, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field4043, (float) this.field4039);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field4039);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field934.method1915(this.field4035[var7 - 1]);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f(1.0F, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f(1.0F, 1.0F);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, 1.0F);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                }
                if (var5 > 256) {
                    var5 >>= 0x1;
                }
                if (var6 > 256) {
                    var6 >>= 0x1;
                }
                var7++;
            }
            this.field934.method1916(this.field4048);
            this.field934.method1915(this.field4035[var7 - 1]);
            this.field934.method1884(this.field4037);
            this.field4037.method135(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field4047.field5510;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field4041, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f(1.0F, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f(1.0F, 1.0F);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, 1.0F);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        }
        this.field4037.method135(1);
        this.field934.method1915(this.field4034);
        int var10 = this.field4049.field5510;
        var4.glUseProgramObjectARB(var10);
        var4.glUniform1iARB(var4.glGetUniformLocation(var10, "baseTex"), 0);
        var4.glUniform3fARB(var4.glGetUniformLocation(var10, "step"), 0.00390625F, 0.0F, 0.0F);
        var4.glBegin(7);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2i(0, 0);
        var4.glTexCoord2f(1.0F, 0.0F);
        var4.glVertex2i(1, 0);
        var4.glTexCoord2f(1.0F, 1.0F);
        var4.glVertex2i(1, 1);
        var4.glTexCoord2f(0.0F, 1.0F);
        var4.glVertex2i(0, 1);
        var4.glEnd();
        this.field4037.method135(0);
        this.field934.method1915(this.field4038);
        var4.glUniform3fARB(var4.glGetUniformLocation(var10, "step"), 0.0F, 0.00390625F, 0.0F);
        var4.glBegin(7);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2i(0, 0);
        var4.glTexCoord2f(1.0F, 0.0F);
        var4.glVertex2i(1, 0);
        var4.glTexCoord2f(1.0F, 1.0F);
        var4.glVertex2i(1, 1);
        var4.glTexCoord2f(0.0F, 1.0F);
        var4.glVertex2i(0, 1);
        var4.glEnd();
        var4.glPopAttrib();
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        this.field934.method1916(this.field4037);
        int var11 = this.field4040.field5510;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field4046, field4042, 0.0F);
        this.field934.method1862(1);
        this.field934.method1915(this.field4034);
        this.field934.method1862(0);
        this.field934.method1915(arg1);
    }
}
