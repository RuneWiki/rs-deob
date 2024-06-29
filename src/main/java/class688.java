import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class688 extends class543 {

    @OriginalMember(owner = "client!bw", name = "D", descriptor = "[Ljha;")
    public static class695[] field9635 = new class695[0];

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
    private int field9630;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
    private int field9632;

    @OriginalMember(owner = "client!bw", name = "C", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!bw", name = "F", descriptor = "I")
    public static int field9637;

    @OriginalMember(owner = "client!bw", name = "G", descriptor = "I")
    private int field9638;

    @OriginalMember(owner = "client!bw", name = "H", descriptor = "I")
    private int field9639;

    @OriginalMember(owner = "client!bw", name = "J", descriptor = "I")
    public static int field9641;

    @OriginalMember(owner = "client!bw", name = "K", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!bw", name = "L", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!bw", name = "O", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!bw", name = "P", descriptor = "I")
    public static int field9647;

    @OriginalMember(owner = "client!bw", name = "Q", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!bw", name = "R", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "Lrr;")
    private class365 field9631;

    @OriginalMember(owner = "client!bw", name = "M", descriptor = "Lrr;")
    private class365 field9644;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "Luj;")
    private class387 field9629;

    @OriginalMember(owner = "client!bw", name = "N", descriptor = "Luj;")
    private class387 field9645;

    @OriginalMember(owner = "client!bw", name = "T", descriptor = "Luj;")
    private class387 field9651;

    @OriginalMember(owner = "client!bw", name = "U", descriptor = "Luj;")
    private class387 field9652;

    @OriginalMember(owner = "client!bw", name = "B", descriptor = "Laaa;")
    private class616 field9633;

    @OriginalMember(owner = "client!bw", name = "I", descriptor = "Laaa;")
    private class616 field9640;

    @OriginalMember(owner = "client!bw", name = "S", descriptor = "[Laaa;")
    private class616[] field9650;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Z")
    public final boolean method3073(byte arg0) {
        ++field9647;
        int var2 = -107 % ((arg0 - -68) / 57);
        if (super.field7689.field7671 && super.field7689.field7658 && super.field7689.field7594) {
            this.field9631 = new class365(super.field7689);
            this.field9633 = new class616(super.field7689, 3553, 34842, 256, 256);
            this.field9633.method3471(false, 10242, false);
            this.field9640 = new class616(super.field7689, 3553, 34842, 256, 256);
            this.field9640.method3471(false, 10242, false);
            super.field7689.method3041(true, this.field9631);
            this.field9631.method2084(0, this.field9633, 119);
            this.field9631.method2084(1, this.field9640, 109);
            this.field9631.method2098(0, 0);
            if (!this.field9631.method2097((byte) 74)) {
                super.field7689.method3050(this.field9631, -1);
                return false;
            } else {
                super.field7689.method3050(this.field9631, -1);
                this.field9651 = class713.method3993(super.field7689, new class580[] { class754.method4195(35632, super.field7689, false, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, true);
                this.field9645 = class713.method3993(super.field7689, new class580[] { class754.method4195(35632, super.field7689, false, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, true);
                this.field9652 = class713.method3993(super.field7689, new class580[] { class754.method4195(35632, super.field7689, false, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, true);
                this.field9629 = class713.method3993(super.field7689, new class580[] { class754.method4195(35632, super.field7689, false, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, true);
                return this.field9645 != null && this.field9651 != null && this.field9652 != null && this.field9629 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "(B)V")
    public static void method3892(byte arg0) {
        field9635 = null;
        if (arg0 <= 102) {
            method3894(false, (Object) null, false);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)V")
    public final void method3076(int arg0, byte arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field9649;
        super.field7689.method2988(1, 847872872);
        super.field7689.method3006(1, (class221) null);
        if (arg1 == 115) {
            super.field7689.method2988(0, 847872872);
        }
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(B)V")
    public final void method3083(byte arg0) {
        if (arg0 < -31) {
            this.field9651 = null;
            this.field9650 = null;
            this.field9631 = null;
            this.field9640 = null;
            this.field9629 = null;
            this.field9645 = null;
            ++field9637;
            this.field9652 = null;
            this.field9644 = null;
            this.field9633 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "(B)Z")
    public final boolean method3893(byte arg0) {
        ++field9641;
        if (arg0 != 41) {
            return false;
        } else {
            return super.field7689.field7671 && super.field7689.field7658 && super.field7689.field7594;
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lac;)V")
    public class688(class541 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z")
    public final boolean method3077(int arg0) {
        ++field9634;
        if (arg0 <= 10) {
            this.method3077(6);
        }
        return this.field9631 != null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)I")
    public final int method3078(boolean arg0) {
        if (arg0) {
            this.method3076(88, (byte) 126);
        }
        ++field9643;
        return 1;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
    public static final byte[] method3894(boolean arg0, Object arg1, boolean arg2) {
        ++field9636;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return !arg2 ? var3 : class468.method2634(var3, 0);
        } else if (arg1 instanceof class198) {
            class198 var4 = (class198) arg1;
            return var4.method1099(false);
        } else if (arg0) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIZ)V")
    public final void method3074(int arg0, int arg1, boolean arg2) {
        ++field9646;
        this.field9638 = arg0;
        this.field9630 = arg1;
        int var4 = class115.method761(96, this.field9630);
        int var5 = class115.method761(-97, this.field9638);
        if (!arg2) {
            if (this.field9639 != var4 || ~this.field9632 != ~var5) {
                if (this.field9650 != null) {
                    for (int var6 = 0; ~this.field9650.length < ~var6; ++var6) {
                        this.field9650[var6].method1261(true);
                    }
                    this.field9650 = null;
                }
                if (var4 <= 256 && ~var5 >= -257) {
                    this.field9644 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    label61: while (true) {
                        if (var7 <= 256 && ~var8 >= -257) {
                            if (this.field9644 == null) {
                                this.field9644 = new class365(super.field7689);
                            }
                            this.field9650 = new class616[var9];
                            int var10 = var4;
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (var10 <= 256 && ~var11 >= -257) {
                                    break label61;
                                }
                                this.field9650[var12++] = new class616(super.field7689, 3553, 34842, var10, var11);
                                if (~var11 < -257) {
                                    var11 >>= 1;
                                }
                                if (var10 > 256) {
                                    var10 >>= 1;
                                }
                            }
                        }
                        if (var8 > 256) {
                            var8 >>= 1;
                        }
                        if (var7 > 256) {
                            var7 >>= 1;
                        }
                        ++var9;
                    }
                }
                this.field9639 = var4;
                this.field9632 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Laaa;IBLaaa;)V")
    public final void method3081(class616 arg0, int arg1, byte arg2, class616 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field9642;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        if (arg2 != -64) {
            this.method3893((byte) -68);
        }
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field9650 == null) {
            super.field7689.method3006(1, arg3);
            super.field7689.method3041(true, this.field9631);
            this.field9631.method2098(arg2 + 64, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field9651.field5459;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class534.field7250, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field9630, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field9630, (float) this.field9638);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field9638);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field7689.method3041(true, this.field9644);
            int var7 = class115.method761(76, this.field9630);
            int var8 = class115.method761(104, this.field9638);
            int var9 = 0;
            while (var7 > 256 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field9644.method2084(0, this.field9650[var9], 116);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (~var9 == -1) {
                    super.field7689.method3006(arg2 + 65, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field9630, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field9630, (float) this.field9638);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9638);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field7689.method3006(1, this.field9650[var9 + -1]);
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
            super.field7689.method3050(this.field9644, -1);
            super.field7689.method3006(1, this.field9650[var9 + -1]);
            super.field7689.method3041(true, this.field9631);
            this.field9631.method2098(arg2 ^ -64, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field9645.field5459;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class534.field7250, 0.0F, 0.0F);
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
        this.field9631.method2098(arg2 + 64, 1);
        super.field7689.method3006(1, this.field9633);
        long var12 = this.field9629.field5459;
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
        this.field9631.method2098(arg2 + 64, 0);
        super.field7689.method3006(arg2 ^ -63, this.field9640);
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
        super.field7689.method3050(this.field9631, -1);
        long var14 = this.field9652.field5459;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class34.field353, class713.field9951, 0.0F);
        super.field7689.method2988(1, 847872872);
        super.field7689.method3006(1, this.field9633);
        super.field7689.method2988(0, 847872872);
        super.field7689.method3006(1, arg3);
    }
}
