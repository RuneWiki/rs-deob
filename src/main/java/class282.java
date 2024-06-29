import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class282 extends class14 {

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    private int field4386 = class150.field2273;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    private int field4383 = -1;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    private int field4393 = -1;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    private int field4390 = -1;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    private int field4395 = -1;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "F")
    public static float field4384 = 0.25F;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "F")
    public static float field4388 = 1.0F;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "F")
    public static float field4385 = 1.0F;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "Lsi;")
    private class252 field4387;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "Lsi;")
    private class252 field4389;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Lsi;")
    private class252 field4391;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "Lsi;")
    private class252 field4392;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "[I")
    private int[] field4394;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "()I", line = 5)
    public final int method109() {
        return 1;
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)V", line = 13)
    public final void method111(int arg0) {
        class73.field1051.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIII)V", line = 17)
    public final void method114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class73.field1051;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4394 == null) {
            var6.glBindTexture(34037, arg3);
            class186.method1379(this.field4383);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field4387.field3805;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field4385, 0.0F, 0.0F);
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
            class186.method1379(this.field4393);
            int var7 = class224.method1595(arg1, -121);
            int var8 = class224.method1595(arg2, 83);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4394[var9], 0);
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
                    class73.method537(this.field4394[var9 - 1]);
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
            class186.method1377();
            class73.method537(this.field4394[var9 - 1]);
            class186.method1379(this.field4383);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field4392.field3805;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field4385, 0.0F, 0.0F);
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
        class73.method537(this.field4390);
        int var12 = this.field4391.field3805;
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
        class73.method537(this.field4395);
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
        class186.method1377();
        int var13 = this.field4389.field3805;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field4384, field4388, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field4390);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "()Z", line = 181)
    public final boolean method108() {
        return this.field4383 != -1;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "()Z", line = 193)
    public final boolean method110() {
        if (!class73.field1039 || !class73.field1069 || !class73.field1047) {
            return false;
        }
        GL var1 = class73.field1051;
        this.field4383 = class186.method1383();
        this.field4390 = class150.method1129(class150.field2262, class150.field2268, 256, 256, class150.field2273, class150.field2273, class150.field2265, class150.field2276, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field4395 = class150.method1129(class150.field2262, class150.field2268, 256, 256, class150.field2273, class150.field2273, class150.field2265, class150.field2276, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class186.method1379(this.field4383);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4390, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field4395, 0);
        var1.glDrawBuffer(36064);
        if (!class186.method1378()) {
            this.field4386 = class150.field2274;
            class73.method537(this.field4390);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class73.method537(this.field4395);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class186.method1378()) {
                class186.method1377();
                return false;
            }
        }
        class186.method1377();
        this.field4387 = class252.method1724(new class124[] { class124.method922("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class124.field1888) });
        this.field4392 = class252.method1724(new class124[] { class124.method922("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class124.field1888) });
        this.field4389 = class252.method1724(new class124[] { class124.method922("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class124.field1888) });
        this.field4391 = class252.method1724(new class124[] { class124.method922("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class124.field1888) });
        return this.field4392 != null && this.field4387 != null && this.field4389 != null && this.field4391 != null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 239)
    public final void method113(int arg0, int arg1) {
        GL var3 = class73.field1051;
        int var4 = class224.method1595(arg0, 101);
        int var5 = class224.method1595(arg1, -11);
        if (this.field4394 != null) {
            var3.glDeleteTextures(this.field4394.length, this.field4394, 0);
            this.field4394 = null;
        }
        if (class150.field2273 == this.field4386 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field4393 == -1) {
                this.field4393 = class186.method1383();
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
            this.field4394 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field4394[var11++] = class150.method1129(class150.field2262, class150.field2268, var9, var10, class150.field2273, class150.field2273, class150.field2265, class150.field2276, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field4393 != -1) {
            class186.method1376(this.field4393);
            this.field4393 = -1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "()V", line = 299)
    public final void method105() {
        if (this.field4394 != null) {
            class73.field1051.glDeleteTextures(this.field4394.length, this.field4394, 0);
            this.field4394 = null;
        }
        if (this.field4393 != -1) {
            class186.method1376(this.field4393);
            this.field4393 = -1;
        }
        if (this.field4383 != -1) {
            class186.method1376(this.field4383);
            this.field4383 = -1;
        }
        if (this.field4390 != -1) {
            class150.method1125(this.field4390);
            this.field4390 = -1;
        }
        if (this.field4395 != -1) {
            class150.method1125(this.field4395);
            this.field4395 = -1;
        }
        this.field4387 = null;
        this.field4392 = null;
        this.field4389 = null;
        this.field4391 = null;
    }
}
