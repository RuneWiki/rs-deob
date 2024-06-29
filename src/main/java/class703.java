import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class703 extends class659 {

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "[I")
    public static int[] field9873 = new int[3];

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field9867 = new String[200];

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!aq", name = "C", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "I")
    private int field9878;

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
    private int field9883;

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "I")
    private int field9884;

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "I")
    private int field9886;

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "Ldi;")
    private class243 field9864;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "Ldi;")
    private class243 field9865;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "Ldi;")
    private class243 field9868;

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "Ldi;")
    private class243 field9869;

    @OriginalMember(owner = "client!aq", name = "B", descriptor = "Lwt;")
    private class24 field9871;

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "Lwt;")
    private class24 field9885;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "Lg;")
    private class555 field9875;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "Lg;")
    private class555 field9879;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "[Lg;")
    private class555[] field9882;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)Z", line = 3)
    public final boolean method3660(int arg0) {
        if (arg0 < 27) {
            this.field9884 = -82;
        }
        ++field9888;
        if (super.field9248.field5948 && super.field9248.field5879 && super.field9248.field5889) {
            this.field9885 = new class24(super.field9248);
            this.field9879 = new class555(super.field9248, 3553, 34842, 256, 256);
            this.field9879.method3148(10243, false, false);
            this.field9875 = new class555(super.field9248, 3553, 34842, 256, 256);
            this.field9875.method3148(10243, false, false);
            super.field9248.method2364(this.field9885, (byte) -109);
            this.field9885.method127(0, this.field9879, 4);
            this.field9885.method127(1, this.field9875, 4);
            this.field9885.method110(false, 0);
            if (!this.field9885.method124((byte) -127)) {
                super.field9248.method2429(-30575, this.field9885);
                return false;
            } else {
                super.field9248.method2429(-30575, this.field9885);
                this.field9868 = class306.method1762(new class424[] { class6.method45(35632, true, super.field9248, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, (byte) -121, super.field9248);
                this.field9869 = class306.method1762(new class424[] { class6.method45(35632, true, super.field9248, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, (byte) -127, super.field9248);
                this.field9865 = class306.method1762(new class424[] { class6.method45(35632, true, super.field9248, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, (byte) -98, super.field9248);
                this.field9864 = class306.method1762(new class424[] { class6.method45(35632, true, super.field9248, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, (byte) -94, super.field9248);
                return this.field9869 != null && this.field9868 != null && this.field9865 != null && this.field9864 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZII)V", line = 40)
    public final void method3661(boolean arg0, int arg1, int arg2) {
        ++field9872;
        this.field9884 = arg2;
        this.field9886 = arg1;
        int var4 = class668.method3699(28069, this.field9886);
        if (!arg0) {
            this.method3658(-59, 48, (class555) null, (class555) null);
        }
        int var5 = class668.method3699(28069, this.field9884);
        if (this.field9883 != var4 || this.field9878 != var5) {
            if (this.field9882 != null) {
                for (int var6 = 0; ~var6 > ~this.field9882.length; ++var6) {
                    this.field9882[var6].method1834((byte) 120);
                }
                this.field9882 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field9871 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field9871 == null) {
                    this.field9871 = new class24(super.field9248);
                }
                label57: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        int var10 = var5;
                        int var11 = var4;
                        this.field9882 = new class555[var9];
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && var10 <= 256) {
                                break label57;
                            }
                            this.field9882[var12++] = new class555(super.field9248, 3553, 34842, var11, var10);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                        }
                    }
                    ++var9;
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                }
            }
            this.field9878 = var5;
            this.field9883 = var4;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILg;Lg;)V", line = 120)
    public final void method3658(int arg0, int arg1, class555 arg2, class555 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field9870;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field9882 == null) {
            super.field9248.method2396((byte) 36, arg2);
            super.field9248.method2364(this.field9885, (byte) -111);
            this.field9885.method110(false, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field9868.field3000;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class275.field3445, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field9886, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field9886, (float) this.field9884);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field9884);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field9248.method2364(this.field9871, (byte) -111);
            int var7 = class668.method3699(arg1 + 19974, this.field9886);
            int var8 = class668.method3699(28069, this.field9884);
            int var9 = 0;
            while (~var7 < -257 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field9871.method127(0, this.field9882[var9], 4);
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (~var9 == -1) {
                    super.field9248.method2396((byte) 36, arg2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field9886, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field9886, (float) this.field9884);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9884);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field9248.method2396((byte) 36, this.field9882[var9 + -1]);
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
                if (~var7 < -257) {
                    var7 >>= 1;
                }
                ++var9;
            }
            super.field9248.method2429(-30575, this.field9871);
            super.field9248.method2396((byte) 36, this.field9882[var9 + -1]);
            super.field9248.method2364(this.field9885, (byte) -113);
            this.field9885.method110(false, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field9869.field3000;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class275.field3445, 0.0F, 0.0F);
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
        this.field9885.method110(false, 1);
        super.field9248.method2396((byte) 36, this.field9879);
        long var12 = this.field9864.field3000;
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
        this.field9885.method110(false, 0);
        super.field9248.method2396((byte) 36, this.field9875);
        if (arg1 == 8095) {
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
            super.field9248.method2429(-30575, this.field9885);
            long var14 = this.field9865.field3000;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class678.field9536, class370.field5059, 0.0F);
            super.field9248.method2431((byte) -65, 1);
            super.field9248.method2396((byte) 36, this.field9879);
            super.field9248.method2431((byte) -45, 0);
            super.field9248.method2396((byte) 36, arg2);
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(II)V", line = 276)
    public static final void method3893(int arg0, int arg1) {
        ++field9866;
        class76 var2 = class3.method28(5, (byte) 42, arg0);
        var2.method406(-975503968);
        if (arg1 >= -108) {
            method3893(-39, 4);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)V", line = 289)
    public static final void method3894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~class412.field5526 >= ~arg4 && ~class72.field740 <= ~arg5 && class93.field949 <= arg0 && class360.field4834 >= arg2) {
            if (arg1 == 1) {
                class43.method220(arg0, arg2, arg4, arg5, arg6, -118);
            } else {
                class204.method1217(arg1, arg5, arg6, 8, arg0, arg4, arg2);
            }
        } else if (~arg1 != -2) {
            class706.method3941(arg5, arg4, -3870, arg0, arg1, arg2, arg6);
        } else {
            class25.method133(arg0, 801853752, arg5, arg2, arg6, arg4);
        }
        int var7 = -57 / ((arg3 - -46) / 50);
        ++field9877;
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)I", line = 324)
    public final int method3657(int arg0) {
        ++field9880;
        if (arg0 > -105) {
            this.field9875 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lvj;)V", line = 335)
    public class703(class422 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)Z", line = 340)
    public final boolean method3895(int arg0) {
        ++field9887;
        if (arg0 != 1) {
            this.method3655(36);
        }
        return super.field9248.field5948 && super.field9248.field5879 && super.field9248.field5889;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)V", line = 360)
    public static void method3896(boolean arg0) {
        if (arg0) {
            field9873 = null;
            field9867 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)V", line = 371)
    public final void method3663(int arg0, int arg1) {
        ++field9876;
        OpenGL.glUseProgramObjectARB(0L);
        super.field9248.method2431((byte) -23, 1);
        super.field9248.method2396((byte) 36, (class325) null);
        super.field9248.method2431((byte) -27, arg1);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)Z", line = 384)
    public final boolean method3652(int arg0) {
        ++field9874;
        if (arg0 != 1) {
            field9873 = null;
        }
        return this.field9885 != null;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V", line = 405)
    public final void method3655(int arg0) {
        this.field9882 = null;
        ++field9881;
        this.field9865 = null;
        this.field9885 = null;
        this.field9864 = null;
        this.field9871 = null;
        this.field9869 = null;
        if (arg0 != 7) {
            this.method3661(false, 11, -23);
        }
        this.field9879 = null;
        this.field9868 = null;
        this.field9875 = null;
    }
}
