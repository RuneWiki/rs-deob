import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class601 extends class164 {

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "[Lifa;")
    public static class390[] field8496 = new class390[8];

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "[I")
    public static int[] field8507 = new int[4];

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    private int field8489;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    private int field8493;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    private int field8502;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    private int field8504;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "Lfaa;")
    private class139 field8492;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "Lfaa;")
    private class139 field8497;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "Lhca;")
    private class452 field8487;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "Lhca;")
    private class452 field8490;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "Lhca;")
    private class452 field8498;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "Lhca;")
    private class452 field8503;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "Lwn;")
    private class673 field8485;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "Lwn;")
    private class673 field8499;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "[Lwn;")
    private class673[] field8506;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V", line = 4)
    public static void method3396(int arg0) {
        if (arg0 != 0) {
            method3396(-85);
        }
        field8496 = null;
        field8507 = null;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lok;)V", line = 21)
    public class601(class228 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)I", line = 27)
    public final int method1128(boolean arg0) {
        if (arg0) {
            return -113;
        } else {
            ++field8495;
            return 1;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V", line = 39)
    public final void method1127(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field8491;
        super.field2358.method1500(33984, arg1);
        super.field2358.method1505(-2, (class657) null);
        super.field2358.method1500(33984, 0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z", line = 57)
    public final boolean method1132(int arg0) {
        ++field8505;
        if (arg0 != 256) {
            return true;
        } else {
            return this.field8497 != null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILwn;ILwn;)V", line = 68)
    public final void method1130(int arg0, class673 arg1, int arg2, class673 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field8500;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field8506 == null) {
            super.field2358.method1505(-2, arg1);
            super.field2358.method1578(0, this.field8497);
            this.field8497.method1009(0, arg2 + 1389);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field8487.field6505;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class563.field7932, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field8489, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field8489, (float) this.field8504);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field8504);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field2358.method1578(arg2 ^ -1390, this.field8492);
            int var7 = class405.method2458(this.field8489, arg2 ^ 619911603);
            int var8 = class405.method2458(this.field8504, -619912415);
            int var9 = 0;
            while (~var7 < -257 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field8492.method1011(this.field8506[var9], 0, (byte) -74);
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (~var9 != -1) {
                    super.field2358.method1505(-2, this.field8506[var9 + -1]);
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
                    super.field2358.method1505(-2, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field8489, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field8489, (float) this.field8504);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8504);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var7 > 256) {
                    var7 >>= 1;
                }
                ++var9;
            }
            super.field2358.method1565(arg2 + -12596, this.field8492);
            super.field2358.method1505(arg2 + 1388, this.field8506[var9 + -1]);
            super.field2358.method1578(0, this.field8497);
            this.field8497.method1009(0, -1);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field8503.field6505;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class563.field7932, 0.0F, 0.0F);
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
        this.field8497.method1009(1, -1);
        super.field2358.method1505(-2, this.field8499);
        long var12 = this.field8498.field6505;
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
        this.field8497.method1009(0, -1);
        super.field2358.method1505(-2, this.field8485);
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
        if (arg2 != -1390) {
            this.method1132(64);
        }
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field2358.method1565(-13986, this.field8497);
        long var14 = this.field8490.field6505;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class163.field2350, class664.field9378, 0.0F);
        super.field2358.method1500(arg2 + 35374, 1);
        super.field2358.method1505(arg2 ^ 1388, this.field8499);
        super.field2358.method1500(33984, 0);
        super.field2358.method1505(-2, arg1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BII)V", line = 223)
    public final void method1131(byte arg0, int arg1, int arg2) {
        this.field8504 = arg1;
        if (arg0 != -95) {
            this.field8490 = null;
        }
        ++field8501;
        this.field8489 = arg2;
        int var4 = class405.method2458(this.field8489, -619912415);
        int var5 = class405.method2458(this.field8504, -619912415);
        if (~this.field8502 != ~var4 || ~this.field8493 != ~var5) {
            if (this.field8506 != null) {
                for (int var6 = 0; this.field8506.length > var6; ++var6) {
                    this.field8506[var6].method3616(2867);
                }
                this.field8506 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field8492 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field8492 == null) {
                    this.field8492 = new class139(super.field2358);
                }
                label58: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        this.field8506 = new class673[var9];
                        int var10 = var4;
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (var10 <= 256 && var11 <= 256) {
                                break label58;
                            }
                            this.field8506[var12++] = new class673(super.field2358, 3553, 34842, var10, var11);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
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
            this.field8493 = var5;
            this.field8502 = var4;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V", line = 302)
    public final void method1129(byte arg0) {
        this.field8497 = null;
        this.field8492 = null;
        int var2 = 93 / ((-6 - arg0) / 52);
        this.field8498 = null;
        this.field8490 = null;
        ++field8494;
        this.field8506 = null;
        this.field8485 = null;
        this.field8487 = null;
        this.field8499 = null;
        this.field8503 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Z", line = 325)
    public final boolean method1126(byte arg0) {
        ++field8486;
        if (arg0 <= 126) {
            return false;
        } else if (super.field2358.field3515 && super.field2358.field3464 && super.field2358.field3522) {
            this.field8497 = new class139(super.field2358);
            this.field8499 = new class673(super.field2358, 3553, 34842, 256, 256);
            this.field8499.method3736(-75, false, false);
            this.field8485 = new class673(super.field2358, 3553, 34842, 256, 256);
            this.field8485.method3736(-79, false, false);
            super.field2358.method1578(0, this.field8497);
            this.field8497.method1011(this.field8499, 0, (byte) -74);
            this.field8497.method1011(this.field8485, 1, (byte) -74);
            this.field8497.method1009(0, -1);
            if (!this.field8497.method1005(-125)) {
                super.field2358.method1565(-13986, this.field8497);
                return false;
            } else {
                super.field2358.method1565(-13986, this.field8497);
                this.field8487 = class505.method2912(new class558[] { class548.method3098((byte) -128, 35632, super.field2358, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, 0, super.field2358);
                this.field8503 = class505.method2912(new class558[] { class548.method3098((byte) -112, 35632, super.field2358, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, 0, super.field2358);
                this.field8490 = class505.method2912(new class558[] { class548.method3098((byte) -108, 35632, super.field2358, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, 0, super.field2358);
                this.field8498 = class505.method2912(new class558[] { class548.method3098((byte) -97, 35632, super.field2358, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, 0, super.field2358);
                return this.field8503 != null && this.field8487 != null && this.field8490 != null && this.field8498 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)Z", line = 367)
    public final boolean method3397(byte arg0) {
        ++field8488;
        if (arg0 != -101) {
            return true;
        } else {
            return super.field2358.field3515 && super.field2358.field3464 && super.field2358.field3522;
        }
    }
}
