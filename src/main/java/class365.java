import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class365 extends class309 {

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "F")
    public static float field5143 = 0.25F;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "F")
    public static float field5141 = 1.0F;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "F")
    public static float field5151 = 1.0F;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    private int field5145;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    private int field5146;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    private int field5148;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    private int field5152;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Ltf;")
    private class162 field5138;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "Ltf;")
    private class162 field5144;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "Ltf;")
    private class162 field5149;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "Ltf;")
    private class162 field5150;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lim;")
    private class342 field5140;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Lim;")
    private class342 field5147;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Lwq;")
    private class93 field5139;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Lwq;")
    private class93 field5142;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "[Lim;")
    private class342[] field5153;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILim;Lim;)V")
    public final void method1995(int arg0, class342 arg1, class342 arg2) {
        opengl var4 = this.field4247.field3184;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5153 == null) {
            this.field4247.method1559(arg1);
            this.field4247.method1514(this.field5142);
            this.field5142.method658(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field5149.field2251;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field5151, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field5152, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field5152, (float) this.field5148);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field5148);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field4247.method1514(this.field5139);
            int var5 = class414.method2594(this.field5152, (byte) -125);
            int var6 = class414.method2594(this.field5148, (byte) -125);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field5139.method663(0, this.field5153[var7]);
                if (var7 == 0) {
                    this.field4247.method1559(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field5152, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field5152, (float) this.field5148);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field5148);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field4247.method1559(this.field5153[var7 - 1]);
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
            this.field4247.method1557(this.field5139);
            this.field4247.method1559(this.field5153[var7 - 1]);
            this.field4247.method1514(this.field5142);
            this.field5142.method658(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field5144.field2251;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field5151, 0.0F, 0.0F);
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
        this.field5142.method658(1);
        this.field4247.method1559(this.field5147);
        int var10 = this.field5138.field2251;
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
        this.field5142.method658(0);
        this.field4247.method1559(this.field5140);
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
        this.field4247.method1557(this.field5142);
        int var11 = this.field5150.field2251;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field5143, field5141, 0.0F);
        this.field4247.method1566(1);
        this.field4247.method1559(this.field5147);
        this.field4247.method1566(0);
        this.field4247.method1559(arg1);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()Z")
    public final boolean method1994() {
        if (!this.field4247.field3309 || !this.field4247.field3220 || !this.field4247.field3269) {
            return false;
        }
        this.field5142 = new class93(this.field4247);
        this.field5147 = new class342(this.field4247, 3553, 34842, 256, 256);
        this.field5147.method2174(false, false);
        this.field5140 = new class342(this.field4247, 3553, 34842, 256, 256);
        this.field5140.method2174(false, false);
        this.field4247.method1514(this.field5142);
        this.field5142.method663(0, this.field5147);
        this.field5142.method663(1, this.field5140);
        this.field5142.method658(0);
        if (!this.field5142.method666()) {
            this.field4247.method1557(this.field5142);
            return false;
        }
        this.field4247.method1557(this.field5142);
        this.field5149 = class162.method1074(this.field4247, new class27[] { class27.method301(this.field4247, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field5144 = class162.method1074(this.field4247, new class27[] { class27.method301(this.field4247, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field5150 = class162.method1074(this.field4247, new class27[] { class27.method301(this.field4247, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field5138 = class162.method1074(this.field4247, new class27[] { class27.method301(this.field4247, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field5144 != null && this.field5149 != null && this.field5150 != null && this.field5138 != null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()I")
    public final int method1989() {
        return 1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public final void method1988(int arg0, int arg1) {
        this.field5152 = arg0;
        this.field5148 = arg1;
        int var3 = class414.method2594(this.field5152, (byte) -125);
        int var4 = class414.method2594(this.field5148, (byte) -125);
        if (this.field5146 == var3 && this.field5145 == var4) {
            return;
        }
        if (this.field5153 != null) {
            for (int var5 = 0; var5 < this.field5153.length; var5++) {
                this.field5153[var5].method871();
            }
            this.field5153 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field5139 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field5139 == null) {
                        this.field5139 = new class93(this.field4247);
                    }
                    this.field5153 = new class342[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field5153[var11++] = new class342(this.field4247, 3553, 34842, var9, var10);
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
        this.field5146 = var3;
        this.field5145 = var4;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ltb;)V")
    public class365(class227 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()Z")
    public final boolean method1990() {
        return this.field5142 != null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public final void method1992(int arg0) {
        this.field4247.field3184.glUseProgramObjectARB(0);
        this.field4247.method1566(1);
        this.field4247.method1559((class127) null);
        this.field4247.method1566(0);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()V")
    public final void method1991() {
        this.field5139 = null;
        this.field5153 = null;
        this.field5142 = null;
        this.field5147 = null;
        this.field5140 = null;
        this.field5149 = null;
        this.field5144 = null;
        this.field5150 = null;
        this.field5138 = null;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()Z")
    public final boolean method2357() {
        return this.field4247.field3309 && this.field4247.field3220 && this.field4247.field3269;
    }
}
