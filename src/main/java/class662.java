import jaggl.OpenGL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class662 extends class25 {

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "Lhj;")
    public static class569 field9052 = new class569();

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
    private int field9046;

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!rda", name = "G", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "I")
    private int field9053;

    @OriginalMember(owner = "client!rda", name = "M", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!rda", name = "R", descriptor = "I")
    private int field9058;

    @OriginalMember(owner = "client!rda", name = "S", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!rda", name = "T", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!rda", name = "U", descriptor = "I")
    private int field9061;

    @OriginalMember(owner = "client!rda", name = "W", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "Ltp;")
    private class533 field9050;

    @OriginalMember(owner = "client!rda", name = "N", descriptor = "Ltp;")
    private class533 field9055;

    @OriginalMember(owner = "client!rda", name = "D", descriptor = "Lrg;")
    private class643 field9045;

    @OriginalMember(owner = "client!rda", name = "X", descriptor = "Lrg;")
    private class643 field9064;

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "Ldw;")
    private class716 field9042;

    @OriginalMember(owner = "client!rda", name = "C", descriptor = "Ldw;")
    private class716 field9044;

    @OriginalMember(owner = "client!rda", name = "O", descriptor = "Ldw;")
    private class716 field9056;

    @OriginalMember(owner = "client!rda", name = "V", descriptor = "Ldw;")
    private class716 field9062;

    @OriginalMember(owner = "client!rda", name = "Q", descriptor = "[Ltp;")
    private class533[] field9057;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)V", line = 5)
    public final void method383(byte arg0, int arg1) {
        ++field9051;
        OpenGL.glUseProgramObjectARB(0L);
        super.field730.method190(-15039, 1);
        int var3 = -98 / ((arg0 - 44) / 38);
        super.field730.method256((byte) -86, (class36) null);
        super.field730.method190(-15039, 0);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ltp;Ltp;IB)V", line = 19)
    public final void method377(class533 arg0, class533 arg1, int arg2, byte arg3) {
        ++field9048;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field9057 != null) {
            super.field730.method264(-1, this.field9064);
            int var5 = class230.method1605(this.field9061, 4096);
            int var6 = class230.method1605(this.field9053, 4096);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field9064.method3655(this.field9057[var7], 0, 0);
                if (var7 == 0) {
                    super.field730.method256((byte) -115, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field9061, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field9061, (float) this.field9053);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9053);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field730.method256((byte) -82, this.field9057[var7 - 1]);
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
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field730.method255(-422613672, this.field9064);
            super.field730.method256((byte) -100, this.field9057[var7 + -1]);
            super.field730.method264(-1, this.field9045);
            this.field9045.method3649(0, (byte) 3);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field9044.field9752;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class165.field2596, 0.0F, 0.0F);
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
            super.field730.method256((byte) -90, arg1);
            super.field730.method264(-1, this.field9045);
            this.field9045.method3649(0, (byte) 3);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field9062.field9752;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class165.field2596, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field9061, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field9061, (float) this.field9053);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field9053);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field9045.method3649(1, (byte) 3);
        super.field730.method256((byte) -100, this.field9055);
        long var12 = this.field9042.field9752;
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
        this.field9045.method3649(0, (byte) 3);
        super.field730.method256((byte) -114, this.field9050);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        if (arg3 <= 98) {
            this.field9055 = null;
        }
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
        super.field730.method255(-422613672, this.field9045);
        long var14 = this.field9056.field9752;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class73.field1334, class85.field1536, 0.0F);
        super.field730.method190(-15039, 1);
        super.field730.method256((byte) -99, this.field9055);
        super.field730.method190(-15039, 0);
        super.field730.method256((byte) -82, arg1);
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)V", line = 177)
    public static void method3720(int arg0) {
        field9052 = null;
        if (arg0 != 2048) {
            method3720(52);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;", line = 188)
    public static final String method3721(boolean arg0, Throwable arg1) throws IOException {
        ++field9043;
        String var3;
        if (arg1 instanceof class274) {
            class274 var2 = (class274) arg1;
            var3 = var2.field3848 + " | ";
            arg1 = var2.field3849;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0) {
            method3720(-61);
        }
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(1 + var13.lastIndexOf(32));
            String var15 = var14.substring(1 + var14.lastIndexOf(9));
            String var16 = var3 + var15;
            if (~var10 != 0 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 - -5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IBI)V", line = 265)
    public final void method381(int arg0, byte arg1, int arg2) {
        this.field9053 = arg0;
        if (arg1 >= 7) {
            ++field9063;
            this.field9061 = arg2;
            int var4 = class230.method1605(this.field9061, 4096);
            int var5 = class230.method1605(this.field9053, 4096);
            if (~this.field9046 != ~var4 || this.field9058 != var5) {
                if (this.field9057 != null) {
                    for (int var6 = 0; ~this.field9057.length < ~var6; ++var6) {
                        this.field9057[var6].method451(-19948);
                    }
                    this.field9057 = null;
                }
                if (var4 <= 256 && ~var5 >= -257) {
                    this.field9064 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    label62: while (true) {
                        if (var7 <= 256 && ~var8 >= -257) {
                            if (this.field9064 == null) {
                                this.field9064 = new class643(super.field730);
                            }
                            int var10 = var4;
                            this.field9057 = new class533[var9];
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (~var10 >= -257 && ~var11 >= -257) {
                                    break label62;
                                }
                                this.field9057[var12++] = new class533(super.field730, 3553, 34842, var10, var11);
                                if (~var11 < -257) {
                                    var11 >>= 1;
                                }
                                if (~var10 < -257) {
                                    var10 >>= 1;
                                }
                            }
                        }
                        if (~var8 < -257) {
                            var8 >>= 1;
                        }
                        if (var7 > 256) {
                            var7 >>= 1;
                        }
                        ++var9;
                    }
                }
                this.field9046 = var4;
                this.field9058 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)V", line = 344)
    public final void method390(byte arg0) {
        this.field9042 = null;
        this.field9055 = null;
        this.field9064 = null;
        this.field9045 = null;
        this.field9062 = null;
        ++field9059;
        this.field9057 = null;
        this.field9044 = null;
        this.field9056 = null;
        if (arg0 > -123) {
            this.method383((byte) -56, -105);
        }
        this.field9050 = null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)Z", line = 364)
    public final boolean method378(boolean arg0) {
        if (!arg0) {
            this.method378(true);
        }
        ++field9049;
        return this.field9045 != null;
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)Z", line = 375)
    public final boolean method3722(byte arg0) {
        if (arg0 != 104) {
            return false;
        } else {
            ++field9060;
            return super.field730.field642 && super.field730.field605 && super.field730.field640;
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)I", line = 386)
    public final int method388(boolean arg0) {
        ++field9047;
        if (!arg0) {
            this.field9053 = -77;
        }
        return 1;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)Z", line = 399)
    public final boolean method385(int arg0) {
        if (arg0 < 84) {
            this.field9064 = null;
        }
        ++field9054;
        if (super.field730.field642 && super.field730.field605 && super.field730.field640) {
            this.field9045 = new class643(super.field730);
            this.field9055 = new class533(super.field730, 3553, 34842, 256, 256);
            this.field9055.method3067(false, false, 10243);
            this.field9050 = new class533(super.field730, 3553, 34842, 256, 256);
            this.field9050.method3067(false, false, 10243);
            super.field730.method264(-1, this.field9045);
            this.field9045.method3655(this.field9055, 0, 0);
            this.field9045.method3655(this.field9050, 0, 1);
            this.field9045.method3649(0, (byte) 3);
            if (!this.field9045.method3653(124)) {
                super.field730.method255(-422613672, this.field9045);
                return false;
            } else {
                super.field730.method255(-422613672, this.field9045);
                this.field9062 = class705.method3931(super.field730, -1, new class164[] { class594.method3381(35632, 80, super.field730, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field9044 = class705.method3931(super.field730, -1, new class164[] { class594.method3381(35632, -45, super.field730, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field9056 = class705.method3931(super.field730, -1, new class164[] { class594.method3381(35632, -108, super.field730, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
                this.field9042 = class705.method3931(super.field730, -1, new class164[] { class594.method3381(35632, -31, super.field730, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
                return this.field9044 != null && this.field9062 != null && this.field9056 != null && this.field9042 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lqo;)V", line = 446)
    public class662(class22 arg0) {
        super(arg0);
    }
}
