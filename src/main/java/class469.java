import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class469 extends class224 {

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!taa", name = "s", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!taa", name = "t", descriptor = "I")
    private int field6504;

    @OriginalMember(owner = "client!taa", name = "w", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!taa", name = "A", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!taa", name = "B", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!taa", name = "D", descriptor = "I")
    private int field6514;

    @OriginalMember(owner = "client!taa", name = "F", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!taa", name = "H", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!taa", name = "J", descriptor = "I")
    private int field6519;

    @OriginalMember(owner = "client!taa", name = "K", descriptor = "I")
    private int field6520;

    @OriginalMember(owner = "client!taa", name = "L", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!taa", name = "M", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!taa", name = "P", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!taa", name = "Q", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "Lfba;")
    private class350 field6510;

    @OriginalMember(owner = "client!taa", name = "N", descriptor = "Lfba;")
    private class350 field6523;

    @OriginalMember(owner = "client!taa", name = "u", descriptor = "Lcba;")
    private class54 field6505;

    @OriginalMember(owner = "client!taa", name = "v", descriptor = "Lcba;")
    private class54 field6506;

    @OriginalMember(owner = "client!taa", name = "y", descriptor = "Lcba;")
    private class54 field6509;

    @OriginalMember(owner = "client!taa", name = "C", descriptor = "Lcba;")
    private class54 field6513;

    @OriginalMember(owner = "client!taa", name = "x", descriptor = "Leba;")
    private class665 field6508;

    @OriginalMember(owner = "client!taa", name = "E", descriptor = "Leba;")
    private class665 field6515;

    @OriginalMember(owner = "client!taa", name = "I", descriptor = "[Lfba;")
    private class350[] field6518;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lrea;II)V")
    public static final void method2858(class121 arg0, int arg1, int arg2) {
        if (arg2 < -35) {
            ++field6517;
            if (class331.field4701) {
                class331.field4701 = false;
                arg1 = 0;
            }
            if (class341.field4820 == null || !class341.field4820.method751(-15667, arg0)) {
                class341.field4820 = arg0;
                class211.field2788 = class97.method664((byte) -50);
                class206.field2703 = arg1;
                class508.field7057 = arg1;
                if (~class508.field7057 != -1) {
                    class416.field5890 = class605.field8176;
                    class299.field4238 = class707.field9850;
                    class625.field8411 = class523.field7273;
                    class258.field3734 = class612.field8224;
                    class581.field7954 = class196.field2634;
                    class385.field5532 = class416.field5889;
                    class158.field2214 = class243.field3616;
                    class625.field8416 = class316.field4379;
                    class453.field6271 = class156.field2196;
                    class22.field267 = class66.field1025;
                    return;
                }
                class746.method4153((byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)Z")
    public final boolean method1324(boolean arg0) {
        ++field6521;
        if (!arg0) {
            this.method1332((class350) null, 102, (class350) null, -55);
        }
        if (super.field3016.field9108 && super.field3016.field9058 && super.field3016.field9141) {
            this.field6508 = new class665(super.field3016);
            this.field6510 = new class350(super.field3016, 3553, 34842, 256, 256);
            this.field6510.method2230(3314, false, false);
            this.field6523 = new class350(super.field3016, 3553, 34842, 256, 256);
            this.field6523.method2230(3314, false, false);
            super.field3016.method3695(this.field6508, -17015);
            this.field6508.method3765(0, (byte) -67, this.field6510);
            this.field6508.method3765(1, (byte) -114, this.field6523);
            this.field6508.method3761(0, -1);
            if (!this.field6508.method3755(0)) {
                super.field3016.method3694(this.field6508, (byte) -117);
                return false;
            } else {
                super.field3016.method3694(this.field6508, (byte) -97);
                this.field6509 = class651.method3644(new class193[] { class694.method3921(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 0, super.field3016) }, super.field3016, (byte) 84);
                this.field6506 = class651.method3644(new class193[] { class694.method3921(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 0, super.field3016) }, super.field3016, (byte) 84);
                this.field6513 = class651.method3644(new class193[] { class694.method3921(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 0, super.field3016) }, super.field3016, (byte) 84);
                this.field6505 = class651.method3644(new class193[] { class694.method3921(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 0, super.field3016) }, super.field3016, (byte) 84);
                return this.field6506 != null && this.field6509 != null && this.field6513 != null && this.field6505 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)V")
    public final void method1330(int arg0, int arg1) {
        ++field6522;
        if (arg1 < 42) {
            this.field6519 = -124;
        }
        OpenGL.glUseProgramObjectARB(0L);
        super.field3016.method3738((byte) -63, 1);
        super.field3016.method3681((class559) null, 0);
        super.field3016.method3738((byte) -63, 0);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BII)V")
    public final void method1327(byte arg0, int arg1, int arg2) {
        ++field6525;
        this.field6504 = arg2;
        if (arg0 == 117) {
            this.field6520 = arg1;
            int var4 = class375.method2354(this.field6520, (byte) -105);
            int var5 = class375.method2354(this.field6504, (byte) 102);
            if (this.field6514 != var4 || this.field6519 != var5) {
                if (this.field6518 != null) {
                    for (int var6 = 0; this.field6518.length > var6; ++var6) {
                        this.field6518[var6].method3288(-36);
                    }
                    this.field6518 = null;
                }
                if (var4 <= 256 && var5 <= 256) {
                    this.field6515 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field6515 == null) {
                        this.field6515 = new class665(super.field3016);
                    }
                    label58: while (true) {
                        if (~var7 >= -257 && var8 <= 256) {
                            this.field6518 = new class350[var9];
                            int var10 = var4;
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (var10 <= 256 && ~var11 >= -257) {
                                    break label58;
                                }
                                this.field6518[var12++] = new class350(super.field3016, 3553, 34842, var10, var11);
                                if (var11 > 256) {
                                    var11 >>= 1;
                                }
                                if (~var10 < -257) {
                                    var10 >>= 1;
                                }
                            }
                        }
                        if (var8 > 256) {
                            var8 >>= 1;
                        }
                        ++var9;
                        if (~var7 < -257) {
                            var7 >>= 1;
                        }
                    }
                }
                this.field6514 = var4;
                this.field6519 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "(Z)I")
    public final int method1328(boolean arg0) {
        if (!arg0) {
            return 109;
        } else {
            ++field6516;
            return 1;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
    public final void method1325(int arg0) {
        ++field6503;
        this.field6518 = null;
        this.field6505 = null;
        this.field6509 = null;
        this.field6510 = null;
        this.field6513 = null;
        if (arg0 != 9617) {
            this.method2861((byte) -119);
        }
        this.field6506 = null;
        this.field6523 = null;
        this.field6515 = null;
        this.field6508 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lfba;ILfba;I)V")
    public final void method1332(class350 arg0, int arg1, class350 arg2, int arg3) {
        ++field6512;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6518 == null) {
            super.field3016.method3681(arg0, arg3 ^ -19460);
            super.field3016.method3695(this.field6508, -17015);
            this.field6508.method3761(0, -1);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field6509.field777;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), client.field6238, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6520, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6520, (float) this.field6504);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6504);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field3016.method3695(this.field6515, -17015);
            int var7 = class375.method2354(this.field6520, (byte) -8);
            int var8 = class375.method2354(this.field6504, (byte) 92);
            int var9 = 0;
            while (~var7 < -257 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field6515.method3765(0, (byte) -83, this.field6518[var9]);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (var8 > 256) {
                    var8 >>= 1;
                }
                if (~var9 != -1) {
                    super.field3016.method3681(this.field6518[var9 + -1], 0);
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
                    super.field3016.method3681(arg0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6520, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6520, (float) this.field6504);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6504);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var9;
            }
            super.field3016.method3694(this.field6515, (byte) -108);
            super.field3016.method3681(this.field6518[var9 + -1], arg3 ^ -19460);
            super.field3016.method3695(this.field6508, -17015);
            this.field6508.method3761(0, arg3 ^ 19459);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6506.field777;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), client.field6238, 0.0F, 0.0F);
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
        this.field6508.method3761(1, -1);
        super.field3016.method3681(this.field6510, arg3 ^ arg3);
        long var12 = this.field6505.field777;
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
        this.field6508.method3761(0, arg3 ^ 19459);
        super.field3016.method3681(this.field6523, 0);
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
        super.field3016.method3694(this.field6508, (byte) -83);
        long var14 = this.field6513.field777;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class279.field4065, class248.field3644, 0.0F);
        super.field3016.method3738((byte) -63, 1);
        super.field3016.method3681(this.field6510, 0);
        super.field3016.method3738((byte) -63, 0);
        super.field3016.method3681(arg0, 0);
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Ldw;)V")
    public class469(class664 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Luu;ZLrp;)V")
    public static final void method2859(class237 arg0, boolean arg1, class135 arg2) {
        class268.field3921 = arg2;
        ++field6511;
        if (arg1) {
            class508.field7054 = arg0;
            class539.field7483 = "";
            if (class47.field612.startsWith("win")) {
                class539.field7483 = class539.field7483 + "windows/";
            } else if (!class47.field612.startsWith("linux")) {
                if (class47.field612.startsWith("mac")) {
                    class539.field7483 = class539.field7483 + "macos/";
                }
            } else {
                class539.field7483 = class539.field7483 + "linux/";
            }
            if (class268.field3921.field1929) {
                class539.field7483 = class539.field7483 + "msjava/";
            } else if (!class47.field624.startsWith("amd64") && !class47.field624.startsWith("x86_64")) {
                if (!class47.field624.startsWith("i386") && !class47.field624.startsWith("i486") && !class47.field624.startsWith("i586") && !class47.field624.startsWith("x86")) {
                    if (class47.field624.startsWith("ppc")) {
                        class539.field7483 = class539.field7483 + "ppc/";
                    } else {
                        class539.field7483 = class539.field7483 + "universal/";
                    }
                } else {
                    class539.field7483 = class539.field7483 + "x86/";
                }
            } else {
                class539.field7483 = class539.field7483 + "x86_64/";
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "(I)Z")
    public final boolean method1331(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field6507;
            return this.field6508 != null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "([Luv;BI)V")
    public static final void method2860(class755[] arg0, byte arg1, int arg2) {
        if (arg1 == 119) {
            for (int var3 = 0; ~var3 > ~arg0.length; ++var3) {
                class755 var4 = arg0[var3];
                if (var4 != null) {
                    if (var4.field10416 == 0) {
                        if (var4.field10503 != null) {
                            method2860(var4.field10503, (byte) 119, arg2);
                        }
                        class654 var5 = (class654) class259.field3747.method812(126, (long) var4.field10445);
                        if (var5 != null) {
                            class667.method3767(var5.field8745, arg2, 4626);
                        }
                    }
                    if (~arg2 == -1 && var4.field10424 != null) {
                        class142 var6 = new class142();
                        var6.field2024 = var4.field10424;
                        var6.field2020 = var4;
                        class546.method3233(var6);
                    }
                    if (arg2 == 1 && var4.field10536 != null) {
                        if (var4.field10469 >= 0) {
                            class755 var7 = class189.method1182(var4.field10445, (byte) -101);
                            if (var7 == null || var7.field10503 == null || ~var7.field10503.length >= ~var4.field10469 || var7.field10503[var4.field10469] != var4) {
                                continue;
                            }
                        }
                        class142 var8 = new class142();
                        var8.field2020 = var4;
                        var8.field2024 = var4.field10536;
                        class546.method3233(var8);
                    }
                }
            }
            ++field6524;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)Z")
    public final boolean method2861(byte arg0) {
        ++field6502;
        if (arg0 != -71) {
            this.field6506 = null;
        }
        return super.field3016.field9108 && super.field3016.field9058 && super.field3016.field9141;
    }
}
