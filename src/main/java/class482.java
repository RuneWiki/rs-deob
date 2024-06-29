import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class482 extends class619 {

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "F")
    public static float field6702 = 1.0F;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public static int field6705 = 0;

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "Z")
    public static boolean field6723 = false;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    private int field6703;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    private int field6707;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    private int field6708;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    private int field6712;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "Ldga;")
    private class441 field6710;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "Ldga;")
    private class441 field6716;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "Lte;")
    private class490 field6714;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "Lte;")
    private class490 field6717;

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "Lte;")
    private class490 field6718;

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "Lte;")
    private class490 field6721;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "Liu;")
    private class560 field6706;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "Liu;")
    private class560 field6713;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "[Ldga;")
    private class441[] field6711;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
    public final void method2772(int arg0, int arg1) {
        ++field6700;
        if (arg0 > -83) {
            this.field6710 = null;
        }
        OpenGL.glUseProgramObjectARB(0L);
        super.field8592.method2625(20296, 1);
        super.field8592.method2627(63, (class262) null);
        super.field8592.method2625(20296, 0);
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)I")
    public final int method2773(int arg0) {
        ++field6722;
        if (arg0 != 0) {
            this.field6707 = 30;
        }
        return 1;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Z")
    public final boolean method2774(byte arg0) {
        ++field6715;
        if (arg0 != -53) {
            return true;
        } else if (super.field8592.field6507 && super.field8592.field6454 && super.field8592.field6483) {
            this.field6713 = new class560(super.field8592);
            this.field6710 = new class441(super.field8592, 3553, 34842, 256, 256);
            this.field6710.method2495(false, false, (byte) -1);
            this.field6716 = new class441(super.field8592, 3553, 34842, 256, 256);
            this.field6716.method2495(false, false, (byte) -1);
            super.field8592.method2673(this.field6713, 128);
            this.field6713.method3111((byte) -104, this.field6710, 0);
            this.field6713.method3111((byte) -128, this.field6716, 1);
            this.field6713.method3107(18457, 0);
            if (!this.field6713.method3113((byte) 120)) {
                super.field8592.method2621((byte) -124, this.field6713);
                return false;
            } else {
                super.field8592.method2621((byte) -78, this.field6713);
                this.field6717 = method2780((byte) -53, super.field8592, new class451[] { class362.method2116((byte) -48, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field8592, 35632) });
                this.field6721 = method2780((byte) -53, super.field8592, new class451[] { class362.method2116((byte) -48, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field8592, 35632) });
                this.field6714 = method2780((byte) -53, super.field8592, new class451[] { class362.method2116((byte) -48, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field8592, 35632) });
                this.field6718 = method2780((byte) -53, super.field8592, new class451[] { class362.method2116((byte) -48, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field8592, 35632) });
                return this.field6721 != null && this.field6717 != null && this.field6714 != null && this.field6718 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lag;)V")
    public class482(class469 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)Z")
    public final boolean method2775(int arg0) {
        if (arg0 <= 68) {
            return true;
        } else {
            ++field6698;
            return super.field8592.field6507 && super.field8592.field6454 && super.field8592.field6483;
        }
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(B)V")
    public static final void method2776(byte arg0) {
        if (arg0 != -54) {
            method2780((byte) 47, (class469) null, (class451[]) null);
        }
        for (int var1 = 0; ~class413.field5414 < ~var1; ++var1) {
            class480 var2 = class67.field824[var1];
            if (~var2.field6674 == -4) {
                if (var2.field6683 == null) {
                    var2.field6681 = Integer.MIN_VALUE;
                } else {
                    class126.field1759.method1345(var2.field6683);
                }
            }
        }
        ++field6699;
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V")
    public static final void method2777(int arg0) {
        class266.field3479 = arg0;
        for (int var1 = 0; var1 < class329.field4421; ++var1) {
            for (int var2 = 0; var2 < class641.field8846; ++var2) {
                if (class153.field2168[arg0][var1][var2] == null) {
                    class153.field2168[arg0][var1][var2] = new class207(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method2778(byte arg0) {
        ++field6697;
        this.field6716 = null;
        this.field6710 = null;
        this.field6717 = null;
        this.field6714 = null;
        this.field6706 = null;
        if (arg0 != 127) {
            this.method2772(40, -10);
        }
        this.field6721 = null;
        this.field6718 = null;
        this.field6713 = null;
        this.field6711 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
    public final void method2779(int arg0, int arg1, int arg2) {
        this.field6712 = arg2;
        ++field6709;
        if (arg1 >= -58) {
            this.field6714 = null;
        }
        this.field6708 = arg0;
        int var4 = class245.method1497(this.field6708, (byte) -124);
        int var5 = class245.method1497(this.field6712, (byte) -124);
        if (~this.field6703 != ~var4 || ~this.field6707 != ~var5) {
            if (this.field6711 != null) {
                for (int var6 = 0; var6 < this.field6711.length; ++var6) {
                    this.field6711[var6].method1581(-123);
                }
                this.field6711 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field6706 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field6706 == null) {
                    this.field6706 = new class560(super.field8592);
                }
                label59: while (true) {
                    if (var7 <= 256 && ~var8 >= -257) {
                        this.field6711 = new class441[var9];
                        int var10 = var5;
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && var10 <= 256) {
                                break label59;
                            }
                            this.field6711[var12++] = new class441(super.field8592, 3553, 34842, var11, var10);
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                        }
                    }
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field6707 = var5;
            this.field6703 = var4;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLag;[Lvk;)Lte;")
    public static final class490 method2780(byte arg0, class469 arg1, class451[] arg2) {
        ++field6704;
        for (int var3 = 0; var3 < arg2.length; ++var3) {
            if (arg2[var3] == null || ~arg2[var3].field5955 >= -1L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; arg2.length > var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field5955);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class231.field3081, 0);
        if (arg0 != -53) {
            method2776((byte) 86);
        }
        if (class231.field3081[0] == 0) {
            if (~class231.field3081[0] == -1) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class231.field3081, 1);
            if (~class231.field3081[1] < -2) {
                byte[] var7 = new byte[class231.field3081[1]];
                OpenGL.glGetInfoLogARB(var4, class231.field3081[1], class231.field3081, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class231.field3081[0] == 0) {
                for (int var8 = 0; ~arg2.length < ~var8; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field5955);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class490(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
    public final boolean method2781(int arg0) {
        ++field6701;
        if (arg0 != 0) {
            method2776((byte) 48);
        }
        return this.field6713 != null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ldga;IILdga;)V")
    public final void method2782(class441 arg0, int arg1, int arg2, class441 arg3) {
        ++field6719;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6711 != null) {
            super.field8592.method2673(this.field6706, arg1 + -29570);
            int var5 = class245.method1497(this.field6708, (byte) -124);
            int var6 = class245.method1497(this.field6712, (byte) -124);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field6706.method3111((byte) -100, this.field6711[var7], 0);
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (var7 != 0) {
                    super.field8592.method2627(36, this.field6711[var7 + -1]);
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
                    super.field8592.method2627(41, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6708, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6708, (float) this.field6712);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6712);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var5 > 256) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field8592.method2621((byte) -57, this.field6706);
            super.field8592.method2627(47, this.field6711[var7 + -1]);
            super.field8592.method2673(this.field6713, 128);
            this.field6713.method3107(18457, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field6721.field6786;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), field6702, 0.0F, 0.0F);
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
            super.field8592.method2627(68, arg3);
            super.field8592.method2673(this.field6713, 128);
            this.field6713.method3107(arg1 + -11241, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6717.field6786;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), field6702, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6708, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6708, (float) this.field6712);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6712);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field6713.method3107(18457, 1);
        super.field8592.method2627(83, this.field6710);
        long var12 = this.field6718.field6786;
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
        this.field6713.method3107(18457, 0);
        super.field8592.method2627(arg1 + -29598, this.field6716);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        if (arg1 != 29698) {
            method2780((byte) 68, (class469) null, (class451[]) null);
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
        super.field8592.method2621((byte) 81, this.field6713);
        long var14 = this.field6714.field6786;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class52.field667, class79.field931, 0.0F);
        super.field8592.method2625(20296, 1);
        super.field8592.method2627(23, this.field6710);
        super.field8592.method2625(20296, 0);
        super.field8592.method2627(66, arg3);
    }
}
