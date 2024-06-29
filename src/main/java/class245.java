import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class245 extends class319 {

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Lwp;")
    public static class453 field3037 = new class453(66, 8);

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lwp;")
    public static class453 field3047 = new class453(51, 9);

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "[I")
    public static int[] field3048 = new int[13];

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    private int field3026;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    private int field3045;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Lqk;")
    private class12 field3034;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "Lqk;")
    private class12 field3042;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "Lpm;")
    private class133 field3044;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "Lpm;")
    private class133 field3046;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Llaa;")
    private class633 field3030;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Llaa;")
    private class633 field3031;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "Llaa;")
    private class633 field3039;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Llaa;")
    private class633 field3043;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[Lpm;")
    private class133[] field3027;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I", line = 4)
    public final int method1453(int arg0) {
        if (arg0 != 1) {
            this.field3045 = 52;
        }
        ++field3040;
        return 1;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lqj;)V", line = 16)
    public class245(class548 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V", line = 20)
    public final void method1454(int arg0, int arg1, int arg2) {
        this.field3045 = arg0;
        ++field3041;
        this.field3038 = arg1;
        if (arg2 < 122) {
            this.method1461(-100);
        }
        int var4 = class257.method1497((byte) 114, this.field3045);
        int var5 = class257.method1497((byte) 114, this.field3038);
        if (this.field3026 != var4 || ~this.field3028 != ~var5) {
            if (this.field3027 != null) {
                for (int var6 = 0; ~var6 > ~this.field3027.length; ++var6) {
                    this.field3027[var6].method3392((byte) -54);
                }
                this.field3027 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field3042 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label60: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        if (this.field3042 == null) {
                            this.field3042 = new class12(super.field4079);
                        }
                        this.field3027 = new class133[var9];
                        int var10 = var4;
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && ~var11 >= -257) {
                                break label60;
                            }
                            this.field3027[var12++] = new class133(super.field4079, 3553, 34842, var10, var11);
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    ++var9;
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                }
            }
            this.field3026 = var4;
            this.field3028 = var5;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 105)
    public final void method1455(int arg0) {
        ++field3036;
        this.field3027 = null;
        this.field3030 = null;
        this.field3031 = null;
        this.field3046 = null;
        this.field3034 = null;
        this.field3039 = null;
        this.field3043 = null;
        this.field3042 = null;
        this.field3044 = null;
        if (arg0 != 35632) {
            this.method1462((class133) null, false, 43, (class133) null);
        }
    }

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "(I)Z", line = 124)
    public final boolean method1456(int arg0) {
        ++field3032;
        if (arg0 != -11982) {
            this.field3034 = null;
        }
        return super.field4079.field7593 && super.field4079.field7544 && super.field4079.field7596;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 136)
    public static void method1457(byte arg0) {
        if (arg0 != -40) {
            field3037 = null;
        }
        field3048 = null;
        field3047 = null;
        field3037 = null;
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)Z", line = 150)
    public final boolean method1458(int arg0) {
        ++field3049;
        if (super.field4079.field7593 && super.field4079.field7544 && super.field4079.field7596) {
            this.field3034 = new class12(super.field4079);
            this.field3044 = new class133(super.field4079, 3553, 34842, 256, 256);
            this.field3044.method774(false, (byte) -61, false);
            this.field3046 = new class133(super.field4079, 3553, 34842, 256, 256);
            this.field3046.method774(false, (byte) -8, false);
            super.field4079.method3026(arg0 + 255, this.field3034);
            this.field3034.method103(this.field3044, (byte) 1, 0);
            this.field3034.method103(this.field3046, (byte) 1, 1);
            this.field3034.method95(0, true);
            if (!this.field3034.method96(false)) {
                super.field4079.method2981(85, this.field3034);
                return false;
            } else {
                super.field4079.method2981(-112, this.field3034);
                this.field3043 = class220.method1300(new class165[] { class506.method2719((byte) 93, super.field4079, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field4079, 0);
                this.field3030 = class220.method1300(new class165[] { class506.method2719((byte) 107, super.field4079, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field4079, 0);
                this.field3031 = class220.method1300(new class165[] { class506.method2719((byte) 121, super.field4079, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.field4079, 0);
                this.field3039 = class220.method1300(new class165[] { class506.method2719((byte) 87, super.field4079, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.field4079, 0);
                return this.field3030 != null && this.field3043 != null && this.field3031 != null && this.field3039 != null;
            }
        } else {
            return arg0 != 0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V", line = 191)
    public final void method1459(int arg0, int arg1) {
        ++field3029;
        OpenGL.glUseProgramObjectARB(0L);
        super.field4079.method3027(1, true);
        super.field4079.method2960((class615) null, -2);
        super.field4079.method3027(arg0, true);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lla;)V", line = 202)
    public static final void method1460(class413 arg0) {
        class571.field7980 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "(I)Z", line = 205)
    public final boolean method1461(int arg0) {
        ++field3033;
        if (arg0 != 21223) {
            this.method1455(41);
        }
        return this.field3034 != null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lpm;ZILpm;)V", line = 226)
    public final void method1462(class133 arg0, boolean arg1, int arg2, class133 arg3) {
        ++field3035;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3027 != null) {
            super.field4079.method3026(255, this.field3042);
            int var5 = class257.method1497((byte) 114, this.field3045);
            int var6 = class257.method1497((byte) 114, this.field3038);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field3042.method103(this.field3027[var7], (byte) 1, 0);
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (var7 == 0) {
                    super.field4079.method2960(arg0, -2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field3045, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field3045, (float) this.field3038);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3038);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field4079.method2960(this.field3027[var7 + -1], -2);
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
            super.field4079.method2981(-83, this.field3042);
            super.field4079.method2960(this.field3027[var7 + -1], -2);
            super.field4079.method3026(255, this.field3034);
            this.field3034.method95(0, true);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field3030.field8883;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class270.field3411, 0.0F, 0.0F);
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
            super.field4079.method2960(arg0, -2);
            super.field4079.method3026(255, this.field3034);
            this.field3034.method95(0, true);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field3043.field8883;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class270.field3411, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field3045, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field3045, (float) this.field3038);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field3038);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field3034.method95(1, true);
        super.field4079.method2960(this.field3044, -2);
        long var12 = this.field3039.field8883;
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
        this.field3034.method95(0, true);
        super.field4079.method2960(this.field3046, -2);
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
        super.field4079.method2981(101, this.field3034);
        long var14 = this.field3031.field8883;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class323.field4158, class280.field3512, 0.0F);
        super.field4079.method3027(1, !arg1);
        if (arg1) {
            method1457((byte) 44);
        }
        super.field4079.method2960(this.field3044, -2);
        super.field4079.method3027(0, !arg1);
        super.field4079.method2960(arg0, -2);
    }
}
