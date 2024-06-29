import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class182 extends class263 {

    @OriginalMember(owner = "client!js", name = "x", descriptor = "I")
    private int field2477;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!js", name = "C", descriptor = "I")
    private int field2482;

    @OriginalMember(owner = "client!js", name = "E", descriptor = "I")
    private int field2484;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!js", name = "Q", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!js", name = "T", descriptor = "I")
    private int field2498;

    @OriginalMember(owner = "client!js", name = "U", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!js", name = "V", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!js", name = "B", descriptor = "Lvd;")
    private class39 field2481;

    @OriginalMember(owner = "client!js", name = "S", descriptor = "Lvd;")
    private class39 field2497;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "Lwk;")
    public static class451 field2489;

    @OriginalMember(owner = "client!js", name = "D", descriptor = "Lfm;")
    private class477 field2483;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "Lfm;")
    private class477 field2486;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "Lfm;")
    private class477 field2487;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "Lfm;")
    private class477 field2488;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "Lgha;")
    private class520 field2485;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "Lgha;")
    private class520 field2492;

    @OriginalMember(owner = "client!js", name = "R", descriptor = "[Lgha;")
    private class520[] field2496;

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lck;)V", line = 4)
    public class182(class733 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)I", line = 10)
    public final int method1215(boolean arg0) {
        ++field2493;
        if (!arg0) {
            this.field2484 = 18;
        }
        return 1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lha;Luaa;B)V", line = 23)
    public static final void method1216(class570 arg0, class391 arg1, byte arg2) {
        ++field2491;
        boolean var3 = class640.field8189.method704(-1, -16777216 | arg1.field5042, arg1.field5128, arg1.field5123, arg0, arg1.field4997, arg1.field5043, !arg1.field5103 ? null : class422.field5564.field352) == null;
        if (arg2 <= 117) {
            method1225(-5);
        }
        if (var3) {
            class26.field225.method3593(new class453(arg1.field5128, arg1.field4997, arg1.field5043, arg1.field5042 | -16777216, arg1.field5123, arg1.field5103), 15);
            class776.method4255(arg1, -1007);
        }
    }

    @OriginalMember(owner = "client!js", name = "g", descriptor = "(I)Z", line = 46)
    public final boolean method1217(int arg0) {
        ++field2490;
        int var2 = 101 / ((-11 - arg0) / 57);
        if (super.field3505.field9880 && super.field3505.field9884 && super.field3505.field9889) {
            this.field2481 = new class39(super.field3505);
            this.field2492 = new class520(super.field3505, 3553, 34842, 256, 256);
            this.field2492.method2873(-26403, false, false);
            this.field2485 = new class520(super.field3505, 3553, 34842, 256, 256);
            this.field2485.method2873(-26403, false, false);
            super.field3505.method3988(this.field2481, -117);
            this.field2481.method239(this.field2492, 65, 0);
            this.field2481.method239(this.field2485, 109, 1);
            this.field2481.method237((byte) 98, 0);
            if (!this.field2481.method234(-81)) {
                super.field3505.method3918(4609, this.field2481);
                return false;
            } else {
                super.field3505.method3918(4609, this.field2481);
                this.field2487 = class617.method3302(new class668[] { class745.method4041(35632, (byte) 55, super.field3505, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field3505, -123);
                this.field2486 = class617.method3302(new class668[] { class745.method4041(35632, (byte) 98, super.field3505, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field3505, -116);
                this.field2488 = class617.method3302(new class668[] { class745.method4041(35632, (byte) 69, super.field3505, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.field3505, -111);
                this.field2483 = class617.method3302(new class668[] { class745.method4041(35632, (byte) 46, super.field3505, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.field3505, -111);
                return this.field2486 != null && this.field2487 != null && this.field2488 != null && this.field2483 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)V", line = 83)
    public final void method1218(int arg0, int arg1, int arg2) {
        this.field2498 = arg2;
        ++field2495;
        this.field2484 = arg0;
        int var4 = class681.method3659(-89, this.field2484);
        int var5 = class681.method3659(-103, this.field2498);
        if (arg1 > 26) {
            if (~this.field2482 != ~var4 || ~this.field2477 != ~var5) {
                if (this.field2496 != null) {
                    for (int var6 = 0; ~var6 > ~this.field2496.length; ++var6) {
                        this.field2496[var6].method753(-1);
                    }
                    this.field2496 = null;
                }
                if (~var4 >= -257 && var5 <= 256) {
                    this.field2497 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field2497 == null) {
                        this.field2497 = new class39(super.field3505);
                    }
                    label59: while (true) {
                        if (var7 <= 256 && ~var8 >= -257) {
                            int var10 = var5;
                            int var11 = var4;
                            this.field2496 = new class520[var9];
                            int var12 = 0;
                            while (true) {
                                if (var11 <= 256 && ~var10 >= -257) {
                                    break label59;
                                }
                                this.field2496[var12++] = new class520(super.field3505, 3553, 34842, var11, var10);
                                if (~var10 < -257) {
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
                        if (~var7 < -257) {
                            var7 >>= 1;
                        }
                        ++var9;
                    }
                }
                this.field2477 = var5;
                this.field2482 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILgha;ZLgha;)V", line = 166)
    public final void method1219(int arg0, class520 arg1, boolean arg2, class520 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field2494;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2496 != null) {
            super.field3505.method3988(this.field2497, -119);
            int var5 = class681.method3659(-112, this.field2484);
            int var6 = class681.method3659(-103, this.field2498);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field2497.method239(this.field2496[var7], 95, 0);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (~var7 != -1) {
                    super.field3505.method3975((byte) 124, this.field2496[var7 + -1]);
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
                    super.field3505.method3975((byte) 123, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field2484, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field2484, (float) this.field2498);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2498);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field3505.method3918(4609, this.field2497);
            super.field3505.method3975((byte) 127, this.field2496[var7 + -1]);
            super.field3505.method3988(this.field2481, -116);
            this.field2481.method237((byte) -122, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field2486.field6192;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class168.field2232, 0.0F, 0.0F);
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
            super.field3505.method3975((byte) 114, arg3);
            super.field3505.method3988(this.field2481, -117);
            this.field2481.method237((byte) -123, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field2487.field6192;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class168.field2232, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field2484, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field2484, (float) this.field2498);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field2498);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field2481.method237((byte) 23, 1);
        super.field3505.method3975((byte) 126, this.field2492);
        long var12 = this.field2483.field6192;
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
        this.field2481.method237((byte) 33, 0);
        super.field3505.method3975((byte) 123, this.field2485);
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
        super.field3505.method3918(4609, this.field2481);
        long var14 = this.field2488.field6192;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class48.field551, class560.field7125, 0.0F);
        super.field3505.method3945(1, arg2);
        super.field3505.method3975((byte) 112, this.field2492);
        super.field3505.method3945(0, false);
        super.field3505.method3975((byte) 112, arg3);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)V", line = 319)
    public final void method1220(int arg0, byte arg1) {
        ++field2479;
        OpenGL.glUseProgramObjectARB(0L);
        super.field3505.method3945(1, false);
        if (arg1 > -125) {
            this.field2477 = 96;
        }
        super.field3505.method3975((byte) 113, (class128) null);
        super.field3505.method3945(0, false);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Z", line = 333)
    public final boolean method1221(int arg0) {
        ++field2478;
        if (arg0 != 1) {
            return true;
        } else {
            return this.field2481 != null;
        }
    }

    @OriginalMember(owner = "client!js", name = "j", descriptor = "(I)Z", line = 346)
    public final boolean method1222(int arg0) {
        if (arg0 < 126) {
            this.method1219(113, (class520) null, true, (class520) null);
        }
        ++field2500;
        return super.field3505.field9880 && super.field3505.field9884 && super.field3505.field9889;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V", line = 364)
    public static void method1223(byte arg0) {
        field2489 = null;
        if (arg0 != -11) {
            field2489 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V", line = 375)
    public final void method1224(int arg0) {
        if (arg0 > -99) {
            this.method1222(-100);
        }
        this.field2496 = null;
        this.field2497 = null;
        this.field2485 = null;
        this.field2486 = null;
        this.field2483 = null;
        this.field2481 = null;
        this.field2492 = null;
        ++field2480;
        this.field2488 = null;
        this.field2487 = null;
    }

    @OriginalMember(owner = "client!js", name = "k", descriptor = "(I)V", line = 395)
    public static final void method1225(int arg0) {
        class205.field2830 = class279.method1715(2048, 35, 4, true, 8, arg0 ^ -10404, 8, 0.4F);
        ++field2499;
        if (arg0 != -10374) {
            method1223((byte) 109);
        }
    }
}
