import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class350 extends class37 {

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "Lhga;")
    private class158 field5239 = new class158();

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    private int field5237 = this.field1038 + -2;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Lus;")
    public class1 field5217;

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "[[F")
    private float[][] field5247;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    private int field5224;

    @OriginalMember(owner = "client!oj", name = "eb", descriptor = "[[F")
    private float[][] field5254;

    @OriginalMember(owner = "client!oj", name = "db", descriptor = "[[F")
    private float[][] field5253;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "[[S")
    public short[][] field5236;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "[[[I")
    public int[][][] field5218;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "[[B")
    private byte[][] field5219;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "[[[I")
    public int[][][] field5231;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "[[[I")
    private int[][][] field5235;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "[[[I")
    private int[][][] field5228;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public int field5233;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "[[[I")
    public int[][][] field5229;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "[[[Leea;")
    private class118[][][] field5226;

    @OriginalMember(owner = "client!oj", name = "jb", descriptor = "[[B")
    private byte[][] field5259;

    @OriginalMember(owner = "client!oj", name = "ib", descriptor = "Lsl;")
    private class427 field5258;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Lpj;")
    private class132 field5221;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Lsb;")
    public static class266 field5213 = new class266(63, 7);

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "J")
    public static long field5249 = 0L;

    @OriginalMember(owner = "client!oj", name = "hb", descriptor = "Lqfa;")
    public static class85 field5257 = new class85(70, -2);

    @OriginalMember(owner = "client!oj", name = "pb", descriptor = "[I")
    public static int[] field5265 = new int[2];

    @OriginalMember(owner = "client!oj", name = "qb", descriptor = "[F")
    public static float[] field5266 = new float[4];

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    private int field5225;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    private int field5227;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!oj", name = "fb", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!oj", name = "lb", descriptor = "I")
    private int field5261;

    @OriginalMember(owner = "client!oj", name = "ob", descriptor = "I")
    private int field5264;

    @OriginalMember(owner = "client!oj", name = "gb", descriptor = "Lfa;")
    public static class214 field5256;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "Lrca;")
    private class423 field5246;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "Lrca;")
    public class423 field5250;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "Lrca;")
    public class423 field5251;

    @OriginalMember(owner = "client!oj", name = "kb", descriptor = "Lrca;")
    public class423 field5260;

    @OriginalMember(owner = "client!oj", name = "mb", descriptor = "Lel;")
    private class510 field5262;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "[Leea;")
    private class118[] field5248;

    @OriginalMember(owner = "client!oj", name = "nb", descriptor = "[Lgfa;")
    public static class697[] field5263;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "[[[I")
    private int[][][] field5234;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method537(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5242;
        if (this.field5221 != null && arg0 != null) {
            int var7 = -(this.field5217.field334 * arg2 >> 8) + arg1 >> this.field5217.field212;
            int var8 = arg3 - (this.field5217.field330 * arg2 >> 8) >> this.field5217.field212;
            this.field5221.method1106((byte) -25, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public final void method544(int arg0, int arg1, int arg2) {
        ++field5223;
        if ((255 & this.field5259[arg0][arg1]) < arg2) {
            this.field5259[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "(IILha;)Lha;")
    public final class54 method550(int arg0, int arg1, class54 arg2) {
        ++field5243;
        if (~(this.field5219[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field1040 >> this.field5217.field212;
            class170 var5 = (class170) arg2;
            class170 var6;
            if (var5 != null && var5.method1285(var4, var4, 33)) {
                var6 = var5;
                var5.method1289(100);
            } else {
                var6 = new class170(this.field5217, var4, var4);
            }
            var6.method1286(0, 64, var4, 0, var4);
            this.method2265(arg1, (byte) -125, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oj", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method539(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5220;
        if (this.field5221 != null && arg0 != null) {
            int var7 = -(this.field5217.field334 * arg2 >> 8) + arg1 >> this.field5217.field212;
            int var8 = -(this.field5217.field330 * arg2 >> 8) + arg3 >> this.field5217.field212;
            this.field5221.method1101(var7, arg0, 0, var8);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static final void method2264(int arg0) {
        class645.field9299 = null;
        ++field5222;
        int var1 = -19 % ((54 - arg0) / 62);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBLffa;I)V")
    private final void method2265(int arg0, byte arg1, class170 arg2, int arg3) {
        ++field5214;
        int[] var5 = this.field5218[arg3][arg0];
        if (arg1 <= -122) {
            int[] var6 = this.field5229[arg3][arg0];
            int var7 = var5.length;
            if (~this.field5217.field364.length > ~var7) {
                this.field5217.field362 = new int[var7];
                this.field5217.field364 = new int[var7];
            }
            int[] var8 = this.field5217.field364;
            int[] var9 = this.field5217.field362;
            for (int var10 = 0; ~var10 > ~var7; ++var10) {
                var8[var10] = var5[var10] >> this.field5217.field212;
                var9[var10] = var6[var10] >> this.field5217.field212;
            }
            int var11 = 0;
            while (var7 > var11) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if (~((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16))) < -1) {
                    arg2.method1284(var15, var12, var13, var17, var16, 0, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
    public final void method545(int arg0, int arg1) {
        ++field5245;
    }

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method542(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field5228 == null) {
            this.field5228 = new int[super.field1041][super.field1043][];
        }
        if (arg5 != null && this.field5234 == null) {
            this.field5234 = new int[super.field1041][super.field1043][];
        }
        ++field5240;
        this.field5218[arg0][arg1] = arg2;
        this.field5229[arg0][arg1] = arg4;
        this.field5231[arg0][arg1] = arg6;
        this.field5235[arg0][arg1] = arg7;
        if (this.field5234 != null) {
            this.field5234[arg0][arg1] = arg5;
        }
        if (this.field5228 != null) {
            this.field5228[arg0][arg1] = arg3;
        }
        class118[] var15 = this.field5226[arg0][arg1] = new class118[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14);
            class425 var19;
            for (var19 = this.field5258.method2596(var17, 49); var19 != null; var19 = this.field5258.method2595(27126)) {
                class118 var20 = (class118) var19;
                if (arg8[var16] == var20.field2105 && (float) arg9[var16] == var20.field2108 && var20.field2093 == arg10 && var20.field2106 == arg11 && var20.field2111 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class118(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field5258.method2598(var15[var16], var17, (byte) 8);
            } else {
                var15[var16] = (class118) var19;
            }
        }
        if (arg13) {
            this.field5219[arg0][arg1] = (byte) class2.method189(this.field5219[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field5261) {
            this.field5261 = arg6.length;
        }
        this.field5264 += arg6.length;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([[ZZIBIII)V")
    private final void method2266(boolean[][] arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 == -89) {
            if (this.field5248 != null) {
                int var8 = arg4 + arg4 + 1;
                int var9 = var8 * var8;
                if (~var9 < ~this.field5217.field365.length) {
                    this.field5217.field365 = new int[var9];
                }
                if (~this.field5217.field333.field1397.length > ~(this.field5227 * 2)) {
                    this.field5217.field333 = new class424(this.field5227 * 2);
                }
                int var10 = -arg4 + arg2;
                int var11 = var10;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var12 = -arg4 + arg5;
                int var13 = var12;
                if (var12 < 0) {
                    var12 = 0;
                }
                int var14 = arg2 + arg4;
                if (~var14 < ~(super.field1041 + -1)) {
                    var14 = super.field1041 + -1;
                }
                int var15 = arg5 - -arg4;
                if (~var15 < ~(super.field1043 + -1)) {
                    var15 = super.field1043 - 1;
                }
                int var16 = 0;
                int[] var17 = this.field5217.field365;
                for (int var18 = var10; var14 >= var18; ++var18) {
                    boolean[] var24 = arg0[-var11 + var18];
                    for (int var25 = var12; ~var25 >= ~var15; ++var25) {
                        if (var24[-var13 + var25]) {
                            var17[var16++] = super.field1041 * var25 + var18;
                        }
                    }
                }
                if (~arg6 == 0) {
                    this.field5217.method8(-89);
                } else {
                    this.field5217.method78(arg3 + 89, (float) arg6);
                    this.field5217.method3(12787);
                }
                this.field5217.method172(~(7 & this.field5233) != -1, 4);
                for (int var19 = 0; ~var19 > ~this.field5248.length; ++var19) {
                    this.field5248[var19].method1037(var17, var16, (byte) 99);
                }
                if (!this.field5239.method1223(-2)) {
                    int var20 = this.field5217.field324;
                    int var21 = this.field5217.field254;
                    this.field5217.method152(0, var21, this.field5217.field325);
                    this.field5217.method172(false, 4);
                    this.field5217.method45(false, -104);
                    this.field5217.method7(128, (byte) 76);
                    this.field5217.method161(-127, -2);
                    this.field5217.method5(3845, this.field5217.field255);
                    this.field5217.method148(7681, 8448, (byte) -119);
                    this.field5217.method10(0, 770, 34166, 34192);
                    this.field5217.method135((byte) 65, 34167, 0, 770);
                    for (class425 var22 = this.field5239.method1224(-2); var22 != null; var22 = this.field5239.method1232(-2)) {
                        class101 var23 = (class101) var22;
                        var23.method938(arg0, arg2, arg4, arg5, arg3 + 87);
                    }
                    this.field5217.method10(0, 768, 5890, 34192);
                    this.field5217.method135((byte) -85, 5890, 0, 770);
                    this.field5217.method5(arg3 ^ -3934, (class487) null);
                    this.field5217.method152(var20, var21, this.field5217.field325);
                }
                if (this.field5221 != null) {
                    OpenGL.glPushMatrix();
                    OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                    this.field5217.method184(this.field5260, this.field5250, (class423) null, (class423) null, (byte) 57);
                    this.field5221.method1105(arg1, (byte) -75, arg2, arg4, arg5, arg0);
                    OpenGL.glPopMatrix();
                }
            }
            ++field5232;
        }
    }

    @OriginalMember(owner = "client!oj", name = "BA", descriptor = "()V")
    public final void method547() {
        ++field5230;
        if (this.field5264 > 0) {
            byte[][] var1 = new byte[super.field1041 + 1][super.field1043 - -1];
            for (int var2 = 1; ~super.field1041 < ~var2; ++var2) {
                for (int var103 = 1; var103 < super.field1043; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5259[var2][var103 + 1] >> 3) + (this.field5259[var2][var103 - 1] >> 2) + (this.field5259[var2 + 1][var103] >> 3) + (this.field5259[var2 - 1][var103] >> 2) + (this.field5259[var2][var103] >> 1));
                }
            }
            this.field5248 = new class118[this.field5258.method2603(-124)];
            this.field5258.method2599(-81, this.field5248);
            for (int var3 = 0; this.field5248.length > var3; ++var3) {
                this.field5248[var3].method1033(this.field5264, (byte) 59);
            }
            int var4 = 24;
            if (this.field5234 != null) {
                var4 += 4;
            }
            if (~(this.field5233 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field5217.field214.method3567(this.field5264 * var4, false);
            Stream var6 = new Stream(var5);
            class118[] var7 = new class118[this.field5264];
            int var8 = class264.method1730(82, this.field5264 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class427 var9 = new class427(var8);
            class118[] var10 = new class118[this.field5261];
            for (int var11 = 0; ~var11 > ~super.field1041; ++var11) {
                for (int var30 = 0; super.field1043 > var30; ++var30) {
                    if (this.field5231[var11][var30] != null) {
                        class118[] var31 = this.field5226[var11][var30];
                        int[] var32 = this.field5218[var11][var30];
                        int[] var33 = this.field5229[var11][var30];
                        int[] var34 = this.field5235[var11][var30];
                        int[] var35 = this.field5231[var11][var30];
                        int[] var36 = this.field5228 == null ? null : this.field5228[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field5234 == null ? null : this.field5234[var11][var30];
                        float var38 = this.field5254[var11][var30];
                        float var39 = this.field5247[var11][var30];
                        float var40 = this.field5253[var11][var30];
                        float var41 = this.field5254[var11][var30 + 1];
                        float var42 = this.field5247[var11][var30 + 1];
                        float var43 = this.field5253[var11][var30 + 1];
                        float var44 = this.field5254[var11 + 1][var30 - -1];
                        float var45 = this.field5247[var11 + 1][var30 - -1];
                        float var46 = this.field5253[var11 + 1][var30 + 1];
                        float var47 = this.field5254[var11 + 1][var30];
                        float var48 = this.field5247[var11 - -1][var30];
                        float var49 = this.field5253[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = 255 & var1[var11 + 1][var30 - -1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label339: for (int var55 = 0; var35.length > var55; ++var55) {
                            class118 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5236[super.field1041 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field1038) - -var32[var57];
                            int var59 = (var30 << super.field1038) + var33[var57];
                            int var60 = var58 >> this.field5237;
                            int var61 = var59 >> this.field5237;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            float var74;
                            int var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var40;
                                var73 = var38;
                                var74 = var39;
                                var75 = var69 - var50;
                            } else if (var67 == 0 && ~super.field1040 == ~var68) {
                                var75 = var69 - var51;
                                var73 = var41;
                                var72 = var43;
                                var74 = var42;
                            } else if (super.field1040 == var67 && super.field1040 == var68) {
                                var72 = var46;
                                var74 = var45;
                                var75 = var69 - var52;
                                var73 = var44;
                            } else if (super.field1040 == var67 && ~var68 == -1) {
                                var73 = var47;
                                var75 = var69 - var53;
                                var72 = var49;
                                var74 = var48;
                            } else {
                                float var76 = (float) var67 / (float) super.field1040;
                                float var77 = (float) var68 / (float) super.field1040;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var74 = (-var79 + var82) * var77 + var79;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var73 = (var81 - var78) * var77 + var78;
                                var72 = (-var80 + var83) * var77 + var80;
                                int var84 = var50 - -((-var50 + var53) * var67 >> super.field1038);
                                int var85 = var51 - -((var52 - var51) * var67 >> super.field1038);
                                var75 = var69 - (((var85 - var84) * var68 >> super.field1038) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var75 >> 7;
                                if (~var86 <= -3) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if ((7 & this.field5233) == 0) {
                                    float var87 = this.field5217.field268[2] * var72 + this.field5217.field268[0] * var73 + this.field5217.field268[1] * var74;
                                    var71 = var87 * (var87 > 0.0F ? this.field5217.field300 : this.field5217.field338) + this.field5217.field296;
                                }
                                var70 = class492.field7038[65408 & var62 | var86];
                            }
                            class425 var88 = null;
                            if ((this.field5224 - 1 & var58) == 0 && (var59 & this.field5224 - 1) == 0) {
                                var88 = var9.method2596(var65, 93);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class408) var88).field5906;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && ~var7[var89].field6132 < ~var31[var57].field6132) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (~var62 != ~var63) {
                                    int var90 = (var63 & 127) * var75 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var91 = class492.field7038[65408 & var63 | var90];
                                    if ((this.field5233 & 7) == 0) {
                                        float var92 = this.field5217.field268[2] * var72 + this.field5217.field268[0] * var73 + this.field5217.field268[1] * var74;
                                        float var93 = (var71 > 0.0F ? this.field5217.field300 : this.field5217.field338) * var71 + this.field5217.field296;
                                        int var94 = var91 >> 16 & 255;
                                        int var95 = 255 & var91 >> 8;
                                        int var96 = var91 & 255;
                                        int var97 = (int) ((float) var94 * var93);
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (~var98 <= -1) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        if (~var99 <= -1) {
                                            if (var99 > 255) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var91 = var99 | var98 << 8 | var97 << 16;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (!this.field5217.field267) {
                                    var6.method3584((float) var58);
                                    var6.method3584((float) (this.method552(1, var58, var59) + var64));
                                    var6.method3584((float) var59);
                                    var6.method3570((byte) (var91 >> 16));
                                    var6.method3570((byte) (var91 >> 8));
                                    var6.method3570((byte) var91);
                                    var6.method3570(-1);
                                    var6.method3584((float) var58);
                                    var6.method3584((float) var59);
                                    if (this.field5234 != null) {
                                        var6.method3584((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field5233) != 0) {
                                        var6.method3584(var73);
                                        var6.method3584(var74);
                                        var6.method3584(var72);
                                    }
                                } else {
                                    var6.method3582((float) var58);
                                    var6.method3582((float) (this.method552(1, var58, var59) + var64));
                                    var6.method3582((float) var59);
                                    var6.method3570((byte) (var91 >> 16));
                                    var6.method3570((byte) (var91 >> 8));
                                    var6.method3570((byte) var91);
                                    var6.method3570(-1);
                                    var6.method3582((float) var58);
                                    var6.method3582((float) var59);
                                    if (this.field5234 != null) {
                                        var6.method3582((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if (~(7 & this.field5233) != -1) {
                                        var6.method3582(var73);
                                        var6.method3582(var74);
                                        var6.method3582(var72);
                                    }
                                }
                                var89 = this.field5225++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method2598(new class408(var56[var57]), var65, (byte) 8);
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1035(var89, var75, var71, var70, 21);
                            }
                            ++this.field5227;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field5225; ++var12) {
                class118 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1030(var12, 256);
                }
            }
            for (int var13 = 0; ~super.field1041 < ~var13; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field1043; ++var18) {
                    short[] var19 = this.field5236[super.field1041 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class118 var25 = var7[var22];
                            class118 var26 = var7[var23];
                            class118 var27 = var7[var24];
                            class118 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1031((byte) 117, var13, var20, var18);
                            }
                            if (var26 != null) {
                                var26.method1031((byte) 111, var13, var20, var18);
                                if (var28 == null || ~var28.field6132 < ~var26.field6132) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1031((byte) 117, var13, var20, var18);
                                if (var28 == null || ~var27.field6132 > ~var28.field6132) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1030(var22, 256);
                                }
                                if (var26 != null) {
                                    var28.method1030(var23, 256);
                                }
                                if (var27 != null) {
                                    var28.method1030(var24, 256);
                                }
                                var28.method1031((byte) 112, var13, var20, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3576();
            this.field5262 = this.field5217.method183(var6.method3577(), var4, var5, false, (byte) -60);
            this.field5250 = new class423(this.field5262, 5126, 3, 0);
            this.field5246 = new class423(this.field5262, 5121, 4, 12);
            byte var14;
            if (this.field5234 != null) {
                this.field5260 = new class423(this.field5262, 5126, 3, 16);
                var14 = 28;
            } else {
                this.field5260 = new class423(this.field5262, 5126, 2, 16);
                var14 = 24;
            }
            if (~(7 & this.field5233) != -1) {
                this.field5251 = new class423(this.field5262, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5248.length];
            for (int var16 = 0; ~var16 > ~this.field5248.length; ++var16) {
                class118 var17 = this.field5248[var16];
                var15[var16] = var17.field6132;
                var17.method1034(this.field5225, (byte) 8);
            }
            class84.method847(84, this.field5248, var15);
            if (this.field5221 != null) {
                this.field5221.method1107(0);
            }
        } else {
            this.field5221 = null;
        }
        this.field5218 = this.field5229 = null;
        this.field5235 = null;
        this.field5226 = null;
        this.field5231 = null;
        this.field5258 = null;
        this.field5259 = null;
        this.field5234 = null;
        this.field5254 = this.field5247 = this.field5253 = null;
        this.field5228 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lff;[I)V")
    public final void method541(class9 arg0, int[] arg1) {
        ++field5215;
        this.field5239.method1229(new class101(this.field5217, this, arg0, arg1), (byte) 120);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public static void method2267(int arg0) {
        field5263 = null;
        field5256 = null;
        if (arg0 == 9658) {
            field5266 = null;
            field5257 = null;
            field5213 = null;
            field5265 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method543(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5252;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method542(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method2268(String arg0, boolean arg1) {
        ++field5216;
        if (arg0 == null) {
            return false;
        } else if (!arg1) {
            return true;
        } else {
            for (int var2 = 0; class296.field4436 > var2; ++var2) {
                if (arg0.equalsIgnoreCase(class38.field1057[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class34.field974[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5241;
        if (~this.field5264 < -1) {
            this.field5217.method128((byte) -96);
            this.field5217.method61(false, 101);
            this.field5217.method172(false, 4);
            this.field5217.method57(94, false);
            this.field5217.method45(false, -103);
            this.field5217.method7(0, (byte) 76);
            this.field5217.method161(-112, -2);
            this.field5217.method5(3845, (class487) null);
            class34.field973[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field5217.field131) + -1.0F;
            class34.field973[9] = 0.0F;
            class34.field973[3] = 0.0F;
            class34.field973[5] = (float) arg2 / ((float) super.field1040 * 128.0F * (float) this.field5217.field24);
            class34.field973[1] = 0.0F;
            class34.field973[15] = 1.0F;
            class34.field973[7] = 0.0F;
            class34.field973[2] = 0.0F;
            class34.field973[11] = 0.0F;
            class34.field973[8] = 0.0F;
            class34.field973[0] = (float) arg2 / ((float) super.field1040 * 128.0F * (float) this.field5217.field131);
            class34.field973[14] = 0.0F;
            class34.field973[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5217.field24;
            class34.field973[4] = 0.0F;
            class34.field973[6] = 0.0F;
            class34.field973[10] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class34.field973, 0);
            class34.field973[14] = 0.0F;
            class34.field973[4] = 0.0F;
            class34.field973[1] = 0.0F;
            class34.field973[8] = 0.0F;
            class34.field973[6] = 1.0F;
            class34.field973[5] = 0.0F;
            class34.field973[11] = 0.0F;
            class34.field973[9] = 1.0F;
            class34.field973[2] = 0.0F;
            class34.field973[12] = 0.0F;
            class34.field973[3] = 0.0F;
            class34.field973[7] = 0.0F;
            class34.field973[15] = 1.0F;
            class34.field973[13] = 0.0F;
            class34.field973[0] = 1.0F;
            class34.field973[10] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class34.field973, 0);
            if ((7 & this.field5233) == 0) {
                this.field5217.method172(false, 4);
            } else {
                this.field5217.method172(true, 4);
                this.field5217.method15(-2);
            }
            this.field5217.method184(this.field5260, this.field5250, this.field5246, this.field5251, (byte) 110);
            if (~this.field5217.field333.field1397.length <= ~(this.field5227 * 2)) {
                this.field5217.field333.field1393 = 0;
            } else {
                this.field5217.field333 = new class424(this.field5227 * 2);
            }
            int var9 = 0;
            class424 var10 = this.field5217.field333;
            if (this.field5217.field267) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field1041 * var11 - -arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field5236[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method745(65535 & var14[var15], 128);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field1041 * var16 + arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[var19 - arg3][-arg4 + var16]) {
                            short[] var20 = this.field5236[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    ++var9;
                                    var10.method689(var20[var21] & 65535, true);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class603 var17 = new class603(this.field5217, 5123, var10.field1397, var10.field1393);
                this.field5217.method9(var17, 0, 4, (byte) 90, var9);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[[ZZI)V")
    public final void method548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field5244;
        this.method2266(arg3, arg4, arg0, (byte) -89, arg2, arg1, arg5);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method538(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5238;
        if (this.field5221 != null && arg0 != null) {
            int var7 = -(this.field5217.field334 * arg2 >> 8) + arg1 >> this.field5217.field212;
            int var8 = -(this.field5217.field330 * arg2 >> 8) + arg3 >> this.field5217.field212;
            return this.field5221.method1103(var7, var8, arg0, (byte) -41);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lus;IIII[[I[[II)V")
    public class350(class1 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5217 = arg0;
        this.field5247 = new float[super.field1041 - -1][super.field1043 + 1];
        this.field5224 = 1 << this.field5237;
        this.field5254 = new float[super.field1041 + 1][super.field1043 + 1];
        this.field5253 = new float[super.field1041 - -1][super.field1043 + 1];
        this.field5236 = new short[arg3 * arg4][];
        this.field5218 = new int[arg3][arg4][];
        this.field5219 = new byte[arg3][arg4];
        this.field5231 = new int[arg3][arg4][];
        this.field5235 = new int[arg3][arg4][];
        this.field5228 = new int[arg3][arg4][];
        this.field5233 = arg2;
        this.field5229 = new int[arg3][arg4][];
        this.field5226 = new class118[arg3][arg4][];
        this.field5259 = new byte[arg3 + 1][arg4 + 1];
        for (int var9 = 1; ~var9 > ~super.field1043; ++var9) {
            for (int var10 = 1; super.field1041 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field5254[var10][var9] = (float) var11 * var13;
                this.field5247[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5253[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5258 = new class427(128);
        if (~(this.field5233 & 16) != -1) {
            this.field5221 = new class132(this.field5217, this);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[[ZZ)V")
    public final void method540(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field5255;
        this.method2266(arg3, arg4, arg0, (byte) -89, arg2, arg1, -1);
    }
}
