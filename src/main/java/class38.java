import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class38 extends class226 {

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "F")
    public static float field586 = 1.0F;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "F")
    public static float field590 = 1.0F;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "F")
    public static float field595 = 0.25F;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "Ljd;")
    private class130 field596;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "Ljd;")
    private class130 field599;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Llb;")
    private class208 field584;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Llb;")
    private class208 field597;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lie;")
    private class53 field585;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lie;")
    private class53 field588;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Lie;")
    private class53 field592;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Lie;")
    private class53 field594;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "[Llb;")
    private class208[] field598;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
    public final void method325(int arg0, int arg1) {
        this.field587 = arg0;
        this.field589 = arg1;
        int var3 = class321.method2142(-997880092, this.field587);
        int var4 = class321.method2142(-997880092, this.field589);
        if (this.field591 == var3 && this.field593 == var4) {
            return;
        }
        if (this.field598 != null) {
            for (int var5 = 0; var5 < this.field598.length; var5++) {
                this.field598[var5].method1492();
            }
            this.field598 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field599 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field599 == null) {
                        this.field599 = new class130(this.field3327);
                    }
                    this.field598 = new class208[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field598[var11++] = new class208(this.field3327, 3553, 34842, var9, var10);
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
        this.field591 = var3;
        this.field593 = var4;
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "()Z")
    public final boolean method326() {
        return this.field3327.field1635 && this.field3327.field1645 && this.field3327.field1667;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()Z")
    public final boolean method327() {
        return this.field596 != null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()Z")
    public final boolean method328() {
        if (!this.field3327.field1635 || !this.field3327.field1645 || !this.field3327.field1667) {
            return false;
        }
        this.field596 = new class130(this.field3327);
        this.field584 = new class208(this.field3327, 3553, 34842, 256, 256);
        this.field584.method1574(false, false);
        this.field597 = new class208(this.field3327, 3553, 34842, 256, 256);
        this.field597.method1574(false, false);
        this.field3327.method903(this.field596);
        this.field596.method1098(0, this.field584);
        this.field596.method1098(1, this.field597);
        this.field596.method1095(0);
        if (!this.field596.method1096()) {
            this.field3327.method869(this.field596);
            return false;
        }
        this.field3327.method869(this.field596);
        this.field592 = class53.method420(this.field3327, new class366[] { class366.method2335(this.field3327, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field585 = class53.method420(this.field3327, new class366[] { class366.method2335(this.field3327, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field594 = class53.method420(this.field3327, new class366[] { class366.method2335(this.field3327, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field588 = class53.method420(this.field3327, new class366[] { class366.method2335(this.field3327, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field585 != null && this.field592 != null && this.field594 != null && this.field588 != null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILlb;Llb;)V")
    public final void method329(int arg0, class208 arg1, class208 arg2) {
        opengl var4 = this.field3327.field1604;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field598 == null) {
            this.field3327.method929(arg1);
            this.field3327.method903(this.field596);
            this.field596.method1095(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field592.field861;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field586, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field587, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field587, (float) this.field589);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field589);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field3327.method903(this.field599);
            int var5 = class321.method2142(-997880092, this.field587);
            int var6 = class321.method2142(-997880092, this.field589);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field599.method1098(0, this.field598[var7]);
                if (var7 == 0) {
                    this.field3327.method929(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field587, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field587, (float) this.field589);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field589);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field3327.method929(this.field598[var7 - 1]);
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
            this.field3327.method869(this.field599);
            this.field3327.method929(this.field598[var7 - 1]);
            this.field3327.method903(this.field596);
            this.field596.method1095(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field585.field861;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field586, 0.0F, 0.0F);
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
        this.field596.method1095(1);
        this.field3327.method929(this.field584);
        int var10 = this.field588.field861;
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
        this.field596.method1095(0);
        this.field3327.method929(this.field597);
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
        this.field3327.method869(this.field596);
        int var11 = this.field594.field861;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field595, field590, 0.0F);
        this.field3327.method857(1);
        this.field3327.method929(this.field584);
        this.field3327.method857(0);
        this.field3327.method929(arg1);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "()I")
    public final int method330() {
        return 1;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lge;)V")
    public class38(class104 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()V")
    public final void method331() {
        this.field599 = null;
        this.field598 = null;
        this.field596 = null;
        this.field584 = null;
        this.field597 = null;
        this.field592 = null;
        this.field585 = null;
        this.field594 = null;
        this.field588 = null;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public final void method332(int arg0) {
        this.field3327.field1604.glUseProgramObjectARB(0);
        this.field3327.method857(1);
        this.field3327.method929((class195) null);
        this.field3327.method857(0);
    }
}
