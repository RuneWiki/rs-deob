import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class37 extends class16 {

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "F")
    public static float field402 = 0.25F;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "F")
    public static float field412 = 1.0F;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "F")
    public static float field409 = 1.0F;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Lao;")
    private class260 field407;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "Lao;")
    private class260 field410;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lbj;")
    private class313 field401;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Lbj;")
    private class313 field408;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Lud;")
    private class84 field397;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Lud;")
    private class84 field399;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Lud;")
    private class84 field400;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "Lud;")
    private class84 field403;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "[Lbj;")
    private class313[] field405;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()V")
    public final void method91() {
        this.field410 = null;
        this.field405 = null;
        this.field407 = null;
        this.field401 = null;
        this.field408 = null;
        this.field400 = null;
        this.field403 = null;
        this.field399 = null;
        this.field397 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
    public final void method93(int arg0, int arg1) {
        this.field398 = arg0;
        this.field404 = arg1;
        int var3 = class246.method1611((byte) 117, this.field398);
        int var4 = class246.method1611((byte) -61, this.field404);
        if (this.field411 == var3 && this.field406 == var4) {
            return;
        }
        if (this.field405 != null) {
            for (int var5 = 0; var5 < this.field405.length; var5++) {
                this.field405[var5].method1495();
            }
            this.field405 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field410 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field410 == null) {
                        this.field410 = new class260(this.field181);
                    }
                    this.field405 = new class313[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field405[var11++] = new class313(this.field181, 3553, 34842, var9, var10);
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
        this.field411 = var3;
        this.field406 = var4;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lh;)V")
    public class37(class327 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()Z")
    public final boolean method92() {
        return this.field407 != null;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "()Z")
    public final boolean method239() {
        return this.field181.field4405 && this.field181.field4457 && this.field181.field4440;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
    public final int method89() {
        return 1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILbj;Lbj;)V")
    public final void method98(int arg0, class313 arg1, class313 arg2) {
        opengl var4 = this.field181.field4363;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field405 == null) {
            this.field181.method2088(arg1);
            this.field181.method2117(this.field407);
            this.field407.method1646(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field400.field983;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field409, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field398, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field398, (float) this.field404);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field404);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field181.method2117(this.field410);
            int var5 = class246.method1611((byte) -121, this.field398);
            int var6 = class246.method1611((byte) 120, this.field404);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field410.method1640(0, this.field405[var7]);
                if (var7 == 0) {
                    this.field181.method2088(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field398, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field398, (float) this.field404);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field404);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field181.method2088(this.field405[var7 - 1]);
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
            this.field181.method2103(this.field410);
            this.field181.method2088(this.field405[var7 - 1]);
            this.field181.method2117(this.field407);
            this.field407.method1646(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field403.field983;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field409, 0.0F, 0.0F);
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
        this.field407.method1646(1);
        this.field181.method2088(this.field401);
        int var10 = this.field397.field983;
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
        this.field407.method1646(0);
        this.field181.method2088(this.field408);
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
        this.field181.method2103(this.field407);
        int var11 = this.field399.field983;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field402, field412, 0.0F);
        this.field181.method2115(1);
        this.field181.method2088(this.field401);
        this.field181.method2115(0);
        this.field181.method2088(arg1);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()Z")
    public final boolean method95() {
        if (!this.field181.field4405 || !this.field181.field4457 || !this.field181.field4440) {
            return false;
        }
        this.field407 = new class260(this.field181);
        this.field401 = new class313(this.field181, 3553, 34842, 256, 256);
        this.field401.method1975(false, false);
        this.field408 = new class313(this.field181, 3553, 34842, 256, 256);
        this.field408.method1975(false, false);
        this.field181.method2117(this.field407);
        this.field407.method1640(0, this.field401);
        this.field407.method1640(1, this.field408);
        this.field407.method1646(0);
        if (!this.field407.method1644()) {
            this.field181.method2103(this.field407);
            return false;
        }
        this.field181.method2103(this.field407);
        this.field400 = class84.method520(this.field181, new class257[] { class257.method1631(this.field181, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field403 = class84.method520(this.field181, new class257[] { class257.method1631(this.field181, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field399 = class84.method520(this.field181, new class257[] { class257.method1631(this.field181, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field397 = class84.method520(this.field181, new class257[] { class257.method1631(this.field181, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field403 != null && this.field400 != null && this.field399 != null && this.field397 != null;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public final void method96(int arg0) {
        this.field181.field4363.glUseProgramObjectARB(0);
        this.field181.method2115(1);
        this.field181.method2088((class233) null);
        this.field181.method2115(0);
    }
}
