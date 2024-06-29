import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class525 extends class126 {

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "[I")
    public static int[] field7636 = new int[1000];

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "Z")
    public static boolean field7640 = false;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "Llc;")
    public static class435 field7621 = new class435(81, 20);

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    private int field7622;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    private int field7623;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    private int field7624;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    private int field7639;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "Lol;")
    private class246 field7626;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Lol;")
    private class246 field7635;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Ltg;")
    private class604 field7615;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "Ltg;")
    private class604 field7619;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "Ldc;")
    private class62 field7625;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "Ldc;")
    private class62 field7628;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "Ldc;")
    private class62 field7634;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "Ldc;")
    private class62 field7637;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "[Lol;")
    private class246[] field7630;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "[Z")
    public static boolean[] field7633;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)Z", line = 3)
    public final boolean method3189(byte arg0) {
        if (arg0 != -109) {
            method3190(-53);
        }
        ++field7627;
        return super.field1739.field5006 && super.field1739.field5052 && super.field1739.field5113;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILol;Lol;I)V", line = 27)
    public final void method886(int arg0, class246 arg1, class246 arg2, int arg3) {
        ++field7616;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho((double) arg3, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field7630 != null) {
            super.field1739.method2195(this.field7619, 58);
            int var5 = class468.method2829(arg3 + 125, this.field7639);
            int var6 = class468.method2829(120, this.field7623);
            int var7 = 0;
            while (var5 > 256 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field7619.method3527(0, false, this.field7630[var7]);
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                if (var7 == 0) {
                    super.field1739.method2164(arg3 ^ 6, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field7639, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field7639, (float) this.field7623);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7623);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field1739.method2164(6, this.field7630[var7 - 1]);
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
                ++var7;
            }
            super.field1739.method2193(112, this.field7619);
            super.field1739.method2164(arg3 + 6, this.field7630[var7 + -1]);
            super.field1739.method2195(this.field7615, 97);
            this.field7615.method3521(0, -23712);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field7625.field1002;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class115.field1603, 0.0F, 0.0F);
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
        } else {
            super.field1739.method2164(6, arg1);
            super.field1739.method2195(this.field7615, 86);
            this.field7615.method3521(0, arg3 + -23712);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field7628.field1002;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class115.field1603, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field7639, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field7639, (float) this.field7623);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field7623);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field7615.method3521(1, arg3 ^ -23712);
        super.field1739.method2164(6, this.field7626);
        long var12 = this.field7637.field1002;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
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
        this.field7615.method3521(0, -23712);
        super.field1739.method2164(6, this.field7635);
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
        super.field1739.method2193(44, this.field7615);
        long var14 = this.field7634.field1002;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class265.field3790, class217.field3249, 0.0F);
        super.field1739.method2171(113, 1);
        super.field1739.method2164(6, this.field7626);
        super.field1739.method2171(123, 0);
        super.field1739.method2164(6, arg1);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Z", line = 178)
    public final boolean method881(byte arg0) {
        int var2 = -89 / ((13 - arg0) / 55);
        ++field7620;
        if (super.field1739.field5006 && super.field1739.field5052 && super.field1739.field5113) {
            this.field7615 = new class604(super.field1739);
            this.field7626 = new class246(super.field1739, 3553, 34842, 256, 256);
            this.field7626.method1676(false, false, (byte) 80);
            this.field7635 = new class246(super.field1739, 3553, 34842, 256, 256);
            this.field7635.method1676(false, false, (byte) 79);
            super.field1739.method2195(this.field7615, 59);
            this.field7615.method3527(0, false, this.field7626);
            this.field7615.method3527(1, false, this.field7635);
            this.field7615.method3521(0, -23712);
            if (!this.field7615.method3522((byte) -99)) {
                super.field1739.method2193(91, this.field7615);
                return false;
            } else {
                super.field1739.method2193(112, this.field7615);
                this.field7628 = class660.method3768(super.field1739, 35716, new class716[] { class535.method3235(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 221, super.field1739) });
                this.field7625 = class660.method3768(super.field1739, 35716, new class716[] { class535.method3235(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 221, super.field1739) });
                this.field7634 = class660.method3768(super.field1739, 35716, new class716[] { class535.method3235(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 221, super.field1739) });
                this.field7637 = class660.method3768(super.field1739, 35716, new class716[] { class535.method3235(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 221, super.field1739) });
                return this.field7625 != null && this.field7628 != null && this.field7634 != null && this.field7637 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lkw;)V", line = 217)
    public class525(class346 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)I", line = 220)
    public final int method891(int arg0) {
        if (arg0 >= -19) {
            return 62;
        } else {
            ++field7632;
            return 1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 232)
    public final void method888(int arg0) {
        if (arg0 == -20962) {
            this.field7626 = null;
            ++field7617;
            this.field7619 = null;
            this.field7628 = null;
            this.field7637 = null;
            this.field7630 = null;
            this.field7635 = null;
            this.field7625 = null;
            this.field7634 = null;
            this.field7615 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)Z", line = 254)
    public final boolean method889(int arg0) {
        if (arg0 < 91) {
            return true;
        } else {
            ++field7641;
            return this.field7615 != null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V", line = 268)
    public static void method3190(int arg0) {
        field7633 = null;
        if (arg0 != -11884) {
            method3190(90);
        }
        field7621 = null;
        field7636 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V", line = 294)
    public final void method892(int arg0, int arg1) {
        ++field7618;
        OpenGL.glUseProgramObjectARB(0L);
        int var3 = 46 / ((9 - arg0) / 58);
        super.field1739.method2171(122, 1);
        super.field1739.method2164(6, (class158) null);
        super.field1739.method2171(125, 0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V", line = 307)
    public final void method883(int arg0, int arg1, int arg2) {
        this.field7623 = arg0;
        ++field7631;
        this.field7639 = arg2;
        int var4 = class468.method2829(119, this.field7639);
        int var5 = class468.method2829(123, this.field7623);
        if (arg1 < 115) {
            method3190(-77);
        }
        if (this.field7622 != var4 || this.field7624 != var5) {
            if (this.field7630 != null) {
                for (int var6 = 0; var6 < this.field7630.length; ++var6) {
                    this.field7630[var6].method1127(0);
                }
                this.field7630 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field7619 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field7619 == null) {
                    this.field7619 = new class604(super.field1739);
                }
                label58: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        int var10 = var5;
                        this.field7630 = new class246[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && var10 <= 256) {
                                break label58;
                            }
                            this.field7630[var12++] = new class246(super.field1739, 3553, 34842, var11, var10);
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                        }
                    }
                    ++var9;
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                }
            }
            this.field7622 = var4;
            this.field7624 = var5;
        }
    }
}
