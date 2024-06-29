import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class281 extends class502 {

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    private int field3540;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
    private int field3550;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!vn", name = "S", descriptor = "I")
    private int field3560;

    @OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!vn", name = "U", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "Lei;")
    private class162 field3553;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "Lei;")
    private class162 field3555;

    @OriginalMember(owner = "client!vn", name = "V", descriptor = "Leq;")
    public static class194 field3563;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "Lkp;")
    private class446 field3544;

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "Lkp;")
    private class446 field3556;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "Llj;")
    private class555 field3542;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "Llj;")
    private class555 field3545;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "Llj;")
    private class555 field3547;

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "Llj;")
    private class555 field3554;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "[Lkp;")
    private class446[] field3539;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Z", line = 3)
    public final boolean method1599(int arg0) {
        ++field3546;
        if (arg0 != 1) {
            this.method1601((class446) null, -3, (class446) null, 75);
        }
        if (super.field7229.field6063 && super.field7229.field5955 && super.field7229.field5987) {
            this.field3553 = new class162(super.field7229);
            this.field3556 = new class446(super.field7229, 3553, 34842, 256, 256);
            this.field3556.method2467(false, false, 57);
            this.field3544 = new class446(super.field7229, 3553, 34842, 256, 256);
            this.field3544.method2467(false, false, 93);
            super.field7229.method2395(true, this.field3553);
            this.field3553.method984(arg0 + -1, 0, this.field3556);
            this.field3553.method984(0, 1, this.field3544);
            this.field3553.method982(0, 30862);
            if (!this.field3553.method976((byte) 45)) {
                super.field7229.method2341(this.field3553, (byte) -91);
                return false;
            } else {
                super.field7229.method2341(this.field3553, (byte) -91);
                this.field3542 = class596.method3341(85, new class58[] { class182.method1062("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, (byte) -16, super.field7229) }, super.field7229);
                this.field3554 = class596.method3341(arg0 ^ -97, new class58[] { class182.method1062("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, (byte) -16, super.field7229) }, super.field7229);
                this.field3545 = class596.method3341(48, new class58[] { class182.method1062("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, (byte) -16, super.field7229) }, super.field7229);
                this.field3547 = class596.method3341(123, new class58[] { class182.method1062("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, (byte) -16, super.field7229) }, super.field7229);
                return this.field3554 != null && this.field3542 != null && this.field3545 != null && this.field3547 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "(I)V", line = 40)
    public static void method1600(int arg0) {
        field3563 = null;
        if (arg0 != 25656) {
            field3563 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lkp;ILkp;I)V", line = 55)
    public final void method1601(class446 arg0, int arg1, class446 arg2, int arg3) {
        ++field3557;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, (double) arg3, -1.0D, 1.0D);
        if (this.field3539 == null) {
            super.field7229.method2388((byte) 119, arg0);
            super.field7229.method2395(true, this.field3553);
            this.field3553.method982(0, 30862);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field3542.field7904;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class277.field3491, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field3558, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field3558, (float) this.field3550);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field3550);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field7229.method2395(true, this.field3555);
            int var7 = class687.method3819(this.field3558, (byte) -125);
            int var8 = class687.method3819(this.field3550, (byte) 115);
            int var9 = 0;
            while (~var7 < -257 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field3555.method984(0, 0, this.field3539[var9]);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (var8 > 256) {
                    var8 >>= 1;
                }
                if (var9 != 0) {
                    super.field7229.method2388((byte) -98, this.field3539[var9 + -1]);
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
                    super.field7229.method2388((byte) 84, arg0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field3558, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field3558, (float) this.field3550);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3550);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var9;
            }
            super.field7229.method2341(this.field3555, (byte) -91);
            super.field7229.method2388((byte) 92, this.field3539[var9 + -1]);
            super.field7229.method2395(true, this.field3553);
            this.field3553.method982(0, 30862);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field3554.field7904;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class277.field3491, 0.0F, 0.0F);
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
        this.field3553.method982(1, 30862);
        super.field7229.method2388((byte) -24, this.field3556);
        long var12 = this.field3547.field7904;
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
        this.field3553.method982(0, 30862);
        super.field7229.method2388((byte) 97, this.field3544);
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
        super.field7229.method2341(this.field3553, (byte) -91);
        long var14 = this.field3545.field7904;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class425.field5652, class166.field1998, 0.0F);
        super.field7229.method2380(1, (byte) -75);
        super.field7229.method2388((byte) 86, this.field3556);
        super.field7229.method2380(0, (byte) -113);
        super.field7229.method2388((byte) -116, arg0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V", line = 209)
    public final void method1602(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field3549;
        super.field7229.method2380(1, (byte) -97);
        super.field7229.method2388((byte) -105, (class412) null);
        super.field7229.method2380(arg1, (byte) -112);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V", line = 222)
    public static final void method1603(int arg0, byte arg1, int arg2) {
        class480.method2802(class431.field5693, 16751);
        ++class636.field9007;
        if (arg1 != 5) {
            method1605((class303) null, (byte) 29);
        }
        ++field3548;
        class334.field4314.method2537(18244, arg2);
        class334.field4314.method2554(arg0, arg1 ^ 250);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V", line = 238)
    public final void method1604(int arg0, int arg1, int arg2) {
        int var4 = 88 % ((arg1 - 39) / 33);
        this.field3550 = arg2;
        ++field3562;
        this.field3558 = arg0;
        int var5 = class687.method3819(this.field3558, (byte) 120);
        int var6 = class687.method3819(this.field3550, (byte) 96);
        if (~this.field3540 != ~var5 || ~this.field3560 != ~var6) {
            if (this.field3539 != null) {
                for (int var7 = 0; var7 < this.field3539.length; ++var7) {
                    this.field3539[var7].method2228(-64);
                }
                this.field3539 = null;
            }
            if (var5 <= 256 && var6 <= 256) {
                this.field3555 = null;
            } else {
                int var8 = var5;
                int var9 = var6;
                int var10 = 0;
                label57: while (true) {
                    if (var8 <= 256 && ~var9 >= -257) {
                        if (this.field3555 == null) {
                            this.field3555 = new class162(super.field7229);
                        }
                        int var11 = var5;
                        int var12 = var6;
                        this.field3539 = new class446[var10];
                        int var13 = 0;
                        while (true) {
                            if (var11 <= 256 && var12 <= 256) {
                                break label57;
                            }
                            this.field3539[var13++] = new class446(super.field7229, 3553, 34842, var11, var12);
                            if (var12 > 256) {
                                var12 >>= 1;
                            }
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (var9 > 256) {
                        var9 >>= 1;
                    }
                    ++var10;
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                }
            }
            this.field3540 = var5;
            this.field3560 = var6;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljo;B)I", line = 317)
    public static final int method1605(class303 arg0, byte arg1) {
        ++field3541;
        int var2 = 0;
        if (arg0.method1711(class579.field8245, 1)) {
            ++var2;
        }
        if (arg0.method1711(class191.field2304, 1)) {
            ++var2;
        }
        if (arg0.method1711(class587.field8339, 1)) {
            ++var2;
        }
        if (arg0.method1711(class518.field7400, 1)) {
            ++var2;
        }
        if (arg0.method1711(class480.field7043, 1)) {
            ++var2;
        }
        if (arg0.method1711(class683.field9692, 1)) {
            ++var2;
        }
        if (arg0.method1711(class117.field1350, 1)) {
            ++var2;
        }
        if (arg0.method1711(class256.field3280, 1)) {
            ++var2;
        }
        if (arg1 >= -23) {
            method1608(71, 22, 23, -28, -29);
        }
        if (arg0.method1711(class620.field8716, 1)) {
            ++var2;
        }
        if (arg0.method1711(class555.field7900, 1)) {
            ++var2;
        }
        if (arg0.method1711(class140.field1600, 1)) {
            ++var2;
        }
        if (arg0.method1711(class687.field9712, 1)) {
            ++var2;
        }
        if (arg0.method1711(class608.field8594, 1)) {
            ++var2;
        }
        if (arg0.method1711(class678.field9611, 1)) {
            ++var2;
        }
        if (arg0.method1711(class525.field7505, 1)) {
            ++var2;
        }
        if (arg0.method1711(class552.field7870, 1)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)Z", line = 385)
    public final boolean method1606(byte arg0) {
        ++field3561;
        int var2 = 54 % ((arg0 - -78) / 36);
        return super.field7229.field6063 && super.field7229.field5955 && super.field7229.field5987;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 395)
    public final void method1607(byte arg0) {
        this.field3539 = null;
        ++field3559;
        this.field3553 = null;
        this.field3542 = null;
        this.field3547 = null;
        this.field3545 = null;
        this.field3544 = null;
        this.field3556 = null;
        this.field3554 = null;
        if (arg0 >= -68) {
            method1600(103);
        }
        this.field3555 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)V", line = 414)
    public static final void method1608(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3551;
        if (arg0 != -12040) {
            method1605((class303) null, (byte) 76);
        }
        for (int var5 = 0; class675.field9572 > var5; ++var5) {
            Rectangle var6 = class382.field5060[var5];
            if (arg4 < var6.x + var6.width && ~(arg1 + arg4) < ~var6.x && ~(var6.y + var6.height) < ~arg2 && arg2 - -arg3 > var6.y) {
                class406.field5409[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)I", line = 443)
    public final int method1609(int arg0) {
        if (arg0 != 1) {
            return -35;
        } else {
            ++field3543;
            return 1;
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z", line = 456)
    public final boolean method1610(int arg0) {
        if (arg0 != 1) {
            return false;
        } else {
            ++field3552;
            return this.field3553 != null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lap;)V", line = 467)
    public class281(class435 arg0) {
        super(arg0);
    }
}
