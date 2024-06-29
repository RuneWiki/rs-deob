import jaggl.OpenGL;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class110 extends class180 {

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "Lfr;")
    public static class497 field1644 = new class497();

    @OriginalMember(owner = "client!nr", name = "W", descriptor = "[I")
    public static int[] field1659 = new int[4096];

    @OriginalMember(owner = "client!nr", name = "X", descriptor = "F")
    public static float field1660;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!nr", name = "T", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "Lij;")
    private class467 field1640;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "Lij;")
    private class467 field1642;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "Lij;")
    private class467 field1647;

    @OriginalMember(owner = "client!nr", name = "R", descriptor = "Lij;")
    private class467 field1654;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "Les;")
    private class476 field1637;

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "Les;")
    private class476 field1655;

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "Lud;")
    private class94 field1650;

    @OriginalMember(owner = "client!nr", name = "U", descriptor = "Lud;")
    private class94 field1657;

    @OriginalMember(owner = "client!nr", name = "V", descriptor = "Ljava/awt/Image;")
    public static Image field1658;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nr", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field1661;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "[Lud;")
    private class94[] field1643;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method859(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(B)V", line = 6)
    public static final void method844(byte arg0) {
        class27.field395.method141(class385.field5803, !class454.field6661.field985 ? -1 : class167.field2476 + 256 << 0, 256);
        ++field1634;
        if (arg0 >= -103) {
            field1644 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 19)
    public static final void method845(int arg0, int arg1, int arg2, Class arg3) {
        class306 var4 = class236.field3305[arg0][arg1][arg2];
        if (var4 != null) {
            for (class17 var5 = var4.field4589; var5 != null; var5 = var5.field281) {
                class522 var6 = var5.field279;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field7687 == arg1 && var6.field7676 == arg2) {
                    class434.method2561(var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)V", line = 45)
    public final void method846(int arg0, int arg1, int arg2) {
        if (arg1 < -67) {
            ++field1652;
            this.field1651 = arg0;
            this.field1635 = arg2;
            int var4 = class45.method352((byte) -95, this.field1635);
            int var5 = class45.method352((byte) -113, this.field1651);
            if (~this.field1645 != ~var4 || this.field1633 != var5) {
                if (this.field1643 != null) {
                    for (int var6 = 0; ~this.field1643.length < ~var6; ++var6) {
                        this.field1643[var6].method1696(0);
                    }
                    this.field1643 = null;
                }
                if (~var4 >= -257 && var5 <= 256) {
                    this.field1655 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field1655 == null) {
                        this.field1655 = new class476(super.field2666);
                    }
                    label57: while (true) {
                        if (var7 <= 256 && var8 <= 256) {
                            this.field1643 = new class94[var9];
                            int var10 = var4;
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (~var10 >= -257 && ~var11 >= -257) {
                                    break label57;
                                }
                                this.field1643[var12++] = new class94(super.field2666, 3553, 34842, var10, var11);
                                if (~var10 < -257) {
                                    var10 >>= 1;
                                }
                                if (var11 > 256) {
                                    var11 >>= 1;
                                }
                            }
                        }
                        ++var9;
                        if (~var8 < -257) {
                            var8 >>= 1;
                        }
                        if (~var7 < -257) {
                            var7 >>= 1;
                        }
                    }
                }
                this.field1633 = var5;
                this.field1645 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V", line = 124)
    public final void method847(int arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field1639;
        super.field2666.method1553(1, -8156);
        super.field2666.method1546(-2, (class271) null);
        int var3 = -8 % ((-18 - arg1) / 57);
        super.field2666.method1553(0, -8156);
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)I", line = 142)
    public final int method848(int arg0) {
        ++field1648;
        int var2 = -104 % ((-40 - arg0) / 54);
        return 1;
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)V", line = 154)
    public final void method849(byte arg0) {
        this.field1647 = null;
        this.field1642 = null;
        this.field1657 = null;
        if (arg0 != -3) {
            this.method846(46, -95, -17);
        }
        this.field1654 = null;
        this.field1643 = null;
        this.field1650 = null;
        ++field1653;
        this.field1655 = null;
        this.field1640 = null;
        this.field1637 = null;
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)Z", line = 173)
    public final boolean method850(int arg0) {
        if (arg0 <= 46) {
            return false;
        } else {
            ++field1656;
            return this.field1637 != null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "(B)V", line = 186)
    public static void method851(byte arg0) {
        field1644 = null;
        if (arg0 != -15) {
            field1644 = null;
        }
        field1658 = null;
        field1659 = null;
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(B)Z", line = 199)
    public final boolean method852(byte arg0) {
        ++field1641;
        if (super.field2666.field3812 && super.field2666.field3735 && super.field2666.field3796) {
            this.field1637 = new class476(super.field2666);
            this.field1650 = new class94(super.field2666, 3553, 34842, 256, 256);
            this.field1650.method741(false, false, (byte) -111);
            this.field1657 = new class94(super.field2666, 3553, 34842, 256, 256);
            this.field1657.method741(false, false, (byte) -115);
            super.field2666.method1568(this.field1637, 89);
            this.field1637.method2830(0, 114, this.field1650);
            this.field1637.method2830(1, 109, this.field1657);
            this.field1637.method2834(arg0 + 38, 0);
            if (!this.field1637.method2832((byte) -33)) {
                super.field2666.method1554(this.field1637, arg0 + 12683);
                return false;
            } else {
                super.field2666.method1554(this.field1637, arg0 + 12683);
                this.field1640 = class145.method1056(new class224[] { class154.method1112(1, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field2666) }, super.field2666, true);
                this.field1642 = class145.method1056(new class224[] { class154.method1112(1, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field2666) }, super.field2666, true);
                this.field1647 = class145.method1056(new class224[] { class154.method1112(1, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field2666) }, super.field2666, true);
                this.field1654 = class145.method1056(new class224[] { class154.method1112(1, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field2666) }, super.field2666, true);
                return this.field1642 != null && this.field1640 != null && this.field1647 != null && this.field1654 != null;
            }
        } else {
            if (arg0 != -39) {
                this.method849((byte) 53);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lrm;IIII)V", line = 236)
    public static final void method853(class79 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class208.method1351(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class445.field6562) {
            class208.method1351(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class208.method1351(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class167.field2473) {
            class208.method1351(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class167.field2473) {
            class208.method1351(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class445.field6562 && arg4 <= class167.field2473) {
            class208.method1351(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class208.method1351(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class445.field6562 && arg4 > 0) {
            class208.method1351(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIILuc;)V", line = 291)
    public static final void method854(int arg0, int arg1, int arg2, int arg3, class202 arg4) {
        class306 var5 = class461.method2673(arg0, arg1, arg2);
        if (var5 != null) {
            int var6 = 0;
            arg4.field2943 = (arg1 << class9.field75) + class280.field4230;
            arg4.field2935 = arg3;
            arg4.field2939 = (arg2 << class9.field75) + class280.field4230;
            for (class17 var7 = var5.field4589; var7 != null; var7 = var7.field281) {
                if (var7.field279.field7685) {
                    int var8 = var7.field279.method236(0);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field2935 += var6;
                arg4.field2941 = true;
            } else if (var5.field4577 != null) {
                arg4.field2935 -= var5.field4577.field3862;
            }
            var5.field4588 = arg4;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lud;BILud;)V", line = 331)
    public final void method855(class94 arg0, byte arg1, int arg2, class94 arg3) {
        OpenGL.glPushAttrib(2048);
        ++field1636;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        if (arg1 != 15) {
            method844((byte) -67);
        }
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1643 == null) {
            super.field2666.method1546(-2, arg3);
            super.field2666.method1568(this.field1637, 116);
            this.field1637.method2834(-1, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field1640.field6796;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class58.field799, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1635, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1635, (float) this.field1651);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1651);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field2666.method1568(this.field1655, 113);
            int var7 = class45.method352((byte) -119, this.field1635);
            int var8 = class45.method352((byte) -115, this.field1651);
            int var9 = 0;
            while (~var7 < -257 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field1655.method2830(0, -46, this.field1643[var9]);
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (~var9 == -1) {
                    super.field2666.method1546(arg1 ^ -15, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1635, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1635, (float) this.field1651);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1651);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field2666.method1546(arg1 ^ -15, this.field1643[var9 + -1]);
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
            super.field2666.method1554(this.field1655, 12644);
            super.field2666.method1546(-2, this.field1643[var9 + -1]);
            super.field2666.method1568(this.field1637, 106);
            this.field1637.method2834(arg1 + -16, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1642.field6796;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class58.field799, 0.0F, 0.0F);
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
        this.field1637.method2834(-1, 1);
        super.field2666.method1546(-2, this.field1650);
        long var12 = this.field1654.field6796;
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
        this.field1637.method2834(arg1 ^ -16, 0);
        super.field2666.method1546(-2, this.field1657);
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
        super.field2666.method1554(this.field1637, 12644);
        long var14 = this.field1647.field6796;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class254.field3455, class159.field2388, 0.0F);
        super.field2666.method1553(1, -8156);
        super.field2666.method1546(-2, this.field1650);
        super.field2666.method1553(0, -8156);
        super.field2666.method1546(-2, arg3);
    }

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "(B)Z", line = 487)
    public final boolean method856(byte arg0) {
        if (arg0 != -49) {
            return true;
        } else {
            ++field1646;
            return super.field2666.field3812 && super.field2666.field3735 && super.field2666.field3796;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBII)Z", line = 504)
    public static final boolean method857(int arg0, byte arg1, int arg2, int arg3) {
        ++field1649;
        if (arg1 != -79) {
            field1660 = -0.4551494F;
        }
        boolean var4 = true;
        class401 var5 = (class401) class222.method1406(arg3, arg2, arg0);
        if (var5 != null) {
            var4 &= class161.method1140((byte) -27, var5);
        }
        class401 var6 = (class401) class534.method3160(arg3, arg2, arg0, field1661 != null ? field1661 : (field1661 = method859("gf")));
        if (var6 != null) {
            var4 &= class161.method1140((byte) -70, var6);
        }
        class401 var7 = (class401) class341.method2081(arg3, arg2, arg0);
        if (var7 != null) {
            var4 &= class161.method1140((byte) 127, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lvd;)V", line = 532)
    public class110(class258 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 537)
    public static final void method858(String arg0, int arg1) {
        ++field1638;
        if (arg0 != null) {
            if (arg1 == 1) {
                if (arg0.startsWith("*")) {
                    arg0 = arg0.substring(1);
                }
                String var2 = class491.method2932((byte) 108, arg0);
                if (var2 != null) {
                    for (int var3 = 0; class222.field3162 > var3; ++var3) {
                        String var4 = class134.field1996[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class491.method2932((byte) 59, var4);
                        if (var5 != null && var5.equals(var2)) {
                            --class222.field3162;
                            for (int var6 = var3; ~var6 > ~class222.field3162; ++var6) {
                                class134.field1996[var6] = class134.field1996[var6 - -1];
                                class227.field3207[var6] = class227.field3207[var6 + 1];
                                class89.field1388[var6] = class89.field1388[var6 - -1];
                                class422.field6307[var6] = class422.field6307[var6 - -1];
                                class288.field4299[var6] = class288.field4299[var6 + 1];
                                class34.field473[var6] = class34.field473[var6 + 1];
                            }
                            class231.field3248 = class264.field3939;
                            ++class78.field1081;
                            class97.method758(client.field7528, false);
                            class43.field559.method2754(class521.method3084(arg0, 66), arg1 ^ 5575);
                            class43.field559.method2731(arg0, (byte) -108);
                            return;
                        }
                    }
                }
            }
        }
    }
}
