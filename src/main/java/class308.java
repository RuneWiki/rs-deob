import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class308 extends class50 {

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field4479 = new String[100];

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Leh;")
    public static class246 field4470 = new class246(21, -2);

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    private int field4467;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    private int field4474;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    private int field4490;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "Lgb;")
    private class146 field4469;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Lgb;")
    private class146 field4480;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "Lgu;")
    private class417 field4485;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Lgu;")
    private class417 field4488;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "Lre;")
    private class435 field4472;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "Lre;")
    private class435 field4475;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Lre;")
    private class435 field4484;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "Lre;")
    private class435 field4489;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "[Lgu;")
    private class417[] field4487;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method398(int arg0, int arg1, int arg2) {
        this.field4467 = arg0;
        this.field4474 = arg2;
        ++field4481;
        int var4 = class372.method2180(-16744, this.field4467);
        if (arg1 != 0) {
            this.method402((byte) -64);
        }
        int var5 = class372.method2180(-16744, this.field4474);
        if (~this.field4490 != ~var4 || this.field4476 != var5) {
            if (this.field4487 != null) {
                for (int var6 = 0; this.field4487.length > var6; ++var6) {
                    this.field4487[var6].method2757(arg1 + -10909);
                }
                this.field4487 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field4469 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field4469 == null) {
                    this.field4469 = new class146(super.field611);
                }
                label57: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        int var10 = var5;
                        this.field4487 = new class417[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && var10 <= 256) {
                                break label57;
                            }
                            this.field4487[var12++] = new class417(super.field611, 3553, 34842, var11, var10);
                            if (var11 > 256) {
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
            this.field4490 = var4;
            this.field4476 = var5;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public final void method402(byte arg0) {
        this.field4488 = null;
        this.field4469 = null;
        if (arg0 < 8) {
            this.field4469 = null;
        }
        this.field4487 = null;
        this.field4484 = null;
        ++field4483;
        this.field4475 = null;
        this.field4489 = null;
        this.field4472 = null;
        this.field4480 = null;
        this.field4485 = null;
    }

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "(I)Z")
    public final boolean method1867(int arg0) {
        int var2 = 97 / ((arg0 - 38) / 37);
        ++field4477;
        return super.field611.field7432 && super.field611.field7346 && super.field611.field7337;
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)Z")
    public final boolean method397(int arg0) {
        if (arg0 != 0) {
            this.method398(-96, 13, -81);
        }
        ++field4486;
        return this.field4480 != null;
    }

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)V")
    public static void method1868(int arg0) {
        field4479 = null;
        field4470 = null;
        if (arg0 >= -14) {
            method1869(-29, (byte) -26);
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lih;)V")
    public class308(class503 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lgu;ILgu;I)V")
    public final void method404(class417 arg0, int arg1, class417 arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field4473;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4487 != null) {
            super.field611.method2928(this.field4469, (byte) -98);
            int var5 = class372.method2180(-16744, this.field4467);
            int var6 = class372.method2180(-16744, this.field4474);
            int var7 = 0;
            while (~var5 < -257 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field4469.method907(this.field4487[var7], 0, (byte) 87);
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (var7 == 0) {
                    super.field611.method2968(arg2, arg1 + -32426);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field4467, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field4467, (float) this.field4474);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4474);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field611.method2968(this.field4487[var7 + -1], -64);
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
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field611.method2931(false, this.field4469);
            super.field611.method2968(this.field4487[var7 + -1], arg1 + -32418);
            super.field611.method2928(this.field4480, (byte) -111);
            this.field4480.method915(0, arg1 ^ -32260);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field4484.field6111;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class207.field3001, 0.0F, 0.0F);
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
            super.field611.method2968(arg2, -77);
            super.field611.method2928(this.field4480, (byte) -128);
            this.field4480.method915(0, arg1 ^ -32276);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field4472.field6111;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class207.field3001, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field4467, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field4467, (float) this.field4474);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field4474);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field4480.method915(1, arg1 ^ -32307);
        super.field611.method2968(this.field4485, arg1 + -32399);
        long var12 = this.field4489.field6111;
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
        this.field4480.method915(0, -128);
        super.field611.method2968(this.field4488, -109);
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
        super.field611.method2931(false, this.field4480);
        long var14 = this.field4475.field6111;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class137.field1803, class107.field1436, 0.0F);
        super.field611.method2940(1, (byte) 112);
        super.field611.method2968(this.field4485, arg1 + -32403);
        super.field611.method2940(0, (byte) 93);
        if (arg1 != 32326) {
            this.method397(80);
        }
        super.field611.method2968(arg2, -108);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Z")
    public final boolean method395(int arg0) {
        ++field4491;
        if (arg0 != -16951) {
            this.field4480 = null;
        }
        if (super.field611.field7432 && super.field611.field7346 && super.field611.field7337) {
            this.field4480 = new class146(super.field611);
            this.field4485 = new class417(super.field611, 3553, 34842, 256, 256);
            this.field4485.method2467(19, false, false);
            this.field4488 = new class417(super.field611, 3553, 34842, 256, 256);
            this.field4488.method2467(arg0 + 16970, false, false);
            super.field611.method2928(this.field4480, (byte) -76);
            this.field4480.method907(this.field4485, 0, (byte) 73);
            this.field4480.method907(this.field4488, 1, (byte) 81);
            this.field4480.method915(0, -90);
            if (!this.field4480.method916((byte) 123)) {
                super.field611.method2931(false, this.field4480);
                return false;
            } else {
                super.field611.method2931(false, this.field4480);
                this.field4472 = class19.method102(-63, super.field611, new class110[] { class316.method1906("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", (byte) 121, super.field611, 35632) });
                this.field4484 = class19.method102(-94, super.field611, new class110[] { class316.method1906("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", (byte) 64, super.field611, 35632) });
                this.field4475 = class19.method102(-80, super.field611, new class110[] { class316.method1906("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", (byte) 54, super.field611, 35632) });
                this.field4489 = class19.method102(-76, super.field611, new class110[] { class316.method1906("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", (byte) 86, super.field611, 35632) });
                return this.field4484 != null && this.field4472 != null && this.field4475 != null && this.field4489 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IB)Z")
    public static final boolean method1869(int arg0, byte arg1) {
        ++field4482;
        if (arg0 != 15 && arg0 != 2 && arg0 != 59 && ~arg0 != -50 && arg0 != 13) {
            if (arg0 != 47 && arg0 != 1006) {
                int var2 = -15 % ((-42 - arg1) / 47);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)V")
    public final void method393(int arg0, byte arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field4468;
        super.field611.method2940(1, (byte) 116);
        if (arg1 <= 113) {
            this.field4472 = null;
        }
        super.field611.method2968((class478) null, -63);
        super.field611.method2940(0, (byte) 87);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
    public final int method401(boolean arg0) {
        if (!arg0) {
            return 39;
        } else {
            ++field4471;
            return 1;
        }
    }
}
