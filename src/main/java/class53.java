import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class53 extends class132 {

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "F")
    private float field562 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "F")
    private float field580 = -3.4028235E38F;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Leea;")
    private class114 field554 = new class114();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    private int field561 = this.field1663 + -2;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "[[I")
    private int[][] field578;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Ltu;")
    public class294 field570;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "[[[I")
    private int[][][] field565;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "[[B")
    private byte[][] field586;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "[[F")
    private float[][] field594;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "[[[I")
    public int[][][] field584;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "[[F")
    private float[][] field589;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "[[B")
    private byte[][] field575;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "[[[I")
    public int[][][] field576;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "[[[I")
    private int[][][] field566;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "[[F")
    private float[][] field591;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "[[[I")
    public int[][][] field559;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[[S")
    public short[][] field550;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[[[Ldk;")
    private class442[][][] field551;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "Lsd;")
    private class80 field596;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lob;")
    private class639 field555;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Lfj;")
    public static class572 field563 = new class572("", 11);

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "Lea;")
    public static class474 field595 = new class474("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "Lcca;")
    private class209 field593;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "Lcca;")
    private class209 field597;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "Lep;")
    public class358 field590;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "[Ldk;")
    private class442[] field588;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "[[[I")
    private int[][][] field572;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method263(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field577;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method252(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILvs;I)V")
    private final void method289(int arg0, int arg1, class514 arg2, int arg3) {
        ++field553;
        int[] var5 = this.field584[arg0][arg3];
        int[] var6 = this.field576[arg0][arg3];
        int var7 = var5.length;
        if (~var7 < ~class91.field1053.length) {
            class91.field1053 = new int[var7];
            class656.field9492 = new int[var7];
        }
        for (int var8 = 0; ~var8 > ~var7; ++var8) {
            class91.field1053[var8] = var5[var8] >> this.field570.field4303;
            class656.field9492[var8] = var6[var8] >> this.field570.field4303;
        }
        if (arg1 != -12983) {
            this.field593 = null;
        }
        int var9 = 0;
        while (~var7 < ~var9) {
            int var10 = class91.field1053[var9];
            int var11 = class656.field9492[var9++];
            int var12 = class91.field1053[var9];
            int var13 = class656.field9492[var9++];
            int var14 = class91.field1053[var9];
            int var15 = class656.field9492[var9++];
            if (~((-var12 + var10) * (-var15 + var13) - (var13 - var11) * (-var12 + var14)) < -1) {
                arg2.method3056(var12, var11, var14, var13, var10, arg1 + 12983, var15);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method290(int arg0) {
        if (arg0 == 0) {
            field595 = null;
            field563 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public final void method254(int arg0, int arg1) {
        ++field583;
    }

    @OriginalMember(owner = "client!ha", name = "sa", descriptor = "(II)I")
    public final int method249(int arg0, int arg1) {
        ++field549;
        int var3 = arg0 >> super.field1663;
        int var4 = arg1 >> super.field1663;
        if (~var3 <= -1 && var4 >= 0 && var3 <= super.field1656 - 1 && ~(super.field1660 + -1) <= ~var4) {
            int var5 = super.field1662 + -1 & arg0;
            int var6 = arg1 & super.field1662 - 1;
            int var7 = (-var5 + super.field1662) * this.field578[var3][var4] + this.field578[var3 + 1][var4] * var5 >> super.field1663;
            int var8 = (-var5 + super.field1662) * this.field578[var3][var4 + 1] + this.field578[var3 + 1][var4 + 1] * var5 >> super.field1663;
            return (-var6 + super.field1662) * var7 + var6 * var8 >> super.field1663;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgda;)V")
    public static final void method291(class49 arg0) {
        if (class351.field5007 < 65535) {
            class321 var1 = arg0.field522;
            class48.field512[class351.field5007] = arg0;
            class499.field7273[class351.field5007] = false;
            ++class351.field5007;
            int var2 = arg0.field520;
            if (arg0.field525) {
                var2 = 0;
            }
            int var3 = arg0.field520;
            if (arg0.field517) {
                var3 = class637.field9161 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method2095(true) - var1.method2094(0) + class170.field2095 >> class465.field6917;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method2095(true) + var1.method2094(0) - class170.field2095 >> class465.field6917;
                if (var7 >= class91.field1047) {
                    var7 = class91.field1047 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field516[var5++];
                    int var10 = (var1.method2093((byte) 102) - var1.method2094(0) + class170.field2095 >> class465.field6917) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class588.field8441) {
                        var11 = class588.field8441 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class207.field2784[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class207.field2784[var4][var12][var8] = var13 | (long) class351.field5007;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class207.field2784[var4][var12][var8] = var13 | (long) class351.field5007 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class207.field2784[var4][var12][var8] = var13 | (long) class351.field5007 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class207.field2784[var4][var12][var8] = var13 | (long) class351.field5007 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field560;
        if (~this.field592 < -1) {
            class396 var9 = this.field570.method1924(-9248, this.field564);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method652(true, 31983);
                if (var14 != null) {
                    Stream var15 = this.field570.method1932(var14, (byte) -82);
                    if (Stream.method3423()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field1656 * var16 - -arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][var16 - arg4]) {
                                    short[] var19 = this.field550[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            var15.method3414(var21);
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                            if (~var21 < ~var12) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field1656 * var22 - -arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][var22 - arg4]) {
                                    short[] var27 = this.field550[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            var15.method3413(var29);
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3411();
                    if (var9.method651(-15045)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field570.method1975(-3);
                this.field570.method1978(false, 20096);
                this.field570.method1931(false, -55);
                this.field570.method1969(false, false);
                this.field570.method1905((byte) -114, false);
                this.field570.method1961(0, 11557);
                this.field570.method1899(false, -2, false, 0);
                this.field570.method1971((byte) -85, (class502) null);
                class646 var23 = this.field570.method1898(false);
                float[] var24 = this.field570.method1965(0);
                var24[4] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field570.field4135;
                var24[1] = 0.0F;
                var24[8] = 0.0F;
                var24[14] = -this.field562 / (this.field580 - this.field562);
                var24[11] = 0.0F;
                var24[2] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field570.field4170) + -1.0F;
                var24[6] = 0.0F;
                var24[10] = 1.0F / (this.field580 - this.field562);
                var24[0] = (float) arg2 / ((float) super.field1662 * 128.0F * (float) this.field570.field4170);
                var24[9] = 0.0F;
                var24[15] = 1.0F;
                var24[3] = 0.0F;
                var24[7] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field1662 * 128.0F * (float) this.field570.field4135);
                var23.method3693(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, (byte) 122, 0.0F, 0.0F, 1.0F);
                this.field570.method1928((byte) -32);
                this.field570.method1959(8769);
                if ((this.field552 & 7) != 0) {
                    this.field570.method1931(true, -2);
                    this.field570.method1563(110);
                } else {
                    this.field570.method1931(false, -76);
                }
                this.field570.method1518(-28192, false);
                this.field570.method1558(this.field597, 123, 0);
                this.field570.method1558(this.field593, 114, 1);
                this.field570.method1562(118, this.field590);
                this.field570.method1508(-28296, var11, var10 / 3, var12 + 1 + -var11, 0, class256.field3658, var9);
                this.field570.method1518(-28192, true);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method256(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field573;
        if (this.field555 != null && arg0 != null) {
            int var7 = -(this.field570.field4304 * arg2 >> 8) + arg1 >> this.field570.field4303;
            int var8 = -(this.field570.field4283 * arg2 >> 8) + arg3 >> this.field570.field4303;
            this.field555.method3639(var7, (byte) 75, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[ZZ)V")
    public final void method262(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method292(arg3, (byte) -89, arg2, arg0, arg4, arg1, -1);
        ++field581;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IILw;)Lw;")
    public final class252 method250(int arg0, int arg1, class252 arg2) {
        ++field557;
        if ((this.field575[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field1662 >> this.field570.field4303;
            class514 var5 = (class514) arg2;
            class514 var6;
            if (var5 != null && var5.method3050(-65, var4, var4)) {
                var6 = var5;
                var5.method3051((byte) -48);
            } else {
                var6 = new class514(this.field570, var4, var4);
            }
            var6.method3055(-12544624, 0, 0, var4, var4);
            this.method289(arg0, -12983, var6, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ha", name = "ba", descriptor = "()V")
    public final void method257() {
        if (this.field592 <= 0) {
            this.field555 = null;
        } else {
            byte[][] var1 = new byte[super.field1656 - -1][super.field1660 + 1];
            for (int var2 = 1; ~var2 > ~super.field1656; ++var2) {
                for (int var107 = 1; var107 < super.field1660; ++var107) {
                    var1[var2][var107] = (byte) ((this.field586[var2][var107] >> 1) + (this.field586[var2][var107 + 1] >> 3) + (this.field586[var2 + -1][var107] >> 2) + (this.field586[var2][var107 + -1] >> 2) + (this.field586[var2 + 1][var107] >> 3));
                }
            }
            class442[] var3 = new class442[this.field596.method521((byte) -77)];
            this.field596.method519(7710, var3);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method2747(this.field592, (byte) -119);
            }
            int var5 = 20;
            if (this.field572 != null) {
                var5 += 4;
            }
            if ((this.field552 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field570.field4224.method3408(this.field592 * 4, false);
            NativeHeapBuffer var7 = this.field570.field4224.method3408(this.field592 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class442[] var10 = new class442[this.field592];
            int var11 = class309.method2052(true, this.field592 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class80 var12 = new class80(var11);
            class442[] var13 = new class442[this.field587];
            for (int var14 = 0; ~super.field1656 < ~var14; ++var14) {
                for (int var34 = 0; var34 < super.field1660; ++var34) {
                    if (this.field559[var14][var34] != null) {
                        class442[] var35 = this.field551[var14][var34];
                        int[] var36 = this.field584[var14][var34];
                        int[] var37 = this.field576[var14][var34];
                        int[] var38 = this.field565[var14][var34];
                        int[] var39 = this.field559[var14][var34];
                        int[] var40 = this.field566 == null ? null : this.field566[var14][var34];
                        int[] var41 = this.field572 == null ? null : this.field572[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field589[var14][var34];
                        float var43 = this.field594[var14][var34];
                        float var44 = this.field591[var14][var34];
                        float var45 = this.field589[var14][var34 + 1];
                        float var46 = this.field594[var14][var34 + 1];
                        float var47 = this.field591[var14][var34 - -1];
                        float var48 = this.field589[var14 + 1][var34 - -1];
                        float var49 = this.field594[var14 + 1][var34 - -1];
                        float var50 = this.field591[var14 + 1][var34 + 1];
                        float var51 = this.field589[var14 + 1][var34];
                        float var52 = this.field594[var14 + 1][var34];
                        float var53 = this.field591[var14 - -1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = 255 & var1[var14 - -1][var34 - -1];
                        int var57 = var1[var14 - -1][var34] & 255;
                        int var58 = 0;
                        label361: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class442 var105 = var35[var59];
                            for (int var106 = 0; var106 < var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label361;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field550[super.field1656 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field1663) - -var36[var61];
                            int var63 = (var34 << super.field1663) - -var37[var61];
                            int var64 = var62 >> this.field561;
                            int var65 = var63 >> this.field561;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var65 | (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16);
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            int var76;
                            float var77;
                            float var78;
                            float var79;
                            if (~var71 == -1 && var72 == 0) {
                                var76 = var73 - var54;
                                var77 = var42;
                                var78 = var43;
                                var79 = var44;
                            } else if (var71 == 0 && ~super.field1662 == ~var72) {
                                var79 = var47;
                                var78 = var46;
                                var77 = var45;
                                var76 = var73 - var55;
                            } else if (super.field1662 == var71 && super.field1662 == var72) {
                                var79 = var50;
                                var76 = var73 - var56;
                                var77 = var48;
                                var78 = var49;
                            } else if (~super.field1662 == ~var71 && ~var72 == -1) {
                                var78 = var52;
                                var77 = var51;
                                var79 = var53;
                                var76 = var73 - var57;
                            } else {
                                float var80 = (float) var71 / (float) super.field1662;
                                float var81 = (float) var72 / (float) super.field1662;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (var49 - var46) * var80 + var46;
                                float var87 = (var50 - var47) * var80 + var47;
                                var77 = (var85 - var82) * var81 + var82;
                                var78 = (var86 - var83) * var81 + var83;
                                var79 = (-var84 + var87) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field1663) + var54;
                                int var89 = ((var56 - var55) * var71 >> super.field1663) + var55;
                                var76 = var73 - (((var89 - var88) * var72 >> super.field1663) + var88);
                            }
                            if (~var66 != 0) {
                                int var90 = (var66 & 127) * var76 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                if ((7 & this.field552) == 0) {
                                    float var91 = this.field570.field4337[2] * var79 + this.field570.field4337[1] * var78 + this.field570.field4337[0] * var77;
                                    var75 = this.field570.field4326 + (var91 > 0.0F ? this.field570.field4274 : this.field570.field4357) * var91;
                                }
                                var74 = class403.field6100[var66 & 65408 | var90];
                            }
                            class324 var92 = null;
                            if (~(var62 & this.field556 + -1) == -1 && ~(this.field556 - 1 & var63) == -1) {
                                var92 = var12.method524((byte) 116, var69);
                            }
                            int var103;
                            if (var92 == null) {
                                int var93;
                                if (~var66 == ~var67) {
                                    var93 = var74;
                                } else {
                                    int var94 = (var67 & 127) * var76 >> 7;
                                    if (var94 < 2) {
                                        var94 = 2;
                                    } else if (~var94 < -127) {
                                        var94 = 126;
                                    }
                                    var93 = class403.field6100[var94 | var67 & 65408];
                                    if (~(this.field552 & 7) == -1) {
                                        float var95 = this.field570.field4337[2] * var79 + this.field570.field4337[0] * var77 + this.field570.field4337[1] * var78;
                                        float var96 = (!(var75 > 0.0F) ? this.field570.field4357 : this.field570.field4274) * var75 + this.field570.field4326;
                                        int var97 = var93 >> 16 & 255;
                                        int var98 = 255 & var93 >> 8;
                                        int var99 = (int) ((float) var97 * var96);
                                        int var100 = var93 & 255;
                                        int var101 = (int) ((float) var98 * var96);
                                        if (var99 < 0) {
                                            var99 = 0;
                                        } else if (~var99 < -256) {
                                            var99 = 255;
                                        }
                                        if (var101 < 0) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var100 * var96);
                                        if (~var102 <= -1) {
                                            if (~var102 < -256) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        var93 = var102 | var99 << 16 | var101 << 8;
                                    }
                                }
                                if (!Stream.method3423()) {
                                    var8.method3416((float) var62);
                                    var8.method3416((float) (this.method249(var62, var63) - -var68));
                                    var8.method3416((float) var63);
                                    var8.method3416((float) var62);
                                    var8.method3416((float) var63);
                                    if (this.field572 != null) {
                                        var8.method3416((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((this.field552 & 7) != 0) {
                                        var8.method3416(var77);
                                        var8.method3416(var78);
                                        var8.method3416(var79);
                                    }
                                } else {
                                    var8.method3415((float) var62);
                                    var8.method3415((float) (var68 + this.method249(var62, var63)));
                                    var8.method3415((float) var63);
                                    var8.method3415((float) var62);
                                    var8.method3415((float) var63);
                                    if (this.field572 != null) {
                                        var8.method3415((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(7 & this.field552) != -1) {
                                        var8.method3415(var77);
                                        var8.method3415(var78);
                                        var8.method3415(var79);
                                    }
                                }
                                if (this.field570.field4261 == 0) {
                                    var9.method3418(-16777216 | var93);
                                } else {
                                    var9.method3422(var93 | -16777216);
                                }
                                var103 = this.field579++;
                                var60[var61] = (short) var103;
                                if (var66 != -1) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method520((byte) -89, new class173(var60[var61]), var69);
                            } else {
                                var60[var61] = ((class173) var92).field2118;
                                var103 = var60[var61] & 65535;
                                if (var66 != -1 && ~var35[var61].field4676 > ~var10[var103].field4676) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var104 < var58; ++var104) {
                                var13[var104].method2751(-128, var76, var75, var103, var74);
                            }
                            ++this.field564;
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < this.field579; ++var15) {
                class442 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2753(var15, true);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field1656; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field1660; ++var22) {
                    short[] var23 = this.field550[super.field1656 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class442 var29 = var10[var26];
                            class442 var30 = var10[var27];
                            class442 var31 = var10[var28];
                            class442 var32 = null;
                            if (var29 != null) {
                                var29.method2748(var22, var24, (byte) 119, var16);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method2748(var22, var24, (byte) 124, var16);
                                if (var32 == null || ~var30.field4676 > ~var32.field4676) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2748(var22, var24, (byte) 115, var16);
                                if (var32 == null || var32.field4676 > var31.field4676) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2753(var26, true);
                                }
                                if (var30 != null) {
                                    var32.method2753(var27, true);
                                }
                                if (var31 != null) {
                                    var32.method2753(var28, true);
                                }
                                var32.method2748(var22, var24, (byte) 118, var16);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3411();
            var9.method3411();
            this.field593 = this.field570.method1548((byte) 58, false);
            this.field593.method1070(var6, 39, 4, this.field579 * 4);
            this.field597 = this.field570.method1548((byte) 117, false);
            this.field597.method1070(var7, 59, var5, this.field579 * var5);
            if ((7 & this.field552) == 0) {
                if (this.field572 != null) {
                    this.field590 = this.field570.method1520(new class558[] { new class558(new class596[] { class596.field8705, class596.field8709, class596.field8708 }), new class558(class596.field8707) }, true);
                } else {
                    this.field590 = this.field570.method1520(new class558[] { new class558(new class596[] { class596.field8705, class596.field8709 }), new class558(class596.field8707) }, true);
                }
            } else if (this.field572 == null) {
                this.field590 = this.field570.method1520(new class558[] { new class558(new class596[] { class596.field8705, class596.field8709, class596.field8706 }), new class558(class596.field8707) }, true);
            } else {
                this.field590 = this.field570.method1520(new class558[] { new class558(new class596[] { class596.field8705, class596.field8709, class596.field8708, class596.field8706 }), new class558(class596.field8707) }, true);
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (~var3[var18].field6590 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field588 = new class442[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class442 var21 = var3[var20];
                var19[var20] = var21.field4676;
                this.field588[var20] = var21;
                var21.method2752(this.field579, (byte) 102);
            }
            class141.method849(-128, var19, this.field588);
            if (this.field555 != null) {
                this.field555.method3641((byte) -128);
            }
        }
        ++field571;
        this.field565 = null;
        this.field551 = null;
        this.field586 = null;
        this.field572 = null;
        this.field596 = null;
        this.field589 = this.field594 = this.field591 = null;
        this.field559 = null;
        this.field566 = null;
        this.field584 = this.field576 = null;
    }

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(III)V")
    public final void method251(int arg0, int arg1, int arg2) {
        if (arg2 > (255 & this.field586[arg0][arg1])) {
            this.field586[arg0][arg1] = (byte) arg2;
        }
        ++field567;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method248(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field574;
        if (this.field555 != null && arg0 != null) {
            int var7 = -(this.field570.field4304 * arg2 >> 8) + arg1 >> this.field570.field4303;
            int var8 = -(this.field570.field4283 * arg2 >> 8) + arg3 >> this.field570.field4303;
            return this.field555.method3637(var7, var8, false, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ltu;IIII[[I[[II)V")
    public class53(class294 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field578 = arg5;
        this.field570 = arg0;
        this.field565 = new int[arg3][arg4][];
        this.field586 = new byte[arg3 + 1][arg4 + 1];
        this.field594 = new float[super.field1656 - -1][super.field1660 - -1];
        this.field584 = new int[arg3][arg4][];
        this.field589 = new float[super.field1656 + 1][super.field1660 + 1];
        this.field552 = arg2;
        this.field556 = 1 << this.field561;
        this.field575 = new byte[arg3][arg4];
        this.field576 = new int[arg3][arg4][];
        this.field566 = new int[arg3][arg4][];
        this.field591 = new float[super.field1656 + 1][super.field1660 + 1];
        this.field559 = new int[arg3][arg4][];
        this.field550 = new short[arg3 * arg4][];
        this.field551 = new class442[arg3][arg4][];
        for (int var9 = 0; ~super.field1660 <= ~var9; ++var9) {
            for (int var10 = 0; var10 <= super.field1656; ++var10) {
                int var11 = this.field578[var10][var9];
                if (this.field562 > (float) var11) {
                    this.field562 = (float) var11;
                }
                if ((float) var11 > this.field580) {
                    this.field580 = (float) var11;
                }
                if (~var10 < -1 && ~var9 < -1 && ~super.field1656 < ~var10 && ~var9 > ~super.field1660) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var13 * var13)));
                    this.field589[var10][var9] = (float) var12 * var14;
                    this.field594[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field591[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field580;
        --this.field562;
        this.field596 = new class80(128);
        if (~(this.field552 & 16) != -1) {
            this.field555 = new class639(this.field570, this);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Loj;[I)V")
    public final void method258(class321 arg0, int[] arg1) {
        ++field585;
        this.field554.method706(new class493(this.field570, this, arg0, arg1), true);
    }

    @OriginalMember(owner = "client!ha", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method261(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field569;
        if (this.field555 != null && arg0 != null) {
            int var7 = arg1 - (this.field570.field4304 * arg2 >> 8) >> this.field570.field4303;
            int var8 = -(this.field570.field4283 * arg2 >> 8) + arg3 >> this.field570.field4303;
            this.field555.method3644(arg0, var8, 0, var7);
        }
    }

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(II)I")
    public final int method259(int arg0, int arg1) {
        ++field568;
        return this.field578[arg0][arg1];
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([[ZBIIZII)V")
    private final void method292(boolean[][] arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field582;
        if (arg1 != -89) {
            this.field594 = null;
        }
        if (this.field588 != null) {
            int var8 = arg2 - -arg2 + 1;
            int var9 = var8 * var8;
            if (~var9 < ~class337.field4819.length) {
                class337.field4819 = new int[var9];
            }
            int var10 = -arg2 + arg3;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg2 + arg5;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg2 + arg3;
            if (super.field1656 + -1 < var14) {
                var14 = super.field1656 + -1;
            }
            int var15 = arg5 - -arg2;
            class178.field2188 = 0;
            if (var15 > super.field1660 + -1) {
                var15 = super.field1660 - 1;
            }
            for (int var16 = var10; var16 <= var14; ++var16) {
                boolean[] var23 = arg0[-var11 + var16];
                for (int var24 = var12; var24 <= var15; ++var24) {
                    if (var23[var24 - var13]) {
                        class337.field4819[class178.field2188++] = super.field1656 * var24 + var16;
                    }
                }
            }
            if (arg6 != -1) {
                this.field570.method1910((float) arg6, (byte) -40);
                this.field570.method1911((byte) -106);
            } else {
                this.field570.method1949(1);
            }
            this.field570.method1945((byte) 120);
            this.field570.method1931((this.field552 & 7) != 0, -118);
            this.field570.method1899(false, -1, false, arg1 ^ -89);
            this.field570.method1558(this.field597, -86, 0);
            for (int var17 = 0; ~var17 > ~this.field588.length; ++var17) {
                this.field588[var17].method2755(arg1 + 61, class178.field2188, class337.field4819);
            }
            class646 var18 = this.field570.method1898(false);
            var18.method2014(0, -1, 0);
            this.field570.method1959(8769);
            if (!this.field554.method715(true)) {
                int var19 = this.field570.field4359;
                int var20 = this.field570.field4310;
                this.field570.method352(0, var20, this.field570.field4330);
                this.field570.method1931(false, -81);
                this.field570.method1905((byte) 31, false);
                this.field570.method1961(128, 11557);
                this.field570.method1899(false, -2, false, 0);
                this.field570.method1971((byte) -83, this.field570.field4288);
                this.field570.method1912(class274.field3839, class457.field6837, arg1 + 61);
                this.field570.method1970(85, class173.field2123, 0);
                this.field570.method1907(class242.field3434, true, 0);
                for (class324 var21 = this.field554.method719(false); var21 != null; var21 = this.field554.method716(14)) {
                    class493 var22 = (class493) var21;
                    var22.method2958((byte) 106, arg5, arg2, arg3, arg0);
                }
                this.field570.method1970(-113, class83.field935, 0);
                this.field570.method1907(class83.field935, true, 0);
                this.field570.method1971((byte) -74, (class502) null);
                this.field570.method352(var19, var20, this.field570.field4330);
            }
            if (this.field555 != null) {
                this.field570.method1558(this.field597, -40, 0);
                this.field570.method1558(this.field593, arg1 + 1, 1);
                this.field570.method1562(51, this.field590);
                this.field555.method3642(arg3, arg5, arg2, arg4, arg0, (byte) 112);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method252(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field572 == null) {
            this.field572 = new int[super.field1656][super.field1660][];
        }
        if (arg3 != null && this.field566 == null) {
            this.field566 = new int[super.field1656][super.field1660][];
        }
        ++field558;
        this.field584[arg0][arg1] = arg2;
        this.field576[arg0][arg1] = arg4;
        this.field559[arg0][arg1] = arg6;
        this.field565[arg0][arg1] = arg7;
        if (this.field572 != null) {
            this.field572[arg0][arg1] = arg5;
        }
        if (this.field566 != null) {
            this.field566[arg0][arg1] = arg3;
        }
        class442[] var15 = this.field551[arg0][arg1] = new class442[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
            class324 var19;
            for (var19 = this.field596.method524((byte) 88, var17); var19 != null; var19 = this.field596.method526(2)) {
                class442 var20 = (class442) var19;
                if (~arg8[var16] == ~var20.field6604 && (float) arg9[var16] == var20.field6592 && var20.field6605 == arg10 && ~var20.field6587 == ~arg11 && ~var20.field6596 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class442) var19;
            } else {
                var15[var16] = new class442(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field596.method520((byte) -76, var15[var16], var17);
            }
        }
        if (arg13) {
            this.field575[arg0][arg1] = (byte) class283.method1834(this.field575[arg0][arg1], 1);
        }
        if (arg6.length > this.field587) {
            this.field587 = arg6.length;
        }
        this.field592 += arg6.length;
    }
}
