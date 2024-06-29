import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class114 extends class185 {

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    private int field1668 = -1;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    private int field1671 = -1;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    private int field1664 = -1;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    private int field1675 = class200.field3079;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    private int field1676 = -1;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "F")
    public static float field1666 = 0.25F;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "F")
    public static float field1667 = 1.0F;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "F")
    public static float field1670 = 1.0F;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lfe;")
    private class271 field1665;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Lfe;")
    private class271 field1669;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Lfe;")
    private class271 field1672;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "Lfe;")
    private class271 field1673;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "[I")
    private int[] field1674;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()I", line = 14)
    public final int method744() {
        return 1;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()Z", line = 27)
    public final boolean method745() {
        return this.field1668 != -1;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V", line = 36)
    public final void method746(int arg0) {
        class245.field3884.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V", line = 40)
    public final void method747(int arg0, int arg1) {
        GL var3 = class245.field3884;
        int var4 = class278.method1978(128, arg0);
        int var5 = class278.method1978(128, arg1);
        if (this.field1674 != null) {
            var3.glDeleteTextures(this.field1674.length, this.field1674, 0);
            this.field1674 = null;
        }
        if (class200.field3079 == this.field1675 && var4 > 256 || var5 > 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field1676 == -1) {
                this.field1676 = class93.method620();
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
            this.field1674 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 > 256 || var10 > 256) {
                this.field1674[var11++] = class200.method1366(class200.field3068, class200.field3074, var9, var10, class200.field3079, class200.field3079, class200.field3071, class200.field3082, (byte[]) null);
                if (var9 > 256) {
                    var9 >>= 0x1;
                }
                if (var10 > 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field1676 != -1) {
            class93.method618(this.field1676);
            this.field1676 = -1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "()V", line = 108)
    public final void method748() {
        if (this.field1674 != null) {
            class245.field3884.glDeleteTextures(this.field1674.length, this.field1674, 0);
            this.field1674 = null;
        }
        if (this.field1676 != -1) {
            class93.method618(this.field1676);
            this.field1676 = -1;
        }
        if (this.field1668 != -1) {
            class93.method618(this.field1668);
            this.field1668 = -1;
        }
        if (this.field1664 != -1) {
            class200.method1371(this.field1664);
            this.field1664 = -1;
        }
        if (this.field1671 != -1) {
            class200.method1371(this.field1671);
            this.field1671 = -1;
        }
        this.field1669 = null;
        this.field1672 = null;
        this.field1673 = null;
        this.field1665 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V", line = 146)
    public final void method749(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class245.field3884;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1674 == null) {
            var6.glBindTexture(34037, arg3);
            class93.method622(this.field1668);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field1669.field4461;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field1670, 0.0F, 0.0F);
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
            class93.method622(this.field1676);
            int var7 = class278.method1978(128, arg1);
            int var8 = class278.method1978(128, arg2);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field1674[var9], 0);
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
                    class245.method1729(this.field1674[var9 - 1]);
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
            class93.method617();
            class245.method1729(this.field1674[var9 - 1]);
            class93.method622(this.field1668);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field1672.field4461;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field1670, 0.0F, 0.0F);
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
        class245.method1729(this.field1664);
        int var12 = this.field1665.field4461;
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
        class245.method1729(this.field1671);
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
        class93.method617();
        int var13 = this.field1673.field4461;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field1666, field1667, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field1664);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()Z", line = 297)
    public final boolean method750() {
        if (!class245.field3889 || !class245.field3867 || !class245.field3870) {
            return false;
        }
        GL var1 = class245.field3884;
        this.field1668 = class93.method620();
        this.field1664 = class200.method1366(class200.field3068, class200.field3074, 256, 256, class200.field3079, class200.field3079, class200.field3071, class200.field3082, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field1671 = class200.method1366(class200.field3068, class200.field3074, 256, 256, class200.field3079, class200.field3079, class200.field3071, class200.field3082, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class93.method622(this.field1668);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field1664, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field1671, 0);
        var1.glDrawBuffer(36064);
        if (!class93.method616()) {
            this.field1675 = class200.field3080;
            class245.method1729(this.field1664);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class245.method1729(this.field1671);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class93.method616()) {
                class93.method617();
                return false;
            }
        }
        class93.method617();
        this.field1669 = class271.method1910(new class360[] { class360.method2503("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class360.field5693) });
        this.field1672 = class271.method1910(new class360[] { class360.method2503("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class360.field5693) });
        this.field1673 = class271.method1910(new class360[] { class360.method2503("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class360.field5693) });
        this.field1665 = class271.method1910(new class360[] { class360.method2503("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class360.field5693) });
        return this.field1672 != null && this.field1669 != null && this.field1673 != null && this.field1665 != null;
    }
}
