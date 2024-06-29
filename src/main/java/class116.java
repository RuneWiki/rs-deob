import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class116 extends class604 {

    @OriginalMember(owner = "client!oda", name = "B", descriptor = "Lsi;")
    public static class559 field1400 = new class559();

    @OriginalMember(owner = "client!oda", name = "t", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client!oda", name = "v", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!oda", name = "w", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!oda", name = "A", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!oda", name = "C", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!oda", name = "D", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!oda", name = "N", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!oda", name = "P", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!oda", name = "Q", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!oda", name = "S", descriptor = "Lqb;")
    public static class222 field1417;

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "Lgia;")
    private class269 field1408;

    @OriginalMember(owner = "client!oda", name = "L", descriptor = "Lgia;")
    private class269 field1410;

    @OriginalMember(owner = "client!oda", name = "R", descriptor = "Lgga;")
    public static class291 field1416;

    @OriginalMember(owner = "client!oda", name = "u", descriptor = "Laea;")
    private class49 field1393;

    @OriginalMember(owner = "client!oda", name = "y", descriptor = "Laea;")
    private class49 field1397;

    @OriginalMember(owner = "client!oda", name = "M", descriptor = "Laea;")
    private class49 field1411;

    @OriginalMember(owner = "client!oda", name = "O", descriptor = "Laea;")
    private class49 field1413;

    @OriginalMember(owner = "client!oda", name = "s", descriptor = "Lmfa;")
    private class615 field1391;

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "Lmfa;")
    private class615 field1404;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "[Lmfa;")
    private class615[] field1407;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lmfa;Lmfa;IB)V", line = 8)
    public final void method807(class615 arg0, class615 arg1, int arg2, byte arg3) {
        OpenGL.glPushAttrib(2048);
        ++field1394;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1407 == null) {
            super.field8483.method926(arg0, 75);
            super.field8483.method877((byte) -27, this.field1410);
            this.field1410.method1759(0, -64);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field1393.field575;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class590.field8323, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1403, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1403, (float) this.field1412);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1412);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field8483.method877((byte) -64, this.field1408);
            int var7 = class42.method282(-1350259935, this.field1403);
            int var8 = class42.method282(-1350259935, this.field1412);
            int var9 = 0;
            while (~var7 < -257 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field1408.method1765(0, 0, this.field1407[var9]);
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (var9 == 0) {
                    super.field8483.method926(arg0, 45);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1403, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1403, (float) this.field1412);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1412);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field8483.method926(this.field1407[var9 - 1], 99);
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
                ++var9;
            }
            super.field8483.method913(this.field1408, (byte) -127);
            super.field8483.method926(this.field1407[var9 + -1], 100);
            super.field8483.method877((byte) -83, this.field1410);
            this.field1410.method1759(0, 81);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1413.field575;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class590.field8323, 0.0F, 0.0F);
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
        this.field1410.method1759(1, -73);
        super.field8483.method926(this.field1391, 55);
        if (arg3 >= 108) {
            long var12 = this.field1411.field575;
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
            this.field1410.method1759(0, -79);
            super.field8483.method926(this.field1404, 60);
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
            super.field8483.method913(this.field1410, (byte) -128);
            long var14 = this.field1397.field575;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class406.field5756, class322.field4455, 0.0F);
            super.field8483.method884(1, true);
            super.field8483.method926(this.field1391, 53);
            super.field8483.method884(0, true);
            super.field8483.method926(arg0, 94);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/io/File;I)[B", line = 163)
    public static final byte[] method808(File arg0, int arg1) {
        ++field1399;
        if (arg1 != 26308) {
            field1400 = null;
        }
        return class452.method2698((int) arg0.length(), (byte) -124, arg0);
    }

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "(B)Z", line = 175)
    public final boolean method809(byte arg0) {
        int var2 = -122 % ((arg0 - 40) / 56);
        ++field1401;
        return super.field8483.field1858 && super.field8483.field1914 && super.field8483.field1917;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(II)I", line = 188)
    public static final int method810(int arg0, int arg1) {
        ++field1405;
        int var2 = 122 / ((-47 - arg0) / 46);
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)Z", line = 201)
    public final boolean method811(int arg0) {
        if (arg0 != 67) {
            return false;
        } else {
            ++field1415;
            return this.field1410 != null;
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Leea;)V", line = 216)
    public class116(class131 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIC)C", line = 219)
    public static final char method812(int arg0, int arg1, char arg2) {
        ++field1406;
        if (arg1 > -8) {
            method814(-2);
        }
        if (~arg2 <= -193 && ~arg2 >= -256) {
            if (~arg2 <= -193 && arg2 <= 198) {
                return 'A';
            }
            if (arg2 == 199) {
                return 'C';
            }
            if (arg2 >= 200 && ~arg2 >= -204) {
                return 'E';
            }
            if (~arg2 <= -205 && ~arg2 >= -208) {
                return 'I';
            }
            if (arg2 >= 210 && arg2 <= 214) {
                return 'O';
            }
            if (~arg2 <= -218 && ~arg2 >= -221) {
                return 'U';
            }
            if (~arg2 == -222) {
                return 'Y';
            }
            if (~arg2 == -224) {
                return 's';
            }
            if (arg2 >= 224 && ~arg2 >= -231) {
                return 'a';
            }
            if (arg2 == 231) {
                return 'c';
            }
            if (arg2 >= 232 && arg2 <= 235) {
                return 'e';
            }
            if (arg2 >= 236 && arg2 <= 239) {
                return 'i';
            }
            if (arg2 >= 242 && ~arg2 >= -247) {
                return 'o';
            }
            if (arg2 >= 249 && arg2 <= 252) {
                return 'u';
            }
            if (arg2 == 253 || ~arg2 == -256) {
                return 'y';
            }
        }
        if (~arg2 == -339) {
            return 'O';
        } else if (arg2 == 339) {
            return 'o';
        } else if (arg2 == 376) {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(B)I", line = 304)
    public final int method813(byte arg0) {
        if (arg0 != 48) {
            this.method816(84, -24);
        }
        ++field1395;
        return 1;
    }

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "(I)V", line = 315)
    public static void method814(int arg0) {
        if (arg0 != 1) {
            method810(-114, 75);
        }
        field1417 = null;
        field1400 = null;
        field1416 = null;
    }

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "(I)V", line = 328)
    public final void method815(int arg0) {
        this.field1413 = null;
        this.field1393 = null;
        ++field1414;
        this.field1407 = null;
        this.field1404 = null;
        this.field1397 = null;
        if (arg0 == -16008) {
            this.field1410 = null;
            this.field1411 = null;
            this.field1408 = null;
            this.field1391 = null;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)V", line = 347)
    public final void method816(int arg0, int arg1) {
        ++field1398;
        OpenGL.glUseProgramObjectARB((long) arg0);
        super.field8483.method884(1, true);
        super.field8483.method926((class210) null, 43);
        super.field8483.method884(0, true);
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(III)V", line = 360)
    public final void method817(int arg0, int arg1, int arg2) {
        this.field1403 = arg0;
        this.field1412 = arg1;
        if (arg2 != 11441) {
            field1400 = null;
        }
        ++field1409;
        int var4 = class42.method282(arg2 + -1350271376, this.field1403);
        int var5 = class42.method282(-1350259935, this.field1412);
        if (this.field1402 != var4 || ~this.field1392 != ~var5) {
            if (this.field1407 != null) {
                for (int var6 = 0; ~this.field1407.length < ~var6; ++var6) {
                    this.field1407[var6].method1286(true);
                }
                this.field1407 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field1408 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field1408 == null) {
                    this.field1408 = new class269(super.field8483);
                }
                label57: while (true) {
                    if (var7 <= 256 && ~var8 >= -257) {
                        int var10 = var4;
                        int var11 = var5;
                        this.field1407 = new class615[var9];
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && ~var11 >= -257) {
                                break label57;
                            }
                            this.field1407[var12++] = new class615(super.field8483, 3553, 34842, var10, var11);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    ++var9;
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                }
            }
            this.field1392 = var5;
            this.field1402 = var4;
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)Z", line = 438)
    public final boolean method818(byte arg0) {
        ++field1396;
        if (arg0 >= -7) {
            this.field1410 = null;
        }
        if (super.field8483.field1858 && super.field8483.field1914 && super.field8483.field1917) {
            this.field1410 = new class269(super.field8483);
            this.field1391 = new class615(super.field8483, 3553, 34842, 256, 256);
            this.field1391.method3445(false, false, 119);
            this.field1404 = new class615(super.field8483, 3553, 34842, 256, 256);
            this.field1404.method3445(false, false, 115);
            super.field8483.method877((byte) -54, this.field1410);
            this.field1410.method1765(0, 0, this.field1391);
            this.field1410.method1765(1, 0, this.field1404);
            this.field1410.method1759(0, 94);
            if (!this.field1410.method1749((byte) -116)) {
                super.field8483.method913(this.field1410, (byte) -128);
                return false;
            } else {
                super.field8483.method913(this.field1410, (byte) -127);
                this.field1393 = class579.method3300(new class19[] { class619.method3482((byte) 120, super.field8483, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) }, -1, super.field8483);
                this.field1413 = class579.method3300(new class19[] { class619.method3482((byte) 120, super.field8483, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) }, -1, super.field8483);
                this.field1397 = class579.method3300(new class19[] { class619.method3482((byte) 120, super.field8483, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632) }, -1, super.field8483);
                this.field1411 = class579.method3300(new class19[] { class619.method3482((byte) 120, super.field8483, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632) }, -1, super.field8483);
                return this.field1413 != null && this.field1393 != null && this.field1397 != null && this.field1411 != null;
            }
        } else {
            return false;
        }
    }
}
