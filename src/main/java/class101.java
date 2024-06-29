import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class101 extends class52 {

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "F")
    public static float field1523 = 0.25F;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "F")
    public static float field1530 = 1.0F;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "F")
    public static float field1533 = 1.0F;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "Lrq;")
    private class195 field1518;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "Lrq;")
    private class195 field1524;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "Lq;")
    private class246 field1521;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "Lq;")
    private class246 field1522;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "Lq;")
    private class246 field1526;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "Lq;")
    private class246 field1529;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "Lvi;")
    private class317 field1519;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "Lvi;")
    private class317 field1531;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "[Lrq;")
    private class195[] field1525;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILrq;Lrq;)V")
    public final void method351(int arg0, class195 arg1, class195 arg2) {
        opengl var4 = this.field777.field4607;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1525 == null) {
            this.field777.method2165(arg1);
            this.field777.method2128(this.field1519);
            this.field1519.method2022(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field1529.field3414;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field1530, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field1520, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field1520, (float) this.field1527);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field1527);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field777.method2128(this.field1531);
            int var5 = class105.method718(256, this.field1520);
            int var6 = class105.method718(256, this.field1527);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field1531.method2017(0, this.field1525[var7]);
                if (var7 == 0) {
                    this.field777.method2165(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field1520, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field1520, (float) this.field1527);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field1527);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field777.method2165(this.field1525[var7 - 1]);
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
            this.field777.method2170(this.field1531);
            this.field777.method2165(this.field1525[var7 - 1]);
            this.field777.method2128(this.field1519);
            this.field1519.method2022(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field1521.field3414;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field1530, 0.0F, 0.0F);
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
        this.field1519.method2022(1);
        this.field777.method2165(this.field1518);
        int var10 = this.field1526.field3414;
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
        this.field1519.method2022(0);
        this.field777.method2165(this.field1524);
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
        this.field777.method2170(this.field1519);
        int var11 = this.field1522.field3414;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field1523, field1533, 0.0F);
        this.field777.method2162(1);
        this.field777.method2165(this.field1518);
        this.field777.method2162(0);
        this.field777.method2165(arg1);
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "()I")
    public final int method354() {
        return 1;
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
    public final void method356(int arg0) {
        this.field777.field4607.glUseProgramObjectARB(0);
        this.field777.method2162(1);
        this.field777.method2165((class133) null);
        this.field777.method2162(0);
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "()Z")
    public final boolean method707() {
        return this.field777.field4705 && this.field777.field4664 && this.field777.field4708;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
    public final void method352(int arg0, int arg1) {
        this.field1520 = arg0;
        this.field1527 = arg1;
        int var3 = class105.method718(256, this.field1520);
        int var4 = class105.method718(256, this.field1527);
        if (this.field1528 == var3 && this.field1532 == var4) {
            return;
        }
        if (this.field1525 != null) {
            for (int var5 = 0; var5 < this.field1525.length; var5++) {
                this.field1525[var5].method906();
            }
            this.field1525 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field1531 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field1531 == null) {
                        this.field1531 = new class317(this.field777);
                    }
                    this.field1525 = new class195[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field1525[var11++] = new class195(this.field777, 3553, 34842, var9, var10);
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
        this.field1528 = var3;
        this.field1532 = var4;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()V")
    public final void method348() {
        this.field1531 = null;
        this.field1525 = null;
        this.field1519 = null;
        this.field1518 = null;
        this.field1524 = null;
        this.field1529 = null;
        this.field1521 = null;
        this.field1522 = null;
        this.field1526 = null;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "()Z")
    public final boolean method353() {
        return this.field1519 != null;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lhj;)V")
    public class101(class338 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "()Z")
    public final boolean method349() {
        if (!this.field777.field4705 || !this.field777.field4664 || !this.field777.field4708) {
            return false;
        }
        this.field1519 = new class317(this.field777);
        this.field1518 = new class195(this.field777, 3553, 34842, 256, 256);
        this.field1518.method1295(false, false);
        this.field1524 = new class195(this.field777, 3553, 34842, 256, 256);
        this.field1524.method1295(false, false);
        this.field777.method2128(this.field1519);
        this.field1519.method2017(0, this.field1518);
        this.field1519.method2017(1, this.field1524);
        this.field1519.method2022(0);
        if (!this.field1519.method2016()) {
            this.field777.method2170(this.field1519);
            return false;
        }
        this.field777.method2170(this.field1519);
        this.field1529 = class246.method1538(this.field777, new class297[] { class297.method1921(this.field777, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field1521 = class246.method1538(this.field777, new class297[] { class297.method1921(this.field777, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field1522 = class246.method1538(this.field777, new class297[] { class297.method1921(this.field777, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field1526 = class246.method1538(this.field777, new class297[] { class297.method1921(this.field777, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field1521 != null && this.field1529 != null && this.field1522 != null && this.field1526 != null;
    }
}
