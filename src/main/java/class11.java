import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class11 extends class78 {

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "F")
    public static float field100 = 0.25F;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "F")
    public static float field105 = 1.0F;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "F")
    public static float field103 = 1.0F;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "Ljo;")
    private class218 field104;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "Ljo;")
    private class218 field109;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Lta;")
    private class404 field101;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "Lta;")
    private class404 field107;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Lta;")
    private class404 field96;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Lta;")
    private class404 field97;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Lvr;")
    private class415 field95;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lvr;")
    private class415 field98;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "[Ljo;")
    private class218[] field102;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjo;Ljo;)V")
    public final void method47(int arg0, class218 arg1, class218 arg2) {
        opengl var4 = this.field879.field4697;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field102 == null) {
            this.field879.method2032(arg1);
            this.field879.method2102(this.field95);
            this.field95.method2574(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field97.field5881;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field103, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field99, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field99, (float) this.field106);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field106);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field879.method2102(this.field98);
            int var5 = class23.method123(11362, this.field99);
            int var6 = class23.method123(11362, this.field106);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field98.method2578(0, this.field102[var7]);
                if (var7 == 0) {
                    this.field879.method2032(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field99, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field99, (float) this.field106);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field106);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field879.method2032(this.field102[var7 - 1]);
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
            this.field879.method2100(this.field98);
            this.field879.method2032(this.field102[var7 - 1]);
            this.field879.method2102(this.field95);
            this.field95.method2574(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field101.field5881;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field103, 0.0F, 0.0F);
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
        this.field95.method2574(1);
        this.field879.method2032(this.field109);
        int var10 = this.field107.field5881;
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
        this.field95.method2574(0);
        this.field879.method2032(this.field104);
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
        this.field879.method2100(this.field95);
        int var11 = this.field96.field5881;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field100, field105, 0.0F);
        this.field879.method2052(1);
        this.field879.method2032(this.field109);
        this.field879.method2052(0);
        this.field879.method2032(arg1);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()I")
    public final int method48() {
        return 1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()Z")
    public final boolean method49() {
        if (!this.field879.field4754 || !this.field879.field4740 || !this.field879.field4747) {
            return false;
        }
        this.field95 = new class415(this.field879);
        this.field109 = new class218(this.field879, 3553, 34842, 256, 256);
        this.field109.method1171(false, false);
        this.field104 = new class218(this.field879, 3553, 34842, 256, 256);
        this.field104.method1171(false, false);
        this.field879.method2102(this.field95);
        this.field95.method2578(0, this.field109);
        this.field95.method2578(1, this.field104);
        this.field95.method2574(0);
        if (!this.field95.method2573()) {
            this.field879.method2100(this.field95);
            return false;
        }
        this.field879.method2100(this.field95);
        this.field97 = class404.method2532(this.field879, new class257[] { class257.method1449(this.field879, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field101 = class404.method2532(this.field879, new class257[] { class257.method1449(this.field879, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field96 = class404.method2532(this.field879, new class257[] { class257.method1449(this.field879, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field107 = class404.method2532(this.field879, new class257[] { class257.method1449(this.field879, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field101 != null && this.field97 != null && this.field96 != null && this.field107 != null;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
    public final void method50(int arg0) {
        this.field879.field4697.glUseProgramObjectARB(0);
        this.field879.method2052(1);
        this.field879.method2032((class50) null);
        this.field879.method2052(0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()Z")
    public final boolean method51() {
        return this.field95 != null;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "()Z")
    public final boolean method52() {
        return this.field879.field4754 && this.field879.field4740 && this.field879.field4747;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public final void method53(int arg0, int arg1) {
        this.field99 = arg0;
        this.field106 = arg1;
        int var3 = class23.method123(11362, this.field99);
        int var4 = class23.method123(11362, this.field106);
        if (this.field108 == var3 && this.field110 == var4) {
            return;
        }
        if (this.field102 != null) {
            for (int var5 = 0; var5 < this.field102.length; var5++) {
                this.field102[var5].method234();
            }
            this.field102 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field98 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field98 == null) {
                        this.field98 = new class415(this.field879);
                    }
                    this.field102 = new class218[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field102[var11++] = new class218(this.field879, 3553, 34842, var9, var10);
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
        this.field108 = var3;
        this.field110 = var4;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lql;)V")
    public class11(class346 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()V")
    public final void method54() {
        this.field98 = null;
        this.field102 = null;
        this.field95 = null;
        this.field109 = null;
        this.field104 = null;
        this.field97 = null;
        this.field101 = null;
        this.field96 = null;
        this.field107 = null;
    }
}
