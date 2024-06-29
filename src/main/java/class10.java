import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class10 extends class123 {

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    private int field208 = class105.field1817;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    private int field212 = -1;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    private int field214 = -1;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    private int field216 = -1;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    private int field217 = -1;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "F")
    public static float field206 = 1.0F;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "F")
    public static float field210 = 0.25F;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "F")
    public static float field209 = 1.0F;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Lfj;")
    private class36 field205;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Lfj;")
    private class36 field207;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Lfj;")
    private class36 field211;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "Lfj;")
    private class36 field213;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "[I")
    private int[] field215;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()Z", line = 4)
    public final boolean method86() {
        if (!class249.field3913 || !class249.field3872 || !class249.field3918) {
            return false;
        }
        GL var1 = class249.field3898;
        this.field212 = class273.method1832();
        this.field214 = class105.method681(class105.field1806, class105.field1812, 256, 256, class105.field1817, class105.field1817, class105.field1809, class105.field1820, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field216 = class105.method681(class105.field1806, class105.field1812, 256, 256, class105.field1817, class105.field1817, class105.field1809, class105.field1820, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class273.method1835(this.field212);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field214, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field216, 0);
        var1.glDrawBuffer(36064);
        if (!class273.method1830()) {
            this.field208 = class105.field1818;
            class249.method1689(this.field214);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class249.method1689(this.field216);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class273.method1830()) {
                class273.method1828();
                return false;
            }
        }
        class273.method1828();
        this.field211 = class36.method286(new class92[] { class92.method624("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class92.field1676) });
        this.field207 = class36.method286(new class92[] { class92.method624("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class92.field1676) });
        this.field205 = class36.method286(new class92[] { class92.method624("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class92.field1676) });
        this.field213 = class36.method286(new class92[] { class92.method624("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class92.field1676) });
        return this.field207 != null && this.field211 != null && this.field205 != null && this.field213 != null;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 48)
    public final void method87(int arg0) {
        class249.field3898.glUseProgramObjectARB(0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V", line = 77)
    public final void method88() {
        if (this.field215 != null) {
            class249.field3898.glDeleteTextures(this.field215.length, this.field215, 0);
            this.field215 = null;
        }
        if (this.field217 != -1) {
            class273.method1833(this.field217);
            this.field217 = -1;
        }
        if (this.field212 != -1) {
            class273.method1833(this.field212);
            this.field212 = -1;
        }
        if (this.field214 != -1) {
            class105.method685(this.field214);
            this.field214 = -1;
        }
        if (this.field216 != -1) {
            class105.method685(this.field216);
            this.field216 = -1;
        }
        this.field211 = null;
        this.field207 = null;
        this.field205 = null;
        this.field213 = null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()Z", line = 113)
    public final boolean method89() {
        return this.field212 != -1;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I", line = 118)
    public final int method90() {
        return 1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 122)
    public final void method91(int arg0, int arg1) {
        GL var3 = class249.field3898;
        int var4 = class173.method1093((byte) 58, arg0);
        int var5 = class173.method1093((byte) 58, arg1);
        if (this.field215 != null) {
            var3.glDeleteTextures(this.field215.length, this.field215, 0);
            this.field215 = null;
        }
        if (class105.field1817 == this.field208 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field217 == -1) {
                this.field217 = class273.method1832();
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
            this.field215 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field215[var11++] = class105.method681(class105.field1806, class105.field1812, var9, var10, class105.field1817, class105.field1817, class105.field1809, class105.field1820, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field217 != -1) {
            class273.method1833(this.field217);
            this.field217 = -1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V", line = 185)
    public final void method92(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class249.field3898;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field215 == null) {
            var6.glBindTexture(34037, arg3);
            class273.method1835(this.field212);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field211.field711;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field209, 0.0F, 0.0F);
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
            class273.method1835(this.field217);
            int var7 = class173.method1093((byte) 58, arg1);
            int var8 = class173.method1093((byte) 58, arg2);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field215[var9], 0);
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
                    class249.method1689(this.field215[var9 - 1]);
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
            class273.method1828();
            class249.method1689(this.field215[var9 - 1]);
            class273.method1835(this.field212);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field207.field711;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field209, 0.0F, 0.0F);
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
        class249.method1689(this.field214);
        int var12 = this.field213.field711;
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
        class249.method1689(this.field216);
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
        class273.method1828();
        int var13 = this.field205.field711;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field210, field206, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field214);
        var6.glActiveTexture(33984);
    }
}
