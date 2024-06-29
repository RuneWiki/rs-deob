import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class159 extends class171 {

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    private int field2458;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    private int field2462;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    private int field2463;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    private int field2467;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Len;")
    public static class107 field2473;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lun;")
    private class144 field2461;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Lun;")
    private class144 field2471;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Lun;")
    private class144 field2476;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "Lun;")
    private class144 field2480;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Lla;")
    public static class422 field2460;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "Lps;")
    public static class432 field2475;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Lwo;")
    private class692 field2477;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "Lwo;")
    private class692 field2481;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lju;")
    private class98 field2459;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lju;")
    private class98 field2469;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "[Lwo;")
    private class692[] field2474;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILwo;Lwo;)V", line = 6)
    public final void method1181(int arg0, int arg1, class692 arg2, class692 arg3) {
        ++field2478;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2474 != null) {
            super.field2937.method1322(this.field2459, (byte) -86);
            int var5 = class602.method3455(this.field2463, false);
            int var6 = class602.method3455(this.field2458, false);
            int var7 = 0;
            while (~var5 < -257 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field2459.method814(this.field2474[var7], true, 0);
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (~var7 != -1) {
                    super.field2937.method1306(this.field2474[var7 - 1], 61);
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
                    super.field2937.method1306(arg2, 53);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field2463, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field2463, (float) this.field2458);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2458);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var5 > 256) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field2937.method1293(0, this.field2459);
            super.field2937.method1306(this.field2474[var7 + -1], 40);
            super.field2937.method1322(this.field2469, (byte) -86);
            this.field2469.method809(0, -109);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field2471.field2237;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class545.field7800, 0.0F, 0.0F);
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
            super.field2937.method1306(arg2, arg0 ^ 76);
            super.field2937.method1322(this.field2469, (byte) -86);
            this.field2469.method809(0, -116);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field2480.field2237;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class545.field7800, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field2463, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field2463, (float) this.field2458);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field2458);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field2469.method809(1, -90);
        super.field2937.method1306(this.field2481, arg0 + 42);
        long var12 = this.field2461.field2237;
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
        this.field2469.method809(0, -78);
        super.field2937.method1306(this.field2477, 122);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f((float) arg0, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field2937.method1293(0, this.field2469);
        long var14 = this.field2476.field2237;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class689.field9787, class432.field6334, 0.0F);
        super.field2937.method1298(1, (byte) -124);
        super.field2937.method1306(this.field2481, 110);
        super.field2937.method1298(0, (byte) -124);
        super.field2937.method1306(arg2, 36);
    }

    @OriginalMember(owner = "client!se", name = "i", descriptor = "(B)V", line = 163)
    public final void method1182(byte arg0) {
        this.field2477 = null;
        this.field2459 = null;
        this.field2480 = null;
        this.field2474 = null;
        this.field2469 = null;
        this.field2461 = null;
        this.field2471 = null;
        this.field2481 = null;
        this.field2476 = null;
        if (arg0 > -14) {
            this.field2477 = null;
        }
        ++field2465;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lrs;)V", line = 183)
    public class159(class166 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Z", line = 186)
    public final boolean method1183(boolean arg0) {
        ++field2470;
        if (!arg0) {
            return true;
        } else {
            return super.field2937.field2805 && super.field2937.field2861 && super.field2937.field2820;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z", line = 200)
    public final boolean method1184(int arg0) {
        if (arg0 != -257) {
            return true;
        } else {
            ++field2472;
            return this.field2469 != null;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(B)Z", line = 211)
    public final boolean method1185(byte arg0) {
        ++field2468;
        if (super.field2937.field2805 && super.field2937.field2861 && super.field2937.field2820) {
            this.field2469 = new class98(super.field2937);
            this.field2481 = new class692(super.field2937, 3553, 34842, 256, 256);
            this.field2481.method3862(false, false, -29630);
            this.field2477 = new class692(super.field2937, 3553, 34842, 256, 256);
            this.field2477.method3862(false, false, -29630);
            super.field2937.method1322(this.field2469, (byte) -86);
            this.field2469.method814(this.field2481, true, 0);
            this.field2469.method814(this.field2477, true, 1);
            this.field2469.method809(0, -94);
            if (!this.field2469.method812((byte) -111)) {
                super.field2937.method1293(0, this.field2469);
                return false;
            } else {
                super.field2937.method1293(0, this.field2469);
                this.field2480 = class231.method1605(new class621[] { class616.method3521("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field2937, (byte) -99, 35632) }, super.field2937, (byte) -114);
                this.field2471 = class231.method1605(new class621[] { class616.method3521("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field2937, (byte) -99, 35632) }, super.field2937, (byte) -119);
                this.field2476 = class231.method1605(new class621[] { class616.method3521("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field2937, (byte) -99, 35632) }, super.field2937, (byte) -109);
                this.field2461 = class231.method1605(new class621[] { class616.method3521("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field2937, (byte) -99, 35632) }, super.field2937, (byte) -114);
                return this.field2471 != null && this.field2480 != null && this.field2476 != null && this.field2461 != null;
            }
        } else {
            int var2 = 100 % ((arg0 - 83) / 38);
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V", line = 250)
    public final void method1186(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field2466;
        super.field2937.method1298(arg0, (byte) -124);
        super.field2937.method1306((class487) null, 79);
        super.field2937.method1298(0, (byte) -124);
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(B)I", line = 263)
    public final int method1187(byte arg0) {
        if (arg0 < 15) {
            return 79;
        } else {
            ++field2464;
            return 1;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V", line = 279)
    public static void method1188(int arg0) {
        field2475 = null;
        field2473 = null;
        field2460 = null;
        if (arg0 > -10) {
            field2473 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 291)
    public final void method1189(int arg0, int arg1, int arg2) {
        this.field2458 = arg1;
        ++field2479;
        this.field2463 = arg0;
        int var4 = class602.method3455(this.field2463, false);
        if (arg2 != 1) {
            this.method1186(49, 35);
        }
        int var5 = class602.method3455(this.field2458, false);
        if (this.field2462 != var4 || ~this.field2467 != ~var5) {
            if (this.field2474 != null) {
                for (int var6 = 0; ~var6 > ~this.field2474.length; ++var6) {
                    this.field2474[var6].method2965((byte) -40);
                }
                this.field2474 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field2459 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label59: while (true) {
                    if (var7 <= 256 && ~var8 >= -257) {
                        if (this.field2459 == null) {
                            this.field2459 = new class98(super.field2937);
                        }
                        int var10 = var5;
                        this.field2474 = new class692[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && var10 <= 256) {
                                break label59;
                            }
                            this.field2474[var12++] = new class692(super.field2937, 3553, 34842, var11, var10);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    ++var9;
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                }
            }
            this.field2462 = var4;
            this.field2467 = var5;
        }
    }
}
