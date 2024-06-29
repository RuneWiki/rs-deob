import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class300 extends class295 {

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    private int field4616 = -1;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    private int field4612 = -1;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    private int field4621 = class313.field4908;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    private int field4620 = -1;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    private int field4622 = -1;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "F")
    public static float field4615 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "F")
    public static float field4617 = 0.25F;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "F")
    public static float field4618 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "Lmi;")
    private class218 field4610;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "Lmi;")
    private class218 field4611;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Lmi;")
    private class218 field4613;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "Lmi;")
    private class218 field4614;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "[I")
    private int[] field4619;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()V", line = 4)
    public final void method2061() {
        if (this.field4619 != null) {
            class109.field1456.glDeleteTextures(this.field4619.length, this.field4619, 0);
            this.field4619 = null;
        }
        if (this.field4622 != -1) {
            class90.method647(this.field4622);
            this.field4622 = -1;
        }
        if (this.field4620 != -1) {
            class90.method647(this.field4620);
            this.field4620 = -1;
        }
        if (this.field4616 != -1) {
            class313.method2180(this.field4616);
            this.field4616 = -1;
        }
        if (this.field4612 != -1) {
            class313.method2180(this.field4612);
            this.field4612 = -1;
        }
        this.field4614 = null;
        this.field4611 = null;
        this.field4613 = null;
        this.field4610 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()Z", line = 41)
    public final boolean method2057() {
        if (!class109.field1480 || !class109.field1473 || !class109.field1457) {
            return false;
        }
        GL var1 = class109.field1456;
        this.field4620 = class90.method654();
        this.field4616 = class313.method2183(class313.field4897, class313.field4903, 256, 256, class313.field4908, class313.field4908, class313.field4900, class313.field4911, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field4612 = class313.method2183(class313.field4897, class313.field4903, 256, 256, class313.field4908, class313.field4908, class313.field4900, class313.field4911, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class90.method651(this.field4620);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4616, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field4612, 0);
        var1.glDrawBuffer(36064);
        if (!class90.method655()) {
            this.field4621 = class313.field4909;
            class109.method752(this.field4616);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class109.method752(this.field4612);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class90.method655()) {
                class90.method653();
                return false;
            }
        }
        class90.method653();
        this.field4614 = class218.method1608(new class28[] { class28.method255("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class28.field411) });
        this.field4611 = class218.method1608(new class28[] { class28.method255("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class28.field411) });
        this.field4613 = class218.method1608(new class28[] { class28.method255("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class28.field411) });
        this.field4610 = class218.method1608(new class28[] { class28.method255("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class28.field411) });
        return this.field4611 != null && this.field4614 != null && this.field4613 != null && this.field4610 != null;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "()I", line = 88)
    public final int method2066() {
        return 1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V", line = 96)
    public final void method2065(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class109.field1456;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4619 == null) {
            var6.glBindTexture(34037, arg3);
            class90.method651(this.field4620);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field4614.field3472;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field4618, 0.0F, 0.0F);
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
            class90.method651(this.field4622);
            int var7 = class225.method1654(-2, arg1);
            int var8 = class225.method1654(-2, arg2);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4619[var9], 0);
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
                    class109.method752(this.field4619[var9 - 1]);
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
            class90.method653();
            class109.method752(this.field4619[var9 - 1]);
            class90.method651(this.field4620);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field4611.field3472;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field4618, 0.0F, 0.0F);
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
        class109.method752(this.field4616);
        int var12 = this.field4610.field3472;
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
        class109.method752(this.field4612);
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
        class90.method653();
        int var13 = this.field4613.field3472;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field4617, field4615, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field4616);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()Z", line = 246)
    public final boolean method2058() {
        return this.field4620 != -1;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V", line = 267)
    public final void method2060(int arg0) {
        class109.field1456.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 275)
    public final void method2062(int arg0, int arg1) {
        GL var3 = class109.field1456;
        int var4 = class225.method1654(-2, arg0);
        int var5 = class225.method1654(-2, arg1);
        if (this.field4619 != null) {
            var3.glDeleteTextures(this.field4619.length, this.field4619, 0);
            this.field4619 = null;
        }
        if (class313.field4908 == this.field4621 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field4622 == -1) {
                this.field4622 = class90.method654();
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
            this.field4619 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field4619[var11++] = class313.method2183(class313.field4897, class313.field4903, var9, var10, class313.field4908, class313.field4908, class313.field4900, class313.field4911, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field4622 != -1) {
            class90.method647(this.field4622);
            this.field4622 = -1;
        }
    }
}
