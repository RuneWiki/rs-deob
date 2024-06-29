import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class398 extends class91 {

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    private int field5794;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    private int field5796;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    private int field5800;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
    private int field5810;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "Lsg;")
    private class262 field5801;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "Lsg;")
    private class262 field5802;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Lsj;")
    private class305 field5793;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "Lsj;")
    private class305 field5799;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "Lsj;")
    private class305 field5803;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "Lsj;")
    private class305 field5808;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "Lmg;")
    private class96 field5804;

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "Lmg;")
    private class96 field5811;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "[Lsg;")
    private class262[] field5791;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)Z")
    public final boolean method2361(int arg0) {
        ++field5798;
        if (arg0 != 256) {
            this.field5804 = null;
        }
        return super.field1635.field6802 && super.field1635.field6720 && super.field1635.field6815;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLsg;ILsg;)V")
    public final void method677(byte arg0, class262 arg1, int arg2, class262 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field5797;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5791 != null) {
            super.field1635.method2612(arg0 ^ -12, this.field5811);
            int var5 = class339.method2093(-118, this.field5810);
            int var6 = class339.method2093(-117, this.field5794);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field5811.method724(4, 0, this.field5791[var7]);
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (~var7 != -1) {
                    super.field1635.method2586(this.field5791[var7 + -1], false);
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
                    super.field1635.method2586(arg1, false);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field5810, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field5810, (float) this.field5794);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5794);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field1635.method2591((byte) 51, this.field5811);
            super.field1635.method2586(this.field5791[var7 - 1], false);
            super.field1635.method2612(-72, this.field5804);
            this.field5804.method715(0, -95);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field5808.field4626;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class22.field279, 0.0F, 0.0F);
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
            super.field1635.method2586(arg1, false);
            super.field1635.method2612(-107, this.field5804);
            this.field5804.method715(0, 126);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field5803.field4626;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class22.field279, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field5810, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field5810, (float) this.field5794);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field5794);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field5804.method715(1, arg0 + 67);
        super.field1635.method2586(this.field5801, false);
        long var12 = this.field5793.field4626;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        if (arg0 != 22) {
            this.field5799 = null;
        }
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
        this.field5804.method715(0, 76);
        super.field1635.method2586(this.field5802, false);
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
        super.field1635.method2591((byte) 51, this.field5804);
        long var14 = this.field5799.field4626;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class339.field5068, class55.field843, 0.0F);
        super.field1635.method2582((byte) -86, 1);
        super.field1635.method2586(this.field5801, false);
        super.field1635.method2582((byte) 120, 0);
        super.field1635.method2586(arg1, false);
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lbl;)V")
    public class398(class442 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILab;Lab;)V")
    public static final void method2362(int arg0, int arg1, int arg2, class455 arg3, class455 arg4) {
        class268 var5 = class18.method95(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field4059 = arg3;
            var5.field4063 = arg4;
        }
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)Z")
    public final boolean method687(int arg0) {
        if (arg0 != 15623) {
            return false;
        } else {
            ++field5795;
            return this.field5804 != null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)V")
    public final void method688(int arg0, boolean arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field5805;
        super.field1635.method2582((byte) 114, 1);
        super.field1635.method2586((class194) null, arg1);
        super.field1635.method2582((byte) 113, 0);
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
    public final void method679(int arg0) {
        this.field5808 = null;
        this.field5793 = null;
        ++field5792;
        this.field5801 = null;
        int var2 = 31 / ((-33 - arg0) / 51);
        this.field5803 = null;
        this.field5799 = null;
        this.field5791 = null;
        this.field5802 = null;
        this.field5811 = null;
        this.field5804 = null;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)V")
    public final void method685(int arg0, int arg1, int arg2) {
        this.field5794 = arg2;
        this.field5810 = arg0;
        if (arg1 != 5865) {
            this.field5804 = null;
        }
        ++field5807;
        int var4 = class339.method2093(-121, this.field5810);
        int var5 = class339.method2093(-123, this.field5794);
        if (~this.field5800 != ~var4 || this.field5796 != var5) {
            if (this.field5791 != null) {
                for (int var6 = 0; this.field5791.length > var6; ++var6) {
                    this.field5791[var6].method1214(111);
                }
                this.field5791 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field5811 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label62: while (true) {
                    if (var7 <= 256 && var8 <= 256) {
                        if (this.field5811 == null) {
                            this.field5811 = new class96(super.field1635);
                        }
                        this.field5791 = new class262[var9];
                        int var10 = var5;
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && ~var10 >= -257) {
                                break label62;
                            }
                            this.field5791[var12++] = new class262(super.field1635, 3553, 34842, var11, var10);
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                        }
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field5800 = var4;
            this.field5796 = var5;
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)Z")
    public final boolean method686(byte arg0) {
        ++field5809;
        int var2 = 45 / ((arg0 - 16) / 45);
        if (super.field1635.field6802 && super.field1635.field6720 && super.field1635.field6815) {
            this.field5804 = new class96(super.field1635);
            this.field5801 = new class262(super.field1635, 3553, 34842, 256, 256);
            this.field5801.method1593(false, false, 0);
            this.field5802 = new class262(super.field1635, 3553, 34842, 256, 256);
            this.field5802.method1593(false, false, 0);
            super.field1635.method2612(-36, this.field5804);
            this.field5804.method724(4, 0, this.field5801);
            this.field5804.method724(4, 1, this.field5802);
            this.field5804.method715(0, -40);
            if (!this.field5804.method719(-1)) {
                super.field1635.method2591((byte) 51, this.field5804);
                return false;
            } else {
                super.field1635.method2591((byte) 51, this.field5804);
                this.field5803 = class375.method2261(super.field1635, 122, new class108[] { class83.method596(35632, super.field1635, -55, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field5808 = class375.method2261(super.field1635, -85, new class108[] { class83.method596(35632, super.field1635, -52, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field5799 = class375.method2261(super.field1635, -30, new class108[] { class83.method596(35632, super.field1635, -105, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
                this.field5793 = class375.method2261(super.field1635, -117, new class108[] { class83.method596(35632, super.field1635, -103, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
                return this.field5808 != null && this.field5803 != null && this.field5799 != null && this.field5793 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
    public final int method678(byte arg0) {
        ++field5806;
        if (arg0 != -96) {
            this.method688(-127, false);
        }
        return 1;
    }
}
