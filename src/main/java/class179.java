import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class179 extends class194 {

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "F")
    public static float field2704 = 1.0F;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "F")
    public static float field2701 = 1.0F;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "F")
    public static float field2702 = 0.25F;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    private int field2693;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    private int field2698;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lig;")
    private class209 field2690;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lig;")
    private class209 field2692;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lig;")
    private class209 field2694;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Lig;")
    private class209 field2700;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lbh;")
    private class366 field2695;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lbh;")
    private class366 field2697;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lpq;")
    private class46 field2696;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Lpq;")
    private class46 field2699;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "[Lpq;")
    private class46[] field2703;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V")
    public final void method1083() {
        this.field2697 = null;
        this.field2703 = null;
        this.field2695 = null;
        this.field2699 = null;
        this.field2696 = null;
        this.field2700 = null;
        this.field2694 = null;
        this.field2690 = null;
        this.field2692 = null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()Z")
    public final boolean method1084() {
        return this.field2695 != null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()I")
    public final int method1085() {
        return 1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILpq;Lpq;)V")
    public final void method1086(int arg0, class46 arg1, class46 arg2) {
        opengl var4 = this.field2932.field5783;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2703 == null) {
            this.field2932.method2460(arg1);
            this.field2932.method2491(this.field2695);
            this.field2695.method2203(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field2700.field3131;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field2701, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field2705, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field2705, (float) this.field2693);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field2693);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field2932.method2491(this.field2697);
            int var5 = class275.method1708(this.field2705, true);
            int var6 = class275.method1708(this.field2693, true);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field2697.method2198(0, this.field2703[var7]);
                if (var7 == 0) {
                    this.field2932.method2460(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field2705, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field2705, (float) this.field2693);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field2693);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field2932.method2460(this.field2703[var7 - 1]);
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
            this.field2932.method2475(this.field2697);
            this.field2932.method2460(this.field2703[var7 - 1]);
            this.field2932.method2491(this.field2695);
            this.field2695.method2203(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field2694.field3131;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field2701, 0.0F, 0.0F);
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
        this.field2695.method2203(1);
        this.field2932.method2460(this.field2699);
        int var10 = this.field2692.field3131;
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
        this.field2695.method2203(0);
        this.field2932.method2460(this.field2696);
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
        this.field2932.method2475(this.field2695);
        int var11 = this.field2690.field3131;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field2702, field2704, 0.0F);
        this.field2932.method2452(1);
        this.field2932.method2460(this.field2699);
        this.field2932.method2452(0);
        this.field2932.method2460(arg1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    public final void method1087(int arg0, int arg1) {
        this.field2705 = arg0;
        this.field2693 = arg1;
        int var3 = class275.method1708(this.field2705, true);
        int var4 = class275.method1708(this.field2693, true);
        if (this.field2698 == var3 && this.field2691 == var4) {
            return;
        }
        if (this.field2703 != null) {
            for (int var5 = 0; var5 < this.field2703.length; var5++) {
                this.field2703[var5].method2002();
            }
            this.field2703 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field2697 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field2697 == null) {
                        this.field2697 = new class366(this.field2932);
                    }
                    this.field2703 = new class46[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field2703[var11++] = new class46(this.field2932, 3553, 34842, var9, var10);
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
        this.field2698 = var3;
        this.field2691 = var4;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()Z")
    public final boolean method1088() {
        if (!this.field2932.field5895 || !this.field2932.field5829 || !this.field2932.field5892) {
            return false;
        }
        this.field2695 = new class366(this.field2932);
        this.field2699 = new class46(this.field2932, 3553, 34842, 256, 256);
        this.field2699.method258(false, false);
        this.field2696 = new class46(this.field2932, 3553, 34842, 256, 256);
        this.field2696.method258(false, false);
        this.field2932.method2491(this.field2695);
        this.field2695.method2198(0, this.field2699);
        this.field2695.method2198(1, this.field2696);
        this.field2695.method2203(0);
        if (!this.field2695.method2196()) {
            this.field2932.method2475(this.field2695);
            return false;
        }
        this.field2932.method2475(this.field2695);
        this.field2700 = class209.method1230(this.field2932, new class59[] { class59.method327(this.field2932, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2694 = class209.method1230(this.field2932, new class59[] { class59.method327(this.field2932, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2690 = class209.method1230(this.field2932, new class59[] { class59.method327(this.field2932, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field2692 = class209.method1230(this.field2932, new class59[] { class59.method327(this.field2932, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field2694 != null && this.field2700 != null && this.field2690 != null && this.field2692 != null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public final void method1089(int arg0) {
        this.field2932.field5783.glUseProgramObjectARB(0);
        this.field2932.method2452(1);
        this.field2932.method2460((class325) null);
        this.field2932.method2452(0);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lcg;)V")
    public class179(class393 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()Z")
    public final boolean method1090() {
        return this.field2932.field5895 && this.field2932.field5829 && this.field2932.field5892;
    }
}
