import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class27 extends class243 {

    @OriginalMember(owner = "client!qaa", name = "C", descriptor = "I")
    public static int field485 = 0;

    @OriginalMember(owner = "client!qaa", name = "B", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!qaa", name = "u", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!qaa", name = "v", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!qaa", name = "x", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!qaa", name = "y", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!qaa", name = "A", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!qaa", name = "F", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!qaa", name = "H", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!qaa", name = "I", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!qaa", name = "K", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!qaa", name = "M", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!qaa", name = "Q", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!qaa", name = "R", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!qaa", name = "S", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "Lbq;")
    private class293 field482;

    @OriginalMember(owner = "client!qaa", name = "G", descriptor = "Lbq;")
    private class293 field488;

    @OriginalMember(owner = "client!qaa", name = "w", descriptor = "Lit;")
    private class648 field479;

    @OriginalMember(owner = "client!qaa", name = "N", descriptor = "Lit;")
    private class648 field494;

    @OriginalMember(owner = "client!qaa", name = "O", descriptor = "Lit;")
    private class648 field495;

    @OriginalMember(owner = "client!qaa", name = "P", descriptor = "Lit;")
    private class648 field496;

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "Lmj;")
    private class656 field475;

    @OriginalMember(owner = "client!qaa", name = "L", descriptor = "Lmj;")
    private class656 field492;

    @OriginalMember(owner = "client!qaa", name = "E", descriptor = "[Lbq;")
    private class293[] field486;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)Z")
    public final boolean method182(int arg0) {
        ++field481;
        if (super.field3146.field6861 && super.field3146.field6888 && super.field3146.field6901) {
            this.field492 = new class656(super.field3146);
            this.field488 = new class293(super.field3146, 3553, 34842, 256, 256);
            this.field488.method1756(false, false, 104);
            this.field482 = new class293(super.field3146, 3553, 34842, 256, 256);
            this.field482.method1756(false, false, 38);
            super.field3146.method2815((byte) 101, this.field492);
            this.field492.method3700(-107, 0, this.field488);
            this.field492.method3700(-110, 1, this.field482);
            this.field492.method3693(0, 0);
            if (!this.field492.method3702(-24937)) {
                super.field3146.method2851(-128, this.field492);
                return false;
            } else {
                super.field3146.method2851(102, this.field492);
                this.field494 = class616.method3445((byte) -96, super.field3146, new class584[] { class711.method3976(super.field3146, (byte) -68, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field479 = class616.method3445((byte) -96, super.field3146, new class584[] { class711.method3976(super.field3146, (byte) 119, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field495 = class616.method3445((byte) -96, super.field3146, new class584[] { class711.method3976(super.field3146, (byte) -115, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
                this.field496 = class616.method3445((byte) -96, super.field3146, new class584[] { class711.method3976(super.field3146, (byte) 125, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
                return this.field479 != null && this.field494 != null && this.field495 != null && this.field496 != null;
            }
        } else {
            if (arg0 <= 64) {
                this.field495 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILbq;ILbq;)V")
    public final void method183(int arg0, class293 arg1, int arg2, class293 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field477;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field486 == null) {
            super.field3146.method2850(-118, arg3);
            super.field3146.method2815((byte) 121, this.field492);
            this.field492.method3693(0, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field494.field8964;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class705.field9774, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field476, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field476, (float) this.field483);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field483);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field3146.method2815((byte) 46, this.field475);
            int var7 = class113.method890(this.field476, 2094889633);
            int var8 = class113.method890(this.field483, 2094889633);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field475.method3700(-96, 0, this.field486[var9]);
                if (~var7 < -257) {
                    var7 >>= 1;
                }
                if (~var9 == -1) {
                    super.field3146.method2850(77, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field476, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field476, (float) this.field483);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field483);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field3146.method2850(-124, this.field486[var9 - 1]);
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
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                ++var9;
            }
            super.field3146.method2851(-127, this.field475);
            super.field3146.method2850(124, this.field486[var9 - 1]);
            super.field3146.method2815((byte) 24, this.field492);
            this.field492.method3693(0, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field479.field8964;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class705.field9774, 0.0F, 0.0F);
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
        this.field492.method3693(0, 1);
        super.field3146.method2850(-45, this.field488);
        long var12 = this.field496.field8964;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        if (arg0 >= 29) {
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            this.field492.method3693(0, 0);
            super.field3146.method2850(-110, this.field482);
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
            super.field3146.method2851(122, this.field492);
            long var14 = this.field495.field8964;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class639.field8838, class386.field4929, 0.0F);
            super.field3146.method2847(1, false);
            super.field3146.method2850(93, this.field488);
            super.field3146.method2847(0, false);
            super.field3146.method2850(-46, arg3);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)Z")
    public final boolean method184(int arg0) {
        ++field498;
        int var2 = -72 % ((arg0 - -7) / 51);
        return this.field492 != null;
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lbi;)V")
    public class27(class483 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "(I)Z")
    public final boolean method185(int arg0) {
        if (arg0 > -123) {
            field491 = -99;
        }
        ++field480;
        return super.field3146.field6861 && super.field3146.field6888 && super.field3146.field6901;
    }

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)V")
    public final void method186(int arg0) {
        this.field488 = null;
        this.field494 = null;
        if (arg0 == -12047) {
            this.field475 = null;
            this.field479 = null;
            this.field492 = null;
            this.field495 = null;
            this.field486 = null;
            ++field487;
            this.field496 = null;
            this.field482 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "(B)I")
    public final int method187(byte arg0) {
        ++field499;
        if (arg0 != 13) {
            this.method186(48);
        }
        return 1;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IB)V")
    public final void method188(int arg0, byte arg1) {
        ++field497;
        OpenGL.glUseProgramObjectARB(0L);
        super.field3146.method2847(1, false);
        super.field3146.method2850(arg1 + -217, (class695) null);
        if (arg1 != 121) {
            this.field488 = null;
        }
        super.field3146.method2847(0, false);
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(III)V")
    public final void method189(int arg0, int arg1, int arg2) {
        ++field478;
        if (arg1 != 0) {
            field485 = 114;
        }
        this.field476 = arg2;
        this.field483 = arg0;
        int var4 = class113.method890(this.field476, 2094889633);
        int var5 = class113.method890(this.field483, arg1 + 2094889633);
        if (this.field490 != var4 || this.field493 != var5) {
            if (this.field486 != null) {
                for (int var6 = 0; ~var6 > ~this.field486.length; ++var6) {
                    this.field486[var6].method3895(55);
                }
                this.field486 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field475 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field475 == null) {
                    this.field475 = new class656(super.field3146);
                }
                label59: while (true) {
                    if (var7 <= 256 && ~var8 >= -257) {
                        int var10 = var5;
                        this.field486 = new class293[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && var10 <= 256) {
                                break label59;
                            }
                            this.field486[var12++] = new class293(super.field3146, 3553, 34842, var11, var10);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
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
            this.field493 = var5;
            this.field490 = var4;
        }
    }
}
