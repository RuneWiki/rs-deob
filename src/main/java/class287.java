import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class287 extends class267 {

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    private int field4478 = class114.field1760;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    private int field4474 = -1;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    private int field4479 = -1;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private int field4471 = -1;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    private int field4482 = -1;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "F")
    public static float field4473 = 0.25F;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "F")
    public static float field4472 = 1.0F;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "F")
    public static float field4477 = 1.0F;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Ljh;")
    private class245 field4470;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "Ljh;")
    private class245 field4476;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "Ljh;")
    private class245 field4480;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "Ljh;")
    private class245 field4481;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "[I")
    private int[] field4475;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()I", line = 9)
    public final int method1839() {
        return 1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 13)
    public final void method1834() {
        if (this.field4475 != null) {
            class94.field1473.glDeleteTextures(this.field4475.length, this.field4475, 0);
            this.field4475 = null;
        }
        if (this.field4474 != -1) {
            class151.method1041(this.field4474);
            this.field4474 = -1;
        }
        if (this.field4471 != -1) {
            class151.method1041(this.field4471);
            this.field4471 = -1;
        }
        if (this.field4482 != -1) {
            class114.method843(this.field4482);
            this.field4482 = -1;
        }
        if (this.field4479 != -1) {
            class114.method843(this.field4479);
            this.field4479 = -1;
        }
        this.field4470 = null;
        this.field4481 = null;
        this.field4480 = null;
        this.field4476 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V", line = 53)
    public final void method1838(int arg0, int arg1) {
        GL var3 = class94.field1473;
        int var4 = class324.method2201(arg0, -485);
        int var5 = class324.method2201(arg1, -485);
        if (this.field4475 != null) {
            var3.glDeleteTextures(this.field4475.length, this.field4475, 0);
            this.field4475 = null;
        }
        if (class114.field1760 == this.field4478 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field4474 == -1) {
                this.field4474 = class151.method1044();
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
            this.field4475 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field4475[var11++] = class114.method845(class114.field1749, class114.field1755, var9, var10, class114.field1760, class114.field1760, class114.field1752, class114.field1763, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field4474 != -1) {
            class151.method1041(this.field4474);
            this.field4474 = -1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()Z", line = 117)
    public final boolean method1842() {
        return this.field4471 != -1;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 123)
    public final void method1832(int arg0) {
        class94.field1473.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()Z", line = 127)
    public final boolean method1843() {
        if (!class94.field1511 || !class94.field1504 || !class94.field1510) {
            return false;
        }
        GL var1 = class94.field1473;
        this.field4471 = class151.method1044();
        this.field4482 = class114.method845(class114.field1749, class114.field1755, 256, 256, class114.field1760, class114.field1760, class114.field1752, class114.field1763, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field4479 = class114.method845(class114.field1749, class114.field1755, 256, 256, class114.field1760, class114.field1760, class114.field1752, class114.field1763, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class151.method1039(this.field4471);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4482, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field4479, 0);
        var1.glDrawBuffer(36064);
        if (!class151.method1045()) {
            this.field4478 = class114.field1761;
            class94.method698(this.field4482);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class94.method698(this.field4479);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class151.method1045()) {
                class151.method1042();
                return false;
            }
        }
        class151.method1042();
        this.field4470 = class245.method1695(new class283[] { class283.method1935("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class283.field4377) });
        this.field4481 = class245.method1695(new class283[] { class283.method1935("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class283.field4377) });
        this.field4480 = class245.method1695(new class283[] { class283.method1935("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class283.field4377) });
        this.field4476 = class245.method1695(new class283[] { class283.method1935("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class283.field4377) });
        return this.field4481 != null && this.field4470 != null && this.field4480 != null && this.field4476 != null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V", line = 192)
    public final void method1836(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class94.field1473;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4475 == null) {
            var6.glBindTexture(34037, arg3);
            class151.method1039(this.field4471);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field4470.field3910;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field4472, 0.0F, 0.0F);
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
            class151.method1039(this.field4474);
            int var7 = class324.method2201(arg1, -485);
            int var8 = class324.method2201(arg2, -485);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4475[var9], 0);
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
                    class94.method698(this.field4475[var9 - 1]);
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
            class151.method1042();
            class94.method698(this.field4475[var9 - 1]);
            class151.method1039(this.field4471);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field4481.field3910;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field4472, 0.0F, 0.0F);
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
        class94.method698(this.field4482);
        int var12 = this.field4476.field3910;
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
        class94.method698(this.field4479);
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
        class151.method1042();
        int var13 = this.field4480.field3910;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field4473, field4477, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field4482);
        var6.glActiveTexture(33984);
    }
}
