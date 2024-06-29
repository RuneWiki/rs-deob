import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class110 extends class323 {

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    private int field1424 = -1;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    private int field1425 = class358.field5601;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    private int field1427 = -1;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    private int field1429 = -1;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    private int field1435 = -1;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "F")
    public static float field1428 = 0.25F;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "F")
    public static float field1434 = 1.0F;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "F")
    public static float field1433 = 1.0F;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "Lpf;")
    private class21 field1423;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "Lpf;")
    private class21 field1426;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "Lpf;")
    private class21 field1430;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Lpf;")
    private class21 field1431;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
    private int[] field1432;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIII)V", line = 8)
    public final void method779(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class47.field592;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1432 == null) {
            var6.glBindTexture(34037, arg3);
            class320.method2214(this.field1424);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field1431.field235;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field1433, 0.0F, 0.0F);
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
            class320.method2214(this.field1429);
            int var7 = class54.method408(arg1, (byte) 108);
            int var8 = class54.method408(arg2, (byte) 127);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field1432[var9], 0);
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
                    class47.method357(this.field1432[var9 - 1]);
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
            class320.method2213();
            class47.method357(this.field1432[var9 - 1]);
            class320.method2214(this.field1424);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field1426.field235;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field1433, 0.0F, 0.0F);
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
        class47.method357(this.field1435);
        int var12 = this.field1430.field235;
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
        class47.method357(this.field1427);
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
        class320.method2213();
        int var13 = this.field1423.field235;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field1428, field1434, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field1435);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V", line = 157)
    public final void method780(int arg0, int arg1) {
        GL var3 = class47.field592;
        int var4 = class54.method408(arg0, (byte) 111);
        int var5 = class54.method408(arg1, (byte) 106);
        if (this.field1432 != null) {
            var3.glDeleteTextures(this.field1432.length, this.field1432, 0);
            this.field1432 = null;
        }
        if (class358.field5601 == this.field1425 && var4 > 256 || var5 > 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field1429 == -1) {
                this.field1429 = class320.method2208();
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
            this.field1432 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 > 256 || var10 > 256) {
                this.field1432[var11++] = class358.method2486(class358.field5590, class358.field5596, var9, var10, class358.field5601, class358.field5601, class358.field5593, class358.field5604, (byte[]) null);
                if (var9 > 256) {
                    var9 >>= 0x1;
                }
                if (var10 > 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field1429 != -1) {
            class320.method2209(this.field1429);
            this.field1429 = -1;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()V", line = 230)
    public final void method781() {
        if (this.field1432 != null) {
            class47.field592.glDeleteTextures(this.field1432.length, this.field1432, 0);
            this.field1432 = null;
        }
        if (this.field1429 != -1) {
            class320.method2209(this.field1429);
            this.field1429 = -1;
        }
        if (this.field1424 != -1) {
            class320.method2209(this.field1424);
            this.field1424 = -1;
        }
        if (this.field1435 != -1) {
            class358.method2487(this.field1435);
            this.field1435 = -1;
        }
        if (this.field1427 != -1) {
            class358.method2487(this.field1427);
            this.field1427 = -1;
        }
        this.field1431 = null;
        this.field1426 = null;
        this.field1423 = null;
        this.field1430 = null;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "()Z", line = 276)
    public final boolean method782() {
        return this.field1424 != -1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()I", line = 284)
    public final int method783() {
        return 1;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 287)
    public final void method784(int arg0) {
        class47.field592.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "()Z", line = 296)
    public final boolean method785() {
        if (!class47.field614 || !class47.field608 || !class47.field628) {
            return false;
        }
        GL var1 = class47.field592;
        this.field1424 = class320.method2208();
        this.field1435 = class358.method2486(class358.field5590, class358.field5596, 256, 256, class358.field5601, class358.field5601, class358.field5593, class358.field5604, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field1427 = class358.method2486(class358.field5590, class358.field5596, 256, 256, class358.field5601, class358.field5601, class358.field5593, class358.field5604, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class320.method2214(this.field1424);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field1435, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field1427, 0);
        var1.glDrawBuffer(36064);
        if (!class320.method2215()) {
            this.field1425 = class358.field5602;
            class47.method357(this.field1435);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class47.method357(this.field1427);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class320.method2215()) {
                class320.method2213();
                return false;
            }
        }
        class320.method2213();
        this.field1431 = class21.method132(new class349[] { class349.method2421("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class349.field5458) });
        this.field1426 = class21.method132(new class349[] { class349.method2421("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class349.field5458) });
        this.field1423 = class21.method132(new class349[] { class349.method2421("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class349.field5458) });
        this.field1430 = class21.method132(new class349[] { class349.method2421("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class349.field5458) });
        return this.field1426 != null && this.field1431 != null && this.field1423 != null && this.field1430 != null;
    }
}
