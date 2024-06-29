import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class460 extends class542 {

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
    private int field6654 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
    private int field6655 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "Lfea;")
    private class47 field6656 = new class47();

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "[[I")
    private int[][] field6638;

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "Lnd;")
    public class632 field6657;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    private int field6652;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "[[[I")
    private int[][][] field6639;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "[[[I")
    public int[][][] field6624;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "[[B")
    private byte[][] field6636;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "[[F")
    private float[][] field6658;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "[[[I")
    private int[][][] field6621;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "[[S")
    public short[][] field6650;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    public int field6653;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    private int field6641;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "[[[Les;")
    private class575[][][] field6625;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "[[[I")
    public int[][][] field6642;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "[[F")
    private float[][] field6662;

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "[[F")
    private float[][] field6661;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "[[[I")
    private int[][][] field6627;

    @OriginalMember(owner = "client!hm", name = "db", descriptor = "[[B")
    private byte[][] field6666;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "Lcb;")
    private class78 field6659;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "Lhg;")
    private class448 field6644;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Lbv;")
    public static class567 field6630 = new class567("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    private int field6626;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    private int field6648;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
    private int field6663;

    @OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
    private int field6667;

    @OriginalMember(owner = "client!hm", name = "fb", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "Lup;")
    private class342 field6660;

    @OriginalMember(owner = "client!hm", name = "gb", descriptor = "Lup;")
    private class342 field6669;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "Lws;")
    public class530 field6664;

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "[Les;")
    private class575[] field6665;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "[[[I")
    private int[][][] field6632;

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lnd;IIII[[I[[II)V")
    public class460(class632 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field6638 = arg5;
        this.field6657 = arg0;
        this.field6652 = super.field7537 + -2;
        this.field6639 = new int[arg3][arg4][];
        this.field6624 = new int[arg3][arg4][];
        this.field6636 = new byte[arg3][arg4];
        this.field6658 = new float[super.field7541 + 1][super.field7539 + 1];
        this.field6621 = new int[arg3][arg4][];
        this.field6650 = new short[arg3 * arg4][];
        this.field6653 = arg2;
        this.field6641 = 1 << this.field6652;
        this.field6625 = new class575[arg3][arg4][];
        this.field6642 = new int[arg3][arg4][];
        this.field6662 = new float[super.field7541 + 1][super.field7539 + 1];
        this.field6661 = new float[super.field7541 + 1][super.field7539 + 1];
        this.field6627 = new int[arg3][arg4][];
        this.field6666 = new byte[arg3 - -1][arg4 + 1];
        for (int var9 = 0; ~super.field7539 <= ~var9; ++var9) {
            for (int var10 = 0; var10 <= super.field7541; ++var10) {
                int var11 = this.field6638[var10][var9];
                if (~var11 > ~this.field6654) {
                    this.field6654 = var11;
                }
                if (~var11 < ~this.field6655) {
                    this.field6655 = var11;
                }
                if (~var10 < -1 && ~var9 < -1 && super.field7541 > var10 && ~var9 > ~super.field7539) {
                    int var12 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 - -(arg7 * 4 * arg7))));
                    this.field6661[var10][var9] = (float) var12 * var14;
                    this.field6662[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field6658[var10][var9] = (float) var13 * var14;
                }
            }
        }
        this.field6659 = new class78(128);
        if ((this.field6653 & 16) != 0) {
            this.field6644 = new class448(this.field6657, this);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6649;
        if (this.field6667 > 0) {
            class620 var9 = this.field6657.method3637(this.field6648, 2);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method251(true, (byte) 60);
                if (var14 != null) {
                    Stream var15 = this.field6657.method3588(var14, (byte) 93);
                    if (!Stream.method3248()) {
                        for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                            int var17 = super.field7541 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field6650[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var19.length > var20; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            var15.method3238(var21);
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                            ++var10;
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field7541 * var22 + arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][var22 - arg4]) {
                                    short[] var27 = this.field6650[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                            var15.method3244(var29);
                                            if (var11 > var29) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3246();
                    if (var9.method245(-11359)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field6657.method3597(true);
                this.field6657.method3604(false, 121);
                this.field6657.method3630((byte) 62, false);
                this.field6657.method3622(false, (byte) 43);
                this.field6657.method3623(false, 118);
                this.field6657.method3624(-79, 0);
                this.field6657.method3568(-2, 14511, false, false);
                this.field6657.method3577((class96) null, true);
                class516 var23 = this.field6657.method3617(-57);
                float[] var24 = this.field6657.method3647(-62);
                var24[8] = 0.0F;
                var24[11] = 0.0F;
                var24[6] = 0.0F;
                var24[3] = 0.0F;
                var24[4] = 0.0F;
                var24[2] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6657.field8892;
                var24[5] = (float) arg2 / ((float) super.field7544 * 128.0F * (float) this.field6657.field8892);
                var24[0] = (float) arg2 / ((float) super.field7544 * 128.0F * (float) this.field6657.field8972);
                var24[10] = 1.0F / (float) (-this.field6654 + this.field6655);
                var24[7] = 0.0F;
                var24[9] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6657.field8972) + -1.0F;
                var24[14] = (float) (-this.field6654 / (-this.field6654 + this.field6655));
                var24[1] = 0.0F;
                var24[15] = 1.0F;
                var23.method2898(0.0F, 0.0F, 0, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F);
                this.field6657.method3602(-13);
                this.field6657.method3579(121);
                if ((this.field6653 & 7) == 0) {
                    this.field6657.method3630((byte) 73, false);
                } else {
                    this.field6657.method3630((byte) 76, true);
                    this.field6657.method138(7);
                }
                this.field6657.method105(20636, false);
                this.field6657.method152(0, this.field6669, 125);
                this.field6657.method152(1, this.field6660, 66);
                this.field6657.method114(this.field6664, (byte) -84);
                this.field6657.method134(class12.field118, 0, -var11 + var12 - -1, var10 / 3, var9, 10, var11);
                this.field6657.method105(20636, true);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method698(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field6621 == null) {
            this.field6621 = new int[super.field7541][super.field7539][];
        }
        ++field6634;
        if (arg5 != null && this.field6632 == null) {
            this.field6632 = new int[super.field7541][super.field7539][];
        }
        this.field6624[arg0][arg1] = arg2;
        this.field6642[arg0][arg1] = arg4;
        this.field6639[arg0][arg1] = arg6;
        this.field6627[arg0][arg1] = arg7;
        if (this.field6632 != null) {
            this.field6632[arg0][arg1] = arg5;
        }
        if (this.field6621 != null) {
            this.field6621[arg0][arg1] = arg3;
        }
        class575[] var15 = this.field6625[arg0][arg1] = new class575[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14);
            class108 var19;
            for (var19 = this.field6659.method740(0, var17); var19 != null; var19 = this.field6659.method741(-1)) {
                class575 var20 = (class575) var19;
                if (~arg8[var16] == ~var20.field8196 && (float) arg9[var16] == var20.field8198 && ~var20.field8182 == ~arg10 && ~var20.field8200 == ~arg11 && var20.field8192 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class575) var19;
            } else {
                var15[var16] = new class575(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field6659.method737(var17, (byte) 92, var15[var16]);
            }
        }
        if (arg13) {
            this.field6636[arg0][arg1] = (byte) class188.method1258(this.field6636[arg0][arg1], 1);
        }
        if (~this.field6663 > ~arg6.length) {
            this.field6663 = arg6.length;
        }
        this.field6667 += arg6.length;
    }

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method697(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6651;
        if (this.field6644 != null && arg0 != null) {
            int var7 = -(this.field6657.field9075 * arg2 >> 8) + arg1 >> this.field6657.field9140;
            int var8 = arg3 - (this.field6657.field9150 * arg2 >> 8) >> this.field6657.field9140;
            this.field6644.method2648(var8, var7, arg0, (byte) -86);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method686(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6623;
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
        for (int var28 = 0; var18 > var28; ++var28) {
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
        this.method698(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "(IILk;)Lk;")
    public final class88 method692(int arg0, int arg1, class88 arg2) {
        ++field6646;
        if (~(this.field6636[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field7544 >> this.field6657.field9140;
            class444 var5 = (class444) arg2;
            class444 var6;
            if (var5 != null && var5.method2623(-1985202301, var4, var4)) {
                var6 = var5;
                var5.method2620(2002041936);
            } else {
                var6 = new class444(this.field6657, var4, var4);
            }
            var6.method2626(0, 0, 0, var4, var4);
            this.method2693((byte) -110, var6, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "()V")
    public final void method701() {
        if (~this.field6667 >= -1) {
            this.field6644 = null;
        } else {
            byte[][] var1 = new byte[super.field7541 - -1][super.field7539 + 1];
            for (int var2 = 1; ~super.field7541 < ~var2; ++var2) {
                for (int var107 = 1; super.field7539 > var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field6666[var2][var107 + -1] >> 2) + (this.field6666[var2 - 1][var107] >> 2) + (this.field6666[var2 + 1][var107] >> 3) + (this.field6666[var2][var107 + 1] >> 3) + (this.field6666[var2][var107] >> 1));
                }
            }
            class575[] var3 = new class575[this.field6659.method742(116)];
            this.field6659.method744(var3, (byte) -105);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method3293((byte) 110, this.field6667);
            }
            int var5 = 20;
            if (this.field6632 != null) {
                var5 += 4;
            }
            if (~(this.field6653 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field6657.field8915.method3233(this.field6667 * 4, false);
            NativeHeapBuffer var7 = this.field6657.field8915.method3233(this.field6667 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class575[] var10 = new class575[this.field6667];
            int var11 = class19.method216(this.field6667 / 4, (byte) -21);
            if (~var11 > -2) {
                var11 = 1;
            }
            class78 var12 = new class78(var11);
            class575[] var13 = new class575[this.field6663];
            for (int var14 = 0; ~var14 > ~super.field7541; ++var14) {
                for (int var34 = 0; ~super.field7539 < ~var34; ++var34) {
                    if (this.field6639[var14][var34] != null) {
                        class575[] var35 = this.field6625[var14][var34];
                        int[] var36 = this.field6624[var14][var34];
                        int[] var37 = this.field6642[var14][var34];
                        int[] var38 = this.field6627[var14][var34];
                        int[] var39 = this.field6639[var14][var34];
                        int[] var40 = this.field6621 != null ? this.field6621[var14][var34] : null;
                        int[] var41 = this.field6632 == null ? null : this.field6632[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field6661[var14][var34];
                        float var43 = this.field6662[var14][var34];
                        float var44 = this.field6658[var14][var34];
                        float var45 = this.field6661[var14][var34 + 1];
                        float var46 = this.field6662[var14][var34 - -1];
                        float var47 = this.field6658[var14][var34 - -1];
                        float var48 = this.field6661[var14 + 1][var34 + 1];
                        float var49 = this.field6662[var14 + 1][var34 + 1];
                        float var50 = this.field6658[var14 + 1][var34 + 1];
                        float var51 = this.field6661[var14 + 1][var34];
                        float var52 = this.field6662[var14 + 1][var34];
                        float var53 = this.field6658[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = 255 & var1[var14 + 1][var34 - -1];
                        int var57 = var1[var14 - -1][var34] & 255;
                        int var58 = 0;
                        label361: for (int var59 = 0; var39.length > var59; ++var59) {
                            class575 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label361;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field6650[super.field7541 * var34 - -var14] = new short[var39.length];
                        for (int var61 = 0; var61 < var39.length; ++var61) {
                            int var62 = (var14 << super.field7537) + var36[var61];
                            int var63 = (var34 << super.field7537) + var37[var61];
                            int var64 = var62 >> this.field6652;
                            int var65 = var63 >> this.field6652;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var66 << 32 | (long) var67 << 48;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            float var76;
                            int var77;
                            float var78;
                            if (var71 == 0 && ~var72 == -1) {
                                var75 = var42;
                                var76 = var44;
                                var77 = var73 - var54;
                                var78 = var43;
                            } else if (var71 == 0 && super.field7544 == var72) {
                                var76 = var47;
                                var78 = var46;
                                var75 = var45;
                                var77 = var73 - var55;
                            } else if (~super.field7544 == ~var71 && ~super.field7544 == ~var72) {
                                var75 = var48;
                                var76 = var50;
                                var78 = var49;
                                var77 = var73 - var56;
                            } else if (super.field7544 == var71 && var72 == 0) {
                                var77 = var73 - var57;
                                var76 = var53;
                                var75 = var51;
                                var78 = var52;
                            } else {
                                float var79 = (float) var71 / (float) super.field7544;
                                float var80 = (float) var72 / (float) super.field7544;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var75 = (-var81 + var84) * var80 + var81;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var78 = (-var82 + var85) * var80 + var82;
                                var76 = (-var83 + var86) * var80 + var83;
                                int var87 = var54 - -((-var54 + var57) * var71 >> super.field7537);
                                int var88 = ((-var55 + var56) * var71 >> super.field7537) + var55;
                                var77 = var73 - (var87 - -((-var87 + var88) * var72 >> super.field7537));
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var77 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                if (~(this.field6653 & 7) == -1) {
                                    float var91 = this.field6657.field9069[2] * var76 + this.field6657.field9069[0] * var75 + this.field6657.field9069[1] * var78;
                                    var89 = this.field6657.field9141 + (!(var91 > 0.0F) ? this.field6657.field9117 : this.field6657.field9121) * var91;
                                }
                                var74 = class220.field3297[var90 | 65408 & var66];
                            }
                            class108 var92 = null;
                            if (~(this.field6641 + -1 & var62) == -1 && ~(var63 & this.field6641 + -1) == -1) {
                                var92 = var12.method740(0, var69);
                            }
                            int var103;
                            if (var92 == null) {
                                int var93;
                                if (var66 == var67) {
                                    var93 = var74;
                                } else {
                                    int var94 = (127 & var67) * var77 >> 7;
                                    if (var94 >= 2) {
                                        if (var94 > 126) {
                                            var94 = 126;
                                        }
                                    } else {
                                        var94 = 2;
                                    }
                                    var93 = class220.field3297[var67 & 65408 | var94];
                                    if ((this.field6653 & 7) == 0) {
                                        float var95 = this.field6657.field9069[2] * var76 + this.field6657.field9069[0] * var75 + this.field6657.field9069[1] * var78;
                                        float var96 = this.field6657.field9141 + var89 * (var89 > 0.0F ? this.field6657.field9121 : this.field6657.field9117);
                                        int var97 = (var93 & 16769057) >> 16;
                                        int var98 = 255 & var93 >> 8;
                                        int var99 = (int) ((float) var97 * var96);
                                        int var100 = var93 & 255;
                                        int var101 = (int) ((float) var98 * var96);
                                        if (var99 < 0) {
                                            var99 = 0;
                                        } else if (~var99 < -256) {
                                            var99 = 255;
                                        }
                                        if (~var101 > -1) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var100 * var96);
                                        if (var102 >= 0) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        var93 = var102 | var99 << 16 | var101 << 8;
                                    }
                                }
                                if (Stream.method3248()) {
                                    var8.method3250((float) var62);
                                    var8.method3250((float) (this.method695(var62, var63) - -var68));
                                    var8.method3250((float) var63);
                                    var8.method3250((float) var62);
                                    var8.method3250((float) var63);
                                    if (this.field6632 != null) {
                                        var8.method3250((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field6653) != 0) {
                                        var8.method3250(var75);
                                        var8.method3250(var78);
                                        var8.method3250(var76);
                                    }
                                } else {
                                    var8.method3247((float) var62);
                                    var8.method3247((float) (this.method695(var62, var63) + var68));
                                    var8.method3247((float) var63);
                                    var8.method3247((float) var62);
                                    var8.method3247((float) var63);
                                    if (this.field6632 != null) {
                                        var8.method3247((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(7 & this.field6653) != -1) {
                                        var8.method3247(var75);
                                        var8.method3247(var78);
                                        var8.method3247(var76);
                                    }
                                }
                                if (~this.field6657.field9138 != -1) {
                                    var9.method3245(var93 | -16777216);
                                } else {
                                    var9.method3239(-16777216 | var93);
                                }
                                var103 = this.field6626++;
                                var60[var61] = (short) var103;
                                if (var66 != -1) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method737(var69, (byte) 92, new class495(var60[var61]));
                            } else {
                                var60[var61] = ((class495) var92).field6942;
                                var103 = 65535 & var60[var61];
                                if (var66 != -1 && var10[var103].field1798 > var35[var61].field1798) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var104 < var58; ++var104) {
                                var13[var104].method3292(var77, var103, -257, var89, var74);
                            }
                            ++this.field6648;
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < this.field6626; ++var15) {
                class575 var33 = var10[var15];
                if (var33 != null) {
                    var33.method3294(var15, true);
                }
            }
            for (int var16 = 0; var16 < super.field7541; ++var16) {
                for (int var22 = 0; ~super.field7539 < ~var22; ++var22) {
                    short[] var23 = this.field6650[super.field7541 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var25 < var23.length) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class575 var29 = var10[var26];
                            class575 var30 = var10[var27];
                            class575 var31 = var10[var28];
                            class575 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method3288(var22, var16, true, var24);
                            }
                            if (var30 != null) {
                                var30.method3288(var22, var16, true, var24);
                                if (var32 == null || var30.field1798 < var32.field1798) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method3288(var22, var16, true, var24);
                                if (var32 == null || var31.field1798 < var32.field1798) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method3294(var26, true);
                                }
                                if (var30 != null) {
                                    var32.method3294(var27, true);
                                }
                                if (var31 != null) {
                                    var32.method3294(var28, true);
                                }
                                var32.method3288(var22, var16, true, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3246();
            var9.method3246();
            this.field6660 = this.field6657.method128(16240, false);
            this.field6660.method1344(-17817, var6, this.field6626 * 4, 4);
            this.field6669 = this.field6657.method128(16240, false);
            this.field6669.method1344(-17817, var7, this.field6626 * var5, var5);
            if (~(this.field6653 & 7) == -1) {
                if (this.field6632 != null) {
                    this.field6664 = this.field6657.method87(false, new class58[] { new class58(new class109[] { class109.field1807, class109.field1819, class109.field1818 }), new class58(class109.field1817) });
                } else {
                    this.field6664 = this.field6657.method87(false, new class58[] { new class58(new class109[] { class109.field1807, class109.field1819 }), new class58(class109.field1817) });
                }
            } else if (this.field6632 != null) {
                this.field6664 = this.field6657.method87(false, new class58[] { new class58(new class109[] { class109.field1807, class109.field1819, class109.field1818, class109.field1813 }), new class58(class109.field1817) });
            } else {
                this.field6664 = this.field6657.method87(false, new class58[] { new class58(new class109[] { class109.field1807, class109.field1819, class109.field1813 }), new class58(class109.field1817) });
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (~var3[var18].field8199 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field6665 = new class575[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class575 var21 = var3[var20];
                var19[var20] = var21.field1798;
                this.field6665[var20] = var21;
                var21.method3289(this.field6626, 4);
            }
            class522.method2946(83, var19, this.field6665);
            if (this.field6644 != null) {
                this.field6644.method2652(62);
            }
        }
        ++field6631;
        this.field6621 = null;
        this.field6627 = null;
        this.field6639 = null;
        this.field6624 = this.field6642 = null;
        this.field6625 = null;
        this.field6632 = null;
        this.field6661 = this.field6662 = this.field6658 = null;
        this.field6659 = null;
        this.field6666 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Luca;[I)V")
    public final void method687(class637 arg0, int[] arg1) {
        ++field6628;
        this.field6656.method414(new class499(this.field6657, this, arg0, arg1), (byte) 122);
    }

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "(III)V")
    public final void method699(int arg0, int arg1, int arg2) {
        ++field6633;
        if (arg2 > (this.field6666[arg0][arg1] & 255)) {
            this.field6666[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILjava/lang/Class;)Ltv;")
    public static final class360 method2691(int arg0, int arg1, int arg2, Class arg3) {
        class184 var4 = class277.field4051[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class277 var5 = var4.field2675; var5 != null; var5 = var5.field4045) {
                class360 var6 = var5.field4044;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field5117 == arg1 && var6.field5113 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lae;I)[Lmh;")
    public static final class145[] method2692(class40 arg0, int arg1) {
        ++field6620;
        if (!arg0.method350(-40)) {
            return new class145[0];
        } else {
            class329 var2 = arg0.method357((byte) -97);
            int var3 = 123 / ((4 - arg1) / 32);
            while (~var2.field4739 == -1) {
                class210.method1342(-101, 10L);
            }
            if (var2.field4739 == 2) {
                return new class145[0];
            } else {
                int[] var4 = (int[]) var2.field4737;
                class145[] var5 = new class145[var4.length >> 2];
                for (int var6 = 0; ~var6 > ~var5.length; ++var6) {
                    class145 var7 = new class145();
                    var5[var6] = var7;
                    var7.field2236 = var4[var6 << 2];
                    var7.field2237 = var4[(var6 << 2) + 1];
                    var7.field2234 = var4[(var6 << 2) + 2];
                    var7.field2238 = var4[(var6 << 2) + 3];
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III[[ZZ)V")
    public final void method691(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field6643;
        this.method2695(-8634, arg0, -1, arg4, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!hm", name = "ba", descriptor = "(II)I")
    public final int method694(int arg0, int arg1) {
        ++field6635;
        return this.field6638[arg0][arg1];
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLlo;II)V")
    private final void method2693(byte arg0, class444 arg1, int arg2, int arg3) {
        ++field6622;
        int[] var5 = this.field6624[arg3][arg2];
        if (arg0 >= -100) {
            this.field6641 = -87;
        }
        int[] var6 = this.field6642[arg3][arg2];
        int var7 = var5.length;
        if (class367.field5203.length < var7) {
            class151.field2284 = new int[var7];
            class367.field5203 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class367.field5203[var8] = var5[var8] >> this.field6657.field9140;
            class151.field2284[var8] = var6[var8] >> this.field6657.field9140;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class367.field5203[var9];
            int var11 = class151.field2284[var9++];
            int var12 = class367.field5203[var9];
            int var13 = class151.field2284[var9++];
            int var14 = class367.field5203[var9];
            int var15 = class151.field2284[var9++];
            if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                arg1.method2622(var11, var14, var13, var15, var12, var10, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method2694(int arg0, Throwable arg1) throws IOException {
        ++field6668;
        String var2;
        if (!(arg1 instanceof class146)) {
            var2 = "";
        } else {
            class146 var3 = (class146) arg1;
            arg1 = var3.field2241;
            var2 = var3.field2243 + " | ";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        if (arg0 > -80) {
            method2692((class40) null, -99);
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 != -1) {
                var12 = var9.substring(0, var10);
            } else {
                var12 = var9;
            }
            String var13 = var12.trim();
            String var14 = var13.substring(1 + var13.lastIndexOf(32));
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (~var10 != 0 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 - -5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIZII[[Z)V")
    private final void method2695(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean[][] arg6) {
        if (this.field6665 != null) {
            int var8 = arg4 - -arg4 + 1;
            int var9 = var8 * var8;
            if (~class42.field582.length > ~var9) {
                class42.field582 = new int[var9];
            }
            int var10 = -arg4 + arg1;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg4 + arg5;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg1 + arg4;
            if (~(super.field7541 + -1) > ~var14) {
                var14 = super.field7541 + -1;
            }
            int var15 = arg4 + arg5;
            class336.field4814 = 0;
            if (~var15 < ~(super.field7539 - 1)) {
                var15 = super.field7539 + -1;
            }
            for (int var16 = var10; var16 <= var14; ++var16) {
                boolean[] var23 = arg6[var16 - var11];
                for (int var24 = var12; var15 >= var24; ++var24) {
                    if (var23[-var13 + var24]) {
                        class42.field582[class336.field4814++] = super.field7541 * var24 - -var16;
                    }
                }
            }
            if (arg2 != -1) {
                this.field6657.method3605((float) arg2, (byte) 95);
                this.field6657.method3576(false);
            } else {
                this.field6657.method3594(8);
            }
            this.field6657.method3621(-107);
            this.field6657.method3630((byte) 111, (7 & this.field6653) != 0);
            this.field6657.method3568(-1, 14511, false, false);
            this.field6657.method152(0, this.field6669, arg0 ^ -8642);
            for (int var17 = 0; this.field6665.length > var17; ++var17) {
                this.field6665[var17].method3290(-47, class42.field582, class336.field4814);
            }
            class516 var18 = this.field6657.method3617(-128);
            var18.method884(0, -1, 0);
            this.field6657.method3579(97);
            if (!this.field6656.method424(2000)) {
                int var19 = this.field6657.field9102;
                int var20 = this.field6657.field9147;
                this.field6657.method562(0, var20, this.field6657.field9070);
                this.field6657.method3630((byte) 127, false);
                this.field6657.method3623(false, 118);
                this.field6657.method3624(-35, 128);
                this.field6657.method3568(-2, arg0 ^ -6423, false, false);
                this.field6657.method3577(this.field6657.field9119, true);
                this.field6657.method3583(false, class635.field9225, class634.field9219);
                this.field6657.method3601(-34, class104.field1753, 0);
                this.field6657.method3570(class371.field5369, 0, (byte) -76);
                for (class108 var21 = this.field6656.method427(true); var21 != null; var21 = this.field6656.method420(false)) {
                    class499 var22 = (class499) var21;
                    var22.method2842(arg1, arg4, arg6, 0, arg5);
                }
                this.field6657.method3601(arg0 + 8590, class477.field6813, 0);
                this.field6657.method3570(class477.field6813, 0, (byte) -113);
                this.field6657.method3577((class96) null, true);
                this.field6657.method562(var19, var20, this.field6657.field9070);
            }
            if (this.field6644 != null) {
                this.field6657.method152(0, this.field6669, 52);
                this.field6657.method152(1, this.field6660, 110);
                this.field6657.method114(this.field6664, (byte) -60);
                this.field6644.method2651(arg4, arg5, arg1, arg6, (byte) 87, arg3);
            }
        }
        if (arg0 != -8634) {
            this.field6641 = 13;
        }
        ++field6645;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
    public final void method693(int arg0, int arg1) {
        ++field6629;
    }

    @OriginalMember(owner = "client!hm", name = "aa", descriptor = "(II)I")
    public final int method695(int arg0, int arg1) {
        ++field6640;
        int var3 = arg0 >> super.field7537;
        int var4 = arg1 >> super.field7537;
        if (~var3 <= -1 && ~var4 <= -1 && ~(super.field7541 + -1) <= ~var3 && var4 <= super.field7539 + -1) {
            int var5 = arg0 & super.field7544 + -1;
            int var6 = arg1 & super.field7544 + -1;
            int var7 = (-var5 + super.field7544) * this.field6638[var3][var4] + this.field6638[var3 + 1][var4] * var5 >> super.field7537;
            int var8 = (-var5 + super.field7544) * this.field6638[var3][var4 - -1] + this.field6638[var3 + 1][var4 + 1] * var5 >> super.field7537;
            return (-var6 + super.field7544) * var7 + var6 * var8 >> super.field7537;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method690(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6637;
        if (this.field6644 != null && arg0 != null) {
            int var7 = -(this.field6657.field9075 * arg2 >> 8) + arg1 >> this.field6657.field9140;
            int var8 = -(this.field6657.field9150 * arg2 >> 8) + arg3 >> this.field6657.field9140;
            return this.field6644.method2650(var7, (byte) -21, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public static void method2696(int arg0) {
        if (arg0 != 7701) {
            field6630 = null;
        }
        field6630 = null;
    }

    @OriginalMember(owner = "client!hm", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method696(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6647;
        if (this.field6644 != null && arg0 != null) {
            int var7 = -(this.field6657.field9075 * arg2 >> 8) + arg1 >> this.field6657.field9140;
            int var8 = -(this.field6657.field9150 * arg2 >> 8) + arg3 >> this.field6657.field9140;
            this.field6644.method2649((byte) 121, var7, arg0, var8);
        }
    }
}
