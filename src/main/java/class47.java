import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class47 extends class226 {

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    private int field527 = -1;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    private int field529 = -1;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    private int field530 = -1;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    private int field531 = class66.field802;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    private int field536 = -1;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "F")
    public static float field533 = 0.25F;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "F")
    public static float field534 = 1.0F;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "F")
    public static float field538 = 1.0F;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "Ljd;")
    private class159 field532;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Ljd;")
    private class159 field535;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "Ljd;")
    private class159 field537;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "Ljd;")
    private class159 field539;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "[I")
    private int[] field528;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()I", line = 17)
    public final int method290() {
        return 1;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()Z", line = 28)
    public final boolean method291() {
        if (!class272.field4270 || !class272.field4304 || !class272.field4291) {
            return false;
        }
        GL var1 = class272.field4310;
        this.field529 = class204.method1424();
        this.field536 = class66.method399(class66.field791, class66.field797, 256, 256, class66.field802, class66.field802, class66.field794, class66.field805, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field527 = class66.method399(class66.field791, class66.field797, 256, 256, class66.field802, class66.field802, class66.field794, class66.field805, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class204.method1429(this.field529);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field536, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field527, 0);
        var1.glDrawBuffer(36064);
        if (!class204.method1427()) {
            this.field531 = class66.field803;
            class272.method1965(this.field536);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class272.method1965(this.field527);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class204.method1427()) {
                class204.method1432();
                return false;
            }
        }
        class204.method1432();
        this.field535 = class159.method1157(new class335[] { class335.method2308("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class335.field5342) });
        this.field532 = class159.method1157(new class335[] { class335.method2308("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class335.field5342) });
        this.field539 = class159.method1157(new class335[] { class335.method2308("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class335.field5342) });
        this.field537 = class159.method1157(new class335[] { class335.method2308("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class335.field5342) });
        return this.field532 != null && this.field535 != null && this.field539 != null && this.field537 != null;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "()Z", line = 72)
    public final boolean method292() {
        return this.field529 != -1;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V", line = 76)
    public final void method293() {
        if (this.field528 != null) {
            class272.field4310.glDeleteTextures(this.field528.length, this.field528, 0);
            this.field528 = null;
        }
        if (this.field530 != -1) {
            class204.method1425(this.field530);
            this.field530 = -1;
        }
        if (this.field529 != -1) {
            class204.method1425(this.field529);
            this.field529 = -1;
        }
        if (this.field536 != -1) {
            class66.method401(this.field536);
            this.field536 = -1;
        }
        if (this.field527 != -1) {
            class66.method401(this.field527);
            this.field527 = -1;
        }
        this.field535 = null;
        this.field532 = null;
        this.field539 = null;
        this.field537 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V", line = 118)
    public final void method294(int arg0, int arg1) {
        GL var3 = class272.field4310;
        int var4 = class75.method477((byte) 98, arg0);
        int var5 = class75.method477((byte) -94, arg1);
        if (this.field528 != null) {
            var3.glDeleteTextures(this.field528.length, this.field528, 0);
            this.field528 = null;
        }
        if (class66.field802 == this.field531 && var4 > 256 || var5 > 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field530 == -1) {
                this.field530 = class204.method1424();
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
            this.field528 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 > 256 || var10 > 256) {
                this.field528[var11++] = class66.method399(class66.field791, class66.field797, var9, var10, class66.field802, class66.field802, class66.field794, class66.field805, (byte[]) null);
                if (var9 > 256) {
                    var9 >>= 0x1;
                }
                if (var10 > 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field530 != -1) {
            class204.method1425(this.field530);
            this.field530 = -1;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V", line = 191)
    public final void method295(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class272.field4310;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field528 == null) {
            var6.glBindTexture(34037, arg3);
            class204.method1429(this.field529);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field535.field2456;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field534, 0.0F, 0.0F);
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
            class204.method1429(this.field530);
            int var7 = class75.method477((byte) -80, arg1);
            int var8 = class75.method477((byte) -88, arg2);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field528[var9], 0);
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
                    class272.method1965(this.field528[var9 - 1]);
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
            class204.method1432();
            class272.method1965(this.field528[var9 - 1]);
            class204.method1429(this.field529);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field532.field2456;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field534, 0.0F, 0.0F);
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
        class272.method1965(this.field536);
        int var12 = this.field537.field2456;
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
        class272.method1965(this.field527);
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
        class204.method1432();
        int var13 = this.field539.field2456;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field533, field538, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field536);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V", line = 343)
    public final void method296(int arg0) {
        class272.field4310.glUseProgramObjectARB(0);
    }
}
