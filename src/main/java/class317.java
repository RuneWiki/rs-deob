import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class317 extends class448 {

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    private int field4064;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
    private int field4065;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    private int field4067;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!fr", name = "J", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!fr", name = "N", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!fr", name = "O", descriptor = "I")
    private int field4082;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "Lhga;")
    private class185 field4059;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "Lhga;")
    private class185 field4062;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "Ltt;")
    private class504 field4061;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "Ltt;")
    private class504 field4075;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "Lua;")
    private class636 field4066;

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "Lua;")
    private class636 field4068;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "Lua;")
    private class636 field4072;

    @OriginalMember(owner = "client!fr", name = "L", descriptor = "Lua;")
    private class636 field4079;

    @OriginalMember(owner = "client!fr", name = "M", descriptor = "[Lhga;")
    private class185[] field4080;

    @OriginalMember(owner = "client!fr", name = "K", descriptor = "[Ldc;")
    public static class323[] field4078;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
    public final int method1855(int arg0) {
        ++field4060;
        return arg0 != 7 ? -62 : 1;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BII)V")
    public final void method1856(byte arg0, int arg1, int arg2) {
        ++field4074;
        this.field4064 = arg1;
        this.field4067 = arg2;
        int var4 = class568.method3199(false, this.field4064);
        int var5 = class568.method3199(false, this.field4067);
        if (arg0 != 67) {
            this.method1862((byte) -116);
        }
        if (this.field4065 != var4 || ~this.field4082 != ~var5) {
            if (this.field4080 != null) {
                for (int var6 = 0; ~var6 > ~this.field4080.length; ++var6) {
                    this.field4080[var6].method2429((byte) -118);
                }
                this.field4080 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field4061 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label59: while (true) {
                    if (var7 <= 256 && ~var8 >= -257) {
                        if (this.field4061 == null) {
                            this.field4061 = new class504(super.field6297);
                        }
                        int var10 = var5;
                        int var11 = var4;
                        this.field4080 = new class185[var9];
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && ~var10 >= -257) {
                                break label59;
                            }
                            this.field4080[var12++] = new class185(super.field6297, 3553, 34842, var11, var10);
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                        }
                    }
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                    ++var9;
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                }
            }
            this.field4065 = var4;
            this.field4082 = var5;
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    public final void method1857(int arg0) {
        this.field4080 = null;
        ++field4077;
        this.field4059 = null;
        this.field4075 = null;
        this.field4062 = null;
        this.field4068 = null;
        this.field4066 = null;
        if (arg0 >= -1) {
            this.method1860(-51);
        }
        this.field4061 = null;
        this.field4072 = null;
        this.field4079 = null;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Leq;)V")
    public class317(class357 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
    public static final void method1858(int arg0, int arg1) {
        ++field4063;
        class114 var2 = class618.field8650;
        synchronized (class618.field8650) {
            if (arg1 != -14903) {
                method1858(-95, -1);
            }
            class618.field8650.method775(1, arg0);
        }
    }

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "(I)V")
    public static void method1859(int arg0) {
        field4078 = null;
        if (arg0 != 0) {
            field4078 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)Z")
    public final boolean method1860(int arg0) {
        if (arg0 != 1) {
            this.method1864((class185) null, 123, (class185) null, (byte) -13);
        }
        ++field4070;
        if (super.field6297.field5073 && super.field6297.field5065 && super.field6297.field5022) {
            this.field4075 = new class504(super.field6297);
            this.field4062 = new class185(super.field6297, 3553, 34842, 256, 256);
            this.field4062.method1188(10242, false, false);
            this.field4059 = new class185(super.field6297, 3553, 34842, 256, 256);
            this.field4059.method1188(10242, false, false);
            super.field6297.method2158(-29780, this.field4075);
            this.field4075.method2912(arg0 + -1, 0, this.field4062);
            this.field4075.method2912(0, 1, this.field4059);
            this.field4075.method2901(0, (byte) 76);
            if (!this.field4075.method2906(arg0 ^ -2)) {
                super.field6297.method2142(-77, this.field4075);
                return false;
            } else {
                super.field6297.method2142(-74, this.field4075);
                this.field4068 = class615.method3375(new class692[] { class77.method560(super.field6297, (byte) 98, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, (byte) 64, super.field6297);
                this.field4079 = class615.method3375(new class692[] { class77.method560(super.field6297, (byte) 115, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, (byte) 64, super.field6297);
                this.field4072 = class615.method3375(new class692[] { class77.method560(super.field6297, (byte) 50, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, (byte) 64, super.field6297);
                this.field4066 = class615.method3375(new class692[] { class77.method560(super.field6297, (byte) 60, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, (byte) 64, super.field6297);
                return this.field4079 != null && this.field4068 != null && this.field4072 != null && this.field4066 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Z")
    public final boolean method1861(int arg0) {
        int var2 = 58 / ((-23 - arg0) / 54);
        ++field4076;
        return this.field4075 != null;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Z")
    public final boolean method1862(byte arg0) {
        ++field4058;
        int var2 = -91 % ((28 - arg0) / 32);
        return super.field6297.field5073 && super.field6297.field5065 && super.field6297.field5022;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public final void method1863(int arg0, int arg1) {
        ++field4071;
        OpenGL.glUseProgramObjectARB(0L);
        if (arg1 < -78) {
            super.field6297.method2135(1, -5027);
            super.field6297.method2120(-1, (class411) null);
            super.field6297.method2135(0, -5027);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lhga;ILhga;B)V")
    public final void method1864(class185 arg0, int arg1, class185 arg2, byte arg3) {
        OpenGL.glPushAttrib(2048);
        ++field4069;
        OpenGL.glMatrixMode(5889);
        if (arg3 <= -21) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            if (this.field4080 == null) {
                super.field6297.method2120(-1, arg0);
                super.field6297.method2158(-29780, this.field4075);
                this.field4075.method2901(0, (byte) 59);
                OpenGL.glViewport(0, 0, 256, 256);
                long var5 = this.field4068.field8807;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class437.field6140, 0.0F, 0.0F);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(0, 0);
                OpenGL.glTexCoord2f((float) this.field4064, 0.0F);
                OpenGL.glVertex2i(1, 0);
                OpenGL.glTexCoord2f((float) this.field4064, (float) this.field4067);
                OpenGL.glVertex2i(1, 1);
                OpenGL.glTexCoord2f(0.0F, (float) this.field4067);
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();
            } else {
                super.field6297.method2158(-29780, this.field4061);
                int var7 = class568.method3199(false, this.field4064);
                int var8 = class568.method3199(false, this.field4067);
                int var9 = 0;
                while (~var7 < -257 || var8 > 256) {
                    OpenGL.glViewport(0, 0, var7, var8);
                    this.field4061.method2912(0, 0, this.field4080[var9]);
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    if (var9 != 0) {
                        super.field6297.method2120(-1, this.field4080[var9 + -1]);
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
                        super.field6297.method2120(-1, arg0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f((float) this.field4064, 0.0F);
                        OpenGL.glVertex2i(1, 0);
                        OpenGL.glTexCoord2f((float) this.field4064, (float) this.field4067);
                        OpenGL.glVertex2i(1, 1);
                        OpenGL.glTexCoord2f(0.0F, (float) this.field4067);
                        OpenGL.glVertex2i(0, 1);
                        OpenGL.glEnd();
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
                super.field6297.method2142(-53, this.field4061);
                super.field6297.method2120(-1, this.field4080[var9 + -1]);
                super.field6297.method2158(-29780, this.field4075);
                this.field4075.method2901(0, (byte) 34);
                OpenGL.glViewport(0, 0, 256, 256);
                long var10 = this.field4079.field8807;
                OpenGL.glUseProgramObjectARB(var10);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class437.field6140, 0.0F, 0.0F);
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
            this.field4075.method2901(1, (byte) 42);
            super.field6297.method2120(-1, this.field4062);
            long var12 = this.field4066.field8807;
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
            this.field4075.method2901(0, (byte) 113);
            super.field6297.method2120(-1, this.field4059);
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
            super.field6297.method2142(-71, this.field4075);
            long var14 = this.field4072.field8807;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class651.field8941, class202.field2581, 0.0F);
            super.field6297.method2135(1, -5027);
            super.field6297.method2120(-1, this.field4062);
            super.field6297.method2135(0, -5027);
            super.field6297.method2120(-1, arg0);
        }
    }
}
