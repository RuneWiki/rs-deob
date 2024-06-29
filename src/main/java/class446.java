import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class446 extends class437 {

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "F")
    public static float field6399 = 1.0F;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "F")
    public static float field6395 = 0.25F;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "F")
    public static float field6397 = 1.0F;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    private int field6394;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    private int field6400;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    private int field6403;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
    private int field6407;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "Lrj;")
    private class354 field6404;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "Lrj;")
    private class354 field6406;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "Lhc;")
    private class74 field6392;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "Lhc;")
    private class74 field6398;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "Lhc;")
    private class74 field6401;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "Lhc;")
    private class74 field6402;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "Lmg;")
    private class80 field6393;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "Lmg;")
    private class80 field6405;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "[Lrj;")
    private class354[] field6396;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "()Z")
    public final boolean method2740() {
        if (!this.field6280.field2016 || !this.field6280.field1983 || !this.field6280.field1993) {
            return false;
        }
        this.field6405 = new class80(this.field6280);
        this.field6404 = new class354(this.field6280, 3553, 34842, 256, 256);
        this.field6404.method2254(false, false);
        this.field6406 = new class354(this.field6280, 3553, 34842, 256, 256);
        this.field6406.method2254(false, false);
        this.field6280.method998(this.field6405);
        this.field6405.method445(0, this.field6404);
        this.field6405.method445(1, this.field6406);
        this.field6405.method454(0);
        if (!this.field6405.method447()) {
            this.field6280.method947(this.field6405);
            return false;
        }
        this.field6280.method947(this.field6405);
        this.field6402 = class74.method415(this.field6280, new class213[] { class213.method1436(this.field6280, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field6401 = class74.method415(this.field6280, new class213[] { class213.method1436(this.field6280, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field6398 = class74.method415(this.field6280, new class213[] { class213.method1436(this.field6280, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field6392 = class74.method415(this.field6280, new class213[] { class213.method1436(this.field6280, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field6401 != null && this.field6402 != null && this.field6398 != null && this.field6392 != null;
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "()Z")
    public final boolean method2772() {
        return this.field6280.field2016 && this.field6280.field1983 && this.field6280.field1993;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public final void method2737(int arg0) {
        this.field6280.field1927.glUseProgramObjectARB(0);
        this.field6280.method1001(1);
        this.field6280.method1003((class220) null);
        this.field6280.method1001(0);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
    public final void method2738(int arg0, int arg1) {
        this.field6394 = arg0;
        this.field6407 = arg1;
        int var3 = class292.method1933(-583426143, this.field6394);
        int var4 = class292.method1933(-583426143, this.field6407);
        if (this.field6400 == var3 && this.field6403 == var4) {
            return;
        }
        if (this.field6396 != null) {
            for (int var5 = 0; var5 < this.field6396.length; var5++) {
                this.field6396[var5].method1478();
            }
            this.field6396 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field6393 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field6393 == null) {
                        this.field6393 = new class80(this.field6280);
                    }
                    this.field6396 = new class354[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field6396[var11++] = new class354(this.field6280, 3553, 34842, var9, var10);
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
        this.field6400 = var3;
        this.field6403 = var4;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "()I")
    public final int method2736() {
        return 1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILrj;Lrj;)V")
    public final void method2734(int arg0, class354 arg1, class354 arg2) {
        opengl var4 = this.field6280.field1927;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6396 == null) {
            this.field6280.method1003(arg1);
            this.field6280.method998(this.field6405);
            this.field6405.method454(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field6402.field880;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field6399, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field6394, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field6394, (float) this.field6407);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field6407);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field6280.method998(this.field6393);
            int var5 = class292.method1933(-583426143, this.field6394);
            int var6 = class292.method1933(-583426143, this.field6407);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field6393.method445(0, this.field6396[var7]);
                if (var7 == 0) {
                    this.field6280.method1003(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field6394, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field6394, (float) this.field6407);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field6407);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field6280.method1003(this.field6396[var7 - 1]);
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
            this.field6280.method947(this.field6393);
            this.field6280.method1003(this.field6396[var7 - 1]);
            this.field6280.method998(this.field6405);
            this.field6405.method454(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field6401.field880;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field6399, 0.0F, 0.0F);
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
        this.field6405.method454(1);
        this.field6280.method1003(this.field6404);
        int var10 = this.field6392.field880;
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
        this.field6405.method454(0);
        this.field6280.method1003(this.field6406);
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
        this.field6280.method947(this.field6405);
        int var11 = this.field6398.field880;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field6395, field6397, 0.0F);
        this.field6280.method1001(1);
        this.field6280.method1003(this.field6404);
        this.field6280.method1001(0);
        this.field6280.method1003(arg1);
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "()Z")
    public final boolean method2741() {
        return this.field6405 != null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "()V")
    public final void method2733() {
        this.field6393 = null;
        this.field6396 = null;
        this.field6405 = null;
        this.field6404 = null;
        this.field6406 = null;
        this.field6402 = null;
        this.field6401 = null;
        this.field6398 = null;
        this.field6392 = null;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lao;)V")
    public class446(class157 arg0) {
        super(arg0);
    }
}
