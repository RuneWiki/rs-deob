import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class487 extends class126 {

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    private int field7069;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    private int field7076;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    private int field7088;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    private int field7090;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "Lgg;")
    public static class213 field7072;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Lss;")
    private class322 field7075;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lss;")
    private class322 field7077;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "Lss;")
    private class322 field7079;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Lss;")
    private class322 field7080;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "Lsr;")
    private class346 field7073;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "Lsr;")
    private class346 field7074;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "Ljh;")
    private class453 field7078;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "Ljh;")
    private class453 field7089;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "[Lsr;")
    private class346[] field7067;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZBII)V", line = 3)
    public static final void method2907(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        if (~class520.field7690 == -1) {
            class398.method2369(30935, false);
        } else {
            class318.field4099 = class520.field7690;
            class10.method69(0, 5537);
        }
        if (arg2 >= -14) {
            method2910((class201) null, 85, false);
        }
        ++field7063;
        class497.field7327 = arg3;
        class411.field5490 = arg4;
        class96.field1337 = arg1;
        class230.method1464(arg0);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V", line = 27)
    public final void method796(int arg0) {
        this.field7074 = null;
        ++field7083;
        this.field7079 = null;
        this.field7077 = null;
        int var2 = -50 % ((14 - arg0) / 36);
        this.field7089 = null;
        this.field7073 = null;
        this.field7080 = null;
        this.field7075 = null;
        this.field7078 = null;
        this.field7067 = null;
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)V", line = 45)
    public static void method2908(byte arg0) {
        field7072 = null;
        if (arg0 >= -66) {
            field7072 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)I", line = 62)
    public static final int method2909(byte arg0, int arg1) {
        ++field7065;
        int var2 = 0;
        if (~arg1 > -1 || ~arg1 <= -65537) {
            arg1 >>>= 16;
            var2 += 16;
        }
        if (~arg1 <= -257) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 4;
        }
        if (arg0 != -91) {
            method2910((class201) null, 46, true);
        }
        if (~arg1 <= -5) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (arg1 >= 1) {
            ++var2;
            arg1 >>>= 1;
        }
        return var2 - -arg1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lsr;Lsr;II)V", line = 109)
    public final void method792(class346 arg0, class346 arg1, int arg2, int arg3) {
        ++field7081;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field7067 != null) {
            super.field1725.method2747(this.field7089, 3);
            int var5 = class342.method2014((byte) -29, this.field7088);
            int var6 = class342.method2014((byte) -29, this.field7090);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field7089.method2687((byte) -97, this.field7067[var7], 0);
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (var7 == 0) {
                    super.field1725.method2771(arg1, -16785);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field7088, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field7088, (float) this.field7090);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7090);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field1725.method2771(this.field7067[var7 + -1], -16785);
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
            super.field1725.method2770(this.field7089, false);
            super.field1725.method2771(this.field7067[var7 + -1], -16785);
            super.field1725.method2747(this.field7078, 3);
            this.field7078.method2683(-95, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field7075.field4140;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class359.field4647, 0.0F, 0.0F);
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
            super.field1725.method2771(arg1, -16785);
            super.field1725.method2747(this.field7078, 3);
            this.field7078.method2683(95, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field7080.field4140;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class359.field4647, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field7088, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field7088, (float) this.field7090);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field7090);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field7078.method2683(-103, 1);
        super.field1725.method2771(this.field7074, -16785);
        long var12 = this.field7077.field4140;
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
        this.field7078.method2683(65, 0);
        super.field1725.method2771(this.field7073, -16785);
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
        super.field1725.method2770(this.field7078, false);
        if (arg2 > 92) {
            long var14 = this.field7079.field4140;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class163.field2113, class263.field3331, 0.0F);
            super.field1725.method2741((byte) -38, 1);
            super.field1725.method2771(this.field7074, -16785);
            super.field1725.method2741((byte) -38, 0);
            super.field1725.method2771(arg1, -16785);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIB)V", line = 264)
    public final void method794(int arg0, int arg1, byte arg2) {
        if (arg2 == -26) {
            this.field7090 = arg0;
            this.field7088 = arg1;
            ++field7064;
            int var4 = class342.method2014((byte) -29, this.field7088);
            int var5 = class342.method2014((byte) -29, this.field7090);
            if (~this.field7076 != ~var4 || ~this.field7069 != ~var5) {
                if (this.field7067 != null) {
                    for (int var6 = 0; ~this.field7067.length < ~var6; ++var6) {
                        this.field7067[var6].method219(-23222);
                    }
                    this.field7067 = null;
                }
                if (var4 <= 256 && ~var5 >= -257) {
                    this.field7089 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    label59: while (true) {
                        if (var7 <= 256 && var8 <= 256) {
                            if (this.field7089 == null) {
                                this.field7089 = new class453(super.field1725);
                            }
                            this.field7067 = new class346[var9];
                            int var10 = var4;
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (var10 <= 256 && var11 <= 256) {
                                    break label59;
                                }
                                this.field7067[var12++] = new class346(super.field1725, 3553, 34842, var10, var11);
                                if (var10 > 256) {
                                    var10 >>= 1;
                                }
                                if (var11 > 256) {
                                    var11 >>= 1;
                                }
                            }
                        }
                        ++var9;
                        if (var8 > 256) {
                            var8 >>= 1;
                        }
                        if (~var7 < -257) {
                            var7 >>= 1;
                        }
                    }
                }
                this.field7076 = var4;
                this.field7069 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ldn;IZ)Lfk;", line = 349)
    public static final class91 method2910(class201 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2911((byte) 23, (class129) null);
        }
        ++field7085;
        byte[] var3 = arg0.method1320(arg1, 1);
        return var3 == null ? null : new class91(var3);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLqa;)V", line = 365)
    public static final void method2911(byte arg0, class129 arg1) {
        ++field7070;
        if (~class293.field3802.method45(arg0 + -16040) != -1) {
            if (arg0 == 62) {
                if (class520.field7690 != 0) {
                    if (class319.field4105 == null) {
                        Canvas var2 = new Canvas();
                        var2.setSize(36, 32);
                        class319.field4105 = class129.method839(class172.field2221, var2, class202.field2653, 0, 0, (byte) -76);
                        class67.field834 = class319.field4105.method867(class293.method1763(32516, class256.field3245, 0, class356.field4575), class136.method954(class391.field5121, class356.field4575, 0), true);
                    }
                    for (class474 var3 = (class474) class293.field3802.method49(57); var3 != null; var3 = (class474) class293.field3802.method46((byte) 6)) {
                        class89.field1238.method118(var3.field6931, var3.field6927 ? class37.field573.field7655 : null, var3.field6932, var3.field6925, var3.field6933, false, class319.field4105, arg1, class67.field834, var3.field6926, false, (byte) -97);
                        var3.method3021(-108);
                    }
                } else {
                    for (class474 var4 = (class474) class293.field3802.method49(-104); var4 != null; var4 = (class474) class293.field3802.method46((byte) 100)) {
                        class89.field1238.method118(var4.field6931, var4.field6927 ? class37.field573.field7655 : null, var4.field6932, var4.field6925, var4.field6933, false, arg1, arg1, class254.field3211, var4.field6926, false, (byte) -97);
                        var4.method3021(arg0 + -158);
                    }
                    class218.method1396((byte) 110);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(ZI)I", line = 415)
    public static final int method2912(boolean arg0, int arg1) {
        if (!arg0) {
            return 57;
        } else {
            ++field7071;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V", line = 428)
    public final void method798(int arg0, int arg1) {
        ++field7086;
        OpenGL.glUseProgramObjectARB(0L);
        super.field1725.method2741((byte) -38, 1);
        super.field1725.method2771((class31) null, -16785);
        super.field1725.method2741((byte) -38, arg1);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z", line = 446)
    public final boolean method795(int arg0) {
        ++field7066;
        if (arg0 != 0) {
            return true;
        } else if (super.field1725.field6719 && super.field1725.field6718 && super.field1725.field6805) {
            this.field7078 = new class453(super.field1725);
            this.field7074 = new class346(super.field1725, 3553, 34842, 256, 256);
            this.field7074.method2040(false, (byte) 89, false);
            this.field7073 = new class346(super.field1725, 3553, 34842, 256, 256);
            this.field7073.method2040(false, (byte) 89, false);
            super.field1725.method2747(this.field7078, 3);
            this.field7078.method2687((byte) -86, this.field7074, 0);
            this.field7078.method2687((byte) 118, this.field7073, 1);
            this.field7078.method2683(123, 0);
            if (!this.field7078.method2693((byte) -114)) {
                super.field1725.method2770(this.field7078, false);
                return false;
            } else {
                super.field1725.method2770(this.field7078, false);
                this.field7080 = class310.method1853(89, super.field1725, new class307[] { class206.method1346(super.field1725, 35632, -10993, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field7075 = class310.method1853(71, super.field1725, new class307[] { class206.method1346(super.field1725, 35632, -10993, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field7079 = class310.method1853(120, super.field1725, new class307[] { class206.method1346(super.field1725, 35632, arg0 + -10993, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
                this.field7077 = class310.method1853(119, super.field1725, new class307[] { class206.method1346(super.field1725, 35632, -10993, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
                return this.field7075 != null && this.field7080 != null && this.field7079 != null && this.field7077 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)Z", line = 482)
    public final boolean method802(int arg0) {
        if (arg0 != -13495) {
            this.method802(-53);
        }
        ++field7062;
        return this.field7078 != null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILgf;)V", line = 495)
    public static final void method2913(int arg0, int arg1, class395 arg2) {
        ++field7084;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field5228 <= class264.field3353) {
            if (arg2.field5208 >= class264.field3353) {
                class269.method1659(3, arg2);
            } else {
                class71.method401(6, false, arg2);
                var4 = class345.field4396;
                var3 = class289.field3698;
            }
        } else {
            class466.method2814(false, arg2);
        }
        if (~arg2.field6239 > -129 || arg2.field6241 < 128 || class200.field2594 * 128 + -128 <= arg2.field6239 || ~(class118.field1647 * 128 + -128) >= ~arg2.field6241) {
            arg2.field5172 = -1;
            arg2.field5204 = -1;
            var3 = -1;
            var4 = 0;
            arg2.field5191 = -1;
            arg2.field5208 = 0;
            arg2.field5228 = 0;
            arg2.field6239 = arg2.field5246[0] * 128 + arg2.method2342(10804) * 64;
            arg2.field6241 = arg2.field5251[0] * 128 + arg2.method2342(10804) * 64;
            arg2.method2354(0);
        }
        int var5 = 109 / ((arg0 - 54) / 46);
        if (class37.field573 == arg2 && (arg2.field6239 < 1536 || ~arg2.field6241 > -1537 || arg2.field6239 >= class200.field2594 * 128 + -1536 || ~(class118.field1647 * 128 + -1536) >= ~arg2.field6241)) {
            arg2.field5172 = -1;
            arg2.field5228 = 0;
            arg2.field5208 = 0;
            arg2.field5191 = -1;
            var3 = -1;
            var4 = 0;
            arg2.field5204 = -1;
            arg2.field6239 = arg2.field5246[0] * 128 + arg2.method2342(10804) * 64;
            arg2.field6241 = arg2.field5251[0] * 128 + arg2.method2342(10804) * 64;
            arg2.method2354(0);
        }
        int var6 = class75.method429(arg2, (byte) 8);
        class333.method1980(arg2, var6, var3, 103, var4);
        class319.method1899(-1, arg2);
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)Z", line = 560)
    public final boolean method2914(byte arg0) {
        if (arg0 < 122) {
            this.field7074 = null;
        }
        ++field7082;
        return super.field1725.field6719 && super.field1725.field6718 && super.field1725.field6805;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)I", line = 571)
    public final int method799(byte arg0) {
        if (arg0 < 121) {
            this.method796(-9);
        }
        ++field7087;
        return 1;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lgk;)V", line = 584)
    public class487(class463 arg0) {
        super(arg0);
    }
}
