import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class134 extends class353 {

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field1751 = 1407;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    private int field1746;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    private int field1757;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    private int field1762;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    private int field1766;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "Lvga;")
    private class239 field1749;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "Lvga;")
    private class239 field1770;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Lhq;")
    private class47 field1754;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "Lhq;")
    private class47 field1756;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "Lhq;")
    private class47 field1761;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "Lhq;")
    private class47 field1768;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "Lqf;")
    private class701 field1758;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "Lqf;")
    private class701 field1760;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "[Lvga;")
    private class239[] field1759;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "[Lxa;")
    public static class511[] field1745;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)Z", line = 6)
    public final boolean method971(int arg0) {
        ++field1750;
        if (arg0 <= 8) {
            this.field1759 = null;
        }
        return this.field1760 != null;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 18)
    public final void method972(int arg0) {
        ++field1755;
        this.field1768 = null;
        this.field1759 = null;
        this.field1749 = null;
        this.field1756 = null;
        this.field1760 = null;
        this.field1761 = null;
        this.field1754 = null;
        this.field1758 = null;
        if (arg0 == -1) {
            this.field1770 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "(I)V", line = 42)
    public static void method973(int arg0) {
        if (arg0 != 0) {
            method977(-105, 84, -109, -90, 79, -53, 112);
        }
        field1745 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lji;)V", line = 55)
    public class134(class622 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "(I)Z", line = 58)
    public final boolean method974(int arg0) {
        if (arg0 != 35632) {
            this.method981(60);
        }
        ++field1769;
        if (super.field4538.field8640 && super.field4538.field8614 && super.field4538.field8698) {
            this.field1760 = new class701(super.field4538);
            this.field1749 = new class239(super.field4538, 3553, 34842, 256, 256);
            this.field1749.method1504(false, (byte) 85, false);
            this.field1770 = new class239(super.field4538, 3553, 34842, 256, 256);
            this.field1770.method1504(false, (byte) 26, false);
            super.field4538.method3395(18469, this.field1760);
            this.field1760.method3841(this.field1749, 0, (byte) 75);
            this.field1760.method3841(this.field1770, 1, (byte) -68);
            this.field1760.method3840((byte) 98, 0);
            if (!this.field1760.method3833(22734)) {
                super.field4538.method3390(-22078, this.field1760);
                return false;
            } else {
                super.field4538.method3390(-22078, this.field1760);
                this.field1754 = class149.method1098(new class238[] { class648.method3566(35632, -124, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field4538) }, super.field4538, (byte) 91);
                this.field1761 = class149.method1098(new class238[] { class648.method3566(35632, -124, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field4538) }, super.field4538, (byte) 117);
                this.field1756 = class149.method1098(new class238[] { class648.method3566(35632, arg0 + -35752, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field4538) }, super.field4538, (byte) 21);
                this.field1768 = class149.method1098(new class238[] { class648.method3566(35632, arg0 + -35752, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field4538) }, super.field4538, (byte) 70);
                return this.field1761 != null && this.field1754 != null && this.field1756 != null && this.field1768 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(Z)Z", line = 94)
    public final boolean method975(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field1752;
            return super.field4538.field8640 && super.field4538.field8614 && super.field4538.field8698;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(CILjava/lang/String;)I", line = 109)
    public static final int method976(char arg0, int arg1, String arg2) {
        ++field1747;
        int var3 = 0;
        int var4 = arg2.length();
        int var5 = 0;
        if (arg1 != 1) {
            field1751 = -93;
        }
        while (var5 < var4) {
            if (arg0 == arg2.charAt(var5)) {
                ++var3;
            }
            ++var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V", line = 136)
    public static final void method977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1767;
        if (arg2 >= 95) {
            class514[] var7 = class434.field5591;
            for (int var8 = 0; ~var7.length < ~var8; ++var8) {
                class514 var9 = var7[var8];
                if (var9 != null && ~var9.field6726 == -3) {
                    class259.method1618(arg3 >> 1, arg1, arg5 >> 1, var9.field6731, -110, var9.field6725, arg6, var9.field6729 * 2, var9.field6727);
                    if (class483.field6441[0] > -1 && class424.field5503 % 20 < 10) {
                        class126.field1635[var9.field6732].method2751(class483.field6441[0] + arg0 - 12, class483.field6441[1] - 28 + arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V", line = 167)
    public final void method978(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field1770 = null;
        }
        this.field1762 = arg0;
        this.field1746 = arg1;
        ++field1753;
        int var4 = class71.method571(this.field1746, (byte) 95);
        int var5 = class71.method571(this.field1762, (byte) 120);
        if (this.field1766 != var4 || this.field1757 != var5) {
            if (this.field1759 != null) {
                for (int var6 = 0; ~var6 > ~this.field1759.length; ++var6) {
                    this.field1759[var6].method3904((byte) -106);
                }
                this.field1759 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field1758 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label59: while (true) {
                    if (var7 <= 256 && var8 <= 256) {
                        if (this.field1758 == null) {
                            this.field1758 = new class701(super.field4538);
                        }
                        int var10 = var5;
                        this.field1759 = new class239[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && var10 <= 256) {
                                break label59;
                            }
                            this.field1759[var12++] = new class239(super.field4538, 3553, 34842, var11, var10);
                            if (~var10 < -257) {
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
            this.field1757 = var5;
            this.field1766 = var4;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 245)
    public final void method979(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB((long) arg0);
        ++field1763;
        super.field4538.method3469(1, false);
        super.field4538.method3388((class710) null, false);
        super.field4538.method3469(0, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lvga;Lvga;II)V", line = 256)
    public final void method980(class239 arg0, class239 arg1, int arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field1748;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, (double) arg3, 1.0D);
        if (this.field1759 != null) {
            super.field4538.method3395(18469, this.field1758);
            int var5 = class71.method571(this.field1746, (byte) 86);
            int var6 = class71.method571(this.field1762, (byte) 101);
            int var7 = 0;
            while (~var5 < -257 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field1758.method3841(this.field1759[var7], 0, (byte) 69);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (~var7 != -1) {
                    super.field4538.method3388(this.field1759[var7 + -1], false);
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
                    super.field4538.method3388(arg1, false);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1746, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1746, (float) this.field1762);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1762);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field4538.method3390(-22078, this.field1758);
            super.field4538.method3388(this.field1759[var7 + -1], false);
            super.field4538.method3395(18469, this.field1760);
            this.field1760.method3840((byte) 115, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field1761.field667;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class279.field3654, 0.0F, 0.0F);
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
            super.field4538.method3388(arg1, false);
            super.field4538.method3395(arg3 + 18470, this.field1760);
            this.field1760.method3840((byte) 48, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1754.field667;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class279.field3654, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1746, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1746, (float) this.field1762);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1762);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1760.method3840((byte) 57, 1);
        super.field4538.method3388(this.field1749, false);
        long var12 = this.field1768.field667;
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
        this.field1760.method3840((byte) 105, 0);
        super.field4538.method3388(this.field1770, false);
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
        super.field4538.method3390(-22078, this.field1760);
        long var14 = this.field1756.field667;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class64.field877, class305.field4011, 0.0F);
        super.field4538.method3469(1, false);
        super.field4538.method3388(this.field1749, false);
        super.field4538.method3469(0, false);
        super.field4538.method3388(arg1, false);
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)I", line = 422)
    public final int method981(int arg0) {
        if (arg0 <= 44) {
            return -51;
        } else {
            ++field1765;
            return 1;
        }
    }
}
