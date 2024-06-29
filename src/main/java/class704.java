import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class704 extends class270 {

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "F")
    private float field9890 = -3.4028235E38F;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "F")
    private float field9896 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!jba", name = "Y", descriptor = "Lwo;")
    private class445 field9926 = new class445();

    @OriginalMember(owner = "client!jba", name = "G", descriptor = "I")
    private int field9909 = this.field3530 + -2;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "Lqq;")
    public class651 field9895;

    @OriginalMember(owner = "client!jba", name = "H", descriptor = "[[S")
    public short[][] field9910;

    @OriginalMember(owner = "client!jba", name = "db", descriptor = "[[F")
    private float[][] field9931;

    @OriginalMember(owner = "client!jba", name = "Z", descriptor = "[[B")
    private byte[][] field9927;

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "[[[Lnl;")
    private class581[][][] field9893;

    @OriginalMember(owner = "client!jba", name = "S", descriptor = "[[[I")
    public int[][][] field9920;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "[[B")
    private byte[][] field9892;

    @OriginalMember(owner = "client!jba", name = "A", descriptor = "[[[I")
    private int[][][] field9903;

    @OriginalMember(owner = "client!jba", name = "U", descriptor = "[[[I")
    public int[][][] field9922;

    @OriginalMember(owner = "client!jba", name = "O", descriptor = "I")
    private int field9917;

    @OriginalMember(owner = "client!jba", name = "fb", descriptor = "[[F")
    private float[][] field9933;

    @OriginalMember(owner = "client!jba", name = "N", descriptor = "I")
    public int field9916;

    @OriginalMember(owner = "client!jba", name = "eb", descriptor = "[[F")
    private float[][] field9932;

    @OriginalMember(owner = "client!jba", name = "D", descriptor = "[[[I")
    public int[][][] field9906;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "[[[I")
    private int[][][] field9897;

    @OriginalMember(owner = "client!jba", name = "hb", descriptor = "Lwh;")
    private class546 field9935;

    @OriginalMember(owner = "client!jba", name = "L", descriptor = "Lgt;")
    private class90 field9914;

    @OriginalMember(owner = "client!jba", name = "X", descriptor = "Luf;")
    public static class380 field9925 = new class380(8);

    @OriginalMember(owner = "client!jba", name = "lb", descriptor = "Ljw;")
    public static class259 field9939 = new class259(8, 16);

    @OriginalMember(owner = "client!jba", name = "mb", descriptor = "[B")
    public static byte[] field9940;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
    private int field9901;

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!jba", name = "B", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!jba", name = "C", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!jba", name = "E", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!jba", name = "F", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!jba", name = "J", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!jba", name = "K", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!jba", name = "M", descriptor = "I")
    private int field9915;

    @OriginalMember(owner = "client!jba", name = "P", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!jba", name = "R", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!jba", name = "T", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!jba", name = "V", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!jba", name = "W", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!jba", name = "ab", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!jba", name = "gb", descriptor = "I")
    private int field9934;

    @OriginalMember(owner = "client!jba", name = "jb", descriptor = "I")
    private int field9937;

    @OriginalMember(owner = "client!jba", name = "ib", descriptor = "Lum;")
    public class109 field9936;

    @OriginalMember(owner = "client!jba", name = "cb", descriptor = "Lwr;")
    private class697 field9930;

    @OriginalMember(owner = "client!jba", name = "kb", descriptor = "Lwr;")
    private class697 field9938;

    @OriginalMember(owner = "client!jba", name = "bb", descriptor = "[Lnl;")
    private class581[] field9929;

    @OriginalMember(owner = "client!jba", name = "I", descriptor = "[[[I")
    private int[][][] field9911;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
    public static void method3949(int arg0) {
        field9940 = null;
        field9939 = null;
        if (arg0 != -10069) {
            method3953(-108);
        }
        field9925 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method1355(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9898;
        if (this.field9914 != null && arg0 != null) {
            int var7 = -(this.field9895.field9257 * arg2 >> 8) + arg1 >> this.field9895.field9236;
            int var8 = -(this.field9895.field9222 * arg2 >> 8) + arg3 >> this.field9895.field9236;
            return this.field9914.method494((byte) 76, var7, arg0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V")
    public final void method1358(int arg0, int arg1, int arg2) {
        ++field9912;
        if (~arg2 < ~(255 & this.field9927[arg0][arg1])) {
            this.field9927[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "(IILha;)Lha;")
    public final class117 method1361(int arg0, int arg1, class117 arg2) {
        ++field9924;
        if ((1 & this.field9892[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field3527 >> this.field9895.field9236;
            class239 var5 = (class239) arg2;
            class239 var6;
            if (var5 != null && var5.method1484(var4, (byte) 75, var4)) {
                var6 = var5;
                var5.method1485((byte) 90);
            } else {
                var6 = new class239(this.field9895, var4, var4);
            }
            var6.method1486(var4, var4, (byte) 0, 0, 0);
            this.method3952(89, var6, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1350(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field9902;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
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
        this.method1353(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
    public static final void method3950(int arg0) {
        int var1 = -32 % ((-29 - arg0) / 60);
        ++field9923;
        if (~class68.field829 >= -1) {
            class519.field7203 = "";
        } else {
            int var2 = 0;
            for (int var3 = 0; ~var3 > ~class187.field2606.length; ++var3) {
                if (~class187.field2606[var3].indexOf("--> ") != 0) {
                    int var10000 = ~class68.field829;
                    ++var2;
                    if (var10000 == ~var2) {
                        class519.field7203 = class187.field2606[var3].substring(2 + class187.field2606[var3].indexOf(">"));
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lqq;IIII[[I[[II)V")
    public class704(class651 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field9895 = arg0;
        this.field9910 = new short[arg3 * arg4][];
        this.field9931 = new float[super.field3524 + 1][super.field3525 + 1];
        this.field9927 = new byte[arg3 + 1][arg4 + 1];
        this.field9893 = new class581[arg3][arg4][];
        this.field9920 = new int[arg3][arg4][];
        this.field9892 = new byte[arg3][arg4];
        this.field9903 = new int[arg3][arg4][];
        this.field9922 = new int[arg3][arg4][];
        this.field9917 = 1 << this.field9909;
        this.field9933 = new float[super.field3524 - -1][super.field3525 + 1];
        this.field9916 = arg2;
        this.field9932 = new float[super.field3524 + 1][super.field3525 + 1];
        this.field9906 = new int[arg3][arg4][];
        this.field9897 = new int[arg3][arg4][];
        for (int var9 = 0; ~super.field3525 <= ~var9; ++var9) {
            for (int var10 = 0; super.field3524 >= var10; ++var10) {
                int var11 = super.field3523[var10][var9];
                if (this.field9896 > (float) var11) {
                    this.field9896 = (float) var11;
                }
                if (this.field9890 < (float) var11) {
                    this.field9890 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && var10 < super.field3524 && ~super.field3525 < ~var9) {
                    int var12 = arg6[var10 - -1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var12 * var12 - -(var13 * var13))));
                    this.field9933[var10][var9] = (float) var12 * var14;
                    this.field9931[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field9932[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field9896;
        ++this.field9890;
        this.field9935 = new class546(128);
        if ((16 & this.field9916) != 0) {
            this.field9914 = new class90(this.field9895, this);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lio;Z)Lnj;")
    public static final class527 method3951(class157 arg0, boolean arg1) {
        if (!arg1) {
            field9925 = null;
        }
        ++field9900;
        return new class527(arg0.method928(2016790224), arg0.method928(2016790224), arg0.method928(2016790224), arg0.method928(2016790224), arg0.method933((byte) 1), arg0.method930(255));
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V")
    public final void method1364(int arg0, int arg1) {
        ++field9899;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILdi;II)V")
    private final void method3952(int arg0, class239 arg1, int arg2, int arg3) {
        ++field9908;
        int[] var5 = this.field9920[arg3][arg2];
        int[] var6 = this.field9922[arg3][arg2];
        int var7 = var5.length;
        if (~class182.field2539.length > ~var7) {
            class182.field2539 = new int[var7];
            class129.field1799 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class182.field2539[var8] = var5[var8] >> this.field9895.field9236;
            class129.field1799[var8] = var6[var8] >> this.field9895.field9236;
        }
        int var9 = -49 % ((arg0 - -8) / 55);
        int var10 = 0;
        while (var7 > var10) {
            int var11 = class182.field2539[var10];
            int var12 = class129.field1799[var10++];
            int var13 = class182.field2539[var10];
            int var14 = class129.field1799[var10++];
            int var15 = class182.field2539[var10];
            int var16 = class129.field1799[var10++];
            if (~((-var13 + var11) * (-var16 + var14) + -((-var12 + var14) * (-var13 + var15))) < -1) {
                arg1.method1481(var13, var11, var14, var16, var15, -1351019056, var12);
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1353(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field9904;
        if (arg3 != null && this.field9897 == null) {
            this.field9897 = new int[super.field3524][super.field3525][];
        }
        if (arg5 != null && this.field9911 == null) {
            this.field9911 = new int[super.field3524][super.field3525][];
        }
        this.field9920[arg0][arg1] = arg2;
        this.field9922[arg0][arg1] = arg4;
        this.field9906[arg0][arg1] = arg6;
        this.field9903[arg0][arg1] = arg7;
        if (this.field9911 != null) {
            this.field9911[arg0][arg1] = arg5;
        }
        if (this.field9897 != null) {
            this.field9897[arg0][arg1] = arg3;
        }
        class581[] var15 = this.field9893[arg0][arg1] = new class581[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[var16] << 14);
            class45 var19;
            for (var19 = this.field9935.method3057(1, var17); var19 != null; var19 = this.field9935.method3062(91)) {
                class581 var20 = (class581) var19;
                if (~arg8[var16] == ~var20.field7937 && (float) arg9[var16] == var20.field7951 && ~var20.field7953 == ~arg10 && ~var20.field7955 == ~arg11 && ~var20.field7939 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class581(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field9935.method3061(126, var17, var15[var16]);
            } else {
                var15[var16] = (class581) var19;
            }
        }
        if (arg13) {
            this.field9892[arg0][arg1] = (byte) class665.method3789(this.field9892[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field9934) {
            this.field9934 = arg6.length;
        }
        this.field9937 += arg6.length;
    }

    @OriginalMember(owner = "client!jba", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method1352(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9921;
        if (this.field9914 != null && arg0 != null) {
            int var7 = arg1 - (this.field9895.field9257 * arg2 >> 8) >> this.field9895.field9236;
            int var8 = -(this.field9895.field9222 * arg2 >> 8) + arg3 >> this.field9895.field9236;
            this.field9914.method489(-1401718841, var7, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)Z")
    public static final boolean method3953(int arg0) {
        ++field9891;
        class365 var1 = (class365) class259.field3385.method2506(68);
        if (var1 == null) {
            return false;
        } else {
            int var2 = -29 % ((61 - arg0) / 36);
            for (int var3 = 0; var1.field4825 > var3; ++var3) {
                if (var1.field4815[var3] != null && var1.field4815[var3].field9420 == 0) {
                    return false;
                }
                if (var1.field4826[var3] != null && ~var1.field4826[var3].field9420 == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1363(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field9888;
        this.method3954(arg2, arg0, (byte) 70, arg1, arg3, arg5, arg4);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIBI[[ZIZ)V")
    private final void method3954(int arg0, int arg1, byte arg2, int arg3, boolean[][] arg4, int arg5, boolean arg6) {
        if (this.field9929 != null) {
            int var8 = arg0 + arg0 + 1;
            int var9 = var8 * var8;
            if (class196.field2684.length < var9) {
                class196.field2684 = new int[var9];
            }
            int var10 = arg1 - arg0;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg0 + arg3;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg0 + arg1;
            if (~(super.field3524 - 1) > ~var14) {
                var14 = super.field3524 + -1;
            }
            int var15 = arg3 - -arg0;
            if (var15 > super.field3525 - 1) {
                var15 = super.field3525 + -1;
            }
            class252.field3314 = 0;
            for (int var16 = var10; ~var14 <= ~var16; ++var16) {
                boolean[] var23 = arg4[-var11 + var16];
                for (int var24 = var12; ~var15 <= ~var24; ++var24) {
                    if (var23[var24 - var13]) {
                        class196.field2684[class252.field3314++] = super.field3524 * var24 - -var16;
                    }
                }
            }
            if (~arg5 == 0) {
                this.field9895.method3686(false);
            } else {
                this.field9895.method3665((float) arg5, (byte) -75);
                this.field9895.method3681((byte) 108);
            }
            this.field9895.method3622(arg2 + -22631);
            this.field9895.method3615((byte) -124, (7 & this.field9916) != 0);
            this.field9895.method3667(-1, false, false, 3);
            this.field9895.method2020(arg2 + -173, 0, this.field9938);
            for (int var17 = 0; this.field9929.length > var17; ++var17) {
                this.field9929[var17].method3209(class252.field3314, -21, class196.field2684);
            }
            class149 var18 = this.field9895.method3675(57);
            var18.method359(0, -1, 0);
            this.field9895.method3685(arg2 + -157);
            if (!this.field9926.method2499((byte) -80)) {
                int var19 = this.field9895.field9269;
                int var20 = this.field9895.field9260;
                this.field9895.method1073(0, var20, this.field9895.field9180);
                this.field9895.method3615((byte) -68, false);
                this.field9895.method3628(false, (byte) -71);
                this.field9895.method3627(89, 128);
                this.field9895.method3667(-2, false, false, 3);
                this.field9895.method3613((byte) 116, this.field9895.field9185);
                this.field9895.method3672((byte) -79, class298.field3941, class274.field3642);
                this.field9895.method3624(class137.field1869, -115, 0);
                this.field9895.method3666(0, class502.field6912, (byte) -83);
                for (class45 var21 = this.field9926.method2506(arg2 ^ 2); var21 != null; var21 = this.field9926.method2505(-128)) {
                    class308 var22 = (class308) var21;
                    var22.method1817(arg0, arg4, arg3, arg1, (byte) -124);
                }
                this.field9895.method3624(class630.field8719, arg2 + -193, 0);
                this.field9895.method3666(0, class630.field8719, (byte) -83);
                this.field9895.method3613((byte) 121, (class222) null);
                this.field9895.method1073(var19, var20, this.field9895.field9180);
            }
            if (this.field9914 != null) {
                this.field9895.method2020(101, 0, this.field9938);
                this.field9895.method2020(-56, 1, this.field9930);
                this.field9895.method1994(this.field9936, arg2 ^ 69);
                this.field9914.method491(arg0, arg4, (byte) -98, arg6, arg3, arg1);
            }
        }
        ++field9894;
        if (arg2 != 70) {
            this.field9932 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lqea;[I)V")
    public final void method1351(class392 arg0, int[] arg1) {
        ++field9919;
        this.field9926.method2507(new class308(this.field9895, this, arg0, arg1), (byte) -127);
    }

    @OriginalMember(owner = "client!jba", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method1357(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9928;
        if (this.field9914 != null && arg0 != null) {
            int var7 = -(this.field9895.field9257 * arg2 >> 8) + arg1 >> this.field9895.field9236;
            int var8 = -(this.field9895.field9222 * arg2 >> 8) + arg3 >> this.field9895.field9236;
            this.field9914.method492(var8, var7, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!jba", name = "BA", descriptor = "()V")
    public final void method1349() {
        if (~this.field9937 < -1) {
            byte[][] var1 = new byte[super.field3524 - -1][super.field3525 + 1];
            for (int var2 = 1; ~super.field3524 < ~var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field3525; ++var107) {
                    var1[var2][var107] = (byte) ((this.field9927[var2 + 1][var107] >> 3) + (this.field9927[var2][var107 + 1] >> 3) + (this.field9927[var2][var107 + -1] >> 2) + (this.field9927[var2 + -1][var107] >> 2) + (this.field9927[var2][var107] >> 1));
                }
            }
            class581[] var3 = new class581[this.field9935.method3060(0)];
            this.field9935.method3052(13534, var3);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method3202(-106, this.field9937);
            }
            int var5 = 20;
            if (this.field9911 != null) {
                var5 += 4;
            }
            if (~(7 & this.field9916) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field9895.field9095.method3428(this.field9937 * 4, false);
            NativeHeapBuffer var7 = this.field9895.field9095.method3428(this.field9937 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class581[] var10 = new class581[this.field9937];
            int var11 = class245.method1497(this.field9937 / 4, (byte) -124);
            if (~var11 > -2) {
                var11 = 1;
            }
            class546 var12 = new class546(var11);
            class581[] var13 = new class581[this.field9934];
            for (int var14 = 0; ~super.field3524 < ~var14; ++var14) {
                for (int var34 = 0; var34 < super.field3525; ++var34) {
                    if (this.field9906[var14][var34] != null) {
                        class581[] var35 = this.field9893[var14][var34];
                        int[] var36 = this.field9920[var14][var34];
                        int[] var37 = this.field9922[var14][var34];
                        int[] var38 = this.field9903[var14][var34];
                        int[] var39 = this.field9906[var14][var34];
                        int[] var40 = this.field9897 != null ? this.field9897[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field9911 != null ? this.field9911[var14][var34] : null;
                        float var42 = this.field9933[var14][var34];
                        float var43 = this.field9931[var14][var34];
                        float var44 = this.field9932[var14][var34];
                        float var45 = this.field9933[var14][var34 + 1];
                        float var46 = this.field9931[var14][var34 - -1];
                        float var47 = this.field9932[var14][var34 + 1];
                        float var48 = this.field9933[var14 + 1][var34 + 1];
                        float var49 = this.field9931[var14 - -1][var34 + 1];
                        float var50 = this.field9932[var14 - -1][var34 - -1];
                        float var51 = this.field9933[var14 + 1][var34];
                        float var52 = this.field9931[var14 - -1][var34];
                        float var53 = this.field9932[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 - -1][var34 + 1] & 255;
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label358: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class581 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label358;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field9910[super.field3524 * var34 - -var14] = new short[var39.length];
                        for (int var61 = 0; var61 < var39.length; ++var61) {
                            int var62 = (var14 << super.field3530) + var36[var61];
                            int var63 = (var34 << super.field3530) - -var37[var61];
                            int var64 = var62 >> this.field9909;
                            int var65 = var63 >> this.field9909;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32 | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            float var76;
                            float var77;
                            int var78;
                            if (~var71 == -1 && var72 == 0) {
                                var75 = var42;
                                var76 = var43;
                                var77 = var44;
                                var78 = var73 - var54;
                            } else if (var71 == 0 && ~super.field3527 == ~var72) {
                                var76 = var46;
                                var78 = var73 - var55;
                                var77 = var47;
                                var75 = var45;
                            } else if (super.field3527 == var71 && ~super.field3527 == ~var72) {
                                var75 = var48;
                                var76 = var49;
                                var78 = var73 - var56;
                                var77 = var50;
                            } else if (super.field3527 == var71 && var72 == 0) {
                                var77 = var53;
                                var76 = var52;
                                var75 = var51;
                                var78 = var73 - var57;
                            } else {
                                float var79 = (float) var71 / (float) super.field3527;
                                float var80 = (float) var72 / (float) super.field3527;
                                float var81 = (var51 - var42) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (-var44 + var53) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (-var46 + var49) * var79 + var46;
                                var75 = (-var81 + var84) * var80 + var81;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var76 = (var85 - var82) * var80 + var82;
                                var77 = (-var83 + var86) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field3530) + var54;
                                int var88 = ((-var55 + var56) * var71 >> super.field3530) + var55;
                                var78 = var73 - (((-var87 + var88) * var72 >> super.field3530) + var87);
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var78 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                var74 = class104.field1240[var66 & 65408 | var90];
                                if ((this.field9916 & 7) == 0) {
                                    float var91 = this.field9895.field9239[2] * var77 + this.field9895.field9239[1] * var76 + this.field9895.field9239[0] * var75;
                                    var89 = this.field9895.field9223 + var91 * (!(var91 > 0.0F) ? this.field9895.field9238 : this.field9895.field9244);
                                }
                            }
                            class45 var92 = null;
                            if (~(var62 & this.field9917 + -1) == -1 && (this.field9917 + -1 & var63) == 0) {
                                var92 = var12.method3057(1, var69);
                            }
                            int var103;
                            if (var92 == null) {
                                int var94;
                                if (~var66 != ~var67) {
                                    int var93 = (127 & var67) * var78 >> 7;
                                    if (var93 >= 2) {
                                        if (~var93 < -127) {
                                            var93 = 126;
                                        }
                                    } else {
                                        var93 = 2;
                                    }
                                    var94 = class104.field1240[65408 & var67 | var93];
                                    if ((7 & this.field9916) == 0) {
                                        float var95 = this.field9895.field9239[2] * var77 + this.field9895.field9239[0] * var75 + this.field9895.field9239[1] * var76;
                                        float var96 = var89 * (!(var89 > 0.0F) ? this.field9895.field9238 : this.field9895.field9244) + this.field9895.field9223;
                                        int var97 = 255 & var94 >> 16;
                                        int var98 = (65516 & var94) >> 8;
                                        int var99 = 255 & var94;
                                        int var100 = (int) ((float) var97 * var96);
                                        if (var100 < 0) {
                                            var100 = 0;
                                        } else if (~var100 < -256) {
                                            var100 = 255;
                                        }
                                        int var101 = (int) ((float) var98 * var96);
                                        int var102 = (int) ((float) var99 * var96);
                                        if (var101 < 0) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (var102 > 255) {
                                            var102 = 255;
                                        }
                                        var94 = var102 | var100 << 16 | var101 << 8;
                                    }
                                } else {
                                    var94 = var74;
                                }
                                if (!Stream.method3445()) {
                                    var8.method3438((float) var62);
                                    var8.method3438((float) (this.method1609(var62, var63, 57) - -var68));
                                    var8.method3438((float) var63);
                                    var8.method3438((float) var62);
                                    var8.method3438((float) var63);
                                    if (this.field9911 != null) {
                                        var8.method3438((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field9916) != 0) {
                                        var8.method3438(var75);
                                        var8.method3438(var76);
                                        var8.method3438(var77);
                                    }
                                } else {
                                    var8.method3439((float) var62);
                                    var8.method3439((float) (this.method1609(var62, var63, 40) - -var68));
                                    var8.method3439((float) var63);
                                    var8.method3439((float) var62);
                                    var8.method3439((float) var63);
                                    if (this.field9911 != null) {
                                        var8.method3439((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if (~(this.field9916 & 7) != -1) {
                                        var8.method3439(var75);
                                        var8.method3439(var76);
                                        var8.method3439(var77);
                                    }
                                }
                                if (~this.field9895.field9262 == -1) {
                                    var9.method3446(var94 | -16777216);
                                } else {
                                    var9.method3432(var94 | -16777216);
                                }
                                var103 = this.field9915++;
                                var60[var61] = (short) var103;
                                if (~var66 != 0) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method3061(127, var69, new class401(var60[var61]));
                            } else {
                                var60[var61] = ((class401) var92).field5317;
                                var103 = var60[var61] & 65535;
                                if (~var66 != 0 && ~var10[var103].field545 < ~var35[var61].field545) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method3208(var78, var74, var103, false, var89);
                            }
                            ++this.field9901;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field9915; ++var15) {
                class581 var33 = var10[var15];
                if (var33 != null) {
                    var33.method3206(var15, true);
                }
            }
            for (int var16 = 0; super.field3524 > var16; ++var16) {
                for (int var22 = 0; var22 < super.field3525; ++var22) {
                    short[] var23 = this.field9910[super.field3524 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class581 var29 = var10[var26];
                            class581 var30 = var10[var27];
                            class581 var31 = var10[var28];
                            class581 var32 = null;
                            if (var29 != null) {
                                var29.method3205(var24, var16, -1, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method3205(var24, var16, -1, var22);
                                if (var32 == null || var30.field545 < var32.field545) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method3205(var24, var16, -1, var22);
                                if (var32 == null || ~var31.field545 > ~var32.field545) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method3206(var26, true);
                                }
                                if (var30 != null) {
                                    var32.method3206(var27, true);
                                }
                                if (var31 != null) {
                                    var32.method3206(var28, true);
                                }
                                var32.method3205(var24, var16, -1, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3440();
            var9.method3440();
            this.field9930 = this.field9895.method1996(false, (byte) -15);
            this.field9930.method2568(var6, 4, -19467, this.field9915 * 4);
            this.field9938 = this.field9895.method1996(false, (byte) 118);
            this.field9938.method2568(var7, var5, -19467, this.field9915 * var5);
            if (~(this.field9916 & 7) == -1) {
                if (this.field9911 != null) {
                    this.field9936 = this.field9895.method2015((byte) -85, new class636[] { new class636(new class255[] { class255.field3339, class255.field3346, class255.field3345 }), new class636(class255.field3344) });
                } else {
                    this.field9936 = this.field9895.method2015((byte) -85, new class636[] { new class636(new class255[] { class255.field3339, class255.field3346 }), new class636(class255.field3344) });
                }
            } else if (this.field9911 != null) {
                this.field9936 = this.field9895.method2015((byte) -85, new class636[] { new class636(new class255[] { class255.field3339, class255.field3346, class255.field3345, class255.field3343 }), new class636(class255.field3344) });
            } else {
                this.field9936 = this.field9895.method2015((byte) -85, new class636[] { new class636(new class255[] { class255.field3339, class255.field3346, class255.field3343 }), new class636(class255.field3344) });
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (var3[var18].field7948 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field9929 = new class581[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class581 var21 = var3[var20];
                var19[var20] = var21.field545;
                this.field9929[var20] = var21;
                var21.method3207(this.field9915, false);
            }
            class585.method3241((byte) 39, this.field9929, var19);
            if (this.field9914 != null) {
                this.field9914.method490(-126);
            }
        } else {
            this.field9914 = null;
        }
        ++field9889;
        this.field9933 = this.field9931 = this.field9932 = null;
        this.field9903 = null;
        this.field9897 = null;
        this.field9920 = this.field9922 = null;
        this.field9906 = null;
        this.field9935 = null;
        this.field9893 = null;
        this.field9911 = null;
        this.field9927 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field9907;
        this.method3954(arg2, arg0, (byte) 70, arg1, arg3, -1, arg4);
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(II)[B")
    public static final byte[] method3955(int arg0, int arg1) {
        if (arg1 != 7433) {
            method3951((class157) null, false);
        }
        ++field9913;
        class273 var2 = (class273) class75.field887.method1390((long) arg0, (byte) 78);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = 255 - var6;
                int var8 = class584.method3227(false, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class273(var3);
            class75.field887.method1393((long) arg0, arg1 ^ -7508, var2);
        }
        return var2.field3638;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9918;
        if (~this.field9937 < -1) {
            class556 var9 = this.field9895.method3639(0, this.field9901);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method2143(true, (byte) 77);
                if (var14 != null) {
                    Stream var15 = this.field9895.method3614(var14, 0);
                    if (Stream.method3445()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field3524 * var16 - -arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][var16 - arg4]) {
                                    short[] var19 = this.field9910[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            var15.method3433(var21);
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
                        for (int var22 = arg4; var22 < arg6; ++var22) {
                            int var25 = super.field3524 * var22 - -arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[var26 - arg3][-arg4 + var22]) {
                                    short[] var27 = this.field9910[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                            var15.method3443(var29);
                                            ++var10;
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3440();
                    if (var9.method2145(false)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field9895.method3642(-91);
                this.field9895.method3658((byte) 125, false);
                this.field9895.method3615((byte) -84, false);
                this.field9895.method3638(76, false);
                this.field9895.method3628(false, (byte) 126);
                this.field9895.method3627(72, 0);
                this.field9895.method3667(-2, false, false, 3);
                this.field9895.method3613((byte) 124, (class222) null);
                class149 var23 = this.field9895.method3675(52);
                float[] var24 = this.field9895.method3631(false);
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field9895.field8997;
                var24[6] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field3527 * 128.0F * (float) this.field9895.field8997);
                var24[5] = (float) arg2 / ((float) super.field3527 * 128.0F * (float) this.field9895.field9117);
                var24[11] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field9895.field9117;
                var24[10] = 1.0F / (this.field9890 - this.field9896);
                var24[4] = 0.0F;
                var24[2] = 0.0F;
                var24[7] = 0.0F;
                var24[3] = 0.0F;
                var24[8] = 0.0F;
                var24[15] = 1.0F;
                var24[9] = 0.0F;
                var24[1] = 0.0F;
                var24[14] = -this.field9896 / (-this.field9896 + this.field9890);
                var23.method874(1.0F, 0.0F, 0, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
                this.field9895.method3664(false);
                this.field9895.method3685(-64);
                if (~(this.field9916 & 7) != -1) {
                    this.field9895.method3615((byte) -116, true);
                    this.field9895.method2027(false);
                } else {
                    this.field9895.method3615((byte) -96, false);
                }
                this.field9895.method2026(-30817, false);
                this.field9895.method2020(-42, 0, this.field9938);
                this.field9895.method2020(-115, 1, this.field9930);
                this.field9895.method1994(this.field9936, 3);
                this.field9895.method2040(0, -104, var11, var9, var10 / 3, var12 - var11 - -1, class694.field9783);
                this.field9895.method2026(-30817, true);
            }
        }
    }

    static {
        int var0 = 0;
        field9940 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var2 <= var1; ++var2) {
                field9940[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
