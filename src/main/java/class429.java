import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class429 extends class357 {

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "Lbi;")
    public static class104 field6509 = new class104(35, 1);

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public static int field6512 = 0;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    private int field6499;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    private int field6501;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    private int field6504;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    private int field6505;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "Ldg;")
    private class146 field6502;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "Ldg;")
    private class146 field6508;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lmv;")
    private class233 field6491;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Lmv;")
    private class233 field6495;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "Lmv;")
    private class233 field6503;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "Lmv;")
    private class233 field6506;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "Lvt;")
    public static class522 field6511;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lsa;")
    private class532 field6496;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "Lsa;")
    private class532 field6497;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "[Lsa;")
    private class532[] field6493;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ)V")
    public final void method2361(int arg0, int arg1, boolean arg2) {
        this.field6505 = arg0;
        ++field6498;
        this.field6501 = arg1;
        if (arg2) {
            int var4 = class340.method2258(this.field6505, (byte) -100);
            int var5 = class340.method2258(this.field6501, (byte) -95);
            if (this.field6504 != var4 || ~this.field6499 != ~var5) {
                if (this.field6493 != null) {
                    for (int var6 = 0; this.field6493.length > var6; ++var6) {
                        this.field6493[var6].method2698(0);
                    }
                    this.field6493 = null;
                }
                if (~var4 >= -257 && var5 <= 256) {
                    this.field6508 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field6508 == null) {
                        this.field6508 = new class146(super.field5546);
                    }
                    label58: while (true) {
                        if (~var7 >= -257 && ~var8 >= -257) {
                            int var10 = var4;
                            this.field6493 = new class532[var9];
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (~var10 >= -257 && ~var11 >= -257) {
                                    break label58;
                                }
                                this.field6493[var12++] = new class532(super.field5546, 3553, 34842, var10, var11);
                                if (~var11 < -257) {
                                    var11 >>= 1;
                                }
                                if (~var10 < -257) {
                                    var10 >>= 1;
                                }
                            }
                        }
                        ++var9;
                        if (~var8 < -257) {
                            var8 >>= 1;
                        }
                        if (var7 > 256) {
                            var7 >>= 1;
                        }
                    }
                }
                this.field6499 = var5;
                this.field6504 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Z")
    public final boolean method2365(int arg0) {
        if (arg0 != 7) {
            return true;
        } else {
            ++field6489;
            return this.field6502 != null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)V")
    public static void method2716(byte arg0) {
        field6509 = null;
        int var1 = 3 / ((28 - arg0) / 50);
        field6511 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V")
    public final void method2372(byte arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        if (arg0 == 88) {
            ++field6490;
            super.field5546.method1507(1, 0);
            super.field5546.method1540(arg0 + -37, (class427) null);
            super.field5546.method1507(0, 0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)Z")
    public final boolean method2717(int arg0) {
        if (arg0 >= -2) {
            this.method2371(47);
        }
        ++field6510;
        return super.field5546.field3529 && super.field5546.field3545 && super.field5546.field3565;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public final void method2359(byte arg0) {
        ++field6492;
        this.field6497 = null;
        this.field6491 = null;
        this.field6495 = null;
        this.field6502 = null;
        int var2 = -85 / ((arg0 - 23) / 54);
        this.field6503 = null;
        this.field6506 = null;
        this.field6493 = null;
        this.field6508 = null;
        this.field6496 = null;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Z")
    public final boolean method2367(int arg0) {
        if (arg0 != 256) {
            return false;
        } else {
            ++field6500;
            if (super.field5546.field3529 && super.field5546.field3545 && super.field5546.field3565) {
                this.field6502 = new class146(super.field5546);
                this.field6497 = new class532(super.field5546, 3553, 34842, 256, 256);
                this.field6497.method3160(false, (byte) 50, false);
                this.field6496 = new class532(super.field5546, 3553, 34842, 256, 256);
                this.field6496.method3160(false, (byte) 50, false);
                super.field5546.method1522(true, this.field6502);
                this.field6502.method879(this.field6497, 0, true);
                this.field6502.method879(this.field6496, 1, true);
                this.field6502.method877(arg0 ^ 27898, 0);
                if (!this.field6502.method888(18274)) {
                    super.field5546.method1503(8, this.field6502);
                    return false;
                } else {
                    super.field5546.method1503(8, this.field6502);
                    this.field6506 = class326.method2178(super.field5546, new class297[] { class284.method1908(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field5546, (byte) -104) }, 118);
                    this.field6503 = class326.method2178(super.field5546, new class297[] { class284.method1908(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field5546, (byte) -84) }, -18);
                    this.field6491 = class326.method2178(super.field5546, new class297[] { class284.method1908(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field5546, (byte) 90) }, -10);
                    this.field6495 = class326.method2178(super.field5546, new class297[] { class284.method1908(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field5546, (byte) -33) }, 103);
                    return this.field6503 != null && this.field6506 != null && this.field6491 != null && this.field6495 != null;
                }
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)I")
    public final int method2371(int arg0) {
        ++field6507;
        return arg0 != 0 ? -56 : 1;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lna;)V")
    public class429(class211 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILsa;ZLsa;)V")
    public final void method2364(int arg0, class532 arg1, boolean arg2, class532 arg3) {
        ++field6494;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        if (arg2) {
            this.method2367(101);
        }
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6493 != null) {
            super.field5546.method1522(true, this.field6508);
            int var5 = class340.method2258(this.field6505, (byte) -67);
            int var6 = class340.method2258(this.field6501, (byte) -94);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field6508.method879(this.field6493[var7], 0, true);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (~var7 != -1) {
                    super.field5546.method1540(76, this.field6493[var7 + -1]);
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
                    super.field5546.method1540(121, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6505, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6505, (float) this.field6501);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6501);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field5546.method1503(8, this.field6508);
            super.field5546.method1540(92, this.field6493[var7 + -1]);
            super.field5546.method1522(true, this.field6502);
            this.field6502.method877(28154, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field6503.field3852;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class368.field5685, 0.0F, 0.0F);
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
            super.field5546.method1540(45, arg1);
            super.field5546.method1522(true, this.field6502);
            this.field6502.method877(28154, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6506.field3852;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class368.field5685, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6505, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6505, (float) this.field6501);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6501);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field6502.method877(28154, 1);
        super.field5546.method1540(103, this.field6497);
        long var12 = this.field6495.field3852;
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
        this.field6502.method877(28154, 0);
        super.field5546.method1540(62, this.field6496);
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
        super.field5546.method1503(8, this.field6502);
        long var14 = this.field6491.field3852;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class108.field1550, class168.field2455, 0.0F);
        super.field5546.method1507(1, 0);
        super.field5546.method1540(117, this.field6497);
        super.field5546.method1507(0, 0);
        super.field5546.method1540(56, arg1);
    }
}
