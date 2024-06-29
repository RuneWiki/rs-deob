import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class169 extends class403 {

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lpt;")
    public static class529 field1881 = new class529();

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "[I")
    public static int[] field1892 = new int[2];

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "[I")
    public static int[] field1894 = new int[5];

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    private int field1884;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    private int field1896;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    private int field1904;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "Ler;")
    private class106 field1890;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Ler;")
    private class106 field1895;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lrda;")
    private class660 field1882;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lrda;")
    private class660 field1887;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Lrda;")
    private class660 field1888;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "Lrda;")
    private class660 field1898;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "Lwn;")
    private class720 field1902;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lwn;")
    private class720 field1907;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "[Lwn;")
    private class720[] field1905;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)Z")
    public final boolean method1045(int arg0) {
        ++field1906;
        if (arg0 <= 47) {
            return false;
        } else {
            return this.field1895 != null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lwn;IILwn;)V")
    public final void method1046(class720 arg0, int arg1, int arg2, class720 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field1883;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, (double) arg1, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1905 != null) {
            super.field5497.method2615(this.field1890, true);
            int var5 = class687.method3886(82, this.field1904);
            int var6 = class687.method3886(124, this.field1896);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field1890.method734(0, false, this.field1905[var7]);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (~var7 != -1) {
                    super.field5497.method2621(-2, this.field1905[var7 + -1]);
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
                    super.field5497.method2621(-2, arg0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1904, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1904, (float) this.field1896);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1896);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                ++var7;
            }
            super.field5497.method2617((byte) -81, this.field1890);
            super.field5497.method2621(-2, this.field1905[var7 + -1]);
            super.field5497.method2615(this.field1895, true);
            this.field1895.method728((byte) 7, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field1887.field9424;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class265.field3292, 0.0F, 0.0F);
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
            super.field5497.method2621(arg1 + -3, arg0);
            super.field5497.method2615(this.field1895, true);
            this.field1895.method728((byte) 7, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1882.field9424;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class265.field3292, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1904, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1904, (float) this.field1896);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1896);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1895.method728((byte) 7, 1);
        super.field5497.method2621(-2, this.field1907);
        long var12 = this.field1888.field9424;
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
        this.field1895.method728((byte) 7, 0);
        super.field5497.method2621(-2, this.field1902);
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
        super.field5497.method2617((byte) -74, this.field1895);
        long var14 = this.field1898.field9424;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class306.field3819, class515.field7346, 0.0F);
        super.field5497.method2545(arg1 + 32885, 1);
        super.field5497.method2621(~arg1, this.field1907);
        super.field5497.method2545(arg1 + 32885, 0);
        super.field5497.method2621(-2, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)Z")
    public final boolean method1047(int arg0) {
        if (arg0 != -15414) {
            method1055(-114, (byte) 103, (class404) null, (class404) null);
        }
        ++field1893;
        if (super.field5497.field6033 && super.field5497.field6030 && super.field5497.field5965) {
            this.field1895 = new class106(super.field5497);
            this.field1907 = new class720(super.field5497, 3553, 34842, 256, 256);
            this.field1907.method4018(false, false, (byte) 125);
            this.field1902 = new class720(super.field5497, 3553, 34842, 256, 256);
            this.field1902.method4018(false, false, (byte) 125);
            super.field5497.method2615(this.field1895, true);
            this.field1895.method734(0, false, this.field1907);
            this.field1895.method734(1, false, this.field1902);
            this.field1895.method728((byte) 7, 0);
            if (!this.field1895.method727(36053)) {
                super.field5497.method2617((byte) -35, this.field1895);
                return false;
            } else {
                super.field5497.method2617((byte) -105, this.field1895);
                this.field1882 = class501.method2971(super.field5497, new class299[] { class261.method1572(super.field5497, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", false) }, arg0 ^ 232);
                this.field1887 = class501.method2971(super.field5497, new class299[] { class261.method1572(super.field5497, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", false) }, -15582);
                this.field1898 = class501.method2971(super.field5497, new class299[] { class261.method1572(super.field5497, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", false) }, -15582);
                this.field1888 = class501.method2971(super.field5497, new class299[] { class261.method1572(super.field5497, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", false) }, -15582);
                return this.field1887 != null && this.field1882 != null && this.field1898 != null && this.field1888 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZI)V")
    public final void method1048(int arg0, boolean arg1, int arg2) {
        this.field1904 = arg0;
        ++field1897;
        this.field1896 = arg2;
        if (arg1) {
            this.method1049(0);
        }
        int var4 = class687.method3886(87, this.field1904);
        int var5 = class687.method3886(118, this.field1896);
        if (this.field1884 != var4 || this.field1889 != var5) {
            if (this.field1905 != null) {
                for (int var6 = 0; ~this.field1905.length < ~var6; ++var6) {
                    this.field1905[var6].method1736(-30119);
                }
                this.field1905 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field1890 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label62: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        if (this.field1890 == null) {
                            this.field1890 = new class106(super.field5497);
                        }
                        int var10 = var5;
                        this.field1905 = new class720[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && ~var10 >= -257) {
                                break label62;
                            }
                            this.field1905[var12++] = new class720(super.field5497, 3553, 34842, var11, var10);
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                        }
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field1889 = var5;
            this.field1884 = var4;
        }
    }

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "(I)Z")
    public final boolean method1049(int arg0) {
        if (arg0 != 0) {
            this.method1049(51);
        }
        ++field1886;
        return super.field5497.field6033 && super.field5497.field6030 && super.field5497.field5965;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public final void method1050(int arg0) {
        this.field1902 = null;
        this.field1887 = null;
        this.field1890 = null;
        if (arg0 == -3058) {
            this.field1907 = null;
            this.field1895 = null;
            ++field1903;
            this.field1905 = null;
            this.field1898 = null;
            this.field1888 = null;
            this.field1882 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static void method1051(byte arg0) {
        if (arg0 > -108) {
            method1056(true, (short[]) null, 40);
        }
        field1894 = null;
        field1892 = null;
        field1881 = null;
    }

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)I")
    public final int method1052(int arg0) {
        ++field1885;
        if (arg0 != 0) {
            this.field1882 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
    public final void method1053(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method1045(-125);
        }
        ++field1900;
        OpenGL.glUseProgramObjectARB(0L);
        super.field5497.method2545(32886, 1);
        super.field5497.method2621(-2, (class292) null);
        super.field5497.method2545(32886, 0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)C")
    public static final char method1054(byte arg0, int arg1) {
        ++field1891;
        int var2 = arg0 & 255;
        if (arg1 != -161) {
            method1054((byte) -100, 14);
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && ~var2 > -161) {
                char var3 = class231.field2698[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBLoh;Loh;)V")
    public static final void method1055(int arg0, byte arg1, class404 arg2, class404 arg3) {
        ++field1901;
        class629.field9033 = arg2;
        if (arg1 >= -53) {
            field1881 = null;
        }
        class256.field3124 = arg3;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lnv;)V")
    public class169(class417 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z[SI)[S")
    public static final short[] method1056(boolean arg0, short[] arg1, int arg2) {
        ++field1899;
        if (arg0) {
            return null;
        } else {
            short[] var3 = new short[arg2];
            class143.method895(arg1, 0, var3, 0, arg2);
            return var3;
        }
    }
}
