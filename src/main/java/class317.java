import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class317 extends class495 {

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "Li;")
    public static class30 field4637 = new class30();

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "Lgn;")
    public static class475 field4649 = new class475(30, 3);

    @OriginalMember(owner = "client!qq", name = "W", descriptor = "Lpp;")
    public static class256 field4654 = new class256("", 15);

    @OriginalMember(owner = "client!qq", name = "ab", descriptor = "[[I")
    public static int[][] field4658 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    private int field4638;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    private int field4648;

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "I")
    private int field4652;

    @OriginalMember(owner = "client!qq", name = "V", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!qq", name = "Y", descriptor = "I")
    private int field4656;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "Ljh;")
    private class105 field4635;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "Ljh;")
    private class105 field4639;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "Ljh;")
    private class105 field4642;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "Ljh;")
    private class105 field4643;

    @OriginalMember(owner = "client!qq", name = "Z", descriptor = "Lhe;")
    public static class239 field4657;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "Lud;")
    private class26 field4636;

    @OriginalMember(owner = "client!qq", name = "X", descriptor = "Lud;")
    private class26 field4655;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "Lpr;")
    private class295 field4644;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "Lpr;")
    private class295 field4650;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "[Lud;")
    private class26[] field4632;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)Z", line = 3)
    public final boolean method1904(int arg0) {
        if (arg0 != 10221) {
            return false;
        } else {
            ++field4646;
            return this.field4650 != null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)Z", line = 17)
    public final boolean method1905(int arg0) {
        ++field4633;
        if (super.field7537.field7348 && super.field7537.field7366 && super.field7537.field7362) {
            this.field4650 = new class295(super.field7537);
            this.field4655 = new class26(super.field7537, 3553, 34842, 256, 256);
            this.field4655.method228(false, false, 0);
            this.field4636 = new class26(super.field7537, 3553, 34842, 256, 256);
            this.field4636.method228(false, false, 0);
            super.field7537.method2872(127, this.field4650);
            this.field4650.method1783((byte) 64, this.field4655, 0);
            this.field4650.method1783((byte) 64, this.field4636, 1);
            this.field4650.method1795(0, (byte) -103);
            if (!this.field4650.method1789(false)) {
                super.field7537.method2927(14921, this.field4650);
                return false;
            } else {
                super.field7537.method2927(14921, this.field4650);
                this.field4639 = class40.method307((byte) 55, super.field7537, new class260[] { class150.method921(super.field7537, 35632, (byte) -100, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field4642 = class40.method307((byte) 55, super.field7537, new class260[] { class150.method921(super.field7537, 35632, (byte) -72, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field4635 = class40.method307((byte) 55, super.field7537, new class260[] { class150.method921(super.field7537, 35632, (byte) -101, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
                this.field4643 = class40.method307((byte) 55, super.field7537, new class260[] { class150.method921(super.field7537, 35632, (byte) -42, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
                return this.field4642 != null && this.field4639 != null && this.field4635 != null && this.field4643 != null;
            }
        } else {
            int var2 = 124 / (-arg0 / 45);
            return false;
        }
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)I", line = 55)
    public final int method1906(int arg0) {
        ++field4634;
        return arg0 != 2048 ? -100 : 1;
    }

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "(I)V", line = 70)
    public static void method1907(int arg0) {
        field4658 = null;
        field4649 = null;
        field4654 = null;
        field4657 = null;
        field4637 = null;
        if (arg0 != -20850) {
            method1907(97);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V", line = 84)
    public final void method1908(int arg0, int arg1) {
        if (arg1 <= 27) {
            method1912(6);
        }
        OpenGL.glUseProgramObjectARB(0L);
        ++field4645;
        super.field7537.method2849(1, (byte) -109);
        super.field7537.method2883((class221) null, -96);
        super.field7537.method2849(0, (byte) -109);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZII)V", line = 101)
    public final void method1909(boolean arg0, int arg1, int arg2) {
        this.field4652 = arg1;
        ++field4640;
        this.field4656 = arg2;
        int var4 = class70.method477(this.field4656, !arg0);
        int var5 = class70.method477(this.field4652, !arg0);
        if (~this.field4638 != ~var4 || this.field4648 != var5) {
            if (this.field4632 != null) {
                for (int var6 = 0; ~var6 > ~this.field4632.length; ++var6) {
                    this.field4632[var6].method1371((byte) -107);
                }
                this.field4632 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field4644 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field4644 == null) {
                    this.field4644 = new class295(super.field7537);
                }
                label68: while (true) {
                    if (var7 <= 256 && var8 <= 256) {
                        int var10 = var5;
                        int var11 = var4;
                        this.field4632 = new class26[var9];
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && ~var10 >= -257) {
                                break label68;
                            }
                            this.field4632[var12++] = new class26(super.field7537, 3553, 34842, var11, var10);
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                    ++var9;
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                }
            }
            this.field4648 = var5;
            this.field4638 = var4;
        }
        if (!arg0) {
            this.method1909(true, 13, -12);
        }
    }

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "(I)Z", line = 178)
    public final boolean method1910(int arg0) {
        ++field4631;
        if (arg0 != 34842) {
            field4653 = -70;
        }
        return super.field7537.field7348 && super.field7537.field7366 && super.field7537.field7362;
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V", line = 189)
    public final void method1911(int arg0) {
        this.field4655 = null;
        this.field4635 = null;
        this.field4644 = null;
        this.field4639 = null;
        this.field4636 = null;
        this.field4642 = null;
        ++field4651;
        this.field4650 = null;
        if (arg0 != 0) {
            field4654 = null;
        }
        this.field4643 = null;
        this.field4632 = null;
    }

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "(I)Z", line = 209)
    public static final boolean method1912(int arg0) {
        ++field4641;
        int var1 = 12 / ((49 - arg0) / 48);
        if (class242.field3446) {
            try {
                class123.method697((byte) 105, "showVideoAd", class86.field1182.field668);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lrl;)V", line = 236)
    public class317(class487 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILud;ILud;)V", line = 241)
    public final void method1913(int arg0, class26 arg1, int arg2, class26 arg3) {
        ++field4647;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4632 != null) {
            super.field7537.method2872(125, this.field4644);
            int var5 = class70.method477(this.field4656, false);
            int var6 = class70.method477(this.field4652, false);
            int var7 = 0;
            while (var5 > 256 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field4644.method1783((byte) 64, this.field4632[var7], 0);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (~var7 != -1) {
                    super.field7537.method2883(this.field4632[var7 + -1], 19);
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
                    super.field7537.method2883(arg3, 34);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field4656, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field4656, (float) this.field4652);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4652);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                ++var7;
            }
            super.field7537.method2927(14921, this.field4644);
            super.field7537.method2883(this.field4632[var7 + -1], 29);
            super.field7537.method2872(126, this.field4650);
            this.field4650.method1795(0, (byte) -103);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field4642.field1409;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class325.field4745, 0.0F, 0.0F);
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
            super.field7537.method2883(arg3, 95);
            super.field7537.method2872(127, this.field4650);
            this.field4650.method1795(0, (byte) -103);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field4639.field1409;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class325.field4745, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field4656, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field4656, (float) this.field4652);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field4652);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field4650.method1795(1, (byte) -103);
        super.field7537.method2883(this.field4655, -120);
        long var12 = this.field4643.field1409;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        if (arg0 <= 27) {
            this.field4652 = -124;
        }
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        this.field4650.method1795(0, (byte) -103);
        super.field7537.method2883(this.field4636, 77);
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
        super.field7537.method2927(14921, this.field4650);
        long var14 = this.field4635.field1409;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class39.field607, class87.field1198, 0.0F);
        super.field7537.method2849(1, (byte) -109);
        super.field7537.method2883(this.field4655, -106);
        super.field7537.method2849(0, (byte) -109);
        super.field7537.method2883(arg3, -113);
    }
}
