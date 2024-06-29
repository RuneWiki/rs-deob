import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class70 extends class345 {

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public static int field1213 = 0;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field1215 = 0;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "Lvh;")
    private class240 field1214;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "Lvh;")
    private class240 field1217;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "Lmf;")
    private class286 field1211;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Lmf;")
    private class286 field1212;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Lwf;")
    private class88 field1206;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Lwf;")
    private class88 field1218;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Lwf;")
    private class88 field1222;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Lwf;")
    private class88 field1226;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "[Lmf;")
    private class286[] field1229;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V", line = 3)
    public final void method570(int arg0) {
        this.field1217 = null;
        this.field1212 = null;
        if (arg0 != 1) {
            this.method575((byte) 15);
        }
        this.field1214 = null;
        this.field1218 = null;
        ++field1223;
        this.field1206 = null;
        this.field1229 = null;
        this.field1226 = null;
        this.field1211 = null;
        this.field1222 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BC)Z", line = 29)
    public static final boolean method571(byte arg0, char arg1) {
        ++field1220;
        if (arg0 >= -49) {
            return true;
        } else if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= 160 && ~arg1 >= -256) {
            return true;
        } else {
            return arg1 == 8364 || ~arg1 == -339 || ~arg1 == -8213 || arg1 == 339 || ~arg1 == -377;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILmf;Lmf;I)V", line = 58)
    public final void method572(int arg0, class286 arg1, class286 arg2, int arg3) {
        ++field1219;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1229 != null) {
            super.field5176.method1945(this.field1217, false);
            int var5 = class338.method2165(this.field1228, 1006);
            int var6 = class338.method2165(this.field1208, 1006);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field1217.method1574(0, (byte) 120, this.field1229[var7]);
                if (~var6 < -257) {
                    var6 >>= 1;
                }
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (~var7 != -1) {
                    super.field5176.method1990(this.field1229[var7 + -1], 11864);
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
                    super.field5176.method1990(arg2, 11864);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1228, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1228, (float) this.field1208);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1208);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field5176.method1916(this.field1217, 106);
            super.field5176.method1990(this.field1229[var7 - 1], 11864);
            super.field5176.method1945(this.field1214, false);
            this.field1214.method1575(0, 2);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field1206.field1539;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class42.field826, 0.0F, 0.0F);
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
            super.field5176.method1990(arg2, 11864);
            super.field5176.method1945(this.field1214, false);
            this.field1214.method1575(0, 2);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1222.field1539;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class42.field826, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1228, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1228, (float) this.field1208);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1208);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1214.method1575(1, 2);
        super.field5176.method1990(this.field1211, 11864);
        long var12 = this.field1218.field1539;
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
        this.field1214.method1575(0, 2);
        super.field5176.method1990(this.field1212, 11864);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        if (arg0 >= 56) {
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
            super.field5176.method1916(this.field1214, 109);
            long var14 = this.field1226.field1539;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class482.field7168, class474.field7094, 0.0F);
            super.field5176.method1929(1, (byte) 113);
            super.field5176.method1990(this.field1211, 11864);
            super.field5176.method1929(0, (byte) 106);
            super.field5176.method1990(arg2, 11864);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)I", line = 219)
    public final int method573(int arg0) {
        ++field1227;
        if (arg0 != 18433) {
            field1213 = 73;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V", line = 230)
    public final void method574(int arg0, int arg1, int arg2) {
        this.field1228 = arg2;
        if (arg1 == 437) {
            ++field1221;
            this.field1208 = arg0;
            int var4 = class338.method2165(this.field1228, 1006);
            int var5 = class338.method2165(this.field1208, 1006);
            if (~this.field1225 != ~var4 || ~this.field1207 != ~var5) {
                if (this.field1229 != null) {
                    for (int var6 = 0; ~var6 > ~this.field1229.length; ++var6) {
                        this.field1229[var6].method2931(114);
                    }
                    this.field1229 = null;
                }
                if (var4 <= 256 && var5 <= 256) {
                    this.field1217 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field1217 == null) {
                        this.field1217 = new class240(super.field5176);
                    }
                    label57: while (true) {
                        if (~var7 >= -257 && ~var8 >= -257) {
                            this.field1229 = new class286[var9];
                            int var10 = var4;
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (var10 <= 256 && ~var11 >= -257) {
                                    break label57;
                                }
                                this.field1229[var12++] = new class286(super.field5176, 3553, 34842, var10, var11);
                                if (~var11 < -257) {
                                    var11 >>= 1;
                                }
                                if (~var10 < -257) {
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
                this.field1207 = var5;
                this.field1225 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)Z", line = 306)
    public final boolean method575(byte arg0) {
        ++field1210;
        if (super.field5176.field4532 && super.field5176.field4612 && super.field5176.field4571) {
            this.field1214 = new class240(super.field5176);
            this.field1211 = new class286(super.field5176, 3553, 34842, 256, 256);
            this.field1211.method1818(false, (byte) 109, false);
            this.field1212 = new class286(super.field5176, 3553, 34842, 256, 256);
            this.field1212.method1818(false, (byte) 107, false);
            super.field5176.method1945(this.field1214, false);
            this.field1214.method1574(0, (byte) 109, this.field1211);
            this.field1214.method1574(1, (byte) 100, this.field1212);
            this.field1214.method1575(0, 2);
            if (!this.field1214.method1567(106)) {
                super.field5176.method1916(this.field1214, 104);
                return false;
            } else {
                super.field5176.method1916(this.field1214, 95);
                this.field1222 = class5.method40(new class108[] { class88.method693(1, 35632, super.field5176, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, false, super.field5176);
                this.field1206 = class5.method40(new class108[] { class88.method693(1, 35632, super.field5176, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, false, super.field5176);
                this.field1226 = class5.method40(new class108[] { class88.method693(1, 35632, super.field5176, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, false, super.field5176);
                this.field1218 = class5.method40(new class108[] { class88.method693(1, 35632, super.field5176, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, false, super.field5176);
                return this.field1206 != null && this.field1222 != null && this.field1226 != null && this.field1218 != null;
            }
        } else {
            return arg0 < 63 ? false : false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)Z", line = 344)
    public final boolean method576(int arg0) {
        ++field1224;
        if (arg0 != 1) {
            this.method576(-48);
        }
        return super.field5176.field4532 && super.field5176.field4612 && super.field5176.field4571;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)Z", line = 360)
    public final boolean method577(int arg0) {
        if (arg0 != 35632) {
            this.field1208 = 44;
        }
        ++field1216;
        return this.field1214 != null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V", line = 372)
    public final void method578(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field1209;
        super.field5176.method1929(arg1, (byte) 96);
        super.field5176.method1990((class492) null, arg1 ^ 11865);
        super.field5176.method1929(0, (byte) 104);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lvj;)V", line = 388)
    public class70(class303 arg0) {
        super(arg0);
    }
}
