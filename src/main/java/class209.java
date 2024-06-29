import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class209 extends class381 {

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "Ler;")
    public static class157 field2947 = new class157(8);

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field2963 = 0;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lcm;")
    public static class449 field2967 = new class449(11, 16);

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "Lui;")
    public static class375 field2968 = new class375("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    private int field2941;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    private int field2953;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    private int field2961;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lks;")
    private class317 field2942;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Lks;")
    private class317 field2943;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lwg;")
    private class393 field2958;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "Lwg;")
    private class393 field2964;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Lrs;")
    private class486 field2944;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "Lrs;")
    private class486 field2954;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "Lrs;")
    private class486 field2956;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "Lrs;")
    private class486 field2965;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Lwh;")
    public static class518 field2960;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "[Lwg;")
    private class393[] field2955;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lwg;Lwg;II)V", line = 9)
    public final void method1445(class393 arg0, class393 arg1, int arg2, int arg3) {
        if (arg3 > -64) {
            this.method1454(25);
        }
        OpenGL.glPushAttrib(2048);
        ++field2948;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2955 == null) {
            super.field5812.method1787(arg0, (byte) 121);
            super.field5812.method1843(-110, this.field2942);
            this.field2942.method2065(0, (byte) -120);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field2965.field7133;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class368.field5661, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field2941, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field2941, (float) this.field2953);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field2953);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field5812.method1843(82, this.field2943);
            int var7 = class412.method2505(17202, this.field2941);
            int var8 = class412.method2505(17202, this.field2953);
            int var9 = 0;
            while (~var7 < -257 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field2943.method2057(0, -60, this.field2955[var9]);
                if (~var7 < -257) {
                    var7 >>= 1;
                }
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (var9 != 0) {
                    super.field5812.method1787(this.field2955[var9 + -1], (byte) 121);
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
                    super.field5812.method1787(arg0, (byte) 121);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field2941, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field2941, (float) this.field2953);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2953);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var9;
            }
            super.field5812.method1779(this.field2943, true);
            super.field5812.method1787(this.field2955[var9 + -1], (byte) 121);
            super.field5812.method1843(87, this.field2942);
            this.field2942.method2065(0, (byte) -97);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field2954.field7133;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class368.field5661, 0.0F, 0.0F);
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
        this.field2942.method2065(1, (byte) 54);
        super.field5812.method1787(this.field2964, (byte) 121);
        long var12 = this.field2944.field7133;
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
        this.field2942.method2065(0, (byte) -105);
        super.field5812.method1787(this.field2958, (byte) 121);
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
        super.field5812.method1779(this.field2942, true);
        long var14 = this.field2956.field7133;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class288.field4296, class290.field4306, 0.0F);
        super.field5812.method1819(1, (byte) 111);
        super.field5812.method1787(this.field2964, (byte) 121);
        super.field5812.method1819(0, (byte) 123);
        super.field5812.method1787(arg0, (byte) 121);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V", line = 164)
    public final void method1446(byte arg0) {
        this.field2958 = null;
        this.field2943 = null;
        this.field2955 = null;
        this.field2954 = null;
        if (arg0 > -54) {
            this.field2959 = 80;
        }
        ++field2957;
        this.field2956 = null;
        this.field2964 = null;
        this.field2965 = null;
        this.field2944 = null;
        this.field2942 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)V", line = 183)
    public final void method1447(byte arg0, int arg1, int arg2) {
        ++field2946;
        if (arg0 != 81) {
            this.field2958 = null;
        }
        this.field2953 = arg1;
        this.field2941 = arg2;
        int var4 = class412.method2505(17202, this.field2941);
        int var5 = class412.method2505(17202, this.field2953);
        if (this.field2959 != var4 || ~this.field2961 != ~var5) {
            if (this.field2955 != null) {
                for (int var6 = 0; ~this.field2955.length < ~var6; ++var6) {
                    this.field2955[var6].method121((byte) -57);
                }
                this.field2955 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field2943 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field2943 == null) {
                    this.field2943 = new class317(super.field5812);
                }
                label58: while (true) {
                    if (var7 <= 256 && var8 <= 256) {
                        this.field2955 = new class393[var9];
                        int var10 = var4;
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && var11 <= 256) {
                                break label58;
                            }
                            this.field2955[var12++] = new class393(super.field5812, 3553, 34842, var10, var11);
                            if (~var10 < -257) {
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
                    ++var9;
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                }
            }
            this.field2959 = var4;
            this.field2961 = var5;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V", line = 263)
    public static final void method1448(int arg0, boolean arg1) {
        class404.field6114 = arg0;
        if (arg1) {
            method1450(-81);
        }
        ++field2950;
        class411.field6185.method1015((byte) 89);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Z", line = 278)
    public final boolean method1449(byte arg0) {
        ++field2949;
        int var2 = -33 / ((25 - arg0) / 48);
        return super.field5812.field4159 && super.field5812.field4150 && super.field5812.field4146;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V", line = 288)
    public static void method1450(int arg0) {
        field2947 = null;
        field2968 = null;
        field2960 = null;
        field2967 = null;
        if (arg0 <= 97) {
            method1450(-7);
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)Z", line = 307)
    public final boolean method1451(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field2962;
            if (super.field5812.field4159 && super.field5812.field4150 && super.field5812.field4146) {
                this.field2942 = new class317(super.field5812);
                this.field2964 = new class393(super.field5812, 3553, 34842, 256, 256);
                this.field2964.method2417(true, false, false);
                this.field2958 = new class393(super.field5812, 3553, 34842, 256, 256);
                this.field2958.method2417(true, false, false);
                super.field5812.method1843(arg0 + 85, this.field2942);
                this.field2942.method2057(0, -126, this.field2964);
                this.field2942.method2057(1, arg0 ^ -85, this.field2958);
                this.field2942.method2065(0, (byte) 121);
                if (!this.field2942.method2063(-16436)) {
                    super.field5812.method1779(this.field2942, true);
                    return false;
                } else {
                    super.field5812.method1779(this.field2942, true);
                    this.field2965 = class384.method2382((byte) 100, new class238[] { class117.method760(super.field5812, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, -12054) }, super.field5812);
                    this.field2954 = class384.method2382((byte) 80, new class238[] { class117.method760(super.field5812, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, -12054) }, super.field5812);
                    this.field2956 = class384.method2382((byte) 109, new class238[] { class117.method760(super.field5812, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, -12054) }, super.field5812);
                    this.field2944 = class384.method2382((byte) 109, new class238[] { class117.method760(super.field5812, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, arg0 + -12054) }, super.field5812);
                    return this.field2954 != null && this.field2965 != null && this.field2956 != null && this.field2944 != null;
                }
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lbv;)V", line = 344)
    public class209(class282 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)Z", line = 349)
    public final boolean method1452(int arg0) {
        if (arg0 != 1) {
            return true;
        } else {
            ++field2952;
            return this.field2942 != null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V", line = 371)
    public final void method1453(int arg0, int arg1) {
        ++field2945;
        OpenGL.glUseProgramObjectARB(0L);
        if (arg0 > -51) {
            method1450(-123);
        }
        super.field5812.method1819(1, (byte) 114);
        super.field5812.method1787((class14) null, (byte) 121);
        super.field5812.method1819(0, (byte) 94);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I", line = 388)
    public final int method1454(int arg0) {
        if (arg0 != 1) {
            this.field2965 = null;
        }
        ++field2951;
        return 1;
    }
}
