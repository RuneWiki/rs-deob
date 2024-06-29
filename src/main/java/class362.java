import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class362 extends class276 {

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "[Lel;")
    public static class3[] field5314 = new class3[6];

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "Ljava/lang/String;")
    public static String field5322 = "";

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    private int field5309;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    private int field5311;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    private int field5318;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    private int field5326;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Laaa;")
    private class227 field5302;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Laaa;")
    private class227 field5303;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "Lffa;")
    private class559 field5306;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "Lffa;")
    private class559 field5317;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "Lnba;")
    private class566 field5313;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "Lnba;")
    private class566 field5319;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "Lnba;")
    private class566 field5321;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "Lnba;")
    private class566 field5324;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "[Laaa;")
    private class227[] field5312;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BII)V")
    public final void method1639(byte arg0, int arg1, int arg2) {
        this.field5318 = arg1;
        if (arg0 < 33) {
            this.method1636(48);
        }
        ++field5320;
        this.field5326 = arg2;
        int var4 = class334.method2048(this.field5318, (byte) -73);
        int var5 = class334.method2048(this.field5326, (byte) -66);
        if (~this.field5311 != ~var4 || this.field5309 != var5) {
            if (this.field5312 != null) {
                for (int var6 = 0; this.field5312.length > var6; ++var6) {
                    this.field5312[var6].method2922(0);
                }
                this.field5312 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field5306 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label59: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        if (this.field5306 == null) {
                            this.field5306 = new class559(super.field3601);
                        }
                        int var10 = var4;
                        int var11 = var5;
                        this.field5312 = new class227[var9];
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && ~var11 >= -257) {
                                break label59;
                            }
                            this.field5312[var12++] = new class227(super.field3601, 3553, 34842, var10, var11);
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                            if (var10 > 256) {
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
            this.field5309 = var5;
            this.field5311 = var4;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V")
    public static final void method2221(int arg0, int arg1, int arg2, int arg3) {
        class44 var4 = class603.field8695[arg0][arg1][arg2];
        if (var4 != null) {
            class391 var5 = var4.field669;
            class391 var6 = var4.field675;
            if (var5 != null) {
                var5.field5913 = (short) (var5.field5913 * arg3 / (16 << class125.field1831 - 7));
                var5.field5912 = (short) (var5.field5912 * arg3 / (16 << class125.field1831 - 7));
            }
            if (var6 != null) {
                var6.field5913 = (short) (var6.field5913 * arg3 / (16 << class125.field1831 - 7));
                var6.field5912 = (short) (var6.field5912 * arg3 / (16 << class125.field1831 - 7));
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
    public static void method2222(int arg0) {
        field5314 = null;
        if (arg0 == 16111) {
            field5322 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
    public final void method1645(boolean arg0) {
        this.field5317 = null;
        this.field5313 = null;
        this.field5319 = null;
        this.field5303 = null;
        this.field5324 = null;
        this.field5312 = null;
        ++field5307;
        this.field5302 = null;
        if (!arg0) {
            this.field5321 = null;
            this.field5306 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIII)V")
    public static final void method2223(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 << 3;
        ++field5316;
        int var5 = arg0 << 3;
        if (arg3 == 1) {
            int var6 = arg1 << 3;
            class311.field4589 = (float) var6;
            if (class684.field9659 == 2) {
                class276.field3597 = var5;
                class246.field3255 = var4;
                class481.field6886 = var6;
            }
            class528.field7602 = (float) var4;
            class375.method2316((byte) 111);
            class567.field8268 = true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lwu;I)I")
    public static final int method2224(class149 arg0, int arg1) {
        if (arg1 != 6406) {
            field5314 = null;
        }
        ++field5304;
        if (class348.field5157 == arg0) {
            return 6407;
        } else if (class564.field8245 != arg0) {
            if (class592.field8601 == arg0) {
                return 6406;
            } else if (class145.field2081 != arg0) {
                if (class579.field8409 != arg0) {
                    if (class545.field8041 == arg0) {
                        return 6145;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    return 6410;
                }
            } else {
                return 6409;
            }
        } else {
            return 6408;
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)Z")
    public final boolean method1643(byte arg0) {
        int var2 = -25 / ((arg0 - -18) / 51);
        ++field5308;
        if (super.field3601.field4062 && super.field3601.field4099 && super.field3601.field4106) {
            this.field5317 = new class559(super.field3601);
            this.field5302 = new class227(super.field3601, 3553, 34842, 256, 256);
            this.field5302.method1424(10242, false, false);
            this.field5303 = new class227(super.field3601, 3553, 34842, 256, 256);
            this.field5303.method1424(10242, false, false);
            super.field3601.method1740(this.field5317, (byte) 127);
            this.field5317.method3235(-63, this.field5302, 0);
            this.field5317.method3235(62, this.field5303, 1);
            this.field5317.method3245(0, -63);
            if (!this.field5317.method3238(86)) {
                super.field3601.method1695(this.field5317, 255);
                return false;
            } else {
                super.field3601.method1695(this.field5317, 255);
                this.field5321 = class410.method2516(80, new class129[] { class94.method592((byte) -124, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field3601, 35632) }, super.field3601);
                this.field5324 = class410.method2516(37, new class129[] { class94.method592((byte) -69, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field3601, 35632) }, super.field3601);
                this.field5319 = class410.method2516(105, new class129[] { class94.method592((byte) 112, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field3601, 35632) }, super.field3601);
                this.field5313 = class410.method2516(-54, new class129[] { class94.method592((byte) -48, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field3601, 35632) }, super.field3601);
                return this.field5324 != null && this.field5321 != null && this.field5319 != null && this.field5313 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Z")
    public final boolean method1636(int arg0) {
        ++field5325;
        if (arg0 >= -62) {
            this.field5311 = -122;
        }
        return this.field5317 != null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Laaa;Laaa;II)V")
    public final void method1646(class227 arg0, class227 arg1, int arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field5305;
        OpenGL.glMatrixMode(5889);
        if (arg3 != -26006) {
            this.method1645(false);
        }
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5312 != null) {
            super.field3601.method1740(this.field5306, (byte) 120);
            int var5 = class334.method2048(this.field5318, (byte) -120);
            int var6 = class334.method2048(this.field5326, (byte) -71);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field5306.method3235(-107, this.field5312[var7], 0);
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                if (var7 != 0) {
                    super.field3601.method1709((byte) -124, this.field5312[var7 + -1]);
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
                    super.field3601.method1709((byte) -119, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field5318, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field5318, (float) this.field5326);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5326);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var6 > 256) {
                    var6 >>= 1;
                }
                ++var7;
            }
            super.field3601.method1695(this.field5306, 255);
            super.field3601.method1709((byte) -100, this.field5312[var7 + -1]);
            super.field3601.method1740(this.field5317, (byte) 127);
            this.field5317.method3245(0, -115);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field5324.field8262;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class445.field6468, 0.0F, 0.0F);
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
            super.field3601.method1709((byte) -68, arg1);
            super.field3601.method1740(this.field5317, (byte) 114);
            this.field5317.method3245(0, 120);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field5321.field8262;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class445.field6468, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field5318, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field5318, (float) this.field5326);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field5326);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field5317.method3245(1, 85);
        super.field3601.method1709((byte) -114, this.field5302);
        long var12 = this.field5313.field8262;
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
        this.field5317.method3245(0, arg3 + 26084);
        super.field3601.method1709((byte) -62, this.field5303);
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
        super.field3601.method1695(this.field5317, arg3 ^ -25963);
        long var14 = this.field5319.field8262;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class552.field8125, class100.field1517, 0.0F);
        super.field3601.method1745(true, 1);
        super.field3601.method1709((byte) -46, this.field5302);
        super.field3601.method1745(true, 0);
        super.field3601.method1709((byte) -104, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Luca;)V")
    public class362(class287 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)V")
    public final void method1638(byte arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field5323;
        super.field3601.method1745(true, 1);
        super.field3601.method1709((byte) -74, (class517) null);
        if (arg0 < -103) {
            super.field3601.method1745(true, 0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)I")
    public final int method1642(int arg0) {
        ++field5310;
        if (arg0 != 1) {
            this.field5326 = -112;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)Z")
    public final boolean method2225(byte arg0) {
        if (arg0 > -98) {
            this.field5303 = null;
        }
        ++field5315;
        return super.field3601.field4062 && super.field3601.field4099 && super.field3601.field4106;
    }
}
