import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class249 extends class461 {

    @OriginalMember(owner = "client!he", name = "I", descriptor = "Luf;")
    public static class310 field3454;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "F")
    public static float field3462;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    private int field3468;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    private int field3470;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    private int field3473;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "Lvh;")
    public static class240 field3463;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Lqv;")
    private class308 field3453;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "Lqv;")
    private class308 field3458;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "Led;")
    private class497 field3450;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "Led;")
    private class497 field3452;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Led;")
    private class497 field3456;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Led;")
    private class497 field3459;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Llr;")
    private class527 field3455;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Llr;")
    private class527 field3465;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[Lqv;")
    private class308[] field3449;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)V")
    public static void method1459(boolean arg0) {
        field3463 = null;
        if (arg0) {
            field3454 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)Z")
    public final boolean method1460(byte arg0) {
        ++field3461;
        if (arg0 != 57) {
            return false;
        } else {
            return super.field6700.field5897 && super.field6700.field5918 && super.field6700.field6005;
        }
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)I")
    public final int method1461(int arg0) {
        if (arg0 != 26615) {
            return -53;
        } else {
            ++field3469;
            return 1;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BIIZII)Z")
    public static final boolean method1462(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field3448;
        if (arg3) {
            field3454 = null;
        }
        boolean var6 = true;
        class365 var7 = new class365(arg0);
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method2089((byte) 88);
            if (~var9 == -1) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2065(arg3);
                    if (~var13 == -1) {
                        continue label58;
                    }
                    var10 += var13 + -1;
                    int var14 = var10 & 63;
                    int var15 = var10 >> 6 & 63;
                    int var16 = var7.method2099(255) >> 2;
                    int var17 = arg2 + var15;
                    int var18 = arg1 + var14;
                    if (var17 > 0 && ~var18 < -1 && ~var17 > ~(arg5 + -1) && ~var18 > ~(arg4 + -1)) {
                        class132 var19 = class82.field1154.method2121(var8, true);
                        if (var16 != 22 || class437.field6374.field4279 || var19.field1850 != 0 || var19.field1892 == 1 || var19.field1869) {
                            var11 = true;
                            if (!var19.method873(-97)) {
                                var6 = false;
                                ++class388.field5453;
                            }
                        }
                    }
                }
                int var12 = var7.method2065(false);
                if (var12 == 0) {
                    break;
                }
                var7.method2099(255);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLqv;Lqv;)V")
    public final void method1463(int arg0, byte arg1, class308 arg2, class308 arg3) {
        ++field3467;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3449 == null) {
            super.field6700.method2412((byte) 4, arg2);
            super.field6700.method2434(0, this.field3455);
            this.field3455.method3099(0, -113);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field3459.field7320;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class86.field1190, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field3470, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field3470, (float) this.field3472);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field3472);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field6700.method2434(79, this.field3465);
            int var7 = class305.method1730(this.field3470, 3299);
            int var8 = class305.method1730(this.field3472, 3299);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field3465.method3097(this.field3449[var9], 0, (byte) -126);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (var8 > 256) {
                    var8 >>= 1;
                }
                if (var9 == 0) {
                    super.field6700.method2412((byte) 4, arg2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field3470, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field3470, (float) this.field3472);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3472);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field6700.method2412((byte) 4, this.field3449[var9 + -1]);
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
                ++var9;
            }
            super.field6700.method2425(this.field3465, -101);
            super.field6700.method2412((byte) 4, this.field3449[var9 - 1]);
            super.field6700.method2434(22, this.field3455);
            this.field3455.method3099(0, -108);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field3456.field7320;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class86.field1190, 0.0F, 0.0F);
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
        this.field3455.method3099(1, -109);
        super.field6700.method2412((byte) 4, this.field3458);
        long var12 = this.field3450.field7320;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        int var14 = 74 / ((61 - arg1) / 51);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        this.field3455.method3099(0, 77);
        super.field6700.method2412((byte) 4, this.field3453);
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
        super.field6700.method2425(this.field3455, -116);
        long var15 = this.field3452.field7320;
        OpenGL.glUseProgramObjectARB(var15);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var15, "params"), class414.field6074, class438.field6395, 0.0F);
        super.field6700.method2398(1, (byte) 114);
        super.field6700.method2412((byte) 4, this.field3458);
        super.field6700.method2398(0, (byte) 27);
        super.field6700.method2412((byte) 4, arg2);
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(I)Z")
    public final boolean method1464(int arg0) {
        ++field3447;
        if (arg0 >= -23) {
            return true;
        } else if (super.field6700.field5897 && super.field6700.field5918 && super.field6700.field6005) {
            this.field3455 = new class527(super.field6700);
            this.field3458 = new class308(super.field6700, 3553, 34842, 256, 256);
            this.field3458.method1751(false, false, (byte) 57);
            this.field3453 = new class308(super.field6700, 3553, 34842, 256, 256);
            this.field3453.method1751(false, false, (byte) 110);
            super.field6700.method2434(24, this.field3455);
            this.field3455.method3097(this.field3458, 0, (byte) -127);
            this.field3455.method3097(this.field3453, 1, (byte) -126);
            this.field3455.method3099(0, 24);
            if (!this.field3455.method3096((byte) 121)) {
                super.field6700.method2425(this.field3455, -100);
                return false;
            } else {
                super.field6700.method2425(this.field3455, 121);
                this.field3459 = class441.method2631(super.field6700, new class528[] { class516.method3030("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field6700, 35632, (byte) -82) }, 16);
                this.field3456 = class441.method2631(super.field6700, new class528[] { class516.method3030("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field6700, 35632, (byte) -119) }, 16);
                this.field3452 = class441.method2631(super.field6700, new class528[] { class516.method3030("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field6700, 35632, (byte) -39) }, 16);
                this.field3450 = class441.method2631(super.field6700, new class528[] { class516.method3030("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field6700, 35632, (byte) -45) }, 16);
                return this.field3456 != null && this.field3459 != null && this.field3452 != null && this.field3450 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLjava/awt/Canvas;)Lmu;")
    public static final class195 method1465(byte arg0, Canvas arg1) {
        ++field3460;
        try {
            if (arg0 != 89) {
                return null;
            } else {
                Class var2 = Class.forName("sk");
                class195 var3 = (class195) var2.newInstance();
                var3.method31(arg1, (byte) 36);
                return var3;
            }
        } catch (Throwable var5) {
            class4 var4 = new class4();
            var4.method31(arg1, (byte) 36);
            return var4;
        }
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z")
    public final boolean method1466(int arg0) {
        ++field3457;
        if (arg0 != 3515) {
            this.field3472 = -41;
        }
        return this.field3455 != null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
    public final void method1467(int arg0, int arg1, int arg2) {
        ++field3466;
        this.field3470 = arg1;
        this.field3472 = arg2;
        int var4 = class305.method1730(this.field3470, 3299);
        int var5 = class305.method1730(this.field3472, 3299);
        if (~this.field3468 != ~var4 || this.field3473 != var5) {
            if (this.field3449 != null) {
                for (int var6 = 0; ~this.field3449.length < ~var6; ++var6) {
                    this.field3449[var6].method1131(100);
                }
                this.field3449 = null;
            }
            if (~var4 >= -257 && var5 <= 256) {
                this.field3465 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field3465 == null) {
                    this.field3465 = new class527(super.field6700);
                }
                label60: while (true) {
                    if (var7 <= 256 && ~var8 >= -257) {
                        this.field3449 = new class308[var9];
                        int var10 = var5;
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (var11 <= 256 && ~var10 >= -257) {
                                break label60;
                            }
                            this.field3449[var12++] = new class308(super.field6700, 3553, 34842, var11, var10);
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field3473 = var5;
            this.field3468 = var4;
        }
        if (arg0 != 0) {
            this.method1460((byte) 113);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V")
    public final void method1468(boolean arg0) {
        if (arg0) {
            this.field3465 = null;
        }
        this.field3453 = null;
        this.field3459 = null;
        this.field3458 = null;
        this.field3449 = null;
        this.field3455 = null;
        this.field3456 = null;
        this.field3452 = null;
        this.field3465 = null;
        ++field3464;
        this.field3450 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lht;)V")
    public class249(class410 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
    public final void method1469(int arg0, byte arg1) {
        int var3 = 68 % ((arg1 - -70) / 39);
        OpenGL.glUseProgramObjectARB(0L);
        ++field3471;
        super.field6700.method2398(1, (byte) 104);
        super.field6700.method2412((byte) 4, (class188) null);
        super.field6700.method2398(0, (byte) -102);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)Z")
    public static final boolean method1470(byte arg0, int arg1, int arg2) {
        if (arg0 <= 80) {
            return true;
        } else {
            ++field3451;
            return ~(34 & arg1) != -1;
        }
    }

    static {
        new class83("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field3454 = new class310(8, 3);
    }
}
