import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class455 extends class141 {

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
    public static int field6797 = 0;

    @OriginalMember(owner = "client!hr", name = "T", descriptor = "[I")
    public static int[] field6816 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "[I")
    public static int[] field6808 = new int[4096];

    @OriginalMember(owner = "client!hr", name = "Y", descriptor = "Leea;")
    public static class114 field6821;

    @OriginalMember(owner = "client!hr", name = "Z", descriptor = "[I")
    public static int[] field6822;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    private int field6795;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
    private int field6812;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!hr", name = "R", descriptor = "I")
    private int field6814;

    @OriginalMember(owner = "client!hr", name = "U", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!hr", name = "V", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!hr", name = "W", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
    private int field6820;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "Lcs;")
    private class289 field6799;

    @OriginalMember(owner = "client!hr", name = "S", descriptor = "Lcs;")
    private class289 field6815;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "Lis;")
    private class434 field6798;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "Lis;")
    private class434 field6805;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "Lis;")
    private class434 field6809;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "Lis;")
    private class434 field6811;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "Ljaa;")
    private class535 field6803;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "Ljaa;")
    private class535 field6806;

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "[Lcs;")
    private class289[] field6810;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BII)V")
    public final void method856(byte arg0, int arg1, int arg2) {
        ++field6796;
        this.field6814 = arg2;
        this.field6812 = arg1;
        int var4 = class309.method2052(true, this.field6814);
        if (arg0 >= -82) {
            field6808 = null;
        }
        int var5 = class309.method2052(true, this.field6812);
        if (this.field6820 != var4 || this.field6795 != var5) {
            if (this.field6810 != null) {
                for (int var6 = 0; this.field6810.length > var6; ++var6) {
                    this.field6810[var6].method3023(false);
                }
                this.field6810 = null;
            }
            if (var4 <= 256 && ~var5 >= -257) {
                this.field6806 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field6806 == null) {
                    this.field6806 = new class535(super.field1741);
                }
                label60: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        int var10 = var5;
                        int var11 = var4;
                        this.field6810 = new class289[var9];
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && var10 <= 256) {
                                break label60;
                            }
                            this.field6810[var12++] = new class289(super.field1741, 3553, 34842, var11, var10);
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
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field6795 = var5;
            this.field6820 = var4;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class142.method859(87, arg4);
        if (arg3 != 12621) {
            field6797 = 122;
        }
        ++field6801;
        int var7 = 0;
        int var8 = arg4 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (~class418.field6298 >= ~arg2 && ~arg2 >= ~class461.field6877) {
            int[] var15 = class402.field6087[arg2];
            int var16 = class132.method818((byte) -93, -arg4 + arg5, class113.field1385, class4.field43);
            int var17 = class132.method818((byte) -93, arg4 + arg5, class113.field1385, class4.field43);
            int var18 = class132.method818((byte) -93, -var8 + arg5, class113.field1385, class4.field43);
            int var19 = class132.method818((byte) -93, arg5 - -var8, class113.field1385, class4.field43);
            class645.method3675(arg3 + -12515, var15, arg1, var16, var18);
            class645.method3675(arg3 + -12509, var15, arg0, var18, var19);
            class645.method3675(126, var15, arg1, var19, var17);
        }
        while (~var9 < ~var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                --var11;
                class452.field6746[var11] = var7;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg2;
                int var21 = arg2 + var9;
                if (class418.field6298 <= var21 && ~class461.field6877 <= ~var20) {
                    if (~var8 < ~var9) {
                        int var22 = class452.field6746[var9];
                        int var23 = class132.method818((byte) -93, arg5 + var7, class113.field1385, class4.field43);
                        int var24 = class132.method818((byte) -93, -var7 + arg5, class113.field1385, class4.field43);
                        int var25 = class132.method818((byte) -93, arg5 + var22, class113.field1385, class4.field43);
                        int var26 = class132.method818((byte) -93, -var22 + arg5, class113.field1385, class4.field43);
                        if (~class461.field6877 <= ~var21) {
                            int[] var27 = class402.field6087[var21];
                            class645.method3675(arg3 + -12496, var27, arg1, var24, var26);
                            class645.method3675(101, var27, arg0, var26, var25);
                            class645.method3675(109, var27, arg1, var25, var23);
                        }
                        if (class418.field6298 <= var20) {
                            int[] var28 = class402.field6087[var20];
                            class645.method3675(121, var28, arg1, var24, var26);
                            class645.method3675(110, var28, arg0, var26, var25);
                            class645.method3675(126, var28, arg1, var25, var23);
                        }
                    } else {
                        int var29 = class132.method818((byte) -93, arg5 + var7, class113.field1385, class4.field43);
                        int var30 = class132.method818((byte) -93, -var7 + arg5, class113.field1385, class4.field43);
                        if (class461.field6877 >= var21) {
                            class645.method3675(106, class402.field6087[var21], arg1, var30, var29);
                        }
                        if (~class418.field6298 >= ~var20) {
                            class645.method3675(95, class402.field6087[var20], arg1, var30, var29);
                        }
                    }
                }
            }
            int var31 = -var7 + arg2;
            int var32 = arg2 + var7;
            if (~var32 <= ~class418.field6298 && ~var31 >= ~class461.field6877) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (~var33 <= ~class113.field1385 && class4.field43 >= var34) {
                    int var35 = class132.method818((byte) -93, var33, class113.field1385, class4.field43);
                    int var36 = class132.method818((byte) -93, var34, class113.field1385, class4.field43);
                    if (var8 <= var7) {
                        if (class461.field6877 >= var32) {
                            class645.method3675(110, class402.field6087[var32], arg1, var36, var35);
                        }
                        if (~class418.field6298 >= ~var31) {
                            class645.method3675(99, class402.field6087[var31], arg1, var36, var35);
                        }
                    } else {
                        int var37 = ~var11 <= ~var7 ? var11 : class452.field6746[var7];
                        int var38 = class132.method818((byte) -93, arg5 + var37, class113.field1385, class4.field43);
                        int var39 = class132.method818((byte) -93, -var37 + arg5, class113.field1385, class4.field43);
                        if (~var32 >= ~class461.field6877) {
                            int[] var40 = class402.field6087[var32];
                            class645.method3675(125, var40, arg1, var36, var39);
                            class645.method3675(120, var40, arg0, var39, var38);
                            class645.method3675(88, var40, arg1, var38, var35);
                        }
                        if (class418.field6298 <= var31) {
                            int[] var41 = class402.field6087[var31];
                            class645.method3675(97, var41, arg1, var36, var39);
                            class645.method3675(123, var41, arg0, var39, var38);
                            class645.method3675(117, var41, arg1, var38, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lad;IZLjava/lang/String;)Ljm;")
    public static final class600 method2811(class362 arg0, int arg1, boolean arg2, String arg3) {
        ++field6802;
        if (arg2) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg1, var4);
            OpenGL.glProgramStringARB(arg1, 34933, arg3);
            OpenGL.glGetIntegerv(34379, class2.field11, 0);
            if (~class2.field11[0] != 0) {
                OpenGL.glBindProgramARB(arg1, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg1, 0);
                return new class600(arg0, arg1, var4);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Z)Z")
    public final boolean method847(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field6794;
            return this.field6803 != null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V")
    public final void method846(boolean arg0, int arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        ++field6807;
        super.field1741.method2269((byte) -122, 1);
        if (!arg0) {
            method2811((class362) null, -29, false, (String) null);
        }
        super.field1741.method2295(-111, (class507) null);
        super.field1741.method2269((byte) 6, 0);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)I")
    public final int method854(byte arg0) {
        if (arg0 < 86) {
            this.method846(false, 71);
        }
        ++field6817;
        return 1;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(B)Z")
    public final boolean method2812(byte arg0) {
        ++field6804;
        int var2 = -121 % ((49 - arg0) / 40);
        return super.field1741.field5481 && super.field1741.field5459 && super.field1741.field5452;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Z")
    public static final boolean method2813(int arg0, int arg1, int arg2) {
        if (arg0 != 256) {
            method2813(-55, 92, -8);
        }
        ++field6813;
        return (2048 & arg1) != 0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public final void method845(byte arg0) {
        this.field6798 = null;
        this.field6805 = null;
        this.field6803 = null;
        this.field6810 = null;
        this.field6811 = null;
        this.field6799 = null;
        this.field6806 = null;
        ++field6800;
        this.field6809 = null;
        this.field6815 = null;
        int var2 = -89 / ((-6 - arg0) / 56);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZILcs;Lcs;)V")
    public final void method855(boolean arg0, int arg1, class289 arg2, class289 arg3) {
        ++field6818;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6810 == null) {
            super.field1741.method2295(-126, arg2);
            super.field1741.method2266(this.field6803, !arg0);
            this.field6803.method3124(0, (byte) -63);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field6805.field6444;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class122.field1525, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6814, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6814, (float) this.field6812);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6812);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field1741.method2266(this.field6806, true);
            int var7 = class309.method2052(true, this.field6814);
            int var8 = class309.method2052(true, this.field6812);
            int var9 = 0;
            while (var7 > 256 || ~var8 < -257) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field6806.method3128(0, this.field6810[var9], (byte) 44);
                if (~var7 < -257) {
                    var7 >>= 1;
                }
                if (~var9 == -1) {
                    super.field1741.method2295(-75, arg2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6814, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6814, (float) this.field6812);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6812);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field1741.method2295(-95, this.field6810[var9 + -1]);
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
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                ++var9;
            }
            super.field1741.method2261(false, this.field6806);
            super.field1741.method2295(-104, this.field6810[var9 + -1]);
            super.field1741.method2266(this.field6803, !arg0);
            this.field6803.method3124(0, (byte) -63);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6798.field6444;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class122.field1525, 0.0F, 0.0F);
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
        this.field6803.method3124(1, (byte) -63);
        super.field1741.method2295(-82, this.field6799);
        long var12 = this.field6809.field6444;
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
        this.field6803.method3124(0, (byte) -63);
        super.field1741.method2295(-94, this.field6815);
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
        super.field1741.method2261(arg0, this.field6803);
        long var14 = this.field6811.field6444;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class213.field2946, class227.field3189, 0.0F);
        super.field1741.method2269((byte) -116, 1);
        super.field1741.method2295(-121, this.field6799);
        super.field1741.method2269((byte) -121, 0);
        super.field1741.method2295(-64, arg2);
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(B)V")
    public static void method2814(byte arg0) {
        if (arg0 <= 0) {
            field6797 = 35;
        }
        field6816 = null;
        field6808 = null;
        field6821 = null;
        field6822 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Z")
    public final boolean method848(int arg0) {
        if (arg0 > -49) {
            this.method846(true, -17);
        }
        ++field6819;
        if (super.field1741.field5481 && super.field1741.field5459 && super.field1741.field5452) {
            this.field6803 = new class535(super.field1741);
            this.field6799 = new class289(super.field1741, 3553, 34842, 256, 256);
            this.field6799.method1867(false, 2203, false);
            this.field6815 = new class289(super.field1741, 3553, 34842, 256, 256);
            this.field6815.method1867(false, 2203, false);
            super.field1741.method2266(this.field6803, true);
            this.field6803.method3128(0, this.field6799, (byte) 58);
            this.field6803.method3128(1, this.field6815, (byte) 90);
            this.field6803.method3124(0, (byte) -63);
            if (!this.field6803.method3126((byte) -90)) {
                super.field1741.method2261(false, this.field6803);
                return false;
            } else {
                super.field1741.method2261(false, this.field6803);
                this.field6805 = class224.method1458(new class451[] { class410.method2594("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field1741, (byte) 117, 35632) }, super.field1741, 5097);
                this.field6798 = class224.method1458(new class451[] { class410.method2594("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.field1741, (byte) 81, 35632) }, super.field1741, 5097);
                this.field6811 = class224.method1458(new class451[] { class410.method2594("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.field1741, (byte) 45, 35632) }, super.field1741, 5097);
                this.field6809 = class224.method1458(new class451[] { class410.method2594("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.field1741, (byte) 88, 35632) }, super.field1741, 5097);
                return this.field6798 != null && this.field6805 != null && this.field6811 != null && this.field6809 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lad;)V")
    public class455(class362 arg0) {
        super(arg0);
    }

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field6808[var0] = class501.method2992(var0, -785404980);
        }
        new class474("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field6821 = new class114();
        field6822 = new int[2];
    }
}
