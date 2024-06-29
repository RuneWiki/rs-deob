import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class447 extends class433 {

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "[I")
    public static int[] field5621 = new int[1];

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "F")
    public static float field5614;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    private int field5611;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
    private int field5616;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
    private int field5630;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
    private int field5631;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "Lco;")
    private class109 field5628;

    @OriginalMember(owner = "client!eu", name = "L", descriptor = "Lco;")
    private class109 field5633;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "Lds;")
    private class14 field5618;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "Lds;")
    private class14 field5624;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "Lsh;")
    private class65 field5615;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "Lsh;")
    private class65 field5617;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "Lsh;")
    private class65 field5623;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "Lsh;")
    private class65 field5632;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "[Lco;")
    private class109[] field5620;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "(I)Z")
    public final boolean method2443(int arg0) {
        ++field5625;
        if (arg0 <= 49) {
            this.method2380(true, (class109) null, -42, (class109) null);
        }
        return super.field5465.field7667 && super.field5465.field7732 && super.field5465.field7718;
    }

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "(I)V")
    public final void method2385(int arg0) {
        this.field5628 = null;
        this.field5617 = null;
        ++field5629;
        this.field5618 = null;
        this.field5624 = null;
        this.field5623 = null;
        if (arg0 != 1) {
            this.field5631 = 42;
        }
        this.field5633 = null;
        this.field5632 = null;
        this.field5620 = null;
        this.field5615 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)V")
    public final void method2382(int arg0, byte arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field5626;
        if (arg1 < 40) {
            this.field5628 = null;
        }
        super.field5465.method3126(1, -114);
        super.field5465.method3194((byte) 75, (class185) null);
        super.field5465.method3126(0, -29);
    }

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)Z")
    public final boolean method2383(int arg0) {
        if (arg0 != 1) {
            return true;
        } else {
            ++field5613;
            return this.field5624 != null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZLco;ILco;)V")
    public final void method2380(boolean arg0, class109 arg1, int arg2, class109 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field5612;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5620 == null) {
            super.field5465.method3194((byte) 75, arg3);
            super.field5465.method3119(this.field5624, -2015);
            this.field5624.method69(-98, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field5632.field785;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class78.field1018, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field5631, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field5631, (float) this.field5616);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field5616);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field5465.method3119(this.field5618, -2015);
            int var7 = class217.method1256((byte) -64, this.field5631);
            int var8 = class217.method1256((byte) -64, this.field5616);
            int var9 = 0;
            while (~var7 < -257 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field5618.method72(-27902, 0, this.field5620[var9]);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (~var9 == -1) {
                    super.field5465.method3194((byte) 75, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field5631, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field5631, (float) this.field5616);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5616);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field5465.method3194((byte) 75, this.field5620[var9 - 1]);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                ++var9;
            }
            super.field5465.method3164(-74, this.field5618);
            super.field5465.method3194((byte) 75, this.field5620[var9 - 1]);
            super.field5465.method3119(this.field5624, -2015);
            this.field5624.method69(-103, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field5615.field785;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class78.field1018, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field5624.method69(-102, 1);
        super.field5465.method3194((byte) 75, this.field5633);
        long var12 = this.field5617.field785;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        if (!arg0) {
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            this.field5624.method69(-101, 0);
            super.field5465.method3194((byte) 75, this.field5628);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            super.field5465.method3164(-40, this.field5624);
            long var14 = this.field5623.field785;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class555.field6942, class532.field6723, 0.0F);
            super.field5465.method3126(1, -73);
            super.field5465.method3194((byte) 75, this.field5633);
            super.field5465.method3126(0, -69);
            super.field5465.method3194((byte) 75, arg3);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)V")
    public final void method2384(int arg0, int arg1, int arg2) {
        this.field5631 = arg0;
        this.field5616 = arg2;
        ++field5622;
        int var4 = class217.method1256((byte) -64, this.field5631);
        int var5 = class217.method1256((byte) -64, this.field5616);
        if (arg1 <= 65) {
            this.field5611 = -47;
        }
        if (this.field5630 != var4 || this.field5611 != var5) {
            if (this.field5620 != null) {
                for (int var6 = 0; this.field5620.length > var6; ++var6) {
                    this.field5620[var6].method1097(true);
                }
                this.field5620 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field5618 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label59: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        if (this.field5618 == null) {
                            this.field5618 = new class14(super.field5465);
                        }
                        int var10 = var5;
                        int var11 = var4;
                        this.field5620 = new class109[var9];
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && var10 <= 256) {
                                break label59;
                            }
                            this.field5620[var12++] = new class109(super.field5465, 3553, 34842, var11, var10);
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                        }
                    }
                    ++var9;
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                }
            }
            this.field5611 = var5;
            this.field5630 = var4;
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)I")
    public final int method2376(int arg0) {
        ++field5627;
        int var2 = -4 / ((arg0 - 30) / 62);
        return 1;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public static void method2444(byte arg0) {
        if (arg0 != 75) {
            field5621 = null;
        }
        field5621 = null;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Ljaa;)V")
    public class447(class576 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(Z)Z")
    public final boolean method2378(boolean arg0) {
        ++field5619;
        if (!arg0) {
            this.field5631 = -8;
        }
        if (super.field5465.field7667 && super.field5465.field7732 && super.field5465.field7718) {
            this.field5624 = new class14(super.field5465);
            this.field5633 = new class109(super.field5465, 3553, 34842, 256, 256);
            this.field5633.method758(83, false, false);
            this.field5628 = new class109(super.field5465, 3553, 34842, 256, 256);
            this.field5628.method758(93, false, false);
            super.field5465.method3119(this.field5624, -2015);
            this.field5624.method72(-27902, 0, this.field5633);
            this.field5624.method72(-27902, 1, this.field5628);
            this.field5624.method69(-110, 0);
            if (!this.field5624.method67(122)) {
                super.field5465.method3164(-54, this.field5624);
                return false;
            } else {
                super.field5465.method3164(-93, this.field5624);
                this.field5632 = class234.method1417(new class491[] { class428.method2362("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35716, super.field5465, 35632) }, -125, super.field5465);
                this.field5615 = class234.method1417(new class491[] { class428.method2362("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35716, super.field5465, 35632) }, -128, super.field5465);
                this.field5623 = class234.method1417(new class491[] { class428.method2362("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35716, super.field5465, 35632) }, -127, super.field5465);
                this.field5617 = class234.method1417(new class491[] { class428.method2362("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35716, super.field5465, 35632) }, -125, super.field5465);
                return this.field5615 != null && this.field5632 != null && this.field5623 != null && this.field5617 != null;
            }
        } else {
            return false;
        }
    }
}
