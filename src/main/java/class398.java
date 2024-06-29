import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class398 extends class40 {

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "F")
    public static float field5567 = 1.0F;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "F")
    public static float field5569 = 1.0F;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "F")
    public static float field5570 = 0.25F;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    private int field5568;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    private int field5571;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
    private int field5573;

    @OriginalMember(owner = "client!nt", name = "G", descriptor = "I")
    private int field5580;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "Lai;")
    private class201 field5565;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "Lai;")
    private class201 field5572;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "Lct;")
    private class273 field5566;

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "Lct;")
    private class273 field5579;

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "Lnn;")
    private class65 field5574;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "Lnn;")
    private class65 field5575;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "Lnn;")
    private class65 field5576;

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "Lnn;")
    private class65 field5578;

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "[Lai;")
    private class201[] field5577;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)V")
    public final void method327(int arg0, int arg1) {
        this.field5568 = arg0;
        this.field5573 = arg1;
        int var3 = class166.method1019(-20703, this.field5568);
        int var4 = class166.method1019(-20703, this.field5573);
        if (this.field5571 == var3 && this.field5580 == var4) {
            return;
        }
        if (this.field5577 != null) {
            for (int var5 = 0; var5 < this.field5577.length; var5++) {
                this.field5577[var5].method1166();
            }
            this.field5577 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field5566 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field5566 == null) {
                        this.field5566 = new class273(this.field676);
                    }
                    this.field5577 = new class201[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field5577[var11++] = new class201(this.field676, 3553, 34842, var9, var10);
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
        this.field5571 = var3;
        this.field5580 = var4;
    }

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "()Z")
    public final boolean method2369() {
        return this.field676.field6405 && this.field676.field6375 && this.field676.field6403;
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "()I")
    public final int method326() {
        return 1;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lqi;)V")
    public class398(class458 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "()Z")
    public final boolean method323() {
        if (!this.field676.field6405 || !this.field676.field6375 || !this.field676.field6403) {
            return false;
        }
        this.field5579 = new class273(this.field676);
        this.field5565 = new class201(this.field676, 3553, 34842, 256, 256);
        this.field5565.method1279(false, false);
        this.field5572 = new class201(this.field676, 3553, 34842, 256, 256);
        this.field5572.method1279(false, false);
        this.field676.method2680(this.field5579);
        this.field5579.method1715(0, this.field5565);
        this.field5579.method1715(1, this.field5572);
        this.field5579.method1714(0);
        if (!this.field5579.method1719()) {
            this.field676.method2657(this.field5579);
            return false;
        }
        this.field676.method2657(this.field5579);
        this.field5578 = class65.method465(this.field676, new class331[] { class331.method1973(this.field676, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field5575 = class65.method465(this.field676, new class331[] { class331.method1973(this.field676, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field5576 = class65.method465(this.field676, new class331[] { class331.method1973(this.field676, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field5574 = class65.method465(this.field676, new class331[] { class331.method1973(this.field676, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field5575 != null && this.field5578 != null && this.field5576 != null && this.field5574 != null;
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
    public final void method331(int arg0) {
        this.field676.field6330.glUseProgramObjectARB(0);
        this.field676.method2660(1);
        this.field676.method2692((class179) null);
        this.field676.method2660(0);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILai;Lai;)V")
    public final void method324(int arg0, class201 arg1, class201 arg2) {
        opengl var4 = this.field676.field6330;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5577 == null) {
            this.field676.method2692(arg1);
            this.field676.method2680(this.field5579);
            this.field5579.method1714(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field5578.field977;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field5569, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field5568, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field5568, (float) this.field5573);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field5573);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field676.method2680(this.field5566);
            int var5 = class166.method1019(-20703, this.field5568);
            int var6 = class166.method1019(-20703, this.field5573);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field5566.method1715(0, this.field5577[var7]);
                if (var7 == 0) {
                    this.field676.method2692(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field5568, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field5568, (float) this.field5573);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field5573);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field676.method2692(this.field5577[var7 - 1]);
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
            this.field676.method2657(this.field5566);
            this.field676.method2692(this.field5577[var7 - 1]);
            this.field676.method2680(this.field5579);
            this.field5579.method1714(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field5575.field977;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field5569, 0.0F, 0.0F);
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
        this.field5579.method1714(1);
        this.field676.method2692(this.field5565);
        int var10 = this.field5574.field977;
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
        this.field5579.method1714(0);
        this.field676.method2692(this.field5572);
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
        this.field676.method2657(this.field5579);
        int var11 = this.field5576.field977;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field5570, field5567, 0.0F);
        this.field676.method2660(1);
        this.field676.method2692(this.field5565);
        this.field676.method2660(0);
        this.field676.method2692(arg1);
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "()V")
    public final void method328() {
        this.field5566 = null;
        this.field5577 = null;
        this.field5579 = null;
        this.field5565 = null;
        this.field5572 = null;
        this.field5578 = null;
        this.field5575 = null;
        this.field5576 = null;
        this.field5574 = null;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "()Z")
    public final boolean method325() {
        return this.field5579 != null;
    }
}
