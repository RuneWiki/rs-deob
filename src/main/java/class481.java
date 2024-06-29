import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class481 extends class37 {

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "F")
    private float field6831 = -3.4028235E38F;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "F")
    private float field6822 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "Lwba;")
    private class46 field6810 = new class46();

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lhea;")
    public class387 field6809;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    private int field6834;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "[[B")
    private byte[][] field6840;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "[[[I")
    public int[][][] field6812;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public int field6833;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "[[S")
    public short[][] field6842;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "[[[Lqn;")
    private class58[][][] field6838;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "[[[I")
    private int[][][] field6824;

    @OriginalMember(owner = "client!ni", name = "hb", descriptor = "[[F")
    private float[][] field6853;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    private int field6825;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "[[[I")
    private int[][][] field6830;

    @OriginalMember(owner = "client!ni", name = "eb", descriptor = "[[F")
    private float[][] field6850;

    @OriginalMember(owner = "client!ni", name = "db", descriptor = "[[F")
    private float[][] field6849;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "[[[I")
    public int[][][] field6828;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "[[[I")
    public int[][][] field6816;

    @OriginalMember(owner = "client!ni", name = "fb", descriptor = "[[B")
    private byte[][] field6851;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "Lkea;")
    private class213 field6848;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Lwp;")
    private class163 field6811;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "F")
    public static float field6820;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    private int field6827;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    private int field6836;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
    private int field6845;

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
    private int field6847;

    @OriginalMember(owner = "client!ni", name = "ib", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "Lrd;")
    public class305 field6846;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "Lbca;")
    private class613 field6843;

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "Lbca;")
    private class613 field6844;

    @OriginalMember(owner = "client!ni", name = "gb", descriptor = "[Lqn;")
    private class58[] field6852;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "[[[I")
    private int[][][] field6829;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Luj;III)V", line = 3)
    private final void method2806(class348 arg0, int arg1, int arg2, int arg3) {
        ++field6818;
        int[] var5 = this.field6816[arg3][arg1];
        int[] var6 = this.field6828[arg3][arg1];
        int var7 = var5.length;
        if (class14.field131.length < var7) {
            class588.field8221 = new int[var7];
            class14.field131 = new int[var7];
        }
        for (int var8 = arg2; ~var8 > ~var7; ++var8) {
            class14.field131[var8] = var5[var8] >> this.field6809.field5682;
            class588.field8221[var8] = var6[var8] >> this.field6809.field5682;
        }
        int var9 = 0;
        while (var7 > var9) {
            int var10 = class14.field131[var9];
            int var11 = class588.field8221[var9++];
            int var12 = class14.field131[var9];
            int var13 = class588.field8221[var9++];
            int var14 = class14.field131[var9];
            int var15 = class588.field8221[var9++];
            if ((var10 - var12) * (var13 - var15) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                arg0.method2150(arg2 ^ 46, var14, var10, var13, var12, var15, var11);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V", line = 60)
    public final void method440(int arg0, int arg1, int arg2) {
        ++field6854;
        if (~arg2 < ~(this.field6851[arg0][arg1] & 255)) {
            this.field6851[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "(Lha;IIIIZ)V", line = 71)
    public final void method446(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6808;
        if (this.field6811 != null && arg0 != null) {
            int var7 = arg1 - (this.field6809.field5642 * arg2 >> 8) >> this.field6809.field5682;
            int var8 = arg3 - (this.field6809.field5689 * arg2 >> 8) >> this.field6809.field5682;
            this.field6811.method1119(var8, arg0, var7, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 103)
    public final void method434(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6841;
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
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
        this.method433(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII[[Z)V", line = 188)
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6814;
        if (this.field6845 > 0) {
            class241 var9 = this.field6809.method2370(this.field6827, -12029);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method5(true, 123);
                if (var14 != null) {
                    Stream var15 = this.field6809.method2381(0, var14);
                    if (Stream.method3483()) {
                        for (int var16 = arg4; var16 < arg6; ++var16) {
                            int var17 = super.field631 * var16 + arg3;
                            for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field6842[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            var15.method3475(var21);
                                            ++var10;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field631 * var22 + arg3;
                            for (int var26 = arg3; ~arg5 < ~var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field6842[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                            var15.method3472(var29);
                                            ++var10;
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3471();
                    if (var9.method2(-106)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field6809.method2383(-32);
                this.field6809.method2345(false, -16682);
                this.field6809.method2318((byte) -24, false);
                this.field6809.method2315(-32, false);
                this.field6809.method2369((byte) 71, false);
                this.field6809.method2326(true, 0);
                this.field6809.method2389(false, false, -2, false);
                this.field6809.method2337(false, (class301) null);
                class21 var23 = this.field6809.method2336(false);
                float[] var24 = this.field6809.method2309(0);
                var24[2] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field629 * 128.0F * (float) this.field6809.field5555);
                var24[10] = 1.0F / (this.field6831 - this.field6822);
                var24[15] = 1.0F;
                var24[11] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field629 * 128.0F * (float) this.field6809.field5600);
                var24[9] = 0.0F;
                var24[1] = 0.0F;
                var24[4] = 0.0F;
                var24[7] = 0.0F;
                var24[6] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6809.field5555;
                var24[8] = 0.0F;
                var24[14] = -this.field6822 / (this.field6831 - this.field6822);
                var24[3] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field6809.field5600;
                var23.method263(0.0F, (byte) 46, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
                this.field6809.method2328(-19353);
                this.field6809.method2340(false);
                if ((7 & this.field6833) == 0) {
                    this.field6809.method2318((byte) -24, false);
                } else {
                    this.field6809.method2318((byte) -24, true);
                    this.field6809.method1879(-104);
                }
                this.field6809.method1902(false, 8);
                this.field6809.method1865(0, -26558, this.field6843);
                this.field6809.method1865(1, -26558, this.field6844);
                this.field6809.method1883(-83, this.field6846);
                this.field6809.method1874(class80.field1355, var10 / 3, var11, true, var9, -var11 + var12 + 1, 0);
                this.field6809.method1902(true, 8);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[[ZZI)V", line = 386)
    public final void method443(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field6821;
        this.method2808(0, arg5, arg3, arg4, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[[ZZ)V", line = 399)
    public final void method445(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field6826;
        this.method2808(0, -1, arg3, arg4, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lhea;IIII[[I[[II)V", line = 411)
    public class481(class387 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6809 = arg0;
        this.field6834 = super.field625 + -2;
        this.field6840 = new byte[arg3][arg4];
        this.field6812 = new int[arg3][arg4][];
        this.field6833 = arg2;
        this.field6842 = new short[arg3 * arg4][];
        this.field6838 = new class58[arg3][arg4][];
        this.field6824 = new int[arg3][arg4][];
        this.field6853 = new float[super.field631 + 1][super.field632 + 1];
        this.field6825 = 1 << this.field6834;
        this.field6830 = new int[arg3][arg4][];
        this.field6850 = new float[super.field631 + 1][super.field632 - -1];
        this.field6849 = new float[super.field631 + 1][super.field632 + 1];
        this.field6828 = new int[arg3][arg4][];
        this.field6816 = new int[arg3][arg4][];
        this.field6851 = new byte[arg3 + 1][arg4 + 1];
        for (int var9 = 0; ~super.field632 <= ~var9; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field631; ++var10) {
                int var11 = super.field624[var10][var9];
                if (this.field6822 > (float) var11) {
                    this.field6822 = (float) var11;
                }
                if (this.field6831 < (float) var11) {
                    this.field6831 = (float) var11;
                }
                if (~var10 < -1 && var9 > 0 && ~super.field631 < ~var10 && ~var9 > ~super.field632) {
                    int var12 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var12 * var12 + var13 * var13)));
                    this.field6853[var10][var9] = (float) var12 * var14;
                    this.field6850[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field6849[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field6822;
        ++this.field6831;
        this.field6848 = new class213(128);
        if (~(this.field6833 & 16) != -1) {
            this.field6811 = new class163(this.field6809, this);
        }
    }

    @OriginalMember(owner = "client!ni", name = "BA", descriptor = "()V", line = 488)
    public final void method436() {
        if (this.field6845 <= 0) {
            this.field6811 = null;
        } else {
            byte[][] var1 = new byte[super.field631 + 1][super.field632 + 1];
            for (int var2 = 1; ~super.field631 < ~var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field632; ++var107) {
                    var1[var2][var107] = (byte) ((this.field6851[var2][var107 - -1] >> 3) + (this.field6851[var2 + -1][var107] >> 2) + (this.field6851[var2][var107] >> 1) + (this.field6851[var2][var107 - 1] >> 2) + (this.field6851[var2 - -1][var107] >> 3));
                }
            }
            class58[] var3 = new class58[this.field6848.method1404((byte) 99)];
            this.field6848.method1410(var3, (byte) 46);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method628(this.field6845, 31269);
            }
            int var5 = 20;
            if (this.field6829 != null) {
                var5 += 4;
            }
            if (~(7 & this.field6833) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field6809.field5603.method3468(this.field6845 * 4, false);
            NativeHeapBuffer var7 = this.field6809.field5603.method3468(this.field6845 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class58[] var10 = new class58[this.field6845];
            int var11 = class405.method2458(this.field6845 / 4, -619912415);
            if (~var11 > -2) {
                var11 = 1;
            }
            class213 var12 = new class213(var11);
            class58[] var13 = new class58[this.field6847];
            for (int var14 = 0; var14 < super.field631; ++var14) {
                for (int var34 = 0; super.field632 > var34; ++var34) {
                    if (this.field6812[var14][var34] != null) {
                        class58[] var35 = this.field6838[var14][var34];
                        int[] var36 = this.field6816[var14][var34];
                        int[] var37 = this.field6828[var14][var34];
                        int[] var38 = this.field6824[var14][var34];
                        int[] var39 = this.field6812[var14][var34];
                        int[] var40 = this.field6830 != null ? this.field6830[var14][var34] : null;
                        int[] var41 = this.field6829 == null ? null : this.field6829[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field6853[var14][var34];
                        float var43 = this.field6850[var14][var34];
                        float var44 = this.field6849[var14][var34];
                        float var45 = this.field6853[var14][var34 + 1];
                        float var46 = this.field6850[var14][var34 - -1];
                        float var47 = this.field6849[var14][var34 + 1];
                        float var48 = this.field6853[var14 + 1][var34 + 1];
                        float var49 = this.field6850[var14 + 1][var34 - -1];
                        float var50 = this.field6849[var14 - -1][var34 + 1];
                        float var51 = this.field6853[var14 - -1][var34];
                        float var52 = this.field6850[var14 + 1][var34];
                        float var53 = this.field6849[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = var1[var14 - -1][var34 + 1] & 255;
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label361: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class58 var105 = var35[var59];
                            for (int var106 = 0; ~var58 < ~var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label361;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field6842[super.field631 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var61 > ~var39.length; ++var61) {
                            int var62 = (var14 << super.field625) + var36[var61];
                            int var63 = (var34 << super.field625) + var37[var61];
                            int var64 = var62 >> this.field6834;
                            int var65 = var63 >> this.field6834;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            int var77;
                            float var78;
                            float var79;
                            if (var71 == 0 && var72 == 0) {
                                var76 = var43;
                                var77 = var73 - var54;
                                var78 = var42;
                                var79 = var44;
                            } else if (~var71 == -1 && ~super.field629 == ~var72) {
                                var78 = var45;
                                var77 = var73 - var55;
                                var76 = var46;
                                var79 = var47;
                            } else if (super.field629 == var71 && ~super.field629 == ~var72) {
                                var78 = var48;
                                var76 = var49;
                                var77 = var73 - var56;
                                var79 = var50;
                            } else if (~super.field629 == ~var71 && var72 == 0) {
                                var77 = var73 - var57;
                                var78 = var51;
                                var79 = var53;
                                var76 = var52;
                            } else {
                                float var80 = (float) var71 / (float) super.field629;
                                float var81 = (float) var72 / (float) super.field629;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (var53 - var44) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                var78 = (var85 - var82) * var81 + var82;
                                float var87 = (var50 - var47) * var80 + var47;
                                var76 = (-var83 + var86) * var81 + var83;
                                var79 = (var87 - var84) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field625) + var54;
                                int var89 = var55 - -((-var55 + var56) * var71 >> super.field625);
                                var77 = var73 - (((-var88 + var89) * var72 >> super.field625) + var88);
                            }
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var77 >> 7;
                                if (~var90 > -3) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                if (~(7 & this.field6833) == -1) {
                                    float var91 = this.field6809.field5635[2] * var79 + this.field6809.field5635[1] * var76 + this.field6809.field5635[0] * var78;
                                    var75 = this.field6809.field5719 + (var91 > 0.0F ? this.field6809.field5729 : this.field6809.field5658) * var91;
                                }
                                var74 = class437.field6386[var90 | var66 & 65408];
                            }
                            class665 var92 = null;
                            if (~(this.field6825 + -1 & var62) == -1 && ~(var63 & this.field6825 - 1) == -1) {
                                var92 = var12.method1405(var69, (byte) -32);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class134) var92).field1974;
                                var93 = 65535 & var60[var61];
                                if (var66 != -1 && ~var35[var61].field9386 > ~var10[var93].field9386) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (~var66 != ~var67) {
                                    int var94 = (127 & var67) * var77 >> 7;
                                    if (~var94 > -3) {
                                        var94 = 2;
                                    } else if (~var94 < -127) {
                                        var94 = 126;
                                    }
                                    var95 = class437.field6386[var67 & 65408 | var94];
                                    if (~(this.field6833 & 7) == -1) {
                                        float var96 = this.field6809.field5635[2] * var79 + this.field6809.field5635[1] * var76 + this.field6809.field5635[0] * var78;
                                        float var97 = this.field6809.field5719 + (!(var75 > 0.0F) ? this.field6809.field5658 : this.field6809.field5729) * var75;
                                        int var98 = 255 & var95 >> 16;
                                        int var99 = var95 >> 8 & 255;
                                        int var100 = 255 & var95;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (~var101 <= -1) {
                                            if (var101 > 255) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var102 <= -1) {
                                            if (~var102 < -256) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        int var103 = (int) ((float) var100 * var97);
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (var103 > 255) {
                                            var103 = 255;
                                        }
                                        var95 = var102 << 8 | var101 << 16 | var103;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (!Stream.method3483()) {
                                    var8.method3476((float) var62);
                                    var8.method3476((float) (var68 + this.method442(var62, true, var63)));
                                    var8.method3476((float) var63);
                                    var8.method3476((float) var62);
                                    var8.method3476((float) var63);
                                    if (this.field6829 != null) {
                                        var8.method3476((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((this.field6833 & 7) != 0) {
                                        var8.method3476(var78);
                                        var8.method3476(var76);
                                        var8.method3476(var79);
                                    }
                                } else {
                                    var8.method3474((float) var62);
                                    var8.method3474((float) (this.method442(var62, true, var63) + var68));
                                    var8.method3474((float) var63);
                                    var8.method3474((float) var62);
                                    var8.method3474((float) var63);
                                    if (this.field6829 != null) {
                                        var8.method3474((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(this.field6833 & 7) != -1) {
                                        var8.method3474(var78);
                                        var8.method3474(var76);
                                        var8.method3474(var79);
                                    }
                                }
                                if (this.field6809.field5672 == 0) {
                                    var9.method3484(var95 | -16777216);
                                } else {
                                    var9.method3480(-16777216 | var95);
                                }
                                var93 = this.field6836++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method1403((byte) -18, new class134(var60[var61]), var69);
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method627(var74, var77, var75, var93, 0);
                            }
                            ++this.field6827;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field6836; ++var15) {
                class58 var33 = var10[var15];
                if (var33 != null) {
                    var33.method624(16711935, var15);
                }
            }
            for (int var16 = 0; var16 < super.field631; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field632; ++var22) {
                    short[] var23 = this.field6842[super.field631 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class58 var29 = var10[var26];
                            class58 var30 = var10[var27];
                            class58 var31 = var10[var28];
                            class58 var32 = null;
                            if (var29 != null) {
                                var29.method629(var16, var24, true, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method629(var16, var24, true, var22);
                                if (var32 == null || var32.field9386 > var30.field9386) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method629(var16, var24, true, var22);
                                if (var32 == null || var32.field9386 > var31.field9386) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method624(16711935, var26);
                                }
                                if (var30 != null) {
                                    var32.method624(16711935, var27);
                                }
                                if (var31 != null) {
                                    var32.method624(16711935, var28);
                                }
                                var32.method629(var16, var24, true, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3471();
            var9.method3471();
            this.field6844 = this.field6809.method1901(-21710, false);
            this.field6844.method994(27774, this.field6836 * 4, 4, var6);
            this.field6843 = this.field6809.method1901(-21710, false);
            this.field6843.method994(27774, this.field6836 * var5, var5, var7);
            if ((this.field6833 & 7) != 0) {
                if (this.field6829 != null) {
                    this.field6846 = this.field6809.method1866(-109, new class399[] { new class399(new class342[] { class342.field5015, class342.field5019, class342.field5018, class342.field5016 }), new class399(class342.field5017) });
                } else {
                    this.field6846 = this.field6809.method1866(-22, new class399[] { new class399(new class342[] { class342.field5015, class342.field5019, class342.field5016 }), new class399(class342.field5017) });
                }
            } else if (this.field6829 == null) {
                this.field6846 = this.field6809.method1866(-27, new class399[] { new class399(new class342[] { class342.field5015, class342.field5019 }), new class399(class342.field5017) });
            } else {
                this.field6846 = this.field6809.method1866(-72, new class399[] { new class399(new class342[] { class342.field5015, class342.field5019, class342.field5018 }), new class399(class342.field5017) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (~var3[var18].field1124 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field6852 = new class58[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var17 < ~var20; ++var20) {
                class58 var21 = var3[var20];
                var19[var20] = var21.field9386;
                this.field6852[var20] = var21;
                var21.method625(this.field6836, 0);
            }
            class151.method1064(var19, this.field6852, (byte) 62);
            if (this.field6811 != null) {
                this.field6811.method1121(107);
            }
        }
        ++field6817;
        this.field6824 = null;
        this.field6816 = this.field6828 = null;
        this.field6851 = null;
        this.field6812 = null;
        this.field6848 = null;
        this.field6853 = this.field6850 = this.field6849 = null;
        this.field6838 = null;
        this.field6830 = null;
        this.field6829 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(FFI[FIBIIIII)V", line = 1091)
    public static final void method2807(float arg0, float arg1, int arg2, float[] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field6813;
        int var11 = arg8 - arg2;
        int var12 = arg9 - arg7;
        int var13 = arg4 - arg6;
        float var14 = arg3[2] * (float) var12 + arg3[1] * (float) var11 + arg3[0] * (float) var13;
        if (arg5 < 104) {
            method2807(-0.17098872F, -0.07401783F, -105, (float[]) null, 51, (byte) 72, -88, -48, -84, -49, 17);
        }
        float var15 = arg3[5] * (float) var12 + arg3[4] * (float) var11 + arg3[3] * (float) var13;
        float var16 = arg3[8] * (float) var12 + arg3[6] * (float) var13 + arg3[7] * (float) var11;
        float var17 = 0.5F + (float) Math.atan2((double) var14, (double) var16) / 6.2831855F;
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + 0.5F + arg1;
        if (~arg10 == -2) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (~arg10 == -3) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg10 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class681.field9613 = var18;
        class47.field732 = var17;
    }

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "(IILha;)Lha;", line = 1144)
    public final class54 method441(int arg0, int arg1, class54 arg2) {
        ++field6819;
        if ((this.field6840[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field629 >> this.field6809.field5682;
            class348 var5 = (class348) arg2;
            class348 var6;
            if (var5 != null && var5.method2151(var4, var4, -111)) {
                var6 = var5;
                var5.method2152((byte) -115);
            } else {
                var6 = new class348(this.field6809, var4, var4);
            }
            var6.method2147(0, 0, 48, var4, var4);
            this.method2806(var6, arg1, 0, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[[ZZIII)V", line = 1172)
    private final void method2808(int arg0, int arg1, boolean[][] arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 0) {
            this.field6842 = null;
        }
        if (this.field6852 != null) {
            int var8 = arg4 + 1 + arg4;
            int var9 = var8 * var8;
            if (var9 > class326.field4810.length) {
                class326.field4810 = new int[var9];
            }
            int var10 = -arg4 + arg6;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg4 + arg5;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg4 + arg6;
            if (~(super.field631 + -1) > ~var14) {
                var14 = super.field631 + -1;
            }
            int var15 = arg4 + arg5;
            if (~var15 < ~(super.field632 + -1)) {
                var15 = super.field632 + -1;
            }
            class199.field2815 = 0;
            for (int var16 = var10; ~var14 <= ~var16; ++var16) {
                boolean[] var23 = arg2[-var11 + var16];
                for (int var24 = var12; ~var15 <= ~var24; ++var24) {
                    if (var23[-var13 + var24]) {
                        class326.field4810[class199.field2815++] = super.field631 * var24 + var16;
                    }
                }
            }
            if (arg1 == -1) {
                this.field6809.method2341(arg0 ^ -29576);
            } else {
                this.field6809.method2334((float) arg1, 120);
                this.field6809.method2310((byte) -128);
            }
            this.field6809.method2379(-12351);
            this.field6809.method2318((byte) -24, (7 & this.field6833) != 0);
            this.field6809.method2389(false, false, -1, false);
            this.field6809.method1865(0, -26558, this.field6843);
            for (int var17 = 0; this.field6852.length > var17; ++var17) {
                this.field6852[var17].method622(class326.field4810, -543050192, class199.field2815);
            }
            class21 var18 = this.field6809.method2336(false);
            var18.method252(0, -1, 0);
            this.field6809.method2340(false);
            if (!this.field6810.method481((byte) -57)) {
                int var19 = this.field6809.field5718;
                int var20 = this.field6809.field5651;
                this.field6809.method122(0, var20, this.field6809.field5670);
                this.field6809.method2318((byte) -24, false);
                this.field6809.method2369((byte) 71, false);
                this.field6809.method2326(true, 128);
                this.field6809.method2389(false, false, -2, false);
                this.field6809.method2337(false, this.field6809.field5706);
                this.field6809.method2339(class153.field2209, -32540, class190.field2740);
                this.field6809.method2324(0, class124.field1869, 1);
                this.field6809.method2360(0, class315.field4669, arg0 ^ 1);
                for (class665 var21 = this.field6810.method472((byte) -90); var21 != null; var21 = this.field6810.method482(121)) {
                    class532 var22 = (class532) var21;
                    var22.method3033(arg6, arg4, arg2, arg5, arg0);
                }
                this.field6809.method2324(0, class61.field1155, 1);
                this.field6809.method2360(0, class61.field1155, 1);
                this.field6809.method2337(false, (class301) null);
                this.field6809.method122(var19, var20, this.field6809.field5670);
            }
            if (this.field6811 != null) {
                this.field6809.method1865(0, -26558, this.field6843);
                this.field6809.method1865(1, -26558, this.field6844);
                this.field6809.method1883(-108, this.field6846);
                this.field6811.method1123(arg5, arg3, arg2, -1, arg6, arg4);
            }
        }
        ++field6832;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V", line = 1313)
    public final void method439(int arg0, int arg1) {
        ++field6823;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 1321)
    public final boolean method430(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6815;
        if (this.field6811 != null && arg0 != null) {
            int var7 = -(this.field6809.field5642 * arg2 >> 8) + arg1 >> this.field6809.field5682;
            int var8 = arg3 - (this.field6809.field5689 * arg2 >> 8) >> this.field6809.field5682;
            return this.field6811.method1118(var8, arg0, var7, (byte) 66);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1342)
    public final void method433(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field6837;
        if (arg5 != null && this.field6829 == null) {
            this.field6829 = new int[super.field631][super.field632][];
        }
        if (arg3 != null && this.field6830 == null) {
            this.field6830 = new int[super.field631][super.field632][];
        }
        this.field6816[arg0][arg1] = arg2;
        this.field6828[arg0][arg1] = arg4;
        this.field6812[arg0][arg1] = arg6;
        this.field6824[arg0][arg1] = arg7;
        if (this.field6829 != null) {
            this.field6829[arg0][arg1] = arg5;
        }
        if (this.field6830 != null) {
            this.field6830[arg0][arg1] = arg3;
        }
        class58[] var15 = this.field6838[arg0][arg1] = new class58[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[var16];
            class665 var19;
            for (var19 = this.field6848.method1405(var17, (byte) -46); var19 != null; var19 = this.field6848.method1411((byte) 124)) {
                class58 var20 = (class58) var19;
                if (~arg8[var16] == ~var20.field1105 && (float) arg9[var16] == var20.field1121 && var20.field1108 == arg10 && var20.field1111 == arg11 && var20.field1125 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class58(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field6848.method1403((byte) -18, var15[var16], var17);
            } else {
                var15[var16] = (class58) var19;
            }
        }
        if (arg13) {
            this.field6840[arg0][arg1] = (byte) class486.method2826(this.field6840[arg0][arg1], 1);
        }
        if (~this.field6847 > ~arg6.length) {
            this.field6847 = arg6.length;
        }
        this.field6845 += arg6.length;
    }

    @OriginalMember(owner = "client!ni", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 1408)
    public final void method437(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6839;
        if (this.field6811 != null && arg0 != null) {
            int var7 = -(this.field6809.field5642 * arg2 >> 8) + arg1 >> this.field6809.field5682;
            int var8 = -(this.field6809.field5689 * arg2 >> 8) + arg3 >> this.field6809.field5682;
            this.field6811.method1125(arg0, var7, -26199, var8);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lrc;[I)V", line = 1425)
    public final void method429(class498 arg0, int[] arg1) {
        ++field6835;
        this.field6810.method474(new class532(this.field6809, this, arg0, arg1), 6);
    }
}
