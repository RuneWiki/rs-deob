import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class97 extends class326 {

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "Lvh;")
    public static class125 field1449 = new class125(39, 2);

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "Lqaa;")
    public static class309 field1450;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "Lvo;")
    public static class345 field1451;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "Lqn;")
    private class476 field1429;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "Lqn;")
    private class476 field1431;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "Lqn;")
    private class476 field1440;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "Lqn;")
    private class476 field1444;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "Lil;")
    private class586 field1435;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "Lil;")
    private class586 field1442;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "Lec;")
    private class92 field1428;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Lec;")
    private class92 field1430;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "[Lil;")
    private class586[] field1443;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 4)
    public final void method727(int arg0, int arg1, int arg2) {
        this.field1434 = arg1;
        ++field1439;
        this.field1448 = arg0;
        if (arg2 == 5798) {
            int var4 = class270.method1702(this.field1434, (byte) -100);
            int var5 = class270.method1702(this.field1448, (byte) 114);
            if (~this.field1438 != ~var4 || this.field1437 != var5) {
                if (this.field1443 != null) {
                    for (int var6 = 0; ~this.field1443.length < ~var6; ++var6) {
                        this.field1443[var6].method2008(-7656);
                    }
                    this.field1443 = null;
                }
                if (var4 <= 256 && var5 <= 256) {
                    this.field1430 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field1430 == null) {
                        this.field1430 = new class92(super.field4544);
                    }
                    label57: while (true) {
                        if (var7 <= 256 && var8 <= 256) {
                            this.field1443 = new class586[var9];
                            int var10 = var4;
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (~var10 >= -257 && var11 <= 256) {
                                    break label57;
                                }
                                this.field1443[var12++] = new class586(super.field4544, 3553, 34842, var10, var11);
                                if (var11 > 256) {
                                    var11 >>= 1;
                                }
                                if (~var10 < -257) {
                                    var10 >>= 1;
                                }
                            }
                        }
                        ++var9;
                        if (~var8 < -257) {
                            var8 >>= 1;
                        }
                        if (~var7 < -257) {
                            var7 >>= 1;
                        }
                    }
                }
                this.field1438 = var4;
                this.field1437 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lkfa;)V", line = 88)
    public class97(class382 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 93)
    public static void method728(int arg0) {
        field1449 = null;
        field1450 = null;
        field1451 = null;
        if (arg0 != 0) {
            field1449 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)Z", line = 110)
    public final boolean method729(boolean arg0) {
        if (!arg0) {
            this.method733(60);
        }
        ++field1436;
        if (super.field4544.field5571 && super.field4544.field5599 && super.field4544.field5527) {
            this.field1428 = new class92(super.field4544);
            this.field1435 = new class586(super.field4544, 3553, 34842, 256, 256);
            this.field1435.method3379((byte) 102, false, false);
            this.field1442 = new class586(super.field4544, 3553, 34842, 256, 256);
            this.field1442.method3379((byte) 102, false, false);
            super.field4544.method2263(true, this.field1428);
            this.field1428.method692((byte) -127, this.field1435, 0);
            this.field1428.method692((byte) -126, this.field1442, 1);
            this.field1428.method690(21589, 0);
            if (!this.field1428.method691(-108)) {
                super.field4544.method2340((byte) 64, this.field1428);
                return false;
            } else {
                super.field4544.method2340((byte) 64, this.field1428);
                this.field1444 = class358.method2161(0, new class189[] { class697.method3921(super.field4544, 35632, 8, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field4544);
                this.field1429 = class358.method2161(0, new class189[] { class697.method3921(super.field4544, 35632, 8, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field4544);
                this.field1431 = class358.method2161(0, new class189[] { class697.method3921(super.field4544, 35632, 8, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.field4544);
                this.field1440 = class358.method2161(0, new class189[] { class697.method3921(super.field4544, 35632, 8, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.field4544);
                return this.field1429 != null && this.field1444 != null && this.field1431 != null && this.field1440 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lil;Lil;II)V", line = 147)
    public final void method730(class586 arg0, class586 arg1, int arg2, int arg3) {
        ++field1432;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1443 != null) {
            super.field4544.method2263(true, this.field1430);
            int var5 = class270.method1702(this.field1434, (byte) 108);
            int var6 = class270.method1702(this.field1448, (byte) -86);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field1430.method692((byte) -123, this.field1443[var7], 0);
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (var7 == 0) {
                    super.field4544.method2295((byte) -94, arg0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1434, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1434, (float) this.field1448);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1448);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field4544.method2295((byte) 25, this.field1443[var7 + -1]);
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
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field4544.method2340((byte) 64, this.field1430);
            super.field4544.method2295((byte) -107, this.field1443[var7 + -1]);
            super.field4544.method2263(true, this.field1428);
            this.field1428.method690(21589, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field1429.field6820;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class507.field7530, 0.0F, 0.0F);
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
            super.field4544.method2295((byte) 78, arg0);
            super.field4544.method2263(true, this.field1428);
            this.field1428.method690(arg3 ^ -10972, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1444.field6820;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class507.field7530, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1434, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1434, (float) this.field1448);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1448);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1428.method690(21589, 1);
        super.field4544.method2295((byte) -112, this.field1435);
        long var12 = this.field1440.field6820;
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
        this.field1428.method690(21589, 0);
        super.field4544.method2295((byte) -114, this.field1442);
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
        super.field4544.method2340((byte) 64, this.field1428);
        long var14 = this.field1431.field6820;
        if (arg3 != -32399) {
            this.method735((byte) -3);
        }
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class289.field4059, class577.field8451, 0.0F);
        super.field4544.method2308(1, -15115);
        super.field4544.method2295((byte) -104, this.field1435);
        super.field4544.method2308(0, -15115);
        super.field4544.method2295((byte) 84, arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V", line = 303)
    public final void method731(byte arg0, int arg1) {
        if (arg0 <= -1) {
            OpenGL.glUseProgramObjectARB(0L);
            ++field1433;
            super.field4544.method2308(1, -15115);
            super.field4544.method2295((byte) 102, (class337) null);
            super.field4544.method2308(0, -15115);
        }
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(B)Z", line = 320)
    public final boolean method732(byte arg0) {
        ++field1427;
        if (arg0 <= 26) {
            this.method735((byte) 96);
        }
        return this.field1428 != null;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Z", line = 334)
    public final boolean method733(int arg0) {
        if (arg0 != -15884) {
            this.method732((byte) 49);
        }
        ++field1447;
        return super.field4544.field5571 && super.field4544.field5599 && super.field4544.field5527;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)I", line = 346)
    public static final int method734(int arg0, String arg1) {
        if (arg0 != -20508) {
            return 40;
        } else {
            ++field1446;
            return 2 + arg1.length();
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)V", line = 359)
    public final void method735(byte arg0) {
        this.field1440 = null;
        this.field1431 = null;
        this.field1429 = null;
        if (arg0 > 65) {
            ++field1441;
            this.field1430 = null;
            this.field1444 = null;
            this.field1435 = null;
            this.field1428 = null;
            this.field1443 = null;
            this.field1442 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I", line = 378)
    public final int method736(int arg0) {
        ++field1445;
        return arg0 != -26877 ? 22 : 1;
    }
}
