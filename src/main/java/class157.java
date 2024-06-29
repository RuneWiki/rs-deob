import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class157 extends class4 {

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "F")
    public static float field2475 = 1.0F;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "F")
    public static float field2482 = 1.0F;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "F")
    public static float field2484 = 0.25F;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    private int field2471;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    private int field2472;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    private int field2474;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
    private int field2483;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "Ljl;")
    private class146 field2470;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "Ljl;")
    private class146 field2476;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "Ljl;")
    private class146 field2479;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "Ljl;")
    private class146 field2481;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "Lai;")
    private class355 field2469;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "Lai;")
    private class355 field2478;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "Lql;")
    private class437 field2473;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "Lql;")
    private class437 field2480;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "[Lai;")
    private class355[] field2477;

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lsq;)V")
    public class157(class96 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILai;Lai;)V")
    public final void method74(int arg0, class355 arg1, class355 arg2) {
        opengl var4 = this.field82.field1156;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2477 == null) {
            this.field82.method688(arg1);
            this.field82.method679(this.field2480);
            this.field2480.method2693(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field2479.field2288;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field2475, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field2474, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field2474, (float) this.field2472);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field2472);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field82.method679(this.field2473);
            int var5 = class410.method2573(this.field2474, (byte) -121);
            int var6 = class410.method2573(this.field2472, (byte) -45);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field2473.method2696(0, this.field2477[var7]);
                if (var7 == 0) {
                    this.field82.method688(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field2474, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field2474, (float) this.field2472);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field2472);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field82.method688(this.field2477[var7 - 1]);
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
            this.field82.method698(this.field2473);
            this.field82.method688(this.field2477[var7 - 1]);
            this.field82.method679(this.field2480);
            this.field2480.method2693(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field2476.field2288;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field2475, 0.0F, 0.0F);
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
        this.field2480.method2693(1);
        this.field82.method688(this.field2478);
        int var10 = this.field2470.field2288;
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
        this.field2480.method2693(0);
        this.field82.method688(this.field2469);
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
        this.field82.method698(this.field2480);
        int var11 = this.field2481.field2288;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field2484, field2482, 0.0F);
        this.field82.method628(1);
        this.field82.method688(this.field2478);
        this.field82.method628(0);
        this.field82.method688(arg1);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()Z")
    public final boolean method71() {
        if (!this.field82.field1196 || !this.field82.field1287 || !this.field82.field1222) {
            return false;
        }
        this.field2480 = new class437(this.field82);
        this.field2478 = new class355(this.field82, 3553, 34842, 256, 256);
        this.field2478.method2309(false, false);
        this.field2469 = new class355(this.field82, 3553, 34842, 256, 256);
        this.field2469.method2309(false, false);
        this.field82.method679(this.field2480);
        this.field2480.method2696(0, this.field2478);
        this.field2480.method2696(1, this.field2469);
        this.field2480.method2693(0);
        if (!this.field2480.method2695()) {
            this.field82.method698(this.field2480);
            return false;
        }
        this.field82.method698(this.field2480);
        this.field2479 = class146.method1052(this.field82, new class360[] { class360.method2339(this.field82, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2476 = class146.method1052(this.field82, new class360[] { class360.method2339(this.field82, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2481 = class146.method1052(this.field82, new class360[] { class360.method2339(this.field82, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field2470 = class146.method1052(this.field82, new class360[] { class360.method2339(this.field82, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field2476 != null && this.field2479 != null && this.field2481 != null && this.field2470 != null;
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "()Z")
    public final boolean method1107() {
        return this.field82.field1196 && this.field82.field1287 && this.field82.field1222;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()V")
    public final void method73() {
        this.field2473 = null;
        this.field2477 = null;
        this.field2480 = null;
        this.field2478 = null;
        this.field2469 = null;
        this.field2479 = null;
        this.field2476 = null;
        this.field2481 = null;
        this.field2470 = null;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()I")
    public final int method75() {
        return 1;
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
    public final void method72(int arg0) {
        this.field82.field1156.glUseProgramObjectARB(0);
        this.field82.method628(1);
        this.field82.method688((class293) null);
        this.field82.method628(0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
    public final void method77(int arg0, int arg1) {
        this.field2474 = arg0;
        this.field2472 = arg1;
        int var3 = class410.method2573(this.field2474, (byte) -13);
        int var4 = class410.method2573(this.field2472, (byte) -22);
        if (this.field2483 == var3 && this.field2471 == var4) {
            return;
        }
        if (this.field2477 != null) {
            for (int var5 = 0; var5 < this.field2477.length; var5++) {
                this.field2477[var5].method1982();
            }
            this.field2477 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field2473 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field2473 == null) {
                        this.field2473 = new class437(this.field82);
                    }
                    this.field2477 = new class355[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field2477[var11++] = new class355(this.field82, 3553, 34842, var9, var10);
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
        this.field2483 = var3;
        this.field2471 = var4;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()Z")
    public final boolean method70() {
        return this.field2480 != null;
    }
}
