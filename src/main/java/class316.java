import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class316 extends class142 {

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "Lkp;")
    public static class341 field4779 = new class341("runescape", 0);

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "[I")
    public static int[] field4782 = new int[2048];

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "Lru;")
    public static class130 field4784 = new class130(14, 1);

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "Lru;")
    public static class130 field4785 = new class130(15, 4);

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "Lru;")
    public static class130 field4786 = new class130(16, -2);

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "Lru;")
    public static class130 field4787 = new class130(17, 0);

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "Lru;")
    public static class130 field4788 = new class130(18, -2);

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "Lru;")
    public static class130 field4789 = new class130(19, -2);

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "Lru;")
    public static class130 field4790 = new class130(20, 6);

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "Lru;")
    public static class130 field4791 = new class130(21, 9);

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "Lru;")
    public static class130 field4792 = new class130(22, -2);

    @OriginalMember(owner = "client!ci", name = "hb", descriptor = "Lru;")
    public static class130 field4793 = new class130(23, 4);

    @OriginalMember(owner = "client!ci", name = "ib", descriptor = "Lru;")
    public static class130 field4794 = new class130(24, -1);

    @OriginalMember(owner = "client!ci", name = "jb", descriptor = "Lru;")
    public static class130 field4795 = new class130(25, -2);

    @OriginalMember(owner = "client!ci", name = "kb", descriptor = "[Lru;")
    private static class130[] field4796 = new class130[32];

    @OriginalMember(owner = "client!ci", name = "mb", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!ci", name = "nb", descriptor = "Lbj;")
    public static class162 field4799;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    private int field4760;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    private int field4765;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    private int field4767;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
    private int field4780;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Lsq;")
    private class120 field4759;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "Lsq;")
    private class120 field4773;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "Lvn;")
    private class206 field4768;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "Lvn;")
    private class206 field4774;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Lvo;")
    private class32 field4757;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "Lvo;")
    private class32 field4761;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "Lvo;")
    private class32 field4762;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "Lvo;")
    private class32 field4783;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "Lso;")
    public static class331 field4781;

    @OriginalMember(owner = "client!ci", name = "pb", descriptor = "[I")
    public static int[] field4801;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "[Lsq;")
    private class120[] field4769;

    @OriginalMember(owner = "client!ci", name = "lb", descriptor = "[[I")
    public static int[][] field4797;

    @OriginalMember(owner = "client!ci", name = "ob", descriptor = "[[I")
    public static int[][] field4800;

    static {
        class130[] var0 = class73.method651((byte) -8);
        for (int var1 = 0; ~var1 > ~var0.length; ++var1) {
            field4796[var0[var1].field2207] = var0[var1];
        }
        field4798 = 2;
        field4799 = new class162(71, -1);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)V", line = 4)
    public final void method1064(int arg0, byte arg1, int arg2) {
        ++field4778;
        this.field4780 = arg2;
        this.field4765 = arg0;
        if (arg1 <= 28) {
            this.method1064(-119, (byte) -53, -39);
        }
        int var4 = class5.method34((byte) -73, this.field4765);
        int var5 = class5.method34((byte) 103, this.field4780);
        if (this.field4767 != var4 || ~this.field4760 != ~var5) {
            if (this.field4769 != null) {
                for (int var6 = 0; var6 < this.field4769.length; ++var6) {
                    this.field4769[var6].method2341((byte) -98);
                }
                this.field4769 = null;
            }
            if (~var4 >= -257 && ~var5 >= -257) {
                this.field4774 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                label60: while (true) {
                    if (var7 <= 256 && ~var8 >= -257) {
                        if (this.field4774 == null) {
                            this.field4774 = new class206(super.field2349);
                        }
                        int var10 = var4;
                        this.field4769 = new class120[var9];
                        int var11 = var5;
                        int var12 = 0;
                        while (true) {
                            if (~var10 >= -257 && var11 <= 256) {
                                break label60;
                            }
                            this.field4769[var12++] = new class120(super.field2349, 3553, 34842, var10, var11);
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                        }
                    }
                    ++var9;
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                }
            }
            this.field4760 = var5;
            this.field4767 = var4;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Z", line = 85)
    public final boolean method1053(int arg0) {
        if (arg0 != -26280) {
            this.field4762 = null;
        }
        ++field4776;
        return this.field4768 != null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(FI[FIIFIIIBFII)V", line = 98)
    public static final void method1993(float arg0, int arg1, float[] arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, byte arg9, float arg10, int arg11, int arg12) {
        if (arg9 > -26) {
            method1993(0.31918105F, 88, (float[]) null, 89, -116, 0.57387215F, 29, -60, 124, (byte) -125, -1.0004203F, 56, -87);
        }
        int var13 = arg7 - arg3;
        int var14 = arg8 - arg4;
        int var15 = arg12 - arg1;
        ++field4764;
        float var16 = arg2[2] * (float) var15 + arg2[0] * (float) var13 + arg2[1] * (float) var14;
        float var17 = arg2[5] * (float) var15 + arg2[4] * (float) var14 + arg2[3] * (float) var13;
        float var18 = arg2[8] * (float) var15 + arg2[7] * (float) var14 + arg2[6] * (float) var13;
        float var19;
        float var20;
        if (arg11 != 0) {
            if (~arg11 != -2) {
                if (~arg11 != -3) {
                    if (~arg11 == -4) {
                        var19 = -var17 + arg5 + 0.5F;
                        var20 = arg10 + var16 + 0.5F;
                    } else if (~arg11 != -5) {
                        var19 = -var17 + arg5 + 0.5F;
                        var20 = -var18 + arg0 + 0.5F;
                    } else {
                        var19 = -var17 + arg5 + 0.5F;
                        var20 = arg0 + var18 + 0.5F;
                    }
                } else {
                    var20 = -var16 + arg10 + 0.5F;
                    var19 = -var17 + arg5 + 0.5F;
                }
            } else {
                var19 = arg0 + var18 + 0.5F;
                var20 = arg10 + var16 + 0.5F;
            }
        } else {
            var19 = -var18 + arg0 + 0.5F;
            var20 = arg10 + var16 + 0.5F;
        }
        if (~arg6 != -2) {
            if (arg6 == 2) {
                var20 = -var20;
                var19 = -var19;
            } else if (~arg6 == -4) {
                float var21 = var20;
                var20 = var19;
                var19 = -var21;
            }
        } else {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        }
        class195.field3141 = var19;
        class457.field6777 = var20;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)Z", line = 189)
    public final boolean method1057(int arg0) {
        ++field4772;
        if (super.field2349.field920 && super.field2349.field887 && super.field2349.field857) {
            this.field4768 = new class206(super.field2349);
            this.field4759 = new class120(super.field2349, 3553, 34842, 256, 256);
            this.field4759.method967(8276, false, false);
            this.field4773 = new class120(super.field2349, 3553, 34842, 256, 256);
            this.field4773.method967(8276, false, false);
            super.field2349.method434(10902, this.field4768);
            this.field4768.method1406(0, arg0, this.field4759);
            this.field4768.method1406(1, 0, this.field4773);
            this.field4768.method1408(-1, 0);
            if (!this.field4768.method1413(false)) {
                super.field2349.method354(this.field4768, true);
                return false;
            } else {
                super.field2349.method354(this.field4768, true);
                this.field4783 = class244.method1592(false, super.field2349, new class466[] { class257.method1658(35632, super.field2349, 2, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field4757 = class244.method1592(false, super.field2349, new class466[] { class257.method1658(35632, super.field2349, arg0 ^ 2, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
                this.field4761 = class244.method1592(false, super.field2349, new class466[] { class257.method1658(35632, super.field2349, 2, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
                this.field4762 = class244.method1592(false, super.field2349, new class466[] { class257.method1658(35632, super.field2349, 2, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
                return this.field4757 != null && this.field4783 != null && this.field4761 != null && this.field4762 != null;
            }
        } else {
            return arg0 != 0 ? false : false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)Z", line = 227)
    public final boolean method1994(byte arg0) {
        ++field4763;
        if (arg0 <= 67) {
            return true;
        } else {
            return super.field2349.field920 && super.field2349.field887 && super.field2349.field857;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIB[BIII)V", line = 243)
    public static final void method1995(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        ++field4771;
        if (arg6 > 0 && !class388.method2381(arg6, 92)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class388.method2381(arg0, 106)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class185.method1258((byte) 114, arg5);
            int var8 = 0;
            int var9 = arg0 <= arg6 ? arg0 : arg6;
            if (arg2 < -113) {
                int var10 = arg6 >> 1;
                int var11 = arg0 >> 1;
                byte[] var12 = arg3;
                byte[] var13 = new byte[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Dub(arg4, var8, arg1, arg6, arg0, 0, arg5, 5121, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = arg6 * var7;
                    for (int var15 = 0; var15 < var7; ++var15) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var14 + var15;
                        for (int var20 = 0; var20 < var11; ++var20) {
                            for (int var21 = 0; var21 < var10; ++var21) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    byte[] var16 = var13;
                    var13 = var12;
                    arg6 = var10;
                    arg0 = var11;
                    var12 = var16;
                    var10 >>= 1;
                    var11 >>= 1;
                    ++var8;
                    var9 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILya;)V", line = 340)
    public static final void method1996(int arg0, class38 arg1) {
        class520.field7560[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lda;)V", line = 348)
    public class316(class44 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V", line = 352)
    public final void method1061(int arg0) {
        this.field4759 = null;
        this.field4762 = null;
        if (arg0 != 0) {
            field4791 = null;
        }
        this.field4761 = null;
        this.field4774 = null;
        this.field4773 = null;
        ++field4766;
        this.field4768 = null;
        this.field4769 = null;
        this.field4757 = null;
        this.field4783 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B[I[ILig;[I)V", line = 372)
    public static final void method1997(byte arg0, int[] arg1, int[] arg2, class163 arg3, int[] arg4) {
        ++field4770;
        int var5 = 0;
        if (arg0 <= 67) {
            method1997((byte) -99, (int[]) null, (int[]) null, (class163) null, (int[]) null);
        }
        while (~var5 > ~arg2.length) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg3.field7802.length > var9; ++var9) {
                if ((1 & var7) != 0) {
                    if (~var6 != 0) {
                        class57 var10 = class422.field6355.method236(var6, (byte) -100);
                        int var11 = var10.field1203;
                        class452 var12 = arg3.field7802[var9];
                        if (var12 != null) {
                            if (~var12.field6710 == ~var6) {
                                if (~var11 != -1) {
                                    if (var11 != 1) {
                                        if (var11 == 2) {
                                            var12.field6715 = 0;
                                        }
                                    } else {
                                        var12.field6713 = 0;
                                        var12.field6711 = var8;
                                        var12.field6714 = 0;
                                        var12.field6715 = 0;
                                        var12.field6706 = 1;
                                        class433.method2602(var10, arg3.field6073, arg3.field6078, (byte) 38, arg3.field6084, 0, false);
                                    }
                                } else {
                                    var12 = arg3.field7802[var9] = null;
                                }
                            } else if (var10.field1204 >= class422.field6355.method236(var12.field6710, (byte) 38).field1204) {
                                var12 = arg3.field7802[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class452 var13 = arg3.field7802[var9] = new class452();
                            var13.field6715 = 0;
                            var13.field6714 = 0;
                            var13.field6711 = var8;
                            var13.field6713 = 0;
                            var13.field6710 = var6;
                            var13.field6706 = 1;
                            class433.method2602(var10, arg3.field6073, arg3.field6078, (byte) 87, arg3.field6084, 0, false);
                        }
                    } else {
                        arg3.field7802[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
            ++var5;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)I", line = 469)
    public final int method1056(int arg0) {
        ++field4758;
        if (arg0 != 0) {
            field4782 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V", line = 484)
    public final void method1060(int arg0, boolean arg1) {
        OpenGL.glUseProgramObjectARB(0L);
        if (!arg1) {
            this.method1057(126);
        }
        ++field4777;
        super.field2349.method392((byte) 106, 1);
        super.field2349.method381((byte) 28, (class381) null);
        super.field2349.method392((byte) 106, 0);
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(B)V", line = 498)
    public static void method1998(byte arg0) {
        field4786 = null;
        field4790 = null;
        field4788 = null;
        field4779 = null;
        field4795 = null;
        field4799 = null;
        field4794 = null;
        field4801 = null;
        field4789 = null;
        field4796 = null;
        if (arg0 <= 22) {
            method1996(47, (class38) null);
        }
        field4782 = null;
        field4800 = null;
        field4787 = null;
        field4791 = null;
        field4785 = null;
        field4797 = null;
        field4793 = null;
        field4784 = null;
        field4792 = null;
        field4781 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lsq;Lsq;IB)V", line = 533)
    public final void method1055(class120 arg0, class120 arg1, int arg2, byte arg3) {
        OpenGL.glPushAttrib(2048);
        ++field4775;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field4769 != null) {
            super.field2349.method434(10902, this.field4774);
            int var5 = class5.method34((byte) -54, this.field4765);
            int var6 = class5.method34((byte) -60, this.field4780);
            int var7 = 0;
            while (~var5 < -257 || ~var6 < -257) {
                OpenGL.glViewport(0, 0, var5, var6);
                this.field4774.method1406(0, 0, this.field4769[var7]);
                if (~var5 < -257) {
                    var5 >>= 1;
                }
                if (var6 > 256) {
                    var6 >>= 1;
                }
                if (var7 != 0) {
                    super.field2349.method381((byte) 28, this.field4769[var7 + -1]);
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
                    super.field2349.method381((byte) 28, arg1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field4765, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field4765, (float) this.field4780);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4780);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                ++var7;
            }
            super.field2349.method354(this.field4774, true);
            super.field2349.method381((byte) 28, this.field4769[var7 - 1]);
            super.field2349.method434(10902, this.field4768);
            this.field4768.method1408(-1, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var8 = this.field4757.field504;
            OpenGL.glUseProgramObjectARB(var8);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class18.field288, 0.0F, 0.0F);
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
            super.field2349.method381((byte) 28, arg1);
            super.field2349.method434(10902, this.field4768);
            this.field4768.method1408(-1, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field4783.field504;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class18.field288, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field4765, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field4765, (float) this.field4780);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field4780);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field4768.method1408(-1, 1);
        super.field2349.method381((byte) 28, this.field4759);
        long var12 = this.field4762.field504;
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
        this.field4768.method1408(-1, 0);
        super.field2349.method381((byte) 28, this.field4773);
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
        int var14 = -48 / ((77 - arg3) / 32);
        super.field2349.method354(this.field4768, true);
        long var15 = this.field4761.field504;
        OpenGL.glUseProgramObjectARB(var15);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var15, "params"), class71.field1435, class498.field7311, 0.0F);
        super.field2349.method392((byte) 106, 1);
        super.field2349.method381((byte) 28, this.field4759);
        super.field2349.method392((byte) 106, 0);
        super.field2349.method381((byte) 28, arg1);
    }
}
