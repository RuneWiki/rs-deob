import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class383 extends class369 {

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "F")
    public static float field5666 = 0.25F;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "F")
    public static float field5668 = 1.0F;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "F")
    public static float field5670 = 1.0F;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    private int field5665;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    private int field5673;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    private int field5674;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    private int field5675;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lgg;")
    private class202 field5667;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "Lgg;")
    private class202 field5678;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Ldu;")
    private class411 field5669;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Ldu;")
    private class411 field5671;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Ldu;")
    private class411 field5672;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Ldu;")
    private class411 field5676;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lhi;")
    private class41 field5663;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lhi;")
    private class41 field5664;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "[Lhi;")
    private class41[] field5677;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lnm;)V", line = 8)
    public class383(class254 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()Z", line = 11)
    public final boolean method2281() {
        if (!this.field5562.field3776 || !this.field5562.field3759 || !this.field5562.field3699) {
            return false;
        }
        this.field5667 = new class202(this.field5562);
        this.field5663 = new class41(this.field5562, 3553, 34842, 256, 256);
        this.field5663.method312(false, false);
        this.field5664 = new class41(this.field5562, 3553, 34842, 256, 256);
        this.field5664.method312(false, false);
        this.field5562.method1612(this.field5667);
        this.field5667.method1374(0, this.field5663);
        this.field5667.method1374(1, this.field5664);
        this.field5667.method1372(0);
        if (!this.field5667.method1381()) {
            this.field5562.method1659(this.field5667);
            return false;
        }
        this.field5562.method1659(this.field5667);
        this.field5671 = class411.method2450(this.field5562, new class102[] { class102.method774(this.field5562, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field5669 = class411.method2450(this.field5562, new class102[] { class102.method774(this.field5562, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field5676 = class411.method2450(this.field5562, new class102[] { class102.method774(this.field5562, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field5672 = class411.method2450(this.field5562, new class102[] { class102.method774(this.field5562, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field5669 != null && this.field5671 != null && this.field5676 != null && this.field5672 != null;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()I", line = 43)
    public final int method2285() {
        return 1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V", line = 53)
    public final void method2278() {
        this.field5678 = null;
        this.field5677 = null;
        this.field5667 = null;
        this.field5663 = null;
        this.field5664 = null;
        this.field5671 = null;
        this.field5669 = null;
        this.field5676 = null;
        this.field5672 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 64)
    public final void method2282(int arg0, int arg1) {
        this.field5673 = arg0;
        this.field5665 = arg1;
        int var3 = class183.method1257(23132, this.field5673);
        int var4 = class183.method1257(23132, this.field5665);
        if (this.field5674 == var3 && this.field5675 == var4) {
            return;
        }
        if (this.field5677 != null) {
            for (int var5 = 0; var5 < this.field5677.length; var5++) {
                this.field5677[var5].method222();
            }
            this.field5677 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field5678 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field5678 == null) {
                        this.field5678 = new class202(this.field5562);
                    }
                    this.field5677 = new class41[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field5677[var11++] = new class41(this.field5562, 3553, 34842, var9, var10);
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
        this.field5674 = var3;
        this.field5675 = var4;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V", line = 133)
    public final void method2277(int arg0) {
        this.field5562.field3648.glUseProgramObjectARB(0);
        this.field5562.method1634(1);
        this.field5562.method1653((class26) null);
        this.field5562.method1634(0);
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "()Z", line = 142)
    public final boolean method2332() {
        return this.field5562.field3776 && this.field5562.field3759 && this.field5562.field3699;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILhi;Lhi;)V", line = 150)
    public final void method2286(int arg0, class41 arg1, class41 arg2) {
        opengl var4 = this.field5562.field3648;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5677 == null) {
            this.field5562.method1653(arg1);
            this.field5562.method1612(this.field5667);
            this.field5667.method1372(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field5671.field5940;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field5668, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field5673, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field5673, (float) this.field5665);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field5665);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field5562.method1612(this.field5678);
            int var5 = class183.method1257(23132, this.field5673);
            int var6 = class183.method1257(23132, this.field5665);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field5678.method1374(0, this.field5677[var7]);
                if (var7 == 0) {
                    this.field5562.method1653(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field5673, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field5673, (float) this.field5665);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field5665);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field5562.method1653(this.field5677[var7 - 1]);
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
            this.field5562.method1659(this.field5678);
            this.field5562.method1653(this.field5677[var7 - 1]);
            this.field5562.method1612(this.field5667);
            this.field5667.method1372(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field5669.field5940;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field5668, 0.0F, 0.0F);
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
        this.field5667.method1372(1);
        this.field5562.method1653(this.field5663);
        int var10 = this.field5672.field5940;
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
        this.field5667.method1372(0);
        this.field5562.method1653(this.field5664);
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
        this.field5562.method1659(this.field5667);
        int var11 = this.field5676.field5940;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field5666, field5670, 0.0F);
        this.field5562.method1634(1);
        this.field5562.method1653(this.field5663);
        this.field5562.method1634(0);
        this.field5562.method1653(arg1);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()Z", line = 299)
    public final boolean method2284() {
        return this.field5667 != null;
    }
}
