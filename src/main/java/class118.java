import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class118 extends class21 {

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    private int field2049 = -1;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    private int field2052 = -1;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    private int field2055 = -1;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    private int field2057 = -1;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    private int field2059 = class3.field49;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "F")
    public static float field2050 = 0.25F;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "F")
    public static float field2054 = 1.0F;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "F")
    public static float field2051 = 1.0F;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "Ljj;")
    private class164 field2053;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "Ljj;")
    private class164 field2056;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "Ljj;")
    private class164 field2060;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "Ljj;")
    private class164 field2061;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "[I")
    private int[] field2058;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V", line = 8)
    public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class43.field651;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2058 == null) {
            var6.glBindTexture(34037, arg3);
            class19.method196(this.field2055);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field2060.field2885;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field2051, 0.0F, 0.0F);
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
            class19.method196(this.field2049);
            int var7 = class48.method427(arg1, -9);
            int var8 = class48.method427(arg2, -9);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field2058[var9], 0);
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
                    class43.method390(this.field2058[var9 - 1]);
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
            class19.method191();
            class43.method390(this.field2058[var9 - 1]);
            class19.method196(this.field2055);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field2056.field2885;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field2051, 0.0F, 0.0F);
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
        class43.method390(this.field2052);
        int var12 = this.field2053.field2885;
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
        class43.method390(this.field2057);
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
        class19.method191();
        int var13 = this.field2061.field2885;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field2050, field2054, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field2052);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()I", line = 168)
    public final int method211() {
        return 1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()Z", line = 175)
    public final boolean method209() {
        return this.field2055 != -1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V", line = 179)
    public final void method208(int arg0, int arg1) {
        GL var3 = class43.field651;
        int var4 = class48.method427(arg0, -9);
        int var5 = class48.method427(arg1, -9);
        if (this.field2058 != null) {
            var3.glDeleteTextures(this.field2058.length, this.field2058, 0);
            this.field2058 = null;
        }
        if (class3.field49 == this.field2059 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field2049 == -1) {
                this.field2049 = class19.method188();
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
            this.field2058 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field2058[var11++] = class3.method12(class3.field38, class3.field44, var9, var10, class3.field49, class3.field49, class3.field41, class3.field52, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field2049 != -1) {
            class19.method187(this.field2049);
            this.field2049 = -1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 239)
    public final void method204(int arg0) {
        class43.field651.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 245)
    public final void method206() {
        if (this.field2058 != null) {
            class43.field651.glDeleteTextures(this.field2058.length, this.field2058, 0);
            this.field2058 = null;
        }
        if (this.field2049 != -1) {
            class19.method187(this.field2049);
            this.field2049 = -1;
        }
        if (this.field2055 != -1) {
            class19.method187(this.field2055);
            this.field2055 = -1;
        }
        if (this.field2052 != -1) {
            class3.method14(this.field2052);
            this.field2052 = -1;
        }
        if (this.field2057 != -1) {
            class3.method14(this.field2057);
            this.field2057 = -1;
        }
        this.field2060 = null;
        this.field2056 = null;
        this.field2061 = null;
        this.field2053 = null;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()Z", line = 299)
    public final boolean method219() {
        if (!class43.field664 || !class43.field663 || !class43.field656) {
            return false;
        }
        GL var1 = class43.field651;
        this.field2055 = class19.method188();
        this.field2052 = class3.method12(class3.field38, class3.field44, 256, 256, class3.field49, class3.field49, class3.field41, class3.field52, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field2057 = class3.method12(class3.field38, class3.field44, 256, 256, class3.field49, class3.field49, class3.field41, class3.field52, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class19.method196(this.field2055);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field2052, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field2057, 0);
        var1.glDrawBuffer(36064);
        if (!class19.method197()) {
            this.field2059 = class3.field50;
            class43.method390(this.field2052);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class43.method390(this.field2057);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class19.method197()) {
                class19.method191();
                return false;
            }
        }
        class19.method191();
        this.field2060 = class164.method1299(new class350[] { class350.method2442("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class350.field5551) });
        this.field2056 = class164.method1299(new class350[] { class350.method2442("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class350.field5551) });
        this.field2061 = class164.method1299(new class350[] { class350.method2442("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class350.field5551) });
        this.field2053 = class164.method1299(new class350[] { class350.method2442("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class350.field5551) });
        return this.field2056 != null && this.field2060 != null && this.field2061 != null && this.field2053 != null;
    }
}
