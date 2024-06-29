import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class460 extends class91 {

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "[[I")
    public static int[][] field6747 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "[[S")
    public static short[][] field6760 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field6767 = -50;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    private int field6745;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    private int field6754;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    private int field6759;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    private int field6762;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Lru;")
    private class128 field6748;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "Lru;")
    private class128 field6756;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "Lru;")
    private class128 field6764;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "Lru;")
    private class128 field6765;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "Lsb;")
    public static class191 field6746;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "Lml;")
    private class264 field6768;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "Lml;")
    private class264 field6769;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "Laf;")
    private class299 field6757;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "Laf;")
    private class299 field6758;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "[Laf;")
    private class299[] field6753;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBLaf;Laf;)V", line = 4)
    public final void method807(int arg0, byte arg1, class299 arg2, class299 arg3) {
        ++field6755;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6753 != null) {
            super.field1255.method2205(this.field6768, (byte) -101);
            int var5 = class106.method871(this.field6745, false);
            int var6 = class106.method871(this.field6754, false);
            int var7 = 0;
            while (var5 > 256 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field6768.method1707((byte) 76, this.field6753[var7], 0);
                if (~var7 != -1) {
                    super.field1255.method2188((byte) 78, this.field6753[var7 + -1]);
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
                    super.field1255.method2188((byte) 78, arg2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6745, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6745, (float) this.field6754);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6754);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (var6 > 256) {
                    var6 >>= 1;
                }
                ++var7;
            }
            super.field1255.method2254(this.field6768, -3);
            super.field1255.method2188((byte) 78, this.field6753[var7 - 1]);
            super.field1255.method2205(this.field6769, (byte) -101);
            this.field6769.method1690(82, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field6765.field1860;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class20.field230, 0.0F, 0.0F);
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
            super.field1255.method2188((byte) 78, arg2);
            super.field1255.method2205(this.field6769, (byte) -101);
            this.field6769.method1690(82, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6764.field1860;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class20.field230, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6745, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6745, (float) this.field6754);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6754);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        int var12 = 121 / ((-74 - arg1) / 47);
        this.field6769.method1690(82, 1);
        super.field1255.method2188((byte) 78, this.field6758);
        long var13 = this.field6748.field1860;
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
        this.field6769.method1690(82, 0);
        super.field1255.method2188((byte) 78, this.field6757);
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
        super.field1255.method2254(this.field6769, 46);
        long var15 = this.field6756.field1860;
        OpenGL.glUseProgramObjectARB(var15);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var15, "params"), class39.field453, class106.field1483, 0.0F);
        super.field1255.method2219(1, -118);
        super.field1255.method2188((byte) 78, this.field6758);
        super.field1255.method2219(0, -121);
        super.field1255.method2188((byte) 78, arg2);
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(Z)Z", line = 160)
    public final boolean method2761(boolean arg0) {
        if (!arg0) {
            this.method807(14, (byte) 60, (class299) null, (class299) null);
        }
        ++field6750;
        return super.field1255.field5328 && super.field1255.field5442 && super.field1255.field5339;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V", line = 174)
    public final void method803(int arg0, int arg1) {
        ++field6766;
        OpenGL.glUseProgramObjectARB(0L);
        super.field1255.method2219(1, -122);
        super.field1255.method2188((byte) 78, (class396) null);
        super.field1255.method2219(arg0, -128);
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)Z", line = 187)
    public final boolean method812(byte arg0) {
        ++field6751;
        if (arg0 <= 121) {
            this.method806(false);
        }
        if (super.field1255.field5328 && super.field1255.field5442 && super.field1255.field5339) {
            this.field6769 = new class264(super.field1255);
            this.field6758 = new class299(super.field1255, 3553, 34842, 256, 256);
            this.field6758.method1882(10497, false, false);
            this.field6757 = new class299(super.field1255, 3553, 34842, 256, 256);
            this.field6757.method1882(10497, false, false);
            super.field1255.method2205(this.field6769, (byte) -101);
            this.field6769.method1707((byte) 76, this.field6758, 0);
            this.field6769.method1707((byte) 76, this.field6757, 1);
            this.field6769.method1690(82, 0);
            if (!this.field6769.method1698(-36054)) {
                super.field1255.method2254(this.field6769, 123);
                return false;
            } else {
                super.field1255.method2254(this.field6769, -126);
                this.field6764 = class196.method1371(new class280[] { class49.method499((byte) 121, super.field1255, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field1255, -1);
                this.field6765 = class196.method1371(new class280[] { class49.method499((byte) 121, super.field1255, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field1255, -1);
                this.field6756 = class196.method1371(new class280[] { class49.method499((byte) 121, super.field1255, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.field1255, -1);
                this.field6748 = class196.method1371(new class280[] { class49.method499((byte) 121, super.field1255, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.field1255, -1);
                return this.field6765 != null && this.field6764 != null && this.field6756 != null && this.field6748 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lfd;)V", line = 226)
    public class460(class365 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)Z", line = 233)
    public final boolean method811(byte arg0) {
        ++field6749;
        if (arg0 != 109) {
            this.field6745 = -96;
        }
        return this.field6769 != null;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)I", line = 248)
    public final int method806(boolean arg0) {
        if (!arg0) {
            this.field6754 = -37;
        }
        ++field6744;
        return 1;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V", line = 267)
    public final void method814(int arg0, int arg1, int arg2) {
        this.field6745 = arg2;
        ++field6761;
        this.field6754 = arg1;
        if (arg0 == 8574) {
            int var4 = class106.method871(this.field6745, false);
            int var5 = class106.method871(this.field6754, false);
            if (this.field6759 != var4 || ~this.field6762 != ~var5) {
                if (this.field6753 != null) {
                    for (int var6 = 0; ~var6 > ~this.field6753.length; ++var6) {
                        this.field6753[var6].method2423(arg0 ^ 8556);
                    }
                    this.field6753 = null;
                }
                if (var4 <= 256 && ~var5 >= -257) {
                    this.field6768 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field6768 == null) {
                        this.field6768 = new class264(super.field1255);
                    }
                    label59: while (true) {
                        if (~var7 >= -257 && var8 <= 256) {
                            int var10 = var4;
                            this.field6753 = new class299[var9];
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (var10 <= 256 && ~var11 >= -257) {
                                    break label59;
                                }
                                this.field6753[var12++] = new class299(super.field1255, 3553, 34842, var10, var11);
                                if (~var11 < -257) {
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
                        if (~var7 < -257) {
                            var7 >>= 1;
                        }
                        ++var9;
                    }
                }
                this.field6759 = var4;
                this.field6762 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(B)V", line = 345)
    public final void method813(byte arg0) {
        this.field6764 = null;
        this.field6758 = null;
        ++field6763;
        this.field6753 = null;
        if (arg0 == -71) {
            this.field6769 = null;
            this.field6768 = null;
            this.field6748 = null;
            this.field6765 = null;
            this.field6756 = null;
            this.field6757 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(Z)V", line = 364)
    public static final void method2762(boolean arg0) {
        ++field6752;
        int var1 = class75.field1027;
        int[] var2 = class334.field4634;
        if (!arg0) {
            field6746 = null;
        }
        for (int var3 = 0; var1 > var3; ++var3) {
            class364 var7 = class384.field5647[var2[var3]];
            if (var7 != null && ~var7.field1764 < -1) {
                --var7.field1764;
                if (var7.field1764 == 0) {
                    var7.field1699 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class232.field3410; ++var4) {
            int var5 = class173.field2454[var4];
            class461 var6 = class250.field3690[var5];
            if (var6 != null && var6.field1764 > 0) {
                --var6.field1764;
                if (~var6.field1764 == -1) {
                    var6.field1699 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(B)V", line = 420)
    public static void method2763(byte arg0) {
        field6746 = null;
        field6747 = null;
        if (arg0 < 18) {
            field6747 = null;
        }
        field6760 = null;
    }
}
