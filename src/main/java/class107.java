import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class107 extends class370 {

    @OriginalMember(owner = "client!mu", name = "O", descriptor = "Lnn;")
    public static class446 field1296 = new class446(1, 7);

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!mu", name = "I", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!mu", name = "J", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!mu", name = "Q", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!mu", name = "R", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!mu", name = "M", descriptor = "Luf;")
    private class120 field1294;

    @OriginalMember(owner = "client!mu", name = "P", descriptor = "Luf;")
    private class120 field1297;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "Luo;")
    public static class207 field1287;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "Lqw;")
    private class379 field1282;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "Lqw;")
    private class379 field1284;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Log;")
    private class564 field1275;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "Log;")
    private class564 field1289;

    @OriginalMember(owner = "client!mu", name = "L", descriptor = "Log;")
    private class564 field1293;

    @OriginalMember(owner = "client!mu", name = "N", descriptor = "Log;")
    private class564 field1295;

    @OriginalMember(owner = "client!mu", name = "K", descriptor = "[Lqw;")
    private class379[] field1292;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)I")
    public final int method566(int arg0) {
        ++field1291;
        if (arg0 != 1) {
            method569(109, (String) null);
        }
        return 1;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lpea;)V")
    public class107(class641 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(Z)V")
    public static void method567(boolean arg0) {
        field1296 = null;
        field1287 = null;
        if (arg0) {
            method569(101, (String) null);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Z")
    public final boolean method568(int arg0) {
        ++field1288;
        if (super.field5316.field9013 && super.field5316.field9071 && super.field5316.field9022) {
            this.field1297 = new class120(super.field5316);
            this.field1282 = new class379(super.field5316, 3553, 34842, 256, 256);
            this.field1282.method2299(-112, false, false);
            this.field1284 = new class379(super.field5316, 3553, 34842, 256, 256);
            this.field1284.method2299(-87, false, false);
            super.field5316.method3541(this.field1297, (byte) -13);
            this.field1297.method728(this.field1282, (byte) -108, 0);
            this.field1297.method728(this.field1284, (byte) -110, 1);
            this.field1297.method734(0, (byte) 114);
            if (!this.field1297.method737(50)) {
                super.field5316.method3522(this.field1297, -32);
                return false;
            } else {
                super.field5316.method3522(this.field1297, -107);
                this.field1295 = class529.method3008((byte) -100, new class216[] { class506.method2862(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 16686, super.field5316) }, super.field5316);
                this.field1293 = class529.method3008((byte) -82, new class216[] { class506.method2862(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 16686, super.field5316) }, super.field5316);
                this.field1289 = class529.method3008((byte) -108, new class216[] { class506.method2862(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 16686, super.field5316) }, super.field5316);
                this.field1275 = class529.method3008((byte) -124, new class216[] { class506.method2862(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 16686, super.field5316) }, super.field5316);
                return this.field1293 != null && this.field1295 != null && this.field1289 != null && this.field1275 != null;
            }
        } else {
            if (arg0 <= 51) {
                method577((byte) -96, -3, 112);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method569(int arg0, String arg1) {
        ++field1285;
        if (arg1 == null) {
            return -1;
        } else {
            for (int var2 = arg0; ~var2 > ~class110.field1323; ++var2) {
                if (arg1.equalsIgnoreCase(class320.field4711[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBI)V")
    public final void method570(int arg0, byte arg1, int arg2) {
        this.field1277 = arg0;
        this.field1274 = arg2;
        if (arg1 > 69) {
            ++field1279;
            int var4 = class20.method114(this.field1274, (byte) 109);
            int var5 = class20.method114(this.field1277, (byte) 109);
            if (this.field1278 != var4 || ~this.field1283 != ~var5) {
                if (this.field1292 != null) {
                    for (int var6 = 0; this.field1292.length > var6; ++var6) {
                        this.field1292[var6].method1588((byte) -122);
                    }
                    this.field1292 = null;
                }
                if (~var4 >= -257 && ~var5 >= -257) {
                    this.field1294 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field1294 == null) {
                        this.field1294 = new class120(super.field5316);
                    }
                    label57: while (true) {
                        if (~var7 >= -257 && var8 <= 256) {
                            int var10 = var4;
                            int var11 = var5;
                            this.field1292 = new class379[var9];
                            int var12 = 0;
                            while (true) {
                                if (var10 <= 256 && ~var11 >= -257) {
                                    break label57;
                                }
                                this.field1292[var12++] = new class379(super.field5316, 3553, 34842, var10, var11);
                                if (var10 > 256) {
                                    var10 >>= 1;
                                }
                                if (var11 > 256) {
                                    var11 >>= 1;
                                }
                            }
                        }
                        ++var9;
                        if (~var7 < -257) {
                            var7 >>= 1;
                        }
                        if (~var8 < -257) {
                            var8 >>= 1;
                        }
                    }
                }
                this.field1278 = var4;
                this.field1283 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        ++field1280;
        if (arg0 != 0) {
            this.field1274 = -24;
        }
        return super.field5316.field9013 && super.field5316.field9071 && super.field5316.field9022;
    }

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "(I)V")
    public static final void method572(int arg0) {
        ++field1299;
        int var1 = 0;
        if (class72.field935.method2695(false, class161.field2038)) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (!class72.field935.field6499) {
            var1 |= 64;
        }
        class628.method3428(var1, false);
        class578.field7980.method1744(0, var1);
        class237.field3088.method1347((byte) -41, var1);
        class318.field4640.method3382((byte) 71, var1);
        class236.field3079.method1054(var1, true);
        if (arg0 >= 122) {
            class336.method2145(var1, 30000);
            class315.method2030((byte) 91, var1);
            class518.method2948((byte) -69, var1);
            class261.method1632(var1, -115);
            class70.method413(11);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(JJ)J")
    public static long method573(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
    public final void method574(byte arg0) {
        this.field1289 = null;
        this.field1295 = null;
        this.field1297 = null;
        int var2 = 11 / ((arg0 - -29) / 59);
        this.field1282 = null;
        this.field1293 = null;
        ++field1276;
        this.field1284 = null;
        this.field1292 = null;
        this.field1275 = null;
        this.field1294 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lqw;Lqw;II)V")
    public final void method575(class379 arg0, class379 arg1, int arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field1281;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1292 == null) {
            super.field5316.method3553((byte) 81, arg0);
            super.field5316.method3541(this.field1297, (byte) -13);
            this.field1297.method734(0, (byte) 63);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field1295.field7719;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class6.field55, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1274, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1274, (float) this.field1277);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1277);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field5316.method3541(this.field1294, (byte) -13);
            int var7 = class20.method114(this.field1274, (byte) 109);
            int var8 = class20.method114(this.field1277, (byte) 109);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field1294.method728(this.field1292[var9], (byte) -113, 0);
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (~var7 < -257) {
                    var7 >>= 1;
                }
                if (~var9 != -1) {
                    super.field5316.method3553((byte) 63, this.field1292[var9 + -1]);
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
                    super.field5316.method3553((byte) 20, arg0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1274, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1274, (float) this.field1277);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1277);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var9;
            }
            super.field5316.method3522(this.field1294, -109);
            super.field5316.method3553((byte) 54, this.field1292[var9 + -1]);
            super.field5316.method3541(this.field1297, (byte) -13);
            this.field1297.method734(0, (byte) 116);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1293.field7719;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class6.field55, 0.0F, 0.0F);
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
        this.field1297.method734(arg2, (byte) 97);
        super.field5316.method3553((byte) 109, this.field1282);
        long var12 = this.field1275.field7719;
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
        this.field1297.method734(0, (byte) 36);
        super.field5316.method3553((byte) 65, this.field1284);
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
        super.field5316.method3522(this.field1297, -42);
        long var14 = this.field1289.field7719;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class173.field2159, class299.field4000, 0.0F);
        super.field5316.method3488(1, (byte) 23);
        super.field5316.method3553((byte) 28, this.field1282);
        super.field5316.method3488(0, (byte) 23);
        super.field5316.method3553((byte) 52, arg0);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
    public final void method576(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field1298;
        super.field5316.method3488(arg1, (byte) 23);
        super.field5316.method3553((byte) 41, (class254) null);
        super.field5316.method3488(0, (byte) 23);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BII)Z")
    public static final boolean method577(byte arg0, int arg1, int arg2) {
        ++field1290;
        if (arg0 != -60) {
            return false;
        } else {
            return ~(arg2 & 458752) != -1 | class61.method382(arg2, 124, arg1) || class629.method3441(arg2, arg1, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(Z)Z")
    public final boolean method578(boolean arg0) {
        ++field1286;
        if (arg0) {
            this.field1274 = 68;
        }
        return this.field1297 != null;
    }
}
