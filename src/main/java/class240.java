import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class240 extends class82 {

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    private int field3590 = class287.field4500;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    private int field3592 = -1;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    private int field3593 = -1;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    private int field3600 = -1;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    private int field3598 = -1;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "F")
    public static float field3597 = 1.0F;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "F")
    public static float field3596 = 1.0F;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "F")
    public static float field3599 = 0.25F;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "Lla;")
    private class148 field3589;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "Lla;")
    private class148 field3591;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "Lla;")
    private class148 field3594;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "Lla;")
    private class148 field3595;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "[I")
    private int[] field3601;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 12)
    public final void method653(int arg0) {
        class162.field2654.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "()Z", line = 21)
    public final boolean method651() {
        if (!class162.field2655 || !class162.field2617 || !class162.field2634) {
            return false;
        }
        GL var1 = class162.field2654;
        this.field3598 = class46.method394();
        this.field3593 = class287.method2018(class287.field4489, class287.field4495, 256, 256, class287.field4500, class287.field4500, class287.field4492, class287.field4503, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field3592 = class287.method2018(class287.field4489, class287.field4495, 256, 256, class287.field4500, class287.field4500, class287.field4492, class287.field4503, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class46.method397(this.field3598);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field3593, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field3592, 0);
        var1.glDrawBuffer(36064);
        if (!class46.method392()) {
            this.field3590 = class287.field4501;
            class162.method1219(this.field3593);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class162.method1219(this.field3592);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class46.method392()) {
                class46.method398();
                return false;
            }
        }
        class46.method398();
        this.field3591 = class148.method1125(new class290[] { class290.method2039("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class290.field4559) });
        this.field3589 = class148.method1125(new class290[] { class290.method2039("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class290.field4559) });
        this.field3595 = class148.method1125(new class290[] { class290.method2039("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class290.field4559) });
        this.field3594 = class148.method1125(new class290[] { class290.method2039("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class290.field4559) });
        return this.field3589 != null && this.field3591 != null && this.field3595 != null && this.field3594 != null;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "()Z", line = 65)
    public final boolean method648() {
        return this.field3598 != -1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V", line = 69)
    public final void method640(int arg0, int arg1) {
        GL var3 = class162.field2654;
        int var4 = class284.method1990(true, arg0);
        int var5 = class284.method1990(true, arg1);
        if (this.field3601 != null) {
            var3.glDeleteTextures(this.field3601.length, this.field3601, 0);
            this.field3601 = null;
        }
        if (class287.field4500 == this.field3590 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field3600 == -1) {
                this.field3600 = class46.method394();
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
            this.field3601 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field3601[var11++] = class287.method2018(class287.field4489, class287.field4495, var9, var10, class287.field4500, class287.field4500, class287.field4492, class287.field4503, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field3600 != -1) {
            class46.method402(this.field3600);
            this.field3600 = -1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()V", line = 128)
    public final void method637() {
        if (this.field3601 != null) {
            class162.field2654.glDeleteTextures(this.field3601.length, this.field3601, 0);
            this.field3601 = null;
        }
        if (this.field3600 != -1) {
            class46.method402(this.field3600);
            this.field3600 = -1;
        }
        if (this.field3598 != -1) {
            class46.method402(this.field3598);
            this.field3598 = -1;
        }
        if (this.field3593 != -1) {
            class287.method2017(this.field3593);
            this.field3593 = -1;
        }
        if (this.field3592 != -1) {
            class287.method2017(this.field3592);
            this.field3592 = -1;
        }
        this.field3591 = null;
        this.field3589 = null;
        this.field3595 = null;
        this.field3594 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()I", line = 164)
    public final int method636() {
        return 1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIII)V", line = 191)
    public final void method643(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class162.field2654;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3601 == null) {
            var6.glBindTexture(34037, arg3);
            class46.method397(this.field3598);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field3591.field2424;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field3596, 0.0F, 0.0F);
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
            class46.method397(this.field3600);
            int var7 = class284.method1990(true, arg1);
            int var8 = class284.method1990(true, arg2);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field3601[var9], 0);
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
                    class162.method1219(this.field3601[var9 - 1]);
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
            class46.method398();
            class162.method1219(this.field3601[var9 - 1]);
            class46.method397(this.field3598);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field3589.field2424;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field3596, 0.0F, 0.0F);
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
        class162.method1219(this.field3593);
        int var12 = this.field3594.field2424;
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
        class162.method1219(this.field3592);
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
        class46.method398();
        int var13 = this.field3595.field2424;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field3599, field3597, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field3593);
        var6.glActiveTexture(33984);
    }
}
