import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class288 extends class59 {

    @OriginalMember(owner = "client!am", name = "v", descriptor = "F")
    public static float field3915 = 1.0F;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "F")
    public static float field3912 = 1.0F;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "F")
    public static float field3914 = 0.25F;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    private int field3913;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    private int field3916;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    private int field3918;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    private int field3925;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Lrj;")
    private class12 field3911;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "Lrj;")
    private class12 field3917;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "Lrj;")
    private class12 field3921;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "Lrj;")
    private class12 field3923;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "Lhn;")
    private class257 field3920;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "Lhn;")
    private class257 field3922;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "Lqd;")
    private class3 field3919;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "Lqd;")
    private class3 field3924;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "[Lhn;")
    private class257[] field3926;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()Z", line = 12)
    public final boolean method464() {
        if (!this.field762.field4833 || !this.field762.field4851 || !this.field762.field4908) {
            return false;
        }
        this.field3924 = new class3(this.field762);
        this.field3922 = new class257(this.field762, 3553, 34842, 256, 256);
        this.field3922.method1659(false, false);
        this.field3920 = new class257(this.field762, 3553, 34842, 256, 256);
        this.field3920.method1659(false, false);
        this.field762.method2188(this.field3924);
        this.field3924.method9(0, this.field3922);
        this.field3924.method9(1, this.field3920);
        this.field3924.method10(0);
        if (!this.field3924.method15()) {
            this.field762.method2191(this.field3924);
            return false;
        }
        this.field762.method2191(this.field3924);
        this.field3911 = class12.method61(this.field762, new class198[] { class198.method1371(this.field762, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field3923 = class12.method61(this.field762, new class198[] { class198.method1371(this.field762, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field3917 = class12.method61(this.field762, new class198[] { class198.method1371(this.field762, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field3921 = class12.method61(this.field762, new class198[] { class198.method1371(this.field762, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field3923 != null && this.field3911 != null && this.field3917 != null && this.field3921 != null;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "()I", line = 40)
    public final int method471() {
        return 1;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()Z", line = 44)
    public final boolean method466() {
        return this.field3924 != null;
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "()Z", line = 51)
    public final boolean method1778() {
        return this.field762.field4833 && this.field762.field4851 && this.field762.field4908;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V", line = 59)
    public final void method468(int arg0, int arg1) {
        this.field3918 = arg0;
        this.field3913 = arg1;
        int var3 = class268.method1705(this.field3918, false);
        int var4 = class268.method1705(this.field3913, false);
        if (this.field3925 == var3 && this.field3916 == var4) {
            return;
        }
        if (this.field3926 != null) {
            for (int var5 = 0; var5 < this.field3926.length; var5++) {
                this.field3926[var5].method1963();
            }
            this.field3926 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field3919 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field3919 == null) {
                        this.field3919 = new class3(this.field762);
                    }
                    this.field3926 = new class257[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field3926[var11++] = new class257(this.field762, 3553, 34842, var9, var10);
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
        this.field3925 = var3;
        this.field3916 = var4;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILhn;Lhn;)V", line = 129)
    public final void method469(int arg0, class257 arg1, class257 arg2) {
        opengl var4 = this.field762.field4794;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3926 == null) {
            this.field762.method2180(arg1);
            this.field762.method2188(this.field3924);
            this.field3924.method10(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field3911.field111;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field3912, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field3918, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field3918, (float) this.field3913);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field3913);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field762.method2188(this.field3919);
            int var5 = class268.method1705(this.field3918, false);
            int var6 = class268.method1705(this.field3913, false);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field3919.method9(0, this.field3926[var7]);
                if (var7 == 0) {
                    this.field762.method2180(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field3918, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field3918, (float) this.field3913);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field3913);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field762.method2180(this.field3926[var7 - 1]);
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
            this.field762.method2191(this.field3919);
            this.field762.method2180(this.field3926[var7 - 1]);
            this.field762.method2188(this.field3924);
            this.field3924.method10(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field3923.field111;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field3912, 0.0F, 0.0F);
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
        this.field3924.method10(1);
        this.field762.method2180(this.field3922);
        int var10 = this.field3921.field111;
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
        this.field3924.method10(0);
        this.field762.method2180(this.field3920);
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
        this.field762.method2191(this.field3924);
        int var11 = this.field3917.field111;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field3914, field3915, 0.0F);
        this.field762.method2196(1);
        this.field762.method2180(this.field3922);
        this.field762.method2196(0);
        this.field762.method2180(arg1);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "()V", line = 277)
    public final void method467() {
        this.field3919 = null;
        this.field3926 = null;
        this.field3924 = null;
        this.field3922 = null;
        this.field3920 = null;
        this.field3911 = null;
        this.field3923 = null;
        this.field3917 = null;
        this.field3921 = null;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V", line = 290)
    public final void method463(int arg0) {
        this.field762.field4794.glUseProgramObjectARB(0);
        this.field762.method2196(1);
        this.field762.method2180((class321) null);
        this.field762.method2196(0);
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lmm;)V", line = 296)
    public class288(class357 arg0) {
        super(arg0);
    }
}
