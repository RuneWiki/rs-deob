import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class381 extends class533 {

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field5804 = 0;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    private int field5802;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    private int field5806;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    private int field5813;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    private int field5816;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Lsu;")
    private class142 field5797;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Lsu;")
    private class142 field5801;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "Lsu;")
    private class142 field5808;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Lsu;")
    private class142 field5809;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Luu;")
    public static class191 field5811;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lwv;")
    private class25 field5803;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Lwv;")
    private class25 field5815;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Lsk;")
    private class447 field5799;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Lsk;")
    private class447 field5800;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "[I")
    public static int[] field5814;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "[Lwv;")
    private class25[] field5805;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "[[B")
    public static byte[][] field5818;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V")
    public final void method2390(int arg0, byte arg1) {
        if (arg1 != -114) {
            field5814 = null;
        }
        OpenGL.glUseProgramObjectARB(0L);
        ++field5795;
        super.field7841.method2040((byte) 33, 1);
        super.field7841.method2075((class538) null, 0);
        super.field7841.method2040((byte) -119, 0);
    }

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "(I)V")
    public final void method2391(int arg0) {
        ++field5817;
        this.field5801 = null;
        this.field5799 = null;
        if (arg0 != -10748) {
            this.field5803 = null;
        }
        this.field5803 = null;
        this.field5805 = null;
        this.field5815 = null;
        this.field5797 = null;
        this.field5809 = null;
        this.field5808 = null;
        this.field5800 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lnq;)V")
    public class381(class325 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public final void method2392(int arg0, int arg1, int arg2) {
        this.field5813 = arg1;
        this.field5802 = arg0;
        ++field5819;
        if (arg2 < 25) {
            this.method2397((byte) -29);
        }
        int var4 = class520.method3095((byte) -61, this.field5813);
        int var5 = class520.method3095((byte) -48, this.field5802);
        if (this.field5816 != var4 || ~this.field5806 != ~var5) {
            if (this.field5805 != null) {
                for (int var6 = 0; var6 < this.field5805.length; ++var6) {
                    this.field5805[var6].method3172(6146);
                }
                this.field5805 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field5800 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field5800 == null) {
                    this.field5800 = new class447(super.field7841);
                }
                label59: while (true) {
                    if (var7 <= 256 && ~var8 >= -257) {
                        int var10 = var5;
                        int var11 = var4;
                        this.field5805 = new class25[var9];
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && var10 <= 256) {
                                break label59;
                            }
                            this.field5805[var12++] = new class25(super.field7841, 3553, 34842, var11, var10);
                            if (~var11 < -257) {
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
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field5816 = var4;
            this.field5806 = var5;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)I")
    public final int method2393(byte arg0) {
        if (arg0 >= -47) {
            return -64;
        } else {
            ++field5807;
            return 1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILwv;Lwv;I)V")
    public final void method2394(int arg0, class25 arg1, class25 arg2, int arg3) {
        ++field5812;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        int var5 = -68 % ((31 - arg0) / 50);
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5805 == null) {
            super.field7841.method2075(arg1, 0);
            super.field7841.method2071(108, this.field5799);
            this.field5799.method2711(-66, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var6 = this.field5808.field1898;
            OpenGL.glUseProgramObjectARB(var6);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, "params"), class419.field6381, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field5813, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field5813, (float) this.field5802);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field5802);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field7841.method2071(83, this.field5800);
            int var8 = class520.method3095((byte) -59, this.field5813);
            int var9 = class520.method3095((byte) -118, this.field5802);
            int var10 = 0;
            while (var8 > 256 || ~var9 < -257) {
                OpenGL.glViewport(0, 0, var8, var9);
                this.field5800.method2708(0, (byte) 20, this.field5805[var10]);
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (~var9 < -257) {
                    var9 >>= 1;
                }
                if (var10 != 0) {
                    super.field7841.method2075(this.field5805[var10 + -1], 0);
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
                    super.field7841.method2075(arg1, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field5813, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field5813, (float) this.field5802);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5802);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var10;
            }
            super.field7841.method2055(this.field5800, -17);
            super.field7841.method2075(this.field5805[var10 + -1], 0);
            super.field7841.method2071(101, this.field5799);
            this.field5799.method2711(-66, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var11 = this.field5809.field1898;
            OpenGL.glUseProgramObjectARB(var11);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var11, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var11, "params"), class419.field6381, 0.0F, 0.0F);
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
        this.field5799.method2711(-66, 1);
        super.field7841.method2075(this.field5803, 0);
        long var13 = this.field5801.field1898;
        OpenGL.glUseProgramObjectARB(var13);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var13, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var13, "step"), 0.00390625F, 0.0F, 0.0F);
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
        this.field5799.method2711(-66, 0);
        super.field7841.method2075(this.field5815, 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var13, "step"), 0.0F, 0.00390625F, 0.0F);
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
        super.field7841.method2055(this.field5799, 91);
        long var15 = this.field5797.field1898;
        OpenGL.glUseProgramObjectARB(var15);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var15, "params"), class263.field3693, class411.field6254, 0.0F);
        super.field7841.method2040((byte) 125, 1);
        super.field7841.method2075(this.field5803, 0);
        super.field7841.method2040((byte) 19, 0);
        super.field7841.method2075(arg1, 0);
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)Z")
    public final boolean method2395(int arg0) {
        if (arg0 != 10325) {
            return true;
        } else {
            ++field5796;
            return this.field5799 != null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Z")
    public final boolean method2396(int arg0) {
        ++field5810;
        if (arg0 >= -21) {
            field5804 = -96;
        }
        if (super.field7841.field4939 && super.field7841.field4923 && super.field7841.field4997) {
            this.field5799 = new class447(super.field7841);
            this.field5803 = new class25(super.field7841, 3553, 34842, 256, 256);
            this.field5803.method229((byte) 77, false, false);
            this.field5815 = new class25(super.field7841, 3553, 34842, 256, 256);
            this.field5815.method229((byte) 77, false, false);
            super.field7841.method2071(95, this.field5799);
            this.field5799.method2708(0, (byte) 20, this.field5803);
            this.field5799.method2708(1, (byte) 20, this.field5815);
            this.field5799.method2711(-66, 0);
            if (!this.field5799.method2713(36053)) {
                super.field7841.method2055(this.field5799, -53);
                return false;
            } else {
                super.field7841.method2055(this.field5799, 127);
                this.field5808 = class194.method1306(super.field7841, new class473[] { class222.method1502("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field7841, 35632, (byte) 69) }, (byte) -114);
                this.field5809 = class194.method1306(super.field7841, new class473[] { class222.method1502("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field7841, 35632, (byte) -97) }, (byte) -114);
                this.field5797 = class194.method1306(super.field7841, new class473[] { class222.method1502("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field7841, 35632, (byte) 63) }, (byte) -114);
                this.field5801 = class194.method1306(super.field7841, new class473[] { class222.method1502("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field7841, 35632, (byte) 74) }, (byte) -114);
                return this.field5809 != null && this.field5808 != null && this.field5797 != null && this.field5801 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)Z")
    public final boolean method2397(byte arg0) {
        if (arg0 != -73) {
            this.method2395(78);
        }
        ++field5798;
        return super.field7841.field4939 && super.field7841.field4923 && super.field7841.field4997;
    }

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "(I)V")
    public static void method2398(int arg0) {
        if (arg0 > -71) {
            method2398(-91);
        }
        field5811 = null;
        field5814 = null;
        field5818 = null;
    }
}
