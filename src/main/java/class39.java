import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class39 extends class165 {

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private int field586 = -1;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    private int field587 = class183.field2880;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    private int field593 = -1;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    private int field591 = -1;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    private int field596 = -1;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "F")
    public static float field584 = 1.0F;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "F")
    public static float field588 = 0.25F;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "F")
    public static float field592 = 1.0F;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Lfg;")
    private class152 field585;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Lfg;")
    private class152 field590;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "Lfg;")
    private class152 field594;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "Lfg;")
    private class152 field595;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "[I")
    private int[] field589;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 6)
    public final void method383(int arg0) {
        class240.field3771.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V", line = 11)
    public final void method384(int arg0, int arg1) {
        GL var3 = class240.field3771;
        int var4 = class337.method2370((byte) 84, arg0);
        int var5 = class337.method2370((byte) 84, arg1);
        if (this.field589 != null) {
            var3.glDeleteTextures(this.field589.length, this.field589, 0);
            this.field589 = null;
        }
        if (class183.field2880 == this.field587 && var4 > 256 || var5 > 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field596 == -1) {
                this.field596 = class17.method179();
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
            this.field589 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 > 256 || var10 > 256) {
                this.field589[var11++] = class183.method1416(class183.field2869, class183.field2875, var9, var10, class183.field2880, class183.field2880, class183.field2872, class183.field2883, (byte[]) null);
                if (var9 > 256) {
                    var9 >>= 0x1;
                }
                if (var10 > 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field596 != -1) {
            class17.method173(this.field596);
            this.field596 = -1;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Z", line = 71)
    public final boolean method385() {
        return this.field586 != -1;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()V", line = 81)
    public final void method386() {
        if (this.field589 != null) {
            class240.field3771.glDeleteTextures(this.field589.length, this.field589, 0);
            this.field589 = null;
        }
        if (this.field596 != -1) {
            class17.method173(this.field596);
            this.field596 = -1;
        }
        if (this.field586 != -1) {
            class17.method173(this.field586);
            this.field586 = -1;
        }
        if (this.field593 != -1) {
            class183.method1415(this.field593);
            this.field593 = -1;
        }
        if (this.field591 != -1) {
            class183.method1415(this.field591);
            this.field591 = -1;
        }
        this.field590 = null;
        this.field594 = null;
        this.field595 = null;
        this.field585 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V", line = 122)
    public final void method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class240.field3771;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field589 == null) {
            var6.glBindTexture(34037, arg3);
            class17.method181(this.field586);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field590.field2475;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field592, 0.0F, 0.0F);
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
            class17.method181(this.field596);
            int var7 = class337.method2370((byte) 84, arg1);
            int var8 = class337.method2370((byte) 84, arg2);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field589[var9], 0);
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
                    class240.method1786(this.field589[var9 - 1]);
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
            class17.method177();
            class240.method1786(this.field589[var9 - 1]);
            class17.method181(this.field586);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field594.field2475;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field592, 0.0F, 0.0F);
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
        class240.method1786(this.field593);
        int var12 = this.field585.field2475;
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
        class240.method1786(this.field591);
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
        class17.method177();
        int var13 = this.field595.field2475;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field588, field584, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field593);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Z", line = 284)
    public final boolean method388() {
        if (!class240.field3730 || !class240.field3729 || !class240.field3750) {
            return false;
        }
        GL var1 = class240.field3771;
        this.field586 = class17.method179();
        this.field593 = class183.method1416(class183.field2869, class183.field2875, 256, 256, class183.field2880, class183.field2880, class183.field2872, class183.field2883, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field591 = class183.method1416(class183.field2869, class183.field2875, 256, 256, class183.field2880, class183.field2880, class183.field2872, class183.field2883, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class17.method181(this.field586);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field593, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field591, 0);
        var1.glDrawBuffer(36064);
        if (!class17.method175()) {
            this.field587 = class183.field2881;
            class240.method1786(this.field593);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class240.method1786(this.field591);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class17.method175()) {
                class17.method177();
                return false;
            }
        }
        class17.method177();
        this.field590 = class152.method1257(new class8[] { class8.method93("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class8.field118) });
        this.field594 = class152.method1257(new class8[] { class8.method93("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class8.field118) });
        this.field595 = class152.method1257(new class8[] { class8.method93("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class8.field118) });
        this.field585 = class152.method1257(new class8[] { class8.method93("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class8.field118) });
        return this.field594 != null && this.field590 != null && this.field595 != null && this.field585 != null;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()I", line = 345)
    public final int method389() {
        return 1;
    }
}
