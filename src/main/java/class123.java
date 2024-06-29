import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class123 extends class398 {

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2062 = null;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "[F")
    public static float[] field2060 = new float[4];

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field2061 = -1;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    private int field2057;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    private int field2068;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    private int field2074;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Lvca;")
    private class260 field2054;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Lvca;")
    private class260 field2056;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Lvca;")
    private class260 field2065;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "Lvca;")
    private class260 field2071;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lgaa;")
    private class275 field2052;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "Lgaa;")
    private class275 field2067;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Lvga;")
    private class79 field2055;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "Lvga;")
    private class79 field2073;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "[Lgaa;")
    private class275[] field2072;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)Z", line = 5)
    public final boolean method951(int arg0) {
        if (arg0 > -69) {
            this.field2054 = null;
        }
        ++field2066;
        return super.field5291.field9284 && super.field5291.field9242 && super.field5291.field9302;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lgaa;Lgaa;BI)V", line = 16)
    public final void method952(class275 arg0, class275 arg1, byte arg2, int arg3) {
        ++field2049;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2072 != null) {
            super.field5291.method3639(7, this.field2055);
            int var5 = class132.method996(this.field2068, 42);
            int var6 = class132.method996(this.field2057, 43);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field2055.method621(this.field2072[var7], -39, 0);
                if (~var7 != -1) {
                    super.field5291.method3630(this.field2072[var7 + -1], -2);
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
                    super.field5291.method3630(arg0, -2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field2068, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field2068, (float) this.field2057);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2057);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                if (var6 > 256) {
                    var6 >>= 1;
                }
                ++var7;
            }
            super.field5291.method3658(-128, this.field2055);
            super.field5291.method3630(this.field2072[var7 - 1], -2);
            super.field5291.method3639(7, this.field2073);
            this.field2073.method625((byte) -94, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field2065.field3572;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class575.field7605, 0.0F, 0.0F);
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
            super.field5291.method3630(arg0, -2);
            super.field5291.method3639(7, this.field2073);
            this.field2073.method625((byte) 111, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field2056.field3572;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class575.field7605, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field2068, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field2068, (float) this.field2057);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field2057);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field2073.method625((byte) -27, 1);
        super.field5291.method3630(this.field2067, -2);
        long var12 = this.field2054.field3572;
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
        this.field2073.method625((byte) -120, 0);
        super.field5291.method3630(this.field2052, -2);
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
        if (arg2 < -45) {
            super.field5291.method3658(-125, this.field2073);
            long var14 = this.field2071.field3572;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class288.field4071, class223.field3140, 0.0F);
            super.field5291.method3629((byte) -118, 1);
            super.field5291.method3630(this.field2067, -2);
            super.field5291.method3629((byte) -98, 0);
            super.field5291.method3630(arg0, -2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V", line = 179)
    public final void method953(int arg0, int arg1, int arg2) {
        this.field2057 = arg1;
        this.field2068 = arg2;
        int var4 = 51 % ((-23 - arg0) / 48);
        ++field2064;
        int var5 = class132.method996(this.field2068, -105);
        int var6 = class132.method996(this.field2057, -127);
        if (this.field2074 != var5 || this.field2070 != var6) {
            if (this.field2072 != null) {
                for (int var7 = 0; ~var7 > ~this.field2072.length; ++var7) {
                    this.field2072[var7].method2170(9729);
                }
                this.field2072 = null;
            }
            if (~var5 >= -257 && var6 <= 256) {
                this.field2055 = null;
            } else {
                int var8 = var5;
                int var9 = var6;
                int var10 = 0;
                label57: while (true) {
                    if (~var8 >= -257 && var9 <= 256) {
                        if (this.field2055 == null) {
                            this.field2055 = new class79(super.field5291);
                        }
                        int var11 = var6;
                        this.field2072 = new class275[var10];
                        int var12 = var5;
                        int var13 = 0;
                        while (true) {
                            if (var12 <= 256 && var11 <= 256) {
                                break label57;
                            }
                            this.field2072[var13++] = new class275(super.field5291, 3553, 34842, var12, var11);
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                            if (var12 > 256) {
                                var12 >>= 1;
                            }
                        }
                    }
                    if (~var9 < -257) {
                        var9 >>= 1;
                    }
                    ++var10;
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                }
            }
            this.field2074 = var5;
            this.field2070 = var6;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Z", line = 255)
    public final boolean method954(int arg0) {
        if (arg0 != 23208) {
            return false;
        } else {
            ++field2063;
            if (super.field5291.field9284 && super.field5291.field9242 && super.field5291.field9302) {
                this.field2073 = new class79(super.field5291);
                this.field2067 = new class275(super.field5291, 3553, 34842, 256, 256);
                this.field2067.method1664(false, false, (byte) 18);
                this.field2052 = new class275(super.field5291, 3553, 34842, 256, 256);
                this.field2052.method1664(false, false, (byte) 18);
                super.field5291.method3639(arg0 ^ 23215, this.field2073);
                this.field2073.method621(this.field2067, arg0 + -23122, 0);
                this.field2073.method621(this.field2052, -118, 1);
                this.field2073.method625((byte) -113, 0);
                if (!this.field2073.method623(arg0 + -55880)) {
                    super.field5291.method3658(-126, this.field2073);
                    return false;
                } else {
                    super.field5291.method3658(arg0 + -23334, this.field2073);
                    this.field2056 = class168.method1149(new class575[] { class421.method2422(super.field5291, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", arg0 + -23208, 35632) }, false, super.field5291);
                    this.field2065 = class168.method1149(new class575[] { class421.method2422(super.field5291, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 0, 35632) }, false, super.field5291);
                    this.field2071 = class168.method1149(new class575[] { class421.method2422(super.field5291, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 0, 35632) }, false, super.field5291);
                    this.field2054 = class168.method1149(new class575[] { class421.method2422(super.field5291, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 0, 35632) }, false, super.field5291);
                    return this.field2065 != null && this.field2056 != null && this.field2071 != null && this.field2054 != null;
                }
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Z", line = 293)
    public final boolean method955(int arg0) {
        ++field2059;
        if (arg0 != 1) {
            this.method952((class275) null, (class275) null, (byte) -64, 70);
        }
        return this.field2073 != null;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)V", line = 306)
    public static void method956(byte arg0) {
        field2062 = null;
        field2060 = null;
        if (arg0 <= 20) {
            method958(-62);
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V", line = 318)
    public final void method957(int arg0) {
        ++field2058;
        this.field2052 = null;
        this.field2067 = null;
        this.field2065 = null;
        this.field2072 = null;
        this.field2071 = null;
        this.field2056 = null;
        if (arg0 >= -90) {
            this.field2068 = 22;
        }
        this.field2055 = null;
        this.field2054 = null;
        this.field2073 = null;
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)V", line = 337)
    public static final void method958(int arg0) {
        ++field2053;
        if (arg0 == 1) {
            if (class43.field624 != null) {
                if (class43.field624.field2816 == 1) {
                    class43.field624 = null;
                    return;
                }
                if (~class43.field624.field2816 == -3) {
                    class145.method1053(class450.field6176, 2, class531.field7075, (byte) 104);
                    class43.field624 = null;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lno;)V", line = 366)
    public class123(class658 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)I", line = 372)
    public final int method959(byte arg0) {
        if (arg0 != 17) {
            this.method951(92);
        }
        ++field2050;
        return 1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V", line = 402)
    public final void method960(byte arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field2069;
        super.field5291.method3629((byte) 104, 1);
        super.field5291.method3630((class367) null, arg0 + -120);
        if (arg0 != 118) {
            this.field2070 = 29;
        }
        super.field5291.method3629((byte) 120, 0);
    }
}
