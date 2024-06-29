import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class237 extends class29 {

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "F")
    public static float field3478 = 1.0F;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "F")
    public static float field3480 = 1.0F;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "F")
    public static float field3479 = 0.25F;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    private int field3469;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    private int field3474;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    private int field3475;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    private int field3483;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Lhf;")
    private class225 field3471;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "Lhf;")
    private class225 field3482;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Lie;")
    private class4 field3470;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Lie;")
    private class4 field3472;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "Lie;")
    private class4 field3476;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "Lie;")
    private class4 field3481;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "Lgg;")
    private class95 field3473;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "Lgg;")
    private class95 field3484;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "[Lhf;")
    private class225[] field3477;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()V")
    public final void method158() {
        this.field3484 = null;
        this.field3477 = null;
        this.field3473 = null;
        this.field3471 = null;
        this.field3482 = null;
        this.field3470 = null;
        this.field3481 = null;
        this.field3472 = null;
        this.field3476 = null;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "()Z")
    public final boolean method1620() {
        return this.field361.field1969 && this.field361.field1988 && this.field361.field1953;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()I")
    public final int method159() {
        return 1;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()Z")
    public final boolean method164() {
        if (!this.field361.field1969 || !this.field361.field1988 || !this.field361.field1953) {
            return false;
        }
        this.field3473 = new class95(this.field361);
        this.field3471 = new class225(this.field361, 3553, 34842, 256, 256);
        this.field3471.method1580(false, false);
        this.field3482 = new class225(this.field361, 3553, 34842, 256, 256);
        this.field3482.method1580(false, false);
        this.field361.method872(this.field3473);
        this.field3473.method560(0, this.field3471);
        this.field3473.method560(1, this.field3482);
        this.field3473.method566(0);
        if (!this.field3473.method563()) {
            this.field361.method966(this.field3473);
            return false;
        }
        this.field361.method966(this.field3473);
        this.field3470 = class4.method14(this.field361, new class38[] { class38.method253(this.field361, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field3481 = class4.method14(this.field361, new class38[] { class38.method253(this.field361, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field3472 = class4.method14(this.field361, new class38[] { class38.method253(this.field361, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field3476 = class4.method14(this.field361, new class38[] { class38.method253(this.field361, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field3481 != null && this.field3470 != null && this.field3472 != null && this.field3476 != null;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field361.field1918.glUseProgramObjectARB(0);
        this.field361.method1002(1);
        this.field361.method888((class404) null);
        this.field361.method1002(0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILhf;Lhf;)V")
    public final void method161(int arg0, class225 arg1, class225 arg2) {
        opengl var4 = this.field361.field1918;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3477 == null) {
            this.field361.method888(arg1);
            this.field361.method872(this.field3473);
            this.field3473.method566(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field3470.field67;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field3480, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field3469, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field3469, (float) this.field3474);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field3474);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field361.method872(this.field3484);
            int var5 = class434.method2709(this.field3469, (byte) 105);
            int var6 = class434.method2709(this.field3474, (byte) 105);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field3484.method560(0, this.field3477[var7]);
                if (var7 == 0) {
                    this.field361.method888(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field3469, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field3469, (float) this.field3474);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field3474);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field361.method888(this.field3477[var7 - 1]);
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
            this.field361.method966(this.field3484);
            this.field361.method888(this.field3477[var7 - 1]);
            this.field361.method872(this.field3473);
            this.field3473.method566(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field3481.field67;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field3480, 0.0F, 0.0F);
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
        this.field3473.method566(1);
        this.field361.method888(this.field3471);
        int var10 = this.field3476.field67;
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
        this.field3473.method566(0);
        this.field361.method888(this.field3482);
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
        this.field361.method966(this.field3473);
        int var11 = this.field3472.field67;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field3479, field3478, 0.0F);
        this.field361.method1002(1);
        this.field361.method888(this.field3471);
        this.field361.method1002(0);
        this.field361.method888(arg1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()Z")
    public final boolean method157() {
        return this.field3473 != null;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lig;)V")
    public class237(class132 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    public final void method165(int arg0, int arg1) {
        this.field3469 = arg0;
        this.field3474 = arg1;
        int var3 = class434.method2709(this.field3469, (byte) 105);
        int var4 = class434.method2709(this.field3474, (byte) 105);
        if (this.field3483 == var3 && this.field3475 == var4) {
            return;
        }
        if (this.field3477 != null) {
            for (int var5 = 0; var5 < this.field3477.length; var5++) {
                this.field3477[var5].method2532();
            }
            this.field3477 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field3484 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field3484 == null) {
                        this.field3484 = new class95(this.field361);
                    }
                    this.field3477 = new class225[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field3477[var11++] = new class225(this.field361, 3553, 34842, var9, var10);
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
        this.field3483 = var3;
        this.field3475 = var4;
    }
}
