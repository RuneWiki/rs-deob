import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class37 extends class539 {

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
    public static int field473 = 0;

    @OriginalMember(owner = "client!ts", name = "N", descriptor = "F")
    public static float field477;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ts", name = "O", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!ts", name = "P", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "Lbr;")
    private class147 field471;

    @OriginalMember(owner = "client!ts", name = "I", descriptor = "Lbr;")
    private class147 field472;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "Lbr;")
    private class147 field474;

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "Lbr;")
    private class147 field475;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "Lak;")
    private class35 field457;

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "Lak;")
    private class35 field464;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "Lcd;")
    private class65 field466;

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "Lcd;")
    private class65 field476;

    @OriginalMember(owner = "client!ts", name = "Q", descriptor = "[Lcd;")
    private class65[] field480;

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Ltt;)V")
    public class37(class249 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "(I)V")
    public final void method239(int arg0) {
        this.field474 = null;
        this.field464 = null;
        if (arg0 == 0) {
            this.field480 = null;
            this.field472 = null;
            ++field458;
            this.field475 = null;
            this.field457 = null;
            this.field476 = null;
            this.field466 = null;
            this.field471 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
    public final int method240(int arg0) {
        ++field481;
        if (arg0 < 95) {
            field459 = 84;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLcd;Lcd;I)V")
    public final void method241(byte arg0, class65 arg1, class65 arg2, int arg3) {
        ++field469;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field480 != null) {
            super.field7896.method1765(this.field464, (byte) 21);
            int var5 = class187.method1301(this.field468, false);
            int var6 = class187.method1301(this.field460, false);
            int var7 = 0;
            while (~var5 < -257 || var6 > 256) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field464.method228((byte) 108, this.field480[var7], 0);
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (var7 != 0) {
                    super.field7896.method1749(25752, this.field480[var7 + -1]);
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
                    super.field7896.method1749(arg0 ^ -25798, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field468, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field468, (float) this.field460);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field460);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                ++var7;
            }
            super.field7896.method1782(this.field464, true);
            super.field7896.method1749(25752, this.field480[var7 + -1]);
            super.field7896.method1765(this.field457, (byte) 21);
            this.field457.method213((byte) -107, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field475.field2191;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class291.field4500, 0.0F, 0.0F);
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
            super.field7896.method1749(25752, arg1);
            super.field7896.method1765(this.field457, (byte) 21);
            this.field457.method213((byte) -115, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field471.field2191;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class291.field4500, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field468, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field468, (float) this.field460);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field460);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field457.method213((byte) -84, 1);
        super.field7896.method1749(25752, this.field466);
        long var12 = this.field474.field2191;
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
        if (arg0 == -94) {
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            this.field457.method213((byte) -86, 0);
            super.field7896.method1749(25752, this.field476);
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
            super.field7896.method1782(this.field457, true);
            long var14 = this.field472.field2191;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class166.field2504, class11.field121, 0.0F);
            super.field7896.method1756(1, -59);
            super.field7896.method1749(25752, this.field466);
            super.field7896.method1756(0, arg0 + -14);
            super.field7896.method1749(25752, arg1);
        }
    }

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "(I)Z")
    public final boolean method242(int arg0) {
        if (arg0 != 1) {
            this.method240(-103);
        }
        ++field470;
        return this.field457 != null;
    }

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "(I)Z")
    public final boolean method243(int arg0) {
        if (arg0 != -14169) {
            return false;
        } else {
            ++field479;
            if (super.field7896.field3993 && super.field7896.field4007 && super.field7896.field4006) {
                this.field457 = new class35(super.field7896);
                this.field466 = new class65(super.field7896, 3553, 34842, 256, 256);
                this.field466.method437(false, (byte) 31, false);
                this.field476 = new class65(super.field7896, 3553, 34842, 256, 256);
                this.field476.method437(false, (byte) 40, false);
                super.field7896.method1765(this.field457, (byte) 21);
                this.field457.method228((byte) 66, this.field466, 0);
                this.field457.method228((byte) 75, this.field476, 1);
                this.field457.method213((byte) -123, 0);
                if (!this.field457.method220(-16793)) {
                    super.field7896.method1782(this.field457, true);
                    return false;
                } else {
                    super.field7896.method1782(this.field457, true);
                    this.field471 = class91.method782(new class279[] { class225.method1547("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", (byte) -104, 35632, super.field7896) }, (byte) -119, super.field7896);
                    this.field475 = class91.method782(new class279[] { class225.method1547("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", (byte) -115, 35632, super.field7896) }, (byte) -122, super.field7896);
                    this.field472 = class91.method782(new class279[] { class225.method1547("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", (byte) -67, 35632, super.field7896) }, (byte) -117, super.field7896);
                    this.field474 = class91.method782(new class279[] { class225.method1547("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", (byte) -32, 35632, super.field7896) }, (byte) -123, super.field7896);
                    return this.field475 != null && this.field471 != null && this.field472 != null && this.field474 != null;
                }
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
    public final void method244(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            this.field464 = null;
        }
        this.field460 = arg1;
        ++field467;
        this.field468 = arg2;
        int var4 = class187.method1301(this.field468, false);
        int var5 = class187.method1301(this.field460, false);
        if (this.field465 != var4 || ~this.field478 != ~var5) {
            if (this.field480 != null) {
                for (int var6 = 0; this.field480.length > var6; ++var6) {
                    this.field480[var6].method1201((byte) -40);
                }
                this.field480 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field464 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field464 == null) {
                    this.field464 = new class35(super.field7896);
                }
                label57: while (true) {
                    if (~var7 >= -257 && ~var8 >= -257) {
                        this.field480 = new class65[var9];
                        int var10 = var5;
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && var10 <= 256) {
                                break label57;
                            }
                            this.field480[var12++] = new class65(super.field7896, 3553, 34842, var11, var10);
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                        }
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    ++var9;
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                }
            }
            this.field478 = var5;
            this.field465 = var4;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
    public final void method245(boolean arg0, int arg1) {
        ++field463;
        OpenGL.glUseProgramObjectARB(0L);
        super.field7896.method1756(1, 108);
        super.field7896.method1749(25752, (class169) null);
        super.field7896.method1756(0, -8);
        if (arg0) {
            this.method245(false, -41);
        }
    }

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "(I)Z")
    public final boolean method246(int arg0) {
        ++field462;
        if (arg0 != 34842) {
            field473 = 13;
        }
        return super.field7896.field3993 && super.field7896.field4007 && super.field7896.field4006;
    }
}
