import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class304 extends class209 {

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "F")
    public static float field4339 = 1.0F;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "F")
    public static float field4351 = 0.25F;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "F")
    public static float field4353 = 1.0F;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    private int field4343;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    private int field4346;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    private int field4347;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lfc;")
    private class141 field4341;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Lfc;")
    private class141 field4349;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lfj;")
    private class395 field4340;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lfj;")
    private class395 field4344;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Lfj;")
    private class395 field4350;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Lfj;")
    private class395 field4352;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lib;")
    private class86 field4342;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "Lib;")
    private class86 field4354;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lfc;")
    private class141[] field4345;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lpo;)V")
    public class304(class332 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method1322(int arg0) {
        this.field2828.field4752.glUseProgramObjectARB(0);
        this.field2828.method2062(1);
        this.field2828.method2085((class439) null);
        this.field2828.method2062(0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()Z")
    public final boolean method1320() {
        if (!this.field2828.field4862 || !this.field2828.field4835 || !this.field2828.field4851) {
            return false;
        }
        this.field4354 = new class86(this.field2828);
        this.field4349 = new class141(this.field2828, 3553, 34842, 256, 256);
        this.field4349.method837(false, false);
        this.field4341 = new class141(this.field2828, 3553, 34842, 256, 256);
        this.field4341.method837(false, false);
        this.field2828.method2078(this.field4354);
        this.field4354.method467(0, this.field4349);
        this.field4354.method467(1, this.field4341);
        this.field4354.method471(0);
        if (!this.field4354.method473()) {
            this.field2828.method2104(this.field4354);
            return false;
        }
        this.field2828.method2104(this.field4354);
        this.field4352 = class395.method2518(this.field2828, new class183[] { class183.method1190(this.field2828, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field4340 = class395.method2518(this.field2828, new class183[] { class183.method1190(this.field2828, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field4350 = class395.method2518(this.field2828, new class183[] { class183.method1190(this.field2828, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field4344 = class395.method2518(this.field2828, new class183[] { class183.method1190(this.field2828, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field4340 != null && this.field4352 != null && this.field4350 != null && this.field4344 != null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILfc;Lfc;)V")
    public final void method1325(int arg0, class141 arg1, class141 arg2) {
        opengl var4 = this.field2828.field4752;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4345 == null) {
            this.field2828.method2085(arg1);
            this.field2828.method2078(this.field4354);
            this.field4354.method471(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field4352.field5772;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field4353, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field4343, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field4343, (float) this.field4347);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field4347);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field2828.method2078(this.field4342);
            int var5 = class406.method2564(123, this.field4343);
            int var6 = class406.method2564(-85, this.field4347);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field4342.method467(0, this.field4345[var7]);
                if (var7 == 0) {
                    this.field2828.method2085(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field4343, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field4343, (float) this.field4347);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field4347);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field2828.method2085(this.field4345[var7 - 1]);
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
            this.field2828.method2104(this.field4342);
            this.field2828.method2085(this.field4345[var7 - 1]);
            this.field2828.method2078(this.field4354);
            this.field4354.method471(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field4340.field5772;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field4353, 0.0F, 0.0F);
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
        this.field4354.method471(1);
        this.field2828.method2085(this.field4349);
        int var10 = this.field4344.field5772;
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
        this.field4354.method471(0);
        this.field2828.method2085(this.field4341);
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
        this.field2828.method2104(this.field4354);
        int var11 = this.field4350.field5772;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field4351, field4339, 0.0F);
        this.field2828.method2062(1);
        this.field2828.method2085(this.field4349);
        this.field2828.method2062(0);
        this.field2828.method2085(arg1);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
    public final void method1323() {
        this.field4342 = null;
        this.field4345 = null;
        this.field4354 = null;
        this.field4349 = null;
        this.field4341 = null;
        this.field4352 = null;
        this.field4340 = null;
        this.field4350 = null;
        this.field4344 = null;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()Z")
    public final boolean method1912() {
        return this.field2828.field4862 && this.field2828.field4835 && this.field2828.field4851;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()Z")
    public final boolean method1327() {
        return this.field4354 != null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public final void method1321(int arg0, int arg1) {
        this.field4343 = arg0;
        this.field4347 = arg1;
        int var3 = class406.method2564(110, this.field4343);
        int var4 = class406.method2564(20, this.field4347);
        if (this.field4346 == var3 && this.field4348 == var4) {
            return;
        }
        if (this.field4345 != null) {
            for (int var5 = 0; var5 < this.field4345.length; var5++) {
                this.field4345[var5].method2723();
            }
            this.field4345 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field4342 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field4342 == null) {
                        this.field4342 = new class86(this.field2828);
                    }
                    this.field4345 = new class141[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field4345[var11++] = new class141(this.field2828, 3553, 34842, var9, var10);
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
        this.field4346 = var3;
        this.field4348 = var4;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
    public final int method1324() {
        return 1;
    }
}
