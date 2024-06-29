import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class81 extends class426 {

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "Lvr;")
    public static class187 field1144 = new class187("LIVE", 0);

    @OriginalMember(owner = "client!cq", name = "V", descriptor = "[I")
    public static int[] field1159 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!cq", name = "Q", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!cq", name = "W", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!cq", name = "X", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "Lbd;")
    private class142 field1138;

    @OriginalMember(owner = "client!cq", name = "T", descriptor = "Lbd;")
    private class142 field1157;

    @OriginalMember(owner = "client!cq", name = "U", descriptor = "Lpf;")
    public static class487 field1158;

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "Leb;")
    private class60 field1139;

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "Leb;")
    private class60 field1146;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "Lie;")
    private class88 field1135;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "Lie;")
    private class88 field1137;

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "Lie;")
    private class88 field1147;

    @OriginalMember(owner = "client!cq", name = "R", descriptor = "Lie;")
    private class88 field1155;

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "[Lbd;")
    private class142[] field1152;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V", line = 4)
    public static final void method620(int arg0, int arg1) {
        ++field1143;
        if (class87.field1418 != arg1) {
            class390.field5635 = arg0;
        } else {
            class443.field6380.method1014(-129, arg0);
        }
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V", line = 22)
    public final void method621(int arg0) {
        this.field1137 = null;
        if (arg0 != 1) {
            this.field1152 = null;
        }
        ++field1145;
        this.field1139 = null;
        this.field1146 = null;
        this.field1155 = null;
        this.field1157 = null;
        this.field1147 = null;
        this.field1152 = null;
        this.field1138 = null;
        this.field1135 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)V", line = 41)
    public final void method622(boolean arg0, int arg1, int arg2) {
        this.field1150 = arg1;
        this.field1156 = arg2;
        ++field1148;
        int var4 = class166.method1158(true, this.field1150);
        int var5 = class166.method1158(arg0, this.field1156);
        if (~this.field1149 != ~var4 || this.field1151 != var5) {
            if (this.field1152 != null) {
                for (int var6 = 0; ~var6 > ~this.field1152.length; ++var6) {
                    this.field1152[var6].method923(-31252);
                }
                this.field1152 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field1146 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label57: while (true) {
                    if (var7 <= 256 && ~var8 >= -257) {
                        if (this.field1146 == null) {
                            this.field1146 = new class60(super.field6193);
                        }
                        int var10 = var4;
                        this.field1152 = new class142[var9];
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && var11 <= 256) {
                                break label57;
                            }
                            this.field1152[var12++] = new class142(super.field6193, 3553, 34842, var10, var11);
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                        }
                    }
                    ++var9;
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                }
            }
            this.field1149 = var4;
            this.field1151 = var5;
        }
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)V", line = 117)
    public static void method623(int arg0) {
        field1144 = null;
        if (arg0 != 1) {
            field1159 = null;
        }
        field1159 = null;
        field1158 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILbd;ILbd;)V", line = 131)
    public final void method624(int arg0, class142 arg1, int arg2, class142 arg3) {
        ++field1140;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1152 != null) {
            super.field6193.method2001(this.field1146, 97);
            int var5 = class166.method1158(true, this.field1150);
            int var6 = class166.method1158(true, this.field1156);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field1146.method405(-74, 0, this.field1152[var7]);
                if (~var7 == -1) {
                    super.field6193.method1977(arg1, true);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1150, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1150, (float) this.field1156);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1156);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field6193.method1977(this.field1152[var7 + -1], true);
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
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (var5 > 256) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field6193.method1970(this.field1146, true);
            super.field6193.method1977(this.field1152[var7 + -1], true);
            super.field6193.method2001(this.field1139, 90);
            this.field1139.method388(-120, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field1147.field1425;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class219.field3094, 0.0F, 0.0F);
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
            super.field6193.method1977(arg1, true);
            super.field6193.method2001(this.field1139, 75);
            this.field1139.method388(-124, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1137.field1425;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class219.field3094, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1150, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1150, (float) this.field1156);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1156);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1139.method388(-128, 1);
        super.field6193.method1977(this.field1138, true);
        long var12 = this.field1155.field1425;
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
        this.field1139.method388(-115, 0);
        super.field6193.method1977(this.field1157, true);
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
        super.field6193.method1970(this.field1139, true);
        long var14 = this.field1135.field1425;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class147.field2260, class309.field4207, 0.0F);
        super.field6193.method1990(false, 1);
        super.field6193.method1977(this.field1138, true);
        super.field6193.method1990(false, 0);
        super.field6193.method1977(arg1, true);
        if (arg2 > -126) {
            method620(60, -91);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)V", line = 298)
    public final void method625(int arg0, byte arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field1142;
        super.field6193.method1990(false, 1);
        super.field6193.method1977((class128) null, true);
        if (arg1 < -86) {
            super.field6193.method1990(false, 0);
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)I", line = 312)
    public final int method626(byte arg0) {
        ++field1160;
        if (arg0 != -2) {
            field1159 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lpg;)V", line = 326)
    public class81(class333 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)Z", line = 329)
    public final boolean method627(int arg0) {
        if (arg0 != 1) {
            field1158 = null;
        }
        ++field1136;
        return this.field1139 != null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ICI)I", line = 343)
    public static final int method628(int arg0, char arg1, int arg2) {
        ++field1141;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (~arg1 == -242 && arg2 == 0) {
            var3 = 1762;
        }
        return arg0 != 16640 ? -60 : var3;
    }

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "(B)Z", line = 367)
    public final boolean method629(byte arg0) {
        if (arg0 != 23) {
            this.method621(-51);
        }
        ++field1161;
        return super.field6193.field4773 && super.field6193.field4756 && super.field6193.field4765;
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(B)Z", line = 378)
    public final boolean method630(byte arg0) {
        ++field1153;
        if (super.field6193.field4773 && super.field6193.field4756 && super.field6193.field4765) {
            this.field1139 = new class60(super.field6193);
            this.field1138 = new class142(super.field6193, 3553, 34842, 256, 256);
            this.field1138.method990(false, 1024, false);
            this.field1157 = new class142(super.field6193, 3553, 34842, 256, 256);
            this.field1157.method990(false, 1024, false);
            super.field6193.method2001(this.field1139, 116);
            this.field1139.method405(arg0 ^ 86, 0, this.field1138);
            this.field1139.method405(arg0 + -8, 1, this.field1157);
            this.field1139.method388(arg0 ^ 91, 0);
            if (!this.field1139.method401(arg0 ^ 46)) {
                super.field6193.method1970(this.field1139, true);
                return false;
            } else {
                super.field6193.method1970(this.field1139, true);
                this.field1137 = class370.method2208(new class508[] { class510.method3025(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field6193, (byte) 47) }, super.field6193, false);
                this.field1147 = class370.method2208(new class508[] { class510.method3025(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field6193, (byte) -64) }, super.field6193, false);
                this.field1135 = class370.method2208(new class508[] { class510.method3025(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field6193, (byte) -102) }, super.field6193, false);
                this.field1155 = class370.method2208(new class508[] { class510.method3025(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field6193, (byte) 75) }, super.field6193, false);
                return this.field1147 != null && this.field1137 != null && this.field1135 != null && this.field1155 != null;
            }
        } else {
            return arg0 != -47 ? false : false;
        }
    }
}
