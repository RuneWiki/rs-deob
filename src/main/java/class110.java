import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class110 extends class166 {

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    private int field1648 = -1;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    private int field1649 = -1;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    private int field1645 = class96.field1473;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    private int field1652 = -1;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    private int field1644 = -1;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "F")
    public static float field1650 = 1.0F;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "F")
    public static float field1653 = 1.0F;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "F")
    public static float field1651 = 0.25F;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "Lce;")
    private class262 field1641;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Lce;")
    private class262 field1642;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Lce;")
    private class262 field1646;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Lce;")
    private class262 field1647;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "[I")
    private int[] field1643;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()Z", line = 6)
    public final boolean method758() {
        return this.field1649 != -1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V", line = 24)
    public final void method759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GL var6 = class186.field2990;
        var6.glPushAttrib(2048);
        var6.glMatrixMode(5889);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1643 == null) {
            var6.glBindTexture(34037, arg3);
            class345.method2395(this.field1649);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var11 = this.field1642.field4163;
            var6.glUseProgramObjectARB(var11);
            var6.glUniform1iARB(var6.glGetUniformLocation(var11, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var11, "params"), field1653, 0.0F, 0.0F);
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
            class345.method2395(this.field1652);
            int var7 = class45.method306(arg1, -502316351);
            int var8 = class45.method306(arg2, -502316351);
            int var9 = 0;
            while (var7 != 256 || var8 != 256) {
                var6.glViewport(0, 0, var7, var8);
                var6.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field1643[var9], 0);
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
                    class186.method1288(this.field1643[var9 - 1]);
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
            class345.method2390();
            class186.method1288(this.field1643[var9 - 1]);
            class345.method2395(this.field1649);
            var6.glDrawBuffer(36064);
            var6.glViewport(0, 0, 256, 256);
            int var10 = this.field1641.field4163;
            var6.glUseProgramObjectARB(var10);
            var6.glUniform1iARB(var6.glGetUniformLocation(var10, "sceneTex"), 0);
            var6.glUniform3fARB(var6.glGetUniformLocation(var10, "params"), field1653, 0.0F, 0.0F);
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
        class186.method1288(this.field1644);
        int var12 = this.field1647.field4163;
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
        class186.method1288(this.field1648);
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
        class345.method2390();
        int var13 = this.field1646.field4163;
        var6.glUseProgramObjectARB(var13);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "sceneTex"), 0);
        var6.glUniform1iARB(var6.glGetUniformLocation(var13, "bloomTex"), 1);
        var6.glUniform3fARB(var6.glGetUniformLocation(var13, "params"), field1651, field1650, 0.0F);
        var6.glActiveTexture(33985);
        var6.glBindTexture(3553, this.field1644);
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()Z", line = 175)
    public final boolean method760() {
        if (!class186.field3004 || !class186.field2998 || !class186.field2981) {
            return false;
        }
        GL var1 = class186.field2990;
        this.field1649 = class345.method2387();
        this.field1644 = class96.method681(class96.field1462, class96.field1468, 256, 256, class96.field1473, class96.field1473, class96.field1465, class96.field1476, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        this.field1648 = class96.method681(class96.field1462, class96.field1468, 256, 256, class96.field1473, class96.field1473, class96.field1465, class96.field1476, (byte[]) null);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
        class345.method2395(this.field1649);
        var1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.field1644, 0);
        var1.glFramebufferTexture2DEXT(36160, 36065, 3553, this.field1648, 0);
        var1.glDrawBuffer(36064);
        if (!class345.method2389()) {
            this.field1645 = class96.field1474;
            class186.method1288(this.field1644);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            class186.method1288(this.field1648);
            var1.glTexParameteri(3553, 10241, 9728);
            var1.glTexParameteri(3553, 10240, 9728);
            if (!class345.method2389()) {
                class345.method2390();
                return false;
            }
        }
        class345.method2390();
        this.field1642 = class262.method1874(new class43[] { class43.method294("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class43.field592) });
        this.field1641 = class262.method1874(new class43[] { class43.method294("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", class43.field592) });
        this.field1646 = class262.method1874(new class43[] { class43.method294("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", class43.field592) });
        this.field1647 = class262.method1874(new class43[] { class43.method294("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", class43.field592) });
        return this.field1641 != null && this.field1642 != null && this.field1646 != null && this.field1647 != null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()I", line = 227)
    public final int method761() {
        return 1;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()V", line = 231)
    public final void method762() {
        if (this.field1643 != null) {
            class186.field2990.glDeleteTextures(this.field1643.length, this.field1643, 0);
            this.field1643 = null;
        }
        if (this.field1652 != -1) {
            class345.method2394(this.field1652);
            this.field1652 = -1;
        }
        if (this.field1649 != -1) {
            class345.method2394(this.field1649);
            this.field1649 = -1;
        }
        if (this.field1644 != -1) {
            class96.method682(this.field1644);
            this.field1644 = -1;
        }
        if (this.field1648 != -1) {
            class96.method682(this.field1648);
            this.field1648 = -1;
        }
        this.field1642 = null;
        this.field1641 = null;
        this.field1646 = null;
        this.field1647 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 273)
    public final void method763(int arg0, int arg1) {
        GL var3 = class186.field2990;
        int var4 = class45.method306(arg0, -502316351);
        int var5 = class45.method306(arg1, -502316351);
        if (this.field1643 != null) {
            var3.glDeleteTextures(this.field1643.length, this.field1643, 0);
            this.field1643 = null;
        }
        if (class96.field1473 == this.field1645 && var4 != 256 || var5 != 256) {
            int var6 = var4;
            int var7 = var5;
            int var8 = 0;
            if (this.field1652 == -1) {
                this.field1652 = class345.method2387();
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
            this.field1643 = new int[var8];
            int var9 = var4;
            int var10 = var5;
            int var11 = 0;
            while (var9 != 256 || var10 != 256) {
                this.field1643[var11++] = class96.method681(class96.field1462, class96.field1468, var9, var10, class96.field1473, class96.field1473, class96.field1465, class96.field1476, (byte[]) null);
                if (var9 != 256) {
                    var9 >>= 0x1;
                }
                if (var10 != 256) {
                    var10 >>= 0x1;
                }
            }
        } else if (this.field1652 != -1) {
            class345.method2394(this.field1652);
            this.field1652 = -1;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 333)
    public final void method764(int arg0) {
        class186.field2990.glUseProgramObjectARB(0);
    }
}
