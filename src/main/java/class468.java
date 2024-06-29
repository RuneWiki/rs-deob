import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class468 extends class271 {

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    private int field6630;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    private int field6638;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    private int field6641;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    private int field6646;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "Lwd;")
    private class327 field6639;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "Lwd;")
    private class327 field6644;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "Lkr;")
    public static class329 field6640;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "Lku;")
    private class495 field6632;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "Lku;")
    private class495 field6645;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "Lqca;")
    private class610 field6636;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "Lqca;")
    private class610 field6650;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "Lqca;")
    private class610 field6652;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "Lqca;")
    private class610 field6653;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "[Lku;")
    private class495[] field6648;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
    public final void method1660(int arg0, int arg1, int arg2) {
        this.field6641 = arg0;
        this.field6630 = arg2;
        ++field6633;
        int var4 = class103.method565(32085, this.field6641);
        if (arg1 >= -5) {
            method2684(-122, 111, 116);
        }
        int var5 = class103.method565(32085, this.field6630);
        if (this.field6646 != var4 || this.field6638 != var5) {
            if (this.field6648 != null) {
                for (int var6 = 0; var6 < this.field6648.length; ++var6) {
                    this.field6648[var6].method811(1);
                }
                this.field6648 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field6644 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field6644 == null) {
                    this.field6644 = new class327(super.field3451);
                }
                label59: while (true) {
                    if (var7 <= 256 && var8 <= 256) {
                        int var10 = var4;
                        this.field6648 = new class495[var9];
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (var10 <= 256 && ~var11 >= -257) {
                                break label59;
                            }
                            this.field6648[var12++] = new class495(super.field3451, 3553, 34842, var10, var11);
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
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field6646 = var4;
            this.field6638 = var5;
        }
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)Z")
    public final boolean method1662(int arg0) {
        ++field6634;
        if (arg0 < 103) {
            field6640 = null;
        }
        if (super.field3451.field4336 && super.field3451.field4274 && super.field3451.field4305) {
            this.field6639 = new class327(super.field3451);
            this.field6645 = new class495(super.field3451, 3553, 34842, 256, 256);
            this.field6645.method2776(-85, false, false);
            this.field6632 = new class495(super.field3451, 3553, 34842, 256, 256);
            this.field6632.method2776(-90, false, false);
            super.field3451.method1918(this.field6639, 125);
            this.field6639.method2018(this.field6645, 0, 0);
            this.field6639.method2018(this.field6632, 0, 1);
            this.field6639.method2016(true, 0);
            if (!this.field6639.method2020(-123)) {
                super.field3451.method1917((byte) 108, this.field6639);
                return false;
            } else {
                super.field3451.method1917((byte) -114, this.field6639);
                this.field6653 = class643.method3710(super.field3451, 118, new class364[] { class579.method3253("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field3451, 35632, false) });
                this.field6650 = class643.method3710(super.field3451, 113, new class364[] { class579.method3253("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field3451, 35632, false) });
                this.field6652 = class643.method3710(super.field3451, 91, new class364[] { class579.method3253("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field3451, 35632, false) });
                this.field6636 = class643.method3710(super.field3451, 82, new class364[] { class579.method3253("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field3451, 35632, false) });
                return this.field6650 != null && this.field6653 != null && this.field6652 != null && this.field6636 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)I")
    public final int method1661(int arg0) {
        if (arg0 != -17472) {
            return -60;
        } else {
            ++field6651;
            return 1;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)Z")
    public final boolean method2683(byte arg0) {
        ++field6649;
        int var2 = -82 / ((arg0 - -28) / 54);
        return super.field3451.field4336 && super.field3451.field4274 && super.field3451.field4305;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(III)Z")
    public static final boolean method2684(int arg0, int arg1, int arg2) {
        ++field6643;
        if (arg0 != 0) {
            field6640 = null;
        }
        return (arg1 & 384) != 0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILku;Lku;I)V")
    public final void method1663(int arg0, class495 arg1, class495 arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field6631;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6648 == null) {
            super.field3451.method1884(arg1, -2);
            super.field3451.method1918(this.field6639, 118);
            this.field6639.method2016(true, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field6653.field8770;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class109.field1408, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6641, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6641, (float) this.field6630);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6630);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field3451.method1918(this.field6644, 122);
            int var7 = class103.method565(32085, this.field6641);
            int var8 = class103.method565(arg0 ^ 32085, this.field6630);
            int var9 = 0;
            while (~var7 < -257 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field6644.method2018(this.field6648[var9], 0, 0);
                if (var9 == 0) {
                    super.field3451.method1884(arg1, arg0 + -2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6641, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6641, (float) this.field6630);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6630);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field3451.method1884(this.field6648[var9 + -1], -2);
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
                if (var8 > 256) {
                    var8 >>= 1;
                }
                if (~var7 < -257) {
                    var7 >>= 1;
                }
                ++var9;
            }
            super.field3451.method1917((byte) -127, this.field6644);
            super.field3451.method1884(this.field6648[var9 + -1], -2);
            super.field3451.method1918(this.field6639, 125);
            this.field6639.method2016(true, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6650.field8770;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class109.field1408, 0.0F, 0.0F);
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
        this.field6639.method2016(true, 1);
        super.field3451.method1884(this.field6645, -2);
        long var12 = this.field6636.field8770;
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
        this.field6639.method2016(true, 0);
        super.field3451.method1884(this.field6632, arg0 ^ -2);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f((float) arg0, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field3451.method1917((byte) 75, this.field6639);
        long var14 = this.field6652.field8770;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class313.field4026, class17.field183, 0.0F);
        super.field3451.method1966(3000, 1);
        super.field3451.method1884(this.field6645, -2);
        super.field3451.method1966(arg0 + 3000, 0);
        super.field3451.method1884(arg1, -2);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)I")
    public static final int method2685(int arg0, boolean arg1) {
        int var7 = arg0 - 1;
        ++field6637;
        int var2 = var7 | var7 >>> 1;
        if (arg1) {
            field6640 = null;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)Z")
    public final boolean method1664(boolean arg0) {
        ++field6642;
        if (arg0) {
            this.method1662(49);
        }
        return this.field6639 != null;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Luq;)V")
    public class468(class313 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public final void method1655(int arg0) {
        this.field6653 = null;
        this.field6652 = null;
        if (arg0 != 11857) {
            method2686(76);
        }
        this.field6639 = null;
        this.field6648 = null;
        this.field6636 = null;
        ++field6654;
        this.field6645 = null;
        this.field6644 = null;
        this.field6650 = null;
        this.field6632 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
    public final void method1657(int arg0, int arg1) {
        ++field6647;
        OpenGL.glUseProgramObjectARB(0L);
        super.field3451.method1966(3000, 1);
        super.field3451.method1884((class148) null, arg1 ^ -2);
        super.field3451.method1966(3000, arg1);
    }

    @OriginalMember(owner = "client!os", name = "i", descriptor = "(I)V")
    public static void method2686(int arg0) {
        if (arg0 != 256) {
            method2686(-49);
        }
        field6640 = null;
    }
}
