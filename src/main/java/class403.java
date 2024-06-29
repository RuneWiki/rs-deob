import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class403 extends class334 {

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "[I")
    public static int[] field6056 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!cr", name = "Z", descriptor = "Z")
    public static boolean field6079 = false;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    private int field6062;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
    private int field6064;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
    private int field6071;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!cr", name = "V", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!cr", name = "Y", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!cr", name = "cb", descriptor = "I")
    private int field6082;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "Lkh;")
    private class13 field6058;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "Lkh;")
    private class13 field6069;

    @OriginalMember(owner = "client!cr", name = "W", descriptor = "Lkh;")
    private class13 field6076;

    @OriginalMember(owner = "client!cr", name = "ab", descriptor = "Lkh;")
    private class13 field6080;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "Lah;")
    private class260 field6061;

    @OriginalMember(owner = "client!cr", name = "bb", descriptor = "Lah;")
    private class260 field6081;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "Lf;")
    public static class529 field6057;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "Lfv;")
    private class77 field6066;

    @OriginalMember(owner = "client!cr", name = "Q", descriptor = "Lfv;")
    private class77 field6070;

    @OriginalMember(owner = "client!cr", name = "X", descriptor = "[Lah;")
    private class260[] field6077;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "(I)V")
    public static void method2426(int arg0) {
        int var1 = 46 / ((arg0 - -26) / 48);
        field6056 = null;
        field6057 = null;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lod;)V")
    public class403(class349 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "(I)Z")
    public final boolean method2038(int arg0) {
        ++field6060;
        if (arg0 != 0) {
            method2429(true);
        }
        if (super.field4704.field5318 && super.field4704.field5330 && super.field4704.field5263) {
            this.field6070 = new class77(super.field4704);
            this.field6081 = new class260(super.field4704, 3553, 34842, 256, 256);
            this.field6081.method1730(false, 10497, false);
            this.field6061 = new class260(super.field4704, 3553, 34842, 256, 256);
            this.field6061.method1730(false, 10497, false);
            super.field4704.method2137(this.field6070, -7906);
            this.field6070.method448(this.field6081, 0, (byte) -69);
            this.field6070.method448(this.field6061, 1, (byte) 88);
            this.field6070.method437(0, true);
            if (!this.field6070.method446(-101)) {
                super.field4704.method2133(this.field6070, -84);
                return false;
            } else {
                super.field4704.method2133(this.field6070, arg0 ^ -95);
                this.field6080 = class312.method1948(super.field4704, -105, new class307[] { class471.method2826("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field4704, 35632, (byte) 42) });
                this.field6058 = class312.method1948(super.field4704, -101, new class307[] { class471.method2826("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field4704, 35632, (byte) 44) });
                this.field6069 = class312.method1948(super.field4704, -127, new class307[] { class471.method2826("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field4704, 35632, (byte) 53) });
                this.field6076 = class312.method1948(super.field4704, -118, new class307[] { class471.method2826("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field4704, 35632, (byte) 88) });
                return this.field6058 != null && this.field6080 != null && this.field6069 != null && this.field6076 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "(I)Z")
    public final boolean method2427(int arg0) {
        if (arg0 >= -85) {
            return true;
        } else {
            ++field6063;
            return super.field4704.field5318 && super.field4704.field5330 && super.field4704.field5263;
        }
    }

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
    public final void method2034(int arg0) {
        if (arg0 >= -38) {
            field6079 = true;
        }
        this.field6081 = null;
        ++field6065;
        this.field6077 = null;
        this.field6061 = null;
        this.field6058 = null;
        this.field6069 = null;
        this.field6066 = null;
        this.field6080 = null;
        this.field6076 = null;
        this.field6070 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BII)V")
    public final void method2035(byte arg0, int arg1, int arg2) {
        this.field6062 = arg2;
        ++field6067;
        int var4 = -81 % ((11 - arg0) / 44);
        this.field6064 = arg1;
        int var5 = class293.method1867(this.field6062, -210300991);
        int var6 = class293.method1867(this.field6064, -210300991);
        if (this.field6082 != var5 || this.field6071 != var6) {
            if (this.field6077 != null) {
                for (int var7 = 0; this.field6077.length > var7; ++var7) {
                    this.field6077[var7].method2681(67);
                }
                this.field6077 = null;
            }
            if (~var5 >= -257 && ~var6 >= -257) {
                this.field6066 = null;
            } else {
                int var8 = var5;
                int var9 = var6;
                int var10 = 0;
                if (this.field6066 == null) {
                    this.field6066 = new class77(super.field4704);
                }
                label56: while (true) {
                    if (~var8 >= -257 && ~var9 >= -257) {
                        int var11 = var5;
                        int var12 = var6;
                        this.field6077 = new class260[var10];
                        int var13 = 0;
                        while (true) {
                            if (~var11 >= -257 && ~var12 >= -257) {
                                break label56;
                            }
                            this.field6077[var13++] = new class260(super.field4704, 3553, 34842, var11, var12);
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                            if (~var12 < -257) {
                                var12 >>= 1;
                            }
                        }
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    if (~var9 < -257) {
                        var9 >>= 1;
                    }
                    ++var10;
                }
            }
            this.field6071 = var6;
            this.field6082 = var5;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
    public static final void method2428(boolean arg0) {
        class49.field797 = arg0;
        ++field6072;
        class356.field5472 = null;
        class159.field2348 = null;
        class282.field4035 = null;
        class99.field1447 = null;
        class242.field3575 = null;
    }

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "(I)I")
    public final int method2037(int arg0) {
        ++field6059;
        return arg0 != 0 ? -70 : 1;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public static final String method2429(boolean arg0) {
        ++field6075;
        String var1 = "www";
        if (!arg0) {
            field6056 = null;
        }
        if (class498.field7351 == class447.field6662) {
            var1 = "www-wtrc";
        } else if (class447.field6662 != class176.field2600) {
            if (class447.field6662 == class317.field4558) {
                var1 = "www-wtwip";
            }
        } else {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class465.field6885 != null) {
            var2 = "/p=" + class465.field6885;
        }
        return "http://" + var1 + "." + class183.field2707.field6359 + ".com/l=" + class143.field2137 + "/a=" + class159.field2357 + var2 + "/";
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILah;ILah;)V")
    public final void method2040(int arg0, class260 arg1, int arg2, class260 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field6068;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6077 == null) {
            super.field4704.method2200(arg1, (byte) 118);
            super.field4704.method2137(this.field6070, -7906);
            this.field6070.method437(0, true);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field6080.field168;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class137.field2072, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6062, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6062, (float) this.field6064);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6064);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field4704.method2137(this.field6066, -7906);
            int var7 = class293.method1867(this.field6062, -210300991);
            int var8 = class293.method1867(this.field6064, -210300991);
            int var9 = 0;
            while (~var7 < -257 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field6066.method448(this.field6077[var9], 0, (byte) 100);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (var9 != 0) {
                    super.field4704.method2200(this.field6077[var9 - 1], (byte) 125);
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
                    super.field4704.method2200(arg1, (byte) 123);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6062, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6062, (float) this.field6064);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6064);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var8 > 256) {
                    var8 >>= 1;
                }
                ++var9;
            }
            super.field4704.method2133(this.field6066, -127);
            super.field4704.method2200(this.field6077[var9 + -1], (byte) 112);
            super.field4704.method2137(this.field6070, -7906);
            this.field6070.method437(0, true);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6058.field168;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class137.field2072, 0.0F, 0.0F);
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
        this.field6070.method437(1, true);
        super.field4704.method2200(this.field6081, (byte) 126);
        long var12 = this.field6076.field168;
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
        this.field6070.method437(0, true);
        super.field4704.method2200(this.field6061, (byte) 116);
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
        int var14 = 20 % ((-63 - arg0) / 40);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field4704.method2133(this.field6070, -106);
        long var15 = this.field6069.field168;
        OpenGL.glUseProgramObjectARB(var15);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var15, "params"), class504.field7389, class121.field1827, 0.0F);
        super.field4704.method2176(1, 76);
        super.field4704.method2200(this.field6081, (byte) 126);
        super.field4704.method2176(0, 73);
        super.field4704.method2200(arg1, (byte) 126);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)V")
    public final void method2030(byte arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        int var3 = 92 / ((39 - arg0) / 60);
        ++field6078;
        super.field4704.method2176(1, 80);
        super.field4704.method2200((class446) null, (byte) 120);
        super.field4704.method2176(0, 80);
    }

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "(I)Z")
    public final boolean method2042(int arg0) {
        ++field6073;
        if (arg0 != 0) {
            this.field6081 = null;
        }
        return this.field6070 != null;
    }
}
