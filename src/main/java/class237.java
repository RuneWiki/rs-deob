import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class237 extends class209 {

    @OriginalMember(owner = "client!ida", name = "D", descriptor = "Lhe;")
    public static class372 field3436 = new class372(16);

    @OriginalMember(owner = "client!ida", name = "V", descriptor = "Ljava/lang/String;")
    public static String field3454 = null;

    @OriginalMember(owner = "client!ida", name = "B", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ida", name = "C", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ida", name = "E", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ida", name = "G", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ida", name = "I", descriptor = "I")
    private int field3441;

    @OriginalMember(owner = "client!ida", name = "L", descriptor = "I")
    private int field3444;

    @OriginalMember(owner = "client!ida", name = "M", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!ida", name = "N", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ida", name = "R", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ida", name = "S", descriptor = "I")
    private int field3451;

    @OriginalMember(owner = "client!ida", name = "T", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ida", name = "W", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ida", name = "X", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ida", name = "Z", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ida", name = "ab", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ida", name = "H", descriptor = "Lrv;")
    private class111 field3440;

    @OriginalMember(owner = "client!ida", name = "J", descriptor = "Lrv;")
    private class111 field3442;

    @OriginalMember(owner = "client!ida", name = "K", descriptor = "Lrv;")
    private class111 field3443;

    @OriginalMember(owner = "client!ida", name = "Y", descriptor = "Lrv;")
    private class111 field3457;

    @OriginalMember(owner = "client!ida", name = "O", descriptor = "Liha;")
    private class30 field3447;

    @OriginalMember(owner = "client!ida", name = "U", descriptor = "Liha;")
    private class30 field3453;

    @OriginalMember(owner = "client!ida", name = "F", descriptor = "Law;")
    private class76 field3438;

    @OriginalMember(owner = "client!ida", name = "Q", descriptor = "Law;")
    private class76 field3449;

    @OriginalMember(owner = "client!ida", name = "P", descriptor = "[Law;")
    private class76[] field3448;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "(B)V", line = 6)
    public static final void method1570(byte arg0) {
        ++field3458;
        if (arg0 != 113) {
            field3436 = null;
        }
        class93.field1289.method800(89);
    }

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "(I)I", line = 17)
    public final int method1419(int arg0) {
        if (arg0 < 40) {
            this.method1573(-105);
        }
        ++field3459;
        return 1;
    }

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "(B)V", line = 32)
    public static void method1571(byte arg0) {
        field3454 = null;
        field3436 = null;
        if (arg0 < 109) {
            method1572(-70, true, -70, (byte) -30, 67);
        }
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lwh;)V", line = 44)
    public class237(class148 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(IZ)V", line = 47)
    public final void method1414(int arg0, boolean arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field3456;
        if (!arg1) {
            this.method1409(29);
        }
        super.field3065.method1024(1, (byte) -11);
        super.field3065.method1088((class195) null, -27749);
        super.field3065.method1024(0, (byte) -11);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZIBI)V", line = 64)
    public static final void method1572(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        ++field3450;
        if (arg3 != 0) {
            field3454 = null;
        }
        if (class245.method1632(816183856, arg0)) {
            class344.method2182(arg2, arg4, (byte) 81, arg1, -1, class86.field1229[arg0]);
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)Z", line = 80)
    public final boolean method1409(int arg0) {
        ++field3434;
        if (arg0 != 0) {
            this.field3440 = null;
        }
        return this.field3447 != null;
    }

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "(I)Z", line = 96)
    public final boolean method1573(int arg0) {
        ++field3439;
        if (arg0 != 16422) {
            return false;
        } else {
            return super.field3065.field2205 && super.field3065.field2273 && super.field3065.field2307;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)V", line = 111)
    public final void method1408(byte arg0) {
        int var2 = -11 / ((5 - arg0) / 47);
        this.field3442 = null;
        this.field3449 = null;
        ++field3446;
        this.field3443 = null;
        this.field3447 = null;
        this.field3457 = null;
        this.field3453 = null;
        this.field3438 = null;
        this.field3448 = null;
        this.field3440 = null;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IILaw;Law;)V", line = 129)
    public final void method1417(int arg0, int arg1, class76 arg2, class76 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field3435;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3448 != null) {
            super.field3065.method1098(this.field3453, 495185768);
            int var5 = class505.method2996(this.field3444, 20);
            int var6 = class505.method2996(this.field3441, -83);
            int var7 = 0;
            while (var5 > 256 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field3453.method151(0, this.field3448[var7], 110);
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (~var7 != -1) {
                    super.field3065.method1088(this.field3448[var7 - 1], -27749);
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
                    super.field3065.method1088(arg2, -27749);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field3444, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field3444, (float) this.field3441);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3441);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field3065.method1059(this.field3453, 515);
            super.field3065.method1088(this.field3448[var7 + -1], -27749);
            super.field3065.method1098(this.field3447, 495185768);
            this.field3447.method150(0, true);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field3457.field1549;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class214.field3193, 0.0F, 0.0F);
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
            super.field3065.method1088(arg2, -27749);
            super.field3065.method1098(this.field3447, 495185768);
            this.field3447.method150(0, true);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field3440.field1549;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class214.field3193, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field3444, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field3444, (float) this.field3441);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field3441);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field3447.method150(1, true);
        super.field3065.method1088(this.field3449, -27749);
        long var12 = this.field3442.field1549;
        if (arg0 <= -122) {
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
            this.field3447.method150(0, true);
            super.field3065.method1088(this.field3438, -27749);
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
            super.field3065.method1059(this.field3447, 515);
            long var14 = this.field3443.field1549;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class114.field1579, class489.field6992, 0.0F);
            super.field3065.method1024(1, (byte) -11);
            super.field3065.method1088(this.field3449, -27749);
            super.field3065.method1024(0, (byte) -11);
            super.field3065.method1088(arg2, -27749);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Z", line = 284)
    public final boolean method1407(int arg0) {
        ++field3452;
        if (arg0 > -118) {
            return false;
        } else if (super.field3065.field2205 && super.field3065.field2273 && super.field3065.field2307) {
            this.field3447 = new class30(super.field3065);
            this.field3449 = new class76(super.field3065, 3553, 34842, 256, 256);
            this.field3449.method636(false, 10497, false);
            this.field3438 = new class76(super.field3065, 3553, 34842, 256, 256);
            this.field3438.method636(false, 10497, false);
            super.field3065.method1098(this.field3447, 495185768);
            this.field3447.method151(0, this.field3449, 84);
            this.field3447.method151(1, this.field3438, 82);
            this.field3447.method150(0, true);
            if (!this.field3447.method154(239)) {
                super.field3065.method1059(this.field3447, 515);
                return false;
            } else {
                super.field3065.method1059(this.field3447, 515);
                this.field3440 = class734.method4132(new class396[] { class758.method4225(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field3065, (byte) 120) }, super.field3065, 14964);
                this.field3457 = class734.method4132(new class396[] { class758.method4225(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field3065, (byte) 110) }, super.field3065, 14964);
                this.field3443 = class734.method4132(new class396[] { class758.method4225(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field3065, (byte) 115) }, super.field3065, 14964);
                this.field3442 = class734.method4132(new class396[] { class758.method4225(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field3065, (byte) 109) }, super.field3065, 14964);
                return this.field3457 != null && this.field3440 != null && this.field3443 != null && this.field3442 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "([Ljava/lang/String;I[S)V", line = 326)
    public static final void method1574(String[] arg0, int arg1, short[] arg2) {
        ++field3437;
        class252.method1661(0, arg0.length + arg1, arg0, arg2, (byte) -124);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)V", line = 341)
    public final void method1418(int arg0, int arg1, int arg2) {
        ++field3455;
        this.field3444 = arg1;
        this.field3441 = arg0;
        int var4 = class505.method2996(this.field3444, -113);
        if (arg2 < 10) {
            this.field3443 = null;
        }
        int var5 = class505.method2996(this.field3441, -108);
        if (~this.field3451 != ~var4 || ~this.field3445 != ~var5) {
            if (this.field3448 != null) {
                for (int var6 = 0; this.field3448.length > var6; ++var6) {
                    this.field3448[var6].method1351(109);
                }
                this.field3448 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field3453 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label61: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        if (this.field3453 == null) {
                            this.field3453 = new class30(super.field3065);
                        }
                        this.field3448 = new class76[var9];
                        int var10 = var4;
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (var10 <= 256 && var11 <= 256) {
                                break label61;
                            }
                            this.field3448[var12++] = new class76(super.field3065, 3553, 34842, var10, var11);
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                        }
                    }
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field3451 = var4;
            this.field3445 = var5;
        }
    }
}
