import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class334 extends class415 {

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "F")
    public static float field4932 = 1.0F;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "F")
    public static float field4940 = 0.25F;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "F")
    public static float field4944 = 1.0F;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    private int field4933;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    private int field4939;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    private int field4941;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    private int field4947;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Leq;")
    private class140 field4935;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Leq;")
    private class140 field4945;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lcf;")
    private class141 field4934;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lcf;")
    private class141 field4936;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lcf;")
    private class141 field4938;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Lcf;")
    private class141 field4942;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lkq;")
    private class89 field4937;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Lkq;")
    private class89 field4946;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "[Leq;")
    private class140[] field4943;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "()Z", line = 6)
    public final boolean method2214() {
        return this.field6190.field4791 && this.field6190.field4782 && this.field6190.field4858;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V", line = 9)
    public final void method2215() {
        this.field4946 = null;
        this.field4943 = null;
        this.field4937 = null;
        this.field4935 = null;
        this.field4945 = null;
        this.field4936 = null;
        this.field4942 = null;
        this.field4938 = null;
        this.field4934 = null;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 23)
    public final void method2216(int arg0) {
        this.field6190.field4741.glUseProgramObjectARB(0);
        this.field6190.method2037(1);
        this.field6190.method2186((class223) null);
        this.field6190.method2037(0);
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "()I", line = 29)
    public final int method2217() {
        return 1;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lih;)V", line = 33)
    public class334(class330 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()Z", line = 41)
    public final boolean method2218() {
        return this.field4937 != null;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()Z", line = 44)
    public final boolean method2219() {
        if (!this.field6190.field4791 || !this.field6190.field4782 || !this.field6190.field4858) {
            return false;
        }
        this.field4937 = new class89(this.field6190);
        this.field4935 = new class140(this.field6190, 3553, 34842, 256, 256);
        this.field4935.method944(false, false);
        this.field4945 = new class140(this.field6190, 3553, 34842, 256, 256);
        this.field4945.method944(false, false);
        this.field6190.method2103(this.field4937);
        this.field4937.method559(0, this.field4935);
        this.field4937.method559(1, this.field4945);
        this.field4937.method552(0);
        if (!this.field4937.method557()) {
            this.field6190.method2159(this.field4937);
            return false;
        }
        this.field6190.method2159(this.field4937);
        this.field4936 = class141.method946(this.field6190, new class48[] { class48.method337(this.field6190, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field4942 = class141.method946(this.field6190, new class48[] { class48.method337(this.field6190, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field4938 = class141.method946(this.field6190, new class48[] { class48.method337(this.field6190, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field4934 = class141.method946(this.field6190, new class48[] { class48.method337(this.field6190, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field4942 != null && this.field4936 != null && this.field4938 != null && this.field4934 != null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V", line = 84)
    public final void method2220(int arg0, int arg1) {
        this.field4941 = arg0;
        this.field4939 = arg1;
        int var3 = class34.method278(this.field4941, (byte) 91);
        int var4 = class34.method278(this.field4939, (byte) 98);
        if (this.field4947 == var3 && this.field4933 == var4) {
            return;
        }
        if (this.field4943 != null) {
            for (int var5 = 0; var5 < this.field4943.length; var5++) {
                this.field4943[var5].method1386();
            }
            this.field4943 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field4946 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field4946 == null) {
                        this.field4946 = new class89(this.field6190);
                    }
                    this.field4943 = new class140[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field4943[var11++] = new class140(this.field6190, 3553, 34842, var9, var10);
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
        this.field4947 = var3;
        this.field4933 = var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILeq;Leq;)V", line = 158)
    public final void method2221(int arg0, class140 arg1, class140 arg2) {
        opengl var4 = this.field6190.field4741;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4943 == null) {
            this.field6190.method2186(arg1);
            this.field6190.method2103(this.field4937);
            this.field4937.method552(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field4936.field1868;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field4932, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field4941, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field4941, (float) this.field4939);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field4939);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field6190.method2103(this.field4946);
            int var5 = class34.method278(this.field4941, (byte) 81);
            int var6 = class34.method278(this.field4939, (byte) 120);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field4946.method559(0, this.field4943[var7]);
                if (var7 == 0) {
                    this.field6190.method2186(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field4941, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field4941, (float) this.field4939);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field4939);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field6190.method2186(this.field4943[var7 - 1]);
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
            this.field6190.method2159(this.field4946);
            this.field6190.method2186(this.field4943[var7 - 1]);
            this.field6190.method2103(this.field4937);
            this.field4937.method552(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field4942.field1868;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field4932, 0.0F, 0.0F);
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
        this.field4937.method552(1);
        this.field6190.method2186(this.field4935);
        int var10 = this.field4934.field1868;
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
        this.field4937.method552(0);
        this.field6190.method2186(this.field4945);
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
        this.field6190.method2159(this.field4937);
        int var11 = this.field4938.field1868;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field4940, field4944, 0.0F);
        this.field6190.method2037(1);
        this.field6190.method2186(this.field4935);
        this.field6190.method2037(0);
        this.field6190.method2186(arg1);
    }
}
