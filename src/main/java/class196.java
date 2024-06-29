import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class196 extends class46 {

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    private int field3275 = -1;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    private int field3282 = -1;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    private int field3278 = -1;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    private int field3285 = class62.field1206;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    private int field3276 = -1;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "F")
    public static float field3277 = 1.0F;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "F")
    public static float field3281 = 0.25F;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "F")
    public static float field3280 = 1.0F;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "Lhi;")
    private class324 field3279;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Lhi;")
    private class324 field3283;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "Lhi;")
    private class324 field3284;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "Lhi;")
    private class324 field3286;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "[I")
    private int[] field3287;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIII)V", line = 5)
    public final void method385(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class241.field4012;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3287 == null) {
            var6.glBindTexture(34037, arg3);
            class247.method1743(this.field3282);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field3284.field5241;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field3280, 0.0F, 0.0F);
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
            class247.method1743(this.field3275);
            int var7 = class298.method2132((byte) 118, arg1);
            int var8 = class298.method2132((byte) -35, arg2);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field3287[var9], 0);
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
                    class241.method1687(this.field3287[var9 - 1]);
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
            class247.method1740();
            class241.method1687(this.field3287[var9 - 1]);
            class247.method1743(this.field3282);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field3286.field5241;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field3280, 0.0F, 0.0F);
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
        class241.method1687(this.field3276);
        int var12 = this.field3279.field5241;
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
        class241.method1687(this.field3278);
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
        class247.method1740();
        int var13 = this.field3283.field5241;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field3281, field3277, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field3276);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()I", line = 153)
    public final int method378() {
        return 1;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "()V", line = 165)
    public final void method386() {
        if (this.field3287 != null) {
            class241.field4012.glDeleteTextures(this.field3287.length, this.field3287, 0);
            this.field3287 = null;
        }
        if (this.field3275 != -1) {
            class247.method1739(this.field3275);
            this.field3275 = -1;
        }
        if (this.field3282 != -1) {
            class247.method1739(this.field3282);
            this.field3282 = -1;
        }
        if (this.field3276 != -1) {
            class62.method508(this.field3276);
            this.field3276 = -1;
        }
        if (this.field3278 != -1) {
            class62.method508(this.field3278);
            this.field3278 = -1;
        }
        this.field3284 = null;
        this.field3286 = null;
        this.field3283 = null;
        this.field3279 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()Z", line = 203)
    public final boolean method374() {
        if (!class241.field4036 || !class241.field3999 || !class241.field4017) {
            return false;
        }
        GL var1 = class241.field4012;
        this.field3282 = class247.method1738();
        this.field3276 = class62.method506(class62.field1195, class62.field1201, 256, 256, class62.field1206, class62.field1206, class62.field1198, class62.field1209, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field3278 = class62.method506(class62.field1195, class62.field1201, 256, 256, class62.field1206, class62.field1206, class62.field1198, class62.field1209, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class247.method1743(this.field3282);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field3276, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field3278, 0);
        var1.glDrawBuffer(36064);
        if (!class247.method1745()) {
            this.field3285 = class62.field1207;
            class241.method1687(this.field3276);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class241.method1687(this.field3278);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class247.method1745()) {
                class247.method1740();
                return false;
            }
        }
        class247.method1740();
        this.field3284 = class324.method2325(new class327[] { class327.method2331("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class327.field5259) });
        this.field3286 = class324.method2325(new class327[] { class327.method2331("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class327.field5259) });
        this.field3283 = class324.method2325(new class327[] { class327.method2331("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class327.field5259) });
        this.field3279 = class324.method2325(new class327[] { class327.method2331("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class327.field5259) });
        return this.field3286 != null && this.field3284 != null && this.field3283 != null && this.field3279 != null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V", line = 261)
    public final void method388(int arg0, int arg1) {
        GL var3 = class241.field4012;
        int var4 = class298.method2132((byte) -9, arg0);
        int var5 = class298.method2132((byte) 119, arg1);
        if (this.field3287 != null) {
            var3.glDeleteTextures(this.field3287.length, this.field3287, 0);
            this.field3287 = null;
        }
        if (class62.field1206 == this.field3285 && var4 > 256 || var5 > 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field3275 == -1) {
                this.field3275 = class247.method1738();
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
            this.field3287 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 > 256 || var10 > 256) {
                this.field3287[var11++] = class62.method506(class62.field1195, class62.field1201, var9, var10, class62.field1206, class62.field1206, class62.field1198, class62.field1209, (byte[]) null);
                if (var9 > 256) {
                    var9 >>= 0x1;
                }
                if (var10 > 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field3275 != -1) {
            class247.method1739(this.field3275);
            this.field3275 = -1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "(I)V", line = 338)
    public final void method391(int arg0) {
        class241.field4012.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "()Z", line = 345)
    public final boolean method383() {
        return this.field3282 != -1;
    }
}
