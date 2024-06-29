import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class445 extends class245 {

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    private int field6376;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    private int field6377;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
    private int field6378;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
    private int field6386;

    @OriginalMember(owner = "client!tq", name = "R", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "Lme;")
    private class131 field6367;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "Lme;")
    private class131 field6369;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "Lme;")
    private class131 field6379;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "Lme;")
    private class131 field6380;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "Lml;")
    private class265 field6370;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "Lml;")
    private class265 field6381;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "Lns;")
    private class279 field6365;

    @OriginalMember(owner = "client!tq", name = "Q", descriptor = "Lns;")
    private class279 field6387;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "[Lml;")
    private class265[] field6375;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 3)
    public static final void method2622(boolean arg0, String arg1) {
        if (!arg0) {
            field6382 = 31;
        }
        class443.method2616("", arg1, 0, false, "", 0);
        ++field6372;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lml;IILml;)V", line = 15)
    public final void method1495(class265 arg0, int arg1, int arg2, class265 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field6383;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6375 != null) {
            super.field3171.method2303(this.field6387, 34165);
            int var5 = class231.method1404(this.field6376, 1);
            int var6 = class231.method1404(this.field6386, 1);
            int var7 = 0;
            while (~var5 < -257 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field6387.method1648(this.field6375[var7], 0, 123);
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (~var7 == -1) {
                    super.field3171.method2322(arg3, 14);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6376, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6376, (float) this.field6386);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6386);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field3171.method2322(this.field6375[var7 + -1], 14);
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
                if (var5 > 256) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field3171.method2283(-19, this.field6387);
            super.field3171.method2322(this.field6375[var7 + -1], 14);
            super.field3171.method2303(this.field6365, 34165);
            this.field6365.method1645(true, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field6379.field1719;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class465.field6714, 0.0F, 0.0F);
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
            super.field3171.method2322(arg3, 14);
            super.field3171.method2303(this.field6365, 34165);
            this.field6365.method1645(true, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6380.field1719;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class465.field6714, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6376, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6376, (float) this.field6386);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6386);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field6365.method1645(true, 1);
        super.field3171.method2322(this.field6381, 14);
        if (arg2 >= 86) {
            long var12 = this.field6369.field1719;
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
            this.field6365.method1645(true, 0);
            super.field3171.method2322(this.field6370, 14);
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
            super.field3171.method2283(-109, this.field6365);
            long var14 = this.field6367.field1719;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class431.field6111, class87.field1088, 0.0F);
            super.field3171.method2321(1, 25322);
            super.field3171.method2322(this.field6381, 14);
            super.field3171.method2321(0, 25322);
            super.field3171.method2322(arg3, 14);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Z", line = 171)
    public final boolean method1490(byte arg0) {
        if (arg0 < 22) {
            return false;
        } else {
            ++field6388;
            return this.field6365 != null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V", line = 184)
    public final void method1494(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        if (arg0 > 14) {
            ++field6384;
            super.field3171.method2321(1, 25322);
            super.field3171.method2322((class119) null, 14);
            super.field3171.method2321(0, 25322);
        }
    }

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "(I)Z", line = 198)
    public final boolean method2623(int arg0) {
        ++field6385;
        if (arg0 != 28581) {
            return false;
        } else {
            return super.field3171.field5529 && super.field3171.field5531 && super.field3171.field5532;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)I", line = 215)
    public static final int method2624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 3;
        ++field6371;
        if ((arg0 & arg6) == 1) {
            int var8 = arg3;
            arg3 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return -arg1 + 7 + -arg3 + 1;
        } else {
            return var7 == 2 ? -arg4 + 1 + 7 + -arg2 : arg1;
        }
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)Z", line = 242)
    public final boolean method1488(int arg0) {
        ++field6373;
        if (super.field3171.field5529 && super.field3171.field5531 && super.field3171.field5532) {
            this.field6365 = new class279(super.field3171);
            this.field6381 = new class265(super.field3171, 3553, 34842, 256, 256);
            this.field6381.method1578(false, 0, false);
            this.field6370 = new class265(super.field3171, 3553, 34842, 256, 256);
            this.field6370.method1578(false, 0, false);
            super.field3171.method2303(this.field6365, 34165);
            this.field6365.method1648(this.field6381, 0, -108);
            this.field6365.method1648(this.field6370, 1, arg0 + 98);
            this.field6365.method1645(true, 0);
            if (!this.field6365.method1654(0)) {
                super.field3171.method2283(114, this.field6365);
                return false;
            } else {
                super.field3171.method2283(13, this.field6365);
                this.field6380 = class18.method155(super.field3171, new class320[] { class157.method1019("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, arg0 ^ 6, super.field3171) }, 0);
                this.field6379 = class18.method155(super.field3171, new class320[] { class157.method1019("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, 1, super.field3171) }, 0);
                this.field6367 = class18.method155(super.field3171, new class320[] { class157.method1019("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, 1, super.field3171) }, arg0 + -7);
                this.field6369 = class18.method155(super.field3171, new class320[] { class157.method1019("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, 1, super.field3171) }, 0);
                return this.field6379 != null && this.field6380 != null && this.field6367 != null && this.field6369 != null;
            }
        } else {
            return arg0 != 7;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)V", line = 284)
    public final void method1493(int arg0, int arg1, int arg2) {
        this.field6376 = arg1;
        this.field6386 = arg0;
        ++field6374;
        int var4 = class231.method1404(this.field6376, 1);
        int var5 = class231.method1404(this.field6386, 1);
        if (~this.field6377 != ~var4 || ~this.field6378 != ~var5) {
            if (this.field6375 != null) {
                for (int var6 = 0; ~var6 > ~this.field6375.length; ++var6) {
                    this.field6375[var6].method860((byte) 95);
                }
                this.field6375 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field6387 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label63: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        if (this.field6387 == null) {
                            this.field6387 = new class279(super.field3171);
                        }
                        int var10 = var4;
                        this.field6375 = new class265[var9];
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && var11 <= 256) {
                                break label63;
                            }
                            this.field6375[var12++] = new class265(super.field3171, 3553, 34842, var10, var11);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field6378 = var5;
            this.field6377 = var4;
        }
        if (arg2 > -9) {
            this.method1490((byte) -10);
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I", line = 369)
    public final int method1497(byte arg0) {
        ++field6368;
        return arg0 > -92 ? -62 : 1;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)V", line = 382)
    public final void method1489(int arg0) {
        this.field6381 = null;
        this.field6365 = null;
        this.field6375 = null;
        this.field6387 = null;
        int var2 = -2 / ((arg0 - 21) / 50);
        this.field6369 = null;
        ++field6366;
        this.field6380 = null;
        this.field6379 = null;
        this.field6367 = null;
        this.field6370 = null;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lug;)V", line = 401)
    public class445(class395 arg0) {
        super(arg0);
    }
}
