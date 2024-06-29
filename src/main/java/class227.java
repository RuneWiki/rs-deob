import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class227 extends class296 {

    @OriginalMember(owner = "client!cea", name = "G", descriptor = "Lifa;")
    private class450 field2661 = new class450();

    @OriginalMember(owner = "client!cea", name = "M", descriptor = "Lpc;")
    public class700 field2667;

    @OriginalMember(owner = "client!cea", name = "V", descriptor = "I")
    private int field2676;

    @OriginalMember(owner = "client!cea", name = "ab", descriptor = "[[F")
    private float[][] field2681;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "[[[I")
    private int[][][] field2641;

    @OriginalMember(owner = "client!cea", name = "fb", descriptor = "[[B")
    private byte[][] field2686;

    @OriginalMember(owner = "client!cea", name = "W", descriptor = "[[[I")
    private int[][][] field2677;

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
    private int field2654;

    @OriginalMember(owner = "client!cea", name = "cb", descriptor = "[[F")
    private float[][] field2683;

    @OriginalMember(owner = "client!cea", name = "A", descriptor = "[[[I")
    public int[][][] field2655;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "[[S")
    public short[][] field2643;

    @OriginalMember(owner = "client!cea", name = "L", descriptor = "[[[I")
    public int[][][] field2666;

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "[[[Lwda;")
    private class666[][][] field2652;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "[[[I")
    public int[][][] field2651;

    @OriginalMember(owner = "client!cea", name = "R", descriptor = "[[B")
    private byte[][] field2672;

    @OriginalMember(owner = "client!cea", name = "J", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!cea", name = "Z", descriptor = "[[F")
    private float[][] field2680;

    @OriginalMember(owner = "client!cea", name = "ib", descriptor = "Ldj;")
    private class362 field2689;

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "Lmj;")
    private class682 field2648;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "I")
    private int field2646;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!cea", name = "y", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!cea", name = "B", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!cea", name = "C", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!cea", name = "F", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!cea", name = "H", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!cea", name = "I", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!cea", name = "K", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!cea", name = "N", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!cea", name = "O", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!cea", name = "P", descriptor = "I")
    private int field2670;

    @OriginalMember(owner = "client!cea", name = "S", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!cea", name = "T", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!cea", name = "U", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!cea", name = "db", descriptor = "I")
    private int field2684;

    @OriginalMember(owner = "client!cea", name = "hb", descriptor = "I")
    private int field2688;

    @OriginalMember(owner = "client!cea", name = "Q", descriptor = "Lwt;")
    public static class330 field2671;

    @OriginalMember(owner = "client!cea", name = "eb", descriptor = "Len;")
    private class339 field2685;

    @OriginalMember(owner = "client!cea", name = "E", descriptor = "Lbt;")
    public static class48 field2659;

    @OriginalMember(owner = "client!cea", name = "X", descriptor = "Lsf;")
    public class550 field2678;

    @OriginalMember(owner = "client!cea", name = "bb", descriptor = "Lsf;")
    private class550 field2682;

    @OriginalMember(owner = "client!cea", name = "gb", descriptor = "Lsf;")
    public class550 field2687;

    @OriginalMember(owner = "client!cea", name = "jb", descriptor = "Lsf;")
    public class550 field2690;

    @OriginalMember(owner = "client!cea", name = "Y", descriptor = "[Lwda;")
    private class666[] field2679;

    @OriginalMember(owner = "client!cea", name = "D", descriptor = "[[[I")
    private int[][][] field2658;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1388(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method1393(arg4, arg0, arg3, arg1, -1, -114, arg5, arg2);
        ++field2656;
    }

    @OriginalMember(owner = "client!cea", name = "YA", descriptor = "()V")
    public final void method1389() {
        if (~this.field2684 < -1) {
            byte[][] var1 = new byte[super.field3533 + 1][super.field3524 + 1];
            for (int var2 = 1; var2 < super.field3533; ++var2) {
                for (int var103 = 1; var103 < super.field3524; ++var103) {
                    var1[var2][var103] = (byte) ((this.field2686[var2][var103 + 1] >> 3) + (this.field2686[var2 + 1][var103] >> 3) + (this.field2686[var2][var103] >> 1) + (this.field2686[var2][var103 - 1] >> 2) + (this.field2686[var2 + -1][var103] >> 2));
                }
            }
            this.field2679 = new class666[this.field2689.method2117(true)];
            this.field2689.method2113(this.field2679, -116);
            for (int var3 = 0; this.field2679.length > var3; ++var3) {
                this.field2679[var3].method3740(-3791, this.field2684);
            }
            int var4 = 24;
            if (this.field2658 != null) {
                var4 += 4;
            }
            if (~(7 & this.field2664) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field2667.field9725.method3977(this.field2684 * var4, false);
            Stream var6 = new Stream(var5);
            class666[] var7 = new class666[this.field2684];
            int var8 = class381.method2234(-127, this.field2684 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class362 var9 = new class362(var8);
            class666[] var10 = new class666[this.field2688];
            for (int var11 = 0; super.field3533 > var11; ++var11) {
                for (int var30 = 0; ~super.field3524 < ~var30; ++var30) {
                    if (this.field2651[var11][var30] != null) {
                        class666[] var31 = this.field2652[var11][var30];
                        int[] var32 = this.field2655[var11][var30];
                        int[] var33 = this.field2666[var11][var30];
                        int[] var34 = this.field2641[var11][var30];
                        int[] var35 = this.field2651[var11][var30];
                        int[] var36 = this.field2677 == null ? null : this.field2677[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field2658 != null ? this.field2658[var11][var30] : null;
                        float var38 = this.field2681[var11][var30];
                        float var39 = this.field2680[var11][var30];
                        float var40 = this.field2683[var11][var30];
                        float var41 = this.field2681[var11][var30 - -1];
                        float var42 = this.field2680[var11][var30 - -1];
                        float var43 = this.field2683[var11][var30 + 1];
                        float var44 = this.field2681[var11 + 1][var30 + 1];
                        float var45 = this.field2680[var11 - -1][var30 - -1];
                        float var46 = this.field2683[var11 + 1][var30 + 1];
                        float var47 = this.field2681[var11 + 1][var30];
                        float var48 = this.field2680[var11 - -1][var30];
                        float var49 = this.field2683[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 + 1][var30 + 1];
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label338: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class666 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field2643[super.field3533 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field3530) - -var32[var57];
                            int var59 = (var30 << super.field3530) + var33[var57];
                            int var60 = var58 >> this.field2676;
                            int var61 = var59 >> this.field2676;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            int var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var40;
                                var73 = var69 - var50;
                                var74 = var38;
                                var75 = var39;
                            } else if (~var67 == -1 && super.field3525 == var68) {
                                var73 = var69 - var51;
                                var74 = var41;
                                var75 = var42;
                                var72 = var43;
                            } else if (super.field3525 == var67 && super.field3525 == var68) {
                                var74 = var44;
                                var72 = var46;
                                var73 = var69 - var52;
                                var75 = var45;
                            } else if (~super.field3525 == ~var67 && ~var68 == -1) {
                                var72 = var49;
                                var75 = var48;
                                var73 = var69 - var53;
                                var74 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field3525;
                                float var77 = (float) var68 / (float) super.field3525;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (-var79 + var82) * var77 + var79;
                                var74 = (var81 - var78) * var77 + var78;
                                var72 = (var83 - var80) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field3530) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field3530) + var51;
                                var73 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field3530));
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var73 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                if ((7 & this.field2664) == 0) {
                                    float var87 = this.field2667.field9869[2] * var72 + this.field2667.field9869[0] * var74 + this.field2667.field9869[1] * var75;
                                    var71 = this.field2667.field9850 + var87 * (var87 > 0.0F ? this.field2667.field9830 : this.field2667.field9788);
                                }
                                var70 = class437.field5749[var86 | var62 & 65408];
                            }
                            class379 var88 = null;
                            if ((var58 & this.field2654 + -1) == 0 && (var59 & this.field2654 + -1) == 0) {
                                var88 = var9.method2121(58, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class731) var88).field10239;
                                var89 = var56[var57] & 65535;
                                if (~var62 != 0 && var31[var57].field4809 < var7[var89].field4809) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (~var62 == ~var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (var63 & 127) * var73 >> 7;
                                    if (var91 >= 2) {
                                        if (~var91 < -127) {
                                            var91 = 126;
                                        }
                                    } else {
                                        var91 = 2;
                                    }
                                    var90 = class437.field5749[var63 & 65408 | var91];
                                    if (~(this.field2664 & 7) == -1) {
                                        float var92 = this.field2667.field9869[2] * var72 + this.field2667.field9869[0] * var74 + this.field2667.field9869[1] * var75;
                                        float var93 = this.field2667.field9850 + (!(var71 > 0.0F) ? this.field2667.field9788 : this.field2667.field9830) * var71;
                                        int var94 = (16768204 & var90) >> 16;
                                        int var95 = var90 >> 8 & 255;
                                        int var96 = 255 & var90;
                                        int var97 = (int) ((float) var94 * var93);
                                        if (var97 >= 0) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var96 * var93);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (~var99 < -256) {
                                            var99 = 255;
                                        }
                                        var90 = var99 | var98 << 8 | var97 << 16;
                                    }
                                }
                                if (!this.field2667.field9772) {
                                    var6.method3981((float) var58);
                                    var6.method3981((float) (var64 + this.method1730(var58, var59, -1)));
                                    var6.method3981((float) var59);
                                    var6.method3978((byte) (var90 >> 16));
                                    var6.method3978((byte) (var90 >> 8));
                                    var6.method3978((byte) var90);
                                    var6.method3978(-1);
                                    var6.method3981((float) var58);
                                    var6.method3981((float) var59);
                                    if (this.field2658 != null) {
                                        var6.method3981((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field2664 & 7) != -1) {
                                        var6.method3981(var74);
                                        var6.method3981(var75);
                                        var6.method3981(var72);
                                    }
                                } else {
                                    var6.method3979((float) var58);
                                    var6.method3979((float) (var64 + this.method1730(var58, var59, -1)));
                                    var6.method3979((float) var59);
                                    var6.method3978((byte) (var90 >> 16));
                                    var6.method3978((byte) (var90 >> 8));
                                    var6.method3978((byte) var90);
                                    var6.method3978(-1);
                                    var6.method3979((float) var58);
                                    var6.method3979((float) var59);
                                    if (this.field2658 != null) {
                                        var6.method3979((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if ((this.field2664 & 7) != 0) {
                                        var6.method3979(var74);
                                        var6.method3979(var75);
                                        var6.method3979(var72);
                                    }
                                }
                                var89 = this.field2670++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method2112(new class731(var56[var57]), (byte) 6, var65);
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method3736((byte) -127, var73, var70, var89, var71);
                            }
                            ++this.field2646;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field2670; ++var12) {
                class666 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3739(var12, 0);
                }
            }
            for (int var13 = 0; var13 < super.field3533; ++var13) {
                for (int var18 = 0; ~super.field3524 < ~var18; ++var18) {
                    short[] var19 = this.field2643[super.field3533 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class666 var25 = var7[var22];
                            class666 var26 = var7[var23];
                            class666 var27 = var7[var24];
                            class666 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method3741(var20, var18, 256, var13);
                            }
                            if (var26 != null) {
                                var26.method3741(var20, var18, 256, var13);
                                if (var28 == null || var26.field4809 < var28.field4809) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3741(var20, var18, 256, var13);
                                if (var28 == null || ~var28.field4809 < ~var27.field4809) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3739(var22, 0);
                                }
                                if (var26 != null) {
                                    var28.method3739(var23, 0);
                                }
                                if (var27 != null) {
                                    var28.method3739(var24, 0);
                                }
                                var28.method3741(var20, var18, 256, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3992();
            this.field2685 = this.field2667.method3926((byte) -57, var5, var4, false, var6.method3984());
            this.field2687 = new class550(this.field2685, 5126, 3, 0);
            this.field2682 = new class550(this.field2685, 5121, 4, 12);
            byte var14;
            if (this.field2658 != null) {
                var14 = 28;
                this.field2678 = new class550(this.field2685, 5126, 3, 16);
            } else {
                this.field2678 = new class550(this.field2685, 5126, 2, 16);
                var14 = 24;
            }
            if (~(this.field2664 & 7) != -1) {
                this.field2690 = new class550(this.field2685, 5126, 3, var14);
            }
            long[] var15 = new long[this.field2679.length];
            for (int var16 = 0; var16 < this.field2679.length; ++var16) {
                class666 var17 = this.field2679[var16];
                var15[var16] = var17.field4809;
                var17.method3735(this.field2670, (byte) 122);
            }
            class5.method107(var15, this.field2679, (byte) -106);
            if (this.field2648 != null) {
                this.field2648.method3829((byte) -113);
            }
        } else {
            this.field2648 = null;
        }
        ++field2647;
        this.field2689 = null;
        this.field2651 = null;
        this.field2658 = null;
        this.field2655 = this.field2666 = null;
        this.field2641 = null;
        this.field2652 = null;
        this.field2686 = null;
        this.field2681 = this.field2680 = this.field2683 = null;
        this.field2677 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1390(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method1393(arg4, arg0, arg3, arg1, arg5, 82, arg6, arg2);
        ++field2644;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lbt;IBIZI)V")
    public static final void method1391(class48 arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 > -88) {
            method1398(-14, -114, 75, (Object[]) null, (int[]) null);
        }
        class689.method3849(arg1, arg3, arg4, (byte) 22, arg5, arg0, 0L);
        ++field2642;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)V")
    public final void method1392(int arg0, int arg1) {
        ++field2660;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZI[[ZIIIII)V")
    private final void method1393(boolean arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -116 / ((17 - arg5) / 50);
        if (this.field2679 != null) {
            int var10 = arg7 - -arg7 - -1;
            int var11 = var10 * var10;
            if (~this.field2667.field9874.length > ~var11) {
                this.field2667.field9874 = new int[var11];
            }
            if (this.field2646 * 2 > this.field2667.field9779.field5275.length) {
                this.field2667.field9779 = new class283(this.field2646 * 2);
            }
            int var12 = arg1 - arg7;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg3 - arg7;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg1 + arg7;
            if (~var16 < ~(super.field3533 + -1)) {
                var16 = super.field3533 + -1;
            }
            int var17 = arg3 + arg7;
            if (super.field3524 - 1 < var17) {
                var17 = super.field3524 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field2667.field9874;
            for (int var20 = var12; ~var20 >= ~var16; ++var20) {
                boolean[] var26 = arg2[-var13 + var20];
                for (int var27 = var14; ~var27 >= ~var17; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field3533 * var27 + var20;
                    }
                }
            }
            if (arg4 == -1) {
                this.field2667.method3942((byte) 126);
            } else {
                this.field2667.method3958(-895270824, (float) arg4);
                this.field2667.method3934(127);
            }
            this.field2667.method3892(~(7 & this.field2664) != -1, 1);
            for (int var21 = 0; var21 < this.field2679.length; ++var21) {
                this.field2679[var21].method3738(var18, (byte) 18, var19);
            }
            if (!this.field2661.method2724((byte) -77)) {
                int var22 = this.field2667.field9834;
                int var23 = this.field2667.field9856;
                this.field2667.method650(0, var23, this.field2667.field9801);
                this.field2667.method3892(false, 1);
                this.field2667.method3908(false, (byte) 121);
                this.field2667.method3888((byte) 51, 128);
                this.field2667.method3901(-2, false);
                this.field2667.method3936(false, this.field2667.field9766);
                this.field2667.method3961(7681, 8448, 16127);
                this.field2667.method3903(34166, 0, 770, -126);
                this.field2667.method3931(0, 8960, 770, 34167);
                for (class379 var24 = this.field2661.method2725(37); var24 != null; var24 = this.field2661.method2726(-118)) {
                    class389 var25 = (class389) var24;
                    var25.method2281(arg2, (byte) 56, arg3, arg7, arg1);
                }
                this.field2667.method3903(5890, 0, 768, -118);
                this.field2667.method3931(0, 8960, 770, 5890);
                this.field2667.method3936(false, (class400) null);
                this.field2667.method650(var22, var23, this.field2667.field9801);
            }
            if (this.field2648 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field2667.method3935(this.field2678, this.field2687, (class550) null, (class550) null, 2407);
                this.field2648.method3828(120, arg3, arg7, arg1, arg2, arg0);
                OpenGL.glPopMatrix();
            }
        }
        ++field2645;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1394(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2649;
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
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
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
        this.method1405(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V")
    public static void method1395(int arg0) {
        if (arg0 == 25641) {
            field2671 = null;
            field2659 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIILnfa;)V")
    private final void method1396(int arg0, int arg1, int arg2, class709 arg3) {
        ++field2669;
        int[] var5 = this.field2655[arg0][arg2];
        int[] var6 = this.field2666[arg0][arg2];
        int var7 = var5.length;
        if (var7 > this.field2667.field9873.length) {
            this.field2667.field9876 = new int[var7];
            this.field2667.field9873 = new int[var7];
        }
        int[] var8 = this.field2667.field9873;
        int[] var9 = this.field2667.field9876;
        int var10 = 0;
        if (arg1 != -1) {
            this.method1406(-121, -79, 88);
        }
        while (~var10 > ~var7) {
            var8[var10] = var5[var10] >> this.field2667.field9727;
            var9[var10] = var6[var10] >> this.field2667.field9727;
            ++var10;
        }
        int var11 = 0;
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16))) < -1) {
                arg3.method4021(var15, var16, var13, var14, -113, var17, var12);
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1397(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2662;
        if (this.field2648 != null && arg0 != null) {
            int var7 = -(this.field2667.field9784 * arg2 >> 8) + arg1 >> this.field2667.field9727;
            int var8 = -(this.field2667.field9785 * arg2 >> 8) + arg3 >> this.field2667.field9727;
            this.field2648.method3826((byte) -12, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
    public static final void method1398(int arg0, int arg1, int arg2, Object[] arg3, int[] arg4) {
        ++field2663;
        if (~arg0 < ~arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            int var9 = var7 != Integer.MAX_VALUE ? 1 : 0;
            for (int var10 = arg2; ~var10 > ~arg0; ++var10) {
                if ((var9 & var10) + var7 > arg4[var10]) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method1398(var6 + -1, 120, arg2, arg3, arg4);
            method1398(arg0, -71, var6 + 1, arg3, arg4);
        }
        int var13 = 11 % ((arg1 - -8) / 49);
    }

    @OriginalMember(owner = "client!cea", name = "fa", descriptor = "(IILr;)Lr;")
    public final class196 method1399(int arg0, int arg1, class196 arg2) {
        ++field2650;
        if ((1 & this.field2672[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field3525 >> this.field2667.field9727;
            class709 var5 = (class709) arg2;
            class709 var6;
            if (var5 != null && var5.method4023(var4, var4, 104)) {
                var6 = var5;
                var5.method4022(-121);
            } else {
                var6 = new class709(this.field2667, var4, var4);
            }
            var6.method4020(var4, 63, 0, var4, 0);
            this.method1396(arg0, -1, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lkp;[I)V")
    public final void method1400(class515 arg0, int[] arg1) {
        this.field2661.method2732(new class389(this.field2667, this, arg0, arg1), 21939);
        ++field2668;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(JJ)J")
    public static long method1401(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!cea", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1402(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2675;
        if (this.field2648 != null && arg0 != null) {
            int var7 = -(this.field2667.field9784 * arg2 >> 8) + arg1 >> this.field2667.field9727;
            int var8 = -(this.field2667.field9785 * arg2 >> 8) + arg3 >> this.field2667.field9727;
            this.field2648.method3835(1, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1403(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2673;
        if (this.field2648 != null && arg0 != null) {
            int var7 = -(this.field2667.field9784 * arg2 >> 8) + arg1 >> this.field2667.field9727;
            int var8 = -(this.field2667.field9785 * arg2 >> 8) + arg3 >> this.field2667.field9727;
            return this.field2648.method3833(var8, var7, arg0, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)V")
    public static final void method1404(byte arg0) {
        if (arg0 != 3) {
            method1395(126);
        }
        ++field2657;
        class288 var1 = class374.field4698;
        synchronized (class374.field4698) {
            class374.field4698.method1687((byte) 61);
        }
    }

    @OriginalMember(owner = "client!cea", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1405(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2665;
        if (arg5 != null && this.field2658 == null) {
            this.field2658 = new int[super.field3533][super.field3524][];
        }
        if (arg3 != null && this.field2677 == null) {
            this.field2677 = new int[super.field3533][super.field3524][];
        }
        class162 var15 = this.field2667.field890;
        this.field2655[arg0][arg1] = arg2;
        this.field2666[arg0][arg1] = arg4;
        this.field2651[arg0][arg1] = arg6;
        this.field2641[arg0][arg1] = arg7;
        if (this.field2658 != null) {
            this.field2658[arg0][arg1] = arg5;
        }
        if (this.field2677 != null) {
            this.field2677[arg0][arg1] = arg3;
        }
        class666[] var16 = this.field2652[arg0][arg1] = new class666[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field2664 & 32) != 0 && ~var18 != 0 && var15.method1138(var18, 27).field4464) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
            class379 var22;
            for (var22 = this.field2689.method2121(71, var20); var22 != null; var22 = this.field2689.method2118(0)) {
                class666 var23 = (class666) var22;
                if (var23.field9150 == var18 && (float) var19 == var23.field9141 && ~var23.field9148 == ~arg10 && ~var23.field9138 == ~arg11 && ~var23.field9137 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class666(this, var18, var19, arg10, arg11, arg12);
                this.field2689.method2112(var16[var17], (byte) 6, var20);
            } else {
                var16[var17] = (class666) var22;
            }
        }
        if (arg13) {
            this.field2672[arg0][arg1] = (byte) class5.method105(this.field2672[arg0][arg1], 1);
        }
        if (~this.field2688 > ~arg6.length) {
            this.field2688 = arg6.length;
        }
        this.field2684 += arg6.length;
    }

    @OriginalMember(owner = "client!cea", name = "ka", descriptor = "(III)V")
    public final void method1406(int arg0, int arg1, int arg2) {
        if ((this.field2686[arg0][arg1] & 255) < arg2) {
            this.field2686[arg0][arg1] = (byte) arg2;
        }
        ++field2653;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2674;
        if (this.field2684 > 0) {
            this.field2667.method3912(-9014);
            this.field2667.method3913(-9373, false);
            this.field2667.method3892(false, 1);
            this.field2667.method3906(false, 32884);
            this.field2667.method3908(false, (byte) 125);
            this.field2667.method3888((byte) 50, 0);
            this.field2667.method3901(-2, false);
            this.field2667.method3936(false, (class400) null);
            class744.field10364[15] = 1.0F;
            class744.field10364[4] = 0.0F;
            class744.field10364[9] = 0.0F;
            class744.field10364[6] = 0.0F;
            class744.field10364[2] = 0.0F;
            class744.field10364[1] = 0.0F;
            class744.field10364[14] = 0.0F;
            class744.field10364[11] = 0.0F;
            class744.field10364[5] = (float) arg2 / ((float) super.field3525 * 128.0F * (float) this.field2667.field9535);
            class744.field10364[3] = 0.0F;
            class744.field10364[10] = 0.0F;
            class744.field10364[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2667.field9535) + 1.0F;
            class744.field10364[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2667.field9608) + -1.0F;
            class744.field10364[7] = 0.0F;
            class744.field10364[8] = 0.0F;
            class744.field10364[0] = (float) arg2 / ((float) super.field3525 * 128.0F * (float) this.field2667.field9608);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class744.field10364, 0);
            class744.field10364[10] = 0.0F;
            class744.field10364[15] = 1.0F;
            class744.field10364[5] = 0.0F;
            class744.field10364[13] = 0.0F;
            class744.field10364[12] = 0.0F;
            class744.field10364[9] = 1.0F;
            class744.field10364[1] = 0.0F;
            class744.field10364[4] = 0.0F;
            class744.field10364[8] = 0.0F;
            class744.field10364[6] = 1.0F;
            class744.field10364[0] = 1.0F;
            class744.field10364[3] = 0.0F;
            class744.field10364[14] = 0.0F;
            class744.field10364[2] = 0.0F;
            class744.field10364[7] = 0.0F;
            class744.field10364[11] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class744.field10364, 0);
            if ((this.field2664 & 7) == 0) {
                this.field2667.method3892(false, 1);
            } else {
                this.field2667.method3892(true, 1);
                this.field2667.method3894(-18017);
            }
            this.field2667.method3935(this.field2678, this.field2687, this.field2682, this.field2690, 2407);
            if (~this.field2667.field9779.field5275.length > ~(this.field2646 * 2)) {
                this.field2667.field9779 = new class283(this.field2646 * 2);
            } else {
                this.field2667.field9779.field5262 = 0;
            }
            int var9 = 0;
            class283 var10 = this.field2667.field9779;
            if (this.field2667.field9772) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field3533 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[var13 - arg3][var11 - arg4]) {
                            short[] var14 = this.field2643[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    ++var9;
                                    var10.method2369(-18090, var14[var15] & 65535);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field3533 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field2643[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method2379(65535 & var20[var21], -12098);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class209 var17 = new class209(this.field2667, 5123, var10.field5275, var10.field5262);
                this.field2667.method3944(4, 0, (byte) 78, var9, var17);
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lpc;IIII[[I[[II)V")
    public class227(class700 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2667 = arg0;
        this.field2676 = super.field3530 + -2;
        this.field2681 = new float[super.field3533 + 1][super.field3524 + 1];
        this.field2641 = new int[arg3][arg4][];
        this.field2686 = new byte[arg3 - -1][arg4 + 1];
        this.field2677 = new int[arg3][arg4][];
        this.field2654 = 1 << this.field2676;
        this.field2683 = new float[super.field3533 + 1][super.field3524 - -1];
        this.field2655 = new int[arg3][arg4][];
        this.field2643 = new short[arg3 * arg4][];
        this.field2666 = new int[arg3][arg4][];
        this.field2652 = new class666[arg3][arg4][];
        this.field2651 = new int[arg3][arg4][];
        this.field2672 = new byte[arg3][arg4];
        this.field2664 = arg2;
        this.field2680 = new float[super.field3533 + 1][super.field3524 + 1];
        for (int var9 = 1; super.field3524 > var9; ++var9) {
            for (int var10 = 1; super.field3533 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 - -(var12 * var12))));
                this.field2681[var10][var9] = (float) var11 * var13;
                this.field2680[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field2683[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2689 = new class362(128);
        if (~(16 & this.field2664) != -1) {
            this.field2648 = new class682(this.field2667, this);
        }
    }
}
