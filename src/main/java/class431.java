import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class431 extends class295 {

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "F")
    public static float field6230 = 1.0F;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "F")
    public static float field6234 = 0.25F;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "F")
    public static float field6236 = 1.0F;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
    private int field6237;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
    private int field6238;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
    private int field6239;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    private int field6240;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "Ltr;")
    private class151 field6232;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "Ltr;")
    private class151 field6244;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "Ljs;")
    private class161 field6241;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "Ljs;")
    private class161 field6243;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "Lw;")
    private class253 field6231;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "Lw;")
    private class253 field6233;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "Lw;")
    private class253 field6235;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "Lw;")
    private class253 field6242;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "[Ltr;")
    private class151[] field6229;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "()I", line = 6)
    public final int method1852() {
        return 1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()V", line = 18)
    public final void method1847() {
        this.field6241 = null;
        this.field6229 = null;
        this.field6243 = null;
        this.field6244 = null;
        this.field6232 = null;
        this.field6233 = null;
        this.field6231 = null;
        this.field6242 = null;
        this.field6235 = null;
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "()Z", line = 30)
    public final boolean method2580() {
        return this.field4367.field3428 && this.field4367.field3419 && this.field4367.field3462;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 34)
    public final void method1856(int arg0, int arg1) {
        this.field6237 = arg0;
        this.field6240 = arg1;
        int var3 = class89.method446(-744346942, this.field6237);
        int var4 = class89.method446(-744346942, this.field6240);
        if (this.field6238 == var3 && this.field6239 == var4) {
            return;
        }
        if (this.field6229 != null) {
            for (int var5 = 0; var5 < this.field6229.length; var5++) {
                this.field6229[var5].method35();
            }
            this.field6229 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field6241 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field6241 == null) {
                        this.field6241 = new class161(this.field4367);
                    }
                    this.field6229 = new class151[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field6229[var11++] = new class151(this.field4367, 3553, 34842, var9, var10);
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
        this.field6238 = var3;
        this.field6239 = var4;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V", line = 106)
    public final void method1851(int arg0) {
        this.field4367.field3342.glUseProgramObjectARB(0);
        this.field4367.method1365(1);
        this.field4367.method1379((class5) null);
        this.field4367.method1365(0);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()Z", line = 117)
    public final boolean method1848() {
        return this.field6243 != null;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lic;)V", line = 122)
    public class431(class246 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "()Z", line = 129)
    public final boolean method1853() {
        if (!this.field4367.field3428 || !this.field4367.field3419 || !this.field4367.field3462) {
            return false;
        }
        this.field6243 = new class161(this.field4367);
        this.field6244 = new class151(this.field4367, 3553, 34842, 256, 256);
        this.field6244.method733(false, false);
        this.field6232 = new class151(this.field4367, 3553, 34842, 256, 256);
        this.field6232.method733(false, false);
        this.field4367.method1348(this.field6243);
        this.field6243.method779(0, this.field6244);
        this.field6243.method779(1, this.field6232);
        this.field6243.method780(0);
        if (!this.field6243.method778()) {
            this.field4367.method1454(this.field6243);
            return false;
        }
        this.field4367.method1454(this.field6243);
        this.field6233 = class253.method1566(this.field4367, new class133[] { class133.method632(this.field4367, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field6231 = class253.method1566(this.field4367, new class133[] { class133.method632(this.field4367, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field6242 = class253.method1566(this.field4367, new class133[] { class133.method632(this.field4367, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field6235 = class253.method1566(this.field4367, new class133[] { class133.method632(this.field4367, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field6231 != null && this.field6233 != null && this.field6242 != null && this.field6235 != null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILtr;Ltr;)V", line = 158)
    public final void method1855(int arg0, class151 arg1, class151 arg2) {
        opengl var4 = this.field4367.field3342;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6229 == null) {
            this.field4367.method1379(arg1);
            this.field4367.method1348(this.field6243);
            this.field6243.method780(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field6233.field3536;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field6236, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field6237, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field6237, (float) this.field6240);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field6240);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field4367.method1348(this.field6241);
            int var5 = class89.method446(-744346942, this.field6237);
            int var6 = class89.method446(-744346942, this.field6240);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field6241.method779(0, this.field6229[var7]);
                if (var7 == 0) {
                    this.field4367.method1379(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field6237, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field6237, (float) this.field6240);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field6240);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field4367.method1379(this.field6229[var7 - 1]);
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
            this.field4367.method1454(this.field6241);
            this.field4367.method1379(this.field6229[var7 - 1]);
            this.field4367.method1348(this.field6243);
            this.field6243.method780(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field6231.field3536;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field6236, 0.0F, 0.0F);
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
        this.field6243.method780(1);
        this.field4367.method1379(this.field6244);
        int var10 = this.field6235.field3536;
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
        this.field6243.method780(0);
        this.field4367.method1379(this.field6232);
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
        this.field4367.method1454(this.field6243);
        int var11 = this.field6242.field3536;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field6234, field6230, 0.0F);
        this.field4367.method1365(1);
        this.field4367.method1379(this.field6244);
        this.field4367.method1365(0);
        this.field4367.method1379(arg1);
    }
}
