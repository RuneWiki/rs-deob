import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class353 extends class404 {

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field5166 = 2;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "[Lpfa;")
    public static class313[] field5180 = new class313[75];

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    private int field5168;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    private int field5174;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    private int field5175;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    private int field5185;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Ltca;")
    private class184 field5173;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "Ltca;")
    private class184 field5189;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Loca;")
    private class277 field5167;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Loca;")
    private class277 field5169;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Loca;")
    private class277 field5176;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Loca;")
    private class277 field5188;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Lmj;")
    private class682 field5178;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "Lmj;")
    private class682 field5182;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[I")
    public static int[] field5172;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "[Ltca;")
    private class184[] field5177;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLtca;ILtca;)V")
    public final void method2223(byte arg0, class184 arg1, int arg2, class184 arg3) {
        ++field5179;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5177 != null) {
            super.field5860.method1638((byte) -31, this.field5178);
            int var5 = class37.method261(this.field5185, false);
            int var6 = class37.method261(this.field5175, false);
            int var7 = 0;
            while (var5 > 256 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field5178.method3789(0, (byte) -93, this.field5177[var7]);
                if (~var7 == -1) {
                    super.field5860.method1653((byte) 81, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field5185, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field5185, (float) this.field5175);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5175);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field5860.method1653((byte) 104, this.field5177[var7 + -1]);
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
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field5860.method1621(this.field5178, false);
            super.field5860.method1653((byte) 108, this.field5177[var7 + -1]);
            super.field5860.method1638((byte) -98, this.field5182);
            this.field5182.method3795(123, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field5167.field4108;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class133.field1963, 0.0F, 0.0F);
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
            super.field5860.method1653((byte) 81, arg3);
            super.field5860.method1638((byte) -38, this.field5182);
            this.field5182.method3795(71, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field5188.field4108;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class133.field1963, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field5185, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field5185, (float) this.field5175);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field5175);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field5182.method3795(34, 1);
        super.field5860.method1653((byte) 84, this.field5189);
        long var12 = this.field5169.field4108;
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
        this.field5182.method3795(119, 0);
        super.field5860.method1653((byte) 94, this.field5173);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        if (arg0 >= 53) {
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
            super.field5860.method1621(this.field5182, false);
            long var14 = this.field5176.field4108;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class341.field4925, class442.field6222, 0.0F);
            super.field5860.method1637(33984, 1);
            super.field5860.method1653((byte) 99, this.field5189);
            super.field5860.method1637(33984, 0);
            super.field5860.method1653((byte) 93, arg3);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
    public final void method2224(int arg0, byte arg1) {
        ++field5187;
        OpenGL.glUseProgramObjectARB(0L);
        super.field5860.method1637(33984, 1);
        super.field5860.method1653((byte) 98, (class7) null);
        if (arg1 > -127) {
            this.method2230(-20);
        }
        super.field5860.method1637(33984, 0);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ldia;)V")
    public class353(class246 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
    public final boolean method2225(int arg0) {
        ++field5186;
        if (super.field5860.field3617 && super.field5860.field3635 && super.field5860.field3584) {
            this.field5182 = new class682(super.field5860);
            this.field5189 = new class184(super.field5860, 3553, 34842, 256, 256);
            this.field5189.method1274(false, false, 10242);
            this.field5173 = new class184(super.field5860, 3553, 34842, 256, 256);
            this.field5173.method1274(false, false, 10242);
            super.field5860.method1638((byte) -56, this.field5182);
            this.field5182.method3789(0, (byte) -93, this.field5189);
            this.field5182.method3789(1, (byte) -93, this.field5173);
            this.field5182.method3795(42, 0);
            if (!this.field5182.method3787((byte) 11)) {
                super.field5860.method1621(this.field5182, false);
                return false;
            } else {
                super.field5860.method1621(this.field5182, false);
                this.field5188 = class148.method1116(10782, new class298[] { class293.method1856(35632, super.field5860, arg0 ^ -9831, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field5860);
                this.field5167 = class148.method1116(arg0 + 1030, new class298[] { class293.method1856(35632, super.field5860, arg0 + -9878, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field5860);
                this.field5176 = class148.method1116(10782, new class298[] { class293.method1856(35632, super.field5860, -117, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.field5860);
                this.field5169 = class148.method1116(10782, new class298[] { class293.method1856(35632, super.field5860, arg0 ^ -9826, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.field5860);
                return this.field5167 != null && this.field5188 != null && this.field5176 != null && this.field5169 != null;
            }
        } else {
            if (arg0 != 9752) {
                this.method2230(45);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)I")
    public final int method2226(int arg0) {
        if (arg0 != 1) {
            method2229(false);
        }
        ++field5171;
        return 1;
    }

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "(I)Z")
    public final boolean method2227(int arg0) {
        if (arg0 != 256) {
            return true;
        } else {
            ++field5181;
            return super.field5860.field3617 && super.field5860.field3635 && super.field5860.field3584;
        }
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
    public final void method2228(int arg0) {
        this.field5169 = null;
        this.field5176 = null;
        this.field5189 = null;
        this.field5182 = null;
        this.field5178 = null;
        this.field5167 = null;
        ++field5183;
        this.field5177 = null;
        this.field5188 = null;
        this.field5173 = null;
        int var2 = -96 % ((44 - arg0) / 44);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static void method2229(boolean arg0) {
        if (arg0) {
            method2229(false);
        }
        field5180 = null;
        field5172 = null;
    }

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)Z")
    public final boolean method2230(int arg0) {
        if (arg0 != 256) {
            this.method2228(-85);
        }
        ++field5170;
        return this.field5182 != null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)V")
    public final void method2231(int arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            this.field5175 = arg1;
            ++field5184;
            this.field5185 = arg2;
            int var4 = class37.method261(this.field5185, false);
            int var5 = class37.method261(this.field5175, false);
            if (this.field5168 != var4 || ~this.field5174 != ~var5) {
                if (this.field5177 != null) {
                    for (int var6 = 0; var6 < this.field5177.length; ++var6) {
                        this.field5177[var6].method47(118);
                    }
                    this.field5177 = null;
                }
                if (var4 <= 256 && var5 <= 256) {
                    this.field5178 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field5178 == null) {
                        this.field5178 = new class682(super.field5860);
                    }
                    label59: while (true) {
                        if (~var7 >= -257 && ~var8 >= -257) {
                            int var10 = var4;
                            int var11 = var5;
                            this.field5177 = new class184[var9];
                            int var12 = 0;
                            while (true) {
                                if (~var10 >= -257 && ~var11 >= -257) {
                                    break label59;
                                }
                                this.field5177[var12++] = new class184(super.field5860, 3553, 34842, var10, var11);
                                if (~var10 < -257) {
                                    var10 >>= 1;
                                }
                                if (var11 > 256) {
                                    var11 >>= 1;
                                }
                            }
                        }
                        if (var8 > 256) {
                            var8 >>= 1;
                        }
                        if (var7 > 256) {
                            var7 >>= 1;
                        }
                        ++var9;
                    }
                }
                this.field5174 = var5;
                this.field5168 = var4;
            }
        }
    }
}
