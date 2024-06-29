import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class742 extends class571 {

    @OriginalMember(owner = "client!fka", name = "I", descriptor = "Ljava/lang/String;")
    public static String field10333 = "";

    @OriginalMember(owner = "client!fka", name = "L", descriptor = "Lhj;")
    public static class596 field10336 = new class596(13, -2);

    @OriginalMember(owner = "client!fka", name = "V", descriptor = "I")
    public static int field10346 = 0;

    @OriginalMember(owner = "client!fka", name = "X", descriptor = "Lhj;")
    public static class596 field10347 = new class596(40, 4);

    @OriginalMember(owner = "client!fka", name = "x", descriptor = "I")
    public static int field10322;

    @OriginalMember(owner = "client!fka", name = "y", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!fka", name = "A", descriptor = "I")
    private int field10325;

    @OriginalMember(owner = "client!fka", name = "F", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!fka", name = "G", descriptor = "I")
    public static int field10331;

    @OriginalMember(owner = "client!fka", name = "J", descriptor = "I")
    public static int field10334;

    @OriginalMember(owner = "client!fka", name = "M", descriptor = "I")
    public static int field10337;

    @OriginalMember(owner = "client!fka", name = "N", descriptor = "I")
    public static int field10338;

    @OriginalMember(owner = "client!fka", name = "O", descriptor = "I")
    private int field10339;

    @OriginalMember(owner = "client!fka", name = "P", descriptor = "I")
    public static int field10340;

    @OriginalMember(owner = "client!fka", name = "S", descriptor = "I")
    public static int field10343;

    @OriginalMember(owner = "client!fka", name = "T", descriptor = "I")
    private int field10344;

    @OriginalMember(owner = "client!fka", name = "U", descriptor = "I")
    private int field10345;

    @OriginalMember(owner = "client!fka", name = "B", descriptor = "Lld;")
    private class182 field10326;

    @OriginalMember(owner = "client!fka", name = "E", descriptor = "Lld;")
    private class182 field10329;

    @OriginalMember(owner = "client!fka", name = "D", descriptor = "Lvda;")
    private class195 field10328;

    @OriginalMember(owner = "client!fka", name = "R", descriptor = "Lvda;")
    private class195 field10342;

    @OriginalMember(owner = "client!fka", name = "C", descriptor = "Lpq;")
    private class207 field10327;

    @OriginalMember(owner = "client!fka", name = "H", descriptor = "Lpq;")
    private class207 field10332;

    @OriginalMember(owner = "client!fka", name = "K", descriptor = "Lpq;")
    private class207 field10335;

    @OriginalMember(owner = "client!fka", name = "Q", descriptor = "Lpq;")
    private class207 field10341;

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "[Lld;")
    private class182[] field10324;

    @OriginalMember(owner = "client!fka", name = "e", descriptor = "(Z)Z")
    public final boolean method4166(boolean arg0) {
        if (arg0) {
            this.method3308(75);
        }
        ++field10343;
        return super.field7836.field9841 && super.field7836.field9768 && super.field7836.field9783;
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(IIB)V")
    public final void method3309(int arg0, int arg1, byte arg2) {
        this.field10339 = arg0;
        if (arg2 >= -48) {
            this.field10344 = -109;
        }
        this.field10344 = arg1;
        ++field10331;
        int var4 = class381.method2234(-125, this.field10339);
        int var5 = class381.method2234(-124, this.field10344);
        if (this.field10345 != var4 || this.field10325 != var5) {
            if (this.field10324 != null) {
                for (int var6 = 0; this.field10324.length > var6; ++var6) {
                    this.field10324[var6].method2346(10833);
                }
                this.field10324 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field10328 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field10328 == null) {
                    this.field10328 = new class195(super.field7836);
                }
                label59: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        int var10 = var4;
                        int var11 = var5;
                        this.field10324 = new class182[var9];
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && var11 <= 256) {
                                break label59;
                            }
                            this.field10324[var12++] = new class182(super.field7836, 3553, 34842, var10, var11);
                            if (var11 > 256) {
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
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field10325 = var5;
            this.field10345 = var4;
        }
    }

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lpc;)V")
    public class742(class700 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fka", name = "f", descriptor = "(Z)V")
    public static void method4167(boolean arg0) {
        field10333 = null;
        if (arg0) {
            field10347 = null;
        }
        field10336 = null;
        field10347 = null;
    }

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(B)V")
    public final void method3317(byte arg0) {
        this.field10335 = null;
        this.field10332 = null;
        ++field10322;
        if (arg0 != 44) {
            this.method3301(-34);
        }
        this.field10329 = null;
        this.field10328 = null;
        this.field10326 = null;
        this.field10341 = null;
        this.field10342 = null;
        this.field10324 = null;
        this.field10327 = null;
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(Lld;Lld;IB)V")
    public final void method3303(class182 arg0, class182 arg1, int arg2, byte arg3) {
        if (arg3 >= -17) {
            this.field10339 = -42;
        }
        OpenGL.glPushAttrib(2048);
        ++field10338;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field10324 != null) {
            super.field7836.method3956(false, this.field10328);
            int var5 = class381.method2234(-125, this.field10339);
            int var6 = class381.method2234(-128, this.field10344);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field10328.method1274(0, 0, this.field10324[var7]);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (~var7 == -1) {
                    super.field7836.method3936(false, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field10339, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field10339, (float) this.field10344);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field10344);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field7836.method3936(false, this.field10324[var7 + -1]);
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
            super.field7836.method3964(this.field10328, -1);
            super.field7836.method3936(false, this.field10324[var7 + -1]);
            super.field7836.method3956(false, this.field10342);
            this.field10342.method1272(0, 18636);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field10332.field2457;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class337.field4165, 0.0F, 0.0F);
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
            super.field7836.method3936(false, arg1);
            super.field7836.method3956(false, this.field10342);
            this.field10342.method1272(0, 18636);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field10327.field2457;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class337.field4165, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field10339, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field10339, (float) this.field10344);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field10344);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field10342.method1272(1, 18636);
        super.field7836.method3936(false, this.field10329);
        long var12 = this.field10335.field2457;
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
        this.field10342.method1272(0, 18636);
        super.field7836.method3936(false, this.field10326);
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
        super.field7836.method3964(this.field10342, -1);
        long var14 = this.field10341.field2457;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class669.field9182, class591.field8028, 0.0F);
        super.field7836.method3925((byte) 37, 1);
        super.field7836.method3936(false, this.field10329);
        super.field7836.method3925((byte) 126, 0);
        super.field7836.method3936(false, arg1);
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(I)Z")
    public final boolean method3301(int arg0) {
        if (arg0 != 35632) {
            this.method3301(-115);
        }
        ++field10334;
        if (super.field7836.field9841 && super.field7836.field9768 && super.field7836.field9783) {
            this.field10342 = new class195(super.field7836);
            this.field10329 = new class182(super.field7836, 3553, 34842, 256, 256);
            this.field10329.method1221(false, arg0 + -35633, false);
            this.field10326 = new class182(super.field7836, 3553, 34842, 256, 256);
            this.field10326.method1221(false, -1, false);
            super.field7836.method3956(false, this.field10342);
            this.field10342.method1274(0, arg0 ^ 35632, this.field10329);
            this.field10342.method1274(1, arg0 + -35632, this.field10326);
            this.field10342.method1272(0, 18636);
            if (!this.field10342.method1276((byte) 24)) {
                super.field7836.method3964(this.field10342, -1);
                return false;
            } else {
                super.field7836.method3964(this.field10342, -1);
                this.field10327 = class89.method810(new class426[] { class253.method1506(-1, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field7836) }, super.field7836, (byte) 29);
                this.field10332 = class89.method810(new class426[] { class253.method1506(-1, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field7836) }, super.field7836, (byte) -114);
                this.field10341 = class89.method810(new class426[] { class253.method1506(-1, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field7836) }, super.field7836, (byte) 60);
                this.field10335 = class89.method810(new class426[] { class253.method1506(-1, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field7836) }, super.field7836, (byte) 71);
                return this.field10332 != null && this.field10327 != null && this.field10341 != null && this.field10335 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(II)V")
    public final void method3310(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        if (arg1 == -31178) {
            ++field10330;
            super.field7836.method3925((byte) -123, 1);
            super.field7836.method3936(false, (class400) null);
            super.field7836.method3925((byte) 104, 0);
        }
    }

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "(I)Z")
    public final boolean method3308(int arg0) {
        ++field10340;
        if (arg0 <= 55) {
            this.method3303((class182) null, (class182) null, 29, (byte) 39);
        }
        return this.field10342 != null;
    }

    @OriginalMember(owner = "client!fka", name = "d", descriptor = "(Z)I")
    public final int method3316(boolean arg0) {
        ++field10323;
        if (arg0) {
            this.method3316(false);
        }
        return 1;
    }
}
