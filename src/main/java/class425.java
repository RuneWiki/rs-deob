import jaggl.OpenGL;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class425 extends class358 {

    @OriginalMember(owner = "client!cga", name = "w", descriptor = "Lqk;")
    public static class1 field5914 = new class1(9, 7);

    @OriginalMember(owner = "client!cga", name = "Q", descriptor = "[I")
    public static int[] field5934 = new int[1024];

    @OriginalMember(owner = "client!cga", name = "u", descriptor = "I")
    private int field5912;

    @OriginalMember(owner = "client!cga", name = "v", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!cga", name = "y", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "I")
    private int field5917;

    @OriginalMember(owner = "client!cga", name = "A", descriptor = "I")
    private int field5918;

    @OriginalMember(owner = "client!cga", name = "B", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!cga", name = "D", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!cga", name = "F", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!cga", name = "H", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!cga", name = "J", descriptor = "I")
    private int field5927;

    @OriginalMember(owner = "client!cga", name = "K", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!cga", name = "M", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!cga", name = "R", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!cga", name = "S", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!cga", name = "U", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!cga", name = "V", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!cga", name = "N", descriptor = "Lrq;")
    private class470 field5931;

    @OriginalMember(owner = "client!cga", name = "P", descriptor = "Lrq;")
    private class470 field5933;

    @OriginalMember(owner = "client!cga", name = "T", descriptor = "Lfea;")
    public static class678 field5937;

    @OriginalMember(owner = "client!cga", name = "C", descriptor = "Lon;")
    private class759 field5920;

    @OriginalMember(owner = "client!cga", name = "I", descriptor = "Lon;")
    private class759 field5926;

    @OriginalMember(owner = "client!cga", name = "L", descriptor = "Lon;")
    private class759 field5929;

    @OriginalMember(owner = "client!cga", name = "O", descriptor = "Lon;")
    private class759 field5932;

    @OriginalMember(owner = "client!cga", name = "x", descriptor = "Lhha;")
    private class772 field5915;

    @OriginalMember(owner = "client!cga", name = "G", descriptor = "Lhha;")
    private class772 field5924;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cga", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field5940;

    @OriginalMember(owner = "client!cga", name = "E", descriptor = "[Lrq;")
    private class470[] field5922;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2569(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V", line = 6)
    public final void method2241(byte arg0) {
        this.field5924 = null;
        this.field5929 = null;
        ++field5935;
        this.field5926 = null;
        this.field5920 = null;
        this.field5933 = null;
        this.field5922 = null;
        this.field5931 = null;
        this.field5932 = null;
        int var2 = 109 % ((arg0 - -7) / 60);
        this.field5915 = null;
    }

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "(I)Z", line = 24)
    public final boolean method2563(int arg0) {
        ++field5939;
        if (arg0 != -15) {
            method2565(false);
        }
        return super.field5149.field2695 && super.field5149.field2747 && super.field5149.field2657;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZII)V", line = 42)
    public final void method2245(boolean arg0, int arg1, int arg2) {
        this.field5927 = arg1;
        if (arg0) {
            this.method2248(-29);
        }
        this.field5912 = arg2;
        ++field5916;
        int var4 = class47.method385(this.field5927, 4);
        int var5 = class47.method385(this.field5912, 4);
        if (~this.field5918 != ~var4 || this.field5917 != var5) {
            if (this.field5922 != null) {
                for (int var6 = 0; var6 < this.field5922.length; ++var6) {
                    this.field5922[var6].method3206(arg0);
                }
                this.field5922 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field5924 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field5924 == null) {
                    this.field5924 = new class772(super.field5149);
                }
                label60: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        this.field5922 = new class470[var9];
                        int var10 = var4;
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (var10 <= 256 && ~var11 >= -257) {
                                break label60;
                            }
                            this.field5922[var12++] = new class470(super.field5149, 3553, 34842, var10, var11);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
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
            this.field5917 = var5;
            this.field5918 = var4;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)I", line = 124)
    public final int method2239(boolean arg0) {
        if (arg0) {
            method2568(77, (class432) null);
        }
        ++field5923;
        return 1;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 136)
    public static final String method2564(long arg0, int arg1) {
        ++field5921;
        if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = arg1;
                long var4 = arg0;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class743.field10244[(int) (-(arg0 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lpq;)V", line = 170)
    public class425(class194 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(Z)V", line = 173)
    public static void method2565(boolean arg0) {
        if (!arg0) {
            field5934 = null;
            field5914 = null;
            field5937 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)V", line = 188)
    public final void method2240(byte arg0, int arg1) {
        ++field5928;
        OpenGL.glUseProgramObjectARB(0L);
        super.field5149.method1262(1, 0);
        super.field5149.method1219((byte) 113, (class539) null);
        super.field5149.method1262(0, 0);
        int var3 = 22 / ((18 - arg0) / 50);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIII)Z", line = 201)
    public static final boolean method2566(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            method2564(-126L, -62);
        }
        ++field5919;
        class466 var4 = (class466) class174.method1110(arg0, arg1, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class718.method4014(-32, var4);
        }
        class466 var6 = (class466) class485.method2882(arg0, arg1, arg2, field5940 != null ? field5940 : (field5940 = method2569("oc")));
        if (var6 != null) {
            var5 &= class718.method4014(arg3 + -109, var6);
        }
        class466 var7 = (class466) class349.method2197(arg0, arg1, arg2);
        if (var7 != null) {
            var5 &= class718.method4014(-26, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "(I)Z", line = 231)
    public final boolean method2248(int arg0) {
        if (arg0 != 20179) {
            this.method2240((byte) -39, 84);
        }
        ++field5925;
        if (super.field5149.field2695 && super.field5149.field2747 && super.field5149.field2657) {
            this.field5915 = new class772(super.field5149);
            this.field5931 = new class470(super.field5149, 3553, 34842, 256, 256);
            this.field5931.method2804(false, 10243, false);
            this.field5933 = new class470(super.field5149, 3553, 34842, 256, 256);
            this.field5933.method2804(false, arg0 ^ 26320, false);
            super.field5149.method1274(arg0 ^ 20177, this.field5915);
            this.field5915.method4260(112, this.field5931, 0);
            this.field5915.method4260(106, this.field5933, 1);
            this.field5915.method4259((byte) 109, 0);
            if (!this.field5915.method4266((byte) 119)) {
                super.field5149.method1259((byte) 63, this.field5915);
                return false;
            } else {
                super.field5149.method1259((byte) 63, this.field5915);
                this.field5920 = class792.method4336(new class190[] { class342.method2171(35632, super.field5149, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 0) }, arg0 + 15537, super.field5149);
                this.field5932 = class792.method4336(new class190[] { class342.method2171(35632, super.field5149, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 0) }, 35716, super.field5149);
                this.field5926 = class792.method4336(new class190[] { class342.method2171(35632, super.field5149, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 0) }, 35716, super.field5149);
                this.field5929 = class792.method4336(new class190[] { class342.method2171(35632, super.field5149, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", arg0 ^ 20179) }, arg0 ^ 50519, super.field5149);
                return this.field5932 != null && this.field5920 != null && this.field5926 != null && this.field5929 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Z", line = 271)
    public final boolean method2242(int arg0) {
        if (arg0 != 1) {
            this.field5924 = null;
        }
        ++field5930;
        return this.field5915 != null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lrq;Lrq;BI)V", line = 287)
    public final void method2250(class470 arg0, class470 arg1, byte arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field5913;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field5922 == null) {
            super.field5149.method1219((byte) 95, arg1);
            super.field5149.method1274(arg2 ^ 109, this.field5915);
            this.field5915.method4259((byte) 52, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field5920.field10433;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class164.field2098, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field5927, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field5927, (float) this.field5912);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field5912);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field5149.method1274(2, this.field5924);
            int var7 = class47.method385(this.field5927, 105);
            int var8 = class47.method385(this.field5912, arg2 ^ 109);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field5924.method4260(81, this.field5922[var9], 0);
                if (~var7 < -257) {
                    var7 >>= 1;
                }
                if (var9 != 0) {
                    super.field5149.method1219((byte) 122, this.field5922[var9 + -1]);
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
                    super.field5149.method1219((byte) 94, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field5927, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field5927, (float) this.field5912);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5912);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var8 > 256) {
                    var8 >>= 1;
                }
                ++var9;
            }
            super.field5149.method1259((byte) 63, this.field5924);
            super.field5149.method1219((byte) 83, this.field5922[var9 - 1]);
            super.field5149.method1274(2, this.field5915);
            this.field5915.method4259((byte) 77, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field5932.field10433;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class164.field2098, 0.0F, 0.0F);
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
        this.field5915.method4259((byte) 90, 1);
        super.field5149.method1219((byte) 98, this.field5931);
        long var12 = this.field5929.field10433;
        if (arg2 != 111) {
            this.field5924 = null;
        }
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
        this.field5915.method4259((byte) 90, 0);
        super.field5149.method1219((byte) 117, this.field5933);
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
        super.field5149.method1259((byte) 63, this.field5915);
        long var14 = this.field5926.field10433;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class231.field3483, class675.field9457, 0.0F);
        super.field5149.method1262(1, 0);
        super.field5149.method1219((byte) 102, this.field5931);
        super.field5149.method1262(0, 0);
        super.field5149.method1219((byte) 108, arg1);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIIIBI)V", line = 447)
    public static final void method2567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field5936;
        int var8 = class436.method2621(arg5, class474.field6576, class727.field10060, 512);
        int var9 = class436.method2621(arg7, class474.field6576, class727.field10060, 512);
        int var10 = class436.method2621(arg0, class627.field8783, class177.field2236, 512);
        int var11 = class436.method2621(arg1, class627.field8783, class177.field2236, arg6 ^ -602);
        int var12 = class436.method2621(arg3 + arg5, class474.field6576, class727.field10060, 512);
        int var13 = class436.method2621(arg7 - arg3, class474.field6576, class727.field10060, 512);
        for (int var14 = var8; var14 < var12; ++var14) {
            class128.method883(arg4, var10, var11, class705.field9804[var14], 7);
        }
        for (int var15 = var9; ~var13 > ~var15; --var15) {
            class128.method883(arg4, var10, var11, class705.field9804[var15], 7);
        }
        int var16 = class436.method2621(arg0 - -arg3, class627.field8783, class177.field2236, 512);
        int var17 = class436.method2621(-arg3 + arg1, class627.field8783, class177.field2236, 512);
        for (int var18 = var12; ~var18 >= ~var13; ++var18) {
            int[] var19 = class705.field9804[var18];
            class128.method883(arg4, var10, var16, var19, arg6 + 97);
            class128.method883(arg2, var16, var17, var19, 7);
            class128.method883(arg4, var17, var11, var19, 7);
        }
        if (arg6 != -90) {
            field5914 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILgs;)V", line = 504)
    public static final void method2568(int arg0, class432 arg1) {
        ++field5938;
        class781 var2 = (class781) class22.field202.method1041(1048832);
        if (var2 != null) {
            if (arg0 < 119) {
                field5937 = null;
            }
            boolean var3 = false;
            for (int var4 = 0; ~var2.field10735 < ~var4; ++var4) {
                if (var2.field10732[var4] != null) {
                    if (~var2.field10732[var4].field4970 == -3) {
                        var2.field10734[var4] = -5;
                    }
                    if (~var2.field10732[var4].field4970 == -1) {
                        var3 = true;
                    }
                }
                if (var2.field10728[var4] != null) {
                    if (~var2.field10728[var4].field4970 == -3) {
                        var2.field10734[var4] = -6;
                    }
                    if (~var2.field10728[var4].field4970 == -1) {
                        var3 = true;
                    }
                }
            }
            if (!var3) {
                int var5 = arg1.field6962;
                arg1.method3003(var2.field10727, -23061);
                for (int var6 = 0; var2.field10735 > var6; ++var6) {
                    if (~var2.field10734[var6] != -1) {
                        arg1.method3005(255, var2.field10734[var6]);
                    } else {
                        try {
                            int var7 = var2.field10726[var6];
                            if (var7 == 0) {
                                Field var8 = (Field) var2.field10732[var6].field4975;
                                int var9 = var8.getInt((Object) null);
                                arg1.method3005(255, 0);
                                arg1.method3003(var9, -23061);
                            } else if (~var7 != -2) {
                                if (~var7 == -3) {
                                    Field var10 = (Field) var2.field10732[var6].field4975;
                                    int var11 = var10.getModifiers();
                                    arg1.method3005(255, 0);
                                    arg1.method3003(var11, -23061);
                                }
                            } else {
                                Field var12 = (Field) var2.field10732[var6].field4975;
                                var12.setInt((Object) null, var2.field10730[var6]);
                                arg1.method3005(255, 0);
                            }
                            if (var7 != 3) {
                                if (var7 == 4) {
                                    Method var13 = (Method) var2.field10728[var6].field4975;
                                    int var14 = var13.getModifiers();
                                    arg1.method3005(255, 0);
                                    arg1.method3003(var14, -23061);
                                }
                            } else {
                                Method var15 = (Method) var2.field10728[var6].field4975;
                                byte[][] var16 = var2.field10733[var6];
                                Object[] var17 = new Object[var16.length];
                                for (int var18 = 0; ~var16.length < ~var18; ++var18) {
                                    ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                    var17[var18] = var19.readObject();
                                }
                                Object var20 = var15.invoke((Object) null, var17);
                                if (var20 != null) {
                                    if (var20 instanceof Number) {
                                        arg1.method3005(255, 1);
                                        arg1.method3031(((Number) var20).longValue(), 0);
                                    } else if (var20 instanceof String) {
                                        arg1.method3005(255, 2);
                                        arg1.method3037(0, (String) var20);
                                    } else {
                                        arg1.method3005(255, 4);
                                    }
                                } else {
                                    arg1.method3005(255, 0);
                                }
                            }
                        } catch (ClassNotFoundException var21) {
                            arg1.method3005(255, -10);
                        } catch (InvalidClassException var22) {
                            arg1.method3005(255, -11);
                        } catch (StreamCorruptedException var23) {
                            arg1.method3005(255, -12);
                        } catch (OptionalDataException var24) {
                            arg1.method3005(255, -13);
                        } catch (IllegalAccessException var25) {
                            arg1.method3005(255, -14);
                        } catch (IllegalArgumentException var26) {
                            arg1.method3005(255, -15);
                        } catch (InvocationTargetException var27) {
                            arg1.method3005(255, -16);
                        } catch (SecurityException var28) {
                            arg1.method3005(255, -17);
                        } catch (IOException var29) {
                            arg1.method3005(255, -18);
                        } catch (NullPointerException var30) {
                            arg1.method3005(255, -19);
                        } catch (Exception var31) {
                            arg1.method3005(255, -20);
                        } catch (Throwable var32) {
                            arg1.method3005(255, -21);
                        }
                    }
                }
                arg1.method3000(var5, 116);
                var2.method527(-11229);
            }
        }
    }
}
