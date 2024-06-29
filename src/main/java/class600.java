import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class600 extends class176 {

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "F")
    private float field8874 = -3.4028235E38F;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "F")
    private float field8870 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "Lbu;")
    private class19 field8876 = new class19();

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "[[I")
    private int[][] field8855;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    private int field8844;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "Lcb;")
    public class444 field8873;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "[[F")
    private float[][] field8888;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public int field8866;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "[[[I")
    private int[][][] field8867;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "[[[I")
    private int[][][] field8850;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "[[[Lmd;")
    private class466[][][] field8868;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "[[B")
    private byte[][] field8880;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "[[F")
    private float[][] field8892;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "[[[I")
    private int[][][] field8864;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "[[F")
    private float[][] field8891;

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "[[B")
    private byte[][] field8893;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "[[S")
    public short[][] field8856;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    private int field8865;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "[[[I")
    public int[][][] field8878;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "[[[I")
    public int[][][] field8849;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "Llb;")
    private class465 field8886;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lap;")
    private class408 field8843;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "[Lgm;")
    public static class106[] field8857 = new class106[14];

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "Z")
    public static boolean field8882;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "Llu;")
    public static class610 field8872;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    private int field8851;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    private int field8852;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    private int field8883;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    private int field8889;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "Lsk;")
    public class532 field8887;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "Lql;")
    private class628 field8885;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "Lql;")
    private class628 field8890;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "[Lmd;")
    private class466[] field8884;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "[Lha;")
    public static class53[] field8847;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "[[[I")
    private int[][][] field8862;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
    public final void method583(int arg0, int arg1) {
        ++field8842;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([[ZIIIIIZ)V")
    private final void method3543(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (this.field8884 != null) {
            int var8 = arg4 - -arg4 + 1;
            int var9 = var8 * var8;
            if (~var9 < ~class616.field9116.length) {
                class616.field9116 = new int[var9];
            }
            int var10 = -arg4 + arg3;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg4 + arg5;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg3 + arg4;
            if (~var14 < ~(super.field2697 + -1)) {
                var14 = super.field2697 - 1;
            }
            int var15 = arg4 + arg5;
            if (super.field2693 + -1 < var15) {
                var15 = super.field2693 + -1;
            }
            class222.field3231 = 0;
            for (int var16 = var10; ~var14 <= ~var16; ++var16) {
                boolean[] var23 = arg0[-var11 + var16];
                for (int var24 = var12; ~var24 >= ~var15; ++var24) {
                    if (var23[-var13 + var24]) {
                        class616.field9116[class222.field3231++] = super.field2697 * var24 + var16;
                    }
                }
            }
            if (arg2 != -1) {
                this.field8873.method2663(-12075, (float) arg2);
                this.field8873.method2696((byte) -52);
            } else {
                this.field8873.method2569(arg1 ^ 14448);
            }
            this.field8873.method2613((byte) 91);
            this.field8873.method2658(32, (this.field8866 & 7) != 0);
            this.field8873.method2652(false, 128, -1, false);
            this.field8873.method2617(this.field8890, 0, (byte) 126);
            for (int var17 = 0; this.field8884.length > var17; ++var17) {
                this.field8884[var17].method2813(63, class222.field3231, class616.field9116);
            }
            class57 var18 = this.field8873.method2680(0);
            var18.method353(0, -1, 0);
            this.field8873.method2576((byte) 28);
            if (!this.field8876.method119(true)) {
                int var19 = this.field8873.field6147;
                int var20 = this.field8873.field6153;
                this.field8873.method489(0, var20, this.field8873.field6114);
                this.field8873.method2658(37, false);
                this.field8873.method2644(-53, false);
                this.field8873.method2650(128, (byte) 35);
                this.field8873.method2652(false, 128, -2, false);
                this.field8873.method2632(this.field8873.field6179, 0);
                this.field8873.method2643(class296.field4074, arg1 ^ 10303, class132.field1816);
                this.field8873.method2598(class314.field4331, 0, (byte) 59);
                this.field8873.method2655(0, -75, class325.field4478);
                for (class417 var21 = this.field8876.method124((byte) 42); var21 != null; var21 = this.field8876.method120(21)) {
                    class103 var22 = (class103) var21;
                    var22.method772(arg5, arg0, arg4, (byte) 117, arg3);
                }
                this.field8873.method2598(class453.field6405, 0, (byte) 59);
                this.field8873.method2655(0, -115, class453.field6405);
                this.field8873.method2632((class563) null, 0);
                this.field8873.method489(var19, var20, this.field8873.field6114);
            }
            if (this.field8843 != null) {
                this.field8873.method2617(this.field8890, 0, (byte) 123);
                this.field8873.method2617(this.field8885, 1, (byte) 107);
                this.field8873.method2584(true, this.field8887);
                this.field8843.method2393(arg5, arg3, arg4, arg0, arg6, true);
            }
        }
        if (arg1 != -1) {
            field8882 = false;
        }
        ++field8877;
    }

    @OriginalMember(owner = "client!ih", name = "aa", descriptor = "(II)I")
    public final int method1233(int arg0, int arg1) {
        ++field8859;
        int var3 = arg0 >> super.field2695;
        int var4 = arg1 >> super.field2695;
        if (var3 >= 0 && ~var4 <= -1 && super.field2697 - 1 >= var3 && var4 <= super.field2693 - 1) {
            int var5 = super.field2694 - 1 & arg0;
            int var6 = super.field2694 + -1 & arg1;
            int var7 = (-var5 + super.field2694) * this.field8855[var3][var4] + this.field8855[var3 + 1][var4] * var5 >> super.field2695;
            int var8 = (-var5 + super.field2694) * this.field8855[var3][var4 + 1] + this.field8855[var3 + 1][var4 + 1] * var5 >> super.field2695;
            return (-var6 + super.field2694) * var7 + var6 * var8 >> super.field2695;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1234(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field8863;
        if (arg5 != null && this.field8862 == null) {
            this.field8862 = new int[super.field2697][super.field2693][];
        }
        if (arg3 != null && this.field8867 == null) {
            this.field8867 = new int[super.field2697][super.field2693][];
        }
        this.field8849[arg0][arg1] = arg2;
        this.field8878[arg0][arg1] = arg4;
        this.field8864[arg0][arg1] = arg6;
        this.field8850[arg0][arg1] = arg7;
        if (this.field8862 != null) {
            this.field8862[arg0][arg1] = arg5;
        }
        if (this.field8867 != null) {
            this.field8867[arg0][arg1] = arg3;
        }
        class466[] var15 = this.field8868[arg0][arg1] = new class466[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class417 var19;
            for (var19 = this.field8886.method2799(var17, true); var19 != null; var19 = this.field8886.method2801(120)) {
                class466 var20 = (class466) var19;
                if (~arg8[var16] == ~var20.field6562 && (float) arg9[var16] == var20.field6552 && var20.field6554 == arg10 && var20.field6567 == arg11 && ~var20.field6569 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class466) var19;
            } else {
                var15[var16] = new class466(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field8886.method2797(-4234, var15[var16], var17);
            }
        }
        if (arg13) {
            this.field8880[arg0][arg1] = (byte) class473.method2847(this.field8880[arg0][arg1], 1);
        }
        if (this.field8889 < arg6.length) {
            this.field8889 = arg6.length;
        }
        this.field8883 += arg6.length;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILch;I)V")
    private final void method3544(byte arg0, int arg1, class396 arg2, int arg3) {
        ++field8879;
        int[] var5 = this.field8849[arg3][arg1];
        int[] var6 = this.field8878[arg3][arg1];
        int var7 = var5.length;
        if (class623.field9188.length < var7) {
            class480.field6821 = new int[var7];
            class623.field9188 = new int[var7];
        }
        for (int var8 = 0; var8 < var7; ++var8) {
            class623.field9188[var8] = var5[var8] >> this.field8873.field6156;
            class480.field6821[var8] = var6[var8] >> this.field8873.field6156;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class623.field9188[var9];
            int var11 = class480.field6821[var9++];
            int var12 = class623.field9188[var9];
            int var13 = class480.field6821[var9++];
            int var14 = class623.field9188[var9];
            int var15 = class480.field6821[var9++];
            if ((var13 - var15) * (-var12 + var10) + -((var13 - var11) * (-var12 + var14)) > 0) {
                arg2.method2351(var14, var11, var15, var10, var12, 0, var13);
            }
        }
        if (arg0 <= 69) {
            this.field8867 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1235(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field8881;
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
        this.method1234(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZ)V")
    public static final void method3545(boolean arg0, boolean arg1) {
        if (arg0) {
            method3545(true, true);
        }
        ++field8871;
        class495.method2956(class340.field4708, class165.field2605, -16905, arg1, class47.field562);
    }

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "()V")
    public final void method1237() {
        ++field8869;
        if (~this.field8883 >= -1) {
            this.field8843 = null;
        } else {
            byte[][] var1 = new byte[super.field2697 + 1][super.field2693 + 1];
            for (int var2 = 1; ~var2 > ~super.field2697; ++var2) {
                for (int var107 = 1; var107 < super.field2693; ++var107) {
                    var1[var2][var107] = (byte) ((this.field8893[var2][var107 + -1] >> 2) + (this.field8893[var2 + -1][var107] >> 2) + (this.field8893[var2][var107] >> 1) + (this.field8893[var2][var107 + 1] >> 3) + (this.field8893[var2 + 1][var107] >> 3));
                }
            }
            class466[] var3 = new class466[this.field8886.method2803(0)];
            this.field8886.method2804(false, var3);
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                var3[var4].method2807(-70, this.field8883);
            }
            int var5 = 20;
            if (this.field8862 != null) {
                var5 += 4;
            }
            if (~(this.field8866 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field8873.field6053.method3440(this.field8883 * 4, false);
            NativeHeapBuffer var7 = this.field8873.field6053.method3440(this.field8883 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class466[] var10 = new class466[this.field8883];
            int var11 = class496.method2959(this.field8883 / 4, -92);
            if (~var11 > -2) {
                var11 = 1;
            }
            class465 var12 = new class465(var11);
            class466[] var13 = new class466[this.field8889];
            for (int var14 = 0; super.field2697 > var14; ++var14) {
                for (int var34 = 0; super.field2693 > var34; ++var34) {
                    if (this.field8864[var14][var34] != null) {
                        class466[] var35 = this.field8868[var14][var34];
                        int[] var36 = this.field8849[var14][var34];
                        int[] var37 = this.field8878[var14][var34];
                        int[] var38 = this.field8850[var14][var34];
                        int[] var39 = this.field8864[var14][var34];
                        int[] var40 = this.field8867 != null ? this.field8867[var14][var34] : null;
                        int[] var41 = this.field8862 != null ? this.field8862[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field8892[var14][var34];
                        float var43 = this.field8891[var14][var34];
                        float var44 = this.field8888[var14][var34];
                        float var45 = this.field8892[var14][var34 + 1];
                        float var46 = this.field8891[var14][var34 + 1];
                        float var47 = this.field8888[var14][var34 + 1];
                        float var48 = this.field8892[var14 - -1][var34 + 1];
                        float var49 = this.field8891[var14 + 1][var34 + 1];
                        float var50 = this.field8888[var14 + 1][var34 + 1];
                        float var51 = this.field8892[var14 + 1][var34];
                        float var52 = this.field8891[var14 + 1][var34];
                        float var53 = this.field8888[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label358: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class466 var105 = var35[var59];
                            for (int var106 = 0; var106 < var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label358;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field8856[super.field2697 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field2695) - -var36[var61];
                            int var63 = (var34 << super.field2695) - -var37[var61];
                            int var64 = var62 >> this.field8844;
                            int var65 = var63 >> this.field8844;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var66 << 32 | (long) var67 << 48;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            int var76;
                            float var77;
                            float var78;
                            if (var71 == 0 && ~var72 == -1) {
                                var75 = var43;
                                var76 = var73 - var54;
                                var77 = var42;
                                var78 = var44;
                            } else if (~var71 == -1 && super.field2694 == var72) {
                                var75 = var46;
                                var78 = var47;
                                var77 = var45;
                                var76 = var73 - var55;
                            } else if (super.field2694 == var71 && super.field2694 == var72) {
                                var78 = var50;
                                var77 = var48;
                                var75 = var49;
                                var76 = var73 - var56;
                            } else if (~super.field2694 == ~var71 && ~var72 == -1) {
                                var75 = var52;
                                var77 = var51;
                                var78 = var53;
                                var76 = var73 - var57;
                            } else {
                                float var79 = (float) var71 / (float) super.field2694;
                                float var80 = (float) var72 / (float) super.field2694;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var77 = (var84 - var81) * var80 + var81;
                                var75 = (-var82 + var85) * var80 + var82;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var78 = (-var83 + var86) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field2695) + var54;
                                int var88 = ((var56 - var55) * var71 >> super.field2695) + var55;
                                var76 = var73 - (((-var87 + var88) * var72 >> super.field2695) + var87);
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var76 >> 7;
                                if (var90 >= 2) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                if ((this.field8866 & 7) == 0) {
                                    float var91 = this.field8873.field6134[2] * var78 + this.field8873.field6134[0] * var77 + this.field8873.field6134[1] * var75;
                                    var89 = var91 * (var91 > 0.0F ? this.field8873.field6126 : this.field8873.field6163) + this.field8873.field6190;
                                }
                                var74 = class60.field758[var90 | 65408 & var66];
                            }
                            class417 var92 = null;
                            if ((this.field8865 + -1 & var62) == 0 && (var63 & this.field8865 - 1) == 0) {
                                var92 = var12.method2799(var69, true);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class207) var92).field3076;
                                var93 = var60[var61] & 65535;
                                if (var66 != -1 && ~var10[var93].field5651 < ~var35[var61].field5651) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (var66 == var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (var67 & 127) * var76 >> 7;
                                    if (var95 >= 2) {
                                        if (var95 > 126) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class60.field758[65408 & var67 | var95];
                                    if ((7 & this.field8866) == 0) {
                                        float var96 = this.field8873.field6134[2] * var78 + this.field8873.field6134[1] * var75 + this.field8873.field6134[0] * var77;
                                        float var97 = this.field8873.field6190 + var89 * (!(var89 > 0.0F) ? this.field8873.field6163 : this.field8873.field6126);
                                        int var98 = 255 & var94 >> 16;
                                        int var99 = 255 & var94 >> 8;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = 255 & var94;
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var100 <= -1) {
                                            if (var100 > 255) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (var102 > 255) {
                                            var102 = 255;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (~var103 <= -1) {
                                            if (var103 > 255) {
                                                var103 = 255;
                                            }
                                        } else {
                                            var103 = 0;
                                        }
                                        var94 = var100 << 16 | var102 << 8 | var103;
                                    }
                                }
                                if (!Stream.method3454()) {
                                    var8.method3453((float) var62);
                                    var8.method3453((float) (var68 + this.method1233(var62, var63)));
                                    var8.method3453((float) var63);
                                    var8.method3453((float) var62);
                                    var8.method3453((float) var63);
                                    if (this.field8862 != null) {
                                        var8.method3453((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((this.field8866 & 7) != 0) {
                                        var8.method3453(var77);
                                        var8.method3453(var75);
                                        var8.method3453(var78);
                                    }
                                } else {
                                    var8.method3446((float) var62);
                                    var8.method3446((float) (var68 + this.method1233(var62, var63)));
                                    var8.method3446((float) var63);
                                    var8.method3446((float) var62);
                                    var8.method3446((float) var63);
                                    if (this.field8862 != null) {
                                        var8.method3446((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(7 & this.field8866) != -1) {
                                        var8.method3446(var77);
                                        var8.method3446(var75);
                                        var8.method3446(var78);
                                    }
                                }
                                if (this.field8873.field6131 != 0) {
                                    var9.method3444(var94 | -16777216);
                                } else {
                                    var9.method3451(-16777216 | var94);
                                }
                                var93 = this.field8851++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method2797(-4234, new class207(var60[var61]), var69);
                            }
                            for (int var104 = 0; var104 < var58; ++var104) {
                                var13[var104].method2811(var93, var76, var89, -12494, var74);
                            }
                            ++this.field8852;
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < this.field8851; ++var15) {
                class466 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2809(var15, false);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field2697; ++var16) {
                for (int var22 = 0; super.field2693 > var22; ++var22) {
                    short[] var23 = this.field8856[super.field2697 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var25 > ~var23.length) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class466 var29 = var10[var26];
                            class466 var30 = var10[var27];
                            class466 var31 = var10[var28];
                            class466 var32 = null;
                            if (var29 != null) {
                                var29.method2808(var16, var24, (byte) -44, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method2808(var16, var24, (byte) -44, var22);
                                if (var32 == null || var32.field5651 > var30.field5651) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2808(var16, var24, (byte) -44, var22);
                                if (var32 == null || var31.field5651 < var32.field5651) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2809(var26, false);
                                }
                                if (var30 != null) {
                                    var32.method2809(var27, false);
                                }
                                if (var31 != null) {
                                    var32.method2809(var28, false);
                                }
                                var32.method2808(var16, var24, (byte) -44, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3448();
            var9.method3448();
            this.field8885 = this.field8873.method2627(false, -30125);
            this.field8885.method1867(4, this.field8851 * 4, var6, 112);
            this.field8890 = this.field8873.method2627(false, -30125);
            this.field8890.method1867(var5, this.field8851 * var5, var7, 90);
            if ((7 & this.field8866) != 0) {
                if (this.field8862 == null) {
                    this.field8887 = this.field8873.method2649(-124, new class334[] { new class334(new class58[] { class58.field719, class58.field732, class58.field728 }), new class334(class58.field729) });
                } else {
                    this.field8887 = this.field8873.method2649(-118, new class334[] { new class334(new class58[] { class58.field719, class58.field732, class58.field731, class58.field728 }), new class334(class58.field729) });
                }
            } else if (this.field8862 == null) {
                this.field8887 = this.field8873.method2649(-121, new class334[] { new class334(new class58[] { class58.field719, class58.field732 }), new class334(class58.field729) });
            } else {
                this.field8887 = this.field8873.method2649(-127, new class334[] { new class334(new class58[] { class58.field719, class58.field732, class58.field731 }), new class334(class58.field729) });
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (~var3[var18].field6570 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field8884 = new class466[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var17 < ~var20; ++var20) {
                class466 var21 = var3[var20];
                var19[var20] = var21.field5651;
                this.field8884[var20] = var21;
                var21.method2812(this.field8851, (byte) 124);
            }
            class39.method250(117, var19, this.field8884);
            if (this.field8843 != null) {
                this.field8843.method2399((byte) 89);
            }
        }
        this.field8864 = null;
        this.field8862 = null;
        this.field8893 = null;
        this.field8867 = null;
        this.field8849 = this.field8878 = null;
        this.field8850 = null;
        this.field8868 = null;
        this.field8892 = this.field8891 = this.field8888 = null;
        this.field8886 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field8875;
        if (this.field8883 > 0) {
            class370 var9 = this.field8873.method2689(true, this.field8852);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method282(-13803, true);
                if (var14 != null) {
                    Stream var15 = this.field8873.method2597(var14, 1);
                    if (!Stream.method3454()) {
                        for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                            int var17 = super.field2697 * var16 + arg3;
                            for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                                if (arg7[-arg3 + var18][var16 - arg4]) {
                                    short[] var19 = this.field8856[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var19.length > var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (var21 < var11) {
                                                var11 = var21;
                                            }
                                            if (~var21 < ~var12) {
                                                var12 = var21;
                                            }
                                            var15.method3452(var21);
                                            ++var10;
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field2697 * var22 + arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field8856[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            ++var10;
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            var15.method3447(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3448();
                    if (var9.method280(28596)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field8873.method2686((byte) 48);
                this.field8873.method2667(false, 40);
                this.field8873.method2658(77, false);
                this.field8873.method2657(false, -32);
                this.field8873.method2644(-54, false);
                this.field8873.method2650(0, (byte) 35);
                this.field8873.method2652(false, 128, -2, false);
                this.field8873.method2632((class563) null, 0);
                class57 var23 = this.field8873.method2680(0);
                float[] var24 = this.field8873.method2596((byte) -109);
                var24[8] = 0.0F;
                var24[11] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field8873.field6044) + -1.0F;
                var24[15] = 1.0F;
                var24[6] = 0.0F;
                var24[10] = 1.0F / (this.field8874 - this.field8870);
                var24[1] = 0.0F;
                var24[14] = -this.field8870 / (-this.field8870 + this.field8874);
                var24[4] = 0.0F;
                var24[3] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field2694 * 128.0F * (float) this.field8873.field6044);
                var24[2] = 0.0F;
                var24[7] = 0.0F;
                var24[9] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field2694 * 128.0F * (float) this.field8873.field5975);
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field8873.field5975) + 1.0F;
                var23.method382(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, (byte) -128, 0.0F, 0.0F, 0.0F, 0.0F);
                this.field8873.method2601(false);
                this.field8873.method2576((byte) 28);
                if (~(this.field8866 & 7) == -1) {
                    this.field8873.method2658(80, false);
                } else {
                    this.field8873.method2658(124, true);
                    this.field8873.method2602((byte) -44);
                }
                this.field8873.method2573(false, (byte) -124);
                this.field8873.method2617(this.field8890, 0, (byte) 107);
                this.field8873.method2617(this.field8885, 1, (byte) 101);
                this.field8873.method2584(true, this.field8887);
                this.field8873.method2578((byte) 49, class569.field8396, var11, 0, -var11 - -1 + var12, var10 / 3, var9);
                this.field8873.method2573(true, (byte) -70);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method1241(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8845;
        if (this.field8843 != null && arg0 != null) {
            int var7 = -(this.field8873.field6146 * arg2 >> 8) + arg1 >> this.field8873.field6156;
            int var8 = -(this.field8873.field6124 * arg2 >> 8) + arg3 >> this.field8873.field6156;
            this.field8843.method2396(arg0, var8, (byte) 94, var7);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method3546(byte arg0) {
        field8872 = null;
        if (arg0 != -104) {
            method3545(true, false);
        }
        field8857 = null;
        field8847 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lnm;[I)V")
    public final void method1236(class405 arg0, int[] arg1) {
        this.field8876.method131(new class103(this.field8873, this, arg0, arg1), 0);
        ++field8860;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1240(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8858;
        if (this.field8843 != null && arg0 != null) {
            int var7 = arg1 - (this.field8873.field6146 * arg2 >> 8) >> this.field8873.field6156;
            int var8 = -(this.field8873.field6124 * arg2 >> 8) + arg3 >> this.field8873.field6156;
            return this.field8843.method2394(arg0, -1, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lcb;IIII[[I[[II)V")
    public class600(class444 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field8855 = arg5;
        this.field8844 = super.field2695 + -2;
        this.field8873 = arg0;
        this.field8888 = new float[super.field2697 + 1][super.field2693 - -1];
        this.field8866 = arg2;
        this.field8867 = new int[arg3][arg4][];
        this.field8850 = new int[arg3][arg4][];
        this.field8868 = new class466[arg3][arg4][];
        this.field8880 = new byte[arg3][arg4];
        this.field8892 = new float[super.field2697 + 1][super.field2693 + 1];
        this.field8864 = new int[arg3][arg4][];
        this.field8891 = new float[super.field2697 + 1][super.field2693 + 1];
        this.field8893 = new byte[arg3 + 1][arg4 + 1];
        this.field8856 = new short[arg3 * arg4][];
        this.field8865 = 1 << this.field8844;
        this.field8878 = new int[arg3][arg4][];
        this.field8849 = new int[arg3][arg4][];
        for (int var9 = 0; ~var9 >= ~super.field2693; ++var9) {
            for (int var10 = 0; ~super.field2697 <= ~var10; ++var10) {
                int var11 = this.field8855[var10][var9];
                if (this.field8874 < (float) var11) {
                    this.field8874 = (float) var11;
                }
                if ((float) var11 < this.field8870) {
                    this.field8870 = (float) var11;
                }
                if (var10 > 0 && ~var9 < -1 && var10 < super.field2697 && super.field2693 > var9) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field8892[var10][var9] = (float) var12 * var14;
                    this.field8891[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field8888[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field8874;
        --this.field8870;
        this.field8886 = new class465(128);
        if ((16 & this.field8866) != 0) {
            this.field8843 = new class408(this.field8873, this);
        }
    }

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method1232(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8848;
        if (this.field8843 != null && arg0 != null) {
            int var7 = arg1 - (this.field8873.field6146 * arg2 >> 8) >> this.field8873.field6156;
            int var8 = -(this.field8873.field6124 * arg2 >> 8) + arg3 >> this.field8873.field6156;
            this.field8843.method2401(-121, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1230(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method3543(arg3, -1, -1, arg0, arg2, arg1, arg4);
        ++field8853;
    }

    @OriginalMember(owner = "client!ih", name = "ba", descriptor = "(II)I")
    public final int method1239(int arg0, int arg1) {
        ++field8861;
        return this.field8855[arg0][arg1];
    }

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "(IILk;)Lk;")
    public final class485 method1231(int arg0, int arg1, class485 arg2) {
        ++field8854;
        if (~(1 & this.field8880[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field2694 >> this.field8873.field6156;
            class396 var5 = (class396) arg2;
            class396 var6;
            if (var5 != null && var5.method2347(var4, var4, 5)) {
                var6 = var5;
                var5.method2345(true);
            } else {
                var6 = new class396(this.field8873, var4, var4);
            }
            var6.method2352(0, 0, var4, var4, 3);
            this.method3544((byte) 83, arg1, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "(III)V")
    public final void method1238(int arg0, int arg1, int arg2) {
        if ((this.field8893[arg0][arg1] & 255) < arg2) {
            this.field8893[arg0][arg1] = (byte) arg2;
        }
        ++field8846;
    }

    static {
        new class572("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field8882 = false;
        field8872 = new class610(10, 7);
    }
}
