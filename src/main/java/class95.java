import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class95 extends class156 {

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    private int field1176;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "Lnfa;")
    private class680 field1157;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Lnfa;")
    private class680 field1163;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "Lnfa;")
    private class680 field1164;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "Lnfa;")
    private class680 field1168;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "Lsia;")
    private class737 field1160;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Lsia;")
    private class737 field1170;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Lnh;")
    private class749 field1153;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "Lnh;")
    private class749 field1165;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "[Lsia;")
    private class737[] field1172;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method708(int arg0, String arg1) {
        if (arg0 != 256) {
            method710(58, -83, -23, (class376) null, 70, false, -81L);
        }
        ++field1162;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; ++var4) {
            char var5 = arg1.charAt(var4);
            if (~var5 == -38 && var4 + 2 < var3) {
                char var6 = arg1.charAt(var4 - -1);
                boolean var7 = false;
                int var8;
                if (~var6 <= -49 && var6 <= '9') {
                    var8 = var6 + -48;
                } else if (var6 >= 'a' && ~var6 >= -103) {
                    var8 = 10 - -var6 + -97;
                } else {
                    if (~var6 > -66 || ~var6 < -71) {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 - 'A' + 10;
                }
                char var9 = arg1.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && ~var9 >= -58) {
                    var11 = var9 + -48 + var10;
                } else if (~var9 <= -98 && var9 <= 'f') {
                    var11 = var9 + '\n' + -97 + var10;
                } else {
                    if (~var9 > -66 || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + -65 + 10 + var10;
                }
                if (~var11 != -1 && class604.method3291((byte) var11, arg0 ^ -346)) {
                    var2.append(class703.method3957((byte) -71, (byte) var11));
                }
                var4 += 2;
            } else if (var5 != '+') {
                var2.append(var5);
            } else {
                var2.append(' ');
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lsia;Lsia;II)V")
    public final void method709(class737 arg0, class737 arg1, int arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field1169;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1172 != null) {
            super.field2383.method3623(this.field1165, arg2 + 12103);
            int var5 = class658.method3571(27690, this.field1158);
            int var6 = class658.method3571(27690, this.field1174);
            int var7 = 0;
            while (var5 > 256 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field1165.method4195(-22433, 0, this.field1172[var7]);
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (var7 != 0) {
                    super.field2383.method3639(arg2 ^ 12103, this.field1172[var7 + -1]);
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
                    super.field2383.method3639(-2, arg0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1158, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1158, (float) this.field1174);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1174);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                ++var7;
            }
            super.field2383.method3637(this.field1165, -128);
            super.field2383.method3639(arg2 + 12101, this.field1172[var7 - 1]);
            super.field2383.method3623(this.field1153, 0);
            this.field1153.method4201(0, false);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field1157.field9499;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class442.field6097, 0.0F, 0.0F);
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
            super.field2383.method3639(-2, arg0);
            super.field2383.method3623(this.field1153, 0);
            this.field1153.method4201(0, false);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1164.field9499;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class442.field6097, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1158, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1158, (float) this.field1174);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1174);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1153.method4201(1, false);
        super.field2383.method3639(-2, this.field1170);
        long var12 = this.field1168.field9499;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        if (arg2 != -12103) {
            this.field1165 = null;
        }
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        this.field1153.method4201(0, false);
        super.field2383.method3639(-2, this.field1160);
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
        super.field2383.method3637(this.field1153, 49);
        long var14 = this.field1163.field9499;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class559.field7360, class326.field4658, 0.0F);
        super.field2383.method3630(true, 1);
        super.field2383.method3639(-2, this.field1170);
        super.field2383.method3630(true, 0);
        super.field2383.method3639(-2, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILwu;IZJ)V")
    public static final void method710(int arg0, int arg1, int arg2, class376 arg3, int arg4, boolean arg5, long arg6) {
        ++field1151;
        class121.method974(arg1, arg4, arg2, arg6, arg5, arg3, 0, 0);
        if (arg0 < 72) {
            method716((byte) -106);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lrda;)V")
    public class95(class663 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)Z")
    public final boolean method711(boolean arg0) {
        ++field1173;
        if (!arg0) {
            this.field1160 = null;
        }
        return this.field1153 != null;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)I")
    public final int method712(byte arg0) {
        if (arg0 != 30) {
            this.method709((class737) null, (class737) null, -27, 9);
        }
        ++field1171;
        return 1;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Z")
    public final boolean method713(int arg0) {
        if (arg0 != 1) {
            method708(13, (String) null);
        }
        ++field1175;
        if (super.field2383.field8985 && super.field2383.field9079 && super.field2383.field9056) {
            this.field1153 = new class749(super.field2383);
            this.field1170 = new class737(super.field2383, 3553, 34842, 256, 256);
            this.field1170.method4116((byte) -60, false, false);
            this.field1160 = new class737(super.field2383, 3553, 34842, 256, 256);
            this.field1160.method4116((byte) -60, false, false);
            super.field2383.method3623(this.field1153, arg0 + -1);
            this.field1153.method4195(-22433, 0, this.field1170);
            this.field1153.method4195(-22433, 1, this.field1160);
            this.field1153.method4201(0, false);
            if (!this.field1153.method4187(69)) {
                super.field2383.method3637(this.field1153, -99);
                return false;
            } else {
                super.field2383.method3637(this.field1153, arg0 + -118);
                this.field1164 = class373.method2186(super.field2383, new class551[] { class380.method2244(4, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.field2383) }, -96);
                this.field1157 = class373.method2186(super.field2383, new class551[] { class380.method2244(4, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.field2383) }, -94);
                this.field1163 = class373.method2186(super.field2383, new class551[] { class380.method2244(4, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, super.field2383) }, -81);
                this.field1168 = class373.method2186(super.field2383, new class551[] { class380.method2244(4, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, super.field2383) }, -87);
                return this.field1157 != null && this.field1164 != null && this.field1163 != null && this.field1168 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
    public final void method714(int arg0, int arg1, int arg2) {
        ++field1156;
        this.field1174 = arg0;
        if (arg2 == 2048) {
            this.field1158 = arg1;
            int var4 = class658.method3571(27690, this.field1158);
            int var5 = class658.method3571(arg2 ^ 25642, this.field1174);
            if (this.field1176 != var4 || this.field1155 != var5) {
                if (this.field1172 != null) {
                    for (int var6 = 0; var6 < this.field1172.length; ++var6) {
                        this.field1172[var6].method2618(79);
                    }
                    this.field1172 = null;
                }
                if (~var4 >= -257 && ~var5 >= -257) {
                    this.field1165 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    label62: while (true) {
                        if (~var7 >= -257 && var8 <= 256) {
                            if (this.field1165 == null) {
                                this.field1165 = new class749(super.field2383);
                            }
                            int var10 = var4;
                            this.field1172 = new class737[var9];
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (~var10 >= -257 && var11 <= 256) {
                                    break label62;
                                }
                                this.field1172[var12++] = new class737(super.field2383, 3553, 34842, var10, var11);
                                if (~var11 < -257) {
                                    var11 >>= 1;
                                }
                                if (var10 > 256) {
                                    var10 >>= 1;
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
                this.field1155 = var5;
                this.field1176 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IZ)V")
    public final void method715(int arg0, boolean arg1) {
        ++field1167;
        OpenGL.glUseProgramObjectARB(0L);
        super.field2383.method3630(arg1, 1);
        super.field2383.method3639(-2, (class460) null);
        super.field2383.method3630(true, 0);
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
    public static final void method716(byte arg0) {
        ++field1154;
        if (class411.field5711.field3890.method984(true) == 0 && class507.field6775 != class489.field6638) {
            class616.method3375(class161.field2401, false, 11, class88.field1069, 0);
        } else {
            class109.method799(class341.field4807, -1445596343);
            if (~class507.field6775 != ~class290.field4147) {
                class393.method2322(-1);
            }
            if (arg0 != 34) {
                field1159 = -105;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(Z)V")
    public final void method717(boolean arg0) {
        this.field1160 = null;
        if (arg0) {
            this.method711(true);
        }
        this.field1157 = null;
        this.field1153 = null;
        this.field1170 = null;
        ++field1161;
        this.field1164 = null;
        this.field1163 = null;
        this.field1165 = null;
        this.field1168 = null;
        this.field1172 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)I")
    public static final int method718(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method708(-26, (String) null);
        }
        ++field1152;
        int var3 = arg1 >>> 24;
        int var4 = (-16711936 & (16711935 & arg1) * var3 | (arg1 & 65280) * var3 & 16711680) >>> 8;
        int var5 = -var3 + 255;
        return ((16711680 & (65280 & arg0) * var5 | -16711936 & (16711935 & arg0) * var5) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)Z")
    public final boolean method719(int arg0) {
        if (arg0 != 0) {
            this.method715(-79, false);
        }
        ++field1166;
        return super.field2383.field8985 && super.field2383.field9079 && super.field2383.field9056;
    }
}
