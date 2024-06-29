import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class244 extends class117 {

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    private int field3854 = -1;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    private int field3856 = class249.field3913;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    private int field3862 = -1;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    private int field3853 = -1;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    private int field3855 = -1;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "F")
    public static float field3859 = 1.0F;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "F")
    public static float field3861 = 0.25F;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "F")
    public static float field3850 = 1.0F;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "Lsl;")
    private class114 field3851;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "Lsl;")
    private class114 field3852;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "Lsl;")
    private class114 field3857;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "Lsl;")
    private class114 field3858;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "[I")
    private int[] field3860;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V", line = 5)
    public final void method803(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class232.field3716;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3860 == null) {
            var6.glBindTexture(34037, arg3);
            class299.method2129(this.field3853);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field3858.field1735;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field3859, 0.0F, 0.0F);
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
            class299.method2129(this.field3854);
            int var7 = class119.method837(372938402, arg1);
            int var8 = class119.method837(372938402, arg2);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field3860[var9], 0);
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
                    class232.method1662(this.field3860[var9 - 1]);
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
            class299.method2130();
            class232.method1662(this.field3860[var9 - 1]);
            class299.method2129(this.field3853);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field3851.field1735;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field3859, 0.0F, 0.0F);
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
        class232.method1662(this.field3862);
        int var12 = this.field3852.field1735;
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
        class232.method1662(this.field3855);
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
        class299.method2130();
        int var13 = this.field3857.field1735;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field3861, field3850, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field3862);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()V", line = 155)
    public final void method806() {
        if (this.field3860 != null) {
            class232.field3716.glDeleteTextures(this.field3860.length, this.field3860, 0);
            this.field3860 = null;
        }
        if (this.field3854 != -1) {
            class299.method2127(this.field3854);
            this.field3854 = -1;
        }
        if (this.field3853 != -1) {
            class299.method2127(this.field3853);
            this.field3853 = -1;
        }
        if (this.field3862 != -1) {
            class249.method1765(this.field3862);
            this.field3862 = -1;
        }
        if (this.field3855 != -1) {
            class249.method1765(this.field3855);
            this.field3855 = -1;
        }
        this.field3858 = null;
        this.field3851 = null;
        this.field3857 = null;
        this.field3852 = null;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "()Z", line = 194)
    public final boolean method813() {
        if (!class232.field3692 || !class232.field3724 || !class232.field3726) {
            return false;
        }
        GL var1 = class232.field3716;
        this.field3853 = class299.method2136();
        this.field3862 = class249.method1768(class249.field3902, class249.field3908, 256, 256, class249.field3913, class249.field3913, class249.field3905, class249.field3916, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field3855 = class249.method1768(class249.field3902, class249.field3908, 256, 256, class249.field3913, class249.field3913, class249.field3905, class249.field3916, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class299.method2129(this.field3853);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field3862, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field3855, 0);
        var1.glDrawBuffer(36064);
        if (!class299.method2133()) {
            this.field3856 = class249.field3914;
            class232.method1662(this.field3862);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class232.method1662(this.field3855);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class299.method2133()) {
                class299.method2130();
                return false;
            }
        }
        class299.method2130();
        this.field3858 = class114.method790(new class132[] { class132.method969("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class132.field2080) });
        this.field3851 = class114.method790(new class132[] { class132.method969("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class132.field2080) });
        this.field3857 = class114.method790(new class132[] { class132.method969("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class132.field2080) });
        this.field3852 = class114.method790(new class132[] { class132.method969("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class132.field2080) });
        return this.field3851 != null && this.field3858 != null && this.field3857 != null && this.field3852 != null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()Z", line = 241)
    public final boolean method807() {
        return this.field3853 != -1;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "()I", line = 244)
    public final int method811() {
        return 1;
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V", line = 259)
    public final void method805(int arg0) {
        class232.field3716.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 277)
    public final void method808(int arg0, int arg1) {
        GL var3 = class232.field3716;
        int var4 = class119.method837(372938402, arg0);
        int var5 = class119.method837(372938402, arg1);
        if (this.field3860 != null) {
            var3.glDeleteTextures(this.field3860.length, this.field3860, 0);
            this.field3860 = null;
        }
        if (class249.field3913 == this.field3856 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field3854 == -1) {
                this.field3854 = class299.method2136();
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
            this.field3860 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field3860[var11++] = class249.method1768(class249.field3902, class249.field3908, var9, var10, class249.field3913, class249.field3913, class249.field3905, class249.field3916, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field3854 != -1) {
            class299.method2127(this.field3854);
            this.field3854 = -1;
        }
    }
}
