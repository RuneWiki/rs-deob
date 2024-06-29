import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class287 extends class156 {

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    private int field4393 = -1;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    private int field4390 = -1;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    private int field4396 = -1;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    private int field4395 = class32.field405;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    private int field4398 = -1;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "F")
    public static float field4388 = 1.0F;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "F")
    public static float field4394 = 1.0F;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "F")
    public static float field4389 = 0.25F;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "Lol;")
    private class263 field4391;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "Lol;")
    private class263 field4397;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "Lol;")
    private class263 field4399;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "Lol;")
    private class263 field4400;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "[I")
    private int[] field4392;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()V", line = 9)
    public final void method1085() {
        if (this.field4392 != null) {
            class333.field5160.glDeleteTextures(this.field4392.length, this.field4392, 0);
            this.field4392 = null;
        }
        if (this.field4393 != -1) {
            class127.method855(this.field4393);
            this.field4393 = -1;
        }
        if (this.field4396 != -1) {
            class127.method855(this.field4396);
            this.field4396 = -1;
        }
        if (this.field4390 != -1) {
            class32.method236(this.field4390);
            this.field4390 = -1;
        }
        if (this.field4398 != -1) {
            class32.method236(this.field4398);
            this.field4398 = -1;
        }
        this.field4397 = null;
        this.field4399 = null;
        this.field4400 = null;
        this.field4391 = null;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "()Z", line = 59)
    public final boolean method1089() {
        return this.field4396 != -1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()I", line = 73)
    public final int method1088() {
        return 1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIIII)V", line = 78)
    public final void method1092(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class333.field5160;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4392 == null) {
            var6.glBindTexture(34037, arg3);
            class127.method857(this.field4396);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field4397.field4061;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field4388, 0.0F, 0.0F);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(0, 0);
            var6.glTexCoord2f((float) arg1, 0.0F);
            var6.glVertex2i(1, 0);
            var6.glTexCoord2f((float) arg1, (float) arg2);
            var6.glVertex2i(1, 1);
            var6.glTexCoord2f(0.0F, (float) arg2);
            var6.glVertex2i(0, 1);
            var6.glEnd();
        } else {
            class127.method857(this.field4393);
            int var7 = class64.method463(arg1, (byte) -85);
            int var8 = class64.method463(arg2, (byte) -51);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4392[var9], 0);
                if (var9 == 0) {
                    var6.glEnable(34037);
                    var6.glBindTexture(34037, arg3);
                    var6.glBegin(7);
                    var6.glTexCoord2f(0.0F, 0.0F);
                    var6.glVertex2i(0, 0);
                    var6.glTexCoord2f((float) arg1, 0.0F);
                    var6.glVertex2i(1, 0);
                    var6.glTexCoord2f((float) arg1, (float) arg2);
                    var6.glVertex2i(1, 1);
                    var6.glTexCoord2f(0.0F, (float) arg2);
                    var6.glVertex2i(0, 1);
                    var6.glEnd();
                    var6.glDisable(34037);
                } else {
                    class333.method2282(this.field4392[var9 - 1]);
                    var6.glBegin(7);
                    var6.glTexCoord2f(0.0F, 0.0F);
                    var6.glVertex2i(0, 0);
                    var6.glTexCoord2f(1.0F, 0.0F);
                    var6.glVertex2i(1, 0);
                    var6.glTexCoord2f(1.0F, 1.0F);
                    var6.glVertex2i(1, 1);
                    var6.glTexCoord2f(0.0F, 1.0F);
                    var6.glVertex2i(0, 1);
                    var6.glEnd();
                }
                if (var7 != 256) {
                    var7 >>= 0x1;
                }
                if (var8 != 256) {
                    var8 >>= 0x1;
                }
                var9++;
            }
            class127.method851();
            class333.method2282(this.field4392[var9 - 1]);
            class127.method857(this.field4396);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field4399.field4061;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field4388, 0.0F, 0.0F);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(0, 0);
            var6.glTexCoord2f(1.0F, 0.0F);
            var6.glVertex2i(1, 0);
            var6.glTexCoord2f(1.0F, 1.0F);
            var6.glVertex2i(1, 1);
            var6.glTexCoord2f(0.0F, 1.0F);
            var6.glVertex2i(0, 1);
            var6.glEnd();
        }
        var6.glDrawBuffer(36065);
        class333.method2282(this.field4390);
        int var12 = this.field4391.field4061;
        var6.glUseProgramObjectARB(var12);
        var6.glUniform1iARB(var6.glGetUniformLocation(var12, "baseTex"), 0);
        var6.glUniform3fARB(var6.glGetUniformLocation(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        var6.glBegin(7);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(0, 0);
        var6.glTexCoord2f(1.0F, 0.0F);
        var6.glVertex2i(1, 0);
        var6.glTexCoord2f(1.0F, 1.0F);
        var6.glVertex2i(1, 1);
        var6.glTexCoord2f(0.0F, 1.0F);
        var6.glVertex2i(0, 1);
        var6.glEnd();
        var6.glDrawBuffer(36064);
        class333.method2282(this.field4398);
        var6.glUniform3fARB(var6.glGetUniformLocation(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        var6.glBegin(7);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(0, 0);
        var6.glTexCoord2f(1.0F, 0.0F);
        var6.glVertex2i(1, 0);
        var6.glTexCoord2f(1.0F, 1.0F);
        var6.glVertex2i(1, 1);
        var6.glTexCoord2f(0.0F, 1.0F);
        var6.glVertex2i(0, 1);
        var6.glEnd();
        var6.glPopAttrib();
        var6.glPopMatrix();
        var6.glMatrixMode(5888);
        class127.method851();
        int var13 = this.field4400.field4061;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field4389, field4394, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field4390);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "()Z", line = 236)
    public final boolean method1091() {
        if (!class333.field5142 || !class333.field5147 || !class333.field5172) {
            return false;
        }
        GL var1 = class333.field5160;
        this.field4396 = class127.method850();
        this.field4390 = class32.method239(class32.field394, class32.field400, 256, 256, class32.field405, class32.field405, class32.field397, class32.field408, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field4398 = class32.method239(class32.field394, class32.field400, 256, 256, class32.field405, class32.field405, class32.field397, class32.field408, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class127.method857(this.field4396);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4390, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field4398, 0);
        var1.glDrawBuffer(36064);
        if (!class127.method852()) {
            this.field4395 = class32.field406;
            class333.method2282(this.field4390);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class333.method2282(this.field4398);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class127.method852()) {
                class127.method851();
                return false;
            }
        }
        class127.method851();
        this.field4397 = class263.method1745(new class9[] { class9.method57("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class9.field89) });
        this.field4399 = class263.method1745(new class9[] { class9.method57("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class9.field89) });
        this.field4400 = class263.method1745(new class9[] { class9.method57("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class9.field89) });
        this.field4391 = class263.method1745(new class9[] { class9.method57("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class9.field89) });
        return this.field4399 != null && this.field4397 != null && this.field4400 != null && this.field4391 != null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V", line = 286)
    public final void method1084(int arg0, int arg1) {
        GL var3 = class333.field5160;
        int var4 = class64.method463(arg0, (byte) -86);
        int var5 = class64.method463(arg1, (byte) -98);
        if (this.field4392 != null) {
            var3.glDeleteTextures(this.field4392.length, this.field4392, 0);
            this.field4392 = null;
        }
        if (class32.field405 == this.field4395 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field4393 == -1) {
                this.field4393 = class127.method850();
            }
            while (var6 != 256 || var7 != 256) {
                if (var6 != 256) {
                    var6 >>= 0x1;
                }
                if (var7 != 256) {
                    var7 >>= 0x1;
                }
                var8++;
            }
            this.field4392 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field4392[var11++] = class32.method239(class32.field394, class32.field400, var9, var10, class32.field405, class32.field405, class32.field397, class32.field408, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field4393 != -1) {
            class127.method855(this.field4393);
            this.field4393 = -1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V", line = 345)
    public final void method1087(int arg0) {
        class333.field5160.glUseProgramObjectARB(0);
    }
}
