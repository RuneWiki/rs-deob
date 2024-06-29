import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class10 extends class548 {

    @OriginalMember(owner = "client!tu", name = "U", descriptor = "Z")
    public static boolean field110 = false;

    @OriginalMember(owner = "client!tu", name = "T", descriptor = "Lpca;")
    public static class362 field109 = new class362();

    @OriginalMember(owner = "client!tu", name = "X", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!tu", name = "W", descriptor = "Liu;")
    public static class517 field112 = new class517(9, -2);

    @OriginalMember(owner = "client!tu", name = "Y", descriptor = "[I")
    public static int[] field114 = new int[1000];

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "F")
    public static float field100;

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!tu", name = "S", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!tu", name = "V", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!tu", name = "D", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!tu", name = "E", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client!tu", name = "F", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!tu", name = "H", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!tu", name = "Q", descriptor = "Lfs;")
    private class353 field106;

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "Lfs;")
    private class353 field89;

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "Lhp;")
    private class355 field102;

    @OriginalMember(owner = "client!tu", name = "C", descriptor = "Lhp;")
    private class355 field93;

    @OriginalMember(owner = "client!tu", name = "M", descriptor = "Lvv;")
    private class640 field103;

    @OriginalMember(owner = "client!tu", name = "N", descriptor = "Lvv;")
    private class640 field104;

    @OriginalMember(owner = "client!tu", name = "O", descriptor = "Lvv;")
    private class640 field105;

    @OriginalMember(owner = "client!tu", name = "G", descriptor = "Lvv;")
    private class640 field97;

    @OriginalMember(owner = "client!tu", name = "R", descriptor = "[Lhp;")
    private class355[] field107;

    @OriginalMember(owner = "client!tu", name = "Z", descriptor = "[Ljp;")
    public static class74[] field115;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 6)
    public final void method49(int arg0) {
        this.field107 = null;
        this.field93 = null;
        ++field90;
        this.field97 = null;
        this.field102 = null;
        this.field106 = null;
        this.field103 = null;
        this.field105 = null;
        this.field104 = null;
        this.field89 = null;
        if (arg0 > -121) {
            this.method51(-25, (class355) null, true, (class355) null);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Z", line = 27)
    public final boolean method50(boolean arg0) {
        ++field98;
        if (arg0) {
            this.method52(16);
        }
        return this.field89 != null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILhp;ZLhp;)V", line = 38)
    public final void method51(int arg0, class355 arg1, boolean arg2, class355 arg3) {
        ++field92;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field107 == null) {
            super.field7619.method648(-56, arg3);
            super.field7619.method539(this.field89, arg2);
            this.field89.method2137(-25469, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field104.field9286;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class529.field7355, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field95, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field95, (float) this.field87);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field87);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field7619.method539(this.field106, true);
            int var7 = class19.method216(this.field95, (byte) -91);
            int var8 = class19.method216(this.field87, (byte) 18);
            int var9 = 0;
            while (var7 > 256 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field106.method2144((byte) 50, this.field107[var9], 0);
                if (var9 == 0) {
                    super.field7619.method648(92, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field95, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field95, (float) this.field87);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field87);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field7619.method648(68, this.field107[var9 + -1]);
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
                if (~var7 < -257) {
                    var7 >>= 1;
                }
                ++var9;
            }
            super.field7619.method564((byte) 101, this.field106);
            super.field7619.method648(-51, this.field107[var9 + -1]);
            super.field7619.method539(this.field89, true);
            this.field89.method2137(-25469, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field103.field9286;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class529.field7355, 0.0F, 0.0F);
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
        this.field89.method2137(-25469, 1);
        super.field7619.method648(104, this.field93);
        long var12 = this.field105.field9286;
        if (arg2) {
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
            this.field89.method2137(-25469, 0);
            super.field7619.method648(-44, this.field102);
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
            super.field7619.method564((byte) 45, this.field89);
            long var14 = this.field97.field9286;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class297.field4268, class520.field7232, 0.0F);
            super.field7619.method654(false, 1);
            super.field7619.method648(72, this.field93);
            super.field7619.method654(false, 0);
            super.field7619.method648(-60, arg3);
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Ljj;)V", line = 195)
    public class10(class66 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "(I)Z", line = 202)
    public final boolean method52(int arg0) {
        ++field91;
        if (arg0 != 1) {
            field100 = 1.0718976F;
        }
        return super.field7619.field1201 && super.field7619.field1167 && super.field7619.field1216;
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)Z", line = 213)
    public final boolean method53(int arg0) {
        if (arg0 != 35632) {
            return true;
        } else {
            ++field88;
            if (super.field7619.field1201 && super.field7619.field1167 && super.field7619.field1216) {
                this.field89 = new class353(super.field7619);
                this.field93 = new class355(super.field7619, 3553, 34842, 256, 256);
                this.field93.method2163(arg0 ^ 35589, false, false);
                this.field102 = new class355(super.field7619, 3553, 34842, 256, 256);
                this.field102.method2163(121, false, false);
                super.field7619.method539(this.field89, true);
                this.field89.method2144((byte) 50, this.field93, 0);
                this.field89.method2144((byte) 50, this.field102, 1);
                this.field89.method2137(arg0 ^ -59469, 0);
                if (!this.field89.method2141(-36054)) {
                    super.field7619.method564((byte) 120, this.field89);
                    return false;
                } else {
                    super.field7619.method564((byte) 64, this.field89);
                    this.field104 = class626.method3551(new class119[] { class20.method223(35632, super.field7619, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", true) }, arg0 + -35519, super.field7619);
                    this.field103 = class626.method3551(new class119[] { class20.method223(35632, super.field7619, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", true) }, 123, super.field7619);
                    this.field97 = class626.method3551(new class119[] { class20.method223(35632, super.field7619, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", true) }, 122, super.field7619);
                    this.field105 = class626.method3551(new class119[] { class20.method223(35632, super.field7619, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", true) }, 119, super.field7619);
                    return this.field103 != null && this.field104 != null && this.field97 != null && this.field105 != null;
                }
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBI)V", line = 250)
    public final void method54(int arg0, byte arg1, int arg2) {
        this.field95 = arg2;
        ++field96;
        this.field87 = arg0;
        int var4 = class19.method216(this.field95, (byte) -111);
        if (arg1 != -88) {
            method55(false);
        }
        int var5 = class19.method216(this.field87, (byte) 126);
        if (this.field101 != var4 || ~this.field108 != ~var5) {
            if (this.field107 != null) {
                for (int var6 = 0; this.field107.length > var6; ++var6) {
                    this.field107[var6].method1482((byte) -77);
                }
                this.field107 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field106 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label61: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        if (this.field106 == null) {
                            this.field106 = new class353(super.field7619);
                        }
                        this.field107 = new class355[var9];
                        int var10 = var5;
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && var10 <= 256) {
                                break label61;
                            }
                            this.field107[var12++] = new class355(super.field7619, 3553, 34842, var11, var10);
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
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field108 = var5;
            this.field101 = var4;
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(Z)V", line = 331)
    public static void method55(boolean arg0) {
        if (arg0) {
            field100 = 0.98314315F;
        }
        field114 = null;
        field112 = null;
        field109 = null;
        field115 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V", line = 346)
    public final void method56(int arg0, int arg1) {
        ++field94;
        OpenGL.glUseProgramObjectARB(0L);
        if (arg1 >= -127) {
            field112 = null;
        }
        super.field7619.method654(false, 1);
        super.field7619.method648(-78, (class222) null);
        super.field7619.method654(false, 0);
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(Z)I", line = 360)
    public final int method57(boolean arg0) {
        ++field99;
        if (arg0) {
            this.field105 = null;
        }
        return 1;
    }
}
