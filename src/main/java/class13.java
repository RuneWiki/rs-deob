import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class13 extends class125 {

    @OriginalMember(owner = "client!dka", name = "A", descriptor = "Z")
    public static boolean field255 = false;

    @OriginalMember(owner = "client!dka", name = "P", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!dka", name = "X", descriptor = "Z")
    public static boolean field278 = false;

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!dka", name = "B", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!dka", name = "C", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!dka", name = "D", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!dka", name = "F", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!dka", name = "I", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!dka", name = "L", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!dka", name = "M", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!dka", name = "N", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!dka", name = "O", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!dka", name = "Q", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!dka", name = "S", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!dka", name = "U", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!dka", name = "W", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!dka", name = "y", descriptor = "Lhw;")
    private class140 field253;

    @OriginalMember(owner = "client!dka", name = "G", descriptor = "Lhw;")
    private class140 field261;

    @OriginalMember(owner = "client!dka", name = "K", descriptor = "Lhw;")
    private class140 field265;

    @OriginalMember(owner = "client!dka", name = "T", descriptor = "Lhw;")
    private class140 field274;

    @OriginalMember(owner = "client!dka", name = "E", descriptor = "Lkm;")
    private class373 field259;

    @OriginalMember(owner = "client!dka", name = "R", descriptor = "Lkm;")
    private class373 field272;

    @OriginalMember(owner = "client!dka", name = "H", descriptor = "Lgja;")
    private class54 field262;

    @OriginalMember(owner = "client!dka", name = "V", descriptor = "Lgja;")
    private class54 field276;

    @OriginalMember(owner = "client!dka", name = "J", descriptor = "[Lkm;")
    private class373[] field264;

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "(II)V")
    public final void method138(int arg0, int arg1) {
        ++field269;
        if (arg1 != -12078) {
            this.field265 = null;
        }
        OpenGL.glUseProgramObjectARB(0L);
        super.field1937.method813((byte) 103, 1);
        super.field1937.method808((byte) 34, (class188) null);
        super.field1937.method813((byte) 103, 0);
    }

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "(Z)V")
    public static final void method139(boolean arg0) {
        if (!arg0) {
            method139(true);
        }
        if (class266.field3873 == 3) {
            class225.method1539(false, 4);
        } else if (~class266.field3873 == -8) {
            class225.method1539(false, 8);
        } else if (~class266.field3873 == -11) {
            class225.method1539(!arg0, 11);
        }
        ++field273;
    }

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "(II)V")
    public static final void method140(int arg0, int arg1) {
        ++field258;
        class244 var2 = (class244) class87.field961.method2242((long) arg1, arg0 ^ 256);
        if (arg0 != -257) {
            method140(83, -111);
        }
        if (var2 != null) {
            var2.field3625.method1969((byte) -77);
            class580.method3401(var2.field3634, var2.field3628, (byte) -108);
            var2.method3387((byte) 108);
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(Z)Z")
    public final boolean method141(boolean arg0) {
        if (arg0) {
            this.method141(true);
        }
        ++field254;
        return this.field276 != null;
    }

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)I")
    public final int method142(int arg0) {
        ++field256;
        return arg0 <= 73 ? -94 : 1;
    }

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "(I)V")
    public final void method143(int arg0) {
        this.field253 = null;
        this.field276 = null;
        this.field265 = null;
        this.field264 = null;
        this.field262 = null;
        this.field272 = null;
        int var2 = 3 % ((arg0 - 20) / 56);
        this.field261 = null;
        ++field260;
        this.field274 = null;
        this.field259 = null;
    }

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "(B)Z")
    public final boolean method144(byte arg0) {
        if (arg0 >= -27) {
            return true;
        } else {
            ++field271;
            if (super.field1937.field1577 && super.field1937.field1523 && super.field1937.field1574) {
                this.field276 = new class54(super.field1937);
                this.field272 = new class373(super.field1937, 3553, 34842, 256, 256);
                this.field272.method2314(false, false, 0);
                this.field259 = new class373(super.field1937, 3553, 34842, 256, 256);
                this.field259.method2314(false, false, 0);
                super.field1937.method776(this.field276, 411);
                this.field276.method380(this.field272, 0, 122);
                this.field276.method380(this.field259, 1, -59);
                this.field276.method376(-1, 0);
                if (!this.field276.method375((byte) 90)) {
                    super.field1937.method755(this.field276, 0);
                    return false;
                } else {
                    super.field1937.method755(this.field276, 0);
                    this.field261 = class422.method2562(new class394[] { class24.method237(-53, 35632, super.field1937, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, 0, super.field1937);
                    this.field253 = class422.method2562(new class394[] { class24.method237(-61, 35632, super.field1937, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, 0, super.field1937);
                    this.field265 = class422.method2562(new class394[] { class24.method237(-120, 35632, super.field1937, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, 0, super.field1937);
                    this.field274 = class422.method2562(new class394[] { class24.method237(-109, 35632, super.field1937, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, 0, super.field1937);
                    return this.field253 != null && this.field261 != null && this.field265 != null && this.field274 != null;
                }
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lqfa;)V")
    public class13(class106 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(III)V")
    public final void method145(int arg0, int arg1, int arg2) {
        if (arg2 >= 76) {
            ++field263;
            this.field277 = arg0;
            this.field275 = arg1;
            int var4 = class189.method1324(this.field275, (byte) 21);
            int var5 = class189.method1324(this.field277, (byte) -109);
            if (this.field267 != var4 || ~this.field268 != ~var5) {
                if (this.field264 != null) {
                    for (int var6 = 0; ~var6 > ~this.field264.length; ++var6) {
                        this.field264[var6].method1310((byte) -102);
                    }
                    this.field264 = null;
                }
                if (~var4 >= -257 && var5 <= 256) {
                    this.field262 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    label59: while (true) {
                        if (~var7 >= -257 && ~var8 >= -257) {
                            if (this.field262 == null) {
                                this.field262 = new class54(super.field1937);
                            }
                            this.field264 = new class373[var9];
                            int var10 = var5;
                            int var11 = var4;
                            int var12 = 0;
                            while (true) {
                                if (~var11 >= -257 && ~var10 >= -257) {
                                    break label59;
                                }
                                this.field264[var12++] = new class373(super.field1937, 3553, 34842, var11, var10);
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
                this.field267 = var4;
                this.field268 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!dka", name = "d", descriptor = "(B)Z")
    public final boolean method146(byte arg0) {
        if (arg0 < 112) {
            this.method147(false, -56, (class373) null, (class373) null);
        }
        ++field257;
        return super.field1937.field1577 && super.field1937.field1523 && super.field1937.field1574;
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(ZILkm;Lkm;)V")
    public final void method147(boolean arg0, int arg1, class373 arg2, class373 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field266;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field264 != null) {
            super.field1937.method776(this.field262, 411);
            int var5 = class189.method1324(this.field275, (byte) 47);
            int var6 = class189.method1324(this.field277, (byte) -116);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field262.method380(this.field264[var7], 0, 56);
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (var7 != 0) {
                    super.field1937.method808((byte) 34, this.field264[var7 + -1]);
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
                    super.field1937.method808((byte) 34, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field275, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field275, (float) this.field277);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field277);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field1937.method755(this.field262, 0);
            super.field1937.method808((byte) 34, this.field264[var7 - 1]);
            super.field1937.method776(this.field276, 411);
            this.field276.method376(-1, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field253.field2083;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class22.field362, 0.0F, 0.0F);
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
            super.field1937.method808((byte) 34, arg3);
            super.field1937.method776(this.field276, 411);
            this.field276.method376(-1, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field261.field2083;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class22.field362, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field275, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field275, (float) this.field277);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field277);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field276.method376(-1, 1);
        super.field1937.method808((byte) 34, this.field272);
        long var12 = this.field274.field2083;
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
        this.field276.method376(-1, 0);
        super.field1937.method808((byte) 34, this.field259);
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
        if (arg0) {
            OpenGL.glEnd();
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            super.field1937.method755(this.field276, 0);
            long var14 = this.field265.field2083;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class589.field8306, class583.field8251, 0.0F);
            super.field1937.method813((byte) 103, 1);
            super.field1937.method808((byte) 34, this.field272);
            super.field1937.method813((byte) 103, 0);
            super.field1937.method808((byte) 34, arg3);
        }
    }
}
