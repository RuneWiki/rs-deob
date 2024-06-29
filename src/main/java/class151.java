import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class151 extends class364 {

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    private int field2407;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    private int field2410;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    private int field2415;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Lkba;")
    private class25 field2411;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lkba;")
    private class25 field2413;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lkba;")
    private class25 field2424;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Lkba;")
    private class25 field2426;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lwi;")
    private class504 field2408;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "Lwi;")
    private class504 field2422;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Lbq;")
    private class727 field2412;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Lbq;")
    private class727 field2417;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "[Lwi;")
    private class504[] field2421;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public final void method1183(boolean arg0) {
        ++field2423;
        this.field2412 = null;
        this.field2411 = null;
        this.field2422 = null;
        this.field2421 = null;
        this.field2413 = null;
        this.field2417 = null;
        this.field2408 = null;
        this.field2424 = null;
        if (arg0) {
            this.method1185(-17);
        }
        this.field2426 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lgca;B)I")
    public static final int method1184(class705 arg0, byte arg1) {
        ++field2430;
        if (class264.field3730 == arg0) {
            return 5890;
        } else if (class368.field5193 == arg0) {
            return 34167;
        } else if (class317.field4535 != arg0) {
            if (class504.field6917 == arg0) {
                return 34166;
            } else {
                if (arg1 != 62) {
                    method1188(0.93869734F, 118, -0.10236491F, -0.004284631F);
                }
                throw new IllegalArgumentException();
            }
        } else {
            return 34168;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I")
    public final int method1185(int arg0) {
        ++field2418;
        int var2 = 23 % ((arg0 - -33) / 33);
        return 1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
    public final void method1186(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field2416;
        super.field5174.method3321(1, arg1 + -19587);
        super.field5174.method3384((class377) null, (byte) 52);
        super.field5174.method3321(arg1, -19587);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Z")
    public final boolean method1187(byte arg0) {
        if (arg0 >= -67) {
            this.method1183(true);
        }
        ++field2429;
        return this.field2412 != null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FIFF)I")
    public static final int method1188(float arg0, int arg1, float arg2, float arg3) {
        if (arg1 != 0) {
            return -78;
        } else {
            ++field2409;
            float var4 = arg3 < 0.0F ? -arg3 : arg3;
            float var5 = arg0 < 0.0F ? -arg0 : arg0;
            float var6 = !(arg2 < 0.0F) ? arg2 : -arg2;
            if (var4 < var5 && var5 > var6) {
                return arg0 > 0.0F ? 0 : 1;
            } else if (var6 > var4 && var5 < var6) {
                return !(arg2 > 0.0F) ? 3 : 2;
            } else {
                return arg3 > 0.0F ? 4 : 5;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZI)V")
    public final void method1189(int arg0, boolean arg1, int arg2) {
        this.field2419 = arg0;
        this.field2407 = arg2;
        ++field2425;
        int var4 = class515.method3025(this.field2407, 592877665);
        if (!arg1) {
            int var5 = class515.method3025(this.field2419, 592877665);
            if (~this.field2410 != ~var4 || ~this.field2415 != ~var5) {
                if (this.field2421 != null) {
                    for (int var6 = 0; ~this.field2421.length < ~var6; ++var6) {
                        this.field2421[var6].method2272((byte) 27);
                    }
                    this.field2421 = null;
                }
                if (var4 <= 256 && var5 <= 256) {
                    this.field2417 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    label60: while (true) {
                        if (var7 <= 256 && var8 <= 256) {
                            if (this.field2417 == null) {
                                this.field2417 = new class727(super.field5174);
                            }
                            int var10 = var4;
                            int var11 = var5;
                            this.field2421 = new class504[var9];
                            int var12 = 0;
                            while (true) {
                                if (var10 <= 256 && var11 <= 256) {
                                    break label60;
                                }
                                this.field2421[var12++] = new class504(super.field5174, 3553, 34842, var10, var11);
                                if (var10 > 256) {
                                    var10 >>= 1;
                                }
                                if (var11 > 256) {
                                    var11 >>= 1;
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
                this.field2410 = var4;
                this.field2415 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1190(String arg0, int arg1) {
        ++field2428;
        if (arg1 < 67) {
            method1190((String) null, 57);
        }
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            var3 = (long) arg0.charAt(var5) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)Z")
    public final boolean method1191(int arg0) {
        ++field2414;
        if (arg0 <= 74) {
            this.field2408 = null;
        }
        if (super.field5174.field8207 && super.field5174.field8175 && super.field5174.field8183) {
            this.field2412 = new class727(super.field5174);
            this.field2408 = new class504(super.field5174, 3553, 34842, 256, 256);
            this.field2408.method2952(false, false, false);
            this.field2422 = new class504(super.field5174, 3553, 34842, 256, 256);
            this.field2422.method2952(false, false, false);
            super.field5174.method3307(this.field2412, 30909);
            this.field2412.method4033(0, 0, this.field2408);
            this.field2412.method4033(0, 1, this.field2422);
            this.field2412.method4031(7, 0);
            if (!this.field2412.method4032(0)) {
                super.field5174.method3372((byte) -94, this.field2412);
                return false;
            } else {
                super.field5174.method3372((byte) -94, this.field2412);
                this.field2424 = class505.method2954(new class235[] { class472.method2756(-21541, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field5174, 35632) }, super.field5174, (byte) -120);
                this.field2411 = class505.method2954(new class235[] { class472.method2756(-21541, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field5174, 35632) }, super.field5174, (byte) -109);
                this.field2413 = class505.method2954(new class235[] { class472.method2756(-21541, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field5174, 35632) }, super.field5174, (byte) -105);
                this.field2426 = class505.method2954(new class235[] { class472.method2756(-21541, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field5174, 35632) }, super.field5174, (byte) -87);
                return this.field2411 != null && this.field2424 != null && this.field2413 != null && this.field2426 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Llea;)V")
    public class151(class573 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lwi;ILwi;I)V")
    public final void method1192(class504 arg0, int arg1, class504 arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field2427;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2421 != null) {
            super.field5174.method3307(this.field2417, 30909);
            int var5 = class515.method3025(this.field2407, 592877665);
            int var6 = class515.method3025(this.field2419, 592877665);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field2417.method4033(0, 0, this.field2421[var7]);
                if (var7 == 0) {
                    super.field5174.method3384(arg0, (byte) 66);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field2407, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field2407, (float) this.field2419);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2419);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field5174.method3384(this.field2421[var7 - 1], (byte) 76);
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
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (var5 > 256) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field5174.method3372((byte) -94, this.field2417);
            super.field5174.method3384(this.field2421[var7 + -1], (byte) 67);
            super.field5174.method3307(this.field2412, 30909);
            this.field2412.method4031(arg1 + -7567, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field2411.field277;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class640.field9017, 0.0F, 0.0F);
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
            super.field5174.method3384(arg0, (byte) 71);
            super.field5174.method3307(this.field2412, arg1 ^ 25899);
            this.field2412.method4031(7, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field2424.field277;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class640.field9017, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field2407, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field2407, (float) this.field2419);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field2419);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field2412.method4031(arg1 + -7567, 1);
        super.field5174.method3384(this.field2408, (byte) 60);
        long var12 = this.field2426.field277;
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
        this.field2412.method4031(7, 0);
        super.field5174.method3384(this.field2422, (byte) 123);
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
        super.field5174.method3372((byte) -94, this.field2412);
        if (arg1 != 7574) {
            this.field2426 = null;
        }
        long var14 = this.field2413.field277;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class654.field9254, class167.field2540, 0.0F);
        super.field5174.method3321(1, arg1 ^ -20757);
        super.field5174.method3384(this.field2408, (byte) 101);
        super.field5174.method3321(0, arg1 ^ -20757);
        super.field5174.method3384(arg0, (byte) 114);
    }

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "(I)Z")
    public final boolean method1193(int arg0) {
        if (arg0 != 5) {
            return true;
        } else {
            ++field2420;
            return super.field5174.field8207 && super.field5174.field8175 && super.field5174.field8183;
        }
    }
}
