import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class496 extends class237 {

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "Z")
    public static boolean field6908 = false;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "Ljava/lang/String;")
    public static String field6913 = null;

    @OriginalMember(owner = "client!ts", name = "P", descriptor = "I")
    public static int field6931 = 0;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    private int field6910;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    private int field6920;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    private int field6922;

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    private int field6926;

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!ts", name = "N", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!ts", name = "Q", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!ts", name = "U", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "Lsaa;")
    private class298 field6911;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "Lsaa;")
    private class298 field6921;

    @OriginalMember(owner = "client!ts", name = "T", descriptor = "Lhp;")
    public static class299 field6935;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "Lfr;")
    private class378 field6915;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "Lfr;")
    private class378 field6917;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "Lfr;")
    private class378 field6919;

    @OriginalMember(owner = "client!ts", name = "O", descriptor = "Lfr;")
    private class378 field6930;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "Lci;")
    private class416 field6909;

    @OriginalMember(owner = "client!ts", name = "I", descriptor = "Lci;")
    private class416 field6924;

    @OriginalMember(owner = "client!ts", name = "S", descriptor = "Lf;")
    public static class701 field6934;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "[Lsaa;")
    private class298[] field6912;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZI)V", line = 6)
    public final void method1445(int arg0, boolean arg1, int arg2) {
        this.field6922 = arg0;
        if (!arg1) {
            ++field6918;
            this.field6926 = arg2;
            int var4 = class13.method143(this.field6926, 105);
            int var5 = class13.method143(this.field6922, 108);
            if (~this.field6920 != ~var4 || this.field6910 != var5) {
                if (this.field6912 != null) {
                    for (int var6 = 0; ~var6 > ~this.field6912.length; ++var6) {
                        this.field6912[var6].method1204(-1);
                    }
                    this.field6912 = null;
                }
                if (~var4 >= -257 && var5 <= 256) {
                    this.field6909 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    label59: while (true) {
                        if (var7 <= 256 && ~var8 >= -257) {
                            if (this.field6909 == null) {
                                this.field6909 = new class416(super.field3188);
                            }
                            int var10 = var5;
                            this.field6912 = new class298[var9];
                            int var11 = var4;
                            int var12 = 0;
                            while (true) {
                                if (var11 <= 256 && ~var10 >= -257) {
                                    break label59;
                                }
                                this.field6912[var12++] = new class298(super.field3188, 3553, 34842, var11, var10);
                                if (~var11 < -257) {
                                    var11 >>= 1;
                                }
                                if (~var10 < -257) {
                                    var10 >>= 1;
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
                this.field6920 = var4;
                this.field6910 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V", line = 85)
    public final void method1439(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field6929;
        if (arg0 != -257) {
            this.field6924 = null;
        }
        super.field3188.method2975(1, 75);
        super.field3188.method2932(true, (class197) null);
        super.field3188.method2975(0, 91);
    }

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "(B)Z", line = 99)
    public final boolean method2888(byte arg0) {
        ++field6923;
        int var2 = 65 % ((79 - arg0) / 43);
        return super.field3188.field7397 && super.field3188.field7370 && super.field3188.field7368;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z", line = 111)
    public final boolean method1441(int arg0) {
        ++field6932;
        if (arg0 != 0) {
            field6908 = true;
        }
        return this.field6924 != null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lsaa;ILsaa;B)V", line = 123)
    public final void method1446(class298 arg0, int arg1, class298 arg2, byte arg3) {
        ++field6916;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6912 != null) {
            super.field3188.method2953(112, this.field6909);
            int var5 = class13.method143(this.field6926, 125);
            int var6 = class13.method143(this.field6922, 127);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field6909.method2495(false, this.field6912[var7], 0);
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                if (~var7 != -1) {
                    super.field3188.method2932(true, this.field6912[var7 + -1]);
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
                    super.field3188.method2932(true, arg2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6926, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6926, (float) this.field6922);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6922);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field3188.method2954(this.field6909, true);
            super.field3188.method2932(true, this.field6912[var7 + -1]);
            super.field3188.method2953(126, this.field6924);
            this.field6924.method2505(0, false);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field6919.field5078;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class170.field2080, 0.0F, 0.0F);
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
            super.field3188.method2932(true, arg2);
            super.field3188.method2953(105, this.field6924);
            this.field6924.method2505(0, false);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6930.field5078;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class170.field2080, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6926, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6926, (float) this.field6922);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6922);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field6924.method2505(1, false);
        super.field3188.method2932(true, this.field6921);
        long var12 = this.field6917.field5078;
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
        if (arg3 > 54) {
            OpenGL.glEnd();
            this.field6924.method2505(0, false);
            super.field3188.method2932(true, this.field6911);
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
            super.field3188.method2954(this.field6924, true);
            long var14 = this.field6915.field5078;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class358.field4773, class40.field755, 0.0F);
            super.field3188.method2975(1, 74);
            super.field3188.method2932(true, this.field6921);
            super.field3188.method2975(0, 111);
            super.field3188.method2932(true, arg2);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIZLjava/lang/String;I)V", line = 281)
    public static final void method2889(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
        int var5 = 61 / ((32 - arg4) / 39);
        ++field6928;
        class378.method2196((byte) 127, false, arg3, arg2, arg0, (String) null, arg1);
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lkga;)V", line = 303)
    public class496(class506 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "(B)V", line = 306)
    public static final void method2890(byte arg0) {
        int var1 = 59 / ((arg0 - 16) / 40);
        ++field6925;
        class38 var2 = null;
        try {
            class477 var3 = class517.field7570.method1505("3", -1, false);
            while (var3.field6693 == 0) {
                class151.method974((byte) -102, 1L);
            }
            if (var3.field6693 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var2 = (class38) var3.field6695;
            byte[] var4 = new byte[(int) var2.method445(0)];
            if (~var4.length != -1) {
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method440(var5, -106, var4.length + -var5, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class389 var7 = new class389(var4);
                int var8 = var7.method2229(255);
                if (~var8 < -121) {
                    throw new RuntimeException("Bad length");
                }
                var7.field5195 = var8 + 1;
                if (!var7.method2231(0)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var7.field5195 = 1;
                int var9 = var7.method2229(255);
                if (var9 > 3) {
                    throw new RuntimeException("Invalid version " + var9);
                }
                class682.field9753 = var7.method2224(-1);
                class14.field240 = var7.method2224(-1);
                if (~var9 <= -2) {
                    class642.field9172 = var7.method2260(-120);
                } else {
                    class642.field9172 = class171.field2092;
                }
                if (var9 < 2) {
                    class683.field9763 = class163.field1995;
                } else {
                    class683.field9763 = var7.method2227(-26276);
                }
                if (var9 >= 3) {
                    if (var7.method2229(255) != 1) {
                        class17.field475 = null;
                    } else {
                        class17.field475 = var7.method2224(-1);
                    }
                } else {
                    class17.field475 = class12.field203;
                }
            } else {
                class682.field9753 = "";
                class14.field240 = "";
            }
        } catch (Exception var11) {
            class14.field240 = "";
            class682.field9753 = "";
        }
        try {
            if (var2 != null) {
                var2.method442((byte) -72);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)I", line = 404)
    public final int method1443(int arg0) {
        if (arg0 != 1) {
            this.method1444((byte) -110);
        }
        ++field6936;
        return 1;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V", line = 415)
    public final void method1447(boolean arg0) {
        this.field6909 = null;
        this.field6911 = null;
        ++field6933;
        if (!arg0) {
            this.field6919 = null;
        }
        this.field6915 = null;
        this.field6919 = null;
        this.field6930 = null;
        this.field6917 = null;
        this.field6921 = null;
        this.field6924 = null;
        this.field6912 = null;
    }

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "(I)V", line = 435)
    public static void method2891(int arg0) {
        field6935 = null;
        field6913 = null;
        field6934 = null;
        int var1 = 104 % ((-50 - arg0) / 55);
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "(B)Z", line = 451)
    public final boolean method1444(byte arg0) {
        ++field6927;
        if (super.field3188.field7397 && super.field3188.field7370 && super.field3188.field7368) {
            this.field6924 = new class416(super.field3188);
            this.field6921 = new class298(super.field3188, 3553, 34842, 256, 256);
            this.field6921.method1767(false, false, 10242);
            this.field6911 = new class298(super.field3188, 3553, 34842, 256, 256);
            this.field6911.method1767(false, false, 10242);
            super.field3188.method2953(116, this.field6924);
            this.field6924.method2495(false, this.field6921, 0);
            this.field6924.method2495(false, this.field6911, 1);
            this.field6924.method2505(0, false);
            if (!this.field6924.method2504(80)) {
                super.field3188.method2954(this.field6924, true);
                return false;
            } else {
                super.field3188.method2954(this.field6924, true);
                this.field6930 = class339.method1957(new class97[] { class161.method1021(super.field3188, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, -79) }, super.field3188, (byte) -116);
                this.field6919 = class339.method1957(new class97[] { class161.method1021(super.field3188, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, -87) }, super.field3188, (byte) -81);
                this.field6915 = class339.method1957(new class97[] { class161.method1021(super.field3188, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, -79) }, super.field3188, (byte) -118);
                this.field6917 = class339.method1957(new class97[] { class161.method1021(super.field3188, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, -74) }, super.field3188, (byte) -107);
                return this.field6919 != null && this.field6930 != null && this.field6915 != null && this.field6917 != null;
            }
        } else {
            if (arg0 >= -27) {
                this.method1447(true);
            }
            return false;
        }
    }
}
