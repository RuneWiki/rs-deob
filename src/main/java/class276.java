import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class276 extends class183 {

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    private int field4551 = -1;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    private int field4556 = -1;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    private int field4560 = -1;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    private int field4561 = class119.field2014;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    private int field4563 = -1;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "F")
    public static float field4552 = 1.0F;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "F")
    public static float field4562 = 1.0F;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "F")
    public static float field4559 = 0.25F;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "Lwd;")
    private class82 field4553;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "Lwd;")
    private class82 field4554;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "Lwd;")
    private class82 field4555;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "Lwd;")
    private class82 field4558;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "[I")
    private int[] field4557;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "()I", line = 5)
    public final int method1445() {
        return 1;
    }

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)V", line = 10)
    public final void method1449(int arg0) {
        class42.field627.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "()Z", line = 20)
    public final boolean method1448() {
        if (!class42.field606 || !class42.field633 || !class42.field608) {
            return false;
        }
        GL var1 = class42.field627;
        this.field4563 = class212.method1599();
        this.field4556 = class119.method938(class119.field2003, class119.field2009, 256, 256, class119.field2014, class119.field2014, class119.field2006, class119.field2017, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field4560 = class119.method938(class119.field2003, class119.field2009, 256, 256, class119.field2014, class119.field2014, class119.field2006, class119.field2017, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class212.method1604(this.field4563);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4556, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field4560, 0);
        var1.glDrawBuffer(36064);
        if (!class212.method1600()) {
            this.field4561 = class119.field2015;
            class42.method273(this.field4556);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class42.method273(this.field4560);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class212.method1600()) {
                class212.method1596();
                return false;
            }
        }
        class212.method1596();
        this.field4553 = class82.method667(new class228[] { class228.method1772("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class228.field3800) });
        this.field4555 = class82.method667(new class228[] { class228.method1772("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class228.field3800) });
        this.field4558 = class82.method667(new class228[] { class228.method1772("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class228.field3800) });
        this.field4554 = class82.method667(new class228[] { class228.method1772("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class228.field3800) });
        return this.field4555 != null && this.field4553 != null && this.field4558 != null && this.field4554 != null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "()V", line = 67)
    public final void method1446() {
        if (this.field4557 != null) {
            class42.field627.glDeleteTextures(this.field4557.length, this.field4557, 0);
            this.field4557 = null;
        }
        if (this.field4551 != -1) {
            class212.method1594(this.field4551);
            this.field4551 = -1;
        }
        if (this.field4563 != -1) {
            class212.method1594(this.field4563);
            this.field4563 = -1;
        }
        if (this.field4556 != -1) {
            class119.method937(this.field4556);
            this.field4556 = -1;
        }
        if (this.field4560 != -1) {
            class119.method937(this.field4560);
            this.field4560 = -1;
        }
        this.field4553 = null;
        this.field4555 = null;
        this.field4558 = null;
        this.field4554 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V", line = 105)
    public final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class42.field627;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4557 == null) {
            var6.glBindTexture(34037, arg3);
            class212.method1604(this.field4563);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field4553.field1401;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field4552, 0.0F, 0.0F);
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
            class212.method1604(this.field4551);
            int var7 = class159.method1243(arg1, -112);
            int var8 = class159.method1243(arg2, -109);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field4557[var9], 0);
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
                    class42.method273(this.field4557[var9 - 1]);
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
            class212.method1596();
            class42.method273(this.field4557[var9 - 1]);
            class212.method1604(this.field4563);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field4555.field1401;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field4552, 0.0F, 0.0F);
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
        class42.method273(this.field4556);
        int var12 = this.field4554.field1401;
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
        class42.method273(this.field4560);
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
        class212.method1596();
        int var13 = this.field4558.field1401;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field4559, field4562, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field4556);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V", line = 260)
    public final void method1439(int arg0, int arg1) {
        GL var3 = class42.field627;
        int var4 = class159.method1243(arg0, 51);
        int var5 = class159.method1243(arg1, 47);
        if (this.field4557 != null) {
            var3.glDeleteTextures(this.field4557.length, this.field4557, 0);
            this.field4557 = null;
        }
        if (class119.field2014 == this.field4561 && var4 > 256 || var5 > 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field4551 == -1) {
                this.field4551 = class212.method1599();
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
            this.field4557 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 > 256 || var10 > 256) {
                this.field4557[var11++] = class119.method938(class119.field2003, class119.field2009, var9, var10, class119.field2014, class119.field2014, class119.field2006, class119.field2017, (byte[]) null);
                if (var9 > 256) {
                    var9 >>= 0x1;
                }
                if (var10 > 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field4551 != -1) {
            class212.method1594(this.field4551);
            this.field4551 = -1;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "()Z", line = 332)
    public final boolean method1447() {
        return this.field4563 != -1;
    }
}
