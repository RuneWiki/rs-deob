import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class175 extends class234 {

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "F")
    public static float field2532 = 0.25F;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "F")
    public static float field2534 = 1.0F;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "F")
    public static float field2533 = 1.0F;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    private int field2521;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    private int field2523;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    private int field2530;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lkh;")
    private class13 field2519;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Lkh;")
    private class13 field2527;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lcd;")
    private class189 field2520;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lcd;")
    private class189 field2522;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lcd;")
    private class189 field2524;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lcd;")
    private class189 field2525;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Lla;")
    private class288 field2528;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Lla;")
    private class288 field2529;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[Lkh;")
    private class13[] field2526;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public final void method1069() {
        this.field2529 = null;
        this.field2526 = null;
        this.field2528 = null;
        this.field2519 = null;
        this.field2527 = null;
        this.field2524 = null;
        this.field2522 = null;
        this.field2520 = null;
        this.field2525 = null;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "()I")
    public final int method1070() {
        return 1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public final void method1071(int arg0, int arg1) {
        this.field2521 = arg0;
        this.field2530 = arg1;
        int var3 = class8.method30(this.field2521, 2094643329);
        int var4 = class8.method30(this.field2530, 2094643329);
        if (this.field2531 == var3 && this.field2523 == var4) {
            return;
        }
        if (this.field2526 != null) {
            for (int var5 = 0; var5 < this.field2526.length; var5++) {
                this.field2526[var5].method2503();
            }
            this.field2526 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field2529 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field2529 == null) {
                        this.field2529 = new class288(this.field3532);
                    }
                    this.field2526 = new class13[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field2526[var11++] = new class13(this.field3532, 3553, 34842, var9, var10);
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
        this.field2531 = var3;
        this.field2523 = var4;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()Z")
    public final boolean method1072() {
        return this.field2528 != null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()Z")
    public final boolean method1073() {
        if (!this.field3532.field4579 || !this.field3532.field4496 || !this.field3532.field4488) {
            return false;
        }
        this.field2528 = new class288(this.field3532);
        this.field2519 = new class13(this.field3532, 3553, 34842, 256, 256);
        this.field2519.method93(false, false);
        this.field2527 = new class13(this.field3532, 3553, 34842, 256, 256);
        this.field2527.method93(false, false);
        this.field3532.method1969(this.field2528);
        this.field2528.method1799(0, this.field2519);
        this.field2528.method1799(1, this.field2527);
        this.field2528.method1800(0);
        if (!this.field2528.method1804()) {
            this.field3532.method2009(this.field2528);
            return false;
        }
        this.field3532.method2009(this.field2528);
        this.field2524 = class189.method1170(this.field3532, new class299[] { class299.method1841(this.field3532, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2522 = class189.method1170(this.field3532, new class299[] { class299.method1841(this.field3532, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2520 = class189.method1170(this.field3532, new class299[] { class299.method1841(this.field3532, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field2525 = class189.method1170(this.field3532, new class299[] { class299.method1841(this.field3532, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field2522 != null && this.field2524 != null && this.field2520 != null && this.field2525 != null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILkh;Lkh;)V")
    public final void method1074(int arg0, class13 arg1, class13 arg2) {
        opengl var4 = this.field3532.field4445;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2526 == null) {
            this.field3532.method1967(arg1);
            this.field3532.method1969(this.field2528);
            this.field2528.method1800(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field2524.field2811;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field2534, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field2521, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field2521, (float) this.field2530);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field2530);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field3532.method1969(this.field2529);
            int var5 = class8.method30(this.field2521, 2094643329);
            int var6 = class8.method30(this.field2530, 2094643329);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field2529.method1799(0, this.field2526[var7]);
                if (var7 == 0) {
                    this.field3532.method1967(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field2521, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field2521, (float) this.field2530);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field2530);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field3532.method1967(this.field2526[var7 - 1]);
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
            this.field3532.method2009(this.field2529);
            this.field3532.method1967(this.field2526[var7 - 1]);
            this.field3532.method1969(this.field2528);
            this.field2528.method1800(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field2522.field2811;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field2534, 0.0F, 0.0F);
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
        this.field2528.method1800(1);
        this.field3532.method1967(this.field2519);
        int var10 = this.field2525.field2811;
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
        this.field2528.method1800(0);
        this.field3532.method1967(this.field2527);
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
        this.field3532.method2009(this.field2528);
        int var11 = this.field2520.field2811;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field2532, field2533, 0.0F);
        this.field3532.method1972(1);
        this.field3532.method1967(this.field2519);
        this.field3532.method1972(0);
        this.field3532.method1967(arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public final void method1075(int arg0) {
        this.field3532.field4445.glUseProgramObjectARB(0);
        this.field3532.method1972(1);
        this.field3532.method1967((class425) null);
        this.field3532.method1972(0);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lmi;)V")
    public class175(class315 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "()Z")
    public final boolean method1076() {
        return this.field3532.field4579 && this.field3532.field4496 && this.field3532.field4488;
    }
}
