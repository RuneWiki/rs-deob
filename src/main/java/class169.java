import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class169 extends class49 {

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    private int field2345 = -1;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    private int field2341 = class209.field2969;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    private int field2346 = -1;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    private int field2349 = -1;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    private int field2343 = -1;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "F")
    public static float field2342 = 1.0F;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "F")
    public static float field2344 = 0.25F;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "F")
    public static float field2353 = 1.0F;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "Lta;")
    private class210 field2347;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Lta;")
    private class210 field2348;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "Lta;")
    private class210 field2350;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "Lta;")
    private class210 field2352;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "[I")
    private int[] field2351;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()Z", line = 9)
    public final boolean method293() {
        return this.field2349 != -1;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()I", line = 12)
    public final int method289() {
        return 1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V", line = 17)
    public final void method292(int arg0, int arg1) {
        GL var3 = class250.field3818;
        int var4 = class80.method475(1397417249, arg0);
        int var5 = class80.method475(1397417249, arg1);
        if (this.field2351 != null) {
            var3.glDeleteTextures(this.field2351.length, this.field2351, 0);
            this.field2351 = null;
        }
        if (class209.field2969 == this.field2341 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field2343 == -1) {
                this.field2343 = class297.method2102();
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
            this.field2351 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field2351[var11++] = class209.method1436(class209.field2958, class209.field2964, var9, var10, class209.field2969, class209.field2969, class209.field2961, class209.field2972, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field2343 != -1) {
            class297.method2098(this.field2343);
            this.field2343 = -1;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()Z", line = 79)
    public final boolean method300() {
        if (!class250.field3794 || !class250.field3790 || !class250.field3804) {
            return false;
        }
        GL var1 = class250.field3818;
        this.field2349 = class297.method2102();
        this.field2345 = class209.method1436(class209.field2958, class209.field2964, 256, 256, class209.field2969, class209.field2969, class209.field2961, class209.field2972, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field2346 = class209.method1436(class209.field2958, class209.field2964, 256, 256, class209.field2969, class209.field2969, class209.field2961, class209.field2972, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class297.method2101(this.field2349);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field2345, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field2346, 0);
        var1.glDrawBuffer(36064);
        if (!class297.method2099()) {
            this.field2341 = class209.field2970;
            class250.method1806(this.field2345);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class250.method1806(this.field2346);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class297.method2099()) {
                class297.method2100();
                return false;
            }
        }
        class297.method2100();
        this.field2347 = class210.method1444(new class294[] { class294.method2088("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class294.field4598) });
        this.field2350 = class210.method1444(new class294[] { class294.method2088("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class294.field4598) });
        this.field2348 = class210.method1444(new class294[] { class294.method2088("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class294.field4598) });
        this.field2352 = class210.method1444(new class294[] { class294.method2088("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class294.field4598) });
        return this.field2350 != null && this.field2347 != null && this.field2348 != null && this.field2352 != null;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 122)
    public final void method290(int arg0) {
        class250.field3818.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V", line = 146)
    public final void method294(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class250.field3818;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2351 == null) {
            var6.glBindTexture(34037, arg3);
            class297.method2101(this.field2349);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field2347.field2975;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field2353, 0.0F, 0.0F);
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
            class297.method2101(this.field2343);
            int var7 = class80.method475(1397417249, arg1);
            int var8 = class80.method475(1397417249, arg2);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field2351[var9], 0);
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
                    class250.method1806(this.field2351[var9 - 1]);
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
            class297.method2100();
            class250.method1806(this.field2351[var9 - 1]);
            class297.method2101(this.field2349);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field2350.field2975;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field2353, 0.0F, 0.0F);
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
        class250.method1806(this.field2345);
        int var12 = this.field2352.field2975;
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
        class250.method1806(this.field2346);
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
        class297.method2100();
        int var13 = this.field2348.field2975;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field2344, field2342, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field2345);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V", line = 299)
    public final void method286() {
        if (this.field2351 != null) {
            class250.field3818.glDeleteTextures(this.field2351.length, this.field2351, 0);
            this.field2351 = null;
        }
        if (this.field2343 != -1) {
            class297.method2098(this.field2343);
            this.field2343 = -1;
        }
        if (this.field2349 != -1) {
            class297.method2098(this.field2349);
            this.field2349 = -1;
        }
        if (this.field2345 != -1) {
            class209.method1442(this.field2345);
            this.field2345 = -1;
        }
        if (this.field2346 != -1) {
            class209.method1442(this.field2346);
            this.field2346 = -1;
        }
        this.field2347 = null;
        this.field2350 = null;
        this.field2348 = null;
        this.field2352 = null;
    }
}
