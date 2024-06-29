import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class31 extends class249 {

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field486 = 328;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field485 = -1;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "[I")
    public static int[] field496 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "Lo;")
    public static class138 field489;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "Lah;")
    private class187 field509;

    @OriginalMember(owner = "client!lm", name = "W", descriptor = "Lah;")
    private class187 field511;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Leq;")
    private class256 field488;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Leq;")
    private class256 field490;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "Leq;")
    private class256 field493;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "Leq;")
    private class256 field510;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "Ljk;")
    private class533 field494;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "Ljk;")
    private class533 field503;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "[Lah;")
    private class187[] field501;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
    public final void method238(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field499;
        super.field4249.method1440(1, 0);
        super.field4249.method1471(true, (class179) null);
        if (arg0 == -30828) {
            super.field4249.method1440(0, 0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Z")
    public final boolean method239(int arg0) {
        ++field491;
        if (super.field4249.field3724 && super.field4249.field3721 && super.field4249.field3658) {
            this.field503 = new class533(super.field4249);
            this.field511 = new class187(super.field4249, 3553, 34842, 256, 256);
            this.field511.method1262(-1, false, false);
            this.field509 = new class187(super.field4249, 3553, 34842, 256, 256);
            this.field509.method1262(~arg0, false, false);
            super.field4249.method1429(0, this.field503);
            this.field503.method3156(0, (byte) 117, this.field511);
            this.field503.method3156(1, (byte) -58, this.field509);
            this.field503.method3150(8, 0);
            if (!this.field503.method3165((byte) 81)) {
                super.field4249.method1416(this.field503, -114);
                return false;
            } else {
                super.field4249.method1416(this.field503, arg0 + -127);
                this.field510 = class287.method1864(new class303[] { class64.method421((byte) -122, 35632, super.field4249, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field4249, 1);
                this.field490 = class287.method1864(new class303[] { class64.method421((byte) -126, 35632, super.field4249, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field4249, 1);
                this.field488 = class287.method1864(new class303[] { class64.method421((byte) -123, 35632, super.field4249, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.field4249, 1);
                this.field493 = class287.method1864(new class303[] { class64.method421((byte) -121, 35632, super.field4249, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.field4249, 1);
                return this.field490 != null && this.field510 != null && this.field488 != null && this.field493 != null;
            }
        } else {
            return arg0 != 0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lui;I)Z")
    public static final boolean method240(class378 arg0, int arg1) {
        if (arg1 != 1) {
            return false;
        } else {
            ++field508;
            return class519.field7666 == arg0 || class364.field5672 == arg0 || class363.field5657 == arg0 || class516.field7636 == arg0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "(I)Z")
    public final boolean method241(int arg0) {
        ++field506;
        if (arg0 < 101) {
            field486 = -122;
        }
        return super.field4249.field3724 && super.field4249.field3721 && super.field4249.field3658;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V")
    public static void method242(byte arg0) {
        field489 = null;
        field496 = null;
        if (arg0 > -18) {
            method242((byte) 44);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)V")
    public final void method243(int arg0, byte arg1, int arg2) {
        this.field505 = arg2;
        ++field498;
        this.field492 = arg0;
        int var4 = class237.method1629(this.field505, -58);
        int var5 = class237.method1629(this.field492, -114);
        if (arg1 >= -2) {
            this.method245((class187) null, true, (class187) null, 55);
        }
        if (~this.field495 != ~var4 || this.field504 != var5) {
            if (this.field501 != null) {
                for (int var6 = 0; var6 < this.field501.length; ++var6) {
                    this.field501[var6].method1209(61);
                }
                this.field501 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field494 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field494 == null) {
                    this.field494 = new class533(super.field4249);
                }
                label58: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        this.field501 = new class187[var9];
                        int var10 = var5;
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && var10 <= 256) {
                                break label58;
                            }
                            this.field501[var12++] = new class187(super.field4249, 3553, 34842, var11, var10);
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
            this.field504 = var5;
            this.field495 = var4;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
    public final int method244(int arg0) {
        if (arg0 >= -41) {
            this.method246(-65);
        }
        ++field487;
        return 1;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lah;ZLah;I)V")
    public final void method245(class187 arg0, boolean arg1, class187 arg2, int arg3) {
        ++field497;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field501 == null) {
            super.field4249.method1471(true, arg2);
            super.field4249.method1429(0, this.field503);
            this.field503.method3150(55, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field510.field4330;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class3.field25, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field505, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field505, (float) this.field492);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field492);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field4249.method1429(0, this.field494);
            int var7 = class237.method1629(this.field505, -96);
            int var8 = class237.method1629(this.field492, 65);
            int var9 = 0;
            while (~var7 < -257 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field494.method3156(0, (byte) 115, this.field501[var9]);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (var9 == 0) {
                    super.field4249.method1471(true, arg2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field505, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field505, (float) this.field492);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field492);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field4249.method1471(true, this.field501[var9 + -1]);
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
                ++var9;
            }
            super.field4249.method1416(this.field494, 39);
            super.field4249.method1471(true, this.field501[var9 + -1]);
            super.field4249.method1429(0, this.field503);
            this.field503.method3150(66, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field490.field4330;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class3.field25, 0.0F, 0.0F);
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
        this.field503.method3150(19, 1);
        super.field4249.method1471(true, this.field511);
        long var12 = this.field493.field4330;
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
        this.field503.method3150(87, 0);
        super.field4249.method1471(true, this.field509);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        if (arg1) {
            this.method245((class187) null, false, (class187) null, 17);
        }
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
        super.field4249.method1416(this.field503, -128);
        long var14 = this.field488.field4330;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class46.field749, class203.field3210, 0.0F);
        super.field4249.method1440(1, 0);
        super.field4249.method1471(true, this.field511);
        super.field4249.method1440(0, 0);
        super.field4249.method1471(true, arg2);
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)Z")
    public final boolean method246(int arg0) {
        ++field500;
        if (arg0 != 32446) {
            this.field493 = null;
        }
        return this.field503 != null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
    public final void method247(byte arg0) {
        this.field510 = null;
        this.field509 = null;
        this.field488 = null;
        int var2 = -98 / ((37 - arg0) / 39);
        this.field493 = null;
        this.field490 = null;
        this.field511 = null;
        this.field501 = null;
        this.field503 = null;
        ++field507;
        this.field494 = null;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lih;)V")
    public class31(class214 arg0) {
        super(arg0);
    }
}
