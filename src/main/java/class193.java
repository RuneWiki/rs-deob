import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class193 extends class40 {

    @OriginalMember(owner = "client!u", name = "A", descriptor = "F")
    public static float field2702 = 1.0F;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "F")
    public static float field2694 = 1.0F;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "F")
    public static float field2703 = 0.25F;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    private int field2701;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    private int field2707;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lwg;")
    private class292 field2695;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Lwg;")
    private class292 field2697;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Lwg;")
    private class292 field2698;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Lwg;")
    private class292 field2700;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Ltj;")
    private class442 field2699;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Ltj;")
    private class442 field2708;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lqb;")
    private class89 field2693;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Lqb;")
    private class89 field2704;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "[Lqb;")
    private class89[] field2706;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V", line = 3)
    public final void method347(int arg0, int arg1) {
        this.field2707 = arg0;
        this.field2701 = arg1;
        int var3 = class164.method1087(this.field2707, 113);
        int var4 = class164.method1087(this.field2701, 125);
        if (this.field2696 == var3 && this.field2705 == var4) {
            return;
        }
        if (this.field2706 != null) {
            for (int var5 = 0; var5 < this.field2706.length; var5++) {
                this.field2706[var5].method1401();
            }
            this.field2706 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field2699 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field2699 == null) {
                        this.field2699 = new class442(this.field543);
                    }
                    this.field2706 = new class89[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field2706[var11++] = new class89(this.field543, 3553, 34842, var9, var10);
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
        this.field2696 = var3;
        this.field2705 = var4;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "()Z", line = 70)
    public final boolean method356() {
        if (!this.field543.field2311 || !this.field543.field2314 || !this.field543.field2372) {
            return false;
        }
        this.field2708 = new class442(this.field543);
        this.field2693 = new class89(this.field543, 3553, 34842, 256, 256);
        this.field2693.method599(false, false);
        this.field2704 = new class89(this.field543, 3553, 34842, 256, 256);
        this.field2704.method599(false, false);
        this.field543.method1131(this.field2708);
        this.field2708.method2713(0, this.field2693);
        this.field2708.method2713(1, this.field2704);
        this.field2708.method2710(0);
        if (!this.field2708.method2709()) {
            this.field543.method1182(this.field2708);
            return false;
        }
        this.field543.method1182(this.field2708);
        this.field2697 = class292.method1950(this.field543, new class162[] { class162.method1078(this.field543, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2700 = class292.method1950(this.field543, new class162[] { class162.method1078(this.field543, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2698 = class292.method1950(this.field543, new class162[] { class162.method1078(this.field543, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field2695 = class292.method1950(this.field543, new class162[] { class162.method1078(this.field543, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field2700 != null && this.field2697 != null && this.field2698 != null && this.field2695 != null;
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V", line = 99)
    public final void method355(int arg0) {
        this.field543.field2253.glUseProgramObjectARB(0);
        this.field543.method1150(1);
        this.field543.method1160((class205) null);
        this.field543.method1150(0);
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "()Z", line = 108)
    public final boolean method1340() {
        return this.field543.field2311 && this.field543.field2314 && this.field543.field2372;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I", line = 113)
    public final int method350() {
        return 1;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lks;)V", line = 126)
    public class193(class173 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILqb;Lqb;)V", line = 130)
    public final void method354(int arg0, class89 arg1, class89 arg2) {
        opengl var4 = this.field543.field2253;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2706 == null) {
            this.field543.method1160(arg1);
            this.field543.method1131(this.field2708);
            this.field2708.method2710(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field2697.field4263;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field2694, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field2707, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field2707, (float) this.field2701);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field2701);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field543.method1131(this.field2699);
            int var5 = class164.method1087(this.field2707, 119);
            int var6 = class164.method1087(this.field2701, 116);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field2699.method2713(0, this.field2706[var7]);
                if (var7 == 0) {
                    this.field543.method1160(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field2707, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field2707, (float) this.field2701);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field2701);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field543.method1160(this.field2706[var7 - 1]);
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
            this.field543.method1182(this.field2699);
            this.field543.method1160(this.field2706[var7 - 1]);
            this.field543.method1131(this.field2708);
            this.field2708.method2710(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field2700.field4263;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field2694, 0.0F, 0.0F);
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
        this.field2708.method2710(1);
        this.field543.method1160(this.field2693);
        int var10 = this.field2695.field4263;
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
        this.field2708.method2710(0);
        this.field543.method1160(this.field2704);
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
        this.field543.method1182(this.field2708);
        int var11 = this.field2698.field4263;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field2703, field2702, 0.0F);
        this.field543.method1150(1);
        this.field543.method1160(this.field2693);
        this.field543.method1150(0);
        this.field543.method1160(arg1);
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()Z", line = 278)
    public final boolean method351() {
        return this.field2708 != null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V", line = 289)
    public final void method348() {
        this.field2699 = null;
        this.field2706 = null;
        this.field2708 = null;
        this.field2693 = null;
        this.field2704 = null;
        this.field2697 = null;
        this.field2700 = null;
        this.field2698 = null;
        this.field2695 = null;
    }
}
