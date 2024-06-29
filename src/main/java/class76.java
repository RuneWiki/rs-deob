import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class76 extends class468 {

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "Lhn;")
    public static class509 field1098 = new class509(0, 0);

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "I")
    public static int field1102 = 0;

    @OriginalMember(owner = "client!bm", name = "X", descriptor = "I")
    public static int field1106 = 0;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "Lob;")
    public static class521 field1099 = new class521(29, -1);

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    private int field1095;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!bm", name = "W", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "Lfo;")
    private class361 field1082;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "Lfo;")
    private class361 field1089;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "Ltv;")
    private class395 field1085;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "Ltv;")
    private class395 field1091;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "Lfe;")
    private class404 field1094;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "Lfe;")
    private class404 field1097;

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "Lfe;")
    private class404 field1103;

    @OriginalMember(owner = "client!bm", name = "V", descriptor = "Lfe;")
    private class404 field1104;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "[Lfo;")
    private class361[] field1087;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "[[S")
    public static short[][] field1100;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V", line = 4)
    public final void method648(int arg0, int arg1, int arg2) {
        if (arg0 > -40) {
            this.method654(99, 104);
        }
        this.field1090 = arg2;
        this.field1095 = arg1;
        ++field1079;
        int var4 = class324.method2059((byte) 119, this.field1095);
        int var5 = class324.method2059((byte) 78, this.field1090);
        if (~this.field1088 != ~var4 || ~this.field1084 != ~var5) {
            if (this.field1087 != null) {
                for (int var6 = 0; this.field1087.length > var6; ++var6) {
                    this.field1087[var6].method2763((byte) 75);
                }
                this.field1087 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field1085 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field1085 == null) {
                    this.field1085 = new class395(super.field6765);
                }
                label58: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        int var10 = var4;
                        this.field1087 = new class361[var9];
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && ~var11 >= -257) {
                                break label58;
                            }
                            this.field1087[var12++] = new class361(super.field6765, 3553, 34842, var10, var11);
                            if (var10 > 256) {
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
                    ++var9;
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                }
            }
            this.field1088 = var4;
            this.field1084 = var5;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 82)
    public final void method649(int arg0) {
        this.field1089 = null;
        this.field1103 = null;
        this.field1085 = null;
        this.field1104 = null;
        this.field1091 = null;
        ++field1096;
        this.field1087 = null;
        this.field1097 = null;
        this.field1082 = null;
        this.field1094 = null;
        if (arg0 != -27396) {
            method650(-40);
        }
    }

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "(I)V", line = 111)
    public static void method650(int arg0) {
        if (arg0 != -26878) {
            method650(81);
        }
        field1100 = null;
        field1099 = null;
        field1098 = null;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)Z", line = 127)
    public final boolean method651(byte arg0) {
        ++field1081;
        int var2 = -19 / ((-3 - arg0) / 52);
        return super.field6765.field3145 && super.field6765.field3166 && super.field6765.field3165;
    }

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "(I)Z", line = 137)
    public final boolean method652(int arg0) {
        if (arg0 != 0) {
            this.method652(22);
        }
        ++field1086;
        return this.field1091 != null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lfo;IILfo;)V", line = 149)
    public final void method653(class361 arg0, int arg1, int arg2, class361 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field1092;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, (double) arg1, -1.0D, 1.0D);
        if (this.field1087 == null) {
            super.field6765.method1289(-19391, arg3);
            super.field6765.method1284(arg1 + 5121, this.field1091);
            this.field1091.method2483(0, (byte) 124);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field1094.field5993;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class304.field4593, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1095, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1095, (float) this.field1090);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1090);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field6765.method1284(5122, this.field1085);
            int var7 = class324.method2059((byte) 101, this.field1095);
            int var8 = class324.method2059((byte) 95, this.field1090);
            int var9 = 0;
            while (~var7 < -257 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field1085.method2491(0, (byte) -128, this.field1087[var9]);
                if (var9 != 0) {
                    super.field6765.method1289(-19391, this.field1087[var9 + -1]);
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
                    super.field6765.method1289(arg1 ^ -19392, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1095, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1095, (float) this.field1090);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1090);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                ++var9;
            }
            super.field6765.method1283(this.field1085, true);
            super.field6765.method1289(arg1 ^ -19392, this.field1087[var9 + -1]);
            super.field6765.method1284(5122, this.field1091);
            this.field1091.method2483(0, (byte) 124);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1104.field5993;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class304.field4593, 0.0F, 0.0F);
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
        this.field1091.method2483(1, (byte) 124);
        super.field6765.method1289(-19391, this.field1082);
        long var12 = this.field1097.field5993;
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
        this.field1091.method2483(0, (byte) 124);
        super.field6765.method1289(-19391, this.field1089);
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
        super.field6765.method1283(this.field1091, true);
        long var14 = this.field1103.field5993;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class289.field4356, class238.field3817, 0.0F);
        super.field6765.method1307(1, (byte) 92);
        super.field6765.method1289(arg1 + -19392, this.field1082);
        super.field6765.method1307(0, (byte) 92);
        super.field6765.method1289(-19391, arg3);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 304)
    public final void method654(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        if (arg1 != 7573) {
            field1106 = 81;
        }
        ++field1093;
        super.field6765.method1307(1, (byte) 92);
        super.field6765.method1289(-19391, (class454) null);
        super.field6765.method1307(0, (byte) 92);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lkd;)V", line = 319)
    public class76(class188 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)I", line = 323)
    public final int method655(boolean arg0) {
        ++field1083;
        if (!arg0) {
            field1101 = -59;
        }
        return 1;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)Z", line = 356)
    public final boolean method656(boolean arg0) {
        ++field1080;
        if (!arg0) {
            this.field1084 = 27;
        }
        if (super.field6765.field3145 && super.field6765.field3166 && super.field6765.field3165) {
            this.field1091 = new class395(super.field6765);
            this.field1082 = new class361(super.field6765, 3553, 34842, 256, 256);
            this.field1082.method2270(false, false, 10243);
            this.field1089 = new class361(super.field6765, 3553, 34842, 256, 256);
            this.field1089.method2270(false, false, 10243);
            super.field6765.method1284(5122, this.field1091);
            this.field1091.method2491(0, (byte) -128, this.field1082);
            this.field1091.method2491(1, (byte) -128, this.field1089);
            this.field1091.method2483(0, (byte) 124);
            if (!this.field1091.method2488(65)) {
                super.field6765.method1283(this.field1091, true);
                return false;
            } else {
                super.field6765.method1283(this.field1091, true);
                this.field1094 = class75.method647(-58, super.field6765, new class447[] { class71.method622(arg0, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field6765, 35632) });
                this.field1104 = class75.method647(-96, super.field6765, new class447[] { class71.method622(true, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field6765, 35632) });
                this.field1103 = class75.method647(116, super.field6765, new class447[] { class71.method622(true, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field6765, 35632) });
                this.field1097 = class75.method647(101, super.field6765, new class447[] { class71.method622(true, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field6765, 35632) });
                return this.field1104 != null && this.field1094 != null && this.field1103 != null && this.field1097 != null;
            }
        } else {
            return false;
        }
    }
}
