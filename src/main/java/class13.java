import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class13 extends class146 {

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    private int field192 = -1;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    private int field197 = -1;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    private int field202 = -1;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    private int field200 = class254.field3798;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    private int field199 = -1;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "F")
    public static float field195 = 1.0F;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "F")
    public static float field196 = 0.25F;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "F")
    public static float field198 = 1.0F;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "Ljd;")
    private class280 field193;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "Ljd;")
    private class280 field194;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Ljd;")
    private class280 field203;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "Ljd;")
    private class280 field204;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "[I")
    private int[] field201;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()Z", line = 6)
    public final boolean method73() {
        if (!class141.field2013 || !class141.field2022 || !class141.field2017) {
            return false;
        }
        GL var1 = class141.field2025;
        this.field199 = class63.method509();
        this.field192 = class254.method1864(class254.field3787, class254.field3793, 256, 256, class254.field3798, class254.field3798, class254.field3790, class254.field3801, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field202 = class254.method1864(class254.field3787, class254.field3793, 256, 256, class254.field3798, class254.field3798, class254.field3790, class254.field3801, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class63.method510(this.field199);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field192, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field202, 0);
        var1.glDrawBuffer(36064);
        if (!class63.method512()) {
            this.field200 = class254.field3799;
            class141.method1000(this.field192);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class141.method1000(this.field202);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class63.method512()) {
                class63.method516();
                return false;
            }
        }
        class63.method516();
        this.field193 = class280.method2042(new class337[] { class337.method2372("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class337.field5239) });
        this.field204 = class280.method2042(new class337[] { class337.method2372("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class337.field5239) });
        this.field203 = class280.method2042(new class337[] { class337.method2372("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class337.field5239) });
        this.field194 = class280.method2042(new class337[] { class337.method2372("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class337.field5239) });
        return this.field204 != null && this.field193 != null && this.field203 != null && this.field194 != null;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()V", line = 55)
    public final void method74() {
        if (this.field201 != null) {
            class141.field2025.glDeleteTextures(this.field201.length, this.field201, 0);
            this.field201 = null;
        }
        if (this.field197 != -1) {
            class63.method518(this.field197);
            this.field197 = -1;
        }
        if (this.field199 != -1) {
            class63.method518(this.field199);
            this.field199 = -1;
        }
        if (this.field192 != -1) {
            class254.method1862(this.field192);
            this.field192 = -1;
        }
        if (this.field202 != -1) {
            class254.method1862(this.field202);
            this.field202 = -1;
        }
        this.field193 = null;
        this.field204 = null;
        this.field203 = null;
        this.field194 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()Z", line = 91)
    public final boolean method75() {
        return this.field199 != -1;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V", line = 101)
    public final void method76(int arg0) {
        class141.field2025.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()I", line = 115)
    public final int method77() {
        return 1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V", line = 138)
    public final void method78(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class141.field2025;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field201 == null) {
            var6.glBindTexture(34037, arg3);
            class63.method510(this.field199);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field193.field4253;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field195, 0.0F, 0.0F);
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
            class63.method510(this.field197);
            int var7 = class98.method771((byte) -106, arg1);
            int var8 = class98.method771((byte) 89, arg2);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field201[var9], 0);
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
                    class141.method1000(this.field201[var9 - 1]);
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
                if (var7 > 256) {
                    var7 >>= 0x1;
                }
                if (var8 > 256) {
                    var8 >>= 0x1;
                }
                var9++;
            }
            class63.method516();
            class141.method1000(this.field201[var9 - 1]);
            class63.method510(this.field199);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field204.field4253;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field195, 0.0F, 0.0F);
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
        class141.method1000(this.field192);
        int var12 = this.field194.field4253;
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
        class141.method1000(this.field202);
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
        class63.method516();
        int var13 = this.field203.field4253;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field196, field198, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field192);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V", line = 289)
    public final void method79(int arg0, int arg1) {
        GL var3 = class141.field2025;
        int var4 = class98.method771((byte) 103, arg0);
        int var5 = class98.method771((byte) 124, arg1);
        if (this.field201 != null) {
            var3.glDeleteTextures(this.field201.length, this.field201, 0);
            this.field201 = null;
        }
        if (class254.field3798 == this.field200 && var4 > 256 || var5 > 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field197 == -1) {
                this.field197 = class63.method509();
            }
            while (var6 > 256 || var7 > 256) {
                if (var6 > 256) {
                    var6 >>= 0x1;
                }
                if (var7 > 256) {
                    var7 >>= 0x1;
                }
                var8++;
            }
            this.field201 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 > 256 || var10 > 256) {
                this.field201[var11++] = class254.method1864(class254.field3787, class254.field3793, var9, var10, class254.field3798, class254.field3798, class254.field3790, class254.field3801, (byte[]) null);
                if (var9 > 256) {
                    var9 >>= 0x1;
                }
                if (var10 > 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field197 != -1) {
            class63.method518(this.field197);
            this.field197 = -1;
        }
    }
}
