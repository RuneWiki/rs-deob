import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class270 extends class343 {

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "F")
    public static float field3631 = 0.25F;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "F")
    public static float field3641 = 1.0F;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "F")
    public static float field3640 = 1.0F;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    private int field3634;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    private int field3636;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    private int field3644;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Lge;")
    private class104 field3633;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Lge;")
    private class104 field3637;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "Lge;")
    private class104 field3643;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "Lge;")
    private class104 field3645;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Loe;")
    private class231 field3632;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Loe;")
    private class231 field3638;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lgm;")
    private class337 field3635;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Lgm;")
    private class337 field3639;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "[Loe;")
    private class231[] field3642;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "()Z")
    public final boolean method1731() {
        return this.field4661.field295 && this.field4661.field304 && this.field4661.field238;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "()V")
    public final void method1732() {
        this.field3635 = null;
        this.field3642 = null;
        this.field3639 = null;
        this.field3638 = null;
        this.field3632 = null;
        this.field3633 = null;
        this.field3645 = null;
        this.field3643 = null;
        this.field3637 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public final void method1733(int arg0, int arg1) {
        this.field3634 = arg0;
        this.field3636 = arg1;
        int var3 = class177.method1321(this.field3634, 0);
        int var4 = class177.method1321(this.field3636, 0);
        if (this.field3644 == var3 && this.field3646 == var4) {
            return;
        }
        if (this.field3642 != null) {
            for (int var5 = 0; var5 < this.field3642.length; var5++) {
                this.field3642[var5].method19();
            }
            this.field3642 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field3635 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field3635 == null) {
                        this.field3635 = new class337(this.field4661);
                    }
                    this.field3642 = new class231[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field3642[var11++] = new class231(this.field4661, 3553, 34842, var9, var10);
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
        this.field3644 = var3;
        this.field3646 = var4;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILoe;Loe;)V")
    public final void method1734(int arg0, class231 arg1, class231 arg2) {
        opengl var4 = this.field4661.field198;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3642 == null) {
            this.field4661.method207(arg1);
            this.field4661.method260(this.field3639);
            this.field3639.method2137(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field3633.field1527;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field3641, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field3634, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field3634, (float) this.field3636);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field3636);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field4661.method260(this.field3635);
            int var5 = class177.method1321(this.field3634, 0);
            int var6 = class177.method1321(this.field3636, 0);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field3635.method2140(0, this.field3642[var7]);
                if (var7 == 0) {
                    this.field4661.method207(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field3634, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field3634, (float) this.field3636);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field3636);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field4661.method207(this.field3642[var7 - 1]);
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
            this.field4661.method214(this.field3635);
            this.field4661.method207(this.field3642[var7 - 1]);
            this.field4661.method260(this.field3639);
            this.field3639.method2137(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field3645.field1527;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field3641, 0.0F, 0.0F);
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
        this.field3639.method2137(1);
        this.field4661.method207(this.field3638);
        int var10 = this.field3637.field1527;
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
        this.field3639.method2137(0);
        this.field4661.method207(this.field3632);
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
        this.field4661.method214(this.field3639);
        int var11 = this.field3643.field1527;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field3631, field3640, 0.0F);
        this.field4661.method176(1);
        this.field4661.method207(this.field3638);
        this.field4661.method176(0);
        this.field4661.method207(arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()Z")
    public final boolean method1735() {
        if (!this.field4661.field295 || !this.field4661.field304 || !this.field4661.field238) {
            return false;
        }
        this.field3639 = new class337(this.field4661);
        this.field3638 = new class231(this.field4661, 3553, 34842, 256, 256);
        this.field3638.method1543(false, false);
        this.field3632 = new class231(this.field4661, 3553, 34842, 256, 256);
        this.field3632.method1543(false, false);
        this.field4661.method260(this.field3639);
        this.field3639.method2140(0, this.field3638);
        this.field3639.method2140(1, this.field3632);
        this.field3639.method2137(0);
        if (!this.field3639.method2135()) {
            this.field4661.method214(this.field3639);
            return false;
        }
        this.field4661.method214(this.field3639);
        this.field3633 = class104.method882(this.field4661, new class254[] { class254.method1637(this.field4661, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field3645 = class104.method882(this.field4661, new class254[] { class254.method1637(this.field4661, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field3643 = class104.method882(this.field4661, new class254[] { class254.method1637(this.field4661, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field3637 = class104.method882(this.field4661, new class254[] { class254.method1637(this.field4661, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field3645 != null && this.field3633 != null && this.field3643 != null && this.field3637 != null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lhd;)V")
    public class270(class17 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()I")
    public final int method1736() {
        return 1;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public final void method1737(int arg0) {
        this.field4661.field198.glUseProgramObjectARB(0);
        this.field4661.method176(1);
        this.field4661.method207((class4) null);
        this.field4661.method176(0);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()Z")
    public final boolean method1738() {
        return this.field3639 != null;
    }
}
