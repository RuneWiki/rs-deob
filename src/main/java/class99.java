import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class99 extends class511 {

    @OriginalMember(owner = "client!aaa", name = "D", descriptor = "Lqp;")
    public static class586 field1232 = new class586(102, 12);

    @OriginalMember(owner = "client!aaa", name = "L", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!aaa", name = "X", descriptor = "Lqp;")
    public static class586 field1252 = new class586(41, -1);

    @OriginalMember(owner = "client!aaa", name = "Z", descriptor = "I")
    public static int field1254 = 0;

    @OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!aaa", name = "B", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!aaa", name = "C", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!aaa", name = "E", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!aaa", name = "F", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client!aaa", name = "H", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!aaa", name = "I", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!aaa", name = "J", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!aaa", name = "K", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!aaa", name = "M", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!aaa", name = "N", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!aaa", name = "P", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!aaa", name = "Q", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client!aaa", name = "T", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!aaa", name = "U", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!aaa", name = "y", descriptor = "Lot;")
    private class210 field1227;

    @OriginalMember(owner = "client!aaa", name = "W", descriptor = "Lot;")
    private class210 field1251;

    @OriginalMember(owner = "client!aaa", name = "A", descriptor = "Lvb;")
    private class292 field1229;

    @OriginalMember(owner = "client!aaa", name = "V", descriptor = "Lvb;")
    private class292 field1250;

    @OriginalMember(owner = "client!aaa", name = "G", descriptor = "Ldca;")
    private class501 field1235;

    @OriginalMember(owner = "client!aaa", name = "O", descriptor = "Ldca;")
    private class501 field1243;

    @OriginalMember(owner = "client!aaa", name = "R", descriptor = "Ldca;")
    private class501 field1246;

    @OriginalMember(owner = "client!aaa", name = "S", descriptor = "Ldca;")
    private class501 field1247;

    @OriginalMember(owner = "client!aaa", name = "Y", descriptor = "[Lot;")
    private class210[] field1253;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)Z")
    public final boolean method576(int arg0) {
        ++field1236;
        if (arg0 != 0) {
            method579((byte) -66, false);
        }
        return this.field1229 != null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)V")
    public static void method577(boolean arg0) {
        field1232 = null;
        if (!arg0) {
            field1252 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BIIII)I")
    public static final int method578(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1239;
        int var5 = arg1 & 15;
        int var6 = ~var5 <= -9 ? arg2 : arg3;
        int var7 = 58 % ((-18 - arg0) / 44);
        int var8 = var5 < 4 ? arg2 : (var5 != 12 && ~var5 != -15 ? arg4 : arg3);
        return (~(1 & var5) != -1 ? -var6 : var6) - -(~(2 & var5) == -1 ? var8 : -var8);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BZ)Z")
    public static final boolean method579(byte arg0, boolean arg1) {
        ++field1242;
        boolean var2 = class379.field5558.method345();
        int var3 = -71 % ((arg0 - -8) / 42);
        if (arg1 != var2) {
            if (arg1) {
                if (!class379.field5558.method278()) {
                    arg1 = false;
                }
            } else {
                class379.field5558.method341();
            }
            if (var2 != !arg1) {
                return false;
            } else {
                class94.field1158.field297 = arg1;
                class94.field1158.method2661(class328.field4850, -1);
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILot;Lot;I)V")
    public final void method580(int arg0, class210 arg1, class210 arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field1249;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        if (arg3 >= -63) {
            this.field1250 = null;
        }
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1253 != null) {
            super.field7589.method2789(0, this.field1250);
            int var5 = class239.method1537(-24644, this.field1241);
            int var6 = class239.method1537(-24644, this.field1238);
            int var7 = 0;
            while (var5 > 256 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field1250.method1818(this.field1253[var7], 0, (byte) -127);
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (var5 > 256) {
                    var5 >>= 1;
                }
                if (var7 != 0) {
                    super.field7589.method2811(this.field1253[var7 + -1], -2);
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
                    super.field7589.method2811(arg2, -2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1241, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1241, (float) this.field1238);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1238);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field7589.method2788((byte) -118, this.field1250);
            super.field7589.method2811(this.field1253[var7 + -1], -2);
            super.field7589.method2789(0, this.field1229);
            this.field1229.method1804((byte) -128, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field1247.field7498;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class298.field4355, 0.0F, 0.0F);
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
            super.field7589.method2811(arg2, -2);
            super.field7589.method2789(0, this.field1229);
            this.field1229.method1804((byte) -44, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1243.field7498;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class298.field4355, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1241, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1241, (float) this.field1238);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1238);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1229.method1804((byte) -55, 1);
        super.field7589.method2811(this.field1227, -2);
        long var12 = this.field1246.field7498;
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
        this.field1229.method1804((byte) 126, 0);
        super.field7589.method2811(this.field1251, -2);
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
        super.field7589.method2788((byte) -118, this.field1229);
        long var14 = this.field1235.field7498;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class56.field688, class580.field8540, 0.0F);
        super.field7589.method2842(1, (byte) 42);
        super.field7589.method2811(this.field1227, -2);
        super.field7589.method2842(0, (byte) 42);
        super.field7589.method2811(arg2, -2);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lwo;I)I")
    public static final int method581(class408 arg0, int arg1) {
        ++field1248;
        if (arg1 >= -45) {
            field1254 = -63;
        }
        if (class553.field8228 != arg0) {
            if (class493.field7446 != arg0) {
                if (class161.field2156 == arg0) {
                    return 34066;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 34065;
            }
        } else {
            return 9216;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "(I)Z")
    public final boolean method582(int arg0) {
        ++field1231;
        if (arg0 != -21906) {
            this.field1227 = null;
        }
        if (super.field7589.field6993 && super.field7589.field7077 && super.field7589.field7067) {
            this.field1229 = new class292(super.field7589);
            this.field1227 = new class210(super.field7589, 3553, 34842, 256, 256);
            this.field1227.method1359(10497, false, false);
            this.field1251 = new class210(super.field7589, 3553, 34842, 256, 256);
            this.field1251.method1359(arg0 + 32403, false, false);
            super.field7589.method2789(0, this.field1229);
            this.field1229.method1818(this.field1227, 0, (byte) -103);
            this.field1229.method1818(this.field1251, 1, (byte) -43);
            this.field1229.method1804((byte) 105, 0);
            if (!this.field1229.method1814(false)) {
                super.field7589.method2788((byte) -118, this.field1229);
                return false;
            } else {
                super.field7589.method2788((byte) -118, this.field1229);
                this.field1243 = class169.method1072(arg0 ^ -21007, new class346[] { class331.method2082("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field7589, arg0 + 21906, 35632) }, super.field7589);
                this.field1247 = class169.method1072(1951, new class346[] { class331.method2082("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field7589, 0, 35632) }, super.field7589);
                this.field1235 = class169.method1072(arg0 ^ -21007, new class346[] { class331.method2082("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field7589, 0, 35632) }, super.field7589);
                this.field1246 = class169.method1072(1951, new class346[] { class331.method2082("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field7589, arg0 + 21906, 35632) }, super.field7589);
                return this.field1247 != null && this.field1243 != null && this.field1235 != null && this.field1246 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)I")
    public final int method583(int arg0) {
        if (arg0 != 1) {
            this.field1241 = -35;
        }
        ++field1226;
        return 1;
    }

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "(I)Z")
    public final boolean method584(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field1228;
            return super.field7589.field6993 && super.field7589.field7077 && super.field7589.field7067;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)V")
    public final void method585(byte arg0) {
        this.field1250 = null;
        this.field1229 = null;
        ++field1237;
        this.field1246 = null;
        this.field1243 = null;
        this.field1247 = null;
        this.field1235 = null;
        this.field1253 = null;
        this.field1251 = null;
        if (arg0 >= -12) {
            this.field1246 = null;
        }
        this.field1227 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Los;)V")
    public class99(class468 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)V")
    public final void method586(int arg0, int arg1) {
        ++field1233;
        OpenGL.glUseProgramObjectARB(0L);
        super.field7589.method2842(1, (byte) 42);
        super.field7589.method2811((class541) null, -2);
        super.field7589.method2842(0, (byte) 42);
        if (arg1 <= 76) {
            field1240 = -7;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)V")
    public final void method587(int arg0, int arg1, int arg2) {
        ++field1230;
        this.field1241 = arg2;
        this.field1238 = arg1;
        if (arg0 < 101) {
            this.field1246 = null;
        }
        int var4 = class239.method1537(-24644, this.field1241);
        int var5 = class239.method1537(-24644, this.field1238);
        if (this.field1245 != var4 || this.field1234 != var5) {
            if (this.field1253 != null) {
                for (int var6 = 0; ~var6 > ~this.field1253.length; ++var6) {
                    this.field1253[var6].method3175(51);
                }
                this.field1253 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field1250 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field1250 == null) {
                    this.field1250 = new class292(super.field7589);
                }
                label57: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        int var10 = var5;
                        int var11 = var4;
                        this.field1253 = new class210[var9];
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && var10 <= 256) {
                                break label57;
                            }
                            this.field1253[var12++] = new class210(super.field7589, 3553, 34842, var11, var10);
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                        }
                    }
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                    ++var9;
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                }
            }
            this.field1245 = var4;
            this.field1234 = var5;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ljq;IFFIIFIFIF)[B")
    public static final byte[] method588(class447 arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6, int arg7, float arg8, int arg9, float arg10) {
        if (arg5 != 1) {
            method588((class447) null, -32, -0.3285242F, 0.13651758F, -95, -58, 1.0079658F, 127, -0.010588338F, 83, -1.2539482F);
        }
        ++field1244;
        byte[] var11 = new byte[arg7 * arg9 * arg1];
        class154.method897(arg2, 0, arg3, var11, arg7, arg6, arg1, arg9, arg10, arg5 + -59, arg0, arg4, arg8);
        return var11;
    }
}
