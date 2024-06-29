import jaggl.OpenGL;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class512 extends class358 {

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "Llu;")
    public static class610 field7290 = new class610(1, 3);

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    private int field7281;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    private int field7287;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    private int field7299;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Lne;")
    private class266 field7300;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lne;")
    private class266 field7302;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Lea;")
    private class468 field7283;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "Lea;")
    private class468 field7293;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Lgda;")
    private class49 field7279;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Lgda;")
    private class49 field7282;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lgda;")
    private class49 field7291;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "Lgda;")
    private class49 field7294;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "[J")
    public static long[] field7303;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[Lea;")
    private class468[] field7286;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Z")
    public final boolean method2167(byte arg0) {
        ++field7289;
        if (arg0 != 38) {
            this.method2155(-23, true, -74);
        }
        if (super.field4874.field7856 && super.field4874.field7825 && super.field4874.field7885) {
            this.field7302 = new class266(super.field4874);
            this.field7283 = new class468(super.field4874, 3553, 34842, 256, 256);
            this.field7283.method2824((byte) -99, false, false);
            this.field7293 = new class468(super.field4874, 3553, 34842, 256, 256);
            this.field7293.method2824((byte) -75, false, false);
            super.field4874.method3149(1, this.field7302);
            this.field7302.method1689(true, this.field7283, 0);
            this.field7302.method1689(true, this.field7293, 1);
            this.field7302.method1671(-1, 0);
            if (!this.field7302.method1677((byte) 81)) {
                super.field4874.method3158(255, this.field7302);
                return false;
            } else {
                super.field4874.method3158(255, this.field7302);
                this.field7279 = class560.method3370(super.field4874, new class346[] { class522.method3080(-72, 35632, super.field4874, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, -128);
                this.field7294 = class560.method3370(super.field4874, new class346[] { class522.method3080(-122, 35632, super.field4874, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, -103);
                this.field7282 = class560.method3370(super.field4874, new class346[] { class522.method3080(arg0 + -89, 35632, super.field4874, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, -45);
                this.field7291 = class560.method3370(super.field4874, new class346[] { class522.method3080(arg0 + -104, 35632, super.field4874, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, -122);
                return this.field7294 != null && this.field7279 != null && this.field7282 != null && this.field7291 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(II)V")
    public static final void method3041(int arg0, int arg1) {
        ++field7301;
        if (!class56.field668.field6834) {
            arg1 = -1;
        }
        if (~class409.field5589 != ~arg1) {
            if (~arg1 != arg0) {
                class293 var2 = class583.field8559.method3572(arg1, false);
                class126 var3 = var2.method1802(-121);
                if (var3 != null) {
                    class442.field5896.method2013(class79.field1069, new Point(var2.field4038, var2.field4039), -112, var3.method897(), var3.method898(), var3.method887());
                    class409.field5589 = arg1;
                } else {
                    arg1 = -1;
                }
            }
            if (arg1 == -1 && ~class409.field5589 != 0) {
                class442.field5896.method2013(class79.field1069, new Point(), -82, (int[]) null, -1, -1);
                class409.field5589 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILea;Lea;)V")
    public final void method2158(int arg0, int arg1, class468 arg2, class468 arg3) {
        ++field7280;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field7286 == null) {
            super.field4874.method3152(-2, arg2);
            super.field4874.method3149(1, this.field7302);
            this.field7302.method1671(-1, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field7279.field575;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class39.field471, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field7288, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field7288, (float) this.field7287);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field7287);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field4874.method3149(1, this.field7300);
            int var7 = class496.method2959(this.field7288, -80);
            int var8 = class496.method2959(this.field7287, -111);
            int var9 = 0;
            while (var7 > 256 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field7300.method1689(true, this.field7286[var9], 0);
                if (~var9 == -1) {
                    super.field4874.method3152(-2, arg2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field7288, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field7288, (float) this.field7287);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7287);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field4874.method3152(-2, this.field7286[var9 + -1]);
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
                if (var7 > 256) {
                    var7 >>= 1;
                }
                ++var9;
            }
            super.field4874.method3158(255, this.field7300);
            super.field4874.method3152(-2, this.field7286[var9 + -1]);
            super.field4874.method3149(1, this.field7302);
            this.field7302.method1671(-1, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field7294.field575;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class39.field471, 0.0F, 0.0F);
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
        this.field7302.method1671(-1, 1);
        super.field4874.method3152(-2, this.field7283);
        long var12 = this.field7291.field575;
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
        if (arg1 >= 21) {
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            this.field7302.method1671(-1, 0);
            super.field4874.method3152(-2, this.field7293);
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
            super.field4874.method3158(255, this.field7302);
            long var14 = this.field7282.field575;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class180.field2734, class343.field4737, 0.0F);
            super.field4874.method3111(33984, 1);
            super.field4874.method3152(-2, this.field7283);
            super.field4874.method3111(33984, 0);
            super.field4874.method3152(-2, arg2);
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)Z")
    public final boolean method3042(byte arg0) {
        int var2 = 9 / ((46 - arg0) / 44);
        ++field7285;
        return super.field4874.field7856 && super.field4874.field7825 && super.field4874.field7885;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)V")
    public final void method2155(int arg0, boolean arg1, int arg2) {
        this.field7288 = arg2;
        ++field7284;
        if (!arg1) {
            this.field7299 = 45;
        }
        this.field7287 = arg0;
        int var4 = class496.method2959(this.field7288, -83);
        int var5 = class496.method2959(this.field7287, -102);
        if (this.field7299 != var4 || ~this.field7281 != ~var5) {
            if (this.field7286 != null) {
                for (int var6 = 0; ~var6 > ~this.field7286.length; ++var6) {
                    this.field7286[var6].method1462((byte) -49);
                }
                this.field7286 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field7300 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label60: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        if (this.field7300 == null) {
                            this.field7300 = new class266(super.field4874);
                        }
                        int var10 = var5;
                        int var11 = var4;
                        this.field7286 = new class468[var9];
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && ~var10 >= -257) {
                                break label60;
                            }
                            this.field7286[var12++] = new class468(super.field4874, 3553, 34842, var11, var10);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                        }
                    }
                    ++var9;
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                }
            }
            this.field7281 = var5;
            this.field7299 = var4;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
    public final boolean method2156(int arg0) {
        ++field7298;
        int var2 = -14 % ((arg0 - 45) / 45);
        return this.field7302 != null;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)I")
    public final int method2163(byte arg0) {
        if (arg0 < 81) {
            this.field7300 = null;
        }
        ++field7296;
        return 1;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
    public final void method2165(byte arg0) {
        this.field7300 = null;
        this.field7282 = null;
        ++field7292;
        this.field7293 = null;
        this.field7291 = null;
        this.field7294 = null;
        this.field7286 = null;
        this.field7279 = null;
        if (arg0 == 2) {
            this.field7283 = null;
            this.field7302 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)V")
    public final void method2160(int arg0, int arg1) {
        int var3 = 44 / ((51 - arg0) / 43);
        OpenGL.glUseProgramObjectARB(0L);
        ++field7297;
        super.field4874.method3111(33984, 1);
        super.field4874.method3152(-2, (class228) null);
        super.field4874.method3111(33984, 0);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lte;)V")
    public class512(class527 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V")
    public static void method3043(boolean arg0) {
        field7290 = null;
        if (!arg0) {
            field7303 = null;
        }
    }
}
