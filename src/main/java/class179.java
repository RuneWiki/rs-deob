import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class179 extends class11 {

    @OriginalMember(owner = "client!up", name = "Y", descriptor = "[I")
    public static int[] field2721 = new int[1];

    @OriginalMember(owner = "client!up", name = "U", descriptor = "Lgf;")
    public static class180 field2718 = new class180("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!up", name = "gb", descriptor = "Lgf;")
    public static class180 field2729 = new class180("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    private int field2707;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!up", name = "T", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!up", name = "X", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!up", name = "Z", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!up", name = "ab", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!up", name = "bb", descriptor = "I")
    private int field2724;

    @OriginalMember(owner = "client!up", name = "cb", descriptor = "I")
    private int field2725;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "Lbb;")
    private class217 field2705;

    @OriginalMember(owner = "client!up", name = "W", descriptor = "Lbb;")
    private class217 field2719;

    @OriginalMember(owner = "client!up", name = "db", descriptor = "Ljp;")
    private class236 field2726;

    @OriginalMember(owner = "client!up", name = "fb", descriptor = "Ljp;")
    private class236 field2728;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "Lv;")
    private class406 field2706;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "Lv;")
    private class406 field2712;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "Lv;")
    private class406 field2714;

    @OriginalMember(owner = "client!up", name = "eb", descriptor = "Lv;")
    private class406 field2727;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "[Ljp;")
    private class236[] field2704;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V", line = 3)
    public final void method87(int arg0, int arg1) {
        ++field2717;
        OpenGL.glUseProgramObjectARB(0L);
        if (arg0 <= 64) {
            this.field2706 = null;
        }
        super.field190.method2030(1, (byte) 91);
        super.field190.method2042((class440) null, 0);
        super.field190.method2030(0, (byte) -126);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IBI)V", line = 24)
    public final void method86(int arg0, byte arg1, int arg2) {
        this.field2724 = arg0;
        this.field2725 = arg2;
        ++field2708;
        int var4 = class466.method2780(68, this.field2724);
        int var5 = class466.method2780(125, this.field2725);
        if (arg1 >= 18) {
            if (this.field2722 != var4 || this.field2707 != var5) {
                if (this.field2704 != null) {
                    for (int var6 = 0; ~this.field2704.length < ~var6; ++var6) {
                        this.field2704[var6].method2670(2957);
                    }
                    this.field2704 = null;
                }
                if (~var4 >= -257 && ~var5 >= -257) {
                    this.field2705 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field2705 == null) {
                        this.field2705 = new class217(super.field190);
                    }
                    label57: while (true) {
                        if (~var7 >= -257 && ~var8 >= -257) {
                            int var10 = var5;
                            this.field2704 = new class236[var9];
                            int var11 = var4;
                            int var12 = 0;
                            while (true) {
                                if (var11 <= 256 && var10 <= 256) {
                                    break label57;
                                }
                                this.field2704[var12++] = new class236(super.field190, 3553, 34842, var11, var10);
                                if (~var11 < -257) {
                                    var11 >>= 1;
                                }
                                if (var10 > 256) {
                                    var10 >>= 1;
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
                this.field2722 = var4;
                this.field2707 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)Z", line = 103)
    public final boolean method90(int arg0) {
        ++field2710;
        if (arg0 <= 95) {
            this.method91((class236) null, 13, (class236) null, 5);
        }
        if (super.field190.field4836 && super.field190.field4831 && super.field190.field4848) {
            this.field2719 = new class217(super.field190);
            this.field2726 = new class236(super.field190, 3553, 34842, 256, 256);
            this.field2726.method1534(false, 112, false);
            this.field2728 = new class236(super.field190, 3553, 34842, 256, 256);
            this.field2728.method1534(false, 113, false);
            super.field190.method2036((byte) 106, this.field2719);
            this.field2719.method1449((byte) 77, this.field2726, 0);
            this.field2719.method1449((byte) -100, this.field2728, 1);
            this.field2719.method1430(-126, 0);
            if (!this.field2719.method1444(-126)) {
                super.field190.method2060((byte) -54, this.field2719);
                return false;
            } else {
                super.field190.method2060((byte) -54, this.field2719);
                this.field2727 = class410.method2538(1357486177, super.field190, new class279[] { class523.method3087(22476, 35632, super.field190, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field2714 = class410.method2538(1357486177, super.field190, new class279[] { class523.method3087(22476, 35632, super.field190, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field2712 = class410.method2538(1357486177, super.field190, new class279[] { class523.method3087(22476, 35632, super.field190, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
                this.field2706 = class410.method2538(1357486177, super.field190, new class279[] { class523.method3087(22476, 35632, super.field190, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
                return this.field2714 != null && this.field2727 != null && this.field2712 != null && this.field2706 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!up", name = "g", descriptor = "(I)Z", line = 139)
    public final boolean method1268(int arg0) {
        ++field2709;
        if (arg0 >= -76) {
            field2711 = 80;
        }
        return super.field190.field4836 && super.field190.field4831 && super.field190.field4848;
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)Z", line = 150)
    public final boolean method92(int arg0) {
        ++field2715;
        if (arg0 != 1) {
            return false;
        } else {
            return this.field2719 != null;
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lqg;)V", line = 162)
    public class179(class321 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Ljp;ILjp;I)V", line = 171)
    public final void method91(class236 arg0, int arg1, class236 arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field2720;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2704 != null) {
            super.field190.method2036((byte) 110, this.field2705);
            int var5 = class466.method2780(62, this.field2724);
            int var6 = class466.method2780(39, this.field2725);
            int var7 = 0;
            while (~var5 < -257 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field2705.method1449((byte) -113, this.field2704[var7], 0);
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (var7 == 0) {
                    super.field190.method2042(arg2, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field2724, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field2724, (float) this.field2725);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2725);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field190.method2042(this.field2704[var7 + -1], arg3 ^ -29608);
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
                if (var5 > 256) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field190.method2060((byte) -54, this.field2705);
            super.field190.method2042(this.field2704[var7 + -1], 0);
            super.field190.method2036((byte) 126, this.field2719);
            this.field2719.method1430(-124, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field2714.field5973;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class372.field5579, 0.0F, 0.0F);
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
            super.field190.method2042(arg2, arg3 ^ -29608);
            super.field190.method2036((byte) 126, this.field2719);
            this.field2719.method1430(-123, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field2727.field5973;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class372.field5579, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field2724, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field2724, (float) this.field2725);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field2725);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field2719.method1430(-117, 1);
        super.field190.method2042(this.field2726, arg3 + 29608);
        long var12 = this.field2706.field5973;
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
        this.field2719.method1430(-72, 0);
        super.field190.method2042(this.field2728, arg3 ^ -29608);
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
        super.field190.method2060((byte) -54, this.field2719);
        long var14 = this.field2712.field5973;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class186.field2767, class334.field5126, 0.0F);
        super.field190.method2030(1, (byte) 63);
        super.field190.method2042(this.field2726, 0);
        super.field190.method2030(0, (byte) -121);
        if (arg3 == -29608) {
            super.field190.method2042(arg2, 0);
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(Z)V", line = 326)
    public static void method1269(boolean arg0) {
        field2721 = null;
        if (arg0) {
            method1269(true);
        }
        field2729 = null;
        field2718 = null;
    }

    @OriginalMember(owner = "client!up", name = "f", descriptor = "(I)V", line = 339)
    public final void method95(int arg0) {
        this.field2714 = null;
        ++field2713;
        this.field2728 = null;
        this.field2705 = null;
        this.field2719 = null;
        int var2 = 120 % ((8 - arg0) / 54);
        this.field2706 = null;
        this.field2704 = null;
        this.field2726 = null;
        this.field2727 = null;
        this.field2712 = null;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)I", line = 358)
    public final int method88(int arg0) {
        if (arg0 != 24448) {
            method1271(106, (byte[][][]) null, 104, (byte) 76, 19, -8);
        }
        ++field2723;
        return 1;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)Z", line = 373)
    public static final boolean method1270(byte arg0, int arg1, int arg2) {
        if (arg0 < 11) {
            return false;
        } else {
            ++field2716;
            return ~(34 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I[[[BIBII)V", line = 392)
    public static final void method1271(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class12.field196;
        class389.field5755 = 0;
        for (int var6 = class272.field3938; var6 < class334.field5130; ++var6) {
            class165[][] var17 = class36.field545[var6];
            for (int var18 = class54.field792; var18 < class227.field3318; ++var18) {
                for (int var19 = class354.field5347; var19 < class172.field2576; ++var19) {
                    class165 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class298.field4257[var18 - class97.field1574 + class117.field1846][var19 - class105.field1653 + class117.field1846] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field2495 = false;
                            var20.field2492 = false;
                            var20.field2496 = 0;
                            if (var18 >= class97.field1574 - 16 && var18 <= class97.field1574 + 16 && var19 >= class105.field1653 - 16 && var19 <= class105.field1653 + 16 && (var20.field2480 != null || var20.field2484 != null || var20.field2482 != null || var20.field2493 != null || var20.field2487 != null || var20.field2490 != null)) {
                                class274.field3957.method2211(var20, (byte) -102);
                            }
                        } else {
                            var20.field2495 = true;
                            var20.field2492 = true;
                            if (var20.field2490 != null) {
                                var20.field2486 = true;
                            } else {
                                var20.field2486 = false;
                            }
                            ++class389.field5755;
                        }
                    }
                }
            }
        }
        boolean var7 = class62.field1063 == class529.field7807;
        for (int var8 = class272.field3938; var8 < class334.field5130; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class44.field675.method473() && var8 >= arg2 && arg1 != null) {
                int var10 = class298.field4257.length;
                if (class298.field4257.length + class54.field792 > class246.field3560) {
                    var10 -= class298.field4257.length + class54.field792 - class246.field3560;
                }
                int var11 = class298.field4257[0].length;
                if (class298.field4257[0].length + class354.field5347 > class254.field3675) {
                    var11 -= class298.field4257[0].length + class354.field5347 - class254.field3675;
                }
                int var12 = class311.field4450;
                while (true) {
                    if (var12 >= var10) {
                        class274.field3957.method2206(true, var9, (byte) -118, class529.field7807[var8], var8);
                        break;
                    }
                    int var13 = class54.field792 + var12 - class311.field4450;
                    for (int var14 = class85.field1425; var14 < var11; ++var14) {
                        class342.field5220[var12][var14] = false;
                        if (class298.field4257[var12][var14]) {
                            int var15 = class354.field5347 + var14 - class85.field1425;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (class36.field545[var16][var13][var15] != null && class36.field545[var16][var13][var15].field2475 == var8) {
                                    class342.field5220[var12][var14] = class36.field545[var16][var13][var15].field2495;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class274.field3957.method2206(false, var9, (byte) -80, class529.field7807[var8], var8);
            }
            class274.field3957.method2209((byte) -127);
        }
        if (!class148.method1061(true)) {
            class148.method1061(false);
        }
    }
}
