import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class303 extends class252 {

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    private int field4554 = -1;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    private int field4556 = -1;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    private int field4557 = -1;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    private int field4555 = class46.field568;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    private int field4559 = -1;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "F")
    public static float field4564 = 0.25F;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "F")
    public static float field4563 = 1.0F;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "F")
    public static float field4560 = 1.0F;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "Lqb;")
    private class227 field4558;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Lqb;")
    private class227 field4561;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "Lqb;")
    private class227 field4562;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "Lqb;")
    private class227 field4565;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "[I")
    private int[] field4553;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V", line = 9)
    public final void method1721(int arg0, int arg1) {
        GL var3 = class67.field899;
        int var4 = class234.method1613(arg0, true);
        int var5 = class234.method1613(arg1, true);
        if (this.field4553 != null) {
            var3.glDeleteTextures(this.field4553.length, this.field4553, 0);
            this.field4553 = null;
        }
        if (class46.field568 == this.field4555 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field4559 == -1) {
                this.field4559 = class105.method779();
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
            this.field4553 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field4553[var11++] = class46.method294(class46.field557, class46.field563, var9, var10, class46.field568, class46.field568, class46.field560, class46.field571, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field4559 != -1) {
            class105.method776(this.field4559);
            this.field4559 = -1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()Z", line = 81)
    public final boolean method1711() {
        return this.field4556 != -1;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()I", line = 87)
    public final int method1718() {
        return 1;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()Z", line = 93)
    public final boolean method1722() {
        if (!class67.field903 || !class67.field883 || !class67.field907) {
            return false;
        }
        GL var1 = class67.field899;
        this.field4556 = class105.method779();
        this.field4554 = class46.method294(class46.field557, class46.field563, 256, 256, class46.field568, class46.field568, class46.field560, class46.field571, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field4557 = class46.method294(class46.field557, class46.field563, 256, 256, class46.field568, class46.field568, class46.field560, class46.field571, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class105.method772(this.field4556);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4554, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field4557, 0);
        var1.glDrawBuffer(36064);
        if (!class105.method775()) {
            this.field4555 = class46.field569;
            class67.method479(this.field4554);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class67.method479(this.field4557);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class105.method775()) {
                class105.method770();
                return false;
            }
        }
        class105.method770();
        this.field4561 = class227.method1591(new class261[] { class261.method1787("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class261.field3838) });
        this.field4565 = class227.method1591(new class261[] { class261.method1787("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class261.field3838) });
        this.field4558 = class227.method1591(new class261[] { class261.method1787("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class261.field3838) });
        this.field4562 = class227.method1591(new class261[] { class261.method1787("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class261.field3838) });
        return this.field4565 != null && this.field4561 != null && this.field4558 != null && this.field4562 != null;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()V", line = 143)
    public final void method1725() {
        if (this.field4553 != null) {
            class67.field899.glDeleteTextures(this.field4553.length, this.field4553, 0);
            this.field4553 = null;
        }
        if (this.field4559 != -1) {
            class105.method776(this.field4559);
            this.field4559 = -1;
        }
        if (this.field4556 != -1) {
            class105.method776(this.field4556);
            this.field4556 = -1;
        }
        if (this.field4554 != -1) {
            class46.method292(this.field4554);
            this.field4554 = -1;
        }
        if (this.field4557 != -1) {
            class46.method292(this.field4557);
            this.field4557 = -1;
        }
        this.field4561 = null;
        this.field4565 = null;
        this.field4558 = null;
        this.field4562 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 184)
    public final void method1710(int arg0) {
        class67.field899.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V", line = 191)
    public final void method1714(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class67.field899;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4553 == null) {
            var6.glBindTexture(34037, arg3);
            class105.method772(this.field4556);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field4561.field3249;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field4563, 0.0F, 0.0F);
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
            class105.method772(this.field4559);
            int var7 = class234.method1613(arg1, true);
            int var8 = class234.method1613(arg2, true);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4553[var9], 0);
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
                    class67.method479(this.field4553[var9 - 1]);
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
            class105.method770();
            class67.method479(this.field4553[var9 - 1]);
            class105.method772(this.field4556);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field4565.field3249;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field4563, 0.0F, 0.0F);
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
        class67.method479(this.field4554);
        int var12 = this.field4562.field3249;
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
        class67.method479(this.field4557);
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
        class105.method770();
        int var13 = this.field4558.field3249;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field4564, field4560, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field4554);
        var6.glActiveTexture(33984);
    }
}
