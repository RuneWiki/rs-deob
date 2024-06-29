import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class428 extends class194 {

    @OriginalMember(owner = "client!uba", name = "y", descriptor = "Luf;")
    public static class445 field5978 = new class445();

    @OriginalMember(owner = "client!uba", name = "D", descriptor = "D")
    public static double field5983;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
    private int field5975;

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!uba", name = "A", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!uba", name = "B", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!uba", name = "F", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!uba", name = "I", descriptor = "I")
    private int field5988;

    @OriginalMember(owner = "client!uba", name = "K", descriptor = "I")
    private int field5990;

    @OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!uba", name = "M", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!uba", name = "N", descriptor = "I")
    private int field5993;

    @OriginalMember(owner = "client!uba", name = "C", descriptor = "Las;")
    private class151 field5982;

    @OriginalMember(owner = "client!uba", name = "E", descriptor = "Las;")
    private class151 field5984;

    @OriginalMember(owner = "client!uba", name = "H", descriptor = "Las;")
    private class151 field5987;

    @OriginalMember(owner = "client!uba", name = "P", descriptor = "Las;")
    private class151 field5995;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "Lme;")
    private class192 field5970;

    @OriginalMember(owner = "client!uba", name = "O", descriptor = "Lme;")
    private class192 field5994;

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "Lij;")
    private class419 field5973;

    @OriginalMember(owner = "client!uba", name = "x", descriptor = "Lij;")
    private class419 field5977;

    @OriginalMember(owner = "client!uba", name = "G", descriptor = "Ljava/lang/Object;")
    public static Object field5986;

    @OriginalMember(owner = "client!uba", name = "J", descriptor = "[I")
    public static int[] field5989;

    @OriginalMember(owner = "client!uba", name = "w", descriptor = "[Lme;")
    private class192[] field5976;

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "(I)Z", line = 8)
    public final boolean method1365(int arg0) {
        if (arg0 != 8023) {
            this.method1363((byte) -69);
        }
        ++field5980;
        if (super.field2790.field8624 && super.field2790.field8684 && super.field2790.field8596) {
            this.field5973 = new class419(super.field2790);
            this.field5994 = new class192(super.field2790, 3553, 34842, 256, 256);
            this.field5994.method1346((byte) -105, false, false);
            this.field5970 = new class192(super.field2790, 3553, 34842, 256, 256);
            this.field5970.method1346((byte) -97, false, false);
            super.field2790.method3446(this.field5973, (byte) 121);
            this.field5973.method2556(this.field5994, true, 0);
            this.field5973.method2556(this.field5970, true, 1);
            this.field5973.method2569(0, (byte) -64);
            if (!this.field5973.method2557(119)) {
                super.field2790.method3442((byte) -68, this.field5973);
                return false;
            } else {
                super.field2790.method3442((byte) -66, this.field5973);
                this.field5984 = class701.method3942(new class698[] { class656.method3697(35632, 0, super.field2790, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field2790, 125);
                this.field5987 = class701.method3942(new class698[] { class656.method3697(35632, 0, super.field2790, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field2790, -95);
                this.field5982 = class701.method3942(new class698[] { class656.method3697(35632, 0, super.field2790, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.field2790, -106);
                this.field5995 = class701.method3942(new class698[] { class656.method3697(35632, 0, super.field2790, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.field2790, arg0 + -7899);
                return this.field5987 != null && this.field5984 != null && this.field5982 != null && this.field5995 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)Z", line = 53)
    public final boolean method2600(byte arg0) {
        ++field5974;
        if (arg0 < 12) {
            this.field5990 = -73;
        }
        return super.field2790.field8624 && super.field2790.field8684 && super.field2790.field8596;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)V", line = 65)
    public final void method1356(int arg0, byte arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        if (arg1 > -52) {
            this.method1364((byte) 2);
        }
        ++field5979;
        super.field2790.method3413(1, 33984);
        super.field2790.method3425((class87) null, 126);
        super.field2790.method3413(0, 33984);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BII)V", line = 83)
    public final void method1359(byte arg0, int arg1, int arg2) {
        this.field5988 = arg2;
        if (arg0 != 106) {
            this.method1359((byte) 1, -16, 41);
        }
        ++field5981;
        this.field5975 = arg1;
        int var4 = class271.method1797(2864, this.field5975);
        int var5 = class271.method1797(2864, this.field5988);
        if (~this.field5993 != ~var4 || this.field5990 != var5) {
            if (this.field5976 != null) {
                for (int var6 = 0; ~this.field5976.length < ~var6; ++var6) {
                    this.field5976[var6].method821((byte) 38);
                }
                this.field5976 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field5977 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field5977 == null) {
                    this.field5977 = new class419(super.field2790);
                }
                label58: while (true) {
                    if (var7 <= 256 && var8 <= 256) {
                        int var10 = var5;
                        this.field5976 = new class192[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && ~var10 >= -257) {
                                break label58;
                            }
                            this.field5976[var12++] = new class192(super.field2790, 3553, 34842, var11, var10);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    ++var9;
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                }
            }
            this.field5990 = var5;
            this.field5993 = var4;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)Z", line = 161)
    public final boolean method1362(boolean arg0) {
        ++field5992;
        if (!arg0) {
            field5986 = null;
        }
        return this.field5973 != null;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(IB)Z", line = 172)
    public static final boolean method2601(int arg0, byte arg1) {
        ++field5991;
        if (arg1 != -121) {
            method2601(-2, (byte) 117);
        }
        return arg0 == 7 || arg0 == 8 || ~arg0 == -10;
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Loea;)V", line = 183)
    public class428(class594 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)I", line = 186)
    public final int method1364(byte arg0) {
        int var2 = -126 % ((arg0 - -59) / 55);
        ++field5972;
        return 1;
    }

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "(I)V", line = 196)
    public static void method2602(int arg0) {
        field5989 = null;
        field5978 = null;
        field5986 = null;
        if (arg0 != -19863) {
            method2601(124, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V", line = 209)
    public final void method1363(byte arg0) {
        this.field5984 = null;
        this.field5982 = null;
        ++field5985;
        this.field5973 = null;
        this.field5987 = null;
        this.field5995 = null;
        this.field5976 = null;
        this.field5977 = null;
        this.field5994 = null;
        this.field5970 = null;
        if (arg0 <= 101) {
            this.method1363((byte) -60);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BILme;Lme;)V", line = 229)
    public final void method1358(byte arg0, int arg1, class192 arg2, class192 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field5971;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5976 != null) {
            super.field2790.method3446(this.field5977, (byte) 27);
            int var5 = class271.method1797(2864, this.field5975);
            int var6 = class271.method1797(2864, this.field5988);
            int var7 = 0;
            while (~var5 < -257 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field5977.method2556(this.field5976[var7], true, 0);
                if (var7 == 0) {
                    super.field2790.method3425(arg3, 80);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field5975, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field5975, (float) this.field5988);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5988);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field2790.method3425(this.field5976[var7 + -1], -63);
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
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (var6 > 256) {
                    var6 >>= 1;
                }
                ++var7;
            }
            super.field2790.method3442((byte) -70, this.field5977);
            super.field2790.method3425(this.field5976[var7 + -1], -104);
            super.field2790.method3446(this.field5973, (byte) 119);
            this.field5973.method2569(0, (byte) -73);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field5987.field2282;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class455.field6583, 0.0F, 0.0F);
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
            super.field2790.method3425(arg3, 113);
            super.field2790.method3446(this.field5973, (byte) 5);
            this.field5973.method2569(0, (byte) -103);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field5984.field2282;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class455.field6583, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field5975, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field5975, (float) this.field5988);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field5988);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field5973.method2569(1, (byte) -72);
        super.field2790.method3425(this.field5994, 110);
        long var12 = this.field5995.field2282;
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
        this.field5973.method2569(0, (byte) -88);
        super.field2790.method3425(this.field5970, 86);
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
        super.field2790.method3442((byte) -97, this.field5973);
        long var14 = this.field5982.field2282;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        if (arg0 < 50) {
            field5986 = null;
        }
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class539.field7588, class345.field4859, 0.0F);
        super.field2790.method3413(1, 33984);
        super.field2790.method3425(this.field5994, -74);
        super.field2790.method3413(0, 33984);
        super.field2790.method3425(arg3, 97);
    }
}
