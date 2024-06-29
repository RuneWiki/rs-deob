import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class311 extends class474 {

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    private int field4294;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    private int field4300;

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
    private int field4303;

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
    private int field4305;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!cs", name = "T", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!cs", name = "W", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!cs", name = "X", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!cs", name = "Y", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!cs", name = "Z", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!cs", name = "U", descriptor = "J")
    public static long field4309;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "Lcw;")
    private class164 field4299;

    @OriginalMember(owner = "client!cs", name = "V", descriptor = "Lcw;")
    private class164 field4310;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "Llf;")
    public static class215 field4304;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "Lvca;")
    private class254 field4295;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "Lvca;")
    private class254 field4302;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "Lwba;")
    private class46 field4292;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "Lwba;")
    private class46 field4293;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "Lwba;")
    private class46 field4297;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "Lwba;")
    private class46 field4301;

    @OriginalMember(owner = "client!cs", name = "S", descriptor = "[Lcw;")
    private class164[] field4307;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lcw;IILcw;)V")
    public final void method1881(class164 arg0, int arg1, int arg2, class164 arg3) {
        ++field4312;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4307 != null) {
            super.field6531.method3200((byte) -47, this.field4295);
            int var5 = class180.method1240(this.field4305, arg1 ^ -2);
            int var6 = class180.method1240(this.field4294, -1);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field4295.method1567(this.field4307[var7], (byte) 40, 0);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (~var7 == -1) {
                    super.field6531.method3206(arg3, (byte) 26);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field4305, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field4305, (float) this.field4294);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4294);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field6531.method3206(this.field4307[var7 + -1], (byte) 26);
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
            super.field6531.method3166(this.field4295, (byte) -126);
            super.field6531.method3206(this.field4307[var7 + -1], (byte) 26);
            super.field6531.method3200((byte) -47, this.field4302);
            this.field4302.method1557(false, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field4301.field552;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class306.field4227, 0.0F, 0.0F);
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
            super.field6531.method3206(arg3, (byte) 26);
            super.field6531.method3200((byte) -47, this.field4302);
            this.field4302.method1557(false, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field4293.field552;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class306.field4227, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field4305, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field4305, (float) this.field4294);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field4294);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field4302.method1557(false, 1);
        super.field6531.method3206(this.field4310, (byte) 26);
        long var12 = this.field4292.field552;
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
        this.field4302.method1557(false, 0);
        super.field6531.method3206(this.field4299, (byte) 26);
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
        super.field6531.method3166(this.field4302, (byte) -126);
        long var14 = this.field4297.field552;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), arg1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class42.field494, class602.field8396, 0.0F);
        super.field6531.method3220(0, 1);
        super.field6531.method3206(this.field4310, (byte) 26);
        super.field6531.method3220(0, 0);
        super.field6531.method3206(arg3, (byte) 26);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
    public final void method1882(int arg0, int arg1) {
        int var3 = -52 % ((arg1 - 53) / 51);
        ++field4314;
        OpenGL.glUseProgramObjectARB(0L);
        super.field6531.method3220(0, 1);
        super.field6531.method3206((class136) null, (byte) 26);
        super.field6531.method3220(0, 0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public final void method1883(int arg0) {
        this.field4302 = null;
        this.field4297 = null;
        if (arg0 == 34842) {
            this.field4310 = null;
            this.field4307 = null;
            this.field4293 = null;
            this.field4292 = null;
            this.field4295 = null;
            ++field4308;
            this.field4299 = null;
            this.field4301 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)I")
    public final int method1884(byte arg0) {
        if (arg0 > -109) {
            return -72;
        } else {
            ++field4306;
            return 1;
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)Z")
    public final boolean method1885(int arg0) {
        ++field4313;
        if (super.field6531.field7949 && super.field6531.field7890 && super.field6531.field7955) {
            this.field4302 = new class254(super.field6531);
            this.field4310 = new class164(super.field6531, 3553, 34842, 256, 256);
            this.field4310.method1151(false, 45, false);
            this.field4299 = new class164(super.field6531, 3553, 34842, 256, 256);
            this.field4299.method1151(false, 117, false);
            super.field6531.method3200((byte) -47, this.field4302);
            this.field4302.method1567(this.field4310, (byte) 40, 0);
            this.field4302.method1567(this.field4299, (byte) 40, 1);
            this.field4302.method1557(false, 0);
            if (!this.field4302.method1563(-6236)) {
                super.field6531.method3166(this.field4302, (byte) -126);
                return false;
            } else {
                super.field6531.method3166(this.field4302, (byte) -126);
                this.field4293 = class138.method966((byte) -66, super.field6531, new class17[] { class78.method604((byte) -113, super.field6531, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field4301 = class138.method966((byte) -66, super.field6531, new class17[] { class78.method604((byte) -102, super.field6531, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field4297 = class138.method966((byte) -66, super.field6531, new class17[] { class78.method604((byte) -125, super.field6531, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
                this.field4292 = class138.method966((byte) -66, super.field6531, new class17[] { class78.method604((byte) -112, super.field6531, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
                return this.field4301 != null && this.field4293 != null && this.field4297 != null && this.field4292 != null;
            }
        } else {
            if (arg0 < 123) {
                this.method1885(-101);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
    public final void method1886(int arg0, int arg1, int arg2) {
        this.field4294 = arg0;
        this.field4305 = arg1;
        if (arg2 > 89) {
            ++field4296;
            int var4 = class180.method1240(this.field4305, -1);
            int var5 = class180.method1240(this.field4294, -1);
            if (this.field4303 != var4 || ~this.field4300 != ~var5) {
                if (this.field4307 != null) {
                    for (int var6 = 0; this.field4307.length > var6; ++var6) {
                        this.field4307[var6].method949((byte) -67);
                    }
                    this.field4307 = null;
                }
                if (var4 <= 256 && var5 <= 256) {
                    this.field4295 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    label62: while (true) {
                        if (var7 <= 256 && var8 <= 256) {
                            if (this.field4295 == null) {
                                this.field4295 = new class254(super.field6531);
                            }
                            int var10 = var4;
                            int var11 = var5;
                            this.field4307 = new class164[var9];
                            int var12 = 0;
                            while (true) {
                                if (~var10 >= -257 && var11 <= 256) {
                                    break label62;
                                }
                                this.field4307[var12++] = new class164(super.field6531, 3553, 34842, var10, var11);
                                if (var10 > 256) {
                                    var10 >>= 1;
                                }
                                if (~var11 < -257) {
                                    var11 >>= 1;
                                }
                            }
                        }
                        if (var7 > 256) {
                            var7 >>= 1;
                        }
                        if (~var8 < -257) {
                            var8 >>= 1;
                        }
                        ++var9;
                    }
                }
                this.field4300 = var5;
                this.field4303 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(B)V")
    public static void method1887(byte arg0) {
        int var1 = -90 / ((26 - arg0) / 40);
        field4304 = null;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Llj;)V")
    public class311(class565 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)Z")
    public final boolean method1888(boolean arg0) {
        ++field4291;
        if (!arg0) {
            return false;
        } else {
            return this.field4302 != null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)Z")
    public final boolean method1889(int arg0) {
        if (arg0 != 18226) {
            this.field4310 = null;
        }
        ++field4311;
        return super.field6531.field7949 && super.field6531.field7890 && super.field6531.field7955;
    }
}
