import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class648 extends class462 {

    @OriginalMember(owner = "client!kia", name = "J", descriptor = "Lfja;")
    public static class783 field8958 = new class783(2, 1);

    @OriginalMember(owner = "client!kia", name = "T", descriptor = "D")
    public static double field8967;

    @OriginalMember(owner = "client!kia", name = "v", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!kia", name = "w", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!kia", name = "y", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!kia", name = "B", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!kia", name = "F", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!kia", name = "G", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!kia", name = "I", descriptor = "I")
    private int field8957;

    @OriginalMember(owner = "client!kia", name = "L", descriptor = "I")
    private int field8959;

    @OriginalMember(owner = "client!kia", name = "M", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!kia", name = "N", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!kia", name = "O", descriptor = "I")
    private int field8962;

    @OriginalMember(owner = "client!kia", name = "P", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!kia", name = "Q", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!kia", name = "R", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!kia", name = "U", descriptor = "I")
    private int field8968;

    @OriginalMember(owner = "client!kia", name = "E", descriptor = "Lkf;")
    private class268 field8953;

    @OriginalMember(owner = "client!kia", name = "H", descriptor = "Lkf;")
    private class268 field8956;

    @OriginalMember(owner = "client!kia", name = "A", descriptor = "Let;")
    private class621 field8949;

    @OriginalMember(owner = "client!kia", name = "W", descriptor = "Let;")
    private class621 field8970;

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "Lag;")
    private class712 field8948;

    @OriginalMember(owner = "client!kia", name = "C", descriptor = "Lag;")
    private class712 field8951;

    @OriginalMember(owner = "client!kia", name = "D", descriptor = "Lag;")
    private class712 field8952;

    @OriginalMember(owner = "client!kia", name = "S", descriptor = "Lag;")
    private class712 field8966;

    @OriginalMember(owner = "client!kia", name = "V", descriptor = "Llu;")
    public static class742 field8969;

    @OriginalMember(owner = "client!kia", name = "x", descriptor = "[Lkf;")
    private class268[] field8946;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lkf;IILkf;)V")
    public final void method2666(class268 arg0, int arg1, int arg2, class268 arg3) {
        ++field8954;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, (double) arg1);
        if (this.field8946 == null) {
            super.field6281.method939(arg0, 8448);
            super.field6281.method934(false, this.field8949);
            this.field8949.method3504(true, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field8951.field9800;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class521.field7071, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field8957, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field8957, (float) this.field8962);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field8962);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field6281.method934(false, this.field8970);
            int var7 = class484.method2765(this.field8957, arg1 + 33);
            int var8 = class484.method2765(this.field8962, 62);
            int var9 = 0;
            while (~var7 < -257 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field8970.method3502(0, arg1 + 57, this.field8946[var9]);
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (~var9 == -1) {
                    super.field6281.method939(arg0, 8448);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field8957, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field8957, (float) this.field8962);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8962);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field6281.method939(this.field8946[var9 + -1], 8448);
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
                if (var7 > 256) {
                    var7 >>= 1;
                }
                ++var9;
            }
            super.field6281.method954(1, this.field8970);
            super.field6281.method939(this.field8946[var9 + -1], 8448);
            super.field6281.method934(false, this.field8949);
            this.field8949.method3504(true, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field8948.field9800;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class521.field7071, 0.0F, 0.0F);
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
        this.field8949.method3504(true, 1);
        super.field6281.method939(this.field8956, 8448);
        long var12 = this.field8952.field9800;
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
        this.field8949.method3504(true, 0);
        super.field6281.method939(this.field8953, 8448);
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
        super.field6281.method954(1, this.field8949);
        long var14 = this.field8966.field9800;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class463.field6305, class722.field9920, 0.0F);
        super.field6281.method1002(1, arg1 + -5173);
        super.field6281.method939(this.field8956, 8448);
        super.field6281.method1002(0, arg1 + -5173);
        super.field6281.method939(arg0, 8448);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method3634(int arg0, String arg1, byte arg2, String arg3, String arg4, int arg5, String arg6) {
        if (arg2 != -13) {
            field8958 = null;
        }
        class769.method4229(arg5, arg1, (String) null, -1, arg3, arg0, 99, arg6, arg4);
        ++field8965;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIB)V")
    public final void method2664(int arg0, int arg1, byte arg2) {
        if (arg2 != -80) {
            field8967 = 1.780941948223228D;
        }
        ++field8947;
        this.field8957 = arg1;
        this.field8962 = arg0;
        int var4 = class484.method2765(this.field8957, arg2 + 160);
        int var5 = class484.method2765(this.field8962, arg2 ^ -89);
        if (~this.field8959 != ~var4 || ~this.field8968 != ~var5) {
            if (this.field8946 != null) {
                for (int var6 = 0; var6 < this.field8946.length; ++var6) {
                    this.field8946[var6].method128((byte) 118);
                }
                this.field8946 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field8970 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field8970 == null) {
                    this.field8970 = new class621(super.field6281);
                }
                label57: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        int var10 = var5;
                        int var11 = var4;
                        this.field8946 = new class268[var9];
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && var10 <= 256) {
                                break label57;
                            }
                            this.field8946[var12++] = new class268(super.field6281, 3553, 34842, var11, var10);
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
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
            this.field8959 = var4;
            this.field8968 = var5;
        }
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "(B)Z")
    public final boolean method3635(byte arg0) {
        if (arg0 < 108) {
            return true;
        } else {
            ++field8950;
            return super.field6281.field2041 && super.field6281.field2074 && super.field6281.field2036;
        }
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V")
    public final void method2658(int arg0) {
        this.field8948 = null;
        this.field8966 = null;
        this.field8951 = null;
        this.field8953 = null;
        this.field8946 = null;
        ++field8964;
        this.field8949 = null;
        this.field8970 = null;
        this.field8956 = null;
        this.field8952 = null;
        if (arg0 != -257) {
            field8958 = null;
        }
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "(I)Z")
    public final boolean method2660(int arg0) {
        if (arg0 != 35632) {
            field8969 = null;
        }
        ++field8945;
        if (super.field6281.field2041 && super.field6281.field2074 && super.field6281.field2036) {
            this.field8949 = new class621(super.field6281);
            this.field8956 = new class268(super.field6281, 3553, 34842, 256, 256);
            this.field8956.method1742(arg0 + -35558, false, false);
            this.field8953 = new class268(super.field6281, 3553, 34842, 256, 256);
            this.field8953.method1742(arg0 ^ 35662, false, false);
            super.field6281.method934(false, this.field8949);
            this.field8949.method3502(0, arg0 ^ -35669, this.field8956);
            this.field8949.method3502(1, 88, this.field8953);
            this.field8949.method3504(true, 0);
            if (!this.field8949.method3497((byte) 105)) {
                super.field6281.method954(1, this.field8949);
                return false;
            } else {
                super.field6281.method954(1, this.field8949);
                this.field8951 = class300.method1927(super.field6281, new class546[] { class692.method3873("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", true, 35632, super.field6281) }, (byte) 31);
                this.field8948 = class300.method1927(super.field6281, new class546[] { class692.method3873("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", true, 35632, super.field6281) }, (byte) 31);
                this.field8966 = class300.method1927(super.field6281, new class546[] { class692.method3873("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", true, 35632, super.field6281) }, (byte) 31);
                this.field8952 = class300.method1927(super.field6281, new class546[] { class692.method3873("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", true, 35632, super.field6281) }, (byte) 31);
                return this.field8948 != null && this.field8951 != null && this.field8966 != null && this.field8952 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZZ[B)V")
    public static final void method3636(boolean arg0, boolean arg1, byte[] arg2) {
        ++field8955;
        if (class727.field9988 == null) {
            class727.field9988 = new class93(20000);
        }
        class727.field9988.method743(0, arg2.length, arg2, arg1);
        if (arg0) {
            class201.method1446(class727.field9988.field1413, (byte) 40);
            class18.field426 = new class732[class686.field9541];
            int var3 = 0;
            for (int var4 = class305.field4190; class377.field5127 >= var4; ++var4) {
                class732 var5 = class324.method2062(var4, (byte) -125);
                if (var5 != null) {
                    class18.field426[var3++] = var5;
                }
            }
            class492.field6747 = false;
            class102.field1648 = class197.method1423(1);
            class727.field9988 = null;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIII)V")
    public static final void method3637(int arg0, int arg1, int arg2, int arg3) {
        ++field8961;
        int var4 = class111.field1911.field6752.method925((byte) 79) * arg2 >> 8;
        if (arg1 == 6862) {
            if (var4 != 0 && arg3 != -1) {
                if (!class299.field4117 && class520.field7058 != -1 && class153.method1203((byte) -26) && !class453.method2621(arg1 + -6738)) {
                    class614.field8563 = class713.method3971((byte) -108);
                    class558 var5 = class658.method3697(true, class614.field8563);
                    class303.method1939(var5, true, (byte) 115);
                }
                class374.method2270(arg3, 0, class660.field9142, arg1 + -6862, var4, false);
                class495.method2841(-1, arg1 + -6846, 255);
                class299.field4117 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "(I)I")
    public final int method2665(int arg0) {
        if (arg0 != 0) {
            this.field8956 = null;
        }
        ++field8944;
        return 1;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)Z")
    public final boolean method2663(byte arg0) {
        ++field8960;
        int var2 = -19 / ((2 - arg0) / 50);
        return this.field8949 != null;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)V")
    public final void method2662(int arg0, int arg1) {
        ++field8963;
        OpenGL.glUseProgramObjectARB(0L);
        if (arg0 <= -82) {
            super.field6281.method1002(1, -5172);
            super.field6281.method939((class18) null, 8448);
            super.field6281.method1002(0, -5172);
        }
    }

    @OriginalMember(owner = "client!kia", name = "j", descriptor = "(I)V")
    public static void method3638(int arg0) {
        if (arg0 != 1) {
            field8958 = null;
        }
        field8969 = null;
        field8958 = null;
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lhk;)V")
    public class648(class111 arg0) {
        super(arg0);
    }
}
