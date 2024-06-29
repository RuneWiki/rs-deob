import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class352 extends class174 {

    @OriginalMember(owner = "client!uw", name = "Q", descriptor = "Ldm;")
    private class46 field4753 = new class46();

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "[[I")
    private int[][] field4719;

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "I")
    private int field4730;

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "Lwr;")
    public class388 field4729;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "[[[I")
    private int[][][] field4734;

    @OriginalMember(owner = "client!uw", name = "M", descriptor = "[[[I")
    private int[][][] field4749;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "[[[I")
    public int[][][] field4736;

    @OriginalMember(owner = "client!uw", name = "ab", descriptor = "[[F")
    private float[][] field4763;

    @OriginalMember(owner = "client!uw", name = "bb", descriptor = "[[F")
    private float[][] field4764;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
    private int field4724;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "[[B")
    private byte[][] field4720;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "[[[I")
    public int[][][] field4743;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "[[S")
    public short[][] field4721;

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "[[[I")
    private int[][][] field4744;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!uw", name = "U", descriptor = "[[F")
    private float[][] field4757;

    @OriginalMember(owner = "client!uw", name = "Y", descriptor = "[[B")
    private byte[][] field4761;

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "[[[Lws;")
    private class300[][][] field4726;

    @OriginalMember(owner = "client!uw", name = "eb", descriptor = "Ldea;")
    private class205 field4767;

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "Ltv;")
    private class481 field4723;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "Z")
    public static boolean field4738 = false;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    private int field4722;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "I")
    private int field4740;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!uw", name = "L", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!uw", name = "N", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!uw", name = "O", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!uw", name = "P", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!uw", name = "R", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!uw", name = "S", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!uw", name = "T", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!uw", name = "V", descriptor = "I")
    private int field4758;

    @OriginalMember(owner = "client!uw", name = "W", descriptor = "I")
    private int field4759;

    @OriginalMember(owner = "client!uw", name = "X", descriptor = "Ltq;")
    public class538 field4760;

    @OriginalMember(owner = "client!uw", name = "db", descriptor = "Ltq;")
    private class538 field4766;

    @OriginalMember(owner = "client!uw", name = "cb", descriptor = "Llu;")
    private class609 field4765;

    @OriginalMember(owner = "client!uw", name = "Z", descriptor = "[Lws;")
    private class300[] field4762;

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "[[[I")
    private int[][][] field4735;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1109(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field4748;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
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
        this.method1108(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)V")
    public final void method1101(int arg0, int arg1) {
        ++field4756;
    }

    @OriginalMember(owner = "client!uw", name = "X", descriptor = "(IILk;)Lk;")
    public final class485 method1096(int arg0, int arg1, class485 arg2) {
        ++field4725;
        if (~(this.field4720[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field2504 >> this.field4729.field5394;
            class452 var5 = (class452) arg2;
            class452 var6;
            if (var5 != null && var5.method2657(var4, -1, var4)) {
                var6 = var5;
                var5.method2651(true);
            } else {
                var6 = new class452(this.field4729, var4, var4);
            }
            var6.method2653(0, -88, var4, 0, var4);
            this.method2114(arg0, var6, (byte) 68, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uw", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1108(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field4737;
        if (arg5 != null && this.field4735 == null) {
            this.field4735 = new int[super.field2505][super.field2503][];
        }
        if (arg3 != null && this.field4749 == null) {
            this.field4749 = new int[super.field2505][super.field2503][];
        }
        this.field4736[arg0][arg1] = arg2;
        this.field4743[arg0][arg1] = arg4;
        this.field4734[arg0][arg1] = arg6;
        this.field4744[arg0][arg1] = arg7;
        if (this.field4735 != null) {
            this.field4735[arg0][arg1] = arg5;
        }
        if (this.field4749 != null) {
            this.field4749[arg0][arg1] = arg3;
        }
        class300[] var15 = this.field4726[arg0][arg1] = new class300[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14);
            class176 var19;
            for (var19 = this.field4767.method1242(0, var17); var19 != null; var19 = this.field4767.method1243(-1)) {
                class300 var20 = (class300) var19;
                if (~arg8[var16] == ~var20.field4112 && (float) arg9[var16] == var20.field4106 && ~var20.field4093 == ~arg10 && var20.field4107 == arg11 && var20.field4095 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class300) var19;
            } else {
                var15[var16] = new class300(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field4767.method1241(var15[var16], var17, -109);
            }
        }
        if (arg13) {
            this.field4720[arg0][arg1] = (byte) class73.method578(this.field4720[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field4758) {
            this.field4758 = arg6.length;
        }
        this.field4759 += arg6.length;
    }

    @OriginalMember(owner = "client!uw", name = "Q", descriptor = "(III)V")
    public final void method1097(int arg0, int arg1, int arg2) {
        ++field4747;
        if (~(255 & this.field4761[arg0][arg1]) > ~arg2) {
            this.field4761[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method1102(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4745;
        if (this.field4723 != null && arg0 != null) {
            int var7 = -(this.field4729.field5390 * arg2 >> 8) + arg1 >> this.field4729.field5394;
            int var8 = -(this.field4729.field5420 * arg2 >> 8) + arg3 >> this.field4729.field5394;
            this.field4723.method2794(var7, var8, arg0, 18391);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1106(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4741;
        if (this.field4723 != null && arg0 != null) {
            int var7 = -(this.field4729.field5390 * arg2 >> 8) + arg1 >> this.field4729.field5394;
            int var8 = -(this.field4729.field5420 * arg2 >> 8) + arg3 >> this.field4729.field5394;
            return this.field4723.method2797(var7, var8, -58, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4750;
        if (~this.field4759 < -1) {
            class321 var9 = this.field4729.method2288(this.field4722, false);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method613(true, -25838);
                if (var14 != null) {
                    Stream var15 = this.field4729.method2269(94, var14);
                    if (!Stream.method3294()) {
                        for (int var16 = arg4; var16 < arg6; ++var16) {
                            int var17 = super.field2505 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field4721[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (~var21 < ~var12) {
                                                var12 = var21;
                                            }
                                            ++var10;
                                            var15.method3298(var21);
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~var22 > ~arg6; ++var22) {
                            int var25 = super.field2505 * var22 - -arg3;
                            for (int var26 = arg3; ~arg5 < ~var26; ++var26) {
                                if (arg7[-arg3 + var26][var22 - arg4]) {
                                    short[] var27 = this.field4721[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var28 < var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (~var12 > ~var29) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            var15.method3291(var29);
                                            if (var11 > var29) {
                                                var11 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3288();
                    if (var9.method616((byte) -96)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field4729.method2328(-11863);
                this.field4729.method2304(-97, false);
                this.field4729.method2276(false, -8);
                this.field4729.method2303(false, -32);
                this.field4729.method2275(-32491, false);
                this.field4729.method2317(0, 9);
                this.field4729.method2344((byte) 78, -2, false, false);
                this.field4729.method2267(2, (class445) null);
                class557 var23 = this.field4729.method2342((byte) -92);
                float[] var24 = this.field4729.method2323((byte) 121);
                var24[5] = (float) arg2 / ((float) super.field2504 * 128.0F * (float) this.field4729.field5331);
                var24[10] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field4729.field5302;
                var24[14] = 0.0F;
                var24[3] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field2504 * 128.0F * (float) this.field4729.field5302);
                var24[4] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4729.field5331) + 1.0F;
                var24[8] = 0.0F;
                var24[1] = 0.0F;
                var24[11] = 0.0F;
                var24[15] = 1.0F;
                var24[9] = 0.0F;
                var24[7] = 0.0F;
                var24[6] = 0.0F;
                var24[2] = 0.0F;
                var23.method3167(1.0F, 1.0F, 0.0F, true, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
                this.field4729.method2345(10);
                this.field4729.method2286(21838);
                if (~(7 & this.field4727) != -1) {
                    this.field4729.method2276(true, -8);
                    this.field4729.method1621(-15077);
                } else {
                    this.field4729.method2276(false, -8);
                }
                this.field4729.method1608(false, 16777215);
                this.field4729.method1609(this.field4766, 44);
                this.field4729.method1607(this.field4765, 0, false);
                this.field4729.method1615(false, -var11 + var12 + 1, var9, var11, var10 / 3, 0, class481.field6784);
                this.field4729.method1608(true, 16777215);
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lwr;IIII[[I[[II)V")
    public class352(class388 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field4719 = arg5;
        this.field4730 = super.field2506 + -2;
        this.field4729 = arg0;
        this.field4734 = new int[arg3][arg4][];
        this.field4749 = new int[arg3][arg4][];
        this.field4736 = new int[arg3][arg4][];
        this.field4763 = new float[super.field2505 + 1][super.field2503 + 1];
        this.field4764 = new float[super.field2505 - -1][super.field2503 + 1];
        this.field4724 = 1 << this.field4730;
        this.field4720 = new byte[arg3][arg4];
        this.field4743 = new int[arg3][arg4][];
        this.field4721 = new short[arg3 * arg4][];
        this.field4744 = new int[arg3][arg4][];
        this.field4727 = arg2;
        this.field4757 = new float[super.field2505 - -1][super.field2503 - -1];
        this.field4761 = new byte[arg3 + 1][arg4 + 1];
        this.field4726 = new class300[arg3][arg4][];
        for (int var9 = 1; ~super.field2503 < ~var9; ++var9) {
            for (int var10 = 1; super.field2505 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
                this.field4763[var10][var9] = (float) var11 * var13;
                this.field4764[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field4757[var10][var9] = (float) var12 * var13;
            }
        }
        this.field4767 = new class205(128);
        if ((16 & this.field4727) != 0) {
            this.field4723 = new class481(this.field4729, this);
        }
    }

    @OriginalMember(owner = "client!uw", name = "ba", descriptor = "(II)I")
    public final int method1104(int arg0, int arg1) {
        ++field4739;
        return this.field4719[arg0][arg1];
    }

    @OriginalMember(owner = "client!uw", name = "aa", descriptor = "(II)I")
    public final int method1105(int arg0, int arg1) {
        ++field4731;
        int var3 = arg0 >> super.field2506;
        int var4 = arg1 >> super.field2506;
        if (var3 >= 0 && var4 >= 0 && ~var3 >= ~(super.field2505 + -1) && ~(super.field2503 + -1) <= ~var4) {
            int var5 = arg0 & super.field2504 + -1;
            int var6 = super.field2504 + -1 & arg1;
            int var7 = (-var5 + super.field2504) * this.field4719[var3][var4] + this.field4719[var3 + 1][var4] * var5 >> super.field2506;
            int var8 = (-var5 + super.field2504) * this.field4719[var3][var4 - -1] - -(this.field4719[var3 - -1][var4 + 1] * var5) >> super.field2506;
            return (-var6 + super.field2504) * var7 + var6 * var8 >> super.field2506;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIII)V")
    public static final void method2110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class264.field3687 && class591.field8435 >= arg2) {
            int var5 = class646.method3722(arg0, class326.field4387, class596.field8621, false);
            int var6 = class646.method3722(arg4, class326.field4387, class596.field8621, false);
            class483.method2808(var5, 215, var6, arg3, arg2);
        }
        if (arg1 == 0) {
            ++field4733;
        }
    }

    @OriginalMember(owner = "client!uw", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method1107(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4746;
        if (this.field4723 != null && arg0 != null) {
            int var7 = -(this.field4729.field5390 * arg2 >> 8) + arg1 >> this.field4729.field5394;
            int var8 = -(this.field4729.field5420 * arg2 >> 8) + arg3 >> this.field4729.field5394;
            this.field4723.method2796(1, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(BI)V")
    public static final void method2111(byte arg0, int arg1) {
        ++field4752;
        class314 var2 = class483.method2819(1, arg1, 21303);
        var2.method1962((byte) 0);
        if (arg0 > -64) {
            field4738 = false;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lrh;[I)V")
    public final void method1095(class223 arg0, int[] arg1) {
        ++field4742;
        this.field4753.method463(new class110(this.field4729, this, arg0, arg1), -118);
    }

    @OriginalMember(owner = "client!uw", name = "N", descriptor = "()V")
    public final void method1098() {
        ++field4754;
        if (this.field4759 > 0) {
            byte[][] var1 = new byte[super.field2505 + 1][super.field2503 + 1];
            for (int var2 = 1; ~super.field2505 < ~var2; ++var2) {
                for (int var105 = 1; super.field2503 > var105; ++var105) {
                    var1[var2][var105] = (byte) ((this.field4761[var2][var105 + 1] >> 3) + (this.field4761[var2][var105 + -1] >> 2) + (this.field4761[var2 + -1][var105] >> 2) + (this.field4761[var2 + 1][var105] >> 3) + (this.field4761[var2][var105] >> 1));
                }
            }
            class300[] var3 = new class300[this.field4767.method1250(0)];
            this.field4767.method1246(var3, -105);
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                var3[var4].method1915(false, this.field4759);
            }
            int var5 = 24;
            if (this.field4735 != null) {
                var5 += 4;
            }
            if (~(7 & this.field4727) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field4729.field5365.method3286(this.field4759 * var5, false);
            Stream var7 = new Stream(var6);
            class300[] var8 = new class300[this.field4759];
            int var9 = class327.method2020(-1594581311, this.field4759 / 4);
            if (var9 < 1) {
                var9 = 1;
            }
            class205 var10 = new class205(var9);
            class300[] var11 = new class300[this.field4758];
            for (int var12 = 0; var12 < super.field2505; ++var12) {
                for (int var32 = 0; ~var32 > ~super.field2503; ++var32) {
                    if (this.field4734[var12][var32] != null) {
                        class300[] var33 = this.field4726[var12][var32];
                        int[] var34 = this.field4736[var12][var32];
                        int[] var35 = this.field4743[var12][var32];
                        int[] var36 = this.field4744[var12][var32];
                        int[] var37 = this.field4734[var12][var32];
                        int[] var38 = this.field4749 == null ? null : this.field4749[var12][var32];
                        if (var36 == null) {
                            var36 = var37;
                        }
                        int[] var39 = this.field4735 != null ? this.field4735[var12][var32] : null;
                        float var40 = this.field4763[var12][var32];
                        float var41 = this.field4764[var12][var32];
                        float var42 = this.field4757[var12][var32];
                        float var43 = this.field4763[var12][var32 + 1];
                        float var44 = this.field4764[var12][var32 - -1];
                        float var45 = this.field4757[var12][var32 + 1];
                        float var46 = this.field4763[var12 + 1][var32 + 1];
                        float var47 = this.field4764[var12 + 1][var32 + 1];
                        float var48 = this.field4757[var12 + 1][var32 - -1];
                        float var49 = this.field4763[var12 - -1][var32];
                        float var50 = this.field4764[var12 + 1][var32];
                        float var51 = this.field4757[var12 + 1][var32];
                        int var52 = var1[var12][var32] & 255;
                        int var53 = var1[var12][var32 - -1] & 255;
                        int var54 = var1[var12 + 1][var32 + 1] & 255;
                        int var55 = 255 & var1[var12 + 1][var32];
                        int var56 = 0;
                        label360: for (int var57 = 0; var57 < var37.length; ++var57) {
                            class300 var103 = var33[var57];
                            for (int var104 = 0; var104 < var56; ++var104) {
                                if (var11[var104] == var103) {
                                    continue label360;
                                }
                            }
                            var11[var56++] = var103;
                        }
                        short[] var58 = this.field4721[super.field2505 * var32 + var12] = new short[var37.length];
                        for (int var59 = 0; var59 < var37.length; ++var59) {
                            int var60 = (var12 << super.field2506) - -var34[var59];
                            int var61 = (var32 << super.field2506) + var35[var59];
                            int var62 = var60 >> this.field4730;
                            int var63 = var61 >> this.field4730;
                            int var64 = var37[var59];
                            int var65 = var36[var59];
                            int var66 = var38 != null ? var38[var59] : 0;
                            long var67 = (long) var63 | (long) var65 << 48 | (long) var64 << 32 | (long) (var62 << 16);
                            int var69 = var34[var59];
                            int var70 = var35[var59];
                            byte var71 = 74;
                            int var72 = 0;
                            float var73 = 1.0F;
                            float var74;
                            float var75;
                            int var76;
                            float var77;
                            if (~var69 == -1 && ~var70 == -1) {
                                var74 = var40;
                                var75 = var41;
                                var76 = var71 - var52;
                                var77 = var42;
                            } else if (var69 == 0 && ~super.field2504 == ~var70) {
                                var75 = var44;
                                var76 = var71 - var53;
                                var77 = var45;
                                var74 = var43;
                            } else if (~super.field2504 == ~var69 && ~super.field2504 == ~var70) {
                                var76 = var71 - var54;
                                var75 = var47;
                                var77 = var48;
                                var74 = var46;
                            } else if (~super.field2504 == ~var69 && ~var70 == -1) {
                                var74 = var49;
                                var77 = var51;
                                var76 = var71 - var55;
                                var75 = var50;
                            } else {
                                float var78 = (float) var69 / (float) super.field2504;
                                float var79 = (float) var70 / (float) super.field2504;
                                float var80 = (-var40 + var49) * var78 + var40;
                                float var81 = (-var41 + var50) * var78 + var41;
                                float var82 = (var51 - var42) * var78 + var42;
                                float var83 = (var46 - var43) * var78 + var43;
                                float var84 = (-var44 + var47) * var78 + var44;
                                float var85 = (var48 - var45) * var78 + var45;
                                var75 = (-var81 + var84) * var79 + var81;
                                var74 = (var83 - var80) * var79 + var80;
                                var77 = (var85 - var82) * var79 + var82;
                                int var86 = ((var55 - var52) * var69 >> super.field2506) + var52;
                                int var87 = ((-var53 + var54) * var69 >> super.field2506) + var53;
                                var76 = var71 - (((-var86 + var87) * var70 >> super.field2506) + var86);
                            }
                            if (var64 != -1) {
                                int var88 = (var64 & 127) * var76 >> 7;
                                if (~var88 <= -3) {
                                    if (~var88 < -127) {
                                        var88 = 126;
                                    }
                                } else {
                                    var88 = 2;
                                }
                                if ((7 & this.field4727) == 0) {
                                    float var89 = this.field4729.field5470[2] * var77 + this.field4729.field5470[1] * var75 + this.field4729.field5470[0] * var74;
                                    var73 = this.field4729.field5469 + (var89 > 0.0F ? this.field4729.field5475 : this.field4729.field5456) * var89;
                                }
                                var72 = class118.field1940[var88 | 65408 & var64];
                            }
                            class176 var90 = null;
                            if (~(this.field4724 - 1 & var60) == -1 && (var61 & this.field4724 + -1) == 0) {
                                var90 = var10.method1242(0, var67);
                            }
                            int var91;
                            if (var90 != null) {
                                var58[var59] = ((class486) var90).field6828;
                                var91 = 65535 & var58[var59];
                                if (~var64 != 0 && var8[var91].field2524 > var33[var59].field2524) {
                                    var8[var91] = var33[var59];
                                }
                            } else {
                                int var92;
                                if (~var64 == ~var65) {
                                    var92 = var72;
                                } else {
                                    int var93 = (127 & var65) * var76 >> 7;
                                    if (var93 >= 2) {
                                        if (~var93 < -127) {
                                            var93 = 126;
                                        }
                                    } else {
                                        var93 = 2;
                                    }
                                    var92 = class118.field1940[65408 & var65 | var93];
                                    if (~(this.field4727 & 7) == -1) {
                                        float var94 = this.field4729.field5470[2] * var77 + this.field4729.field5470[1] * var75 + this.field4729.field5470[0] * var74;
                                        float var95 = (var73 > 0.0F ? this.field4729.field5475 : this.field4729.field5456) * var73 + this.field4729.field5469;
                                        int var96 = var92 >> 16 & 255;
                                        int var97 = 255 & var92 >> 8;
                                        int var98 = var92 & 255;
                                        int var99 = (int) ((float) var96 * var95);
                                        int var100 = (int) ((float) var97 * var95);
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (var99 > 255) {
                                            var99 = 255;
                                        }
                                        if (var100 < 0) {
                                            var100 = 0;
                                        } else if (~var100 < -256) {
                                            var100 = 255;
                                        }
                                        int var101 = (int) ((float) var98 * var95);
                                        if (~var101 > -1) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        var92 = var100 << 8 | var99 << 16 | var101;
                                    }
                                }
                                if (Stream.method3294()) {
                                    var7.method3289((float) var60);
                                    var7.method3289((float) (this.method1105(var60, var61) - -var66));
                                    var7.method3289((float) var61);
                                    var7.method3289((float) var60);
                                    var7.method3289((float) var61);
                                    if (this.field4735 != null) {
                                        var7.method3289((float) (var39 != null ? var39[var59] + -1 : 0));
                                    }
                                    if (~(this.field4727 & 7) != -1) {
                                        var7.method3289(var74);
                                        var7.method3289(var75);
                                        var7.method3289(var77);
                                    }
                                } else {
                                    var7.method3293((float) var60);
                                    var7.method3293((float) (this.method1105(var60, var61) + var66));
                                    var7.method3293((float) var61);
                                    var7.method3293((float) var60);
                                    var7.method3293((float) var61);
                                    if (this.field4735 != null) {
                                        var7.method3293((float) (var39 == null ? 0 : var39[var59] + -1));
                                    }
                                    if ((7 & this.field4727) != 0) {
                                        var7.method3293(var74);
                                        var7.method3293(var75);
                                        var7.method3293(var77);
                                    }
                                }
                                if (this.field4729.field5417 != 0) {
                                    var7.method3295(-16777216 | var92);
                                } else {
                                    var7.method3300(-16777216 | var92);
                                }
                                var91 = this.field4740++;
                                var58[var59] = (short) var91;
                                if (var64 != -1) {
                                    var8[var91] = var33[var59];
                                }
                                var10.method1241(new class486(var58[var59]), var67, -105);
                            }
                            for (int var102 = 0; ~var102 > ~var56; ++var102) {
                                var11[var102].method1913(var72, var76, 65535, var91, var73);
                            }
                            ++this.field4722;
                        }
                    }
                }
            }
            for (int var13 = 0; this.field4740 > var13; ++var13) {
                class300 var31 = var8[var13];
                if (var31 != null) {
                    var31.method1912(4, var13);
                }
            }
            for (int var14 = 0; ~var14 > ~super.field2505; ++var14) {
                for (int var20 = 0; ~var20 > ~super.field2503; ++var20) {
                    short[] var21 = this.field4721[super.field2505 * var20 + var14];
                    if (var21 != null) {
                        int var22 = 0;
                        int var23 = 0;
                        while (~var23 > ~var21.length) {
                            int var24 = var21[var23++] & 65535;
                            int var25 = var21[var23++] & 65535;
                            int var26 = 65535 & var21[var23++];
                            class300 var27 = var8[var24];
                            class300 var28 = var8[var25];
                            class300 var29 = var8[var26];
                            class300 var30 = null;
                            if (var27 != null) {
                                var30 = var27;
                                var27.method1911(var22, var20, var14, 255);
                            }
                            if (var28 != null) {
                                var28.method1911(var22, var20, var14, 255);
                                if (var30 == null || var30.field2524 > var28.field2524) {
                                    var30 = var28;
                                }
                            }
                            if (var29 != null) {
                                var29.method1911(var22, var20, var14, 255);
                                if (var30 == null || var29.field2524 < var30.field2524) {
                                    var30 = var29;
                                }
                            }
                            if (var30 != null) {
                                if (var27 != null) {
                                    var30.method1912(4, var24);
                                }
                                if (var28 != null) {
                                    var30.method1912(4, var25);
                                }
                                if (var29 != null) {
                                    var30.method1912(4, var26);
                                }
                                var30.method1911(var22, var20, var14, 255);
                            }
                            ++var22;
                        }
                    }
                }
            }
            var7.method3288();
            this.field4765 = this.field4729.method1644((byte) 115, false);
            this.field4765.method617(-56, var5, this.field4740 * var5, var6);
            if ((this.field4727 & 7) != 0) {
                if (this.field4735 != null) {
                    this.field4766 = this.field4729.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447, class94.field1446, class94.field1443, class94.field1445 }) }, false);
                    this.field4760 = this.field4729.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447, class94.field1446, class94.field1443 }), new class14(class94.field1445) }, false);
                } else {
                    this.field4766 = this.field4729.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447, class94.field1443, class94.field1445 }) }, false);
                    this.field4760 = this.field4729.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447, class94.field1443 }), new class14(class94.field1445) }, false);
                }
            } else if (this.field4735 == null) {
                this.field4766 = this.field4729.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447, class94.field1445 }) }, false);
                this.field4760 = this.field4729.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447 }), new class14(class94.field1445) }, false);
            } else {
                this.field4766 = this.field4729.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447, class94.field1446, class94.field1445 }) }, false);
                this.field4760 = this.field4729.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447, class94.field1446 }), new class14(class94.field1445) }, false);
            }
            int var15 = 0;
            for (int var16 = 0; ~var3.length < ~var16; ++var16) {
                if (~var3[var16].field4109 < -1) {
                    var3[var15++] = var3[var16];
                }
            }
            this.field4762 = new class300[var15];
            long[] var17 = new long[var15];
            for (int var18 = 0; ~var15 < ~var18; ++var18) {
                class300 var19 = var3[var18];
                var17[var18] = var19.field2524;
                this.field4762[var18] = var19;
                var19.method1914(this.field4740, (byte) 89);
            }
            class233.method1468(this.field4762, var17, -1);
            if (this.field4723 != null) {
                this.field4723.method2799((byte) -92);
            }
        } else {
            this.field4723 = null;
        }
        this.field4735 = null;
        this.field4749 = null;
        this.field4736 = this.field4743 = null;
        this.field4761 = null;
        this.field4763 = this.field4764 = this.field4757 = null;
        this.field4726 = null;
        this.field4734 = null;
        this.field4767 = null;
        this.field4744 = null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "([I[Ljava/lang/Object;B)V")
    public static final void method2112(int[] arg0, Object[] arg1, byte arg2) {
        ++field4732;
        class160.method1025(arg1, arg0, 0, arg0.length + -1, (byte) 67);
        if (arg2 > -45) {
            field4738 = false;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIBI[[ZZI)V")
    private final void method2113(int arg0, int arg1, byte arg2, int arg3, boolean[][] arg4, boolean arg5, int arg6) {
        if (arg2 >= 70) {
            if (this.field4762 != null) {
                int var8 = arg0 - -1 + arg0;
                int var9 = var8 * var8;
                if (var9 > class165.field2378.length) {
                    class165.field2378 = new int[var9];
                }
                int var10 = arg6 - arg0;
                int var11 = var10;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var12 = arg1 - arg0;
                int var13 = var12;
                if (~var12 > -1) {
                    var12 = 0;
                }
                int var14 = arg0 + arg6;
                if (~var14 < ~(super.field2505 - 1)) {
                    var14 = super.field2505 - 1;
                }
                int var15 = arg0 + arg1;
                class336.field4481 = 0;
                if (~var15 < ~(super.field2503 - 1)) {
                    var15 = super.field2503 + -1;
                }
                for (int var16 = var10; ~var16 >= ~var14; ++var16) {
                    boolean[] var23 = arg4[-var11 + var16];
                    for (int var24 = var12; ~var24 >= ~var15; ++var24) {
                        if (var23[var24 - var13]) {
                            class165.field2378[class336.field4481++] = super.field2505 * var24 + var16;
                        }
                    }
                }
                if (arg3 == -1) {
                    this.field4729.method2279(-20873);
                } else {
                    this.field4729.method2283((float) arg3, (byte) 42);
                    this.field4729.method2338((byte) -125);
                }
                this.field4729.method2339(30101);
                this.field4729.method2276(~(7 & this.field4727) != -1, -8);
                this.field4729.method2344((byte) 40, -1, false, false);
                this.field4729.method1607(this.field4765, 0, false);
                for (int var17 = 0; this.field4762.length > var17; ++var17) {
                    this.field4762[var17].method1906(-41, class336.field4481, class165.field2378);
                }
                class557 var18 = this.field4729.method2342((byte) -92);
                var18.method1054(0, -1, 0);
                this.field4729.method2286(21838);
                if (!this.field4753.method466((byte) 87)) {
                    int var19 = this.field4729.field5460;
                    int var20 = this.field4729.field5398;
                    this.field4729.method1334(0, var20, this.field4729.field5423);
                    this.field4729.method2276(false, -8);
                    this.field4729.method2275(-32491, false);
                    this.field4729.method2317(128, 9);
                    this.field4729.method2344((byte) 74, -2, false, false);
                    this.field4729.method2267(2, this.field4729.field5407);
                    this.field4729.method2313(class137.field2155, -24, class167.field2417);
                    this.field4729.method2315(class610.field8770, 0, 8);
                    this.field4729.method2326(88, 0, class453.field6402);
                    for (class176 var21 = this.field4753.method456((byte) -68); var21 != null; var21 = this.field4753.method460((byte) -101)) {
                        class110 var22 = (class110) var21;
                        var22.method771(arg1, arg4, (byte) -127, arg6, arg0);
                    }
                    this.field4729.method2315(class583.field8185, 0, 8);
                    this.field4729.method2326(103, 0, class583.field8185);
                    this.field4729.method2267(2, (class445) null);
                    this.field4729.method1334(var19, var20, this.field4729.field5423);
                }
                if (this.field4723 != null) {
                    this.field4729.method1607(this.field4765, 0, false);
                    this.field4729.method1609(this.field4766, 118);
                    this.field4723.method2801(arg1, -128, arg4, arg0, arg6, arg5);
                }
            }
            ++field4751;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1099(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2113(arg2, arg1, (byte) 78, -1, arg3, arg4, arg0);
        ++field4728;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILiba;BI)V")
    private final void method2114(int arg0, class452 arg1, byte arg2, int arg3) {
        ++field4755;
        int[] var5 = this.field4736[arg0][arg3];
        int[] var6 = this.field4743[arg0][arg3];
        int var7 = var5.length;
        if (arg2 != 68) {
            method2112((int[]) null, (Object[]) null, (byte) -61);
        }
        if (~class33.field552.length > ~var7) {
            class33.field552 = new int[var7];
            class220.field3148 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class33.field552[var8] = var5[var8] >> this.field4729.field5394;
            class220.field3148[var8] = var6[var8] >> this.field4729.field5394;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class33.field552[var9];
            int var11 = class220.field3148[var9++];
            int var12 = class33.field552[var9];
            int var13 = class220.field3148[var9++];
            int var14 = class33.field552[var9];
            int var15 = class220.field3148[var9++];
            if ((var10 - var12) * (-var15 + var13) - (-var11 + var13) * (-var12 + var14) > 0) {
                arg1.method2652(1685686832, var13, var10, var11, var12, var14, var15);
            }
        }
    }
}
