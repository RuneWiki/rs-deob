import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class214 extends class37 {

    @OriginalMember(owner = "client!ida", name = "y", descriptor = "F")
    private float field3002 = -3.4028235E38F;

    @OriginalMember(owner = "client!ida", name = "v", descriptor = "F")
    private float field2999 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ida", name = "X", descriptor = "Lgca;")
    private class227 field3026 = new class227();

    @OriginalMember(owner = "client!ida", name = "D", descriptor = "Lnv;")
    public class382 field3007;

    @OriginalMember(owner = "client!ida", name = "V", descriptor = "I")
    private int field3024;

    @OriginalMember(owner = "client!ida", name = "ib", descriptor = "[[F")
    private float[][] field3037;

    @OriginalMember(owner = "client!ida", name = "t", descriptor = "I")
    private int field2997;

    @OriginalMember(owner = "client!ida", name = "T", descriptor = "[[B")
    private byte[][] field3022;

    @OriginalMember(owner = "client!ida", name = "C", descriptor = "[[[I")
    private int[][][] field3006;

    @OriginalMember(owner = "client!ida", name = "cb", descriptor = "[[F")
    private float[][] field3031;

    @OriginalMember(owner = "client!ida", name = "Z", descriptor = "[[F")
    private float[][] field3028;

    @OriginalMember(owner = "client!ida", name = "S", descriptor = "[[[I")
    public int[][][] field3021;

    @OriginalMember(owner = "client!ida", name = "B", descriptor = "[[[Las;")
    private class137[][][] field3005;

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "[[[I")
    public int[][][] field2992;

    @OriginalMember(owner = "client!ida", name = "J", descriptor = "[[[I")
    public int[][][] field3013;

    @OriginalMember(owner = "client!ida", name = "K", descriptor = "[[[I")
    private int[][][] field3014;

    @OriginalMember(owner = "client!ida", name = "ab", descriptor = "[[B")
    private byte[][] field3029;

    @OriginalMember(owner = "client!ida", name = "u", descriptor = "[[S")
    public short[][] field2998;

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!ida", name = "db", descriptor = "Lfaa;")
    private class139 field3032;

    @OriginalMember(owner = "client!ida", name = "W", descriptor = "Lg;")
    private class140 field3025;

    @OriginalMember(owner = "client!ida", name = "N", descriptor = "Z")
    public static boolean field3017 = false;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
    private int field2990;

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!ida", name = "r", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!ida", name = "s", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ida", name = "w", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ida", name = "x", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "I")
    private int field3003;

    @OriginalMember(owner = "client!ida", name = "A", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ida", name = "E", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ida", name = "G", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ida", name = "H", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ida", name = "I", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ida", name = "L", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ida", name = "M", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ida", name = "O", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ida", name = "Q", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ida", name = "R", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ida", name = "U", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ida", name = "fb", descriptor = "I")
    private int field3034;

    @OriginalMember(owner = "client!ida", name = "gb", descriptor = "I")
    private int field3035;

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "Loca;")
    public static class239 field2991;

    @OriginalMember(owner = "client!ida", name = "Y", descriptor = "Lvc;")
    private class288 field3027;

    @OriginalMember(owner = "client!ida", name = "eb", descriptor = "Lvc;")
    private class288 field3033;

    @OriginalMember(owner = "client!ida", name = "hb", descriptor = "Lsi;")
    public class520 field3036;

    @OriginalMember(owner = "client!ida", name = "bb", descriptor = "[Las;")
    private class137[] field3030;

    @OriginalMember(owner = "client!ida", name = "F", descriptor = "[[[I")
    private int[][][] field3009;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIII[[Z)V", line = 4)
    public final void method322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3020;
        if (~this.field3034 < -1) {
            class415 var9 = this.field3007.method2263(this.field3003, 2);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1119(123, true);
                if (var14 != null) {
                    Stream var15 = this.field3007.method2238(var14, -126);
                    if (Stream.method3484()) {
                        for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                            int var17 = super.field446 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field2998[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            ++var10;
                                            if (~var21 < ~var12) {
                                                var12 = var21;
                                            }
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            var15.method3476(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; var22 < arg6; ++var22) {
                            int var25 = super.field446 * var22 - -arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field2998[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (var12 < var29) {
                                                var12 = var29;
                                            }
                                            var15.method3479(var29);
                                            if (~var29 > ~var11) {
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
                    var15.method3477();
                    if (var9.method1121(false)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field3007.method2228(false);
                this.field3007.method2267(false, 2);
                this.field3007.method2250(-8, false);
                this.field3007.method2247(false, (byte) 118);
                this.field3007.method2254(false, (byte) -98);
                this.field3007.method2230(0, -50);
                this.field3007.method2249(false, false, -2, 0);
                this.field3007.method2241((class218) null, (byte) 44);
                class274 var23 = this.field3007.method2224((byte) 99);
                float[] var24 = this.field3007.method2248(-77);
                var24[4] = 0.0F;
                var24[7] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field441 * 128.0F * (float) this.field3007.field5165);
                var24[11] = 0.0F;
                var24[2] = 0.0F;
                var24[10] = 1.0F / (this.field3002 - this.field2999);
                var24[15] = 1.0F;
                var24[6] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field3007.field5208;
                var24[8] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3007.field5165) + 1.0F;
                var24[9] = 0.0F;
                var24[14] = -this.field2999 / (this.field3002 - this.field2999);
                var24[3] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field441 * 128.0F * (float) this.field3007.field5208);
                var24[1] = 0.0F;
                var23.method1714(0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, (byte) -68, 0.0F, 0.0F);
                this.field3007.method2244((byte) 120);
                this.field3007.method2219(0);
                if ((7 & this.field2994) != 0) {
                    this.field3007.method2250(-8, true);
                    this.field3007.method1035(10);
                } else {
                    this.field3007.method2250(-8, false);
                }
                this.field3007.method1044(false, (byte) 14);
                this.field3007.method1021(this.field3027, (byte) 120, 0);
                this.field3007.method1021(this.field3033, (byte) 126, 1);
                this.field3007.method1050(0, this.field3036);
                this.field3007.method1065(class345.field4628, -var11 + 1 + var12, var11, var10 / 3, 0, var9, (byte) -104);
                this.field3007.method1044(true, (byte) 110);
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZ)I", line = 199)
    public static final int method1374(int arg0, boolean arg1) {
        ++field3023;
        if (arg1) {
            method1376(-34, (String) null);
        }
        return (arg0 & 261794) >> 11;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)V", line = 210)
    public final void method321(int arg0, int arg1) {
        ++field3016;
    }

    @OriginalMember(owner = "client!ida", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 221)
    public final void method329(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3010;
        if (this.field3025 != null && arg0 != null) {
            int var7 = -(this.field3007.field5328 * arg2 >> 8) + arg1 >> this.field3007.field5300;
            int var8 = -(this.field3007.field5339 * arg2 >> 8) + arg3 >> this.field3007.field5300;
            this.field3025.method981(var8, arg0, var7, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 240)
    public static void method1375(int arg0) {
        field2991 = null;
        int var1 = -81 % ((53 - arg0) / 51);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILjava/lang/String;)I", line = 250)
    public static final int method1376(int arg0, String arg1) {
        if (arg0 != 0) {
            return -24;
        } else {
            ++field2996;
            return class585.method3332(10, true, arg1, arg0 + 2);
        }
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lnv;IIII[[I[[II)V", line = 537)
    public class214(class382 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3007 = arg0;
        this.field3024 = super.field447 + -2;
        this.field3037 = new float[super.field446 + 1][super.field438 + 1];
        this.field2997 = 1 << this.field3024;
        this.field3022 = new byte[arg3][arg4];
        this.field3006 = new int[arg3][arg4][];
        this.field3031 = new float[super.field446 + 1][super.field438 + 1];
        this.field3028 = new float[super.field446 + 1][super.field438 + 1];
        this.field3021 = new int[arg3][arg4][];
        this.field3005 = new class137[arg3][arg4][];
        this.field2992 = new int[arg3][arg4][];
        this.field3013 = new int[arg3][arg4][];
        this.field3014 = new int[arg3][arg4][];
        this.field3029 = new byte[arg3 + 1][arg4 + 1];
        this.field2998 = new short[arg3 * arg4][];
        this.field2994 = arg2;
        for (int var9 = 0; super.field438 >= var9; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field446; ++var10) {
                int var11 = super.field440[var10][var9];
                if (this.field2999 > (float) var11) {
                    this.field2999 = (float) var11;
                }
                if ((float) var11 > this.field3002) {
                    this.field3002 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && ~var10 > ~super.field446 && ~super.field438 < ~var9) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var12 * var12 + var13 * var13)));
                    this.field3037[var10][var9] = (float) var12 * var14;
                    this.field3031[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field3028[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field2999;
        ++this.field3002;
        this.field3032 = new class139(128);
        if (~(this.field2994 & 16) != -1) {
            this.field3025 = new class140(this.field3007, this);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Ltw;[I)V", line = 272)
    public final void method333(class186 arg0, int[] arg1) {
        ++field3018;
        this.field3026.method1441(new class43(this.field3007, this, arg0, arg1), 0);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 284)
    public final void method318(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3012;
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
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
        this.method323(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III[[ZZ)V", line = 367)
    public final void method327(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1378(arg4, (byte) -116, arg2, arg3, -1, arg1, arg0);
        ++field2993;
    }

    @OriginalMember(owner = "client!ida", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 376)
    public final void method323(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field3009 == null) {
            this.field3009 = new int[super.field446][super.field438][];
        }
        ++field3004;
        if (arg3 != null && this.field3014 == null) {
            this.field3014 = new int[super.field446][super.field438][];
        }
        this.field3013[arg0][arg1] = arg2;
        this.field2992[arg0][arg1] = arg4;
        this.field3021[arg0][arg1] = arg6;
        this.field3006[arg0][arg1] = arg7;
        if (this.field3009 != null) {
            this.field3009[arg0][arg1] = arg5;
        }
        if (this.field3014 != null) {
            this.field3014[arg0][arg1] = arg3;
        }
        class137[] var15 = this.field3005[arg0][arg1] = new class137[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) arg8[var16];
            class401 var19;
            for (var19 = this.field3032.method970((byte) 89, var17); var19 != null; var19 = this.field3032.method976((byte) -81)) {
                class137 var20 = (class137) var19;
                if (~arg8[var16] == ~var20.field1938 && (float) arg9[var16] == var20.field1949 && var20.field1946 == arg10 && var20.field1932 == arg11 && ~var20.field1939 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class137) var19;
            } else {
                var15[var16] = new class137(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3032.method968(var17, var15[var16], -1);
            }
        }
        if (arg13) {
            this.field3022[arg0][arg1] = (byte) class647.method3617(this.field3022[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field3035) {
            this.field3035 = arg6.length;
        }
        this.field3034 += arg6.length;
    }

    @OriginalMember(owner = "client!ida", name = "E", descriptor = "(Lha;IIIIZ)V", line = 442)
    public final void method330(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3000;
        if (this.field3025 != null && arg0 != null) {
            int var7 = arg1 - (this.field3007.field5328 * arg2 >> 8) >> this.field3007.field5300;
            int var8 = -(this.field3007.field5339 * arg2 >> 8) + arg3 >> this.field3007.field5300;
            this.field3025.method978(arg0, var7, var8, -1);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BILwb;I)V", line = 460)
    private final void method1377(byte arg0, int arg1, class300 arg2, int arg3) {
        int var5 = 44 / ((arg0 - 39) / 33);
        ++field3001;
        int[] var6 = this.field3013[arg3][arg1];
        int[] var7 = this.field2992[arg3][arg1];
        int var8 = var6.length;
        if (var8 > class219.field3068.length) {
            class332.field4486 = new int[var8];
            class219.field3068 = new int[var8];
        }
        for (int var9 = 0; var8 > var9; ++var9) {
            class219.field3068[var9] = var6[var9] >> this.field3007.field5300;
            class332.field4486[var9] = var7[var9] >> this.field3007.field5300;
        }
        int var10 = 0;
        while (~var10 > ~var8) {
            int var11 = class219.field3068[var10];
            int var12 = class332.field4486[var10++];
            int var13 = class219.field3068[var10];
            int var14 = class332.field4486[var10++];
            int var15 = class219.field3068[var10];
            int var16 = class332.field4486[var10++];
            if ((-var13 + var11) * (-var16 + var14) + -((-var12 + var14) * (-var13 + var15)) > 0) {
                arg2.method1816(var16, var14, var13, (byte) 38, var15, var12, var11);
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III[[ZZI)V", line = 517)
    public final void method328(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field3019;
        this.method1378(arg4, (byte) -116, arg2, arg3, arg5, arg1, arg0);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)V", line = 527)
    public final void method319(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field3029[arg0][arg1] & 255)) {
            this.field3029[arg0][arg1] = (byte) arg2;
        }
        ++field3011;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 606)
    public final boolean method320(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3008;
        if (this.field3025 != null && arg0 != null) {
            int var7 = -(this.field3007.field5328 * arg2 >> 8) + arg1 >> this.field3007.field5300;
            int var8 = -(this.field3007.field5339 * arg2 >> 8) + arg3 >> this.field3007.field5300;
            return this.field3025.method982(arg0, var8, var7, -1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ida", name = "BA", descriptor = "()V", line = 628)
    public final void method325() {
        ++field3015;
        if (~this.field3034 < -1) {
            byte[][] var1 = new byte[super.field446 + 1][super.field438 + 1];
            for (int var2 = 1; ~super.field446 < ~var2; ++var2) {
                for (int var107 = 1; var107 < super.field438; ++var107) {
                    var1[var2][var107] = (byte) ((this.field3029[var2][var107 + 1] >> 3) + (this.field3029[var2][var107] >> 1) + (this.field3029[var2 + -1][var107] >> 2) + (this.field3029[var2][var107 - 1] >> 2) + (this.field3029[var2 + 1][var107] >> 3));
                }
            }
            class137[] var3 = new class137[this.field3032.method972(0)];
            this.field3032.method971(var3, -30302);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method956(65280, this.field3034);
            }
            int var5 = 20;
            if (this.field3009 != null) {
                var5 += 4;
            }
            if ((7 & this.field2994) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field3007.field5161.method3474(this.field3034 * 4, false);
            NativeHeapBuffer var7 = this.field3007.field5161.method3474(this.field3034 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class137[] var10 = new class137[this.field3034];
            int var11 = class180.method1240(this.field3034 / 4, -1);
            if (~var11 > -2) {
                var11 = 1;
            }
            class139 var12 = new class139(var11);
            class137[] var13 = new class137[this.field3035];
            for (int var14 = 0; super.field446 > var14; ++var14) {
                for (int var34 = 0; var34 < super.field438; ++var34) {
                    if (this.field3021[var14][var34] != null) {
                        class137[] var35 = this.field3005[var14][var34];
                        int[] var36 = this.field3013[var14][var34];
                        int[] var37 = this.field2992[var14][var34];
                        int[] var38 = this.field3006[var14][var34];
                        int[] var39 = this.field3021[var14][var34];
                        int[] var40 = this.field3014 == null ? null : this.field3014[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field3009 == null ? null : this.field3009[var14][var34];
                        float var42 = this.field3037[var14][var34];
                        float var43 = this.field3031[var14][var34];
                        float var44 = this.field3028[var14][var34];
                        float var45 = this.field3037[var14][var34 - -1];
                        float var46 = this.field3031[var14][var34 + 1];
                        float var47 = this.field3028[var14][var34 + 1];
                        float var48 = this.field3037[var14 + 1][var34 + 1];
                        float var49 = this.field3031[var14 + 1][var34 - -1];
                        float var50 = this.field3028[var14 - -1][var34 + 1];
                        float var51 = this.field3037[var14 + 1][var34];
                        float var52 = this.field3031[var14 + 1][var34];
                        float var53 = this.field3028[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label361: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class137 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label361;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field2998[super.field446 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var61 < var39.length; ++var61) {
                            int var62 = (var14 << super.field447) - -var36[var61];
                            int var63 = (var34 << super.field447) - -var37[var61];
                            int var64 = var62 >> this.field3024;
                            int var65 = var63 >> this.field3024;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var65 | (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16);
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            int var77;
                            float var78;
                            float var79;
                            if (var71 == 0 && ~var72 == -1) {
                                var76 = var43;
                                var77 = var73 - var54;
                                var78 = var42;
                                var79 = var44;
                            } else if (~var71 == -1 && ~super.field441 == ~var72) {
                                var78 = var45;
                                var77 = var73 - var55;
                                var79 = var47;
                                var76 = var46;
                            } else if (super.field441 == var71 && ~super.field441 == ~var72) {
                                var76 = var49;
                                var79 = var50;
                                var78 = var48;
                                var77 = var73 - var56;
                            } else if (~super.field441 == ~var71 && ~var72 == -1) {
                                var77 = var73 - var57;
                                var79 = var53;
                                var78 = var51;
                                var76 = var52;
                            } else {
                                float var80 = (float) var71 / (float) super.field441;
                                float var81 = (float) var72 / (float) super.field441;
                                float var82 = (-var42 + var51) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (var53 - var44) * var80 + var44;
                                float var85 = (var48 - var45) * var80 + var45;
                                float var86 = (var49 - var46) * var80 + var46;
                                var76 = (var86 - var83) * var81 + var83;
                                var78 = (var85 - var82) * var81 + var82;
                                float var87 = (var50 - var47) * var80 + var47;
                                var79 = (var87 - var84) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field447) + var54;
                                int var89 = ((-var55 + var56) * var71 >> super.field447) + var55;
                                var77 = var73 - (((-var88 + var89) * var72 >> super.field447) + var88);
                            }
                            if (~var66 != 0) {
                                int var90 = (var66 & 127) * var77 >> 7;
                                if (~var90 <= -3) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                if (~(7 & this.field2994) == -1) {
                                    float var91 = this.field3007.field5349[2] * var79 + this.field3007.field5349[1] * var76 + this.field3007.field5349[0] * var78;
                                    var75 = var91 * (!(var91 > 0.0F) ? this.field3007.field5385 : this.field3007.field5353) + this.field3007.field5320;
                                }
                                var74 = class78.field1186[65408 & var66 | var90];
                            }
                            class401 var92 = null;
                            if (~(this.field2997 + -1 & var62) == -1 && ~(this.field2997 - 1 & var63) == -1) {
                                var92 = var12.method970((byte) 89, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class1) var92).field1;
                                var93 = var60[var61] & 65535;
                                if (var66 != -1 && var10[var93].field5623 > var35[var61].field5623) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (~var66 == ~var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (127 & var67) * var77 >> 7;
                                    if (var95 >= 2) {
                                        if (~var95 < -127) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class78.field1186[65408 & var67 | var95];
                                    if (~(7 & this.field2994) == -1) {
                                        float var96 = this.field3007.field5349[2] * var79 + this.field3007.field5349[1] * var76 + this.field3007.field5349[0] * var78;
                                        float var97 = this.field3007.field5320 + var75 * (!(var75 > 0.0F) ? this.field3007.field5385 : this.field3007.field5353);
                                        int var98 = (16743675 & var94) >> 16;
                                        int var99 = var94 >> 8 & 255;
                                        int var100 = 255 & var94;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (~var101 > -1) {
                                            var101 = 0;
                                        } else if (var101 > 255) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var102 > -1) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        int var103 = (int) ((float) var100 * var97);
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var94 = var102 << 8 | var101 << 16 | var103;
                                    }
                                }
                                if (!Stream.method3484()) {
                                    var8.method3478((float) var62);
                                    var8.method3478((float) (var68 + this.method331(var63, (byte) 50, var62)));
                                    var8.method3478((float) var63);
                                    var8.method3478((float) var62);
                                    var8.method3478((float) var63);
                                    if (this.field3009 != null) {
                                        var8.method3478((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((7 & this.field2994) != 0) {
                                        var8.method3478(var78);
                                        var8.method3478(var76);
                                        var8.method3478(var79);
                                    }
                                } else {
                                    var8.method3486((float) var62);
                                    var8.method3486((float) (this.method331(var63, (byte) 50, var62) - -var68));
                                    var8.method3486((float) var63);
                                    var8.method3486((float) var62);
                                    var8.method3486((float) var63);
                                    if (this.field3009 != null) {
                                        var8.method3486((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((7 & this.field2994) != 0) {
                                        var8.method3486(var78);
                                        var8.method3486(var76);
                                        var8.method3486(var79);
                                    }
                                }
                                if (this.field3007.field5313 == 0) {
                                    var9.method3475(-16777216 | var94);
                                } else {
                                    var9.method3482(-16777216 | var94);
                                }
                                var93 = this.field2990++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method968(var69, new class1(var60[var61]), -1);
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method958(-256, var77, var75, var74, var93);
                            }
                            ++this.field3003;
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < this.field2990; ++var15) {
                class137 var33 = var10[var15];
                if (var33 != null) {
                    var33.method960(var15, 3);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field446; ++var16) {
                for (int var22 = 0; ~super.field438 < ~var22; ++var22) {
                    short[] var23 = this.field2998[super.field446 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var25 > ~var23.length) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class137 var29 = var10[var26];
                            class137 var30 = var10[var27];
                            class137 var31 = var10[var28];
                            class137 var32 = null;
                            if (var29 != null) {
                                var29.method955(var22, var16, var24, (byte) -108);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method955(var22, var16, var24, (byte) -108);
                                if (var32 == null || var30.field5623 < var32.field5623) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method955(var22, var16, var24, (byte) -108);
                                if (var32 == null || ~var31.field5623 > ~var32.field5623) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method960(var26, 3);
                                }
                                if (var30 != null) {
                                    var32.method960(var27, 3);
                                }
                                if (var31 != null) {
                                    var32.method960(var28, 3);
                                }
                                var32.method955(var22, var16, var24, (byte) -108);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3477();
            var9.method3477();
            this.field3033 = this.field3007.method1038(false, -63);
            this.field3033.method1770(var6, 4, this.field2990 * 4, -15029);
            this.field3027 = this.field3007.method1038(false, -67);
            this.field3027.method1770(var7, var5, this.field2990 * var5, -15029);
            if (~(7 & this.field2994) != -1) {
                if (this.field3009 == null) {
                    this.field3036 = this.field3007.method1033(new class553[] { new class553(new class103[] { class103.field1441, class103.field1447, class103.field1442 }), new class553(class103.field1445) }, (byte) -127);
                } else {
                    this.field3036 = this.field3007.method1033(new class553[] { new class553(new class103[] { class103.field1441, class103.field1447, class103.field1446, class103.field1442 }), new class553(class103.field1445) }, (byte) -127);
                }
            } else if (this.field3009 == null) {
                this.field3036 = this.field3007.method1033(new class553[] { new class553(new class103[] { class103.field1441, class103.field1447 }), new class553(class103.field1445) }, (byte) -127);
            } else {
                this.field3036 = this.field3007.method1033(new class553[] { new class553(new class103[] { class103.field1441, class103.field1447, class103.field1446 }), new class553(class103.field1445) }, (byte) -127);
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (var3[var18].field1934 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field3030 = new class137[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class137 var21 = var3[var20];
                var19[var20] = var21.field5623;
                this.field3030[var20] = var21;
                var21.method961(-128, this.field2990);
            }
            class386.method2282(19107, this.field3030, var19);
            if (this.field3025 != null) {
                this.field3025.method984((byte) 83);
            }
        } else {
            this.field3025 = null;
        }
        this.field3013 = this.field2992 = null;
        this.field3014 = null;
        this.field3021 = null;
        this.field3006 = null;
        this.field3009 = null;
        this.field3029 = null;
        this.field3032 = null;
        this.field3037 = this.field3031 = this.field3028 = null;
        this.field3005 = null;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZBI[[ZIII)V", line = 1227)
    private final void method1378(boolean arg0, byte arg1, int arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        ++field2988;
        if (arg1 != -116) {
            method1374(-66, true);
        }
        if (this.field3030 != null) {
            int var8 = arg2 + arg2 - -1;
            int var9 = var8 * var8;
            if (class295.field4054.length < var9) {
                class295.field4054 = new int[var9];
            }
            int var10 = -arg2 + arg6;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg2 + arg5;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg6 - -arg2;
            if (super.field446 + -1 < var14) {
                var14 = super.field446 + -1;
            }
            int var15 = arg2 + arg5;
            if (var15 > super.field438 + -1) {
                var15 = super.field438 + -1;
            }
            class562.field7597 = 0;
            for (int var16 = var10; var16 <= var14; ++var16) {
                boolean[] var23 = arg3[var16 - var11];
                for (int var24 = var12; ~var15 <= ~var24; ++var24) {
                    if (var23[var24 - var13]) {
                        class295.field4054[class562.field7597++] = super.field446 * var24 + var16;
                    }
                }
            }
            if (~arg4 == 0) {
                this.field3007.method2245(104);
            } else {
                this.field3007.method2265((float) arg4, 12);
                this.field3007.method2259(-17);
            }
            this.field3007.method2255(false);
            this.field3007.method2250(-8, (this.field2994 & 7) != 0);
            this.field3007.method2249(false, false, -1, arg1 ^ -116);
            this.field3007.method1021(this.field3027, (byte) 104, 0);
            for (int var17 = 0; var17 < this.field3030.length; ++var17) {
                this.field3030[var17].method957(class295.field4054, false, class562.field7597);
            }
            class274 var18 = this.field3007.method2224((byte) 99);
            var18.method689(0, -1, 0);
            this.field3007.method2219(arg1 ^ -116);
            if (!this.field3026.method1435((byte) -98)) {
                int var19 = this.field3007.field5309;
                int var20 = this.field3007.field5308;
                this.field3007.method131(0, var20, this.field3007.field5360);
                this.field3007.method2250(-8, false);
                this.field3007.method2254(false, (byte) -100);
                this.field3007.method2230(128, -44);
                this.field3007.method2249(false, false, -2, 0);
                this.field3007.method2241(this.field3007.field5305, (byte) 44);
                this.field3007.method2199(class334.field4505, 9797, class276.field3814);
                this.field3007.method2264(9, class452.field6221, 0);
                this.field3007.method2223(0, class227.field3159, (byte) -110);
                for (class401 var21 = this.field3026.method1436(arg1 + 29080); var21 != null; var21 = this.field3026.method1443((byte) 6)) {
                    class43 var22 = (class43) var21;
                    var22.method369(arg6, arg5, arg2, arg3, arg1 + 10);
                }
                this.field3007.method2264(arg1 + 125, class262.field3553, 0);
                this.field3007.method2223(0, class262.field3553, (byte) -85);
                this.field3007.method2241((class218) null, (byte) 44);
                this.field3007.method131(var19, var20, this.field3007.field5360);
            }
            if (this.field3025 != null) {
                this.field3007.method1021(this.field3027, (byte) 109, 0);
                this.field3007.method1021(this.field3033, (byte) 127, 1);
                this.field3007.method1050(0, this.field3036);
                this.field3025.method985(arg1 + -2, arg6, arg2, arg5, arg0, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "v", descriptor = "(IILha;)Lha;", line = 1370)
    public final class54 method324(int arg0, int arg1, class54 arg2) {
        ++field2995;
        if ((1 & this.field3022[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field441 >> this.field3007.field5300;
            class300 var5 = (class300) arg2;
            class300 var6;
            if (var5 != null && var5.method1814((byte) -72, var4, var4)) {
                var6 = var5;
                var5.method1819(-97);
            } else {
                var6 = new class300(this.field3007, var4, var4);
            }
            var6.method1813(0, var4, 112, var4, 0);
            this.method1377((byte) -109, arg1, var6, arg0);
            return var6;
        }
    }
}
