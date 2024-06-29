import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class376 extends class167 {

    @OriginalMember(owner = "client!lv", name = "W", descriptor = "I")
    public static int field5014 = 0;

    @OriginalMember(owner = "client!lv", name = "Q", descriptor = "Lcea;")
    public static class180 field5008 = new class180("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!lv", name = "X", descriptor = "Z")
    public static boolean field5015 = false;

    @OriginalMember(owner = "client!lv", name = "Y", descriptor = "I")
    public static int field5016 = 0;

    @OriginalMember(owner = "client!lv", name = "Z", descriptor = "Lvj;")
    public static class373 field5017 = new class373(10, 7);

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!lv", name = "B", descriptor = "I")
    private int field4993;

    @OriginalMember(owner = "client!lv", name = "F", descriptor = "I")
    private int field4997;

    @OriginalMember(owner = "client!lv", name = "H", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!lv", name = "I", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!lv", name = "J", descriptor = "I")
    private int field5001;

    @OriginalMember(owner = "client!lv", name = "K", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!lv", name = "M", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!lv", name = "O", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!lv", name = "P", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!lv", name = "R", descriptor = "I")
    private int field5009;

    @OriginalMember(owner = "client!lv", name = "S", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!lv", name = "T", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!lv", name = "y", descriptor = "Lrr;")
    private class303 field4991;

    @OriginalMember(owner = "client!lv", name = "E", descriptor = "Lrr;")
    private class303 field4996;

    @OriginalMember(owner = "client!lv", name = "G", descriptor = "Lpi;")
    private class422 field4998;

    @OriginalMember(owner = "client!lv", name = "L", descriptor = "Lpi;")
    private class422 field5003;

    @OriginalMember(owner = "client!lv", name = "N", descriptor = "Lpi;")
    private class422 field5005;

    @OriginalMember(owner = "client!lv", name = "U", descriptor = "Lpi;")
    private class422 field5012;

    @OriginalMember(owner = "client!lv", name = "C", descriptor = "Ler;")
    private class88 field4994;

    @OriginalMember(owner = "client!lv", name = "V", descriptor = "Ler;")
    private class88 field5013;

    @OriginalMember(owner = "client!lv", name = "D", descriptor = "[Lrr;")
    private class303[] field4995;

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lmh;)V", line = 6)
    public class376(class537 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)Z", line = 14)
    public final boolean method933(int arg0) {
        ++field5011;
        if (arg0 >= -113) {
            this.field4995 = null;
        }
        return this.field5013 != null;
    }

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "(I)I", line = 28)
    public final int method941(int arg0) {
        if (arg0 != 0) {
            return -14;
        } else {
            ++field5010;
            return 1;
        }
    }

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "(I)V", line = 40)
    public static void method2190(int arg0) {
        field5008 = null;
        field5017 = null;
        if (arg0 != 0) {
            method2190(56);
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(III)V", line = 52)
    public final void method939(int arg0, int arg1, int arg2) {
        if (arg0 != 7) {
            this.method941(-45);
        }
        ++field5006;
        this.field4993 = arg1;
        this.field4997 = arg2;
        int var4 = class308.method1711((byte) -66, this.field4997);
        int var5 = class308.method1711((byte) -66, this.field4993);
        if (this.field5009 != var4 || this.field5001 != var5) {
            if (this.field4995 != null) {
                for (int var6 = 0; var6 < this.field4995.length; ++var6) {
                    this.field4995[var6].method1352(-98);
                }
                this.field4995 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field4994 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field4994 == null) {
                    this.field4994 = new class88(super.field2041);
                }
                label57: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        int var10 = var4;
                        this.field4995 = new class303[var9];
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (var10 <= 256 && var11 <= 256) {
                                break label57;
                            }
                            this.field4995[var12++] = new class303(super.field2041, 3553, 34842, var10, var11);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                        }
                    }
                    ++var9;
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                }
            }
            this.field5009 = var4;
            this.field5001 = var5;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)V", line = 132)
    public final void method932(boolean arg0) {
        this.field5005 = null;
        this.field5012 = null;
        this.field4998 = null;
        this.field4994 = null;
        this.field5003 = null;
        this.field4991 = null;
        this.field4995 = null;
        if (!arg0) {
            this.field5013 = null;
            ++field5007;
            this.field4996 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Z", line = 151)
    public final boolean method929(int arg0) {
        if (arg0 != -28261) {
            return true;
        } else {
            ++field5000;
            if (super.field2041.field7872 && super.field2041.field7763 && super.field2041.field7767) {
                this.field5013 = new class88(super.field2041);
                this.field4996 = new class303(super.field2041, 3553, 34842, 256, 256);
                this.field4996.method1671((byte) -46, false, false);
                this.field4991 = new class303(super.field2041, 3553, 34842, 256, 256);
                this.field4991.method1671((byte) -46, false, false);
                super.field2041.method3096(this.field5013, -127);
                this.field5013.method524(0, this.field4996, 111);
                this.field5013.method524(1, this.field4991, 118);
                this.field5013.method519((byte) -82, 0);
                if (!this.field5013.method522(-117)) {
                    super.field2041.method3109((byte) -108, this.field5013);
                    return false;
                } else {
                    super.field2041.method3109((byte) -108, this.field5013);
                    this.field5003 = class628.method3598(new class187[] { class381.method2206(super.field2041, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", (byte) 79) }, super.field2041, (byte) -24);
                    this.field4998 = class628.method3598(new class187[] { class381.method2206(super.field2041, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", (byte) 79) }, super.field2041, (byte) -61);
                    this.field5012 = class628.method3598(new class187[] { class381.method2206(super.field2041, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", (byte) 79) }, super.field2041, (byte) -105);
                    this.field5005 = class628.method3598(new class187[] { class381.method2206(super.field2041, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", (byte) 79) }, super.field2041, (byte) -8);
                    return this.field4998 != null && this.field5003 != null && this.field5012 != null && this.field5005 != null;
                }
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "(B)V", line = 192)
    public static final void method2191(byte arg0) {
        ++field5002;
        if (arg0 <= 26) {
            method2190(11);
        }
        if (class599.field8668 != -1) {
            int var1 = class368.field4859.method167(64);
            int var2 = class368.field4859.method169(-74);
            class379 var3 = (class379) class5.field43.method1050((byte) 73);
            if (var3 != null) {
                var1 = var3.method701(5);
                var2 = var3.method705(5);
            }
            class307.method1700(class426.field5495, 0, 0, var2, var1, -1, class599.field8668, class185.field2239, 0, 0);
            if (class552.field8122 != null) {
                class110.method641(-19850, var1, var2);
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)V", line = 223)
    public final void method934(int arg0, byte arg1) {
        ++field4992;
        OpenGL.glUseProgramObjectARB(0L);
        super.field2041.method3078(33984, 1);
        super.field2041.method3083((byte) 99, (class238) null);
        if (arg1 < 41) {
            this.field5009 = -35;
        }
        super.field2041.method3078(33984, 0);
    }

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "(I)Z", line = 242)
    public final boolean method2192(int arg0) {
        if (arg0 != 28764) {
            return false;
        } else {
            ++field4999;
            return super.field2041.field7872 && super.field2041.field7763 && super.field2041.field7767;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZLrr;ILrr;)V", line = 256)
    public final void method940(boolean arg0, class303 arg1, int arg2, class303 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field5004;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4995 == null) {
            super.field2041.method3083((byte) 70, arg3);
            super.field2041.method3096(this.field5013, -127);
            this.field5013.method519((byte) -97, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field5003.field5446;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class76.field895, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field4997, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field4997, (float) this.field4993);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field4993);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field2041.method3096(this.field4994, -127);
            int var7 = class308.method1711((byte) -66, this.field4997);
            int var8 = class308.method1711((byte) -66, this.field4993);
            int var9 = 0;
            while (~var7 < -257 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field4994.method524(0, this.field4995[var9], 124);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (var8 > 256) {
                    var8 >>= 1;
                }
                if (~var9 != -1) {
                    super.field2041.method3083((byte) 97, this.field4995[var9 + -1]);
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
                    super.field2041.method3083((byte) 85, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field4997, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field4997, (float) this.field4993);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4993);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var9;
            }
            super.field2041.method3109((byte) -108, this.field4994);
            super.field2041.method3083((byte) 100, this.field4995[var9 + -1]);
            super.field2041.method3096(this.field5013, -128);
            this.field5013.method519((byte) -81, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field4998.field5446;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class76.field895, 0.0F, 0.0F);
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
        this.field5013.method519((byte) -42, 1);
        if (arg0) {
            this.method933(7);
        }
        super.field2041.method3083((byte) 95, this.field4996);
        long var12 = this.field5005.field5446;
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
        this.field5013.method519((byte) -122, 0);
        super.field2041.method3083((byte) 81, this.field4991);
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
        super.field2041.method3109((byte) -108, this.field5013);
        long var14 = this.field5012.field5446;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class237.field2947, class184.field2229, 0.0F);
        super.field2041.method3078(33984, 1);
        super.field2041.method3083((byte) 82, this.field4996);
        super.field2041.method3078(33984, 0);
        super.field2041.method3083((byte) 115, arg3);
    }
}
