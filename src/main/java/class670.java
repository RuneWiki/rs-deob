import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class670 extends class200 {

    @OriginalMember(owner = "client!nia", name = "L", descriptor = "F")
    public static float field8989;

    @OriginalMember(owner = "client!nia", name = "v", descriptor = "I")
    private int field8973;

    @OriginalMember(owner = "client!nia", name = "x", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!nia", name = "y", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!nia", name = "B", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!nia", name = "C", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!nia", name = "D", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!nia", name = "E", descriptor = "I")
    private int field8982;

    @OriginalMember(owner = "client!nia", name = "F", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!nia", name = "I", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!nia", name = "N", descriptor = "I")
    private int field8991;

    @OriginalMember(owner = "client!nia", name = "P", descriptor = "I")
    private int field8993;

    @OriginalMember(owner = "client!nia", name = "Q", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!nia", name = "R", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!nia", name = "T", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!nia", name = "A", descriptor = "Lgw;")
    private class182 field8978;

    @OriginalMember(owner = "client!nia", name = "H", descriptor = "Lgw;")
    private class182 field8985;

    @OriginalMember(owner = "client!nia", name = "K", descriptor = "Lgw;")
    private class182 field8988;

    @OriginalMember(owner = "client!nia", name = "M", descriptor = "Lgw;")
    private class182 field8990;

    @OriginalMember(owner = "client!nia", name = "w", descriptor = "Lrba;")
    private class456 field8974;

    @OriginalMember(owner = "client!nia", name = "J", descriptor = "Lrba;")
    private class456 field8987;

    @OriginalMember(owner = "client!nia", name = "u", descriptor = "Lgea;")
    private class82 field8972;

    @OriginalMember(owner = "client!nia", name = "G", descriptor = "Lgea;")
    private class82 field8984;

    @OriginalMember(owner = "client!nia", name = "O", descriptor = "[Lrba;")
    private class456[] field8992;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)I")
    public final int method1309(byte arg0) {
        ++field8994;
        int var2 = 11 % ((9 - arg0) / 43);
        return 1;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(Z)Z")
    public final boolean method1318(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field8995;
            return this.field8972 != null;
        }
    }

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "(I)Z")
    public final boolean method3696(int arg0) {
        if (arg0 != 256) {
            return false;
        } else {
            ++field8975;
            return super.field2598.field3652 && super.field2598.field3589 && super.field2598.field3601;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIB)V")
    public final void method1307(int arg0, int arg1, byte arg2) {
        this.field8993 = arg0;
        this.field8973 = arg1;
        ++field8996;
        int var4 = class263.method1773(32051, this.field8993);
        if (arg2 < -25) {
            int var5 = class263.method1773(32051, this.field8973);
            if (this.field8982 != var4 || this.field8991 != var5) {
                if (this.field8992 != null) {
                    for (int var6 = 0; this.field8992.length > var6; ++var6) {
                        this.field8992[var6].method1341(true);
                    }
                    this.field8992 = null;
                }
                if (var4 <= 256 && ~var5 >= -257) {
                    this.field8984 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field8984 == null) {
                        this.field8984 = new class82(super.field2598);
                    }
                    label60: while (true) {
                        if (var7 <= 256 && ~var8 >= -257) {
                            int var10 = var5;
                            int var11 = var4;
                            this.field8992 = new class456[var9];
                            int var12 = 0;
                            while (true) {
                                if (var11 <= 256 && var10 <= 256) {
                                    break label60;
                                }
                                this.field8992[var12++] = new class456(super.field2598, 3553, 34842, var11, var10);
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
                        if (var7 > 256) {
                            var7 >>= 1;
                        }
                        ++var9;
                    }
                }
                this.field8991 = var5;
                this.field8982 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Llf;)V")
    public class670(class250 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)V")
    public final void method1317(int arg0, int arg1) {
        ++field8981;
        OpenGL.glUseProgramObjectARB((long) arg1);
        super.field2598.method1631(1, -78);
        super.field2598.method1595((byte) 73, (class205) null);
        super.field2598.method1631(0, arg1 + 107);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lrba;Lrba;II)V")
    public final void method1308(class456 arg0, class456 arg1, int arg2, int arg3) {
        ++field8983;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field8992 == null) {
            super.field2598.method1595((byte) 107, arg0);
            super.field2598.method1594(this.field8972, (byte) -52);
            this.field8972.method669(true, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field8990.field2391;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class501.field7017, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field8993, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field8993, (float) this.field8973);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field8973);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field2598.method1594(this.field8984, (byte) -64);
            int var7 = class263.method1773(32051, this.field8993);
            int var8 = class263.method1773(32051, this.field8973);
            int var9 = 0;
            while (var7 > 256 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field8984.method655(arg2 ^ -334, 0, this.field8992[var9]);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (~var9 != -1) {
                    super.field2598.method1595((byte) 80, this.field8992[var9 + -1]);
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
                    super.field2598.method1595((byte) 109, arg0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field8993, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field8993, (float) this.field8973);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8973);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var8 > 256) {
                    var8 >>= 1;
                }
                ++var9;
            }
            super.field2598.method1567(this.field8984, arg2 + 136);
            super.field2598.method1595((byte) 81, this.field8992[var9 - 1]);
            super.field2598.method1594(this.field8972, (byte) -33);
            this.field8972.method669(true, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field8988.field2391;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class501.field7017, 0.0F, 0.0F);
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
        this.field8972.method669(true, 1);
        super.field2598.method1595((byte) 74, this.field8974);
        long var12 = this.field8985.field2391;
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
        this.field8972.method669(true, 0);
        super.field2598.method1595((byte) 79, this.field8987);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        if (arg2 == -257) {
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
            super.field2598.method1567(this.field8972, -106);
            long var14 = this.field8978.field2391;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class573.field7816, class425.field6186, 0.0F);
            super.field2598.method1631(1, 93);
            super.field2598.method1595((byte) 73, this.field8974);
            super.field2598.method1631(0, -112);
            super.field2598.method1595((byte) 96, arg0);
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3697(boolean arg0, int arg1) {
        ++field8979;
        if (arg0) {
            field8989 = 0.05577572F;
        }
        return ~arg1 == -3 || ~arg1 == -4;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)Z")
    public final boolean method1312(int arg0) {
        ++field8986;
        if (super.field2598.field3652 && super.field2598.field3589 && super.field2598.field3601) {
            this.field8972 = new class82(super.field2598);
            this.field8974 = new class456(super.field2598, 3553, 34842, 256, 256);
            this.field8974.method2708((byte) -126, false, false);
            this.field8987 = new class456(super.field2598, 3553, 34842, 256, 256);
            this.field8987.method2708((byte) -126, false, false);
            super.field2598.method1594(this.field8972, (byte) -102);
            this.field8972.method655(106, 0, this.field8974);
            this.field8972.method655(arg0 + -9102, 1, this.field8987);
            this.field8972.method669(true, 0);
            if (!this.field8972.method670(true)) {
                super.field2598.method1567(this.field8972, -84);
                return false;
            } else {
                super.field2598.method1567(this.field8972, -121);
                this.field8990 = class40.method231(new class440[] { class498.method2925(super.field2598, (byte) 39, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, (byte) -7, super.field2598);
                this.field8988 = class40.method231(new class440[] { class498.method2925(super.field2598, (byte) 62, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, (byte) -7, super.field2598);
                this.field8978 = class40.method231(new class440[] { class498.method2925(super.field2598, (byte) 105, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, (byte) -7, super.field2598);
                this.field8985 = class40.method231(new class440[] { class498.method2925(super.field2598, (byte) 124, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, (byte) -7, super.field2598);
                return this.field8988 != null && this.field8990 != null && this.field8978 != null && this.field8985 != null;
            }
        } else {
            if (arg0 != 9216) {
                this.method1309((byte) -55);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V")
    public final void method1310(int arg0) {
        ++field8977;
        this.field8987 = null;
        this.field8990 = null;
        this.field8984 = null;
        this.field8985 = null;
        this.field8992 = null;
        this.field8974 = null;
        if (arg0 == -23544) {
            this.field8988 = null;
            this.field8978 = null;
            this.field8972 = null;
        }
    }

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "(I)V")
    public static final void method3698(int arg0) {
        class15.field148 = -1;
        ++field8976;
        class8.field70 = 0;
        class302.field4242 = -1;
        class514.field7151 = arg0;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(II)I")
    public static int method3699(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
