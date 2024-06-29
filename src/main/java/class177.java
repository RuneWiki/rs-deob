import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class177 extends class557 {

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "Lhga;")
    public static class158 field2888 = new class158(58, 0);

    @OriginalMember(owner = "client!ru", name = "Y", descriptor = "Lvg;")
    public static class49 field2913 = new class49(50);

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
    private int field2892;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    private int field2893;

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!ru", name = "I", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "I")
    private int field2901;

    @OriginalMember(owner = "client!ru", name = "O", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ru", name = "S", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!ru", name = "T", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!ru", name = "U", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ru", name = "V", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ru", name = "Z", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "Lwh;")
    private class133 field2889;

    @OriginalMember(owner = "client!ru", name = "N", descriptor = "Lwh;")
    private class133 field2902;

    @OriginalMember(owner = "client!ru", name = "R", descriptor = "Lnb;")
    private class276 field2906;

    @OriginalMember(owner = "client!ru", name = "X", descriptor = "Lnb;")
    private class276 field2912;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "Lcaa;")
    private class277 field2891;

    @OriginalMember(owner = "client!ru", name = "P", descriptor = "Lcaa;")
    private class277 field2904;

    @OriginalMember(owner = "client!ru", name = "Q", descriptor = "Lcaa;")
    private class277 field2905;

    @OriginalMember(owner = "client!ru", name = "W", descriptor = "Lcaa;")
    private class277 field2911;

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "[Lwh;")
    private class133[] field2900;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(Z)I")
    public final int method1428(boolean arg0) {
        if (arg0) {
            return 59;
        } else {
            ++field2909;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)Z")
    public final boolean method1429(byte arg0) {
        int var2 = 79 % ((39 - arg0) / 42);
        ++field2908;
        return this.field2912 != null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)Z")
    public final boolean method1430(int arg0) {
        ++field2907;
        if (arg0 >= -98) {
            return false;
        } else if (super.field8053.field1472 && super.field8053.field1438 && super.field8053.field1389) {
            this.field2912 = new class276(super.field8053);
            this.field2902 = new class133(super.field8053, 3553, 34842, 256, 256);
            this.field2902.method1158(false, false, (byte) 110);
            this.field2889 = new class133(super.field8053, 3553, 34842, 256, 256);
            this.field2889.method1158(false, false, (byte) 119);
            super.field8053.method881(false, this.field2912);
            this.field2912.method1968(0, this.field2902, (byte) 127);
            this.field2912.method1968(1, this.field2889, (byte) 126);
            this.field2912.method1967(0, -5);
            if (!this.field2912.method1970((byte) 115)) {
                super.field8053.method828(this.field2912, 0);
                return false;
            } else {
                super.field8053.method828(this.field2912, 0);
                this.field2904 = class402.method2585(super.field8053, false, new class199[] { class319.method2170(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field8053, (byte) 117) });
                this.field2905 = class402.method2585(super.field8053, false, new class199[] { class319.method2170(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field8053, (byte) 121) });
                this.field2911 = class402.method2585(super.field8053, false, new class199[] { class319.method2170(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field8053, (byte) 98) });
                this.field2891 = class402.method2585(super.field8053, false, new class199[] { class319.method2170(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field8053, (byte) 72) });
                return this.field2905 != null && this.field2904 != null && this.field2911 != null && this.field2891 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)V")
    public final void method1431(int arg0, int arg1) {
        ++field2890;
        OpenGL.glUseProgramObjectARB(0L);
        int var3 = 62 / ((-71 - arg0) / 42);
        super.field8053.method834(true, 1);
        super.field8053.method856(false, (class386) null);
        super.field8053.method834(true, 0);
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ler;)V")
    public class177(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
    public final void method1432(boolean arg0) {
        this.field2900 = null;
        ++field2894;
        if (!arg0) {
            this.field2906 = null;
        }
        this.field2911 = null;
        this.field2891 = null;
        this.field2904 = null;
        this.field2902 = null;
        this.field2906 = null;
        this.field2912 = null;
        this.field2889 = null;
        this.field2905 = null;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(III)Z")
    public static final boolean method1433(int arg0, int arg1, int arg2) {
        ++field2896;
        int var3 = -119 / ((62 - arg2) / 40);
        return (32768 & arg1) != 0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)V")
    public final void method1434(int arg0, int arg1, int arg2) {
        ++field2895;
        this.field2897 = arg1;
        this.field2893 = arg0;
        if (arg2 != 256) {
            this.field2911 = null;
        }
        int var4 = class638.method3708(false, this.field2897);
        int var5 = class638.method3708(false, this.field2893);
        if (~this.field2892 != ~var4 || this.field2901 != var5) {
            if (this.field2900 != null) {
                for (int var6 = 0; ~var6 > ~this.field2900.length; ++var6) {
                    this.field2900[var6].method2513(-4);
                }
                this.field2900 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field2906 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field2906 == null) {
                    this.field2906 = new class276(super.field8053);
                }
                label60: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        int var10 = var5;
                        this.field2900 = new class133[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && ~var10 >= -257) {
                                break label60;
                            }
                            this.field2900[var12++] = new class133(super.field8053, 3553, 34842, var11, var10);
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field2901 = var5;
            this.field2892 = var4;
        }
    }

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "(I)V")
    public static void method1435(int arg0) {
        field2913 = null;
        field2888 = null;
        if (arg0 >= -12) {
            method1433(-8, -118, -99);
        }
    }

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "(B)Z")
    public final boolean method1436(byte arg0) {
        if (arg0 < 37) {
            field2888 = null;
        }
        ++field2903;
        return super.field8053.field1472 && super.field8053.field1438 && super.field8053.field1389;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILwh;Lwh;I)V")
    public final void method1437(int arg0, class133 arg1, class133 arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field2898;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, (double) arg3, -1.0D, 1.0D);
        if (this.field2900 != null) {
            super.field8053.method881(false, this.field2906);
            int var5 = class638.method3708(false, this.field2897);
            int var6 = class638.method3708(false, this.field2893);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field2906.method1968(0, this.field2900[var7], (byte) -69);
                if (~var7 != -1) {
                    super.field8053.method856(false, this.field2900[var7 + -1]);
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
                    super.field8053.method856(false, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field2897, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field2897, (float) this.field2893);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2893);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field8053.method828(this.field2906, 0);
            super.field8053.method856(false, this.field2900[var7 + -1]);
            super.field8053.method881(false, this.field2912);
            this.field2912.method1967(0, -5);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field2905.field4482;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class313.field4924, 0.0F, 0.0F);
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
            super.field8053.method856(false, arg1);
            super.field8053.method881(false, this.field2912);
            this.field2912.method1967(0, -5);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field2904.field4482;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class313.field4924, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field2897, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field2897, (float) this.field2893);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field2893);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field2912.method1967(1, -5);
        super.field8053.method856(false, this.field2902);
        long var12 = this.field2891.field4482;
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
        this.field2912.method1967(0, -5);
        super.field8053.method856(false, this.field2889);
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
        super.field8053.method828(this.field2912, 0);
        long var14 = this.field2911.field4482;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class44.field617, class578.field8242, 0.0F);
        super.field8053.method834(true, 1);
        super.field8053.method856(false, this.field2902);
        super.field8053.method834(true, 0);
        super.field8053.method856(false, arg1);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1438(String arg0, byte arg1) {
        ++field2899;
        if (arg1 != -72) {
            field2913 = null;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            char var5 = arg0.charAt(var4);
            if (var5 <= 127) {
                ++var3;
            } else if (~var5 >= -2048) {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        return var3;
    }
}
